package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_R_request_v 
{
 	@XendraView(Identifier="aeef287b-5ac3-61f8-f54a-e0e3d2d61059",
Synchronized="2013-07-09 19:02:34.0",
Name="r_request_v",
Owner="xendra",
Extension="")
	public static final String Identifier = "aeef287b-5ac3-61f8-f54a-e0e3d2d61059";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=aeef287b-5ac3-61f8-f54a-e0e3d2d61059");
	sb.appendln("@comment=Request from a Business Partner or Prospect");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT r_request.r_request_id, r_request.ad_client_id, r_request.ad_org_id, r_request.isactive, r_request.created, r_request.createdby, r_request.updated, r_request.updatedby, r_request.documentno, r_request.r_requesttype_id, r_request.r_group_id, r_request.r_category_id, r_request.r_status_id, r_request.r_resolution_id, r_request.r_requestrelated_id, r_request.priority, r_request.priorityuser, r_request.duetype, r_request.summary, r_request.confidentialtype, r_request.isescalated, r_request.isselfservice, r_request.salesrep_id, r_request.ad_role_id, r_request.datelastaction, r_request.datelastalert, r_request.lastresult, r_request.processed, r_request.isinvoiced, r_request.c_bpartner_id, r_request.ad_user_id, r_request.c_campaign_id, r_request.c_order_id, r_request.c_invoice_id, r_request.c_payment_id, r_request.m_product_id, r_request.c_project_id, r_request.a_asset_id, r_request.m_inout_id, r_request.m_rma_id, r_request.ad_table_id, r_request.record_id, r_request.requestamt, r_request.r_mailtext_id, r_request.result, r_request.confidentialtypeentry, r_request.r_standardresponse_id, r_request.nextaction, r_request.datenextaction, r_request.starttime, r_request.endtime, r_request.qtyspent, r_request.qtyinvoiced, r_request.m_productspent_id, r_request.c_activity_id, r_request.startdate, r_request.closedate, r_request.c_invoicerequest_id, r_request.m_changerequest_id, r_request.taskstatus, r_request.qtyplan, r_request.datecompleteplan, r_request.datestartplan, r_request.m_fixchangenotice_id FROM r_request WHERE (((r_request.isactive = 'Y'::bpchar) AND (r_request.processed = 'N'::bpchar)) AND (getdate() > r_request.datenextaction));");
	return sb.toString();
}
}
