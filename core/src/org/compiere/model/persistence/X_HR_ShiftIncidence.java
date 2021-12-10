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
/** Generated Model for HR_ShiftIncidence
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_HR_ShiftIncidence extends PO
{
/** Standard Constructor
@param ctx context
@param HR_ShiftIncidence_ID id
@param trxName transaction
*/
public X_HR_ShiftIncidence (Properties ctx, int HR_ShiftIncidence_ID, String trxName)
{
super (ctx, HR_ShiftIncidence_ID, trxName);
/** if (HR_ShiftIncidence_ID == 0)
{
setHR_ShiftIncidence_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_HR_ShiftIncidence (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000409 */
public static int Table_ID=MTable.getTable_ID("HR_ShiftIncidence");

@XendraTrl(Identifier="706079bb-de23-43c1-8465-0378312428d4")
public static String es_PE_TABLE_HR_ShiftIncidence_Name="ShiftIncidence";

@XendraTable(Name="ShiftIncidence",AD_Package_ID="95f9a029-eaee-0747-b1a5-58cfdd8f8ae5",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="HR_ShiftIncidence",
Help="HR_ShiftIncidence",TableName="HR_ShiftIncidence",AccessLevel="3",AD_Window_ID="",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=false,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.humanresource",
Identifier="706079bb-de23-43c1-8465-0378312428d4",Synchronized="2020-03-03 21:38:03.0")
/** TableName=HR_ShiftIncidence */
public static final String Table_Name="HR_ShiftIncidence";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"HR_ShiftIncidence");

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
    Table_ID = MTable.getTable_ID("HR_ShiftIncidence");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_HR_ShiftIncidence[").append(get_ID()).append("]");
return sb.toString();
}
/** Set DefaultAmt.
@param DefaultAmt DefaultAmt */
public void setDefaultAmt (BigDecimal DefaultAmt)
{
set_Value (COLUMNNAME_DefaultAmt, DefaultAmt);
}
/** Get DefaultAmt.
@return DefaultAmt */
public BigDecimal getDefaultAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_DefaultAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="b2864d83-d7dd-4c46-92aa-1277c8408164")
public static String es_PE_COLUMN_DefaultAmt_Name="DefaultAmt";

@XendraColumn(AD_Element_ID="6fe7feb6-618b-402f-b796-0569f407b9b0",ColumnName="DefaultAmt",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b2864d83-d7dd-4c46-92aa-1277c8408164",
Synchronized="2019-08-30 22:22:42.0")
/** Column name DefaultAmt */
public static final String COLUMNNAME_DefaultAmt = "DefaultAmt";
/** Set DefaultQty.
@param DefaultQty DefaultQty */
public void setDefaultQty (BigDecimal DefaultQty)
{
set_Value (COLUMNNAME_DefaultQty, DefaultQty);
}
/** Get DefaultQty.
@return DefaultQty */
public BigDecimal getDefaultQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_DefaultQty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="603c7f96-cd33-4f16-83ab-d49f0809fdec")
public static String es_PE_COLUMN_DefaultQty_Name="DefaultQty";

@XendraColumn(AD_Element_ID="69c0f56b-e8f2-47fc-8cd4-1b0105e2133c",ColumnName="DefaultQty",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="603c7f96-cd33-4f16-83ab-d49f0809fdec",
Synchronized="2019-08-30 22:22:42.0")
/** Column name DefaultQty */
public static final String COLUMNNAME_DefaultQty = "DefaultQty";
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

@XendraTrl(Identifier="e6a8c8b2-009d-486a-9e20-2224d2d90fcc")
public static String es_PE_COLUMN_Description_Name="Description";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e6a8c8b2-009d-486a-9e20-2224d2d90fcc",
Synchronized="2019-08-30 22:22:42.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set EndTime.
@param EndTime EndTime */
public void setEndTime (Timestamp EndTime)
{
set_Value (COLUMNNAME_EndTime, EndTime);
}
/** Get EndTime.
@return EndTime */
public Timestamp getEndTime() 
{
return (Timestamp)get_Value(COLUMNNAME_EndTime);
}

