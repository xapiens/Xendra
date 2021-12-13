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
/** Generated Model for C_JobRemuneration
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_JobRemuneration extends PO
{
/** Standard Constructor
@param ctx context
@param C_JobRemuneration_ID id
@param trxName transaction
*/
public X_C_JobRemuneration (Properties ctx, int C_JobRemuneration_ID, String trxName)
{
super (ctx, C_JobRemuneration_ID, trxName);
/** if (C_JobRemuneration_ID == 0)
{
setC_Job_ID (0);
setC_JobRemuneration_ID (0);
setC_Remuneration_ID (0);
setValidFrom (new Timestamp(System.currentTimeMillis()));
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_JobRemuneration (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=793 */
public static int Table_ID=MTable.getTable_ID("C_JobRemuneration");

@XendraTrl(Identifier="5c7f84f5-c01e-5558-3a1b-393ad8d4a2d3")
public static String es_PE_TAB_PositionRemuneration_Description="Mantener remuneración de la posición";

@XendraTrl(Identifier="5c7f84f5-c01e-5558-3a1b-393ad8d4a2d3")
public static String es_PE_TAB_PositionRemuneration_Name="Remuneracion de la Posición";

@XendraTab(Name="Position Remuneration",Description="Maintain Position Remuneration",Help="",
AD_Window_ID="5430bec6-fb8a-fb45-67e1-794d63718e0c",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="54417ee4-fa1d-7fd3-9cdb-6bbbee9033c4",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="5c7f84f5-c01e-5558-3a1b-393ad8d4a2d3",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_PositionRemuneration="5c7f84f5-c01e-5558-3a1b-393ad8d4a2d3";

@XendraTrl(Identifier="79ec81ce-0375-7005-1e93-38dcba4f69a3")
public static String es_PE_TAB_Remuneration_Description="Posición de remuneración";

@XendraTrl(Identifier="79ec81ce-0375-7005-1e93-38dcba4f69a3")
public static String es_PE_TAB_Remuneration_Name="Remuneración";
@XendraTab(Name="Remuneration",
Description="Position Remuneration",Help="",AD_Window_ID="af07de27-ee33-4462-55ef-e93e806652ca",
SeqNo=30,TabLevel=1,IsSingleRow=false,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="66a8074b-dccc-ceee-a2de-13d83afac62a",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="79ec81ce-0375-7005-1e93-38dcba4f69a3",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Remuneration="79ec81ce-0375-7005-1e93-38dcba4f69a3";

@XendraTrl(Identifier="a023bc8b-8cb4-4012-e96d-77ea4b20704c")
public static String es_PE_TABLE_C_JobRemuneration_Name="Remuneración de la Posición";


@XendraTable(Name="Position Remuneration",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="C_JobRemuneration",AccessLevel="2",AD_Window_ID="5430bec6-fb8a-fb45-67e1-794d63718e0c",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="a023bc8b-8cb4-4012-e96d-77ea4b20704c",Synchronized="2020-03-03 21:37:09.0")
/** TableName=C_JobRemuneration */
public static final String Table_Name="C_JobRemuneration";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_JobRemuneration");

protected BigDecimal accessLevel = BigDecimal.valueOf(2);
/** AccessLevel
@return 2 - Client 
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
    Table_ID = MTable.getTable_ID("C_JobRemuneration");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_JobRemuneration[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Position.
@param C_Job_ID Job Position */
public void setC_Job_ID (int C_Job_ID)
{
if (C_Job_ID < 1) throw new IllegalArgumentException ("C_Job_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Job_ID, Integer.valueOf(C_Job_ID));
}
/** Get Position.
@return Job Position */
public int getC_Job_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Job_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getC_Job_ID()));
}

@XendraTrl(Identifier="5d60f6a9-cc82-c17b-b4b0-3466d13a8e58")
public static String es_PE_FIELD_Remuneration_Position_Name="Posición";

@XendraTrl(Identifier="5d60f6a9-cc82-c17b-b4b0-3466d13a8e58")
public static String es_PE_FIELD_Remuneration_Position_Description="Posición del trabajo";

@XendraField(AD_Column_ID="C_Job_ID",IsCentrallyMaintained=true,
AD_Tab_ID="79ec81ce-0375-7005-1e93-38dcba4f69a3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5d60f6a9-cc82-c17b-b4b0-3466d13a8e58")
public static final String FIELDNAME_Remuneration_Position="5d60f6a9-cc82-c17b-b4b0-3466d13a8e58";

@XendraTrl(Identifier="696e15be-80a3-1a76-edfa-16ee7bba55fb")
public static String es_PE_FIELD_PositionRemuneration_Position_Name="Posición";

@XendraTrl(Identifier="696e15be-80a3-1a76-edfa-16ee7bba55fb")
public static String es_PE_FIELD_PositionRemuneration_Position_Description="Posición del trabajo";

@XendraField(AD_Column_ID="C_Job_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5c7f84f5-c01e-5558-3a1b-393ad8d4a2d3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="696e15be-80a3-1a76-edfa-16ee7bba55fb")
public static final String FIELDNAME_PositionRemuneration_Position="696e15be-80a3-1a76-edfa-16ee7bba55fb";

@XendraTrl(Identifier="66a8074b-dccc-ceee-a2de-13d83afac62a")
public static String es_PE_COLUMN_C_Job_ID_Name="Posición";

@XendraColumn(AD_Element_ID="90c49ce9-ecea-a060-14e0-eca90ed486ad",ColumnName="C_Job_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="66a8074b-dccc-ceee-a2de-13d83afac62a",
Synchronized="2019-08-30 22:21:46.0")
/** Column name C_Job_ID */
public static final String COLUMNNAME_C_Job_ID = "C_Job_ID";
/** Set Position Remuneration.
@param C_JobRemuneration_ID Remuneration for the Position */
public void setC_JobRemuneration_ID (int C_JobRemuneration_ID)
{
if (C_JobRemuneration_ID < 1) throw new IllegalArgumentException ("C_JobRemuneration_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_JobRemuneration_ID, Integer.valueOf(C_JobRemuneration_ID));
}
/** Get Position Remuneration.
@return Remuneration for the Position */
public int getC_JobRemuneration_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_JobRemuneration_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c419f325-b3e4-0ff9-25ef-fc5d3754aa61")
public static String es_PE_FIELD_Remuneration_PositionRemuneration_Name="Remuneración de la Posición";

@XendraTrl(Identifier="c419f325-b3e4-0ff9-25ef-fc5d3754aa61")
public static String es_PE_FIELD_Remuneration_PositionRemuneration_Description="Remuneración de la Posición";

@XendraField(AD_Column_ID="C_JobRemuneration_ID",IsCentrallyMaintained=true,
AD_Tab_ID="79ec81ce-0375-7005-1e93-38dcba4f69a3",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c419f325-b3e4-0ff9-25ef-fc5d3754aa61")
public static final String FIELDNAME_Remuneration_PositionRemuneration="c419f325-b3e4-0ff9-25ef-fc5d3754aa61";

@XendraTrl(Identifier="ff01e939-0470-4cd7-1deb-3de217330cf4")
public static String es_PE_FIELD_PositionRemuneration_PositionRemuneration_Name="Remuneración de la Posición";

@XendraTrl(Identifier="ff01e939-0470-4cd7-1deb-3de217330cf4")
public static String es_PE_FIELD_PositionRemuneration_PositionRemuneration_Description="Remuneración de la Posición";

@XendraField(AD_Column_ID="C_JobRemuneration_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5c7f84f5-c01e-5558-3a1b-393ad8d4a2d3",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ff01e939-0470-4cd7-1deb-3de217330cf4")
public static final String FIELDNAME_PositionRemuneration_PositionRemuneration="ff01e939-0470-4cd7-1deb-3de217330cf4";
/** Column name C_JobRemuneration_ID */
public static final String COLUMNNAME_C_JobRemuneration_ID = "C_JobRemuneration_ID";
/** Set Remuneration.
@param C_Remuneration_ID Wage or Salary */
public void setC_Remuneration_ID (int C_Remuneration_ID)
{
if (C_Remuneration_ID < 1) throw new IllegalArgumentException ("C_Remuneration_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Remuneration_ID, Integer.valueOf(C_Remuneration_ID));
}
/** Get Remuneration.
@return Wage or Salary */
public int getC_Remuneration_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Remuneration_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="94db1b74-2095-e8ab-7fa8-2d41d6097614")
public static String es_PE_FIELD_Remuneration_Remuneration_Name="Remuneración";

@XendraTrl(Identifier="94db1b74-2095-e8ab-7fa8-2d41d6097614")
public static String es_PE_FIELD_Remuneration_Remuneration_Description="Salario ó sueldo.";

@XendraField(AD_Column_ID="C_Remuneration_ID",IsCentrallyMaintained=true,
AD_Tab_ID="79ec81ce-0375-7005-1e93-38dcba4f69a3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="94db1b74-2095-e8ab-7fa8-2d41d6097614")
public static final String FIELDNAME_Remuneration_Remuneration="94db1b74-2095-e8ab-7fa8-2d41d6097614";

@XendraTrl(Identifier="47251151-b0ec-9b0d-56c9-decf0bfdb790")
public static String es_PE_FIELD_PositionRemuneration_Remuneration_Name="Remuneración";

@XendraTrl(Identifier="47251151-b0ec-9b0d-56c9-decf0bfdb790")
public static String es_PE_FIELD_PositionRemuneration_Remuneration_Description="Salario ó sueldo.";

@XendraField(AD_Column_ID="C_Remuneration_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5c7f84f5-c01e-5558-3a1b-393ad8d4a2d3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="47251151-b0ec-9b0d-56c9-decf0bfdb790")
public static final String FIELDNAME_PositionRemuneration_Remuneration="47251151-b0ec-9b0d-56c9-decf0bfdb790";

@XendraTrl(Identifier="54417ee4-fa1d-7fd3-9cdb-6bbbee9033c4")
public static String es_PE_COLUMN_C_Remuneration_ID_Name="Remuneración";

@XendraColumn(AD_Element_ID="6b51a170-2063-47d0-af92-c5ed3408a51e",ColumnName="C_Remuneration_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="54417ee4-fa1d-7fd3-9cdb-6bbbee9033c4",
Synchronized="2019-08-30 22:21:46.0")
/** Column name C_Remuneration_ID */
public static final String COLUMNNAME_C_Remuneration_ID = "C_Remuneration_ID";
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

@XendraTrl(Identifier="1c6b861e-ef26-ae7b-1bd2-683a4af6463a")
public static String es_PE_FIELD_Remuneration_Description_Name="Observación";

@XendraTrl(Identifier="1c6b861e-ef26-ae7b-1bd2-683a4af6463a")
public static String es_PE_FIELD_Remuneration_Description_Description="Observación";

@XendraTrl(Identifier="1c6b861e-ef26-ae7b-1bd2-683a4af6463a")
public static String es_PE_FIELD_Remuneration_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="79ec81ce-0375-7005-1e93-38dcba4f69a3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1c6b861e-ef26-ae7b-1bd2-683a4af6463a")
public static final String FIELDNAME_Remuneration_Description="1c6b861e-ef26-ae7b-1bd2-683a4af6463a";

@XendraTrl(Identifier="0a278237-b28f-4bdf-528c-9e69c359fdfd")
public static String es_PE_FIELD_PositionRemuneration_Description_Name="Observación";

@XendraTrl(Identifier="0a278237-b28f-4bdf-528c-9e69c359fdfd")
public static String es_PE_FIELD_PositionRemuneration_Description_Description="Observación";

@XendraTrl(Identifier="0a278237-b28f-4bdf-528c-9e69c359fdfd")
public static String es_PE_FIELD_PositionRemuneration_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="5c7f84f5-c01e-5558-3a1b-393ad8d4a2d3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0a278237-b28f-4bdf-528c-9e69c359fdfd")
public static final String FIELDNAME_PositionRemuneration_Description="0a278237-b28f-4bdf-528c-9e69c359fdfd";

@XendraTrl(Identifier="bdf3b1e3-37ba-4548-03ae-c9d8509bc2d4")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bdf3b1e3-37ba-4548-03ae-c9d8509bc2d4",
Synchronized="2019-08-30 22:21:46.0")
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
@XendraTrl(Identifier="711aa4de-799c-44ae-9347-99fa9b6a00b1")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="711aa4de-799c-44ae-9347-99fa9b6a00b1",
Synchronized="2019-08-30 22:21:46.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Valid from.
@param ValidFrom Valid from including this date (first day) */
public void setValidFrom (Timestamp ValidFrom)
{
if (ValidFrom == null) throw new IllegalArgumentException ("ValidFrom is mandatory.");
set_Value (COLUMNNAME_ValidFrom, ValidFrom);
}
/** Get Valid from.
@return Valid from including this date (first day) */
public Timestamp getValidFrom() 
{
return (Timestamp)get_Value(COLUMNNAME_ValidFrom);
}

@XendraTrl(Identifier="b4e198e7-ab51-07dd-bde6-8926a3e88217")
public static String es_PE_FIELD_Remuneration_ValidFrom_Name="Válido Desde";

@XendraTrl(Identifier="b4e198e7-ab51-07dd-bde6-8926a3e88217")
public static String es_PE_FIELD_Remuneration_ValidFrom_Description="Válido desde; incluyendo esta fecha (primer día)";

@XendraTrl(Identifier="b4e198e7-ab51-07dd-bde6-8926a3e88217")
public static String es_PE_FIELD_Remuneration_ValidFrom_Help="La fecha válida desde indica el primer día de un rango de fechas";

@XendraField(AD_Column_ID="ValidFrom",IsCentrallyMaintained=true,
AD_Tab_ID="79ec81ce-0375-7005-1e93-38dcba4f69a3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=60,SortNo=-1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b4e198e7-ab51-07dd-bde6-8926a3e88217")
public static final String FIELDNAME_Remuneration_ValidFrom="b4e198e7-ab51-07dd-bde6-8926a3e88217";

@XendraTrl(Identifier="3ad75fd7-b846-88d7-d511-e17eaddb0922")
public static String es_PE_FIELD_PositionRemuneration_ValidFrom_Name="Válido Desde";

@XendraTrl(Identifier="3ad75fd7-b846-88d7-d511-e17eaddb0922")
public static String es_PE_FIELD_PositionRemuneration_ValidFrom_Description="Válido desde; incluyendo esta fecha (primer día)";

@XendraTrl(Identifier="3ad75fd7-b846-88d7-d511-e17eaddb0922")
public static String es_PE_FIELD_PositionRemuneration_ValidFrom_Help="La fecha válida desde indica el primer día de un rango de fechas";

@XendraField(AD_Column_ID="ValidFrom",IsCentrallyMaintained=true,
AD_Tab_ID="5c7f84f5-c01e-5558-3a1b-393ad8d4a2d3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=60,SortNo=-1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3ad75fd7-b846-88d7-d511-e17eaddb0922")
public static final String FIELDNAME_PositionRemuneration_ValidFrom="3ad75fd7-b846-88d7-d511-e17eaddb0922";

@XendraTrl(Identifier="b4ecc710-9bfa-f0f2-9a29-14f8fe177a21")
public static String es_PE_COLUMN_ValidFrom_Name="Válido Desde";

@XendraColumn(AD_Element_ID="86b1171a-a6c6-0da5-1aea-3f3106450d07",ColumnName="ValidFrom",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b4ecc710-9bfa-f0f2-9a29-14f8fe177a21",
Synchronized="2019-08-30 22:21:46.0")
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

@XendraTrl(Identifier="0df140fc-aca7-310e-94be-b330aeb525f8")
public static String es_PE_FIELD_Remuneration_ValidTo_Name="Válido Hasta";

@XendraTrl(Identifier="0df140fc-aca7-310e-94be-b330aeb525f8")
public static String es_PE_FIELD_Remuneration_ValidTo_Description="Válido hasta; incluyendo esta fecha (ultimo día)";

@XendraTrl(Identifier="0df140fc-aca7-310e-94be-b330aeb525f8")
public static String es_PE_FIELD_Remuneration_ValidTo_Help="La fecha válida hasta indica el último día de un rango de fechas";

@XendraField(AD_Column_ID="ValidTo",IsCentrallyMaintained=true,
AD_Tab_ID="79ec81ce-0375-7005-1e93-38dcba4f69a3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0df140fc-aca7-310e-94be-b330aeb525f8")
public static final String FIELDNAME_Remuneration_ValidTo="0df140fc-aca7-310e-94be-b330aeb525f8";

@XendraTrl(Identifier="d63d959e-d5e4-af3f-8583-21389b53fed6")
public static String es_PE_FIELD_PositionRemuneration_ValidTo_Name="Válido Hasta";

@XendraTrl(Identifier="d63d959e-d5e4-af3f-8583-21389b53fed6")
public static String es_PE_FIELD_PositionRemuneration_ValidTo_Description="Válido hasta; incluyendo esta fecha (ultimo día)";

@XendraTrl(Identifier="d63d959e-d5e4-af3f-8583-21389b53fed6")
public static String es_PE_FIELD_PositionRemuneration_ValidTo_Help="La fecha válida hasta indica el último día de un rango de fechas";

@XendraField(AD_Column_ID="ValidTo",IsCentrallyMaintained=true,
AD_Tab_ID="5c7f84f5-c01e-5558-3a1b-393ad8d4a2d3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d63d959e-d5e4-af3f-8583-21389b53fed6")
public static final String FIELDNAME_PositionRemuneration_ValidTo="d63d959e-d5e4-af3f-8583-21389b53fed6";

@XendraTrl(Identifier="3d9a83ac-ce2e-0319-34f6-2c63e3a4e731")
public static String es_PE_COLUMN_ValidTo_Name="Válido Hasta";

@XendraColumn(AD_Element_ID="0fbe43c3-c76d-0505-0043-63adb568a68f",ColumnName="ValidTo",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3d9a83ac-ce2e-0319-34f6-2c63e3a4e731",
Synchronized="2019-08-30 22:21:46.0")
/** Column name ValidTo */
public static final String COLUMNNAME_ValidTo = "ValidTo";
}
