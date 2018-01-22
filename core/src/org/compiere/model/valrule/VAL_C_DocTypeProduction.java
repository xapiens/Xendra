package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_DocTypeProduction implements ValRule 
{
 	@XendraValRule(Name="C_DocType Production",
		AD_Val_Rule_ID=1000019,
		Description="Document Type Production",
		Type="S",
		EntityType="D",
		Identifier="c982c60a-4fc7-af7f-d465-88afee7cfffa",
		Synchronized="2012-01-17 10:33:53.0")
	public static final String Identifier = "c982c60a-4fc7-af7f-d465-88afee7cfffa";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_DocType.DocBaseType='MMP'");
	return sb.toString();
}
}
