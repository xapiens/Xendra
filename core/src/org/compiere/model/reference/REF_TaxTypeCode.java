package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_TaxTypeCode implements Reference 
{
 	@XendraRefItem(Name="ISC ",
		Value="2000",
		Description="Impuesto selectivo al consumo",
		Identifier="416f8bfd-99d3-4e64-908c-8072743732a1")
	/** ISC  = 2000 */
	public static final String ISC = "2000";
	@XendraRefItem(Name="IGV",
		Value="1000",
		Description="Impuesto General a las ventas",
		Identifier="2647fd9b-bd98-4452-92f2-6c8109019a5b")
	/** IGV = 1000 */
	public static final String IGV = "1000";
	@XendraRefItem(Name="EXP",
		Value="9995",
		Description="Exportacion",
		Identifier="59e8ea23-612a-419f-a05e-849adf490159")
	/** EXP = 9995 */
	public static final String EXP = "9995";
	@XendraRefItem(Name="GRA",
		Value="9996",
		Description="Gratuito",
		Identifier="31fa325d-8009-47f1-b88d-e4e579f4c639")
	/** GRA = 9996 */
	public static final String GRA = "9996";
	@XendraRefItem(Name="EXO",
		Value="9997",
		Description="Exonerado",
		Identifier="dc36d725-d39e-499e-a737-b800babdc101")
	/** EXO = 9997 */
	public static final String EXO = "9997";
	@XendraRefItem(Name="INA",
		Value="9998",
		Description="Inafecto",
		Identifier="f1470e64-3521-43b5-a00c-fbe96293c727")
	/** INA = 9998 */
	public static final String INA = "9998";
	@XendraRefItem(Name="OTR",
		Value="9999",
		Description="Otros Conceptos de Pago",
		Identifier="f75437a7-3d1b-4909-ad74-cb9a2b261fd5")
	/** OTR = 9999 */
	public static final String OTR = "9999";
	@XendraRefItem(Name="IVAP",
		Value="1016",
		Description="Impuesto a la venta arroz pilado",
		Identifier="0569018e-8d9a-4a91-8978-8f4d0001c9b4")
	/** IVAP = 1016 */
	public static final String IVAP = "1016";
	@XendraRef(Name="TaxTypeCode",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2022-05-26 12:50:38.015",
		Extension="",
		Identifier="a699065c-1917-4584-b020-546bfeba6320")
	public static final String Identifier = "a699065c-1917-4584-b020-546bfeba6320";

}
