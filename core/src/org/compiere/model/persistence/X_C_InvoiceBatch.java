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
/** Generated Model for C_InvoiceBatch
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_InvoiceBatch extends PO
{
/** Standard Constructor
@param ctx context
@param C_InvoiceBatch_ID id
@param trxName transaction
*/
public X_C_InvoiceBatch (Properties ctx, int C_InvoiceBatch_ID, String trxName)
{
super (ctx, C_InvoiceBatch_ID, trxName);
/** if (C_InvoiceBatch_ID == 0)
{
setC_Currency_ID (0);	
// @$C_Currency_ID@
setC_InvoiceBatch_ID (0);
setControlAmt (Env.ZERO);	
// 0
setDateDoc (new Timestamp(System.currentTimeMillis()));	
// @#Date@
setDocumentAmt (Env.ZERO);	
// 0
setDocumentNo (null);
setIsSOTrx (false);	
// N
setProcessed (false);	
// N
setSalesRep_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_InvoiceBatch (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=767 */
public static int Table_ID=MTable.getTable_ID("C_InvoiceBatch");

@XendraTrl(Identifier="7e5b26fe-1d4a-c962-a8ec-f06019ce3918")
public static String es_PE_TAB_InvoiceBatch_Description="De entrada en el Jefe de la Lote de la factura del costo.";

@XendraTrl(Identifier="7e5b26fe-1d4a-c962-a8ec-f06019ce3918")
public static String es_PE_TAB_InvoiceBatch_Name="Lote de Facturas";

@XendraTrl(Identifier="7e5b26fe-1d4a-c962-a8ec-f06019ce3918")
public static String es_PE_TAB_InvoiceBatch_Help="Fije la modernidad y decida si esto para las facturas ó AP (vendedor) de AR (ventas) factura. Incorpore opcionalmente una cantidad del control.";

@XendraTab(Name="Invoice Batch",Description="Enter Expense Invoice Batch Header",
Help="Set Currency and decide if this for AR (sales) Invoices or AP (vendor) invoices. Optionally enter a Control amount.",
AD_Window_ID="7230d536-ef19-160d-ca94-4a751924cb94",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="7e5b26fe-1d4a-c962-a8ec-f06019ce3918",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_InvoiceBatch="7e5b26fe-1d4a-c962-a8ec-f06019ce3918";

@XendraTrl(Identifier="d0a921c4-99a8-ff6e-51ba-28d555e48824")
public static String es_PE_TABLE_C_InvoiceBatch_Name="Facturas en Lote";

@XendraTable(Name="Invoice Batch",Description="Expense Invoice Batch Header",Help="",
TableName="C_InvoiceBatch",AccessLevel="1",AD_Window_ID="7230d536-ef19-160d-ca94-4a751924cb94",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="d0a921c4-99a8-ff6e-51ba-28d555e48824",Synchronized="2017-08-16 11:41:50.0")
/** TableName=C_InvoiceBatch */
public static final String Table_Name="C_InvoiceBatch";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_InvoiceBatch");

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
    Table_ID = MTable.getTable_ID("C_InvoiceBatch");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_InvoiceBatch[").append(get_ID()).append("]");
return sb.toString();
}
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

@XendraTrl(Identifier="8f2ab9b3-a413-807f-311c-338850082f5b")
public static String es_PE_FIELD_InvoiceBatch_CurrencyType_Description="Tipo de índice de conversión de moneda ";

@XendraTrl(Identifier="8f2ab9b3-a413-807f-311c-338850082f5b")
public static String es_PE_FIELD_InvoiceBatch_CurrencyType_Help="El tipo del índice de conversión de monedas le deja definir diversos tipos de tarifas, tarifas ej. del punto, corporativas y/o de Ventas/Compras.";

@XendraTrl(Identifier="8f2ab9b3-a413-807f-311c-338850082f5b")
public static String es_PE_FIELD_InvoiceBatch_CurrencyType_Name="Tipo de Moneda";

@XendraField(AD_Column_ID="C_ConversionType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7e5b26fe-1d4a-c962-a8ec-f06019ce3918",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$C_Currency_ID@!@C_Currency_ID@",DisplayLength=14,IsReadOnly=false,SeqNo=90,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="8f2ab9b3-a413-807f-311c-338850082f5b")
public static final String FIELDNAME_InvoiceBatch_CurrencyType="8f2ab9b3-a413-807f-311c-338850082f5b";

@XendraTrl(Identifier="c982e9e4-b953-e7dc-6e5c-0e2fbe492735")
public static String es_PE_COLUMN_C_ConversionType_ID_Name="Tipo de Moneda";

@XendraColumn(AD_Element_ID="66f5d039-c94d-0957-487b-eb3118bd7719",
ColumnName="C_ConversionType_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c982e9e4-b953-e7dc-6e5c-0e2fbe492735",Synchronized="2017-08-05 16:53:43.0")
/** Column name C_ConversionType_ID */
public static final String COLUMNNAME_C_ConversionType_ID = "C_ConversionType_ID";
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

@XendraTrl(Identifier="fa47a57a-b328-806d-c15f-6869fcac88ea")
public static String es_PE_FIELD_InvoiceBatch_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="fa47a57a-b328-806d-c15f-6869fcac88ea")
public static String es_PE_FIELD_InvoiceBatch_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraTrl(Identifier="fa47a57a-b328-806d-c15f-6869fcac88ea")
public static String es_PE_FIELD_InvoiceBatch_Currency_Name="Moneda";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7e5b26fe-1d4a-c962-a8ec-f06019ce3918",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fa47a57a-b328-806d-c15f-6869fcac88ea")
public static final String FIELDNAME_InvoiceBatch_Currency="fa47a57a-b328-806d-c15f-6869fcac88ea";

