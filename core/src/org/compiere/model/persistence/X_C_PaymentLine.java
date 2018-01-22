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
/** Generated Model for C_PaymentLine
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_PaymentLine extends PO
{
/** Standard Constructor
@param ctx context
@param C_PaymentLine_ID id
@param trxName transaction
*/
public X_C_PaymentLine (Properties ctx, int C_PaymentLine_ID, String trxName)
{
super (ctx, C_PaymentLine_ID, trxName);
/** if (C_PaymentLine_ID == 0)
{
setC_Payment_ID (0);
setC_PaymentLine_ID (0);
setIsOverUnderPayment (false);	
// N
setPayAmt (Env.ZERO);	
// 0
setProcessed (false);	
// 0
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_PaymentLine (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000169 */
public static int Table_ID=MTable.getTable_ID("C_PaymentLine");

@XendraTrl(Identifier="14b973d8-4739-0f04-7f95-f52e97bb0285")
public static String es_PE_TAB_PaymentLine_Name="Cargos y Facturas";
@XendraTab(Name="PaymentLine",
Description="",Help="",AD_Window_ID="a5526dd3-69bf-661f-67ed-fa8a6962a00e",SeqNo=40,TabLevel=1,
IsSingleRow=true,IsInfoTab=true,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",
HasTree=false,WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=true,Parent_Column_ID="",
Identifier="14b973d8-4739-0f04-7f95-f52e97bb0285",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_PaymentLine="14b973d8-4739-0f04-7f95-f52e97bb0285";

@XendraTrl(Identifier="6b566dcf-8272-e1a1-6d85-d197bda9d6ea")
public static String es_PE_TABLE_C_PaymentLine_Name="Payment Line";

@XendraTable(Name="Payment Line",Description="Payment Line identifier",Help="",
TableName="C_PaymentLine",AccessLevel="1",AD_Window_ID="a5526dd3-69bf-661f-67ed-fa8a6962a00e",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=105,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="6b566dcf-8272-e1a1-6d85-d197bda9d6ea",Synchronized="2017-08-16 11:42:09.0")
/** TableName=C_PaymentLine */
public static final String Table_Name="C_PaymentLine";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_PaymentLine");

protected BigDecimal accessLevel = BigDecimal.valueOf(1);
/** AccessLevel
@return 1 - Org 
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
    Table_ID = MTable.getTable_ID("C_PaymentLine");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_PaymentLine[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="025a859b-06de-1099-ab53-c7cb66b32755")
public static String es_PE_FIELD_PaymentLine_AllocationLine_Description="Línea de Asignación";

@XendraTrl(Identifier="025a859b-06de-1099-ab53-c7cb66b32755")
public static String es_PE_FIELD_PaymentLine_AllocationLine_Help="Asignación de Efectivo/Pagos a facturas";

@XendraTrl(Identifier="025a859b-06de-1099-ab53-c7cb66b32755")
public static String es_PE_FIELD_PaymentLine_AllocationLine_Name="Línea de Asignación";

@XendraField(AD_Column_ID="C_AllocationLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="14b973d8-4739-0f04-7f95-f52e97bb0285",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="025a859b-06de-1099-ab53-c7cb66b32755")
public static final String FIELDNAME_PaymentLine_AllocationLine="025a859b-06de-1099-ab53-c7cb66b32755";

@XendraTrl(Identifier="d762f628-a711-4efd-513a-eda43a08c7c1")
public static String es_PE_COLUMN_C_AllocationLine_ID_Name="Allocation Line";

@XendraColumn(AD_Element_ID="2be588b1-2d10-d36e-dc0e-aa9b74d99c63",
ColumnName="C_AllocationLine_ID",AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d762f628-a711-4efd-513a-eda43a08c7c1",Synchronized="2017-08-05 16:54:02.0")
/** Column name C_AllocationLine_ID */
public static final String COLUMNNAME_C_AllocationLine_ID = "C_AllocationLine_ID";
/** Set C_BOEConfirm_ID.
@param C_BOEConfirm_ID C_BOEConfirm_ID */
public void setC_BOEConfirm_ID (int C_BOEConfirm_ID)
{
if (C_BOEConfirm_ID <= 0) set_Value (COLUMNNAME_C_BOEConfirm_ID, null);
 else 
set_Value (COLUMNNAME_C_BOEConfirm_ID, Integer.valueOf(C_BOEConfirm_ID));
}
/** Get C_BOEConfirm_ID.
@return C_BOEConfirm_ID */
public int getC_BOEConfirm_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BOEConfirm_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="130aff5e-8acc-d519-e104-4c892221fd41")
public static String es_PE_FIELD_PaymentLine_C_BOEConfirm_ID_Name="c_boeconfirm_id";

@XendraField(AD_Column_ID="C_BOEConfirm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="14b973d8-4739-0f04-7f95-f52e97bb0285",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="130aff5e-8acc-d519-e104-4c892221fd41")
public static final String FIELDNAME_PaymentLine_C_BOEConfirm_ID="130aff5e-8acc-d519-e104-4c892221fd41";

@XendraTrl(Identifier="55637edc-a79d-0856-37c0-38a2140906e2")
public static String es_PE_COLUMN_C_BOEConfirm_ID_Name="C_BOEConfirm_ID";

@XendraColumn(AD_Element_ID="1c623ee3-39bb-c6fc-297b-f7c03061acb4",ColumnName="C_BOEConfirm_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="55637edc-a79d-0856-37c0-38a2140906e2",
Synchronized="2017-08-05 16:54:02.0")
/** Column name C_BOEConfirm_ID */
public static final String COLUMNNAME_C_BOEConfirm_ID = "C_BOEConfirm_ID";
/** Set Bill Of Exchange.
@param C_BOE_ID Bill Of Exchange Identifier */
public void setC_BOE_ID (int C_BOE_ID)
{
if (C_BOE_ID <= 0) set_Value (COLUMNNAME_C_BOE_ID, null);
 else 
set_Value (COLUMNNAME_C_BOE_ID, Integer.valueOf(C_BOE_ID));
}
/** Get Bill Of Exchange.
@return Bill Of Exchange Identifier */
public int getC_BOE_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BOE_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="59812300-de3f-9979-8546-c0aa1aff41d2")
public static String es_PE_FIELD_PaymentLine_BillOfExchange_Description="Identificador de la Letra de Cambio ";

@XendraTrl(Identifier="59812300-de3f-9979-8546-c0aa1aff41d2")
public static String es_PE_FIELD_PaymentLine_BillOfExchange_Help="El docuemnto Letra de Cambio";

@XendraTrl(Identifier="59812300-de3f-9979-8546-c0aa1aff41d2")
public static String es_PE_FIELD_PaymentLine_BillOfExchange_Name="Letra de Cambio";

@XendraField(AD_Column_ID="C_BOE_ID",IsCentrallyMaintained=true,
AD_Tab_ID="14b973d8-4739-0f04-7f95-f52e97bb0285",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="59812300-de3f-9979-8546-c0aa1aff41d2")
public static final String FIELDNAME_PaymentLine_BillOfExchange="59812300-de3f-9979-8546-c0aa1aff41d2";

@XendraTrl(Identifier="5c215226-dac2-2687-b6db-1c499f670ec8")
public static String es_PE_COLUMN_C_BOE_ID_Name="Bill Of Exchange";

@XendraColumn(AD_Element_ID="7dfa9e28-2055-cea9-fa94-b5ebdac44420",ColumnName="C_BOE_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="org.compiere.model.CalloutPayment.boe",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="5c215226-dac2-2687-b6db-1c499f670ec8",Synchronized="2017-08-05 16:54:02.0")
/** Column name C_BOE_ID */
public static final String COLUMNNAME_C_BOE_ID = "C_BOE_ID";
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

@XendraTrl(Identifier="b8b8894f-2f54-bade-6890-0658b52bc076")
public static String es_PE_FIELD_PaymentLine_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="b8b8894f-2f54-bade-6890-0658b52bc076")
public static String es_PE_FIELD_PaymentLine_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraTrl(Identifier="b8b8894f-2f54-bade-6890-0658b52bc076")
public static String es_PE_FIELD_PaymentLine_BusinessPartner_Name="Socio de Negocio";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="14b973d8-4739-0f04-7f95-f52e97bb0285",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b8b8894f-2f54-bade-6890-0658b52bc076")
public static final String FIELDNAME_PaymentLine_BusinessPartner="b8b8894f-2f54-bade-6890-0658b52bc076";

@XendraTrl(Identifier="6ec7a13b-6ae7-331b-9d58-144e0fc78eed")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Business Partner ";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="org.compiere.model.CalloutPayment.bPartner",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6ec7a13b-6ae7-331b-9d58-144e0fc78eed",Synchronized="2017-08-05 16:54:02.0")
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

