package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_C_dunning_header_vt 
{
 	@XendraView(Identifier="6fa45fad-e5c2-f2fd-87ba-7b83d9378253",
Synchronized="2013-07-09 19:02:34.0",
Name="c_dunning_header_vt",
Owner="xendra",
Extension="")
	public static final String Identifier = "6fa45fad-e5c2-f2fd-87ba-7b83d9378253";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=6fa45fad-e5c2-f2fd-87ba-7b83d9378253");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT dr.ad_client_id, dr.ad_org_id, dr.isactive, dr.created, dr.createdby, dr.updated, dr.updatedby, dlt.ad_language, dr.c_dunningrun_id, dre.c_dunningrunentry_id, dr.dunningdate, dlt.printname, dlt.note AS documentnote, dre.c_bpartner_id, bp.value AS bpvalue, bp.taxid AS bptaxid, bp.naics, bp.duns, oi.c_location_id AS org_location_id, oi.taxid, dre.salesrep_id, COALESCE(ubp.name, u.name) AS salesrep_name, bpg.greeting AS bpgreeting, bp.name, bp.name2, bpcg.greeting AS bpcontactgreeting, bpc.title, bpc.phone, NULLIF((bpc.name)::text, (bp.name)::text) AS contactname, bpl.c_location_id, bp.referenceno, ((l.postal)::text || (l.postal_add)::text) AS postal, dre.amt, dre.qty, dre.note FROM ((((((((((((c_dunningrun dr JOIN c_dunninglevel dl ON ((dr.c_dunninglevel_id = dl.c_dunninglevel_id))) JOIN c_dunninglevel_trl dlt ON ((dl.c_dunninglevel_id = dlt.c_dunninglevel_id))) JOIN c_dunningrunentry dre ON ((dr.c_dunningrun_id = dre.c_dunningrun_id))) JOIN c_bpartner bp ON ((dre.c_bpartner_id = bp.c_bpartner_id))) LEFT JOIN c_greeting_trl bpg ON (((bp.c_greeting_id = bpg.c_greeting_id) AND ((dlt.ad_language)::text = (bpg.ad_language)::text)))) JOIN c_bpartner_location bpl ON ((dre.c_bpartner_location_id = bpl.c_bpartner_location_id))) JOIN c_location l ON ((bpl.c_location_id = l.c_location_id))) LEFT JOIN ad_user bpc ON ((dre.ad_user_id = bpc.ad_user_id))) LEFT JOIN c_greeting_trl bpcg ON (((bpc.c_greeting_id = bpcg.c_greeting_id) AND ((dlt.ad_language)::text = (bpcg.ad_language)::text)))) JOIN ad_orginfo oi ON ((dr.ad_org_id = oi.ad_org_id))) LEFT JOIN ad_user u ON ((dre.salesrep_id = u.ad_user_id))) LEFT JOIN c_bpartner ubp ON ((u.c_bpartner_id = ubp.c_bpartner_id)));");
	return sb.toString();
}
}
