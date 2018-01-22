package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_CashFlow_Group_Sign implements Reference 
{
 	@XendraRefItem(Name="InFlow",
		Value="I",
		Description="",
		Identifier="34dcefec-ee4c-9964-b715-9c3347888286")
	/** InFlow = I */
	public static final String InFlow = "I";
	@XendraRefItem(Name="OutFlow",
		Value="O",
		Description="",
		Identifier="42ffd328-2fcf-1a3d-c780-03e3f49c24cf")
	/** OutFlow = O */
	public static final String OutFlow = "O";
	@XendraRef(Name="C_CashFlow_Group_Sign",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="C_CashFlow_Group_Sign",
		Help="",
		VFormat="",
		EntityType="U",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="b2bdca74-40ef-ac86-9876-56171a31e4bc")
	public static final String Identifier = "b2bdca74-40ef-ac86-9876-56171a31e4bc";

}
