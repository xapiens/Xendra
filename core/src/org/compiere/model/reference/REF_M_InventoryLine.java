package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_M_InventoryLine implements Reference 
{
 	@XendraRefTable(TableRef="M_InventoryLine",
		KeyRef="M_InventoryLine_ID",
		DisplayRef="Line",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="",
		Identifier="6ed4ee09-51ac-96bf-81e0-7a126856ad09")
	@XendraRef(Name="M_InventoryLine",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:34:56.0",
		Extension="",
		Identifier="2b2adb14-50b2-7181-3248-cc0e81a55c1a")
	public static final String Identifier = "2b2adb14-50b2-7181-3248-cc0e81a55c1a";

}
