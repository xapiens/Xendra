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
/** Generated Model for C_AllocationLine
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_AllocationLine extends PO
{
/** Standard Constructor
@param ctx context
@param C_AllocationLine_ID id
@param trxName transaction
*/
public X_C_AllocationLine (Properties ctx, int C_AllocationLine_ID, String trxName)
{
super (ctx, C_AllocationLine_ID, trxName);
/** if (C_AllocationLine_ID == 0)
{
setAmount (Env.ZERO);	
// 0
setC_AllocationHdr_ID (0);
setC_AllocationLine_ID (0);
setDiscountAmt (Env.ZERO);	
// 0
setWriteOffAmt (Env.ZERO);	
// 0
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_AllocationLine (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=390 */
public static int Table_ID=MTable.getTable_ID("C_AllocationLine");

@XendraTrl(Identifier="21a3761b-c615-9afc-eb30-293b90843bdd")
public static String es_PE_TAB_Allocation_Description="Asignación de la Factura a los Pagos ó al Efectivo";

@XendraTrl(Identifier="21a3761b-c615-9afc-eb30-293b90843bdd")
public static String es_PE_TAB_Allocation_Name="Asignación";
@XendraTab(Name="Allocation",
Description="Allocation of the Invoice to Payments or Cash",Help="",
AD_Window_ID="dc1a37c5-086c-c19e-c2ba-344555bfcf65",SeqNo=50,TabLevel=1,IsSingleRow=false,
IsInfoTab=true,IsTranslationTab=false,IsReadOnly=true,
AD_Column_ID="287d40a1-ca10-bc16-dd0d-4de2d42c9a9d",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=true,Parent_Column_ID="",Identifier="21a3761b-c615-9afc-eb30-293b90843bdd",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Allocation="21a3761b-c615-9afc-eb30-293b90843bdd";

@XendraTrl(Identifier="68726b3b-4221-f18d-bea7-018d45967f69")
public static String es_PE_TAB_Allocation2_Description="Asignación de Facturas para pagos ó Efectivo";

@XendraTrl(Identifier="68726b3b-4221-f18d-bea7-018d45967f69")
public static String es_PE_TAB_Allocation2_Name="Asignación";

@XendraTrl(Identifier="68726b3b-4221-f18d-bea7-018d45967f69")
public static String es_PE_TAB_Allocation2_Help="Asignación de Facturas para pagos ó Efectivo";

@XendraTab(Name="Allocation",Description="Allocation of the Invoice to Payments or Cash",Help="",
AD_Window_ID="f7b55b8d-31bd-29ee-4626-2d3ad620dccb",SeqNo=80,TabLevel=1,IsSingleRow=false,
IsInfoTab=true,IsTranslationTab=false,IsReadOnly=true,
AD_Column_ID="287d40a1-ca10-bc16-dd0d-4de2d42c9a9d",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=true,Parent_Column_ID="",Identifier="68726b3b-4221-f18d-bea7-018d45967f69",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Allocation2="68726b3b-4221-f18d-bea7-018d45967f69";

@XendraTrl(Identifier="cb2c1554-7db3-334c-4545-572eb8d93f8f")
public static String es_PE_TAB_AllocationLine_Description="Revertir Asignaciones";

@XendraTrl(Identifier="cb2c1554-7db3-334c-4545-572eb8d93f8f")
public static String es_PE_TAB_AllocationLine_Name="Detalle";

@XendraTrl(Identifier="cb2c1554-7db3-334c-4545-572eb8d93f8f")
public static String es_PE_TAB_AllocationLine_Help="La pestaña Revertir Asignación define las asignaciones de pago que van a ser reversadas.";

@XendraTab(Name="Allocation Line",Description="View Allocation Lines",
Help="View Allocation Line Details",AD_Window_ID="0c6f825a-c39d-a995-137a-cbcea65e7fe1",SeqNo=20,
TabLevel=1,IsSingleRow=true,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,AD_Column_ID="",
HasTree=false,WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="cb2c1554-7db3-334c-4545-572eb8d93f8f",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_AllocationLine="cb2c1554-7db3-334c-4545-572eb8d93f8f";

@XendraTrl(Identifier="105a2788-0a6a-9627-a2d2-c1ec554d5d5b")
public static String es_PE_TAB_Allocations_Description="Asignación de Pagos/Entregas a Factura";

@XendraTrl(Identifier="105a2788-0a6a-9627-a2d2-c1ec554d5d5b")
public static String es_PE_TAB_Allocations_Name="Asignación";
@XendraTab(Name="Allocations",
Description="Display Allocation of the Payment/Receipt to Invoices",Help="",
AD_Window_ID="a5526dd3-69bf-661f-67ed-fa8a6962a00e",SeqNo=50,TabLevel=1,IsSingleRow=false,
IsInfoTab=true,IsTranslationTab=false,IsReadOnly=true,
AD_Column_ID="385e1f79-d3f8-1275-a083-1989e387ea26",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="105a2788-0a6a-9627-a2d2-c1ec554d5d5b",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Allocations="105a2788-0a6a-9627-a2d2-c1ec554d5d5b";

@XendraTrl(Identifier="737a0fd5-ca55-3049-7514-9557958093ab")
public static String es_PE_TAB_Allocation3_Description="Allocation of the BOE to Payments or Cash";

@XendraTrl(Identifier="737a0fd5-ca55-3049-7514-9557958093ab")
public static String es_PE_TAB_Allocation3_Name="Allocation";
@XendraTab(Name="Allocation",
Description="Allocation of the BOE to Payments or Cash",Help="",
AD_Window_ID="8f6df5bf-4121-5ea0-797c-32487bcbbea9",SeqNo=40,TabLevel=1,IsSingleRow=false,
IsInfoTab=true,IsTranslationTab=false,IsReadOnly=true,
AD_Column_ID="3b86b3a5-2eb6-2ed6-3255-ba2bf1b6554b",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=true,Parent_Column_ID="",Identifier="737a0fd5-ca55-3049-7514-9557958093ab",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Allocation3="737a0fd5-ca55-3049-7514-9557958093ab";

@XendraTrl(Identifier="7ab5581b-174f-3f33-31cf-9d4d0a5063da")
public static String es_PE_TAB_Allocation4_Description="Cash Journal";

@XendraTrl(Identifier="7ab5581b-174f-3f33-31cf-9d4d0a5063da")
public static String es_PE_TAB_Allocation4_Name="Allocation";

@XendraTrl(Identifier="7ab5581b-174f-3f33-31cf-9d4d0a5063da")
public static String es_PE_TAB_Allocation4_Help="The Cash Journal Tab defines the parameters for this journal.";

@XendraTab(Name="Allocation",Description="Cash Journal",
Help="The Cash Journal Tab defines the parameters for this journal.",
AD_Window_ID="8d49c49d-eac3-71bc-171f-8a06ff4f4ab2",SeqNo=30,TabLevel=1,IsSingleRow=false,
IsInfoTab=true,IsTranslationTab=false,IsReadOnly=true,
AD_Column_ID="8c1b8bea-6c32-1012-e679-1bef304de77e",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="7ab5581b-174f-3f33-31cf-9d4d0a5063da",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Allocation4="7ab5581b-174f-3f33-31cf-9d4d0a5063da";

@XendraTrl(Identifier="66013eee-13e8-e05f-b415-1c5c0fb621d8")
public static String es_PE_TAB_Allocation5_Description="Allocation of the BOE to Payments or Cash";

@XendraTrl(Identifier="66013eee-13e8-e05f-b415-1c5c0fb621d8")
public static String es_PE_TAB_Allocation5_Name="Allocation";
@XendraTab(Name="Allocation",
Description="Allocation of the BOE to Payments or Cash",Help="",
AD_Window_ID="ed5bcd83-9b1c-d7fa-65a9-38f76f7a8d35",SeqNo=50,TabLevel=1,IsSingleRow=false,
IsInfoTab=true,IsTranslationTab=false,IsReadOnly=true,
AD_Column_ID="3b86b3a5-2eb6-2ed6-3255-ba2bf1b6554b",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=true,Parent_Column_ID="",Identifier="66013eee-13e8-e05f-b415-1c5c0fb621d8",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Allocation5="66013eee-13e8-e05f-b415-1c5c0fb621d8";

@XendraTrl(Identifier="7fb084bb-3373-4a65-2673-5848954add4d")
public static String es_PE_TABLE_C_AllocationLine_Name="Línea de Asignación";

@XendraTable(Name="Allocation Line",Description="Allocation Line",Help="",
TableName="C_AllocationLine",AccessLevel="1",AD_Window_ID="0c6f825a-c39d-a995-137a-cbcea65e7fe1",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="7fb084bb-3373-4a65-2673-5848954add4d",Synchronized="2017-08-16 11:41:22.0")
/** TableName=C_AllocationLine */
public static final String Table_Name="C_AllocationLine";


@XendraIndex(Name="c_allocationline_invoice",Identifier="a7cb5000-2bcc-1851-400d-106e60c5354f",
Column_Names="c_invoice_id",IsUnique="false",
TableIdentifier="a7cb5000-2bcc-1851-400d-106e60c5354f",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_allocationline_invoice = "a7cb5000-2bcc-1851-400d-106e60c5354f";


@XendraIndex(Name="c_allocationline_payment",Identifier="b6f7b8f5-b22e-8cec-6bc9-4115a7776d03",
Column_Names="c_payment_id",IsUnique="false",
TableIdentifier="b6f7b8f5-b22e-8cec-6bc9-4115a7776d03",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_allocationline_payment = "b6f7b8f5-b22e-8cec-6bc9-4115a7776d03";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_AllocationLine");

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
    Table_ID = MTable.getTable_ID("C_AllocationLine");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_AllocationLine[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="8c57d524-4e59-14fd-2466-b91c95a919ba")
public static String es_PE_FIELD_AllocationLine_Table_Description="Tabla para los campos";

@XendraTrl(Identifier="8c57d524-4e59-14fd-2466-b91c95a919ba")
public static String es_PE_FIELD_AllocationLine_Table_Help="La Tabla indica una tabla en la que reside un campo ó campos.";

@XendraTrl(Identifier="8c57d524-4e59-14fd-2466-b91c95a919ba")
public static String es_PE_FIELD_AllocationLine_Table_Name="Tabla";

@XendraField(AD_Column_ID="AD_Table_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cb2c1554-7db3-334c-4545-572eb8d93f8f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8c57d524-4e59-14fd-2466-b91c95a919ba")
public static final String FIELDNAME_AllocationLine_Table="8c57d524-4e59-14fd-2466-b91c95a919ba";

@XendraTrl(Identifier="96836875-1a19-1a50-1093-17c1e81217a6")
public static String es_PE_FIELD_Allocations_Table_Description="Tabla para los campos";

@XendraTrl(Identifier="96836875-1a19-1a50-1093-17c1e81217a6")
public static String es_PE_FIELD_Allocations_Table_Help="La Tabla indica una tabla en la que reside un campo ó campos.";

@XendraTrl(Identifier="96836875-1a19-1a50-1093-17c1e81217a6")
public static String es_PE_FIELD_Allocations_Table_Name="Tabla";

@XendraField(AD_Column_ID="AD_Table_ID",IsCentrallyMaintained=true,
AD_Tab_ID="105a2788-0a6a-9627-a2d2-c1ec554d5d5b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="96836875-1a19-1a50-1093-17c1e81217a6")
public static final String FIELDNAME_Allocations_Table="96836875-1a19-1a50-1093-17c1e81217a6";

@XendraTrl(Identifier="464d5760-f6de-5526-5181-6c713e42a0a7")
public static String es_PE_FIELD_Allocation_Table_Description="Tabla para los campos";

@XendraTrl(Identifier="464d5760-f6de-5526-5181-6c713e42a0a7")
public static String es_PE_FIELD_Allocation_Table_Help="La Tabla indica una tabla en la que reside un campo ó campos.";

@XendraTrl(Identifier="464d5760-f6de-5526-5181-6c713e42a0a7")
public static String es_PE_FIELD_Allocation_Table_Name="Tabla";

@XendraField(AD_Column_ID="AD_Table_ID",IsCentrallyMaintained=true,
AD_Tab_ID="66013eee-13e8-e05f-b415-1c5c0fb621d8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="464d5760-f6de-5526-5181-6c713e42a0a7")
public static final String FIELDNAME_Allocation_Table="464d5760-f6de-5526-5181-6c713e42a0a7";

@XendraTrl(Identifier="af78e227-9313-2f2f-65a9-c26d396162c2")
public static String es_PE_FIELD_Allocation_Table2_Description="Tabla para los campos";

@XendraTrl(Identifier="af78e227-9313-2f2f-65a9-c26d396162c2")
public static String es_PE_FIELD_Allocation_Table2_Help="La Tabla indica una tabla en la que reside un campo ó campos.";

@XendraTrl(Identifier="af78e227-9313-2f2f-65a9-c26d396162c2")
public static String es_PE_FIELD_Allocation_Table2_Name="Tabla";

@XendraField(AD_Column_ID="AD_Table_ID",IsCentrallyMaintained=true,
AD_Tab_ID="737a0fd5-ca55-3049-7514-9557958093ab",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="af78e227-9313-2f2f-65a9-c26d396162c2")
public static final String FIELDNAME_Allocation_Table2="af78e227-9313-2f2f-65a9-c26d396162c2";

@XendraTrl(Identifier="49a715d1-ceed-0dea-4f4b-db2f04e073a5")
public static String es_PE_FIELD_Allocation_Table3_Description="Tabla para los campos";

@XendraTrl(Identifier="49a715d1-ceed-0dea-4f4b-db2f04e073a5")
public static String es_PE_FIELD_Allocation_Table3_Help="La Tabla indica una tabla en la que reside un campo ó campos.";

@XendraTrl(Identifier="49a715d1-ceed-0dea-4f4b-db2f04e073a5")
public static String es_PE_FIELD_Allocation_Table3_Name="Tabla";

@XendraField(AD_Column_ID="AD_Table_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7ab5581b-174f-3f33-31cf-9d4d0a5063da",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="49a715d1-ceed-0dea-4f4b-db2f04e073a5")
public static final String FIELDNAME_Allocation_Table3="49a715d1-ceed-0dea-4f4b-db2f04e073a5";

@XendraTrl(Identifier="1949cf6d-8444-31f0-2840-b1177de9870d")
public static String es_PE_COLUMN_AD_Table_ID_Name="Table";

@XendraColumn(AD_Element_ID="270eeb02-723b-0ecc-7f56-3c67fa71a7f1",ColumnName="AD_Table_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1949cf6d-8444-31f0-2840-b1177de9870d",
Synchronized="2017-08-05 16:53:12.0")
/** Column name AD_Table_ID */
public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
/** Set Amount.
@param Amount Amount in a defined currency */
public void setAmount (BigDecimal Amount)
{
if (Amount == null) throw new IllegalArgumentException ("Amount is mandatory.");
set_ValueNoCheck (COLUMNNAME_Amount, Amount);
}
/** Get Amount.
@return Amount in a defined currency */
public BigDecimal getAmount() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Amount);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="1286105d-d974-5e96-ecf8-6613a750db80")
public static String es_PE_FIELD_AllocationLine_Amount_Description="Total en una moneda definida";

@XendraTrl(Identifier="1286105d-d974-5e96-ecf8-6613a750db80")
public static String es_PE_FIELD_AllocationLine_Amount_Help="Indica el total para esta línea del documento";

@XendraTrl(Identifier="1286105d-d974-5e96-ecf8-6613a750db80")
public static String es_PE_FIELD_AllocationLine_Amount_Name="Total";

@XendraField(AD_Column_ID="Amount",IsCentrallyMaintained=true,
AD_Tab_ID="cb2c1554-7db3-334c-4545-572eb8d93f8f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1286105d-d974-5e96-ecf8-6613a750db80")
public static final String FIELDNAME_AllocationLine_Amount="1286105d-d974-5e96-ecf8-6613a750db80";

@XendraTrl(Identifier="c001aa50-a6bd-eb4d-4c82-ed02489db4b5")
public static String es_PE_FIELD_Allocation_Amount_Description="Total en una moneda definida";

@XendraTrl(Identifier="c001aa50-a6bd-eb4d-4c82-ed02489db4b5")
public static String es_PE_FIELD_Allocation_Amount_Help="Indica el total para esta línea del documento";

@XendraTrl(Identifier="c001aa50-a6bd-eb4d-4c82-ed02489db4b5")
public static String es_PE_FIELD_Allocation_Amount_Name="Total";
@XendraField(AD_Column_ID="Amount",
IsCentrallyMaintained=true,AD_Tab_ID="21a3761b-c615-9afc-eb30-293b90843bdd",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=80,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="c001aa50-a6bd-eb4d-4c82-ed02489db4b5")
public static final String FIELDNAME_Allocation_Amount="c001aa50-a6bd-eb4d-4c82-ed02489db4b5";

@XendraTrl(Identifier="5f901aef-0113-26b6-7d86-fafb979026b1")
public static String es_PE_FIELD_Allocation_Amount2_Description="Total en una moneda definida";

@XendraTrl(Identifier="5f901aef-0113-26b6-7d86-fafb979026b1")
public static String es_PE_FIELD_Allocation_Amount2_Help="Indica el total para esta línea del documento";

@XendraTrl(Identifier="5f901aef-0113-26b6-7d86-fafb979026b1")
public static String es_PE_FIELD_Allocation_Amount2_Name="Total";

@XendraField(AD_Column_ID="Amount",IsCentrallyMaintained=true,
AD_Tab_ID="68726b3b-4221-f18d-bea7-018d45967f69",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5f901aef-0113-26b6-7d86-fafb979026b1")
public static final String FIELDNAME_Allocation_Amount2="5f901aef-0113-26b6-7d86-fafb979026b1";

@XendraTrl(Identifier="ae590bf1-8504-6f1e-3352-4c83160c90d3")
public static String es_PE_FIELD_Allocations_Amount_Description="Total en una moneda definida";

@XendraTrl(Identifier="ae590bf1-8504-6f1e-3352-4c83160c90d3")
public static String es_PE_FIELD_Allocations_Amount_Help="Indica el total para esta línea del documento";

@XendraTrl(Identifier="ae590bf1-8504-6f1e-3352-4c83160c90d3")
public static String es_PE_FIELD_Allocations_Amount_Name="Total pago";

@XendraField(AD_Column_ID="Amount",IsCentrallyMaintained=true,
AD_Tab_ID="105a2788-0a6a-9627-a2d2-c1ec554d5d5b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ae590bf1-8504-6f1e-3352-4c83160c90d3")
public static final String FIELDNAME_Allocations_Amount="ae590bf1-8504-6f1e-3352-4c83160c90d3";

@XendraTrl(Identifier="0e7c4b43-2a17-1eb2-1bad-5607e93e63b6")
public static String es_PE_FIELD_Allocation_Amount3_Description="Total en una moneda definida";

@XendraTrl(Identifier="0e7c4b43-2a17-1eb2-1bad-5607e93e63b6")
public static String es_PE_FIELD_Allocation_Amount3_Help="Indica el total para esta línea del documento";

@XendraTrl(Identifier="0e7c4b43-2a17-1eb2-1bad-5607e93e63b6")
public static String es_PE_FIELD_Allocation_Amount3_Name="Total";

@XendraField(AD_Column_ID="Amount",IsCentrallyMaintained=true,
AD_Tab_ID="66013eee-13e8-e05f-b415-1c5c0fb621d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0e7c4b43-2a17-1eb2-1bad-5607e93e63b6")
public static final String FIELDNAME_Allocation_Amount3="0e7c4b43-2a17-1eb2-1bad-5607e93e63b6";

@XendraTrl(Identifier="b5c049ae-a958-e9e7-b318-005f302499e1")
public static String es_PE_FIELD_Allocation_Amount4_Description="Total en una moneda definida";

@XendraTrl(Identifier="b5c049ae-a958-e9e7-b318-005f302499e1")
public static String es_PE_FIELD_Allocation_Amount4_Help="Indica el total para esta línea del documento";

@XendraTrl(Identifier="b5c049ae-a958-e9e7-b318-005f302499e1")
public static String es_PE_FIELD_Allocation_Amount4_Name="Total";

@XendraField(AD_Column_ID="Amount",IsCentrallyMaintained=true,
AD_Tab_ID="737a0fd5-ca55-3049-7514-9557958093ab",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b5c049ae-a958-e9e7-b318-005f302499e1")
public static final String FIELDNAME_Allocation_Amount4="b5c049ae-a958-e9e7-b318-005f302499e1";

@XendraTrl(Identifier="74c9e529-84c7-e28b-0385-a23ac80f65cf")
public static String es_PE_FIELD_Allocation_Amount5_Description="Total en una moneda definida";

@XendraTrl(Identifier="74c9e529-84c7-e28b-0385-a23ac80f65cf")
public static String es_PE_FIELD_Allocation_Amount5_Help="Indica el total para esta línea del documento";

@XendraTrl(Identifier="74c9e529-84c7-e28b-0385-a23ac80f65cf")
public static String es_PE_FIELD_Allocation_Amount5_Name="Total";

@XendraField(AD_Column_ID="Amount",IsCentrallyMaintained=true,
AD_Tab_ID="7ab5581b-174f-3f33-31cf-9d4d0a5063da",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="74c9e529-84c7-e28b-0385-a23ac80f65cf")
public static final String FIELDNAME_Allocation_Amount5="74c9e529-84c7-e28b-0385-a23ac80f65cf";

@XendraTrl(Identifier="5231328d-dea2-188d-af41-73c9401b9872")
public static String es_PE_COLUMN_Amount_Name="Total";

@XendraColumn(AD_Element_ID="d89b3a02-29fd-e2e3-2d01-dbda08fb2454",ColumnName="Amount",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5231328d-dea2-188d-af41-73c9401b9872",
Synchronized="2017-08-05 16:53:12.0")
/** Column name Amount */
public static final String COLUMNNAME_Amount = "Amount";
/** Set Allocation.
@param C_AllocationHdr_ID Payment allocation */
public void setC_AllocationHdr_ID (int C_AllocationHdr_ID)
{
if (C_AllocationHdr_ID < 1) throw new IllegalArgumentException ("C_AllocationHdr_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_AllocationHdr_ID, Integer.valueOf(C_AllocationHdr_ID));
}
/** Get Allocation.
@return Payment allocation */
public int getC_AllocationHdr_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_AllocationHdr_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7887c894-b3fc-5fa0-e13c-0dd7ce2d32f4")
public static String es_PE_FIELD_AllocationLine_Allocation_Description="Asignación de pagos";

@XendraTrl(Identifier="7887c894-b3fc-5fa0-e13c-0dd7ce2d32f4")
public static String es_PE_FIELD_AllocationLine_Allocation_Name="Asignación";

@XendraField(AD_Column_ID="C_AllocationHdr_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cb2c1554-7db3-334c-4545-572eb8d93f8f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7887c894-b3fc-5fa0-e13c-0dd7ce2d32f4")
public static final String FIELDNAME_AllocationLine_Allocation="7887c894-b3fc-5fa0-e13c-0dd7ce2d32f4";

@XendraTrl(Identifier="684b43d9-8ba9-8286-3b45-4214104bcc87")
public static String es_PE_FIELD_Allocation_Allocation_Description="Asignación de pagos";

@XendraTrl(Identifier="684b43d9-8ba9-8286-3b45-4214104bcc87")
public static String es_PE_FIELD_Allocation_Allocation_Name="Asignación";

@XendraField(AD_Column_ID="C_AllocationHdr_ID",IsCentrallyMaintained=true,
AD_Tab_ID="21a3761b-c615-9afc-eb30-293b90843bdd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="684b43d9-8ba9-8286-3b45-4214104bcc87")
public static final String FIELDNAME_Allocation_Allocation="684b43d9-8ba9-8286-3b45-4214104bcc87";

@XendraTrl(Identifier="f23824c8-c962-4061-0daa-fd2e19f00b95")
public static String es_PE_FIELD_Allocation_Allocation2_Description="Asignación de pagos";

@XendraTrl(Identifier="f23824c8-c962-4061-0daa-fd2e19f00b95")
public static String es_PE_FIELD_Allocation_Allocation2_Name="Asignación";

@XendraField(AD_Column_ID="C_AllocationHdr_ID",IsCentrallyMaintained=true,
AD_Tab_ID="68726b3b-4221-f18d-bea7-018d45967f69",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f23824c8-c962-4061-0daa-fd2e19f00b95")
public static final String FIELDNAME_Allocation_Allocation2="f23824c8-c962-4061-0daa-fd2e19f00b95";

@XendraTrl(Identifier="4d72eaf2-f2c0-26e6-4769-21baad3883ac")
public static String es_PE_FIELD_Allocations_Allocation_Description="Asignación de pagos";

@XendraTrl(Identifier="4d72eaf2-f2c0-26e6-4769-21baad3883ac")
public static String es_PE_FIELD_Allocations_Allocation_Name="Nº de Asignación";

@XendraField(AD_Column_ID="C_AllocationHdr_ID",IsCentrallyMaintained=true,
AD_Tab_ID="105a2788-0a6a-9627-a2d2-c1ec554d5d5b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4d72eaf2-f2c0-26e6-4769-21baad3883ac")
public static final String FIELDNAME_Allocations_Allocation="4d72eaf2-f2c0-26e6-4769-21baad3883ac";

@XendraTrl(Identifier="fbb85823-8715-05d7-f941-5c7b62ec3af6")
public static String es_PE_FIELD_Allocation_Allocation3_Description="Asignación de pagos";

@XendraTrl(Identifier="fbb85823-8715-05d7-f941-5c7b62ec3af6")
public static String es_PE_FIELD_Allocation_Allocation3_Name="Asignación";

@XendraField(AD_Column_ID="C_AllocationHdr_ID",IsCentrallyMaintained=true,
AD_Tab_ID="66013eee-13e8-e05f-b415-1c5c0fb621d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fbb85823-8715-05d7-f941-5c7b62ec3af6")
public static final String FIELDNAME_Allocation_Allocation3="fbb85823-8715-05d7-f941-5c7b62ec3af6";

@XendraTrl(Identifier="9a3df512-f66d-2516-b8e5-9c3e381a5709")
public static String es_PE_FIELD_Allocation_Allocation4_Description="Asignación de pagos";

@XendraTrl(Identifier="9a3df512-f66d-2516-b8e5-9c3e381a5709")
public static String es_PE_FIELD_Allocation_Allocation4_Name="Asignación";

@XendraField(AD_Column_ID="C_AllocationHdr_ID",IsCentrallyMaintained=true,
AD_Tab_ID="737a0fd5-ca55-3049-7514-9557958093ab",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9a3df512-f66d-2516-b8e5-9c3e381a5709")
public static final String FIELDNAME_Allocation_Allocation4="9a3df512-f66d-2516-b8e5-9c3e381a5709";

@XendraTrl(Identifier="39aa88e5-fbe6-3bf2-5f68-0d8aa7a6ac21")
public static String es_PE_FIELD_Allocation_Allocation5_Description="Asignación de pagos";

@XendraTrl(Identifier="39aa88e5-fbe6-3bf2-5f68-0d8aa7a6ac21")
public static String es_PE_FIELD_Allocation_Allocation5_Name="Asignación";

@XendraField(AD_Column_ID="C_AllocationHdr_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7ab5581b-174f-3f33-31cf-9d4d0a5063da",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="39aa88e5-fbe6-3bf2-5f68-0d8aa7a6ac21")
public static final String FIELDNAME_Allocation_Allocation5="39aa88e5-fbe6-3bf2-5f68-0d8aa7a6ac21";

@XendraTrl(Identifier="bea1baeb-5314-b4b7-5aa9-682591e3fa13")
public static String es_PE_COLUMN_C_AllocationHdr_ID_Name="Asignación";

@XendraColumn(AD_Element_ID="1f61d7c0-4b53-7cf9-159a-6c6af4bc8778",ColumnName="C_AllocationHdr_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bea1baeb-5314-b4b7-5aa9-682591e3fa13",
Synchronized="2017-08-05 16:53:12.0")
/** Column name C_AllocationHdr_ID */
public static final String COLUMNNAME_C_AllocationHdr_ID = "C_AllocationHdr_ID";
/** Set Allocation Line.
@param C_AllocationLine_ID Allocation Line */
public void setC_AllocationLine_ID (int C_AllocationLine_ID)
{
if (C_AllocationLine_ID < 1) throw new IllegalArgumentException ("C_AllocationLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_AllocationLine_ID, Integer.valueOf(C_AllocationLine_ID));
}
/** Get Allocation Line.
@return Allocation Line */
public int getC_AllocationLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_AllocationLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e210dc30-c96f-36eb-d37b-247c1cf1c976")
public static String es_PE_FIELD_AllocationLine_AllocationLine_Description="Item de Asignación";

@XendraTrl(Identifier="e210dc30-c96f-36eb-d37b-247c1cf1c976")
public static String es_PE_FIELD_AllocationLine_AllocationLine_Help="Asignación de Efectivo/Pagos a facturas";

@XendraTrl(Identifier="e210dc30-c96f-36eb-d37b-247c1cf1c976")
public static String es_PE_FIELD_AllocationLine_AllocationLine_Name="Item de Asignación";

@XendraField(AD_Column_ID="C_AllocationLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cb2c1554-7db3-334c-4545-572eb8d93f8f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e210dc30-c96f-36eb-d37b-247c1cf1c976")
public static final String FIELDNAME_AllocationLine_AllocationLine="e210dc30-c96f-36eb-d37b-247c1cf1c976";

@XendraTrl(Identifier="b5067d67-bf0e-a596-4db7-bd7ffd35b3d8")
public static String es_PE_FIELD_Allocation_AllocationLine_Description="Item de Asignación";

@XendraTrl(Identifier="b5067d67-bf0e-a596-4db7-bd7ffd35b3d8")
public static String es_PE_FIELD_Allocation_AllocationLine_Help="Asignación de Efectivo/Pagos a facturas";

@XendraTrl(Identifier="b5067d67-bf0e-a596-4db7-bd7ffd35b3d8")
public static String es_PE_FIELD_Allocation_AllocationLine_Name="Item de Asignación";

@XendraField(AD_Column_ID="C_AllocationLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="21a3761b-c615-9afc-eb30-293b90843bdd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b5067d67-bf0e-a596-4db7-bd7ffd35b3d8")
public static final String FIELDNAME_Allocation_AllocationLine="b5067d67-bf0e-a596-4db7-bd7ffd35b3d8";

@XendraTrl(Identifier="33f8545a-1723-7a00-572d-0a7d8d816337")
public static String es_PE_FIELD_Allocation_AllocationLine2_Description="Item de Asignación";

@XendraTrl(Identifier="33f8545a-1723-7a00-572d-0a7d8d816337")
public static String es_PE_FIELD_Allocation_AllocationLine2_Help="Asignación de Efectivo/Pagos a facturas";

@XendraTrl(Identifier="33f8545a-1723-7a00-572d-0a7d8d816337")
public static String es_PE_FIELD_Allocation_AllocationLine2_Name="Item de Asignación";

@XendraField(AD_Column_ID="C_AllocationLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="68726b3b-4221-f18d-bea7-018d45967f69",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="33f8545a-1723-7a00-572d-0a7d8d816337")
public static final String FIELDNAME_Allocation_AllocationLine2="33f8545a-1723-7a00-572d-0a7d8d816337";

@XendraTrl(Identifier="30f58b96-e6a1-01aa-4cca-064a1158e8a9")
public static String es_PE_FIELD_Allocations_AllocationLine_Description="Item de Asignación";

@XendraTrl(Identifier="30f58b96-e6a1-01aa-4cca-064a1158e8a9")
public static String es_PE_FIELD_Allocations_AllocationLine_Help="Asignación de Efectivo/Pagos a facturas";

@XendraTrl(Identifier="30f58b96-e6a1-01aa-4cca-064a1158e8a9")
public static String es_PE_FIELD_Allocations_AllocationLine_Name="Item de Asignación";

@XendraField(AD_Column_ID="C_AllocationLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="105a2788-0a6a-9627-a2d2-c1ec554d5d5b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="30f58b96-e6a1-01aa-4cca-064a1158e8a9")
public static final String FIELDNAME_Allocations_AllocationLine="30f58b96-e6a1-01aa-4cca-064a1158e8a9";

@XendraTrl(Identifier="8fde4b9a-c3da-ec29-6afa-d1345a6f7606")
public static String es_PE_FIELD_Allocation_AllocationLine3_Description="Línea de Asignación";

@XendraTrl(Identifier="8fde4b9a-c3da-ec29-6afa-d1345a6f7606")
public static String es_PE_FIELD_Allocation_AllocationLine3_Help="Asignación de Efectivo/Pagos a facturas";

@XendraTrl(Identifier="8fde4b9a-c3da-ec29-6afa-d1345a6f7606")
public static String es_PE_FIELD_Allocation_AllocationLine3_Name="Línea de Asignación";

@XendraField(AD_Column_ID="C_AllocationLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="66013eee-13e8-e05f-b415-1c5c0fb621d8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8fde4b9a-c3da-ec29-6afa-d1345a6f7606")
public static final String FIELDNAME_Allocation_AllocationLine3="8fde4b9a-c3da-ec29-6afa-d1345a6f7606";

@XendraTrl(Identifier="4f076734-6d4a-d7f8-183e-4282cea765db")
public static String es_PE_FIELD_Allocation_AllocationLine4_Description="Línea de Asignación";

@XendraTrl(Identifier="4f076734-6d4a-d7f8-183e-4282cea765db")
public static String es_PE_FIELD_Allocation_AllocationLine4_Help="Asignación de Efectivo/Pagos a facturas";

@XendraTrl(Identifier="4f076734-6d4a-d7f8-183e-4282cea765db")
public static String es_PE_FIELD_Allocation_AllocationLine4_Name="Línea de Asignación";

@XendraField(AD_Column_ID="C_AllocationLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="737a0fd5-ca55-3049-7514-9557958093ab",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4f076734-6d4a-d7f8-183e-4282cea765db")
public static final String FIELDNAME_Allocation_AllocationLine4="4f076734-6d4a-d7f8-183e-4282cea765db";

@XendraTrl(Identifier="71464f1c-3533-5c31-d0b0-cbf734c07949")
public static String es_PE_FIELD_Allocation_AllocationLine5_Description="Línea de Asignación";

@XendraTrl(Identifier="71464f1c-3533-5c31-d0b0-cbf734c07949")
public static String es_PE_FIELD_Allocation_AllocationLine5_Help="Asignación de Efectivo/Pagos a facturas";

@XendraTrl(Identifier="71464f1c-3533-5c31-d0b0-cbf734c07949")
public static String es_PE_FIELD_Allocation_AllocationLine5_Name="Línea de Asignación";

@XendraField(AD_Column_ID="C_AllocationLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7ab5581b-174f-3f33-31cf-9d4d0a5063da",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="71464f1c-3533-5c31-d0b0-cbf734c07949")
public static final String FIELDNAME_Allocation_AllocationLine5="71464f1c-3533-5c31-d0b0-cbf734c07949";
/** Column name C_AllocationLine_ID */
public static final String COLUMNNAME_C_AllocationLine_ID = "C_AllocationLine_ID";
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

@XendraTrl(Identifier="23e237c8-55d4-d0f7-b1a0-07c2237c109e")
public static String es_PE_FIELD_AllocationLine_BillOfExchange_Description="Identificador de la Letra de Cambio ";

@XendraTrl(Identifier="23e237c8-55d4-d0f7-b1a0-07c2237c109e")
public static String es_PE_FIELD_AllocationLine_BillOfExchange_Help="El docuemnto Letra de Cambio";

@XendraTrl(Identifier="23e237c8-55d4-d0f7-b1a0-07c2237c109e")
public static String es_PE_FIELD_AllocationLine_BillOfExchange_Name="Letra de Cambio";

@XendraField(AD_Column_ID="C_BOE_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cb2c1554-7db3-334c-4545-572eb8d93f8f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="23e237c8-55d4-d0f7-b1a0-07c2237c109e")
public static final String FIELDNAME_AllocationLine_BillOfExchange="23e237c8-55d4-d0f7-b1a0-07c2237c109e";

@XendraTrl(Identifier="81100c54-3ce4-7045-a5f2-c36887c7e275")
public static String es_PE_FIELD_Allocations_BillOfExchange_Description="Identificador de la Letra de Cambio ";

@XendraTrl(Identifier="81100c54-3ce4-7045-a5f2-c36887c7e275")
public static String es_PE_FIELD_Allocations_BillOfExchange_Help="El docuemnto Letra de Cambio";

@XendraTrl(Identifier="81100c54-3ce4-7045-a5f2-c36887c7e275")
public static String es_PE_FIELD_Allocations_BillOfExchange_Name="Letra de Cambio";

@XendraField(AD_Column_ID="C_BOE_ID",IsCentrallyMaintained=true,
AD_Tab_ID="105a2788-0a6a-9627-a2d2-c1ec554d5d5b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="81100c54-3ce4-7045-a5f2-c36887c7e275")
public static final String FIELDNAME_Allocations_BillOfExchange="81100c54-3ce4-7045-a5f2-c36887c7e275";

@XendraTrl(Identifier="83acc1be-bc93-2f46-50e8-1f579d1402e2")
public static String es_PE_FIELD_Allocation_BillOfExchange_Description="Identificador de la Letra de Cambio ";

@XendraTrl(Identifier="83acc1be-bc93-2f46-50e8-1f579d1402e2")
public static String es_PE_FIELD_Allocation_BillOfExchange_Help="El docuemnto Letra de Cambio";

@XendraTrl(Identifier="83acc1be-bc93-2f46-50e8-1f579d1402e2")
public static String es_PE_FIELD_Allocation_BillOfExchange_Name="Letra de Cambio";

@XendraField(AD_Column_ID="C_BOE_ID",IsCentrallyMaintained=true,
AD_Tab_ID="66013eee-13e8-e05f-b415-1c5c0fb621d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="83acc1be-bc93-2f46-50e8-1f579d1402e2")
public static final String FIELDNAME_Allocation_BillOfExchange="83acc1be-bc93-2f46-50e8-1f579d1402e2";

@XendraTrl(Identifier="41b45a96-02e8-4710-cec1-607f8804b836")
public static String es_PE_FIELD_Allocation_BillOfExchange2_Description="Identificador de la Letra de Cambio ";

@XendraTrl(Identifier="41b45a96-02e8-4710-cec1-607f8804b836")
public static String es_PE_FIELD_Allocation_BillOfExchange2_Help="El docuemnto Letra de Cambio";

@XendraTrl(Identifier="41b45a96-02e8-4710-cec1-607f8804b836")
public static String es_PE_FIELD_Allocation_BillOfExchange2_Name="Letra de Cambio";

@XendraField(AD_Column_ID="C_BOE_ID",IsCentrallyMaintained=true,
AD_Tab_ID="737a0fd5-ca55-3049-7514-9557958093ab",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="41b45a96-02e8-4710-cec1-607f8804b836")
public static final String FIELDNAME_Allocation_BillOfExchange2="41b45a96-02e8-4710-cec1-607f8804b836";

@XendraTrl(Identifier="e1f88a08-a8ac-0681-3d84-174bc2bb5f30")
public static String es_PE_FIELD_Allocation_BillOfExchange3_Description="Identificador de la Letra de Cambio ";

@XendraTrl(Identifier="e1f88a08-a8ac-0681-3d84-174bc2bb5f30")
public static String es_PE_FIELD_Allocation_BillOfExchange3_Help="El docuemnto Letra de Cambio";

@XendraTrl(Identifier="e1f88a08-a8ac-0681-3d84-174bc2bb5f30")
public static String es_PE_FIELD_Allocation_BillOfExchange3_Name="Letra de Cambio";

@XendraField(AD_Column_ID="C_BOE_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7ab5581b-174f-3f33-31cf-9d4d0a5063da",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e1f88a08-a8ac-0681-3d84-174bc2bb5f30")
public static final String FIELDNAME_Allocation_BillOfExchange3="e1f88a08-a8ac-0681-3d84-174bc2bb5f30";

@XendraTrl(Identifier="3b86b3a5-2eb6-2ed6-3255-ba2bf1b6554b")
public static String es_PE_COLUMN_C_BOE_ID_Name="Bill Of Exchange";

@XendraColumn(AD_Element_ID="7dfa9e28-2055-cea9-fa94-b5ebdac44420",ColumnName="C_BOE_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3b86b3a5-2eb6-2ed6-3255-ba2bf1b6554b",
Synchronized="2017-08-05 16:53:12.0")
/** Column name C_BOE_ID */
public static final String COLUMNNAME_C_BOE_ID = "C_BOE_ID";
/** Set Business Partner .
@param C_BPartner_ID Identifies a Business Partner */
public void setC_BPartner_ID (int C_BPartner_ID)
{
if (C_BPartner_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_BPartner_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
}
/** Get Business Partner .
@return Identifies a Business Partner */
public int getC_BPartner_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getC_BPartner_ID()));
}

@XendraTrl(Identifier="fa78c2de-2b02-9adb-3b69-cc2b7a34d6e0")
public static String es_PE_FIELD_AllocationLine_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="fa78c2de-2b02-9adb-3b69-cc2b7a34d6e0")
public static String es_PE_FIELD_AllocationLine_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraTrl(Identifier="fa78c2de-2b02-9adb-3b69-cc2b7a34d6e0")
public static String es_PE_FIELD_AllocationLine_BusinessPartner_Name="Socio de Negocio";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cb2c1554-7db3-334c-4545-572eb8d93f8f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fa78c2de-2b02-9adb-3b69-cc2b7a34d6e0")
public static final String FIELDNAME_AllocationLine_BusinessPartner="fa78c2de-2b02-9adb-3b69-cc2b7a34d6e0";

@XendraTrl(Identifier="ec053e06-dcbe-d7b5-b553-68a3d7f8b1ad")
public static String es_PE_FIELD_Allocation_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="ec053e06-dcbe-d7b5-b553-68a3d7f8b1ad")
public static String es_PE_FIELD_Allocation_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraTrl(Identifier="ec053e06-dcbe-d7b5-b553-68a3d7f8b1ad")
public static String es_PE_FIELD_Allocation_BusinessPartner_Name="Socio de Negocio";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="21a3761b-c615-9afc-eb30-293b90843bdd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ec053e06-dcbe-d7b5-b553-68a3d7f8b1ad")
public static final String FIELDNAME_Allocation_BusinessPartner="ec053e06-dcbe-d7b5-b553-68a3d7f8b1ad";

@XendraTrl(Identifier="0e03de18-8467-d23f-3798-6aa44a379927")
public static String es_PE_FIELD_Allocation_BusinessPartner2_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="0e03de18-8467-d23f-3798-6aa44a379927")
public static String es_PE_FIELD_Allocation_BusinessPartner2_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraTrl(Identifier="0e03de18-8467-d23f-3798-6aa44a379927")
public static String es_PE_FIELD_Allocation_BusinessPartner2_Name="Socio de Negocio";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="68726b3b-4221-f18d-bea7-018d45967f69",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0e03de18-8467-d23f-3798-6aa44a379927")
public static final String FIELDNAME_Allocation_BusinessPartner2="0e03de18-8467-d23f-3798-6aa44a379927";

@XendraTrl(Identifier="d413ca73-9c43-ad25-c2b8-639c99e6ea6a")
public static String es_PE_FIELD_Allocations_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="d413ca73-9c43-ad25-c2b8-639c99e6ea6a")
public static String es_PE_FIELD_Allocations_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraTrl(Identifier="d413ca73-9c43-ad25-c2b8-639c99e6ea6a")
public static String es_PE_FIELD_Allocations_BusinessPartner_Name="Socio de Negocio";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="105a2788-0a6a-9627-a2d2-c1ec554d5d5b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d413ca73-9c43-ad25-c2b8-639c99e6ea6a")
public static final String FIELDNAME_Allocations_BusinessPartner="d413ca73-9c43-ad25-c2b8-639c99e6ea6a";

@XendraTrl(Identifier="a3fe6ad3-afa7-fa07-72ce-e9c54a1792f4")
public static String es_PE_FIELD_Allocation_BusinessPartner3_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="a3fe6ad3-afa7-fa07-72ce-e9c54a1792f4")
public static String es_PE_FIELD_Allocation_BusinessPartner3_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraTrl(Identifier="a3fe6ad3-afa7-fa07-72ce-e9c54a1792f4")
public static String es_PE_FIELD_Allocation_BusinessPartner3_Name="Socio de Negocio";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="66013eee-13e8-e05f-b415-1c5c0fb621d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a3fe6ad3-afa7-fa07-72ce-e9c54a1792f4")
public static final String FIELDNAME_Allocation_BusinessPartner3="a3fe6ad3-afa7-fa07-72ce-e9c54a1792f4";

@XendraTrl(Identifier="3882c7a6-a2c7-76e0-8364-233770250c46")
public static String es_PE_FIELD_Allocation_BusinessPartner4_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="3882c7a6-a2c7-76e0-8364-233770250c46")
public static String es_PE_FIELD_Allocation_BusinessPartner4_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraTrl(Identifier="3882c7a6-a2c7-76e0-8364-233770250c46")
public static String es_PE_FIELD_Allocation_BusinessPartner4_Name="Socio de Negocio";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="737a0fd5-ca55-3049-7514-9557958093ab",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3882c7a6-a2c7-76e0-8364-233770250c46")
public static final String FIELDNAME_Allocation_BusinessPartner4="3882c7a6-a2c7-76e0-8364-233770250c46";

@XendraTrl(Identifier="87587855-8aad-82d4-9d9b-46bd4e106c62")
public static String es_PE_FIELD_Allocation_BusinessPartner5_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="87587855-8aad-82d4-9d9b-46bd4e106c62")
public static String es_PE_FIELD_Allocation_BusinessPartner5_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraTrl(Identifier="87587855-8aad-82d4-9d9b-46bd4e106c62")
public static String es_PE_FIELD_Allocation_BusinessPartner5_Name="Socio de Negocio";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7ab5581b-174f-3f33-31cf-9d4d0a5063da",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="87587855-8aad-82d4-9d9b-46bd4e106c62")
public static final String FIELDNAME_Allocation_BusinessPartner5="87587855-8aad-82d4-9d9b-46bd4e106c62";

@XendraTrl(Identifier="c89fb77c-e739-dbe5-394e-cc694fc94ac5")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="06fdbbe9-e1c4-3ee4-4a9d-73d1a990cc42",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c89fb77c-e739-dbe5-394e-cc694fc94ac5",Synchronized="2017-08-05 16:53:12.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set Cash Journal Line.
@param C_CashLine_ID Cash Journal Line */
public void setC_CashLine_ID (int C_CashLine_ID)
{
if (C_CashLine_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_CashLine_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_CashLine_ID, Integer.valueOf(C_CashLine_ID));
}
/** Get Cash Journal Line.
@return Cash Journal Line */
public int getC_CashLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_CashLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="14e06368-0851-bb8c-56cc-b8e8c249fb92")
public static String es_PE_FIELD_AllocationLine_CashJournalLine_Description="Item del diario de efectivo";

@XendraTrl(Identifier="14e06368-0851-bb8c-56cc-b8e8c249fb92")
public static String es_PE_FIELD_AllocationLine_CashJournalLine_Help="Identifica un Item único en un diario de efectivo.";

@XendraTrl(Identifier="14e06368-0851-bb8c-56cc-b8e8c249fb92")
public static String es_PE_FIELD_AllocationLine_CashJournalLine_Name="Item del Diario de Efectivo";

@XendraField(AD_Column_ID="C_CashLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cb2c1554-7db3-334c-4545-572eb8d93f8f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="14e06368-0851-bb8c-56cc-b8e8c249fb92")
public static final String FIELDNAME_AllocationLine_CashJournalLine="14e06368-0851-bb8c-56cc-b8e8c249fb92";

@XendraTrl(Identifier="e35e2d20-4d97-48be-5dbd-fb8b6dabc9e4")
public static String es_PE_FIELD_Allocation_CashJournalLine_Description="Item del diario de efectivo";

@XendraTrl(Identifier="e35e2d20-4d97-48be-5dbd-fb8b6dabc9e4")
public static String es_PE_FIELD_Allocation_CashJournalLine_Help="Identifica un Item único en un diario de efectivo.";

@XendraTrl(Identifier="e35e2d20-4d97-48be-5dbd-fb8b6dabc9e4")
public static String es_PE_FIELD_Allocation_CashJournalLine_Name="Item del Diario de Efectivo";

@XendraField(AD_Column_ID="C_CashLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="21a3761b-c615-9afc-eb30-293b90843bdd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e35e2d20-4d97-48be-5dbd-fb8b6dabc9e4")
public static final String FIELDNAME_Allocation_CashJournalLine="e35e2d20-4d97-48be-5dbd-fb8b6dabc9e4";

@XendraTrl(Identifier="1aad5ef2-cf89-ed23-a144-ebb834a23c1e")
public static String es_PE_FIELD_Allocation_CashJournalLine2_Description="Item del diario de efectivo";

@XendraTrl(Identifier="1aad5ef2-cf89-ed23-a144-ebb834a23c1e")
public static String es_PE_FIELD_Allocation_CashJournalLine2_Help="Identifica un Item único en un diario de efectivo.";

@XendraTrl(Identifier="1aad5ef2-cf89-ed23-a144-ebb834a23c1e")
public static String es_PE_FIELD_Allocation_CashJournalLine2_Name="Item del Diario de Efectivo";

@XendraField(AD_Column_ID="C_CashLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="68726b3b-4221-f18d-bea7-018d45967f69",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1aad5ef2-cf89-ed23-a144-ebb834a23c1e")
public static final String FIELDNAME_Allocation_CashJournalLine2="1aad5ef2-cf89-ed23-a144-ebb834a23c1e";

@XendraTrl(Identifier="e17d0854-484a-301f-76ba-70af00f25668")
public static String es_PE_FIELD_Allocations_CashJournalLine_Description="Item del diario de efectivo";

@XendraTrl(Identifier="e17d0854-484a-301f-76ba-70af00f25668")
public static String es_PE_FIELD_Allocations_CashJournalLine_Help="Identifica un Item único en un diario de efectivo.";

@XendraTrl(Identifier="e17d0854-484a-301f-76ba-70af00f25668")
public static String es_PE_FIELD_Allocations_CashJournalLine_Name="Item del Diario de Efectivo";

@XendraField(AD_Column_ID="C_CashLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="105a2788-0a6a-9627-a2d2-c1ec554d5d5b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e17d0854-484a-301f-76ba-70af00f25668")
public static final String FIELDNAME_Allocations_CashJournalLine="e17d0854-484a-301f-76ba-70af00f25668";

@XendraTrl(Identifier="326cf19e-1989-d7e5-eb70-30dc73e47604")
public static String es_PE_FIELD_Allocation_CashJournalLine3_Description="Línea del diario de efectivo";

@XendraTrl(Identifier="326cf19e-1989-d7e5-eb70-30dc73e47604")
public static String es_PE_FIELD_Allocation_CashJournalLine3_Help="La línea del diario de efectivo identifica una línea única en un diario de efectivo.";

@XendraTrl(Identifier="326cf19e-1989-d7e5-eb70-30dc73e47604")
public static String es_PE_FIELD_Allocation_CashJournalLine3_Name="Línea del Diario de Efectivo";

@XendraField(AD_Column_ID="C_CashLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="66013eee-13e8-e05f-b415-1c5c0fb621d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="326cf19e-1989-d7e5-eb70-30dc73e47604")
public static final String FIELDNAME_Allocation_CashJournalLine3="326cf19e-1989-d7e5-eb70-30dc73e47604";

@XendraTrl(Identifier="d43c0662-104f-141c-5a97-5d32bc45268d")
public static String es_PE_FIELD_Allocation_CashJournalLine4_Description="Línea del diario de efectivo";

@XendraTrl(Identifier="d43c0662-104f-141c-5a97-5d32bc45268d")
public static String es_PE_FIELD_Allocation_CashJournalLine4_Help="La línea del diario de efectivo identifica una línea única en un diario de efectivo.";

@XendraTrl(Identifier="d43c0662-104f-141c-5a97-5d32bc45268d")
public static String es_PE_FIELD_Allocation_CashJournalLine4_Name="Línea del Diario de Efectivo";

@XendraField(AD_Column_ID="C_CashLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="737a0fd5-ca55-3049-7514-9557958093ab",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d43c0662-104f-141c-5a97-5d32bc45268d")
public static final String FIELDNAME_Allocation_CashJournalLine4="d43c0662-104f-141c-5a97-5d32bc45268d";

@XendraTrl(Identifier="870e6db4-7020-a149-cd68-af79a24e4f80")
public static String es_PE_FIELD_Allocation_CashJournalLine5_Description="Línea del diario de efectivo";

@XendraTrl(Identifier="870e6db4-7020-a149-cd68-af79a24e4f80")
public static String es_PE_FIELD_Allocation_CashJournalLine5_Help="La línea del diario de efectivo identifica una línea única en un diario de efectivo.";

@XendraTrl(Identifier="870e6db4-7020-a149-cd68-af79a24e4f80")
public static String es_PE_FIELD_Allocation_CashJournalLine5_Name="Línea del Diario de Efectivo";

@XendraField(AD_Column_ID="C_CashLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7ab5581b-174f-3f33-31cf-9d4d0a5063da",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="870e6db4-7020-a149-cd68-af79a24e4f80")
public static final String FIELDNAME_Allocation_CashJournalLine5="870e6db4-7020-a149-cd68-af79a24e4f80";

@XendraTrl(Identifier="8c1b8bea-6c32-1012-e679-1bef304de77e")
public static String es_PE_COLUMN_C_CashLine_ID_Name="Línea del Diario de Efectivo";

@XendraColumn(AD_Element_ID="51d71f75-4ff8-51c4-df6f-191def6be399",ColumnName="C_CashLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8c1b8bea-6c32-1012-e679-1bef304de77e",
Synchronized="2017-08-05 16:53:12.0")
/** Column name C_CashLine_ID */
public static final String COLUMNNAME_C_CashLine_ID = "C_CashLine_ID";
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

@XendraTrl(Identifier="bc844ae3-5823-1548-2173-eb073a6dec46")
public static String es_PE_FIELD_AllocationLine_Charge_Description="Cargos adicionales del documento";

@XendraTrl(Identifier="bc844ae3-5823-1548-2173-eb073a6dec46")
public static String es_PE_FIELD_AllocationLine_Charge_Help="El cargo indica un tipo de cargo (manejo; despacho; reposición)";

@XendraTrl(Identifier="bc844ae3-5823-1548-2173-eb073a6dec46")
public static String es_PE_FIELD_AllocationLine_Charge_Name="Cargo";

@XendraField(AD_Column_ID="C_Charge_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cb2c1554-7db3-334c-4545-572eb8d93f8f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bc844ae3-5823-1548-2173-eb073a6dec46")
public static final String FIELDNAME_AllocationLine_Charge="bc844ae3-5823-1548-2173-eb073a6dec46";

@XendraTrl(Identifier="f4683346-7d9f-9b01-2a9b-e2c4cce36bd5")
public static String es_PE_FIELD_Allocations_Charge_Description="Cargos adicionales del documento";

@XendraTrl(Identifier="f4683346-7d9f-9b01-2a9b-e2c4cce36bd5")
public static String es_PE_FIELD_Allocations_Charge_Help="El cargo indica un tipo de cargo (manejo; despacho; reposición)";

@XendraTrl(Identifier="f4683346-7d9f-9b01-2a9b-e2c4cce36bd5")
public static String es_PE_FIELD_Allocations_Charge_Name="Cargo";

@XendraField(AD_Column_ID="C_Charge_ID",IsCentrallyMaintained=true,
AD_Tab_ID="105a2788-0a6a-9627-a2d2-c1ec554d5d5b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f4683346-7d9f-9b01-2a9b-e2c4cce36bd5")
public static final String FIELDNAME_Allocations_Charge="f4683346-7d9f-9b01-2a9b-e2c4cce36bd5";

@XendraTrl(Identifier="24cde381-1e7b-a0d7-5329-59a6ddeb0328")
public static String es_PE_FIELD_Allocation_Charge_Description="Cargos adicionales del documento";

@XendraTrl(Identifier="24cde381-1e7b-a0d7-5329-59a6ddeb0328")
public static String es_PE_FIELD_Allocation_Charge_Help="El cargo indica un tipo de cargo (manejo; despacho; reposición)";

@XendraTrl(Identifier="24cde381-1e7b-a0d7-5329-59a6ddeb0328")
public static String es_PE_FIELD_Allocation_Charge_Name="Cargo";

@XendraField(AD_Column_ID="C_Charge_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7ab5581b-174f-3f33-31cf-9d4d0a5063da",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="24cde381-1e7b-a0d7-5329-59a6ddeb0328")
public static final String FIELDNAME_Allocation_Charge="24cde381-1e7b-a0d7-5329-59a6ddeb0328";

@XendraTrl(Identifier="2b46ec4e-487c-a8b4-05a4-b9540a4cdc1b")
public static String es_PE_COLUMN_C_Charge_ID_Name="Charge";

@XendraColumn(AD_Element_ID="d7e2fc48-a26e-4ded-ea44-fe15849a7883",ColumnName="C_Charge_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2b46ec4e-487c-a8b4-05a4-b9540a4cdc1b",
Synchronized="2017-08-05 16:53:12.0")
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

@XendraTrl(Identifier="43b9336b-b030-4f0c-b0ad-b167866a7c8b")
public static String es_PE_COLUMN_C_ConversionType_ID_Name="Currency Type";

@XendraColumn(AD_Element_ID="66f5d039-c94d-0957-487b-eb3118bd7719",
ColumnName="C_ConversionType_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="43b9336b-b030-4f0c-b0ad-b167866a7c8b",Synchronized="2017-08-05 16:53:12.0")
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

@XendraTrl(Identifier="053e78b8-848a-8978-5e19-a1ccf3dd16ee")
public static String es_PE_FIELD_AllocationLine_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="053e78b8-848a-8978-5e19-a1ccf3dd16ee")
public static String es_PE_FIELD_AllocationLine_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraTrl(Identifier="053e78b8-848a-8978-5e19-a1ccf3dd16ee")
public static String es_PE_FIELD_AllocationLine_Currency_Name="Moneda";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cb2c1554-7db3-334c-4545-572eb8d93f8f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="053e78b8-848a-8978-5e19-a1ccf3dd16ee")
public static final String FIELDNAME_AllocationLine_Currency="053e78b8-848a-8978-5e19-a1ccf3dd16ee";

@XendraTrl(Identifier="1cdcc189-4660-2613-1dce-bd7122495207")
public static String es_PE_FIELD_Allocations_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="1cdcc189-4660-2613-1dce-bd7122495207")
public static String es_PE_FIELD_Allocations_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraTrl(Identifier="1cdcc189-4660-2613-1dce-bd7122495207")
public static String es_PE_FIELD_Allocations_Currency_Name="Moneda";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="105a2788-0a6a-9627-a2d2-c1ec554d5d5b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1cdcc189-4660-2613-1dce-bd7122495207")
public static final String FIELDNAME_Allocations_Currency="1cdcc189-4660-2613-1dce-bd7122495207";

@XendraTrl(Identifier="9c11c5ce-f732-b509-e2a1-780288025a89")
public static String es_PE_FIELD_Allocation_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="9c11c5ce-f732-b509-e2a1-780288025a89")
public static String es_PE_FIELD_Allocation_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraTrl(Identifier="9c11c5ce-f732-b509-e2a1-780288025a89")
public static String es_PE_FIELD_Allocation_Currency_Name="Moneda";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7ab5581b-174f-3f33-31cf-9d4d0a5063da",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9c11c5ce-f732-b509-e2a1-780288025a89")
public static final String FIELDNAME_Allocation_Currency="9c11c5ce-f732-b509-e2a1-780288025a89";

@XendraTrl(Identifier="4a01cb7a-4de6-85ee-2eae-01fdff7468a6")
public static String es_PE_COLUMN_C_Currency_ID_Name="Currency";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4a01cb7a-4de6-85ee-2eae-01fdff7468a6",
Synchronized="2017-08-05 16:53:12.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
/** Set Invoice.
@param C_Invoice_ID Invoice Identifier */
public void setC_Invoice_ID (int C_Invoice_ID)
{
if (C_Invoice_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_Invoice_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_Invoice_ID, Integer.valueOf(C_Invoice_ID));
}
/** Get Invoice.
@return Invoice Identifier */
public int getC_Invoice_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Invoice_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6f7fbde2-7ffc-386d-f566-0a5336bc92e6")
public static String es_PE_FIELD_AllocationLine_Invoice_Description="Identificador de la factura";

@XendraTrl(Identifier="6f7fbde2-7ffc-386d-f566-0a5336bc92e6")
public static String es_PE_FIELD_AllocationLine_Invoice_Help="La ID de Factura identifica únicamente un documento de Factura.";

@XendraTrl(Identifier="6f7fbde2-7ffc-386d-f566-0a5336bc92e6")
public static String es_PE_FIELD_AllocationLine_Invoice_Name="Factura";

@XendraField(AD_Column_ID="C_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cb2c1554-7db3-334c-4545-572eb8d93f8f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6f7fbde2-7ffc-386d-f566-0a5336bc92e6")
public static final String FIELDNAME_AllocationLine_Invoice="6f7fbde2-7ffc-386d-f566-0a5336bc92e6";

@XendraTrl(Identifier="efa4769e-6137-540a-a0c6-69e4c538a02c")
public static String es_PE_FIELD_Allocation_Invoice_Description="Identificador de la factura";

@XendraTrl(Identifier="efa4769e-6137-540a-a0c6-69e4c538a02c")
public static String es_PE_FIELD_Allocation_Invoice_Help="La ID de Factura identifica únicamente un documento de Factura.";

@XendraTrl(Identifier="efa4769e-6137-540a-a0c6-69e4c538a02c")
public static String es_PE_FIELD_Allocation_Invoice_Name="Factura";

@XendraField(AD_Column_ID="C_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="21a3761b-c615-9afc-eb30-293b90843bdd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="efa4769e-6137-540a-a0c6-69e4c538a02c")
public static final String FIELDNAME_Allocation_Invoice="efa4769e-6137-540a-a0c6-69e4c538a02c";

@XendraTrl(Identifier="03e706dc-9a4d-e9ec-9b29-481b5ed7779f")
public static String es_PE_FIELD_Allocation_Invoice2_Description="Identificador de la factura";

@XendraTrl(Identifier="03e706dc-9a4d-e9ec-9b29-481b5ed7779f")
public static String es_PE_FIELD_Allocation_Invoice2_Help="La ID de Factura identifica únicamente un documento de Factura.";

@XendraTrl(Identifier="03e706dc-9a4d-e9ec-9b29-481b5ed7779f")
public static String es_PE_FIELD_Allocation_Invoice2_Name="Factura";

@XendraField(AD_Column_ID="C_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="68726b3b-4221-f18d-bea7-018d45967f69",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="03e706dc-9a4d-e9ec-9b29-481b5ed7779f")
public static final String FIELDNAME_Allocation_Invoice2="03e706dc-9a4d-e9ec-9b29-481b5ed7779f";

@XendraTrl(Identifier="0426c37b-c196-8a0e-4bd9-1c4bba51e26d")
public static String es_PE_FIELD_Allocations_Invoice_Description="Identificador de la factura";

@XendraTrl(Identifier="0426c37b-c196-8a0e-4bd9-1c4bba51e26d")
public static String es_PE_FIELD_Allocations_Invoice_Help="La ID de Factura identifica únicamente un documento de Factura.";

@XendraTrl(Identifier="0426c37b-c196-8a0e-4bd9-1c4bba51e26d")
public static String es_PE_FIELD_Allocations_Invoice_Name="Factura";

@XendraField(AD_Column_ID="C_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="105a2788-0a6a-9627-a2d2-c1ec554d5d5b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0426c37b-c196-8a0e-4bd9-1c4bba51e26d")
public static final String FIELDNAME_Allocations_Invoice="0426c37b-c196-8a0e-4bd9-1c4bba51e26d";

@XendraTrl(Identifier="166d5a2b-8414-698b-da38-a86c17f55c77")
public static String es_PE_FIELD_Allocation_Invoice3_Description="Identificador de la factura";

@XendraTrl(Identifier="166d5a2b-8414-698b-da38-a86c17f55c77")
public static String es_PE_FIELD_Allocation_Invoice3_Help="La ID de Factura identifica únicamente un documento de Factura.";

@XendraTrl(Identifier="166d5a2b-8414-698b-da38-a86c17f55c77")
public static String es_PE_FIELD_Allocation_Invoice3_Name="Factura";

@XendraField(AD_Column_ID="C_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="66013eee-13e8-e05f-b415-1c5c0fb621d8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="166d5a2b-8414-698b-da38-a86c17f55c77")
public static final String FIELDNAME_Allocation_Invoice3="166d5a2b-8414-698b-da38-a86c17f55c77";

@XendraTrl(Identifier="b8b76f24-7946-af41-0777-8272863b8bcb")
public static String es_PE_FIELD_Allocation_Invoice4_Description="Identificador de la factura";

@XendraTrl(Identifier="b8b76f24-7946-af41-0777-8272863b8bcb")
public static String es_PE_FIELD_Allocation_Invoice4_Help="La ID de Factura identifica únicamente un documento de Factura.";

@XendraTrl(Identifier="b8b76f24-7946-af41-0777-8272863b8bcb")
public static String es_PE_FIELD_Allocation_Invoice4_Name="Factura";

@XendraField(AD_Column_ID="C_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="737a0fd5-ca55-3049-7514-9557958093ab",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b8b76f24-7946-af41-0777-8272863b8bcb")
public static final String FIELDNAME_Allocation_Invoice4="b8b76f24-7946-af41-0777-8272863b8bcb";

@XendraTrl(Identifier="5e2cd136-d7bf-0955-f7b3-e84e9071bcc2")
public static String es_PE_FIELD_Allocation_Invoice5_Description="Identificador de la factura";

@XendraTrl(Identifier="5e2cd136-d7bf-0955-f7b3-e84e9071bcc2")
public static String es_PE_FIELD_Allocation_Invoice5_Help="La ID de Factura identifica únicamente un documento de Factura.";

@XendraTrl(Identifier="5e2cd136-d7bf-0955-f7b3-e84e9071bcc2")
public static String es_PE_FIELD_Allocation_Invoice5_Name="Factura";

@XendraField(AD_Column_ID="C_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7ab5581b-174f-3f33-31cf-9d4d0a5063da",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5e2cd136-d7bf-0955-f7b3-e84e9071bcc2")
public static final String FIELDNAME_Allocation_Invoice5="5e2cd136-d7bf-0955-f7b3-e84e9071bcc2";

@XendraTrl(Identifier="287d40a1-ca10-bc16-dd0d-4de2d42c9a9d")
public static String es_PE_COLUMN_C_Invoice_ID_Name="Factura";

@XendraColumn(AD_Element_ID="e526ea57-1bdf-9871-fd57-0df3c1f9dd42",ColumnName="C_Invoice_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="287d40a1-ca10-bc16-dd0d-4de2d42c9a9d",
Synchronized="2017-08-05 16:53:12.0")
/** Column name C_Invoice_ID */
public static final String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
/** Set Order.
@param C_Order_ID Order */
public void setC_Order_ID (int C_Order_ID)
{
if (C_Order_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_Order_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_Order_ID, Integer.valueOf(C_Order_ID));
}
/** Get Order.
@return Order */
public int getC_Order_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Order_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="817f531e-5f99-3ec6-5c31-abd36b942454")
public static String es_PE_FIELD_AllocationLine_Order_Description="Orden de Venta";

@XendraTrl(Identifier="817f531e-5f99-3ec6-5c31-abd36b942454")
public static String es_PE_FIELD_AllocationLine_Order_Help="La ID de la orden de ventas es un identificador único de la orden de ventas; Ésta es controlada por la secuencia del documento para este tipo de documento.";

@XendraTrl(Identifier="817f531e-5f99-3ec6-5c31-abd36b942454")
public static String es_PE_FIELD_AllocationLine_Order_Name="Orden de Venta";

@XendraField(AD_Column_ID="C_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cb2c1554-7db3-334c-4545-572eb8d93f8f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="817f531e-5f99-3ec6-5c31-abd36b942454")
public static final String FIELDNAME_AllocationLine_Order="817f531e-5f99-3ec6-5c31-abd36b942454";

@XendraTrl(Identifier="a288c32e-28ac-d946-0bd0-eec8a9387924")
public static String es_PE_FIELD_Allocation_Order_Description="Orden de Venta";

@XendraTrl(Identifier="a288c32e-28ac-d946-0bd0-eec8a9387924")
public static String es_PE_FIELD_Allocation_Order_Help="La ID de la orden de ventas es un identificador único de la orden de ventas; Ésta es controlada por la secuencia del documento para este tipo de documento.";

@XendraTrl(Identifier="a288c32e-28ac-d946-0bd0-eec8a9387924")
public static String es_PE_FIELD_Allocation_Order_Name="Orden de Venta";

@XendraField(AD_Column_ID="C_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="21a3761b-c615-9afc-eb30-293b90843bdd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a288c32e-28ac-d946-0bd0-eec8a9387924")
public static final String FIELDNAME_Allocation_Order="a288c32e-28ac-d946-0bd0-eec8a9387924";

@XendraTrl(Identifier="afba945f-b261-f84d-28e9-ac2ca243f7f8")
public static String es_PE_FIELD_Allocation_PurchaseOrder_Description="Orden de compra";

@XendraTrl(Identifier="afba945f-b261-f84d-28e9-ac2ca243f7f8")
public static String es_PE_FIELD_Allocation_PurchaseOrder_Help="La compra es Identificada con un ID único de orden de compra. Esta controlado por la secuencia de este tipo de documento.";

@XendraTrl(Identifier="afba945f-b261-f84d-28e9-ac2ca243f7f8")
public static String es_PE_FIELD_Allocation_PurchaseOrder_Name="Orden de compra";

@XendraField(AD_Column_ID="C_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="68726b3b-4221-f18d-bea7-018d45967f69",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="afba945f-b261-f84d-28e9-ac2ca243f7f8")
public static final String FIELDNAME_Allocation_PurchaseOrder="afba945f-b261-f84d-28e9-ac2ca243f7f8";

@XendraTrl(Identifier="696a60dc-443e-4f85-121d-65f2d3513f8c")
public static String es_PE_FIELD_Allocations_Order_Description="Orden de Venta";

@XendraTrl(Identifier="696a60dc-443e-4f85-121d-65f2d3513f8c")
public static String es_PE_FIELD_Allocations_Order_Help="La ID de la orden de ventas es un identificador único de la orden de ventas; Ésta es controlada por la secuencia del documento para este tipo de documento.";

@XendraTrl(Identifier="696a60dc-443e-4f85-121d-65f2d3513f8c")
public static String es_PE_FIELD_Allocations_Order_Name="Orden de Venta";

@XendraField(AD_Column_ID="C_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="105a2788-0a6a-9627-a2d2-c1ec554d5d5b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="696a60dc-443e-4f85-121d-65f2d3513f8c")
public static final String FIELDNAME_Allocations_Order="696a60dc-443e-4f85-121d-65f2d3513f8c";

@XendraTrl(Identifier="ecdcb99a-63f9-8d1a-8b29-a8f6e1ff0873")
public static String es_PE_FIELD_Allocation_Order2_Description="Orden de Venta";

@XendraTrl(Identifier="ecdcb99a-63f9-8d1a-8b29-a8f6e1ff0873")
public static String es_PE_FIELD_Allocation_Order2_Help="La ID de la orden de ventas es un identificador único de la orden de ventas; Ésta es controlada por la secuencia del documento para este tipo de documento.";

@XendraTrl(Identifier="ecdcb99a-63f9-8d1a-8b29-a8f6e1ff0873")
public static String es_PE_FIELD_Allocation_Order2_Name="Orden de Venta";

@XendraField(AD_Column_ID="C_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="66013eee-13e8-e05f-b415-1c5c0fb621d8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ecdcb99a-63f9-8d1a-8b29-a8f6e1ff0873")
public static final String FIELDNAME_Allocation_Order2="ecdcb99a-63f9-8d1a-8b29-a8f6e1ff0873";

@XendraTrl(Identifier="91404f80-0ab4-00c7-72a8-3af6596e0dc7")
public static String es_PE_FIELD_Allocation_Order3_Description="Orden de Venta";

@XendraTrl(Identifier="91404f80-0ab4-00c7-72a8-3af6596e0dc7")
public static String es_PE_FIELD_Allocation_Order3_Help="La ID de la orden de ventas es un identificador único de la orden de ventas; Ésta es controlada por la secuencia del documento para este tipo de documento.";

@XendraTrl(Identifier="91404f80-0ab4-00c7-72a8-3af6596e0dc7")
public static String es_PE_FIELD_Allocation_Order3_Name="Orden de Venta";

@XendraField(AD_Column_ID="C_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="737a0fd5-ca55-3049-7514-9557958093ab",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="91404f80-0ab4-00c7-72a8-3af6596e0dc7")
public static final String FIELDNAME_Allocation_Order3="91404f80-0ab4-00c7-72a8-3af6596e0dc7";

@XendraTrl(Identifier="049c1f83-4a56-1165-da34-5a8b217fdee3")
public static String es_PE_FIELD_Allocation_Order4_Description="Orden de Venta";

@XendraTrl(Identifier="049c1f83-4a56-1165-da34-5a8b217fdee3")
public static String es_PE_FIELD_Allocation_Order4_Help="La ID de la orden de ventas es un identificador único de la orden de ventas; Ésta es controlada por la secuencia del documento para este tipo de documento.";

@XendraTrl(Identifier="049c1f83-4a56-1165-da34-5a8b217fdee3")
public static String es_PE_FIELD_Allocation_Order4_Name="Orden de Venta";

@XendraField(AD_Column_ID="C_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7ab5581b-174f-3f33-31cf-9d4d0a5063da",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="049c1f83-4a56-1165-da34-5a8b217fdee3")
public static final String FIELDNAME_Allocation_Order4="049c1f83-4a56-1165-da34-5a8b217fdee3";

@XendraTrl(Identifier="b5278b74-4946-3b5b-206e-5047cea918a0")
public static String es_PE_COLUMN_C_Order_ID_Name="Orden de Venta";

@XendraColumn(AD_Element_ID="cc846c60-90b8-6aad-9d07-b5d0c0328787",ColumnName="C_Order_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b5278b74-4946-3b5b-206e-5047cea918a0",
Synchronized="2017-08-05 16:53:12.0")
/** Column name C_Order_ID */
public static final String COLUMNNAME_C_Order_ID = "C_Order_ID";
/** Set Payment.
@param C_Payment_ID Payment identifier */
public void setC_Payment_ID (int C_Payment_ID)
{
if (C_Payment_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_Payment_ID, null);
 else 
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

@XendraTrl(Identifier="6624fb33-bdb3-e9ef-7d23-0bfc7d636cde")
public static String es_PE_FIELD_AllocationLine_Payment_Description="Identificador del pago";

@XendraTrl(Identifier="6624fb33-bdb3-e9ef-7d23-0bfc7d636cde")
public static String es_PE_FIELD_AllocationLine_Payment_Help="El pago es un identificador único de este pago.";

@XendraTrl(Identifier="6624fb33-bdb3-e9ef-7d23-0bfc7d636cde")
public static String es_PE_FIELD_AllocationLine_Payment_Name="Pago";

@XendraField(AD_Column_ID="C_Payment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cb2c1554-7db3-334c-4545-572eb8d93f8f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6624fb33-bdb3-e9ef-7d23-0bfc7d636cde")
public static final String FIELDNAME_AllocationLine_Payment="6624fb33-bdb3-e9ef-7d23-0bfc7d636cde";

@XendraTrl(Identifier="3707b564-32eb-db48-bd94-2dbb90c0253b")
public static String es_PE_FIELD_Allocation_Payment_Description="Identificador del pago";

@XendraTrl(Identifier="3707b564-32eb-db48-bd94-2dbb90c0253b")
public static String es_PE_FIELD_Allocation_Payment_Help="El pago es un identificador único de este pago.";

@XendraTrl(Identifier="3707b564-32eb-db48-bd94-2dbb90c0253b")
public static String es_PE_FIELD_Allocation_Payment_Name="Pago";

@XendraField(AD_Column_ID="C_Payment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="21a3761b-c615-9afc-eb30-293b90843bdd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3707b564-32eb-db48-bd94-2dbb90c0253b")
public static final String FIELDNAME_Allocation_Payment="3707b564-32eb-db48-bd94-2dbb90c0253b";

@XendraTrl(Identifier="f9d97197-94e2-6988-aa78-30501ddf9bbc")
public static String es_PE_FIELD_Allocation_Payment2_Description="Identificador del pago";

@XendraTrl(Identifier="f9d97197-94e2-6988-aa78-30501ddf9bbc")
public static String es_PE_FIELD_Allocation_Payment2_Help="El pago es un identificador único de este pago.";

@XendraTrl(Identifier="f9d97197-94e2-6988-aa78-30501ddf9bbc")
public static String es_PE_FIELD_Allocation_Payment2_Name="Pago";

@XendraField(AD_Column_ID="C_Payment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="68726b3b-4221-f18d-bea7-018d45967f69",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f9d97197-94e2-6988-aa78-30501ddf9bbc")
public static final String FIELDNAME_Allocation_Payment2="f9d97197-94e2-6988-aa78-30501ddf9bbc";

@XendraTrl(Identifier="94d27aa7-49cf-8cb6-6394-d20a5163736b")
public static String es_PE_FIELD_Allocations_Payment_Description="Identificador del pago";

@XendraTrl(Identifier="94d27aa7-49cf-8cb6-6394-d20a5163736b")
public static String es_PE_FIELD_Allocations_Payment_Help="El pago es un identificador único de este pago.";

@XendraTrl(Identifier="94d27aa7-49cf-8cb6-6394-d20a5163736b")
public static String es_PE_FIELD_Allocations_Payment_Name="Pago";

@XendraField(AD_Column_ID="C_Payment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="105a2788-0a6a-9627-a2d2-c1ec554d5d5b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="94d27aa7-49cf-8cb6-6394-d20a5163736b")
public static final String FIELDNAME_Allocations_Payment="94d27aa7-49cf-8cb6-6394-d20a5163736b";

@XendraTrl(Identifier="d65caf7f-9551-03a7-3bb2-c795a924d223")
public static String es_PE_FIELD_Allocation_Payment3_Description="Identificador del pago";

@XendraTrl(Identifier="d65caf7f-9551-03a7-3bb2-c795a924d223")
public static String es_PE_FIELD_Allocation_Payment3_Help="El pago es un identificador único de este pago.";

@XendraTrl(Identifier="d65caf7f-9551-03a7-3bb2-c795a924d223")
public static String es_PE_FIELD_Allocation_Payment3_Name="Pago";

@XendraField(AD_Column_ID="C_Payment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="66013eee-13e8-e05f-b415-1c5c0fb621d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d65caf7f-9551-03a7-3bb2-c795a924d223")
public static final String FIELDNAME_Allocation_Payment3="d65caf7f-9551-03a7-3bb2-c795a924d223";

@XendraTrl(Identifier="14b3e74b-8b36-e27c-2890-8d0fc1b2c83d")
public static String es_PE_FIELD_Allocation_Payment4_Description="Identificador del pago";

@XendraTrl(Identifier="14b3e74b-8b36-e27c-2890-8d0fc1b2c83d")
public static String es_PE_FIELD_Allocation_Payment4_Help="El pago es un identificador único de este pago.";

@XendraTrl(Identifier="14b3e74b-8b36-e27c-2890-8d0fc1b2c83d")
public static String es_PE_FIELD_Allocation_Payment4_Name="Pago";

@XendraField(AD_Column_ID="C_Payment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="737a0fd5-ca55-3049-7514-9557958093ab",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="14b3e74b-8b36-e27c-2890-8d0fc1b2c83d")
public static final String FIELDNAME_Allocation_Payment4="14b3e74b-8b36-e27c-2890-8d0fc1b2c83d";

@XendraTrl(Identifier="9f65c76d-6d59-0f4e-ad90-2b6510100015")
public static String es_PE_FIELD_Allocation_Payment5_Description="Identificador del pago";

@XendraTrl(Identifier="9f65c76d-6d59-0f4e-ad90-2b6510100015")
public static String es_PE_FIELD_Allocation_Payment5_Help="El pago es un identificador único de este pago.";

@XendraTrl(Identifier="9f65c76d-6d59-0f4e-ad90-2b6510100015")
public static String es_PE_FIELD_Allocation_Payment5_Name="Pago";

@XendraField(AD_Column_ID="C_Payment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7ab5581b-174f-3f33-31cf-9d4d0a5063da",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9f65c76d-6d59-0f4e-ad90-2b6510100015")
public static final String FIELDNAME_Allocation_Payment5="9f65c76d-6d59-0f4e-ad90-2b6510100015";

@XendraTrl(Identifier="385e1f79-d3f8-1275-a083-1989e387ea26")
public static String es_PE_COLUMN_C_Payment_ID_Name="Pago";

@XendraColumn(AD_Element_ID="3ded5658-968e-94c5-207b-eed6f6a7bb43",ColumnName="C_Payment_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="385e1f79-d3f8-1275-a083-1989e387ea26",
Synchronized="2017-08-05 16:53:12.0")
/** Column name C_Payment_ID */
public static final String COLUMNNAME_C_Payment_ID = "C_Payment_ID";
/** Set Payment Line.
@param C_PaymentLine_ID Payment Line */
public void setC_PaymentLine_ID (int C_PaymentLine_ID)
{
if (C_PaymentLine_ID <= 0) set_Value (COLUMNNAME_C_PaymentLine_ID, null);
 else 
set_Value (COLUMNNAME_C_PaymentLine_ID, Integer.valueOf(C_PaymentLine_ID));
}
/** Get Payment Line.
@return Payment Line */
public int getC_PaymentLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_PaymentLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="583fecf9-1765-b459-60fc-21a4f766045c")
public static String es_PE_FIELD_AllocationLine_PaymentLine_Name="Payment Line";

@XendraField(AD_Column_ID="C_PaymentLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cb2c1554-7db3-334c-4545-572eb8d93f8f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="583fecf9-1765-b459-60fc-21a4f766045c")
public static final String FIELDNAME_AllocationLine_PaymentLine="583fecf9-1765-b459-60fc-21a4f766045c";

@XendraTrl(Identifier="19f1974b-d89b-92df-a803-b886763c647d")
public static String es_PE_FIELD_Allocations_PaymentLine_Name="Payment Line";

@XendraField(AD_Column_ID="C_PaymentLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="105a2788-0a6a-9627-a2d2-c1ec554d5d5b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="19f1974b-d89b-92df-a803-b886763c647d")
public static final String FIELDNAME_Allocations_PaymentLine="19f1974b-d89b-92df-a803-b886763c647d";

@XendraTrl(Identifier="f69b4147-06b4-d94b-8a11-75a699e3f1aa")
public static String es_PE_FIELD_Allocation_PaymentLine_Name="Payment Line";

@XendraField(AD_Column_ID="C_PaymentLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7ab5581b-174f-3f33-31cf-9d4d0a5063da",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f69b4147-06b4-d94b-8a11-75a699e3f1aa")
public static final String FIELDNAME_Allocation_PaymentLine="f69b4147-06b4-d94b-8a11-75a699e3f1aa";

@XendraTrl(Identifier="05577d33-e2e2-4de8-0234-0d86ecade932")
public static String es_PE_COLUMN_C_PaymentLine_ID_Name="Payment Line";

@XendraColumn(AD_Element_ID="f8ed50a4-532a-d73d-b707-c831d9af258c",ColumnName="C_PaymentLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="05577d33-e2e2-4de8-0234-0d86ecade932",
Synchronized="2017-08-05 16:53:12.0")
/** Column name C_PaymentLine_ID */
public static final String COLUMNNAME_C_PaymentLine_ID = "C_PaymentLine_ID";
/** Set Project.
@param C_Project_ID Financial Project */
public void setC_Project_ID (int C_Project_ID)
{
if (C_Project_ID <= 0) set_Value (COLUMNNAME_C_Project_ID, null);
 else 
set_Value (COLUMNNAME_C_Project_ID, Integer.valueOf(C_Project_ID));
}
/** Get Project.
@return Financial Project */
public int getC_Project_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Project_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="97161a22-8d61-4a35-a856-9999153c58d0")
public static String es_PE_COLUMN_C_Project_ID_Name="Project";

@XendraColumn(AD_Element_ID="16ff5dcc-9178-73dd-e618-e88bd79d573b",ColumnName="C_Project_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="97161a22-8d61-4a35-a856-9999153c58d0",
Synchronized="2017-08-05 16:53:12.0")
/** Column name C_Project_ID */
public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";
/** Set Transaction Date.
@param DateTrx Transaction Date */
public void setDateTrx (Timestamp DateTrx)
{
set_ValueNoCheck (COLUMNNAME_DateTrx, DateTrx);
}
/** Get Transaction Date.
@return Transaction Date */
public Timestamp getDateTrx() 
{
return (Timestamp)get_Value(COLUMNNAME_DateTrx);
}

@XendraTrl(Identifier="e8280580-5855-54a1-5023-3621a8c936f0")
public static String es_PE_FIELD_AllocationLine_TransactionDate_Description="Fecha de la transacción";

@XendraTrl(Identifier="e8280580-5855-54a1-5023-3621a8c936f0")
public static String es_PE_FIELD_AllocationLine_TransactionDate_Help="La fecha de transacción indica la fecha en que se ejecutó la transacción";

@XendraTrl(Identifier="e8280580-5855-54a1-5023-3621a8c936f0")
public static String es_PE_FIELD_AllocationLine_TransactionDate_Name="Fecha de la Transacción";

@XendraField(AD_Column_ID="DateTrx",IsCentrallyMaintained=true,
AD_Tab_ID="cb2c1554-7db3-334c-4545-572eb8d93f8f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=50,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e8280580-5855-54a1-5023-3621a8c936f0")
public static final String FIELDNAME_AllocationLine_TransactionDate="e8280580-5855-54a1-5023-3621a8c936f0";

@XendraTrl(Identifier="33bf5e9f-127d-f93c-3d1f-6b56a3a22907")
public static String es_PE_FIELD_Allocation_TransactionDate_Description="Fecha de la transacción";

@XendraTrl(Identifier="33bf5e9f-127d-f93c-3d1f-6b56a3a22907")
public static String es_PE_FIELD_Allocation_TransactionDate_Help="La fecha de transacción indica la fecha en que se ejecutó la transacción";

@XendraTrl(Identifier="33bf5e9f-127d-f93c-3d1f-6b56a3a22907")
public static String es_PE_FIELD_Allocation_TransactionDate_Name="Fecha de la Transacción";

@XendraField(AD_Column_ID="DateTrx",IsCentrallyMaintained=true,
AD_Tab_ID="21a3761b-c615-9afc-eb30-293b90843bdd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=50,SortNo=1,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="33bf5e9f-127d-f93c-3d1f-6b56a3a22907")
public static final String FIELDNAME_Allocation_TransactionDate="33bf5e9f-127d-f93c-3d1f-6b56a3a22907";

@XendraTrl(Identifier="3e381b63-09f4-71ce-4abe-85501e371e03")
public static String es_PE_FIELD_Allocation_TransactionDate2_Description="Fecha de la transacción";

@XendraTrl(Identifier="3e381b63-09f4-71ce-4abe-85501e371e03")
public static String es_PE_FIELD_Allocation_TransactionDate2_Help="La fecha de transacción indica la fecha en que se ejecutó la transacción";

@XendraTrl(Identifier="3e381b63-09f4-71ce-4abe-85501e371e03")
public static String es_PE_FIELD_Allocation_TransactionDate2_Name="Fecha de la Transacción";

@XendraField(AD_Column_ID="DateTrx",IsCentrallyMaintained=true,
AD_Tab_ID="68726b3b-4221-f18d-bea7-018d45967f69",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=50,SortNo=1,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3e381b63-09f4-71ce-4abe-85501e371e03")
public static final String FIELDNAME_Allocation_TransactionDate2="3e381b63-09f4-71ce-4abe-85501e371e03";

@XendraTrl(Identifier="9d35c122-e2bc-558f-28d3-7e1fdd1f636d")
public static String es_PE_FIELD_Allocations_TransactionDate_Description="Fecha de la transacción";

@XendraTrl(Identifier="9d35c122-e2bc-558f-28d3-7e1fdd1f636d")
public static String es_PE_FIELD_Allocations_TransactionDate_Help="La fecha de transacción indica la fecha en que se ejecutó la transacción";

@XendraTrl(Identifier="9d35c122-e2bc-558f-28d3-7e1fdd1f636d")
public static String es_PE_FIELD_Allocations_TransactionDate_Name="Fecha de la Transacción";

@XendraField(AD_Column_ID="DateTrx",IsCentrallyMaintained=true,
AD_Tab_ID="105a2788-0a6a-9627-a2d2-c1ec554d5d5b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=50,SortNo=1,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9d35c122-e2bc-558f-28d3-7e1fdd1f636d")
public static final String FIELDNAME_Allocations_TransactionDate="9d35c122-e2bc-558f-28d3-7e1fdd1f636d";

@XendraTrl(Identifier="441dbd2f-7841-7544-7c9f-f1de1550086d")
public static String es_PE_FIELD_Allocation_TransactionDate3_Description="Fecha de la transacción";

@XendraTrl(Identifier="441dbd2f-7841-7544-7c9f-f1de1550086d")
public static String es_PE_FIELD_Allocation_TransactionDate3_Help="La fecha de transacción indica la fecha en que se ejecutó la transacción";

@XendraTrl(Identifier="441dbd2f-7841-7544-7c9f-f1de1550086d")
public static String es_PE_FIELD_Allocation_TransactionDate3_Name="Fecha de la Transacción";

@XendraField(AD_Column_ID="DateTrx",IsCentrallyMaintained=true,
AD_Tab_ID="66013eee-13e8-e05f-b415-1c5c0fb621d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=7,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="441dbd2f-7841-7544-7c9f-f1de1550086d")
public static final String FIELDNAME_Allocation_TransactionDate3="441dbd2f-7841-7544-7c9f-f1de1550086d";

@XendraTrl(Identifier="13f2d44c-258c-4a92-6c0d-e0bc088442d6")
public static String es_PE_FIELD_Allocation_TransactionDate4_Description="Fecha de la transacción";

@XendraTrl(Identifier="13f2d44c-258c-4a92-6c0d-e0bc088442d6")
public static String es_PE_FIELD_Allocation_TransactionDate4_Help="La fecha de transacción indica la fecha en que se ejecutó la transacción";

@XendraTrl(Identifier="13f2d44c-258c-4a92-6c0d-e0bc088442d6")
public static String es_PE_FIELD_Allocation_TransactionDate4_Name="Fecha de la Transacción";

@XendraField(AD_Column_ID="DateTrx",IsCentrallyMaintained=true,
AD_Tab_ID="737a0fd5-ca55-3049-7514-9557958093ab",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=7,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="13f2d44c-258c-4a92-6c0d-e0bc088442d6")
public static final String FIELDNAME_Allocation_TransactionDate4="13f2d44c-258c-4a92-6c0d-e0bc088442d6";

@XendraTrl(Identifier="d5e3886e-f7b4-d4ec-1aab-a5b7894bfdfd")
public static String es_PE_FIELD_Allocation_TransactionDate5_Description="Fecha de la transacción";

@XendraTrl(Identifier="d5e3886e-f7b4-d4ec-1aab-a5b7894bfdfd")
public static String es_PE_FIELD_Allocation_TransactionDate5_Help="La fecha de transacción indica la fecha en que se ejecutó la transacción";

@XendraTrl(Identifier="d5e3886e-f7b4-d4ec-1aab-a5b7894bfdfd")
public static String es_PE_FIELD_Allocation_TransactionDate5_Name="Fecha de la Transacción";

@XendraField(AD_Column_ID="DateTrx",IsCentrallyMaintained=true,
AD_Tab_ID="7ab5581b-174f-3f33-31cf-9d4d0a5063da",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=7,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d5e3886e-f7b4-d4ec-1aab-a5b7894bfdfd")
public static final String FIELDNAME_Allocation_TransactionDate5="d5e3886e-f7b4-d4ec-1aab-a5b7894bfdfd";

@XendraTrl(Identifier="2c2b87cd-5d5d-b41c-155c-be4f6d598d2c")
public static String es_PE_COLUMN_DateTrx_Name="Fecha de la Transacción";

@XendraColumn(AD_Element_ID="3700288f-61dd-2021-b833-cf804ceed1e9",ColumnName="DateTrx",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2c2b87cd-5d5d-b41c-155c-be4f6d598d2c",
Synchronized="2017-08-05 16:53:12.0")
/** Column name DateTrx */
public static final String COLUMNNAME_DateTrx = "DateTrx";
/** Set Discount Amount.
@param DiscountAmt Calculated amount of discount */
public void setDiscountAmt (BigDecimal DiscountAmt)
{
if (DiscountAmt == null) throw new IllegalArgumentException ("DiscountAmt is mandatory.");
set_ValueNoCheck (COLUMNNAME_DiscountAmt, DiscountAmt);
}
/** Get Discount Amount.
@return Calculated amount of discount */
public BigDecimal getDiscountAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_DiscountAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="e112c3a2-4061-6150-3edf-43f485e83110")
public static String es_PE_FIELD_AllocationLine_DiscountAmount_Description="Total de descuento calculado";

@XendraTrl(Identifier="e112c3a2-4061-6150-3edf-43f485e83110")
public static String es_PE_FIELD_AllocationLine_DiscountAmount_Help="El Total descuento indica el total de descuento para un documento ó línea";

@XendraTrl(Identifier="e112c3a2-4061-6150-3edf-43f485e83110")
public static String es_PE_FIELD_AllocationLine_DiscountAmount_Name="Total del Descuento";

@XendraField(AD_Column_ID="DiscountAmt",IsCentrallyMaintained=true,
AD_Tab_ID="cb2c1554-7db3-334c-4545-572eb8d93f8f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e112c3a2-4061-6150-3edf-43f485e83110")
public static final String FIELDNAME_AllocationLine_DiscountAmount="e112c3a2-4061-6150-3edf-43f485e83110";

@XendraTrl(Identifier="34cb9627-5c97-845e-285e-9e80f3a95589")
public static String es_PE_FIELD_Allocation_DiscountAmount_Description="Total de descuento calculado";

@XendraTrl(Identifier="34cb9627-5c97-845e-285e-9e80f3a95589")
public static String es_PE_FIELD_Allocation_DiscountAmount_Help="El Total descuento indica el total de descuento para un documento ó línea";

@XendraTrl(Identifier="34cb9627-5c97-845e-285e-9e80f3a95589")
public static String es_PE_FIELD_Allocation_DiscountAmount_Name="Total del Descuento";

@XendraField(AD_Column_ID="DiscountAmt",IsCentrallyMaintained=true,
AD_Tab_ID="21a3761b-c615-9afc-eb30-293b90843bdd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="34cb9627-5c97-845e-285e-9e80f3a95589")
public static final String FIELDNAME_Allocation_DiscountAmount="34cb9627-5c97-845e-285e-9e80f3a95589";

@XendraTrl(Identifier="8bc41602-6cdf-5e17-15d8-842a242cc1c2")
public static String es_PE_FIELD_Allocation_DiscountAmount2_Description="Total de descuento calculado";

@XendraTrl(Identifier="8bc41602-6cdf-5e17-15d8-842a242cc1c2")
public static String es_PE_FIELD_Allocation_DiscountAmount2_Help="El Total descuento indica el total de descuento para un documento ó línea";

@XendraTrl(Identifier="8bc41602-6cdf-5e17-15d8-842a242cc1c2")
public static String es_PE_FIELD_Allocation_DiscountAmount2_Name="Total del Descuento";

@XendraField(AD_Column_ID="DiscountAmt",IsCentrallyMaintained=true,
AD_Tab_ID="68726b3b-4221-f18d-bea7-018d45967f69",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8bc41602-6cdf-5e17-15d8-842a242cc1c2")
public static final String FIELDNAME_Allocation_DiscountAmount2="8bc41602-6cdf-5e17-15d8-842a242cc1c2";

@XendraTrl(Identifier="5bb6f70f-cce7-7c38-8efc-da5bb2a1aaa2")
public static String es_PE_FIELD_Allocations_DiscountAmount_Description="Total de descuento calculado";

@XendraTrl(Identifier="5bb6f70f-cce7-7c38-8efc-da5bb2a1aaa2")
public static String es_PE_FIELD_Allocations_DiscountAmount_Help="El Total descuento indica el total de descuento para un documento ó línea";

@XendraTrl(Identifier="5bb6f70f-cce7-7c38-8efc-da5bb2a1aaa2")
public static String es_PE_FIELD_Allocations_DiscountAmount_Name="Total del Descuento";

@XendraField(AD_Column_ID="DiscountAmt",IsCentrallyMaintained=true,
AD_Tab_ID="105a2788-0a6a-9627-a2d2-c1ec554d5d5b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5bb6f70f-cce7-7c38-8efc-da5bb2a1aaa2")
public static final String FIELDNAME_Allocations_DiscountAmount="5bb6f70f-cce7-7c38-8efc-da5bb2a1aaa2";

@XendraTrl(Identifier="c544c484-e855-9114-890c-5b9184fb4f0d")
public static String es_PE_FIELD_Allocation_DiscountAmount3_Description="Total de descuento calculado";

@XendraTrl(Identifier="c544c484-e855-9114-890c-5b9184fb4f0d")
public static String es_PE_FIELD_Allocation_DiscountAmount3_Help="El Total descuento indica el total de descuento para un documento ó línea";

@XendraTrl(Identifier="c544c484-e855-9114-890c-5b9184fb4f0d")
public static String es_PE_FIELD_Allocation_DiscountAmount3_Name="Total del Descuento";

@XendraField(AD_Column_ID="DiscountAmt",IsCentrallyMaintained=true,
AD_Tab_ID="66013eee-13e8-e05f-b415-1c5c0fb621d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c544c484-e855-9114-890c-5b9184fb4f0d")
public static final String FIELDNAME_Allocation_DiscountAmount3="c544c484-e855-9114-890c-5b9184fb4f0d";

@XendraTrl(Identifier="f785ff95-f842-fe18-0430-2f8fd883cd87")
public static String es_PE_FIELD_Allocation_DiscountAmount4_Description="Total de descuento calculado";

@XendraTrl(Identifier="f785ff95-f842-fe18-0430-2f8fd883cd87")
public static String es_PE_FIELD_Allocation_DiscountAmount4_Help="El Total descuento indica el total de descuento para un documento ó línea";

@XendraTrl(Identifier="f785ff95-f842-fe18-0430-2f8fd883cd87")
public static String es_PE_FIELD_Allocation_DiscountAmount4_Name="Total del Descuento";

@XendraField(AD_Column_ID="DiscountAmt",IsCentrallyMaintained=true,
AD_Tab_ID="737a0fd5-ca55-3049-7514-9557958093ab",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f785ff95-f842-fe18-0430-2f8fd883cd87")
public static final String FIELDNAME_Allocation_DiscountAmount4="f785ff95-f842-fe18-0430-2f8fd883cd87";

@XendraTrl(Identifier="feb9d1e6-355c-a57b-f3a3-0e21ccd143e8")
public static String es_PE_FIELD_Allocation_DiscountAmount5_Description="Total de descuento calculado";

@XendraTrl(Identifier="feb9d1e6-355c-a57b-f3a3-0e21ccd143e8")
public static String es_PE_FIELD_Allocation_DiscountAmount5_Help="El Total descuento indica el total de descuento para un documento ó línea";

@XendraTrl(Identifier="feb9d1e6-355c-a57b-f3a3-0e21ccd143e8")
public static String es_PE_FIELD_Allocation_DiscountAmount5_Name="Total del Descuento";

@XendraField(AD_Column_ID="DiscountAmt",IsCentrallyMaintained=true,
AD_Tab_ID="7ab5581b-174f-3f33-31cf-9d4d0a5063da",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="feb9d1e6-355c-a57b-f3a3-0e21ccd143e8")
public static final String FIELDNAME_Allocation_DiscountAmount5="feb9d1e6-355c-a57b-f3a3-0e21ccd143e8";

@XendraTrl(Identifier="3dd26bec-f915-5215-16ac-59926f6a690d")
public static String es_PE_COLUMN_DiscountAmt_Name="Total del Descuento";

@XendraColumn(AD_Element_ID="351290a4-6d07-13cb-9132-459358217d86",ColumnName="DiscountAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3dd26bec-f915-5215-16ac-59926f6a690d",
Synchronized="2017-08-05 16:53:12.0")
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

@XendraTrl(Identifier="d1a43e9b-50b9-44ef-7997-256b1b7a6d30")
public static String es_PE_FIELD_AllocationLine_JournalLine_Description="Línea de la póliza";

@XendraTrl(Identifier="d1a43e9b-50b9-44ef-7997-256b1b7a6d30")
public static String es_PE_FIELD_AllocationLine_JournalLine_Help="La línea de póliza de la contabilidad general identifica una transacción simple en una póliza.";

@XendraTrl(Identifier="d1a43e9b-50b9-44ef-7997-256b1b7a6d30")
public static String es_PE_FIELD_AllocationLine_JournalLine_Name="Línea de Póliza";

@XendraField(AD_Column_ID="GL_JournalLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cb2c1554-7db3-334c-4545-572eb8d93f8f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d1a43e9b-50b9-44ef-7997-256b1b7a6d30")
public static final String FIELDNAME_AllocationLine_JournalLine="d1a43e9b-50b9-44ef-7997-256b1b7a6d30";

@XendraTrl(Identifier="bf74cf55-3947-1d48-4a81-1e9284c8c14b")
public static String es_PE_FIELD_Allocations_JournalLine_Description="Línea de la póliza";

@XendraTrl(Identifier="bf74cf55-3947-1d48-4a81-1e9284c8c14b")
public static String es_PE_FIELD_Allocations_JournalLine_Help="La línea de póliza de la contabilidad general identifica una transacción simple en una póliza.";

@XendraTrl(Identifier="bf74cf55-3947-1d48-4a81-1e9284c8c14b")
public static String es_PE_FIELD_Allocations_JournalLine_Name="Línea de Póliza";

@XendraField(AD_Column_ID="GL_JournalLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="105a2788-0a6a-9627-a2d2-c1ec554d5d5b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bf74cf55-3947-1d48-4a81-1e9284c8c14b")
public static final String FIELDNAME_Allocations_JournalLine="bf74cf55-3947-1d48-4a81-1e9284c8c14b";

@XendraTrl(Identifier="bb267b8d-c61d-e74d-801d-fdb1a877e2f6")
public static String es_PE_FIELD_Allocation_JournalLine_Description="Línea de la póliza";

@XendraTrl(Identifier="bb267b8d-c61d-e74d-801d-fdb1a877e2f6")
public static String es_PE_FIELD_Allocation_JournalLine_Help="La línea de póliza de la contabilidad general identifica una transacción simple en una póliza.";

@XendraTrl(Identifier="bb267b8d-c61d-e74d-801d-fdb1a877e2f6")
public static String es_PE_FIELD_Allocation_JournalLine_Name="Línea de Póliza";

@XendraField(AD_Column_ID="GL_JournalLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7ab5581b-174f-3f33-31cf-9d4d0a5063da",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bb267b8d-c61d-e74d-801d-fdb1a877e2f6")
public static final String FIELDNAME_Allocation_JournalLine="bb267b8d-c61d-e74d-801d-fdb1a877e2f6";

@XendraTrl(Identifier="61bccad3-97a2-a25f-556e-2fe047d9c213")
public static String es_PE_COLUMN_GL_JournalLine_ID_Name="Journal Line";

@XendraColumn(AD_Element_ID="c9aa03ab-1fd1-d7fb-3974-8468533ee479",ColumnName="GL_JournalLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="61bccad3-97a2-a25f-556e-2fe047d9c213",
Synchronized="2017-08-05 16:53:12.0")
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
@XendraTrl(Identifier="e2368c66-2003-4d0d-bfa0-bb1f2b998663")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e2368c66-2003-4d0d-bfa0-bb1f2b998663",
Synchronized="2017-08-05 16:53:12.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Manual.
@param IsManual This is a manual process */
public void setIsManual (boolean IsManual)
{
set_ValueNoCheck (COLUMNNAME_IsManual, Boolean.valueOf(IsManual));
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

@XendraTrl(Identifier="adac4e3e-841d-015c-9d8f-f0f5a8092ba3")
public static String es_PE_FIELD_AllocationLine_Manual_Description="Éste es un proceso manual.";

@XendraTrl(Identifier="adac4e3e-841d-015c-9d8f-f0f5a8092ba3")
public static String es_PE_FIELD_AllocationLine_Manual_Help="El cuadro de verificación manual indica si el proceso será hecho manualmente.";

@XendraTrl(Identifier="adac4e3e-841d-015c-9d8f-f0f5a8092ba3")
public static String es_PE_FIELD_AllocationLine_Manual_Name="Manual";

@XendraField(AD_Column_ID="IsManual",IsCentrallyMaintained=true,
AD_Tab_ID="cb2c1554-7db3-334c-4545-572eb8d93f8f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="adac4e3e-841d-015c-9d8f-f0f5a8092ba3")
public static final String FIELDNAME_AllocationLine_Manual="adac4e3e-841d-015c-9d8f-f0f5a8092ba3";

@XendraTrl(Identifier="07770ac9-55e2-c198-8bf7-8f4546c82322")
public static String es_PE_FIELD_Allocation_Manual_Description="Éste es un proceso manual.";

@XendraTrl(Identifier="07770ac9-55e2-c198-8bf7-8f4546c82322")
public static String es_PE_FIELD_Allocation_Manual_Help="El cuadro de verificación manual indica si el proceso será hecho manualmente.";

@XendraTrl(Identifier="07770ac9-55e2-c198-8bf7-8f4546c82322")
public static String es_PE_FIELD_Allocation_Manual_Name="Manual";

@XendraField(AD_Column_ID="IsManual",IsCentrallyMaintained=true,
AD_Tab_ID="21a3761b-c615-9afc-eb30-293b90843bdd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="07770ac9-55e2-c198-8bf7-8f4546c82322")
public static final String FIELDNAME_Allocation_Manual="07770ac9-55e2-c198-8bf7-8f4546c82322";

@XendraTrl(Identifier="ab278b5b-6441-bfbf-62d5-1706bb460b2c")
public static String es_PE_FIELD_Allocation_Manual2_Description="Éste es un proceso manual.";

@XendraTrl(Identifier="ab278b5b-6441-bfbf-62d5-1706bb460b2c")
public static String es_PE_FIELD_Allocation_Manual2_Help="El cuadro de verificación manual indica si el proceso será hecho manualmente.";

@XendraTrl(Identifier="ab278b5b-6441-bfbf-62d5-1706bb460b2c")
public static String es_PE_FIELD_Allocation_Manual2_Name="Manual";

@XendraField(AD_Column_ID="IsManual",IsCentrallyMaintained=true,
AD_Tab_ID="68726b3b-4221-f18d-bea7-018d45967f69",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ab278b5b-6441-bfbf-62d5-1706bb460b2c")
public static final String FIELDNAME_Allocation_Manual2="ab278b5b-6441-bfbf-62d5-1706bb460b2c";

@XendraTrl(Identifier="847031fc-e631-6459-acb1-57f4418b0f25")
public static String es_PE_FIELD_Allocations_Manual_Description="Éste es un proceso manual.";

@XendraTrl(Identifier="847031fc-e631-6459-acb1-57f4418b0f25")
public static String es_PE_FIELD_Allocations_Manual_Help="El cuadro de verificación manual indica si el proceso será hecho manualmente.";

@XendraTrl(Identifier="847031fc-e631-6459-acb1-57f4418b0f25")
public static String es_PE_FIELD_Allocations_Manual_Name="Manual";

@XendraField(AD_Column_ID="IsManual",IsCentrallyMaintained=true,
AD_Tab_ID="105a2788-0a6a-9627-a2d2-c1ec554d5d5b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="847031fc-e631-6459-acb1-57f4418b0f25")
public static final String FIELDNAME_Allocations_Manual="847031fc-e631-6459-acb1-57f4418b0f25";

@XendraTrl(Identifier="70f69aac-7313-0723-8ba6-cec385d8b515")
public static String es_PE_FIELD_Allocation_Manual3_Description="Éste es un proceso manual.";

@XendraTrl(Identifier="70f69aac-7313-0723-8ba6-cec385d8b515")
public static String es_PE_FIELD_Allocation_Manual3_Help="El cuadro de verificación manual indica si el proceso será hecho manualmente.";

@XendraTrl(Identifier="70f69aac-7313-0723-8ba6-cec385d8b515")
public static String es_PE_FIELD_Allocation_Manual3_Name="Manual";

@XendraField(AD_Column_ID="IsManual",IsCentrallyMaintained=true,
AD_Tab_ID="66013eee-13e8-e05f-b415-1c5c0fb621d8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="70f69aac-7313-0723-8ba6-cec385d8b515")
public static final String FIELDNAME_Allocation_Manual3="70f69aac-7313-0723-8ba6-cec385d8b515";

@XendraTrl(Identifier="8edc22c7-2432-085d-cb01-4649ae579684")
public static String es_PE_FIELD_Allocation_Manual4_Description="Éste es un proceso manual.";

@XendraTrl(Identifier="8edc22c7-2432-085d-cb01-4649ae579684")
public static String es_PE_FIELD_Allocation_Manual4_Help="El cuadro de verificación manual indica si el proceso será hecho manualmente.";

@XendraTrl(Identifier="8edc22c7-2432-085d-cb01-4649ae579684")
public static String es_PE_FIELD_Allocation_Manual4_Name="Manual";

@XendraField(AD_Column_ID="IsManual",IsCentrallyMaintained=true,
AD_Tab_ID="737a0fd5-ca55-3049-7514-9557958093ab",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8edc22c7-2432-085d-cb01-4649ae579684")
public static final String FIELDNAME_Allocation_Manual4="8edc22c7-2432-085d-cb01-4649ae579684";

@XendraTrl(Identifier="e39a345d-25a9-aa0c-23ad-47f0163be4ae")
public static String es_PE_FIELD_Allocation_Manual5_Description="Éste es un proceso manual.";

@XendraTrl(Identifier="e39a345d-25a9-aa0c-23ad-47f0163be4ae")
public static String es_PE_FIELD_Allocation_Manual5_Help="El cuadro de verificación manual indica si el proceso será hecho manualmente.";

@XendraTrl(Identifier="e39a345d-25a9-aa0c-23ad-47f0163be4ae")
public static String es_PE_FIELD_Allocation_Manual5_Name="Manual";

@XendraField(AD_Column_ID="IsManual",IsCentrallyMaintained=true,
AD_Tab_ID="7ab5581b-174f-3f33-31cf-9d4d0a5063da",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e39a345d-25a9-aa0c-23ad-47f0163be4ae")
public static final String FIELDNAME_Allocation_Manual5="e39a345d-25a9-aa0c-23ad-47f0163be4ae";

@XendraTrl(Identifier="98c6a6a6-a601-9d62-7bfd-c63becaae9d7")
public static String es_PE_COLUMN_IsManual_Name="Manual";

@XendraColumn(AD_Element_ID="064afee2-bc1c-12d9-20dc-97a2318dc359",ColumnName="IsManual",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="98c6a6a6-a601-9d62-7bfd-c63becaae9d7",
Synchronized="2017-08-05 16:53:12.0")
/** Column name IsManual */
public static final String COLUMNNAME_IsManual = "IsManual";
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

@XendraTrl(Identifier="4eccc594-d8dc-2cb8-2205-4c8a6b43bc56")
public static String es_PE_FIELD_AllocationLine_OverUnderPayment_Description="Total de sobre pago (no contabilizado) ó sub pago (pago parcial)";

@XendraTrl(Identifier="4eccc594-d8dc-2cb8-2205-4c8a6b43bc56")
public static String es_PE_FIELD_AllocationLine_OverUnderPayment_Help="Sobre pagos (negativos) son totales no contabilizados y permiten recibir dinero por totales superiores a una factura particular. Sub pagos (positivo) es un pago parcial de una factura. No se saca de libros la cantidad no pagada.";

@XendraTrl(Identifier="4eccc594-d8dc-2cb8-2205-4c8a6b43bc56")
public static String es_PE_FIELD_AllocationLine_OverUnderPayment_Name="Totales con sobre/sub pago";

@XendraField(AD_Column_ID="OverUnderAmt",IsCentrallyMaintained=true,
AD_Tab_ID="cb2c1554-7db3-334c-4545-572eb8d93f8f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4eccc594-d8dc-2cb8-2205-4c8a6b43bc56")
public static final String FIELDNAME_AllocationLine_OverUnderPayment="4eccc594-d8dc-2cb8-2205-4c8a6b43bc56";

@XendraTrl(Identifier="43c01510-a98a-7bd7-ed3e-996455d24b2a")
public static String es_PE_FIELD_Allocation_OverUnderPayment_Description="Total de sobre pago (no contabilizado) ó sub pago (pago parcial)";

@XendraTrl(Identifier="43c01510-a98a-7bd7-ed3e-996455d24b2a")
public static String es_PE_FIELD_Allocation_OverUnderPayment_Help="Sobre pagos (negativos) son totales no contabilizados y permiten recibir dinero por totales superiores a una factura particular. Sub pagos (positivo) es un pago parcial de una factura. No se saca de libros la cantidad no pagada.";

@XendraTrl(Identifier="43c01510-a98a-7bd7-ed3e-996455d24b2a")
public static String es_PE_FIELD_Allocation_OverUnderPayment_Name="Totales con sobre/sub pago";

@XendraField(AD_Column_ID="OverUnderAmt",IsCentrallyMaintained=true,
AD_Tab_ID="21a3761b-c615-9afc-eb30-293b90843bdd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="43c01510-a98a-7bd7-ed3e-996455d24b2a")
public static final String FIELDNAME_Allocation_OverUnderPayment="43c01510-a98a-7bd7-ed3e-996455d24b2a";

@XendraTrl(Identifier="01587796-67e9-2b77-6ebd-8be574f8e252")
public static String es_PE_FIELD_Allocation_OverUnderPayment2_Description="Total de sobre pago (no contabilizado) ó sub pago (pago parcial)";

@XendraTrl(Identifier="01587796-67e9-2b77-6ebd-8be574f8e252")
public static String es_PE_FIELD_Allocation_OverUnderPayment2_Help="Sobre pagos (negativos) son totales no contabilizados y permiten recibir dinero por totales superiores a una factura particular. Sub pagos (positivo) es un pago parcial de una factura. No se saca de libros la cantidad no pagada.";

@XendraTrl(Identifier="01587796-67e9-2b77-6ebd-8be574f8e252")
public static String es_PE_FIELD_Allocation_OverUnderPayment2_Name="Totales con sobre/sub pago";

@XendraField(AD_Column_ID="OverUnderAmt",IsCentrallyMaintained=true,
AD_Tab_ID="68726b3b-4221-f18d-bea7-018d45967f69",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="01587796-67e9-2b77-6ebd-8be574f8e252")
public static final String FIELDNAME_Allocation_OverUnderPayment2="01587796-67e9-2b77-6ebd-8be574f8e252";

@XendraTrl(Identifier="a25211c7-5f49-5f9a-1888-294b0b8a563c")
public static String es_PE_FIELD_Allocations_OverUnderPayment_Description="Total de sobre pago (no contabilizado) ó sub pago (pago parcial)";

@XendraTrl(Identifier="a25211c7-5f49-5f9a-1888-294b0b8a563c")
public static String es_PE_FIELD_Allocations_OverUnderPayment_Help="Sobre pagos (negativos) son totales no contabilizados y permiten recibir dinero por totales superiores a una factura particular. Sub pagos (positivo) es un pago parcial de una factura. No se saca de libros la cantidad no pagada.";

@XendraTrl(Identifier="a25211c7-5f49-5f9a-1888-294b0b8a563c")
public static String es_PE_FIELD_Allocations_OverUnderPayment_Name="Totales con sobre/sub pago";

@XendraField(AD_Column_ID="OverUnderAmt",IsCentrallyMaintained=true,
AD_Tab_ID="105a2788-0a6a-9627-a2d2-c1ec554d5d5b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a25211c7-5f49-5f9a-1888-294b0b8a563c")
public static final String FIELDNAME_Allocations_OverUnderPayment="a25211c7-5f49-5f9a-1888-294b0b8a563c";

@XendraTrl(Identifier="f038ae70-cd04-815c-c20b-0f20af76da3a")
public static String es_PE_FIELD_Allocation_OverUnderPayment3_Description="Total de sobre pago (no contabilizado) ó sub pago (pago parcial)";

@XendraTrl(Identifier="f038ae70-cd04-815c-c20b-0f20af76da3a")
public static String es_PE_FIELD_Allocation_OverUnderPayment3_Help="Sobre pagos (negativos) son totales no contabilizados y permiten recibir dinero por totales superiores a una factura particular. Sub pagos (positivo) es un pago parcial de una factura. No se saca de libros la cantidad no pagada.";

@XendraTrl(Identifier="f038ae70-cd04-815c-c20b-0f20af76da3a")
public static String es_PE_FIELD_Allocation_OverUnderPayment3_Name="Totales con sobre/sub pago";

@XendraField(AD_Column_ID="OverUnderAmt",IsCentrallyMaintained=true,
AD_Tab_ID="66013eee-13e8-e05f-b415-1c5c0fb621d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f038ae70-cd04-815c-c20b-0f20af76da3a")
public static final String FIELDNAME_Allocation_OverUnderPayment3="f038ae70-cd04-815c-c20b-0f20af76da3a";

@XendraTrl(Identifier="918a0991-874a-57f8-68b6-47fed2b799f5")
public static String es_PE_FIELD_Allocation_OverUnderPayment4_Description="Total de sobre pago (no contabilizado) ó sub pago (pago parcial)";

@XendraTrl(Identifier="918a0991-874a-57f8-68b6-47fed2b799f5")
public static String es_PE_FIELD_Allocation_OverUnderPayment4_Help="Sobre pagos (negativos) son totales no contabilizados y permiten recibir dinero por totales superiores a una factura particular. Sub pagos (positivo) es un pago parcial de una factura. No se saca de libros la cantidad no pagada.";

@XendraTrl(Identifier="918a0991-874a-57f8-68b6-47fed2b799f5")
public static String es_PE_FIELD_Allocation_OverUnderPayment4_Name="Totales con sobre/sub pago";

@XendraField(AD_Column_ID="OverUnderAmt",IsCentrallyMaintained=true,
AD_Tab_ID="737a0fd5-ca55-3049-7514-9557958093ab",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="918a0991-874a-57f8-68b6-47fed2b799f5")
public static final String FIELDNAME_Allocation_OverUnderPayment4="918a0991-874a-57f8-68b6-47fed2b799f5";

@XendraTrl(Identifier="504635c4-49fd-5148-73ed-df7a245d5502")
public static String es_PE_FIELD_Allocation_OverUnderPayment5_Description="Total de sobre pago (no contabilizado) ó sub pago (pago parcial)";

@XendraTrl(Identifier="504635c4-49fd-5148-73ed-df7a245d5502")
public static String es_PE_FIELD_Allocation_OverUnderPayment5_Help="Sobre pagos (negativos) son totales no contabilizados y permiten recibir dinero por totales superiores a una factura particular. Sub pagos (positivo) es un pago parcial de una factura. No se saca de libros la cantidad no pagada.";

@XendraTrl(Identifier="504635c4-49fd-5148-73ed-df7a245d5502")
public static String es_PE_FIELD_Allocation_OverUnderPayment5_Name="Totales con sobre/sub pago";

@XendraField(AD_Column_ID="OverUnderAmt",IsCentrallyMaintained=true,
AD_Tab_ID="7ab5581b-174f-3f33-31cf-9d4d0a5063da",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="504635c4-49fd-5148-73ed-df7a245d5502")
public static final String FIELDNAME_Allocation_OverUnderPayment5="504635c4-49fd-5148-73ed-df7a245d5502";

@XendraTrl(Identifier="3a91955f-8ce3-785b-d812-c83bac4a3368")
public static String es_PE_COLUMN_OverUnderAmt_Name="Totales con sobre/sub pago";

@XendraColumn(AD_Element_ID="c1b8d715-3799-d069-9abd-dcbda10d4c2a",ColumnName="OverUnderAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3a91955f-8ce3-785b-d812-c83bac4a3368",
Synchronized="2017-08-05 16:53:12.0")
/** Column name OverUnderAmt */
public static final String COLUMNNAME_OverUnderAmt = "OverUnderAmt";
/** Set Posted.
@param Posted Posting status */
public void setPosted (boolean Posted)
{
set_Value (COLUMNNAME_Posted, Boolean.valueOf(Posted));
}
/** Get Posted.
@return Posting status */
public boolean isPosted() 
{
Object oo = get_Value(COLUMNNAME_Posted);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="86e82b41-bbdf-a521-347b-60a42baa387a")
public static String es_PE_FIELD_AllocationLine_Posted_Description="Las transacciones de contabilidad general han sido procesadas.";

@XendraTrl(Identifier="86e82b41-bbdf-a521-347b-60a42baa387a")
public static String es_PE_FIELD_AllocationLine_Posted_Help="El campo fijado indica el estado de la generación de las Líneas contables a la contabilidad general.";

@XendraTrl(Identifier="86e82b41-bbdf-a521-347b-60a42baa387a")
public static String es_PE_FIELD_AllocationLine_Posted_Name="Fijada";

@XendraField(AD_Column_ID="Posted",IsCentrallyMaintained=true,
AD_Tab_ID="cb2c1554-7db3-334c-4545-572eb8d93f8f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="86e82b41-bbdf-a521-347b-60a42baa387a")
public static final String FIELDNAME_AllocationLine_Posted="86e82b41-bbdf-a521-347b-60a42baa387a";

@XendraTrl(Identifier="8b956f69-c189-fa25-ff74-61489ba391fd")
public static String es_PE_FIELD_Allocations_Posted_Description="Las transacciones de contabilidad general han sido procesadas.";

@XendraTrl(Identifier="8b956f69-c189-fa25-ff74-61489ba391fd")
public static String es_PE_FIELD_Allocations_Posted_Help="El campo fijado indica el estado de la generación de las Líneas contables a la contabilidad general.";

@XendraTrl(Identifier="8b956f69-c189-fa25-ff74-61489ba391fd")
public static String es_PE_FIELD_Allocations_Posted_Name="Fijada";

@XendraField(AD_Column_ID="Posted",IsCentrallyMaintained=true,
AD_Tab_ID="105a2788-0a6a-9627-a2d2-c1ec554d5d5b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8b956f69-c189-fa25-ff74-61489ba391fd")
public static final String FIELDNAME_Allocations_Posted="8b956f69-c189-fa25-ff74-61489ba391fd";

@XendraTrl(Identifier="778a1756-cc5b-3db1-7ef5-1077f30bf9b3")
public static String es_PE_FIELD_Allocation_Posted_Description="Las transacciones de contabilidad general han sido procesadas.";

@XendraTrl(Identifier="778a1756-cc5b-3db1-7ef5-1077f30bf9b3")
public static String es_PE_FIELD_Allocation_Posted_Help="El campo fijado indica el estado de la generación de las Líneas contables a la contabilidad general.";

@XendraTrl(Identifier="778a1756-cc5b-3db1-7ef5-1077f30bf9b3")
public static String es_PE_FIELD_Allocation_Posted_Name="Fijada";

@XendraField(AD_Column_ID="Posted",IsCentrallyMaintained=true,
AD_Tab_ID="66013eee-13e8-e05f-b415-1c5c0fb621d8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="778a1756-cc5b-3db1-7ef5-1077f30bf9b3")
public static final String FIELDNAME_Allocation_Posted="778a1756-cc5b-3db1-7ef5-1077f30bf9b3";

@XendraTrl(Identifier="32b063db-6263-c32f-4387-6a7753176809")
public static String es_PE_FIELD_Allocation_Posted2_Description="Las transacciones de contabilidad general han sido procesadas.";

@XendraTrl(Identifier="32b063db-6263-c32f-4387-6a7753176809")
public static String es_PE_FIELD_Allocation_Posted2_Help="El campo fijado indica el estado de la generación de las Líneas contables a la contabilidad general.";

@XendraTrl(Identifier="32b063db-6263-c32f-4387-6a7753176809")
public static String es_PE_FIELD_Allocation_Posted2_Name="Fijada";

@XendraField(AD_Column_ID="Posted",IsCentrallyMaintained=true,
AD_Tab_ID="737a0fd5-ca55-3049-7514-9557958093ab",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="32b063db-6263-c32f-4387-6a7753176809")
public static final String FIELDNAME_Allocation_Posted2="32b063db-6263-c32f-4387-6a7753176809";

@XendraTrl(Identifier="d9a49481-1938-51ed-7e73-8e9637faa5eb")
public static String es_PE_FIELD_Allocation_Posted3_Description="Las transacciones de contabilidad general han sido procesadas.";

@XendraTrl(Identifier="d9a49481-1938-51ed-7e73-8e9637faa5eb")
public static String es_PE_FIELD_Allocation_Posted3_Help="El campo fijado indica el estado de la generación de las Líneas contables a la contabilidad general.";

@XendraTrl(Identifier="d9a49481-1938-51ed-7e73-8e9637faa5eb")
public static String es_PE_FIELD_Allocation_Posted3_Name="Fijada";

@XendraField(AD_Column_ID="Posted",IsCentrallyMaintained=true,
AD_Tab_ID="7ab5581b-174f-3f33-31cf-9d4d0a5063da",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d9a49481-1938-51ed-7e73-8e9637faa5eb")
public static final String FIELDNAME_Allocation_Posted3="d9a49481-1938-51ed-7e73-8e9637faa5eb";

@XendraTrl(Identifier="299ab5a3-8297-99d6-d8e1-4dd3a8803590")
public static String es_PE_COLUMN_Posted_Name="Posted";

@XendraColumn(AD_Element_ID="5eb52ebc-6992-12f5-b85a-e0a136df259b",ColumnName="Posted",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="299ab5a3-8297-99d6-d8e1-4dd3a8803590",
Synchronized="2017-08-05 16:53:12.0")
/** Column name Posted */
public static final String COLUMNNAME_Posted = "Posted";
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

@XendraTrl(Identifier="b1f05206-12ca-067d-b6d2-82e5b85de2bd")
public static String es_PE_FIELD_AllocationLine_RecordID_Description="Identificador de registro interno";

@XendraTrl(Identifier="b1f05206-12ca-067d-b6d2-82e5b85de2bd")
public static String es_PE_FIELD_AllocationLine_RecordID_Help="La ID de registro es el identificador único interno de un registro.";

@XendraTrl(Identifier="b1f05206-12ca-067d-b6d2-82e5b85de2bd")
public static String es_PE_FIELD_AllocationLine_RecordID_Name="ID de Registro";

@XendraField(AD_Column_ID="Record_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cb2c1554-7db3-334c-4545-572eb8d93f8f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b1f05206-12ca-067d-b6d2-82e5b85de2bd")
public static final String FIELDNAME_AllocationLine_RecordID="b1f05206-12ca-067d-b6d2-82e5b85de2bd";

@XendraTrl(Identifier="73b21039-b422-b69d-468c-7df2c5488206")
public static String es_PE_FIELD_Allocations_RecordID_Description="Identificador de registro interno";

@XendraTrl(Identifier="73b21039-b422-b69d-468c-7df2c5488206")
public static String es_PE_FIELD_Allocations_RecordID_Help="La ID de registro es el identificador único interno de un registro.";

@XendraTrl(Identifier="73b21039-b422-b69d-468c-7df2c5488206")
public static String es_PE_FIELD_Allocations_RecordID_Name="ID de Registro";

@XendraField(AD_Column_ID="Record_ID",IsCentrallyMaintained=true,
AD_Tab_ID="105a2788-0a6a-9627-a2d2-c1ec554d5d5b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="73b21039-b422-b69d-468c-7df2c5488206")
public static final String FIELDNAME_Allocations_RecordID="73b21039-b422-b69d-468c-7df2c5488206";

@XendraTrl(Identifier="6dcf85f3-deb5-ae65-2c9c-05e8d2583fdd")
public static String es_PE_FIELD_Allocation_RecordID_Description="Identificador de registro interno";

@XendraTrl(Identifier="6dcf85f3-deb5-ae65-2c9c-05e8d2583fdd")
public static String es_PE_FIELD_Allocation_RecordID_Help="La ID de registro es el identificador único interno de un registro.";

@XendraTrl(Identifier="6dcf85f3-deb5-ae65-2c9c-05e8d2583fdd")
public static String es_PE_FIELD_Allocation_RecordID_Name="ID de Registro";

@XendraField(AD_Column_ID="Record_ID",IsCentrallyMaintained=true,
AD_Tab_ID="66013eee-13e8-e05f-b415-1c5c0fb621d8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6dcf85f3-deb5-ae65-2c9c-05e8d2583fdd")
public static final String FIELDNAME_Allocation_RecordID="6dcf85f3-deb5-ae65-2c9c-05e8d2583fdd";

@XendraTrl(Identifier="ee5091b6-7588-f57a-05ac-6e5de22a13a5")
public static String es_PE_FIELD_Allocation_RecordID2_Description="Identificador de registro interno";

@XendraTrl(Identifier="ee5091b6-7588-f57a-05ac-6e5de22a13a5")
public static String es_PE_FIELD_Allocation_RecordID2_Help="La ID de registro es el identificador único interno de un registro.";

@XendraTrl(Identifier="ee5091b6-7588-f57a-05ac-6e5de22a13a5")
public static String es_PE_FIELD_Allocation_RecordID2_Name="ID de Registro";

@XendraField(AD_Column_ID="Record_ID",IsCentrallyMaintained=true,
AD_Tab_ID="737a0fd5-ca55-3049-7514-9557958093ab",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ee5091b6-7588-f57a-05ac-6e5de22a13a5")
public static final String FIELDNAME_Allocation_RecordID2="ee5091b6-7588-f57a-05ac-6e5de22a13a5";

@XendraTrl(Identifier="8a3b8f09-8a45-00eb-638a-330c566f1fc7")
public static String es_PE_FIELD_Allocation_RecordID3_Description="Identificador de registro interno";

@XendraTrl(Identifier="8a3b8f09-8a45-00eb-638a-330c566f1fc7")
public static String es_PE_FIELD_Allocation_RecordID3_Help="La ID de registro es el identificador único interno de un registro.";

@XendraTrl(Identifier="8a3b8f09-8a45-00eb-638a-330c566f1fc7")
public static String es_PE_FIELD_Allocation_RecordID3_Name="ID de Registro";

@XendraField(AD_Column_ID="Record_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7ab5581b-174f-3f33-31cf-9d4d0a5063da",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8a3b8f09-8a45-00eb-638a-330c566f1fc7")
public static final String FIELDNAME_Allocation_RecordID3="8a3b8f09-8a45-00eb-638a-330c566f1fc7";

@XendraTrl(Identifier="b6f88f70-c0c1-5e6e-5f0e-c1df8a33d502")
public static String es_PE_COLUMN_Record_ID_Name="Record ID";

@XendraColumn(AD_Element_ID="86e36e4b-d1dc-2deb-449d-c1f6769e1603",ColumnName="Record_ID",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b6f88f70-c0c1-5e6e-5f0e-c1df8a33d502",
Synchronized="2017-08-05 16:53:12.0")
/** Column name Record_ID */
public static final String COLUMNNAME_Record_ID = "Record_ID";
/** Set RefDocumentNo.
@param RefDocumentNo Document sequence number of the document */
public void setRefDocumentNo (String RefDocumentNo)
{
if (RefDocumentNo != null && RefDocumentNo.length() > 20)
{
log.warning("Length > 20 - truncated");
RefDocumentNo = RefDocumentNo.substring(0,19);
}
set_Value (COLUMNNAME_RefDocumentNo, RefDocumentNo);
}
/** Get RefDocumentNo.
@return Document sequence number of the document */
public String getRefDocumentNo() 
{
String value = (String)get_Value(COLUMNNAME_RefDocumentNo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="e22e5265-075b-4ec7-8110-5c9c0e80d975")
public static String es_PE_COLUMN_RefDocumentNo_Name="RefDocumentNo";

@XendraColumn(AD_Element_ID="bdfac63c-09ac-eaa6-1f82-2328141e1af2",ColumnName="RefDocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e22e5265-075b-4ec7-8110-5c9c0e80d975",
Synchronized="2017-08-05 16:53:12.0")
/** Column name RefDocumentNo */
public static final String COLUMNNAME_RefDocumentNo = "RefDocumentNo";
/** Set Document Serial.
@param Serial Serial Number for the Document */
public void setSerial (String Serial)
{
if (Serial != null && Serial.length() > 20)
{
log.warning("Length > 20 - truncated");
Serial = Serial.substring(0,19);
}
set_Value (COLUMNNAME_Serial, Serial);
}
/** Get Document Serial.
@return Serial Number for the Document */
public String getSerial() 
{
String value = (String)get_Value(COLUMNNAME_Serial);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="42a32869-ab2a-4131-b9b3-34bdc3fa31c3")
public static String es_PE_COLUMN_Serial_Name="Document Serial";

@XendraColumn(AD_Element_ID="56277733-3963-25db-320e-99e754ca1e9c",ColumnName="Serial",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="42a32869-ab2a-4131-b9b3-34bdc3fa31c3",
Synchronized="2017-08-05 16:53:12.0")
/** Column name Serial */
public static final String COLUMNNAME_Serial = "Serial";
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

@XendraTrl(Identifier="5b4419ef-11b1-4fbf-987b-fdf9e667c273")
public static String es_PE_COLUMN_WithholdingAmt_Name="WithholdingAmt";

@XendraColumn(AD_Element_ID="750228fc-a0da-46c7-b584-2e34797d13d0",ColumnName="WithholdingAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5b4419ef-11b1-4fbf-987b-fdf9e667c273",
Synchronized="2017-08-05 16:53:12.0")
/** Column name WithholdingAmt */
public static final String COLUMNNAME_WithholdingAmt = "WithholdingAmt";
/** Set Write-off Amount.
@param WriteOffAmt Amount to write-off */
public void setWriteOffAmt (BigDecimal WriteOffAmt)
{
if (WriteOffAmt == null) throw new IllegalArgumentException ("WriteOffAmt is mandatory.");
set_ValueNoCheck (COLUMNNAME_WriteOffAmt, WriteOffAmt);
}
/** Get Write-off Amount.
@return Amount to write-off */
public BigDecimal getWriteOffAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_WriteOffAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="578fb63c-7605-fd34-675a-57c12d072570")
public static String es_PE_FIELD_AllocationLine_Write_OffAmount_Description="Total por ajustar";

@XendraTrl(Identifier="578fb63c-7605-fd34-675a-57c12d072570")
public static String es_PE_FIELD_AllocationLine_Write_OffAmount_Help="El Total de ajuste indica el total a ser ajustado como incobrable";

@XendraTrl(Identifier="578fb63c-7605-fd34-675a-57c12d072570")
public static String es_PE_FIELD_AllocationLine_Write_OffAmount_Name="Total del Ajuste";

@XendraField(AD_Column_ID="WriteOffAmt",IsCentrallyMaintained=true,
AD_Tab_ID="cb2c1554-7db3-334c-4545-572eb8d93f8f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="578fb63c-7605-fd34-675a-57c12d072570")
public static final String FIELDNAME_AllocationLine_Write_OffAmount="578fb63c-7605-fd34-675a-57c12d072570";

@XendraTrl(Identifier="93474c96-b636-711d-b467-ff9ddad00a54")
public static String es_PE_FIELD_Allocation_Write_OffAmount_Description="Total por ajustar";

@XendraTrl(Identifier="93474c96-b636-711d-b467-ff9ddad00a54")
public static String es_PE_FIELD_Allocation_Write_OffAmount_Help="El Total de ajuste indica el total a ser ajustado como incobrable";

@XendraTrl(Identifier="93474c96-b636-711d-b467-ff9ddad00a54")
public static String es_PE_FIELD_Allocation_Write_OffAmount_Name="Total del Ajuste";

@XendraField(AD_Column_ID="WriteOffAmt",IsCentrallyMaintained=true,
AD_Tab_ID="21a3761b-c615-9afc-eb30-293b90843bdd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="93474c96-b636-711d-b467-ff9ddad00a54")
public static final String FIELDNAME_Allocation_Write_OffAmount="93474c96-b636-711d-b467-ff9ddad00a54";

@XendraTrl(Identifier="996bf26e-0952-25ee-3f81-2d11b2e151dd")
public static String es_PE_FIELD_Allocation_Write_OffAmount2_Description="Total por ajustar";

@XendraTrl(Identifier="996bf26e-0952-25ee-3f81-2d11b2e151dd")
public static String es_PE_FIELD_Allocation_Write_OffAmount2_Help="El Total de ajuste indica el total a ser ajustado como incobrable";

@XendraTrl(Identifier="996bf26e-0952-25ee-3f81-2d11b2e151dd")
public static String es_PE_FIELD_Allocation_Write_OffAmount2_Name="Total del Ajuste";

@XendraField(AD_Column_ID="WriteOffAmt",IsCentrallyMaintained=true,
AD_Tab_ID="68726b3b-4221-f18d-bea7-018d45967f69",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="996bf26e-0952-25ee-3f81-2d11b2e151dd")
public static final String FIELDNAME_Allocation_Write_OffAmount2="996bf26e-0952-25ee-3f81-2d11b2e151dd";

@XendraTrl(Identifier="cdbc0f99-b143-3571-192e-05d52d05c09d")
public static String es_PE_FIELD_Allocations_Write_OffAmount_Description="Total por ajustar";

@XendraTrl(Identifier="cdbc0f99-b143-3571-192e-05d52d05c09d")
public static String es_PE_FIELD_Allocations_Write_OffAmount_Help="El Total de ajuste indica el total a ser ajustado como incobrable";

@XendraTrl(Identifier="cdbc0f99-b143-3571-192e-05d52d05c09d")
public static String es_PE_FIELD_Allocations_Write_OffAmount_Name="Total del Ajuste";

@XendraField(AD_Column_ID="WriteOffAmt",IsCentrallyMaintained=true,
AD_Tab_ID="105a2788-0a6a-9627-a2d2-c1ec554d5d5b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cdbc0f99-b143-3571-192e-05d52d05c09d")
public static final String FIELDNAME_Allocations_Write_OffAmount="cdbc0f99-b143-3571-192e-05d52d05c09d";

@XendraTrl(Identifier="6df9b5ce-0021-7928-5878-9b5cb7b5bbb6")
public static String es_PE_FIELD_Allocation_Write_OffAmount3_Description="Total por ajustar";

@XendraTrl(Identifier="6df9b5ce-0021-7928-5878-9b5cb7b5bbb6")
public static String es_PE_FIELD_Allocation_Write_OffAmount3_Help="El Total de ajuste indica el total a ser ajustado como incobrable";

@XendraTrl(Identifier="6df9b5ce-0021-7928-5878-9b5cb7b5bbb6")
public static String es_PE_FIELD_Allocation_Write_OffAmount3_Name="Total del Ajuste";

@XendraField(AD_Column_ID="WriteOffAmt",IsCentrallyMaintained=true,
AD_Tab_ID="66013eee-13e8-e05f-b415-1c5c0fb621d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6df9b5ce-0021-7928-5878-9b5cb7b5bbb6")
public static final String FIELDNAME_Allocation_Write_OffAmount3="6df9b5ce-0021-7928-5878-9b5cb7b5bbb6";

@XendraTrl(Identifier="4241fa42-65ad-4b85-9e80-657db4a3f90b")
public static String es_PE_FIELD_Allocation_Write_OffAmount4_Description="Total por ajustar";

@XendraTrl(Identifier="4241fa42-65ad-4b85-9e80-657db4a3f90b")
public static String es_PE_FIELD_Allocation_Write_OffAmount4_Help="El Total de ajuste indica el total a ser ajustado como incobrable";

@XendraTrl(Identifier="4241fa42-65ad-4b85-9e80-657db4a3f90b")
public static String es_PE_FIELD_Allocation_Write_OffAmount4_Name="Total del Ajuste";

@XendraField(AD_Column_ID="WriteOffAmt",IsCentrallyMaintained=true,
AD_Tab_ID="737a0fd5-ca55-3049-7514-9557958093ab",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4241fa42-65ad-4b85-9e80-657db4a3f90b")
public static final String FIELDNAME_Allocation_Write_OffAmount4="4241fa42-65ad-4b85-9e80-657db4a3f90b";

@XendraTrl(Identifier="7237128c-fd32-dcb3-904c-0106a88875dc")
public static String es_PE_FIELD_Allocation_Write_OffAmount5_Description="Total por ajustar";

@XendraTrl(Identifier="7237128c-fd32-dcb3-904c-0106a88875dc")
public static String es_PE_FIELD_Allocation_Write_OffAmount5_Help="El Total de ajuste indica el total a ser ajustado como incobrable";

@XendraTrl(Identifier="7237128c-fd32-dcb3-904c-0106a88875dc")
public static String es_PE_FIELD_Allocation_Write_OffAmount5_Name="Total del Ajuste";

@XendraField(AD_Column_ID="WriteOffAmt",IsCentrallyMaintained=true,
AD_Tab_ID="7ab5581b-174f-3f33-31cf-9d4d0a5063da",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7237128c-fd32-dcb3-904c-0106a88875dc")
public static final String FIELDNAME_Allocation_Write_OffAmount5="7237128c-fd32-dcb3-904c-0106a88875dc";

@XendraTrl(Identifier="2af8c15f-7b1c-207e-cf78-b6d8217afd9c")
public static String es_PE_COLUMN_WriteOffAmt_Name="Total del Ajuste";

@XendraColumn(AD_Element_ID="5f70c6d6-fd9f-549c-363e-80eaef7df1c7",ColumnName="WriteOffAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2af8c15f-7b1c-207e-cf78-b6d8217afd9c",
Synchronized="2017-08-05 16:53:12.0")
/** Column name WriteOffAmt */
public static final String COLUMNNAME_WriteOffAmt = "WriteOffAmt";
}
