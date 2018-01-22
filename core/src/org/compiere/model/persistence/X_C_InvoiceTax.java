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
/** Generated Model for C_InvoiceTax
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_InvoiceTax extends PO
{
/** Standard Constructor
@param ctx context
@param C_InvoiceTax_ID id
@param trxName transaction
*/
public X_C_InvoiceTax (Properties ctx, int C_InvoiceTax_ID, String trxName)
{
super (ctx, C_InvoiceTax_ID, trxName);
/** if (C_InvoiceTax_ID == 0)
{
setC_Invoice_ID (0);
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
public X_C_InvoiceTax (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=334 */
public static int Table_ID=MTable.getTable_ID("C_InvoiceTax");

@XendraTrl(Identifier="b661048d-d815-f55c-8017-f005488721f7")
public static String es_PE_TAB_InvoiceTax_Description="Impuesto de la Factura del Proveedor";

@XendraTrl(Identifier="b661048d-d815-f55c-8017-f005488721f7")
public static String es_PE_TAB_InvoiceTax_Name="Impuesto de Factura";

@XendraTrl(Identifier="b661048d-d815-f55c-8017-f005488721f7")
public static String es_PE_TAB_InvoiceTax_Help="La pestaña Impuesto de Factura despliega el impuesto total basado en las líneas de la factura.";

@XendraTab(Name="Invoice Tax",Description="Vendor Invoice Tax",
Help="The Invoice Tax Tab displays the total tax due based on the Invoice Lines. ",
AD_Window_ID="f7b55b8d-31bd-29ee-4626-2d3ad620dccb",SeqNo=70,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,
AD_Column_ID="da61a2f1-af79-c212-7bf2-a8d7c271a613",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="b661048d-d815-f55c-8017-f005488721f7",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_InvoiceTax="b661048d-d815-f55c-8017-f005488721f7";

@XendraTrl(Identifier="1d3fdf6c-d40b-a685-478a-d66a8fbbc976")
public static String es_PE_TAB_InvoiceTax2_Description="Impuesto de Factura del Cliente";

@XendraTrl(Identifier="1d3fdf6c-d40b-a685-478a-d66a8fbbc976")
public static String es_PE_TAB_InvoiceTax2_Name="Impuesto de la Factura";

@XendraTrl(Identifier="1d3fdf6c-d40b-a685-478a-d66a8fbbc976")
public static String es_PE_TAB_InvoiceTax2_Help="La pestaña Impuesto de Factura despliega el impuesto total por pagar basado en las líneas de la factura.";

@XendraTab(Name="Invoice Tax",Description="Customer Invoice Tax",
Help="The Invoice Tax Tab displays the total tax due based on the Invoice Lines.",
AD_Window_ID="dc1a37c5-086c-c19e-c2ba-344555bfcf65",SeqNo=30,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,
AD_Column_ID="da61a2f1-af79-c212-7bf2-a8d7c271a613",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="1d3fdf6c-d40b-a685-478a-d66a8fbbc976",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_InvoiceTax2="1d3fdf6c-d40b-a685-478a-d66a8fbbc976";

@XendraTrl(Identifier="616baa0a-0922-8763-a735-41e33d182f44")
public static String es_PE_TABLE_C_InvoiceTax_Name="C_InvoiceTax";

@XendraTable(Name="C_InvoiceTax",Description="",Help="",TableName="C_InvoiceTax",AccessLevel="1",
AD_Window_ID="dc1a37c5-086c-c19e-c2ba-344555bfcf65",AD_Val_Rule_ID="",IsKey=0,LoadSeq=145,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="f7b55b8d-31bd-29ee-4626-2d3ad620dccb",ID="org.xendra.commercial",
Identifier="616baa0a-0922-8763-a735-41e33d182f44",Synchronized="2017-08-16 11:41:57.0")
/** TableName=C_InvoiceTax */
public static final String Table_Name="C_InvoiceTax";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_InvoiceTax");

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
    Table_ID = MTable.getTable_ID("C_InvoiceTax");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_InvoiceTax[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Invoice.
@param C_Invoice_ID Invoice Identifier */
public void setC_Invoice_ID (int C_Invoice_ID)
{
if (C_Invoice_ID < 1) throw new IllegalArgumentException ("C_Invoice_ID is mandatory.");
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

@XendraTrl(Identifier="9239e304-739a-c994-fac6-783729070e6a")
public static String es_PE_FIELD_InvoiceTax_Invoice_Description="Identificador de la factura";

@XendraTrl(Identifier="9239e304-739a-c994-fac6-783729070e6a")
public static String es_PE_FIELD_InvoiceTax_Invoice_Help="La ID de Factura identifica únicamente un documento de Factura.";

@XendraTrl(Identifier="9239e304-739a-c994-fac6-783729070e6a")
public static String es_PE_FIELD_InvoiceTax_Invoice_Name="Factura";

@XendraField(AD_Column_ID="C_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1d3fdf6c-d40b-a685-478a-d66a8fbbc976",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9239e304-739a-c994-fac6-783729070e6a")
public static final String FIELDNAME_InvoiceTax_Invoice="9239e304-739a-c994-fac6-783729070e6a";

@XendraTrl(Identifier="633a6c14-9cf0-da00-9e26-db4cb08e9337")
public static String es_PE_FIELD_InvoiceTax_Invoice2_Description="Identificador de la factura";

@XendraTrl(Identifier="633a6c14-9cf0-da00-9e26-db4cb08e9337")
public static String es_PE_FIELD_InvoiceTax_Invoice2_Help="La ID de Factura identifica únicamente un documento de Factura.";

@XendraTrl(Identifier="633a6c14-9cf0-da00-9e26-db4cb08e9337")
public static String es_PE_FIELD_InvoiceTax_Invoice2_Name="Factura";

@XendraField(AD_Column_ID="C_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b661048d-d815-f55c-8017-f005488721f7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="633a6c14-9cf0-da00-9e26-db4cb08e9337")
public static final String FIELDNAME_InvoiceTax_Invoice2="633a6c14-9cf0-da00-9e26-db4cb08e9337";

@XendraTrl(Identifier="da61a2f1-af79-c212-7bf2-a8d7c271a613")
public static String es_PE_COLUMN_C_Invoice_ID_Name="Factura";

@XendraColumn(AD_Element_ID="e526ea57-1bdf-9871-fd57-0df3c1f9dd42",ColumnName="C_Invoice_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="da61a2f1-af79-c212-7bf2-a8d7c271a613",
Synchronized="2017-08-05 16:53:49.0")
/** Column name C_Invoice_ID */
public static final String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
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

@XendraTrl(Identifier="0c26188d-46d3-18dc-93f6-2e2169139a0b")
public static String es_PE_FIELD_InvoiceTax_Tax_Description="Identificador del Impuesto";

@XendraTrl(Identifier="0c26188d-46d3-18dc-93f6-2e2169139a0b")
public static String es_PE_FIELD_InvoiceTax_Tax_Help="El Impuesto indica el tipo de impuesto para esta línea del documento";

@XendraTrl(Identifier="0c26188d-46d3-18dc-93f6-2e2169139a0b")
public static String es_PE_FIELD_InvoiceTax_Tax_Name="Impuesto";

@XendraField(AD_Column_ID="C_Tax_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1d3fdf6c-d40b-a685-478a-d66a8fbbc976",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0c26188d-46d3-18dc-93f6-2e2169139a0b")
public static final String FIELDNAME_InvoiceTax_Tax="0c26188d-46d3-18dc-93f6-2e2169139a0b";

@XendraTrl(Identifier="f0e0f525-9ad2-9aca-452c-a0a3bbcdac63")
public static String es_PE_FIELD_InvoiceTax_Tax2_Description="Identificador del Impuesto";

@XendraTrl(Identifier="f0e0f525-9ad2-9aca-452c-a0a3bbcdac63")
public static String es_PE_FIELD_InvoiceTax_Tax2_Help="El Impuesto indica el tipo de impuesto para esta línea del documento";

@XendraTrl(Identifier="f0e0f525-9ad2-9aca-452c-a0a3bbcdac63")
public static String es_PE_FIELD_InvoiceTax_Tax2_Name="Impuesto";

@XendraField(AD_Column_ID="C_Tax_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b661048d-d815-f55c-8017-f005488721f7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f0e0f525-9ad2-9aca-452c-a0a3bbcdac63")
public static final String FIELDNAME_InvoiceTax_Tax2="f0e0f525-9ad2-9aca-452c-a0a3bbcdac63";

@XendraTrl(Identifier="c16d4af7-0ffc-79f6-d6be-dad43ebe2cc3")
public static String es_PE_COLUMN_C_Tax_ID_Name="Impuesto";

@XendraColumn(AD_Element_ID="38ff24fc-b68c-51a9-60f8-ef2a1f060de2",ColumnName="C_Tax_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c16d4af7-0ffc-79f6-d6be-dad43ebe2cc3",
Synchronized="2017-08-05 16:53:49.0")
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
@XendraTrl(Identifier="fb0a6380-fa08-406c-a252-1e8a8c889e6c")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fb0a6380-fa08-406c-a252-1e8a8c889e6c",
Synchronized="2017-08-05 16:53:49.0")
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

@XendraTrl(Identifier="ba79a7db-de77-d43b-abca-14f5f30f3b3d")
public static String es_PE_FIELD_InvoiceTax_PriceIncludesTax_Description="Impuesto incluido en el precio";

@XendraTrl(Identifier="ba79a7db-de77-d43b-abca-14f5f30f3b3d")
public static String es_PE_FIELD_InvoiceTax_PriceIncludesTax_Help="El cuadro de verificación Impuesto Incluido indica que el precio incluye impuestos. Esto es también conocido como el precio bruto";

@XendraTrl(Identifier="ba79a7db-de77-d43b-abca-14f5f30f3b3d")
public static String es_PE_FIELD_InvoiceTax_PriceIncludesTax_Name="Impuesto Incluido en el Precio";

@XendraField(AD_Column_ID="IsTaxIncluded",IsCentrallyMaintained=true,
AD_Tab_ID="1d3fdf6c-d40b-a685-478a-d66a8fbbc976",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ba79a7db-de77-d43b-abca-14f5f30f3b3d")
public static final String FIELDNAME_InvoiceTax_PriceIncludesTax="ba79a7db-de77-d43b-abca-14f5f30f3b3d";

@XendraTrl(Identifier="82b95418-c9f6-f4af-503f-3969f254d3d1")
public static String es_PE_FIELD_InvoiceTax_PriceIncludesTax2_Description="Impuesto incluido en el precio";

@XendraTrl(Identifier="82b95418-c9f6-f4af-503f-3969f254d3d1")
public static String es_PE_FIELD_InvoiceTax_PriceIncludesTax2_Help="El cuadro de verificación Impuesto Incluido indica que el precio incluye impuestos. Esto es también conocido como el precio bruto";

@XendraTrl(Identifier="82b95418-c9f6-f4af-503f-3969f254d3d1")
public static String es_PE_FIELD_InvoiceTax_PriceIncludesTax2_Name="Impuesto Incluido en el Precio";

@XendraField(AD_Column_ID="IsTaxIncluded",IsCentrallyMaintained=true,
AD_Tab_ID="b661048d-d815-f55c-8017-f005488721f7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="82b95418-c9f6-f4af-503f-3969f254d3d1")
public static final String FIELDNAME_InvoiceTax_PriceIncludesTax2="82b95418-c9f6-f4af-503f-3969f254d3d1";

@XendraTrl(Identifier="aaf99fa3-8a50-924b-5088-01a3c08228fd")
public static String es_PE_COLUMN_IsTaxIncluded_Name="Impuesto Incluido en el Precio";

@XendraColumn(AD_Element_ID="eb0a6d55-2fff-a462-20b8-744571a3fe60",ColumnName="IsTaxIncluded",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="aaf99fa3-8a50-924b-5088-01a3c08228fd",
Synchronized="2017-08-05 16:53:49.0")
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

@XendraTrl(Identifier="2e5fae61-4868-fa0f-47d0-1e5e61c93b23")
public static String es_PE_FIELD_InvoiceTax_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="2e5fae61-4868-fa0f-47d0-1e5e61c93b23")
public static String es_PE_FIELD_InvoiceTax_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="2e5fae61-4868-fa0f-47d0-1e5e61c93b23")
public static String es_PE_FIELD_InvoiceTax_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="1d3fdf6c-d40b-a685-478a-d66a8fbbc976",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2e5fae61-4868-fa0f-47d0-1e5e61c93b23")
public static final String FIELDNAME_InvoiceTax_Processed="2e5fae61-4868-fa0f-47d0-1e5e61c93b23";

@XendraTrl(Identifier="3c62ad8e-9e04-2642-b907-12f9185edd6d")
public static String es_PE_FIELD_InvoiceTax_Processed2_Description="El documento ha sido procesado";

@XendraTrl(Identifier="3c62ad8e-9e04-2642-b907-12f9185edd6d")
public static String es_PE_FIELD_InvoiceTax_Processed2_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="3c62ad8e-9e04-2642-b907-12f9185edd6d")
public static String es_PE_FIELD_InvoiceTax_Processed2_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="b661048d-d815-f55c-8017-f005488721f7",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3c62ad8e-9e04-2642-b907-12f9185edd6d")
public static final String FIELDNAME_InvoiceTax_Processed2="3c62ad8e-9e04-2642-b907-12f9185edd6d";

@XendraTrl(Identifier="1bb708f8-01b4-5504-741f-d4de3b9cce29")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1bb708f8-01b4-5504-741f-d4de3b9cce29",
Synchronized="2017-08-05 16:53:49.0")
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

@XendraTrl(Identifier="05571c9a-23da-20a9-1327-f7976d0c1c0d")
public static String es_PE_FIELD_InvoiceTax_TaxAmount_Description="Total del impuesto para un documento";

@XendraTrl(Identifier="05571c9a-23da-20a9-1327-f7976d0c1c0d")
public static String es_PE_FIELD_InvoiceTax_TaxAmount_Help="El Total de Impuesto despliega el total de impuesto para un documento";

@XendraTrl(Identifier="05571c9a-23da-20a9-1327-f7976d0c1c0d")
public static String es_PE_FIELD_InvoiceTax_TaxAmount_Name="Total del Impuesto";

@XendraField(AD_Column_ID="TaxAmt",IsCentrallyMaintained=true,
AD_Tab_ID="1d3fdf6c-d40b-a685-478a-d66a8fbbc976",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="05571c9a-23da-20a9-1327-f7976d0c1c0d")
public static final String FIELDNAME_InvoiceTax_TaxAmount="05571c9a-23da-20a9-1327-f7976d0c1c0d";

@XendraTrl(Identifier="5ee2ba0c-0c78-7e55-e7ae-15d1a800d063")
public static String es_PE_FIELD_InvoiceTax_TaxAmount2_Description="Total del impuesto para un documento";

@XendraTrl(Identifier="5ee2ba0c-0c78-7e55-e7ae-15d1a800d063")
public static String es_PE_FIELD_InvoiceTax_TaxAmount2_Help="El Total de Impuesto despliega el total de impuesto para un documento";

@XendraTrl(Identifier="5ee2ba0c-0c78-7e55-e7ae-15d1a800d063")
public static String es_PE_FIELD_InvoiceTax_TaxAmount2_Name="Total del Impuesto";

@XendraField(AD_Column_ID="TaxAmt",IsCentrallyMaintained=true,
AD_Tab_ID="b661048d-d815-f55c-8017-f005488721f7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5ee2ba0c-0c78-7e55-e7ae-15d1a800d063")
public static final String FIELDNAME_InvoiceTax_TaxAmount2="5ee2ba0c-0c78-7e55-e7ae-15d1a800d063";

@XendraTrl(Identifier="fb44f687-90aa-e8cc-6d62-68391ff2f027")
public static String es_PE_COLUMN_TaxAmt_Name="Total del Impuesto";

@XendraColumn(AD_Element_ID="462941e1-a196-170f-fd16-84da06ba50ea",ColumnName="TaxAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fb44f687-90aa-e8cc-6d62-68391ff2f027",
Synchronized="2017-08-05 16:53:49.0")
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

@XendraTrl(Identifier="6d0bd7e8-2260-8a03-4815-7a79bf1137fe")
public static String es_PE_FIELD_InvoiceTax_TaxBaseAmount_Description="Base para calcular el total del impuesto";

@XendraTrl(Identifier="6d0bd7e8-2260-8a03-4815-7a79bf1137fe")
public static String es_PE_FIELD_InvoiceTax_TaxBaseAmount_Help="El total base de impuesto indica el total base usado para calcular el total de impuesto.";

@XendraTrl(Identifier="6d0bd7e8-2260-8a03-4815-7a79bf1137fe")
public static String es_PE_FIELD_InvoiceTax_TaxBaseAmount_Name="Total Base del Impuesto";

@XendraField(AD_Column_ID="TaxBaseAmt",IsCentrallyMaintained=true,
AD_Tab_ID="1d3fdf6c-d40b-a685-478a-d66a8fbbc976",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6d0bd7e8-2260-8a03-4815-7a79bf1137fe")
public static final String FIELDNAME_InvoiceTax_TaxBaseAmount="6d0bd7e8-2260-8a03-4815-7a79bf1137fe";

@XendraTrl(Identifier="0cb7b7aa-75f0-8fe3-5cb9-1f477f1bb7a3")
public static String es_PE_FIELD_InvoiceTax_TaxBaseAmount2_Description="Base para calcular el total del impuesto";

@XendraTrl(Identifier="0cb7b7aa-75f0-8fe3-5cb9-1f477f1bb7a3")
public static String es_PE_FIELD_InvoiceTax_TaxBaseAmount2_Help="El total base de impuesto indica el total base usado para calcular el total de impuesto.";

@XendraTrl(Identifier="0cb7b7aa-75f0-8fe3-5cb9-1f477f1bb7a3")
public static String es_PE_FIELD_InvoiceTax_TaxBaseAmount2_Name="Total Base del Impuesto";

@XendraField(AD_Column_ID="TaxBaseAmt",IsCentrallyMaintained=true,
AD_Tab_ID="b661048d-d815-f55c-8017-f005488721f7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0cb7b7aa-75f0-8fe3-5cb9-1f477f1bb7a3")
public static final String FIELDNAME_InvoiceTax_TaxBaseAmount2="0cb7b7aa-75f0-8fe3-5cb9-1f477f1bb7a3";

@XendraTrl(Identifier="dff62a3e-7ea6-2469-cae2-5d1433547267")
public static String es_PE_COLUMN_TaxBaseAmt_Name="Total Base del Impuesto";

@XendraColumn(AD_Element_ID="11beb746-5f42-cac6-2ece-2c64fb573db9",ColumnName="TaxBaseAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dff62a3e-7ea6-2469-cae2-5d1433547267",
Synchronized="2017-08-05 16:53:49.0")
/** Column name TaxBaseAmt */
public static final String COLUMNNAME_TaxBaseAmt = "TaxBaseAmt";
}
