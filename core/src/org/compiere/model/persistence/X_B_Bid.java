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
/** Generated Model for B_Bid
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_B_Bid extends PO
{
/** Standard Constructor
@param ctx context
@param B_Bid_ID id
@param trxName transaction
*/
public X_B_Bid (Properties ctx, int B_Bid_ID, String trxName)
{
super (ctx, B_Bid_ID, trxName);
/** if (B_Bid_ID == 0)
{
setAD_User_ID (0);
setB_Bid_ID (0);
setB_BuyerFunds_ID (0);
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
public X_B_Bid (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=686 */
public static int Table_ID=MTable.getTable_ID("B_Bid");

@XendraTrl(Identifier="1748399b-1718-0f1d-87c0-78c2940e317f")
public static String es_PE_TAB_Bid_Description="Oferta para un asunto";

@XendraTrl(Identifier="1748399b-1718-0f1d-87c0-78c2940e317f")
public static String es_PE_TAB_Bid_Help="Usted puede crear una oferta para un asunto. Dependiendo del tipo, el licitador más alto gana el asunto - ó usted participa en el financiamiento para un asunto.";

@XendraTrl(Identifier="1748399b-1718-0f1d-87c0-78c2940e317f")
public static String es_PE_TAB_Bid_Name="Oferta";
@XendraTab(Name="Bid",
Description="Bid for a Topic",
Help="You can create a bid for a topic.  Depening on the type, the highest bidder wins the Topic - or you participate in funding for a Topic.",
AD_Window_ID="e626cef7-46c4-d631-a4c7-d98c05c67a58",SeqNo=30,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="eed62ba2-10aa-8bf3-9d6e-8d4ebc6761cb",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="1748399b-1718-0f1d-87c0-78c2940e317f",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Bid="1748399b-1718-0f1d-87c0-78c2940e317f";

@XendraTrl(Identifier="d43f43ae-f5ba-3b08-d1c9-5b713096355e")
public static String es_PE_TAB_Bid2_Description="Ofertas de la visión para un asunto.";

@XendraTrl(Identifier="d43f43ae-f5ba-3b08-d1c9-5b713096355e")
public static String es_PE_TAB_Bid2_Help="Usted puede crear una oferta para un asunto. Dependiendo del tipo, el licitador más alto gana el asunto - ó usted participa en el financiamiento para un asunto.";

@XendraTrl(Identifier="d43f43ae-f5ba-3b08-d1c9-5b713096355e")
public static String es_PE_TAB_Bid2_Name="Oferta";
@XendraTab(Name="Bid",
Description="View bids for a Topic",
Help="You can create a bid for a topic.  Depening on the type, the highest bidder wins the Topic - or you participate in funding for a Topic.",
AD_Window_ID="b526b654-eee4-ce2f-a903-14ef1f1b7296",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,
AD_Column_ID="9c943bb0-04e0-5686-54bd-5dd9fe122059",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="d43f43ae-f5ba-3b08-d1c9-5b713096355e",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Bid2="d43f43ae-f5ba-3b08-d1c9-5b713096355e";

@XendraTrl(Identifier="05927238-e9d7-d91c-a005-67210739ba6e")
public static String es_PE_TABLE_B_Bid_Name="Oferta";

@XendraTable(Name="Bid",AD_Package_ID="a0ba5f31-73ac-fb58-5a46-04ff03d1a8c1",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Bid for a Topic",Help="",
TableName="B_Bid",AccessLevel="3",AD_Window_ID="da35b881-e51f-c76d-0c58-a14a86f4a839",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.bids",
Identifier="05927238-e9d7-d91c-a005-67210739ba6e",Synchronized="2020-03-03 21:36:16.0")
/** TableName=B_Bid */
public static final String Table_Name="B_Bid";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"B_Bid");

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
    Table_ID = MTable.getTable_ID("B_Bid");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_B_Bid[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="4ec858c0-3cb1-fd79-cf1a-0127a6d8583b")
public static String es_PE_FIELD_Bid_UserContact_Name="Usuario";

@XendraTrl(Identifier="4ec858c0-3cb1-fd79-cf1a-0127a6d8583b")
public static String es_PE_FIELD_Bid_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="4ec858c0-3cb1-fd79-cf1a-0127a6d8583b")
public static String es_PE_FIELD_Bid_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d43f43ae-f5ba-3b08-d1c9-5b713096355e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4ec858c0-3cb1-fd79-cf1a-0127a6d8583b")
public static final String FIELDNAME_Bid_UserContact="4ec858c0-3cb1-fd79-cf1a-0127a6d8583b";

@XendraTrl(Identifier="b5bcb8fb-53f5-3c52-c7af-21dc6ecb6327")
public static String es_PE_FIELD_Bid_UserContact2_Name="Usuario";

@XendraTrl(Identifier="b5bcb8fb-53f5-3c52-c7af-21dc6ecb6327")
public static String es_PE_FIELD_Bid_UserContact2_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="b5bcb8fb-53f5-3c52-c7af-21dc6ecb6327")
public static String es_PE_FIELD_Bid_UserContact2_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1748399b-1718-0f1d-87c0-78c2940e317f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b5bcb8fb-53f5-3c52-c7af-21dc6ecb6327")
public static final String FIELDNAME_Bid_UserContact2="b5bcb8fb-53f5-3c52-c7af-21dc6ecb6327";

