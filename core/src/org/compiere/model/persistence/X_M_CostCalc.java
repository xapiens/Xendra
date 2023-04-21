/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                          *
 * Copyright (C)  dravios       All Rights Reserved.                          *
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
/** Generated Model for M_CostCalc
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_CostCalc extends PO
{
/** Standard Constructor
@param ctx context
@param M_CostCalc_ID id
@param trxName transaction
*/
public X_M_CostCalc (Properties ctx, int M_CostCalc_ID, String trxName)
{
super (ctx, M_CostCalc_ID, trxName);
/** if (M_CostCalc_ID == 0)
{
setCost (Env.ZERO);
setInCost (Env.ZERO);
setIsCostedOk (false);	
// N
setM_CostCalc_ID (0);
setM_CostElement_ID (0);
setMovementDate (new Timestamp(System.currentTimeMillis()));
setM_Product_ID (0);
setOMovementDate (new Timestamp(System.currentTimeMillis()));
setStock (Env.ZERO);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_CostCalc (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000132 */
public static int Table_ID=MTable.getTable_ID("M_CostCalc");

@XendraTrl(Identifier="f495c58d-0c61-d769-b0d6-3135be4af1a9")
public static String es_PE_TABLE_M_CostCalc_Name="Cost Calc";

@XendraTable(Name="Cost Calc",AD_Package_ID="2809ac2d-7d43-20f8-05f0-a478f2e50204",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",TableName="M_CostCalc",
AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,IsSecurityEnabled=false,
IsDeleteable=false,IsHighVolume=true,IsChangeLog=false,IsView=false,PO_Window_ID="",
ID="org.xendra.material",Identifier="f495c58d-0c61-d769-b0d6-3135be4af1a9",
Synchronized="2023-04-19 07:37:42.0")
/** TableName=M_CostCalc */
public static final String Table_Name="M_CostCalc";


@XendraIndex(Name="m_costcalc_carding",Identifier="fcd776c5-b20e-5356-e071-440da26ba98f",
Column_Names="record_id, ad_table_id",IsUnique="false",
TableIdentifier="fcd776c5-b20e-5356-e071-440da26ba98f",Synchronized="2022-04-19 07:35:58.0")
public static final String INDEXNAME_m_costcalc_carding = "fcd776c5-b20e-5356-e071-440da26ba98f";


@XendraIndex(Name="m_costcalc_main",Identifier="3d345a68-3c09-bf0b-991a-937c71ec5034",
Column_Names="m_costelement_id, m_product_id, movementdate, ad_client_id, ad_org_id",
IsUnique="false",TableIdentifier="3d345a68-3c09-bf0b-991a-937c71ec5034",
Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_m_costcalc_main = "3d345a68-3c09-bf0b-991a-937c71ec5034";


@XendraIndex(Name="m_costcalc_reference",Identifier="af4a76e0-c4a1-31d1-e8c2-fab0aec98d49",
Column_Names="ad_table_id, record_id, movementdate, m_product_id, parent_id, master_id",
IsUnique="false",TableIdentifier="af4a76e0-c4a1-31d1-e8c2-fab0aec98d49",
Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_m_costcalc_reference = "af4a76e0-c4a1-31d1-e8c2-fab0aec98d49";


@XendraIndex(Name="m_costcalc_warehouse",Identifier="985dd0bb-500e-6c6e-5218-b88ee7b9df4d",
Column_Names="m_costelement_id, m_product_id, m_warehouse_id, movementdate, ad_client_id, ad_org_id",
IsUnique="false",TableIdentifier="985dd0bb-500e-6c6e-5218-b88ee7b9df4d",
Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_m_costcalc_warehouse = "985dd0bb-500e-6c6e-5218-b88ee7b9df4d";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_CostCalc");

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
    Table_ID = MTable.getTable_ID("M_CostCalc");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_CostCalc[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Table.
@param AD_Table_ID Database Table information */
public void setAD_Table_ID (int AD_Table_ID)
{
if (AD_Table_ID <= 0) set_Value (COLUMNNAME_AD_Table_ID, null);
 else 
set_Value (COLUMNNAME_AD_Table_ID, Integer.valueOf(AD_Table_ID));
}
/** Get Table.
@return Database Table information */
public int getAD_Table_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Table_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1061d9a7-845f-9209-58c7-36824e0d04d3")
public static String es_PE_COLUMN_AD_Table_ID_Name="Table";

@XendraColumn(AD_Element_ID="270eeb02-723b-0ecc-7f56-3c67fa71a7f1",ColumnName="AD_Table_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1061d9a7-845f-9209-58c7-36824e0d04d3",
Synchronized="2020-03-31 22:48:26.0")
/** Column name AD_Table_ID */
public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
/** Set Cost.
@param Cost Cost information */
public void setCost (BigDecimal Cost)
{
if (Cost == null) throw new IllegalArgumentException ("Cost is mandatory.");
set_Value (COLUMNNAME_Cost, Cost);
}
/** Get Cost.
@return Cost information */
public BigDecimal getCost() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Cost);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="a86ca392-6446-6bdd-fa81-682fe7d767cc")
public static String es_PE_COLUMN_Cost_Name="Cost";

@XendraColumn(AD_Element_ID="ea07eea5-cd5c-5001-0f53-dfcaf5256889",ColumnName="Cost",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a86ca392-6446-6bdd-fa81-682fe7d767cc",
Synchronized="2020-03-31 22:48:26.0")
/** Column name Cost */
public static final String COLUMNNAME_Cost = "Cost";
/** Set Period.
@param C_Period_ID Period of the Calendar */
public void setC_Period_ID (int C_Period_ID)
{
if (C_Period_ID <= 0) set_Value (COLUMNNAME_C_Period_ID, null);
 else 
set_Value (COLUMNNAME_C_Period_ID, Integer.valueOf(C_Period_ID));
}
/** Get Period.
@return Period of the Calendar */
public int getC_Period_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Period_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b205d062-4129-495b-bafb-d239731a6f8c")
public static String es_PE_COLUMN_C_Period_ID_Name="Period";

@XendraColumn(AD_Element_ID="8f295c04-0eb4-a8f3-829f-cc6a6bd1df1e",ColumnName="C_Period_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b205d062-4129-495b-bafb-d239731a6f8c",
Synchronized="2020-03-31 22:48:26.0")
/** Column name C_Period_ID */
public static final String COLUMNNAME_C_Period_ID = "C_Period_ID";
/** Set Error Msg.
@param ErrorMsg Error Msg */
public void setErrorMsg (String ErrorMsg)
{
set_Value (COLUMNNAME_ErrorMsg, ErrorMsg);
}
/** Get Error Msg.
@return Error Msg */
public String getErrorMsg() 
{
String value = (String)get_Value(COLUMNNAME_ErrorMsg);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="ea35ddaa-a8c7-489a-a44f-7d4b37f0ca71")
public static String es_PE_COLUMN_ErrorMsg_Name="Error Msg";

@XendraColumn(AD_Element_ID="7ed8e902-7223-0140-a5e2-159d12a79a58",ColumnName="ErrorMsg",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ea35ddaa-a8c7-489a-a44f-7d4b37f0ca71",
Synchronized="2020-03-31 22:48:26.0")
/** Column name ErrorMsg */
public static final String COLUMNNAME_ErrorMsg = "ErrorMsg";
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
@XendraTrl(Identifier="6552ca1d-010f-4c49-9dbe-f3ff9dd96eae")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6552ca1d-010f-4c49-9dbe-f3ff9dd96eae",
Synchronized="2020-03-31 22:48:26.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set InCost.
@param InCost InCost */
public void setInCost (BigDecimal InCost)
{
if (InCost == null) throw new IllegalArgumentException ("InCost is mandatory.");
set_Value (COLUMNNAME_InCost, InCost);
}
/** Get InCost.
@return InCost */
public BigDecimal getInCost() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_InCost);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="099a576f-f6cb-4e7b-d20b-ecbab435a566")
public static String es_PE_COLUMN_InCost_Name="InCost";

@XendraColumn(AD_Element_ID="a62237a4-c96c-35df-d692-6a61aabd0fd5",ColumnName="InCost",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="099a576f-f6cb-4e7b-d20b-ecbab435a566",
Synchronized="2020-03-31 22:48:27.0")
/** Column name InCost */
public static final String COLUMNNAME_InCost = "InCost";
/** Set IsCostedOk.
@param IsCostedOk IsCostedOk */
public void setIsCostedOk (boolean IsCostedOk)
{
set_Value (COLUMNNAME_IsCostedOk, Boolean.valueOf(IsCostedOk));
}
/** Get IsCostedOk.
@return IsCostedOk */
public boolean isCostedOk() 
{
Object oo = get_Value(COLUMNNAME_IsCostedOk);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="fddd5279-1068-f964-1824-9258a4edd785")
public static String es_PE_COLUMN_IsCostedOk_Name="iscostedok";

@XendraColumn(AD_Element_ID="c73f7dde-dcad-0c50-a656-c28db457a6dc",ColumnName="IsCostedOk",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fddd5279-1068-f964-1824-9258a4edd785",
Synchronized="2020-03-31 22:48:27.0")
/** Column name IsCostedOk */
public static final String COLUMNNAME_IsCostedOk = "IsCostedOk";
/** Set Manual.
@param IsManual This is a manual process */
public void setIsManual (boolean IsManual)
{
set_Value (COLUMNNAME_IsManual, Boolean.valueOf(IsManual));
}
/** Get Manual.
@return This is a manual process */
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

@XendraTrl(Identifier="d7a18f57-3994-c237-2f2a-1d81476780df")
public static String es_PE_COLUMN_IsManual_Name="Manual";

@XendraColumn(AD_Element_ID="064afee2-bc1c-12d9-20dc-97a2318dc359",ColumnName="IsManual",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d7a18f57-3994-c237-2f2a-1d81476780df",
Synchronized="2020-03-31 22:48:27.0")
/** Column name IsManual */
public static final String COLUMNNAME_IsManual = "IsManual";
/** Set Line No.
@param Line Unique line for this document */
public void setLine (int Line)
{
set_Value (COLUMNNAME_Line, Integer.valueOf(Line));
}
/** Get Line No.
@return Unique line for this document */
public int getLine() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Line);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="867a952c-6a6f-4e4d-bc59-ad7be1e3713f")
public static String es_PE_COLUMN_Line_Name="Line No";