@XendraTrl(Identifier="3e81dbe6-bf71-57bd-a5ec-1f626b0b7867")
public static String es_PE_FIELD_PaymentLine_Charge_Description="Cargos adicionales del documento";

@XendraTrl(Identifier="3e81dbe6-bf71-57bd-a5ec-1f626b0b7867")
public static String es_PE_FIELD_PaymentLine_Charge_Help="El cargo indica un tipo de cargo (manejo; despacho; reposición)";

@XendraTrl(Identifier="3e81dbe6-bf71-57bd-a5ec-1f626b0b7867")
public static String es_PE_FIELD_PaymentLine_Charge_Name="Cargo";

@XendraField(AD_Column_ID="C_Charge_ID",IsCentrallyMaintained=true,
AD_Tab_ID="14b973d8-4739-0f04-7f95-f52e97bb0285",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3e81dbe6-bf71-57bd-a5ec-1f626b0b7867")
public static final String FIELDNAME_PaymentLine_Charge="3e81dbe6-bf71-57bd-a5ec-1f626b0b7867";

@XendraTrl(Identifier="19406e3e-20fd-7139-4b55-c2ee18086baa")
public static String es_PE_COLUMN_C_Charge_ID_Name="Charge";

@XendraColumn(AD_Element_ID="d7e2fc48-a26e-4ded-ea44-fe15849a7883",ColumnName="C_Charge_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="@C_Invoice_ID@!0",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutPayment.charge",VFormat="",ValueMin="",ValueMax="",Version="0",
IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="19406e3e-20fd-7139-4b55-c2ee18086baa",Synchronized="2017-08-05 16:54:02.0")
/** Column name C_Charge_ID */
public static final String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
/** Set Currency Type.
@param C_ConversionType_ID Currency Conversion Rate Type */
public void setC_ConversionType_ID (int C_ConversionType_ID)
{
if (C_ConversionType_ID <= 0) set_Value (COLUMNNAME_C_ConversionType_ID, null);
 else 
set_Value (COLUMNNAME_C_ConversionType_ID, Integer.valueOf(C_ConversionType_ID));
}
/** Get Currency Type.
@return Currency Conversion Rate Type */
public int getC_ConversionType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ConversionType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a0188db3-4bc1-00dc-d56c-806d1188e0dc")
public static String es_PE_FIELD_PaymentLine_CurrencyType_Description="Tipo de índice de conversión de moneda ";

@XendraTrl(Identifier="a0188db3-4bc1-00dc-d56c-806d1188e0dc")
public static String es_PE_FIELD_PaymentLine_CurrencyType_Help="El tipo del índice de conversión de monedas le deja definir diversos tipos de tarifas, tarifas ej. del punto, corporativas y/o de Ventas/Compras.";

@XendraTrl(Identifier="a0188db3-4bc1-00dc-d56c-806d1188e0dc")
public static String es_PE_FIELD_PaymentLine_CurrencyType_Name="Tipo de Moneda";

@XendraField(AD_Column_ID="C_ConversionType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="14b973d8-4739-0f04-7f95-f52e97bb0285",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@C_Currency_ID@!@$C_Currency_ID@",DisplayLength=10,IsReadOnly=false,SeqNo=140,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="a0188db3-4bc1-00dc-d56c-806d1188e0dc")
public static final String FIELDNAME_PaymentLine_CurrencyType="a0188db3-4bc1-00dc-d56c-806d1188e0dc";

@XendraTrl(Identifier="eb2ea541-5b3e-b399-351f-6f6809fd7c95")
public static String es_PE_COLUMN_C_ConversionType_ID_Name="Currency Type";

@XendraColumn(AD_Element_ID="66f5d039-c94d-0957-487b-eb3118bd7719",
ColumnName="C_ConversionType_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutPayment.amounts",VFormat="",ValueMin="",ValueMax="",Version="0",
IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="eb2ea541-5b3e-b399-351f-6f6809fd7c95",
Synchronized="2017-08-05 16:54:02.0")
/** Column name C_ConversionType_ID */
public static final String COLUMNNAME_C_ConversionType_ID = "C_ConversionType_ID";
/** Set Currency.
@param C_Currency_ID The Currency for this record */
public void setC_Currency_ID (int C_Currency_ID)
{
if (C_Currency_ID <= 0) set_Value (COLUMNNAME_C_Currency_ID, null);
 else 
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

@XendraTrl(Identifier="8feed857-8a1a-0e2e-d50b-6089c58f0416")
public static String es_PE_FIELD_PaymentLine_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="8feed857-8a1a-0e2e-d50b-6089c58f0416")
public static String es_PE_FIELD_PaymentLine_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraTrl(Identifier="8feed857-8a1a-0e2e-d50b-6089c58f0416")
public static String es_PE_FIELD_PaymentLine_Currency_Name="Moneda";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="14b973d8-4739-0f04-7f95-f52e97bb0285",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8feed857-8a1a-0e2e-d50b-6089c58f0416")
public static final String FIELDNAME_PaymentLine_Currency="8feed857-8a1a-0e2e-d50b-6089c58f0416";

@XendraTrl(Identifier="10cbb003-156a-6bf0-bee5-a33cc8c26d94")
public static String es_PE_COLUMN_C_Currency_ID_Name="Currency";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="10cbb003-156a-6bf0-bee5-a33cc8c26d94",
Synchronized="2017-08-05 16:54:02.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
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

@XendraTrl(Identifier="49ebd04d-5aef-1159-2b2e-929dbdcd1e3c")
public static String es_PE_FIELD_PaymentLine_ChargeAmount_Description="Total del Cargo";

@XendraTrl(Identifier="49ebd04d-5aef-1159-2b2e-929dbdcd1e3c")
public static String es_PE_FIELD_PaymentLine_ChargeAmount_Help="El Total Cargo indica el total para un cargo adicional";

@XendraTrl(Identifier="49ebd04d-5aef-1159-2b2e-929dbdcd1e3c")
public static String es_PE_FIELD_PaymentLine_ChargeAmount_Name="Total de Cargo";

@XendraField(AD_Column_ID="ChargeAmt",IsCentrallyMaintained=true,
AD_Tab_ID="14b973d8-4739-0f04-7f95-f52e97bb0285",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="49ebd04d-5aef-1159-2b2e-929dbdcd1e3c")
public static final String FIELDNAME_PaymentLine_ChargeAmount="49ebd04d-5aef-1159-2b2e-929dbdcd1e3c";

@XendraTrl(Identifier="d9d0547e-7ced-b777-f979-a0d2dbbb76cd")
public static String es_PE_COLUMN_ChargeAmt_Name="Charge amount";

@XendraColumn(AD_Element_ID="0700d401-01bb-8f19-a508-aa47155ba852",ColumnName="ChargeAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d9d0547e-7ced-b777-f979-a0d2dbbb76cd",
Synchronized="2017-08-05 16:54:02.0")
/** Column name ChargeAmt */
public static final String COLUMNNAME_ChargeAmt = "ChargeAmt";
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

@XendraTrl(Identifier="d602f138-3d23-2a50-170d-40b243d9bc68")
public static String es_PE_FIELD_PaymentLine_Invoice_Description="Identificador de la factura";

@XendraTrl(Identifier="d602f138-3d23-2a50-170d-40b243d9bc68")
public static String es_PE_FIELD_PaymentLine_Invoice_Help="La ID de Factura identifica únicamente un documento de Factura.";

@XendraTrl(Identifier="d602f138-3d23-2a50-170d-40b243d9bc68")
public static String es_PE_FIELD_PaymentLine_Invoice_Name="Factura";

@XendraField(AD_Column_ID="C_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="14b973d8-4739-0f04-7f95-f52e97bb0285",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d602f138-3d23-2a50-170d-40b243d9bc68")
public static final String FIELDNAME_PaymentLine_Invoice="d602f138-3d23-2a50-170d-40b243d9bc68";

@XendraTrl(Identifier="f6b103cb-0e4b-8b72-8b96-a6c5b6337325")
public static String es_PE_COLUMN_C_Invoice_ID_Name="Invoice";

@XendraColumn(AD_Element_ID="e526ea57-1bdf-9871-fd57-0df3c1f9dd42",ColumnName="C_Invoice_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="@C_Invoice_ID@!0",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutPayment.invoice",VFormat="",ValueMin="",ValueMax="",Version="0",
IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="f6b103cb-0e4b-8b72-8b96-a6c5b6337325",Synchronized="2017-08-05 16:54:02.0")
/** Column name C_Invoice_ID */
public static final String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
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

@XendraTrl(Identifier="33df9e7b-a611-0bcd-d176-cd7634d47c8b")
public static String es_PE_FIELD_PaymentLine_Payment_Description="Identificador del pago";

@XendraTrl(Identifier="33df9e7b-a611-0bcd-d176-cd7634d47c8b")
public static String es_PE_FIELD_PaymentLine_Payment_Help="El pago es un identificador único de este pago.";

@XendraTrl(Identifier="33df9e7b-a611-0bcd-d176-cd7634d47c8b")
public static String es_PE_FIELD_PaymentLine_Payment_Name="Pago";

@XendraField(AD_Column_ID="C_Payment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="14b973d8-4739-0f04-7f95-f52e97bb0285",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="33df9e7b-a611-0bcd-d176-cd7634d47c8b")
public static final String FIELDNAME_PaymentLine_Payment="33df9e7b-a611-0bcd-d176-cd7634d47c8b";

@XendraTrl(Identifier="c444d93f-833e-0e11-83f5-8ebe9a69cdd7")
public static String es_PE_COLUMN_C_Payment_ID_Name="Payment";

@XendraColumn(AD_Element_ID="3ded5658-968e-94c5-207b-eed6f6a7bb43",ColumnName="C_Payment_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c444d93f-833e-0e11-83f5-8ebe9a69cdd7",
Synchronized="2017-08-05 16:54:02.0")
/** Column name C_Payment_ID */
public static final String COLUMNNAME_C_Payment_ID = "C_Payment_ID";
/** Set Payment Line.
@param C_PaymentLine_ID Payment Line */
public void setC_PaymentLine_ID (int C_PaymentLine_ID)
{
if (C_PaymentLine_ID < 1) throw new IllegalArgumentException ("C_PaymentLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_PaymentLine_ID, Integer.valueOf(C_PaymentLine_ID));
}
/** Get Payment Line.
@return Payment Line */
public int getC_PaymentLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_PaymentLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4b8f4f5a-350d-6fb1-66d1-350c017407a8")
public static String es_PE_FIELD_PaymentLine_PaymentLine_Name="Payment Line";

@XendraField(AD_Column_ID="C_PaymentLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="14b973d8-4739-0f04-7f95-f52e97bb0285",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4b8f4f5a-350d-6fb1-66d1-350c017407a8")
public static final String FIELDNAME_PaymentLine_PaymentLine="4b8f4f5a-350d-6fb1-66d1-350c017407a8";
/** Column name C_PaymentLine_ID */
public static final String COLUMNNAME_C_PaymentLine_ID = "C_PaymentLine_ID";
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

@XendraTrl(Identifier="6943998d-495c-c393-3c64-a5c2a8fa572c")
public static String es_PE_FIELD_PaymentLine_Description_Description="Descripción corta opcional del registro";

@XendraTrl(Identifier="6943998d-495c-c393-3c64-a5c2a8fa572c")
public static String es_PE_FIELD_PaymentLine_Description_Help="Una descripción esta limitada a 255 caracteres";

@XendraTrl(Identifier="6943998d-495c-c393-3c64-a5c2a8fa572c")
public static String es_PE_FIELD_PaymentLine_Description_Name="Descripción";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="14b973d8-4739-0f04-7f95-f52e97bb0285",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6943998d-495c-c393-3c64-a5c2a8fa572c")
public static final String FIELDNAME_PaymentLine_Description="6943998d-495c-c393-3c64-a5c2a8fa572c";

@XendraTrl(Identifier="098a0c1a-4d22-677c-9100-612d760bd890")
public static String es_PE_COLUMN_Description_Name="Description";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="098a0c1a-4d22-677c-9100-612d760bd890",
Synchronized="2017-08-05 16:54:02.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Discount Amount.
@param DiscountAmt Calculated amount of discount */
public void setDiscountAmt (BigDecimal DiscountAmt)
{
set_Value (COLUMNNAME_DiscountAmt, DiscountAmt);
}
/** Get Discount Amount.
@return Calculated amount of discount */
public BigDecimal getDiscountAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_DiscountAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="e736c456-e695-88b1-efbe-1f386cfa06d0")
public static String es_PE_FIELD_PaymentLine_DiscountAmount_Description="Total de descuento calculado";

@XendraTrl(Identifier="e736c456-e695-88b1-efbe-1f386cfa06d0")
public static String es_PE_FIELD_PaymentLine_DiscountAmount_Help="El Total descuento indica el total de descuento para un documento ó línea";

@XendraTrl(Identifier="e736c456-e695-88b1-efbe-1f386cfa06d0")
public static String es_PE_FIELD_PaymentLine_DiscountAmount_Name="Total del Descuento";

@XendraField(AD_Column_ID="DiscountAmt",IsCentrallyMaintained=true,
AD_Tab_ID="14b973d8-4739-0f04-7f95-f52e97bb0285",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e736c456-e695-88b1-efbe-1f386cfa06d0")
public static final String FIELDNAME_PaymentLine_DiscountAmount="e736c456-e695-88b1-efbe-1f386cfa06d0";

@XendraTrl(Identifier="331c9799-9d0e-0417-fe2b-356d59d32aee")
public static String es_PE_COLUMN_DiscountAmt_Name="Discount Amount";

@XendraColumn(AD_Element_ID="351290a4-6d07-13cb-9132-459358217d86",ColumnName="DiscountAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="@C_Charge_ID@!0",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutPayment.amounts",VFormat="",ValueMin="",ValueMax="",Version="0",
IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="331c9799-9d0e-0417-fe2b-356d59d32aee",
Synchronized="2017-08-05 16:54:02.0")
/** Column name DiscountAmt */
public static final String COLUMNNAME_DiscountAmt = "DiscountAmt";
/** Set Journal Line.
@param GL_JournalLine_ID General Ledger Journal Line */
public void setGL_JournalLine_ID (int GL_JournalLine_ID)
{
if (GL_JournalLine_ID <= 0) set_Value (COLUMNNAME_GL_JournalLine_ID, null);
 else 
set_Value (COLUMNNAME_GL_JournalLine_ID, Integer.valueOf(GL_JournalLine_ID));
}
/** Get Journal Line.
@return General Ledger Journal Line */
public int getGL_JournalLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_GL_JournalLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="93f249d4-859e-a921-8272-f1254ab05b20")
public static String es_PE_FIELD_PaymentLine_JournalLine_Description="Línea de la póliza";

@XendraTrl(Identifier="93f249d4-859e-a921-8272-f1254ab05b20")
public static String es_PE_FIELD_PaymentLine_JournalLine_Help="La línea de póliza de la contabilidad general identifica una transacción simple en una póliza.";

@XendraTrl(Identifier="93f249d4-859e-a921-8272-f1254ab05b20")
public static String es_PE_FIELD_PaymentLine_JournalLine_Name="Línea de Póliza";

@XendraField(AD_Column_ID="GL_JournalLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="14b973d8-4739-0f04-7f95-f52e97bb0285",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="93f249d4-859e-a921-8272-f1254ab05b20")
public static final String FIELDNAME_PaymentLine_JournalLine="93f249d4-859e-a921-8272-f1254ab05b20";

@XendraTrl(Identifier="bccc04bd-cb14-52b9-efd1-e44385d35f52")
public static String es_PE_COLUMN_GL_JournalLine_ID_Name="Journal Line";

@XendraColumn(AD_Element_ID="c9aa03ab-1fd1-d7fb-3974-8468533ee479",ColumnName="GL_JournalLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="org.compiere.model.CalloutPayment.journal",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="bccc04bd-cb14-52b9-efd1-e44385d35f52",Synchronized="2017-08-05 16:54:02.0")
/** Column name GL_JournalLine_ID */
public static final String COLUMNNAME_GL_JournalLine_ID = "GL_JournalLine_ID";
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
@XendraTrl(Identifier="9588bdad-1d8e-45f9-b984-6e4762d28d00")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9588bdad-1d8e-45f9-b984-6e4762d28d00",
Synchronized="2017-08-05 16:54:02.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Over/Under Payment.
@param IsOverUnderPayment Over-Payment (unallocated) or Under-Payment (partial payment) */
public void setIsOverUnderPayment (boolean IsOverUnderPayment)
{
set_Value (COLUMNNAME_IsOverUnderPayment, Boolean.valueOf(IsOverUnderPayment));
}
/** Get Over/Under Payment.
@return Over-Payment (unallocated) or Under-Payment (partial payment) */
public boolean isOverUnderPayment() 
{
Object oo = get_Value(COLUMNNAME_IsOverUnderPayment);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="33c3cde5-7a8b-b7be-07af-a64f887e27bf")
public static String es_PE_FIELD_PaymentLine_OverUnderPayment_Description="Sobre pago (no contabilizado) ó sub pago (pago parcial)";

@XendraTrl(Identifier="33c3cde5-7a8b-b7be-07af-a64f887e27bf")
public static String es_PE_FIELD_PaymentLine_OverUnderPayment_Help="Sobre pagos (negativos) son totales no contabilizados y permiten recibir dinero por totales superiores a una factura particular. Sub pagos (positivo) es un pago parcial de una factura. No se saca de libros la cantidad no pagada.";

@XendraTrl(Identifier="33c3cde5-7a8b-b7be-07af-a64f887e27bf")
public static String es_PE_FIELD_PaymentLine_OverUnderPayment_Name="Sobre/sub pago";

@XendraField(AD_Column_ID="IsOverUnderPayment",IsCentrallyMaintained=true,
AD_Tab_ID="14b973d8-4739-0f04-7f95-f52e97bb0285",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@C_Invoice_ID@^''",DisplayLength=1,IsReadOnly=false,SeqNo=170,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="33c3cde5-7a8b-b7be-07af-a64f887e27bf")
public static final String FIELDNAME_PaymentLine_OverUnderPayment="33c3cde5-7a8b-b7be-07af-a64f887e27bf";

@XendraTrl(Identifier="20e9cdca-5d43-c34b-d357-955345fdfa66")
public static String es_PE_COLUMN_IsOverUnderPayment_Name="Over/Under Payment";

@XendraColumn(AD_Element_ID="2c24379d-5a56-e5ee-c09f-632905d4e52f",ColumnName="IsOverUnderPayment",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,
ReadOnlyLogic="@C_Charge_ID@!0",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutPayment.amounts",VFormat="",ValueMin="",ValueMax="",Version="0",
IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="20e9cdca-5d43-c34b-d357-955345fdfa66",
Synchronized="2017-08-05 16:54:02.0")
/** Column name IsOverUnderPayment */
public static final String COLUMNNAME_IsOverUnderPayment = "IsOverUnderPayment";
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

@XendraTrl(Identifier="d08db1c8-5163-7f33-a482-7eea5fb04903")
public static String es_PE_FIELD_PaymentLine_LineNo_Description="No. Línea único para este documento";

@XendraTrl(Identifier="d08db1c8-5163-7f33-a482-7eea5fb04903")
public static String es_PE_FIELD_PaymentLine_LineNo_Help="Indica el No. Línea para un documento. También controlará el orden de despliegue de las líneas dentro de un documento";

@XendraTrl(Identifier="d08db1c8-5163-7f33-a482-7eea5fb04903")
public static String es_PE_FIELD_PaymentLine_LineNo_Name="No. Línea";

@XendraField(AD_Column_ID="Line",IsCentrallyMaintained=true,
AD_Tab_ID="14b973d8-4739-0f04-7f95-f52e97bb0285",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d08db1c8-5163-7f33-a482-7eea5fb04903")
public static final String FIELDNAME_PaymentLine_LineNo="d08db1c8-5163-7f33-a482-7eea5fb04903";

@XendraTrl(Identifier="a9cd2a58-120c-e405-c792-7b16cd3bad72")
public static String es_PE_COLUMN_Line_Name="Line No";

@XendraColumn(AD_Element_ID="986ef077-61da-f9cf-1c6d-aefe3a35113b",ColumnName="Line",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,
DefaultValue="@SQL=SELECT COALESCE(MAX(Line),0)+10 AS DefaultValue FROM C_PaymentLine WHERE C_Payment_ID=@C_Payment_ID@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a9cd2a58-120c-e405-c792-7b16cd3bad72",
Synchronized="2017-08-05 16:54:02.0")
/** Column name Line */
public static final String COLUMNNAME_Line = "Line";
/** Set Over/Under Payment.
@param OverUnderAmt Over-Payment (unallocated) or Under-Payment (partial payment) Amount */
public void setOverUnderAmt (BigDecimal OverUnderAmt)
{
set_Value (COLUMNNAME_OverUnderAmt, OverUnderAmt);
}
/** Get Over/Under Payment.
@return Over-Payment (unallocated) or Under-Payment (partial payment) Amount */
public BigDecimal getOverUnderAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_OverUnderAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="f54cc024-405d-d274-b2ee-0431386d21d0")
public static String es_PE_FIELD_PaymentLine_OverUnderPayment2_Description="Total de sobre pago (no contabilizado) ó sub pago (pago parcial)";

@XendraTrl(Identifier="f54cc024-405d-d274-b2ee-0431386d21d0")
public static String es_PE_FIELD_PaymentLine_OverUnderPayment2_Help="Sobre pagos (negativos) son totales no contabilizados y permiten recibir dinero por totales superiores a una factura particular. Sub pagos (positivo) es un pago parcial de una factura. No se saca de libros la cantidad no pagada.";

@XendraTrl(Identifier="f54cc024-405d-d274-b2ee-0431386d21d0")
public static String es_PE_FIELD_PaymentLine_OverUnderPayment2_Name="Totales con sobre/sub pago";

@XendraField(AD_Column_ID="OverUnderAmt",IsCentrallyMaintained=true,
AD_Tab_ID="14b973d8-4739-0f04-7f95-f52e97bb0285",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsOverUnderPayment@=Y & @C_Invoice_ID@^''",DisplayLength=10,IsReadOnly=false,
SeqNo=180,SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="f54cc024-405d-d274-b2ee-0431386d21d0")
public static final String FIELDNAME_PaymentLine_OverUnderPayment2="f54cc024-405d-d274-b2ee-0431386d21d0";

@XendraTrl(Identifier="5a48f30e-d1ed-c683-b246-b1f6790f18d2")
public static String es_PE_COLUMN_OverUnderAmt_Name="Over/Under Payment";

@XendraColumn(AD_Element_ID="c1b8d715-3799-d069-9abd-dcbda10d4c2a",ColumnName="OverUnderAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="@C_Charge_ID@!0",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutPayment.amounts",VFormat="",ValueMin="",ValueMax="",Version="0",
IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5a48f30e-d1ed-c683-b246-b1f6790f18d2",
Synchronized="2017-08-05 16:54:02.0")
/** Column name OverUnderAmt */
public static final String COLUMNNAME_OverUnderAmt = "OverUnderAmt";
/** Set Payment amount.
@param PayAmt Amount being paid */
public void setPayAmt (BigDecimal PayAmt)
{
if (PayAmt == null) throw new IllegalArgumentException ("PayAmt is mandatory.");
set_Value (COLUMNNAME_PayAmt, PayAmt);
}
/** Get Payment amount.
@return Amount being paid */
public BigDecimal getPayAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PayAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="159888c9-c295-27cf-b377-2cd50c02c398")
public static String es_PE_FIELD_PaymentLine_PaymentAmount_Description="Total siendo pagado";

@XendraTrl(Identifier="159888c9-c295-27cf-b377-2cd50c02c398")
public static String es_PE_FIELD_PaymentLine_PaymentAmount_Help="Indica el total a pagar. El total del pago puede ser para una factura simple, múltiple ó un pago parcial de una factura.";

@XendraTrl(Identifier="159888c9-c295-27cf-b377-2cd50c02c398")
public static String es_PE_FIELD_PaymentLine_PaymentAmount_Name="Total del Pago";

@XendraField(AD_Column_ID="PayAmt",IsCentrallyMaintained=true,
AD_Tab_ID="14b973d8-4739-0f04-7f95-f52e97bb0285",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="159888c9-c295-27cf-b377-2cd50c02c398")
public static final String FIELDNAME_PaymentLine_PaymentAmount="159888c9-c295-27cf-b377-2cd50c02c398";

@XendraTrl(Identifier="b0c6febc-0985-5190-3674-a2511d462a87")
public static String es_PE_COLUMN_PayAmt_Name="Payment amount";

@XendraColumn(AD_Element_ID="9e9a0ba1-2d71-67e7-e0f1-0309fd537c8b",ColumnName="PayAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="org.compiere.model.CalloutPayment.amounts",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="b0c6febc-0985-5190-3674-a2511d462a87",Synchronized="2017-08-05 16:54:02.0")
/** Column name PayAmt */
public static final String COLUMNNAME_PayAmt = "PayAmt";
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

@XendraTrl(Identifier="b64363ae-40bd-fe9c-cfdc-4e6add5896e0")
public static String es_PE_FIELD_PaymentLine_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="b64363ae-40bd-fe9c-cfdc-4e6add5896e0")
public static String es_PE_FIELD_PaymentLine_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="b64363ae-40bd-fe9c-cfdc-4e6add5896e0")
public static String es_PE_FIELD_PaymentLine_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="14b973d8-4739-0f04-7f95-f52e97bb0285",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b64363ae-40bd-fe9c-cfdc-4e6add5896e0")
public static final String FIELDNAME_PaymentLine_Processed="b64363ae-40bd-fe9c-cfdc-4e6add5896e0";

@XendraTrl(Identifier="6cbdd540-b27a-de11-a382-9f61bd501734")
public static String es_PE_COLUMN_Processed_Name="Processed";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6cbdd540-b27a-de11-a382-9f61bd501734",
Synchronized="2017-08-05 16:54:02.0")
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

@XendraTrl(Identifier="18264373-d402-6c92-c6d5-06c76e9d9518")
public static String es_PE_FIELD_PaymentLine_ProcessNow_Name="Procesar Ahora";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="14b973d8-4739-0f04-7f95-f52e97bb0285",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="18264373-d402-6c92-c6d5-06c76e9d9518")
public static final String FIELDNAME_PaymentLine_ProcessNow="18264373-d402-6c92-c6d5-06c76e9d9518";

@XendraTrl(Identifier="c4500c39-1578-32a9-0504-f60d345a2c51")
public static String es_PE_COLUMN_Processing_Name="Process Now";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c4500c39-1578-32a9-0504-f60d345a2c51",
Synchronized="2017-08-05 16:54:02.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Remaining Amt.
@param RemainingAmt Remaining Amount */
public void setRemainingAmt (BigDecimal RemainingAmt)
{
throw new IllegalArgumentException ("RemainingAmt is virtual column");
}
/** Get Remaining Amt.
@return Remaining Amount */
public BigDecimal getRemainingAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_RemainingAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="55d38ee0-e608-ec03-fd63-a3a23ff14b22")
public static String es_PE_FIELD_PaymentLine_RemainingAmt_Description="Importe Remanente";

