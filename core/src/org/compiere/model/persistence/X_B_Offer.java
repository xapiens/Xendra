/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                          *
 * Copyright (C) 1999-2007 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software. you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY  without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.compiere.model.persistence;

/** Generated Model - DO NOT CHANGE */
import org.compiere.model.*;
import java.util.*;
import java.sql.*;
import java.math.*;
import org.xendra.annotations.*;
import org.compiere.util.*;
/** Generated Model for B_Offer
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_B_Offer extends PO
{
/** Standard Constructor
@param ctx context
@param B_Offer_ID id
@param trxName transaction
*/
public X_B_Offer (Properties ctx, int B_Offer_ID, String trxName)
{
super (ctx, B_Offer_ID, trxName);
/** if (B_Offer_ID == 0)
{
setAD_User_ID (0);
setB_Offer_ID (0);
setB_SellerFunds_ID (0);
setB_Topic_ID (0);
setIsWillingToCommit (false);	
// N
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_B_Offer (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=682 */
public static int Table_ID=MTable.getTable_ID("B_Offer");

@XendraTrl(Identifier="c88ef836-f846-0a40-b8c9-0fd2460b1577")
public static String es_PE_TAB_Offer_Description="Oferta para un asunto";

@XendraTrl(Identifier="c88ef836-f846-0a40-b8c9-0fd2460b1577")
public static String es_PE_TAB_Offer_Name="Oferta";

@XendraTrl(Identifier="c88ef836-f846-0a40-b8c9-0fd2460b1577")
public static String es_PE_TAB_Offer_Help="Usted puede crear una oferta para un asunto.";

@XendraTab(Name="Offer",Description="Offer for a Topic",
Help="You can create an offer for a topic.",AD_Window_ID="45a49f39-e720-7227-5a91-7c0178b269a7",
SeqNo=30,TabLevel=1,IsSingleRow=false,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="e0ba2600-9144-19ba-9f02-f32c46decaaa",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="c88ef836-f846-0a40-b8c9-0fd2460b1577",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Offer="c88ef836-f846-0a40-b8c9-0fd2460b1577";

@XendraTrl(Identifier="841da36d-d784-b382-649e-8a7404d31516")
public static String es_PE_TAB_Offer2_Description="Oferta para un asunto";

@XendraTrl(Identifier="841da36d-d784-b382-649e-8a7404d31516")
public static String es_PE_TAB_Offer2_Name="Oferta";

@XendraTrl(Identifier="841da36d-d784-b382-649e-8a7404d31516")
public static String es_PE_TAB_Offer2_Help="Usted puede crear una oferta para un asunto";

@XendraTab(Name="Offer",Description="Offer for a Topic",
Help="You can create an offer for a topic.",AD_Window_ID="b526b654-eee4-ce2f-a903-14ef1f1b7296",
SeqNo=40,TabLevel=1,IsSingleRow=false,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,
AD_Column_ID="7b975d18-86ec-efe8-ec82-47bb8f18c0ca",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="841da36d-d784-b382-649e-8a7404d31516",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Offer2="841da36d-d784-b382-649e-8a7404d31516";

@XendraTrl(Identifier="9e79e70d-aae1-f299-0603-142d7eb61f32")
public static String es_PE_TABLE_B_Offer_Name="Propuesta";

@XendraTable(Name="Offer",Description="Offer for a Topic",Help="",TableName="B_Offer",
AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,
IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,PO_Window_ID="",
ID="org.xendra.bids",Identifier="9e79e70d-aae1-f299-0603-142d7eb61f32",
Synchronized="2017-08-16 11:41:16.0")
/** TableName=B_Offer */
public static final String Table_Name="B_Offer";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"B_Offer");

protected BigDecimal accessLevel = BigDecimal.valueOf(3);
/** AccessLevel
@return 3 - Client - Org 
*/
protected int get_AccessLevel()
{
return accessLevel.intValue();
}
/** Load Meta Data
@param ctx context
@return PO Info
*/
protected POInfo initPO (Properties ctx)
{
  if (Table_ID == 0)
    Table_ID = MTable.getTable_ID("B_Offer");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_B_Offer[").append(get_ID()).append("]");
return sb.toString();
}
/** Set User/Contact.
@param AD_User_ID User within the system - Internal or Business Partner Contact */
public void setAD_User_ID (int AD_User_ID)
{
if (AD_User_ID < 1) throw new IllegalArgumentException ("AD_User_ID is mandatory.");
set_Value (COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
}
/** Get User/Contact.
@return User within the system - Internal or Business Partner Contact */
public int getAD_User_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="10dae63e-3517-c76f-a087-f4744435a917")
public static String es_PE_FIELD_Offer_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="10dae63e-3517-c76f-a087-f4744435a917")
public static String es_PE_FIELD_Offer_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraTrl(Identifier="10dae63e-3517-c76f-a087-f4744435a917")
public static String es_PE_FIELD_Offer_UserContact_Name="Usuario";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="841da36d-d784-b382-649e-8a7404d31516",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="10dae63e-3517-c76f-a087-f4744435a917")
public static final String FIELDNAME_Offer_UserContact="10dae63e-3517-c76f-a087-f4744435a917";