@XendraTrl(Identifier="ed8a23b1-8541-44de-a10f-e3c7e207dce2")
public static String es_PE_COLUMN_EndTime_Name="EndTime";

@XendraColumn(AD_Element_ID="6c802fea-18a8-875e-7b55-9ace2db37aac",ColumnName="EndTime",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ed8a23b1-8541-44de-a10f-e3c7e207dce2",
Synchronized="2019-08-30 22:22:42.0")
/** Column name EndTime */
public static final String COLUMNNAME_EndTime = "EndTime";
/** Set FixedAmt.
@param FixedAmt FixedAmt */
public void setFixedAmt (BigDecimal FixedAmt)
{
set_Value (COLUMNNAME_FixedAmt, FixedAmt);
}
/** Get FixedAmt.
@return FixedAmt */
public BigDecimal getFixedAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_FixedAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="8bea48bd-eb08-43fb-8e26-ee58970167f9")
public static String es_PE_COLUMN_FixedAmt_Name="FixedAmt";

@XendraColumn(AD_Element_ID="109fd236-2477-4d49-99ba-1bb5808e83a4",ColumnName="FixedAmt",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8bea48bd-eb08-43fb-8e26-ee58970167f9",
Synchronized="2019-08-30 22:22:42.0")
/** Column name FixedAmt */
public static final String COLUMNNAME_FixedAmt = "FixedAmt";
/** Set FixedQty.
@param FixedQty FixedQty */
public void setFixedQty (BigDecimal FixedQty)
{
set_Value (COLUMNNAME_FixedQty, FixedQty);
}
/** Get FixedQty.
@return FixedQty */
public BigDecimal getFixedQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_FixedQty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="ba198064-aef8-47f0-b723-859b7980fcbb")
public static String es_PE_COLUMN_FixedQty_Name="FixedQty";

@XendraColumn(AD_Element_ID="13c36f16-a409-4523-a885-ea9d8bc10104",ColumnName="FixedQty",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ba198064-aef8-47f0-b723-859b7980fcbb",
Synchronized="2019-08-30 22:22:43.0")
/** Column name FixedQty */
public static final String COLUMNNAME_FixedQty = "FixedQty";
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

@XendraTrl(Identifier="4d04dec9-5b72-445b-a79d-7e7df2bdb0c3")
public static String es_PE_COLUMN_HR_Concept_ID_Name="HR_Concept_ID";

@XendraColumn(AD_Element_ID="9f5a2e6a-1245-463f-ae5e-e1543a9bd3b1",ColumnName="HR_Concept_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4d04dec9-5b72-445b-a79d-7e7df2bdb0c3",
Synchronized="2019-08-30 22:22:43.0")
/** Column name HR_Concept_ID */
public static final String COLUMNNAME_HR_Concept_ID = "HR_Concept_ID";
/** Set HR_ShiftIncidence_ID.
@param HR_ShiftIncidence_ID HR_ShiftIncidence_ID */
public void setHR_ShiftIncidence_ID (int HR_ShiftIncidence_ID)
{
if (HR_ShiftIncidence_ID < 1) throw new IllegalArgumentException ("HR_ShiftIncidence_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_HR_ShiftIncidence_ID, Integer.valueOf(HR_ShiftIncidence_ID));
}
/** Get HR_ShiftIncidence_ID.
@return HR_ShiftIncidence_ID */
public int getHR_ShiftIncidence_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HR_ShiftIncidence_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name HR_ShiftIncidence_ID */
public static final String COLUMNNAME_HR_ShiftIncidence_ID = "HR_ShiftIncidence_ID";
/** Set HR_WorkShift_ID.
@param HR_WorkShift_ID HR_WorkShift_ID */
public void setHR_WorkShift_ID (int HR_WorkShift_ID)
{
if (HR_WorkShift_ID <= 0) set_Value (COLUMNNAME_HR_WorkShift_ID, null);
 else 
set_Value (COLUMNNAME_HR_WorkShift_ID, Integer.valueOf(HR_WorkShift_ID));
}
/** Get HR_WorkShift_ID.
@return HR_WorkShift_ID */
public int getHR_WorkShift_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HR_WorkShift_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="eadec8e8-74e0-4cc1-b5c3-5e7c68d134e2")
public static String es_PE_COLUMN_HR_WorkShift_ID_Name="HR_WorkShift_ID";

