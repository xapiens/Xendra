package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_X12DE98EntityIdentifierCode implements Reference 
{
 	@XendraRefItem(Name="Regional Office",
		Value="12",
		Description="",
		Identifier="316392ab-68da-4861-aafc-840874635239")
	/** Regional Office = 12 */
	public static final String RegionalOffice = "12";
	@XendraRefItem(Name="Accounts Payable Office",
		Value="15",
		Description="",
		Identifier="27814519-d731-4005-b672-9d10b74f5e66")
	/** Accounts Payable Office = 15 */
	public static final String AccountsPayableOffice = "15";
	@XendraRefItem(Name="Small Business",
		Value="21",
		Description="",
		Identifier="5c03c75f-a6e9-4365-81b5-be36b8aa88a9")
	/** Small Business = 21 */
	public static final String SmallBusiness = "21";
	@XendraRefItem(Name="Minority-Owned Small Business",
		Value="22",
		Description="",
		Identifier="aa088f6b-de40-4466-8251-329d940e44ae")
	/** Minority-Owned Small Business = 22 */
	public static final String Minority_OwnedSmallBusiness = "22";
	@XendraRefItem(Name="Woman-Owned Small Business",
		Value="24",
		Description="",
		Identifier="70f68785-90be-4bd6-b569-3ce2649a662d")
	/** Woman-Owned Small Business = 24 */
	public static final String Woman_OwnedSmallBusiness = "24";
	@XendraRefItem(Name="Woman-Owned Business",
		Value="25",
		Description="",
		Identifier="c00921c5-859e-4a97-a20f-97c250ae52f5")
	/** Woman-Owned Business = 25 */
	public static final String Woman_OwnedBusiness = "25";
	@XendraRefItem(Name="Subcontractor",
		Value="28",
		Description="",
		Identifier="51d0c69b-3dbd-4557-a4b3-a1cf331360ef")
	/** Subcontractor = 28 */
	public static final String Subcontractor = "28";
	@XendraRefItem(Name="Partnership",
		Value="2K",
		Description="",
		Identifier="c3f5dd14-281a-41e6-99c4-5e226ca4568c")
	/** Partnership = 2K */
	public static final String Partnership = "2K";
	@XendraRefItem(Name="Corporation",
		Value="2L",
		Description="",
		Identifier="adfa43da-3b4e-47ec-b8d0-46b8f6f2a5e0")
	/** Corporation = 2L */
	public static final String Corporation = "2L";
	@XendraRefItem(Name="Drop-off Location",
		Value="45",
		Description="",
		Identifier="3d751dde-447a-42cd-9e02-19ed13338485")
	/** Drop-off Location = 45 */
	public static final String Drop_OffLocation = "45";
	@XendraRefItem(Name="Plant",
		Value="16",
		Description="",
		Identifier="c5297d81-639d-4ebe-a089-80bb896cb26f")
	/** Plant = 16 */
	public static final String Plant = "16";
	@XendraRefItem(Name="Minority-Owned Business",
		Value="23",
		Description="",
		Identifier="d757b728-ee8b-41d0-ad36-ea19e8b4dce8")
	/** Minority-Owned Business = 23 */
	public static final String Minority_OwnedBusiness = "23";
	@XendraRefItem(Name="Individual",
		Value="2J",
		Description="",
		Identifier="fd5dcb89-b9b5-4d19-949a-5b186f6daa78")
	/** Individual = 2J */
	public static final String Individual = "2J";
	@XendraRef(Name="X12DE98 Entity Identifier Code",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="X12DE98 Entity Identifier Code list",
		Help="Identify organizational entity physical location property or individual list",
		VFormat="AA",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2015-07-16 06:55:59.0",
		Extension="",
		Identifier="ca7fec93-d3df-4088-b628-4cc8b6586728")
	public static final String Identifier = "ca7fec93-d3df-4088-b628-4cc8b6586728";

}
