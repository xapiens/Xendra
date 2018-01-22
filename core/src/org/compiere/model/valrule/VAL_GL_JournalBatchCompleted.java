package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_GL_JournalBatchCompleted implements ValRule 
{
 	@XendraValRule(Name="GL_JournalBatch Completed",
		AD_Val_Rule_ID=1000002,
		Description="Matches a completed Journal Batch",
		Type="S",
		EntityType="D",
		Identifier="a9705b0f-4369-efef-aafc-c504cec2dc56",
		Synchronized="2012-09-19 17:23:37.0")
	public static final String Identifier = "a9705b0f-4369-efef-aafc-c504cec2dc56";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("GL_JournalBatch.DocStatus IN ('CO', 'CL')");
	return sb.toString();
}
}
