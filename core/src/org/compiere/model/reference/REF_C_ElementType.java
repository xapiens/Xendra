package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_ElementType implements Reference 
{
 	@XendraRefItem(Name="Account",
		Value="A",
		Description="Account Element",
		Identifier="b0c36c51-f737-1cce-a46c-3c978f6e8049")
	/** Account = A */
	public static final String Account = "A";
	@XendraRefItem(Name="User defined",
		Value="U",
		Description="User defined element",
		Identifier="942c2321-3aaa-d0fc-2385-eaad5c334044")
	/** User defined = U */
	public static final String UserDefined = "U";
	@XendraRef(Name="C_Element Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="Account Element Types",
		Help="",
		VFormat="L",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2017-12-21 10:58:04.388",
		Extension="",
		Identifier="06ba249a-d8a9-09ef-c38f-d7e00896f167")
	public static final String Identifier = "06ba249a-d8a9-09ef-c38f-d7e00896f167";

}