@XendraTrl(Identifier="756f1876-a1cd-e95f-354e-231c44b2198b")
public static String es_PE_FIELD_Offer_UserContact2_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="756f1876-a1cd-e95f-354e-231c44b2198b")
public static String es_PE_FIELD_Offer_UserContact2_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraTrl(Identifier="756f1876-a1cd-e95f-354e-231c44b2198b")
public static String es_PE_FIELD_Offer_UserContact2_Name="Usuario";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c88ef836-f846-0a40-b8c9-0fd2460b1577",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="756f1876-a1cd-e95f-354e-231c44b2198b")
public static final String FIELDNAME_Offer_UserContact2="756f1876-a1cd-e95f-354e-231c44b2198b";

@XendraTrl(Identifier="e0ba2600-9144-19ba-9f02-f32c46decaaa")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e0ba2600-9144-19ba-9f02-f32c46decaaa",
Synchronized="2017-08-05 16:53:06.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
/** Set Offer.
@param B_Offer_ID Offer for a Topic */
public void setB_Offer_ID (int B_Offer_ID)
{
if (B_Offer_ID < 1) throw new IllegalArgumentException ("B_Offer_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_B_Offer_ID, Integer.valueOf(B_Offer_ID));
}
/** Get Offer.
@return Offer for a Topic */
public int getB_Offer_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_B_Offer_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="16c3a637-4713-ab76-a479-5fb640b5eebd")
public static String es_PE_FIELD_Offer_Offer_Description="Propuesta para un asunto";

@XendraTrl(Identifier="16c3a637-4713-ab76-a479-5fb640b5eebd")
public static String es_PE_FIELD_Offer_Offer_Help="Usted puede crear una propuesta para un asunto.";

@XendraTrl(Identifier="16c3a637-4713-ab76-a479-5fb640b5eebd")
public static String es_PE_FIELD_Offer_Offer_Name="Propuesta";

@XendraField(AD_Column_ID="B_Offer_ID",IsCentrallyMaintained=true,
AD_Tab_ID="841da36d-d784-b382-649e-8a7404d31516",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="16c3a637-4713-ab76-a479-5fb640b5eebd")
public static final String FIELDNAME_Offer_Offer="16c3a637-4713-ab76-a479-5fb640b5eebd";

@XendraTrl(Identifier="b92ada8b-c58b-03d8-24bc-ea5027678f45")
public static String es_PE_FIELD_Offer_Offer2_Description="Propuesta para un asunto";

@XendraTrl(Identifier="b92ada8b-c58b-03d8-24bc-ea5027678f45")
public static String es_PE_FIELD_Offer_Offer2_Help="Usted puede crear una propuesta para un asunto.";

@XendraTrl(Identifier="b92ada8b-c58b-03d8-24bc-ea5027678f45")
public static String es_PE_FIELD_Offer_Offer2_Name="Propuesta";

