package org.elysium.ui.refactoring;

import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Lists.newArrayList;
import static java.text.MessageFormat.format;
import static org.eclipse.emf.common.util.URI.createPlatformResourceURI;
import static org.eclipse.util.ResourceUtils.replaceExtension;
import static org.eclipse.xtext.nodemodel.util.NodeModelUtils.findNodesForFeature;
import java.util.List;
import javax.util.collections.IterableIterator;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
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
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.TextChange;
import org.eclipse.ltk.core.refactoring.TextFileChange;
import org.eclipse.ltk.core.refactoring.resource.MoveResourceChange;
import org.eclipse.ltk.core.refactoring.resource.RenameResourceChange;
import org.eclipse.text.edits.MultiTextEdit;
import org.eclipse.text.edits.ReplaceEdit;
import org.eclipse.text.edits.TextEdit;
import org.eclipse.xtext.nodemodel.INode;
import org.elysium.LilyPondConstants;
import org.elysium.lilypond.Include;
import org.elysium.lilypond.LilypondPackage;
import org.elysium.ui.Activator;
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
					if (included == null) {
						return true;
					} else {
						String importUri = include.getImportURI();
						IPath basePath = includer.getParent().getFullPath();
						return basePath.append(importUri).equals(included.getFullPath());
					}
				}
			});
		} else {
			return newArrayList();
		}
	}

	public static final String NAME = "Update LilyPond references";

	public static void addIncludeChange(MultiTextEdit editParent, IFile file, Include include, IPath includedPath, IPath basePath) {
		String importUri = include.getImportURI();
		List<INode> nodes = findNodesForFeature(include, LilypondPackage.Literals.INCLUDE__IMPORT_URI);
		for (INode node : nodes) {
			if (node.getText().contains(importUri)) {
				int offset = node.getOffset() + node.getText().indexOf(importUri);
				int length = importUri.length();
				String newImportUri = includedPath.makeRelativeTo(basePath).toString();
				TextEdit edit = new ReplaceEdit(offset, length, newImportUri);
				editParent.addChild(edit);
				break;
			}
		}
	}

	public static Change createChange(final IFile sourceFile, final String newName, final IContainer destination, final boolean inFolder) throws CoreException {
		final CompositeChange result = new CompositeChange(inFolder ? sourceFile.getFullPath().toString() : NAME);
		final CompositeChange includeChangesParent = new CompositeChange("\\include statements");
		final CompositeChange compiledChangesParent = new CompositeChange("Compiled files");

		ResourcesPlugin.getWorkspace().getRoot().accept(new IResourceVisitor() {

			@Override
			public boolean visit(IResource resource) throws CoreException {
				if (resource instanceof IFile) {
					IFile file = (IFile)resource;
					MultiTextEdit editParent = new MultiTextEdit();
					// Update \include statements referring to the renamed file
					for (Include include : getIncludes(file, sourceFile)) {
						IPath newIncludedPath = destination.getFullPath().append(newName);
						IPath basePath = file.getParent().getFullPath();
						addIncludeChange(editParent, file, include, newIncludedPath, basePath);
					}
					if (editParent.hasChildren()) {
						final TextChange change = new TextFileChange(inFolder ? file.getFullPath().toString() : PRE_CHANGE_NAME, file);
						change.setEdit(editParent);
						includeChangesParent.add(change);
					}
					// Rename/move compiled files
					if (!inFolder && isCompiledFrom(file, sourceFile)) {
						// Rename
						if (!sourceFile.getName().equals(newName)) {
							String newCompiledName = replaceExtension(new Path(newName), file.getFileExtension()).lastSegment();
							RenameResourceChange change = new RenameResourceChange(file.getFullPath(), newCompiledName);
							compiledChangesParent.add(change);
						}
						// Move
						if (!sourceFile.getParent().equals(destination)) {
							MoveResourceChange change = new MoveResourceChange(file, destination);
							compiledChangesParent.add(change);
						}
					}
				}
				return true;
			}

		});
		if (includeChangesParent.getChildren().length > 0) {
			result.add(includeChangesParent);
		}
		if (compiledChangesParent.getChildren().length > 0) {
			result.add(compiledChangesParent);
		}
		return ifNotEmpty(result);
	}

	public static Change createChange(final IFolder sourceFolder, final IFolder targetFolder) throws CoreException {
		final CompositeChange result = new CompositeChange(NAME);
		sourceFolder.accept(new IResourceVisitor() {

			@Override
			public boolean visit(IResource resource) throws CoreException {
				if (resource instanceof IFile) {
					IFile sourceFile = (IFile)resource;
					if (LilyPondConstants.EXTENSIONS.contains(resource.getFileExtension())) {
						Change change = createChange(sourceFile, sourceFile.getName(), targetFolder, true);
						result.add(change);
					}
				}
				return true;
			}

		});
		return ifNotEmpty(result);
	}

	public static final String ERROR_MESSAGE = "Can't find \\include statements";

	public static RefactoringStatus checkConditions(final IFile sourceFile) {
		final RefactoringStatus result = new RefactoringStatus();
		try {
			ResourcesPlugin.getWorkspace().getRoot().accept(new IResourceVisitor() {

				@Override
				public boolean visit(IResource resource) throws CoreException {
					if (resource instanceof IFile) {
						IFile file = (IFile)resource;
						if (getIncludes(file, sourceFile).iterator().hasNext()) {
							result.addWarning(format("{0} includes {1}", file.getFullPath(), sourceFile.getFullPath()));
						}
					}
					return true;
				}

			});
		} catch (CoreException e) {
			Activator.logError(ERROR_MESSAGE, e);
		}
		return result;
	}

	private static final String PRE_CHANGE_NAME = "Update \\include statements";

	public static Change createPreChange(IFile sourceFile, IPath destinationPath, boolean inFolder) {
		final TextChange result = new TextFileChange(inFolder ? sourceFile.getFullPath().toString() : PRE_CHANGE_NAME, sourceFile);
		MultiTextEdit editParent = new MultiTextEdit();
		result.setEdit(editParent);
		for (Include include : getIncludes(sourceFile, null)) {
			IPath includedPath = sourceFile.getParent().getFullPath().append(include.getImportURI());
			addIncludeChange(editParent, sourceFile, include, includedPath, destinationPath);
		}
		return ifNotEmpty(result);
	}

	public static Change createPreChange(final IFolder sourceFolder, final IContainer targetFolder) throws CoreException {
		final CompositeChange result = new CompositeChange(PRE_CHANGE_NAME);
		sourceFolder.accept(new IResourceVisitor() {

			@Override
			public boolean visit(IResource resource) throws CoreException {
				if (resource instanceof IFile) {
					IFile sourceFile = (IFile)resource;
					if (LilyPondConstants.EXTENSIONS.contains(resource.getFileExtension())) {
						Change change = createPreChange(sourceFile, targetFolder.getFullPath().append(sourceFolder.getName()), true);
						result.add(change);
					}
				}
				return true;
			}

		});
		return ifNotEmpty(result);
	}

	public static Change ifNotEmpty(Change change) {
		return (change == null) || ((change instanceof CompositeChange) && (((CompositeChange)change).getChildren().length == 0)) ? null : change;
	}

}
