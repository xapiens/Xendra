package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Rv_projectlineissue 
{
 	@XendraView(Identifier="4b96270f-f642-ac55-8bd2-ba03f75a11e9",
Synchronized="2013-07-09 19:02:34.0",
Name="rv_projectlineissue",
Owner="xendra",
Extension="")
	public static final String Identifier = "4b96270f-f642-ac55-8bd2-ba03f75a11e9";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=4b96270f-f642-ac55-8bd2-ba03f75a11e9");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT COALESCE(l.ad_client_id, i.ad_client_id) AS ad_client_id, COALESCE(l.ad_org_id, i.ad_org_id) AS ad_org_id, COALESCE(l.isactive, i.isactive) AS isactive, COALESCE(l.created, i.created) AS created, COALESCE(l.createdby, i.createdby) AS createdby, COALESCE(l.updated, i.updated) AS updated, COALESCE(l.updatedby, i.updatedby) AS updatedby, COALESCE(l.c_project_id, i.c_project_id) AS c_project_id, COALESCE(l.m_product_id, i.m_product_id) AS m_product_id, l.c_projectline_id, l.line, l.description, l.plannedqty, l.plannedprice, l.plannedamt, l.plannedmarginamt, l.committedqty, i.c_projectissue_id, i.m_locator_id, i.movementqty, i.movementdate, i.line AS issueline, i.description AS issuedescription, i.m_inoutline_id, i.s_timeexpenseline_id, fa.c_acctschema_id, fa.account_id, fa.amtsourcedr, fa.amtsourcecr, fa.amtacctdr, fa.amtacctcr, ((l.plannedamt - fa.amtsourcedr) + fa.amtsourcecr) AS linemargin FROM ((c_projectline l FULL JOIN c_projectissue i ON (((i.c_project_id = l.c_project_id) AND (i.c_projectissue_id = l.c_projectissue_id)))) LEFT JOIN fact_acct fa ON ((((fa.ad_table_id = (623)::numeric) AND (fa.record_id = i.c_projectissue_id)) AND (fa.m_locator_id IS NULL))));");
	return sb.toString();
}
}
