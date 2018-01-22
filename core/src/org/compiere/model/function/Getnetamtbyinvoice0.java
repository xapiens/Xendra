package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Getnetamtbyinvoice0 
{
 
@XendraFunction(Name="getnetamtbyinvoice",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="bfd9c244-a10a-7974-92e1-7a8a3e477f28",Arguments="pc_invoice_id numeric",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "bfd9c244-a10a-7974-92e1-7a8a3e477f28";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("v_linenetamt NUMERIC;");
	sb.appendln("BEGIN");
	sb.appendln("-- Try to get price from PriceList directly");
	sb.appendln("SELECT COALESCE(SUM(c_invoice_line_v.linenetamt),0)");
	sb.appendln("INTO v_linenetamt");
	sb.appendln("FROM c_invoice_line_v WHERE c_invoice_line_v.c_invoice_id = pc_invoice_id;");
	sb.appendln("--");
	sb.appendln("RETURN v_linenetamt;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=bfd9c244-a10a-7974-92e1-7a8a3e477f28");
	return sb.toString();
}
}
