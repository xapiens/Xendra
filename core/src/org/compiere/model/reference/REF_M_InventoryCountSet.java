package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_M_InventoryCountSet implements Reference 
{
 	@XendraRefItem(Name="On Hand Qty",
		Value="O",
		Description="",
		Identifier="bcc6776e-69ec-e12e-fa82-cd2d6ce25f32")
	/** On Hand Qty = O */
	public static final String OnHandQty = "O";
	@XendraRefItem(Name="Zero",
		Value="Z",
		Description="",
		Identifier="796ac460-3c32-d4a7-a303-7cd3b7bf316e")
	/** Zero = Z */
	public static final String Zero = "Z";
	@XendraRef(Name="M_Inventory CountSet",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-09-19 17:23:37.0",
		Extension="",
		Identifier="9df42b26-96c6-93fc-a04e-9ac202d3b2cd")
	public static final String Identifier = "9df42b26-96c6-93fc-a04e-9ac202d3b2cd";

}
