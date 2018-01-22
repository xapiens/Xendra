package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Gettaxbaseamtbyinvoice0 
{
 
@XendraFunction(Name="gettaxbaseamtbyinvoice",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="1b5ef2a5-19e0-fd0b-21d7-8fc028012a4d",
Arguments="ptaxid character varying, pc_invoice_id numeric",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "1b5ef2a5-19e0-fd0b-21d7-8fc028012a4d";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("v_taxbaseamt NUMERIC;");
	sb.appendln("BEGIN");
	sb.appendln("SELECT  tax.taxbaseamt INTO v_taxbaseamt FROM c_invoicetax tax RIGHT JOIN c_tax tx on tx.c_tax_id = tax.c_tax_id where  tx.taxalias=ptaxid AND tax.c_invoice_id = pc_invoice_id;");
	sb.appendln("--");
	sb.appendln("RETURN COALESCE(v_taxbaseamt,0);");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=1b5ef2a5-19e0-fd0b-21d7-8fc028012a4d");
	return sb.toString();
}
}
