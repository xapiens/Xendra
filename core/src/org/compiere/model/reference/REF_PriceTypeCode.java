package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_PriceTypeCode implements Reference 
{
 	@XendraRefItem(Name="Precio Unitario (incluye el IGV)",
		Value="01",
		Description="",
		Identifier="4738b962-d0ae-4fd2-99d9-c28a0fc7507a")
	/** Precio Unitario (incluye el IGV) = 01 */
	public static final String PrecioUnitarioIncluyeElIGV = "01";
	@XendraRefItem(Name="Valor referencial unitario en operaciones no onerosas",
		Value="02",
		Description="",
		Identifier="a1a2ae7d-bcea-4ed9-adfd-97c584203e44")
	/** Valor referencial unitario en operaciones no onerosas = 02 */
	public static final String ValorReferencialUnitarioEnOperacionesNoOnerosas = "02";
	@XendraRef(Name="PriceTypeCode",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2022-05-06 17:51:52.782",
		Extension="",
		Identifier="3ebada4e-e45b-493f-a33b-d39203375707")
	public static final String Identifier = "3ebada4e-e45b-493f-a33b-d39203375707";

}
