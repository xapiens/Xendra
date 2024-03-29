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
/** Generated Model for GL_BookPeriod
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_GL_BookPeriod extends PO
{
/** Standard Constructor
@param ctx context
@param GL_BookPeriod_ID id
@param trxName transaction
*/
public X_GL_BookPeriod (Properties ctx, int GL_BookPeriod_ID, String trxName)
{
super (ctx, GL_BookPeriod_ID, trxName);
/** if (GL_BookPeriod_ID == 0)
{
setC_Period_ID (0);
setGL_Book_ID (0);
setGL_BookPeriod_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_GL_BookPeriod (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000110 */
public static int Table_ID=MTable.getTable_ID("GL_BookPeriod");

@XendraTrl(Identifier="3be917e3-0f3f-4e02-be34-7bacb63fa03d")
public static String es_PE_TAB_GL_BookPeriod_Name="GL_BookPeriod";
@XendraTab(Name="GL_BookPeriod",
Description="",Help="",AD_Window_ID="5d03174a-432f-b3b2-6275-87031ef6e308",SeqNo=50,TabLevel=1,
IsSingleRow=false,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",
HasTree=false,WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="3be917e3-0f3f-4e02-be34-7bacb63fa03d",Synchronized="2019-03-26 18:17:37.0")
public static final String TABNAME_GL_BookPeriod="3be917e3-0f3f-4e02-be34-7bacb63fa03d";

@XendraTrl(Identifier="1cb5cbbd-ff35-7391-edfd-e904fa5f48e5")
public static String es_PE_TABLE_GL_BookPeriod_Name="Periodo de Libro";

@XendraTable(Name="Book Period",AD_Package_ID="2ac04657-d663-47c2-4ec1-927ad71f1e96",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="General Ledger Book Period",
Help="",TableName="GL_BookPeriod",AccessLevel="3",
AD_Window_ID="5d03174a-432f-b3b2-6275-87031ef6e308",AD_Val_Rule_ID="",IsKey=1,LoadSeq=130,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.accounting",Identifier="1cb5cbbd-ff35-7391-edfd-e904fa5f48e5",
Synchronized="2020-03-03 21:37:55.0")
/** TableName=GL_BookPeriod */
public static final String Table_Name="GL_BookPeriod";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"GL_BookPeriod");

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
    Table_ID = MTable.getTable_ID("GL_BookPeriod");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_GL_BookPeriod[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Period.
@param C_Period_ID Period of the Calendar */
public void setC_Period_ID (int C_Period_ID)
{
if (C_Period_ID < 1) throw new IllegalArgumentException ("C_Period_ID is mandatory.");
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

@XendraTrl(Identifier="92fb3070-3ec4-4f8a-b471-c02391117548")
public static String es_PE_FIELD_GL_BookPeriod_Period_Name="Período";

@XendraTrl(Identifier="92fb3070-3ec4-4f8a-b471-c02391117548")
public static String es_PE_FIELD_GL_BookPeriod_Period_Description="Período de Calendario";

@XendraTrl(Identifier="92fb3070-3ec4-4f8a-b471-c02391117548")
public static String es_PE_FIELD_GL_BookPeriod_Period_Help="El Período indica un rango de fechas exclusivo para un calendario";

@XendraField(AD_Column_ID="C_Period_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3be917e3-0f3f-4e02-be34-7bacb63fa03d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2019-03-26 18:17:37.0",
Identifier="92fb3070-3ec4-4f8a-b471-c02391117548")
public static final String FIELDNAME_GL_BookPeriod_Period="92fb3070-3ec4-4f8a-b471-c02391117548";

@XendraTrl(Identifier="9aa91dc2-ebab-e6bf-2962-3a43d8fead15")
public static String es_PE_COLUMN_C_Period_ID_Name="Período";

@XendraColumn(AD_Element_ID="8f295c04-0eb4-a8f3-829f-cc6a6bd1df1e",ColumnName="C_Period_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9aa91dc2-ebab-e6bf-2962-3a43d8fead15",
Synchronized="2019-08-30 22:22:31.0")
/** Column name C_Period_ID */
public static final String COLUMNNAME_C_Period_ID = "C_Period_ID";
/** Set Current Next.
@param CurrentNext The next number to be used */
public void setCurrentNext (int CurrentNext)
{
set_Value (COLUMNNAME_CurrentNext, Integer.valueOf(CurrentNext));
}
/** Get Current Next.
@return The next number to be used */
public int getCurrentNext() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_CurrentNext);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7215dad2-356d-4724-8f7d-e069a4bc5a03")
public static String es_PE_FIELD_GL_BookPeriod_CurrentNext_Name="Siguiente Secuencia";

@XendraTrl(Identifier="7215dad2-356d-4724-8f7d-e069a4bc5a03")
public static String es_PE_FIELD_GL_BookPeriod_CurrentNext_Description="El número siguiente a ser usado";

@XendraTrl(Identifier="7215dad2-356d-4724-8f7d-e069a4bc5a03")
public static String es_PE_FIELD_GL_BookPeriod_CurrentNext_Help="El siguiente corriente indica el número siguiente a usar para este documento";

@XendraField(AD_Column_ID="CurrentNext",IsCentrallyMaintained=true,
AD_Tab_ID="3be917e3-0f3f-4e02-be34-7bacb63fa03d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2019-03-26 18:17:37.0",
Identifier="7215dad2-356d-4724-8f7d-e069a4bc5a03")
public static final String FIELDNAME_GL_BookPeriod_CurrentNext="7215dad2-356d-4724-8f7d-e069a4bc5a03";

@XendraTrl(Identifier="60cc0b4d-4176-a6a0-b224-6595f94e75ac")
public static String es_PE_COLUMN_CurrentNext_Name="Current Next";

@XendraColumn(AD_Element_ID="3cb3c545-8207-00bd-81ee-d16aaa68f4c2",ColumnName="CurrentNext",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="60cc0b4d-4176-a6a0-b224-6595f94e75ac",
Synchronized="2019-08-30 22:22:31.0")
/** Column name CurrentNext */
public static final String COLUMNNAME_CurrentNext = "CurrentNext";
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
@XendraTrl(Identifier="75cba89d-b9bc-4ede-8784-502ff573a2b6")
public static String es_PE_FIELD_GL_BookPeriod_AccountingFactIDPerDocument_Name="ID Asiento Contable";

@XendraTrl(Identifier="75cba89d-b9bc-4ede-8784-502ff573a2b6")
public static String es_PE_FIELD_GL_BookPeriod_AccountingFactIDPerDocument_Description="Se garantiza que este ID sea unico por cada cliente/ano/documento (en la tabla de asientos).";

@XendraField(AD_Column_ID="Fact_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3be917e3-0f3f-4e02-be34-7bacb63fa03d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2019-03-26 18:17:37.0",
Identifier="75cba89d-b9bc-4ede-8784-502ff573a2b6")
public static final String FIELDNAME_GL_BookPeriod_AccountingFactIDPerDocument="75cba89d-b9bc-4ede-8784-502ff573a2b6";

@XendraTrl(Identifier="b5dff661-c390-05ff-475b-1cfbd122a92a")
public static String es_PE_COLUMN_Fact_ID_Name="ID Asiento Contable (por documento)";

@XendraColumn(AD_Element_ID="20f6c8ee-0151-735b-7a03-2006e09d8eb0",ColumnName="Fact_ID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b5dff661-c390-05ff-475b-1cfbd122a92a",
Synchronized="2019-08-30 22:22:31.0")
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

@XendraTrl(Identifier="a1a89d80-141f-4bc5-96d9-8f774aead20e")
public static String es_PE_FIELD_GL_BookPeriod_Book_Name="Book";

@XendraField(AD_Column_ID="GL_Book_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3be917e3-0f3f-4e02-be34-7bacb63fa03d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2019-03-26 18:17:37.0",
Identifier="a1a89d80-141f-4bc5-96d9-8f774aead20e")
public static final String FIELDNAME_GL_BookPeriod_Book="a1a89d80-141f-4bc5-96d9-8f774aead20e";

@XendraTrl(Identifier="2a4b53f6-8294-c88f-d879-159a71c3db70")
public static String es_PE_COLUMN_GL_Book_ID_Name="Book";

@XendraColumn(AD_Element_ID="ea1aa938-283c-a393-bca4-7ed1e97f2745",ColumnName="GL_Book_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2a4b53f6-8294-c88f-d879-159a71c3db70",
Synchronized="2019-08-30 22:22:31.0")
/** Column name GL_Book_ID */
public static final String COLUMNNAME_GL_Book_ID = "GL_Book_ID";
/** Set Book Period.
@param GL_BookPeriod_ID Book Period */
public void setGL_BookPeriod_ID (int GL_BookPeriod_ID)
{
if (GL_BookPeriod_ID < 1) throw new IllegalArgumentException ("GL_BookPeriod_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_GL_BookPeriod_ID, Integer.valueOf(GL_BookPeriod_ID));
}
/** Get Book Period.
@return Book Period */
public int getGL_BookPeriod_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_GL_BookPeriod_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="06c7e565-399d-43ab-a569-55c06185dfff")
public static String es_PE_FIELD_GL_BookPeriod_BookPeriod_Name="Book Period";

@XendraField(AD_Column_ID="GL_BookPeriod_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3be917e3-0f3f-4e02-be34-7bacb63fa03d",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2019-03-26 18:17:37.0",
Identifier="06c7e565-399d-43ab-a569-55c06185dfff")
public static final String FIELDNAME_GL_BookPeriod_BookPeriod="06c7e565-399d-43ab-a569-55c06185dfff";
/** Column name GL_BookPeriod_ID */
public static final String COLUMNNAME_GL_BookPeriod_ID = "GL_BookPeriod_ID";
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
@XendraTrl(Identifier="d7398f3e-9267-44e9-ad15-d3f6b0bcbb97")
public static String es_PE_FIELD_GL_BookPeriod_Identifier_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="3be917e3-0f3f-4e02-be34-7bacb63fa03d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=36,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2019-03-26 18:17:37.0",
Identifier="d7398f3e-9267-44e9-ad15-d3f6b0bcbb97")
public static final String FIELDNAME_GL_BookPeriod_Identifier="d7398f3e-9267-44e9-ad15-d3f6b0bcbb97";

@XendraTrl(Identifier="2d5ec061-5936-4280-93e7-6b5471c1128e")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2d5ec061-5936-4280-93e7-6b5471c1128e",
Synchronized="2019-08-30 22:22:31.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
}
