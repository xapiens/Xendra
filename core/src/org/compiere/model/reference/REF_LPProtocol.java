package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_LPProtocol implements Reference 
{
 	@XendraRefItem(Name="Line Printer Daemon",
		Value="LPD",
		Description="",
		Identifier="c0ebc7a4-7f23-60ff-e381-b8d882ab229c")
	/** Line Printer Daemon = LPD */
	public static final String LinePrinterDaemon = "LPD";
	@XendraRefItem(Name="Uniform Naming Convention",
		Value="UNC",
		Description="",
		Identifier="3037bc38-5252-7e56-eca8-bf214adc3f7a")
	/** Uniform Naming Convention = UNC */
	public static final String UniformNamingConvention = "UNC";
	@XendraRef(Name="LP Protocol",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="LP Protocol",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="1421b9fb-bf76-e467-7a43-01fe16edcec0")
	public static final String Identifier = "1421b9fb-bf76-e467-7a43-01fe16edcec0";

}
