package org.compiere.util;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.jdom.Element;

public class JDom {
	public static int getattrInt(Element element, String columnID) {		
		String value = element.getAttributeValue(columnID);
		int intvalue = Integer.valueOf(value);
		return intvalue;
	}
	public static String getattrStr(Element element, String columnID) {
		String value = element.getAttributeValue(columnID);
		if (value == null)
			value = "";
		return value;
	}
	public static Boolean getattrBool(Element element, String columnID) {
		String value = element.getAttributeValue(columnID);
		return value.equals("Y") ? true : false;
	}
	public static Timestamp getattrTs(Element element, String columnID) {
		Timestamp retvalue = null;
		String srcvalue = element.getAttributeValue(columnID);
		if (srcvalue.length() > 0)
			retvalue = Timestamp.valueOf(srcvalue);
		
		return retvalue;
	}
	public static BigDecimal getattrBD(Element element, String columnID) {
		BigDecimal retvalue = Env.ZERO; 
		String srcvalue = element.getAttributeValue(columnID);
		if ( srcvalue.length() > 0 )
			retvalue = new BigDecimal(srcvalue);
		return retvalue;
	}
}