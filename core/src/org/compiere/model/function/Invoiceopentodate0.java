package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Invoiceopentodate0 
{
 
@XendraFunction(Name="invoiceopentodate",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="2a2336c0-bfc6-5070-7532-cbfe31b918ca",
Arguments="p_c_invoice_id numeric, p_c_invoicepayschedule_id numeric, p_dateacct date",
Extension="",Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "2a2336c0-bfc6-5070-7532-cbfe31b918ca";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("v_Currency_ID  		numeric(10);");
	sb.appendln("v_TotalOpenAmt   	numeric := 0;");
	sb.appendln("v_WithholdingAmt	numeric := 0;");
	sb.appendln("v_PaidAmt           	numeric := 0;");
	sb.appendln("v_Remaining         	numeric := 0;");
	sb.appendln("v_MultiplierAP      	numeric := 0;");
	sb.appendln("v_MultiplierCM      	numeric := 0;");
	sb.appendln("v_Temp              	numeric := 0;");
	sb.appendln("v_Precision         	NUMERIC := 0;");
	sb.appendln("v_Min            	NUMERIC := 0;");
	sb.appendln("allocationline     	record;");
	sb.appendln("invoiceschedule     	record;");
	sb.appendln("v_InvoiceDate       	date;");
	sb.appendln("v_ConversionType    	numeric := 0;");
	sb.appendln("BEGIN");
	sb.appendln("-- Get Currency");
	sb.appendln("BEGIN");
	sb.appendln("  SELECT MAX(C_Currency_ID), ");
	sb.appendln("	 SUM(GrandTotal), ");
	sb.appendln("	 SUM(WithholdingAmt),");
	sb.appendln("	 MAX(MultiplierAP), ");
	sb.appendln("	 MAX(Multiplier),");
	sb.appendln("	 MAX(dateinvoiced),");
	sb.appendln("	 MAX(c_conversiontype_ID)");
	sb.appendln("	    INTO v_Currency_ID, v_TotalOpenAmt, v_WithholdingAmt, v_MultiplierAP, v_MultiplierCM,v_InvoiceDate,v_ConversionType");
	sb.appendln("  FROM C_Invoice_v  -- corrected for CM / Split Payment");
	sb.appendln("  WHERE C_Invoice_ID = p_C_Invoice_ID AND DateAcct <= p_DateAcct;   ");
	sb.appendln("EXCEPTION -- Invoice in draft form");
	sb.appendln("  WHEN OTHERS THEN");
	sb.appendln("            RAISE NOTICE 'InvoiceOpen - %',SQLERRM;");
	sb.appendln("   RETURN NULL;");
	sb.appendln("END;");
	sb.appendln("RAISE NOTICE '%', v_TotalOpenAmt ;");
	sb.appendln("SELECT StdPrecision");
	sb.appendln("    INTO v_Precision");
	sb.appendln("    FROM C_Currency");
	sb.appendln("    WHERE C_Currency_ID = v_Currency_ID;");
	sb.appendln("SELECT 1/10^v_Precision INTO v_Min;");
	sb.appendln("-- Calculate Allocated Amount");
	sb.appendln("FOR allocationline IN");
	sb.appendln("  SELECT a.AD_Client_ID, a.AD_Org_ID, al.Amount, al.WithholdingAmt, al.DiscountAmt, al.WriteOffAmt, al.C_Currency_ID, a.DateTrx");
	sb.appendln("  FROM C_ALLOCATIONLINE al");
	sb.appendln("          INNER JOIN C_ALLOCATIONHDR a ON (al.C_AllocationHdr_ID=a.C_AllocationHdr_ID)");
	sb.appendln("  WHERE al.C_Invoice_ID = p_C_Invoice_ID");
	sb.appendln("  AND a.DateAcct <= p_DateAcct");
	sb.appendln("  AND   a.IsActive='Y'");
	sb.appendln("LOOP");
	sb.appendln("  v_Temp := allocationline.Amount + allocationline.WithholdingAmt + allocationline.DisCountAmt + allocationline.WriteOffAmt;");
	sb.appendln("  v_PaidAmt := v_PaidAmt + Currencyconvert(v_Temp * v_MultiplierAP,");
	sb.appendln("				allocationline.C_Currency_ID, v_Currency_ID, v_InvoiceDate, ");
	sb.appendln("				v_ConversionType, allocationline.AD_Client_ID, allocationline.AD_Org_ID);");
	sb.appendln("END LOOP;");
	sb.appendln("    --  Do we have a Payment Schedule ?");
	sb.appendln("    IF (p_C_InvoicePaySchedule_ID > 0) THEN --   if not valid = lists invoice amount");
	sb.appendln("        v_Remaining := v_PaidAmt;");
	sb.appendln("        FOR invoiceschedule IN");
	sb.appendln("        SELECT  C_InvoicePaySchedule_ID, DueAmt FROM C_INVOICEPAYSCHEDULE WHERE C_Invoice_ID = p_C_Invoice_ID AND IsValid='Y'");
	sb.appendln("        ORDER BY DueDate");
	sb.appendln("        LOOP");
	sb.appendln("            IF (invoiceschedule.C_InvoicePaySchedule_ID = p_C_InvoicePaySchedule_ID) THEN");
	sb.appendln("                v_TotalOpenAmt := (invoiceschedule.DueAmt*v_MultiplierCM) - v_Remaining;");
	sb.appendln("                IF (invoiceschedule.DueAmt - v_Remaining < 0) THEN");
	sb.appendln("                    v_TotalOpenAmt := 0;");
	sb.appendln("                END IF;");
	sb.appendln("            ELSE -- calculate amount, which can be allocated to next schedule");
	sb.appendln("                v_Remaining := v_Remaining - invoiceschedule.DueAmt;");
	sb.appendln("                IF (v_Remaining < 0) THEN");
	sb.appendln("                    v_Remaining := 0;");
	sb.appendln("                END IF;");
	sb.appendln("            END IF;");
	sb.appendln("        END LOOP;");
	sb.appendln("    ELSE");
	sb.appendln("        v_TotalOpenAmt := v_TotalOpenAmt - v_PaidAmt;");
	sb.appendln("    END IF;");
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
	sb.appendln("@Identifier=2a2336c0-bfc6-5070-7532-cbfe31b918ca");
	return sb.toString();
}
}
