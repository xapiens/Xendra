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
/** Generated Model for HR_Year
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_HR_Year extends PO
{
/** Standard Constructor
@param ctx context
@param HR_Year_ID id
@param trxName transaction
*/
public X_HR_Year (Properties ctx, int HR_Year_ID, String trxName)
{
super (ctx, HR_Year_ID, trxName);
/** if (HR_Year_ID == 0)
{
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_HR_Year (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000378 */
public static int Table_ID=MTable.getTable_ID("HR_Year");

@XendraTrl(Identifier="820b48b0-91b0-41b2-bd1e-51463c1d1eaf")
public static String es_PE_TABLE_HR_Year_Name="Payroll Year";

@XendraTable(Name="Payroll Year",Description="",Help="",TableName="HR_Year",AccessLevel="3",
AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,
IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.humanresource",
Identifier="820b48b0-91b0-41b2-bd1e-51463c1d1eaf",Synchronized="2017-08-16 11:42:49.0")
/** TableName=HR_Year */
public static final String Table_Name="HR_Year";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"HR_Year");

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
    Table_ID = MTable.getTable_ID("HR_Year");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_HR_Year[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Year.
@param C_Year_ID Calendar Year */
public void setC_Year_ID (int C_Year_ID)
{
if (C_Year_ID <= 0) set_Value (COLUMNNAME_C_Year_ID, null);
 else 
set_Value (COLUMNNAME_C_Year_ID, Integer.valueOf(C_Year_ID));
}
/** Get Year.
@return Calendar Year */
public int getC_Year_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Year_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="fa968b73-bb8c-4cbd-9793-7197b9a125e7")
public static String es_PE_COLUMN_C_Year_ID_Name="Year";

@XendraColumn(AD_Element_ID="c7021f96-c6b3-e088-ab83-e25c3e111170",ColumnName="C_Year_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fa968b73-bb8c-4cbd-9793-7197b9a125e7",
Synchronized="2017-08-05 16:54:48.0")
/** Column name C_Year_ID */
public static final String COLUMNNAME_C_Year_ID = "C_Year_ID";
/** Set HR_Payroll_ID.
@param HR_Payroll_ID HR_Payroll_ID */
public void setHR_Payroll_ID (int HR_Payroll_ID)
{
if (HR_Payroll_ID <= 0) set_Value (COLUMNNAME_HR_Payroll_ID, null);
 else 
set_Value (COLUMNNAME_HR_Payroll_ID, Integer.valueOf(HR_Payroll_ID));
}
/** Get HR_Payroll_ID.
@return HR_Payroll_ID */
public int getHR_Payroll_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HR_Payroll_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5110e6b2-e82b-4cc7-9d42-383f7cf8df65")
public static String es_PE_COLUMN_HR_Payroll_ID_Name="HR_Payroll_ID";

@XendraColumn(AD_Element_ID="7e583833-168b-49d6-84d9-137ec0c40d00",ColumnName="HR_Payroll_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5110e6b2-e82b-4cc7-9d42-383f7cf8df65",
Synchronized="2017-08-05 16:54:48.0")
/** Column name HR_Payroll_ID */
public static final String COLUMNNAME_HR_Payroll_ID = "HR_Payroll_ID";
/** Set Payroll Period.
@param HR_Period_ID Payroll Period */
public void setHR_Period_ID (int HR_Period_ID)
{
if (HR_Period_ID <= 0) set_Value (COLUMNNAME_HR_Period_ID, null);
 else 
set_Value (COLUMNNAME_HR_Period_ID, Integer.valueOf(HR_Period_ID));
}
/** Get Payroll Period.
@return Payroll Period */
public int getHR_Period_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HR_Period_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a603da56-afa8-4243-94e0-73a3eebd8a1d")
public static String es_PE_COLUMN_HR_Period_ID_Name="Payroll Period";