@XendraColumn(AD_Element_ID="986ef077-61da-f9cf-1c6d-aefe3a35113b",ColumnName="Line",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="867a952c-6a6f-4e4d-bc59-ad7be1e3713f",
Synchronized="2020-03-31 22:48:27.0")
/** Column name Line */
public static final String COLUMNNAME_Line = "Line";
/** Set Line Amount.
@param LineNetAmt Line Extended Amount (Quantity * Actual Price) without Freight and Charges */
public void setLineNetAmt (BigDecimal LineNetAmt)
{
set_Value (COLUMNNAME_LineNetAmt, LineNetAmt);
}
/** Get Line Amount.
@return Line Extended Amount (Quantity * Actual Price) without Freight and Charges */
public BigDecimal getLineNetAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_LineNetAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="7b71b715-6a01-4c3b-be83-9fcad6341899")
public static String es_PE_COLUMN_LineNetAmt_Name="Line Amount";

@XendraColumn(AD_Element_ID="ba57a535-4ae3-c6eb-74ec-3dcb0973d6f6",ColumnName="LineNetAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7b71b715-6a01-4c3b-be83-9fcad6341899",
Synchronized="2020-03-31 22:48:27.0")
/** Column name LineNetAmt */
public static final String COLUMNNAME_LineNetAmt = "LineNetAmt";
/** Set Master_ID.
@param Master_ID Master_ID */
public void setMaster_ID (int Master_ID)
{
if (Master_ID <= 0) set_Value (COLUMNNAME_Master_ID, null);
 else 
set_Value (COLUMNNAME_Master_ID, Integer.valueOf(Master_ID));
}
/** Get Master_ID.
@return Master_ID */
public int getMaster_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Master_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9d2409e9-bbd8-4fb8-bd0e-bb97e8794c27")
public static String es_PE_COLUMN_Master_ID_Name="master_id";

