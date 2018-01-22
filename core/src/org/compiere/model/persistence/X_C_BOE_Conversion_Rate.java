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
/** Generated Model for C_BOE_Conversion_Rate
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_BOE_Conversion_Rate extends PO
{
/** Standard Constructor
@param ctx context
@param C_BOE_Conversion_Rate_ID id
@param trxName transaction
*/
public X_C_BOE_Conversion_Rate (Properties ctx, int C_BOE_Conversion_Rate_ID, String trxName)
{
super (ctx, C_BOE_Conversion_Rate_ID, trxName);
/** if (C_BOE_Conversion_Rate_ID == 0)
{
setC_BOE_Conversion_Rate_ID (0);
setC_BOEGroup_ID (0);
setC_Currency_ID (0);
setC_Currency_ID_To (0);
setRate (Env.ZERO);
setValidFrom (new Timestamp(System.currentTimeMillis()));
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_BOE_Conversion_Rate (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000125 */
public static int Table_ID=MTable.getTable_ID("C_BOE_Conversion_Rate");

@XendraTrl(Identifier="5c3aa62d-4f26-766e-b461-6d737a0e38a5")
public static String es_PE_TABLE_C_BOE_Conversion_Rate_Name="C_Boe_Conversion_Rate";

@XendraTable(Name="C_BOE_Conversion_Rate",Description="C_BOE_Conversion_Rate",Help="",
TableName="C_BOE_Conversion_Rate",AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=120,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="5c3aa62d-4f26-766e-b461-6d737a0e38a5",Synchronized="2017-08-16 11:41:26.0")
/** TableName=C_BOE_Conversion_Rate */
public static final String Table_Name="C_BOE_Conversion_Rate";


@XendraIndex(Name="c_boeconversionrate_once",Identifier="2b81d958-f552-3653-aa9f-55c88eb6b96d",
Column_Names="ad_client_id, ad_org_id, c_currency_id, c_currency_id_to, validfrom",
IsUnique="false",TableIdentifier="2b81d958-f552-3653-aa9f-55c88eb6b96d",
Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_boeconversionrate_once = "2b81d958-f552-3653-aa9f-55c88eb6b96d";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_BOE_Conversion_Rate");

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
    Table_ID = MTable.getTable_ID("C_BOE_Conversion_Rate");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_BOE_Conversion_Rate[").append(get_ID()).append("]");
return sb.toString();
}
/** Set C_BOE_Conversion_Rate_ID.
@param C_BOE_Conversion_Rate_ID C_BOE_Conversion_Rate_ID */
public void setC_BOE_Conversion_Rate_ID (int C_BOE_Conversion_Rate_ID)
{
if (C_BOE_Conversion_Rate_ID < 1) throw new IllegalArgumentException ("C_BOE_Conversion_Rate_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_BOE_Conversion_Rate_ID, Integer.valueOf(C_BOE_Conversion_Rate_ID));
}
/** Get C_BOE_Conversion_Rate_ID.
@return C_BOE_Conversion_Rate_ID */
public int getC_BOE_Conversion_Rate_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BOE_Conversion_Rate_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name C_BOE_Conversion_Rate_ID */
public static final String COLUMNNAME_C_BOE_Conversion_Rate_ID = "C_BOE_Conversion_Rate_ID";
/** Set C_BOEGroup.
@param C_BOEGroup_ID C_BOEGroup */
public void setC_BOEGroup_ID (int C_BOEGroup_ID)
{
if (C_BOEGroup_ID < 1) throw new IllegalArgumentException ("C_BOEGroup_ID is mandatory.");
set_Value (COLUMNNAME_C_BOEGroup_ID, Integer.valueOf(C_BOEGroup_ID));
}
/** Get C_BOEGroup.
@return C_BOEGroup */
public int getC_BOEGroup_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BOEGroup_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3926671c-d8a6-1349-546f-9c3ca2641154")
public static String es_PE_COLUMN_C_BOEGroup_ID_Name="C_BOEGroup";

@XendraColumn(AD_Element_ID="98c77de4-f7aa-4c1b-a5ce-a1b48433fb79",ColumnName="C_BOEGroup_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3926671c-d8a6-1349-546f-9c3ca2641154",
Synchronized="2017-08-05 16:53:18.0")
/** Column name C_BOEGroup_ID */
public static final String COLUMNNAME_C_BOEGroup_ID = "C_BOEGroup_ID";
/** Set Currency.
@param C_Currency_ID The Currency for this record */
public void setC_Currency_ID (int C_Currency_ID)
{
if (C_Currency_ID < 1) throw new IllegalArgumentException ("C_Currency_ID is mandatory.");
set_Value (COLUMNNAME_C_Currency_ID, Integer.valueOf(C_Currency_ID));
}
/** Get Currency.
@return The Currency for this record */
public int getC_Currency_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Currency_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1496417c-9646-81ed-8e2c-e8d45140c4cb")
public static String es_PE_COLUMN_C_Currency_ID_Name="Currency";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1496417c-9646-81ed-8e2c-e8d45140c4cb",
Synchronized="2017-08-05 16:53:18.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
/** Set Currency To.
@param C_Currency_ID_To Target currency */
public void setC_Currency_ID_To (int C_Currency_ID_To)
{
set_Value (COLUMNNAME_C_Currency_ID_To, Integer.valueOf(C_Currency_ID_To));
}
/** Get Currency To.
@return Target currency */
public int getC_Currency_ID_To() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Currency_ID_To);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="475e0da9-daa6-6b83-572d-115f5f878331")
public static String es_PE_COLUMN_C_Currency_ID_To_Name="Currency To";

