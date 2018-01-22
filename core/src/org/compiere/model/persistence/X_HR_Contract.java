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
/** Generated Model for HR_Contract
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_HR_Contract extends PO
{
/** Standard Constructor
@param ctx context
@param HR_Contract_ID id
@param trxName transaction
*/
public X_HR_Contract (Properties ctx, int HR_Contract_ID, String trxName)
{
super (ctx, HR_Contract_ID, trxName);
/** if (HR_Contract_ID == 0)
{
setHR_Contract_ID (0);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_HR_Contract (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000257 */
public static int Table_ID=MTable.getTable_ID("HR_Contract");

@XendraTrl(Identifier="8f6b524b-2231-4eeb-9680-e426f102f7df")
public static String es_PE_TABLE_HR_Contract_Name="hr_contract";

@XendraTable(Name="HR_Contract",Description="",Help="",TableName="HR_Contract",AccessLevel="3",
AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=false,
IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.humanresource",
Identifier="8f6b524b-2231-4eeb-9680-e426f102f7df",Synchronized="2017-08-16 11:42:47.0")
/** TableName=HR_Contract */
public static final String Table_Name="HR_Contract";


@XendraIndex(Name="hr_contract_value",Identifier="37804cf6-3842-45a2-a3af-a4561bde3607",
Column_Names="ad_client_id, value",IsUnique="true",
TableIdentifier="37804cf6-3842-45a2-a3af-a4561bde3607",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_hr_contract_value = "37804cf6-3842-45a2-a3af-a4561bde3607";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"HR_Contract");

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
    Table_ID = MTable.getTable_ID("HR_Contract");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_HR_Contract[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Business Partner .
@param C_BPartner_ID Identifies a Business Partner */
public void setC_BPartner_ID (int C_BPartner_ID)
{
if (C_BPartner_ID <= 0) set_Value (COLUMNNAME_C_BPartner_ID, null);
 else 
set_Value (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
}
/** Get Business Partner .
@return Identifies a Business Partner */
public int getC_BPartner_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="83f51d82-ad95-4d85-b4c0-cbee0a7088ee")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Business Partner ";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="83f51d82-ad95-4d85-b4c0-cbee0a7088ee",
Synchronized="2017-08-05 16:54:46.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set Campaign.
@param C_Campaign_ID Marketing Campaign */
public void setC_Campaign_ID (int C_Campaign_ID)
{
if (C_Campaign_ID <= 0) set_Value (COLUMNNAME_C_Campaign_ID, null);
 else 
set_Value (COLUMNNAME_C_Campaign_ID, Integer.valueOf(C_Campaign_ID));
}
/** Get Campaign.
@return Marketing Campaign */
public int getC_Campaign_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Campaign_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ac260e14-fc77-48bb-a5f3-8a94e032a8e4")
public static String es_PE_COLUMN_C_Campaign_ID_Name="Campaign";

@XendraColumn(AD_Element_ID="6cf08e31-d355-ee38-9c0b-bee20b3ea5b6",ColumnName="C_Campaign_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ac260e14-fc77-48bb-a5f3-8a94e032a8e4",
Synchronized="2017-08-05 16:54:46.0")
/** Column name C_Campaign_ID */
public static final String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
/** Set Project.
@param C_Project_ID Financial Project */
public void setC_Project_ID (int C_Project_ID)
{
if (C_Project_ID <= 0) set_Value (COLUMNNAME_C_Project_ID, null);
 else 
set_Value (COLUMNNAME_C_Project_ID, Integer.valueOf(C_Project_ID));
}
/** Get Project.
@return Financial Project */
public int getC_Project_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Project_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2bb75464-fbfa-4ad5-8520-f2d1cc2affd3")
public static String es_PE_COLUMN_C_Project_ID_Name="Project";

@XendraColumn(AD_Element_ID="16ff5dcc-9178-73dd-e618-e88bd79d573b",ColumnName="C_Project_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2bb75464-fbfa-4ad5-8520-f2d1cc2affd3",
Synchronized="2017-08-05 16:54:46.0")
/** Column name C_Project_ID */
public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";
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

@XendraTrl(Identifier="3f66b287-a18f-447b-9756-e776befd0229")
public static String es_PE_COLUMN_Description_Name="Description";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3f66b287-a18f-447b-9756-e776befd0229",
Synchronized="2017-08-05 16:54:46.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set HR_Contract.
@param HR_Contract_ID HR_Contract */
public void setHR_Contract_ID (int HR_Contract_ID)
{
if (HR_Contract_ID < 1) throw new IllegalArgumentException ("HR_Contract_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_HR_Contract_ID, Integer.valueOf(HR_Contract_ID));
}
/** Get HR_Contract.
@return HR_Contract */
public int getHR_Contract_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HR_Contract_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name HR_Contract_ID */
public static final String COLUMNNAME_HR_Contract_ID = "HR_Contract_ID";
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
@XendraTrl(Identifier="5a4fe422-6c0e-4c3b-913d-01cbcabd4a9d")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5a4fe422-6c0e-4c3b-913d-01cbcabd4a9d",
Synchronized="2017-08-05 16:54:46.0")
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

@XendraTrl(Identifier="f6b32f28-688c-4eee-9b9c-b6c04abf9c18")
public static String es_PE_COLUMN_Name_Name="Name";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f6b32f28-688c-4eee-9b9c-b6c04abf9c18",
Synchronized="2017-08-05 16:54:46.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Net Days.
@param NetDays Net Days in which payment is due */
public void setNetDays (int NetDays)
{
set_Value (COLUMNNAME_NetDays, Integer.valueOf(NetDays));
}
/** Get Net Days.
@return Net Days in which payment is due */
public int getNetDays() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_NetDays);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="edd644cc-7681-4504-9bde-97a8106284f0")
public static String es_PE_COLUMN_NetDays_Name="Net Days";

