package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_M_ReplenishmentCreate implements Reference 
{
 	@XendraRefItem(Name="Purchase Order",
		Value="POO",
		Description="",
		Identifier="77852415-d4c0-824a-bf24-41bbba3f6fa7")
	/** Purchase Order = POO */
	public static final String PurchaseOrder = "POO";
	@XendraRefItem(Name="Inventory Move",
		Value="MMM",
		Description="",
		Identifier="89100718-043d-54b1-396a-32442d4d6b0d")
	/** Inventory Move = MMM */
	public static final String InventoryMove = "MMM";
	@XendraRefItem(Name="Requisition",
		Value="POR",
		Description="",
		Identifier="21e40a8e-0438-bc4d-ba23-d6f4c95b3531")
	/** Requisition = POR */
	public static final String Requisition = "POR";
	@XendraRef(Name="M_Replenishment Create",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="3a4e4a72-6e97-5638-22ad-655b0c1e671c")
	public static final String Identifier = "3a4e4a72-6e97-5638-22ad-655b0c1e671c";

}
