package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Invoiceadvanceopen0 
{
 
@XendraFunction(Name="invoiceadvanceopen",Output="setof record",Owner="xendra",Language="plpgsql",
Identifier="ace9076e-0d66-2062-d630-9bbc0c743d27",
Arguments="p_bpartner_id numeric, p_c_currency_id numeric, OUT c_invoice_id numeric, OUT available numeric",
Extension="",Synchronized="2017-06-26 11:11:28.0")
	public static final String Identifier = "ace9076e-0d66-2062-d630-9bbc0c743d27";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("	AR RECORD;");
	sb.appendln("BEGIN");
	sb.appendln("	FOR ar in SELECT advance.c_invoice_id, ");
	sb.appendln("			sum(advance.total)-sum(advance.used) as available from ");
	sb.appendln("			C_INVOICE_ADVANCE advance where advance.c_bpartner_id = p_bpartner_id ");
	sb.appendln("			AND c_currency_id = p_c_currency_id");
	sb.appendln("			group by advance.c_invoice_id ");
	sb.appendln("	LOOP");
	sb.appendln("	IF ar.available > 0 THEN");
	sb.appendln("	 c_invoice_id := ar.c_invoice_id;");
	sb.appendln("	 available := ar.available;");
	sb.appendln("	 return next;");
	sb.appendln("	END IF;");
	sb.appendln("	END LOOP;");
	sb.appendln("	return;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2017-06-26 11:11:28.0");
	sb.appendln("@Identifier=ace9076e-0d66-2062-d630-9bbc0c743d27");
	return sb.toString();
}
}
