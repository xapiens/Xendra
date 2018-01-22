package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_CalendarType implements Reference 
{
 	@XendraRefItem(Name="Event",
		Value="EV",
		Description="",
		Identifier="895581c0-da9f-4c36-b43f-235f63e6b3c2")
	/** Event = EV */
	public static final String Event = "EV";
	@XendraRefItem(Name="FreeBusy",
		Value="FB",
		Description="",
		Identifier="0f148a45-cbec-4546-b32f-8788176044be")
	/** FreeBusy = FB */
	public static final String FreeBusy = "FB";
	@XendraRefItem(Name="Journal",
		Value="JN",
		Description="",
		Identifier="009b29f3-e84b-4e00-ad48-b2b8afcbdad8")
	/** Journal = JN */
	public static final String Journal = "JN";
	@XendraRefItem(Name="Todo",
		Value="TD",
		Description="",
		Identifier="b729aba1-73c6-4aa2-bf9d-2ad603eabf02")
	/** Todo = TD */
	public static final String Todo = "TD";
	@XendraRefItem(Name="Timezone",
		Value="TZ",
		Description="",
		Identifier="d6df1056-4059-417e-b69b-ae9acc8e2897")
	/** Timezone = TZ */
	public static final String Timezone = "TZ";
	@XendraRef(Name="Calendar Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2017-09-13 12:03:43.003",
		Extension="",
		Identifier="710925ba-3a28-4c2a-b444-af8a8a22f060")
	public static final String Identifier = "710925ba-3a28-4c2a-b444-af8a8a22f060";

}
