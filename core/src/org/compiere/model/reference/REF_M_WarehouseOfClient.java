package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_M_WarehouseOfClient implements Reference 
{
 	@XendraRefTable(TableRef="M_Warehouse",
		KeyRef="M_Warehouse_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="M_Warehouse.AD_Client_ID=@#AD_Client_ID@",
		OrderByClause="",
		Identifier="d58bf37e-9ea7-6a63-508f-551b044059c8")
	@XendraRef(Name="M_Warehouse of Client",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:37.0",
		Extension="",
		Identifier="e3999c76-66f0-38b0-a95e-fb0d580cde7a")
	public static final String Identifier = "e3999c76-66f0-38b0-a95e-fb0d580cde7a";

}
