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
/** Generated Model for C_OrderTax
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_OrderTax extends PO
{
/** Standard Constructor
@param ctx context
@param C_OrderTax_ID id
@param trxName transaction
*/
public X_C_OrderTax (Properties ctx, int C_OrderTax_ID, String trxName)
{
super (ctx, C_OrderTax_ID, trxName);
/** if (C_OrderTax_ID == 0)
{
setC_Order_ID (0);
setC_Tax_ID (0);
setIsTaxIncluded (false);	
// N
setProcessed (false);	
// N
setTaxAmt (Env.ZERO);	
// 0
setTaxBaseAmt (Env.ZERO);	
// 0
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_OrderTax (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=314 */
public static int Table_ID=MTable.getTable_ID("C_OrderTax");

@XendraTrl(Identifier="5270301f-d0c1-0c8e-3adb-a0c12b6b70c4")
public static String es_PE_TAB_OrderTax_Description="Impuestos de la Orden";

@XendraTrl(Identifier="5270301f-d0c1-0c8e-3adb-a0c12b6b70c4")
public static String es_PE_TAB_OrderTax_Name="Impuestos de la Orden";

@XendraTrl(Identifier="5270301f-d0c1-0c8e-3adb-a0c12b6b70c4")
public static String es_PE_TAB_OrderTax_Help="La pestaña de Impuestos de la Orden despliega los Totales de impuesto para una orden basados en las líneas de la orden ingresadas.";

@XendraTab(Name="Order Tax",Description="Order Tax",
Help="The Order Tax Tab displays the tax amount for an Order based on the lines entered.",
AD_Window_ID="c6b21e03-9b7e-a7c6-27ff-50703fd13562",SeqNo=30,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,
AD_Column_ID="317f0a10-04ae-aefb-e7c6-87d3c04bbdcd",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="5270301f-d0c1-0c8e-3adb-a0c12b6b70c4",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_OrderTax="5270301f-d0c1-0c8e-3adb-a0c12b6b70c4";

@XendraTrl(Identifier="b1eb59bc-4998-2a8f-c4d4-7d92003d4243")
public static String es_PE_TAB_OrderTax2_Description="Impuesto de la Orden";

@XendraTrl(Identifier="b1eb59bc-4998-2a8f-c4d4-7d92003d4243")
public static String es_PE_TAB_OrderTax2_Name="Impuesto de la Orden";

@XendraTrl(Identifier="b1eb59bc-4998-2a8f-c4d4-7d92003d4243")
public static String es_PE_TAB_OrderTax2_Help="La pestaña Impuesto de la Orden despliega el impuesto asociado con las líneas de la orden.";

@XendraTab(Name="Order Tax",Description="Order Tax",
Help="The Order Tax Tab displays the tax associated with the Order Lines.",
AD_Window_ID="041b9539-24f3-7494-c2fa-c360634d60b2",SeqNo=50,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,
AD_Column_ID="317f0a10-04ae-aefb-e7c6-87d3c04bbdcd",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="b1eb59bc-4998-2a8f-c4d4-7d92003d4243",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_OrderTax2="b1eb59bc-4998-2a8f-c4d4-7d92003d4243";

@XendraTrl(Identifier="4c811f7f-7dd6-b9de-0e92-188b1e5e41cc")
public static String es_PE_TABLE_C_OrderTax_Name="C_OrderTax";

@XendraTable(Name="Order Tax",Description="",Help="",TableName="C_OrderTax",AccessLevel="1",
AD_Window_ID="c6b21e03-9b7e-a7c6-27ff-50703fd13562",AD_Val_Rule_ID="",IsKey=0,LoadSeq=145,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="041b9539-24f3-7494-c2fa-c360634d60b2",ID="org.xendra.commercial",
Identifier="4c811f7f-7dd6-b9de-0e92-188b1e5e41cc",Synchronized="2017-08-16 11:42:05.0")
/** TableName=C_OrderTax */
public static final String Table_Name="C_OrderTax";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_OrderTax");

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
    Table_ID = MTable.getTable_ID("C_OrderTax");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_OrderTax[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Order.
@param C_Order_ID Order */
public void setC_Order_ID (int C_Order_ID)
{
if (C_Order_ID < 1) throw new IllegalArgumentException ("C_Order_ID is mandatory.");
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

@XendraTrl(Identifier="f11d5b51-c0ca-75e8-ec62-6567a2a9c309")
public static String es_PE_FIELD_OrderTax_Order_Description="Orden de Venta";

@XendraTrl(Identifier="f11d5b51-c0ca-75e8-ec62-6567a2a9c309")
public static String es_PE_FIELD_OrderTax_Order_Help="La ID de la orden de ventas es un identificador único de la orden de ventas; Ésta es controlada por la secuencia del documento para este tipo de documento.";

@XendraTrl(Identifier="f11d5b51-c0ca-75e8-ec62-6567a2a9c309")
public static String es_PE_FIELD_OrderTax_Order_Name="Orden de Venta";

@XendraField(AD_Column_ID="C_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5270301f-d0c1-0c8e-3adb-a0c12b6b70c4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f11d5b51-c0ca-75e8-ec62-6567a2a9c309")
public static final String FIELDNAME_OrderTax_Order="f11d5b51-c0ca-75e8-ec62-6567a2a9c309";

@XendraTrl(Identifier="03921db0-608c-d651-7f70-89ce2bfc11b2")
public static String es_PE_FIELD_OrderTax_PurchaseOrder_Description="Orden de compra";

@XendraTrl(Identifier="03921db0-608c-d651-7f70-89ce2bfc11b2")
public static String es_PE_FIELD_OrderTax_PurchaseOrder_Help="La compra es Identificada con un ID único de orden de compra. Esta controlado por la secuencia de este tipo de documento.";

@XendraTrl(Identifier="03921db0-608c-d651-7f70-89ce2bfc11b2")
public static String es_PE_FIELD_OrderTax_PurchaseOrder_Name="Orden de compra";

@XendraField(AD_Column_ID="C_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b1eb59bc-4998-2a8f-c4d4-7d92003d4243",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="03921db0-608c-d651-7f70-89ce2bfc11b2")
public static final String FIELDNAME_OrderTax_PurchaseOrder="03921db0-608c-d651-7f70-89ce2bfc11b2";

@XendraTrl(Identifier="317f0a10-04ae-aefb-e7c6-87d3c04bbdcd")
public static String es_PE_COLUMN_C_Order_ID_Name="Orden de Venta";

@XendraColumn(AD_Element_ID="cc846c60-90b8-6aad-9d07-b5d0c0328787",ColumnName="C_Order_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="317f0a10-04ae-aefb-e7c6-87d3c04bbdcd",
Synchronized="2017-08-05 16:53:58.0")
/** Column name C_Order_ID */
public static final String COLUMNNAME_C_Order_ID = "C_Order_ID";
/** Set Tax.
@param C_Tax_ID Tax identifier */
public void setC_Tax_ID (int C_Tax_ID)
{
if (C_Tax_ID < 1) throw new IllegalArgumentException ("C_Tax_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Tax_ID, Integer.valueOf(C_Tax_ID));
}
/** Get Tax.
@return Tax identifier */
public int getC_Tax_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Tax_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="95d2f469-1214-aa23-dd5d-343e3695fc19")
public static String es_PE_FIELD_OrderTax_Tax_Description="Identificador del Impuesto";

@XendraTrl(Identifier="95d2f469-1214-aa23-dd5d-343e3695fc19")
public static String es_PE_FIELD_OrderTax_Tax_Help="El Impuesto indica el tipo de impuesto para esta línea del documento";

@XendraTrl(Identifier="95d2f469-1214-aa23-dd5d-343e3695fc19")
public static String es_PE_FIELD_OrderTax_Tax_Name="Impuesto";
@XendraField(AD_Column_ID="C_Tax_ID",
IsCentrallyMaintained=true,AD_Tab_ID="5270301f-d0c1-0c8e-3adb-a0c12b6b70c4",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="95d2f469-1214-aa23-dd5d-343e3695fc19")
public static final String FIELDNAME_OrderTax_Tax="95d2f469-1214-aa23-dd5d-343e3695fc19";

@XendraTrl(Identifier="0da5dcc9-2bff-021d-d842-c319558404b2")
public static String es_PE_FIELD_OrderTax_Tax2_Description="Identificador del Impuesto";

@XendraTrl(Identifier="0da5dcc9-2bff-021d-d842-c319558404b2")
public static String es_PE_FIELD_OrderTax_Tax2_Help="El Impuesto indica el tipo de impuesto para esta línea del documento";

@XendraTrl(Identifier="0da5dcc9-2bff-021d-d842-c319558404b2")
public static String es_PE_FIELD_OrderTax_Tax2_Name="Impuesto";

@XendraField(AD_Column_ID="C_Tax_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b1eb59bc-4998-2a8f-c4d4-7d92003d4243",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0da5dcc9-2bff-021d-d842-c319558404b2")
public static final String FIELDNAME_OrderTax_Tax2="0da5dcc9-2bff-021d-d842-c319558404b2";

@XendraTrl(Identifier="0b81ca5d-a1ea-fa32-edd2-a20eb46fd0e0")
public static String es_PE_COLUMN_C_Tax_ID_Name="Impuesto";

@XendraColumn(AD_Element_ID="38ff24fc-b68c-51a9-60f8-ef2a1f060de2",ColumnName="C_Tax_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0b81ca5d-a1ea-fa32-edd2-a20eb46fd0e0",
Synchronized="2017-08-05 16:53:58.0")
/** Column name C_Tax_ID */
public static final String COLUMNNAME_C_Tax_ID = "C_Tax_ID";
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
@XendraTrl(Identifier="7e0d6507-26b9-4bd6-a827-b16b5633afd4")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7e0d6507-26b9-4bd6-a827-b16b5633afd4",
Synchronized="2017-08-05 16:53:58.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Price includes Tax.
@param IsTaxIncluded Tax is included in the price  */
public void setIsTaxIncluded (boolean IsTaxIncluded)
{
set_Value (COLUMNNAME_IsTaxIncluded, Boolean.valueOf(IsTaxIncluded));
}
/** Get Price includes Tax.
@return Tax is included in the price  */
public boolean isTaxIncluded() 
{
Object oo = get_Value(COLUMNNAME_IsTaxIncluded);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="2a0f07b6-e92d-e82e-d08f-646445b3eb6b")
public static String es_PE_FIELD_OrderTax_PriceIncludesTax_Description="Impuesto incluido en el precio";

@XendraTrl(Identifier="2a0f07b6-e92d-e82e-d08f-646445b3eb6b")
public static String es_PE_FIELD_OrderTax_PriceIncludesTax_Help="El cuadro de verificación Impuesto Incluido indica que el precio incluye impuestos. Esto es también conocido como el precio bruto";

@XendraTrl(Identifier="2a0f07b6-e92d-e82e-d08f-646445b3eb6b")
public static String es_PE_FIELD_OrderTax_PriceIncludesTax_Name="Impuesto Incluido en el Precio";

@XendraField(AD_Column_ID="IsTaxIncluded",IsCentrallyMaintained=true,
AD_Tab_ID="5270301f-d0c1-0c8e-3adb-a0c12b6b70c4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2a0f07b6-e92d-e82e-d08f-646445b3eb6b")
public static final String FIELDNAME_OrderTax_PriceIncludesTax="2a0f07b6-e92d-e82e-d08f-646445b3eb6b";

@XendraTrl(Identifier="b8d47d17-b5c3-f183-b9fb-6b00a0d79d25")
public static String es_PE_FIELD_OrderTax_PriceIncludesTax2_Description="Impuesto incluido en el precio";

@XendraTrl(Identifier="b8d47d17-b5c3-f183-b9fb-6b00a0d79d25")
public static String es_PE_FIELD_OrderTax_PriceIncludesTax2_Help="El cuadro de verificación Impuesto Incluido indica que el precio incluye impuestos. Esto es también conocido como el precio bruto";

@XendraTrl(Identifier="b8d47d17-b5c3-f183-b9fb-6b00a0d79d25")
public static String es_PE_FIELD_OrderTax_PriceIncludesTax2_Name="Impuesto Incluido en el Precio";

@XendraField(AD_Column_ID="IsTaxIncluded",IsCentrallyMaintained=true,
AD_Tab_ID="b1eb59bc-4998-2a8f-c4d4-7d92003d4243",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b8d47d17-b5c3-f183-b9fb-6b00a0d79d25")
public static final String FIELDNAME_OrderTax_PriceIncludesTax2="b8d47d17-b5c3-f183-b9fb-6b00a0d79d25";

@XendraTrl(Identifier="7b69a64b-de1c-ba38-4772-bc4beb39bf24")
public static String es_PE_COLUMN_IsTaxIncluded_Name="Impuesto Incluido en el Precio";

@XendraColumn(AD_Element_ID="eb0a6d55-2fff-a462-20b8-744571a3fe60",ColumnName="IsTaxIncluded",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7b69a64b-de1c-ba38-4772-bc4beb39bf24",
Synchronized="2017-08-05 16:53:58.0")
/** Column name IsTaxIncluded */
public static final String COLUMNNAME_IsTaxIncluded = "IsTaxIncluded";
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

@XendraTrl(Identifier="d330f734-6bdb-c2a8-5657-ab949872128b")
public static String es_PE_FIELD_OrderTax_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="d330f734-6bdb-c2a8-5657-ab949872128b")
public static String es_PE_FIELD_OrderTax_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="d330f734-6bdb-c2a8-5657-ab949872128b")
public static String es_PE_FIELD_OrderTax_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="5270301f-d0c1-0c8e-3adb-a0c12b6b70c4",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d330f734-6bdb-c2a8-5657-ab949872128b")
public static final String FIELDNAME_OrderTax_Processed="d330f734-6bdb-c2a8-5657-ab949872128b";

@XendraTrl(Identifier="37eb138b-70df-c649-741d-dd92f8851250")
public static String es_PE_FIELD_OrderTax_Processed2_Description="El documento ha sido procesado";

@XendraTrl(Identifier="37eb138b-70df-c649-741d-dd92f8851250")
public static String es_PE_FIELD_OrderTax_Processed2_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="37eb138b-70df-c649-741d-dd92f8851250")
public static String es_PE_FIELD_OrderTax_Processed2_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="b1eb59bc-4998-2a8f-c4d4-7d92003d4243",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="37eb138b-70df-c649-741d-dd92f8851250")
public static final String FIELDNAME_OrderTax_Processed2="37eb138b-70df-c649-741d-dd92f8851250";

@XendraTrl(Identifier="77a93e9c-daf3-6d64-d4ee-2e3cafbaa7d3")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="77a93e9c-daf3-6d64-d4ee-2e3cafbaa7d3",
Synchronized="2017-08-05 16:53:58.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
/** Set Tax Amount.
@param TaxAmt Tax Amount for a document */
public void setTaxAmt (BigDecimal TaxAmt)
{
if (TaxAmt == null) throw new IllegalArgumentException ("TaxAmt is mandatory.");
set_ValueNoCheck (COLUMNNAME_TaxAmt, TaxAmt);
}
/** Get Tax Amount.
@return Tax Amount for a document */
public BigDecimal getTaxAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TaxAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="0163c797-c5e6-16a0-790b-40ca486f6bcd")
public static String es_PE_FIELD_OrderTax_TaxAmount_Description="Total del impuesto para un documento";

@XendraTrl(Identifier="0163c797-c5e6-16a0-790b-40ca486f6bcd")
public static String es_PE_FIELD_OrderTax_TaxAmount_Help="El Total de Impuesto despliega el total de impuesto para un documento";

@XendraTrl(Identifier="0163c797-c5e6-16a0-790b-40ca486f6bcd")
public static String es_PE_FIELD_OrderTax_TaxAmount_Name="Total del Impuesto";

@XendraField(AD_Column_ID="TaxAmt",IsCentrallyMaintained=true,
AD_Tab_ID="5270301f-d0c1-0c8e-3adb-a0c12b6b70c4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0163c797-c5e6-16a0-790b-40ca486f6bcd")
public static final String FIELDNAME_OrderTax_TaxAmount="0163c797-c5e6-16a0-790b-40ca486f6bcd";

@XendraTrl(Identifier="1d265c55-ca29-b0f7-9c75-e60964850c3e")
public static String es_PE_FIELD_OrderTax_TaxAmount2_Description="Total del impuesto para un documento";

@XendraTrl(Identifier="1d265c55-ca29-b0f7-9c75-e60964850c3e")
public static String es_PE_FIELD_OrderTax_TaxAmount2_Help="El Total de Impuesto despliega el total de impuesto para un documento";

@XendraTrl(Identifier="1d265c55-ca29-b0f7-9c75-e60964850c3e")
public static String es_PE_FIELD_OrderTax_TaxAmount2_Name="Total del Impuesto";

@XendraField(AD_Column_ID="TaxAmt",IsCentrallyMaintained=true,
AD_Tab_ID="b1eb59bc-4998-2a8f-c4d4-7d92003d4243",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1d265c55-ca29-b0f7-9c75-e60964850c3e")
public static final String FIELDNAME_OrderTax_TaxAmount2="1d265c55-ca29-b0f7-9c75-e60964850c3e";

@XendraTrl(Identifier="788d7535-6bb0-0dd4-a961-7ca8e9b0aac7")
public static String es_PE_COLUMN_TaxAmt_Name="Total del Impuesto";

@XendraColumn(AD_Element_ID="462941e1-a196-170f-fd16-84da06ba50ea",ColumnName="TaxAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="788d7535-6bb0-0dd4-a961-7ca8e9b0aac7",
Synchronized="2017-08-05 16:53:58.0")
/** Column name TaxAmt */
public static final String COLUMNNAME_TaxAmt = "TaxAmt";
/** Set Tax base Amount.
@param TaxBaseAmt Base for calculating the tax amount */
public void setTaxBaseAmt (BigDecimal TaxBaseAmt)
{
if (TaxBaseAmt == null) throw new IllegalArgumentException ("TaxBaseAmt is mandatory.");
set_ValueNoCheck (COLUMNNAME_TaxBaseAmt, TaxBaseAmt);
}
/** Get Tax base Amount.
@return Base for calculating the tax amount */
public BigDecimal getTaxBaseAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TaxBaseAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="cda59d77-38c0-cb16-72c0-a23351927082")
public static String es_PE_FIELD_OrderTax_TaxBaseAmount_Description="Base para calcular el total del impuesto";

@XendraTrl(Identifier="cda59d77-38c0-cb16-72c0-a23351927082")
public static String es_PE_FIELD_OrderTax_TaxBaseAmount_Help="El total base de impuesto indica el total base usado para calcular el total de impuesto.";

@XendraTrl(Identifier="cda59d77-38c0-cb16-72c0-a23351927082")
public static String es_PE_FIELD_OrderTax_TaxBaseAmount_Name="Total Base del Impuesto";

@XendraField(AD_Column_ID="TaxBaseAmt",IsCentrallyMaintained=true,
AD_Tab_ID="5270301f-d0c1-0c8e-3adb-a0c12b6b70c4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cda59d77-38c0-cb16-72c0-a23351927082")
public static final String FIELDNAME_OrderTax_TaxBaseAmount="cda59d77-38c0-cb16-72c0-a23351927082";

@XendraTrl(Identifier="f1afdc79-ab3f-51f3-b6f6-764b68214e89")
public static String es_PE_FIELD_OrderTax_TaxBaseAmount2_Description="Base para calcular el total del impuesto";

@XendraTrl(Identifier="f1afdc79-ab3f-51f3-b6f6-764b68214e89")
public static String es_PE_FIELD_OrderTax_TaxBaseAmount2_Help="El total base de impuesto indica el total base usado para calcular el total de impuesto.";

@XendraTrl(Identifier="f1afdc79-ab3f-51f3-b6f6-764b68214e89")
public static String es_PE_FIELD_OrderTax_TaxBaseAmount2_Name="Total Base del Impuesto";

@XendraField(AD_Column_ID="TaxBaseAmt",IsCentrallyMaintained=true,
AD_Tab_ID="b1eb59bc-4998-2a8f-c4d4-7d92003d4243",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f1afdc79-ab3f-51f3-b6f6-764b68214e89")
public static final String FIELDNAME_OrderTax_TaxBaseAmount2="f1afdc79-ab3f-51f3-b6f6-764b68214e89";

@XendraTrl(Identifier="967b59fe-2b5f-df91-3fa2-e5b109723803")
public static String es_PE_COLUMN_TaxBaseAmt_Name="Total Base del Impuesto";

@XendraColumn(AD_Element_ID="11beb746-5f42-cac6-2ece-2c64fb573db9",ColumnName="TaxBaseAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="967b59fe-2b5f-df91-3fa2-e5b109723803",
Synchronized="2017-08-05 16:53:58.0")
/** Column name TaxBaseAmt */
public static final String COLUMNNAME_TaxBaseAmt = "TaxBaseAmt";
}
