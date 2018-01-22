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
import org.compiere.model.reference.REF_Weekdays;
/** Generated Model for C_PaymentTerm
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_PaymentTerm extends PO
{
/** Standard Constructor
@param ctx context
@param C_PaymentTerm_ID id
@param trxName transaction
*/
public X_C_PaymentTerm (Properties ctx, int C_PaymentTerm_ID, String trxName)
{
super (ctx, C_PaymentTerm_ID, trxName);
/** if (C_PaymentTerm_ID == 0)
{
setAfterDelivery (false);	
// N
setC_PaymentTerm_ID (0);
setDiscount (Env.ZERO);
setDiscount2 (Env.ZERO);
setDiscountDays (0);
setDiscountDays2 (0);
setGraceDays (0);
setIsDueFixed (false);	
// N
setIsValid (false);	
// N
setName (null);
setNetDays (0);
setValue (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_PaymentTerm (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=113 */
public static int Table_ID=MTable.getTable_ID("C_PaymentTerm");

@XendraTrl(Identifier="4d2bc8ba-7fb7-8c94-3f70-53594245e6a3")
public static String es_PE_TAB_PaymentTerm_Description="Definir Términos de Pago";

@XendraTrl(Identifier="4d2bc8ba-7fb7-8c94-3f70-53594245e6a3")
public static String es_PE_TAB_PaymentTerm_Name="Término de Pago";

@XendraTrl(Identifier="4d2bc8ba-7fb7-8c94-3f70-53594245e6a3")
public static String es_PE_TAB_PaymentTerm_Help="La pestaña de términos de pago define los diferentes términos que se le ofrece a un socio de negocio cuando paga sus facturas y también aquellos términos que sus proveedores le ofrecen a su organización para pagar sus facturas. En la factura estándar; el nombre y la nota del documento de los términos de pago son impresos.";

@XendraTab(Name="Payment Term",Description="Define Payment Terms",
Help="The Payment Term Tab defines the different payments terms that you offer to your Business Partners when paying invoices and also those terms which your Vendors offer you for payment of your invoices. On the standard invoice, the Name and the Document Note of the Payment Term is printed.",
AD_Window_ID="176da775-8ea3-bf34-d8a9-178e4ce29d42",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="4d2bc8ba-7fb7-8c94-3f70-53594245e6a3",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_PaymentTerm="4d2bc8ba-7fb7-8c94-3f70-53594245e6a3";

@XendraTrl(Identifier="f1273bd5-d9e0-b736-cc97-9f84dfac73ac")
public static String es_PE_TABLE_C_PaymentTerm_Name="Término de Pago";

@XendraTable(Name="Payment Term",Description="The terms for Payment of this transaction",Help="",
TableName="C_PaymentTerm",AccessLevel="3",AD_Window_ID="176da775-8ea3-bf34-d8a9-178e4ce29d42",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=65,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="f1273bd5-d9e0-b736-cc97-9f84dfac73ac",Synchronized="2017-08-16 11:42:10.0")
/** TableName=C_PaymentTerm */
public static final String Table_Name="C_PaymentTerm";


@XendraIndex(Name="c_paymentterm_name",Identifier="ce071e40-56b1-e3de-28bf-71974c4ef0ee",
Column_Names="ad_client_id, name",IsUnique="true",
TableIdentifier="ce071e40-56b1-e3de-28bf-71974c4ef0ee",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_paymentterm_name = "ce071e40-56b1-e3de-28bf-71974c4ef0ee";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_PaymentTerm");

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
    Table_ID = MTable.getTable_ID("C_PaymentTerm");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_PaymentTerm[").append(get_ID()).append("]");
return sb.toString();
}
/** Set After Delivery.
@param AfterDelivery Due after delivery rather than after invoicing */
public void setAfterDelivery (boolean AfterDelivery)
{
set_Value (COLUMNNAME_AfterDelivery, Boolean.valueOf(AfterDelivery));
}
/** Get After Delivery.
@return Due after delivery rather than after invoicing */
public boolean isAfterDelivery() 
{
Object oo = get_Value(COLUMNNAME_AfterDelivery);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="604f6bc2-9a22-c9e0-c40e-17ac61c60507")
public static String es_PE_FIELD_PaymentTerm_AfterDelivery_Description="Vencimiento después de la entrega y no después de la facturación";

@XendraTrl(Identifier="604f6bc2-9a22-c9e0-c40e-17ac61c60507")
public static String es_PE_FIELD_PaymentTerm_AfterDelivery_Help="El cuadro de verificación después de entrega indica que el pago se vence después de la entrega; en contraste con el vencimiento después de la facturación";

@XendraTrl(Identifier="604f6bc2-9a22-c9e0-c40e-17ac61c60507")
public static String es_PE_FIELD_PaymentTerm_AfterDelivery_Name="Después de Entrega";

@XendraField(AD_Column_ID="AfterDelivery",IsCentrallyMaintained=true,
AD_Tab_ID="4d2bc8ba-7fb7-8c94-3f70-53594245e6a3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="604f6bc2-9a22-c9e0-c40e-17ac61c60507")
public static final String FIELDNAME_PaymentTerm_AfterDelivery="604f6bc2-9a22-c9e0-c40e-17ac61c60507";

@XendraTrl(Identifier="7fa8fae2-9dd7-4ae6-def3-0f83d6514658")
public static String es_PE_COLUMN_AfterDelivery_Name="Después de Entrega";

@XendraColumn(AD_Element_ID="8bb0c484-4438-3673-d11e-f060f661c412",ColumnName="AfterDelivery",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7fa8fae2-9dd7-4ae6-def3-0f83d6514658",
Synchronized="2017-08-05 16:54:02.0")
/** Column name AfterDelivery */
public static final String COLUMNNAME_AfterDelivery = "AfterDelivery";
/** Set Payment Term.
@param C_PaymentTerm_ID The terms of Payment (timing, discount) */
public void setC_PaymentTerm_ID (int C_PaymentTerm_ID)
{
if (C_PaymentTerm_ID < 1) throw new IllegalArgumentException ("C_PaymentTerm_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_PaymentTerm_ID, Integer.valueOf(C_PaymentTerm_ID));
}
/** Get Payment Term.
@return The terms of Payment (timing, discount) */
public int getC_PaymentTerm_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_PaymentTerm_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="53f66e05-28ac-2c84-59b1-b0bf54c9c30c")
public static String es_PE_FIELD_PaymentTerm_PaymentTerm_Description="Condiciones de pago de esta transacción";

@XendraTrl(Identifier="53f66e05-28ac-2c84-59b1-b0bf54c9c30c")
public static String es_PE_FIELD_PaymentTerm_PaymentTerm_Help="Las condiciones de pago indican el método y tiempo de pago para esta transacción.";

@XendraTrl(Identifier="53f66e05-28ac-2c84-59b1-b0bf54c9c30c")
public static String es_PE_FIELD_PaymentTerm_PaymentTerm_Name="Término de Pago";

@XendraField(AD_Column_ID="C_PaymentTerm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="4d2bc8ba-7fb7-8c94-3f70-53594245e6a3",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="53f66e05-28ac-2c84-59b1-b0bf54c9c30c")
public static final String FIELDNAME_PaymentTerm_PaymentTerm="53f66e05-28ac-2c84-59b1-b0bf54c9c30c";
/** Column name C_PaymentTerm_ID */
public static final String COLUMNNAME_C_PaymentTerm_ID = "C_PaymentTerm_ID";
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

@XendraTrl(Identifier="56bb8934-1ab6-11ab-1dbd-5ffef44691e5")
public static String es_PE_FIELD_PaymentTerm_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="56bb8934-1ab6-11ab-1dbd-5ffef44691e5")
public static String es_PE_FIELD_PaymentTerm_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="56bb8934-1ab6-11ab-1dbd-5ffef44691e5")
public static String es_PE_FIELD_PaymentTerm_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="4d2bc8ba-7fb7-8c94-3f70-53594245e6a3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="56bb8934-1ab6-11ab-1dbd-5ffef44691e5")
public static final String FIELDNAME_PaymentTerm_Description="56bb8934-1ab6-11ab-1dbd-5ffef44691e5";

@XendraTrl(Identifier="44fd6c16-d822-44ea-e6ac-dc9ee65ae4ac")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="44fd6c16-d822-44ea-e6ac-dc9ee65ae4ac",
Synchronized="2017-08-05 16:54:03.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Discount %.
@param Discount Discount in percent */
public void setDiscount (BigDecimal Discount)
{
if (Discount == null) throw new IllegalArgumentException ("Discount is mandatory.");
set_Value (COLUMNNAME_Discount, Discount);
}
/** Get Discount %.
@return Discount in percent */
public BigDecimal getDiscount() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Discount);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="1a5fa6d7-7240-a265-8487-5c7554d10411")
public static String es_PE_FIELD_PaymentTerm_Discount_Description="Descuento en porcentaje";

