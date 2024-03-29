package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_TaxExemptionReasonCode implements Reference 
{
 	@XendraRefItem(Name="Gravado - Retiro por premio",
		Value="11",
		Description="",
		Identifier="c92da643-0994-48ad-babd-c2cf24be9570")
	/** Gravado - Retiro por premio = 11 */
	public static final String Gravado_RetiroPorPremio = "11";
	@XendraRefItem(Name="Gravado - Retiro por donacion",
		Value="12",
		Description="",
		Identifier="bdf09549-3918-4f8a-93bf-00a1a628597e")
	/** Gravado - Retiro por donacion = 12 */
	public static final String Gravado_RetiroPorDonacion = "12";
	@XendraRefItem(Name="Gravado - Retiro",
		Value="13",
		Description="",
		Identifier="2b664a75-be3d-4bcc-ac6c-3e5d8763b4fe")
	/** Gravado - Retiro = 13 */
	public static final String Gravado_Retiro = "13";
	@XendraRefItem(Name="Gravado - Retiro por publicidad",
		Value="14",
		Description="",
		Identifier="53a4ba50-f449-43c9-9e0c-4d62ce8ac18a")
	/** Gravado - Retiro por publicidad = 14 */
	public static final String Gravado_RetiroPorPublicidad = "14";
	@XendraRefItem(Name="Gravado - Bonificaciones",
		Value="15",
		Description="",
		Identifier="ef763eca-45e1-4243-95c3-a1b713b2227f")
	/** Gravado - Bonificaciones = 15 */
	public static final String Gravado_Bonificaciones = "15";
	@XendraRefItem(Name="Gravado - Retiro por entrega a trabajadores",
		Value="16",
		Description="",
		Identifier="c414b67f-8fcc-48f0-bde4-c7d5b52d9a5c")
	/** Gravado - Retiro por entrega a trabajadores = 16 */
	public static final String Gravado_RetiroPorEntregaATrabajadores = "16";
	@XendraRefItem(Name="Gravado - IVAP",
		Value="17",
		Description="",
		Identifier="9eb12ded-3fa9-453f-a7a9-77a059d597c8")
	/** Gravado - IVAP = 17 */
	public static final String Gravado_IVAP = "17";
	@XendraRefItem(Name="Exonerado - Operacion Onerosa",
		Value="20",
		Description="",
		Identifier="4cba80e5-4fbe-4f17-964e-86eeeb47b637")
	/** Exonerado - Operacion Onerosa = 20 */
	public static final String Exonerado_OperacionOnerosa = "20";
	@XendraRefItem(Name="Exonerado - Transferencia Gratuita",
		Value="21",
		Description="",
		Identifier="63af8ca3-c8e4-4451-b633-376757b48560")
	/** Exonerado - Transferencia Gratuita = 21 */
	public static final String Exonerado_TransferenciaGratuita = "21";
	@XendraRefItem(Name="Inafecto - Operacion Onerosa",
		Value="30",
		Description="",
		Identifier="6e5046cd-9c1d-4468-9217-50c6120ae545")
	/** Inafecto - Operacion Onerosa = 30 */
	public static final String Inafecto_OperacionOnerosa = "30";
	@XendraRefItem(Name="Inafecto - Retiro",
		Value="32",
		Description="",
		Identifier="1e2c0a68-3cf0-4685-8b55-690c1a78fa69")
	/** Inafecto - Retiro = 32 */
	public static final String Inafecto_Retiro = "32";
	@XendraRefItem(Name="Inafecto - Retiro por Convenio Colectivo",
		Value="34",
		Description="",
		Identifier="928c2950-9e32-429a-81cf-4544f0a01c45")
	/** Inafecto - Retiro por Convenio Colectivo = 34 */
	public static final String Inafecto_RetiroPorConvenioColectivo = "34";
	@XendraRefItem(Name="Gravado - Operacion Onerosa",
		Value="10",
		Description="",
		Identifier="c5110455-317b-4f52-a27c-c8d36eb953cb")
	/** Gravado - Operacion Onerosa = 10 */
	public static final String Gravado_OperacionOnerosa = "10";
	@XendraRefItem(Name="Inafecto - Retiro por bonificacion",
		Value="31",
		Description="",
		Identifier="81dedfe9-89e2-45db-b68a-661ddf670687")
	/** Inafecto - Retiro por bonificacion = 31 */
	public static final String Inafecto_RetiroPorBonificacion = "31";
	@XendraRefItem(Name="Inafecto - Retiro por Muestras Medicas",
		Value="33",
		Description="",
		Identifier="9a16208d-842c-4fbb-b8f0-9f64c22e7fa7")
	/** Inafecto - Retiro por Muestras Medicas = 33 */
	public static final String Inafecto_RetiroPorMuestrasMedicas = "33";
	@XendraRefItem(Name="Inafecto - Retiro por premio",
		Value="35",
		Description="",
		Identifier="1208e17b-7903-4624-9fb7-e142b6d4437d")
	/** Inafecto - Retiro por premio = 35 */
	public static final String Inafecto_RetiroPorPremio = "35";
	@XendraRefItem(Name="Inafecto - Retiro por publicidad",
		Value="36",
		Description="",
		Identifier="6c801081-9787-4de4-8b55-f9f6d7a2f5c0")
	/** Inafecto - Retiro por publicidad = 36 */
	public static final String Inafecto_RetiroPorPublicidad = "36";
	@XendraRefItem(Name="Exportacion de bienes o servicios",
		Value="40",
		Description="",
		Identifier="0d54e063-b8a4-44ec-a8d7-8cecfe25a788")
	/** Exportacion de bienes o servicios = 40 */
	public static final String ExportacionDeBienesOServicios = "40";
	@XendraRef(Name="TaxExemptionReasonCode",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2022-09-03 18:51:16.996",
		Extension="",
		Identifier="aaf59fc0-b972-45e3-a527-a1b89923d2ba")
	public static final String Identifier = "aaf59fc0-b972-45e3-a527-a1b89923d2ba";

}
