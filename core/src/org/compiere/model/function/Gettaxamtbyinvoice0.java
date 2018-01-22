package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Gettaxamtbyinvoice0 
{
 
@XendraFunction(Name="gettaxamtbyinvoice",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="659fbce8-d772-f602-7193-eefe3a4fae64",
Arguments="ptaxid character varying, pc_invoice_id numeric",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "659fbce8-d772-f602-7193-eefe3a4fae64";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("v_taxamt NUMERIC;");
	sb.appendln("BEGIN");
	sb.appendln("SELECT  tax.taxamt INTO v_taxamt FROM c_invoicetax tax RIGHT JOIN c_tax tx on tx.c_tax_id = tax.c_tax_id where  tx.taxalias=ptaxid AND tax.c_invoice_id = pc_invoice_id;");
	sb.appendln("--");
	sb.appendln("RETURN COALESCE(v_taxamt,0);");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=659fbce8-d772-f602-7193-eefe3a4fae64");
	return sb.toString();
}
}
