package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_ColumnSQL 
{
 	@XendraElement(AD_Element_ID=2699,
		ColumnName="ColumnSQL",
		EntityType="D",
		Name="Column SQL",
		PrintName="Column SQL",
		Description="Virtual Column (r/o)",
		Help="You can define virtual columns (not stored in the database). If defined, the Column NAME is the synonym of the SQL expression defined here. The SQL expression must be valid.<br> Example: 'Updated-Created' would list the age of the entry in days",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="4d5be23f-2ffd-ca83-8ea2-bc7b4d29ea78",
		Synchronized="2012-07-11 00:00:00.0")
	public static final String Identifier = "4d5be23f-2ffd-ca83-8ea2-bc7b4d29ea78";

}
