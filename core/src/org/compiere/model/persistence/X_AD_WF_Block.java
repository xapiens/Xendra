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
/** Generated Model for AD_WF_Block
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_WF_Block extends PO
{
/** Standard Constructor
@param ctx context
@param AD_WF_Block_ID id
@param trxName transaction
*/
public X_AD_WF_Block (Properties ctx, int AD_WF_Block_ID, String trxName)
{
super (ctx, AD_WF_Block_ID, trxName);
/** if (AD_WF_Block_ID == 0)
{
setAD_WF_Block_ID (0);
setAD_Workflow_ID (0);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_WF_Block (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=647 */
public static int Table_ID=MTable.getTable_ID("AD_WF_Block");

@XendraTrl(Identifier="79fee10e-54c9-6bbb-9603-d7ae242602a9")
public static String es_PE_TAB_Block_Description="Bloque de Ejecución en Transacción de Flujo de Trabajo.";

@XendraTrl(Identifier="79fee10e-54c9-6bbb-9603-d7ae242602a9")
public static String es_PE_TAB_Block_Help="Un Bloque de Ejecución de Flujo de Trabajo es opcional y permite que todo el trabajo sea realizado en una sola transacción. Si un paso (actividad del nodo) falla, el trabajo entero se rueda detrás.";

@XendraTrl(Identifier="79fee10e-54c9-6bbb-9603-d7ae242602a9")
public static String es_PE_TAB_Block_Name="Bloques";
@XendraTab(Name="Block",
Description="Workflow Transaction Execution Block",
Help="A workflow execution block is optional and allows all work to be performed in a single transaction. If one step (node activity) fails, the entire work is rolled back.",
AD_Window_ID="62b2e7ae-ae80-0120-50fa-d101e75827e6",SeqNo=40,TabLevel=1,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="79fee10e-54c9-6bbb-9603-d7ae242602a9",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Block="79fee10e-54c9-6bbb-9603-d7ae242602a9";

@XendraTrl(Identifier="2021680c-5688-05fe-47cc-279b85f8a4de")
public static String es_PE_TABLE_AD_WF_Block_Name="Bloque de Flujo de Trabajo";

@XendraTable(Name="Workflow Block",AD_Package_ID="9df191d4-b8da-879a-276b-6e16b286e868",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",
Description="Workflow Transaction Execution Block",Help="",TableName="AD_WF_Block",AccessLevel="6",
AD_Window_ID="62b2e7ae-ae80-0120-50fa-d101e75827e6",AD_Val_Rule_ID="",IsKey=1,LoadSeq=130,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.workflow",Identifier="2021680c-5688-05fe-47cc-279b85f8a4de",
Synchronized="2020-03-03 21:36:07.0")
/** TableName=AD_WF_Block */
public static final String Table_Name="AD_WF_Block";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_WF_Block");

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
    Table_ID = MTable.getTable_ID("AD_WF_Block");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_WF_Block[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Workflow Block.
@param AD_WF_Block_ID Workflow Transaction Execution Block */
public void setAD_WF_Block_ID (int AD_WF_Block_ID)
{
if (AD_WF_Block_ID < 1) throw new IllegalArgumentException ("AD_WF_Block_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_WF_Block_ID, Integer.valueOf(AD_WF_Block_ID));
}
/** Get Workflow Block.
@return Workflow Transaction Execution Block */
public int getAD_WF_Block_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_WF_Block_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="47eba8b3-3fa9-d49e-c774-8fcc338151be")
public static String es_PE_FIELD_Block_WorkflowBlock_Name="Bloque de Flujo de Trabajo";

@XendraTrl(Identifier="47eba8b3-3fa9-d49e-c774-8fcc338151be")
public static String es_PE_FIELD_Block_WorkflowBlock_Description="Ejecuta el bloque de transacción de flujo de trabajo.";

@XendraTrl(Identifier="47eba8b3-3fa9-d49e-c774-8fcc338151be")
public static String es_PE_FIELD_Block_WorkflowBlock_Help="La ejecución del bloque en un flujo de trabajo es opcional y permite que todo el trabajo sea realizado en una sola transacción. Si un paso (actividad del nodo) falla, el trabajo entero se rueda detrás.";

@XendraField(AD_Column_ID="AD_WF_Block_ID",IsCentrallyMaintained=true,
AD_Tab_ID="79fee10e-54c9-6bbb-9603-d7ae242602a9",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="47eba8b3-3fa9-d49e-c774-8fcc338151be")
public static final String FIELDNAME_Block_WorkflowBlock="47eba8b3-3fa9-d49e-c774-8fcc338151be";
/** Column name AD_WF_Block_ID */
public static final String COLUMNNAME_AD_WF_Block_ID = "AD_WF_Block_ID";
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

@XendraTrl(Identifier="57fe770a-9482-7282-1909-750b0d10d5b1")
public static String es_PE_FIELD_Block_Workflow_Name="Flujo de Trabajo";

@XendraTrl(Identifier="57fe770a-9482-7282-1909-750b0d10d5b1")
public static String es_PE_FIELD_Block_Workflow_Description="Flujo de trabajo ó combinación de tareas";

@XendraTrl(Identifier="57fe770a-9482-7282-1909-750b0d10d5b1")
public static String es_PE_FIELD_Block_Workflow_Help="El campo flujo de trabajo identifica un flujo de trabajo único en el sistema.";

@XendraField(AD_Column_ID="AD_Workflow_ID",IsCentrallyMaintained=true,
AD_Tab_ID="79fee10e-54c9-6bbb-9603-d7ae242602a9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="57fe770a-9482-7282-1909-750b0d10d5b1")
public static final String FIELDNAME_Block_Workflow="57fe770a-9482-7282-1909-750b0d10d5b1";

@XendraTrl(Identifier="76ebe352-847e-18da-998f-ab44b31ba3fa")
public static String es_PE_COLUMN_AD_Workflow_ID_Name="Flujo de Trabajo";

@XendraColumn(AD_Element_ID="43635d58-652b-b89d-db56-913820c290aa",ColumnName="AD_Workflow_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="76ebe352-847e-18da-998f-ab44b31ba3fa",
Synchronized="2019-08-30 22:20:50.0")
/** Column name AD_Workflow_ID */
public static final String COLUMNNAME_AD_Workflow_ID = "AD_Workflow_ID";
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

@XendraTrl(Identifier="8c4415cd-498f-92bf-840e-f74f435977fe")
public static String es_PE_FIELD_Block_Description_Name="Observación";

@XendraTrl(Identifier="8c4415cd-498f-92bf-840e-f74f435977fe")
public static String es_PE_FIELD_Block_Description_Description="Observación";

@XendraTrl(Identifier="8c4415cd-498f-92bf-840e-f74f435977fe")
public static String es_PE_FIELD_Block_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="79fee10e-54c9-6bbb-9603-d7ae242602a9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8c4415cd-498f-92bf-840e-f74f435977fe")
public static final String FIELDNAME_Block_Description="8c4415cd-498f-92bf-840e-f74f435977fe";

@XendraTrl(Identifier="dde9167e-232f-5e9a-63c5-3f7ba34d62c2")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dde9167e-232f-5e9a-63c5-3f7ba34d62c2",
Synchronized="2019-08-30 22:20:50.0")
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
@XendraTrl(Identifier="8eacbf05-adde-47e4-8c89-bef2bc3cec08")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8eacbf05-adde-47e4-8c89-bef2bc3cec08",
Synchronized="2019-08-30 22:20:50.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
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

@XendraTrl(Identifier="d43ef319-5c80-a906-614f-d5fdc4941676")
public static String es_PE_FIELD_Block_Name_Name="Nombre";

@XendraTrl(Identifier="d43ef319-5c80-a906-614f-d5fdc4941676")
public static String es_PE_FIELD_Block_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="d43ef319-5c80-a906-614f-d5fdc4941676")
public static String es_PE_FIELD_Block_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="79fee10e-54c9-6bbb-9603-d7ae242602a9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d43ef319-5c80-a906-614f-d5fdc4941676")
public static final String FIELDNAME_Block_Name="d43ef319-5c80-a906-614f-d5fdc4941676";

@XendraTrl(Identifier="2eb97646-1ffa-464c-da81-d4544b45dda5")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2eb97646-1ffa-464c-da81-d4544b45dda5",
Synchronized="2019-08-30 22:20:50.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
}
