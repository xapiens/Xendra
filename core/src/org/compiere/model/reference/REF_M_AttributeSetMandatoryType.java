package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_M_AttributeSetMandatoryType implements Reference 
{
 	@XendraRefItem(Name="Not Mandatary",
		Value="N",
		Description="",
		Identifier="41fcc4c6-6ce1-8bf5-7843-01515e058fa5")
	/** Not Mandatary = N */
	public static final String NotMandatary = "N";
	@XendraRefItem(Name="Always Mandatory",
		Value="Y",
		Description="",
		Identifier="ad490df2-6f7a-d7a6-8fa8-c868600d8ad5")
	/** Always Mandatory = Y */
	public static final String AlwaysMandatory = "Y";
	@XendraRefItem(Name="When Shipping",
		Value="S",
		Description="",
		Identifier="110a41d0-683e-974e-83d8-23187f5dce18")
	/** When Shipping = S */
	public static final String WhenShipping = "S";
	@XendraRef(Name="M_AttributeSet MandatoryType",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="e78f0302-6d18-500f-f079-cd055de11f62")
	public static final String Identifier = "e78f0302-6d18-500f-f079-cd055de11f62";

}
