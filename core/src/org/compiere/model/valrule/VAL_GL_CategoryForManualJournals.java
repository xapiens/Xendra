package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_GL_CategoryForManualJournals implements ValRule 
{
 	@XendraValRule(Name="GL_Category for Manual Journals",
		AD_Val_Rule_ID=118,
		Description="Manual Journal GL Category",
		Type="S",
		EntityType="D",
		Identifier="0b63bfd0-74b1-97e5-5bc9-fe99cc50e4d3",
		Synchronized="2012-01-17 10:34:32.0")
	public static final String Identifier = "0b63bfd0-74b1-97e5-5bc9-fe99cc50e4d3";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("GL_Category.CategoryType='M'");
	return sb.toString();
}
}
