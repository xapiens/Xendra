package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_C_boe_vt 
{
 	@XendraView(Identifier="839e480a-ad00-6748-2283-74ea3c73a9e8",
Synchronized="2013-07-09 19:02:34.0",
Name="c_boe_vt",
Owner="xendra",
Extension="")
	public static final String Identifier = "839e480a-ad00-6748-2283-74ea3c73a9e8";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=839e480a-ad00-6748-2283-74ea3c73a9e8");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT (SELECT c_invoice.documentno FROM c_invoice WHERE (c_invoice.c_invoice_id IN (SELECT max(c_boeline.c_invoice_id) AS max FROM c_boeline WHERE (c_boeline.c_boeline_id IN (SELECT c_boeline.c_boeline_id FROM c_boeline WHERE (c_boeline.c_boe_id = b.c_boe_id)))))) AS documentinvoice, b.ad_client_id, b.ad_org_id, b.c_boe_id, b.c_bpartner_id, b.c_bpartner_location_id, b.c_currency_id, b.c_doctype_id, b.created, b.createdby, b.description, b.documentno, b.duedate, b.grandtotal, b.isactive, b.updated, b.updatedby, b.issotrx, b.guarantor_id, b.c_bankaccount_id, b.processed, b.boeno, b.ispaid, b.dateacct, b.docaction, b.dateboe, b.datestatusboe, b.c_doctypetarget_id, b.docstatus, b.c_boegroup_id, b.processing, b.c_project_id, b.c_conversiontype_id, b.c_payment_id, b.statusdate, b.isallocated, b.refinance, b.isrefinanced, b.refinancedoc, b.refinancedays, b.retentionamt, bp.value, bp.taxid, (SELECT bpl.name FROM c_bpartner_location bpl WHERE (bpl.c_bpartner_id = b.c_bpartner_id) LIMIT 1) AS name, 'es_PE'::text AS ad_language, (SELECT bpl.phone FROM c_bpartner_location bpl WHERE (bpl.c_bpartner_id = b.c_bpartner_id) LIMIT 1) AS phone, (SELECT bpl.phone2 FROM c_bpartner_location bpl WHERE (bpl.c_bpartner_id = b.c_bpartner_id) LIMIT 1) AS phone2, (SELECT bpl.fax FROM c_bpartner_location bpl WHERE (bpl.c_bpartner_id = b.c_bpartner_id) LIMIT 1) AS fax, cur.description AS currency_desc, cur.cursymbol, b.r_dateboe, b.r_amount, b.r_documentno, b.r_duedate, 1 AS multiplier FROM ((c_boe b LEFT JOIN c_bpartner bp ON ((bp.c_bpartner_id = b.c_bpartner_id))) JOIN c_currency_trl cur ON ((b.c_currency_id = cur.c_currency_id)));");
	return sb.toString();
}
}
