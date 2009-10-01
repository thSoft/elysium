package org.eclipse.lilypond.ide.internal;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;

public class ProblemParser {

	/**
	 * The common postfix of strings denoting problem.
	 */
	private static final String PROBLEM_POSTFIX = ": "; //$NON-NLS-1$

	/**
	 * Strings denoting error in all locales LilyPond is available in.
	 */
	private static final Map<String, String> ERROR_STRINGS = new HashMap<String, String>();
	static {
		ERROR_STRINGS.put("cs", "chyba"); //$NON-NLS-1$ //$NON-NLS-2$
		ERROR_STRINGS.put("da", "fejl"); //$NON-NLS-1$ //$NON-NLS-2$
		ERROR_STRINGS.put("de", "Fehler"); //$NON-NLS-1$ //$NON-NLS-2$
		ERROR_STRINGS.put("es", "error"); //$NON-NLS-1$ //$NON-NLS-2$
		ERROR_STRINGS.put("fi", "virhe"); //$NON-NLS-1$ //$NON-NLS-2$
		ERROR_STRINGS.put("fr", "Erreur "); //$NON-NLS-1$ //$NON-NLS-2$
		ERROR_STRINGS.put("it", "errore"); //$NON-NLS-1$ //$NON-NLS-2$
		ERROR_STRINGS.put("ja", "���顼"); //$NON-NLS-1$ //$NON-NLS-2$
		ERROR_STRINGS.put("nl", "fout"); //$NON-NLS-1$ //$NON-NLS-2$
		ERROR_STRINGS.put("ru", "������"); //$NON-NLS-1$ //$NON-NLS-2$
		ERROR_STRINGS.put("sv", "fel"); //$NON-NLS-1$ //$NON-NLS-2$
		ERROR_STRINGS.put("tr", "hata"); //$NON-NLS-1$ //$NON-NLS-2$
		ERROR_STRINGS.put("uk", "помилка"); //$NON-NLS-1$ //$NON-NLS-2$
		ERROR_STRINGS.put("vi", "lỗi"); //$NON-NLS-1$ //$NON-NLS-2$
		ERROR_STRINGS.put("zh", "錯誤"); //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * The string denoting error in the locale used by LilyPond.
	 */
	protected static String ERROR_STRING;
	static {
		ERROR_STRING = ERROR_STRINGS.get(Locale.getDefault().getLanguage());
		if (ERROR_STRING == null) {
			ERROR_STRING = "error"; //$NON-NLS-1$
		}
		ERROR_STRING += PROBLEM_POSTFIX;
	}

	/**
	 * Strings denoting warning in all locales LilyPond is available in.
	 */
	private static final Map<String, String> WARNING_STRINGS = new HashMap<String, String>();
	static {
		WARNING_STRINGS.put("cs", "varování"); //$NON-NLS-1$ //$NON-NLS-2$
		WARNING_STRINGS.put("da", "advarsel"); //$NON-NLS-1$ //$NON-NLS-2$
		WARNING_STRINGS.put("de", "Warnung"); //$NON-NLS-1$ //$NON-NLS-2$
		WARNING_STRINGS.put("es", "advertencia"); //$NON-NLS-1$ //$NON-NLS-2$
		WARNING_STRINGS.put("fi", "varoitus"); //$NON-NLS-1$ //$NON-NLS-2$
		WARNING_STRINGS.put("fr", "Avertissement "); //$NON-NLS-1$ //$NON-NLS-2$
		WARNING_STRINGS.put("it", "attenzione"); //$NON-NLS-1$ //$NON-NLS-2$
		WARNING_STRINGS.put("ja", "�ٹ�"); //$NON-NLS-1$ //$NON-NLS-2$
		WARNING_STRINGS.put("nl", "waarschuwing"); //$NON-NLS-1$ //$NON-NLS-2$
		WARNING_STRINGS.put("ru", "������������"); //$NON-NLS-1$ //$NON-NLS-2$
		WARNING_STRINGS.put("sv", "varning"); //$NON-NLS-1$ //$NON-NLS-2$
		WARNING_STRINGS.put("tr", "uyarı"); //$NON-NLS-1$ //$NON-NLS-2$
		WARNING_STRINGS.put("uk", "попередження"); //$NON-NLS-1$ //$NON-NLS-2$
		WARNING_STRINGS.put("vi", "cảnh báo "); //$NON-NLS-1$ //$NON-NLS-2$
		WARNING_STRINGS.put("zh", "警告"); //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * The string denoting warning in the locale used by LilyPond.
	 */
	protected static String WARNING_STRING;
	static {
		WARNING_STRING = WARNING_STRINGS.get(Locale.getDefault().getLanguage());
		if (WARNING_STRING == null) {
			WARNING_STRING = "warning"; //$NON-NLS-1$
		}
		WARNING_STRING += PROBLEM_POSTFIX;
	}

	/**
	 * Parses a line of LilyPond output and creates a problem descriptor from it.
	 * 
	 * @param file the file being compiled
	 * @param line the line to parse
	 */
	public static ProblemDescriptor parse(IFile file, String line) {
		ProblemDescriptor result = null;
		int severity = IMarker.SEVERITY_INFO;
		int problemStringIndex = -1;
		int messageIndex = -1;
		if ((problemStringIndex = line.indexOf(ERROR_STRING)) != -1) {
			messageIndex = problemStringIndex + ERROR_STRING.length();
			severity = IMarker.SEVERITY_ERROR;
		} else if ((problemStringIndex = line.indexOf(WARNING_STRING)) != -1) {
			messageIndex = problemStringIndex + WARNING_STRING.length();
			severity = IMarker.SEVERITY_WARNING;
		}
		if (severity != IMarker.SEVERITY_INFO) {
			result = new ProblemDescriptor();
			String info = line.substring(0, problemStringIndex);
			String[] sections = info.split(":", 4); //$NON-NLS-1$
			// File
			result.file = file;
			if ((sections.length >= 1) && (sections[0].length() > 0)) {
				IResource includedFile = file.getParent().findMember(sections[0]);
				if ((includedFile != null) && (includedFile instanceof IFile)) {
					result.file = (IFile)includedFile;
				}
			}
			// Severity
			result.severity = severity;
			// Message
			String message = line.substring(messageIndex);
			if (message.startsWith(PROBLEM_POSTFIX)) { // Fix messages starting with superfluous colon
				message = message.substring(PROBLEM_POSTFIX.length());
			}
			result.message = message;
			// Line number
			if (sections.length >= 2) {
				int lineNumber = Integer.parseInt(sections[1]) - 1;
				if (lineNumber < 0) {
					lineNumber = 0;
				}
				result.lineNumber = lineNumber;
				// Column number
				if (sections.length >= 3) {
					try {
						int columnNumber = Integer.parseInt(sections[2]);
						result.columnNumber = columnNumber;
					} catch (NumberFormatException e) {
						// No column number available
					}
				}
			}
		}
		return result;
	}

}
