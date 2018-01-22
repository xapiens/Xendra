package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_ImpFormatType implements Reference 
{
 	@XendraRefItem(Name="Business Partner",
		Value="B",
		Description="",
		Identifier="bc7de076-f660-4a7a-8ee9-6524871e21b8")
	/** Business Partner = B */
	public static final String BusinessPartner = "B";
	@XendraRefItem(Name="Accounts",
		Value="A",
		Description="",
		Identifier="974bee5f-10db-4e47-9606-dbf0384d15c1")
	/** Accounts = A */
	public static final String Accounts = "A";
	@XendraRefItem(Name="Exchange Rates",
		Value="E",
		Description="",
		Identifier="342cc007-f110-4381-9d50-94f54e0f091b")
	/** Exchange Rates = E */
	public static final String ExchangeRates = "E";
	@XendraRefItem(Name="Inventory Count",
		Value="I",
		Description="",
		Identifier="a5b4cefa-c73e-4e8d-9a5e-7b452647306b")
	/** Inventory Count = I */
	public static final String InventoryCount = "I";
	@XendraRefItem(Name="Product",
		Value="P",
		Description="",
		Identifier="fc9cb25d-0584-4a45-b91b-4f0d9be1c1a1")
	/** Product = P */
	public static final String Product = "P";
	@XendraRefItem(Name="GL Balances",
		Value="S",
		Description="",
		Identifier="998e251a-2c85-4c9b-a4c2-57cdfecf1fd4")
	/** GL Balances = S */
	public static final String GLBalances = "S";
	@XendraRef(Name="AD_ImpFormat Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="L",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2015-07-16 06:55:59.0",
		Extension="",
		Identifier="d47ffb98-e39e-4767-a0f0-f7723e7b907a")
	public static final String Identifier = "d47ffb98-e39e-4767-a0f0-f7723e7b907a";

}
