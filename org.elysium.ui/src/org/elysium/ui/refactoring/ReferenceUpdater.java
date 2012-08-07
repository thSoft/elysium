package org.elysium.ui.refactoring;

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

public class ReferenceUpdater {

	public static Change createChange(final IFile sourceFile, final String newName, final IContainer destination) throws CoreException {
		final ResourceSet resourceSet = new ResourceSetImpl();
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
					String extension = file.getFileExtension();
					// Update \include statements
					if (LilyPondConstants.EXTENSIONS.contains(extension)) {
						Resource eResource = resourceSet.getResource(org.eclipse.emf.common.util.URI.createPlatformResourceURI(resource.getFullPath().toString(), true), true);
						for (EObject eObject : new IterableIterator<EObject>(eResource.getAllContents())) {
							if (eObject instanceof Include) {
								Include include = (Include)eObject;
								String importUri = include.getImportURI();
								IPath basePath = file.getParent().getFullPath();
								if (basePath.append(importUri).equals(sourceFile.getFullPath())) {
									TextFileChange change = new TextFileChange("Update \\include statement", file);
									List<INode> nodes = NodeModelUtils.findNodesForFeature(eObject, LilypondPackage.Literals.INCLUDE__IMPORT_URI);
									for (INode node : nodes) {
										if (node.getText().contains(importUri)) {
											int offset = node.getOffset() + node.getText().indexOf(importUri);
											int length = importUri.length();
											IPath newPath = destination.getFullPath().append(newName);
											String newImportUri = newPath.makeRelativeTo(basePath).toString();
											TextEdit edit = new ReplaceEdit(offset, length, newImportUri);
											change.setEdit(edit);
											includeChange.add(change);
											break;
										}
									}
								}
							}
						}
					// Rename/move compiled files
					} else if (LilyPondConstants.COMPILED_EXTENSIONS.contains(extension)) {
						if (file.getFullPath().removeFileExtension().equals(sourceFile.getFullPath().removeFileExtension())) {
							 // Rename
							if (!sourceFile.getName().equals(newName)) {
								String newCompiledName = replaceExtension(new Path(newName), extension).lastSegment();
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
				}
				return true;
			}

		});
		return result;
	}

}
