package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_BankStatementCompleted implements ValRule 
{
 	@XendraValRule(Name="C_BankStatement Completed",
		AD_Val_Rule_ID=1000000,
		Description="Matches a completed bank statement",
		Type="S",
		EntityType="D",
		Identifier="a9e9d0e9-9265-3a4f-27aa-6bcfa5e5ac88",
		Synchronized="2012-09-19 17:23:37.0")
	public static final String Identifier = "a9e9d0e9-9265-3a4f-27aa-6bcfa5e5ac88";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_BankStatement.DocStatus IN ('CO', 'CL')");
	return sb.toString();
}
}
