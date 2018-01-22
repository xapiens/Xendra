package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_BPartnerSOCreditStatus implements Reference 
{
 	@XendraRefItem(Name="Credit Stop",
		Value="S",
		Description="",
		Identifier="13404520-4ea0-d644-0367-c4ec5e0eb43e")
	/** Credit Stop = S */
	public static final String CreditStop = "S";
	@XendraRefItem(Name="Credit Hold",
		Value="H",
		Description="",
		Identifier="df0c9dfe-6bf4-1f36-0aa8-9bb5d19b3516")
	/** Credit Hold = H */
	public static final String CreditHold = "H";
	@XendraRefItem(Name="Credit Watch",
		Value="W",
		Description="",
		Identifier="e9921472-5e59-799c-75e6-756131b0e8de")
	/** Credit Watch = W */
	public static final String CreditWatch = "W";
	@XendraRefItem(Name="No Credit Check",
		Value="X",
		Description="",
		Identifier="d32eed81-507b-d037-ded7-6e8e51929c40")
	/** No Credit Check = X */
	public static final String NoCreditCheck = "X";
	@XendraRefItem(Name="Credit OK",
		Value="O",
		Description="",
		Identifier="161259a4-081c-2456-de53-0719773be0df")
	/** Credit OK = O */
	public static final String CreditOK = "O";
	@XendraRef(Name="C_BPartner SOCreditStatus",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="Sales Credit Status",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="d6307b6f-ebd6-62fd-2ef2-8694e0e218ed")
	public static final String Identifier = "d6307b6f-ebd6-62fd-2ef2-8694e0e218ed";

}