@XendraTrl(Identifier="55d38ee0-e608-ec03-fd63-a3a23ff14b22")
public static String es_PE_FIELD_PaymentLine_RemainingAmt_Name="Importe Remanente";

@XendraField(AD_Column_ID="RemainingAmt",IsCentrallyMaintained=true,
AD_Tab_ID="14b973d8-4739-0f04-7f95-f52e97bb0285",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="55d38ee0-e608-ec03-fd63-a3a23ff14b22")
public static final String FIELDNAME_PaymentLine_RemainingAmt="55d38ee0-e608-ec03-fd63-a3a23ff14b22";

@XendraTrl(Identifier="0776ba0e-c360-d8a2-1999-a5942c8880f2")
public static String es_PE_COLUMN_RemainingAmt_Name="Remaining Amt";

@XendraColumn(AD_Element_ID="cf7333c3-e0c1-f81e-183f-c3ebd714bf5f",ColumnName="RemainingAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="(SELECT MAX(p.PayAmt)+COALESCE(SUM(currencyconvert(pl.PayAmt,pl.c_currency_id,p.c_currency_id,p.datetrx,pl.c_conversiontype_id,pl.ad_client_id,0)),0) FROM C_Payment p  LEFT OUTER JOIN C_PaymentLine pl ON (p.C_Payment_ID=pl.C_Payment_ID)  WHERE p.C_Payment_ID=C_PaymentLine.C_Payment_ID)",
IsAllowLogging=false,Identifier="0776ba0e-c360-d8a2-1999-a5942c8880f2",
Synchronized="2017-08-05 16:54:02.0")
/** Column name RemainingAmt */
public static final String COLUMNNAME_RemainingAmt = "RemainingAmt";
/** Set RemainingAmt2.
@param RemainingAmt2 RemainingAmt2 */
public void setRemainingAmt2 (BigDecimal RemainingAmt2)
{
throw new IllegalArgumentException ("RemainingAmt2 is virtual column");
}
/** Get RemainingAmt2.
@return RemainingAmt2 */
public BigDecimal getRemainingAmt2() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_RemainingAmt2);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="8d5a6b2a-9836-1dbe-c29e-03bb466c775f")
public static String es_PE_FIELD_PaymentLine_RemainingAmt22_Name="RemainingAmt2";

