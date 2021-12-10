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
/** Generated Model for M_MaterialProcessorLog
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_MaterialProcessorLog extends PO
{
/** Standard Constructor
@param ctx context
@param M_MaterialProcessorLog_ID id
@param trxName transaction
*/
public X_M_MaterialProcessorLog (Properties ctx, int M_MaterialProcessorLog_ID, String trxName)
{
super (ctx, M_MaterialProcessorLog_ID, trxName);
/** if (M_MaterialProcessorLog_ID == 0)
{
setIsError (false);
setM_MaterialProcessor_ID (0);
setM_MaterialProcessorLog_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_MaterialProcessorLog (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000420 */
public static int Table_ID=MTable.getTable_ID("M_MaterialProcessorLog");

@XendraTrl(Identifier="3a6a26a8-1689-4fce-a477-fb05d266926b")
public static String es_PE_TABLE_M_MaterialProcessorLog_Name="Material Processor Log";


@XendraTable(Name="Material Processor Log",AD_Package_ID="2809ac2d-7d43-20f8-05f0-a478f2e50204",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="M_MaterialProcessorLog",AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="3a6a26a8-1689-4fce-a477-fb05d266926b",Synchronized="2020-03-04 16:27:54.0")
/** TableName=M_MaterialProcessorLog */
public static final String Table_Name="M_MaterialProcessorLog";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_MaterialProcessorLog");

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
    Table_ID = MTable.getTable_ID("M_MaterialProcessorLog");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_MaterialProcessorLog[").append(get_ID()).append("]");
return sb.toString();
}
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

@XendraTrl(Identifier="7b05eef5-3101-47d9-a12b-7c64e9b32e3d")
public static String es_PE_COLUMN_Description_Name="Description";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7b05eef5-3101-47d9-a12b-7c64e9b32e3d",
Synchronized="2020-03-03 21:38:39.0")
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
@XendraTrl(Identifier="c1c3c747-4cb6-44a3-8398-4d8cdd5f7a7c")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c1c3c747-4cb6-44a3-8398-4d8cdd5f7a7c",
Synchronized="2020-03-03 21:38:39.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Error.
@param IsError An Error occured in the execution */
public void setIsError (boolean IsError)
{
set_Value (COLUMNNAME_IsError, Boolean.valueOf(IsError));
}
/** Get Error.
@return An Error occured in the execution */
public boolean isError() 
{
Object oo = get_Value(COLUMNNAME_IsError);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="d8622ab4-c5d3-407f-b7c5-d10c40406c50")
public static String es_PE_COLUMN_IsError_Name="Error";

@XendraColumn(AD_Element_ID="7a82e2b2-c09d-83e6-f469-1f1d9bae65a7",ColumnName="IsError",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d8622ab4-c5d3-407f-b7c5-d10c40406c50",
Synchronized="2020-03-03 21:38:39.0")
/** Column name IsError */
public static final String COLUMNNAME_IsError = "IsError";
/** Set Material Processor.
@param M_MaterialProcessor_ID Material Processor */
public void setM_MaterialProcessor_ID (int M_MaterialProcessor_ID)
{
if (M_MaterialProcessor_ID < 1) throw new IllegalArgumentException ("M_MaterialProcessor_ID is mandatory.");
set_Value (COLUMNNAME_M_MaterialProcessor_ID, Integer.valueOf(M_MaterialProcessor_ID));
}
/** Get Material Processor.
@return Material Processor */
public int getM_MaterialProcessor_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_MaterialProcessor_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7815934f-0979-4aa2-be68-b13f0cd88cee")
public static String es_PE_COLUMN_M_MaterialProcessor_ID_Name="Material Processor";

@XendraColumn(AD_Element_ID="e22a780c-073e-4226-9c5c-59d70068d2a1",
ColumnName="M_MaterialProcessor_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="7815934f-0979-4aa2-be68-b13f0cd88cee",Synchronized="2020-03-03 21:38:39.0")
/** Column name M_MaterialProcessor_ID */
public static final String COLUMNNAME_M_MaterialProcessor_ID = "M_MaterialProcessor_ID";
/** Set Material Processor Log.
@param M_MaterialProcessorLog_ID Material Processor Log */
public void setM_MaterialProcessorLog_ID (int M_MaterialProcessorLog_ID)
{
if (M_MaterialProcessorLog_ID < 1) throw new IllegalArgumentException ("M_MaterialProcessorLog_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_MaterialProcessorLog_ID, Integer.valueOf(M_MaterialProcessorLog_ID));
}
/** Get Material Processor Log.
@return Material Processor Log */
public int getM_MaterialProcessorLog_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_MaterialProcessorLog_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name M_MaterialProcessorLog_ID */
public static final String COLUMNNAME_M_MaterialProcessorLog_ID = "M_MaterialProcessorLog_ID";
/** Set Reference.
@param Reference Reference for this record */
public void setReference (String Reference)
{
if (Reference != null && Reference.length() > 60)
{
log.warning("Length > 60 - truncated");
Reference = Reference.substring(0,59);
}
set_Value (COLUMNNAME_Reference, Reference);
}
/** Get Reference.
@return Reference for this record */
public String getReference() 
{
String value = (String)get_Value(COLUMNNAME_Reference);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="d4afd1c0-7806-4ce7-a350-db7ac74cc16b")
public static String es_PE_COLUMN_Reference_Name="Reference";

@XendraColumn(AD_Element_ID="eba276ea-db21-0cfa-29e6-6e0d45ebff99",ColumnName="Reference",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d4afd1c0-7806-4ce7-a350-db7ac74cc16b",
Synchronized="2020-03-03 21:38:39.0")
/** Column name Reference */
public static final String COLUMNNAME_Reference = "Reference";
/** Set Summary.
@param Summary Textual summary of this request */
public void setSummary (String Summary)
{
set_Value (COLUMNNAME_Summary, Summary);
}
/** Get Summary.
@return Textual summary of this request */
public String getSummary() 
{
String value = (String)get_Value(COLUMNNAME_Summary);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="bd662d86-6723-4d08-bb15-f1c6f78909c3")
public static String es_PE_COLUMN_Summary_Name="Summary";

@XendraColumn(AD_Element_ID="94fe105c-8853-7c06-a32a-9ad75a452917",ColumnName="Summary",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="bd662d86-6723-4d08-bb15-f1c6f78909c3",
Synchronized="2020-03-03 21:38:39.0")
/** Column name Summary */
public static final String COLUMNNAME_Summary = "Summary";
/** Set Text Message.
@param TextMsg Text Message */
public void setTextMsg (String TextMsg)
{
set_Value (COLUMNNAME_TextMsg, TextMsg);
}
/** Get Text Message.
@return Text Message */
public String getTextMsg() 
{
String value = (String)get_Value(COLUMNNAME_TextMsg);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="28deef54-2ea1-4d0c-9537-e0d601cd74fc")
public static String es_PE_COLUMN_TextMsg_Name="Text Message";

@XendraColumn(AD_Element_ID="377bebfe-238a-1c79-c1a9-13afa4448222",ColumnName="TextMsg",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="28deef54-2ea1-4d0c-9537-e0d601cd74fc",
Synchronized="2020-03-03 21:38:40.0")
/** Column name TextMsg */
public static final String COLUMNNAME_TextMsg = "TextMsg";
}
