package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_M_PriceList_VersionForClient implements Reference 
{
 	@XendraRefTable(TableRef="M_PriceList_Version",
		KeyRef="M_PriceList_Version_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="M_PriceList_Version.AD_Client_ID=@#AD_Client_ID@",
		OrderByClause="",
		Identifier="d9238873-f32d-48c1-8b5f-7d09ad2da4a5")
	@XendraRef(Name="M_PriceList_Version for Client",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2015-07-16 06:55:58.0",
		Extension="",
		Identifier="052faa76-f0e0-4655-b47f-12dd74b691fa")
	public static final String Identifier = "052faa76-f0e0-4655-b47f-12dd74b691fa";

}
