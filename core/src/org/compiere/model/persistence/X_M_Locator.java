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
/** Generated Model for M_Locator
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_Locator extends PO
{
/** Standard Constructor
@param ctx context
@param M_Locator_ID id
@param trxName transaction
*/
public X_M_Locator (Properties ctx, int M_Locator_ID, String trxName)
{
super (ctx, M_Locator_ID, trxName);
/** if (M_Locator_ID == 0)
{
setIsDefault (false);	
// N
setM_Locator_ID (0);
setM_Warehouse_ID (0);
setPriorityNo (0);	
// 50
setValue (null);
setX (null);
setY (null);
setZ (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_Locator (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=207 */
public static int Table_ID=MTable.getTable_ID("M_Locator");

@XendraTrl(Identifier="5640a18f-e029-ec46-9391-fdb04c20c9d5")
public static String es_PE_TAB_Locator_Description="Ubicación";

@XendraTrl(Identifier="5640a18f-e029-ec46-9391-fdb04c20c9d5")
public static String es_PE_TAB_Locator_Help="La pestaña de Ubicación define las localizaciones de un almacén.";

@XendraTrl(Identifier="5640a18f-e029-ec46-9391-fdb04c20c9d5")
public static String es_PE_TAB_Locator_Name="Ubicación";
@XendraTab(Name="Locator",
Description="Locator",Help="The Locator Tab defines any Locators for that Warehouse.",
AD_Window_ID="46ccc992-68c0-cc7a-5da1-f15017ce2fce",SeqNo=20,TabLevel=1,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="5640a18f-e029-ec46-9391-fdb04c20c9d5",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Locator="5640a18f-e029-ec46-9391-fdb04c20c9d5";

@XendraTrl(Identifier="fc67ed5c-1e66-6f17-a8ce-18764108eb97")
public static String es_PE_TABLE_M_Locator_Name="Ubicación";

@XendraTable(Name="Locator",AD_Package_ID="2809ac2d-7d43-20f8-05f0-a478f2e50204",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Warehouse Locator",Help="",
TableName="M_Locator",AccessLevel="7",AD_Window_ID="46ccc992-68c0-cc7a-5da1-f15017ce2fce",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=85,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="fc67ed5c-1e66-6f17-a8ce-18764108eb97",Synchronized="2020-12-13 11:16:26.0")
/** TableName=M_Locator */
public static final String Table_Name="M_Locator";


@XendraIndex(Name="m_location_where",Identifier="4a7204d5-4c97-b57e-c2de-70f2a516458e",
Column_Names="m_warehouse_id, x, y, z",IsUnique="true",
TableIdentifier="4a7204d5-4c97-b57e-c2de-70f2a516458e",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_m_location_where = "4a7204d5-4c97-b57e-c2de-70f2a516458e";


@XendraIndex(Name="m_locator_identifier",Identifier="0b7497e7-0265-4f95-98e2-35506bed788a",
Column_Names="identifier",IsUnique="false",TableIdentifier="0b7497e7-0265-4f95-98e2-35506bed788a",
Synchronized="2020-11-02 17:48:51.0")
public static final String INDEXNAME_m_locator_identifier = "0b7497e7-0265-4f95-98e2-35506bed788a";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_Locator");

protected BigDecimal accessLevel = BigDecimal.valueOf(7);
/** AccessLevel
@return 7 - System - Client - Org 
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
    Table_ID = MTable.getTable_ID("M_Locator");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_Locator[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Alias.
@param Alias Defines an alternate method of indicating an account combination. */
public void setAlias (String Alias)
{
if (Alias != null && Alias.length() > 1)
{
log.warning("Length > 1 - truncated");
Alias = Alias.substring(0,0);
}
set_Value (COLUMNNAME_Alias, Alias);
}
/** Get Alias.
@return Defines an alternate method of indicating an account combination. */
public String getAlias() 
{
String value = (String)get_Value(COLUMNNAME_Alias);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="466457e0-9417-3a07-01cc-2d01ac506c64")
public static String es_PE_FIELD_Locator_Alias_Name="Alias";

@XendraTrl(Identifier="466457e0-9417-3a07-01cc-2d01ac506c64")
public static String es_PE_FIELD_Locator_Alias_Description="Define un método alterno de identificar una combinación de cuenta";

@XendraTrl(Identifier="466457e0-9417-3a07-01cc-2d01ac506c64")
public static String es_PE_FIELD_Locator_Alias_Help="El campo Alias le permite identificar un método alterno para referirse a una combinación completa de cuenta. Por Ej.; La cuenta por cobrar para Garden World puede tener el alias de  GW_AR.";

@XendraField(AD_Column_ID="Alias",IsCentrallyMaintained=true,
AD_Tab_ID="5640a18f-e029-ec46-9391-fdb04c20c9d5",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="466457e0-9417-3a07-01cc-2d01ac506c64")
public static final String FIELDNAME_Locator_Alias="466457e0-9417-3a07-01cc-2d01ac506c64";

@XendraTrl(Identifier="7ea2ca4a-7568-ef06-22bb-6a553882943d")
public static String es_PE_COLUMN_Alias_Name="Alias";

@XendraColumn(AD_Element_ID="eb2b55b1-1094-cce9-62c7-fbcb31313519",ColumnName="Alias",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7ea2ca4a-7568-ef06-22bb-6a553882943d",
Synchronized="2020-12-13 11:03:02.0")
/** Column name Alias */
public static final String COLUMNNAME_Alias = "Alias";
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
@XendraTrl(Identifier="d78dbc1c-e403-481a-ad67-360649307b38")
public static String es_PE_FIELD_Locator_Identifier_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="5640a18f-e029-ec46-9391-fdb04c20c9d5",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=36,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2020-12-13 11:16:25.0",
Identifier="d78dbc1c-e403-481a-ad67-360649307b38")
public static final String FIELDNAME_Locator_Identifier="d78dbc1c-e403-481a-ad67-360649307b38";

@XendraTrl(Identifier="7544fc43-86c8-4962-9b82-1bed44f1ada0")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7544fc43-86c8-4962-9b82-1bed44f1ada0",
Synchronized="2020-12-13 11:03:02.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Default.
@param IsDefault Default value */
public void setIsDefault (boolean IsDefault)
{
set_Value (COLUMNNAME_IsDefault, Boolean.valueOf(IsDefault));
}
/** Get Default.
@return Default value */
public boolean isDefault() 
{
Object oo = get_Value(COLUMNNAME_IsDefault);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="b78265d1-63e8-7216-4151-a530a55baee3")
public static String es_PE_FIELD_Locator_Default_Name="Predeterminado";

@XendraTrl(Identifier="b78265d1-63e8-7216-4151-a530a55baee3")
public static String es_PE_FIELD_Locator_Default_Description="Valor Predeterminado";

@XendraTrl(Identifier="b78265d1-63e8-7216-4151-a530a55baee3")
public static String es_PE_FIELD_Locator_Default_Help="El cuadro de verificación indica si este registro será usado como un valor predeterminado";

@XendraField(AD_Column_ID="IsDefault",IsCentrallyMaintained=true,
AD_Tab_ID="5640a18f-e029-ec46-9391-fdb04c20c9d5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b78265d1-63e8-7216-4151-a530a55baee3")
public static final String FIELDNAME_Locator_Default="b78265d1-63e8-7216-4151-a530a55baee3";

@XendraTrl(Identifier="02c704f1-5625-8165-5090-c4babedcb235")
public static String es_PE_COLUMN_IsDefault_Name="Predeterminado";

@XendraColumn(AD_Element_ID="8617f892-e113-a5fd-8715-687f792f136c",ColumnName="IsDefault",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="02c704f1-5625-8165-5090-c4babedcb235",
Synchronized="2020-12-13 11:03:02.0")
/** Column name IsDefault */
public static final String COLUMNNAME_IsDefault = "IsDefault";
/** Set Locator.
@param M_Locator_ID Warehouse Locator */
public void setM_Locator_ID (int M_Locator_ID)
{
if (M_Locator_ID < 1) throw new IllegalArgumentException ("M_Locator_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_Locator_ID, Integer.valueOf(M_Locator_ID));
}
/** Get Locator.
@return Warehouse Locator */
public int getM_Locator_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Locator_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="55c3380d-4638-e09f-f37f-adc796fef2c0")
public static String es_PE_FIELD_Locator_Locator_Name="Ubicación";

@XendraTrl(Identifier="55c3380d-4638-e09f-f37f-adc796fef2c0")
public static String es_PE_FIELD_Locator_Locator_Description="Ubicación de Almacén";

@XendraTrl(Identifier="55c3380d-4638-e09f-f37f-adc796fef2c0")
public static String es_PE_FIELD_Locator_Locator_Help="El ID de la ubicación indica en que parte del almacén se localiza el producto";

@XendraField(AD_Column_ID="M_Locator_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5640a18f-e029-ec46-9391-fdb04c20c9d5",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="55c3380d-4638-e09f-f37f-adc796fef2c0")
public static final String FIELDNAME_Locator_Locator="55c3380d-4638-e09f-f37f-adc796fef2c0";
/** Column name M_Locator_ID */
public static final String COLUMNNAME_M_Locator_ID = "M_Locator_ID";
/** Set Warehouse.
@param M_Warehouse_ID Storage Warehouse and Service Point */
public void setM_Warehouse_ID (int M_Warehouse_ID)
{
if (M_Warehouse_ID < 1) throw new IllegalArgumentException ("M_Warehouse_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_Warehouse_ID, Integer.valueOf(M_Warehouse_ID));
}
/** Get Warehouse.
@return Storage Warehouse and Service Point */
public int getM_Warehouse_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Warehouse_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2eb9f606-2d92-b116-f3af-3006c89b21f5")
public static String es_PE_FIELD_Locator_Warehouse_Name="Almacén";

@XendraTrl(Identifier="2eb9f606-2d92-b116-f3af-3006c89b21f5")
public static String es_PE_FIELD_Locator_Warehouse_Description="Almacén";

@XendraTrl(Identifier="2eb9f606-2d92-b116-f3af-3006c89b21f5")
public static String es_PE_FIELD_Locator_Warehouse_Help="El Almacén indica un Almacén único donde los productos son almacenados";

@XendraField(AD_Column_ID="M_Warehouse_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5640a18f-e029-ec46-9391-fdb04c20c9d5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2eb9f606-2d92-b116-f3af-3006c89b21f5")
public static final String FIELDNAME_Locator_Warehouse="2eb9f606-2d92-b116-f3af-3006c89b21f5";

@XendraTrl(Identifier="9a5d3f06-120d-3eb6-5925-11430b2922da")
public static String es_PE_COLUMN_M_Warehouse_ID_Name="Almacén";

@XendraColumn(AD_Element_ID="402045cd-baa5-aeaf-b148-a921dffb7821",ColumnName="M_Warehouse_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9a5d3f06-120d-3eb6-5925-11430b2922da",
Synchronized="2020-12-13 11:03:02.0")
/** Column name M_Warehouse_ID */
public static final String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
/** Set Relative Priority.
@param PriorityNo Where inventory should be picked from first */
public void setPriorityNo (int PriorityNo)
{
set_Value (COLUMNNAME_PriorityNo, Integer.valueOf(PriorityNo));
}
/** Get Relative Priority.
@return Where inventory should be picked from first */
public int getPriorityNo() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PriorityNo);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="28b01cc8-078d-f1fd-ef11-e0ea60878aee")
public static String es_PE_FIELD_Locator_RelativePriority_Name="Prioridad Relativa";

@XendraTrl(Identifier="28b01cc8-078d-f1fd-ef11-e0ea60878aee")
public static String es_PE_FIELD_Locator_RelativePriority_Description="De donde se seleccionará primero el inventario";

@XendraTrl(Identifier="28b01cc8-078d-f1fd-ef11-e0ea60878aee")
public static String es_PE_FIELD_Locator_RelativePriority_Help="La prioridad relativa indica la ubicación desde la que se va a seleccionar primero un producto si está almacenado en más de una ubicación (0 = la más alta prioridad)";

@XendraField(AD_Column_ID="PriorityNo",IsCentrallyMaintained=true,
AD_Tab_ID="5640a18f-e029-ec46-9391-fdb04c20c9d5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="28b01cc8-078d-f1fd-ef11-e0ea60878aee")
public static final String FIELDNAME_Locator_RelativePriority="28b01cc8-078d-f1fd-ef11-e0ea60878aee";

@XendraTrl(Identifier="9d566f39-58c6-23d6-e963-6be3680f1bb3")
public static String es_PE_COLUMN_PriorityNo_Name="Prioridad Relativa";

@XendraColumn(AD_Element_ID="46b02cc0-8cc4-1c26-6b1e-a4fe0a6a4b7f",ColumnName="PriorityNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="50",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9d566f39-58c6-23d6-e963-6be3680f1bb3",
Synchronized="2020-12-13 11:03:02.0")
/** Column name PriorityNo */
public static final String COLUMNNAME_PriorityNo = "PriorityNo";
/** Set Search Key.
@param Value Search key for the record in the format required - must be unique */
public void setValue (String Value)
{
if (Value == null) throw new IllegalArgumentException ("Value is mandatory.");
if (Value.length() > 40)
{
log.warning("Length > 40 - truncated");
Value = Value.substring(0,39);
}
set_Value (COLUMNNAME_Value, Value);
}
/** Get Search Key.
@return Search key for the record in the format required - must be unique */
public String getValue() 
{
String value = (String)get_Value(COLUMNNAME_Value);
if (value == null)
  return "";
return value;
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getValue());
}

@XendraTrl(Identifier="59feaf3e-ecb9-0f3e-bae3-cfe89dec5ab5")
public static String es_PE_FIELD_Locator_SearchKey_Name="Clave de Búsqueda";

@XendraTrl(Identifier="59feaf3e-ecb9-0f3e-bae3-cfe89dec5ab5")
public static String es_PE_FIELD_Locator_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="59feaf3e-ecb9-0f3e-bae3-cfe89dec5ab5")
public static String es_PE_FIELD_Locator_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="5640a18f-e029-ec46-9391-fdb04c20c9d5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="59feaf3e-ecb9-0f3e-bae3-cfe89dec5ab5")
public static final String FIELDNAME_Locator_SearchKey="59feaf3e-ecb9-0f3e-bae3-cfe89dec5ab5";

