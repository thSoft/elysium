package org.elysium.ui.contentassist;

import static com.google.common.collect.Iterables.any;

import java.io.File;
import java.io.FilenameFilter;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.util.ResourceUtils;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.elysium.LilyPondConstants;
import org.elysium.importuri.ILilyPondPathProvider;
import org.elysium.importuri.LilyPondImportUriResolver;
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

	@Override
	public void completeVersion_Version(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeVersion_Version(model, assignment, context, acceptor);
		acceptor.accept(createCompletionProposal(QUOTE+LilyPondVersion.get()+QUOTE, context));
	}

	@Override
	public void completeInclude_ImportURI(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeInclude_ImportURI(model, assignment, context, acceptor);
		IResource resource = ResourceUtils.convertEResourceToPlatformResource(model.eResource());
		if (resource != null) {
			List<String> paths = Lists.newArrayList();
			paths.add(resource.getParent().getLocation().toOSString());
			paths.add(LilyPondImportUriResolver.getDefaultSearchUri(lilyPondPathProvider.getLilyPondPath()).getPath());
			paths.addAll(Lists.newArrayList(lilyPondPathProvider.getSearchPaths()));

			for (String path : paths) {
				String[] children = new File(path).list(new FilenameFilter() {

					@Override
					public boolean accept(File file, final String filename) {
						return any(LilyPondConstants.EXTENSIONS, new Predicate<String>() {

							@Override
							public boolean apply(String extension) {
								return filename.endsWith("." + extension);
							}

						});
					}

				});
				for (String child : children) {
					acceptor.accept(createCompletionProposal(QUOTE+child+QUOTE, context));
				}
			}
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
