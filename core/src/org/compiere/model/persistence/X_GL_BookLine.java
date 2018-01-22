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
/** Generated Model for GL_BookLine
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_GL_BookLine extends PO
{
/** Standard Constructor
@param ctx context
@param GL_BookLine_ID id
@param trxName transaction
*/
public X_GL_BookLine (Properties ctx, int GL_BookLine_ID, String trxName)
{
super (ctx, GL_BookLine_ID, trxName);
/** if (GL_BookLine_ID == 0)
{
setGL_BookLine_ID (0);
setIsSOTrx (false);	
// N
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_GL_BookLine (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000109 */
public static int Table_ID=MTable.getTable_ID("GL_BookLine");

@XendraTrl(Identifier="42d2172c-c760-af80-a1a4-75e073e17f87")
public static String es_PE_TAB_GL_BookLine_Name="Línea de Libro";
@XendraTab(Name="GL_BookLine",
Description="",Help="",AD_Window_ID="5d03174a-432f-b3b2-6275-87031ef6e308",SeqNo=20,TabLevel=1,
IsSingleRow=false,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",
HasTree=false,WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="42d2172c-c760-af80-a1a4-75e073e17f87",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_GL_BookLine="42d2172c-c760-af80-a1a4-75e073e17f87";

@XendraTrl(Identifier="35b5054d-24c7-c656-16a5-6a6df495d75f")
public static String es_PE_TABLE_GL_BookLine_Name="Linea de Libro";

@XendraTable(Name="Book Line",Description="General Ledger Book Line",Help="",
TableName="GL_BookLine",AccessLevel="3",AD_Window_ID="5d03174a-432f-b3b2-6275-87031ef6e308",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=130,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.accounting",
Identifier="35b5054d-24c7-c656-16a5-6a6df495d75f",Synchronized="2017-08-16 11:42:42.0")
/** TableName=GL_BookLine */
public static final String Table_Name="GL_BookLine";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"GL_BookLine");

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
    Table_ID = MTable.getTable_ID("GL_BookLine");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_GL_BookLine[").append(get_ID()).append("]");
return sb.toString();
}
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

@XendraTrl(Identifier="b17c7548-b650-1305-a692-dc5c4c9a4eab")
public static String es_PE_FIELD_GL_BookLine_Table_Description="Tabla para los campos";

@XendraTrl(Identifier="b17c7548-b650-1305-a692-dc5c4c9a4eab")
public static String es_PE_FIELD_GL_BookLine_Table_Help="La Tabla indica una tabla en la que reside un campo ó campos.";

@XendraTrl(Identifier="b17c7548-b650-1305-a692-dc5c4c9a4eab")
public static String es_PE_FIELD_GL_BookLine_Table_Name="Tabla";

