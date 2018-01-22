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
/** Generated Model for C_CommissionLine
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_CommissionLine extends PO
{
/** Standard Constructor
@param ctx context
@param C_CommissionLine_ID id
@param trxName transaction
*/
public X_C_CommissionLine (Properties ctx, int C_CommissionLine_ID, String trxName)
{
super (ctx, C_CommissionLine_ID, trxName);
/** if (C_CommissionLine_ID == 0)
{
setAmtMultiplier (Env.ZERO);
setAmtSubtract (Env.ZERO);	
// 0
setC_Commission_ID (0);
setC_CommissionLine_ID (0);
setCommissionOrders (false);	
// N
setIsPositiveOnly (false);	
// N
setLine (0);	
// @SQL=SELECT COALESCE(MAX(Line),0)+10 AS DefaultValue FROM C_CommissionLine WHERE C_Commission_ID=@C_Commission_ID@
setQtyMultiplier (Env.ZERO);
setQtySubtract (Env.ZERO);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_CommissionLine (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=431 */
public static int Table_ID=MTable.getTable_ID("C_CommissionLine");

@XendraTrl(Identifier="7a3c9b6a-9bc8-87fe-47ca-2cef6dc144a7")
public static String es_PE_TAB_CommissionLine_Description="Definir reglas de cálculo de comisiones";

@XendraTrl(Identifier="7a3c9b6a-9bc8-87fe-47ca-2cef6dc144a7")
public static String es_PE_TAB_CommissionLine_Name="Ìtem de Comisión";

@XendraTrl(Identifier="7a3c9b6a-9bc8-87fe-47ca-2cef6dc144a7")
public static String es_PE_TAB_CommissionLine_Help="Definir los criterios de selección para el pago de comisiones. Si no se entran parámetros restrictivos (ej. Para Socios de Negocio específicos (grupos) ó productos (Categorías); etc. todas las transacciones para el período serán usadas para el calculo de la comisión. Después de convertir de la moneda de la transacción a la moneda de pago de la comisión; la formula para calcular la comisión es: (Total Convertido - Total a Sustraer) * Multiplicador Total + (Cantidad Real - Cantidad a Sustraer) * Multiplicador Cantidad. Es posible escoger; que solo Totales positivos (Total Convertido - Total a Sustraer) y cantidades positivas (Cantidad Real - Cantidad a Sustraer) sean usadas en el calculo.";

@XendraTab(Name="Commission Line",Description="Define your commission calculation rule",
Help="Define the selection criteria for paying the commission. If you do not enter restricting parameters (e.g. for specific Business Partner (Groups) or Product (Categories), etc. all transactions for the period will be used to calculate the commission.  After converting from the transaction to the commission currency, the formula for calculating the commission is:  (Converted Amount - Subtract Amount) * Amount Multiplier + (Actual Quantity - Subtract Quantity) * Quantity Multiplier  You can choose, that only positive amounts (Converted Amount - Subtract Amount) and positive quantities (Actual Quantity - Subtract Quantity) are used in the calculation.",
AD_Window_ID="714562e3-3fcb-dd06-5bab-6e03249018a6",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="7a3c9b6a-9bc8-87fe-47ca-2cef6dc144a7",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_CommissionLine="7a3c9b6a-9bc8-87fe-47ca-2cef6dc144a7";

@XendraTrl(Identifier="2552687a-34ed-7b51-998b-a3fc31a41d05")
public static String es_PE_TABLE_C_CommissionLine_Name="Línea de la comisión";

@XendraTable(Name="Commission Line",Description="Commission Line",Help="",
TableName="C_CommissionLine",AccessLevel="3",AD_Window_ID="714562e3-3fcb-dd06-5bab-6e03249018a6",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=135,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="2552687a-34ed-7b51-998b-a3fc31a41d05",Synchronized="2017-08-16 11:41:39.0")
/** TableName=C_CommissionLine */
public static final String Table_Name="C_CommissionLine";


@XendraIndex(Name="c_commissionline_commission",Identifier="ffc02ece-8133-65be-e749-bc2a3a2e13a7",
Column_Names="c_commission_id",IsUnique="false",
TableIdentifier="ffc02ece-8133-65be-e749-bc2a3a2e13a7",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_commissionline_commission = "ffc02ece-8133-65be-e749-bc2a3a2e13a7";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_CommissionLine");

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
    Table_ID = MTable.getTable_ID("C_CommissionLine");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_CommissionLine[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Multiplier Amount.
@param AmtMultiplier Multiplier Amount for generating commissions */
public void setAmtMultiplier (BigDecimal AmtMultiplier)
{
if (AmtMultiplier == null) throw new IllegalArgumentException ("AmtMultiplier is mandatory.");
set_Value (COLUMNNAME_AmtMultiplier, AmtMultiplier);
}
/** Get Multiplier Amount.
@return Multiplier Amount for generating commissions */
public BigDecimal getAmtMultiplier() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtMultiplier);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="4be1ad92-391b-4747-eb94-95afa0cad78c")
public static String es_PE_FIELD_CommissionLine_MultiplierAmount_Description="Total del multiplicador para generar comisiones";

@XendraTrl(Identifier="4be1ad92-391b-4747-eb94-95afa0cad78c")
public static String es_PE_FIELD_CommissionLine_MultiplierAmount_Help="El Total Multiplicador indica el total a multiplicar por el total en una corrida de comisiones.";

@XendraTrl(Identifier="4be1ad92-391b-4747-eb94-95afa0cad78c")
public static String es_PE_FIELD_CommissionLine_MultiplierAmount_Name="Multiplicador";

@XendraField(AD_Column_ID="AmtMultiplier",IsCentrallyMaintained=true,
AD_Tab_ID="7a3c9b6a-9bc8-87fe-47ca-2cef6dc144a7",AD_FieldGroup_ID="Amounts",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4be1ad92-391b-4747-eb94-95afa0cad78c")
public static final String FIELDNAME_CommissionLine_MultiplierAmount="4be1ad92-391b-4747-eb94-95afa0cad78c";

@XendraTrl(Identifier="a782aa86-8497-911f-772f-93d96f8afc8a")
public static String es_PE_COLUMN_AmtMultiplier_Name="Multiplicador";

@XendraColumn(AD_Element_ID="22847cd0-4360-7da7-2be9-defd34416f03",ColumnName="AmtMultiplier",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a782aa86-8497-911f-772f-93d96f8afc8a",
Synchronized="2017-08-05 16:53:30.0")
/** Column name AmtMultiplier */
public static final String COLUMNNAME_AmtMultiplier = "AmtMultiplier";
/** Set Subtract Amount.
@param AmtSubtract Subtract Amount for generating commissions */
public void setAmtSubtract (BigDecimal AmtSubtract)
{
if (AmtSubtract == null) throw new IllegalArgumentException ("AmtSubtract is mandatory.");
set_Value (COLUMNNAME_AmtSubtract, AmtSubtract);
}
/** Get Subtract Amount.
@return Subtract Amount for generating commissions */
public BigDecimal getAmtSubtract() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtSubtract);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="07d7c37b-ccf6-0f8c-42a1-6d8133fbca48")
public static String es_PE_FIELD_CommissionLine_SubtractAmount_Description="Total a restar para generar comisiones";

@XendraTrl(Identifier="07d7c37b-ccf6-0f8c-42a1-6d8133fbca48")
public static String es_PE_FIELD_CommissionLine_SubtractAmount_Help="El Total a restar indica el total a ser restado del total total antes de la multiplicación.";

@XendraTrl(Identifier="07d7c37b-ccf6-0f8c-42a1-6d8133fbca48")
public static String es_PE_FIELD_CommissionLine_SubtractAmount_Name="Total Restado";

@XendraField(AD_Column_ID="AmtSubtract",IsCentrallyMaintained=true,
AD_Tab_ID="7a3c9b6a-9bc8-87fe-47ca-2cef6dc144a7",AD_FieldGroup_ID="Amounts",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="07d7c37b-ccf6-0f8c-42a1-6d8133fbca48")
public static final String FIELDNAME_CommissionLine_SubtractAmount="07d7c37b-ccf6-0f8c-42a1-6d8133fbca48";

@XendraTrl(Identifier="e8074bff-aa97-c5b2-a004-01c1e40e7180")
public static String es_PE_COLUMN_AmtSubtract_Name="Total Restado";

@XendraColumn(AD_Element_ID="97d56ea9-b290-c1ec-a5c7-e72552879fe2",ColumnName="AmtSubtract",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e8074bff-aa97-c5b2-a004-01c1e40e7180",
Synchronized="2017-08-05 16:53:30.0")
/** Column name AmtSubtract */
public static final String COLUMNNAME_AmtSubtract = "AmtSubtract";
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

@XendraTrl(Identifier="9d6e6862-8922-f75c-0f40-b8d12b58bf6f")
public static String es_PE_FIELD_CommissionLine_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="9d6e6862-8922-f75c-0f40-b8d12b58bf6f")
public static String es_PE_FIELD_CommissionLine_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraTrl(Identifier="9d6e6862-8922-f75c-0f40-b8d12b58bf6f")
public static String es_PE_FIELD_CommissionLine_BusinessPartner_Name="Socio de Negocio";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7a3c9b6a-9bc8-87fe-47ca-2cef6dc144a7",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9d6e6862-8922-f75c-0f40-b8d12b58bf6f")
public static final String FIELDNAME_CommissionLine_BusinessPartner="9d6e6862-8922-f75c-0f40-b8d12b58bf6f";

