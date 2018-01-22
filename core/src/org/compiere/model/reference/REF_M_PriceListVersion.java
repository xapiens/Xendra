package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_M_PriceListVersion implements Reference 
{
 	@XendraRefTable(TableRef="M_PriceList_Version",
		KeyRef="M_PriceList_Version_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="",
		Identifier="2cbe9122-6434-0fdc-ac4e-fb7e7ca4c82f")
	@XendraRef(Name="M_PriceList Version",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:32.0",
		Extension="",
		Identifier="84808698-f549-32c8-9435-3477bb7ce31c")
	public static final String Identifier = "84808698-f549-32c8-9435-3477bb7ce31c";

}