@XendraField(AD_Column_ID="AD_Table_ID",IsCentrallyMaintained=true,
AD_Tab_ID="42d2172c-c760-af80-a1a4-75e073e17f87",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b17c7548-b650-1305-a692-dc5c4c9a4eab")
public static final String FIELDNAME_GL_BookLine_Table="b17c7548-b650-1305-a692-dc5c4c9a4eab";

@XendraTrl(Identifier="4e91c8e1-234c-7b7b-5c70-68d320370b5a")
public static String es_PE_COLUMN_AD_Table_ID_Name="Tabla";

@XendraColumn(AD_Element_ID="270eeb02-723b-0ecc-7f56-3c67fa71a7f1",ColumnName="AD_Table_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4e91c8e1-234c-7b7b-5c70-68d320370b5a",
Synchronized="2017-08-05 16:54:40.0")
/** Column name AD_Table_ID */
public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
/** Set Alias.
@param Alias Defines an alternate method of indicating an account combination. */
public void setAlias (String Alias)
{
if (Alias != null && Alias.length() > 20)
{
log.warning("Length > 20 - truncated");
Alias = Alias.substring(0,19);
}
set_Value (COLUMNNAME_Alias, Alias);
}
/** Get Alias.
@return Defines an alternate method of indicating an account combination. */
public String getAlias() 
{
String value = (String)get_Value(COLUMNNAME_Alias);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="0dd87f7f-a3ee-4d5b-98eb-2198bb362f1c")
public static String es_PE_COLUMN_Alias_Name="Alias";

@XendraColumn(AD_Element_ID="eb2b55b1-1094-cce9-62c7-fbcb31313519",ColumnName="Alias",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0dd87f7f-a3ee-4d5b-98eb-2198bb362f1c",
Synchronized="2014-08-20 13:18:51.0")
/** Column name Alias */
public static final String COLUMNNAME_Alias = "Alias";
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

@XendraTrl(Identifier="07ceb338-5de2-ef37-b652-9af4147b79cd")
public static String es_PE_FIELD_GL_BookLine_DocumentType_Description="Tipo de documento ó reglas";

@XendraTrl(Identifier="07ceb338-5de2-ef37-b652-9af4147b79cd")
public static String es_PE_FIELD_GL_BookLine_DocumentType_Help="El tipo de documento determina la secuencia del documento y las reglas de proceso";

@XendraTrl(Identifier="07ceb338-5de2-ef37-b652-9af4147b79cd")
public static String es_PE_FIELD_GL_BookLine_DocumentType_Name="Tipo de Documento";

@XendraField(AD_Column_ID="C_DocType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="42d2172c-c760-af80-a1a4-75e073e17f87",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="07ceb338-5de2-ef37-b652-9af4147b79cd")
public static final String FIELDNAME_GL_BookLine_DocumentType="07ceb338-5de2-ef37-b652-9af4147b79cd";

@XendraTrl(Identifier="737c9576-1172-6f71-13d7-d336434ce878")
public static String es_PE_COLUMN_C_DocType_ID_Name="Tipo de Documento";

@XendraColumn(AD_Element_ID="099a4147-1a72-cdd0-81e0-8bdbc8c0b883",ColumnName="C_DocType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="737c9576-1172-6f71-13d7-d336434ce878",
Synchronized="2017-08-05 16:54:40.0")
/** Column name C_DocType_ID */
public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
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

@XendraTrl(Identifier="c37bfe75-7d76-2034-4380-bafbab033681")
public static String es_PE_FIELD_GL_BookLine_Book_Name="Libro";

@XendraField(AD_Column_ID="GL_Book_ID",IsCentrallyMaintained=true,
AD_Tab_ID="42d2172c-c760-af80-a1a4-75e073e17f87",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c37bfe75-7d76-2034-4380-bafbab033681")
public static final String FIELDNAME_GL_BookLine_Book="c37bfe75-7d76-2034-4380-bafbab033681";

@XendraTrl(Identifier="3df3b297-6ed4-ff41-f620-614135a75c61")
public static String es_PE_COLUMN_GL_Book_ID_Name="Book";

@XendraColumn(AD_Element_ID="ea1aa938-283c-a393-bca4-7ed1e97f2745",ColumnName="GL_Book_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3df3b297-6ed4-ff41-f620-614135a75c61",
Synchronized="2017-08-05 16:54:40.0")
/** Column name GL_Book_ID */
public static final String COLUMNNAME_GL_Book_ID = "GL_Book_ID";
/** Set Book Line.
@param GL_BookLine_ID Book Line */
public void setGL_BookLine_ID (int GL_BookLine_ID)
{
if (GL_BookLine_ID < 1) throw new IllegalArgumentException ("GL_BookLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_GL_BookLine_ID, Integer.valueOf(GL_BookLine_ID));
}
/** Get Book Line.
@return Book Line */
public int getGL_BookLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_GL_BookLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2232b5b6-9fc1-ab56-3022-152d9f0aa19b")
public static String es_PE_FIELD_GL_BookLine_BookLine_Name="Book Line";

@XendraField(AD_Column_ID="GL_BookLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="42d2172c-c760-af80-a1a4-75e073e17f87",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2232b5b6-9fc1-ab56-3022-152d9f0aa19b")
public static final String FIELDNAME_GL_BookLine_BookLine="2232b5b6-9fc1-ab56-3022-152d9f0aa19b";
/** Column name GL_BookLine_ID */
public static final String COLUMNNAME_GL_BookLine_ID = "GL_BookLine_ID";
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
@XendraTrl(Identifier="978d4bb1-9d1b-4d87-ac1a-01bb6e53f6fa")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="978d4bb1-9d1b-4d87-ac1a-01bb6e53f6fa",
Synchronized="2017-08-05 16:54:40.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Sales Transaction.
@param IsSOTrx This is a Sales Transaction */
public void setIsSOTrx (boolean IsSOTrx)
{
set_Value (COLUMNNAME_IsSOTrx, Boolean.valueOf(IsSOTrx));
}
/** Get Sales Transaction.
@return This is a Sales Transaction */
public boolean isSOTrx() 
{
Object oo = get_Value(COLUMNNAME_IsSOTrx);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="26d40727-b07f-5a3b-51fc-88b087c572f6")
public static String es_PE_FIELD_GL_BookLine_SalesTransaction_Description="Esta es una transacción de ventas";

@XendraTrl(Identifier="26d40727-b07f-5a3b-51fc-88b087c572f6")
public static String es_PE_FIELD_GL_BookLine_SalesTransaction_Help="El cuadro de verificación Transacción de Ventas indica si este ítem es una transacción de ventas";

@XendraTrl(Identifier="26d40727-b07f-5a3b-51fc-88b087c572f6")
public static String es_PE_FIELD_GL_BookLine_SalesTransaction_Name="Transacción de Ventas";

@XendraField(AD_Column_ID="IsSOTrx",IsCentrallyMaintained=true,
AD_Tab_ID="42d2172c-c760-af80-a1a4-75e073e17f87",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="26d40727-b07f-5a3b-51fc-88b087c572f6")
public static final String FIELDNAME_GL_BookLine_SalesTransaction="26d40727-b07f-5a3b-51fc-88b087c572f6";

@XendraTrl(Identifier="8cd584cf-c1f5-febd-2e5b-aaba6dc81d61")
public static String es_PE_COLUMN_IsSOTrx_Name="Transacción de Ventas";

@XendraColumn(AD_Element_ID="4084b69f-a51d-5676-4d8c-395a13e6b2df",ColumnName="IsSOTrx",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8cd584cf-c1f5-febd-2e5b-aaba6dc81d61",
Synchronized="2017-08-05 16:54:40.0")
/** Column name IsSOTrx */
public static final String COLUMNNAME_IsSOTrx = "IsSOTrx";
}
