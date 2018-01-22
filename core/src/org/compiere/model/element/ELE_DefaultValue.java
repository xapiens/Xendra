package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_DefaultValue 
{
 	@XendraElement(AD_Element_ID=272,
		ColumnName="DefaultValue",
		EntityType="D",
		Name="Default Logic",
		PrintName="Default Logic",
		Description="Default value hierarchy, separated by :",
		Help="The defaults are evaluated in the order of definition, the first not null value becomes the default value of the column. The values are separated by comma or semicolon. a) Literals:. 'Text' or 123 b) Variables - in format @Variable@ - Login e.g. #Date, #AD_Org_ID, #AD_Client_ID - Accounting Schema: e.g. $C_AcctSchema_ID, $C_Calendar_ID - Global defaults: e.g. DateFormat - Window values (all Picks, CheckBoxes, RadioButtons, and DateDoc/DateAcct) c) SQL code with the tag: @SQL=SELECT something AS DefaultValue FROM ... The SQL statement can contain variables.  There can be no other value other than the SQL statement. The default is only evaluated, if no user preference is defined.  Default definitions are ignored for record columns as Key, Parent, Client as well as Buttons.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="85c6e06b-cd4c-c419-f8e4-9e93236b9219",
		Synchronized="2012-07-11 00:00:00.0")
	public static final String Identifier = "85c6e06b-cd4c-c419-f8e4-9e93236b9219";

}
