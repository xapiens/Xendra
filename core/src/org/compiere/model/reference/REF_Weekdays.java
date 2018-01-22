package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_Weekdays implements Reference 
{
 	@XendraRefItem(Name="Sunday",
		Value="7",
		Description="",
		Identifier="27340db1-5ebd-c76d-4246-52cb2579e7b0")
	/** Sunday = 7 */
	public static final String Sunday = "7";
	@XendraRefItem(Name="Monday",
		Value="1",
		Description="",
		Identifier="e66a8458-38ba-4716-f56e-afbaa9410949")
	/** Monday = 1 */
	public static final String Monday = "1";
	@XendraRefItem(Name="Tuesday",
		Value="2",
		Description="",
		Identifier="67c68af5-8ed0-6356-3ecb-d2dfde633fc8")
	/** Tuesday = 2 */
	public static final String Tuesday = "2";
	@XendraRefItem(Name="Wednesday",
		Value="3",
		Description="",
		Identifier="ce811e02-eca8-28a5-f582-d961307d9248")
	/** Wednesday = 3 */
	public static final String Wednesday = "3";
	@XendraRefItem(Name="Thursday",
		Value="4",
		Description="",
		Identifier="20211b33-6886-b468-0ac3-14def805e060")
	/** Thursday = 4 */
	public static final String Thursday = "4";
	@XendraRefItem(Name="Friday",
		Value="5",
		Description="",
		Identifier="34e5e9bc-dcfa-ed09-b76c-0d4f0b3e5430")
	/** Friday = 5 */
	public static final String Friday = "5";
	@XendraRefItem(Name="Saturday",
		Value="6",
		Description="",
		Identifier="09e35292-b8e0-1947-385a-331364d840b3")
	/** Saturday = 6 */
	public static final String Saturday = "6";
	@XendraRef(Name="Weekdays",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="List of days",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="83e938bc-4a87-77a1-cbb0-83c31065e487")
	public static final String Identifier = "83e938bc-4a87-77a1-cbb0-83c31065e487";

}
