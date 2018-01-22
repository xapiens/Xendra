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
/** Generated Model for I_InOutLineConfirm
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_I_InOutLineConfirm extends PO
{
/** Standard Constructor
@param ctx context
@param I_InOutLineConfirm_ID id
@param trxName transaction
*/
public X_I_InOutLineConfirm (Properties ctx, int I_InOutLineConfirm_ID, String trxName)
{
super (ctx, I_InOutLineConfirm_ID, trxName);
/** if (I_InOutLineConfirm_ID == 0)
{
setConfirmationNo (null);
setConfirmedQty (Env.ZERO);
setDifferenceQty (Env.ZERO);
setI_InOutLineConfirm_ID (0);
setI_IsImported (false);	
// N
setM_InOutLineConfirm_ID (0);
setScrappedQty (Env.ZERO);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_I_InOutLineConfirm (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=740 */
public static int Table_ID=MTable.getTable_ID("I_InOutLineConfirm");

@XendraTrl(Identifier="dacdf85a-28d1-8870-4c7c-eb4b0532b6b9")
public static String es_PE_TAB_ConfirmationLines_Description="Importa Ìtem de confirmación de entrega/recibo";

@XendraTrl(Identifier="dacdf85a-28d1-8870-4c7c-eb4b0532b6b9")
public static String es_PE_TAB_ConfirmationLines_Name="Líneas de Confirmación";

@XendraTrl(Identifier="dacdf85a-28d1-8870-4c7c-eb4b0532b6b9")
public static String es_PE_TAB_ConfirmationLines_Help="Datos de confirmación de la importación de las confirmaciones de entregas existentes/recibos.";

@XendraTab(Name="Confirmation Lines",Description="Import Receipt/Shipment Confirmation Lines",
Help="Import Confirmation data of existing Receipt/Shipment Confirmations",
AD_Window_ID="edf3096e-5fc4-ff96-89b2-45793c434f0b",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="dacdf85a-28d1-8870-4c7c-eb4b0532b6b9",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ConfirmationLines="dacdf85a-28d1-8870-4c7c-eb4b0532b6b9";

@XendraTrl(Identifier="fe017845-fafd-797e-3dc9-e43ceec0113c")
public static String es_PE_TABLE_I_InOutLineConfirm_Name="Entrega/Recibo Línea de Confirmación de la importación ";


@XendraTable(Name="Ship/Receipt Confirmation Import Line",
Description="Material Shipment or Receipt Confirmation Import Line",Help="",
TableName="I_InOutLineConfirm",AccessLevel="2",AD_Window_ID="edf3096e-5fc4-ff96-89b2-45793c434f0b",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.import",
Identifier="fe017845-fafd-797e-3dc9-e43ceec0113c",Synchronized="2017-08-16 11:42:59.0")
/** TableName=I_InOutLineConfirm */
public static final String Table_Name="I_InOutLineConfirm";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"I_InOutLineConfirm");

protected BigDecimal accessLevel = BigDecimal.valueOf(2);
/** AccessLevel
@return 2 - Client 
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
    Table_ID = MTable.getTable_ID("I_InOutLineConfirm");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_I_InOutLineConfirm[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Confirmation No.
@param ConfirmationNo Confirmation Number */
public void setConfirmationNo (String ConfirmationNo)
{
if (ConfirmationNo == null) throw new IllegalArgumentException ("ConfirmationNo is mandatory.");
if (ConfirmationNo.length() > 20)
{
log.warning("Length > 20 - truncated");
ConfirmationNo = ConfirmationNo.substring(0,19);
}
set_Value (COLUMNNAME_ConfirmationNo, ConfirmationNo);
}
/** Get Confirmation No.
@return Confirmation Number */
public String getConfirmationNo() 
{
String value = (String)get_Value(COLUMNNAME_ConfirmationNo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="fd9d5ec1-a1c2-dfb4-e22b-b5d73a6b2874")
public static String es_PE_FIELD_ConfirmationLines_ConfirmationNo_Description="Número de confirmación";

@XendraTrl(Identifier="fd9d5ec1-a1c2-dfb4-e22b-b5d73a6b2874")
public static String es_PE_FIELD_ConfirmationLines_ConfirmationNo_Name="No. de Confirmación";

@XendraField(AD_Column_ID="ConfirmationNo",IsCentrallyMaintained=true,
AD_Tab_ID="dacdf85a-28d1-8870-4c7c-eb4b0532b6b9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fd9d5ec1-a1c2-dfb4-e22b-b5d73a6b2874")
public static final String FIELDNAME_ConfirmationLines_ConfirmationNo="fd9d5ec1-a1c2-dfb4-e22b-b5d73a6b2874";

@XendraTrl(Identifier="a8419c8d-6a77-7488-1119-9b12d0ef26d5")
public static String es_PE_COLUMN_ConfirmationNo_Name="No. de Confirmación";

@XendraColumn(AD_Element_ID="d976e121-1e1b-2d2d-2125-7fa5bf911c19",ColumnName="ConfirmationNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a8419c8d-6a77-7488-1119-9b12d0ef26d5",
Synchronized="2017-08-05 16:54:53.0")
/** Column name ConfirmationNo */
public static final String COLUMNNAME_ConfirmationNo = "ConfirmationNo";
/** Set Confirmed Quantity.
@param ConfirmedQty Confirmation of a received quantity */
public void setConfirmedQty (BigDecimal ConfirmedQty)
{
if (ConfirmedQty == null) throw new IllegalArgumentException ("ConfirmedQty is mandatory.");
set_Value (COLUMNNAME_ConfirmedQty, ConfirmedQty);
}
/** Get Confirmed Quantity.
@return Confirmation of a received quantity */
public BigDecimal getConfirmedQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ConfirmedQty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="92772f5f-c6dc-1a69-d44e-ad2cc1f3736f")
public static String es_PE_FIELD_ConfirmationLines_ConfirmedQuantity_Description="Confirmación de la cantidad recibida";

@XendraTrl(Identifier="92772f5f-c6dc-1a69-d44e-ad2cc1f3736f")
public static String es_PE_FIELD_ConfirmationLines_ConfirmedQuantity_Help="Confirmación de la cantidad recibida";

@XendraTrl(Identifier="92772f5f-c6dc-1a69-d44e-ad2cc1f3736f")
public static String es_PE_FIELD_ConfirmationLines_ConfirmedQuantity_Name="Cantidad Confirmada";

@XendraField(AD_Column_ID="ConfirmedQty",IsCentrallyMaintained=true,
AD_Tab_ID="dacdf85a-28d1-8870-4c7c-eb4b0532b6b9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="92772f5f-c6dc-1a69-d44e-ad2cc1f3736f")
public static final String FIELDNAME_ConfirmationLines_ConfirmedQuantity="92772f5f-c6dc-1a69-d44e-ad2cc1f3736f";

@XendraTrl(Identifier="a85d2c47-802c-2336-8d9b-065190292084")
public static String es_PE_COLUMN_ConfirmedQty_Name="Cantidad Confirmada";

@XendraColumn(AD_Element_ID="e612ae07-ebb5-65be-fcbd-a37419fb113f",ColumnName="ConfirmedQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a85d2c47-802c-2336-8d9b-065190292084",
Synchronized="2017-08-05 16:54:53.0")
/** Column name ConfirmedQty */
public static final String COLUMNNAME_ConfirmedQty = "ConfirmedQty";
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

@XendraTrl(Identifier="7c1e6e2d-1382-d603-31c5-e245de37c1b9")
public static String es_PE_FIELD_ConfirmationLines_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="7c1e6e2d-1382-d603-31c5-e245de37c1b9")
public static String es_PE_FIELD_ConfirmationLines_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="7c1e6e2d-1382-d603-31c5-e245de37c1b9")
public static String es_PE_FIELD_ConfirmationLines_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="dacdf85a-28d1-8870-4c7c-eb4b0532b6b9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7c1e6e2d-1382-d603-31c5-e245de37c1b9")
public static final String FIELDNAME_ConfirmationLines_Description="7c1e6e2d-1382-d603-31c5-e245de37c1b9";

