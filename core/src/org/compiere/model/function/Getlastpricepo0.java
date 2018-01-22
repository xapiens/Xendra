package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Getlastpricepo0 
{
 
@XendraFunction(Name="getlastpricepo",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="d7a26654-45e6-ed7c-086d-1d74a28d9c8a",
Arguments="lastpo timestamp without time zone, product_id numeric",Extension="",
Synchronized="2016-11-22 18:15:28.0")
	public static final String Identifier = "d7a26654-45e6-ed7c-086d-1d74a28d9c8a";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("lastpoprice numeric  := 0;");
	sb.appendln("BEGIN ");
	sb.appendln("WITH X AS (SELECT o.dateordered, o.issotrx,(case when pl.istaxincluded = 'Y' then (priceactual*100/(100+t.rate)) else priceactual end ) as priceactual, rank() over (partition by m_product_id order by o.dateordered) FROM ");
	sb.appendln("	c_orderline ol join c_order o on ol.c_order_id = o.c_order_id ");
	sb.appendln("join m_pricelist pl on o.m_pricelist_id = pl.m_pricelist_id");
	sb.appendln(" join c_tax t on ol.c_tax_id = t.c_tax_id	");
	sb.appendln("where m_product_id = product_id AND issotrx = 'N' AND date(ol.dateordered) <= lastPO)");
	sb.appendln("SELECT COALESCE(max(priceactual),0) into lastpoprice from X WHERE rank = (SELECT MAX(rank) FROM X);");
	sb.appendln("return lastpoprice;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2016-11-22 18:15:28.0");
	sb.appendln("@Identifier=d7a26654-45e6-ed7c-086d-1d74a28d9c8a");
	return sb.toString();
}
}
