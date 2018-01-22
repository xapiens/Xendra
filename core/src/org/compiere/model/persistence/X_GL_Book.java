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
import org.compiere.model.reference.REF_BookType;
/** Generated Model for GL_Book
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_GL_Book extends PO
{
/** Standard Constructor
@param ctx context
@param GL_Book_ID id
@param trxName transaction
*/
public X_GL_Book (Properties ctx, int GL_Book_ID, String trxName)
{
super (ctx, GL_Book_ID, trxName);
/** if (GL_Book_ID == 0)
{
setGL_Book_ID (0);
setName (null);
setValue (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_GL_Book (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000108 */
public static int Table_ID=MTable.getTable_ID("GL_Book");

@XendraTrl(Identifier="d715ef0f-412f-7703-da50-f4ad9561284f")
public static String es_PE_TAB_GL_Book_Name="Libro";
@XendraTab(Name="GL_Book",Description="",
Help="",AD_Window_ID="5d03174a-432f-b3b2-6275-87031ef6e308",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="d715ef0f-412f-7703-da50-f4ad9561284f",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_GL_Book="d715ef0f-412f-7703-da50-f4ad9561284f";

@XendraTrl(Identifier="535359f2-f6f2-dc5f-0dbe-4f8978dc4d22")
public static String es_PE_TABLE_GL_Book_Name="Libro";

@XendraTable(Name="Book",Description="General Ledger Book",Help="",TableName="GL_Book",
AccessLevel="3",AD_Window_ID="5d03174a-432f-b3b2-6275-87031ef6e308",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=130,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.accounting",
Identifier="535359f2-f6f2-dc5f-0dbe-4f8978dc4d22",Synchronized="2017-08-16 11:42:42.0")
/** TableName=GL_Book */
public static final String Table_Name="GL_Book";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"GL_Book");

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
    Table_ID = MTable.getTable_ID("GL_Book");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_GL_Book[").append(get_ID()).append("]");
return sb.toString();
}

/** BookType AD_Reference=173791c5-e791-4998-9e07-d1d0c2fdae24 */
public static final int BOOKTYPE_AD_Reference_ID=1000058;
/** Set BookType.
@param BookType BookType */
public void setBookType (String BookType)
{
if (BookType == null || BookType.equals(REF_BookType.PLE_ProgramaLibrosElectronicos) || BookType.equals(REF_BookType.SecuenciaDeLibro));
 else throw new IllegalArgumentException ("BookType Invalid value - " + BookType + " - Reference_ID=1000058 - P - S");
if (BookType != null && BookType.length() > 1)
{
log.warning("Length > 1 - truncated");
BookType = BookType.substring(0,0);
}
set_Value (COLUMNNAME_BookType, BookType);
}
/** Get BookType.
@return BookType */
public String getBookType() 
{
return (String)get_Value(COLUMNNAME_BookType);
}

@XendraTrl(Identifier="3daf04e2-d93a-4493-b0b1-bf2a3bf4f126")
public static String es_PE_FIELD_GL_Book_BookType_Name="booktype";

@XendraField(AD_Column_ID="BookType",IsCentrallyMaintained=true,
AD_Tab_ID="d715ef0f-412f-7703-da50-f4ad9561284f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-09-17 17:13:21.0",
Identifier="3daf04e2-d93a-4493-b0b1-bf2a3bf4f126")
public static final String FIELDNAME_GL_Book_BookType="3daf04e2-d93a-4493-b0b1-bf2a3bf4f126";

@XendraTrl(Identifier="4bb7581b-f3c6-4b13-af84-8a540b6fe5cd")
public static String es_PE_COLUMN_BookType_Name="booktype";

@XendraColumn(AD_Element_ID="2cd77fcf-4728-446c-952b-162821dec3f0",ColumnName="BookType",
AD_Reference_ID=17,AD_Reference_Value_ID="173791c5-e791-4998-9e07-d1d0c2fdae24",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="4bb7581b-f3c6-4b13-af84-8a540b6fe5cd",Synchronized="2017-08-05 16:54:39.0")
/** Column name BookType */
public static final String COLUMNNAME_BookType = "BookType";
/** Set Period.
@param C_Period_ID Period of the Calendar */
public void setC_Period_ID (int C_Period_ID)
{
if (C_Period_ID <= 0) set_Value (COLUMNNAME_C_Period_ID, null);
 else 
set_Value (COLUMNNAME_C_Period_ID, Integer.valueOf(C_Period_ID));
}
/** Get Period.
@return Period of the Calendar */
public int getC_Period_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Period_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="88f5c49f-e357-8916-1839-3faea6c916ca")
public static String es_PE_FIELD_GL_Book_Period_Description="Período de Calendario";