@XendraColumn(AD_Element_ID="e75ae9a3-701a-442a-847a-5e1887efaf12",ColumnName="HR_Period_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a603da56-afa8-4243-94e0-73a3eebd8a1d",
Synchronized="2017-08-05 16:54:48.0")
/** Column name HR_Period_ID */
public static final String COLUMNNAME_HR_Period_ID = "HR_Period_ID";
/** Set Payroll Year.
@param HR_Year_ID Payroll Year */
public void setHR_Year_ID (int HR_Year_ID)
{
if (HR_Year_ID <= 0) set_ValueNoCheck (COLUMNNAME_HR_Year_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_HR_Year_ID, Integer.valueOf(HR_Year_ID));
}
/** Get Payroll Year.
@return Payroll Year */
public int getHR_Year_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HR_Year_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name HR_Year_ID */
public static final String COLUMNNAME_HR_Year_ID = "HR_Year_ID";
/** Set HR_Year_UU.
@param HR_Year_UU HR_Year_UU */
public void setHR_Year_UU (String HR_Year_UU)
{
if (HR_Year_UU != null && HR_Year_UU.length() > 36)
{
log.warning("Length > 36 - truncated");
HR_Year_UU = HR_Year_UU.substring(0,35);
}
set_Value (COLUMNNAME_HR_Year_UU, HR_Year_UU);
}
/** Get HR_Year_UU.
@return HR_Year_UU */
public String getHR_Year_UU() 
{
String value = (String)get_Value(COLUMNNAME_HR_Year_UU);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="4b63b2d9-343e-42cb-924b-0e96262fc365")
public static String es_PE_COLUMN_HR_Year_UU_Name="hr_year_uu";

@XendraColumn(AD_Element_ID="d6fef67a-7b9f-4b4e-9490-736f47a4f9e8",ColumnName="HR_Year_UU",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4b63b2d9-343e-42cb-924b-0e96262fc365",
Synchronized="2017-08-05 16:54:48.0")
/** Column name HR_Year_UU */
public static final String COLUMNNAME_HR_Year_UU = "HR_Year_UU";
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

@XendraTrl(Identifier="010f0d68-98c6-4006-90a6-f768145bf4ad")
public static String es_PE_COLUMN_NetDays_Name="Net Days";

@XendraColumn(AD_Element_ID="8c6a9b99-2bf1-0a28-1149-2bfd59b7c622",ColumnName="NetDays",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="010f0d68-98c6-4006-90a6-f768145bf4ad",
Synchronized="2017-08-05 16:54:48.0")
/** Column name NetDays */
public static final String COLUMNNAME_NetDays = "NetDays";
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

@XendraTrl(Identifier="c1bd84d2-0629-4f8e-801c-f78294b7bd33")
public static String es_PE_COLUMN_Processed_Name="Processed";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c1bd84d2-0629-4f8e-801c-f78294b7bd33",
Synchronized="2017-08-05 16:54:48.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
/** Set Process Now.
@param Processing Process Now */
public void setProcessing (boolean Processing)
{
set_Value (COLUMNNAME_Processing, Boolean.valueOf(Processing));
}
/** Get Process Now.
@return Process Now */
public boolean isProcessing() 
{
Object oo = get_Value(COLUMNNAME_Processing);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="41f3402a-11ad-4dfb-839e-2a993bb0a997")
public static String es_PE_COLUMN_Processing_Name="Process Now";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="41f3402a-11ad-4dfb-839e-2a993bb0a997",
Synchronized="2017-08-05 16:54:48.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Quantity.
@param Qty Quantity */
public void setQty (BigDecimal Qty)
{
set_Value (COLUMNNAME_Qty, Qty);
}
/** Get Quantity.
@return Quantity */
public BigDecimal getQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Qty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="4eb7adc5-2881-4dac-ab90-0df73e5b197f")
public static String es_PE_COLUMN_Qty_Name="Quantity";

@XendraColumn(AD_Element_ID="c9d74a25-87c5-9592-5660-4f397607dad3",ColumnName="Qty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4eb7adc5-2881-4dac-ab90-0df73e5b197f",
Synchronized="2017-08-05 16:54:48.0")
/** Column name Qty */
public static final String COLUMNNAME_Qty = "Qty";
/** Set Start Date.
@param StartDate First effective day (inclusive) */
public void setStartDate (Timestamp StartDate)
{
set_Value (COLUMNNAME_StartDate, StartDate);
}
/** Get Start Date.
@return First effective day (inclusive) */
public Timestamp getStartDate() 
{
return (Timestamp)get_Value(COLUMNNAME_StartDate);
}

@XendraTrl(Identifier="e5e105d9-b4a3-450f-b8fa-2a1596ebcfaa")
public static String es_PE_COLUMN_StartDate_Name="Start Date";

@XendraColumn(AD_Element_ID="3fe42406-cab3-a569-bf0b-3614f5d95711",ColumnName="StartDate",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e5e105d9-b4a3-450f-b8fa-2a1596ebcfaa",
Synchronized="2017-08-05 16:54:48.0")
/** Column name StartDate */
public static final String COLUMNNAME_StartDate = "StartDate";
}
