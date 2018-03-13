package org.elysium.importuri;

//this class is provisional API
public class LilyPondResolvedUri {

	private String uri;
	private boolean resolved;

	private LilyPondResolvedUri(String uri, boolean resolved) {
		if(uri==null && resolved) {
			throw new IllegalStateException();
		}
		this.uri=uri;
		this.resolved=resolved;
	}

	//this is intended to be used with existing file uris
	//currently this is not yet enforced
	public LilyPondResolvedUri(String resolvedFileUri) {
		resolved=true;
		uri=resolvedFileUri;
	}

	static LilyPondResolvedUri unresolved(String importUri) {
		return new LilyPondResolvedUri(importUri, false);
	}

	public boolean isResolved() {
		return resolved;
	}

	public String get() {
		return uri;
	}
}
