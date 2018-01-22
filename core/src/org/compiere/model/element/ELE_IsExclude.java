package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_IsExclude 
{
 	@XendraElement(AD_Element_ID=2079,
		ColumnName="IsExclude",
		EntityType="D",
		Name="Exclude",
		PrintName="Exclude",
		Description="Exclude access to the data - if not selected Include access to the data",
		Help="If selected (excluded), the role cannot access the data specified.  If not selected (included), the role can ONLY access the data specified. Exclude items represent a negative list (i.e. you don't have access to the listed items). Include items represent a positive list (i.e. you only have access to the listed items). <br>You would usually  not mix Exclude and Include. If you have one include rule in your list, you would only have access to that item anyway.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="770b492c-be75-a622-6c96-f202d97c4dfd",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "770b492c-be75-a622-6c96-f202d97c4dfd";

}
