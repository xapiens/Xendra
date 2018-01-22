package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Rv_transaction 
{
 	@XendraView(Identifier="55ae296b-f084-7fa1-d5f3-114a0d4849cd",
Synchronized="2013-07-09 19:02:34.0",
Name="rv_transaction",
Owner="xendra",
Extension="")
	public static final String Identifier = "55ae296b-f084-7fa1-d5f3-114a0d4849cd";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=55ae296b-f084-7fa1-d5f3-114a0d4849cd");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT t.m_transaction_id, t.ad_client_id, t.ad_org_id, t.movementtype, t.movementdate, t.movementqty, t.m_attributesetinstance_id, asi.m_attributeset_id, asi.serno, asi.lot, asi.m_lot_id, asi.guaranteedate, t.m_product_id, p.value, p.name, p.description, p.upc, p.sku, p.c_uom_id, p.m_product_category_id, p.classification, p.weight, p.volume, p.versionno, t.m_locator_id, l.m_warehouse_id, l.x, l.y, l.z, t.m_inventoryline_id, il.m_inventory_id, t.m_movementline_id, ml.m_movement_id, t.m_inoutline_id, iol.m_inout_id, t.m_productionline_id, prdl.m_productionplan_id, prdp.m_production_id, t.c_projectissue_id, pjl.c_project_id, COALESCE(il.line, ml.line, iol.line, prdl.line, pjl.line) AS line FROM (((((((((m_transaction t JOIN m_locator l ON ((t.m_locator_id = l.m_locator_id))) JOIN m_product p ON ((t.m_product_id = p.m_product_id))) LEFT JOIN m_attributesetinstance asi ON ((t.m_attributesetinstance_id = asi.m_attributesetinstance_id))) LEFT JOIN m_inventoryline il ON ((t.m_inventoryline_id = il.m_inventoryline_id))) LEFT JOIN m_movementline ml ON ((t.m_movementline_id = ml.m_movementline_id))) LEFT JOIN m_inoutline iol ON ((t.m_inoutline_id = iol.m_inoutline_id))) LEFT JOIN m_productionline prdl ON ((t.m_productionline_id = prdl.m_productionline_id))) LEFT JOIN m_productionplan prdp ON ((prdl.m_productionplan_id = prdp.m_productionplan_id))) LEFT JOIN c_projectissue pjl ON ((t.c_projectissue_id = pjl.c_projectissue_id)));");
	return sb.toString();
}
}