@XendraTrl(Identifier="a3f36bf2-26a2-0bcb-f390-d1c3f0040c21")
public static String es_PE_COLUMN_Value_Name="Clave de Búsqueda";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a3f36bf2-26a2-0bcb-f390-d1c3f0040c21",
Synchronized="2020-12-13 11:03:02.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
/** Set Volume.
@param Volume Volume of a product */
public void setVolume (BigDecimal Volume)
{
set_Value (COLUMNNAME_Volume, Volume);
}
/** Get Volume.
@return Volume of a product */
public BigDecimal getVolume() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Volume);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="a2cb1f1a-ba2a-48fc-96c9-ec8ce22cfce9")
public static String es_PE_FIELD_Locator_Volume_Name="Volúmen";

@XendraTrl(Identifier="a2cb1f1a-ba2a-48fc-96c9-ec8ce22cfce9")
public static String es_PE_FIELD_Locator_Volume_Description="Volúmen del producto";

@XendraTrl(Identifier="a2cb1f1a-ba2a-48fc-96c9-ec8ce22cfce9")
public static String es_PE_FIELD_Locator_Volume_Help="El Volumen indica el volumen del producto en la UM de volúmen del cliente";

@XendraField(AD_Column_ID="Volume",IsCentrallyMaintained=true,
AD_Tab_ID="5640a18f-e029-ec46-9391-fdb04c20c9d5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2020-12-13 11:16:25.0",
Identifier="a2cb1f1a-ba2a-48fc-96c9-ec8ce22cfce9")
public static final String FIELDNAME_Locator_Volume="a2cb1f1a-ba2a-48fc-96c9-ec8ce22cfce9";

