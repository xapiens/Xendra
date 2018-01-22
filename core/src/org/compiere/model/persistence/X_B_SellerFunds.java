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
/** Generated Model for B_SellerFunds
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_B_SellerFunds extends PO
{
/** Standard Constructor
@param ctx context
@param B_SellerFunds_ID id
@param trxName transaction
*/
public X_B_SellerFunds (Properties ctx, int B_SellerFunds_ID, String trxName)
{
super (ctx, B_SellerFunds_ID, trxName);
/** if (B_SellerFunds_ID == 0)
{
setAD_User_ID (0);
setB_SellerFunds_ID (0);
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
public X_B_SellerFunds (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=680 */
public static int Table_ID=MTable.getTable_ID("B_SellerFunds");

@XendraTrl(Identifier="9b6d2852-c66f-c1d2-639f-493dddbc9e26")
public static String es_PE_TAB_OfferFunds_Description="Fondos del vendedor de ofertas en asuntos.";

@XendraTrl(Identifier="9b6d2852-c66f-c1d2-639f-493dddbc9e26")
public static String es_PE_TAB_OfferFunds_Name="Oferta Fondos";

@XendraTrl(Identifier="9b6d2852-c66f-c1d2-639f-493dddbc9e26")
public static String es_PE_TAB_OfferFunds_Help="Fondos destinados ó sin compromiso de ofertas";

@XendraTab(Name="Offer Funds",Description="Seller Funds from Offers on Topics",
Help="Committed or Uncommited funds from Offers",
AD_Window_ID="b526b654-eee4-ce2f-a903-14ef1f1b7296",SeqNo=50,TabLevel=2,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,
AD_Column_ID="14aac80c-400c-e982-7f35-1b535e59fc2f",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="9b6d2852-c66f-c1d2-639f-493dddbc9e26",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_OfferFunds="9b6d2852-c66f-c1d2-639f-493dddbc9e26";

@XendraTrl(Identifier="f3b39c28-95da-f9aa-f25f-ce48b461d831")
public static String es_PE_TABLE_B_SellerFunds_Name="Fondos del Vendedor";

@XendraTable(Name="Seller Funds",Description="Seller Funds from Offers on Topics",Help="",
TableName="B_SellerFunds",AccessLevel="3",AD_Window_ID="45a49f39-e720-7227-5a91-7c0178b269a7",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.bids",
Identifier="f3b39c28-95da-f9aa-f25f-ce48b461d831",Synchronized="2017-08-16 11:41:17.0")
/** TableName=B_SellerFunds */
public static final String Table_Name="B_SellerFunds";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"B_SellerFunds");

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
    Table_ID = MTable.getTable_ID("B_SellerFunds");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_B_SellerFunds[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="8259ef96-6ca1-e0c6-7f51-fd778ce174c0")
public static String es_PE_FIELD_OfferFunds_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="8259ef96-6ca1-e0c6-7f51-fd778ce174c0")
public static String es_PE_FIELD_OfferFunds_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraTrl(Identifier="8259ef96-6ca1-e0c6-7f51-fd778ce174c0")
public static String es_PE_FIELD_OfferFunds_UserContact_Name="Usuario";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9b6d2852-c66f-c1d2-639f-493dddbc9e26",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8259ef96-6ca1-e0c6-7f51-fd778ce174c0")
public static final String FIELDNAME_OfferFunds_UserContact="8259ef96-6ca1-e0c6-7f51-fd778ce174c0";

