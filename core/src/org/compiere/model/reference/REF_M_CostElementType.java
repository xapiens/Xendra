package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_M_CostElementType implements Reference 
{
 	@XendraRefItem(Name="Burden (M.Overhead)",
		Value="B",
		Description="Material Overhead",
		Identifier="8e098398-d1e6-55e8-5f5e-5f2c0958288c")
	/** Burden (M.Overhead) = B */
	public static final String BurdenMOverhead = "B";
	@XendraRefItem(Name="Material",
		Value="M",
		Description="",
		Identifier="ae56aa59-608d-df33-843c-66d640327b2a")
	/** Material = M */
	public static final String Material = "M";
	@XendraRefItem(Name="Overhead",
		Value="O",
		Description="",
		Identifier="37345522-b627-c239-14db-cecc9658f8de")
	/** Overhead = O */
	public static final String Overhead = "O";
	@XendraRefItem(Name="Outside Processing",
		Value="X",
		Description="",
		Identifier="15bc1f45-2971-c08e-4e70-dc864ebf0827")
	/** Outside Processing = X */
	public static final String OutsideProcessing = "X";
	@XendraRefItem(Name="Resource",
		Value="R",
		Description="Labor",
		Identifier="839599af-a4c4-a384-40f1-dbe935699bc7")
	/** Resource = R */
	public static final String Resource = "R";
	@XendraRef(Name="M_CostElement Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="c39dbce7-fd9c-ebfe-db45-4538a1812270")
	public static final String Identifier = "c39dbce7-fd9c-ebfe-db45-4538a1812270";

}