@XendraColumn(AD_Element_ID="742243ba-9ede-4990-8e52-6da7e53a866b",ColumnName="HR_WorkShift_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="eadec8e8-74e0-4cc1-b5c3-5e7c68d134e2",
Synchronized="2019-08-30 22:22:43.0")
/** Column name HR_WorkShift_ID */
public static final String COLUMNNAME_HR_WorkShift_ID = "HR_WorkShift_ID";
/** Set OnFriday.
@param OnFriday OnFriday */
public void setOnFriday (boolean OnFriday)
{
set_Value (COLUMNNAME_OnFriday, Boolean.valueOf(OnFriday));
}
/** Get OnFriday.
@return OnFriday */
public boolean isOnFriday() 
{
Object oo = get_Value(COLUMNNAME_OnFriday);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="0fe7e2ae-b312-4a67-acbd-1f0d4b46d061")
public static String es_PE_COLUMN_OnFriday_Name="OnFriday";

@XendraColumn(AD_Element_ID="b48d0dde-cf3f-04c1-43fc-fea10282b017",ColumnName="OnFriday",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0fe7e2ae-b312-4a67-acbd-1f0d4b46d061",
Synchronized="2019-08-30 22:22:43.0")
/** Column name OnFriday */
public static final String COLUMNNAME_OnFriday = "OnFriday";
/** Set OnMonday.
@param OnMonday OnMonday */
public void setOnMonday (boolean OnMonday)
{
set_Value (COLUMNNAME_OnMonday, Boolean.valueOf(OnMonday));
}
/** Get OnMonday.
@return OnMonday */
public boolean isOnMonday() 
{
Object oo = get_Value(COLUMNNAME_OnMonday);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="6fd8dfb0-323e-4f74-a8f9-64c435012428")
public static String es_PE_COLUMN_OnMonday_Name="OnMonday";

@XendraColumn(AD_Element_ID="47062be2-3eb4-a496-3910-6b134c369f87",ColumnName="OnMonday",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6fd8dfb0-323e-4f74-a8f9-64c435012428",
Synchronized="2019-08-30 22:22:43.0")
/** Column name OnMonday */
public static final String COLUMNNAME_OnMonday = "OnMonday";
/** Set OnSaturday.
@param OnSaturday OnSaturday */
public void setOnSaturday (boolean OnSaturday)
{
set_Value (COLUMNNAME_OnSaturday, Boolean.valueOf(OnSaturday));
}
/** Get OnSaturday.
@return OnSaturday */
public boolean isOnSaturday() 
{
Object oo = get_Value(COLUMNNAME_OnSaturday);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="4732663b-62b7-4ea4-ae70-84f314fa77ff")
public static String es_PE_COLUMN_OnSaturday_Name="OnSaturday";

@XendraColumn(AD_Element_ID="dad68a73-edf7-1a52-7414-dfdca8f9fd90",ColumnName="OnSaturday",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4732663b-62b7-4ea4-ae70-84f314fa77ff",
Synchronized="2019-08-30 22:22:43.0")
/** Column name OnSaturday */
public static final String COLUMNNAME_OnSaturday = "OnSaturday";
/** Set OnSunday.
@param OnSunday OnSunday */
public void setOnSunday (boolean OnSunday)
{
set_Value (COLUMNNAME_OnSunday, Boolean.valueOf(OnSunday));
}
/** Get OnSunday.
@return OnSunday */
public boolean isOnSunday() 
{
Object oo = get_Value(COLUMNNAME_OnSunday);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="a91b3b86-a422-4069-a929-5ba19bc115c4")
public static String es_PE_COLUMN_OnSunday_Name="OnSunday";