@XendraTrl(Identifier="eed62ba2-10aa-8bf3-9d6e-8d4ebc6761cb")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="eed62ba2-10aa-8bf3-9d6e-8d4ebc6761cb",
Synchronized="2019-08-30 22:20:57.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
/** Set Bid.
@param B_Bid_ID Bid for a Topic */
public void setB_Bid_ID (int B_Bid_ID)
{
if (B_Bid_ID < 1) throw new IllegalArgumentException ("B_Bid_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_B_Bid_ID, Integer.valueOf(B_Bid_ID));
}
/** Get Bid.
@return Bid for a Topic */
public int getB_Bid_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_B_Bid_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3523f45a-a96d-edc0-c2aa-8b0368093c4c")
public static String es_PE_FIELD_Bid_Bid_Name="Oferta";

@XendraTrl(Identifier="3523f45a-a96d-edc0-c2aa-8b0368093c4c")
public static String es_PE_FIELD_Bid_Bid_Description="Oferta para un asunto";

@XendraTrl(Identifier="3523f45a-a96d-edc0-c2aa-8b0368093c4c")
public static String es_PE_FIELD_Bid_Bid_Help="Usted puede crear una oferta para un asunto. Dependiendo del tipo, El licitador más alto gana el asunto - ó usted participa en el financiamiento de un asunto.";

@XendraField(AD_Column_ID="B_Bid_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d43f43ae-f5ba-3b08-d1c9-5b713096355e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3523f45a-a96d-edc0-c2aa-8b0368093c4c")
public static final String FIELDNAME_Bid_Bid="3523f45a-a96d-edc0-c2aa-8b0368093c4c";

@XendraTrl(Identifier="35b0f20a-d18a-9b49-f051-e6413c2c8a5d")
public static String es_PE_FIELD_Bid_Bid2_Name="Oferta";

@XendraTrl(Identifier="35b0f20a-d18a-9b49-f051-e6413c2c8a5d")
public static String es_PE_FIELD_Bid_Bid2_Description="Oferta para un asunto";

@XendraTrl(Identifier="35b0f20a-d18a-9b49-f051-e6413c2c8a5d")
public static String es_PE_FIELD_Bid_Bid2_Help="Usted puede crear una oferta para un asunto. Dependiendo del tipo, El licitador más alto gana el asunto - ó usted participa en el financiamiento de un asunto.";

@XendraField(AD_Column_ID="B_Bid_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1748399b-1718-0f1d-87c0-78c2940e317f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="35b0f20a-d18a-9b49-f051-e6413c2c8a5d")
public static final String FIELDNAME_Bid_Bid2="35b0f20a-d18a-9b49-f051-e6413c2c8a5d";
/** Column name B_Bid_ID */
public static final String COLUMNNAME_B_Bid_ID = "B_Bid_ID";
/** Set Buyer Funds.
@param B_BuyerFunds_ID Buyer Funds for Bids on Topics */
public void setB_BuyerFunds_ID (int B_BuyerFunds_ID)
{
if (B_BuyerFunds_ID < 1) throw new IllegalArgumentException ("B_BuyerFunds_ID is mandatory.");
set_Value (COLUMNNAME_B_BuyerFunds_ID, Integer.valueOf(B_BuyerFunds_ID));
}
/** Get Buyer Funds.
@return Buyer Funds for Bids on Topics */
public int getB_BuyerFunds_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_B_BuyerFunds_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6ae47503-3bf6-aec9-f3ad-dcca0312b95c")
public static String es_PE_FIELD_Bid_BuyerFunds_Name="Fondos del Comprador";

@XendraTrl(Identifier="6ae47503-3bf6-aec9-f3ad-dcca0312b95c")
public static String es_PE_FIELD_Bid_BuyerFunds_Description="Fondos del comprador para las ofertas en asuntos.";

@XendraTrl(Identifier="6ae47503-3bf6-aec9-f3ad-dcca0312b95c")
public static String es_PE_FIELD_Bid_BuyerFunds_Help="Fondos disponibles (de pagos) y fondos destinados para las ofertas.";

@XendraField(AD_Column_ID="B_BuyerFunds_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d43f43ae-f5ba-3b08-d1c9-5b713096355e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6ae47503-3bf6-aec9-f3ad-dcca0312b95c")
public static final String FIELDNAME_Bid_BuyerFunds="6ae47503-3bf6-aec9-f3ad-dcca0312b95c";

@XendraTrl(Identifier="10dc8d4c-5e9f-652f-3481-ac9bed93c1b1")
public static String es_PE_FIELD_Bid_BuyerFunds2_Name="Fondos del Comprador";

@XendraTrl(Identifier="10dc8d4c-5e9f-652f-3481-ac9bed93c1b1")
public static String es_PE_FIELD_Bid_BuyerFunds2_Description="Fondos del comprador para las ofertas en asuntos.";

@XendraTrl(Identifier="10dc8d4c-5e9f-652f-3481-ac9bed93c1b1")
public static String es_PE_FIELD_Bid_BuyerFunds2_Help="Fondos disponibles (de pagos) y fondos destinados para las ofertas.";

@XendraField(AD_Column_ID="B_BuyerFunds_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1748399b-1718-0f1d-87c0-78c2940e317f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="10dc8d4c-5e9f-652f-3481-ac9bed93c1b1")
public static final String FIELDNAME_Bid_BuyerFunds2="10dc8d4c-5e9f-652f-3481-ac9bed93c1b1";

@XendraTrl(Identifier="ead252bc-c68d-37b4-d1b8-fac4be93c597")
public static String es_PE_COLUMN_B_BuyerFunds_ID_Name="Fondos del Comprador";

@XendraColumn(AD_Element_ID="b437e8b4-e5fb-6b74-e9c3-f944e46a0676",ColumnName="B_BuyerFunds_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ead252bc-c68d-37b4-d1b8-fac4be93c597",
Synchronized="2019-08-30 22:20:57.0")
/** Column name B_BuyerFunds_ID */
public static final String COLUMNNAME_B_BuyerFunds_ID = "B_BuyerFunds_ID";
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

@XendraTrl(Identifier="a0f56f75-7a20-b35d-d73b-07cc36766416")
public static String es_PE_FIELD_Bid_Topic_Name="Asunto";

@XendraTrl(Identifier="a0f56f75-7a20-b35d-d73b-07cc36766416")
public static String es_PE_FIELD_Bid_Topic_Description="Asunto de la subasta.";

@XendraTrl(Identifier="a0f56f75-7a20-b35d-d73b-07cc36766416")
public static String es_PE_FIELD_Bid_Topic_Help="Decripción del articulo a vender ó a crear.";

@XendraField(AD_Column_ID="B_Topic_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d43f43ae-f5ba-3b08-d1c9-5b713096355e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a0f56f75-7a20-b35d-d73b-07cc36766416")
public static final String FIELDNAME_Bid_Topic="a0f56f75-7a20-b35d-d73b-07cc36766416";

@XendraTrl(Identifier="288263d5-11c7-ec6b-626f-5559f15d667c")
public static String es_PE_FIELD_Bid_Topic2_Name="Asunto";

@XendraTrl(Identifier="288263d5-11c7-ec6b-626f-5559f15d667c")
public static String es_PE_FIELD_Bid_Topic2_Description="Asunto de la subasta.";

@XendraTrl(Identifier="288263d5-11c7-ec6b-626f-5559f15d667c")
public static String es_PE_FIELD_Bid_Topic2_Help="Decripción del articulo a vender ó a crear.";

@XendraField(AD_Column_ID="B_Topic_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1748399b-1718-0f1d-87c0-78c2940e317f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="288263d5-11c7-ec6b-626f-5559f15d667c")
public static final String FIELDNAME_Bid_Topic2="288263d5-11c7-ec6b-626f-5559f15d667c";

@XendraTrl(Identifier="9c943bb0-04e0-5686-54bd-5dd9fe122059")
public static String es_PE_COLUMN_B_Topic_ID_Name="Asunto";

@XendraColumn(AD_Element_ID="769c2ab0-c0fe-bf49-cdc1-b072c5e6fdb8",ColumnName="B_Topic_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9c943bb0-04e0-5686-54bd-5dd9fe122059",
Synchronized="2019-08-30 22:20:57.0")
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
@XendraTrl(Identifier="249f1642-6d4e-4ecf-8324-bfcfdc7700b2")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="249f1642-6d4e-4ecf-8324-bfcfdc7700b2",
Synchronized="2019-08-30 22:20:57.0")
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

@XendraTrl(Identifier="1f134b8e-c6eb-a3a0-81b6-921d769d90ea")
public static String es_PE_FIELD_Bid_WillingToCommit_Name="Querer Confiar";

@XendraField(AD_Column_ID="IsWillingToCommit",IsCentrallyMaintained=true,
AD_Tab_ID="d43f43ae-f5ba-3b08-d1c9-5b713096355e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1f134b8e-c6eb-a3a0-81b6-921d769d90ea")
public static final String FIELDNAME_Bid_WillingToCommit="1f134b8e-c6eb-a3a0-81b6-921d769d90ea";

@XendraTrl(Identifier="00d59c6d-f93b-91fd-8018-ef22ae517197")
public static String es_PE_FIELD_Bid_WillingToCommit2_Name="Querer Confiar";

@XendraField(AD_Column_ID="IsWillingToCommit",IsCentrallyMaintained=true,
AD_Tab_ID="1748399b-1718-0f1d-87c0-78c2940e317f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="00d59c6d-f93b-91fd-8018-ef22ae517197")
public static final String FIELDNAME_Bid_WillingToCommit2="00d59c6d-f93b-91fd-8018-ef22ae517197";

@XendraTrl(Identifier="94a570df-3f58-7331-f5d0-c19a70566d82")
public static String es_PE_COLUMN_IsWillingToCommit_Name="Querer Confiar";

@XendraColumn(AD_Element_ID="65e86b0b-d236-52e8-ca90-6498b1662b41",ColumnName="IsWillingToCommit",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="94a570df-3f58-7331-f5d0-c19a70566d82",
Synchronized="2019-08-30 22:20:57.0")
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

@XendraTrl(Identifier="ce2addd6-5b06-ddf9-3654-0a8d9419b905")
public static String es_PE_FIELD_Bid_Name_Name="Nombre";

@XendraTrl(Identifier="ce2addd6-5b06-ddf9-3654-0a8d9419b905")
public static String es_PE_FIELD_Bid_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="ce2addd6-5b06-ddf9-3654-0a8d9419b905")
public static String es_PE_FIELD_Bid_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="d43f43ae-f5ba-3b08-d1c9-5b713096355e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ce2addd6-5b06-ddf9-3654-0a8d9419b905")
public static final String FIELDNAME_Bid_Name="ce2addd6-5b06-ddf9-3654-0a8d9419b905";

@XendraTrl(Identifier="316e80e3-48b2-4f87-b972-bd332d97db65")
public static String es_PE_FIELD_Bid_Name2_Name="Nombre";

@XendraTrl(Identifier="316e80e3-48b2-4f87-b972-bd332d97db65")
public static String es_PE_FIELD_Bid_Name2_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="316e80e3-48b2-4f87-b972-bd332d97db65")
public static String es_PE_FIELD_Bid_Name2_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="1748399b-1718-0f1d-87c0-78c2940e317f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=2,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="316e80e3-48b2-4f87-b972-bd332d97db65")
public static final String FIELDNAME_Bid_Name2="316e80e3-48b2-4f87-b972-bd332d97db65";

@XendraTrl(Identifier="f209801d-3c8f-ae80-8b0c-89cb44322534")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f209801d-3c8f-ae80-8b0c-89cb44322534",
Synchronized="2019-08-30 22:20:57.0")
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
@XendraTrl(Identifier="84a69c7b-769a-a4e2-c66c-3e2e1e5dd658")
public static String es_PE_FIELD_Bid_PrivateNote_Name="Nota Privada";