@XendraTrl(Identifier="2ab4336d-5ff1-6b7a-b294-111ffb1a623c")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2ab4336d-5ff1-6b7a-b294-111ffb1a623c",
Synchronized="2017-08-05 16:54:53.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Difference.
@param DifferenceQty Difference Quantity */
public void setDifferenceQty (BigDecimal DifferenceQty)
{
if (DifferenceQty == null) throw new IllegalArgumentException ("DifferenceQty is mandatory.");
set_Value (COLUMNNAME_DifferenceQty, DifferenceQty);
}
/** Get Difference.
@return Difference Quantity */
public BigDecimal getDifferenceQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_DifferenceQty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="1f757cbe-0817-5356-48b5-6e4e66d9d6e7")
public static String es_PE_FIELD_ConfirmationLines_Difference_Description="Cantidad de diferencia";

@XendraTrl(Identifier="1f757cbe-0817-5356-48b5-6e4e66d9d6e7")
public static String es_PE_FIELD_ConfirmationLines_Difference_Name="Diferencia Cant.";

@XendraField(AD_Column_ID="DifferenceQty",IsCentrallyMaintained=true,
AD_Tab_ID="dacdf85a-28d1-8870-4c7c-eb4b0532b6b9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1f757cbe-0817-5356-48b5-6e4e66d9d6e7")
public static final String FIELDNAME_ConfirmationLines_Difference="1f757cbe-0817-5356-48b5-6e4e66d9d6e7";

