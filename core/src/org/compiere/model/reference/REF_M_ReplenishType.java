package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_M_ReplenishType implements Reference 
{
 	@XendraRefItem(Name="Maintain Maximum Level",
		Value="2",
		Description="",
		Identifier="2b205e73-51a5-f002-8afb-dbf099391280")
	/** Maintain Maximum Level = 2 */
	public static final String MaintainMaximumLevel = "2";
	@XendraRefItem(Name="Manual",
		Value="0",
		Description="",
		Identifier="bf769013-c0de-c2c9-1e3e-9afa6a4c47b7")
	/** Manual = 0 */
	public static final String Manual = "0";
	@XendraRefItem(Name="Reorder below Minimum Level",
		Value="1",
		Description="",
		Identifier="3199181b-52bf-dc43-98e9-489d63e9d8be")
	/** Reorder below Minimum Level = 1 */
	public static final String ReorderBelowMinimumLevel = "1";
	@XendraRefItem(Name="Custom",
		Value="9",
		Description="",
		Identifier="16be51ce-ea17-9afc-485d-b400884e6c06")
	/** Custom = 9 */
	public static final String Custom = "9";
	@XendraRef(Name="M_Replenish Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="4ae23d3a-7913-5665-971c-430591c605b3")
	public static final String Identifier = "4ae23d3a-7913-5665-971c-430591c605b3";

}