@XendraTrl(Identifier="c72a5830-5351-b5fc-6a54-881ac131fcb9")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@$C_Currency_ID@",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c72a5830-5351-b5fc-6a54-881ac131fcb9",Synchronized="2017-08-05 16:53:43.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
/** Set Invoice Batch.
@param C_InvoiceBatch_ID Expense Invoice Batch Header */
public void setC_InvoiceBatch_ID (int C_InvoiceBatch_ID)
{
if (C_InvoiceBatch_ID < 1) throw new IllegalArgumentException ("C_InvoiceBatch_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_InvoiceBatch_ID, Integer.valueOf(C_InvoiceBatch_ID));
}
/** Get Invoice Batch.
@return Expense Invoice Batch Header */
public int getC_InvoiceBatch_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_InvoiceBatch_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="51bca604-f3c1-f657-7f5a-617c5c420059")
public static String es_PE_FIELD_InvoiceBatch_InvoiceBatch_Description="Costo de la factura en lote";

@XendraTrl(Identifier="51bca604-f3c1-f657-7f5a-617c5c420059")
public static String es_PE_FIELD_InvoiceBatch_InvoiceBatch_Name="Facturas en Lote";

@XendraField(AD_Column_ID="C_InvoiceBatch_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7e5b26fe-1d4a-c962-a8ec-f06019ce3918",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="51bca604-f3c1-f657-7f5a-617c5c420059")
public static final String FIELDNAME_InvoiceBatch_InvoiceBatch="51bca604-f3c1-f657-7f5a-617c5c420059";
/** Column name C_InvoiceBatch_ID */
public static final String COLUMNNAME_C_InvoiceBatch_ID = "C_InvoiceBatch_ID";
/** Set Control Amount.
@param ControlAmt If not zero, the Debit amount of the document must be equal this amount */
public void setControlAmt (BigDecimal ControlAmt)
{
if (ControlAmt == null) throw new IllegalArgumentException ("ControlAmt is mandatory.");
set_Value (COLUMNNAME_ControlAmt, ControlAmt);
}
/** Get Control Amount.
@return If not zero, the Debit amount of the document must be equal this amount */
public BigDecimal getControlAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ControlAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="6c30d3a4-e7d7-e70b-73ec-04433e898fcc")
public static String es_PE_FIELD_InvoiceBatch_ControlAmount_Description="Si no es cero; el total del débito del documento debe ser igual a este total";

@XendraTrl(Identifier="6c30d3a4-e7d7-e70b-73ec-04433e898fcc")
public static String es_PE_FIELD_InvoiceBatch_ControlAmount_Help="Si el total de control es cero; ninguna verificación es ejecutada";

@XendraTrl(Identifier="6c30d3a4-e7d7-e70b-73ec-04433e898fcc")
public static String es_PE_FIELD_InvoiceBatch_ControlAmount_Name="Cifra de Control";

