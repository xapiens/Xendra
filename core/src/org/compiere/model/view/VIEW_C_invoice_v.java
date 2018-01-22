package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_C_invoice_v 
{
 	@XendraView(Identifier="db7c1eb2-f2c4-4deb-0b29-7e3b79376d6a",
Synchronized="2016-10-17 10:41:13.0",
Name="c_invoice_v",
Owner="xendra",
Extension="")
	public static final String Identifier = "db7c1eb2-f2c4-4deb-0b29-7e3b79376d6a";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2016-10-17 10:41:13.0");
	sb.appendln("@Identifier=db7c1eb2-f2c4-4deb-0b29-7e3b79376d6a");
	sb.appendln("@comment=Invoice Identifier");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT i.c_invoice_id, i.ad_client_id, i.ad_org_id, i.isactive, i.created, i.createdby, i.updated, i.updatedby, i.issotrx, i.documentno, i.docstatus, i.docaction, i.processing, i.processed, i.c_doctype_id, i.c_doctypetarget_id, i.c_order_id, i.description, i.isapproved, i.istransferred, i.salesrep_id, i.dateinvoiced, i.dateprinted, i.dateacct, i.c_bpartner_id, i.c_bpartner_location_id, i.ad_user_id, i.poreference, i.dateordered, i.c_currency_id, i.c_conversiontype_id, i.paymentrule, i.c_paymentterm_id, i.c_charge_id, i.m_pricelist_id, i.c_campaign_id, i.c_project_id, i.c_activity_id, i.isprinted, i.isdiscountprinted, i.ispaid, i.isindispute, i.ispayschedulevalid, NULL::numeric AS c_invoicepayschedule_id, i.invoicecollectiontype, CASE WHEN ((charat((d.docbasetype)::character varying, 3))::text = 'C'::text) THEN (i.chargeamt * ((-1))::numeric) ELSE i.chargeamt END AS chargeamt, CASE WHEN ((charat((d.docbasetype)::character varying, 3))::text = 'C'::text) THEN (i.totallines * ((-1))::numeric) ELSE i.totallines END AS totallines, CASE WHEN ((charat((d.docbasetype)::character varying, 3))::text = 'C'::text) THEN (i.grandtotal * ((-1))::numeric) ELSE i.grandtotal END AS grandtotal, CASE WHEN ((charat((d.docbasetype)::character varying, 3))::text = 'C'::text) THEN (i.withholdingamt * ((-1))::numeric) ELSE i.withholdingamt END AS withholdingamt, (CASE WHEN ((charat((d.docbasetype)::character varying, 3))::text = 'C'::text) THEN (-1) ELSE 1 END)::numeric AS multiplier, (CASE WHEN ((charat((d.docbasetype)::character varying, 2))::text = 'P'::text) THEN (-1) ELSE 1 END)::numeric AS multiplierap, d.docbasetype, i.serial, i.fact_id, i.isadvance, i.c_withholding_id, i.ref_invoice_id FROM (c_invoice i JOIN c_doctype d ON ((i.c_doctype_id = d.c_doctype_id))) WHERE (i.ispayschedulevalid <> 'Y'::bpchar) UNION SELECT i.c_invoice_id, i.ad_client_id, i.ad_org_id, i.isactive, i.created, i.createdby, i.updated, i.updatedby, i.issotrx, i.documentno, i.docstatus, i.docaction, i.processing, i.processed, i.c_doctype_id, i.c_doctypetarget_id, i.c_order_id, i.description, i.isapproved, i.istransferred, i.salesrep_id, i.dateinvoiced, i.dateprinted, i.dateacct, i.c_bpartner_id, i.c_bpartner_location_id, i.ad_user_id, i.poreference, i.dateordered, i.c_currency_id, i.c_conversiontype_id, i.paymentrule, i.c_paymentterm_id, i.c_charge_id, i.m_pricelist_id, i.c_campaign_id, i.c_project_id, i.c_activity_id, i.isprinted, i.isdiscountprinted, i.ispaid, i.isindispute, i.ispayschedulevalid, ips.c_invoicepayschedule_id, i.invoicecollectiontype, NULL::numeric AS chargeamt, NULL::numeric AS totallines, CASE WHEN ((charat((d.docbasetype)::character varying, 3))::text = 'C'::text) THEN (ips.dueamt * ((-1))::numeric) ELSE ips.dueamt END AS grandtotal, CASE WHEN ((charat((d.docbasetype)::character varying, 3))::text = 'C'::text) THEN (i.withholdingamt * ((-1))::numeric) ELSE i.withholdingamt END AS withholdingamt, CASE WHEN ((charat((d.docbasetype)::character varying, 3))::text = 'C'::text) THEN (-1) ELSE 1 END AS multiplier, CASE WHEN ((charat((d.docbasetype)::character varying, 2))::text = 'P'::text) THEN (-1) ELSE 1 END AS multiplierap, d.docbasetype, i.serial, i.fact_id, i.isadvance, i.c_withholding_id, i.ref_invoice_id FROM ((c_invoice i JOIN c_doctype d ON ((i.c_doctype_id = d.c_doctype_id))) JOIN c_invoicepayschedule ips ON ((i.c_invoice_id = ips.c_invoice_id))) WHERE ((i.ispayschedulevalid = 'Y'::bpchar) AND (ips.isvalid = 'Y'::bpchar));");
	return sb.toString();
}
}
