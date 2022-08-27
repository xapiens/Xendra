package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_ECE_5153 implements Reference 
{
 	@XendraRefItem(Name="EXPORTACION",
		Value="FRE",
		Description="EXPORTACION",
		Identifier="63c74f15-86f3-4d8f-bac9-79489d49ff50")
	/** EXPORTACION = FRE */
	public static final String EXPORTACION = "FRE";
	@XendraRefItem(Name="Other taxes",
		Value="OTH",
		Description="OTROS CONCEPTOS DE PAGO",
		Identifier="c0d70629-428b-43a4-a3ef-0e3ed42566e1")
	/** Other taxes = OTH */
	public static final String OtherTaxes = "OTH";
	@XendraRefItem(Name="Value added tax",
		Value="VAT",
		Description="IGV IMPUESTO GENERAL A LAS VENTAS",
		Identifier="6d3c9bc0-54e4-4bdd-b17e-3d78e6cb54b8")
	/** Value added tax = VAT */
	public static final String ValueAddedTax = "VAT";
	@XendraRefItem(Name="Excise duty",
		Value="EXC",
		Description="ISC IMPUESTO SELECTIVO AL CONSUMO",
		Identifier="010db1c9-e2bc-456d-9081-95dc8837f622")
	/** Excise duty = EXC */
	public static final String ExciseDuty = "EXC";
	@XendraRef(Name="ECE_5153",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2022-05-26 17:17:51.757",
		Extension="",
		Identifier="4cdd85df-9b38-4ad7-82cd-f40112b627a0")
	public static final String Identifier = "4cdd85df-9b38-4ad7-82cd-f40112b627a0";

}
