package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Rv_asset_summonth 
{
 	@XendraView(Identifier="5cb61567-ab15-558f-bc64-06338b9e472c",
Synchronized="2013-07-09 19:02:34.0",
Name="rv_asset_summonth",
Owner="xendra",
Extension="")
	public static final String Identifier = "5cb61567-ab15-558f-bc64-06338b9e472c";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=5cb61567-ab15-558f-bc64-06338b9e472c");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT a.ad_client_id, a.ad_org_id, a.isactive, a.created, a.createdby, a.updated, a.updatedby, a.a_asset_id, a.a_asset_group_id, a.m_product_id, a.value, a.name, a.description, a.help, a.guaranteedate, a.assetservicedate, a.c_bpartner_id, a.ad_user_id, a.serno, a.lot, a.versionno, firstof(ad.movementdate, 'MM'::character varying) AS movementdate, count(*) AS deliverycount FROM (a_asset a JOIN a_asset_delivery ad ON ((a.a_asset_id = ad.a_asset_id))) GROUP BY a.ad_client_id, a.ad_org_id, a.isactive, a.created, a.createdby, a.updated, a.updatedby, a.a_asset_id, a.a_asset_group_id, a.m_product_id, a.value, a.name, a.description, a.help, a.guaranteedate, a.assetservicedate, a.c_bpartner_id, a.ad_user_id, a.serno, a.lot, a.versionno, firstof(ad.movementdate, 'MM'::character varying);");
	return sb.toString();
}
}
