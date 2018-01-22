package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Nextbusinessday0 
{
 
@XendraFunction(Name="nextbusinessday",Output="timestamp with time zone",Owner="xendra",
Language="plpgsql",Identifier="f59ee855-60b4-3205-01ac-ab956531cea0",
Arguments="p_date timestamp with time zone, p_ad_client_id numeric",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "f59ee855-60b4-3205-01ac-ab956531cea0";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("/**");
	sb.appendln("*This file is part of Adempiere ERP Bazaar");
	sb.appendln("*http://www.adempiere.org");
	sb.appendln("*");
	sb.appendln("*Copyright (C) 2007 Teo Sarca");
	sb.appendln("*");
	sb.appendln("*This program is free software; you can redistribute it and/or");
	sb.appendln("*modify it under the terms of the GNU General Public License");
	sb.appendln("*as published by the Free Software Foundation; either version 2");
	sb.appendln("*of the License, or (at your option) any later version.");
	sb.appendln("*");
	sb.appendln("*This program is distributed in the hope that it will be useful,");
	sb.appendln("*but WITHOUT ANY WARRANTY; without even the implied warranty of");
	sb.appendln("*MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the");
	sb.appendln("*GNU General Public License for more details.");
	sb.appendln("*");
	sb.appendln("*You should have received a copy of the GNU General Public License");
	sb.appendln("*along with this program; if not, write to the Free Software");
	sb.appendln("*Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA.of");
	sb.appendln("*");
	sb.appendln("* Converted to PostgreSQL by Tony Snook,");
	sb.appendln("* tspc@dodo.com.au");
	sb.appendln("*/");
	sb.appendln("DECLARE");
	sb.appendln("v_nextDate date := trunc(p_Date);");
	sb.appendln("v_offset numeric := 0;");
	sb.appendln("v_Saturday numeric := TO_CHAR(TO_DATE('2000-01-01', 'YYYY-MM-DD'), 'D');");
	sb.appendln("v_Sunday numeric := (case when v_Saturday = 7 then 1 else v_Saturday + 1 end);");
	sb.appendln("v_isHoliday boolean := true;");
	sb.appendln("nbd xendra.C_NonBusinessDay%ROWTYPE;");
	sb.appendln("begin");
	sb.appendln("v_isHoliday := true;");
	sb.appendln("loop");
	sb.appendln("SELECT CASE TO_CHAR(v_nextDate,'D')::numeric");
	sb.appendln("WHEN v_Saturday THEN 2");
	sb.appendln("WHEN v_Sunday THEN 1");
	sb.appendln("ELSE 0");
	sb.appendln("END INTO v_offset;");
	sb.appendln("v_nextDate := v_nextDate + v_offset::integer;");
	sb.appendln("v_isHoliday := false;");
	sb.appendln("FOR nbd IN SELECT *");
	sb.appendln("FROM xendra.C_NonBusinessDay");
	sb.appendln("WHERE AD_Client_ID=p_AD_Client_ID and IsActive ='Y' and Date1 >= v_nextDate");
	sb.appendln("ORDER BY Date1");
	sb.appendln("LOOP");
	sb.appendln("exit when v_nextDate <> trunc(nbd.Date1);");
	sb.appendln("v_nextDate := v_nextDate + 1;");
	sb.appendln("v_isHoliday := true;");
	sb.appendln("end loop;");
	sb.appendln("exit when v_isHoliday=false;");
	sb.appendln("end loop;");
	sb.appendln("--");
	sb.appendln("return v_nextDate::timestamp with time zone;");
	sb.appendln("end;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=f59ee855-60b4-3205-01ac-ab956531cea0");
	return sb.toString();
}
}
