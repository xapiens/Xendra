package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Pendings_v 
{
 	@XendraView(Identifier="2c08ac89-c31b-aadd-1404-11c6881062fa",
Synchronized="2013-07-09 19:02:34.0",
Name="pendings_v",
Owner="xendra",
Extension="")
	public static final String Identifier = "2c08ac89-c31b-aadd-1404-11c6881062fa";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=2c08ac89-c31b-aadd-1404-11c6881062fa");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT ol.c_bpartner_id, ol.m_product_id, ol.c_order_id, sum((ol.qtyordered - ol.qtydelivered)) AS pending FROM c_orderline ol GROUP BY ol.c_bpartner_id, ol.m_product_id, ol.c_order_id HAVING (sum((ol.qtyordered - ol.qtydelivered)) > (0)::numeric) ORDER BY sum((ol.qtyordered - ol.qtydelivered)) DESC;");
	return sb.toString();
}
}
