package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_M_Locator implements Reference 
{
 	@XendraRefTable(TableRef="M_Locator",
		KeyRef="M_Locator_ID",
		DisplayRef="Value",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="",
		Identifier="5cfcb6f0-6092-19b7-9f42-f2d239ebcec0")
	@XendraRef(Name="M_Locator",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Warehouse Locator",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:34:19.0",
		Extension="",
		Identifier="8b5ebfcc-b0bb-ce7d-f3c4-eec928bf3462")
	public static final String Identifier = "8b5ebfcc-b0bb-ce7d-f3c4-eec928bf3462";

}
