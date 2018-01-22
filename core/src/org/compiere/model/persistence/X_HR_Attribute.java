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
/** Generated Model for HR_Attribute
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_HR_Attribute extends PO
{
/** Standard Constructor
@param ctx context
@param HR_Attribute_ID id
@param trxName transaction
*/
public X_HR_Attribute (Properties ctx, int HR_Attribute_ID, String trxName)
{
super (ctx, HR_Attribute_ID, trxName);
/** if (HR_Attribute_ID == 0)
{
setHR_Attribute_ID (0);
setHR_Concept_ID (0);
setValidFrom (new Timestamp(System.currentTimeMillis()));
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_HR_Attribute (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000255 */
public static int Table_ID=MTable.getTable_ID("HR_Attribute");

@XendraTrl(Identifier="64fec9da-cff4-4c6d-be4e-a252310626b2")
public static String es_PE_TABLE_HR_Attribute_Name="hr_attribute";

@XendraTable(Name="HR_Attribute",Description="",Help="",TableName="HR_Attribute",AccessLevel="3",
AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=false,
IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.humanresource",
Identifier="64fec9da-cff4-4c6d-be4e-a252310626b2",Synchronized="2017-08-16 11:42:47.0")
/** TableName=HR_Attribute */
public static final String Table_Name="HR_Attribute";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"HR_Attribute");

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
    Table_ID = MTable.getTable_ID("HR_Attribute");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_HR_Attribute[").append(get_ID()).append("]");
return sb.toString();
}
/** Set AD_Rule_ID.
@param AD_Rule_ID AD_Rule_ID */
public void setAD_Rule_ID (int AD_Rule_ID)
{
if (AD_Rule_ID <= 0) set_Value (COLUMNNAME_AD_Rule_ID, null);
 else 
set_Value (COLUMNNAME_AD_Rule_ID, Integer.valueOf(AD_Rule_ID));
}
/** Get AD_Rule_ID.
@return AD_Rule_ID */
public int getAD_Rule_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Rule_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="22aa9736-f689-4538-97e0-4ef2c0663a52")
public static String es_PE_COLUMN_AD_Rule_ID_Name="AD_Rule_ID";

@XendraColumn(AD_Element_ID="4b4afdeb-6aca-d182-6e3a-83f0f6d29f7d",ColumnName="AD_Rule_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="22aa9736-f689-4538-97e0-4ef2c0663a52",
Synchronized="2017-08-05 16:54:45.0")
/** Column name AD_Rule_ID */
public static final String COLUMNNAME_AD_Rule_ID = "AD_Rule_ID";
/** Set Amount.
@param Amount Amount in a defined currency */
public void setAmount (BigDecimal Amount)
{
set_Value (COLUMNNAME_Amount, Amount);
}
/** Get Amount.
@return Amount in a defined currency */
public BigDecimal getAmount() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Amount);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="93593bf1-286a-4cec-9fde-6ab327f4751b")
public static String es_PE_COLUMN_Amount_Name="Amount";

@XendraColumn(AD_Element_ID="d89b3a02-29fd-e2e3-2d01-dbda08fb2454",ColumnName="Amount",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="93593bf1-286a-4cec-9fde-6ab327f4751b",
Synchronized="2017-08-05 16:54:45.0")
/** Column name Amount */
public static final String COLUMNNAME_Amount = "Amount";
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

@XendraTrl(Identifier="8a7ddf13-183b-438a-bf14-d5b2cd6e4ec0")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Business Partner ";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8a7ddf13-183b-438a-bf14-d5b2cd6e4ec0",
Synchronized="2017-08-05 16:54:45.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set Charge.
@param C_Charge_ID Additional document charges */
public void setC_Charge_ID (int C_Charge_ID)
{
if (C_Charge_ID <= 0) set_Value (COLUMNNAME_C_Charge_ID, null);
 else 
set_Value (COLUMNNAME_C_Charge_ID, Integer.valueOf(C_Charge_ID));
}
/** Get Charge.
@return Additional document charges */
public int getC_Charge_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Charge_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b995a206-111e-491f-920b-b762dda6ab1f")
public static String es_PE_COLUMN_C_Charge_ID_Name="Charge";

