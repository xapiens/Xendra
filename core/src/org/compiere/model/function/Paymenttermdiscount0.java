package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Paymenttermdiscount0 
{
 
@XendraFunction(Name="paymenttermdiscount",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="79d69e9a-3323-acd1-107f-71a4ac51f5ed",
Arguments="amount numeric, currency_id numeric, paymentterm_id numeric, docdate timestamp with time zone, paydate timestamp with time zone",
Extension="",Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "79d69e9a-3323-acd1-107f-71a4ac51f5ed";

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
	sb.appendln("* Title: Calculate Discount");
	sb.appendln("* Description:");
	sb.appendln("* Calculate the allowable Discount Amount of the Payment Term");
	sb.appendln("*");
	sb.appendln("* Test: SELECT paymenttermDiscount(110, 103, 106, now(), now()) FROM TEST; => 2.20");
	sb.appendln("************************************************************************/");
	sb.appendln("DECLARE");
	sb.appendln("Discount NUMERIC := 0;");
	sb.appendln("Discount1Date timestamp with time zone;");
	sb.appendln("Discount2Date timestamp with time zone;");
	sb.appendln("Add1Date NUMERIC := 0;");
	sb.appendln("Add2Date NUMERIC := 0;");
	sb.appendln("p   RECORD;");
	sb.appendln("BEGIN");
	sb.appendln("-- No Data - No Discount");
	sb.appendln("IF (Amount IS NULL OR PaymentTerm_ID IS NULL OR DocDate IS NULL) THEN");
	sb.appendln("RETURN 0;");
	sb.appendln("END IF;");
	sb.appendln("FOR p IN");
	sb.appendln("SELECT *");
	sb.appendln("FROM C_PaymentTerm");
	sb.appendln("WHERE C_PaymentTerm_ID = PaymentTerm_ID");
	sb.appendln("LOOP -- for convineance only");
	sb.appendln("Discount1Date := TRUNC(DocDate + p.DiscountDays + p.GraceDays);");
	sb.appendln("Discount2Date := TRUNC(DocDate + p.DiscountDays2 + p.GraceDays);");
	sb.appendln("-- Next Business Day");
	sb.appendln("IF (p.IsNextBusinessDay='Y') THEN");
	sb.appendln("Discount1Date := nextBusinessDay(Discount1Date, p.AD_Client_ID);");
	sb.appendln("Discount2Date := nextBusinessDay(Discount2Date, p.AD_Client_ID);");
	sb.appendln("END IF;");
	sb.appendln("-- Discount 1");
	sb.appendln("IF (Discount1Date >= TRUNC(PayDate)) THEN");
	sb.appendln("Discount := Amount * p.Discount / 100;");
	sb.appendln("-- Discount 2");
	sb.appendln("ELSIF (Discount2Date >= TRUNC(PayDate)) THEN");
	sb.appendln("Discount := Amount * p.Discount2 / 100;");
	sb.appendln("END IF;");
	sb.appendln("END LOOP;");
	sb.appendln("--");
	sb.appendln("    RETURN ROUND(COALESCE(Discount,0), 2); -- fixed rounding");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=79d69e9a-3323-acd1-107f-71a4ac51f5ed");
	return sb.toString();
}
}
