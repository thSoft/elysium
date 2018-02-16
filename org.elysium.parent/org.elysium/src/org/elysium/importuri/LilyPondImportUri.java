package org.elysium.importuri;

import com.google.common.base.Objects;

public class LilyPondImportUri {

	public enum Type{
		relative,
		absolute,
		searchPath
	}

	private String originalUri;
	private String uri;
	private Type type;
	private boolean inWorkspace;

	public LilyPondImportUri(String originalUri, String uri, Type type, boolean inWorkspace) {
		this.originalUri=originalUri;
		this.uri=uri;
		this.type=type;
		this.inWorkspace=inWorkspace;
	}

	public String getUri() {
		return uri;
	}

	public String getOriginalUri() {
		return originalUri;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this).add("type", type.toString()).add("inWS", inWorkspace).add("resolved", uri).toString();
	}

	public Type getType() {
		return type;
	}
}