@XendraTrl(Identifier="f59e8686-80e0-4624-a0b5-d2a768e8971b")
public static String es_PE_COLUMN_Volume_Name="Volume";

@XendraColumn(AD_Element_ID="464c5f3e-92af-e641-7d3a-e7e5427af367",ColumnName="Volume",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f59e8686-80e0-4624-a0b5-d2a768e8971b",
Synchronized="2020-12-13 11:03:02.0")
/** Column name Volume */
public static final String COLUMNNAME_Volume = "Volume";
/** Set Weight.
@param Weight Weight of a product */
public void setWeight (BigDecimal Weight)
{
set_Value (COLUMNNAME_Weight, Weight);
}
/** Get Weight.
@return Weight of a product */
public BigDecimal getWeight() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Weight);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="cb54684d-04de-4bf3-90f7-d9f009a13116")
public static String es_PE_FIELD_Locator_Weight_Name="Peso";

@XendraTrl(Identifier="cb54684d-04de-4bf3-90f7-d9f009a13116")
public static String es_PE_FIELD_Locator_Weight_Description="Peso del producto";

@XendraTrl(Identifier="cb54684d-04de-4bf3-90f7-d9f009a13116")
public static String es_PE_FIELD_Locator_Weight_Help="El peso indica el peso del producto en la UM de peso del cliente.";

