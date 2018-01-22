package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Invoicediscount0 
{
 
@XendraFunction(Name="invoicediscount",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="bbbb2718-ebfc-5d83-7d2c-ef3cacb0a5f9",
Arguments="p_c_invoice_id numeric, p_paydate timestamp with time zone, p_c_invoicepayschedule_id numeric",
Extension="",Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "bbbb2718-ebfc-5d83-7d2c-ef3cacb0a5f9";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("/*************************************************************************");
	sb.appendln("* The contents of this file are subject to the Compiere License.  You may");
	sb.appendln("* obtain a copy of the License at    http://www.compiere.org/license.html");
	sb.appendln("* Software is on an  \"AS IS\" basis,  WITHOUT WARRANTY OF ANY KIND, either");
	sb.appendln("* express or implied. See the License for details. Code: Compiere ERP+CRM");
	sb.appendln("* Copyright (C) 1999-2001 Jorg Janke, ComPiere, Inc. All Rights Reserved.");
	sb.appendln("*");
	sb.appendln("* converted to postgreSQL by Karsten Thiemann (Schaeffer AG),");
	sb.appendln("* kthiemann@xendra.org");
	sb.appendln("*************************************************************************");
	sb.appendln("***");
	sb.appendln("* Title: Calculate Payment Discount Amount");
	sb.appendln("* Description:");
	sb.appendln("* - Calculate discountable amount (i.e. with or without tax)");
	sb.appendln("* - Calculate and return payment discount");
	sb.appendln("* Test:");
	sb.appendln("* select invoiceDiscount(109, now(), 103) from ad_system; => 0");
	sb.appendln("************************************************************************/");
	sb.appendln("DECLARE");
	sb.appendln("v_Amount NUMERIC;");
	sb.appendln("v_IsDiscountLineAmt CHAR(1);");
	sb.appendln("v_GrandTotal NUMERIC;");
	sb.appendln("v_TotalLines NUMERIC;");
	sb.appendln("v_C_PaymentTerm_ID NUMERIC(10);");
	sb.appendln("v_DocDate timestamp with time zone;");
	sb.appendln("v_PayDate timestamp with time zone := now();");
	sb.appendln("    v_IsPayScheduleValid    CHAR(1);");
	sb.appendln("BEGIN");
	sb.appendln("SELECT ci.IsDiscountLineAmt, i.GrandTotal, i.TotalLines,");
	sb.appendln("i.C_PaymentTerm_ID, i.DateInvoiced, i.IsPayScheduleValid");
	sb.appendln("INTO v_IsDiscountLineAmt, v_GrandTotal, v_TotalLines,");
	sb.appendln("v_C_PaymentTerm_ID, v_DocDate, v_IsPayScheduleValid");
	sb.appendln("FROM AD_ClientInfo ci, C_Invoice i");
	sb.appendln("WHERE ci.AD_Client_ID=i.AD_Client_ID");
	sb.appendln("  AND i.C_Invoice_ID=p_C_Invoice_ID;");
	sb.appendln("-- What Amount is the Discount Base?");
	sb.appendln("IF (v_IsDiscountLineAmt = 'Y') THEN");
	sb.appendln("v_Amount := v_TotalLines;");
	sb.appendln("ELSE");
	sb.appendln("v_Amount := v_GrandTotal;");
	sb.appendln("END IF;");
	sb.appendln("-- Anything to discount?");
	sb.appendln("IF (v_Amount = 0) THEN");
	sb.appendln("RETURN 0;");
	sb.appendln("   END IF;");
	sb.appendln("IF (p_PayDate IS NOT NULL) THEN");
	sb.appendln("v_PayDate := p_PayDate;");
	sb.appendln("  END IF;");
	sb.appendln("    --  Valid Payment Schedule");
	sb.appendln("    IF (v_IsPayScheduleValid='Y' AND p_C_InvoicePaySchedule_ID > 0) THEN");
	sb.appendln("        SELECT COALESCE(MAX(DiscountAmt),0)");
	sb.appendln("          INTO v_Amount");
	sb.appendln("        FROM C_InvoicePaySchedule");
	sb.appendln("        WHERE C_InvoicePaySchedule_ID=p_C_InvoicePaySchedule_ID");
	sb.appendln("          AND DiscountDate <= v_PayDate;");
	sb.appendln("        --");
	sb.appendln("        RETURN v_Amount;");
	sb.appendln("    END IF;");
	sb.appendln("-- return discount amount");
	sb.appendln("RETURN paymentTermDiscount (v_Amount, 0, v_C_PaymentTerm_ID, v_DocDate, p_PayDate);");
	sb.appendln("-- Most likely if invoice not found");
	sb.appendln("EXCEPTION");
	sb.appendln("WHEN OTHERS THEN");
	sb.appendln("RETURN NULL;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=bbbb2718-ebfc-5d83-7d2c-ef3cacb0a5f9");
	return sb.toString();
}
}
