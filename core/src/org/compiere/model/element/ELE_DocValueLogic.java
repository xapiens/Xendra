package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_DocValueLogic 
{
 	@XendraElement(AD_Element_ID=2624,
		ColumnName="DocValueLogic",
		EntityType="D",
		Name="Document Value Logic",
		PrintName="Doc Value Logic",
		Description="Logic to determine Workflow Start - If true, a workflow process is started for the document",
		Help="You can enter simple logic using variables like @Created@=@Updated@, which fires, when a record is CREATED. If you need to evaluate also values of other records, you need to use SQL logic and need to prefix this logic with 'SQL='. Example: start a Order verify workflow, when a business partner ordered something and is over the credit limit  'SQL=EXISTS (SELECT * FROM C_BPartner bp WHERE C_Order. C_BPartner_ID=bp. C_BPartner_ID AND SO_CreditUsed > SO_CreditLimit)'. Note that the SQL based logic checks for duplicate workflows (i.e. a workflow is started only once per record).",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="43cc4b5b-9f46-f674-ad0d-64b58c7142b9",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "43cc4b5b-9f46-f674-ad0d-64b58c7142b9";

}