@XendraColumn(AD_Element_ID="d7e2fc48-a26e-4ded-ea44-fe15849a7883",ColumnName="C_Charge_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b995a206-111e-491f-920b-b762dda6ab1f",
Synchronized="2017-08-05 16:54:45.0")
/** Column name C_Charge_ID */
public static final String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
/** Set Document Type.
@param C_DocType_ID Document type or rules */
public void setC_DocType_ID (int C_DocType_ID)
{
if (C_DocType_ID <= 0) set_Value (COLUMNNAME_C_DocType_ID, null);
 else 
set_Value (COLUMNNAME_C_DocType_ID, Integer.valueOf(C_DocType_ID));
}
/** Get Document Type.
@return Document type or rules */
public int getC_DocType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_DocType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a32681f9-ce00-4c33-9f4a-2c1e3794c64d")
public static String es_PE_COLUMN_C_DocType_ID_Name="Document Type";

@XendraColumn(AD_Element_ID="099a4147-1a72-cdd0-81e0-8bdbc8c0b883",ColumnName="C_DocType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a32681f9-ce00-4c33-9f4a-2c1e3794c64d",
Synchronized="2017-08-05 16:54:45.0")
/** Column name C_DocType_ID */
public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
/** Set Invoice.
@param C_Invoice_ID Invoice Identifier */
public void setC_Invoice_ID (int C_Invoice_ID)
{
if (C_Invoice_ID <= 0) set_Value (COLUMNNAME_C_Invoice_ID, null);
 else 
set_Value (COLUMNNAME_C_Invoice_ID, Integer.valueOf(C_Invoice_ID));
}
/** Get Invoice.
@return Invoice Identifier */
public int getC_Invoice_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Invoice_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ddbc905e-70b2-4e05-b31a-4d5234a7386c")
public static String es_PE_COLUMN_C_Invoice_ID_Name="Invoice";

@XendraColumn(AD_Element_ID="e526ea57-1bdf-9871-fd57-0df3c1f9dd42",ColumnName="C_Invoice_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ddbc905e-70b2-4e05-b31a-4d5234a7386c",
Synchronized="2017-08-05 16:54:45.0")
/** Column name C_Invoice_ID */
public static final String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
/** Set Column Type.
@param ColumnType Column Type */
public void setColumnType (boolean ColumnType)
{
set_Value (COLUMNNAME_ColumnType, Boolean.valueOf(ColumnType));
}
/** Get Column Type.
@return Column Type */
public boolean isColumnType() 
{
Object oo = get_Value(COLUMNNAME_ColumnType);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="0aadcde4-71e8-4c3b-81cc-b62c8c4336bb")
public static String es_PE_COLUMN_ColumnType_Name="Column Type";

@XendraColumn(AD_Element_ID="0b8552b6-c46e-65ec-4406-e850f56b5e7e",ColumnName="ColumnType",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0aadcde4-71e8-4c3b-81cc-b62c8c4336bb",
Synchronized="2017-08-05 16:54:45.0")
/** Column name ColumnType */
public static final String COLUMNNAME_ColumnType = "ColumnType";
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

@XendraTrl(Identifier="86d1d6ff-33c8-45e5-8836-4baaffbc8581")
public static String es_PE_COLUMN_Description_Name="Description";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="86d1d6ff-33c8-45e5-8836-4baaffbc8581",
Synchronized="2017-08-05 16:54:45.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set HR_Attribute_Acct.
@param HR_Attribute_Acct HR_Attribute_Acct */
public void setHR_Attribute_Acct (int HR_Attribute_Acct)
{
set_Value (COLUMNNAME_HR_Attribute_Acct, Integer.valueOf(HR_Attribute_Acct));
}
/** Get HR_Attribute_Acct.
@return HR_Attribute_Acct */
public int getHR_Attribute_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HR_Attribute_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="eca50a04-c397-4f42-87f8-6c0bc95b5222")
public static String es_PE_COLUMN_HR_Attribute_Acct_Name="hr_attribute_acct";

