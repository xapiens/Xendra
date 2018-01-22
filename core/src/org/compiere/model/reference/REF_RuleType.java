package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_RuleType implements Reference 
{
 	@XendraRefItem(Name="SQL",
		Value="Q",
		Description="",
		Identifier="d2604da9-b413-4683-b2ac-95357aca2548")
	/** SQL = Q */
	public static final String SQL = "Q";
	@XendraRefItem(Name="AspectOrientProgram",
		Value="O",
		Description="",
		Identifier="ba1d18f8-18e5-4e6a-bb7a-5c5e7947bf8a")
	/** AspectOrientProgram = O */
	public static final String AspectOrientProgram = "O";
	@XendraRefItem(Name="JSR94RuleEngineAPI",
		Value="R",
		Description="",
		Identifier="db87413d-414d-403d-884c-33fce756dce7")
	/** JSR94RuleEngineAPI = R */
	public static final String JSR94RuleEngineAPI = "R";
	@XendraRefItem(Name="JSR223ScriptingAPIs",
		Value="S",
		Description="",
		Identifier="c7e95430-1926-410b-a813-762c1d6e3483")
	/** JSR223ScriptingAPIs = S */
	public static final String JSR223ScriptingAPIs = "S";
	@XendraRefItem(Name="Listener",
		Value="L",
		Description="",
		Identifier="2b56e28f-8135-4202-a5ce-ec41dde08d21")
	/** Listener = L */
	public static final String Listener = "L";
	@XendraRefItem(Name="Acceptor",
		Value="A",
		Description="",
		Identifier="abdc0c96-df94-4566-b618-e198d7a198f1")
	/** Acceptor = A */
	public static final String Acceptor = "A";
	@XendraRef(Name="Rule Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2015-05-31 05:46:18.0",
		Extension="",
		Identifier="c30f8c29-bd66-4674-9c29-dd0e2bb96611")
	public static final String Identifier = "c30f8c29-bd66-4674-9c29-dd0e2bb96611";

}
