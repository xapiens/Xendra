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
/** Generated Model for C_Subject
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_Subject extends PO
{
/** Standard Constructor
@param ctx context
@param C_Subject_ID id
@param trxName transaction
*/
public X_C_Subject (Properties ctx, int C_Subject_ID, String trxName)
{
super (ctx, C_Subject_ID, trxName);
/** if (C_Subject_ID == 0)
{
setC_Subject_ID (0);
setIsCalculated (false);	
// N
setIsSummary (false);	
// N
setName (null);
setType (null);
setValue (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_Subject (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000025 */
public static int Table_ID=MTable.getTable_ID("C_Subject");

@XendraTrl(Identifier="35dcf0f0-792f-f15c-58dd-19100da93a01")
public static String es_PE_TAB_GeneralBalance_Name="Balance General";

@XendraTab(Name="General Balance",Description="",Help="",
AD_Window_ID="8c55731d-6c5d-0bdf-f084-e5cdcdd06d94",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=true,
WhereClause="C_Subject.Type='BAGN'",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="35dcf0f0-792f-f15c-58dd-19100da93a01",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_GeneralBalance="35dcf0f0-792f-f15c-58dd-19100da93a01";

@XendraTrl(Identifier="73c216b9-1e4d-daaa-40b2-5ef2a945ed59")
public static String es_PE_TAB_EGPN_Name="EGPN";
@XendraTab(Name="EGPN",Description="",Help="",
AD_Window_ID="8c55731d-6c5d-0bdf-f084-e5cdcdd06d94",SeqNo=20,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=true,
WhereClause="C_Subject.Type='EGPN'",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="73c216b9-1e4d-daaa-40b2-5ef2a945ed59",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_EGPN="73c216b9-1e4d-daaa-40b2-5ef2a945ed59";

@XendraTrl(Identifier="40e4f662-1f16-05b5-2ec3-dd3c384f78f8")
public static String es_PE_TAB_EGPF_Name="EGPF";
@XendraTab(Name="EGPF",Description="",Help="",
AD_Window_ID="8c55731d-6c5d-0bdf-f084-e5cdcdd06d94",SeqNo=30,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=true,
WhereClause="C_Subject.Type='EGPF'",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="40e4f662-1f16-05b5-2ec3-dd3c384f78f8",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_EGPF="40e4f662-1f16-05b5-2ec3-dd3c384f78f8";

@XendraTrl(Identifier="b5387127-4df2-3565-79da-5233b4747fa0")
public static String es_PE_TABLE_C_Subject_Name="General BalanceSubject";

@XendraTable(Name="General BalanceSubject",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",TableName="C_Subject",
AccessLevel="6",AD_Window_ID="8c55731d-6c5d-0bdf-f084-e5cdcdd06d94",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="b5387127-4df2-3565-79da-5233b4747fa0",Synchronized="2020-03-03 21:37:41.0")
/** TableName=C_Subject */
public static final String Table_Name="C_Subject";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_Subject");

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
    Table_ID = MTable.getTable_ID("C_Subject");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_Subject[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Account Type.
@param AccountType Indicates the type of account */
public void setAccountType (String AccountType)
{
if (AccountType != null && AccountType.length() > 1)
{
log.warning("Length > 1 - truncated");
AccountType = AccountType.substring(0,0);
}
set_Value (COLUMNNAME_AccountType, AccountType);
}
/** Get Account Type.
@return Indicates the type of account */
public String getAccountType() 
{
return (String)get_Value(COLUMNNAME_AccountType);
}

@XendraTrl(Identifier="8ecda0d9-ee78-3a3f-332d-e37022664ad2")
public static String es_PE_FIELD_GeneralBalance_AccountType_Name="Tipo de Cuenta";

@XendraTrl(Identifier="8ecda0d9-ee78-3a3f-332d-e37022664ad2")
public static String es_PE_FIELD_GeneralBalance_AccountType_Description="Indica el tipo de cuenta";

@XendraTrl(Identifier="8ecda0d9-ee78-3a3f-332d-e37022664ad2")
public static String es_PE_FIELD_GeneralBalance_AccountType_Help="Tipos de cuenta válidos son A - Activo; E - Gastos; L - Pasivo; O - Propietario";

@XendraField(AD_Column_ID="AccountType",IsCentrallyMaintained=true,
AD_Tab_ID="35dcf0f0-792f-f15c-58dd-19100da93a01",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8ecda0d9-ee78-3a3f-332d-e37022664ad2")
public static final String FIELDNAME_GeneralBalance_AccountType="8ecda0d9-ee78-3a3f-332d-e37022664ad2";

@XendraTrl(Identifier="de9eb820-a8e2-50d0-6714-5ca741bb33c9")
public static String es_PE_FIELD_EGPN_AccountType_Name="Tipo de Cuenta";

@XendraTrl(Identifier="de9eb820-a8e2-50d0-6714-5ca741bb33c9")
public static String es_PE_FIELD_EGPN_AccountType_Description="Indica el tipo de cuenta";

@XendraTrl(Identifier="de9eb820-a8e2-50d0-6714-5ca741bb33c9")
public static String es_PE_FIELD_EGPN_AccountType_Help="Tipos de cuenta válidos son A - Activo; E - Gastos; L - Pasivo; O - Propietario";

@XendraField(AD_Column_ID="AccountType",IsCentrallyMaintained=true,
AD_Tab_ID="73c216b9-1e4d-daaa-40b2-5ef2a945ed59",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="de9eb820-a8e2-50d0-6714-5ca741bb33c9")
public static final String FIELDNAME_EGPN_AccountType="de9eb820-a8e2-50d0-6714-5ca741bb33c9";

@XendraTrl(Identifier="0970eca3-2cb0-5085-4db8-138886ce57ef")
public static String es_PE_FIELD_EGPF_AccountType_Name="Tipo de Cuenta";

@XendraTrl(Identifier="0970eca3-2cb0-5085-4db8-138886ce57ef")
public static String es_PE_FIELD_EGPF_AccountType_Description="Indica el tipo de cuenta";

@XendraTrl(Identifier="0970eca3-2cb0-5085-4db8-138886ce57ef")
public static String es_PE_FIELD_EGPF_AccountType_Help="Tipos de cuenta válidos son A - Activo; E - Gastos; L - Pasivo; O - Propietario";

@XendraField(AD_Column_ID="AccountType",IsCentrallyMaintained=true,
AD_Tab_ID="40e4f662-1f16-05b5-2ec3-dd3c384f78f8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0970eca3-2cb0-5085-4db8-138886ce57ef")
public static final String FIELDNAME_EGPF_AccountType="0970eca3-2cb0-5085-4db8-138886ce57ef";

@XendraTrl(Identifier="afe1f09e-1b0f-2fee-57e8-8bf176d509e1")
public static String es_PE_COLUMN_AccountType_Name="Tipo de Cuenta";

@XendraColumn(AD_Element_ID="ec156e95-2067-29e9-eb38-6c9e67f8a90d",ColumnName="AccountType",
AD_Reference_ID=17,AD_Reference_Value_ID="c9364c64-6481-06c6-6a91-931ae4cfdb71",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="afe1f09e-1b0f-2fee-57e8-8bf176d509e1",Synchronized="2019-08-30 22:22:18.0")
/** Column name AccountType */
public static final String COLUMNNAME_AccountType = "AccountType";
/** Set General BalanceSubject.
@param C_Subject_ID General BalanceSubject */
public void setC_Subject_ID (int C_Subject_ID)
{
if (C_Subject_ID < 1) throw new IllegalArgumentException ("C_Subject_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Subject_ID, Integer.valueOf(C_Subject_ID));
}
/** Get General BalanceSubject.
@return General BalanceSubject */
public int getC_Subject_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Subject_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ffb68a07-fbac-3ce4-453a-cf090d0284ce")
public static String es_PE_FIELD_GeneralBalance_GeneralBalanceSubject_Name="General BalanceSubject";

@XendraField(AD_Column_ID="C_Subject_ID",IsCentrallyMaintained=true,
AD_Tab_ID="35dcf0f0-792f-f15c-58dd-19100da93a01",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ffb68a07-fbac-3ce4-453a-cf090d0284ce")
public static final String FIELDNAME_GeneralBalance_GeneralBalanceSubject="ffb68a07-fbac-3ce4-453a-cf090d0284ce";

@XendraTrl(Identifier="5f19974c-d73b-9d6d-62d2-a6cbe6f07d69")
public static String es_PE_FIELD_EGPN_GeneralBalanceSubject_Name="General BalanceSubject";

@XendraField(AD_Column_ID="C_Subject_ID",IsCentrallyMaintained=true,
AD_Tab_ID="73c216b9-1e4d-daaa-40b2-5ef2a945ed59",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5f19974c-d73b-9d6d-62d2-a6cbe6f07d69")
public static final String FIELDNAME_EGPN_GeneralBalanceSubject="5f19974c-d73b-9d6d-62d2-a6cbe6f07d69";

@XendraTrl(Identifier="12dc152f-5778-cb07-6a4f-f57604b2a3d6")
public static String es_PE_FIELD_EGPF_GeneralBalanceSubject_Name="General BalanceSubject";

@XendraField(AD_Column_ID="C_Subject_ID",IsCentrallyMaintained=true,
AD_Tab_ID="40e4f662-1f16-05b5-2ec3-dd3c384f78f8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="12dc152f-5778-cb07-6a4f-f57604b2a3d6")
public static final String FIELDNAME_EGPF_GeneralBalanceSubject="12dc152f-5778-cb07-6a4f-f57604b2a3d6";
/** Column name C_Subject_ID */
public static final String COLUMNNAME_C_Subject_ID = "C_Subject_ID";
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

@XendraTrl(Identifier="b9ba20b1-18f6-11fa-4320-f26353d7778f")
public static String es_PE_FIELD_GeneralBalance_Description_Name="Observación";

@XendraTrl(Identifier="b9ba20b1-18f6-11fa-4320-f26353d7778f")
public static String es_PE_FIELD_GeneralBalance_Description_Description="Observación";

@XendraTrl(Identifier="b9ba20b1-18f6-11fa-4320-f26353d7778f")
public static String es_PE_FIELD_GeneralBalance_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="35dcf0f0-792f-f15c-58dd-19100da93a01",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b9ba20b1-18f6-11fa-4320-f26353d7778f")
public static final String FIELDNAME_GeneralBalance_Description="b9ba20b1-18f6-11fa-4320-f26353d7778f";

@XendraTrl(Identifier="0c494baf-3215-3d70-aa71-64ffc2243fa5")
public static String es_PE_FIELD_EGPN_Description_Name="Observación";

@XendraTrl(Identifier="0c494baf-3215-3d70-aa71-64ffc2243fa5")
public static String es_PE_FIELD_EGPN_Description_Description="Observación";

@XendraTrl(Identifier="0c494baf-3215-3d70-aa71-64ffc2243fa5")
public static String es_PE_FIELD_EGPN_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="73c216b9-1e4d-daaa-40b2-5ef2a945ed59",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0c494baf-3215-3d70-aa71-64ffc2243fa5")
public static final String FIELDNAME_EGPN_Description="0c494baf-3215-3d70-aa71-64ffc2243fa5";

@XendraTrl(Identifier="af852741-551e-47ae-bd0c-c2509d8ee0d6")
public static String es_PE_FIELD_EGPF_Description_Name="Observación";

@XendraTrl(Identifier="af852741-551e-47ae-bd0c-c2509d8ee0d6")
public static String es_PE_FIELD_EGPF_Description_Description="Observación";

@XendraTrl(Identifier="af852741-551e-47ae-bd0c-c2509d8ee0d6")
public static String es_PE_FIELD_EGPF_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="40e4f662-1f16-05b5-2ec3-dd3c384f78f8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="af852741-551e-47ae-bd0c-c2509d8ee0d6")
public static final String FIELDNAME_EGPF_Description="af852741-551e-47ae-bd0c-c2509d8ee0d6";

@XendraTrl(Identifier="99dee4ae-a952-34b3-21d5-5d4dd078d6f4")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="99dee4ae-a952-34b3-21d5-5d4dd078d6f4",
Synchronized="2019-08-30 22:22:18.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Formula.
@param Formula Formula */
public void setFormula (String Formula)
{
set_Value (COLUMNNAME_Formula, Formula);
}
/** Get Formula.
@return Formula */
public String getFormula() 
{
String value = (String)get_Value(COLUMNNAME_Formula);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="0c00670e-0cde-20a2-860e-deda6277f42a")
public static String es_PE_FIELD_GeneralBalance_Formula_Name="Formula";

@XendraField(AD_Column_ID="Formula",IsCentrallyMaintained=true,
AD_Tab_ID="35dcf0f0-792f-f15c-58dd-19100da93a01",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsCalculated@='Y'",DisplayLength=60,IsReadOnly=false,SeqNo=110,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="0c00670e-0cde-20a2-860e-deda6277f42a")
public static final String FIELDNAME_GeneralBalance_Formula="0c00670e-0cde-20a2-860e-deda6277f42a";

@XendraTrl(Identifier="41bc5576-4d46-34c0-33db-14ea64a6922f")
public static String es_PE_FIELD_EGPN_Formula_Name="Formula";
@XendraField(AD_Column_ID="Formula",
IsCentrallyMaintained=true,AD_Tab_ID="73c216b9-1e4d-daaa-40b2-5ef2a945ed59",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="@IsCalculated@='Y'",DisplayLength=60,IsReadOnly=false,SeqNo=110,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="41bc5576-4d46-34c0-33db-14ea64a6922f")
public static final String FIELDNAME_EGPN_Formula="41bc5576-4d46-34c0-33db-14ea64a6922f";

@XendraTrl(Identifier="3e3a4707-a8b7-c41b-2ec7-4b09511bbc55")
public static String es_PE_FIELD_EGPF_Formula_Name="Formula";
@XendraField(AD_Column_ID="Formula",
IsCentrallyMaintained=true,AD_Tab_ID="40e4f662-1f16-05b5-2ec3-dd3c384f78f8",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="@IsCalculated@=Y",DisplayLength=0,IsReadOnly=false,SeqNo=200,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="3e3a4707-a8b7-c41b-2ec7-4b09511bbc55")
public static final String FIELDNAME_EGPF_Formula="3e3a4707-a8b7-c41b-2ec7-4b09511bbc55";

@XendraTrl(Identifier="96139cdd-7c00-0bf3-189f-ddc6d85f2259")
public static String es_PE_COLUMN_Formula_Name="Formula";

@XendraColumn(AD_Element_ID="3c196d22-14fb-d168-1548-058482a939f6",ColumnName="Formula",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="96139cdd-7c00-0bf3-189f-ddc6d85f2259",
Synchronized="2019-08-30 22:22:18.0")
/** Column name Formula */
public static final String COLUMNNAME_Formula = "Formula";
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
@XendraTrl(Identifier="b497660f-6fc2-4773-814d-716ecd2639fc")
public static String es_PE_FIELD_GeneralBalance_Identifier_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="35dcf0f0-792f-f15c-58dd-19100da93a01",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=36,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-10 11:31:24.0",
Identifier="b497660f-6fc2-4773-814d-716ecd2639fc")
public static final String FIELDNAME_GeneralBalance_Identifier="b497660f-6fc2-4773-814d-716ecd2639fc";

@XendraTrl(Identifier="1b57914c-11e0-4c30-a41c-3920d47a5100")
public static String es_PE_FIELD_EGPN_Identifier_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="73c216b9-1e4d-daaa-40b2-5ef2a945ed59",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=36,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-10 11:31:24.0",
Identifier="1b57914c-11e0-4c30-a41c-3920d47a5100")
public static final String FIELDNAME_EGPN_Identifier="1b57914c-11e0-4c30-a41c-3920d47a5100";

@XendraTrl(Identifier="edc61a3e-e845-404d-9c33-7669ba3d25cd")
public static String es_PE_FIELD_EGPF_Identifier_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="40e4f662-1f16-05b5-2ec3-dd3c384f78f8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=36,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-10 11:31:24.0",
Identifier="edc61a3e-e845-404d-9c33-7669ba3d25cd")
public static final String FIELDNAME_EGPF_Identifier="edc61a3e-e845-404d-9c33-7669ba3d25cd";

@XendraTrl(Identifier="5eb8da8b-d9f9-4ae4-bc4b-d5c0309eca09")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5eb8da8b-d9f9-4ae4-bc4b-d5c0309eca09",
Synchronized="2019-08-30 22:22:18.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Calculated.
@param IsCalculated The value is calculated by the system */
public void setIsCalculated (boolean IsCalculated)
{
set_Value (COLUMNNAME_IsCalculated, Boolean.valueOf(IsCalculated));
}
/** Get Calculated.
@return The value is calculated by the system */
public boolean isCalculated() 
{
Object oo = get_Value(COLUMNNAME_IsCalculated);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="a406995d-d917-1b92-4cab-8fc232850fdb")
public static String es_PE_FIELD_GeneralBalance_Calculated_Name="Calculado";

@XendraTrl(Identifier="a406995d-d917-1b92-4cab-8fc232850fdb")
public static String es_PE_FIELD_GeneralBalance_Calculated_Description="El valor es calculado por el sistema";

@XendraField(AD_Column_ID="IsCalculated",IsCentrallyMaintained=true,
AD_Tab_ID="35dcf0f0-792f-f15c-58dd-19100da93a01",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a406995d-d917-1b92-4cab-8fc232850fdb")
public static final String FIELDNAME_GeneralBalance_Calculated="a406995d-d917-1b92-4cab-8fc232850fdb";

@XendraTrl(Identifier="63420ab9-f9f5-b232-37a9-1af8853048c0")
public static String es_PE_FIELD_EGPN_Calculated_Name="Calculado";

@XendraTrl(Identifier="63420ab9-f9f5-b232-37a9-1af8853048c0")
public static String es_PE_FIELD_EGPN_Calculated_Description="El valor es calculado por el sistema";

@XendraField(AD_Column_ID="IsCalculated",IsCentrallyMaintained=true,
AD_Tab_ID="73c216b9-1e4d-daaa-40b2-5ef2a945ed59",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="63420ab9-f9f5-b232-37a9-1af8853048c0")
public static final String FIELDNAME_EGPN_Calculated="63420ab9-f9f5-b232-37a9-1af8853048c0";

@XendraTrl(Identifier="557e31bd-366c-b3c2-07aa-f0c911edb426")
public static String es_PE_FIELD_EGPF_Calculated_Name="Calculado";

@XendraTrl(Identifier="557e31bd-366c-b3c2-07aa-f0c911edb426")
public static String es_PE_FIELD_EGPF_Calculated_Description="El valor es calculado por el sistema";

@XendraField(AD_Column_ID="IsCalculated",IsCentrallyMaintained=true,
AD_Tab_ID="40e4f662-1f16-05b5-2ec3-dd3c384f78f8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="557e31bd-366c-b3c2-07aa-f0c911edb426")
public static final String FIELDNAME_EGPF_Calculated="557e31bd-366c-b3c2-07aa-f0c911edb426";

@XendraTrl(Identifier="077cb09f-5a5c-8b73-6004-da346900e969")
public static String es_PE_COLUMN_IsCalculated_Name="Calculado";

@XendraColumn(AD_Element_ID="9a7b5e55-338e-a69b-449d-8c9ad9ee5b77",ColumnName="IsCalculated",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="077cb09f-5a5c-8b73-6004-da346900e969",
Synchronized="2019-08-30 22:22:18.0")
/** Column name IsCalculated */
public static final String COLUMNNAME_IsCalculated = "IsCalculated";
/** Set Summary Level.
@param IsSummary This is a summary entity */
public void setIsSummary (boolean IsSummary)
{
set_Value (COLUMNNAME_IsSummary, Boolean.valueOf(IsSummary));
}
/** Get Summary Level.
@return This is a summary entity */
public boolean isSummary() 
{
Object oo = get_Value(COLUMNNAME_IsSummary);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="808d469f-a0a3-cadb-00e2-65602c4c67c8")
public static String es_PE_FIELD_GeneralBalance_SummaryLevel_Name="Entidad Acumulada";

@XendraTrl(Identifier="808d469f-a0a3-cadb-00e2-65602c4c67c8")
public static String es_PE_FIELD_GeneralBalance_SummaryLevel_Description="Esta es una entidad sumaria";

@XendraTrl(Identifier="808d469f-a0a3-cadb-00e2-65602c4c67c8")
public static String es_PE_FIELD_GeneralBalance_SummaryLevel_Help="Una entidad sumaria representa una rama en un árbol mas bien que un nodo final. Las entidades sumarias son usadas para reportar y no tienen valores propios";

@XendraField(AD_Column_ID="IsSummary",IsCentrallyMaintained=true,
AD_Tab_ID="35dcf0f0-792f-f15c-58dd-19100da93a01",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="808d469f-a0a3-cadb-00e2-65602c4c67c8")
public static final String FIELDNAME_GeneralBalance_SummaryLevel="808d469f-a0a3-cadb-00e2-65602c4c67c8";

@XendraTrl(Identifier="913ef023-4df0-2b13-5969-c7747a7d1493")
public static String es_PE_FIELD_EGPN_SummaryLevel_Name="Entidad Acumulada";

@XendraTrl(Identifier="913ef023-4df0-2b13-5969-c7747a7d1493")
public static String es_PE_FIELD_EGPN_SummaryLevel_Description="Esta es una entidad sumaria";

@XendraTrl(Identifier="913ef023-4df0-2b13-5969-c7747a7d1493")
public static String es_PE_FIELD_EGPN_SummaryLevel_Help="Una entidad sumaria representa una rama en un árbol mas bien que un nodo final. Las entidades sumarias son usadas para reportar y no tienen valores propios";

@XendraField(AD_Column_ID="IsSummary",IsCentrallyMaintained=true,
AD_Tab_ID="73c216b9-1e4d-daaa-40b2-5ef2a945ed59",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="913ef023-4df0-2b13-5969-c7747a7d1493")
public static final String FIELDNAME_EGPN_SummaryLevel="913ef023-4df0-2b13-5969-c7747a7d1493";

@XendraTrl(Identifier="19379784-a5fa-688c-2f96-29b2ddeea4dc")
public static String es_PE_FIELD_EGPF_SummaryLevel_Name="Entidad Acumulada";

@XendraTrl(Identifier="19379784-a5fa-688c-2f96-29b2ddeea4dc")
public static String es_PE_FIELD_EGPF_SummaryLevel_Description="Esta es una entidad sumaria";

@XendraTrl(Identifier="19379784-a5fa-688c-2f96-29b2ddeea4dc")
public static String es_PE_FIELD_EGPF_SummaryLevel_Help="Una entidad sumaria representa una rama en un árbol mas bien que un nodo final. Las entidades sumarias son usadas para reportar y no tienen valores propios";

@XendraField(AD_Column_ID="IsSummary",IsCentrallyMaintained=true,
AD_Tab_ID="40e4f662-1f16-05b5-2ec3-dd3c384f78f8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="19379784-a5fa-688c-2f96-29b2ddeea4dc")
public static final String FIELDNAME_EGPF_SummaryLevel="19379784-a5fa-688c-2f96-29b2ddeea4dc";

@XendraTrl(Identifier="d03c299f-6d51-47da-4059-7baed08d18ed")
public static String es_PE_COLUMN_IsSummary_Name="Entidad Acumulada";

@XendraColumn(AD_Element_ID="0ecd1d56-9e2b-8778-7b05-92730d811ad4",ColumnName="IsSummary",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d03c299f-6d51-47da-4059-7baed08d18ed",
Synchronized="2019-08-30 22:22:18.0")
/** Column name IsSummary */
public static final String COLUMNNAME_IsSummary = "IsSummary";
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

@XendraTrl(Identifier="9bc57e4d-a348-31f4-ddc9-02e76f3d9b11")
public static String es_PE_FIELD_GeneralBalance_Name_Name="Nombre";

@XendraTrl(Identifier="9bc57e4d-a348-31f4-ddc9-02e76f3d9b11")
public static String es_PE_FIELD_GeneralBalance_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="9bc57e4d-a348-31f4-ddc9-02e76f3d9b11")
public static String es_PE_FIELD_GeneralBalance_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="35dcf0f0-792f-f15c-58dd-19100da93a01",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9bc57e4d-a348-31f4-ddc9-02e76f3d9b11")
public static final String FIELDNAME_GeneralBalance_Name="9bc57e4d-a348-31f4-ddc9-02e76f3d9b11";

@XendraTrl(Identifier="a0e7973a-a25d-d8db-6f91-3f23741f1669")
public static String es_PE_FIELD_EGPN_Name_Name="Nombre";

@XendraTrl(Identifier="a0e7973a-a25d-d8db-6f91-3f23741f1669")
public static String es_PE_FIELD_EGPN_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="a0e7973a-a25d-d8db-6f91-3f23741f1669")
public static String es_PE_FIELD_EGPN_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="73c216b9-1e4d-daaa-40b2-5ef2a945ed59",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a0e7973a-a25d-d8db-6f91-3f23741f1669")
public static final String FIELDNAME_EGPN_Name="a0e7973a-a25d-d8db-6f91-3f23741f1669";

@XendraTrl(Identifier="71a8e0ba-09c1-b60d-621e-c30b6ad2c522")
public static String es_PE_FIELD_EGPF_Name_Name="Nombre";

@XendraTrl(Identifier="71a8e0ba-09c1-b60d-621e-c30b6ad2c522")
public static String es_PE_FIELD_EGPF_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="71a8e0ba-09c1-b60d-621e-c30b6ad2c522")
public static String es_PE_FIELD_EGPF_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="40e4f662-1f16-05b5-2ec3-dd3c384f78f8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="71a8e0ba-09c1-b60d-621e-c30b6ad2c522")
public static final String FIELDNAME_EGPF_Name="71a8e0ba-09c1-b60d-621e-c30b6ad2c522";

@XendraTrl(Identifier="b6ebd2bb-2e9a-8d03-97f0-2bf0a2443a94")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b6ebd2bb-2e9a-8d03-97f0-2bf0a2443a94",
Synchronized="2019-08-30 22:22:18.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Tax ID.
@param TaxID Tax Identification */
public void setTaxID (String TaxID)
{
if (TaxID != null && TaxID.length() > 20)
{
log.warning("Length > 20 - truncated");
TaxID = TaxID.substring(0,19);
}
set_Value (COLUMNNAME_TaxID, TaxID);
}
/** Get Tax ID.
@return Tax Identification */
public String getTaxID() 
{
String value = (String)get_Value(COLUMNNAME_TaxID);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="c505fc6f-14c4-4215-a72e-3300ffd6c4c6")
public static String es_PE_FIELD_GeneralBalance_TaxID_Name="RFC";

@XendraTrl(Identifier="c505fc6f-14c4-4215-a72e-3300ffd6c4c6")
public static String es_PE_FIELD_GeneralBalance_TaxID_Description="Código de Identificación";

@XendraTrl(Identifier="c505fc6f-14c4-4215-a72e-3300ffd6c4c6")
public static String es_PE_FIELD_GeneralBalance_TaxID_Help="El código de Identificación es el número de identificación gubernamental de esta entidad";

@XendraField(AD_Column_ID="TaxID",IsCentrallyMaintained=true,
AD_Tab_ID="35dcf0f0-792f-f15c-58dd-19100da93a01",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-10 11:31:25.0",
Identifier="c505fc6f-14c4-4215-a72e-3300ffd6c4c6")
public static final String FIELDNAME_GeneralBalance_TaxID="c505fc6f-14c4-4215-a72e-3300ffd6c4c6";

@XendraTrl(Identifier="7884561c-e286-4543-b34f-d978a0f8631c")
public static String es_PE_FIELD_EGPN_TaxID_Name="RFC";

@XendraTrl(Identifier="7884561c-e286-4543-b34f-d978a0f8631c")
public static String es_PE_FIELD_EGPN_TaxID_Description="Código de Identificación";

@XendraTrl(Identifier="7884561c-e286-4543-b34f-d978a0f8631c")
public static String es_PE_FIELD_EGPN_TaxID_Help="El código de Identificación es el número de identificación gubernamental de esta entidad";

@XendraField(AD_Column_ID="TaxID",IsCentrallyMaintained=true,
AD_Tab_ID="73c216b9-1e4d-daaa-40b2-5ef2a945ed59",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-10 11:31:25.0",
Identifier="7884561c-e286-4543-b34f-d978a0f8631c")
public static final String FIELDNAME_EGPN_TaxID="7884561c-e286-4543-b34f-d978a0f8631c";

@XendraTrl(Identifier="6cf4e885-f083-489e-a190-95869fc9ec15")
public static String es_PE_FIELD_EGPF_TaxID_Name="RFC";

@XendraTrl(Identifier="6cf4e885-f083-489e-a190-95869fc9ec15")
public static String es_PE_FIELD_EGPF_TaxID_Description="Código de Identificación";

@XendraTrl(Identifier="6cf4e885-f083-489e-a190-95869fc9ec15")
public static String es_PE_FIELD_EGPF_TaxID_Help="El código de Identificación es el número de identificación gubernamental de esta entidad";

@XendraField(AD_Column_ID="TaxID",IsCentrallyMaintained=true,
AD_Tab_ID="40e4f662-1f16-05b5-2ec3-dd3c384f78f8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-10 11:31:25.0",
Identifier="6cf4e885-f083-489e-a190-95869fc9ec15")
public static final String FIELDNAME_EGPF_TaxID="6cf4e885-f083-489e-a190-95869fc9ec15";

@XendraTrl(Identifier="99361103-670f-4318-9a46-921bd652d60c")
public static String es_PE_COLUMN_TaxID_Name="Tax ID";

@XendraColumn(AD_Element_ID="e0a9d0f7-835b-4f80-4c13-bff62213e232",ColumnName="TaxID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="99361103-670f-4318-9a46-921bd652d60c",
Synchronized="2019-08-30 22:22:18.0")
/** Column name TaxID */
public static final String COLUMNNAME_TaxID = "TaxID";
/** Set Type.
@param Type Type of Validation (SQL, Java Script, Java Language) */
public void setType (String Type)
{
if (Type.length() > 4)
{
log.warning("Length > 4 - truncated");
Type = Type.substring(0,3);
}
set_Value (COLUMNNAME_Type, Type);
}
/** Get Type.
@return Type of Validation (SQL, Java Script, Java Language) */
public String getType() 
{
return (String)get_Value(COLUMNNAME_Type);
}

@XendraTrl(Identifier="81741166-9d0f-337b-bac6-060b6730a578")
public static String es_PE_FIELD_GeneralBalance_Type_Name="Tipo";

@XendraTrl(Identifier="81741166-9d0f-337b-bac6-060b6730a578")
public static String es_PE_FIELD_GeneralBalance_Type_Description="Tipo de validación (SQL; Java Script; Java Language)";

@XendraTrl(Identifier="81741166-9d0f-337b-bac6-060b6730a578")
public static String es_PE_FIELD_GeneralBalance_Type_Help="Indica el tipo de validación que ocurrirá. Esto puede ser SQL; Java Script ó Java Language.";

@XendraField(AD_Column_ID="Type",IsCentrallyMaintained=true,
AD_Tab_ID="35dcf0f0-792f-f15c-58dd-19100da93a01",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="81741166-9d0f-337b-bac6-060b6730a578")
public static final String FIELDNAME_GeneralBalance_Type="81741166-9d0f-337b-bac6-060b6730a578";

@XendraTrl(Identifier="fa81f323-e506-9747-6bcc-120f23126aba")
public static String es_PE_FIELD_EGPN_Type_Name="Tipo";

@XendraTrl(Identifier="fa81f323-e506-9747-6bcc-120f23126aba")
public static String es_PE_FIELD_EGPN_Type_Description="Tipo de validación (SQL; Java Script; Java Language)";

@XendraTrl(Identifier="fa81f323-e506-9747-6bcc-120f23126aba")
public static String es_PE_FIELD_EGPN_Type_Help="Indica el tipo de validación que ocurrirá. Esto puede ser SQL; Java Script ó Java Language.";

@XendraField(AD_Column_ID="Type",IsCentrallyMaintained=true,
AD_Tab_ID="73c216b9-1e4d-daaa-40b2-5ef2a945ed59",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fa81f323-e506-9747-6bcc-120f23126aba")
public static final String FIELDNAME_EGPN_Type="fa81f323-e506-9747-6bcc-120f23126aba";

@XendraTrl(Identifier="378c6e27-3a4a-5a33-8d37-8a693c88e116")
public static String es_PE_FIELD_EGPF_Type_Name="Tipo";

@XendraTrl(Identifier="378c6e27-3a4a-5a33-8d37-8a693c88e116")
public static String es_PE_FIELD_EGPF_Type_Description="Tipo de validación (SQL; Java Script; Java Language)";

@XendraTrl(Identifier="378c6e27-3a4a-5a33-8d37-8a693c88e116")
public static String es_PE_FIELD_EGPF_Type_Help="Indica el tipo de validación que ocurrirá. Esto puede ser SQL; Java Script ó Java Language.";

@XendraField(AD_Column_ID="Type",IsCentrallyMaintained=true,
AD_Tab_ID="40e4f662-1f16-05b5-2ec3-dd3c384f78f8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="378c6e27-3a4a-5a33-8d37-8a693c88e116")
public static final String FIELDNAME_EGPF_Type="378c6e27-3a4a-5a33-8d37-8a693c88e116";

@XendraTrl(Identifier="b0c881d5-54b8-383b-89aa-7d4a627a84ee")
public static String es_PE_COLUMN_Type_Name="Tipo";

@XendraColumn(AD_Element_ID="25f95bd2-be42-03fc-c8d2-a7103835133c",ColumnName="Type",
AD_Reference_ID=17,AD_Reference_Value_ID="ed2d8373-0238-6bf7-3099-d07f2f93bfb3",AD_Val_Rule_ID="",
FieldLength=4,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="b0c881d5-54b8-383b-89aa-7d4a627a84ee",Synchronized="2019-08-30 22:22:18.0")
/** Column name Type */
public static final String COLUMNNAME_Type = "Type";
/** Set Search Key.
@param Value Search key for the record in the format required - must be unique */
public void setValue (String Value)
{
if (Value == null) throw new IllegalArgumentException ("Value is mandatory.");
if (Value.length() > 40)
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
@XendraTrl(Identifier="3249dfb4-b8cd-15f5-07c8-a2f5232a1a78")
public static String es_PE_FIELD_GeneralBalance_SearchKey_Name="Clave de Búsqueda";

@XendraTrl(Identifier="3249dfb4-b8cd-15f5-07c8-a2f5232a1a78")
public static String es_PE_FIELD_GeneralBalance_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="3249dfb4-b8cd-15f5-07c8-a2f5232a1a78")
public static String es_PE_FIELD_GeneralBalance_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="35dcf0f0-792f-f15c-58dd-19100da93a01",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3249dfb4-b8cd-15f5-07c8-a2f5232a1a78")
public static final String FIELDNAME_GeneralBalance_SearchKey="3249dfb4-b8cd-15f5-07c8-a2f5232a1a78";

@XendraTrl(Identifier="4df6389b-c72d-a1c3-18d0-8cf7e7e8b1b2")
public static String es_PE_FIELD_EGPN_SearchKey_Name="Clave de Búsqueda";

@XendraTrl(Identifier="4df6389b-c72d-a1c3-18d0-8cf7e7e8b1b2")
public static String es_PE_FIELD_EGPN_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="4df6389b-c72d-a1c3-18d0-8cf7e7e8b1b2")
public static String es_PE_FIELD_EGPN_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="73c216b9-1e4d-daaa-40b2-5ef2a945ed59",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4df6389b-c72d-a1c3-18d0-8cf7e7e8b1b2")
public static final String FIELDNAME_EGPN_SearchKey="4df6389b-c72d-a1c3-18d0-8cf7e7e8b1b2";

@XendraTrl(Identifier="32be043f-b738-2133-1707-28e7c6ffceb8")
public static String es_PE_FIELD_EGPF_SearchKey_Name="Clave de Búsqueda";

@XendraTrl(Identifier="32be043f-b738-2133-1707-28e7c6ffceb8")
public static String es_PE_FIELD_EGPF_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="32be043f-b738-2133-1707-28e7c6ffceb8")
public static String es_PE_FIELD_EGPF_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="40e4f662-1f16-05b5-2ec3-dd3c384f78f8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="32be043f-b738-2133-1707-28e7c6ffceb8")
public static final String FIELDNAME_EGPF_SearchKey="32be043f-b738-2133-1707-28e7c6ffceb8";

@XendraTrl(Identifier="86d99a13-f7fa-c046-a641-36141b4c6613")
public static String es_PE_COLUMN_Value_Name="Clave de Búsqueda";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="86d99a13-f7fa-c046-a641-36141b4c6613",
Synchronized="2019-08-30 22:22:18.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
}
