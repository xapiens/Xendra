package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Ad_org_v 
{
 	@XendraView(Identifier="f95adefb-b165-270a-9b1a-a685b6f19eac",
Synchronized="2013-07-09 19:02:34.0",
Name="ad_org_v",
Owner="xendra",
Extension="")
	public static final String Identifier = "f95adefb-b165-270a-9b1a-a685b6f19eac";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=f95adefb-b165-270a-9b1a-a685b6f19eac");
	sb.appendln("@comment=Organizational entity within client");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT o.ad_client_id, o.ad_org_id, o.isactive, o.created, o.createdby, o.updated, o.updatedby, o.value, o.name, o.description, o.issummary, i.c_location_id, i.duns, i.taxid, i.supervisor_id, i.parent_org_id, i.ad_orgtype_id, i.m_warehouse_id, bp.c_bpartner_id FROM ((ad_org o JOIN ad_orginfo i ON ((o.ad_org_id = i.ad_org_id))) LEFT JOIN c_bpartner bp ON ((o.ad_org_id = bp.ad_orgbp_id)));");
	return sb.toString();
}
}
