/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                          *
 * Copyright (C)  dravios       All Rights Reserved.                          *
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
/** Generated Model for GL_BookItem
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_GL_BookItem extends PO
{
/** Standard Constructor
@param ctx context
@param GL_BookItem_ID id
@param trxName transaction
*/
public X_GL_BookItem (Properties ctx, int GL_BookItem_ID, String trxName)
{
super (ctx, GL_BookItem_ID, trxName);
/** if (GL_BookItem_ID == 0)
{
setGL_BookItem_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_GL_BookItem (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000321 */
public static int Table_ID=MTable.getTable_ID("GL_BookItem");

@XendraTrl(Identifier="0a8b7ee2-ba1c-4d45-ae39-7b5e4fbca151")
public static String es_PE_TAB_GL_BookItem_Name="Campos del Archivo";
@XendraTab(Name="GL_BookItem",
Description="",Help="",AD_Window_ID="5d03174a-432f-b3b2-6275-87031ef6e308",SeqNo=40,TabLevel=1,
IsSingleRow=false,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",
HasTree=false,WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="0a8b7ee2-ba1c-4d45-ae39-7b5e4fbca151",Synchronized="2016-09-19 11:18:13.0")
public static final String TABNAME_GL_BookItem="0a8b7ee2-ba1c-4d45-ae39-7b5e4fbca151";

@XendraTrl(Identifier="4a3fff0d-e213-445a-bee6-5daeb58c77da")
public static String es_PE_TABLE_GL_BookItem_Name="GL Book Item";

@XendraTable(Name="GL Book Item",AD_Package_ID="2ac04657-d663-47c2-4ec1-927ad71f1e96",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",TableName="GL_BookItem",
AccessLevel="3",AD_Window_ID="5d03174a-432f-b3b2-6275-87031ef6e308",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.accounting",
Identifier="4a3fff0d-e213-445a-bee6-5daeb58c77da",Synchronized="2023-04-15 21:35:02.0")
/** TableName=GL_BookItem */
public static final String Table_Name="GL_BookItem";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"GL_BookItem");