@XendraTrl(Identifier="f98b455e-e374-cf72-d992-5a591d988ed6")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="06fdbbe9-e1c4-3ee4-4a9d-73d1a990cc42",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="f98b455e-e374-cf72-d992-5a591d988ed6",Synchronized="2017-08-05 16:53:30.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set Business Partner Group.
@param C_BP_Group_ID Business Partner Group */
public void setC_BP_Group_ID (int C_BP_Group_ID)
{
if (C_BP_Group_ID <= 0) set_Value (COLUMNNAME_C_BP_Group_ID, null);
 else 
set_Value (COLUMNNAME_C_BP_Group_ID, Integer.valueOf(C_BP_Group_ID));
}
/** Get Business Partner Group.
@return Business Partner Group */
public int getC_BP_Group_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BP_Group_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="61e8d868-17bd-4acd-2220-8060eab4841c")
public static String es_PE_FIELD_CommissionLine_BusinessPartnerGroup_Description="ID del Grupo de Socio de Negocio";

@XendraTrl(Identifier="61e8d868-17bd-4acd-2220-8060eab4841c")
public static String es_PE_FIELD_CommissionLine_BusinessPartnerGroup_Help="La ID Grupo del Socio de Negocio proporciona un método de definir valores predeterminados a ser usados para Socios de Negocio individuales.";

