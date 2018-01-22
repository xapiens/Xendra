package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_CommissionDocBasis implements Reference 
{
 	@XendraRefItem(Name="Receipt",
		Value="R",
		Description="",
		Identifier="4342e346-36b6-8ee7-8c32-b320ac62312b")
	/** Receipt = R */
	public static final String Receipt = "R";
	@XendraRefItem(Name="Order",
		Value="O",
		Description="",
		Identifier="7dbb5706-26c5-8ab7-1a27-56b0944be713")
	/** Order = O */
	public static final String Order = "O";
	@XendraRefItem(Name="Invoice",
		Value="I",
		Description="",
		Identifier="f2be07b3-a3ce-8039-fc83-76a4884899e0")
	/** Invoice = I */
	public static final String Invoice = "I";
	@XendraRef(Name="C_Commission DocBasis",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="A",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="bd1d44f5-4066-c631-959b-1a0ef88e308b")
	public static final String Identifier = "bd1d44f5-4066-c631-959b-1a0ef88e308b";

}
