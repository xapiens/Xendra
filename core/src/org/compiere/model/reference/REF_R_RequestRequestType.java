package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_R_RequestRequestType implements Reference 
{
 	@XendraRefItem(Name="Information",
		Value="I",
		Description="",
		Identifier="e9518d3f-6290-4345-9c3f-99bab2672e7d")
	/** Information = I */
	public static final String Information = "I";
	@XendraRefItem(Name="Charge",
		Value="C",
		Description="",
		Identifier="21c578be-7d70-49ec-95b0-f2c31f628d47")
	/** Charge = C */
	public static final String Charge = "C";
	@XendraRefItem(Name="Account",
		Value="A",
		Description="",
		Identifier="e3064ca1-1eaf-4e5b-a4fd-190b22d64a6a")
	/** Account = A */
	public static final String Account = "A";
	@XendraRefItem(Name="Alert",
		Value="X",
		Description="",
		Identifier="12c85004-2a5c-40c6-b967-870eb3c0eb50")
	/** Alert = X */
	public static final String Alert = "X";
	@XendraRefItem(Name="Other",
		Value="O",
		Description="",
		Identifier="2bee80d4-f6c1-486e-8e7e-4dd6b03727f4")
	/** Other = O */
	public static final String Other = "O";
	@XendraRefItem(Name="Service",
		Value="S",
		Description="",
		Identifier="5cd4acbc-562a-4d44-aa81-fde827e09004")
	/** Service = S */
	public static final String Service = "S";
	@XendraRefItem(Name="Help",
		Value="H",
		Description="",
		Identifier="9265343e-8678-49fe-af2d-ccf51e590284")
	/** Help = H */
	public static final String Help = "H";
	@XendraRefItem(Name="Warranty",
		Value="W",
		Description="",
		Identifier="eb6e71d2-d644-46b2-b241-988590b3abaf")
	/** Warranty = W */
	public static final String Warranty = "W";
	@XendraRef(Name="R_Request Request Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="L",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2015-07-16 06:56:14.0",
		Extension="",
		Identifier="044621f1-b404-44d2-8b64-f73ca5e919b4")
	public static final String Identifier = "044621f1-b404-44d2-8b64-f73ca5e919b4";

}