@XendraTrl(Identifier="61e8d868-17bd-4acd-2220-8060eab4841c")
public static String es_PE_FIELD_CommissionLine_BusinessPartnerGroup_Name="Grupo de Socio de Negocio";

@XendraField(AD_Column_ID="C_BP_Group_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7a3c9b6a-9bc8-87fe-47ca-2cef6dc144a7",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="61e8d868-17bd-4acd-2220-8060eab4841c")
public static final String FIELDNAME_CommissionLine_BusinessPartnerGroup="61e8d868-17bd-4acd-2220-8060eab4841c";

@XendraTrl(Identifier="324b630d-2d60-a85e-bc35-4ea38278f47e")
public static String es_PE_COLUMN_C_BP_Group_ID_Name="Grupo de Socio de Negocio";

@XendraColumn(AD_Element_ID="e4bea975-0a3a-c828-703f-724f29c7518a",ColumnName="C_BP_Group_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="324b630d-2d60-a85e-bc35-4ea38278f47e",
Synchronized="2017-08-05 16:53:30.0")
/** Column name C_BP_Group_ID */
public static final String COLUMNNAME_C_BP_Group_ID = "C_BP_Group_ID";
/** Set Commission.
@param C_Commission_ID Commission */
public void setC_Commission_ID (int C_Commission_ID)
{
if (C_Commission_ID < 1) throw new IllegalArgumentException ("C_Commission_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Commission_ID, Integer.valueOf(C_Commission_ID));
}
/** Get Commission.
@return Commission */
public int getC_Commission_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Commission_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getC_Commission_ID()));
}

@XendraTrl(Identifier="0cda94ad-9cb9-612e-48ff-3fede5fe0dea")
public static String es_PE_FIELD_CommissionLine_Commission_Description="Identificador de comisiones";

@XendraTrl(Identifier="0cda94ad-9cb9-612e-48ff-3fede5fe0dea")
public static String es_PE_FIELD_CommissionLine_Commission_Help="La ID de Comisiones es un identificador único de un conjunto de reglas de comisiones";

@XendraTrl(Identifier="0cda94ad-9cb9-612e-48ff-3fede5fe0dea")
public static String es_PE_FIELD_CommissionLine_Commission_Name="Comisión";

