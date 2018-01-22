package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_DisplayLogic 
{
 	@XendraElement(AD_Element_ID=283,
		ColumnName="DisplayLogic",
		EntityType="D",
		Name="Display Logic",
		PrintName="Display Logic",
		Description="If the Field is displayed, the result determines if the field is actually displayed",
		Help="format := [expression] [[logic] [expression]]<br>  expression := @[context]@[operand][value] or @[context]@[operand][value]<br>  logic := [|]|[&]<br> context := any global or window context <br> value := strings or numbers<br> logic operators	:= AND or OR with the previous result from left to right <br> operand := eq[=], gt[&gt:], le[&lt:], not[~^!] <br> Examples: <br> @AD_Table_ID@=14 | @Language@!GERGER <br> @PriceLimit@>10 | @PriceList@>@PriceActual@<br> @Name@>J<br> Strings may be in single quotes (optional)",		
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="fcb60996-c818-2f09-e6c4-b7544353cf56",
		Synchronized="2012-07-11 00:00:00.0")
	public static final String Identifier = "fcb60996-c818-2f09-e6c4-b7544353cf56";

}
