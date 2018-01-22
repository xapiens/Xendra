package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_UserNotificationType implements Reference 
{
 	@XendraRefItem(Name="None",
		Value="X",
		Description="",
		Identifier="754e0213-442c-45a2-949a-da8f6bfda6e6")
	/** None = X */
	public static final String None = "X";
	@XendraRefItem(Name="EMail+Notice",
		Value="B",
		Description="",
		Identifier="d029efdf-03ca-0852-988e-d638dfd67adb")
	/** EMail+Notice = B */
	public static final String EMailPlusNotice = "B";
	@XendraRefItem(Name="EMail",
		Value="E",
		Description="",
		Identifier="e318b147-009e-4d55-ef42-6b61a09c78fa")
	/** EMail = E */
	public static final String EMail = "E";
	@XendraRefItem(Name="Notice",
		Value="N",
		Description="",
		Identifier="f84c4421-06b8-491c-4153-414ef5e80db0")
	/** Notice = N */
	public static final String Notice = "N";
	@XendraRef(Name="AD_User NotificationType",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="a13bfa6b-9138-33c1-bd05-b4d49253c429")
	public static final String Identifier = "a13bfa6b-9138-33c1-bd05-b4d49253c429";

}