@XendraField(AD_Column_ID="C_Commission_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7a3c9b6a-9bc8-87fe-47ca-2cef6dc144a7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0cda94ad-9cb9-612e-48ff-3fede5fe0dea")
public static final String FIELDNAME_CommissionLine_Commission="0cda94ad-9cb9-612e-48ff-3fede5fe0dea";

@XendraTrl(Identifier="4443e7fa-d7c4-655e-ae89-f674d6132a9b")
public static String es_PE_COLUMN_C_Commission_ID_Name="Comisión";

@XendraColumn(AD_Element_ID="08639de7-14ae-d138-fbed-28f57024bba0",ColumnName="C_Commission_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4443e7fa-d7c4-655e-ae89-f674d6132a9b",
Synchronized="2017-08-05 16:53:30.0")
/** Column name C_Commission_ID */
public static final String COLUMNNAME_C_Commission_ID = "C_Commission_ID";
/** Set Commission Line.
@param C_CommissionLine_ID Commission Line */
public void setC_CommissionLine_ID (int C_CommissionLine_ID)
{
if (C_CommissionLine_ID < 1) throw new IllegalArgumentException ("C_CommissionLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_CommissionLine_ID, Integer.valueOf(C_CommissionLine_ID));
}
/** Get Commission Line.
@return Commission Line */
public int getC_CommissionLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_CommissionLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="282ef23a-a47c-2cfb-3108-7d3bf88f4eb6")
public static String es_PE_FIELD_CommissionLine_CommissionLine_Description="Item de la comisión";

@XendraTrl(Identifier="282ef23a-a47c-2cfb-3108-7d3bf88f4eb6")
public static String es_PE_FIELD_CommissionLine_CommissionLine_Help="Es un caso único de un funcionamiento de la comisión. Si el funcionamiento de la comisión fue hecho en modo sumario entonces habrá un solo Item que representa los totales seleccionados de los documentos. ";

@XendraTrl(Identifier="282ef23a-a47c-2cfb-3108-7d3bf88f4eb6")
public static String es_PE_FIELD_CommissionLine_CommissionLine_Name="Item de la comisión";

@XendraField(AD_Column_ID="C_CommissionLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7a3c9b6a-9bc8-87fe-47ca-2cef6dc144a7",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="282ef23a-a47c-2cfb-3108-7d3bf88f4eb6")
public static final String FIELDNAME_CommissionLine_CommissionLine="282ef23a-a47c-2cfb-3108-7d3bf88f4eb6";
/** Column name C_CommissionLine_ID */
public static final String COLUMNNAME_C_CommissionLine_ID = "C_CommissionLine_ID";
/** Set Commission only specified Orders.
@param CommissionOrders Commission only Orders or Invoices, where this Sales Rep is entered */
public void setCommissionOrders (boolean CommissionOrders)
{
set_Value (COLUMNNAME_CommissionOrders, Boolean.valueOf(CommissionOrders));
}
/** Get Commission only specified Orders.
@return Commission only Orders or Invoices, where this Sales Rep is entered */
public boolean isCommissionOrders() 
{
Object oo = get_Value(COLUMNNAME_CommissionOrders);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="afbd63df-3500-aa64-bc29-da1d4178ebf7")
public static String es_PE_FIELD_CommissionLine_CommissionOnlySpecifiedOrders_Description="Comisiones solamente en órdenes ó facturas; donde este representante de ventas sea registrado";

@XendraTrl(Identifier="afbd63df-3500-aa64-bc29-da1d4178ebf7")
public static String es_PE_FIELD_CommissionLine_CommissionOnlySpecifiedOrders_Help="Representantes de Ventas son introducidos en las órdenes y facturas. Si son seleccionados; Solamente órdenes y facturas para estos representantes de ventas se incluyen en el cálculo de la comisión";

@XendraTrl(Identifier="afbd63df-3500-aa64-bc29-da1d4178ebf7")
public static String es_PE_FIELD_CommissionLine_CommissionOnlySpecifiedOrders_Name="Comisión sólo en Ordenes Específicas";

@XendraField(AD_Column_ID="CommissionOrders",IsCentrallyMaintained=true,
AD_Tab_ID="7a3c9b6a-9bc8-87fe-47ca-2cef6dc144a7",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="afbd63df-3500-aa64-bc29-da1d4178ebf7")
public static final String FIELDNAME_CommissionLine_CommissionOnlySpecifiedOrders="afbd63df-3500-aa64-bc29-da1d4178ebf7";

