package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_HRColumnType implements Reference 
{
 	@XendraRefItem(Name="Amount",
		Value="A",
		Description="",
		Identifier="781e23a5-5f19-460f-8f31-fe9d23a5f1b2")
	/** Amount = A */
	public static final String Amount = "A";
	@XendraRefItem(Name="Date",
		Value="D",
		Description="",
		Identifier="958e1e2b-61b0-431d-9bb5-177ba85223d7")
	/** Date = D */
	public static final String Date = "D";
	@XendraRefItem(Name="Quantity",
		Value="Q",
		Description="",
		Identifier="6aba54c6-f6ab-4041-9d15-5bf5610bf0b7")
	/** Quantity = Q */
	public static final String Quantity = "Q";
	@XendraRefItem(Name="Text",
		Value="T",
		Description="",
		Identifier="43161805-9d12-4cf3-b05b-2b4911ff609f")
	/** Text = T */
	public static final String Text = "T";
	@XendraRef(Name="HR Column Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2017-03-13 09:15:23.672",
		Extension="",
		Identifier="6e4d9dd9-97aa-44da-95df-a5b65ec2a3e0")
	public static final String Identifier = "6e4d9dd9-97aa-44da-95df-a5b65ec2a3e0";

}
