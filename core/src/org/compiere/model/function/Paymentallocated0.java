package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Paymentallocated0 
{
 
@XendraFunction(Name="paymentallocated",Output="numeric",Owner="postgres",Language="plpgsql",
Identifier="372617a6-7fa9-0017-1082-67372657f540",
Arguments="p_c_payment_id numeric, p_c_currency_id numeric",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "372617a6-7fa9-0017-1082-67372657f540";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("	v_AllocatedAmt 	NUMERIC := 0;");
	sb.appendln("	v_PayAmt        NUMERIC;");
	sb.appendln("	r   		RECORD;");
	sb.appendln("BEGIN");
	sb.appendln("    --  Charge - nothing available");
	sb.appendln("    SELECT");
	sb.appendln("      INTO v_PayAmt MAX(PayAmt)");
	sb.appendln("    FROM C_Payment");
	sb.appendln("    WHERE C_Payment_ID=p_C_Payment_ID AND C_Charge_ID > 0;");
	sb.appendln("    IF (v_PayAmt IS NOT NULL) THEN");
	sb.appendln("        RETURN v_PayAmt;");
	sb.appendln("    END IF;");
	sb.appendln("-- Calculate Allocated Amount");
	sb.appendln("FOR r IN");
	sb.appendln("SELECT a.AD_Client_ID, a.AD_Org_ID, al.Amount, al.WithholdingAmt, a.C_Currency_ID, a.DateTrx");
	sb.appendln("FROM C_AllocationLine al");
	sb.appendln("          INNER JOIN C_AllocationHdr a ON (al.C_AllocationHdr_ID=a.C_AllocationHdr_ID)");
	sb.appendln("WHERE al.C_Payment_ID = p_C_Payment_ID");
	sb.appendln("          AND   a.IsActive='Y'");
	sb.appendln("LOOP");
	sb.appendln("v_AllocatedAmt := v_AllocatedAmt");
	sb.appendln("+ currencyConvert(r.Amount + r.WithholdingAmt, r.C_Currency_ID, p_C_Currency_ID, r.DateTrx, null, r.AD_Client_ID, r.AD_Org_ID);");
	sb.appendln("END LOOP;");
	sb.appendln("-- Round to penny");
	sb.appendln("v_AllocatedAmt := ROUND(COALESCE(v_AllocatedAmt,0), 2);");
	sb.appendln("RETURN v_AllocatedAmt;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=372617a6-7fa9-0017-1082-67372657f540");
	return sb.toString();
}
}