@XendraTrl(Identifier="1a5fa6d7-7240-a265-8487-5c7554d10411")
public static String es_PE_FIELD_PaymentTerm_Discount_Help="El Descuento indica el descuento aplicado o tomado como un porcentaje.";

@XendraTrl(Identifier="1a5fa6d7-7240-a265-8487-5c7554d10411")
public static String es_PE_FIELD_PaymentTerm_Discount_Name="% Descuento";

@XendraField(AD_Column_ID="Discount",IsCentrallyMaintained=true,
AD_Tab_ID="4d2bc8ba-7fb7-8c94-3f70-53594245e6a3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1a5fa6d7-7240-a265-8487-5c7554d10411")
public static final String FIELDNAME_PaymentTerm_Discount="1a5fa6d7-7240-a265-8487-5c7554d10411";

@XendraTrl(Identifier="8e7305fb-d08b-5168-490d-534fc6293df1")
public static String es_PE_COLUMN_Discount_Name="% Descuento";

@XendraColumn(AD_Element_ID="3d8e2bac-29ff-f758-dd80-f9b4107077e6",ColumnName="Discount",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8e7305fb-d08b-5168-490d-534fc6293df1",
Synchronized="2017-08-05 16:54:03.0")
/** Column name Discount */
public static final String COLUMNNAME_Discount = "Discount";
/** Set Discount 2 %.
@param Discount2 Discount in percent */
public void setDiscount2 (BigDecimal Discount2)
{
if (Discount2 == null) throw new IllegalArgumentException ("Discount2 is mandatory.");
set_Value (COLUMNNAME_Discount2, Discount2);
}
/** Get Discount 2 %.
@return Discount in percent */
public BigDecimal getDiscount2() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Discount2);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="0737c170-01cc-1c12-6c53-4f765888fbc3")
public static String es_PE_FIELD_PaymentTerm_Discount22_Description="Descuento en porcentaje";

@XendraTrl(Identifier="0737c170-01cc-1c12-6c53-4f765888fbc3")
public static String es_PE_FIELD_PaymentTerm_Discount22_Help="El Descuento indica el descuento aplicado o tomado como un porcentaje.";

@XendraTrl(Identifier="0737c170-01cc-1c12-6c53-4f765888fbc3")
public static String es_PE_FIELD_PaymentTerm_Discount22_Name="% de Descuento 2";

@XendraField(AD_Column_ID="Discount2",IsCentrallyMaintained=true,
AD_Tab_ID="4d2bc8ba-7fb7-8c94-3f70-53594245e6a3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0737c170-01cc-1c12-6c53-4f765888fbc3")
public static final String FIELDNAME_PaymentTerm_Discount22="0737c170-01cc-1c12-6c53-4f765888fbc3";

