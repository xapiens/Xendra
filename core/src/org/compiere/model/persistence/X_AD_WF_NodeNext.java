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
/** Generated Model for AD_WF_NodeNext
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_WF_NodeNext extends PO
{
/** Standard Constructor
@param ctx context
@param AD_WF_NodeNext_ID id
@param trxName transaction
*/
public X_AD_WF_NodeNext (Properties ctx, int AD_WF_NodeNext_ID, String trxName)
{
super (ctx, AD_WF_NodeNext_ID, trxName);
/** if (AD_WF_NodeNext_ID == 0)
{
setAD_WF_Next_ID (0);
setAD_WF_Node_ID (0);
setAD_WF_NodeNext_ID (0);
setEntityType (null);	
// U
setIsStdUserWorkflow (false);	
// N
setSeqNo (0);	
// 10
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_WF_NodeNext (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=131 */
public static int Table_ID=MTable.getTable_ID("AD_WF_NodeNext");

@XendraTrl(Identifier="a77161b3-95b0-797c-a940-3117b8311275")
public static String es_PE_TAB_PreviousNode_Name="Nodo Previo";
@XendraTab(Name="Previous Node",
Description="",Help="",AD_Window_ID="62b2e7ae-ae80-0120-50fa-d101e75827e6",SeqNo=90,TabLevel=2,
IsSingleRow=true,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="ebae5abb-bf38-6e40-17ca-ab25a2c77c77",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="a77161b3-95b0-797c-a940-3117b8311275",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_PreviousNode="a77161b3-95b0-797c-a940-3117b8311275";

@XendraTrl(Identifier="0a776048-b2cd-3383-44a7-884c5cc2b83a")
public static String es_PE_TAB_Transition_Description="Próximo nodo";

@XendraTrl(Identifier="0a776048-b2cd-3383-44a7-884c5cc2b83a")
public static String es_PE_TAB_Transition_Name="Próximo Nodo";

@XendraTrl(Identifier="0a776048-b2cd-3383-44a7-884c5cc2b83a")
public static String es_PE_TAB_Transition_Help="La pestaña de próximos pasos define el orden, nodos ó pasos en un flujo de trabajo";

@XendraTab(Name="Transition",Description="Workflow Node Transition",
Help="The Next Nodes Tab defines the order or Nodes or Steps in a Workflow.",
AD_Window_ID="62b2e7ae-ae80-0120-50fa-d101e75827e6",SeqNo=80,TabLevel=2,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="0a776048-b2cd-3383-44a7-884c5cc2b83a",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Transition="0a776048-b2cd-3383-44a7-884c5cc2b83a";

@XendraTrl(Identifier="addef420-f6b4-22fb-eedb-4543059f5e41")
public static String es_PE_TABLE_AD_WF_NodeNext_Name="Nodo de Transición";

@XendraTable(Name="Node Transition",Description="Workflow Node Transition",Help="",
TableName="AD_WF_NodeNext",AccessLevel="6",AD_Window_ID="62b2e7ae-ae80-0120-50fa-d101e75827e6",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.workflow",
Identifier="addef420-f6b4-22fb-eedb-4543059f5e41",Synchronized="2017-08-16 11:41:11.0")
/** TableName=AD_WF_NodeNext */
public static final String Table_Name="AD_WF_NodeNext";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_WF_NodeNext");

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
    Table_ID = MTable.getTable_ID("AD_WF_NodeNext");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_WF_NodeNext[").append(get_ID()).append("]");
return sb.toString();
}

/** AD_WF_Next_ID AD_Reference=b83d1e02-d8f3-33c4-a60e-09af92bdcc12 */
public static final int AD_WF_NEXT_ID_AD_Reference_ID=109;
/** Set Next Node.
@param AD_WF_Next_ID Next Node in workflow */
public void setAD_WF_Next_ID (int AD_WF_Next_ID)
{
if (AD_WF_Next_ID < 1) throw new IllegalArgumentException ("AD_WF_Next_ID is mandatory.");
set_Value (COLUMNNAME_AD_WF_Next_ID, Integer.valueOf(AD_WF_Next_ID));
}
/** Get Next Node.
@return Next Node in workflow */
public int getAD_WF_Next_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_WF_Next_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c91b3b6d-5bec-9e15-af65-e9a9f89390d0")
public static String es_PE_FIELD_Transition_NextNode_Description="Siguiente nodo en el flujo de trabajo.";

@XendraTrl(Identifier="c91b3b6d-5bec-9e15-af65-e9a9f89390d0")
public static String es_PE_FIELD_Transition_NextNode_Help="El nodo siguiente indica el siguiente paso ó tarea en este flujo de trabajo.";

@XendraTrl(Identifier="c91b3b6d-5bec-9e15-af65-e9a9f89390d0")
public static String es_PE_FIELD_Transition_NextNode_Name="Nodo Siguiente";

@XendraField(AD_Column_ID="AD_WF_Next_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a776048-b2cd-3383-44a7-884c5cc2b83a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c91b3b6d-5bec-9e15-af65-e9a9f89390d0")
public static final String FIELDNAME_Transition_NextNode="c91b3b6d-5bec-9e15-af65-e9a9f89390d0";

@XendraTrl(Identifier="105a015b-281e-1b6f-906e-229faa40a2ac")
public static String es_PE_FIELD_PreviousNode_NextNode_Description="Siguiente nodo en el flujo de trabajo.";

@XendraTrl(Identifier="105a015b-281e-1b6f-906e-229faa40a2ac")
public static String es_PE_FIELD_PreviousNode_NextNode_Help="El nodo siguiente indica el siguiente paso ó tarea en este flujo de trabajo.";

@XendraTrl(Identifier="105a015b-281e-1b6f-906e-229faa40a2ac")
public static String es_PE_FIELD_PreviousNode_NextNode_Name="Nodo Siguiente";

@XendraField(AD_Column_ID="AD_WF_Next_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a77161b3-95b0-797c-a940-3117b8311275",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="105a015b-281e-1b6f-906e-229faa40a2ac")
public static final String FIELDNAME_PreviousNode_NextNode="105a015b-281e-1b6f-906e-229faa40a2ac";

@XendraTrl(Identifier="81ecb9f5-3a1b-78fa-1403-176ea414c991")
public static String es_PE_COLUMN_AD_WF_Next_ID_Name="Nodo Siguiente";

@XendraColumn(AD_Element_ID="1bf8d4e2-0be5-cba7-4aa3-b81c64184300",ColumnName="AD_WF_Next_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="b83d1e02-d8f3-33c4-a60e-09af92bdcc12",
AD_Val_Rule_ID="0c8cc5a9-f3a1-8403-a56a-f5a4c0ad047e",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=3,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="81ecb9f5-3a1b-78fa-1403-176ea414c991",
Synchronized="2017-08-05 16:53:01.0")
/** Column name AD_WF_Next_ID */
public static final String COLUMNNAME_AD_WF_Next_ID = "AD_WF_Next_ID";
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

@XendraTrl(Identifier="ac71c769-5ac8-5b32-3e9b-0b7d6c13354e")
public static String es_PE_FIELD_Transition_Node_Description="Nodo de flujo de trabajo; paso ó proceso";

@XendraTrl(Identifier="ac71c769-5ac8-5b32-3e9b-0b7d6c13354e")
public static String es_PE_FIELD_Transition_Node_Help="El nodo de flujo de trabajo indica un paso ó proceso único en este flujo de trabajo.";

@XendraTrl(Identifier="ac71c769-5ac8-5b32-3e9b-0b7d6c13354e")
public static String es_PE_FIELD_Transition_Node_Name="Nodo";

@XendraField(AD_Column_ID="AD_WF_Node_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a776048-b2cd-3383-44a7-884c5cc2b83a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ac71c769-5ac8-5b32-3e9b-0b7d6c13354e")
public static final String FIELDNAME_Transition_Node="ac71c769-5ac8-5b32-3e9b-0b7d6c13354e";

@XendraTrl(Identifier="22d8c1e1-321b-c350-6987-527945e05b15")
public static String es_PE_FIELD_PreviousNode_Node_Description="Nodo de flujo de trabajo; paso ó proceso";

@XendraTrl(Identifier="22d8c1e1-321b-c350-6987-527945e05b15")
public static String es_PE_FIELD_PreviousNode_Node_Help="El nodo de flujo de trabajo indica un paso ó proceso único en este flujo de trabajo.";

@XendraTrl(Identifier="22d8c1e1-321b-c350-6987-527945e05b15")
public static String es_PE_FIELD_PreviousNode_Node_Name="Nodo";

@XendraField(AD_Column_ID="AD_WF_Node_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a77161b3-95b0-797c-a940-3117b8311275",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="22d8c1e1-321b-c350-6987-527945e05b15")
public static final String FIELDNAME_PreviousNode_Node="22d8c1e1-321b-c350-6987-527945e05b15";

@XendraTrl(Identifier="9809b8e8-4c7e-7328-3ba3-953fabf53a15")
public static String es_PE_COLUMN_AD_WF_Node_ID_Name="Nodo";

@XendraColumn(AD_Element_ID="a21db5d2-692a-84ae-07db-7083b2eac74c",ColumnName="AD_WF_Node_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9809b8e8-4c7e-7328-3ba3-953fabf53a15",
Synchronized="2017-08-05 16:53:01.0")
/** Column name AD_WF_Node_ID */
public static final String COLUMNNAME_AD_WF_Node_ID = "AD_WF_Node_ID";
/** Set Node Transition.
@param AD_WF_NodeNext_ID Workflow Node Transition */
public void setAD_WF_NodeNext_ID (int AD_WF_NodeNext_ID)
{
if (AD_WF_NodeNext_ID < 1) throw new IllegalArgumentException ("AD_WF_NodeNext_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_WF_NodeNext_ID, Integer.valueOf(AD_WF_NodeNext_ID));
}
/** Get Node Transition.
@return Workflow Node Transition */
public int getAD_WF_NodeNext_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_WF_NodeNext_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f2d0bdbe-7e1b-37fc-e063-4ac2f5520010")
public static String es_PE_FIELD_Transition_NodeTransition_Description="Flujo de trabajo del nodo de transición.";

@XendraTrl(Identifier="f2d0bdbe-7e1b-37fc-e063-4ac2f5520010")
public static String es_PE_FIELD_Transition_NodeTransition_Help="La siguiente tabla de los nodos define la orden ó pasos de un flujo de trabajo.";

@XendraTrl(Identifier="f2d0bdbe-7e1b-37fc-e063-4ac2f5520010")
public static String es_PE_FIELD_Transition_NodeTransition_Name="Nodo de Transición";

@XendraField(AD_Column_ID="AD_WF_NodeNext_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a776048-b2cd-3383-44a7-884c5cc2b83a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f2d0bdbe-7e1b-37fc-e063-4ac2f5520010")
public static final String FIELDNAME_Transition_NodeTransition="f2d0bdbe-7e1b-37fc-e063-4ac2f5520010";

@XendraTrl(Identifier="5f922499-859a-0628-7cf1-5040f0c859ad")
public static String es_PE_FIELD_PreviousNode_NodeTransition_Description="Flujo de trabajo del nodo de transición.";

@XendraTrl(Identifier="5f922499-859a-0628-7cf1-5040f0c859ad")
public static String es_PE_FIELD_PreviousNode_NodeTransition_Help="La siguiente tabla de los nodos define la orden ó pasos de un flujo de trabajo.";

@XendraTrl(Identifier="5f922499-859a-0628-7cf1-5040f0c859ad")
public static String es_PE_FIELD_PreviousNode_NodeTransition_Name="Nodo de Transición";

@XendraField(AD_Column_ID="AD_WF_NodeNext_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a77161b3-95b0-797c-a940-3117b8311275",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5f922499-859a-0628-7cf1-5040f0c859ad")
public static final String FIELDNAME_PreviousNode_NodeTransition="5f922499-859a-0628-7cf1-5040f0c859ad";
/** Column name AD_WF_NodeNext_ID */
public static final String COLUMNNAME_AD_WF_NodeNext_ID = "AD_WF_NodeNext_ID";
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

@XendraTrl(Identifier="81650dee-2507-7e71-9f09-30f5e273c8bc")
public static String es_PE_FIELD_Transition_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="81650dee-2507-7e71-9f09-30f5e273c8bc")
public static String es_PE_FIELD_Transition_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="81650dee-2507-7e71-9f09-30f5e273c8bc")
public static String es_PE_FIELD_Transition_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="0a776048-b2cd-3383-44a7-884c5cc2b83a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="81650dee-2507-7e71-9f09-30f5e273c8bc")
public static final String FIELDNAME_Transition_Description="81650dee-2507-7e71-9f09-30f5e273c8bc";

@XendraTrl(Identifier="d759b84b-a5dc-ef77-c494-e9428b29d379")
public static String es_PE_FIELD_PreviousNode_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="d759b84b-a5dc-ef77-c494-e9428b29d379")
public static String es_PE_FIELD_PreviousNode_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="d759b84b-a5dc-ef77-c494-e9428b29d379")
public static String es_PE_FIELD_PreviousNode_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="a77161b3-95b0-797c-a940-3117b8311275",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d759b84b-a5dc-ef77-c494-e9428b29d379")
public static final String FIELDNAME_PreviousNode_Description="d759b84b-a5dc-ef77-c494-e9428b29d379";

