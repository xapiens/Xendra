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
/** Generated Model for HR_Incidence
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_HR_Incidence extends PO
{
/** Standard Constructor
@param ctx context
@param HR_Incidence_ID id
@param trxName transaction
*/
public X_HR_Incidence (Properties ctx, int HR_Incidence_ID, String trxName)
{
super (ctx, HR_Incidence_ID, trxName);
/** if (HR_Incidence_ID == 0)
{
setHR_Incidence_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_HR_Incidence (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000412 */
public static int Table_ID=MTable.getTable_ID("HR_Incidence");

@XendraTrl(Identifier="7284ad50-71f1-47bc-acb1-32f34b0907ce")
public static String es_PE_TABLE_HR_Incidence_Name="Incidence";

@XendraTable(Name="Incidence",AD_Package_ID="95f9a029-eaee-0747-b1a5-58cfdd8f8ae5",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="HR_Incidence",Help="HR_Incidence",
TableName="HR_Incidence",AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,
IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=false,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.humanresource",Identifier="7284ad50-71f1-47bc-acb1-32f34b0907ce",
Synchronized="2020-03-03 21:38:01.0")
/** TableName=HR_Incidence */
public static final String Table_Name="HR_Incidence";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"HR_Incidence");

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
    Table_ID = MTable.getTable_ID("HR_Incidence");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_HR_Incidence[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Description.
@param Description Description */
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
@return Description */
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

@XendraTrl(Identifier="be9ccd2f-8d60-477e-bb62-7ab2a0c0a2bc")
public static String es_PE_COLUMN_Description_Name="Description";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="be9ccd2f-8d60-477e-bb62-7ab2a0c0a2bc",
Synchronized="2019-08-30 22:22:40.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set DocAction.
@param DocAction DocAction */
public void setDocAction (String DocAction)
{
if (DocAction != null && DocAction.length() > 2)
{
log.warning("Length > 2 - truncated");
DocAction = DocAction.substring(0,1);
}
set_Value (COLUMNNAME_DocAction, DocAction);
}
/** Get DocAction.
@return DocAction */
public String getDocAction() 
{
return (String)get_Value(COLUMNNAME_DocAction);
}

@XendraTrl(Identifier="93ae0eac-95b2-4298-bb86-1da0af1b683c")
public static String es_PE_COLUMN_DocAction_Name="DocAction";

@XendraColumn(AD_Element_ID="d4b9075b-18e5-ebbb-5565-d217a7e531cb",ColumnName="DocAction",
AD_Reference_ID=28,AD_Reference_Value_ID="e397c9b0-c643-d1cd-8380-20bee13b2a6e",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="93ae0eac-95b2-4298-bb86-1da0af1b683c",Synchronized="2019-08-30 22:22:40.0")
/** Column name DocAction */
public static final String COLUMNNAME_DocAction = "DocAction";
/** Set DocumentNote.
@param DocumentNote DocumentNote */
public void setDocumentNote (String DocumentNote)
{
set_Value (COLUMNNAME_DocumentNote, DocumentNote);
}
/** Get DocumentNote.
@return DocumentNote */
public String getDocumentNote() 
{
String value = (String)get_Value(COLUMNNAME_DocumentNote);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="649f9d45-a6dc-43a8-ab03-65b694c24ec4")
public static String es_PE_COLUMN_DocumentNote_Name="DocumentNote";

@XendraColumn(AD_Element_ID="facce503-36ce-65e5-ad96-c872503feb2e",ColumnName="DocumentNote",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="649f9d45-a6dc-43a8-ab03-65b694c24ec4",
Synchronized="2019-08-30 22:22:40.0")
/** Column name DocumentNote */
public static final String COLUMNNAME_DocumentNote = "DocumentNote";
/** Set HR_AttendanceBatch_ID.
@param HR_AttendanceBatch_ID HR_AttendanceBatch_ID */
public void setHR_AttendanceBatch_ID (int HR_AttendanceBatch_ID)
{
if (HR_AttendanceBatch_ID <= 0) set_Value (COLUMNNAME_HR_AttendanceBatch_ID, null);
 else 
set_Value (COLUMNNAME_HR_AttendanceBatch_ID, Integer.valueOf(HR_AttendanceBatch_ID));
}
/** Get HR_AttendanceBatch_ID.
@return HR_AttendanceBatch_ID */
public int getHR_AttendanceBatch_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HR_AttendanceBatch_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="78a1578c-482a-4a99-b153-be539dca48bd")
public static String es_PE_COLUMN_HR_AttendanceBatch_ID_Name="HR_AttendanceBatch_ID";

