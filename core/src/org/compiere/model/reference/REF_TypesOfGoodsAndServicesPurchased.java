package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_TypesOfGoodsAndServicesPurchased implements Reference 
{
 	@XendraRefItem(Name="GOODS , RAW MATERIALS , SUPPLIES ,",
		Value="1",
		Description="",
		Identifier="fcd20536-49ec-4554-8cb0-98a0f4cffa60")
	/** GOODS , RAW MATERIALS , SUPPLIES , = 1 */
	public static final String GOODSRAWMATERIALSSUPPLIES = "1";
	@XendraRefItem(Name="FIXED ASSETS",
		Value="2",
		Description="",
		Identifier="7bf3891e-f330-4deb-a156-f1e88d02e245")
	/** FIXED ASSETS = 2 */
	public static final String FIXEDASSETS = "2";
	@XendraRefItem(Name="OTHER ASSETS HELD IN NO 1 AND 2",
		Value="3",
		Description="",
		Identifier="fde08bd3-92a6-48ef-877a-68213defd951")
	/** OTHER ASSETS HELD IN NO 1 AND 2 = 3 */
	public static final String OTHERASSETSHELDINNO1AND2 = "3";
	@XendraRefItem(Name="EXPENSES education, recreation, health, cultural . REPRESENT",
		Value="4",
		Description="",
		Identifier="10745e14-a861-411d-926c-83e1b870a302")
	/** EXPENSES education, recreation, health, cultural . REPRESENT = 4 */
	public static final String EXPENSESEducationRecreationHealthCulturalREPRESENT = "4";
	@XendraRefItem(Name="OTHER EXPENSES NOT INCLUDED in paragraph 4",
		Value="5",
		Description="",
		Identifier="c06ab08b-d70c-48a3-a6d2-b89e74e74334")
	/** OTHER EXPENSES NOT INCLUDED in paragraph 4 = 5 */
	public static final String OTHEREXPENSESNOTINCLUDEDInParagraph4 = "5";
	@XendraRef(Name="TypesOfGoodsAndServicesPurchased",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2016-12-06 15:14:17.096",
		Extension="",
		Identifier="684506f6-a7aa-49ad-852c-8e6c59f303f6")
	public static final String Identifier = "684506f6-a7aa-49ad-852c-8e6c59f303f6";

}
