package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_M_TransactionAllocationType implements Reference 
{
 	@XendraRefItem(Name="LiFo",
		Value="L",
		Description="Last In First Out",
		Identifier="4551209e-0549-1388-1e54-1df8a947b78b")
	/** LiFo = L */
	public static final String LiFo = "L";
	@XendraRefItem(Name="FiFo",
		Value="F",
		Description="First In First Out",
		Identifier="6865f7da-fc6c-85e3-09d3-db70d18281cc")
	/** FiFo = F */
	public static final String FiFo = "F";
	@XendraRef(Name="M_TransactionAllocation Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2018-06-25 17:25:45.643",
		Extension="",
		Identifier="9148d9e2-9168-fae3-adbc-678718e7ce5f")
	public static final String Identifier = "9148d9e2-9168-fae3-adbc-678718e7ce5f";

}
