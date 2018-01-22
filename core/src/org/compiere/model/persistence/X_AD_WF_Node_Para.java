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
/** Generated Model for AD_WF_Node_Para
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_WF_Node_Para extends PO
{
/** Standard Constructor
@param ctx context
@param AD_WF_Node_Para_ID id
@param trxName transaction
*/
public X_AD_WF_Node_Para (Properties ctx, int AD_WF_Node_Para_ID, String trxName)
{
super (ctx, AD_WF_Node_Para_ID, trxName);
/** if (AD_WF_Node_Para_ID == 0)
{
setAD_WF_Node_ID (0);
setAD_WF_Node_Para_ID (0);
setEntityType (null);	
// U
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_WF_Node_Para (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=643 */
public static int Table_ID=MTable.getTable_ID("AD_WF_Node_Para");

@XendraTrl(Identifier="bdb95750-e8ef-0353-ecfc-75d3f0867980")
public static String es_PE_TAB_Parameter_Description="Parámetro del nodo de flujo de trabajo";

@XendraTrl(Identifier="bdb95750-e8ef-0353-ecfc-75d3f0867980")
public static String es_PE_TAB_Parameter_Name="Parámetro";

@XendraTrl(Identifier="bdb95750-e8ef-0353-ecfc-75d3f0867980")
public static String es_PE_TAB_Parameter_Help="Parámetro de la ejecución del nodo de flujo de trabajo";

@XendraTab(Name="Parameter",Description="Workflow Node Parameter",
Help="Parameter for the execution of the Workflow Node",
AD_Window_ID="62b2e7ae-ae80-0120-50fa-d101e75827e6",SeqNo=60,TabLevel=2,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="bdb95750-e8ef-0353-ecfc-75d3f0867980",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Parameter="bdb95750-e8ef-0353-ecfc-75d3f0867980";

@XendraTrl(Identifier="1f2180c9-4bdc-efe2-47e1-a7e94b1314ea")
public static String es_PE_TABLE_AD_WF_Node_Para_Name="Parámetro Nodo Flujo de Trabajo";


@XendraTable(Name="Workflow Node Parameter",Description="Workflow Node Execution Parameter",
Help="",TableName="AD_WF_Node_Para",AccessLevel="6",
AD_Window_ID="62b2e7ae-ae80-0120-50fa-d101e75827e6",AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.workflow",Identifier="1f2180c9-4bdc-efe2-47e1-a7e94b1314ea",
Synchronized="2017-08-16 11:41:11.0")
/** TableName=AD_WF_Node_Para */
public static final String Table_Name="AD_WF_Node_Para";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_WF_Node_Para");

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
    Table_ID = MTable.getTable_ID("AD_WF_Node_Para");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_WF_Node_Para[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Process Parameter.
@param AD_Process_Para_ID Process Parameter */
public void setAD_Process_Para_ID (int AD_Process_Para_ID)
{
if (AD_Process_Para_ID <= 0) set_Value (COLUMNNAME_AD_Process_Para_ID, null);
 else 
set_Value (COLUMNNAME_AD_Process_Para_ID, Integer.valueOf(AD_Process_Para_ID));
}
/** Get Process Parameter.
@return Process Parameter */
public int getAD_Process_Para_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Process_Para_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b3150af4-b176-80b4-935e-86193078c511")
public static String es_PE_FIELD_Parameter_ProcessParameter_Name="Parámetro de Procesos";

@XendraField(AD_Column_ID="AD_Process_Para_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bdb95750-e8ef-0353-ecfc-75d3f0867980",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@AD_Process_ID@!0",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="b3150af4-b176-80b4-935e-86193078c511")
public static final String FIELDNAME_Parameter_ProcessParameter="b3150af4-b176-80b4-935e-86193078c511";

@XendraTrl(Identifier="2ceb0fa4-73fc-fcf4-a455-7f5698865837")
public static String es_PE_COLUMN_AD_Process_Para_ID_Name="Parámetro de Procesos";

@XendraColumn(AD_Element_ID="ba7a1fb4-c201-c803-e146-f7bba5520ba9",ColumnName="AD_Process_Para_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="7875fd4e-d920-8e85-9e1e-09e9b8029038",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="2ceb0fa4-73fc-fcf4-a455-7f5698865837",Synchronized="2017-08-05 16:53:01.0")
/** Column name AD_Process_Para_ID */
public static final String COLUMNNAME_AD_Process_Para_ID = "AD_Process_Para_ID";
/** Set Node.
@param AD_WF_Node_ID Workflow Node (activity), step or process */
public void setAD_WF_Node_ID (int AD_WF_Node_ID)
{
if (AD_WF_Node_ID < 1) throw new IllegalArgumentException ("AD_WF_Node_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_WF_Node_ID, Integer.valueOf(AD_WF_Node_ID));
}
/** Get Node.
@return Workflow Node (activity), step or process */
public int getAD_WF_Node_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_WF_Node_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getAD_WF_Node_ID()));
}

@XendraTrl(Identifier="592df17d-38d6-cbaf-f774-f3407a2ff162")
public static String es_PE_FIELD_Parameter_Node_Description="Nodo de flujo de trabajo; paso ó proceso";

@XendraTrl(Identifier="592df17d-38d6-cbaf-f774-f3407a2ff162")
public static String es_PE_FIELD_Parameter_Node_Help="El nodo de flujo de trabajo indica un paso ó proceso único en este flujo de trabajo.";

@XendraTrl(Identifier="592df17d-38d6-cbaf-f774-f3407a2ff162")
public static String es_PE_FIELD_Parameter_Node_Name="Nodo";

@XendraField(AD_Column_ID="AD_WF_Node_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bdb95750-e8ef-0353-ecfc-75d3f0867980",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@AD_Process_ID@!0",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="592df17d-38d6-cbaf-f774-f3407a2ff162")
public static final String FIELDNAME_Parameter_Node="592df17d-38d6-cbaf-f774-f3407a2ff162";

@XendraTrl(Identifier="7cf50157-83d2-3f9d-a678-5201cf4b20f8")
public static String es_PE_COLUMN_AD_WF_Node_ID_Name="Nodo";

@XendraColumn(AD_Element_ID="a21db5d2-692a-84ae-07db-7083b2eac74c",ColumnName="AD_WF_Node_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7cf50157-83d2-3f9d-a678-5201cf4b20f8",
Synchronized="2017-08-05 16:53:01.0")
/** Column name AD_WF_Node_ID */
public static final String COLUMNNAME_AD_WF_Node_ID = "AD_WF_Node_ID";
/** Set Workflow Node Parameter.
@param AD_WF_Node_Para_ID Workflow Node Execution Parameter */
public void setAD_WF_Node_Para_ID (int AD_WF_Node_Para_ID)
{
if (AD_WF_Node_Para_ID < 1) throw new IllegalArgumentException ("AD_WF_Node_Para_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_WF_Node_Para_ID, Integer.valueOf(AD_WF_Node_Para_ID));
}
/** Get Workflow Node Parameter.
@return Workflow Node Execution Parameter */
public int getAD_WF_Node_Para_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_WF_Node_Para_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="93754a7a-d401-26c7-3a4d-7071ed7bf051")
public static String es_PE_FIELD_Parameter_WorkflowNodeParameter_Description="Parámetro del nodo de ejecución de flujo de trabajo.";

@XendraTrl(Identifier="93754a7a-d401-26c7-3a4d-7071ed7bf051")
public static String es_PE_FIELD_Parameter_WorkflowNodeParameter_Help="Parámetro para la ejecución del nodo de flujo de trabajo.";

@XendraTrl(Identifier="93754a7a-d401-26c7-3a4d-7071ed7bf051")
public static String es_PE_FIELD_Parameter_WorkflowNodeParameter_Name="Parámetro Nodo Flujo de Trabajo";

@XendraField(AD_Column_ID="AD_WF_Node_Para_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bdb95750-e8ef-0353-ecfc-75d3f0867980",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="93754a7a-d401-26c7-3a4d-7071ed7bf051")
public static final String FIELDNAME_Parameter_WorkflowNodeParameter="93754a7a-d401-26c7-3a4d-7071ed7bf051";
/** Column name AD_WF_Node_Para_ID */
public static final String COLUMNNAME_AD_WF_Node_Para_ID = "AD_WF_Node_Para_ID";
/** Set Attribute Name.
@param AttributeName Name of the Attribute */
public void setAttributeName (String AttributeName)
{
if (AttributeName != null && AttributeName.length() > 60)
{
log.warning("Length > 60 - truncated");
AttributeName = AttributeName.substring(0,59);
}
set_Value (COLUMNNAME_AttributeName, AttributeName);
}
/** Get Attribute Name.
@return Name of the Attribute */
public String getAttributeName() 
{
String value = (String)get_Value(COLUMNNAME_AttributeName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="1bbbc37b-ffb4-bc1d-b5bb-ae88889a6493")
public static String es_PE_FIELD_Parameter_AttributeName_Description="Nombre del atributo";

@XendraTrl(Identifier="1bbbc37b-ffb4-bc1d-b5bb-ae88889a6493")
public static String es_PE_FIELD_Parameter_AttributeName_Help="Identificación del atributo";

@XendraTrl(Identifier="1bbbc37b-ffb4-bc1d-b5bb-ae88889a6493")
public static String es_PE_FIELD_Parameter_AttributeName_Name="Nombre del Atributo";

@XendraField(AD_Column_ID="AttributeName",IsCentrallyMaintained=true,
AD_Tab_ID="bdb95750-e8ef-0353-ecfc-75d3f0867980",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@AD_Process_ID@!0",DisplayLength=20,IsReadOnly=false,SeqNo=70,SortNo=1,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="1bbbc37b-ffb4-bc1d-b5bb-ae88889a6493")
public static final String FIELDNAME_Parameter_AttributeName="1bbbc37b-ffb4-bc1d-b5bb-ae88889a6493";

@XendraTrl(Identifier="b39c8a64-cd4c-c0ef-afdc-ac6e7ba88ea3")
public static String es_PE_COLUMN_AttributeName_Name="Nombre del Atributo";

@XendraColumn(AD_Element_ID="8f4d88cb-23d3-78f4-8ce5-981e45136e01",ColumnName="AttributeName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b39c8a64-cd4c-c0ef-afdc-ac6e7ba88ea3",
Synchronized="2017-08-05 16:53:01.0")
/** Column name AttributeName */
public static final String COLUMNNAME_AttributeName = "AttributeName";
/** Set Attribute Value.
@param AttributeValue Value of the Attribute */
public void setAttributeValue (String AttributeValue)
{
if (AttributeValue != null && AttributeValue.length() > 60)
{
log.warning("Length > 60 - truncated");
AttributeValue = AttributeValue.substring(0,59);
}
set_Value (COLUMNNAME_AttributeValue, AttributeValue);
}
/** Get Attribute Value.
@return Value of the Attribute */
public String getAttributeValue() 
{
String value = (String)get_Value(COLUMNNAME_AttributeValue);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="bc590f32-a481-c396-e6ef-7560974a80c6")
public static String es_PE_FIELD_Parameter_AttributeValue_Description="Valor de el atributo";

@XendraTrl(Identifier="bc590f32-a481-c396-e6ef-7560974a80c6")
public static String es_PE_FIELD_Parameter_AttributeValue_Name="Valor de Atributo";

@XendraField(AD_Column_ID="AttributeValue",IsCentrallyMaintained=true,
AD_Tab_ID="bdb95750-e8ef-0353-ecfc-75d3f0867980",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@AD_Process_ID@!0",DisplayLength=60,IsReadOnly=false,SeqNo=80,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="bc590f32-a481-c396-e6ef-7560974a80c6")
public static final String FIELDNAME_Parameter_AttributeValue="bc590f32-a481-c396-e6ef-7560974a80c6";

@XendraTrl(Identifier="0796fa4d-ebc3-66e6-a36a-6fb14777e1e9")
public static String es_PE_COLUMN_AttributeValue_Name="Valor de Atributo";

@XendraColumn(AD_Element_ID="e747c580-b4ad-e317-bd0d-dcb2a80c135e",ColumnName="AttributeValue",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0796fa4d-ebc3-66e6-a36a-6fb14777e1e9",
Synchronized="2017-08-05 16:53:01.0")
/** Column name AttributeValue */
public static final String COLUMNNAME_AttributeValue = "AttributeValue";
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

@XendraTrl(Identifier="c0787ede-9681-eed9-bc17-3299d5fdf4cd")
public static String es_PE_FIELD_Parameter_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="c0787ede-9681-eed9-bc17-3299d5fdf4cd")
public static String es_PE_FIELD_Parameter_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="c0787ede-9681-eed9-bc17-3299d5fdf4cd")
public static String es_PE_FIELD_Parameter_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="bdb95750-e8ef-0353-ecfc-75d3f0867980",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@AD_Process_ID@!0",DisplayLength=60,IsReadOnly=false,SeqNo=90,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="c0787ede-9681-eed9-bc17-3299d5fdf4cd")
public static final String FIELDNAME_Parameter_Description="c0787ede-9681-eed9-bc17-3299d5fdf4cd";

@XendraTrl(Identifier="3db0d694-f50b-1fa3-0eff-5bf47879f12a")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3db0d694-f50b-1fa3-0eff-5bf47879f12a",
Synchronized="2017-08-05 16:53:01.0")
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

@XendraTrl(Identifier="b1d8ad99-5d50-d82d-abb0-06124d8d1c6e")
public static String es_PE_FIELD_Parameter_EntityType_Description="Tipo de Entidad Diccionario; determina propiedad y sincronización";

@XendraTrl(Identifier="b1d8ad99-5d50-d82d-abb0-06124d8d1c6e")
public static String es_PE_FIELD_Parameter_EntityType_Help="Los tipos de entidad \"Diccionario\"; \"Adempiere\"; y \"Aplicación\" podrían ser automáticamente sincronizados y las personalizaciones eliminadas ó sobreescritas";

@XendraTrl(Identifier="b1d8ad99-5d50-d82d-abb0-06124d8d1c6e")
public static String es_PE_FIELD_Parameter_EntityType_Name="Tipo de Entidad";

@XendraField(AD_Column_ID="EntityType",IsCentrallyMaintained=true,
AD_Tab_ID="bdb95750-e8ef-0353-ecfc-75d3f0867980",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@AD_Process_ID@!0",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="b1d8ad99-5d50-d82d-abb0-06124d8d1c6e")
public static final String FIELDNAME_Parameter_EntityType="b1d8ad99-5d50-d82d-abb0-06124d8d1c6e";

@XendraTrl(Identifier="798a636c-5965-11fd-3664-8978ec3f1e5a")
public static String es_PE_COLUMN_EntityType_Name="Tipo de Entidad";

@XendraColumn(AD_Element_ID="5ba917bf-871c-6f19-aa50-962adc5de558",ColumnName="EntityType",
AD_Reference_ID=18,AD_Reference_Value_ID="fae4ad31-8ff1-5d5c-8d47-2426c541cd74",AD_Val_Rule_ID="",
FieldLength=4,DefaultValue="U",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="@EntityType@=D",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="798a636c-5965-11fd-3664-8978ec3f1e5a",Synchronized="2017-08-05 16:53:01.0")
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
@XendraTrl(Identifier="7a12f839-f346-4de9-bab1-4d6ae5a0717d")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7a12f839-f346-4de9-bab1-4d6ae5a0717d",
Synchronized="2017-08-05 16:53:01.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
}
