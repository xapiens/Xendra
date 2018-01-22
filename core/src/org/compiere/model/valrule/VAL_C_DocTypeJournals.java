package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_DocTypeJournals implements ValRule 
{
 	@XendraValRule(Name="C_DocType Journals",
		AD_Val_Rule_ID=102,
		Description="Document Type Journal",
		Type="S",
		EntityType="D",
		Identifier="66c5d74f-1f24-ffa1-2a9d-b301198a14ea",
		Synchronized="2012-01-17 10:34:32.0")
	public static final String Identifier = "66c5d74f-1f24-ffa1-2a9d-b301198a14ea";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_DocType.DocBaseType='GLJ'");
	return sb.toString();
}
}
