package org.elysium.linking;

import java.text.MessageFormat;
import org.eclipse.xtext.diagnostics.DiagnosticMessage;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.linking.impl.LinkingDiagnosticMessageProvider;
import org.elysium.lilypond.Reference;
import org.elysium.lilypond.util.LilypondSwitch;
import org.elysium.validation.IssueCodes;

public class LilyPondLinkingDiagnosticMessageProvider extends LinkingDiagnosticMessageProvider {

	@Override
	public DiagnosticMessage getUnresolvedProxyMessage(final ILinkingDiagnosticContext context) {
		DiagnosticMessage diagnosticMessage = new LilypondSwitch<DiagnosticMessage>() {

			@Override
			public DiagnosticMessage caseReference(Reference reference) {
				return new DiagnosticMessage(MessageFormat.format("Unknown variable: {0}", context.getLinkText()), Severity.ERROR, IssueCodes.UNKNOWN_VARIABLE, context.getLinkText());
			}

		}.doSwitch(context.getContext());
		return diagnosticMessage != null ? diagnosticMessage : super.getUnresolvedProxyMessage(context);
	}

}
