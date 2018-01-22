package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Rv_m_requisition 
{
 	@XendraView(Identifier="2bc7be92-a32c-13de-5731-202701d92040",
Synchronized="2013-07-09 19:02:34.0",
Name="rv_m_requisition",
Owner="xendra",
Extension="")
	public static final String Identifier = "2bc7be92-a32c-13de-5731-202701d92040";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=2bc7be92-a32c-13de-5731-202701d92040");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT r.m_requisition_id, r.ad_client_id, r.ad_org_id, r.isactive, r.created, r.createdby, r.updated, r.updatedby, r.documentno, r.description, r.help, r.ad_user_id, r.m_pricelist_id, r.m_warehouse_id, r.isapproved, r.priorityrule, r.daterequired, r.totallines, r.docaction, r.docstatus, r.processed, l.m_requisitionline_id, l.line, l.qty, l.m_product_id, l.description AS linedescription, l.priceactual, l.linenetamt FROM (m_requisition r JOIN m_requisitionline l ON ((r.m_requisition_id = l.m_requisition_id)));");
	return sb.toString();
}
}
