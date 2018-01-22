package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_DefaultValue2 
{
 	@XendraElement(AD_Element_ID=1529,
		ColumnName="DefaultValue2",
		EntityType="D",
		Name="Default Logic 2",
		PrintName="Default Logic 2",
		Description="Default value hierarchy, separated by :",
		Help="The defaults are evaluated in the order of definition, the first not null value becomes the default value of the column. The values are separated by comma or semicolon. a) Literals:. 'Text' or 123 b) Variables - in format @Variable@ - Login e.g. #Date, #AD_Org_ID, #AD_Client_ID - Accounting Schema: e.g. $C_AcctSchema_ID, $C_Calendar_ID - Global defaults: e.g. DateFormat - Window values (all Picks, CheckBoxes, RadioButtons, and DateDoc/DateAcct) c) SQL code with the tag: @SQL=SELECT something AS DefaultValue FROM ... The SQL statement can contain variables.  There can be no other value other than the SQL statement. The default is only evaluated, if no user preference is defined.  Default definitions are ignored for record columns as Key, Parent, Client as well as Buttons.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="2d3beeef-3de4-778b-6738-3c71800daa0d",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "2d3beeef-3de4-778b-6738-3c71800daa0d";

}
