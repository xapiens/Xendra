package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Getaveragecost0 
{
 
@XendraFunction(Name="getaveragecost",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="86c276fd-b3e2-9c37-4da2-310fb2b98226",
Arguments="client_id numeric, costelement_id numeric, inoutline_id numeric, m_product_id numeric, movementdate timestamp without time zone",
Extension="",Synchronized="2020-02-15 22:36:28.0")
	public static final String Identifier = "86c276fd-b3e2-9c37-4da2-310fb2b98226";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("v_Cost NUMERIC := 0;");
	sb.appendln("lastcost timestamp;");
	sb.appendln("_movementtype text;");
	sb.appendln("inout_id numeric;");
	sb.appendln("_movementqty  numeric;");
	sb.appendln("_ce_currency_id numeric;");
	sb.appendln("_c_currency_id numeric;");
	sb.appendln("_c_conversiontype_id numeric;");
	sb.appendln("_priceactual numeric;");
	sb.appendln("BEGIN");
	sb.appendln("    SELECT c_currency_id into _ce_currency_id  FROM m_costelement where m_costelement_id = costelement_id;");
	sb.appendln("    SELECT iol.m_inout_id, ");
	sb.appendln("	   iol.movementqty,");
	sb.appendln("	   ol.c_currency_id,");
	sb.appendln("	   ol.priceactual,");
	sb.appendln("	   o.c_conversiontype_id into ");
	sb.appendln("	   inout_id,  ");
	sb.appendln("	   _movementqty, ");
	sb.appendln("	   _c_currency_id,");
	sb.appendln("	   _priceactual,");
	sb.appendln("	   _c_conversiontype_id");
	sb.appendln("	   FROM m_inoutline iol join c_orderline ol ON iol.c_orderline_id = ol.c_orderline_id");
	sb.appendln("	   join c_order o on ol.c_order_id = o.c_order_id");
	sb.appendln("	   WHERE m_inoutline_id = inoutline_id;");
	sb.appendln("    inout_id := COALESCE(inout_id,0);");
	sb.appendln("    IF inout_id > 0 THEN 	");
	sb.appendln("	SELECT movementtype into _movementtype FROM m_inout where m_inout_id = inout_id;");
	sb.appendln("	if (_movementtype = 'R+'::text) then");
	sb.appendln("		v_cost := round(getdevolutioncost(client_id, costelement_id, inoutline_id, m_product_id, movementdate) * _movementqty,2);	");
	sb.appendln("	elsif substring(_movementtype::text, 2) = '+'::text then");
	sb.appendln("		v_cost := ROUND(_priceactual * _movementqty,2);		");
	sb.appendln("		if _c_currency_id != _ce_currency_id THEN");
	sb.appendln("		   v_cost := round(currencyconvertcost(v_cost,_c_currency_id, _ce_currency_id, movementdate, _c_conversiontype_id, client_id, 0),2);			");
	sb.appendln("		END IF;		");
	sb.appendln("	else ");
	sb.appendln("		v_cost := round(getaveragecost(client_id, costelement_id, m_product_id, movementdate, false) * _movementqty,2);");
	sb.appendln("	end if;");
	sb.appendln("     END IF;");
	sb.appendln("     return v_cost;          ");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@plugin=org.xendra.core");
	sb.appendln("");
	sb.appendln("@Synchronized=2020-02-15 22:36:28.0");
	sb.appendln("@Identifier=86c276fd-b3e2-9c37-4da2-310fb2b98226");
	return sb.toString();
}
}
