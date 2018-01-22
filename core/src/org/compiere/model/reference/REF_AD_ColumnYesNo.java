package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_ColumnYesNo implements Reference 
{
 	@XendraRefTable(TableRef="AD_Column",
		KeyRef="AD_Column_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="AD_Column.AD_Reference_ID=20",
		OrderByClause="AD_Column.Name",
		Identifier="ca595b95-701c-2c75-f3e2-7846b8ff5f63")
	@XendraRef(Name="AD_Column YesNo",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Coluns YesNo (Name)",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:10.0",
		Extension="",
		Identifier="64ecc5d9-280a-1f58-161f-356a16ae8978")
	public static final String Identifier = "64ecc5d9-280a-1f58-161f-356a16ae8978";

}
