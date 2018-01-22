package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_JoinElement 
{
 	@XendraElement(AD_Element_ID=2336,
		ColumnName="JoinElement",
		EntityType="D",
		Name="Join Element",
		PrintName="Join Element",
		Description="Semantics for multiple incoming Transitions",
		Help="Semantics for multiple incoming Transitions for a Node/Activity. AND joins all concurrent threads - XOR requires one thread (no synchronization).",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="74634994-4014-e3db-54c0-8aeabc69984e",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "74634994-4014-e3db-54c0-8aeabc69984e";

}
