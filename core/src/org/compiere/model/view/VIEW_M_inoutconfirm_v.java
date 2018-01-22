package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_M_inoutconfirm_v 
{
 	@XendraView(Identifier="d969aeb9-a4bb-fdff-45eb-0d03066e384d",
Synchronized="2013-07-09 19:02:34.0",
Name="m_inoutconfirm_v",
Owner="xendra",
Extension="")
	public static final String Identifier = "d969aeb9-a4bb-fdff-45eb-0d03066e384d";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=d969aeb9-a4bb-fdff-45eb-0d03066e384d");
	sb.appendln("@comment=Confirmation Print View");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT ioc.ad_client_id, ioc.ad_org_id, ioc.isactive, ioc.created, ioc.createdby, ioc.updated, ioc.updatedby, 'en_US'::character varying AS ad_language, ioc.m_inoutconfirm_id, ioc.documentno, ioc.confirmtype, ioc.isapproved, ioc.iscancelled, ioc.description, io.m_inout_id, io.description AS shipdescription, io.c_bpartner_id, io.c_bpartner_location_id, io.ad_user_id, io.salesrep_id, io.c_doctype_id, dt.printname AS documenttype, io.c_order_id, io.dateordered, io.movementdate, io.movementtype, io.m_warehouse_id, io.poreference, io.deliveryrule, io.freightcostrule, io.deliveryviarule, io.m_shipper_id, io.priorityrule, ioc.processed FROM ((m_inoutconfirm ioc JOIN m_inout io ON ((ioc.m_inout_id = io.m_inout_id))) JOIN c_doctype dt ON ((io.c_doctype_id = dt.c_doctype_id)));");
	return sb.toString();
}
}
