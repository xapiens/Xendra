package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_SequenceForDocuments implements Reference 
{
 	@XendraRefTable(TableRef="AD_Sequence",
		KeyRef="AD_Sequence_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="AD_Sequence.IsTableID='N'",
		OrderByClause="AD_Sequence.Name",
		Identifier="84618f19-76c9-8e6c-5836-9a2ab6eb5d72")
	@XendraRef(Name="AD_Sequence for Documents",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Sequence for Document selection",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:38.0",
		Extension="",
		Identifier="4aa462a2-7603-59ba-08c7-4982c43f3ad7")
	public static final String Identifier = "4aa462a2-7603-59ba-08c7-4982c43f3ad7";

}
