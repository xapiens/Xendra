package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_M_DiscountPriceListBase implements Reference 
{
 	@XendraRefItem(Name="Standard Price",
		Value="S",
		Description="",
		Identifier="34d0f496-0aa7-1d78-7a7f-11c5d8e64c4e")
	/** Standard Price = S */
	public static final String StandardPrice = "S";
	@XendraRefItem(Name="Limit (PO) Price",
		Value="X",
		Description="",
		Identifier="e1dc0449-631c-3d03-23e8-902d1bd58eac")
	/** Limit (PO) Price = X */
	public static final String LimitPOPrice = "X";
	@XendraRefItem(Name="List Price",
		Value="L",
		Description="",
		Identifier="3e2c59fa-a003-29bf-6122-d8066f116a67")
	/** List Price = L */
	public static final String ListPrice = "L";
	@XendraRefItem(Name="Fixed Price",
		Value="F",
		Description="",
		Identifier="af8b2c20-7306-d27c-8a3e-102c0fc00145")
	/** Fixed Price = F */
	public static final String FixedPrice = "F";
	@XendraRef(Name="M_DiscountPriceList Base",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="ce63bdf9-c16c-fe89-c2f4-def7e55d7c68")
	public static final String Identifier = "ce63bdf9-c16c-fe89-c2f4-def7e55d7c68";

}
