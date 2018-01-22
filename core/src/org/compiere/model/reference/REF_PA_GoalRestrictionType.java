package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_PA_GoalRestrictionType implements Reference 
{
 	@XendraRefItem(Name="Organization",
		Value="O",
		Description="",
		Identifier="6abe1618-4b98-5c63-e1e8-ea91d0b7a658")
	/** Organization = O */
	public static final String Organization = "O";
	@XendraRefItem(Name="Business Partner",
		Value="B",
		Description="",
		Identifier="80f23c5b-ef50-c984-5ce7-1c760d44f77e")
	/** Business Partner = B */
	public static final String BusinessPartner = "B";
	@XendraRefItem(Name="Product",
		Value="P",
		Description="",
		Identifier="8e68f803-d573-5d86-da25-fa4d3f66109c")
	/** Product = P */
	public static final String Product = "P";
	@XendraRefItem(Name="Bus.Partner Group",
		Value="G",
		Description="",
		Identifier="d5ade7ae-5f78-5258-18a5-f6d0c07e7aaa")
	/** Bus.Partner Group = G */
	public static final String BusPartnerGroup = "G";
	@XendraRefItem(Name="Product Category",
		Value="C",
		Description="",
		Identifier="49a779f9-2fbe-92c7-7d7a-2b6d38120f2d")
	/** Product Category = C */
	public static final String ProductCategory = "C";
	@XendraRef(Name="PA_Goal Restriction Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="1bf6024a-4612-c6c4-ca75-eaf7b4295b7f")
	public static final String Identifier = "1bf6024a-4612-c6c4-ca75-eaf7b4295b7f";

}
