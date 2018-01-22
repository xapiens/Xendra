package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_LaboratorioActive implements ValRule 
{
 	@XendraValRule(Name="Laboratorio Active",
		AD_Val_Rule_ID=1000020,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="fe5f7cfa-310e-1278-0df1-ea10f286f7d2",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "fe5f7cfa-310e-1278-0df1-ea10f286f7d2";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("Laboratorio.IsActive='Y'");
	return sb.toString();
}
}
