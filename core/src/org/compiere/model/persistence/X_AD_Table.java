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
import org.compiere.model.reference.REF_AD_TableAccessLevels;
import org.compiere.model.reference.REF_ReplicationType;
/** Generated Model for AD_Table
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Table extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Table_ID id
@param trxName transaction
*/
public X_AD_Table (Properties ctx, int AD_Table_ID, String trxName)
{
super (ctx, AD_Table_ID, trxName);
/** if (AD_Table_ID == 0)
{
setAccessLevel (null);	
// 4
setAD_Table_ID (0);
setEntityType (null);	
// U
setIsChangeLog (false);	
// N
setIsDeleteable (true);	
// Y
setIsHighVolume (false);	
// N
setIsReplicated (false);
setIsSecurityEnabled (false);	
// N
setIsView (false);	
// N
setName (null);
setReplicationType (null);	
// L
setTableName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Table (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=100 */
public static int Table_ID=MTable.getTable_ID("AD_Table");

@XendraTrl(Identifier="19819538-41e6-b846-df11-41bedaec6ab5")
public static String es_PE_TAB_Table_Description="Definiciones de Tabla";

@XendraTrl(Identifier="19819538-41e6-b846-df11-41bedaec6ab5")
public static String es_PE_TAB_Table_Help="Definición del encabezamiento de la tabla";

@XendraTrl(Identifier="19819538-41e6-b846-df11-41bedaec6ab5")
public static String es_PE_TAB_Table_Name="Tabla";
@XendraTab(Name="Table",
Description="Table definitions",
Help="Table (header) definition - Note that the name of most tables is automatically syncronized.",
AD_Window_ID="b5be5fc1-2b79-ff23-e3ac-cfef2c63bb96",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="19819538-41e6-b846-df11-41bedaec6ab5",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Table="19819538-41e6-b846-df11-41bedaec6ab5";

@XendraTrl(Identifier="495f4847-d86e-b15a-b91f-3bb548b82819")
public static String es_PE_TABLE_AD_Table_Name="Tabla";

@XendraTable(Name="Table",Description="Table for the Fields",Help="",TableName="AD_Table",
AccessLevel="4",AD_Window_ID="b5be5fc1-2b79-ff23-e3ac-cfef2c63bb96",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=55,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="495f4847-d86e-b15a-b91f-3bb548b82819",Synchronized="2017-10-15 19:01:49.0")
/** TableName=AD_Table */
public static final String Table_Name="AD_Table";


@XendraIndex(Name="ad_table_name",Identifier="e5918209-018a-69d9-a9a0-d083f94056f8",
Column_Names="tablename",IsUnique="true",TableIdentifier="e5918209-018a-69d9-a9a0-d083f94056f8",
Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_ad_table_name = "e5918209-018a-69d9-a9a0-d083f94056f8";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Table");

protected BigDecimal accessLevel = BigDecimal.valueOf(4);
/** AccessLevel
@return 4 - System 
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
    Table_ID = MTable.getTable_ID("AD_Table");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Table[").append(get_ID()).append("]");
return sb.toString();
}

/** AccessLevel AD_Reference=5684046b-00f0-a17c-843e-efad2b0e42f3 */
public static final int ACCESSLEVEL_AD_Reference_ID=5;
/** Set Data Access Level.
@param AccessLevel Access Level required */
public void setAccessLevel (String AccessLevel)
{
if (AccessLevel == null) throw new IllegalArgumentException ("AccessLevel is mandatory");
if (AccessLevel.equals(REF_AD_TableAccessLevels.SystemPlusClient) || AccessLevel.equals(REF_AD_TableAccessLevels.ClientOnly) || AccessLevel.equals(REF_AD_TableAccessLevels.Organization) || AccessLevel.equals(REF_AD_TableAccessLevels.ClientPlusOrganization) || AccessLevel.equals(REF_AD_TableAccessLevels.SystemOnly) || AccessLevel.equals(REF_AD_TableAccessLevels.All));
 else throw new IllegalArgumentException ("AccessLevel Invalid value - " + AccessLevel + " - Reference_ID=5 - 6 - 2 - 1 - 3 - 4 - 7");
if (AccessLevel.length() > 1)
{
log.warning("Length > 1 - truncated");
AccessLevel = AccessLevel.substring(0,0);
}
set_Value (COLUMNNAME_AccessLevel, AccessLevel);
}
/** Get Data Access Level.
@return Access Level required */
public String getAccessLevel() 
{
return (String)get_Value(COLUMNNAME_AccessLevel);
}

@XendraTrl(Identifier="3c28a1fc-4d88-dbf3-1402-dd92e0af69b9")
public static String es_PE_FIELD_Table_DataAccessLevel_Name="Nivel de Acceso a Datos";

@XendraTrl(Identifier="3c28a1fc-4d88-dbf3-1402-dd92e0af69b9")
public static String es_PE_FIELD_Table_DataAccessLevel_Description="Nivel de Acceso requerido";

@XendraTrl(Identifier="3c28a1fc-4d88-dbf3-1402-dd92e0af69b9")
public static String es_PE_FIELD_Table_DataAccessLevel_Help="Indica el nivel de acceso requerido para este registro ó proceso";

@XendraField(AD_Column_ID="AccessLevel",IsCentrallyMaintained=true,
AD_Tab_ID="19819538-41e6-b846-df11-41bedaec6ab5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3c28a1fc-4d88-dbf3-1402-dd92e0af69b9")
public static final String FIELDNAME_Table_DataAccessLevel="3c28a1fc-4d88-dbf3-1402-dd92e0af69b9";

@XendraTrl(Identifier="c6cded55-2c74-0c2b-bc81-0f404ae0602f")
public static String es_PE_COLUMN_AccessLevel_Name="Nivel de Acceso a Datos";

@XendraColumn(AD_Element_ID="bd129648-2bd8-10dc-6b09-97aa41aa28e2",ColumnName="AccessLevel",
AD_Reference_ID=17,AD_Reference_Value_ID="5684046b-00f0-a17c-843e-efad2b0e42f3",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="4",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c6cded55-2c74-0c2b-bc81-0f404ae0602f",Synchronized="2017-08-28 09:54:51.0")
/** Column name AccessLevel */
public static final String COLUMNNAME_AccessLevel = "AccessLevel";
/** Set AD_Rule_ID.
@param AD_Rule_ID AD_Rule_ID */
public void setAD_Rule_ID (int AD_Rule_ID)
{
if (AD_Rule_ID <= 0) set_Value (COLUMNNAME_AD_Rule_ID, null);
 else 
set_Value (COLUMNNAME_AD_Rule_ID, Integer.valueOf(AD_Rule_ID));
}
/** Get AD_Rule_ID.
@return AD_Rule_ID */
public int getAD_Rule_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Rule_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5d31e834-5123-4468-929a-f73f32f065d9")
public static String es_PE_FIELD_Table_AD_Rule_ID_Name="Rule";

@XendraField(AD_Column_ID="AD_Rule_ID",IsCentrallyMaintained=true,
AD_Tab_ID="19819538-41e6-b846-df11-41bedaec6ab5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-04-04 14:31:11.0",
Identifier="5d31e834-5123-4468-929a-f73f32f065d9")
public static final String FIELDNAME_Table_AD_Rule_ID="5d31e834-5123-4468-929a-f73f32f065d9";

@XendraTrl(Identifier="202be85d-7280-4f04-8040-0e600f42da7e")
public static String es_PE_COLUMN_AD_Rule_ID_Name="AD_Rule_ID";

@XendraColumn(AD_Element_ID="4b4afdeb-6aca-d182-6e3a-83f0f6d29f7d",ColumnName="AD_Rule_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="202be85d-7280-4f04-8040-0e600f42da7e",
Synchronized="2017-08-28 09:54:51.0")
/** Column name AD_Rule_ID */
public static final String COLUMNNAME_AD_Rule_ID = "AD_Rule_ID";
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

@XendraTrl(Identifier="671075a5-97b7-9b67-0fbf-be757d5cc4ee")
public static String es_PE_FIELD_Table_Table_Name="Tabla";

@XendraTrl(Identifier="671075a5-97b7-9b67-0fbf-be757d5cc4ee")
public static String es_PE_FIELD_Table_Table_Description="Tabla para los campos";

@XendraTrl(Identifier="671075a5-97b7-9b67-0fbf-be757d5cc4ee")
public static String es_PE_FIELD_Table_Table_Help="La Tabla indica una tabla en la que reside un campo ó campos.";

@XendraField(AD_Column_ID="AD_Table_ID",IsCentrallyMaintained=true,
AD_Tab_ID="19819538-41e6-b846-df11-41bedaec6ab5",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="671075a5-97b7-9b67-0fbf-be757d5cc4ee")
public static final String FIELDNAME_Table_Table="671075a5-97b7-9b67-0fbf-be757d5cc4ee";
/** Column name AD_Table_ID */
public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
/** Set Dynamic Validation.
@param AD_Val_Rule_ID Dynamic Validation Rule */
public void setAD_Val_Rule_ID (int AD_Val_Rule_ID)
{
if (AD_Val_Rule_ID <= 0) set_Value (COLUMNNAME_AD_Val_Rule_ID, null);
 else 
set_Value (COLUMNNAME_AD_Val_Rule_ID, Integer.valueOf(AD_Val_Rule_ID));
}
/** Get Dynamic Validation.
@return Dynamic Validation Rule */
public int getAD_Val_Rule_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Val_Rule_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8d27e78c-e570-a116-3db0-56c9a95edaba")
public static String es_PE_FIELD_Table_DynamicValidation_Name="Validación";

@XendraTrl(Identifier="8d27e78c-e570-a116-3db0-56c9a95edaba")
public static String es_PE_FIELD_Table_DynamicValidation_Description="Regla de validación";

@XendraTrl(Identifier="8d27e78c-e570-a116-3db0-56c9a95edaba")
public static String es_PE_FIELD_Table_DynamicValidation_Help="La Regla de validación indica una regla de validación única en el sistema. Esas reglas definen como una entidad se determina como válida ó inválida.";

@XendraField(AD_Column_ID="AD_Val_Rule_ID",IsCentrallyMaintained=true,
AD_Tab_ID="19819538-41e6-b846-df11-41bedaec6ab5",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8d27e78c-e570-a116-3db0-56c9a95edaba")
public static final String FIELDNAME_Table_DynamicValidation="8d27e78c-e570-a116-3db0-56c9a95edaba";

@XendraTrl(Identifier="3294dec0-e934-e1b0-6229-71fbdafc17f8")
public static String es_PE_COLUMN_AD_Val_Rule_ID_Name="Validación";

@XendraColumn(AD_Element_ID="c0a45383-82fd-7e33-a355-80b15115b36b",ColumnName="AD_Val_Rule_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3294dec0-e934-e1b0-6229-71fbdafc17f8",
Synchronized="2017-08-28 09:54:51.0")
/** Column name AD_Val_Rule_ID */
public static final String COLUMNNAME_AD_Val_Rule_ID = "AD_Val_Rule_ID";
/** Set Window.
@param AD_Window_ID Data entry or display window */
public void setAD_Window_ID (int AD_Window_ID)
{
if (AD_Window_ID <= 0) set_Value (COLUMNNAME_AD_Window_ID, null);
 else 
set_Value (COLUMNNAME_AD_Window_ID, Integer.valueOf(AD_Window_ID));
}
/** Get Window.
@return Data entry or display window */
public int getAD_Window_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Window_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="39cdf6da-bb4c-62b3-35a7-784e1d6dcc47")
public static String es_PE_FIELD_Table_Window_Name="Ventana";

@XendraTrl(Identifier="39cdf6da-bb4c-62b3-35a7-784e1d6dcc47")
public static String es_PE_FIELD_Table_Window_Description="Ventana de entrada de datos ó despliegue";

@XendraTrl(Identifier="39cdf6da-bb4c-62b3-35a7-784e1d6dcc47")
public static String es_PE_FIELD_Table_Window_Help="El campo ventana identifica una ventana única en el sistema";

@XendraField(AD_Column_ID="AD_Window_ID",IsCentrallyMaintained=true,
AD_Tab_ID="19819538-41e6-b846-df11-41bedaec6ab5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="39cdf6da-bb4c-62b3-35a7-784e1d6dcc47")
public static final String FIELDNAME_Table_Window="39cdf6da-bb4c-62b3-35a7-784e1d6dcc47";

@XendraTrl(Identifier="0c3643a9-29b9-99fb-7d12-7fda4ed21a8b")
public static String es_PE_COLUMN_AD_Window_ID_Name="Ventana";

@XendraColumn(AD_Element_ID="0c50cb0e-febe-8650-2621-11ba77688276",ColumnName="AD_Window_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0c3643a9-29b9-99fb-7d12-7fda4ed21a8b",
Synchronized="2017-08-28 09:54:51.0")
/** Column name AD_Window_ID */
public static final String COLUMNNAME_AD_Window_ID = "AD_Window_ID";
/** Set Copy Columns From Table.
@param CopyColumnsFromTable Copy Columns From Table */
public void setCopyColumnsFromTable (String CopyColumnsFromTable)
{
if (CopyColumnsFromTable != null && CopyColumnsFromTable.length() > 1)
{
log.warning("Length > 1 - truncated");
CopyColumnsFromTable = CopyColumnsFromTable.substring(0,0);
}
set_Value (COLUMNNAME_CopyColumnsFromTable, CopyColumnsFromTable);
}
/** Get Copy Columns From Table.
@return Copy Columns From Table */
public String getCopyColumnsFromTable() 
{
return (String)get_Value(COLUMNNAME_CopyColumnsFromTable);
}

@XendraTrl(Identifier="9f496593-7c0c-46c9-6cbb-0b53bd6d346b")
public static String es_PE_FIELD_Table_CopyColumnsFromTable_Name="Copiar Columnas desde Tabla";

@XendraTrl(Identifier="9f496593-7c0c-46c9-6cbb-0b53bd6d346b")
public static String es_PE_FIELD_Table_CopyColumnsFromTable_Description="Crear columnas del diccionario para una tabla tomando otra como base";

@XendraField(AD_Column_ID="CopyColumnsFromTable",IsCentrallyMaintained=true,
AD_Tab_ID="19819538-41e6-b846-df11-41bedaec6ab5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9f496593-7c0c-46c9-6cbb-0b53bd6d346b")
public static final String FIELDNAME_Table_CopyColumnsFromTable="9f496593-7c0c-46c9-6cbb-0b53bd6d346b";

@XendraTrl(Identifier="59887c94-8a31-55e5-bb96-e4649f7501a3")
public static String es_PE_COLUMN_CopyColumnsFromTable_Name="Copia Columnas desde Tabla";

@XendraColumn(AD_Element_ID="2680f408-7677-8ee1-fa5b-2a9a8c40c7f5",
ColumnName="CopyColumnsFromTable",AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,
AD_Process_ID="8c7c9cc9-fe24-26f6-b58a-71bba5142133",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="59887c94-8a31-55e5-bb96-e4649f7501a3",
Synchronized="2017-08-28 09:54:51.0")
/** Column name CopyColumnsFromTable */
public static final String COLUMNNAME_CopyColumnsFromTable = "CopyColumnsFromTable";
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

@XendraTrl(Identifier="1e282377-df2c-fe68-e30a-a2c5dbba74e7")
public static String es_PE_FIELD_Table_Description_Name="Observación";

@XendraTrl(Identifier="1e282377-df2c-fe68-e30a-a2c5dbba74e7")
public static String es_PE_FIELD_Table_Description_Description="Observación";

@XendraTrl(Identifier="1e282377-df2c-fe68-e30a-a2c5dbba74e7")
public static String es_PE_FIELD_Table_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="19819538-41e6-b846-df11-41bedaec6ab5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1e282377-df2c-fe68-e30a-a2c5dbba74e7")
public static final String FIELDNAME_Table_Description="1e282377-df2c-fe68-e30a-a2c5dbba74e7";

@XendraTrl(Identifier="13416034-77a5-6a9e-96c9-226e060fc34c")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="13416034-77a5-6a9e-96c9-226e060fc34c",
Synchronized="2017-08-28 09:54:51.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";

/** EntityType AD_Reference=fae4ad31-8ff1-5d5c-8d47-2426c541cd74 */
public static final int ENTITYTYPE_AD_Reference_ID=389;
/** Set Entity Type.
@param EntityType Dictionary Entity Type: Determines ownership and synchronization */
public void setEntityType (String EntityType)
{
if (EntityType.length() > 4)
{
log.warning("Length > 4 - truncated");
EntityType = EntityType.substring(0,3);
}
set_Value (COLUMNNAME_EntityType, EntityType);
}
/** Get Entity Type.
@return Dictionary Entity Type: Determines ownership and synchronization */
public String getEntityType() 
{
return (String)get_Value(COLUMNNAME_EntityType);
}

@XendraTrl(Identifier="bbb313f0-28d9-f505-d128-fb8699a3db1e")
public static String es_PE_FIELD_Table_EntityType_Name="Tipo de Entidad";

@XendraTrl(Identifier="bbb313f0-28d9-f505-d128-fb8699a3db1e")
public static String es_PE_FIELD_Table_EntityType_Description="Tipo de Entidad Diccionario; determina propiedad y sincronización";

@XendraTrl(Identifier="bbb313f0-28d9-f505-d128-fb8699a3db1e")
public static String es_PE_FIELD_Table_EntityType_Help="Los tipos de entidad \"Diccionario\"; \"Adempiere\"; y \"Aplicación\" podrían ser automáticamente sincronizados y las personalizaciones eliminadas ó sobreescritas";

@XendraField(AD_Column_ID="EntityType",IsCentrallyMaintained=true,
AD_Tab_ID="19819538-41e6-b846-df11-41bedaec6ab5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bbb313f0-28d9-f505-d128-fb8699a3db1e")
public static final String FIELDNAME_Table_EntityType="bbb313f0-28d9-f505-d128-fb8699a3db1e";

@XendraTrl(Identifier="ca8c52f2-7903-8095-8896-a7714ea92ccc")
public static String es_PE_COLUMN_EntityType_Name="Tipo de Entidad";

@XendraColumn(AD_Element_ID="5ba917bf-871c-6f19-aa50-962adc5de558",ColumnName="EntityType",
AD_Reference_ID=18,AD_Reference_Value_ID="fae4ad31-8ff1-5d5c-8d47-2426c541cd74",AD_Val_Rule_ID="",
FieldLength=4,DefaultValue="U",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="@EntityType@=D",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="ca8c52f2-7903-8095-8896-a7714ea92ccc",Synchronized="2017-08-28 09:54:51.0")
/** Column name EntityType */
public static final String COLUMNNAME_EntityType = "EntityType";
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

@XendraTrl(Identifier="2029564a-aa5e-3aef-f5cd-05103eaf0e0d")
public static String es_PE_FIELD_Table_CommentHelp_Name="Ayuda";

@XendraTrl(Identifier="2029564a-aa5e-3aef-f5cd-05103eaf0e0d")
public static String es_PE_FIELD_Table_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="2029564a-aa5e-3aef-f5cd-05103eaf0e0d")
public static String es_PE_FIELD_Table_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="19819538-41e6-b846-df11-41bedaec6ab5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2029564a-aa5e-3aef-f5cd-05103eaf0e0d")
public static final String FIELDNAME_Table_CommentHelp="2029564a-aa5e-3aef-f5cd-05103eaf0e0d";

@XendraTrl(Identifier="996f3919-1690-9626-e9e9-5da050c55d0e")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="996f3919-1690-9626-e9e9-5da050c55d0e",
Synchronized="2017-08-28 09:54:51.0")
/** Column name Help */
public static final String COLUMNNAME_Help = "Help";
/** Set ID.
@param ID ID */
public void setID (String ID)
{
set_Value (COLUMNNAME_ID, ID);
}
/** Get ID.
@return ID */
public String getID() 
{
String value = (String)get_Value(COLUMNNAME_ID);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="eb34e93b-b65e-4ad4-bc26-56a4cfb46fec")
public static String es_PE_FIELD_Table_ID_Name="id";
@XendraField(AD_Column_ID="ID",
IsCentrallyMaintained=true,AD_Tab_ID="19819538-41e6-b846-df11-41bedaec6ab5",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=2147483647,IsReadOnly=false,SeqNo=130,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2017-10-15 19:01:49.0",Identifier="eb34e93b-b65e-4ad4-bc26-56a4cfb46fec")
public static final String FIELDNAME_Table_ID="eb34e93b-b65e-4ad4-bc26-56a4cfb46fec";

@XendraTrl(Identifier="a983b43e-64df-4fa6-a592-8f982e53366c")
public static String es_PE_COLUMN_ID_Name="ID";

@XendraColumn(AD_Element_ID="089e82a2-807e-4cc0-96a6-05e479740035",ColumnName="ID",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="a983b43e-64df-4fa6-a592-8f982e53366c",
Synchronized="2017-08-28 09:54:51.0")
/** Column name ID */
public static final String COLUMNNAME_ID = "ID";
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
@XendraTrl(Identifier="31c54a32-e6c4-45c5-8094-810aedcdde6b")
public static String es_PE_FIELD_Table_Identifier_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="19819538-41e6-b846-df11-41bedaec6ab5",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=36,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-04-04 14:31:12.0",
Identifier="31c54a32-e6c4-45c5-8094-810aedcdde6b")
public static final String FIELDNAME_Table_Identifier="31c54a32-e6c4-45c5-8094-810aedcdde6b";

@XendraTrl(Identifier="eaa33e5d-e7de-4de0-ae41-7f3ef32b4eee")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="eaa33e5d-e7de-4de0-ae41-7f3ef32b4eee",
Synchronized="2017-08-28 09:54:51.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Import Table.
@param ImportTable Import Table Columns from Database */
public void setImportTable (String ImportTable)
{
if (ImportTable != null && ImportTable.length() > 1)
{
log.warning("Length > 1 - truncated");
ImportTable = ImportTable.substring(0,0);
}
set_Value (COLUMNNAME_ImportTable, ImportTable);
}
/** Get Import Table.
@return Import Table Columns from Database */
public String getImportTable() 
{
return (String)get_Value(COLUMNNAME_ImportTable);
}

@XendraTrl(Identifier="e760a107-1688-9b1d-c35d-0de76e1ad1b5")
public static String es_PE_FIELD_Table_ImportTable_Name="Crear Cuentas desde BD";

@XendraTrl(Identifier="e760a107-1688-9b1d-c35d-0de76e1ad1b5")
public static String es_PE_FIELD_Table_ImportTable_Description="Crear columnas de diccionario de tabla que no existe como una columna sino en la base de datos";

@XendraTrl(Identifier="e760a107-1688-9b1d-c35d-0de76e1ad1b5")
public static String es_PE_FIELD_Table_ImportTable_Help="Si existen columnas adicionadas a esta tabla en la base de datos; este procedimiento crea los registros de columna en el diccionario. Favor tener en cuenta que si estas columnas no estan definidas como de usuario; ellas pueden ser borradas";

@XendraField(AD_Column_ID="ImportTable",IsCentrallyMaintained=true,
AD_Tab_ID="19819538-41e6-b846-df11-41bedaec6ab5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e760a107-1688-9b1d-c35d-0de76e1ad1b5")
public static final String FIELDNAME_Table_ImportTable="e760a107-1688-9b1d-c35d-0de76e1ad1b5";

@XendraTrl(Identifier="761c01d8-4b78-2a19-3ec0-5b1c7f3214c9")
public static String es_PE_COLUMN_ImportTable_Name="Importar Tabla";

@XendraColumn(AD_Element_ID="599375bf-3fb2-f82b-2043-3a7a7f4b35da",ColumnName="ImportTable",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="143f62fd-832b-2e26-c8ca-e2467cbaeff3",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="761c01d8-4b78-2a19-3ec0-5b1c7f3214c9",Synchronized="2017-08-28 09:54:51.0")
/** Column name ImportTable */
public static final String COLUMNNAME_ImportTable = "ImportTable";
/** Set Maintain Change Log.
@param IsChangeLog Maintain a log of changes */
public void setIsChangeLog (boolean IsChangeLog)
{
set_Value (COLUMNNAME_IsChangeLog, Boolean.valueOf(IsChangeLog));
}
/** Get Maintain Change Log.
@return Maintain a log of changes */
public boolean isChangeLog() 
{
Object oo = get_Value(COLUMNNAME_IsChangeLog);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="d0d796b9-e8c1-b053-14e9-2c88b6940700")
public static String es_PE_FIELD_Table_MaintainChangeLog_Name="Mantenimiento de Cambios de Log";

@XendraTrl(Identifier="d0d796b9-e8c1-b053-14e9-2c88b6940700")
public static String es_PE_FIELD_Table_MaintainChangeLog_Description="Mantenimiento de cambios de registro.";

@XendraTrl(Identifier="d0d796b9-e8c1-b053-14e9-2c88b6940700")
public static String es_PE_FIELD_Table_MaintainChangeLog_Help="Si está seleccionado, un registro de todos los cambios de mantiene.";

@XendraField(AD_Column_ID="IsChangeLog",IsCentrallyMaintained=true,
AD_Tab_ID="19819538-41e6-b846-df11-41bedaec6ab5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d0d796b9-e8c1-b053-14e9-2c88b6940700")
public static final String FIELDNAME_Table_MaintainChangeLog="d0d796b9-e8c1-b053-14e9-2c88b6940700";

@XendraTrl(Identifier="f9bb578f-0e2a-09e6-357c-16dc947ea407")
public static String es_PE_COLUMN_IsChangeLog_Name="Mantenimiento de Cambios de Log";

@XendraColumn(AD_Element_ID="63cfbe02-8817-b677-b5a2-24ed2145326c",ColumnName="IsChangeLog",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f9bb578f-0e2a-09e6-357c-16dc947ea407",
Synchronized="2017-08-28 09:54:51.0")
/** Column name IsChangeLog */
public static final String COLUMNNAME_IsChangeLog = "IsChangeLog";
/** Set Records deleteable.
@param IsDeleteable Indicates if records can be deleted from the database */
public void setIsDeleteable (boolean IsDeleteable)
{
set_Value (COLUMNNAME_IsDeleteable, Boolean.valueOf(IsDeleteable));
}
/** Get Records deleteable.
@return Indicates if records can be deleted from the database */
public boolean isDeleteable() 
{
Object oo = get_Value(COLUMNNAME_IsDeleteable);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="ff9ee0c4-7e70-e4e8-5c1d-27dc6e5a946c")
public static String es_PE_FIELD_Table_RecordsDeleteable_Name="Registros Eliminables";

@XendraTrl(Identifier="ff9ee0c4-7e70-e4e8-5c1d-27dc6e5a946c")
public static String es_PE_FIELD_Table_RecordsDeleteable_Description="Indica si los registros pueden ser eliminados de la base de datos";

@XendraTrl(Identifier="ff9ee0c4-7e70-e4e8-5c1d-27dc6e5a946c")
public static String es_PE_FIELD_Table_RecordsDeleteable_Help="El cuadro de verificación registros eliminables indica si un registro puede ser eliminado de la base de datos. Si los registros no pueden ser eliminados; usted puede solamente deseleccionar la marca de activo.";

@XendraField(AD_Column_ID="IsDeleteable",IsCentrallyMaintained=true,
AD_Tab_ID="19819538-41e6-b846-df11-41bedaec6ab5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ff9ee0c4-7e70-e4e8-5c1d-27dc6e5a946c")
public static final String FIELDNAME_Table_RecordsDeleteable="ff9ee0c4-7e70-e4e8-5c1d-27dc6e5a946c";

@XendraTrl(Identifier="57b6476f-5436-04bb-2d23-a2125157dd07")
public static String es_PE_COLUMN_IsDeleteable_Name="Registros Eliminables";

@XendraColumn(AD_Element_ID="ba9e0bc5-ba5d-7680-8a14-d2dd9adfaa93",ColumnName="IsDeleteable",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="57b6476f-5436-04bb-2d23-a2125157dd07",
Synchronized="2017-08-28 09:54:51.0")
/** Column name IsDeleteable */
public static final String COLUMNNAME_IsDeleteable = "IsDeleteable";
/** Set High Volume.
@param IsHighVolume Use Search instead of Pick list */
public void setIsHighVolume (boolean IsHighVolume)
{
set_Value (COLUMNNAME_IsHighVolume, Boolean.valueOf(IsHighVolume));
}
/** Get High Volume.
@return Use Search instead of Pick list */
public boolean isHighVolume() 
{
Object oo = get_Value(COLUMNNAME_IsHighVolume);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="e5cc1b5c-b717-4700-a413-fe009dbdd423")
public static String es_PE_FIELD_Table_HighVolume_Name="Volúmen Alto";

@XendraTrl(Identifier="e5cc1b5c-b717-4700-a413-fe009dbdd423")
public static String es_PE_FIELD_Table_HighVolume_Description="Use búsqueda en lugar de lista de recolección";

@XendraTrl(Identifier="e5cc1b5c-b717-4700-a413-fe009dbdd423")
public static String es_PE_FIELD_Table_HighVolume_Help="El cuadro de verificación volúmen alto indica si una pantalla de búsqueda se desplegará en lugar de una lista de recolección para seleccionar registros de esta tabla";

@XendraField(AD_Column_ID="IsHighVolume",IsCentrallyMaintained=true,
AD_Tab_ID="19819538-41e6-b846-df11-41bedaec6ab5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e5cc1b5c-b717-4700-a413-fe009dbdd423")
public static final String FIELDNAME_Table_HighVolume="e5cc1b5c-b717-4700-a413-fe009dbdd423";

@XendraTrl(Identifier="8562066d-f2b8-2edf-9f83-f53de1fcaff8")
public static String es_PE_COLUMN_IsHighVolume_Name="Volúmen Alto";

@XendraColumn(AD_Element_ID="85b340ff-8b7f-ec44-651c-7738ae891372",ColumnName="IsHighVolume",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8562066d-f2b8-2edf-9f83-f53de1fcaff8",
Synchronized="2017-08-28 09:54:51.0")
/** Column name IsHighVolume */
public static final String COLUMNNAME_IsHighVolume = "IsHighVolume";
/** Set Replicated.
@param IsReplicated The data is successfully replicated */
public void setIsReplicated (boolean IsReplicated)
{
set_Value (COLUMNNAME_IsReplicated, Boolean.valueOf(IsReplicated));
}
/** Get Replicated.
@return The data is successfully replicated */
public boolean isReplicated() 
{
Object oo = get_Value(COLUMNNAME_IsReplicated);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="40353686-6c89-4152-af5a-545e46e6cd9e")
public static String es_PE_FIELD_Table_Replicated_Name="Replicado";

@XendraTrl(Identifier="40353686-6c89-4152-af5a-545e46e6cd9e")
public static String es_PE_FIELD_Table_Replicated_Description="Los datos son replicados con exito.";

@XendraTrl(Identifier="40353686-6c89-4152-af5a-545e46e6cd9e")
public static String es_PE_FIELD_Table_Replicated_Help="El dato de replicación es acertado.";

@XendraField(AD_Column_ID="IsReplicated",IsCentrallyMaintained=true,
AD_Tab_ID="19819538-41e6-b846-df11-41bedaec6ab5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-04-04 14:31:12.0",
Identifier="40353686-6c89-4152-af5a-545e46e6cd9e")
public static final String FIELDNAME_Table_Replicated="40353686-6c89-4152-af5a-545e46e6cd9e";

@XendraTrl(Identifier="314e5d72-df16-4c7e-adbb-543fa464af64")
public static String es_PE_COLUMN_IsReplicated_Name="Replicated";

@XendraColumn(AD_Element_ID="ad50ae17-25bd-cdcd-ccb5-ec1abb550c90",ColumnName="IsReplicated",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="314e5d72-df16-4c7e-adbb-543fa464af64",
Synchronized="2017-08-28 09:54:51.0")
/** Column name IsReplicated */
public static final String COLUMNNAME_IsReplicated = "IsReplicated";
/** Set Security enabled.
@param IsSecurityEnabled If security is enabled, user access to data can be restricted via Roles */
public void setIsSecurityEnabled (boolean IsSecurityEnabled)
{
set_Value (COLUMNNAME_IsSecurityEnabled, Boolean.valueOf(IsSecurityEnabled));
}
/** Get Security enabled.
@return If security is enabled, user access to data can be restricted via Roles */
public boolean isSecurityEnabled() 
{
Object oo = get_Value(COLUMNNAME_IsSecurityEnabled);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="a9e29aac-9401-09eb-bfca-76d48387f73e")
public static String es_PE_FIELD_Table_SecurityEnabled_Name="Seguridad Habilitada";

@XendraTrl(Identifier="a9e29aac-9401-09eb-bfca-76d48387f73e")
public static String es_PE_FIELD_Table_SecurityEnabled_Description="Si la seguridad esta habilitada; el acceso del usuario a los datos puede ser restringido vía Perfiles";

@XendraTrl(Identifier="a9e29aac-9401-09eb-bfca-76d48387f73e")
public static String es_PE_FIELD_Table_SecurityEnabled_Help="El cuadro de verificación seguridad habilitada indica que el acceso del usuario a los datos en esta tabla puede ser restringido usando perfiles.";

@XendraField(AD_Column_ID="IsSecurityEnabled",IsCentrallyMaintained=true,
AD_Tab_ID="19819538-41e6-b846-df11-41bedaec6ab5",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a9e29aac-9401-09eb-bfca-76d48387f73e")
public static final String FIELDNAME_Table_SecurityEnabled="a9e29aac-9401-09eb-bfca-76d48387f73e";

@XendraTrl(Identifier="679b36a7-1524-4551-0be0-3e31c2d13d3c")
public static String es_PE_COLUMN_IsSecurityEnabled_Name="Seguridad Habilitada";

@XendraColumn(AD_Element_ID="b415409b-f482-90ff-a22a-97d73f0c149e",ColumnName="IsSecurityEnabled",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="679b36a7-1524-4551-0be0-3e31c2d13d3c",
Synchronized="2017-08-28 09:54:51.0")
/** Column name IsSecurityEnabled */
public static final String COLUMNNAME_IsSecurityEnabled = "IsSecurityEnabled";
/** Set View.
@param IsView This is a view */
public void setIsView (boolean IsView)
{
set_Value (COLUMNNAME_IsView, Boolean.valueOf(IsView));
}
/** Get View.
@return This is a view */
public boolean isView() 
{
Object oo = get_Value(COLUMNNAME_IsView);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="ce53a8d8-712c-87eb-2a26-0f5f78d13d6d")
public static String es_PE_FIELD_Table_View_Name="Vista";

@XendraTrl(Identifier="ce53a8d8-712c-87eb-2a26-0f5f78d13d6d")
public static String es_PE_FIELD_Table_View_Description="Ésta es una vista";

@XendraTrl(Identifier="ce53a8d8-712c-87eb-2a26-0f5f78d13d6d")
public static String es_PE_FIELD_Table_View_Help="Esta es una vista mas bien que una tabla. Una vista es siempre tratada como de sólo lectura en el sistema";

@XendraField(AD_Column_ID="IsView",IsCentrallyMaintained=true,
AD_Tab_ID="19819538-41e6-b846-df11-41bedaec6ab5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ce53a8d8-712c-87eb-2a26-0f5f78d13d6d")
public static final String FIELDNAME_Table_View="ce53a8d8-712c-87eb-2a26-0f5f78d13d6d";

@XendraTrl(Identifier="5d609997-b4d7-2090-7593-a1590e42eeb3")
public static String es_PE_COLUMN_IsView_Name="Vista";

@XendraColumn(AD_Element_ID="88951cf7-3e9a-153c-bd10-2bb80eccf676",ColumnName="IsView",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5d609997-b4d7-2090-7593-a1590e42eeb3",
Synchronized="2017-08-28 09:54:51.0")
/** Column name IsView */
public static final String COLUMNNAME_IsView = "IsView";
/** Set Sequence.
@param LoadSeq Sequence */
public void setLoadSeq (int LoadSeq)
{
set_ValueNoCheck (COLUMNNAME_LoadSeq, Integer.valueOf(LoadSeq));
}
/** Get Sequence.
@return Sequence */
public int getLoadSeq() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_LoadSeq);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4b3edce5-0b86-9d8b-afd7-f31b921f0beb")
public static String es_PE_FIELD_Table_Sequence_Name="Secuencia de Carga";

@XendraField(AD_Column_ID="LoadSeq",IsCentrallyMaintained=true,
AD_Tab_ID="19819538-41e6-b846-df11-41bedaec6ab5",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4b3edce5-0b86-9d8b-afd7-f31b921f0beb")
public static final String FIELDNAME_Table_Sequence="4b3edce5-0b86-9d8b-afd7-f31b921f0beb";

@XendraTrl(Identifier="a070a972-3032-dc6a-653f-34900f59a1ee")
public static String es_PE_COLUMN_LoadSeq_Name="Secuencia de Carga";

@XendraColumn(AD_Element_ID="ce31c7f5-8c79-cf13-c9f6-cc1c545843b6",ColumnName="LoadSeq",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a070a972-3032-dc6a-653f-34900f59a1ee",
Synchronized="2017-08-28 09:54:51.0")
/** Column name LoadSeq */
public static final String COLUMNNAME_LoadSeq = "LoadSeq";
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
@XendraTrl(Identifier="4902cd36-c3d5-2b49-8ce6-ff275b08dd2c")
public static String es_PE_FIELD_Table_Name_Name="Nombre";

@XendraTrl(Identifier="4902cd36-c3d5-2b49-8ce6-ff275b08dd2c")
public static String es_PE_FIELD_Table_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="4902cd36-c3d5-2b49-8ce6-ff275b08dd2c")
public static String es_PE_FIELD_Table_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="19819538-41e6-b846-df11-41bedaec6ab5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4902cd36-c3d5-2b49-8ce6-ff275b08dd2c")
public static final String FIELDNAME_Table_Name="4902cd36-c3d5-2b49-8ce6-ff275b08dd2c";

