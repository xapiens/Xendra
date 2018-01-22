package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_WF_Action implements Reference 
{
 	@XendraRefItem(Name="Document Action",
		Value="D",
		Description="",
		Identifier="1da39384-27df-2ce6-bc86-8dba16151c4a")
	/** Document Action = D */
	public static final String DocumentAction = "D";
	@XendraRefItem(Name="EMail",
		Value="M",
		Description="",
		Identifier="017b6eeb-7a62-9f30-04db-96ca41d78906")
	/** EMail = M */
	public static final String EMail = "M";
	@XendraRefItem(Name="Sub Workflow",
		Value="F",
		Description="",
		Identifier="e0383444-4daa-de62-11d4-477bea8e3994")
	/** Sub Workflow = F */
	public static final String SubWorkflow = "F";
	@XendraRefItem(Name="Set Variable",
		Value="V",
		Description="",
		Identifier="2d4d4e0b-8077-6b00-7372-ab443cf5e2ac")
	/** Set Variable = V */
	public static final String SetVariable = "V";
	@XendraRefItem(Name="User Window",
		Value="W",
		Description="",
		Identifier="d4e44a4e-223e-40b1-e871-04b3fc7a0160")
	/** User Window = W */
	public static final String UserWindow = "W";
	@XendraRefItem(Name="User Form",
		Value="X",
		Description="",
		Identifier="1200d68c-b429-7fcf-e91e-f3a557b722ea")
	/** User Form = X */
	public static final String UserForm = "X";
	@XendraRefItem(Name="Apps Task",
		Value="T",
		Description="",
		Identifier="7280810b-e91e-d5fc-1df8-ac63c2fa5078")
	/** Apps Task = T */
	public static final String AppsTask = "T";
	@XendraRefItem(Name="Apps Report",
		Value="R",
		Description="",
		Identifier="7282e4cf-bab4-c8af-64d4-8b8a57e5a51e")
	/** Apps Report = R */
	public static final String AppsReport = "R";
	@XendraRefItem(Name="Apps Process",
		Value="P",
		Description="",
		Identifier="63ae8b37-fd40-4f00-d655-5e528c363139")
	/** Apps Process = P */
	public static final String AppsProcess = "P";
	@XendraRefItem(Name="User Workbench",
		Value="B",
		Description="",
		Identifier="8dcebe6d-dcaa-7480-04e9-b98c078bac88")
	/** User Workbench = B */
	public static final String UserWorkbench = "B";
	@XendraRefItem(Name="Wait (Sleep)",
		Value="Z",
		Description="",
		Identifier="0829d06e-78d1-698d-c404-c6522c1e330f")
	/** Wait (Sleep) = Z */
	public static final String WaitSleep = "Z";
	@XendraRefItem(Name="User Choice",
		Value="C",
		Description="",
		Identifier="82a8fd40-6ce7-7b76-785e-f92978bad6d9")
	/** User Choice = C */
	public static final String UserChoice = "C";
	@XendraRef(Name="WF_Action",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="Superset of Menu Action",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="2b6d8133-4f63-4c86-1344-020528d8e0ef")
	public static final String Identifier = "2b6d8133-4f63-4c86-1344-020528d8e0ef";

}