@XendraTrl(Identifier="88f5c49f-e357-8916-1839-3faea6c916ca")
public static String es_PE_FIELD_GL_Book_Period_Help="El Período indica un rango de fechas exclusivo para un calendario";

@XendraTrl(Identifier="88f5c49f-e357-8916-1839-3faea6c916ca")
public static String es_PE_FIELD_GL_Book_Period_Name="Período";

@XendraField(AD_Column_ID="C_Period_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d715ef0f-412f-7703-da50-f4ad9561284f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="88f5c49f-e357-8916-1839-3faea6c916ca")
public static final String FIELDNAME_GL_Book_Period="88f5c49f-e357-8916-1839-3faea6c916ca";

@XendraTrl(Identifier="47a2e039-3da5-bc0c-82bc-1659a4f4a6fa")
public static String es_PE_COLUMN_C_Period_ID_Name="Período";

@XendraColumn(AD_Element_ID="8f295c04-0eb4-a8f3-829f-cc6a6bd1df1e",ColumnName="C_Period_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="47a2e039-3da5-bc0c-82bc-1659a4f4a6fa",
Synchronized="2017-08-05 16:54:39.0")
/** Column name C_Period_ID */
public static final String COLUMNNAME_C_Period_ID = "C_Period_ID";
/** Set Accounting Fact ID (per document).
@param Fact_ID This ID is guaranteed to be unique per client per year per document (in the fact table). */
public void setFact_ID (String Fact_ID)
{
if (Fact_ID != null && Fact_ID.length() > 20)
{
log.warning("Length > 20 - truncated");
Fact_ID = Fact_ID.substring(0,19);
}
set_Value (COLUMNNAME_Fact_ID, Fact_ID);
}
/** Get Accounting Fact ID (per document).
@return This ID is guaranteed to be unique per client per year per document (in the fact table). */
public String getFact_ID() 
{
String value = (String)get_Value(COLUMNNAME_Fact_ID);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="83ed729d-894e-6d88-3e2a-c9240793be86")
public static String es_PE_FIELD_GL_Book_AccountingFactIDPerDocument_Description="Se garantiza que este ID sea unico por cada cliente/ano/documento (en la tabla de asientos).";

@XendraTrl(Identifier="83ed729d-894e-6d88-3e2a-c9240793be86")
public static String es_PE_FIELD_GL_Book_AccountingFactIDPerDocument_Name="ID Asiento Contable (por documento)";

@XendraField(AD_Column_ID="Fact_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d715ef0f-412f-7703-da50-f4ad9561284f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="83ed729d-894e-6d88-3e2a-c9240793be86")
public static final String FIELDNAME_GL_Book_AccountingFactIDPerDocument="83ed729d-894e-6d88-3e2a-c9240793be86";

@XendraTrl(Identifier="14e3ce3b-1c00-919e-0475-508b34ab13f6")
public static String es_PE_COLUMN_Fact_ID_Name="ID Asiento Contable (por documento)";

@XendraColumn(AD_Element_ID="20f6c8ee-0151-735b-7a03-2006e09d8eb0",ColumnName="Fact_ID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="14e3ce3b-1c00-919e-0475-508b34ab13f6",
Synchronized="2017-08-05 16:54:39.0")
/** Column name Fact_ID */
public static final String COLUMNNAME_Fact_ID = "Fact_ID";
/** Set Book.
@param GL_Book_ID Book */
public void setGL_Book_ID (int GL_Book_ID)
{
if (GL_Book_ID < 1) throw new IllegalArgumentException ("GL_Book_ID is mandatory.");
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

@XendraTrl(Identifier="6e7bd603-b2e4-bfe8-d942-d7547fe35474")
public static String es_PE_FIELD_GL_Book_Book_Name="Book";
@XendraField(AD_Column_ID="GL_Book_ID",
IsCentrallyMaintained=true,AD_Tab_ID="d715ef0f-412f-7703-da50-f4ad9561284f",AD_FieldGroup_ID="",
IsDisplayed=false,DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="6e7bd603-b2e4-bfe8-d942-d7547fe35474")
public static final String FIELDNAME_GL_Book_Book="6e7bd603-b2e4-bfe8-d942-d7547fe35474";
/** Column name GL_Book_ID */
public static final String COLUMNNAME_GL_Book_ID = "GL_Book_ID";
/** Set Sql GROUP BY.
@param GroupByClause Fully qualified GROUP BY clause */
public void setGroupByClause (String GroupByClause)
{
set_Value (COLUMNNAME_GroupByClause, GroupByClause);
}
/** Get Sql GROUP BY.
@return Fully qualified GROUP BY clause */
public String getGroupByClause() 
{
String value = (String)get_Value(COLUMNNAME_GroupByClause);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="49dfdde6-dc8b-4d7f-b5db-3956565e46d3")
public static String es_PE_FIELD_GL_Book_SqlGROUPBY_Name="groupbyclause";

@XendraField(AD_Column_ID="GroupByClause",IsCentrallyMaintained=true,
AD_Tab_ID="d715ef0f-412f-7703-da50-f4ad9561284f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2000,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-09-17 17:13:21.0",
Identifier="49dfdde6-dc8b-4d7f-b5db-3956565e46d3")
public static final String FIELDNAME_GL_Book_SqlGROUPBY="49dfdde6-dc8b-4d7f-b5db-3956565e46d3";

@XendraTrl(Identifier="ce5c5b68-c837-4e88-bef6-6467f26a4663")
public static String es_PE_COLUMN_GroupByClause_Name="groupbyclause";

@XendraColumn(AD_Element_ID="162198ed-e8b4-4d65-b7f2-02a63c750fc6",ColumnName="GroupByClause",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ce5c5b68-c837-4e88-bef6-6467f26a4663",
Synchronized="2017-08-05 16:54:39.0")
/** Column name GroupByClause */
public static final String COLUMNNAME_GroupByClause = "GroupByClause";
/** Set HAVING BY.
@param HavingClause HAVING BY */
public void setHavingClause (String HavingClause)
{
set_Value (COLUMNNAME_HavingClause, HavingClause);
}
/** Get HAVING BY.
@return HAVING BY */
public String getHavingClause() 
{
String value = (String)get_Value(COLUMNNAME_HavingClause);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="dcd77d1c-e633-4a58-8472-b5afb42d6e58")
public static String es_PE_FIELD_GL_Book_HAVINGBY_Name="havingclause";

@XendraField(AD_Column_ID="HavingClause",IsCentrallyMaintained=true,
AD_Tab_ID="d715ef0f-412f-7703-da50-f4ad9561284f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2000,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-09-20 22:33:48.0",
Identifier="dcd77d1c-e633-4a58-8472-b5afb42d6e58")
public static final String FIELDNAME_GL_Book_HAVINGBY="dcd77d1c-e633-4a58-8472-b5afb42d6e58";

@XendraTrl(Identifier="a205135a-fdeb-4786-981a-7b9f36ba28b3")
public static String es_PE_COLUMN_HavingClause_Name="havingclause";

@XendraColumn(AD_Element_ID="40837655-5f79-4146-812e-a396ed85625a",ColumnName="HavingClause",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a205135a-fdeb-4786-981a-7b9f36ba28b3",
Synchronized="2017-08-05 16:54:39.0")
/** Column name HavingClause */
public static final String COLUMNNAME_HavingClause = "HavingClause";
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
@XendraTrl(Identifier="3e1c8d2e-657c-4a4c-8131-103cb52c7e4e")
public static String es_PE_FIELD_GL_Book_Identifier_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="d715ef0f-412f-7703-da50-f4ad9561284f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=36,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-09-17 17:13:21.0",
Identifier="3e1c8d2e-657c-4a4c-8131-103cb52c7e4e")
public static final String FIELDNAME_GL_Book_Identifier="3e1c8d2e-657c-4a4c-8131-103cb52c7e4e";

@XendraTrl(Identifier="268f2ace-3df3-42e7-bd5e-b07330ed1e4c")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="268f2ace-3df3-42e7-bd5e-b07330ed1e4c",
Synchronized="2017-08-05 16:54:39.0")
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

@XendraTrl(Identifier="98d02861-32c3-5ba5-a943-8be8c9ee6b05")
public static String es_PE_FIELD_GL_Book_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="98d02861-32c3-5ba5-a943-8be8c9ee6b05")
public static String es_PE_FIELD_GL_Book_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="98d02861-32c3-5ba5-a943-8be8c9ee6b05")
public static String es_PE_FIELD_GL_Book_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="d715ef0f-412f-7703-da50-f4ad9561284f",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=40,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="98d02861-32c3-5ba5-a943-8be8c9ee6b05")
public static final String FIELDNAME_GL_Book_Name="98d02861-32c3-5ba5-a943-8be8c9ee6b05";

