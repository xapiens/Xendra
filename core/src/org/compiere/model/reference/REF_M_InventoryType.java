package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_M_InventoryType implements Reference 
{
 	@XendraRefItem(Name="Inventory Difference",
		Value="D",
		Description="",
		Identifier="46777398-0d3d-981e-58c3-0f39b014bc28")
	/** Inventory Difference = D */
	public static final String InventoryDifference = "D";
	@XendraRefItem(Name="Charge Account",
		Value="C",
		Description="",
		Identifier="153580e2-d643-6ad7-35d9-872e89c5108f")
	/** Charge Account = C */
	public static final String ChargeAccount = "C";
	@XendraRefItem(Name="Initial Charge",
		Value="I",
		Description="",
		Identifier="")
	/** Initial Charge = I */
	public static final String InitialCharge = "I";
	@XendraRef(Name="M_Inventory Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="Inventory Type (Difference - Charge)",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="7e005d54-e029-eb24-c698-53b211653660")
	public static final String Identifier = "7e005d54-e029-eb24-c698-53b211653660";

}
