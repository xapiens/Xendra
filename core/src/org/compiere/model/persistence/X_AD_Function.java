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
/** Generated Model for AD_Function
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Function extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Function_ID id
@param trxName transaction
*/
public X_AD_Function (Properties ctx, int AD_Function_ID, String trxName)
{
super (ctx, AD_Function_ID, trxName);
/** if (AD_Function_ID == 0)
{
setAD_Function_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Function (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000251 */
public static int Table_ID=MTable.getTable_ID("AD_Function");

@XendraTrl(Identifier="552cf0c4-6520-a7c3-027d-0d3c02611231")
public static String es_PE_TABLE_AD_Function_Name="Function";

@XendraTable(Name="Function",Description="",Help="",TableName="AD_Function",AccessLevel="4",
AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,
IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="552cf0c4-6520-a7c3-027d-0d3c02611231",Synchronized="2017-08-16 11:40:18.0")
/** TableName=AD_Function */
public static final String Table_Name="AD_Function";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Function");

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
    Table_ID = MTable.getTable_ID("AD_Function");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Function[").append(get_ID()).append("]");
return sb.toString();
}
/** Set AD_Function_ID.
@param AD_Function_ID AD_Function_ID */
public void setAD_Function_ID (int AD_Function_ID)
{
if (AD_Function_ID < 1) throw new IllegalArgumentException ("AD_Function_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Function_ID, Integer.valueOf(AD_Function_ID));
}
/** Get AD_Function_ID.
@return AD_Function_ID */
public int getAD_Function_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Function_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name AD_Function_ID */
public static final String COLUMNNAME_AD_Function_ID = "AD_Function_ID";
/** Set Arguments.
@param Arguments Arguments */
public void setArguments (String Arguments)
{
set_Value (COLUMNNAME_Arguments, Arguments);
}
/** Get Arguments.
@return Arguments */
public String getArguments() 
{
String value = (String)get_Value(COLUMNNAME_Arguments);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="cd2817ee-de7d-c371-51d9-fd5ee1fb06c9")
public static String es_PE_COLUMN_Arguments_Name="Arguments";

@XendraColumn(AD_Element_ID="511e5353-ed6f-f5fb-96d2-a0b78ca1f71f",ColumnName="Arguments",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="cd2817ee-de7d-c371-51d9-fd5ee1fb06c9",
Synchronized="2017-08-05 16:52:32.0")
/** Column name Arguments */
public static final String COLUMNNAME_Arguments = "Arguments";
/** Set Validation code.
@param Code Validation Code */
public void setCode (String Code)
{
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
@XendraTrl(Identifier="67d78767-5763-4ae6-a169-b40c1f99927b")
public static String es_PE_COLUMN_Code_Name="Validation code";

@XendraColumn(AD_Element_ID="4885b915-20ff-fb01-73f8-086c5ba63ba8",ColumnName="Code",
AD_Reference_ID=36,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=0,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="67d78767-5763-4ae6-a169-b40c1f99927b",
Synchronized="2015-08-16 21:44:39.0")
/** Column name Code */
public static final String COLUMNNAME_Code = "Code";
/** Set Comments.
@param Comments Comments or additional information */
public void setComments (String Comments)
{
set_Value (COLUMNNAME_Comments, Comments);
}
/** Get Comments.
@return Comments or additional information */
public String getComments() 
{
String value = (String)get_Value(COLUMNNAME_Comments);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="cb310dda-0616-49cd-9c3b-a013cd0b0ccf")
public static String es_PE_COLUMN_Comments_Name="Comments";

@XendraColumn(AD_Element_ID="68725fe2-3419-b727-d8d4-8bf5d0d8cfc2",ColumnName="Comments",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cb310dda-0616-49cd-9c3b-a013cd0b0ccf",
Synchronized="2014-05-30 08:06:17.0")
/** Column name Comments */
public static final String COLUMNNAME_Comments = "Comments";
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

@XendraTrl(Identifier="96a239d0-4cd9-2718-2bc4-decc1758ac99")
public static String es_PE_COLUMN_Description_Name="Description";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="96a239d0-4cd9-2718-2bc4-decc1758ac99",
Synchronized="2017-08-05 16:52:32.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Extension.
@param Extension Extension */
public void setExtension (String Extension)
{
if (Extension != null && Extension.length() > 255)
{
log.warning("Length > 255 - truncated");
Extension = Extension.substring(0,254);
}
set_Value (COLUMNNAME_Extension, Extension);
}
/** Get Extension.
@return Extension */
public String getExtension() 
{
String value = (String)get_Value(COLUMNNAME_Extension);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="9d3903f6-a520-406c-aef2-eacb75de2762")
public static String es_PE_COLUMN_Extension_Name="Extension";

@XendraColumn(AD_Element_ID="a6ec9764-7bbc-404e-870c-230ac4042a48",ColumnName="Extension",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9d3903f6-a520-406c-aef2-eacb75de2762",
Synchronized="2017-08-05 16:52:32.0")
/** Column name Extension */
public static final String COLUMNNAME_Extension = "Extension";
/** Set FunctionName.
@param FunctionName FunctionName */
public void setFunctionName (String FunctionName)
{
if (FunctionName != null && FunctionName.length() > 255)
{
log.warning("Length > 255 - truncated");
FunctionName = FunctionName.substring(0,254);
}
set_Value (COLUMNNAME_FunctionName, FunctionName);
}
/** Get FunctionName.
@return FunctionName */
public String getFunctionName() 
{
String value = (String)get_Value(COLUMNNAME_FunctionName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="98dce2e5-2b85-4521-8b71-f2d394a37c8b")
public static String es_PE_COLUMN_FunctionName_Name="functionname";

@XendraColumn(AD_Element_ID="3ef9c213-7272-4f56-9675-7fa6605035f2",ColumnName="FunctionName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="98dce2e5-2b85-4521-8b71-f2d394a37c8b",
Synchronized="2015-08-16 21:44:44.0")
/** Column name FunctionName */
public static final String COLUMNNAME_FunctionName = "FunctionName";
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
@XendraTrl(Identifier="13a7fd8a-debb-9a98-fcc4-9f91ada66b0f")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="13a7fd8a-debb-9a98-fcc4-9f91ada66b0f",
Synchronized="2017-08-05 16:52:33.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Language.
@param Language Language */
public void setLanguage (String Language)
{
if (Language != null && Language.length() > 10)
{
log.warning("Length > 10 - truncated");
Language = Language.substring(0,9);
}
set_Value (COLUMNNAME_Language, Language);
}
/** Get Language.
@return Language */
public String getLanguage() 
{
String value = (String)get_Value(COLUMNNAME_Language);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="671e2545-7df0-3429-9cd7-7d2df60e1f8a")
public static String es_PE_COLUMN_Language_Name="Language";

@XendraColumn(AD_Element_ID="577babf0-5d7d-62b0-192b-e15d2df9e802",ColumnName="Language",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="671e2545-7df0-3429-9cd7-7d2df60e1f8a",
Synchronized="2017-08-05 16:52:33.0")
/** Column name Language */
public static final String COLUMNNAME_Language = "Language";
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

@XendraTrl(Identifier="2f9bece1-976f-41e8-a739-a9b45d9f8e90")
public static String es_PE_COLUMN_Line_Name="Line No";

@XendraColumn(AD_Element_ID="986ef077-61da-f9cf-1c6d-aefe3a35113b",ColumnName="Line",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2f9bece1-976f-41e8-a739-a9b45d9f8e90",
Synchronized="2017-08-05 16:52:33.0")
/** Column name Line */
public static final String COLUMNNAME_Line = "Line";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name != null && Name.length() > 255)
{
log.warning("Length > 255 - truncated");
Name = Name.substring(0,254);
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

@XendraTrl(Identifier="8b1b6f82-42d5-af20-2d68-ce957beb5638")
public static String es_PE_COLUMN_Name_Name="Name";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8b1b6f82-42d5-af20-2d68-ce957beb5638",
Synchronized="2017-08-05 16:52:33.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Output.
@param Output Output */
public void setOutput (String Output)
{
if (Output != null && Output.length() > 50)
{
log.warning("Length > 50 - truncated");
Output = Output.substring(0,49);
}
set_Value (COLUMNNAME_Output, Output);
}
/** Get Output.
@return Output */
public String getOutput() 
{
String value = (String)get_Value(COLUMNNAME_Output);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="9bb21ab1-513a-4864-afd1-cee83a1f820b")
public static String es_PE_COLUMN_Output_Name="Output";

@XendraColumn(AD_Element_ID="91d82db8-d14d-6ab1-a11c-4c532bfd0e35",ColumnName="Output",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=50,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9bb21ab1-513a-4864-afd1-cee83a1f820b",
Synchronized="2017-08-05 16:52:33.0")
/** Column name Output */
public static final String COLUMNNAME_Output = "Output";
/** Set Owner.
@param Owner Owner */
public void setOwner (String Owner)
{
if (Owner != null && Owner.length() > 10)
{
log.warning("Length > 10 - truncated");
Owner = Owner.substring(0,9);
}
set_Value (COLUMNNAME_Owner, Owner);
}
/** Get Owner.
@return Owner */
public String getOwner() 
{
String value = (String)get_Value(COLUMNNAME_Owner);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="26a54637-334a-a333-198d-e45db376622d")
public static String es_PE_COLUMN_Owner_Name="Owner";

@XendraColumn(AD_Element_ID="45bfcd72-f729-6be1-072c-8a346be684e8",ColumnName="Owner",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="26a54637-334a-a333-198d-e45db376622d",
Synchronized="2017-08-05 16:52:33.0")
/** Column name Owner */
public static final String COLUMNNAME_Owner = "Owner";
/** Set Synchronized.
@param Synchronized Synchronized */
public void setSynchronized (Timestamp Synchronized)
{
set_Value (COLUMNNAME_Synchronized, Synchronized);
}
/** Get Synchronized.
@return Synchronized */
public Timestamp getSynchronized() 
{
return (Timestamp)get_Value(COLUMNNAME_Synchronized);
}

@XendraTrl(Identifier="81f0b391-8ac4-9485-1d1e-0e7daf3753ae")
public static String es_PE_COLUMN_Synchronized_Name="Synchronized";

@XendraColumn(AD_Element_ID="08f1e976-ceeb-f830-9d75-bf94f13a98ce",ColumnName="Synchronized",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="81f0b391-8ac4-9485-1d1e-0e7daf3753ae",
Synchronized="2017-08-05 16:52:33.0")
/** Column name Synchronized */
public static final String COLUMNNAME_Synchronized = "Synchronized";
/** Set Type.
@param Type Type of Validation (SQL, Java Script, Java Language) */
public void setType (boolean Type)
{
set_Value (COLUMNNAME_Type, Boolean.valueOf(Type));
}
/** Get Type.
@return Type of Validation (SQL, Java Script, Java Language) */
public boolean isType() 
{
Object oo = get_Value(COLUMNNAME_Type);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="2137d5fa-dc6e-fbe7-d186-e1cffb7464a0")
public static String es_PE_COLUMN_Type_Name="Type";

@XendraColumn(AD_Element_ID="25f95bd2-be42-03fc-c8d2-a7103835133c",ColumnName="Type",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2137d5fa-dc6e-fbe7-d186-e1cffb7464a0",
Synchronized="2017-08-05 16:52:33.0")
/** Column name Type */
public static final String COLUMNNAME_Type = "Type";
}