@XendraTrl(Identifier="b5ff47ef-04ca-0d77-7787-004b8c9b09a1")
public static String es_PE_COLUMN_CommissionOrders_Name="Comisión sólo en Ordenes Específicas";

@XendraColumn(AD_Element_ID="d0b5181f-eff5-2bff-a004-3d444513740b",ColumnName="CommissionOrders",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b5ff47ef-04ca-0d77-7787-004b8c9b09a1",
Synchronized="2017-08-05 16:53:30.0")
/** Column name CommissionOrders */
public static final String COLUMNNAME_CommissionOrders = "CommissionOrders";
/** Set Sales Region.
@param C_SalesRegion_ID Sales coverage region */
public void setC_SalesRegion_ID (int C_SalesRegion_ID)
{
if (C_SalesRegion_ID <= 0) set_Value (COLUMNNAME_C_SalesRegion_ID, null);
 else 
set_Value (COLUMNNAME_C_SalesRegion_ID, Integer.valueOf(C_SalesRegion_ID));
}
/** Get Sales Region.
@return Sales coverage region */
public int getC_SalesRegion_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_SalesRegion_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="028f056d-ea8b-55f8-b27f-552ef025f172")
public static String es_PE_FIELD_CommissionLine_SalesRegion_Description="Región de cobertura de ventas.";

@XendraTrl(Identifier="028f056d-ea8b-55f8-b27f-552ef025f172")
public static String es_PE_FIELD_CommissionLine_SalesRegion_Help="La región de ventas indica una área de cobertura de ventas específica.";

@XendraTrl(Identifier="028f056d-ea8b-55f8-b27f-552ef025f172")
public static String es_PE_FIELD_CommissionLine_SalesRegion_Name="Región de Ventas";

@XendraField(AD_Column_ID="C_SalesRegion_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7a3c9b6a-9bc8-87fe-47ca-2cef6dc144a7",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="028f056d-ea8b-55f8-b27f-552ef025f172")
public static final String FIELDNAME_CommissionLine_SalesRegion="028f056d-ea8b-55f8-b27f-552ef025f172";

@XendraTrl(Identifier="64264ef5-b609-7913-f3d2-2e2a0111aa74")
public static String es_PE_COLUMN_C_SalesRegion_ID_Name="Región de Ventas";

@XendraColumn(AD_Element_ID="26b40f06-df79-27f7-adb4-8ae6c5a1c9b8",ColumnName="C_SalesRegion_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="64264ef5-b609-7913-f3d2-2e2a0111aa74",
Synchronized="2017-08-05 16:53:30.0")
/** Column name C_SalesRegion_ID */
public static final String COLUMNNAME_C_SalesRegion_ID = "C_SalesRegion_ID";
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

@XendraTrl(Identifier="6fabb47d-ca66-9a89-16b1-16c168c55811")
public static String es_PE_FIELD_CommissionLine_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="6fabb47d-ca66-9a89-16b1-16c168c55811")
public static String es_PE_FIELD_CommissionLine_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="6fabb47d-ca66-9a89-16b1-16c168c55811")
public static String es_PE_FIELD_CommissionLine_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="7a3c9b6a-9bc8-87fe-47ca-2cef6dc144a7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6fabb47d-ca66-9a89-16b1-16c168c55811")
public static final String FIELDNAME_CommissionLine_Description="6fabb47d-ca66-9a89-16b1-16c168c55811";

@XendraTrl(Identifier="67b7e459-4752-f7b3-3655-4285ebee1147")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="67b7e459-4752-f7b3-3655-4285ebee1147",
Synchronized="2017-08-05 16:53:30.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
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
@XendraTrl(Identifier="2fd6962b-4143-4fa3-9a9e-4cd9329c8b9c")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2fd6962b-4143-4fa3-9a9e-4cd9329c8b9c",
Synchronized="2017-08-05 16:53:30.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Positive only.
@param IsPositiveOnly Do not generate negative commissions */
public void setIsPositiveOnly (boolean IsPositiveOnly)
{
set_Value (COLUMNNAME_IsPositiveOnly, Boolean.valueOf(IsPositiveOnly));
}
/** Get Positive only.
@return Do not generate negative commissions */
public boolean isPositiveOnly() 
{
Object oo = get_Value(COLUMNNAME_IsPositiveOnly);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="987499d9-8aea-a09f-1462-e71f60b8b6b5")
public static String es_PE_FIELD_CommissionLine_PositiveOnly_Description="No generar comisiones negativas";

