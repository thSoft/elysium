package org.elysium.conversion;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;

public class LilyPondStringValueConverter implements IValueConverter<String> {

	@Override
	public String toValue(String string, INode node) throws ValueConverterException {
		if(string != null && string.length() > 1) {
			return string.substring(1, string.length()-1).replace("\\\"", "\"");
		}
		return null;
	}

	@Override
	public String toString(String value) throws ValueConverterException {
		if(value != null) {
			return "\""+value.replace("\"", "\\\"")+"\"";
		}else{
			return null;
		}
	}
}
