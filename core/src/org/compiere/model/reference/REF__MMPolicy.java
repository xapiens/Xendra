package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF__MMPolicy implements Reference 
{
 	@XendraRefItem(Name="LiFo",
		Value="L",
		Description="",
		Identifier="03c81a4a-5181-1c12-9bd8-5c1495a15ec5")
	/** LiFo = L */
	public static final String LiFo = "L";
	@XendraRefItem(Name="FiFo",
		Value="F",
		Description="",
		Identifier="4213a6d6-43d8-1e16-fe9c-d08265e40f90")
	/** FiFo = F */
	public static final String FiFo = "F";
	@XendraRefItem(Name="FeFo",
		Value="E",
		Description="",
		Identifier="3a7b9295-994d-4b5b-85e6-4078162610a8")
	/** FeFo = E */
	public static final String FeFo = "E";
	@XendraRef(Name="_MMPolicy",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="Material Movement Policy",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2017-06-20 16:25:57.315",
		Extension="",
		Identifier="a00dc4c4-1532-e484-fdd2-81ec830cf15b")
	public static final String Identifier = "a00dc4c4-1532-e484-fdd2-81ec830cf15b";

}
