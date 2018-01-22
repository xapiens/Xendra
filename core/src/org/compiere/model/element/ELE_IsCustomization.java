package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_IsCustomization 
{
 	@XendraElement(AD_Element_ID=2643,
		ColumnName="IsCustomization",
		EntityType="D",
		Name="Customization",
		PrintName="Customization",
		Description="The change is a customization of the data dictionary and can be applied after Migration",
		Help="The migration 'resets' the system to the current/original setting.  If selected you can save the customization and re-apply it.  Please note that you need to check, if your customization has no negative side effect in the new release.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="f70843df-f589-3f83-44f7-4360911cae45",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "f70843df-f589-3f83-44f7-4360911cae45";

}