@XendraColumn(AD_Element_ID="f4b75393-4e02-4098-9a1c-e229d8ccf4ac",ColumnName="Master_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9d2409e9-bbd8-4fb8-bd0e-bb97e8794c27",
Synchronized="2020-03-31 22:48:27.0")
/** Column name Master_ID */
public static final String COLUMNNAME_Master_ID = "Master_ID";
/** Set Attribute Set Instance.
@param M_AttributeSetInstance_ID Product Attribute Set Instance */
public void setM_AttributeSetInstance_ID (int M_AttributeSetInstance_ID)
{
if (M_AttributeSetInstance_ID <= 0) set_Value (COLUMNNAME_M_AttributeSetInstance_ID, null);
 else 
set_Value (COLUMNNAME_M_AttributeSetInstance_ID, Integer.valueOf(M_AttributeSetInstance_ID));
}
/** Get Attribute Set Instance.
@return Product Attribute Set Instance */
public int getM_AttributeSetInstance_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_AttributeSetInstance_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="85ab5a04-0ae1-4ffa-80e8-0c327ac66497")
public static String es_PE_COLUMN_M_AttributeSetInstance_ID_Name="Attribute Set Instance";

@XendraColumn(AD_Element_ID="137807f2-3c52-e193-3ceb-f10b819cf955",
ColumnName="M_AttributeSetInstance_ID",AD_Reference_ID=35,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="85ab5a04-0ae1-4ffa-80e8-0c327ac66497",Synchronized="2020-03-31 22:48:27.0")
/** Column name M_AttributeSetInstance_ID */
public static final String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
/** Set Cost Calc.
@param M_CostCalc_ID Cost Calc */
public void setM_CostCalc_ID (int M_CostCalc_ID)
{
if (M_CostCalc_ID < 1) throw new IllegalArgumentException ("M_CostCalc_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_CostCalc_ID, Integer.valueOf(M_CostCalc_ID));
}
/** Get Cost Calc.
@return Cost Calc */
public int getM_CostCalc_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_CostCalc_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name M_CostCalc_ID */
public static final String COLUMNNAME_M_CostCalc_ID = "M_CostCalc_ID";
/** Set Cost Element.
@param M_CostElement_ID Product Cost Element */
public void setM_CostElement_ID (int M_CostElement_ID)
{
if (M_CostElement_ID < 1) throw new IllegalArgumentException ("M_CostElement_ID is mandatory.");
set_Value (COLUMNNAME_M_CostElement_ID, Integer.valueOf(M_CostElement_ID));
}
/** Get Cost Element.
@return Product Cost Element */
public int getM_CostElement_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_CostElement_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="431e4890-e7cf-7343-15ea-01f69da86d92")
public static String es_PE_COLUMN_M_CostElement_ID_Name="Cost Element";