@XendraColumn(AD_Element_ID="88a0f08b-4471-14e0-4677-efe2aecfff68",ColumnName="OnSunday",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a91b3b86-a422-4069-a929-5ba19bc115c4",
Synchronized="2019-08-30 22:22:43.0")
/** Column name OnSunday */
public static final String COLUMNNAME_OnSunday = "OnSunday";
/** Set OnThursday.
@param OnThursday OnThursday */
public void setOnThursday (boolean OnThursday)
{
set_Value (COLUMNNAME_OnThursday, Boolean.valueOf(OnThursday));
}
/** Get OnThursday.
@return OnThursday */
public boolean isOnThursday() 
{
Object oo = get_Value(COLUMNNAME_OnThursday);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="2ec16802-ef77-4669-bba6-82fe562c1845")
public static String es_PE_COLUMN_OnThursday_Name="OnThursday";

@XendraColumn(AD_Element_ID="3b9a627b-1e5c-7294-7abf-d92411fb6b61",ColumnName="OnThursday",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2ec16802-ef77-4669-bba6-82fe562c1845",
Synchronized="2019-08-30 22:22:43.0")
/** Column name OnThursday */
public static final String COLUMNNAME_OnThursday = "OnThursday";
/** Set OnTuesday.
@param OnTuesday OnTuesday */
public void setOnTuesday (boolean OnTuesday)
{
set_Value (COLUMNNAME_OnTuesday, Boolean.valueOf(OnTuesday));
}
/** Get OnTuesday.
@return OnTuesday */
public boolean isOnTuesday() 
{
Object oo = get_Value(COLUMNNAME_OnTuesday);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="19682ee8-4bf2-4165-93dc-5175829e06ad")
public static String es_PE_COLUMN_OnTuesday_Name="OnTuesday";

@XendraColumn(AD_Element_ID="225ffab7-2af2-fe39-5821-3648aa7db913",ColumnName="OnTuesday",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="19682ee8-4bf2-4165-93dc-5175829e06ad",
Synchronized="2019-08-30 22:22:43.0")
/** Column name OnTuesday */
public static final String COLUMNNAME_OnTuesday = "OnTuesday";
/** Set OnWednesday.
@param OnWednesday OnWednesday */
public void setOnWednesday (boolean OnWednesday)
{
set_Value (COLUMNNAME_OnWednesday, Boolean.valueOf(OnWednesday));
}
/** Get OnWednesday.
@return OnWednesday */
public boolean isOnWednesday() 
{
Object oo = get_Value(COLUMNNAME_OnWednesday);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="253bb428-67e0-41e8-a91e-9223c35d249e")
public static String es_PE_COLUMN_OnWednesday_Name="OnWednesday";

@XendraColumn(AD_Element_ID="4d1edfb8-f525-c7b5-2d0d-0245f1f8eefe",ColumnName="OnWednesday",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="253bb428-67e0-41e8-a91e-9223c35d249e",
Synchronized="2019-08-30 22:22:43.0")
/** Column name OnWednesday */
public static final String COLUMNNAME_OnWednesday = "OnWednesday";
/** Set StartTime.
@param StartTime StartTime */
public void setStartTime (Timestamp StartTime)
{
set_Value (COLUMNNAME_StartTime, StartTime);
}
/** Get StartTime.
@return StartTime */
public Timestamp getStartTime() 
{
return (Timestamp)get_Value(COLUMNNAME_StartTime);
}

@XendraTrl(Identifier="e50673d9-c925-4e2a-bebe-356b28c5376c")
public static String es_PE_COLUMN_StartTime_Name="StartTime";

@XendraColumn(AD_Element_ID="f37ff718-a1d1-dbb8-f704-786bf1d21ddf",ColumnName="StartTime",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e50673d9-c925-4e2a-bebe-356b28c5376c",
Synchronized="2019-08-30 22:22:43.0")
/** Column name StartTime */
public static final String COLUMNNAME_StartTime = "StartTime";
}
