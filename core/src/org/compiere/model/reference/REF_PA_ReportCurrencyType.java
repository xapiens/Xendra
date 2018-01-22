package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_PA_ReportCurrencyType implements Reference 
{
 	@XendraRefItem(Name="Source Currency",
		Value="S",
		Description="",
		Identifier="a3e79655-aadf-8211-bb93-0d659f62bd54")
	/** Source Currency = S */
	public static final String SourceCurrency = "S";
	@XendraRefItem(Name="Accounting Currency",
		Value="A",
		Description="",
		Identifier="d983013a-c782-cb96-f8c5-604b9e85f48e")
	/** Accounting Currency = A */
	public static final String AccountingCurrency = "A";
	@XendraRef(Name="PA_Report CurrencyType",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="85df3775-2b7b-c8f7-5f10-c83a9bb26ff0")
	public static final String Identifier = "85df3775-2b7b-c8f7-5f10-c83a9bb26ff0";

}
