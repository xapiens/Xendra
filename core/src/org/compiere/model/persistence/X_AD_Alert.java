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
/** Generated Model for AD_Alert
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Alert extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Alert_ID id
@param trxName transaction
*/
public X_AD_Alert (Properties ctx, int AD_Alert_ID, String trxName)
{
super (ctx, AD_Alert_ID, trxName);
/** if (AD_Alert_ID == 0)
{
setAD_Alert_ID (0);
setAD_AlertProcessor_ID (0);
setAlertMessage (null);
setAlertSubject (null);
setEnforceClientSecurity (true);	
// Y
setEnforceRoleSecurity (true);	
// Y
setIsValid (true);	
// Y
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Alert (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=594 */
public static int Table_ID=MTable.getTable_ID("AD_Alert");

@XendraTrl(Identifier="c1abfa56-5539-bec4-77c7-a67685825e6d")
public static String es_PE_TAB_Alert_Description="Adempiere Alerta";

@XendraTrl(Identifier="c1abfa56-5539-bec4-77c7-a67685825e6d")
public static String es_PE_TAB_Alert_Name="Alerta";

@XendraTrl(Identifier="c1abfa56-5539-bec4-77c7-a67685825e6d")
public static String es_PE_TAB_Alert_Help="Adempiere Alerta permíte definir condiciones de sistema que usted desea ser alertado";

@XendraTab(Name="Alert",Description="Adempiere Alert",
Help="Adempiere Alerts allow you define system conditions you want to be alerted of.",
AD_Window_ID="dc53fc66-0028-1335-3ffe-929e517d2505",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="c1abfa56-5539-bec4-77c7-a67685825e6d",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Alert="c1abfa56-5539-bec4-77c7-a67685825e6d";

@XendraTrl(Identifier="d72423a6-187a-8059-3f90-5062d257e940")
public static String es_PE_TABLE_AD_Alert_Name="Alerta";

@XendraTable(Name="Alert",Description="Adempiere Alert",Help="",TableName="AD_Alert",
AccessLevel="6",AD_Window_ID="dc53fc66-0028-1335-3ffe-929e517d2505",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=140,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="d72423a6-187a-8059-3f90-5062d257e940",Synchronized="2017-08-16 11:39:57.0")
/** TableName=AD_Alert */
public static final String Table_Name="AD_Alert";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Alert");

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
    Table_ID = MTable.getTable_ID("AD_Alert");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Alert[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="1ac6e4e7-2d5a-6ddd-14d3-ccbca605a041")
public static String es_PE_FIELD_Alert_Alert_Description="Auditor de alertas.";

@XendraTrl(Identifier="1ac6e4e7-2d5a-6ddd-14d3-ccbca605a041")
public static String es_PE_FIELD_Alert_Alert_Help="Adempiere permite definir condiciones de alerta en el sistema para estar informado.";

@XendraTrl(Identifier="1ac6e4e7-2d5a-6ddd-14d3-ccbca605a041")
public static String es_PE_FIELD_Alert_Alert_Name="Alerta";
@XendraField(AD_Column_ID="AD_Alert_ID",
IsCentrallyMaintained=true,AD_Tab_ID="c1abfa56-5539-bec4-77c7-a67685825e6d",AD_FieldGroup_ID="",
IsDisplayed=false,DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="1ac6e4e7-2d5a-6ddd-14d3-ccbca605a041")
public static final String FIELDNAME_Alert_Alert="1ac6e4e7-2d5a-6ddd-14d3-ccbca605a041";
/** Column name AD_Alert_ID */
public static final String COLUMNNAME_AD_Alert_ID = "AD_Alert_ID";
/** Set Alert Processor.
@param AD_AlertProcessor_ID Alert Processor/Server Parameter */
public void setAD_AlertProcessor_ID (int AD_AlertProcessor_ID)
{
if (AD_AlertProcessor_ID < 1) throw new IllegalArgumentException ("AD_AlertProcessor_ID is mandatory.");
set_Value (COLUMNNAME_AD_AlertProcessor_ID, Integer.valueOf(AD_AlertProcessor_ID));
}
/** Get Alert Processor.
@return Alert Processor/Server Parameter */
public int getAD_AlertProcessor_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_AlertProcessor_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="cc460359-d41c-d1ad-1647-c7e65432b76f")
public static String es_PE_FIELD_Alert_AlertProcessor_Description="Procesador de alertas / Parámetros del servidor.";

@XendraTrl(Identifier="cc460359-d41c-d1ad-1647-c7e65432b76f")
public static String es_PE_FIELD_Alert_AlertProcessor_Help="Procesador de alertas / Parámetros del servidor.";

@XendraTrl(Identifier="cc460359-d41c-d1ad-1647-c7e65432b76f")
public static String es_PE_FIELD_Alert_AlertProcessor_Name="Procesador de Alertas";

@XendraField(AD_Column_ID="AD_AlertProcessor_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c1abfa56-5539-bec4-77c7-a67685825e6d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cc460359-d41c-d1ad-1647-c7e65432b76f")
public static final String FIELDNAME_Alert_AlertProcessor="cc460359-d41c-d1ad-1647-c7e65432b76f";

@XendraTrl(Identifier="a0d4d02d-6fb6-1597-5496-0a359cf6352b")
public static String es_PE_COLUMN_AD_AlertProcessor_ID_Name="Procesador de Alertas";

@XendraColumn(AD_Element_ID="aedb6236-a004-ab2b-7a1e-e0ed29e6d502",
ColumnName="AD_AlertProcessor_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="a0d4d02d-6fb6-1597-5496-0a359cf6352b",Synchronized="2017-08-05 16:52:20.0")
/** Column name AD_AlertProcessor_ID */
public static final String COLUMNNAME_AD_AlertProcessor_ID = "AD_AlertProcessor_ID";
/** Set Alert Message.
@param AlertMessage Message of the Alert */
public void setAlertMessage (String AlertMessage)
{
if (AlertMessage == null) throw new IllegalArgumentException ("AlertMessage is mandatory.");
set_Value (COLUMNNAME_AlertMessage, AlertMessage);
}
/** Get Alert Message.
@return Message of the Alert */
public String getAlertMessage() 
{
String value = (String)get_Value(COLUMNNAME_AlertMessage);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="0addf319-da19-6070-7c11-fb2f531957c3")
public static String es_PE_FIELD_Alert_AlertMessage_Description="Menseje de alerta";

@XendraTrl(Identifier="0addf319-da19-6070-7c11-fb2f531957c3")
public static String es_PE_FIELD_Alert_AlertMessage_Help="El mensaje de el mail se envia para la alerta.";

@XendraTrl(Identifier="0addf319-da19-6070-7c11-fb2f531957c3")
public static String es_PE_FIELD_Alert_AlertMessage_Name="Mensaje de Alerta";

@XendraField(AD_Column_ID="AlertMessage",IsCentrallyMaintained=true,
AD_Tab_ID="c1abfa56-5539-bec4-77c7-a67685825e6d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0addf319-da19-6070-7c11-fb2f531957c3")
public static final String FIELDNAME_Alert_AlertMessage="0addf319-da19-6070-7c11-fb2f531957c3";

@XendraTrl(Identifier="7490f306-f704-eabc-df56-5923eaf4368d")
public static String es_PE_COLUMN_AlertMessage_Name="Mensaje de Alerta";

@XendraColumn(AD_Element_ID="436dcbb4-645f-9118-28aa-91eec16c8aed",ColumnName="AlertMessage",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7490f306-f704-eabc-df56-5923eaf4368d",
Synchronized="2017-08-05 16:52:20.0")
/** Column name AlertMessage */
public static final String COLUMNNAME_AlertMessage = "AlertMessage";
/** Set Alert Subject.
@param AlertSubject Subject of the Alert */
public void setAlertSubject (String AlertSubject)
{
if (AlertSubject == null) throw new IllegalArgumentException ("AlertSubject is mandatory.");
if (AlertSubject.length() > 60)
{
log.warning("Length > 60 - truncated");
AlertSubject = AlertSubject.substring(0,59);
}
set_Value (COLUMNNAME_AlertSubject, AlertSubject);
}
/** Get Alert Subject.
@return Subject of the Alert */
public String getAlertSubject() 
{
String value = (String)get_Value(COLUMNNAME_AlertSubject);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="cdfe466b-d55c-7f67-fcfd-2325a46adf7b")
public static String es_PE_FIELD_Alert_AlertSubject_Description="Asunto de la Alerta";

@XendraTrl(Identifier="cdfe466b-d55c-7f67-fcfd-2325a46adf7b")
public static String es_PE_FIELD_Alert_AlertSubject_Help="El tema del mensaje del mail enviado para la alarma";

@XendraTrl(Identifier="cdfe466b-d55c-7f67-fcfd-2325a46adf7b")
public static String es_PE_FIELD_Alert_AlertSubject_Name="Asunto de la Alerta";

@XendraField(AD_Column_ID="AlertSubject",IsCentrallyMaintained=true,
AD_Tab_ID="c1abfa56-5539-bec4-77c7-a67685825e6d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cdfe466b-d55c-7f67-fcfd-2325a46adf7b")
public static final String FIELDNAME_Alert_AlertSubject="cdfe466b-d55c-7f67-fcfd-2325a46adf7b";

@XendraTrl(Identifier="d363682d-de6b-53e2-a075-581e14821e78")
public static String es_PE_COLUMN_AlertSubject_Name="Asunto de la Alerta";

@XendraColumn(AD_Element_ID="65c59415-e138-847d-8fb5-07db1692831a",ColumnName="AlertSubject",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d363682d-de6b-53e2-a075-581e14821e78",
Synchronized="2017-08-05 16:52:20.0")
/** Column name AlertSubject */
public static final String COLUMNNAME_AlertSubject = "AlertSubject";
/** Set Description.
@param Description Optional short DESCRIPTION of the record */
public void setDescription (String Description)
{
if (Description != null && Description.length() > 255)
{
log.warning("Length > 255 - truncated");
Description = Description.substring(0,254);
}
set_Value (COLUMNNAME_Description, Description);
}
/** Get Description.
@return Optional short DESCRIPTION of the record */
public String getDescription() 
{
String value = (String)get_Value(COLUMNNAME_Description);
if (value == null)
  return "";
if (value.contains("\""))
  value = value.replaceAll("\"","'");
if (value.contains("\n"))
  value = value.replaceAll("\n"," ");
if (value.contains(";"))
  value = value.replaceAll(";",":");
return value;
}

@XendraTrl(Identifier="32f381b2-1cb8-cd6e-71d3-91ecf65ae7d9")
public static String es_PE_FIELD_Alert_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="32f381b2-1cb8-cd6e-71d3-91ecf65ae7d9")
public static String es_PE_FIELD_Alert_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="32f381b2-1cb8-cd6e-71d3-91ecf65ae7d9")
public static String es_PE_FIELD_Alert_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="c1abfa56-5539-bec4-77c7-a67685825e6d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="32f381b2-1cb8-cd6e-71d3-91ecf65ae7d9")
public static final String FIELDNAME_Alert_Description="32f381b2-1cb8-cd6e-71d3-91ecf65ae7d9";

