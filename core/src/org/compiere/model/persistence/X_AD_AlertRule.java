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
/** Generated Model for AD_AlertRule
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_AlertRule extends PO
{
/** Standard Constructor
@param ctx context
@param AD_AlertRule_ID id
@param trxName transaction
*/
public X_AD_AlertRule (Properties ctx, int AD_AlertRule_ID, String trxName)
{
super (ctx, AD_AlertRule_ID, trxName);
/** if (AD_AlertRule_ID == 0)
{
setAD_Alert_ID (0);
setAD_AlertRule_ID (0);
setFromClause (null);
setIsValid (true);	
// Y
setName (null);
setSelectClause (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_AlertRule (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=593 */
public static int Table_ID=MTable.getTable_ID("AD_AlertRule");

@XendraTrl(Identifier="dfe87cf6-1f8b-3099-9379-b03c199ba91c")
public static String es_PE_TAB_AlertRule_Description="Definición del elemento alerta";

@XendraTrl(Identifier="dfe87cf6-1f8b-3099-9379-b03c199ba91c")
public static String es_PE_TAB_AlertRule_Name="Regla Alerta";
@XendraTab(Name="Alert Rule",
Description="Definition of the alert element",Help="The definition of the altert or action",
AD_Window_ID="dc53fc66-0028-1335-3ffe-929e517d2505",SeqNo=20,TabLevel=1,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="dfe87cf6-1f8b-3099-9379-b03c199ba91c",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_AlertRule="dfe87cf6-1f8b-3099-9379-b03c199ba91c";

@XendraTrl(Identifier="79145369-8879-98fc-b4f3-7e828fed3b05")
public static String es_PE_TABLE_AD_AlertRule_Name="Regla de Alerta";

@XendraTable(Name="Alert Rule",Description="Definition of the alert element",Help="",
TableName="AD_AlertRule",AccessLevel="6",AD_Window_ID="dc53fc66-0028-1335-3ffe-929e517d2505",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="79145369-8879-98fc-b4f3-7e828fed3b05",Synchronized="2017-08-16 11:39:58.0")
/** TableName=AD_AlertRule */
public static final String Table_Name="AD_AlertRule";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_AlertRule");

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
    Table_ID = MTable.getTable_ID("AD_AlertRule");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_AlertRule[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="e8110dfc-1903-3c8d-de36-9a50b5687c7d")
public static String es_PE_FIELD_AlertRule_Alert_Description="Auditor de alertas.";

@XendraTrl(Identifier="e8110dfc-1903-3c8d-de36-9a50b5687c7d")
public static String es_PE_FIELD_AlertRule_Alert_Help="Adempiere permite definir condiciones de alerta en el sistema para estar informado.";

@XendraTrl(Identifier="e8110dfc-1903-3c8d-de36-9a50b5687c7d")
public static String es_PE_FIELD_AlertRule_Alert_Name="Alerta";

@XendraField(AD_Column_ID="AD_Alert_ID",IsCentrallyMaintained=true,
AD_Tab_ID="dfe87cf6-1f8b-3099-9379-b03c199ba91c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e8110dfc-1903-3c8d-de36-9a50b5687c7d")
public static final String FIELDNAME_AlertRule_Alert="e8110dfc-1903-3c8d-de36-9a50b5687c7d";

@XendraTrl(Identifier="6e0b7306-456a-ae09-ca6a-019819b67a82")
public static String es_PE_COLUMN_AD_Alert_ID_Name="Alerta";

@XendraColumn(AD_Element_ID="c46a312a-c548-da5b-0007-0d6935286e68",ColumnName="AD_Alert_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6e0b7306-456a-ae09-ca6a-019819b67a82",
Synchronized="2017-08-05 16:52:21.0")
/** Column name AD_Alert_ID */
public static final String COLUMNNAME_AD_Alert_ID = "AD_Alert_ID";
/** Set Alert Rule.
@param AD_AlertRule_ID Definition of the alert element */
public void setAD_AlertRule_ID (int AD_AlertRule_ID)
{
if (AD_AlertRule_ID < 1) throw new IllegalArgumentException ("AD_AlertRule_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_AlertRule_ID, Integer.valueOf(AD_AlertRule_ID));
}
/** Get Alert Rule.
@return Definition of the alert element */
public int getAD_AlertRule_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_AlertRule_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f714191c-1832-d37c-9750-19960945328a")
public static String es_PE_FIELD_AlertRule_AlertRule_Description="Definición del elemento de alerta.";

@XendraTrl(Identifier="f714191c-1832-d37c-9750-19960945328a")
public static String es_PE_FIELD_AlertRule_AlertRule_Name="Regla de Alerta";

@XendraField(AD_Column_ID="AD_AlertRule_ID",IsCentrallyMaintained=true,
AD_Tab_ID="dfe87cf6-1f8b-3099-9379-b03c199ba91c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f714191c-1832-d37c-9750-19960945328a")
public static final String FIELDNAME_AlertRule_AlertRule="f714191c-1832-d37c-9750-19960945328a";
/** Column name AD_AlertRule_ID */
public static final String COLUMNNAME_AD_AlertRule_ID = "AD_AlertRule_ID";
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

@XendraTrl(Identifier="3ab69e4a-9f4b-99e9-000f-21ae59be418f")
public static String es_PE_FIELD_AlertRule_Table_Description="Tabla para los campos";

@XendraTrl(Identifier="3ab69e4a-9f4b-99e9-000f-21ae59be418f")
public static String es_PE_FIELD_AlertRule_Table_Help="La Tabla indica una tabla en la que reside un campo ó campos.";

@XendraTrl(Identifier="3ab69e4a-9f4b-99e9-000f-21ae59be418f")
public static String es_PE_FIELD_AlertRule_Table_Name="Tabla";

@XendraField(AD_Column_ID="AD_Table_ID",IsCentrallyMaintained=true,
AD_Tab_ID="dfe87cf6-1f8b-3099-9379-b03c199ba91c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3ab69e4a-9f4b-99e9-000f-21ae59be418f")
public static final String FIELDNAME_AlertRule_Table="3ab69e4a-9f4b-99e9-000f-21ae59be418f";

@XendraTrl(Identifier="3d356d42-8304-6914-f388-a265a874f73d")
public static String es_PE_COLUMN_AD_Table_ID_Name="Tabla";

@XendraColumn(AD_Element_ID="270eeb02-723b-0ecc-7f56-3c67fa71a7f1",ColumnName="AD_Table_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3d356d42-8304-6914-f388-a265a874f73d",
Synchronized="2017-08-05 16:52:21.0")
/** Column name AD_Table_ID */
public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
/** Set Error Msg.
@param ErrorMsg Error Msg */
public void setErrorMsg (String ErrorMsg)
{
set_Value (COLUMNNAME_ErrorMsg, ErrorMsg);
}
/** Get Error Msg.
@return Error Msg */
public String getErrorMsg() 
{
String value = (String)get_Value(COLUMNNAME_ErrorMsg);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="c5cc0410-840c-3bf6-5fce-df6ab916c63e")
public static String es_PE_FIELD_AlertRule_ErrorMsg_Name="Mensaje de Error";

@XendraField(AD_Column_ID="ErrorMsg",IsCentrallyMaintained=true,
AD_Tab_ID="dfe87cf6-1f8b-3099-9379-b03c199ba91c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsValid@=N",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c5cc0410-840c-3bf6-5fce-df6ab916c63e")
public static final String FIELDNAME_AlertRule_ErrorMsg="c5cc0410-840c-3bf6-5fce-df6ab916c63e";

@XendraTrl(Identifier="de0045bd-e96e-1110-abe7-86097ca3fc21")
public static String es_PE_COLUMN_ErrorMsg_Name="Mensaje de Error";

@XendraColumn(AD_Element_ID="7ed8e902-7223-0140-a5e2-159d12a79a58",ColumnName="ErrorMsg",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="de0045bd-e96e-1110-abe7-86097ca3fc21",
Synchronized="2017-08-05 16:52:21.0")
/** Column name ErrorMsg */
public static final String COLUMNNAME_ErrorMsg = "ErrorMsg";
/** Set Sql FROM.
@param FromClause SQL FROM clause */
public void setFromClause (String FromClause)
{
if (FromClause == null) throw new IllegalArgumentException ("FromClause is mandatory.");
set_Value (COLUMNNAME_FromClause, FromClause);
}
/** Get Sql FROM.
@return SQL FROM clause */
public String getFromClause() 
{
String value = (String)get_Value(COLUMNNAME_FromClause);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="4c915d3e-d465-5788-4f1b-0c3fe48f0515")
public static String es_PE_FIELD_AlertRule_SqlFROM_Description="SQL de clausula";

@XendraTrl(Identifier="4c915d3e-d465-5788-4f1b-0c3fe48f0515")
public static String es_PE_FIELD_AlertRule_SqlFROM_Name="De Clausula";

@XendraField(AD_Column_ID="FromClause",IsCentrallyMaintained=true,
AD_Tab_ID="dfe87cf6-1f8b-3099-9379-b03c199ba91c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4c915d3e-d465-5788-4f1b-0c3fe48f0515")
public static final String FIELDNAME_AlertRule_SqlFROM="4c915d3e-d465-5788-4f1b-0c3fe48f0515";

@XendraTrl(Identifier="85fc9042-4bea-a095-5dcc-53b8c5f312db")
public static String es_PE_COLUMN_FromClause_Name="De Clausula";

@XendraColumn(AD_Element_ID="4615afab-b3c6-aeee-2229-28fffab53111",ColumnName="FromClause",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="85fc9042-4bea-a095-5dcc-53b8c5f312db",
Synchronized="2017-08-05 16:52:21.0")
/** Column name FromClause */
public static final String COLUMNNAME_FromClause = "FromClause";
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
@XendraTrl(Identifier="4c7e15c6-bc2a-4c7f-9142-250a665407ce")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4c7e15c6-bc2a-4c7f-9142-250a665407ce",
Synchronized="2017-08-05 16:52:21.0")
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

@XendraTrl(Identifier="a6f0cae2-c9b4-7fb3-a0d9-a1e38ab46a2d")
public static String es_PE_FIELD_AlertRule_Valid_Description="El elemento es valido";

@XendraTrl(Identifier="a6f0cae2-c9b4-7fb3-a0d9-a1e38ab46a2d")
public static String es_PE_FIELD_AlertRule_Valid_Help="El elemento pasado es el cheque de la validación";

@XendraTrl(Identifier="a6f0cae2-c9b4-7fb3-a0d9-a1e38ab46a2d")
public static String es_PE_FIELD_AlertRule_Valid_Name="Valido";
@XendraField(AD_Column_ID="IsValid",
IsCentrallyMaintained=true,AD_Tab_ID="dfe87cf6-1f8b-3099-9379-b03c199ba91c",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=60,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="a6f0cae2-c9b4-7fb3-a0d9-a1e38ab46a2d")
public static final String FIELDNAME_AlertRule_Valid="a6f0cae2-c9b4-7fb3-a0d9-a1e38ab46a2d";

@XendraTrl(Identifier="3f39cf4f-1032-d946-1b4b-aaa1fa28cde7")
public static String es_PE_COLUMN_IsValid_Name="Valido";

@XendraColumn(AD_Element_ID="394c3099-1638-2f07-2e14-7bd38bb8ad25",ColumnName="IsValid",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3f39cf4f-1032-d946-1b4b-aaa1fa28cde7",
Synchronized="2017-08-05 16:52:21.0")
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

@XendraTrl(Identifier="ef0a3420-59f9-a748-977d-c2d93eb775d9")
public static String es_PE_FIELD_AlertRule_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="ef0a3420-59f9-a748-977d-c2d93eb775d9")
public static String es_PE_FIELD_AlertRule_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="ef0a3420-59f9-a748-977d-c2d93eb775d9")
public static String es_PE_FIELD_AlertRule_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="dfe87cf6-1f8b-3099-9379-b03c199ba91c",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="ef0a3420-59f9-a748-977d-c2d93eb775d9")
public static final String FIELDNAME_AlertRule_Name="ef0a3420-59f9-a748-977d-c2d93eb775d9";

