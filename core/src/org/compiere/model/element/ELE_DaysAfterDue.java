package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_DaysAfterDue 
{
 	@XendraElement(AD_Element_ID=1092,
		ColumnName="DaysAfterDue",
		EntityType="D",
		Name="Days after due date",
		PrintName="Days after due date",
		Description="Days after due date to dun (if negative days until due)",
		Help="The Days After Due Date indicates the number of days after the payment due date to initiate dunning. If the number is negarive, it includes not the not due invoices.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="80905038-95a7-6002-0cbb-141b3930902c",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "80905038-95a7-6002-0cbb-141b3930902c";

}
