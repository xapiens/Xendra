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
/** Generated Model for AD_WorkbenchWindow
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_WorkbenchWindow extends PO
{
/** Standard Constructor
@param ctx context
@param AD_WorkbenchWindow_ID id
@param trxName transaction
*/
public X_AD_WorkbenchWindow (Properties ctx, int AD_WorkbenchWindow_ID, String trxName)
{
super (ctx, AD_WorkbenchWindow_ID, trxName);
/** if (AD_WorkbenchWindow_ID == 0)
{
setAD_Workbench_ID (0);
setAD_WorkbenchWindow_ID (0);
setEntityType (null);	
// U
setIsPrimary (false);	
// N
setSeqNo (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_WorkbenchWindow (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=469 */
public static int Table_ID=MTable.getTable_ID("AD_WorkbenchWindow");

@XendraTrl(Identifier="d239e388-2afa-b169-0cd8-ec38c6607580")
public static String es_PE_TAB_Window_Description="Ventana del banco de trabajo";

@XendraTrl(Identifier="d239e388-2afa-b169-0cd8-ec38c6607580")
public static String es_PE_TAB_Window_Name="Ventana";
@XendraTab(Name="Window",
Description="Workbench Window",Help="",AD_Window_ID="1dcff49a-d577-7b76-550b-57511d7e5935",
SeqNo=30,TabLevel=1,IsSingleRow=false,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="",HasTree=false,WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="d239e388-2afa-b169-0cd8-ec38c6607580",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Window="d239e388-2afa-b169-0cd8-ec38c6607580";

@XendraTrl(Identifier="80a7b565-cb1c-8f02-0816-780781c757e2")
public static String es_PE_TABLE_AD_WorkbenchWindow_Name="Banco de Trabajo de la Ventana";


@XendraTable(Name="Workbench Window",Description="",Help="",TableName="AD_WorkbenchWindow",
AccessLevel="4",AD_Window_ID="1dcff49a-d577-7b76-550b-57511d7e5935",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="80a7b565-cb1c-8f02-0816-780781c757e2",Synchronized="2017-08-16 11:41:13.0")
/** TableName=AD_WorkbenchWindow */
public static final String Table_Name="AD_WorkbenchWindow";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_WorkbenchWindow");

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
    Table_ID = MTable.getTable_ID("AD_WorkbenchWindow");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_WorkbenchWindow[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Special Form.
@param AD_Form_ID Special Form */
public void setAD_Form_ID (int AD_Form_ID)
{
if (AD_Form_ID <= 0) set_Value (COLUMNNAME_AD_Form_ID, null);
 else 
set_Value (COLUMNNAME_AD_Form_ID, Integer.valueOf(AD_Form_ID));
}
/** Get Special Form.
@return Special Form */
public int getAD_Form_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Form_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c43f8a6a-b0b0-a2b3-e2e4-8239e05804bd")
public static String es_PE_FIELD_Window_SpecialForm_Description="Forma especial";

@XendraTrl(Identifier="c43f8a6a-b0b0-a2b3-e2e4-8239e05804bd")
public static String es_PE_FIELD_Window_SpecialForm_Help="El campo forma especial identifica una forma especial única en el sistema.";

@XendraTrl(Identifier="c43f8a6a-b0b0-a2b3-e2e4-8239e05804bd")
public static String es_PE_FIELD_Window_SpecialForm_Name="Forma Especial";

@XendraField(AD_Column_ID="AD_Form_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d239e388-2afa-b169-0cd8-ec38c6607580",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c43f8a6a-b0b0-a2b3-e2e4-8239e05804bd")
public static final String FIELDNAME_Window_SpecialForm="c43f8a6a-b0b0-a2b3-e2e4-8239e05804bd";

@XendraTrl(Identifier="b53eac99-9b0d-aa09-802d-d16ccc335701")
public static String es_PE_COLUMN_AD_Form_ID_Name="Forma Especial";

@XendraColumn(AD_Element_ID="6e3fcf05-8a76-e0af-25a6-7a4ab20551f4",ColumnName="AD_Form_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b53eac99-9b0d-aa09-802d-d16ccc335701",
Synchronized="2017-08-05 16:53:03.0")
/** Column name AD_Form_ID */
public static final String COLUMNNAME_AD_Form_ID = "AD_Form_ID";
/** Set Process.
@param AD_Process_ID Process or Report */
public void setAD_Process_ID (int AD_Process_ID)
{
if (AD_Process_ID <= 0) set_Value (COLUMNNAME_AD_Process_ID, null);
 else 
set_Value (COLUMNNAME_AD_Process_ID, Integer.valueOf(AD_Process_ID));
}
/** Get Process.
@return Process or Report */
public int getAD_Process_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Process_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="605e338d-2da9-dcd4-40d6-40100d55de3e")
public static String es_PE_FIELD_Window_Process_Description="Proceso ó Informe";

@XendraTrl(Identifier="605e338d-2da9-dcd4-40d6-40100d55de3e")
public static String es_PE_FIELD_Window_Process_Help="El campo proceso identifica un proceso ó Informe único en el sistema.";

@XendraTrl(Identifier="605e338d-2da9-dcd4-40d6-40100d55de3e")
public static String es_PE_FIELD_Window_Process_Name="Proceso";

@XendraField(AD_Column_ID="AD_Process_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d239e388-2afa-b169-0cd8-ec38c6607580",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="605e338d-2da9-dcd4-40d6-40100d55de3e")
public static final String FIELDNAME_Window_Process="605e338d-2da9-dcd4-40d6-40100d55de3e";

@XendraTrl(Identifier="60a0e942-021d-e92a-83d6-62fb1784c26c")
public static String es_PE_COLUMN_AD_Process_ID_Name="Proceso";

@XendraColumn(AD_Element_ID="60982cc9-e937-d374-4608-1c3f64b16d3b",ColumnName="AD_Process_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="60a0e942-021d-e92a-83d6-62fb1784c26c",
Synchronized="2017-08-05 16:53:03.0")
/** Column name AD_Process_ID */
public static final String COLUMNNAME_AD_Process_ID = "AD_Process_ID";
/** Set OS Task.
@param AD_Task_ID Operation System Task */
public void setAD_Task_ID (int AD_Task_ID)
{
if (AD_Task_ID <= 0) set_Value (COLUMNNAME_AD_Task_ID, null);
 else 
set_Value (COLUMNNAME_AD_Task_ID, Integer.valueOf(AD_Task_ID));
}
/** Get OS Task.
@return Operation System Task */
public int getAD_Task_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Task_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b7a8bf63-9c74-d97a-cdcd-006b1f51eee7")
public static String es_PE_FIELD_Window_OSTask_Description="Identificador de la tarea";

@XendraTrl(Identifier="b7a8bf63-9c74-d97a-cdcd-006b1f51eee7")
public static String es_PE_FIELD_Window_OSTask_Help="El campo tarea indica una tarea única en el sistema";

@XendraTrl(Identifier="b7a8bf63-9c74-d97a-cdcd-006b1f51eee7")
public static String es_PE_FIELD_Window_OSTask_Name="Tarea";
@XendraField(AD_Column_ID="AD_Task_ID",
IsCentrallyMaintained=true,AD_Tab_ID="d239e388-2afa-b169-0cd8-ec38c6607580",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="b7a8bf63-9c74-d97a-cdcd-006b1f51eee7")
public static final String FIELDNAME_Window_OSTask="b7a8bf63-9c74-d97a-cdcd-006b1f51eee7";

@XendraTrl(Identifier="08211750-06c1-c8fa-1ac2-ef135ba8150d")
public static String es_PE_COLUMN_AD_Task_ID_Name="Tarea";

@XendraColumn(AD_Element_ID="b760b68d-e9b1-5100-eab2-b34b6c0a1e20",ColumnName="AD_Task_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="08211750-06c1-c8fa-1ac2-ef135ba8150d",
Synchronized="2017-08-05 16:53:03.0")
/** Column name AD_Task_ID */
public static final String COLUMNNAME_AD_Task_ID = "AD_Task_ID";
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

@XendraTrl(Identifier="878d9fcb-a135-b7dc-3c84-eb092adeaa38")
public static String es_PE_FIELD_Window_Window_Description="Ventana de entrada de datos ó despliegue";

@XendraTrl(Identifier="878d9fcb-a135-b7dc-3c84-eb092adeaa38")
public static String es_PE_FIELD_Window_Window_Help="El campo ventana identifica una ventana única en el sistema";

@XendraTrl(Identifier="878d9fcb-a135-b7dc-3c84-eb092adeaa38")
public static String es_PE_FIELD_Window_Window_Name="Ventana";

@XendraField(AD_Column_ID="AD_Window_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d239e388-2afa-b169-0cd8-ec38c6607580",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="878d9fcb-a135-b7dc-3c84-eb092adeaa38")
public static final String FIELDNAME_Window_Window="878d9fcb-a135-b7dc-3c84-eb092adeaa38";

@XendraTrl(Identifier="f08ff09e-56eb-b181-f7c1-585f811ad414")
public static String es_PE_COLUMN_AD_Window_ID_Name="Ventana";

@XendraColumn(AD_Element_ID="0c50cb0e-febe-8650-2621-11ba77688276",ColumnName="AD_Window_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f08ff09e-56eb-b181-f7c1-585f811ad414",
Synchronized="2017-08-05 16:53:03.0")
/** Column name AD_Window_ID */
public static final String COLUMNNAME_AD_Window_ID = "AD_Window_ID";
/** Set Workbench.
@param AD_Workbench_ID Collection of windows, reports */
public void setAD_Workbench_ID (int AD_Workbench_ID)
{
if (AD_Workbench_ID < 1) throw new IllegalArgumentException ("AD_Workbench_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Workbench_ID, Integer.valueOf(AD_Workbench_ID));
}
/** Get Workbench.
@return Collection of windows, reports */
public int getAD_Workbench_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Workbench_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8bf384bb-cb55-fc36-2004-f79e9e140195")
public static String es_PE_FIELD_Window_Workbench_Description="Colección de ventanas; Informes";

@XendraTrl(Identifier="8bf384bb-cb55-fc36-2004-f79e9e140195")
public static String es_PE_FIELD_Window_Workbench_Name="Banco de Trabajo";

@XendraField(AD_Column_ID="AD_Workbench_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d239e388-2afa-b169-0cd8-ec38c6607580",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8bf384bb-cb55-fc36-2004-f79e9e140195")
public static final String FIELDNAME_Window_Workbench="8bf384bb-cb55-fc36-2004-f79e9e140195";

@XendraTrl(Identifier="f1e3f052-5948-c6fa-94c5-6cd1e58b4eee")
public static String es_PE_COLUMN_AD_Workbench_ID_Name="Banco de Trabajo";

@XendraColumn(AD_Element_ID="0180b8d1-3c69-6355-84ad-0f02bb7058a2",ColumnName="AD_Workbench_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f1e3f052-5948-c6fa-94c5-6cd1e58b4eee",
Synchronized="2017-08-05 16:53:03.0")
/** Column name AD_Workbench_ID */
public static final String COLUMNNAME_AD_Workbench_ID = "AD_Workbench_ID";
/** Set Workbench Window.
@param AD_WorkbenchWindow_ID Workbench Window */
public void setAD_WorkbenchWindow_ID (int AD_WorkbenchWindow_ID)
{
if (AD_WorkbenchWindow_ID < 1) throw new IllegalArgumentException ("AD_WorkbenchWindow_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_WorkbenchWindow_ID, Integer.valueOf(AD_WorkbenchWindow_ID));
}
/** Get Workbench Window.
@return Workbench Window */
public int getAD_WorkbenchWindow_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_WorkbenchWindow_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getAD_WorkbenchWindow_ID()));
}

@XendraTrl(Identifier="0b4797f7-bded-031a-81a7-8dbf329f1430")
public static String es_PE_FIELD_Window_WorkbenchWindow_Name="Banco de Trabajo de la Ventana";

@XendraField(AD_Column_ID="AD_WorkbenchWindow_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d239e388-2afa-b169-0cd8-ec38c6607580",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0b4797f7-bded-031a-81a7-8dbf329f1430")
public static final String FIELDNAME_Window_WorkbenchWindow="0b4797f7-bded-031a-81a7-8dbf329f1430";
/** Column name AD_WorkbenchWindow_ID */
public static final String COLUMNNAME_AD_WorkbenchWindow_ID = "AD_WorkbenchWindow_ID";

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

@XendraTrl(Identifier="b66a980b-d55e-e9fe-1daf-62f7b4abafa4")
public static String es_PE_FIELD_Window_EntityType_Description="Tipo de Entidad Diccionario; determina propiedad y sincronización";

@XendraTrl(Identifier="b66a980b-d55e-e9fe-1daf-62f7b4abafa4")
public static String es_PE_FIELD_Window_EntityType_Help="Los tipos de entidad \"Diccionario\"; \"Adempiere\"; y \"Aplicación\" podrían ser automáticamente sincronizados y las personalizaciones eliminadas ó sobreescritas";

@XendraTrl(Identifier="b66a980b-d55e-e9fe-1daf-62f7b4abafa4")
public static String es_PE_FIELD_Window_EntityType_Name="Tipo de Entidad";

@XendraField(AD_Column_ID="EntityType",IsCentrallyMaintained=true,
AD_Tab_ID="d239e388-2afa-b169-0cd8-ec38c6607580",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b66a980b-d55e-e9fe-1daf-62f7b4abafa4")
public static final String FIELDNAME_Window_EntityType="b66a980b-d55e-e9fe-1daf-62f7b4abafa4";

@XendraTrl(Identifier="16653071-5665-9ce6-6cdf-1bd761926d8e")
public static String es_PE_COLUMN_EntityType_Name="Tipo de Entidad";

@XendraColumn(AD_Element_ID="5ba917bf-871c-6f19-aa50-962adc5de558",ColumnName="EntityType",
AD_Reference_ID=18,AD_Reference_Value_ID="fae4ad31-8ff1-5d5c-8d47-2426c541cd74",AD_Val_Rule_ID="",
FieldLength=4,DefaultValue="U",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="@EntityType@=D",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="16653071-5665-9ce6-6cdf-1bd761926d8e",Synchronized="2017-08-05 16:53:03.0")
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
@XendraTrl(Identifier="2fce7545-b545-46c1-a755-110ac42c9684")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2fce7545-b545-46c1-a755-110ac42c9684",
Synchronized="2017-08-05 16:53:03.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Primary.
@param IsPrimary Indicates if this is the primary budget */
public void setIsPrimary (boolean IsPrimary)
{
set_Value (COLUMNNAME_IsPrimary, Boolean.valueOf(IsPrimary));
}
/** Get Primary.
@return Indicates if this is the primary budget */
public boolean isPrimary() 
{
Object oo = get_Value(COLUMNNAME_IsPrimary);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="c4b540cf-2719-d87b-c89e-db4c179e4986")
public static String es_PE_FIELD_Window_Primary_Description="Indica si este es el presupuesto primario";

@XendraTrl(Identifier="c4b540cf-2719-d87b-c89e-db4c179e4986")
public static String es_PE_FIELD_Window_Primary_Help="El cuadro de verificación primaria indica si este presupuesto es el presupuesto primario";

@XendraTrl(Identifier="c4b540cf-2719-d87b-c89e-db4c179e4986")
public static String es_PE_FIELD_Window_Primary_Name="Primario";

@XendraField(AD_Column_ID="IsPrimary",IsCentrallyMaintained=true,
AD_Tab_ID="d239e388-2afa-b169-0cd8-ec38c6607580",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c4b540cf-2719-d87b-c89e-db4c179e4986")
public static final String FIELDNAME_Window_Primary="c4b540cf-2719-d87b-c89e-db4c179e4986";

@XendraTrl(Identifier="33ada690-cca3-8127-3559-de908e734f1a")
public static String es_PE_COLUMN_IsPrimary_Name="Primario";

@XendraColumn(AD_Element_ID="76eb1170-b0ae-1b50-319d-253b20c560d2",ColumnName="IsPrimary",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="33ada690-cca3-8127-3559-de908e734f1a",
Synchronized="2017-08-05 16:53:03.0")
/** Column name IsPrimary */
public static final String COLUMNNAME_IsPrimary = "IsPrimary";
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

@XendraTrl(Identifier="4bbf749e-53f9-a818-7fff-b93e75f35709")
public static String es_PE_FIELD_Window_Sequence_Description="Método de ordenar registros; el número más bajo viene primero";

@XendraTrl(Identifier="4bbf749e-53f9-a818-7fff-b93e75f35709")
public static String es_PE_FIELD_Window_Sequence_Help="La Secuencia indica el orden de los registros";

@XendraTrl(Identifier="4bbf749e-53f9-a818-7fff-b93e75f35709")
public static String es_PE_FIELD_Window_Sequence_Name="Secuencia";

@XendraField(AD_Column_ID="SeqNo",IsCentrallyMaintained=true,
AD_Tab_ID="d239e388-2afa-b169-0cd8-ec38c6607580",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=50,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4bbf749e-53f9-a818-7fff-b93e75f35709")
public static final String FIELDNAME_Window_Sequence="4bbf749e-53f9-a818-7fff-b93e75f35709";

@XendraTrl(Identifier="b8081972-966b-f04f-54d8-963e5618f465")
public static String es_PE_COLUMN_SeqNo_Name="Secuencia";

@XendraColumn(AD_Element_ID="38fa26fe-b59d-fce1-c129-420b57da738b",ColumnName="SeqNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b8081972-966b-f04f-54d8-963e5618f465",
Synchronized="2017-08-05 16:53:03.0")
/** Column name SeqNo */
public static final String COLUMNNAME_SeqNo = "SeqNo";
}
