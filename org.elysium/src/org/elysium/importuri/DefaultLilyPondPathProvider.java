package org.elysium.importuri;

import static com.google.common.base.Splitter.on;
import java.io.File;

/**
 * Determines LilyPond's path from a system property.
 */
public class DefaultLilyPondPathProvider implements ILilyPondPathProvider {

	@Override
	public String getLilyPondPath() {
		return System.getProperty("lilypond.path"); //$NON-NLS-1$
	}

	@Override
	public Iterable<String> getSearchPaths() {
		return parse(System.getProperty("lilypond.search")); //$NON-NLS-1$ 
	}

	public static Iterable<String> parse(String joinedPaths) {
		return on(File.pathSeparatorChar).omitEmptyStrings().split(joinedPaths);
	}

}
