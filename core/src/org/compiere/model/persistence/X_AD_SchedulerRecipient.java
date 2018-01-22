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
/** Generated Model for AD_SchedulerRecipient
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_SchedulerRecipient extends PO
{
/** Standard Constructor
@param ctx context
@param AD_SchedulerRecipient_ID id
@param trxName transaction
*/
public X_AD_SchedulerRecipient (Properties ctx, int AD_SchedulerRecipient_ID, String trxName)
{
super (ctx, AD_SchedulerRecipient_ID, trxName);
/** if (AD_SchedulerRecipient_ID == 0)
{
setAD_Scheduler_ID (0);
setAD_SchedulerRecipient_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_SchedulerRecipient (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=704 */
public static int Table_ID=MTable.getTable_ID("AD_SchedulerRecipient");

@XendraTrl(Identifier="9570eec2-9583-06a0-9c2b-5054e0aa33ec")
public static String es_PE_TAB_SchedulerRecipient_Description="Recipiente de la notificación de agenda";

@XendraTrl(Identifier="9570eec2-9583-06a0-9c2b-5054e0aa33ec")
public static String es_PE_TAB_SchedulerRecipient_Name="Recipiente de Agenda";

@XendraTrl(Identifier="9570eec2-9583-06a0-9c2b-5054e0aa33ec")
public static String es_PE_TAB_SchedulerRecipient_Help="Usted puede enviar las notificaciones a los usuarios ó roles.";

@XendraTab(Name="Scheduler Recipient",Description="Recipient of the Scheduler Notification",
Help="You can send the notifications to users or roles",
AD_Window_ID="2d2f8ce7-abbe-ad81-0373-06f27fbe1596",SeqNo=40,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="9570eec2-9583-06a0-9c2b-5054e0aa33ec",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_SchedulerRecipient="9570eec2-9583-06a0-9c2b-5054e0aa33ec";

@XendraTrl(Identifier="a5bcc2a5-66a2-dd85-e3af-d6f81dc20356")
public static String es_PE_TABLE_AD_SchedulerRecipient_Name="Recipiente del Programador";


@XendraTable(Name="Scheduler Recipient",Description="Recipient of the Scheduler Notification",
Help="",TableName="AD_SchedulerRecipient",AccessLevel="6",
AD_Window_ID="2d2f8ce7-abbe-ad81-0373-06f27fbe1596",AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.dictionary",Identifier="a5bcc2a5-66a2-dd85-e3af-d6f81dc20356",
Synchronized="2017-08-16 11:40:59.0")
/** TableName=AD_SchedulerRecipient */
public static final String Table_Name="AD_SchedulerRecipient";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_SchedulerRecipient");

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
    Table_ID = MTable.getTable_ID("AD_SchedulerRecipient");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_SchedulerRecipient[").append(get_ID()).append("]");
return sb.toString();
}
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

@XendraTrl(Identifier="58344c98-a1aa-71d0-0b77-bd333b1139b3")
public static String es_PE_FIELD_SchedulerRecipient_Role_Description="Rol de responsabilidad";

@XendraTrl(Identifier="58344c98-a1aa-71d0-0b77-bd333b1139b3")
public static String es_PE_FIELD_SchedulerRecipient_Role_Help="El Rol determina la seguridad y acceso del usuario que posee este Rol";

@XendraTrl(Identifier="58344c98-a1aa-71d0-0b77-bd333b1139b3")
public static String es_PE_FIELD_SchedulerRecipient_Role_Name="Rol";

@XendraField(AD_Column_ID="AD_Role_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9570eec2-9583-06a0-9c2b-5054e0aa33ec",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="58344c98-a1aa-71d0-0b77-bd333b1139b3")
public static final String FIELDNAME_SchedulerRecipient_Role="58344c98-a1aa-71d0-0b77-bd333b1139b3";

@XendraTrl(Identifier="ca848180-8698-5e3d-e468-4f1dc74e8872")
public static String es_PE_COLUMN_AD_Role_ID_Name="Rol";

@XendraColumn(AD_Element_ID="08ffb725-ea75-e55f-f4c5-67ac26f40e2b",ColumnName="AD_Role_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ca848180-8698-5e3d-e468-4f1dc74e8872",
Synchronized="2017-08-05 16:52:50.0")
/** Column name AD_Role_ID */
public static final String COLUMNNAME_AD_Role_ID = "AD_Role_ID";
/** Set Scheduler.
@param AD_Scheduler_ID Schedule Processes */
public void setAD_Scheduler_ID (int AD_Scheduler_ID)
{
if (AD_Scheduler_ID < 1) throw new IllegalArgumentException ("AD_Scheduler_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Scheduler_ID, Integer.valueOf(AD_Scheduler_ID));
}
/** Get Scheduler.
@return Schedule Processes */
public int getAD_Scheduler_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Scheduler_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="eab2961b-9551-2d36-00a0-d428e3c5b58d")
public static String es_PE_FIELD_SchedulerRecipient_Scheduler_Description="Programación de procesos";

@XendraTrl(Identifier="eab2961b-9551-2d36-00a0-d428e3c5b58d")
public static String es_PE_FIELD_SchedulerRecipient_Scheduler_Help="Programación de procesos para ser ejecutada la sincronización.";

@XendraTrl(Identifier="eab2961b-9551-2d36-00a0-d428e3c5b58d")
public static String es_PE_FIELD_SchedulerRecipient_Scheduler_Name="Programación";

@XendraField(AD_Column_ID="AD_Scheduler_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9570eec2-9583-06a0-9c2b-5054e0aa33ec",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="eab2961b-9551-2d36-00a0-d428e3c5b58d")
public static final String FIELDNAME_SchedulerRecipient_Scheduler="eab2961b-9551-2d36-00a0-d428e3c5b58d";

@XendraTrl(Identifier="9ae28967-4f92-6498-05a6-1dfcb542ab68")
public static String es_PE_COLUMN_AD_Scheduler_ID_Name="Programación";

@XendraColumn(AD_Element_ID="7c943646-ecd0-4485-0c20-0616c91ca579",ColumnName="AD_Scheduler_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9ae28967-4f92-6498-05a6-1dfcb542ab68",
Synchronized="2017-08-05 16:52:50.0")
/** Column name AD_Scheduler_ID */
public static final String COLUMNNAME_AD_Scheduler_ID = "AD_Scheduler_ID";
/** Set Scheduler Recipient.
@param AD_SchedulerRecipient_ID Recipient of the Scheduler Notification */
public void setAD_SchedulerRecipient_ID (int AD_SchedulerRecipient_ID)
{
if (AD_SchedulerRecipient_ID < 1) throw new IllegalArgumentException ("AD_SchedulerRecipient_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_SchedulerRecipient_ID, Integer.valueOf(AD_SchedulerRecipient_ID));
}
/** Get Scheduler Recipient.
@return Recipient of the Scheduler Notification */
public int getAD_SchedulerRecipient_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_SchedulerRecipient_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7a6def77-261a-bf9f-1e58-34a9640780ec")
public static String es_PE_FIELD_SchedulerRecipient_SchedulerRecipient_Description="Recipiente de la notificación del programador";

@XendraTrl(Identifier="7a6def77-261a-bf9f-1e58-34a9640780ec")
public static String es_PE_FIELD_SchedulerRecipient_SchedulerRecipient_Help="Usted puede enviar las notificaciones para usuarios ó roles.";

@XendraTrl(Identifier="7a6def77-261a-bf9f-1e58-34a9640780ec")
public static String es_PE_FIELD_SchedulerRecipient_SchedulerRecipient_Name="Recipiente del Programador";

@XendraField(AD_Column_ID="AD_SchedulerRecipient_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9570eec2-9583-06a0-9c2b-5054e0aa33ec",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7a6def77-261a-bf9f-1e58-34a9640780ec")
public static final String FIELDNAME_SchedulerRecipient_SchedulerRecipient="7a6def77-261a-bf9f-1e58-34a9640780ec";
/** Column name AD_SchedulerRecipient_ID */
public static final String COLUMNNAME_AD_SchedulerRecipient_ID = "AD_SchedulerRecipient_ID";
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

@XendraTrl(Identifier="d61bef55-a097-36ae-19d0-1f2f458c3563")
public static String es_PE_FIELD_SchedulerRecipient_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="d61bef55-a097-36ae-19d0-1f2f458c3563")
public static String es_PE_FIELD_SchedulerRecipient_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraTrl(Identifier="d61bef55-a097-36ae-19d0-1f2f458c3563")
public static String es_PE_FIELD_SchedulerRecipient_UserContact_Name="Usuario";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9570eec2-9583-06a0-9c2b-5054e0aa33ec",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=60,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d61bef55-a097-36ae-19d0-1f2f458c3563")
public static final String FIELDNAME_SchedulerRecipient_UserContact="d61bef55-a097-36ae-19d0-1f2f458c3563";

@XendraTrl(Identifier="2b5947a8-58b3-786e-30d4-01931e0ddd9d")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2b5947a8-58b3-786e-30d4-01931e0ddd9d",
Synchronized="2017-08-05 16:52:50.0")
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
@XendraTrl(Identifier="e4de2e86-e46b-4232-b0c8-bc128cbaf7a7")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e4de2e86-e46b-4232-b0c8-bc128cbaf7a7",
Synchronized="2017-08-05 16:52:50.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
}
