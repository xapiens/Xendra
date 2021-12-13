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
/** Generated Model for C_BonusMA
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_BonusMA extends PO
{
/** Standard Constructor
@param ctx context
@param C_BonusMA_ID id
@param trxName transaction
*/
public X_C_BonusMA (Properties ctx, int C_BonusMA_ID, String trxName)
{
super (ctx, C_BonusMA_ID, trxName);
/** if (C_BonusMA_ID == 0)
{
setC_BonusMA_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_BonusMA (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000172 */
public static int Table_ID=MTable.getTable_ID("C_BonusMA");

@XendraTrl(Identifier="31c8fba1-086f-8dd1-d4d2-5af6de1cbcbe")
public static String es_PE_TABLE_C_BonusMA_Name="C_BonusMA";

@XendraTable(Name="C_BonusMA",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",TableName="C_BonusMA",
AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,
IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",
ID="org.xendra.commercial",Identifier="31c8fba1-086f-8dd1-d4d2-5af6de1cbcbe",
Synchronized="2020-03-03 21:36:32.0")
/** TableName=C_BonusMA */
public static final String Table_Name="C_BonusMA";


@XendraIndex(Name="c_bonusma_bpartner",Identifier="943c532c-c1e0-400d-d435-f655630401f4",
Column_Names="c_bpartner_id",IsUnique="false",
TableIdentifier="943c532c-c1e0-400d-d435-f655630401f4",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_bonusma_bpartner = "943c532c-c1e0-400d-d435-f655630401f4";


@XendraIndex(Name="c_bonusma_invoice",Identifier="00b2d54e-a137-bffd-0cc9-1811e364ee61",
Column_Names="c_invoice_id",IsUnique="false",
TableIdentifier="00b2d54e-a137-bffd-0cc9-1811e364ee61",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_bonusma_invoice = "00b2d54e-a137-bffd-0cc9-1811e364ee61";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_BonusMA");

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
    Table_ID = MTable.getTable_ID("C_BonusMA");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_BonusMA[").append(get_ID()).append("]");
return sb.toString();
}
/** Set C_BonusMA.
@param C_BonusMA_ID C_BonusMA */
public void setC_BonusMA_ID (int C_BonusMA_ID)
{
if (C_BonusMA_ID < 1) throw new IllegalArgumentException ("C_BonusMA_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_BonusMA_ID, Integer.valueOf(C_BonusMA_ID));
}
/** Get C_BonusMA.
@return C_BonusMA */
public int getC_BonusMA_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BonusMA_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name C_BonusMA_ID */
public static final String COLUMNNAME_C_BonusMA_ID = "C_BonusMA_ID";
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

@XendraTrl(Identifier="27f30295-a235-9195-0b94-5f509b806ab6")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Business Partner ";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="27f30295-a235-9195-0b94-5f509b806ab6",
Synchronized="2019-08-30 22:21:09.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
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

@XendraTrl(Identifier="921eb56e-d9f9-14b8-2cce-0bb12bac99cb")
public static String es_PE_COLUMN_C_Invoice_ID_Name="Invoice";

@XendraColumn(AD_Element_ID="e526ea57-1bdf-9871-fd57-0df3c1f9dd42",ColumnName="C_Invoice_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="921eb56e-d9f9-14b8-2cce-0bb12bac99cb",
Synchronized="2019-08-30 22:21:09.0")
/** Column name C_Invoice_ID */
public static final String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
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
@XendraTrl(Identifier="30b84c11-5ac7-464c-84d4-08c5909e2934")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="30b84c11-5ac7-464c-84d4-08c5909e2934",
Synchronized="2019-08-30 22:21:09.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Product.
@param M_Product_ID Product, Service, Item */
public void setM_Product_ID (int M_Product_ID)
{
if (M_Product_ID <= 0) set_Value (COLUMNNAME_M_Product_ID, null);
 else 
set_Value (COLUMNNAME_M_Product_ID, Integer.valueOf(M_Product_ID));
}
/** Get Product.
@return Product, Service, Item */
public int getM_Product_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="19dd0770-80ad-672d-10ec-adf5c07a0a55")
public static String es_PE_COLUMN_M_Product_ID_Name="Product";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="19dd0770-80ad-672d-10ec-adf5c07a0a55",
Synchronized="2019-08-30 22:21:09.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set Points.
@param Points Points */
public void setPoints (BigDecimal Points)
{
set_Value (COLUMNNAME_Points, Points);
}
/** Get Points.
@return Points */
public BigDecimal getPoints() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Points);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="775e55e3-21ca-f755-80a7-70d625680895")
public static String es_PE_COLUMN_Points_Name="Points";

@XendraColumn(AD_Element_ID="b7851d60-f96e-369f-a20e-99a1cbd76360",ColumnName="Points",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="775e55e3-21ca-f755-80a7-70d625680895",
Synchronized="2019-08-30 22:21:09.0")
/** Column name Points */
public static final String COLUMNNAME_Points = "Points";
}
