package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Invoiceopen0 
{
 
@XendraFunction(Name="invoiceopen",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="8f040e25-c89d-155d-78ea-a157b6446fdf",
Arguments="p_c_invoice_id numeric, p_c_invoicepayschedule_id numeric",Extension="",
Synchronized="2017-01-17 15:53:28.0")
	public static final String Identifier = "8f040e25-c89d-155d-78ea-a157b6446fdf";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("    v_Currency_ID 	NUMERIC(10);");
	sb.appendln("    v_TotalOpenAmt  	NUMERIC := 0;");
	sb.appendln("    v_WithholdingAmt	NUMERIC := 0;");
	sb.appendln("    v_PaidAmt          	NUMERIC := 0;");
	sb.appendln("    v_Remaining         NUMERIC := 0;");
	sb.appendln("    v_MultiplierAP      NUMERIC := 0;");
	sb.appendln("    v_MultiplierCM      NUMERIC := 0;");
	sb.appendln("    v_Temp              NUMERIC := 0;");
	sb.appendln("    v_Precision         NUMERIC := 0;");
	sb.appendln("    v_Min            	NUMERIC := 0;");
	sb.appendln("    ar RECORD;");
	sb.appendln("    s RECORD;");
	sb.appendln("    v_InvoiceDate       date;");
	sb.appendln("    v_ConversionType    numeric := 0;");
	sb.appendln("    _count		INTEGER := 0;");
	sb.appendln("BEGIN");
	sb.appendln("-- Get Currency");
	sb.appendln("BEGIN");
	sb.appendln("SELECT COUNT(*) INTO _count FROM C_INVOICE WHERE C_Invoice_ID = p_C_Invoice_ID and docstatus != 'VO';");
	sb.appendln("IF (_count = 0) then");
	sb.appendln("  RETURN NULL;");
	sb.appendln("END IF;");
	sb.appendln("SELECT MAX(C_Currency_ID), SUM(GrandTotal), SUM(WithholdingAmt), MAX(MultiplierAP), MAX(Multiplier),MAX(dateinvoiced),MAX(c_conversiontype_ID)");
	sb.appendln("INTO v_Currency_ID, v_TotalOpenAmt, v_WithholdingAmt, v_MultiplierAP, v_MultiplierCM,v_InvoiceDate,v_ConversionType");
	sb.appendln("FROM C_Invoice_v -- corrected for CM / Split Payment");
	sb.appendln("WHERE C_Invoice_ID = p_C_Invoice_ID;");
	sb.appendln("EXCEPTION -- Invoice in draft form");
	sb.appendln("WHEN OTHERS THEN");
	sb.appendln("            RAISE NOTICE 'InvoiceOpen - %', SQLERRM;");
	sb.appendln("RETURN NULL;");
	sb.appendln("END;");
	sb.appendln("v_TotalOpenAmt := v_TotalOpenAmt + v_WithholdingAmt;");
	sb.appendln("SELECT StdPrecision");
	sb.appendln("    INTO v_Precision");
	sb.appendln("    FROM C_Currency");
	sb.appendln("    WHERE C_Currency_ID = v_Currency_ID;");
	sb.appendln("SELECT 1/10^v_Precision INTO v_Min;");
	sb.appendln("-- Calculate Allocated Amount");
	sb.appendln("FOR ar IN");
	sb.appendln("SELECT a.AD_Client_ID, a.AD_Org_ID,al.Amount, al.DiscountAmt, al.WithholdingAmt, al.WriteOffAmt,al.C_Currency_ID, a.DateTrx");
	sb.appendln("	FROM C_AllocationLine al INNER JOIN C_AllocationHdr a ON (al.C_AllocationHdr_ID=a.C_AllocationHdr_ID)");
	sb.appendln("	WHERE al.C_Invoice_ID = p_C_Invoice_ID");
	sb.appendln("        AND   a.IsActive='Y'");
	sb.appendln("LOOP");
	sb.appendln("        v_Temp := ar.Amount + ar.WithholdingAmt + ar.DisCountAmt + ar.WriteOffAmt;                ");
	sb.appendln("		v_PaidAmt := v_PaidAmt");
	sb.appendln("		+ currencyConvert(v_Temp * v_MultiplierAP,");
	sb.appendln("		ar.C_Currency_ID, v_Currency_ID, v_InvoiceDate, v_ConversionType, ar.AD_Client_ID, ar.AD_Org_ID);");
	sb.appendln("      RAISE NOTICE '   PaidAmt=% , Allocation= % * %', v_PaidAmt, v_Temp, v_MultiplierAP;");
	sb.appendln("END LOOP;");
	sb.appendln("    --  Do we have a Payment Schedule ?");
	sb.appendln("    IF (p_C_InvoicePaySchedule_ID > 0) THEN --   if not valid = lists invoice amount");
	sb.appendln("        v_Remaining := v_PaidAmt;");
	sb.appendln("        FOR s IN SELECT  C_InvoicePaySchedule_ID, DueAmt");
	sb.appendln("        FROM    C_InvoicePaySchedule WHERE C_Invoice_ID = p_C_Invoice_ID");
	sb.appendln("        AND   IsValid='Y'");
	sb.appendln("        ORDER BY DueDate");
	sb.appendln("        LOOP");
	sb.appendln("            IF (s.C_InvoicePaySchedule_ID = p_C_InvoicePaySchedule_ID) THEN");
	sb.appendln("                v_TotalOpenAmt := (s.DueAmt*v_MultiplierCM) - v_Remaining;");
	sb.appendln("                IF (s.DueAmt - v_Remaining < 0) THEN");
	sb.appendln("                    v_TotalOpenAmt := 0;");
	sb.appendln("                END IF;");
	sb.appendln("            ELSE -- calculate amount, which can be allocated to next schedule");
	sb.appendln("                v_Remaining := v_Remaining - s.DueAmt;");
	sb.appendln("                IF (v_Remaining < 0) THEN");
	sb.appendln("                    v_Remaining := 0;");
	sb.appendln("                END IF;");
	sb.appendln("            END IF;");
	sb.appendln("        END LOOP;");
	sb.appendln("    ELSE");
	sb.appendln("        v_TotalOpenAmt := v_TotalOpenAmt - v_PaidAmt;");
	sb.appendln("    END IF;");
	sb.appendln("--  RAISE NOTICE ''== Total='' || v_TotalOpenAmt;");
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
 	sb.appendln("@Synchronized=2017-01-17 15:53:28.0");
	sb.appendln("@Identifier=8f040e25-c89d-155d-78ea-a157b6446fdf");
	sb.appendln("@comment=xendra.org");
	sb.appendln("*");
	sb.appendln("* Title: Calculate Open Item Amount in Invoice Currency");
	sb.appendln("* Description:");
	sb.appendln("* Add up total amount open for C_Invoice_ID if no split payment.");
	sb.appendln("*  Grand Total minus Sum of Al");
	sb.appendln("* Add exception for void documents 17/01/2017");
	return sb.toString();
}
}