@XendraColumn(AD_Element_ID="9ad7c8f4-20fd-4b56-9da5-a2249b5f83fa",ColumnName="HR_Attribute_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="eca50a04-c397-4f42-87f8-6c0bc95b5222",
Synchronized="2017-08-05 16:54:45.0")
/** Column name HR_Attribute_Acct */
public static final String COLUMNNAME_HR_Attribute_Acct = "HR_Attribute_Acct";
/** Set HR_Attribute.
@param HR_Attribute_ID HR_Attribute */
public void setHR_Attribute_ID (int HR_Attribute_ID)
{
if (HR_Attribute_ID < 1) throw new IllegalArgumentException ("HR_Attribute_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_HR_Attribute_ID, Integer.valueOf(HR_Attribute_ID));
}
/** Get HR_Attribute.
@return HR_Attribute */
public int getHR_Attribute_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HR_Attribute_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name HR_Attribute_ID */
public static final String COLUMNNAME_HR_Attribute_ID = "HR_Attribute_ID";
/** Set HR_Concept_ID.
@param HR_Concept_ID HR_Concept_ID */
public void setHR_Concept_ID (int HR_Concept_ID)
{
if (HR_Concept_ID < 1) throw new IllegalArgumentException ("HR_Concept_ID is mandatory.");
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

@XendraTrl(Identifier="b12dd677-90a8-4b3e-9274-0f2e2db43ee8")
public static String es_PE_COLUMN_HR_Concept_ID_Name="hr_concept_id";

@XendraColumn(AD_Element_ID="9f5a2e6a-1245-463f-ae5e-e1543a9bd3b1",ColumnName="HR_Concept_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b12dd677-90a8-4b3e-9274-0f2e2db43ee8",
Synchronized="2017-08-05 16:54:45.0")
/** Column name HR_Concept_ID */
public static final String COLUMNNAME_HR_Concept_ID = "HR_Concept_ID";
/** Set Payroll Department.
@param HR_Department_ID Payroll Department */
public void setHR_Department_ID (int HR_Department_ID)
{
if (HR_Department_ID <= 0) set_Value (COLUMNNAME_HR_Department_ID, null);
 else 
set_Value (COLUMNNAME_HR_Department_ID, Integer.valueOf(HR_Department_ID));
}
/** Get Payroll Department.
@return Payroll Department */
public int getHR_Department_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HR_Department_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="eb072983-5772-4cf8-b53f-1bd5f88cd6ef")
public static String es_PE_COLUMN_HR_Department_ID_Name="hr_department_id";

@XendraColumn(AD_Element_ID="9840f276-88b2-4bd2-accd-1d0a1a1dcf1f",ColumnName="HR_Department_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="eb072983-5772-4cf8-b53f-1bd5f88cd6ef",
Synchronized="2017-08-05 16:54:45.0")
/** Column name HR_Department_ID */
public static final String COLUMNNAME_HR_Department_ID = "HR_Department_ID";
/** Set HR_Employee_ID.
@param HR_Employee_ID HR_Employee_ID */
public void setHR_Employee_ID (int HR_Employee_ID)
{
if (HR_Employee_ID <= 0) set_Value (COLUMNNAME_HR_Employee_ID, null);
 else 
set_Value (COLUMNNAME_HR_Employee_ID, Integer.valueOf(HR_Employee_ID));
}
/** Get HR_Employee_ID.
@return HR_Employee_ID */
public int getHR_Employee_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HR_Employee_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7033da28-f91b-4224-9a80-e2a63fd96639")
public static String es_PE_COLUMN_HR_Employee_ID_Name="hr_employee_id";

@XendraColumn(AD_Element_ID="e2e2d837-3087-4795-9ab7-535beef68162",ColumnName="HR_Employee_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7033da28-f91b-4224-9a80-e2a63fd96639",
Synchronized="2017-08-05 16:54:45.0")
/** Column name HR_Employee_ID */
public static final String COLUMNNAME_HR_Employee_ID = "HR_Employee_ID";
/** Set HR_Job_ID.
@param HR_Job_ID HR_Job_ID */
public void setHR_Job_ID (int HR_Job_ID)
{
if (HR_Job_ID <= 0) set_Value (COLUMNNAME_HR_Job_ID, null);
 else 
set_Value (COLUMNNAME_HR_Job_ID, Integer.valueOf(HR_Job_ID));
}
/** Get HR_Job_ID.
@return HR_Job_ID */
public int getHR_Job_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HR_Job_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1bc6869f-3c11-4a27-a887-1053946dd982")
public static String es_PE_COLUMN_HR_Job_ID_Name="hr_job_id";

@XendraColumn(AD_Element_ID="1c2e67d4-c857-4514-908a-4b5c69d29cb0",ColumnName="HR_Job_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1bc6869f-3c11-4a27-a887-1053946dd982",
Synchronized="2017-08-05 16:54:45.0")
/** Column name HR_Job_ID */
public static final String COLUMNNAME_HR_Job_ID = "HR_Job_ID";
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

@XendraTrl(Identifier="1406b2b9-a8dc-4375-8ecb-34572082af81")
public static String es_PE_COLUMN_HR_Payroll_ID_Name="hr_payroll_id";

@XendraColumn(AD_Element_ID="7e583833-168b-49d6-84d9-137ec0c40d00",ColumnName="HR_Payroll_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1406b2b9-a8dc-4375-8ecb-34572082af81",
Synchronized="2017-08-05 16:54:45.0")
/** Column name HR_Payroll_ID */
public static final String COLUMNNAME_HR_Payroll_ID = "HR_Payroll_ID";
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
@XendraTrl(Identifier="06d64baf-378f-4d97-9080-77204a29e22d")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="06d64baf-378f-4d97-9080-77204a29e22d",
Synchronized="2017-08-05 16:54:45.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Printed.
@param IsPrinted Indicates if this document / line is printed */
public void setIsPrinted (boolean IsPrinted)
{
set_Value (COLUMNNAME_IsPrinted, Boolean.valueOf(IsPrinted));
}
/** Get Printed.
@return Indicates if this document / line is printed */
public boolean isPrinted() 
{
Object oo = get_Value(COLUMNNAME_IsPrinted);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="e8109fee-55a8-4d76-ae8b-35e37d64dd27")
public static String es_PE_COLUMN_IsPrinted_Name="Printed";

@XendraColumn(AD_Element_ID="66795cb3-a608-19bb-8cde-40abe30a0130",ColumnName="IsPrinted",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e8109fee-55a8-4d76-ae8b-35e37d64dd27",
Synchronized="2017-08-05 16:54:45.0")
/** Column name IsPrinted */
public static final String COLUMNNAME_IsPrinted = "IsPrinted";
/** Set MaxValue.
@param MaxValue MaxValue */
public void setMaxValue (int MaxValue)
{
set_Value (COLUMNNAME_MaxValue, Integer.valueOf(MaxValue));
}
/** Get MaxValue.
@return MaxValue */
public int getMaxValue() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_MaxValue);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f5be2182-057e-465c-a9f7-0e5a5933dea0")
public static String es_PE_COLUMN_MaxValue_Name="maxvalue";

