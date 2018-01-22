package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Boeopen0 
{
 
@XendraFunction(Name="boeopen",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="f29ac8ec-c70e-370f-d439-d59cef75030a",Arguments="p_c_boe_id numeric",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "f29ac8ec-c70e-370f-d439-d59cef75030a";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("v_Currency_ID NUMERIC(10);");
	sb.appendln("v_IsRenewed CHARACTER(1);");
	sb.appendln("v_TotalOpenAmt  NUMERIC := 0;");
	sb.appendln("v_DateBOE TIMESTAMP;");
	sb.appendln("v_ISSoTrx CHARACTER(1);");
	sb.appendln("v_PaidAmt          NUMERIC := 0;");
	sb.appendln("v_Remaining         NUMERIC := 0;");
	sb.appendln("v_Factor NUMERIC := 0;");
	sb.appendln("    v_Temp              NUMERIC := 0;");
	sb.appendln("    v_Precision            NUMERIC := 0;");
	sb.appendln("    v_Min            NUMERIC := 0;");
	sb.appendln("    ar RECORD;");
	sb.appendln("    s RECORD;");
	sb.appendln("BEGIN");
	sb.appendln("SELECT MAX(DATEBOE),MAX(C_Currency_ID), SUM(GrandTotal),MAX(iSSotrx), MAX(isrenewed)");
	sb.appendln("INTO v_DateBOE, v_Currency_ID, v_TotalOpenAmt, v_ISSoTrx, v_IsRenewed");
	sb.appendln("FROM C_BOE -- corrected for CM / Split Payment");
	sb.appendln("WHERE C_BOE_ID = p_C_BOE_ID;");
	sb.appendln("if v_IsRenewed = 'Y' THEN");
	sb.appendln("	RETURN 0;");
	sb.appendln("END IF;");
	sb.appendln("SELECT CASE WHEN v_ISSoTrx = 'Y' THEN 1 ELSE -1 END INTO v_Factor;");
	sb.appendln("v_DateBOE := date_trunc( 'day', v_DateBOE );");
	sb.appendln("SELECT StdPrecision");
	sb.appendln("    INTO v_Precision");
	sb.appendln("    FROM C_Currency");
	sb.appendln("    WHERE C_Currency_ID = v_Currency_ID;");
	sb.appendln("SELECT 1/10^v_Precision INTO v_Min;");
	sb.appendln("-- Calculate Allocated Amount");
	sb.appendln("FOR ar IN");
	sb.appendln("SELECT a.AD_Client_ID, a.AD_Org_ID,");
	sb.appendln("al.Amount, al.DiscountAmt, al.WriteOffAmt,");
	sb.appendln("al.C_Currency_ID, a.DateTrx");
	sb.appendln("FROM C_AllocationLine al");
	sb.appendln("INNER JOIN C_AllocationHdr a ON (al.C_AllocationHdr_ID=a.C_AllocationHdr_ID)");
	sb.appendln("WHERE al.C_BOE_ID = p_C_BOE_ID AND date_trunc( 'day',a.DateTrx) >= date_trunc('day',v_DateBOE)");
	sb.appendln("          AND   a.IsActive='Y'");
	sb.appendln("LOOP");
	sb.appendln("v_Temp := ar.Amount + ar.DisCountAmt + ar.WriteOffAmt;");
	sb.appendln("v_PaidAmt := v_PaidAmt");
	sb.appendln("-- Allocation");
	sb.appendln("+ currencyConvert(v_Temp, ar.C_Currency_ID, v_Currency_ID, ar.DateTrx, null, ar.AD_Client_ID, ar.AD_Org_ID) * v_Factor;");
	sb.appendln("RAISE NOTICE '   PaidAmt=% , Allocation= % ', v_PaidAmt, v_Temp;");
	sb.appendln("END LOOP;");
	sb.appendln("v_TotalOpenAmt := v_TotalOpenAmt - v_PaidAmt;");
	sb.appendln("-- Ignore Rounding");
	sb.appendln("IF (v_TotalOpenAmt > -v_Min AND v_TotalOpenAmt < v_Min) THEN");
	sb.appendln("v_TotalOpenAmt := 0;");
	sb.appendln("END IF;");
	sb.appendln("-- Round to currency precision");
	sb.appendln("v_TotalOpenAmt := ROUND(COALESCE(v_TotalOpenAmt,0), v_Precision);");
	sb.appendln("RETURN v_TotalOpenAmt;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=f29ac8ec-c70e-370f-d439-d59cef75030a");
	sb.appendln("@*");
	sb.appendln("*");
	sb.appendln("* Test:");
	sb.appendln("* SELECT C_InvoicePaySchedule_ID, DueAmt FROM C_InvoicePaySchedule WHERE C_Invoice_ID=109 ORDER BY DueDate;");
	sb.appendln("* SELECT invoiceOpen (109, null) FROM AD_System; - converted to default client currency");
	sb.appendln("* SELECT invoiceOpen (109, 11) FROM AD_System;");
	return sb.toString();
}
}