@XendraColumn(AD_Element_ID="c0b694a2-f7ed-3e59-d263-713709d89af7",ColumnName="C_Currency_ID_To",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="475e0da9-daa6-6b83-572d-115f5f878331",
Synchronized="2017-08-05 16:53:18.0")
/** Column name C_Currency_ID_To */
public static final String COLUMNNAME_C_Currency_ID_To = "C_Currency_ID_To";
/** Set C_GroupDoc_ID.
@param C_GroupDoc_ID C_GroupDoc_ID */
public void setC_GroupDoc_ID (int C_GroupDoc_ID)
{
if (C_GroupDoc_ID <= 0) set_Value (COLUMNNAME_C_GroupDoc_ID, null);
 else 
set_Value (COLUMNNAME_C_GroupDoc_ID, Integer.valueOf(C_GroupDoc_ID));
}
/** Get C_GroupDoc_ID.
@return C_GroupDoc_ID */
public int getC_GroupDoc_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_GroupDoc_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="638564a4-85a7-59c2-84bb-692e652062ba")
public static String es_PE_COLUMN_C_GroupDoc_ID_Name="C_GroupDoc_ID";

@XendraColumn(AD_Element_ID="6376cf94-c145-e9e0-11ce-5b020ca6bff7",ColumnName="C_GroupDoc_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="638564a4-85a7-59c2-84bb-692e652062ba",
Synchronized="2017-08-05 16:53:18.0")
/** Column name C_GroupDoc_ID */
public static final String COLUMNNAME_C_GroupDoc_ID = "C_GroupDoc_ID";
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
@XendraTrl(Identifier="5dfa46a7-c2d6-44a1-b1dc-be018b7257fa")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5dfa46a7-c2d6-44a1-b1dc-be018b7257fa",
Synchronized="2017-08-05 16:53:18.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Rate.
@param Rate Rate or Tax or Exchange */
public void setRate (BigDecimal Rate)
{
if (Rate == null) throw new IllegalArgumentException ("Rate is mandatory.");
set_Value (COLUMNNAME_Rate, Rate);
}
/** Get Rate.
@return Rate or Tax or Exchange */
public BigDecimal getRate() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Rate);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="633bff5c-7057-508f-3092-8b3519fdaa33")
public static String es_PE_COLUMN_Rate_Name="Rate";

@XendraColumn(AD_Element_ID="3eb861a4-ab06-c590-06e1-f57223b55231",ColumnName="Rate",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="633bff5c-7057-508f-3092-8b3519fdaa33",
Synchronized="2017-08-05 16:53:18.0")
/** Column name Rate */
public static final String COLUMNNAME_Rate = "Rate";
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

@XendraTrl(Identifier="43caaad8-cf4e-187b-fa35-563aacbfa34d")
public static String es_PE_COLUMN_ValidFrom_Name="Valid from";

@XendraColumn(AD_Element_ID="86b1171a-a6c6-0da5-1aea-3f3106450d07",ColumnName="ValidFrom",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="43caaad8-cf4e-187b-fa35-563aacbfa34d",
Synchronized="2017-08-05 16:53:18.0")
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

@XendraTrl(Identifier="03e409db-4cba-a779-7a2a-8745322eb8af")
public static String es_PE_COLUMN_ValidTo_Name="Valid to";

@XendraColumn(AD_Element_ID="0fbe43c3-c76d-0505-0043-63adb568a68f",ColumnName="ValidTo",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="03e409db-4cba-a779-7a2a-8745322eb8af",
Synchronized="2017-08-05 16:53:18.0")
/** Column name ValidTo */
public static final String COLUMNNAME_ValidTo = "ValidTo";
}
