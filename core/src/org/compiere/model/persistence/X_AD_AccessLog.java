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
/** Generated Model for AD_AccessLog
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_AccessLog extends PO
{
/** Standard Constructor
@param ctx context
@param AD_AccessLog_ID id
@param trxName transaction
*/
public X_AD_AccessLog (Properties ctx, int AD_AccessLog_ID, String trxName)
{
super (ctx, AD_AccessLog_ID, trxName);
/** if (AD_AccessLog_ID == 0)
{
setAD_AccessLog_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_AccessLog (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=717 */
public static int Table_ID=MTable.getTable_ID("AD_AccessLog");

@XendraTrl(Identifier="f73b632a-3118-a00d-1660-50eead62ff0c")
public static String es_PE_TAB_AccessAudit_Description="Registro del acceso a los datos ó a los recursos";

@XendraTrl(Identifier="f73b632a-3118-a00d-1660-50eead62ff0c")
public static String es_PE_TAB_AccessAudit_Name="Acceso a Log";

@XendraTrl(Identifier="f73b632a-3118-a00d-1660-50eead62ff0c")
public static String es_PE_TAB_AccessAudit_Help="El registro necesita ser permitido/ser escrito explícitamente.";

@XendraTab(Name="Access Audit",Description="Log of Access to data or resources",
Help="Logging needs to be explicitly enabled / written.",
AD_Window_ID="bdfa96a3-e6fe-b3ae-7c6c-d572be595fb7",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=false,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="f73b632a-3118-a00d-1660-50eead62ff0c",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_AccessAudit="f73b632a-3118-a00d-1660-50eead62ff0c";

@XendraTrl(Identifier="20758eef-2b69-3709-8a43-e78a0838aef4")
public static String es_PE_TABLE_AD_AccessLog_Name="Registro de Acceso";

@XendraTable(Name="Access Log",Description="Log of Access to the System",Help="",
TableName="AD_AccessLog",AccessLevel="6",AD_Window_ID="bdfa96a3-e6fe-b3ae-7c6c-d572be595fb7",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="20758eef-2b69-3709-8a43-e78a0838aef4",Synchronized="2017-08-16 11:39:57.0")
/** TableName=AD_AccessLog */
public static final String Table_Name="AD_AccessLog";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_AccessLog");

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
    Table_ID = MTable.getTable_ID("AD_AccessLog");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_AccessLog[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Access Log.
@param AD_AccessLog_ID Log of Access to the System */
public void setAD_AccessLog_ID (int AD_AccessLog_ID)
{
if (AD_AccessLog_ID < 1) throw new IllegalArgumentException ("AD_AccessLog_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_AccessLog_ID, Integer.valueOf(AD_AccessLog_ID));
}
/** Get Access Log.
@return Log of Access to the System */
public int getAD_AccessLog_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_AccessLog_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getAD_AccessLog_ID()));
}

@XendraTrl(Identifier="b56f1ae8-02ab-a276-3586-ffa2abe16264")
public static String es_PE_FIELD_AccessAudit_AccessLog_Description="Registro del acceso al sistema.";

@XendraTrl(Identifier="b56f1ae8-02ab-a276-3586-ffa2abe16264")
public static String es_PE_FIELD_AccessAudit_AccessLog_Help="Registro del acceso al sistema.";

@XendraTrl(Identifier="b56f1ae8-02ab-a276-3586-ffa2abe16264")
public static String es_PE_FIELD_AccessAudit_AccessLog_Name="Registro de Acceso";

@XendraField(AD_Column_ID="AD_AccessLog_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f73b632a-3118-a00d-1660-50eead62ff0c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b56f1ae8-02ab-a276-3586-ffa2abe16264")
public static final String FIELDNAME_AccessAudit_AccessLog="b56f1ae8-02ab-a276-3586-ffa2abe16264";
/** Column name AD_AccessLog_ID */
public static final String COLUMNNAME_AD_AccessLog_ID = "AD_AccessLog_ID";
/** Set Column.
@param AD_Column_ID Column in the table */
public void setAD_Column_ID (int AD_Column_ID)
{
if (AD_Column_ID <= 0) set_Value (COLUMNNAME_AD_Column_ID, null);
 else 
set_Value (COLUMNNAME_AD_Column_ID, Integer.valueOf(AD_Column_ID));
}
/** Get Column.
@return Column in the table */
public int getAD_Column_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Column_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d986ac49-11f8-7eb2-c491-5a073e5b6eb9")
public static String es_PE_FIELD_AccessAudit_Column_Description="Columna en la tabla";

@XendraTrl(Identifier="d986ac49-11f8-7eb2-c491-5a073e5b6eb9")
public static String es_PE_FIELD_AccessAudit_Column_Help="Enlace a la columna base de datos de la tabla";

@XendraTrl(Identifier="d986ac49-11f8-7eb2-c491-5a073e5b6eb9")
public static String es_PE_FIELD_AccessAudit_Column_Name="Columna";

@XendraField(AD_Column_ID="AD_Column_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f73b632a-3118-a00d-1660-50eead62ff0c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d986ac49-11f8-7eb2-c491-5a073e5b6eb9")
public static final String FIELDNAME_AccessAudit_Column="d986ac49-11f8-7eb2-c491-5a073e5b6eb9";

@XendraTrl(Identifier="93841605-4904-be82-633f-92dff6d01865")
public static String es_PE_COLUMN_AD_Column_ID_Name="Columna";

@XendraColumn(AD_Element_ID="a0dcf1ba-2ef3-ca06-ed42-8ae37c632eaf",ColumnName="AD_Column_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="93841605-4904-be82-633f-92dff6d01865",
Synchronized="2017-08-05 16:52:19.0")
/** Column name AD_Column_ID */
public static final String COLUMNNAME_AD_Column_ID = "AD_Column_ID";
/** Set Table.
@param AD_Table_ID Database Table information */
public void setAD_Table_ID (int AD_Table_ID)
{
if (AD_Table_ID <= 0) set_Value (COLUMNNAME_AD_Table_ID, null);
 else 
set_Value (COLUMNNAME_AD_Table_ID, Integer.valueOf(AD_Table_ID));
}
/** Get Table.
@return Database Table information */
public int getAD_Table_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Table_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f753eb1b-dc19-3959-85d8-49c68dd1d044")
public static String es_PE_FIELD_AccessAudit_Table_Description="Tabla para los campos";

@XendraTrl(Identifier="f753eb1b-dc19-3959-85d8-49c68dd1d044")
public static String es_PE_FIELD_AccessAudit_Table_Help="La Tabla indica una tabla en la que reside un campo ó campos.";

@XendraTrl(Identifier="f753eb1b-dc19-3959-85d8-49c68dd1d044")
public static String es_PE_FIELD_AccessAudit_Table_Name="Tabla";

@XendraField(AD_Column_ID="AD_Table_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f73b632a-3118-a00d-1660-50eead62ff0c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f753eb1b-dc19-3959-85d8-49c68dd1d044")
public static final String FIELDNAME_AccessAudit_Table="f753eb1b-dc19-3959-85d8-49c68dd1d044";

@XendraTrl(Identifier="56241bb6-c80e-3290-8c30-d8994ab0bcdb")
public static String es_PE_COLUMN_AD_Table_ID_Name="Tabla";

@XendraColumn(AD_Element_ID="270eeb02-723b-0ecc-7f56-3c67fa71a7f1",ColumnName="AD_Table_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="56241bb6-c80e-3290-8c30-d8994ab0bcdb",
Synchronized="2017-08-05 16:52:19.0")
/** Column name AD_Table_ID */
public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
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

@XendraTrl(Identifier="f0508ec5-bcb7-3dba-b74c-ee612e3837b0")
public static String es_PE_FIELD_AccessAudit_Description_Description="Observación";

@XendraTrl(Identifier="f0508ec5-bcb7-3dba-b74c-ee612e3837b0")
public static String es_PE_FIELD_AccessAudit_Description_Help="Observación";

@XendraTrl(Identifier="f0508ec5-bcb7-3dba-b74c-ee612e3837b0")
public static String es_PE_FIELD_AccessAudit_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="f73b632a-3118-a00d-1660-50eead62ff0c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f0508ec5-bcb7-3dba-b74c-ee612e3837b0")
public static final String FIELDNAME_AccessAudit_Description="f0508ec5-bcb7-3dba-b74c-ee612e3837b0";

