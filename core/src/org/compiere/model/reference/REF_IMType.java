package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_IMType implements Reference 
{
 	@XendraRefItem(Name="GMail",
		Value="6",
		Description="",
		Identifier="54075ee2-a67e-46c3-8f8c-c185641abf77")
	/** GMail = 6 */
	public static final String GMail = "6";
	@XendraRefItem(Name="Facebook",
		Value="5",
		Description="",
		Identifier="55b0704a-cf86-4ce4-9975-985c5b8b97c2")
	/** Facebook = 5 */
	public static final String Facebook = "5";
	@XendraRefItem(Name="ICQ",
		Value="4",
		Description="",
		Identifier="df51e5c0-cc38-4a31-85f1-e897ebfb819d")
	/** ICQ = 4 */
	public static final String ICQ = "4";
	@XendraRefItem(Name="MSN",
		Value="3",
		Description="",
		Identifier="162a8b4d-1318-41cd-870f-a7e72cf0e692")
	/** MSN = 3 */
	public static final String MSN = "3";
	@XendraRefItem(Name="Yahoo",
		Value="2",
		Description="",
		Identifier="f94cb6a4-bce4-4e1b-95d6-5f51b9ed1b2d")
	/** Yahoo = 2 */
	public static final String Yahoo = "2";
	@XendraRefItem(Name="AIM",
		Value="1",
		Description="",
		Identifier="e532ba5b-6b0a-4c5a-9ba6-7ea9acd60e41")
	/** AIM = 1 */
	public static final String AIM = "1";
	@XendraRefItem(Name="Jabber",
		Value="0",
		Description="",
		Identifier="704818d7-0ca1-4664-af26-546abcf5c3dd")
	/** Jabber = 0 */
	public static final String Jabber = "0";
	@XendraRef(Name="IMType",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2014-05-14 08:11:31.0",
		Extension="",
		Identifier="3459f1ff-f65a-459e-8205-eec5017a1804")
	public static final String Identifier = "3459f1ff-f65a-459e-8205-eec5017a1804";

}
