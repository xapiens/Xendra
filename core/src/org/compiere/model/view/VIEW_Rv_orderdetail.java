package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Rv_orderdetail 
{
 	@XendraView(Identifier="a24f639b-260f-0658-3aed-173225bec78e",
Synchronized="2013-07-09 19:02:34.0",
Name="rv_orderdetail",
Owner="xendra",
Extension="")
	public static final String Identifier = "a24f639b-260f-0658-3aed-173225bec78e";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=a24f639b-260f-0658-3aed-173225bec78e");
	sb.appendln("@comment=Order & Line View");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT l.ad_client_id, l.ad_org_id, l.isactive, l.created, l.createdby, l.updated, l.updatedby, o.c_order_id, o.docstatus, o.docaction, o.c_doctype_id, o.isapproved, o.iscreditapproved, o.salesrep_id, o.bill_bpartner_id, o.bill_location_id, o.bill_user_id, o.isdropship, l.c_bpartner_id, l.c_bpartner_location_id, o.ad_user_id, o.poreference, o.c_currency_id, o.issotrx, l.c_campaign_id, l.c_project_id, l.c_activity_id, l.c_projectphase_id, l.c_projecttask_id, l.c_orderline_id, l.dateordered, l.datepromised, l.m_product_id, l.m_warehouse_id, l.m_attributesetinstance_id, productattribute(l.m_attributesetinstance_id) AS productattribute, pasi.m_attributeset_id, pasi.m_lot_id, pasi.guaranteedate, pasi.lot, pasi.serno, l.c_uom_id, l.qtyentered, l.qtyordered, l.qtyreserved, l.qtydelivered, l.qtyinvoiced, l.priceactual, l.priceentered, (l.qtyordered - l.qtydelivered) AS qtytodeliver, (l.qtyordered - l.qtyinvoiced) AS qtytoinvoice, ((l.qtyordered - l.qtyinvoiced) * l.priceactual) AS netamttoinvoice, l.qtylostsales, (l.qtylostsales * l.priceactual) AS amtlostsales, CASE WHEN (l.pricelist = (0)::numeric) THEN (0)::numeric ELSE round((((l.pricelist - l.priceactual) / l.pricelist) * (100)::numeric), 2) END AS discount, CASE WHEN (l.pricelimit = (0)::numeric) THEN (0)::numeric ELSE round((((l.priceactual - l.pricelimit) / l.pricelimit) * (100)::numeric), 2) END AS margin, CASE WHEN (l.pricelimit = (0)::numeric) THEN (0)::numeric ELSE ((l.priceactual - l.pricelimit) * l.qtydelivered) END AS marginamt FROM ((c_order o JOIN c_orderline l ON ((o.c_order_id = l.c_order_id))) LEFT JOIN m_attributesetinstance pasi ON ((l.m_attributesetinstance_id = pasi.m_attributesetinstance_id)));");
	return sb.toString();
}
}
