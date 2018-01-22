package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_IsCostImmediate 
{
 	@XendraElement(AD_Element_ID=2844,
		ColumnName="IsCostImmediate",
		EntityType="D",
		Name="Cost Immediately",
		PrintName="Cost Immediate",
		Description="Update Costs immediately for testing",
		Help="If selected, costs are UPDATED immediately when a Cost Detail record is CREATED (by matching or shipping).  Otherwise the costs are UPDATED by batch or when the costs are needed for posting. You should select this only if you are testing,",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="9bdedaee-484f-a0a6-f613-5d9f1814f1c7",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "9bdedaee-484f-a0a6-f613-5d9f1814f1c7";

}
