package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AdditionalInformationTax implements Reference 
{
 	@XendraRefItem(Name="Venta interna",
		Value="01",
		Description="",
		Identifier="3556c771-c5a4-4762-bdfd-7fdc72c4394e")
	/** Venta interna = 01 */
	public static final String VentaInterna = "01";
	@XendraRefItem(Name="Exportacion",
		Value="02",
		Description="",
		Identifier="4d3b9e16-8865-474f-9696-27fb1bc7ee66")
	/** Exportacion = 02 */
	public static final String Exportacion = "02";
	@XendraRefItem(Name="No Domiciliados",
		Value="03",
		Description="",
		Identifier="6332cba9-180b-48db-8ec9-f7520cd0aa4f")
	/** No Domiciliados = 03 */
	public static final String NoDomiciliados = "03";
	@XendraRefItem(Name="Venta Interna - Anticipos",
		Value="04",
		Description="",
		Identifier="67f411e2-0fb7-44c1-b7a3-9ec6b1d37ee0")
	/** Venta Interna - Anticipos = 04 */
	public static final String VentaInterna_Anticipos = "04";
	@XendraRefItem(Name="Venta Itinerante",
		Value="05",
		Description="",
		Identifier="0ea59c5d-0d2f-4f1c-bdc3-f20a6c5d2b97")
	/** Venta Itinerante = 05 */
	public static final String VentaItinerante = "05";
	@XendraRefItem(Name="Factura Guia",
		Value="06",
		Description="",
		Identifier="9fd07bf1-4977-4fc4-9c18-20b5bfaed9a4")
	/** Factura Guia = 06 */
	public static final String FacturaGuia = "06";
	@XendraRefItem(Name="Venta Arroz Pilado",
		Value="07",
		Description="",
		Identifier="f42a9cf5-189a-4f5d-bf43-4846072aeceb")
	/** Venta Arroz Pilado = 07 */
	public static final String VentaArrozPilado = "07";
	@XendraRefItem(Name="Factura - Comprobante de Percepcion",
		Value="08",
		Description="",
		Identifier="ed43f523-6426-47bd-94a2-e6a57e11a9aa")
	/** Factura - Comprobante de Percepcion = 08 */
	public static final String Factura_ComprobanteDePercepcion = "08";
	@XendraRefItem(Name="Factura - Guia remitente",
		Value="10",
		Description="",
		Identifier="558921a3-7c90-4b23-a515-0e576270cc59")
	/** Factura - Guia remitente = 10 */
	public static final String Factura_GuiaRemitente = "10";
	@XendraRefItem(Name="Factura - Guia Transportista",
		Value="11",
		Description="",
		Identifier="42588157-4e9f-4be1-85cf-060aa8390dfa")
	/** Factura - Guia Transportista = 11 */
	public static final String Factura_GuiaTransportista = "11";
	@XendraRefItem(Name="Boleta de venta - Comprobante de Percepcion",
		Value="12",
		Description="",
		Identifier="4b8b91ed-309b-482c-9f0a-7f230b025001")
	/** Boleta de venta - Comprobante de Percepcion = 12 */
	public static final String BoletaDeVenta_ComprobanteDePercepcion = "12";
	@XendraRefItem(Name="Gasto Deducible Persona Natural",
		Value="13",
		Description="",
		Identifier="1cbbc58e-55c0-43f1-82b9-7428202d738c")
	/** Gasto Deducible Persona Natural = 13 */
	public static final String GastoDeduciblePersonaNatural = "13";
	@XendraRef(Name="Additional Information Tax",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2022-05-04 21:20:56.935",
		Extension="",
		Identifier="9825538b-50d2-4dbf-aa24-1ea9cb9420f5")
	public static final String Identifier = "9825538b-50d2-4dbf-aa24-1ea9cb9420f5";

}
