package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_OrderDeliveryViaRule implements Reference 
{
 	@XendraRefItem(Name="Pickup",
		Value="P",
		Description="",
		Identifier="4d0b20bd-d568-eb76-0ba9-9c9e4bd36acb")
	/** Pickup = P */
	public static final String Pickup = "P";
	@XendraRefItem(Name="Delivery",
		Value="D",
		Description="",
		Identifier="e205228b-9452-fc62-46ca-34e1cc7391a5")
	/** Delivery = D */
	public static final String Delivery = "D";
	@XendraRefItem(Name="Shipper",
		Value="S",
		Description="",
		Identifier="612c6c4e-c962-d6bd-0668-885dfff52f7c")
	/** Shipper = S */
	public static final String Shipper = "S";
	@XendraRef(Name="C_Order DeliveryViaRule",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="Delivery via Rule list",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="e0d8ddbc-d567-6f32-8ce6-274924c5926f")
	public static final String Identifier = "e0d8ddbc-d567-6f32-8ce6-274924c5926f";

}
