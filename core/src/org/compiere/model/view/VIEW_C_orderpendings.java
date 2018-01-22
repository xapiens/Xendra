package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_C_orderpendings 
{
 	@XendraView(Identifier="3af0b7ec-d453-8d6b-506f-9ad51ff435f8",
Synchronized="2014-05-28 19:02:34.0",
Name="c_orderpendings",
Owner="xendra",
Extension="")
	public static final String Identifier = "3af0b7ec-d453-8d6b-506f-9ad51ff435f8";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2014-05-28 19:02:34.0");
	sb.appendln("@Identifier=3af0b7ec-d453-8d6b-506f-9ad51ff435f8");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT ol.c_bpartner_id, ol.m_product_id, ol.c_order_id, sum((ol.qtyordered - ol.qtydelivered)) AS pending FROM c_orderline ol GROUP BY ol.c_bpartner_id, ol.m_product_id, ol.c_order_id HAVING (sum((ol.qtyordered - ol.qtydelivered)) > (0)::numeric) ORDER BY sum((ol.qtyordered - ol.qtydelivered));");
	return sb.toString();
}
}
