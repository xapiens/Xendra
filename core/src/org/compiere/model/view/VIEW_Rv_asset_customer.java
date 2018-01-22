package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Rv_asset_customer 
{
 	@XendraView(Identifier="af66bdec-c07c-afeb-8454-5ebdaf935045",
Synchronized="2013-07-09 19:02:34.0",
Name="rv_asset_customer",
Owner="xendra",
Extension="")
	public static final String Identifier = "af66bdec-c07c-afeb-8454-5ebdaf935045";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=af66bdec-c07c-afeb-8454-5ebdaf935045");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT a.a_asset_id, a.ad_client_id, a.ad_org_id, a.isactive, a.created, a.createdby, a.updated, a.updatedby, a.value, a.name, a.description, a.help, a.a_asset_group_id, a.m_product_id, a.serno, a.lot, a.versionno, a.guaranteedate, a.assetservicedate, a.c_bpartner_id, a.c_bpartner_location_id, a.ad_user_id, (SELECT count(*) AS count FROM a_asset_delivery ad WHERE (a.a_asset_id = ad.a_asset_id)) AS deliverycount FROM a_asset a WHERE (a.c_bpartner_id IS NOT NULL);");
	return sb.toString();
}
}
