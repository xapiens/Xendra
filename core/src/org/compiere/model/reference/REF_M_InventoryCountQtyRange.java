package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_M_InventoryCountQtyRange implements Reference 
{
 	@XendraRefItem(Name="> 0",
		Value=">",
		Description="",
		Identifier="dc11b93d-d712-6a33-5f18-6ec3a70aaa71")
	/** > 0 = > */
	public static final String Gt0 = ">";
	@XendraRefItem(Name="= 0",
		Value="=",
		Description="",
		Identifier="8d7a76aa-9499-fb8a-97a0-163b59430488")
	/** = 0 = = */
	public static final String Eq0 = "=";
	@XendraRefItem(Name="< 0",
		Value="<",
		Description="",
		Identifier="4fcc5043-2c1b-eff5-a012-b07d0946c214")
	/** < 0 = < */
	public static final String Le0 = "<";
	@XendraRefItem(Name="not 0",
		Value="N",
		Description="",
		Identifier="ad1b85c9-af20-d8e6-cb53-a5f931c91da7")
	/** not 0 = N */
	public static final String Not0 = "N";
	@XendraRef(Name="M_InventoryCount QtyRange",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="c",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-09-19 17:23:37.0",
		Extension="",
		Identifier="6b27b2a3-a0c7-b81f-3549-668cd1903bcb")
	public static final String Identifier = "6b27b2a3-a0c7-b81f-3549-668cd1903bcb";

}
