package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_ColorStartPoint implements Reference 
{
 	@XendraRefItem(Name="North",
		Value="1",
		Description="",
		Identifier="f05fe629-846c-485d-e130-b1fbbc3ad124")
	/** North = 1 */
	public static final String North = "1";
	@XendraRefItem(Name="North East",
		Value="2",
		Description="",
		Identifier="70297ace-3972-3019-49ac-b5df641e6098")
	/** North East = 2 */
	public static final String NorthEast = "2";
	@XendraRefItem(Name="East",
		Value="3",
		Description="",
		Identifier="2831baac-76ef-e0fe-1844-3f3007376800")
	/** East = 3 */
	public static final String East = "3";
	@XendraRefItem(Name="South East",
		Value="4",
		Description="",
		Identifier="f3c35935-70e2-5345-f6a2-2da106b07d1b")
	/** South East = 4 */
	public static final String SouthEast = "4";
	@XendraRefItem(Name="South",
		Value="5",
		Description="",
		Identifier="49b64278-017b-b09f-f97b-eae70fe29a45")
	/** South = 5 */
	public static final String South = "5";
	@XendraRefItem(Name="South West",
		Value="6",
		Description="",
		Identifier="898bcfe3-1e28-fd2a-3c7b-dc50c64cece9")
	/** South West = 6 */
	public static final String SouthWest = "6";
	@XendraRefItem(Name="West",
		Value="7",
		Description="",
		Identifier="5e34dbd3-5ebd-9ff1-4ac5-c0310007206d")
	/** West = 7 */
	public static final String West = "7";
	@XendraRefItem(Name="North West",
		Value="8",
		Description="",
		Identifier="c505f4d8-e225-4830-d2fa-3b449d5f2a42")
	/** North West = 8 */
	public static final String NorthWest = "8";
	@XendraRef(Name="AD_Color StartPoint",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="Nord-West-..",
		Help="",
		VFormat="0",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="fba5f216-7aa4-6367-907f-17a70d83f455")
	public static final String Identifier = "fba5f216-7aa4-6367-907f-17a70d83f455";

}