@XendraColumn(AD_Element_ID="f60bf85a-390f-408a-bd67-503b630e7e5c",ColumnName="MaxValue",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f5be2182-057e-465c-a9f7-0e5a5933dea0",
Synchronized="2017-08-05 16:54:45.0")
/** Column name MaxValue */
public static final String COLUMNNAME_MaxValue = "MaxValue";
/** Set MinValue.
@param MinValue MinValue */
public void setMinValue (int MinValue)
{
set_Value (COLUMNNAME_MinValue, Integer.valueOf(MinValue));
}
/** Get MinValue.
@return MinValue */
public int getMinValue() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_MinValue);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b977f454-7bec-4615-bf10-dc84e9f797f7")
public static String es_PE_COLUMN_MinValue_Name="minvalue";

@XendraColumn(AD_Element_ID="33cc2a37-7fef-4b2c-82c9-e1e3ee4ea33a",ColumnName="MinValue",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b977f454-7bec-4615-bf10-dc84e9f797f7",
Synchronized="2017-08-05 16:54:45.0")
/** Column name MinValue */
public static final String COLUMNNAME_MinValue = "MinValue";
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

@XendraTrl(Identifier="ebd5f7fe-d214-4356-903f-010bd8471e41")
public static String es_PE_COLUMN_Qty_Name="Quantity";

