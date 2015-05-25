package org.elysium.ui.compiler.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.util.ResourceUtils;
import org.elysium.LilyPondConstants;
import org.elysium.ui.compiler.LilyPondBuilder;
import org.elysium.ui.score.ScoreViewType;

import com.google.common.collect.ImmutableSet;

public class RecompileViewedHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IFile scoreFile = ScoreViewType.getScoreFile();
		if (scoreFile != null) {
			IFile sourceFile = ResourceUtils.replaceExtension(scoreFile, LilyPondConstants.EXTENSION);
			LilyPondBuilder.compile(ImmutableSet.of(sourceFile));
		}
		return null;
	}

}