@XendraTrl(Identifier="b9cda052-33a0-443d-4866-aaa79507c87f")
public static String es_PE_COLUMN_Discount2_Name="% de Descuento 2";

@XendraColumn(AD_Element_ID="f316139b-9edb-4d81-7a3b-369e45352498",ColumnName="Discount2",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b9cda052-33a0-443d-4866-aaa79507c87f",
Synchronized="2017-08-05 16:54:03.0")
/** Column name Discount2 */
public static final String COLUMNNAME_Discount2 = "Discount2";
/** Set Discount Days.
@param DiscountDays Number of days from invoice date to be eligible for discount */
public void setDiscountDays (int DiscountDays)
{
set_Value (COLUMNNAME_DiscountDays, Integer.valueOf(DiscountDays));
}
/** Get Discount Days.
@return Number of days from invoice date to be eligible for discount */
public int getDiscountDays() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_DiscountDays);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f7379898-e51b-3527-ee4d-119f2022c841")
public static String es_PE_FIELD_PaymentTerm_DiscountDays_Description="Número de días desde la fecha de la factura hasta la fecha de descuento";

@XendraTrl(Identifier="f7379898-e51b-3527-ee4d-119f2022c841")
public static String es_PE_FIELD_PaymentTerm_DiscountDays_Help="El día de descuento indica el número de días en que el pago debe ser hecho para ser elegible al descuento establecido";

@XendraTrl(Identifier="f7379898-e51b-3527-ee4d-119f2022c841")
public static String es_PE_FIELD_PaymentTerm_DiscountDays_Name="Días de Descuento";

@XendraField(AD_Column_ID="DiscountDays",IsCentrallyMaintained=true,
AD_Tab_ID="4d2bc8ba-7fb7-8c94-3f70-53594245e6a3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f7379898-e51b-3527-ee4d-119f2022c841")
public static final String FIELDNAME_PaymentTerm_DiscountDays="f7379898-e51b-3527-ee4d-119f2022c841";

@XendraTrl(Identifier="2aa57eeb-3a48-db90-0965-13b70ca02679")
public static String es_PE_COLUMN_DiscountDays_Name="Días de Descuento";

@XendraColumn(AD_Element_ID="70c771c5-7b53-d10c-97c3-9285057be132",ColumnName="DiscountDays",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2aa57eeb-3a48-db90-0965-13b70ca02679",
Synchronized="2017-08-05 16:54:03.0")
/** Column name DiscountDays */
public static final String COLUMNNAME_DiscountDays = "DiscountDays";
/** Set Discount Days 2.
@param DiscountDays2 Number of days from invoice date to be eligible for discount */
public void setDiscountDays2 (int DiscountDays2)
{
set_Value (COLUMNNAME_DiscountDays2, Integer.valueOf(DiscountDays2));
}
/** Get Discount Days 2.
@return Number of days from invoice date to be eligible for discount */
public int getDiscountDays2() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_DiscountDays2);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a8095da0-ebaa-df5d-fdc4-b9ff77a3e26b")
public static String es_PE_FIELD_PaymentTerm_DiscountDays22_Description="Número de días desde la fecha de la factura para ser elegible para descuento";

@XendraTrl(Identifier="a8095da0-ebaa-df5d-fdc4-b9ff77a3e26b")
public static String es_PE_FIELD_PaymentTerm_DiscountDays22_Help="El día de descuento indica el número de días que el pago debe ser recibido para ser elegible a el descuento establecido";

@XendraTrl(Identifier="a8095da0-ebaa-df5d-fdc4-b9ff77a3e26b")
public static String es_PE_FIELD_PaymentTerm_DiscountDays22_Name="Días de Descuento 2";

@XendraField(AD_Column_ID="DiscountDays2",IsCentrallyMaintained=true,
AD_Tab_ID="4d2bc8ba-7fb7-8c94-3f70-53594245e6a3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a8095da0-ebaa-df5d-fdc4-b9ff77a3e26b")
public static final String FIELDNAME_PaymentTerm_DiscountDays22="a8095da0-ebaa-df5d-fdc4-b9ff77a3e26b";

@XendraTrl(Identifier="b014599f-f7d5-dcf8-6ed8-f4350a50cf4e")
public static String es_PE_COLUMN_DiscountDays2_Name="Días de Descuento 2";

@XendraColumn(AD_Element_ID="c612bd7f-63c6-a6d2-e458-9b956d1314bf",ColumnName="DiscountDays2",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b014599f-f7d5-dcf8-6ed8-f4350a50cf4e",
Synchronized="2017-08-05 16:54:03.0")
/** Column name DiscountDays2 */
public static final String COLUMNNAME_DiscountDays2 = "DiscountDays2";
/** Set Document Note.
@param DocumentNote Additional information for a Document */
public void setDocumentNote (String DocumentNote)
{
set_Value (COLUMNNAME_DocumentNote, DocumentNote);
}
/** Get Document Note.
@return Additional information for a Document */
public String getDocumentNote() 
{
String value = (String)get_Value(COLUMNNAME_DocumentNote);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="34c666a4-9cba-d088-74a5-ae7ef0c25bdf")
public static String es_PE_FIELD_PaymentTerm_DocumentNote_Description="Información adicional para un documento";

@XendraTrl(Identifier="34c666a4-9cba-d088-74a5-ae7ef0c25bdf")
public static String es_PE_FIELD_PaymentTerm_DocumentNote_Help="La nota de documento se usa para registrar cualquier información adicional considerando este producto.";

@XendraTrl(Identifier="34c666a4-9cba-d088-74a5-ae7ef0c25bdf")
public static String es_PE_FIELD_PaymentTerm_DocumentNote_Name="Nota de Documento";

