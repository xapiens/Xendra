package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Boeallocation0 
{
 
@XendraFunction(Name="boeallocation",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="19b68d5d-6703-f4a8-3ddc-528a90b48c74",Arguments="p_c_boe_id numeric",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "19b68d5d-6703-f4a8-3ddc-528a90b48c74";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("v_Currency_ID NUMERIC(10);");
	sb.appendln("v_DateBOE TIMESTAMP;");
	sb.appendln("v_ISSoTrx CHARACTER(1);");
	sb.appendln("v_Temp NUMERIC := 0;");
	sb.appendln("v_PaidAmt       NUMERIC := 0;");
	sb.appendln("v_Remaining     NUMERIC := 0;");
	sb.appendln("v_Factor NUMERIC := 0;");
	sb.appendln("    v_Precision  NUMERIC := 0;");
	sb.appendln("    v_Min        NUMERIC := 0;");
	sb.appendln("    ar RECORD;");
	sb.appendln("    s RECORD;");
	sb.appendln("BEGIN");
	sb.appendln("SELECT MAX(DATEBOE),MAX(C_Currency_ID), MAX(iSSotrx)");
	sb.appendln("INTO v_DateBOE, v_Currency_ID, v_ISSoTrx");
	sb.appendln("FROM C_BOE -- corrected for CM / Split Payment");
	sb.appendln("WHERE C_BOE_ID = p_C_BOE_ID;");
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
	sb.appendln("a.C_Currency_ID, a.DateTrx");
	sb.appendln("FROM C_AllocationLine al");
	sb.appendln("INNER JOIN C_AllocationHdr a ON (al.C_AllocationHdr_ID=a.C_AllocationHdr_ID)");
	sb.appendln("WHERE al.C_BOE_ID = p_C_BOE_ID AND date_trunc( 'day',a.DateTrx) >= v_DateBOE");
	sb.appendln("          AND   a.IsActive='Y'");
	sb.appendln("LOOP");
	sb.appendln("v_Temp := ar.Amount + ar.DiscountAmt + ar.WriteOffAmt;");
	sb.appendln("v_PaidAmt := v_PaidAmt");
	sb.appendln("-- Allocation");
	sb.appendln("+ currencyConvert(v_Temp, ar.C_Currency_ID, v_Currency_ID, ar.DateTrx, null, ar.AD_Client_ID, ar.AD_Org_ID) * v_Factor;");
	sb.appendln("RAISE NOTICE '   PaidAmt=% , Allocation= % ', v_PaidAmt, v_Temp;");
	sb.appendln("END LOOP;");
	sb.appendln("-- Ignore Rounding");
	sb.appendln("IF (v_PaidAmt > -v_Min AND v_PaidAmt < v_Min) THEN");
	sb.appendln("v_PaidAmt := 0;");
	sb.appendln("END IF;");
	sb.appendln("-- Round to currency precision");
	sb.appendln("v_PaidAmt := ROUND(COALESCE(v_PaidAmt,0), v_Precision);");
	sb.appendln("RETURN v_PaidAmt;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=19b68d5d-6703-f4a8-3ddc-528a90b48c74");
	return sb.toString();
}
}
