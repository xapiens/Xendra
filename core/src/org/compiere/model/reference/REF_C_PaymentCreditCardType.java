package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_PaymentCreditCardType implements Reference 
{
 	@XendraRefItem(Name="Amex",
		Value="A",
		Description="",
		Identifier="6cf2d54d-fae6-7322-f3e3-56a4de4c71b4")
	/** Amex = A */
	public static final String Amex = "A";
	@XendraRefItem(Name="MasterCard",
		Value="M",
		Description="",
		Identifier="1d47efb0-48e6-248d-c312-b422b9b5128f")
	/** MasterCard = M */
	public static final String MasterCard = "M";
	@XendraRefItem(Name="Visa",
		Value="V",
		Description="",
		Identifier="6e629535-c1e9-2b05-1c18-783a6e07b994")
	/** Visa = V */
	public static final String Visa = "V";
	@XendraRefItem(Name="ATM",
		Value="C",
		Description="",
		Identifier="5f7144a1-92ca-242d-8711-842cfc0023de")
	/** ATM = C */
	public static final String ATM = "C";
	@XendraRefItem(Name="Purchase Card",
		Value="P",
		Description="Corporate Purchase Card",
		Identifier="b38b8fe9-52fe-fa1f-13b0-dca6b770cf88")
	/** Purchase Card = P */
	public static final String PurchaseCard = "P";
	@XendraRefItem(Name="Diners",
		Value="D",
		Description="",
		Identifier="5f4f8518-1809-17ba-a38b-61e0ae6054c2")
	/** Diners = D */
	public static final String Diners = "D";
	@XendraRefItem(Name="Discover",
		Value="N",
		Description="",
		Identifier="f71050e5-f501-0922-834f-abe1281fcb25")
	/** Discover = N */
	public static final String Discover = "N";
	@XendraRefItem(Name="Ripley",
		Value="R",
		Description="",
		Identifier="d50d0505-1abf-3854-6f12-8a9414f1b25d")
	/** Ripley = R */
	public static final String Ripley = "R";
	@XendraRefItem(Name="CMR Falabella",
		Value="S",
		Description="",
		Identifier="7818c29e-f0a4-6957-575b-f0d9fbece355")
	/** CMR Falabella = S */
	public static final String CMRFalabella = "S";
	@XendraRef(Name="C_Payment CreditCard Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="C_Payment Credit Card Type list",
		Help="",
		VFormat="A",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="5ca77e7f-ae8f-2faa-c3ab-3c8ffded32d9")
	public static final String Identifier = "5ca77e7f-ae8f-2faa-c3ab-3c8ffded32d9";

}
