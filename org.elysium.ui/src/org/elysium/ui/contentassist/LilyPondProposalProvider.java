package org.elysium.ui.contentassist;

import static com.google.common.collect.Iterables.any;
import java.io.File;
import java.io.FilenameFilter;
import java.util.List;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.util.ResourceUtils;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipse.xtext.ui.editor.contentassist.ReplacementTextApplier;
import org.elysium.LilyPondConstants;
import org.elysium.importuri.ILilyPondPathProvider;
import org.elysium.importuri.LilyPondImportUriResolver;
import org.elysium.ui.Activator;
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

	private void propose(String proposal, final ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (proposal.endsWith(QUOTE)) {
			INode currentNode = context.getCurrentNode();
			if (currentNode instanceof ILeafNode) {
				ILeafNode leafNode = (ILeafNode)currentNode;
				if (leafNode.getText().endsWith(QUOTE) && (proposal.length() > 1)) {
					proposal = proposal.substring(0, proposal.length() - 1);
				}
			}
		}
		ConfigurableCompletionProposal completionProposal = (ConfigurableCompletionProposal)createCompletionProposal(proposal, context);
		if (completionProposal != null) {
			completionProposal.setTextApplier(new ReplacementTextApplier() {

				@Override
				public String getActualReplacementString(ConfigurableCompletionProposal proposal) {
					String replacementString = proposal.getReplacementString();
					try {
						if ((context.getDocument().getChar(context.getOffset()) == QUOTE.charAt(0)) && replacementString.endsWith(QUOTE)) {
							replacementString = replacementString.substring(0, replacementString.length() - 1);
						}
					} catch (BadLocationException e) {
						Activator.logError("Reached end of document", e);
					}
					return replacementString;
				}

			});
			acceptor.accept(completionProposal);
		}
	}

	private void proposeString(String proposal, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		propose(getValueConverter().toString(proposal, "STRING"), context, acceptor); //$NON-NLS-1$
	}

	@Override
	public void completeVersion_Version(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeVersion_Version(model, assignment, context, acceptor);
		proposeString(LilyPondVersion.get(), context, acceptor);
	}

	@Override
	public void completeInclude_ImportURI(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeInclude_ImportURI(model, assignment, context, acceptor);
		String prefix = context.getPrefix();
		final String pathPrefix = prefix.length() > 0 ? prefix.substring(1) : prefix;
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
						return filename.startsWith(pathPrefix) && any(LilyPondConstants.EXTENSIONS, new Predicate<String>() {

							@Override
							public boolean apply(String extension) {
								return filename.endsWith("." + extension);
							}

						});
					}

				});
				for (String child : children) {
					proposeString(child, context, acceptor);
				}
			}
		}
	}
}
