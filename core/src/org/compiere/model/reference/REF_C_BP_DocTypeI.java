package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_BP_DocTypeI implements Reference 
{
 	@XendraRefItem(Name="Other",
		Value="O",
		Description="Other",
		Identifier="46e81bb6-721c-16ff-4038-2856a93e7f9e")
	/** Other = O */
	public static final String Other = "O";
	@XendraRefItem(Name="DNI",
		Value="D",
		Description="DNI",
		Identifier="a27e4374-bb57-4fed-24bf-c79b53b70e98")
	/** DNI = D */
	public static final String DNI = "D";
	@XendraRefItem(Name="RUC",
		Value="R",
		Description="RUC",
		Identifier="dad4d7fe-0aee-59e5-541a-85e80b483bf6")
	/** RUC = R */
	public static final String RUC = "R";
	@XendraRefItem(Name="Passpport",
		Value="P",
		Description="Passpport",
		Identifier="4300abe2-f5c6-d578-51fc-04a7541a7b4a")
	/** Passpport = P */
	public static final String Passpport = "P";
	@XendraRefItem(Name="Foreigner Card",
		Value="C",
		Description="Foreigner Card",
		Identifier="225f141c-395c-9b0c-38d0-6da425ea48e9")
	/** Foreigner Card = C */
	public static final String ForeignerCard = "C";
	@XendraRef(Name="C_BP_DocTypeI",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="C_BP_DocTypeI",
		Help="",
		VFormat="L",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="246094aa-4294-0df2-51fe-48832dd65b30")
	public static final String Identifier = "246094aa-4294-0df2-51fe-48832dd65b30";

}
