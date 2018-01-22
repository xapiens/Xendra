package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_MenuAction implements Reference 
{
 	@XendraRefItem(Name="Process",
		Value="P",
		Description="",
		Identifier="fc85ff53-2970-efc3-7494-e82746e26314")
	/** Process = P */
	public static final String Process = "P";
	@XendraRefItem(Name="Workbench",
		Value="B",
		Description="",
		Identifier="75ace2af-53fb-7883-460f-5f15da61f873")
	/** Workbench = B */
	public static final String Workbench = "B";
	@XendraRefItem(Name="Window",
		Value="W",
		Description="",
		Identifier="db7f9a00-d389-5de2-6d34-9f48b3b9371e")
	/** Window = W */
	public static final String Window = "W";
	@XendraRefItem(Name="Task",
		Value="T",
		Description="",
		Identifier="f35dac24-1b43-f494-1f0c-be61a62f083f")
	/** Task = T */
	public static final String Task = "T";
	@XendraRefItem(Name="Form",
		Value="X",
		Description="Special Forms",
		Identifier="4dfe5f2e-02cc-c16e-7246-4c377efb17d1")
	/** Form = X */
	public static final String Form = "X";
	@XendraRefItem(Name="Report",
		Value="R",
		Description="",
		Identifier="209d614e-cb64-9947-ddc4-b195a6432346")
	/** Report = R */
	public static final String Report = "R";
	@XendraRefItem(Name="WorkFlow",
		Value="F",
		Description="",
		Identifier="dddf308b-3c1e-e032-c097-aee694dd5b93")
	/** WorkFlow = F */
	public static final String WorkFlow = "F";
	@XendraRef(Name="AD_Menu Action",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="Menu Action list",
		Help="",
		VFormat="L",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="e7221c7b-2e98-09e1-fdde-58d677721189")
	public static final String Identifier = "e7221c7b-2e98-09e1-fdde-58d677721189";

}
