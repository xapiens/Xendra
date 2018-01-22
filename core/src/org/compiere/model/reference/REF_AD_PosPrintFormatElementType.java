package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_PosPrintFormatElementType implements Reference 
{
 	@XendraRefItem(Name="Text",
		Value="T",
		Description="A simple string to be printed",
		Identifier="71df5f0b-2553-d801-3cb6-61e34d044c0c")
	/** Text = T */
	public static final String Text = "T";
	@XendraRefItem(Name="Cut page",
		Value="C",
		Description="",
		Identifier="c53ce6af-01a6-0b80-ab50-17358865909f")
	/** Cut page = C */
	public static final String CutPage = "C";
	@XendraRefItem(Name="Data (from table)",
		Value="D",
		Description="A value which is retrieved from the document",
		Identifier="a308fe0f-1b34-a4c4-29b6-c5eca8a9374d")
	/** Data (from table) = D */
	public static final String DataFromTable = "D";
	@XendraRefItem(Name="Separator",
		Value="S",
		Description="A line which covers a complete printer line",
		Identifier="4ce83bc4-05bb-4eff-b211-c84b117d8135")
	/** Separator = S */
	public static final String Separator = "S";
	@XendraRef(Name="AD_PosPrintFormatElement Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="L",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="a7578cfa-e502-e20a-5671-f0e7fae03435")
	public static final String Identifier = "a7578cfa-e502-e20a-5671-f0e7fae03435";

}
