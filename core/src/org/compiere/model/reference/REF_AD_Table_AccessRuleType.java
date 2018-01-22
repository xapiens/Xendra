package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_Table_AccessRuleType implements Reference 
{
 	@XendraRefItem(Name="Reporting",
		Value="R",
		Description="",
		Identifier="20028d17-2564-5912-1267-0dfaec5f154a")
	/** Reporting = R */
	public static final String Reporting = "R";
	@XendraRefItem(Name="Accessing",
		Value="A",
		Description="General Access",
		Identifier="9ce01c76-905a-1f66-78ac-faadbd16be0f")
	/** Accessing = A */
	public static final String Accessing = "A";
	@XendraRefItem(Name="Exporting",
		Value="E",
		Description="",
		Identifier="5234e075-d08e-af28-3c90-79eaf21d973d")
	/** Exporting = E */
	public static final String Exporting = "E";
	@XendraRef(Name="AD_Table_Access RuleType",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="AccessRuleType",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="77ec3623-8e6b-df6f-0a21-f92cfcd5ad81")
	public static final String Identifier = "77ec3623-8e6b-df6f-0a21-f92cfcd5ad81";

}
