package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_ReadOnlyLogic 
{
 	@XendraElement(AD_Element_ID=1663,
		ColumnName="ReadOnlyLogic",
		EntityType="D",
		Name="Read Only Logic",
		PrintName="Read Only Logic",
		Description="Logic to determine if field is read only (applies only when field is read-write)",
		Help="format := [expression] [[logic] [expression]]<br>  expression := @[context]@[operand][value] or @[context]@[operand][value]<br>  logic := [|]|[&]<br> context := any global or window context <br> value := strings or numbers<br> logic operators	:= AND or OR with the previous result from left to right <br> operand := eq[=], gt[&gt:], le[&lt:], not[~^!] <br> Examples: <br> @AD_Table_ID@=14 | @Language@!GERGER <br> @PriceLimit@>10 | @PriceList@>@PriceActual@<br> @Name@>J<br> Strings may be in single quotes (optional)",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="935267fb-b81e-300a-5bc2-f3c4b02f4d5d",
		Synchronized="2012-07-11 00:00:00.0")
	public static final String Identifier = "935267fb-b81e-300a-5bc2-f3c4b02f4d5d";

}
