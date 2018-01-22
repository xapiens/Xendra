package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_DocTypeGLDocuments implements ValRule 
{
 	@XendraValRule(Name="C_DocType GL Documents",
		AD_Val_Rule_ID=121,
		Description="Document Type GL Document",
		Type="S",
		EntityType="D",
		Identifier="292fe28f-c82d-4313-1c4e-095e9c7eda00",
		Synchronized="2012-09-19 17:23:37.0")
	public static final String Identifier = "292fe28f-c82d-4313-1c4e-095e9c7eda00";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_DocType.DocBaseType='GLD'");
	return sb.toString();
}
}
