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
/** Generated Model for AD_WF_NextCondition
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_WF_NextCondition extends PO
{
/** Standard Constructor
@param ctx context
@param AD_WF_NextCondition_ID id
@param trxName transaction
*/
public X_AD_WF_NextCondition (Properties ctx, int AD_WF_NextCondition_ID, String trxName)
{
super (ctx, AD_WF_NextCondition_ID, trxName);
/** if (AD_WF_NextCondition_ID == 0)
{
setAD_Column_ID (0);
setAD_WF_NextCondition_ID (0);
setAD_WF_NodeNext_ID (0);
setAndOr (null);	
// O
setEntityType (null);	
// U
setOperation (null);
setSeqNo (0);	
// @SQL=SELECT COALESCE(MAX(SeqNo),0)+10 AS DefaultValue FROM AD_WF_NextCondition WHERE AD_WF_NodeNext_ID=@AD_WF_NodeNext_ID@
setValue (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_WF_NextCondition (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=706 */
public static int Table_ID=MTable.getTable_ID("AD_WF_NextCondition");

@XendraTrl(Identifier="814077eb-5e37-c4df-3644-518682d037ff")
public static String es_PE_TAB_Condition_Description="Condición de la Transición del Nodo de Flujo de Trabajo";

@XendraTrl(Identifier="814077eb-5e37-c4df-3644-518682d037ff")
public static String es_PE_TAB_Condition_Help="Restricción opcional de la transición de un siguiente nodo";

@XendraTrl(Identifier="814077eb-5e37-c4df-3644-518682d037ff")
public static String es_PE_TAB_Condition_Name="Condición";
@XendraTab(Name="Condition",
Description="Workflow Node Transition Condition",
Help="Optional restriction of transition of one node to the next. The (string) value is converted to the datatype.  Booleans (Yes-No) are represented by 'true' and 'false', the date format is YYYY-mm-DD",
AD_Window_ID="62b2e7ae-ae80-0120-50fa-d101e75827e6",SeqNo=100,TabLevel=3,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="814077eb-5e37-c4df-3644-518682d037ff",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Condition="814077eb-5e37-c4df-3644-518682d037ff";

@XendraTrl(Identifier="678ea075-5f10-8256-6dbb-8476bb18c111")
public static String es_PE_TABLE_AD_WF_NextCondition_Name="Condición de Transición";

@XendraTable(Name="Transition Condition",AD_Package_ID="9df191d4-b8da-879a-276b-6e16b286e868",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",
Description="Workflow Node Transition Condition",Help="",TableName="AD_WF_NextCondition",
AccessLevel="6",AD_Window_ID="62b2e7ae-ae80-0120-50fa-d101e75827e6",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.workflow",
Identifier="678ea075-5f10-8256-6dbb-8476bb18c111",Synchronized="2020-03-03 21:36:08.0")
/** TableName=AD_WF_NextCondition */
public static final String Table_Name="AD_WF_NextCondition";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_WF_NextCondition");

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
    Table_ID = MTable.getTable_ID("AD_WF_NextCondition");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_WF_NextCondition[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Column.
@param AD_Column_ID Column in the table */
public void setAD_Column_ID (int AD_Column_ID)
{
if (AD_Column_ID < 1) throw new IllegalArgumentException ("AD_Column_ID is mandatory.");
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

@XendraTrl(Identifier="6a18278f-b2a3-8bbe-79c3-bfae51261301")
public static String es_PE_FIELD_Condition_Column_Name="Columna";

@XendraTrl(Identifier="6a18278f-b2a3-8bbe-79c3-bfae51261301")
public static String es_PE_FIELD_Condition_Column_Description="Columna en la tabla";

@XendraTrl(Identifier="6a18278f-b2a3-8bbe-79c3-bfae51261301")
public static String es_PE_FIELD_Condition_Column_Help="Enlace a la columna base de datos de la tabla";

@XendraField(AD_Column_ID="AD_Column_ID",IsCentrallyMaintained=true,
AD_Tab_ID="814077eb-5e37-c4df-3644-518682d037ff",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6a18278f-b2a3-8bbe-79c3-bfae51261301")
public static final String FIELDNAME_Condition_Column="6a18278f-b2a3-8bbe-79c3-bfae51261301";

@XendraTrl(Identifier="d15d967a-d797-fa34-6605-1b93aea259b9")
public static String es_PE_COLUMN_AD_Column_ID_Name="Columna";

@XendraColumn(AD_Element_ID="a0dcf1ba-2ef3-ca06-ed42-8ae37c632eaf",ColumnName="AD_Column_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="084db087-1100-ad15-806b-d1b94a96650c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d15d967a-d797-fa34-6605-1b93aea259b9",Synchronized="2019-08-30 22:20:50.0")
/** Column name AD_Column_ID */
public static final String COLUMNNAME_AD_Column_ID = "AD_Column_ID";
/** Set Transition Condition.
@param AD_WF_NextCondition_ID Workflow Node Transition Condition */
public void setAD_WF_NextCondition_ID (int AD_WF_NextCondition_ID)
{
if (AD_WF_NextCondition_ID < 1) throw new IllegalArgumentException ("AD_WF_NextCondition_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_WF_NextCondition_ID, Integer.valueOf(AD_WF_NextCondition_ID));
}
/** Get Transition Condition.
@return Workflow Node Transition Condition */
public int getAD_WF_NextCondition_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_WF_NextCondition_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="48d0645c-ad22-87e0-4aa0-fbace11fb397")
public static String es_PE_FIELD_Condition_TransitionCondition_Name="Condición de Transición";

@XendraTrl(Identifier="48d0645c-ad22-87e0-4aa0-fbace11fb397")
public static String es_PE_FIELD_Condition_TransitionCondition_Description="Condición de la transición del nodo de flujo del trabajo";

@XendraField(AD_Column_ID="AD_WF_NextCondition_ID",IsCentrallyMaintained=true,
AD_Tab_ID="814077eb-5e37-c4df-3644-518682d037ff",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="48d0645c-ad22-87e0-4aa0-fbace11fb397")
public static final String FIELDNAME_Condition_TransitionCondition="48d0645c-ad22-87e0-4aa0-fbace11fb397";
/** Column name AD_WF_NextCondition_ID */
public static final String COLUMNNAME_AD_WF_NextCondition_ID = "AD_WF_NextCondition_ID";
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

@XendraTrl(Identifier="c2924b3d-94ff-bd4d-be06-eeb47910b8e5")
public static String es_PE_FIELD_Condition_NodeTransition_Name="Nodo de Transición";

@XendraTrl(Identifier="c2924b3d-94ff-bd4d-be06-eeb47910b8e5")
public static String es_PE_FIELD_Condition_NodeTransition_Description="Flujo de trabajo del nodo de transición.";

@XendraTrl(Identifier="c2924b3d-94ff-bd4d-be06-eeb47910b8e5")
public static String es_PE_FIELD_Condition_NodeTransition_Help="La siguiente tabla de los nodos define la orden ó pasos de un flujo de trabajo.";

@XendraField(AD_Column_ID="AD_WF_NodeNext_ID",IsCentrallyMaintained=true,
AD_Tab_ID="814077eb-5e37-c4df-3644-518682d037ff",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c2924b3d-94ff-bd4d-be06-eeb47910b8e5")
public static final String FIELDNAME_Condition_NodeTransition="c2924b3d-94ff-bd4d-be06-eeb47910b8e5";

@XendraTrl(Identifier="6c8f22ef-a330-2cc1-2638-9540f223915c")
public static String es_PE_COLUMN_AD_WF_NodeNext_ID_Name="Nodo de Transición";

@XendraColumn(AD_Element_ID="7d2bb625-8275-d242-b8cf-416601a6f8c6",ColumnName="AD_WF_NodeNext_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6c8f22ef-a330-2cc1-2638-9540f223915c",
Synchronized="2019-08-30 22:20:50.0")
/** Column name AD_WF_NodeNext_ID */
public static final String COLUMNNAME_AD_WF_NodeNext_ID = "AD_WF_NodeNext_ID";
/** Set And/Or.
@param AndOr Logical operation: AND or OR */
public void setAndOr (String AndOr)
{
if (AndOr.length() > 1)
{
log.warning("Length > 1 - truncated");
AndOr = AndOr.substring(0,0);
}
set_Value (COLUMNNAME_AndOr, AndOr);
}
/** Get And/Or.
@return Logical operation: AND or OR */
public String getAndOr() 
{
return (String)get_Value(COLUMNNAME_AndOr);
}

@XendraTrl(Identifier="8e0c805c-460d-0280-ae1c-f1ecc83e475f")
public static String es_PE_FIELD_Condition_AndOr_Name="Y/O";

@XendraTrl(Identifier="8e0c805c-460d-0280-ae1c-f1ecc83e475f")
public static String es_PE_FIELD_Condition_AndOr_Description="Operador lógico; Y u O";

@XendraField(AD_Column_ID="AndOr",IsCentrallyMaintained=true,
AD_Tab_ID="814077eb-5e37-c4df-3644-518682d037ff",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8e0c805c-460d-0280-ae1c-f1ecc83e475f")
public static final String FIELDNAME_Condition_AndOr="8e0c805c-460d-0280-ae1c-f1ecc83e475f";

@XendraTrl(Identifier="647f1a75-5727-2d62-04a3-d95f0b2a8a9d")
public static String es_PE_COLUMN_AndOr_Name="Y/O";

@XendraColumn(AD_Element_ID="6e7241dc-23d7-c637-c3e8-8446f4c7bd97",ColumnName="AndOr",
AD_Reference_ID=17,AD_Reference_Value_ID="115d4f2d-61de-0b53-83b8-d9a24fa54f5b",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="O",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="647f1a75-5727-2d62-04a3-d95f0b2a8a9d",Synchronized="2019-08-30 22:20:50.0")
/** Column name AndOr */
public static final String COLUMNNAME_AndOr = "AndOr";
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

@XendraTrl(Identifier="6d4f1ab2-a93e-fe6b-c0e2-23b990135279")
public static String es_PE_FIELD_Condition_EntityType_Name="Tipo de Entidad";

@XendraTrl(Identifier="6d4f1ab2-a93e-fe6b-c0e2-23b990135279")
public static String es_PE_FIELD_Condition_EntityType_Description="Tipo de Entidad Diccionario; determina propiedad y sincronización";

@XendraTrl(Identifier="6d4f1ab2-a93e-fe6b-c0e2-23b990135279")
public static String es_PE_FIELD_Condition_EntityType_Help="Los tipos de entidad \"Diccionario\"; \"Adempiere\"; y \"Aplicación\" podrían ser automáticamente sincronizados y las personalizaciones eliminadas ó sobreescritas";

@XendraField(AD_Column_ID="EntityType",IsCentrallyMaintained=true,
AD_Tab_ID="814077eb-5e37-c4df-3644-518682d037ff",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6d4f1ab2-a93e-fe6b-c0e2-23b990135279")
public static final String FIELDNAME_Condition_EntityType="6d4f1ab2-a93e-fe6b-c0e2-23b990135279";

@XendraTrl(Identifier="ebf370d1-7db6-0273-7b96-e4dcfe2bde37")
public static String es_PE_COLUMN_EntityType_Name="Tipo de Entidad";

@XendraColumn(AD_Element_ID="5ba917bf-871c-6f19-aa50-962adc5de558",ColumnName="EntityType",
AD_Reference_ID=18,AD_Reference_Value_ID="fae4ad31-8ff1-5d5c-8d47-2426c541cd74",AD_Val_Rule_ID="",
FieldLength=4,DefaultValue="U",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="@EntityType@=D",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="ebf370d1-7db6-0273-7b96-e4dcfe2bde37",Synchronized="2019-08-30 22:20:51.0")
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
@XendraTrl(Identifier="42b82697-7184-40a9-95a0-a977efb30e16")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="42b82697-7184-40a9-95a0-a977efb30e16",
Synchronized="2019-08-30 22:20:51.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Operation.
@param Operation Compare Operation */
public void setOperation (String Operation)
{
if (Operation.length() > 2)
{
log.warning("Length > 2 - truncated");
Operation = Operation.substring(0,1);
}
set_Value (COLUMNNAME_Operation, Operation);
}
/** Get Operation.
@return Compare Operation */
public String getOperation() 
{
return (String)get_Value(COLUMNNAME_Operation);
}

@XendraTrl(Identifier="30422a71-5c34-eb45-e73e-37eee0c060db")
public static String es_PE_FIELD_Condition_Operation_Name="Operación";

@XendraField(AD_Column_ID="Operation",IsCentrallyMaintained=true,
AD_Tab_ID="814077eb-5e37-c4df-3644-518682d037ff",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="30422a71-5c34-eb45-e73e-37eee0c060db")
public static final String FIELDNAME_Condition_Operation="30422a71-5c34-eb45-e73e-37eee0c060db";

@XendraTrl(Identifier="f27d577e-373f-1991-7233-51e24c92b9e3")
public static String es_PE_COLUMN_Operation_Name="Operación";

@XendraColumn(AD_Element_ID="eccf7e9c-dbd0-9679-8ba1-9f36fc3afea7",ColumnName="Operation",
AD_Reference_ID=17,AD_Reference_Value_ID="68e96930-8512-7806-25cd-2cce2a5d79e9",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="f27d577e-373f-1991-7233-51e24c92b9e3",Synchronized="2019-08-30 22:20:51.0")
/** Column name Operation */
public static final String COLUMNNAME_Operation = "Operation";
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

@XendraTrl(Identifier="f636dfe0-58d9-08cb-ef06-e8df71e6d4ab")
public static String es_PE_FIELD_Condition_Sequence_Name="Secuencia";

@XendraTrl(Identifier="f636dfe0-58d9-08cb-ef06-e8df71e6d4ab")
public static String es_PE_FIELD_Condition_Sequence_Description="Método de ordenar registros; el número más bajo viene primero";

@XendraTrl(Identifier="f636dfe0-58d9-08cb-ef06-e8df71e6d4ab")
public static String es_PE_FIELD_Condition_Sequence_Help="La Secuencia indica el orden de los registros";

@XendraField(AD_Column_ID="SeqNo",IsCentrallyMaintained=true,
AD_Tab_ID="814077eb-5e37-c4df-3644-518682d037ff",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=50,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f636dfe0-58d9-08cb-ef06-e8df71e6d4ab")
public static final String FIELDNAME_Condition_Sequence="f636dfe0-58d9-08cb-ef06-e8df71e6d4ab";

@XendraTrl(Identifier="9bfdc707-da9f-2f2f-9823-c05715e7592f")
public static String es_PE_COLUMN_SeqNo_Name="Secuencia";

@XendraColumn(AD_Element_ID="38fa26fe-b59d-fce1-c129-420b57da738b",ColumnName="SeqNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@SQL=SELECT COALESCE(MAX(SeqNo),0)+10 AS DefaultValue FROM AD_WF_NextCondition WHERE AD_WF_NodeNext_ID=@AD_WF_NodeNext_ID@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9bfdc707-da9f-2f2f-9823-c05715e7592f",
Synchronized="2019-08-30 22:20:51.0")
/** Column name SeqNo */
public static final String COLUMNNAME_SeqNo = "SeqNo";
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

@XendraTrl(Identifier="f9d72352-fece-e0c6-dec2-d2cb5f7a582d")
public static String es_PE_FIELD_Condition_Value_Name="Valor";

@XendraTrl(Identifier="f9d72352-fece-e0c6-dec2-d2cb5f7a582d")
public static String es_PE_FIELD_Condition_Value_Description="Condition Value";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=false,
AD_Tab_ID="814077eb-5e37-c4df-3644-518682d037ff",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f9d72352-fece-e0c6-dec2-d2cb5f7a582d")
public static final String FIELDNAME_Condition_Value="f9d72352-fece-e0c6-dec2-d2cb5f7a582d";

@XendraTrl(Identifier="9dc8b95e-dea1-46bb-d5c6-2c6ad15b2f7a")
public static String es_PE_COLUMN_Value_Name="Clave de Búsqueda";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9dc8b95e-dea1-46bb-d5c6-2c6ad15b2f7a",
Synchronized="2019-08-30 22:20:51.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
/** Set Value To.
@param Value2 Value To */
public void setValue2 (String Value2)
{
if (Value2 != null && Value2.length() > 40)
{
log.warning("Length > 40 - truncated");
Value2 = Value2.substring(0,39);
}
set_Value (COLUMNNAME_Value2, Value2);
}
/** Get Value To.
@return Value To */
public String getValue2() 
{
String value = (String)get_Value(COLUMNNAME_Value2);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="992ec2c1-4c12-d2c8-1d86-cf198d9a3f06")
public static String es_PE_FIELD_Condition_ValueTo_Name="Valor 2";

@XendraField(AD_Column_ID="Value2",IsCentrallyMaintained=true,
AD_Tab_ID="814077eb-5e37-c4df-3644-518682d037ff",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Operation@=AB",DisplayLength=20,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="992ec2c1-4c12-d2c8-1d86-cf198d9a3f06")
public static final String FIELDNAME_Condition_ValueTo="992ec2c1-4c12-d2c8-1d86-cf198d9a3f06";

@XendraTrl(Identifier="80ec7de0-4942-97ec-972f-04e7dbf790c0")
public static String es_PE_COLUMN_Value2_Name="Valor 2";

@XendraColumn(AD_Element_ID="c379d4ac-5a2f-a060-da28-03c993b2743e",ColumnName="Value2",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="80ec7de0-4942-97ec-972f-04e7dbf790c0",
Synchronized="2019-08-30 22:20:51.0")
/** Column name Value2 */
public static final String COLUMNNAME_Value2 = "Value2";
}
