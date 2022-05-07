package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_ECE_5153 implements Reference 
{
 	@XendraRefItem(Name="EXPORTACION",
		Value="FRE",
		Description="",
		Identifier="63c74f15-86f3-4d8f-bac9-79489d49ff50")
	/** EXPORTACION = FRE */
	public static final String EXPORTACION = "FRE";
	@XendraRefItem(Name="OTROS CONCEPTOS DE PAGO",
		Value="OTH",
		Description="",
		Identifier="c0d70629-428b-43a4-a3ef-0e3ed42566e1")
	/** OTROS CONCEPTOS DE PAGO = OTH */
	public static final String OTROSCONCEPTOSDEPAGO = "OTH";
	@XendraRefItem(Name="IGV IMPUESTO GENERAL A LAS VENTAS",
		Value="VAT",
		Description="",
		Identifier="6d3c9bc0-54e4-4bdd-b17e-3d78e6cb54b8")
	/** IGV IMPUESTO GENERAL A LAS VENTAS = VAT */
	public static final String IGVIMPUESTOGENERALALASVENTAS = "VAT";
	@XendraRefItem(Name="ISC IMPUESTO SELECTIVO AL CONSUMO",
		Value="EXC",
		Description="",
		Identifier="010db1c9-e2bc-456d-9081-95dc8837f622")
	/** ISC IMPUESTO SELECTIVO AL CONSUMO = EXC */
	public static final String ISCIMPUESTOSELECTIVOALCONSUMO = "EXC";
	@XendraRef(Name="ECE_5153",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2022-05-06 12:51:07.365",
		Extension="",
		Identifier="4cdd85df-9b38-4ad7-82cd-f40112b627a0")
	public static final String Identifier = "4cdd85df-9b38-4ad7-82cd-f40112b627a0";

}
