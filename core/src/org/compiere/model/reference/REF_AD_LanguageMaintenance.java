package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_LanguageMaintenance implements Reference 
{
 	@XendraRefItem(Name="Delete Translation",
		Value="D",
		Description="",
		Identifier="0ea77610-22d1-4b7d-6e88-9333ab6b42ff")
	/** Delete Translation = D */
	public static final String DeleteTranslation = "D";
	@XendraRefItem(Name="Add Missing Translations",
		Value="A",
		Description="",
		Identifier="355ae53a-1564-8b4d-4956-b2e89a61ad19")
	/** Add Missing Translations = A */
	public static final String AddMissingTranslations = "A";
	@XendraRefItem(Name="Re-Create Translation",
		Value="R",
		Description="",
		Identifier="e08a8369-099d-cfda-509a-367f699a2467")
	/** Re-Create Translation = R */
	public static final String Re_CreateTranslation = "R";
	@XendraRef(Name="AD_Language Maintenance",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-09-19 17:23:37.0",
		Extension="",
		Identifier="112a604a-41d4-9518-9fa8-5e321b96e56e")
	public static final String Identifier = "112a604a-41d4-9518-9fa8-5e321b96e56e";

}