@XendraColumn(AD_Element_ID="8c6a9b99-2bf1-0a28-1149-2bfd59b7c622",ColumnName="NetDays",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="edd644cc-7681-4504-9bde-97a8106284f0",
Synchronized="2017-08-05 16:54:46.0")
/** Column name NetDays */
public static final String COLUMNNAME_NetDays = "NetDays";
/** Set Valid from.
@param ValidFrom Valid from including this date (first day) */
public void setValidFrom (Timestamp ValidFrom)
{
set_Value (COLUMNNAME_ValidFrom, ValidFrom);
}
/** Get Valid from.
@return Valid from including this date (first day) */
public Timestamp getValidFrom() 
{
return (Timestamp)get_Value(COLUMNNAME_ValidFrom);
}

@XendraTrl(Identifier="eef3efa3-0e8c-429c-8c7f-d92e794f067d")
public static String es_PE_COLUMN_ValidFrom_Name="Valid from";

@XendraColumn(AD_Element_ID="86b1171a-a6c6-0da5-1aea-3f3106450d07",ColumnName="ValidFrom",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="eef3efa3-0e8c-429c-8c7f-d92e794f067d",
Synchronized="2017-08-05 16:54:46.0")
/** Column name ValidFrom */
public static final String COLUMNNAME_ValidFrom = "ValidFrom";
/** Set Valid to.
@param ValidTo Valid to including this date (last day) */
public void setValidTo (Timestamp ValidTo)
{
set_Value (COLUMNNAME_ValidTo, ValidTo);
}
/** Get Valid to.
@return Valid to including this date (last day) */
public Timestamp getValidTo() 
{
return (Timestamp)get_Value(COLUMNNAME_ValidTo);
}

@XendraTrl(Identifier="6ab021ed-8372-447d-bd5d-9fb3a98d567f")
public static String es_PE_COLUMN_ValidTo_Name="Valid to";

@XendraColumn(AD_Element_ID="0fbe43c3-c76d-0505-0043-63adb568a68f",ColumnName="ValidTo",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6ab021ed-8372-447d-bd5d-9fb3a98d567f",
Synchronized="2017-08-05 16:54:46.0")
/** Column name ValidTo */
public static final String COLUMNNAME_ValidTo = "ValidTo";
/** Set Search Key.
@param Value Search key for the record in the format required - must be unique */
public void setValue (String Value)
{
if (Value != null && Value.length() > 40)
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
@XendraTrl(Identifier="74f67cd7-b5c2-4466-98d4-8d1348c6a619")
public static String es_PE_COLUMN_Value_Name="Search Key";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="74f67cd7-b5c2-4466-98d4-8d1348c6a619",
Synchronized="2017-08-05 16:54:46.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
}