@XendraColumn(AD_Element_ID="c9d74a25-87c5-9592-5660-4f397607dad3",ColumnName="Qty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ebd5f7fe-d214-4356-903f-010bd8471e41",
Synchronized="2017-08-05 16:54:45.0")
/** Column name Qty */
public static final String COLUMNNAME_Qty = "Qty";
/** Set Service date.
@param ServiceDate Date service was provided */
public void setServiceDate (Timestamp ServiceDate)
{
set_Value (COLUMNNAME_ServiceDate, ServiceDate);
}
/** Get Service date.
@return Date service was provided */
public Timestamp getServiceDate() 
{
return (Timestamp)get_Value(COLUMNNAME_ServiceDate);
}

@XendraTrl(Identifier="f1ad1e86-99f4-4a38-838b-438d1b19a200")
public static String es_PE_COLUMN_ServiceDate_Name="Service date";

@XendraColumn(AD_Element_ID="99e6be5a-1737-5ca4-7cf9-74454571eafc",ColumnName="ServiceDate",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f1ad1e86-99f4-4a38-838b-438d1b19a200",
Synchronized="2017-08-05 16:54:45.0")
/** Column name ServiceDate */
public static final String COLUMNNAME_ServiceDate = "ServiceDate";
/** Set Text Message.
@param TextMsg Text Message */
public void setTextMsg (String TextMsg)
{
if (TextMsg != null && TextMsg.length() > 255)
{
log.warning("Length > 255 - truncated");
TextMsg = TextMsg.substring(0,254);
}
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
@XendraTrl(Identifier="35c96f59-b7e2-40c5-a8f6-3545f805c849")
public static String es_PE_COLUMN_TextMsg_Name="Text Message";

@XendraColumn(AD_Element_ID="377bebfe-238a-1c79-c1a9-13afa4448222",ColumnName="TextMsg",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="35c96f59-b7e2-40c5-a8f6-3545f805c849",
Synchronized="2017-08-05 16:54:45.0")
/** Column name TextMsg */
public static final String COLUMNNAME_TextMsg = "TextMsg";
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

@XendraTrl(Identifier="2701760d-3db1-4eaf-a4c8-07e8ca58df79")
public static String es_PE_COLUMN_ValidFrom_Name="Valid from";

@XendraColumn(AD_Element_ID="86b1171a-a6c6-0da5-1aea-3f3106450d07",ColumnName="ValidFrom",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2701760d-3db1-4eaf-a4c8-07e8ca58df79",
Synchronized="2017-08-05 16:54:45.0")
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

@XendraTrl(Identifier="d9084f2d-5453-4baa-9856-a80119b9b0f6")
public static String es_PE_COLUMN_ValidTo_Name="Valid to";

@XendraColumn(AD_Element_ID="0fbe43c3-c76d-0505-0043-63adb568a68f",ColumnName="ValidTo",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d9084f2d-5453-4baa-9856-a80119b9b0f6",
Synchronized="2017-08-05 16:54:45.0")
/** Column name ValidTo */
public static final String COLUMNNAME_ValidTo = "ValidTo";
}
