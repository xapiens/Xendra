package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_BPartnerBPBankAcctUse implements Reference 
{
 	@XendraRefItem(Name="None",
		Value="N",
		Description="",
		Identifier="126477ab-b1f6-2d51-07dd-32a9f82efcfc")
	/** None = N */
	public static final String None = "N";
	@XendraRefItem(Name="Both",
		Value="B",
		Description="",
		Identifier="eb3ec3fa-9b3f-575c-0109-b08fdca4a2f5")
	/** Both = B */
	public static final String Both = "B";
	@XendraRefItem(Name="Direct Debit",
		Value="D",
		Description="",
		Identifier="3e926072-6080-312c-5038-91bc3b0482a0")
	/** Direct Debit = D */
	public static final String DirectDebit = "D";
	@XendraRefItem(Name="Direct Deposit",
		Value="T",
		Description="",
		Identifier="f950de49-473f-58b8-d033-51206281dbac")
	/** Direct Deposit = T */
	public static final String DirectDeposit = "T";
	@XendraRef(Name="C_BPartner BPBankAcctUse",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="afc90cd3-db9c-e55c-36e0-3e3943e38a03")
	public static final String Identifier = "afc90cd3-db9c-e55c-36e0-3e3943e38a03";

}
