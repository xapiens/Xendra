package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_SortNo 
{
 	@XendraElement(AD_Element_ID=573,
		ColumnName="SortNo",
		EntityType="D",
		Name="Record Sort No",
		PrintName="Record Sort No",
		Description="Determines in what order the records are displayed",
		Help="The Record Sort No indicates the ascending sort sequence of the records. If the number is negative, the records are sorted descending.  Example: A tab with C_DocType_ID (1), DocumentNo (-2) will be sorted ascending by document type and descending by document number (SQL: ORDER BY C_DocType, DocumentNo DESC)",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="929301a0-e5a0-7f21-9aa1-b7e9061fe6ed",
		Synchronized="2012-07-11 00:00:00.0")
	public static final String Identifier = "929301a0-e5a0-7f21-9aa1-b7e9061fe6ed";

}
