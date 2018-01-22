package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Paymenttermduedate1 
{
 
@XendraFunction(Name="paymenttermduedate",Output="timestamp with time zone",Owner="xendra",
Language="plpgsql",Identifier="9e79db09-4da6-0753-b54f-e5e743106dbb",
Arguments="paymentterm_id numeric, docdate timestamp with time zone",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "9e79db09-4da6-0753-b54f-e5e743106dbb";

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
	sb.appendln("* Title: Get Due timestamp with time zone");
	sb.appendln("* Description:");
	sb.appendln("* Returns the due timestamp with time zone");
	sb.appendln("* Test:");
	sb.appendln("* select paymenttermDueDate(106, now()) from Test; => now()+30 days");
	sb.appendln("************************************************************************/");
	sb.appendln("DECLARE");
	sb.appendln("Days NUMERIC := 0;");
	sb.appendln("DueDate timestamp with time zone := TRUNC(DocDate);");
	sb.appendln("--");
	sb.appendln("FirstDay timestamp with time zone;");
	sb.appendln("NoDays NUMERIC;");
	sb.appendln("p   RECORD;");
	sb.appendln("BEGIN");
	sb.appendln("FOR p IN");
	sb.appendln("SELECT *");
	sb.appendln("FROM C_PaymentTerm");
	sb.appendln("WHERE C_PaymentTerm_ID = PaymentTerm_ID");
	sb.appendln("LOOP -- for convineance only");
	sb.appendln("-- Due 15th of following month");
	sb.appendln("IF (p.IsDueFixed = 'Y') THEN");
	sb.appendln("FirstDay := TRUNC(DocDate, 'MM');");
	sb.appendln("NoDays := TRUNC(DocDate) - FirstDay;");
	sb.appendln("DueDate := FirstDay + (p.FixMonthDay-1); -- starting on 1st");
	sb.appendln("DueDate := ADD_MONTHS(DueDate, p.FixMonthOffset);");
	sb.appendln("IF (NoDays > p.FixMonthCutoff) THEN");
	sb.appendln("DueDate := ADD_MONTHS(DueDate, 1);");
	sb.appendln("END IF;");
	sb.appendln("ELSE");
	sb.appendln("DueDate := TRUNC(DocDate) + p.NetDays;");
	sb.appendln("END IF;");
	sb.appendln("END LOOP;");
	sb.appendln("RETURN DueDate;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=9e79db09-4da6-0753-b54f-e5e743106dbb");
	return sb.toString();
}
}
