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
/** Generated Model for T_GeneralBalance
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_T_GeneralBalance extends PO
{
/** Standard Constructor
@param ctx context
@param T_GeneralBalance_ID id
@param trxName transaction
*/
public X_T_GeneralBalance (Properties ctx, int T_GeneralBalance_ID, String trxName)
{
super (ctx, T_GeneralBalance_ID, trxName);
/** if (T_GeneralBalance_ID == 0)
{
setAD_PInstance_ID (0);
setC_AcctSchema_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_T_GeneralBalance (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000026 */
public static int Table_ID=MTable.getTable_ID("T_GeneralBalance");

@XendraTrl(Identifier="84aec17e-35b7-6d3f-30d0-4252208bb8ab")
public static String es_PE_TABLE_T_GeneralBalance_Name="Result of the General Balance";


@XendraTable(Name="Result of the General Balance",Description="",Help="",
TableName="T_GeneralBalance",AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,LoadSeq=0,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.standard",Identifier="84aec17e-35b7-6d3f-30d0-4252208bb8ab",
Synchronized="2017-08-16 11:44:21.0")
/** TableName=T_GeneralBalance */
public static final String Table_Name="T_GeneralBalance";


@XendraIndex(Name="tgeneralbalance_pinstance",Identifier="4ee4893a-32b5-4fbc-2d9e-2e192dbc2b1c",
Column_Names="ad_pinstance_id",IsUnique="false",
TableIdentifier="4ee4893a-32b5-4fbc-2d9e-2e192dbc2b1c",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_tgeneralbalance_pinstance = "4ee4893a-32b5-4fbc-2d9e-2e192dbc2b1c";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"T_GeneralBalance");

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
    Table_ID = MTable.getTable_ID("T_GeneralBalance");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_T_GeneralBalance[").append(get_ID()).append("]");
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
String value = (String)get_Value(COLUMNNAME_AccountType);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="6a7e4990-904e-66cd-7a3d-2cc83543a3ba")
public static String es_PE_COLUMN_AccountType_Name="Account Type";

@XendraColumn(AD_Element_ID="ec156e95-2067-29e9-eb38-6c9e67f8a90d",ColumnName="AccountType",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6a7e4990-904e-66cd-7a3d-2cc83543a3ba",
Synchronized="2017-08-05 16:56:25.0")
/** Column name AccountType */
public static final String COLUMNNAME_AccountType = "AccountType";
/** Set Process Instance.
@param AD_PInstance_ID Instance of the process */
public void setAD_PInstance_ID (int AD_PInstance_ID)
{
if (AD_PInstance_ID < 1) throw new IllegalArgumentException ("AD_PInstance_ID is mandatory.");
set_Value (COLUMNNAME_AD_PInstance_ID, Integer.valueOf(AD_PInstance_ID));
}
/** Get Process Instance.
@return Instance of the process */
public int getAD_PInstance_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_PInstance_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="32b9c233-12e2-3bde-71cf-e55644091965")
public static String es_PE_COLUMN_AD_PInstance_ID_Name="Process Instance";

@XendraColumn(AD_Element_ID="a293ee40-db79-24cc-fb47-781657ecb499",ColumnName="AD_PInstance_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="32b9c233-12e2-3bde-71cf-e55644091965",
Synchronized="2017-08-05 16:56:25.0")
/** Column name AD_PInstance_ID */
public static final String COLUMNNAME_AD_PInstance_ID = "AD_PInstance_ID";
/** Set Accounted Amount.
@param AmtAcct Amount Balance in Currency of Accounting Schema */
public void setAmtAcct (BigDecimal AmtAcct)
{
set_Value (COLUMNNAME_AmtAcct, AmtAcct);
}
/** Get Accounted Amount.
@return Amount Balance in Currency of Accounting Schema */
public BigDecimal getAmtAcct() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtAcct);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="6e1ba279-8222-feec-f608-6b03c0a6aa41")
public static String es_PE_COLUMN_AmtAcct_Name="Importe Contable";

@XendraColumn(AD_Element_ID="84de945c-e259-22ed-582d-6c58679cb926",ColumnName="AmtAcct",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6e1ba279-8222-feec-f608-6b03c0a6aa41",
Synchronized="2017-08-05 16:56:25.0")
/** Column name AmtAcct */
public static final String COLUMNNAME_AmtAcct = "AmtAcct";
/** Set Accounting Schema.
@param C_AcctSchema_ID Rules for accounting */
public void setC_AcctSchema_ID (int C_AcctSchema_ID)
{
if (C_AcctSchema_ID < 1) throw new IllegalArgumentException ("C_AcctSchema_ID is mandatory.");
set_Value (COLUMNNAME_C_AcctSchema_ID, Integer.valueOf(C_AcctSchema_ID));
}
/** Get Accounting Schema.
@return Rules for accounting */
public int getC_AcctSchema_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_AcctSchema_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="78e887df-ceb1-3458-f37f-091429982d63")
public static String es_PE_COLUMN_C_AcctSchema_ID_Name="Accounting Schema";

