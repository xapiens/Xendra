package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_C_invoiceboeopen_v 
{
 	@XendraView(Identifier="df539def-dc1f-6f5a-3612-5ecdba94b8a6",
Synchronized="2013-07-24 17:58:18.0",
Name="c_invoiceboeopen_v",
Owner="xendra",
Extension="")
	public static final String Identifier = "df539def-dc1f-6f5a-3612-5ecdba94b8a6";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-24 17:58:18.0");
	sb.appendln("@Identifier=df539def-dc1f-6f5a-3612-5ecdba94b8a6");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT i.ad_client_id, i.ad_org_id, i.dateinvoiced AS date1, i.c_bpartner_id, bp.taxid, i.documentno, i.grandtotal, bp.salesrep_id, i.issotrx, invoiceopen(i.c_invoice_id, NULL::numeric) AS open, i.c_doctype_id, (i.dateinvoiced + t.netdays) AS duedate, date_diff(('now'::text)::date, (i.dateinvoiced + t.netdays)) AS dueday FROM ((c_invoice i JOIN c_bpartner bp ON ((bp.c_bpartner_id = i.c_bpartner_id))) JOIN c_paymentterm t ON ((t.c_paymentterm_id = i.c_paymentterm_id))) WHERE ((i.ispaid = 'N'::bpchar) AND (NOT (invoiceopen(i.c_invoice_id, NULL::numeric) = (0)::numeric))) UNION SELECT b.ad_client_id, b.ad_org_id, b.dateboe AS date1, b.c_bpartner_id, bp.taxid, b.documentno, b.grandtotal, bp.salesrep_id, b.issotrx, boeopen(b.c_boe_id) AS open, b.c_doctype_id, b.duedate, date_diff(('now'::text)::date, (b.duedate)::date) AS dueday FROM (c_boe b JOIN c_bpartner bp ON ((bp.c_bpartner_id = b.c_bpartner_id))) WHERE ((b.ispaid = 'N'::bpchar) AND (NOT (boeopen(b.c_boe_id) = (0)::numeric)));");
	return sb.toString();
}
}