@XendraTrl(Identifier="bab8c6f2-5d8f-59bd-1c7e-7325a1c5a1d1")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bab8c6f2-5d8f-59bd-1c7e-7325a1c5a1d1",
Synchronized="2017-08-05 16:54:39.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Sql ORDER BY.
@param OrderByClause Fully qualified ORDER BY clause */
public void setOrderByClause (String OrderByClause)
{
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
@XendraTrl(Identifier="cb359c80-5fbd-421e-a1fc-9b9ab7878c77")
public static String es_PE_FIELD_GL_Book_SqlORDERBY_Description="Cláusula completamente calificada ORDER BY";

@XendraTrl(Identifier="cb359c80-5fbd-421e-a1fc-9b9ab7878c77")
public static String es_PE_FIELD_GL_Book_SqlORDERBY_Help="La cláusula ORDER BY indica la cláusula SQL ORDER BY a usar para la selección del registro";

@XendraTrl(Identifier="cb359c80-5fbd-421e-a1fc-9b9ab7878c77")
public static String es_PE_FIELD_GL_Book_SqlORDERBY_Name="Cláusula ORDER BY SQL";

@XendraField(AD_Column_ID="OrderByClause",IsCentrallyMaintained=true,
AD_Tab_ID="d715ef0f-412f-7703-da50-f4ad9561284f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2000,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-09-20 22:33:48.0",
Identifier="cb359c80-5fbd-421e-a1fc-9b9ab7878c77")
public static final String FIELDNAME_GL_Book_SqlORDERBY="cb359c80-5fbd-421e-a1fc-9b9ab7878c77";

@XendraTrl(Identifier="58b07140-a263-4c21-80d8-bc9c1a25fd53")
public static String es_PE_COLUMN_OrderByClause_Name="Sql ORDER BY";

@XendraColumn(AD_Element_ID="32eea30b-0ac3-b494-48bb-535e80217e7e",ColumnName="OrderByClause",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="58b07140-a263-4c21-80d8-bc9c1a25fd53",
Synchronized="2017-08-05 16:54:39.0")
/** Column name OrderByClause */
public static final String COLUMNNAME_OrderByClause = "OrderByClause";
/** Set Processed.
@param Processed The document has been processed */
public void setProcessed (boolean Processed)
{
set_Value (COLUMNNAME_Processed, Boolean.valueOf(Processed));
}
/** Get Processed.
@return The document has been processed */
public boolean isProcessed() 
{
Object oo = get_Value(COLUMNNAME_Processed);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="a1f9d0ac-4185-60e8-e185-638e5cea5169")
public static String es_PE_FIELD_GL_Book_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="a1f9d0ac-4185-60e8-e185-638e5cea5169")
public static String es_PE_FIELD_GL_Book_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="a1f9d0ac-4185-60e8-e185-638e5cea5169")
public static String es_PE_FIELD_GL_Book_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="d715ef0f-412f-7703-da50-f4ad9561284f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2147483647,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a1f9d0ac-4185-60e8-e185-638e5cea5169")
public static final String FIELDNAME_GL_Book_Processed="a1f9d0ac-4185-60e8-e185-638e5cea5169";

