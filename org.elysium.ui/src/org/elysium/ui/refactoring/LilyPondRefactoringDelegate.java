package org.elysium.ui.refactoring;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.CompositeChange;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.participants.CheckConditionsContext;
import org.eclipse.ltk.core.refactoring.participants.IConditionChecker;
import org.eclipse.ltk.core.refactoring.participants.RefactoringArguments;
import org.eclipse.ltk.core.refactoring.participants.ResourceChangeChecker;
import org.eclipse.xtext.resource.IResourceDescription;
import org.elysium.ui.Activator;

class LilyPondRefactoringDelegate implements IConditionChecker{

	public static final String NAME = "Update LilyPond references";

	static enum Operation{
		delete, move, rename;
	}

	private final LilyPondRefactoringInjects refactoringSupport;
	private LilyPondRefactoring ref;

	private List<LilyPondSourceFileRefactoring> handlers=new ArrayList<LilyPondSourceFileRefactoring>();
	private boolean preChangeAlreadyCreated=false;
	private boolean changeAlreadyCreated=false;

	private LilyPondRefactoringDelegate(Operation op, LilyPondRefactoringInjects refactoringSupport) {
		this.refactoringSupport=refactoringSupport;
		ref=new LilyPondRefactoring(op, refactoringSupport);
	}

	public static LilyPondRefactoringDelegate get(Operation op, CheckConditionsContext context, LilyPondRefactoringInjects refactorings){
		//ensure that the same instance is used for the refactoring, even if multiple files and folders are involved
		LilyPondRefactoringDelegate refactoringDelegate = (LilyPondRefactoringDelegate)context.getChecker(LilyPondRefactoringDelegate.class);
		if(refactoringDelegate==null){
			refactoringDelegate=new LilyPondRefactoringDelegate(op, refactorings);
			try {
				context.add(refactoringDelegate);
				refactoringDelegate.initCompiledFiles(context);
			} catch (CoreException e) {
				Activator.logError("error initializing LilyPond RefactoringManager", e);
			}
		}
		return refactoringDelegate;
	}

	private void initCompiledFiles(CheckConditionsContext context){
		IConditionChecker checker = context.getChecker(ResourceChangeChecker.class);
		if (checker instanceof ResourceChangeChecker) {
			ResourceChangeChecker resourceChangeChecker = (ResourceChangeChecker)checker;
			IResourceDelta delta = resourceChangeChecker.getDeltaFactory().getDelta();
			try {
				delta.accept(new IResourceDeltaVisitor() {
					@Override
					public boolean visit(IResourceDelta delta) throws CoreException {
						IResource resource = delta.getResource();
						if (resource!=null && resource.getType()==IResource.FILE) {
							IFile file=(IFile)resource;
							if(refactoringSupport.isCompiled(file)){
								addFileToRefactor(file, null);
							}
						}
						return true;
					}
				});
			} catch (CoreException e) {
				Activator.logError("Can't check whether multiple LilyPond files are being moved", e);
			}
		}
	}

	@Override
	public RefactoringStatus check(IProgressMonitor monitor)
			throws CoreException {
		initHandlers(monitor);
		RefactoringStatus result=new RefactoringStatus();
		addHandlerIssues(result, monitor);
		ref.addSearchPathAffectedIssues(result);
		return result;
	}


	private void addHandlerIssues(RefactoringStatus status, IProgressMonitor monitor) {
		for (LilyPondSourceFileRefactoring handler : handlers) {
			if(monitor.isCanceled()){
				break;
			}
			handler.addIssues(status);
		}
	}

	private void initHandlers(IProgressMonitor monitor){
		for (IResourceDescription desc : refactoringSupport.getAllResourceDescriptions()) {
			if(monitor.isCanceled()){
				break;
			}
			if(refactoringSupport.isSource(desc.getURI().fileExtension())){
				handlers.add(new LilyPondSourceFileRefactoring(desc, ref));
			}
		}
	}

	public void addFileToRefactor(IFile file, RefactoringArguments arguments) {
		ref.addFileToRefactor(file, arguments);
	}

	public void addContainerToRefactor(IContainer container, RefactoringArguments arguments) {
		ref.addContainerToRefactor(container, arguments);
	}

	public Change adaptIncludes(IProgressMonitor monitor){
		if(preChangeAlreadyCreated || monitor.isCanceled()){
			return null;
		}
		CompositeChange result = new CompositeChange("\\include statements");
		for (LilyPondSourceFileRefactoring handler : handlers) {
			if(!monitor.isCanceled()){
				handler.adaptIncludes(result);
			}
		}
		preChangeAlreadyCreated=true;
		if(result.getChildren().length==0){
			return null;
		}else{
			return result;
		}
	}

	public Change apply(IProgressMonitor monitor) throws CoreException{
		if(ref==null || changeAlreadyCreated || monitor.isCanceled()){
			return null;
		}else{
			changeAlreadyCreated=true;
			return ref.apply(monitor);
		}
	}
}