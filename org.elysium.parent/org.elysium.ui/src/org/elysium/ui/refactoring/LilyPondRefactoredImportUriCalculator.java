package org.elysium.ui.refactoring;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.elysium.importuri.LilyPondImportUri;

//if package private - maven build fails due to
//https://stackoverflow.com/questions/36100552/illegalaccesserror-when-using-a-public-method-reference-of-a-package-private-cla
//making the class public is least effort with little/no negative effect
public class LilyPondRefactoredImportUriCalculator {

	//source file parent location before refactoring
	private IPath source;
	//source file parent location before refactoring
	private IPath sourceDestiation;
	//include location before refactoring
	private IPath target;
	//include location after refactoring
	private IPath targetDestination;

	public LilyPondRefactoredImportUriCalculator(IFile source, IFile sourceDestiation) {
		this(source.getParent().getFullPath(), sourceDestiation.getParent().getFullPath(), new Path(""), new Path(""));
	}

	public LilyPondRefactoredImportUriCalculator(IFile source, IFile sourceDestiation, IFile target, IFile targetDestination) {
		this(source.getParent().getFullPath(), sourceDestiation.getParent().getFullPath(), target.getFullPath(), targetDestination.getFullPath());
	}

	public LilyPondRefactoredImportUriCalculator(IPath sourceContainer, IPath sourceContainerDestiation, IPath target, IPath targetDestination) {
		this.source=sourceContainer;
		this.sourceDestiation=sourceContainerDestiation;
		this.target=target;
		this.targetDestination=targetDestination;
	}

	/**
	 * calculates the updated include based on the source
	 * */
	public String getNewImportUri(LilyPondImportUri importUri){
		switch(importUri.getType()){
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