@XendraField(AD_Column_ID="Weight",IsCentrallyMaintained=true,
AD_Tab_ID="5640a18f-e029-ec46-9391-fdb04c20c9d5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2020-12-13 11:16:25.0",
Identifier="cb54684d-04de-4bf3-90f7-d9f009a13116")
public static final String FIELDNAME_Locator_Weight="cb54684d-04de-4bf3-90f7-d9f009a13116";

@XendraTrl(Identifier="17a1d0e1-7c67-4857-8007-11cf9da9633b")
public static String es_PE_COLUMN_Weight_Name="Weight";

@XendraColumn(AD_Element_ID="712867f4-95e8-b3a8-b07b-f884a12efbb4",ColumnName="Weight",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="17a1d0e1-7c67-4857-8007-11cf9da9633b",
Synchronized="2020-12-13 11:03:02.0")
/** Column name Weight */
public static final String COLUMNNAME_Weight = "Weight";
/** Set Aisle (X).
@param X X dimension, e.g., Aisle */
public void setX (String X)
{
if (X == null) throw new IllegalArgumentException ("X is mandatory.");
if (X.length() > 60)
{
log.warning("Length > 60 - truncated");
X = X.substring(0,59);
}
set_Value (COLUMNNAME_X, X);
}
/** Get Aisle (X).
@return X dimension, e.g., Aisle */
public String getX() 
{
String value = (String)get_Value(COLUMNNAME_X);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="2caae405-0086-8df4-2f7c-5655065685cb")
public static String es_PE_FIELD_Locator_AisleX_Name="Rack";

