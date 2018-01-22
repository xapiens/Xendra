package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_RelativeWeight 
{
 	@XendraElement(AD_Element_ID=1571,
		ColumnName="RelativeWeight",
		EntityType="D",
		Name="Relative Weight",
		PrintName="Relative Weight",
		Description="Relative weight of this step (0 = ignored)",
		Help="The relative weight allows you to adjust the project cycle report based on probabilities.  For example, if you have a 1:10 chance in closing a contract when it is in the prospect stage and a 1:2 chance when it is in the contract stage, you may put a weight of 0.1 and 0.5 on those steps. This allows sales funnels or measures of completion of your project.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="e2db7feb-fe90-45ec-faac-9e11cb9ecdd7",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "e2db7feb-fe90-45ec-faac-9e11cb9ecdd7";

}
