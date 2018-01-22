package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_R_RequestNextAction implements Reference 
{
 	@XendraRefItem(Name="None",
		Value="N",
		Description="",
		Identifier="5d75fc25-c8ca-6651-44cb-f20f62ab3ef6")
	/** None = N */
	public static final String None = "N";
	@XendraRefItem(Name="Follow up",
		Value="F",
		Description="",
		Identifier="cb9a3f96-f3d6-087f-fce9-3df290fe0a48")
	/** Follow up = F */
	public static final String FollowUp = "F";
	@XendraRef(Name="R_Request Next Action",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="L",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="a38cdf5f-bdcc-ae00-7fca-c12a70399474")
	public static final String Identifier = "a38cdf5f-bdcc-ae00-7fca-c12a70399474";

}
