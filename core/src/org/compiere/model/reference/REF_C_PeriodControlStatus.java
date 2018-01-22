package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_PeriodControlStatus implements Reference 
{
 	@XendraRefItem(Name="Never opened",
		Value="N",
		Description="",
		Identifier="fcc68a35-8e17-9ffc-d96a-183529ff53ae")
	/** Never opened = N */
	public static final String NeverOpened = "N";
	@XendraRefItem(Name="Open",
		Value="O",
		Description="",
		Identifier="40e15586-a2fb-3bf5-0b06-05ee02617bc3")
	/** Open = O */
	public static final String Open = "O";
	@XendraRefItem(Name="Closed",
		Value="C",
		Description="",
		Identifier="5125e25c-f793-b7b4-9a5e-0c35764083e3")
	/** Closed = C */
	public static final String Closed = "C";
	@XendraRefItem(Name="Permanently closed",
		Value="P",
		Description="",
		Identifier="08354298-aabe-7168-d73c-b3efddd00d62")
	/** Permanently closed = P */
	public static final String PermanentlyClosed = "P";
	@XendraRef(Name="C_PeriodControl Status",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="L",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="8e8ed358-4348-653f-ffae-63b13cc40a68")
	public static final String Identifier = "8e8ed358-4348-653f-ffae-63b13cc40a68";

}
