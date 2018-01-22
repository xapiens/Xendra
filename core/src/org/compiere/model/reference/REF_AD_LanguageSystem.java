package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_LanguageSystem implements Reference 
{
 	@XendraRefTable(TableRef="AD_Language",
		KeyRef="AD_Language",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="(AD_Language.IsSystemLanguage='Y' OR AD_Language.IsBaseLanguage='Y')",
		OrderByClause="",
		Identifier="e259e3f2-17e9-b063-ad74-36c38cab1b9c")
	@XendraRef(Name="AD_Language System",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Language selection",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:39.0",
		Extension="",
		Identifier="205708de-88ce-3bee-b5b6-bf6fdc34a384")
	public static final String Identifier = "205708de-88ce-3bee-b5b6-bf6fdc34a384";

}