@XendraTrl(Identifier="0071a6d2-e57a-9c65-760e-7387d5be224d")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0071a6d2-e57a-9c65-760e-7387d5be224d",
Synchronized="2017-08-05 16:52:21.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Other SQL Clause.
@param OtherClause Other SQL Clause */
public void setOtherClause (String OtherClause)
{
set_Value (COLUMNNAME_OtherClause, OtherClause);
}
/** Get Other SQL Clause.
@return Other SQL Clause */
public String getOtherClause() 
{
String value = (String)get_Value(COLUMNNAME_OtherClause);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="bde5d2e5-e05e-4257-078d-79b52ec6d6c7")
public static String es_PE_FIELD_AlertRule_OtherSQLClause_Description="Otra Cláusula SQL ";

@XendraTrl(Identifier="bde5d2e5-e05e-4257-078d-79b52ec6d6c7")
public static String es_PE_FIELD_AlertRule_OtherSQLClause_Help="Cualquier otra cláusula completa al gusto GRUPO CERCA, TENIENDO, ORDEN CERCA, Etc. Despues DONDE cláusula.";

@XendraTrl(Identifier="bde5d2e5-e05e-4257-078d-79b52ec6d6c7")
public static String es_PE_FIELD_AlertRule_OtherSQLClause_Name="Otra Cláusula";

