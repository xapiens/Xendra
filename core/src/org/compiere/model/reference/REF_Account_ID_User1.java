package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_Account_ID_User1 implements Reference 
{
 	@XendraRefTable(TableRef="C_ElementValue",
		KeyRef="C_ElementValue_ID",
		DisplayRef="Name",
		IsValueDisplayed=true,
		WhereClause="C_ElementValue.IsActive='Y' AND C_ElementValue.IsSummary='N' AND C_ElementValue.C_Element_ID IN (SELECT C_Element_ID FROM C_AcctSchema_Element ase WHERE ase.ElementType='U1' AND ase.AD_Client_ID=@AD_Client_ID@)",
		OrderByClause="C_ElementValue.Value",
		Identifier="286d4f0d-6f4b-c170-f2c3-af817f39beb7")
	@XendraRef(Name="Account_ID - User1",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="User1 selection based on Client",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:38.0",
		Extension="",
		Identifier="5a2fe161-044f-67cb-3791-6d615980cabb")
	public static final String Identifier = "5a2fe161-044f-67cb-3791-6d615980cabb";

}
