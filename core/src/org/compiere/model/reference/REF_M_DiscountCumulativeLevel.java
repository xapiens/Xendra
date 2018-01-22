package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_M_DiscountCumulativeLevel implements Reference 
{
 	@XendraRefItem(Name="Line",
		Value="L",
		Description="",
		Identifier="783ba9e1-e4b2-3b93-1fd1-1d27168d359e")
	/** Line = L */
	public static final String Line = "L";
	@XendraRef(Name="M_Discount CumulativeLevel",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="L",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="a4bb6a27-1410-0575-cb12-a9c47c47c9b4")
	public static final String Identifier = "a4bb6a27-1410-0575-cb12-a9c47c47c9b4";

}