@XendraColumn(AD_Element_ID="2a77f2e9-b6c2-4609-811d-310b8ddfffe2",
ColumnName="HR_AttendanceBatch_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="78a1578c-482a-4a99-b153-be539dca48bd",Synchronized="2019-08-30 22:22:40.0")
/** Column name HR_AttendanceBatch_ID */
public static final String COLUMNNAME_HR_AttendanceBatch_ID = "HR_AttendanceBatch_ID";
/** Set HR_Concept_ID.
@param HR_Concept_ID HR_Concept_ID */
public void setHR_Concept_ID (int HR_Concept_ID)
{
if (HR_Concept_ID <= 0) set_Value (COLUMNNAME_HR_Concept_ID, null);
 else 
set_Value (COLUMNNAME_HR_Concept_ID, Integer.valueOf(HR_Concept_ID));
}
/** Get HR_Concept_ID.
@return HR_Concept_ID */
public int getHR_Concept_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HR_Concept_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f961f2e0-7d9f-4353-9b77-28f504cbb27e")
public static String es_PE_COLUMN_HR_Concept_ID_Name="HR_Concept_ID";

@XendraColumn(AD_Element_ID="9f5a2e6a-1245-463f-ae5e-e1543a9bd3b1",ColumnName="HR_Concept_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f961f2e0-7d9f-4353-9b77-28f504cbb27e",
Synchronized="2019-08-30 22:22:40.0")
/** Column name HR_Concept_ID */
public static final String COLUMNNAME_HR_Concept_ID = "HR_Concept_ID";
/** Set HR_Incidence_ID.
@param HR_Incidence_ID HR_Incidence_ID */
public void setHR_Incidence_ID (int HR_Incidence_ID)
{
if (HR_Incidence_ID < 1) throw new IllegalArgumentException ("HR_Incidence_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_HR_Incidence_ID, Integer.valueOf(HR_Incidence_ID));
}
/** Get HR_Incidence_ID.
@return HR_Incidence_ID */
public int getHR_Incidence_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HR_Incidence_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name HR_Incidence_ID */
public static final String COLUMNNAME_HR_Incidence_ID = "HR_Incidence_ID";
/** Set HR_ShiftIncidence_ID.
@param HR_ShiftIncidence_ID HR_ShiftIncidence_ID */
public void setHR_ShiftIncidence_ID (int HR_ShiftIncidence_ID)
{
if (HR_ShiftIncidence_ID <= 0) set_Value (COLUMNNAME_HR_ShiftIncidence_ID, null);
 else 
set_Value (COLUMNNAME_HR_ShiftIncidence_ID, Integer.valueOf(HR_ShiftIncidence_ID));
}
/** Get HR_ShiftIncidence_ID.
@return HR_ShiftIncidence_ID */
public int getHR_ShiftIncidence_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HR_ShiftIncidence_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="84eae9b1-b590-4836-9cb1-4e56a5d52a33")
public static String es_PE_COLUMN_HR_ShiftIncidence_ID_Name="HR_ShiftIncidence_ID";

@XendraColumn(AD_Element_ID="0c84f5e3-d1c4-4c90-ac68-3dc379291cc4",
ColumnName="HR_ShiftIncidence_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="84eae9b1-b590-4836-9cb1-4e56a5d52a33",Synchronized="2019-08-30 22:22:40.0")
/** Column name HR_ShiftIncidence_ID */
public static final String COLUMNNAME_HR_ShiftIncidence_ID = "HR_ShiftIncidence_ID";
/** Set IsApproved.
@param IsApproved IsApproved */
public void setIsApproved (boolean IsApproved)
{
set_Value (COLUMNNAME_IsApproved, Boolean.valueOf(IsApproved));
}
/** Get IsApproved.
@return IsApproved */
public boolean isApproved() 
{
Object oo = get_Value(COLUMNNAME_IsApproved);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="3a7d71ad-1b5a-4e54-8028-28dc4c828caa")
public static String es_PE_COLUMN_IsApproved_Name="IsApproved";

@XendraColumn(AD_Element_ID="44388d99-07b7-b005-9e16-78884800beff",ColumnName="IsApproved",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3a7d71ad-1b5a-4e54-8028-28dc4c828caa",
Synchronized="2019-08-30 22:22:40.0")
/** Column name IsApproved */
public static final String COLUMNNAME_IsApproved = "IsApproved";
/** Set IsManual.
@param IsManual IsManual */
public void setIsManual (boolean IsManual)
{
set_Value (COLUMNNAME_IsManual, Boolean.valueOf(IsManual));
}
/** Get IsManual.
@return IsManual */
public boolean isManual() 
{
Object oo = get_Value(COLUMNNAME_IsManual);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="72d96cf6-6d9d-42b5-9920-751b5037bf05")
public static String es_PE_COLUMN_IsManual_Name="IsManual";

@XendraColumn(AD_Element_ID="064afee2-bc1c-12d9-20dc-97a2318dc359",ColumnName="IsManual",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="72d96cf6-6d9d-42b5-9920-751b5037bf05",
Synchronized="2019-08-30 22:22:41.0")
/** Column name IsManual */
public static final String COLUMNNAME_IsManual = "IsManual";
/** Set Processed.
@param Processed Processed */
public void setProcessed (boolean Processed)
{
set_Value (COLUMNNAME_Processed, Boolean.valueOf(Processed));
}
/** Get Processed.
@return Processed */
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

@XendraTrl(Identifier="950142ad-9ab6-4b24-9600-f6666c96f9d8")
public static String es_PE_COLUMN_Processed_Name="Processed";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="950142ad-9ab6-4b24-9600-f6666c96f9d8",
Synchronized="2019-08-30 22:22:41.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
/** Set Qty.
@param Qty Qty */
public void setQty (BigDecimal Qty)
{
set_Value (COLUMNNAME_Qty, Qty);
}
/** Get Qty.
@return Qty */
public BigDecimal getQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Qty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="2c06f596-ce85-4f7a-9e7e-cbba7ece9ba5")
public static String es_PE_COLUMN_Qty_Name="Qty";

@XendraColumn(AD_Element_ID="c9d74a25-87c5-9592-5660-4f397607dad3",ColumnName="Qty",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2c06f596-ce85-4f7a-9e7e-cbba7ece9ba5",
Synchronized="2019-08-30 22:22:41.0")
/** Column name Qty */
public static final String COLUMNNAME_Qty = "Qty";
/** Set ServiceDate.
@param ServiceDate ServiceDate */
public void setServiceDate (Timestamp ServiceDate)
{
set_Value (COLUMNNAME_ServiceDate, ServiceDate);
}
/** Get ServiceDate.
@return ServiceDate */
public Timestamp getServiceDate() 
{
return (Timestamp)get_Value(COLUMNNAME_ServiceDate);
}

@XendraTrl(Identifier="671f8ced-af62-436a-b005-d2c9b9bf7a19")
public static String es_PE_COLUMN_ServiceDate_Name="ServiceDate";

@XendraColumn(AD_Element_ID="99e6be5a-1737-5ca4-7cf9-74454571eafc",ColumnName="ServiceDate",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="671f8ced-af62-436a-b005-d2c9b9bf7a19",
Synchronized="2019-08-30 22:22:41.0")
/** Column name ServiceDate */
public static final String COLUMNNAME_ServiceDate = "ServiceDate";
}
