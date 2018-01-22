package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_Ad_ModelValidator implements Reference 
{
 	@XendraRefItem(Name="csv",
		Value="10000001",
		Description="",
		Identifier="b6dc5d27-605c-4ae1-a84d-69a995a9a9ce")
	/** csv = 10000001 */
	public static final String Csv = "10000001";
	@XendraRef(Name="Ad_ModelValidator",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2015-07-16 06:55:59.0",
		Extension="",
		Identifier="96d806fb-d280-459b-a901-ce403993b40b")
	public static final String Identifier = "96d806fb-d280-459b-a901-ce403993b40b";

}
