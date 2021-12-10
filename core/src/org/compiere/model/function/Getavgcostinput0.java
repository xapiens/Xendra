package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Getavgcostinput0 
{

	@XendraFunction(Name="getavgcostinput",Output="numeric",Owner="xendra",Language="plpgsql",
			Identifier="d594df41-bc59-309b-63db-e5f00d216925",
			Arguments="client_id numeric, costelement_id numeric, product_id numeric, pline numeric, table_id numeric, recordid numeric",
			Extension="",Synchronized="2020-03-06 10:58:28.0")
	public static final String Identifier = "d594df41-bc59-309b-63db-e5f00d216925";

	public static final String getCode() 
	{
		StrBuilder sb = new StrBuilder();
		sb.appendln("DECLARE");
		sb.appendln("v_Cost NUMERIC := 0;");
		sb.appendln("v_Costeable character(1);");
		sb.appendln("BEGIN");
		sb.appendln("SELECT cost from m_costcalc WHERE ad_table_id = table_id AND record_id = recordid");
		sb.appendln("	and m_product_id = product_id");
		sb.appendln("	and ad_client_id = client_id");
		sb.appendln("	and CASE WHEN pline > 0 THEN line = pline ELSE true END");
		sb.appendln("	and m_costelement_id = costelement_id");
		sb.appendln("	into v_Cost;				");
		sb.appendln("v_Cost := coalesce(v_Cost,0);");
		sb.appendln("-- in case the cost is 0, try without line");
		sb.appendln("if v_Cost = 0 AND pline > 0 then");
		sb.appendln("	SELECT cost from m_costcalc WHERE ad_table_id = table_id AND record_id = recordid");
		sb.appendln("		and m_product_id = product_id");
		sb.appendln("		and ad_client_id = client_id");
		sb.appendln("		and m_costelement_id = costelement_id");
		sb.appendln("		into v_Cost;				");
		sb.appendln("end if;");
		sb.appendln("return coalesce(v_Cost,0);");
		sb.appendln("END;");
		return sb.toString();
	}
	public static final String getComments() 
	{
		StrBuilder sb = new StrBuilder();
		sb.appendln("@Synchronized=2020-03-06 10:58:28.0");
		sb.appendln("@Identifier=d594df41-bc59-309b-63db-e5f00d216925");
		return sb.toString();
	}
}