@XendraTrl(Identifier="506cc3c6-5b8e-2948-0c95-0f9638ed7c49")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="506cc3c6-5b8e-2948-0c95-0f9638ed7c49",
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

@XendraTrl(Identifier="284d59e4-38ff-6ef2-6613-347117cc755c")
public static String es_PE_FIELD_Transition_EntityType_Description="Tipo de Entidad Diccionario; determina propiedad y sincronización";

@XendraTrl(Identifier="284d59e4-38ff-6ef2-6613-347117cc755c")
public static String es_PE_FIELD_Transition_EntityType_Help="Los tipos de entidad \"Diccionario\"; \"Adempiere\"; y \"Aplicación\" podrían ser automáticamente sincronizados y las personalizaciones eliminadas ó sobreescritas";

@XendraTrl(Identifier="284d59e4-38ff-6ef2-6613-347117cc755c")
public static String es_PE_FIELD_Transition_EntityType_Name="Tipo de Entidad";

@XendraField(AD_Column_ID="EntityType",IsCentrallyMaintained=true,
AD_Tab_ID="0a776048-b2cd-3383-44a7-884c5cc2b83a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="284d59e4-38ff-6ef2-6613-347117cc755c")
public static final String FIELDNAME_Transition_EntityType="284d59e4-38ff-6ef2-6613-347117cc755c";

@XendraTrl(Identifier="a4a23bad-713b-c30e-fac8-a2f26b7a7700")
public static String es_PE_FIELD_PreviousNode_EntityType_Description="Tipo de Entidad Diccionario; determina propiedad y sincronización";

@XendraTrl(Identifier="a4a23bad-713b-c30e-fac8-a2f26b7a7700")
public static String es_PE_FIELD_PreviousNode_EntityType_Help="Los tipos de entidad \"Diccionario\"; \"Adempiere\"; y \"Aplicación\" podrían ser automáticamente sincronizados y las personalizaciones eliminadas ó sobreescritas";

@XendraTrl(Identifier="a4a23bad-713b-c30e-fac8-a2f26b7a7700")
public static String es_PE_FIELD_PreviousNode_EntityType_Name="Tipo de Entidad";

@XendraField(AD_Column_ID="EntityType",IsCentrallyMaintained=true,
AD_Tab_ID="a77161b3-95b0-797c-a940-3117b8311275",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a4a23bad-713b-c30e-fac8-a2f26b7a7700")
public static final String FIELDNAME_PreviousNode_EntityType="a4a23bad-713b-c30e-fac8-a2f26b7a7700";

@XendraTrl(Identifier="872e98f6-a2ad-af9c-3f23-c4ae920d41ca")
public static String es_PE_COLUMN_EntityType_Name="Tipo de Entidad";

@XendraColumn(AD_Element_ID="5ba917bf-871c-6f19-aa50-962adc5de558",ColumnName="EntityType",
AD_Reference_ID=18,AD_Reference_Value_ID="fae4ad31-8ff1-5d5c-8d47-2426c541cd74",AD_Val_Rule_ID="",
FieldLength=4,DefaultValue="U",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="@EntityType@=D",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="872e98f6-a2ad-af9c-3f23-c4ae920d41ca",Synchronized="2017-08-05 16:53:01.0")
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
@XendraTrl(Identifier="4de7a58d-b932-4140-96d5-ae004e005c6f")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4de7a58d-b932-4140-96d5-ae004e005c6f",
Synchronized="2017-08-05 16:53:01.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Std User Workflow.
@param IsStdUserWorkflow Standard Manual User Approval Workflow */
public void setIsStdUserWorkflow (boolean IsStdUserWorkflow)
{
set_Value (COLUMNNAME_IsStdUserWorkflow, Boolean.valueOf(IsStdUserWorkflow));
}
/** Get Std User Workflow.
@return Standard Manual User Approval Workflow */
public boolean isStdUserWorkflow() 
{
Object oo = get_Value(COLUMNNAME_IsStdUserWorkflow);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="914bb38d-56d9-46d8-c206-f152ef319363")
public static String es_PE_FIELD_Transition_StdUserWorkflow_Description="Aprobación manual del usuario para flujo de trabajo";

@XendraTrl(Identifier="914bb38d-56d9-46d8-c206-f152ef319363")
public static String es_PE_FIELD_Transition_StdUserWorkflow_Help="Si están seleccionados, solamente los documentos con un estado abierto (bosquejado, en marcha, aprobado, rechazado, inválido) y las acciones estándares del usuario (prepárese, termine, apruebe, rechazo) se permiten continuar. Utilice esto para evitar el tener que definir los detalles en cómo los procesos automáticos (abra, invalide, fije, reactivaron) y cuando el documento es cerrado para la acción normal del usuario (terminado, el esperar, cerrado, anulado, invertido).";

@XendraTrl(Identifier="914bb38d-56d9-46d8-c206-f152ef319363")
public static String es_PE_FIELD_Transition_StdUserWorkflow_Name="Usuario Estandar Flujo de Trabajo";

@XendraField(AD_Column_ID="IsStdUserWorkflow",IsCentrallyMaintained=true,
AD_Tab_ID="0a776048-b2cd-3383-44a7-884c5cc2b83a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="914bb38d-56d9-46d8-c206-f152ef319363")
public static final String FIELDNAME_Transition_StdUserWorkflow="914bb38d-56d9-46d8-c206-f152ef319363";

@XendraTrl(Identifier="8fa9ccf1-421c-7ee0-99e0-c0660a5542c4")
public static String es_PE_FIELD_PreviousNode_StdUserWorkflow_Description="Aprobación manual del usuario para flujo de trabajo";

@XendraTrl(Identifier="8fa9ccf1-421c-7ee0-99e0-c0660a5542c4")
public static String es_PE_FIELD_PreviousNode_StdUserWorkflow_Help="Si están seleccionados, solamente los documentos con un estado abierto (bosquejado, en marcha, aprobado, rechazado, inválido) y las acciones estándares del usuario (prepárese, termine, apruebe, rechazo) se permiten continuar. Utilice esto para evitar el tener que definir los detalles en cómo los procesos automáticos (abra, invalide, fije, reactivaron) y cuando el documento es cerrado para la acción normal del usuario (terminado, el esperar, cerrado, anulado, invertido).";

@XendraTrl(Identifier="8fa9ccf1-421c-7ee0-99e0-c0660a5542c4")
public static String es_PE_FIELD_PreviousNode_StdUserWorkflow_Name="Usuario Estandar Flujo de Trabajo";

@XendraField(AD_Column_ID="IsStdUserWorkflow",IsCentrallyMaintained=true,
AD_Tab_ID="a77161b3-95b0-797c-a940-3117b8311275",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8fa9ccf1-421c-7ee0-99e0-c0660a5542c4")
public static final String FIELDNAME_PreviousNode_StdUserWorkflow="8fa9ccf1-421c-7ee0-99e0-c0660a5542c4";

@XendraTrl(Identifier="f26d2b04-1444-5e96-83fa-8475cd811b86")
public static String es_PE_COLUMN_IsStdUserWorkflow_Name="Usuario Estandar Flujo de Trabajo";

@XendraColumn(AD_Element_ID="720ef7e2-3787-08f3-9486-976dcba019e2",ColumnName="IsStdUserWorkflow",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f26d2b04-1444-5e96-83fa-8475cd811b86",
Synchronized="2017-08-05 16:53:01.0")
/** Column name IsStdUserWorkflow */
public static final String COLUMNNAME_IsStdUserWorkflow = "IsStdUserWorkflow";
/** Set Sequence.
@param SeqNo Method of ordering records: lowest number comes first */
public void setSeqNo (int SeqNo)
{
set_Value (COLUMNNAME_SeqNo, Integer.valueOf(SeqNo));
}
/** Get Sequence.
@return Method of ordering records: lowest number comes first */
public int getSeqNo() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_SeqNo);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0c5ae026-1e67-ff78-f6dd-87f14b1443c4")
public static String es_PE_FIELD_Transition_Sequence_Description="Método de ordenar registros; el número más bajo viene primero";

@XendraTrl(Identifier="0c5ae026-1e67-ff78-f6dd-87f14b1443c4")
public static String es_PE_FIELD_Transition_Sequence_Help="La Secuencia indica el orden de los registros";

@XendraTrl(Identifier="0c5ae026-1e67-ff78-f6dd-87f14b1443c4")
public static String es_PE_FIELD_Transition_Sequence_Name="Secuencia";

@XendraField(AD_Column_ID="SeqNo",IsCentrallyMaintained=true,
AD_Tab_ID="0a776048-b2cd-3383-44a7-884c5cc2b83a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=60,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0c5ae026-1e67-ff78-f6dd-87f14b1443c4")
public static final String FIELDNAME_Transition_Sequence="0c5ae026-1e67-ff78-f6dd-87f14b1443c4";

@XendraTrl(Identifier="25eb5f3a-978b-cb10-717a-5aa61adb7f1e")
public static String es_PE_FIELD_PreviousNode_Sequence_Description="Método de ordenar registros; el número más bajo viene primero";

@XendraTrl(Identifier="25eb5f3a-978b-cb10-717a-5aa61adb7f1e")
public static String es_PE_FIELD_PreviousNode_Sequence_Help="La Secuencia indica el orden de los registros";

@XendraTrl(Identifier="25eb5f3a-978b-cb10-717a-5aa61adb7f1e")
public static String es_PE_FIELD_PreviousNode_Sequence_Name="Secuencia";

@XendraField(AD_Column_ID="SeqNo",IsCentrallyMaintained=true,
AD_Tab_ID="a77161b3-95b0-797c-a940-3117b8311275",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="25eb5f3a-978b-cb10-717a-5aa61adb7f1e")
public static final String FIELDNAME_PreviousNode_Sequence="25eb5f3a-978b-cb10-717a-5aa61adb7f1e";

@XendraTrl(Identifier="57687881-b038-3664-6601-70b07dea74f1")
public static String es_PE_COLUMN_SeqNo_Name="Secuencia";

@XendraColumn(AD_Element_ID="38fa26fe-b59d-fce1-c129-420b57da738b",ColumnName="SeqNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="10",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="57687881-b038-3664-6601-70b07dea74f1",
Synchronized="2017-08-05 16:53:01.0")
/** Column name SeqNo */
public static final String COLUMNNAME_SeqNo = "SeqNo";
/** Set Transition Code.
@param TransitionCode Code resulting in TRUE of FALSE */
public void setTransitionCode (String TransitionCode)
{
set_Value (COLUMNNAME_TransitionCode, TransitionCode);
}
/** Get Transition Code.
@return Code resulting in TRUE of FALSE */
public String getTransitionCode() 
{
String value = (String)get_Value(COLUMNNAME_TransitionCode);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="599b86be-a964-e2a0-a837-6906c4c7786d")
public static String es_PE_FIELD_Transition_TransitionCode_Description="Código dando por resultado VERDADERO ó FALSO";

@XendraTrl(Identifier="599b86be-a964-e2a0-a837-6906c4c7786d")
public static String es_PE_FIELD_Transition_TransitionCode_Help="Se ejecuta la transacción, si el código da lugar a VERDADERO (ó es vacío)";

@XendraTrl(Identifier="599b86be-a964-e2a0-a837-6906c4c7786d")
public static String es_PE_FIELD_Transition_TransitionCode_Name="Código de Transacción";

@XendraField(AD_Column_ID="TransitionCode",IsCentrallyMaintained=true,
AD_Tab_ID="0a776048-b2cd-3383-44a7-884c5cc2b83a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=true,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="599b86be-a964-e2a0-a837-6906c4c7786d")
public static final String FIELDNAME_Transition_TransitionCode="599b86be-a964-e2a0-a837-6906c4c7786d";

@XendraTrl(Identifier="88f26bfb-e09a-e791-a6ef-060b804d44bf")
public static String es_PE_FIELD_PreviousNode_TransitionCode_Description="Código dando por resultado VERDADERO ó FALSO";

@XendraTrl(Identifier="88f26bfb-e09a-e791-a6ef-060b804d44bf")
public static String es_PE_FIELD_PreviousNode_TransitionCode_Help="Se ejecuta la transacción, si el código da lugar a VERDADERO (ó es vacío)";

@XendraTrl(Identifier="88f26bfb-e09a-e791-a6ef-060b804d44bf")
public static String es_PE_FIELD_PreviousNode_TransitionCode_Name="Código de Transacción";

@XendraField(AD_Column_ID="TransitionCode",IsCentrallyMaintained=true,
AD_Tab_ID="a77161b3-95b0-797c-a940-3117b8311275",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="88f26bfb-e09a-e791-a6ef-060b804d44bf")
public static final String FIELDNAME_PreviousNode_TransitionCode="88f26bfb-e09a-e791-a6ef-060b804d44bf";

@XendraTrl(Identifier="330c87e9-1efe-349b-24ee-08dffdfeaac2")
public static String es_PE_COLUMN_TransitionCode_Name="Código de Transacción";

@XendraColumn(AD_Element_ID="4a471385-39ea-f865-e49d-aca4ae64161e",ColumnName="TransitionCode",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="330c87e9-1efe-349b-24ee-08dffdfeaac2",
Synchronized="2017-08-05 16:53:01.0")
/** Column name TransitionCode */
public static final String COLUMNNAME_TransitionCode = "TransitionCode";
}