@XendraField(AD_Column_ID="OtherClause",IsCentrallyMaintained=true,
AD_Tab_ID="dfe87cf6-1f8b-3099-9379-b03c199ba91c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bde5d2e5-e05e-4257-078d-79b52ec6d6c7")
public static final String FIELDNAME_AlertRule_OtherSQLClause="bde5d2e5-e05e-4257-078d-79b52ec6d6c7";

@XendraTrl(Identifier="496d081e-c07e-bdef-2d3b-626f95d41e8a")
public static String es_PE_COLUMN_OtherClause_Name="Otra Cláusula";

@XendraColumn(AD_Element_ID="bf9f57e0-0ef0-76eb-e275-e43e5bab2a49",ColumnName="OtherClause",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="496d081e-c07e-bdef-2d3b-626f95d41e8a",
Synchronized="2017-08-05 16:52:21.0")
/** Column name OtherClause */
public static final String COLUMNNAME_OtherClause = "OtherClause";
/** Set Post Processing.
@param PostProcessing Process SQL after executing the query */
public void setPostProcessing (String PostProcessing)
{
set_Value (COLUMNNAME_PostProcessing, PostProcessing);
}
/** Get Post Processing.
@return Process SQL after executing the query */
public String getPostProcessing() 
{
String value = (String)get_Value(COLUMNNAME_PostProcessing);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="8afdddfe-4c69-bda3-50e3-a90e2056a295")
public static String es_PE_FIELD_AlertRule_PostProcessing_Description="Fila de proceso de fila (proceso no fijado)";