@XendraTrl(Identifier="ce9cdec7-864c-ee13-69a8-0cb69d958352")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ce9cdec7-864c-ee13-69a8-0cb69d958352",
Synchronized="2017-08-28 09:54:51.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";

/** PO_Window_ID AD_Reference=d814dc80-8931-fe2b-5f95-5a43f13d7530 */
public static final int PO_WINDOW_ID_AD_Reference_ID=284;
/** Set PO Window.
@param PO_Window_ID Purchase Order Window */
public void setPO_Window_ID (int PO_Window_ID)
{
if (PO_Window_ID <= 0) set_Value (COLUMNNAME_PO_Window_ID, null);
 else 
set_Value (COLUMNNAME_PO_Window_ID, Integer.valueOf(PO_Window_ID));
}
/** Get PO Window.
@return Purchase Order Window */
public int getPO_Window_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PO_Window_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="566c5d3b-44ce-2d1e-004c-2087ee3e3404")
public static String es_PE_FIELD_Table_POWindow_Name="Ventana OC";

@XendraTrl(Identifier="566c5d3b-44ce-2d1e-004c-2087ee3e3404")
public static String es_PE_FIELD_Table_POWindow_Description="Ventana Orden de Compra";

@XendraTrl(Identifier="566c5d3b-44ce-2d1e-004c-2087ee3e3404")
public static String es_PE_FIELD_Table_POWindow_Help="Ventana para orden de compra (AP) Enfocar";

