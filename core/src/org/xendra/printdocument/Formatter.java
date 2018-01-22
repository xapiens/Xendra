package org.xendra.printdocument;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.NumberFormat;

import org.compiere.util.DisplayType;
import org.compiere.util.Util;

public class Formatter {
	public static final String FIELDALIGNMENTTYPE_Default = "D";
	/** Leading (left) = L */
	public static final String FIELDALIGNMENTTYPE_LeadingLeft = "L";
	/** Trailing (right) = T */
	public static final String FIELDALIGNMENTTYPE_TrailingRight = "T";
	/** Block = B */
	public static final String FIELDALIGNMENTTYPE_Block = "B";
	/** Center = C */
	public static final String FIELDALIGNMENTTYPE_Center = "C";
	
	DecimalFormat m_amtFormat = DisplayType.getNumberFormat(DisplayType.Amount);
	DecimalFormat m_qtyFormat = DisplayType.getNumberFormat(DisplayType.Quantity);
	public String pad2(String string, int width){
		if (string.length() >= width) {
			return string.substring(0, width);
		}
		StringBuffer output = new StringBuffer(string);
		for (int i = 0; i < (width - string.length()); i++) {
			output.append(' ');
		}
		return output.toString();
	}
	public String pad(String string, int width) {
		if (string == null)
			string = "";
		return Util.pad(string, width, null, ' ' );
	}
	public String amt(String amount)
	{
		if (amount == null)
			amount = "0";
		return m_amtFormat.format(new BigDecimal(amount));
	}
	public String amt(String amount, int width) 
	{
		return Util.pad(amt(amount), width, FIELDALIGNMENTTYPE_TrailingRight, ' ');
	}
	public String qty(String qty)
	{
		if (qty == null)
			qty = "0";
		return m_qtyFormat.format(new BigDecimal(qty));
	}
	public String qty(String qty, int width)
	{
		return Util.pad(qty(qty), width, FIELDALIGNMENTTYPE_TrailingRight, ' ');		
	}
}
