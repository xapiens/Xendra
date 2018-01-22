package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Invoicepaid0 
{
 
@XendraFunction(Name="invoicepaid",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="5df274a3-b1e5-8572-af82-25404b7ffeab",
Arguments="p_c_invoice_id numeric, p_c_currency_id numeric, p_multiplierap numeric",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "5df274a3-b1e5-8572-af82-25404b7ffeab";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("v_MultiplierAP 	NUMERIC := 1;");
	sb.appendln("v_PaymentAmt 	NUMERIC := 0;");
	sb.appendln("v_Precision 	NUMERIC := 0;");
	sb.appendln("ar RECORD;");
	sb.appendln("BEGIN");
	sb.appendln("-- Default");
	sb.appendln("IF (p_MultiplierAP IS NOT NULL) THEN");
	sb.appendln("v_MultiplierAP := p_MultiplierAP;");
	sb.appendln("END IF;");
	sb.appendln("SELECT StdPrecision");
	sb.appendln("    INTO v_Precision");
	sb.appendln("    FROM C_Currency");
	sb.appendln("    WHERE C_Currency_ID = p_c_currency_id;");
	sb.appendln("-- Calculate Allocated Amount");
	sb.appendln("FOR ar IN");
	sb.appendln("SELECT a.AD_Client_ID, a.AD_Org_ID, al.Amount, al.WithholdingAmt, al.DiscountAmt, al.WriteOffAmt,al.C_Currency_ID, a.DateTrx");
	sb.appendln("FROM C_AllocationLine al");
	sb.appendln("INNER JOIN C_AllocationHdr a ON (al.C_AllocationHdr_ID=a.C_AllocationHdr_ID)");
	sb.appendln("WHERE al.C_Invoice_ID = p_C_Invoice_ID AND   a.IsActive='Y'");
	sb.appendln("LOOP");
	sb.appendln("v_PaymentAmt := v_PaymentAmt");
	sb.appendln("+ currencyConvert(ar.Amount + ar.WithholdingAmt + ar.DisCountAmt + ar.WriteOffAmt,");
	sb.appendln("ar.C_Currency_ID, p_C_Currency_ID, ar.DateTrx, null, ar.AD_Client_ID, ar.AD_Org_ID);");
	sb.appendln("END LOOP;");
	sb.appendln("--");
	sb.appendln("RETURN ROUND(COALESCE(v_PaymentAmt,0), v_Precision) * v_MultiplierAP;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=5df274a3-b1e5-8572-af82-25404b7ffeab");
	return sb.toString();
}
}
