package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_M_TransactionTransactionType implements Reference 
{
 	@XendraRefItem(Name="Movement and Cost",
		Value="B",
		Description="",
		Identifier="1f46f52d-cc47-4c7c-ac2b-6a910fc8812e")
	/** Movement and Cost = B */
	public static final String MovementAndCost = "B";
	@XendraRefItem(Name="Only Movement",
		Value="M",
		Description="",
		Identifier="293c3fde-9c1b-48b5-8bd2-24b2162ceb92")
	/** Only Movement = M */
	public static final String OnlyMovement = "M";
	@XendraRefItem(Name="Only Cost",
		Value="C",
		Description="",
		Identifier="06d01270-301d-49dc-a72c-141e32ea4ff9")
	/** Only Cost = C */
	public static final String OnlyCost = "C";
	@XendraRefItem(Name="Adjustment",
		Value="A",
		Description="",
		Identifier="fcf4131c-37a4-4363-9e1a-bbc17ebfa3c9")
	/** Adjustment = A */
	public static final String Adjustment = "A";
	@XendraRef(Name="M_Transaction Transaction Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2018-06-24 08:42:55.535",
		Extension="",
		Identifier="fe35729f-77d7-4356-a8e1-30e72e5d389a")
	public static final String Identifier = "fe35729f-77d7-4356-a8e1-30e72e5d389a";

}
