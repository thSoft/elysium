package org.elysium.ui.quickfix;

import java.util.Iterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parsetree.LeafNode;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification;
import org.eclipse.xtext.ui.editor.quickfix.AbstractDeclarativeQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;
import org.elysium.lilypond.Command;
import org.elysium.lilypond.LilyPond;
import org.elysium.lilypond.LilypondFactory;
import org.elysium.lilypond.Version;
import org.elysium.ui.version.LilyPondVersion;
import org.elysium.validation.LilyPondJavaValidator;

/**
 * Provides quick fixes for LilyPond validation problems.
 */
public class LilyPondQuickfixProvider extends AbstractDeclarativeQuickfixProvider {

	@Fix(LilyPondJavaValidator.HIDDEN_TOKEN_AFTER_BACKSLASH)
	public void removeHiddenTokensAfterBackslash(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Remove hidden tokens", null, null, new ISemanticModification() {

			@Override
			public void apply(EObject element, IModificationContext context) throws Exception {
				if (element instanceof Command) {
					int start = -1;
					int end = -1;
					for (Iterator<LeafNode> hiddenTokens = LilyPondJavaValidator.getHiddenTokensAfterBackslash((Command)element); hiddenTokens.hasNext();) {
						LeafNode next = hiddenTokens.next();
						if (next.isHidden()) {
							if (start == -1) {
								start = next.getOffset();
							}
						} else {
							end = next.getOffset();
							break;
						}
					}
					if (start != -1) {
						context.getXtextDocument().replace(start, end - start, ""); //$NON-NLS-1$
					}
				}
			}

		});
	}

	@Fix(LilyPondJavaValidator.NO_VERSION)
	public void addVersion(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Add \\version statement", null, null, new ISemanticModification() {

			@Override
			public void apply(EObject element, IModificationContext context) throws Exception {
				if (element instanceof LilyPond) {
					LilyPond lilypond = (LilyPond)element;
					Version version = LilypondFactory.eINSTANCE.createVersion();
					version.setKeyword("version"); //$NON-NLS-1$
					version.setVersion(LilyPondVersion.get());
					lilypond.getExpressions().add(0, version);
				}
			}

		});
	}

}