@XendraField(AD_Column_ID="B_Offer_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c88ef836-f846-0a40-b8c9-0fd2460b1577",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b92ada8b-c58b-03d8-24bc-ea5027678f45")
public static final String FIELDNAME_Offer_Offer2="b92ada8b-c58b-03d8-24bc-ea5027678f45";
/** Column name B_Offer_ID */
public static final String COLUMNNAME_B_Offer_ID = "B_Offer_ID";
/** Set Seller Funds.
@param B_SellerFunds_ID Seller Funds from Offers on Topics */
public void setB_SellerFunds_ID (int B_SellerFunds_ID)
{
if (B_SellerFunds_ID < 1) throw new IllegalArgumentException ("B_SellerFunds_ID is mandatory.");
set_Value (COLUMNNAME_B_SellerFunds_ID, Integer.valueOf(B_SellerFunds_ID));
}
/** Get Seller Funds.
@return Seller Funds from Offers on Topics */
public int getB_SellerFunds_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_B_SellerFunds_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b9f156d3-6d66-44f6-3bb2-890547cee4da")
public static String es_PE_FIELD_Offer_SellerFunds_Description="Fondos del vendedor en asuntos de ofertas.";

@XendraTrl(Identifier="b9f156d3-6d66-44f6-3bb2-890547cee4da")
public static String es_PE_FIELD_Offer_SellerFunds_Help="Fondos disponibles (para los pagos) y fondos destinados de ofertas.";

@XendraTrl(Identifier="b9f156d3-6d66-44f6-3bb2-890547cee4da")
public static String es_PE_FIELD_Offer_SellerFunds_Name="Fondos del Vendedor";

@XendraField(AD_Column_ID="B_SellerFunds_ID",IsCentrallyMaintained=true,
AD_Tab_ID="841da36d-d784-b382-649e-8a7404d31516",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b9f156d3-6d66-44f6-3bb2-890547cee4da")
public static final String FIELDNAME_Offer_SellerFunds="b9f156d3-6d66-44f6-3bb2-890547cee4da";

@XendraTrl(Identifier="3c3644d8-e73f-027f-639c-92dd167d5b9b")
public static String es_PE_FIELD_Offer_SellerFunds2_Description="Fondos del vendedor en asuntos de ofertas.";

@XendraTrl(Identifier="3c3644d8-e73f-027f-639c-92dd167d5b9b")
public static String es_PE_FIELD_Offer_SellerFunds2_Help="Fondos disponibles (para los pagos) y fondos destinados de ofertas.";

@XendraTrl(Identifier="3c3644d8-e73f-027f-639c-92dd167d5b9b")
public static String es_PE_FIELD_Offer_SellerFunds2_Name="Fondos del Vendedor";

@XendraField(AD_Column_ID="B_SellerFunds_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c88ef836-f846-0a40-b8c9-0fd2460b1577",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3c3644d8-e73f-027f-639c-92dd167d5b9b")
public static final String FIELDNAME_Offer_SellerFunds2="3c3644d8-e73f-027f-639c-92dd167d5b9b";

@XendraTrl(Identifier="97735084-38e4-eb31-9080-38d5ce1eb957")
public static String es_PE_COLUMN_B_SellerFunds_ID_Name="Fondos del Vendedor";

@XendraColumn(AD_Element_ID="5ff1b501-4c86-cd3e-47f7-99c0706600c8",ColumnName="B_SellerFunds_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="97735084-38e4-eb31-9080-38d5ce1eb957",
Synchronized="2017-08-05 16:53:06.0")
/** Column name B_SellerFunds_ID */
public static final String COLUMNNAME_B_SellerFunds_ID = "B_SellerFunds_ID";
/** Set Topic.
@param B_Topic_ID Auction Topic */
public void setB_Topic_ID (int B_Topic_ID)
{
if (B_Topic_ID < 1) throw new IllegalArgumentException ("B_Topic_ID is mandatory.");
set_Value (COLUMNNAME_B_Topic_ID, Integer.valueOf(B_Topic_ID));
}
/** Get Topic.
@return Auction Topic */
public int getB_Topic_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_B_Topic_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2cfe7a6d-5494-3e56-b6c7-da61e7763ee6")
public static String es_PE_FIELD_Offer_Topic_Description="Asunto de la subasta.";

@XendraTrl(Identifier="2cfe7a6d-5494-3e56-b6c7-da61e7763ee6")
public static String es_PE_FIELD_Offer_Topic_Help="Decripción del articulo a vender ó a crear.";

@XendraTrl(Identifier="2cfe7a6d-5494-3e56-b6c7-da61e7763ee6")
public static String es_PE_FIELD_Offer_Topic_Name="Asunto";
@XendraField(AD_Column_ID="B_Topic_ID",
IsCentrallyMaintained=true,AD_Tab_ID="841da36d-d784-b382-649e-8a7404d31516",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="2cfe7a6d-5494-3e56-b6c7-da61e7763ee6")
public static final String FIELDNAME_Offer_Topic="2cfe7a6d-5494-3e56-b6c7-da61e7763ee6";

@XendraTrl(Identifier="c8f9dc9f-e376-a6c6-9916-d04f297ecbf1")
public static String es_PE_FIELD_Offer_Topic2_Description="Asunto de la subasta.";

@XendraTrl(Identifier="c8f9dc9f-e376-a6c6-9916-d04f297ecbf1")
public static String es_PE_FIELD_Offer_Topic2_Help="Decripción del articulo a vender ó a crear.";

@XendraTrl(Identifier="c8f9dc9f-e376-a6c6-9916-d04f297ecbf1")
public static String es_PE_FIELD_Offer_Topic2_Name="Asunto";
@XendraField(AD_Column_ID="B_Topic_ID",
IsCentrallyMaintained=true,AD_Tab_ID="c88ef836-f846-0a40-b8c9-0fd2460b1577",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="c8f9dc9f-e376-a6c6-9916-d04f297ecbf1")
public static final String FIELDNAME_Offer_Topic2="c8f9dc9f-e376-a6c6-9916-d04f297ecbf1";

@XendraTrl(Identifier="7b975d18-86ec-efe8-ec82-47bb8f18c0ca")
public static String es_PE_COLUMN_B_Topic_ID_Name="Asunto";

@XendraColumn(AD_Element_ID="769c2ab0-c0fe-bf49-cdc1-b072c5e6fdb8",ColumnName="B_Topic_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7b975d18-86ec-efe8-ec82-47bb8f18c0ca",
Synchronized="2017-08-05 16:53:06.0")
/** Column name B_Topic_ID */
public static final String COLUMNNAME_B_Topic_ID = "B_Topic_ID";
/** Set Identifier.
@param Identifier Identifier */
public void setIdentifier (String Identifier)
{
if (Identifier != null && Identifier.length() > 36)
{
log.warning("Length > 36 - truncated");
Identifier = Identifier.substring(0,35);
}
set_Value (COLUMNNAME_Identifier, Identifier);
}
/** Get Identifier.
@return Identifier */
public String getIdentifier() 
{
String value = (String)get_Value(COLUMNNAME_Identifier);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="f1c09d4c-f2a6-4bee-90f6-bdb5dbbdd60f")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f1c09d4c-f2a6-4bee-90f6-bdb5dbbdd60f",
Synchronized="2017-08-05 16:53:06.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Willing to commit.
@param IsWillingToCommit Willing to commit */
public void setIsWillingToCommit (boolean IsWillingToCommit)
{
set_Value (COLUMNNAME_IsWillingToCommit, Boolean.valueOf(IsWillingToCommit));
}
/** Get Willing to commit.
@return Willing to commit */
public boolean isWillingToCommit() 
{
Object oo = get_Value(COLUMNNAME_IsWillingToCommit);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="29ba8417-3629-1ae3-c8e5-ccc79bb267e6")
public static String es_PE_FIELD_Offer_WillingToCommit_Name="Querer Confiar";

@XendraField(AD_Column_ID="IsWillingToCommit",IsCentrallyMaintained=true,
AD_Tab_ID="841da36d-d784-b382-649e-8a7404d31516",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="29ba8417-3629-1ae3-c8e5-ccc79bb267e6")
public static final String FIELDNAME_Offer_WillingToCommit="29ba8417-3629-1ae3-c8e5-ccc79bb267e6";

@XendraTrl(Identifier="d53c8b1b-80b1-3351-5133-5aee265a5b7e")
public static String es_PE_FIELD_Offer_WillingToCommit2_Name="Querer Confiar";

@XendraField(AD_Column_ID="IsWillingToCommit",IsCentrallyMaintained=true,
AD_Tab_ID="c88ef836-f846-0a40-b8c9-0fd2460b1577",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d53c8b1b-80b1-3351-5133-5aee265a5b7e")
public static final String FIELDNAME_Offer_WillingToCommit2="d53c8b1b-80b1-3351-5133-5aee265a5b7e";

@XendraTrl(Identifier="342bb0a1-298e-2eca-23f1-e24c499335fa")
public static String es_PE_COLUMN_IsWillingToCommit_Name="Querer Confiar";

@XendraColumn(AD_Element_ID="65e86b0b-d236-52e8-ca90-6498b1662b41",ColumnName="IsWillingToCommit",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="342bb0a1-298e-2eca-23f1-e24c499335fa",
Synchronized="2017-08-05 16:53:06.0")
/** Column name IsWillingToCommit */
public static final String COLUMNNAME_IsWillingToCommit = "IsWillingToCommit";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name == null) throw new IllegalArgumentException ("Name is mandatory.");
if (Name.length() > 60)
{
log.warning("Length > 60 - truncated");
Name = Name.substring(0,59);
}
set_Value (COLUMNNAME_Name, Name);
}
/** Get Name.
@return Alphanumeric identifier of the entity */
public String getName() 
{
String value = (String)get_Value(COLUMNNAME_Name);
if (value == null)
  return "";
return value;
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getName());
}

@XendraTrl(Identifier="8f9c9620-8fd6-b797-4e1b-cfe603411707")
public static String es_PE_FIELD_Offer_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="8f9c9620-8fd6-b797-4e1b-cfe603411707")
public static String es_PE_FIELD_Offer_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="8f9c9620-8fd6-b797-4e1b-cfe603411707")
public static String es_PE_FIELD_Offer_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="841da36d-d784-b382-649e-8a7404d31516",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="8f9c9620-8fd6-b797-4e1b-cfe603411707")
public static final String FIELDNAME_Offer_Name="8f9c9620-8fd6-b797-4e1b-cfe603411707";

