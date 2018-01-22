package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_RfQQuoteType implements Reference 
{
 	@XendraRefItem(Name="Quote Total only",
		Value="T",
		Description="",
		Identifier="c6ee2f1b-1be5-6eeb-4009-86785e981b32")
	/** Quote Total only = T */
	public static final String QuoteTotalOnly = "T";
	@XendraRefItem(Name="Quote Selected Lines",
		Value="S",
		Description="",
		Identifier="a9d48b50-8c92-e09a-fc6d-3190ed69445a")
	/** Quote Selected Lines = S */
	public static final String QuoteSelectedLines = "S";
	@XendraRefItem(Name="Quote All Lines",
		Value="A",
		Description="",
		Identifier="ecd0d2f4-098c-8930-21ce-2679d0db0933")
	/** Quote All Lines = A */
	public static final String QuoteAllLines = "A";
	@XendraRef(Name="C_RfQ QuoteType",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="c8f5b695-5ad9-886d-7e73-6214a0a36469")
	public static final String Identifier = "c8f5b695-5ad9-886d-7e73-6214a0a36469";

}