@XendraField(AD_Column_ID="DocumentNote",IsCentrallyMaintained=true,
AD_Tab_ID="4d2bc8ba-7fb7-8c94-3f70-53594245e6a3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="34c666a4-9cba-d088-74a5-ae7ef0c25bdf")
public static final String FIELDNAME_PaymentTerm_DocumentNote="34c666a4-9cba-d088-74a5-ae7ef0c25bdf";

@XendraTrl(Identifier="40386823-7d05-f01d-4e8f-dc32b48289a7")
public static String es_PE_COLUMN_DocumentNote_Name="Nota de Documento";

@XendraColumn(AD_Element_ID="facce503-36ce-65e5-ad96-c872503feb2e",ColumnName="DocumentNote",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="40386823-7d05-f01d-4e8f-dc32b48289a7",
Synchronized="2017-08-05 16:54:03.0")
/** Column name DocumentNote */
public static final String COLUMNNAME_DocumentNote = "DocumentNote";
/** Set Fix month cutoff.
@param FixMonthCutoff Last day to include for next due date */
public void setFixMonthCutoff (int FixMonthCutoff)
{
set_Value (COLUMNNAME_FixMonthCutoff, Integer.valueOf(FixMonthCutoff));
}
/** Get Fix month cutoff.
@return Last day to include for next due date */
public int getFixMonthCutoff() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_FixMonthCutoff);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="34861868-0d1e-78c2-b2c6-aa0de8da7d25")
public static String es_PE_FIELD_PaymentTerm_FixMonthCutoff_Description="Último día a incluir en la siguiente fecha de vencimiento";

@XendraTrl(Identifier="34861868-0d1e-78c2-b2c6-aa0de8da7d25")
public static String es_PE_FIELD_PaymentTerm_FixMonthCutoff_Help="El corte de mes Fijo indica el último día que las facturas pueden ser incluidas en la fecha de vencimiento actual. Este campo sólo se despliega cuando el cuadro de verificación fecha de vencimiento fija ha sido seleccionada";

@XendraTrl(Identifier="34861868-0d1e-78c2-b2c6-aa0de8da7d25")
public static String es_PE_FIELD_PaymentTerm_FixMonthCutoff_Name="Corte de Mes";

@XendraField(AD_Column_ID="FixMonthCutoff",IsCentrallyMaintained=true,
AD_Tab_ID="4d2bc8ba-7fb7-8c94-3f70-53594245e6a3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsDueFixed@='Y'",DisplayLength=11,IsReadOnly=false,SeqNo=120,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="34861868-0d1e-78c2-b2c6-aa0de8da7d25")
public static final String FIELDNAME_PaymentTerm_FixMonthCutoff="34861868-0d1e-78c2-b2c6-aa0de8da7d25";

@XendraTrl(Identifier="e9b86615-ceda-40ac-736d-5e7901274f0e")
public static String es_PE_COLUMN_FixMonthCutoff_Name="Corte de Mes";

@XendraColumn(AD_Element_ID="568edb7d-726c-d8db-ff62-97bef8c5bb75",ColumnName="FixMonthCutoff",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e9b86615-ceda-40ac-736d-5e7901274f0e",
Synchronized="2017-08-05 16:54:03.0")
/** Column name FixMonthCutoff */
public static final String COLUMNNAME_FixMonthCutoff = "FixMonthCutoff";
/** Set Fix month day.
@param FixMonthDay Day of the month of the due date */
public void setFixMonthDay (int FixMonthDay)
{
set_Value (COLUMNNAME_FixMonthDay, Integer.valueOf(FixMonthDay));
}
/** Get Fix month day.
@return Day of the month of the due date */
public int getFixMonthDay() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_FixMonthDay);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9a3576c1-7683-c003-1946-6711ae1c747f")
public static String es_PE_FIELD_PaymentTerm_FixMonthDay_Description="Día del mes de la fecha de vencimiento";

@XendraTrl(Identifier="9a3576c1-7683-c003-1946-6711ae1c747f")
public static String es_PE_FIELD_PaymentTerm_FixMonthDay_Help="El día del mes fijo indica el día del mes que las facturas se vencen. Este campo sólo se despliega si la caja de verificación fecha de vencimiento fija se selecciona";

@XendraTrl(Identifier="9a3576c1-7683-c003-1946-6711ae1c747f")
public static String es_PE_FIELD_PaymentTerm_FixMonthDay_Name="Día del mes Vencimiento";

@XendraField(AD_Column_ID="FixMonthDay",IsCentrallyMaintained=true,
AD_Tab_ID="4d2bc8ba-7fb7-8c94-3f70-53594245e6a3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsDueFixed@='Y'",DisplayLength=11,IsReadOnly=false,SeqNo=110,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="9a3576c1-7683-c003-1946-6711ae1c747f")
public static final String FIELDNAME_PaymentTerm_FixMonthDay="9a3576c1-7683-c003-1946-6711ae1c747f";

@XendraTrl(Identifier="d6ee5795-660a-fa53-5df1-643cb8532496")
public static String es_PE_COLUMN_FixMonthDay_Name="Día del mes Vencimiento";

@XendraColumn(AD_Element_ID="8bcae60d-0e04-420d-ea61-bba03c949d72",ColumnName="FixMonthDay",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d6ee5795-660a-fa53-5df1-643cb8532496",
Synchronized="2017-08-05 16:54:03.0")
/** Column name FixMonthDay */
public static final String COLUMNNAME_FixMonthDay = "FixMonthDay";
/** Set Fix month offset.
@param FixMonthOffset Number of months (0=same, 1=following) */
public void setFixMonthOffset (int FixMonthOffset)
{
set_Value (COLUMNNAME_FixMonthOffset, Integer.valueOf(FixMonthOffset));
}
/** Get Fix month offset.
@return Number of months (0=same, 1=following) */
public int getFixMonthOffset() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_FixMonthOffset);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="252078f4-8d7a-ee33-2a46-35703cd78b60")
public static String es_PE_FIELD_PaymentTerm_FixMonthOffset_Description="Número de meses (0=mismo; 1=siguiente)";

