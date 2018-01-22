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
/** Generated Model for B_BuyerFunds
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_B_BuyerFunds extends PO
{
/** Standard Constructor
@param ctx context
@param B_BuyerFunds_ID id
@param trxName transaction
*/
public X_B_BuyerFunds (Properties ctx, int B_BuyerFunds_ID, String trxName)
{
super (ctx, B_BuyerFunds_ID, trxName);
/** if (B_BuyerFunds_ID == 0)
{
setAD_User_ID (0);
setB_BuyerFunds_ID (0);
setCommittedAmt (Env.ZERO);	
// 0
setNonCommittedAmt (Env.ZERO);	
// 0
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_B_BuyerFunds (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=683 */
public static int Table_ID=MTable.getTable_ID("B_BuyerFunds");

@XendraTrl(Identifier="025d6416-06de-0e40-00a6-973281ba7ffc")
public static String es_PE_TAB_BidFunds_Description="Fondos del comprador para la oferta de asunto";

@XendraTrl(Identifier="025d6416-06de-0e40-00a6-973281ba7ffc")
public static String es_PE_TAB_BidFunds_Name="Oferta de Fondos";

@XendraTrl(Identifier="025d6416-06de-0e40-00a6-973281ba7ffc")
public static String es_PE_TAB_BidFunds_Help="Fondos destinados para las ofertas";

@XendraTab(Name="Bid Funds",Description="Buyer Funds for Bid on Topic",
Help="Committed or Uncommited funds for Bids",AD_Window_ID="b526b654-eee4-ce2f-a903-14ef1f1b7296",
SeqNo=30,TabLevel=2,IsSingleRow=true,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,
AD_Column_ID="b7708d98-241a-f51b-f25e-50c176804050",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="025d6416-06de-0e40-00a6-973281ba7ffc",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_BidFunds="025d6416-06de-0e40-00a6-973281ba7ffc";

@XendraTrl(Identifier="5dd007e5-279f-356a-87b1-b1f0dc6d0c1a")
public static String es_PE_TAB_Funds_Description="Fondos del vendedor de ofertas en asuntos.";

@XendraTrl(Identifier="5dd007e5-279f-356a-87b1-b1f0dc6d0c1a")
public static String es_PE_TAB_Funds_Name="Fondos";

@XendraTrl(Identifier="5dd007e5-279f-356a-87b1-b1f0dc6d0c1a")
public static String es_PE_TAB_Funds_Help="Fondos disponibles (para los pagos) y fondos destinados ó sin compromiso de ofertas";

@XendraTab(Name="Funds",Description="Seller Funds from Offers on Topics",
Help="Available Funds (for Payments) and Committed or Uncommited funds from Offers",
AD_Window_ID="45a49f39-e720-7227-5a91-7c0178b269a7",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,
AD_Column_ID="339cb045-214e-2f51-7aef-ea4681450283",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="5dd007e5-279f-356a-87b1-b1f0dc6d0c1a",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Funds="5dd007e5-279f-356a-87b1-b1f0dc6d0c1a";

@XendraTrl(Identifier="1bd3ae85-90cc-4be3-ee96-b82c6deb76a5")
public static String es_PE_TAB_Funds2_Description="Fondos del comprador disponibles para las ofertas en asuntos.";

@XendraTrl(Identifier="1bd3ae85-90cc-4be3-ee96-b82c6deb76a5")
public static String es_PE_TAB_Funds2_Name="Fondos";

@XendraTrl(Identifier="1bd3ae85-90cc-4be3-ee96-b82c6deb76a5")
public static String es_PE_TAB_Funds2_Help="Fondos disponibles (pagos) y fondos destinados ó sin compromiso para las ofertas";

@XendraTab(Name="Funds",Description="Buyer Funds available for Bids on Topics",
Help="Available Funds (Payments) and Committed or Uncommited funds for Bids",
AD_Window_ID="e626cef7-46c4-d631-a4c7-d98c05c67a58",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,
AD_Column_ID="339cb045-214e-2f51-7aef-ea4681450283",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="1bd3ae85-90cc-4be3-ee96-b82c6deb76a5",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Funds2="1bd3ae85-90cc-4be3-ee96-b82c6deb76a5";

@XendraTrl(Identifier="2452478a-0872-5470-eeca-6834166bc7b1")
public static String es_PE_TABLE_B_BuyerFunds_Name="Fondos del Comprador";

@XendraTable(Name="Buyer Funds",Description="Buyer Funds for Bids on Topics",Help="",
TableName="B_BuyerFunds",AccessLevel="3",AD_Window_ID="e626cef7-46c4-d631-a4c7-d98c05c67a58",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.bids",
Identifier="2452478a-0872-5470-eeca-6834166bc7b1",Synchronized="2017-08-16 11:41:16.0")
/** TableName=B_BuyerFunds */
public static final String Table_Name="B_BuyerFunds";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"B_BuyerFunds");

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
    Table_ID = MTable.getTable_ID("B_BuyerFunds");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_B_BuyerFunds[").append(get_ID()).append("]");
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
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getAD_User_ID()));
}

