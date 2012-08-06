package org.elysium.importuri;

public interface ILilyPondPathProvider {

	/**
	 * Returns the path of the LilyPond executable in the local file system.
	 */
	String getLilyPondPath();

	/**
	 * Returns paths of additional folders which are automatically searched for
	 * included files.
	 */
	Iterable<String> getSearchPaths();

}
