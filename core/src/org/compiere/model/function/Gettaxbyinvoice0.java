package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Gettaxbyinvoice0 
{
 
@XendraFunction(Name="gettaxbyinvoice",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="399b33d0-9ab6-c781-7e9a-fac5d21c0f2b",Arguments="pc_invoice_id numeric",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "399b33d0-9ab6-c781-7e9a-fac5d21c0f2b";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("v_taxamt NUMERIC;");
	sb.appendln("BEGIN");
	sb.appendln("SELECT  ");
	sb.appendln("        CASE");
	sb.appendln("            WHEN it.istaxincluded = 'Y'::bpchar THEN NULL::numeric");
	sb.appendln("            ELSE it.taxamt");
	sb.appendln("        END AS tax INTO v_taxamt");
	sb.appendln("FROM xendra.c_invoicetax it");
	sb.appendln("JOIN xendra.c_tax t ON it.c_tax_id = t.c_tax_id WHERE it.c_invoice_id = pc_invoice_id;");
	sb.appendln("RETURN v_taxamt;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=399b33d0-9ab6-c781-7e9a-fac5d21c0f2b");
	return sb.toString();
}
}
