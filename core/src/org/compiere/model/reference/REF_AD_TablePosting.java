package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_TablePosting implements Reference 
{
 	@XendraRefTable(TableRef="AD_Table",
		KeyRef="AD_Table_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="EXISTS (SELECT * FROM AD_Column c WHERE AD_Table.AD_Table_ID=c.AD_Table_ID AND c.IsActive='Y' AND  c.ColumnName='Posted')",
		OrderByClause="",
		Identifier="ab303842-dadd-4ca8-bd3d-d8f2925bb053")
	@XendraRef(Name="AD_Table Posting",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Posting Tables",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-09-19 17:23:37.0",
		Extension="",
		Identifier="6ec25198-7cad-45ea-9830-a66077950c69")
	public static final String Identifier = "6ec25198-7cad-45ea-9830-a66077950c69";

}
