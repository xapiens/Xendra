package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_PA_MeasureDataType implements Reference 
{
 	@XendraRefItem(Name="Qty/Amount in Time",
		Value="T",
		Description="",
		Identifier="d3400ff2-4f02-c7bf-37a3-638f1601b98b")
	/** Qty/Amount in Time = T */
	public static final String QtyAmountInTime = "T";
	@XendraRefItem(Name="Status Qty/Amount",
		Value="S",
		Description="",
		Identifier="43950ee5-eca4-6865-6cdb-d4151fdfbf06")
	/** Status Qty/Amount = S */
	public static final String StatusQtyAmount = "S";
	@XendraRef(Name="PA_Measure DataType",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="e04ce600-714c-a8a5-5a36-6390b68f39f6")
	public static final String Identifier = "e04ce600-714c-a8a5-5a36-6390b68f39f6";

}
