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
/** Generated Model for PA_MeasureCalc
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_PA_MeasureCalc extends PO
{
/** Standard Constructor
@param ctx context
@param PA_MeasureCalc_ID id
@param trxName transaction
*/
public X_PA_MeasureCalc (Properties ctx, int PA_MeasureCalc_ID, String trxName)
{
super (ctx, PA_MeasureCalc_ID, trxName);
/** if (PA_MeasureCalc_ID == 0)
{
setAD_Table_ID (0);
setDateColumn (null);	
// x.Date
setEntityType (null);	
// U
setKeyColumn (null);
setName (null);
setOrgColumn (null);	
// x.AD_Org_ID
setPA_MeasureCalc_ID (0);
setSelectClause (null);	
// SELECT ... FROM ...
setWhereClause (null);	
// WHERE ...
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_PA_MeasureCalc (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=442 */
public static int Table_ID=MTable.getTable_ID("PA_MeasureCalc");

@XendraTrl(Identifier="e1901153-6971-2152-cebc-3fef17ea2905")
public static String es_PE_TAB_PerformanceMeasureCalculation_Description="Mantener Cálculo de Medida de Desempeño";

@XendraTrl(Identifier="e1901153-6971-2152-cebc-3fef17ea2905")
public static String es_PE_TAB_PerformanceMeasureCalculation_Name="Cálculo de Medida de Desempeño";

@XendraTrl(Identifier="e1901153-6971-2152-cebc-3fef17ea2905")
public static String es_PE_TAB_PerformanceMeasureCalculation_Help="El Calculo de Medición del Desempeño define como la medida de desempeño se calcula. Por favor probar el comando en SQL*Plus primero. El Select necesita regresar un solo valor! Cualquier restricción de rango de fecha; organizaciones; socios de negocio; productos debe ser hecha via la ventana `Medida de desempeño`. Este es un calculo genérico. Como este tema es algo técnico; el sistema viene con algunos ejemplos predefinidos.";

@XendraTab(Name="Performance Measure Calculation",
Description="Maintain your Performance Measure Calculation",
Help="The Performance Measure Calculation defines how performance measures will be calculated. See examples.<br> The SELECT definition must contain the SELECT and FROM keywords in upper case, the WHERE definition must contain the WHERE keyword in upper case.  The main table must not have an alias!  The WHERE clause can only contain values of the main table (e.g. when selecting from Header and lines, only header variables can be used in the where clause) and be fully qualified if there is more then one table.",
AD_Window_ID="d362b95b-dd7c-a124-9127-7762977e7fcb",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="e1901153-6971-2152-cebc-3fef17ea2905",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_PerformanceMeasureCalculation="e1901153-6971-2152-cebc-3fef17ea2905";

@XendraTrl(Identifier="42a34360-ab71-ec63-0f92-bcccb715f9bc")
public static String es_PE_TABLE_PA_MeasureCalc_Name="Cálculo de la Medida";

@XendraTable(Name="Measure Calculation",Description="Calculation method for measuring performance",
Help="",TableName="PA_MeasureCalc",AccessLevel="6",
AD_Window_ID="d362b95b-dd7c-a124-9127-7762977e7fcb",AD_Val_Rule_ID="",IsKey=1,LoadSeq=130,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.performanceanalysis",
Identifier="42a34360-ab71-ec63-0f92-bcccb715f9bc",Synchronized="2017-08-16 11:43:40.0")
/** TableName=PA_MeasureCalc */
public static final String Table_Name="PA_MeasureCalc";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"PA_MeasureCalc");

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
    Table_ID = MTable.getTable_ID("PA_MeasureCalc");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_PA_MeasureCalc[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Table.
@param AD_Table_ID Database Table information */
public void setAD_Table_ID (int AD_Table_ID)
{
if (AD_Table_ID < 1) throw new IllegalArgumentException ("AD_Table_ID is mandatory.");
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

@XendraTrl(Identifier="3464603e-f76e-5f7f-d629-41be6d70dd77")
public static String es_PE_FIELD_PerformanceMeasureCalculation_Table_Description="Tabla para los campos";

@XendraTrl(Identifier="3464603e-f76e-5f7f-d629-41be6d70dd77")
public static String es_PE_FIELD_PerformanceMeasureCalculation_Table_Help="La Tabla indica una tabla en la que reside un campo ó campos.";

@XendraTrl(Identifier="3464603e-f76e-5f7f-d629-41be6d70dd77")
public static String es_PE_FIELD_PerformanceMeasureCalculation_Table_Name="Tabla";

@XendraField(AD_Column_ID="AD_Table_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e1901153-6971-2152-cebc-3fef17ea2905",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3464603e-f76e-5f7f-d629-41be6d70dd77")
public static final String FIELDNAME_PerformanceMeasureCalculation_Table="3464603e-f76e-5f7f-d629-41be6d70dd77";

@XendraTrl(Identifier="179801f6-4f3c-d685-a34e-0ad246252c4e")
public static String es_PE_COLUMN_AD_Table_ID_Name="Tabla";

@XendraColumn(AD_Element_ID="270eeb02-723b-0ecc-7f56-3c67fa71a7f1",ColumnName="AD_Table_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="179801f6-4f3c-d685-a34e-0ad246252c4e",
Synchronized="2017-08-05 16:55:41.0")
/** Column name AD_Table_ID */
public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
/** Set B.Partner Column.
@param BPartnerColumn Fully qualified Business Partner key column (C_BPartner_ID) */
public void setBPartnerColumn (String BPartnerColumn)
{
if (BPartnerColumn != null && BPartnerColumn.length() > 60)
{
log.warning("Length > 60 - truncated");
BPartnerColumn = BPartnerColumn.substring(0,59);
}
set_Value (COLUMNNAME_BPartnerColumn, BPartnerColumn);
}
/** Get B.Partner Column.
@return Fully qualified Business Partner key column (C_BPartner_ID) */
public String getBPartnerColumn() 
{
String value = (String)get_Value(COLUMNNAME_BPartnerColumn);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="7b0ae2ed-8610-c403-3621-320491b96efc")
public static String es_PE_FIELD_PerformanceMeasureCalculation_BPartnerColumn_Description="Columna clave del socio del negocio completamente calificada (C_BPartner_ID)";

@XendraTrl(Identifier="7b0ae2ed-8610-c403-3621-320491b96efc")
public static String es_PE_FIELD_PerformanceMeasureCalculation_BPartnerColumn_Help="La columna socio del negocio indica el socio del negocio a usar cuando se calcule esta medida";

@XendraTrl(Identifier="7b0ae2ed-8610-c403-3621-320491b96efc")
public static String es_PE_FIELD_PerformanceMeasureCalculation_BPartnerColumn_Name="Columna Socio del Negocio";

@XendraField(AD_Column_ID="BPartnerColumn",IsCentrallyMaintained=true,
AD_Tab_ID="e1901153-6971-2152-cebc-3fef17ea2905",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7b0ae2ed-8610-c403-3621-320491b96efc")
public static final String FIELDNAME_PerformanceMeasureCalculation_BPartnerColumn="7b0ae2ed-8610-c403-3621-320491b96efc";

@XendraTrl(Identifier="16ba4015-3a64-0644-37d3-e1eafdb00c6f")
public static String es_PE_COLUMN_BPartnerColumn_Name="Columna Socio del Negocio";

@XendraColumn(AD_Element_ID="96a4c978-87d9-582c-0f1e-9e86a2221c77",ColumnName="BPartnerColumn",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,
DefaultValue="x.C_BPartner_ID",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="16ba4015-3a64-0644-37d3-e1eafdb00c6f",Synchronized="2017-08-05 16:55:41.0")
/** Column name BPartnerColumn */
public static final String COLUMNNAME_BPartnerColumn = "BPartnerColumn";
/** Set Date Column.
@param DateColumn Fully qualified date column */
public void setDateColumn (String DateColumn)
{
if (DateColumn == null) throw new IllegalArgumentException ("DateColumn is mandatory.");
if (DateColumn.length() > 60)
{
log.warning("Length > 60 - truncated");
DateColumn = DateColumn.substring(0,59);
}
set_Value (COLUMNNAME_DateColumn, DateColumn);
}
/** Get Date Column.
@return Fully qualified date column */
public String getDateColumn() 
{
String value = (String)get_Value(COLUMNNAME_DateColumn);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="8ff5238e-8e4a-ce4b-e2c1-b3f9cf3b58b5")
public static String es_PE_FIELD_PerformanceMeasureCalculation_DateColumn_Description="Columna fecha completamente calificada";

@XendraTrl(Identifier="8ff5238e-8e4a-ce4b-e2c1-b3f9cf3b58b5")
public static String es_PE_FIELD_PerformanceMeasureCalculation_DateColumn_Help="La columna Fecha indica la fecha a ser usada cuando se calcule esta medida";

@XendraTrl(Identifier="8ff5238e-8e4a-ce4b-e2c1-b3f9cf3b58b5")
public static String es_PE_FIELD_PerformanceMeasureCalculation_DateColumn_Name="Columna Fecha";

@XendraField(AD_Column_ID="DateColumn",IsCentrallyMaintained=true,
AD_Tab_ID="e1901153-6971-2152-cebc-3fef17ea2905",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8ff5238e-8e4a-ce4b-e2c1-b3f9cf3b58b5")
public static final String FIELDNAME_PerformanceMeasureCalculation_DateColumn="8ff5238e-8e4a-ce4b-e2c1-b3f9cf3b58b5";

@XendraTrl(Identifier="2c72d44f-d95d-d998-0188-664bd13250a6")
public static String es_PE_COLUMN_DateColumn_Name="Columna Fecha";

@XendraColumn(AD_Element_ID="1a98f054-ffe6-a3ce-8bf4-3de869c85eda",ColumnName="DateColumn",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="x.Date",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2c72d44f-d95d-d998-0188-664bd13250a6",
Synchronized="2017-08-05 16:55:41.0")
/** Column name DateColumn */
public static final String COLUMNNAME_DateColumn = "DateColumn";
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

@XendraTrl(Identifier="61d02a9c-74cb-71d4-89b0-06fc0a4f73bf")
public static String es_PE_FIELD_PerformanceMeasureCalculation_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="61d02a9c-74cb-71d4-89b0-06fc0a4f73bf")
public static String es_PE_FIELD_PerformanceMeasureCalculation_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="61d02a9c-74cb-71d4-89b0-06fc0a4f73bf")
public static String es_PE_FIELD_PerformanceMeasureCalculation_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="e1901153-6971-2152-cebc-3fef17ea2905",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="61d02a9c-74cb-71d4-89b0-06fc0a4f73bf")
public static final String FIELDNAME_PerformanceMeasureCalculation_Description="61d02a9c-74cb-71d4-89b0-06fc0a4f73bf";

@XendraTrl(Identifier="196fb3b9-e4f0-23f7-1b27-8fbfec4936af")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="196fb3b9-e4f0-23f7-1b27-8fbfec4936af",
Synchronized="2017-08-05 16:55:42.0")
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

@XendraTrl(Identifier="4b5d2c22-69aa-bbb8-f7ef-097fb3d53e94")
public static String es_PE_FIELD_PerformanceMeasureCalculation_EntityType_Description="Tipo de Entidad Diccionario; determina propiedad y sincronización";

@XendraTrl(Identifier="4b5d2c22-69aa-bbb8-f7ef-097fb3d53e94")
public static String es_PE_FIELD_PerformanceMeasureCalculation_EntityType_Help="Los tipos de entidad \"Diccionario\"; \"Adempiere\"; y \"Aplicación\" podrían ser automáticamente sincronizados y las personalizaciones eliminadas ó sobreescritas";

@XendraTrl(Identifier="4b5d2c22-69aa-bbb8-f7ef-097fb3d53e94")
public static String es_PE_FIELD_PerformanceMeasureCalculation_EntityType_Name="Tipo de Entidad";

@XendraField(AD_Column_ID="EntityType",IsCentrallyMaintained=true,
AD_Tab_ID="e1901153-6971-2152-cebc-3fef17ea2905",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=4,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4b5d2c22-69aa-bbb8-f7ef-097fb3d53e94")
public static final String FIELDNAME_PerformanceMeasureCalculation_EntityType="4b5d2c22-69aa-bbb8-f7ef-097fb3d53e94";

@XendraTrl(Identifier="659ed6fd-600e-6cf1-1b6b-a44fe53e213b")
public static String es_PE_COLUMN_EntityType_Name="Tipo de Entidad";

@XendraColumn(AD_Element_ID="5ba917bf-871c-6f19-aa50-962adc5de558",ColumnName="EntityType",
AD_Reference_ID=18,AD_Reference_Value_ID="fae4ad31-8ff1-5d5c-8d47-2426c541cd74",AD_Val_Rule_ID="",
FieldLength=4,DefaultValue="U",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="@EntityType@=D",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="659ed6fd-600e-6cf1-1b6b-a44fe53e213b",Synchronized="2017-08-05 16:55:42.0")
/** Column name EntityType */
public static final String COLUMNNAME_EntityType = "EntityType";
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
@XendraTrl(Identifier="f55b8a8f-0fb2-474c-9993-818d48ee7ea3")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f55b8a8f-0fb2-474c-9993-818d48ee7ea3",
Synchronized="2017-08-05 16:55:42.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Key Column.
@param KeyColumn Key Column for Table */
public void setKeyColumn (String KeyColumn)
{
if (KeyColumn == null) throw new IllegalArgumentException ("KeyColumn is mandatory.");
if (KeyColumn.length() > 60)
{
log.warning("Length > 60 - truncated");
KeyColumn = KeyColumn.substring(0,59);
}
set_Value (COLUMNNAME_KeyColumn, KeyColumn);
}
/** Get Key Column.
@return Key Column for Table */
public String getKeyColumn() 
{
String value = (String)get_Value(COLUMNNAME_KeyColumn);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="d902cb51-6a61-67c4-d2d5-beef90cc00b3")
public static String es_PE_FIELD_PerformanceMeasureCalculation_KeyColumn_Description="Key Column for Table";

@XendraTrl(Identifier="d902cb51-6a61-67c4-d2d5-beef90cc00b3")
public static String es_PE_FIELD_PerformanceMeasureCalculation_KeyColumn_Name="Key Column";

@XendraField(AD_Column_ID="KeyColumn",IsCentrallyMaintained=true,
AD_Tab_ID="e1901153-6971-2152-cebc-3fef17ea2905",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d902cb51-6a61-67c4-d2d5-beef90cc00b3")
public static final String FIELDNAME_PerformanceMeasureCalculation_KeyColumn="d902cb51-6a61-67c4-d2d5-beef90cc00b3";

@XendraTrl(Identifier="86e7039d-e5e8-8833-db91-31dd40e32024")
public static String es_PE_COLUMN_KeyColumn_Name="Key Column";

@XendraColumn(AD_Element_ID="4e747459-5b67-156d-bd51-439450ee1a0e",ColumnName="KeyColumn",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="86e7039d-e5e8-8833-db91-31dd40e32024",
Synchronized="2017-08-05 16:55:42.0")
/** Column name KeyColumn */
public static final String COLUMNNAME_KeyColumn = "KeyColumn";
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

@XendraTrl(Identifier="1cea46a6-77c7-93aa-d345-5e7bd86350a5")
public static String es_PE_FIELD_PerformanceMeasureCalculation_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="1cea46a6-77c7-93aa-d345-5e7bd86350a5")
public static String es_PE_FIELD_PerformanceMeasureCalculation_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="1cea46a6-77c7-93aa-d345-5e7bd86350a5")
public static String es_PE_FIELD_PerformanceMeasureCalculation_Name_Name="Nombre";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="e1901153-6971-2152-cebc-3fef17ea2905",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1cea46a6-77c7-93aa-d345-5e7bd86350a5")
public static final String FIELDNAME_PerformanceMeasureCalculation_Name="1cea46a6-77c7-93aa-d345-5e7bd86350a5";

@XendraTrl(Identifier="edb2540d-dd92-6571-5d55-22b131e324a2")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="edb2540d-dd92-6571-5d55-22b131e324a2",
Synchronized="2017-08-05 16:55:42.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Org Column.
@param OrgColumn Fully qualified Organization column (AD_Org_ID) */
public void setOrgColumn (String OrgColumn)
{
if (OrgColumn == null) throw new IllegalArgumentException ("OrgColumn is mandatory.");
if (OrgColumn.length() > 60)
{
log.warning("Length > 60 - truncated");
OrgColumn = OrgColumn.substring(0,59);
}
set_Value (COLUMNNAME_OrgColumn, OrgColumn);
}
/** Get Org Column.
@return Fully qualified Organization column (AD_Org_ID) */
public String getOrgColumn() 
{
String value = (String)get_Value(COLUMNNAME_OrgColumn);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="a8725aaf-6771-6c78-afa3-8bc6239bb453")
public static String es_PE_FIELD_PerformanceMeasureCalculation_OrgColumn_Description="Columna organización completamente calificada (AD_Org_ID)";

@XendraTrl(Identifier="a8725aaf-6771-6c78-afa3-8bc6239bb453")
public static String es_PE_FIELD_PerformanceMeasureCalculation_OrgColumn_Help="La columna organización indica la organización a ser usada en el cálculo de esta medida";

@XendraTrl(Identifier="a8725aaf-6771-6c78-afa3-8bc6239bb453")
public static String es_PE_FIELD_PerformanceMeasureCalculation_OrgColumn_Name="Columna de la Organización";

@XendraField(AD_Column_ID="OrgColumn",IsCentrallyMaintained=true,
AD_Tab_ID="e1901153-6971-2152-cebc-3fef17ea2905",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a8725aaf-6771-6c78-afa3-8bc6239bb453")
public static final String FIELDNAME_PerformanceMeasureCalculation_OrgColumn="a8725aaf-6771-6c78-afa3-8bc6239bb453";

@XendraTrl(Identifier="7a15b820-5805-b108-c054-b377c0a45905")
public static String es_PE_COLUMN_OrgColumn_Name="Columna de la Organización";

@XendraColumn(AD_Element_ID="8c0fb2f7-ffb5-73b7-cbbe-38c62e29302b",ColumnName="OrgColumn",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,
DefaultValue="x.AD_Org_ID",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="7a15b820-5805-b108-c054-b377c0a45905",Synchronized="2017-08-05 16:55:42.0")
/** Column name OrgColumn */
public static final String COLUMNNAME_OrgColumn = "OrgColumn";
/** Set Measure Calculation.
@param PA_MeasureCalc_ID Calculation method for measuring performance */
public void setPA_MeasureCalc_ID (int PA_MeasureCalc_ID)
{
if (PA_MeasureCalc_ID < 1) throw new IllegalArgumentException ("PA_MeasureCalc_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_PA_MeasureCalc_ID, Integer.valueOf(PA_MeasureCalc_ID));
}
/** Get Measure Calculation.
@return Calculation method for measuring performance */
public int getPA_MeasureCalc_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PA_MeasureCalc_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4ca10fc6-11d5-4ae8-1ad5-540d93e24493")
public static String es_PE_FIELD_PerformanceMeasureCalculation_MeasureCalculation_Description="Método de cálculo para medir el desempeño";

@XendraTrl(Identifier="4ca10fc6-11d5-4ae8-1ad5-540d93e24493")
public static String es_PE_FIELD_PerformanceMeasureCalculation_MeasureCalculation_Help="El Cálculo de la Medida indica el método para medir el desempeño";

@XendraTrl(Identifier="4ca10fc6-11d5-4ae8-1ad5-540d93e24493")
public static String es_PE_FIELD_PerformanceMeasureCalculation_MeasureCalculation_Name="Cálculo de la Medida";

@XendraField(AD_Column_ID="PA_MeasureCalc_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e1901153-6971-2152-cebc-3fef17ea2905",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4ca10fc6-11d5-4ae8-1ad5-540d93e24493")
public static final String FIELDNAME_PerformanceMeasureCalculation_MeasureCalculation="4ca10fc6-11d5-4ae8-1ad5-540d93e24493";
/** Column name PA_MeasureCalc_ID */
public static final String COLUMNNAME_PA_MeasureCalc_ID = "PA_MeasureCalc_ID";
/** Set Product Column.
@param ProductColumn Fully qualified Product column (M_Product_ID) */
public void setProductColumn (String ProductColumn)
{
if (ProductColumn != null && ProductColumn.length() > 60)
{
log.warning("Length > 60 - truncated");
ProductColumn = ProductColumn.substring(0,59);
}
set_Value (COLUMNNAME_ProductColumn, ProductColumn);
}
/** Get Product Column.
@return Fully qualified Product column (M_Product_ID) */
public String getProductColumn() 
{
String value = (String)get_Value(COLUMNNAME_ProductColumn);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="d0f143a9-9a87-4b03-3fe0-bb0373928610")
public static String es_PE_FIELD_PerformanceMeasureCalculation_ProductColumn_Description="Columna producto completamente calificada (M_Product_ID)";

@XendraTrl(Identifier="d0f143a9-9a87-4b03-3fe0-bb0373928610")
public static String es_PE_FIELD_PerformanceMeasureCalculation_ProductColumn_Help="La columna producto indica el producto a usar cuando calcule esta medida";

@XendraTrl(Identifier="d0f143a9-9a87-4b03-3fe0-bb0373928610")
public static String es_PE_FIELD_PerformanceMeasureCalculation_ProductColumn_Name="Columna Producto";

@XendraField(AD_Column_ID="ProductColumn",IsCentrallyMaintained=true,
AD_Tab_ID="e1901153-6971-2152-cebc-3fef17ea2905",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d0f143a9-9a87-4b03-3fe0-bb0373928610")
public static final String FIELDNAME_PerformanceMeasureCalculation_ProductColumn="d0f143a9-9a87-4b03-3fe0-bb0373928610";

@XendraTrl(Identifier="39cf0d8b-c39e-e960-1863-e5395af75f68")
public static String es_PE_COLUMN_ProductColumn_Name="Columna Producto";

@XendraColumn(AD_Element_ID="0573e3a2-e4d2-0cd8-9dcb-b199890826c8",ColumnName="ProductColumn",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,
DefaultValue="x.M_Product_ID",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="39cf0d8b-c39e-e960-1863-e5395af75f68",Synchronized="2017-08-05 16:55:42.0")
/** Column name ProductColumn */
public static final String COLUMNNAME_ProductColumn = "ProductColumn";
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
@XendraTrl(Identifier="571c8b82-8a98-9f8b-7385-32d2f2e4f56e")
public static String es_PE_FIELD_PerformanceMeasureCalculation_SqlSELECT_Description="Seleccione la cláusula";

@XendraTrl(Identifier="571c8b82-8a98-9f8b-7385-32d2f2e4f56e")
public static String es_PE_FIELD_PerformanceMeasureCalculation_SqlSELECT_Help="La Cláusula Select indica la cláusula SQL SELECT a usar para seleccionar el registro en un cálculo de medida";

@XendraTrl(Identifier="571c8b82-8a98-9f8b-7385-32d2f2e4f56e")
public static String es_PE_FIELD_PerformanceMeasureCalculation_SqlSELECT_Name="Cláusula Select ";

@XendraField(AD_Column_ID="SelectClause",IsCentrallyMaintained=true,
AD_Tab_ID="e1901153-6971-2152-cebc-3fef17ea2905",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="571c8b82-8a98-9f8b-7385-32d2f2e4f56e")
public static final String FIELDNAME_PerformanceMeasureCalculation_SqlSELECT="571c8b82-8a98-9f8b-7385-32d2f2e4f56e";

@XendraTrl(Identifier="2e047e6f-1531-3cb3-a785-0c7b96547300")
public static String es_PE_COLUMN_SelectClause_Name="Cláusula Select ";

@XendraColumn(AD_Element_ID="0cde47ad-0d12-516f-0d2f-d5ecebf7514e",ColumnName="SelectClause",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,
DefaultValue="SELECT ... FROM ...",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="2e047e6f-1531-3cb3-a785-0c7b96547300",Synchronized="2017-08-05 16:55:42.0")
/** Column name SelectClause */
public static final String COLUMNNAME_SelectClause = "SelectClause";
/** Set Sql WHERE.
@param WhereClause Fully qualified SQL WHERE clause */
public void setWhereClause (String WhereClause)
{
if (WhereClause == null) throw new IllegalArgumentException ("WhereClause is mandatory.");
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
@XendraTrl(Identifier="99f6ee40-8c27-3e74-863f-1e568a73dd2c")
public static String es_PE_FIELD_PerformanceMeasureCalculation_SqlWHERE_Description="Cláusula WHERE completamente calificada";

@XendraTrl(Identifier="99f6ee40-8c27-3e74-863f-1e568a73dd2c")
public static String es_PE_FIELD_PerformanceMeasureCalculation_SqlWHERE_Help="La cláusula Where indica la cláusula SQL WHERE a usar para la selección del registro";

@XendraTrl(Identifier="99f6ee40-8c27-3e74-863f-1e568a73dd2c")
public static String es_PE_FIELD_PerformanceMeasureCalculation_SqlWHERE_Name="Cláusula Where SQL";

@XendraField(AD_Column_ID="WhereClause",IsCentrallyMaintained=true,
AD_Tab_ID="e1901153-6971-2152-cebc-3fef17ea2905",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="99f6ee40-8c27-3e74-863f-1e568a73dd2c")
public static final String FIELDNAME_PerformanceMeasureCalculation_SqlWHERE="99f6ee40-8c27-3e74-863f-1e568a73dd2c";

@XendraTrl(Identifier="c314432f-aecb-892a-1e4c-b54f3dbcf183")
public static String es_PE_COLUMN_WhereClause_Name="Cláusula Where SQL";

@XendraColumn(AD_Element_ID="7528e2a5-0b7f-8c17-e919-8343497249ca",ColumnName="WhereClause",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,
DefaultValue="WHERE ...",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c314432f-aecb-892a-1e4c-b54f3dbcf183",Synchronized="2017-08-05 16:55:42.0")
/** Column name WhereClause */
public static final String COLUMNNAME_WhereClause = "WhereClause";
}
