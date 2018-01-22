package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_DocTypeARProFormaInvoices implements ValRule 
{
 	@XendraValRule(Name="C_DocType AR Pro Forma Invoices",
		AD_Val_Rule_ID=126,
		Description="Document Type AR Pro Forma Invoice",
		Type="S",
		EntityType="D",
		Identifier="077e0f59-7277-13e7-b301-6bd2a378b17d",
		Synchronized="2012-01-17 10:35:08.0")
	public static final String Identifier = "077e0f59-7277-13e7-b301-6bd2a378b17d";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_DocType.DocBaseType='ARF'");
	return sb.toString();
}
}