@XendraTrl(Identifier="afea35ae-229c-25bc-42e3-e1c6a9ccd73d")
public static String es_PE_COLUMN_DifferenceQty_Name="Diferencia Cant.";

@XendraColumn(AD_Element_ID="7bb51895-43a5-614f-71a2-9c6ac66e8ea0",ColumnName="DifferenceQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="afea35ae-229c-25bc-42e3-e1c6a9ccd73d",
Synchronized="2017-08-05 16:54:53.0")
/** Column name DifferenceQty */
public static final String COLUMNNAME_DifferenceQty = "DifferenceQty";
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
@XendraTrl(Identifier="4907e86c-0758-4c53-baf3-a87b8e4b4f1a")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4907e86c-0758-4c53-baf3-a87b8e4b4f1a",
Synchronized="2017-08-05 16:54:53.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Import Error Message.
@param I_ErrorMsg Messages generated from import process */
public void setI_ErrorMsg (String I_ErrorMsg)
{
if (I_ErrorMsg != null && I_ErrorMsg.length() > 2000)
{
log.warning("Length > 2000 - truncated");
I_ErrorMsg = I_ErrorMsg.substring(0,1999);
}
set_Value (COLUMNNAME_I_ErrorMsg, I_ErrorMsg);
}
/** Get Import Error Message.
@return Messages generated from import process */
public String getI_ErrorMsg() 
{
String value = (String)get_Value(COLUMNNAME_I_ErrorMsg);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="eda7f588-a343-1015-35f3-69bf480fbcf7")
public static String es_PE_FIELD_ConfirmationLines_ImportErrorMessage_Description="Mensajes generados desde procesos de importación";

@XendraTrl(Identifier="eda7f588-a343-1015-35f3-69bf480fbcf7")
public static String es_PE_FIELD_ConfirmationLines_ImportErrorMessage_Help="El mensaje de error de Importación despliega cualquier mensaje de error generado durante el proceso de importación.";

@XendraTrl(Identifier="eda7f588-a343-1015-35f3-69bf480fbcf7")
public static String es_PE_FIELD_ConfirmationLines_ImportErrorMessage_Name="Mensajes de Error al Importar";

