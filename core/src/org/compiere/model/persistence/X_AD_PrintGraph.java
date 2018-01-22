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
import org.compiere.model.reference.REF_AD_PrintGraphType;
/** Generated Model for AD_PrintGraph
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_PrintGraph extends PO
{
/** Standard Constructor
@param ctx context
@param AD_PrintGraph_ID id
@param trxName transaction
*/
public X_AD_PrintGraph (Properties ctx, int AD_PrintGraph_ID, String trxName)
{
super (ctx, AD_PrintGraph_ID, trxName);
/** if (AD_PrintGraph_ID == 0)
{
setAD_PrintFormat_ID (0);	
// 0
setAD_PrintGraph_ID (0);
setData_PrintFormatItem_ID (0);
setDescription_PrintFormatItem_ID (0);
setGraphType (null);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_PrintGraph (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=521 */
public static int Table_ID=MTable.getTable_ID("AD_PrintGraph");

@XendraTrl(Identifier="e4bb56de-98cb-2af1-06a7-c4305c7efed0")
public static String es_PE_TAB_Graph_Description="Definir gráfico a ser incluido";

@XendraTrl(Identifier="e4bb56de-98cb-2af1-06a7-c4305c7efed0")
public static String es_PE_TAB_Graph_Name="Gráfico";
@XendraTab(Name="Graph",
Description="Define Graph to be included",Help="",
AD_Window_ID="f168482a-df94-29cb-0356-1dc5dc4cafe6",SeqNo=60,TabLevel=2,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="e4bb56de-98cb-2af1-06a7-c4305c7efed0",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Graph="e4bb56de-98cb-2af1-06a7-c4305c7efed0";

@XendraTrl(Identifier="1914b8a8-dd3e-1d47-2860-9de0c5d25983")
public static String es_PE_TABLE_AD_PrintGraph_Name="Gráfico";

@XendraTable(Name="Graph",Description="Graph included in Reports",Help="",
TableName="AD_PrintGraph",AccessLevel="7",AD_Window_ID="f168482a-df94-29cb-0356-1dc5dc4cafe6",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="1914b8a8-dd3e-1d47-2860-9de0c5d25983",Synchronized="2017-08-16 11:40:47.0")
/** TableName=AD_PrintGraph */
public static final String Table_Name="AD_PrintGraph";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_PrintGraph");

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
    Table_ID = MTable.getTable_ID("AD_PrintGraph");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_PrintGraph[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Print Format.
@param AD_PrintFormat_ID Data Print Format */
public void setAD_PrintFormat_ID (int AD_PrintFormat_ID)
{
if (AD_PrintFormat_ID < 1) throw new IllegalArgumentException ("AD_PrintFormat_ID is mandatory.");
set_Value (COLUMNNAME_AD_PrintFormat_ID, Integer.valueOf(AD_PrintFormat_ID));
}
/** Get Print Format.
@return Data Print Format */
public int getAD_PrintFormat_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_PrintFormat_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5671abe6-0de9-3472-e20e-7026e8389f7b")
public static String es_PE_FIELD_Graph_PrintFormat_Description="Formato de Impresión de datos";

@XendraTrl(Identifier="5671abe6-0de9-3472-e20e-7026e8389f7b")
public static String es_PE_FIELD_Graph_PrintFormat_Help="El formato de impresión determina como se despliegan los datos para la impresión";

@XendraTrl(Identifier="5671abe6-0de9-3472-e20e-7026e8389f7b")
public static String es_PE_FIELD_Graph_PrintFormat_Name="Formato de Impresión";

@XendraField(AD_Column_ID="AD_PrintFormat_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e4bb56de-98cb-2af1-06a7-c4305c7efed0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5671abe6-0de9-3472-e20e-7026e8389f7b")
public static final String FIELDNAME_Graph_PrintFormat="5671abe6-0de9-3472-e20e-7026e8389f7b";

@XendraTrl(Identifier="d6b051ca-e769-35d1-f9df-d46604144ca6")
public static String es_PE_COLUMN_AD_PrintFormat_ID_Name="Formato de Impresión";

@XendraColumn(AD_Element_ID="3d4916cb-0ecd-15a5-1916-be4c68c10d1f",ColumnName="AD_PrintFormat_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d6b051ca-e769-35d1-f9df-d46604144ca6",
Synchronized="2017-08-05 16:52:42.0")
/** Column name AD_PrintFormat_ID */
public static final String COLUMNNAME_AD_PrintFormat_ID = "AD_PrintFormat_ID";
/** Set Graph.
@param AD_PrintGraph_ID Graph included in Reports */
public void setAD_PrintGraph_ID (int AD_PrintGraph_ID)
{
if (AD_PrintGraph_ID < 1) throw new IllegalArgumentException ("AD_PrintGraph_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_PrintGraph_ID, Integer.valueOf(AD_PrintGraph_ID));
}
/** Get Graph.
@return Graph included in Reports */
public int getAD_PrintGraph_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_PrintGraph_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="697aa94e-06b1-fb80-0bc9-e6cc19cbc888")
public static String es_PE_FIELD_Graph_Graph_Description="Gráfico incluido en Informes";

@XendraTrl(Identifier="697aa94e-06b1-fb80-0bc9-e6cc19cbc888")
public static String es_PE_FIELD_Graph_Graph_Help="Gráfico de línea ó pastel a ser impreso en los Informes.";

@XendraTrl(Identifier="697aa94e-06b1-fb80-0bc9-e6cc19cbc888")
public static String es_PE_FIELD_Graph_Graph_Name="Gráfico";

@XendraField(AD_Column_ID="AD_PrintGraph_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e4bb56de-98cb-2af1-06a7-c4305c7efed0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="697aa94e-06b1-fb80-0bc9-e6cc19cbc888")
public static final String FIELDNAME_Graph_Graph="697aa94e-06b1-fb80-0bc9-e6cc19cbc888";
/** Column name AD_PrintGraph_ID */
public static final String COLUMNNAME_AD_PrintGraph_ID = "AD_PrintGraph_ID";

/** Data1_PrintFormatItem_ID AD_Reference=3c778fb2-3283-3b68-5942-8a619d40432a */
public static final int DATA1_PRINTFORMATITEM_ID_AD_Reference_ID=264;
/** Set Data Column 2.
@param Data1_PrintFormatItem_ID Data Column for Line Charts */
public void setData1_PrintFormatItem_ID (int Data1_PrintFormatItem_ID)
{
if (Data1_PrintFormatItem_ID <= 0) set_Value (COLUMNNAME_Data1_PrintFormatItem_ID, null);
 else 
set_Value (COLUMNNAME_Data1_PrintFormatItem_ID, Integer.valueOf(Data1_PrintFormatItem_ID));
}
/** Get Data Column 2.
@return Data Column for Line Charts */
public int getData1_PrintFormatItem_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Data1_PrintFormatItem_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="bea39d0c-a06a-4476-7ddc-58c7b72b9f90")
public static String es_PE_FIELD_Graph_DataColumn_Description="Columna de datos para gráficos de línea";

@XendraTrl(Identifier="bea39d0c-a06a-4476-7ddc-58c7b72b9f90")
public static String es_PE_FIELD_Graph_DataColumn_Help="Columna adicional de gráficos para gráficos de linea y/o barras";

@XendraTrl(Identifier="bea39d0c-a06a-4476-7ddc-58c7b72b9f90")
public static String es_PE_FIELD_Graph_DataColumn_Name="Columna de Datos 2";

@XendraField(AD_Column_ID="Data1_PrintFormatItem_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e4bb56de-98cb-2af1-06a7-c4305c7efed0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@GraphType@^P",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bea39d0c-a06a-4476-7ddc-58c7b72b9f90")
public static final String FIELDNAME_Graph_DataColumn="bea39d0c-a06a-4476-7ddc-58c7b72b9f90";

@XendraTrl(Identifier="aa939d15-53af-af1a-4eda-96e65ff49661")
public static String es_PE_COLUMN_Data1_PrintFormatItem_ID_Name="Columna de Datos 2";

@XendraColumn(AD_Element_ID="0bbdcc6e-4301-cee6-f510-55994dea18c3",
ColumnName="Data1_PrintFormatItem_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="3c778fb2-3283-3b68-5942-8a619d40432a",
AD_Val_Rule_ID="137d47db-4876-4c7f-dd8f-43f0e103c33f",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="aa939d15-53af-af1a-4eda-96e65ff49661",
Synchronized="2017-08-05 16:52:42.0")
/** Column name Data1_PrintFormatItem_ID */
public static final String COLUMNNAME_Data1_PrintFormatItem_ID = "Data1_PrintFormatItem_ID";

/** Data2_PrintFormatItem_ID AD_Reference=3c778fb2-3283-3b68-5942-8a619d40432a */
public static final int DATA2_PRINTFORMATITEM_ID_AD_Reference_ID=264;
/** Set Data Column 3.
@param Data2_PrintFormatItem_ID Data Column for Line Charts */
public void setData2_PrintFormatItem_ID (int Data2_PrintFormatItem_ID)
{
if (Data2_PrintFormatItem_ID <= 0) set_Value (COLUMNNAME_Data2_PrintFormatItem_ID, null);
 else 
set_Value (COLUMNNAME_Data2_PrintFormatItem_ID, Integer.valueOf(Data2_PrintFormatItem_ID));
}
/** Get Data Column 3.
@return Data Column for Line Charts */
public int getData2_PrintFormatItem_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Data2_PrintFormatItem_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ea4cd8b4-430a-88e4-054a-84b5739877a4")
public static String es_PE_FIELD_Graph_DataColumn32_Description="Columna de datos para gráficos de línea";

@XendraTrl(Identifier="ea4cd8b4-430a-88e4-054a-84b5739877a4")
public static String es_PE_FIELD_Graph_DataColumn32_Help="Columna adicional de gráficos para gráficos de linea y/o barras";

@XendraTrl(Identifier="ea4cd8b4-430a-88e4-054a-84b5739877a4")
public static String es_PE_FIELD_Graph_DataColumn32_Name="Columna de Datos 3";

@XendraField(AD_Column_ID="Data2_PrintFormatItem_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e4bb56de-98cb-2af1-06a7-c4305c7efed0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@GraphType@^P",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ea4cd8b4-430a-88e4-054a-84b5739877a4")
public static final String FIELDNAME_Graph_DataColumn32="ea4cd8b4-430a-88e4-054a-84b5739877a4";

@XendraTrl(Identifier="abc36997-cabf-df61-7df4-6ce77ccab03d")
public static String es_PE_COLUMN_Data2_PrintFormatItem_ID_Name="Columna de Datos 3";

@XendraColumn(AD_Element_ID="956049e0-8905-e306-f2f9-10f2152a8084",
ColumnName="Data2_PrintFormatItem_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="3c778fb2-3283-3b68-5942-8a619d40432a",
AD_Val_Rule_ID="137d47db-4876-4c7f-dd8f-43f0e103c33f",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="abc36997-cabf-df61-7df4-6ce77ccab03d",
Synchronized="2017-08-05 16:52:42.0")
/** Column name Data2_PrintFormatItem_ID */
public static final String COLUMNNAME_Data2_PrintFormatItem_ID = "Data2_PrintFormatItem_ID";

/** Data3_PrintFormatItem_ID AD_Reference=3c778fb2-3283-3b68-5942-8a619d40432a */
public static final int DATA3_PRINTFORMATITEM_ID_AD_Reference_ID=264;
/** Set Data Column 4.
@param Data3_PrintFormatItem_ID Data Column for Line Charts */
public void setData3_PrintFormatItem_ID (int Data3_PrintFormatItem_ID)
{
if (Data3_PrintFormatItem_ID <= 0) set_Value (COLUMNNAME_Data3_PrintFormatItem_ID, null);
 else 
set_Value (COLUMNNAME_Data3_PrintFormatItem_ID, Integer.valueOf(Data3_PrintFormatItem_ID));
}
/** Get Data Column 4.
@return Data Column for Line Charts */
public int getData3_PrintFormatItem_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Data3_PrintFormatItem_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="90d3cd34-2903-1998-ab4d-b6d5d26f7b14")
public static String es_PE_FIELD_Graph_DataColumn43_Description="Columna de datos para gráficos de línea";

@XendraTrl(Identifier="90d3cd34-2903-1998-ab4d-b6d5d26f7b14")
public static String es_PE_FIELD_Graph_DataColumn43_Help="Columna adicional de gráficos para gráficos de linea y/o barras";

@XendraTrl(Identifier="90d3cd34-2903-1998-ab4d-b6d5d26f7b14")
public static String es_PE_FIELD_Graph_DataColumn43_Name="Columna de Datos 4";

@XendraField(AD_Column_ID="Data3_PrintFormatItem_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e4bb56de-98cb-2af1-06a7-c4305c7efed0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@GraphType@^P",DisplayLength=14,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="90d3cd34-2903-1998-ab4d-b6d5d26f7b14")
public static final String FIELDNAME_Graph_DataColumn43="90d3cd34-2903-1998-ab4d-b6d5d26f7b14";

@XendraTrl(Identifier="f49db39c-f4b0-175a-5015-026c3c20315e")
public static String es_PE_COLUMN_Data3_PrintFormatItem_ID_Name="Columna de Datos 4";

@XendraColumn(AD_Element_ID="f3b4b0a4-3186-6ba7-9f4b-80a5bb380004",
ColumnName="Data3_PrintFormatItem_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="3c778fb2-3283-3b68-5942-8a619d40432a",
AD_Val_Rule_ID="137d47db-4876-4c7f-dd8f-43f0e103c33f",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f49db39c-f4b0-175a-5015-026c3c20315e",
Synchronized="2017-08-05 16:52:42.0")
/** Column name Data3_PrintFormatItem_ID */
public static final String COLUMNNAME_Data3_PrintFormatItem_ID = "Data3_PrintFormatItem_ID";

/** Data4_PrintFormatItem_ID AD_Reference=3c778fb2-3283-3b68-5942-8a619d40432a */
public static final int DATA4_PRINTFORMATITEM_ID_AD_Reference_ID=264;
/** Set Data Column 5.
@param Data4_PrintFormatItem_ID Data Column for Line Charts */
public void setData4_PrintFormatItem_ID (int Data4_PrintFormatItem_ID)
{
if (Data4_PrintFormatItem_ID <= 0) set_Value (COLUMNNAME_Data4_PrintFormatItem_ID, null);
 else 
set_Value (COLUMNNAME_Data4_PrintFormatItem_ID, Integer.valueOf(Data4_PrintFormatItem_ID));
}
/** Get Data Column 5.
@return Data Column for Line Charts */
public int getData4_PrintFormatItem_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Data4_PrintFormatItem_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c2093c72-eb04-9b2d-7214-3783655f95f2")
public static String es_PE_FIELD_Graph_DataColumn54_Description="Columna de datos para gráficos de línea";

@XendraTrl(Identifier="c2093c72-eb04-9b2d-7214-3783655f95f2")
public static String es_PE_FIELD_Graph_DataColumn54_Help="Columna adicional de gráficos para gráficos de linea y/o barras";

@XendraTrl(Identifier="c2093c72-eb04-9b2d-7214-3783655f95f2")
public static String es_PE_FIELD_Graph_DataColumn54_Name="Columna de Datos 5";

@XendraField(AD_Column_ID="Data4_PrintFormatItem_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e4bb56de-98cb-2af1-06a7-c4305c7efed0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@GraphType@^P",DisplayLength=14,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c2093c72-eb04-9b2d-7214-3783655f95f2")
public static final String FIELDNAME_Graph_DataColumn54="c2093c72-eb04-9b2d-7214-3783655f95f2";

@XendraTrl(Identifier="dff13e0f-18f5-9d03-72fc-3984aff606f8")
public static String es_PE_COLUMN_Data4_PrintFormatItem_ID_Name="Columna de Datos 5";

@XendraColumn(AD_Element_ID="54abb972-7b09-f16f-3fb0-9d2d8dd82fa0",
ColumnName="Data4_PrintFormatItem_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="3c778fb2-3283-3b68-5942-8a619d40432a",
AD_Val_Rule_ID="137d47db-4876-4c7f-dd8f-43f0e103c33f",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dff13e0f-18f5-9d03-72fc-3984aff606f8",
Synchronized="2017-08-05 16:52:42.0")
/** Column name Data4_PrintFormatItem_ID */
public static final String COLUMNNAME_Data4_PrintFormatItem_ID = "Data4_PrintFormatItem_ID";

/** Data_PrintFormatItem_ID AD_Reference=3c778fb2-3283-3b68-5942-8a619d40432a */
public static final int DATA_PRINTFORMATITEM_ID_AD_Reference_ID=264;
/** Set Data Column.
@param Data_PrintFormatItem_ID Data Column for Pie and Line Charts */
public void setData_PrintFormatItem_ID (int Data_PrintFormatItem_ID)
{
if (Data_PrintFormatItem_ID < 1) throw new IllegalArgumentException ("Data_PrintFormatItem_ID is mandatory.");
set_Value (COLUMNNAME_Data_PrintFormatItem_ID, Integer.valueOf(Data_PrintFormatItem_ID));
}
/** Get Data Column.
@return Data Column for Pie and Line Charts */
public int getData_PrintFormatItem_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Data_PrintFormatItem_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4718313e-f19a-5d51-8728-ba843b735101")
public static String es_PE_FIELD_Graph_DataColumn5_Description="Columna de datos para gráficos de línea y de pastel";

@XendraTrl(Identifier="4718313e-f19a-5d51-8728-ba843b735101")
public static String es_PE_FIELD_Graph_DataColumn5_Help="Columna adicional de gráficos para gráficos de linea y/o barras";

@XendraTrl(Identifier="4718313e-f19a-5d51-8728-ba843b735101")
public static String es_PE_FIELD_Graph_DataColumn5_Name="Columna de Datos";

@XendraField(AD_Column_ID="Data_PrintFormatItem_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e4bb56de-98cb-2af1-06a7-c4305c7efed0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4718313e-f19a-5d51-8728-ba843b735101")
public static final String FIELDNAME_Graph_DataColumn5="4718313e-f19a-5d51-8728-ba843b735101";

@XendraTrl(Identifier="9be33c6f-af9b-b87d-da98-38df544c7097")
public static String es_PE_COLUMN_Data_PrintFormatItem_ID_Name="Columna de Datos";

@XendraColumn(AD_Element_ID="42490201-1a7a-bb66-60f5-d05b78adde6c",
ColumnName="Data_PrintFormatItem_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="3c778fb2-3283-3b68-5942-8a619d40432a",
AD_Val_Rule_ID="137d47db-4876-4c7f-dd8f-43f0e103c33f",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9be33c6f-af9b-b87d-da98-38df544c7097",
Synchronized="2017-08-05 16:52:42.0")
/** Column name Data_PrintFormatItem_ID */
public static final String COLUMNNAME_Data_PrintFormatItem_ID = "Data_PrintFormatItem_ID";
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

@XendraTrl(Identifier="860b832d-f0cc-cf96-ff57-03f7a3ae5fca")
public static String es_PE_FIELD_Graph_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="860b832d-f0cc-cf96-ff57-03f7a3ae5fca")
public static String es_PE_FIELD_Graph_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="860b832d-f0cc-cf96-ff57-03f7a3ae5fca")
public static String es_PE_FIELD_Graph_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="e4bb56de-98cb-2af1-06a7-c4305c7efed0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="860b832d-f0cc-cf96-ff57-03f7a3ae5fca")
public static final String FIELDNAME_Graph_Description="860b832d-f0cc-cf96-ff57-03f7a3ae5fca";

@XendraTrl(Identifier="58fe5a0f-f5f0-c4e6-75dc-8d1db671fd07")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="58fe5a0f-f5f0-c4e6-75dc-8d1db671fd07",
Synchronized="2017-08-05 16:52:42.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";

/** Description_PrintFormatItem_ID AD_Reference=3c778fb2-3283-3b68-5942-8a619d40432a */
public static final int DESCRIPTION_PRINTFORMATITEM_ID_AD_Reference_ID=264;
/** Set Description Column.
@param Description_PrintFormatItem_ID Description Column for Pie/Line/Bar Charts */
public void setDescription_PrintFormatItem_ID (int Description_PrintFormatItem_ID)
{
if (Description_PrintFormatItem_ID < 1) throw new IllegalArgumentException ("Description_PrintFormatItem_ID is mandatory.");
set_Value (COLUMNNAME_Description_PrintFormatItem_ID, Integer.valueOf(Description_PrintFormatItem_ID));
}
/** Get Description Column.
@return Description Column for Pie/Line/Bar Charts */
public int getDescription_PrintFormatItem_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Description_PrintFormatItem_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f3c11cd0-2456-7fdd-fc4b-ddbdd27b0713")
public static String es_PE_FIELD_Graph_DescriptionColumn_Description="Columna de descripción para gráficos de línea/barra/pastel";

@XendraTrl(Identifier="f3c11cd0-2456-7fdd-fc4b-ddbdd27b0713")
public static String es_PE_FIELD_Graph_DescriptionColumn_Help="Columna adicional de gráficos para gráficos de linea y/o barras y de pastel";

@XendraTrl(Identifier="f3c11cd0-2456-7fdd-fc4b-ddbdd27b0713")
public static String es_PE_FIELD_Graph_DescriptionColumn_Name="Columna de Descripción";

@XendraField(AD_Column_ID="Description_PrintFormatItem_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e4bb56de-98cb-2af1-06a7-c4305c7efed0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f3c11cd0-2456-7fdd-fc4b-ddbdd27b0713")
public static final String FIELDNAME_Graph_DescriptionColumn="f3c11cd0-2456-7fdd-fc4b-ddbdd27b0713";

@XendraTrl(Identifier="4d3926b5-2eae-900e-ebdc-22d5d2536659")
public static String es_PE_COLUMN_Description_PrintFormatItem_ID_Name="Columna de Descripción";

@XendraColumn(AD_Element_ID="5ad32c49-3825-5d4f-071c-127962d55f24",
ColumnName="Description_PrintFormatItem_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="3c778fb2-3283-3b68-5942-8a619d40432a",
AD_Val_Rule_ID="137d47db-4876-4c7f-dd8f-43f0e103c33f",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4d3926b5-2eae-900e-ebdc-22d5d2536659",
Synchronized="2017-08-05 16:52:42.0")
/** Column name Description_PrintFormatItem_ID */
public static final String COLUMNNAME_Description_PrintFormatItem_ID = "Description_PrintFormatItem_ID";

/** GraphType AD_Reference=f1311cf5-4684-8892-1973-42da3caae6f9 */
public static final int GRAPHTYPE_AD_Reference_ID=265;
/** Set Graph Type.
@param GraphType Type of graph to be painted */
public void setGraphType (String GraphType)
{
if (GraphType == null) throw new IllegalArgumentException ("GraphType is mandatory");
if (GraphType.equals(REF_AD_PrintGraphType.PieChart) || GraphType.equals(REF_AD_PrintGraphType.LineChart) || GraphType.equals(REF_AD_PrintGraphType.BarChart));
 else throw new IllegalArgumentException ("GraphType Invalid value - " + GraphType + " - Reference_ID=265 - P - L - B");
if (GraphType.length() > 1)
{
log.warning("Length > 1 - truncated");
GraphType = GraphType.substring(0,0);
}
set_Value (COLUMNNAME_GraphType, GraphType);
}
/** Get Graph Type.
@return Type of graph to be painted */
public String getGraphType() 
{
return (String)get_Value(COLUMNNAME_GraphType);
}

@XendraTrl(Identifier="47933c03-98a6-cfe9-8759-53e99c8dbe57")
public static String es_PE_FIELD_Graph_GraphType_Description="Tipo de Gráfico a ser impreso";

@XendraTrl(Identifier="47933c03-98a6-cfe9-8759-53e99c8dbe57")
public static String es_PE_FIELD_Graph_GraphType_Help="Tipo de gráfico a ser impreso";

@XendraTrl(Identifier="47933c03-98a6-cfe9-8759-53e99c8dbe57")
public static String es_PE_FIELD_Graph_GraphType_Name="Tipo de Gráfico";

@XendraField(AD_Column_ID="GraphType",IsCentrallyMaintained=true,
AD_Tab_ID="e4bb56de-98cb-2af1-06a7-c4305c7efed0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="47933c03-98a6-cfe9-8759-53e99c8dbe57")
public static final String FIELDNAME_Graph_GraphType="47933c03-98a6-cfe9-8759-53e99c8dbe57";

@XendraTrl(Identifier="befb842f-5b50-bfb6-0555-88f7f11fcc7a")
public static String es_PE_COLUMN_GraphType_Name="Tipo de Gráfico";

@XendraColumn(AD_Element_ID="17bd7e1d-e644-f69a-00b3-bba7ae600835",ColumnName="GraphType",
AD_Reference_ID=17,AD_Reference_Value_ID="f1311cf5-4684-8892-1973-42da3caae6f9",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="befb842f-5b50-bfb6-0555-88f7f11fcc7a",Synchronized="2017-08-05 16:52:42.0")
/** Column name GraphType */
public static final String COLUMNNAME_GraphType = "GraphType";
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
@XendraTrl(Identifier="f2b79d08-7c21-4051-bf85-888d8e95d311")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f2b79d08-7c21-4051-bf85-888d8e95d311",
Synchronized="2017-08-05 16:52:43.0")
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

@XendraTrl(Identifier="bf8b98fb-1d4d-728d-b2e9-e371237bd080")
public static String es_PE_FIELD_Graph_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="bf8b98fb-1d4d-728d-b2e9-e371237bd080")
public static String es_PE_FIELD_Graph_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="bf8b98fb-1d4d-728d-b2e9-e371237bd080")
public static String es_PE_FIELD_Graph_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="e4bb56de-98cb-2af1-06a7-c4305c7efed0",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="bf8b98fb-1d4d-728d-b2e9-e371237bd080")
public static final String FIELDNAME_Graph_Name="bf8b98fb-1d4d-728d-b2e9-e371237bd080";

@XendraTrl(Identifier="f2312f40-bc31-e0f5-d93a-59626af05568")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f2312f40-bc31-e0f5-d93a-59626af05568",
Synchronized="2017-08-05 16:52:43.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
}
