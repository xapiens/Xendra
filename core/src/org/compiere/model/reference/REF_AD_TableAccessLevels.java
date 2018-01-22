package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_TableAccessLevels implements Reference 
{
 	@XendraRefItem(Name="System+Client",
		Value="6",
		Description="",
		Identifier="00d88249-0088-71b1-bec1-94015edda8db")
	/** System+Client = 6 */
	public static final String SystemPlusClient = "6";
	@XendraRefItem(Name="Client only",
		Value="2",
		Description="",
		Identifier="eef226c6-53c2-55b8-ed33-483ea12503ac")
	/** Client only = 2 */
	public static final String ClientOnly = "2";
	@XendraRefItem(Name="Organization",
		Value="1",
		Description="",
		Identifier="e8b916cd-7d47-a58e-cfdb-c8a96e2dcc11")
	/** Organization = 1 */
	public static final String Organization = "1";
	@XendraRefItem(Name="Client+Organization",
		Value="3",
		Description="",
		Identifier="e7fb2e4a-1c7c-b7bf-bcd9-8a291fe6c545")
	/** Client+Organization = 3 */
	public static final String ClientPlusOrganization = "3";
	@XendraRefItem(Name="System only",
		Value="4",
		Description="",
		Identifier="6983ecc0-8f98-1631-2701-e61765f5da6d")
	/** System only = 4 */
	public static final String SystemOnly = "4";
	@XendraRefItem(Name="All",
		Value="7",
		Description="",
		Identifier="e3e62d83-20a1-b69c-aeda-e5a45a15926f")
	/** All = 7 */
	public static final String All = "7";
	@XendraRef(Name="AD_Table Access Levels",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="Table Access and Sharing Level list",
		Help="",
		VFormat="0",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="5684046b-00f0-a17c-843e-efad2b0e42f3")
	public static final String Identifier = "5684046b-00f0-a17c-843e-efad2b0e42f3";

}
