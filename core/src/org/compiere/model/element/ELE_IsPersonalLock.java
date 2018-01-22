package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_IsPersonalLock 
{
 	@XendraElement(AD_Element_ID=2210,
		ColumnName="IsPersonalLock",
		EntityType="D",
		Name="Personal Lock",
		PrintName="Personal Lock",
		Description="Allow users with role to lock access to personal records",
		Help="If enabled, the user with the role can prevent access of others to personal records.  If a record is locked, only the user or people who can read personal locked records can see the record.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="4557c733-3dd8-181e-bcf7-4c7f2b64b1cf",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "4557c733-3dd8-181e-bcf7-4c7f2b64b1cf";

}