@XendraTrl(Identifier="d4d0071b-b4e1-509a-51c7-19c9e1c230d6")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d4d0071b-b4e1-509a-51c7-19c9e1c230d6",
Synchronized="2017-08-05 16:52:20.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Enforce Client Security.
@param EnforceClientSecurity Send alerts to recipient only if the client security rules of the role allows */
public void setEnforceClientSecurity (boolean EnforceClientSecurity)
{
set_Value (COLUMNNAME_EnforceClientSecurity, Boolean.valueOf(EnforceClientSecurity));
}
/** Get Enforce Client Security.
@return Send alerts to recipient only if the client security rules of the role allows */
public boolean isEnforceClientSecurity() 
{
Object oo = get_Value(COLUMNNAME_EnforceClientSecurity);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="35d4ca5c-54c2-e60a-4253-9b03671494e4")
public static String es_PE_FIELD_Alert_EnforceClientSecurity_Description="Envie las alertas al recipiente solo si las reglas de seguridad del cliente lo permite.";

@XendraTrl(Identifier="35d4ca5c-54c2-e60a-4253-9b03671494e4")
public static String es_PE_FIELD_Alert_EnforceClientSecurity_Name="Seguridad de Cliente Forzosa";

@XendraField(AD_Column_ID="EnforceClientSecurity",IsCentrallyMaintained=true,
AD_Tab_ID="c1abfa56-5539-bec4-77c7-a67685825e6d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="35d4ca5c-54c2-e60a-4253-9b03671494e4")
public static final String FIELDNAME_Alert_EnforceClientSecurity="35d4ca5c-54c2-e60a-4253-9b03671494e4";

@XendraTrl(Identifier="12498451-f6bb-51fa-3f0a-0faf5f4baf90")
public static String es_PE_COLUMN_EnforceClientSecurity_Name="Seguridad de Cliente Forzosa";

@XendraColumn(AD_Element_ID="598343dd-9027-ed7a-5765-beb21d07b10d",
ColumnName="EnforceClientSecurity",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="Y",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="12498451-f6bb-51fa-3f0a-0faf5f4baf90",Synchronized="2017-08-05 16:52:20.0")
/** Column name EnforceClientSecurity */
public static final String COLUMNNAME_EnforceClientSecurity = "EnforceClientSecurity";
/** Set Enforce Role Security.
@param EnforceRoleSecurity Send alerts to recipient only if the data security rules of the role allows */
public void setEnforceRoleSecurity (boolean EnforceRoleSecurity)
{
set_Value (COLUMNNAME_EnforceRoleSecurity, Boolean.valueOf(EnforceRoleSecurity));
}
/** Get Enforce Role Security.
@return Send alerts to recipient only if the data security rules of the role allows */
public boolean isEnforceRoleSecurity() 
{
Object oo = get_Value(COLUMNNAME_EnforceRoleSecurity);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="33e395e2-9034-2989-9440-248477e8448c")
public static String es_PE_FIELD_Alert_EnforceRoleSecurity_Description="Enviar alertas para recipiente solamente si las reglas de la seguridad de datos de rol lo permiten.";

@XendraTrl(Identifier="33e395e2-9034-2989-9440-248477e8448c")
public static String es_PE_FIELD_Alert_EnforceRoleSecurity_Name="Regla de Seguridad Forzosa";

@XendraField(AD_Column_ID="EnforceRoleSecurity",IsCentrallyMaintained=true,
AD_Tab_ID="c1abfa56-5539-bec4-77c7-a67685825e6d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="33e395e2-9034-2989-9440-248477e8448c")
public static final String FIELDNAME_Alert_EnforceRoleSecurity="33e395e2-9034-2989-9440-248477e8448c";

@XendraTrl(Identifier="e3e0858f-893b-2784-7a42-fafd2a03ef4d")
public static String es_PE_COLUMN_EnforceRoleSecurity_Name="Regla de Seguridad Forzosa";

@XendraColumn(AD_Element_ID="d745c8c7-11cc-388f-d11b-cb7c0b022820",
ColumnName="EnforceRoleSecurity",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="Y",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e3e0858f-893b-2784-7a42-fafd2a03ef4d",Synchronized="2017-08-05 16:52:20.0")
/** Column name EnforceRoleSecurity */
public static final String COLUMNNAME_EnforceRoleSecurity = "EnforceRoleSecurity";
/** Set Comment/Help.
@param Help Comment or Hint */
public void setHelp (String Help)
{
set_Value (COLUMNNAME_Help, Help);
}
/** Get Comment/Help.
@return Comment or Hint */
public String getHelp() 
{
String value = (String)get_Value(COLUMNNAME_Help);
if (value == null)
  return "";
if (value.contains("\""))
  value = value.replaceAll("\"","'");
if (value.contains("\n"))
  value = value.replaceAll("\n"," ");
if (value.contains(";"))
  value = value.replaceAll(";",":");
return value;
}

@XendraTrl(Identifier="b51c5bda-6728-425b-9844-93ec87705a3f")
public static String es_PE_FIELD_Alert_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="b51c5bda-6728-425b-9844-93ec87705a3f")
public static String es_PE_FIELD_Alert_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="b51c5bda-6728-425b-9844-93ec87705a3f")
public static String es_PE_FIELD_Alert_CommentHelp_Name="Ayuda";
@XendraField(AD_Column_ID="Help",
IsCentrallyMaintained=true,AD_Tab_ID="c1abfa56-5539-bec4-77c7-a67685825e6d",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="b51c5bda-6728-425b-9844-93ec87705a3f")
public static final String FIELDNAME_Alert_CommentHelp="b51c5bda-6728-425b-9844-93ec87705a3f";

@XendraTrl(Identifier="f2e2977f-e759-a91f-0fc9-e55e21b2d7b8")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f2e2977f-e759-a91f-0fc9-e55e21b2d7b8",
Synchronized="2017-08-05 16:52:20.0")
/** Column name Help */
public static final String COLUMNNAME_Help = "Help";
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
@XendraTrl(Identifier="13335d92-dd04-4ca4-8d4e-721fe3b13e38")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="13335d92-dd04-4ca4-8d4e-721fe3b13e38",
Synchronized="2017-08-05 16:52:20.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Valid.
@param IsValid Element is valid */
public void setIsValid (boolean IsValid)
{
set_Value (COLUMNNAME_IsValid, Boolean.valueOf(IsValid));
}
/** Get Valid.
@return Element is valid */
public boolean isValid() 
{
Object oo = get_Value(COLUMNNAME_IsValid);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="e17fac73-a49a-e6b7-1af6-1a478c37a8f4")
public static String es_PE_FIELD_Alert_Valid_Description="El elemento es valido";

