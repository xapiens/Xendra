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
/** Generated Model for M_Warehouse_Acct
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_Warehouse_Acct extends PO
{
/** Standard Constructor
@param ctx context
@param M_Warehouse_Acct_ID id
@param trxName transaction
*/
public X_M_Warehouse_Acct (Properties ctx, int M_Warehouse_Acct_ID, String trxName)
{
super (ctx, M_Warehouse_Acct_ID, trxName);
/** if (M_Warehouse_Acct_ID == 0)
{
setC_AcctSchema_ID (0);
setM_Warehouse_ID (0);
setW_Differences_Acct (0);
setW_InvActualAdjust_Acct (0);
setW_Inventory_Acct (0);
setW_Revaluation_Acct (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_Warehouse_Acct (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=191 */
public static int Table_ID=MTable.getTable_ID("M_Warehouse_Acct");

@XendraTrl(Identifier="3c47e833-7cbc-6dcc-7038-0d00e77a8c43")
public static String es_PE_TAB_Accounting_Description="Contabilidad";

@XendraTrl(Identifier="3c47e833-7cbc-6dcc-7038-0d00e77a8c43")
public static String es_PE_TAB_Accounting_Name="Contabilidad";

@XendraTrl(Identifier="3c47e833-7cbc-6dcc-7038-0d00e77a8c43")
public static String es_PE_TAB_Accounting_Help="La pestaña de Contabilidad define los parámetros contables a ser usados para el inventario de ese almacén.";

@XendraTab(Name="Accounting",Description="Accounting",
Help="The Accounting Tab defines the Accounting parameters to be used for inventory in that Warehouse.",
AD_Window_ID="46ccc992-68c0-cc7a-5da1-f15017ce2fce",SeqNo=40,TabLevel=1,IsSingleRow=true,
IsInfoTab=true,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="3c47e833-7cbc-6dcc-7038-0d00e77a8c43",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Accounting="3c47e833-7cbc-6dcc-7038-0d00e77a8c43";

@XendraTrl(Identifier="2e2b859b-42fc-8776-5d4d-416a43e553a3")
public static String es_PE_TABLE_M_Warehouse_Acct_Name="M_Warehouse_Acct";

@XendraTable(Name="M_Warehouse_Acct",Description="",Help="",TableName="M_Warehouse_Acct",
AccessLevel="3",AD_Window_ID="46ccc992-68c0-cc7a-5da1-f15017ce2fce",AD_Val_Rule_ID="",IsKey=0,
LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="2e2b859b-42fc-8776-5d4d-416a43e553a3",Synchronized="2017-08-16 11:43:38.0")
/** TableName=M_Warehouse_Acct */
public static final String Table_Name="M_Warehouse_Acct";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_Warehouse_Acct");

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
    Table_ID = MTable.getTable_ID("M_Warehouse_Acct");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_Warehouse_Acct[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Accounting Schema.
@param C_AcctSchema_ID Rules for accounting */
public void setC_AcctSchema_ID (int C_AcctSchema_ID)
{
if (C_AcctSchema_ID < 1) throw new IllegalArgumentException ("C_AcctSchema_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_AcctSchema_ID, Integer.valueOf(C_AcctSchema_ID));
}
/** Get Accounting Schema.
@return Rules for accounting */
public int getC_AcctSchema_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_AcctSchema_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f95a4a21-9243-3686-fa41-29d8be2534d3")
public static String es_PE_FIELD_Accounting_AccountingSchema_Description="Reglas para contabilizar";

@XendraTrl(Identifier="f95a4a21-9243-3686-fa41-29d8be2534d3")
public static String es_PE_FIELD_Accounting_AccountingSchema_Help="Un esquema contable define las reglas contables usadas tales como método de costeo; moneda y calendario";

@XendraTrl(Identifier="f95a4a21-9243-3686-fa41-29d8be2534d3")
public static String es_PE_FIELD_Accounting_AccountingSchema_Name="Esquema Contable";

@XendraField(AD_Column_ID="C_AcctSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3c47e833-7cbc-6dcc-7038-0d00e77a8c43",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f95a4a21-9243-3686-fa41-29d8be2534d3")
public static final String FIELDNAME_Accounting_AccountingSchema="f95a4a21-9243-3686-fa41-29d8be2534d3";

@XendraTrl(Identifier="f01bccbf-2b3c-f8bb-bb7e-4666c9c8a7b0")
public static String es_PE_COLUMN_C_AcctSchema_ID_Name="Esquema Contable";

@XendraColumn(AD_Element_ID="561c9a32-9b35-9c1a-fabc-8abf7f2bb4ae",ColumnName="C_AcctSchema_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f01bccbf-2b3c-f8bb-bb7e-4666c9c8a7b0",
Synchronized="2017-08-05 16:55:38.0")
/** Column name C_AcctSchema_ID */
public static final String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
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
@XendraTrl(Identifier="e13e55b1-5614-4e65-912d-6201e3e00b02")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e13e55b1-5614-4e65-912d-6201e3e00b02",
Synchronized="2017-08-05 16:55:38.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Warehouse.
@param M_Warehouse_ID Storage Warehouse and Service Point */
public void setM_Warehouse_ID (int M_Warehouse_ID)
{
if (M_Warehouse_ID < 1) throw new IllegalArgumentException ("M_Warehouse_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_Warehouse_ID, Integer.valueOf(M_Warehouse_ID));
}
/** Get Warehouse.
@return Storage Warehouse and Service Point */
public int getM_Warehouse_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Warehouse_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f5c31dc2-bea5-89fe-2bf5-7afc2bdb4628")
public static String es_PE_FIELD_Accounting_Warehouse_Description="Almacén";

@XendraTrl(Identifier="f5c31dc2-bea5-89fe-2bf5-7afc2bdb4628")
public static String es_PE_FIELD_Accounting_Warehouse_Help="El Almacén indica un Almacén único donde los productos son almacenados";

@XendraTrl(Identifier="f5c31dc2-bea5-89fe-2bf5-7afc2bdb4628")
public static String es_PE_FIELD_Accounting_Warehouse_Name="Almacén";

@XendraField(AD_Column_ID="M_Warehouse_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3c47e833-7cbc-6dcc-7038-0d00e77a8c43",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f5c31dc2-bea5-89fe-2bf5-7afc2bdb4628")
public static final String FIELDNAME_Accounting_Warehouse="f5c31dc2-bea5-89fe-2bf5-7afc2bdb4628";

@XendraTrl(Identifier="0da7c46c-1399-474d-78c5-9db2beef058b")
public static String es_PE_COLUMN_M_Warehouse_ID_Name="Almacén";

@XendraColumn(AD_Element_ID="402045cd-baa5-aeaf-b148-a921dffb7821",ColumnName="M_Warehouse_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0da7c46c-1399-474d-78c5-9db2beef058b",
Synchronized="2017-08-05 16:55:38.0")
/** Column name M_Warehouse_ID */
public static final String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
/** Set Warehouse Differences.
@param W_Differences_Acct Warehouse Differences Account */
public void setW_Differences_Acct (int W_Differences_Acct)
{
set_Value (COLUMNNAME_W_Differences_Acct, Integer.valueOf(W_Differences_Acct));
}
/** Get Warehouse Differences.
@return Warehouse Differences Account */
public int getW_Differences_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_W_Differences_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4f0f1052-0815-9c42-bdea-8b752f295419")
public static String es_PE_FIELD_Accounting_WarehouseDifferences_Description="Cuenta de discrepancias en almacén";

@XendraTrl(Identifier="4f0f1052-0815-9c42-bdea-8b752f295419")
public static String es_PE_FIELD_Accounting_WarehouseDifferences_Help="La cuenta diferencia en almacenes indica la cuenta usada para registrar las diferencias identificadas durante el conteo de inventario";

@XendraTrl(Identifier="4f0f1052-0815-9c42-bdea-8b752f295419")
public static String es_PE_FIELD_Accounting_WarehouseDifferences_Name="Discrepancia en Almacén";

@XendraField(AD_Column_ID="W_Differences_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="3c47e833-7cbc-6dcc-7038-0d00e77a8c43",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4f0f1052-0815-9c42-bdea-8b752f295419")
public static final String FIELDNAME_Accounting_WarehouseDifferences="4f0f1052-0815-9c42-bdea-8b752f295419";

@XendraTrl(Identifier="03b1824a-e6ca-b976-2ff1-5776f12cb622")
public static String es_PE_COLUMN_W_Differences_Acct_Name="Discrepancia en Almacén";

@XendraColumn(AD_Element_ID="42655a2b-4ea5-e691-e289-4c2f61a877d5",ColumnName="W_Differences_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="03b1824a-e6ca-b976-2ff1-5776f12cb622",
Synchronized="2017-08-05 16:55:38.0")
/** Column name W_Differences_Acct */
public static final String COLUMNNAME_W_Differences_Acct = "W_Differences_Acct";
/** Set Inventory Adjustment.
@param W_InvActualAdjust_Acct Account for Inventory value adjustments for Actual Costing */
public void setW_InvActualAdjust_Acct (int W_InvActualAdjust_Acct)
{
set_Value (COLUMNNAME_W_InvActualAdjust_Acct, Integer.valueOf(W_InvActualAdjust_Acct));
}
/** Get Inventory Adjustment.
@return Account for Inventory value adjustments for Actual Costing */
public int getW_InvActualAdjust_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_W_InvActualAdjust_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0e7c66d6-4c07-3635-64c4-7202a4d3647c")
public static String es_PE_FIELD_Accounting_InventoryAdjustment_Description="Cuenta de Ajuste del valor del inventario por costeo actual.";

@XendraTrl(Identifier="0e7c66d6-4c07-3635-64c4-7202a4d3647c")
public static String es_PE_FIELD_Accounting_InventoryAdjustment_Help="En sistemas de costeo actual; esta cuenta se usa para registrar ajustes al valor del inventario. Usted podría establecerla a la cuenta estándar de Activo de Inventarios.";

@XendraTrl(Identifier="0e7c66d6-4c07-3635-64c4-7202a4d3647c")
public static String es_PE_FIELD_Accounting_InventoryAdjustment_Name="Ajuste de Inventario";

@XendraField(AD_Column_ID="W_InvActualAdjust_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="3c47e833-7cbc-6dcc-7038-0d00e77a8c43",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0e7c66d6-4c07-3635-64c4-7202a4d3647c")
public static final String FIELDNAME_Accounting_InventoryAdjustment="0e7c66d6-4c07-3635-64c4-7202a4d3647c";

@XendraTrl(Identifier="13d098c1-524b-55fd-f7b0-ff796b900ae1")
public static String es_PE_COLUMN_W_InvActualAdjust_Acct_Name="Ajuste de Inventario";

@XendraColumn(AD_Element_ID="78b1be4c-95ca-de26-d1ca-67b2d396b657",
ColumnName="W_InvActualAdjust_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="13d098c1-524b-55fd-f7b0-ff796b900ae1",Synchronized="2017-08-05 16:55:38.0")
/** Column name W_InvActualAdjust_Acct */
public static final String COLUMNNAME_W_InvActualAdjust_Acct = "W_InvActualAdjust_Acct";
/** Set (Not Used).
@param W_Inventory_Acct Warehouse Inventory Asset Account - Currently not used */
public void setW_Inventory_Acct (int W_Inventory_Acct)
{
set_Value (COLUMNNAME_W_Inventory_Acct, Integer.valueOf(W_Inventory_Acct));
}
/** Get (Not Used).
@return Warehouse Inventory Asset Account - Currently not used */
public int getW_Inventory_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_W_Inventory_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f939ef8f-f111-beef-430d-1a02dc9250d3")
public static String es_PE_FIELD_Accounting_NotUsed_Description="Cuenta de inventarios";

@XendraTrl(Identifier="f939ef8f-f111-beef-430d-1a02dc9250d3")
public static String es_PE_FIELD_Accounting_NotUsed_Help="La cuenta de inventarios identifica la cuenta usada para registrar el valor de su inventario.";

@XendraTrl(Identifier="f939ef8f-f111-beef-430d-1a02dc9250d3")
public static String es_PE_FIELD_Accounting_NotUsed_Name="Inventario de Materia Prima";

@XendraField(AD_Column_ID="W_Inventory_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="3c47e833-7cbc-6dcc-7038-0d00e77a8c43",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f939ef8f-f111-beef-430d-1a02dc9250d3")
public static final String FIELDNAME_Accounting_NotUsed="f939ef8f-f111-beef-430d-1a02dc9250d3";

@XendraTrl(Identifier="a83221e4-9c06-2bd1-9aca-f93daadf053b")
public static String es_PE_COLUMN_W_Inventory_Acct_Name="Inventario de Materia Prima";

@XendraColumn(AD_Element_ID="1ff46904-f77b-eeed-a62f-69e39ce2315e",ColumnName="W_Inventory_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a83221e4-9c06-2bd1-9aca-f93daadf053b",
Synchronized="2017-08-05 16:55:38.0")
/** Column name W_Inventory_Acct */
public static final String COLUMNNAME_W_Inventory_Acct = "W_Inventory_Acct";
/** Set Inventory Revaluation.
@param W_Revaluation_Acct Account for Inventory Revaluation */
public void setW_Revaluation_Acct (int W_Revaluation_Acct)
{
set_Value (COLUMNNAME_W_Revaluation_Acct, Integer.valueOf(W_Revaluation_Acct));
}
/** Get Inventory Revaluation.
@return Account for Inventory Revaluation */
public int getW_Revaluation_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_W_Revaluation_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="83a50e5e-a367-a001-7a56-fa39cbf0fff8")
public static String es_PE_FIELD_Accounting_InventoryRevaluation_Description="Cuenta de Reevaluación de Inventarios";

@XendraTrl(Identifier="83a50e5e-a367-a001-7a56-fa39cbf0fff8")
public static String es_PE_FIELD_Accounting_InventoryRevaluation_Help="La cuenta de Revaluación de Inventarios identifica la cuenta usada y los cambios del inventario debido a la evaluación actual.";

@XendraTrl(Identifier="83a50e5e-a367-a001-7a56-fa39cbf0fff8")
public static String es_PE_FIELD_Accounting_InventoryRevaluation_Name="Reevaluación de Inventario";

@XendraField(AD_Column_ID="W_Revaluation_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="3c47e833-7cbc-6dcc-7038-0d00e77a8c43",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="83a50e5e-a367-a001-7a56-fa39cbf0fff8")
public static final String FIELDNAME_Accounting_InventoryRevaluation="83a50e5e-a367-a001-7a56-fa39cbf0fff8";

@XendraTrl(Identifier="d0bab789-2565-3b91-5772-5a9f478312a4")
public static String es_PE_COLUMN_W_Revaluation_Acct_Name="Reevaluación de Inventario";

@XendraColumn(AD_Element_ID="97e7cc75-6202-6b6d-8672-193e8c5c026e",ColumnName="W_Revaluation_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d0bab789-2565-3b91-5772-5a9f478312a4",
Synchronized="2017-08-05 16:55:38.0")
/** Column name W_Revaluation_Acct */
public static final String COLUMNNAME_W_Revaluation_Acct = "W_Revaluation_Acct";
}