@XendraTrl(Identifier="252078f4-8d7a-ee33-2a46-35703cd78b60")
public static String es_PE_FIELD_PaymentTerm_FixMonthOffset_Help="El desfasamiento de mes fijo indica el número de meses desde el mes actual para indicar que una factura se vence . Un 0 indica el mismo mes; un 1 el mes siguiente. Este campo se desplegará solamente si el cuadro de verificación fecha de vencimiento fija se selecciona.";

@XendraTrl(Identifier="252078f4-8d7a-ee33-2a46-35703cd78b60")
public static String es_PE_FIELD_PaymentTerm_FixMonthOffset_Name="Desfasamiento del mes";

@XendraField(AD_Column_ID="FixMonthOffset",IsCentrallyMaintained=true,
AD_Tab_ID="4d2bc8ba-7fb7-8c94-3f70-53594245e6a3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsDueFixed@='Y'",DisplayLength=11,IsReadOnly=false,SeqNo=130,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="252078f4-8d7a-ee33-2a46-35703cd78b60")
public static final String FIELDNAME_PaymentTerm_FixMonthOffset="252078f4-8d7a-ee33-2a46-35703cd78b60";

@XendraTrl(Identifier="ea790f45-a67f-364f-49d1-db40d0134b36")
public static String es_PE_COLUMN_FixMonthOffset_Name="Desfasamiento del mes";

@XendraColumn(AD_Element_ID="a4bb57a1-f3ea-0cdb-8853-82a8a38e58b5",ColumnName="FixMonthOffset",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ea790f45-a67f-364f-49d1-db40d0134b36",
Synchronized="2017-08-05 16:54:03.0")
/** Column name FixMonthOffset */
public static final String COLUMNNAME_FixMonthOffset = "FixMonthOffset";
/** Set Grace Days.
@param GraceDays Days after due date to send first dunning letter */
public void setGraceDays (int GraceDays)
{
set_Value (COLUMNNAME_GraceDays, Integer.valueOf(GraceDays));
}
/** Get Grace Days.
@return Days after due date to send first dunning letter */
public int getGraceDays() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_GraceDays);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="66985a60-b3e7-cdec-ec3b-6753f4face51")
public static String es_PE_FIELD_PaymentTerm_GraceDays_Description="Días después de la fecha de vencimiento para enviar la primera carta de morosidad";

@XendraTrl(Identifier="66985a60-b3e7-cdec-ec3b-6753f4face51")
public static String es_PE_FIELD_PaymentTerm_GraceDays_Help="Días de gracia indica el número de días después de la fecha de vencimiento para enviar la primera carta de morosidad. Este campo se desplegará solamente si el cuadro de verificación enviar cartas de morosidad ha sido seleccionado";

@XendraTrl(Identifier="66985a60-b3e7-cdec-ec3b-6753f4face51")
public static String es_PE_FIELD_PaymentTerm_GraceDays_Name="Días de Gracia";

@XendraField(AD_Column_ID="GraceDays",IsCentrallyMaintained=true,
AD_Tab_ID="4d2bc8ba-7fb7-8c94-3f70-53594245e6a3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="66985a60-b3e7-cdec-ec3b-6753f4face51")
public static final String FIELDNAME_PaymentTerm_GraceDays="66985a60-b3e7-cdec-ec3b-6753f4face51";

@XendraTrl(Identifier="9baad1f5-c08d-9b5e-10b5-df1d74dfd941")
public static String es_PE_COLUMN_GraceDays_Name="Días de Gracia";

@XendraColumn(AD_Element_ID="5db0c6c3-26a5-fde2-9b91-af60517be938",ColumnName="GraceDays",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9baad1f5-c08d-9b5e-10b5-df1d74dfd941",
Synchronized="2017-08-05 16:54:03.0")
/** Column name GraceDays */
public static final String COLUMNNAME_GraceDays = "GraceDays";
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
@XendraTrl(Identifier="e3415626-ab13-49ff-a14f-7b5315135e93")
public static String es_PE_FIELD_PaymentTerm_Identifier_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="4d2bc8ba-7fb7-8c94-3f70-53594245e6a3",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=36,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-05-13 18:48:14.0",
Identifier="e3415626-ab13-49ff-a14f-7b5315135e93")
public static final String FIELDNAME_PaymentTerm_Identifier="e3415626-ab13-49ff-a14f-7b5315135e93";

@XendraTrl(Identifier="e47f909e-4daa-4a98-a7d3-1d322273a231")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e47f909e-4daa-4a98-a7d3-1d322273a231",
Synchronized="2017-08-05 16:54:03.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Default.
@param IsDefault Default value */
public void setIsDefault (boolean IsDefault)
{
set_Value (COLUMNNAME_IsDefault, Boolean.valueOf(IsDefault));
}
/** Get Default.
@return Default value */
public boolean isDefault() 
{
Object oo = get_Value(COLUMNNAME_IsDefault);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="47a0f2ba-5fa7-8b63-2ab5-6d1bff044057")
public static String es_PE_FIELD_PaymentTerm_Default_Description="Valor Predeterminado";

@XendraTrl(Identifier="47a0f2ba-5fa7-8b63-2ab5-6d1bff044057")
public static String es_PE_FIELD_PaymentTerm_Default_Help="El cuadro de verificación indica si este registro será usado como un valor predeterminado";

@XendraTrl(Identifier="47a0f2ba-5fa7-8b63-2ab5-6d1bff044057")
public static String es_PE_FIELD_PaymentTerm_Default_Name="Predeterminado";