@XendraColumn(AD_Element_ID="561c9a32-9b35-9c1a-fabc-8abf7f2bb4ae",ColumnName="C_AcctSchema_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="78e887df-ceb1-3458-f37f-091429982d63",
Synchronized="2017-08-05 16:56:25.0")
/** Column name C_AcctSchema_ID */
public static final String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
/** Set General BalanceSubject.
@param C_Subject_ID General BalanceSubject */
public void setC_Subject_ID (int C_Subject_ID)
{
if (C_Subject_ID <= 0) set_Value (COLUMNNAME_C_Subject_ID, null);
 else 
set_Value (COLUMNNAME_C_Subject_ID, Integer.valueOf(C_Subject_ID));
}
/** Get General BalanceSubject.
@return General BalanceSubject */
public int getC_Subject_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Subject_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6ab9fb7b-d4e8-6263-8c6b-ffea1e543520")
public static String es_PE_COLUMN_C_Subject_ID_Name="General BalanceSubject";

@XendraColumn(AD_Element_ID="cf4ce89d-7b61-08a5-bea4-75a61a221932",ColumnName="C_Subject_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6ab9fb7b-d4e8-6263-8c6b-ffea1e543520",
Synchronized="2017-08-05 16:56:25.0")
/** Column name C_Subject_ID */
public static final String COLUMNNAME_C_Subject_ID = "C_Subject_ID";
/** Set Account Date.
@param DateAcct Accounting Date */
public void setDateAcct (Timestamp DateAcct)
{
set_Value (COLUMNNAME_DateAcct, DateAcct);
}
/** Get Account Date.
@return Accounting Date */
public Timestamp getDateAcct() 
{
return (Timestamp)get_Value(COLUMNNAME_DateAcct);
}

@XendraTrl(Identifier="f2f86e5e-71dc-7b23-1973-9caa784b0232")
public static String es_PE_COLUMN_DateAcct_Name="Account Date";

@XendraColumn(AD_Element_ID="034727d0-e80f-fadf-3d4f-2d8d37b75669",ColumnName="DateAcct",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f2f86e5e-71dc-7b23-1973-9caa784b0232",
Synchronized="2017-08-05 16:56:25.0")
/** Column name DateAcct */
public static final String COLUMNNAME_DateAcct = "DateAcct";
/** Set IsSubTotal.
@param IsSubTotal IsSubTotal */
public void setIsSubTotal (boolean IsSubTotal)
{
set_Value (COLUMNNAME_IsSubTotal, Boolean.valueOf(IsSubTotal));
}
/** Get IsSubTotal.
@return IsSubTotal */
public boolean isSubTotal() 
{
Object oo = get_Value(COLUMNNAME_IsSubTotal);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="d065d090-ecfa-520c-fb29-9888ab2468e9")
public static String es_PE_COLUMN_IsSubTotal_Name="IsSubTotal";

@XendraColumn(AD_Element_ID="d6829b53-7fed-bde8-bf2c-61b5d1d2abc9",ColumnName="IsSubTotal",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d065d090-ecfa-520c-fb29-9888ab2468e9",
Synchronized="2017-08-05 16:56:25.0")
/** Column name IsSubTotal */
public static final String COLUMNNAME_IsSubTotal = "IsSubTotal";
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
@XendraTrl(Identifier="c3f0292d-47de-1311-19dc-1fceb1fcab1f")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c3f0292d-47de-1311-19dc-1fceb1fcab1f",
Synchronized="2017-08-05 16:56:25.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set PostingType.
@param PostingType The type of posted amount for the transaction */
public void setPostingType (String PostingType)
{
if (PostingType != null && PostingType.length() > 1)
{
log.warning("Length > 1 - truncated");
PostingType = PostingType.substring(0,0);
}
set_Value (COLUMNNAME_PostingType, PostingType);
}
/** Get PostingType.
@return The type of posted amount for the transaction */
public String getPostingType() 
{
String value = (String)get_Value(COLUMNNAME_PostingType);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="a467b18b-8d23-a4e7-e67f-100f59fe8648")
public static String es_PE_COLUMN_PostingType_Name="PostingType";

