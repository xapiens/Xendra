package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_Rule_RuleType implements Reference 
{
 	@XendraRefItem(Name="Aspect Orient Program",
		Value="A",
		Description="",
		Identifier="d08e227e-a371-4eaf-b8e5-84b986e54167")
	/** Aspect Orient Program = A */
	public static final String AspectOrientProgram = "A";
	@XendraRefItem(Name="SQL",
		Value="Q",
		Description="",
		Identifier="d020362e-6919-4a93-a988-ab3cd28b5407")
	/** SQL = Q */
	public static final String SQL = "Q";
	@XendraRefItem(Name="JSR 223 Scripting APIs",
		Value="S",
		Description="",
		Identifier="f77b47ae-7d4f-4eac-80c2-05d9256720ba")
	/** JSR 223 Scripting APIs = S */
	public static final String JSR223ScriptingAPIs = "S";
	@XendraRefItem(Name="JSR 94 Rule Engine API",
		Value="R",
		Description="",
		Identifier="58744291-d133-4821-a5bc-2efe23842e89")
	/** JSR 94 Rule Engine API = R */
	public static final String JSR94RuleEngineAPI = "R";
	@XendraRef(Name="AD_Rule_RuleType",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2015-07-16 06:55:59.0",
		Extension="",
		Identifier="97ad0981-d7c4-46bd-a1bf-6c157795dcee")
	public static final String Identifier = "97ad0981-d7c4-46bd-a1bf-6c157795dcee";

}
