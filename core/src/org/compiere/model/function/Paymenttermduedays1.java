package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Paymenttermduedays1 
{
 
@XendraFunction(Name="paymenttermduedays",Output="integer",Owner="xendra",Language="plpgsql",
Identifier="b25598f9-9407-30ec-f68a-64fe955da750",
Arguments="paymentterm_id numeric, docdate timestamp with time zone, paydate timestamp with time zone",
Extension="",Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "b25598f9-9407-30ec-f68a-64fe955da750";

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
	sb.appendln("* Title: Get Due Days");
	sb.appendln("* Description:");
	sb.appendln("* Returns the days due (positive) or the days till due (negative)");
	sb.appendln("* Grace days are not considered!");
	sb.appendln("* If record is not found it assumes due immediately");
	sb.appendln("*");
	sb.appendln("* Test: SELECT paymenttermDueDays(103, now(), now());");
	sb.appendln("*");
	sb.appendln("* Contributor(s): Carlos Ruiz - globalqss - match with SQLJ version");
	sb.appendln("************************************************************************/");
	sb.appendln("DECLARE");
	sb.appendln("Days 		NUMERIC := 0;");
	sb.appendln("DueDate 	timestamp with time zone := NULL;");
	sb.appendln("calDueDate 	timestamp with time zone;");
	sb.appendln("FixMonthOffset 	Xendra.C_PaymentTerm.FixMonthOffset%TYPE;");
	sb.appendln("MaxDayCut 	NUMERIC;");
	sb.appendln("MaxDay 		NUMERIC;");
	sb.appendln("v_PayDate 	timestamp with time zone;");
	sb.appendln("p   		RECORD;");
	sb.appendln("--");
	sb.appendln("FirstDay 	timestamp with time zone;");
	sb.appendln("NoDays NUMERIC;");
	sb.appendln("BEGIN");
	sb.appendln("    IF PaymentTerm_ID = 0 OR DocDate IS NULL THEN");
	sb.appendln("    RETURN 0;");
	sb.appendln("END IF;");
	sb.appendln("    v_PayDate := PayDate;");
	sb.appendln("IF v_PayDate IS NULL THEN");
	sb.appendln("    v_PayDate := TRUNC(now());");
	sb.appendln("END IF;");
	sb.appendln("FOR p IN");
	sb.appendln("SELECT *");
	sb.appendln("FROM C_PaymentTerm");
	sb.appendln("WHERE C_PaymentTerm_ID = PaymentTerm_ID");
	sb.appendln("LOOP -- for convineance only");
	sb.appendln("-- Due 15th of following month");
	sb.appendln("IF (p.IsDueFixed = 'Y') THEN");
	sb.appendln("FirstDay := TRUNC(DocDate, 'MM');");
	sb.appendln("NoDays := extract (day from (TRUNC(DocDate) - FirstDay));");
	sb.appendln("DueDate := FirstDay + (p.FixMonthDay-1); -- starting on 1st");
	sb.appendln("DueDate := DueDate + (p.FixMonthOffset || ' month')::interval;");
	sb.appendln("IF (NoDays > p.FixMonthCutoff) THEN");
	sb.appendln("DueDate := DueDate + '1 month'::interval;");
	sb.appendln("END IF;");
	sb.appendln("-- raise notice 'FirstDay: %, NoDays: %, DueDate: %', FirstDay, NoDays, DueDate;");
	sb.appendln("calDueDate := TRUNC(DocDate);");
	sb.appendln("MaxDayCut := extract (day from (cast(date_trunc('month', calDueDate) + '1 month'::interval as date) - 1));");
	sb.appendln("-- raise notice 'last day(MaxDayCut): %' , MaxDayCut;");
	sb.appendln("IF p.FixMonthCutoff > MaxDayCut THEN");
	sb.appendln("-- raise notice 'p.FixMonthCutoff > MaxDayCut';");
	sb.appendln("    calDueDate := cast(date_trunc('month', TRUNC(calDueDate)) + '1 month'::interval as date) - 1;");
	sb.appendln("-- raise notice 'last day(calDueDate): %' , calDueDate;");
	sb.appendln("ELSE");
	sb.appendln("    -- set day fixmonthcutoff on duedate");
	sb.appendln("    calDueDate := TRUNC(calDueDate, 'MM') + (((p.FixMonthCutoff-1)|| ' days')::interval);");
	sb.appendln("    -- raise notice 'calDueDate: %' , calDueDate;");
	sb.appendln("END IF;");
	sb.appendln("FixMonthOffset := p.FixMonthOffset;");
	sb.appendln("IF DocDate > calDueDate THEN");
	sb.appendln("    FixMonthOffset := FixMonthOffset + 1;");
	sb.appendln("raise notice 'FixMonthOffset: %' , FixMonthOffset;");
	sb.appendln("END IF;");
	sb.appendln("calDueDate := calDueDate + (FixMonthOffset || ' month')::interval;");
	sb.appendln("-- raise notice 'calDueDate: %' , calDueDate;");
	sb.appendln("MaxDay := extract (day from (cast(date_trunc('month', calDueDate) + '1 month'::interval as date) - 1));");
	sb.appendln("IF    (p.FixMonthDay > MaxDay)    -- 32 -> 28");
	sb.appendln("   OR (p.FixMonthDay >= 30 AND MaxDay > p.FixMonthDay) THEN  -- 30 -> 31");
	sb.appendln("calDueDate := TRUNC(calDueDate, 'MM') + (((MaxDay-1)|| ' days')::interval);");
	sb.appendln("-- raise notice 'calDueDate: %' , calDueDate;");
	sb.appendln("ELSE");
	sb.appendln("calDueDate := TRUNC(calDueDate, 'MM') + (((p.FixMonthDay-1)|| ' days')::interval);");
	sb.appendln("-- raise notice 'calDueDate: %' , calDueDate;");
	sb.appendln("END IF;");
	sb.appendln("DueDate := calDueDate;");
	sb.appendln("ELSE");
	sb.appendln("DueDate := TRUNC(DocDate) + p.NetDays;");
	sb.appendln("END IF;");
	sb.appendln("END LOOP;");
	sb.appendln("    IF DueDate IS NULL THEN");
	sb.appendln("    RETURN 0;");
	sb.appendln("END IF;");
	sb.appendln("Days := EXTRACT(day from (TRUNC(v_PayDate) - DueDate));");
	sb.appendln("RETURN Days;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=b25598f9-9407-30ec-f68a-64fe955da750");
	return sb.toString();
}
}
