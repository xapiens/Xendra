package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_TierRange implements Reference 
{
 	@XendraRefItem(Name="Sistema al valor (Apéndice IV, lit. A – T.U.O IGV e ISC)",
		Value="01",
		Description="",
		Identifier="fd64071a-68a3-4260-b4b2-65fc2ffaa7bb")
	/** Sistema al valor (Apéndice IV, lit. A – T.U.O IGV e ISC) = 01 */
	public static final String SistemaAlValorApéndiceIVLitATUOIGVEISC = "01";
	@XendraRefItem(Name="Aplicación del Monto Fijo (Apéndice IV, lit. B – T.U.O IGV e",
		Value="02",
		Description="",
		Identifier="aa51c584-7e85-49ce-a1a8-c233df922f8c")
	/** Aplicación del Monto Fijo (Apéndice IV, lit. B – T.U.O IGV e = 02 */
	public static final String AplicaciónDelMontoFijoApéndiceIVLitBTUOIGVE = "02";
	@XendraRefItem(Name="Sistema de Precios de Venta al Público (Apéndice IV, lit. C ",
		Value="03",
		Description="",
		Identifier="e4ebf066-a1f0-464e-bb95-58a900cef1e1")
	/** Sistema de Precios de Venta al Público (Apéndice IV, lit. C  = 03 */
	public static final String SistemaDePreciosDeVentaAlPúblicoApéndiceIVLitC = "03";
	@XendraRef(Name="Tier Range",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2022-05-07 12:41:05.538",
		Extension="",
		Identifier="f1d7cc25-be28-46f5-8c39-fd1a4ede48b7")
	public static final String Identifier = "f1d7cc25-be28-46f5-8c39-fd1a4ede48b7";

}
