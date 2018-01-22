package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_IsDependentEntities 
{
 	@XendraElement(AD_Element_ID=2226,
		ColumnName="IsDependentEntities",
		EntityType="D",
		Name="Dependent Entities",
		PrintName="Dependent Entities",
		Description="Also check access in dependent entities",
		Help="Also dependent entities are included.  Please be aware, that enabling this rule has severe consequences and that this is only wanted in some circumstances. <p>Example Rule: 'Include Payment Term Immediate with Dependent Entities' <br>Primary effect: users with this role can only select the payment term Immediate <br>Secondary effect (dependent entities): users with this role can see only invoices/orders with the payment term immediate.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="f7e27218-5f81-f6b9-02fa-ebcb1a9a0b99",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "f7e27218-5f81-f6b9-02fa-ebcb1a9a0b99";

}
