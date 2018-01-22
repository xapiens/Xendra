package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_WriteOffType implements Reference 
{
 	@XendraRefItem(Name="Donation",
		Value="D",
		Description="",
		Identifier="6848d0e2-1489-4297-b62e-a6e9631fcb83")
	/** Donation = D */
	public static final String Donation = "D";
	@XendraRefItem(Name="WriteOffAmt",
		Value="W",
		Description="",
		Identifier="6ed4ea4b-1f76-48e8-8a82-8cedea54c07a")
	/** WriteOffAmt = W */
	public static final String WriteOffAmt = "W";
	@XendraRefItem(Name="None",
		Value="N",
		Description="",
		Identifier="f1289a87-ee3d-486f-a429-c72566d9ecb0")
	/** None = N */
	public static final String None = "N";
	@XendraRef(Name="WriteOffType",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2016-11-11 13:45:04.063",
		Extension="",
		Identifier="c41b3d42-db96-44ab-af5b-5fac4c7465e6")
	public static final String Identifier = "c41b3d42-db96-44ab-af5b-5fac4c7465e6";

}
