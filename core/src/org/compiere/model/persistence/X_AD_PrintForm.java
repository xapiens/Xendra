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
/** Generated Model for AD_PrintForm
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_PrintForm extends PO
{
/** Standard Constructor
@param ctx context
@param AD_PrintForm_ID id
@param trxName transaction
*/
public X_AD_PrintForm (Properties ctx, int AD_PrintForm_ID, String trxName)
{
super (ctx, AD_PrintForm_ID, trxName);
/** if (AD_PrintForm_ID == 0)
{
setAD_PrintForm_ID (0);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_PrintForm (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=454 */
public static int Table_ID=MTable.getTable_ID("AD_PrintForm");

@XendraTrl(Identifier="7fd4508b-1b06-5121-22dc-f7e49fdd6f2f")
public static String es_PE_TAB_PrintForm_Description="Mantener información de formas de impresión (facturas; cheques;...)";

@XendraTrl(Identifier="7fd4508b-1b06-5121-22dc-f7e49fdd6f2f")
public static String es_PE_TAB_PrintForm_Help="La selección determina que formato de impresión es usado para imprimir una forma particular para su organización.";

@XendraTrl(Identifier="7fd4508b-1b06-5121-22dc-f7e49fdd6f2f")
public static String es_PE_TAB_PrintForm_Name="Forma de Impresión";
@XendraTab(Name="Print Form",
Description="Maintain Print Form (Invoices, Checks, ..) information",
Help="The selection determines what Print Format is used to print a particular Form for your Organization.",
AD_Window_ID="3696eb29-48f6-fd4c-c4cc-b5eba9fbb0be",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="7fd4508b-1b06-5121-22dc-f7e49fdd6f2f",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_PrintForm="7fd4508b-1b06-5121-22dc-f7e49fdd6f2f";

@XendraTrl(Identifier="af0cd8c0-da92-532c-bf99-bee4874f4e50")
public static String es_PE_TABLE_AD_PrintForm_Name="Formato de Impresión";

@XendraTable(Name="Print Form",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Form",Help="",
TableName="AD_PrintForm",AccessLevel="6",AD_Window_ID="3696eb29-48f6-fd4c-c4cc-b5eba9fbb0be",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="af0cd8c0-da92-532c-bf99-bee4874f4e50",Synchronized="2020-03-03 21:35:21.0")
/** TableName=AD_PrintForm */
public static final String Table_Name="AD_PrintForm";


@XendraIndex(Name="ad_printform_client",Identifier="5d847425-c80f-5fdd-4a96-be20b0d03c95",
Column_Names="ad_client_id, ad_org_id",IsUnique="true",
TableIdentifier="5d847425-c80f-5fdd-4a96-be20b0d03c95",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_ad_printform_client = "5d847425-c80f-5fdd-4a96-be20b0d03c95";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_PrintForm");

protected BigDecimal accessLevel = BigDecimal.valueOf(6);
/** AccessLevel
@return 6 - System - Client 
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
    Table_ID = MTable.getTable_ID("AD_PrintForm");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_PrintForm[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Print Form.
@param AD_PrintForm_ID Form */
public void setAD_PrintForm_ID (int AD_PrintForm_ID)
{
if (AD_PrintForm_ID < 1) throw new IllegalArgumentException ("AD_PrintForm_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_PrintForm_ID, Integer.valueOf(AD_PrintForm_ID));
}
/** Get Print Form.
@return Form */
public int getAD_PrintForm_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_PrintForm_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1184ff46-bd28-85a8-72aa-754619fbad9b")
public static String es_PE_FIELD_PrintForm_PrintForm_Name="Formato de Impresión";

@XendraField(AD_Column_ID="AD_PrintForm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7fd4508b-1b06-5121-22dc-f7e49fdd6f2f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1184ff46-bd28-85a8-72aa-754619fbad9b")
public static final String FIELDNAME_PrintForm_PrintForm="1184ff46-bd28-85a8-72aa-754619fbad9b";
/** Column name AD_PrintForm_ID */
public static final String COLUMNNAME_AD_PrintForm_ID = "AD_PrintForm_ID";
/** Set BOE_PrintFormat_ID.
@param BOE_PrintFormat_ID BOE_PrintFormat_ID */
public void setBOE_PrintFormat_ID (int BOE_PrintFormat_ID)
{
if (BOE_PrintFormat_ID <= 0) set_Value (COLUMNNAME_BOE_PrintFormat_ID, null);
 else 
set_Value (COLUMNNAME_BOE_PrintFormat_ID, Integer.valueOf(BOE_PrintFormat_ID));
}
/** Get BOE_PrintFormat_ID.
@return BOE_PrintFormat_ID */
public int getBOE_PrintFormat_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_BOE_PrintFormat_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="547eb75b-8f1b-30ee-498b-14e2230367ef")
public static String es_PE_FIELD_PrintForm_BOE_PrintFormat_ID_Name="Formato de Impresion de Letras de Cambio";

@XendraField(AD_Column_ID="BOE_PrintFormat_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7fd4508b-1b06-5121-22dc-f7e49fdd6f2f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="547eb75b-8f1b-30ee-498b-14e2230367ef")
public static final String FIELDNAME_PrintForm_BOE_PrintFormat_ID="547eb75b-8f1b-30ee-498b-14e2230367ef";

@XendraTrl(Identifier="123e8f29-412d-35bf-9fb0-7084c59f0983")
public static String es_PE_COLUMN_BOE_PrintFormat_ID_Name="boe_printformat_id";

@XendraColumn(AD_Element_ID="ceb7c948-eae8-a56a-4985-f9c457f5c298",ColumnName="BOE_PrintFormat_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="377b8075-d154-6c3b-1cc0-dea545937fae",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="123e8f29-412d-35bf-9fb0-7084c59f0983",Synchronized="2019-08-30 22:20:31.0")
/** Column name BOE_PrintFormat_ID */
public static final String COLUMNNAME_BOE_PrintFormat_ID = "BOE_PrintFormat_ID";
/** Set BOE_Process_ID.
@param BOE_Process_ID BOE_Process_ID */
public void setBOE_Process_ID (int BOE_Process_ID)
{
if (BOE_Process_ID <= 0) set_Value (COLUMNNAME_BOE_Process_ID, null);
 else 
set_Value (COLUMNNAME_BOE_Process_ID, Integer.valueOf(BOE_Process_ID));
}
/** Get BOE_Process_ID.
@return BOE_Process_ID */
public int getBOE_Process_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_BOE_Process_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="030afe22-7199-cf97-52cc-ab5ea071a28b")
public static String es_PE_FIELD_PrintForm_BOE_Process_ID_Name="Proceso de Letra";

@XendraField(AD_Column_ID="BOE_Process_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7fd4508b-1b06-5121-22dc-f7e49fdd6f2f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="030afe22-7199-cf97-52cc-ab5ea071a28b")
public static final String FIELDNAME_PrintForm_BOE_Process_ID="030afe22-7199-cf97-52cc-ab5ea071a28b";

@XendraTrl(Identifier="26304f7e-b995-0a10-9b28-c107ea474ef0")
public static String es_PE_COLUMN_BOE_Process_ID_Name="boe_process_id";

@XendraColumn(AD_Element_ID="1d6e7d3a-1129-c9c2-e63d-440a0d221668",ColumnName="BOE_Process_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="377b8075-d154-6c3b-1cc0-dea545937fae",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="26304f7e-b995-0a10-9b28-c107ea474ef0",Synchronized="2019-08-30 22:20:31.0")
/** Column name BOE_Process_ID */
public static final String COLUMNNAME_BOE_Process_ID = "BOE_Process_ID";
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

@XendraTrl(Identifier="cdfdfe8a-1085-63f0-9cb9-39185af594d6")
public static String es_PE_FIELD_PrintForm_Description_Name="Observación";

@XendraTrl(Identifier="cdfdfe8a-1085-63f0-9cb9-39185af594d6")
public static String es_PE_FIELD_PrintForm_Description_Description="Observación";

@XendraTrl(Identifier="cdfdfe8a-1085-63f0-9cb9-39185af594d6")
public static String es_PE_FIELD_PrintForm_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="7fd4508b-1b06-5121-22dc-f7e49fdd6f2f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cdfdfe8a-1085-63f0-9cb9-39185af594d6")
public static final String FIELDNAME_PrintForm_Description="cdfdfe8a-1085-63f0-9cb9-39185af594d6";

@XendraTrl(Identifier="449b497a-bb3d-7f33-cfd1-4fd0b76c4052")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="449b497a-bb3d-7f33-cfd1-4fd0b76c4052",
Synchronized="2019-08-30 22:20:31.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Distrib_Order_MailText_ID.
@param Distrib_Order_MailText_ID Distrib_Order_MailText_ID */
public void setDistrib_Order_MailText_ID (int Distrib_Order_MailText_ID)
{
if (Distrib_Order_MailText_ID <= 0) set_Value (COLUMNNAME_Distrib_Order_MailText_ID, null);
 else 
set_Value (COLUMNNAME_Distrib_Order_MailText_ID, Integer.valueOf(Distrib_Order_MailText_ID));
}
/** Get Distrib_Order_MailText_ID.
@return Distrib_Order_MailText_ID */
public int getDistrib_Order_MailText_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Distrib_Order_MailText_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="44e4c699-f63c-4159-cb4b-1bc1b7684a21")
public static String es_PE_FIELD_PrintForm_Distrib_Order_MailText_ID_Name="Texto de Correo para Orden de Distribución";

@XendraField(AD_Column_ID="Distrib_Order_MailText_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7fd4508b-1b06-5121-22dc-f7e49fdd6f2f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="44e4c699-f63c-4159-cb4b-1bc1b7684a21")
public static final String FIELDNAME_PrintForm_Distrib_Order_MailText_ID="44e4c699-f63c-4159-cb4b-1bc1b7684a21";

@XendraTrl(Identifier="4ca84d4f-5eeb-543d-1dbb-81ff88ec77c6")
public static String es_PE_COLUMN_Distrib_Order_MailText_ID_Name="distrib_order_mailtext_id";

@XendraColumn(AD_Element_ID="282942d4-66b4-e98f-56aa-77cc5a333a81",
ColumnName="Distrib_Order_MailText_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="989c9ac3-aa0d-186e-5762-5668871e42e4",AD_Val_Rule_ID="",FieldLength=10,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="4ca84d4f-5eeb-543d-1dbb-81ff88ec77c6",
Synchronized="2019-08-30 22:20:31.0")
/** Column name Distrib_Order_MailText_ID */
public static final String COLUMNNAME_Distrib_Order_MailText_ID = "Distrib_Order_MailText_ID";
/** Set Distrib_Order_PrintFormat_ID.
@param Distrib_Order_PrintFormat_ID Distrib_Order_PrintFormat_ID */
public void setDistrib_Order_PrintFormat_ID (int Distrib_Order_PrintFormat_ID)
{
if (Distrib_Order_PrintFormat_ID <= 0) set_Value (COLUMNNAME_Distrib_Order_PrintFormat_ID, null);
 else 
set_Value (COLUMNNAME_Distrib_Order_PrintFormat_ID, Integer.valueOf(Distrib_Order_PrintFormat_ID));
}
/** Get Distrib_Order_PrintFormat_ID.
@return Distrib_Order_PrintFormat_ID */
public int getDistrib_Order_PrintFormat_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Distrib_Order_PrintFormat_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="08dabaf6-aed9-d208-fb76-0f25f3568a36")
public static String es_PE_FIELD_PrintForm_Distrib_Order_PrintFormat_ID_Name="Formato de Impresion de Ordenes de Distribución";

@XendraField(AD_Column_ID="Distrib_Order_PrintFormat_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7fd4508b-1b06-5121-22dc-f7e49fdd6f2f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="08dabaf6-aed9-d208-fb76-0f25f3568a36")
public static final String FIELDNAME_PrintForm_Distrib_Order_PrintFormat_ID="08dabaf6-aed9-d208-fb76-0f25f3568a36";

@XendraTrl(Identifier="5c570090-fe4a-c983-bfae-e25a995fff66")
public static String es_PE_COLUMN_Distrib_Order_PrintFormat_ID_Name="distrib_order_printformat_id";

@XendraColumn(AD_Element_ID="31049c23-5bab-7bbc-c1c1-2cb9acfdfbda",
ColumnName="Distrib_Order_PrintFormat_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="377b8075-d154-6c3b-1cc0-dea545937fae",AD_Val_Rule_ID="",FieldLength=10,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="5c570090-fe4a-c983-bfae-e25a995fff66",
Synchronized="2019-08-30 22:20:31.0")
/** Column name Distrib_Order_PrintFormat_ID */
public static final String COLUMNNAME_Distrib_Order_PrintFormat_ID = "Distrib_Order_PrintFormat_ID";
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
@XendraTrl(Identifier="33cd5082-39b1-4258-ab52-e0c07c2fbbee")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="33cd5082-39b1-4258-ab52-e0c07c2fbbee",
Synchronized="2019-08-30 22:20:31.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Invoice Mail Text.
@param Invoice_MailText_ID Email text used for sending invoices */
public void setInvoice_MailText_ID (int Invoice_MailText_ID)
{
if (Invoice_MailText_ID <= 0) set_Value (COLUMNNAME_Invoice_MailText_ID, null);
 else 
set_Value (COLUMNNAME_Invoice_MailText_ID, Integer.valueOf(Invoice_MailText_ID));
}
/** Get Invoice Mail Text.
@return Email text used for sending invoices */
public int getInvoice_MailText_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Invoice_MailText_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b1f6adc5-1e06-65d7-5d0f-bae87f4f1b15")
public static String es_PE_FIELD_PrintForm_InvoiceMailText_Name="Texto de Correo para Factura";

@XendraTrl(Identifier="b1f6adc5-1e06-65d7-5d0f-bae87f4f1b15")
public static String es_PE_FIELD_PrintForm_InvoiceMailText_Description="Texto usado en los emails para enviar facturas";

@XendraTrl(Identifier="b1f6adc5-1e06-65d7-5d0f-bae87f4f1b15")
public static String es_PE_FIELD_PrintForm_InvoiceMailText_Help="La plantilla estándar del email envía facturas como accesorios.";

@XendraField(AD_Column_ID="Invoice_MailText_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7fd4508b-1b06-5121-22dc-f7e49fdd6f2f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b1f6adc5-1e06-65d7-5d0f-bae87f4f1b15")
public static final String FIELDNAME_PrintForm_InvoiceMailText="b1f6adc5-1e06-65d7-5d0f-bae87f4f1b15";

@XendraTrl(Identifier="b3d5a1cc-b215-1f86-75f6-f0ee9d55dc70")
public static String es_PE_COLUMN_Invoice_MailText_ID_Name="Texto Factura Mail";

@XendraColumn(AD_Element_ID="ccb9e8ef-5699-9cc3-c0fe-710cd894104e",
ColumnName="Invoice_MailText_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="989c9ac3-aa0d-186e-5762-5668871e42e4",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="b3d5a1cc-b215-1f86-75f6-f0ee9d55dc70",
Synchronized="2019-08-30 22:20:31.0")
/** Column name Invoice_MailText_ID */
public static final String COLUMNNAME_Invoice_MailText_ID = "Invoice_MailText_ID";
/** Set Invoice Print Format.
@param Invoice_PrintFormat_ID Print Format for printing Invoices */
public void setInvoice_PrintFormat_ID (int Invoice_PrintFormat_ID)
{
if (Invoice_PrintFormat_ID <= 0) set_Value (COLUMNNAME_Invoice_PrintFormat_ID, null);
 else 
set_Value (COLUMNNAME_Invoice_PrintFormat_ID, Integer.valueOf(Invoice_PrintFormat_ID));
}
/** Get Invoice Print Format.
@return Print Format for printing Invoices */
public int getInvoice_PrintFormat_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Invoice_PrintFormat_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5d373e04-854e-c8b2-b328-f5c4af3221bc")
public static String es_PE_FIELD_PrintForm_InvoicePrintFormat_Name="Formato de Impresión de Facturas";

@XendraTrl(Identifier="5d373e04-854e-c8b2-b328-f5c4af3221bc")
public static String es_PE_FIELD_PrintForm_InvoicePrintFormat_Description="Formato de impresión usado para imprimir facturas";

@XendraTrl(Identifier="5d373e04-854e-c8b2-b328-f5c4af3221bc")
public static String es_PE_FIELD_PrintForm_InvoicePrintFormat_Help="Es necesario definir un formato para imprimir el documento";

@XendraField(AD_Column_ID="Invoice_PrintFormat_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7fd4508b-1b06-5121-22dc-f7e49fdd6f2f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5d373e04-854e-c8b2-b328-f5c4af3221bc")
public static final String FIELDNAME_PrintForm_InvoicePrintFormat="5d373e04-854e-c8b2-b328-f5c4af3221bc";

@XendraTrl(Identifier="077e073d-969b-4ab8-91e4-fc210df608bc")
public static String es_PE_COLUMN_Invoice_PrintFormat_ID_Name="Formato de Impresión de facturas";

@XendraColumn(AD_Element_ID="a88115e7-5644-7a53-5652-ba5a6eaa4ae3",
ColumnName="Invoice_PrintFormat_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="3fb04288-4549-80e8-1969-6c95b48c8b1a",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="077e073d-969b-4ab8-91e4-fc210df608bc",
Synchronized="2019-08-30 22:20:31.0")
/** Column name Invoice_PrintFormat_ID */
public static final String COLUMNNAME_Invoice_PrintFormat_ID = "Invoice_PrintFormat_ID";
/** Set Manuf_Order_MailText_ID.
@param Manuf_Order_MailText_ID Manuf_Order_MailText_ID */
public void setManuf_Order_MailText_ID (int Manuf_Order_MailText_ID)
{
if (Manuf_Order_MailText_ID <= 0) set_Value (COLUMNNAME_Manuf_Order_MailText_ID, null);
 else 
set_Value (COLUMNNAME_Manuf_Order_MailText_ID, Integer.valueOf(Manuf_Order_MailText_ID));
}
/** Get Manuf_Order_MailText_ID.
@return Manuf_Order_MailText_ID */
public int getManuf_Order_MailText_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Manuf_Order_MailText_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4e7156aa-c508-1fcf-d483-63e413129fb7")
public static String es_PE_FIELD_PrintForm_Manuf_Order_MailText_ID_Name="Texto de Correo para Orden de Manufactura";

@XendraField(AD_Column_ID="Manuf_Order_MailText_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7fd4508b-1b06-5121-22dc-f7e49fdd6f2f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4e7156aa-c508-1fcf-d483-63e413129fb7")
public static final String FIELDNAME_PrintForm_Manuf_Order_MailText_ID="4e7156aa-c508-1fcf-d483-63e413129fb7";

@XendraTrl(Identifier="4bb9d766-232b-bff8-7b1b-ec48a352b8af")
public static String es_PE_COLUMN_Manuf_Order_MailText_ID_Name="manuf_order_mailtext_id";

@XendraColumn(AD_Element_ID="e6806b0c-8b74-a7cb-fcd1-8cf90846d06d",
ColumnName="Manuf_Order_MailText_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="989c9ac3-aa0d-186e-5762-5668871e42e4",AD_Val_Rule_ID="",FieldLength=10,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="4bb9d766-232b-bff8-7b1b-ec48a352b8af",
Synchronized="2019-08-30 22:20:31.0")
/** Column name Manuf_Order_MailText_ID */
public static final String COLUMNNAME_Manuf_Order_MailText_ID = "Manuf_Order_MailText_ID";
/** Set Manuf_Order_PrintFormat_ID.
@param Manuf_Order_PrintFormat_ID Manuf_Order_PrintFormat_ID */
public void setManuf_Order_PrintFormat_ID (int Manuf_Order_PrintFormat_ID)
{
if (Manuf_Order_PrintFormat_ID <= 0) set_Value (COLUMNNAME_Manuf_Order_PrintFormat_ID, null);
 else 
set_Value (COLUMNNAME_Manuf_Order_PrintFormat_ID, Integer.valueOf(Manuf_Order_PrintFormat_ID));
}
/** Get Manuf_Order_PrintFormat_ID.
@return Manuf_Order_PrintFormat_ID */
public int getManuf_Order_PrintFormat_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Manuf_Order_PrintFormat_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5780d495-3f53-7968-1746-89e65c0aaca9")
public static String es_PE_FIELD_PrintForm_Manuf_Order_PrintFormat_ID_Name="Formato de Impresion de Ordenes de Manufacura";

@XendraField(AD_Column_ID="Manuf_Order_PrintFormat_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7fd4508b-1b06-5121-22dc-f7e49fdd6f2f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5780d495-3f53-7968-1746-89e65c0aaca9")
public static final String FIELDNAME_PrintForm_Manuf_Order_PrintFormat_ID="5780d495-3f53-7968-1746-89e65c0aaca9";

@XendraTrl(Identifier="a069cca6-b75e-c2ae-7ef4-08c274390f73")
public static String es_PE_COLUMN_Manuf_Order_PrintFormat_ID_Name="manuf_order_printformat_id";

@XendraColumn(AD_Element_ID="a305678f-a19c-2467-e2b0-c9497dcdf4a3",
ColumnName="Manuf_Order_PrintFormat_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="377b8075-d154-6c3b-1cc0-dea545937fae",AD_Val_Rule_ID="",FieldLength=10,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="a069cca6-b75e-c2ae-7ef4-08c274390f73",
Synchronized="2019-08-30 22:20:31.0")
/** Column name Manuf_Order_PrintFormat_ID */
public static final String COLUMNNAME_Manuf_Order_PrintFormat_ID = "Manuf_Order_PrintFormat_ID";
/** Set Movement_PrintFormat_ID.
@param Movement_PrintFormat_ID Movement_PrintFormat_ID */
public void setMovement_PrintFormat_ID (int Movement_PrintFormat_ID)
{
if (Movement_PrintFormat_ID <= 0) set_Value (COLUMNNAME_Movement_PrintFormat_ID, null);
 else 
set_Value (COLUMNNAME_Movement_PrintFormat_ID, Integer.valueOf(Movement_PrintFormat_ID));
}
/** Get Movement_PrintFormat_ID.
@return Movement_PrintFormat_ID */
public int getMovement_PrintFormat_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Movement_PrintFormat_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="01000872-f7c7-fb3b-7a0a-fe4ce2f49cd6")
public static String es_PE_FIELD_PrintForm_Movement_PrintFormat_ID_Name="Formato de Impresion de Movimientos de Almacén";

@XendraField(AD_Column_ID="Movement_PrintFormat_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7fd4508b-1b06-5121-22dc-f7e49fdd6f2f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="01000872-f7c7-fb3b-7a0a-fe4ce2f49cd6")
public static final String FIELDNAME_PrintForm_Movement_PrintFormat_ID="01000872-f7c7-fb3b-7a0a-fe4ce2f49cd6";

@XendraTrl(Identifier="51f58acf-7107-d6a4-5e1d-0cd9c799a822")
public static String es_PE_COLUMN_Movement_PrintFormat_ID_Name="movement_printformat_id";

@XendraColumn(AD_Element_ID="468d1423-5379-8709-83f6-c7dab4b303b3",
ColumnName="Movement_PrintFormat_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="377b8075-d154-6c3b-1cc0-dea545937fae",AD_Val_Rule_ID="",FieldLength=10,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="51f58acf-7107-d6a4-5e1d-0cd9c799a822",
Synchronized="2019-08-30 22:20:31.0")
/** Column name Movement_PrintFormat_ID */
public static final String COLUMNNAME_Movement_PrintFormat_ID = "Movement_PrintFormat_ID";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name == null) throw new IllegalArgumentException ("Name is mandatory.");
if (Name.length() > 60)
{
log.warning("Length > 60 - truncated");
Name = Name.substring(0,59);
}
set_Value (COLUMNNAME_Name, Name);
}
/** Get Name.
@return Alphanumeric identifier of the entity */
public String getName() 
{
String value = (String)get_Value(COLUMNNAME_Name);
if (value == null)
  return "";
return value;
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getName());
}

@XendraTrl(Identifier="09a81a13-f722-e43c-d797-23da09f80439")
public static String es_PE_FIELD_PrintForm_Name_Name="Nombre";

@XendraTrl(Identifier="09a81a13-f722-e43c-d797-23da09f80439")
public static String es_PE_FIELD_PrintForm_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="09a81a13-f722-e43c-d797-23da09f80439")
public static String es_PE_FIELD_PrintForm_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="7fd4508b-1b06-5121-22dc-f7e49fdd6f2f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="09a81a13-f722-e43c-d797-23da09f80439")
public static final String FIELDNAME_PrintForm_Name="09a81a13-f722-e43c-d797-23da09f80439";

@XendraTrl(Identifier="3517f193-6bd2-21d7-6473-7be485de6da8")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3517f193-6bd2-21d7-6473-7be485de6da8",
Synchronized="2019-08-30 22:20:31.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Order Mail Text.
@param Order_MailText_ID Email text used for sending order acknowledgements or quotations */
public void setOrder_MailText_ID (int Order_MailText_ID)
{
if (Order_MailText_ID <= 0) set_Value (COLUMNNAME_Order_MailText_ID, null);
 else 
set_Value (COLUMNNAME_Order_MailText_ID, Integer.valueOf(Order_MailText_ID));
}
/** Get Order Mail Text.
@return Email text used for sending order acknowledgements or quotations */
public int getOrder_MailText_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Order_MailText_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d13dcd41-6651-eea4-4a77-17d1d31f9ee2")
public static String es_PE_FIELD_PrintForm_OrderMailText_Name="Texto de Correo para Orden";

@XendraTrl(Identifier="d13dcd41-6651-eea4-4a77-17d1d31f9ee2")
public static String es_PE_FIELD_PrintForm_OrderMailText_Description="Texto del email usado para enviar reconocimientos ó citas de la orden.";

@XendraTrl(Identifier="d13dcd41-6651-eea4-4a77-17d1d31f9ee2")
public static String es_PE_FIELD_PrintForm_OrderMailText_Help="La plantilla estándar del email para enviar reconocimientos ó citas como accesorios.";

@XendraField(AD_Column_ID="Order_MailText_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7fd4508b-1b06-5121-22dc-f7e49fdd6f2f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d13dcd41-6651-eea4-4a77-17d1d31f9ee2")
public static final String FIELDNAME_PrintForm_OrderMailText="d13dcd41-6651-eea4-4a77-17d1d31f9ee2";

@XendraTrl(Identifier="83f7aedb-b00b-401f-9dd2-4dc058f95d1a")
public static String es_PE_COLUMN_Order_MailText_ID_Name="Orden Texto Correo";

@XendraColumn(AD_Element_ID="2eb0ec87-8ca0-7591-d375-31f4307e3172",ColumnName="Order_MailText_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="989c9ac3-aa0d-186e-5762-5668871e42e4",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="83f7aedb-b00b-401f-9dd2-4dc058f95d1a",Synchronized="2019-08-30 22:20:31.0")
/** Column name Order_MailText_ID */
public static final String COLUMNNAME_Order_MailText_ID = "Order_MailText_ID";
/** Set Order Print Format.
@param Order_PrintFormat_ID Print Format for Orders, Quotes, Offers */
public void setOrder_PrintFormat_ID (int Order_PrintFormat_ID)
{
if (Order_PrintFormat_ID <= 0) set_Value (COLUMNNAME_Order_PrintFormat_ID, null);
 else 
set_Value (COLUMNNAME_Order_PrintFormat_ID, Integer.valueOf(Order_PrintFormat_ID));
}
/** Get Order Print Format.
@return Print Format for Orders, Quotes, Offers */
public int getOrder_PrintFormat_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Order_PrintFormat_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c52938a7-0798-d806-1b73-b06f34570f43")
public static String es_PE_FIELD_PrintForm_OrderPrintFormat_Name="Formato de Impresión de Ordenes";

@XendraTrl(Identifier="c52938a7-0798-d806-1b73-b06f34570f43")
public static String es_PE_FIELD_PrintForm_OrderPrintFormat_Description="Formato de impresión usado para imprimir ordenes; cotizaciones; ofertas";

@XendraTrl(Identifier="c52938a7-0798-d806-1b73-b06f34570f43")
public static String es_PE_FIELD_PrintForm_OrderPrintFormat_Help="Es necesario definir un formato para imprimir el documento";

@XendraField(AD_Column_ID="Order_PrintFormat_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7fd4508b-1b06-5121-22dc-f7e49fdd6f2f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c52938a7-0798-d806-1b73-b06f34570f43")
public static final String FIELDNAME_PrintForm_OrderPrintFormat="c52938a7-0798-d806-1b73-b06f34570f43";

@XendraTrl(Identifier="eba08482-c6f4-a843-83f3-0f245738ed65")
public static String es_PE_COLUMN_Order_PrintFormat_ID_Name="Formato de Impresión de Ordenes";

@XendraColumn(AD_Element_ID="3e020d08-3822-f834-3cef-9e62807970b6",
ColumnName="Order_PrintFormat_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="0110e526-2029-dac7-1867-335aaa97f67b",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="eba08482-c6f4-a843-83f3-0f245738ed65",
Synchronized="2019-08-30 22:20:32.0")
/** Column name Order_PrintFormat_ID */
public static final String COLUMNNAME_Order_PrintFormat_ID = "Order_PrintFormat_ID";
/** Set Project Mail Text.
@param Project_MailText_ID Standard text for Project EMails */
public void setProject_MailText_ID (int Project_MailText_ID)
{
if (Project_MailText_ID <= 0) set_Value (COLUMNNAME_Project_MailText_ID, null);
 else 
set_Value (COLUMNNAME_Project_MailText_ID, Integer.valueOf(Project_MailText_ID));
}
/** Get Project Mail Text.
@return Standard text for Project EMails */
public int getProject_MailText_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Project_MailText_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="57f01322-c7b9-d9f2-f714-0f8c471abcf8")
public static String es_PE_FIELD_PrintForm_ProjectMailText_Name="Texto de Correo para Proyecto";

@XendraTrl(Identifier="57f01322-c7b9-d9f2-f714-0f8c471abcf8")
public static String es_PE_FIELD_PrintForm_ProjectMailText_Description="Texto estandar para correos del proyecto";

@XendraTrl(Identifier="57f01322-c7b9-d9f2-f714-0f8c471abcf8")
public static String es_PE_FIELD_PrintForm_ProjectMailText_Help="Texto estandar para correos del proyecto";

@XendraField(AD_Column_ID="Project_MailText_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7fd4508b-1b06-5121-22dc-f7e49fdd6f2f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="57f01322-c7b9-d9f2-f714-0f8c471abcf8")
public static final String FIELDNAME_PrintForm_ProjectMailText="57f01322-c7b9-d9f2-f714-0f8c471abcf8";

@XendraTrl(Identifier="5f10d98d-55e6-377a-64f0-641d8b784589")
public static String es_PE_COLUMN_Project_MailText_ID_Name="Texto Correo Proyecto";

@XendraColumn(AD_Element_ID="0679f55f-fd9c-e4d7-fc6c-813737451ff1",
ColumnName="Project_MailText_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="989c9ac3-aa0d-186e-5762-5668871e42e4",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="5f10d98d-55e6-377a-64f0-641d8b784589",
Synchronized="2019-08-30 22:20:32.0")
/** Column name Project_MailText_ID */
public static final String COLUMNNAME_Project_MailText_ID = "Project_MailText_ID";
/** Set Project Print Format.
@param Project_PrintFormat_ID Standard Project Print Format */
public void setProject_PrintFormat_ID (int Project_PrintFormat_ID)
{
if (Project_PrintFormat_ID <= 0) set_Value (COLUMNNAME_Project_PrintFormat_ID, null);
 else 
set_Value (COLUMNNAME_Project_PrintFormat_ID, Integer.valueOf(Project_PrintFormat_ID));
}
/** Get Project Print Format.
@return Standard Project Print Format */
public int getProject_PrintFormat_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Project_PrintFormat_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c8c05dfa-d6ad-74b5-3e8a-8189a4c0a6a0")
public static String es_PE_FIELD_PrintForm_ProjectPrintFormat_Name="Formato de Impresion del Proyectos";

@XendraTrl(Identifier="c8c05dfa-d6ad-74b5-3e8a-8189a4c0a6a0")
public static String es_PE_FIELD_PrintForm_ProjectPrintFormat_Description="Formato estándar de la impresión del proyecto";

@XendraTrl(Identifier="c8c05dfa-d6ad-74b5-3e8a-8189a4c0a6a0")
public static String es_PE_FIELD_PrintForm_ProjectPrintFormat_Help="Formato estándar de la impresión del proyecto";

@XendraField(AD_Column_ID="Project_PrintFormat_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7fd4508b-1b06-5121-22dc-f7e49fdd6f2f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c8c05dfa-d6ad-74b5-3e8a-8189a4c0a6a0")
public static final String FIELDNAME_PrintForm_ProjectPrintFormat="c8c05dfa-d6ad-74b5-3e8a-8189a4c0a6a0";

@XendraTrl(Identifier="f1757064-edde-8ad8-952a-2aa543733caf")
public static String es_PE_COLUMN_Project_PrintFormat_ID_Name="Formato de Impresion del Proyecto";

@XendraColumn(AD_Element_ID="78b91b5c-8519-5eae-cbfd-6e5a74217853",
ColumnName="Project_PrintFormat_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="377b8075-d154-6c3b-1cc0-dea545937fae",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="f1757064-edde-8ad8-952a-2aa543733caf",
Synchronized="2019-08-30 22:20:32.0")
/** Column name Project_PrintFormat_ID */
public static final String COLUMNNAME_Project_PrintFormat_ID = "Project_PrintFormat_ID";
/** Set Remittance Mail Text.
@param Remittance_MailText_ID Email text used for sending payment remittances */
public void setRemittance_MailText_ID (int Remittance_MailText_ID)
{
if (Remittance_MailText_ID <= 0) set_Value (COLUMNNAME_Remittance_MailText_ID, null);
 else 
set_Value (COLUMNNAME_Remittance_MailText_ID, Integer.valueOf(Remittance_MailText_ID));
}
/** Get Remittance Mail Text.
@return Email text used for sending payment remittances */
public int getRemittance_MailText_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Remittance_MailText_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f9cfb6cc-004a-cddc-8a30-4e6456e56ae5")
public static String es_PE_FIELD_PrintForm_RemittanceMailText_Name="Texto de Correo para Remesas";

@XendraTrl(Identifier="f9cfb6cc-004a-cddc-8a30-4e6456e56ae5")
public static String es_PE_FIELD_PrintForm_RemittanceMailText_Description="Texto del mail usado para enviar remitentes del pago.";

@XendraTrl(Identifier="f9cfb6cc-004a-cddc-8a30-4e6456e56ae5")
public static String es_PE_FIELD_PrintForm_RemittanceMailText_Help="La plantilla estándar del email envia remitentes como accesorios.";

@XendraField(AD_Column_ID="Remittance_MailText_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7fd4508b-1b06-5121-22dc-f7e49fdd6f2f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f9cfb6cc-004a-cddc-8a30-4e6456e56ae5")
public static final String FIELDNAME_PrintForm_RemittanceMailText="f9cfb6cc-004a-cddc-8a30-4e6456e56ae5";

@XendraTrl(Identifier="2b798188-11ca-fc09-31ea-531fdb46c7bf")
public static String es_PE_COLUMN_Remittance_MailText_ID_Name="Remitente del Texto de Correo";

@XendraColumn(AD_Element_ID="68ac1ec6-efef-88e8-eb56-b0f8b0d86b5b",
ColumnName="Remittance_MailText_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="989c9ac3-aa0d-186e-5762-5668871e42e4",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="2b798188-11ca-fc09-31ea-531fdb46c7bf",
Synchronized="2019-08-30 22:20:32.0")
/** Column name Remittance_MailText_ID */
public static final String COLUMNNAME_Remittance_MailText_ID = "Remittance_MailText_ID";
/** Set Remittance Print Format.
@param Remittance_PrintFormat_ID Print Format for separate Remittances */
public void setRemittance_PrintFormat_ID (int Remittance_PrintFormat_ID)
{
if (Remittance_PrintFormat_ID <= 0) set_Value (COLUMNNAME_Remittance_PrintFormat_ID, null);
 else 
set_Value (COLUMNNAME_Remittance_PrintFormat_ID, Integer.valueOf(Remittance_PrintFormat_ID));
}
/** Get Remittance Print Format.
@return Print Format for separate Remittances */
public int getRemittance_PrintFormat_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Remittance_PrintFormat_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b2fe7695-37ac-2059-9960-e96acf1a9f1b")
public static String es_PE_FIELD_PrintForm_RemittancePrintFormat_Name="Formato de Impresión de Remesas";

@XendraTrl(Identifier="b2fe7695-37ac-2059-9960-e96acf1a9f1b")
public static String es_PE_FIELD_PrintForm_RemittancePrintFormat_Description="Formato de impresión usado para imprimir remesas separadas";

@XendraTrl(Identifier="b2fe7695-37ac-2059-9960-e96acf1a9f1b")
public static String es_PE_FIELD_PrintForm_RemittancePrintFormat_Help="Es necesario definir un formato para imprimir el documento";

@XendraField(AD_Column_ID="Remittance_PrintFormat_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7fd4508b-1b06-5121-22dc-f7e49fdd6f2f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b2fe7695-37ac-2059-9960-e96acf1a9f1b")
public static final String FIELDNAME_PrintForm_RemittancePrintFormat="b2fe7695-37ac-2059-9960-e96acf1a9f1b";

@XendraTrl(Identifier="7d2f5f18-b099-0edb-f66c-7fbba869bd6a")
public static String es_PE_COLUMN_Remittance_PrintFormat_ID_Name="Formato de Impresión de remesas";

@XendraColumn(AD_Element_ID="b1db37f2-7805-3c7f-fb10-0361cdd1a17d",
ColumnName="Remittance_PrintFormat_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="c6373860-2da1-9b9a-fb99-6ddafee99e3f",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="7d2f5f18-b099-0edb-f66c-7fbba869bd6a",
Synchronized="2019-08-30 22:20:32.0")
/** Column name Remittance_PrintFormat_ID */
public static final String COLUMNNAME_Remittance_PrintFormat_ID = "Remittance_PrintFormat_ID";
/** Set Shipment Mail Text.
@param Shipment_MailText_ID Email text used for sending delivery notes */
public void setShipment_MailText_ID (int Shipment_MailText_ID)
{
if (Shipment_MailText_ID <= 0) set_Value (COLUMNNAME_Shipment_MailText_ID, null);
 else 
set_Value (COLUMNNAME_Shipment_MailText_ID, Integer.valueOf(Shipment_MailText_ID));
}
/** Get Shipment Mail Text.
@return Email text used for sending delivery notes */
public int getShipment_MailText_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Shipment_MailText_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6ae370e0-9cc2-7054-a08e-b459f62d6512")
public static String es_PE_FIELD_PrintForm_ShipmentMailText_Name="Texto de Correo para Despacho";

@XendraTrl(Identifier="6ae370e0-9cc2-7054-a08e-b459f62d6512")
public static String es_PE_FIELD_PrintForm_ShipmentMailText_Description="Texto de email usado para enviar notas de entrega";

@XendraTrl(Identifier="6ae370e0-9cc2-7054-a08e-b459f62d6512")
public static String es_PE_FIELD_PrintForm_ShipmentMailText_Help="La plantilla estándar del email envía notas de entrega como accesorios.";

@XendraField(AD_Column_ID="Shipment_MailText_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7fd4508b-1b06-5121-22dc-f7e49fdd6f2f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6ae370e0-9cc2-7054-a08e-b459f62d6512")
public static final String FIELDNAME_PrintForm_ShipmentMailText="6ae370e0-9cc2-7054-a08e-b459f62d6512";

@XendraTrl(Identifier="df97791f-c757-5c08-e312-54a49335e94b")
public static String es_PE_COLUMN_Shipment_MailText_ID_Name="Texto de Correo para Entrega";

@XendraColumn(AD_Element_ID="64804525-b5a5-c7e4-d5aa-f45e7185a78b",
ColumnName="Shipment_MailText_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="989c9ac3-aa0d-186e-5762-5668871e42e4",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="df97791f-c757-5c08-e312-54a49335e94b",
Synchronized="2019-08-30 22:20:32.0")
/** Column name Shipment_MailText_ID */
public static final String COLUMNNAME_Shipment_MailText_ID = "Shipment_MailText_ID";
/** Set Shipment Print Format.
@param Shipment_PrintFormat_ID Print Format for Shipments, Receipts, Pick Lists */
public void setShipment_PrintFormat_ID (int Shipment_PrintFormat_ID)
{
if (Shipment_PrintFormat_ID <= 0) set_Value (COLUMNNAME_Shipment_PrintFormat_ID, null);
 else 
set_Value (COLUMNNAME_Shipment_PrintFormat_ID, Integer.valueOf(Shipment_PrintFormat_ID));
}
/** Get Shipment Print Format.
@return Print Format for Shipments, Receipts, Pick Lists */
public int getShipment_PrintFormat_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Shipment_PrintFormat_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2b66bd45-1ea3-f61c-35af-1c445b26ab17")
public static String es_PE_FIELD_PrintForm_ShipmentPrintFormat_Name="Formato de Impresión de Despachos";

@XendraTrl(Identifier="2b66bd45-1ea3-f61c-35af-1c445b26ab17")
public static String es_PE_FIELD_PrintForm_ShipmentPrintFormat_Description="Formato de impresión usado para imprimir despachos; recibos y listas de recolección.";

@XendraTrl(Identifier="2b66bd45-1ea3-f61c-35af-1c445b26ab17")
public static String es_PE_FIELD_PrintForm_ShipmentPrintFormat_Help="Es necesario definir un formato para imprimir el documento.";

@XendraField(AD_Column_ID="Shipment_PrintFormat_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7fd4508b-1b06-5121-22dc-f7e49fdd6f2f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2b66bd45-1ea3-f61c-35af-1c445b26ab17")
public static final String FIELDNAME_PrintForm_ShipmentPrintFormat="2b66bd45-1ea3-f61c-35af-1c445b26ab17";

@XendraTrl(Identifier="c3f6b53d-9888-662a-b5e3-6232f2a90528")
public static String es_PE_COLUMN_Shipment_PrintFormat_ID_Name="Formato de Impresión de Despachos";

@XendraColumn(AD_Element_ID="73f54688-10b8-3ff0-d8dd-f3d84ea30c5f",
ColumnName="Shipment_PrintFormat_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="ba7f9e3d-8c96-f5ba-cce3-6cafecf6ef8f",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="c3f6b53d-9888-662a-b5e3-6232f2a90528",
Synchronized="2019-08-30 22:20:32.0")
/** Column name Shipment_PrintFormat_ID */
public static final String COLUMNNAME_Shipment_PrintFormat_ID = "Shipment_PrintFormat_ID";
}
