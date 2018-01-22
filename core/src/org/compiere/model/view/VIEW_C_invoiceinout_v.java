package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_C_invoiceinout_v 
{
 	@XendraView(Identifier="400294a5-798c-c1aa-a246-e0051fef0356",
Synchronized="2013-07-09 19:02:34.0",
Name="c_invoiceinout_v",
Owner="xendra",
Extension="")
	public static final String Identifier = "400294a5-798c-c1aa-a246-e0051fef0356";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=400294a5-798c-c1aa-a246-e0051fef0356");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT i.ad_client_id, i.ad_org_id, i.c_doctype_id, i.serial, i.c_invoice_id, i.c_bpartner_id, i.dateinvoiced, il.m_product_id, (il.qtyinvoiced * (rvi.multiplier)::numeric) AS qtyinvoiced, i.grandtotal, i.docstatus, il.m_inoutline_id, il.c_orderline_id, i.issotrx, m.movementdate FROM ((((c_invoice i JOIN rv_c_invoice rvi ON ((rvi.c_invoice_id = i.c_invoice_id))) JOIN c_invoiceline il ON ((i.c_invoice_id = il.c_invoice_id))) JOIN m_inoutline ml ON ((il.m_inoutline_id = ml.m_inoutline_id))) JOIN m_inout m ON ((m.m_inout_id = ml.m_inout_id))) WHERE ((il.qtyinvoiced <> (0)::numeric) AND (il.m_product_id IS NOT NULL));");
	return sb.toString();
}
}
