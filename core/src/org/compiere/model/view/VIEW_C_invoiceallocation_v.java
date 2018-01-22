package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_C_invoiceallocation_v 
{
 	@XendraView(Identifier="8ef4b5e8-82a3-f411-1616-7dfcc8c7b094",
Synchronized="2013-07-24 17:58:18.0",
Name="c_invoiceallocation_v",
Owner="xendra",
Extension="")
	public static final String Identifier = "8ef4b5e8-82a3-f411-1616-7dfcc8c7b094";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-24 17:58:18.0");
	sb.appendln("@Identifier=8ef4b5e8-82a3-f411-1616-7dfcc8c7b094");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("(SELECT i.ad_client_id, i.ad_org_id, i.dateinvoiced, i.c_bpartner_id, i.documentno, il.m_product_id, i.grandtotal, i.ispaid, i.salesrep_id, invoiceopen(i.c_invoice_id, NULL::numeric) AS invoiceopen, b.documentno AS boeno, b.duedate, a.amount AS payamt, b.c_bankaccount_id, i.issotrx, 'Letra de Cambio'::character varying AS type FROM ((((c_invoice i JOIN c_invoiceline il ON ((il.c_invoice_id = i.c_invoice_id))) JOIN c_allocationline a ON ((i.c_invoice_id = a.c_invoice_id))) JOIN c_boe b ON ((b.c_boe_id = a.record_id))) JOIN ad_table t ON ((a.ad_table_id = t.ad_table_id))) WHERE ((t.tablename)::text = 'C_BOE'::text) UNION SELECT i.ad_client_id, i.ad_org_id, i.dateinvoiced, i.c_bpartner_id, i.documentno, il.m_product_id, i.grandtotal, i.ispaid, i.salesrep_id, invoiceopen(i.c_invoice_id, NULL::numeric) AS invoiceopen, p.documentno AS boeno, p.datetrx AS duedate, a.amount AS payamt, p.c_bankaccount_id, i.issotrx, rt.name AS type FROM (((((c_invoice i JOIN c_invoiceline il ON ((il.c_invoice_id = i.c_invoice_id))) JOIN c_allocationline a ON ((i.c_invoice_id = a.c_invoice_id))) JOIN c_payment p ON ((p.c_payment_id = a.c_payment_id))) JOIN ad_ref_list r ON ((p.tendertype = (r.value)::bpchar))) JOIN ad_ref_list_trl rt ON ((r.ad_ref_list_id = rt.ad_ref_list_id))) WHERE ((COALESCE(a.ad_table_id, (0)::numeric) = (0)::numeric) AND (r.ad_reference_id = (214)::numeric))) UNION SELECT i.ad_client_id, i.ad_org_id, i.dateinvoiced, i.c_bpartner_id, i.documentno, il.m_product_id, i.grandtotal, i.ispaid, i.salesrep_id, invoiceopen(i.c_invoice_id, NULL::numeric) AS invoiceopen, ''::character varying AS boeno, NULL::timestamp without time zone AS duedate, NULL::numeric AS payamt, NULL::numeric AS c_bankaccount_id, i.issotrx, ''::character varying AS type FROM (c_invoice i JOIN c_invoiceline il ON ((il.c_invoice_id = i.c_invoice_id))) WHERE ((i.ispaid = 'N'::bpchar) AND (i.grandtotal > (0)::numeric)) ORDER BY 5;");
	return sb.toString();
}
}