@XendraTrl(Identifier="72065e23-549a-f163-846c-64dcb4aafb4e")
public static String es_PE_FIELD_Offer_Name2_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="72065e23-549a-f163-846c-64dcb4aafb4e")
public static String es_PE_FIELD_Offer_Name2_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="72065e23-549a-f163-846c-64dcb4aafb4e")
public static String es_PE_FIELD_Offer_Name2_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="c88ef836-f846-0a40-b8c9-0fd2460b1577",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=2,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="72065e23-549a-f163-846c-64dcb4aafb4e")
public static final String FIELDNAME_Offer_Name2="72065e23-549a-f163-846c-64dcb4aafb4e";

@XendraTrl(Identifier="93c8597f-1dee-6451-f7f7-0bf7adcc12ba")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="93c8597f-1dee-6451-f7f7-0bf7adcc12ba",
Synchronized="2017-08-05 16:53:07.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Private Note.
@param PrivateNote Private Note - not visible to the other parties */
public void setPrivateNote (String PrivateNote)
{
set_Value (COLUMNNAME_PrivateNote, PrivateNote);
}
/** Get Private Note.
@return Private Note - not visible to the other parties */
public String getPrivateNote() 
{
String value = (String)get_Value(COLUMNNAME_PrivateNote);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="ee2cb9d5-63a0-44c7-7c3e-37e714e1ef83")
public static String es_PE_FIELD_Offer_PrivateNote_Description="Nota privada - no visible a las otras partidas.";

