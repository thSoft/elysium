package org.elysium.ui.refactoring;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;

//if package private - maven build fails due to
//https://stackoverflow.com/questions/36100552/illegalaccesserror-when-using-a-public-method-reference-of-a-package-private-cla
//making the class public is least effort with little/no negative effect
public class LilyPondRefactoredImportUriCalculator {

	//source file parent location before refactoring
	private IPath source;
	//source file parent location after refactoring
	private IPath sourceDestiation;
	//include location before refactoring
	private IPath target;
	//include location after refactoring
	private IPath targetDestination;

	public LilyPondRefactoredImportUriCalculator(IFile source, IFile sourceDestination) {
		this(source.getParent().getLocation(), destPath(source.getParent(), sourceDestination.getParent()), new Path(""), new Path(""));
	}

	public LilyPondRefactoredImportUriCalculator(IFile source, IFile sourceDestination, IFile target, IFile targetDestination) {
		this(source.getParent().getLocation(), destPath(source.getParent(), sourceDestination.getParent()), target.getLocation(), destPath(target, targetDestination));
	}

	public LilyPondRefactoredImportUriCalculator(IPath sourceContainer, IPath sourceContainerDestiation, IPath target, IPath targetDestination) {
		this.source=sourceContainer;
		this.sourceDestiation=sourceContainerDestiation;
		this.target=target;
		this.targetDestination=targetDestination;
	}

	//when renaming a project, the sorceDestination parent location is null causing an NPE
	private static IPath destPath(IResource res, IResource resDestination) {
		IPath result=resDestination.getLocation();
		if(result == null) {
			if(res.getWorkspace() == resDestination.getWorkspace()) {
				IPath wsPath = res.getProject().getLocation().removeLastSegments(1);
				IPath destPath = resDestination.getFullPath();
				result=wsPath.append(destPath);
			}
		}
		return result;
	}

	/**
	 * calculates the updated include based on the source
	 * */
	public String getNewImportUri(LilyPondImportUri importUri){
		switch(importUri.getType()){
			case unresolved: return importUri.getOriginalUri();
			case absolute:return handleAbsolute(importUri);
			case searchPath:return handelSearchPath(importUri);
			default:return handleRelative(importUri);
		}
	}

	private String handelSearchPath(LilyPondImportUri importUri) {
		if(target.equals(targetDestination)){
			//if the included file from the search path did not change
			//the original include will still work
			return importUri.getOriginalUri();
		}else{
			return handleRelative(importUri);
		}
	}

	//TODO ggf. kann relative Navigation vereinfacht werden
	//../goIntoSameFolderAgain/include.ily -> include.ily
	private String handleRelative(LilyPondImportUri importUri) {
		if(sourceDestiation.isPrefixOf(targetDestination)){
			return targetDestination.makeRelativeTo(sourceDestiation).toString();
		}
		IPath sourceNavigate = source.makeRelativeTo(sourceDestiation);
		IPath targetNavigate=targetDestination.makeRelativeTo(target);
		Path origURI = new Path(importUri.getOriginalUri());
		IPath navigated = sourceNavigate.append(origURI).append(targetNavigate);
		return (navigated.toString());
	}

	private String handleAbsolute(LilyPondImportUri importUri) {
		Path origURI = new Path(importUri.getOriginalUri());
		if(target.equals(targetDestination)){
			//absolute location is still correct
			return importUri.getOriginalUri();
		} else if(source.equals(sourceDestiation)){
			//TODO use target destination directly, as it is already an absolute path?
			//source is same - emulate navigation of target
			IPath targetNavigate=targetDestination.makeRelativeTo(target);
			IPath navigated = origURI.append(targetNavigate);
			return (navigated.toString());
		}else{
			//move refactoring has same base destination path, so we can turn the absolute URI into a relative one
			return targetDestination.makeRelativeTo(sourceDestiation).toString();
		}
	}
}