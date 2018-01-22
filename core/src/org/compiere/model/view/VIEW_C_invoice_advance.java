package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_C_invoice_advance 
{
 	@XendraView(Identifier="8b6a11a0-24d6-2e13-4a11-5c2b613f22d3",
Synchronized="2017-06-26 11:10:34.0",
Name="c_invoice_advance",
Owner="xendra",
Extension="")
	public static final String Identifier = "8b6a11a0-24d6-2e13-4a11-5c2b613f22d3";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2017-06-26 11:10:34.0");
	sb.appendln("@Identifier=8b6a11a0-24d6-2e13-4a11-5c2b613f22d3");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT i.c_invoice_id, sum(il.linenetamt) AS total, 0 AS used, max(il.c_charge_id) AS c_charge_id, i.c_bpartner_id, i.c_currency_id FROM (c_invoiceline il JOIN c_invoice i ON ((il.c_invoice_id = i.c_invoice_id))) WHERE ((i.isadvance = 'Y'::bpchar) AND (i.docstatus = ANY (ARRAY['CO'::bpchar, 'CL'::bpchar]))) GROUP BY i.c_invoice_id UNION SELECT i.c_invoice_id, 0 AS total, sum(abs(il.linenetamt)) AS used, 0 AS c_charge_id, i.c_bpartner_id, i.c_currency_id FROM (c_invoiceline il JOIN c_invoice i ON ((i.c_invoice_id = il.c_invoiceadvance_id))) WHERE ((i.isadvance = 'Y'::bpchar) AND (i.docstatus = ANY (ARRAY['CO'::bpchar, 'CL'::bpchar]))) GROUP BY i.c_invoice_id;");
	return sb.toString();
}
}
