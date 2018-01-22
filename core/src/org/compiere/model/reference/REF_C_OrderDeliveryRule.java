package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_OrderDeliveryRule implements Reference 
{
 	@XendraRefItem(Name="Availability",
		Value="A",
		Description="As soon as an item becomes available",
		Identifier="292a7a36-7e32-be5c-fd74-02d11b03a63c")
	/** Availability = A */
	public static final String Availability = "A";
	@XendraRefItem(Name="Manual",
		Value="M",
		Description="",
		Identifier="1d782f4f-0136-35bb-f45a-d874f1c62bbf")
	/** Manual = M */
	public static final String Manual = "M";
	@XendraRefItem(Name="Complete Order",
		Value="O",
		Description="As soon as all items of an order are available",
		Identifier="d0af2d11-5411-1d58-d8bc-f9e52df43859")
	/** Complete Order = O */
	public static final String CompleteOrder = "O";
	@XendraRefItem(Name="Complete Line",
		Value="L",
		Description="As soon as all items of a line become available",
		Identifier="966d5cd8-ebde-c76c-4715-05b6a9bc8520")
	/** Complete Line = L */
	public static final String CompleteLine = "L";
	@XendraRefItem(Name="After Receipt",
		Value="R",
		Description="After receipt of cash",
		Identifier="c5697dbc-3497-9b5f-bc09-f20b8bf9463d")
	/** After Receipt = R */
	public static final String AfterReceipt = "R";
	@XendraRefItem(Name="Force",
		Value="F",
		Description="",
		Identifier="b188d142-929c-ff40-8ff8-417032f1b261")
	/** Force = F */
	public static final String Force = "F";
	@XendraRef(Name="C_Order DeliveryRule",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="Delivery Rules list",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="dd6ca989-f822-5b38-ea47-5420e7ccb16b")
	public static final String Identifier = "dd6ca989-f822-5b38-ea47-5420e7ccb16b";

}
