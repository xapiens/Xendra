package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_K_CategoryValue implements ValRule 
{
 	@XendraValRule(Name="K_Category Value",
		AD_Val_Rule_ID=169,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="cd7fea91-388d-4634-ad34-3e1dc063ceed",
		Synchronized="2015-07-22 09:30:47.0")
	public static final String Identifier = "cd7fea91-388d-4634-ad34-3e1dc063ceed";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("K_Category_ID=@K_Category_ID@");
	return sb.toString();
}
}
