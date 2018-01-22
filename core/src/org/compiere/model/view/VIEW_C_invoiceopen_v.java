package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_C_invoiceopen_v 
{
 	@XendraView(Identifier="68ffc469-b711-562f-2091-ff4594c4b7d7",
Synchronized="2013-07-24 17:58:18.0",
Name="c_invoiceopen_v",
Owner="xendra",
Extension="")
	public static final String Identifier = "68ffc469-b711-562f-2091-ff4594c4b7d7";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-24 17:58:18.0");
	sb.appendln("@Identifier=68ffc469-b711-562f-2091-ff4594c4b7d7");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT i.ad_client_id, i.ad_org_id, i.dateinvoiced, (i.dateinvoiced + t.netdays) AS duedate, date_diff(('now'::text)::date, (i.dateinvoiced + t.netdays)) AS dueday, i.c_bpartner_id, i.c_doctype_id, i.documentno, i.grandtotal, i.issotrx, i.salesrep_id, invoiceopen(i.c_invoice_id, NULL::numeric) AS invoiceope FROM (c_invoice i JOIN c_paymentterm t ON ((t.c_paymentterm_id = i.c_paymentterm_id))) WHERE ((i.ispaid = 'N'::bpchar) AND (NOT (invoiceopen(i.c_invoice_id, NULL::numeric) = (0)::numeric)));");
	return sb.toString();
}
}