@XendraTrl(Identifier="b0b915f4-0393-94bc-584c-74b4487c926f")
public static String es_PE_FIELD_BidFunds_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="b0b915f4-0393-94bc-584c-74b4487c926f")
public static String es_PE_FIELD_BidFunds_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraTrl(Identifier="b0b915f4-0393-94bc-584c-74b4487c926f")
public static String es_PE_FIELD_BidFunds_UserContact_Name="Usuario";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="025d6416-06de-0e40-00a6-973281ba7ffc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b0b915f4-0393-94bc-584c-74b4487c926f")
public static final String FIELDNAME_BidFunds_UserContact="b0b915f4-0393-94bc-584c-74b4487c926f";

@XendraTrl(Identifier="fd5d3b43-c61c-3fa3-bb8f-c7b8efaef879")
public static String es_PE_FIELD_Funds_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="fd5d3b43-c61c-3fa3-bb8f-c7b8efaef879")
public static String es_PE_FIELD_Funds_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraTrl(Identifier="fd5d3b43-c61c-3fa3-bb8f-c7b8efaef879")
public static String es_PE_FIELD_Funds_UserContact_Name="Usuario";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5dd007e5-279f-356a-87b1-b1f0dc6d0c1a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fd5d3b43-c61c-3fa3-bb8f-c7b8efaef879")
public static final String FIELDNAME_Funds_UserContact="fd5d3b43-c61c-3fa3-bb8f-c7b8efaef879";

@XendraTrl(Identifier="d3df1d1d-9a90-24c4-1bf2-cf5c060fc1f0")
public static String es_PE_FIELD_Funds_UserContact2_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="d3df1d1d-9a90-24c4-1bf2-cf5c060fc1f0")
public static String es_PE_FIELD_Funds_UserContact2_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraTrl(Identifier="d3df1d1d-9a90-24c4-1bf2-cf5c060fc1f0")
public static String es_PE_FIELD_Funds_UserContact2_Name="Usuario";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1bd3ae85-90cc-4be3-ee96-b82c6deb76a5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d3df1d1d-9a90-24c4-1bf2-cf5c060fc1f0")
public static final String FIELDNAME_Funds_UserContact2="d3df1d1d-9a90-24c4-1bf2-cf5c060fc1f0";

@XendraTrl(Identifier="339cb045-214e-2f51-7aef-ea4681450283")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="339cb045-214e-2f51-7aef-ea4681450283",
Synchronized="2017-08-05 16:53:06.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
/** Set Buyer Funds.
@param B_BuyerFunds_ID Buyer Funds for Bids on Topics */
public void setB_BuyerFunds_ID (int B_BuyerFunds_ID)
{
if (B_BuyerFunds_ID < 1) throw new IllegalArgumentException ("B_BuyerFunds_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_B_BuyerFunds_ID, Integer.valueOf(B_BuyerFunds_ID));
}
/** Get Buyer Funds.
@return Buyer Funds for Bids on Topics */
public int getB_BuyerFunds_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_B_BuyerFunds_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="86e21e29-2ff6-3f47-1ee2-409cb95f2cbf")
public static String es_PE_FIELD_BidFunds_BuyerFunds_Description="Fondos del comprador para las ofertas en asuntos.";

@XendraTrl(Identifier="86e21e29-2ff6-3f47-1ee2-409cb95f2cbf")
public static String es_PE_FIELD_BidFunds_BuyerFunds_Help="Fondos disponibles (de pagos) y fondos destinados para las ofertas.";

@XendraTrl(Identifier="86e21e29-2ff6-3f47-1ee2-409cb95f2cbf")
public static String es_PE_FIELD_BidFunds_BuyerFunds_Name="Fondos del Comprador";