@XendraTrl(Identifier="311f11fc-0689-2a51-d0e2-fb04af940b0a")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="'N'",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="311f11fc-0689-2a51-d0e2-fb04af940b0a",
Synchronized="2017-08-05 16:54:39.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
/** Set Processing date.
@param ProcessingDate Processing date */
public void setProcessingDate (String ProcessingDate)
{
if (ProcessingDate != null && ProcessingDate.length() > 20)
{
log.warning("Length > 20 - truncated");
ProcessingDate = ProcessingDate.substring(0,19);
}
set_Value (COLUMNNAME_ProcessingDate, ProcessingDate);
}
/** Get Processing date.
@return Processing date */
public String getProcessingDate() 
{
String value = (String)get_Value(COLUMNNAME_ProcessingDate);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="e8ef313d-52bd-4aa1-8add-eae9ad7af16c")
public static String es_PE_FIELD_GL_Book_ProcessingDate_Name="Fecha del Proceso";

@XendraField(AD_Column_ID="ProcessingDate",IsCentrallyMaintained=true,
AD_Tab_ID="d715ef0f-412f-7703-da50-f4ad9561284f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-09-17 17:13:22.0",
Identifier="e8ef313d-52bd-4aa1-8add-eae9ad7af16c")
public static final String FIELDNAME_GL_Book_ProcessingDate="e8ef313d-52bd-4aa1-8add-eae9ad7af16c";