@XendraField(AD_Column_ID="I_ErrorMsg",IsCentrallyMaintained=true,
AD_Tab_ID="dacdf85a-28d1-8870-4c7c-eb4b0532b6b9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="eda7f588-a343-1015-35f3-69bf480fbcf7")
public static final String FIELDNAME_ConfirmationLines_ImportErrorMessage="eda7f588-a343-1015-35f3-69bf480fbcf7";

@XendraTrl(Identifier="913bfebd-9d5f-7533-18ec-56ca0d72885b")
public static String es_PE_COLUMN_I_ErrorMsg_Name="Mensajes de Error al Importar";

@XendraColumn(AD_Element_ID="e512e524-25c8-eddd-ad88-d2ce6b66fdc7",ColumnName="I_ErrorMsg",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="913bfebd-9d5f-7533-18ec-56ca0d72885b",
Synchronized="2017-08-05 16:54:53.0")
/** Column name I_ErrorMsg */
public static final String COLUMNNAME_I_ErrorMsg = "I_ErrorMsg";
/** Set Ship/Receipt Confirmation Import Line.
@param I_InOutLineConfirm_ID Material Shipment or Receipt Confirmation Import Line */
public void setI_InOutLineConfirm_ID (int I_InOutLineConfirm_ID)
{
if (I_InOutLineConfirm_ID < 1) throw new IllegalArgumentException ("I_InOutLineConfirm_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_I_InOutLineConfirm_ID, Integer.valueOf(I_InOutLineConfirm_ID));
}
/** Get Ship/Receipt Confirmation Import Line.
@return Material Shipment or Receipt Confirmation Import Line */
public int getI_InOutLineConfirm_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_I_InOutLineConfirm_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getI_InOutLineConfirm_ID()));
}

@XendraTrl(Identifier="b306cafb-154d-d8e6-6b1a-de2cbd203523")
public static String es_PE_FIELD_ConfirmationLines_ShipReceiptConfirmationImportLine_Description="Línea de confirmación de importación, entrega ó recibo de material.";

@XendraTrl(Identifier="b306cafb-154d-d8e6-6b1a-de2cbd203523")
public static String es_PE_FIELD_ConfirmationLines_ShipReceiptConfirmationImportLine_Help="Detalles de importación de confirmación.";

@XendraTrl(Identifier="b306cafb-154d-d8e6-6b1a-de2cbd203523")
public static String es_PE_FIELD_ConfirmationLines_ShipReceiptConfirmationImportLine_Name="Entrega/Recibo Línea de Confirmación de la importación ";

