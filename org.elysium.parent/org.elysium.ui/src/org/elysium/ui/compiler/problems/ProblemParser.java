package org.elysium.ui.compiler.problems;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.ui.console.IHyperlink;
import org.eclipse.util.DocumentUtils;
import org.elysium.LilyPondConstants;
import org.elysium.ui.Activator;
import org.elysium.ui.markers.MarkerAttributes;
import org.elysium.ui.markers.MarkerTypes;

import com.google.common.collect.ImmutableMap;

/**
 * Parses a line of LilyPond output and creates a problem marker from it.
 */
public class ProblemParser {

	/**
	 * The common postfix of strings denoting problem.
	 */
	private static final String PROBLEM_POSTFIX = ": "; //$NON-NLS-1$

	/**
	 * Strings denoting error in all locales LilyPond is available in.
	 */
	private static final Map<String, String> ERROR_STRINGS = new ImmutableMap.Builder<String, String>()
		.put("en", "error") //$NON-NLS-1$ //$NON-NLS-2$
		.put("cs", "chyba") //$NON-NLS-1$ //$NON-NLS-2$
		.put("da", "fejl") //$NON-NLS-1$ //$NON-NLS-2$
		.put("de", "Fehler") //$NON-NLS-1$ //$NON-NLS-2$
		.put("es", "error") //$NON-NLS-1$ //$NON-NLS-2$
		.put("fi", "virhe") //$NON-NLS-1$ //$NON-NLS-2$
		.put("fr", "Erreur ") //$NON-NLS-1$ //$NON-NLS-2$
		.put("it", "errore") //$NON-NLS-1$ //$NON-NLS-2$
		.put("nl", "fout") //$NON-NLS-1$ //$NON-NLS-2$
		.put("ru", "������") //$NON-NLS-1$ //$NON-NLS-2$
		.put("sv", "fel") //$NON-NLS-1$ //$NON-NLS-2$
		.put("tr", "hata") //$NON-NLS-1$ //$NON-NLS-2$
		.put("uk", "помилка") //$NON-NLS-1$ //$NON-NLS-2$
		.put("vi", "lỗi") //$NON-NLS-1$ //$NON-NLS-2$
		.put("zh", "錯誤") //$NON-NLS-1$ //$NON-NLS-2$
		.build();

	/**
	 * Strings with which programming error messages start in the appropriate
	 * locales LilyPond is available in.
	 */
	private static final Map<String, String> PROGRAMMING_ERROR_PREFIXES = new ImmutableMap.Builder<String, String>()
		.put("en", "programming") //$NON-NLS-1$ //$NON-NLS-2$
		.put("da", "programmerings") //$NON-NLS-1$ //$NON-NLS-2$
		.put("fi", "ohjelmointi") //$NON-NLS-1$ //$NON-NLS-2$
		.put("nl", "programmeer") //$NON-NLS-1$ //$NON-NLS-2$
		.put("sv", "programmerings") //$NON-NLS-1$ //$NON-NLS-2$
		.put("zh", "程式") //$NON-NLS-1$ //$NON-NLS-2$
		.build();

	/**
	 * Strings denoting warning in all locales LilyPond is available in.
	 */
	private static final Map<String, String> WARNING_STRINGS = new ImmutableMap.Builder<String, String>()
		.put("en", "warning") //$NON-NLS-1$ //$NON-NLS-2$
		.put("cs", "varování") //$NON-NLS-1$ //$NON-NLS-2$
		.put("da", "advarsel") //$NON-NLS-1$ //$NON-NLS-2$
		.put("de", "Warnung") //$NON-NLS-1$ //$NON-NLS-2$
		.put("es", "advertencia") //$NON-NLS-1$ //$NON-NLS-2$
		.put("fi", "varoitus") //$NON-NLS-1$ //$NON-NLS-2$
		.put("fr", "Avertissement ") //$NON-NLS-1$ //$NON-NLS-2$
		.put("it", "attenzione") //$NON-NLS-1$ //$NON-NLS-2$
		.put("nl", "waarschuwing") //$NON-NLS-1$ //$NON-NLS-2$
		.put("ru", "������������") //$NON-NLS-1$ //$NON-NLS-2$
		.put("sv", "varning") //$NON-NLS-1$ //$NON-NLS-2$
		.put("tr", "uyarı") //$NON-NLS-1$ //$NON-NLS-2$
		.put("uk", "попередження") //$NON-NLS-1$ //$NON-NLS-2$
		.put("vi", "cảnh báo ") //$NON-NLS-1$ //$NON-NLS-2$
		.put("zh", "警告") //$NON-NLS-1$ //$NON-NLS-2$
		.build();