@XendraField(AD_Column_ID="IsDefault",IsCentrallyMaintained=true,
AD_Tab_ID="4d2bc8ba-7fb7-8c94-3f70-53594245e6a3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="47a0f2ba-5fa7-8b63-2ab5-6d1bff044057")
public static final String FIELDNAME_PaymentTerm_Default="47a0f2ba-5fa7-8b63-2ab5-6d1bff044057";

@XendraTrl(Identifier="5980971a-0451-d4e0-e21c-ee89fcfbd78e")
public static String es_PE_COLUMN_IsDefault_Name="Predeterminado";

@XendraColumn(AD_Element_ID="8617f892-e113-a5fd-8715-687f792f136c",ColumnName="IsDefault",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5980971a-0451-d4e0-e21c-ee89fcfbd78e",
Synchronized="2017-08-05 16:54:03.0")
/** Column name IsDefault */
public static final String COLUMNNAME_IsDefault = "IsDefault";
/** Set Fixed due date.
@param IsDueFixed Payment is due on a fixed date */
public void setIsDueFixed (boolean IsDueFixed)
{
set_Value (COLUMNNAME_IsDueFixed, Boolean.valueOf(IsDueFixed));
}
/** Get Fixed due date.
@return Payment is due on a fixed date */
public boolean isDueFixed() 
{
Object oo = get_Value(COLUMNNAME_IsDueFixed);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="254edfaa-26cf-b97b-3e64-b81fc07b3e48")
public static String es_PE_FIELD_PaymentTerm_FixedDueDate_Description="El pago se vence en una fecha fija";

@XendraTrl(Identifier="254edfaa-26cf-b97b-3e64-b81fc07b3e48")
public static String es_PE_FIELD_PaymentTerm_FixedDueDate_Help="El cuadro de verificación fecha de vencimiento Fija.";

@XendraTrl(Identifier="254edfaa-26cf-b97b-3e64-b81fc07b3e48")
public static String es_PE_FIELD_PaymentTerm_FixedDueDate_Name="Fecha de Vencimiento Fija";

@XendraField(AD_Column_ID="IsDueFixed",IsCentrallyMaintained=true,
AD_Tab_ID="4d2bc8ba-7fb7-8c94-3f70-53594245e6a3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="254edfaa-26cf-b97b-3e64-b81fc07b3e48")
public static final String FIELDNAME_PaymentTerm_FixedDueDate="254edfaa-26cf-b97b-3e64-b81fc07b3e48";

@XendraTrl(Identifier="c504f1bc-d8b2-23c2-50af-b169cfa3d16c")
public static String es_PE_COLUMN_IsDueFixed_Name="Fecha de Vencimiento Fija";

@XendraColumn(AD_Element_ID="a0d8222b-c81e-12ff-1ba6-17668d6df6c0",ColumnName="IsDueFixed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c504f1bc-d8b2-23c2-50af-b169cfa3d16c",
Synchronized="2017-08-05 16:54:03.0")
/** Column name IsDueFixed */
public static final String COLUMNNAME_IsDueFixed = "IsDueFixed";
/** Set Next Business Day.
@param IsNextBusinessDay Payment due on the next business day */
public void setIsNextBusinessDay (boolean IsNextBusinessDay)
{
set_Value (COLUMNNAME_IsNextBusinessDay, Boolean.valueOf(IsNextBusinessDay));
}
/** Get Next Business Day.
@return Payment due on the next business day */
public boolean isNextBusinessDay() 
{
Object oo = get_Value(COLUMNNAME_IsNextBusinessDay);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="dbd33685-c4b9-532d-8794-51326cf46cb2")
public static String es_PE_FIELD_PaymentTerm_NextBusinessDay_Description="Pago vence en el siguiente día hábil";

@XendraTrl(Identifier="dbd33685-c4b9-532d-8794-51326cf46cb2")
public static String es_PE_FIELD_PaymentTerm_NextBusinessDay_Help="El cuadro de verificación siguiente día del negocio indica que el pago se vence el siguiente día del negocio después de la factura ó entrega";

@XendraTrl(Identifier="dbd33685-c4b9-532d-8794-51326cf46cb2")
public static String es_PE_FIELD_PaymentTerm_NextBusinessDay_Name="Día Hábil Siguiente";

@XendraField(AD_Column_ID="IsNextBusinessDay",IsCentrallyMaintained=true,
AD_Tab_ID="4d2bc8ba-7fb7-8c94-3f70-53594245e6a3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dbd33685-c4b9-532d-8794-51326cf46cb2")
public static final String FIELDNAME_PaymentTerm_NextBusinessDay="dbd33685-c4b9-532d-8794-51326cf46cb2";

@XendraTrl(Identifier="1406c3ea-9457-f9d1-ae58-03aea9568c1a")
public static String es_PE_COLUMN_IsNextBusinessDay_Name="Día Hábil Siguiente";

@XendraColumn(AD_Element_ID="ea48ea6c-4722-03c2-7fad-13417fa3dcba",ColumnName="IsNextBusinessDay",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1406c3ea-9457-f9d1-ae58-03aea9568c1a",
Synchronized="2017-08-05 16:54:03.0")
/** Column name IsNextBusinessDay */
public static final String COLUMNNAME_IsNextBusinessDay = "IsNextBusinessDay";
/** Set Valid.
@param IsValid Element is valid */
public void setIsValid (boolean IsValid)
{
set_Value (COLUMNNAME_IsValid, Boolean.valueOf(IsValid));
}
/** Get Valid.
@return Element is valid */
public boolean isValid() 
{
Object oo = get_Value(COLUMNNAME_IsValid);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="95b6a639-286e-22c1-b4b8-fad679dbae91")
public static String es_PE_FIELD_PaymentTerm_Valid_Description="El elemento es valido";

@XendraTrl(Identifier="95b6a639-286e-22c1-b4b8-fad679dbae91")
public static String es_PE_FIELD_PaymentTerm_Valid_Help="El elemento pasado es el cheque de la validación";

@XendraTrl(Identifier="95b6a639-286e-22c1-b4b8-fad679dbae91")
public static String es_PE_FIELD_PaymentTerm_Valid_Name="Valido";

@XendraField(AD_Column_ID="IsValid",IsCentrallyMaintained=true,
AD_Tab_ID="4d2bc8ba-7fb7-8c94-3f70-53594245e6a3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=240,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="95b6a639-286e-22c1-b4b8-fad679dbae91")
public static final String FIELDNAME_PaymentTerm_Valid="95b6a639-286e-22c1-b4b8-fad679dbae91";

@XendraTrl(Identifier="67816a41-7684-8287-4de2-bf728b90dd2e")
public static String es_PE_COLUMN_IsValid_Name="Valido";

@XendraColumn(AD_Element_ID="394c3099-1638-2f07-2e14-7bd38bb8ad25",ColumnName="IsValid",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="67816a41-7684-8287-4de2-bf728b90dd2e",
Synchronized="2017-08-05 16:54:03.0")
/** Column name IsValid */
public static final String COLUMNNAME_IsValid = "IsValid";
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

@XendraTrl(Identifier="341c5c1c-be56-9231-ebdb-2ddeee77de53")
public static String es_PE_FIELD_PaymentTerm_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="341c5c1c-be56-9231-ebdb-2ddeee77de53")
public static String es_PE_FIELD_PaymentTerm_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="341c5c1c-be56-9231-ebdb-2ddeee77de53")
public static String es_PE_FIELD_PaymentTerm_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="4d2bc8ba-7fb7-8c94-3f70-53594245e6a3",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="341c5c1c-be56-9231-ebdb-2ddeee77de53")
public static final String FIELDNAME_PaymentTerm_Name="341c5c1c-be56-9231-ebdb-2ddeee77de53";

