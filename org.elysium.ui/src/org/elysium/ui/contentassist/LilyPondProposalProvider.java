package org.elysium.ui.contentassist;

import java.util.Arrays;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.util.ResourceUtils;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.LeafNode;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.elysium.LilyPondConstants;
import org.elysium.ui.Activator;
import org.elysium.ui.version.LilyPondVersion;

/**
 * Provides content assist proposals for the LilyPond language.
 */
public class LilyPondProposalProvider extends AbstractLilyPondProposalProvider {

	private static final String QUOTE = "\""; //$NON-NLS-1$

	private void propose(String proposal, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (proposal.endsWith(QUOTE)) {
			AbstractNode currentNode = context.getCurrentNode();
			if (currentNode instanceof LeafNode) {
				LeafNode leafNode = (LeafNode)currentNode;
				if (leafNode.getText().endsWith(QUOTE) && proposal.length() > 1) {
					proposal = proposal.substring(0, proposal.length() - 1);
				}
			}
		}
		acceptor.accept(createCompletionProposal(proposal, context));
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
		if (prefix.length() > 0) {
			prefix = prefix.substring(1); // Omit leading "
		}
		IResource resource = ResourceUtils.convertEResourceToPlatformResource(model.eResource());
		if (resource != null) {
			try {
				IResource[] siblings = null;
				IPath newPath = resource.getParent().getFullPath().append(prefix);
				IResource newResource = ResourcesPlugin.getWorkspace().getRoot().findMember(newPath); // Folder
				if (newResource == null) {
					newResource = ResourcesPlugin.getWorkspace().getRoot().findMember(newPath.removeLastSegments(1)); // Folder + start of file name
				}
				if ((newResource != null) && (newResource instanceof IContainer)) {
					siblings = ((IContainer)newResource).members();
				} else {
					siblings = resource.getParent().members(); // Start of file name
				}
				for (IResource sibling : siblings) {
					if (Arrays.asList(LilyPondConstants.EXTENSIONS).contains(sibling.getFileExtension()) && !sibling.equals(resource)) {
						proposeString(sibling.getFullPath().makeRelativeTo(resource.getParent().getFullPath()).toString(), context, acceptor);
					}
				}
			} catch (CoreException e) {
				Activator.logError("Couldn't query includable resources", e);
			}
		}
	}

}