	/**
	 * The file being compiled
	 */
	private final IFile compiledFile;

	/**
	 * The language passed to the LilyPond compile for localization
	 */
	private final String language=Locale.getDefault().getLanguage();
	private static final String FALLBACK_LANGUAGE = "en"; //$NON-NLS-1$

	int severity;
	int problemStringIndex;
	int messageIndex;
	private LilyPondWorkspaceExternalHyperlink wsExternalHyperlink;
	private Map<File, List<LilyPondWorkspaceExternalHyperlink>> wsExternalLinks=new HashMap<>();

	public ProblemParser(IFile file) {
		this.compiledFile = file;
	}

	private void determineIndexesAndSeverity(String line) {
		severity = IMarker.SEVERITY_INFO;
		problemStringIndex = -1;
		messageIndex = -1;
		wsExternalHyperlink = null;
		boolean lineCanContainIssue=line.indexOf(':') >= 0;
		if(lineCanContainIssue) {
			determineIndexesAndSeverityByLanguage(line, language);
			if(severity == IMarker.SEVERITY_INFO) {
				determineIndexesAndSeverityByLanguage(line, FALLBACK_LANGUAGE);
			}
		}
	}

	private String localizedIssueString(Map<String, String> map, String language) {
		return Optional.ofNullable(map.get(language)).orElse(map.get(FALLBACK_LANGUAGE)) + PROBLEM_POSTFIX;
	}

	private String getProgrammingErrorPrefix(String language) {
		return Optional.ofNullable(PROGRAMMING_ERROR_PREFIXES.get(language)).orElse(PROGRAMMING_ERROR_PREFIXES.get(FALLBACK_LANGUAGE));
	}

	private void determineIndexesAndSeverityByLanguage(String line, String language) {
		String errorString=localizedIssueString(ERROR_STRINGS, language);
		if (((problemStringIndex = line.indexOf(errorString)) != -1) 
				&& !line.startsWith(getProgrammingErrorPrefix(language))) {
			messageIndex = problemStringIndex + errorString.length();
			severity = IMarker.SEVERITY_ERROR;
		} else {
			String warningString=localizedIssueString(WARNING_STRINGS, language);
			if ((problemStringIndex = line.indexOf(warningString)) != -1) {
				messageIndex = problemStringIndex + warningString.length();
				severity = IMarker.SEVERITY_WARNING;
			}
		}
	}

	private void initWorkspaceExternalIssue(File existingFile, String lineText, String[] infoSections) {
		int line = toNumber(infoSections, 1);
		int column = toNumber(infoSections, 2);
		String message = getMessage(lineText);
		wsExternalHyperlink = new LilyPondWorkspaceExternalHyperlink(existingFile.toURI(), line, column, message,
				severity);
		List<LilyPondWorkspaceExternalHyperlink> allFileLinks = wsExternalLinks.get(existingFile);
		if (allFileLinks == null) {
			allFileLinks = new ArrayList<>();
			wsExternalLinks.put(existingFile, allFileLinks);
		}
		allFileLinks.add(wsExternalHyperlink);
		wsExternalHyperlink.setFileLinks(allFileLinks);
	}

	private int toNumber(String[] infoSections, int index) {
		try {
			if(infoSections.length > index) {
				return Integer.parseInt(infoSections[index]) - 1;
			}
		}catch(NumberFormatException e) {}
		return 0;
	}

