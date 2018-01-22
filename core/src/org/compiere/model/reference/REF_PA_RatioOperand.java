package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_PA_RatioOperand implements Reference 
{
 	@XendraRefItem(Name="Plus",
		Value="P",
		Description="",
		Identifier="22c6962f-c2c5-c4c8-be9a-3a5443d11f42")
	/** Plus = P */
	public static final String Plus = "P";
	@XendraRefItem(Name="Minus",
		Value="N",
		Description="",
		Identifier="5c6ecca8-7cb3-e185-0598-4db182b4a273")
	/** Minus = N */
	public static final String Minus = "N";
	@XendraRefItem(Name="Multiply",
		Value="M",
		Description="",
		Identifier="3569c203-8059-1ed8-be5a-4f744716c861")
	/** Multiply = M */
	public static final String Multiply = "M";
	@XendraRefItem(Name="Divide",
		Value="D",
		Description="",
		Identifier="13747256-1216-cc05-3792-e81555aa6afd")
	/** Divide = D */
	public static final String Divide = "D";
	@XendraRef(Name="PA_Ratio Operand",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="44176ac4-188a-6d06-e432-378b8cb10d30")
	public static final String Identifier = "44176ac4-188a-6d06-e432-378b8cb10d30";

}
