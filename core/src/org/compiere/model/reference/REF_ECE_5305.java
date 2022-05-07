package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_ECE_5305 implements Reference 
{
 	@XendraRefItem(Name="Standard Rate",
		Value="S",
		Description="",
		Identifier="063bb802-924c-4db6-a60f-1577bd06cc7b")
	/** Standard Rate = S */
	public static final String StandardRate = "S";
	@XendraRefItem(Name="Free export item, tax not charged",
		Value="G",
		Description="",
		Identifier="45c66a3a-ce2b-4b70-87c8-98ed1f3f3abc")
	/** Free export item, tax not charged = G */
	public static final String FreeExportItemTaxNotCharged = "G";
	@XendraRefItem(Name="Zero rated goods",
		Value="Z",
		Description="",
		Identifier="f4f65f5a-df42-44c7-9ae3-c879eb21dc9f")
	/** Zero rated goods = Z */
	public static final String ZeroRatedGoods = "Z";
	@XendraRefItem(Name="Exempt from tax",
		Value="E",
		Description="",
		Identifier="1c077e08-0616-42bd-a15b-49cecab2054c")
	/** Exempt from tax = E */
	public static final String ExemptFromTax = "E";
	@XendraRefItem(Name="Services outside scope of tax",
		Value="O",
		Description="",
		Identifier="16b89c04-b535-474b-9530-d54c924e9334")
	/** Services outside scope of tax = O */
	public static final String ServicesOutsideScopeOfTax = "O";
	@XendraRef(Name="ECE_5305",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2022-05-06 12:51:07.42",
		Extension="",
		Identifier="1340ebe7-dd50-46df-b593-6020bac6591c")
	public static final String Identifier = "1340ebe7-dd50-46df-b593-6020bac6591c";

}