@XendraField(AD_Column_ID="B_BuyerFunds_ID",IsCentrallyMaintained=true,
AD_Tab_ID="025d6416-06de-0e40-00a6-973281ba7ffc",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="86e21e29-2ff6-3f47-1ee2-409cb95f2cbf")
public static final String FIELDNAME_BidFunds_BuyerFunds="86e21e29-2ff6-3f47-1ee2-409cb95f2cbf";

@XendraTrl(Identifier="408c269f-d660-4052-33be-2d0dc6313cb7")
public static String es_PE_FIELD_Funds_BuyerFunds_Description="Fondos del comprador para las ofertas en asuntos.";

@XendraTrl(Identifier="408c269f-d660-4052-33be-2d0dc6313cb7")
public static String es_PE_FIELD_Funds_BuyerFunds_Help="Fondos disponibles (de pagos) y fondos destinados para las ofertas.";

@XendraTrl(Identifier="408c269f-d660-4052-33be-2d0dc6313cb7")
public static String es_PE_FIELD_Funds_BuyerFunds_Name="Fondos del Comprador";

@XendraField(AD_Column_ID="B_BuyerFunds_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5dd007e5-279f-356a-87b1-b1f0dc6d0c1a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="408c269f-d660-4052-33be-2d0dc6313cb7")
public static final String FIELDNAME_Funds_BuyerFunds="408c269f-d660-4052-33be-2d0dc6313cb7";

@XendraTrl(Identifier="12f5ba33-20d9-dc4f-b232-b84fc5063bcf")
public static String es_PE_FIELD_Funds_BuyerFunds2_Description="Fondos del comprador para las ofertas en asuntos.";

@XendraTrl(Identifier="12f5ba33-20d9-dc4f-b232-b84fc5063bcf")
public static String es_PE_FIELD_Funds_BuyerFunds2_Help="Fondos disponibles (de pagos) y fondos destinados para las ofertas.";

@XendraTrl(Identifier="12f5ba33-20d9-dc4f-b232-b84fc5063bcf")
public static String es_PE_FIELD_Funds_BuyerFunds2_Name="Fondos del Comprador";

@XendraField(AD_Column_ID="B_BuyerFunds_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1bd3ae85-90cc-4be3-ee96-b82c6deb76a5",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="12f5ba33-20d9-dc4f-b232-b84fc5063bcf")
public static final String FIELDNAME_Funds_BuyerFunds2="12f5ba33-20d9-dc4f-b232-b84fc5063bcf";
/** Column name B_BuyerFunds_ID */
public static final String COLUMNNAME_B_BuyerFunds_ID = "B_BuyerFunds_ID";
/** Set Committed Amount.
@param CommittedAmt The (legal) commitment amount */
public void setCommittedAmt (BigDecimal CommittedAmt)
{
if (CommittedAmt == null) throw new IllegalArgumentException ("CommittedAmt is mandatory.");
set_Value (COLUMNNAME_CommittedAmt, CommittedAmt);
}
/** Get Committed Amount.
@return The (legal) commitment amount */
public BigDecimal getCommittedAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CommittedAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="b9b5e46b-b48f-1339-d68e-f09fb6091229")
public static String es_PE_FIELD_BidFunds_CommittedAmount_Description="Total Comprometido (legal)";

@XendraTrl(Identifier="b9b5e46b-b48f-1339-d68e-f09fb6091229")
public static String es_PE_FIELD_BidFunds_CommittedAmount_Help="El Total comprometido es independiente del total planeado, usted usaría el total planeado para su estimación realista; esta podría ser mayor ó menor que el total comprometido.";

@XendraTrl(Identifier="b9b5e46b-b48f-1339-d68e-f09fb6091229")
public static String es_PE_FIELD_BidFunds_CommittedAmount_Name="Total Comprometido";

@XendraField(AD_Column_ID="CommittedAmt",IsCentrallyMaintained=true,
AD_Tab_ID="025d6416-06de-0e40-00a6-973281ba7ffc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b9b5e46b-b48f-1339-d68e-f09fb6091229")
public static final String FIELDNAME_BidFunds_CommittedAmount="b9b5e46b-b48f-1339-d68e-f09fb6091229";

@XendraTrl(Identifier="59ac13b0-3996-30fa-0cf5-3812db60c520")
public static String es_PE_FIELD_Funds_CommittedAmount_Description="Total Comprometido (legal)";

@XendraTrl(Identifier="59ac13b0-3996-30fa-0cf5-3812db60c520")
public static String es_PE_FIELD_Funds_CommittedAmount_Help="El Total comprometido es independiente del total planeado, usted usaría el total planeado para su estimación realista; esta podría ser mayor ó menor que el total comprometido.";