@XendraField(AD_Column_ID="ControlAmt",IsCentrallyMaintained=true,
AD_Tab_ID="7e5b26fe-1d4a-c962-a8ec-f06019ce3918",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6c30d3a4-e7d7-e70b-73ec-04433e898fcc")
public static final String FIELDNAME_InvoiceBatch_ControlAmount="6c30d3a4-e7d7-e70b-73ec-04433e898fcc";

@XendraTrl(Identifier="1af23a87-e9f7-f66e-6254-fa6c4f300519")
public static String es_PE_COLUMN_ControlAmt_Name="Cifra de Control";

@XendraColumn(AD_Element_ID="d520c7db-ab46-3aab-ca2d-7ffa7ad5b197",ColumnName="ControlAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1af23a87-e9f7-f66e-6254-fa6c4f300519",
Synchronized="2017-08-05 16:53:43.0")
/** Column name ControlAmt */
public static final String COLUMNNAME_ControlAmt = "ControlAmt";
/** Set DateDoc.
@param DateDoc Date of the Document */
public void setDateDoc (Timestamp DateDoc)
{
if (DateDoc == null) throw new IllegalArgumentException ("DateDoc is mandatory.");
set_Value (COLUMNNAME_DateDoc, DateDoc);
}
/** Get DateDoc.
@return Date of the Document */
public Timestamp getDateDoc() 
{
return (Timestamp)get_Value(COLUMNNAME_DateDoc);
}

@XendraTrl(Identifier="52e64a6c-fff9-5c36-f7e4-ee0cdd48e39c")
public static String es_PE_FIELD_InvoiceBatch_DateDoc_Description="Fecha del documento";

@XendraTrl(Identifier="52e64a6c-fff9-5c36-f7e4-ee0cdd48e39c")
public static String es_PE_FIELD_InvoiceBatch_DateDoc_Help="La fecha del documento indica la fecha en que el documento fue generado. Puede ó no ser la misma que la fecha contable. ";

@XendraTrl(Identifier="52e64a6c-fff9-5c36-f7e4-ee0cdd48e39c")
public static String es_PE_FIELD_InvoiceBatch_DateDoc_Name="F. Documento";

@XendraField(AD_Column_ID="DateDoc",IsCentrallyMaintained=true,
AD_Tab_ID="7e5b26fe-1d4a-c962-a8ec-f06019ce3918",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="52e64a6c-fff9-5c36-f7e4-ee0cdd48e39c")
public static final String FIELDNAME_InvoiceBatch_DateDoc="52e64a6c-fff9-5c36-f7e4-ee0cdd48e39c";

@XendraTrl(Identifier="17155881-4345-4b8d-ae13-0e9e0dbd0755")
public static String es_PE_COLUMN_DateDoc_Name="F. Documento";

@XendraColumn(AD_Element_ID="68f87a38-0b7e-cc52-6990-3b5d2d120d9d",ColumnName="DateDoc",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="@#Date@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="17155881-4345-4b8d-ae13-0e9e0dbd0755",
Synchronized="2017-08-05 16:53:43.0")
/** Column name DateDoc */
public static final String COLUMNNAME_DateDoc = "DateDoc";
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

@XendraTrl(Identifier="cced31e0-5dc2-b991-91a9-1610099a47de")
public static String es_PE_FIELD_InvoiceBatch_Description_Description="Observación";

@XendraTrl(Identifier="cced31e0-5dc2-b991-91a9-1610099a47de")
public static String es_PE_FIELD_InvoiceBatch_Description_Help="Observación";

@XendraTrl(Identifier="cced31e0-5dc2-b991-91a9-1610099a47de")
public static String es_PE_FIELD_InvoiceBatch_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="7e5b26fe-1d4a-c962-a8ec-f06019ce3918",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cced31e0-5dc2-b991-91a9-1610099a47de")
public static final String FIELDNAME_InvoiceBatch_Description="cced31e0-5dc2-b991-91a9-1610099a47de";

@XendraTrl(Identifier="872fc263-6fe1-839a-be91-78ebd69d5c5b")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=true,ColumnSQL="",
IsAllowLogging=false,Identifier="872fc263-6fe1-839a-be91-78ebd69d5c5b",
Synchronized="2017-08-05 16:53:43.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Document Amt.
@param DocumentAmt Document Amount */
public void setDocumentAmt (BigDecimal DocumentAmt)
{
if (DocumentAmt == null) throw new IllegalArgumentException ("DocumentAmt is mandatory.");
set_ValueNoCheck (COLUMNNAME_DocumentAmt, DocumentAmt);
}
/** Get Document Amt.
@return Document Amount */
public BigDecimal getDocumentAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_DocumentAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="55a5641b-9722-17c2-4355-79db2fc4fb79")
public static String es_PE_FIELD_InvoiceBatch_DocumentAmt_Description="Importe del Documento";

@XendraTrl(Identifier="55a5641b-9722-17c2-4355-79db2fc4fb79")
public static String es_PE_FIELD_InvoiceBatch_DocumentAmt_Name="Importe del Documento";