@XendraColumn(AD_Element_ID="465cd8dd-d2b8-aa76-fc18-7f8df439b182",ColumnName="PostingType",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a467b18b-8d23-a4e7-e67f-100f59fe8648",
Synchronized="2017-08-05 16:56:25.0")
/** Column name PostingType */
public static final String COLUMNNAME_PostingType = "PostingType";
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

@XendraTrl(Identifier="4206ac27-888b-6889-0583-cbfa31d76852")
public static String es_PE_COLUMN_SeqNo_Name="Secuencia";

@XendraColumn(AD_Element_ID="38fa26fe-b59d-fce1-c129-420b57da738b",ColumnName="SeqNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4206ac27-888b-6889-0583-cbfa31d76852",
Synchronized="2017-08-05 16:56:25.0")
/** Column name SeqNo */
public static final String COLUMNNAME_SeqNo = "SeqNo";
/** Set subjectlevel.
@param subjectlevel subjectlevel */
public void setsubjectlevel (BigDecimal subjectlevel)
{
set_Value (COLUMNNAME_subjectlevel, subjectlevel);
}
/** Get subjectlevel.
@return subjectlevel */
public BigDecimal getsubjectlevel() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_subjectlevel);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="a61f817f-5167-75d7-8abf-81ce273f4ed9")
public static String es_PE_COLUMN_subjectlevel_Name="subjectlevel";

@XendraColumn(AD_Element_ID="9914741d-b7f2-0c30-1d58-2f69fec54b6e",ColumnName="subjectlevel",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a61f817f-5167-75d7-8abf-81ce273f4ed9",
Synchronized="2017-08-05 16:56:25.0")
/** Column name subjectlevel */
public static final String COLUMNNAME_subjectlevel = "subjectlevel";
/** Set subjectparent.
@param subjectparent subjectparent */
public void setsubjectparent (int subjectparent)
{
set_Value (COLUMNNAME_subjectparent, Integer.valueOf(subjectparent));
}
/** Get subjectparent.
@return subjectparent */
public int getsubjectparent() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_subjectparent);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f6a12578-ea49-765d-0b42-d0143035a0a9")
public static String es_PE_COLUMN_subjectparent_Name="subjectparent";

@XendraColumn(AD_Element_ID="2d80f4fb-b4eb-c58d-78e5-06a0267b130e",ColumnName="subjectparent",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f6a12578-ea49-765d-0b42-d0143035a0a9",
Synchronized="2017-08-05 16:56:25.0")
/** Column name subjectparent */
public static final String COLUMNNAME_subjectparent = "subjectparent";
/** Set Type.
@param Type Type of Validation (SQL, Java Script, Java Language) */
public void setType (String Type)
{
if (Type != null && Type.length() > 4)
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
String value = (String)get_Value(COLUMNNAME_Type);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="39ed997a-1d4e-3f1d-9c59-b02321447f8b")
public static String es_PE_COLUMN_Type_Name="Type";

@XendraColumn(AD_Element_ID="25f95bd2-be42-03fc-c8d2-a7103835133c",ColumnName="Type",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=4,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="39ed997a-1d4e-3f1d-9c59-b02321447f8b",
Synchronized="2017-08-05 16:56:25.0")
/** Column name Type */
public static final String COLUMNNAME_Type = "Type";
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
@XendraTrl(Identifier="05849789-81da-3e88-5bce-6353686f2384")
public static String es_PE_COLUMN_Value_Name="Clave de Búsqueda";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="05849789-81da-3e88-5bce-6353686f2384",
Synchronized="2017-08-05 16:56:25.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
/** Set Value To.
@param Value2 Value To */
public void setValue2 (String Value2)
{
if (Value2 != null && Value2.length() > 40)
{
log.warning("Length > 40 - truncated");
Value2 = Value2.substring(0,39);
}
set_Value (COLUMNNAME_Value2, Value2);
}
/** Get Value To.
@return Value To */
public String getValue2() 
{
String value = (String)get_Value(COLUMNNAME_Value2);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="4a836f40-314e-626a-fdbe-f7a5609dc9bb")
public static String es_PE_COLUMN_Value2_Name="Value To";

@XendraColumn(AD_Element_ID="c379d4ac-5a2f-a060-da28-03c993b2743e",ColumnName="Value2",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4a836f40-314e-626a-fdbe-f7a5609dc9bb",
Synchronized="2017-08-05 16:56:25.0")
/** Column name Value2 */
public static final String COLUMNNAME_Value2 = "Value2";
}
