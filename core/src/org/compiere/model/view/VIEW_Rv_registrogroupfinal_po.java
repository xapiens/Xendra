package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Rv_registrogroupfinal_po 
{
 	@XendraView(Identifier="72276913-533c-69de-69dc-f3e37c3f7017",
Synchronized="2013-07-09 19:02:34.0",
Name="rv_registrogroupfinal_po",
Owner="xendra",
Extension="")
	public static final String Identifier = "72276913-533c-69de-69dc-f3e37c3f7017";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=72276913-533c-69de-69dc-f3e37c3f7017");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT max(i.ad_client_id) AS ad_client_id, max(i.ad_org_id) AS ad_org_id, 'Y' AS isactive, max(i.created) AS created, max(i.createdby) AS createdby, max(i.updated) AS updated, max(i.updatedby) AS updatedby, 1000027 AS c_acctschema_id, bp.c_bpartner_id, bp.value, bp.name, sum(t.grandamtsource) AS amtsource, sum(t.grandamtacct) AS amtacct, 1000030 AS c_docgroup_id, to_timestamp('2009-12-01 00:00:00.0'::text, 'yyyy/MM/dd'::text) AS dateacct FROM ((((((rv_registrohorizontal t JOIN c_invoice i ON ((t.record_id = i.c_invoice_id))) JOIN c_doctype d ON ((i.c_doctype_id = d.c_doctype_id))) JOIN c_bpartner bp ON ((i.c_bpartner_id = bp.c_bpartner_id))) JOIN c_currency cu ON ((cu.c_currency_id = i.c_currency_id))) LEFT JOIN c_project prj ON ((prj.c_project_id = i.c_project_id))) JOIN ad_user sr ON ((sr.ad_user_id = i.salesrep_id))) WHERE ((i.dateacct >= to_timestamp('2009-12-01 00:00:00.0'::text, 'yyyy/MM/dd'::text)) AND (i.dateacct <= to_timestamp('2009-12-31 00:00:00.0'::text, 'yyyy/MM/dd'::text))) GROUP BY bp.c_bpartner_id, bp.value, bp.name;");
	return sb.toString();
}
}
