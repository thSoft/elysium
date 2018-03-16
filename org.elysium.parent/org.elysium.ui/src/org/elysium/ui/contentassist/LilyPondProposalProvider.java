package org.elysium.ui.contentassist;

import static com.google.common.collect.Iterables.any;

import java.io.File;
import java.io.FilenameFilter;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.util.ResourceUtils;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.internal.SharedImages;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.IImageHelper;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.elysium.LilyPondConstants;
import org.elysium.importuri.ILilyPondPathProvider;
import org.elysium.importuri.LilyPondImportUriResolver;
import org.elysium.ui.Activator;
import org.elysium.ui.LilyPondUiModule;
import org.elysium.ui.version.LilyPondVersion;

import com.google.common.base.Predicate;
import com.google.common.collect.Lists;
import com.google.inject.Inject;

/**
 * Provides content assist proposals for the LilyPond language.
 */
public class LilyPondProposalProvider extends AbstractLilyPondProposalProvider {

	@Inject
	private ILilyPondPathProvider lilyPondPathProvider;

	private static final String QUOTE = "\""; //$NON-NLS-1$
	private Image fileImage=null;
	private Image folderImage=null;

	@Inject
	@SuppressWarnings("restriction")
	private void setImages(IImageHelper imageHelper) {
		fileImage=imageHelper.getImage(Activator.getImageDescriptor(LilyPondUiModule.ICONS + "Editor.png"));
		folderImage=new SharedImages().getImage(ISharedImages.IMG_OBJ_FOLDER);
	}

	private FilenameFilter fileFilter=new FilenameFilter() {
		@Override
		public boolean accept(File dir, String name) {
			return any(LilyPondConstants.EXTENSIONS, new Predicate<String>() {
				@Override
				public boolean apply(String extension) {
					return name.endsWith("." + extension);
				}
			});
		}
	};

	@Override
	public void completeVersion_Version(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeVersion_Version(model, assignment, context, acceptor);
		acceptor.accept(createCompletionProposal(QUOTE+LilyPondVersion.get()+QUOTE, context));
	}

	@Override
	public void completeInclude_ImportURI(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeInclude_ImportURI(model, assignment, context, acceptor);
		IResource resource=getResource(model);
		if (resource != null) {
			String searchPrefix=getImportSearchPrefix(context);
			boolean absolute=LilyPondImportUriResolver.isAbsolute(searchPrefix, LilyPondConstants.IS_WINDOWS);

			List<String> paths = getSearchPaths(resource, absolute);

			for (String path : paths) {
				java.net.URI pathToSearch = LilyPondImportUriResolver.saferResolve(new File(path).toURI(), searchPrefix, LilyPondConstants.IS_WINDOWS);
				File folder = new File(pathToSearch).getParentFile();
				if(folder.exists()) {
					File[] allFiles = folder.listFiles();
					for (File file : allFiles) {
						if(propose(file)) {
							String name=file.getName();
							String proposal=mergePrefixAndProposedName(context.getPrefix().substring(1), name);
							createIncludeProposal(proposal, file, context, acceptor);
						}
					}
				}
			}
		}
	}

	private IResource getResource(EObject model) {
		URI modelUri = model.eResource().getURI();
		IResource resource=null;
		if(modelUri.isFile()) {
			IFile[] files = ResourcesPlugin.getWorkspace().getRoot().findFilesForLocationURI(java.net.URI.create(modelUri.toString()));
			for (IFile iFile : files) {
				if(iFile.exists()) {
					resource=iFile;
					break;
				}
			}
		}else if(modelUri.isPlatform()) {
			resource = ResourceUtils.convertEResourceToPlatformResource(model.eResource());
		}
		return resource;
	}

	private boolean isWindowsHd(String prefix) {
		return prefix.length()==2 && prefix.charAt(1)==':' && LilyPondConstants.IS_WINDOWS;
	}

	private String getImportSearchPrefix(ContentAssistContext context) {
		String prefix = context.getPrefix();
		String searchPrefix=prefix;
		if(searchPrefix.length()>0) {
			searchPrefix=prefix.substring(1);//trim quote
			//ensure we get the correct parent directory
			if(searchPrefix.isEmpty() || searchPrefix.endsWith("/")) {
				searchPrefix=searchPrefix+"X";
			} else if(searchPrefix.endsWith("..")) {
				searchPrefix=searchPrefix+"/X";
			} else if(isWindowsHd(searchPrefix)) {
				//windows hd 
				searchPrefix=searchPrefix+"/X";
			}
		}
		return searchPrefix;
	}

	private List<String> getSearchPaths(IResource resource, boolean isAbsolute){
		List<String> paths = Lists.newArrayList();
		paths.add(resource.getParent().getLocation().toOSString());
		if(!isAbsolute) {
			paths.add(LilyPondImportUriResolver.getDefaultSearchUri(lilyPondPathProvider.getLilyPondPath()).getPath());
			paths.addAll(Lists.newArrayList(lilyPondPathProvider.getSearchPaths()));
		}
		return paths;
	}

	private boolean propose(File f) {
		return f.isDirectory() || fileFilter.accept(null, f.getName());
	}

	private String mergePrefixAndProposedName(String prefix, String proposedName) {
		int slashIndex=prefix.lastIndexOf('/');
		if(isWindowsHd(prefix) || prefix.endsWith("..")){
			return prefix+"/"+proposedName;
		}else if(slashIndex>=0) {
			return prefix.substring(0, slashIndex+1)+proposedName;
		} else {
			return proposedName;
		}
	}

	private void createIncludeProposal(String proposal, File file, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if(proposal!=null) {
			Image image=null;
			ContentAssistContext contextToUse=context;
			int priority=400;
			if(file.isDirectory()) {
				proposal=proposal+"/";
				priority=300;
				image=folderImage;
			}else {
				image=fileImage;
			}
			ICompletionProposal prop = createCompletionProposal(QUOTE+proposal+QUOTE,  new StyledString(file.getName()), image, priority, contextToUse.getPrefix(), contextToUse);
			if(file.isDirectory() && prop instanceof ConfigurableCompletionProposal) {
				//for folders include is not complete - file is missing, so set cursor before the closing quote
				//simplifying a second code completion invocation within the directory
				ConfigurableCompletionProposal cf = (ConfigurableCompletionProposal)prop;
				cf.setCursorPosition(cf.getCursorPosition()-1);
			}
			acceptor.accept(prop);
		}
	}

	@Override
	public void complete_SchemeValue(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		try {
			EObject possibleAssignment = model.eContainer().eContainer();
			if(possibleAssignment instanceof org.elysium.lilypond.Assignment) {
				org.elysium.lilypond.Assignment assignemt = (org.elysium.lilypond.Assignment) possibleAssignment;
				if("midiInstrument".equals(assignemt.getName())) {
					for (String instrument : MidiInstruments.get()) {
						acceptor.accept(createCompletionProposal(QUOTE+instrument+QUOTE, context));
					}
				}
			}
		}catch(Exception e) {
			//ignore any problems
		}
	}
}
