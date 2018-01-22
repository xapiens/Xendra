package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_LandedCostDistribution implements Reference 
{
 	@XendraRefItem(Name="Quantity",
		Value="Q",
		Description="",
		Identifier="f7f2dae2-70e4-4f67-4c16-f5788e0a273c")
	/** Quantity = Q */
	public static final String Quantity = "Q";
	@XendraRefItem(Name="Line",
		Value="L",
		Description="",
		Identifier="e931f4ec-14ed-feee-ed2e-f0617ff96af9")
	/** Line = L */
	public static final String Line = "L";
	@XendraRefItem(Name="Volume",
		Value="V",
		Description="",
		Identifier="c2483146-a36d-02fd-71a0-9350a849e361")
	/** Volume = V */
	public static final String Volume = "V";
	@XendraRefItem(Name="Weight",
		Value="W",
		Description="",
		Identifier="f04a55f5-c7ea-dacf-4a51-e5baf9ce6173")
	/** Weight = W */
	public static final String Weight = "W";
	@XendraRefItem(Name="Costs",
		Value="C",
		Description="",
		Identifier="c88af4f4-4916-c64f-ed40-7a11e6ca940f")
	/** Costs = C */
	public static final String Costs = "C";
	@XendraRef(Name="C_LandedCost Distribution",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="1a5763cd-c568-02af-38a6-f3291883dadc")
	public static final String Identifier = "1a5763cd-c568-02af-38a6-f3291883dadc";

}
