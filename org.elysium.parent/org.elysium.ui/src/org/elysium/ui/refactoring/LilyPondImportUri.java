package org.elysium.ui.refactoring;

public class LilyPondImportUri {

	public enum Type{
		unresolved,
		relative,
		absolute,
		searchPath
	}

	private String originalUri;
	private String uri;
	private Type type;

	public LilyPondImportUri(String originalUri, String uri, Type type) {
		this.originalUri=originalUri;
		this.uri=uri;
		this.type=type;
	}

	public String getUri() {
		return uri;
	}

	public String getOriginalUri() {
		return originalUri;
	}

	@Override
	public String toString() {
		return new StringBuilder("LilyPondImportUri ")
			.append("type=")
			.append(type)
			.append(", original=")
			.append(originalUri)
			.append(", resolved=")
			.append(uri).toString();
	}

	public Type getType() {
		return type;
	}
}
