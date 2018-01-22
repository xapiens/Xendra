package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Isperiodopen0 
{
 
@XendraFunction(Name="isperiodopen",Output="boolean",Owner="xendra",Language="plpgsql",
Identifier="c759b0d6-d391-182d-2564-19241b20720b",
Arguments="p_doctype_id numeric, p_dateacct timestamp without time zone, org_id numeric, client_id numeric",
Extension="",Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "c759b0d6-d391-182d-2564-19241b20720b";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln(" basetype varchar ;");
	sb.appendln(" calendar_id numeric := 0;");
	sb.appendln(" period_id numeric := 0;");
	sb.appendln(" ptype character;");
	sb.appendln(" pc RECORD;");
	sb.appendln(" isopen BOOLEAN := false;");
	sb.appendln("BEGIN");
	sb.appendln("IF org_id > 0 then");
	sb.appendln("	select c_calendar_id into calendar_id from AD_OrgInfo where ad_org_id = org_id;");
	sb.appendln("	if calendar_id is null then ");
	sb.appendln("		SELECT c_calendar_id into calendar_id FROM AD_ClientInfo WHERE AD_Client_ID=client_id;	");
	sb.appendln("	end if;");
	sb.appendln("ELSE");
	sb.appendln("	SELECT c_calendar_id into calendar_id FROM AD_ClientInfo WHERE AD_Client_ID=client_id;");
	sb.appendln("END IF;");
	sb.appendln("if calendar_id > 0 then");
	sb.appendln("	SELECT C_period_ID, PeriodType into period_id, ptype FROM C_Period ");
	sb.appendln("	WHERE C_Year_ID IN(SELECT C_Year_ID FROM C_Year WHERE C_Calendar_ID= calendar_id) ");
	sb.appendln("	AND p_dateacct BETWEEN TRUNC(StartDate) AND TRUNC(EndDate) AND IsActive='Y' AND PeriodType='S';		");
	sb.appendln("end if;");
	sb.appendln("if period_id > 0 AND ptype = 'S' then");
	sb.appendln("	SELECT docbasetype into basetype from c_doctype where c_doctype_id = p_doctype_id;");
	sb.appendln("	if length(basetype)  > 0 then");
	sb.appendln("		FOR pc IN SELECT docbasetype, periodstatus FROM C_PeriodControl where c_period_id = period_id");
	sb.appendln("		LOOP ");
	sb.appendln("		   if pc.docbasetype = basetype and pc.periodstatus = 'O' then");
	sb.appendln("			isopen := TRUE;");
	sb.appendln("		  end if;");
	sb.appendln("		END LOOP;");
	sb.appendln("	end if;");
	sb.appendln("end if;");
	sb.appendln("RETURN isopen;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=c759b0d6-d391-182d-2564-19241b20720b");
	sb.appendln("@comment=*");
	sb.appendln("* Test:");
	sb.appendln("* select xendra.isperiodopen(1001016,01/01/2012::timestamp, 1000054, 1000024)");
	sb.appendln("*");
	sb.appendln("*");
	return sb.toString();
}
}