@XendraColumn(AD_Element_ID="1b5355ae-f799-dbe3-d07b-17cb2162e976",ColumnName="M_CostElement_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="431e4890-e7cf-7343-15ea-01f69da86d92",
Synchronized="2020-03-31 22:48:27.0")
/** Column name M_CostElement_ID */
public static final String COLUMNNAME_M_CostElement_ID = "M_CostElement_ID";
/** Set Movement Date.
@param MovementDate Date a product was moved in or out of inventory */
public void setMovementDate (Timestamp MovementDate)
{
if (MovementDate == null) throw new IllegalArgumentException ("MovementDate is mandatory.");
set_Value (COLUMNNAME_MovementDate, MovementDate);
}
/** Get Movement Date.
@return Date a product was moved in or out of inventory */
public Timestamp getMovementDate() 
{
return (Timestamp)get_Value(COLUMNNAME_MovementDate);
}

@XendraTrl(Identifier="5c9fdb2b-296b-25db-6999-c8e0f4fe9615")
public static String es_PE_COLUMN_MovementDate_Name="Movement Date";

@XendraColumn(AD_Element_ID="7a907f01-8525-820d-22d4-98b06d4b902b",ColumnName="MovementDate",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5c9fdb2b-296b-25db-6999-c8e0f4fe9615",
Synchronized="2020-03-31 22:48:27.0")
/** Column name MovementDate */
public static final String COLUMNNAME_MovementDate = "MovementDate";
/** Set Product.
@param M_Product_ID Product, Service, Item */
public void setM_Product_ID (int M_Product_ID)
{
if (M_Product_ID < 1) throw new IllegalArgumentException ("M_Product_ID is mandatory.");
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

@XendraTrl(Identifier="59f7ae5b-b00d-a1bb-b4c3-141a0f95ccd2")
public static String es_PE_COLUMN_M_Product_ID_Name="Product";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="59f7ae5b-b00d-a1bb-b4c3-141a0f95ccd2",
Synchronized="2020-03-31 22:48:27.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set Warehouse.
@param M_Warehouse_ID Storage Warehouse and Service Point */
public void setM_Warehouse_ID (int M_Warehouse_ID)
{
if (M_Warehouse_ID <= 0) set_Value (COLUMNNAME_M_Warehouse_ID, null);
 else 
set_Value (COLUMNNAME_M_Warehouse_ID, Integer.valueOf(M_Warehouse_ID));
}
/** Get Warehouse.
@return Storage Warehouse and Service Point */
public int getM_Warehouse_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Warehouse_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1aff46c2-d858-d0da-2eb9-d400cecf2011")
public static String es_PE_COLUMN_M_Warehouse_ID_Name="Warehouse";

@XendraColumn(AD_Element_ID="402045cd-baa5-aeaf-b148-a921dffb7821",ColumnName="M_Warehouse_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1aff46c2-d858-d0da-2eb9-d400cecf2011",
Synchronized="2020-03-31 22:48:27.0")
/** Column name M_Warehouse_ID */
public static final String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
/** Set OMovementDate.
@param OMovementDate OMovementDate */
public void setOMovementDate (Timestamp OMovementDate)
{
if (OMovementDate == null) throw new IllegalArgumentException ("OMovementDate is mandatory.");
set_Value (COLUMNNAME_OMovementDate, OMovementDate);
}
/** Get OMovementDate.
@return OMovementDate */
public Timestamp getOMovementDate() 
{
return (Timestamp)get_Value(COLUMNNAME_OMovementDate);
}

@XendraTrl(Identifier="2de63e2a-4acf-cfd9-e3cd-dc555296ad83")
public static String es_PE_COLUMN_OMovementDate_Name="omovementdate";

@XendraColumn(AD_Element_ID="6094cf88-6168-6225-ab8d-74b88cc554ff",ColumnName="OMovementDate",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2de63e2a-4acf-cfd9-e3cd-dc555296ad83",
Synchronized="2020-03-31 22:48:27.0")
/** Column name OMovementDate */
public static final String COLUMNNAME_OMovementDate = "OMovementDate";
/** Set Parent.
@param Parent_ID Parent of Entity */
public void setParent_ID (int Parent_ID)
{
if (Parent_ID <= 0) set_Value (COLUMNNAME_Parent_ID, null);
 else 
set_Value (COLUMNNAME_Parent_ID, Integer.valueOf(Parent_ID));
}
/** Get Parent.
@return Parent of Entity */
public int getParent_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Parent_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="aefce0e8-048e-426c-b874-80fb91a8ef3c")
public static String es_PE_COLUMN_Parent_ID_Name="Parent";

