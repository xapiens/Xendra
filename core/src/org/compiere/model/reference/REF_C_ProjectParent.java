package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_ProjectParent implements Reference 
{
 	@XendraRefTable(TableRef="C_Project",
		KeyRef="C_Project_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="C_Project.IsSummary='Y'",
		OrderByClause="C_Project.Value",
		Identifier="a33a42ee-4540-43af-a50d-5397850e2d30")
	@XendraRef(Name="C_Project Parent",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2015-07-16 06:56:00.0",
		Extension="",
		Identifier="fcb838ed-9486-447f-8064-4136a456139c")
	public static final String Identifier = "fcb838ed-9486-447f-8064-4136a456139c";

}
