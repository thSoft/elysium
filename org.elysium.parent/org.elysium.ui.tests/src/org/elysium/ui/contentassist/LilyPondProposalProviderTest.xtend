package org.elysium.ui.contentassist

import com.google.inject.Injector
import java.io.InputStream
import javax.inject.Inject
import javax.inject.Provider
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.ui.ContentAssistProcessorTestBuilder
import org.eclipse.xtext.junit4.util.ResourceLoadHelper
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet
import org.elysium.ui.tests.LilyPondUiInjectorProvider
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(LilyPondUiInjectorProvider))
class LilyPondProposalProviderTest implements ResourceLoadHelper {

	@Inject Injector injector
	@Inject Provider<XtextResourceSet> resourceSetProvider

	@Test
	def void testMidiInstrument() {
		newBuilder
		.append('''\score{\relative c{\set midiInstrument = #"''')
		.appendSuffix('"') //the implementation currently requires the closing quotes, so the assignment is complete
		.assertProposal('"violin"')
	}

	def protected ContentAssistProcessorTestBuilder newBuilder() throws Exception {
		new ContentAssistProcessorTestBuilder(injector, this)
	}

	override getResourceFor(InputStream stream) {
		val set = resourceSetProvider.get()
		val result = set.createResource(URI::createURI("test.ly"))
		result.load(stream, null)
		result as XtextResource
	}
}