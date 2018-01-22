package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Rv_asset_delivery 
{
 	@XendraView(Identifier="357e8504-e4e9-4888-ba70-b9b08327e731",
Synchronized="2013-07-09 19:02:34.0",
Name="rv_asset_delivery",
Owner="xendra",
Extension="")
	public static final String Identifier = "357e8504-e4e9-4888-ba70-b9b08327e731";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=357e8504-e4e9-4888-ba70-b9b08327e731");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT ad.a_asset_delivery_id, ad.ad_client_id, ad.ad_org_id, ad.isactive, ad.created, ad.createdby, ad.updated, ad.updatedby, a.a_asset_id, a.a_asset_group_id, a.m_product_id, a.guaranteedate, a.assetservicedate, a.c_bpartner_id, ad.ad_user_id, ad.movementdate, ad.serno, ad.lot, ad.versionno, ad.m_inoutline_id, ad.email, ad.messageid, ad.deliveryconfirmation, ad.url, ad.remote_addr, ad.remote_host, ad.referrer, ad.description FROM (a_asset_delivery ad JOIN a_asset a ON ((a.a_asset_id = ad.a_asset_id)));");
	return sb.toString();
}
}
