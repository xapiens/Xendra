package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Rv_click_month 
{
 	@XendraView(Identifier="450e7b96-385e-759a-42d9-a65ab9450c63",
Synchronized="2013-07-09 19:02:34.0",
Name="rv_click_month",
Owner="xendra",
Extension="")
	public static final String Identifier = "450e7b96-385e-759a-42d9-a65ab9450c63";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=450e7b96-385e-759a-42d9-a65ab9450c63");
	sb.appendln("@comment=Click by Month");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT cc.ad_client_id, cc.ad_org_id, cc.name, cc.description, cc.targeturl, cc.c_bpartner_id, firstof(c.created, 'MM'::character varying) AS created, count(*) AS counter FROM (w_clickcount cc JOIN w_click c ON ((cc.w_clickcount_id = c.w_clickcount_id))) WHERE (cc.isactive = 'Y'::bpchar) GROUP BY cc.ad_client_id, cc.ad_org_id, cc.name, cc.description, cc.targeturl, cc.c_bpartner_id, firstof(c.created, 'MM'::character varying);");
	return sb.toString();
}
}
