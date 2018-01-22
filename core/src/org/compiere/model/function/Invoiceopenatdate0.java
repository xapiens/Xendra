package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Invoiceopenatdate0 
{
 
@XendraFunction(Name="invoiceopenatdate",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="2d1cf912-9886-e563-40bc-890a7d67373b",
Arguments="p_c_invoice_id numeric, p_c_invoicepayschedule_id numeric, p_dateacct date",
Extension="",Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "2d1cf912-9886-e563-40bc-890a7d67373b";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("v_TotalOpenAmt      numeric := 0;");
	sb.appendln("BEGIN");
	sb.appendln("v_TotalOpenAmt := xendra.invoiceopentodate(p_c_invoice_id, p_c_invoicepayschedule_id, p_dateacct);");
	sb.appendln("RETURN v_TotalOpenAmt;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=2d1cf912-9886-e563-40bc-890a7d67373b");
	return sb.toString();
}
}
