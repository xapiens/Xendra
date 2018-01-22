package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Rv_inoutlineconfirm 
{
 	@XendraView(Identifier="87467762-f23f-3f78-4667-21b98f97f8e9",
Synchronized="2013-07-09 19:02:34.0",
Name="rv_inoutlineconfirm",
Owner="xendra",
Extension="")
	public static final String Identifier = "87467762-f23f-3f78-4667-21b98f97f8e9";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=87467762-f23f-3f78-4667-21b98f97f8e9");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT cl.m_inoutconfirm_id, cl.m_inoutlineconfirm_id, cl.ad_client_id, cl.ad_org_id, cl.isactive, cl.created, cl.createdby, cl.updated, cl.updatedby, cl.targetqty, cl.confirmedqty, cl.differenceqty, cl.scrappedqty, cl.description, cl.processed, c.m_inout_id, c.documentno, c.confirmtype, c.isapproved, c.iscancelled, i.c_bpartner_id, i.c_bpartner_location_id, i.m_warehouse_id, i.c_order_id, i.issotrx, cl.m_inoutline_id, il.m_product_id, il.m_attributesetinstance_id, il.m_locator_id FROM (((m_inoutlineconfirm cl JOIN m_inoutconfirm c ON ((cl.m_inoutconfirm_id = c.m_inoutconfirm_id))) JOIN m_inout i ON ((c.m_inout_id = i.m_inout_id))) JOIN m_inoutline il ON ((cl.m_inoutline_id = il.m_inoutline_id)));");
	return sb.toString();
}
}
