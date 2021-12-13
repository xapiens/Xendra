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
/** Generated Model for C_CommissionDetail
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_CommissionDetail extends PO
{
/** Standard Constructor
@param ctx context
@param C_CommissionDetail_ID id
@param trxName transaction
*/
public X_C_CommissionDetail (Properties ctx, int C_CommissionDetail_ID, String trxName)
{
super (ctx, C_CommissionDetail_ID, trxName);
/** if (C_CommissionDetail_ID == 0)
{
setActualAmt (Env.ZERO);	
// 0
setActualQty (Env.ZERO);
setC_CommissionAmt_ID (0);
setC_CommissionDetail_ID (0);
setC_Currency_ID (0);
setConvertedAmt (Env.ZERO);	
// 0
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_CommissionDetail (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=437 */
public static int Table_ID=MTable.getTable_ID("C_CommissionDetail");

@XendraTrl(Identifier="ef0111c7-52e0-366e-19c1-12b0b52d4f97")
public static String es_PE_TAB_CommissionDetail_Description="Información de detalle de comisión";

@XendraTrl(Identifier="ef0111c7-52e0-366e-19c1-12b0b52d4f97")
public static String es_PE_TAB_CommissionDetail_Help="Es posible alterar el total y la cantidad de los registros de detalle; pero se sugiere adicionar nuevas líneas para corregir. Los totales son convertidos desde la moneda de la transacción a la moneda de la comisión (definida en la ventana de comisión) usando la fecha de comienzo y la tasa del punto de cambio.";

@XendraTrl(Identifier="ef0111c7-52e0-366e-19c1-12b0b52d4f97")
public static String es_PE_TAB_CommissionDetail_Name="Detalle de Comisión";

@XendraTab(Name="Commission Detail",Description="Commission Detail Information",
Help="You may alter the amount and quantity of the detail records, but the suggested way is to add new correcting lines. The amounts are converted from the transaction currency to the Commission Currency (defined in the Commission window) using the start date and the spot exchange rate.",
AD_Window_ID="4951efe3-6b21-ab9a-5bc7-01af51e516d9",SeqNo=30,TabLevel=2,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="ef0111c7-52e0-366e-19c1-12b0b52d4f97",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_CommissionDetail="ef0111c7-52e0-366e-19c1-12b0b52d4f97";

@XendraTrl(Identifier="50b2c9e8-66fb-f18c-6c80-d3cbc1117a28")
public static String es_PE_TABLE_C_CommissionDetail_Name="Detalle de comisiones";

@XendraTable(Name="Commission Detail",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",
Description="Supporting information for Commission Amounts",Help="",TableName="C_CommissionDetail",
AccessLevel="1",AD_Window_ID="4951efe3-6b21-ab9a-5bc7-01af51e516d9",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="50b2c9e8-66fb-f18c-6c80-d3cbc1117a28",Synchronized="2020-03-03 21:36:45.0")
/** TableName=C_CommissionDetail */
public static final String Table_Name="C_CommissionDetail";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_CommissionDetail");

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
    Table_ID = MTable.getTable_ID("C_CommissionDetail");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_CommissionDetail[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Actual Amount.
@param ActualAmt The actual amount */
public void setActualAmt (BigDecimal ActualAmt)
{
if (ActualAmt == null) throw new IllegalArgumentException ("ActualAmt is mandatory.");
set_Value (COLUMNNAME_ActualAmt, ActualAmt);
}
/** Get Actual Amount.
@return The actual amount */
public BigDecimal getActualAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ActualAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="4f871a10-5e72-dd78-eada-4a5d0e45a896")
public static String es_PE_FIELD_CommissionDetail_ActualAmount_Name="Total Real";

@XendraTrl(Identifier="4f871a10-5e72-dd78-eada-4a5d0e45a896")
public static String es_PE_FIELD_CommissionDetail_ActualAmount_Description="El Total Real";

@XendraTrl(Identifier="4f871a10-5e72-dd78-eada-4a5d0e45a896")
public static String es_PE_FIELD_CommissionDetail_ActualAmount_Help="El Total real indica la cantidad acordada para un documento";

@XendraField(AD_Column_ID="ActualAmt",IsCentrallyMaintained=true,
AD_Tab_ID="ef0111c7-52e0-366e-19c1-12b0b52d4f97",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4f871a10-5e72-dd78-eada-4a5d0e45a896")
public static final String FIELDNAME_CommissionDetail_ActualAmount="4f871a10-5e72-dd78-eada-4a5d0e45a896";

@XendraTrl(Identifier="d494097b-dd40-efa8-e470-7cad59fe7f18")
public static String es_PE_COLUMN_ActualAmt_Name="Total Real";

@XendraColumn(AD_Element_ID="a8a596e9-bb80-44d9-44b6-3651cf13d940",ColumnName="ActualAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d494097b-dd40-efa8-e470-7cad59fe7f18",
Synchronized="2019-08-30 22:21:23.0")
/** Column name ActualAmt */
public static final String COLUMNNAME_ActualAmt = "ActualAmt";
/** Set Actual Quantity.
@param ActualQty The actual quantity */
public void setActualQty (BigDecimal ActualQty)
{
if (ActualQty == null) throw new IllegalArgumentException ("ActualQty is mandatory.");
set_Value (COLUMNNAME_ActualQty, ActualQty);
}
/** Get Actual Quantity.
@return The actual quantity */
public BigDecimal getActualQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ActualQty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="d1c751d1-89ff-0ad5-2ae5-f030679e6405")
public static String es_PE_FIELD_CommissionDetail_ActualQuantity_Name="Cantidad Actual";

@XendraTrl(Identifier="d1c751d1-89ff-0ad5-2ae5-f030679e6405")
public static String es_PE_FIELD_CommissionDetail_ActualQuantity_Description="La cantidad actual";

@XendraTrl(Identifier="d1c751d1-89ff-0ad5-2ae5-f030679e6405")
public static String es_PE_FIELD_CommissionDetail_ActualQuantity_Help="La Cantidad actual indica la cantidad tal como se refiere en un documento";

@XendraField(AD_Column_ID="ActualQty",IsCentrallyMaintained=true,
AD_Tab_ID="ef0111c7-52e0-366e-19c1-12b0b52d4f97",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d1c751d1-89ff-0ad5-2ae5-f030679e6405")
public static final String FIELDNAME_CommissionDetail_ActualQuantity="d1c751d1-89ff-0ad5-2ae5-f030679e6405";

@XendraTrl(Identifier="d2b0353f-359e-0d7c-f684-ce8844cb0a58")
public static String es_PE_COLUMN_ActualQty_Name="Cantidad Actual";

@XendraColumn(AD_Element_ID="422ec1ba-eb68-e7f9-d2b6-93623297521f",ColumnName="ActualQty",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d2b0353f-359e-0d7c-f684-ce8844cb0a58",
Synchronized="2019-08-30 22:21:23.0")
/** Column name ActualQty */
public static final String COLUMNNAME_ActualQty = "ActualQty";
/** Set Commission Amount.
@param C_CommissionAmt_ID Generated Commission Amount  */
public void setC_CommissionAmt_ID (int C_CommissionAmt_ID)
{
if (C_CommissionAmt_ID < 1) throw new IllegalArgumentException ("C_CommissionAmt_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_CommissionAmt_ID, Integer.valueOf(C_CommissionAmt_ID));
}
/** Get Commission Amount.
@return Generated Commission Amount  */
public int getC_CommissionAmt_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_CommissionAmt_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9cea441e-52c5-4c72-7c4b-e8b424f39c6d")
public static String es_PE_FIELD_CommissionDetail_CommissionAmount_Name="Total de la Comisión";

@XendraTrl(Identifier="9cea441e-52c5-4c72-7c4b-e8b424f39c6d")
public static String es_PE_FIELD_CommissionDetail_CommissionAmount_Description="Total de la comisión generada";

@XendraTrl(Identifier="9cea441e-52c5-4c72-7c4b-e8b424f39c6d")
public static String es_PE_FIELD_CommissionDetail_CommissionAmount_Help="La cantidad de la Comisión indica la cantidad que resulta de un funcionamiento de la comisión.";

@XendraField(AD_Column_ID="C_CommissionAmt_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ef0111c7-52e0-366e-19c1-12b0b52d4f97",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9cea441e-52c5-4c72-7c4b-e8b424f39c6d")
public static final String FIELDNAME_CommissionDetail_CommissionAmount="9cea441e-52c5-4c72-7c4b-e8b424f39c6d";

@XendraTrl(Identifier="ac2bfe18-d25b-8c31-ed32-8099b2760559")
public static String es_PE_COLUMN_C_CommissionAmt_ID_Name="Total de la Comisión";

@XendraColumn(AD_Element_ID="1d684de0-8d4a-5c6d-378d-492be6e8b603",ColumnName="C_CommissionAmt_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ac2bfe18-d25b-8c31-ed32-8099b2760559",
Synchronized="2019-08-30 22:21:23.0")
/** Column name C_CommissionAmt_ID */
public static final String COLUMNNAME_C_CommissionAmt_ID = "C_CommissionAmt_ID";
/** Set Commission Detail.
@param C_CommissionDetail_ID Supporting information for Commission Amounts */
public void setC_CommissionDetail_ID (int C_CommissionDetail_ID)
{
if (C_CommissionDetail_ID < 1) throw new IllegalArgumentException ("C_CommissionDetail_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_CommissionDetail_ID, Integer.valueOf(C_CommissionDetail_ID));
}
/** Get Commission Detail.
@return Supporting information for Commission Amounts */
public int getC_CommissionDetail_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_CommissionDetail_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="bcf0d1d5-e3f7-976d-2040-1c6b83413dea")
public static String es_PE_FIELD_CommissionDetail_CommissionDetail_Name="Detalle de comisiones";

@XendraTrl(Identifier="bcf0d1d5-e3f7-976d-2040-1c6b83413dea")
public static String es_PE_FIELD_CommissionDetail_CommissionDetail_Description="Información de apoyo para cálculo del total de las comisiones";

@XendraTrl(Identifier="bcf0d1d5-e3f7-976d-2040-1c6b83413dea")
public static String es_PE_FIELD_CommissionDetail_CommissionDetail_Help="El detalle de comisión proporciona información de soporte en una corrida de comisión. Cada línea del documento que haya sido parte de la corrida de comisión será reflejada aquí";

@XendraField(AD_Column_ID="C_CommissionDetail_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ef0111c7-52e0-366e-19c1-12b0b52d4f97",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bcf0d1d5-e3f7-976d-2040-1c6b83413dea")
public static final String FIELDNAME_CommissionDetail_CommissionDetail="bcf0d1d5-e3f7-976d-2040-1c6b83413dea";
/** Column name C_CommissionDetail_ID */
public static final String COLUMNNAME_C_CommissionDetail_ID = "C_CommissionDetail_ID";
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

@XendraTrl(Identifier="caf6d9f1-afc6-745e-6216-d057a3acd656")
public static String es_PE_FIELD_CommissionDetail_Currency_Name="Moneda";

@XendraTrl(Identifier="caf6d9f1-afc6-745e-6216-d057a3acd656")
public static String es_PE_FIELD_CommissionDetail_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="caf6d9f1-afc6-745e-6216-d057a3acd656")
public static String es_PE_FIELD_CommissionDetail_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ef0111c7-52e0-366e-19c1-12b0b52d4f97",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="caf6d9f1-afc6-745e-6216-d057a3acd656")
public static final String FIELDNAME_CommissionDetail_Currency="caf6d9f1-afc6-745e-6216-d057a3acd656";

@XendraTrl(Identifier="5e8d1d55-7214-d5e7-c396-d4335c08eca2")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5e8d1d55-7214-d5e7-c396-d4335c08eca2",
Synchronized="2019-08-30 22:21:23.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
/** Set Invoice Line.
@param C_InvoiceLine_ID Invoice Detail Line */
public void setC_InvoiceLine_ID (int C_InvoiceLine_ID)
{
if (C_InvoiceLine_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_InvoiceLine_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_InvoiceLine_ID, Integer.valueOf(C_InvoiceLine_ID));
}
/** Get Invoice Line.
@return Invoice Detail Line */
public int getC_InvoiceLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_InvoiceLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="099d0e77-c8b9-b0fe-4522-cc6e0ae64365")
public static String es_PE_FIELD_CommissionDetail_InvoiceLine_Name="Item de Factura";

@XendraTrl(Identifier="099d0e77-c8b9-b0fe-4522-cc6e0ae64365")
public static String es_PE_FIELD_CommissionDetail_InvoiceLine_Description="Item de detalle de factura";

@XendraTrl(Identifier="099d0e77-c8b9-b0fe-4522-cc6e0ae64365")
public static String es_PE_FIELD_CommissionDetail_InvoiceLine_Help="Identifica de manera única un Item de la factura";

@XendraField(AD_Column_ID="C_InvoiceLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ef0111c7-52e0-366e-19c1-12b0b52d4f97",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="099d0e77-c8b9-b0fe-4522-cc6e0ae64365")
public static final String FIELDNAME_CommissionDetail_InvoiceLine="099d0e77-c8b9-b0fe-4522-cc6e0ae64365";

@XendraTrl(Identifier="a375ab41-d409-a752-d36a-4849d19cf5bd")
public static String es_PE_COLUMN_C_InvoiceLine_ID_Name="Línea de Factura";

@XendraColumn(AD_Element_ID="56a4b078-1c5d-e08d-5d9d-847e94161779",ColumnName="C_InvoiceLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a375ab41-d409-a752-d36a-4849d19cf5bd",
Synchronized="2019-08-30 22:21:23.0")
/** Column name C_InvoiceLine_ID */
public static final String COLUMNNAME_C_InvoiceLine_ID = "C_InvoiceLine_ID";
/** Set Converted Amount.
@param ConvertedAmt Converted Amount */
public void setConvertedAmt (BigDecimal ConvertedAmt)
{
if (ConvertedAmt == null) throw new IllegalArgumentException ("ConvertedAmt is mandatory.");
set_Value (COLUMNNAME_ConvertedAmt, ConvertedAmt);
}
/** Get Converted Amount.
@return Converted Amount */
public BigDecimal getConvertedAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ConvertedAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="6c9eabf1-50bc-27f1-51f5-2d2c3af615b4")
public static String es_PE_FIELD_CommissionDetail_ConvertedAmount_Name="Total Convertido";

@XendraTrl(Identifier="6c9eabf1-50bc-27f1-51f5-2d2c3af615b4")
public static String es_PE_FIELD_CommissionDetail_ConvertedAmount_Description="Total Convertido";

@XendraTrl(Identifier="6c9eabf1-50bc-27f1-51f5-2d2c3af615b4")
public static String es_PE_FIELD_CommissionDetail_ConvertedAmount_Help="El Total convertido es el resultado de multiplicar el total fuente por la tasa de conversión para esta moneda destino.";

@XendraField(AD_Column_ID="ConvertedAmt",IsCentrallyMaintained=true,
AD_Tab_ID="ef0111c7-52e0-366e-19c1-12b0b52d4f97",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6c9eabf1-50bc-27f1-51f5-2d2c3af615b4")
public static final String FIELDNAME_CommissionDetail_ConvertedAmount="6c9eabf1-50bc-27f1-51f5-2d2c3af615b4";

@XendraTrl(Identifier="ef87e17e-96e1-b49a-0857-108e6924db6b")
public static String es_PE_COLUMN_ConvertedAmt_Name="Total Convertido";

@XendraColumn(AD_Element_ID="6b6925fc-75bd-914f-a973-fc059d2b2f46",ColumnName="ConvertedAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ef87e17e-96e1-b49a-0857-108e6924db6b",
Synchronized="2019-08-30 22:21:23.0")
/** Column name ConvertedAmt */
public static final String COLUMNNAME_ConvertedAmt = "ConvertedAmt";
/** Set Sales Order Line.
@param C_OrderLine_ID Sales Order Line */
public void setC_OrderLine_ID (int C_OrderLine_ID)
{
if (C_OrderLine_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_OrderLine_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_OrderLine_ID, Integer.valueOf(C_OrderLine_ID));
}
/** Get Sales Order Line.
@return Sales Order Line */
public int getC_OrderLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_OrderLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="671d4f72-ede3-74d3-99fd-8f1b5758d29f")
public static String es_PE_FIELD_CommissionDetail_PurchaseOrderLine_Name="Item";

@XendraTrl(Identifier="671d4f72-ede3-74d3-99fd-8f1b5758d29f")
public static String es_PE_FIELD_CommissionDetail_PurchaseOrderLine_Description="Item de orden de compra";

@XendraTrl(Identifier="671d4f72-ede3-74d3-99fd-8f1b5758d29f")
public static String es_PE_FIELD_CommissionDetail_PurchaseOrderLine_Help="Identificador único para un Item en una orden.";

@XendraField(AD_Column_ID="C_OrderLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ef0111c7-52e0-366e-19c1-12b0b52d4f97",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="671d4f72-ede3-74d3-99fd-8f1b5758d29f")
public static final String FIELDNAME_CommissionDetail_PurchaseOrderLine="671d4f72-ede3-74d3-99fd-8f1b5758d29f";

@XendraTrl(Identifier="d91a8eeb-eb64-d995-5935-1ef478bc2e26")
public static String es_PE_COLUMN_C_OrderLine_ID_Name="Línea";

@XendraColumn(AD_Element_ID="a94fbec0-0ef5-0f6c-033d-8286782321b0",ColumnName="C_OrderLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d91a8eeb-eb64-d995-5935-1ef478bc2e26",
Synchronized="2019-08-30 22:21:23.0")
/** Column name C_OrderLine_ID */
public static final String COLUMNNAME_C_OrderLine_ID = "C_OrderLine_ID";
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
@XendraTrl(Identifier="8d48dc9b-726d-46c9-9e9c-67c97322b3d6")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8d48dc9b-726d-46c9-9e9c-67c97322b3d6",
Synchronized="2019-08-30 22:21:23.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Info.
@param Info Information */
public void setInfo (String Info)
{
if (Info != null && Info.length() > 60)
{
log.warning("Length > 60 - truncated");
Info = Info.substring(0,59);
}
set_Value (COLUMNNAME_Info, Info);
}
/** Get Info.
@return Information */
public String getInfo() 
{
String value = (String)get_Value(COLUMNNAME_Info);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="69bdf344-4706-f771-f4c3-2ad4d0b979ea")
public static String es_PE_FIELD_CommissionDetail_Info_Name="Información";

@XendraTrl(Identifier="69bdf344-4706-f771-f4c3-2ad4d0b979ea")
public static String es_PE_FIELD_CommissionDetail_Info_Description="Información";

@XendraTrl(Identifier="69bdf344-4706-f771-f4c3-2ad4d0b979ea")
public static String es_PE_FIELD_CommissionDetail_Info_Help="La Información despliega datos desde la línea del documento fuente";

@XendraField(AD_Column_ID="Info",IsCentrallyMaintained=true,
AD_Tab_ID="ef0111c7-52e0-366e-19c1-12b0b52d4f97",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="69bdf344-4706-f771-f4c3-2ad4d0b979ea")
public static final String FIELDNAME_CommissionDetail_Info="69bdf344-4706-f771-f4c3-2ad4d0b979ea";

@XendraTrl(Identifier="cc9c95aa-0435-e7d6-0438-b877d837fb7d")
public static String es_PE_COLUMN_Info_Name="Información";

@XendraColumn(AD_Element_ID="ab412fab-8336-50a9-21d9-30571bb98ce1",ColumnName="Info",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cc9c95aa-0435-e7d6-0438-b877d837fb7d",
Synchronized="2019-08-30 22:21:23.0")
/** Column name Info */
public static final String COLUMNNAME_Info = "Info";
/** Set Reference.
@param Reference Reference for this record */
public void setReference (String Reference)
{
if (Reference != null && Reference.length() > 60)
{
log.warning("Length > 60 - truncated");
Reference = Reference.substring(0,59);
}
set_Value (COLUMNNAME_Reference, Reference);
}
/** Get Reference.
@return Reference for this record */
public String getReference() 
{
String value = (String)get_Value(COLUMNNAME_Reference);
if (value == null)
  return "";
return value;
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getReference());
}

@XendraTrl(Identifier="2b59363d-baad-6728-727b-98a8b3565235")
public static String es_PE_FIELD_CommissionDetail_Reference_Name="Referencia";

@XendraTrl(Identifier="2b59363d-baad-6728-727b-98a8b3565235")
public static String es_PE_FIELD_CommissionDetail_Reference_Description="Referencia para este registro";

@XendraTrl(Identifier="2b59363d-baad-6728-727b-98a8b3565235")
public static String es_PE_FIELD_CommissionDetail_Reference_Help="La referencia despliega el número del documento fuente";

@XendraField(AD_Column_ID="Reference",IsCentrallyMaintained=true,
AD_Tab_ID="ef0111c7-52e0-366e-19c1-12b0b52d4f97",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2b59363d-baad-6728-727b-98a8b3565235")
public static final String FIELDNAME_CommissionDetail_Reference="2b59363d-baad-6728-727b-98a8b3565235";

@XendraTrl(Identifier="311b22fe-72ef-7df5-61f3-86e484e92441")
public static String es_PE_COLUMN_Reference_Name="Referencia";

@XendraColumn(AD_Element_ID="eba276ea-db21-0cfa-29e6-6e0d45ebff99",ColumnName="Reference",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="311b22fe-72ef-7df5-61f3-86e484e92441",
Synchronized="2019-08-30 22:21:23.0")
/** Column name Reference */
public static final String COLUMNNAME_Reference = "Reference";
}
