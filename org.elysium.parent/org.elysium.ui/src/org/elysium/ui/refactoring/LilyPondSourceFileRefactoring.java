package org.elysium.ui.refactoring;

import java.text.MessageFormat;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.util.ResourceUtils;
import org.eclipse.ltk.core.refactoring.CompositeChange;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.TextChange;
import org.eclipse.ltk.core.refactoring.TextFileChange;
import org.eclipse.text.edits.MultiTextEdit;
import org.eclipse.text.edits.ReplaceEdit;
import org.eclipse.text.edits.TextEdit;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IReferenceDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.elysium.lilypond.Include;
import org.elysium.lilypond.LilypondPackage;
import org.elysium.ui.refactoring.LilyPondRefactoringDelegate.Operation;

import com.google.common.base.Optional;

/**
 * (include) update of a single source file
 * 
 *  based on the index information for that source and the refactoring information
 * */
class LilyPondSourceFileRefactoring {

	private IResourceDescription desc;
	private LilyPondRefactoring rootRefactoring;
	private Map<LilyPondImportUri, URI> includes=null;

	public LilyPondSourceFileRefactoring(IResourceDescription resourceDescription, LilyPondRefactoring refactoring) {
		this.desc=resourceDescription;
		this.rootRefactoring=refactoring;
	}

	public URI getURI() {
		return desc.getURI();
	}

	private Set<URI> getResolvedIncludes() {
		if(rootRefactoring.getOperation() == Operation.delete) {
			//for delete return all transitive includes
			//deleted ws file may be included via a non-ws file
			Set<URI> result = new HashSet<>();
			Iterator<IReferenceDescription> refs = desc.getReferenceDescriptions().iterator();
			while(refs.hasNext()) {
				IReferenceDescription ref = refs.next();
				if(ref.getEReference() == null) {
					result.add(ref.getTargetEObjectUri());
				}
			}
			return result;
		} else if(includes == null){
			URI baseURI = desc.getURI();
			if(baseURI.isPlatform()) {
				IResource resource = ResourceUtils.findPlatformResource(baseURI);
				if(resource != null) {
					baseURI=org.eclipse.emf.common.util.URI.createFileURI(resource.getLocation().toFile().getAbsolutePath());
				}
			}
			includes=new HashMap<LilyPondImportUri, URI>();
			Iterator<IEObjectDescription> roots = desc.getExportedObjectsByType(
					LilypondPackage.Literals.LILY_POND).iterator();
			while (roots.hasNext()) {
				IEObjectDescription root = roots.next();
				String includeStrings = root.getUserData("includes");
				if (includeStrings != null) {
					String[] includesSplit = includeStrings.split("\n");
					for (String importUri : includesSplit) {
						if(!importUri.isEmpty()){
							LilyPondImportUri lilyPondUri=rootRefactoring.support.resolveImportUri(baseURI, importUri);
							URI uri = URI.createURI(lilyPondUri.getUri()).resolve(baseURI);
							includes.put(lilyPondUri, uri);
						}
					}
				}
			}
		}
		return new HashSet<URI>(includes.values());
	}

	private boolean refactoredMyself(){
		return rootRefactoring.getRefactoredFilesPlatformURIs().contains(getURI());
	}

	private Set<URI> getIncludedRefactoredFiles(){
		return rootRefactoring.getRefactoredFilesPlatformURIs(getResolvedIncludes());
	}

	private boolean existsVariableInclude() {
		if(hasVariableInlcude()){
			String myProject = extractProject(desc.getURI());
			for (URI uri : rootRefactoring.getRefactoredFilesPlatformURIs()) {
				String otherProject = extractProject(uri);
				if(otherProject != null && otherProject.equals(myProject)){
					return true;
				}
			}
		}
		return false;
	}

	private String extractProject(URI uri){
		if(uri.segmentCount()>1){
			return uri.segment(1);
		}else{
			return null;
		}
	}

	private boolean hasVariableInlcude(){
		Iterator<IEObjectDescription> roots = desc.getExportedObjectsByType(
				LilypondPackage.Literals.LILY_POND).iterator();
		while (roots.hasNext()) {
			IEObjectDescription root = roots.next();
			if(Boolean.parseBoolean(Optional.fromNullable(root.getUserData("variableInclude")).or("false"))){
				return true;
			}
		}
		return false;
	}

