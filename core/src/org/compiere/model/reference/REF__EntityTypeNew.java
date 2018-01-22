package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF__EntityTypeNew implements Reference 
{
 	@XendraRefTable(TableRef="AD_EntityType",
		KeyRef="EntityType",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="",
		Identifier="c724be01-0227-ad0d-cc5f-4dcbca9aea0b")
	@XendraRef(Name="_EntityTypeNew",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:39.0",
		Extension="",
		Identifier="fae4ad31-8ff1-5d5c-8d47-2426c541cd74")
	public static final String Identifier = "fae4ad31-8ff1-5d5c-8d47-2426c541cd74";

}
