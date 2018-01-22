package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_WF_InstanceState implements Reference 
{
 	@XendraRefItem(Name="Not Started",
		Value="ON",
		Description="",
		Identifier="60bbf260-8452-a236-24b1-99824c68542c")
	/** Not Started = ON */
	public static final String NotStarted = "ON";
	@XendraRefItem(Name="Running",
		Value="OR",
		Description="",
		Identifier="d15c430b-5a7d-9c4b-d389-fe253191bbd6")
	/** Running = OR */
	public static final String Running = "OR";
	@XendraRefItem(Name="Suspended",
		Value="OS",
		Description="",
		Identifier="81a28fca-1d1e-39ae-eccd-b64b685a307a")
	/** Suspended = OS */
	public static final String Suspended = "OS";
	@XendraRefItem(Name="Completed",
		Value="CC",
		Description="",
		Identifier="31d13dd5-0bde-7576-9942-2d32823ee088")
	/** Completed = CC */
	public static final String Completed = "CC";
	@XendraRefItem(Name="Aborted",
		Value="CA",
		Description="",
		Identifier="662265b9-6a65-8c3a-3b8a-01f0b9ec123f")
	/** Aborted = CA */
	public static final String Aborted = "CA";
	@XendraRefItem(Name="Terminated",
		Value="CT",
		Description="",
		Identifier="090536d5-28c2-442b-b30b-7ba080a87c38")
	/** Terminated = CT */
	public static final String Terminated = "CT";
	@XendraRef(Name="WF_Instance State",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="28a0900a-bee4-008a-c714-8d99ca7ab5d6")
	public static final String Identifier = "28a0900a-bee4-008a-c714-8d99ca7ab5d6";

}
