package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_M_TransactionMovementType implements Reference 
{
 	@XendraRefItem(Name="Work Order +",
		Value="W+",
		Description="",
		Identifier="6d53de1a-0c92-528f-7a8d-2530a1aa5dbb")
	/** Work Order + = W+ */
	public static final String WorkOrderPlus = "W+";
	@XendraRefItem(Name="Work Order -",
		Value="W-",
		Description="",
		Identifier="69488894-a834-4f16-c4e8-edacc353c059")
	/** Work Order - = W- */
	public static final String WorkOrder_ = "W-";
	@XendraRefItem(Name="Production +",
		Value="P+",
		Description="",
		Identifier="fb25b6af-2b5f-f215-7b7f-4fd4bd008ffe")
	/** Production + = P+ */
	public static final String ProductionPlus = "P+";
	@XendraRefItem(Name="Inventory In",
		Value="I+",
		Description="",
		Identifier="4958fb9c-6e37-1efe-3b1e-cecacec6e592")
	/** Inventory In = I+ */
	public static final String InventoryIn = "I+";
	@XendraRefItem(Name="Vendor Returns",
		Value="R-",
		Description="",
		Identifier="9e46e482-22fb-f0b9-b29a-a4976126cae6")
	/** Vendor Returns = R- */
	public static final String VendorReturns = "R-";
	@XendraRefItem(Name="Movement From",
		Value="M-",
		Description="",
		Identifier="92a90e4d-059b-5976-2ade-2141d6373336")
	/** Movement From = M- */
	public static final String MovementFrom = "M-";
	@XendraRefItem(Name="Production -",
		Value="P-",
		Description="",
		Identifier="8c76b577-8bfc-42f7-365c-f29a00d4e81a")
	/** Production - = P- */
	public static final String Production_ = "P-";
	@XendraRefItem(Name="Customer Shipment",
		Value="C-",
		Description="",
		Identifier="885b327e-7033-e952-aeeb-363aca74823e")
	/** Customer Shipment = C- */
	public static final String CustomerShipment = "C-";
	@XendraRefItem(Name="Vendor Receipts",
		Value="V+",
		Description="",
		Identifier="3a07a451-31b7-5fed-702c-dece745e4ceb")
	/** Vendor Receipts = V+ */
	public static final String VendorReceipts = "V+";
	@XendraRefItem(Name="Inventory Out",
		Value="I-",
		Description="",
		Identifier="3f51a93c-82ec-81c7-08f6-a9be52e1507e")
	/** Inventory Out = I- */
	public static final String InventoryOut = "I-";
	@XendraRefItem(Name="Movement To",
		Value="M+",
		Description="",
		Identifier="a8ed41fe-780a-41ff-b26c-6d4362eee859")
	/** Movement To = M+ */
	public static final String MovementTo = "M+";
	@XendraRefItem(Name="Customer Returns",
		Value="R+",
		Description="",
		Identifier="82302734-8c46-4da8-c4b0-6b7e131ba33b")
	/** Customer Returns = R+ */
	public static final String CustomerReturns = "R+";
	@XendraRefItem(Name="Not Apply",
		Value="NA",
		Description="",
		Identifier="91b78182-f401-4ed9-ae1f-22df63525dbc")
	/** Not Apply = NA */
	public static final String NotApply = "NA";
	@XendraRef(Name="M_Transaction Movement Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat=" ",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2015-10-03 08:57:57.691",
		Extension="",
		Identifier="0455b4db-004d-594c-a505-3e493bfda9ad")
	public static final String Identifier = "0455b4db-004d-594c-a505-3e493bfda9ad";

}
