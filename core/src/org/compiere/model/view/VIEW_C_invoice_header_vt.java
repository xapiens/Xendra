package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_C_invoice_header_vt 
{
 	@XendraView(Identifier="183d7bbf-2fa9-3120-f56a-ed8fb508fb9a",
Synchronized="2013-07-09 19:02:34.0",
Name="c_invoice_header_vt",
Owner="xendra",
Extension="")
	public static final String Identifier = "183d7bbf-2fa9-3120-f56a-ed8fb508fb9a";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=183d7bbf-2fa9-3120-f56a-ed8fb508fb9a");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT i.ad_client_id, i.ad_org_id, i.isactive, i.created, i.createdby, i.updated, i.updatedby, dt.ad_language, i.c_invoice_id, i.issotrx, i.serial, i.documentno, i.docstatus, i.c_doctype_id, i.c_bpartner_id, bp.value AS bpvalue, bp.taxid AS bptaxid, bp.naics, bp.duns, oi.c_location_id AS org_location_id, oi.taxid, dt.printname AS documenttype, dt.documentnote AS documenttypenote, i.c_order_id, i.salesrep_id, COALESCE(ubp.name, u.name) AS salesrep_name, i.dateinvoiced, bpg.greeting AS bpgreeting, bp.name, bp.name2, bpcg.greeting AS bpcontactgreeting, bpc.title, bpc.phone, NULLIF((bpc.name)::text, (bp.name)::text) AS contactname, bpl.c_location_id, bp.referenceno, ((l.postal)::text || (l.postal_add)::text) AS postal, i.description, i.poreference, i.dateordered, i.c_currency_id, pt.name AS paymentterm, pt.documentnote AS paymenttermnote, i.c_charge_id, i.chargeamt, i.totallines, i.grandtotal, i.grandtotal AS amtinwords, i.m_pricelist_id, i.istaxincluded, i.c_campaign_id, i.c_project_id, i.c_activity_id, i.ispaid, l.address1, l.address2, l.city, ctry.name AS countryname, cur.description AS currency_desc, cur.cursymbol, ref.serial AS refserial, ref.documentno AS refdocumentno, ref.c_invoice_id AS ref_invoice_id, paymenttermduedate(i.c_paymentterm_id, (i.dateinvoiced)::timestamp with time zone) AS duedate, i.fact_id, getnetamtbyinvoice(i.c_invoice_id) AS netamt, gettaxbyinvoice(i.c_invoice_id) AS tax, gettaxbyinvoice(i.c_invoice_id) AS amtinwordstax, getinoutbyinvoice(i.c_invoice_id) AS inoutsdocs, tax.taxalias, tax.rate, tax.name AS taxname FROM ((((((((((((((((c_invoice i JOIN c_doctype_trl dt ON ((i.c_doctype_id = dt.c_doctype_id))) JOIN c_paymentterm_trl pt ON (((i.c_paymentterm_id = pt.c_paymentterm_id) AND ((dt.ad_language)::text = (pt.ad_language)::text)))) JOIN c_bpartner bp ON ((i.c_bpartner_id = bp.c_bpartner_id))) LEFT JOIN c_greeting_trl bpg ON (((bp.c_greeting_id = bpg.c_greeting_id) AND ((dt.ad_language)::text = (bpg.ad_language)::text)))) JOIN c_bpartner_location bpl ON ((i.c_bpartner_location_id = bpl.c_bpartner_location_id))) JOIN c_location l ON ((bpl.c_location_id = l.c_location_id))) LEFT JOIN ad_user bpc ON ((i.ad_user_id = bpc.ad_user_id))) LEFT JOIN c_greeting_trl bpcg ON (((bpc.c_greeting_id = bpcg.c_greeting_id) AND ((dt.ad_language)::text = (bpcg.ad_language)::text)))) JOIN ad_orginfo oi ON ((i.ad_org_id = oi.ad_org_id))) LEFT JOIN ad_user u ON ((i.salesrep_id = u.ad_user_id))) LEFT JOIN c_bpartner ubp ON ((u.c_bpartner_id = ubp.c_bpartner_id))) LEFT JOIN c_country ctry ON ((l.c_country_id = ctry.c_country_id))) JOIN c_currency_trl cur ON ((i.c_currency_id = cur.c_currency_id))) LEFT JOIN c_invoice ref ON ((i.ref_invoice_id = ref.c_invoice_id))) JOIN c_invoicetax itax ON ((i.c_invoice_id = itax.c_invoice_id))) JOIN c_tax tax ON ((tax.c_tax_id = itax.c_tax_id)));");
	return sb.toString();
}
}
