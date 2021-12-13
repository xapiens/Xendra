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
/** Generated Model for AD_AlertRecipient
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_AlertRecipient extends PO
{
/** Standard Constructor
@param ctx context
@param AD_AlertRecipient_ID id
@param trxName transaction
*/
public X_AD_AlertRecipient (Properties ctx, int AD_AlertRecipient_ID, String trxName)
{
super (ctx, AD_AlertRecipient_ID, trxName);
/** if (AD_AlertRecipient_ID == 0)
{
setAD_Alert_ID (0);
setAD_AlertRecipient_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_AlertRecipient (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=592 */
public static int Table_ID=MTable.getTable_ID("AD_AlertRecipient");

@XendraTrl(Identifier="aeb65600-ba69-a246-4207-f05b9a94d154")
public static String es_PE_TAB_AlertRecipient_Description="Destinatario de la Alerta";

@XendraTrl(Identifier="aeb65600-ba69-a246-4207-f05b9a94d154")
public static String es_PE_TAB_AlertRecipient_Name="Destinatario Alerta";

@XendraTab(Name="Alert Recipient",Description="Recipient of the Alert Notification",
Help="You can send the notifications to users or roles",
AD_Window_ID="dc53fc66-0028-1335-3ffe-929e517d2505",SeqNo=30,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="aeb65600-ba69-a246-4207-f05b9a94d154",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_AlertRecipient="aeb65600-ba69-a246-4207-f05b9a94d154";

@XendraTrl(Identifier="9cf80932-3645-b7ad-b5e6-0de2072068b7")
public static String es_PE_TABLE_AD_AlertRecipient_Name="Recipiente de Alertas";

@XendraTable(Name="Alert Recipient",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",
Description="Recipient of the Alert Notification",Help="",TableName="AD_AlertRecipient",
AccessLevel="6",AD_Window_ID="dc53fc66-0028-1335-3ffe-929e517d2505",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="9cf80932-3645-b7ad-b5e6-0de2072068b7",Synchronized="2020-03-03 21:34:51.0")
/** TableName=AD_AlertRecipient */
public static final String Table_Name="AD_AlertRecipient";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_AlertRecipient");

protected BigDecimal accessLevel = BigDecimal.valueOf(6);
/** AccessLevel
@return 6 - System - Client 
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
    Table_ID = MTable.getTable_ID("AD_AlertRecipient");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_AlertRecipient[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Alert.
@param AD_Alert_ID Adempiere Alert */
public void setAD_Alert_ID (int AD_Alert_ID)
{
if (AD_Alert_ID < 1) throw new IllegalArgumentException ("AD_Alert_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Alert_ID, Integer.valueOf(AD_Alert_ID));
}
/** Get Alert.
@return Adempiere Alert */
public int getAD_Alert_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Alert_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="77106793-b007-3339-6873-fc09d0e1740d")
public static String es_PE_FIELD_AlertRecipient_Alert_Name="Alerta";

@XendraTrl(Identifier="77106793-b007-3339-6873-fc09d0e1740d")
public static String es_PE_FIELD_AlertRecipient_Alert_Description="Auditor de alertas.";

@XendraTrl(Identifier="77106793-b007-3339-6873-fc09d0e1740d")
public static String es_PE_FIELD_AlertRecipient_Alert_Help="Adempiere permite definir condiciones de alerta en el sistema para estar informado.";

@XendraField(AD_Column_ID="AD_Alert_ID",IsCentrallyMaintained=true,
AD_Tab_ID="aeb65600-ba69-a246-4207-f05b9a94d154",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="77106793-b007-3339-6873-fc09d0e1740d")
public static final String FIELDNAME_AlertRecipient_Alert="77106793-b007-3339-6873-fc09d0e1740d";

@XendraTrl(Identifier="6d67a062-f4da-6497-ad9e-1a75fee25c29")
public static String es_PE_COLUMN_AD_Alert_ID_Name="Alerta";

@XendraColumn(AD_Element_ID="c46a312a-c548-da5b-0007-0d6935286e68",ColumnName="AD_Alert_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6d67a062-f4da-6497-ad9e-1a75fee25c29",
Synchronized="2020-03-03 21:34:20.0")
/** Column name AD_Alert_ID */
public static final String COLUMNNAME_AD_Alert_ID = "AD_Alert_ID";
/** Set Alert Recipient.
@param AD_AlertRecipient_ID Recipient of the Alert Notification */
public void setAD_AlertRecipient_ID (int AD_AlertRecipient_ID)
{
if (AD_AlertRecipient_ID < 1) throw new IllegalArgumentException ("AD_AlertRecipient_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_AlertRecipient_ID, Integer.valueOf(AD_AlertRecipient_ID));
}
/** Get Alert Recipient.
@return Recipient of the Alert Notification */
public int getAD_AlertRecipient_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_AlertRecipient_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="df1cc2b8-8e67-3411-39b4-904abad85f42")
public static String es_PE_FIELD_AlertRecipient_AlertRecipient_Name="Recipiente de Alertas";

@XendraTrl(Identifier="df1cc2b8-8e67-3411-39b4-904abad85f42")
public static String es_PE_FIELD_AlertRecipient_AlertRecipient_Description="Recipiente de la notificación de alertas.";

@XendraTrl(Identifier="df1cc2b8-8e67-3411-39b4-904abad85f42")
public static String es_PE_FIELD_AlertRecipient_AlertRecipient_Help="Usted puede enviar las notificaciones para usuarios ó roles.";

@XendraField(AD_Column_ID="AD_AlertRecipient_ID",IsCentrallyMaintained=true,
AD_Tab_ID="aeb65600-ba69-a246-4207-f05b9a94d154",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="df1cc2b8-8e67-3411-39b4-904abad85f42")
public static final String FIELDNAME_AlertRecipient_AlertRecipient="df1cc2b8-8e67-3411-39b4-904abad85f42";
/** Column name AD_AlertRecipient_ID */
public static final String COLUMNNAME_AD_AlertRecipient_ID = "AD_AlertRecipient_ID";
/** Set Role.
@param AD_Role_ID Responsibility Role */
public void setAD_Role_ID (int AD_Role_ID)
{
if (AD_Role_ID <= 0) set_Value (COLUMNNAME_AD_Role_ID, null);
 else 
set_Value (COLUMNNAME_AD_Role_ID, Integer.valueOf(AD_Role_ID));
}
/** Get Role.
@return Responsibility Role */
public int getAD_Role_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Role_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="37b44f60-1032-faab-9607-d5dbf100d40f")
public static String es_PE_FIELD_AlertRecipient_Role_Name="Rol";

@XendraTrl(Identifier="37b44f60-1032-faab-9607-d5dbf100d40f")
public static String es_PE_FIELD_AlertRecipient_Role_Description="Rol de responsabilidad";

@XendraTrl(Identifier="37b44f60-1032-faab-9607-d5dbf100d40f")
public static String es_PE_FIELD_AlertRecipient_Role_Help="El Rol determina la seguridad y acceso del usuario que posee este Rol";

@XendraField(AD_Column_ID="AD_Role_ID",IsCentrallyMaintained=true,
AD_Tab_ID="aeb65600-ba69-a246-4207-f05b9a94d154",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="37b44f60-1032-faab-9607-d5dbf100d40f")
public static final String FIELDNAME_AlertRecipient_Role="37b44f60-1032-faab-9607-d5dbf100d40f";

@XendraTrl(Identifier="a19dfbdd-aa9a-26e5-3ac5-5df3e9a08735")
public static String es_PE_COLUMN_AD_Role_ID_Name="Rol";

@XendraColumn(AD_Element_ID="08ffb725-ea75-e55f-f4c5-67ac26f40e2b",ColumnName="AD_Role_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a19dfbdd-aa9a-26e5-3ac5-5df3e9a08735",
Synchronized="2020-03-03 21:34:20.0")
/** Column name AD_Role_ID */
public static final String COLUMNNAME_AD_Role_ID = "AD_Role_ID";
/** Set User/Contact.
@param AD_User_ID User within the system - Internal or Business Partner Contact */
public void setAD_User_ID (int AD_User_ID)
{
if (AD_User_ID <= 0) set_Value (COLUMNNAME_AD_User_ID, null);
 else 
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

@XendraTrl(Identifier="47c56e94-de3f-b9fc-a034-ba0828bdbb23")
public static String es_PE_FIELD_AlertRecipient_UserContact_Name="Usuario";

@XendraTrl(Identifier="47c56e94-de3f-b9fc-a034-ba0828bdbb23")
public static String es_PE_FIELD_AlertRecipient_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="47c56e94-de3f-b9fc-a034-ba0828bdbb23")
public static String es_PE_FIELD_AlertRecipient_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="aeb65600-ba69-a246-4207-f05b9a94d154",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=60,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="47c56e94-de3f-b9fc-a034-ba0828bdbb23")
public static final String FIELDNAME_AlertRecipient_UserContact="47c56e94-de3f-b9fc-a034-ba0828bdbb23";

@XendraTrl(Identifier="50620fcd-8a36-8bc3-cf1d-042d597db686")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="50620fcd-8a36-8bc3-cf1d-042d597db686",
Synchronized="2020-03-03 21:34:20.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
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
@XendraTrl(Identifier="56e46d29-2e76-4ab5-8849-2b1245158726")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="56e46d29-2e76-4ab5-8849-2b1245158726",
Synchronized="2020-03-03 21:34:20.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
}
