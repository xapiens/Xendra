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
/** Generated Model for I_AttributeSetInstance
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_I_AttributeSetInstance extends PO
{
/** Standard Constructor
@param ctx context
@param I_AttributeSetInstance_ID id
@param trxName transaction
*/
public X_I_AttributeSetInstance (Properties ctx, int I_AttributeSetInstance_ID, String trxName)
{
super (ctx, I_AttributeSetInstance_ID, trxName);
/** if (I_AttributeSetInstance_ID == 0)
{
setI_AttributeSetInstance_ID (0);
setI_IsImported (false);	
// N
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_I_AttributeSetInstance (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000163 */
public static int Table_ID=MTable.getTable_ID("I_AttributeSetInstance");

@XendraTrl(Identifier="f67733ec-22b7-4ae6-03b3-2db601b2276f")
public static String es_PE_TAB_ImportLot_Name="Import Lot";
@XendraTab(Name="Import Lot",
Description="",Help="",AD_Window_ID="a3efa742-46bc-8dea-a790-c574991ecea4",SeqNo=10,TabLevel=0,
IsSingleRow=false,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",
HasTree=false,WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="f67733ec-22b7-4ae6-03b3-2db601b2276f",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ImportLot="f67733ec-22b7-4ae6-03b3-2db601b2276f";

@XendraTrl(Identifier="3338a0f0-4019-a2a7-2ac2-a2431090aebb")
public static String es_PE_TABLE_I_AttributeSetInstance_Name="I_AttributeSetInstance";


@XendraTable(Name="I_AttributeSetInstance",Description="I_AttributeSetInstance",Help="",
TableName="I_AttributeSetInstance",AccessLevel="2",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.import",
Identifier="3338a0f0-4019-a2a7-2ac2-a2431090aebb",Synchronized="2017-08-16 11:42:50.0")
/** TableName=I_AttributeSetInstance */
public static final String Table_Name="I_AttributeSetInstance";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"I_AttributeSetInstance");

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
    Table_ID = MTable.getTable_ID("I_AttributeSetInstance");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_I_AttributeSetInstance[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Order.
@param C_Order_ID Order */
public void setC_Order_ID (int C_Order_ID)
{
if (C_Order_ID <= 0) set_Value (COLUMNNAME_C_Order_ID, null);
 else 
set_Value (COLUMNNAME_C_Order_ID, Integer.valueOf(C_Order_ID));
}
/** Get Order.
@return Order */
public int getC_Order_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Order_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8c6a56e0-6ed4-f4bc-f286-cbdde7758e52")
public static String es_PE_FIELD_ImportLot_Order_Description="Orden de Venta";

@XendraTrl(Identifier="8c6a56e0-6ed4-f4bc-f286-cbdde7758e52")
public static String es_PE_FIELD_ImportLot_Order_Help="La ID de la orden de ventas es un identificador único de la orden de ventas; Ésta es controlada por la secuencia del documento para este tipo de documento.";

@XendraTrl(Identifier="8c6a56e0-6ed4-f4bc-f286-cbdde7758e52")
public static String es_PE_FIELD_ImportLot_Order_Name="Orden de Venta";

@XendraField(AD_Column_ID="C_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f67733ec-22b7-4ae6-03b3-2db601b2276f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8c6a56e0-6ed4-f4bc-f286-cbdde7758e52")
public static final String FIELDNAME_ImportLot_Order="8c6a56e0-6ed4-f4bc-f286-cbdde7758e52";

@XendraTrl(Identifier="aa0eca36-d6f8-7f68-6dfb-bf23c83ff040")
public static String es_PE_COLUMN_C_Order_ID_Name="Order";

@XendraColumn(AD_Element_ID="cc846c60-90b8-6aad-9d07-b5d0c0328787",ColumnName="C_Order_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="aa0eca36-d6f8-7f68-6dfb-bf23c83ff040",
Synchronized="2017-08-05 16:54:48.0")
/** Column name C_Order_ID */
public static final String COLUMNNAME_C_Order_ID = "C_Order_ID";
/** Set Guarantee Date.
@param GuaranteeDate Date when guarantee expires */
public void setGuaranteeDate (Timestamp GuaranteeDate)
{
set_Value (COLUMNNAME_GuaranteeDate, GuaranteeDate);
}
/** Get Guarantee Date.
@return Date when guarantee expires */
public Timestamp getGuaranteeDate() 
{
return (Timestamp)get_Value(COLUMNNAME_GuaranteeDate);
}

@XendraTrl(Identifier="daf96096-a98c-d92a-f307-28dfaa301752")
public static String es_PE_FIELD_ImportLot_GuaranteeDate_Description="Fecha cuando la garantía expira";

@XendraTrl(Identifier="daf96096-a98c-d92a-f307-28dfaa301752")
public static String es_PE_FIELD_ImportLot_GuaranteeDate_Help="Fecha cuando la garantía ó disponibilidad normal expira";

@XendraTrl(Identifier="daf96096-a98c-d92a-f307-28dfaa301752")
public static String es_PE_FIELD_ImportLot_GuaranteeDate_Name="Fecha de Garantía";

@XendraField(AD_Column_ID="GuaranteeDate",IsCentrallyMaintained=true,
AD_Tab_ID="f67733ec-22b7-4ae6-03b3-2db601b2276f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=29,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="daf96096-a98c-d92a-f307-28dfaa301752")
public static final String FIELDNAME_ImportLot_GuaranteeDate="daf96096-a98c-d92a-f307-28dfaa301752";

@XendraTrl(Identifier="3205b754-2f1e-60ea-7dd1-8d5ff75a5d77")
public static String es_PE_COLUMN_GuaranteeDate_Name="Guarantee Date";

@XendraColumn(AD_Element_ID="2956aa9d-0dfd-6e86-af9b-584f4c7eca21",ColumnName="GuaranteeDate",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3205b754-2f1e-60ea-7dd1-8d5ff75a5d77",
Synchronized="2017-08-05 16:54:48.0")
/** Column name GuaranteeDate */
public static final String COLUMNNAME_GuaranteeDate = "GuaranteeDate";
/** Set I_AttributeSetInstance.
@param I_AttributeSetInstance_ID I_AttributeSetInstance */
public void setI_AttributeSetInstance_ID (int I_AttributeSetInstance_ID)
{
if (I_AttributeSetInstance_ID < 1) throw new IllegalArgumentException ("I_AttributeSetInstance_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_I_AttributeSetInstance_ID, Integer.valueOf(I_AttributeSetInstance_ID));
}
/** Get I_AttributeSetInstance.
@return I_AttributeSetInstance */
public int getI_AttributeSetInstance_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_I_AttributeSetInstance_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1e15c931-fd90-cefd-4090-1118fef21250")
public static String es_PE_FIELD_ImportLot_I_AttributeSetInstance_Name="I_AttributeSetInstance";

@XendraField(AD_Column_ID="I_AttributeSetInstance_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f67733ec-22b7-4ae6-03b3-2db601b2276f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1e15c931-fd90-cefd-4090-1118fef21250")
public static final String FIELDNAME_ImportLot_I_AttributeSetInstance="1e15c931-fd90-cefd-4090-1118fef21250";
/** Column name I_AttributeSetInstance_ID */
public static final String COLUMNNAME_I_AttributeSetInstance_ID = "I_AttributeSetInstance_ID";
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
@XendraTrl(Identifier="aacb4ae2-2d73-4679-857d-7eb8478ff68d")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="aacb4ae2-2d73-4679-857d-7eb8478ff68d",
Synchronized="2017-08-05 16:54:48.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Import Error Message.
@param I_ErrorMsg Messages generated from import process */
public void setI_ErrorMsg (String I_ErrorMsg)
{
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
@XendraTrl(Identifier="20a10d35-6b6b-d654-eff4-1bd17103c3dc")
public static String es_PE_FIELD_ImportLot_ImportErrorMessage_Description="Mensajes generados desde procesos de importación";

@XendraTrl(Identifier="20a10d35-6b6b-d654-eff4-1bd17103c3dc")
public static String es_PE_FIELD_ImportLot_ImportErrorMessage_Help="El mensaje de error de Importación despliega cualquier mensaje de error generado durante el proceso de importación.";

@XendraTrl(Identifier="20a10d35-6b6b-d654-eff4-1bd17103c3dc")
public static String es_PE_FIELD_ImportLot_ImportErrorMessage_Name="Mensajes de Error al Importar";

@XendraField(AD_Column_ID="I_ErrorMsg",IsCentrallyMaintained=true,
AD_Tab_ID="f67733ec-22b7-4ae6-03b3-2db601b2276f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2000,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="20a10d35-6b6b-d654-eff4-1bd17103c3dc")
public static final String FIELDNAME_ImportLot_ImportErrorMessage="20a10d35-6b6b-d654-eff4-1bd17103c3dc";

@XendraTrl(Identifier="fe6f11b6-b99c-977f-a464-0beabc5f7f1d")
public static String es_PE_COLUMN_I_ErrorMsg_Name="Import Error Message";

@XendraColumn(AD_Element_ID="e512e524-25c8-eddd-ad88-d2ce6b66fdc7",ColumnName="I_ErrorMsg",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fe6f11b6-b99c-977f-a464-0beabc5f7f1d",
Synchronized="2017-08-05 16:54:48.0")
/** Column name I_ErrorMsg */
public static final String COLUMNNAME_I_ErrorMsg = "I_ErrorMsg";
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

@XendraTrl(Identifier="2ec8f444-805f-9085-54be-29ce4bcde556")
public static String es_PE_FIELD_ImportLot_Imported_Description="Esta importación ha sido procesada";

@XendraTrl(Identifier="2ec8f444-805f-9085-54be-29ce4bcde556")
public static String es_PE_FIELD_ImportLot_Imported_Help="El cuadro de verificación Importado indica si esta importación ha sido procesada";

@XendraTrl(Identifier="2ec8f444-805f-9085-54be-29ce4bcde556")
public static String es_PE_FIELD_ImportLot_Imported_Name="Importar";

@XendraField(AD_Column_ID="I_IsImported",IsCentrallyMaintained=true,
AD_Tab_ID="f67733ec-22b7-4ae6-03b3-2db601b2276f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2ec8f444-805f-9085-54be-29ce4bcde556")
public static final String FIELDNAME_ImportLot_Imported="2ec8f444-805f-9085-54be-29ce4bcde556";

@XendraTrl(Identifier="a6efe307-4f48-5393-41e4-a7baf82c4ef9")
public static String es_PE_COLUMN_I_IsImported_Name="Imported";

@XendraColumn(AD_Element_ID="f4939725-7d85-767d-540d-feafa759184b",ColumnName="I_IsImported",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a6efe307-4f48-5393-41e4-a7baf82c4ef9",
Synchronized="2017-08-05 16:54:48.0")
/** Column name I_IsImported */
public static final String COLUMNNAME_I_IsImported = "I_IsImported";
/** Set Lot No.
@param Lot Lot number (alphanumeric) */
public void setLot (String Lot)
{
if (Lot != null && Lot.length() > 40)
{
log.warning("Length > 40 - truncated");
Lot = Lot.substring(0,39);
}
set_Value (COLUMNNAME_Lot, Lot);
}
/** Get Lot No.
@return Lot number (alphanumeric) */
public String getLot() 
{
String value = (String)get_Value(COLUMNNAME_Lot);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="c2d80839-f94a-7f5c-c3f4-aeee2d9e59b3")
public static String es_PE_FIELD_ImportLot_LotNo_Description="Número de Lote";

@XendraTrl(Identifier="c2d80839-f94a-7f5c-c3f4-aeee2d9e59b3")
public static String es_PE_FIELD_ImportLot_LotNo_Help="Indica el número de lote específico del que un producto fue parte.";

@XendraTrl(Identifier="c2d80839-f94a-7f5c-c3f4-aeee2d9e59b3")
public static String es_PE_FIELD_ImportLot_LotNo_Name="No. Lote";
@XendraField(AD_Column_ID="Lot",
IsCentrallyMaintained=true,AD_Tab_ID="f67733ec-22b7-4ae6-03b3-2db601b2276f",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="c2d80839-f94a-7f5c-c3f4-aeee2d9e59b3")
public static final String FIELDNAME_ImportLot_LotNo="c2d80839-f94a-7f5c-c3f4-aeee2d9e59b3";

@XendraTrl(Identifier="15dc61f6-b665-1416-15f7-7e8f08c64683")
public static String es_PE_COLUMN_Lot_Name="Lot No";

@XendraColumn(AD_Element_ID="e8a3022e-4a91-6f2a-e27c-3739825075c7",ColumnName="Lot",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="15dc61f6-b665-1416-15f7-7e8f08c64683",
Synchronized="2017-08-05 16:54:48.0")
/** Column name Lot */
public static final String COLUMNNAME_Lot = "Lot";
/** Set Attribute Set Instance.
@param M_AttributeSetInstance_ID Product Attribute Set Instance */
public void setM_AttributeSetInstance_ID (int M_AttributeSetInstance_ID)
{
if (M_AttributeSetInstance_ID <= 0) set_Value (COLUMNNAME_M_AttributeSetInstance_ID, null);
 else 
set_Value (COLUMNNAME_M_AttributeSetInstance_ID, Integer.valueOf(M_AttributeSetInstance_ID));
}
/** Get Attribute Set Instance.
@return Product Attribute Set Instance */
public int getM_AttributeSetInstance_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_AttributeSetInstance_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8978b383-37c4-f6d7-0370-940579a381b7")
public static String es_PE_FIELD_ImportLot_AttributeSetInstance_Description="Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="8978b383-37c4-f6d7-0370-940579a381b7")
public static String es_PE_FIELD_ImportLot_AttributeSetInstance_Help="Valor actual de Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="8978b383-37c4-f6d7-0370-940579a381b7")
public static String es_PE_FIELD_ImportLot_AttributeSetInstance_Name="Instancia del Conjunto de Atributos";

@XendraField(AD_Column_ID="M_AttributeSetInstance_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f67733ec-22b7-4ae6-03b3-2db601b2276f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=131089,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8978b383-37c4-f6d7-0370-940579a381b7")
public static final String FIELDNAME_ImportLot_AttributeSetInstance="8978b383-37c4-f6d7-0370-940579a381b7";

@XendraTrl(Identifier="c185c67a-99a8-fd82-d601-0849814f6cdb")
public static String es_PE_COLUMN_M_AttributeSetInstance_ID_Name="Attribute Set Instance";

@XendraColumn(AD_Element_ID="137807f2-3c52-e193-3ceb-f10b819cf955",
ColumnName="M_AttributeSetInstance_ID",AD_Reference_ID=35,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c185c67a-99a8-fd82-d601-0849814f6cdb",Synchronized="2017-08-05 16:54:48.0")
/** Column name M_AttributeSetInstance_ID */
public static final String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
/** Set Shipment/Receipt.
@param M_InOut_ID Material Shipment Document */
public void setM_InOut_ID (int M_InOut_ID)
{
if (M_InOut_ID <= 0) set_Value (COLUMNNAME_M_InOut_ID, null);
 else 
set_Value (COLUMNNAME_M_InOut_ID, Integer.valueOf(M_InOut_ID));
}
/** Get Shipment/Receipt.
@return Material Shipment Document */
public int getM_InOut_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_InOut_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f546e21c-ad9d-9360-9e81-55445d6c83df")
public static String es_PE_FIELD_ImportLot_ShipmentReceipt_Description="Entrega ó documento de recibo";

@XendraTrl(Identifier="f546e21c-ad9d-9360-9e81-55445d6c83df")
public static String es_PE_FIELD_ImportLot_ShipmentReceipt_Help="La ID de Entrega / Recibo indica el documento único para esta entrega ó recibo";

@XendraTrl(Identifier="f546e21c-ad9d-9360-9e81-55445d6c83df")
public static String es_PE_FIELD_ImportLot_ShipmentReceipt_Name="Entrega / Recibo";

@XendraField(AD_Column_ID="M_InOut_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f67733ec-22b7-4ae6-03b3-2db601b2276f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f546e21c-ad9d-9360-9e81-55445d6c83df")
public static final String FIELDNAME_ImportLot_ShipmentReceipt="f546e21c-ad9d-9360-9e81-55445d6c83df";

@XendraTrl(Identifier="8c6d7107-8166-76b6-b6e5-da0054222f9a")
public static String es_PE_COLUMN_M_InOut_ID_Name="Shipment/Receipt";

@XendraColumn(AD_Element_ID="5c1a0edf-01a0-832e-098b-d49510db71db",ColumnName="M_InOut_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8c6d7107-8166-76b6-b6e5-da0054222f9a",
Synchronized="2017-08-05 16:54:48.0")
/** Column name M_InOut_ID */
public static final String COLUMNNAME_M_InOut_ID = "M_InOut_ID";
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

@XendraTrl(Identifier="1cbed386-5e56-6062-3b68-ef13574dd997")
public static String es_PE_FIELD_ImportLot_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="1cbed386-5e56-6062-3b68-ef13574dd997")
public static String es_PE_FIELD_ImportLot_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="1cbed386-5e56-6062-3b68-ef13574dd997")
public static String es_PE_FIELD_ImportLot_Product_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f67733ec-22b7-4ae6-03b3-2db601b2276f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1cbed386-5e56-6062-3b68-ef13574dd997")
public static final String FIELDNAME_ImportLot_Product="1cbed386-5e56-6062-3b68-ef13574dd997";

@XendraTrl(Identifier="531baf94-04b3-9c63-f065-f4cca7f318aa")
public static String es_PE_COLUMN_M_Product_ID_Name="Product";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="531baf94-04b3-9c63-f065-f4cca7f318aa",
Synchronized="2017-08-05 16:54:48.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
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

@XendraTrl(Identifier="c5a89b66-12b0-5175-dc6a-9c9b98b7cd3d")
public static String es_PE_FIELD_ImportLot_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="c5a89b66-12b0-5175-dc6a-9c9b98b7cd3d")
public static String es_PE_FIELD_ImportLot_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="c5a89b66-12b0-5175-dc6a-9c9b98b7cd3d")
public static String es_PE_FIELD_ImportLot_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="f67733ec-22b7-4ae6-03b3-2db601b2276f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c5a89b66-12b0-5175-dc6a-9c9b98b7cd3d")
public static final String FIELDNAME_ImportLot_Processed="c5a89b66-12b0-5175-dc6a-9c9b98b7cd3d";

@XendraTrl(Identifier="7c6d608a-806a-3b73-6c15-fa814d487c0b")
public static String es_PE_COLUMN_Processed_Name="Processed";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7c6d608a-806a-3b73-6c15-fa814d487c0b",
Synchronized="2017-08-05 16:54:48.0")
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

@XendraTrl(Identifier="33d083af-bfd0-af43-f35a-371724b8a046")
public static String es_PE_FIELD_ImportLot_ProcessNow_Name="Procesar Ahora";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="f67733ec-22b7-4ae6-03b3-2db601b2276f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="33d083af-bfd0-af43-f35a-371724b8a046")
public static final String FIELDNAME_ImportLot_ProcessNow="33d083af-bfd0-af43-f35a-371724b8a046";

@XendraTrl(Identifier="78f679c2-9836-0759-d8f1-d04ddc1360e3")
public static String es_PE_COLUMN_Processing_Name="Process Now";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="ca633a0f-2f08-0210-97ca-4be40bbc1ea4",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="78f679c2-9836-0759-d8f1-d04ddc1360e3",Synchronized="2017-08-05 16:54:48.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Product Key.
@param ProductValue Key of the Product */
public void setProductValue (String ProductValue)
{
if (ProductValue != null && ProductValue.length() > 40)
{
log.warning("Length > 40 - truncated");
ProductValue = ProductValue.substring(0,39);
}
set_Value (COLUMNNAME_ProductValue, ProductValue);
}
/** Get Product Key.
@return Key of the Product */
public String getProductValue() 
{
String value = (String)get_Value(COLUMNNAME_ProductValue);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="82bfa56d-d6c7-1670-1403-555048dbf590")
public static String es_PE_FIELD_ImportLot_ProductKey_Description="Generar lista de conteo solamente para este valor del producto (Usted puede usar %)";

@XendraTrl(Identifier="82bfa56d-d6c7-1670-1403-555048dbf590")
public static String es_PE_FIELD_ImportLot_ProductKey_Name="Sólo Valor de Producto";

@XendraField(AD_Column_ID="ProductValue",IsCentrallyMaintained=true,
AD_Tab_ID="f67733ec-22b7-4ae6-03b3-2db601b2276f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="82bfa56d-d6c7-1670-1403-555048dbf590")
public static final String FIELDNAME_ImportLot_ProductKey="82bfa56d-d6c7-1670-1403-555048dbf590";

@XendraTrl(Identifier="153b7d67-0ae3-2e34-efc6-6ecb47c73c93")
public static String es_PE_COLUMN_ProductValue_Name="Product Key";

@XendraColumn(AD_Element_ID="3c72be08-8fa7-5282-1e16-ddcbc46035d8",ColumnName="ProductValue",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="153b7d67-0ae3-2e34-efc6-6ecb47c73c93",
Synchronized="2017-08-05 16:54:48.0")
/** Column name ProductValue */
public static final String COLUMNNAME_ProductValue = "ProductValue";
}
