package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Rv_c_invoicetax 
{
 	@XendraView(Identifier="951e10d3-aba8-15e5-a371-77fcbf286884",
Synchronized="2013-07-09 19:02:34.0",
Name="rv_c_invoicetax",
Owner="xendra",
Extension="")
	public static final String Identifier = "951e10d3-aba8-15e5-a371-77fcbf286884";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=951e10d3-aba8-15e5-a371-77fcbf286884");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT i.ad_client_id, i.ad_org_id, i.isactive, t.created, t.createdby, t.updated, t.updatedby, t.c_tax_id, i.c_invoice_id, i.c_doctype_id, i.c_bpartner_id, bp.taxid, bp.istaxexempt, i.dateacct, i.dateinvoiced, i.issotrx, i.documentno, i.ispaid, i.c_currency_id, CASE WHEN ((charat((d.docbasetype)::character varying, 3))::text = 'C'::text) THEN (t.taxbaseamt * ((-1))::numeric) ELSE t.taxbaseamt END AS taxbaseamt, CASE WHEN ((charat((d.docbasetype)::character varying, 3))::text = 'C'::text) THEN (t.taxamt * ((-1))::numeric) ELSE t.taxamt END AS taxamt, CASE WHEN ((charat((d.docbasetype)::character varying, 3))::text = 'C'::text) THEN ((t.taxbaseamt + t.taxamt) * ((-1))::numeric) ELSE (t.taxbaseamt + t.taxamt) END AS taxlinetotal, CASE WHEN ((charat((d.docbasetype)::character varying, 3))::text = 'C'::text) THEN (-1) ELSE 1 END AS multiplier FROM (((c_invoicetax t JOIN c_invoice i ON ((t.c_invoice_id = i.c_invoice_id))) JOIN c_doctype d ON ((i.c_doctype_id = d.c_doctype_id))) JOIN c_bpartner bp ON ((i.c_bpartner_id = bp.c_bpartner_id)));");
	return sb.toString();
}
}
