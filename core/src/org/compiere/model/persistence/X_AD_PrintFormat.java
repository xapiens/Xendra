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
/** Generated Model for AD_PrintFormat
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_PrintFormat extends PO
{
/** Standard Constructor
@param ctx context
@param AD_PrintFormat_ID id
@param trxName transaction
*/
public X_AD_PrintFormat (Properties ctx, int AD_PrintFormat_ID, String trxName)
{
super (ctx, AD_PrintFormat_ID, trxName);
/** if (AD_PrintFormat_ID == 0)
{
setAD_PrintColor_ID (0);
setAD_PrintFont_ID (0);
setAD_PrintFormat_ID (0);	
// 0
setAD_PrintPaper_ID (0);
setAD_Table_ID (0);
setFooterMargin (0);
setHeaderMargin (0);
setIsDefault (false);	
// N
setIsForm (false);	
// N
setIsStandardHeaderFooter (true);	
// Y
setIsTableBased (true);	
// Y
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_PrintFormat (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=493 */
public static int Table_ID=MTable.getTable_ID("AD_PrintFormat");

@XendraTrl(Identifier="f2752845-a678-4703-b6c0-ffeefd90047b")
public static String es_PE_TAB_PrintFormat_Description="Mantener Formato de Impresión";

@XendraTrl(Identifier="f2752845-a678-4703-b6c0-ffeefd90047b")
public static String es_PE_TAB_PrintFormat_Name="Formato de Impresión";

@XendraTrl(Identifier="f2752845-a678-4703-b6c0-ffeefd90047b")
public static String es_PE_TAB_PrintFormat_Help="El formato de impresión determina como los datos son organizados para su impresión.";

@XendraTab(Name="Print Format",Description="Maintain Print Format",
Help="The print format determines how data is rendered for print.",
AD_Window_ID="f168482a-df94-29cb-0356-1dc5dc4cafe6",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="f2752845-a678-4703-b6c0-ffeefd90047b",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_PrintFormat="f2752845-a678-4703-b6c0-ffeefd90047b";

@XendraTrl(Identifier="d0c86f83-9305-befd-57a7-3b586fc607a1")
public static String es_PE_TABLE_AD_PrintFormat_Name="Formato de Impresión";

@XendraTable(Name="Print Format",Description="Data Print Format",Help="",
TableName="AD_PrintFormat",AccessLevel="7",AD_Window_ID="f168482a-df94-29cb-0356-1dc5dc4cafe6",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=65,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="d0c86f83-9305-befd-57a7-3b586fc607a1",Synchronized="2017-08-16 11:40:42.0")
/** TableName=AD_PrintFormat */
public static final String Table_Name="AD_PrintFormat";


@XendraIndex(Name="ad_printformat_name",Identifier="2730f8a3-8bbe-46e4-eb54-8b88262d2444",
Column_Names="ad_client_id, ad_table_id, name",IsUnique="true",
TableIdentifier="2730f8a3-8bbe-46e4-eb54-8b88262d2444",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_ad_printformat_name = "2730f8a3-8bbe-46e4-eb54-8b88262d2444";


@XendraIndex(Name="ad_printformat_table",Identifier="e6b7de8c-348c-2c36-d3d1-025e44a4cc76",
Column_Names="ad_table_id",IsUnique="false",TableIdentifier="e6b7de8c-348c-2c36-d3d1-025e44a4cc76",
Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_ad_printformat_table = "e6b7de8c-348c-2c36-d3d1-025e44a4cc76";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_PrintFormat");

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
    Table_ID = MTable.getTable_ID("AD_PrintFormat");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_PrintFormat[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Print Color.
@param AD_PrintColor_ID Color used for printing and display */
public void setAD_PrintColor_ID (int AD_PrintColor_ID)
{
if (AD_PrintColor_ID < 1) throw new IllegalArgumentException ("AD_PrintColor_ID is mandatory.");
set_Value (COLUMNNAME_AD_PrintColor_ID, Integer.valueOf(AD_PrintColor_ID));
}
/** Get Print Color.
@return Color used for printing and display */
public int getAD_PrintColor_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_PrintColor_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="145b06cb-75d3-32a1-3188-69690a401a67")
public static String es_PE_FIELD_PrintFormat_PrintColor_Description="Color usado para imprimir";

@XendraTrl(Identifier="145b06cb-75d3-32a1-3188-69690a401a67")
public static String es_PE_FIELD_PrintFormat_PrintColor_Help="Color usado para imprimir";

@XendraTrl(Identifier="145b06cb-75d3-32a1-3188-69690a401a67")
public static String es_PE_FIELD_PrintFormat_PrintColor_Name="Impresión a Color";

@XendraField(AD_Column_ID="AD_PrintColor_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f2752845-a678-4703-b6c0-ffeefd90047b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="145b06cb-75d3-32a1-3188-69690a401a67")
public static final String FIELDNAME_PrintFormat_PrintColor="145b06cb-75d3-32a1-3188-69690a401a67";

@XendraTrl(Identifier="3a4bd8d4-3631-43bc-9f95-38735f3c4ebd")
public static String es_PE_COLUMN_AD_PrintColor_ID_Name="Impresión a Color";

@XendraColumn(AD_Element_ID="fa351bf7-0efd-2c6a-da0b-f514d630b8e6",ColumnName="AD_PrintColor_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3a4bd8d4-3631-43bc-9f95-38735f3c4ebd",
Synchronized="2017-08-05 16:52:41.0")
/** Column name AD_PrintColor_ID */
public static final String COLUMNNAME_AD_PrintColor_ID = "AD_PrintColor_ID";
/** Set Print Font.
@param AD_PrintFont_ID Maintain Print Font */
public void setAD_PrintFont_ID (int AD_PrintFont_ID)
{
if (AD_PrintFont_ID < 1) throw new IllegalArgumentException ("AD_PrintFont_ID is mandatory.");
set_Value (COLUMNNAME_AD_PrintFont_ID, Integer.valueOf(AD_PrintFont_ID));
}
/** Get Print Font.
@return Maintain Print Font */
public int getAD_PrintFont_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_PrintFont_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d50a6278-2aed-aaa1-afc4-3346cedaaa77")
public static String es_PE_FIELD_PrintFormat_PrintFont_Description="Mantener fuentes de impresión";

@XendraTrl(Identifier="d50a6278-2aed-aaa1-afc4-3346cedaaa77")
public static String es_PE_FIELD_PrintFormat_PrintFont_Help="Fuente usado para imprimir";

@XendraTrl(Identifier="d50a6278-2aed-aaa1-afc4-3346cedaaa77")
public static String es_PE_FIELD_PrintFormat_PrintFont_Name="Fuente de Impresión";

@XendraField(AD_Column_ID="AD_PrintFont_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f2752845-a678-4703-b6c0-ffeefd90047b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d50a6278-2aed-aaa1-afc4-3346cedaaa77")
public static final String FIELDNAME_PrintFormat_PrintFont="d50a6278-2aed-aaa1-afc4-3346cedaaa77";

@XendraTrl(Identifier="5f8f354d-9d6b-310f-ad33-0db24dc89520")
public static String es_PE_COLUMN_AD_PrintFont_ID_Name="Fuente de Impresión";

@XendraColumn(AD_Element_ID="ef22446f-c31f-67f7-382d-81fe5bf53ede",ColumnName="AD_PrintFont_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5f8f354d-9d6b-310f-ad33-0db24dc89520",
Synchronized="2017-08-05 16:52:41.0")
/** Column name AD_PrintFont_ID */
public static final String COLUMNNAME_AD_PrintFont_ID = "AD_PrintFont_ID";
/** Set Print Format.
@param AD_PrintFormat_ID Data Print Format */
public void setAD_PrintFormat_ID (int AD_PrintFormat_ID)
{
if (AD_PrintFormat_ID < 1) throw new IllegalArgumentException ("AD_PrintFormat_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_PrintFormat_ID, Integer.valueOf(AD_PrintFormat_ID));
}
/** Get Print Format.
@return Data Print Format */
public int getAD_PrintFormat_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_PrintFormat_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="94e50362-0d88-8014-3932-acbd34626d6d")
public static String es_PE_FIELD_PrintFormat_PrintFormat_Description="Formato de Impresión de datos";

@XendraTrl(Identifier="94e50362-0d88-8014-3932-acbd34626d6d")
public static String es_PE_FIELD_PrintFormat_PrintFormat_Help="El formato de impresión determina como se despliegan los datos para la impresión";

@XendraTrl(Identifier="94e50362-0d88-8014-3932-acbd34626d6d")
public static String es_PE_FIELD_PrintFormat_PrintFormat_Name="Formato de Impresión";

@XendraField(AD_Column_ID="AD_PrintFormat_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f2752845-a678-4703-b6c0-ffeefd90047b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="94e50362-0d88-8014-3932-acbd34626d6d")
public static final String FIELDNAME_PrintFormat_PrintFormat="94e50362-0d88-8014-3932-acbd34626d6d";
/** Column name AD_PrintFormat_ID */
public static final String COLUMNNAME_AD_PrintFormat_ID = "AD_PrintFormat_ID";
/** Set Print Paper.
@param AD_PrintPaper_ID Printer paper definition */
public void setAD_PrintPaper_ID (int AD_PrintPaper_ID)
{
if (AD_PrintPaper_ID < 1) throw new IllegalArgumentException ("AD_PrintPaper_ID is mandatory.");
set_Value (COLUMNNAME_AD_PrintPaper_ID, Integer.valueOf(AD_PrintPaper_ID));
}
/** Get Print Paper.
@return Printer paper definition */
public int getAD_PrintPaper_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_PrintPaper_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7a1e487b-4c5b-f2f7-fc8a-44c6003c54fa")
public static String es_PE_FIELD_PrintFormat_PrintPaper_Description="Definición del papel de impresión";

@XendraTrl(Identifier="7a1e487b-4c5b-f2f7-fc8a-44c6003c54fa")
public static String es_PE_FIELD_PrintFormat_PrintPaper_Help="Tamaño; orientación y margenes del papel de impresión";

@XendraTrl(Identifier="7a1e487b-4c5b-f2f7-fc8a-44c6003c54fa")
public static String es_PE_FIELD_PrintFormat_PrintPaper_Name="Papel de Impresión";

@XendraField(AD_Column_ID="AD_PrintPaper_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f2752845-a678-4703-b6c0-ffeefd90047b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7a1e487b-4c5b-f2f7-fc8a-44c6003c54fa")
public static final String FIELDNAME_PrintFormat_PrintPaper="7a1e487b-4c5b-f2f7-fc8a-44c6003c54fa";

@XendraTrl(Identifier="081d8dea-d3a0-c78a-bc25-3d14164b8273")
public static String es_PE_COLUMN_AD_PrintPaper_ID_Name="Papel de Impresión";

@XendraColumn(AD_Element_ID="610bbc2f-bb96-a526-a977-87cf4fa40fe1",ColumnName="AD_PrintPaper_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="081d8dea-d3a0-c78a-bc25-3d14164b8273",
Synchronized="2017-08-05 16:52:41.0")
/** Column name AD_PrintPaper_ID */
public static final String COLUMNNAME_AD_PrintPaper_ID = "AD_PrintPaper_ID";
/** Set Print Table Format.
@param AD_PrintTableFormat_ID Table Format in Reports */
public void setAD_PrintTableFormat_ID (int AD_PrintTableFormat_ID)
{
if (AD_PrintTableFormat_ID <= 0) set_Value (COLUMNNAME_AD_PrintTableFormat_ID, null);
 else 
set_Value (COLUMNNAME_AD_PrintTableFormat_ID, Integer.valueOf(AD_PrintTableFormat_ID));
}
/** Get Print Table Format.
@return Table Format in Reports */
public int getAD_PrintTableFormat_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_PrintTableFormat_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="16a26b16-49ab-4acb-202e-25b067c55777")
public static String es_PE_FIELD_PrintFormat_PrintTableFormat_Description="Formato de tabla en los Informes";

@XendraTrl(Identifier="16a26b16-49ab-4acb-202e-25b067c55777")
public static String es_PE_FIELD_PrintFormat_PrintTableFormat_Help="Formato de la impresión de tabla determina el tipo de caracter y colores de la tabla impresa";

@XendraTrl(Identifier="16a26b16-49ab-4acb-202e-25b067c55777")
public static String es_PE_FIELD_PrintFormat_PrintTableFormat_Name="Formato de Impresión de la Tabla";

@XendraField(AD_Column_ID="AD_PrintTableFormat_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f2752845-a678-4703-b6c0-ffeefd90047b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="16a26b16-49ab-4acb-202e-25b067c55777")
public static final String FIELDNAME_PrintFormat_PrintTableFormat="16a26b16-49ab-4acb-202e-25b067c55777";

@XendraTrl(Identifier="1aaf2365-9479-23da-c7c5-ab067b0c543d")
public static String es_PE_COLUMN_AD_PrintTableFormat_ID_Name="Formato de Impresión de la Tabla";

@XendraColumn(AD_Element_ID="bc2eeb94-8816-b747-d04b-e3dda28bda37",
ColumnName="AD_PrintTableFormat_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="@IsForm@=Y",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="1aaf2365-9479-23da-c7c5-ab067b0c543d",Synchronized="2017-08-05 16:52:41.0")
/** Column name AD_PrintTableFormat_ID */
public static final String COLUMNNAME_AD_PrintTableFormat_ID = "AD_PrintTableFormat_ID";
/** Set Report View.
@param AD_ReportView_ID View used to generate this report */
public void setAD_ReportView_ID (int AD_ReportView_ID)
{
if (AD_ReportView_ID <= 0) set_ValueNoCheck (COLUMNNAME_AD_ReportView_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_AD_ReportView_ID, Integer.valueOf(AD_ReportView_ID));
}
/** Get Report View.
@return View used to generate this report */
public int getAD_ReportView_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_ReportView_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="69ecf224-7d6e-b1da-1426-1e56a6b5a8e5")
public static String es_PE_FIELD_PrintFormat_ReportView_Description="Vista usada para generar este Informe";

@XendraTrl(Identifier="69ecf224-7d6e-b1da-1426-1e56a6b5a8e5")
public static String es_PE_FIELD_PrintFormat_ReportView_Help="La Vista del Informe indica la vista usada para generar este Informe";

@XendraTrl(Identifier="69ecf224-7d6e-b1da-1426-1e56a6b5a8e5")
public static String es_PE_FIELD_PrintFormat_ReportView_Name="Vista del Informe";

@XendraField(AD_Column_ID="AD_ReportView_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f2752845-a678-4703-b6c0-ffeefd90047b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="69ecf224-7d6e-b1da-1426-1e56a6b5a8e5")
public static final String FIELDNAME_PrintFormat_ReportView="69ecf224-7d6e-b1da-1426-1e56a6b5a8e5";

@XendraTrl(Identifier="13aa19f6-0a36-0a97-3bd9-0400b24400a6")
public static String es_PE_COLUMN_AD_ReportView_ID_Name="Vista del Informe";

@XendraColumn(AD_Element_ID="c754a5db-23cc-4220-33ac-cc954cd05645",ColumnName="AD_ReportView_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="13aa19f6-0a36-0a97-3bd9-0400b24400a6",
Synchronized="2017-08-05 16:52:41.0")
/** Column name AD_ReportView_ID */
public static final String COLUMNNAME_AD_ReportView_ID = "AD_ReportView_ID";
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

@XendraTrl(Identifier="29b2979e-768d-4e2d-c13b-b52fc23ff2a9")
public static String es_PE_FIELD_PrintFormat_Table_Description="Tabla para los campos";

@XendraTrl(Identifier="29b2979e-768d-4e2d-c13b-b52fc23ff2a9")
public static String es_PE_FIELD_PrintFormat_Table_Help="La Tabla indica una tabla en la que reside un campo ó campos.";

@XendraTrl(Identifier="29b2979e-768d-4e2d-c13b-b52fc23ff2a9")
public static String es_PE_FIELD_PrintFormat_Table_Name="Tabla";

@XendraField(AD_Column_ID="AD_Table_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f2752845-a678-4703-b6c0-ffeefd90047b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="29b2979e-768d-4e2d-c13b-b52fc23ff2a9")
public static final String FIELDNAME_PrintFormat_Table="29b2979e-768d-4e2d-c13b-b52fc23ff2a9";

@XendraTrl(Identifier="955eaaaa-99bd-d365-ea22-535041a2cbcd")
public static String es_PE_COLUMN_AD_Table_ID_Name="Tabla";

@XendraColumn(AD_Element_ID="270eeb02-723b-0ecc-7f56-3c67fa71a7f1",ColumnName="AD_Table_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="955eaaaa-99bd-d365-ea22-535041a2cbcd",
Synchronized="2017-08-05 16:52:41.0")
/** Column name AD_Table_ID */
public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
/** Set Create Copy.
@param CreateCopy Create Copy */
public void setCreateCopy (String CreateCopy)
{
if (CreateCopy != null && CreateCopy.length() > 1)
{
log.warning("Length > 1 - truncated");
CreateCopy = CreateCopy.substring(0,0);
}
set_Value (COLUMNNAME_CreateCopy, CreateCopy);
}
/** Get Create Copy.
@return Create Copy */
public String getCreateCopy() 
{
return (String)get_Value(COLUMNNAME_CreateCopy);
}

@XendraTrl(Identifier="011e3981-e5bd-2dae-f5dd-dcd2d1cd18a8")
public static String es_PE_FIELD_PrintFormat_CreateCopy_Description="Copiar de un formato existente o crear uno de tabla";

@XendraTrl(Identifier="011e3981-e5bd-2dae-f5dd-dcd2d1cd18a8")
public static String es_PE_FIELD_PrintFormat_CreateCopy_Name="Copiar/Crear";

@XendraField(AD_Column_ID="CreateCopy",IsCentrallyMaintained=true,
AD_Tab_ID="f2752845-a678-4703-b6c0-ffeefd90047b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="011e3981-e5bd-2dae-f5dd-dcd2d1cd18a8")
public static final String FIELDNAME_PrintFormat_CreateCopy="011e3981-e5bd-2dae-f5dd-dcd2d1cd18a8";

@XendraTrl(Identifier="8dc2498f-8377-65e1-dff2-a05839aa7a9d")
public static String es_PE_COLUMN_CreateCopy_Name="Crear Copiar";

@XendraColumn(AD_Element_ID="cac16204-e501-2def-b8f0-240c3fc77b0c",ColumnName="CreateCopy",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="43deb41e-9bd5-3c74-5d50-e53205a2e04a",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="8dc2498f-8377-65e1-dff2-a05839aa7a9d",Synchronized="2017-08-05 16:52:41.0")
/** Column name CreateCopy */
public static final String COLUMNNAME_CreateCopy = "CreateCopy";
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

@XendraTrl(Identifier="189ebdc9-e244-fd88-2d89-bb637008b207")
public static String es_PE_FIELD_PrintFormat_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="189ebdc9-e244-fd88-2d89-bb637008b207")
public static String es_PE_FIELD_PrintFormat_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="189ebdc9-e244-fd88-2d89-bb637008b207")
public static String es_PE_FIELD_PrintFormat_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="f2752845-a678-4703-b6c0-ffeefd90047b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="189ebdc9-e244-fd88-2d89-bb637008b207")
public static final String FIELDNAME_PrintFormat_Description="189ebdc9-e244-fd88-2d89-bb637008b207";

@XendraTrl(Identifier="270e1133-ec04-3c1c-8f0b-dcff147f8b62")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="270e1133-ec04-3c1c-8f0b-dcff147f8b62",
Synchronized="2017-08-05 16:52:41.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Footer Margin.
@param FooterMargin Margin of the Footer in 1/72 of an inch */
public void setFooterMargin (int FooterMargin)
{
set_Value (COLUMNNAME_FooterMargin, Integer.valueOf(FooterMargin));
}
/** Get Footer Margin.
@return Margin of the Footer in 1/72 of an inch */
public int getFooterMargin() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_FooterMargin);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e8d1c736-9eb7-f254-9dff-822384a597a9")
public static String es_PE_FIELD_PrintFormat_FooterMargin_Description="Margen del pie de página en espacios de 1/72 de pulgada";

@XendraTrl(Identifier="e8d1c736-9eb7-f254-9dff-822384a597a9")
public static String es_PE_FIELD_PrintFormat_FooterMargin_Help="Distancia desde el final del cuerpo principal de impresión hasta el final de la parte imprimible de la página en espacios de 1/72 de pulgada";

@XendraTrl(Identifier="e8d1c736-9eb7-f254-9dff-822384a597a9")
public static String es_PE_FIELD_PrintFormat_FooterMargin_Name="Margen del Pie";

@XendraField(AD_Column_ID="FooterMargin",IsCentrallyMaintained=true,
AD_Tab_ID="f2752845-a678-4703-b6c0-ffeefd90047b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsForm@=Y & @IsStandardHeaderFooter@=N",DisplayLength=11,IsReadOnly=false,SeqNo=170,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="e8d1c736-9eb7-f254-9dff-822384a597a9")
public static final String FIELDNAME_PrintFormat_FooterMargin="e8d1c736-9eb7-f254-9dff-822384a597a9";

@XendraTrl(Identifier="01018121-7481-2d50-1271-a9a8f42a6497")
public static String es_PE_COLUMN_FooterMargin_Name="Margen del Pie";

@XendraColumn(AD_Element_ID="c2a203b2-7bf0-ef53-b3ba-33107f83a28d",ColumnName="FooterMargin",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="01018121-7481-2d50-1271-a9a8f42a6497",
Synchronized="2017-08-05 16:52:41.0")
/** Column name FooterMargin */
public static final String COLUMNNAME_FooterMargin = "FooterMargin";
/** Set Header Margin.
@param HeaderMargin Margin of the Header in 1/72 of an inch */
public void setHeaderMargin (int HeaderMargin)
{
set_Value (COLUMNNAME_HeaderMargin, Integer.valueOf(HeaderMargin));
}
/** Get Header Margin.
@return Margin of the Header in 1/72 of an inch */
public int getHeaderMargin() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HeaderMargin);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="27a5058f-60ff-bc77-8848-a9128528914c")
public static String es_PE_FIELD_PrintFormat_HeaderMargin_Description="Margen del encabezamiento de página en espacios de 1/72 de pulgada.";

@XendraTrl(Identifier="27a5058f-60ff-bc77-8848-a9128528914c")
public static String es_PE_FIELD_PrintFormat_HeaderMargin_Help="Distancia desde el comienzo de la parte imprimible de la página hasta el comienzo del cuerpo principal del documento medido en 1/72 de pulgada.";

@XendraTrl(Identifier="27a5058f-60ff-bc77-8848-a9128528914c")
public static String es_PE_FIELD_PrintFormat_HeaderMargin_Name="Margen del Encabezamiento";

@XendraField(AD_Column_ID="HeaderMargin",IsCentrallyMaintained=true,
AD_Tab_ID="f2752845-a678-4703-b6c0-ffeefd90047b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsForm@=Y & @IsStandardHeaderFooter@=N",DisplayLength=11,IsReadOnly=false,SeqNo=160,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="27a5058f-60ff-bc77-8848-a9128528914c")
public static final String FIELDNAME_PrintFormat_HeaderMargin="27a5058f-60ff-bc77-8848-a9128528914c";

@XendraTrl(Identifier="75257743-2a73-9acc-cea2-dfad74effb13")
public static String es_PE_COLUMN_HeaderMargin_Name="Margen del Encabezamiento";

@XendraColumn(AD_Element_ID="a56e6f59-c586-66e6-c49c-2d8f8d8763e1",ColumnName="HeaderMargin",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="75257743-2a73-9acc-cea2-dfad74effb13",
Synchronized="2017-08-05 16:52:41.0")
/** Column name HeaderMargin */
public static final String COLUMNNAME_HeaderMargin = "HeaderMargin";
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
@XendraTrl(Identifier="41ff80e0-6062-44ef-b05f-0c24e185a746")
public static String es_PE_COLUMN_Identifier_Name="identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="41ff80e0-6062-44ef-b05f-0c24e185a746",
Synchronized="2017-08-05 16:52:41.0")
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

@XendraTrl(Identifier="103d39ca-b809-b761-5d08-9f74d449c094")
public static String es_PE_FIELD_PrintFormat_Default_Description="Valor Predeterminado";

@XendraTrl(Identifier="103d39ca-b809-b761-5d08-9f74d449c094")
public static String es_PE_FIELD_PrintFormat_Default_Help="El cuadro de verificación indica si este registro será usado como un valor predeterminado";

@XendraTrl(Identifier="103d39ca-b809-b761-5d08-9f74d449c094")
public static String es_PE_FIELD_PrintFormat_Default_Name="Predeterminado";

@XendraField(AD_Column_ID="IsDefault",IsCentrallyMaintained=true,
AD_Tab_ID="f2752845-a678-4703-b6c0-ffeefd90047b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="103d39ca-b809-b761-5d08-9f74d449c094")
public static final String FIELDNAME_PrintFormat_Default="103d39ca-b809-b761-5d08-9f74d449c094";

@XendraTrl(Identifier="fdc8cd7c-7cdf-9118-c65c-186e2dcdf719")
public static String es_PE_COLUMN_IsDefault_Name="Predeterminado";

@XendraColumn(AD_Element_ID="8617f892-e113-a5fd-8715-687f792f136c",ColumnName="IsDefault",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fdc8cd7c-7cdf-9118-c65c-186e2dcdf719",
Synchronized="2017-08-05 16:52:41.0")
/** Column name IsDefault */
public static final String COLUMNNAME_IsDefault = "IsDefault";
/** Set Form.
@param IsForm If Selected, a Form is printed, if not selected a columnar List report */
public void setIsForm (boolean IsForm)
{
set_Value (COLUMNNAME_IsForm, Boolean.valueOf(IsForm));
}
/** Get Form.
@return If Selected, a Form is printed, if not selected a columnar List report */
public boolean isForm() 
{
Object oo = get_Value(COLUMNNAME_IsForm);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="db2fd96c-0b8b-a1df-b95c-45708ee28030")
public static String es_PE_FIELD_PrintFormat_Form_Description="Si se selecciona; se imprime una forma, si no se selecciona; se imprime un Informe en forma de columnas.";

@XendraTrl(Identifier="db2fd96c-0b8b-a1df-b95c-45708ee28030")
public static String es_PE_FIELD_PrintFormat_Form_Help="Una forma tiene elementos individuales con información de su despliegue (por ejemplo: facturas; cheques). Un Informe de columnas tiene columnas individuales (ejemplo: lista de facturas)";

@XendraTrl(Identifier="db2fd96c-0b8b-a1df-b95c-45708ee28030")
public static String es_PE_FIELD_PrintFormat_Form_Name="Forma";
@XendraField(AD_Column_ID="IsForm",
IsCentrallyMaintained=true,AD_Tab_ID="f2752845-a678-4703-b6c0-ffeefd90047b",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="db2fd96c-0b8b-a1df-b95c-45708ee28030")
public static final String FIELDNAME_PrintFormat_Form="db2fd96c-0b8b-a1df-b95c-45708ee28030";

@XendraTrl(Identifier="17587811-764b-d672-7a9f-a0800b422886")
public static String es_PE_COLUMN_IsForm_Name="Forma";

@XendraColumn(AD_Element_ID="5ffa4598-a35f-374a-c633-0986be3890ea",ColumnName="IsForm",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="17587811-764b-d672-7a9f-a0800b422886",
Synchronized="2017-08-05 16:52:41.0")
/** Column name IsForm */
public static final String COLUMNNAME_IsForm = "IsForm";
/** Set Standard Header/Footer.
@param IsStandardHeaderFooter The standard Header and Footer is used */
public void setIsStandardHeaderFooter (boolean IsStandardHeaderFooter)
{
set_Value (COLUMNNAME_IsStandardHeaderFooter, Boolean.valueOf(IsStandardHeaderFooter));
}
/** Get Standard Header/Footer.
@return The standard Header and Footer is used */
public boolean isStandardHeaderFooter() 
{
Object oo = get_Value(COLUMNNAME_IsStandardHeaderFooter);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="78a9086a-9f46-bed3-c469-7d89b5ef527b")
public static String es_PE_FIELD_PrintFormat_StandardHeaderFooter_Description="Los encabezamientos y pie de página estándares son usados";

@XendraTrl(Identifier="78a9086a-9f46-bed3-c469-7d89b5ef527b")
public static String es_PE_FIELD_PrintFormat_StandardHeaderFooter_Help="Sí el encabezamiento estándar no es usado; el debe ser explícitamente definido";

@XendraTrl(Identifier="78a9086a-9f46-bed3-c469-7d89b5ef527b")
public static String es_PE_FIELD_PrintFormat_StandardHeaderFooter_Name="Encabezamiento/Pie Estándar";

@XendraField(AD_Column_ID="IsStandardHeaderFooter",IsCentrallyMaintained=true,
AD_Tab_ID="f2752845-a678-4703-b6c0-ffeefd90047b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="78a9086a-9f46-bed3-c469-7d89b5ef527b")
public static final String FIELDNAME_PrintFormat_StandardHeaderFooter="78a9086a-9f46-bed3-c469-7d89b5ef527b";

@XendraTrl(Identifier="c79a10bd-f348-25a2-3543-752c5524411f")
public static String es_PE_COLUMN_IsStandardHeaderFooter_Name="Encabezamiento/Pie Estándar";

@XendraColumn(AD_Element_ID="e72a6abf-1a6e-242c-0654-64391789aae7",
ColumnName="IsStandardHeaderFooter",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="Y",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c79a10bd-f348-25a2-3543-752c5524411f",Synchronized="2017-08-05 16:52:41.0")
/** Column name IsStandardHeaderFooter */
public static final String COLUMNNAME_IsStandardHeaderFooter = "IsStandardHeaderFooter";
/** Set Table Based.
@param IsTableBased Table based List Reporting */
public void setIsTableBased (boolean IsTableBased)
{
set_ValueNoCheck (COLUMNNAME_IsTableBased, Boolean.valueOf(IsTableBased));
}
/** Get Table Based.
@return Table based List Reporting */
public boolean isTableBased() 
{
Object oo = get_Value(COLUMNNAME_IsTableBased);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="40ac02dd-552e-bb44-526f-941fdf6988c9")
public static String es_PE_FIELD_PrintFormat_TableBased_Description="Informe de Lista basado en tabla";

@XendraTrl(Identifier="40ac02dd-552e-bb44-526f-941fdf6988c9")
public static String es_PE_FIELD_PrintFormat_TableBased_Help="Un Informe columnar de lista basado en tabla es invocado desde el botón de la ventana Informe";

@XendraTrl(Identifier="40ac02dd-552e-bb44-526f-941fdf6988c9")
public static String es_PE_FIELD_PrintFormat_TableBased_Name="Basado en Tabla";

@XendraField(AD_Column_ID="IsTableBased",IsCentrallyMaintained=true,
AD_Tab_ID="f2752845-a678-4703-b6c0-ffeefd90047b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=110,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="40ac02dd-552e-bb44-526f-941fdf6988c9")
public static final String FIELDNAME_PrintFormat_TableBased="40ac02dd-552e-bb44-526f-941fdf6988c9";

@XendraTrl(Identifier="6e257aac-29e7-1667-2d3b-e8d65a3028fd")
public static String es_PE_COLUMN_IsTableBased_Name="Basado en Tabla";

@XendraColumn(AD_Element_ID="988487f7-4c22-545b-ea2d-8e8491b9b537",ColumnName="IsTableBased",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6e257aac-29e7-1667-2d3b-e8d65a3028fd",
Synchronized="2017-08-05 16:52:41.0")
/** Column name IsTableBased */
public static final String COLUMNNAME_IsTableBased = "IsTableBased";

/** JasperProcess_ID AD_Reference=3ad77c2a-8504-6a80-18dd-bd90b6f77a69 */
public static final int JASPERPROCESS_ID_AD_Reference_ID=400;
/** Set Jasper Process.
@param JasperProcess_ID The Jasper Process used by the printengine if any process defined */
public void setJasperProcess_ID (int JasperProcess_ID)
{
if (JasperProcess_ID <= 0) set_Value (COLUMNNAME_JasperProcess_ID, null);
 else 
set_Value (COLUMNNAME_JasperProcess_ID, Integer.valueOf(JasperProcess_ID));
}
/** Get Jasper Process.
@return The Jasper Process used by the printengine if any process defined */
public int getJasperProcess_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_JasperProcess_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9f9f321b-374b-8c64-690f-dd6e289e3d05")
public static String es_PE_FIELD_PrintFormat_JasperProcess_Description="The Jasper Process used by the printengine if any process defined";

@XendraTrl(Identifier="9f9f321b-374b-8c64-690f-dd6e289e3d05")
public static String es_PE_FIELD_PrintFormat_JasperProcess_Name="Jasper Process";

@XendraField(AD_Column_ID="JasperProcess_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f2752845-a678-4703-b6c0-ffeefd90047b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=195,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9f9f321b-374b-8c64-690f-dd6e289e3d05")
public static final String FIELDNAME_PrintFormat_JasperProcess="9f9f321b-374b-8c64-690f-dd6e289e3d05";

@XendraTrl(Identifier="139a2ccf-3ada-1b53-9f5f-e7efe888ef23")
public static String es_PE_COLUMN_JasperProcess_ID_Name="Jasper Process";

@XendraColumn(AD_Element_ID="245c191e-a50f-e368-5255-09a68dfa4da7",ColumnName="JasperProcess_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="3ad77c2a-8504-6a80-18dd-bd90b6f77a69",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="139a2ccf-3ada-1b53-9f5f-e7efe888ef23",Synchronized="2017-08-05 16:52:41.0")
/** Column name JasperProcess_ID */
public static final String COLUMNNAME_JasperProcess_ID = "JasperProcess_ID";
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

@XendraTrl(Identifier="7d184a14-ca8e-ccc4-2959-8f2664acf095")
public static String es_PE_FIELD_PrintFormat_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="7d184a14-ca8e-ccc4-2959-8f2664acf095")
public static String es_PE_FIELD_PrintFormat_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="7d184a14-ca8e-ccc4-2959-8f2664acf095")
public static String es_PE_FIELD_PrintFormat_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="f2752845-a678-4703-b6c0-ffeefd90047b",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="7d184a14-ca8e-ccc4-2959-8f2664acf095")
public static final String FIELDNAME_PrintFormat_Name="7d184a14-ca8e-ccc4-2959-8f2664acf095";

@XendraTrl(Identifier="75050d70-3dcc-1273-45f2-8fb93c66fd42")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="75050d70-3dcc-1273-45f2-8fb93c66fd42",
Synchronized="2017-08-05 16:52:41.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Printer Name.
@param PrinterName Name of the Printer */
public void setPrinterName (String PrinterName)
{
if (PrinterName != null && PrinterName.length() > 40)
{
log.warning("Length > 40 - truncated");
PrinterName = PrinterName.substring(0,39);
}
set_Value (COLUMNNAME_PrinterName, PrinterName);
}
/** Get Printer Name.
@return Name of the Printer */
public String getPrinterName() 
{
String value = (String)get_Value(COLUMNNAME_PrinterName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="32cfcbbc-0bb9-55c9-8f7f-dba1df90a4f8")
public static String es_PE_FIELD_PrintFormat_PrinterName_Description="Nombre de la Impresión";

@XendraTrl(Identifier="32cfcbbc-0bb9-55c9-8f7f-dba1df90a4f8")
public static String es_PE_FIELD_PrintFormat_PrinterName_Help="(Nombre interno de el sistema operativo) de la impresora; Por favor note que el nombre de la impresora puede ser diferente en diversos clientes. Incorpore un nombre de la impresora, que se aplica a TODOS LOS clientes (ej. Impresora en un servidor) <p> Si no se incorpora ninguna, se utiliza la impresora por default. Usted especifica su impresora a utilizar cuando abre una sesión. Tambien puede cambiar la impresora por default en preferencias.";

@XendraTrl(Identifier="32cfcbbc-0bb9-55c9-8f7f-dba1df90a4f8")
public static String es_PE_FIELD_PrintFormat_PrinterName_Name="Nombre Impresión";

@XendraField(AD_Column_ID="PrinterName",IsCentrallyMaintained=true,
AD_Tab_ID="f2752845-a678-4703-b6c0-ffeefd90047b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="32cfcbbc-0bb9-55c9-8f7f-dba1df90a4f8")
public static final String FIELDNAME_PrintFormat_PrinterName="32cfcbbc-0bb9-55c9-8f7f-dba1df90a4f8";

@XendraTrl(Identifier="f1db878e-3e48-858e-d2f9-7106230acff3")
public static String es_PE_COLUMN_PrinterName_Name="Nombre Impresión";

@XendraColumn(AD_Element_ID="3cc8b19c-2d7f-761b-8ec9-3afda5b3a2eb",ColumnName="PrinterName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f1db878e-3e48-858e-d2f9-7106230acff3",
Synchronized="2017-08-05 16:52:41.0")
/** Column name PrinterName */
public static final String COLUMNNAME_PrinterName = "PrinterName";
}