@XendraTrl(Identifier="2caae405-0086-8df4-2f7c-5655065685cb")
public static String es_PE_FIELD_Locator_AisleX_Description="Dimensión X; Ej. Pasillo";

@XendraTrl(Identifier="2caae405-0086-8df4-2f7c-5655065685cb")
public static String es_PE_FIELD_Locator_AisleX_Help="La dimensión X indica el Pasillo en donde un producto está localizado";

@XendraField(AD_Column_ID="X",IsCentrallyMaintained=true,
AD_Tab_ID="5640a18f-e029-ec46-9391-fdb04c20c9d5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2caae405-0086-8df4-2f7c-5655065685cb")
public static final String FIELDNAME_Locator_AisleX="2caae405-0086-8df4-2f7c-5655065685cb";

@XendraTrl(Identifier="d1646b07-6e59-db9e-997e-0c6dab21a14a")
public static String es_PE_COLUMN_X_Name="Rack";

@XendraColumn(AD_Element_ID="c3c6ff0a-ca8d-218c-5162-6fda8fc182e7",ColumnName="X",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d1646b07-6e59-db9e-997e-0c6dab21a14a",
Synchronized="2020-12-13 11:03:02.0")
/** Column name X */
public static final String COLUMNNAME_X = "X";
/** Set Bin (Y).
@param Y Y dimension, e.g., Bin */
public void setY (String Y)
{
if (Y == null) throw new IllegalArgumentException ("Y is mandatory.");
if (Y.length() > 60)
{
log.warning("Length > 60 - truncated");
Y = Y.substring(0,59);
}
set_Value (COLUMNNAME_Y, Y);
}
/** Get Bin (Y).
@return Y dimension, e.g., Bin */
public String getY() 
{
String value = (String)get_Value(COLUMNNAME_Y);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="68227542-2891-fb88-6142-8d7386648ad5")
public static String es_PE_FIELD_Locator_BinY_Name="Columna";

