package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_M_inout_line_v 
{
 	@XendraView(Identifier="1a31661c-1596-c87a-7cb7-8268b5247c61",
Synchronized="2013-07-09 19:02:34.0",
Name="m_inout_line_v",
Owner="xendra",
Extension="")
	public static final String Identifier = "1a31661c-1596-c87a-7cb7-8268b5247c61";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=1a31661c-1596-c87a-7cb7-8268b5247c61");
	sb.appendln("@comment=Shipment Print View");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT iol.ad_client_id, iol.ad_org_id, iol.isactive, iol.created, iol.createdby, iol.updated, iol.updatedby, 'en_US'::text AS ad_language, iol.m_inout_id, iol.m_inoutline_id, iol.line, p.m_product_id, CASE WHEN ((iol.movementqty <> (0)::numeric) OR (iol.m_product_id IS NOT NULL)) THEN iol.movementqty ELSE NULL::numeric END AS movementqty, CASE WHEN ((iol.qtyentered <> (0)::numeric) OR (iol.m_product_id IS NOT NULL)) THEN iol.qtyentered ELSE NULL::numeric END AS qtyentered, CASE WHEN ((iol.movementqty <> (0)::numeric) OR (iol.m_product_id IS NOT NULL)) THEN uom.uomsymbol ELSE NULL::character varying END AS uomsymbol, ol.qtyordered, ol.qtydelivered, CASE WHEN ((iol.movementqty <> (0)::numeric) OR (iol.m_product_id IS NOT NULL)) THEN (ol.qtyordered - ol.qtydelivered) ELSE NULL::numeric END AS qtybackordered, COALESCE(((p.name)::text || (productattribute(iol.m_attributesetinstance_id))::text), (c.name)::text, (iol.description)::text) AS name, CASE WHEN (COALESCE(c.name, p.name) IS NOT NULL) THEN iol.description ELSE NULL::character varying END AS description, p.documentnote, p.upc, p.sku, p.value AS productvalue, iol.m_locator_id, l.m_warehouse_id, l.x, l.y, l.z, iol.m_attributesetinstance_id, asi.m_attributeset_id, asi.serno, asi.lot, asi.m_lot_id, asi.guaranteedate, p.description AS productdescription, p.imageurl, iol.c_campaign_id, iol.c_project_id, iol.c_activity_id, iol.c_projectphase_id, iol.c_projecttask_id, pbd.value AS brandvalue FROM (((((((m_inoutline iol JOIN c_uom uom ON ((iol.c_uom_id = uom.c_uom_id))) LEFT JOIN m_product p ON ((iol.m_product_id = p.m_product_id))) LEFT JOIN m_product_brand pbd ON ((pbd.m_product_brand_id = p.m_product_brand_id))) LEFT JOIN m_attributesetinstance asi ON ((iol.m_attributesetinstance_id = asi.m_attributesetinstance_id))) LEFT JOIN m_locator l ON ((iol.m_locator_id = l.m_locator_id))) LEFT JOIN c_orderline ol ON ((iol.c_orderline_id = ol.c_orderline_id))) LEFT JOIN c_charge c ON ((iol.c_charge_id = c.c_charge_id))) UNION SELECT iol.ad_client_id, iol.ad_org_id, iol.isactive, iol.created, iol.createdby, iol.updated, iol.updatedby, 'en_US'::text AS ad_language, iol.m_inout_id, iol.m_inoutline_id, (iol.line + (b.line / (100)::numeric)) AS line, p.m_product_id, (iol.movementqty * b.bomqty) AS movementqty, (iol.qtyentered * b.bomqty) AS qtyentered, uom.uomsymbol, NULL::numeric AS qtyordered, NULL::numeric AS qtydelivered, NULL::numeric AS qtybackordered, p.name, b.description, p.documentnote, p.upc, p.sku, p.value AS productvalue, iol.m_locator_id, l.m_warehouse_id, l.x, l.y, l.z, iol.m_attributesetinstance_id, asi.m_attributeset_id, asi.serno, asi.lot, asi.m_lot_id, asi.guaranteedate, p.description AS productdescription, p.imageurl, iol.c_campaign_id, iol.c_project_id, iol.c_activity_id, iol.c_projectphase_id, iol.c_projecttask_id, pbd.value AS brandvalue FROM (((((((m_product_bom b JOIN m_inoutline iol ON ((b.m_product_id = iol.m_product_id))) JOIN m_product bp ON (((((bp.m_product_id = iol.m_product_id) AND (bp.isbom = 'Y'::bpchar)) AND (bp.isverified = 'Y'::bpchar)) AND (bp.ispicklistprintdetails = 'Y'::bpchar)))) JOIN m_product p ON ((b.m_productbom_id = p.m_product_id))) JOIN c_uom uom ON ((p.c_uom_id = uom.c_uom_id))) LEFT JOIN m_product_brand pbd ON ((pbd.m_product_brand_id = p.m_product_brand_id))) LEFT JOIN m_attributesetinstance asi ON ((iol.m_attributesetinstance_id = asi.m_attributesetinstance_id))) LEFT JOIN m_locator l ON ((iol.m_locator_id = l.m_locator_id)));");
	return sb.toString();
}
}
