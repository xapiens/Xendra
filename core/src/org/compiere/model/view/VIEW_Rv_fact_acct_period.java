package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Rv_fact_acct_period 
{
 	@XendraView(Identifier="265010fb-d6cd-a6c8-b136-88c495f69dcd",
Synchronized="2013-07-09 19:02:34.0",
Name="rv_fact_acct_period",
Owner="xendra",
Extension="")
	public static final String Identifier = "265010fb-d6cd-a6c8-b136-88c495f69dcd";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=265010fb-d6cd-a6c8-b136-88c495f69dcd");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT fact_acct.ad_client_id, fact_acct.ad_org_id, fact_acct.c_acctschema_id, fact_acct.account_id, fact_acct.c_period_id, fact_acct.gl_category_id, fact_acct.gl_budget_id, fact_acct.c_tax_id, fact_acct.m_locator_id, fact_acct.postingtype, fact_acct.c_currency_id, sum(fact_acct.amtsourcedr) AS amtsourcedr, sum(fact_acct.amtsourcecr) AS amtsourcecr, sum((fact_acct.amtsourcedr - fact_acct.amtsourcecr)) AS amtsource, sum(fact_acct.amtacctdr) AS amtacctdr, sum(fact_acct.amtacctcr) AS amtacctcr, sum((fact_acct.amtacctdr - fact_acct.amtacctcr)) AS amtacct, CASE WHEN (sum((fact_acct.amtsourcedr - fact_acct.amtsourcecr)) = (0)::numeric) THEN (0)::numeric ELSE (sum((fact_acct.amtacctdr - fact_acct.amtacctcr)) / sum((fact_acct.amtsourcedr - fact_acct.amtsourcecr))) END AS rate, fact_acct.m_product_id, fact_acct.c_bpartner_id, fact_acct.ad_orgtrx_id, fact_acct.c_locfrom_id, fact_acct.c_locto_id, fact_acct.c_salesregion_id, fact_acct.c_project_id, fact_acct.c_campaign_id, fact_acct.c_activity_id, fact_acct.user1_id, fact_acct.user2_id, fact_acct.a_asset_id FROM fact_acct GROUP BY fact_acct.ad_client_id, fact_acct.ad_org_id, fact_acct.c_acctschema_id, fact_acct.account_id, fact_acct.c_period_id, fact_acct.gl_category_id, fact_acct.gl_budget_id, fact_acct.c_tax_id, fact_acct.m_locator_id, fact_acct.postingtype, fact_acct.c_currency_id, fact_acct.m_product_id, fact_acct.c_bpartner_id, fact_acct.ad_orgtrx_id, fact_acct.c_locfrom_id, fact_acct.c_locto_id, fact_acct.c_salesregion_id, fact_acct.c_project_id, fact_acct.c_campaign_id, fact_acct.c_activity_id, fact_acct.user1_id, fact_acct.user2_id, fact_acct.a_asset_id;");
	return sb.toString();
}
}
