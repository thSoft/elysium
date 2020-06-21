package org.elysium.ui.compiler;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IFile;

import com.google.common.collect.Sets;

public class LilyPondFilesToCompile {
	private IFile mainFile;
	private Set<IFile> changedFiles;
	private Set<IFile> allIncludedFiles;

	public LilyPondFilesToCompile(IFile mainFile, Set<IFile> changedFiles) {
		this.mainFile=mainFile;
		this.changedFiles=changedFiles;
	}

	public IFile getMainFile() {
		return mainFile;
	}
	
	public Set<IFile> getChangedFiles() {
		return changedFiles;
	}

	public void setIncludedFiles(Collection<IFile> includedFiles) {
		this.allIncludedFiles=new HashSet<IFile>(includedFiles);
	}

	public Collection<IFile> getIncludedChangedFiles() {
		return Sets.intersection(changedFiles, getAllIncludedFiles());
	}

	public Set<IFile> getAllIncludedFiles() {
		if(allIncludedFiles!=null) {
			return allIncludedFiles;
		}else {
			return Collections.emptySet();
		}
	}
}