@XendraTrl(Identifier="987499d9-8aea-a09f-1462-e71f60b8b6b5")
public static String es_PE_FIELD_CommissionLine_PositiveOnly_Help="El cuadro de verificación solamente cheques positivos indica que si el resultado de la sustracción es negativa; se ignore. Esto significaría que las comisiones negativas no serían calculadas.";

@XendraTrl(Identifier="987499d9-8aea-a09f-1462-e71f60b8b6b5")
public static String es_PE_FIELD_CommissionLine_PositiveOnly_Name="Sólo Positivos";

@XendraField(AD_Column_ID="IsPositiveOnly",IsCentrallyMaintained=true,
AD_Tab_ID="7a3c9b6a-9bc8-87fe-47ca-2cef6dc144a7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="987499d9-8aea-a09f-1462-e71f60b8b6b5")
public static final String FIELDNAME_CommissionLine_PositiveOnly="987499d9-8aea-a09f-1462-e71f60b8b6b5";

@XendraTrl(Identifier="2bca3065-fc7a-f33d-fa40-c063b57795f7")
public static String es_PE_COLUMN_IsPositiveOnly_Name="Sólo Positivos";

@XendraColumn(AD_Element_ID="22937c08-9a90-180d-97b1-9788f277abed",ColumnName="IsPositiveOnly",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2bca3065-fc7a-f33d-fa40-c063b57795f7",
Synchronized="2017-08-05 16:53:30.0")
/** Column name IsPositiveOnly */
public static final String COLUMNNAME_IsPositiveOnly = "IsPositiveOnly";
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

@XendraTrl(Identifier="0593ff5b-d760-f459-9a88-89855a19c077")
public static String es_PE_FIELD_CommissionLine_LineNo_Description="No. Línea único para este documento";

@XendraTrl(Identifier="0593ff5b-d760-f459-9a88-89855a19c077")
public static String es_PE_FIELD_CommissionLine_LineNo_Help="Indica el No. Línea para un documento. También controlará el orden de despliegue de las líneas dentro de un documento";

@XendraTrl(Identifier="0593ff5b-d760-f459-9a88-89855a19c077")
public static String es_PE_FIELD_CommissionLine_LineNo_Name="No. Línea";

@XendraField(AD_Column_ID="Line",IsCentrallyMaintained=true,
AD_Tab_ID="7a3c9b6a-9bc8-87fe-47ca-2cef6dc144a7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0593ff5b-d760-f459-9a88-89855a19c077")
public static final String FIELDNAME_CommissionLine_LineNo="0593ff5b-d760-f459-9a88-89855a19c077";

@XendraTrl(Identifier="c67e4949-9b83-d58b-53fd-e685b4b5824f")
public static String es_PE_COLUMN_Line_Name="No. Línea";

@XendraColumn(AD_Element_ID="986ef077-61da-f9cf-1c6d-aefe3a35113b",ColumnName="Line",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@SQL=SELECT COALESCE(MAX(Line),0)+10 AS DefaultValue FROM C_CommissionLine WHERE C_Commission_ID=@C_Commission_ID@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c67e4949-9b83-d58b-53fd-e685b4b5824f",
Synchronized="2017-08-05 16:53:30.0")
/** Column name Line */
public static final String COLUMNNAME_Line = "Line";
/** Set Product Category.
@param M_Product_Category_ID Category of a Product */
public void setM_Product_Category_ID (int M_Product_Category_ID)
{
if (M_Product_Category_ID <= 0) set_Value (COLUMNNAME_M_Product_Category_ID, null);
 else 
set_Value (COLUMNNAME_M_Product_Category_ID, Integer.valueOf(M_Product_Category_ID));
}
/** Get Product Category.
@return Category of a Product */
public int getM_Product_Category_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_Category_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="09723e49-5ab7-1945-b452-aed83e56f638")
public static String es_PE_FIELD_CommissionLine_ProductCategory_Description="Categoría de la que este producto es parte";

@XendraTrl(Identifier="09723e49-5ab7-1945-b452-aed83e56f638")
public static String es_PE_FIELD_CommissionLine_ProductCategory_Help="Identifica la categoría a la que pertenece este producto. Las categorías del producto son usadas para el cálculo de precios";

