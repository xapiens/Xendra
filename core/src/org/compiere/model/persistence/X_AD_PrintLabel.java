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
/** Generated Model for AD_PrintLabel
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_PrintLabel extends PO
{
/** Standard Constructor
@param ctx context
@param AD_PrintLabel_ID id
@param trxName transaction
*/
public X_AD_PrintLabel (Properties ctx, int AD_PrintLabel_ID, String trxName)
{
super (ctx, AD_PrintLabel_ID, trxName);
/** if (AD_PrintLabel_ID == 0)
{
setAD_LabelPrinter_ID (0);
setAD_PrintLabel_ID (0);
setAD_Table_ID (0);
setIsLandscape (false);	
// N
setLabelHeight (0);
setLabelWidth (0);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_PrintLabel (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=570 */
public static int Table_ID=MTable.getTable_ID("AD_PrintLabel");

@XendraTrl(Identifier="54601a3b-4a34-f2d8-48d5-65dbeeceb5be")
public static String es_PE_TAB_Label_Description="Etiqueta de la impresión";

@XendraTrl(Identifier="54601a3b-4a34-f2d8-48d5-65dbeeceb5be")
public static String es_PE_TAB_Label_Name="Etiqueta";

@XendraTrl(Identifier="54601a3b-4a34-f2d8-48d5-65dbeeceb5be")
public static String es_PE_TAB_Label_Help="Mantener el formato para etiquetas de impresión";

@XendraTab(Name="Label",Description="Print Label",Help="Maintain the Format for printing Labels",
AD_Window_ID="f9dedcb3-64b8-9e14-5fb5-6cd892b7e3aa",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="54601a3b-4a34-f2d8-48d5-65dbeeceb5be",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Label="54601a3b-4a34-f2d8-48d5-65dbeeceb5be";

@XendraTrl(Identifier="a682475b-5ea8-7ade-1678-4fb94afb0d60")
public static String es_PE_TABLE_AD_PrintLabel_Name="Etiqueta Impresión";

@XendraTable(Name="Print Label",Description="Label Format to print",Help="",
TableName="AD_PrintLabel",AccessLevel="6",AD_Window_ID="f9dedcb3-64b8-9e14-5fb5-6cd892b7e3aa",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=135,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="a682475b-5ea8-7ade-1678-4fb94afb0d60",Synchronized="2017-08-16 11:40:48.0")
/** TableName=AD_PrintLabel */
public static final String Table_Name="AD_PrintLabel";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_PrintLabel");

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
    Table_ID = MTable.getTable_ID("AD_PrintLabel");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_PrintLabel[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Label printer.
@param AD_LabelPrinter_ID Label Printer Definition */
public void setAD_LabelPrinter_ID (int AD_LabelPrinter_ID)
{
if (AD_LabelPrinter_ID < 1) throw new IllegalArgumentException ("AD_LabelPrinter_ID is mandatory.");
set_Value (COLUMNNAME_AD_LabelPrinter_ID, Integer.valueOf(AD_LabelPrinter_ID));
}
/** Get Label printer.
@return Label Printer Definition */
public int getAD_LabelPrinter_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_LabelPrinter_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9713492c-860c-ee99-3b03-1f4cd9761b92")
public static String es_PE_FIELD_Label_LabelPrinter_Description="Definición de la impresión de la etiqueta";

@XendraTrl(Identifier="9713492c-860c-ee99-3b03-1f4cd9761b92")
public static String es_PE_FIELD_Label_LabelPrinter_Name="Impresión de Etiqueta";

@XendraField(AD_Column_ID="AD_LabelPrinter_ID",IsCentrallyMaintained=true,
AD_Tab_ID="54601a3b-4a34-f2d8-48d5-65dbeeceb5be",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9713492c-860c-ee99-3b03-1f4cd9761b92")
public static final String FIELDNAME_Label_LabelPrinter="9713492c-860c-ee99-3b03-1f4cd9761b92";

@XendraTrl(Identifier="e9665aeb-9e0f-5335-adf0-b82b1947f0df")
public static String es_PE_COLUMN_AD_LabelPrinter_ID_Name="Impresión de Etiqueta";

@XendraColumn(AD_Element_ID="5f02d45a-9966-d879-3ceb-09c4575649c5",ColumnName="AD_LabelPrinter_ID",
AD_Reference_ID=13,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e9665aeb-9e0f-5335-adf0-b82b1947f0df",
Synchronized="2017-08-05 16:52:43.0")
/** Column name AD_LabelPrinter_ID */
public static final String COLUMNNAME_AD_LabelPrinter_ID = "AD_LabelPrinter_ID";
/** Set Print Label.
@param AD_PrintLabel_ID Label Format to print */
public void setAD_PrintLabel_ID (int AD_PrintLabel_ID)
{
if (AD_PrintLabel_ID < 1) throw new IllegalArgumentException ("AD_PrintLabel_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_PrintLabel_ID, Integer.valueOf(AD_PrintLabel_ID));
}
/** Get Print Label.
@return Label Format to print */
public int getAD_PrintLabel_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_PrintLabel_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2ef2757f-0f8b-c3cf-7948-8e1012373ca5")
public static String es_PE_FIELD_Label_PrintLabel_Description="Formato de la etiqueta a imprimir";

@XendraTrl(Identifier="2ef2757f-0f8b-c3cf-7948-8e1012373ca5")
public static String es_PE_FIELD_Label_PrintLabel_Help="Formato para imprimir etiqueta";

@XendraTrl(Identifier="2ef2757f-0f8b-c3cf-7948-8e1012373ca5")
public static String es_PE_FIELD_Label_PrintLabel_Name="Etiqueta Impresión";

@XendraField(AD_Column_ID="AD_PrintLabel_ID",IsCentrallyMaintained=true,
AD_Tab_ID="54601a3b-4a34-f2d8-48d5-65dbeeceb5be",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2ef2757f-0f8b-c3cf-7948-8e1012373ca5")
public static final String FIELDNAME_Label_PrintLabel="2ef2757f-0f8b-c3cf-7948-8e1012373ca5";
/** Column name AD_PrintLabel_ID */
public static final String COLUMNNAME_AD_PrintLabel_ID = "AD_PrintLabel_ID";
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

@XendraTrl(Identifier="ac03a9da-7c0d-b2d6-2989-8b086d447648")
public static String es_PE_FIELD_Label_Table_Description="Tabla para los campos";

@XendraTrl(Identifier="ac03a9da-7c0d-b2d6-2989-8b086d447648")
public static String es_PE_FIELD_Label_Table_Help="La Tabla indica una tabla en la que reside un campo ó campos.";

@XendraTrl(Identifier="ac03a9da-7c0d-b2d6-2989-8b086d447648")
public static String es_PE_FIELD_Label_Table_Name="Tabla";
@XendraField(AD_Column_ID="AD_Table_ID",
IsCentrallyMaintained=true,AD_Tab_ID="54601a3b-4a34-f2d8-48d5-65dbeeceb5be",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="ac03a9da-7c0d-b2d6-2989-8b086d447648")
public static final String FIELDNAME_Label_Table="ac03a9da-7c0d-b2d6-2989-8b086d447648";

@XendraTrl(Identifier="9656b16f-58ff-8a55-6f03-c1fe626ec321")
public static String es_PE_COLUMN_AD_Table_ID_Name="Tabla";

@XendraColumn(AD_Element_ID="270eeb02-723b-0ecc-7f56-3c67fa71a7f1",ColumnName="AD_Table_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9656b16f-58ff-8a55-6f03-c1fe626ec321",
Synchronized="2017-08-05 16:52:43.0")
/** Column name AD_Table_ID */
public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
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

@XendraTrl(Identifier="1a7acdb6-da41-789e-1547-7c998d8c89c2")
public static String es_PE_FIELD_Label_Description_Description="Observación";

@XendraTrl(Identifier="1a7acdb6-da41-789e-1547-7c998d8c89c2")
public static String es_PE_FIELD_Label_Description_Help="Observación";

@XendraTrl(Identifier="1a7acdb6-da41-789e-1547-7c998d8c89c2")
public static String es_PE_FIELD_Label_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="54601a3b-4a34-f2d8-48d5-65dbeeceb5be",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1a7acdb6-da41-789e-1547-7c998d8c89c2")
public static final String FIELDNAME_Label_Description="1a7acdb6-da41-789e-1547-7c998d8c89c2";

@XendraTrl(Identifier="eec34c12-5c00-3112-4043-edd72fe8bcba")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="eec34c12-5c00-3112-4043-edd72fe8bcba",
Synchronized="2017-08-05 16:52:43.0")
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
@XendraTrl(Identifier="6c3989a4-6d5d-4a4a-9647-d1b11712649b")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6c3989a4-6d5d-4a4a-9647-d1b11712649b",
Synchronized="2017-08-05 16:52:43.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Landscape.
@param IsLandscape Landscape orientation */
public void setIsLandscape (boolean IsLandscape)
{
set_Value (COLUMNNAME_IsLandscape, Boolean.valueOf(IsLandscape));
}
/** Get Landscape.
@return Landscape orientation */
public boolean isLandscape() 
{
Object oo = get_Value(COLUMNNAME_IsLandscape);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="b64d9957-5d50-4110-f673-a2105556a565")
public static String es_PE_FIELD_Label_Landscape_Description="Orientación Apaisada";

@XendraTrl(Identifier="b64d9957-5d50-4110-f673-a2105556a565")
public static String es_PE_FIELD_Label_Landscape_Name="Apaisada";

@XendraField(AD_Column_ID="IsLandscape",IsCentrallyMaintained=true,
AD_Tab_ID="54601a3b-4a34-f2d8-48d5-65dbeeceb5be",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b64d9957-5d50-4110-f673-a2105556a565")
public static final String FIELDNAME_Label_Landscape="b64d9957-5d50-4110-f673-a2105556a565";

@XendraTrl(Identifier="423e131a-8276-afc2-7aa4-353da7169665")
public static String es_PE_COLUMN_IsLandscape_Name="Apaisada";

@XendraColumn(AD_Element_ID="df6b41a3-21cb-b8e5-00b1-122cb74ba27e",ColumnName="IsLandscape",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="423e131a-8276-afc2-7aa4-353da7169665",
Synchronized="2017-08-05 16:52:43.0")
/** Column name IsLandscape */
public static final String COLUMNNAME_IsLandscape = "IsLandscape";
/** Set Label Height.
@param LabelHeight Height of the label */
public void setLabelHeight (int LabelHeight)
{
set_Value (COLUMNNAME_LabelHeight, Integer.valueOf(LabelHeight));
}
/** Get Label Height.
@return Height of the label */
public int getLabelHeight() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_LabelHeight);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e9b12864-72eb-5307-626f-0c5e66940ea9")
public static String es_PE_FIELD_Label_LabelHeight_Description="Altura de la Etiqueta";

@XendraTrl(Identifier="e9b12864-72eb-5307-626f-0c5e66940ea9")
public static String es_PE_FIELD_Label_LabelHeight_Help="Tamaño fisico de la etiqueta.";

@XendraTrl(Identifier="e9b12864-72eb-5307-626f-0c5e66940ea9")
public static String es_PE_FIELD_Label_LabelHeight_Name="Altura de Etiqueta";

@XendraField(AD_Column_ID="LabelHeight",IsCentrallyMaintained=true,
AD_Tab_ID="54601a3b-4a34-f2d8-48d5-65dbeeceb5be",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e9b12864-72eb-5307-626f-0c5e66940ea9")
public static final String FIELDNAME_Label_LabelHeight="e9b12864-72eb-5307-626f-0c5e66940ea9";

@XendraTrl(Identifier="8f1e93a2-f51a-9d50-0688-6f23ae026531")
public static String es_PE_COLUMN_LabelHeight_Name="Altura de Etiqueta";

@XendraColumn(AD_Element_ID="abdeac9c-cf37-39db-3d2e-d1881795bf7c",ColumnName="LabelHeight",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8f1e93a2-f51a-9d50-0688-6f23ae026531",
Synchronized="2017-08-05 16:52:43.0")
/** Column name LabelHeight */
public static final String COLUMNNAME_LabelHeight = "LabelHeight";
/** Set Label Width.
@param LabelWidth Width of the Label */
public void setLabelWidth (int LabelWidth)
{
set_Value (COLUMNNAME_LabelWidth, Integer.valueOf(LabelWidth));
}
/** Get Label Width.
@return Width of the Label */
public int getLabelWidth() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_LabelWidth);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9773c4e7-0384-ce9c-f2a6-eb97c416cc67")
public static String es_PE_FIELD_Label_LabelWidth_Description="Anchura de la etiqueta";

@XendraTrl(Identifier="9773c4e7-0384-ce9c-f2a6-eb97c416cc67")
public static String es_PE_FIELD_Label_LabelWidth_Help="El ancho fisico de la etiqueta.";

@XendraTrl(Identifier="9773c4e7-0384-ce9c-f2a6-eb97c416cc67")
public static String es_PE_FIELD_Label_LabelWidth_Name="Anchura de Etiqueta";

@XendraField(AD_Column_ID="LabelWidth",IsCentrallyMaintained=true,
AD_Tab_ID="54601a3b-4a34-f2d8-48d5-65dbeeceb5be",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9773c4e7-0384-ce9c-f2a6-eb97c416cc67")
public static final String FIELDNAME_Label_LabelWidth="9773c4e7-0384-ce9c-f2a6-eb97c416cc67";

@XendraTrl(Identifier="5e30975e-0b82-6e85-7a22-a141efd56eff")
public static String es_PE_COLUMN_LabelWidth_Name="Anchura de Etiqueta";

@XendraColumn(AD_Element_ID="be6e3f54-ecd5-b997-1135-55ba807be9f7",ColumnName="LabelWidth",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5e30975e-0b82-6e85-7a22-a141efd56eff",
Synchronized="2017-08-05 16:52:43.0")
/** Column name LabelWidth */
public static final String COLUMNNAME_LabelWidth = "LabelWidth";
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

@XendraTrl(Identifier="af54bdcd-c463-e9c5-b12a-af9c8f71e1b8")
public static String es_PE_FIELD_Label_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="af54bdcd-c463-e9c5-b12a-af9c8f71e1b8")
public static String es_PE_FIELD_Label_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="af54bdcd-c463-e9c5-b12a-af9c8f71e1b8")
public static String es_PE_FIELD_Label_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="54601a3b-4a34-f2d8-48d5-65dbeeceb5be",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="af54bdcd-c463-e9c5-b12a-af9c8f71e1b8")
public static final String FIELDNAME_Label_Name="af54bdcd-c463-e9c5-b12a-af9c8f71e1b8";

@XendraTrl(Identifier="90f749dc-e1ae-7fa7-54a0-f62eaae96a05")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="90f749dc-e1ae-7fa7-54a0-f62eaae96a05",
Synchronized="2017-08-05 16:52:43.0")
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
@XendraTrl(Identifier="329294da-b1a1-9c89-a186-921cd592ccd3")
public static String es_PE_FIELD_Label_PrinterName_Description="Nombre de la Impresión";

@XendraTrl(Identifier="329294da-b1a1-9c89-a186-921cd592ccd3")
public static String es_PE_FIELD_Label_PrinterName_Help="(Nombre interno de el sistema operativo) de la impresora; Por favor note que el nombre de la impresora puede ser diferente en diversos clientes. Incorpore un nombre de la impresora, que se aplica a TODOS LOS clientes (ej. Impresora en un servidor) <p> Si no se incorpora ninguna, se utiliza la impresora por default. Usted especifica su impresora a utilizar cuando abre una sesión. Tambien puede cambiar la impresora por default en preferencias.";

@XendraTrl(Identifier="329294da-b1a1-9c89-a186-921cd592ccd3")
public static String es_PE_FIELD_Label_PrinterName_Name="Nombre Impresión";

@XendraField(AD_Column_ID="PrinterName",IsCentrallyMaintained=true,
AD_Tab_ID="54601a3b-4a34-f2d8-48d5-65dbeeceb5be",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="329294da-b1a1-9c89-a186-921cd592ccd3")
public static final String FIELDNAME_Label_PrinterName="329294da-b1a1-9c89-a186-921cd592ccd3";

@XendraTrl(Identifier="8578a1f1-0243-63bc-ba5d-c54f7cf96efc")
public static String es_PE_COLUMN_PrinterName_Name="Nombre Impresión";

@XendraColumn(AD_Element_ID="3cc8b19c-2d7f-761b-8ec9-3afda5b3a2eb",ColumnName="PrinterName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8578a1f1-0243-63bc-ba5d-c54f7cf96efc",
Synchronized="2017-08-05 16:52:43.0")
/** Column name PrinterName */
public static final String COLUMNNAME_PrinterName = "PrinterName";
}