@XendraTrl(Identifier="e17fac73-a49a-e6b7-1af6-1a478c37a8f4")
public static String es_PE_FIELD_Alert_Valid_Help="El elemento pasado es el cheque de la validación";

@XendraTrl(Identifier="e17fac73-a49a-e6b7-1af6-1a478c37a8f4")
public static String es_PE_FIELD_Alert_Valid_Name="Valido";
@XendraField(AD_Column_ID="IsValid",
IsCentrallyMaintained=true,AD_Tab_ID="c1abfa56-5539-bec4-77c7-a67685825e6d",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="e17fac73-a49a-e6b7-1af6-1a478c37a8f4")
public static final String FIELDNAME_Alert_Valid="e17fac73-a49a-e6b7-1af6-1a478c37a8f4";

@XendraTrl(Identifier="4eddabbc-12fa-6db7-c720-d605fca61d7f")
public static String es_PE_COLUMN_IsValid_Name="Valido";

@XendraColumn(AD_Element_ID="394c3099-1638-2f07-2e14-7bd38bb8ad25",ColumnName="IsValid",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4eddabbc-12fa-6db7-c720-d605fca61d7f",
Synchronized="2017-08-05 16:52:20.0")
/** Column name IsValid */
public static final String COLUMNNAME_IsValid = "IsValid";
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

@XendraTrl(Identifier="a2fb307c-2800-00d4-1a80-135598b38224")
public static String es_PE_FIELD_Alert_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="a2fb307c-2800-00d4-1a80-135598b38224")
public static String es_PE_FIELD_Alert_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="a2fb307c-2800-00d4-1a80-135598b38224")
public static String es_PE_FIELD_Alert_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="c1abfa56-5539-bec4-77c7-a67685825e6d",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="a2fb307c-2800-00d4-1a80-135598b38224")
public static final String FIELDNAME_Alert_Name="a2fb307c-2800-00d4-1a80-135598b38224";

@XendraTrl(Identifier="bb65034f-a569-3354-49e3-29b9e24ddec3")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bb65034f-a569-3354-49e3-29b9e24ddec3",
Synchronized="2017-08-05 16:52:20.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
}
