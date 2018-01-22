package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Rv_requestupdates_only 
{
 	@XendraView(Identifier="dce547e4-44a4-3b69-81cf-c637c655336f",
Synchronized="2013-07-09 19:02:34.0",
Name="rv_requestupdates_only",
Owner="xendra",
Extension="")
	public static final String Identifier = "dce547e4-44a4-3b69-81cf-c637c655336f";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=dce547e4-44a4-3b69-81cf-c637c655336f");
	sb.appendln("@comment=Distinct Recipients of Requests");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT min(rv_requestupdates.ad_client_id) AS ad_client_id, min(rv_requestupdates.ad_org_id) AS ad_org_id, 'Y'::bpchar AS isactive, getdate() AS created, 0 AS createdby, getdate() AS updated, 0 AS updatedby, rv_requestupdates.r_request_id, rv_requestupdates.ad_user_id FROM rv_requestupdates WHERE (rv_requestupdates.isactive = 'Y'::bpchar) GROUP BY rv_requestupdates.r_request_id, rv_requestupdates.ad_user_id;");
	return sb.toString();
}
}