	private IFile getFileToMark(String line, String[] infoSections) {
		String path = infoSections[0];
		if ((infoSections.length >= 1) && (path.length() > 0)) {
			if (!path.equals(compiledFile.getName())) {
				IResource includedResource = compiledFile.getParent().findMember(path);
				if ((includedResource != null) && (includedResource instanceof IFile)) {
					return (IFile)includedResource;
				} else {
					File file=getFileFromPath(path);
					if(file.exists()) {
						IFile[] files = ResourcesPlugin.getWorkspace().getRoot().findFilesForLocationURI(file.toURI());
						for (IFile iFile : files) {
							if(iFile.exists()) {
								return iFile;
							}
						}
						initWorkspaceExternalIssue(file, line, infoSections);
					}
					return null;
				}
			}
		}
		return compiledFile;
	}

	private File getFileFromPath(String path) {
		File file=new File(path);
		if(!file.exists()) {
			file=compiledFile.getLocation().removeLastSegments(1).append(path).toFile();
		}
		return file;
	}

	private String getMessage(String line) {
		String message = line.substring(messageIndex);
		if (message.startsWith(PROBLEM_POSTFIX)) { // Fix messages starting with superfluous colon
			message = message.substring(PROBLEM_POSTFIX.length());
		}
		return message;
	}

	private IMarker doCreateMarker(IFile file, String line, String[] sections) {
		IMarker result = null;
		try {
			result = file.createMarker(MarkerTypes.LILYPOND_PROBLEM);
			result.setAttribute(MarkerAttributes.COMPILER_OUTPUT.name(), line);
			result.setAttribute(IMarker.SEVERITY, severity);
			// Message
			String message = getMessage(line);
			result.setAttribute(IMarker.MESSAGE, message);
			// Line number
			if (sections.length >= 2) {
				int lineNumber = 0; // 0-based
				try {
					lineNumber = Math.max(Integer.parseInt(sections[1]) - 1, 0);
					result.setAttribute(IMarker.LINE_NUMBER, lineNumber + 1);
				} catch (NumberFormatException e) {
				}
				// Column number
				int columnNumber = 0; // 0-based
				if (sections.length >= 3) {
					try {
						columnNumber = Integer.parseInt(sections[2]) - 1;
						result.setAttribute(MarkerAttributes.COLUMN_NUMBER.name(), columnNumber + 1);
					} catch (NumberFormatException e) {
					}
				}
				// Offset
				try {
					IDocument document = DocumentUtils.getDocumentFromFile(file);
					int offset = DocumentUtils.getOffsetOfPosition(document, lineNumber, columnNumber, LilyPondConstants.TAB_WIDTH);
					result.setAttribute(IMarker.CHAR_START, offset);
					result.setAttribute(IMarker.CHAR_END, offset);
				} catch (BadLocationException e) {
					Activator.logError("Incorrect location calculation", e);
				}
			}
		} catch (CoreException e) {
			Activator.logError("Couldn't create LilyPond problem marker", e);
		}
		return result;
	}

	private String[] getInfoSections(String info) {
		if(LilyPondConstants.IS_WINDOWS && info.length() > 2) {
			//handle windows absolute paths starting with "<HD-Letter>:/"
			if(info.charAt(1) == ':' && info.charAt(2) == '/') {
				String[] sections = info.substring(2).split(":", 4);
				sections[0] = info.substring(0, 2) + sections[0];
				return sections;
			}
		}
		return info.split(":", 4); //$NON-NLS-1$
	}

	/**
	 * @param line the line of the compiler output to parse
	 */
	public IMarker parse(String line) {
		determineIndexesAndSeverity(line);
		if (severity != IMarker.SEVERITY_INFO) {
			String info = line.substring(0, problemStringIndex);
			String[] sections = getInfoSections(info);
			IFile file=getFileToMark(line, sections);
			if(file != null) {
				return doCreateMarker(file, line, sections);
			}
		}
		return null;
	}

	public IHyperlink getWorkspaceExternalHyperlink() {
		return wsExternalHyperlink;
	}
}