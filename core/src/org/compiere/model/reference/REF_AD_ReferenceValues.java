package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_ReferenceValues implements Reference 
{
 	@XendraRefTable(TableRef="AD_Reference",
		KeyRef="AD_Reference_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="AD_Reference.ValidationType in ('T','L') AND exists ( /* reference must have an active AD_Ref_Table entry */ select * from AD_Ref_Table t, AD_Reference where t.AD_Reference_ID=AD_Reference.AD_Reference_ID and t.IsActive='Y')",
		OrderByClause="AD_Reference.ValidationType, AD_Reference.Name",
		Identifier="ea8cb530-57e7-7542-7c3c-eebb2822ed2b")
	@XendraRef(Name="AD_Reference Values",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Reference (List and Table) selection",
		Help="(not DataType and Independent)",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:41.0",
		Extension="",
		Identifier="12253474-e61c-58a4-3fd3-2c2ccf236272")
	public static final String Identifier = "12253474-e61c-58a4-3fd3-2c2ccf236272";

}
