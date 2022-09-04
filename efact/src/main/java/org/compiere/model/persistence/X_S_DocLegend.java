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
/** Generated Model for S_DocLegend
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_S_DocLegend extends PO
{
/** Standard Constructor
@param ctx context
@param S_DocLegend_ID id
@param trxName transaction
*/
public X_S_DocLegend (Properties ctx, int S_DocLegend_ID, String trxName)
{
super (ctx, S_DocLegend_ID, trxName);
/** if (S_DocLegend_ID == 0)
{
setS_DocLegend_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_S_DocLegend (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000430 */
public static int Table_ID=MTable.getTable_ID("S_DocLegend");

@XendraTrl(Identifier="f4bd5d90-1e4d-41a6-9e21-cc11de411725")
public static String es_PE_TABLE_S_DocLegend_Name="Doc Sunat Leyenda";

@XendraTable(Name="Doc Sunat Leyenda",AD_Package_ID="2ac04657-d663-47c2-4ec1-927ad71f1e96",
AD_Plugin_ID="",Description="",Help="",TableName="S_DocLegend",AccessLevel="3",AD_Window_ID="",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="",
Identifier="f4bd5d90-1e4d-41a6-9e21-cc11de411725",Synchronized="2022-08-31 21:46:12.0")
/** TableName=S_DocLegend */
public static final String Table_Name="S_DocLegend";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"S_DocLegend");

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
    Table_ID = MTable.getTable_ID("S_DocLegend");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_S_DocLegend[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Validation code.
@param Code Validation Code */
public void setCode (String Code)
{
if (Code != null && Code.length() > 10)
{
log.warning("Length > 10 - truncated");
Code = Code.substring(0,9);
}
set_Value (COLUMNNAME_Code, Code);
}
/** Get Validation code.
@return Validation Code */
public String getCode() 
{
String value = (String)get_Value(COLUMNNAME_Code);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="7ea852e3-1d64-4982-8767-033b01e8a9b3")
public static String es_PE_COLUMN_Code_Name="Validation code";

@XendraColumn(AD_Element_ID="4885b915-20ff-fb01-73f8-086c5ba63ba8",ColumnName="Code",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7ea852e3-1d64-4982-8767-033b01e8a9b3",
Synchronized="2022-05-23 10:39:57.0")
/** Column name Code */
public static final String COLUMNNAME_Code = "Code";
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
@XendraTrl(Identifier="5c133e30-cca7-428a-90bb-860a6f4dcfc8")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5c133e30-cca7-428a-90bb-860a6f4dcfc8",
Synchronized="2022-05-23 10:39:57.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Legend.
@param Legend Legend */
public void setLegend (String Legend)
{
if (Legend != null && Legend.length() > 4)
{
log.warning("Length > 4 - truncated");
Legend = Legend.substring(0,3);
}
set_Value (COLUMNNAME_Legend, Legend);
}
/** Get Legend.
@return Legend */
public String getLegend() 
{
return (String)get_Value(COLUMNNAME_Legend);
}

@XendraTrl(Identifier="6a3bc44e-5581-44eb-82e7-996275d044eb")
public static String es_PE_COLUMN_Legend_Name="legend";

@XendraColumn(AD_Element_ID="4f1a3032-53de-46e1-a3fd-9a2b2bc406fe",ColumnName="Legend",
AD_Reference_ID=17,AD_Reference_Value_ID="489ccd5a-706a-4a94-a60c-da4cc36c8953",AD_Val_Rule_ID="",
FieldLength=4,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6a3bc44e-5581-44eb-82e7-996275d044eb",Synchronized="2022-08-31 21:44:57.0")
/** Column name Legend */
public static final String COLUMNNAME_Legend = "Legend";
/** Set S_DocHeader_ID.
@param S_DocHeader_ID S_DocHeader_ID */
public void setS_DocHeader_ID (int S_DocHeader_ID)
{
if (S_DocHeader_ID <= 0) set_Value (COLUMNNAME_S_DocHeader_ID, null);
 else 
set_Value (COLUMNNAME_S_DocHeader_ID, Integer.valueOf(S_DocHeader_ID));
}
/** Get S_DocHeader_ID.
@return S_DocHeader_ID */
public int getS_DocHeader_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_S_DocHeader_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0c056ae4-a06b-499e-a15c-53062acf8c2f")
public static String es_PE_COLUMN_S_DocHeader_ID_Name="S_DocHeader_ID";

@XendraColumn(AD_Element_ID="51cdf354-f5f5-4380-86e3-e1607a818626",ColumnName="S_DocHeader_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0c056ae4-a06b-499e-a15c-53062acf8c2f",
Synchronized="2022-05-23 10:39:57.0")
/** Column name S_DocHeader_ID */
public static final String COLUMNNAME_S_DocHeader_ID = "S_DocHeader_ID";
/** Set Doc Sunat Leyenda.
@param S_DocLegend_ID Doc Sunat Leyenda */
public void setS_DocLegend_ID (int S_DocLegend_ID)
{
if (S_DocLegend_ID < 1) throw new IllegalArgumentException ("S_DocLegend_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_S_DocLegend_ID, Integer.valueOf(S_DocLegend_ID));
}
/** Get Doc Sunat Leyenda.
@return Doc Sunat Leyenda */
public int getS_DocLegend_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_S_DocLegend_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name S_DocLegend_ID */
public static final String COLUMNNAME_S_DocLegend_ID = "S_DocLegend_ID";
/** Set text.
@param text text */
public void settext (String text)
{
set_Value (COLUMNNAME_text, text);
}
/** Get text.
@return text */
public String gettext() 
{
String value = (String)get_Value(COLUMNNAME_text);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="d9d0d2f4-0481-44d1-a08c-e0021578956b")
public static String es_PE_COLUMN_text_Name="text";

@XendraColumn(AD_Element_ID="c6a58892-201d-41e1-940d-8896bb4f2238",ColumnName="text",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=500,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d9d0d2f4-0481-44d1-a08c-e0021578956b",
Synchronized="2022-05-23 10:39:57.0")
/** Column name text */
public static final String COLUMNNAME_text = "text";
}
