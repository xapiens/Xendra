package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_BP_GroupPriorityBase implements Reference 
{
 	@XendraRefItem(Name="Same",
		Value="S",
		Description="",
		Identifier="5ba932b0-fba1-7dc0-b218-81c4779b142e")
	/** Same = S */
	public static final String Same = "S";
	@XendraRefItem(Name="Lower",
		Value="L",
		Description="",
		Identifier="d33c9ee8-6778-663b-b8f9-264e12748a87")
	/** Lower = L */
	public static final String Lower = "L";
	@XendraRefItem(Name="Higher",
		Value="H",
		Description="",
		Identifier="16ea49cc-5817-b322-3f1a-fed5d44328fb")
	/** Higher = H */
	public static final String Higher = "H";
	@XendraRef(Name="C_BP_Group PriorityBase",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="bd551a3b-b41c-6a6a-20ca-6b50202ca49c")
	public static final String Identifier = "bd551a3b-b41c-6a6a-20ca-6b50202ca49c";

}
