package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_PA_GoalScope implements Reference 
{
 	@XendraRefItem(Name="Year",
		Value="1",
		Description="",
		Identifier="c162d724-5949-5d42-ed71-40932d509881")
	/** Year = 1 */
	public static final String Year = "1";
	@XendraRefItem(Name="Quarter",
		Value="3",
		Description="",
		Identifier="5e0082f0-cb4a-58d2-0977-cadde4e29a2b")
	/** Quarter = 3 */
	public static final String Quarter = "3";
	@XendraRefItem(Name="Month",
		Value="5",
		Description="",
		Identifier="0fd7d33f-922b-156d-3375-8928dcafac77")
	/** Month = 5 */
	public static final String Month = "5";
	@XendraRefItem(Name="Total",
		Value="0",
		Description="",
		Identifier="d09840c1-ed11-964a-ac2b-f15932afbd42")
	/** Total = 0 */
	public static final String Total = "0";
	@XendraRefItem(Name="Week",
		Value="7",
		Description="",
		Identifier="250a2283-1c6a-95a8-a6af-5c0255e34b96")
	/** Week = 7 */
	public static final String Week = "7";
	@XendraRefItem(Name="Day",
		Value="8",
		Description="",
		Identifier="e1cb6a3f-2177-ba9e-66ee-23bd4a516a91")
	/** Day = 8 */
	public static final String Day = "8";
	@XendraRef(Name="PA_Goal Scope",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="4ce4e589-8d57-44b4-2021-e8aabd1627ca")
	public static final String Identifier = "4ce4e589-8d57-44b4-2021-e8aabd1627ca";

}