@XendraTrl(Identifier="68227542-2891-fb88-6142-8d7386648ad5")
public static String es_PE_FIELD_Locator_BinY_Description="Dimensión Y; Ej. Cajón";

@XendraTrl(Identifier="68227542-2891-fb88-6142-8d7386648ad5")
public static String es_PE_FIELD_Locator_BinY_Help="La dimensión Y indica el anaquel en que un producto está localizado";

@XendraField(AD_Column_ID="Y",IsCentrallyMaintained=true,
AD_Tab_ID="5640a18f-e029-ec46-9391-fdb04c20c9d5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="68227542-2891-fb88-6142-8d7386648ad5")
public static final String FIELDNAME_Locator_BinY="68227542-2891-fb88-6142-8d7386648ad5";

@XendraTrl(Identifier="22cdfbed-41bf-731d-ccf3-68df9370821a")
public static String es_PE_COLUMN_Y_Name="Columna";

@XendraColumn(AD_Element_ID="1bd4acc9-4368-301e-254c-862fd2d7d43b",ColumnName="Y",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="22cdfbed-41bf-731d-ccf3-68df9370821a",
Synchronized="2020-12-13 11:03:02.0")
/** Column name Y */
public static final String COLUMNNAME_Y = "Y";
/** Set Level (Z).
@param Z Z dimension, e.g., Level */
public void setZ (String Z)
{
if (Z == null) throw new IllegalArgumentException ("Z is mandatory.");
if (Z.length() > 60)
{
log.warning("Length > 60 - truncated");
Z = Z.substring(0,59);
}
set_Value (COLUMNNAME_Z, Z);
}
/** Get Level (Z).
@return Z dimension, e.g., Level */
public String getZ() 
{
String value = (String)get_Value(COLUMNNAME_Z);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="9cec79f6-5789-4d9d-fc9f-bab8aec5d6f0")
public static String es_PE_FIELD_Locator_LevelZ_Name="Nivel ";

@XendraTrl(Identifier="9cec79f6-5789-4d9d-fc9f-bab8aec5d6f0")
public static String es_PE_FIELD_Locator_LevelZ_Description="Dimensión Z; Ej. nivel";

@XendraTrl(Identifier="9cec79f6-5789-4d9d-fc9f-bab8aec5d6f0")
public static String es_PE_FIELD_Locator_LevelZ_Help="La dimensión Z indica el nivel en que un producto está localizado.";

@XendraField(AD_Column_ID="Z",IsCentrallyMaintained=true,
AD_Tab_ID="5640a18f-e029-ec46-9391-fdb04c20c9d5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9cec79f6-5789-4d9d-fc9f-bab8aec5d6f0")
public static final String FIELDNAME_Locator_LevelZ="9cec79f6-5789-4d9d-fc9f-bab8aec5d6f0";

@XendraTrl(Identifier="e292f259-0277-b09a-76e7-8300aa22c6f5")
public static String es_PE_COLUMN_Z_Name="Nivel ";

@XendraColumn(AD_Element_ID="26f6808c-c825-8dcd-13eb-90b1876a3317",ColumnName="Z",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e292f259-0277-b09a-76e7-8300aa22c6f5",
Synchronized="2020-12-13 11:03:02.0")
/** Column name Z */
public static final String COLUMNNAME_Z = "Z";
}
