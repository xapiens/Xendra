package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_Callout 
{
 	@XendraElement(AD_Element_ID=224,
		ColumnName="Callout",
		EntityType="D",
		Name="Callout",
		PrintName="Callout",
		Description="Fully qualified class NAMEs and method - separated by semicolons",
		Help="A Callout allow you to create Java extensions to perform certain tasks always after a value changed. Callouts should not be used for validation but consquences of a user selecting a certain value. The callout is a Java class implementing org.compiere.model.Callout and a method NAME to call.  Example: 'org.compiere.model.CalloutRequest.copyText' instanciates the class 'CalloutRequest' and calls the method 'copyText'. You can have multiple callouts by separating them via a semicolon",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="1041ce74-aa5e-c0d7-a1c1-ffb0202d26db",
		Synchronized="2012-07-11 00:00:00.0")
	public static final String Identifier = "1041ce74-aa5e-c0d7-a1c1-ffb0202d26db";

}
