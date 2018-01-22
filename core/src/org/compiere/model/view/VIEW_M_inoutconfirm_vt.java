package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_M_inoutconfirm_vt 
{
 	@XendraView(Identifier="1ba80962-340d-5a97-6a32-1c44b9135b35",
Synchronized="2013-07-09 19:02:34.0",
Name="m_inoutconfirm_vt",
Owner="xendra",
Extension="")
	public static final String Identifier = "1ba80962-340d-5a97-6a32-1c44b9135b35";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=1ba80962-340d-5a97-6a32-1c44b9135b35");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT ioc.ad_client_id, ioc.ad_org_id, ioc.isactive, ioc.created, ioc.createdby, ioc.updated, ioc.updatedby, dt.ad_language, ioc.m_inoutconfirm_id, ioc.documentno, ioc.confirmtype, ioc.isapproved, ioc.iscancelled, ioc.description, io.m_inout_id, io.description AS shipdescription, io.c_bpartner_id, io.c_bpartner_location_id, io.ad_user_id, io.salesrep_id, io.c_doctype_id, dt.printname AS documenttype, io.c_order_id, io.dateordered, io.movementdate, io.movementtype, io.m_warehouse_id, io.poreference, io.deliveryrule, io.freightcostrule, io.deliveryviarule, io.m_shipper_id, io.priorityrule, ioc.processed FROM ((m_inoutconfirm ioc JOIN m_inout io ON ((ioc.m_inout_id = io.m_inout_id))) JOIN c_doctype_trl dt ON ((io.c_doctype_id = dt.c_doctype_id)));");
	return sb.toString();
}
}
