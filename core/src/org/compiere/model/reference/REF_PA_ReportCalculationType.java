package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_PA_ReportCalculationType implements Reference 
{
 	@XendraRefItem(Name="Add (Op1+Op2)",
		Value="A",
		Description="",
		Identifier="5867ed51-2e5e-45a2-659d-f8299d728cd8")
	/** Add (Op1+Op2) = A */
	public static final String AddOp1PlusOp2 = "A";
	@XendraRefItem(Name="Subtract (Op1-Op2)",
		Value="S",
		Description="",
		Identifier="fa792abc-a32d-cae7-d551-30b30ed130af")
	/** Subtract (Op1-Op2) = S */
	public static final String SubtractOp1_Op2 = "S";
	@XendraRefItem(Name="Percentage (Op1 of Op2)",
		Value="P",
		Description="",
		Identifier="6d395e6e-1f6c-829d-9a9f-b867f6b37361")
	/** Percentage (Op1 of Op2) = P */
	public static final String PercentageOp1OfOp2 = "P";
	@XendraRefItem(Name="Add Range (Op1 to Op2)",
		Value="R",
		Description="",
		Identifier="d53e6264-a76a-9947-8479-ea91ae846493")
	/** Add Range (Op1 to Op2) = R */
	public static final String AddRangeOp1ToOp2 = "R";
	@XendraRef(Name="PA_Report CalculationType",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="3a174b14-50ef-3398-51bd-b9392c6e2c0a")
	public static final String Identifier = "3a174b14-50ef-3398-51bd-b9392c6e2c0a";

}
