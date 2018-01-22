package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_PriorityNo 
{
 	@XendraElement(AD_Element_ID=1145,
		ColumnName="PriorityNo",
		EntityType="D",
		Name="Relative Priority",
		PrintName="Relative Priority",
		Description="Where inventory should be picked from first",
		Help="The Relative Priority indicates the location to pick from first if an product is stored in more than one location.  (100 = highest priority, 0 = lowest).  For outgoing shipments, the location is picked with the highest priority where the entire quantity can be shipped from.  If there is no location, the location with the highest priority is used. The Priority is ignored for products with Guarantee Date (always the oldest first) or if a speific instance is selected. Incoming receipts are stored at the location with the hoghest priority, if not explicitly selected.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="46b02cc0-8cc4-1c26-6b1e-a4fe0a6a4b7f",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "46b02cc0-8cc4-1c26-6b1e-a4fe0a6a4b7f";

}
