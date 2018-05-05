package org.elysium.ui.compiler.problems;

import java.util.Locale;
import java.util.Map;
import java.util.Optional;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
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

	public ProblemParser(IFile file) {
		this.compiledFile = file;
	}

	private void determineIndexesAndSeverity(String line) {
		severity = IMarker.SEVERITY_INFO;
		problemStringIndex = -1;
		messageIndex = -1;
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

	private IFile getFileToMark(String[] infoSections) {
		String path = infoSections[0];
		if ((infoSections.length >= 1) && (path.length() > 0)) {
			if (!path.equals(compiledFile.getName())) {
				//TODO we need to do correct resolution here
				IResource includedResource = compiledFile.getParent().findMember(path);
				if ((includedResource != null) && (includedResource instanceof IFile)) {
					return (IFile)includedResource;
				} else { 
					return null;
				}
			}
		}
		return compiledFile;
	}

	private IMarker doCreateMarker(IFile file, String line, String[] sections) {
		IMarker result = null;
		try {
			result = file.createMarker(MarkerTypes.LILYPOND_PROBLEM);
			result.setAttribute(MarkerAttributes.COMPILER_OUTPUT.name(), line);
			result.setAttribute(IMarker.SEVERITY, severity);
			// Message
			String message = line.substring(messageIndex);
			if (message.startsWith(PROBLEM_POSTFIX)) { // Fix messages starting with superfluous colon
				message = message.substring(PROBLEM_POSTFIX.length());
			}
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

	/**
	 * @param line the line of the compiler output to parse
	 */
	public IMarker parse(String line) {
		determineIndexesAndSeverity(line);
		if (severity != IMarker.SEVERITY_INFO) {
			String info = line.substring(0, problemStringIndex);
			String[] sections = info.split(":", 4); //$NON-NLS-1$
			IFile file=getFileToMark(sections);
			if(file != null) {
				return doCreateMarker(file, line, sections);
			}
		}
		return null;
	}
}