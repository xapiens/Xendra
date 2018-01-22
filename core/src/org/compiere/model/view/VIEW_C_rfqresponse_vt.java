package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_C_rfqresponse_vt 
{
 	@XendraView(Identifier="3b49bf09-8eb8-fd0e-3039-dd9aad79ccc7",
Synchronized="2013-07-09 19:02:34.0",
Name="c_rfqresponse_vt",
Owner="xendra",
Extension="")
	public static final String Identifier = "3b49bf09-8eb8-fd0e-3039-dd9aad79ccc7";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=3b49bf09-8eb8-fd0e-3039-dd9aad79ccc7");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT rr.c_rfqresponse_id, rr.c_rfq_id, rr.ad_client_id, rr.ad_org_id, rr.isactive, rr.created, rr.createdby, rr.updated, rr.updatedby, l.ad_language, oi.c_location_id AS org_location_id, oi.taxid, r.name, r.description, r.help, r.c_currency_id, c.iso_code, r.dateresponse, r.dateworkstart, r.deliverydays, rr.c_bpartner_id, bp.name AS bpname, bp.name2 AS bpname2, rr.c_bpartner_location_id, bpl.c_location_id, rr.ad_user_id, bpc.title, bpc.phone, NULLIF((bpc.name)::text, (bp.name)::text) AS contactname FROM (((((((c_rfqresponse rr JOIN c_rfq r ON ((rr.c_rfq_id = r.c_rfq_id))) JOIN ad_orginfo oi ON ((rr.ad_org_id = oi.ad_org_id))) JOIN c_currency c ON ((r.c_currency_id = c.c_currency_id))) JOIN c_bpartner bp ON ((rr.c_bpartner_id = bp.c_bpartner_id))) JOIN c_bpartner_location bpl ON ((rr.c_bpartner_location_id = bpl.c_bpartner_location_id))) LEFT JOIN ad_user bpc ON ((rr.ad_user_id = bpc.ad_user_id))) JOIN ad_language l ON ((l.issystemlanguage = 'Y'::bpchar)));");
	return sb.toString();
}
}
