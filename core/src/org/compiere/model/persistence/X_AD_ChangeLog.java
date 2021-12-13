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
/** Generated Model for AD_ChangeLog
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_ChangeLog extends PO
{
/** Standard Constructor
@param ctx context
@param AD_ChangeLog_ID id
@param trxName transaction
*/
public X_AD_ChangeLog (Properties ctx, int AD_ChangeLog_ID, String trxName)
{
super (ctx, AD_ChangeLog_ID, trxName);
/** if (AD_ChangeLog_ID == 0)
{
setAD_ChangeLog_ID (0);
setAD_Column_ID (0);
setAD_Session_ID (0);
setAD_Table_ID (0);
setIsCustomization (false);	
// N
setRecord_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_ChangeLog (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=580 */
public static int Table_ID=MTable.getTable_ID("AD_ChangeLog");

@XendraTrl(Identifier="97c2bc22-9b66-11ce-6ec8-fd2545e36d75")
public static String es_PE_TAB_ChangeAudit_Description="Historico de cambios por fecha";

@XendraTrl(Identifier="97c2bc22-9b66-11ce-6ec8-fd2545e36d75")
public static String es_PE_TAB_ChangeAudit_Help="Historico de cambios por fecha";

@XendraTrl(Identifier="97c2bc22-9b66-11ce-6ec8-fd2545e36d75")
public static String es_PE_TAB_ChangeAudit_Name="Historico de cambios";

@XendraTab(Name="Change Audit",Description="Log of data changes",Help="Log of data changes",
AD_Window_ID="73e1e76d-f42e-c451-896d-2b0f321701d1",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="41ee0515-3069-afce-1879-126e310ca3d8",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="97c2bc22-9b66-11ce-6ec8-fd2545e36d75",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ChangeAudit="97c2bc22-9b66-11ce-6ec8-fd2545e36d75";

@XendraTrl(Identifier="f0f5aeb5-025b-7919-edf4-6d2ea0196717")
public static String es_PE_TAB_ChangeAudit2_Description="Fecha de cambios";

@XendraTrl(Identifier="f0f5aeb5-025b-7919-edf4-6d2ea0196717")
public static String es_PE_TAB_ChangeAudit2_Help="Histórico de cambios por fecha";

@XendraTrl(Identifier="f0f5aeb5-025b-7919-edf4-6d2ea0196717")
public static String es_PE_TAB_ChangeAudit2_Name="Histórico de cambios";

@XendraTab(Name="Change Audit",Description="Data Changes",Help="Log of data changes",
AD_Window_ID="2d54fdd9-1f23-a280-9f41-33238a31aa47",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="a74fb669-cf40-84b9-3ac1-a5671f35179e",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="f0f5aeb5-025b-7919-edf4-6d2ea0196717",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ChangeAudit2="f0f5aeb5-025b-7919-edf4-6d2ea0196717";

@XendraTrl(Identifier="0c0e73b0-e102-3a70-d6e6-cb6f06fdc0d2")
public static String es_PE_TABLE_AD_ChangeLog_Name="Cambiar registro";

@XendraTable(Name="Change Log",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Log of data changes",Help="",
TableName="AD_ChangeLog",AccessLevel="6",AD_Window_ID="73e1e76d-f42e-c451-896d-2b0f321701d1",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="0c0e73b0-e102-3a70-d6e6-cb6f06fdc0d2",Synchronized="2020-03-03 21:34:53.0")
/** TableName=AD_ChangeLog */
public static final String Table_Name="AD_ChangeLog";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_ChangeLog");

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
    Table_ID = MTable.getTable_ID("AD_ChangeLog");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_ChangeLog[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Change Log.
@param AD_ChangeLog_ID Log of data changes */
public void setAD_ChangeLog_ID (int AD_ChangeLog_ID)
{
if (AD_ChangeLog_ID < 1) throw new IllegalArgumentException ("AD_ChangeLog_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_ChangeLog_ID, Integer.valueOf(AD_ChangeLog_ID));
}
/** Get Change Log.
@return Log of data changes */
public int getAD_ChangeLog_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_ChangeLog_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="36edc005-1999-2d51-80e8-b4b6316e9994")
public static String es_PE_FIELD_ChangeAudit_ChangeLog_Name="Cambiar registro";

@XendraTrl(Identifier="36edc005-1999-2d51-80e8-b4b6316e9994")
public static String es_PE_FIELD_ChangeAudit_ChangeLog_Description="Registro de cambio de datos";

@XendraTrl(Identifier="36edc005-1999-2d51-80e8-b4b6316e9994")
public static String es_PE_FIELD_ChangeAudit_ChangeLog_Help="Registro de cambio de datos";

@XendraField(AD_Column_ID="AD_ChangeLog_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f0f5aeb5-025b-7919-edf4-6d2ea0196717",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="36edc005-1999-2d51-80e8-b4b6316e9994")
public static final String FIELDNAME_ChangeAudit_ChangeLog="36edc005-1999-2d51-80e8-b4b6316e9994";

@XendraTrl(Identifier="9de1c6e7-fdd6-14d9-8e60-e1115ef974a5")
public static String es_PE_FIELD_ChangeAudit_ChangeLog2_Name="Cambiar registro";

@XendraTrl(Identifier="9de1c6e7-fdd6-14d9-8e60-e1115ef974a5")
public static String es_PE_FIELD_ChangeAudit_ChangeLog2_Description="Registro de cambio de datos";

@XendraTrl(Identifier="9de1c6e7-fdd6-14d9-8e60-e1115ef974a5")
public static String es_PE_FIELD_ChangeAudit_ChangeLog2_Help="Registro de cambio de datos";

@XendraField(AD_Column_ID="AD_ChangeLog_ID",IsCentrallyMaintained=true,
AD_Tab_ID="97c2bc22-9b66-11ce-6ec8-fd2545e36d75",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9de1c6e7-fdd6-14d9-8e60-e1115ef974a5")
public static final String FIELDNAME_ChangeAudit_ChangeLog2="9de1c6e7-fdd6-14d9-8e60-e1115ef974a5";
/** Column name AD_ChangeLog_ID */
public static final String COLUMNNAME_AD_ChangeLog_ID = "AD_ChangeLog_ID";
/** Set Column.
@param AD_Column_ID Column in the table */
public void setAD_Column_ID (int AD_Column_ID)
{
if (AD_Column_ID < 1) throw new IllegalArgumentException ("AD_Column_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Column_ID, Integer.valueOf(AD_Column_ID));
}
/** Get Column.
@return Column in the table */
public int getAD_Column_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Column_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a04a8bcc-670f-d9ae-dda4-605f75f903e4")
public static String es_PE_FIELD_ChangeAudit_Column_Name="Columna";

@XendraTrl(Identifier="a04a8bcc-670f-d9ae-dda4-605f75f903e4")
public static String es_PE_FIELD_ChangeAudit_Column_Description="Columna en la tabla";

@XendraTrl(Identifier="a04a8bcc-670f-d9ae-dda4-605f75f903e4")
public static String es_PE_FIELD_ChangeAudit_Column_Help="Enlace a la columna base de datos de la tabla";

@XendraField(AD_Column_ID="AD_Column_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f0f5aeb5-025b-7919-edf4-6d2ea0196717",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a04a8bcc-670f-d9ae-dda4-605f75f903e4")
public static final String FIELDNAME_ChangeAudit_Column="a04a8bcc-670f-d9ae-dda4-605f75f903e4";

@XendraTrl(Identifier="30b8323a-cfe1-44f7-4cb7-6fb82164d085")
public static String es_PE_FIELD_ChangeAudit_Column2_Name="Columna";

@XendraTrl(Identifier="30b8323a-cfe1-44f7-4cb7-6fb82164d085")
public static String es_PE_FIELD_ChangeAudit_Column2_Description="Columna en la tabla";

@XendraTrl(Identifier="30b8323a-cfe1-44f7-4cb7-6fb82164d085")
public static String es_PE_FIELD_ChangeAudit_Column2_Help="Enlace a la columna base de datos de la tabla";

@XendraField(AD_Column_ID="AD_Column_ID",IsCentrallyMaintained=true,
AD_Tab_ID="97c2bc22-9b66-11ce-6ec8-fd2545e36d75",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="30b8323a-cfe1-44f7-4cb7-6fb82164d085")
public static final String FIELDNAME_ChangeAudit_Column2="30b8323a-cfe1-44f7-4cb7-6fb82164d085";

@XendraTrl(Identifier="974f4673-68de-5d81-04da-be0d3a113eeb")
public static String es_PE_COLUMN_AD_Column_ID_Name="Columna";

@XendraColumn(AD_Element_ID="a0dcf1ba-2ef3-ca06-ed42-8ae37c632eaf",ColumnName="AD_Column_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="974f4673-68de-5d81-04da-be0d3a113eeb",
Synchronized="2020-03-03 21:34:25.0")
/** Column name AD_Column_ID */
public static final String COLUMNNAME_AD_Column_ID = "AD_Column_ID";
/** Set Session.
@param AD_Session_ID User Session Online or Web */
public void setAD_Session_ID (int AD_Session_ID)
{
if (AD_Session_ID < 1) throw new IllegalArgumentException ("AD_Session_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Session_ID, Integer.valueOf(AD_Session_ID));
}
/** Get Session.
@return User Session Online or Web */
public int getAD_Session_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Session_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getAD_Session_ID()));
}

@XendraTrl(Identifier="8154beb0-9a6a-e7d9-e8bd-11c2f3a23b3b")
public static String es_PE_FIELD_ChangeAudit_Session_Name="Sesión";

@XendraTrl(Identifier="8154beb0-9a6a-e7d9-e8bd-11c2f3a23b3b")
public static String es_PE_FIELD_ChangeAudit_Session_Description="Usar sesión el línea ó Web";

@XendraTrl(Identifier="8154beb0-9a6a-e7d9-e8bd-11c2f3a23b3b")
public static String es_PE_FIELD_ChangeAudit_Session_Help="Información de sesión en línea ó Web.";

@XendraField(AD_Column_ID="AD_Session_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f0f5aeb5-025b-7919-edf4-6d2ea0196717",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8154beb0-9a6a-e7d9-e8bd-11c2f3a23b3b")
public static final String FIELDNAME_ChangeAudit_Session="8154beb0-9a6a-e7d9-e8bd-11c2f3a23b3b";

@XendraTrl(Identifier="5c927d13-df51-adfb-3bca-cbfe02391a32")
public static String es_PE_FIELD_ChangeAudit_Session2_Name="Sesión";

@XendraTrl(Identifier="5c927d13-df51-adfb-3bca-cbfe02391a32")
public static String es_PE_FIELD_ChangeAudit_Session2_Description="Usar sesión el línea ó Web";

@XendraTrl(Identifier="5c927d13-df51-adfb-3bca-cbfe02391a32")
public static String es_PE_FIELD_ChangeAudit_Session2_Help="Información de sesión en línea ó Web.";

@XendraField(AD_Column_ID="AD_Session_ID",IsCentrallyMaintained=true,
AD_Tab_ID="97c2bc22-9b66-11ce-6ec8-fd2545e36d75",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5c927d13-df51-adfb-3bca-cbfe02391a32")
public static final String FIELDNAME_ChangeAudit_Session2="5c927d13-df51-adfb-3bca-cbfe02391a32";

@XendraTrl(Identifier="a74fb669-cf40-84b9-3ac1-a5671f35179e")
public static String es_PE_COLUMN_AD_Session_ID_Name="Sesión";

@XendraColumn(AD_Element_ID="9f3614f1-9f10-da39-c297-74c7bb15d088",ColumnName="AD_Session_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a74fb669-cf40-84b9-3ac1-a5671f35179e",
Synchronized="2020-03-03 21:34:25.0")
/** Column name AD_Session_ID */
public static final String COLUMNNAME_AD_Session_ID = "AD_Session_ID";
/** Set Table.
@param AD_Table_ID Database Table information */
public void setAD_Table_ID (int AD_Table_ID)
{
if (AD_Table_ID < 1) throw new IllegalArgumentException ("AD_Table_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Table_ID, Integer.valueOf(AD_Table_ID));
}
/** Get Table.
@return Database Table information */
public int getAD_Table_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Table_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="42fa5ed2-8e4c-a1f5-dd42-9865a059810f")
public static String es_PE_FIELD_ChangeAudit_Table_Name="Tabla";

@XendraTrl(Identifier="42fa5ed2-8e4c-a1f5-dd42-9865a059810f")
public static String es_PE_FIELD_ChangeAudit_Table_Description="Tabla para los campos";

@XendraTrl(Identifier="42fa5ed2-8e4c-a1f5-dd42-9865a059810f")
public static String es_PE_FIELD_ChangeAudit_Table_Help="La Tabla indica una tabla en la que reside un campo ó campos.";

@XendraField(AD_Column_ID="AD_Table_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f0f5aeb5-025b-7919-edf4-6d2ea0196717",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="42fa5ed2-8e4c-a1f5-dd42-9865a059810f")
public static final String FIELDNAME_ChangeAudit_Table="42fa5ed2-8e4c-a1f5-dd42-9865a059810f";

@XendraTrl(Identifier="ef083a38-4561-5ad4-5713-09b27dd070e8")
public static String es_PE_FIELD_ChangeAudit_Table2_Name="Tabla";

@XendraTrl(Identifier="ef083a38-4561-5ad4-5713-09b27dd070e8")
public static String es_PE_FIELD_ChangeAudit_Table2_Description="Tabla para los campos";

@XendraTrl(Identifier="ef083a38-4561-5ad4-5713-09b27dd070e8")
public static String es_PE_FIELD_ChangeAudit_Table2_Help="La Tabla indica una tabla en la que reside un campo ó campos.";

@XendraField(AD_Column_ID="AD_Table_ID",IsCentrallyMaintained=true,
AD_Tab_ID="97c2bc22-9b66-11ce-6ec8-fd2545e36d75",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ef083a38-4561-5ad4-5713-09b27dd070e8")
public static final String FIELDNAME_ChangeAudit_Table2="ef083a38-4561-5ad4-5713-09b27dd070e8";

@XendraTrl(Identifier="049fee95-35bf-52d1-305f-09e4ab77bc2c")
public static String es_PE_COLUMN_AD_Table_ID_Name="Tabla";

@XendraColumn(AD_Element_ID="270eeb02-723b-0ecc-7f56-3c67fa71a7f1",ColumnName="AD_Table_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="049fee95-35bf-52d1-305f-09e4ab77bc2c",
Synchronized="2020-03-03 21:34:25.0")
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

@XendraTrl(Identifier="16c48daf-54df-50ea-8fbc-3826a28693e5")
public static String es_PE_FIELD_ChangeAudit_Description_Name="Observación";

@XendraTrl(Identifier="16c48daf-54df-50ea-8fbc-3826a28693e5")
public static String es_PE_FIELD_ChangeAudit_Description_Description="Observación";

@XendraTrl(Identifier="16c48daf-54df-50ea-8fbc-3826a28693e5")
public static String es_PE_FIELD_ChangeAudit_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="f0f5aeb5-025b-7919-edf4-6d2ea0196717",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="16c48daf-54df-50ea-8fbc-3826a28693e5")
public static final String FIELDNAME_ChangeAudit_Description="16c48daf-54df-50ea-8fbc-3826a28693e5";

@XendraTrl(Identifier="7a47e7e0-b014-b51e-c63a-716d9b8d5c62")
public static String es_PE_FIELD_ChangeAudit_Description2_Name="Observación";

@XendraTrl(Identifier="7a47e7e0-b014-b51e-c63a-716d9b8d5c62")
public static String es_PE_FIELD_ChangeAudit_Description2_Description="Observación";

@XendraTrl(Identifier="7a47e7e0-b014-b51e-c63a-716d9b8d5c62")
public static String es_PE_FIELD_ChangeAudit_Description2_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="97c2bc22-9b66-11ce-6ec8-fd2545e36d75",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7a47e7e0-b014-b51e-c63a-716d9b8d5c62")
public static final String FIELDNAME_ChangeAudit_Description2="7a47e7e0-b014-b51e-c63a-716d9b8d5c62";

@XendraTrl(Identifier="bc4568a5-59de-eaab-39b5-3680095e202f")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=true,ColumnSQL="",
IsAllowLogging=false,Identifier="bc4568a5-59de-eaab-39b5-3680095e202f",
Synchronized="2020-03-03 21:34:25.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set EventChangeLog.
@param EventChangeLog EventChangeLog */
public void setEventChangeLog (String EventChangeLog)
{
if (EventChangeLog != null && EventChangeLog.length() > 1)
{
log.warning("Length > 1 - truncated");
EventChangeLog = EventChangeLog.substring(0,0);
}
set_Value (COLUMNNAME_EventChangeLog, EventChangeLog);
}
/** Get EventChangeLog.
@return EventChangeLog */
public String getEventChangeLog() 
{
return (String)get_Value(COLUMNNAME_EventChangeLog);
}

@XendraTrl(Identifier="75bd5042-4a75-cf87-cb7f-f6be478ca4fe")
public static String es_PE_COLUMN_EventChangeLog_Name="eventchangelog";

@XendraColumn(AD_Element_ID="df51e665-27f0-bb03-b247-1087d2e7e7f1",ColumnName="EventChangeLog",
AD_Reference_ID=17,AD_Reference_Value_ID="125a0f27-9c53-65e4-ae8b-0bb660485550",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="75bd5042-4a75-cf87-cb7f-f6be478ca4fe",Synchronized="2020-03-03 21:34:25.0")
/** Column name EventChangeLog */
public static final String COLUMNNAME_EventChangeLog = "EventChangeLog";
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
@XendraTrl(Identifier="c132638a-3c55-4fdb-9f31-c072606d261f")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c132638a-3c55-4fdb-9f31-c072606d261f",
Synchronized="2020-03-03 21:34:25.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Customization.
@param IsCustomization The change is a customization of the data dictionary and can be applied after Migration */
public void setIsCustomization (boolean IsCustomization)
{
set_Value (COLUMNNAME_IsCustomization, Boolean.valueOf(IsCustomization));
}
/** Get Customization.
@return The change is a customization of the data dictionary and can be applied after Migration */
public boolean isCustomization() 
{
Object oo = get_Value(COLUMNNAME_IsCustomization);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="f2b08c91-2a1f-b6f7-dbfe-2f4f82402a78")
public static String es_PE_FIELD_ChangeAudit_Customization_Name="Personalización";

@XendraTrl(Identifier="f2b08c91-2a1f-b6f7-dbfe-2f4f82402a78")
public static String es_PE_FIELD_ChangeAudit_Customization_Help="La migración \"reajusta\" el sistema para ajuste de corriente/original. Si esta seleccionado puede ahorrar la personalización y reaplicarla. Porfavor observe que usted necesita comprobar, Si su personalización particular hace que ningun efecto negativo secundario en el nuevo enlace.";

@XendraField(AD_Column_ID="IsCustomization",IsCentrallyMaintained=true,
AD_Tab_ID="f0f5aeb5-025b-7919-edf4-6d2ea0196717",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f2b08c91-2a1f-b6f7-dbfe-2f4f82402a78")
public static final String FIELDNAME_ChangeAudit_Customization="f2b08c91-2a1f-b6f7-dbfe-2f4f82402a78";

@XendraTrl(Identifier="791067d3-bf09-03fe-7372-daa7632be44a")
public static String es_PE_FIELD_ChangeAudit_Customization2_Name="Personalización";

@XendraTrl(Identifier="791067d3-bf09-03fe-7372-daa7632be44a")
public static String es_PE_FIELD_ChangeAudit_Customization2_Help="La migración \"reajusta\" el sistema para ajuste de corriente/original. Si esta seleccionado puede ahorrar la personalización y reaplicarla. Porfavor observe que usted necesita comprobar, Si su personalización particular hace que ningun efecto negativo secundario en el nuevo enlace.";

@XendraField(AD_Column_ID="IsCustomization",IsCentrallyMaintained=true,
AD_Tab_ID="97c2bc22-9b66-11ce-6ec8-fd2545e36d75",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="791067d3-bf09-03fe-7372-daa7632be44a")
public static final String FIELDNAME_ChangeAudit_Customization2="791067d3-bf09-03fe-7372-daa7632be44a";

@XendraTrl(Identifier="f7bbb1d6-4110-6766-97f9-6f0ccc9c2739")
public static String es_PE_COLUMN_IsCustomization_Name="Personalización";

@XendraColumn(AD_Element_ID="f70843df-f589-3f83-44f7-4360911cae45",ColumnName="IsCustomization",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=true,ColumnSQL="",
IsAllowLogging=false,Identifier="f7bbb1d6-4110-6766-97f9-6f0ccc9c2739",
Synchronized="2020-03-03 21:34:25.0")
/** Column name IsCustomization */
public static final String COLUMNNAME_IsCustomization = "IsCustomization";
/** Set New Value.
@param NewValue New field value */
public void setNewValue (String NewValue)
{
if (NewValue != null && NewValue.length() > 2000)
{
log.warning("Length > 2000 - truncated");
NewValue = NewValue.substring(0,1999);
}
set_ValueNoCheck (COLUMNNAME_NewValue, NewValue);
}
/** Get New Value.
@return New field value */
public String getNewValue() 
{
String value = (String)get_Value(COLUMNNAME_NewValue);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="5c979e9a-8ee7-2a1d-d52c-800c135baefa")
public static String es_PE_FIELD_ChangeAudit_NewValue_Name="Nuevo Valor";

@XendraTrl(Identifier="5c979e9a-8ee7-2a1d-d52c-800c135baefa")
public static String es_PE_FIELD_ChangeAudit_NewValue_Description="Nuevo valor de campo";

@XendraTrl(Identifier="5c979e9a-8ee7-2a1d-d52c-800c135baefa")
public static String es_PE_FIELD_ChangeAudit_NewValue_Help="Los nuevos datos entrarón en el campo.";

@XendraField(AD_Column_ID="NewValue",IsCentrallyMaintained=true,
AD_Tab_ID="f0f5aeb5-025b-7919-edf4-6d2ea0196717",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=true,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5c979e9a-8ee7-2a1d-d52c-800c135baefa")
public static final String FIELDNAME_ChangeAudit_NewValue="5c979e9a-8ee7-2a1d-d52c-800c135baefa";

@XendraTrl(Identifier="74c39945-89a4-bc67-b28c-fdd0281ab9ed")
public static String es_PE_FIELD_ChangeAudit_NewValue2_Name="Nuevo Valor";

@XendraTrl(Identifier="74c39945-89a4-bc67-b28c-fdd0281ab9ed")
public static String es_PE_FIELD_ChangeAudit_NewValue2_Description="Nuevo valor de campo";

@XendraTrl(Identifier="74c39945-89a4-bc67-b28c-fdd0281ab9ed")
public static String es_PE_FIELD_ChangeAudit_NewValue2_Help="Los nuevos datos entrarón en el campo.";

@XendraField(AD_Column_ID="NewValue",IsCentrallyMaintained=true,
AD_Tab_ID="97c2bc22-9b66-11ce-6ec8-fd2545e36d75",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=true,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="74c39945-89a4-bc67-b28c-fdd0281ab9ed")
public static final String FIELDNAME_ChangeAudit_NewValue2="74c39945-89a4-bc67-b28c-fdd0281ab9ed";

@XendraTrl(Identifier="8bb38ae0-3a23-0b00-3f73-f84de59b3b5d")
public static String es_PE_COLUMN_NewValue_Name="Nuevo Valor";

@XendraColumn(AD_Element_ID="84162433-510b-6d06-35b4-a6e497b4a42c",ColumnName="NewValue",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8bb38ae0-3a23-0b00-3f73-f84de59b3b5d",
Synchronized="2020-03-03 21:34:25.0")
/** Column name NewValue */
public static final String COLUMNNAME_NewValue = "NewValue";
/** Set Old Value.
@param OldValue The old file data */
public void setOldValue (String OldValue)
{
if (OldValue != null && OldValue.length() > 2000)
{
log.warning("Length > 2000 - truncated");
OldValue = OldValue.substring(0,1999);
}
set_ValueNoCheck (COLUMNNAME_OldValue, OldValue);
}
/** Get Old Value.
@return The old file data */
public String getOldValue() 
{
String value = (String)get_Value(COLUMNNAME_OldValue);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="3e000c98-e835-5636-9f47-4940fcf2374c")
public static String es_PE_FIELD_ChangeAudit_OldValue_Name="Valor Antiguo";

@XendraTrl(Identifier="3e000c98-e835-5636-9f47-4940fcf2374c")
public static String es_PE_FIELD_ChangeAudit_OldValue_Description="Fichero antiguo de datos";

@XendraTrl(Identifier="3e000c98-e835-5636-9f47-4940fcf2374c")
public static String es_PE_FIELD_ChangeAudit_OldValue_Help="Antiguos datos sobreescritos en el campo";

@XendraField(AD_Column_ID="OldValue",IsCentrallyMaintained=true,
AD_Tab_ID="f0f5aeb5-025b-7919-edf4-6d2ea0196717",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=true,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3e000c98-e835-5636-9f47-4940fcf2374c")
public static final String FIELDNAME_ChangeAudit_OldValue="3e000c98-e835-5636-9f47-4940fcf2374c";

@XendraTrl(Identifier="f10f63cc-e14c-80b7-f3aa-531e405611a8")
public static String es_PE_FIELD_ChangeAudit_OldValue2_Name="Valor Antiguo";

@XendraTrl(Identifier="f10f63cc-e14c-80b7-f3aa-531e405611a8")
public static String es_PE_FIELD_ChangeAudit_OldValue2_Description="Fichero antiguo de datos";

@XendraTrl(Identifier="f10f63cc-e14c-80b7-f3aa-531e405611a8")
public static String es_PE_FIELD_ChangeAudit_OldValue2_Help="Antiguos datos sobreescritos en el campo";

@XendraField(AD_Column_ID="OldValue",IsCentrallyMaintained=true,
AD_Tab_ID="97c2bc22-9b66-11ce-6ec8-fd2545e36d75",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=true,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f10f63cc-e14c-80b7-f3aa-531e405611a8")
public static final String FIELDNAME_ChangeAudit_OldValue2="f10f63cc-e14c-80b7-f3aa-531e405611a8";

@XendraTrl(Identifier="2006f991-a29c-cc38-e4ee-0e2e14b02460")
public static String es_PE_COLUMN_OldValue_Name="Valor Antiguo";

@XendraColumn(AD_Element_ID="4feb6453-1db6-f048-7af2-0279ff7859ea",ColumnName="OldValue",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2006f991-a29c-cc38-e4ee-0e2e14b02460",
Synchronized="2020-03-03 21:34:25.0")
/** Column name OldValue */
public static final String COLUMNNAME_OldValue = "OldValue";
/** Set Record ID.
@param Record_ID Direct internal record ID */
public void setRecord_ID (int Record_ID)
{
if (Record_ID < 0) throw new IllegalArgumentException ("Record_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_Record_ID, Integer.valueOf(Record_ID));
}
/** Get Record ID.
@return Direct internal record ID */
public int getRecord_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Record_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2a4ad06f-2803-372d-6288-c1bc29522901")
public static String es_PE_FIELD_ChangeAudit_RecordID_Name="ID de Registro";

@XendraTrl(Identifier="2a4ad06f-2803-372d-6288-c1bc29522901")
public static String es_PE_FIELD_ChangeAudit_RecordID_Description="Identificador de registro interno";

@XendraTrl(Identifier="2a4ad06f-2803-372d-6288-c1bc29522901")
public static String es_PE_FIELD_ChangeAudit_RecordID_Help="La ID de registro es el identificador único interno de un registro.";

@XendraField(AD_Column_ID="Record_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f0f5aeb5-025b-7919-edf4-6d2ea0196717",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2a4ad06f-2803-372d-6288-c1bc29522901")
public static final String FIELDNAME_ChangeAudit_RecordID="2a4ad06f-2803-372d-6288-c1bc29522901";

@XendraTrl(Identifier="57753648-f0b8-5b43-01ed-68b55641b160")
public static String es_PE_FIELD_ChangeAudit_RecordID2_Name="ID de Registro";

@XendraTrl(Identifier="57753648-f0b8-5b43-01ed-68b55641b160")
public static String es_PE_FIELD_ChangeAudit_RecordID2_Description="Identificador de registro interno";

@XendraTrl(Identifier="57753648-f0b8-5b43-01ed-68b55641b160")
public static String es_PE_FIELD_ChangeAudit_RecordID2_Help="La ID de registro es el identificador único interno de un registro.";

@XendraField(AD_Column_ID="Record_ID",IsCentrallyMaintained=true,
AD_Tab_ID="97c2bc22-9b66-11ce-6ec8-fd2545e36d75",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="57753648-f0b8-5b43-01ed-68b55641b160")
public static final String FIELDNAME_ChangeAudit_RecordID2="57753648-f0b8-5b43-01ed-68b55641b160";

@XendraTrl(Identifier="50f0eb68-fd39-5f93-ebc7-1d784fe18904")
public static String es_PE_COLUMN_Record_ID_Name="ID de Registro";

@XendraColumn(AD_Element_ID="86e36e4b-d1dc-2deb-449d-c1f6769e1603",ColumnName="Record_ID",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="50f0eb68-fd39-5f93-ebc7-1d784fe18904",
Synchronized="2020-03-03 21:34:25.0")
/** Column name Record_ID */
public static final String COLUMNNAME_Record_ID = "Record_ID";
/** Set Redo.
@param Redo Redo */
public void setRedo (String Redo)
{
if (Redo != null && Redo.length() > 1)
{
log.warning("Length > 1 - truncated");
Redo = Redo.substring(0,0);
}
set_Value (COLUMNNAME_Redo, Redo);
}
/** Get Redo.
@return Redo */
public String getRedo() 
{
return (String)get_Value(COLUMNNAME_Redo);
}

@XendraTrl(Identifier="b7c1f799-fb3c-f9e0-2c86-e13ff24ef876")
public static String es_PE_FIELD_ChangeAudit_Redo_Name="Replica Cambios";

@XendraTrl(Identifier="b7c1f799-fb3c-f9e0-2c86-e13ff24ef876")
public static String es_PE_FIELD_ChangeAudit_Redo_Description="Replica Cambios";

@XendraTrl(Identifier="b7c1f799-fb3c-f9e0-2c86-e13ff24ef876")
public static String es_PE_FIELD_ChangeAudit_Redo_Help="Usted puede replicar ciertos cambios.";

@XendraField(AD_Column_ID="Redo",IsCentrallyMaintained=true,
AD_Tab_ID="f0f5aeb5-025b-7919-edf4-6d2ea0196717",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b7c1f799-fb3c-f9e0-2c86-e13ff24ef876")
public static final String FIELDNAME_ChangeAudit_Redo="b7c1f799-fb3c-f9e0-2c86-e13ff24ef876";

@XendraTrl(Identifier="1a8916dd-73a6-7d40-8440-4b8e93bcfa85")
public static String es_PE_FIELD_ChangeAudit_Redo2_Name="Replica Cambios";

@XendraTrl(Identifier="1a8916dd-73a6-7d40-8440-4b8e93bcfa85")
public static String es_PE_FIELD_ChangeAudit_Redo2_Description="Replica Cambios";

@XendraTrl(Identifier="1a8916dd-73a6-7d40-8440-4b8e93bcfa85")
public static String es_PE_FIELD_ChangeAudit_Redo2_Help="Usted puede replicar ciertos cambios.";

@XendraField(AD_Column_ID="Redo",IsCentrallyMaintained=true,
AD_Tab_ID="97c2bc22-9b66-11ce-6ec8-fd2545e36d75",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1a8916dd-73a6-7d40-8440-4b8e93bcfa85")
public static final String FIELDNAME_ChangeAudit_Redo2="1a8916dd-73a6-7d40-8440-4b8e93bcfa85";

@XendraTrl(Identifier="a258127a-a011-b1ce-80ef-2110a4340baa")
public static String es_PE_COLUMN_Redo_Name="Versión de Lista de Precios";

@XendraColumn(AD_Element_ID="3a2545f3-66b8-7446-623a-be356a9d4b5b",ColumnName="Redo",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="eb4bb8f6-f699-ee4f-23cb-84963619a147",
IsAlwaysUpdateable=true,ColumnSQL="",IsAllowLogging=false,
Identifier="a258127a-a011-b1ce-80ef-2110a4340baa",Synchronized="2020-03-03 21:34:25.0")
/** Column name Redo */
public static final String COLUMNNAME_Redo = "Redo";
/** Set Transaction.
@param TrxName Name of the transaction */
public void setTrxName (String TrxName)
{
if (TrxName != null && TrxName.length() > 60)
{
log.warning("Length > 60 - truncated");
TrxName = TrxName.substring(0,59);
}
set_ValueNoCheck (COLUMNNAME_TrxName, TrxName);
}
/** Get Transaction.
@return Name of the transaction */
public String getTrxName() 
{
String value = (String)get_Value(COLUMNNAME_TrxName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="bfac7ebc-d138-2cc8-cee7-51f7e0a789d1")
public static String es_PE_FIELD_ChangeAudit_Transaction_Name="Transacción";

@XendraTrl(Identifier="bfac7ebc-d138-2cc8-cee7-51f7e0a789d1")
public static String es_PE_FIELD_ChangeAudit_Transaction_Description="Nombre de la transacción";

@XendraTrl(Identifier="bfac7ebc-d138-2cc8-cee7-51f7e0a789d1")
public static String es_PE_FIELD_ChangeAudit_Transaction_Help="Nombre interno de la transacción";

@XendraField(AD_Column_ID="TrxName",IsCentrallyMaintained=true,
AD_Tab_ID="f0f5aeb5-025b-7919-edf4-6d2ea0196717",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bfac7ebc-d138-2cc8-cee7-51f7e0a789d1")
public static final String FIELDNAME_ChangeAudit_Transaction="bfac7ebc-d138-2cc8-cee7-51f7e0a789d1";

@XendraTrl(Identifier="6bc73771-3c18-bf55-006a-79e4f20122a2")
public static String es_PE_FIELD_ChangeAudit_Transaction2_Name="Transacción";

@XendraTrl(Identifier="6bc73771-3c18-bf55-006a-79e4f20122a2")
public static String es_PE_FIELD_ChangeAudit_Transaction2_Description="Nombre de la transacción";

@XendraTrl(Identifier="6bc73771-3c18-bf55-006a-79e4f20122a2")
public static String es_PE_FIELD_ChangeAudit_Transaction2_Help="Nombre interno de la transacción";

@XendraField(AD_Column_ID="TrxName",IsCentrallyMaintained=true,
AD_Tab_ID="97c2bc22-9b66-11ce-6ec8-fd2545e36d75",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6bc73771-3c18-bf55-006a-79e4f20122a2")
public static final String FIELDNAME_ChangeAudit_Transaction2="6bc73771-3c18-bf55-006a-79e4f20122a2";

@XendraTrl(Identifier="169b796c-9697-651f-f486-ae19d3c10c61")
public static String es_PE_COLUMN_TrxName_Name="Transacción";

@XendraColumn(AD_Element_ID="12c70d10-0858-1b6f-9019-2de39171d1e4",ColumnName="TrxName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="169b796c-9697-651f-f486-ae19d3c10c61",
Synchronized="2020-03-03 21:34:25.0")
/** Column name TrxName */
public static final String COLUMNNAME_TrxName = "TrxName";
/** Set Undo.
@param Undo Undo */
public void setUndo (String Undo)
{
if (Undo != null && Undo.length() > 1)
{
log.warning("Length > 1 - truncated");
Undo = Undo.substring(0,0);
}
set_Value (COLUMNNAME_Undo, Undo);
}
/** Get Undo.
@return Undo */
public String getUndo() 
{
return (String)get_Value(COLUMNNAME_Undo);
}

@XendraTrl(Identifier="1d7d2b9e-8e42-2cdf-2c75-3841a9a83362")
public static String es_PE_FIELD_ChangeAudit_Undo_Name="Deshace Cambios";

@XendraTrl(Identifier="1d7d2b9e-8e42-2cdf-2c75-3841a9a83362")
public static String es_PE_FIELD_ChangeAudit_Undo_Description="Deshace Cambios";

@XendraTrl(Identifier="1d7d2b9e-8e42-2cdf-2c75-3841a9a83362")
public static String es_PE_FIELD_ChangeAudit_Undo_Help="Usted puede deshacer ciertos cambios";

@XendraField(AD_Column_ID="Undo",IsCentrallyMaintained=true,
AD_Tab_ID="f0f5aeb5-025b-7919-edf4-6d2ea0196717",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1d7d2b9e-8e42-2cdf-2c75-3841a9a83362")
public static final String FIELDNAME_ChangeAudit_Undo="1d7d2b9e-8e42-2cdf-2c75-3841a9a83362";

@XendraTrl(Identifier="6e6c98b1-43dc-3539-669a-735a190cefa1")
public static String es_PE_FIELD_ChangeAudit_Undo2_Name="Deshace Cambios";

@XendraTrl(Identifier="6e6c98b1-43dc-3539-669a-735a190cefa1")
public static String es_PE_FIELD_ChangeAudit_Undo2_Description="Deshace Cambios";

@XendraTrl(Identifier="6e6c98b1-43dc-3539-669a-735a190cefa1")
public static String es_PE_FIELD_ChangeAudit_Undo2_Help="Usted puede deshacer ciertos cambios";

@XendraField(AD_Column_ID="Undo",IsCentrallyMaintained=true,
AD_Tab_ID="97c2bc22-9b66-11ce-6ec8-fd2545e36d75",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6e6c98b1-43dc-3539-669a-735a190cefa1")
public static final String FIELDNAME_ChangeAudit_Undo2="6e6c98b1-43dc-3539-669a-735a190cefa1";

@XendraTrl(Identifier="905dfb43-1187-654b-40ca-6aae2625f089")
public static String es_PE_COLUMN_Undo_Name="Deshacer";

@XendraColumn(AD_Element_ID="4cdbef7b-40c8-ba21-2ce6-b22a1f78702b",ColumnName="Undo",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="87e60522-ede9-4105-bddc-07fa9842c3a9",
IsAlwaysUpdateable=true,ColumnSQL="",IsAllowLogging=false,
Identifier="905dfb43-1187-654b-40ca-6aae2625f089",Synchronized="2020-03-03 21:34:25.0")
/** Column name Undo */
public static final String COLUMNNAME_Undo = "Undo";
}
