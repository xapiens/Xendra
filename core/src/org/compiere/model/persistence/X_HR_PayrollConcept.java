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
/** Generated Model for HR_PayrollConcept
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_HR_PayrollConcept extends PO
{
/** Standard Constructor
@param ctx context
@param HR_PayrollConcept_ID id
@param trxName transaction
*/
public X_HR_PayrollConcept (Properties ctx, int HR_PayrollConcept_ID, String trxName)
{
super (ctx, HR_PayrollConcept_ID, trxName);
/** if (HR_PayrollConcept_ID == 0)
{
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_HR_PayrollConcept (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000380 */
public static int Table_ID=MTable.getTable_ID("HR_PayrollConcept");

@XendraTrl(Identifier="f70c635c-18bb-4b0c-ad1a-2d518104c7ce")
public static String es_PE_TABLE_HR_PayrollConcept_Name="Payroll Concept";

@XendraTable(Name="Payroll Concept",Description="",Help="",TableName="HR_PayrollConcept",
AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,
IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",
ID="org.xendra.humanresource",Identifier="f70c635c-18bb-4b0c-ad1a-2d518104c7ce",
Synchronized="2017-08-16 11:42:49.0")
/** TableName=HR_PayrollConcept */
public static final String Table_Name="HR_PayrollConcept";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"HR_PayrollConcept");

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
    Table_ID = MTable.getTable_ID("HR_PayrollConcept");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_HR_PayrollConcept[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="ec2fb5bf-b8ba-4a8f-8ba8-85dfa7b55ad5")
public static String es_PE_COLUMN_AD_Rule_ID_Name="AD_Rule_ID";

@XendraColumn(AD_Element_ID="4b4afdeb-6aca-d182-6e3a-83f0f6d29f7d",ColumnName="AD_Rule_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ec2fb5bf-b8ba-4a8f-8ba8-85dfa7b55ad5",
Synchronized="2017-08-05 16:54:47.0")
/** Column name AD_Rule_ID */
public static final String COLUMNNAME_AD_Rule_ID = "AD_Rule_ID";
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

@XendraTrl(Identifier="c2f22a0a-cead-47d0-add2-6b42f836c461")
public static String es_PE_COLUMN_HR_Concept_ID_Name="HR_Concept_ID";

@XendraColumn(AD_Element_ID="9f5a2e6a-1245-463f-ae5e-e1543a9bd3b1",ColumnName="HR_Concept_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c2f22a0a-cead-47d0-add2-6b42f836c461",
Synchronized="2017-08-05 16:54:47.0")
/** Column name HR_Concept_ID */
public static final String COLUMNNAME_HR_Concept_ID = "HR_Concept_ID";
/** Set Payroll Concept.
@param HR_PayrollConcept_ID Payroll Concept */
public void setHR_PayrollConcept_ID (int HR_PayrollConcept_ID)
{
if (HR_PayrollConcept_ID <= 0) set_ValueNoCheck (COLUMNNAME_HR_PayrollConcept_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_HR_PayrollConcept_ID, Integer.valueOf(HR_PayrollConcept_ID));
}
/** Get Payroll Concept.
@return Payroll Concept */
public int getHR_PayrollConcept_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HR_PayrollConcept_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name HR_PayrollConcept_ID */
public static final String COLUMNNAME_HR_PayrollConcept_ID = "HR_PayrollConcept_ID";
/** Set HR_payrollconcept_UU.
@param HR_payrollconcept_UU HR_payrollconcept_UU */
public void setHR_payrollconcept_UU (String HR_payrollconcept_UU)
{
if (HR_payrollconcept_UU != null && HR_payrollconcept_UU.length() > 37)
{
log.warning("Length > 37 - truncated");
HR_payrollconcept_UU = HR_payrollconcept_UU.substring(0,36);
}
set_Value (COLUMNNAME_HR_payrollconcept_UU, HR_payrollconcept_UU);
}
/** Get HR_payrollconcept_UU.
@return HR_payrollconcept_UU */
public String getHR_payrollconcept_UU() 
{
String value = (String)get_Value(COLUMNNAME_HR_payrollconcept_UU);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="5e52ea78-9e34-4edb-a34c-1f2ce3e4e7f9")
public static String es_PE_COLUMN_HR_payrollconcept_UU_Name="hr_payrollconcept_uu";

