package org.elysium.ui.quickfix;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.diagnostics.Diagnostic;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.model.edit.IssueModificationContext;
import org.eclipse.xtext.ui.editor.quickfix.AbstractDeclarativeQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.ISimilarityMatcher;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolution;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.ui.editor.quickfix.Messages;
import org.eclipse.xtext.ui.editor.quickfix.ReplaceModification;
import org.eclipse.xtext.util.StopWatch;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.validation.Issue;
import com.google.common.collect.Sets;
import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * Provides "change to similar" quick fixes.
 */
public class ChangeToSimilarQuickfixProvider extends AbstractDeclarativeQuickfixProvider {

	private static final Logger logger = Logger.getLogger(ChangeToSimilarQuickfixProvider.class);

	@Inject
	private ISimilarityMatcher similarityMatcher;

	@Inject
	private IssueModificationContext.Factory modificationContextFactory;

	@Inject
	private Provider<IssueResolutionAcceptor> issueResolutionAcceptorProvider;

	@Inject
	private IScopeProvider scopeProvider;

	@Inject
	private IQualifiedNameConverter qualifiedNameConverter;

	private CrossReference findCrossReference(EObject context, INode node) {
		if ((node == null) || (node.hasDirectSemanticElement() && context.equals(node.getSemanticElement()))) {
			return null;
		}

		EObject grammarElement = node.getGrammarElement();
		if (grammarElement instanceof CrossReference) {
			return (CrossReference)grammarElement;
		} else {
			return findCrossReference(context, node.getParent());
		}
	}

	public List<IssueResolution> getResolutionsForLinkingIssue(final Issue issue) {
		final IssueResolutionAcceptor issueResolutionAcceptor = issueResolutionAcceptorProvider.get();
		createLinkingIssueResolutions(issue, issueResolutionAcceptor);
		return issueResolutionAcceptor.getIssueResolutions();
	}

	public void createLinkingIssueResolutions(final Issue issue, final IssueResolutionAcceptor issueResolutionAcceptor) {
		final IModificationContext modificationContext = modificationContextFactory.createModificationContext(issue);
		final IXtextDocument xtextDocument = modificationContext.getXtextDocument();
		xtextDocument.readOnly(new IUnitOfWork.Void<XtextResource>() {

			@Override
			public void process(XtextResource state) throws Exception {
				EObject target = state.getEObject(issue.getUriToProblem().fragment());
				EReference reference = getUnresolvedEReference(issue, target);
				if (reference == null) {
					return;
				}

				String issueString = xtextDocument.get(issue.getOffset(), issue.getLength());
				IScope scope = scopeProvider.getScope(target, reference);
				Set<String> qualifiedNames = Sets.newHashSet();
				for (IEObjectDescription referableElement : queryScope(scope)) {
					String referableElementQualifiedName = qualifiedNameConverter.toString(referableElement.getQualifiedName());
					if (similarityMatcher.isSimilar(issueString, qualifiedNameConverter.toString(referableElement.getName()))) {
						createResolution(issueString, referableElement);
						qualifiedNames.add(referableElementQualifiedName);
					}
				}
			}

			public void createResolution(String issueString, IEObjectDescription solution) {
				String replacement = qualifiedNameConverter.toString(solution.getName());
				String replaceLabel = fixCrossReferenceLabel(issueString, replacement);
				issueResolutionAcceptor.accept(issue, replaceLabel, replaceLabel, fixCrossReferenceImage(issueString, replacement), new ReplaceModification(issue, replacement));
			}

		});
	}

	protected Iterable<IEObjectDescription> queryScope(IScope scope) {
		return scope.getAllElements();
	}

	protected EReference getUnresolvedEReference(final Issue issue, EObject target) {
		final ICompositeNode node = NodeModelUtils.getNode(target);
		if (node == null) {
			return null;
		}
		ICompositeNode rootNode = node.getRootNode();
		ILeafNode leaf = NodeModelUtils.findLeafNodeAtOffset(rootNode, issue.getOffset() + 1);
		CrossReference crossReference = findCrossReference(target, leaf);
		if (crossReference != null) {
			return GrammarUtil.getReference(crossReference);
		}
		return null;
	}

	protected String fixCrossReferenceLabel(String issueString, String replacement) {
		return Messages.DefaultQuickfixProvider_changeTo + replacement + Messages.DefaultQuickfixProvider_1;
	}

	protected String fixCrossReferenceImage(String issueString, String replacement) {
		return ""; //$NON-NLS-1$
	}

	@Override
	public List<IssueResolution> getResolutions(Issue issue) {
		StopWatch stopWatch = new StopWatch(logger);
		try {
			if (Diagnostic.LINKING_DIAGNOSTIC.equals(issue.getCode())) {
				List<IssueResolution> result = new ArrayList<IssueResolution>();
				result.addAll(getResolutionsForLinkingIssue(issue));
				result.addAll(super.getResolutions(issue));
				return result;
			} else {
				return super.getResolutions(issue);
			}
		} finally {
			stopWatch.resetAndLog("#getResolutions");
		}

	}

	@Override
	public boolean hasResolutionFor(String issueCode) {
		return Diagnostic.LINKING_DIAGNOSTIC.equals(issueCode) || super.hasResolutionFor(issueCode);
	}

	/**
	 * @since 2.0
	 */
	protected IssueModificationContext.Factory getModificationContextFactory() {
		return modificationContextFactory;
	}

	/**
	 * @since 2.0
	 */
	protected IScopeProvider getScopeProvider() {
		return scopeProvider;
	}

	/**
	 * @since 2.0
	 */
	protected IQualifiedNameConverter getQualifiedNameConverter() {
		return qualifiedNameConverter;
	}

	/**
	 * @since 2.0
	 */
	protected ISimilarityMatcher getSimilarityMatcher() {
		return similarityMatcher;
	}
}
