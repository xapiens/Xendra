package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_C_payselection_check_vt 
{
 	@XendraView(Identifier="63fca43e-d539-2713-98d4-cf6a632960ed",
Synchronized="2013-07-09 19:02:34.0",
Name="c_payselection_check_vt",
Owner="xendra",
Extension="")
	public static final String Identifier = "63fca43e-d539-2713-98d4-cf6a632960ed";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=63fca43e-d539-2713-98d4-cf6a632960ed");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT psc.ad_client_id, psc.ad_org_id, l.ad_language, psc.c_payselection_id, psc.c_payselectioncheck_id, oi.c_location_id AS org_location_id, oi.taxid, 0 AS c_doctype_id, bp.c_bpartner_id, bp.value AS bpvalue, bp.taxid AS bptaxid, bp.naics, bp.duns, bpg.greeting AS bpgreeting, bp.name, bp.name2, bpartnerremitlocation(bp.c_bpartner_id) AS c_location_id, bp.referenceno, bp.poreference, ps.paydate, p.deferreddate, p.alias, psc.payamt, psc.payamt AS amtinwords, psc.qty, psc.paymentrule, psc.documentno FROM ((((((c_payselectioncheck psc JOIN c_payselection ps ON ((psc.c_payselection_id = ps.c_payselection_id))) JOIN c_bpartner bp ON ((psc.c_bpartner_id = bp.c_bpartner_id))) LEFT JOIN c_payment p ON ((psc.c_payment_id = p.c_payment_id))) JOIN ad_orginfo oi ON ((psc.ad_org_id = oi.ad_org_id))) LEFT JOIN ad_language l ON ((l.issystemlanguage = 'Y'::bpchar))) LEFT JOIN c_greeting_trl bpg ON (((bp.c_greeting_id = bpg.c_greeting_id) AND ((bpg.ad_language)::text = (l.ad_language)::text))));");
	return sb.toString();
}
}
