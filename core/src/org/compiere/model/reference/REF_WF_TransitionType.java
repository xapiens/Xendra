package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_WF_TransitionType implements Reference 
{
 	@XendraRefItem(Name="Regular",
		Value="R",
		Description="",
		Identifier="53b4c5c8-f44d-4c74-b944-c7dbb7d5a9b4")
	/** Regular = R */
	public static final String Regular = "R";
	@XendraRefItem(Name="Loop End",
		Value="E",
		Description="",
		Identifier="2c761b22-e6b7-4166-8b15-dcccace4cb1c")
	/** Loop End = E */
	public static final String LoopEnd = "E";
	@XendraRefItem(Name="Loop Begin",
		Value="B",
		Description="",
		Identifier="f2e01e78-189e-403a-b1ff-883ea7761d77")
	/** Loop Begin = B */
	public static final String LoopBegin = "B";
	@XendraRef(Name="WF_Transition Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2015-07-16 06:55:58.0",
		Extension="",
		Identifier="f2c6def5-80f8-413c-8162-c3b54b0b4cf2")
	public static final String Identifier = "f2c6def5-80f8-413c-8162-c3b54b0b4cf2";

}
