package org.elysium.ui.refactoring;

import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Lists.newArrayList;
import static org.eclipse.emf.common.util.URI.createPlatformResourceURI;
import static org.eclipse.util.ResourceUtils.replaceExtension;
import java.util.List;
import javax.util.collections.IterableIterator;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.CompositeChange;
import org.eclipse.ltk.core.refactoring.TextFileChange;
import org.eclipse.ltk.core.refactoring.resource.MoveResourceChange;
import org.eclipse.ltk.core.refactoring.resource.RenameResourceChange;
import org.eclipse.text.edits.ReplaceEdit;
import org.eclipse.text.edits.TextEdit;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.elysium.LilyPondConstants;
import org.elysium.lilypond.Include;
import org.elysium.lilypond.LilypondPackage;
import com.google.common.base.Predicate;

public class RefactoringSupport {

	private RefactoringSupport() {
	}

	public static boolean isCompiledFrom(IFile compiled, IFile source) {
		String extension = compiled.getFileExtension();
		return LilyPondConstants.COMPILED_EXTENSIONS.contains(extension) && compiled.getFullPath().removeFileExtension().equals(source.getFullPath().removeFileExtension());
	}

	public static Iterable<Include> getIncludes(final IFile includer, final IFile included) {
		String extension = includer.getFileExtension();
		final ResourceSet resourceSet = new ResourceSetImpl();
		if (LilyPondConstants.EXTENSIONS.contains(extension)) {
			Resource eResource = resourceSet.getResource(createPlatformResourceURI(includer.getFullPath().toString(), true), true);
			Iterable<Include> allIncludes = filter(new IterableIterator<EObject>(eResource.getAllContents()), Include.class);
			return filter(allIncludes, new Predicate<Include>() {
				@Override
				public boolean apply(Include include) {
					String importUri = include.getImportURI();
					IPath basePath = includer.getParent().getFullPath();
					return basePath.append(importUri).equals(included.getFullPath());
				}
			});
		} else {
			return newArrayList();
		}
	}

	public static Change createChange(final IFile sourceFile, final String newName, final IContainer destination) throws CoreException {
		final CompositeChange result = new CompositeChange("Update LilyPond references");
		final CompositeChange includeChange = new CompositeChange("\\include statements");
		result.add(includeChange);
		final CompositeChange compiledChange = new CompositeChange("Compiled files");
		result.add(compiledChange);
		ResourcesPlugin.getWorkspace().getRoot().accept(new IResourceVisitor() {

			@Override
			public boolean visit(IResource resource) throws CoreException {
				if (resource instanceof IFile) {
					IFile file = (IFile)resource;
					// Update \include statements
					for (Include include : getIncludes(file, sourceFile)) {
						String importUri = include.getImportURI();
						TextFileChange change = new TextFileChange("Update \\include statement", file);
						List<INode> nodes = NodeModelUtils.findNodesForFeature(include, LilypondPackage.Literals.INCLUDE__IMPORT_URI);
						for (INode node : nodes) {
							if (node.getText().contains(importUri)) {
								int offset = node.getOffset() + node.getText().indexOf(importUri);
								int length = importUri.length();
								IPath newPath = destination.getFullPath().append(newName);
								IPath basePath = file.getParent().getFullPath();
								String newImportUri = newPath.makeRelativeTo(basePath).toString();
								TextEdit edit = new ReplaceEdit(offset, length, newImportUri);
								change.setEdit(edit);
								includeChange.add(change);
								break;
							}
						}
					}
					// Rename/move compiled files
					if (isCompiledFrom(file, sourceFile)) {
						// Rename
						if (!sourceFile.getName().equals(newName)) {
							String newCompiledName = replaceExtension(new Path(newName), file.getFileExtension()).lastSegment();
							RenameResourceChange change = new RenameResourceChange(file.getFullPath(), newCompiledName);
							compiledChange.add(change);
						}
						// Move
						if (!sourceFile.getParent().equals(destination)) {
							MoveResourceChange change = new MoveResourceChange(file, destination);
							compiledChange.add(change);
						}
					}
				}
				return true;
			}

		});
		return result;
	}

}
