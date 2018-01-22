package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_Conversion_RateTypes implements Reference 
{
 	@XendraRefItem(Name="Period End",
		Value="P",
		Description="Period Conversion Type",
		Identifier="21b5d759-41b3-4a62-a080-f3375c81aee7")
	/** Period End = P */
	public static final String PeriodEnd = "P";
	@XendraRefItem(Name="Fixed",
		Value="F",
		Description="Euro Fixed Currency",
		Identifier="67d2e7cb-69c5-407f-a036-95a1b9b16243")
	/** Fixed = F */
	public static final String Fixed = "F";
	@XendraRefItem(Name="Company",
		Value="C",
		Description="Company Rate",
		Identifier="fb26a470-28eb-47d8-a47a-b289c2126f4e")
	/** Company = C */
	public static final String Company = "C";
	@XendraRefItem(Name="User Type",
		Value="U",
		Description="User Rate Type",
		Identifier="a90104b8-8b14-4276-a6b0-3238355a9920")
	/** User Type = U */
	public static final String UserType = "U";
	@XendraRefItem(Name="None",
		Value="N",
		Description="No Conversion Rate",
		Identifier="115851c6-fdf7-456b-ad39-45ef5d5a38a7")
	/** None = N */
	public static final String None = "N";
	@XendraRefItem(Name="Spot",
		Value="S",
		Description="Spot Conversation Rate Type",
		Identifier="047c2504-29c4-456c-be2a-523f19911493")
	/** Spot = S */
	public static final String Spot = "S";
	@XendraRefItem(Name="Average",
		Value="A",
		Description="Average Rates",
		Identifier="2321296d-78f3-4ce1-86c8-68a25a3e224a")
	/** Average = A */
	public static final String Average = "A";
	@XendraRefItem(Name="Manual Rate",
		Value="M",
		Description="Manual Rate",
		Identifier="11ca7bbc-2481-47e6-bef1-dbcc80a82ced")
	/** Manual Rate = M */
	public static final String ManualRate = "M";
	@XendraRef(Name="C_Conversion_Rate Types",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="Conversion Rate Type list",
		Help="",
		VFormat="L",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2015-07-16 06:55:59.0",
		Extension="",
		Identifier="d2ecd78b-fa5d-420e-8fcc-ee3bf88d6f08")
	public static final String Identifier = "d2ecd78b-fa5d-420e-8fcc-ee3bf88d6f08";

}
