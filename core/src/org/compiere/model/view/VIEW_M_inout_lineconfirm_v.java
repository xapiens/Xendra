package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_M_inout_lineconfirm_v 
{
 	@XendraView(Identifier="42d1c7e8-cb02-1f4c-2932-f6695f60f231",
Synchronized="2013-07-09 19:02:34.0",
Name="m_inout_lineconfirm_v",
Owner="xendra",
Extension="")
	public static final String Identifier = "42d1c7e8-cb02-1f4c-2932-f6695f60f231";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=42d1c7e8-cb02-1f4c-2932-f6695f60f231");
	sb.appendln("@comment=Confirmation Print View");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT iolc.ad_client_id, iolc.ad_org_id, iolc.isactive, iolc.created, iolc.createdby, iolc.updated, iolc.updatedby, 'en_US'::character varying AS ad_language, iolc.m_inoutlineconfirm_id, iolc.m_inoutconfirm_id, iolc.targetqty, iolc.confirmedqty, iolc.differenceqty, iolc.scrappedqty, iolc.description, iolc.processed, iol.m_inout_id, iol.m_inoutline_id, iol.line, p.m_product_id, iol.movementqty, uom.uomsymbol, (ol.qtyordered - ol.qtydelivered) AS qtybackordered, COALESCE(p.name, iol.description) AS name, CASE WHEN (p.name IS NOT NULL) THEN iol.description ELSE NULL::character varying END AS shipdescription, p.documentnote, p.upc, p.sku, p.value AS productvalue, iol.m_locator_id, l.m_warehouse_id, l.x, l.y, l.z, iol.m_attributesetinstance_id, asi.m_attributeset_id, asi.serno, asi.lot, asi.m_lot_id, asi.guaranteedate FROM ((((((m_inoutlineconfirm iolc JOIN m_inoutline iol ON ((iolc.m_inoutline_id = iol.m_inoutline_id))) JOIN c_uom uom ON ((iol.c_uom_id = uom.c_uom_id))) LEFT JOIN m_product p ON ((iol.m_product_id = p.m_product_id))) LEFT JOIN m_attributesetinstance asi ON ((iol.m_attributesetinstance_id = asi.m_attributesetinstance_id))) LEFT JOIN m_locator l ON ((iol.m_locator_id = l.m_locator_id))) LEFT JOIN c_orderline ol ON ((iol.c_orderline_id = ol.c_orderline_id)));");
	return sb.toString();
}
}
