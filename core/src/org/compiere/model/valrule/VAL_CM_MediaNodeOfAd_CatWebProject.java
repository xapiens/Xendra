package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_CM_MediaNodeOfAd_CatWebProject implements ValRule 
{
 	@XendraValRule(Name="CM_Media node of Ad_Cat.WebProject",
		AD_Val_Rule_ID=267,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="89992a19-eadd-4391-a993-c9dbd91c8a5a",
		Synchronized="2015-07-22 09:30:47.0")
	public static final String Identifier = "89992a19-eadd-4391-a993-c9dbd91c8a5a";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("CM_Media.IsSummary='N'  AND EXISTS (SELECT * FROM CM_Ad_Cat c WHERE c.CM_Ad_Cat_ID=@CM_Ad_Cat_ID@ AND CM_Media.CM_WebProject_ID=c.CM_WebProject_ID)");
	return sb.toString();
}
}
