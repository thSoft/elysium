package org.elysium.ui.contentassist

import com.google.common.base.Strings
import com.google.inject.Injector
import java.io.File
import java.io.InputStream
import javax.inject.Inject
import javax.inject.Provider
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.ui.ContentAssistProcessorTestBuilder
import org.eclipse.xtext.junit4.ui.util.IResourcesSetupUtil
import org.eclipse.xtext.junit4.util.ResourceLoadHelper
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet
import org.elysium.LilyPondConstants
import org.elysium.ui.tests.LilyPondUiInjectorProvider
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(LilyPondUiInjectorProvider))
class LilyPondProposalProviderTest implements ResourceLoadHelper {

	@Inject Injector injector
	@Inject Provider<XtextResourceSet> resourceSetProvider

	var URI uri

	@Before
	def void setup(){
		uri=URI.createURI("test.ly")
	}

	@Test
	def void testMidiInstrument() {
		newBuilder
		.append('''\score{\relative c{\set midiInstrument = #"''')
		.appendSuffix('"') //the implementation currently requires the closing quotes, so the assignment is complete
		.assertProposal('"violin"')
	}

	@Test
	def void testInclude() {
		Assert.assertFalse(
			"The lilypond path must be correctly set as system property, otherwise default includes may not be found.", 
			Strings.isNullOrEmpty(System.getProperty("lilypond.path"))
		)
		IResourcesSetupUtil.createProject("test");
		var file= IResourcesSetupUtil.createFile("test/test.ly", "")
		IResourcesSetupUtil.createFile("test/folder/include.ly","")
		uri=URI.createPlatformResourceURI(file.fullPath.toString, true)

		newBuilder.append('''\include "a''').assertProposal('"arabic.ly"')
		newBuilder.append('''\include "''').assertProposal('"folder/"')
		newBuilder.append('''\include "f''').assertProposal('"folder/"')
		newBuilder.append('''\include "folder/''').assertProposal('"folder/include.ly"')
		newBuilder.append('''\include "folder/i''').assertProposal('"folder/include.ly"')
		newBuilder.append('''\include "..''').assertProposal('"../test/"')
		newBuilder.append('''\include "../''').assertProposal('"../test/"')
		newBuilder.append('''\include "../test/''').assertProposal('"../test/test.ly"')

		var location=new File("ignore").absoluteFile.parentFile.toURI.toString
		Assert.assertTrue(location, location.startsWith("file:/"))
		Assert.assertTrue(location, location.endsWith("/"))
		if(LilyPondConstants.IS_WINDOWS){
			testAbsoluteIncludes(location.substring(6))// C:/folder...
		} else{
			testAbsoluteIncludes(location)// file:/folder...
			testAbsoluteIncludes(location.substring(5))// /folder...
		}
	}

	def void testAbsoluteIncludes(String importBase){
		newBuilder.append('''\include "«importBase»''').assertProposal('''"«importBase»resources/"''')
		newBuilder.append('''\include "«importBase»re''').assertProposal('''"«importBase»resources/"''')
		newBuilder.append('''\include "«importBase»resources/''').assertProposal('''"«importBase»resources/include.ly"''')
		newBuilder.append('''\include "«importBase»resources/..''').assertProposal('''"«importBase»resources/../resources/"''')
		newBuilder.append('''\include "«importBase»resources/../''').assertProposal('''"«importBase»resources/../resources/"''')
	}

	def protected ContentAssistProcessorTestBuilder newBuilder() throws Exception {
		new ContentAssistProcessorTestBuilder(injector, this)
	}

	override getResourceFor(InputStream stream) {
		val set = resourceSetProvider.get()
		val result = set.createResource(uri)
		result.load(stream, null)
		result as XtextResource
	}
}