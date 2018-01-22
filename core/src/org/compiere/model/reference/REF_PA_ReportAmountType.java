package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_PA_ReportAmountType implements Reference 
{
 	@XendraRefItem(Name="Year Credit Only",
		Value="CY",
		Description="",
		Identifier="622f8c78-d1f4-ffbb-8092-d79cba304077")
	/** Year Credit Only = CY */
	public static final String YearCreditOnly = "CY";
	@XendraRefItem(Name="Year Debit Only",
		Value="DY",
		Description="",
		Identifier="90cf5c9f-a705-ea6f-547b-146dba354355")
	/** Year Debit Only = DY */
	public static final String YearDebitOnly = "DY";
	@XendraRefItem(Name="Year Quantity",
		Value="QY",
		Description="",
		Identifier="3ee50d45-e156-336e-34c6-08fd1a37efd9")
	/** Year Quantity = QY */
	public static final String YearQuantity = "QY";
	@XendraRefItem(Name="Total Credit Only",
		Value="CT",
		Description="",
		Identifier="939b8a32-4624-b34f-b9f5-df555adcd241")
	/** Total Credit Only = CT */
	public static final String TotalCreditOnly = "CT";
	@XendraRefItem(Name="Total Quantity",
		Value="QT",
		Description="",
		Identifier="3474da65-2409-dfa0-362e-d20f0d6d5e95")
	/** Total Quantity = QT */
	public static final String TotalQuantity = "QT";
	@XendraRefItem(Name="Year Balance",
		Value="BY",
		Description="",
		Identifier="e007d4fc-ce0f-1aae-7227-336bfbff19cd")
	/** Year Balance = BY */
	public static final String YearBalance = "BY";
	@XendraRefItem(Name="Total Debit Only",
		Value="DT",
		Description="",
		Identifier="b5dbfead-2ab8-159a-ed9f-f74705486ed3")
	/** Total Debit Only = DT */
	public static final String TotalDebitOnly = "DT";
	@XendraRefItem(Name="Total Balance",
		Value="BT",
		Description="",
		Identifier="e006ef33-d3c7-3e94-0565-b4aadb8d3eee")
	/** Total Balance = BT */
	public static final String TotalBalance = "BT";
	@XendraRefItem(Name="Period Balance",
		Value="BP",
		Description="",
		Identifier="1b0e1697-4a07-1040-6716-c695d4765f4f")
	/** Period Balance = BP */
	public static final String PeriodBalance = "BP";
	@XendraRefItem(Name="Period Credit Only",
		Value="CP",
		Description="",
		Identifier="c9604b1b-a675-2cd1-9d53-6187e415eb59")
	/** Period Credit Only = CP */
	public static final String PeriodCreditOnly = "CP";
	@XendraRefItem(Name="Period Debit Only",
		Value="DP",
		Description="",
		Identifier="d12b506e-1e51-b09a-6fbd-ede400974568")
	/** Period Debit Only = DP */
	public static final String PeriodDebitOnly = "DP";
	@XendraRefItem(Name="Period Quantity",
		Value="QP",
		Description="",
		Identifier="a2b82d8a-e0d5-7535-8b61-b84c9efd5ce5")
	/** Period Quantity = QP */
	public static final String PeriodQuantity = "QP";
	@XendraRef(Name="PA_Report AmountType",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="e5a03701-e090-7320-b87f-ac3b41e9f09d")
	public static final String Identifier = "e5a03701-e090-7320-b87f-ac3b41e9f09d";

}
