package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Invoiceopentodate1 
{
 
@XendraFunction(Name="invoiceopentodate",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="0448d710-b382-bb84-43dc-bde5b749919f",
Arguments="p_c_invoice_id numeric, p_c_invoicepayschedule_id numeric, p_dateacct timestamp with time zone",
Extension="",Synchronized="2016-02-26 01:27:28.0")
	public static final String Identifier = "0448d710-b382-bb84-43dc-bde5b749919f";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("v_TotalOpenAmt   numeric := 0;");
	sb.appendln("BEGIN");
	sb.appendln("v_TotalOpenAmt := invoiceopentodate(p_c_invoice_id, p_c_invoicepayschedule_id, date(p_dateacct));");
	sb.appendln("RETURN v_TotalOpenAmt;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2016-02-26 01:27:28.0");
	sb.appendln("@Identifier=0448d710-b382-bb84-43dc-bde5b749919f");
	return sb.toString();
}
}
