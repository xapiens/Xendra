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
/** Generated Model for AD_Workflow
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Workflow extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Workflow_ID id
@param trxName transaction
*/
public X_AD_Workflow (Properties ctx, int AD_Workflow_ID, String trxName)
{
super (ctx, AD_Workflow_ID, trxName);
/** if (AD_Workflow_ID == 0)
{
setAccessLevel (null);
setAD_Workflow_ID (0);
setAuthor (null);
setCost (0);
setDuration (0);
setEntityType (null);	
// U
setIsDefault (false);	
// N
setIsValid (false);	
// N
setName (null);
setPublishStatus (null);	
// U
setValue (null);
setVersion (0);
setWaitingTime (0);
setWorkflowType (null);	
// G
setWorkingTime (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Workflow (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=117 */
public static int Table_ID=MTable.getTable_ID("AD_Workflow");

@XendraTrl(Identifier="b4adc288-925d-fc5f-3b32-0b2d62c53dbe")
public static String es_PE_TAB_Workflow_Description="Definir Flujo de Trabajo";

@XendraTrl(Identifier="b4adc288-925d-fc5f-3b32-0b2d62c53dbe")
public static String es_PE_TAB_Workflow_Help="La pestaña de flujo de trabajo define flujos de trabajo en el sistema.";

@XendraTrl(Identifier="b4adc288-925d-fc5f-3b32-0b2d62c53dbe")
public static String es_PE_TAB_Workflow_Name="Flujo de Trabajo";
@XendraTab(Name="Workflow",
Description="Define Workflow",Help="The Workflow Tab defines Workflows in the system.",
AD_Window_ID="62b2e7ae-ae80-0120-50fa-d101e75827e6",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="b4adc288-925d-fc5f-3b32-0b2d62c53dbe",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Workflow="b4adc288-925d-fc5f-3b32-0b2d62c53dbe";

@XendraTrl(Identifier="1d921a40-e89d-e148-7d4f-97dc36c05e44")
public static String es_PE_TABLE_AD_Workflow_Name="Flujo de Trabajo";

@XendraTable(Name="Workflow",AD_Package_ID="9df191d4-b8da-879a-276b-6e16b286e868",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Workflow or combination of tasks",
Help="",TableName="AD_Workflow",AccessLevel="6",
AD_Window_ID="62b2e7ae-ae80-0120-50fa-d101e75827e6",AD_Val_Rule_ID="",IsKey=1,LoadSeq=125,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.workflow",Identifier="1d921a40-e89d-e148-7d4f-97dc36c05e44",
Synchronized="2020-03-03 21:36:13.0")
/** TableName=AD_Workflow */
public static final String Table_Name="AD_Workflow";


@XendraIndex(Name="ad_workflow_name",Identifier="1416899a-26cc-d341-8f60-6f38e9c78361",
Column_Names="ad_client_id, name",IsUnique="true",
TableIdentifier="1416899a-26cc-d341-8f60-6f38e9c78361",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_ad_workflow_name = "1416899a-26cc-d341-8f60-6f38e9c78361";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Workflow");

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
    Table_ID = MTable.getTable_ID("AD_Workflow");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Workflow[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Data Access Level.
@param AccessLevel Access Level required */
public void setAccessLevel (String AccessLevel)
{
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

@XendraTrl(Identifier="7a46aa96-9f5a-4b96-c562-e56bc69c7225")
public static String es_PE_FIELD_Workflow_DataAccessLevel_Name="Nivel de Acceso a Datos";

@XendraTrl(Identifier="7a46aa96-9f5a-4b96-c562-e56bc69c7225")
public static String es_PE_FIELD_Workflow_DataAccessLevel_Description="Nivel de Acceso requerido";

@XendraTrl(Identifier="7a46aa96-9f5a-4b96-c562-e56bc69c7225")
public static String es_PE_FIELD_Workflow_DataAccessLevel_Help="Indica el nivel de acceso requerido para este registro ó proceso";

@XendraField(AD_Column_ID="AccessLevel",IsCentrallyMaintained=true,
AD_Tab_ID="b4adc288-925d-fc5f-3b32-0b2d62c53dbe",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7a46aa96-9f5a-4b96-c562-e56bc69c7225")
public static final String FIELDNAME_Workflow_DataAccessLevel="7a46aa96-9f5a-4b96-c562-e56bc69c7225";

@XendraTrl(Identifier="e427f933-5c78-75cd-6d91-3a54df848431")
public static String es_PE_COLUMN_AccessLevel_Name="Nivel de Acceso a Datos";

@XendraColumn(AD_Element_ID="bd129648-2bd8-10dc-6b09-97aa41aa28e2",ColumnName="AccessLevel",
AD_Reference_ID=17,AD_Reference_Value_ID="5684046b-00f0-a17c-843e-efad2b0e42f3",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e427f933-5c78-75cd-6d91-3a54df848431",Synchronized="2019-08-30 22:20:54.0")
/** Column name AccessLevel */
public static final String COLUMNNAME_AccessLevel = "AccessLevel";
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

@XendraTrl(Identifier="8db33803-07f0-2a9d-ad71-36bbdec5872b")
public static String es_PE_FIELD_Workflow_Table_Name="Tabla";

@XendraTrl(Identifier="8db33803-07f0-2a9d-ad71-36bbdec5872b")
public static String es_PE_FIELD_Workflow_Table_Description="Tabla para los campos";

@XendraTrl(Identifier="8db33803-07f0-2a9d-ad71-36bbdec5872b")
public static String es_PE_FIELD_Workflow_Table_Help="La Tabla indica una tabla en la que reside un campo ó campos.";

@XendraField(AD_Column_ID="AD_Table_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b4adc288-925d-fc5f-3b32-0b2d62c53dbe",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@WorkflowType@!G",DisplayLength=26,IsReadOnly=false,SeqNo=100,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="8db33803-07f0-2a9d-ad71-36bbdec5872b")
public static final String FIELDNAME_Workflow_Table="8db33803-07f0-2a9d-ad71-36bbdec5872b";

@XendraTrl(Identifier="9c62e6a5-7e60-2c3f-be09-c97c8e931b9b")
public static String es_PE_COLUMN_AD_Table_ID_Name="Tabla";

@XendraColumn(AD_Element_ID="270eeb02-723b-0ecc-7f56-3c67fa71a7f1",ColumnName="AD_Table_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9c62e6a5-7e60-2c3f-be09-c97c8e931b9b",
Synchronized="2019-08-30 22:20:54.0")
/** Column name AD_Table_ID */
public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
/** Set Node.
@param AD_WF_Node_ID Workflow Node (activity), step or process */
public void setAD_WF_Node_ID (int AD_WF_Node_ID)
{
if (AD_WF_Node_ID <= 0) set_Value (COLUMNNAME_AD_WF_Node_ID, null);
 else 
set_Value (COLUMNNAME_AD_WF_Node_ID, Integer.valueOf(AD_WF_Node_ID));
}
/** Get Node.
@return Workflow Node (activity), step or process */
public int getAD_WF_Node_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_WF_Node_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f69da43b-8ae8-a630-09f1-1c4fef718912")
public static String es_PE_FIELD_Workflow_StartNode_Name="Iniciar Nodo";

@XendraTrl(Identifier="f69da43b-8ae8-a630-09f1-1c4fef718912")
public static String es_PE_FIELD_Workflow_StartNode_Description="Workflow Node, step or process";

@XendraTrl(Identifier="f69da43b-8ae8-a630-09f1-1c4fef718912")
public static String es_PE_FIELD_Workflow_StartNode_Help="The Workflow Node indicates a unique step or process in a Workflow.";

@XendraField(AD_Column_ID="AD_WF_Node_ID",IsCentrallyMaintained=false,
AD_Tab_ID="b4adc288-925d-fc5f-3b32-0b2d62c53dbe",AD_FieldGroup_ID="General",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f69da43b-8ae8-a630-09f1-1c4fef718912")
public static final String FIELDNAME_Workflow_StartNode="f69da43b-8ae8-a630-09f1-1c4fef718912";

@XendraTrl(Identifier="6ad9e9d2-7d07-bfa1-e6d4-302bc8abc754")
public static String es_PE_COLUMN_AD_WF_Node_ID_Name="Nodo";

@XendraColumn(AD_Element_ID="a21db5d2-692a-84ae-07db-7083b2eac74c",ColumnName="AD_WF_Node_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="0c8cc5a9-f3a1-8403-a56a-f5a4c0ad047e",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6ad9e9d2-7d07-bfa1-e6d4-302bc8abc754",Synchronized="2019-08-30 22:20:54.0")
/** Column name AD_WF_Node_ID */
public static final String COLUMNNAME_AD_WF_Node_ID = "AD_WF_Node_ID";
/** Set Workflow Responsible.
@param AD_WF_Responsible_ID Responsible for Workflow Execution */
public void setAD_WF_Responsible_ID (int AD_WF_Responsible_ID)
{
if (AD_WF_Responsible_ID <= 0) set_Value (COLUMNNAME_AD_WF_Responsible_ID, null);
 else 
set_Value (COLUMNNAME_AD_WF_Responsible_ID, Integer.valueOf(AD_WF_Responsible_ID));
}
/** Get Workflow Responsible.
@return Responsible for Workflow Execution */
public int getAD_WF_Responsible_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_WF_Responsible_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9f9c583d-7456-6e07-bbda-a36181377b19")
public static String es_PE_FIELD_Workflow_WorkflowResponsible_Name="Responsable del Flujo de Trabajo";

@XendraTrl(Identifier="9f9c583d-7456-6e07-bbda-a36181377b19")
public static String es_PE_FIELD_Workflow_WorkflowResponsible_Description="Responsable para la ejecución del flujo de trabajo.";

@XendraTrl(Identifier="9f9c583d-7456-6e07-bbda-a36181377b19")
public static String es_PE_FIELD_Workflow_WorkflowResponsible_Help="La última responsabilidad para el flujo de trabajo es con un usuario actual. El flujo de trabajo responsable permite definir maneras de encontrar a ese usuario final.";

@XendraField(AD_Column_ID="AD_WF_Responsible_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b4adc288-925d-fc5f-3b32-0b2d62c53dbe",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9f9c583d-7456-6e07-bbda-a36181377b19")
public static final String FIELDNAME_Workflow_WorkflowResponsible="9f9c583d-7456-6e07-bbda-a36181377b19";

@XendraTrl(Identifier="0b49ca71-c1da-7245-4c3d-b46e309b4e61")
public static String es_PE_COLUMN_AD_WF_Responsible_ID_Name="Responsable del Flujo de Trabajo";

@XendraColumn(AD_Element_ID="4977b0dd-ed8d-9bb5-1edb-a21110bcf169",
ColumnName="AD_WF_Responsible_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0b49ca71-c1da-7245-4c3d-b46e309b4e61",Synchronized="2019-08-30 22:20:54.0")
/** Column name AD_WF_Responsible_ID */
public static final String COLUMNNAME_AD_WF_Responsible_ID = "AD_WF_Responsible_ID";
/** Set Workflow.
@param AD_Workflow_ID Workflow or combination of tasks */
public void setAD_Workflow_ID (int AD_Workflow_ID)
{
if (AD_Workflow_ID < 1) throw new IllegalArgumentException ("AD_Workflow_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Workflow_ID, Integer.valueOf(AD_Workflow_ID));
}
/** Get Workflow.
@return Workflow or combination of tasks */
public int getAD_Workflow_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Workflow_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e531ce06-264f-397e-1621-719363ddb402")
public static String es_PE_FIELD_Workflow_Workflow_Name="Flujo de Trabajo";

@XendraTrl(Identifier="e531ce06-264f-397e-1621-719363ddb402")
public static String es_PE_FIELD_Workflow_Workflow_Description="Flujo de trabajo ó combinación de tareas";

@XendraTrl(Identifier="e531ce06-264f-397e-1621-719363ddb402")
public static String es_PE_FIELD_Workflow_Workflow_Help="El campo flujo de trabajo identifica un flujo de trabajo único en el sistema.";

@XendraField(AD_Column_ID="AD_Workflow_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b4adc288-925d-fc5f-3b32-0b2d62c53dbe",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e531ce06-264f-397e-1621-719363ddb402")
public static final String FIELDNAME_Workflow_Workflow="e531ce06-264f-397e-1621-719363ddb402";
/** Column name AD_Workflow_ID */
public static final String COLUMNNAME_AD_Workflow_ID = "AD_Workflow_ID";
/** Set Workflow Processor.
@param AD_WorkflowProcessor_ID Workflow Processor Server */
public void setAD_WorkflowProcessor_ID (int AD_WorkflowProcessor_ID)
{
if (AD_WorkflowProcessor_ID <= 0) set_Value (COLUMNNAME_AD_WorkflowProcessor_ID, null);
 else 
set_Value (COLUMNNAME_AD_WorkflowProcessor_ID, Integer.valueOf(AD_WorkflowProcessor_ID));
}
/** Get Workflow Processor.
@return Workflow Processor Server */
public int getAD_WorkflowProcessor_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_WorkflowProcessor_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3b84d24e-44c4-6641-5f03-338ea9490922")
public static String es_PE_FIELD_Workflow_WorkflowProcessor_Name="Procesador FT";

@XendraTrl(Identifier="3b84d24e-44c4-6641-5f03-338ea9490922")
public static String es_PE_FIELD_Workflow_WorkflowProcessor_Description="Servidor del procesador del flujo de trabajo";

@XendraTrl(Identifier="3b84d24e-44c4-6641-5f03-338ea9490922")
public static String es_PE_FIELD_Workflow_WorkflowProcessor_Help="Servidor del procesador del flujo de trabajo";

@XendraField(AD_Column_ID="AD_WorkflowProcessor_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b4adc288-925d-fc5f-3b32-0b2d62c53dbe",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3b84d24e-44c4-6641-5f03-338ea9490922")
public static final String FIELDNAME_Workflow_WorkflowProcessor="3b84d24e-44c4-6641-5f03-338ea9490922";

@XendraTrl(Identifier="c7ab9ff7-a9a9-8a2c-9f64-757db1a8f51f")
public static String es_PE_COLUMN_AD_WorkflowProcessor_ID_Name="Procesador FT";

@XendraColumn(AD_Element_ID="e48d9da3-c5e9-e016-867d-c04769b1b3b2",
ColumnName="AD_WorkflowProcessor_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c7ab9ff7-a9a9-8a2c-9f64-757db1a8f51f",Synchronized="2019-08-30 22:20:54.0")
/** Column name AD_WorkflowProcessor_ID */
public static final String COLUMNNAME_AD_WorkflowProcessor_ID = "AD_WorkflowProcessor_ID";
/** Set Author.
@param Author Author/Creator of the Entity */
public void setAuthor (String Author)
{
if (Author == null) throw new IllegalArgumentException ("Author is mandatory.");
if (Author.length() > 20)
{
log.warning("Length > 20 - truncated");
Author = Author.substring(0,19);
}
set_Value (COLUMNNAME_Author, Author);
}
/** Get Author.
@return Author/Creator of the Entity */
public String getAuthor() 
{
String value = (String)get_Value(COLUMNNAME_Author);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="4543f478-827d-092e-bda4-1bc0cb12999a")
public static String es_PE_FIELD_Workflow_Author_Name="Autor";

@XendraTrl(Identifier="4543f478-827d-092e-bda4-1bc0cb12999a")
public static String es_PE_FIELD_Workflow_Author_Description="Autor/creador de la entidad";

@XendraField(AD_Column_ID="Author",IsCentrallyMaintained=true,
AD_Tab_ID="b4adc288-925d-fc5f-3b32-0b2d62c53dbe",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4543f478-827d-092e-bda4-1bc0cb12999a")
public static final String FIELDNAME_Workflow_Author="4543f478-827d-092e-bda4-1bc0cb12999a";

@XendraTrl(Identifier="7f05327b-6585-456a-b95b-8865d35faed2")
public static String es_PE_COLUMN_Author_Name="Autor";

@XendraColumn(AD_Element_ID="bffa73b3-1258-30e7-f72a-02c1d76f6794",ColumnName="Author",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7f05327b-6585-456a-b95b-8865d35faed2",
Synchronized="2019-08-30 22:20:54.0")
/** Column name Author */
public static final String COLUMNNAME_Author = "Author";
/** Set Cost.
@param Cost Cost information */
public void setCost (int Cost)
{
set_Value (COLUMNNAME_Cost, Integer.valueOf(Cost));
}
/** Get Cost.
@return Cost information */
public int getCost() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Cost);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="bddca86a-ecb6-35cc-3ca4-e0a085d22438")
public static String es_PE_FIELD_Workflow_Cost_Name="Costo";

@XendraTrl(Identifier="bddca86a-ecb6-35cc-3ca4-e0a085d22438")
public static String es_PE_FIELD_Workflow_Cost_Description="Información Costo";

@XendraField(AD_Column_ID="Cost",IsCentrallyMaintained=true,
AD_Tab_ID="b4adc288-925d-fc5f-3b32-0b2d62c53dbe",AD_FieldGroup_ID="Simulation",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=260,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bddca86a-ecb6-35cc-3ca4-e0a085d22438")
public static final String FIELDNAME_Workflow_Cost="bddca86a-ecb6-35cc-3ca4-e0a085d22438";

@XendraTrl(Identifier="80428f7a-e6ce-0545-0c42-cdd0fee7c3e8")
public static String es_PE_COLUMN_Cost_Name="Costo";

@XendraColumn(AD_Element_ID="ea07eea5-cd5c-5001-0f53-dfcaf5256889",ColumnName="Cost",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="80428f7a-e6ce-0545-0c42-cdd0fee7c3e8",
Synchronized="2019-08-30 22:20:54.0")
/** Column name Cost */
public static final String COLUMNNAME_Cost = "Cost";
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

@XendraTrl(Identifier="18adb7d3-0922-241c-4769-4ab66143168a")
public static String es_PE_FIELD_Workflow_Description_Name="Observación";

@XendraTrl(Identifier="18adb7d3-0922-241c-4769-4ab66143168a")
public static String es_PE_FIELD_Workflow_Description_Description="Observación";

@XendraTrl(Identifier="18adb7d3-0922-241c-4769-4ab66143168a")
public static String es_PE_FIELD_Workflow_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="b4adc288-925d-fc5f-3b32-0b2d62c53dbe",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="18adb7d3-0922-241c-4769-4ab66143168a")
public static final String FIELDNAME_Workflow_Description="18adb7d3-0922-241c-4769-4ab66143168a";

@XendraTrl(Identifier="345b2675-a35b-e211-0499-669059268c41")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="345b2675-a35b-e211-0499-669059268c41",
Synchronized="2019-08-30 22:20:54.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Document Value Logic.
@param DocValueLogic Logic to determine Workflow Start - If true, a workflow process is started for the document */
public void setDocValueLogic (String DocValueLogic)
{
if (DocValueLogic != null && DocValueLogic.length() > 2000)
{
log.warning("Length > 2000 - truncated");
DocValueLogic = DocValueLogic.substring(0,1999);
}
set_Value (COLUMNNAME_DocValueLogic, DocValueLogic);
}
/** Get Document Value Logic.
@return Logic to determine Workflow Start - If true, a workflow process is started for the document */
public String getDocValueLogic() 
{
String value = (String)get_Value(COLUMNNAME_DocValueLogic);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="91d454ff-cae4-4db7-aec3-02a14f847222")
public static String es_PE_FIELD_Workflow_DocumentValueLogic_Name="Lógica del Valor del Documento";

@XendraTrl(Identifier="91d454ff-cae4-4db7-aec3-02a14f847222")
public static String es_PE_FIELD_Workflow_DocumentValueLogic_Description="Lógica para determinar el Inicio del FT - Si es verdadero, un proceso de FT es iniciado para el documento";

@XendraField(AD_Column_ID="DocValueLogic",IsCentrallyMaintained=true,
AD_Tab_ID="b4adc288-925d-fc5f-3b32-0b2d62c53dbe",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@WorkflowType@=V",DisplayLength=60,IsReadOnly=false,SeqNo=110,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="91d454ff-cae4-4db7-aec3-02a14f847222")
public static final String FIELDNAME_Workflow_DocumentValueLogic="91d454ff-cae4-4db7-aec3-02a14f847222";

@XendraTrl(Identifier="fd4a5cad-9a58-1479-58bb-0422dbb06602")
public static String es_PE_COLUMN_DocValueLogic_Name="Lógica del Valor del Documento";

@XendraColumn(AD_Element_ID="43cc4b5b-9f46-f674-ad0d-64b58c7142b9",ColumnName="DocValueLogic",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fd4a5cad-9a58-1479-58bb-0422dbb06602",
Synchronized="2019-08-30 22:20:54.0")
/** Column name DocValueLogic */
public static final String COLUMNNAME_DocValueLogic = "DocValueLogic";
/** Set Duration.
@param Duration Normal Duration in Duration Unit */
public void setDuration (int Duration)
{
set_Value (COLUMNNAME_Duration, Integer.valueOf(Duration));
}
/** Get Duration.
@return Normal Duration in Duration Unit */
public int getDuration() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Duration);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2ac1bdf2-c7b8-c0ba-9a87-b1e1912d67a5")
public static String es_PE_FIELD_Workflow_Duration_Name="Duración";

@XendraTrl(Identifier="2ac1bdf2-c7b8-c0ba-9a87-b1e1912d67a5")
public static String es_PE_FIELD_Workflow_Duration_Description="Duración en unidad de la duración";

@XendraTrl(Identifier="2ac1bdf2-c7b8-c0ba-9a87-b1e1912d67a5")
public static String es_PE_FIELD_Workflow_Duration_Help="Esperando la hora prevista para la ejecución";

@XendraField(AD_Column_ID="Duration",IsCentrallyMaintained=true,
AD_Tab_ID="b4adc288-925d-fc5f-3b32-0b2d62c53dbe",AD_FieldGroup_ID="Simulation",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=250,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2ac1bdf2-c7b8-c0ba-9a87-b1e1912d67a5")
public static final String FIELDNAME_Workflow_Duration="2ac1bdf2-c7b8-c0ba-9a87-b1e1912d67a5";

@XendraTrl(Identifier="6687db48-7e50-a0c1-0249-c1edef503807")
public static String es_PE_COLUMN_Duration_Name="Duración";

@XendraColumn(AD_Element_ID="84f247b5-401b-1072-23eb-df85d67fee81",ColumnName="Duration",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6687db48-7e50-a0c1-0249-c1edef503807",
Synchronized="2019-08-30 22:20:54.0")
/** Column name Duration */
public static final String COLUMNNAME_Duration = "Duration";
/** Set DurationLimit.
@param DurationLimit Normal Duration in Duration Unit */
public void setDurationLimit (int DurationLimit)
{
set_Value (COLUMNNAME_DurationLimit, Integer.valueOf(DurationLimit));
}
/** Get DurationLimit.
@return Normal Duration in Duration Unit */
public int getDurationLimit() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_DurationLimit);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="89314762-05a0-c097-9cbe-339fca0aacca")
public static String es_PE_FIELD_Workflow_DurationLimit_Name="DurationLimit";

@XendraTrl(Identifier="89314762-05a0-c097-9cbe-339fca0aacca")
public static String es_PE_FIELD_Workflow_DurationLimit_Description="Normal Duration in Duration Unit";

@XendraTrl(Identifier="89314762-05a0-c097-9cbe-339fca0aacca")
public static String es_PE_FIELD_Workflow_DurationLimit_Help="Expected (normal) Length of time for the execution";

@XendraField(AD_Column_ID="DurationLimit",IsCentrallyMaintained=true,
AD_Tab_ID="b4adc288-925d-fc5f-3b32-0b2d62c53dbe",AD_FieldGroup_ID="General",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="89314762-05a0-c097-9cbe-339fca0aacca")
public static final String FIELDNAME_Workflow_DurationLimit="89314762-05a0-c097-9cbe-339fca0aacca";

@XendraTrl(Identifier="be328ac5-92f4-19bd-0f08-9bdedcc19582")
public static String es_PE_COLUMN_DurationLimit_Name="DurationLimit";

@XendraColumn(AD_Element_ID="39e4bcd3-0fa4-efbd-8bf3-39fde04fb3db",ColumnName="DurationLimit",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="be328ac5-92f4-19bd-0f08-9bdedcc19582",
Synchronized="2019-08-30 22:20:54.0")
/** Column name DurationLimit */
public static final String COLUMNNAME_DurationLimit = "DurationLimit";
/** Set Duration Unit.
@param DurationUnit Unit of Duration */
public void setDurationUnit (String DurationUnit)
{
if (DurationUnit != null && DurationUnit.length() > 1)
{
log.warning("Length > 1 - truncated");
DurationUnit = DurationUnit.substring(0,0);
}
set_Value (COLUMNNAME_DurationUnit, DurationUnit);
}
/** Get Duration Unit.
@return Unit of Duration */
public String getDurationUnit() 
{
return (String)get_Value(COLUMNNAME_DurationUnit);
}

@XendraTrl(Identifier="138f9b31-a7ce-1f71-dca1-52a84b9528e2")
public static String es_PE_FIELD_Workflow_DurationUnit_Name="Unidad de la Duración";

@XendraTrl(Identifier="138f9b31-a7ce-1f71-dca1-52a84b9528e2")
public static String es_PE_FIELD_Workflow_DurationUnit_Description="Unidad de la Duración";

@XendraTrl(Identifier="138f9b31-a7ce-1f71-dca1-52a84b9528e2")
public static String es_PE_FIELD_Workflow_DurationUnit_Help="Unidad para definir la duración de tiempo para la ejecución.";

@XendraField(AD_Column_ID="DurationUnit",IsCentrallyMaintained=true,
AD_Tab_ID="b4adc288-925d-fc5f-3b32-0b2d62c53dbe",AD_FieldGroup_ID="General",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="138f9b31-a7ce-1f71-dca1-52a84b9528e2")
public static final String FIELDNAME_Workflow_DurationUnit="138f9b31-a7ce-1f71-dca1-52a84b9528e2";

@XendraTrl(Identifier="1801d42e-16a2-1ca9-f50b-7f1944900390")
public static String es_PE_COLUMN_DurationUnit_Name="Unidad de la Duración";

@XendraColumn(AD_Element_ID="b30e3590-4f6d-41a0-70aa-c82aabe42bb4",ColumnName="DurationUnit",
AD_Reference_ID=17,AD_Reference_Value_ID="ff9fc47e-117f-0c97-65db-b02e392a7e15",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="1801d42e-16a2-1ca9-f50b-7f1944900390",Synchronized="2019-08-30 22:20:54.0")
/** Column name DurationUnit */
public static final String COLUMNNAME_DurationUnit = "DurationUnit";
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

@XendraTrl(Identifier="6c1fd824-2789-c5e2-bb4a-ee1878aa2a30")
public static String es_PE_FIELD_Workflow_EntityType_Name="Tipo de Entidad";

@XendraTrl(Identifier="6c1fd824-2789-c5e2-bb4a-ee1878aa2a30")
public static String es_PE_FIELD_Workflow_EntityType_Description="Tipo de Entidad Diccionario; determina propiedad y sincronización";

@XendraTrl(Identifier="6c1fd824-2789-c5e2-bb4a-ee1878aa2a30")
public static String es_PE_FIELD_Workflow_EntityType_Help="Los tipos de entidad \"Diccionario\"; \"Adempiere\"; y \"Aplicación\" podrían ser automáticamente sincronizados y las personalizaciones eliminadas ó sobreescritas";

@XendraField(AD_Column_ID="EntityType",IsCentrallyMaintained=true,
AD_Tab_ID="b4adc288-925d-fc5f-3b32-0b2d62c53dbe",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6c1fd824-2789-c5e2-bb4a-ee1878aa2a30")
public static final String FIELDNAME_Workflow_EntityType="6c1fd824-2789-c5e2-bb4a-ee1878aa2a30";

@XendraTrl(Identifier="263d898e-fdb6-ae65-fb15-8204577402ab")
public static String es_PE_COLUMN_EntityType_Name="Tipo de Entidad";

@XendraColumn(AD_Element_ID="5ba917bf-871c-6f19-aa50-962adc5de558",ColumnName="EntityType",
AD_Reference_ID=18,AD_Reference_Value_ID="fae4ad31-8ff1-5d5c-8d47-2426c541cd74",AD_Val_Rule_ID="",
FieldLength=4,DefaultValue="U",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="@EntityType@=D",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="263d898e-fdb6-ae65-fb15-8204577402ab",Synchronized="2019-08-30 22:20:54.0")
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

@XendraTrl(Identifier="fcc01d20-59fe-652e-233d-055ce3cce524")
public static String es_PE_FIELD_Workflow_CommentHelp_Name="Ayuda";

@XendraTrl(Identifier="fcc01d20-59fe-652e-233d-055ce3cce524")
public static String es_PE_FIELD_Workflow_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="fcc01d20-59fe-652e-233d-055ce3cce524")
public static String es_PE_FIELD_Workflow_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="b4adc288-925d-fc5f-3b32-0b2d62c53dbe",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fcc01d20-59fe-652e-233d-055ce3cce524")
public static final String FIELDNAME_Workflow_CommentHelp="fcc01d20-59fe-652e-233d-055ce3cce524";

@XendraTrl(Identifier="50245f16-b60f-1c79-2aac-56f26ecd1048")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="50245f16-b60f-1c79-2aac-56f26ecd1048",
Synchronized="2019-08-30 22:20:54.0")
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
@XendraTrl(Identifier="c4fd34ee-be96-4168-af7f-7aad0c0f678b")
public static String es_PE_COLUMN_Identifier_Name="identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c4fd34ee-be96-4168-af7f-7aad0c0f678b",
Synchronized="2019-08-30 22:20:54.0")
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

@XendraTrl(Identifier="a8423994-f43a-cd89-0f3e-0dd270b3eedb")
public static String es_PE_FIELD_Workflow_Default_Name="Predeterminado";

@XendraTrl(Identifier="a8423994-f43a-cd89-0f3e-0dd270b3eedb")
public static String es_PE_FIELD_Workflow_Default_Description="Valor Predeterminado";

@XendraTrl(Identifier="a8423994-f43a-cd89-0f3e-0dd270b3eedb")
public static String es_PE_FIELD_Workflow_Default_Help="El cuadro de verificación indica si este registro será usado como un valor predeterminado";

@XendraField(AD_Column_ID="IsDefault",IsCentrallyMaintained=true,
AD_Tab_ID="b4adc288-925d-fc5f-3b32-0b2d62c53dbe",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a8423994-f43a-cd89-0f3e-0dd270b3eedb")
public static final String FIELDNAME_Workflow_Default="a8423994-f43a-cd89-0f3e-0dd270b3eedb";

@XendraTrl(Identifier="caac9f16-39a7-b34a-3f4a-85748b448e78")
public static String es_PE_COLUMN_IsDefault_Name="Predeterminado";

@XendraColumn(AD_Element_ID="8617f892-e113-a5fd-8715-687f792f136c",ColumnName="IsDefault",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="caac9f16-39a7-b34a-3f4a-85748b448e78",
Synchronized="2019-08-30 22:20:54.0")
/** Column name IsDefault */
public static final String COLUMNNAME_IsDefault = "IsDefault";
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

@XendraTrl(Identifier="40e74ba5-ddc5-90a7-c537-bbda00f5cf36")
public static String es_PE_FIELD_Workflow_Valid_Name="Valido";

@XendraTrl(Identifier="40e74ba5-ddc5-90a7-c537-bbda00f5cf36")
public static String es_PE_FIELD_Workflow_Valid_Description="El elemento es valido";

@XendraTrl(Identifier="40e74ba5-ddc5-90a7-c537-bbda00f5cf36")
public static String es_PE_FIELD_Workflow_Valid_Help="El elemento pasado es el cheque de la validación";

@XendraField(AD_Column_ID="IsValid",IsCentrallyMaintained=true,
AD_Tab_ID="b4adc288-925d-fc5f-3b32-0b2d62c53dbe",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=300,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="40e74ba5-ddc5-90a7-c537-bbda00f5cf36")
public static final String FIELDNAME_Workflow_Valid="40e74ba5-ddc5-90a7-c537-bbda00f5cf36";

@XendraTrl(Identifier="6d6baebf-892b-e074-9ca9-575d8d7ad27f")
public static String es_PE_COLUMN_IsValid_Name="Valido";

@XendraColumn(AD_Element_ID="394c3099-1638-2f07-2e14-7bd38bb8ad25",ColumnName="IsValid",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6d6baebf-892b-e074-9ca9-575d8d7ad27f",
Synchronized="2019-08-30 22:20:54.0")
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

@XendraTrl(Identifier="b4760f6a-fb41-46a5-ec88-2a2968c17e1b")
public static String es_PE_FIELD_Workflow_Name_Name="Nombre";

@XendraTrl(Identifier="b4760f6a-fb41-46a5-ec88-2a2968c17e1b")
public static String es_PE_FIELD_Workflow_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="b4760f6a-fb41-46a5-ec88-2a2968c17e1b")
public static String es_PE_FIELD_Workflow_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="b4adc288-925d-fc5f-3b32-0b2d62c53dbe",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b4760f6a-fb41-46a5-ec88-2a2968c17e1b")
public static final String FIELDNAME_Workflow_Name="b4760f6a-fb41-46a5-ec88-2a2968c17e1b";

@XendraTrl(Identifier="2786eb47-032a-a006-1380-8bff49dccb27")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2786eb47-032a-a006-1380-8bff49dccb27",
Synchronized="2019-08-30 22:20:54.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Priority.
@param Priority Indicates if this request is of a high, medium or low priority. */
public void setPriority (int Priority)
{
set_Value (COLUMNNAME_Priority, Integer.valueOf(Priority));
}
/** Get Priority.
@return Indicates if this request is of a high, medium or low priority. */
public int getPriority() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Priority);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="792f8fe8-934b-9b61-6426-b3e4b0234ae1")
public static String es_PE_FIELD_Workflow_Priority_Name="Prioridad";

@XendraTrl(Identifier="792f8fe8-934b-9b61-6426-b3e4b0234ae1")
public static String es_PE_FIELD_Workflow_Priority_Description="Indica si este requerimiento es de una alta; media ó baja prioridad";

@XendraTrl(Identifier="792f8fe8-934b-9b61-6426-b3e4b0234ae1")
public static String es_PE_FIELD_Workflow_Priority_Help="La Prioridad indica la importancia de este requerimiento";

@XendraField(AD_Column_ID="Priority",IsCentrallyMaintained=true,
AD_Tab_ID="b4adc288-925d-fc5f-3b32-0b2d62c53dbe",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="792f8fe8-934b-9b61-6426-b3e4b0234ae1")
public static final String FIELDNAME_Workflow_Priority="792f8fe8-934b-9b61-6426-b3e4b0234ae1";

@XendraTrl(Identifier="fbf25234-d85f-a62f-0edf-fe425884c95d")
public static String es_PE_COLUMN_Priority_Name="Prioridad";

@XendraColumn(AD_Element_ID="5057921e-c21f-a6bc-898d-053fcc239847",ColumnName="Priority",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fbf25234-d85f-a62f-0edf-fe425884c95d",
Synchronized="2019-08-30 22:20:54.0")
/** Column name Priority */
public static final String COLUMNNAME_Priority = "Priority";
/** Set Publication Status.
@param PublishStatus Status of Publication */
public void setPublishStatus (String PublishStatus)
{
if (PublishStatus.length() > 1)
{
log.warning("Length > 1 - truncated");
PublishStatus = PublishStatus.substring(0,0);
}
set_Value (COLUMNNAME_PublishStatus, PublishStatus);
}
/** Get Publication Status.
@return Status of Publication */
public String getPublishStatus() 
{
return (String)get_Value(COLUMNNAME_PublishStatus);
}

@XendraTrl(Identifier="a7ce12e4-89f0-3ba9-1a70-13482ca040ab")
public static String es_PE_FIELD_Workflow_PublicationStatus_Name="Estado de la Publicación";

@XendraTrl(Identifier="a7ce12e4-89f0-3ba9-1a70-13482ca040ab")
public static String es_PE_FIELD_Workflow_PublicationStatus_Description="Estado de la Publicación";

@XendraTrl(Identifier="a7ce12e4-89f0-3ba9-1a70-13482ca040ab")
public static String es_PE_FIELD_Workflow_PublicationStatus_Help="Usado para documentación interna";

@XendraField(AD_Column_ID="PublishStatus",IsCentrallyMaintained=true,
AD_Tab_ID="b4adc288-925d-fc5f-3b32-0b2d62c53dbe",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a7ce12e4-89f0-3ba9-1a70-13482ca040ab")
public static final String FIELDNAME_Workflow_PublicationStatus="a7ce12e4-89f0-3ba9-1a70-13482ca040ab";

@XendraTrl(Identifier="503f3938-96db-a121-845a-8e9db0bdda67")
public static String es_PE_COLUMN_PublishStatus_Name="Estado de la Publicación";

@XendraColumn(AD_Element_ID="3045869a-c563-3800-cc78-c17e3bd83d38",ColumnName="PublishStatus",
AD_Reference_ID=17,AD_Reference_Value_ID="500006fa-6215-9c7e-9fb1-23609093d16b",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="U",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="503f3938-96db-a121-845a-8e9db0bdda67",Synchronized="2019-08-30 22:20:54.0")
/** Column name PublishStatus */
public static final String COLUMNNAME_PublishStatus = "PublishStatus";
/** Set Validate Workflow.
@param ValidateWorkflow Validate Workflow */
public void setValidateWorkflow (String ValidateWorkflow)
{
if (ValidateWorkflow != null && ValidateWorkflow.length() > 1)
{
log.warning("Length > 1 - truncated");
ValidateWorkflow = ValidateWorkflow.substring(0,0);
}
set_Value (COLUMNNAME_ValidateWorkflow, ValidateWorkflow);
}
/** Get Validate Workflow.
@return Validate Workflow */
public String getValidateWorkflow() 
{
return (String)get_Value(COLUMNNAME_ValidateWorkflow);
}

@XendraTrl(Identifier="06aec98b-090a-87a3-d26e-9a2166937c7e")
public static String es_PE_FIELD_Workflow_ValidateWorkflow_Name="Valida Flujo de Trabajo";

@XendraTrl(Identifier="06aec98b-090a-87a3-d26e-9a2166937c7e")
public static String es_PE_FIELD_Workflow_ValidateWorkflow_Description="Valida cuando el Flujo de Trabajo es correcto";

@XendraTrl(Identifier="06aec98b-090a-87a3-d26e-9a2166937c7e")
public static String es_PE_FIELD_Workflow_ValidateWorkflow_Help="(Comprobación limitada)";

@XendraField(AD_Column_ID="ValidateWorkflow",IsCentrallyMaintained=true,
AD_Tab_ID="b4adc288-925d-fc5f-3b32-0b2d62c53dbe",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=290,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="06aec98b-090a-87a3-d26e-9a2166937c7e")
public static final String FIELDNAME_Workflow_ValidateWorkflow="06aec98b-090a-87a3-d26e-9a2166937c7e";

@XendraTrl(Identifier="122873dd-5a35-c241-1252-f2b3365039e6")
public static String es_PE_COLUMN_ValidateWorkflow_Name="Flujo de Trabajo Valido";

@XendraColumn(AD_Element_ID="be6ca623-60cb-ac31-d41c-3b2ac0995b99",ColumnName="ValidateWorkflow",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="6f79b03f-7d59-748d-396a-471311719a27",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="122873dd-5a35-c241-1252-f2b3365039e6",Synchronized="2019-08-30 22:20:54.0")
/** Column name ValidateWorkflow */
public static final String COLUMNNAME_ValidateWorkflow = "ValidateWorkflow";
/** Set Valid from.
@param ValidFrom Valid from including this date (first day) */
public void setValidFrom (Timestamp ValidFrom)
{
set_Value (COLUMNNAME_ValidFrom, ValidFrom);
}
/** Get Valid from.
@return Valid from including this date (first day) */
public Timestamp getValidFrom() 
{
return (Timestamp)get_Value(COLUMNNAME_ValidFrom);
}

@XendraTrl(Identifier="dbc65a0b-3a96-c4ef-c4d8-505633a1b500")
public static String es_PE_FIELD_Workflow_ValidFrom_Name="Válido Desde";

@XendraTrl(Identifier="dbc65a0b-3a96-c4ef-c4d8-505633a1b500")
public static String es_PE_FIELD_Workflow_ValidFrom_Description="Válido desde; incluyendo esta fecha (primer día)";

@XendraTrl(Identifier="dbc65a0b-3a96-c4ef-c4d8-505633a1b500")
public static String es_PE_FIELD_Workflow_ValidFrom_Help="La fecha válida desde indica el primer día de un rango de fechas";

@XendraField(AD_Column_ID="ValidFrom",IsCentrallyMaintained=true,
AD_Tab_ID="b4adc288-925d-fc5f-3b32-0b2d62c53dbe",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dbc65a0b-3a96-c4ef-c4d8-505633a1b500")
public static final String FIELDNAME_Workflow_ValidFrom="dbc65a0b-3a96-c4ef-c4d8-505633a1b500";

@XendraTrl(Identifier="09dc7220-139c-79d0-1eee-91b687f3e52e")
public static String es_PE_COLUMN_ValidFrom_Name="Válido Desde";

@XendraColumn(AD_Element_ID="86b1171a-a6c6-0da5-1aea-3f3106450d07",ColumnName="ValidFrom",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="09dc7220-139c-79d0-1eee-91b687f3e52e",
Synchronized="2019-08-30 22:20:54.0")
/** Column name ValidFrom */
public static final String COLUMNNAME_ValidFrom = "ValidFrom";
/** Set Valid to.
@param ValidTo Valid to including this date (last day) */
public void setValidTo (Timestamp ValidTo)
{
set_Value (COLUMNNAME_ValidTo, ValidTo);
}
/** Get Valid to.
@return Valid to including this date (last day) */
public Timestamp getValidTo() 
{
return (Timestamp)get_Value(COLUMNNAME_ValidTo);
}

@XendraTrl(Identifier="b6ba6f71-1d93-1396-a361-fb07add1c4a1")
public static String es_PE_FIELD_Workflow_ValidTo_Name="Válido Hasta";

@XendraTrl(Identifier="b6ba6f71-1d93-1396-a361-fb07add1c4a1")
public static String es_PE_FIELD_Workflow_ValidTo_Description="Válido hasta; incluyendo esta fecha (ultimo día)";

@XendraTrl(Identifier="b6ba6f71-1d93-1396-a361-fb07add1c4a1")
public static String es_PE_FIELD_Workflow_ValidTo_Help="La fecha válida hasta indica el último día de un rango de fechas";

@XendraField(AD_Column_ID="ValidTo",IsCentrallyMaintained=true,
AD_Tab_ID="b4adc288-925d-fc5f-3b32-0b2d62c53dbe",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b6ba6f71-1d93-1396-a361-fb07add1c4a1")
public static final String FIELDNAME_Workflow_ValidTo="b6ba6f71-1d93-1396-a361-fb07add1c4a1";

@XendraTrl(Identifier="f87efe00-3f81-ff03-9338-50f400427462")
public static String es_PE_COLUMN_ValidTo_Name="Válido Hasta";

@XendraColumn(AD_Element_ID="0fbe43c3-c76d-0505-0043-63adb568a68f",ColumnName="ValidTo",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f87efe00-3f81-ff03-9338-50f400427462",
Synchronized="2019-08-30 22:20:54.0")
/** Column name ValidTo */
public static final String COLUMNNAME_ValidTo = "ValidTo";
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
@XendraTrl(Identifier="f1b598a0-e136-34d3-5ebd-4c25466162ea")
public static String es_PE_FIELD_Workflow_SearchKey_Name="Clave de Búsqueda";

@XendraTrl(Identifier="f1b598a0-e136-34d3-5ebd-4c25466162ea")
public static String es_PE_FIELD_Workflow_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="f1b598a0-e136-34d3-5ebd-4c25466162ea")
public static String es_PE_FIELD_Workflow_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="b4adc288-925d-fc5f-3b32-0b2d62c53dbe",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f1b598a0-e136-34d3-5ebd-4c25466162ea")
public static final String FIELDNAME_Workflow_SearchKey="f1b598a0-e136-34d3-5ebd-4c25466162ea";

@XendraTrl(Identifier="e3c87b6d-9e4d-dc0e-3592-e4f1e5c14843")
public static String es_PE_COLUMN_Value_Name="Clave de Búsqueda";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e3c87b6d-9e4d-dc0e-3592-e4f1e5c14843",
Synchronized="2019-08-30 22:20:54.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
/** Set Version.
@param Version Version of the table definition */
public void setVersion (int Version)
{
set_Value (COLUMNNAME_Version, Integer.valueOf(Version));
}
/** Get Version.
@return Version of the table definition */
public int getVersion() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Version);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5dacc27d-6760-0c65-8382-4977af3bbeac")
public static String es_PE_FIELD_Workflow_Version_Name="Versión";

@XendraTrl(Identifier="5dacc27d-6760-0c65-8382-4977af3bbeac")
public static String es_PE_FIELD_Workflow_Version_Description="Versión de la definición de tabla";

@XendraTrl(Identifier="5dacc27d-6760-0c65-8382-4977af3bbeac")
public static String es_PE_FIELD_Workflow_Version_Help="La versión indica la versión de esta definición de tabla";

@XendraField(AD_Column_ID="Version",IsCentrallyMaintained=true,
AD_Tab_ID="b4adc288-925d-fc5f-3b32-0b2d62c53dbe",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5dacc27d-6760-0c65-8382-4977af3bbeac")
public static final String FIELDNAME_Workflow_Version="5dacc27d-6760-0c65-8382-4977af3bbeac";

@XendraTrl(Identifier="f8c41ffa-f64d-8b26-f5ad-d05367ae202c")
public static String es_PE_COLUMN_Version_Name="Versión";

@XendraColumn(AD_Element_ID="739fe203-51de-92a9-b8a8-c08f63b73506",ColumnName="Version",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f8c41ffa-f64d-8b26-f5ad-d05367ae202c",
Synchronized="2019-08-30 22:20:54.0")
/** Column name Version */
public static final String COLUMNNAME_Version = "Version";
/** Set Waiting Time.
@param WaitingTime Workflow Simulation Waiting time */
public void setWaitingTime (int WaitingTime)
{
set_Value (COLUMNNAME_WaitingTime, Integer.valueOf(WaitingTime));
}
/** Get Waiting Time.
@return Workflow Simulation Waiting time */
public int getWaitingTime() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_WaitingTime);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9b3dc996-6720-abaf-9aad-390d65bb00b7")
public static String es_PE_FIELD_Workflow_WaitingTime_Name="Tiempo de Espera";

@XendraTrl(Identifier="9b3dc996-6720-abaf-9aad-390d65bb00b7")
public static String es_PE_FIELD_Workflow_WaitingTime_Description="Tiempo de espera para la simulación del flujo de trabajo.";

@XendraTrl(Identifier="9b3dc996-6720-abaf-9aad-390d65bb00b7")
public static String es_PE_FIELD_Workflow_WaitingTime_Help="Cantidad de hora necesaria de preparar el funcionamiento de la tarea en unidades de la duración.";

@XendraField(AD_Column_ID="WaitingTime",IsCentrallyMaintained=true,
AD_Tab_ID="b4adc288-925d-fc5f-3b32-0b2d62c53dbe",AD_FieldGroup_ID="Simulation",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=280,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9b3dc996-6720-abaf-9aad-390d65bb00b7")
public static final String FIELDNAME_Workflow_WaitingTime="9b3dc996-6720-abaf-9aad-390d65bb00b7";

@XendraTrl(Identifier="8f8bed28-3eb0-97e2-8d33-c230fb01d118")
public static String es_PE_COLUMN_WaitingTime_Name="Tiempo de Espera";

@XendraColumn(AD_Element_ID="a11e21ad-f8b1-98c5-688c-50458c652cc9",ColumnName="WaitingTime",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8f8bed28-3eb0-97e2-8d33-c230fb01d118",
Synchronized="2019-08-30 22:20:54.0")
/** Column name WaitingTime */
public static final String COLUMNNAME_WaitingTime = "WaitingTime";
/** Set Workflow Type.
@param WorkflowType Type of Worflow */
public void setWorkflowType (String WorkflowType)
{
if (WorkflowType.length() > 1)
{
log.warning("Length > 1 - truncated");
WorkflowType = WorkflowType.substring(0,0);
}
set_Value (COLUMNNAME_WorkflowType, WorkflowType);
}
/** Get Workflow Type.
@return Type of Worflow */
public String getWorkflowType() 
{
return (String)get_Value(COLUMNNAME_WorkflowType);
}

@XendraTrl(Identifier="cb9ede97-6e87-a1fe-c91f-d7f5ca1f0cc6")
public static String es_PE_FIELD_Workflow_WorkflowType_Name="Tipo de Flujo de Trabajo";

@XendraTrl(Identifier="cb9ede97-6e87-a1fe-c91f-d7f5ca1f0cc6")
public static String es_PE_FIELD_Workflow_WorkflowType_Description="Tipo de Flujo de Trabajo";

@XendraTrl(Identifier="cb9ede97-6e87-a1fe-c91f-d7f5ca1f0cc6")
public static String es_PE_FIELD_Workflow_WorkflowType_Help="El tipo de flujo de trabajo determina comó se comienza el flujo de trabajo.";

@XendraField(AD_Column_ID="WorkflowType",IsCentrallyMaintained=true,
AD_Tab_ID="b4adc288-925d-fc5f-3b32-0b2d62c53dbe",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cb9ede97-6e87-a1fe-c91f-d7f5ca1f0cc6")
public static final String FIELDNAME_Workflow_WorkflowType="cb9ede97-6e87-a1fe-c91f-d7f5ca1f0cc6";

@XendraTrl(Identifier="0358d074-f8ec-d724-dccc-609ec621e93d")
public static String es_PE_COLUMN_WorkflowType_Name="Tipo de Flujo de Trabajo";

@XendraColumn(AD_Element_ID="2a45b04c-7511-6f9b-5408-6c72559100a5",ColumnName="WorkflowType",
AD_Reference_ID=17,AD_Reference_Value_ID="9cff63cf-4649-ca92-f60d-786935680030",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="G",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0358d074-f8ec-d724-dccc-609ec621e93d",Synchronized="2019-08-30 22:20:54.0")
/** Column name WorkflowType */
public static final String COLUMNNAME_WorkflowType = "WorkflowType";
/** Set Working Time.
@param WorkingTime Workflow Simulation Execution Time */
public void setWorkingTime (int WorkingTime)
{
set_Value (COLUMNNAME_WorkingTime, Integer.valueOf(WorkingTime));
}
/** Get Working Time.
@return Workflow Simulation Execution Time */
public int getWorkingTime() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_WorkingTime);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="cda38bb1-d89a-ea57-06bb-bbcef147953c")
public static String es_PE_FIELD_Workflow_WorkingTime_Name="Tiempo Acumulado";

@XendraTrl(Identifier="cda38bb1-d89a-ea57-06bb-bbcef147953c")
public static String es_PE_FIELD_Workflow_WorkingTime_Description="Simulación de la ejecución del tiempo acumulado en el flujo de trabajo.";

@XendraTrl(Identifier="cda38bb1-d89a-ea57-06bb-bbcef147953c")
public static String es_PE_FIELD_Workflow_WorkingTime_Help="Cantidad de tiempo de duración que necesita una unidad despues de ser ejecutada.";

@XendraField(AD_Column_ID="WorkingTime",IsCentrallyMaintained=true,
AD_Tab_ID="b4adc288-925d-fc5f-3b32-0b2d62c53dbe",AD_FieldGroup_ID="Simulation",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=270,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cda38bb1-d89a-ea57-06bb-bbcef147953c")
public static final String FIELDNAME_Workflow_WorkingTime="cda38bb1-d89a-ea57-06bb-bbcef147953c";

@XendraTrl(Identifier="a721f9dc-6dae-2fa4-2c04-335d74a9ea0e")
public static String es_PE_COLUMN_WorkingTime_Name="Tiempo Acumulado";

@XendraColumn(AD_Element_ID="925c4d88-5bf2-df3b-9790-c0bffaa2d0c4",ColumnName="WorkingTime",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a721f9dc-6dae-2fa4-2c04-335d74a9ea0e",
Synchronized="2019-08-30 22:20:54.0")
/** Column name WorkingTime */
public static final String COLUMNNAME_WorkingTime = "WorkingTime";
}
