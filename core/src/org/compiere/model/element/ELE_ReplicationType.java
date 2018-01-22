package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_ReplicationType 
{
 	@XendraElement(AD_Element_ID=2137,
		ColumnName="ReplicationType",
		EntityType="D",
		Name="Replication Type",
		PrintName="Replication Type",
		Description="Type of Data Replication",
		Help="The Type of data Replication determines the directon of the data replication.  <br> Reference means that the data in this system is read only -> <br> Local means that the data in this system is not replicated to other systems - <br> Merge means that the data in this system is synchronized with the other system <-> <br>",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="fab2f42c-8051-1227-bbbd-e69e4837f172",
		Synchronized="2012-07-11 00:00:00.0")
	public static final String Identifier = "fab2f42c-8051-1227-bbbd-e69e4837f172";

}
