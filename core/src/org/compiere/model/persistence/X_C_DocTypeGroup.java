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
/** Generated Model for C_DocTypeGroup
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_DocTypeGroup extends PO
{
/** Standard Constructor
@param ctx context
@param C_DocTypeGroup_ID id
@param trxName transaction
*/
public X_C_DocTypeGroup (Properties ctx, int C_DocTypeGroup_ID, String trxName)
{
super (ctx, C_DocTypeGroup_ID, trxName);
/** if (C_DocTypeGroup_ID == 0)
{
setAD_Column_ID (0);
setC_DocTypeGroup_ID (0);
setC_DocType_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_DocTypeGroup (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000281 */
public static int Table_ID=MTable.getTable_ID("C_DocTypeGroup");

@XendraTrl(Identifier="908240ce-1158-4500-8a86-ae567a436951")
public static String es_PE_TAB_DocumentTypeGroup_Name="Grupo de tipo de Documento";

@XendraTab(Name="Document Type Group",Description="",Help="",
AD_Window_ID="e28a3366-4323-3c55-8fbc-2d66ef1d2ac6",SeqNo=30,TabLevel=1,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="908240ce-1158-4500-8a86-ae567a436951",Synchronized="2017-08-05 16:53:36.0")
public static final String TABNAME_DocumentTypeGroup="908240ce-1158-4500-8a86-ae567a436951";

@XendraTrl(Identifier="408f2dc5-f5ed-4dca-b070-bfe07ccdd065")
public static String es_PE_TABLE_C_DocTypeGroup_Name="Doc Type Group";

@XendraTable(Name="Doc Type Group",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="C_DocTypeGroup",AccessLevel="6",AD_Window_ID="e28a3366-4323-3c55-8fbc-2d66ef1d2ac6",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="408f2dc5-f5ed-4dca-b070-bfe07ccdd065",Synchronized="2020-03-03 21:36:50.0")
/** TableName=C_DocTypeGroup */
public static final String Table_Name="C_DocTypeGroup";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_DocTypeGroup");

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
    Table_ID = MTable.getTable_ID("C_DocTypeGroup");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_DocTypeGroup[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="782983ef-039f-414a-83d5-3718290e1623")
public static String es_PE_FIELD_DocumentTypeGroup_Column_Name="Columna";

@XendraTrl(Identifier="782983ef-039f-414a-83d5-3718290e1623")
public static String es_PE_FIELD_DocumentTypeGroup_Column_Description="Columna en la tabla";

@XendraTrl(Identifier="782983ef-039f-414a-83d5-3718290e1623")
public static String es_PE_FIELD_DocumentTypeGroup_Column_Help="Enlace a la columna base de datos de la tabla";

@XendraField(AD_Column_ID="AD_Column_ID",IsCentrallyMaintained=true,
AD_Tab_ID="908240ce-1158-4500-8a86-ae567a436951",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-08-05 16:53:36.0",
Identifier="782983ef-039f-414a-83d5-3718290e1623")
public static final String FIELDNAME_DocumentTypeGroup_Column="782983ef-039f-414a-83d5-3718290e1623";

@XendraTrl(Identifier="01c8c13c-6d75-4fad-a992-e3a5278ec40e")
public static String es_PE_COLUMN_AD_Column_ID_Name="Column";

@XendraColumn(AD_Element_ID="a0dcf1ba-2ef3-ca06-ed42-8ae37c632eaf",ColumnName="AD_Column_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="01c8c13c-6d75-4fad-a992-e3a5278ec40e",
Synchronized="2019-08-30 22:21:30.0")
/** Column name AD_Column_ID */
public static final String COLUMNNAME_AD_Column_ID = "AD_Column_ID";
/** Set Table.
@param AD_Table_ID Database Table information */
public void setAD_Table_ID (int AD_Table_ID)
{
if (AD_Table_ID <= 0) set_Value (COLUMNNAME_AD_Table_ID, null);
 else 
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

@XendraTrl(Identifier="c9876767-8f98-45fe-85af-92d7300abe1d")
public static String es_PE_FIELD_DocumentTypeGroup_Table_Name="Tabla";

@XendraTrl(Identifier="c9876767-8f98-45fe-85af-92d7300abe1d")
public static String es_PE_FIELD_DocumentTypeGroup_Table_Description="Tabla para los campos";

@XendraTrl(Identifier="c9876767-8f98-45fe-85af-92d7300abe1d")
public static String es_PE_FIELD_DocumentTypeGroup_Table_Help="La Tabla indica una tabla en la que reside un campo ó campos.";

@XendraField(AD_Column_ID="AD_Table_ID",IsCentrallyMaintained=true,
AD_Tab_ID="908240ce-1158-4500-8a86-ae567a436951",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-08-05 16:53:36.0",
Identifier="c9876767-8f98-45fe-85af-92d7300abe1d")
public static final String FIELDNAME_DocumentTypeGroup_Table="c9876767-8f98-45fe-85af-92d7300abe1d";

@XendraTrl(Identifier="cc36106d-24c0-4c6f-87b3-c7e858862e55")
public static String es_PE_COLUMN_AD_Table_ID_Name="Table";

@XendraColumn(AD_Element_ID="270eeb02-723b-0ecc-7f56-3c67fa71a7f1",ColumnName="AD_Table_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cc36106d-24c0-4c6f-87b3-c7e858862e55",
Synchronized="2019-08-30 22:21:30.0")
/** Column name AD_Table_ID */
public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
/** Set Doc Type Group.
@param C_DocTypeGroup_ID Doc Type Group */
public void setC_DocTypeGroup_ID (int C_DocTypeGroup_ID)
{
if (C_DocTypeGroup_ID < 1) throw new IllegalArgumentException ("C_DocTypeGroup_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_DocTypeGroup_ID, Integer.valueOf(C_DocTypeGroup_ID));
}
/** Get Doc Type Group.
@return Doc Type Group */
public int getC_DocTypeGroup_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_DocTypeGroup_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f461cf6a-c059-4f44-a0a5-f8a0055b78e0")
public static String es_PE_FIELD_DocumentTypeGroup_DocTypeGroup_Name="Doc Type Group";

@XendraField(AD_Column_ID="C_DocTypeGroup_ID",IsCentrallyMaintained=true,
AD_Tab_ID="908240ce-1158-4500-8a86-ae567a436951",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-08-05 16:53:36.0",
Identifier="f461cf6a-c059-4f44-a0a5-f8a0055b78e0")
public static final String FIELDNAME_DocumentTypeGroup_DocTypeGroup="f461cf6a-c059-4f44-a0a5-f8a0055b78e0";
/** Column name C_DocTypeGroup_ID */
public static final String COLUMNNAME_C_DocTypeGroup_ID = "C_DocTypeGroup_ID";
/** Set Document Type.
@param C_DocType_ID Document type or rules */
public void setC_DocType_ID (int C_DocType_ID)
{
if (C_DocType_ID < 0) throw new IllegalArgumentException ("C_DocType_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_DocType_ID, Integer.valueOf(C_DocType_ID));
}
/** Get Document Type.
@return Document type or rules */
public int getC_DocType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_DocType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a71f9ec8-9218-450b-9de3-bf0816116bcf")
public static String es_PE_FIELD_DocumentTypeGroup_DocumentType_Name="Tipo de Documento";

@XendraTrl(Identifier="a71f9ec8-9218-450b-9de3-bf0816116bcf")
public static String es_PE_FIELD_DocumentTypeGroup_DocumentType_Description="Tipo de documento ó reglas";

@XendraTrl(Identifier="a71f9ec8-9218-450b-9de3-bf0816116bcf")
public static String es_PE_FIELD_DocumentTypeGroup_DocumentType_Help="El tipo de documento determina la secuencia del documento y las reglas de proceso";

@XendraField(AD_Column_ID="C_DocType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="908240ce-1158-4500-8a86-ae567a436951",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-08-05 16:53:36.0",
Identifier="a71f9ec8-9218-450b-9de3-bf0816116bcf")
public static final String FIELDNAME_DocumentTypeGroup_DocumentType="a71f9ec8-9218-450b-9de3-bf0816116bcf";

@XendraTrl(Identifier="52276479-ce35-4b2a-b84e-d672e9e86f10")
public static String es_PE_COLUMN_C_DocType_ID_Name="Document Type";

@XendraColumn(AD_Element_ID="099a4147-1a72-cdd0-81e0-8bdbc8c0b883",ColumnName="C_DocType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="52276479-ce35-4b2a-b84e-d672e9e86f10",
Synchronized="2019-08-30 22:21:30.0")
/** Column name C_DocType_ID */
public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
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
@XendraTrl(Identifier="a9e876ae-4cc1-445c-bc68-25e5ea77efa5")
public static String es_PE_FIELD_DocumentTypeGroup_Identifier_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="908240ce-1158-4500-8a86-ae567a436951",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=36,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-08-05 16:53:36.0",
Identifier="a9e876ae-4cc1-445c-bc68-25e5ea77efa5")
public static final String FIELDNAME_DocumentTypeGroup_Identifier="a9e876ae-4cc1-445c-bc68-25e5ea77efa5";

@XendraTrl(Identifier="8d481188-d75a-4f10-962c-c236893806d4")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8d481188-d75a-4f10-962c-c236893806d4",
Synchronized="2019-08-30 22:21:30.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set IsCut.
@param IsCut IsCut */
public void setIsCut (boolean IsCut)
{
set_Value (COLUMNNAME_IsCut, Boolean.valueOf(IsCut));
}
/** Get IsCut.
@return IsCut */
public boolean isCut() 
{
Object oo = get_Value(COLUMNNAME_IsCut);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="93319347-be75-48da-84ad-de1b7ba74682")
public static String es_PE_FIELD_DocumentTypeGroup_IsCut_Name="Es corte";

@XendraField(AD_Column_ID="IsCut",IsCentrallyMaintained=true,
AD_Tab_ID="908240ce-1158-4500-8a86-ae567a436951",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-08-05 16:53:36.0",
Identifier="93319347-be75-48da-84ad-de1b7ba74682")
public static final String FIELDNAME_DocumentTypeGroup_IsCut="93319347-be75-48da-84ad-de1b7ba74682";

@XendraTrl(Identifier="81ccc9c3-8299-4501-99dd-4243c5fe1404")
public static String es_PE_COLUMN_IsCut_Name="iscut";

@XendraColumn(AD_Element_ID="ce257002-06ac-43c5-a09d-ca323ca88926",ColumnName="IsCut",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="81ccc9c3-8299-4501-99dd-4243c5fe1404",
Synchronized="2019-08-30 22:21:30.0")
/** Column name IsCut */
public static final String COLUMNNAME_IsCut = "IsCut";
/** Set Line No.
@param Line Unique line for this document */
public void setLine (int Line)
{
set_Value (COLUMNNAME_Line, Integer.valueOf(Line));
}
/** Get Line No.
@return Unique line for this document */
public int getLine() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Line);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="988cf0ff-f362-4127-87fb-a495f3c85105")
public static String es_PE_FIELD_DocumentTypeGroup_LineNo_Name="No. Línea";

@XendraTrl(Identifier="988cf0ff-f362-4127-87fb-a495f3c85105")
public static String es_PE_FIELD_DocumentTypeGroup_LineNo_Description="No. Línea único para este documento";

@XendraTrl(Identifier="988cf0ff-f362-4127-87fb-a495f3c85105")
public static String es_PE_FIELD_DocumentTypeGroup_LineNo_Help="Indica el No. Línea para un documento. También controlará el orden de despliegue de las líneas dentro de un documento";

@XendraField(AD_Column_ID="Line",IsCentrallyMaintained=true,
AD_Tab_ID="908240ce-1158-4500-8a86-ae567a436951",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-08-05 16:53:36.0",
Identifier="988cf0ff-f362-4127-87fb-a495f3c85105")
public static final String FIELDNAME_DocumentTypeGroup_LineNo="988cf0ff-f362-4127-87fb-a495f3c85105";

@XendraTrl(Identifier="5577bc92-b6a8-42c2-a716-ee0762fb2d22")
public static String es_PE_COLUMN_Line_Name="Line No";

@XendraColumn(AD_Element_ID="986ef077-61da-f9cf-1c6d-aefe3a35113b",ColumnName="Line",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5577bc92-b6a8-42c2-a716-ee0762fb2d22",
Synchronized="2019-08-30 22:21:30.0")
/** Column name Line */
public static final String COLUMNNAME_Line = "Line";
}