@XendraColumn(AD_Element_ID="a7a811db-4758-4881-9b90-c334dd4c6b09",
ColumnName="HR_payrollconcept_UU",AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=37,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="5e52ea78-9e34-4edb-a34c-1f2ce3e4e7f9",Synchronized="2017-08-05 16:54:47.0")
/** Column name HR_payrollconcept_UU */
public static final String COLUMNNAME_HR_payrollconcept_UU = "HR_payrollconcept_UU";
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

@XendraTrl(Identifier="d6c6e803-741e-4176-84d5-82834f2f9121")
public static String es_PE_COLUMN_HR_Payroll_ID_Name="HR_Payroll_ID";

@XendraColumn(AD_Element_ID="7e583833-168b-49d6-84d9-137ec0c40d00",ColumnName="HR_Payroll_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d6c6e803-741e-4176-84d5-82834f2f9121",
Synchronized="2017-08-05 16:54:47.0")
/** Column name HR_Payroll_ID */
public static final String COLUMNNAME_HR_Payroll_ID = "HR_Payroll_ID";
/** Set Displayed.
@param IsDisplayed Determines, if this field is displayed */
public void setIsDisplayed (boolean IsDisplayed)
{
set_Value (COLUMNNAME_IsDisplayed, Boolean.valueOf(IsDisplayed));
}
/** Get Displayed.
@return Determines, if this field is displayed */
public boolean isDisplayed() 
{
Object oo = get_Value(COLUMNNAME_IsDisplayed);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="f4e7cad3-ea6b-4233-97ee-94ebe023bdaa")
public static String es_PE_COLUMN_IsDisplayed_Name="Displayed";

@XendraColumn(AD_Element_ID="c1bfb876-0c16-8bbc-3714-fb5c9f0481b5",ColumnName="IsDisplayed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f4e7cad3-ea6b-4233-97ee-94ebe023bdaa",
Synchronized="2017-08-05 16:54:47.0")
/** Column name IsDisplayed */
public static final String COLUMNNAME_IsDisplayed = "IsDisplayed";
/** Set Included.
@param IsInclude Defines whether this content / template is included into another one */
public void setIsInclude (boolean IsInclude)
{
set_Value (COLUMNNAME_IsInclude, Boolean.valueOf(IsInclude));
}
/** Get Included.
@return Defines whether this content / template is included into another one */
public boolean isInclude() 
{
Object oo = get_Value(COLUMNNAME_IsInclude);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="81b350b8-9dde-430c-a8b7-9ebc0364be5f")
public static String es_PE_COLUMN_IsInclude_Name="Included";

@XendraColumn(AD_Element_ID="67f1d39f-a912-b886-3e0c-ae3a4c876c19",ColumnName="IsInclude",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="81b350b8-9dde-430c-a8b7-9ebc0364be5f",
Synchronized="2017-08-05 16:54:47.0")
/** Column name IsInclude */
public static final String COLUMNNAME_IsInclude = "IsInclude";
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

@XendraTrl(Identifier="fe293bd3-70a9-4dd6-9528-91e5a37d2729")
public static String es_PE_COLUMN_IsPrinted_Name="Printed";

@XendraColumn(AD_Element_ID="66795cb3-a608-19bb-8cde-40abe30a0130",ColumnName="IsPrinted",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fe293bd3-70a9-4dd6-9528-91e5a37d2729",
Synchronized="2017-08-05 16:54:47.0")
/** Column name IsPrinted */
public static final String COLUMNNAME_IsPrinted = "IsPrinted";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name != null && Name.length() > 60)
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

@XendraTrl(Identifier="402e4a41-287d-42ec-8960-8218518b9c08")
public static String es_PE_COLUMN_Name_Name="Name";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="402e4a41-287d-42ec-8960-8218518b9c08",
Synchronized="2017-08-05 16:54:47.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Sequence.
@param SeqNo Method of ordering records: lowest number comes first */
public void setSeqNo (int SeqNo)
{
set_Value (COLUMNNAME_SeqNo, Integer.valueOf(SeqNo));
}
/** Get Sequence.
@return Method of ordering records: lowest number comes first */
public int getSeqNo() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_SeqNo);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5958cfe3-2cb3-463d-8269-98f11f1fee32")
public static String es_PE_COLUMN_SeqNo_Name="Sequence";

@XendraColumn(AD_Element_ID="38fa26fe-b59d-fce1-c129-420b57da738b",ColumnName="SeqNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5958cfe3-2cb3-463d-8269-98f11f1fee32",
Synchronized="2017-08-05 16:54:47.0")
/** Column name SeqNo */
public static final String COLUMNNAME_SeqNo = "SeqNo";
}