@XendraColumn(AD_Element_ID="26d35f92-f0e2-00bf-656e-99db30e53a7f",ColumnName="Parent_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="aefce0e8-048e-426c-b874-80fb91a8ef3c",
Synchronized="2020-03-31 22:48:27.0")
/** Column name Parent_ID */
public static final String COLUMNNAME_Parent_ID = "Parent_ID";
/** Set preCost.
@param preCost preCost */
public void setpreCost (BigDecimal preCost)
{
set_Value (COLUMNNAME_preCost, preCost);
}
/** Get preCost.
@return preCost */
public BigDecimal getpreCost() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_preCost);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="37d53469-99dc-4955-8d9c-bebf3b289803")
public static String es_PE_COLUMN_preCost_Name="precost";

@XendraColumn(AD_Element_ID="99417021-4d66-47aa-a8dd-5625b1b5a4cf",ColumnName="preCost",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="37d53469-99dc-4955-8d9c-bebf3b289803",
Synchronized="2020-03-31 22:48:27.0")
/** Column name preCost */
public static final String COLUMNNAME_preCost = "preCost";
/** Set preStock.
@param preStock preStock */
public void setpreStock (BigDecimal preStock)
{
set_Value (COLUMNNAME_preStock, preStock);
}
/** Get preStock.
@return preStock */
public BigDecimal getpreStock() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_preStock);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="329f9897-26d0-443d-b9e8-d4e5b8afed0f")
public static String es_PE_COLUMN_preStock_Name="prestock";

