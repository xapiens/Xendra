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
/** Generated Model for C_Subscription_Delivery
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_Subscription_Delivery extends PO
{
/** Standard Constructor
@param ctx context
@param C_Subscription_Delivery_ID id
@param trxName transaction
*/
public X_C_Subscription_Delivery (Properties ctx, int C_Subscription_Delivery_ID, String trxName)
{
super (ctx, C_Subscription_Delivery_ID, trxName);
/** if (C_Subscription_Delivery_ID == 0)
{
setC_Subscription_Delivery_ID (0);
setC_Subscription_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_Subscription_Delivery (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=667 */
public static int Table_ID=MTable.getTable_ID("C_Subscription_Delivery");

@XendraTrl(Identifier="9ccce7b5-cd18-4298-2e31-cd13a26a2a5f")
public static String es_PE_TAB_Delivery_Description="Expediente opcional de la entrega para una suscripción.";

@XendraTrl(Identifier="9ccce7b5-cd18-4298-2e31-cd13a26a2a5f")
public static String es_PE_TAB_Delivery_Name="Entrega";

@XendraTrl(Identifier="9ccce7b5-cd18-4298-2e31-cd13a26a2a5f")
public static String es_PE_TAB_Delivery_Help="Expediente de las entregas para una suscripción.";

@XendraTab(Name="Delivery",Description="Optional Delivery Record for a Subscription",
Help="Record of deliveries for a subscription",AD_Window_ID="373de6ec-d5d0-3388-abbd-f4ba4739d419",
SeqNo=20,TabLevel=1,IsSingleRow=false,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="",HasTree=false,WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="9ccce7b5-cd18-4298-2e31-cd13a26a2a5f",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Delivery="9ccce7b5-cd18-4298-2e31-cd13a26a2a5f";

@XendraTrl(Identifier="f20ab1b1-3c23-4c8c-1037-ced03f6dd960")
public static String es_PE_TABLE_C_Subscription_Delivery_Name="Liberación de Suscripción ";


@XendraTable(Name="Subscription Delivery",
Description="Optional Delivery Record for a Subscription",Help="",
TableName="C_Subscription_Delivery",AccessLevel="3",
AD_Window_ID="373de6ec-d5d0-3388-abbd-f4ba4739d419",AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.commercial",Identifier="f20ab1b1-3c23-4c8c-1037-ced03f6dd960",
Synchronized="2017-08-16 11:42:30.0")
/** TableName=C_Subscription_Delivery */
public static final String Table_Name="C_Subscription_Delivery";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_Subscription_Delivery");

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
    Table_ID = MTable.getTable_ID("C_Subscription_Delivery");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_Subscription_Delivery[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Subscription Delivery.
@param C_Subscription_Delivery_ID Optional Delivery Record for a Subscription */
public void setC_Subscription_Delivery_ID (int C_Subscription_Delivery_ID)
{
if (C_Subscription_Delivery_ID < 1) throw new IllegalArgumentException ("C_Subscription_Delivery_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Subscription_Delivery_ID, Integer.valueOf(C_Subscription_Delivery_ID));
}
/** Get Subscription Delivery.
@return Optional Delivery Record for a Subscription */
public int getC_Subscription_Delivery_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Subscription_Delivery_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getC_Subscription_Delivery_ID()));
}

@XendraTrl(Identifier="c55540e2-1868-968f-2ef1-910d21234994")
public static String es_PE_FIELD_Delivery_SubscriptionDelivery_Description="Campo opcional para suscripción";

@XendraTrl(Identifier="c55540e2-1868-968f-2ef1-910d21234994")
public static String es_PE_FIELD_Delivery_SubscriptionDelivery_Name="Liberación de Suscripción ";

@XendraField(AD_Column_ID="C_Subscription_Delivery_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9ccce7b5-cd18-4298-2e31-cd13a26a2a5f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c55540e2-1868-968f-2ef1-910d21234994")
public static final String FIELDNAME_Delivery_SubscriptionDelivery="c55540e2-1868-968f-2ef1-910d21234994";
/** Column name C_Subscription_Delivery_ID */
public static final String COLUMNNAME_C_Subscription_Delivery_ID = "C_Subscription_Delivery_ID";
/** Set Subscription.
@param C_Subscription_ID Subscription of a Business Partner of a Product to renew */
public void setC_Subscription_ID (int C_Subscription_ID)
{
if (C_Subscription_ID < 1) throw new IllegalArgumentException ("C_Subscription_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Subscription_ID, Integer.valueOf(C_Subscription_ID));
}
/** Get Subscription.
@return Subscription of a Business Partner of a Product to renew */
public int getC_Subscription_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Subscription_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9cda2a2d-6843-1417-631e-82ced18d0266")
public static String es_PE_FIELD_Delivery_Subscription_Description="Suscripción del socio de negocio para renovar producto.";

@XendraTrl(Identifier="9cda2a2d-6843-1417-631e-82ced18d0266")
public static String es_PE_FIELD_Delivery_Subscription_Help="Suscripción del socio de negocio para renovar producto.";

@XendraTrl(Identifier="9cda2a2d-6843-1417-631e-82ced18d0266")
public static String es_PE_FIELD_Delivery_Subscription_Name="Suscripción";

@XendraField(AD_Column_ID="C_Subscription_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9ccce7b5-cd18-4298-2e31-cd13a26a2a5f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9cda2a2d-6843-1417-631e-82ced18d0266")
public static final String FIELDNAME_Delivery_Subscription="9cda2a2d-6843-1417-631e-82ced18d0266";

@XendraTrl(Identifier="7bed0171-c8f9-976d-f843-aa70030515b3")
public static String es_PE_COLUMN_C_Subscription_ID_Name="Suscripción";

@XendraColumn(AD_Element_ID="de85bb82-20ef-79b0-a018-c7dd985abc6c",ColumnName="C_Subscription_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7bed0171-c8f9-976d-f843-aa70030515b3",
Synchronized="2017-08-05 16:54:27.0")
/** Column name C_Subscription_ID */
public static final String COLUMNNAME_C_Subscription_ID = "C_Subscription_ID";
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
@XendraTrl(Identifier="62d358e3-3215-43c7-9546-c628d5a00aa6")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="62d358e3-3215-43c7-9546-c628d5a00aa6",
Synchronized="2017-08-05 16:54:27.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
}
