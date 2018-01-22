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
/** Generated Model for AD_TableAnalyze
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_TableAnalyze extends PO
{
/** Standard Constructor
@param ctx context
@param AD_TableAnalyze_ID id
@param trxName transaction
*/
public X_AD_TableAnalyze (Properties ctx, int AD_TableAnalyze_ID, String trxName)
{
super (ctx, AD_TableAnalyze_ID, trxName);
/** if (AD_TableAnalyze_ID == 0)
{
setAD_TableAnalyze_ID (0);
setAD_Table_ID (0);
setFixed (false);	
// N
setProcessed (false);	
// N
setTableName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_TableAnalyze (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000126 */
public static int Table_ID=MTable.getTable_ID("AD_TableAnalyze");

@XendraTrl(Identifier="1f29a4aa-aef9-69e4-3e71-c77bf148740f")
public static String es_PE_TABLE_AD_TableAnalyze_Name="AD_TableAnalize";

@XendraTable(Name="AD_TableAnalyze",Description="",Help="",TableName="AD_TableAnalyze",
AccessLevel="6",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,
IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,PO_Window_ID="",
ID="org.xendra.dictionary",Identifier="1f29a4aa-aef9-69e4-3e71-c77bf148740f",
Synchronized="2017-08-16 11:41:02.0")
/** TableName=AD_TableAnalyze */
public static final String Table_Name="AD_TableAnalyze";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_TableAnalyze");

protected BigDecimal accessLevel = BigDecimal.valueOf(6);
/** AccessLevel
@return 6 - System - Client 
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
    Table_ID = MTable.getTable_ID("AD_TableAnalyze");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_TableAnalyze[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Action.
@param Action Indicates the Action to be performed */
public void setAction (boolean Action)
{
set_Value (COLUMNNAME_Action, Boolean.valueOf(Action));
}
/** Get Action.
@return Indicates the Action to be performed */
public boolean isAction() 
{
Object oo = get_Value(COLUMNNAME_Action);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="1b0eeb48-2550-fd1f-7e8a-a16776c1813f")
public static String es_PE_COLUMN_Action_Name="Action";

@XendraColumn(AD_Element_ID="b6288702-37a0-1060-f1a2-7db2ac231540",ColumnName="Action",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1b0eeb48-2550-fd1f-7e8a-a16776c1813f",
Synchronized="2017-08-05 16:52:53.0")
/** Column name Action */
public static final String COLUMNNAME_Action = "Action";
/** Set AD_TableAnalyze.
@param AD_TableAnalyze_ID AD_TableAnalyze */
public void setAD_TableAnalyze_ID (int AD_TableAnalyze_ID)
{
if (AD_TableAnalyze_ID < 1) throw new IllegalArgumentException ("AD_TableAnalyze_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_TableAnalyze_ID, Integer.valueOf(AD_TableAnalyze_ID));
}
/** Get AD_TableAnalyze.
@return AD_TableAnalyze */
public int getAD_TableAnalyze_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_TableAnalyze_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name AD_TableAnalyze_ID */
public static final String COLUMNNAME_AD_TableAnalyze_ID = "AD_TableAnalyze_ID";
/** Set Table.
@param AD_Table_ID Database Table information */
public void setAD_Table_ID (int AD_Table_ID)
{
if (AD_Table_ID < 1) throw new IllegalArgumentException ("AD_Table_ID is mandatory.");
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

@XendraTrl(Identifier="eedda80c-bd23-5db4-7600-c61ccf8f5a0f")
public static String es_PE_COLUMN_AD_Table_ID_Name="Table";

@XendraColumn(AD_Element_ID="270eeb02-723b-0ecc-7f56-3c67fa71a7f1",ColumnName="AD_Table_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="eedda80c-bd23-5db4-7600-c61ccf8f5a0f",
Synchronized="2017-08-05 16:52:53.0")
/** Column name AD_Table_ID */
public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
/** Set Alias.
@param Alias Defines an alternate method of indicating an account combination. */
public void setAlias (String Alias)
{
if (Alias != null && Alias.length() > 10)
{
log.warning("Length > 10 - truncated");
Alias = Alias.substring(0,9);
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
@XendraTrl(Identifier="ba29d4a9-7790-773f-2902-f553a57b2406")
public static String es_PE_COLUMN_Alias_Name="Alias";

@XendraColumn(AD_Element_ID="eb2b55b1-1094-cce9-62c7-fbcb31313519",ColumnName="Alias",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ba29d4a9-7790-773f-2902-f553a57b2406",
Synchronized="2017-08-05 16:52:53.0")
/** Column name Alias */
public static final String COLUMNNAME_Alias = "Alias";
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

@XendraTrl(Identifier="d2e2c6f2-7db5-e618-df1d-7690dfbb56b8")
public static String es_PE_COLUMN_Description_Name="Description";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d2e2c6f2-7db5-e618-df1d-7690dfbb56b8",
Synchronized="2017-08-05 16:52:53.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Fixed.
@param Fixed Fixed */
public void setFixed (boolean Fixed)
{
set_Value (COLUMNNAME_Fixed, Boolean.valueOf(Fixed));
}
/** Get Fixed.
@return Fixed */
public boolean isFixed() 
{
Object oo = get_Value(COLUMNNAME_Fixed);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="d13576ba-e856-57a3-eeda-a9010b40f7eb")
public static String es_PE_COLUMN_Fixed_Name="fixed";

@XendraColumn(AD_Element_ID="1f890602-31cd-7864-0268-0925877fcbb7",ColumnName="Fixed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d13576ba-e856-57a3-eeda-a9010b40f7eb",
Synchronized="2017-08-05 16:52:53.0")
/** Column name Fixed */
public static final String COLUMNNAME_Fixed = "Fixed";
/** Set Hint.
@param Hint Hint */
public void setHint (String Hint)
{
set_Value (COLUMNNAME_Hint, Hint);
}
/** Get Hint.
@return Hint */
public String getHint() 
{
String value = (String)get_Value(COLUMNNAME_Hint);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="7ab2523b-e66d-2ea8-d24d-9ce2d77740b4")
public static String es_PE_COLUMN_Hint_Name="hint";

@XendraColumn(AD_Element_ID="f2686a60-9a95-1658-94c2-d502a46b8dee",ColumnName="Hint",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=500,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7ab2523b-e66d-2ea8-d24d-9ce2d77740b4",
Synchronized="2017-08-05 16:52:53.0")
/** Column name Hint */
public static final String COLUMNNAME_Hint = "Hint";
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
@XendraTrl(Identifier="4df71cda-3e70-483b-b56e-1db4cc4b5a6f")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4df71cda-3e70-483b-b56e-1db4cc4b5a6f",
Synchronized="2017-08-05 16:52:53.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Problem.
@param Problem Problem */
public void setProblem (String Problem)
{
set_Value (COLUMNNAME_Problem, Problem);
}
/** Get Problem.
@return Problem */
public String getProblem() 
{
String value = (String)get_Value(COLUMNNAME_Problem);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="84fc4b32-8d38-f3d8-d59e-f78018b58dd1")
public static String es_PE_COLUMN_Problem_Name="problem";

@XendraColumn(AD_Element_ID="a6d937b5-f2d2-6d64-4ac1-f13a22cd7886",ColumnName="Problem",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=500,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="84fc4b32-8d38-f3d8-d59e-f78018b58dd1",
Synchronized="2017-08-05 16:52:53.0")
/** Column name Problem */
public static final String COLUMNNAME_Problem = "Problem";
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

@XendraTrl(Identifier="a7ba1982-b741-f53f-2e14-1715a074d5ab")
public static String es_PE_COLUMN_Processed_Name="Processed";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a7ba1982-b741-f53f-2e14-1715a074d5ab",
Synchronized="2017-08-05 16:52:53.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
/** Set Processing date.
@param ProcessingDate Processing date */
public void setProcessingDate (Timestamp ProcessingDate)
{
set_Value (COLUMNNAME_ProcessingDate, ProcessingDate);
}
/** Get Processing date.
@return Processing date */
public Timestamp getProcessingDate() 
{
return (Timestamp)get_Value(COLUMNNAME_ProcessingDate);
}

@XendraTrl(Identifier="5f318cc6-46aa-9d55-7ef8-a66ba90d50b1")
public static String es_PE_COLUMN_ProcessingDate_Name="Processing date";

@XendraColumn(AD_Element_ID="e5ffd38f-cf25-980f-1ffe-a121e4480937",ColumnName="ProcessingDate",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5f318cc6-46aa-9d55-7ef8-a66ba90d50b1",
Synchronized="2017-08-05 16:52:53.0")
/** Column name ProcessingDate */
public static final String COLUMNNAME_ProcessingDate = "ProcessingDate";
/** Set Reference.
@param Reference Reference for this record */
public void setReference (String Reference)
{
if (Reference != null && Reference.length() > 255)
{
log.warning("Length > 255 - truncated");
Reference = Reference.substring(0,254);
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
@XendraTrl(Identifier="af896b0a-a950-3cfe-0476-61ffd8425c51")
public static String es_PE_COLUMN_Reference_Name="Reference";

@XendraColumn(AD_Element_ID="eba276ea-db21-0cfa-29e6-6e0d45ebff99",ColumnName="Reference",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="af896b0a-a950-3cfe-0476-61ffd8425c51",
Synchronized="2017-08-05 16:52:53.0")
/** Column name Reference */
public static final String COLUMNNAME_Reference = "Reference";
/** Set SQLStatement.
@param SQLStatement SQLStatement */
public void setSQLStatement (String SQLStatement)
{
set_Value (COLUMNNAME_SQLStatement, SQLStatement);
}
/** Get SQLStatement.
@return SQLStatement */
public String getSQLStatement() 
{
String value = (String)get_Value(COLUMNNAME_SQLStatement);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="62e13054-7cf2-fe1b-e54b-b36d71cb1c4d")
public static String es_PE_COLUMN_SQLStatement_Name="SQLStatement";

@XendraColumn(AD_Element_ID="bd021835-c731-c102-53c7-6132657a0e47",ColumnName="SQLStatement",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="62e13054-7cf2-fe1b-e54b-b36d71cb1c4d",
Synchronized="2017-08-05 16:52:53.0")
/** Column name SQLStatement */
public static final String COLUMNNAME_SQLStatement = "SQLStatement";
/** Set Statistic Count.
@param Statistic_Count Internal statistics how often the entity was used */
public void setStatistic_Count (int Statistic_Count)
{
set_Value (COLUMNNAME_Statistic_Count, Integer.valueOf(Statistic_Count));
}
/** Get Statistic Count.
@return Internal statistics how often the entity was used */
public int getStatistic_Count() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Statistic_Count);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="da5e3974-4d18-d137-3d11-ad3be177ec64")
public static String es_PE_COLUMN_Statistic_Count_Name="Statistic Count";

@XendraColumn(AD_Element_ID="0decf1d6-f75d-a96d-20b2-1c94bac69359",ColumnName="Statistic_Count",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="da5e3974-4d18-d137-3d11-ad3be177ec64",
Synchronized="2017-08-05 16:52:53.0")
/** Column name Statistic_Count */
public static final String COLUMNNAME_Statistic_Count = "Statistic_Count";
/** Set DB Table Name.
@param TableName Name of the table in the database */
public void setTableName (String TableName)
{
if (TableName == null) throw new IllegalArgumentException ("TableName is mandatory.");
if (TableName.length() > 40)
{
log.warning("Length > 40 - truncated");
TableName = TableName.substring(0,39);
}
set_Value (COLUMNNAME_TableName, TableName);
}
/** Get DB Table Name.
@return Name of the table in the database */
public String getTableName() 
{
String value = (String)get_Value(COLUMNNAME_TableName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="97032255-d2fe-7e87-691b-ab20e16f76ff")
public static String es_PE_COLUMN_TableName_Name="DB Table Name";

@XendraColumn(AD_Element_ID="be0b8df8-a2da-2b62-065c-960faee503eb",ColumnName="TableName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="97032255-d2fe-7e87-691b-ab20e16f76ff",
Synchronized="2017-08-05 16:52:53.0")
/** Column name TableName */
public static final String COLUMNNAME_TableName = "TableName";
}
