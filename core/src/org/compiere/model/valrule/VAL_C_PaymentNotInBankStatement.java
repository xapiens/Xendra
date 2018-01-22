package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_PaymentNotInBankStatement implements ValRule 
{
 	@XendraValRule(Name="C_Payment not in BankStatement",
		AD_Val_Rule_ID=152,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="23d32195-8a48-d5d0-adf7-1c84033016ee",
		Synchronized="2012-01-17 10:35:42.0")
	public static final String Identifier = "23d32195-8a48-d5d0-adf7-1c84033016ee";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("NOT EXISTS (SELECT * FROM C_BankStatementLine bsl INNER JOIN C_BankStatement bs ON (bsl.C_BankStatement_ID=bs.C_BankStatement_ID) WHERE bsl.C_Payment_ID=C_Payment.C_Payment_ID AND bs.DocStatus<>'VO') AND C_Payment.DocStatus IN ('CO','CL','RE') AND C_Payment.PayAmt<>0 AND C_Payment.IsReconciled='N' AND C_Payment.C_BankAccount_ID=@C_BankAccount_ID@");
	return sb.toString();
}
}