@XendraTrl(Identifier="c089654f-e0b1-049d-73ad-cb54afdf9b85")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c089654f-e0b1-049d-73ad-cb54afdf9b85",
Synchronized="2017-08-05 16:53:07.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
/** Set Seller Funds.
@param B_SellerFunds_ID Seller Funds from Offers on Topics */
public void setB_SellerFunds_ID (int B_SellerFunds_ID)
{
if (B_SellerFunds_ID < 1) throw new IllegalArgumentException ("B_SellerFunds_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_B_SellerFunds_ID, Integer.valueOf(B_SellerFunds_ID));
}
/** Get Seller Funds.
@return Seller Funds from Offers on Topics */
public int getB_SellerFunds_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_B_SellerFunds_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1fe4a287-ba5d-b00a-fa32-d951f2de89da")
public static String es_PE_FIELD_OfferFunds_SellerFunds_Description="Fondos del vendedor en asuntos de ofertas.";

@XendraTrl(Identifier="1fe4a287-ba5d-b00a-fa32-d951f2de89da")
public static String es_PE_FIELD_OfferFunds_SellerFunds_Help="Fondos disponibles (para los pagos) y fondos destinados de ofertas.";

@XendraTrl(Identifier="1fe4a287-ba5d-b00a-fa32-d951f2de89da")
public static String es_PE_FIELD_OfferFunds_SellerFunds_Name="Fondos del Vendedor";

@XendraField(AD_Column_ID="B_SellerFunds_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9b6d2852-c66f-c1d2-639f-493dddbc9e26",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1fe4a287-ba5d-b00a-fa32-d951f2de89da")
public static final String FIELDNAME_OfferFunds_SellerFunds="1fe4a287-ba5d-b00a-fa32-d951f2de89da";
/** Column name B_SellerFunds_ID */
public static final String COLUMNNAME_B_SellerFunds_ID = "B_SellerFunds_ID";
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

@XendraTrl(Identifier="08164797-1461-23ef-8df5-9f6925a4beba")
public static String es_PE_FIELD_OfferFunds_CommittedAmount_Description="Total Comprometido (legal)";

@XendraTrl(Identifier="08164797-1461-23ef-8df5-9f6925a4beba")
public static String es_PE_FIELD_OfferFunds_CommittedAmount_Help="El Total comprometido es independiente del total planeado, usted usaría el total planeado para su estimación realista; esta podría ser mayor ó menor que el total comprometido.";

@XendraTrl(Identifier="08164797-1461-23ef-8df5-9f6925a4beba")
public static String es_PE_FIELD_OfferFunds_CommittedAmount_Name="Total Comprometido";

@XendraField(AD_Column_ID="CommittedAmt",IsCentrallyMaintained=true,
AD_Tab_ID="9b6d2852-c66f-c1d2-639f-493dddbc9e26",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="08164797-1461-23ef-8df5-9f6925a4beba")
public static final String FIELDNAME_OfferFunds_CommittedAmount="08164797-1461-23ef-8df5-9f6925a4beba";

@XendraTrl(Identifier="13216d62-6cfe-6be7-c8c1-571b192b0afa")
public static String es_PE_COLUMN_CommittedAmt_Name="Total Comprometido";

@XendraColumn(AD_Element_ID="f000c6dd-f023-d000-0be4-e67375a2a641",ColumnName="CommittedAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="13216d62-6cfe-6be7-c8c1-571b192b0afa",
Synchronized="2017-08-05 16:53:07.0")
/** Column name CommittedAmt */
public static final String COLUMNNAME_CommittedAmt = "CommittedAmt";
/** Set Order.
@param C_Order_ID Order */
public void setC_Order_ID (int C_Order_ID)
{
if (C_Order_ID <= 0) set_Value (COLUMNNAME_C_Order_ID, null);
 else 
set_Value (COLUMNNAME_C_Order_ID, Integer.valueOf(C_Order_ID));
}
/** Get Order.
@return Order */
public int getC_Order_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Order_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d8f6f4f2-6371-1c64-b6dc-cd148c9eaa7c")
public static String es_PE_FIELD_OfferFunds_Order_Description="Orden de Venta";

@XendraTrl(Identifier="d8f6f4f2-6371-1c64-b6dc-cd148c9eaa7c")
public static String es_PE_FIELD_OfferFunds_Order_Help="La ID de la orden de ventas es un identificador único de la orden de ventas; Ésta es controlada por la secuencia del documento para este tipo de documento.";

@XendraTrl(Identifier="d8f6f4f2-6371-1c64-b6dc-cd148c9eaa7c")
public static String es_PE_FIELD_OfferFunds_Order_Name="Orden de Venta";

@XendraField(AD_Column_ID="C_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9b6d2852-c66f-c1d2-639f-493dddbc9e26",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d8f6f4f2-6371-1c64-b6dc-cd148c9eaa7c")
public static final String FIELDNAME_OfferFunds_Order="d8f6f4f2-6371-1c64-b6dc-cd148c9eaa7c";

@XendraTrl(Identifier="b9c06380-5095-9b27-4820-15d69af0ff06")
public static String es_PE_COLUMN_C_Order_ID_Name="Orden de Venta";

@XendraColumn(AD_Element_ID="cc846c60-90b8-6aad-9d07-b5d0c0328787",ColumnName="C_Order_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b9c06380-5095-9b27-4820-15d69af0ff06",
Synchronized="2017-08-05 16:53:07.0")
/** Column name C_Order_ID */
public static final String COLUMNNAME_C_Order_ID = "C_Order_ID";
/** Set Payment.
@param C_Payment_ID Payment identifier */
public void setC_Payment_ID (int C_Payment_ID)
{
if (C_Payment_ID <= 0) set_Value (COLUMNNAME_C_Payment_ID, null);
 else 
set_Value (COLUMNNAME_C_Payment_ID, Integer.valueOf(C_Payment_ID));
}
/** Get Payment.
@return Payment identifier */
public int getC_Payment_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Payment_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="73e05b66-66f2-5fab-a8d8-c8bae3d3af7d")
public static String es_PE_FIELD_OfferFunds_Payment_Description="Identificador del pago";

@XendraTrl(Identifier="73e05b66-66f2-5fab-a8d8-c8bae3d3af7d")
public static String es_PE_FIELD_OfferFunds_Payment_Help="El pago es un identificador único de este pago.";

@XendraTrl(Identifier="73e05b66-66f2-5fab-a8d8-c8bae3d3af7d")
public static String es_PE_FIELD_OfferFunds_Payment_Name="Pago";

@XendraField(AD_Column_ID="C_Payment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9b6d2852-c66f-c1d2-639f-493dddbc9e26",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="73e05b66-66f2-5fab-a8d8-c8bae3d3af7d")
public static final String FIELDNAME_OfferFunds_Payment="73e05b66-66f2-5fab-a8d8-c8bae3d3af7d";

@XendraTrl(Identifier="9d00a8f1-cf89-4d73-dff2-eec96843ee04")
public static String es_PE_COLUMN_C_Payment_ID_Name="Pago";

@XendraColumn(AD_Element_ID="3ded5658-968e-94c5-207b-eed6f6a7bb43",ColumnName="C_Payment_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9d00a8f1-cf89-4d73-dff2-eec96843ee04",
Synchronized="2017-08-05 16:53:07.0")
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
@XendraTrl(Identifier="c74eadd7-15ca-459c-9cf0-ee4a764b01c6")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c74eadd7-15ca-459c-9cf0-ee4a764b01c6",
Synchronized="2017-08-05 16:53:07.0")
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

@XendraTrl(Identifier="f5abd509-f27c-5062-f3c9-1ca5089a4584")
public static String es_PE_FIELD_OfferFunds_NotCommittedAount_Description="Cantidad todavia no asegurada..";

@XendraTrl(Identifier="f5abd509-f27c-5062-f3c9-1ca5089a4584")
public static String es_PE_FIELD_OfferFunds_NotCommittedAount_Name="Importe no Asegurado";

@XendraField(AD_Column_ID="NonCommittedAmt",IsCentrallyMaintained=true,
AD_Tab_ID="9b6d2852-c66f-c1d2-639f-493dddbc9e26",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f5abd509-f27c-5062-f3c9-1ca5089a4584")
public static final String FIELDNAME_OfferFunds_NotCommittedAount="f5abd509-f27c-5062-f3c9-1ca5089a4584";

@XendraTrl(Identifier="0f392ef3-f570-6653-e492-b018ee70294e")
public static String es_PE_COLUMN_NonCommittedAmt_Name="Importe no Asegurado";

@XendraColumn(AD_Element_ID="0360cc7a-330c-eca3-f2a0-d0e8c2dd1ddb",ColumnName="NonCommittedAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=3,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0f392ef3-f570-6653-e492-b018ee70294e",
Synchronized="2017-08-05 16:53:07.0")
/** Column name NonCommittedAmt */
public static final String COLUMNNAME_NonCommittedAmt = "NonCommittedAmt";
}