@XendraTrl(Identifier="8afdddfe-4c69-bda3-50e3-a90e2056a295")
public static String es_PE_FIELD_AlertRule_PostProcessing_Name="Acción SQL Procesador de Línea";

@XendraField(AD_Column_ID="PostProcessing",IsCentrallyMaintained=true,
AD_Tab_ID="dfe87cf6-1f8b-3099-9379-b03c199ba91c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8afdddfe-4c69-bda3-50e3-a90e2056a295")
public static final String FIELDNAME_AlertRule_PostProcessing="8afdddfe-4c69-bda3-50e3-a90e2056a295";

@XendraTrl(Identifier="dcbf1ae1-b2a8-1124-3409-705d3299e33f")
public static String es_PE_COLUMN_PostProcessing_Name="Acción SQL Procesador de Línea";

@XendraColumn(AD_Element_ID="e3928c4d-d314-898e-6133-1da8b40ce890",ColumnName="PostProcessing",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dcbf1ae1-b2a8-1124-3409-705d3299e33f",
Synchronized="2017-08-05 16:52:21.0")
/** Column name PostProcessing */
public static final String COLUMNNAME_PostProcessing = "PostProcessing";
/** Set Pre Processing.
@param PreProcessing Process SQL before executing the query */
public void setPreProcessing (String PreProcessing)
{
set_Value (COLUMNNAME_PreProcessing, PreProcessing);
}
/** Get Pre Processing.
@return Process SQL before executing the query */
public String getPreProcessing() 
{
String value = (String)get_Value(COLUMNNAME_PreProcessing);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="f05d1bda-b409-d39d-c1b4-9cfd5a41d40f")
public static String es_PE_FIELD_AlertRule_PreProcessing_Description="Sistema del SQL de proceso (no fila-por-fila)";

@XendraTrl(Identifier="f05d1bda-b409-d39d-c1b4-9cfd5a41d40f")
public static String es_PE_FIELD_AlertRule_PreProcessing_Name="Acción SQL Grupo de Procesos";

@XendraField(AD_Column_ID="PreProcessing",IsCentrallyMaintained=true,
AD_Tab_ID="dfe87cf6-1f8b-3099-9379-b03c199ba91c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f05d1bda-b409-d39d-c1b4-9cfd5a41d40f")
public static final String FIELDNAME_AlertRule_PreProcessing="f05d1bda-b409-d39d-c1b4-9cfd5a41d40f";

@XendraTrl(Identifier="24562e11-9912-140e-dd76-b31940a04d8b")
public static String es_PE_COLUMN_PreProcessing_Name="Acción SQL Grupo de Procesos";

