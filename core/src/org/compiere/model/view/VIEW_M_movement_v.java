package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_M_movement_v 
{
 	@XendraView(Identifier="dff591a4-27f5-a1e6-dc1e-aefa854209ac",
Synchronized="2013-07-09 19:02:34.0",
Name="m_movement_v",
Owner="xendra",
Extension="")
	public static final String Identifier = "dff591a4-27f5-a1e6-dc1e-aefa854209ac";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=dff591a4-27f5-a1e6-dc1e-aefa854209ac");
	sb.appendln("@comment=Movement of Inventory");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT m.m_movement_id, m.ad_client_id, m.ad_org_id, m.isactive, m.created, m.createdby, m.updatedby, m.updated, m.documentno, m.description, m.movementdate, m.posted, m.processed, m.processing, m.ad_orgtrx_id, m.c_project_id, m.c_campaign_id, m.c_activity_id, m.user1_id, m.user2_id, m.datereceived, m.docaction, m.docstatus, m.isintransit, m.c_doctype_id, m.isapproved, m.approvalamt, m.fact_id, m.nopackages, m.vehicle, m.m_shipper_id, m.trackingno, m.shipdate, m.deliveryviarule, getaddressfromlocator(ml.m_locator_id) AS fromlocatoraddress, getaddressfromlocator(ml.m_locatorto_id) AS tolocatoraddress, getwarehousenamefromlocator(ml.m_locator_id) AS fromwarehousename, getwarehousenamefromlocator(ml.m_locatorto_id) AS towarehousename, getwarehousevaluefromlocator(ml.m_locator_id) AS fromwarehousevalue, getwarehousevaluefromlocator(ml.m_locatorto_id) AS towarehousevalue FROM (m_movement m LEFT JOIN m_movementline ml ON ((ml.m_movement_id = m.m_movement_id)));");
	return sb.toString();
}
}