@XendraTrl(Identifier="f63407ab-098e-4d98-8424-2d818c04ca17")
public static String es_PE_COLUMN_ProcessingDate_Name="Processing date";

@XendraColumn(AD_Element_ID="e5ffd38f-cf25-980f-1ffe-a121e4480937",ColumnName="ProcessingDate",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f63407ab-098e-4d98-8424-2d818c04ca17",
Synchronized="2015-08-12 20:19:45.0")
/** Column name ProcessingDate */
public static final String COLUMNNAME_ProcessingDate = "ProcessingDate";
/** Set Search Key.
@param Value Search key for the record in the format required - must be unique */
public void setValue (String Value)
{
if (Value == null) throw new IllegalArgumentException ("Value is mandatory.");
if (Value.length() > 40)
{
log.warning("Length > 40 - truncated");
Value = Value.substring(0,39);
}
set_Value (COLUMNNAME_Value, Value);
}
/** Get Search Key.
@return Search key for the record in the format required - must be unique */
public String getValue() 
{
String value = (String)get_Value(COLUMNNAME_Value);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="cc1479c0-6f37-61f9-1537-11a246e954f4")
public static String es_PE_FIELD_GL_Book_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="cc1479c0-6f37-61f9-1537-11a246e954f4")
public static String es_PE_FIELD_GL_Book_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraTrl(Identifier="cc1479c0-6f37-61f9-1537-11a246e954f4")
public static String es_PE_FIELD_GL_Book_SearchKey_Name="Clave de Búsqueda";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="d715ef0f-412f-7703-da50-f4ad9561284f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cc1479c0-6f37-61f9-1537-11a246e954f4")
public static final String FIELDNAME_GL_Book_SearchKey="cc1479c0-6f37-61f9-1537-11a246e954f4";

@XendraTrl(Identifier="c98c1a4b-eede-7015-15b3-ce2db88dc3fe")
public static String es_PE_COLUMN_Value_Name="Search Key";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c98c1a4b-eede-7015-15b3-ce2db88dc3fe",
Synchronized="2017-08-05 16:54:39.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
/** Set Sql WHERE.
@param WhereClause Fully qualified SQL WHERE clause */
public void setWhereClause (String WhereClause)
{
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
@XendraTrl(Identifier="3a207fa6-0da6-4109-8bed-f369f6b0388d")
public static String es_PE_FIELD_GL_Book_SqlWHERE_Description="Cláusula WHERE completamente calificada";

@XendraTrl(Identifier="3a207fa6-0da6-4109-8bed-f369f6b0388d")
public static String es_PE_FIELD_GL_Book_SqlWHERE_Help="La cláusula Where indica la cláusula SQL WHERE a usar para la selección del registro";

@XendraTrl(Identifier="3a207fa6-0da6-4109-8bed-f369f6b0388d")
public static String es_PE_FIELD_GL_Book_SqlWHERE_Name="Cláusula Where SQL";

@XendraField(AD_Column_ID="WhereClause",IsCentrallyMaintained=true,
AD_Tab_ID="d715ef0f-412f-7703-da50-f4ad9561284f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2000,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-09-17 17:13:22.0",
Identifier="3a207fa6-0da6-4109-8bed-f369f6b0388d")
public static final String FIELDNAME_GL_Book_SqlWHERE="3a207fa6-0da6-4109-8bed-f369f6b0388d";

@XendraTrl(Identifier="27ac7c28-a200-48e9-9c9a-a1d9a1b61245")
public static String es_PE_COLUMN_WhereClause_Name="Sql WHERE";

@XendraColumn(AD_Element_ID="7528e2a5-0b7f-8c17-e919-8343497249ca",ColumnName="WhereClause",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="27ac7c28-a200-48e9-9c9a-a1d9a1b61245",
Synchronized="2017-08-05 16:54:40.0")
/** Column name WhereClause */
public static final String COLUMNNAME_WhereClause = "WhereClause";
}
