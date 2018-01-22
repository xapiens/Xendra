package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_R_RequestTaskStatus implements Reference 
{
 	@XendraRefItem(Name="Finishing 90% ",
		Value="9",
		Description="",
		Identifier="7819a9ca-87c1-552c-93da-4858764a0149")
	/** Finishing 90%  = 9 */
	public static final String Finishing90 = "9";
	@XendraRefItem(Name="Almost Done 95% ",
		Value="A",
		Description="",
		Identifier="35f747fb-22f5-0dcb-50b5-e37857b2a4a2")
	/** Almost Done 95%  = A */
	public static final String AlmostDone95 = "A";
	@XendraRefItem(Name="Cleaning up 99% ",
		Value="C",
		Description="",
		Identifier="26746460-bca3-c419-181c-56409033a874")
	/** Cleaning up 99%  = C */
	public static final String CleaningUp99 = "C";
	@XendraRefItem(Name="Complete 100% ",
		Value="D",
		Description="",
		Identifier="cfe43481-f4d8-fe3e-e5a2-4884023f68d4")
	/** Complete 100%  = D */
	public static final String Complete100 = "D";
	@XendraRefItem(Name="Started 20% ",
		Value="2",
		Description="",
		Identifier="db34ffcf-8261-4331-c6a4-76ebbf6317b5")
	/** Started 20%  = 2 */
	public static final String Started20 = "2";
	@XendraRefItem(Name="Nearly Done 80% ",
		Value="8",
		Description="",
		Identifier="c4e7c53f-c36e-1902-a501-9716090af575")
	/** Nearly Done 80%  = 8 */
	public static final String NearlyDone80 = "8";
	@XendraRefItem(Name="Busy 40% ",
		Value="4",
		Description="",
		Identifier="4381f12c-9309-1a26-7665-073754ffff8b")
	/** Busy 40%  = 4 */
	public static final String Busy40 = "4";
	@XendraRefItem(Name="Good Progress 60% ",
		Value="6",
		Description="",
		Identifier="edd0541c-9834-8eef-b1e2-2c916713782e")
	/** Good Progress 60%  = 6 */
	public static final String GoodProgress60 = "6";
	@XendraRefItem(Name="Not Started  0% ",
		Value="0",
		Description="",
		Identifier="6bd914fd-c8f4-6ef1-0bf6-23971af7544f")
	/** Not Started  0%  = 0 */
	public static final String NotStarted0 = "0";
	@XendraRef(Name="R_Request TaskStatus",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="875ad37f-8aa2-3b76-2edb-0a9cd76b3ee7")
	public static final String Identifier = "875ad37f-8aa2-3b76-2edb-0a9cd76b3ee7";

}