@XendraField(AD_Column_ID="I_InOutLineConfirm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="dacdf85a-28d1-8870-4c7c-eb4b0532b6b9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=20,SortNo=1,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b306cafb-154d-d8e6-6b1a-de2cbd203523")
public static final String FIELDNAME_ConfirmationLines_ShipReceiptConfirmationImportLine="b306cafb-154d-d8e6-6b1a-de2cbd203523";
/** Column name I_InOutLineConfirm_ID */
public static final String COLUMNNAME_I_InOutLineConfirm_ID = "I_InOutLineConfirm_ID";
/** Set Imported.
@param I_IsImported Has this import been processed */
public void setI_IsImported (boolean I_IsImported)
{
set_Value (COLUMNNAME_I_IsImported, Boolean.valueOf(I_IsImported));
}
/** Get Imported.
@return Has this import been processed */
public boolean isI_IsImported() 
{
Object oo = get_Value(COLUMNNAME_I_IsImported);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="480f58f6-fe89-fac0-b2c2-6fe51576b1eb")
public static String es_PE_FIELD_ConfirmationLines_Imported_Description="Esta importación ha sido procesada";

@XendraTrl(Identifier="480f58f6-fe89-fac0-b2c2-6fe51576b1eb")
public static String es_PE_FIELD_ConfirmationLines_Imported_Help="El cuadro de verificación Importado indica si esta importación ha sido procesada";

@XendraTrl(Identifier="480f58f6-fe89-fac0-b2c2-6fe51576b1eb")
public static String es_PE_FIELD_ConfirmationLines_Imported_Name="Importar";

@XendraField(AD_Column_ID="I_IsImported",IsCentrallyMaintained=true,
AD_Tab_ID="dacdf85a-28d1-8870-4c7c-eb4b0532b6b9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=10,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="480f58f6-fe89-fac0-b2c2-6fe51576b1eb")
public static final String FIELDNAME_ConfirmationLines_Imported="480f58f6-fe89-fac0-b2c2-6fe51576b1eb";

@XendraTrl(Identifier="b86c8a2d-5177-a602-da0c-aa5a625e84e7")
public static String es_PE_COLUMN_I_IsImported_Name="Importar";

@XendraColumn(AD_Element_ID="f4939725-7d85-767d-540d-feafa759184b",ColumnName="I_IsImported",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b86c8a2d-5177-a602-da0c-aa5a625e84e7",
Synchronized="2017-08-05 16:54:53.0")
/** Column name I_IsImported */
public static final String COLUMNNAME_I_IsImported = "I_IsImported";
/** Set Ship/Receipt Confirmation Line.
@param M_InOutLineConfirm_ID Material Shipment or Receipt Confirmation Line */
public void setM_InOutLineConfirm_ID (int M_InOutLineConfirm_ID)
{
if (M_InOutLineConfirm_ID < 1) throw new IllegalArgumentException ("M_InOutLineConfirm_ID is mandatory.");
set_Value (COLUMNNAME_M_InOutLineConfirm_ID, Integer.valueOf(M_InOutLineConfirm_ID));
}
/** Get Ship/Receipt Confirmation Line.
@return Material Shipment or Receipt Confirmation Line */
public int getM_InOutLineConfirm_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_InOutLineConfirm_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6bb9bc98-5be6-cd71-c57b-ca54d63f784b")
public static String es_PE_FIELD_ConfirmationLines_ShipReceiptConfirmationLine_Description="Envio de material ó Item de confirmación del recibo.";

@XendraTrl(Identifier="6bb9bc98-5be6-cd71-c57b-ca54d63f784b")
public static String es_PE_FIELD_ConfirmationLines_ShipReceiptConfirmationLine_Help="Detalles de la confirmación.";

@XendraTrl(Identifier="6bb9bc98-5be6-cd71-c57b-ca54d63f784b")
public static String es_PE_FIELD_ConfirmationLines_ShipReceiptConfirmationLine_Name="Item Confirmación entrega/Recibo";

@XendraField(AD_Column_ID="M_InOutLineConfirm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="dacdf85a-28d1-8870-4c7c-eb4b0532b6b9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6bb9bc98-5be6-cd71-c57b-ca54d63f784b")
public static final String FIELDNAME_ConfirmationLines_ShipReceiptConfirmationLine="6bb9bc98-5be6-cd71-c57b-ca54d63f784b";

@XendraTrl(Identifier="c3281c6f-0899-078f-4f07-4695b21c9eaf")
public static String es_PE_COLUMN_M_InOutLineConfirm_ID_Name="Línea Confirmación entrega/Recibo";

@XendraColumn(AD_Element_ID="c960b98c-784f-5dca-c23b-6d1ce614266b",
ColumnName="M_InOutLineConfirm_ID",AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c3281c6f-0899-078f-4f07-4695b21c9eaf",Synchronized="2017-08-05 16:54:53.0")
/** Column name M_InOutLineConfirm_ID */
public static final String COLUMNNAME_M_InOutLineConfirm_ID = "M_InOutLineConfirm_ID";
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

@XendraTrl(Identifier="059efcb4-45e2-c449-69a2-3f50e09876a3")
public static String es_PE_FIELD_ConfirmationLines_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="059efcb4-45e2-c449-69a2-3f50e09876a3")
public static String es_PE_FIELD_ConfirmationLines_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="059efcb4-45e2-c449-69a2-3f50e09876a3")
public static String es_PE_FIELD_ConfirmationLines_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="dacdf85a-28d1-8870-4c7c-eb4b0532b6b9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=130,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="059efcb4-45e2-c449-69a2-3f50e09876a3")
public static final String FIELDNAME_ConfirmationLines_Processed="059efcb4-45e2-c449-69a2-3f50e09876a3";

@XendraTrl(Identifier="d7e8f76f-a0df-5f75-b6d1-4e6adf631d0c")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d7e8f76f-a0df-5f75-b6d1-4e6adf631d0c",
Synchronized="2017-08-05 16:54:53.0")
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

@XendraTrl(Identifier="636751e3-2ee8-60b5-24e3-881ef560e83d")
public static String es_PE_FIELD_ConfirmationLines_ProcessNow_Description="Importa Confirmaciones";

@XendraTrl(Identifier="636751e3-2ee8-60b5-24e3-881ef560e83d")
public static String es_PE_FIELD_ConfirmationLines_ProcessNow_Help="Los parámetros son valores por default para los valores nulos del expediente de la importación, ellos no sobreescriben ningunos datos.";

@XendraTrl(Identifier="636751e3-2ee8-60b5-24e3-881ef560e83d")
public static String es_PE_FIELD_ConfirmationLines_ProcessNow_Name="Importa Confirmaciones";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="dacdf85a-28d1-8870-4c7c-eb4b0532b6b9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="636751e3-2ee8-60b5-24e3-881ef560e83d")
public static final String FIELDNAME_ConfirmationLines_ProcessNow="636751e3-2ee8-60b5-24e3-881ef560e83d";

@XendraTrl(Identifier="4d524fa3-babc-fd05-0ef2-dfe1d505cd18")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="83bf7ef6-d7b7-c3e1-f5d0-31ad06277d2f",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="4d524fa3-babc-fd05-0ef2-dfe1d505cd18",Synchronized="2017-08-05 16:54:53.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Scrapped Quantity.
@param ScrappedQty The Quantity scrapped due to QA issues */
public void setScrappedQty (BigDecimal ScrappedQty)
{
if (ScrappedQty == null) throw new IllegalArgumentException ("ScrappedQty is mandatory.");
set_Value (COLUMNNAME_ScrappedQty, ScrappedQty);
}
/** Get Scrapped Quantity.
@return The Quantity scrapped due to QA issues */
public BigDecimal getScrappedQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ScrappedQty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="03dbe92d-276b-092d-6a79-7cdce10425ca")
public static String es_PE_FIELD_ConfirmationLines_ScrappedQuantity_Description="La cantidad de desperdicio debido a las ediciones del A.C.";

@XendraTrl(Identifier="03dbe92d-276b-092d-6a79-7cdce10425ca")
public static String es_PE_FIELD_ConfirmationLines_ScrappedQuantity_Name="Cantidad de Desperdicio";

@XendraField(AD_Column_ID="ScrappedQty",IsCentrallyMaintained=true,
AD_Tab_ID="dacdf85a-28d1-8870-4c7c-eb4b0532b6b9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="03dbe92d-276b-092d-6a79-7cdce10425ca")
public static final String FIELDNAME_ConfirmationLines_ScrappedQuantity="03dbe92d-276b-092d-6a79-7cdce10425ca";

@XendraTrl(Identifier="a85f9bc5-c84a-932e-6cd7-e8484ee89a7d")
public static String es_PE_COLUMN_ScrappedQty_Name="Cantidad de Desperdicio";

@XendraColumn(AD_Element_ID="40b91fb0-3206-0a29-4fd3-de7dde7e4d2c",ColumnName="ScrappedQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a85f9bc5-c84a-932e-6cd7-e8484ee89a7d",
Synchronized="2017-08-05 16:54:53.0")
/** Column name ScrappedQty */
public static final String COLUMNNAME_ScrappedQty = "ScrappedQty";
}