@XendraColumn(AD_Element_ID="9b6fd84d-92e3-c81a-1f90-e9192cd0c67a",ColumnName="PreProcessing",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="24562e11-9912-140e-dd76-b31940a04d8b",
Synchronized="2017-08-05 16:52:21.0")
/** Column name PreProcessing */
public static final String COLUMNNAME_PreProcessing = "PreProcessing";
/** Set Sql SELECT.
@param SelectClause SQL SELECT clause */
public void setSelectClause (String SelectClause)
{
if (SelectClause == null) throw new IllegalArgumentException ("SelectClause is mandatory.");
set_Value (COLUMNNAME_SelectClause, SelectClause);
}
/** Get Sql SELECT.
@return SQL SELECT clause */
public String getSelectClause() 
{
String value = (String)get_Value(COLUMNNAME_SelectClause);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="9a2cc3e4-71f9-9811-d6a9-b2eea29b8547")
public static String es_PE_FIELD_AlertRule_SqlSELECT_Description="Seleccione la cláusula";

@XendraTrl(Identifier="9a2cc3e4-71f9-9811-d6a9-b2eea29b8547")
public static String es_PE_FIELD_AlertRule_SqlSELECT_Help="La Cláusula Select indica la cláusula SQL SELECT a usar para seleccionar el registro en un cálculo de medida";

@XendraTrl(Identifier="9a2cc3e4-71f9-9811-d6a9-b2eea29b8547")
public static String es_PE_FIELD_AlertRule_SqlSELECT_Name="Cláusula Select ";

@XendraField(AD_Column_ID="SelectClause",IsCentrallyMaintained=true,
AD_Tab_ID="dfe87cf6-1f8b-3099-9379-b03c199ba91c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9a2cc3e4-71f9-9811-d6a9-b2eea29b8547")
public static final String FIELDNAME_AlertRule_SqlSELECT="9a2cc3e4-71f9-9811-d6a9-b2eea29b8547";

@XendraTrl(Identifier="5db79632-7bb8-e3c0-d3d3-95492f27e4c4")
public static String es_PE_COLUMN_SelectClause_Name="Cláusula Select ";

@XendraColumn(AD_Element_ID="0cde47ad-0d12-516f-0d2f-d5ecebf7514e",ColumnName="SelectClause",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5db79632-7bb8-e3c0-d3d3-95492f27e4c4",
Synchronized="2017-08-05 16:52:21.0")
/** Column name SelectClause */
public static final String COLUMNNAME_SelectClause = "SelectClause";
/** Set Sql WHERE.
@param WhereClause Fully qualified SQL WHERE clause */
public void setWhereClause (String WhereClause)
{
set_Value (COLUMNNAME_WhereClause, WhereClause);
}
/** Get Sql WHERE.
@return Fully qualified SQL WHERE clause */
public String getWhereClause() 
{
String value = (String)get_Value(COLUMNNAME_WhereClause);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="ee3f365d-8672-4a54-dee7-521c57cd2b38")
public static String es_PE_FIELD_AlertRule_SqlWHERE_Description="Cláusula WHERE completamente calificada";

@XendraTrl(Identifier="ee3f365d-8672-4a54-dee7-521c57cd2b38")
public static String es_PE_FIELD_AlertRule_SqlWHERE_Help="La cláusula Where indica la cláusula SQL WHERE a usar para la selección del registro";

@XendraTrl(Identifier="ee3f365d-8672-4a54-dee7-521c57cd2b38")
public static String es_PE_FIELD_AlertRule_SqlWHERE_Name="Cláusula Where SQL";

@XendraField(AD_Column_ID="WhereClause",IsCentrallyMaintained=true,
AD_Tab_ID="dfe87cf6-1f8b-3099-9379-b03c199ba91c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ee3f365d-8672-4a54-dee7-521c57cd2b38")
public static final String FIELDNAME_AlertRule_SqlWHERE="ee3f365d-8672-4a54-dee7-521c57cd2b38";

@XendraTrl(Identifier="2c299d6a-70b5-f6c1-83d1-c5e0510d3540")
public static String es_PE_COLUMN_WhereClause_Name="Cláusula Where SQL";

@XendraColumn(AD_Element_ID="7528e2a5-0b7f-8c17-e919-8343497249ca",ColumnName="WhereClause",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2c299d6a-70b5-f6c1-83d1-c5e0510d3540",
Synchronized="2017-08-05 16:52:21.0")
/** Column name WhereClause */
public static final String COLUMNNAME_WhereClause = "WhereClause";
}
