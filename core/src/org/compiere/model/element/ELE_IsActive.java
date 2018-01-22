package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_IsActive 
{
 	@XendraElement(AD_Element_ID=348,
		ColumnName="IsActive",
		EntityType="D",
		Name="Active",
		PrintName="Active",
		Description="The record is active in the system",
		Help="There are two methods of making records unavailable in the system: One is to delete the record, the other is to de-activate the record. A de-activated record is not available for selection, but available for reports. There are two reasons for de-activating and not deleting records: (1) The system requires the record for audit purposes. (2) The record is referenced by other records. E.g., you cannot delete a Business Partner, if there are invoices for this partner record existing. You de-activate the Business Partner and prevent that this record is used for future entries.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="b27a51fe-75f9-82ca-7478-6869bc604511",
		Synchronized="2012-07-11 00:00:00.0")
	public static final String Identifier = "b27a51fe-75f9-82ca-7478-6869bc604511";

}
