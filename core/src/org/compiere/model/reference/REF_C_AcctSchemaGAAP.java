package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_AcctSchemaGAAP implements Reference 
{
 	@XendraRefItem(Name="International GAAP",
		Value="UN",
		Description="International GAAP",
		Identifier="e4213910-f10b-51ed-7de9-895e8a41c061")
	/** International GAAP = UN */
	public static final String InternationalGAAP = "UN";
	@XendraRefItem(Name="US GAAP",
		Value="US",
		Description="United States GAAP",
		Identifier="3b8c5b10-2db6-b870-dd7a-166bce95b261")
	/** US GAAP = US */
	public static final String USGAAP = "US";
	@XendraRefItem(Name="French Accounting Standard",
		Value="FR",
		Description="",
		Identifier="ff715992-f6a4-0419-1f35-dd98df4679da")
	/** French Accounting Standard = FR */
	public static final String FrenchAccountingStandard = "FR";
	@XendraRefItem(Name="Custom Accounting Rules",
		Value="XX",
		Description="",
		Identifier="1bb2ae7c-6e75-8ba5-1f54-dbec344f7216")
	/** Custom Accounting Rules = XX */
	public static final String CustomAccountingRules = "XX";
	@XendraRefItem(Name="German HGB",
		Value="DE",
		Description="German HGB",
		Identifier="e5224a05-077f-31be-a787-6fb90ac8bd28")
	/** German HGB = DE */
	public static final String GermanHGB = "DE";
	@XendraRef(Name="C_AcctSchema GAAP",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="General Accepted Accounting Principle list",
		Help="",
		VFormat="LL",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="a2f94990-e1f6-4c2e-a891-4ea9109dd64e")
	public static final String Identifier = "a2f94990-e1f6-4c2e-a891-4ea9109dd64e";

}