@XendraTrl(Identifier="ee2cb9d5-63a0-44c7-7c3e-37e714e1ef83")
public static String es_PE_FIELD_Offer_PrivateNote_Name="Nota Privada";

@XendraField(AD_Column_ID="PrivateNote",IsCentrallyMaintained=true,
AD_Tab_ID="841da36d-d784-b382-649e-8a7404d31516",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ee2cb9d5-63a0-44c7-7c3e-37e714e1ef83")
public static final String FIELDNAME_Offer_PrivateNote="ee2cb9d5-63a0-44c7-7c3e-37e714e1ef83";

@XendraTrl(Identifier="a2dbf1ed-48e4-9a8d-3f21-6dddc5299c9c")
public static String es_PE_FIELD_Offer_PrivateNote2_Description="Nota privada - no visible a las otras partidas.";

@XendraTrl(Identifier="a2dbf1ed-48e4-9a8d-3f21-6dddc5299c9c")
public static String es_PE_FIELD_Offer_PrivateNote2_Name="Nota Privada";

@XendraField(AD_Column_ID="PrivateNote",IsCentrallyMaintained=true,
AD_Tab_ID="c88ef836-f846-0a40-b8c9-0fd2460b1577",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a2dbf1ed-48e4-9a8d-3f21-6dddc5299c9c")
public static final String FIELDNAME_Offer_PrivateNote2="a2dbf1ed-48e4-9a8d-3f21-6dddc5299c9c";

@XendraTrl(Identifier="305eeea3-4fda-eb21-daf0-775def580c1c")
public static String es_PE_COLUMN_PrivateNote_Name="Nota Privada";

@XendraColumn(AD_Element_ID="fc7e2efd-d4aa-0f8a-9ea8-54d4919db68f",ColumnName="PrivateNote",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="305eeea3-4fda-eb21-daf0-775def580c1c",
Synchronized="2017-08-05 16:53:07.0")
/** Column name PrivateNote */
public static final String COLUMNNAME_PrivateNote = "PrivateNote";
/** Set Text Message.
@param TextMsg Text Message */
public void setTextMsg (String TextMsg)
{
set_Value (COLUMNNAME_TextMsg, TextMsg);
}
/** Get Text Message.
@return Text Message */
public String getTextMsg() 
{
String value = (String)get_Value(COLUMNNAME_TextMsg);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="286c1cf1-e47f-4b86-0688-d68729f4f9ce")
public static String es_PE_FIELD_Offer_TextMessage_Description="Mensaje de texto";

@XendraTrl(Identifier="286c1cf1-e47f-4b86-0688-d68729f4f9ce")
public static String es_PE_FIELD_Offer_TextMessage_Name="Mensaje de texto";

@XendraField(AD_Column_ID="TextMsg",IsCentrallyMaintained=true,
AD_Tab_ID="841da36d-d784-b382-649e-8a7404d31516",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="286c1cf1-e47f-4b86-0688-d68729f4f9ce")
public static final String FIELDNAME_Offer_TextMessage="286c1cf1-e47f-4b86-0688-d68729f4f9ce";

@XendraTrl(Identifier="93c16fb4-a87e-976a-01ee-8f4ada152e9d")
public static String es_PE_FIELD_Offer_TextMessage2_Description="Mensaje de texto";

@XendraTrl(Identifier="93c16fb4-a87e-976a-01ee-8f4ada152e9d")
public static String es_PE_FIELD_Offer_TextMessage2_Name="Mensaje de texto";

@XendraField(AD_Column_ID="TextMsg",IsCentrallyMaintained=true,
AD_Tab_ID="c88ef836-f846-0a40-b8c9-0fd2460b1577",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="93c16fb4-a87e-976a-01ee-8f4ada152e9d")
public static final String FIELDNAME_Offer_TextMessage2="93c16fb4-a87e-976a-01ee-8f4ada152e9d";

@XendraTrl(Identifier="a5d80045-c760-e71f-e01b-9bb02c765082")
public static String es_PE_COLUMN_TextMsg_Name="Mensaje de texto";

@XendraColumn(AD_Element_ID="377bebfe-238a-1c79-c1a9-13afa4448222",ColumnName="TextMsg",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a5d80045-c760-e71f-e01b-9bb02c765082",
Synchronized="2017-08-05 16:53:07.0")
/** Column name TextMsg */
public static final String COLUMNNAME_TextMsg = "TextMsg";
}
