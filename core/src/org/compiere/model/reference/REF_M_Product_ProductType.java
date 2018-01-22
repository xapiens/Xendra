package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_M_Product_ProductType implements Reference 
{
 	@XendraRefItem(Name="Item",
		Value="I",
		Description="",
		Identifier="df193f97-4324-421e-b362-4ef293715296")
	/** Item = I */
	public static final String Item = "I";
	@XendraRefItem(Name="Service",
		Value="S",
		Description="",
		Identifier="fb7de0e5-f156-cfad-67ca-f72fb539e5b5")
	/** Service = S */
	public static final String Service = "S";
	@XendraRefItem(Name="Resource",
		Value="R",
		Description="",
		Identifier="916ad4c7-d277-3ed5-ece6-b21ceca4ab33")
	/** Resource = R */
	public static final String Resource = "R";
	@XendraRefItem(Name="Expense type",
		Value="E",
		Description="",
		Identifier="ad98cca9-f253-4b48-1f9a-67983eac0acc")
	/** Expense type = E */
	public static final String ExpenseType = "E";
	@XendraRefItem(Name="Online",
		Value="O",
		Description="",
		Identifier="345e7168-207f-2ddf-a31b-85b5493b23d0")
	/** Online = O */
	public static final String Online = "O";
	@XendraRef(Name="M_Product_ProductType",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="028a2683-c298-dd54-f589-fe0d15a36c1b")
	public static final String Identifier = "028a2683-c298-dd54-f589-fe0d15a36c1b";

}