@XendraField(AD_Column_ID="DocumentAmt",IsCentrallyMaintained=true,
AD_Tab_ID="7e5b26fe-1d4a-c962-a8ec-f06019ce3918",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="55a5641b-9722-17c2-4355-79db2fc4fb79")
public static final String FIELDNAME_InvoiceBatch_DocumentAmt="55a5641b-9722-17c2-4355-79db2fc4fb79";

@XendraTrl(Identifier="ac8dc511-e68c-6762-73aa-cae77aeef08c")
public static String es_PE_COLUMN_DocumentAmt_Name="Importe del Documento";

@XendraColumn(AD_Element_ID="80d44bc7-901a-7ef0-3ee9-22c71b66c993",ColumnName="DocumentAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ac8dc511-e68c-6762-73aa-cae77aeef08c",
Synchronized="2017-08-05 16:53:43.0")
/** Column name DocumentAmt */
public static final String COLUMNNAME_DocumentAmt = "DocumentAmt";
/** Set Document No.
@param DocumentNo Document sequence number of the document */
public void setDocumentNo (String DocumentNo)
{
if (DocumentNo == null) throw new IllegalArgumentException ("DocumentNo is mandatory.");
if (DocumentNo.length() > 30)
{
log.warning("Length > 30 - truncated");
DocumentNo = DocumentNo.substring(0,29);
}
set_Value (COLUMNNAME_DocumentNo, DocumentNo);
}
/** Get Document No.
@return Document sequence number of the document */
public String getDocumentNo() 
{
String value = (String)get_Value(COLUMNNAME_DocumentNo);
if (value == null)
  return "";
return value;
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getDocumentNo());
}

@XendraTrl(Identifier="cb6a136e-183c-91d2-ce74-15726c40c01f")
public static String es_PE_FIELD_InvoiceBatch_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="cb6a136e-183c-91d2-ce74-15726c40c01f")
public static String es_PE_FIELD_InvoiceBatch_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraTrl(Identifier="cb6a136e-183c-91d2-ce74-15726c40c01f")
public static String es_PE_FIELD_InvoiceBatch_DocumentNo_Name="No. del Documento";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="7e5b26fe-1d4a-c962-a8ec-f06019ce3918",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=30,SortNo=-1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cb6a136e-183c-91d2-ce74-15726c40c01f")
public static final String FIELDNAME_InvoiceBatch_DocumentNo="cb6a136e-183c-91d2-ce74-15726c40c01f";

@XendraTrl(Identifier="5e84847d-bcfa-bcdf-dec1-a4230b6b4e97")
public static String es_PE_COLUMN_DocumentNo_Name="No. del Documento";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5e84847d-bcfa-bcdf-dec1-a4230b6b4e97",
Synchronized="2017-08-05 16:53:43.0")
/** Column name DocumentNo */
public static final String COLUMNNAME_DocumentNo = "DocumentNo";
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
@XendraTrl(Identifier="331de0f8-8c4a-4304-8a05-ecd9d72e4b8b")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="331de0f8-8c4a-4304-8a05-ecd9d72e4b8b",
Synchronized="2017-08-05 16:53:43.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Sales Transaction.
@param IsSOTrx This is a Sales Transaction */
public void setIsSOTrx (boolean IsSOTrx)
{
set_Value (COLUMNNAME_IsSOTrx, Boolean.valueOf(IsSOTrx));
}
/** Get Sales Transaction.
@return This is a Sales Transaction */
public boolean isSOTrx() 
{
Object oo = get_Value(COLUMNNAME_IsSOTrx);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="4c3c7c07-5726-6b5e-513e-d6c88294c2f8")
public static String es_PE_FIELD_InvoiceBatch_SalesTransaction_Description="Esta es una transacción de ventas";

@XendraTrl(Identifier="4c3c7c07-5726-6b5e-513e-d6c88294c2f8")
public static String es_PE_FIELD_InvoiceBatch_SalesTransaction_Help="El cuadro de verificación Transacción de Ventas indica si este ítem es una transacción de ventas";

@XendraTrl(Identifier="4c3c7c07-5726-6b5e-513e-d6c88294c2f8")
public static String es_PE_FIELD_InvoiceBatch_SalesTransaction_Name="Transacción de Ventas";

