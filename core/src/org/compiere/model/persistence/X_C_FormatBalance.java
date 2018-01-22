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
/** Generated Model for C_FormatBalance
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_FormatBalance extends PO
{
/** Standard Constructor
@param ctx context
@param C_FormatBalance_ID id
@param trxName transaction
*/
public X_C_FormatBalance (Properties ctx, int C_FormatBalance_ID, String trxName)
{
super (ctx, C_FormatBalance_ID, trxName);
/** if (C_FormatBalance_ID == 0)
{
setC_FormatBalance_ID (0);
setName (null);
setSeqNo (0);
setValue (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_FormatBalance (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000208 */
public static int Table_ID=MTable.getTable_ID("C_FormatBalance");

@XendraTrl(Identifier="27d5fed9-2d64-22bd-a4c7-2bb3e8524a23")
public static String es_PE_TABLE_C_FormatBalance_Name="C_FormatBalance";

@XendraTable(Name="C_FormatBalance",Description="",Help="",TableName="C_FormatBalance",
AccessLevel="4",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,
IsDeleteable=false,IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",
ID="org.xendra.commercial",Identifier="27d5fed9-2d64-22bd-a4c7-2bb3e8524a23",
Synchronized="2017-08-16 11:41:47.0")
/** TableName=C_FormatBalance */
public static final String Table_Name="C_FormatBalance";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_FormatBalance");

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
    Table_ID = MTable.getTable_ID("C_FormatBalance");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_FormatBalance[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Account Type.
@param AccountType Indicates the type of account */
public void setAccountType (String AccountType)
{
if (AccountType != null && AccountType.length() > 1)
{
log.warning("Length > 1 - truncated");
AccountType = AccountType.substring(0,0);
}
set_Value (COLUMNNAME_AccountType, AccountType);
}
/** Get Account Type.
@return Indicates the type of account */
public String getAccountType() 
{
String value = (String)get_Value(COLUMNNAME_AccountType);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="6fcae5bc-48e8-8b00-62c0-d3dd80434bff")
public static String es_PE_COLUMN_AccountType_Name="Account Type";

@XendraColumn(AD_Element_ID="ec156e95-2067-29e9-eb38-6c9e67f8a90d",ColumnName="AccountType",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6fcae5bc-48e8-8b00-62c0-d3dd80434bff",
Synchronized="2017-08-05 16:53:40.0")
/** Column name AccountType */
public static final String COLUMNNAME_AccountType = "AccountType";
/** Set C_FormatBalance_ID.
@param C_FormatBalance_ID C_FormatBalance_ID */
public void setC_FormatBalance_ID (int C_FormatBalance_ID)
{
if (C_FormatBalance_ID < 1) throw new IllegalArgumentException ("C_FormatBalance_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_FormatBalance_ID, Integer.valueOf(C_FormatBalance_ID));
}
/** Get C_FormatBalance_ID.
@return C_FormatBalance_ID */
public int getC_FormatBalance_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_FormatBalance_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name C_FormatBalance_ID */
public static final String COLUMNNAME_C_FormatBalance_ID = "C_FormatBalance_ID";
/** Set Formula.
@param Formula Formula */
public void setFormula (String Formula)
{
set_Value (COLUMNNAME_Formula, Formula);
}
/** Get Formula.
@return Formula */
public String getFormula() 
{
String value = (String)get_Value(COLUMNNAME_Formula);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="f7162b09-20cb-229f-97ad-33c8f83b3302")
public static String es_PE_COLUMN_Formula_Name="Formula";

@XendraColumn(AD_Element_ID="3c196d22-14fb-d168-1548-058482a939f6",ColumnName="Formula",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=510,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f7162b09-20cb-229f-97ad-33c8f83b3302",
Synchronized="2017-08-05 16:53:40.0")
/** Column name Formula */
public static final String COLUMNNAME_Formula = "Formula";
/** Set formulapostfija.
@param formulapostfija formulapostfija */
public void setformulapostfija (String formulapostfija)
{
if (formulapostfija != null && formulapostfija.length() > 255)
{
log.warning("Length > 255 - truncated");
formulapostfija = formulapostfija.substring(0,254);
}
set_Value (COLUMNNAME_formulapostfija, formulapostfija);
}
/** Get formulapostfija.
@return formulapostfija */
public String getformulapostfija() 
{
String value = (String)get_Value(COLUMNNAME_formulapostfija);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="b8973f28-5db3-cca6-8902-29a11b021747")
public static String es_PE_COLUMN_formulapostfija_Name="formulapostfija";

@XendraColumn(AD_Element_ID="73d44666-7928-e8f9-2d1a-b7eb5d774622",ColumnName="formulapostfija",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b8973f28-5db3-cca6-8902-29a11b021747",
Synchronized="2017-08-05 16:53:40.0")
/** Column name formulapostfija */
public static final String COLUMNNAME_formulapostfija = "formulapostfija";
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
@XendraTrl(Identifier="42815769-3bef-4376-8257-64eb9535c74c")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="42815769-3bef-4376-8257-64eb9535c74c",
Synchronized="2017-08-05 16:53:40.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name == null) throw new IllegalArgumentException ("Name is mandatory.");
if (Name.length() > 120)
{
log.warning("Length > 120 - truncated");
Name = Name.substring(0,119);
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

@XendraTrl(Identifier="702b07c3-4c4e-f400-a383-ad0650c83d0b")
public static String es_PE_COLUMN_Name_Name="Name";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="702b07c3-4c4e-f400-a383-ad0650c83d0b",
Synchronized="2017-08-05 16:53:40.0")
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

@XendraTrl(Identifier="5fdcd6b0-85e6-a016-fb68-1942fab80017")
public static String es_PE_COLUMN_SeqNo_Name="Sequence";

@XendraColumn(AD_Element_ID="38fa26fe-b59d-fce1-c129-420b57da738b",ColumnName="SeqNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5fdcd6b0-85e6-a016-fb68-1942fab80017",
Synchronized="2017-08-05 16:53:40.0")
/** Column name SeqNo */
public static final String COLUMNNAME_SeqNo = "SeqNo";
/** Set Search Key.
@param Value Search key for the record in the format required - must be unique */
public void setValue (String Value)
{
if (Value == null) throw new IllegalArgumentException ("Value is mandatory.");
if (Value.length() > 80)
{
log.warning("Length > 80 - truncated");
Value = Value.substring(0,79);
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
@XendraTrl(Identifier="7c314e58-b1ad-cc2d-4afb-47c51acba3fd")
public static String es_PE_COLUMN_Value_Name="Search Key";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=80,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7c314e58-b1ad-cc2d-4afb-47c51acba3fd",
Synchronized="2017-08-05 16:53:40.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
}
