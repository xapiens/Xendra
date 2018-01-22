package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Rv_commissionrundetail 
{
 	@XendraView(Identifier="7e8aa573-0fbf-314b-9616-4d3c405e4540",
Synchronized="2013-07-09 19:02:34.0",
Name="rv_commissionrundetail",
Owner="xendra",
Extension="")
	public static final String Identifier = "7e8aa573-0fbf-314b-9616-4d3c405e4540";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=7e8aa573-0fbf-314b-9616-4d3c405e4540");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT cr.ad_client_id, cr.ad_org_id, cr.isactive, cr.created, cr.createdby, cr.updated, cr.updatedby, cr.c_commissionrun_id, cr.documentno, cr.description, cr.startdate, cr.grandtotal, cr.processed, c.c_commission_id, c.c_bpartner_id AS commission_bpartner_id, ca.c_commissionamt_id, ca.convertedamt AS commissionconvertedamt, ca.actualqty AS commissionqty, ca.commissionamt, cd.c_commissiondetail_id, cd.reference, cd.c_orderline_id, cd.c_invoiceline_id, cd.info, cd.c_currency_id, cd.actualamt, cd.convertedamt, cd.actualqty, i.documentno AS invoicedocumentno, COALESCE(i.dateinvoiced, o.dateordered) AS datedoc, COALESCE(il.m_product_id, ol.m_product_id) AS m_product_id, COALESCE(i.c_bpartner_id, o.c_bpartner_id) AS c_bpartner_id, COALESCE(i.c_bpartner_location_id, o.c_bpartner_location_id) AS c_bpartner_location_id, COALESCE(i.ad_user_id, o.ad_user_id) AS ad_user_id, COALESCE(i.c_doctype_id, o.c_doctype_id) AS c_doctype_id FROM (((((((c_commissionrun cr JOIN c_commission c ON ((cr.c_commission_id = c.c_commission_id))) JOIN c_commissionamt ca ON ((cr.c_commissionrun_id = ca.c_commissionrun_id))) JOIN c_commissiondetail cd ON ((ca.c_commissionamt_id = cd.c_commissionamt_id))) LEFT JOIN c_orderline ol ON ((cd.c_orderline_id = ol.c_orderline_id))) LEFT JOIN c_invoiceline il ON ((cd.c_invoiceline_id = il.c_invoiceline_id))) LEFT JOIN c_order o ON ((ol.c_order_id = o.c_order_id))) LEFT JOIN c_invoice i ON ((il.c_invoice_id = i.c_invoice_id)));");
	return sb.toString();
}
}
