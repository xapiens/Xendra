package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_C_invoiceline_v 
{
 	@XendraView(Identifier="a79c59be-9460-1d1b-6aec-9b13d1d8d954",
Synchronized="2014-05-26 00:27:13.0",
Name="c_invoiceline_v",
Owner="xendra",
Extension="")
	public static final String Identifier = "a79c59be-9460-1d1b-6aec-9b13d1d8d954";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2014-05-26 00:27:13.0");
	sb.appendln("@comment=Invoice Detail Line");
	sb.appendln("");
	sb.appendln("@Identifier=a79c59be-9460-1d1b-6aec-9b13d1d8d954");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT il.ad_client_id, il.ad_org_id, il.c_invoiceline_id, i.c_invoice_id, i.salesrep_id, i.c_bpartner_id, il.m_product_id, i.documentno, i.dateinvoiced, i.dateacct, i.issotrx, i.docstatus, round((i.multiplier * il.priceactual), 2) AS priceactual, round((i.multiplier * il.linenetamt), 2) AS linenetamt, round(((i.multiplier * il.pricelist) * il.qtyinvoiced), 2) AS linelistamt, round(((i.multiplier * il.pricelimit) * il.qtyinvoiced), 2) AS linelimitamt, round((((i.multiplier * il.pricelist) * il.qtyinvoiced) - il.linenetamt), 2) AS linediscountamt, round(((i.multiplier * il.linenetamt) - (il.pricelimit * il.qtyinvoiced)), 2) AS lineoverlimitamt, (i.multiplier * il.qtyinvoiced) AS qtyinvoiced, (i.multiplier * il.qtyentered) AS qtyentered, il.line, il.c_orderline_id, il.c_uom_id, il.c_campaign_id, il.c_project_id, il.c_activity_id, il.c_projectphase_id, il.c_projecttask_id FROM (c_invoice_v i JOIN c_invoiceline il ON ((i.c_invoice_id = il.c_invoice_id)));");
	return sb.toString();
}
}
