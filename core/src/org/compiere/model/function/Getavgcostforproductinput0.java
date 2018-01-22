package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Getavgcostforproductinput0 
{
 
@XendraFunction(Name="getavgcostforproductinput",Output="numeric",Owner="xendra",
Language="plpgsql",Identifier="1257af5b-e8bd-bf89-4fad-1dcd4ea23592",
Arguments="client_id numeric, org_id numeric, costelement_id numeric, product_id numeric, pline numeric, table_id numeric, recordid numeric",
Extension="",Synchronized="2015-12-08 15:10:28.0")
	public static final String Identifier = "1257af5b-e8bd-bf89-4fad-1dcd4ea23592";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("v_Cost NUMERIC := 0;");
	sb.appendln("v_Costeable character(1);");
	sb.appendln("BEGIN");
	sb.appendln("SELECT incost from m_costcalc WHERE ad_table_id = table_id AND record_id = recordid");
	sb.appendln("	and m_product_id = product_id");
	sb.appendln("	and ad_client_id = client_id");
	sb.appendln("	and ad_org_id = 0");
	sb.appendln("	and CASE WHEN pline > 0 THEN line = pline ELSE true END");
	sb.appendln("	and m_costelement_id = costelement_id");
	sb.appendln("	into v_Cost;				");
	sb.appendln("return coalesce(v_Cost,0);");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2015-12-08 15:10:28.0");
	sb.appendln("@Identifier=1257af5b-e8bd-bf89-4fad-1dcd4ea23592");
	return sb.toString();
}
}