@XendraTrl(Identifier="84a69c7b-769a-a4e2-c66c-3e2e1e5dd658")
public static String es_PE_FIELD_Bid_PrivateNote_Description="Nota privada - no visible a las otras partidas.";

@XendraField(AD_Column_ID="PrivateNote",IsCentrallyMaintained=true,
AD_Tab_ID="d43f43ae-f5ba-3b08-d1c9-5b713096355e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="84a69c7b-769a-a4e2-c66c-3e2e1e5dd658")
public static final String FIELDNAME_Bid_PrivateNote="84a69c7b-769a-a4e2-c66c-3e2e1e5dd658";

@XendraTrl(Identifier="cb74831c-3300-c079-40b0-a70feb662dc6")
public static String es_PE_FIELD_Bid_PrivateNote2_Name="Nota Privada";

@XendraTrl(Identifier="cb74831c-3300-c079-40b0-a70feb662dc6")
public static String es_PE_FIELD_Bid_PrivateNote2_Description="Nota privada - no visible a las otras partidas.";

@XendraField(AD_Column_ID="PrivateNote",IsCentrallyMaintained=true,
AD_Tab_ID="1748399b-1718-0f1d-87c0-78c2940e317f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cb74831c-3300-c079-40b0-a70feb662dc6")
public static final String FIELDNAME_Bid_PrivateNote2="cb74831c-3300-c079-40b0-a70feb662dc6";

@XendraTrl(Identifier="cf9e91b2-cb59-6fc2-fe28-a16c4e5b5af5")
public static String es_PE_COLUMN_PrivateNote_Name="Nota Privada";

@XendraColumn(AD_Element_ID="fc7e2efd-d4aa-0f8a-9ea8-54d4919db68f",ColumnName="PrivateNote",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cf9e91b2-cb59-6fc2-fe28-a16c4e5b5af5",
Synchronized="2019-08-30 22:20:57.0")
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
@XendraTrl(Identifier="7b31e8cd-82e9-be66-093c-8e2a79ec2ad5")
public static String es_PE_FIELD_Bid_TextMessage_Name="Mensaje de texto";

@XendraTrl(Identifier="7b31e8cd-82e9-be66-093c-8e2a79ec2ad5")
public static String es_PE_FIELD_Bid_TextMessage_Description="Mensaje de texto";

@XendraField(AD_Column_ID="TextMsg",IsCentrallyMaintained=true,
AD_Tab_ID="d43f43ae-f5ba-3b08-d1c9-5b713096355e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7b31e8cd-82e9-be66-093c-8e2a79ec2ad5")
public static final String FIELDNAME_Bid_TextMessage="7b31e8cd-82e9-be66-093c-8e2a79ec2ad5";

@XendraTrl(Identifier="d27427f8-321c-29f2-64ed-9a63dfedf93d")
public static String es_PE_FIELD_Bid_TextMessage2_Name="Mensaje de texto";

@XendraTrl(Identifier="d27427f8-321c-29f2-64ed-9a63dfedf93d")
public static String es_PE_FIELD_Bid_TextMessage2_Description="Mensaje de texto";

@XendraField(AD_Column_ID="TextMsg",IsCentrallyMaintained=true,
AD_Tab_ID="1748399b-1718-0f1d-87c0-78c2940e317f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d27427f8-321c-29f2-64ed-9a63dfedf93d")
public static final String FIELDNAME_Bid_TextMessage2="d27427f8-321c-29f2-64ed-9a63dfedf93d";

@XendraTrl(Identifier="88f6ec05-3d80-1795-ae52-4d9b6ea194ff")
public static String es_PE_COLUMN_TextMsg_Name="Mensaje de texto";

@XendraColumn(AD_Element_ID="377bebfe-238a-1c79-c1a9-13afa4448222",ColumnName="TextMsg",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="88f6ec05-3d80-1795-ae52-4d9b6ea194ff",
Synchronized="2019-08-30 22:20:57.0")
/** Column name TextMsg */
public static final String COLUMNNAME_TextMsg = "TextMsg";
}
