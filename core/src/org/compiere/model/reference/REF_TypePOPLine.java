package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_TypePOPLine implements Reference 
{
// 	@XendraRefItem(Name="Both",
//		Value="B",
//		Description="Ira en punto de compra y actualizacion de precios",
//		Identifier="dc142289-5e5a-0046-3aa1-8bbaf5653c13")
//	/** Both = B */
//	public static final String Both = "B";
	@XendraRefItem(Name="Others",
		Value="O",
		Description="Ira a la vista Otros",
		Identifier="9955f841-8177-aff3-e640-19b3433c45e6")
	/** Others = O */
	public static final String Others = "O";
	@XendraRefItem(Name="PointOfPurchase",
		Value="P",
		Description="El POPLine definido ira  a la primera vista",
		Identifier="ea51a2f2-545c-e849-10d0-9f422e04a5c5")
	/** PointOfPurchase = P */
	public static final String PointOfPurchase = "P";
	@XendraRefItem(Name="UpdatePrice",
		Value="U",
		Description="Ira a la vista actualizacion de precios",
		Identifier="907d4ae0-3635-7f94-ea1a-4c7db2b57d2c")
	/** UpdatePrice = U */
	public static final String UpdatePrice = "U";
	@XendraRef(Name="TypePOPLine",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="0cb23f5b-8205-3d4b-f168-2a135e888ca4")
	public static final String Identifier = "0cb23f5b-8205-3d4b-f168-2a135e888ca4";

}
