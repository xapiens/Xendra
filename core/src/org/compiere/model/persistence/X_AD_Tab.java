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
/** Generated Model for AD_Tab
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Tab extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Tab_ID id
@param trxName transaction
*/
public X_AD_Tab (Properties ctx, int AD_Tab_ID, String trxName)
{
super (ctx, AD_Tab_ID, trxName);
/** if (AD_Tab_ID == 0)
{
setAD_Tab_ID (0);
setAD_Table_ID (0);
setAD_Window_ID (0);
setEntityType (null);	
// U
setHasTree (false);	
// N
setIsAdvancedTab (false);	
// N
setIsInsertRecord (true);	
// Y
setIsReadOnly (false);	
// N
setIsSingleRow (false);	
// N
setIsSortTab (false);	
// N
setIsTranslationTab (false);	
// N
setName (null);
setSeqNo (0);	
// @SQL=SELECT COALESCE(MAX(SeqNo),0)+10 AS DefaultValue FROM AD_Tab WHERE AD_Window_ID=@AD_Window_ID@
setTabLevel (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Tab (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=106 */
public static int Table_ID=MTable.getTable_ID("AD_Tab");

@XendraTrl(Identifier="79e5fc71-0ff1-aa88-a74e-9393830dc6d6")
public static String es_PE_TAB_Tab_Description="Definición de una pestaña dentro de una ventana que contiene campos";

@XendraTrl(Identifier="79e5fc71-0ff1-aa88-a74e-9393830dc6d6")
public static String es_PE_TAB_Tab_Name="Pestaña";

@XendraTrl(Identifier="79e5fc71-0ff1-aa88-a74e-9393830dc6d6")
public static String es_PE_TAB_Tab_Help="Define cada pestaña dentro de una ventana. Cada pestaña contiene una selección discreta de campos";

@XendraTab(Name="Tab",Description="Tab definition within a window holds fields",
Help="The Tab Tab defines each Tab within a Window.  Each Tab contains a discrete selection of fields. Note that the display and read only logic is evaluated when loading the window.",
AD_Window_ID="30d54758-dbe1-9262-0e6e-4d5cd8507e38",SeqNo=40,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="79e5fc71-0ff1-aa88-a74e-9393830dc6d6",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Tab="79e5fc71-0ff1-aa88-a74e-9393830dc6d6";

@XendraTrl(Identifier="2018d1bc-4603-f65c-2949-5204335fa558")
public static String es_PE_TABLE_AD_Tab_Name="Pestaña";

@XendraTable(Name="Tab",Description="Tab within a Window",Help="",TableName="AD_Tab",
AccessLevel="4",AD_Window_ID="30d54758-dbe1-9262-0e6e-4d5cd8507e38",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=135,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="2018d1bc-4603-f65c-2949-5204335fa558",Synchronized="2017-08-16 11:41:01.0")
/** TableName=AD_Tab */
public static final String Table_Name="AD_Tab";


@XendraIndex(Name="ad_tab_table",Identifier="d91540d9-3504-015d-4688-5ab9dfd13b6c",
Column_Names="ad_table_id",IsUnique="false",TableIdentifier="d91540d9-3504-015d-4688-5ab9dfd13b6c",
Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_ad_tab_table = "d91540d9-3504-015d-4688-5ab9dfd13b6c";


@XendraIndex(Name="ad_tab_window",Identifier="ffdf51ab-ff25-16f8-bb48-34361965301a",
Column_Names="ad_window_id",IsUnique="false",
TableIdentifier="ffdf51ab-ff25-16f8-bb48-34361965301a",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_ad_tab_window = "ffdf51ab-ff25-16f8-bb48-34361965301a";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Tab");

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
    Table_ID = MTable.getTable_ID("AD_Tab");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Tab[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Column.
@param AD_Column_ID Column in the table */
public void setAD_Column_ID (int AD_Column_ID)
{
if (AD_Column_ID <= 0) set_Value (COLUMNNAME_AD_Column_ID, null);
 else 
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

@XendraTrl(Identifier="414786cb-4c66-fef3-2eb5-bd88c3cddfee")
public static String es_PE_FIELD_Tab_LinkColumn_Description="Columna para Multi-Llave";

@XendraTrl(Identifier="414786cb-4c66-fef3-2eb5-bd88c3cddfee")
public static String es_PE_FIELD_Tab_LinkColumn_Help="La columna primaria indica qu=E9 columna es la llave primaria para esas situaciones donde hay m=E1s de una llave.";

@XendraTrl(Identifier="414786cb-4c66-fef3-2eb5-bd88c3cddfee")
public static String es_PE_FIELD_Tab_LinkColumn_Name="Columna Primaria";

@XendraField(AD_Column_ID="AD_Column_ID",IsCentrallyMaintained=false,
AD_Tab_ID="79e5fc71-0ff1-aa88-a74e-9393830dc6d6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSortTab@=N",DisplayLength=14,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="414786cb-4c66-fef3-2eb5-bd88c3cddfee")
public static final String FIELDNAME_Tab_LinkColumn="414786cb-4c66-fef3-2eb5-bd88c3cddfee";

@XendraTrl(Identifier="3fcc28d6-b02d-aec8-0e25-e1521994df8c")
public static String es_PE_COLUMN_AD_Column_ID_Name="Columna";

@XendraColumn(AD_Element_ID="a0dcf1ba-2ef3-ca06-ed42-8ae37c632eaf",ColumnName="AD_Column_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="084db087-1100-ad15-806b-d1b94a96650c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3fcc28d6-b02d-aec8-0e25-e1521994df8c",Synchronized="2017-08-05 16:52:52.0")
/** Column name AD_Column_ID */
public static final String COLUMNNAME_AD_Column_ID = "AD_Column_ID";

/** AD_ColumnSortOrder_ID AD_Reference=ca7f71c1-2786-0991-ab6f-55504d012980 */
public static final int AD_COLUMNSORTORDER_ID_AD_Reference_ID=257;
/** Set Order Column.
@param AD_ColumnSortOrder_ID Column determining the order */
public void setAD_ColumnSortOrder_ID (int AD_ColumnSortOrder_ID)
{
if (AD_ColumnSortOrder_ID <= 0) set_Value (COLUMNNAME_AD_ColumnSortOrder_ID, null);
 else 
set_Value (COLUMNNAME_AD_ColumnSortOrder_ID, Integer.valueOf(AD_ColumnSortOrder_ID));
}
/** Get Order Column.
@return Column determining the order */
public int getAD_ColumnSortOrder_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_ColumnSortOrder_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="fd283702-1f52-93c2-f755-d190b676e294")
public static String es_PE_FIELD_Tab_OrderColumn_Description="Columna que determina el orden";

@XendraTrl(Identifier="fd283702-1f52-93c2-f755-d190b676e294")
public static String es_PE_FIELD_Tab_OrderColumn_Help="Columna entera de la tabla que determina el orden (despliegue; orden; ..)";

@XendraTrl(Identifier="fd283702-1f52-93c2-f755-d190b676e294")
public static String es_PE_FIELD_Tab_OrderColumn_Name="Orden por Columna";

@XendraField(AD_Column_ID="AD_ColumnSortOrder_ID",IsCentrallyMaintained=true,
AD_Tab_ID="79e5fc71-0ff1-aa88-a74e-9393830dc6d6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSortTab@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fd283702-1f52-93c2-f755-d190b676e294")
public static final String FIELDNAME_Tab_OrderColumn="fd283702-1f52-93c2-f755-d190b676e294";

@XendraTrl(Identifier="45254c6c-c311-72c7-a4c7-e737cb834362")
public static String es_PE_COLUMN_AD_ColumnSortOrder_ID_Name="Orden por Columna";

@XendraColumn(AD_Element_ID="b92c66ff-be33-ff31-64a2-5dcdc450f6b2",
ColumnName="AD_ColumnSortOrder_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="ca7f71c1-2786-0991-ab6f-55504d012980",
AD_Val_Rule_ID="084db087-1100-ad15-806b-d1b94a96650c",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="45254c6c-c311-72c7-a4c7-e737cb834362",
Synchronized="2017-08-05 16:52:52.0")
/** Column name AD_ColumnSortOrder_ID */
public static final String COLUMNNAME_AD_ColumnSortOrder_ID = "AD_ColumnSortOrder_ID";

/** AD_ColumnSortYesNo_ID AD_Reference=64ecc5d9-280a-1f58-161f-356a16ae8978 */
public static final int AD_COLUMNSORTYESNO_ID_AD_Reference_ID=258;
/** Set Included Column.
@param AD_ColumnSortYesNo_ID Column determining if a Table Column is included in Ordering */
public void setAD_ColumnSortYesNo_ID (int AD_ColumnSortYesNo_ID)
{
if (AD_ColumnSortYesNo_ID <= 0) set_Value (COLUMNNAME_AD_ColumnSortYesNo_ID, null);
 else 
set_Value (COLUMNNAME_AD_ColumnSortYesNo_ID, Integer.valueOf(AD_ColumnSortYesNo_ID));
}
/** Get Included Column.
@return Column determining if a Table Column is included in Ordering */
public int getAD_ColumnSortYesNo_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_ColumnSortYesNo_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d6d10244-6270-229c-ddf2-adabfdf9d0ae")
public static String es_PE_FIELD_Tab_IncludedColumn_Description="Columna que determina si una columna de tabla esta incluida en el ordenamiento";

@XendraTrl(Identifier="d6d10244-6270-229c-ddf2-adabfdf9d0ae")
public static String es_PE_FIELD_Tab_IncludedColumn_Help="Si una columna incluida es definida; la aplicación decide si una columa es activa para el ordenamiento - de lo contrario se define que la columna de orden tiene un valor 1 ó mayor";

@XendraTrl(Identifier="d6d10244-6270-229c-ddf2-adabfdf9d0ae")
public static String es_PE_FIELD_Tab_IncludedColumn_Name="Columna Incluida";

@XendraField(AD_Column_ID="AD_ColumnSortYesNo_ID",IsCentrallyMaintained=true,
AD_Tab_ID="79e5fc71-0ff1-aa88-a74e-9393830dc6d6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSortTab@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d6d10244-6270-229c-ddf2-adabfdf9d0ae")
public static final String FIELDNAME_Tab_IncludedColumn="d6d10244-6270-229c-ddf2-adabfdf9d0ae";

@XendraTrl(Identifier="093068a6-8fde-0056-c665-e7355e9a14e0")
public static String es_PE_COLUMN_AD_ColumnSortYesNo_ID_Name="Columna Incluida";

@XendraColumn(AD_Element_ID="1a59a0ac-22f4-873c-d521-702ad5b8c56c",
ColumnName="AD_ColumnSortYesNo_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="64ecc5d9-280a-1f58-161f-356a16ae8978",
AD_Val_Rule_ID="084db087-1100-ad15-806b-d1b94a96650c",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="093068a6-8fde-0056-c665-e7355e9a14e0",
Synchronized="2017-08-05 16:52:52.0")
/** Column name AD_ColumnSortYesNo_ID */
public static final String COLUMNNAME_AD_ColumnSortYesNo_ID = "AD_ColumnSortYesNo_ID";
/** Set Image.
@param AD_Image_ID Image or Icon */
public void setAD_Image_ID (int AD_Image_ID)
{
if (AD_Image_ID <= 0) set_Value (COLUMNNAME_AD_Image_ID, null);
 else 
set_Value (COLUMNNAME_AD_Image_ID, Integer.valueOf(AD_Image_ID));
}
/** Get Image.
@return Image or Icon */
public int getAD_Image_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Image_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f9e24a35-7628-c67e-155e-69d02c97d4f3")
public static String es_PE_FIELD_Tab_Image_Description="Imagen del sistema";

@XendraTrl(Identifier="f9e24a35-7628-c67e-155e-69d02c97d4f3")
public static String es_PE_FIELD_Tab_Image_Name="Imagen";
@XendraField(AD_Column_ID="AD_Image_ID",
IsCentrallyMaintained=true,AD_Tab_ID="79e5fc71-0ff1-aa88-a74e-9393830dc6d6",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=310,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="f9e24a35-7628-c67e-155e-69d02c97d4f3")
public static final String FIELDNAME_Tab_Image="f9e24a35-7628-c67e-155e-69d02c97d4f3";

@XendraTrl(Identifier="5502dfa4-96c9-7625-106b-3f663b86287d")
public static String es_PE_COLUMN_AD_Image_ID_Name="Imagen";

@XendraColumn(AD_Element_ID="8464640e-ab89-67ff-b78b-1e8940657a22",ColumnName="AD_Image_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5502dfa4-96c9-7625-106b-3f663b86287d",
Synchronized="2017-08-05 16:52:52.0")
/** Column name AD_Image_ID */
public static final String COLUMNNAME_AD_Image_ID = "AD_Image_ID";
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

@XendraTrl(Identifier="8b5b3ff0-d0cd-f536-f931-4cb8b81d36e1")
public static String es_PE_FIELD_Tab_Process_Description="Proceso ó Informe";

@XendraTrl(Identifier="8b5b3ff0-d0cd-f536-f931-4cb8b81d36e1")
public static String es_PE_FIELD_Tab_Process_Help="El campo proceso identifica un proceso ó Informe único en el sistema.";

@XendraTrl(Identifier="8b5b3ff0-d0cd-f536-f931-4cb8b81d36e1")
public static String es_PE_FIELD_Tab_Process_Name="Proceso";

@XendraField(AD_Column_ID="AD_Process_ID",IsCentrallyMaintained=true,
AD_Tab_ID="79e5fc71-0ff1-aa88-a74e-9393830dc6d6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSortTab@=N",DisplayLength=14,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8b5b3ff0-d0cd-f536-f931-4cb8b81d36e1")
public static final String FIELDNAME_Tab_Process="8b5b3ff0-d0cd-f536-f931-4cb8b81d36e1";

@XendraTrl(Identifier="cf19474f-e677-ba72-7fa9-24d9378e5663")
public static String es_PE_COLUMN_AD_Process_ID_Name="Proceso";

@XendraColumn(AD_Element_ID="60982cc9-e937-d374-4608-1c3f64b16d3b",ColumnName="AD_Process_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="1af2bc73-25f8-2ea1-4c38-d8a59d7d48c5",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="cf19474f-e677-ba72-7fa9-24d9378e5663",Synchronized="2017-08-05 16:52:52.0")
/** Column name AD_Process_ID */
public static final String COLUMNNAME_AD_Process_ID = "AD_Process_ID";
/** Set Tab.
@param AD_Tab_ID Tab within a Window */
public void setAD_Tab_ID (int AD_Tab_ID)
{
if (AD_Tab_ID < 1) throw new IllegalArgumentException ("AD_Tab_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Tab_ID, Integer.valueOf(AD_Tab_ID));
}
/** Get Tab.
@return Tab within a Window */
public int getAD_Tab_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Tab_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3a0f9783-7721-87c1-3bc0-0298239d5d23")
public static String es_PE_FIELD_Tab_Tab_Description="Pestaña dentro de una ventana.";

@XendraTrl(Identifier="3a0f9783-7721-87c1-3bc0-0298239d5d23")
public static String es_PE_FIELD_Tab_Tab_Help="La pestaña indica que se despliega dentro de una ventana";

@XendraTrl(Identifier="3a0f9783-7721-87c1-3bc0-0298239d5d23")
public static String es_PE_FIELD_Tab_Tab_Name="Pestaña";
@XendraField(AD_Column_ID="AD_Tab_ID",
IsCentrallyMaintained=true,AD_Tab_ID="79e5fc71-0ff1-aa88-a74e-9393830dc6d6",AD_FieldGroup_ID="",
IsDisplayed=false,DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="3a0f9783-7721-87c1-3bc0-0298239d5d23")
public static final String FIELDNAME_Tab_Tab="3a0f9783-7721-87c1-3bc0-0298239d5d23";
/** Column name AD_Tab_ID */
public static final String COLUMNNAME_AD_Tab_ID = "AD_Tab_ID";
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

@XendraTrl(Identifier="7c0a2ee0-e52d-f3c4-35f8-00734e3efb27")
public static String es_PE_FIELD_Tab_Table_Description="Tabla para los campos";

@XendraTrl(Identifier="7c0a2ee0-e52d-f3c4-35f8-00734e3efb27")
public static String es_PE_FIELD_Tab_Table_Help="La Tabla indica una tabla en la que reside un campo ó campos.";

@XendraTrl(Identifier="7c0a2ee0-e52d-f3c4-35f8-00734e3efb27")
public static String es_PE_FIELD_Tab_Table_Name="Tabla";
@XendraField(AD_Column_ID="AD_Table_ID",
IsCentrallyMaintained=true,AD_Tab_ID="79e5fc71-0ff1-aa88-a74e-9393830dc6d6",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="7c0a2ee0-e52d-f3c4-35f8-00734e3efb27")
public static final String FIELDNAME_Tab_Table="7c0a2ee0-e52d-f3c4-35f8-00734e3efb27";

@XendraTrl(Identifier="a8af9460-a979-f57b-aebd-c3c947a05500")
public static String es_PE_COLUMN_AD_Table_ID_Name="Tabla";

@XendraColumn(AD_Element_ID="270eeb02-723b-0ecc-7f56-3c67fa71a7f1",ColumnName="AD_Table_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a8af9460-a979-f57b-aebd-c3c947a05500",
Synchronized="2017-08-05 16:52:52.0")
/** Column name AD_Table_ID */
public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
/** Set Window.
@param AD_Window_ID Data entry or display window */
public void setAD_Window_ID (int AD_Window_ID)
{
if (AD_Window_ID < 1) throw new IllegalArgumentException ("AD_Window_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Window_ID, Integer.valueOf(AD_Window_ID));
}
/** Get Window.
@return Data entry or display window */
public int getAD_Window_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Window_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="09f68582-d920-fad3-eead-bc7a47b74019")
public static String es_PE_FIELD_Tab_Window_Description="Ventana de entrada de datos ó despliegue";

@XendraTrl(Identifier="09f68582-d920-fad3-eead-bc7a47b74019")
public static String es_PE_FIELD_Tab_Window_Help="El campo ventana identifica una ventana única en el sistema";

@XendraTrl(Identifier="09f68582-d920-fad3-eead-bc7a47b74019")
public static String es_PE_FIELD_Tab_Window_Name="Ventana";

@XendraField(AD_Column_ID="AD_Window_ID",IsCentrallyMaintained=true,
AD_Tab_ID="79e5fc71-0ff1-aa88-a74e-9393830dc6d6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="09f68582-d920-fad3-eead-bc7a47b74019")
public static final String FIELDNAME_Tab_Window="09f68582-d920-fad3-eead-bc7a47b74019";

@XendraTrl(Identifier="893a0864-103d-03c6-829c-78c49711ea6f")
public static String es_PE_COLUMN_AD_Window_ID_Name="Ventana";

@XendraColumn(AD_Element_ID="0c50cb0e-febe-8650-2621-11ba77688276",ColumnName="AD_Window_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="893a0864-103d-03c6-829c-78c49711ea6f",
Synchronized="2017-08-05 16:52:52.0")
/** Column name AD_Window_ID */
public static final String COLUMNNAME_AD_Window_ID = "AD_Window_ID";
/** Set Commit Warning.
@param CommitWarning Warning displayed when saving */
public void setCommitWarning (String CommitWarning)
{
set_Value (COLUMNNAME_CommitWarning, CommitWarning);
}
/** Get Commit Warning.
@return Warning displayed when saving */
public String getCommitWarning() 
{
String value = (String)get_Value(COLUMNNAME_CommitWarning);
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

@XendraTrl(Identifier="5b194e41-72ca-f953-3e4e-46fe6b7fa480")
public static String es_PE_FIELD_Tab_CommitWarning_Description="Advierte cuando va a salvar algun registro.";

@XendraTrl(Identifier="5b194e41-72ca-f953-3e4e-46fe6b7fa480")
public static String es_PE_FIELD_Tab_CommitWarning_Help="La advertencia de salvado manda un mensaje que advierte si desea guardar ó no algun registro.";

@XendraTrl(Identifier="5b194e41-72ca-f953-3e4e-46fe6b7fa480")
public static String es_PE_FIELD_Tab_CommitWarning_Name="Advertencia de salvado";

@XendraField(AD_Column_ID="CommitWarning",IsCentrallyMaintained=true,
AD_Tab_ID="79e5fc71-0ff1-aa88-a74e-9393830dc6d6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=280,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5b194e41-72ca-f953-3e4e-46fe6b7fa480")
public static final String FIELDNAME_Tab_CommitWarning="5b194e41-72ca-f953-3e4e-46fe6b7fa480";

@XendraTrl(Identifier="ff00eff1-d63a-950e-03a1-8139ce6c142c")
public static String es_PE_COLUMN_CommitWarning_Name="Advertencia de salvado";

@XendraColumn(AD_Element_ID="68ec7259-ef94-1928-b4a0-e49849818cc3",ColumnName="CommitWarning",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ff00eff1-d63a-950e-03a1-8139ce6c142c",
Synchronized="2017-08-05 16:52:52.0")
/** Column name CommitWarning */
public static final String COLUMNNAME_CommitWarning = "CommitWarning";
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

@XendraTrl(Identifier="cd8d3485-2a25-b45a-8142-c00f954f31ab")
public static String es_PE_FIELD_Tab_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="cd8d3485-2a25-b45a-8142-c00f954f31ab")
public static String es_PE_FIELD_Tab_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="cd8d3485-2a25-b45a-8142-c00f954f31ab")
public static String es_PE_FIELD_Tab_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="79e5fc71-0ff1-aa88-a74e-9393830dc6d6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cd8d3485-2a25-b45a-8142-c00f954f31ab")
public static final String FIELDNAME_Tab_Description="cd8d3485-2a25-b45a-8142-c00f954f31ab";

@XendraTrl(Identifier="2d56ebff-9957-5006-4a7e-d5e9a957b4f3")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2d56ebff-9957-5006-4a7e-d5e9a957b4f3",
Synchronized="2017-08-05 16:52:52.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Display Logic.
@param DisplayLogic If the Field is displayed, the result determines if the field is actually displayed */
public void setDisplayLogic (String DisplayLogic)
{
if (DisplayLogic != null && DisplayLogic.length() > 2000)
{
log.warning("Length > 2000 - truncated");
DisplayLogic = DisplayLogic.substring(0,1999);
}
set_Value (COLUMNNAME_DisplayLogic, DisplayLogic);
}
/** Get Display Logic.
@return If the Field is displayed, the result determines if the field is actually displayed */
public String getDisplayLogic() 
{
String value = (String)get_Value(COLUMNNAME_DisplayLogic);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="0764995c-d4ac-5ee5-887d-04875de218f9")
public static String es_PE_FIELD_Tab_DisplayLogic_Description="Si el campo es desplegado; el resultado determina si el campo es efectivamente desplegado";

@XendraTrl(Identifier="0764995c-d4ac-5ee5-887d-04875de218f9")
public static String es_PE_FIELD_Tab_DisplayLogic_Help="formato:= <expresion> [<logica> <expresion>] expresion	:= @<contexto>@=<valor> o @<contexto>@!<valor> logica:= <|>|<&>contexto:= cualquier valor global ó de la ventana del contexto		:= secuencia a operadores de la logica:=  Y/O con el previo resultado de izquierda a derecha E";

@XendraTrl(Identifier="0764995c-d4ac-5ee5-887d-04875de218f9")
public static String es_PE_FIELD_Tab_DisplayLogic_Name="Despliegue Lógico";

@XendraField(AD_Column_ID="DisplayLogic",IsCentrallyMaintained=true,
AD_Tab_ID="79e5fc71-0ff1-aa88-a74e-9393830dc6d6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0764995c-d4ac-5ee5-887d-04875de218f9")
public static final String FIELDNAME_Tab_DisplayLogic="0764995c-d4ac-5ee5-887d-04875de218f9";

@XendraTrl(Identifier="d750e689-e51e-ac47-9456-e37427edca38")
public static String es_PE_COLUMN_DisplayLogic_Name="Despliegue Lógico";

@XendraColumn(AD_Element_ID="fcb60996-c818-2f09-e6c4-b7544353cf56",ColumnName="DisplayLogic",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d750e689-e51e-ac47-9456-e37427edca38",
Synchronized="2017-08-05 16:52:52.0")
/** Column name DisplayLogic */
public static final String COLUMNNAME_DisplayLogic = "DisplayLogic";

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

@XendraTrl(Identifier="a855cc12-b56a-3991-3924-06d55b96358d")
public static String es_PE_FIELD_Tab_EntityType_Description="Tipo de Entidad Diccionario; determina propiedad y sincronización";

@XendraTrl(Identifier="a855cc12-b56a-3991-3924-06d55b96358d")
public static String es_PE_FIELD_Tab_EntityType_Help="Los tipos de entidad \"Diccionario\"; \"Adempiere\"; y \"Aplicación\" podrían ser automáticamente sincronizados y las personalizaciones eliminadas ó sobreescritas";

@XendraTrl(Identifier="a855cc12-b56a-3991-3924-06d55b96358d")
public static String es_PE_FIELD_Tab_EntityType_Name="Tipo de Entidad";

@XendraField(AD_Column_ID="EntityType",IsCentrallyMaintained=true,
AD_Tab_ID="79e5fc71-0ff1-aa88-a74e-9393830dc6d6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a855cc12-b56a-3991-3924-06d55b96358d")
public static final String FIELDNAME_Tab_EntityType="a855cc12-b56a-3991-3924-06d55b96358d";

@XendraTrl(Identifier="17426159-08a3-280f-2aa3-ef7c8cefaf56")
public static String es_PE_COLUMN_EntityType_Name="Tipo de Entidad";

@XendraColumn(AD_Element_ID="5ba917bf-871c-6f19-aa50-962adc5de558",ColumnName="EntityType",
AD_Reference_ID=18,AD_Reference_Value_ID="fae4ad31-8ff1-5d5c-8d47-2426c541cd74",AD_Val_Rule_ID="",
FieldLength=4,DefaultValue="U",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="@EntityType@=D",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="17426159-08a3-280f-2aa3-ef7c8cefaf56",Synchronized="2017-08-05 16:52:52.0")
/** Column name EntityType */
public static final String COLUMNNAME_EntityType = "EntityType";
/** Set Has Tree.
@param HasTree Window has Tree Graph */
public void setHasTree (boolean HasTree)
{
set_Value (COLUMNNAME_HasTree, Boolean.valueOf(HasTree));
}
/** Get Has Tree.
@return Window has Tree Graph */
public boolean isHasTree() 
{
Object oo = get_Value(COLUMNNAME_HasTree);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="443e0797-1de5-2c0f-d5fa-24cc7c7760b4")
public static String es_PE_FIELD_Tab_HasTree_Description="La ventana tiene gráfica de árbol";

@XendraTrl(Identifier="443e0797-1de5-2c0f-d5fa-24cc7c7760b4")
public static String es_PE_FIELD_Tab_HasTree_Help="El cuadro de verificación contiene árbol indica si esta ventana despliega una metáfora de árbol";

@XendraTrl(Identifier="443e0797-1de5-2c0f-d5fa-24cc7c7760b4")
public static String es_PE_FIELD_Tab_HasTree_Name="Contiene Árbol";

@XendraField(AD_Column_ID="HasTree",IsCentrallyMaintained=true,
AD_Tab_ID="79e5fc71-0ff1-aa88-a74e-9393830dc6d6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="443e0797-1de5-2c0f-d5fa-24cc7c7760b4")
public static final String FIELDNAME_Tab_HasTree="443e0797-1de5-2c0f-d5fa-24cc7c7760b4";

@XendraTrl(Identifier="db9242b8-ee6c-3de5-e132-0d349ed2e323")
public static String es_PE_COLUMN_HasTree_Name="Contiene Árbol";

@XendraColumn(AD_Element_ID="6eb4f0f1-791d-d6c6-b488-ca12762eac1f",ColumnName="HasTree",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="db9242b8-ee6c-3de5-e132-0d349ed2e323",
Synchronized="2017-08-05 16:52:52.0")
/** Column name HasTree */
public static final String COLUMNNAME_HasTree = "HasTree";
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

@XendraTrl(Identifier="e8348065-5082-bf34-209b-7f2a90fb820b")
public static String es_PE_FIELD_Tab_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="e8348065-5082-bf34-209b-7f2a90fb820b")
public static String es_PE_FIELD_Tab_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="e8348065-5082-bf34-209b-7f2a90fb820b")
public static String es_PE_FIELD_Tab_CommentHelp_Name="Ayuda";
@XendraField(AD_Column_ID="Help",
IsCentrallyMaintained=true,AD_Tab_ID="79e5fc71-0ff1-aa88-a74e-9393830dc6d6",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="e8348065-5082-bf34-209b-7f2a90fb820b")
public static final String FIELDNAME_Tab_CommentHelp="e8348065-5082-bf34-209b-7f2a90fb820b";

@XendraTrl(Identifier="40a4530f-7d10-f4e1-8cf9-1610e6cb7a0e")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="40a4530f-7d10-f4e1-8cf9-1610e6cb7a0e",
Synchronized="2017-08-05 16:52:52.0")
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
@XendraTrl(Identifier="927d0e0e-4bf0-44ff-9cef-33a09d6f19d6")
public static String es_PE_FIELD_Tab_Identifier_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="79e5fc71-0ff1-aa88-a74e-9393830dc6d6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=36,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-04-01 11:42:58.0",
Identifier="927d0e0e-4bf0-44ff-9cef-33a09d6f19d6")
public static final String FIELDNAME_Tab_Identifier="927d0e0e-4bf0-44ff-9cef-33a09d6f19d6";

@XendraTrl(Identifier="6cd3825a-60ae-561c-e33a-61416999fb19")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6cd3825a-60ae-561c-e33a-61416999fb19",
Synchronized="2017-08-05 16:52:52.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Import Fields.
@param ImportFields Create Fields from Table Columns */
public void setImportFields (String ImportFields)
{
if (ImportFields != null && ImportFields.length() > 1)
{
log.warning("Length > 1 - truncated");
ImportFields = ImportFields.substring(0,0);
}
set_Value (COLUMNNAME_ImportFields, ImportFields);
}
/** Get Import Fields.
@return Create Fields from Table Columns */
public String getImportFields() 
{
return (String)get_Value(COLUMNNAME_ImportFields);
}

@XendraTrl(Identifier="f8cf6650-a96b-5442-f0ef-bb743a828758")
public static String es_PE_FIELD_Tab_ImportFields_Description="Crear campo desde la tabla; la cual no existe aun en la pestaña";

@XendraTrl(Identifier="f8cf6650-a96b-5442-f0ef-bb743a828758")
public static String es_PE_FIELD_Tab_ImportFields_Help="Basado en la tabla de esta pestaña; este procedimiento crea los campos faltantes";

@XendraTrl(Identifier="f8cf6650-a96b-5442-f0ef-bb743a828758")
public static String es_PE_FIELD_Tab_ImportFields_Name="Crear Campos";

@XendraField(AD_Column_ID="ImportFields",IsCentrallyMaintained=true,
AD_Tab_ID="79e5fc71-0ff1-aa88-a74e-9393830dc6d6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=320,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f8cf6650-a96b-5442-f0ef-bb743a828758")
public static final String FIELDNAME_Tab_ImportFields="f8cf6650-a96b-5442-f0ef-bb743a828758";

@XendraTrl(Identifier="fa77ea84-1628-2a5d-3007-8a55db1b3da4")
public static String es_PE_COLUMN_ImportFields_Name="Importar Campos";

@XendraColumn(AD_Element_ID="1f894785-6b47-f14c-388d-8b8776ec6633",ColumnName="ImportFields",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="aa07b771-26a1-2115-5a8c-2761edd6e6cf",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="fa77ea84-1628-2a5d-3007-8a55db1b3da4",Synchronized="2017-08-05 16:52:52.0")
/** Column name ImportFields */
public static final String COLUMNNAME_ImportFields = "ImportFields";

/** Included_Tab_ID AD_Reference=94560dd8-5e1e-7f77-bc05-3ae635c92f61 */
public static final int INCLUDED_TAB_ID_AD_Reference_ID=278;
/** Set Included Tab.
@param Included_Tab_ID Included Tab in this Tab (Master Dateail) */
public void setIncluded_Tab_ID (int Included_Tab_ID)
{
if (Included_Tab_ID <= 0) set_Value (COLUMNNAME_Included_Tab_ID, null);
 else 
set_Value (COLUMNNAME_Included_Tab_ID, Integer.valueOf(Included_Tab_ID));
}
/** Get Included Tab.
@return Included Tab in this Tab (Master Dateail) */
public int getIncluded_Tab_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Included_Tab_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="eba360f7-0627-4a37-b7a8-8e8355342138")
public static String es_PE_FIELD_Tab_IncludedTab_Description="Pestaña incluida en esta pestaña (Maestro Detalle)";

@XendraTrl(Identifier="eba360f7-0627-4a37-b7a8-8e8355342138")
public static String es_PE_FIELD_Tab_IncludedTab_Help="Usted puede incluir una pestaña en esta pestaña. Si está exhibido en solo expediente de la fila, La pestaña incluida se exhibe como tabla de la multi-fila.";

@XendraTrl(Identifier="eba360f7-0627-4a37-b7a8-8e8355342138")
public static String es_PE_FIELD_Tab_IncludedTab_Name="Pestaña Incluida";

@XendraField(AD_Column_ID="Included_Tab_ID",IsCentrallyMaintained=true,
AD_Tab_ID="79e5fc71-0ff1-aa88-a74e-9393830dc6d6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=340,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-04-01 11:42:58.0",
Identifier="eba360f7-0627-4a37-b7a8-8e8355342138")
public static final String FIELDNAME_Tab_IncludedTab="eba360f7-0627-4a37-b7a8-8e8355342138";

@XendraTrl(Identifier="a6aad272-f16f-0aca-2981-b526169f9175")
public static String es_PE_FIELD_Field_IncludedTab_Description="Pestaña incluida en esta pestaña (Maestro Detalle)";

@XendraTrl(Identifier="a6aad272-f16f-0aca-2981-b526169f9175")
public static String es_PE_FIELD_Field_IncludedTab_Help="Usted puede incluir una pestaña en esta pestaña. Si está exhibido en solo expediente de la fila, La pestaña incluida se exhibe como tabla de la multi-fila.";

@XendraTrl(Identifier="a6aad272-f16f-0aca-2981-b526169f9175")
public static String es_PE_FIELD_Field_IncludedTab_Name="Pestaña Incluida";

@XendraField(AD_Column_ID="Included_Tab_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7f8d217e-6d6a-339b-e946-58bae65bed6b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a6aad272-f16f-0aca-2981-b526169f9175")
public static final String FIELDNAME_Field_IncludedTab="a6aad272-f16f-0aca-2981-b526169f9175";

@XendraTrl(Identifier="c3fe0987-cd12-1d02-446f-2ab5484f3360")
public static String es_PE_COLUMN_Included_Tab_ID_Name="Pestaña Incluida";

@XendraColumn(AD_Element_ID="037f5040-b11d-f7ef-7ff9-611d1192edc0",ColumnName="Included_Tab_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="94560dd8-5e1e-7f77-bc05-3ae635c92f61",
AD_Val_Rule_ID="a240a421-ee6e-2b39-66f7-adbad5ad1f51",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c3fe0987-cd12-1d02-446f-2ab5484f3360",
Synchronized="2017-08-05 16:52:52.0")
/** Column name Included_Tab_ID */
public static final String COLUMNNAME_Included_Tab_ID = "Included_Tab_ID";
/** Set Advanced Tab.
@param IsAdvancedTab This Tab contains advanced Functionality */
public void setIsAdvancedTab (boolean IsAdvancedTab)
{
set_Value (COLUMNNAME_IsAdvancedTab, Boolean.valueOf(IsAdvancedTab));
}
/** Get Advanced Tab.
@return This Tab contains advanced Functionality */
public boolean isAdvancedTab() 
{
Object oo = get_Value(COLUMNNAME_IsAdvancedTab);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="37946a89-89fb-22d7-4b8c-abb49234ab5e")
public static String es_PE_FIELD_Tab_AdvancedTab_Description="En esta pestaña contiene funcionalidades avanzadas.";

@XendraTrl(Identifier="37946a89-89fb-22d7-4b8c-abb49234ab5e")
public static String es_PE_FIELD_Tab_AdvancedTab_Help="La pestaña con funcionalidades avanzadas solo es desplegada cuando es activada en Herramientas>Preferencias.";

@XendraTrl(Identifier="37946a89-89fb-22d7-4b8c-abb49234ab5e")
public static String es_PE_FIELD_Tab_AdvancedTab_Name="Pestaña Avanzada";

@XendraField(AD_Column_ID="IsAdvancedTab",IsCentrallyMaintained=true,
AD_Tab_ID="79e5fc71-0ff1-aa88-a74e-9393830dc6d6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="37946a89-89fb-22d7-4b8c-abb49234ab5e")
public static final String FIELDNAME_Tab_AdvancedTab="37946a89-89fb-22d7-4b8c-abb49234ab5e";

@XendraTrl(Identifier="ba696482-0156-7d16-6029-76a12421e25b")
public static String es_PE_COLUMN_IsAdvancedTab_Name="Pestaña Avanzada";

@XendraColumn(AD_Element_ID="2a98fb59-b4ab-eeba-d9ee-61bb9f904772",ColumnName="IsAdvancedTab",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ba696482-0156-7d16-6029-76a12421e25b",
Synchronized="2017-08-05 16:52:52.0")
/** Column name IsAdvancedTab */
public static final String COLUMNNAME_IsAdvancedTab = "IsAdvancedTab";
/** Set Accounting Tab.
@param IsInfoTab This Tab contains accounting information */
public void setIsInfoTab (boolean IsInfoTab)
{
set_Value (COLUMNNAME_IsInfoTab, Boolean.valueOf(IsInfoTab));
}
/** Get Accounting Tab.
@return This Tab contains accounting information */
public boolean isInfoTab() 
{
Object oo = get_Value(COLUMNNAME_IsInfoTab);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="77e6c280-15ca-3929-7b3c-2e84da9c4fcc")
public static String es_PE_FIELD_Tab_AccountingTab_Description="Esta pestaña contiene información contable";

@XendraTrl(Identifier="77e6c280-15ca-3929-7b3c-2e84da9c4fcc")
public static String es_PE_FIELD_Tab_AccountingTab_Help="El cuadro de verificación pestaña contable indica si esta ventana contiene información contable.";

@XendraTrl(Identifier="77e6c280-15ca-3929-7b3c-2e84da9c4fcc")
public static String es_PE_FIELD_Tab_AccountingTab_Name="Pestaña Contable";

@XendraField(AD_Column_ID="IsInfoTab",IsCentrallyMaintained=true,
AD_Tab_ID="79e5fc71-0ff1-aa88-a74e-9393830dc6d6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="77e6c280-15ca-3929-7b3c-2e84da9c4fcc")
public static final String FIELDNAME_Tab_AccountingTab="77e6c280-15ca-3929-7b3c-2e84da9c4fcc";

@XendraTrl(Identifier="5b990ed5-4f29-1680-f92a-6b44eab526fc")
public static String es_PE_COLUMN_IsInfoTab_Name="Pestaña Contable";

@XendraColumn(AD_Element_ID="cade7a81-614d-c93e-7e3a-bf6e8e73fcfd",ColumnName="IsInfoTab",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5b990ed5-4f29-1680-f92a-6b44eab526fc",
Synchronized="2017-08-05 16:52:52.0")
/** Column name IsInfoTab */
public static final String COLUMNNAME_IsInfoTab = "IsInfoTab";
/** Set Insert Record.
@param IsInsertRecord The user can insert a new Record */
public void setIsInsertRecord (boolean IsInsertRecord)
{
set_Value (COLUMNNAME_IsInsertRecord, Boolean.valueOf(IsInsertRecord));
}
/** Get Insert Record.
@return The user can insert a new Record */
public boolean isInsertRecord() 
{
Object oo = get_Value(COLUMNNAME_IsInsertRecord);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="37ff45c8-eef4-5e17-6bce-42783f9b36d3")
public static String es_PE_FIELD_Tab_InsertRecord_Description="El usuario puede insertar un nuevo registro.";

@XendraTrl(Identifier="37ff45c8-eef4-5e17-6bce-42783f9b36d3")
public static String es_PE_FIELD_Tab_InsertRecord_Help="Si no esta seleccionado, el usuario no puede crear un nuevo registro. Esto se inhabilita automáticamente, si la lengüeta se lee solamente.";

@XendraTrl(Identifier="37ff45c8-eef4-5e17-6bce-42783f9b36d3")
public static String es_PE_FIELD_Tab_InsertRecord_Name="Ingresa Registros";

@XendraField(AD_Column_ID="IsInsertRecord",IsCentrallyMaintained=true,
AD_Tab_ID="79e5fc71-0ff1-aa88-a74e-9393830dc6d6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsReadOnly@=N",DisplayLength=1,IsReadOnly=false,SeqNo=260,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="37ff45c8-eef4-5e17-6bce-42783f9b36d3")
public static final String FIELDNAME_Tab_InsertRecord="37ff45c8-eef4-5e17-6bce-42783f9b36d3";

@XendraTrl(Identifier="81ed0513-08ac-0179-9417-834e5a1e5594")
public static String es_PE_COLUMN_IsInsertRecord_Name="Ingresa Registros";

@XendraColumn(AD_Element_ID="a511321d-bf4f-54f4-b3ec-7792519604fa",ColumnName="IsInsertRecord",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="81ed0513-08ac-0179-9417-834e5a1e5594",
Synchronized="2017-08-05 16:52:52.0")
/** Column name IsInsertRecord */
public static final String COLUMNNAME_IsInsertRecord = "IsInsertRecord";
/** Set Read Only.
@param IsReadOnly Field is read only */
public void setIsReadOnly (boolean IsReadOnly)
{
set_Value (COLUMNNAME_IsReadOnly, Boolean.valueOf(IsReadOnly));
}
/** Get Read Only.
@return Field is read only */
public boolean isReadOnly() 
{
Object oo = get_Value(COLUMNNAME_IsReadOnly);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="27a4f1ab-702e-7b58-b9bc-9b0f48760834")
public static String es_PE_FIELD_Tab_ReadOnly_Description="El campo es de sólo lectura";

@XendraTrl(Identifier="27a4f1ab-702e-7b58-b9bc-9b0f48760834")
public static String es_PE_FIELD_Tab_ReadOnly_Help="El sólo lectura indica que este campo solamente puede ser leído. No puede ser actualizado.";

@XendraTrl(Identifier="27a4f1ab-702e-7b58-b9bc-9b0f48760834")
public static String es_PE_FIELD_Tab_ReadOnly_Name="Sólo Lectura";

@XendraField(AD_Column_ID="IsReadOnly",IsCentrallyMaintained=true,
AD_Tab_ID="79e5fc71-0ff1-aa88-a74e-9393830dc6d6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=250,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="27a4f1ab-702e-7b58-b9bc-9b0f48760834")
public static final String FIELDNAME_Tab_ReadOnly="27a4f1ab-702e-7b58-b9bc-9b0f48760834";

@XendraTrl(Identifier="0b02096a-89fb-cffa-f1d5-acab961c92ce")
public static String es_PE_COLUMN_IsReadOnly_Name="Sólo Lectura";

@XendraColumn(AD_Element_ID="91b664da-9e5a-8ff7-2fef-8042ee7fb0c2",ColumnName="IsReadOnly",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0b02096a-89fb-cffa-f1d5-acab961c92ce",
Synchronized="2017-08-05 16:52:52.0")
/** Column name IsReadOnly */
public static final String COLUMNNAME_IsReadOnly = "IsReadOnly";
/** Set Single Row Layout.
@param IsSingleRow Default for toggle between Single- and Multi-Row (Grid) Layout */
public void setIsSingleRow (boolean IsSingleRow)
{
set_Value (COLUMNNAME_IsSingleRow, Boolean.valueOf(IsSingleRow));
}
/** Get Single Row Layout.
@return Default for toggle between Single- and Multi-Row (Grid) Layout */
public boolean isSingleRow() 
{
Object oo = get_Value(COLUMNNAME_IsSingleRow);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="3dfaccf5-320f-04df-c077-8ac6eef9f583")
public static String es_PE_FIELD_Tab_SingleRowLayout_Description="Predeterminado para intercambiar entre la disposición simple y la de renglón múltiple (emparrillado)";

@XendraTrl(Identifier="3dfaccf5-320f-04df-c077-8ac6eef9f583")
public static String es_PE_FIELD_Tab_SingleRowLayout_Help="El cuadro de verificación disposición de renglón simple indica si el tipo de despliegue predeterminado para esta ventana es un renglón simple en contraposición con múltiples renglones.";

@XendraTrl(Identifier="3dfaccf5-320f-04df-c077-8ac6eef9f583")
public static String es_PE_FIELD_Tab_SingleRowLayout_Name="Disposición de Renglón Simple";

@XendraField(AD_Column_ID="IsSingleRow",IsCentrallyMaintained=true,
AD_Tab_ID="79e5fc71-0ff1-aa88-a74e-9393830dc6d6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3dfaccf5-320f-04df-c077-8ac6eef9f583")
public static final String FIELDNAME_Tab_SingleRowLayout="3dfaccf5-320f-04df-c077-8ac6eef9f583";

@XendraTrl(Identifier="c9949000-82c6-1924-e8b1-7c3a3ee6a4e3")
public static String es_PE_COLUMN_IsSingleRow_Name="Disposición de Renglón Simple";

@XendraColumn(AD_Element_ID="ffb47010-05a1-3a90-f054-5d6fcc0a411f",ColumnName="IsSingleRow",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c9949000-82c6-1924-e8b1-7c3a3ee6a4e3",
Synchronized="2017-08-05 16:52:52.0")
/** Column name IsSingleRow */
public static final String COLUMNNAME_IsSingleRow = "IsSingleRow";
/** Set Order Tab.
@param IsSortTab The Tab determines the Order */
public void setIsSortTab (boolean IsSortTab)
{
set_Value (COLUMNNAME_IsSortTab, Boolean.valueOf(IsSortTab));
}
/** Get Order Tab.
@return The Tab determines the Order */
public boolean isSortTab() 
{
Object oo = get_Value(COLUMNNAME_IsSortTab);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="5e56e508-2e85-773d-f743-6591e8afcf22")
public static String es_PE_FIELD_Tab_OrderTab_Description="La pestaña determina el orden";

@XendraTrl(Identifier="5e56e508-2e85-773d-f743-6591e8afcf22")
public static String es_PE_FIELD_Tab_OrderTab_Name="Pestaña de Orden";

@XendraField(AD_Column_ID="IsSortTab",IsCentrallyMaintained=true,
AD_Tab_ID="79e5fc71-0ff1-aa88-a74e-9393830dc6d6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5e56e508-2e85-773d-f743-6591e8afcf22")
public static final String FIELDNAME_Tab_OrderTab="5e56e508-2e85-773d-f743-6591e8afcf22";

@XendraTrl(Identifier="1df8a20c-e92d-bed0-0a53-a41e100ea51a")
public static String es_PE_COLUMN_IsSortTab_Name="Pestaña de Orden";

@XendraColumn(AD_Element_ID="122a780f-4602-8b27-b004-79c4e0e88538",ColumnName="IsSortTab",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1df8a20c-e92d-bed0-0a53-a41e100ea51a",
Synchronized="2017-08-05 16:52:52.0")
/** Column name IsSortTab */
public static final String COLUMNNAME_IsSortTab = "IsSortTab";
/** Set TranslationTab.
@param IsTranslationTab This Tab contains translation information */
public void setIsTranslationTab (boolean IsTranslationTab)
{
set_Value (COLUMNNAME_IsTranslationTab, Boolean.valueOf(IsTranslationTab));
}
/** Get TranslationTab.
@return This Tab contains translation information */
public boolean isTranslationTab() 
{
Object oo = get_Value(COLUMNNAME_IsTranslationTab);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="da441b79-8c0e-36c0-b3a7-36c6168b3f17")
public static String es_PE_FIELD_Tab_TranslationTab_Description="Esta pestaña contiene información de traducción.";

@XendraTrl(Identifier="da441b79-8c0e-36c0-b3a7-36c6168b3f17")
public static String es_PE_FIELD_Tab_TranslationTab_Help="El cuadro de verificación de pestaña de traducción indica si una pestaña contiene información de traducción.";

@XendraTrl(Identifier="da441b79-8c0e-36c0-b3a7-36c6168b3f17")
public static String es_PE_FIELD_Tab_TranslationTab_Name="Pestaña de Traducción";

@XendraField(AD_Column_ID="IsTranslationTab",IsCentrallyMaintained=true,
AD_Tab_ID="79e5fc71-0ff1-aa88-a74e-9393830dc6d6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="da441b79-8c0e-36c0-b3a7-36c6168b3f17")
public static final String FIELDNAME_Tab_TranslationTab="da441b79-8c0e-36c0-b3a7-36c6168b3f17";

@XendraTrl(Identifier="2ec7c3fb-6eb8-443e-cbb8-b4319c9c429c")
public static String es_PE_COLUMN_IsTranslationTab_Name="Pestaña de Traducción";

@XendraColumn(AD_Element_ID="78edb8c8-3d3c-083b-3c22-ddec22383767",ColumnName="IsTranslationTab",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2ec7c3fb-6eb8-443e-cbb8-b4319c9c429c",
Synchronized="2017-08-05 16:52:52.0")
/** Column name IsTranslationTab */
public static final String COLUMNNAME_IsTranslationTab = "IsTranslationTab";
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

@XendraTrl(Identifier="d0cdb7c7-a68b-2911-17ec-c4eeaecaae73")
public static String es_PE_FIELD_Tab_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="d0cdb7c7-a68b-2911-17ec-c4eeaecaae73")
public static String es_PE_FIELD_Tab_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="d0cdb7c7-a68b-2911-17ec-c4eeaecaae73")
public static String es_PE_FIELD_Tab_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="79e5fc71-0ff1-aa88-a74e-9393830dc6d6",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="d0cdb7c7-a68b-2911-17ec-c4eeaecaae73")
public static final String FIELDNAME_Tab_Name="d0cdb7c7-a68b-2911-17ec-c4eeaecaae73";

@XendraTrl(Identifier="2af4523b-88b9-b986-8fac-95c4c6c06247")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2af4523b-88b9-b986-8fac-95c4c6c06247",
Synchronized="2017-08-05 16:52:52.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Sql ORDER BY.
@param OrderByClause Fully qualified ORDER BY clause */
public void setOrderByClause (String OrderByClause)
{
if (OrderByClause != null && OrderByClause.length() > 2000)
{
log.warning("Length > 2000 - truncated");
OrderByClause = OrderByClause.substring(0,1999);
}
set_Value (COLUMNNAME_OrderByClause, OrderByClause);
}
/** Get Sql ORDER BY.
@return Fully qualified ORDER BY clause */
public String getOrderByClause() 
{
String value = (String)get_Value(COLUMNNAME_OrderByClause);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="331f5af8-d160-58c3-7cdf-48228e988193")
public static String es_PE_FIELD_Tab_SqlORDERBY_Description="Cláusula completamente calificada ORDER BY";

@XendraTrl(Identifier="331f5af8-d160-58c3-7cdf-48228e988193")
public static String es_PE_FIELD_Tab_SqlORDERBY_Help="La cláusula ORDER BY indica la cláusula SQL ORDER BY a usar para la selección del registro";

@XendraTrl(Identifier="331f5af8-d160-58c3-7cdf-48228e988193")
public static String es_PE_FIELD_Tab_SqlORDERBY_Name="Cláusula ORDER BY SQL";

@XendraField(AD_Column_ID="OrderByClause",IsCentrallyMaintained=true,
AD_Tab_ID="79e5fc71-0ff1-aa88-a74e-9393830dc6d6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=300,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="331f5af8-d160-58c3-7cdf-48228e988193")
public static final String FIELDNAME_Tab_SqlORDERBY="331f5af8-d160-58c3-7cdf-48228e988193";

@XendraTrl(Identifier="08a1855f-eff9-7cc6-9411-13ea6c61c0e0")
public static String es_PE_COLUMN_OrderByClause_Name="Cláusula ORDER BY SQL";

@XendraColumn(AD_Element_ID="32eea30b-0ac3-b494-48bb-535e80217e7e",ColumnName="OrderByClause",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="08a1855f-eff9-7cc6-9411-13ea6c61c0e0",
Synchronized="2017-08-05 16:52:52.0")
/** Column name OrderByClause */
public static final String COLUMNNAME_OrderByClause = "OrderByClause";

/** Parent_Column_ID AD_Reference=06ce5e33-2936-71a4-56b8-5876a5a39218 */
public static final int PARENT_COLUMN_ID_AD_Reference_ID=251;
/** Set Parent Column.
@param Parent_Column_ID The link column on the parent tab. */
public void setParent_Column_ID (int Parent_Column_ID)
{
if (Parent_Column_ID <= 0) set_Value (COLUMNNAME_Parent_Column_ID, null);
 else 
set_Value (COLUMNNAME_Parent_Column_ID, Integer.valueOf(Parent_Column_ID));
}
/** Get Parent Column.
@return The link column on the parent tab. */
public int getParent_Column_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Parent_Column_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="79c383bd-5fbc-94ac-1c46-e58621c9513c")
public static String es_PE_FIELD_Tab_ParentColumn_Description="The link column on the parenttab.";

@XendraTrl(Identifier="79c383bd-5fbc-94ac-1c46-e58621c9513c")
public static String es_PE_FIELD_Tab_ParentColumn_Name="ParentColumn";

@XendraField(AD_Column_ID="Parent_Column_ID",IsCentrallyMaintained=true,
AD_Tab_ID="79e5fc71-0ff1-aa88-a74e-9393830dc6d6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="79c383bd-5fbc-94ac-1c46-e58621c9513c")
public static final String FIELDNAME_Tab_ParentColumn="79c383bd-5fbc-94ac-1c46-e58621c9513c";

@XendraTrl(Identifier="56cf18c9-d4d2-d2f9-9bdf-627244788c3e")
public static String es_PE_COLUMN_Parent_Column_ID_Name="ParentColumn";

@XendraColumn(AD_Element_ID="0f5418bb-d3b7-9f3f-0a5b-9b006f7987b1",ColumnName="Parent_Column_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="06ce5e33-2936-71a4-56b8-5876a5a39218",
AD_Val_Rule_ID="d736c9db-20af-3ddc-4fce-973e4186cd43",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=true,Identifier="56cf18c9-d4d2-d2f9-9bdf-627244788c3e",
Synchronized="2017-08-05 16:52:52.0")
/** Column name Parent_Column_ID */
public static final String COLUMNNAME_Parent_Column_ID = "Parent_Column_ID";
/** Set Process Now.
@param Processing Process Now */
public void setProcessing (boolean Processing)
{
set_Value (COLUMNNAME_Processing, Boolean.valueOf(Processing));
}
/** Get Process Now.
@return Process Now */
public boolean isProcessing() 
{
Object oo = get_Value(COLUMNNAME_Processing);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="c54ddc74-3d00-9618-e9ef-fda5cdc4c161")
public static String es_PE_FIELD_Tab_ProcessNow_Help="Copiar campos a la pestaña";

@XendraTrl(Identifier="c54ddc74-3d00-9618-e9ef-fda5cdc4c161")
public static String es_PE_FIELD_Tab_ProcessNow_Name="Copiar Pestañas";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="79e5fc71-0ff1-aa88-a74e-9393830dc6d6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=330,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c54ddc74-3d00-9618-e9ef-fda5cdc4c161")
public static final String FIELDNAME_Tab_ProcessNow="c54ddc74-3d00-9618-e9ef-fda5cdc4c161";

@XendraTrl(Identifier="44d4f1d4-a8dc-7cb5-2be5-217d22ee3e9d")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="db21ba86-27b8-f055-c42b-a2731f13fcc9",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="44d4f1d4-a8dc-7cb5-2be5-217d22ee3e9d",Synchronized="2017-08-05 16:52:52.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Read Only Logic.
@param ReadOnlyLogic Logic to determine if field is read only (applies only when field is read-write) */
public void setReadOnlyLogic (String ReadOnlyLogic)
{
if (ReadOnlyLogic != null && ReadOnlyLogic.length() > 2000)
{
log.warning("Length > 2000 - truncated");
ReadOnlyLogic = ReadOnlyLogic.substring(0,1999);
}
set_Value (COLUMNNAME_ReadOnlyLogic, ReadOnlyLogic);
}
/** Get Read Only Logic.
@return Logic to determine if field is read only (applies only when field is read-write) */
public String getReadOnlyLogic() 
{
String value = (String)get_Value(COLUMNNAME_ReadOnlyLogic);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="13180b01-f027-58c2-c47b-b3ca007ebdaa")
public static String es_PE_FIELD_Tab_ReadOnlyLogic_Description="Lógica para determinar si el campo es de sólo lectura (aplica solamente cuando el campo es lectura-escritura";

@XendraTrl(Identifier="13180b01-f027-58c2-c47b-b3ca007ebdaa")
public static String es_PE_FIELD_Tab_ReadOnlyLogic_Name="Lógica de Solo Lectura";

@XendraField(AD_Column_ID="ReadOnlyLogic",IsCentrallyMaintained=true,
AD_Tab_ID="79e5fc71-0ff1-aa88-a74e-9393830dc6d6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsReadOnly@=N",DisplayLength=60,IsReadOnly=false,SeqNo=270,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="13180b01-f027-58c2-c47b-b3ca007ebdaa")
public static final String FIELDNAME_Tab_ReadOnlyLogic="13180b01-f027-58c2-c47b-b3ca007ebdaa";

@XendraTrl(Identifier="bc62e76e-b2f0-b7fc-1965-623c7ec7c6f6")
public static String es_PE_COLUMN_ReadOnlyLogic_Name="Lógica de Solo Lectura";

@XendraColumn(AD_Element_ID="935267fb-b81e-300a-5bc2-f3c4b02f4d5d",ColumnName="ReadOnlyLogic",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bc62e76e-b2f0-b7fc-1965-623c7ec7c6f6",
Synchronized="2017-08-05 16:52:52.0")
/** Column name ReadOnlyLogic */
public static final String COLUMNNAME_ReadOnlyLogic = "ReadOnlyLogic";
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

@XendraTrl(Identifier="3729a0ff-b8af-7166-a38f-0706c1d6de24")
public static String es_PE_FIELD_Tab_Sequence_Description="Método de ordenar registros; el número más bajo viene primero";

@XendraTrl(Identifier="3729a0ff-b8af-7166-a38f-0706c1d6de24")
public static String es_PE_FIELD_Tab_Sequence_Help="La Secuencia indica el orden de los registros";

@XendraTrl(Identifier="3729a0ff-b8af-7166-a38f-0706c1d6de24")
public static String es_PE_FIELD_Tab_Sequence_Name="Secuencia";
@XendraField(AD_Column_ID="SeqNo",
IsCentrallyMaintained=true,AD_Tab_ID="79e5fc71-0ff1-aa88-a74e-9393830dc6d6",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=100,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="3729a0ff-b8af-7166-a38f-0706c1d6de24")
public static final String FIELDNAME_Tab_Sequence="3729a0ff-b8af-7166-a38f-0706c1d6de24";

@XendraTrl(Identifier="1e536e10-d08f-ee8e-7a96-2524aeedd51e")
public static String es_PE_COLUMN_SeqNo_Name="Secuencia";

@XendraColumn(AD_Element_ID="38fa26fe-b59d-fce1-c129-420b57da738b",ColumnName="SeqNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@SQL=SELECT COALESCE(MAX(SeqNo),0)+10 AS DefaultValue FROM AD_Tab WHERE AD_Window_ID=@AD_Window_ID@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1e536e10-d08f-ee8e-7a96-2524aeedd51e",
Synchronized="2017-08-05 16:52:52.0")
/** Column name SeqNo */
public static final String COLUMNNAME_SeqNo = "SeqNo";
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

@XendraTrl(Identifier="8dd06726-54ec-44bd-8d13-c1adc390626c")
public static String es_PE_FIELD_Tab_Synchronized_Name="Synchronized";

@XendraField(AD_Column_ID="Synchronized",IsCentrallyMaintained=true,
AD_Tab_ID="79e5fc71-0ff1-aa88-a74e-9393830dc6d6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=29,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-04-01 11:42:58.0",
Identifier="8dd06726-54ec-44bd-8d13-c1adc390626c")
public static final String FIELDNAME_Tab_Synchronized="8dd06726-54ec-44bd-8d13-c1adc390626c";

@XendraTrl(Identifier="ea71391b-7203-87e7-6d09-a6df3e122881")
public static String es_PE_COLUMN_Synchronized_Name="Synchronized";

@XendraColumn(AD_Element_ID="08f1e976-ceeb-f830-9d75-bf94f13a98ce",ColumnName="Synchronized",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ea71391b-7203-87e7-6d09-a6df3e122881",
Synchronized="2017-08-05 16:52:52.0")
/** Column name Synchronized */
public static final String COLUMNNAME_Synchronized = "Synchronized";
/** Set Tab Level.
@param TabLevel Hierarchical Tab Level (0 = top) */
public void setTabLevel (int TabLevel)
{
set_Value (COLUMNNAME_TabLevel, Integer.valueOf(TabLevel));
}
/** Get Tab Level.
@return Hierarchical Tab Level (0 = top) */
public int getTabLevel() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_TabLevel);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3aaafc47-eba2-2efa-d4f8-a90a1ce74b73")
public static String es_PE_FIELD_Tab_TabLevel_Description="Nivel de pestaña jerárquico";

@XendraTrl(Identifier="3aaafc47-eba2-2efa-d4f8-a90a1ce74b73")
public static String es_PE_FIELD_Tab_TabLevel_Help="Nivel Jerárquico de la pestaña. Si el nivel es 0; es la entidad superior. Entidades de nivel 1 son dependientes del nivel 0 etc.";

@XendraTrl(Identifier="3aaafc47-eba2-2efa-d4f8-a90a1ce74b73")
public static String es_PE_FIELD_Tab_TabLevel_Name="Nivel de Pestaña";

@XendraField(AD_Column_ID="TabLevel",IsCentrallyMaintained=true,
AD_Tab_ID="79e5fc71-0ff1-aa88-a74e-9393830dc6d6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3aaafc47-eba2-2efa-d4f8-a90a1ce74b73")
public static final String FIELDNAME_Tab_TabLevel="3aaafc47-eba2-2efa-d4f8-a90a1ce74b73";

@XendraTrl(Identifier="5442c62a-3d29-863c-a7d8-893d57dbbada")
public static String es_PE_COLUMN_TabLevel_Name="Nivel de Pestaña";

@XendraColumn(AD_Element_ID="9fd1fa87-f0ad-359c-10bb-d8f914a982a4",ColumnName="TabLevel",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="0",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5442c62a-3d29-863c-a7d8-893d57dbbada",
Synchronized="2017-08-05 16:52:52.0")
/** Column name TabLevel */
public static final String COLUMNNAME_TabLevel = "TabLevel";
/** Set Sql WHERE.
@param WhereClause Fully qualified SQL WHERE clause */
public void setWhereClause (String WhereClause)
{
if (WhereClause != null && WhereClause.length() > 2000)
{
log.warning("Length > 2000 - truncated");
WhereClause = WhereClause.substring(0,1999);
}
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
@XendraTrl(Identifier="112858b8-b921-0226-8ab4-5ced9057f1ff")
public static String es_PE_FIELD_Tab_SqlWHERE_Description="Cláusula WHERE completamente calificada";

@XendraTrl(Identifier="112858b8-b921-0226-8ab4-5ced9057f1ff")
public static String es_PE_FIELD_Tab_SqlWHERE_Help="La cláusula Where indica la cláusula SQL WHERE a usar para la selección del registro";

@XendraTrl(Identifier="112858b8-b921-0226-8ab4-5ced9057f1ff")
public static String es_PE_FIELD_Tab_SqlWHERE_Name="Cláusula Where SQL";

@XendraField(AD_Column_ID="WhereClause",IsCentrallyMaintained=true,
AD_Tab_ID="79e5fc71-0ff1-aa88-a74e-9393830dc6d6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=290,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="112858b8-b921-0226-8ab4-5ced9057f1ff")
public static final String FIELDNAME_Tab_SqlWHERE="112858b8-b921-0226-8ab4-5ced9057f1ff";

@XendraTrl(Identifier="f8dde874-c61a-949a-1b94-51d4f7e34726")
public static String es_PE_COLUMN_WhereClause_Name="Cláusula Where SQL";

@XendraColumn(AD_Element_ID="7528e2a5-0b7f-8c17-e919-8343497249ca",ColumnName="WhereClause",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f8dde874-c61a-949a-1b94-51d4f7e34726",
Synchronized="2017-08-05 16:52:52.0")
/** Column name WhereClause */
public static final String COLUMNNAME_WhereClause = "WhereClause";
}
