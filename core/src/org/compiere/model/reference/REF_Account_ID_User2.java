package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_Account_ID_User2 implements Reference 
{
 	@XendraRefTable(TableRef="C_ElementValue",
		KeyRef="C_ElementValue_ID",
		DisplayRef="Name",
		IsValueDisplayed=true,
		WhereClause="C_ElementValue.IsActive='Y' AND C_ElementValue.IsSummary='N' AND C_ElementValue.C_Element_ID IN (SELECT C_Element_ID FROM C_AcctSchema_Element ase WHERE ase.ElementType='U2' AND ase.AD_Client_ID=@AD_Client_ID@)",
		OrderByClause="C_ElementValue.Value",
		Identifier="0ee8eff5-2eaf-9f6e-228f-db870964a6d3")
	@XendraRef(Name="Account_ID - User2",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="User2 selection based on Client",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:38.0",
		Extension="",
		Identifier="6a357ab2-7bb6-fce4-ffee-8bdd855a77fc")
	public static final String Identifier = "6a357ab2-7bb6-fce4-ffee-8bdd855a77fc";

}
