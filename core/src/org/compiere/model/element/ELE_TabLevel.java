package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_TabLevel 
{
 	@XendraElement(AD_Element_ID=1725,
		ColumnName="TabLevel",
		EntityType="D",
		Name="Tab Level",
		PrintName="Tab Level",
		Description="Hierarchical Tab Level (0 = top)",
		Help="Hierarchical level of the tab. If the level is 0, it is the top entity. Level 1 entries are dependent on level 0, etc.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="9fd1fa87-f0ad-359c-10bb-d8f914a982a4",
		Synchronized="2012-07-11 00:00:00.0")
	public static final String Identifier = "9fd1fa87-f0ad-359c-10bb-d8f914a982a4";

}