protected BigDecimal accessLevel = BigDecimal.valueOf(3);
/** AccessLevel
@return 3 - Client - Org 
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
    Table_ID = MTable.getTable_ID("GL_BookItem");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_GL_BookItem[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Reference.
@param AD_Reference_ID System Reference and Validation */
public void setAD_Reference_ID (int AD_Reference_ID)
{
if (AD_Reference_ID <= 0) set_Value (COLUMNNAME_AD_Reference_ID, null);
 else 
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

@XendraTrl(Identifier="7ca3c9a1-a4b2-4f45-8b4e-c7468a7cb573")
public static String es_PE_FIELD_GL_BookItem_Reference_Name="Referencia";

@XendraTrl(Identifier="7ca3c9a1-a4b2-4f45-8b4e-c7468a7cb573")
public static String es_PE_FIELD_GL_BookItem_Reference_Help="La Referencia indica el tipo de campo de referencia";

@XendraTrl(Identifier="7ca3c9a1-a4b2-4f45-8b4e-c7468a7cb573")
public static String es_PE_FIELD_GL_BookItem_Reference_Description="Referencia del Sistema (Lista de Selección)";

@XendraField(AD_Column_ID="AD_Reference_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a8b7ee2-ba1c-4d45-ae39-7b5e4fbca151",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2023-04-15 21:35:02.0",
Identifier="7ca3c9a1-a4b2-4f45-8b4e-c7468a7cb573")
public static final String FIELDNAME_GL_BookItem_Reference="7ca3c9a1-a4b2-4f45-8b4e-c7468a7cb573";

@XendraTrl(Identifier="7f6dd3e2-50de-41ef-af92-e184f2e775cb")
public static String es_PE_COLUMN_AD_Reference_ID_Name="Reference";

@XendraColumn(AD_Element_ID="bf1912e9-a75f-4e1b-99b4-d04633e7777b",ColumnName="AD_Reference_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7f6dd3e2-50de-41ef-af92-e184f2e775cb",
Synchronized="2023-03-22 18:55:34.0")
/** Column name AD_Reference_ID */
public static final String COLUMNNAME_AD_Reference_ID = "AD_Reference_ID";
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

@XendraTrl(Identifier="cb7524dc-58c9-4b5e-8029-5e4218e7b70b")
public static String es_PE_FIELD_GL_BookItem_ReferenceKey_Name="Valor de Referencia";

@XendraTrl(Identifier="cb7524dc-58c9-4b5e-8029-5e4218e7b70b")
public static String es_PE_FIELD_GL_BookItem_ReferenceKey_Help="El valor referencia indica dónde los valores referencia son almacenados. Debe especificarce si el tipo de datos es tabla ó lista.";

@XendraTrl(Identifier="cb7524dc-58c9-4b5e-8029-5e4218e7b70b")
public static String es_PE_FIELD_GL_BookItem_ReferenceKey_Description="Requerido para especificar; si el tipo de datos es tabla ó lista.";

@XendraField(AD_Column_ID="AD_Reference_Value_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a8b7ee2-ba1c-4d45-ae39-7b5e4fbca151",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2023-04-15 21:35:02.0",
Identifier="cb7524dc-58c9-4b5e-8029-5e4218e7b70b")
public static final String FIELDNAME_GL_BookItem_ReferenceKey="cb7524dc-58c9-4b5e-8029-5e4218e7b70b";

@XendraTrl(Identifier="8362179b-61f3-40ab-8cef-4d8d8c47c831")
public static String es_PE_COLUMN_AD_Reference_Value_ID_Name="Reference Key";

@XendraColumn(AD_Element_ID="1ce26254-3c83-8d1d-3506-37160c076aad",
ColumnName="AD_Reference_Value_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="8362179b-61f3-40ab-8cef-4d8d8c47c831",Synchronized="2023-03-22 18:55:34.0")
/** Column name AD_Reference_Value_ID */
public static final String COLUMNNAME_AD_Reference_Value_ID = "AD_Reference_Value_ID";
/** Set Document Type.
@param C_DocType_ID Document type or rules */
public void setC_DocType_ID (int C_DocType_ID)
{
if (C_DocType_ID <= 0) set_Value (COLUMNNAME_C_DocType_ID, null);
 else 
set_Value (COLUMNNAME_C_DocType_ID, Integer.valueOf(C_DocType_ID));
}
/** Get Document Type.
@return Document type or rules */
public int getC_DocType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_DocType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1e144688-8e28-4b78-a134-d27b12dde6d6")
public static String es_PE_FIELD_GL_BookItem_DocumentType_Name="Tipo de Documento";

@XendraTrl(Identifier="1e144688-8e28-4b78-a134-d27b12dde6d6")
public static String es_PE_FIELD_GL_BookItem_DocumentType_Help="El tipo de documento determina la secuencia del documento y las reglas de proceso";

@XendraTrl(Identifier="1e144688-8e28-4b78-a134-d27b12dde6d6")
public static String es_PE_FIELD_GL_BookItem_DocumentType_Description="Tipo de documento ó reglas";

@XendraField(AD_Column_ID="C_DocType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a8b7ee2-ba1c-4d45-ae39-7b5e4fbca151",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2023-04-15 21:35:02.0",
Identifier="1e144688-8e28-4b78-a134-d27b12dde6d6")
public static final String FIELDNAME_GL_BookItem_DocumentType="1e144688-8e28-4b78-a134-d27b12dde6d6";

@XendraTrl(Identifier="b920cf24-49cb-4bb8-9963-8a657b86c46c")
public static String es_PE_COLUMN_C_DocType_ID_Name="Document Type";

@XendraColumn(AD_Element_ID="099a4147-1a72-cdd0-81e0-8bdbc8c0b883",ColumnName="C_DocType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b920cf24-49cb-4bb8-9963-8a657b86c46c",
Synchronized="2023-03-22 18:55:34.0")
/** Column name C_DocType_ID */
public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
/** Set DB Column Name.
@param ColumnName Name of the column in the database */
public void setColumnName (String ColumnName)
{
if (ColumnName != null && ColumnName.length() > 40)
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
@XendraTrl(Identifier="c7c0dc28-8f81-4956-9fa5-c793bb7d1331")
public static String es_PE_FIELD_GL_BookItem_DBColumnName_Name="Nombre de Columna en BD";

@XendraTrl(Identifier="c7c0dc28-8f81-4956-9fa5-c793bb7d1331")
public static String es_PE_FIELD_GL_BookItem_DBColumnName_Help="Indica el nombre de una columna en una tabla como se definió en la base de datos.";

@XendraTrl(Identifier="c7c0dc28-8f81-4956-9fa5-c793bb7d1331")
public static String es_PE_FIELD_GL_BookItem_DBColumnName_Description="Nombre de la columna en la base de datos";

@XendraField(AD_Column_ID="ColumnName",IsCentrallyMaintained=true,
AD_Tab_ID="0a8b7ee2-ba1c-4d45-ae39-7b5e4fbca151",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2023-04-15 21:35:02.0",
Identifier="c7c0dc28-8f81-4956-9fa5-c793bb7d1331")
public static final String FIELDNAME_GL_BookItem_DBColumnName="c7c0dc28-8f81-4956-9fa5-c793bb7d1331";

@XendraTrl(Identifier="509a3dc1-2b0e-4d54-a355-af729dd0396f")
public static String es_PE_COLUMN_ColumnName_Name="DB Column Name";

@XendraColumn(AD_Element_ID="fadc32aa-cd31-3fee-f9b7-0daa53df76a7",ColumnName="ColumnName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="509a3dc1-2b0e-4d54-a355-af729dd0396f",
Synchronized="2023-03-22 18:55:34.0")
/** Column name ColumnName */
public static final String COLUMNNAME_ColumnName = "ColumnName";
/** Set Column SQL.
@param ColumnSQL Virtual Column (r/o) */
public void setColumnSQL (String ColumnSQL)
{
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
@XendraTrl(Identifier="c756e7fa-ce1d-48aa-a88a-f05c38389b00")
public static String es_PE_FIELD_GL_BookItem_ColumnSQL_Name="Columna SQL";

@XendraTrl(Identifier="c756e7fa-ce1d-48aa-a88a-f05c38389b00")
public static String es_PE_FIELD_GL_BookItem_ColumnSQL_Help="Usted puede definir las columnas virtuales (no almacenadas en la base de datos). Si está definido, el nombre de la columna es el sinónimo de la expresión del SQL definida aquí. La expresión del SQL debe ser valida.<br > ejemplo:  \"Actualizado-Creado\" enumeraría la edad de la entrada en días.";

@XendraTrl(Identifier="c756e7fa-ce1d-48aa-a88a-f05c38389b00")
public static String es_PE_FIELD_GL_BookItem_ColumnSQL_Description="Columna Virtual (r/o)";

@XendraField(AD_Column_ID="ColumnSQL",IsCentrallyMaintained=true,
AD_Tab_ID="0a8b7ee2-ba1c-4d45-ae39-7b5e4fbca151",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2000,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2023-04-15 21:35:02.0",
Identifier="c756e7fa-ce1d-48aa-a88a-f05c38389b00")
public static final String FIELDNAME_GL_BookItem_ColumnSQL="c756e7fa-ce1d-48aa-a88a-f05c38389b00";

@XendraTrl(Identifier="8ccf8727-9626-4a48-b385-d04c03b690e8")
public static String es_PE_COLUMN_ColumnSQL_Name="Column SQL";

@XendraColumn(AD_Element_ID="4d5be23f-2ffd-ca83-8ea2-bc7b4d29ea78",ColumnName="ColumnSQL",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8ccf8727-9626-4a48-b385-d04c03b690e8",
Synchronized="2023-03-22 18:55:34.0")
/** Column name ColumnSQL */
public static final String COLUMNNAME_ColumnSQL = "ColumnSQL";
/** Set Book.
@param GL_Book_ID Book */
public void setGL_Book_ID (int GL_Book_ID)
{
if (GL_Book_ID <= 0) set_ValueNoCheck (COLUMNNAME_GL_Book_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_GL_Book_ID, Integer.valueOf(GL_Book_ID));
}
/** Get Book.
@return Book */
public int getGL_Book_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_GL_Book_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a57f522a-8ee7-4647-a7c0-04f51c41082a")
public static String es_PE_FIELD_GL_BookItem_Book_Name="Book";

@XendraField(AD_Column_ID="GL_Book_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a8b7ee2-ba1c-4d45-ae39-7b5e4fbca151",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2023-04-15 21:35:02.0",
Identifier="a57f522a-8ee7-4647-a7c0-04f51c41082a")
public static final String FIELDNAME_GL_BookItem_Book="a57f522a-8ee7-4647-a7c0-04f51c41082a";

@XendraTrl(Identifier="e8849a7b-de85-475e-9f9a-5dff630d92dc")
public static String es_PE_COLUMN_GL_Book_ID_Name="Book";

@XendraColumn(AD_Element_ID="ea1aa938-283c-a393-bca4-7ed1e97f2745",ColumnName="GL_Book_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e8849a7b-de85-475e-9f9a-5dff630d92dc",
Synchronized="2023-03-22 18:55:34.0")
/** Column name GL_Book_ID */
public static final String COLUMNNAME_GL_Book_ID = "GL_Book_ID";
/** Set GL Book Item.
@param GL_BookItem_ID GL Book Item */
public void setGL_BookItem_ID (int GL_BookItem_ID)
{
if (GL_BookItem_ID < 1) throw new IllegalArgumentException ("GL_BookItem_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_GL_BookItem_ID, Integer.valueOf(GL_BookItem_ID));
}
/** Get GL Book Item.
@return GL Book Item */
public int getGL_BookItem_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_GL_BookItem_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d88314bf-1186-483f-b11e-e4df20894f42")
public static String es_PE_FIELD_GL_BookItem_GLBookItem_Name="GL Book Item";

@XendraField(AD_Column_ID="GL_BookItem_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a8b7ee2-ba1c-4d45-ae39-7b5e4fbca151",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2023-04-15 21:35:02.0",
Identifier="d88314bf-1186-483f-b11e-e4df20894f42")
public static final String FIELDNAME_GL_BookItem_GLBookItem="d88314bf-1186-483f-b11e-e4df20894f42";
/** Column name GL_BookItem_ID */
public static final String COLUMNNAME_GL_BookItem_ID = "GL_BookItem_ID";
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
@XendraTrl(Identifier="06d9e1e4-de9c-44a1-badd-745bce561f06")
public static String es_PE_FIELD_GL_BookItem_Identifier_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="0a8b7ee2-ba1c-4d45-ae39-7b5e4fbca151",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=36,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2023-04-15 21:35:02.0",
Identifier="06d9e1e4-de9c-44a1-badd-745bce561f06")
public static final String FIELDNAME_GL_BookItem_Identifier="06d9e1e4-de9c-44a1-badd-745bce561f06";

@XendraTrl(Identifier="bd8fd600-34fc-4359-8bed-ce18f80c45b4")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bd8fd600-34fc-4359-8bed-ce18f80c45b4",
Synchronized="2023-03-22 18:55:34.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
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

@XendraTrl(Identifier="fccd9e12-29c1-465d-a8d9-9828819f2823")
public static String es_PE_FIELD_GL_BookItem_ParentLinkColumn_Name="Columna de Enlace a Tabla Padre";

@XendraTrl(Identifier="fccd9e12-29c1-465d-a8d9-9828819f2823")
public static String es_PE_FIELD_GL_BookItem_ParentLinkColumn_Help="El Cuadro de verificación padre indica si esta columna es un enlace a la tabla padre";

@XendraTrl(Identifier="fccd9e12-29c1-465d-a8d9-9828819f2823")
public static String es_PE_FIELD_GL_BookItem_ParentLinkColumn_Description="Esta columna es un enlace a la tabla padre (Ej. Cabecera desde líneas) - incl. Asociación con columnas clave";

@XendraField(AD_Column_ID="IsParent",IsCentrallyMaintained=true,
AD_Tab_ID="0a8b7ee2-ba1c-4d45-ae39-7b5e4fbca151",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2023-04-15 21:35:02.0",
Identifier="fccd9e12-29c1-465d-a8d9-9828819f2823")
public static final String FIELDNAME_GL_BookItem_ParentLinkColumn="fccd9e12-29c1-465d-a8d9-9828819f2823";

@XendraTrl(Identifier="bfb4afae-e677-4446-a3fa-2905adb1320e")
public static String es_PE_COLUMN_IsParent_Name="Parent link column";

@XendraColumn(AD_Element_ID="9eeefe36-95e5-2218-179f-a4d553c8e65a",ColumnName="IsParent",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bfb4afae-e677-4446-a3fa-2905adb1320e",
Synchronized="2023-03-22 18:55:34.0")
/** Column name IsParent */
public static final String COLUMNNAME_IsParent = "IsParent";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name != null && Name.length() > 60)
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

@XendraTrl(Identifier="1741f9aa-859d-4571-b3a1-62b706015bb8")
public static String es_PE_FIELD_GL_BookItem_Name_Name="Nombre";

@XendraTrl(Identifier="1741f9aa-859d-4571-b3a1-62b706015bb8")
public static String es_PE_FIELD_GL_BookItem_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="1741f9aa-859d-4571-b3a1-62b706015bb8")
public static String es_PE_FIELD_GL_BookItem_Name_Description="Identificador alfanumérico de la entidad.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="0a8b7ee2-ba1c-4d45-ae39-7b5e4fbca151",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2023-04-15 21:35:02.0",
Identifier="1741f9aa-859d-4571-b3a1-62b706015bb8")
public static final String FIELDNAME_GL_BookItem_Name="1741f9aa-859d-4571-b3a1-62b706015bb8";

@XendraTrl(Identifier="2e1de983-159f-4205-a612-e0cd1e384efe")
public static String es_PE_COLUMN_Name_Name="Name";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2e1de983-159f-4205-a612-e0cd1e384efe",
Synchronized="2023-03-22 18:55:34.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
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

@XendraTrl(Identifier="9fbf9091-8182-4409-b6e7-3fc712779491")
public static String es_PE_FIELD_GL_BookItem_Sequence_Name="Secuencia";

@XendraTrl(Identifier="9fbf9091-8182-4409-b6e7-3fc712779491")
public static String es_PE_FIELD_GL_BookItem_Sequence_Help="La Secuencia indica el orden de los registros";

@XendraTrl(Identifier="9fbf9091-8182-4409-b6e7-3fc712779491")
public static String es_PE_FIELD_GL_BookItem_Sequence_Description="Método de ordenar registros; el número más bajo viene primero";

@XendraField(AD_Column_ID="SeqNo",IsCentrallyMaintained=true,
AD_Tab_ID="0a8b7ee2-ba1c-4d45-ae39-7b5e4fbca151",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2023-04-15 21:35:02.0",
Identifier="9fbf9091-8182-4409-b6e7-3fc712779491")
public static final String FIELDNAME_GL_BookItem_Sequence="9fbf9091-8182-4409-b6e7-3fc712779491";

@XendraTrl(Identifier="9b8d1b1d-6ee6-4263-9283-690a1583a5bb")
public static String es_PE_COLUMN_SeqNo_Name="Sequence";

@XendraColumn(AD_Element_ID="38fa26fe-b59d-fce1-c129-420b57da738b",ColumnName="SeqNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9b8d1b1d-6ee6-4263-9283-690a1583a5bb",
Synchronized="2023-03-22 18:55:34.0")
/** Column name SeqNo */
public static final String COLUMNNAME_SeqNo = "SeqNo";
}