@XendraField(AD_Column_ID="IsSOTrx",IsCentrallyMaintained=true,
AD_Tab_ID="7e5b26fe-1d4a-c962-a8ec-f06019ce3918",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4c3c7c07-5726-6b5e-513e-d6c88294c2f8")
public static final String FIELDNAME_InvoiceBatch_SalesTransaction="4c3c7c07-5726-6b5e-513e-d6c88294c2f8";

@XendraTrl(Identifier="f6a8069a-98ef-f2d5-908d-c8e9cdd3e794")
public static String es_PE_COLUMN_IsSOTrx_Name="Transacción de Ventas";

@XendraColumn(AD_Element_ID="4084b69f-a51d-5676-4d8c-395a13e6b2df",ColumnName="IsSOTrx",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f6a8069a-98ef-f2d5-908d-c8e9cdd3e794",
Synchronized="2017-08-05 16:53:43.0")
/** Column name IsSOTrx */
public static final String COLUMNNAME_IsSOTrx = "IsSOTrx";
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

@XendraTrl(Identifier="583f085c-50ff-5eef-738b-3d31a603175b")
public static String es_PE_FIELD_InvoiceBatch_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="583f085c-50ff-5eef-738b-3d31a603175b")
public static String es_PE_FIELD_InvoiceBatch_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="583f085c-50ff-5eef-738b-3d31a603175b")
public static String es_PE_FIELD_InvoiceBatch_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="7e5b26fe-1d4a-c962-a8ec-f06019ce3918",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=130,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="583f085c-50ff-5eef-738b-3d31a603175b")
public static final String FIELDNAME_InvoiceBatch_Processed="583f085c-50ff-5eef-738b-3d31a603175b";

@XendraTrl(Identifier="8724b888-1de3-1f6d-38a1-86f778701137")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8724b888-1de3-1f6d-38a1-86f778701137",
Synchronized="2017-08-05 16:53:44.0")
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

@XendraTrl(Identifier="b910572c-617e-5374-b167-526c192f8973")
public static String es_PE_FIELD_InvoiceBatch_ProcessNow_Name="Crea las facturas";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="7e5b26fe-1d4a-c962-a8ec-f06019ce3918",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b910572c-617e-5374-b167-526c192f8973")
public static final String FIELDNAME_InvoiceBatch_ProcessNow="b910572c-617e-5374-b167-526c192f8973";

@XendraTrl(Identifier="f6cd4086-d54f-f529-2bc8-1604612fc285")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="@Processed@=Y",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",
ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,
AD_Process_ID="7fde260f-2445-279f-8a5b-4c3b84d2fa07",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f6cd4086-d54f-f529-2bc8-1604612fc285",
Synchronized="2017-08-05 16:53:44.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";

/** SalesRep_ID AD_Reference=15251147-a1b6-4a83-a3a5-2d3ae7db69d9 */
public static final int SALESREP_ID_AD_Reference_ID=190;
/** Set Sales Representative.
@param SalesRep_ID Sales Representative or Company Agent */
public void setSalesRep_ID (int SalesRep_ID)
{
if (SalesRep_ID < 1) throw new IllegalArgumentException ("SalesRep_ID is mandatory.");
set_Value (COLUMNNAME_SalesRep_ID, Integer.valueOf(SalesRep_ID));
}
/** Get Sales Representative.
@return Sales Representative or Company Agent */
public int getSalesRep_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_SalesRep_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="579e2d21-83cc-b659-871e-38a319fa9489")
public static String es_PE_FIELD_InvoiceBatch_CompanyAgent_Description="Comprador/ Agente";

@XendraTrl(Identifier="579e2d21-83cc-b659-871e-38a319fa9489")
public static String es_PE_FIELD_InvoiceBatch_CompanyAgent_Help="Agente de compras para el documento.";

@XendraTrl(Identifier="579e2d21-83cc-b659-871e-38a319fa9489")
public static String es_PE_FIELD_InvoiceBatch_CompanyAgent_Name="Comprador";

@XendraField(AD_Column_ID="SalesRep_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7e5b26fe-1d4a-c962-a8ec-f06019ce3918",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="579e2d21-83cc-b659-871e-38a319fa9489")
public static final String FIELDNAME_InvoiceBatch_CompanyAgent="579e2d21-83cc-b659-871e-38a319fa9489";

@XendraTrl(Identifier="08e69054-d423-5591-9739-64425e0009b5")
public static String es_PE_COLUMN_SalesRep_ID_Name="Agente Cía";

@XendraColumn(AD_Element_ID="197a9c3a-ff10-c291-d65f-5e05a36d3710",ColumnName="SalesRep_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="15251147-a1b6-4a83-a3a5-2d3ae7db69d9",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="08e69054-d423-5591-9739-64425e0009b5",Synchronized="2017-08-05 16:53:44.0")
/** Column name SalesRep_ID */
public static final String COLUMNNAME_SalesRep_ID = "SalesRep_ID";
}
