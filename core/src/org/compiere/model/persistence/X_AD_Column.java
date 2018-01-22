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
import org.compiere.model.reference.REF_AD_ColumnEncrypted;
/** Generated Model for AD_Column
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Column extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Column_ID id
@param trxName transaction
*/
public X_AD_Column (Properties ctx, int AD_Column_ID, String trxName)
{
super (ctx, AD_Column_ID, trxName);
/** if (AD_Column_ID == 0)
{
setAD_Column_ID (0);
setAD_Element_ID (0);
setAD_Reference_ID (0);
setAD_Table_ID (0);
setColumnName (null);
setEntityType (null);	
// U
setIsAlwaysUpdateable (false);	
// N
setIsAutocomplete (false);	
// N
setIsEncrypted (null);	
// N
setIsIdentifier (false);	
// N
setIsKey (false);	
// N
setIsMandatory (false);	
// N
setIsParent (false);	
// N
setIsSelectionColumn (false);	
// N
setIsTranslated (false);	
// N
setIsUpdateable (true);	
// Y
setName (null);
setVersion (Env.ZERO);	
// 0
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Column (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=101 */
public static int Table_ID=MTable.getTable_ID("AD_Column");

@XendraTrl(Identifier="f2864947-dcd5-98af-2bf0-a4e296b595b0")
public static String es_PE_TAB_UsedInColumn_Description="Usado en Columna";

@XendraTrl(Identifier="f2864947-dcd5-98af-2bf0-a4e296b595b0")
public static String es_PE_TAB_UsedInColumn_Name="Usado en Columna";

@XendraTrl(Identifier="f2864947-dcd5-98af-2bf0-a4e296b595b0")
public static String es_PE_TAB_UsedInColumn_Help="La pestaña Usado en Columna define la tabla y columna en los cuales este elemento reside.";

@XendraTab(Name="Used in Column",Description="Used  in Column",
Help="The Used in Column Tab defines the table and column this element resides in.",
AD_Window_ID="3ac9d23a-ddd0-cc17-b61e-06302a89c737",SeqNo=30,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,
AD_Column_ID="af711dcf-a160-ae2b-0592-0be1d8b3ae5e",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="f2864947-dcd5-98af-2bf0-a4e296b595b0",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_UsedInColumn="f2864947-dcd5-98af-2bf0-a4e296b595b0";

@XendraTrl(Identifier="7f22e1b4-bc67-420c-0156-5b87df8c18b3")
public static String es_PE_TAB_Column_Description="Definiciones de Columna de Tabla";

@XendraTrl(Identifier="7f22e1b4-bc67-420c-0156-5b87df8c18b3")
public static String es_PE_TAB_Column_Name="Columna";

@XendraTrl(Identifier="7f22e1b4-bc67-420c-0156-5b87df8c18b3")
public static String es_PE_TAB_Column_Help="Define las columnas de una tabla";

@XendraTab(Name="Column",Description="Table Column definitions",
Help="Defines the columns of a table. Note thet the name of the column is automatically syncronized.",
AD_Window_ID="b5be5fc1-2b79-ff23-e3ac-cfef2c63bb96",SeqNo=30,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="7f22e1b4-bc67-420c-0156-5b87df8c18b3",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Column="7f22e1b4-bc67-420c-0156-5b87df8c18b3";

@XendraTrl(Identifier="896eb30c-0038-f362-1ef9-1b18df7727b8")
public static String es_PE_TAB_UsedInColumn2_Description="Empleado en Columna";

@XendraTrl(Identifier="896eb30c-0038-f362-1ef9-1b18df7727b8")
public static String es_PE_TAB_UsedInColumn2_Name="Empleado en Columna";

@XendraTab(Name="Used in Column",Description="Used in Column",Help="",
AD_Window_ID="99a7f75c-af6c-e8b5-54e4-de7e130aa960",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="f0e04846-0fe5-b3e2-c2fb-665561607b13",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="896eb30c-0038-f362-1ef9-1b18df7727b8",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_UsedInColumn2="896eb30c-0038-f362-1ef9-1b18df7727b8";

@XendraTrl(Identifier="45259391-7378-323f-de9f-b2a168722616")
public static String es_PE_TAB_UsedInColumn3_Description="Empleado en Columna (Referencia)";

@XendraTrl(Identifier="45259391-7378-323f-de9f-b2a168722616")
public static String es_PE_TAB_UsedInColumn3_Name="Empleado en Columna ";

@XendraTab(Name="Used in Column",Description="Used in Column (Reference)",Help="",
AD_Window_ID="3aa1b885-6192-d44a-f2c0-c82b9363e3f6",SeqNo=60,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="5a4beeff-01b1-a360-8dd6-85c9b391fd58",HasTree=false,
WhereClause="AD_Reference_Value_ID=@AD_Reference_ID@",OrderByClause="",CommitWarning="",
AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,
Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="@ValidationType@!D",IsInsertRecord=false,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="45259391-7378-323f-de9f-b2a168722616",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_UsedInColumn3="45259391-7378-323f-de9f-b2a168722616";

@XendraTrl(Identifier="e71b2f99-4667-870c-158d-c916d0f23ded")
public static String es_PE_TABLE_AD_Column_Name="Columna";

@XendraTable(Name="Column",Description="Column in the table",Help="",TableName="AD_Column",
AccessLevel="4",AD_Window_ID="b5be5fc1-2b79-ff23-e3ac-cfef2c63bb96",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=130,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="e71b2f99-4667-870c-158d-c916d0f23ded",Synchronized="2017-08-16 11:40:07.0")
/** TableName=AD_Column */
public static final String Table_Name="AD_Column";


@XendraIndex(Name="ad_column_name",Identifier="51a329b1-d7ae-d8b8-11b1-c9d02dae48c9",
Column_Names="ad_table_id, columnname",IsUnique="true",
TableIdentifier="51a329b1-d7ae-d8b8-11b1-c9d02dae48c9",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_ad_column_name = "51a329b1-d7ae-d8b8-11b1-c9d02dae48c9";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Column");

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
    Table_ID = MTable.getTable_ID("AD_Column");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Column[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Column.
@param AD_Column_ID Column in the table */
public void setAD_Column_ID (int AD_Column_ID)
{
if (AD_Column_ID < 1) throw new IllegalArgumentException ("AD_Column_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Column_ID, Integer.valueOf(AD_Column_ID));
}
/** Get Column.
@return Column in the table */
public int getAD_Column_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Column_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7c7031d2-7971-c65a-dfc8-108f0b7486e3")
public static String es_PE_FIELD_Column_Column_Description="Columna en la tabla";

@XendraTrl(Identifier="7c7031d2-7971-c65a-dfc8-108f0b7486e3")
public static String es_PE_FIELD_Column_Column_Help="Enlace a la columna base de datos de la tabla";

@XendraTrl(Identifier="7c7031d2-7971-c65a-dfc8-108f0b7486e3")
public static String es_PE_FIELD_Column_Column_Name="Columna";

@XendraField(AD_Column_ID="AD_Column_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7f22e1b4-bc67-420c-0156-5b87df8c18b3",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7c7031d2-7971-c65a-dfc8-108f0b7486e3")
public static final String FIELDNAME_Column_Column="7c7031d2-7971-c65a-dfc8-108f0b7486e3";

@XendraTrl(Identifier="0041b3cb-b662-89cc-4bc2-8244f2e58500")
public static String es_PE_FIELD_UsedInColumn_Column_Description="Columna en la tabla";

@XendraTrl(Identifier="0041b3cb-b662-89cc-4bc2-8244f2e58500")
public static String es_PE_FIELD_UsedInColumn_Column_Help="Enlace a la columna base de datos de la tabla";

@XendraTrl(Identifier="0041b3cb-b662-89cc-4bc2-8244f2e58500")
public static String es_PE_FIELD_UsedInColumn_Column_Name="Columna";

@XendraField(AD_Column_ID="AD_Column_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f2864947-dcd5-98af-2bf0-a4e296b595b0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0041b3cb-b662-89cc-4bc2-8244f2e58500")
public static final String FIELDNAME_UsedInColumn_Column="0041b3cb-b662-89cc-4bc2-8244f2e58500";

@XendraTrl(Identifier="3c20ff20-c3ef-e2ea-517f-9bf0917a0197")
public static String es_PE_FIELD_UsedInColumn_Column2_Description="Columna en la tabla";

@XendraTrl(Identifier="3c20ff20-c3ef-e2ea-517f-9bf0917a0197")
public static String es_PE_FIELD_UsedInColumn_Column2_Help="Enlace a la columna base de datos de la tabla";

@XendraTrl(Identifier="3c20ff20-c3ef-e2ea-517f-9bf0917a0197")
public static String es_PE_FIELD_UsedInColumn_Column2_Name="Columna";

@XendraField(AD_Column_ID="AD_Column_ID",IsCentrallyMaintained=true,
AD_Tab_ID="896eb30c-0038-f362-1ef9-1b18df7727b8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3c20ff20-c3ef-e2ea-517f-9bf0917a0197")
public static final String FIELDNAME_UsedInColumn_Column2="3c20ff20-c3ef-e2ea-517f-9bf0917a0197";

@XendraTrl(Identifier="982dde3d-3f8b-f53b-d062-917796ea5909")
public static String es_PE_FIELD_UsedInColumn_Column3_Description="Columna en la tabla";

@XendraTrl(Identifier="982dde3d-3f8b-f53b-d062-917796ea5909")
public static String es_PE_FIELD_UsedInColumn_Column3_Help="Enlace a la columna base de datos de la tabla";

@XendraTrl(Identifier="982dde3d-3f8b-f53b-d062-917796ea5909")
public static String es_PE_FIELD_UsedInColumn_Column3_Name="Columna";

@XendraField(AD_Column_ID="AD_Column_ID",IsCentrallyMaintained=true,
AD_Tab_ID="45259391-7378-323f-de9f-b2a168722616",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="982dde3d-3f8b-f53b-d062-917796ea5909")
public static final String FIELDNAME_UsedInColumn_Column3="982dde3d-3f8b-f53b-d062-917796ea5909";
/** Column name AD_Column_ID */
public static final String COLUMNNAME_AD_Column_ID = "AD_Column_ID";
/** Set System Element.
@param AD_Element_ID System Element enables the central maintenance of column DESCRIPTION and HELP. */
public void setAD_Element_ID (int AD_Element_ID)
{
if (AD_Element_ID < 1) throw new IllegalArgumentException ("AD_Element_ID is mandatory.");
set_Value (COLUMNNAME_AD_Element_ID, Integer.valueOf(AD_Element_ID));
}
/** Get System Element.
@return System Element enables the central maintenance of column DESCRIPTION and HELP. */
public int getAD_Element_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Element_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e39c1a23-54ba-d1cb-ae64-037f289b93db")
public static String es_PE_FIELD_Column_SystemElement_Description="El elemento del sistema permite el mantenimiento central de la descripción y ayuda de la columna";

@XendraTrl(Identifier="e39c1a23-54ba-d1cb-ae64-037f289b93db")
public static String es_PE_FIELD_Column_SystemElement_Help="El elemento sistema permite el mantenimiento central de la ayuda descripciones y terminología para una columna base de datos.";

@XendraTrl(Identifier="e39c1a23-54ba-d1cb-ae64-037f289b93db")
public static String es_PE_FIELD_Column_SystemElement_Name="Elemento";

@XendraField(AD_Column_ID="AD_Element_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7f22e1b4-bc67-420c-0156-5b87df8c18b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e39c1a23-54ba-d1cb-ae64-037f289b93db")
public static final String FIELDNAME_Column_SystemElement="e39c1a23-54ba-d1cb-ae64-037f289b93db";

@XendraTrl(Identifier="7799107a-02f5-f525-d44f-5024167948b4")
public static String es_PE_FIELD_UsedInColumn_SystemElement_Description="El elemento del sistema permite el mantenimiento central de la descripción y ayuda de la columna";

@XendraTrl(Identifier="7799107a-02f5-f525-d44f-5024167948b4")
public static String es_PE_FIELD_UsedInColumn_SystemElement_Help="El elemento sistema permite el mantenimiento central de la ayuda descripciones y terminología para una columna base de datos.";

@XendraTrl(Identifier="7799107a-02f5-f525-d44f-5024167948b4")
public static String es_PE_FIELD_UsedInColumn_SystemElement_Name="Elemento";

@XendraField(AD_Column_ID="AD_Element_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f2864947-dcd5-98af-2bf0-a4e296b595b0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7799107a-02f5-f525-d44f-5024167948b4")
public static final String FIELDNAME_UsedInColumn_SystemElement="7799107a-02f5-f525-d44f-5024167948b4";

@XendraTrl(Identifier="b625ee88-d772-08ad-cb66-db288f677e95")
public static String es_PE_FIELD_UsedInColumn_SystemElement2_Description="El elemento del sistema permite el mantenimiento central de la descripción y ayuda de la columna";

@XendraTrl(Identifier="b625ee88-d772-08ad-cb66-db288f677e95")
public static String es_PE_FIELD_UsedInColumn_SystemElement2_Help="El elemento sistema permite el mantenimiento central de la ayuda descripciones y terminología para una columna base de datos.";

@XendraTrl(Identifier="b625ee88-d772-08ad-cb66-db288f677e95")
public static String es_PE_FIELD_UsedInColumn_SystemElement2_Name="Elemento";

@XendraField(AD_Column_ID="AD_Element_ID",IsCentrallyMaintained=true,
AD_Tab_ID="896eb30c-0038-f362-1ef9-1b18df7727b8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=true,SeqNo=50,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b625ee88-d772-08ad-cb66-db288f677e95")
public static final String FIELDNAME_UsedInColumn_SystemElement2="b625ee88-d772-08ad-cb66-db288f677e95";

@XendraTrl(Identifier="4a1f2709-b17a-2620-6f66-48c506ab5070")
public static String es_PE_FIELD_UsedInColumn_SystemElement3_Description="El elemento del sistema permite el mantenimiento central de la descripción y ayuda de la columna";

@XendraTrl(Identifier="4a1f2709-b17a-2620-6f66-48c506ab5070")
public static String es_PE_FIELD_UsedInColumn_SystemElement3_Help="El elemento sistema permite el mantenimiento central de la ayuda descripciones y terminología para una columna base de datos.";

@XendraTrl(Identifier="4a1f2709-b17a-2620-6f66-48c506ab5070")
public static String es_PE_FIELD_UsedInColumn_SystemElement3_Name="Elemento";

@XendraField(AD_Column_ID="AD_Element_ID",IsCentrallyMaintained=true,
AD_Tab_ID="45259391-7378-323f-de9f-b2a168722616",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=true,SeqNo=50,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4a1f2709-b17a-2620-6f66-48c506ab5070")
public static final String FIELDNAME_UsedInColumn_SystemElement3="4a1f2709-b17a-2620-6f66-48c506ab5070";

@XendraTrl(Identifier="af711dcf-a160-ae2b-0592-0be1d8b3ae5e")
public static String es_PE_COLUMN_AD_Element_ID_Name="Elemento";

@XendraColumn(AD_Element_ID="ca8e78b4-089d-16d4-cff1-575a3558c7bc",ColumnName="AD_Element_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="af711dcf-a160-ae2b-0592-0be1d8b3ae5e",
Synchronized="2017-08-16 11:33:27.0")
/** Column name AD_Element_ID */
public static final String COLUMNNAME_AD_Element_ID = "AD_Element_ID";
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

@XendraTrl(Identifier="0039b3d6-a1d3-c736-6b3a-955a47bc5979")
public static String es_PE_FIELD_Column_Process_Description="Proceso ó Informe";

@XendraTrl(Identifier="0039b3d6-a1d3-c736-6b3a-955a47bc5979")
public static String es_PE_FIELD_Column_Process_Help="El campo proceso identifica un proceso ó Informe único en el sistema.";

@XendraTrl(Identifier="0039b3d6-a1d3-c736-6b3a-955a47bc5979")
public static String es_PE_FIELD_Column_Process_Name="Proceso";

@XendraField(AD_Column_ID="AD_Process_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7f22e1b4-bc67-420c-0156-5b87df8c18b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@AD_Reference_ID@=28",DisplayLength=14,IsReadOnly=false,SeqNo=170,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="0039b3d6-a1d3-c736-6b3a-955a47bc5979")
public static final String FIELDNAME_Column_Process="0039b3d6-a1d3-c736-6b3a-955a47bc5979";

@XendraTrl(Identifier="e9de81b1-2f0b-24fe-8731-5b8e37dc3e13")
public static String es_PE_FIELD_UsedInColumn_Process_Description="Proceso ó Informe";

@XendraTrl(Identifier="e9de81b1-2f0b-24fe-8731-5b8e37dc3e13")
public static String es_PE_FIELD_UsedInColumn_Process_Help="El campo proceso identifica un proceso ó Informe único en el sistema.";

@XendraTrl(Identifier="e9de81b1-2f0b-24fe-8731-5b8e37dc3e13")
public static String es_PE_FIELD_UsedInColumn_Process_Name="Proceso";

@XendraField(AD_Column_ID="AD_Process_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f2864947-dcd5-98af-2bf0-a4e296b595b0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e9de81b1-2f0b-24fe-8731-5b8e37dc3e13")
public static final String FIELDNAME_UsedInColumn_Process="e9de81b1-2f0b-24fe-8731-5b8e37dc3e13";

@XendraTrl(Identifier="65bc5ad2-61d3-7f6b-cfbe-5b2d69664f99")
public static String es_PE_FIELD_UsedInColumn_Process2_Description="Proceso ó Informe";

@XendraTrl(Identifier="65bc5ad2-61d3-7f6b-cfbe-5b2d69664f99")
public static String es_PE_FIELD_UsedInColumn_Process2_Help="El campo proceso identifica un proceso ó Informe único en el sistema.";

@XendraTrl(Identifier="65bc5ad2-61d3-7f6b-cfbe-5b2d69664f99")
public static String es_PE_FIELD_UsedInColumn_Process2_Name="Proceso";

@XendraField(AD_Column_ID="AD_Process_ID",IsCentrallyMaintained=true,
AD_Tab_ID="896eb30c-0038-f362-1ef9-1b18df7727b8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="65bc5ad2-61d3-7f6b-cfbe-5b2d69664f99")
public static final String FIELDNAME_UsedInColumn_Process2="65bc5ad2-61d3-7f6b-cfbe-5b2d69664f99";

@XendraTrl(Identifier="1644f172-6ad2-cf1d-e7d3-dab3f8b4a086")
public static String es_PE_FIELD_UsedInColumn_Process3_Description="Proceso ó Informe";

@XendraTrl(Identifier="1644f172-6ad2-cf1d-e7d3-dab3f8b4a086")
public static String es_PE_FIELD_UsedInColumn_Process3_Help="El campo proceso identifica un proceso ó Informe único en el sistema.";

@XendraTrl(Identifier="1644f172-6ad2-cf1d-e7d3-dab3f8b4a086")
public static String es_PE_FIELD_UsedInColumn_Process3_Name="Proceso";

@XendraField(AD_Column_ID="AD_Process_ID",IsCentrallyMaintained=true,
AD_Tab_ID="45259391-7378-323f-de9f-b2a168722616",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1644f172-6ad2-cf1d-e7d3-dab3f8b4a086")
public static final String FIELDNAME_UsedInColumn_Process3="1644f172-6ad2-cf1d-e7d3-dab3f8b4a086";

@XendraTrl(Identifier="42e499a6-e796-46c4-c64a-3097f2fd140c")
public static String es_PE_COLUMN_AD_Process_ID_Name="Proceso";

@XendraColumn(AD_Element_ID="60982cc9-e937-d374-4608-1c3f64b16d3b",ColumnName="AD_Process_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="42e499a6-e796-46c4-c64a-3097f2fd140c",
Synchronized="2017-08-16 11:33:28.0")
/** Column name AD_Process_ID */
public static final String COLUMNNAME_AD_Process_ID = "AD_Process_ID";

/** AD_Reference_ID AD_Reference=17ec718c-707b-498f-3a6c-e81d1630e510 */
public static final int AD_REFERENCE_ID_AD_Reference_ID=1;
/** Set Reference.
@param AD_Reference_ID System Reference and Validation */
public void setAD_Reference_ID (int AD_Reference_ID)
{
if (AD_Reference_ID < 1) throw new IllegalArgumentException ("AD_Reference_ID is mandatory.");
set_Value (COLUMNNAME_AD_Reference_ID, Integer.valueOf(AD_Reference_ID));
}
/** Get Reference.
@return System Reference and Validation */
public int getAD_Reference_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Reference_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5af48967-7508-a8b0-f2e8-ce75a479ab3c")
public static String es_PE_FIELD_Column_Reference_Description="Referencia del Sistema (Lista de Selección)";

@XendraTrl(Identifier="5af48967-7508-a8b0-f2e8-ce75a479ab3c")
public static String es_PE_FIELD_Column_Reference_Help="La Referencia indica el tipo de campo de referencia";

@XendraTrl(Identifier="5af48967-7508-a8b0-f2e8-ce75a479ab3c")
public static String es_PE_FIELD_Column_Reference_Name="Referencia";

@XendraField(AD_Column_ID="AD_Reference_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7f22e1b4-bc67-420c-0156-5b87df8c18b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5af48967-7508-a8b0-f2e8-ce75a479ab3c")
public static final String FIELDNAME_Column_Reference="5af48967-7508-a8b0-f2e8-ce75a479ab3c";

@XendraTrl(Identifier="e810fcef-7a28-d4d4-3abf-f703e64b8670")
public static String es_PE_FIELD_UsedInColumn_Reference_Description="Referencia del Sistema (Lista de Selección)";

@XendraTrl(Identifier="e810fcef-7a28-d4d4-3abf-f703e64b8670")
public static String es_PE_FIELD_UsedInColumn_Reference_Help="La Referencia indica el tipo de campo de referencia";

@XendraTrl(Identifier="e810fcef-7a28-d4d4-3abf-f703e64b8670")
public static String es_PE_FIELD_UsedInColumn_Reference_Name="Referencia";

@XendraField(AD_Column_ID="AD_Reference_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f2864947-dcd5-98af-2bf0-a4e296b595b0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e810fcef-7a28-d4d4-3abf-f703e64b8670")
public static final String FIELDNAME_UsedInColumn_Reference="e810fcef-7a28-d4d4-3abf-f703e64b8670";

@XendraTrl(Identifier="f151706c-774d-412b-7c35-df6a6741fea1")
public static String es_PE_FIELD_UsedInColumn_Reference2_Description="Referencia del Sistema (Lista de Selección)";

@XendraTrl(Identifier="f151706c-774d-412b-7c35-df6a6741fea1")
public static String es_PE_FIELD_UsedInColumn_Reference2_Help="La Referencia indica el tipo de campo de referencia";

@XendraTrl(Identifier="f151706c-774d-412b-7c35-df6a6741fea1")
public static String es_PE_FIELD_UsedInColumn_Reference2_Name="Referencia";

@XendraField(AD_Column_ID="AD_Reference_ID",IsCentrallyMaintained=true,
AD_Tab_ID="896eb30c-0038-f362-1ef9-1b18df7727b8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f151706c-774d-412b-7c35-df6a6741fea1")
public static final String FIELDNAME_UsedInColumn_Reference2="f151706c-774d-412b-7c35-df6a6741fea1";

@XendraTrl(Identifier="e0df636b-ad92-0196-9990-e67762be6353")
public static String es_PE_FIELD_UsedInColumn_Reference3_Description="Referencia del Sistema (Lista de Selección)";

@XendraTrl(Identifier="e0df636b-ad92-0196-9990-e67762be6353")
public static String es_PE_FIELD_UsedInColumn_Reference3_Help="La Referencia indica el tipo de campo de referencia";

@XendraTrl(Identifier="e0df636b-ad92-0196-9990-e67762be6353")
public static String es_PE_FIELD_UsedInColumn_Reference3_Name="Referencia";

@XendraField(AD_Column_ID="AD_Reference_ID",IsCentrallyMaintained=true,
AD_Tab_ID="45259391-7378-323f-de9f-b2a168722616",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e0df636b-ad92-0196-9990-e67762be6353")
public static final String FIELDNAME_UsedInColumn_Reference3="e0df636b-ad92-0196-9990-e67762be6353";

@XendraTrl(Identifier="afd94240-0e3c-1fa8-f008-14159e7e83e1")
public static String es_PE_COLUMN_AD_Reference_ID_Name="Referencia";

@XendraColumn(AD_Element_ID="bf1912e9-a75f-4e1b-99b4-d04633e7777b",ColumnName="AD_Reference_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="17ec718c-707b-498f-3a6c-e81d1630e510",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="afd94240-0e3c-1fa8-f008-14159e7e83e1",Synchronized="2017-08-16 11:33:28.0")
/** Column name AD_Reference_ID */
public static final String COLUMNNAME_AD_Reference_ID = "AD_Reference_ID";

/** AD_Reference_Value_ID AD_Reference=12253474-e61c-58a4-3fd3-2c2ccf236272 */
public static final int AD_REFERENCE_VALUE_ID_AD_Reference_ID=4;
/** Set Reference Key.
@param AD_Reference_Value_ID Required to specify, if data type is Table or List */
public void setAD_Reference_Value_ID (int AD_Reference_Value_ID)
{
if (AD_Reference_Value_ID <= 0) set_Value (COLUMNNAME_AD_Reference_Value_ID, null);
 else 
set_Value (COLUMNNAME_AD_Reference_Value_ID, Integer.valueOf(AD_Reference_Value_ID));
}
/** Get Reference Key.
@return Required to specify, if data type is Table or List */
public int getAD_Reference_Value_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Reference_Value_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3c527558-038c-e816-7968-419009d0ba3b")
public static String es_PE_FIELD_Column_ReferenceKey_Description="Requerido para especificar; si el tipo de datos es tabla ó lista.";

@XendraTrl(Identifier="3c527558-038c-e816-7968-419009d0ba3b")
public static String es_PE_FIELD_Column_ReferenceKey_Help="El valor referencia indica dónde los valores referencia son almacenados. Debe especificarce si el tipo de datos es tabla ó lista.";

@XendraTrl(Identifier="3c527558-038c-e816-7968-419009d0ba3b")
public static String es_PE_FIELD_Column_ReferenceKey_Name="Valor de Referencia";

@XendraField(AD_Column_ID="AD_Reference_Value_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7f22e1b4-bc67-420c-0156-5b87df8c18b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@AD_Reference_ID@=17 | @AD_Reference_ID@=18 | @AD_Reference_ID@=30 | @AD_Reference_ID@=28",
DisplayLength=14,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3c527558-038c-e816-7968-419009d0ba3b")
public static final String FIELDNAME_Column_ReferenceKey="3c527558-038c-e816-7968-419009d0ba3b";

@XendraTrl(Identifier="4c118699-40c5-ba30-55f7-12a939e6cb44")
public static String es_PE_FIELD_UsedInColumn_ReferenceKey_Description="Requerido para especificar; si el tipo de datos es tabla ó lista.";

@XendraTrl(Identifier="4c118699-40c5-ba30-55f7-12a939e6cb44")
public static String es_PE_FIELD_UsedInColumn_ReferenceKey_Help="El valor referencia indica dónde los valores referencia son almacenados. Debe especificarce si el tipo de datos es tabla ó lista.";

@XendraTrl(Identifier="4c118699-40c5-ba30-55f7-12a939e6cb44")
public static String es_PE_FIELD_UsedInColumn_ReferenceKey_Name="Valor de Referencia";

@XendraField(AD_Column_ID="AD_Reference_Value_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f2864947-dcd5-98af-2bf0-a4e296b595b0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4c118699-40c5-ba30-55f7-12a939e6cb44")
public static final String FIELDNAME_UsedInColumn_ReferenceKey="4c118699-40c5-ba30-55f7-12a939e6cb44";

@XendraTrl(Identifier="c7696883-0d23-1718-18ce-851056852463")
public static String es_PE_FIELD_UsedInColumn_ReferenceKey2_Description="Requerido para especificar; si el tipo de datos es tabla ó lista.";

@XendraTrl(Identifier="c7696883-0d23-1718-18ce-851056852463")
public static String es_PE_FIELD_UsedInColumn_ReferenceKey2_Help="El valor referencia indica dónde los valores referencia son almacenados. Debe especificarce si el tipo de datos es tabla ó lista.";

@XendraTrl(Identifier="c7696883-0d23-1718-18ce-851056852463")
public static String es_PE_FIELD_UsedInColumn_ReferenceKey2_Name="Valor de Referencia";

@XendraField(AD_Column_ID="AD_Reference_Value_ID",IsCentrallyMaintained=true,
AD_Tab_ID="896eb30c-0038-f362-1ef9-1b18df7727b8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c7696883-0d23-1718-18ce-851056852463")
public static final String FIELDNAME_UsedInColumn_ReferenceKey2="c7696883-0d23-1718-18ce-851056852463";

@XendraTrl(Identifier="97ad4f99-7431-5fdf-7e53-7dce54977ddf")
public static String es_PE_FIELD_UsedInColumn_ReferenceKey3_Description="Requerido para especificar; si el tipo de datos es tabla ó lista.";

@XendraTrl(Identifier="97ad4f99-7431-5fdf-7e53-7dce54977ddf")
public static String es_PE_FIELD_UsedInColumn_ReferenceKey3_Help="El valor referencia indica dónde los valores referencia son almacenados. Debe especificarce si el tipo de datos es tabla ó lista.";

@XendraTrl(Identifier="97ad4f99-7431-5fdf-7e53-7dce54977ddf")
public static String es_PE_FIELD_UsedInColumn_ReferenceKey3_Name="Valor de Referencia";

@XendraField(AD_Column_ID="AD_Reference_Value_ID",IsCentrallyMaintained=true,
AD_Tab_ID="45259391-7378-323f-de9f-b2a168722616",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="97ad4f99-7431-5fdf-7e53-7dce54977ddf")
public static final String FIELDNAME_UsedInColumn_ReferenceKey3="97ad4f99-7431-5fdf-7e53-7dce54977ddf";

@XendraTrl(Identifier="cb8b543b-3de2-1833-e583-a043ab16ad44")
public static String es_PE_COLUMN_AD_Reference_Value_ID_Name="Valor de Referencia";

@XendraColumn(AD_Element_ID="1ce26254-3c83-8d1d-3506-37160c076aad",
ColumnName="AD_Reference_Value_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="12253474-e61c-58a4-3fd3-2c2ccf236272",
AD_Val_Rule_ID="147ddeef-c150-2ac8-67e8-346cc5225ef4",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cb8b543b-3de2-1833-e583-a043ab16ad44",
Synchronized="2017-08-16 11:33:28.0")
/** Column name AD_Reference_Value_ID */
public static final String COLUMNNAME_AD_Reference_Value_ID = "AD_Reference_Value_ID";
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

@XendraTrl(Identifier="f7f56f3d-f995-41bb-afcc-99d6088f3a33")
public static String es_PE_FIELD_Column_AD_Rule_ID_Name="Rule";

@XendraField(AD_Column_ID="AD_Rule_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7f22e1b4-bc67-420c-0156-5b87df8c18b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=360,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-04-01 17:26:49.0",
Identifier="f7f56f3d-f995-41bb-afcc-99d6088f3a33")
public static final String FIELDNAME_Column_AD_Rule_ID="f7f56f3d-f995-41bb-afcc-99d6088f3a33";

@XendraTrl(Identifier="734fe0a8-dbac-4451-98e4-e25592f15085")
public static String es_PE_COLUMN_AD_Rule_ID_Name="AD_Rule_ID";

@XendraColumn(AD_Element_ID="4b4afdeb-6aca-d182-6e3a-83f0f6d29f7d",ColumnName="AD_Rule_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="734fe0a8-dbac-4451-98e4-e25592f15085",
Synchronized="2017-08-16 11:33:28.0")
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

@XendraTrl(Identifier="f33ce904-d458-0bbd-505a-1bf3c92056d3")
public static String es_PE_FIELD_Column_Table_Description="Tabla para los campos";

@XendraTrl(Identifier="f33ce904-d458-0bbd-505a-1bf3c92056d3")
public static String es_PE_FIELD_Column_Table_Help="La Tabla indica una tabla en la que reside un campo ó campos.";

@XendraTrl(Identifier="f33ce904-d458-0bbd-505a-1bf3c92056d3")
public static String es_PE_FIELD_Column_Table_Name="Tabla";
@XendraField(AD_Column_ID="AD_Table_ID",
IsCentrallyMaintained=true,AD_Tab_ID="7f22e1b4-bc67-420c-0156-5b87df8c18b3",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="f33ce904-d458-0bbd-505a-1bf3c92056d3")
public static final String FIELDNAME_Column_Table="f33ce904-d458-0bbd-505a-1bf3c92056d3";

@XendraTrl(Identifier="ffccbd26-49d8-3917-0095-e331bf592150")
public static String es_PE_FIELD_UsedInColumn_Table_Description="Tabla para los campos";

@XendraTrl(Identifier="ffccbd26-49d8-3917-0095-e331bf592150")
public static String es_PE_FIELD_UsedInColumn_Table_Help="La Tabla indica una tabla en la que reside un campo ó campos.";

@XendraTrl(Identifier="ffccbd26-49d8-3917-0095-e331bf592150")
public static String es_PE_FIELD_UsedInColumn_Table_Name="Tabla";

@XendraField(AD_Column_ID="AD_Table_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f2864947-dcd5-98af-2bf0-a4e296b595b0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=10,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ffccbd26-49d8-3917-0095-e331bf592150")
public static final String FIELDNAME_UsedInColumn_Table="ffccbd26-49d8-3917-0095-e331bf592150";

@XendraTrl(Identifier="0385d109-5ee5-4939-c4b9-eb164030c317")
public static String es_PE_FIELD_UsedInColumn_Table2_Description="Tabla para los campos";

@XendraTrl(Identifier="0385d109-5ee5-4939-c4b9-eb164030c317")
public static String es_PE_FIELD_UsedInColumn_Table2_Help="La Tabla indica una tabla en la que reside un campo ó campos.";

@XendraTrl(Identifier="0385d109-5ee5-4939-c4b9-eb164030c317")
public static String es_PE_FIELD_UsedInColumn_Table2_Name="Tabla";

@XendraField(AD_Column_ID="AD_Table_ID",IsCentrallyMaintained=true,
AD_Tab_ID="896eb30c-0038-f362-1ef9-1b18df7727b8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0385d109-5ee5-4939-c4b9-eb164030c317")
public static final String FIELDNAME_UsedInColumn_Table2="0385d109-5ee5-4939-c4b9-eb164030c317";

@XendraTrl(Identifier="9daf4709-aec3-c2ed-f9c7-afa74b2909b5")
public static String es_PE_FIELD_UsedInColumn_Table3_Description="Tabla para los campos";

@XendraTrl(Identifier="9daf4709-aec3-c2ed-f9c7-afa74b2909b5")
public static String es_PE_FIELD_UsedInColumn_Table3_Help="La Tabla indica una tabla en la que reside un campo ó campos.";

@XendraTrl(Identifier="9daf4709-aec3-c2ed-f9c7-afa74b2909b5")
public static String es_PE_FIELD_UsedInColumn_Table3_Name="Tabla";

@XendraField(AD_Column_ID="AD_Table_ID",IsCentrallyMaintained=true,
AD_Tab_ID="45259391-7378-323f-de9f-b2a168722616",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9daf4709-aec3-c2ed-f9c7-afa74b2909b5")
public static final String FIELDNAME_UsedInColumn_Table3="9daf4709-aec3-c2ed-f9c7-afa74b2909b5";

@XendraTrl(Identifier="efc7aa23-16a7-91ad-9fa8-68e1940cc597")
public static String es_PE_COLUMN_AD_Table_ID_Name="Tabla";

@XendraColumn(AD_Element_ID="270eeb02-723b-0ecc-7f56-3c67fa71a7f1",ColumnName="AD_Table_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="efc7aa23-16a7-91ad-9fa8-68e1940cc597",
Synchronized="2017-08-16 11:33:28.0")
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

@XendraTrl(Identifier="5ba58a8c-bf6b-15ad-0beb-46fa334d3b63")
public static String es_PE_FIELD_Column_DynamicValidation_Description="Regla de validación";

@XendraTrl(Identifier="5ba58a8c-bf6b-15ad-0beb-46fa334d3b63")
public static String es_PE_FIELD_Column_DynamicValidation_Help="La Regla de validación indica una regla de validación única en el sistema. Esas reglas definen como una entidad se determina como válida ó inválida.";

@XendraTrl(Identifier="5ba58a8c-bf6b-15ad-0beb-46fa334d3b63")
public static String es_PE_FIELD_Column_DynamicValidation_Name="Validación";

@XendraField(AD_Column_ID="AD_Val_Rule_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7f22e1b4-bc67-420c-0156-5b87df8c18b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@AD_Reference_ID@=17 | @AD_Reference_ID@=18 | @AD_Reference_ID@=19 | @AD_Reference_ID@=28 | @AD_Reference_ID@=30",
DisplayLength=14,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5ba58a8c-bf6b-15ad-0beb-46fa334d3b63")
public static final String FIELDNAME_Column_DynamicValidation="5ba58a8c-bf6b-15ad-0beb-46fa334d3b63";

@XendraTrl(Identifier="3cf2a7ce-99c5-752e-8d3f-824f23491d27")
public static String es_PE_FIELD_UsedInColumn_DynamicValidation_Description="Regla de validación";

@XendraTrl(Identifier="3cf2a7ce-99c5-752e-8d3f-824f23491d27")
public static String es_PE_FIELD_UsedInColumn_DynamicValidation_Help="La Regla de validación indica una regla de validación única en el sistema. Esas reglas definen como una entidad se determina como válida ó inválida.";

@XendraTrl(Identifier="3cf2a7ce-99c5-752e-8d3f-824f23491d27")
public static String es_PE_FIELD_UsedInColumn_DynamicValidation_Name="Validación";

@XendraField(AD_Column_ID="AD_Val_Rule_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f2864947-dcd5-98af-2bf0-a4e296b595b0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3cf2a7ce-99c5-752e-8d3f-824f23491d27")
public static final String FIELDNAME_UsedInColumn_DynamicValidation="3cf2a7ce-99c5-752e-8d3f-824f23491d27";

@XendraTrl(Identifier="bdbc6773-9d39-95ae-6b42-20c075f934aa")
public static String es_PE_FIELD_UsedInColumn_DynamicValidation2_Description="Regla de validación";

@XendraTrl(Identifier="bdbc6773-9d39-95ae-6b42-20c075f934aa")
public static String es_PE_FIELD_UsedInColumn_DynamicValidation2_Help="La Regla de validación indica una regla de validación única en el sistema. Esas reglas definen como una entidad se determina como válida ó inválida.";

@XendraTrl(Identifier="bdbc6773-9d39-95ae-6b42-20c075f934aa")
public static String es_PE_FIELD_UsedInColumn_DynamicValidation2_Name="Validación";

@XendraField(AD_Column_ID="AD_Val_Rule_ID",IsCentrallyMaintained=true,
AD_Tab_ID="896eb30c-0038-f362-1ef9-1b18df7727b8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bdbc6773-9d39-95ae-6b42-20c075f934aa")
public static final String FIELDNAME_UsedInColumn_DynamicValidation2="bdbc6773-9d39-95ae-6b42-20c075f934aa";

@XendraTrl(Identifier="d29e5ce7-57f9-519b-083d-f47537de0f25")
public static String es_PE_FIELD_UsedInColumn_DynamicValidation3_Description="Regla de validación";

@XendraTrl(Identifier="d29e5ce7-57f9-519b-083d-f47537de0f25")
public static String es_PE_FIELD_UsedInColumn_DynamicValidation3_Help="La Regla de validación indica una regla de validación única en el sistema. Esas reglas definen como una entidad se determina como válida ó inválida.";

@XendraTrl(Identifier="d29e5ce7-57f9-519b-083d-f47537de0f25")
public static String es_PE_FIELD_UsedInColumn_DynamicValidation3_Name="Validación";

@XendraField(AD_Column_ID="AD_Val_Rule_ID",IsCentrallyMaintained=true,
AD_Tab_ID="45259391-7378-323f-de9f-b2a168722616",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d29e5ce7-57f9-519b-083d-f47537de0f25")
public static final String FIELDNAME_UsedInColumn_DynamicValidation3="d29e5ce7-57f9-519b-083d-f47537de0f25";

@XendraTrl(Identifier="f0e04846-0fe5-b3e2-c2fb-665561607b13")
public static String es_PE_COLUMN_AD_Val_Rule_ID_Name="Validación";

@XendraColumn(AD_Element_ID="c0a45383-82fd-7e33-a355-80b15115b36b",ColumnName="AD_Val_Rule_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f0e04846-0fe5-b3e2-c2fb-665561607b13",
Synchronized="2017-08-16 11:33:28.0")
/** Column name AD_Val_Rule_ID */
public static final String COLUMNNAME_AD_Val_Rule_ID = "AD_Val_Rule_ID";
/** Set Agenda.
@param Agenda Agenda */
public void setAgenda (String Agenda)
{
if (Agenda != null && Agenda.length() > 255)
{
log.warning("Length > 255 - truncated");
Agenda = Agenda.substring(0,254);
}
set_Value (COLUMNNAME_Agenda, Agenda);
}
/** Get Agenda.
@return Agenda */
public String getAgenda() 
{
String value = (String)get_Value(COLUMNNAME_Agenda);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="53274fcf-3abe-481a-b72c-15c323186cea")
public static String es_PE_FIELD_Column_Agenda_Name="agenda";
@XendraField(AD_Column_ID="Agenda",
IsCentrallyMaintained=true,AD_Tab_ID="7f22e1b4-bc67-420c-0156-5b87df8c18b3",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=370,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2017-04-01 17:26:49.0",Identifier="53274fcf-3abe-481a-b72c-15c323186cea")
public static final String FIELDNAME_Column_Agenda="53274fcf-3abe-481a-b72c-15c323186cea";

@XendraTrl(Identifier="4ba45d55-f517-40ce-8f51-ee2182e1d9ee")
public static String es_PE_COLUMN_Agenda_Name="agenda";

@XendraColumn(AD_Element_ID="9a28df45-db39-4c17-9d9b-8595051b29ef",ColumnName="Agenda",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4ba45d55-f517-40ce-8f51-ee2182e1d9ee",
Synchronized="2017-08-16 11:33:28.0")
/** Column name Agenda */
public static final String COLUMNNAME_Agenda = "Agenda";
/** Set Callout.
@param Callout Fully qualified class NAMEs and method - separated by semicolons */
public void setCallout (String Callout)
{
if (Callout != null && Callout.length() > 255)
{
log.warning("Length > 255 - truncated");
Callout = Callout.substring(0,254);
}
set_Value (COLUMNNAME_Callout, Callout);
}
/** Get Callout.
@return Fully qualified class NAMEs and method - separated by semicolons */
public String getCallout() 
{
String value = (String)get_Value(COLUMNNAME_Callout);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="ca96c752-75b7-f7b1-86b2-c09c1f336ef7")
public static String es_PE_FIELD_Column_Callout_Description="Llamadas de función separadas por punto y coma; SE_/SL_/UE_/UL_ - 1st: System / User; 2nd: Enter / Leave; 3rd: _ Unserscore; - then function name.";

@XendraTrl(Identifier="ca96c752-75b7-f7b1-86b2-c09c1f336ef7")
public static String es_PE_FIELD_Column_Callout_Help="Llamadas de función separadas por punto y coma; SE_/SL_/UE_/UL_ - 1st: System / User; 2nd: Enter / Leave; 3rd: _ Unserscore; - then Function Name";

@XendraTrl(Identifier="ca96c752-75b7-f7b1-86b2-c09c1f336ef7")
public static String es_PE_FIELD_Column_Callout_Name="Llamada";
@XendraField(AD_Column_ID="Callout",
IsCentrallyMaintained=true,AD_Tab_ID="7f22e1b4-bc67-420c-0156-5b87df8c18b3",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=310,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="ca96c752-75b7-f7b1-86b2-c09c1f336ef7")
public static final String FIELDNAME_Column_Callout="ca96c752-75b7-f7b1-86b2-c09c1f336ef7";

@XendraTrl(Identifier="a7425c29-151b-486f-b477-246705a78030")
public static String es_PE_FIELD_UsedInColumn_Callout_Description="Llamadas de función separadas por punto y coma; SE_/SL_/UE_/UL_ - 1st: System / User; 2nd: Enter / Leave; 3rd: _ Unserscore; - then function name.";

@XendraTrl(Identifier="a7425c29-151b-486f-b477-246705a78030")
public static String es_PE_FIELD_UsedInColumn_Callout_Help="Llamadas de función separadas por punto y coma; SE_/SL_/UE_/UL_ - 1st: System / User; 2nd: Enter / Leave; 3rd: _ Unserscore; - then Function Name";

@XendraTrl(Identifier="a7425c29-151b-486f-b477-246705a78030")
public static String es_PE_FIELD_UsedInColumn_Callout_Name="Llamada";

@XendraField(AD_Column_ID="Callout",IsCentrallyMaintained=true,
AD_Tab_ID="f2864947-dcd5-98af-2bf0-a4e296b595b0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a7425c29-151b-486f-b477-246705a78030")
public static final String FIELDNAME_UsedInColumn_Callout="a7425c29-151b-486f-b477-246705a78030";

@XendraTrl(Identifier="e68e70a4-f1d4-e069-8d7e-0fe4755e2ec3")
public static String es_PE_FIELD_UsedInColumn_Callout2_Description="Llamadas de función separadas por punto y coma; SE_/SL_/UE_/UL_ - 1st: System / User; 2nd: Enter / Leave; 3rd: _ Unserscore; - then function name.";

@XendraTrl(Identifier="e68e70a4-f1d4-e069-8d7e-0fe4755e2ec3")
public static String es_PE_FIELD_UsedInColumn_Callout2_Help="Llamadas de función separadas por punto y coma; SE_/SL_/UE_/UL_ - 1st: System / User; 2nd: Enter / Leave; 3rd: _ Unserscore; - then Function Name";

@XendraTrl(Identifier="e68e70a4-f1d4-e069-8d7e-0fe4755e2ec3")
public static String es_PE_FIELD_UsedInColumn_Callout2_Name="Llamada";

@XendraField(AD_Column_ID="Callout",IsCentrallyMaintained=true,
AD_Tab_ID="896eb30c-0038-f362-1ef9-1b18df7727b8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e68e70a4-f1d4-e069-8d7e-0fe4755e2ec3")
public static final String FIELDNAME_UsedInColumn_Callout2="e68e70a4-f1d4-e069-8d7e-0fe4755e2ec3";

@XendraTrl(Identifier="ca67af7d-02b3-26a0-072a-f916fb927a2f")
public static String es_PE_FIELD_UsedInColumn_Callout3_Description="Llamadas de función separadas por punto y coma; SE_/SL_/UE_/UL_ - 1st: System / User; 2nd: Enter / Leave; 3rd: _ Unserscore; - then function name.";

@XendraTrl(Identifier="ca67af7d-02b3-26a0-072a-f916fb927a2f")
public static String es_PE_FIELD_UsedInColumn_Callout3_Help="Llamadas de función separadas por punto y coma; SE_/SL_/UE_/UL_ - 1st: System / User; 2nd: Enter / Leave; 3rd: _ Unserscore; - then Function Name";

@XendraTrl(Identifier="ca67af7d-02b3-26a0-072a-f916fb927a2f")
public static String es_PE_FIELD_UsedInColumn_Callout3_Name="Llamada";

@XendraField(AD_Column_ID="Callout",IsCentrallyMaintained=true,
AD_Tab_ID="45259391-7378-323f-de9f-b2a168722616",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ca67af7d-02b3-26a0-072a-f916fb927a2f")
public static final String FIELDNAME_UsedInColumn_Callout3="ca67af7d-02b3-26a0-072a-f916fb927a2f";

@XendraTrl(Identifier="0a00d452-d89b-be8a-68ec-ed0e4af53ede")
public static String es_PE_COLUMN_Callout_Name="Llamada";

@XendraColumn(AD_Element_ID="1041ce74-aa5e-c0d7-a1c1-ffb0202d26db",ColumnName="Callout",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0a00d452-d89b-be8a-68ec-ed0e4af53ede",
Synchronized="2017-08-16 11:33:28.0")
/** Column name Callout */
public static final String COLUMNNAME_Callout = "Callout";
/** Set DB Column Name.
@param ColumnName Name of the column in the database */
public void setColumnName (String ColumnName)
{
if (ColumnName == null) throw new IllegalArgumentException ("ColumnName is mandatory.");
if (ColumnName.length() > 40)
{
log.warning("Length > 40 - truncated");
ColumnName = ColumnName.substring(0,39);
}
set_Value (COLUMNNAME_ColumnName, ColumnName);
}
/** Get DB Column Name.
@return Name of the column in the database */
public String getColumnName() 
{
String value = (String)get_Value(COLUMNNAME_ColumnName);
if (value == null)
  return "";
return value;
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getColumnName());
}

@XendraTrl(Identifier="5150fbf8-fd8f-bf45-0184-1d338f496b4e")
public static String es_PE_FIELD_Column_DBColumnName_Description="Nombre de la columna en la base de datos";

@XendraTrl(Identifier="5150fbf8-fd8f-bf45-0184-1d338f496b4e")
public static String es_PE_FIELD_Column_DBColumnName_Help="Indica el nombre de una columna en una tabla como se definió en la base de datos.";

@XendraTrl(Identifier="5150fbf8-fd8f-bf45-0184-1d338f496b4e")
public static String es_PE_FIELD_Column_DBColumnName_Name="Nombre de Columna en BD";

@XendraField(AD_Column_ID="ColumnName",IsCentrallyMaintained=true,
AD_Tab_ID="7f22e1b4-bc67-420c-0156-5b87df8c18b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=29,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5150fbf8-fd8f-bf45-0184-1d338f496b4e")
public static final String FIELDNAME_Column_DBColumnName="5150fbf8-fd8f-bf45-0184-1d338f496b4e";

@XendraTrl(Identifier="ffc9a39e-d336-9d7f-026e-68191a188edd")
public static String es_PE_FIELD_UsedInColumn_DBColumnName_Description="Nombre de la columna en la base de datos";

@XendraTrl(Identifier="ffc9a39e-d336-9d7f-026e-68191a188edd")
public static String es_PE_FIELD_UsedInColumn_DBColumnName_Help="Indica el nombre de una columna en una tabla como se definió en la base de datos.";

@XendraTrl(Identifier="ffc9a39e-d336-9d7f-026e-68191a188edd")
public static String es_PE_FIELD_UsedInColumn_DBColumnName_Name="Nombre de Columna en BD";

@XendraField(AD_Column_ID="ColumnName",IsCentrallyMaintained=true,
AD_Tab_ID="f2864947-dcd5-98af-2bf0-a4e296b595b0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=true,SeqNo=20,SortNo=2,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ffc9a39e-d336-9d7f-026e-68191a188edd")
public static final String FIELDNAME_UsedInColumn_DBColumnName="ffc9a39e-d336-9d7f-026e-68191a188edd";

@XendraTrl(Identifier="68208dda-5f93-8e53-07a2-421ed31f8a5d")
public static String es_PE_FIELD_UsedInColumn_DBColumnName2_Description="Nombre de la columna en la base de datos";

@XendraTrl(Identifier="68208dda-5f93-8e53-07a2-421ed31f8a5d")
public static String es_PE_FIELD_UsedInColumn_DBColumnName2_Help="Indica el nombre de una columna en una tabla como se definió en la base de datos.";

@XendraTrl(Identifier="68208dda-5f93-8e53-07a2-421ed31f8a5d")
public static String es_PE_FIELD_UsedInColumn_DBColumnName2_Name="Nombre de Columna en BD";

@XendraField(AD_Column_ID="ColumnName",IsCentrallyMaintained=true,
AD_Tab_ID="896eb30c-0038-f362-1ef9-1b18df7727b8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="68208dda-5f93-8e53-07a2-421ed31f8a5d")
public static final String FIELDNAME_UsedInColumn_DBColumnName2="68208dda-5f93-8e53-07a2-421ed31f8a5d";

@XendraTrl(Identifier="54f464ae-1c90-56f4-f2aa-34e9fe7de726")
public static String es_PE_FIELD_UsedInColumn_DBColumnName3_Description="Nombre de la columna en la base de datos";

@XendraTrl(Identifier="54f464ae-1c90-56f4-f2aa-34e9fe7de726")
public static String es_PE_FIELD_UsedInColumn_DBColumnName3_Help="Indica el nombre de una columna en una tabla como se definió en la base de datos.";

@XendraTrl(Identifier="54f464ae-1c90-56f4-f2aa-34e9fe7de726")
public static String es_PE_FIELD_UsedInColumn_DBColumnName3_Name="Nombre de Columna en BD";

@XendraField(AD_Column_ID="ColumnName",IsCentrallyMaintained=true,
AD_Tab_ID="45259391-7378-323f-de9f-b2a168722616",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="54f464ae-1c90-56f4-f2aa-34e9fe7de726")
public static final String FIELDNAME_UsedInColumn_DBColumnName3="54f464ae-1c90-56f4-f2aa-34e9fe7de726";

@XendraTrl(Identifier="b2356e2e-364a-ec4a-90e9-fbbc739390a8")
public static String es_PE_COLUMN_ColumnName_Name="Nombre de Columna en BD";

@XendraColumn(AD_Element_ID="fadc32aa-cd31-3fee-f9b7-0daa53df76a7",ColumnName="ColumnName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b2356e2e-364a-ec4a-90e9-fbbc739390a8",
Synchronized="2017-08-16 11:33:28.0")
/** Column name ColumnName */
public static final String COLUMNNAME_ColumnName = "ColumnName";
/** Set Column SQL.
@param ColumnSQL Virtual Column (r/o) */
public void setColumnSQL (String ColumnSQL)
{
if (ColumnSQL != null && ColumnSQL.length() > 2000)
{
log.warning("Length > 2000 - truncated");
ColumnSQL = ColumnSQL.substring(0,1999);
}
set_Value (COLUMNNAME_ColumnSQL, ColumnSQL);
}
/** Get Column SQL.
@return Virtual Column (r/o) */
public String getColumnSQL() 
{
String value = (String)get_Value(COLUMNNAME_ColumnSQL);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="ab3c2b47-7bce-f614-2428-81e0a42552fb")
public static String es_PE_FIELD_Column_ColumnSQL_Description="Columna Virtual (r/o)";

@XendraTrl(Identifier="ab3c2b47-7bce-f614-2428-81e0a42552fb")
public static String es_PE_FIELD_Column_ColumnSQL_Help="Usted puede definir las columnas virtuales (no almacenadas en la base de datos). Si está definido, el nombre de la columna es el sinónimo de la expresión del SQL definida aquí. La expresión del SQL debe ser valida.<br > ejemplo:  \"Actualizado-Creado\" enumeraría la edad de la entrada en días.";

@XendraTrl(Identifier="ab3c2b47-7bce-f614-2428-81e0a42552fb")
public static String es_PE_FIELD_Column_ColumnSQL_Name="Columna SQL";

@XendraField(AD_Column_ID="ColumnSQL",IsCentrallyMaintained=true,
AD_Tab_ID="7f22e1b4-bc67-420c-0156-5b87df8c18b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ab3c2b47-7bce-f614-2428-81e0a42552fb")
public static final String FIELDNAME_Column_ColumnSQL="ab3c2b47-7bce-f614-2428-81e0a42552fb";

@XendraTrl(Identifier="c6477d13-f1d7-acf1-19d3-bc7ef09fe37a")
public static String es_PE_FIELD_UsedInColumn_ColumnSQL_Description="Columna Virtual (r/o)";

@XendraTrl(Identifier="c6477d13-f1d7-acf1-19d3-bc7ef09fe37a")
public static String es_PE_FIELD_UsedInColumn_ColumnSQL_Help="Usted puede definir las columnas virtuales (no almacenadas en la base de datos). Si está definido, el nombre de la columna es el sinónimo de la expresión del SQL definida aquí. La expresión del SQL debe ser valida.<br > ejemplo:  \"Actualizado-Creado\" enumeraría la edad de la entrada en días.";

@XendraTrl(Identifier="c6477d13-f1d7-acf1-19d3-bc7ef09fe37a")
public static String es_PE_FIELD_UsedInColumn_ColumnSQL_Name="Columna SQL";

@XendraField(AD_Column_ID="ColumnSQL",IsCentrallyMaintained=true,
AD_Tab_ID="f2864947-dcd5-98af-2bf0-a4e296b595b0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c6477d13-f1d7-acf1-19d3-bc7ef09fe37a")
public static final String FIELDNAME_UsedInColumn_ColumnSQL="c6477d13-f1d7-acf1-19d3-bc7ef09fe37a";

@XendraTrl(Identifier="495b6a77-57f4-0b7e-fae7-02cf2df90549")
public static String es_PE_FIELD_UsedInColumn_ColumnSQL2_Description="Columna Virtual (r/o)";

@XendraTrl(Identifier="495b6a77-57f4-0b7e-fae7-02cf2df90549")
public static String es_PE_FIELD_UsedInColumn_ColumnSQL2_Help="Usted puede definir las columnas virtuales (no almacenadas en la base de datos). Si está definido, el nombre de la columna es el sinónimo de la expresión del SQL definida aquí. La expresión del SQL debe ser valida.<br > ejemplo:  \"Actualizado-Creado\" enumeraría la edad de la entrada en días.";

@XendraTrl(Identifier="495b6a77-57f4-0b7e-fae7-02cf2df90549")
public static String es_PE_FIELD_UsedInColumn_ColumnSQL2_Name="Columna SQL";

@XendraField(AD_Column_ID="ColumnSQL",IsCentrallyMaintained=true,
AD_Tab_ID="896eb30c-0038-f362-1ef9-1b18df7727b8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="495b6a77-57f4-0b7e-fae7-02cf2df90549")
public static final String FIELDNAME_UsedInColumn_ColumnSQL2="495b6a77-57f4-0b7e-fae7-02cf2df90549";

@XendraTrl(Identifier="e003c3e5-4f20-5f79-b4c0-ee5ac2fdafd6")
public static String es_PE_FIELD_UsedInColumn_ColumnSQL3_Description="Columna Virtual (r/o)";

@XendraTrl(Identifier="e003c3e5-4f20-5f79-b4c0-ee5ac2fdafd6")
public static String es_PE_FIELD_UsedInColumn_ColumnSQL3_Help="Usted puede definir las columnas virtuales (no almacenadas en la base de datos). Si está definido, el nombre de la columna es el sinónimo de la expresión del SQL definida aquí. La expresión del SQL debe ser valida.<br > ejemplo:  \"Actualizado-Creado\" enumeraría la edad de la entrada en días.";

@XendraTrl(Identifier="e003c3e5-4f20-5f79-b4c0-ee5ac2fdafd6")
public static String es_PE_FIELD_UsedInColumn_ColumnSQL3_Name="Columna SQL";

@XendraField(AD_Column_ID="ColumnSQL",IsCentrallyMaintained=true,
AD_Tab_ID="45259391-7378-323f-de9f-b2a168722616",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e003c3e5-4f20-5f79-b4c0-ee5ac2fdafd6")
public static final String FIELDNAME_UsedInColumn_ColumnSQL3="e003c3e5-4f20-5f79-b4c0-ee5ac2fdafd6";

@XendraTrl(Identifier="edb134eb-d202-5ed4-a101-58acc12e523b")
public static String es_PE_COLUMN_ColumnSQL_Name="Columna SQL";

@XendraColumn(AD_Element_ID="4d5be23f-2ffd-ca83-8ea2-bc7b4d29ea78",ColumnName="ColumnSQL",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="edb134eb-d202-5ed4-a101-58acc12e523b",
Synchronized="2017-08-16 11:33:28.0")
/** Column name ColumnSQL */
public static final String COLUMNNAME_ColumnSQL = "ColumnSQL";
/** Set Default Logic.
@param DefaultValue Default value hierarchy, separated by : */
public void setDefaultValue (String DefaultValue)
{
set_Value (COLUMNNAME_DefaultValue, DefaultValue);
}
/** Get Default Logic.
@return Default value hierarchy, separated by : */
public String getDefaultValue() 
{
String value = (String)get_Value(COLUMNNAME_DefaultValue);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="ef49fa60-cd9b-4410-c3aa-f9e421f3452c")
public static String es_PE_FIELD_Column_DefaultLogic_Description="Jerarquía de valores predeterminados; separados por ;";

@XendraTrl(Identifier="ef49fa60-cd9b-4410-c3aa-f9e421f3452c")
public static String es_PE_FIELD_Column_DefaultLogic_Help="Los valores predeterminados son evaluados en el orden de la definición; el primer valor no nulo de la columna  llega a ser el valor predeterminado. Los valores son separados por coma ó punto y coma.";

@XendraTrl(Identifier="ef49fa60-cd9b-4410-c3aa-f9e421f3452c")
public static String es_PE_FIELD_Column_DefaultLogic_Name="Lógica Predeterminada";

@XendraField(AD_Column_ID="DefaultValue",IsCentrallyMaintained=true,
AD_Tab_ID="7f22e1b4-bc67-420c-0156-5b87df8c18b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ef49fa60-cd9b-4410-c3aa-f9e421f3452c")
public static final String FIELDNAME_Column_DefaultLogic="ef49fa60-cd9b-4410-c3aa-f9e421f3452c";

@XendraTrl(Identifier="0b976383-b193-c36c-38ee-d8a1476098ba")
public static String es_PE_FIELD_UsedInColumn_DefaultLogic_Description="Jerarquía de valores predeterminados; separados por ;";

@XendraTrl(Identifier="0b976383-b193-c36c-38ee-d8a1476098ba")
public static String es_PE_FIELD_UsedInColumn_DefaultLogic_Help="Los valores predeterminados son evaluados en el orden de la definición; el primer valor no nulo de la columna  llega a ser el valor predeterminado. Los valores son separados por coma ó punto y coma.";

@XendraTrl(Identifier="0b976383-b193-c36c-38ee-d8a1476098ba")
public static String es_PE_FIELD_UsedInColumn_DefaultLogic_Name="Lógica Predeterminada";

@XendraField(AD_Column_ID="DefaultValue",IsCentrallyMaintained=true,
AD_Tab_ID="f2864947-dcd5-98af-2bf0-a4e296b595b0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0b976383-b193-c36c-38ee-d8a1476098ba")
public static final String FIELDNAME_UsedInColumn_DefaultLogic="0b976383-b193-c36c-38ee-d8a1476098ba";

@XendraTrl(Identifier="a867ef20-1d7c-a6d3-670f-f6ff030fd793")
public static String es_PE_FIELD_UsedInColumn_DefaultLogic2_Description="Jerarquía de valores predeterminados; separados por ;";

@XendraTrl(Identifier="a867ef20-1d7c-a6d3-670f-f6ff030fd793")
public static String es_PE_FIELD_UsedInColumn_DefaultLogic2_Help="Los valores predeterminados son evaluados en el orden de la definición; el primer valor no nulo de la columna  llega a ser el valor predeterminado. Los valores son separados por coma ó punto y coma.";

@XendraTrl(Identifier="a867ef20-1d7c-a6d3-670f-f6ff030fd793")
public static String es_PE_FIELD_UsedInColumn_DefaultLogic2_Name="Lógica Predeterminada";

@XendraField(AD_Column_ID="DefaultValue",IsCentrallyMaintained=true,
AD_Tab_ID="896eb30c-0038-f362-1ef9-1b18df7727b8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=2000,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a867ef20-1d7c-a6d3-670f-f6ff030fd793")
public static final String FIELDNAME_UsedInColumn_DefaultLogic2="a867ef20-1d7c-a6d3-670f-f6ff030fd793";

@XendraTrl(Identifier="b002175a-7fed-18dd-4fca-5cc7dfc475c6")
public static String es_PE_FIELD_UsedInColumn_DefaultLogic3_Description="Jerarquía de valores predeterminados; separados por ;";

@XendraTrl(Identifier="b002175a-7fed-18dd-4fca-5cc7dfc475c6")
public static String es_PE_FIELD_UsedInColumn_DefaultLogic3_Help="Los valores predeterminados son evaluados en el orden de la definición; el primer valor no nulo de la columna  llega a ser el valor predeterminado. Los valores son separados por coma ó punto y coma.";

@XendraTrl(Identifier="b002175a-7fed-18dd-4fca-5cc7dfc475c6")
public static String es_PE_FIELD_UsedInColumn_DefaultLogic3_Name="Lógica Predeterminada";

@XendraField(AD_Column_ID="DefaultValue",IsCentrallyMaintained=true,
AD_Tab_ID="45259391-7378-323f-de9f-b2a168722616",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=2000,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b002175a-7fed-18dd-4fca-5cc7dfc475c6")
public static final String FIELDNAME_UsedInColumn_DefaultLogic3="b002175a-7fed-18dd-4fca-5cc7dfc475c6";

@XendraTrl(Identifier="94bc9be2-d9b7-3939-2b11-d1e8c0dd1bea")
public static String es_PE_COLUMN_DefaultValue_Name="Lógica Predeterminada";

@XendraColumn(AD_Element_ID="85c6e06b-cd4c-c419-f8e4-9e93236b9219",ColumnName="DefaultValue",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="94bc9be2-d9b7-3939-2b11-d1e8c0dd1bea",
Synchronized="2017-08-16 11:33:28.0")
/** Column name DefaultValue */
public static final String COLUMNNAME_DefaultValue = "DefaultValue";
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

@XendraTrl(Identifier="67685454-f529-06fa-0744-ff56b9d2620c")
public static String es_PE_FIELD_Column_Description_Description="Observación";

@XendraTrl(Identifier="67685454-f529-06fa-0744-ff56b9d2620c")
public static String es_PE_FIELD_Column_Description_Help="Observación";

@XendraTrl(Identifier="67685454-f529-06fa-0744-ff56b9d2620c")
public static String es_PE_FIELD_Column_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="7f22e1b4-bc67-420c-0156-5b87df8c18b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="67685454-f529-06fa-0744-ff56b9d2620c")
public static final String FIELDNAME_Column_Description="67685454-f529-06fa-0744-ff56b9d2620c";

@XendraTrl(Identifier="f967ca2f-cebc-1d0e-4351-58c59b125b81")
public static String es_PE_FIELD_UsedInColumn_Description_Description="Observación";

@XendraTrl(Identifier="f967ca2f-cebc-1d0e-4351-58c59b125b81")
public static String es_PE_FIELD_UsedInColumn_Description_Help="Observación";

@XendraTrl(Identifier="f967ca2f-cebc-1d0e-4351-58c59b125b81")
public static String es_PE_FIELD_UsedInColumn_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="f2864947-dcd5-98af-2bf0-a4e296b595b0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f967ca2f-cebc-1d0e-4351-58c59b125b81")
public static final String FIELDNAME_UsedInColumn_Description="f967ca2f-cebc-1d0e-4351-58c59b125b81";

@XendraTrl(Identifier="0defeedf-caa0-b141-e478-5a17bbd748a8")
public static String es_PE_FIELD_UsedInColumn_Description2_Description="Observación";

@XendraTrl(Identifier="0defeedf-caa0-b141-e478-5a17bbd748a8")
public static String es_PE_FIELD_UsedInColumn_Description2_Help="Observación";

@XendraTrl(Identifier="0defeedf-caa0-b141-e478-5a17bbd748a8")
public static String es_PE_FIELD_UsedInColumn_Description2_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="896eb30c-0038-f362-1ef9-1b18df7727b8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0defeedf-caa0-b141-e478-5a17bbd748a8")
public static final String FIELDNAME_UsedInColumn_Description2="0defeedf-caa0-b141-e478-5a17bbd748a8";

@XendraTrl(Identifier="3b4cea2a-78a3-86b1-ef20-296a9aa1ab63")
public static String es_PE_FIELD_UsedInColumn_Description3_Description="Observación";

@XendraTrl(Identifier="3b4cea2a-78a3-86b1-ef20-296a9aa1ab63")
public static String es_PE_FIELD_UsedInColumn_Description3_Help="Observación";

@XendraTrl(Identifier="3b4cea2a-78a3-86b1-ef20-296a9aa1ab63")
public static String es_PE_FIELD_UsedInColumn_Description3_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="45259391-7378-323f-de9f-b2a168722616",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3b4cea2a-78a3-86b1-ef20-296a9aa1ab63")
public static final String FIELDNAME_UsedInColumn_Description3="3b4cea2a-78a3-86b1-ef20-296a9aa1ab63";

@XendraTrl(Identifier="718dcd80-008d-37c2-440e-71092ba93894")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="718dcd80-008d-37c2-440e-71092ba93894",
Synchronized="2017-08-16 11:33:28.0")
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

@XendraTrl(Identifier="45b6c935-457a-e98f-6d48-379179cea763")
public static String es_PE_FIELD_Column_EntityType_Description="Tipo de Entidad Diccionario; determina propiedad y sincronización";

@XendraTrl(Identifier="45b6c935-457a-e98f-6d48-379179cea763")
public static String es_PE_FIELD_Column_EntityType_Help="Los tipos de entidad \"Diccionario\"; \"Adempiere\"; y \"Aplicación\" podrían ser automáticamente sincronizados y las personalizaciones eliminadas ó sobreescritas";

@XendraTrl(Identifier="45b6c935-457a-e98f-6d48-379179cea763")
public static String es_PE_FIELD_Column_EntityType_Name="Tipo de Entidad";

@XendraField(AD_Column_ID="EntityType",IsCentrallyMaintained=true,
AD_Tab_ID="7f22e1b4-bc67-420c-0156-5b87df8c18b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=340,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="45b6c935-457a-e98f-6d48-379179cea763")
public static final String FIELDNAME_Column_EntityType="45b6c935-457a-e98f-6d48-379179cea763";

@XendraTrl(Identifier="cfc9eb70-719d-a1a8-df16-6f77cfddaca6")
public static String es_PE_FIELD_UsedInColumn_EntityType_Description="Tipo de Entidad Diccionario; determina propiedad y sincronización";

@XendraTrl(Identifier="cfc9eb70-719d-a1a8-df16-6f77cfddaca6")
public static String es_PE_FIELD_UsedInColumn_EntityType_Help="Los tipos de entidad \"Diccionario\"; \"Adempiere\"; y \"Aplicación\" podrían ser automáticamente sincronizados y las personalizaciones eliminadas ó sobreescritas";

@XendraTrl(Identifier="cfc9eb70-719d-a1a8-df16-6f77cfddaca6")
public static String es_PE_FIELD_UsedInColumn_EntityType_Name="Tipo de Entidad";

@XendraField(AD_Column_ID="EntityType",IsCentrallyMaintained=true,
AD_Tab_ID="f2864947-dcd5-98af-2bf0-a4e296b595b0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cfc9eb70-719d-a1a8-df16-6f77cfddaca6")
public static final String FIELDNAME_UsedInColumn_EntityType="cfc9eb70-719d-a1a8-df16-6f77cfddaca6";

@XendraTrl(Identifier="524b329b-3e53-a2db-9e96-bf21f2235738")
public static String es_PE_FIELD_UsedInColumn_EntityType2_Description="Tipo de Entidad Diccionario; determina propiedad y sincronización";

@XendraTrl(Identifier="524b329b-3e53-a2db-9e96-bf21f2235738")
public static String es_PE_FIELD_UsedInColumn_EntityType2_Help="Los tipos de entidad \"Diccionario\"; \"Adempiere\"; y \"Aplicación\" podrían ser automáticamente sincronizados y las personalizaciones eliminadas ó sobreescritas";

@XendraTrl(Identifier="524b329b-3e53-a2db-9e96-bf21f2235738")
public static String es_PE_FIELD_UsedInColumn_EntityType2_Name="Tipo de Entidad";

@XendraField(AD_Column_ID="EntityType",IsCentrallyMaintained=true,
AD_Tab_ID="896eb30c-0038-f362-1ef9-1b18df7727b8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=4,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="524b329b-3e53-a2db-9e96-bf21f2235738")
public static final String FIELDNAME_UsedInColumn_EntityType2="524b329b-3e53-a2db-9e96-bf21f2235738";

@XendraTrl(Identifier="1810c1ab-5d97-939d-6f94-d547505f6c60")
public static String es_PE_FIELD_UsedInColumn_EntityType3_Description="Tipo de Entidad Diccionario; determina propiedad y sincronización";

@XendraTrl(Identifier="1810c1ab-5d97-939d-6f94-d547505f6c60")
public static String es_PE_FIELD_UsedInColumn_EntityType3_Help="Los tipos de entidad \"Diccionario\"; \"Adempiere\"; y \"Aplicación\" podrían ser automáticamente sincronizados y las personalizaciones eliminadas ó sobreescritas";

@XendraTrl(Identifier="1810c1ab-5d97-939d-6f94-d547505f6c60")
public static String es_PE_FIELD_UsedInColumn_EntityType3_Name="Tipo de Entidad";

@XendraField(AD_Column_ID="EntityType",IsCentrallyMaintained=true,
AD_Tab_ID="45259391-7378-323f-de9f-b2a168722616",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=4,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1810c1ab-5d97-939d-6f94-d547505f6c60")
public static final String FIELDNAME_UsedInColumn_EntityType3="1810c1ab-5d97-939d-6f94-d547505f6c60";

@XendraTrl(Identifier="4cc0bd62-1a6c-0d62-009a-efa1995b449a")
public static String es_PE_COLUMN_EntityType_Name="Tipo de Entidad";

@XendraColumn(AD_Element_ID="5ba917bf-871c-6f19-aa50-962adc5de558",ColumnName="EntityType",
AD_Reference_ID=18,AD_Reference_Value_ID="fae4ad31-8ff1-5d5c-8d47-2426c541cd74",AD_Val_Rule_ID="",
FieldLength=4,DefaultValue="U",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="@EntityType@=D",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="4cc0bd62-1a6c-0d62-009a-efa1995b449a",Synchronized="2017-08-16 11:33:29.0")
/** Column name EntityType */
public static final String COLUMNNAME_EntityType = "EntityType";
/** Set Length.
@param FieldLength Length of the column in the database */
public void setFieldLength (int FieldLength)
{
set_Value (COLUMNNAME_FieldLength, Integer.valueOf(FieldLength));
}
/** Get Length.
@return Length of the column in the database */
public int getFieldLength() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_FieldLength);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f7617257-503a-bc7c-31f7-38f79b6896d1")
public static String es_PE_FIELD_Column_Length_Description="Longitud de la columna en la base de datos.";

@XendraTrl(Identifier="f7617257-503a-bc7c-31f7-38f79b6896d1")
public static String es_PE_FIELD_Column_Length_Help="La longitud indica la longitud de una columna tal como se definió en la base de datos.";

@XendraTrl(Identifier="f7617257-503a-bc7c-31f7-38f79b6896d1")
public static String es_PE_FIELD_Column_Length_Name="Longitud";

@XendraField(AD_Column_ID="FieldLength",IsCentrallyMaintained=true,
AD_Tab_ID="7f22e1b4-bc67-420c-0156-5b87df8c18b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f7617257-503a-bc7c-31f7-38f79b6896d1")
public static final String FIELDNAME_Column_Length="f7617257-503a-bc7c-31f7-38f79b6896d1";

@XendraTrl(Identifier="7e266ea0-219a-f4a3-7399-4049992ecccd")
public static String es_PE_FIELD_UsedInColumn_Length_Description="Longitud de la columna en la base de datos.";

@XendraTrl(Identifier="7e266ea0-219a-f4a3-7399-4049992ecccd")
public static String es_PE_FIELD_UsedInColumn_Length_Help="La longitud indica la longitud de una columna tal como se definió en la base de datos.";

@XendraTrl(Identifier="7e266ea0-219a-f4a3-7399-4049992ecccd")
public static String es_PE_FIELD_UsedInColumn_Length_Name="Longitud";

@XendraField(AD_Column_ID="FieldLength",IsCentrallyMaintained=true,
AD_Tab_ID="f2864947-dcd5-98af-2bf0-a4e296b595b0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7e266ea0-219a-f4a3-7399-4049992ecccd")
public static final String FIELDNAME_UsedInColumn_Length="7e266ea0-219a-f4a3-7399-4049992ecccd";

@XendraTrl(Identifier="9c4b41bb-0df1-0519-a3a4-07c1541d9648")
public static String es_PE_FIELD_UsedInColumn_Length2_Description="Longitud de la columna en la base de datos.";

@XendraTrl(Identifier="9c4b41bb-0df1-0519-a3a4-07c1541d9648")
public static String es_PE_FIELD_UsedInColumn_Length2_Help="La longitud indica la longitud de una columna tal como se definió en la base de datos.";

@XendraTrl(Identifier="9c4b41bb-0df1-0519-a3a4-07c1541d9648")
public static String es_PE_FIELD_UsedInColumn_Length2_Name="Longitud";

@XendraField(AD_Column_ID="FieldLength",IsCentrallyMaintained=true,
AD_Tab_ID="896eb30c-0038-f362-1ef9-1b18df7727b8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9c4b41bb-0df1-0519-a3a4-07c1541d9648")
public static final String FIELDNAME_UsedInColumn_Length2="9c4b41bb-0df1-0519-a3a4-07c1541d9648";

@XendraTrl(Identifier="bcc490f3-a883-b85c-7d97-7d6677f49033")
public static String es_PE_FIELD_UsedInColumn_Length3_Description="Longitud de la columna en la base de datos.";

@XendraTrl(Identifier="bcc490f3-a883-b85c-7d97-7d6677f49033")
public static String es_PE_FIELD_UsedInColumn_Length3_Help="La longitud indica la longitud de una columna tal como se definió en la base de datos.";

@XendraTrl(Identifier="bcc490f3-a883-b85c-7d97-7d6677f49033")
public static String es_PE_FIELD_UsedInColumn_Length3_Name="Longitud";

@XendraField(AD_Column_ID="FieldLength",IsCentrallyMaintained=true,
AD_Tab_ID="45259391-7378-323f-de9f-b2a168722616",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bcc490f3-a883-b85c-7d97-7d6677f49033")
public static final String FIELDNAME_UsedInColumn_Length3="bcc490f3-a883-b85c-7d97-7d6677f49033";

@XendraTrl(Identifier="c9a1e086-da7e-be7b-5377-7cb5123bb71a")
public static String es_PE_COLUMN_FieldLength_Name="Longitud";

@XendraColumn(AD_Element_ID="6b33873b-028e-abd7-6aea-0aec9b6e54e1",ColumnName="FieldLength",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c9a1e086-da7e-be7b-5377-7cb5123bb71a",
Synchronized="2017-08-16 11:33:29.0")
/** Column name FieldLength */
public static final String COLUMNNAME_FieldLength = "FieldLength";
/** Set FormatPattern.
@param FormatPattern FormatPattern */
public void setFormatPattern (String FormatPattern)
{
if (FormatPattern != null && FormatPattern.length() > 22)
{
log.warning("Length > 22 - truncated");
FormatPattern = FormatPattern.substring(0,21);
}
set_Value (COLUMNNAME_FormatPattern, FormatPattern);
}
/** Get FormatPattern.
@return FormatPattern */
public String getFormatPattern() 
{
String value = (String)get_Value(COLUMNNAME_FormatPattern);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="5f393452-4202-412c-84ec-b3ba03e3bef9")
public static String es_PE_FIELD_Column_FormatPattern_Name="FormatPattern";

@XendraField(AD_Column_ID="FormatPattern",IsCentrallyMaintained=true,
AD_Tab_ID="7f22e1b4-bc67-420c-0156-5b87df8c18b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=380,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-04-01 17:26:49.0",
Identifier="5f393452-4202-412c-84ec-b3ba03e3bef9")
public static final String FIELDNAME_Column_FormatPattern="5f393452-4202-412c-84ec-b3ba03e3bef9";

@XendraTrl(Identifier="375fc8fd-73fc-85b5-4e8d-51eccbbf4281")
public static String es_PE_COLUMN_FormatPattern_Name="FormatPattern";

@XendraColumn(AD_Element_ID="32a01b46-dbdc-64d9-1360-90d0808210a6",ColumnName="FormatPattern",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="375fc8fd-73fc-85b5-4e8d-51eccbbf4281",
Synchronized="2017-08-16 11:33:29.0")
/** Column name FormatPattern */
public static final String COLUMNNAME_FormatPattern = "FormatPattern";
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

@XendraTrl(Identifier="f404d619-a37a-510e-b1e3-4ccace145001")
public static String es_PE_FIELD_Column_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="f404d619-a37a-510e-b1e3-4ccace145001")
public static String es_PE_FIELD_Column_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="f404d619-a37a-510e-b1e3-4ccace145001")
public static String es_PE_FIELD_Column_CommentHelp_Name="Ayuda";
@XendraField(AD_Column_ID="Help",
IsCentrallyMaintained=true,AD_Tab_ID="7f22e1b4-bc67-420c-0156-5b87df8c18b3",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=90,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="f404d619-a37a-510e-b1e3-4ccace145001")
public static final String FIELDNAME_Column_CommentHelp="f404d619-a37a-510e-b1e3-4ccace145001";

@XendraTrl(Identifier="03d00944-7a87-a94e-309a-998554e1d59a")
public static String es_PE_FIELD_UsedInColumn_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="03d00944-7a87-a94e-309a-998554e1d59a")
public static String es_PE_FIELD_UsedInColumn_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="03d00944-7a87-a94e-309a-998554e1d59a")
public static String es_PE_FIELD_UsedInColumn_CommentHelp_Name="Ayuda";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="f2864947-dcd5-98af-2bf0-a4e296b595b0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="03d00944-7a87-a94e-309a-998554e1d59a")
public static final String FIELDNAME_UsedInColumn_CommentHelp="03d00944-7a87-a94e-309a-998554e1d59a";

@XendraTrl(Identifier="482005e4-cedb-ec57-7e0e-d91851b781a6")
public static String es_PE_FIELD_UsedInColumn_CommentHelp2_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="482005e4-cedb-ec57-7e0e-d91851b781a6")
public static String es_PE_FIELD_UsedInColumn_CommentHelp2_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="482005e4-cedb-ec57-7e0e-d91851b781a6")
public static String es_PE_FIELD_UsedInColumn_CommentHelp2_Name="Ayuda";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="896eb30c-0038-f362-1ef9-1b18df7727b8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2000,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="482005e4-cedb-ec57-7e0e-d91851b781a6")
public static final String FIELDNAME_UsedInColumn_CommentHelp2="482005e4-cedb-ec57-7e0e-d91851b781a6";

@XendraTrl(Identifier="e8858d82-7064-0763-e1a8-83b2afba97a3")
public static String es_PE_FIELD_UsedInColumn_CommentHelp3_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="e8858d82-7064-0763-e1a8-83b2afba97a3")
public static String es_PE_FIELD_UsedInColumn_CommentHelp3_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="e8858d82-7064-0763-e1a8-83b2afba97a3")
public static String es_PE_FIELD_UsedInColumn_CommentHelp3_Name="Ayuda";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="45259391-7378-323f-de9f-b2a168722616",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2000,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e8858d82-7064-0763-e1a8-83b2afba97a3")
public static final String FIELDNAME_UsedInColumn_CommentHelp3="e8858d82-7064-0763-e1a8-83b2afba97a3";

@XendraTrl(Identifier="131cd556-7ac4-04f7-f641-e7d6779aa8dd")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="131cd556-7ac4-04f7-f641-e7d6779aa8dd",
Synchronized="2017-08-16 11:33:29.0")
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
@XendraTrl(Identifier="131225ce-fcd0-44e0-a73e-c20cf14fb52a")
public static String es_PE_FIELD_Column_Identifier_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="7f22e1b4-bc67-420c-0156-5b87df8c18b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=36,IsReadOnly=false,SeqNo=390,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-04-01 17:26:49.0",
Identifier="131225ce-fcd0-44e0-a73e-c20cf14fb52a")
public static final String FIELDNAME_Column_Identifier="131225ce-fcd0-44e0-a73e-c20cf14fb52a";

@XendraTrl(Identifier="61f0d4fa-3846-4fd0-be0d-94a84a6e8c2c")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="61f0d4fa-3846-4fd0-be0d-94a84a6e8c2c",
Synchronized="2017-08-16 11:33:29.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set InfoFactoryClass.
@param InfoFactoryClass InfoFactoryClass */
public void setInfoFactoryClass (String InfoFactoryClass)
{
if (InfoFactoryClass != null && InfoFactoryClass.length() > 255)
{
log.warning("Length > 255 - truncated");
InfoFactoryClass = InfoFactoryClass.substring(0,254);
}
set_Value (COLUMNNAME_InfoFactoryClass, InfoFactoryClass);
}
/** Get InfoFactoryClass.
@return InfoFactoryClass */
public String getInfoFactoryClass() 
{
String value = (String)get_Value(COLUMNNAME_InfoFactoryClass);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="b99bea9a-acd3-4bb0-95e4-3f94059f6d62")
public static String es_PE_FIELD_Column_InfoFactoryClass_Name="infofactoryclass";

@XendraField(AD_Column_ID="InfoFactoryClass",IsCentrallyMaintained=true,
AD_Tab_ID="7f22e1b4-bc67-420c-0156-5b87df8c18b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=400,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-04-01 17:26:49.0",
Identifier="b99bea9a-acd3-4bb0-95e4-3f94059f6d62")
public static final String FIELDNAME_Column_InfoFactoryClass="b99bea9a-acd3-4bb0-95e4-3f94059f6d62";

@XendraTrl(Identifier="20341601-2fd8-bdfb-d99d-077f51ae0579")
public static String es_PE_COLUMN_InfoFactoryClass_Name="InfoFactoryClass";

@XendraColumn(AD_Element_ID="b5b3ea5a-b643-cadc-a98b-d0c27368b16c",ColumnName="InfoFactoryClass",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="20341601-2fd8-bdfb-d99d-077f51ae0579",
Synchronized="2017-08-16 11:33:29.0")
/** Column name InfoFactoryClass */
public static final String COLUMNNAME_InfoFactoryClass = "InfoFactoryClass";
/** Set IsAllowLogging.
@param IsAllowLogging IsAllowLogging */
public void setIsAllowLogging (boolean IsAllowLogging)
{
set_Value (COLUMNNAME_IsAllowLogging, Boolean.valueOf(IsAllowLogging));
}
/** Get IsAllowLogging.
@return IsAllowLogging */
public boolean isAllowLogging() 
{
Object oo = get_Value(COLUMNNAME_IsAllowLogging);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="fd8fa243-d5a2-4e79-a3eb-793d2c42d1db")
public static String es_PE_FIELD_Column_IsAllowLogging_Name="IsAllowLogging";

@XendraField(AD_Column_ID="IsAllowLogging",IsCentrallyMaintained=true,
AD_Tab_ID="7f22e1b4-bc67-420c-0156-5b87df8c18b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=410,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-04-01 17:26:49.0",
Identifier="fd8fa243-d5a2-4e79-a3eb-793d2c42d1db")
public static final String FIELDNAME_Column_IsAllowLogging="fd8fa243-d5a2-4e79-a3eb-793d2c42d1db";

@XendraTrl(Identifier="3852bb02-a4de-dcfd-b2b2-387eae70277c")
public static String es_PE_COLUMN_IsAllowLogging_Name="IsAllowLogging";

@XendraColumn(AD_Element_ID="c48c4054-a70f-0501-1174-6754a3d0ed9e",ColumnName="IsAllowLogging",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3852bb02-a4de-dcfd-b2b2-387eae70277c",
Synchronized="2017-08-16 11:33:29.0")
/** Column name IsAllowLogging */
public static final String COLUMNNAME_IsAllowLogging = "IsAllowLogging";
/** Set Always Updateable.
@param IsAlwaysUpdateable The column is always updateable, even if the record is not active or processed */
public void setIsAlwaysUpdateable (boolean IsAlwaysUpdateable)
{
set_Value (COLUMNNAME_IsAlwaysUpdateable, Boolean.valueOf(IsAlwaysUpdateable));
}
/** Get Always Updateable.
@return The column is always updateable, even if the record is not active or processed */
public boolean isAlwaysUpdateable() 
{
Object oo = get_Value(COLUMNNAME_IsAlwaysUpdateable);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="b2f4f10f-8b85-5ab8-17de-847bbdb9228d")
public static String es_PE_FIELD_Column_AlwaysUpdateable_Description="La columna siempre es actualizable, incluso si el expediente no es activo ó procesado.";

@XendraTrl(Identifier="b2f4f10f-8b85-5ab8-17de-847bbdb9228d")
public static String es_PE_FIELD_Column_AlwaysUpdateable_Help="Si esta seleccionado y si la ventana / la tabla no se lee solamente, usted puede poner al día siempre la columna. Esto puede ser útil para los comentarios, etc.";

@XendraTrl(Identifier="b2f4f10f-8b85-5ab8-17de-847bbdb9228d")
public static String es_PE_FIELD_Column_AlwaysUpdateable_Name="Siempre Actualizable";

@XendraField(AD_Column_ID="IsAlwaysUpdateable",IsCentrallyMaintained=true,
AD_Tab_ID="7f22e1b4-bc67-420c-0156-5b87df8c18b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsUpdateable@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=270,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="b2f4f10f-8b85-5ab8-17de-847bbdb9228d")
public static final String FIELDNAME_Column_AlwaysUpdateable="b2f4f10f-8b85-5ab8-17de-847bbdb9228d";

@XendraTrl(Identifier="be4b0390-1334-d7f1-9f1f-a57335f77606")
public static String es_PE_FIELD_UsedInColumn_AlwaysUpdateable_Description="La columna siempre es actualizable, incluso si el expediente no es activo ó procesado.";

@XendraTrl(Identifier="be4b0390-1334-d7f1-9f1f-a57335f77606")
public static String es_PE_FIELD_UsedInColumn_AlwaysUpdateable_Help="Si esta seleccionado y si la ventana / la tabla no se lee solamente, usted puede poner al día siempre la columna. Esto puede ser útil para los comentarios, etc.";

@XendraTrl(Identifier="be4b0390-1334-d7f1-9f1f-a57335f77606")
public static String es_PE_FIELD_UsedInColumn_AlwaysUpdateable_Name="Siempre Actualizable";

@XendraField(AD_Column_ID="IsAlwaysUpdateable",IsCentrallyMaintained=true,
AD_Tab_ID="f2864947-dcd5-98af-2bf0-a4e296b595b0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="be4b0390-1334-d7f1-9f1f-a57335f77606")
public static final String FIELDNAME_UsedInColumn_AlwaysUpdateable="be4b0390-1334-d7f1-9f1f-a57335f77606";

@XendraTrl(Identifier="7fea6caf-c549-a7a4-c15f-ef5eef46e92d")
public static String es_PE_FIELD_UsedInColumn_AlwaysUpdateable2_Description="La columna siempre es actualizable, incluso si el expediente no es activo ó procesado.";

@XendraTrl(Identifier="7fea6caf-c549-a7a4-c15f-ef5eef46e92d")
public static String es_PE_FIELD_UsedInColumn_AlwaysUpdateable2_Help="Si esta seleccionado y si la ventana / la tabla no se lee solamente, usted puede poner al día siempre la columna. Esto puede ser útil para los comentarios, etc.";

@XendraTrl(Identifier="7fea6caf-c549-a7a4-c15f-ef5eef46e92d")
public static String es_PE_FIELD_UsedInColumn_AlwaysUpdateable2_Name="Siempre Actualizable";

@XendraField(AD_Column_ID="IsAlwaysUpdateable",IsCentrallyMaintained=true,
AD_Tab_ID="896eb30c-0038-f362-1ef9-1b18df7727b8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7fea6caf-c549-a7a4-c15f-ef5eef46e92d")
public static final String FIELDNAME_UsedInColumn_AlwaysUpdateable2="7fea6caf-c549-a7a4-c15f-ef5eef46e92d";

@XendraTrl(Identifier="1643f75c-83e4-ba70-cb85-499beddd03ab")
public static String es_PE_FIELD_UsedInColumn_AlwaysUpdateable3_Description="La columna siempre es actualizable, incluso si el expediente no es activo ó procesado.";

@XendraTrl(Identifier="1643f75c-83e4-ba70-cb85-499beddd03ab")
public static String es_PE_FIELD_UsedInColumn_AlwaysUpdateable3_Help="Si esta seleccionado y si la ventana / la tabla no se lee solamente, usted puede poner al día siempre la columna. Esto puede ser útil para los comentarios, etc.";

@XendraTrl(Identifier="1643f75c-83e4-ba70-cb85-499beddd03ab")
public static String es_PE_FIELD_UsedInColumn_AlwaysUpdateable3_Name="Siempre Actualizable";

@XendraField(AD_Column_ID="IsAlwaysUpdateable",IsCentrallyMaintained=true,
AD_Tab_ID="45259391-7378-323f-de9f-b2a168722616",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1643f75c-83e4-ba70-cb85-499beddd03ab")
public static final String FIELDNAME_UsedInColumn_AlwaysUpdateable3="1643f75c-83e4-ba70-cb85-499beddd03ab";

@XendraTrl(Identifier="30e4f5ae-21d6-a54a-6975-da2532d73e44")
public static String es_PE_COLUMN_IsAlwaysUpdateable_Name="Siempre Actualizable";

@XendraColumn(AD_Element_ID="5b47ba4d-a1c0-7600-9181-90543eeb30d2",ColumnName="IsAlwaysUpdateable",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="30e4f5ae-21d6-a54a-6975-da2532d73e44",
Synchronized="2017-08-16 11:33:29.0")
/** Column name IsAlwaysUpdateable */
public static final String COLUMNNAME_IsAlwaysUpdateable = "IsAlwaysUpdateable";
/** Set Autocomplete.
@param IsAutocomplete Automatic completion for textfields */
public void setIsAutocomplete (boolean IsAutocomplete)
{
set_Value (COLUMNNAME_IsAutocomplete, Boolean.valueOf(IsAutocomplete));
}
/** Get Autocomplete.
@return Automatic completion for textfields */
public boolean isAutocomplete() 
{
Object oo = get_Value(COLUMNNAME_IsAutocomplete);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="86bb5260-a44e-d836-e94f-b3d04ba09428")
public static String es_PE_FIELD_Column_Autocomplete_Description="Automatic completion fortextfields";

@XendraTrl(Identifier="86bb5260-a44e-d836-e94f-b3d04ba09428")
public static String es_PE_FIELD_Column_Autocomplete_Help="Theautocompletion uses all existing values (from the same client andorganization) of the field.";

@XendraTrl(Identifier="86bb5260-a44e-d836-e94f-b3d04ba09428")
public static String es_PE_FIELD_Column_Autocomplete_Name="Autocomplete";

@XendraField(AD_Column_ID="IsAutocomplete",IsCentrallyMaintained=true,
AD_Tab_ID="7f22e1b4-bc67-420c-0156-5b87df8c18b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@AD_Reference_ID@=10",DisplayLength=1,IsReadOnly=false,SeqNo=160,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="86bb5260-a44e-d836-e94f-b3d04ba09428")
public static final String FIELDNAME_Column_Autocomplete="86bb5260-a44e-d836-e94f-b3d04ba09428";

@XendraTrl(Identifier="c4a1dcb0-85a8-62e4-0406-63bc1bea810c")
public static String es_PE_COLUMN_IsAutocomplete_Name="Autocomplete";

@XendraColumn(AD_Element_ID="31504baa-2de5-3f8c-ebdc-ea65a52dbe87",ColumnName="IsAutocomplete",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c4a1dcb0-85a8-62e4-0406-63bc1bea810c",
Synchronized="2017-08-16 11:33:29.0")
/** Column name IsAutocomplete */
public static final String COLUMNNAME_IsAutocomplete = "IsAutocomplete";

/** IsEncrypted AD_Reference=b343e2db-9fa6-9ba8-ce6b-94b768f97f73 */
public static final int ISENCRYPTED_AD_Reference_ID=354;
/** Set Encrypted.
@param IsEncrypted Display or Storage is encrypted */
public void setIsEncrypted (String IsEncrypted)
{
if (IsEncrypted == null) throw new IllegalArgumentException ("IsEncrypted is mandatory");
if (IsEncrypted.equals(REF_AD_ColumnEncrypted.Encrypted) || IsEncrypted.equals(REF_AD_ColumnEncrypted.NotEncrypted));
 else throw new IllegalArgumentException ("IsEncrypted Invalid value - " + IsEncrypted + " - Reference_ID=354 - Y - N");
if (IsEncrypted.length() > 1)
{
log.warning("Length > 1 - truncated");
IsEncrypted = IsEncrypted.substring(0,0);
}
set_Value (COLUMNNAME_IsEncrypted, IsEncrypted);
}
/** Get Encrypted.
@return Display or Storage is encrypted */
public String getIsEncrypted() 
{
return (String)get_Value(COLUMNNAME_IsEncrypted);
}

@XendraTrl(Identifier="2087eea8-4a91-0951-01e1-7daad5153f3f")
public static String es_PE_FIELD_Column_ColumnEncryption_Description="Comprobar y Permitir Encriptar Columna ";

@XendraTrl(Identifier="2087eea8-4a91-0951-01e1-7daad5153f3f")
public static String es_PE_FIELD_Column_ColumnEncryption_Help="De permitir el almacenaje encriptado o remover el encriptado es peligroso pues puede  perder información. Necesita verificar que la columna sea lo suficientemente grande para soportar los valores encriptados.Usted puede proporcionar su propio método de encriptado, pero no puede cambiarlo si lo a habilitado.  <br>La implementación predeterminada soporta US ASCII conversión de cadena (no Unicode,Números, Fechas)<br>Note que el soporte es restringido para configurar y probar, pero no recupera datos.";

@XendraTrl(Identifier="2087eea8-4a91-0951-01e1-7daad5153f3f")
public static String es_PE_FIELD_Column_ColumnEncryption_Name="Encriptar Columna ";

@XendraField(AD_Column_ID="IsEncrypted",IsCentrallyMaintained=true,
AD_Tab_ID="7f22e1b4-bc67-420c-0156-5b87df8c18b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=260,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2087eea8-4a91-0951-01e1-7daad5153f3f")
public static final String FIELDNAME_Column_ColumnEncryption="2087eea8-4a91-0951-01e1-7daad5153f3f";

@XendraTrl(Identifier="f2db72b2-3ba2-3d24-c17c-97f34ee46d72")
public static String es_PE_FIELD_UsedInColumn_ColumnEncryption_Description="Comprobar y Permitir Encriptar Columna ";

@XendraTrl(Identifier="f2db72b2-3ba2-3d24-c17c-97f34ee46d72")
public static String es_PE_FIELD_UsedInColumn_ColumnEncryption_Help="De permitir el almacenaje encriptado o remover el encriptado es peligroso pues puede  perder información. Necesita verificar que la columna sea lo suficientemente grande para soportar los valores encriptados.Usted puede proporcionar su propio método de encriptado, pero no puede cambiarlo si lo a habilitado.  <br>La implementación predeterminada soporta US ASCII conversión de cadena (no Unicode,Números, Fechas)<br>Note que el soporte es restringido para configurar y probar, pero no recupera datos.";

@XendraTrl(Identifier="f2db72b2-3ba2-3d24-c17c-97f34ee46d72")
public static String es_PE_FIELD_UsedInColumn_ColumnEncryption_Name="Encriptar Columna ";

@XendraField(AD_Column_ID="IsEncrypted",IsCentrallyMaintained=true,
AD_Tab_ID="f2864947-dcd5-98af-2bf0-a4e296b595b0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f2db72b2-3ba2-3d24-c17c-97f34ee46d72")
public static final String FIELDNAME_UsedInColumn_ColumnEncryption="f2db72b2-3ba2-3d24-c17c-97f34ee46d72";

@XendraTrl(Identifier="469f2a7e-a975-1a9d-7a54-ce7f8bc78b22")
public static String es_PE_FIELD_UsedInColumn_ColumnEncryption2_Description="Comprobar y Permitir Encriptar Columna ";

@XendraTrl(Identifier="469f2a7e-a975-1a9d-7a54-ce7f8bc78b22")
public static String es_PE_FIELD_UsedInColumn_ColumnEncryption2_Help="De permitir el almacenaje encriptado o remover el encriptado es peligroso pues puede  perder información. Necesita verificar que la columna sea lo suficientemente grande para soportar los valores encriptados.Usted puede proporcionar su propio método de encriptado, pero no puede cambiarlo si lo a habilitado.  <br>La implementación predeterminada soporta US ASCII conversión de cadena (no Unicode,Números, Fechas)<br>Note que el soporte es restringido para configurar y probar, pero no recupera datos.";

@XendraTrl(Identifier="469f2a7e-a975-1a9d-7a54-ce7f8bc78b22")
public static String es_PE_FIELD_UsedInColumn_ColumnEncryption2_Name="Encriptar Columna ";

@XendraField(AD_Column_ID="IsEncrypted",IsCentrallyMaintained=true,
AD_Tab_ID="896eb30c-0038-f362-1ef9-1b18df7727b8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="469f2a7e-a975-1a9d-7a54-ce7f8bc78b22")
public static final String FIELDNAME_UsedInColumn_ColumnEncryption2="469f2a7e-a975-1a9d-7a54-ce7f8bc78b22";

@XendraTrl(Identifier="ffd4922e-5e65-877f-0d08-79502987c8b9")
public static String es_PE_FIELD_UsedInColumn_ColumnEncryption3_Description="Comprobar y Permitir Encriptar Columna ";

@XendraTrl(Identifier="ffd4922e-5e65-877f-0d08-79502987c8b9")
public static String es_PE_FIELD_UsedInColumn_ColumnEncryption3_Help="De permitir el almacenaje encriptado o remover el encriptado es peligroso pues puede  perder información. Necesita verificar que la columna sea lo suficientemente grande para soportar los valores encriptados.Usted puede proporcionar su propio método de encriptado, pero no puede cambiarlo si lo a habilitado.  <br>La implementación predeterminada soporta US ASCII conversión de cadena (no Unicode,Números, Fechas)<br>Note que el soporte es restringido para configurar y probar, pero no recupera datos.";

@XendraTrl(Identifier="ffd4922e-5e65-877f-0d08-79502987c8b9")
public static String es_PE_FIELD_UsedInColumn_ColumnEncryption3_Name="Encriptar Columna ";

@XendraField(AD_Column_ID="IsEncrypted",IsCentrallyMaintained=true,
AD_Tab_ID="45259391-7378-323f-de9f-b2a168722616",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ffd4922e-5e65-877f-0d08-79502987c8b9")
public static final String FIELDNAME_UsedInColumn_ColumnEncryption3="ffd4922e-5e65-877f-0d08-79502987c8b9";

@XendraTrl(Identifier="83bd4328-cbcb-2ac8-d9c4-ed3f08a599d2")
public static String es_PE_COLUMN_IsEncrypted_Name="Despliegue Encriptado";

@XendraColumn(AD_Element_ID="c0df59ef-8893-5340-a5d8-c855ca33c9dc",ColumnName="IsEncrypted",
AD_Reference_ID=28,AD_Reference_Value_ID="b343e2db-9fa6-9ba8-ce6b-94b768f97f73",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="@IsKey@=Y | @IsParent@=Y | @IsIdentifier@=Y",IsIdentifier=false,
SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",
IsSelectionColumn=false,AD_Process_ID="00aae39f-d284-6b12-29b7-05585a332773",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="83bd4328-cbcb-2ac8-d9c4-ed3f08a599d2",Synchronized="2017-08-16 11:33:29.0")
/** Column name IsEncrypted */
public static final String COLUMNNAME_IsEncrypted = "IsEncrypted";
/** Set Identifier.
@param IsIdentifier This column is part of the record identifier */
public void setIsIdentifier (boolean IsIdentifier)
{
set_Value (COLUMNNAME_IsIdentifier, Boolean.valueOf(IsIdentifier));
}
/** Get Identifier.
@return This column is part of the record identifier */
public boolean isIdentifier() 
{
Object oo = get_Value(COLUMNNAME_IsIdentifier);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="f9e36bc4-013b-1cd0-9498-02cd78a78751")
public static String es_PE_FIELD_Column_IsIdentifier_Description="Esta columna es parte del identificador del registro";

@XendraTrl(Identifier="f9e36bc4-013b-1cd0-9498-02cd78a78751")
public static String es_PE_FIELD_Column_IsIdentifier_Help="El cuadro de verificación Identificador indica que esta columna es parte del identificador ó clave para esta tabla";

@XendraTrl(Identifier="f9e36bc4-013b-1cd0-9498-02cd78a78751")
public static String es_PE_FIELD_Column_IsIdentifier_Name="Identificador";

@XendraField(AD_Column_ID="IsIdentifier",IsCentrallyMaintained=true,
AD_Tab_ID="7f22e1b4-bc67-420c-0156-5b87df8c18b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=290,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f9e36bc4-013b-1cd0-9498-02cd78a78751")
public static final String FIELDNAME_Column_IsIdentifier="f9e36bc4-013b-1cd0-9498-02cd78a78751";

@XendraTrl(Identifier="69ef7de8-9fbf-c267-ded7-e9fa014b01be")
public static String es_PE_FIELD_UsedInColumn_Identifier_Description="Esta columna es parte del identificador del registro";

@XendraTrl(Identifier="69ef7de8-9fbf-c267-ded7-e9fa014b01be")
public static String es_PE_FIELD_UsedInColumn_Identifier_Help="El cuadro de verificación Identificador indica que esta columna es parte del identificador ó clave para esta tabla";

@XendraTrl(Identifier="69ef7de8-9fbf-c267-ded7-e9fa014b01be")
public static String es_PE_FIELD_UsedInColumn_Identifier_Name="Identificador";

@XendraField(AD_Column_ID="IsIdentifier",IsCentrallyMaintained=true,
AD_Tab_ID="f2864947-dcd5-98af-2bf0-a4e296b595b0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="69ef7de8-9fbf-c267-ded7-e9fa014b01be")
public static final String FIELDNAME_UsedInColumn_Identifier="69ef7de8-9fbf-c267-ded7-e9fa014b01be";

@XendraTrl(Identifier="b7b6e3ca-a173-33d3-0057-889389b9f86a")
public static String es_PE_FIELD_UsedInColumn_Identifier2_Description="Esta columna es parte del identificador del registro";

@XendraTrl(Identifier="b7b6e3ca-a173-33d3-0057-889389b9f86a")
public static String es_PE_FIELD_UsedInColumn_Identifier2_Help="El cuadro de verificación Identificador indica que esta columna es parte del identificador ó clave para esta tabla";

@XendraTrl(Identifier="b7b6e3ca-a173-33d3-0057-889389b9f86a")
public static String es_PE_FIELD_UsedInColumn_Identifier2_Name="Identificador";

@XendraField(AD_Column_ID="IsIdentifier",IsCentrallyMaintained=true,
AD_Tab_ID="896eb30c-0038-f362-1ef9-1b18df7727b8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b7b6e3ca-a173-33d3-0057-889389b9f86a")
public static final String FIELDNAME_UsedInColumn_Identifier2="b7b6e3ca-a173-33d3-0057-889389b9f86a";

@XendraTrl(Identifier="02a88eef-2294-fe48-0d6d-8b2d181f6cc2")
public static String es_PE_FIELD_UsedInColumn_Identifier3_Description="Esta columna es parte del identificador del registro";

@XendraTrl(Identifier="02a88eef-2294-fe48-0d6d-8b2d181f6cc2")
public static String es_PE_FIELD_UsedInColumn_Identifier3_Help="El cuadro de verificación Identificador indica que esta columna es parte del identificador ó clave para esta tabla";

@XendraTrl(Identifier="02a88eef-2294-fe48-0d6d-8b2d181f6cc2")
public static String es_PE_FIELD_UsedInColumn_Identifier3_Name="Identificador";

@XendraField(AD_Column_ID="IsIdentifier",IsCentrallyMaintained=true,
AD_Tab_ID="45259391-7378-323f-de9f-b2a168722616",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="02a88eef-2294-fe48-0d6d-8b2d181f6cc2")
public static final String FIELDNAME_UsedInColumn_Identifier3="02a88eef-2294-fe48-0d6d-8b2d181f6cc2";

@XendraTrl(Identifier="dcf42c8e-5aef-cae7-19cc-ad6d44b52a55")
public static String es_PE_COLUMN_IsIdentifier_Name="Identificador";

@XendraColumn(AD_Element_ID="6e84b5a4-9628-dae0-9a67-bc442d89517c",ColumnName="IsIdentifier",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dcf42c8e-5aef-cae7-19cc-ad6d44b52a55",
Synchronized="2017-08-16 11:33:30.0")
/** Column name IsIdentifier */
public static final String COLUMNNAME_IsIdentifier = "IsIdentifier";
/** Set Internal.
@param IsInternal Internal Organization */
public void setIsInternal (boolean IsInternal)
{
set_Value (COLUMNNAME_IsInternal, Boolean.valueOf(IsInternal));
}
/** Get Internal.
@return Internal Organization */
public boolean isInternal() 
{
Object oo = get_Value(COLUMNNAME_IsInternal);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="8105160b-feef-429d-be42-60c6cda579d5")
public static String es_PE_COLUMN_IsInternal_Name="Internal";

@XendraColumn(AD_Element_ID="004cc0f1-7de2-4eed-7a23-4c529f432c47",ColumnName="IsInternal",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8105160b-feef-429d-be42-60c6cda579d5",
Synchronized="2017-08-16 11:33:30.0")
/** Column name IsInternal */
public static final String COLUMNNAME_IsInternal = "IsInternal";
/** Set Key column.
@param IsKey This column is the key in this table */
public void setIsKey (boolean IsKey)
{
set_Value (COLUMNNAME_IsKey, Boolean.valueOf(IsKey));
}
/** Get Key column.
@return This column is the key in this table */
public boolean isKey() 
{
Object oo = get_Value(COLUMNNAME_IsKey);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="2b4fce7c-1f08-ae38-b5aa-a0f62a4e3827")
public static String es_PE_FIELD_Column_KeyColumn_Description="Esta columna es la clave en esta tabla";

@XendraTrl(Identifier="2b4fce7c-1f08-ae38-b5aa-a0f62a4e3827")
public static String es_PE_FIELD_Column_KeyColumn_Help="La columna clave debe también desplegar la secuencia 0 en la definición de campo y puede estar oculto";

@XendraTrl(Identifier="2b4fce7c-1f08-ae38-b5aa-a0f62a4e3827")
public static String es_PE_FIELD_Column_KeyColumn_Name="Columna Clave";

@XendraField(AD_Column_ID="IsKey",IsCentrallyMaintained=true,
AD_Tab_ID="7f22e1b4-bc67-420c-0156-5b87df8c18b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2b4fce7c-1f08-ae38-b5aa-a0f62a4e3827")
public static final String FIELDNAME_Column_KeyColumn="2b4fce7c-1f08-ae38-b5aa-a0f62a4e3827";

@XendraTrl(Identifier="594835ab-6614-914a-1bc1-a2881a70918f")
public static String es_PE_FIELD_UsedInColumn_KeyColumn_Description="Esta columna es la clave en esta tabla";

@XendraTrl(Identifier="594835ab-6614-914a-1bc1-a2881a70918f")
public static String es_PE_FIELD_UsedInColumn_KeyColumn_Help="La columna clave debe también desplegar la secuencia 0 en la definición de campo y puede estar oculto";

@XendraTrl(Identifier="594835ab-6614-914a-1bc1-a2881a70918f")
public static String es_PE_FIELD_UsedInColumn_KeyColumn_Name="Columna Clave";

@XendraField(AD_Column_ID="IsKey",IsCentrallyMaintained=true,
AD_Tab_ID="f2864947-dcd5-98af-2bf0-a4e296b595b0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="594835ab-6614-914a-1bc1-a2881a70918f")
public static final String FIELDNAME_UsedInColumn_KeyColumn="594835ab-6614-914a-1bc1-a2881a70918f";

@XendraTrl(Identifier="fcdca59c-9f2e-8422-3e23-5784e0ad97ec")
public static String es_PE_FIELD_UsedInColumn_KeyColumn2_Description="Esta columna es la clave en esta tabla";

@XendraTrl(Identifier="fcdca59c-9f2e-8422-3e23-5784e0ad97ec")
public static String es_PE_FIELD_UsedInColumn_KeyColumn2_Help="La columna clave debe también desplegar la secuencia 0 en la definición de campo y puede estar oculto";

@XendraTrl(Identifier="fcdca59c-9f2e-8422-3e23-5784e0ad97ec")
public static String es_PE_FIELD_UsedInColumn_KeyColumn2_Name="Columna Clave";

@XendraField(AD_Column_ID="IsKey",IsCentrallyMaintained=true,
AD_Tab_ID="896eb30c-0038-f362-1ef9-1b18df7727b8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fcdca59c-9f2e-8422-3e23-5784e0ad97ec")
public static final String FIELDNAME_UsedInColumn_KeyColumn2="fcdca59c-9f2e-8422-3e23-5784e0ad97ec";

@XendraTrl(Identifier="845fe5d7-8211-dfb6-6d2e-f46e51241bd1")
public static String es_PE_FIELD_UsedInColumn_KeyColumn3_Description="Esta columna es la clave en esta tabla";

@XendraTrl(Identifier="845fe5d7-8211-dfb6-6d2e-f46e51241bd1")
public static String es_PE_FIELD_UsedInColumn_KeyColumn3_Help="La columna clave debe también desplegar la secuencia 0 en la definición de campo y puede estar oculto";

@XendraTrl(Identifier="845fe5d7-8211-dfb6-6d2e-f46e51241bd1")
public static String es_PE_FIELD_UsedInColumn_KeyColumn3_Name="Columna Clave";

@XendraField(AD_Column_ID="IsKey",IsCentrallyMaintained=true,
AD_Tab_ID="45259391-7378-323f-de9f-b2a168722616",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="845fe5d7-8211-dfb6-6d2e-f46e51241bd1")
public static final String FIELDNAME_UsedInColumn_KeyColumn3="845fe5d7-8211-dfb6-6d2e-f46e51241bd1";

@XendraTrl(Identifier="386045ff-f5cf-57b9-7ca2-b73f3a426bdc")
public static String es_PE_COLUMN_IsKey_Name="Columna Clave";

@XendraColumn(AD_Element_ID="8be2cc4b-c2a0-4ba3-839f-51f95a60471f",ColumnName="IsKey",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="386045ff-f5cf-57b9-7ca2-b73f3a426bdc",
Synchronized="2017-08-16 11:33:30.0")
/** Column name IsKey */
public static final String COLUMNNAME_IsKey = "IsKey";
/** Set Mandatory.
@param IsMandatory Data entry is required in this column */
public void setIsMandatory (boolean IsMandatory)
{
set_Value (COLUMNNAME_IsMandatory, Boolean.valueOf(IsMandatory));
}
/** Get Mandatory.
@return Data entry is required in this column */
public boolean isMandatory() 
{
Object oo = get_Value(COLUMNNAME_IsMandatory);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="0deb5f5f-07dd-65ea-ce4f-8bf8c6c8bc5a")
public static String es_PE_FIELD_Column_Mandatory_Description="Entrada de datos es requerida en esta columna";

@XendraTrl(Identifier="0deb5f5f-07dd-65ea-ce4f-8bf8c6c8bc5a")
public static String es_PE_FIELD_Column_Mandatory_Help="El cuadro de verificación obligatorio indica si el campo es requerido para que un registro sea salvado a la base de datos.";

@XendraTrl(Identifier="0deb5f5f-07dd-65ea-ce4f-8bf8c6c8bc5a")
public static String es_PE_FIELD_Column_Mandatory_Name="Entrada Obligatoria";

@XendraField(AD_Column_ID="IsMandatory",IsCentrallyMaintained=true,
AD_Tab_ID="7f22e1b4-bc67-420c-0156-5b87df8c18b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0deb5f5f-07dd-65ea-ce4f-8bf8c6c8bc5a")
public static final String FIELDNAME_Column_Mandatory="0deb5f5f-07dd-65ea-ce4f-8bf8c6c8bc5a";

@XendraTrl(Identifier="0e28f597-5f91-0f25-3303-76ea6d8a4642")
public static String es_PE_FIELD_UsedInColumn_Mandatory_Description="Entrada de datos es requerida en esta columna";

@XendraTrl(Identifier="0e28f597-5f91-0f25-3303-76ea6d8a4642")
public static String es_PE_FIELD_UsedInColumn_Mandatory_Help="El cuadro de verificación obligatorio indica si el campo es requerido para que un registro sea salvado a la base de datos.";

@XendraTrl(Identifier="0e28f597-5f91-0f25-3303-76ea6d8a4642")
public static String es_PE_FIELD_UsedInColumn_Mandatory_Name="Entrada Obligatoria";

@XendraField(AD_Column_ID="IsMandatory",IsCentrallyMaintained=true,
AD_Tab_ID="f2864947-dcd5-98af-2bf0-a4e296b595b0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0e28f597-5f91-0f25-3303-76ea6d8a4642")
public static final String FIELDNAME_UsedInColumn_Mandatory="0e28f597-5f91-0f25-3303-76ea6d8a4642";

@XendraTrl(Identifier="3e143221-9d39-ec66-0ced-56907ce82a16")
public static String es_PE_FIELD_UsedInColumn_Mandatory2_Description="Entrada de datos es requerida en esta columna";

@XendraTrl(Identifier="3e143221-9d39-ec66-0ced-56907ce82a16")
public static String es_PE_FIELD_UsedInColumn_Mandatory2_Help="El cuadro de verificación obligatorio indica si el campo es requerido para que un registro sea salvado a la base de datos.";

@XendraTrl(Identifier="3e143221-9d39-ec66-0ced-56907ce82a16")
public static String es_PE_FIELD_UsedInColumn_Mandatory2_Name="Entrada Obligatoria";

@XendraField(AD_Column_ID="IsMandatory",IsCentrallyMaintained=true,
AD_Tab_ID="896eb30c-0038-f362-1ef9-1b18df7727b8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3e143221-9d39-ec66-0ced-56907ce82a16")
public static final String FIELDNAME_UsedInColumn_Mandatory2="3e143221-9d39-ec66-0ced-56907ce82a16";

@XendraTrl(Identifier="197c6554-8937-9864-874c-6af76b680db6")
public static String es_PE_FIELD_UsedInColumn_Mandatory3_Description="Entrada de datos es requerida en esta columna";

@XendraTrl(Identifier="197c6554-8937-9864-874c-6af76b680db6")
public static String es_PE_FIELD_UsedInColumn_Mandatory3_Help="El cuadro de verificación obligatorio indica si el campo es requerido para que un registro sea salvado a la base de datos.";

@XendraTrl(Identifier="197c6554-8937-9864-874c-6af76b680db6")
public static String es_PE_FIELD_UsedInColumn_Mandatory3_Name="Entrada Obligatoria";

@XendraField(AD_Column_ID="IsMandatory",IsCentrallyMaintained=true,
AD_Tab_ID="45259391-7378-323f-de9f-b2a168722616",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="197c6554-8937-9864-874c-6af76b680db6")
public static final String FIELDNAME_UsedInColumn_Mandatory3="197c6554-8937-9864-874c-6af76b680db6";

@XendraTrl(Identifier="585464bd-99f0-2cea-5200-cb4a8b838ed3")
public static String es_PE_COLUMN_IsMandatory_Name="Entrada Obligatoria";

@XendraColumn(AD_Element_ID="43310179-c59f-f313-de13-08d90722e38d",ColumnName="IsMandatory",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="585464bd-99f0-2cea-5200-cb4a8b838ed3",
Synchronized="2017-08-16 11:33:30.0")
/** Column name IsMandatory */
public static final String COLUMNNAME_IsMandatory = "IsMandatory";
/** Set Parent link column.
@param IsParent This column is a link to the parent table (e.g. header from lines) - incl. Association key columns */
public void setIsParent (boolean IsParent)
{
set_Value (COLUMNNAME_IsParent, Boolean.valueOf(IsParent));
}
/** Get Parent link column.
@return This column is a link to the parent table (e.g. header from lines) - incl. Association key columns */
public boolean isParent() 
{
Object oo = get_Value(COLUMNNAME_IsParent);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="247b3a94-48fc-a895-7eba-6552296aadf2")
public static String es_PE_FIELD_Column_ParentLinkColumn_Description="Esta columna es un enlace a la tabla padre (Ej. Cabecera desde líneas) - incl. Asociación con columnas clave";

@XendraTrl(Identifier="247b3a94-48fc-a895-7eba-6552296aadf2")
public static String es_PE_FIELD_Column_ParentLinkColumn_Help="El Cuadro de verificación padre indica si esta columna es un enlace a la tabla padre";

@XendraTrl(Identifier="247b3a94-48fc-a895-7eba-6552296aadf2")
public static String es_PE_FIELD_Column_ParentLinkColumn_Name="Columna de Enlace a Tabla Padre";

@XendraField(AD_Column_ID="IsParent",IsCentrallyMaintained=true,
AD_Tab_ID="7f22e1b4-bc67-420c-0156-5b87df8c18b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="247b3a94-48fc-a895-7eba-6552296aadf2")
public static final String FIELDNAME_Column_ParentLinkColumn="247b3a94-48fc-a895-7eba-6552296aadf2";

@XendraTrl(Identifier="af21c838-85ce-c641-c728-b37958a38f74")
public static String es_PE_FIELD_UsedInColumn_ParentLinkColumn_Description="Esta columna es un enlace a la tabla padre (Ej. Cabecera desde líneas) - incl. Asociación con columnas clave";

@XendraTrl(Identifier="af21c838-85ce-c641-c728-b37958a38f74")
public static String es_PE_FIELD_UsedInColumn_ParentLinkColumn_Help="El Cuadro de verificación padre indica si esta columna es un enlace a la tabla padre";

@XendraTrl(Identifier="af21c838-85ce-c641-c728-b37958a38f74")
public static String es_PE_FIELD_UsedInColumn_ParentLinkColumn_Name="Columna de Enlace a Tabla Padre";

@XendraField(AD_Column_ID="IsParent",IsCentrallyMaintained=true,
AD_Tab_ID="f2864947-dcd5-98af-2bf0-a4e296b595b0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="af21c838-85ce-c641-c728-b37958a38f74")
public static final String FIELDNAME_UsedInColumn_ParentLinkColumn="af21c838-85ce-c641-c728-b37958a38f74";

@XendraTrl(Identifier="847ecdf4-9ab3-eb91-0287-ccce5d1eeb83")
public static String es_PE_FIELD_UsedInColumn_ParentLinkColumn2_Description="Esta columna es un enlace a la tabla padre (Ej. Cabecera desde líneas) - incl. Asociación con columnas clave";

@XendraTrl(Identifier="847ecdf4-9ab3-eb91-0287-ccce5d1eeb83")
public static String es_PE_FIELD_UsedInColumn_ParentLinkColumn2_Help="El Cuadro de verificación padre indica si esta columna es un enlace a la tabla padre";

@XendraTrl(Identifier="847ecdf4-9ab3-eb91-0287-ccce5d1eeb83")
public static String es_PE_FIELD_UsedInColumn_ParentLinkColumn2_Name="Columna de Enlace a Tabla Padre";

@XendraField(AD_Column_ID="IsParent",IsCentrallyMaintained=true,
AD_Tab_ID="896eb30c-0038-f362-1ef9-1b18df7727b8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="847ecdf4-9ab3-eb91-0287-ccce5d1eeb83")
public static final String FIELDNAME_UsedInColumn_ParentLinkColumn2="847ecdf4-9ab3-eb91-0287-ccce5d1eeb83";

@XendraTrl(Identifier="8b6d69aa-40fd-ab40-0e47-9ca6038daa07")
public static String es_PE_FIELD_UsedInColumn_ParentLinkColumn3_Description="Esta columna es un enlace a la tabla padre (Ej. Cabecera desde líneas) - incl. Asociación con columnas clave";

@XendraTrl(Identifier="8b6d69aa-40fd-ab40-0e47-9ca6038daa07")
public static String es_PE_FIELD_UsedInColumn_ParentLinkColumn3_Help="El Cuadro de verificación padre indica si esta columna es un enlace a la tabla padre";

@XendraTrl(Identifier="8b6d69aa-40fd-ab40-0e47-9ca6038daa07")
public static String es_PE_FIELD_UsedInColumn_ParentLinkColumn3_Name="Columna de Enlace a Tabla Padre";

@XendraField(AD_Column_ID="IsParent",IsCentrallyMaintained=true,
AD_Tab_ID="45259391-7378-323f-de9f-b2a168722616",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8b6d69aa-40fd-ab40-0e47-9ca6038daa07")
public static final String FIELDNAME_UsedInColumn_ParentLinkColumn3="8b6d69aa-40fd-ab40-0e47-9ca6038daa07";

@XendraTrl(Identifier="101a782e-f9b0-222f-bc35-2a68688d7ec2")
public static String es_PE_COLUMN_IsParent_Name="Columna de Enlace a Tabla Padre";

@XendraColumn(AD_Element_ID="9eeefe36-95e5-2218-179f-a4d553c8e65a",ColumnName="IsParent",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="101a782e-f9b0-222f-bc35-2a68688d7ec2",
Synchronized="2017-08-16 11:33:30.0")
/** Column name IsParent */
public static final String COLUMNNAME_IsParent = "IsParent";
/** Set Selection Column.
@param IsSelectionColumn Is this column used for finding rows in windows */
public void setIsSelectionColumn (boolean IsSelectionColumn)
{
set_Value (COLUMNNAME_IsSelectionColumn, Boolean.valueOf(IsSelectionColumn));
}
/** Get Selection Column.
@return Is this column used for finding rows in windows */
public boolean isSelectionColumn() 
{
Object oo = get_Value(COLUMNNAME_IsSelectionColumn);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="7c760428-c2af-1610-1d23-d5a3b2012480")
public static String es_PE_FIELD_Column_SelectionColumn_Description="Esta columna es usada para encontrar renglones en ventanas";

@XendraTrl(Identifier="7c760428-c2af-1610-1d23-d5a3b2012480")
public static String es_PE_FIELD_Column_SelectionColumn_Help="Si está seleccionado; la columna es listada en la primera lengüeta de la ventana del hallazgo y en la pieza de la selección de la ventana";

@XendraTrl(Identifier="7c760428-c2af-1610-1d23-d5a3b2012480")
public static String es_PE_FIELD_Column_SelectionColumn_Name="Columna de Selección";

@XendraField(AD_Column_ID="IsSelectionColumn",IsCentrallyMaintained=true,
AD_Tab_ID="7f22e1b4-bc67-420c-0156-5b87df8c18b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=320,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7c760428-c2af-1610-1d23-d5a3b2012480")
public static final String FIELDNAME_Column_SelectionColumn="7c760428-c2af-1610-1d23-d5a3b2012480";

@XendraTrl(Identifier="f4e862c4-aaca-34ff-6228-73e38c08bd0b")
public static String es_PE_FIELD_UsedInColumn_SelectionColumn_Description="Esta columna es usada para encontrar renglones en ventanas";

@XendraTrl(Identifier="f4e862c4-aaca-34ff-6228-73e38c08bd0b")
public static String es_PE_FIELD_UsedInColumn_SelectionColumn_Help="Si está seleccionado; la columna es listada en la primera lengüeta de la ventana del hallazgo y en la pieza de la selección de la ventana";

@XendraTrl(Identifier="f4e862c4-aaca-34ff-6228-73e38c08bd0b")
public static String es_PE_FIELD_UsedInColumn_SelectionColumn_Name="Columna de Selección";

@XendraField(AD_Column_ID="IsSelectionColumn",IsCentrallyMaintained=true,
AD_Tab_ID="f2864947-dcd5-98af-2bf0-a4e296b595b0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f4e862c4-aaca-34ff-6228-73e38c08bd0b")
public static final String FIELDNAME_UsedInColumn_SelectionColumn="f4e862c4-aaca-34ff-6228-73e38c08bd0b";

@XendraTrl(Identifier="e16a7c9a-c4d4-d5c0-4261-7b4827327cb4")
public static String es_PE_FIELD_UsedInColumn_SelectionColumn2_Description="Esta columna es usada para encontrar renglones en ventanas";

@XendraTrl(Identifier="e16a7c9a-c4d4-d5c0-4261-7b4827327cb4")
public static String es_PE_FIELD_UsedInColumn_SelectionColumn2_Help="Si está seleccionado; la columna es listada en la primera lengüeta de la ventana del hallazgo y en la pieza de la selección de la ventana";

@XendraTrl(Identifier="e16a7c9a-c4d4-d5c0-4261-7b4827327cb4")
public static String es_PE_FIELD_UsedInColumn_SelectionColumn2_Name="Columna de Selección";

@XendraField(AD_Column_ID="IsSelectionColumn",IsCentrallyMaintained=true,
AD_Tab_ID="896eb30c-0038-f362-1ef9-1b18df7727b8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e16a7c9a-c4d4-d5c0-4261-7b4827327cb4")
public static final String FIELDNAME_UsedInColumn_SelectionColumn2="e16a7c9a-c4d4-d5c0-4261-7b4827327cb4";

@XendraTrl(Identifier="826012ae-938c-959c-a446-a3e3a79e505f")
public static String es_PE_FIELD_UsedInColumn_SelectionColumn3_Description="Esta columna es usada para encontrar renglones en ventanas";

@XendraTrl(Identifier="826012ae-938c-959c-a446-a3e3a79e505f")
public static String es_PE_FIELD_UsedInColumn_SelectionColumn3_Help="Si está seleccionado; la columna es listada en la primera lengüeta de la ventana del hallazgo y en la pieza de la selección de la ventana";

@XendraTrl(Identifier="826012ae-938c-959c-a446-a3e3a79e505f")
public static String es_PE_FIELD_UsedInColumn_SelectionColumn3_Name="Columna de Selección";

@XendraField(AD_Column_ID="IsSelectionColumn",IsCentrallyMaintained=true,
AD_Tab_ID="45259391-7378-323f-de9f-b2a168722616",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="826012ae-938c-959c-a446-a3e3a79e505f")
public static final String FIELDNAME_UsedInColumn_SelectionColumn3="826012ae-938c-959c-a446-a3e3a79e505f";

@XendraTrl(Identifier="f024922f-2796-de11-16ff-8801b4014bf6")
public static String es_PE_COLUMN_IsSelectionColumn_Name="Columna de Selección";

@XendraColumn(AD_Element_ID="f336d555-df91-422e-967e-03de3a67955e",ColumnName="IsSelectionColumn",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f024922f-2796-de11-16ff-8801b4014bf6",
Synchronized="2017-08-16 11:33:30.0")
/** Column name IsSelectionColumn */
public static final String COLUMNNAME_IsSelectionColumn = "IsSelectionColumn";
/** Set Synchronize Database.
@param IsSyncDatabase Change database table definition when changing dictionary definition */
public void setIsSyncDatabase (String IsSyncDatabase)
{
if (IsSyncDatabase != null && IsSyncDatabase.length() > 1)
{
log.warning("Length > 1 - truncated");
IsSyncDatabase = IsSyncDatabase.substring(0,0);
}
set_Value (COLUMNNAME_IsSyncDatabase, IsSyncDatabase);
}
/** Get Synchronize Database.
@return Change database table definition when changing dictionary definition */
public String getIsSyncDatabase() 
{
return (String)get_Value(COLUMNNAME_IsSyncDatabase);
}

@XendraTrl(Identifier="4023099b-3dd6-2e6c-4d74-5582c61489e1")
public static String es_PE_FIELD_Column_SynchronizeColumn_Description="Cambiar definición de tabla de la base de datos desde el diccionario de la aplicación";

@XendraTrl(Identifier="4023099b-3dd6-2e6c-4d74-5582c61489e1")
public static String es_PE_FIELD_Column_SynchronizeColumn_Help="Cuando se selecciona; la definición de la columna en la base de datos es actualizada basado en las entradas de la definición de la columna en el diccionario de la aplicación. Note que no todas las entradas son soportadas por la base de datos y pueden generar error.";

@XendraTrl(Identifier="4023099b-3dd6-2e6c-4d74-5582c61489e1")
public static String es_PE_FIELD_Column_SynchronizeColumn_Name="Sincronizar Columnas";

@XendraField(AD_Column_ID="IsSyncDatabase",IsCentrallyMaintained=true,
AD_Tab_ID="7f22e1b4-bc67-420c-0156-5b87df8c18b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsView@='N'",DisplayLength=23,IsReadOnly=false,SeqNo=350,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4023099b-3dd6-2e6c-4d74-5582c61489e1")
public static final String FIELDNAME_Column_SynchronizeColumn="4023099b-3dd6-2e6c-4d74-5582c61489e1";

@XendraTrl(Identifier="2db01664-bd07-1e70-7a0c-096e644d0e4f")
public static String es_PE_FIELD_UsedInColumn_SynchronizeColumn_Description="Cambiar definición de tabla de la base de datos desde el diccionario de la aplicación";

@XendraTrl(Identifier="2db01664-bd07-1e70-7a0c-096e644d0e4f")
public static String es_PE_FIELD_UsedInColumn_SynchronizeColumn_Help="Cuando se selecciona; la definición de la columna en la base de datos es actualizada basado en las entradas de la definición de la columna en el diccionario de la aplicación. Note que no todas las entradas son soportadas por la base de datos y pueden generar error.";

@XendraTrl(Identifier="2db01664-bd07-1e70-7a0c-096e644d0e4f")
public static String es_PE_FIELD_UsedInColumn_SynchronizeColumn_Name="Sincronizar Columnas";

@XendraField(AD_Column_ID="IsSyncDatabase",IsCentrallyMaintained=true,
AD_Tab_ID="f2864947-dcd5-98af-2bf0-a4e296b595b0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2db01664-bd07-1e70-7a0c-096e644d0e4f")
public static final String FIELDNAME_UsedInColumn_SynchronizeColumn="2db01664-bd07-1e70-7a0c-096e644d0e4f";

@XendraTrl(Identifier="aee20f28-3c45-0cc5-17eb-8ec54e0df03c")
public static String es_PE_FIELD_UsedInColumn_SynchronizeColumn2_Description="Cambiar definición de tabla de la base de datos desde el diccionario de la aplicación";

@XendraTrl(Identifier="aee20f28-3c45-0cc5-17eb-8ec54e0df03c")
public static String es_PE_FIELD_UsedInColumn_SynchronizeColumn2_Help="Cuando se selecciona; la definición de la columna en la base de datos es actualizada basado en las entradas de la definición de la columna en el diccionario de la aplicación. Note que no todas las entradas son soportadas por la base de datos y pueden generar error.";

@XendraTrl(Identifier="aee20f28-3c45-0cc5-17eb-8ec54e0df03c")
public static String es_PE_FIELD_UsedInColumn_SynchronizeColumn2_Name="Sincronizar Columnas";

@XendraField(AD_Column_ID="IsSyncDatabase",IsCentrallyMaintained=true,
AD_Tab_ID="896eb30c-0038-f362-1ef9-1b18df7727b8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="aee20f28-3c45-0cc5-17eb-8ec54e0df03c")
public static final String FIELDNAME_UsedInColumn_SynchronizeColumn2="aee20f28-3c45-0cc5-17eb-8ec54e0df03c";

@XendraTrl(Identifier="540e99e8-5261-32de-7af8-70ff69d75d97")
public static String es_PE_FIELD_UsedInColumn_SynchronizeColumn3_Description="Cambiar definición de tabla de la base de datos desde el diccionario de la aplicación";

@XendraTrl(Identifier="540e99e8-5261-32de-7af8-70ff69d75d97")
public static String es_PE_FIELD_UsedInColumn_SynchronizeColumn3_Help="Cuando se selecciona; la definición de la columna en la base de datos es actualizada basado en las entradas de la definición de la columna en el diccionario de la aplicación. Note que no todas las entradas son soportadas por la base de datos y pueden generar error.";

@XendraTrl(Identifier="540e99e8-5261-32de-7af8-70ff69d75d97")
public static String es_PE_FIELD_UsedInColumn_SynchronizeColumn3_Name="Sincronizar Columnas";

@XendraField(AD_Column_ID="IsSyncDatabase",IsCentrallyMaintained=true,
AD_Tab_ID="45259391-7378-323f-de9f-b2a168722616",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="540e99e8-5261-32de-7af8-70ff69d75d97")
public static final String FIELDNAME_UsedInColumn_SynchronizeColumn3="540e99e8-5261-32de-7af8-70ff69d75d97";

@XendraTrl(Identifier="54f5a3d7-2ec7-bc74-6546-c2d3ee59e3a2")
public static String es_PE_COLUMN_IsSyncDatabase_Name="Sincronizar Base de Datos";

@XendraColumn(AD_Element_ID="31c070fa-1789-f057-d31b-00c2d774ca28",ColumnName="IsSyncDatabase",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="00cedefe-c3aa-d75e-3bd8-dac3ace4e8fa",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="54f5a3d7-2ec7-bc74-6546-c2d3ee59e3a2",Synchronized="2017-08-16 11:33:30.0")
/** Column name IsSyncDatabase */
public static final String COLUMNNAME_IsSyncDatabase = "IsSyncDatabase";
/** Set Translated.
@param IsTranslated This column is translated */
public void setIsTranslated (boolean IsTranslated)
{
set_Value (COLUMNNAME_IsTranslated, Boolean.valueOf(IsTranslated));
}
/** Get Translated.
@return This column is translated */
public boolean isTranslated() 
{
Object oo = get_Value(COLUMNNAME_IsTranslated);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="0fb0e69c-afa2-5410-82a2-804c9d4f19d5")
public static String es_PE_FIELD_Column_Translated_Description="Esta columna está traducida";

@XendraTrl(Identifier="0fb0e69c-afa2-5410-82a2-804c9d4f19d5")
public static String es_PE_FIELD_Column_Translated_Help="El Cuadro de verificación traducido indica si esta columna está traducida";

@XendraTrl(Identifier="0fb0e69c-afa2-5410-82a2-804c9d4f19d5")
public static String es_PE_FIELD_Column_Translated_Name="Traducida";

@XendraField(AD_Column_ID="IsTranslated",IsCentrallyMaintained=true,
AD_Tab_ID="7f22e1b4-bc67-420c-0156-5b87df8c18b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=330,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0fb0e69c-afa2-5410-82a2-804c9d4f19d5")
public static final String FIELDNAME_Column_Translated="0fb0e69c-afa2-5410-82a2-804c9d4f19d5";

@XendraTrl(Identifier="dff8e44e-969d-9ae0-e372-4fa66e4fa577")
public static String es_PE_FIELD_UsedInColumn_Translated_Description="Esta columna está traducida";

@XendraTrl(Identifier="dff8e44e-969d-9ae0-e372-4fa66e4fa577")
public static String es_PE_FIELD_UsedInColumn_Translated_Help="El Cuadro de verificación traducido indica si esta columna está traducida";

@XendraTrl(Identifier="dff8e44e-969d-9ae0-e372-4fa66e4fa577")
public static String es_PE_FIELD_UsedInColumn_Translated_Name="Traducida";

@XendraField(AD_Column_ID="IsTranslated",IsCentrallyMaintained=true,
AD_Tab_ID="f2864947-dcd5-98af-2bf0-a4e296b595b0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dff8e44e-969d-9ae0-e372-4fa66e4fa577")
public static final String FIELDNAME_UsedInColumn_Translated="dff8e44e-969d-9ae0-e372-4fa66e4fa577";

@XendraTrl(Identifier="d8b86343-fa43-bb0d-2c68-d2e37a85d0c3")
public static String es_PE_FIELD_UsedInColumn_Translated2_Description="Esta columna está traducida";

@XendraTrl(Identifier="d8b86343-fa43-bb0d-2c68-d2e37a85d0c3")
public static String es_PE_FIELD_UsedInColumn_Translated2_Help="El Cuadro de verificación traducido indica si esta columna está traducida";

@XendraTrl(Identifier="d8b86343-fa43-bb0d-2c68-d2e37a85d0c3")
public static String es_PE_FIELD_UsedInColumn_Translated2_Name="Traducida";

@XendraField(AD_Column_ID="IsTranslated",IsCentrallyMaintained=true,
AD_Tab_ID="896eb30c-0038-f362-1ef9-1b18df7727b8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d8b86343-fa43-bb0d-2c68-d2e37a85d0c3")
public static final String FIELDNAME_UsedInColumn_Translated2="d8b86343-fa43-bb0d-2c68-d2e37a85d0c3";

@XendraTrl(Identifier="0b4d4341-2ee5-c7fa-761b-3ac044eb297e")
public static String es_PE_FIELD_UsedInColumn_Translated3_Description="Esta columna está traducida";

@XendraTrl(Identifier="0b4d4341-2ee5-c7fa-761b-3ac044eb297e")
public static String es_PE_FIELD_UsedInColumn_Translated3_Help="El Cuadro de verificación traducido indica si esta columna está traducida";

@XendraTrl(Identifier="0b4d4341-2ee5-c7fa-761b-3ac044eb297e")
public static String es_PE_FIELD_UsedInColumn_Translated3_Name="Traducida";

@XendraField(AD_Column_ID="IsTranslated",IsCentrallyMaintained=true,
AD_Tab_ID="45259391-7378-323f-de9f-b2a168722616",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0b4d4341-2ee5-c7fa-761b-3ac044eb297e")
public static final String FIELDNAME_UsedInColumn_Translated3="0b4d4341-2ee5-c7fa-761b-3ac044eb297e";

@XendraTrl(Identifier="c0122c06-dd53-97a2-7b64-556f1112a401")
public static String es_PE_COLUMN_IsTranslated_Name="Traducida";

@XendraColumn(AD_Element_ID="2cb47f81-f66d-8a0e-4caf-e7085d291bb2",ColumnName="IsTranslated",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c0122c06-dd53-97a2-7b64-556f1112a401",
Synchronized="2017-08-16 11:33:30.0")
/** Column name IsTranslated */
public static final String COLUMNNAME_IsTranslated = "IsTranslated";
/** Set Updateable.
@param IsUpdateable Determines, if the field can be UPDATED */
public void setIsUpdateable (boolean IsUpdateable)
{
set_Value (COLUMNNAME_IsUpdateable, Boolean.valueOf(IsUpdateable));
}
/** Get Updateable.
@return Determines, if the field can be UPDATED */
public boolean isUpdateable() 
{
Object oo = get_Value(COLUMNNAME_IsUpdateable);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="2da4a82c-bbb9-de2e-b5cb-8a394d89f790")
public static String es_PE_FIELD_Column_Updateable_Description="Determina si el campo puede ser actualizado";

@XendraTrl(Identifier="2da4a82c-bbb9-de2e-b5cb-8a394d89f790")
public static String es_PE_FIELD_Column_Updateable_Help="El Cuadro de Verificación Actualizable indica si este campo puede ser actualizado por el usuario";

@XendraTrl(Identifier="2da4a82c-bbb9-de2e-b5cb-8a394d89f790")
public static String es_PE_FIELD_Column_Updateable_Name="Actualizable";

@XendraField(AD_Column_ID="IsUpdateable",IsCentrallyMaintained=true,
AD_Tab_ID="7f22e1b4-bc67-420c-0156-5b87df8c18b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=250,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2da4a82c-bbb9-de2e-b5cb-8a394d89f790")
public static final String FIELDNAME_Column_Updateable="2da4a82c-bbb9-de2e-b5cb-8a394d89f790";

@XendraTrl(Identifier="94fd623d-0eb3-a89f-f260-ab1439af3568")
public static String es_PE_FIELD_UsedInColumn_Updateable_Description="Determina si el campo puede ser actualizado";

@XendraTrl(Identifier="94fd623d-0eb3-a89f-f260-ab1439af3568")
public static String es_PE_FIELD_UsedInColumn_Updateable_Help="El Cuadro de Verificación Actualizable indica si este campo puede ser actualizado por el usuario";

@XendraTrl(Identifier="94fd623d-0eb3-a89f-f260-ab1439af3568")
public static String es_PE_FIELD_UsedInColumn_Updateable_Name="Actualizable";

@XendraField(AD_Column_ID="IsUpdateable",IsCentrallyMaintained=true,
AD_Tab_ID="f2864947-dcd5-98af-2bf0-a4e296b595b0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="94fd623d-0eb3-a89f-f260-ab1439af3568")
public static final String FIELDNAME_UsedInColumn_Updateable="94fd623d-0eb3-a89f-f260-ab1439af3568";

@XendraTrl(Identifier="ccaab8cb-ce32-01ef-afc0-830686d09b15")
public static String es_PE_FIELD_UsedInColumn_Updateable2_Description="Determina si el campo puede ser actualizado";

@XendraTrl(Identifier="ccaab8cb-ce32-01ef-afc0-830686d09b15")
public static String es_PE_FIELD_UsedInColumn_Updateable2_Help="El Cuadro de Verificación Actualizable indica si este campo puede ser actualizado por el usuario";

@XendraTrl(Identifier="ccaab8cb-ce32-01ef-afc0-830686d09b15")
public static String es_PE_FIELD_UsedInColumn_Updateable2_Name="Actualizable";

@XendraField(AD_Column_ID="IsUpdateable",IsCentrallyMaintained=true,
AD_Tab_ID="896eb30c-0038-f362-1ef9-1b18df7727b8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ccaab8cb-ce32-01ef-afc0-830686d09b15")
public static final String FIELDNAME_UsedInColumn_Updateable2="ccaab8cb-ce32-01ef-afc0-830686d09b15";

@XendraTrl(Identifier="0a4ea276-02f4-99fb-ccdc-663f4916ba7e")
public static String es_PE_FIELD_UsedInColumn_Updateable3_Description="Determina si el campo puede ser actualizado";

@XendraTrl(Identifier="0a4ea276-02f4-99fb-ccdc-663f4916ba7e")
public static String es_PE_FIELD_UsedInColumn_Updateable3_Help="El Cuadro de Verificación Actualizable indica si este campo puede ser actualizado por el usuario";

@XendraTrl(Identifier="0a4ea276-02f4-99fb-ccdc-663f4916ba7e")
public static String es_PE_FIELD_UsedInColumn_Updateable3_Name="Actualizable";

@XendraField(AD_Column_ID="IsUpdateable",IsCentrallyMaintained=true,
AD_Tab_ID="45259391-7378-323f-de9f-b2a168722616",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0a4ea276-02f4-99fb-ccdc-663f4916ba7e")
public static final String FIELDNAME_UsedInColumn_Updateable3="0a4ea276-02f4-99fb-ccdc-663f4916ba7e";

@XendraTrl(Identifier="9f23442d-33bd-c350-271f-455f7975c932")
public static String es_PE_COLUMN_IsUpdateable_Name="Actualizable";

@XendraColumn(AD_Element_ID="a793d4db-fec3-ab3c-10ca-23558b3015cb",ColumnName="IsUpdateable",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9f23442d-33bd-c350-271f-455f7975c932",
Synchronized="2017-08-16 11:33:31.0")
/** Column name IsUpdateable */
public static final String COLUMNNAME_IsUpdateable = "IsUpdateable";
/** Set MandatoryLogic.
@param MandatoryLogic MandatoryLogic */
public void setMandatoryLogic (String MandatoryLogic)
{
set_Value (COLUMNNAME_MandatoryLogic, MandatoryLogic);
}
/** Get MandatoryLogic.
@return MandatoryLogic */
public String getMandatoryLogic() 
{
String value = (String)get_Value(COLUMNNAME_MandatoryLogic);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="0acf7f18-da7b-4170-8360-f9a3e189c65e")
public static String es_PE_FIELD_Column_MandatoryLogic_Name="mandatorylogic";

@XendraField(AD_Column_ID="MandatoryLogic",IsCentrallyMaintained=true,
AD_Tab_ID="7f22e1b4-bc67-420c-0156-5b87df8c18b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2000,IsReadOnly=false,SeqNo=420,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-04-01 17:26:50.0",
Identifier="0acf7f18-da7b-4170-8360-f9a3e189c65e")
public static final String FIELDNAME_Column_MandatoryLogic="0acf7f18-da7b-4170-8360-f9a3e189c65e";

@XendraTrl(Identifier="72820e02-71b1-ef94-31ce-47d87d4bcbde")
public static String es_PE_COLUMN_MandatoryLogic_Name="MandatoryLogic";

@XendraColumn(AD_Element_ID="15130721-7c38-d06d-2f06-e50c655016e7",ColumnName="MandatoryLogic",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="72820e02-71b1-ef94-31ce-47d87d4bcbde",
Synchronized="2017-08-16 11:33:31.0")
/** Column name MandatoryLogic */
public static final String COLUMNNAME_MandatoryLogic = "MandatoryLogic";
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
@XendraTrl(Identifier="c3a7ec03-875f-4ef8-6cff-5675bdf7b84f")
public static String es_PE_FIELD_Column_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="c3a7ec03-875f-4ef8-6cff-5675bdf7b84f")
public static String es_PE_FIELD_Column_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="c3a7ec03-875f-4ef8-6cff-5675bdf7b84f")
public static String es_PE_FIELD_Column_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="7f22e1b4-bc67-420c-0156-5b87df8c18b3",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="c3a7ec03-875f-4ef8-6cff-5675bdf7b84f")
public static final String FIELDNAME_Column_Name="c3a7ec03-875f-4ef8-6cff-5675bdf7b84f";

@XendraTrl(Identifier="581fd990-ce7d-913f-f44a-13e7408c1003")
public static String es_PE_FIELD_UsedInColumn_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="581fd990-ce7d-913f-f44a-13e7408c1003")
public static String es_PE_FIELD_UsedInColumn_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="581fd990-ce7d-913f-f44a-13e7408c1003")
public static String es_PE_FIELD_UsedInColumn_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="f2864947-dcd5-98af-2bf0-a4e296b595b0",AD_FieldGroup_ID="",
IsDisplayed=false,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="581fd990-ce7d-913f-f44a-13e7408c1003")
public static final String FIELDNAME_UsedInColumn_Name="581fd990-ce7d-913f-f44a-13e7408c1003";

@XendraTrl(Identifier="5d2c0609-0227-4fa4-0b22-688217d246a0")
public static String es_PE_FIELD_UsedInColumn_Name2_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="5d2c0609-0227-4fa4-0b22-688217d246a0")
public static String es_PE_FIELD_UsedInColumn_Name2_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="5d2c0609-0227-4fa4-0b22-688217d246a0")
public static String es_PE_FIELD_UsedInColumn_Name2_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="896eb30c-0038-f362-1ef9-1b18df7727b8",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="5d2c0609-0227-4fa4-0b22-688217d246a0")
public static final String FIELDNAME_UsedInColumn_Name2="5d2c0609-0227-4fa4-0b22-688217d246a0";

@XendraTrl(Identifier="e8de0938-6aa0-7ff8-8eb0-e3f5794714fb")
public static String es_PE_FIELD_UsedInColumn_Name3_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="e8de0938-6aa0-7ff8-8eb0-e3f5794714fb")
public static String es_PE_FIELD_UsedInColumn_Name3_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="e8de0938-6aa0-7ff8-8eb0-e3f5794714fb")
public static String es_PE_FIELD_UsedInColumn_Name3_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="45259391-7378-323f-de9f-b2a168722616",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="e8de0938-6aa0-7ff8-8eb0-e3f5794714fb")
public static final String FIELDNAME_UsedInColumn_Name3="e8de0938-6aa0-7ff8-8eb0-e3f5794714fb";

@XendraTrl(Identifier="dbe1fde2-fa18-d1b3-9520-3090a0e93b9e")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dbe1fde2-fa18-d1b3-9520-3090a0e93b9e",
Synchronized="2017-08-16 11:33:31.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Read Only Logic.
@param ReadOnlyLogic Logic to determine if field is read only (applies only when field is read-write) */
public void setReadOnlyLogic (String ReadOnlyLogic)
{
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
@XendraTrl(Identifier="e0bc7160-8de0-98ef-17f5-f9cf920aea3d")
public static String es_PE_FIELD_Column_ReadOnlyLogic_Description="Lógica para determinar si el campo es de sólo lectura (aplica solamente cuando el campo es lectura-escritura";

@XendraTrl(Identifier="e0bc7160-8de0-98ef-17f5-f9cf920aea3d")
public static String es_PE_FIELD_Column_ReadOnlyLogic_Name="Lógica de Solo Lectura";

@XendraField(AD_Column_ID="ReadOnlyLogic",IsCentrallyMaintained=true,
AD_Tab_ID="7f22e1b4-bc67-420c-0156-5b87df8c18b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=280,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e0bc7160-8de0-98ef-17f5-f9cf920aea3d")
public static final String FIELDNAME_Column_ReadOnlyLogic="e0bc7160-8de0-98ef-17f5-f9cf920aea3d";

@XendraTrl(Identifier="e607dac4-737a-aa8f-15dd-29a260bb8b75")
public static String es_PE_FIELD_UsedInColumn_ReadOnlyLogic_Description="Lógica para determinar si el campo es de sólo lectura (aplica solamente cuando el campo es lectura-escritura";

@XendraTrl(Identifier="e607dac4-737a-aa8f-15dd-29a260bb8b75")
public static String es_PE_FIELD_UsedInColumn_ReadOnlyLogic_Name="Lógica de Solo Lectura";

@XendraField(AD_Column_ID="ReadOnlyLogic",IsCentrallyMaintained=true,
AD_Tab_ID="f2864947-dcd5-98af-2bf0-a4e296b595b0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e607dac4-737a-aa8f-15dd-29a260bb8b75")
public static final String FIELDNAME_UsedInColumn_ReadOnlyLogic="e607dac4-737a-aa8f-15dd-29a260bb8b75";

@XendraTrl(Identifier="3709027a-71a7-75aa-99e7-139756ecf935")
public static String es_PE_FIELD_UsedInColumn_ReadOnlyLogic2_Description="Lógica para determinar si el campo es de sólo lectura (aplica solamente cuando el campo es lectura-escritura";

@XendraTrl(Identifier="3709027a-71a7-75aa-99e7-139756ecf935")
public static String es_PE_FIELD_UsedInColumn_ReadOnlyLogic2_Name="Lógica de Solo Lectura";

@XendraField(AD_Column_ID="ReadOnlyLogic",IsCentrallyMaintained=true,
AD_Tab_ID="896eb30c-0038-f362-1ef9-1b18df7727b8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=2000,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3709027a-71a7-75aa-99e7-139756ecf935")
public static final String FIELDNAME_UsedInColumn_ReadOnlyLogic2="3709027a-71a7-75aa-99e7-139756ecf935";

@XendraTrl(Identifier="1fed7dbb-0291-03ca-7afe-9764c1e513ee")
public static String es_PE_FIELD_UsedInColumn_ReadOnlyLogic3_Description="Lógica para determinar si el campo es de sólo lectura (aplica solamente cuando el campo es lectura-escritura";

@XendraTrl(Identifier="1fed7dbb-0291-03ca-7afe-9764c1e513ee")
public static String es_PE_FIELD_UsedInColumn_ReadOnlyLogic3_Name="Lógica de Solo Lectura";

@XendraField(AD_Column_ID="ReadOnlyLogic",IsCentrallyMaintained=true,
AD_Tab_ID="45259391-7378-323f-de9f-b2a168722616",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=2000,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1fed7dbb-0291-03ca-7afe-9764c1e513ee")
public static final String FIELDNAME_UsedInColumn_ReadOnlyLogic3="1fed7dbb-0291-03ca-7afe-9764c1e513ee";

@XendraTrl(Identifier="d2070e91-ada4-7f1e-58ba-0f39d8adc137")
public static String es_PE_COLUMN_ReadOnlyLogic_Name="Lógica de Solo Lectura";

@XendraColumn(AD_Element_ID="935267fb-b81e-300a-5bc2-f3c4b02f4d5d",ColumnName="ReadOnlyLogic",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d2070e91-ada4-7f1e-58ba-0f39d8adc137",
Synchronized="2017-08-16 11:33:31.0")
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

@XendraTrl(Identifier="9626714e-caa0-35c1-16b3-3669d37e68f0")
public static String es_PE_FIELD_Column_Sequence_Description="Método de ordenar registros; el número más bajo viene primero";

@XendraTrl(Identifier="9626714e-caa0-35c1-16b3-3669d37e68f0")
public static String es_PE_FIELD_Column_Sequence_Help="La Secuencia indica el orden de los registros";

@XendraTrl(Identifier="9626714e-caa0-35c1-16b3-3669d37e68f0")
public static String es_PE_FIELD_Column_Sequence_Name="Secuencia";

@XendraField(AD_Column_ID="SeqNo",IsCentrallyMaintained=true,
AD_Tab_ID="7f22e1b4-bc67-420c-0156-5b87df8c18b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsIdentifier@=Y",DisplayLength=11,IsReadOnly=false,SeqNo=300,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="9626714e-caa0-35c1-16b3-3669d37e68f0")
public static final String FIELDNAME_Column_Sequence="9626714e-caa0-35c1-16b3-3669d37e68f0";

@XendraTrl(Identifier="5cd66ac9-f371-4dca-a108-84ff07496bcb")
public static String es_PE_FIELD_UsedInColumn_Sequence_Description="Método de ordenar registros; el número más bajo viene primero";

@XendraTrl(Identifier="5cd66ac9-f371-4dca-a108-84ff07496bcb")
public static String es_PE_FIELD_UsedInColumn_Sequence_Help="La Secuencia indica el orden de los registros";

@XendraTrl(Identifier="5cd66ac9-f371-4dca-a108-84ff07496bcb")
public static String es_PE_FIELD_UsedInColumn_Sequence_Name="Secuencia";

@XendraField(AD_Column_ID="SeqNo",IsCentrallyMaintained=true,
AD_Tab_ID="f2864947-dcd5-98af-2bf0-a4e296b595b0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5cd66ac9-f371-4dca-a108-84ff07496bcb")
public static final String FIELDNAME_UsedInColumn_Sequence="5cd66ac9-f371-4dca-a108-84ff07496bcb";

@XendraTrl(Identifier="13fc79be-e16d-48d1-f2f7-dcedae61ca09")
public static String es_PE_FIELD_UsedInColumn_Sequence2_Description="Método de ordenar registros; el número más bajo viene primero";

@XendraTrl(Identifier="13fc79be-e16d-48d1-f2f7-dcedae61ca09")
public static String es_PE_FIELD_UsedInColumn_Sequence2_Help="La Secuencia indica el orden de los registros";

@XendraTrl(Identifier="13fc79be-e16d-48d1-f2f7-dcedae61ca09")
public static String es_PE_FIELD_UsedInColumn_Sequence2_Name="Secuencia";

@XendraField(AD_Column_ID="SeqNo",IsCentrallyMaintained=true,
AD_Tab_ID="896eb30c-0038-f362-1ef9-1b18df7727b8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="13fc79be-e16d-48d1-f2f7-dcedae61ca09")
public static final String FIELDNAME_UsedInColumn_Sequence2="13fc79be-e16d-48d1-f2f7-dcedae61ca09";

@XendraTrl(Identifier="612144af-0a26-25f0-f5f0-7510ca66d11d")
public static String es_PE_FIELD_UsedInColumn_Sequence3_Description="Método de ordenar registros; el número más bajo viene primero";

@XendraTrl(Identifier="612144af-0a26-25f0-f5f0-7510ca66d11d")
public static String es_PE_FIELD_UsedInColumn_Sequence3_Help="La Secuencia indica el orden de los registros";

@XendraTrl(Identifier="612144af-0a26-25f0-f5f0-7510ca66d11d")
public static String es_PE_FIELD_UsedInColumn_Sequence3_Name="Secuencia";

@XendraField(AD_Column_ID="SeqNo",IsCentrallyMaintained=true,
AD_Tab_ID="45259391-7378-323f-de9f-b2a168722616",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="612144af-0a26-25f0-f5f0-7510ca66d11d")
public static final String FIELDNAME_UsedInColumn_Sequence3="612144af-0a26-25f0-f5f0-7510ca66d11d";

@XendraTrl(Identifier="56062fc0-9ebb-0ba4-655a-86cc8369e59e")
public static String es_PE_COLUMN_SeqNo_Name="Secuencia";

@XendraColumn(AD_Element_ID="38fa26fe-b59d-fce1-c129-420b57da738b",ColumnName="SeqNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="56062fc0-9ebb-0ba4-655a-86cc8369e59e",
Synchronized="2017-08-16 11:33:31.0")
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

@XendraTrl(Identifier="e01ba126-fee1-4013-b23c-527f508a153e")
public static String es_PE_FIELD_Column_Synchronized_Name="Synchronized";

@XendraField(AD_Column_ID="Synchronized",IsCentrallyMaintained=true,
AD_Tab_ID="7f22e1b4-bc67-420c-0156-5b87df8c18b3",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=29,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-04-01 17:26:50.0",
Identifier="e01ba126-fee1-4013-b23c-527f508a153e")
public static final String FIELDNAME_Column_Synchronized="e01ba126-fee1-4013-b23c-527f508a153e";

@XendraTrl(Identifier="c399479e-4ef1-c9a7-df99-347cb74b4e1f")
public static String es_PE_COLUMN_Synchronized_Name="Synchronized";

@XendraColumn(AD_Element_ID="08f1e976-ceeb-f830-9d75-bf94f13a98ce",ColumnName="Synchronized",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c399479e-4ef1-c9a7-df99-347cb74b4e1f",
Synchronized="2017-08-16 11:33:31.0")
/** Column name Synchronized */
public static final String COLUMNNAME_Synchronized = "Synchronized";
/** Set Max. Value.
@param ValueMax Maximum Value for a field */
public void setValueMax (String ValueMax)
{
if (ValueMax != null && ValueMax.length() > 20)
{
log.warning("Length > 20 - truncated");
ValueMax = ValueMax.substring(0,19);
}
set_Value (COLUMNNAME_ValueMax, ValueMax);
}
/** Get Max. Value.
@return Maximum Value for a field */
public String getValueMax() 
{
String value = (String)get_Value(COLUMNNAME_ValueMax);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="3e3e9e1e-ce8e-39f8-2642-2954e7d1a0b2")
public static String es_PE_FIELD_Column_MaxValue_Description="Valor Máximo de un campo";

@XendraTrl(Identifier="3e3e9e1e-ce8e-39f8-2642-2954e7d1a0b2")
public static String es_PE_FIELD_Column_MaxValue_Help="El Valor Máximo indica el valor más alto permisible para un campo";

@XendraTrl(Identifier="3e3e9e1e-ce8e-39f8-2642-2954e7d1a0b2")
public static String es_PE_FIELD_Column_MaxValue_Name="Valor Máximo";

@XendraField(AD_Column_ID="ValueMax",IsCentrallyMaintained=true,
AD_Tab_ID="7f22e1b4-bc67-420c-0156-5b87df8c18b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@AD_Reference_ID@=11 | @AD_Reference_ID@=12 | @AD_Reference_ID@=15 | @AD_Reference_ID@=22 | @AD_Reference_ID@=29",
DisplayLength=20,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3e3e9e1e-ce8e-39f8-2642-2954e7d1a0b2")
public static final String FIELDNAME_Column_MaxValue="3e3e9e1e-ce8e-39f8-2642-2954e7d1a0b2";

@XendraTrl(Identifier="96601b48-76e1-6e20-e4ff-f17d729e4878")
public static String es_PE_FIELD_UsedInColumn_MaxValue_Description="Valor Máximo de un campo";

@XendraTrl(Identifier="96601b48-76e1-6e20-e4ff-f17d729e4878")
public static String es_PE_FIELD_UsedInColumn_MaxValue_Help="El Valor Máximo indica el valor más alto permisible para un campo";

@XendraTrl(Identifier="96601b48-76e1-6e20-e4ff-f17d729e4878")
public static String es_PE_FIELD_UsedInColumn_MaxValue_Name="Valor Máximo";

@XendraField(AD_Column_ID="ValueMax",IsCentrallyMaintained=true,
AD_Tab_ID="f2864947-dcd5-98af-2bf0-a4e296b595b0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="96601b48-76e1-6e20-e4ff-f17d729e4878")
public static final String FIELDNAME_UsedInColumn_MaxValue="96601b48-76e1-6e20-e4ff-f17d729e4878";

@XendraTrl(Identifier="cba77d51-1456-da2d-6897-e47e7737549c")
public static String es_PE_FIELD_UsedInColumn_MaxValue2_Description="Valor Máximo de un campo";

@XendraTrl(Identifier="cba77d51-1456-da2d-6897-e47e7737549c")
public static String es_PE_FIELD_UsedInColumn_MaxValue2_Help="El Valor Máximo indica el valor más alto permisible para un campo";

@XendraTrl(Identifier="cba77d51-1456-da2d-6897-e47e7737549c")
public static String es_PE_FIELD_UsedInColumn_MaxValue2_Name="Valor Máximo";

@XendraField(AD_Column_ID="ValueMax",IsCentrallyMaintained=true,
AD_Tab_ID="896eb30c-0038-f362-1ef9-1b18df7727b8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cba77d51-1456-da2d-6897-e47e7737549c")
public static final String FIELDNAME_UsedInColumn_MaxValue2="cba77d51-1456-da2d-6897-e47e7737549c";

@XendraTrl(Identifier="baf1d59a-9292-e85c-642d-1f2a39be4b4f")
public static String es_PE_FIELD_UsedInColumn_MaxValue3_Description="Valor Máximo de un campo";

@XendraTrl(Identifier="baf1d59a-9292-e85c-642d-1f2a39be4b4f")
public static String es_PE_FIELD_UsedInColumn_MaxValue3_Help="El Valor Máximo indica el valor más alto permisible para un campo";

@XendraTrl(Identifier="baf1d59a-9292-e85c-642d-1f2a39be4b4f")
public static String es_PE_FIELD_UsedInColumn_MaxValue3_Name="Valor Máximo";

@XendraField(AD_Column_ID="ValueMax",IsCentrallyMaintained=true,
AD_Tab_ID="45259391-7378-323f-de9f-b2a168722616",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="baf1d59a-9292-e85c-642d-1f2a39be4b4f")
public static final String FIELDNAME_UsedInColumn_MaxValue3="baf1d59a-9292-e85c-642d-1f2a39be4b4f";

@XendraTrl(Identifier="6d1a2923-902e-e384-ef13-60c01133f6df")
public static String es_PE_COLUMN_ValueMax_Name="Valor Máximo";

@XendraColumn(AD_Element_ID="9a379735-7a4d-6bc7-3c02-7c24576e4604",ColumnName="ValueMax",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6d1a2923-902e-e384-ef13-60c01133f6df",
Synchronized="2017-08-16 11:33:31.0")
/** Column name ValueMax */
public static final String COLUMNNAME_ValueMax = "ValueMax";
/** Set Min. Value.
@param ValueMin Minimum Value for a field */
public void setValueMin (String ValueMin)
{
if (ValueMin != null && ValueMin.length() > 20)
{
log.warning("Length > 20 - truncated");
ValueMin = ValueMin.substring(0,19);
}
set_Value (COLUMNNAME_ValueMin, ValueMin);
}
/** Get Min. Value.
@return Minimum Value for a field */
public String getValueMin() 
{
String value = (String)get_Value(COLUMNNAME_ValueMin);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="93ed6098-8436-3d2b-7b68-18ba4deafa94")
public static String es_PE_FIELD_Column_MinValue_Description="Valor Mínimo de un campo";

@XendraTrl(Identifier="93ed6098-8436-3d2b-7b68-18ba4deafa94")
public static String es_PE_FIELD_Column_MinValue_Help="El Valor Mínimo indica el menor valor permisible para un campo";

@XendraTrl(Identifier="93ed6098-8436-3d2b-7b68-18ba4deafa94")
public static String es_PE_FIELD_Column_MinValue_Name="Valor Mínimo";

@XendraField(AD_Column_ID="ValueMin",IsCentrallyMaintained=true,
AD_Tab_ID="7f22e1b4-bc67-420c-0156-5b87df8c18b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@AD_Reference_ID@=11 | @AD_Reference_ID@=12 | @AD_Reference_ID@=15 | @AD_Reference_ID@=22 | @AD_Reference_ID@=29",
DisplayLength=20,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="93ed6098-8436-3d2b-7b68-18ba4deafa94")
public static final String FIELDNAME_Column_MinValue="93ed6098-8436-3d2b-7b68-18ba4deafa94";

@XendraTrl(Identifier="a6384e1d-2aa1-1413-0927-a972122d6990")
public static String es_PE_FIELD_UsedInColumn_MinValue_Description="Valor Mínimo de un campo";

@XendraTrl(Identifier="a6384e1d-2aa1-1413-0927-a972122d6990")
public static String es_PE_FIELD_UsedInColumn_MinValue_Help="El Valor Mínimo indica el menor valor permisible para un campo";

@XendraTrl(Identifier="a6384e1d-2aa1-1413-0927-a972122d6990")
public static String es_PE_FIELD_UsedInColumn_MinValue_Name="Valor Mínimo";

@XendraField(AD_Column_ID="ValueMin",IsCentrallyMaintained=true,
AD_Tab_ID="f2864947-dcd5-98af-2bf0-a4e296b595b0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a6384e1d-2aa1-1413-0927-a972122d6990")
public static final String FIELDNAME_UsedInColumn_MinValue="a6384e1d-2aa1-1413-0927-a972122d6990";

@XendraTrl(Identifier="2b08ac82-83e6-1046-ba65-951156ceb992")
public static String es_PE_FIELD_UsedInColumn_MinValue2_Description="Valor Mínimo de un campo";

@XendraTrl(Identifier="2b08ac82-83e6-1046-ba65-951156ceb992")
public static String es_PE_FIELD_UsedInColumn_MinValue2_Help="El Valor Mínimo indica el menor valor permisible para un campo";

@XendraTrl(Identifier="2b08ac82-83e6-1046-ba65-951156ceb992")
public static String es_PE_FIELD_UsedInColumn_MinValue2_Name="Valor Mínimo";

@XendraField(AD_Column_ID="ValueMin",IsCentrallyMaintained=true,
AD_Tab_ID="896eb30c-0038-f362-1ef9-1b18df7727b8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2b08ac82-83e6-1046-ba65-951156ceb992")
public static final String FIELDNAME_UsedInColumn_MinValue2="2b08ac82-83e6-1046-ba65-951156ceb992";

@XendraTrl(Identifier="2b48e1c3-b32d-d3da-7a21-935587c92c16")
public static String es_PE_FIELD_UsedInColumn_MinValue3_Description="Valor Mínimo de un campo";

@XendraTrl(Identifier="2b48e1c3-b32d-d3da-7a21-935587c92c16")
public static String es_PE_FIELD_UsedInColumn_MinValue3_Help="El Valor Mínimo indica el menor valor permisible para un campo";

@XendraTrl(Identifier="2b48e1c3-b32d-d3da-7a21-935587c92c16")
public static String es_PE_FIELD_UsedInColumn_MinValue3_Name="Valor Mínimo";

@XendraField(AD_Column_ID="ValueMin",IsCentrallyMaintained=true,
AD_Tab_ID="45259391-7378-323f-de9f-b2a168722616",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2b48e1c3-b32d-d3da-7a21-935587c92c16")
public static final String FIELDNAME_UsedInColumn_MinValue3="2b48e1c3-b32d-d3da-7a21-935587c92c16";

@XendraTrl(Identifier="99695c67-4fb3-33c2-fbb0-f825c6ddb71d")
public static String es_PE_COLUMN_ValueMin_Name="Valor Mínimo";

@XendraColumn(AD_Element_ID="4017e4d8-25ab-786b-f835-a0847fb18a89",ColumnName="ValueMin",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="99695c67-4fb3-33c2-fbb0-f825c6ddb71d",
Synchronized="2017-08-16 11:33:31.0")
/** Column name ValueMin */
public static final String COLUMNNAME_ValueMin = "ValueMin";
/** Set Version.
@param Version Version of the table definition */
public void setVersion (BigDecimal Version)
{
if (Version == null) throw new IllegalArgumentException ("Version is mandatory.");
set_Value (COLUMNNAME_Version, Version);
}
/** Get Version.
@return Version of the table definition */
public BigDecimal getVersion() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Version);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="0400f1c7-5955-1321-20a7-7db0116eedbb")
public static String es_PE_FIELD_Column_Version_Description="Versión de la definición de tabla";

@XendraTrl(Identifier="0400f1c7-5955-1321-20a7-7db0116eedbb")
public static String es_PE_FIELD_Column_Version_Help="La versión indica la versión de esta definición de tabla";

@XendraTrl(Identifier="0400f1c7-5955-1321-20a7-7db0116eedbb")
public static String es_PE_FIELD_Column_Version_Name="Versión";
@XendraField(AD_Column_ID="Version",
IsCentrallyMaintained=true,AD_Tab_ID="7f22e1b4-bc67-420c-0156-5b87df8c18b3",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=110,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="0400f1c7-5955-1321-20a7-7db0116eedbb")
public static final String FIELDNAME_Column_Version="0400f1c7-5955-1321-20a7-7db0116eedbb";

@XendraTrl(Identifier="387ec427-75b7-6c75-28b3-87fe6e7b42c0")
public static String es_PE_FIELD_UsedInColumn_Version_Description="Versión de la definición de tabla";

@XendraTrl(Identifier="387ec427-75b7-6c75-28b3-87fe6e7b42c0")
public static String es_PE_FIELD_UsedInColumn_Version_Help="La versión indica la versión de esta definición de tabla";

@XendraTrl(Identifier="387ec427-75b7-6c75-28b3-87fe6e7b42c0")
public static String es_PE_FIELD_UsedInColumn_Version_Name="Versión";

@XendraField(AD_Column_ID="Version",IsCentrallyMaintained=true,
AD_Tab_ID="f2864947-dcd5-98af-2bf0-a4e296b595b0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="387ec427-75b7-6c75-28b3-87fe6e7b42c0")
public static final String FIELDNAME_UsedInColumn_Version="387ec427-75b7-6c75-28b3-87fe6e7b42c0";

@XendraTrl(Identifier="0d356906-bd73-fb06-91bd-1318e297405c")
public static String es_PE_FIELD_UsedInColumn_Version2_Description="Versión de la definición de tabla";

@XendraTrl(Identifier="0d356906-bd73-fb06-91bd-1318e297405c")
public static String es_PE_FIELD_UsedInColumn_Version2_Help="La versión indica la versión de esta definición de tabla";

@XendraTrl(Identifier="0d356906-bd73-fb06-91bd-1318e297405c")
public static String es_PE_FIELD_UsedInColumn_Version2_Name="Versión";

@XendraField(AD_Column_ID="Version",IsCentrallyMaintained=true,
AD_Tab_ID="896eb30c-0038-f362-1ef9-1b18df7727b8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0d356906-bd73-fb06-91bd-1318e297405c")
public static final String FIELDNAME_UsedInColumn_Version2="0d356906-bd73-fb06-91bd-1318e297405c";

@XendraTrl(Identifier="a3649bc5-57e5-f0ae-4a3e-46e3a2b031c8")
public static String es_PE_FIELD_UsedInColumn_Version3_Description="Versión de la definición de tabla";

@XendraTrl(Identifier="a3649bc5-57e5-f0ae-4a3e-46e3a2b031c8")
public static String es_PE_FIELD_UsedInColumn_Version3_Help="La versión indica la versión de esta definición de tabla";

@XendraTrl(Identifier="a3649bc5-57e5-f0ae-4a3e-46e3a2b031c8")
public static String es_PE_FIELD_UsedInColumn_Version3_Name="Versión";

@XendraField(AD_Column_ID="Version",IsCentrallyMaintained=true,
AD_Tab_ID="45259391-7378-323f-de9f-b2a168722616",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a3649bc5-57e5-f0ae-4a3e-46e3a2b031c8")
public static final String FIELDNAME_UsedInColumn_Version3="a3649bc5-57e5-f0ae-4a3e-46e3a2b031c8";

@XendraTrl(Identifier="211c06eb-547c-5a1e-7141-e8e42fac8c05")
public static String es_PE_COLUMN_Version_Name="Versión";

@XendraColumn(AD_Element_ID="739fe203-51de-92a9-b8a8-c08f63b73506",ColumnName="Version",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="211c06eb-547c-5a1e-7141-e8e42fac8c05",
Synchronized="2017-08-16 11:33:32.0")
/** Column name Version */
public static final String COLUMNNAME_Version = "Version";
/** Set Value Format.
@param VFormat Format of the value: Can contain fixed format elements, Variables: '_lLoOaAcCa09' */
public void setVFormat (String VFormat)
{
if (VFormat != null && VFormat.length() > 60)
{
log.warning("Length > 60 - truncated");
VFormat = VFormat.substring(0,59);
}
set_Value (COLUMNNAME_VFormat, VFormat);
}
/** Get Value Format.
@return Format of the value: Can contain fixed format elements, Variables: '_lLoOaAcCa09' */
public String getVFormat() 
{
String value = (String)get_Value(COLUMNNAME_VFormat);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="f4b29fba-ef16-0947-70e4-572cde6b6fb2")
public static String es_PE_FIELD_Column_ValueFormat_Description="Formato del valor; puede contener elementos de formato fijo; Variables: \"_lLoOaAcCa09\"";

@XendraTrl(Identifier="f4b29fba-ef16-0947-70e4-572cde6b6fb2")
public static String es_PE_FIELD_Column_ValueFormat_Help="<B>Elementos de validación:</B>";

@XendraTrl(Identifier="f4b29fba-ef16-0947-70e4-572cde6b6fb2")
public static String es_PE_FIELD_Column_ValueFormat_Name="Formato del Valor";

@XendraField(AD_Column_ID="VFormat",IsCentrallyMaintained=true,
AD_Tab_ID="7f22e1b4-bc67-420c-0156-5b87df8c18b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@AD_Reference_ID@=10",DisplayLength=20,IsReadOnly=false,SeqNo=150,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="f4b29fba-ef16-0947-70e4-572cde6b6fb2")
public static final String FIELDNAME_Column_ValueFormat="f4b29fba-ef16-0947-70e4-572cde6b6fb2";

@XendraTrl(Identifier="f0e0063e-399a-bef0-2d61-293b83aa5511")
public static String es_PE_FIELD_UsedInColumn_ValueFormat_Description="Formato del valor; puede contener elementos de formato fijo; Variables: \"_lLoOaAcCa09\"";

@XendraTrl(Identifier="f0e0063e-399a-bef0-2d61-293b83aa5511")
public static String es_PE_FIELD_UsedInColumn_ValueFormat_Help="<B>Elementos de validación:</B>";

@XendraTrl(Identifier="f0e0063e-399a-bef0-2d61-293b83aa5511")
public static String es_PE_FIELD_UsedInColumn_ValueFormat_Name="Formato del Valor";

@XendraField(AD_Column_ID="VFormat",IsCentrallyMaintained=true,
AD_Tab_ID="f2864947-dcd5-98af-2bf0-a4e296b595b0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f0e0063e-399a-bef0-2d61-293b83aa5511")
public static final String FIELDNAME_UsedInColumn_ValueFormat="f0e0063e-399a-bef0-2d61-293b83aa5511";

@XendraTrl(Identifier="df4a16f5-5bbf-e41a-b3d7-caae10e22143")
public static String es_PE_FIELD_UsedInColumn_ValueFormat2_Description="Formato del valor; puede contener elementos de formato fijo; Variables: \"_lLoOaAcCa09\"";

@XendraTrl(Identifier="df4a16f5-5bbf-e41a-b3d7-caae10e22143")
public static String es_PE_FIELD_UsedInColumn_ValueFormat2_Help="<B>Elementos de validación:</B>";

@XendraTrl(Identifier="df4a16f5-5bbf-e41a-b3d7-caae10e22143")
public static String es_PE_FIELD_UsedInColumn_ValueFormat2_Name="Formato del Valor";

@XendraField(AD_Column_ID="VFormat",IsCentrallyMaintained=true,
AD_Tab_ID="896eb30c-0038-f362-1ef9-1b18df7727b8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="df4a16f5-5bbf-e41a-b3d7-caae10e22143")
public static final String FIELDNAME_UsedInColumn_ValueFormat2="df4a16f5-5bbf-e41a-b3d7-caae10e22143";

@XendraTrl(Identifier="1119da10-823a-8fbc-c4e9-cf7eb458c931")
public static String es_PE_FIELD_UsedInColumn_ValueFormat3_Description="Formato del valor; puede contener elementos de formato fijo; Variables: \"_lLoOaAcCa09\"";

@XendraTrl(Identifier="1119da10-823a-8fbc-c4e9-cf7eb458c931")
public static String es_PE_FIELD_UsedInColumn_ValueFormat3_Help="<B>Elementos de validación:</B>";

@XendraTrl(Identifier="1119da10-823a-8fbc-c4e9-cf7eb458c931")
public static String es_PE_FIELD_UsedInColumn_ValueFormat3_Name="Formato del Valor";

@XendraField(AD_Column_ID="VFormat",IsCentrallyMaintained=true,
AD_Tab_ID="45259391-7378-323f-de9f-b2a168722616",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1119da10-823a-8fbc-c4e9-cf7eb458c931")
public static final String FIELDNAME_UsedInColumn_ValueFormat3="1119da10-823a-8fbc-c4e9-cf7eb458c931";

@XendraTrl(Identifier="8163c594-2329-60f6-dee4-54bef62c8015")
public static String es_PE_COLUMN_VFormat_Name="Formato del Valor";

@XendraColumn(AD_Element_ID="041d14f4-3102-bf3a-cf36-5153817cbfad",ColumnName="VFormat",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8163c594-2329-60f6-dee4-54bef62c8015",
Synchronized="2017-08-16 11:33:32.0")
/** Column name VFormat */
public static final String COLUMNNAME_VFormat = "VFormat";
}