@XendraTrl(Identifier="09723e49-5ab7-1945-b452-aed83e56f638")
public static String es_PE_FIELD_CommissionLine_ProductCategory_Name="Categoría del Producto";

@XendraField(AD_Column_ID="M_Product_Category_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7a3c9b6a-9bc8-87fe-47ca-2cef6dc144a7",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="09723e49-5ab7-1945-b452-aed83e56f638")
public static final String FIELDNAME_CommissionLine_ProductCategory="09723e49-5ab7-1945-b452-aed83e56f638";

@XendraTrl(Identifier="2b0a52da-1386-684f-d74d-c5dd33844621")
public static String es_PE_COLUMN_M_Product_Category_ID_Name="Categoría del Producto";

@XendraColumn(AD_Element_ID="80d3e0bb-473b-67d4-42d5-1d776006a69c",
ColumnName="M_Product_Category_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="2b0a52da-1386-684f-d74d-c5dd33844621",Synchronized="2017-08-05 16:53:30.0")
/** Column name M_Product_Category_ID */
public static final String COLUMNNAME_M_Product_Category_ID = "M_Product_Category_ID";
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

@XendraTrl(Identifier="930c98fe-7c28-a122-afa8-4d49315441be")
public static String es_PE_FIELD_CommissionLine_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="930c98fe-7c28-a122-afa8-4d49315441be")
public static String es_PE_FIELD_CommissionLine_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="930c98fe-7c28-a122-afa8-4d49315441be")
public static String es_PE_FIELD_CommissionLine_Product_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7a3c9b6a-9bc8-87fe-47ca-2cef6dc144a7",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="930c98fe-7c28-a122-afa8-4d49315441be")
public static final String FIELDNAME_CommissionLine_Product="930c98fe-7c28-a122-afa8-4d49315441be";

@XendraTrl(Identifier="97f9cf67-3023-9dc5-1cff-7de265a09cc1")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="4281f8eb-238e-6b28-eb66-8cc866e6312c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="97f9cf67-3023-9dc5-1cff-7de265a09cc1",Synchronized="2017-08-05 16:53:30.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";

/** Org_ID AD_Reference=54e78591-f7f4-c613-ea27-e64b3dac5198 */
public static final int ORG_ID_AD_Reference_ID=130;
/** Set Organization.
@param Org_ID Organizational entity within client */
public void setOrg_ID (int Org_ID)
{
if (Org_ID <= 0) set_Value (COLUMNNAME_Org_ID, null);
 else 
set_Value (COLUMNNAME_Org_ID, Integer.valueOf(Org_ID));
}
/** Get Organization.
@return Organizational entity within client */
public int getOrg_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Org_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="de695738-55a0-bfe7-664e-c97b9dfb92a5")
public static String es_PE_FIELD_CommissionLine_Organization_Description="Entidad organizacional dentro de la empresa.";

@XendraTrl(Identifier="de695738-55a0-bfe7-664e-c97b9dfb92a5")
public static String es_PE_FIELD_CommissionLine_Organization_Help="Una organización es una unidad de su compañía ó entidad legal. Ej. tiendas; departamentos";

@XendraTrl(Identifier="de695738-55a0-bfe7-664e-c97b9dfb92a5")
public static String es_PE_FIELD_CommissionLine_Organization_Name="Organización";

@XendraField(AD_Column_ID="Org_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7a3c9b6a-9bc8-87fe-47ca-2cef6dc144a7",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="de695738-55a0-bfe7-664e-c97b9dfb92a5")
public static final String FIELDNAME_CommissionLine_Organization="de695738-55a0-bfe7-664e-c97b9dfb92a5";

@XendraTrl(Identifier="3da77557-4bd3-4c87-5f35-71b0ad291fa0")
public static String es_PE_COLUMN_Org_ID_Name="Organización";

