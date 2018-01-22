package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_GL_BudgetControlScope implements Reference 
{
 	@XendraRefItem(Name="Period only",
		Value="P",
		Description="",
		Identifier="6bbf3c21-eddd-ce6f-752b-ef411459ed15")
	/** Period only = P */
	public static final String PeriodOnly = "P";
	@XendraRefItem(Name="Year To Date",
		Value="Y",
		Description="",
		Identifier="c78bc4ff-5b13-2c0a-53a9-be6e50397b47")
	/** Year To Date = Y */
	public static final String YearToDate = "Y";
	@XendraRefItem(Name="Total",
		Value="T",
		Description="",
		Identifier="2b44cf96-2ff5-123b-90b6-cb6ae2ec7940")
	/** Total = T */
	public static final String Total = "T";
	@XendraRef(Name="GL_BudgetControl Scope",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="70095159-aa49-0401-11b4-8c6892a946b0")
	public static final String Identifier = "70095159-aa49-0401-11b4-8c6892a946b0";

}
