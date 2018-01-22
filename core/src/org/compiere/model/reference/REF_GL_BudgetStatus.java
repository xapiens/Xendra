package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_GL_BudgetStatus implements Reference 
{
 	@XendraRefItem(Name="Approved",
		Value="A",
		Description="",
		Identifier="8622b382-8d14-f736-06c5-ce3b9e59739f")
	/** Approved = A */
	public static final String Approved = "A";
	@XendraRefItem(Name="Draft",
		Value="D",
		Description="",
		Identifier="94c8c6df-2aa2-58e1-f9ab-f9c815b883f3")
	/** Draft = D */
	public static final String Draft = "D";
	@XendraRef(Name="GL_Budget Status",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="L",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="fcd2e472-c052-bde9-c921-dffd438016ae")
	public static final String Identifier = "fcd2e472-c052-bde9-c921-dffd438016ae";

}