@XendraTrl(Identifier="be644f21-754d-3087-c47b-0cf9220224c8")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="be644f21-754d-3087-c47b-0cf9220224c8",
Synchronized="2017-08-05 16:54:03.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";

/** NetDay AD_Reference=83e938bc-4a87-77a1-cbb0-83c31065e487 */
public static final int NETDAY_AD_Reference_ID=167;
/** Set Net Day.
@param NetDay Day when payment is due net */
public void setNetDay (String NetDay)
{
if (NetDay == null || NetDay.equals(REF_Weekdays.Sunday) || NetDay.equals(REF_Weekdays.Monday) || NetDay.equals(REF_Weekdays.Tuesday) || NetDay.equals(REF_Weekdays.Wednesday) || NetDay.equals(REF_Weekdays.Thursday) || NetDay.equals(REF_Weekdays.Friday) || NetDay.equals(REF_Weekdays.Saturday));
 else throw new IllegalArgumentException ("NetDay Invalid value - " + NetDay + " - Reference_ID=167 - 7 - 1 - 2 - 3 - 4 - 5 - 6");
if (NetDay != null && NetDay.length() > 1)
{
log.warning("Length > 1 - truncated");
NetDay = NetDay.substring(0,0);
}
set_Value (COLUMNNAME_NetDay, NetDay);
}
/** Get Net Day.
@return Day when payment is due net */
public String getNetDay() 
{
return (String)get_Value(COLUMNNAME_NetDay);
}

@XendraTrl(Identifier="011cf9a5-b305-7017-7650-5efa08588042")
public static String es_PE_FIELD_PaymentTerm_NetDay_Description="Día cuando se efectuará el pago";

@XendraTrl(Identifier="011cf9a5-b305-7017-7650-5efa08588042")
public static String es_PE_FIELD_PaymentTerm_NetDay_Help="Cuando está definido, sobreescribe el número de los días netos con el número relativo de días el día definido.";

@XendraTrl(Identifier="011cf9a5-b305-7017-7650-5efa08588042")
public static String es_PE_FIELD_PaymentTerm_NetDay_Name="Día Neto";

@XendraField(AD_Column_ID="NetDay",IsCentrallyMaintained=true,
AD_Tab_ID="4d2bc8ba-7fb7-8c94-3f70-53594245e6a3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsDueFixed@='N'",DisplayLength=14,IsReadOnly=false,SeqNo=150,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="011cf9a5-b305-7017-7650-5efa08588042")
public static final String FIELDNAME_PaymentTerm_NetDay="011cf9a5-b305-7017-7650-5efa08588042";

@XendraTrl(Identifier="d16f73b1-d8c7-d6de-d4ea-b036234773b8")
public static String es_PE_COLUMN_NetDay_Name="Día Neto";

@XendraColumn(AD_Element_ID="077bc8b4-fcff-dfe2-09c6-0ae658109a32",ColumnName="NetDay",
AD_Reference_ID=17,AD_Reference_Value_ID="83e938bc-4a87-77a1-cbb0-83c31065e487",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d16f73b1-d8c7-d6de-d4ea-b036234773b8",Synchronized="2017-08-05 16:54:03.0")
/** Column name NetDay */
public static final String COLUMNNAME_NetDay = "NetDay";
/** Set Net Days.
@param NetDays Net Days in which payment is due */
public void setNetDays (int NetDays)
{
set_Value (COLUMNNAME_NetDays, Integer.valueOf(NetDays));
}
/** Get Net Days.
@return Net Days in which payment is due */
public int getNetDays() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_NetDays);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7d91a2f3-24b2-cc11-c671-cc4e6a2d587d")
public static String es_PE_FIELD_PaymentTerm_NetDays_Description="Días netos en los cuales el pago se vence";