@XendraTrl(Identifier="220d7ad5-03a3-f75a-2a3c-73163d0ab741")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="220d7ad5-03a3-f75a-2a3c-73163d0ab741",
Synchronized="2017-08-05 16:52:19.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
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
@XendraTrl(Identifier="a1980bd8-587c-4e42-a025-3f0c508189b0")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a1980bd8-587c-4e42-a025-3f0c508189b0",
Synchronized="2017-08-05 16:52:19.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Record ID.
@param Record_ID Direct internal record ID */
public void setRecord_ID (int Record_ID)
{
if (Record_ID <= 0) set_Value (COLUMNNAME_Record_ID, null);
 else 
set_Value (COLUMNNAME_Record_ID, Integer.valueOf(Record_ID));
}
/** Get Record ID.
@return Direct internal record ID */
public int getRecord_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Record_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b18d9e0a-1054-9208-f240-e835e9d73c6c")
public static String es_PE_FIELD_AccessAudit_RecordID_Description="Identificador de registro interno";

@XendraTrl(Identifier="b18d9e0a-1054-9208-f240-e835e9d73c6c")
public static String es_PE_FIELD_AccessAudit_RecordID_Help="La ID de registro es el identificador único interno de un registro.";

@XendraTrl(Identifier="b18d9e0a-1054-9208-f240-e835e9d73c6c")
public static String es_PE_FIELD_AccessAudit_RecordID_Name="ID de Registro";

