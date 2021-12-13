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
/** Generated Model for C_PaymentCharge
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_PaymentCharge extends PO
{
/** Standard Constructor
@param ctx context
@param C_PaymentCharge_ID id
@param trxName transaction
*/
public X_C_PaymentCharge (Properties ctx, int C_PaymentCharge_ID, String trxName)
{
super (ctx, C_PaymentCharge_ID, trxName);
/** if (C_PaymentCharge_ID == 0)
{
setC_Charge_ID (0);
setC_PaymentCharge_ID (0);
setC_Payment_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_PaymentCharge (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000160 */
public static int Table_ID=MTable.getTable_ID("C_PaymentCharge");

@XendraTrl(Identifier="bee49cfc-7f73-8532-1908-8e3e20cb7517")
public static String es_PE_TAB_Charge_Name="Varios Cargos";
@XendraTab(Name="Charge",Description="",
Help="",AD_Window_ID="a5526dd3-69bf-661f-67ed-fa8a6962a00e",SeqNo=30,TabLevel=1,IsSingleRow=true,
IsInfoTab=true,IsTranslationTab=false,IsReadOnly=true,AD_Column_ID="",HasTree=false,WhereClause="",
OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="@Processed@=Y",
DisplayLogic="",IsInsertRecord=false,IsAdvancedTab=true,Parent_Column_ID="",
Identifier="bee49cfc-7f73-8532-1908-8e3e20cb7517",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Charge="bee49cfc-7f73-8532-1908-8e3e20cb7517";

@XendraTrl(Identifier="3d5bc5c1-47a1-becd-053d-20adb0d9324f")
public static String es_PE_TABLE_C_PaymentCharge_Name="Payment Charge";

@XendraTable(Name="Payment Charge",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="C_PaymentCharge",AccessLevel="3",AD_Window_ID="a5526dd3-69bf-661f-67ed-fa8a6962a00e",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="3d5bc5c1-47a1-becd-053d-20adb0d9324f",Synchronized="2020-03-03 21:37:20.0")
/** TableName=C_PaymentCharge */
public static final String Table_Name="C_PaymentCharge";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_PaymentCharge");

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
    Table_ID = MTable.getTable_ID("C_PaymentCharge");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_PaymentCharge[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Allocation Line.
@param C_AllocationLine_ID Allocation Line */
public void setC_AllocationLine_ID (int C_AllocationLine_ID)
{
if (C_AllocationLine_ID <= 0) set_Value (COLUMNNAME_C_AllocationLine_ID, null);
 else 
set_Value (COLUMNNAME_C_AllocationLine_ID, Integer.valueOf(C_AllocationLine_ID));
}
/** Get Allocation Line.
@return Allocation Line */
public int getC_AllocationLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_AllocationLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2539024e-f483-db97-4603-3dfca2974ccc")
public static String es_PE_FIELD_Charge_AllocationLine_Name="Línea de Asignación";

@XendraTrl(Identifier="2539024e-f483-db97-4603-3dfca2974ccc")
public static String es_PE_FIELD_Charge_AllocationLine_Description="Línea de Asignación";

@XendraTrl(Identifier="2539024e-f483-db97-4603-3dfca2974ccc")
public static String es_PE_FIELD_Charge_AllocationLine_Help="Asignación de Efectivo/Pagos a facturas";

@XendraField(AD_Column_ID="C_AllocationLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bee49cfc-7f73-8532-1908-8e3e20cb7517",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2539024e-f483-db97-4603-3dfca2974ccc")
public static final String FIELDNAME_Charge_AllocationLine="2539024e-f483-db97-4603-3dfca2974ccc";

@XendraTrl(Identifier="6c6e3386-c0c7-b9e8-608a-f1fffc365dc0")
public static String es_PE_COLUMN_C_AllocationLine_ID_Name="Allocation Line";

@XendraColumn(AD_Element_ID="2be588b1-2d10-d36e-dc0e-aa9b74d99c63",
ColumnName="C_AllocationLine_ID",AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6c6e3386-c0c7-b9e8-608a-f1fffc365dc0",Synchronized="2019-08-30 22:21:57.0")
/** Column name C_AllocationLine_ID */
public static final String COLUMNNAME_C_AllocationLine_ID = "C_AllocationLine_ID";
/** Set Charge.
@param C_Charge_ID Additional document charges */
public void setC_Charge_ID (int C_Charge_ID)
{
if (C_Charge_ID < 1) throw new IllegalArgumentException ("C_Charge_ID is mandatory.");
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

@XendraTrl(Identifier="91fd0501-2cbd-d19f-4f3a-9e3c6d0b3c10")
public static String es_PE_FIELD_Charge_Charge_Name="Cargo";

@XendraTrl(Identifier="91fd0501-2cbd-d19f-4f3a-9e3c6d0b3c10")
public static String es_PE_FIELD_Charge_Charge_Description="Cargos adicionales del documento";

@XendraTrl(Identifier="91fd0501-2cbd-d19f-4f3a-9e3c6d0b3c10")
public static String es_PE_FIELD_Charge_Charge_Help="El cargo indica un tipo de cargo (manejo; despacho; reposición)";

@XendraField(AD_Column_ID="C_Charge_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bee49cfc-7f73-8532-1908-8e3e20cb7517",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="91fd0501-2cbd-d19f-4f3a-9e3c6d0b3c10")
public static final String FIELDNAME_Charge_Charge="91fd0501-2cbd-d19f-4f3a-9e3c6d0b3c10";

@XendraTrl(Identifier="ab942c5d-4fc4-3617-8bb1-187a72f67545")
public static String es_PE_COLUMN_C_Charge_ID_Name="Charge";

@XendraColumn(AD_Element_ID="d7e2fc48-a26e-4ded-ea44-fe15849a7883",ColumnName="C_Charge_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ab942c5d-4fc4-3617-8bb1-187a72f67545",
Synchronized="2019-08-30 22:21:57.0")
/** Column name C_Charge_ID */
public static final String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
/** Set Charge amount.
@param ChargeAmt Charge Amount */
public void setChargeAmt (BigDecimal ChargeAmt)
{
set_Value (COLUMNNAME_ChargeAmt, ChargeAmt);
}
/** Get Charge amount.
@return Charge Amount */
public BigDecimal getChargeAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ChargeAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="35c021ff-3820-49be-b383-3132ca1b5366")
public static String es_PE_FIELD_Charge_ChargeAmount_Name="Total de Cargo";

@XendraTrl(Identifier="35c021ff-3820-49be-b383-3132ca1b5366")
public static String es_PE_FIELD_Charge_ChargeAmount_Description="Total del Cargo";

@XendraTrl(Identifier="35c021ff-3820-49be-b383-3132ca1b5366")
public static String es_PE_FIELD_Charge_ChargeAmount_Help="El Total Cargo indica el total para un cargo adicional";

@XendraField(AD_Column_ID="ChargeAmt",IsCentrallyMaintained=true,
AD_Tab_ID="bee49cfc-7f73-8532-1908-8e3e20cb7517",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=131089,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="35c021ff-3820-49be-b383-3132ca1b5366")
public static final String FIELDNAME_Charge_ChargeAmount="35c021ff-3820-49be-b383-3132ca1b5366";

@XendraTrl(Identifier="37b0157d-1e43-17e1-0148-44a585ce3688")
public static String es_PE_COLUMN_ChargeAmt_Name="Charge amount";

@XendraColumn(AD_Element_ID="0700d401-01bb-8f19-a508-aa47155ba852",ColumnName="ChargeAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="37b0157d-1e43-17e1-0148-44a585ce3688",
Synchronized="2019-08-30 22:21:57.0")
/** Column name ChargeAmt */
public static final String COLUMNNAME_ChargeAmt = "ChargeAmt";
/** Set Payment Charge.
@param C_PaymentCharge_ID Payment Charge */
public void setC_PaymentCharge_ID (int C_PaymentCharge_ID)
{
if (C_PaymentCharge_ID < 1) throw new IllegalArgumentException ("C_PaymentCharge_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_PaymentCharge_ID, Integer.valueOf(C_PaymentCharge_ID));
}
/** Get Payment Charge.
@return Payment Charge */
public int getC_PaymentCharge_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_PaymentCharge_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="08ebea90-7bfc-583f-f8b5-d08e52eeac25")
public static String es_PE_FIELD_Charge_PaymentCharge_Name="Payment Charge";

@XendraField(AD_Column_ID="C_PaymentCharge_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bee49cfc-7f73-8532-1908-8e3e20cb7517",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="08ebea90-7bfc-583f-f8b5-d08e52eeac25")
public static final String FIELDNAME_Charge_PaymentCharge="08ebea90-7bfc-583f-f8b5-d08e52eeac25";
/** Column name C_PaymentCharge_ID */
public static final String COLUMNNAME_C_PaymentCharge_ID = "C_PaymentCharge_ID";
/** Set Payment.
@param C_Payment_ID Payment identifier */
public void setC_Payment_ID (int C_Payment_ID)
{
if (C_Payment_ID < 1) throw new IllegalArgumentException ("C_Payment_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Payment_ID, Integer.valueOf(C_Payment_ID));
}
/** Get Payment.
@return Payment identifier */
public int getC_Payment_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Payment_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d1b41808-8f74-8338-87f2-b3991e4f8186")
public static String es_PE_FIELD_Charge_Payment_Name="Pago";

@XendraTrl(Identifier="d1b41808-8f74-8338-87f2-b3991e4f8186")
public static String es_PE_FIELD_Charge_Payment_Description="Identificador del pago";

@XendraTrl(Identifier="d1b41808-8f74-8338-87f2-b3991e4f8186")
public static String es_PE_FIELD_Charge_Payment_Help="El pago es un identificador único de este pago.";

@XendraField(AD_Column_ID="C_Payment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bee49cfc-7f73-8532-1908-8e3e20cb7517",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d1b41808-8f74-8338-87f2-b3991e4f8186")
public static final String FIELDNAME_Charge_Payment="d1b41808-8f74-8338-87f2-b3991e4f8186";

@XendraTrl(Identifier="92fb065b-7f1b-9ef1-e1cc-8e6a2c2c5b9c")
public static String es_PE_COLUMN_C_Payment_ID_Name="Payment";

@XendraColumn(AD_Element_ID="3ded5658-968e-94c5-207b-eed6f6a7bb43",ColumnName="C_Payment_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="92fb065b-7f1b-9ef1-e1cc-8e6a2c2c5b9c",
Synchronized="2019-08-30 22:21:57.0")
/** Column name C_Payment_ID */
public static final String COLUMNNAME_C_Payment_ID = "C_Payment_ID";
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
@XendraTrl(Identifier="321c6e36-8d03-48f4-98b1-36027c84eff5")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="321c6e36-8d03-48f4-98b1-36027c84eff5",
Synchronized="2019-08-30 22:21:57.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
}
