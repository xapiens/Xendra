package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_RecurrenceType implements Reference 
{
 	@XendraRefItem(Name="None",
		Value="0",
		Description="",
		Identifier="ec83f2c7-b33a-4fde-9e48-50ecda83297f")
	/** None = 0 */
	public static final String None = "0";
	@XendraRefItem(Name="Daily",
		Value="1",
		Description="",
		Identifier="5f15f1d8-71a7-4a02-b087-c9a664e04326")
	/** Daily = 1 */
	public static final String Daily = "1";
	@XendraRefItem(Name="Weekly",
		Value="2",
		Description="",
		Identifier="de1b2463-b9b9-4c82-a3c1-ebe436a89b78")
	/** Weekly = 2 */
	public static final String Weekly = "2";
	@XendraRefItem(Name="Monthly",
		Value="3",
		Description="",
		Identifier="e462046b-312e-4cc6-805a-8ca90d4f3684")
	/** Monthly = 3 */
	public static final String Monthly = "3";
	@XendraRefItem(Name="Annually",
		Value="4",
		Description="",
		Identifier="a59c3cef-2d65-45e1-bb22-618c7065ff5e")
	/** Annually = 4 */
	public static final String Annually = "4";
	@XendraRef(Name="Recurrence Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2017-09-13 23:29:45.637",
		Extension="",
		Identifier="dd0c33ed-698f-444a-92ec-133e8d5d6404")
	public static final String Identifier = "dd0c33ed-698f-444a-92ec-133e8d5d6404";

}