@XendraField(AD_Column_ID="RemainingAmt2",IsCentrallyMaintained=true,
AD_Tab_ID="14b973d8-4739-0f04-7f95-f52e97bb0285",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8d5a6b2a-9836-1dbe-c29e-03bb466c775f")
public static final String FIELDNAME_PaymentLine_RemainingAmt22="8d5a6b2a-9836-1dbe-c29e-03bb466c775f";

@XendraTrl(Identifier="4ccb7a60-bc98-8e91-e5c9-1541eea70e68")
public static String es_PE_COLUMN_RemainingAmt2_Name="RemainingAmt2";

@XendraColumn(AD_Element_ID="40b5e9d2-a557-2850-a38f-bcff8ead0d8b",ColumnName="RemainingAmt2",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="(SELECT i.GrandTotal + pl.WriteOffAmt + pl.PayAmt FROM c_invoice i JOIN c_paymentline pl ON pl.c_invoice_id = i.c_invoice_id WHERE pl.C_PaymentLine_ID=C_PaymentLine.C_PaymentLine_ID)",
IsAllowLogging=false,Identifier="4ccb7a60-bc98-8e91-e5c9-1541eea70e68",
Synchronized="2017-08-05 16:54:02.0")
/** Column name RemainingAmt2 */
public static final String COLUMNNAME_RemainingAmt2 = "RemainingAmt2";
/** Set Tax Amount.
@param TaxAmt Tax Amount for a document */
public void setTaxAmt (BigDecimal TaxAmt)
{
set_Value (COLUMNNAME_TaxAmt, TaxAmt);
}
/** Get Tax Amount.
@return Tax Amount for a document */
public BigDecimal getTaxAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TaxAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="57f4fd06-00f9-e6df-e009-d7c8431a1d4c")
public static String es_PE_FIELD_PaymentLine_TaxAmount_Description="Total del impuesto para un documento";

