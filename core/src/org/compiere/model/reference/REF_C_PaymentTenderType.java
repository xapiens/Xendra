package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_PaymentTenderType implements Reference 
{
 	@XendraRefItem(Name="Continet",
		Value="CN",
		Description="",
		Identifier="45247a06-d3cf-2dee-e3e0-40069a37fd44")
	/** Continet = CN */
	public static final String Continet = "CN";
	@XendraRefItem(Name="FEC",
		Value="FC",
		Description="",
		Identifier="07fe500c-7d73-395d-0fc7-6018abcbf75a")
	/** FEC = FC */
	public static final String FEC = "FC";
	@XendraRefItem(Name="Telecredito",
		Value="TL",
		Description="",
		Identifier="69741eaa-755f-8fe1-e673-fb7fe9a929fc")
	/** Telecredito = TL */
	public static final String Telecredito = "TL";
	@XendraRefItem(Name="Direct Debit",
		Value="D",
		Description="",
		Identifier="db78c8d4-be82-12a9-ecd2-559943ed8cd8")
	/** Direct Debit = D */
	public static final String DirectDebit = "D";
	@XendraRefItem(Name="Credit Card",
		Value="C",
		Description="",
		Identifier="2b016dd7-ae62-fdef-29b6-b79b346faef0")
	/** Credit Card = C */
	public static final String CreditCard = "C";
	@XendraRefItem(Name="Check",
		Value="K",
		Description="",
		Identifier="179b7dac-230a-caf5-5b9e-338ea45bc647")
	/** Check = K */
	public static final String Check = "K";
	@XendraRefItem(Name="Bill Of Exchange",
		Value="B",
		Description="",
		Identifier="edafbcc5-9972-67f8-6f39-4e2bc241ccad")
	/** Bill Of Exchange = B */
	public static final String BillOfExchange = "B";
	@XendraRefItem(Name="Giro",
		Value="G",
		Description="",
		Identifier="258647e3-85c7-fa9f-eaed-6c009e5760d8")
	/** Giro = G */
	public static final String Giro = "G";
	@XendraRefItem(Name="Direct Deposit",
		Value="A",
		Description="ACH Automatic Clearing House",
		Identifier="64083948-3975-ac99-323a-99e13f645da7")
	/** Direct Deposit = A */
	public static final String DirectDeposit = "A";
	@XendraRefItem(Name="Transfer",
		Value="T",
		Description="",
		Identifier="21c7fe8d-d6a9-4445-532f-a360e68d99af")
	/** Transfer = T */
	public static final String Transfer = "T";
	@XendraRef(Name="C_Payment Tender Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="Direct Debit/Deposit - Check - CC",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="99d2e48b-10ce-666f-5675-0a893b4e12aa")
	public static final String Identifier = "99d2e48b-10ce-666f-5675-0a893b4e12aa";

}
