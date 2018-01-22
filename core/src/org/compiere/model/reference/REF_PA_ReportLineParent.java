package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_PA_ReportLineParent implements Reference 
{
 	@XendraRefTable(TableRef="PA_ReportLine",
		KeyRef="PA_ReportLine_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="PA_ReportLine.IsSummary='Y' ",
		OrderByClause="",
		Identifier="b525a8bc-c388-4ec2-924e-2dec44ee27dd")
	@XendraRef(Name="PA_ReportLine Parent",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="19157db7-5bbc-4a54-cbf2-7d1dea3ffe70")
	public static final String Identifier = "19157db7-5bbc-4a54-cbf2-7d1dea3ffe70";

}