@XendraField(AD_Column_ID="Record_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f73b632a-3118-a00d-1660-50eead62ff0c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b18d9e0a-1054-9208-f240-e835e9d73c6c")
public static final String FIELDNAME_AccessAudit_RecordID="b18d9e0a-1054-9208-f240-e835e9d73c6c";

@XendraTrl(Identifier="3552d98e-ce0a-634d-41c4-b878a6cc3084")
public static String es_PE_COLUMN_Record_ID_Name="ID de Registro";

@XendraColumn(AD_Element_ID="86e36e4b-d1dc-2deb-449d-c1f6769e1603",ColumnName="Record_ID",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3552d98e-ce0a-634d-41c4-b878a6cc3084",
Synchronized="2017-08-05 16:52:19.0")
/** Column name Record_ID */
public static final String COLUMNNAME_Record_ID = "Record_ID";
/** Set Remote Addr.
@param Remote_Addr Remote Address */
public void setRemote_Addr (String Remote_Addr)
{
if (Remote_Addr != null && Remote_Addr.length() > 60)
{
log.warning("Length > 60 - truncated");
Remote_Addr = Remote_Addr.substring(0,59);
}
set_Value (COLUMNNAME_Remote_Addr, Remote_Addr);
}
/** Get Remote Addr.
@return Remote Address */
public String getRemote_Addr() 
{
String value = (String)get_Value(COLUMNNAME_Remote_Addr);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="5e038a3d-1d9f-da14-09e5-703f6218e075")
public static String es_PE_FIELD_AccessAudit_RemoteAddr_Description="Dirección remota";

@XendraTrl(Identifier="5e038a3d-1d9f-da14-09e5-703f6218e075")
public static String es_PE_FIELD_AccessAudit_RemoteAddr_Help="La dirección remota indica una dirección alternativa ó externa";

@XendraTrl(Identifier="5e038a3d-1d9f-da14-09e5-703f6218e075")
public static String es_PE_FIELD_AccessAudit_RemoteAddr_Name="Dirección Remota";

@XendraField(AD_Column_ID="Remote_Addr",IsCentrallyMaintained=true,
AD_Tab_ID="f73b632a-3118-a00d-1660-50eead62ff0c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5e038a3d-1d9f-da14-09e5-703f6218e075")
public static final String FIELDNAME_AccessAudit_RemoteAddr="5e038a3d-1d9f-da14-09e5-703f6218e075";

@XendraTrl(Identifier="e90c2523-57a7-e4b2-9bf8-7be5b7bbb695")
public static String es_PE_COLUMN_Remote_Addr_Name="Dirección Remota";

@XendraColumn(AD_Element_ID="b1551fd7-ca8d-4a87-8302-e41caf5553d6",ColumnName="Remote_Addr",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e90c2523-57a7-e4b2-9bf8-7be5b7bbb695",
Synchronized="2017-08-05 16:52:19.0")
/** Column name Remote_Addr */
public static final String COLUMNNAME_Remote_Addr = "Remote_Addr";
/** Set Remote Host.
@param Remote_Host Remote host Info */
public void setRemote_Host (String Remote_Host)
{
if (Remote_Host != null && Remote_Host.length() > 60)
{
log.warning("Length > 60 - truncated");
Remote_Host = Remote_Host.substring(0,59);
}
set_Value (COLUMNNAME_Remote_Host, Remote_Host);
}
/** Get Remote Host.
@return Remote host Info */
public String getRemote_Host() 
{
String value = (String)get_Value(COLUMNNAME_Remote_Host);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="ff15baa3-cc93-128b-9f80-163b83427392")
public static String es_PE_FIELD_AccessAudit_RemoteHost_Name="Host Remoto";

