package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_SubjectType implements Reference 
{
 	@XendraRefItem(Name="Balance General",
		Value="BAGN",
		Description="",
		Identifier="f97c40c9-c2a1-87dc-7d1d-c5337dc0fa31")
	/** Balance General = BAGN */
	public static final String BalanceGeneral = "BAGN";
	@XendraRefItem(Name="Estado de GG y PP por Funcion",
		Value="EGPF",
		Description="",
		Identifier="7c57ff90-bcfe-0824-a03e-107c854f0a9c")
	/** Estado de GG y PP por Funcion = EGPF */
	public static final String EstadoDeGGYPPPorFuncion = "EGPF";
	@XendraRefItem(Name="Estado de GG y PP por Naturaleza",
		Value="EGPN",
		Description="",
		Identifier="5c82d684-fbd3-4d22-1fbf-14a85eddd563")
	/** Estado de GG y PP por Naturaleza = EGPN */
	public static final String EstadoDeGGYPPPorNaturaleza = "EGPN";
	@XendraRef(Name="C_Subject Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="LLLL",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="ed2d8373-0238-6bf7-3099-d07f2f93bfb3")
	public static final String Identifier = "ed2d8373-0238-6bf7-3099-d07f2f93bfb3";

}
