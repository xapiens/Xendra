package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_ExpressionPostal_Add 
{
 	@XendraElement(AD_Element_ID=300,
		ColumnName="ExpressionPostal_Add",
		EntityType="D",
		Name="Additional Postal Format",
		PrintName="Additional Postal Format",
		Description="Format of the value: Can contain fixed format elements, Variables: '_lLoOaAcCa09'",
		Help="<B>Validation elements:</B>  	(Space) any character _	Space (fixed character) l	any Letter a..Z NO space L	any Letter a..Z NO space converted to upper case o	any Letter a..Z or space O	any Letter a..Z or space converted to upper case a	any Letters & Digits NO space A	any Letters & Digits NO space converted to upper case c	any Letters & Digits or space C	any Letters & Digits or space converted to upper case 0	Digits 0..9 NO space 9	Digits 0..9 or space  Example of format '(000)_000-0000'",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="98b6402f-393c-de40-e99d-57ac4dbf6b46",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "98b6402f-393c-de40-e99d-57ac4dbf6b46";

}
