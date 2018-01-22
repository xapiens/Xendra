package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_AcctSchemaCostingMethod implements Reference 
{
 	@XendraRefItem(Name="Last PO Price",
		Value="p",
		Description="",
		Identifier="f556e299-20e5-0a67-80c0-7eb4e663e21f")
	/** Last PO Price = p */
	public static final String LastPOPrice = "p";
	@XendraRefItem(Name="_",
		Value="x",
		Description="",
		Identifier="ef15998b-1525-8721-4b53-acadde3d9a14")
	/** _ = x */
	public static final String _ = "x";
	@XendraRefItem(Name="Standard Costing",
		Value="S",
		Description="Standard Purchase Order Price Costing",
		Identifier="6a1d3a0d-6b00-7c69-7369-ab11d840297e")
	/** Standard Costing = S */
	public static final String StandardCosting = "S";
	@XendraRefItem(Name="Average PO",
		Value="A",
		Description="Weighted Average Purchase Order Price Costing",
		Identifier="2645de6e-a79b-8e6f-ed7b-726a021aa3dc")
	/** Average PO = A */
	public static final String AveragePO = "A";
	@XendraRefItem(Name="Lifo",
		Value="L",
		Description="Last In First Out Costing",
		Identifier="a376d621-ba2b-fb6d-2118-e862d5079b5d")
	/** Lifo = L */
	public static final String Lifo = "L";
	@XendraRefItem(Name="Fifo",
		Value="F",
		Description="First In First Out Costing",
		Identifier="6b209297-6c06-4f58-33ab-f8880063a395")
	/** Fifo = F */
	public static final String Fifo = "F";
	@XendraRefItem(Name="Average Invoice",
		Value="I",
		Description="Weighted Average Purchase Invoice Price Costing",
		Identifier="e11d4173-cf7e-22d0-b939-ac50aac4c0a4")
	/** Average Invoice = I */
	public static final String AverageInvoice = "I";
	@XendraRefItem(Name="Average Warehouse",
		Value="W",
		Description="",
		Identifier="409df98c-4729-b384-28cb-6dcc8e3a163d")
	/** Average Warehouse = W */
	public static final String AverageWarehouse = "W";
	@XendraRefItem(Name="Last Invoice",
		Value="i",
		Description="",
		Identifier="226bec99-8d04-d356-f045-e0b917506c36")
	/** Last Invoice = i */
	public static final String LastInvoice = "i";
	@XendraRefItem(Name="User Defined",
		Value="U",
		Description="",
		Identifier="1801ace9-7890-4c75-51ef-a961596d5594")
	/** User Defined = U */
	public static final String UserDefined = "U";
	@XendraRef(Name="C_AcctSchema Costing Method",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="Costing Method list",
		Help="",
		VFormat="L",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="f784bd15-8b38-c388-3a0e-a0ae23b717ec")
	public static final String Identifier = "f784bd15-8b38-c388-3a0e-a0ae23b717ec";

}
