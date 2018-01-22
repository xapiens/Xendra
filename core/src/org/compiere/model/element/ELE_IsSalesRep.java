package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_IsSalesRep 
{
 	@XendraElement(AD_Element_ID=409,
		ColumnName="IsSalesRep",
		EntityType="D",
		Name="Sales Representative",
		PrintName="Sales Rep",
		Description="Indicates if  the business partner is a sales representative or company agent",
		Help="The Sales Rep checkbox indicates if this business partner is a sales representative. A sales representative may also be an emplyee, but does not need to be.",
		PO_Name="Company Agent",
		PO_PrintName="Company Agent",
		PO_Description="Business Partner responsible for documents",
		PO_Help="The Sales Rep checkbox indicates if this business partner is a company agent. A company agent may also be an emplyee, but does not need to be.",
		Identifier="52b2b164-2824-17c4-3796-8ea71ec9f27c",
		Synchronized="2012-07-11 00:00:00.0")
	public static final String Identifier = "52b2b164-2824-17c4-3796-8ea71ec9f27c";

}
