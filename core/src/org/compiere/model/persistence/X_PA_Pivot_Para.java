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
/** Generated Model for PA_Pivot_Para
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_PA_Pivot_Para extends PO
{
/** Standard Constructor
@param ctx context
@param PA_Pivot_Para_ID id
@param trxName transaction
*/
public X_PA_Pivot_Para (Properties ctx, int PA_Pivot_Para_ID, String trxName)
{
super (ctx, PA_Pivot_Para_ID, trxName);
/** if (PA_Pivot_Para_ID == 0)
{
setAD_Process_Para_ID (0);
setPA_Pivot_ID (0);
setPA_Pivot_Para_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_PA_Pivot_Para (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000417 */
public static int Table_ID=MTable.getTable_ID("PA_Pivot_Para");

@XendraTrl(Identifier="f8186e2b-978f-48c6-886f-b30035d9b8c1")
public static String es_PE_TABLE_PA_Pivot_Para_Name="Pivot Parameter";

@XendraTable(Name="Pivot Parameter",AD_Package_ID="34bf6e21-8c70-8fb9-604c-a300eb925459",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="PA_Pivot_Para",AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="",Identifier="f8186e2b-978f-48c6-886f-b30035d9b8c1",
Synchronized="2020-03-04 16:04:23.0")
/** TableName=PA_Pivot_Para */
public static final String Table_Name="PA_Pivot_Para";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"PA_Pivot_Para");

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
    Table_ID = MTable.getTable_ID("PA_Pivot_Para");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_PA_Pivot_Para[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Process Parameter.
@param AD_Process_Para_ID Process Parameter */
public void setAD_Process_Para_ID (int AD_Process_Para_ID)
{
if (AD_Process_Para_ID < 1) throw new IllegalArgumentException ("AD_Process_Para_ID is mandatory.");
set_Value (COLUMNNAME_AD_Process_Para_ID, Integer.valueOf(AD_Process_Para_ID));
}
/** Get Process Parameter.
@return Process Parameter */
public int getAD_Process_Para_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Process_Para_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f5c10a3a-83da-46f6-84ae-81aee46646bc")
public static String es_PE_COLUMN_AD_Process_Para_ID_Name="Process Parameter";

@XendraColumn(AD_Element_ID="ba7a1fb4-c201-c803-e146-f7bba5520ba9",ColumnName="AD_Process_Para_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f5c10a3a-83da-46f6-84ae-81aee46646bc",
Synchronized="2020-03-03 21:39:05.0")
/** Column name AD_Process_Para_ID */
public static final String COLUMNNAME_AD_Process_Para_ID = "AD_Process_Para_ID";
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

@XendraTrl(Identifier="c3974c2d-f5ca-42b9-9194-8840203eec1c")
public static String es_PE_COLUMN_AD_Reference_ID_Name="Reference";

@XendraColumn(AD_Element_ID="bf1912e9-a75f-4e1b-99b4-d04633e7777b",ColumnName="AD_Reference_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c3974c2d-f5ca-42b9-9194-8840203eec1c",
Synchronized="2020-03-03 21:39:05.0")
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

@XendraTrl(Identifier="a0cee466-8844-43e2-a34d-57b6aa1b6656")
public static String es_PE_COLUMN_AD_Reference_Value_ID_Name="Reference Key";

@XendraColumn(AD_Element_ID="1ce26254-3c83-8d1d-3506-37160c076aad",
ColumnName="AD_Reference_Value_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="a0cee466-8844-43e2-a34d-57b6aa1b6656",Synchronized="2020-03-03 21:39:05.0")
/** Column name AD_Reference_Value_ID */
public static final String COLUMNNAME_AD_Reference_Value_ID = "AD_Reference_Value_ID";
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
@XendraTrl(Identifier="79d9fd20-352b-40ec-b3c7-06a40816f10a")
public static String es_PE_COLUMN_ColumnName_Name="DB Column Name";

@XendraColumn(AD_Element_ID="fadc32aa-cd31-3fee-f9b7-0daa53df76a7",ColumnName="ColumnName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="79d9fd20-352b-40ec-b3c7-06a40816f10a",
Synchronized="2020-03-03 21:39:05.0")
/** Column name ColumnName */
public static final String COLUMNNAME_ColumnName = "ColumnName";
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

@XendraTrl(Identifier="7a83bb2b-decf-4d55-8077-efb16eb26901")
public static String es_PE_COLUMN_Description_Name="Description";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7a83bb2b-decf-4d55-8077-efb16eb26901",
Synchronized="2020-03-03 21:39:05.0")
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
@XendraTrl(Identifier="a2794575-f4f8-4297-83ae-599a432a3d81")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a2794575-f4f8-4297-83ae-599a432a3d81",
Synchronized="2020-03-03 21:39:05.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Mandatory.
@param IsMandatory Data entry is required in this column */
public void setIsMandatory (boolean IsMandatory)
{
set_Value (COLUMNNAME_IsMandatory, Boolean.valueOf(IsMandatory));
}
/** Get Mandatory.
@return Data entry is required in this column */
public boolean isMandatory() 
{
Object oo = get_Value(COLUMNNAME_IsMandatory);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="e1751747-7716-4cf6-b378-7e7a24d55ac8")
public static String es_PE_COLUMN_IsMandatory_Name="Mandatory";

@XendraColumn(AD_Element_ID="43310179-c59f-f313-de13-08d90722e38d",ColumnName="IsMandatory",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e1751747-7716-4cf6-b378-7e7a24d55ac8",
Synchronized="2020-03-03 21:39:06.0")
/** Column name IsMandatory */
public static final String COLUMNNAME_IsMandatory = "IsMandatory";
/** Set Range.
@param IsRange The parameter is a range of values */
public void setIsRange (boolean IsRange)
{
set_Value (COLUMNNAME_IsRange, Boolean.valueOf(IsRange));
}
/** Get Range.
@return The parameter is a range of values */
public boolean isRange() 
{
Object oo = get_Value(COLUMNNAME_IsRange);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="2f896f28-3b57-4096-8344-5d66dfbca23b")
public static String es_PE_COLUMN_IsRange_Name="Range";

@XendraColumn(AD_Element_ID="a574a98d-8a11-94ec-f0b6-02d6a4458384",ColumnName="IsRange",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2f896f28-3b57-4096-8344-5d66dfbca23b",
Synchronized="2020-03-03 21:39:06.0")
/** Column name IsRange */
public static final String COLUMNNAME_IsRange = "IsRange";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name != null && Name.length() > 100)
{
log.warning("Length > 100 - truncated");
Name = Name.substring(0,99);
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

@XendraTrl(Identifier="8503f253-fce7-4f5a-beff-f8e0e9f4de53")
public static String es_PE_COLUMN_Name_Name="Name";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=100,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8503f253-fce7-4f5a-beff-f8e0e9f4de53",
Synchronized="2020-03-03 21:39:06.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Performance Analysis Pivot.
@param PA_Pivot_ID Performance Analysis Pivot */
public void setPA_Pivot_ID (int PA_Pivot_ID)
{
if (PA_Pivot_ID < 1) throw new IllegalArgumentException ("PA_Pivot_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_PA_Pivot_ID, Integer.valueOf(PA_Pivot_ID));
}
/** Get Performance Analysis Pivot.
@return Performance Analysis Pivot */
public int getPA_Pivot_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PA_Pivot_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0010be90-1cf1-489a-a22e-f3600955630d")
public static String es_PE_COLUMN_PA_Pivot_ID_Name="Performance Analysis Pivot";

@XendraColumn(AD_Element_ID="88ccadcd-01b5-472d-8a15-969ee73c3de0",ColumnName="PA_Pivot_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0010be90-1cf1-489a-a22e-f3600955630d",
Synchronized="2020-03-03 21:39:06.0")
/** Column name PA_Pivot_ID */
public static final String COLUMNNAME_PA_Pivot_ID = "PA_Pivot_ID";
/** Set Pivot Parameter.
@param PA_Pivot_Para_ID Pivot Parameter */
public void setPA_Pivot_Para_ID (int PA_Pivot_Para_ID)
{
if (PA_Pivot_Para_ID < 1) throw new IllegalArgumentException ("PA_Pivot_Para_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_PA_Pivot_Para_ID, Integer.valueOf(PA_Pivot_Para_ID));
}
/** Get Pivot Parameter.
@return Pivot Parameter */
public int getPA_Pivot_Para_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PA_Pivot_Para_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name PA_Pivot_Para_ID */
public static final String COLUMNNAME_PA_Pivot_Para_ID = "PA_Pivot_Para_ID";
/** Set Default Parameter.
@param ParameterDefault Default value of the parameter */
public void setParameterDefault (String ParameterDefault)
{
if (ParameterDefault != null && ParameterDefault.length() > 60)
{
log.warning("Length > 60 - truncated");
ParameterDefault = ParameterDefault.substring(0,59);
}
set_Value (COLUMNNAME_ParameterDefault, ParameterDefault);
}
/** Get Default Parameter.
@return Default value of the parameter */
public String getParameterDefault() 
{
String value = (String)get_Value(COLUMNNAME_ParameterDefault);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="c5ecd943-124d-41e9-a9bf-c1ac25b6468f")
public static String es_PE_COLUMN_ParameterDefault_Name="Default Parameter";

@XendraColumn(AD_Element_ID="d6abb65b-a894-b4bd-e1f3-249cde072b7f",ColumnName="ParameterDefault",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c5ecd943-124d-41e9-a9bf-c1ac25b6468f",
Synchronized="2020-03-03 21:39:06.0")
/** Column name ParameterDefault */
public static final String COLUMNNAME_ParameterDefault = "ParameterDefault";
/** Set ParameterDisplay.
@param ParameterDisplay ParameterDisplay */
public void setParameterDisplay (String ParameterDisplay)
{
if (ParameterDisplay != null && ParameterDisplay.length() > 60)
{
log.warning("Length > 60 - truncated");
ParameterDisplay = ParameterDisplay.substring(0,59);
}
set_Value (COLUMNNAME_ParameterDisplay, ParameterDisplay);
}
/** Get ParameterDisplay.
@return ParameterDisplay */
public String getParameterDisplay() 
{
String value = (String)get_Value(COLUMNNAME_ParameterDisplay);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="6c4c0dd7-382f-4cb0-9582-dfd72e5887e1")
public static String es_PE_COLUMN_ParameterDisplay_Name="ParameterDisplay";

@XendraColumn(AD_Element_ID="3988f700-f89d-4a5b-88f0-ec1529030b24",ColumnName="ParameterDisplay",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6c4c0dd7-382f-4cb0-9582-dfd72e5887e1",
Synchronized="2020-03-03 21:39:06.0")
/** Column name ParameterDisplay */
public static final String COLUMNNAME_ParameterDisplay = "ParameterDisplay";
/** Set Parameter Name.
@param ParameterName Parameter Name */
public void setParameterName (String ParameterName)
{
if (ParameterName != null && ParameterName.length() > 60)
{
log.warning("Length > 60 - truncated");
ParameterName = ParameterName.substring(0,59);
}
set_Value (COLUMNNAME_ParameterName, ParameterName);
}
/** Get Parameter Name.
@return Parameter Name */
public String getParameterName() 
{
String value = (String)get_Value(COLUMNNAME_ParameterName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="55f7b53d-3c95-4434-ab3a-0dc4456389c8")
public static String es_PE_COLUMN_ParameterName_Name="Parameter Name";

@XendraColumn(AD_Element_ID="3d38409b-93d1-e6c0-4e25-a6472fbe4d03",ColumnName="ParameterName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="55f7b53d-3c95-4434-ab3a-0dc4456389c8",
Synchronized="2020-03-03 21:39:06.0")
/** Column name ParameterName */
public static final String COLUMNNAME_ParameterName = "ParameterName";
}
