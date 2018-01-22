package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_ExpressionPostal 
{
 	@XendraElement(AD_Element_ID=299,
		ColumnName="ExpressionPostal",
		EntityType="D",
		Name="Postal Code Format",
		PrintName="Postal Code Format",
		Description="Format of the postal code: Can contain fixed format elements, Variables: '_lLoOaAcCa09'",
		Help="<B>Validation elements:</B>  	(Space) any character _	Space (fixed character) l	any Letter a..Z NO space L	any Letter a..Z NO space converted to upper case o	any Letter a..Z or space O	any Letter a..Z or space converted to upper case a	any Letters & Digits NO space A	any Letters & Digits NO space converted to upper case c	any Letters & Digits or space C	any Letters & Digits or space converted to upper case 0	Digits 0..9 NO space 9	Digits 0..9 or space  Example of format '(000)_000-0000'",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="e6ab8aad-7a42-1578-786e-e41c8add0b28",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "e6ab8aad-7a42-1578-786e-e41c8add0b28";

}
