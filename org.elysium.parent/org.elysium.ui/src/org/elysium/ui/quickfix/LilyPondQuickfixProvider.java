package org.elysium.ui.quickfix;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;
import org.elysium.lilypond.Assignment;
import org.elysium.lilypond.Command;
import org.elysium.lilypond.Include;
import org.elysium.lilypond.LilyPond;
import org.elysium.lilypond.LilypondFactory;
import org.elysium.lilypond.Version;
import org.elysium.ui.version.LilyPondVersion;
import org.elysium.validation.IssueCodes;
import org.elysium.validation.LilyPondValidator;

/**
 * Provides quick fixes for LilyPond validation problems.
 */
public class LilyPondQuickfixProvider extends ChangeToSimilarQuickfixProvider {

	@Fix(IssueCodes.HIDDEN_TOKEN_AFTER_BACKSLASH)
	public void removeHiddenTokensAfterBackslash(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Remove hidden tokens", null, null, new ISemanticModification() {

			@Override
			public void apply(EObject element, IModificationContext context) throws Exception {
				if (element instanceof Command) {
					int start = -1;
					int end = -1;
					for (Iterator<ILeafNode> hiddenTokens = LilyPondValidator.getHiddenTokensAfterBackslash((Command)element); hiddenTokens.hasNext();) {
						ILeafNode next = hiddenTokens.next();
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

	@Fix(IssueCodes.NO_VERSION_STANDALONE)
	public void addVersionLy(final Issue issue, IssueResolutionAcceptor acceptor) {
		internalAddVersion(issue, acceptor);
	}

	@Fix(IssueCodes.NO_VERSION_ILY)
	public void addVersionIly(final Issue issue, IssueResolutionAcceptor acceptor) {
		internalAddVersion(issue, acceptor);
	}

	private void internalAddVersion(final Issue issue, IssueResolutionAcceptor acceptor) {
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

	@Fix(IssueCodes.UNKNOWN_VARIABLE_STANDALONE)
	public void fixUnknownVariableLy(final Issue issue, IssueResolutionAcceptor acceptor) {
		internalfixUnknownVariable(issue, acceptor);
	}
	@Fix(IssueCodes.UNKNOWN_VARIABLE_ILY)
	public void fixUnknownVariableIly(final Issue issue, IssueResolutionAcceptor acceptor) {
		internalfixUnknownVariable(issue, acceptor);
	}

	private void internalfixUnknownVariable(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Create missing variable", null, null, new ISemanticModification() {

			@Override
			public void apply(EObject element, IModificationContext context) throws Exception {
				int position = 0;
				while (!(element instanceof LilyPond)) {
					position = element.eContainer().eContents().indexOf(element);
					element = element.eContainer();
				}
				LilyPond lilypond = (LilyPond)element;
				Assignment assignment = LilypondFactory.eINSTANCE.createAssignment();
				assignment.setName(issue.getData()[0]);
				assignment.setValue(LilypondFactory.eINSTANCE.createSimpleBlock());
				lilypond.getExpressions().add(position, assignment);
			}

		});
		createLinkingIssueResolutions(issue, acceptor);
	}

	@Fix(IssueCodes.WINDOWS_NORMALIZED_INCLUDE)
	public void normalizeWindowsInclude(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "normalize include", null, null, new ISemanticModification() {

			@Override
			public void apply(EObject element, IModificationContext context) throws Exception {
				if (element instanceof Include) {
					String include = ((Include) element).getImportURI();
					if(include!=null) {
						if(include.startsWith(LilyPondValidator.FILE_URI_PREFIX)) {
							include=include.replaceFirst(LilyPondValidator.FILE_URI_PREFIX,"");
						}
						include=include.replaceAll("\\\\+", "/");
						((Include) element).setImportURI(include);
					}
				}
			}
		});
	}
}
