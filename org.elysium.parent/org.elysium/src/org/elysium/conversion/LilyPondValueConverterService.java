package org.elysium.conversion;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.impl.AbstractNullSafeConverter;
import org.eclipse.xtext.nodemodel.INode;

/**
 * Value converters for LilyPond literals.
 */
public class LilyPondValueConverterService extends DefaultTerminalConverters {

	private static final IValueConverter<Integer> INT_VALUE_CONVERTER = new org.eclipse.xtext.conversion.impl.INTValueConverter() {

		@Override
		public Integer toValue(String string, INode node) {
			try {
				return Integer.valueOf(string);
			} catch (NumberFormatException e) {
				return Integer.MAX_VALUE; // Fake max int for too large numbers
			}
		}

	};

	@Override
	public IValueConverter<Integer> INT() {
		return INT_VALUE_CONVERTER;
	}

	private static final AbstractNullSafeConverter<Boolean> BOOL_VALUE_CONVERTER = new AbstractNullSafeConverter<Boolean>() {

		public static final String FALSE = "#f"; //$NON-NLS-1$

		public static final String TRUE = "#t"; //$NON-NLS-1$

		@Override
		protected Boolean internalToValue(String string, INode node) {
			return string.equals(TRUE);
		}

		@Override
		protected String internalToString(Boolean value) {
			return (value ? TRUE : FALSE);
		}

	};

	@ValueConverter(rule = "SchemeBooleanValue")
	public IValueConverter<Boolean> BOOL() {
		return BOOL_VALUE_CONVERTER;
	}

}
