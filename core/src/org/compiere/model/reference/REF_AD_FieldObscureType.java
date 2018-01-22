package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_FieldObscureType implements Reference 
{
 	@XendraRefItem(Name="Obscure Digits but last 4",
		Value="904",
		Description="",
		Identifier="3611a706-e6e8-8b14-ca24-cef689605e39")
	/** Obscure Digits but last 4 = 904 */
	public static final String ObscureDigitsButLast4 = "904";
	@XendraRefItem(Name="Obscure Digits but first/last 4",
		Value="944",
		Description="",
		Identifier="98bd054d-87f7-f16c-d963-af8cbf142fe5")
	/** Obscure Digits but first/last 4 = 944 */
	public static final String ObscureDigitsButFirstLast4 = "944";
	@XendraRefItem(Name="Obscure AlphaNumeric but first/last 4",
		Value="A44",
		Description="",
		Identifier="266b48a6-86f2-8dfb-a6f2-fdf08394e6d2")
	/** Obscure AlphaNumeric but first/last 4 = A44 */
	public static final String ObscureAlphaNumericButFirstLast4 = "A44";
	@XendraRefItem(Name="Obscure AlphaNumeric but last 4",
		Value="A04",
		Description="",
		Identifier="78c0ee3d-e3c9-94f9-d749-3ebdf4f52f09")
	/** Obscure AlphaNumeric but last 4 = A04 */
	public static final String ObscureAlphaNumericButLast4 = "A04";
	@XendraRef(Name="AD_Field ObscureType",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="3aff5650-9d13-fa70-7eca-ed23026eb8ea")
	public static final String Identifier = "3aff5650-9d13-fa70-7eca-ed23026eb8ea";

}
