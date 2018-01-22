package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Getlastbuyforproduct0 
{
 
@XendraFunction(Name="getlastbuyforproduct",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="4160bdba-7542-aa38-6b90-eba600d62bea",
Arguments="client_id numeric, org_id numeric, product_id numeric, dl timestamp without time zone",
Extension="",Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "4160bdba-7542-aa38-6b90-eba600d62bea";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("v_cost NUMERIC;");
	sb.appendln("BEGIN");
	sb.appendln("select avg(");
	sb.appendln("CASE WHEN kard.movementtype='P+' THEN");
	sb.appendln("(select avg(getlastbuyforproduct(client_id, org_id, card.m_product_id, dl )) from m_carding card where card.m_productionplan_id = kard.m_productionplan_id and card.m_product_id != product_id)");
	sb.appendln("ELSE");
	sb.appendln(" CASE WHEN kard.priceactual = 0 THEN NULL ELSE kard.priceactual END  END )   into v_cost from m_carding kard where kard.m_product_id = product_id and substr(kard.movementtype,2)='+' and date_trunc('month',kard.movementdate) <= date_trunc('month',dl);");
	sb.appendln("if COALESCE(v_cost,0) = 0 THEN");
	sb.appendln("    v_cost := 1;");
	sb.appendln("END IF;");
	sb.appendln("RETURN v_cost;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=4160bdba-7542-aa38-6b90-eba600d62bea");
	return sb.toString();
}
}
