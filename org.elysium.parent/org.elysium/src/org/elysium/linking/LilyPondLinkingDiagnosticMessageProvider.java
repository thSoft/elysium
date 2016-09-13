package org.elysium.linking;

import java.text.MessageFormat;

import org.eclipse.xtext.diagnostics.DiagnosticMessage;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.linking.impl.LinkingDiagnosticMessageProvider;
import org.elysium.LilyPondConstants;
import org.elysium.lilypond.Reference;
import org.elysium.lilypond.util.LilypondSwitch;
import org.elysium.validation.IssueCodes;
import org.elysium.validation.LilyPondIssueCodesProvider;

import com.google.common.base.Optional;
import com.google.inject.Inject;

public class LilyPondLinkingDiagnosticMessageProvider extends LinkingDiagnosticMessageProvider {

	@Inject
	private LilyPondIssueCodesProvider issueSeveritiesProvider;

	@Override
	public DiagnosticMessage getUnresolvedProxyMessage(final ILinkingDiagnosticContext context) {
		Optional<DiagnosticMessage> diagnosticMessage = new LilypondSwitch<Optional<DiagnosticMessage>>() {

			@Override
			public Optional<DiagnosticMessage> caseReference(Reference reference) {
				return getUnknownVariableMessage(context, reference);
			}

		}.doSwitch(context.getContext());
		return diagnosticMessage != null ? diagnosticMessage.orNull() : super.getUnresolvedProxyMessage(context);
	}

	private Optional<DiagnosticMessage> getUnknownVariableMessage(ILinkingDiagnosticContext context, Reference reference){
		String linkText=context.getLinkText();
		if(issueSeveritiesProvider.ignoreUnknownVariable(reference, linkText)){
			return Optional.absent();
		}else{
			String code=LilyPondConstants.isStandalone(reference)?IssueCodes.UNKNOWN_VARIABLE_STANDALONE:IssueCodes.UNKNOWN_VARIABLE_ILY;
			Severity severity = issueSeveritiesProvider.getIssueSeverities(reference.eResource()).getSeverity(code);
			if(severity==Severity.IGNORE){
				return Optional.absent();
			}else{
				return Optional.of(new DiagnosticMessage(MessageFormat.format("Unknown variable: {0}", context.getLinkText()), severity, code, context.getLinkText()));
			}
		}
	}
}