@XendraColumn(AD_Element_ID="62552d8a-b073-4b5c-96d8-1c7a929a939e",ColumnName="preStock",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="329f9897-26d0-443d-b9e8-d4e5b8afed0f",
Synchronized="2020-03-31 22:48:27.0")
/** Column name preStock */
public static final String COLUMNNAME_preStock = "preStock";
/** Set Record ID.
@param Record_ID Direct internal record ID */
public void setRecord_ID (int Record_ID)
{
if (Record_ID <= 0) set_Value (COLUMNNAME_Record_ID, null);
 else 
set_Value (COLUMNNAME_Record_ID, Integer.valueOf(Record_ID));
}
/** Get Record ID.
@return Direct internal record ID */
public int getRecord_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Record_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="05a7f69a-ec02-1a3d-68c6-f49c21d01da7")
public static String es_PE_COLUMN_Record_ID_Name="Record ID";

@XendraColumn(AD_Element_ID="86e36e4b-d1dc-2deb-449d-c1f6769e1603",ColumnName="Record_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="05a7f69a-ec02-1a3d-68c6-f49c21d01da7",
Synchronized="2020-03-31 22:48:27.0")
/** Column name Record_ID */
public static final String COLUMNNAME_Record_ID = "Record_ID";
/** Set Stock.
@param Stock Stock */
public void setStock (BigDecimal Stock)
{
if (Stock == null) throw new IllegalArgumentException ("Stock is mandatory.");
set_Value (COLUMNNAME_Stock, Stock);
}
/** Get Stock.
@return Stock */
public BigDecimal getStock() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Stock);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="1ba9481d-e094-c281-16be-7ded891aa5d6")
public static String es_PE_COLUMN_Stock_Name="stock";

@XendraColumn(AD_Element_ID="796872f9-2e98-b0c1-1f44-e269949e5637",ColumnName="Stock",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1ba9481d-e094-c281-16be-7ded891aa5d6",
Synchronized="2020-03-31 22:48:27.0")
/** Column name Stock */
public static final String COLUMNNAME_Stock = "Stock";
}