@XendraField(AD_Column_ID="PO_Window_ID",IsCentrallyMaintained=true,
AD_Tab_ID="19819538-41e6-b846-df11-41bedaec6ab5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="566c5d3b-44ce-2d1e-004c-2087ee3e3404")
public static final String FIELDNAME_Table_POWindow="566c5d3b-44ce-2d1e-004c-2087ee3e3404";

@XendraTrl(Identifier="8e7773c1-ec40-4c1f-cacf-371453b91356")
public static String es_PE_COLUMN_PO_Window_ID_Name="Ventana OC";

@XendraColumn(AD_Element_ID="47f7bf6f-27fb-52b4-4466-2f464cbb4d1c",ColumnName="PO_Window_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="d814dc80-8931-fe2b-5f95-5a43f13d7530",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="8e7773c1-ec40-4c1f-cacf-371453b91356",Synchronized="2017-08-28 09:54:51.0")
/** Column name PO_Window_ID */
public static final String COLUMNNAME_PO_Window_ID = "PO_Window_ID";
/** Set Properties.
@param Properties Properties */
public void setProperties (HashMap Properties)
{
set_Value (COLUMNNAME_Properties, Properties);
}
/** Get Properties.
@return Properties */
public HashMap getProperties() 
{
HashMap propsrc = (HashMap)get_Value(COLUMNNAME_Properties);
if (propsrc == null) return new HashMap();
 HashMap propdst = (HashMap) propsrc.clone();
return propdst;
}

@XendraTrl(Identifier="d1816624-cb16-456c-9adc-eb78b0fff7e8")
public static String es_PE_FIELD_Table_Properties_Name="Properties";

@XendraField(AD_Column_ID="Properties",IsCentrallyMaintained=true,
AD_Tab_ID="19819538-41e6-b846-df11-41bedaec6ab5",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-10-15 19:01:49.0",
Identifier="d1816624-cb16-456c-9adc-eb78b0fff7e8")
public static final String FIELDNAME_Table_Properties="d1816624-cb16-456c-9adc-eb78b0fff7e8";

@XendraTrl(Identifier="cfabc5be-cb4f-4169-96ef-1003a1d32c3e")
public static String es_PE_COLUMN_Properties_Name="Properties";

@XendraColumn(AD_Element_ID="acc3987b-292c-475a-86b5-5104970a96f3",ColumnName="Properties",
AD_Reference_ID=46,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cfabc5be-cb4f-4169-96ef-1003a1d32c3e",
Synchronized="2017-08-28 09:54:51.0")
/** Column name Properties */
public static final String COLUMNNAME_Properties = "Properties";

/** ReplicationType AD_Reference=b21a4af6-31d2-3c66-8ee7-fca98e903ccb */
public static final int REPLICATIONTYPE_AD_Reference_ID=1000047;
/** Set Replication Type.
@param ReplicationType Type of Data Replication */
public void setReplicationType (String ReplicationType)
{
if (ReplicationType == null) throw new IllegalArgumentException ("ReplicationType is mandatory");
if (ReplicationType.equals(REF_ReplicationType.Merge) || ReplicationType.equals(REF_ReplicationType.Reference) || ReplicationType.equals(REF_ReplicationType.Local) || ReplicationType.equals(REF_ReplicationType.None));
 else throw new IllegalArgumentException ("ReplicationType Invalid value - " + ReplicationType + " - Reference_ID=1000047 - M - R - L - N");
if (ReplicationType.length() > 1)
{
log.warning("Length > 1 - truncated");
ReplicationType = ReplicationType.substring(0,0);
}
set_Value (COLUMNNAME_ReplicationType, ReplicationType);
}
/** Get Replication Type.
@return Type of Data Replication */
public String getReplicationType() 
{
return (String)get_Value(COLUMNNAME_ReplicationType);
}

@XendraTrl(Identifier="d0462f0f-fcb4-3272-db05-9c000f56cca1")
public static String es_PE_FIELD_Table_ReplicationType_Name="Tipo de Replicación";

@XendraTrl(Identifier="d0462f0f-fcb4-3272-db05-9c000f56cca1")
public static String es_PE_FIELD_Table_ReplicationType_Description="Tipo de réplica de datos";

@XendraTrl(Identifier="d0462f0f-fcb4-3272-db05-9c000f56cca1")
public static String es_PE_FIELD_Table_ReplicationType_Help="El tipo de replicación de datos determina la dirección de replicación de datos. <br>La referencia significa que los datos en este sistema están leídos solamente -> <br>Medios locales que los datos en este sistema no están replegados a otros sistemas - <br>La fusión significa que los datos en este sistema están sincronizados con el otro sistema<-> <br>";

@XendraField(AD_Column_ID="ReplicationType",IsCentrallyMaintained=true,
AD_Tab_ID="19819538-41e6-b846-df11-41bedaec6ab5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d0462f0f-fcb4-3272-db05-9c000f56cca1")
public static final String FIELDNAME_Table_ReplicationType="d0462f0f-fcb4-3272-db05-9c000f56cca1";

@XendraTrl(Identifier="6f355587-6fc3-1475-1961-1d89f41945c5")
public static String es_PE_COLUMN_ReplicationType_Name="Tipo de Replicación";

@XendraColumn(AD_Element_ID="fab2f42c-8051-1227-bbbd-e69e4837f172",ColumnName="ReplicationType",
AD_Reference_ID=17,AD_Reference_Value_ID="b21a4af6-31d2-3c66-8ee7-fca98e903ccb",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="L",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6f355587-6fc3-1475-1961-1d89f41945c5",Synchronized="2017-08-28 09:54:52.0")
/** Column name ReplicationType */
public static final String COLUMNNAME_ReplicationType = "ReplicationType";
/** Set Synchronized.
@param Synchronized Synchronized */
public void setSynchronized (Timestamp Synchronized)
{
set_Value (COLUMNNAME_Synchronized, Synchronized);
}
/** Get Synchronized.
@return Synchronized */
public Timestamp getSynchronized() 
{
return (Timestamp)get_Value(COLUMNNAME_Synchronized);
}

@XendraTrl(Identifier="e00db75e-1823-44b1-ae30-b1d59b258352")
public static String es_PE_FIELD_Table_Synchronized_Name="Synchronized";

@XendraField(AD_Column_ID="Synchronized",IsCentrallyMaintained=true,
AD_Tab_ID="19819538-41e6-b846-df11-41bedaec6ab5",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=29,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-04-04 14:31:12.0",
Identifier="e00db75e-1823-44b1-ae30-b1d59b258352")
public static final String FIELDNAME_Table_Synchronized="e00db75e-1823-44b1-ae30-b1d59b258352";

@XendraTrl(Identifier="b6141a7e-4a09-e03b-9874-cdb6751fe914")
public static String es_PE_COLUMN_Synchronized_Name="Synchronized";

@XendraColumn(AD_Element_ID="08f1e976-ceeb-f830-9d75-bf94f13a98ce",ColumnName="Synchronized",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b6141a7e-4a09-e03b-9874-cdb6751fe914",
Synchronized="2017-08-28 09:54:52.0")
/** Column name Synchronized */
public static final String COLUMNNAME_Synchronized = "Synchronized";
/** Set DB Table Name.
@param TableName Name of the table in the database */
public void setTableName (String TableName)
{
if (TableName == null) throw new IllegalArgumentException ("TableName is mandatory.");
if (TableName.length() > 40)
{
log.warning("Length > 40 - truncated");
TableName = TableName.substring(0,39);
}
set_Value (COLUMNNAME_TableName, TableName);
}
/** Get DB Table Name.
@return Name of the table in the database */
public String getTableName() 
{
String value = (String)get_Value(COLUMNNAME_TableName);
if (value == null)
  return "";
return value;
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getTableName());
}

@XendraTrl(Identifier="eb2ee713-032d-1aa8-5f45-e58e7b001613")
public static String es_PE_FIELD_Table_DBTableName_Name="Nombre de Tabla";

@XendraTrl(Identifier="eb2ee713-032d-1aa8-5f45-e58e7b001613")
public static String es_PE_FIELD_Table_DBTableName_Description="Nombre de la tabla en la base de datos";

@XendraTrl(Identifier="eb2ee713-032d-1aa8-5f45-e58e7b001613")
public static String es_PE_FIELD_Table_DBTableName_Help="Indica el nombre de la tabla en una base de datos.";

@XendraField(AD_Column_ID="TableName",IsCentrallyMaintained=true,
AD_Tab_ID="19819538-41e6-b846-df11-41bedaec6ab5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="eb2ee713-032d-1aa8-5f45-e58e7b001613")
public static final String FIELDNAME_Table_DBTableName="eb2ee713-032d-1aa8-5f45-e58e7b001613";

@XendraTrl(Identifier="088fa9ac-c027-9778-858a-9c03e594632e")
public static String es_PE_COLUMN_TableName_Name="Nombre de Tabla";

@XendraColumn(AD_Element_ID="be0b8df8-a2da-2b62-065c-960faee503eb",ColumnName="TableName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="088fa9ac-c027-9778-858a-9c03e594632e",
Synchronized="2017-08-28 09:54:52.0")
/** Column name TableName */
public static final String COLUMNNAME_TableName = "TableName";
}
