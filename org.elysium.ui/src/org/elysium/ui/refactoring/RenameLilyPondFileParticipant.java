package org.elysium.ui.refactoring;

import java.util.List;
import javax.util.collections.IterableIterator;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.URIUtil;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.CompositeChange;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.TextFileChange;
import org.eclipse.ltk.core.refactoring.participants.CheckConditionsContext;
import org.eclipse.ltk.core.refactoring.participants.RenameParticipant;
import org.eclipse.text.edits.ReplaceEdit;
import org.eclipse.text.edits.TextEdit;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.elysium.LilyPondConstants;
import org.elysium.lilypond.Include;
import org.elysium.lilypond.LilypondPackage;

/**
 * Updates references when a LilyPond source file is renamed.
 */
public class RenameLilyPondFileParticipant extends RenameParticipant {

	private java.net.URI oldLocationUri;

	@Override
	protected boolean initialize(Object element) {
		if (element instanceof IFile) {
			IFile file = (IFile)element;
			oldLocationUri = file.getRawLocationURI();
		}
		return true;
	}

	@Override
	public String getName() {
		return "Rename LilyPond Source File";
	}

	@Override
	public RefactoringStatus checkConditions(IProgressMonitor pm, CheckConditionsContext context) throws OperationCanceledException {
		return null;
	}

	@Override
	public Change createChange(IProgressMonitor pm) throws CoreException, OperationCanceledException {
		final CompositeChange result = new CompositeChange("Update LilyPond references");
		final String newName = getArguments().getNewName();
		final String oldName = URIUtil.lastSegment(oldLocationUri);
		final ResourceSet resourceSet = new ResourceSetImpl();
		ResourcesPlugin.getWorkspace().getRoot().accept(new IResourceVisitor() {

			@Override
			public boolean visit(IResource resource) throws CoreException {
				if (resource instanceof IFile) {
					IFile file = (IFile)resource;
					if (LilyPondConstants.EXTENSIONS.contains(file.getFileExtension())) {
						Resource eResource = resourceSet.getResource(URI.createPlatformResourceURI(resource.getFullPath().toString(), true), true);
						for (EObject eObject : new IterableIterator<EObject>(eResource.getAllContents())) {
							if (eObject instanceof Include) {
								Include include = (Include)eObject;
								if (resource.getLocationURI().resolve(include.getImportURI()).equals(oldLocationUri)) {
									TextFileChange change = new TextFileChange("Update \\include statement", file);
									List<INode> nodes = NodeModelUtils.findNodesForFeature(eObject, LilypondPackage.Literals.INCLUDE__IMPORT_URI);
									for (INode node : nodes) {
										if (node.getText().contains(oldName)) {
											int offset = node.getOffset() + node.getText().lastIndexOf(oldName);
											int length = oldName.length();
											TextEdit edit = new ReplaceEdit(offset, length, newName);
											change.setEdit(edit);
											result.add(change);
											break;
										}
									}
								}
							}
						}
					}
				}
				return true;
			}

		});
		return result;
	}

}
