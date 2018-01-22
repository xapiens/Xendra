package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Rv_click_unprocessed 
{
 	@XendraView(Identifier="f3a7acfd-1400-966d-b7c8-9019c1ba5c66",
Synchronized="2013-07-09 19:02:34.0",
Name="rv_click_unprocessed",
Owner="xendra",
Extension="")
	public static final String Identifier = "f3a7acfd-1400-966d-b7c8-9019c1ba5c66";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=f3a7acfd-1400-966d-b7c8-9019c1ba5c66");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT w_click.w_click_id, w_click.ad_client_id, w_click.ad_org_id, w_click.isactive, w_click.created, w_click.createdby, w_click.updated, w_click.updatedby, w_click.targeturl, w_click.referrer, w_click.remote_host, w_click.remote_addr, w_click.useragent, w_click.acceptlanguage, w_click.processed, w_click.w_clickcount_id, w_click.ad_user_id, w_click.email FROM w_click WHERE ((w_click.w_clickcount_id IS NULL) OR (w_click.processed = 'N'::bpchar));");
	return sb.toString();
}
}
