package org.elysium.ui.hyperlinks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.util.ResourceUtils;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.hyperlink.IHyperlink;
import org.eclipse.ui.views.file.Activator;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.hyperlinking.HyperlinkHelper;
import org.eclipse.xtext.ui.editor.hyperlinking.XtextHyperlink;
import org.elysium.lilyPond.Include;
import org.elysium.lilyPond.LilyPondPackage;
import org.elysium.ui.markers.MarkerTypes;
import org.elysium.ui.score.hyperlinks.SourceToScoreHyperlink;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * Provides hyperlinks in LilyPond source editors.
 */
public class LilyPondHyperlinkHelper extends HyperlinkHelper {

	@Inject
	private Provider<XtextHyperlink> hyperlinkProvider;

	@Override
	public IHyperlink[] createHyperlinksByOffset(XtextResource xtextResource, int offset, boolean createMultipleHyperlinks) {
		// Get default hyperlinks
		IHyperlink[] defaultHyperlinks = super.createHyperlinksByOffset(xtextResource, offset, createMultipleHyperlinks);
		List<IHyperlink> hyperlinks;
		if (defaultHyperlinks == null) {
			hyperlinks = new ArrayList<IHyperlink>();
		} else {
			hyperlinks = Arrays.asList(defaultHyperlinks);
		}
		// Add hyperlinks
		AbstractNode node = NodeUtil.findLeafNodeAtOffset(xtextResource.getParseResult().getRootNode(), offset);
		EObject object = NodeUtil.getNearestSemanticObject(node);
		// Include -> File
		if ((object instanceof Include) && NodeUtil.findNodesForFeature(object, LilyPondPackage.eINSTANCE.getInclude_ImportURI()).contains(node)) {
			Include include = (Include)object;
			Resource includedEResource = EcoreUtil2.getResource(xtextResource, include.getImportURI());
			IResource includedResource = ResourceUtils.convertEResourceToPlatformResource(includedEResource);
			if (includedResource != null) {
				XtextHyperlink hyperlink = hyperlinkProvider.get();
				hyperlink.setHyperlinkRegion(new Region(node.getOffset() + 1, node.getLength() - 2)); // Ignore the surrounding quotation marks
				hyperlink.setHyperlinkText("Open included file");
				URI importUri = includedEResource.getURI();
				hyperlink.setURI(importUri);
				hyperlinks.add(hyperlink);
			}
		}
		// Source -> Score
		else {
			IResource resource = ResourceUtils.convertEResourceToPlatformResource(xtextResource);
			if (resource != null) {
				try {
					IMarker[] sourceToScoreMarkers = resource.findMarkers(MarkerTypes.SOURCE_TO_SCORE, false, IResource.DEPTH_ZERO);
					for (IMarker marker : sourceToScoreMarkers) {
						int charStart = marker.getAttribute(IMarker.CHAR_START, 0);
						int charEnd = marker.getAttribute(IMarker.CHAR_END, 0);
						if ((charStart <= offset) && (offset <= charEnd)) {
							SourceToScoreHyperlink hyperlink = new SourceToScoreHyperlink(marker);
							hyperlink.setHyperlinkRegion(new Region(node.getOffset(), node.getLength()));
							hyperlinks.add(hyperlink);
						}
					}
				} catch (CoreException e) {
					Activator.logError("Couldn't query source-to-score markers", e);
				}
			}
		}
		if (hyperlinks.isEmpty()) { // Must return null instead of empty array if there are no hyperlinks
			return null;
		} else {
			return Iterables.newArray(hyperlinks, IHyperlink.class);
		}
	}

}