@XendraTrl(Identifier="59ac13b0-3996-30fa-0cf5-3812db60c520")
public static String es_PE_FIELD_Funds_CommittedAmount_Name="Total Comprometido";

@XendraField(AD_Column_ID="CommittedAmt",IsCentrallyMaintained=true,
AD_Tab_ID="5dd007e5-279f-356a-87b1-b1f0dc6d0c1a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="59ac13b0-3996-30fa-0cf5-3812db60c520")
public static final String FIELDNAME_Funds_CommittedAmount="59ac13b0-3996-30fa-0cf5-3812db60c520";

@XendraTrl(Identifier="61ec7aa1-485b-7859-b981-4669554e2b5c")
public static String es_PE_FIELD_Funds_CommittedAmount2_Description="Total Comprometido (legal)";

@XendraTrl(Identifier="61ec7aa1-485b-7859-b981-4669554e2b5c")
public static String es_PE_FIELD_Funds_CommittedAmount2_Help="El Total comprometido es independiente del total planeado, usted usaría el total planeado para su estimación realista; esta podría ser mayor ó menor que el total comprometido.";

@XendraTrl(Identifier="61ec7aa1-485b-7859-b981-4669554e2b5c")
public static String es_PE_FIELD_Funds_CommittedAmount2_Name="Total Comprometido";

@XendraField(AD_Column_ID="CommittedAmt",IsCentrallyMaintained=true,
AD_Tab_ID="1bd3ae85-90cc-4be3-ee96-b82c6deb76a5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="61ec7aa1-485b-7859-b981-4669554e2b5c")
public static final String FIELDNAME_Funds_CommittedAmount2="61ec7aa1-485b-7859-b981-4669554e2b5c";

@XendraTrl(Identifier="2f8b52a9-4164-2e0d-8f98-df9b1f9cba2b")
public static String es_PE_COLUMN_CommittedAmt_Name="Total Comprometido";

@XendraColumn(AD_Element_ID="f000c6dd-f023-d000-0be4-e67375a2a641",ColumnName="CommittedAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2f8b52a9-4164-2e0d-8f98-df9b1f9cba2b",
Synchronized="2017-08-05 16:53:06.0")
/** Column name CommittedAmt */
public static final String COLUMNNAME_CommittedAmt = "CommittedAmt";
/** Set Order.
@param C_Order_ID Order */
public void setC_Order_ID (int C_Order_ID)
{
if (C_Order_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_Order_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_Order_ID, Integer.valueOf(C_Order_ID));
}
/** Get Order.
@return Order */
public int getC_Order_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Order_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6c5f4340-6173-e46d-85c9-d01e2507f81c")
public static String es_PE_FIELD_BidFunds_Order_Description="Orden de Venta";

@XendraTrl(Identifier="6c5f4340-6173-e46d-85c9-d01e2507f81c")
public static String es_PE_FIELD_BidFunds_Order_Help="La ID de la orden de ventas es un identificador único de la orden de ventas; Ésta es controlada por la secuencia del documento para este tipo de documento.";

@XendraTrl(Identifier="6c5f4340-6173-e46d-85c9-d01e2507f81c")
public static String es_PE_FIELD_BidFunds_Order_Name="Orden de Venta";

@XendraField(AD_Column_ID="C_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="025d6416-06de-0e40-00a6-973281ba7ffc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6c5f4340-6173-e46d-85c9-d01e2507f81c")
public static final String FIELDNAME_BidFunds_Order="6c5f4340-6173-e46d-85c9-d01e2507f81c";

@XendraTrl(Identifier="526f46cd-a492-39b0-28cc-9a61d685e41a")
public static String es_PE_FIELD_Funds_PurchaseOrder_Description="Orden de compra";

@XendraTrl(Identifier="526f46cd-a492-39b0-28cc-9a61d685e41a")
public static String es_PE_FIELD_Funds_PurchaseOrder_Help="La compra es Identificada con un ID único de orden de compra. Esta controlado por la secuencia de este tipo de documento.";

@XendraTrl(Identifier="526f46cd-a492-39b0-28cc-9a61d685e41a")
public static String es_PE_FIELD_Funds_PurchaseOrder_Name="Orden de compra";

@XendraField(AD_Column_ID="C_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5dd007e5-279f-356a-87b1-b1f0dc6d0c1a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="526f46cd-a492-39b0-28cc-9a61d685e41a")
public static final String FIELDNAME_Funds_PurchaseOrder="526f46cd-a492-39b0-28cc-9a61d685e41a";

@XendraTrl(Identifier="1a8111c6-71be-a3f2-8123-0b7530aba42d")
public static String es_PE_FIELD_Funds_Order_Description="Orden de Venta";

@XendraTrl(Identifier="1a8111c6-71be-a3f2-8123-0b7530aba42d")
public static String es_PE_FIELD_Funds_Order_Help="La ID de la orden de ventas es un identificador único de la orden de ventas; Ésta es controlada por la secuencia del documento para este tipo de documento.";

@XendraTrl(Identifier="1a8111c6-71be-a3f2-8123-0b7530aba42d")
public static String es_PE_FIELD_Funds_Order_Name="Orden de Venta";

@XendraField(AD_Column_ID="C_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1bd3ae85-90cc-4be3-ee96-b82c6deb76a5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1a8111c6-71be-a3f2-8123-0b7530aba42d")
public static final String FIELDNAME_Funds_Order="1a8111c6-71be-a3f2-8123-0b7530aba42d";

@XendraTrl(Identifier="348bcafc-f72a-1c30-c0b7-14fd4c994468")
public static String es_PE_COLUMN_C_Order_ID_Name="Orden de Venta";

@XendraColumn(AD_Element_ID="cc846c60-90b8-6aad-9d07-b5d0c0328787",ColumnName="C_Order_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="348bcafc-f72a-1c30-c0b7-14fd4c994468",
Synchronized="2017-08-05 16:53:06.0")
/** Column name C_Order_ID */
public static final String COLUMNNAME_C_Order_ID = "C_Order_ID";
/** Set Payment.
@param C_Payment_ID Payment identifier */
public void setC_Payment_ID (int C_Payment_ID)
{
if (C_Payment_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_Payment_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_Payment_ID, Integer.valueOf(C_Payment_ID));
}
/** Get Payment.
@return Payment identifier */
public int getC_Payment_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Payment_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0ad50027-ac0b-b189-fd41-c464717c094f")
public static String es_PE_FIELD_BidFunds_Payment_Description="Identificador del pago";

@XendraTrl(Identifier="0ad50027-ac0b-b189-fd41-c464717c094f")
public static String es_PE_FIELD_BidFunds_Payment_Help="El pago es un identificador único de este pago.";

@XendraTrl(Identifier="0ad50027-ac0b-b189-fd41-c464717c094f")
public static String es_PE_FIELD_BidFunds_Payment_Name="Pago";

@XendraField(AD_Column_ID="C_Payment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="025d6416-06de-0e40-00a6-973281ba7ffc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0ad50027-ac0b-b189-fd41-c464717c094f")
public static final String FIELDNAME_BidFunds_Payment="0ad50027-ac0b-b189-fd41-c464717c094f";

@XendraTrl(Identifier="f99eb4a6-2e0a-a67b-9025-5ce89e8558b1")
public static String es_PE_FIELD_Funds_Payment_Description="Identificador del pago";

@XendraTrl(Identifier="f99eb4a6-2e0a-a67b-9025-5ce89e8558b1")
public static String es_PE_FIELD_Funds_Payment_Help="El pago es un identificador único de este pago.";

@XendraTrl(Identifier="f99eb4a6-2e0a-a67b-9025-5ce89e8558b1")
public static String es_PE_FIELD_Funds_Payment_Name="Pago";

@XendraField(AD_Column_ID="C_Payment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5dd007e5-279f-356a-87b1-b1f0dc6d0c1a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=80,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f99eb4a6-2e0a-a67b-9025-5ce89e8558b1")
public static final String FIELDNAME_Funds_Payment="f99eb4a6-2e0a-a67b-9025-5ce89e8558b1";

@XendraTrl(Identifier="8e847366-5d4e-566d-0c49-f1fc16ac4da9")
public static String es_PE_FIELD_Funds_Payment2_Description="Identificador del pago";

@XendraTrl(Identifier="8e847366-5d4e-566d-0c49-f1fc16ac4da9")
public static String es_PE_FIELD_Funds_Payment2_Help="El pago es un identificador único de este pago.";

@XendraTrl(Identifier="8e847366-5d4e-566d-0c49-f1fc16ac4da9")
public static String es_PE_FIELD_Funds_Payment2_Name="Pago";

@XendraField(AD_Column_ID="C_Payment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1bd3ae85-90cc-4be3-ee96-b82c6deb76a5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=80,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8e847366-5d4e-566d-0c49-f1fc16ac4da9")
public static final String FIELDNAME_Funds_Payment2="8e847366-5d4e-566d-0c49-f1fc16ac4da9";

@XendraTrl(Identifier="5ca0ae6a-7ed8-cf92-ec7a-4e0a4803378f")
public static String es_PE_COLUMN_C_Payment_ID_Name="Pago";

@XendraColumn(AD_Element_ID="3ded5658-968e-94c5-207b-eed6f6a7bb43",ColumnName="C_Payment_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5ca0ae6a-7ed8-cf92-ec7a-4e0a4803378f",
Synchronized="2017-08-05 16:53:06.0")
/** Column name C_Payment_ID */
public static final String COLUMNNAME_C_Payment_ID = "C_Payment_ID";
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
@XendraTrl(Identifier="e9d59913-0b09-4bc7-85dd-5fe829a258c1")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e9d59913-0b09-4bc7-85dd-5fe829a258c1",
Synchronized="2017-08-05 16:53:06.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Not Committed Aount.
@param NonCommittedAmt Amount not committed yet */
public void setNonCommittedAmt (BigDecimal NonCommittedAmt)
{
if (NonCommittedAmt == null) throw new IllegalArgumentException ("NonCommittedAmt is mandatory.");
set_Value (COLUMNNAME_NonCommittedAmt, NonCommittedAmt);
}
/** Get Not Committed Aount.
@return Amount not committed yet */
public BigDecimal getNonCommittedAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_NonCommittedAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="06e3f13a-323b-2977-837b-3edf1909c7de")
public static String es_PE_FIELD_BidFunds_NotCommittedAount_Description="Cantidad todavia no asegurada..";

@XendraTrl(Identifier="06e3f13a-323b-2977-837b-3edf1909c7de")
public static String es_PE_FIELD_BidFunds_NotCommittedAount_Name="Importe no Asegurado";

@XendraField(AD_Column_ID="NonCommittedAmt",IsCentrallyMaintained=true,
AD_Tab_ID="025d6416-06de-0e40-00a6-973281ba7ffc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="06e3f13a-323b-2977-837b-3edf1909c7de")
public static final String FIELDNAME_BidFunds_NotCommittedAount="06e3f13a-323b-2977-837b-3edf1909c7de";

@XendraTrl(Identifier="1e107037-12b4-4da0-3d15-7283eb838f20")
public static String es_PE_FIELD_Funds_NotCommittedAount_Description="Cantidad todavia no asegurada..";

@XendraTrl(Identifier="1e107037-12b4-4da0-3d15-7283eb838f20")
public static String es_PE_FIELD_Funds_NotCommittedAount_Name="Importe no Asegurado";

@XendraField(AD_Column_ID="NonCommittedAmt",IsCentrallyMaintained=true,
AD_Tab_ID="5dd007e5-279f-356a-87b1-b1f0dc6d0c1a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1e107037-12b4-4da0-3d15-7283eb838f20")
public static final String FIELDNAME_Funds_NotCommittedAount="1e107037-12b4-4da0-3d15-7283eb838f20";

@XendraTrl(Identifier="6d889a10-36cc-2fbd-f099-7adb23215906")
public static String es_PE_FIELD_Funds_NotCommittedAount2_Description="Cantidad todavia no asegurada..";

@XendraTrl(Identifier="6d889a10-36cc-2fbd-f099-7adb23215906")
public static String es_PE_FIELD_Funds_NotCommittedAount2_Name="Importe no Asegurado";

@XendraField(AD_Column_ID="NonCommittedAmt",IsCentrallyMaintained=true,
AD_Tab_ID="1bd3ae85-90cc-4be3-ee96-b82c6deb76a5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6d889a10-36cc-2fbd-f099-7adb23215906")
public static final String FIELDNAME_Funds_NotCommittedAount2="6d889a10-36cc-2fbd-f099-7adb23215906";

@XendraTrl(Identifier="ab9fa857-4489-c5b6-aa2d-c860706b8368")
public static String es_PE_COLUMN_NonCommittedAmt_Name="Importe no Asegurado";

@XendraColumn(AD_Element_ID="0360cc7a-330c-eca3-f2a0-d0e8c2dd1ddb",ColumnName="NonCommittedAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=3,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ab9fa857-4489-c5b6-aa2d-c860706b8368",
Synchronized="2017-08-05 16:53:06.0")
/** Column name NonCommittedAmt */
public static final String COLUMNNAME_NonCommittedAmt = "NonCommittedAmt";
}
