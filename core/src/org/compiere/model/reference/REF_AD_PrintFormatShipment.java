package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_PrintFormatShipment implements Reference 
{
 	@XendraRefTable(TableRef="AD_PrintFormat",
		KeyRef="AD_PrintFormat_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="AD_PrintFormat.AD_Table_ID=500",
		OrderByClause="",
		Identifier="5dc5ee54-4f4b-0113-bf76-61d1c6557f17")
	@XendraRef(Name="AD_PrintFormat Shipment",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:04.0",
		Extension="",
		Identifier="ba7f9e3d-8c96-f5ba-cce3-6cafecf6ef8f")
	public static final String Identifier = "ba7f9e3d-8c96-f5ba-cce3-6cafecf6ef8f";

}
