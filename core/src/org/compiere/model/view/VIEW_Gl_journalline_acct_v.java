package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Gl_journalline_acct_v 
{
 	@XendraView(Identifier="97228695-cb7f-b202-6e6c-b2d8cb9159a5",
Synchronized="2013-07-09 19:02:34.0",
Name="gl_journalline_acct_v",
Owner="xendra",
Extension="")
	public static final String Identifier = "97228695-cb7f-b202-6e6c-b2d8cb9159a5";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=97228695-cb7f-b202-6e6c-b2d8cb9159a5");
	sb.appendln("@comment=General Ledger Journal Line");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT gl.gl_journalline_id, gl.ad_client_id, gl.ad_org_id, gl.isactive, gl.created, gl.createdby, gl.updated, gl.updatedby, gl.gl_journal_id, gl.line, gl.isgenerated, gl.description, gl.amtsourcedr, gl.amtsourcecr, gl.c_currency_id, gl.c_conversiontype_id, gl.currencyrate, gl.dateacct, gl.amtacctdr, gl.amtacctcr, gl.c_uom_id, gl.qty, gl.c_validcombination_id, vc.c_acctschema_id, vc.account_id, vc.m_product_id, vc.c_bpartner_id, vc.ad_orgtrx_id, vc.c_locfrom_id, vc.c_locto_id, vc.c_salesregion_id, vc.c_project_id, vc.c_campaign_id, vc.user1_id, vc.user2_id, vc.isfullyqualified, vc.c_activity_id FROM gl_journalline gl, c_validcombination vc WHERE (gl.c_validcombination_id = vc.c_validcombination_id);");
	return sb.toString();
}
}
