package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_T_invoicegl_vt 
{
 	@XendraView(Identifier="ada29eb5-f325-c710-bf88-3db4e2eaddca",
Synchronized="2013-07-09 19:02:34.0",
Name="t_invoicegl_vt",
Owner="xendra",
Extension="")
	public static final String Identifier = "ada29eb5-f325-c710-bf88-3db4e2eaddca";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=ada29eb5-f325-c710-bf88-3db4e2eaddca");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT i.ad_client_id, i.ad_org_id, i.isactive, i.created, i.createdby, i.updated, i.updatedby, i.c_invoice_id, i.issotrx, i.documentno, i.docstatus, i.c_doctype_id, i.c_order_id, i.description, i.salesrep_id, i.dateinvoiced, i.dateacct, i.c_paymentterm_id, i.c_bpartner_id, i.c_bpartner_location_id, i.ad_user_id, i.isselfservice, i.c_currency_id, i.c_conversiontype_id, i.grandtotal, i.istaxincluded, i.c_campaign_id, i.c_project_id, i.c_activity_id, i.ad_orgtrx_id, i.user1_id, i.user2_id, fa.c_locfrom_id, fa.c_locto_id, fa.c_salesregion_id, fa.fact_acct_id, fa.c_acctschema_id, fa.account_id, fa.c_period_id, fa.gl_category_id, fa.gl_budget_id, fa.c_tax_id, fa.m_locator_id, fa.postingtype, fa.amtsourcedr, fa.amtsourcecr, fa.amtacctdr, fa.amtacctcr, fa.c_uom_id, fa.qty, gl.ad_pinstance_id, gl.apar, gl.openamt, gl.percent, gl.amtrevaldr, gl.amtrevalcr, gl.datereval, gl.c_conversiontypereval_id, gl.amtsourcebalance, gl.amtacctbalance, gl.c_doctypereval_id, gl.amtrevaldrdiff, gl.amtrevalcrdiff, gl.isallcurrencies, ((fa.amtacctdr * gl.percent) / (100)::numeric) AS amtacctopendr, ((fa.amtacctcr * gl.percent) / (100)::numeric) AS amtacctopencr, (((fa.amtacctdr - fa.amtacctcr) * gl.percent) / (100)::numeric) AS amtacctopenbalance FROM ((t_invoicegl gl JOIN c_invoice i ON ((gl.c_invoice_id = i.c_invoice_id))) JOIN fact_acct fa ON ((gl.fact_acct_id = fa.fact_acct_id)));");
	return sb.toString();
}
}
