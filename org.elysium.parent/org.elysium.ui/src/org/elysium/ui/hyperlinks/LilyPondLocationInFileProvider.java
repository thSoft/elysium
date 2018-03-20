package org.elysium.ui.hyperlinks;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.DefaultLocationInFileProvider;
import org.eclipse.xtext.util.ITextRegion;
import org.eclipse.xtext.util.TextRegion;
import org.elysium.lilypond.Include;
import org.elysium.lilypond.LilypondPackage;

public class LilyPondLocationInFileProvider extends DefaultLocationInFileProvider {

	@Override
	public ITextRegion getSignificantTextRegion(EObject obj) {
		if(obj instanceof Include) {
			return includeSignificantRegion((Include) obj);
		}
		return super.getSignificantTextRegion(obj);
	}

	private ITextRegion includeSignificantRegion(Include include) {
		if(include.getImportURI()!=null){
			try {
				List<INode> nodes = NodeModelUtils.findNodesForFeature(include, LilypondPackage.Literals.INCLUDE__IMPORT_URI);
				INode singleExpectedNode = nodes.get(0);
				return new TextRegion(singleExpectedNode.getOffset(), singleExpectedNode.getLength());
			}catch(Exception e) {
				//ignore
			}
		}
		return super.getSignificantTextRegion(include);
	}
}
