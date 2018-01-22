package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_M_BOMType implements Reference 
{
 	@XendraRefItem(Name="Current Active",
		Value="A",
		Description="",
		Identifier="e0fe778c-c0e4-f8d9-f151-267e4bd078c1")
	/** Current Active = A */
	public static final String CurrentActive = "A";
	@XendraRefItem(Name="Make-To-Order",
		Value="O",
		Description="",
		Identifier="e45192ea-4ae7-5812-a907-8cdfbb37e532")
	/** Make-To-Order = O */
	public static final String Make_To_Order = "O";
	@XendraRefItem(Name="Previous",
		Value="P",
		Description="",
		Identifier="aa93b711-0dde-9000-b079-6019dc5cd3b1")
	/** Previous = P */
	public static final String Previous = "P";
	@XendraRefItem(Name="Previous, Spare",
		Value="S",
		Description="",
		Identifier="e7492c79-342a-021b-8444-d2ecc1e361eb")
	/** Previous, Spare = S */
	public static final String PreviousSpare = "S";
	@XendraRefItem(Name="Maintenance",
		Value="M",
		Description="",
		Identifier="6b16bdb1-3834-08dc-bae8-9ad06337f3bd")
	/** Maintenance = M */
	public static final String Maintenance = "M";
	@XendraRefItem(Name="Repair",
		Value="R",
		Description="",
		Identifier="0f71d7df-2725-147a-3eca-6b267a300f2f")
	/** Repair = R */
	public static final String Repair = "R";
	@XendraRefItem(Name="Future",
		Value="F",
		Description="",
		Identifier="2ad6151c-934d-af80-dd75-8e5e2aae068d")
	/** Future = F */
	public static final String Future = "F";
	@XendraRef(Name="M_BOM Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="d1377b1e-da8b-eb9d-fa1d-c3ba010160f7")
	public static final String Identifier = "d1377b1e-da8b-eb9d-fa1d-c3ba010160f7";

}
