package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_CostUpdateSource implements Reference 
{
 	@XendraRefItem(Name="FiFo",
		Value="F",
		Description="",
		Identifier="1f8e9489-d2f3-963f-f1d5-373e0c1344f1")
	/** FiFo = F */
	public static final String FiFo = "F";
	@XendraRefItem(Name="LiFo",
		Value="L",
		Description="",
		Identifier="98fdf967-aa1c-0807-605c-bbdf9901353e")
	/** LiFo = L */
	public static final String LiFo = "L";
	@XendraRefItem(Name="Old Standard Cost",
		Value="x",
		Description="",
		Identifier="c11da9a3-e7b2-6578-195e-509abd80bd47")
	/** Old Standard Cost = x */
	public static final String OldStandardCost = "x";
	@XendraRefItem(Name="Last PO Price",
		Value="p",
		Description="",
		Identifier="7c3e2f7e-244a-0c7f-2cdf-9b0d1812f3dc")
	/** Last PO Price = p */
	public static final String LastPOPrice = "p";
	@XendraRefItem(Name="Price List (Limit)",
		Value="LL",
		Description="",
		Identifier="3c344b40-1bb0-a327-0850-4f40bc9ec077")
	/** Price List (Limit) = LL */
	public static final String PriceListLimit = "LL";
	@XendraRefItem(Name="Average PO History",
		Value="DP",
		Description="",
		Identifier="e02c6640-5e41-15da-664e-c3d7f24e86f1")
	/** Average PO History = DP */
	public static final String AveragePOHistory = "DP";
	@XendraRefItem(Name="Average Invoice",
		Value="I",
		Description="",
		Identifier="140fb1f6-30a5-76fc-7fee-e89e485a0c42")
	/** Average Invoice = I */
	public static final String AverageInvoice = "I";
	@XendraRefItem(Name="Future Standard Cost",
		Value="f",
		Description="",
		Identifier="980f5643-0588-c712-98ad-a32e847ecc60")
	/** Future Standard Cost = f */
	public static final String FutureStandardCost = "f";
	@XendraRefItem(Name="Standard Cost",
		Value="S",
		Description="",
		Identifier="9ccf7854-058a-323d-e1b0-aa08e8c89d56")
	/** Standard Cost = S */
	public static final String StandardCost = "S";
	@XendraRefItem(Name="Average PO",
		Value="A",
		Description="",
		Identifier="254d1e01-2f8b-1459-ab6c-ea0fbff6f267")
	/** Average PO = A */
	public static final String AveragePO = "A";
	@XendraRefItem(Name="Last Invoice Price",
		Value="i",
		Description="",
		Identifier="1bbff4bc-c8df-9720-7582-7427b379a8f1")
	/** Last Invoice Price = i */
	public static final String LastInvoicePrice = "i";
	@XendraRefItem(Name="Average Invoice History",
		Value="DI",
		Description="",
		Identifier="7e850b43-ba36-e0b6-2469-ac5dec8bd659")
	/** Average Invoice History = DI */
	public static final String AverageInvoiceHistory = "DI";
	@XendraRef(Name="CostUpdate Source",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-09-19 17:23:37.0",
		Extension="",
		Identifier="41beb209-76b7-f532-e984-0d9cf797e982")
	public static final String Identifier = "41beb209-76b7-f532-e984-0d9cf797e982";

}
