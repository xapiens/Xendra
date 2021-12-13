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
/** Generated Model for AD_PrintTableFormat
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_PrintTableFormat extends PO
{
/** Standard Constructor
@param ctx context
@param AD_PrintTableFormat_ID id
@param trxName transaction
*/
public X_AD_PrintTableFormat (Properties ctx, int AD_PrintTableFormat_ID, String trxName)
{
super (ctx, AD_PrintTableFormat_ID, trxName);
/** if (AD_PrintTableFormat_ID == 0)
{
setAD_PrintTableFormat_ID (0);
setIsDefault (false);	
// N
setIsPaintBoundaryLines (false);	
// N
setIsPaintHeaderLines (true);	
// Y
setIsPaintHLines (false);	
// N
setIsPaintVLines (false);	
// N
setIsPrintFunctionSymbols (false);	
// N
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_PrintTableFormat (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=523 */
public static int Table_ID=MTable.getTable_ID("AD_PrintTableFormat");

@XendraTrl(Identifier="5f791490-7e45-00cf-590f-198eaa26c16d")
public static String es_PE_TAB_PrintTableFormat_Description="Definir formato de la tabla del Informe";

@XendraTrl(Identifier="5f791490-7e45-00cf-590f-198eaa26c16d")
public static String es_PE_TAB_PrintTableFormat_Help="El formato de tabla de impresión permite definir como se imprimen los encabezados de tabla; etc. Si se dejan las entradas en blanco; los colores y fuentes predeterminados son usados: Los fuentes están basados en los fuentes del Informe; encabezados de tabla y de página estarán en negrilla; la fuente de Función es Bold-Italic; la fuente del pie de página es dos puntos más pequeña; la fuente del parámetro es Italic.";

@XendraTrl(Identifier="5f791490-7e45-00cf-590f-198eaa26c16d")
public static String es_PE_TAB_PrintTableFormat_Name="Formato de la Tabla de Impresión";

@XendraTab(Name="Print Table Format",Description="Define Report Table Format",
Help="The Print Table Format lets you define how table header, etc. is printed. If you leave the entries empty, the default colors and fonts are used:<br> Fonts are based on the Font used in the Report: Page Header and Table Header will be bold, the Function Font is Bold-Italic, the Footer Font is two points smaller, the Parameter Font is Italic.",
AD_Window_ID="ea3738bc-cb13-f4a2-b43d-02811f0038a4",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="5f791490-7e45-00cf-590f-198eaa26c16d",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_PrintTableFormat="5f791490-7e45-00cf-590f-198eaa26c16d";

@XendraTrl(Identifier="7816df17-97cc-caec-34c4-37fe6d59d555")
public static String es_PE_TABLE_AD_PrintTableFormat_Name="Formato de Impresión de la Tabla";


@XendraTable(Name="Print Table Format",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Table Format in Reports",Help="",
TableName="AD_PrintTableFormat",AccessLevel="6",
AD_Window_ID="ea3738bc-cb13-f4a2-b43d-02811f0038a4",AD_Val_Rule_ID="",IsKey=1,LoadSeq=60,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.dictionary",Identifier="7816df17-97cc-caec-34c4-37fe6d59d555",
Synchronized="2020-03-03 21:35:46.0")
/** TableName=AD_PrintTableFormat */
public static final String Table_Name="AD_PrintTableFormat";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_PrintTableFormat");

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
    Table_ID = MTable.getTable_ID("AD_PrintTableFormat");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_PrintTableFormat[").append(get_ID()).append("]");
return sb.toString();
}
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

@XendraTrl(Identifier="29b6f963-2574-bac4-2db0-ee532ff1b34f")
public static String es_PE_COLUMN_AD_Image_ID_Name="Imagen";

@XendraColumn(AD_Element_ID="8464640e-ab89-67ff-b78b-1e8940657a22",ColumnName="AD_Image_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="29b6f963-2574-bac4-2db0-ee532ff1b34f",
Synchronized="2019-08-30 22:20:34.0")
/** Column name AD_Image_ID */
public static final String COLUMNNAME_AD_Image_ID = "AD_Image_ID";
/** Set Print Table Format.
@param AD_PrintTableFormat_ID Table Format in Reports */
public void setAD_PrintTableFormat_ID (int AD_PrintTableFormat_ID)
{
if (AD_PrintTableFormat_ID < 1) throw new IllegalArgumentException ("AD_PrintTableFormat_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_PrintTableFormat_ID, Integer.valueOf(AD_PrintTableFormat_ID));
}
/** Get Print Table Format.
@return Table Format in Reports */
public int getAD_PrintTableFormat_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_PrintTableFormat_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f2aa816b-4117-ca64-1b69-349b4a5bb5d3")
public static String es_PE_FIELD_PrintTableFormat_PrintTableFormat_Name="Formato de Impresión de la Tabla";

@XendraTrl(Identifier="f2aa816b-4117-ca64-1b69-349b4a5bb5d3")
public static String es_PE_FIELD_PrintTableFormat_PrintTableFormat_Description="Formato de tabla en los Informes";

@XendraTrl(Identifier="f2aa816b-4117-ca64-1b69-349b4a5bb5d3")
public static String es_PE_FIELD_PrintTableFormat_PrintTableFormat_Help="Formato de la impresión de tabla determina el tipo de caracter y colores de la tabla impresa";

@XendraField(AD_Column_ID="AD_PrintTableFormat_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5f791490-7e45-00cf-590f-198eaa26c16d",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f2aa816b-4117-ca64-1b69-349b4a5bb5d3")
public static final String FIELDNAME_PrintTableFormat_PrintTableFormat="f2aa816b-4117-ca64-1b69-349b4a5bb5d3";
/** Column name AD_PrintTableFormat_ID */
public static final String COLUMNNAME_AD_PrintTableFormat_ID = "AD_PrintTableFormat_ID";
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

@XendraTrl(Identifier="a7e45161-7d21-c146-6783-8d9568d34aaa")
public static String es_PE_FIELD_PrintTableFormat_Description_Name="Observación";

@XendraTrl(Identifier="a7e45161-7d21-c146-6783-8d9568d34aaa")
public static String es_PE_FIELD_PrintTableFormat_Description_Description="Observación";

@XendraTrl(Identifier="a7e45161-7d21-c146-6783-8d9568d34aaa")
public static String es_PE_FIELD_PrintTableFormat_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="5f791490-7e45-00cf-590f-198eaa26c16d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a7e45161-7d21-c146-6783-8d9568d34aaa")
public static final String FIELDNAME_PrintTableFormat_Description="a7e45161-7d21-c146-6783-8d9568d34aaa";

@XendraTrl(Identifier="df5bcaed-cf69-d2f1-5ecc-4a1b948eb351")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="df5bcaed-cf69-d2f1-5ecc-4a1b948eb351",
Synchronized="2019-08-30 22:20:34.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Footer Center.
@param FooterCenter Content of the center portion of the footer. */
public void setFooterCenter (String FooterCenter)
{
if (FooterCenter != null && FooterCenter.length() > 255)
{
log.warning("Length > 255 - truncated");
FooterCenter = FooterCenter.substring(0,254);
}
set_Value (COLUMNNAME_FooterCenter, FooterCenter);
}
/** Get Footer Center.
@return Content of the center portion of the footer. */
public String getFooterCenter() 
{
String value = (String)get_Value(COLUMNNAME_FooterCenter);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="8147d6c3-2753-c30c-eed0-536bc9fa6752")
public static String es_PE_FIELD_PrintTableFormat_FooterCenter_Name="Centrar en pie de pág.";

@XendraField(AD_Column_ID="FooterCenter",IsCentrallyMaintained=true,
AD_Tab_ID="5f791490-7e45-00cf-590f-198eaa26c16d",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8147d6c3-2753-c30c-eed0-536bc9fa6752")
public static final String FIELDNAME_PrintTableFormat_FooterCenter="8147d6c3-2753-c30c-eed0-536bc9fa6752";

@XendraTrl(Identifier="d83d5aad-af2c-568c-235b-02774f53e9b4")
public static String es_PE_COLUMN_FooterCenter_Name="Centrar en pie de pág.";

@XendraColumn(AD_Element_ID="dcc4bf0b-d8c4-944e-2fdc-803a25590c59",ColumnName="FooterCenter",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d83d5aad-af2c-568c-235b-02774f53e9b4",
Synchronized="2019-08-30 22:20:34.0")
/** Column name FooterCenter */
public static final String COLUMNNAME_FooterCenter = "FooterCenter";
/** Set Footer Left.
@param FooterLeft Content of the left portion of the footer. */
public void setFooterLeft (String FooterLeft)
{
if (FooterLeft != null && FooterLeft.length() > 255)
{
log.warning("Length > 255 - truncated");
FooterLeft = FooterLeft.substring(0,254);
}
set_Value (COLUMNNAME_FooterLeft, FooterLeft);
}
/** Get Footer Left.
@return Content of the left portion of the footer. */
public String getFooterLeft() 
{
String value = (String)get_Value(COLUMNNAME_FooterLeft);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="1ec070d4-9013-586c-38ec-ce3f79671cbb")
public static String es_PE_FIELD_PrintTableFormat_FooterLeft_Name="Izquierda en P. Pagina";

@XendraTrl(Identifier="1ec070d4-9013-586c-38ec-ce3f79671cbb")
public static String es_PE_FIELD_PrintTableFormat_FooterLeft_Description="Contenido de la porción izquierda del pie.";

@XendraField(AD_Column_ID="FooterLeft",IsCentrallyMaintained=true,
AD_Tab_ID="5f791490-7e45-00cf-590f-198eaa26c16d",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1ec070d4-9013-586c-38ec-ce3f79671cbb")
public static final String FIELDNAME_PrintTableFormat_FooterLeft="1ec070d4-9013-586c-38ec-ce3f79671cbb";

@XendraTrl(Identifier="1d26ad2d-e858-74cb-cbbd-86b08d8552e9")
public static String es_PE_COLUMN_FooterLeft_Name="Izquierda en P. Pagina";

@XendraColumn(AD_Element_ID="843f61b2-1f36-b650-1c1f-5ec3c2e14e6a",ColumnName="FooterLeft",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1d26ad2d-e858-74cb-cbbd-86b08d8552e9",
Synchronized="2019-08-30 22:20:34.0")
/** Column name FooterLeft */
public static final String COLUMNNAME_FooterLeft = "FooterLeft";
/** Set Footer Right.
@param FooterRight Content of the right portion of the footer. */
public void setFooterRight (String FooterRight)
{
if (FooterRight != null && FooterRight.length() > 255)
{
log.warning("Length > 255 - truncated");
FooterRight = FooterRight.substring(0,254);
}
set_Value (COLUMNNAME_FooterRight, FooterRight);
}
/** Get Footer Right.
@return Content of the right portion of the footer. */
public String getFooterRight() 
{
String value = (String)get_Value(COLUMNNAME_FooterRight);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="aa671809-5e77-3319-6306-fde6460d0997")
public static String es_PE_FIELD_PrintTableFormat_FooterRight_Name="Derecha en  P. Pagina";

@XendraTrl(Identifier="aa671809-5e77-3319-6306-fde6460d0997")
public static String es_PE_FIELD_PrintTableFormat_FooterRight_Description="Contenido de la porción derecha del pie.";

@XendraField(AD_Column_ID="FooterRight",IsCentrallyMaintained=true,
AD_Tab_ID="5f791490-7e45-00cf-590f-198eaa26c16d",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="aa671809-5e77-3319-6306-fde6460d0997")
public static final String FIELDNAME_PrintTableFormat_FooterRight="aa671809-5e77-3319-6306-fde6460d0997";

@XendraTrl(Identifier="c2bb3165-0f15-a63b-cfea-ec048ad2f0f9")
public static String es_PE_COLUMN_FooterRight_Name="Derecha en  P. Pagina";

@XendraColumn(AD_Element_ID="701af99d-760b-aba4-de33-a30da9c874c4",ColumnName="FooterRight",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c2bb3165-0f15-a63b-cfea-ec048ad2f0f9",
Synchronized="2019-08-30 22:20:34.0")
/** Column name FooterRight */
public static final String COLUMNNAME_FooterRight = "FooterRight";
/** Set Function BG Color.
@param FunctBG_PrintColor_ID Function Background Color */
public void setFunctBG_PrintColor_ID (int FunctBG_PrintColor_ID)
{
if (FunctBG_PrintColor_ID <= 0) set_Value (COLUMNNAME_FunctBG_PrintColor_ID, null);
 else 
set_Value (COLUMNNAME_FunctBG_PrintColor_ID, Integer.valueOf(FunctBG_PrintColor_ID));
}
/** Get Function BG Color.
@return Function Background Color */
public int getFunctBG_PrintColor_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_FunctBG_PrintColor_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="26569f3b-9ea5-b6a2-7b9c-7ae594b0e9c4")
public static String es_PE_FIELD_PrintTableFormat_FunctionBGColor_Name="Función Color BG";

@XendraTrl(Identifier="26569f3b-9ea5-b6a2-7b9c-7ae594b0e9c4")
public static String es_PE_FIELD_PrintTableFormat_FunctionBGColor_Description="Función color posterior (fondo)";

@XendraTrl(Identifier="26569f3b-9ea5-b6a2-7b9c-7ae594b0e9c4")
public static String es_PE_FIELD_PrintTableFormat_FunctionBGColor_Help="Color posterior de una fila de función";

@XendraField(AD_Column_ID="FunctBG_PrintColor_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5f791490-7e45-00cf-590f-198eaa26c16d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=310,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="26569f3b-9ea5-b6a2-7b9c-7ae594b0e9c4")
public static final String FIELDNAME_PrintTableFormat_FunctionBGColor="26569f3b-9ea5-b6a2-7b9c-7ae594b0e9c4";

@XendraTrl(Identifier="b87a2599-7f6e-a084-acf1-af271b1795ed")
public static String es_PE_COLUMN_FunctBG_PrintColor_ID_Name="Función Color BG";

@XendraColumn(AD_Element_ID="ae41b475-ee50-b568-995c-7380598f2b09",
ColumnName="FunctBG_PrintColor_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="a7e43a27-3ce0-e9aa-8f3c-78e2921fc1cd",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="b87a2599-7f6e-a084-acf1-af271b1795ed",
Synchronized="2019-08-30 22:20:34.0")
/** Column name FunctBG_PrintColor_ID */
public static final String COLUMNNAME_FunctBG_PrintColor_ID = "FunctBG_PrintColor_ID";
/** Set Function Color.
@param FunctFG_PrintColor_ID Function Foreground Color */
public void setFunctFG_PrintColor_ID (int FunctFG_PrintColor_ID)
{
if (FunctFG_PrintColor_ID <= 0) set_Value (COLUMNNAME_FunctFG_PrintColor_ID, null);
 else 
set_Value (COLUMNNAME_FunctFG_PrintColor_ID, Integer.valueOf(FunctFG_PrintColor_ID));
}
/** Get Function Color.
@return Function Foreground Color */
public int getFunctFG_PrintColor_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_FunctFG_PrintColor_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6f8ff5f0-e909-af30-0bcb-446870e18c1f")
public static String es_PE_FIELD_PrintTableFormat_FunctionColor_Name="Función Color";

@XendraTrl(Identifier="6f8ff5f0-e909-af30-0bcb-446870e18c1f")
public static String es_PE_FIELD_PrintTableFormat_FunctionColor_Description="Función color anterior ";

@XendraTrl(Identifier="6f8ff5f0-e909-af30-0bcb-446870e18c1f")
public static String es_PE_FIELD_PrintTableFormat_FunctionColor_Help="Color anterior de una fila de función";

@XendraField(AD_Column_ID="FunctFG_PrintColor_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5f791490-7e45-00cf-590f-198eaa26c16d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=300,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6f8ff5f0-e909-af30-0bcb-446870e18c1f")
public static final String FIELDNAME_PrintTableFormat_FunctionColor="6f8ff5f0-e909-af30-0bcb-446870e18c1f";

@XendraTrl(Identifier="6a4b63d0-939c-9ab0-09ef-66c7436395a5")
public static String es_PE_COLUMN_FunctFG_PrintColor_ID_Name="Función Color";

@XendraColumn(AD_Element_ID="f52a9edc-cb92-c9a9-af20-f4dff897c4b9",
ColumnName="FunctFG_PrintColor_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="a7e43a27-3ce0-e9aa-8f3c-78e2921fc1cd",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="6a4b63d0-939c-9ab0-09ef-66c7436395a5",
Synchronized="2019-08-30 22:20:34.0")
/** Column name FunctFG_PrintColor_ID */
public static final String COLUMNNAME_FunctFG_PrintColor_ID = "FunctFG_PrintColor_ID";
/** Set Function Font.
@param Funct_PrintFont_ID Function row Font */
public void setFunct_PrintFont_ID (int Funct_PrintFont_ID)
{
if (Funct_PrintFont_ID <= 0) set_Value (COLUMNNAME_Funct_PrintFont_ID, null);
 else 
set_Value (COLUMNNAME_Funct_PrintFont_ID, Integer.valueOf(Funct_PrintFont_ID));
}
/** Get Function Font.
@return Function row Font */
public int getFunct_PrintFont_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Funct_PrintFont_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="73156e7d-22e7-124a-0810-ba0668aaa359")
public static String es_PE_FIELD_PrintTableFormat_FunctionFont_Name="Fuente de Función";

@XendraTrl(Identifier="73156e7d-22e7-124a-0810-ba0668aaa359")
public static String es_PE_FIELD_PrintTableFormat_FunctionFont_Description="Fuente de la fila de función";

@XendraTrl(Identifier="73156e7d-22e7-124a-0810-ba0668aaa359")
public static String es_PE_FIELD_PrintTableFormat_FunctionFont_Help="Fuente de la fila de función";

@XendraField(AD_Column_ID="Funct_PrintFont_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5f791490-7e45-00cf-590f-198eaa26c16d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=320,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="73156e7d-22e7-124a-0810-ba0668aaa359")
public static final String FIELDNAME_PrintTableFormat_FunctionFont="73156e7d-22e7-124a-0810-ba0668aaa359";

@XendraTrl(Identifier="6a788975-4b39-683c-ea70-2858f3bf996c")
public static String es_PE_COLUMN_Funct_PrintFont_ID_Name="Fuente de Función";

@XendraColumn(AD_Element_ID="f4707663-c47b-a628-f02b-da3711012a50",ColumnName="Funct_PrintFont_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="b6d71c22-8c19-d2cc-36b2-fdb87d405ba2",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6a788975-4b39-683c-ea70-2858f3bf996c",Synchronized="2019-08-30 22:20:34.0")
/** Column name Funct_PrintFont_ID */
public static final String COLUMNNAME_Funct_PrintFont_ID = "Funct_PrintFont_ID";
/** Set Header Line Color.
@param HdrLine_PrintColor_ID Table header row line color */
public void setHdrLine_PrintColor_ID (int HdrLine_PrintColor_ID)
{
if (HdrLine_PrintColor_ID <= 0) set_Value (COLUMNNAME_HdrLine_PrintColor_ID, null);
 else 
set_Value (COLUMNNAME_HdrLine_PrintColor_ID, Integer.valueOf(HdrLine_PrintColor_ID));
}
/** Get Header Line Color.
@return Table header row line color */
public int getHdrLine_PrintColor_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HdrLine_PrintColor_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9012ab93-1870-f6ce-9a3e-0f6ef5eb4dad")
public static String es_PE_FIELD_PrintTableFormat_HeaderLineColor_Name="Color Líneas de Encabezamiento";

@XendraTrl(Identifier="9012ab93-1870-f6ce-9a3e-0f6ef5eb4dad")
public static String es_PE_FIELD_PrintTableFormat_HeaderLineColor_Description="Color de las lineas de la fila de la tabla de encabezamiento";

@XendraTrl(Identifier="9012ab93-1870-f6ce-9a3e-0f6ef5eb4dad")
public static String es_PE_FIELD_PrintTableFormat_HeaderLineColor_Help="Color de las líneas de la fila del encabezamiento de la tabla";

@XendraField(AD_Column_ID="HdrLine_PrintColor_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5f791490-7e45-00cf-590f-198eaa26c16d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsPaintHeaderLines@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=200,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="9012ab93-1870-f6ce-9a3e-0f6ef5eb4dad")
public static final String FIELDNAME_PrintTableFormat_HeaderLineColor="9012ab93-1870-f6ce-9a3e-0f6ef5eb4dad";

@XendraTrl(Identifier="6e6156ec-e8ad-afd6-b580-b566c9d4b9aa")
public static String es_PE_COLUMN_HdrLine_PrintColor_ID_Name="Color Líneas de Encabezamiento";

@XendraColumn(AD_Element_ID="bb6d87b8-0f95-7215-9d38-767b095d7cdc",
ColumnName="HdrLine_PrintColor_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="a7e43a27-3ce0-e9aa-8f3c-78e2921fc1cd",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="6e6156ec-e8ad-afd6-b580-b566c9d4b9aa",
Synchronized="2019-08-30 22:20:34.0")
/** Column name HdrLine_PrintColor_ID */
public static final String COLUMNNAME_HdrLine_PrintColor_ID = "HdrLine_PrintColor_ID";
/** Set Header Row Font.
@param Hdr_PrintFont_ID Header row Font */
public void setHdr_PrintFont_ID (int Hdr_PrintFont_ID)
{
if (Hdr_PrintFont_ID <= 0) set_Value (COLUMNNAME_Hdr_PrintFont_ID, null);
 else 
set_Value (COLUMNNAME_Hdr_PrintFont_ID, Integer.valueOf(Hdr_PrintFont_ID));
}
/** Get Header Row Font.
@return Header row Font */
public int getHdr_PrintFont_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Hdr_PrintFont_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0966c21f-4e82-63cd-dd7c-96671ab04da0")
public static String es_PE_FIELD_PrintTableFormat_HeaderRowFont_Name="Fuente Fila Encabezamiento";

@XendraTrl(Identifier="0966c21f-4e82-63cd-dd7c-96671ab04da0")
public static String es_PE_FIELD_PrintTableFormat_HeaderRowFont_Description="Fuente de la fila de encabezamiento";

@XendraTrl(Identifier="0966c21f-4e82-63cd-dd7c-96671ab04da0")
public static String es_PE_FIELD_PrintTableFormat_HeaderRowFont_Help="Fuente de la fila del encabezamiento de la tabla";

@XendraField(AD_Column_ID="Hdr_PrintFont_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5f791490-7e45-00cf-590f-198eaa26c16d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0966c21f-4e82-63cd-dd7c-96671ab04da0")
public static final String FIELDNAME_PrintTableFormat_HeaderRowFont="0966c21f-4e82-63cd-dd7c-96671ab04da0";

@XendraTrl(Identifier="4c60bc46-7f22-0c22-8220-5aea778c1cc9")
public static String es_PE_COLUMN_Hdr_PrintFont_ID_Name="Fuente Fila Encabezamiento";

@XendraColumn(AD_Element_ID="a95094e2-847f-8283-26a6-fea6b15b24ce",ColumnName="Hdr_PrintFont_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="b6d71c22-8c19-d2cc-36b2-fdb87d405ba2",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="4c60bc46-7f22-0c22-8220-5aea778c1cc9",Synchronized="2019-08-30 22:20:34.0")
/** Column name Hdr_PrintFont_ID */
public static final String COLUMNNAME_Hdr_PrintFont_ID = "Hdr_PrintFont_ID";
/** Set Header Stroke.
@param HdrStroke Width of the Header Line Stroke */
public void setHdrStroke (BigDecimal HdrStroke)
{
set_Value (COLUMNNAME_HdrStroke, HdrStroke);
}
/** Get Header Stroke.
@return Width of the Header Line Stroke */
public BigDecimal getHdrStroke() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_HdrStroke);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="4682c09b-1f58-de3e-ee13-bebea29d7983")
public static String es_PE_FIELD_PrintTableFormat_HeaderStroke_Name="Tamaño Encabezado";

@XendraTrl(Identifier="4682c09b-1f58-de3e-ee13-bebea29d7983")
public static String es_PE_FIELD_PrintTableFormat_HeaderStroke_Description="Anchura del movimiento de la línea del encabezado.";

@XendraTrl(Identifier="4682c09b-1f58-de3e-ee13-bebea29d7983")
public static String es_PE_FIELD_PrintTableFormat_HeaderStroke_Help="La anchura del movimiento de la línea del encabezado (grueso de linea) en puntos.";

@XendraField(AD_Column_ID="HdrStroke",IsCentrallyMaintained=true,
AD_Tab_ID="5f791490-7e45-00cf-590f-198eaa26c16d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsPaintHeaderLines@=Y",DisplayLength=26,IsReadOnly=false,SeqNo=220,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="4682c09b-1f58-de3e-ee13-bebea29d7983")
public static final String FIELDNAME_PrintTableFormat_HeaderStroke="4682c09b-1f58-de3e-ee13-bebea29d7983";

@XendraTrl(Identifier="abb033d0-e290-9b12-4464-840ee31384b4")
public static String es_PE_COLUMN_HdrStroke_Name="Tamaño Encabezado";

@XendraColumn(AD_Element_ID="96b8830b-b26f-08b7-3554-94f02e1761f0",ColumnName="HdrStroke",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="2",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="abb033d0-e290-9b12-4464-840ee31384b4",
Synchronized="2019-08-30 22:20:34.0")
/** Column name HdrStroke */
public static final String COLUMNNAME_HdrStroke = "HdrStroke";
/** Set Header Stroke Type.
@param HdrStrokeType Type of the Header Line Stroke */
public void setHdrStrokeType (String HdrStrokeType)
{
if (HdrStrokeType != null && HdrStrokeType.length() > 1)
{
log.warning("Length > 1 - truncated");
HdrStrokeType = HdrStrokeType.substring(0,0);
}
set_Value (COLUMNNAME_HdrStrokeType, HdrStrokeType);
}
/** Get Header Stroke Type.
@return Type of the Header Line Stroke */
public String getHdrStrokeType() 
{
return (String)get_Value(COLUMNNAME_HdrStrokeType);
}

@XendraTrl(Identifier="55933717-c43e-8013-6778-ef2d64cf5ed4")
public static String es_PE_FIELD_PrintTableFormat_HeaderStrokeType_Name="Tipo Movimiento Encabezado";

@XendraTrl(Identifier="55933717-c43e-8013-6778-ef2d64cf5ed4")
public static String es_PE_FIELD_PrintTableFormat_HeaderStrokeType_Description="Tipo de movimiento de la línea de encabezado.";

@XendraTrl(Identifier="55933717-c43e-8013-6778-ef2d64cf5ed4")
public static String es_PE_FIELD_PrintTableFormat_HeaderStrokeType_Help="Tipo de la línea de impresión.";

@XendraField(AD_Column_ID="HdrStrokeType",IsCentrallyMaintained=true,
AD_Tab_ID="5f791490-7e45-00cf-590f-198eaa26c16d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsPaintHeaderLines@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=210,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="55933717-c43e-8013-6778-ef2d64cf5ed4")
public static final String FIELDNAME_PrintTableFormat_HeaderStrokeType="55933717-c43e-8013-6778-ef2d64cf5ed4";

@XendraTrl(Identifier="99e91cff-4903-56ba-29b9-120263f60a81")
public static String es_PE_COLUMN_HdrStrokeType_Name="Tipo Movimiento Encabezado";

@XendraColumn(AD_Element_ID="2339542f-97ea-06ce-1354-e9cc5681c83d",ColumnName="HdrStrokeType",
AD_Reference_ID=17,AD_Reference_Value_ID="c5c38947-431d-1f7a-0c5d-6c618e6b84fa",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="S",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="99e91cff-4903-56ba-29b9-120263f60a81",Synchronized="2019-08-30 22:20:34.0")
/** Column name HdrStrokeType */
public static final String COLUMNNAME_HdrStrokeType = "HdrStrokeType";
/** Set Header Row BG Color.
@param HdrTextBG_PrintColor_ID Background color of header row */
public void setHdrTextBG_PrintColor_ID (int HdrTextBG_PrintColor_ID)
{
if (HdrTextBG_PrintColor_ID <= 0) set_Value (COLUMNNAME_HdrTextBG_PrintColor_ID, null);
 else 
set_Value (COLUMNNAME_HdrTextBG_PrintColor_ID, Integer.valueOf(HdrTextBG_PrintColor_ID));
}
/** Get Header Row BG Color.
@return Background color of header row */
public int getHdrTextBG_PrintColor_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HdrTextBG_PrintColor_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="949cf1f8-d0d3-2d70-e8d4-05c7e98798d4")
public static String es_PE_FIELD_PrintTableFormat_HeaderRowBGColor_Name="Color BG de la fila de encabezamiento";

@XendraTrl(Identifier="949cf1f8-d0d3-2d70-e8d4-05c7e98798d4")
public static String es_PE_FIELD_PrintTableFormat_HeaderRowBGColor_Description="Color posterior de la línea del encabezamiento";

@XendraTrl(Identifier="949cf1f8-d0d3-2d70-e8d4-05c7e98798d4")
public static String es_PE_FIELD_PrintTableFormat_HeaderRowBGColor_Help="Color posterior de la fila del encabezamiento de la tabla";

@XendraField(AD_Column_ID="HdrTextBG_PrintColor_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5f791490-7e45-00cf-590f-198eaa26c16d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="949cf1f8-d0d3-2d70-e8d4-05c7e98798d4")
public static final String FIELDNAME_PrintTableFormat_HeaderRowBGColor="949cf1f8-d0d3-2d70-e8d4-05c7e98798d4";

@XendraTrl(Identifier="197dc7a4-30af-50a0-69b0-bbeb7914d577")
public static String es_PE_COLUMN_HdrTextBG_PrintColor_ID_Name="Color BG de la fila de encabezamiento";

@XendraColumn(AD_Element_ID="d52c1c3e-3375-733d-64ac-684dec335953",
ColumnName="HdrTextBG_PrintColor_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="a7e43a27-3ce0-e9aa-8f3c-78e2921fc1cd",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="197dc7a4-30af-50a0-69b0-bbeb7914d577",
Synchronized="2019-08-30 22:20:34.0")
/** Column name HdrTextBG_PrintColor_ID */
public static final String COLUMNNAME_HdrTextBG_PrintColor_ID = "HdrTextBG_PrintColor_ID";
/** Set Header Row Color.
@param HdrTextFG_PrintColor_ID Foreground color if the table header row */
public void setHdrTextFG_PrintColor_ID (int HdrTextFG_PrintColor_ID)
{
if (HdrTextFG_PrintColor_ID <= 0) set_Value (COLUMNNAME_HdrTextFG_PrintColor_ID, null);
 else 
set_Value (COLUMNNAME_HdrTextFG_PrintColor_ID, Integer.valueOf(HdrTextFG_PrintColor_ID));
}
/** Get Header Row Color.
@return Foreground color if the table header row */
public int getHdrTextFG_PrintColor_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HdrTextFG_PrintColor_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="56f3f13c-f33c-0f9f-4847-16de87273502")
public static String es_PE_FIELD_PrintTableFormat_HeaderRowColor_Name="Color de la fila de encabezamiento";

@XendraTrl(Identifier="56f3f13c-f33c-0f9f-4847-16de87273502")
public static String es_PE_FIELD_PrintTableFormat_HeaderRowColor_Description="Color anterior de la línea del encabezamiento";

@XendraTrl(Identifier="56f3f13c-f33c-0f9f-4847-16de87273502")
public static String es_PE_FIELD_PrintTableFormat_HeaderRowColor_Help="Color anterior de la fila del encabezamiento de la tabla";

@XendraField(AD_Column_ID="HdrTextFG_PrintColor_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5f791490-7e45-00cf-590f-198eaa26c16d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="56f3f13c-f33c-0f9f-4847-16de87273502")
public static final String FIELDNAME_PrintTableFormat_HeaderRowColor="56f3f13c-f33c-0f9f-4847-16de87273502";

@XendraTrl(Identifier="e04cbbdb-0a3e-12db-6d51-9cdd05be9583")
public static String es_PE_COLUMN_HdrTextFG_PrintColor_ID_Name="Color de la fila de encabezamiento";

@XendraColumn(AD_Element_ID="bb47fef5-f236-f60e-9d79-45d58092b758",
ColumnName="HdrTextFG_PrintColor_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="a7e43a27-3ce0-e9aa-8f3c-78e2921fc1cd",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="e04cbbdb-0a3e-12db-6d51-9cdd05be9583",
Synchronized="2019-08-30 22:20:34.0")
/** Column name HdrTextFG_PrintColor_ID */
public static final String COLUMNNAME_HdrTextFG_PrintColor_ID = "HdrTextFG_PrintColor_ID";
/** Set Header Center.
@param HeaderCenter Content of the center portion of the header. */
public void setHeaderCenter (String HeaderCenter)
{
if (HeaderCenter != null && HeaderCenter.length() > 255)
{
log.warning("Length > 255 - truncated");
HeaderCenter = HeaderCenter.substring(0,254);
}
set_Value (COLUMNNAME_HeaderCenter, HeaderCenter);
}
/** Get Header Center.
@return Content of the center portion of the header. */
public String getHeaderCenter() 
{
String value = (String)get_Value(COLUMNNAME_HeaderCenter);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="e2adec78-2b0f-23d2-eb9a-80775622d6ec")
public static String es_PE_FIELD_PrintTableFormat_HeaderCenter_Name="Cabecera Centrada";

@XendraTrl(Identifier="e2adec78-2b0f-23d2-eb9a-80775622d6ec")
public static String es_PE_FIELD_PrintTableFormat_HeaderCenter_Description="Contenido de la porción de la cabecera centrada";

@XendraField(AD_Column_ID="HeaderCenter",IsCentrallyMaintained=true,
AD_Tab_ID="5f791490-7e45-00cf-590f-198eaa26c16d",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=20,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e2adec78-2b0f-23d2-eb9a-80775622d6ec")
public static final String FIELDNAME_PrintTableFormat_HeaderCenter="e2adec78-2b0f-23d2-eb9a-80775622d6ec";

@XendraTrl(Identifier="86e696bd-4f96-adf6-18ea-4a2f6e87009d")
public static String es_PE_COLUMN_HeaderCenter_Name="Cabecera Centrada";

@XendraColumn(AD_Element_ID="8bb5f8cf-220b-de1b-2101-00c9cf321004",ColumnName="HeaderCenter",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="86e696bd-4f96-adf6-18ea-4a2f6e87009d",
Synchronized="2019-08-30 22:20:34.0")
/** Column name HeaderCenter */
public static final String COLUMNNAME_HeaderCenter = "HeaderCenter";
/** Set Header Left.
@param HeaderLeft Content of the left portion of the header. */
public void setHeaderLeft (String HeaderLeft)
{
if (HeaderLeft != null && HeaderLeft.length() > 255)
{
log.warning("Length > 255 - truncated");
HeaderLeft = HeaderLeft.substring(0,254);
}
set_Value (COLUMNNAME_HeaderLeft, HeaderLeft);
}
/** Get Header Left.
@return Content of the left portion of the header. */
public String getHeaderLeft() 
{
String value = (String)get_Value(COLUMNNAME_HeaderLeft);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="ca173296-a949-bad6-a2e4-2a56ff91d1f8")
public static String es_PE_FIELD_PrintTableFormat_HeaderLeft_Name="Cabecera Izquierda";

@XendraTrl(Identifier="ca173296-a949-bad6-a2e4-2a56ff91d1f8")
public static String es_PE_FIELD_PrintTableFormat_HeaderLeft_Description="Contenido de la porción de la cabecera izquierda";

@XendraField(AD_Column_ID="HeaderLeft",IsCentrallyMaintained=true,
AD_Tab_ID="5f791490-7e45-00cf-590f-198eaa26c16d",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ca173296-a949-bad6-a2e4-2a56ff91d1f8")
public static final String FIELDNAME_PrintTableFormat_HeaderLeft="ca173296-a949-bad6-a2e4-2a56ff91d1f8";

@XendraTrl(Identifier="f9a2430e-3e49-0943-b336-fdce3282c89c")
public static String es_PE_COLUMN_HeaderLeft_Name="Cabecera Izquierda";

@XendraColumn(AD_Element_ID="660216ef-86f9-abeb-b64a-3c23962491cb",ColumnName="HeaderLeft",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f9a2430e-3e49-0943-b336-fdce3282c89c",
Synchronized="2019-08-30 22:20:34.0")
/** Column name HeaderLeft */
public static final String COLUMNNAME_HeaderLeft = "HeaderLeft";
/** Set Header Right.
@param HeaderRight Content of the right portion of the header. */
public void setHeaderRight (String HeaderRight)
{
if (HeaderRight != null && HeaderRight.length() > 255)
{
log.warning("Length > 255 - truncated");
HeaderRight = HeaderRight.substring(0,254);
}
set_Value (COLUMNNAME_HeaderRight, HeaderRight);
}
/** Get Header Right.
@return Content of the right portion of the header. */
public String getHeaderRight() 
{
String value = (String)get_Value(COLUMNNAME_HeaderRight);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="8a891205-b949-17be-60f7-5a3c2988bb76")
public static String es_PE_FIELD_PrintTableFormat_HeaderRight_Name="Cabecera Dercha";

@XendraTrl(Identifier="8a891205-b949-17be-60f7-5a3c2988bb76")
public static String es_PE_FIELD_PrintTableFormat_HeaderRight_Description="Contenido de la porción de la cabecera derecha";

@XendraField(AD_Column_ID="HeaderRight",IsCentrallyMaintained=true,
AD_Tab_ID="5f791490-7e45-00cf-590f-198eaa26c16d",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8a891205-b949-17be-60f7-5a3c2988bb76")
public static final String FIELDNAME_PrintTableFormat_HeaderRight="8a891205-b949-17be-60f7-5a3c2988bb76";

@XendraTrl(Identifier="55cc68b2-02ce-6060-0035-45b290b85dcc")
public static String es_PE_COLUMN_HeaderRight_Name="Cabecera Dercha";

@XendraColumn(AD_Element_ID="eeef07d0-c805-07da-2546-5c78e45a8520",ColumnName="HeaderRight",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="55cc68b2-02ce-6060-0035-45b290b85dcc",
Synchronized="2019-08-30 22:20:34.0")
/** Column name HeaderRight */
public static final String COLUMNNAME_HeaderRight = "HeaderRight";
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
@XendraTrl(Identifier="aa70500f-b950-4a5a-ac00-9a9eb0a2c642")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="aa70500f-b950-4a5a-ac00-9a9eb0a2c642",
Synchronized="2019-08-30 22:20:34.0")
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

@XendraTrl(Identifier="04e2c09a-58d9-3aca-c319-44f49bbb0203")
public static String es_PE_FIELD_PrintTableFormat_ImageAttached_Name="Imagen Adjunta";

@XendraTrl(Identifier="04e2c09a-58d9-3aca-c319-44f49bbb0203")
public static String es_PE_FIELD_PrintTableFormat_ImageAttached_Description="La imagen a ser impresa esta adjunta al registro";

@XendraTrl(Identifier="04e2c09a-58d9-3aca-c319-44f49bbb0203")
public static String es_PE_FIELD_PrintTableFormat_ImageAttached_Help="La imagen a ser impresa está guardada en la base de datos como un documento adjunto al registro. La imagen puede ser gif; jpeg ó png.";

@XendraField(AD_Column_ID="ImageIsAttached",IsCentrallyMaintained=true,
AD_Tab_ID="5f791490-7e45-00cf-590f-198eaa26c16d",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="04e2c09a-58d9-3aca-c319-44f49bbb0203")
public static final String FIELDNAME_PrintTableFormat_ImageAttached="04e2c09a-58d9-3aca-c319-44f49bbb0203";

@XendraTrl(Identifier="5801d229-eb10-e536-bea7-a2c38ab413b1")
public static String es_PE_COLUMN_ImageIsAttached_Name="Imagen Adjunta";

@XendraColumn(AD_Element_ID="9deba469-7f61-a9cb-235c-e59cec5b1f36",ColumnName="ImageIsAttached",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5801d229-eb10-e536-bea7-a2c38ab413b1",
Synchronized="2019-08-30 22:20:34.0")
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
@XendraTrl(Identifier="d249e4d4-9b15-626f-ed52-8bc688b17e14")
public static String es_PE_FIELD_PrintTableFormat_ImageURL_Name="URL de la Imagen";

@XendraTrl(Identifier="d249e4d4-9b15-626f-ed52-8bc688b17e14")
public static String es_PE_FIELD_PrintTableFormat_ImageURL_Description="URL de la estructura de la imagen";

@XendraTrl(Identifier="d249e4d4-9b15-626f-ed52-8bc688b17e14")
public static String es_PE_FIELD_PrintTableFormat_ImageURL_Help="URL de imagen de la textura; La imagen no se almacena en la base de datos; ";

@XendraField(AD_Column_ID="ImageURL",IsCentrallyMaintained=true,
AD_Tab_ID="5f791490-7e45-00cf-590f-198eaa26c16d",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d249e4d4-9b15-626f-ed52-8bc688b17e14")
public static final String FIELDNAME_PrintTableFormat_ImageURL="d249e4d4-9b15-626f-ed52-8bc688b17e14";

@XendraTrl(Identifier="772f3f17-9518-0b82-bca8-55d5319c6993")
public static String es_PE_COLUMN_ImageURL_Name="URL de la Imagen";

@XendraColumn(AD_Element_ID="fe037607-f5d9-d969-d6e5-eb1f94c10e5e",ColumnName="ImageURL",
AD_Reference_ID=40,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="772f3f17-9518-0b82-bca8-55d5319c6993",
Synchronized="2019-08-30 22:20:34.0")
/** Column name ImageURL */
public static final String COLUMNNAME_ImageURL = "ImageURL";
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

@XendraTrl(Identifier="13f9a441-17e7-e0fe-b4ab-b50c5b3da691")
public static String es_PE_FIELD_PrintTableFormat_Default_Name="Predeterminado";

@XendraTrl(Identifier="13f9a441-17e7-e0fe-b4ab-b50c5b3da691")
public static String es_PE_FIELD_PrintTableFormat_Default_Description="Valor Predeterminado";

@XendraTrl(Identifier="13f9a441-17e7-e0fe-b4ab-b50c5b3da691")
public static String es_PE_FIELD_PrintTableFormat_Default_Help="El cuadro de verificación indica si este registro será usado como un valor predeterminado";

@XendraField(AD_Column_ID="IsDefault",IsCentrallyMaintained=true,
AD_Tab_ID="5f791490-7e45-00cf-590f-198eaa26c16d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="13f9a441-17e7-e0fe-b4ab-b50c5b3da691")
public static final String FIELDNAME_PrintTableFormat_Default="13f9a441-17e7-e0fe-b4ab-b50c5b3da691";

@XendraTrl(Identifier="248b8f49-398f-6517-02d7-dbf642de8d13")
public static String es_PE_COLUMN_IsDefault_Name="Predeterminado";

@XendraColumn(AD_Element_ID="8617f892-e113-a5fd-8715-687f792f136c",ColumnName="IsDefault",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="248b8f49-398f-6517-02d7-dbf642de8d13",
Synchronized="2019-08-30 22:20:34.0")
/** Column name IsDefault */
public static final String COLUMNNAME_IsDefault = "IsDefault";
/** Set isMultiLineHeader.
@param isMultiLineHeader isMultiLineHeader */
public void setisMultiLineHeader (boolean isMultiLineHeader)
{
set_Value (COLUMNNAME_isMultiLineHeader, Boolean.valueOf(isMultiLineHeader));
}
/** Get isMultiLineHeader.
@return isMultiLineHeader */
public boolean isMultiLineHeader() 
{
Object oo = get_Value(COLUMNNAME_isMultiLineHeader);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="f004b590-97eb-1c05-b38e-c31824149263")
public static String es_PE_COLUMN_isMultiLineHeader_Name="ismultilineheader";

@XendraColumn(AD_Element_ID="9a6e6a8b-ef17-9841-b02a-5f396625a5d9",ColumnName="isMultiLineHeader",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f004b590-97eb-1c05-b38e-c31824149263",
Synchronized="2019-08-30 22:20:34.0")
/** Column name isMultiLineHeader */
public static final String COLUMNNAME_isMultiLineHeader = "isMultiLineHeader";
/** Set Paint Boundary Lines.
@param IsPaintBoundaryLines Paint table boundary lines */
public void setIsPaintBoundaryLines (boolean IsPaintBoundaryLines)
{
set_Value (COLUMNNAME_IsPaintBoundaryLines, Boolean.valueOf(IsPaintBoundaryLines));
}
/** Get Paint Boundary Lines.
@return Paint table boundary lines */
public boolean isPaintBoundaryLines() 
{
Object oo = get_Value(COLUMNNAME_IsPaintBoundaryLines);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="d692d161-4c1a-0a95-28f1-8c84259808c1")
public static String es_PE_FIELD_PrintTableFormat_PaintBoundaryLines_Name="Pintar Líneas de Limite";

@XendraTrl(Identifier="d692d161-4c1a-0a95-28f1-8c84259808c1")
public static String es_PE_FIELD_PrintTableFormat_PaintBoundaryLines_Description="Pintar líneas de limite de la tabla";

@XendraTrl(Identifier="d692d161-4c1a-0a95-28f1-8c84259808c1")
public static String es_PE_FIELD_PrintTableFormat_PaintBoundaryLines_Help="Pintar líneas alrededor de la tabla";

@XendraField(AD_Column_ID="IsPaintBoundaryLines",IsCentrallyMaintained=true,
AD_Tab_ID="5f791490-7e45-00cf-590f-198eaa26c16d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=250,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d692d161-4c1a-0a95-28f1-8c84259808c1")
public static final String FIELDNAME_PrintTableFormat_PaintBoundaryLines="d692d161-4c1a-0a95-28f1-8c84259808c1";

@XendraTrl(Identifier="5c240a00-5494-d863-0ce8-75a863f5561e")
public static String es_PE_COLUMN_IsPaintBoundaryLines_Name="Pintar Líneas de Limite";

@XendraColumn(AD_Element_ID="82ea1d45-51d9-6f86-8644-605f19efa3ba",
ColumnName="IsPaintBoundaryLines",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="5c240a00-5494-d863-0ce8-75a863f5561e",Synchronized="2019-08-30 22:20:34.0")
/** Column name IsPaintBoundaryLines */
public static final String COLUMNNAME_IsPaintBoundaryLines = "IsPaintBoundaryLines";
/** Set Paint Header Lines.
@param IsPaintHeaderLines Paint Lines over/under the Header Line  */
public void setIsPaintHeaderLines (boolean IsPaintHeaderLines)
{
set_Value (COLUMNNAME_IsPaintHeaderLines, Boolean.valueOf(IsPaintHeaderLines));
}
/** Get Paint Header Lines.
@return Paint Lines over/under the Header Line  */
public boolean isPaintHeaderLines() 
{
Object oo = get_Value(COLUMNNAME_IsPaintHeaderLines);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="47f8cc53-c09f-6dea-a630-2dc6bb6271dc")
public static String es_PE_FIELD_PrintTableFormat_PaintHeaderLines_Name="Pinta Línea de Encabezado";

@XendraTrl(Identifier="47f8cc53-c09f-6dea-a630-2dc6bb6271dc")
public static String es_PE_FIELD_PrintTableFormat_PaintHeaderLines_Description="Pinta línea sobre/debajo de línea de encabezado. ";

@XendraTrl(Identifier="47f8cc53-c09f-6dea-a630-2dc6bb6271dc")
public static String es_PE_FIELD_PrintTableFormat_PaintHeaderLines_Help="Si Selecciona, una línea es pintada por debajo ó por arriba de la línea de encabezado usando la información de movimiento.";

@XendraField(AD_Column_ID="IsPaintHeaderLines",IsCentrallyMaintained=true,
AD_Tab_ID="5f791490-7e45-00cf-590f-198eaa26c16d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="47f8cc53-c09f-6dea-a630-2dc6bb6271dc")
public static final String FIELDNAME_PrintTableFormat_PaintHeaderLines="47f8cc53-c09f-6dea-a630-2dc6bb6271dc";

@XendraTrl(Identifier="3d1ee26f-bf28-7aaf-dc92-b2f459420469")
public static String es_PE_COLUMN_IsPaintHeaderLines_Name="Pinta Línea de Encabezado";

@XendraColumn(AD_Element_ID="71f4303e-eb18-0360-6628-e57845d2264b",ColumnName="IsPaintHeaderLines",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3d1ee26f-bf28-7aaf-dc92-b2f459420469",
Synchronized="2019-08-30 22:20:34.0")
/** Column name IsPaintHeaderLines */
public static final String COLUMNNAME_IsPaintHeaderLines = "IsPaintHeaderLines";
/** Set Paint Horizontal Lines.
@param IsPaintHLines Paint horizontal lines */
public void setIsPaintHLines (boolean IsPaintHLines)
{
set_Value (COLUMNNAME_IsPaintHLines, Boolean.valueOf(IsPaintHLines));
}
/** Get Paint Horizontal Lines.
@return Paint horizontal lines */
public boolean isPaintHLines() 
{
Object oo = get_Value(COLUMNNAME_IsPaintHLines);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="58ea9db3-d52f-f67a-1b7b-213409329c61")
public static String es_PE_FIELD_PrintTableFormat_PaintHorizontalLines_Name="Pintar Líneas H";

@XendraTrl(Identifier="58ea9db3-d52f-f67a-1b7b-213409329c61")
public static String es_PE_FIELD_PrintTableFormat_PaintHorizontalLines_Description="Pintar lineas horizontales";

@XendraTrl(Identifier="58ea9db3-d52f-f67a-1b7b-213409329c61")
public static String es_PE_FIELD_PrintTableFormat_PaintHorizontalLines_Help="Pintar líneas horizontales en la tabla";

@XendraField(AD_Column_ID="IsPaintHLines",IsCentrallyMaintained=true,
AD_Tab_ID="5f791490-7e45-00cf-590f-198eaa26c16d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="58ea9db3-d52f-f67a-1b7b-213409329c61")
public static final String FIELDNAME_PrintTableFormat_PaintHorizontalLines="58ea9db3-d52f-f67a-1b7b-213409329c61";

@XendraTrl(Identifier="63fafd20-39af-2485-ce5e-d7f450c01ada")
public static String es_PE_COLUMN_IsPaintHLines_Name="Pintar Líneas H";

@XendraColumn(AD_Element_ID="152f6c03-a56b-fd34-99bd-7d3f979efae6",ColumnName="IsPaintHLines",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="63fafd20-39af-2485-ce5e-d7f450c01ada",
Synchronized="2019-08-30 22:20:34.0")
/** Column name IsPaintHLines */
public static final String COLUMNNAME_IsPaintHLines = "IsPaintHLines";
/** Set Paint Vertical Lines.
@param IsPaintVLines Paint vertical lines */
public void setIsPaintVLines (boolean IsPaintVLines)
{
set_Value (COLUMNNAME_IsPaintVLines, Boolean.valueOf(IsPaintVLines));
}
/** Get Paint Vertical Lines.
@return Paint vertical lines */
public boolean isPaintVLines() 
{
Object oo = get_Value(COLUMNNAME_IsPaintVLines);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="331902c4-99df-2c17-097b-4139f0097a33")
public static String es_PE_FIELD_PrintTableFormat_PaintVerticalLines_Name="Pintar Líneas V";

@XendraTrl(Identifier="331902c4-99df-2c17-097b-4139f0097a33")
public static String es_PE_FIELD_PrintTableFormat_PaintVerticalLines_Description="Pintar líneas verticales";

@XendraTrl(Identifier="331902c4-99df-2c17-097b-4139f0097a33")
public static String es_PE_FIELD_PrintTableFormat_PaintVerticalLines_Help="Pintar líneas verticales en la tabla";

@XendraField(AD_Column_ID="IsPaintVLines",IsCentrallyMaintained=true,
AD_Tab_ID="5f791490-7e45-00cf-590f-198eaa26c16d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="331902c4-99df-2c17-097b-4139f0097a33")
public static final String FIELDNAME_PrintTableFormat_PaintVerticalLines="331902c4-99df-2c17-097b-4139f0097a33";

@XendraTrl(Identifier="adddef38-9a7a-52ee-3f7d-5d7244ebcf1f")
public static String es_PE_COLUMN_IsPaintVLines_Name="Pintar Líneas V";

@XendraColumn(AD_Element_ID="a5a09512-14fb-5e5e-15ad-eabf79e723e4",ColumnName="IsPaintVLines",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="adddef38-9a7a-52ee-3f7d-5d7244ebcf1f",
Synchronized="2019-08-30 22:20:34.0")
/** Column name IsPaintVLines */
public static final String COLUMNNAME_IsPaintVLines = "IsPaintVLines";
/** Set Print Function Symbols.
@param IsPrintFunctionSymbols Print Symbols for Functions (Sum, Average, Count) */
public void setIsPrintFunctionSymbols (boolean IsPrintFunctionSymbols)
{
set_Value (COLUMNNAME_IsPrintFunctionSymbols, Boolean.valueOf(IsPrintFunctionSymbols));
}
/** Get Print Function Symbols.
@return Print Symbols for Functions (Sum, Average, Count) */
public boolean isPrintFunctionSymbols() 
{
Object oo = get_Value(COLUMNNAME_IsPrintFunctionSymbols);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="dd6661fb-f235-2c01-3e1c-b3d1c433a0c2")
public static String es_PE_FIELD_PrintTableFormat_PrintFunctionSymbols_Name="Imprimir Símbolos de Función";

@XendraTrl(Identifier="dd6661fb-f235-2c01-3e1c-b3d1c433a0c2")
public static String es_PE_FIELD_PrintTableFormat_PrintFunctionSymbols_Description="Imprimir símbolos de funciones (Suma; Promedio; Conteo)";

@XendraTrl(Identifier="dd6661fb-f235-2c01-3e1c-b3d1c433a0c2")
public static String es_PE_FIELD_PrintTableFormat_PrintFunctionSymbols_Help="Si se selecciona; imprime los símbolos - de otra manera imprime los nombres de las funciones.";

@XendraField(AD_Column_ID="IsPrintFunctionSymbols",IsCentrallyMaintained=true,
AD_Tab_ID="5f791490-7e45-00cf-590f-198eaa26c16d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=290,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dd6661fb-f235-2c01-3e1c-b3d1c433a0c2")
public static final String FIELDNAME_PrintTableFormat_PrintFunctionSymbols="dd6661fb-f235-2c01-3e1c-b3d1c433a0c2";

@XendraTrl(Identifier="023adc3a-535a-3cce-acb9-4dc2bcbaae57")
public static String es_PE_COLUMN_IsPrintFunctionSymbols_Name="Imprimir Símbolos de Función";

@XendraColumn(AD_Element_ID="357bb3b3-68e0-d9f0-9ece-a56f82556169",
ColumnName="IsPrintFunctionSymbols",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="023adc3a-535a-3cce-acb9-4dc2bcbaae57",Synchronized="2019-08-30 22:20:35.0")
/** Column name IsPrintFunctionSymbols */
public static final String COLUMNNAME_IsPrintFunctionSymbols = "IsPrintFunctionSymbols";
/** Set Line Color.
@param Line_PrintColor_ID Table line color */
public void setLine_PrintColor_ID (int Line_PrintColor_ID)
{
if (Line_PrintColor_ID <= 0) set_Value (COLUMNNAME_Line_PrintColor_ID, null);
 else 
set_Value (COLUMNNAME_Line_PrintColor_ID, Integer.valueOf(Line_PrintColor_ID));
}
/** Get Line Color.
@return Table line color */
public int getLine_PrintColor_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Line_PrintColor_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="70a4b9af-6bb4-ad59-ea41-b49ecfb21613")
public static String es_PE_FIELD_PrintTableFormat_LineColor_Name="Color de Líneas";

@XendraTrl(Identifier="70a4b9af-6bb4-ad59-ea41-b49ecfb21613")
public static String es_PE_FIELD_PrintTableFormat_LineColor_Description="Color de las líneas de la tabla";

@XendraField(AD_Column_ID="Line_PrintColor_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5f791490-7e45-00cf-590f-198eaa26c16d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=260,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="70a4b9af-6bb4-ad59-ea41-b49ecfb21613")
public static final String FIELDNAME_PrintTableFormat_LineColor="70a4b9af-6bb4-ad59-ea41-b49ecfb21613";

@XendraTrl(Identifier="98524997-a015-031d-2eed-e61305e4da7b")
public static String es_PE_COLUMN_Line_PrintColor_ID_Name="Color de Líneas";

@XendraColumn(AD_Element_ID="40999869-38ca-3917-72c2-cc98f6b40d37",ColumnName="Line_PrintColor_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="a7e43a27-3ce0-e9aa-8f3c-78e2921fc1cd",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="98524997-a015-031d-2eed-e61305e4da7b",Synchronized="2019-08-30 22:20:35.0")
/** Column name Line_PrintColor_ID */
public static final String COLUMNNAME_Line_PrintColor_ID = "Line_PrintColor_ID";
/** Set Line Stroke.
@param LineStroke Width of the Line Stroke */
public void setLineStroke (BigDecimal LineStroke)
{
set_Value (COLUMNNAME_LineStroke, LineStroke);
}
/** Get Line Stroke.
@return Width of the Line Stroke */
public BigDecimal getLineStroke() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_LineStroke);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="eaadb592-6deb-a96f-2d5f-5bef11197253")
public static String es_PE_FIELD_PrintTableFormat_LineStroke_Name="Ancho de la Línea Mvto";

@XendraTrl(Identifier="eaadb592-6deb-a96f-2d5f-5bef11197253")
public static String es_PE_FIELD_PrintTableFormat_LineStroke_Description="Ancho de la Línea Mvto";

@XendraTrl(Identifier="eaadb592-6deb-a96f-2d5f-5bef11197253")
public static String es_PE_FIELD_PrintTableFormat_LineStroke_Help="El Ancho de la línea de Mvto (linea seleccionada) en puntos.";

@XendraField(AD_Column_ID="LineStroke",IsCentrallyMaintained=true,
AD_Tab_ID="5f791490-7e45-00cf-590f-198eaa26c16d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=280,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="eaadb592-6deb-a96f-2d5f-5bef11197253")
public static final String FIELDNAME_PrintTableFormat_LineStroke="eaadb592-6deb-a96f-2d5f-5bef11197253";

@XendraTrl(Identifier="da58e715-edac-b112-6c98-99ed77abe5f8")
public static String es_PE_COLUMN_LineStroke_Name="Ancho de la Línea Mvto";

@XendraColumn(AD_Element_ID="c000819a-0ae0-626c-b571-8d35da2cde20",ColumnName="LineStroke",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="1",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="da58e715-edac-b112-6c98-99ed77abe5f8",
Synchronized="2019-08-30 22:20:35.0")
/** Column name LineStroke */
public static final String COLUMNNAME_LineStroke = "LineStroke";
/** Set Line Stroke Type.
@param LineStrokeType Type of the Line Stroke */
public void setLineStrokeType (String LineStrokeType)
{
if (LineStrokeType != null && LineStrokeType.length() > 1)
{
log.warning("Length > 1 - truncated");
LineStrokeType = LineStrokeType.substring(0,0);
}
set_Value (COLUMNNAME_LineStrokeType, LineStrokeType);
}
/** Get Line Stroke Type.
@return Type of the Line Stroke */
public String getLineStrokeType() 
{
return (String)get_Value(COLUMNNAME_LineStrokeType);
}

@XendraTrl(Identifier="c9283505-47c1-2367-75a7-3ae96ee8ce84")
public static String es_PE_FIELD_PrintTableFormat_LineStrokeType_Name="Item de tipo de movimiento";

@XendraTrl(Identifier="c9283505-47c1-2367-75a7-3ae96ee8ce84")
public static String es_PE_FIELD_PrintTableFormat_LineStrokeType_Description="Item de tipo de movimiento";

@XendraTrl(Identifier="c9283505-47c1-2367-75a7-3ae96ee8ce84")
public static String es_PE_FIELD_PrintTableFormat_LineStrokeType_Help="Tipo de la Item impreso";

@XendraField(AD_Column_ID="LineStrokeType",IsCentrallyMaintained=true,
AD_Tab_ID="5f791490-7e45-00cf-590f-198eaa26c16d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=270,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c9283505-47c1-2367-75a7-3ae96ee8ce84")
public static final String FIELDNAME_PrintTableFormat_LineStrokeType="c9283505-47c1-2367-75a7-3ae96ee8ce84";

@XendraTrl(Identifier="22043ff6-eaad-9c22-59c4-8e16c95c384e")
public static String es_PE_COLUMN_LineStrokeType_Name="Línea de tipo de movimiento";

@XendraColumn(AD_Element_ID="96f0a5f4-88c4-84a3-d6b6-54b51fc7eb15",ColumnName="LineStrokeType",
AD_Reference_ID=17,AD_Reference_Value_ID="c5c38947-431d-1f7a-0c5d-6c618e6b84fa",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="S",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="22043ff6-eaad-9c22-59c4-8e16c95c384e",Synchronized="2019-08-30 22:20:35.0")
/** Column name LineStrokeType */
public static final String COLUMNNAME_LineStrokeType = "LineStrokeType";
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

@XendraTrl(Identifier="ae8a13b4-a108-f9d3-fa9e-5d3b6966dbc6")
public static String es_PE_FIELD_PrintTableFormat_Name_Name="Nombre";

@XendraTrl(Identifier="ae8a13b4-a108-f9d3-fa9e-5d3b6966dbc6")
public static String es_PE_FIELD_PrintTableFormat_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="ae8a13b4-a108-f9d3-fa9e-5d3b6966dbc6")
public static String es_PE_FIELD_PrintTableFormat_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="5f791490-7e45-00cf-590f-198eaa26c16d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=120,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ae8a13b4-a108-f9d3-fa9e-5d3b6966dbc6")
public static final String FIELDNAME_PrintTableFormat_Name="ae8a13b4-a108-f9d3-fa9e-5d3b6966dbc6";

@XendraTrl(Identifier="acdb0beb-65f4-8365-b73b-b2f67b11a556")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="acdb0beb-65f4-8365-b73b-b2f67b11a556",
Synchronized="2019-08-30 22:20:35.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
}
