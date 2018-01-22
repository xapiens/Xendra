package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF__PriorityRule implements Reference 
{
 	@XendraRefItem(Name="High",
		Value="3",
		Description="High priority",
		Identifier="66305725-1816-7088-b52f-eed276d97849")
	/** High = 3 */
	public static final String High = "3";
	@XendraRefItem(Name="Medium",
		Value="5",
		Description="Medium Priority",
		Identifier="26a0d8f1-a893-d0f3-07ca-5ffac65d2fab")
	/** Medium = 5 */
	public static final String Medium = "5";
	@XendraRefItem(Name="Low",
		Value="7",
		Description="Low priority",
		Identifier="5e562e0a-1168-cd62-90a6-0d8ba58e42ba")
	/** Low = 7 */
	public static final String Low = "7";
	@XendraRefItem(Name="Urgent",
		Value="1",
		Description="",
		Identifier="4164bb32-5acc-c6c2-b0c9-cfd5b621344c")
	/** Urgent = 1 */
	public static final String Urgent = "1";
	@XendraRefItem(Name="Minor",
		Value="9",
		Description="",
		Identifier="be123dec-e5a2-90e1-d5f0-ed24cfe528cc")
	/** Minor = 9 */
	public static final String Minor = "9";
	@XendraRef(Name="_PriorityRule",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="Priority scale list",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="bfacaeda-bbb9-ba51-d726-52826206b4d7")
	public static final String Identifier = "bfacaeda-bbb9-ba51-d726-52826206b4d7";

}
