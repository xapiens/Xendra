package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Notifycalculatecost0 
{
 
@XendraFunction(Name="notifycalculatecost",Output="trigger",Owner="xendra",Language="plpgsql",
Identifier="110b338b-2cad-4c61-8c75-12262d70ddd5",Arguments="",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "110b338b-2cad-4c61-8c75-12262d70ddd5";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE  ");
	sb.appendln(" table_id numeric := 0;");
	sb.appendln("BEGIN");
	sb.appendln("	SELECT ad_table_id into table_id from ad_table where lower(tablename) = TG_TABLE_NAME;");
	sb.appendln("	if table_id > 0 then ");
	sb.appendln("	  insert into M_CostProcessor ");
	sb.appendln("	  (AD_Client_ID, ");
	sb.appendln("	   AD_Org_ID, ");
	sb.appendln("	   created, ");
	sb.appendln("	   createdby, ");
	sb.appendln("	   updated, ");
	sb.appendln("	   updatedby, ");
	sb.appendln("	   ad_table_id, ");
	sb.appendln("	   record_id, ");
	sb.appendln("	   prestatus, ");
	sb.appendln("	   docstatus) ");
	sb.appendln("	  values ");
	sb.appendln("	  (OLD.ad_client_id,");
	sb.appendln("	   OLD.ad_org_id, ");
	sb.appendln("	   current_timestamp, ");
	sb.appendln("	   0, ");
	sb.appendln("	   current_timestamp, ");
	sb.appendln("	   0, ");
	sb.appendln("	   table_id, ");
	sb.appendln("	   NEW.m_inout_id, ");
	sb.appendln("	   OLD.docstatus, ");
	sb.appendln("	   NEW.docstatus);	");
	sb.appendln("	  NOTIFY COSTUPDATE;");
	sb.appendln("	end if;");
	sb.appendln("	RETURN NEW;");
	sb.appendln("END");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=110b338b-2cad-4c61-8c75-12262d70ddd5");
	return sb.toString();
}
}