	public void  adaptIncludes(CompositeChange includeChangesParent) {
		if(rootRefactoring.getOperation()!=Operation.delete){
			adaptRenameIncludes(includeChangesParent);
		}
	}

	private void adaptRenameIncludes(CompositeChange includeChangesParent){
		IFile me=rootRefactoring.asFile(getURI());
		if(me.exists()){
			TextChange textChange=new TextFileChange("includes", me);
			MultiTextEdit editParent = new MultiTextEdit();
			Set<URI> includedRefactored = getIncludedRefactoredFiles();
			if(!includedRefactored.isEmpty() || refactoredMyself()){
				List<Include> includeObjects = getIncludeObjects();
				for (Entry<LilyPondImportUri, URI> entry : includes.entrySet()) {
					LilyPondImportUri lilyPondImportUri=entry.getKey();
					for (Include include : includeObjects) {
						TextEdit edit=getTextEdit(include, lilyPondImportUri, entry.getValue());
						if(edit!=null){
							editParent.addChild(edit);
						}
					}
				}
			}
			if(editParent.hasChildren()){
				textChange.setEdit(editParent);
				includeChangesParent.add(textChange);
			}
		}
	}

	private TextEdit getTextEdit(Include include, LilyPondImportUri uri, URI resolvedUriToRefactor){
		String importUriToReplaces=uri.getOriginalUri();
		if(importUriToReplaces.equals(include.getImportURI())){
			List<INode> nodes = NodeModelUtils.findNodesForFeature(include, LilypondPackage.Literals.INCLUDE__IMPORT_URI);
			for (INode node : nodes) {
				if (node.getText().contains(importUriToReplaces)) {
					LilyPondRefactoredImportUriCalculator includeHandler=rootRefactoring.getNewImportUriCalculator(getURI(), resolvedUriToRefactor);
					int offset = node.getOffset() + node.getText().indexOf(importUriToReplaces);
					int length = importUriToReplaces.length();
					String newImportUri = includeHandler.getNewImportUri(uri);
					if(!importUriToReplaces.equals(newImportUri)){
						TextEdit edit = new ReplaceEdit(offset, length, newImportUri);
						return edit;
					}
					break;
				}
			}
		}
		return null;
	}

	private List<Include> getIncludeObjects(){
		Resource resource = rootRefactoring.support.getResourceSet().getResource(getURI(), true);
		return EcoreUtil2.getAllContentsOfType(resource.getContents().get(0), Include.class);
	}

	public void addIssues(RefactoringStatus status) {
		if(rootRefactoring.getOperation()==Operation.delete){
			if(!refactoredMyself()){
				String including=getUriDisplayString();
				List<IPath> includedFiles= rootRefactoring.getFilePaths(getIncludedRefactoredFiles());
				if(!includedFiles.isEmpty()){
					for (IPath included : includedFiles) {
						status.addWarning(MessageFormat.format("{0} (transitively) includes {1}", including, included));
					}
				}
				checkVariableInclude(status);
			}
		}
		else{
			checkVariableInclude(status);
		}
	}

	private String getUriDisplayString(){
		return getURI().isPlatform()?getURI().toPlatformString(true):getURI().toString();
	}

	private void checkVariableInclude(RefactoringStatus status){
		if(rootRefactoring.support.warnVariableInclude()){
			if(existsVariableInclude()){
				status.addWarning(MessageFormat.format("{0} - located in the same project as a {1}d file - has an include using variables; updating includes may fail", getUriDisplayString(), rootRefactoring.getOperation()));
			}
		}
	}

	/**
	 * return refactoring targets contained in the given parameter list
	 * */
	public Set<IFile> getRefactoredFiles(List<IFile> filesToCheck) {
		Collection<IFile> refactoringTargets = rootRefactoring.getRefactoredFiles();
		Set<IFile>result = new HashSet<>();
		for (IFile iFile : refactoringTargets) {
			if(filesToCheck.contains(iFile)) {
				result.add(iFile);
			}
		}
		IFile me = rootRefactoring.asFile(getURI());
		if(filesToCheck.contains(me)) {
			if(getIncludedRefactoredFiles().size() > 0) {
				//an include in the current file is involved, so the file's includes would have to be modified
				result.add(me);
			}
		}
		return result;
	}
}