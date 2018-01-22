package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_C_dunning_line_vt 
{
 	@XendraView(Identifier="49b63e30-597b-d71c-3f89-99f89d8db66f",
Synchronized="2013-07-09 19:02:34.0",
Name="c_dunning_line_vt",
Owner="xendra",
Extension="")
	public static final String Identifier = "49b63e30-597b-d71c-3f89-99f89d8db66f";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=49b63e30-597b-d71c-3f89-99f89d8db66f");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT drl.ad_client_id, drl.ad_org_id, drl.isactive, drl.created, drl.createdby, drl.updated, drl.updatedby, COALESCE(dt.ad_language, dtp.ad_language) AS ad_language, drl.c_dunningrunline_id, drl.c_dunningrunentry_id, drl.amt, drl.convertedamt, drl.daysdue, drl.timesdunned, drl.interestamt, drl.feeamt, drl.totalamt, drl.c_invoice_id, COALESCE(i.issotrx, p.isreceipt) AS issotrx, COALESCE(i.documentno, p.documentno) AS documentno, COALESCE(i.docstatus, p.docstatus) AS docstatus, COALESCE(i.dateinvoiced, p.datetrx) AS datetrx, COALESCE(i.c_doctype_id, p.c_doctype_id) AS c_doctype_id, COALESCE(dt.printname, dtp.printname) AS documenttype, COALESCE(i.description, p.description) AS description, COALESCE(i.c_currency_id, p.c_currency_id) AS c_currency_id, COALESCE(i.c_campaign_id, p.c_campaign_id) AS c_campaign_id, COALESCE(i.c_project_id, p.c_project_id) AS c_project_id, COALESCE(i.c_activity_id, p.c_activity_id) AS c_activity_id, COALESCE(i.user1_id, p.user1_id) AS user1_id, COALESCE(i.user2_id, p.user2_id) AS user2_id, COALESCE(i.dateacct, p.dateacct) AS dateacct, COALESCE(i.c_conversiontype_id, i.c_conversiontype_id) AS c_conversiontype_id, COALESCE(i.ad_orgtrx_id, p.ad_orgtrx_id) AS ad_orgtrx_id, i.poreference, i.dateordered, i.dateinvoiced, i.isindispute, pt.name AS paymentterm, i.c_charge_id, i.chargeamt, i.totallines, i.grandtotal, i.grandtotal AS amtinwords, i.m_pricelist_id, i.ispaid, p.isallocated, p.tendertype, p.discountamt FROM (((((c_dunningrunline drl LEFT JOIN c_invoice i ON ((drl.c_invoice_id = i.c_invoice_id))) LEFT JOIN c_doctype_trl dt ON ((i.c_doctype_id = dt.c_doctype_id))) LEFT JOIN c_paymentterm_trl pt ON (((i.c_paymentterm_id = pt.c_paymentterm_id) AND ((pt.ad_language)::text = (dt.ad_language)::text)))) LEFT JOIN c_payment p ON ((drl.c_payment_id = p.c_payment_id))) LEFT JOIN c_doctype_trl dtp ON ((p.c_doctype_id = dtp.c_doctype_id))) WHERE ((COALESCE(dt.ad_language, dtp.ad_language))::text = (COALESCE(dtp.ad_language, dt.ad_language))::text);");
	return sb.toString();
}
}