@XendraField(AD_Column_ID="Remote_Host",IsCentrallyMaintained=true,
AD_Tab_ID="f73b632a-3118-a00d-1660-50eead62ff0c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ff15baa3-cc93-128b-9f80-163b83427392")
public static final String FIELDNAME_AccessAudit_RemoteHost="ff15baa3-cc93-128b-9f80-163b83427392";

@XendraTrl(Identifier="2428f2a7-a4be-f85a-359f-a4cc5e975deb")
public static String es_PE_COLUMN_Remote_Host_Name="Host Remoto";

@XendraColumn(AD_Element_ID="eb636ff7-fd5e-fa57-d640-f766bf4e52b2",ColumnName="Remote_Host",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2428f2a7-a4be-f85a-359f-a4cc5e975deb",
Synchronized="2017-08-05 16:52:19.0")
/** Column name Remote_Host */
public static final String COLUMNNAME_Remote_Host = "Remote_Host";
/** Set Reply.
@param Reply Reply or Answer */
public void setReply (String Reply)
{
set_Value (COLUMNNAME_Reply, Reply);
}
/** Get Reply.
@return Reply or Answer */
public String getReply() 
{
String value = (String)get_Value(COLUMNNAME_Reply);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="3bcb9d96-fa9b-d3b7-81c6-8d363929d736")
public static String es_PE_FIELD_AccessAudit_Reply_Description="Replica ó respuesta";

@XendraTrl(Identifier="3bcb9d96-fa9b-d3b7-81c6-8d363929d736")
public static String es_PE_FIELD_AccessAudit_Reply_Name="Replica";

@XendraField(AD_Column_ID="Reply",IsCentrallyMaintained=true,
AD_Tab_ID="f73b632a-3118-a00d-1660-50eead62ff0c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3bcb9d96-fa9b-d3b7-81c6-8d363929d736")
public static final String FIELDNAME_AccessAudit_Reply="3bcb9d96-fa9b-d3b7-81c6-8d363929d736";

@XendraTrl(Identifier="f724c1b8-9b35-d234-3b12-fd5918f081c5")
public static String es_PE_COLUMN_Reply_Name="Replica";

@XendraColumn(AD_Element_ID="5ab8fd46-429f-e870-45f5-9caa4894a3f2",ColumnName="Reply",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f724c1b8-9b35-d234-3b12-fd5918f081c5",
Synchronized="2017-08-05 16:52:19.0")
/** Column name Reply */
public static final String COLUMNNAME_Reply = "Reply";
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
@XendraTrl(Identifier="d60bd5a9-41d4-50e3-5119-8a6252894182")
public static String es_PE_FIELD_AccessAudit_TextMessage_Description="Mensaje de texto";

@XendraTrl(Identifier="d60bd5a9-41d4-50e3-5119-8a6252894182")
public static String es_PE_FIELD_AccessAudit_TextMessage_Name="Mensaje de texto";

@XendraField(AD_Column_ID="TextMsg",IsCentrallyMaintained=true,
AD_Tab_ID="f73b632a-3118-a00d-1660-50eead62ff0c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d60bd5a9-41d4-50e3-5119-8a6252894182")
public static final String FIELDNAME_AccessAudit_TextMessage="d60bd5a9-41d4-50e3-5119-8a6252894182";

@XendraTrl(Identifier="681121d8-0622-8d63-86ad-f095ca281781")
public static String es_PE_COLUMN_TextMsg_Name="Mensaje de texto";

@XendraColumn(AD_Element_ID="377bebfe-238a-1c79-c1a9-13afa4448222",ColumnName="TextMsg",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="681121d8-0622-8d63-86ad-f095ca281781",
Synchronized="2017-08-05 16:52:19.0")
/** Column name TextMsg */
public static final String COLUMNNAME_TextMsg = "TextMsg";
}
