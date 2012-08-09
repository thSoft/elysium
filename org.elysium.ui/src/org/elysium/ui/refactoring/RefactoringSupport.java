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
import org.eclipse.ltk.core.refactoring.CompositeChange;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.TextFileChange;
import org.eclipse.ltk.core.refactoring.resource.MoveResourceChange;
import org.eclipse.ltk.core.refactoring.resource.RenameResourceChange;
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

	public static void addIncludeChange(CompositeChange parent, IFile file, Include include, IPath includedPath, IPath basePath) {
		String importUri = include.getImportURI();
		List<INode> nodes = findNodesForFeature(include, LilypondPackage.Literals.INCLUDE__IMPORT_URI);
		for (INode node : nodes) {
			if (node.getText().contains(importUri)) {
				int offset = node.getOffset() + node.getText().indexOf(importUri);
				int length = importUri.length();
				String newImportUri = includedPath.makeRelativeTo(basePath).toString();
				TextEdit edit = new ReplaceEdit(offset, length, newImportUri);
				TextFileChange change = new TextFileChange("Update \\include statement", file);
				change.setEdit(edit);
				parent.add(change);
				break;
			}
		}
	}

	public static CompositeChange createChange(final IFile sourceFile, final String newName, final IContainer destination, final boolean inFolder) throws CoreException {
		final CompositeChange result = new CompositeChange(inFolder ? sourceFile.getFullPath().toString() : NAME);
		final CompositeChange includeChangesParent = new CompositeChange("\\include statements");
		final CompositeChange compiledChangesParent = new CompositeChange("Compiled files");

		ResourcesPlugin.getWorkspace().getRoot().accept(new IResourceVisitor() {

			@Override
			public boolean visit(IResource resource) throws CoreException {
				if (resource instanceof IFile) {
					IFile file = (IFile)resource;
					// Update \include statements referring to the renamed file
					for (Include include : getIncludes(file, sourceFile)) {
						IPath newIncludedPath = destination.getFullPath().append(newName);
						IPath basePath = file.getParent().getFullPath();
						addIncludeChange(includeChangesParent, file, include, newIncludedPath, basePath);
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
		return result;
	}

	public static CompositeChange createChange(final IFolder sourceFolder, final IFolder targetFolder) throws CoreException {
		final CompositeChange result = new CompositeChange(NAME);
		sourceFolder.accept(new IResourceVisitor() {

			@Override
			public boolean visit(IResource resource) throws CoreException {
				if (resource instanceof IFile) {
					IFile sourceFile = (IFile)resource;
					if (LilyPondConstants.EXTENSIONS.contains(resource.getFileExtension())) {
						CompositeChange change = createChange(sourceFile, sourceFile.getName(), targetFolder, true);
						result.add(ifNotEmpty(change));
					}
				}
				return true;
			}

		});
		return result;
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

	public static CompositeChange createPreChange(IFile sourceFile, IContainer destination, boolean inFolder) {
		final CompositeChange result = new CompositeChange(inFolder ? sourceFile.getFullPath().toString() : PRE_CHANGE_NAME);
		for (Include include : getIncludes(sourceFile, null)) {
			IPath includedPath = sourceFile.getParent().getFullPath().append(include.getImportURI());
			IPath newBasePath = destination.getFullPath();
			addIncludeChange(result, sourceFile, include, includedPath, newBasePath);
		}
		return result;
	}

	public static CompositeChange createPreChange(IFolder sourceFolder, final IContainer targetFolder) throws CoreException {
		final CompositeChange result = new CompositeChange(PRE_CHANGE_NAME);
		sourceFolder.accept(new IResourceVisitor() {

			@Override
			public boolean visit(IResource resource) throws CoreException {
				if (resource instanceof IFile) {
					IFile sourceFile = (IFile)resource;
					if (LilyPondConstants.EXTENSIONS.contains(resource.getFileExtension())) {
						CompositeChange change = createPreChange(sourceFile, targetFolder, true);
						result.add(ifNotEmpty(change));
					}
				}
				return true;
			}

		});
		return result;
	}

	public static CompositeChange ifNotEmpty(CompositeChange change) {
		return change.getChildren().length == 0 ? null : change;
	}

}