@XendraTrl(Identifier="7d91a2f3-24b2-cc11-c671-cc4e6a2d587d")
public static String es_PE_FIELD_PaymentTerm_NetDays_Help="Indica el número de días después de la fecha de la factura en que el pago se vence";

@XendraTrl(Identifier="7d91a2f3-24b2-cc11-c671-cc4e6a2d587d")
public static String es_PE_FIELD_PaymentTerm_NetDays_Name="Días Neto";

@XendraField(AD_Column_ID="NetDays",IsCentrallyMaintained=true,
AD_Tab_ID="4d2bc8ba-7fb7-8c94-3f70-53594245e6a3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsDueFixed@='N'",DisplayLength=11,IsReadOnly=false,SeqNo=140,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="7d91a2f3-24b2-cc11-c671-cc4e6a2d587d")
public static final String FIELDNAME_PaymentTerm_NetDays="7d91a2f3-24b2-cc11-c671-cc4e6a2d587d";

@XendraTrl(Identifier="e45fca74-c8d7-3203-28de-51015c72e05d")
public static String es_PE_COLUMN_NetDays_Name="Días Neto";

@XendraColumn(AD_Element_ID="8c6a9b99-2bf1-0a28-1149-2bfd59b7c622",ColumnName="NetDays",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e45fca74-c8d7-3203-28de-51015c72e05d",
Synchronized="2017-08-05 16:54:03.0")
/** Column name NetDays */
public static final String COLUMNNAME_NetDays = "NetDays";
/** Set NickelRoundAmt.
@param NickelRoundAmt Amount of Nickel minimal to be rounded */
public void setNickelRoundAmt (BigDecimal NickelRoundAmt)
{
set_Value (COLUMNNAME_NickelRoundAmt, NickelRoundAmt);
}
/** Get NickelRoundAmt.
@return Amount of Nickel minimal to be rounded */
public BigDecimal getNickelRoundAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_NickelRoundAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="cd6da428-1b87-44ed-ab58-0c535637f4da")
public static String es_PE_FIELD_PaymentTerm_NickelRoundAmt_Name="nickelroundamt";

@XendraField(AD_Column_ID="NickelRoundAmt",IsCentrallyMaintained=true,
AD_Tab_ID="4d2bc8ba-7fb7-8c94-3f70-53594245e6a3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-05-13 18:48:14.0",
Identifier="cd6da428-1b87-44ed-ab58-0c535637f4da")
public static final String FIELDNAME_PaymentTerm_NickelRoundAmt="cd6da428-1b87-44ed-ab58-0c535637f4da";

@XendraTrl(Identifier="507cf414-dfa3-4f2e-bb10-8b103d2eff89")
public static String es_PE_COLUMN_NickelRoundAmt_Name="nickelroundamt";

@XendraColumn(AD_Element_ID="f5ecc92f-11e0-4db1-acff-23d6862013b8",ColumnName="NickelRoundAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="507cf414-dfa3-4f2e-bb10-8b103d2eff89",
Synchronized="2017-08-05 16:54:03.0")
/** Column name NickelRoundAmt */
public static final String COLUMNNAME_NickelRoundAmt = "NickelRoundAmt";
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

@XendraTrl(Identifier="6ac6684a-3d45-df27-0ef0-d88ea6886c33")
public static String es_PE_FIELD_PaymentTerm_ProcessNow_Description="Validar Programa de Pagos";

@XendraTrl(Identifier="6ac6684a-3d45-df27-0ef0-d88ea6886c33")
public static String es_PE_FIELD_PaymentTerm_ProcessNow_Name="Validar";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="4d2bc8ba-7fb7-8c94-3f70-53594245e6a3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6ac6684a-3d45-df27-0ef0-d88ea6886c33")
public static final String FIELDNAME_PaymentTerm_ProcessNow="6ac6684a-3d45-df27-0ef0-d88ea6886c33";

@XendraTrl(Identifier="4393f512-8bf0-3c2c-fb5b-94c1530a7d74")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="537a3e07-67e7-c88c-c10a-6bcd7801867a",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="4393f512-8bf0-3c2c-fb5b-94c1530a7d74",Synchronized="2017-08-05 16:54:03.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Search Key.
@param Value Search key for the record in the format required - must be unique */
public void setValue (String Value)
{
if (Value == null) throw new IllegalArgumentException ("Value is mandatory.");
if (Value.length() > 40)
{
log.warning("Length > 40 - truncated");
Value = Value.substring(0,39);
}
set_Value (COLUMNNAME_Value, Value);
}
/** Get Search Key.
@return Search key for the record in the format required - must be unique */
public String getValue() 
{
String value = (String)get_Value(COLUMNNAME_Value);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="b031d5ad-10c9-772a-0f3b-4cccf873d7a1")
public static String es_PE_FIELD_PaymentTerm_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="b031d5ad-10c9-772a-0f3b-4cccf873d7a1")
public static String es_PE_FIELD_PaymentTerm_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraTrl(Identifier="b031d5ad-10c9-772a-0f3b-4cccf873d7a1")
public static String es_PE_FIELD_PaymentTerm_SearchKey_Name="Clave de Búsqueda";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="4d2bc8ba-7fb7-8c94-3f70-53594245e6a3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b031d5ad-10c9-772a-0f3b-4cccf873d7a1")
public static final String FIELDNAME_PaymentTerm_SearchKey="b031d5ad-10c9-772a-0f3b-4cccf873d7a1";

@XendraTrl(Identifier="20bf308c-e4e2-2009-a719-4d2a2deee208")
public static String es_PE_COLUMN_Value_Name="Clave de Búsqueda";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="20bf308c-e4e2-2009-a719-4d2a2deee208",
Synchronized="2017-08-05 16:54:03.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
}
