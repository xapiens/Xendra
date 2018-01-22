package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Paymentavailable0 
{
 
@XendraFunction(Name="paymentavailable",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="cfeb7d88-79b1-0195-debe-c75c0ccfaf94",Arguments="p_c_payment_id numeric",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "cfeb7d88-79b1-0195-debe-c75c0ccfaf94";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("/*************************************************************************");
	sb.appendln(" * The contents of this file are subject to the Compiere License.  You may");
	sb.appendln(" * obtain a copy of the License at    http://www.compiere.org/license.html");
	sb.appendln(" * Software is on an  \"AS IS\" basis,  WITHOUT WARRANTY OF ANY KIND, either");
	sb.appendln(" * express or implied. See the License for details. Code: Compiere ERP+CRM");
	sb.appendln(" * Copyright (C) 1999-2001 Jorg Janke, ComPiere, Inc. All Rights Reserved.");
	sb.appendln(" *");
	sb.appendln(" * converted to postgreSQL by Karsten Thiemann (Schaeffer AG),");
	sb.appendln(" * kthiemann@adempiere.org");
	sb.appendln(" * fixed calculation by xapiens");
	sb.appendln(" *************************************************************************");
	sb.appendln(" * Title:    Calculate Available Payment Amount in Payment Currency");
	sb.appendln(" * Description:");
	sb.appendln(" *        similar to C_Invoice_Open");
	sb.appendln(" ************************************************************************/");
	sb.appendln("DECLARE");
	sb.appendln("    v_Currency_ID       NUMERIC(10);");
	sb.appendln("    v_AvailableAmt      NUMERIC := 0;");
	sb.appendln("    v_IsReceipt         xendra.C_Payment.IsReceipt%TYPE;");
	sb.appendln("    v_Amt               NUMERIC := 0;");
	sb.appendln("    r               	RECORD;");
	sb.appendln("BEGIN");
	sb.appendln("    --  Charge - fully allocated");
	sb.appendln("    SELECT MAX(PayAmt)");
	sb.appendln("      INTO v_Amt");
	sb.appendln("    FROM C_Payment");
	sb.appendln("    WHERE C_Payment_ID=p_C_Payment_ID AND C_Charge_ID > 0;");
	sb.appendln("    IF (v_Amt IS NOT NULL) THEN");
	sb.appendln("        RETURN 0;");
	sb.appendln("    END IF;");
	sb.appendln("    --    Get Currency");
	sb.appendln("    SELECT    C_Currency_ID, PayAmt, IsReceipt");
	sb.appendln("      INTO    v_Currency_ID, v_AvailableAmt, v_IsReceipt");
	sb.appendln("    FROM    xendra.C_Payment_v     -- corrected for AP/AR");
	sb.appendln("    WHERE    C_Payment_ID = p_C_Payment_ID;");
	sb.appendln("    --    Calculate Allocated Amount");
	sb.appendln("    FOR r IN");
	sb.appendln("        SELECT a.AD_Client_ID, p.c_ConversionType_ID, a.AD_Org_ID, al.Amount, al.WithholdingAmt, a.C_Currency_ID, a.DateTrx");
	sb.appendln("        FROM    xendra.C_AllocationLine al");
	sb.appendln("            INNER JOIN xendra.C_AllocationHdr a ON (al.C_AllocationHdr_ID=a.C_AllocationHdr_ID)");
	sb.appendln("            INNER JOIN xendra.C_Payment p ON (al.C_Payment_ID = p.C_Payment_ID)");
	sb.appendln("        WHERE    al.C_Payment_ID = p_C_Payment_ID");
	sb.appendln("              AND   a.IsActive='Y'");
	sb.appendln("    LOOP");
	sb.appendln("        v_Amt := currencyConvert(r.Amount+r.WithholdingAmt, r.C_Currency_ID, v_Currency_ID, r.DateTrx, r.C_ConversionType_ID, r.AD_Client_ID, r.AD_Org_ID);");
	sb.appendln("        v_AvailableAmt := v_AvailableAmt - v_Amt;");
	sb.appendln("    END LOOP;");
	sb.appendln("    --    Ignore Rounding");
	sb.appendln("    IF (v_AvailableAmt BETWEEN -0.01 AND 0.01) THEN");
	sb.appendln("        v_AvailableAmt := 0;");
	sb.appendln("    END IF;");
	sb.appendln("    --    Round to penny");
	sb.appendln("    v_AvailableAmt := ROUND(COALESCE(v_AvailableAmt,0), 2);");
	sb.appendln("    RETURN    v_AvailableAmt;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=cfeb7d88-79b1-0195-debe-c75c0ccfaf94");
	return sb.toString();
}
}
