package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_ClientShareType implements Reference 
{
 	@XendraRefItem(Name="Client (all shared)",
		Value="C",
		Description="",
		Identifier="79831ce2-60b5-7ec1-24d3-a95a83354f21")
	/** Client (all shared) = C */
	public static final String ClientAllShared = "C";
	@XendraRefItem(Name="Org (not shared)",
		Value="O",
		Description="",
		Identifier="f059c691-2f2b-f0d3-47ea-5356f57014d4")
	/** Org (not shared) = O */
	public static final String OrgNotShared = "O";
	@XendraRefItem(Name="Client or Org",
		Value="x",
		Description="",
		Identifier="c29cbc16-170d-568f-92d6-da9648f90874")
	/** Client or Org = x */
	public static final String ClientOrOrg = "x";
	@XendraRef(Name="AD_Client ShareType",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="f965e06c-e1db-ec23-d09c-48c45b6df874")
	public static final String Identifier = "f965e06c-e1db-ec23-d09c-48c45b6df874";

}
