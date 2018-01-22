package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_ElementValueAccountSign implements Reference 
{
 	@XendraRefItem(Name="Natural",
		Value="N",
		Description="Natural sign of the Account Type",
		Identifier="625191b4-470e-f36f-00a8-74d9e2108d94")
	/** Natural = N */
	public static final String Natural = "N";
	@XendraRefItem(Name="Debit",
		Value="D",
		Description="Debit Balance Account",
		Identifier="46d9c3b7-9d53-6b00-9af1-a44cffb74141")
	/** Debit = D */
	public static final String Debit = "D";
	@XendraRefItem(Name="Credit",
		Value="C",
		Description="Credit Balance Account",
		Identifier="1b1597c1-f866-d52b-9bf9-21c1d6a0ce94")
	/** Credit = C */
	public static final String Credit = "C";
	@XendraRef(Name="C_ElementValue Account Sign",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="Account Sign list",
		Help="",
		VFormat="L",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="f63281b9-9b5a-42c0-e4ec-3240ca6a08f1")
	public static final String Identifier = "f63281b9-9b5a-42c0-e4ec-3240ca6a08f1";

}
