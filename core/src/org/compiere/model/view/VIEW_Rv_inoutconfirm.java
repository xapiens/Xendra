package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Rv_inoutconfirm 
{
 	@XendraView(Identifier="95e03711-29b4-7bd4-91fd-3de0a2484635",
Synchronized="2013-07-09 19:02:34.0",
Name="rv_inoutconfirm",
Owner="xendra",
Extension="")
	public static final String Identifier = "95e03711-29b4-7bd4-91fd-3de0a2484635";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=95e03711-29b4-7bd4-91fd-3de0a2484635");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT c.m_inoutconfirm_id, c.ad_client_id, c.ad_org_id, c.isactive, c.created, c.createdby, c.updated, c.updatedby, c.m_inout_id, c.documentno, c.confirmtype, c.isapproved, c.iscancelled, c.description, c.processing, c.processed, i.c_bpartner_id, i.c_bpartner_location_id, i.m_warehouse_id, i.c_order_id, i.issotrx FROM (m_inoutconfirm c JOIN m_inout i ON ((c.m_inout_id = i.m_inout_id)));");
	return sb.toString();
}
}
