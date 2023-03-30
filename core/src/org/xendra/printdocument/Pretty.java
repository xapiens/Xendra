package org.xendra.printdocument;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.regex.Pattern;

import org.compiere.model.MClient;
import org.compiere.model.MCurrency;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.Language;

public class Pretty {
	static MClient c = MClient.get(Env.getCtx(), Env.getAD_Client_ID(Env.getCtx()));
	static MCurrency curr = MCurrency.get(Env.getCtx(), c.getC_Currency_ID());
	public static String right(String var, Integer len) {
		if (var == null)
			var = "";		
		if (var.length() > len) {
			var = var.substring(0, len);
		} else if (var.length() < len) {
			int t = len - var.length();
			String prevar = new String(new char[t]).replace("\0", " ");
			var = prevar + var;
		}
		return var;
	}

	public static String left(String var, Integer len) {
		if (var == null)
			var = "";		
		if (var.length() > len) {
			var = var.substring(0, len);
		} else if (var.length() < len) {
			int t = len - var.length();
			String prevar = new String(new char[t]).replace("\0", " ");
			var = var + prevar;
		}
		return var;
	}

	public static String format(String var) {
		Pattern isInteger = Pattern.compile("\\d+");
		java.util.regex.Matcher m = isInteger.matcher(var);
		if (m.find()) {
			Locale locc = Language.getLoginLanguage().getLocale();
			NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locc);
			numberFormat.setCurrency(Currency.getInstance(curr.getISO_Code()));
			var = numberFormat.format(Double.parseDouble(var));
		}
		return var;
	}
	
	public static String Amount(String var) {
		Pattern isInteger = Pattern.compile("\\d+");
		java.util.regex.Matcher m = isInteger.matcher(var);
		if (m.find()) {
			Double dvar = Double.parseDouble(var);
			var = DisplayType.getNumberFormat(DisplayType.Amount, Language.getLoginLanguage()).format(dvar);
		}
		return var;
	}

	public static String Qty(String var) {
		Pattern isInteger = Pattern.compile("\\d+");
		java.util.regex.Matcher m = isInteger.matcher(var);
		if (m.find()) {				
			Double dvar = Double.parseDouble(var);
			var = DisplayType.getNumberFormat(DisplayType.Quantity, Language.getLoginLanguage()).format(dvar);
		}
		return var;
	}
}
