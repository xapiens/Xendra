package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_M_DiscountPriceListRoundingRule implements Reference 
{
 	@XendraRefItem(Name="Currency Precision",
		Value="C",
		Description="",
		Identifier="64926bc4-8cc5-684a-0104-8af1f6a4112e")
	/** Currency Precision = C */
	public static final String CurrencyPrecision = "C";
	@XendraRefItem(Name="Whole Number .00",
		Value="0",
		Description="Number w/o decimals",
		Identifier="124e458b-ed81-8926-d5c8-dc5b21dc483f")
	/** Whole Number .00 = 0 */
	public static final String WholeNumber00 = "0";
	@XendraRefItem(Name="No Rounding",
		Value="N",
		Description="",
		Identifier="f91339cb-b976-4719-3ea1-f4740a7e3a00")
	/** No Rounding = N */
	public static final String NoRounding = "N";
	@XendraRefItem(Name="Quarter .25 .50 .75",
		Value="Q",
		Description="",
		Identifier="75bc065a-f413-aa2d-5bb0-499af4c67b6c")
	/** Quarter .25 .50 .75 = Q */
	public static final String Quarter255075 = "Q";
	@XendraRefItem(Name="Dime .10, .20, .30, ...",
		Value="D",
		Description="",
		Identifier="ff1931e4-ebd4-38a3-6adb-483cbd62de9b")
	/** Dime .10, .20, .30, ... = D */
	public static final String Dime102030 = "D";
	@XendraRefItem(Name="Nickel .05, .10, .15, ...",
		Value="5",
		Description="",
		Identifier="2a31c8fa-a853-3b92-27f9-ec4f38804d84")
	/** Nickel .05, .10, .15, ... = 5 */
	public static final String Nickel051015 = "5";
	@XendraRefItem(Name="Ten 10.00, 20.00, ..",
		Value="T",
		Description="",
		Identifier="13ab01d5-d271-05b0-bf3f-a026d89d5a74")
	/** Ten 10.00, 20.00, .. = T */
	public static final String Ten10002000 = "T";
	@XendraRef(Name="M_DiscountPriceList RoundingRule",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="Price Rounding Rule list",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="317c2ec3-8463-ddaf-7302-ddb30b73eb93")
	public static final String Identifier = "317c2ec3-8463-ddaf-7302-ddb30b73eb93";

}
