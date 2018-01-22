package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_WF_Join_Split implements Reference 
{
 	@XendraRefItem(Name="AND",
		Value="A",
		Description="",
		Identifier="e1eb121e-d7ec-65eb-629f-917e209adc55")
	/** AND = A */
	public static final String AND = "A";
	@XendraRefItem(Name="XOR",
		Value="X",
		Description="",
		Identifier="c2f9d84b-dd22-f2ec-2b25-03c94a66866d")
	/** XOR = X */
	public static final String XOR = "X";
	@XendraRef(Name="WF_Join_Split",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="b6a82eee-8ff1-fe8a-4224-1c7647d4fa98")
	public static final String Identifier = "b6a82eee-8ff1-fe8a-4224-1c7647d4fa98";

}