@XendraTrl(Identifier="57f4fd06-00f9-e6df-e009-d7c8431a1d4c")
public static String es_PE_FIELD_PaymentLine_TaxAmount_Help="El Total de Impuesto despliega el total de impuesto para un documento";

@XendraTrl(Identifier="57f4fd06-00f9-e6df-e009-d7c8431a1d4c")
public static String es_PE_FIELD_PaymentLine_TaxAmount_Name="Total del Impuesto";

@XendraField(AD_Column_ID="TaxAmt",IsCentrallyMaintained=true,
AD_Tab_ID="14b973d8-4739-0f04-7f95-f52e97bb0285",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="57f4fd06-00f9-e6df-e009-d7c8431a1d4c")
public static final String FIELDNAME_PaymentLine_TaxAmount="57f4fd06-00f9-e6df-e009-d7c8431a1d4c";

@XendraTrl(Identifier="655b6171-1d69-b108-28f2-fe88bbf60eed")
public static String es_PE_COLUMN_TaxAmt_Name="Tax Amount";

@XendraColumn(AD_Element_ID="462941e1-a196-170f-fd16-84da06ba50ea",ColumnName="TaxAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="655b6171-1d69-b108-28f2-fe88bbf60eed",
Synchronized="2017-08-05 16:54:02.0")
/** Column name TaxAmt */
public static final String COLUMNNAME_TaxAmt = "TaxAmt";
/** Set WithholdingAmt.
@param WithholdingAmt WithholdingAmt */
public void setWithholdingAmt (BigDecimal WithholdingAmt)
{
set_Value (COLUMNNAME_WithholdingAmt, WithholdingAmt);
}
/** Get WithholdingAmt.
@return WithholdingAmt */
public BigDecimal getWithholdingAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_WithholdingAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="f068d3e2-b6bf-4c50-aba6-447a02a21bf5")
public static String es_PE_COLUMN_WithholdingAmt_Name="WithholdingAmt";

