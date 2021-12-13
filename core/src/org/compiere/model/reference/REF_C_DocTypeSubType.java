package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_DocTypeSubType implements Reference 
{
 	@XendraRefItem(Name="Purchase Standard Order",
		Value="PO",
		Description="",
		Identifier="cffcf52a-96f0-4b31-b179-1f08e5560dad")
	/** Purchase Standard Order = PO */
	public static final String PurchaseStandardOrder = "PO";
	@XendraRefItem(Name="Request",
		Value="RQ",
		Description="",
		Identifier="e4cd4c0b-6ba6-4382-8720-622054fc8ec1")
	/** Request = RQ */
	public static final String Request = "RQ";
	@XendraRefItem(Name="Proposal",
		Value="ON",
		Description="",
		Identifier="2f61f4db-02ed-4494-88df-c25780a8eabb")
	/** Proposal = ON */
	public static final String Proposal = "ON";
	@XendraRefItem(Name="Prepay Order",
		Value="PR",
		Description="",
		Identifier="3e176d71-a2b2-48af-b798-d2d52c7c1417")
	/** Prepay Order = PR */
	public static final String PrepayOrder = "PR";
	@XendraRefItem(Name="Return Material",
		Value="RM",
		Description="",
		Identifier="6bf15430-80d3-446b-b3f0-e6bd4773f654")
	/** Return Material = RM */
	public static final String ReturnMaterial = "RM";
	@XendraRefItem(Name="Standard Order",
		Value="SO",
		Description="",
		Identifier="5bebf37a-21bb-4122-8c9b-086702600b45")
	/** Standard Order = SO */
	public static final String StandardOrder = "SO";
	@XendraRefItem(Name="On Credit Order",
		Value="WI",
		Description="",
		Identifier="c53d4552-deb0-4c8e-8cfc-8868258602c6")
	/** On Credit Order = WI */
	public static final String OnCreditOrder = "WI";
	@XendraRefItem(Name="Warehouse Order",
		Value="WP",
		Description="",
		Identifier="34d1c533-29e3-4ff6-a8b1-1ef286cafc25")
	/** Warehouse Order = WP */
	public static final String WarehouseOrder = "WP";
	@XendraRefItem(Name="POS Order",
		Value="WR",
		Description="",
		Identifier="793e2eb3-af72-4cb0-b3c6-3ed541efe352")
	/** POS Order = WR */
	public static final String POSOrder = "WR";
	@XendraRefItem(Name="Quotation",
		Value="OB",
		Description="",
		Identifier="ff204dda-d566-4ae8-b3cd-9563d12b098f")
	/** Quotation = OB */
	public static final String Quotation = "OB";
	@XendraRefItem(Name="Purchase Warehouse Order",
		Value="PW",
		Description="",
		Identifier="188d6880-767f-4b01-bba2-c44ac563bee1")
	/** Purchase Warehouse Order = PW */
	public static final String PurchaseWarehouseOrder = "PW";
	@XendraRefItem(Name="Purchase POP Order",
		Value="PP",
		Description="",
		Identifier="fe7e284d-84d2-4dd2-8a79-a73b3967f1a2")
	/** Purchase POP Order = PP */
	public static final String PurchasePOPOrder = "PP";
	@XendraRef(Name="C_DocType SubType",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2018-04-07 22:39:10.777",
		Extension="",
		Identifier="510701bb-3d4a-4be3-a6ef-074558e57de9")
	public static final String Identifier = "510701bb-3d4a-4be3-a6ef-074558e57de9";

}
