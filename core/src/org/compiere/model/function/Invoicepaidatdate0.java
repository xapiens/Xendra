package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Invoicepaidatdate0 
{
 
@XendraFunction(Name="invoicepaidatdate",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="30c00bc8-85b1-f7ae-4b22-69dbc46595e1",
Arguments="p_c_invoice_id numeric, p_c_currency_id numeric, p_multiplierap numeric, p_statementdate timestamp without time zone",
Extension="",Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "30c00bc8-85b1-f7ae-4b22-69dbc46595e1";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("  DECLARE");
	sb.appendln("v_StatementDate timestamp without time zone := now();");
	sb.appendln("v_MultiplierAP numeric := 1;");
	sb.appendln("v_paymentamount numeric;");
	sb.appendln("  BEGIN");
	sb.appendln("    IF (p_StatementDate IS NOT NULL) THEN");
	sb.appendln("v_StatementDate := p_StatementDate;   ");
	sb.appendln("    END IF;");
	sb.appendln("    --Invalid Parameters");
	sb.appendln("    IF (p_C_Invoice_ID IS NULL OR p_C_Invoice_ID = 0  OR p_C_Currency_ID IS NULL OR p_C_Currency_ID = 0 ) THEN");
	sb.appendln("       return null;                    ");
	sb.appendln("    END IF;");
	sb.appendln("    IF (p_multiplierap IS NOT NULL AND p_multiplierap != 0) THEN");
	sb.appendln("       v_MultiplierAP := p_multiplierap;");
	sb.appendln("    END IF;");
	sb.appendln("    v_paymentamount = allocatedamtatdate(p_C_Invoice_ID, p_C_Currency_ID, 1::numeric, v_MultiplierAP, v_StatementDate);");
	sb.appendln("    RETURN v_paymentamount;");
	sb.appendln(" END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=30c00bc8-85b1-f7ae-4b22-69dbc46595e1");
	return sb.toString();
}
}
