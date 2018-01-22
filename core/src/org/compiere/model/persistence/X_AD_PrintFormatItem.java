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
import org.compiere.model.reference.REF_AD_PrintFormatItemBarcodeType;
import org.compiere.model.reference.REF_AD_PrintFieldAlignment;
import org.compiere.model.reference.REF_AD_PrintLineAlignment;
import org.compiere.model.reference.REF_AD_PrintArea;
import org.compiere.model.reference.REF_AD_PrintFormatType;
import org.compiere.model.reference.REF_AD_PrintFormatItemShapeType;
/** Generated Model for AD_PrintFormatItem
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_PrintFormatItem extends PO
{
/** Standard Constructor
@param ctx context
@param AD_PrintFormatItem_ID id
@param trxName transaction
*/
public X_AD_PrintFormatItem (Properties ctx, int AD_PrintFormatItem_ID, String trxName)
{
super (ctx, AD_PrintFormatItem_ID, trxName);
/** if (AD_PrintFormatItem_ID == 0)
{
setAD_Column_ID (0);
setAD_PrintFormatChild_ID (0);
setAD_PrintFormat_ID (0);
setAD_PrintFormatItem_ID (0);
setFieldAlignmentType (null);	
// D
setImageIsAttached (false);	
// N
setIsAveraged (false);	
// N
setIsCentrallyMaintained (false);	
// N
setIsCounted (false);	
// N
setIsDeviationCalc (false);	
// N
setIsFilledRectangle (false);	
// N
setIsFixedWidth (false);	
// N
setIsGroupBy (false);	
// N
setIsHeightOneLine (true);	
// Y
setIsImageField (false);	
// N
setIsMaxCalc (false);	
// N
setIsMinCalc (false);	
// N
setIsNextLine (true);	
// Y
setIsNextPage (false);	
// N
setIsOrderBy (false);	
// N
setIsPageBreak (false);	
// N
setIsPrinted (true);	
// Y
setIsRelativePosition (true);	
// Y
setIsRunningTotal (false);	
// N
setIsSetNLPosition (false);	
// N
setIsSummarized (false);	
// N
setIsSuppressNull (false);	
// N
setIsVarianceCalc (false);	
// N
setLineAlignmentType (null);	
// X
setMaxHeight (0);
setMaxWidth (0);
setName (null);
setPrintAreaType (null);	
// C
setPrintFormatType (null);	
// F
setSeqNo (0);	
// @SQL=SELECT COALESCE(MAX(SeqNo),0)+10 AS DefaultValue FROM AD_PrintFormatItem WHERE AD_PrintFormat_ID=@AD_PrintFormat_ID@
setSortNo (0);
setXPosition (0);
setXSpace (0);
setYPosition (0);
setYSpace (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_PrintFormatItem (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=489 */
public static int Table_ID=MTable.getTable_ID("AD_PrintFormatItem");

@XendraTrl(Identifier="16f090b5-1dae-fb29-6953-70d5026fc9a6")
public static String es_PE_TAB_DisplayOrder_Description="Orden de despliegue de los elementos del formato de impresión";

@XendraTrl(Identifier="16f090b5-1dae-fb29-6953-70d5026fc9a6")
public static String es_PE_TAB_DisplayOrder_Name="Orden de Despliegue";

@XendraTab(Name="Display Order",Description="Display Order of the Print Format Items",Help="",
AD_Window_ID="f168482a-df94-29cb-0356-1dc5dc4cafe6",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="935c0869-bbb5-319d-5f60-092b8a807b96",
AD_ColumnSortYesNo_ID="2b3f9c2c-9afd-4e39-be85-247395486f74",IsSortTab=true,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="16f090b5-1dae-fb29-6953-70d5026fc9a6",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_DisplayOrder="16f090b5-1dae-fb29-6953-70d5026fc9a6";

@XendraTrl(Identifier="82bdc8c4-df74-0b58-8ffe-5f9db234cff8")
public static String es_PE_TAB_SortOrder_Description="Criterio de ordenamiento de los elementos del formato de impresión";

@XendraTrl(Identifier="82bdc8c4-df74-0b58-8ffe-5f9db234cff8")
public static String es_PE_TAB_SortOrder_Name="Criterio de Ordenamiento";

@XendraTab(Name="Sort Order",Description="Sort Order of the Print Format Items",Help="",
AD_Window_ID="f168482a-df94-29cb-0356-1dc5dc4cafe6",SeqNo=30,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="4231cc4d-32ab-cfcf-3781-739238a91dcc",
AD_ColumnSortYesNo_ID="96d8a20b-345c-e101-d65d-3be65174f001",IsSortTab=true,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="82bdc8c4-df74-0b58-8ffe-5f9db234cff8",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_SortOrder="82bdc8c4-df74-0b58-8ffe-5f9db234cff8";

@XendraTrl(Identifier="43a46257-9d40-bb6b-447b-df79a88b9055")
public static String es_PE_TAB_FormatItem_Description="Elemento de formato de impresión";

@XendraTrl(Identifier="43a46257-9d40-bb6b-447b-df79a88b9055")
public static String es_PE_TAB_FormatItem_Name="Elemento de Formato";

@XendraTrl(Identifier="43a46257-9d40-bb6b-447b-df79a88b9055")
public static String es_PE_TAB_FormatItem_Help="Elemento del formato de impresión que mantiene la información de despliegue en papel.";

@XendraTab(Name="Format Item",Description="Print Format Item",
Help="Item in the print format maintaining layout information.  The following additional variables are available when printing: <p>@*Page@ - the current page number <br>@*PageCount@ - the total number of pages <br>@*MultiPageInfo@ - 'Page x of y' - only printed if more than one page <br>@*CopyInfo@ - if it is a copy of the document 'Duplicate' is printed <br>@*ReportName@ - name of the report <br>@*Header@ - Full Header with user/client/org name and connection <br>@*CurrentDate@ - the print date <br>@*CurrentDateTime@ - the print time  <p>The layoit logic for forms is: <br> - if not printed: ignore <br> - set New Line Position <br> - new page <br> - new line, if something was printed since last new line<br> - format item<br> - print it (if not null/empty selected)<br> (i.e. supress null does not prevent new line)",
AD_Window_ID="f168482a-df94-29cb-0356-1dc5dc4cafe6",SeqNo=40,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="AD_PrintFormatItem.IsPrinted='Y'",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="43a46257-9d40-bb6b-447b-df79a88b9055",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_FormatItem="43a46257-9d40-bb6b-447b-df79a88b9055";

@XendraTrl(Identifier="891aeaf5-55dc-6dd7-a996-3f71d7330ba4")
public static String es_PE_TABLE_AD_PrintFormatItem_Name="Artículo en Formato de Impresión";


@XendraTable(Name="Print Format Item",Description="Item/Column in the Print format",Help="",
TableName="AD_PrintFormatItem",AccessLevel="7",AD_Window_ID="f168482a-df94-29cb-0356-1dc5dc4cafe6",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="891aeaf5-55dc-6dd7-a996-3f71d7330ba4",Synchronized="2017-08-16 11:40:46.0")
/** TableName=AD_PrintFormatItem */
public static final String Table_Name="AD_PrintFormatItem";


@XendraIndex(Name="ad_printformatitem_format",Identifier="38dec1e6-a3f9-5716-f812-6c1e5a97b089",
Column_Names="ad_printformat_id",IsUnique="false",
TableIdentifier="38dec1e6-a3f9-5716-f812-6c1e5a97b089",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_ad_printformatitem_format = "38dec1e6-a3f9-5716-f812-6c1e5a97b089";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_PrintFormatItem");

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
    Table_ID = MTable.getTable_ID("AD_PrintFormatItem");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_PrintFormatItem[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="f18afb78-87f9-a896-9a40-ecd844244769")
public static String es_PE_FIELD_FormatItem_Column_Description="Columna en la tabla";

@XendraTrl(Identifier="f18afb78-87f9-a896-9a40-ecd844244769")
public static String es_PE_FIELD_FormatItem_Column_Help="Enlace a la columna base de datos de la tabla";

@XendraTrl(Identifier="f18afb78-87f9-a896-9a40-ecd844244769")
public static String es_PE_FIELD_FormatItem_Column_Name="Columna";

@XendraField(AD_Column_ID="AD_Column_ID",IsCentrallyMaintained=true,
AD_Tab_ID="43a46257-9d40-bb6b-447b-df79a88b9055",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@PrintFormatType@=P | @PrintFormatType@=F | @PrintFormatType@=A | @IsImageField@=Y",
DisplayLength=14,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f18afb78-87f9-a896-9a40-ecd844244769")
public static final String FIELDNAME_FormatItem_Column="f18afb78-87f9-a896-9a40-ecd844244769";

@XendraTrl(Identifier="a80cb244-0dcd-8fc4-2ce6-8501f104ccf2")
public static String es_PE_COLUMN_AD_Column_ID_Name="Columna";

@XendraColumn(AD_Element_ID="a0dcf1ba-2ef3-ca06-ed42-8ae37c632eaf",ColumnName="AD_Column_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="084db087-1100-ad15-806b-d1b94a96650c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="a80cb244-0dcd-8fc4-2ce6-8501f104ccf2",Synchronized="2017-08-05 16:52:41.0")
/** Column name AD_Column_ID */
public static final String COLUMNNAME_AD_Column_ID = "AD_Column_ID";
/** Set Print Color.
@param AD_PrintColor_ID Color used for printing and display */
public void setAD_PrintColor_ID (int AD_PrintColor_ID)
{
if (AD_PrintColor_ID <= 0) set_Value (COLUMNNAME_AD_PrintColor_ID, null);
 else 
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

@XendraTrl(Identifier="6ce138f1-aa07-abe8-b2db-1e4fb234e17a")
public static String es_PE_FIELD_FormatItem_PrintColor_Description="Color usado para imprimir";

@XendraTrl(Identifier="6ce138f1-aa07-abe8-b2db-1e4fb234e17a")
public static String es_PE_FIELD_FormatItem_PrintColor_Help="Color usado para imprimir";

@XendraTrl(Identifier="6ce138f1-aa07-abe8-b2db-1e4fb234e17a")
public static String es_PE_FIELD_FormatItem_PrintColor_Name="Impresión a Color";

@XendraField(AD_Column_ID="AD_PrintColor_ID",IsCentrallyMaintained=true,
AD_Tab_ID="43a46257-9d40-bb6b-447b-df79a88b9055",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@PrintFormatType@=F | @PrintFormatType@=T | @PrintFormatType@=R | @PrintFormatType@=L",
DisplayLength=14,IsReadOnly=false,SeqNo=380,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6ce138f1-aa07-abe8-b2db-1e4fb234e17a")
public static final String FIELDNAME_FormatItem_PrintColor="6ce138f1-aa07-abe8-b2db-1e4fb234e17a";

@XendraTrl(Identifier="5b5de069-7682-7175-0a49-29d545d0cd0f")
public static String es_PE_COLUMN_AD_PrintColor_ID_Name="Impresión a Color";

@XendraColumn(AD_Element_ID="fa351bf7-0efd-2c6a-da0b-f514d630b8e6",ColumnName="AD_PrintColor_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5b5de069-7682-7175-0a49-29d545d0cd0f",
Synchronized="2017-08-05 16:52:41.0")
/** Column name AD_PrintColor_ID */
public static final String COLUMNNAME_AD_PrintColor_ID = "AD_PrintColor_ID";
/** Set Print Font.
@param AD_PrintFont_ID Maintain Print Font */
public void setAD_PrintFont_ID (int AD_PrintFont_ID)
{
if (AD_PrintFont_ID <= 0) set_Value (COLUMNNAME_AD_PrintFont_ID, null);
 else 
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

@XendraTrl(Identifier="fc54026c-2860-3814-29f6-346ae4a71e2b")
public static String es_PE_FIELD_FormatItem_PrintFont_Description="Mantener fuentes de impresión";

@XendraTrl(Identifier="fc54026c-2860-3814-29f6-346ae4a71e2b")
public static String es_PE_FIELD_FormatItem_PrintFont_Help="Fuente usado para imprimir";

@XendraTrl(Identifier="fc54026c-2860-3814-29f6-346ae4a71e2b")
public static String es_PE_FIELD_FormatItem_PrintFont_Name="Fuente de Impresión";

@XendraField(AD_Column_ID="AD_PrintFont_ID",IsCentrallyMaintained=true,
AD_Tab_ID="43a46257-9d40-bb6b-447b-df79a88b9055",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@PrintFormatType@=F | @PrintFormatType@=T",DisplayLength=14,IsReadOnly=false,
SeqNo=390,SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="fc54026c-2860-3814-29f6-346ae4a71e2b")
public static final String FIELDNAME_FormatItem_PrintFont="fc54026c-2860-3814-29f6-346ae4a71e2b";

@XendraTrl(Identifier="feca1cfe-4d24-1055-fb41-6ac3387fec56")
public static String es_PE_COLUMN_AD_PrintFont_ID_Name="Fuente de Impresión";

@XendraColumn(AD_Element_ID="ef22446f-c31f-67f7-382d-81fe5bf53ede",ColumnName="AD_PrintFont_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="feca1cfe-4d24-1055-fb41-6ac3387fec56",
Synchronized="2017-08-05 16:52:41.0")
/** Column name AD_PrintFont_ID */
public static final String COLUMNNAME_AD_PrintFont_ID = "AD_PrintFont_ID";

/** AD_PrintFormatChild_ID AD_Reference=377b8075-d154-6c3b-1cc0-dea545937fae */
public static final int AD_PRINTFORMATCHILD_ID_AD_Reference_ID=259;
/** Set Included Print Format.
@param AD_PrintFormatChild_ID Print format that is included here. */
public void setAD_PrintFormatChild_ID (int AD_PrintFormatChild_ID)
{
if (AD_PrintFormatChild_ID < 1) throw new IllegalArgumentException ("AD_PrintFormatChild_ID is mandatory.");
set_Value (COLUMNNAME_AD_PrintFormatChild_ID, Integer.valueOf(AD_PrintFormatChild_ID));
}
/** Get Included Print Format.
@return Print format that is included here. */
public int getAD_PrintFormatChild_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_PrintFormatChild_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9c0c7354-2809-7c68-f595-3e76359451f5")
public static String es_PE_FIELD_FormatItem_IncludedPrintFormat_Description="Imprimir el formato que está incluido aquí";

@XendraTrl(Identifier="9c0c7354-2809-7c68-f595-3e76359451f5")
public static String es_PE_FIELD_FormatItem_IncludedPrintFormat_Help="Formato de Impresión Incluido permite; por ejemplo; que se impriman líneas en los registros del encabezamiento. La columna provee el enlace padre";

@XendraTrl(Identifier="9c0c7354-2809-7c68-f595-3e76359451f5")
public static String es_PE_FIELD_FormatItem_IncludedPrintFormat_Name="Formato de Impresión Incluido";

@XendraField(AD_Column_ID="AD_PrintFormatChild_ID",IsCentrallyMaintained=true,
AD_Tab_ID="43a46257-9d40-bb6b-447b-df79a88b9055",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@PrintFormatType@=P | @PrintFormatType@=A",DisplayLength=14,IsReadOnly=false,
SeqNo=150,SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="9c0c7354-2809-7c68-f595-3e76359451f5")
public static final String FIELDNAME_FormatItem_IncludedPrintFormat="9c0c7354-2809-7c68-f595-3e76359451f5";

@XendraTrl(Identifier="f51fb015-9219-eb60-c7c0-2b5dd0053316")
public static String es_PE_COLUMN_AD_PrintFormatChild_ID_Name="Formato de Impresión Incluido";

@XendraColumn(AD_Element_ID="7012522d-3ee1-e0c4-b3a4-4c3f16bf61ef",
ColumnName="AD_PrintFormatChild_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="377b8075-d154-6c3b-1cc0-dea545937fae",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="f51fb015-9219-eb60-c7c0-2b5dd0053316",
Synchronized="2017-08-05 16:52:41.0")
/** Column name AD_PrintFormatChild_ID */
public static final String COLUMNNAME_AD_PrintFormatChild_ID = "AD_PrintFormatChild_ID";
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

@XendraTrl(Identifier="97049b61-db72-30a4-b1cc-b24f93269d51")
public static String es_PE_FIELD_FormatItem_PrintFormat_Description="Formato de Impresión de datos";

@XendraTrl(Identifier="97049b61-db72-30a4-b1cc-b24f93269d51")
public static String es_PE_FIELD_FormatItem_PrintFormat_Help="El formato de impresión determina como se despliegan los datos para la impresión";

@XendraTrl(Identifier="97049b61-db72-30a4-b1cc-b24f93269d51")
public static String es_PE_FIELD_FormatItem_PrintFormat_Name="Formato de Impresión";

@XendraField(AD_Column_ID="AD_PrintFormat_ID",IsCentrallyMaintained=true,
AD_Tab_ID="43a46257-9d40-bb6b-447b-df79a88b9055",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="97049b61-db72-30a4-b1cc-b24f93269d51")
public static final String FIELDNAME_FormatItem_PrintFormat="97049b61-db72-30a4-b1cc-b24f93269d51";

@XendraTrl(Identifier="7b76c911-8375-b983-0216-cc71183d3c51")
public static String es_PE_COLUMN_AD_PrintFormat_ID_Name="Formato de Impresión";

@XendraColumn(AD_Element_ID="3d4916cb-0ecd-15a5-1916-be4c68c10d1f",ColumnName="AD_PrintFormat_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7b76c911-8375-b983-0216-cc71183d3c51",
Synchronized="2017-08-05 16:52:41.0")
/** Column name AD_PrintFormat_ID */
public static final String COLUMNNAME_AD_PrintFormat_ID = "AD_PrintFormat_ID";
/** Set Print Format Item.
@param AD_PrintFormatItem_ID Item/Column in the Print format */
public void setAD_PrintFormatItem_ID (int AD_PrintFormatItem_ID)
{
if (AD_PrintFormatItem_ID < 1) throw new IllegalArgumentException ("AD_PrintFormatItem_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_PrintFormatItem_ID, Integer.valueOf(AD_PrintFormatItem_ID));
}
/** Get Print Format Item.
@return Item/Column in the Print format */
public int getAD_PrintFormatItem_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_PrintFormatItem_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9c9e6921-f4fe-d76c-5478-a47e12ea85cd")
public static String es_PE_FIELD_FormatItem_PrintFormatItem_Description="Artículo/Columna en el formato de Impresión";

@XendraTrl(Identifier="9c9e6921-f4fe-d76c-5478-a47e12ea85cd")
public static String es_PE_FIELD_FormatItem_PrintFormatItem_Help="Artículo/Columna en el formato de impresión en donde se mantiene la información de despliegue";

@XendraTrl(Identifier="9c9e6921-f4fe-d76c-5478-a47e12ea85cd")
public static String es_PE_FIELD_FormatItem_PrintFormatItem_Name="Artículo en Formato de Impresión";

@XendraField(AD_Column_ID="AD_PrintFormatItem_ID",IsCentrallyMaintained=true,
AD_Tab_ID="43a46257-9d40-bb6b-447b-df79a88b9055",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9c9e6921-f4fe-d76c-5478-a47e12ea85cd")
public static final String FIELDNAME_FormatItem_PrintFormatItem="9c9e6921-f4fe-d76c-5478-a47e12ea85cd";
/** Column name AD_PrintFormatItem_ID */
public static final String COLUMNNAME_AD_PrintFormatItem_ID = "AD_PrintFormatItem_ID";
/** Set Graph.
@param AD_PrintGraph_ID Graph included in Reports */
public void setAD_PrintGraph_ID (int AD_PrintGraph_ID)
{
if (AD_PrintGraph_ID <= 0) set_Value (COLUMNNAME_AD_PrintGraph_ID, null);
 else 
set_Value (COLUMNNAME_AD_PrintGraph_ID, Integer.valueOf(AD_PrintGraph_ID));
}
/** Get Graph.
@return Graph included in Reports */
public int getAD_PrintGraph_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_PrintGraph_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ae43f7bf-e3fb-d933-9204-195c94f383cf")
public static String es_PE_FIELD_FormatItem_Graph_Description="Gráfico incluido en Informes";

@XendraTrl(Identifier="ae43f7bf-e3fb-d933-9204-195c94f383cf")
public static String es_PE_FIELD_FormatItem_Graph_Help="Gráfico de línea ó pastel a ser impreso en los Informes.";

@XendraTrl(Identifier="ae43f7bf-e3fb-d933-9204-195c94f383cf")
public static String es_PE_FIELD_FormatItem_Graph_Name="Gráfico";

@XendraField(AD_Column_ID="AD_PrintGraph_ID",IsCentrallyMaintained=true,
AD_Tab_ID="43a46257-9d40-bb6b-447b-df79a88b9055",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ae43f7bf-e3fb-d933-9204-195c94f383cf")
public static final String FIELDNAME_FormatItem_Graph="ae43f7bf-e3fb-d933-9204-195c94f383cf";

@XendraTrl(Identifier="ab2efef6-94b3-c951-e6b9-821b415649e1")
public static String es_PE_COLUMN_AD_PrintGraph_ID_Name="Gráfico";

@XendraColumn(AD_Element_ID="9938c5e4-c2a4-4b17-17c8-d6d693f96065",ColumnName="AD_PrintGraph_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ab2efef6-94b3-c951-e6b9-821b415649e1",
Synchronized="2017-08-05 16:52:41.0")
/** Column name AD_PrintGraph_ID */
public static final String COLUMNNAME_AD_PrintGraph_ID = "AD_PrintGraph_ID";
/** Set Arc Diameter.
@param ArcDiameter Arc Diameter for rounded Rectangles */
public void setArcDiameter (int ArcDiameter)
{
set_Value (COLUMNNAME_ArcDiameter, Integer.valueOf(ArcDiameter));
}
/** Get Arc Diameter.
@return Arc Diameter for rounded Rectangles */
public int getArcDiameter() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_ArcDiameter);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ffede960-ecbe-c44b-28e8-657f8967a253")
public static String es_PE_FIELD_FormatItem_ArcDiameter_Description="Diámetro del arco para los rectángulos redondeados.";

@XendraTrl(Identifier="ffede960-ecbe-c44b-28e8-657f8967a253")
public static String es_PE_FIELD_FormatItem_ArcDiameter_Help="Anchura del diámetro de horizontal/vertical del arco en las cuatro esquinas.";

@XendraTrl(Identifier="ffede960-ecbe-c44b-28e8-657f8967a253")
public static String es_PE_FIELD_FormatItem_ArcDiameter_Name="Díametro del Arco";

@XendraField(AD_Column_ID="ArcDiameter",IsCentrallyMaintained=true,
AD_Tab_ID="43a46257-9d40-bb6b-447b-df79a88b9055",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@PrintFormatType@=R & @ShapeType@=R",DisplayLength=11,IsReadOnly=false,SeqNo=400,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="ffede960-ecbe-c44b-28e8-657f8967a253")
public static final String FIELDNAME_FormatItem_ArcDiameter="ffede960-ecbe-c44b-28e8-657f8967a253";

@XendraTrl(Identifier="566f1674-6f60-446b-d203-e709f5b33278")
public static String es_PE_COLUMN_ArcDiameter_Name="Díametro del Arco";

@XendraColumn(AD_Element_ID="9fa3332a-d854-e589-3d40-1a47d4a24559",ColumnName="ArcDiameter",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="566f1674-6f60-446b-d203-e709f5b33278",
Synchronized="2017-08-05 16:52:41.0")
/** Column name ArcDiameter */
public static final String COLUMNNAME_ArcDiameter = "ArcDiameter";

/** BarcodeType AD_Reference=ed3b6e44-4474-8dff-96dc-3f65a0deec17 */
public static final int BARCODETYPE_AD_Reference_ID=377;
/** Set Barcode Type.
@param BarcodeType Type of barcode */
public void setBarcodeType (String BarcodeType)
{
if (BarcodeType == null || BarcodeType.equals(REF_AD_PrintFormatItemBarcodeType.Code39USD3WOChecksum) || BarcodeType.equals(REF_AD_PrintFormatItemBarcodeType.Code393Of9LinearWithChecksum) || BarcodeType.equals(REF_AD_PrintFormatItemBarcodeType.Codabar2Of7Linear) || BarcodeType.equals(REF_AD_PrintFormatItemBarcodeType.Code393Of9LinearWOChecksum) || BarcodeType.equals(REF_AD_PrintFormatItemBarcodeType.CodeabarLinear) || BarcodeType.equals(REF_AD_PrintFormatItemBarcodeType.Code128ACharacterSet) || BarcodeType.equals(REF_AD_PrintFormatItemBarcodeType.Code39LinearWOChecksum) || BarcodeType.equals(REF_AD_PrintFormatItemBarcodeType.Code128DynamicallySwitching) || BarcodeType.equals(REF_AD_PrintFormatItemBarcodeType.Code128BCharacterSet) || BarcodeType.equals(REF_AD_PrintFormatItemBarcodeType.Code128CCharacterSet) || BarcodeType.equals(REF_AD_PrintFormatItemBarcodeType.Code39LinearWithChecksum) || BarcodeType.equals(REF_AD_PrintFormatItemBarcodeType.EAN128) || BarcodeType.equals(REF_AD_PrintFormatItemBarcodeType.GlobalTradeItemNoGTINUCCEAN128) || BarcodeType.equals(REF_AD_PrintFormatItemBarcodeType.CodabarMonarchLinear) || BarcodeType.equals(REF_AD_PrintFormatItemBarcodeType.CodabarNW_7Linear) || BarcodeType.equals(REF_AD_PrintFormatItemBarcodeType.PDF417TwoDimensional) || BarcodeType.equals(REF_AD_PrintFormatItemBarcodeType.SCC_14ShippingCodeUCCEAN128) || BarcodeType.equals(REF_AD_PrintFormatItemBarcodeType.ShipmentIDNumberUCCEAN128) || BarcodeType.equals(REF_AD_PrintFormatItemBarcodeType.UCC128) || BarcodeType.equals(REF_AD_PrintFormatItemBarcodeType.Code39USD3WithChecksum) || BarcodeType.equals(REF_AD_PrintFormatItemBarcodeType.CodabarUSD_4Linear) || BarcodeType.equals(REF_AD_PrintFormatItemBarcodeType.USPostalServiceUCCEAN128) || BarcodeType.equals(REF_AD_PrintFormatItemBarcodeType.SSCC_18NumberUCCEAN128) || BarcodeType.equals(REF_AD_PrintFormatItemBarcodeType.EAN13));
 else throw new IllegalArgumentException ("BarcodeType Invalid value - " + BarcodeType + " - Reference_ID=377 - us3 - 3O9 - 2o9 - 3o9 - COD - 28A - c39 - C28 - 28B - 28C - C39 - E28 - GTN - MON - NW7 - 417 - C14 - SID - U28 - US3 - US4 - USP - C18 - EAN13");
if (BarcodeType != null && BarcodeType.length() > 3)
{
log.warning("Length > 3 - truncated");
BarcodeType = BarcodeType.substring(0,2);
}
set_Value (COLUMNNAME_BarcodeType, BarcodeType);
}
/** Get Barcode Type.
@return Type of barcode */
public String getBarcodeType() 
{
return (String)get_Value(COLUMNNAME_BarcodeType);
}

@XendraTrl(Identifier="fde2b364-b1a8-693f-d38f-023003820d89")
public static String es_PE_FIELD_FormatItem_BarcodeType_Description="Type of barcode";

@XendraTrl(Identifier="fde2b364-b1a8-693f-d38f-023003820d89")
public static String es_PE_FIELD_FormatItem_BarcodeType_Name="Barcode Type";

@XendraField(AD_Column_ID="BarcodeType",IsCentrallyMaintained=true,
AD_Tab_ID="43a46257-9d40-bb6b-447b-df79a88b9055",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@PrintFormatType@=F",DisplayLength=3,IsReadOnly=false,SeqNo=200,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="fde2b364-b1a8-693f-d38f-023003820d89")
public static final String FIELDNAME_FormatItem_BarcodeType="fde2b364-b1a8-693f-d38f-023003820d89";

@XendraTrl(Identifier="9addc8f3-5ea3-0295-250b-1459663c5c13")
public static String es_PE_COLUMN_BarcodeType_Name="Barcode Type";

@XendraColumn(AD_Element_ID="2b2af7ba-1004-5797-52f6-c8af6a8c7750",ColumnName="BarcodeType",
AD_Reference_ID=17,AD_Reference_Value_ID="ed3b6e44-4474-8dff-96dc-3f65a0deec17",AD_Val_Rule_ID="",
FieldLength=3,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="9addc8f3-5ea3-0295-250b-1459663c5c13",Synchronized="2017-08-05 16:52:41.0")
/** Column name BarcodeType */
public static final String COLUMNNAME_BarcodeType = "BarcodeType";
/** Set Below Column.
@param BelowColumn Print this column below the column index entered */
public void setBelowColumn (int BelowColumn)
{
set_Value (COLUMNNAME_BelowColumn, Integer.valueOf(BelowColumn));
}
/** Get Below Column.
@return Print this column below the column index entered */
public int getBelowColumn() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_BelowColumn);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="16e9f4ac-aee0-9593-0cc0-f617dd388fa7")
public static String es_PE_FIELD_FormatItem_BelowColumn_Description="Imprimir esta columna debajo del índice de columna entrado";

@XendraTrl(Identifier="16e9f4ac-aee0-9593-0cc0-f617dd388fa7")
public static String es_PE_FIELD_FormatItem_BelowColumn_Help="Esta columna es impresa en una segunda línea abajo del contenido de la primera línea identificada. Por favor note que esto depende de la secuencia real. Entre un 1 para agregar la información debajo de la primera columna";

@XendraTrl(Identifier="16e9f4ac-aee0-9593-0cc0-f617dd388fa7")
public static String es_PE_FIELD_FormatItem_BelowColumn_Name="Columna Abajo";

@XendraField(AD_Column_ID="BelowColumn",IsCentrallyMaintained=true,
AD_Tab_ID="43a46257-9d40-bb6b-447b-df79a88b9055",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsForm@=N & @IsNextLine@=Y",DisplayLength=11,IsReadOnly=false,SeqNo=270,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="16e9f4ac-aee0-9593-0cc0-f617dd388fa7")
public static final String FIELDNAME_FormatItem_BelowColumn="16e9f4ac-aee0-9593-0cc0-f617dd388fa7";

@XendraTrl(Identifier="abb09ca9-a831-92cf-31c4-13e2655a565a")
public static String es_PE_COLUMN_BelowColumn_Name="Columna Abajo";

@XendraColumn(AD_Element_ID="0370185f-ab16-1380-8b43-45959164bf29",ColumnName="BelowColumn",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="abb09ca9-a831-92cf-31c4-13e2655a565a",
Synchronized="2017-08-05 16:52:41.0")
/** Column name BelowColumn */
public static final String COLUMNNAME_BelowColumn = "BelowColumn";

/** FieldAlignmentType AD_Reference=dd7c47c9-c630-6c12-8480-b381a87270cc */
public static final int FIELDALIGNMENTTYPE_AD_Reference_ID=253;
/** Set Field Alignment.
@param FieldAlignmentType Field Text Alignment */
public void setFieldAlignmentType (String FieldAlignmentType)
{
if (FieldAlignmentType == null) throw new IllegalArgumentException ("FieldAlignmentType is mandatory");
if (FieldAlignmentType.equals(REF_AD_PrintFieldAlignment.Default) || FieldAlignmentType.equals(REF_AD_PrintFieldAlignment.LeadingLeft) || FieldAlignmentType.equals(REF_AD_PrintFieldAlignment.TrailingRight) || FieldAlignmentType.equals(REF_AD_PrintFieldAlignment.Block) || FieldAlignmentType.equals(REF_AD_PrintFieldAlignment.Center));
 else throw new IllegalArgumentException ("FieldAlignmentType Invalid value - " + FieldAlignmentType + " - Reference_ID=253 - D - L - T - B - C");
if (FieldAlignmentType.length() > 1)
{
log.warning("Length > 1 - truncated");
FieldAlignmentType = FieldAlignmentType.substring(0,0);
}
set_Value (COLUMNNAME_FieldAlignmentType, FieldAlignmentType);
}
/** Get Field Alignment.
@return Field Text Alignment */
public String getFieldAlignmentType() 
{
return (String)get_Value(COLUMNNAME_FieldAlignmentType);
}

@XendraTrl(Identifier="890c914b-7f52-fc4c-1eab-1478bb04d063")
public static String es_PE_FIELD_FormatItem_FieldAlignment_Description="Alineación del campo de texto";

@XendraTrl(Identifier="890c914b-7f52-fc4c-1eab-1478bb04d063")
public static String es_PE_FIELD_FormatItem_FieldAlignment_Help="Alineación del campo de texto. El valor por defecto depende del tipo de datos a desplegar: Números son alineados a la derecha; los demás datos son alineados a la izquierda";

@XendraTrl(Identifier="890c914b-7f52-fc4c-1eab-1478bb04d063")
public static String es_PE_FIELD_FormatItem_FieldAlignment_Name="Alineación del Campo";

@XendraField(AD_Column_ID="FieldAlignmentType",IsCentrallyMaintained=true,
AD_Tab_ID="43a46257-9d40-bb6b-447b-df79a88b9055",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@PrintFormatType@!P",DisplayLength=14,IsReadOnly=false,SeqNo=290,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="890c914b-7f52-fc4c-1eab-1478bb04d063")
public static final String FIELDNAME_FormatItem_FieldAlignment="890c914b-7f52-fc4c-1eab-1478bb04d063";

@XendraTrl(Identifier="b8c7f60e-0d80-7a59-3b84-8fac1c09afd4")
public static String es_PE_COLUMN_FieldAlignmentType_Name="Alineación del Campo";

@XendraColumn(AD_Element_ID="cb7258dc-a232-f6b4-7ed2-c37e94a91a24",ColumnName="FieldAlignmentType",
AD_Reference_ID=17,AD_Reference_Value_ID="dd7c47c9-c630-6c12-8480-b381a87270cc",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="D",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="b8c7f60e-0d80-7a59-3b84-8fac1c09afd4",Synchronized="2017-08-05 16:52:41.0")
/** Column name FieldAlignmentType */
public static final String COLUMNNAME_FieldAlignmentType = "FieldAlignmentType";
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
@XendraTrl(Identifier="e02b7c67-7503-9ceb-f05e-9e5f8042b884")
public static String es_PE_COLUMN_FormatPattern_Name="FormatPattern";

@XendraColumn(AD_Element_ID="32a01b46-dbdc-64d9-1360-90d0808210a6",ColumnName="FormatPattern",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e02b7c67-7503-9ceb-f05e-9e5f8042b884",
Synchronized="2017-08-05 16:52:41.0")
/** Column name FormatPattern */
public static final String COLUMNNAME_FormatPattern = "FormatPattern";
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
@XendraTrl(Identifier="ab75b0a2-4e28-404b-938a-06d0461240ff")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ab75b0a2-4e28-404b-938a-06d0461240ff",
Synchronized="2017-08-05 16:52:41.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Image attached.
@param ImageIsAttached The image to be printed is attached to the record */
public void setImageIsAttached (boolean ImageIsAttached)
{
set_Value (COLUMNNAME_ImageIsAttached, Boolean.valueOf(ImageIsAttached));
}
/** Get Image attached.
@return The image to be printed is attached to the record */
public boolean isImageIsAttached() 
{
Object oo = get_Value(COLUMNNAME_ImageIsAttached);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="752ffa7e-b1f3-371d-89cb-8422cc60c6f3")
public static String es_PE_FIELD_FormatItem_ImageAttached_Description="La imagen a ser impresa esta adjunta al registro";

@XendraTrl(Identifier="752ffa7e-b1f3-371d-89cb-8422cc60c6f3")
public static String es_PE_FIELD_FormatItem_ImageAttached_Help="La imagen a ser impresa está guardada en la base de datos como un documento adjunto al registro. La imagen puede ser gif; jpeg ó png.";

@XendraTrl(Identifier="752ffa7e-b1f3-371d-89cb-8422cc60c6f3")
public static String es_PE_FIELD_FormatItem_ImageAttached_Name="Imagen Adjunta";

@XendraField(AD_Column_ID="ImageIsAttached",IsCentrallyMaintained=true,
AD_Tab_ID="43a46257-9d40-bb6b-447b-df79a88b9055",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@PrintFormatType@=I & @IsImageField@=N",DisplayLength=1,IsReadOnly=false,SeqNo=170,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="752ffa7e-b1f3-371d-89cb-8422cc60c6f3")
public static final String FIELDNAME_FormatItem_ImageAttached="752ffa7e-b1f3-371d-89cb-8422cc60c6f3";

@XendraTrl(Identifier="32e7371c-ef36-cd0a-f450-6df284557e0f")
public static String es_PE_COLUMN_ImageIsAttached_Name="Imagen Adjunta";

@XendraColumn(AD_Element_ID="9deba469-7f61-a9cb-235c-e59cec5b1f36",ColumnName="ImageIsAttached",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="32e7371c-ef36-cd0a-f450-6df284557e0f",
Synchronized="2017-08-05 16:52:41.0")
/** Column name ImageIsAttached */
public static final String COLUMNNAME_ImageIsAttached = "ImageIsAttached";
/** Set Image URL.
@param ImageURL URL of  image */
public void setImageURL (String ImageURL)
{
if (ImageURL != null && ImageURL.length() > 120)
{
log.warning("Length > 120 - truncated");
ImageURL = ImageURL.substring(0,119);
}
set_Value (COLUMNNAME_ImageURL, ImageURL);
}
/** Get Image URL.
@return URL of  image */
public String getImageURL() 
{
String value = (String)get_Value(COLUMNNAME_ImageURL);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="59b6dc49-1fca-b0c3-8b1e-47651b2fe419")
public static String es_PE_FIELD_FormatItem_ImageURL_Description="URL de la estructura de la imagen";

@XendraTrl(Identifier="59b6dc49-1fca-b0c3-8b1e-47651b2fe419")
public static String es_PE_FIELD_FormatItem_ImageURL_Help="URL de imagen de la textura; La imagen no se almacena en la base de datos; ";

@XendraTrl(Identifier="59b6dc49-1fca-b0c3-8b1e-47651b2fe419")
public static String es_PE_FIELD_FormatItem_ImageURL_Name="URL de la Imagen";

@XendraField(AD_Column_ID="ImageURL",IsCentrallyMaintained=true,
AD_Tab_ID="43a46257-9d40-bb6b-447b-df79a88b9055",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@PrintFormatType@=I & @ImageIsAttached@=N & @IsImageField@=N",DisplayLength=29,
IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,
Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="59b6dc49-1fca-b0c3-8b1e-47651b2fe419")
public static final String FIELDNAME_FormatItem_ImageURL="59b6dc49-1fca-b0c3-8b1e-47651b2fe419";

@XendraTrl(Identifier="fd9920c2-4269-8271-0e7a-d1c4dbe10750")
public static String es_PE_COLUMN_ImageURL_Name="URL de la Imagen";

@XendraColumn(AD_Element_ID="fe037607-f5d9-d969-d6e5-eb1f94c10e5e",ColumnName="ImageURL",
AD_Reference_ID=40,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fd9920c2-4269-8271-0e7a-d1c4dbe10750",
Synchronized="2017-08-05 16:52:41.0")
/** Column name ImageURL */
public static final String COLUMNNAME_ImageURL = "ImageURL";
/** Set Calculate Mean (?).
@param IsAveraged Calculate Average of numeric content or length */
public void setIsAveraged (boolean IsAveraged)
{
set_Value (COLUMNNAME_IsAveraged, Boolean.valueOf(IsAveraged));
}
/** Get Calculate Mean (?).
@return Calculate Average of numeric content or length */
public boolean isAveraged() 
{
Object oo = get_Value(COLUMNNAME_IsAveraged);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="5c6ed883-9d75-3942-8e18-ab8521ad16b0")
public static String es_PE_FIELD_FormatItem_CalculateMean_Description="Calcular promedio del contenido numérico o longitud";

@XendraTrl(Identifier="5c6ed883-9d75-3942-8e18-ab8521ad16b0")
public static String es_PE_FIELD_FormatItem_CalculateMean_Help="Calcula el promedio de los datos si el campo es numérico; de otra manera calcula el promedio de la longitud del campo";

@XendraTrl(Identifier="5c6ed883-9d75-3942-8e18-ab8521ad16b0")
public static String es_PE_FIELD_FormatItem_CalculateMean_Name="Calcular Promedio";

@XendraField(AD_Column_ID="IsAveraged",IsCentrallyMaintained=true,
AD_Tab_ID="43a46257-9d40-bb6b-447b-df79a88b9055",AD_FieldGroup_ID="Calculations",IsDisplayed=true,
DisplayLogic="@PrintFormatType@=F",DisplayLength=1,IsReadOnly=false,SeqNo=510,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="5c6ed883-9d75-3942-8e18-ab8521ad16b0")
public static final String FIELDNAME_FormatItem_CalculateMean="5c6ed883-9d75-3942-8e18-ab8521ad16b0";

@XendraTrl(Identifier="556449b9-d962-23bb-2a26-c052fd3e92b8")
public static String es_PE_COLUMN_IsAveraged_Name="Calcular Promedio";

@XendraColumn(AD_Element_ID="8fc3d2ee-b148-9e91-883e-0531da092b9e",ColumnName="IsAveraged",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="556449b9-d962-23bb-2a26-c052fd3e92b8",
Synchronized="2017-08-05 16:52:41.0")
/** Column name IsAveraged */
public static final String COLUMNNAME_IsAveraged = "IsAveraged";
/** Set Centrally maintained.
@param IsCentrallyMaintained Information maintained in System Element table */
public void setIsCentrallyMaintained (boolean IsCentrallyMaintained)
{
set_Value (COLUMNNAME_IsCentrallyMaintained, Boolean.valueOf(IsCentrallyMaintained));
}
/** Get Centrally maintained.
@return Information maintained in System Element table */
public boolean isCentrallyMaintained() 
{
Object oo = get_Value(COLUMNNAME_IsCentrallyMaintained);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="46e24f06-762b-8732-42c0-5ab984d65f27")
public static String es_PE_FIELD_FormatItem_CentrallyMaintained_Description="Información mantenida en la tabla elementos de sistema.";

@XendraTrl(Identifier="46e24f06-762b-8732-42c0-5ab984d65f27")
public static String es_PE_FIELD_FormatItem_CentrallyMaintained_Help="El cuadro de verificación mantenido centralmente indica si el nombre; descripción y ayuda son mantenidos centralmente.";

@XendraTrl(Identifier="46e24f06-762b-8732-42c0-5ab984d65f27")
public static String es_PE_FIELD_FormatItem_CentrallyMaintained_Name="Mantenido Centralmente";

@XendraField(AD_Column_ID="IsCentrallyMaintained",IsCentrallyMaintained=true,
AD_Tab_ID="43a46257-9d40-bb6b-447b-df79a88b9055",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="46e24f06-762b-8732-42c0-5ab984d65f27")
public static final String FIELDNAME_FormatItem_CentrallyMaintained="46e24f06-762b-8732-42c0-5ab984d65f27";

@XendraTrl(Identifier="8b47bd76-bb67-3d67-8848-9a737a223c2c")
public static String es_PE_COLUMN_IsCentrallyMaintained_Name="Mantenido Centralmente";

@XendraColumn(AD_Element_ID="aec11edc-fae1-bcfe-5a84-d685b53a80a6",
ColumnName="IsCentrallyMaintained",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="8b47bd76-bb67-3d67-8848-9a737a223c2c",Synchronized="2017-08-05 16:52:41.0")
/** Column name IsCentrallyMaintained */
public static final String COLUMNNAME_IsCentrallyMaintained = "IsCentrallyMaintained";
/** Set Calculate Count (?).
@param IsCounted Count number of not empty elements */
public void setIsCounted (boolean IsCounted)
{
set_Value (COLUMNNAME_IsCounted, Boolean.valueOf(IsCounted));
}
/** Get Calculate Count (?).
@return Count number of not empty elements */
public boolean isCounted() 
{
Object oo = get_Value(COLUMNNAME_IsCounted);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="9cbc6acb-9e9c-4695-a6bf-1914cdf0b3f6")
public static String es_PE_FIELD_FormatItem_CalculateCount_Description="Cuenta el número de elementos no vacíos";

@XendraTrl(Identifier="9cbc6acb-9e9c-4695-a6bf-1914cdf0b3f6")
public static String es_PE_FIELD_FormatItem_CalculateCount_Help="Calcula el número total de elemento nos vacíos (nulos); el máximo es el número de líneas";

@XendraTrl(Identifier="9cbc6acb-9e9c-4695-a6bf-1914cdf0b3f6")
public static String es_PE_FIELD_FormatItem_CalculateCount_Name="Calcula Conteo";

@XendraField(AD_Column_ID="IsCounted",IsCentrallyMaintained=true,
AD_Tab_ID="43a46257-9d40-bb6b-447b-df79a88b9055",AD_FieldGroup_ID="Calculations",IsDisplayed=true,
DisplayLogic="@PrintFormatType@=F",DisplayLength=1,IsReadOnly=false,SeqNo=470,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="9cbc6acb-9e9c-4695-a6bf-1914cdf0b3f6")
public static final String FIELDNAME_FormatItem_CalculateCount="9cbc6acb-9e9c-4695-a6bf-1914cdf0b3f6";

@XendraTrl(Identifier="56ddf6df-a18e-dd86-1d11-506617f689b0")
public static String es_PE_COLUMN_IsCounted_Name="Calcula Conteo";

@XendraColumn(AD_Element_ID="453bba55-b47b-9a10-2219-fb15fd28d82a",ColumnName="IsCounted",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="56ddf6df-a18e-dd86-1d11-506617f689b0",
Synchronized="2017-08-05 16:52:41.0")
/** Column name IsCounted */
public static final String COLUMNNAME_IsCounted = "IsCounted";
/** Set Calculate Deviation (?).
@param IsDeviationCalc Calculate Standard Deviation */
public void setIsDeviationCalc (boolean IsDeviationCalc)
{
set_Value (COLUMNNAME_IsDeviationCalc, Boolean.valueOf(IsDeviationCalc));
}
/** Get Calculate Deviation (?).
@return Calculate Standard Deviation */
public boolean isDeviationCalc() 
{
Object oo = get_Value(COLUMNNAME_IsDeviationCalc);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="61b49215-d333-1d90-420a-f74698ff2e1e")
public static String es_PE_FIELD_FormatItem_CalculateDeviation_Description="Calcular Desviación Estándar";

@XendraTrl(Identifier="61b49215-d333-1d90-420a-f74698ff2e1e")
public static String es_PE_FIELD_FormatItem_CalculateDeviation_Help="La desviación estándar (Ã) es una medida de disperción - usada conjuntamente con el medio (¼)";

@XendraTrl(Identifier="61b49215-d333-1d90-420a-f74698ff2e1e")
public static String es_PE_FIELD_FormatItem_CalculateDeviation_Name="Calcular Desviación (Ã)";

@XendraField(AD_Column_ID="IsDeviationCalc",IsCentrallyMaintained=true,
AD_Tab_ID="43a46257-9d40-bb6b-447b-df79a88b9055",AD_FieldGroup_ID="Calculations",IsDisplayed=true,
DisplayLogic="@PrintFormatType@=F",DisplayLength=1,IsReadOnly=false,SeqNo=530,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="61b49215-d333-1d90-420a-f74698ff2e1e")
public static final String FIELDNAME_FormatItem_CalculateDeviation="61b49215-d333-1d90-420a-f74698ff2e1e";

@XendraTrl(Identifier="58dc0b0f-1742-a1b5-f3a9-8c3ab3ac98bd")
public static String es_PE_COLUMN_IsDeviationCalc_Name="Calcular Desviación (Ã)";

@XendraColumn(AD_Element_ID="bfefaeb3-19d8-4f8c-1fe9-e339c4544596",ColumnName="IsDeviationCalc",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="58dc0b0f-1742-a1b5-f3a9-8c3ab3ac98bd",
Synchronized="2017-08-05 16:52:41.0")
/** Column name IsDeviationCalc */
public static final String COLUMNNAME_IsDeviationCalc = "IsDeviationCalc";
/** Set Fill Shape.
@param IsFilledRectangle Fill the shape with the color selected */
public void setIsFilledRectangle (boolean IsFilledRectangle)
{
set_Value (COLUMNNAME_IsFilledRectangle, Boolean.valueOf(IsFilledRectangle));
}
/** Get Fill Shape.
@return Fill the shape with the color selected */
public boolean isFilledRectangle() 
{
Object oo = get_Value(COLUMNNAME_IsFilledRectangle);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="a5c18e65-5236-0ae9-c912-f8b691d17bf9")
public static String es_PE_FIELD_FormatItem_FillShape_Description="Llene la forma del color seleccionado";

@XendraTrl(Identifier="a5c18e65-5236-0ae9-c912-f8b691d17bf9")
public static String es_PE_FIELD_FormatItem_FillShape_Name="Llene la forma";

@XendraField(AD_Column_ID="IsFilledRectangle",IsCentrallyMaintained=true,
AD_Tab_ID="43a46257-9d40-bb6b-447b-df79a88b9055",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@PrintFormatType@=R",DisplayLength=1,IsReadOnly=false,SeqNo=370,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="a5c18e65-5236-0ae9-c912-f8b691d17bf9")
public static final String FIELDNAME_FormatItem_FillShape="a5c18e65-5236-0ae9-c912-f8b691d17bf9";

@XendraTrl(Identifier="20ac9544-1992-61cd-a9ad-0de183a0aa13")
public static String es_PE_COLUMN_IsFilledRectangle_Name="Llene la forma";

@XendraColumn(AD_Element_ID="87322914-9518-7df3-bec5-24ba3bf97149",ColumnName="IsFilledRectangle",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="20ac9544-1992-61cd-a9ad-0de183a0aa13",
Synchronized="2017-08-05 16:52:41.0")
/** Column name IsFilledRectangle */
public static final String COLUMNNAME_IsFilledRectangle = "IsFilledRectangle";
/** Set Fixed Width.
@param IsFixedWidth Column has a fixed width */
public void setIsFixedWidth (boolean IsFixedWidth)
{
set_Value (COLUMNNAME_IsFixedWidth, Boolean.valueOf(IsFixedWidth));
}
/** Get Fixed Width.
@return Column has a fixed width */
public boolean isFixedWidth() 
{
Object oo = get_Value(COLUMNNAME_IsFixedWidth);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="35b499aa-a0cc-638c-98ee-fad577dd0a93")
public static String es_PE_FIELD_FormatItem_FixedWidth_Description="La columna tiene ancho fijo";

@XendraTrl(Identifier="35b499aa-a0cc-638c-98ee-fad577dd0a93")
public static String es_PE_FIELD_FormatItem_FixedWidth_Help="La columna tiene ancho fijo; independiente del contenido";

@XendraTrl(Identifier="35b499aa-a0cc-638c-98ee-fad577dd0a93")
public static String es_PE_FIELD_FormatItem_FixedWidth_Name="Ancho Fijo";

@XendraField(AD_Column_ID="IsFixedWidth",IsCentrallyMaintained=true,
AD_Tab_ID="43a46257-9d40-bb6b-447b-df79a88b9055",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@PrintFormatType@=F",DisplayLength=1,IsReadOnly=false,SeqNo=330,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="35b499aa-a0cc-638c-98ee-fad577dd0a93")
public static final String FIELDNAME_FormatItem_FixedWidth="35b499aa-a0cc-638c-98ee-fad577dd0a93";

@XendraTrl(Identifier="8e681fda-8714-9bce-fe3e-2c6ade205a63")
public static String es_PE_COLUMN_IsFixedWidth_Name="Ancho Fijo";

@XendraColumn(AD_Element_ID="2b7a54f9-f400-2890-598c-445eb5f400c0",ColumnName="IsFixedWidth",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8e681fda-8714-9bce-fe3e-2c6ade205a63",
Synchronized="2017-08-05 16:52:41.0")
/** Column name IsFixedWidth */
public static final String COLUMNNAME_IsFixedWidth = "IsFixedWidth";
/** Set Group by.
@param IsGroupBy After a group change, totals, etc. are printed */
public void setIsGroupBy (boolean IsGroupBy)
{
set_Value (COLUMNNAME_IsGroupBy, Boolean.valueOf(IsGroupBy));
}
/** Get Group by.
@return After a group change, totals, etc. are printed */
public boolean isGroupBy() 
{
Object oo = get_Value(COLUMNNAME_IsGroupBy);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="04637eba-1863-c76d-82ae-d3adee0a2b7e")
public static String es_PE_FIELD_FormatItem_GroupBy_Description="Después de cambio de grupo; información relevante como totales por grupo se imprime";

@XendraTrl(Identifier="04637eba-1863-c76d-82ae-d3adee0a2b7e")
public static String es_PE_FIELD_FormatItem_GroupBy_Help="Agrupar permite imprimir sub-totales. Si un grupo cambia; los totales son impresos. Agrupar por columnas requiere ser incluido en el orden de despliegue.";

@XendraTrl(Identifier="04637eba-1863-c76d-82ae-d3adee0a2b7e")
public static String es_PE_FIELD_FormatItem_GroupBy_Name="Agrupar por";

@XendraField(AD_Column_ID="IsGroupBy",IsCentrallyMaintained=true,
AD_Tab_ID="43a46257-9d40-bb6b-447b-df79a88b9055",AD_FieldGroup_ID="Calculations",IsDisplayed=true,
DisplayLogic="@PrintFormatType@=F & @IsOrderBy@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=430,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="04637eba-1863-c76d-82ae-d3adee0a2b7e")
public static final String FIELDNAME_FormatItem_GroupBy="04637eba-1863-c76d-82ae-d3adee0a2b7e";

@XendraTrl(Identifier="1a787c4d-be78-bc45-0df9-3e711961fec4")
public static String es_PE_COLUMN_IsGroupBy_Name="Agrupar por";

@XendraColumn(AD_Element_ID="f8a6ffa1-c1b3-8dd9-03fa-aac88ed27cf1",ColumnName="IsGroupBy",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1a787c4d-be78-bc45-0df9-3e711961fec4",
Synchronized="2017-08-05 16:52:41.0")
/** Column name IsGroupBy */
public static final String COLUMNNAME_IsGroupBy = "IsGroupBy";
/** Set One Line Only.
@param IsHeightOneLine If selected, only one line is printed */
public void setIsHeightOneLine (boolean IsHeightOneLine)
{
set_Value (COLUMNNAME_IsHeightOneLine, Boolean.valueOf(IsHeightOneLine));
}
/** Get One Line Only.
@return If selected, only one line is printed */
public boolean isHeightOneLine() 
{
Object oo = get_Value(COLUMNNAME_IsHeightOneLine);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="7f7d9468-06fd-394b-35ec-c5da183bdc1a")
public static String es_PE_FIELD_FormatItem_OneLineOnly_Description="Sí se selecciona; solamente una línea es impresa";

@XendraTrl(Identifier="7f7d9468-06fd-394b-35ec-c5da183bdc1a")
public static String es_PE_FIELD_FormatItem_OneLineOnly_Help="Sí la columna tiene restricción de ancho; el texto es dividido en líneas multiples. Sí una línea es seleccionado; solamente la primera línea es impresa.";

@XendraTrl(Identifier="7f7d9468-06fd-394b-35ec-c5da183bdc1a")
public static String es_PE_FIELD_FormatItem_OneLineOnly_Name="Una línea";

@XendraField(AD_Column_ID="IsHeightOneLine",IsCentrallyMaintained=true,
AD_Tab_ID="43a46257-9d40-bb6b-447b-df79a88b9055",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@PrintFormatType@=F",DisplayLength=1,IsReadOnly=false,SeqNo=360,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="7f7d9468-06fd-394b-35ec-c5da183bdc1a")
public static final String FIELDNAME_FormatItem_OneLineOnly="7f7d9468-06fd-394b-35ec-c5da183bdc1a";

@XendraTrl(Identifier="b76e1a02-8899-e4b8-d313-bce57e116ce5")
public static String es_PE_COLUMN_IsHeightOneLine_Name="Una línea";

@XendraColumn(AD_Element_ID="0965fe76-0663-59a0-fa9f-2cc77c52c77e",ColumnName="IsHeightOneLine",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b76e1a02-8899-e4b8-d313-bce57e116ce5",
Synchronized="2017-08-05 16:52:41.0")
/** Column name IsHeightOneLine */
public static final String COLUMNNAME_IsHeightOneLine = "IsHeightOneLine";
/** Set Image Field.
@param IsImageField The image is retrieved from the data column */
public void setIsImageField (boolean IsImageField)
{
set_Value (COLUMNNAME_IsImageField, Boolean.valueOf(IsImageField));
}
/** Get Image Field.
@return The image is retrieved from the data column */
public boolean isImageField() 
{
Object oo = get_Value(COLUMNNAME_IsImageField);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="6269a1d1-8f6d-d2c4-a28f-a495833c3cc3")
public static String es_PE_FIELD_FormatItem_ImageField_Description="La imagen se recupera de la columna de los datos";

@XendraTrl(Identifier="6269a1d1-8f6d-d2c4-a28f-a495833c3cc3")
public static String es_PE_FIELD_FormatItem_ImageField_Help="El URL de la imagen se recupera de la columna de los datos";

@XendraTrl(Identifier="6269a1d1-8f6d-d2c4-a28f-a495833c3cc3")
public static String es_PE_FIELD_FormatItem_ImageField_Name="Archivo de Imagen";

@XendraField(AD_Column_ID="IsImageField",IsCentrallyMaintained=true,
AD_Tab_ID="43a46257-9d40-bb6b-447b-df79a88b9055",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@PrintFormatType@=I",DisplayLength=1,IsReadOnly=false,SeqNo=160,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="6269a1d1-8f6d-d2c4-a28f-a495833c3cc3")
public static final String FIELDNAME_FormatItem_ImageField="6269a1d1-8f6d-d2c4-a28f-a495833c3cc3";

@XendraTrl(Identifier="6b1a8458-d6e1-dfdd-149b-321465203b95")
public static String es_PE_COLUMN_IsImageField_Name="Archivo de Imagen";

@XendraColumn(AD_Element_ID="2d5639f3-c7ac-5f0e-d6f9-d9d0862f716e",ColumnName="IsImageField",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6b1a8458-d6e1-dfdd-149b-321465203b95",
Synchronized="2017-08-05 16:52:41.0")
/** Column name IsImageField */
public static final String COLUMNNAME_IsImageField = "IsImageField";
/** Set Calculate Maximim (?).
@param IsMaxCalc Calculate the maximim amount */
public void setIsMaxCalc (boolean IsMaxCalc)
{
set_Value (COLUMNNAME_IsMaxCalc, Boolean.valueOf(IsMaxCalc));
}
/** Get Calculate Maximim (?).
@return Calculate the maximim amount */
public boolean isMaxCalc() 
{
Object oo = get_Value(COLUMNNAME_IsMaxCalc);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="7986a447-cb6c-4131-fb13-1cf31e82576b")
public static String es_PE_FIELD_FormatItem_CalculateMaximim_Description="Cálculo de la suma Máxima";

@XendraTrl(Identifier="7986a447-cb6c-4131-fb13-1cf31e82576b")
public static String es_PE_FIELD_FormatItem_CalculateMaximim_Name="Calcular Máximo";

@XendraField(AD_Column_ID="IsMaxCalc",IsCentrallyMaintained=true,
AD_Tab_ID="43a46257-9d40-bb6b-447b-df79a88b9055",AD_FieldGroup_ID="Calculations",IsDisplayed=true,
DisplayLogic="@PrintFormatType@=F",DisplayLength=1,IsReadOnly=false,SeqNo=500,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="7986a447-cb6c-4131-fb13-1cf31e82576b")
public static final String FIELDNAME_FormatItem_CalculateMaximim="7986a447-cb6c-4131-fb13-1cf31e82576b";

@XendraTrl(Identifier="ddd20e72-df73-30c6-4b1a-6a83a3d91126")
public static String es_PE_COLUMN_IsMaxCalc_Name="Calcular Máximo";

@XendraColumn(AD_Element_ID="ed033452-0924-129d-857b-bbc491a5ed1b",ColumnName="IsMaxCalc",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ddd20e72-df73-30c6-4b1a-6a83a3d91126",
Synchronized="2017-08-05 16:52:41.0")
/** Column name IsMaxCalc */
public static final String COLUMNNAME_IsMaxCalc = "IsMaxCalc";
/** Set Calculate Minimum (?).
@param IsMinCalc Calculate the minimum amount */
public void setIsMinCalc (boolean IsMinCalc)
{
set_Value (COLUMNNAME_IsMinCalc, Boolean.valueOf(IsMinCalc));
}
/** Get Calculate Minimum (?).
@return Calculate the minimum amount */
public boolean isMinCalc() 
{
Object oo = get_Value(COLUMNNAME_IsMinCalc);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="b3060f47-e8a5-99c2-bf56-c6918a3854f1")
public static String es_PE_FIELD_FormatItem_CalculateMinimum_Description="Cálculo de la suma Mínima";

@XendraTrl(Identifier="b3060f47-e8a5-99c2-bf56-c6918a3854f1")
public static String es_PE_FIELD_FormatItem_CalculateMinimum_Name="Calcular Mínimo";

@XendraField(AD_Column_ID="IsMinCalc",IsCentrallyMaintained=true,
AD_Tab_ID="43a46257-9d40-bb6b-447b-df79a88b9055",AD_FieldGroup_ID="Calculations",IsDisplayed=true,
DisplayLogic="@PrintFormatType@=F",DisplayLength=1,IsReadOnly=false,SeqNo=490,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="b3060f47-e8a5-99c2-bf56-c6918a3854f1")
public static final String FIELDNAME_FormatItem_CalculateMinimum="b3060f47-e8a5-99c2-bf56-c6918a3854f1";

@XendraTrl(Identifier="e2ecd9de-8130-18a7-406a-7ec402cc05d3")
public static String es_PE_COLUMN_IsMinCalc_Name="Calcular Mínimo";

@XendraColumn(AD_Element_ID="10c3f839-61a7-a712-de60-40f8259a9c5e",ColumnName="IsMinCalc",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e2ecd9de-8130-18a7-406a-7ec402cc05d3",
Synchronized="2017-08-05 16:52:42.0")
/** Column name IsMinCalc */
public static final String COLUMNNAME_IsMinCalc = "IsMinCalc";
/** Set Next Line.
@param IsNextLine Print item on next line */
public void setIsNextLine (boolean IsNextLine)
{
set_Value (COLUMNNAME_IsNextLine, Boolean.valueOf(IsNextLine));
}
/** Get Next Line.
@return Print item on next line */
public boolean isNextLine() 
{
Object oo = get_Value(COLUMNNAME_IsNextLine);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="df364c65-4ae8-9ae8-87f6-d3c30e871e0e")
public static String es_PE_FIELD_FormatItem_NextLine_Description="Imprimir item en la próxima línea";

@XendraTrl(Identifier="df364c65-4ae8-9ae8-87f6-d3c30e871e0e")
public static String es_PE_FIELD_FormatItem_NextLine_Help="Sí no se selecciona; el item es impreso en la misma línea";

@XendraTrl(Identifier="df364c65-4ae8-9ae8-87f6-d3c30e871e0e")
public static String es_PE_FIELD_FormatItem_NextLine_Name="Próxima Línea";

@XendraField(AD_Column_ID="IsNextLine",IsCentrallyMaintained=true,
AD_Tab_ID="43a46257-9d40-bb6b-447b-df79a88b9055",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsRelativePosition@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=250,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="df364c65-4ae8-9ae8-87f6-d3c30e871e0e")
public static final String FIELDNAME_FormatItem_NextLine="df364c65-4ae8-9ae8-87f6-d3c30e871e0e";

@XendraTrl(Identifier="f0e0e442-a0d8-0cbb-cf2e-a2ddfe08c05d")
public static String es_PE_COLUMN_IsNextLine_Name="Próxima Línea";

@XendraColumn(AD_Element_ID="f174a61c-2e3c-e69b-1602-2c17eb3540b8",ColumnName="IsNextLine",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f0e0e442-a0d8-0cbb-cf2e-a2ddfe08c05d",
Synchronized="2017-08-05 16:52:42.0")
/** Column name IsNextLine */
public static final String COLUMNNAME_IsNextLine = "IsNextLine";
/** Set Next Page.
@param IsNextPage The column is printed on the next page */
public void setIsNextPage (boolean IsNextPage)
{
set_Value (COLUMNNAME_IsNextPage, Boolean.valueOf(IsNextPage));
}
/** Get Next Page.
@return The column is printed on the next page */
public boolean isNextPage() 
{
Object oo = get_Value(COLUMNNAME_IsNextPage);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="2944b7ee-25de-816f-e3b5-0e7fe51655e0")
public static String es_PE_FIELD_FormatItem_NextPage_Description="La columna es impresa en la siguiente página";

@XendraTrl(Identifier="2944b7ee-25de-816f-e3b5-0e7fe51655e0")
public static String es_PE_FIELD_FormatItem_NextPage_Help="Antes de imprimir esta columna; habrá un cambio de página";

@XendraTrl(Identifier="2944b7ee-25de-816f-e3b5-0e7fe51655e0")
public static String es_PE_FIELD_FormatItem_NextPage_Name="Próxima Página";

@XendraField(AD_Column_ID="IsNextPage",IsCentrallyMaintained=true,
AD_Tab_ID="43a46257-9d40-bb6b-447b-df79a88b9055",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsRelativePosition@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=260,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="2944b7ee-25de-816f-e3b5-0e7fe51655e0")
public static final String FIELDNAME_FormatItem_NextPage="2944b7ee-25de-816f-e3b5-0e7fe51655e0";

@XendraTrl(Identifier="39f9c7d6-52bc-8f48-e9e8-030f736147f5")
public static String es_PE_COLUMN_IsNextPage_Name="Próxima Página";

@XendraColumn(AD_Element_ID="11c5cd8e-e1da-118b-956c-f7b62101d1f6",ColumnName="IsNextPage",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="39f9c7d6-52bc-8f48-e9e8-030f736147f5",
Synchronized="2017-08-05 16:52:42.0")
/** Column name IsNextPage */
public static final String COLUMNNAME_IsNextPage = "IsNextPage";
/** Set Order by.
@param IsOrderBy Include in sort order */
public void setIsOrderBy (boolean IsOrderBy)
{
set_Value (COLUMNNAME_IsOrderBy, Boolean.valueOf(IsOrderBy));
}
/** Get Order by.
@return Include in sort order */
public boolean isOrderBy() 
{
Object oo = get_Value(COLUMNNAME_IsOrderBy);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="9ada61d6-e20d-705a-1099-1568985b06f9")
public static String es_PE_FIELD_FormatItem_OrderBy_Description="Incluir en orden de despliegue";

@XendraTrl(Identifier="9ada61d6-e20d-705a-1099-1568985b06f9")
public static String es_PE_FIELD_FormatItem_OrderBy_Help="Los registros son ordenados por el valor de esta columna. Si una columna es usada para agrupar; también necesita en el orden de despliegue.";

@XendraTrl(Identifier="9ada61d6-e20d-705a-1099-1568985b06f9")
public static String es_PE_FIELD_FormatItem_OrderBy_Name="Ordenado por";

@XendraField(AD_Column_ID="IsOrderBy",IsCentrallyMaintained=true,
AD_Tab_ID="43a46257-9d40-bb6b-447b-df79a88b9055",AD_FieldGroup_ID="Calculations",IsDisplayed=true,
DisplayLogic="@PrintFormatType@=F",DisplayLength=1,IsReadOnly=false,SeqNo=410,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="9ada61d6-e20d-705a-1099-1568985b06f9")
public static final String FIELDNAME_FormatItem_OrderBy="9ada61d6-e20d-705a-1099-1568985b06f9";

@XendraTrl(Identifier="96d8a20b-345c-e101-d65d-3be65174f001")
public static String es_PE_COLUMN_IsOrderBy_Name="Ordenado por";

@XendraColumn(AD_Element_ID="6f4f1e64-38c5-a550-d117-b98c381fc49b",ColumnName="IsOrderBy",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="96d8a20b-345c-e101-d65d-3be65174f001",
Synchronized="2017-08-05 16:52:42.0")
/** Column name IsOrderBy */
public static final String COLUMNNAME_IsOrderBy = "IsOrderBy";
/** Set Page break.
@param IsPageBreak Start with new page */
public void setIsPageBreak (boolean IsPageBreak)
{
set_Value (COLUMNNAME_IsPageBreak, Boolean.valueOf(IsPageBreak));
}
/** Get Page break.
@return Start with new page */
public boolean isPageBreak() 
{
Object oo = get_Value(COLUMNNAME_IsPageBreak);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="149707bf-473a-f242-308a-bd956ded2c40")
public static String es_PE_FIELD_FormatItem_PageBreak_Description="Inicio con página nueva";

@XendraTrl(Identifier="149707bf-473a-f242-308a-bd956ded2c40")
public static String es_PE_FIELD_FormatItem_PageBreak_Name="Corte de Página";

@XendraField(AD_Column_ID="IsPageBreak",IsCentrallyMaintained=true,
AD_Tab_ID="43a46257-9d40-bb6b-447b-df79a88b9055",AD_FieldGroup_ID="Calculations",IsDisplayed=true,
DisplayLogic="@PrintFormatType@=F & @IsGroupBy@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=440,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="149707bf-473a-f242-308a-bd956ded2c40")
public static final String FIELDNAME_FormatItem_PageBreak="149707bf-473a-f242-308a-bd956ded2c40";

@XendraTrl(Identifier="b0837a27-dab7-45ec-9c87-f3ed0ca71339")
public static String es_PE_COLUMN_IsPageBreak_Name="Corte de Página";

@XendraColumn(AD_Element_ID="0cba9d24-2a81-596d-38fc-fdf1e69a4862",ColumnName="IsPageBreak",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b0837a27-dab7-45ec-9c87-f3ed0ca71339",
Synchronized="2017-08-05 16:52:42.0")
/** Column name IsPageBreak */
public static final String COLUMNNAME_IsPageBreak = "IsPageBreak";
/** Set Printed.
@param IsPrinted Indicates if this document / line is printed */
public void setIsPrinted (boolean IsPrinted)
{
set_Value (COLUMNNAME_IsPrinted, Boolean.valueOf(IsPrinted));
}
/** Get Printed.
@return Indicates if this document / line is printed */
public boolean isPrinted() 
{
Object oo = get_Value(COLUMNNAME_IsPrinted);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="de532022-de33-40f3-15e9-60abdc374d31")
public static String es_PE_FIELD_FormatItem_Printed_Description="Indica si este documento es impreso.";

@XendraTrl(Identifier="de532022-de33-40f3-15e9-60abdc374d31")
public static String es_PE_FIELD_FormatItem_Printed_Help="El cuadro de verificación impreso indica si este documento se imprimirá.";

@XendraTrl(Identifier="de532022-de33-40f3-15e9-60abdc374d31")
public static String es_PE_FIELD_FormatItem_Printed_Name="Impreso";

@XendraField(AD_Column_ID="IsPrinted",IsCentrallyMaintained=true,
AD_Tab_ID="43a46257-9d40-bb6b-447b-df79a88b9055",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="de532022-de33-40f3-15e9-60abdc374d31")
public static final String FIELDNAME_FormatItem_Printed="de532022-de33-40f3-15e9-60abdc374d31";

@XendraTrl(Identifier="2b3f9c2c-9afd-4e39-be85-247395486f74")
public static String es_PE_COLUMN_IsPrinted_Name="Impreso";

@XendraColumn(AD_Element_ID="66795cb3-a608-19bb-8cde-40abe30a0130",ColumnName="IsPrinted",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2b3f9c2c-9afd-4e39-be85-247395486f74",
Synchronized="2017-08-05 16:52:42.0")
/** Column name IsPrinted */
public static final String COLUMNNAME_IsPrinted = "IsPrinted";
/** Set Relative Position.
@param IsRelativePosition The item is relative positioned (not absolute) */
public void setIsRelativePosition (boolean IsRelativePosition)
{
set_Value (COLUMNNAME_IsRelativePosition, Boolean.valueOf(IsRelativePosition));
}
/** Get Relative Position.
@return The item is relative positioned (not absolute) */
public boolean isRelativePosition() 
{
Object oo = get_Value(COLUMNNAME_IsRelativePosition);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="b0e492f6-e3b3-df0f-24e6-fa727c09fa37")
public static String es_PE_FIELD_FormatItem_RelativePosition_Description="El item esta posicionado en forma relativa (no absoluta)";

@XendraTrl(Identifier="b0e492f6-e3b3-df0f-24e6-fa727c09fa37")
public static String es_PE_FIELD_FormatItem_RelativePosition_Help="La posición relativa del item es determinado por el espacio X-Z y la próxima línea";

@XendraTrl(Identifier="b0e492f6-e3b3-df0f-24e6-fa727c09fa37")
public static String es_PE_FIELD_FormatItem_RelativePosition_Name="Posición Relativa";

@XendraField(AD_Column_ID="IsRelativePosition",IsCentrallyMaintained=true,
AD_Tab_ID="43a46257-9d40-bb6b-447b-df79a88b9055",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsForm@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b0e492f6-e3b3-df0f-24e6-fa727c09fa37")
public static final String FIELDNAME_FormatItem_RelativePosition="b0e492f6-e3b3-df0f-24e6-fa727c09fa37";

@XendraTrl(Identifier="4762f893-b84e-8e29-4fdd-7dbc8b413245")
public static String es_PE_COLUMN_IsRelativePosition_Name="Posición Relativa";

@XendraColumn(AD_Element_ID="d78a275b-b51b-137b-84f1-2a28756ea8c8",ColumnName="IsRelativePosition",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4762f893-b84e-8e29-4fdd-7dbc8b413245",
Synchronized="2017-08-05 16:52:42.0")
/** Column name IsRelativePosition */
public static final String COLUMNNAME_IsRelativePosition = "IsRelativePosition";
/** Set Running Total.
@param IsRunningTotal Create a running total (sum) */
public void setIsRunningTotal (boolean IsRunningTotal)
{
set_Value (COLUMNNAME_IsRunningTotal, Boolean.valueOf(IsRunningTotal));
}
/** Get Running Total.
@return Create a running total (sum) */
public boolean isRunningTotal() 
{
Object oo = get_Value(COLUMNNAME_IsRunningTotal);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="360e6bc8-80a3-3258-9676-699908306e90")
public static String es_PE_FIELD_FormatItem_RunningTotal_Description="Un total corriente crea una suma en el extremo de una página y en la tapa de la página siguiente.";

@XendraTrl(Identifier="360e6bc8-80a3-3258-9676-699908306e90")
public static String es_PE_FIELD_FormatItem_RunningTotal_Name="Total de la Corrida";

@XendraField(AD_Column_ID="IsRunningTotal",IsCentrallyMaintained=true,
AD_Tab_ID="43a46257-9d40-bb6b-447b-df79a88b9055",AD_FieldGroup_ID="Calculations",IsDisplayed=true,
DisplayLogic="@PrintFormatType@=F & @IsSummarized@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=460,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="360e6bc8-80a3-3258-9676-699908306e90")
public static final String FIELDNAME_FormatItem_RunningTotal="360e6bc8-80a3-3258-9676-699908306e90";

@XendraTrl(Identifier="ff9c9e3c-8e62-2d6f-b566-6d22dfa19239")
public static String es_PE_COLUMN_IsRunningTotal_Name="Total de la Corrida";

@XendraColumn(AD_Element_ID="c44ca5d4-95f1-65f7-4cf2-b50b7992a68d",ColumnName="IsRunningTotal",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ff9c9e3c-8e62-2d6f-b566-6d22dfa19239",
Synchronized="2017-08-05 16:52:42.0")
/** Column name IsRunningTotal */
public static final String COLUMNNAME_IsRunningTotal = "IsRunningTotal";
/** Set Set NL Position.
@param IsSetNLPosition Set New Line Position */
public void setIsSetNLPosition (boolean IsSetNLPosition)
{
set_Value (COLUMNNAME_IsSetNLPosition, Boolean.valueOf(IsSetNLPosition));
}
/** Get Set NL Position.
@return Set New Line Position */
public boolean isSetNLPosition() 
{
Object oo = get_Value(COLUMNNAME_IsSetNLPosition);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="5aaaa9a5-b65f-a4fd-274e-423531eaedc5")
public static String es_PE_FIELD_FormatItem_SetNLPosition_Description="Fijar posición de la nueva línea";

@XendraTrl(Identifier="5aaaa9a5-b65f-a4fd-274e-423531eaedc5")
public static String es_PE_FIELD_FormatItem_SetNLPosition_Help="Cuando se habilita; la posición actual X (horizontal) antes de imprimir el ítem es salvada. La poxima nueva linea usara esta posición X (horizontal) salvada; permitiendo la impresión por columnas. Esta configuración no está restringida a un área (encabezamiento; pie de página; contenido); permitiendo; así; alinear información con el encabezamiento y el pie de página con el contenido.";

@XendraTrl(Identifier="5aaaa9a5-b65f-a4fd-274e-423531eaedc5")
public static String es_PE_FIELD_FormatItem_SetNLPosition_Name="Fijar Posición NL";

@XendraField(AD_Column_ID="IsSetNLPosition",IsCentrallyMaintained=true,
AD_Tab_ID="43a46257-9d40-bb6b-447b-df79a88b9055",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsForm@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5aaaa9a5-b65f-a4fd-274e-423531eaedc5")
public static final String FIELDNAME_FormatItem_SetNLPosition="5aaaa9a5-b65f-a4fd-274e-423531eaedc5";

@XendraTrl(Identifier="6c0e5ab7-ee4b-5ed4-9b4c-25afcd8d9938")
public static String es_PE_COLUMN_IsSetNLPosition_Name="Fijar Posición NL";

@XendraColumn(AD_Element_ID="a288f8e3-1a0b-1fa0-e206-e858ac7059d2",ColumnName="IsSetNLPosition",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6c0e5ab7-ee4b-5ed4-9b4c-25afcd8d9938",
Synchronized="2017-08-05 16:52:42.0")
/** Column name IsSetNLPosition */
public static final String COLUMNNAME_IsSetNLPosition = "IsSetNLPosition";
/** Set Calculate Sum (?).
@param IsSummarized Calculate the Sum of numeric content or length */
public void setIsSummarized (boolean IsSummarized)
{
set_Value (COLUMNNAME_IsSummarized, Boolean.valueOf(IsSummarized));
}
/** Get Calculate Sum (?).
@return Calculate the Sum of numeric content or length */
public boolean isSummarized() 
{
Object oo = get_Value(COLUMNNAME_IsSummarized);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="919493b1-cedf-bf08-416f-33f33fe55325")
public static String es_PE_FIELD_FormatItem_CalculateSum_Description="Calcula la suma total del contenido numérico ó longitud.";

@XendraTrl(Identifier="919493b1-cedf-bf08-416f-33f33fe55325")
public static String es_PE_FIELD_FormatItem_CalculateSum_Help="Calcula la suma total de los datos si el campo es numérico; de otra manera calcula la longitud total del campo.";

@XendraTrl(Identifier="919493b1-cedf-bf08-416f-33f33fe55325")
public static String es_PE_FIELD_FormatItem_CalculateSum_Name="Suma Calculada";

@XendraField(AD_Column_ID="IsSummarized",IsCentrallyMaintained=true,
AD_Tab_ID="43a46257-9d40-bb6b-447b-df79a88b9055",AD_FieldGroup_ID="Calculations",IsDisplayed=true,
DisplayLogic="@PrintFormatType@=F",DisplayLength=1,IsReadOnly=false,SeqNo=450,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="919493b1-cedf-bf08-416f-33f33fe55325")
public static final String FIELDNAME_FormatItem_CalculateSum="919493b1-cedf-bf08-416f-33f33fe55325";

@XendraTrl(Identifier="12d7568e-19c4-8bc0-d02b-c2f7d8dfd90c")
public static String es_PE_COLUMN_IsSummarized_Name="Suma Calculada";

@XendraColumn(AD_Element_ID="bebcc9e0-04ff-e4de-1b50-c7c281c4cae9",ColumnName="IsSummarized",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="12d7568e-19c4-8bc0-d02b-c2f7d8dfd90c",
Synchronized="2017-08-05 16:52:42.0")
/** Column name IsSummarized */
public static final String COLUMNNAME_IsSummarized = "IsSummarized";
/** Set Suppress Null.
@param IsSuppressNull Suppress columns or elements with NULL value */
public void setIsSuppressNull (boolean IsSuppressNull)
{
set_Value (COLUMNNAME_IsSuppressNull, Boolean.valueOf(IsSuppressNull));
}
/** Get Suppress Null.
@return Suppress columns or elements with NULL value */
public boolean isSuppressNull() 
{
Object oo = get_Value(COLUMNNAME_IsSuppressNull);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="c86dd860-c4a2-90ff-17ba-a67f5ae06f17")
public static String es_PE_FIELD_FormatItem_SuppressNull_Description="Suprimir columnas ó elementos con valor nulo.";

@XendraTrl(Identifier="c86dd860-c4a2-90ff-17ba-a67f5ae06f17")
public static String es_PE_FIELD_FormatItem_SuppressNull_Help="Si una entrada de un formato a imprimir es nulo; el suprimir nulos causa que el campo nulo y su titulo no sean impresos. Si todos los elementos en una columna son nulos entonces la columna no es impresa.";

@XendraTrl(Identifier="c86dd860-c4a2-90ff-17ba-a67f5ae06f17")
public static String es_PE_FIELD_FormatItem_SuppressNull_Name="Suprimir Nulos";

@XendraField(AD_Column_ID="IsSuppressNull",IsCentrallyMaintained=true,
AD_Tab_ID="43a46257-9d40-bb6b-447b-df79a88b9055",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c86dd860-c4a2-90ff-17ba-a67f5ae06f17")
public static final String FIELDNAME_FormatItem_SuppressNull="c86dd860-c4a2-90ff-17ba-a67f5ae06f17";

@XendraTrl(Identifier="c422b49b-cbd8-ae89-2e95-309b678d7ac2")
public static String es_PE_COLUMN_IsSuppressNull_Name="Suprimir Nulos";

@XendraColumn(AD_Element_ID="e3ea1c17-2966-9d38-5971-53b72be8cd24",ColumnName="IsSuppressNull",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c422b49b-cbd8-ae89-2e95-309b678d7ac2",
Synchronized="2017-08-05 16:52:42.0")
/** Column name IsSuppressNull */
public static final String COLUMNNAME_IsSuppressNull = "IsSuppressNull";
/** Set issuppressrepeats.
@param issuppressrepeats issuppressrepeats */
public void setissuppressrepeats (boolean issuppressrepeats)
{
set_Value (COLUMNNAME_issuppressrepeats, Boolean.valueOf(issuppressrepeats));
}
/** Get issuppressrepeats.
@return issuppressrepeats */
public boolean issuppressrepeats() 
{
Object oo = get_Value(COLUMNNAME_issuppressrepeats);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="1f890e89-8368-63be-af7b-56cc60262b21")
public static String es_PE_COLUMN_issuppressrepeats_Name="issuppressrepeats";

@XendraColumn(AD_Element_ID="004242fd-cb59-842a-754a-5423718fb946",ColumnName="issuppressrepeats",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1f890e89-8368-63be-af7b-56cc60262b21",
Synchronized="2017-08-05 16:52:42.0")
/** Column name issuppressrepeats */
public static final String COLUMNNAME_issuppressrepeats = "issuppressrepeats";
/** Set Calculate Variance (?¿).
@param IsVarianceCalc Calculate Variance */
public void setIsVarianceCalc (boolean IsVarianceCalc)
{
set_Value (COLUMNNAME_IsVarianceCalc, Boolean.valueOf(IsVarianceCalc));
}
/** Get Calculate Variance (?¿).
@return Calculate Variance */
public boolean isVarianceCalc() 
{
Object oo = get_Value(COLUMNNAME_IsVarianceCalc);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="22ddfb7c-6dbd-b9a8-2c88-e3e6d30354c6")
public static String es_PE_FIELD_FormatItem_CalculateVariance_Description="Cálculo de la Variación";

@XendraTrl(Identifier="22ddfb7c-6dbd-b9a8-2c88-e3e6d30354c6")
public static String es_PE_FIELD_FormatItem_CalculateVariance_Help="La variación (Ã²) es una medida de disperción - utilizada conjuntamente con el medio ";

@XendraTrl(Identifier="22ddfb7c-6dbd-b9a8-2c88-e3e6d30354c6")
public static String es_PE_FIELD_FormatItem_CalculateVariance_Name="Calcular Variación (Ã²)";

@XendraField(AD_Column_ID="IsVarianceCalc",IsCentrallyMaintained=true,
AD_Tab_ID="43a46257-9d40-bb6b-447b-df79a88b9055",AD_FieldGroup_ID="Calculations",IsDisplayed=true,
DisplayLogic="@PrintFormatType@=F",DisplayLength=1,IsReadOnly=false,SeqNo=520,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="22ddfb7c-6dbd-b9a8-2c88-e3e6d30354c6")
public static final String FIELDNAME_FormatItem_CalculateVariance="22ddfb7c-6dbd-b9a8-2c88-e3e6d30354c6";

@XendraTrl(Identifier="01dad2b1-4e5a-664b-0b2a-772a34ff38e0")
public static String es_PE_COLUMN_IsVarianceCalc_Name="Calcular Variación (Ã²)";

@XendraColumn(AD_Element_ID="26e70215-eebc-5c62-9197-beb8e33989e9",ColumnName="IsVarianceCalc",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="01dad2b1-4e5a-664b-0b2a-772a34ff38e0",
Synchronized="2017-08-05 16:52:42.0")
/** Column name IsVarianceCalc */
public static final String COLUMNNAME_IsVarianceCalc = "IsVarianceCalc";

/** LineAlignmentType AD_Reference=58707b2f-9b1e-53e8-780d-9283d9b20f7c */
public static final int LINEALIGNMENTTYPE_AD_Reference_ID=254;
/** Set Line Alignment.
@param LineAlignmentType Line Alignment */
public void setLineAlignmentType (String LineAlignmentType)
{
if (LineAlignmentType == null) throw new IllegalArgumentException ("LineAlignmentType is mandatory");
if (LineAlignmentType.equals(REF_AD_PrintLineAlignment.None) || LineAlignmentType.equals(REF_AD_PrintLineAlignment.LeadingLeft) || LineAlignmentType.equals(REF_AD_PrintLineAlignment.Center) || LineAlignmentType.equals(REF_AD_PrintLineAlignment.TrailingRight));
 else throw new IllegalArgumentException ("LineAlignmentType Invalid value - " + LineAlignmentType + " - Reference_ID=254 - X - L - C - T");
if (LineAlignmentType.length() > 1)
{
log.warning("Length > 1 - truncated");
LineAlignmentType = LineAlignmentType.substring(0,0);
}
set_Value (COLUMNNAME_LineAlignmentType, LineAlignmentType);
}
/** Get Line Alignment.
@return Line Alignment */
public String getLineAlignmentType() 
{
return (String)get_Value(COLUMNNAME_LineAlignmentType);
}

@XendraTrl(Identifier="80766aaf-1c6c-d440-7a11-71ede888dd92")
public static String es_PE_FIELD_FormatItem_LineAlignment_Description="Alineación de línea";

@XendraTrl(Identifier="80766aaf-1c6c-d440-7a11-71ede888dd92")
public static String es_PE_FIELD_FormatItem_LineAlignment_Help="Alineación de linea para posicionamiento relativo";

@XendraTrl(Identifier="80766aaf-1c6c-d440-7a11-71ede888dd92")
public static String es_PE_FIELD_FormatItem_LineAlignment_Name="Alineación de línea";

@XendraField(AD_Column_ID="LineAlignmentType",IsCentrallyMaintained=true,
AD_Tab_ID="43a46257-9d40-bb6b-447b-df79a88b9055",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsForm@=Y & @IsRelativePosition@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=280,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="80766aaf-1c6c-d440-7a11-71ede888dd92")
public static final String FIELDNAME_FormatItem_LineAlignment="80766aaf-1c6c-d440-7a11-71ede888dd92";

@XendraTrl(Identifier="d9100adb-fc86-3ddf-7387-9ede7c24a9a6")
public static String es_PE_COLUMN_LineAlignmentType_Name="Alineación de línea";

@XendraColumn(AD_Element_ID="975c32bf-5ef3-24f4-e254-14f5218d5781",ColumnName="LineAlignmentType",
AD_Reference_ID=17,AD_Reference_Value_ID="58707b2f-9b1e-53e8-780d-9283d9b20f7c",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="X",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d9100adb-fc86-3ddf-7387-9ede7c24a9a6",Synchronized="2017-08-05 16:52:42.0")
/** Column name LineAlignmentType */
public static final String COLUMNNAME_LineAlignmentType = "LineAlignmentType";
/** Set Line Width.
@param LineWidth Width of the lines */
public void setLineWidth (int LineWidth)
{
set_Value (COLUMNNAME_LineWidth, Integer.valueOf(LineWidth));
}
/** Get Line Width.
@return Width of the lines */
public int getLineWidth() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_LineWidth);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="44c7d2fc-edc1-ba91-8dcf-c2b8e4737206")
public static String es_PE_FIELD_FormatItem_LineWidth_Description="Ancho de las líneas";

@XendraTrl(Identifier="44c7d2fc-edc1-ba91-8dcf-c2b8e4737206")
public static String es_PE_FIELD_FormatItem_LineWidth_Help="El ancho fisico de las lineas.";

@XendraTrl(Identifier="44c7d2fc-edc1-ba91-8dcf-c2b8e4737206")
public static String es_PE_FIELD_FormatItem_LineWidth_Name="Anchura De la Línea";

@XendraField(AD_Column_ID="LineWidth",IsCentrallyMaintained=true,
AD_Tab_ID="43a46257-9d40-bb6b-447b-df79a88b9055",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@PrintFormatType@=L",DisplayLength=11,IsReadOnly=false,SeqNo=140,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="44c7d2fc-edc1-ba91-8dcf-c2b8e4737206")
public static final String FIELDNAME_FormatItem_LineWidth="44c7d2fc-edc1-ba91-8dcf-c2b8e4737206";

@XendraTrl(Identifier="70cb1c1a-fd3a-605a-1bc7-7d38a383deed")
public static String es_PE_COLUMN_LineWidth_Name="Anchura De la Línea";

@XendraColumn(AD_Element_ID="24edf213-5acf-bae9-2ffb-b044dbd33413",ColumnName="LineWidth",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="1",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="70cb1c1a-fd3a-605a-1bc7-7d38a383deed",
Synchronized="2017-08-05 16:52:42.0")
/** Column name LineWidth */
public static final String COLUMNNAME_LineWidth = "LineWidth";
/** Set Max Height.
@param MaxHeight Maximum Height in 1/72 if an inch - 0 = no restriction */
public void setMaxHeight (int MaxHeight)
{
set_Value (COLUMNNAME_MaxHeight, Integer.valueOf(MaxHeight));
}
/** Get Max Height.
@return Maximum Height in 1/72 if an inch - 0 = no restriction */
public int getMaxHeight() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_MaxHeight);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9a63384a-e732-950f-f2b2-0059c60267a7")
public static String es_PE_FIELD_FormatItem_MaxHeight_Description="Máxima altura medida en 1/72 de pulgada. 0=sin restricción";

@XendraTrl(Identifier="9a63384a-e732-950f-f2b2-0059c60267a7")
public static String es_PE_FIELD_FormatItem_MaxHeight_Help="Máxima altura del elemento medido en 1/72 de pulgada (punto). Si es cero (0); no hay restricción.";

@XendraTrl(Identifier="9a63384a-e732-950f-f2b2-0059c60267a7")
public static String es_PE_FIELD_FormatItem_MaxHeight_Name="Máxima Altura";

@XendraField(AD_Column_ID="MaxHeight",IsCentrallyMaintained=true,
AD_Tab_ID="43a46257-9d40-bb6b-447b-df79a88b9055",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@PrintFormatType@!P",DisplayLength=11,IsReadOnly=false,SeqNo=350,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="9a63384a-e732-950f-f2b2-0059c60267a7")
public static final String FIELDNAME_FormatItem_MaxHeight="9a63384a-e732-950f-f2b2-0059c60267a7";

@XendraTrl(Identifier="b4087f6f-99e8-6932-dc00-b6f6fbaa1ce7")
public static String es_PE_COLUMN_MaxHeight_Name="Máxima Altura";

@XendraColumn(AD_Element_ID="90063e94-5616-cf37-75fd-c8e049804263",ColumnName="MaxHeight",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b4087f6f-99e8-6932-dc00-b6f6fbaa1ce7",
Synchronized="2017-08-05 16:52:42.0")
/** Column name MaxHeight */
public static final String COLUMNNAME_MaxHeight = "MaxHeight";
/** Set Max Width.
@param MaxWidth Maximum Width in 1/72 if an inch - 0 = no restriction */
public void setMaxWidth (int MaxWidth)
{
set_Value (COLUMNNAME_MaxWidth, Integer.valueOf(MaxWidth));
}
/** Get Max Width.
@return Maximum Width in 1/72 if an inch - 0 = no restriction */
public int getMaxWidth() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_MaxWidth);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="782170c7-92af-1c0d-7505-957ad5f4b39a")
public static String es_PE_FIELD_FormatItem_MaxWidth_Description="Máximo ancho medido en 1/72 de pulgada. 0=sin restricción";

@XendraTrl(Identifier="782170c7-92af-1c0d-7505-957ad5f4b39a")
public static String es_PE_FIELD_FormatItem_MaxWidth_Help="Máximo ancho del elemento medido en 1/72 de pulgada (punto). Si es cero (0); no hay restricción";

@XendraTrl(Identifier="782170c7-92af-1c0d-7505-957ad5f4b39a")
public static String es_PE_FIELD_FormatItem_MaxWidth_Name="Máximo Ancho";

@XendraField(AD_Column_ID="MaxWidth",IsCentrallyMaintained=true,
AD_Tab_ID="43a46257-9d40-bb6b-447b-df79a88b9055",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@PrintFormatType@!P",DisplayLength=11,IsReadOnly=false,SeqNo=320,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="782170c7-92af-1c0d-7505-957ad5f4b39a")
public static final String FIELDNAME_FormatItem_MaxWidth="782170c7-92af-1c0d-7505-957ad5f4b39a";

@XendraTrl(Identifier="7dbcd222-adec-6b67-4e75-270fa7d466bd")
public static String es_PE_COLUMN_MaxWidth_Name="Máximo Ancho";

@XendraColumn(AD_Element_ID="1fa70aa8-c4cb-ddff-b900-d3599a9fc96c",ColumnName="MaxWidth",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7dbcd222-adec-6b67-4e75-270fa7d466bd",
Synchronized="2017-08-05 16:52:42.0")
/** Column name MaxWidth */
public static final String COLUMNNAME_MaxWidth = "MaxWidth";
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

@XendraTrl(Identifier="779414b8-f65a-713e-365b-b3d6cbf5b454")
public static String es_PE_FIELD_FormatItem_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="779414b8-f65a-713e-365b-b3d6cbf5b454")
public static String es_PE_FIELD_FormatItem_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="779414b8-f65a-713e-365b-b3d6cbf5b454")
public static String es_PE_FIELD_FormatItem_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="43a46257-9d40-bb6b-447b-df79a88b9055",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="779414b8-f65a-713e-365b-b3d6cbf5b454")
public static final String FIELDNAME_FormatItem_Name="779414b8-f65a-713e-365b-b3d6cbf5b454";

@XendraTrl(Identifier="37290218-8326-40ac-bfcf-480bfaf8e814")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="37290218-8326-40ac-bfcf-480bfaf8e814",
Synchronized="2017-08-05 16:52:42.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";

/** PrintAreaType AD_Reference=bd37b9db-379c-e13d-7c91-d2a6f4d08910 */
public static final int PRINTAREATYPE_AD_Reference_ID=256;
/** Set Area.
@param PrintAreaType Print Area */
public void setPrintAreaType (String PrintAreaType)
{
if (PrintAreaType == null) throw new IllegalArgumentException ("PrintAreaType is mandatory");
if (PrintAreaType.equals(REF_AD_PrintArea.Content) || PrintAreaType.equals(REF_AD_PrintArea.Header) || PrintAreaType.equals(REF_AD_PrintArea.Footer));
 else throw new IllegalArgumentException ("PrintAreaType Invalid value - " + PrintAreaType + " - Reference_ID=256 - C - H - F");
if (PrintAreaType.length() > 1)
{
log.warning("Length > 1 - truncated");
PrintAreaType = PrintAreaType.substring(0,0);
}
set_Value (COLUMNNAME_PrintAreaType, PrintAreaType);
}
/** Get Area.
@return Print Area */
public String getPrintAreaType() 
{
return (String)get_Value(COLUMNNAME_PrintAreaType);
}

@XendraTrl(Identifier="c2c24547-3a23-5bb0-b5e8-5bb97f1ee2ad")
public static String es_PE_FIELD_FormatItem_Area_Description="Área de Impresión";

@XendraTrl(Identifier="c2c24547-3a23-5bb0-b5e8-5bb97f1ee2ad")
public static String es_PE_FIELD_FormatItem_Area_Help="Área de impresión para este ítem";

@XendraTrl(Identifier="c2c24547-3a23-5bb0-b5e8-5bb97f1ee2ad")
public static String es_PE_FIELD_FormatItem_Area_Name="Área";

@XendraField(AD_Column_ID="PrintAreaType",IsCentrallyMaintained=true,
AD_Tab_ID="43a46257-9d40-bb6b-447b-df79a88b9055",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsForm@=Y & @IsStandardHeaderFooter@=N",DisplayLength=14,IsReadOnly=false,SeqNo=190,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="c2c24547-3a23-5bb0-b5e8-5bb97f1ee2ad")
public static final String FIELDNAME_FormatItem_Area="c2c24547-3a23-5bb0-b5e8-5bb97f1ee2ad";

@XendraTrl(Identifier="39655ff3-ef48-2ae5-0827-977f9a1afdc0")
public static String es_PE_COLUMN_PrintAreaType_Name="Área";

@XendraColumn(AD_Element_ID="6a18d802-ba95-d17d-88f5-bf12edb3b040",ColumnName="PrintAreaType",
AD_Reference_ID=17,AD_Reference_Value_ID="bd37b9db-379c-e13d-7c91-d2a6f4d08910",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="C",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="39655ff3-ef48-2ae5-0827-977f9a1afdc0",Synchronized="2017-08-05 16:52:42.0")
/** Column name PrintAreaType */
public static final String COLUMNNAME_PrintAreaType = "PrintAreaType";

/** PrintFormatType AD_Reference=2bbb460d-a29d-781b-abc2-94cfb11721a3 */
public static final int PRINTFORMATTYPE_AD_Reference_ID=255;
/** Set Format Type.
@param PrintFormatType Print Format Type */
public void setPrintFormatType (String PrintFormatType)
{
if (PrintFormatType == null) throw new IllegalArgumentException ("PrintFormatType is mandatory");
if (PrintFormatType.equals(REF_AD_PrintFormatType.Image) || PrintFormatType.equals(REF_AD_PrintFormatType.Rectangle) || PrintFormatType.equals(REF_AD_PrintFormatType.Line) || PrintFormatType.equals(REF_AD_PrintFormatType.Accounting) || PrintFormatType.equals(REF_AD_PrintFormatType.Field) || PrintFormatType.equals(REF_AD_PrintFormatType.Text) || PrintFormatType.equals(REF_AD_PrintFormatType.PrintFormat));
 else throw new IllegalArgumentException ("PrintFormatType Invalid value - " + PrintFormatType + " - Reference_ID=255 - I - R - L - A - F - T - P");
if (PrintFormatType.length() > 1)
{
log.warning("Length > 1 - truncated");
PrintFormatType = PrintFormatType.substring(0,0);
}
set_Value (COLUMNNAME_PrintFormatType, PrintFormatType);
}
/** Get Format Type.
@return Print Format Type */
public String getPrintFormatType() 
{
return (String)get_Value(COLUMNNAME_PrintFormatType);
}

@XendraTrl(Identifier="db3cc014-d8ad-b98c-6bac-e2bf55223f5f")
public static String es_PE_FIELD_FormatItem_FormatType_Description="Tipo de Formato";

@XendraTrl(Identifier="db3cc014-d8ad-b98c-6bac-e2bf55223f5f")
public static String es_PE_FIELD_FormatItem_FormatType_Help="El tipo de formato de impresión determina que será impreso";

@XendraTrl(Identifier="db3cc014-d8ad-b98c-6bac-e2bf55223f5f")
public static String es_PE_FIELD_FormatItem_FormatType_Name="Tipo de Formato";

@XendraField(AD_Column_ID="PrintFormatType",IsCentrallyMaintained=true,
AD_Tab_ID="43a46257-9d40-bb6b-447b-df79a88b9055",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="db3cc014-d8ad-b98c-6bac-e2bf55223f5f")
public static final String FIELDNAME_FormatItem_FormatType="db3cc014-d8ad-b98c-6bac-e2bf55223f5f";

@XendraTrl(Identifier="2debb4b0-fe57-ea46-0ad2-ae6dbe32e2d3")
public static String es_PE_COLUMN_PrintFormatType_Name="Tipo de Formato";

@XendraColumn(AD_Element_ID="b88af2e6-8377-613d-9546-821590e91e1a",ColumnName="PrintFormatType",
AD_Reference_ID=17,AD_Reference_Value_ID="2bbb460d-a29d-781b-abc2-94cfb11721a3",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="F",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="2debb4b0-fe57-ea46-0ad2-ae6dbe32e2d3",Synchronized="2017-08-05 16:52:42.0")
/** Column name PrintFormatType */
public static final String COLUMNNAME_PrintFormatType = "PrintFormatType";
/** Set Print Text.
@param PrintName The label text to be printed on a document or correspondence. */
public void setPrintName (String PrintName)
{
if (PrintName != null && PrintName.length() > 2000)
{
log.warning("Length > 2000 - truncated");
PrintName = PrintName.substring(0,1999);
}
set_Value (COLUMNNAME_PrintName, PrintName);
}
/** Get Print Text.
@return The label text to be printed on a document or correspondence. */
public String getPrintName() 
{
String value = (String)get_Value(COLUMNNAME_PrintName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="7b4c767b-e806-8072-275d-05b483595933")
public static String es_PE_FIELD_FormatItem_PrintText_Description="Indica el nombre a ser impreso en un documento ó correspondencia";

@XendraTrl(Identifier="7b4c767b-e806-8072-275d-05b483595933")
public static String es_PE_FIELD_FormatItem_PrintText_Help="El nombre a ser Impreso indica el nombre que será impreso en un documento ó correspondencia";

@XendraTrl(Identifier="7b4c767b-e806-8072-275d-05b483595933")
public static String es_PE_FIELD_FormatItem_PrintText_Name="Nombre a ser Impreso";

@XendraField(AD_Column_ID="PrintName",IsCentrallyMaintained=true,
AD_Tab_ID="43a46257-9d40-bb6b-447b-df79a88b9055",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7b4c767b-e806-8072-275d-05b483595933")
public static final String FIELDNAME_FormatItem_PrintText="7b4c767b-e806-8072-275d-05b483595933";

@XendraTrl(Identifier="7bb4def4-fa22-1bcd-5e92-dc0759020af4")
public static String es_PE_COLUMN_PrintName_Name="Nombre a ser Impreso";

@XendraColumn(AD_Element_ID="83f7d1df-e4e7-adff-3bda-43555a334585",ColumnName="PrintName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7bb4def4-fa22-1bcd-5e92-dc0759020af4",
Synchronized="2017-08-05 16:52:42.0")
/** Column name PrintName */
public static final String COLUMNNAME_PrintName = "PrintName";
/** Set Print Label Suffix.
@param PrintNameSuffix The label text to be printed on a document or correspondence after the field */
public void setPrintNameSuffix (String PrintNameSuffix)
{
if (PrintNameSuffix != null && PrintNameSuffix.length() > 60)
{
log.warning("Length > 60 - truncated");
PrintNameSuffix = PrintNameSuffix.substring(0,59);
}
set_Value (COLUMNNAME_PrintNameSuffix, PrintNameSuffix);
}
/** Get Print Label Suffix.
@return The label text to be printed on a document or correspondence after the field */
public String getPrintNameSuffix() 
{
String value = (String)get_Value(COLUMNNAME_PrintNameSuffix);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="a6434956-c3e1-faa0-78bf-074def620d5e")
public static String es_PE_FIELD_FormatItem_PrintLabelSuffix_Description="El texto de la etiqueta se imprime en un documento ó una correspondencia después del campo.";

@XendraTrl(Identifier="a6434956-c3e1-faa0-78bf-074def620d5e")
public static String es_PE_FIELD_FormatItem_PrintLabelSuffix_Help="La etiqueta que se imprimirá indica el nombre que será impreso en un documento ó una correspondencia después del campo. La longitud máxima es 60 caracteres.";

@XendraTrl(Identifier="a6434956-c3e1-faa0-78bf-074def620d5e")
public static String es_PE_FIELD_FormatItem_PrintLabelSuffix_Name="Impresión Etiqueta Sufijo";

@XendraField(AD_Column_ID="PrintNameSuffix",IsCentrallyMaintained=true,
AD_Tab_ID="43a46257-9d40-bb6b-447b-df79a88b9055",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@PrintFormatType@=F & @IsForm@=Y",DisplayLength=11,IsReadOnly=false,SeqNo=70,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="a6434956-c3e1-faa0-78bf-074def620d5e")
public static final String FIELDNAME_FormatItem_PrintLabelSuffix="a6434956-c3e1-faa0-78bf-074def620d5e";

@XendraTrl(Identifier="cdc2c637-9b70-e188-be8a-88a5ebd7dea3")
public static String es_PE_COLUMN_PrintNameSuffix_Name="Impresión Etiqueta Sufijo";

@XendraColumn(AD_Element_ID="b22c2a3c-eea4-b071-f687-8888fe885816",ColumnName="PrintNameSuffix",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cdc2c637-9b70-e188-be8a-88a5ebd7dea3",
Synchronized="2017-08-05 16:52:42.0")
/** Column name PrintNameSuffix */
public static final String COLUMNNAME_PrintNameSuffix = "PrintNameSuffix";
/** Set Running Total Lines.
@param RunningTotalLines Create Running Total Lines (page break) every x lines */
public void setRunningTotalLines (int RunningTotalLines)
{
set_Value (COLUMNNAME_RunningTotalLines, Integer.valueOf(RunningTotalLines));
}
/** Get Running Total Lines.
@return Create Running Total Lines (page break) every x lines */
public int getRunningTotalLines() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_RunningTotalLines);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6c11c56e-02ec-e0cb-34b0-2e1b17efe60c")
public static String es_PE_FIELD_FormatItem_RunningTotalLines_Description="Crea los Items totales de funcionamiento (rotura de página) las líneas de cada x";

@XendraTrl(Identifier="6c11c56e-02ec-e0cb-34b0-2e1b17efe60c")
public static String es_PE_FIELD_FormatItem_RunningTotalLines_Help="Cuando usted desea imprimir totales corrientes, incorpore el número de Items por la página después de usted desean crear un Item total de funcionamiento y una rotura de página.";

@XendraTrl(Identifier="6c11c56e-02ec-e0cb-34b0-2e1b17efe60c")
public static String es_PE_FIELD_FormatItem_RunningTotalLines_Name="Item Total de la Corrida";

@XendraField(AD_Column_ID="RunningTotalLines",IsCentrallyMaintained=true,
AD_Tab_ID="43a46257-9d40-bb6b-447b-df79a88b9055",AD_FieldGroup_ID="Calculations",IsDisplayed=true,
DisplayLogic="@PrintFormatType@=F & @IsRunningTotal@=Y & @IsSummarized@=Y",DisplayLength=11,
IsReadOnly=false,SeqNo=480,SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,
Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6c11c56e-02ec-e0cb-34b0-2e1b17efe60c")
public static final String FIELDNAME_FormatItem_RunningTotalLines="6c11c56e-02ec-e0cb-34b0-2e1b17efe60c";

@XendraTrl(Identifier="a74d2381-3c9d-756a-6bc8-f24c132bc47f")
public static String es_PE_COLUMN_RunningTotalLines_Name="Línea Total de la Corrida";

@XendraColumn(AD_Element_ID="d93d929c-b0ff-46a3-758d-2c5f4e54bdec",ColumnName="RunningTotalLines",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="20",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a74d2381-3c9d-756a-6bc8-f24c132bc47f",
Synchronized="2017-08-05 16:52:42.0")
/** Column name RunningTotalLines */
public static final String COLUMNNAME_RunningTotalLines = "RunningTotalLines";
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

@XendraTrl(Identifier="0b78fd99-c5e8-9b22-fc7e-fcbf13f30a66")
public static String es_PE_FIELD_FormatItem_Sequence_Description="Método de ordenar registros; el número más bajo viene primero";

@XendraTrl(Identifier="0b78fd99-c5e8-9b22-fc7e-fcbf13f30a66")
public static String es_PE_FIELD_FormatItem_Sequence_Help="La Secuencia indica el orden de los registros";

@XendraTrl(Identifier="0b78fd99-c5e8-9b22-fc7e-fcbf13f30a66")
public static String es_PE_FIELD_FormatItem_Sequence_Name="Secuencia";

@XendraField(AD_Column_ID="SeqNo",IsCentrallyMaintained=true,
AD_Tab_ID="43a46257-9d40-bb6b-447b-df79a88b9055",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0b78fd99-c5e8-9b22-fc7e-fcbf13f30a66")
public static final String FIELDNAME_FormatItem_Sequence="0b78fd99-c5e8-9b22-fc7e-fcbf13f30a66";

@XendraTrl(Identifier="935c0869-bbb5-319d-5f60-092b8a807b96")
public static String es_PE_COLUMN_SeqNo_Name="Secuencia";

@XendraColumn(AD_Element_ID="38fa26fe-b59d-fce1-c129-420b57da738b",ColumnName="SeqNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@SQL=SELECT COALESCE(MAX(SeqNo),0)+10 AS DefaultValue FROM AD_PrintFormatItem WHERE AD_PrintFormat_ID=@AD_PrintFormat_ID@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="935c0869-bbb5-319d-5f60-092b8a807b96",
Synchronized="2017-08-05 16:52:42.0")
/** Column name SeqNo */
public static final String COLUMNNAME_SeqNo = "SeqNo";

/** ShapeType AD_Reference=f652eb70-a549-44dd-d525-16c3e901732e */
public static final int SHAPETYPE_AD_Reference_ID=333;
/** Set Shape Type.
@param ShapeType Type of the shape to be painted */
public void setShapeType (String ShapeType)
{
if (ShapeType == null || ShapeType.equals(REF_AD_PrintFormatItemShapeType.Rectangle3D) || ShapeType.equals(REF_AD_PrintFormatItemShapeType.Oval) || ShapeType.equals(REF_AD_PrintFormatItemShapeType.RoundRectangle) || ShapeType.equals(REF_AD_PrintFormatItemShapeType.NormalRectangle));
 else throw new IllegalArgumentException ("ShapeType Invalid value - " + ShapeType + " - Reference_ID=333 - 3 - O - R - N");
if (ShapeType != null && ShapeType.length() > 1)
{
log.warning("Length > 1 - truncated");
ShapeType = ShapeType.substring(0,0);
}
set_Value (COLUMNNAME_ShapeType, ShapeType);
}
/** Get Shape Type.
@return Type of the shape to be painted */
public String getShapeType() 
{
return (String)get_Value(COLUMNNAME_ShapeType);
}

@XendraTrl(Identifier="41de40b2-01bc-ecf4-93b9-faf91c9a14e6")
public static String es_PE_FIELD_FormatItem_ShapeType_Description="Tipo de la forma para ser pintado.";

@XendraTrl(Identifier="41de40b2-01bc-ecf4-93b9-faf91c9a14e6")
public static String es_PE_FIELD_FormatItem_ShapeType_Name="Tipo de Forma";

@XendraField(AD_Column_ID="ShapeType",IsCentrallyMaintained=true,
AD_Tab_ID="43a46257-9d40-bb6b-447b-df79a88b9055",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@PrintFormatType@=R",DisplayLength=14,IsReadOnly=false,SeqNo=340,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="41de40b2-01bc-ecf4-93b9-faf91c9a14e6")
public static final String FIELDNAME_FormatItem_ShapeType="41de40b2-01bc-ecf4-93b9-faf91c9a14e6";

@XendraTrl(Identifier="ecd9ab47-c0e7-063f-383f-c96de61f751a")
public static String es_PE_COLUMN_ShapeType_Name="Tipo de Forma";

@XendraColumn(AD_Element_ID="ae8dd980-5ef6-65c8-4087-d870b395a8dd",ColumnName="ShapeType",
AD_Reference_ID=17,AD_Reference_Value_ID="f652eb70-a549-44dd-d525-16c3e901732e",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="ecd9ab47-c0e7-063f-383f-c96de61f751a",Synchronized="2017-08-05 16:52:42.0")
/** Column name ShapeType */
public static final String COLUMNNAME_ShapeType = "ShapeType";
/** Set Record Sort No.
@param SortNo Determines in what order the records are displayed */
public void setSortNo (int SortNo)
{
set_Value (COLUMNNAME_SortNo, Integer.valueOf(SortNo));
}
/** Get Record Sort No.
@return Determines in what order the records are displayed */
public int getSortNo() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_SortNo);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6440592c-8d98-58ab-7877-dada2ae26406")
public static String es_PE_FIELD_FormatItem_RecordSortNo_Description="Determina en que orden son desplegados los productos";

@XendraTrl(Identifier="6440592c-8d98-58ab-7877-dada2ae26406")
public static String es_PE_FIELD_FormatItem_RecordSortNo_Help="El No. de clasificación del registro indica la secuencia de clasificación ascendente de los registros";

@XendraTrl(Identifier="6440592c-8d98-58ab-7877-dada2ae26406")
public static String es_PE_FIELD_FormatItem_RecordSortNo_Name="No. de Clasificación del Registro";

@XendraField(AD_Column_ID="SortNo",IsCentrallyMaintained=true,
AD_Tab_ID="43a46257-9d40-bb6b-447b-df79a88b9055",AD_FieldGroup_ID="Calculations",IsDisplayed=true,
DisplayLogic="@PrintFormatType@=F & @IsOrderBy@=Y",DisplayLength=11,IsReadOnly=false,SeqNo=420,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="6440592c-8d98-58ab-7877-dada2ae26406")
public static final String FIELDNAME_FormatItem_RecordSortNo="6440592c-8d98-58ab-7877-dada2ae26406";

@XendraTrl(Identifier="4231cc4d-32ab-cfcf-3781-739238a91dcc")
public static String es_PE_COLUMN_SortNo_Name="No. de Clasificación del Registro";

@XendraColumn(AD_Element_ID="929301a0-e5a0-7f21-9aa1-b7e9061fe6ed",ColumnName="SortNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4231cc4d-32ab-cfcf-3781-739238a91dcc",
Synchronized="2017-08-05 16:52:42.0")
/** Column name SortNo */
public static final String COLUMNNAME_SortNo = "SortNo";
/** Set X Position.
@param XPosition Absolute X (horizontal) position in 1/72 of an inch */
public void setXPosition (int XPosition)
{
set_Value (COLUMNNAME_XPosition, Integer.valueOf(XPosition));
}
/** Get X Position.
@return Absolute X (horizontal) position in 1/72 of an inch */
public int getXPosition() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_XPosition);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4e7f2576-ee5d-6f17-064a-d1ee2ddbd4c9")
public static String es_PE_FIELD_FormatItem_XPosition_Description="Posición absoluta X (horizontal) en 1/72 de pulgada";

@XendraTrl(Identifier="4e7f2576-ee5d-6f17-064a-d1ee2ddbd4c9")
public static String es_PE_FIELD_FormatItem_XPosition_Help="Posición absoluta X (horizontal) en 1/72 de pulgada";

@XendraTrl(Identifier="4e7f2576-ee5d-6f17-064a-d1ee2ddbd4c9")
public static String es_PE_FIELD_FormatItem_XPosition_Name="Posición X";

@XendraField(AD_Column_ID="XPosition",IsCentrallyMaintained=true,
AD_Tab_ID="43a46257-9d40-bb6b-447b-df79a88b9055",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsForm@=Y & @IsRelativePosition@=N",DisplayLength=11,IsReadOnly=false,SeqNo=230,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="4e7f2576-ee5d-6f17-064a-d1ee2ddbd4c9")
public static final String FIELDNAME_FormatItem_XPosition="4e7f2576-ee5d-6f17-064a-d1ee2ddbd4c9";

@XendraTrl(Identifier="a54e0872-aabe-faf3-957a-99395a0913a8")
public static String es_PE_COLUMN_XPosition_Name="Posición X";

@XendraColumn(AD_Element_ID="c9e199b8-4285-b714-7ca0-2a2ce8f49a8c",ColumnName="XPosition",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a54e0872-aabe-faf3-957a-99395a0913a8",
Synchronized="2017-08-05 16:52:42.0")
/** Column name XPosition */
public static final String COLUMNNAME_XPosition = "XPosition";
/** Set X Space.
@param XSpace Relative X (horizontal) space in 1/72 of an inch */
public void setXSpace (int XSpace)
{
set_Value (COLUMNNAME_XSpace, Integer.valueOf(XSpace));
}
/** Get X Space.
@return Relative X (horizontal) space in 1/72 of an inch */
public int getXSpace() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_XSpace);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="fc664426-b811-2684-a9a2-8e7c05fce9ca")
public static String es_PE_FIELD_FormatItem_XSpace_Description="Espacio Relativo X (horizontal) en 1/72 de pulgada";

@XendraTrl(Identifier="fc664426-b811-2684-a9a2-8e7c05fce9ca")
public static String es_PE_FIELD_FormatItem_XSpace_Help="Espacio Relativo X (horizontal) en 1/72 de pulgada en relación al final del ítem anterior";

@XendraTrl(Identifier="fc664426-b811-2684-a9a2-8e7c05fce9ca")
public static String es_PE_FIELD_FormatItem_XSpace_Name="Espacio X";

@XendraField(AD_Column_ID="XSpace",IsCentrallyMaintained=true,
AD_Tab_ID="43a46257-9d40-bb6b-447b-df79a88b9055",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsForm@=Y & @IsRelativePosition@=Y",DisplayLength=11,IsReadOnly=false,SeqNo=300,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="fc664426-b811-2684-a9a2-8e7c05fce9ca")
public static final String FIELDNAME_FormatItem_XSpace="fc664426-b811-2684-a9a2-8e7c05fce9ca";

@XendraTrl(Identifier="66f14ade-a38c-6406-2e46-312d26997ca0")
public static String es_PE_COLUMN_XSpace_Name="Espacio X";

@XendraColumn(AD_Element_ID="39232c15-689a-2446-1e14-86bae2662e81",ColumnName="XSpace",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="66f14ade-a38c-6406-2e46-312d26997ca0",
Synchronized="2017-08-05 16:52:42.0")
/** Column name XSpace */
public static final String COLUMNNAME_XSpace = "XSpace";
/** Set Y Position.
@param YPosition Absolute Y (vertical) position in 1/72 of an inch */
public void setYPosition (int YPosition)
{
set_Value (COLUMNNAME_YPosition, Integer.valueOf(YPosition));
}
/** Get Y Position.
@return Absolute Y (vertical) position in 1/72 of an inch */
public int getYPosition() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_YPosition);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b3f237fa-d2a1-859a-4ac2-1f439d7caa67")
public static String es_PE_FIELD_FormatItem_YPosition_Description="Posición absoluta Y (vertical) en 1/72 de pulgada";

@XendraTrl(Identifier="b3f237fa-d2a1-859a-4ac2-1f439d7caa67")
public static String es_PE_FIELD_FormatItem_YPosition_Help="Posición absoluta Y (vertical) en 1/72 de pulgada";

@XendraTrl(Identifier="b3f237fa-d2a1-859a-4ac2-1f439d7caa67")
public static String es_PE_FIELD_FormatItem_YPosition_Name="Posición Y";

@XendraField(AD_Column_ID="YPosition",IsCentrallyMaintained=true,
AD_Tab_ID="43a46257-9d40-bb6b-447b-df79a88b9055",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsForm@=Y & @IsRelativePosition@=N",DisplayLength=11,IsReadOnly=false,SeqNo=240,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="b3f237fa-d2a1-859a-4ac2-1f439d7caa67")
public static final String FIELDNAME_FormatItem_YPosition="b3f237fa-d2a1-859a-4ac2-1f439d7caa67";

@XendraTrl(Identifier="785cabb8-cd09-81d6-c55a-ed6a539ab8dc")
public static String es_PE_COLUMN_YPosition_Name="Posición Y";

@XendraColumn(AD_Element_ID="fa498dfa-2429-1705-70ab-df8eb3c62eab",ColumnName="YPosition",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="785cabb8-cd09-81d6-c55a-ed6a539ab8dc",
Synchronized="2017-08-05 16:52:42.0")
/** Column name YPosition */
public static final String COLUMNNAME_YPosition = "YPosition";
/** Set Y Space.
@param YSpace Relative Y (vertical) space in 1/72 of an inch */
public void setYSpace (int YSpace)
{
set_Value (COLUMNNAME_YSpace, Integer.valueOf(YSpace));
}
/** Get Y Space.
@return Relative Y (vertical) space in 1/72 of an inch */
public int getYSpace() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_YSpace);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="78e4c40a-22cf-ab90-4a62-ebe39e373c0f")
public static String es_PE_FIELD_FormatItem_YSpace_Description="Espacio Relativo Y (vertical) en 1/72 de pulgada";

@XendraTrl(Identifier="78e4c40a-22cf-ab90-4a62-ebe39e373c0f")
public static String es_PE_FIELD_FormatItem_YSpace_Help="Espacio Relativo Y (Vertical) en 1/72 de pulgada en relación al final del ítem anterior";

@XendraTrl(Identifier="78e4c40a-22cf-ab90-4a62-ebe39e373c0f")
public static String es_PE_FIELD_FormatItem_YSpace_Name="Espacio Y";

@XendraField(AD_Column_ID="YSpace",IsCentrallyMaintained=true,
AD_Tab_ID="43a46257-9d40-bb6b-447b-df79a88b9055",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsForm@=Y & @IsRelativePosition@=Y",DisplayLength=11,IsReadOnly=false,SeqNo=310,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="78e4c40a-22cf-ab90-4a62-ebe39e373c0f")
public static final String FIELDNAME_FormatItem_YSpace="78e4c40a-22cf-ab90-4a62-ebe39e373c0f";

@XendraTrl(Identifier="1749fc78-3bd2-89e1-900a-fc6198096f88")
public static String es_PE_COLUMN_YSpace_Name="Espacio Y";

@XendraColumn(AD_Element_ID="c7bb5041-ad54-cdb6-8813-278e3ba9f901",ColumnName="YSpace",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1749fc78-3bd2-89e1-900a-fc6198096f88",
Synchronized="2017-08-05 16:52:42.0")
/** Column name YSpace */
public static final String COLUMNNAME_YSpace = "YSpace";
}
