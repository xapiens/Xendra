package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_ValidationRuleTypes implements Reference 
{
 	@XendraRefItem(Name="SQL",
		Value="S",
		Description="SQL",
		Identifier="f81669df-f423-f9a4-b9b7-3884267e42c8")
	/** SQL = S */
	public static final String SQL = "S";
	@XendraRefItem(Name="Java Language",
		Value="J",
		Description="Java Language",
		Identifier="1b4942b0-3016-7ec0-f2ab-54c2c9e4cd0e")
	/** Java Language = J */
	public static final String JavaLanguage = "J";
	@XendraRefItem(Name="Java Script",
		Value="E",
		Description="ECMA Script",
		Identifier="c45b1a1d-460b-4049-090e-1b4eaefb0e4b")
	/** Java Script = E */
	public static final String JavaScript = "E";
	@XendraRef(Name="AD_Validation Rule Types",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="Validation Rule Type list",
		Help="e.g. S - SQL",
		VFormat="L",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="6873df46-d6ca-4407-b7b1-70f380708881")
	public static final String Identifier = "6873df46-d6ca-4407-b7b1-70f380708881";

}
