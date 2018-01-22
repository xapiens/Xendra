package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Rv_bpartneropen 
{
 	@XendraView(Identifier="77d3e3a7-836d-cc87-3176-1ceeecfa05f5",
Synchronized="2013-07-24 17:58:18.0",
Name="rv_bpartneropen",
Owner="xendra",
Extension="")
	public static final String Identifier = "77d3e3a7-836d-cc87-3176-1ceeecfa05f5";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-24 17:58:18.0");
	sb.appendln("@Identifier=77d3e3a7-836d-cc87-3176-1ceeecfa05f5");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT i.ad_client_id, i.ad_org_id, i.isactive, i.created, i.createdby, i.updated, i.updatedby, i.c_bpartner_id, i.c_currency_id, (i.grandtotal * i.multiplierap) AS amt, (invoiceopen(i.c_invoice_id, i.c_invoicepayschedule_id) * i.multiplierap) AS openamt, i.dateinvoiced AS datedoc, COALESCE(daysbetween(getdate(), (ips.duedate)::timestamp with time zone), paymenttermduedays((i.c_paymentterm_id)::integer, i.dateinvoiced, getdate())) AS daysdue, i.c_campaign_id, i.c_project_id, i.c_activity_id FROM (c_invoice_v i LEFT JOIN c_invoicepayschedule ips ON ((i.c_invoicepayschedule_id = ips.c_invoicepayschedule_id))) WHERE ((i.ispaid = 'N'::bpchar) AND (i.docstatus = ANY (ARRAY['CO'::bpchar, 'CL'::bpchar]))) UNION SELECT p.ad_client_id, p.ad_org_id, p.isactive, p.created, p.createdby, p.updated, p.updatedby, p.c_bpartner_id, p.c_currency_id, ((p.payamt * (p.multiplierap)::numeric) * (- (1)::numeric)) AS amt, ((paymentavailable(p.c_payment_id) * (p.multiplierap)::numeric) * (- (1)::numeric)) AS openamt, p.datetrx AS datedoc, NULL::integer AS daysdue, p.c_campaign_id, p.c_project_id, p.c_activity_id FROM c_payment_v p WHERE (((p.isallocated = 'N'::bpchar) AND (p.c_bpartner_id IS NOT NULL)) AND (p.docstatus = ANY (ARRAY['CO'::bpchar, 'CL'::bpchar])));");
	return sb.toString();
}
}