@XendraColumn(AD_Element_ID="750228fc-a0da-46c7-b584-2e34797d13d0",ColumnName="WithholdingAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f068d3e2-b6bf-4c50-aba6-447a02a21bf5",
Synchronized="2017-08-05 16:54:02.0")
/** Column name WithholdingAmt */
public static final String COLUMNNAME_WithholdingAmt = "WithholdingAmt";
/** Set Write-off Amount.
@param WriteOffAmt Amount to write-off */
public void setWriteOffAmt (BigDecimal WriteOffAmt)
{
set_Value (COLUMNNAME_WriteOffAmt, WriteOffAmt);
}
/** Get Write-off Amount.
@return Amount to write-off */
public BigDecimal getWriteOffAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_WriteOffAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="7f980bd0-c004-e695-ab40-457138c81a5a")
public static String es_PE_FIELD_PaymentLine_Write_OffAmount_Description="Total por ajustar";

@XendraTrl(Identifier="7f980bd0-c004-e695-ab40-457138c81a5a")
public static String es_PE_FIELD_PaymentLine_Write_OffAmount_Help="El Total de ajuste indica el total a ser ajustado como incobrable";

@XendraTrl(Identifier="7f980bd0-c004-e695-ab40-457138c81a5a")
public static String es_PE_FIELD_PaymentLine_Write_OffAmount_Name="Total del Ajuste";

@XendraField(AD_Column_ID="WriteOffAmt",IsCentrallyMaintained=true,
AD_Tab_ID="14b973d8-4739-0f04-7f95-f52e97bb0285",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@C_Invoice_ID@^''",DisplayLength=10,IsReadOnly=false,SeqNo=160,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="7f980bd0-c004-e695-ab40-457138c81a5a")
public static final String FIELDNAME_PaymentLine_Write_OffAmount="7f980bd0-c004-e695-ab40-457138c81a5a";

@XendraTrl(Identifier="680151fc-befb-00a6-006e-85d71bdaf06b")
public static String es_PE_COLUMN_WriteOffAmt_Name="Write-off Amount";

@XendraColumn(AD_Element_ID="5f70c6d6-fd9f-549c-363e-80eaef7df1c7",ColumnName="WriteOffAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="@C_Charge_ID@!0",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutPayment.amounts",VFormat="",ValueMin="",ValueMax="",Version="0",
IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="680151fc-befb-00a6-006e-85d71bdaf06b",Synchronized="2017-08-05 16:54:02.0")
/** Column name WriteOffAmt */
public static final String COLUMNNAME_WriteOffAmt = "WriteOffAmt";
}
