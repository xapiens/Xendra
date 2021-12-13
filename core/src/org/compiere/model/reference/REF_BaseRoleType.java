package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_BaseRoleType implements Reference 
{
 	@XendraRefItem(Name="All",
		Value="ALL",
		Description="",
		Identifier="fde7e0dd-5756-4673-9497-b35bdcf38e03")
	/** All = ALL */
	public static final String All = "ALL";
	@XendraRefItem(Name="Account",
		Value="ACT",
		Description="",
		Identifier="927cd268-c179-4ec5-b042-fc0c69e7c893")
	/** Account = ACT */
	public static final String Account = "ACT";
	@XendraRefItem(Name="Sales",
		Value="SLS",
		Description="",
		Identifier="4936caeb-b535-48c4-ba53-5f0291dce21a")
	/** Sales = SLS */
	public static final String Sales = "SLS";
	@XendraRefItem(Name="Manager",
		Value="MGR",
		Description="",
		Identifier="bd74f0a2-448c-49cb-b669-7e24b82f2190")
	/** Manager = MGR */
	public static final String Manager = "MGR";
	@XendraRefItem(Name="Financial",
		Value="FIN",
		Description="",
		Identifier="337130ea-eda7-4683-bfa9-50020f888973")
	/** Financial = FIN */
	public static final String Financial = "FIN";
	@XendraRefItem(Name="System",
		Value="SYS",
		Description="",
		Identifier="7cff9bd0-4dc6-4f00-b114-79fed23a73e8")
	/** System = SYS */
	public static final String System = "SYS";
	@XendraRefItem(Name="Management",
		Value="MGN",
		Description="",
		Identifier="d9e16783-65cd-434e-8d2a-a6a7dcc7a059")
	/** Management = MGN */
	public static final String Management = "MGN";
	@XendraRefItem(Name="Logistics",
		Value="LOG",
		Description="",
		Identifier="170c012b-d4c8-491f-be6b-2416d28b229e")
	/** Logistics = LOG */
	public static final String Logistics = "LOG";
	@XendraRef(Name="Base Role Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2019-04-01 09:39:18.684",
		Extension="",
		Identifier="fc2ae4f4-a201-4dfd-834b-949971e56775")
	public static final String Identifier = "fc2ae4f4-a201-4dfd-834b-949971e56775";

}
