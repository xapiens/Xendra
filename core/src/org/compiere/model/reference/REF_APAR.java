package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_APAR implements Reference 
{
 	@XendraRefItem(Name="Receivables & Payables",
		Value="A",
		Description="",
		Identifier="08d73f76-acc9-9faf-d417-cf9619560dbe")
	/** Receivables & Payables = A */
	public static final String ReceivablesPayables = "A";
	@XendraRefItem(Name="Receivables only",
		Value="R",
		Description="",
		Identifier="ded0b9fe-0b30-23fc-45a9-1fbd2798a085")
	/** Receivables only = R */
	public static final String ReceivablesOnly = "R";
	@XendraRefItem(Name="Payables only",
		Value="P",
		Description="",
		Identifier="3e12bdae-1e38-bd67-c74f-203fd8ce1d3a")
	/** Payables only = P */
	public static final String PayablesOnly = "P";
	@XendraRef(Name="APAR",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="AP and/or AR",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="f7f54ef7-c97e-a561-fa1c-241fadd391d4")
	public static final String Identifier = "f7f54ef7-c97e-a561-fa1c-241fadd391d4";

}