@XendraColumn(AD_Element_ID="a4e75444-9eb1-c885-3445-9b55e2eb765a",ColumnName="Org_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="54e78591-f7f4-c613-ea27-e64b3dac5198",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3da77557-4bd3-4c87-5f35-71b0ad291fa0",Synchronized="2017-08-05 16:53:30.0")
/** Column name Org_ID */
public static final String COLUMNNAME_Org_ID = "Org_ID";
/** Set Multiplier Quantity.
@param QtyMultiplier Value to multiply quantities by for generating commissions. */
public void setQtyMultiplier (BigDecimal QtyMultiplier)
{
if (QtyMultiplier == null) throw new IllegalArgumentException ("QtyMultiplier is mandatory.");
set_Value (COLUMNNAME_QtyMultiplier, QtyMultiplier);
}
/** Get Multiplier Quantity.
@return Value to multiply quantities by for generating commissions. */
public BigDecimal getQtyMultiplier() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QtyMultiplier);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="81458cf8-ce0e-77df-13df-9bba1795bc0b")
public static String es_PE_FIELD_CommissionLine_MultiplierQuantity_Description="Valor por el cúal se multiplican las cantidades para generar las comisiones";

@XendraTrl(Identifier="81458cf8-ce0e-77df-13df-9bba1795bc0b")
public static String es_PE_FIELD_CommissionLine_MultiplierQuantity_Help="El campo Cantidad Multiplicadora indica el valor por el cúal multiplicar las cantidades acumuladas para esta corrida de comisiones";

@XendraTrl(Identifier="81458cf8-ce0e-77df-13df-9bba1795bc0b")
public static String es_PE_FIELD_CommissionLine_MultiplierQuantity_Name="Cantidad Multiplicadora";

@XendraField(AD_Column_ID="QtyMultiplier",IsCentrallyMaintained=true,
AD_Tab_ID="7a3c9b6a-9bc8-87fe-47ca-2cef6dc144a7",AD_FieldGroup_ID="Quantities",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="81458cf8-ce0e-77df-13df-9bba1795bc0b")
public static final String FIELDNAME_CommissionLine_MultiplierQuantity="81458cf8-ce0e-77df-13df-9bba1795bc0b";

@XendraTrl(Identifier="0aa1823a-349f-aabf-67af-a63f34512587")
public static String es_PE_COLUMN_QtyMultiplier_Name="Cantidad Multiplicadora";

@XendraColumn(AD_Element_ID="99b5841d-f0b4-5b0d-ec98-ca579e772b14",ColumnName="QtyMultiplier",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0aa1823a-349f-aabf-67af-a63f34512587",
Synchronized="2017-08-05 16:53:31.0")
/** Column name QtyMultiplier */
public static final String COLUMNNAME_QtyMultiplier = "QtyMultiplier";
/** Set Subtract Quantity.
@param QtySubtract Quantity to subtract when generating commissions */
public void setQtySubtract (BigDecimal QtySubtract)
{
if (QtySubtract == null) throw new IllegalArgumentException ("QtySubtract is mandatory.");
set_Value (COLUMNNAME_QtySubtract, QtySubtract);
}
/** Get Subtract Quantity.
@return Quantity to subtract when generating commissions */
public BigDecimal getQtySubtract() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QtySubtract);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="8d927e15-5b7b-7069-66e6-1ec39e8aeff9")
public static String es_PE_FIELD_CommissionLine_SubtractQuantity_Description="Cantidad a ser restada cuando se generan las comisiones";

@XendraTrl(Identifier="8d927e15-5b7b-7069-66e6-1ec39e8aeff9")
public static String es_PE_FIELD_CommissionLine_SubtractQuantity_Help="La cantidad substraida identifica la cantidad a ser restada antes de la multiplicación";

@XendraTrl(Identifier="8d927e15-5b7b-7069-66e6-1ec39e8aeff9")
public static String es_PE_FIELD_CommissionLine_SubtractQuantity_Name="Cantidad Restada";

@XendraField(AD_Column_ID="QtySubtract",IsCentrallyMaintained=true,
AD_Tab_ID="7a3c9b6a-9bc8-87fe-47ca-2cef6dc144a7",AD_FieldGroup_ID="Quantities",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8d927e15-5b7b-7069-66e6-1ec39e8aeff9")
public static final String FIELDNAME_CommissionLine_SubtractQuantity="8d927e15-5b7b-7069-66e6-1ec39e8aeff9";

@XendraTrl(Identifier="25947930-9550-6c16-1a85-afd6e885327c")
public static String es_PE_COLUMN_QtySubtract_Name="Cantidad Restada";

@XendraColumn(AD_Element_ID="9adb5a06-e662-215f-f272-b79a49e82c81",ColumnName="QtySubtract",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="25947930-9550-6c16-1a85-afd6e885327c",
Synchronized="2017-08-05 16:53:31.0")
/** Column name QtySubtract */
public static final String COLUMNNAME_QtySubtract = "QtySubtract";
}
