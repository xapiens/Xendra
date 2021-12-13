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
/** Generated Model for I_Inventory
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_I_Inventory extends PO
{
/** Standard Constructor
@param ctx context
@param I_Inventory_ID id
@param trxName transaction
*/
public X_I_Inventory (Properties ctx, int I_Inventory_ID, String trxName)
{
super (ctx, I_Inventory_ID, trxName);
/** if (I_Inventory_ID == 0)
{
setI_Inventory_ID (0);
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
public X_I_Inventory (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=572 */
public static int Table_ID=MTable.getTable_ID("I_Inventory");

@XendraTrl(Identifier="27b79caa-18c7-42fe-efc8-33f376aadd73")
public static String es_PE_TAB_Inventory_Description="Importar Inventario";

@XendraTrl(Identifier="27b79caa-18c7-42fe-efc8-33f376aadd73")
public static String es_PE_TAB_Inventory_Help="Importar y validar transacciones de inventario. El localizador es determinado sobre todo por la llave del localizador, entonces el almacén y los campos X, y, z .<p >Un inventario físico se crea por fecha del almacén y del movimiento.";

@XendraTrl(Identifier="27b79caa-18c7-42fe-efc8-33f376aadd73")
public static String es_PE_TAB_Inventory_Name="Inventario";
@XendraTab(Name="Inventory",
Description="Import Inventory",
Help="Validate and Import Inventory Transactions. The Locator is primarily determined by the Locator Key, then the Warehouse and X,Y,Z fields.<p> A Physical Inventory is created per Warehouse and Movement Date.",
AD_Window_ID="61716ce1-58d7-3770-fcee-cd955a1025ff",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="27b79caa-18c7-42fe-efc8-33f376aadd73",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Inventory="27b79caa-18c7-42fe-efc8-33f376aadd73";

@XendraTrl(Identifier="4bfa0140-15fa-78db-876c-a456c4933566")
public static String es_PE_TABLE_I_Inventory_Name="Importar Inventario";

@XendraTable(Name="Import Inventory",AD_Package_ID="645f34c0-ea3a-ac63-618d-8ca49873c33b",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Import Inventory Transactions",
Help="",TableName="I_Inventory",AccessLevel="2",
AD_Window_ID="61716ce1-58d7-3770-fcee-cd955a1025ff",AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.import",Identifier="4bfa0140-15fa-78db-876c-a456c4933566",
Synchronized="2020-03-03 21:38:09.0")
/** TableName=I_Inventory */
public static final String Table_Name="I_Inventory";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"I_Inventory");

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
    Table_ID = MTable.getTable_ID("I_Inventory");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_I_Inventory[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Cost.
@param Cost Cost information */
public void setCost (BigDecimal Cost)
{
set_Value (COLUMNNAME_Cost, Cost);
}
/** Get Cost.
@return Cost information */
public BigDecimal getCost() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Cost);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="c6e9101a-dbf8-4ec9-84d8-f16abad7848e")
public static String es_PE_COLUMN_Cost_Name="Cost";

@XendraColumn(AD_Element_ID="ea07eea5-cd5c-5001-0f53-dfcaf5256889",ColumnName="Cost",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c6e9101a-dbf8-4ec9-84d8-f16abad7848e",
Synchronized="2019-08-30 22:22:49.0")
/** Column name Cost */
public static final String COLUMNNAME_Cost = "Cost";
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

@XendraTrl(Identifier="81992ca9-e737-5a9b-c73a-cb501412d9da")
public static String es_PE_FIELD_Inventory_Description_Name="Observación";

@XendraTrl(Identifier="81992ca9-e737-5a9b-c73a-cb501412d9da")
public static String es_PE_FIELD_Inventory_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="81992ca9-e737-5a9b-c73a-cb501412d9da")
public static String es_PE_FIELD_Inventory_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="27b79caa-18c7-42fe-efc8-33f376aadd73",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="81992ca9-e737-5a9b-c73a-cb501412d9da")
public static final String FIELDNAME_Inventory_Description="81992ca9-e737-5a9b-c73a-cb501412d9da";

@XendraTrl(Identifier="3b2139cb-f31d-fdd9-ca8f-e4fb63c7fbde")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3b2139cb-f31d-fdd9-ca8f-e4fb63c7fbde",
Synchronized="2019-08-30 22:22:49.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
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
@XendraTrl(Identifier="3770f9fe-5aa6-49ae-88f0-c8d84b233973")
public static String es_PE_FIELD_Inventory_Identifier_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="27b79caa-18c7-42fe-efc8-33f376aadd73",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=36,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2018-01-06 12:53:11.0",
Identifier="3770f9fe-5aa6-49ae-88f0-c8d84b233973")
public static final String FIELDNAME_Inventory_Identifier="3770f9fe-5aa6-49ae-88f0-c8d84b233973";

@XendraTrl(Identifier="6f10c56c-e18c-4824-b48c-5a3b0f3fd74a")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6f10c56c-e18c-4824-b48c-5a3b0f3fd74a",
Synchronized="2019-08-30 22:22:49.0")
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
@XendraTrl(Identifier="eafea66e-1557-0221-6808-d3a8869428b2")
public static String es_PE_FIELD_Inventory_ImportErrorMessage_Name="Mensajes de Error al Importar";

@XendraTrl(Identifier="eafea66e-1557-0221-6808-d3a8869428b2")
public static String es_PE_FIELD_Inventory_ImportErrorMessage_Description="Mensajes generados desde procesos de importación";

@XendraTrl(Identifier="eafea66e-1557-0221-6808-d3a8869428b2")
public static String es_PE_FIELD_Inventory_ImportErrorMessage_Help="El mensaje de error de Importación despliega cualquier mensaje de error generado durante el proceso de importación.";

@XendraField(AD_Column_ID="I_ErrorMsg",IsCentrallyMaintained=true,
AD_Tab_ID="27b79caa-18c7-42fe-efc8-33f376aadd73",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=true,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="eafea66e-1557-0221-6808-d3a8869428b2")
public static final String FIELDNAME_Inventory_ImportErrorMessage="eafea66e-1557-0221-6808-d3a8869428b2";

@XendraTrl(Identifier="19c96ce8-7a83-1d6b-ec4d-2693ba6bd08f")
public static String es_PE_COLUMN_I_ErrorMsg_Name="Mensajes de Error al Importar";

@XendraColumn(AD_Element_ID="e512e524-25c8-eddd-ad88-d2ce6b66fdc7",ColumnName="I_ErrorMsg",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="19c96ce8-7a83-1d6b-ec4d-2693ba6bd08f",
Synchronized="2019-08-30 22:22:49.0")
/** Column name I_ErrorMsg */
public static final String COLUMNNAME_I_ErrorMsg = "I_ErrorMsg";
/** Set Import Inventory.
@param I_Inventory_ID Import Inventory Transactions */
public void setI_Inventory_ID (int I_Inventory_ID)
{
if (I_Inventory_ID < 1) throw new IllegalArgumentException ("I_Inventory_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_I_Inventory_ID, Integer.valueOf(I_Inventory_ID));
}
/** Get Import Inventory.
@return Import Inventory Transactions */
public int getI_Inventory_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_I_Inventory_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getI_Inventory_ID()));
}

@XendraTrl(Identifier="0a22b3ce-d54b-5bf2-eff7-f3e6c967c706")
public static String es_PE_FIELD_Inventory_ImportInventory_Name="Importar Inventario";

@XendraTrl(Identifier="0a22b3ce-d54b-5bf2-eff7-f3e6c967c706")
public static String es_PE_FIELD_Inventory_ImportInventory_Description="Importar transacciones de Inventario";

@XendraField(AD_Column_ID="I_Inventory_ID",IsCentrallyMaintained=true,
AD_Tab_ID="27b79caa-18c7-42fe-efc8-33f376aadd73",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="Y=N",DisplayLength=14,IsReadOnly=true,SeqNo=10,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0a22b3ce-d54b-5bf2-eff7-f3e6c967c706")
public static final String FIELDNAME_Inventory_ImportInventory="0a22b3ce-d54b-5bf2-eff7-f3e6c967c706";
/** Column name I_Inventory_ID */
public static final String COLUMNNAME_I_Inventory_ID = "I_Inventory_ID";
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

@XendraTrl(Identifier="541066b5-ea5b-1158-ee82-07bde257a645")
public static String es_PE_FIELD_Inventory_Imported_Name="Importar";

@XendraTrl(Identifier="541066b5-ea5b-1158-ee82-07bde257a645")
public static String es_PE_FIELD_Inventory_Imported_Description="Esta importación ha sido procesada";

@XendraTrl(Identifier="541066b5-ea5b-1158-ee82-07bde257a645")
public static String es_PE_FIELD_Inventory_Imported_Help="El cuadro de verificación Importado indica si esta importación ha sido procesada";

@XendraField(AD_Column_ID="I_IsImported",IsCentrallyMaintained=true,
AD_Tab_ID="27b79caa-18c7-42fe-efc8-33f376aadd73",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=20,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="541066b5-ea5b-1158-ee82-07bde257a645")
public static final String FIELDNAME_Inventory_Imported="541066b5-ea5b-1158-ee82-07bde257a645";

@XendraTrl(Identifier="71251b86-e73b-5447-322e-ee72561ce8d5")
public static String es_PE_COLUMN_I_IsImported_Name="Importar";

@XendraColumn(AD_Element_ID="f4939725-7d85-767d-540d-feafa759184b",ColumnName="I_IsImported",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="71251b86-e73b-5447-322e-ee72561ce8d5",
Synchronized="2019-08-30 22:22:49.0")
/** Column name I_IsImported */
public static final String COLUMNNAME_I_IsImported = "I_IsImported";
/** Set Locator Key.
@param LocatorValue Key of the Warehouse Locator */
public void setLocatorValue (String LocatorValue)
{
if (LocatorValue != null && LocatorValue.length() > 40)
{
log.warning("Length > 40 - truncated");
LocatorValue = LocatorValue.substring(0,39);
}
set_Value (COLUMNNAME_LocatorValue, LocatorValue);
}
/** Get Locator Key.
@return Key of the Warehouse Locator */
public String getLocatorValue() 
{
String value = (String)get_Value(COLUMNNAME_LocatorValue);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="db818af7-bc2a-d5c1-77c4-3763dbd561b3")
public static String es_PE_FIELD_Inventory_LocatorKey_Name="Clave de Ubicación";

@XendraTrl(Identifier="db818af7-bc2a-d5c1-77c4-3763dbd561b3")
public static String es_PE_FIELD_Inventory_LocatorKey_Description="Clave de ubicación de almacén";

@XendraField(AD_Column_ID="LocatorValue",IsCentrallyMaintained=true,
AD_Tab_ID="27b79caa-18c7-42fe-efc8-33f376aadd73",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="db818af7-bc2a-d5c1-77c4-3763dbd561b3")
public static final String FIELDNAME_Inventory_LocatorKey="db818af7-bc2a-d5c1-77c4-3763dbd561b3";

@XendraTrl(Identifier="531239c5-3d65-1b98-8d18-75c60779817d")
public static String es_PE_COLUMN_LocatorValue_Name="Clave de Ubicación";

@XendraColumn(AD_Element_ID="1edec65a-8405-179e-7a45-8873ea5ab6db",ColumnName="LocatorValue",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="531239c5-3d65-1b98-8d18-75c60779817d",
Synchronized="2019-08-30 22:22:49.0")
/** Column name LocatorValue */
public static final String COLUMNNAME_LocatorValue = "LocatorValue";
/** Set Lot No.
@param Lot Lot number (alphanumeric) */
public void setLot (String Lot)
{
if (Lot != null && Lot.length() > 20)
{
log.warning("Length > 20 - truncated");
Lot = Lot.substring(0,19);
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
@XendraTrl(Identifier="d6248c03-57fe-5936-cf1e-4c71e21bad24")
public static String es_PE_FIELD_Inventory_LotNo_Name="No. Lote";

@XendraTrl(Identifier="d6248c03-57fe-5936-cf1e-4c71e21bad24")
public static String es_PE_FIELD_Inventory_LotNo_Description="Número de Lote";

@XendraTrl(Identifier="d6248c03-57fe-5936-cf1e-4c71e21bad24")
public static String es_PE_FIELD_Inventory_LotNo_Help="Indica el número de lote específico del que un producto fue parte.";

@XendraField(AD_Column_ID="Lot",IsCentrallyMaintained=true,
AD_Tab_ID="27b79caa-18c7-42fe-efc8-33f376aadd73",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d6248c03-57fe-5936-cf1e-4c71e21bad24")
public static final String FIELDNAME_Inventory_LotNo="d6248c03-57fe-5936-cf1e-4c71e21bad24";

@XendraTrl(Identifier="94673634-135d-553c-fbe8-aef2cfe4f1b3")
public static String es_PE_COLUMN_Lot_Name="No. Lote";

@XendraColumn(AD_Element_ID="e8a3022e-4a91-6f2a-e27c-3739825075c7",ColumnName="Lot",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="94673634-135d-553c-fbe8-aef2cfe4f1b3",
Synchronized="2019-08-30 22:22:49.0")
/** Column name Lot */
public static final String COLUMNNAME_Lot = "Lot";
/** Set Phys.Inventory.
@param M_Inventory_ID Parameters for a Physical Inventory */
public void setM_Inventory_ID (int M_Inventory_ID)
{
if (M_Inventory_ID <= 0) set_Value (COLUMNNAME_M_Inventory_ID, null);
 else 
set_Value (COLUMNNAME_M_Inventory_ID, Integer.valueOf(M_Inventory_ID));
}
/** Get Phys.Inventory.
@return Parameters for a Physical Inventory */
public int getM_Inventory_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Inventory_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5fe27a6c-2f4e-4fa6-1a2e-e268a272e8da")
public static String es_PE_FIELD_Inventory_PhysInventory_Name="Inventario Físico";

@XendraTrl(Identifier="5fe27a6c-2f4e-4fa6-1a2e-e268a272e8da")
public static String es_PE_FIELD_Inventory_PhysInventory_Description="Parámetros para el inventario físico.";

@XendraTrl(Identifier="5fe27a6c-2f4e-4fa6-1a2e-e268a272e8da")
public static String es_PE_FIELD_Inventory_PhysInventory_Help="El inventario físico indica parámetros únicos para el inventario físico.";

@XendraField(AD_Column_ID="M_Inventory_ID",IsCentrallyMaintained=true,
AD_Tab_ID="27b79caa-18c7-42fe-efc8-33f376aadd73",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5fe27a6c-2f4e-4fa6-1a2e-e268a272e8da")
public static final String FIELDNAME_Inventory_PhysInventory="5fe27a6c-2f4e-4fa6-1a2e-e268a272e8da";

@XendraTrl(Identifier="24f6239f-6f96-7833-09cd-8749fa653c60")
public static String es_PE_COLUMN_M_Inventory_ID_Name="Inventario Físico";

@XendraColumn(AD_Element_ID="0e8f85f3-fbb2-f347-b412-2f2218e14665",ColumnName="M_Inventory_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="24f6239f-6f96-7833-09cd-8749fa653c60",
Synchronized="2019-08-30 22:22:49.0")
/** Column name M_Inventory_ID */
public static final String COLUMNNAME_M_Inventory_ID = "M_Inventory_ID";
/** Set Phys.Inventory Line.
@param M_InventoryLine_ID Unique line in an Inventory document */
public void setM_InventoryLine_ID (int M_InventoryLine_ID)
{
if (M_InventoryLine_ID <= 0) set_Value (COLUMNNAME_M_InventoryLine_ID, null);
 else 
set_Value (COLUMNNAME_M_InventoryLine_ID, Integer.valueOf(M_InventoryLine_ID));
}
/** Get Phys.Inventory Line.
@return Unique line in an Inventory document */
public int getM_InventoryLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_InventoryLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c734cb3f-7781-ad02-bbe3-fe954449b879")
public static String es_PE_FIELD_Inventory_PhysInventoryLine_Name="Item de Inventario Físico";

@XendraTrl(Identifier="c734cb3f-7781-ad02-bbe3-fe954449b879")
public static String es_PE_FIELD_Inventory_PhysInventoryLine_Description="Item único en un documento de inventario.";

@XendraTrl(Identifier="c734cb3f-7781-ad02-bbe3-fe954449b879")
public static String es_PE_FIELD_Inventory_PhysInventoryLine_Help="Indica el Item del documento del inventario físico (si es aplicable) para esta transacción.";

@XendraField(AD_Column_ID="M_InventoryLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="27b79caa-18c7-42fe-efc8-33f376aadd73",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c734cb3f-7781-ad02-bbe3-fe954449b879")
public static final String FIELDNAME_Inventory_PhysInventoryLine="c734cb3f-7781-ad02-bbe3-fe954449b879";

@XendraTrl(Identifier="00739ad6-133f-2176-52b5-4e76d570db57")
public static String es_PE_COLUMN_M_InventoryLine_ID_Name="Línea de Inventario Físico";

@XendraColumn(AD_Element_ID="2c5571d8-3b1f-8721-db52-cae644155140",ColumnName="M_InventoryLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="00739ad6-133f-2176-52b5-4e76d570db57",
Synchronized="2019-08-30 22:22:49.0")
/** Column name M_InventoryLine_ID */
public static final String COLUMNNAME_M_InventoryLine_ID = "M_InventoryLine_ID";
/** Set Locator.
@param M_Locator_ID Warehouse Locator */
public void setM_Locator_ID (int M_Locator_ID)
{
if (M_Locator_ID <= 0) set_Value (COLUMNNAME_M_Locator_ID, null);
 else 
set_Value (COLUMNNAME_M_Locator_ID, Integer.valueOf(M_Locator_ID));
}
/** Get Locator.
@return Warehouse Locator */
public int getM_Locator_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Locator_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2f6350b5-1e85-b291-c513-3260e96e351e")
public static String es_PE_FIELD_Inventory_Locator_Name="Ubicación";

@XendraTrl(Identifier="2f6350b5-1e85-b291-c513-3260e96e351e")
public static String es_PE_FIELD_Inventory_Locator_Description="Ubicación de Almacén";

@XendraTrl(Identifier="2f6350b5-1e85-b291-c513-3260e96e351e")
public static String es_PE_FIELD_Inventory_Locator_Help="El ID de la ubicación indica en que parte del almacén se localiza el producto";

@XendraField(AD_Column_ID="M_Locator_ID",IsCentrallyMaintained=true,
AD_Tab_ID="27b79caa-18c7-42fe-efc8-33f376aadd73",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2f6350b5-1e85-b291-c513-3260e96e351e")
public static final String FIELDNAME_Inventory_Locator="2f6350b5-1e85-b291-c513-3260e96e351e";

@XendraTrl(Identifier="b28c0318-00ac-4188-178c-baddbc5e220e")
public static String es_PE_COLUMN_M_Locator_ID_Name="Ubicación";

@XendraColumn(AD_Element_ID="67f044ce-2864-93f9-fd0d-320945150933",ColumnName="M_Locator_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b28c0318-00ac-4188-178c-baddbc5e220e",
Synchronized="2019-08-30 22:22:49.0")
/** Column name M_Locator_ID */
public static final String COLUMNNAME_M_Locator_ID = "M_Locator_ID";
/** Set Movement Date.
@param MovementDate Date a product was moved in or out of inventory */
public void setMovementDate (Timestamp MovementDate)
{
set_Value (COLUMNNAME_MovementDate, MovementDate);
}
/** Get Movement Date.
@return Date a product was moved in or out of inventory */
public Timestamp getMovementDate() 
{
return (Timestamp)get_Value(COLUMNNAME_MovementDate);
}

@XendraTrl(Identifier="22034d22-d982-4099-9fb4-bf89b4a4a02a")
public static String es_PE_FIELD_Inventory_MovementDate_Name="Fecha de Movimiento";

@XendraTrl(Identifier="22034d22-d982-4099-9fb4-bf89b4a4a02a")
public static String es_PE_FIELD_Inventory_MovementDate_Description="Fecha en que un producto fue movido (dentro ó fuera) del inventario";

@XendraTrl(Identifier="22034d22-d982-4099-9fb4-bf89b4a4a02a")
public static String es_PE_FIELD_Inventory_MovementDate_Help="La fecha del movimiento indica la fecha en que el producto es movido. Éste es el resultado de un embarque; recibo ó movimiento de inventario.";

@XendraField(AD_Column_ID="MovementDate",IsCentrallyMaintained=true,
AD_Tab_ID="27b79caa-18c7-42fe-efc8-33f376aadd73",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="22034d22-d982-4099-9fb4-bf89b4a4a02a")
public static final String FIELDNAME_Inventory_MovementDate="22034d22-d982-4099-9fb4-bf89b4a4a02a";

@XendraTrl(Identifier="21ee19ad-be36-6202-82cc-299ce74f7c70")
public static String es_PE_COLUMN_MovementDate_Name="Fecha de Movimiento";

@XendraColumn(AD_Element_ID="7a907f01-8525-820d-22d4-98b06d4b902b",ColumnName="MovementDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="21ee19ad-be36-6202-82cc-299ce74f7c70",
Synchronized="2019-08-30 22:22:50.0")
/** Column name MovementDate */
public static final String COLUMNNAME_MovementDate = "MovementDate";
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

@XendraTrl(Identifier="d8e2105a-8918-0825-6f7f-1411d04ac9f4")
public static String es_PE_FIELD_Inventory_Product_Name="Producto";

@XendraTrl(Identifier="d8e2105a-8918-0825-6f7f-1411d04ac9f4")
public static String es_PE_FIELD_Inventory_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="d8e2105a-8918-0825-6f7f-1411d04ac9f4")
public static String es_PE_FIELD_Inventory_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="27b79caa-18c7-42fe-efc8-33f376aadd73",AD_FieldGroup_ID="Product",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d8e2105a-8918-0825-6f7f-1411d04ac9f4")
public static final String FIELDNAME_Inventory_Product="d8e2105a-8918-0825-6f7f-1411d04ac9f4";

@XendraTrl(Identifier="f30db8e4-28a1-65a2-00d0-99295cbb8576")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f30db8e4-28a1-65a2-00d0-99295cbb8576",
Synchronized="2019-08-30 22:22:50.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set Warehouse.
@param M_Warehouse_ID Storage Warehouse and Service Point */
public void setM_Warehouse_ID (int M_Warehouse_ID)
{
if (M_Warehouse_ID <= 0) set_Value (COLUMNNAME_M_Warehouse_ID, null);
 else 
set_Value (COLUMNNAME_M_Warehouse_ID, Integer.valueOf(M_Warehouse_ID));
}
/** Get Warehouse.
@return Storage Warehouse and Service Point */
public int getM_Warehouse_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Warehouse_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c50f2b56-c8a0-8b5d-0313-40e4185ff817")
public static String es_PE_FIELD_Inventory_Warehouse_Name="Almacén";

@XendraTrl(Identifier="c50f2b56-c8a0-8b5d-0313-40e4185ff817")
public static String es_PE_FIELD_Inventory_Warehouse_Description="Almacén";

@XendraTrl(Identifier="c50f2b56-c8a0-8b5d-0313-40e4185ff817")
public static String es_PE_FIELD_Inventory_Warehouse_Help="El Almacén indica un Almacén único donde los productos son almacenados";

@XendraField(AD_Column_ID="M_Warehouse_ID",IsCentrallyMaintained=true,
AD_Tab_ID="27b79caa-18c7-42fe-efc8-33f376aadd73",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c50f2b56-c8a0-8b5d-0313-40e4185ff817")
public static final String FIELDNAME_Inventory_Warehouse="c50f2b56-c8a0-8b5d-0313-40e4185ff817";

@XendraTrl(Identifier="05d51e25-b462-9ed5-cfbb-43e66f355de8")
public static String es_PE_COLUMN_M_Warehouse_ID_Name="Almacén";

@XendraColumn(AD_Element_ID="402045cd-baa5-aeaf-b148-a921dffb7821",ColumnName="M_Warehouse_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="05d51e25-b462-9ed5-cfbb-43e66f355de8",
Synchronized="2019-08-30 22:22:50.0")
/** Column name M_Warehouse_ID */
public static final String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
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

@XendraTrl(Identifier="27dcebb8-9dd3-1668-f90a-03b6fef8d125")
public static String es_PE_FIELD_Inventory_Processed_Name="Procesado";

@XendraTrl(Identifier="27dcebb8-9dd3-1668-f90a-03b6fef8d125")
public static String es_PE_FIELD_Inventory_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="27dcebb8-9dd3-1668-f90a-03b6fef8d125")
public static String es_PE_FIELD_Inventory_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="27b79caa-18c7-42fe-efc8-33f376aadd73",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="27dcebb8-9dd3-1668-f90a-03b6fef8d125")
public static final String FIELDNAME_Inventory_Processed="27dcebb8-9dd3-1668-f90a-03b6fef8d125";

@XendraTrl(Identifier="85d707db-3097-04dd-6ce0-b276db58c0cc")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="85d707db-3097-04dd-6ce0-b276db58c0cc",
Synchronized="2019-08-30 22:22:50.0")
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

@XendraTrl(Identifier="317f5cb1-62bb-e2c5-11d3-8b933185d718")
public static String es_PE_FIELD_Inventory_ProcessNow_Name="Importa Inventario";

@XendraTrl(Identifier="317f5cb1-62bb-e2c5-11d3-8b933185d718")
public static String es_PE_FIELD_Inventory_ProcessNow_Description="Importa Inventario Fisico";

@XendraTrl(Identifier="317f5cb1-62bb-e2c5-11d3-8b933185d718")
public static String es_PE_FIELD_Inventory_ProcessNow_Help="Los parámetros son valores prefijados para los valores nulos del registro de la importación, ellos no sobreescriben ningunos datos.";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="27b79caa-18c7-42fe-efc8-33f376aadd73",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="317f5cb1-62bb-e2c5-11d3-8b933185d718")
public static final String FIELDNAME_Inventory_ProcessNow="317f5cb1-62bb-e2c5-11d3-8b933185d718";

@XendraTrl(Identifier="f2f7547e-394b-874a-f308-481a762cefc8")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="b484f1fb-0fc1-6dde-62ab-d7f21945baf0",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="f2f7547e-394b-874a-f308-481a762cefc8",Synchronized="2019-08-30 22:22:50.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Product_Value.
@param Product_Value Product_Value */
public void setProduct_Value (String Product_Value)
{
if (Product_Value != null && Product_Value.length() > 40)
{
log.warning("Length > 40 - truncated");
Product_Value = Product_Value.substring(0,39);
}
set_Value (COLUMNNAME_Product_Value, Product_Value);
}
/** Get Product_Value.
@return Product_Value */
public String getProduct_Value() 
{
String value = (String)get_Value(COLUMNNAME_Product_Value);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="fe3f7198-aadb-4929-805b-ca55a8b68b3d")
public static String es_PE_FIELD_Inventory_Product_Value_Name="product_value";

@XendraField(AD_Column_ID="Product_Value",IsCentrallyMaintained=true,
AD_Tab_ID="27b79caa-18c7-42fe-efc8-33f376aadd73",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2018-01-06 12:53:11.0",
Identifier="fe3f7198-aadb-4929-805b-ca55a8b68b3d")
public static final String FIELDNAME_Inventory_Product_Value="fe3f7198-aadb-4929-805b-ca55a8b68b3d";

@XendraTrl(Identifier="2283524c-c3e3-4a03-8047-9c22901c77e5")
public static String es_PE_COLUMN_Product_Value_Name="Product_Value";

@XendraColumn(AD_Element_ID="8c2f9e70-4ad7-40ae-9131-91c463a543cc",ColumnName="Product_Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2283524c-c3e3-4a03-8047-9c22901c77e5",
Synchronized="2019-08-30 22:22:50.0")
/** Column name Product_Value */
public static final String COLUMNNAME_Product_Value = "Product_Value";
/** Set Quantity book.
@param QtyBook Book Quantity */
public void setQtyBook (BigDecimal QtyBook)
{
set_Value (COLUMNNAME_QtyBook, QtyBook);
}
/** Get Quantity book.
@return Book Quantity */
public BigDecimal getQtyBook() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QtyBook);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="cd356d58-a613-0ab0-7d0a-de38e2757f50")
public static String es_PE_FIELD_Inventory_QuantityBook_Name="Cantidad en Libros";

@XendraTrl(Identifier="cd356d58-a613-0ab0-7d0a-de38e2757f50")
public static String es_PE_FIELD_Inventory_QuantityBook_Description="Cantidad en Libros";

@XendraTrl(Identifier="cd356d58-a613-0ab0-7d0a-de38e2757f50")
public static String es_PE_FIELD_Inventory_QuantityBook_Help="El cantidad en libros indica la cuenta de la línea almacenada en el sistema para un producto en inventario";

@XendraField(AD_Column_ID="QtyBook",IsCentrallyMaintained=true,
AD_Tab_ID="27b79caa-18c7-42fe-efc8-33f376aadd73",AD_FieldGroup_ID="Quantities",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cd356d58-a613-0ab0-7d0a-de38e2757f50")
public static final String FIELDNAME_Inventory_QuantityBook="cd356d58-a613-0ab0-7d0a-de38e2757f50";

@XendraTrl(Identifier="7eb26db4-99c9-03c2-49e5-6557d9e29d83")
public static String es_PE_COLUMN_QtyBook_Name="Cantidad en Libros";

@XendraColumn(AD_Element_ID="6934ec29-953c-1617-8421-63d66b15d0f9",ColumnName="QtyBook",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7eb26db4-99c9-03c2-49e5-6557d9e29d83",
Synchronized="2019-08-30 22:22:50.0")
/** Column name QtyBook */
public static final String COLUMNNAME_QtyBook = "QtyBook";
/** Set Quantity count.
@param QtyCount Counted Quantity */
public void setQtyCount (BigDecimal QtyCount)
{
set_Value (COLUMNNAME_QtyCount, QtyCount);
}
/** Get Quantity count.
@return Counted Quantity */
public BigDecimal getQtyCount() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QtyCount);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="4907ffa0-d70d-9a28-bdfb-5a3361ab740a")
public static String es_PE_FIELD_Inventory_QuantityCount_Name="Cantidad Contada";

@XendraTrl(Identifier="4907ffa0-d70d-9a28-bdfb-5a3361ab740a")
public static String es_PE_FIELD_Inventory_QuantityCount_Description="Cantidad Contada";

@XendraTrl(Identifier="4907ffa0-d70d-9a28-bdfb-5a3361ab740a")
public static String es_PE_FIELD_Inventory_QuantityCount_Help="La Cantidad Contada indica la cuenta de inventario actual tomada para un producto en inventario";

@XendraField(AD_Column_ID="QtyCount",IsCentrallyMaintained=true,
AD_Tab_ID="27b79caa-18c7-42fe-efc8-33f376aadd73",AD_FieldGroup_ID="Quantities",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4907ffa0-d70d-9a28-bdfb-5a3361ab740a")
public static final String FIELDNAME_Inventory_QuantityCount="4907ffa0-d70d-9a28-bdfb-5a3361ab740a";

@XendraTrl(Identifier="8eb9bb86-5735-7826-31fb-613243095634")
public static String es_PE_COLUMN_QtyCount_Name="Cantidad Contada";

@XendraColumn(AD_Element_ID="0bc23bd1-673a-949b-480d-869c08afa39d",ColumnName="QtyCount",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8eb9bb86-5735-7826-31fb-613243095634",
Synchronized="2019-08-30 22:22:50.0")
/** Column name QtyCount */
public static final String COLUMNNAME_QtyCount = "QtyCount";
/** Set Serial No.
@param SerNo Product Serial Number  */
public void setSerNo (String SerNo)
{
if (SerNo != null && SerNo.length() > 20)
{
log.warning("Length > 20 - truncated");
SerNo = SerNo.substring(0,19);
}
set_Value (COLUMNNAME_SerNo, SerNo);
}
/** Get Serial No.
@return Product Serial Number  */
public String getSerNo() 
{
String value = (String)get_Value(COLUMNNAME_SerNo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="93af93c2-eabb-2cb2-0d07-9eac0a13e0c7")
public static String es_PE_FIELD_Inventory_SerialNo_Name="No. de Serie";

@XendraTrl(Identifier="93af93c2-eabb-2cb2-0d07-9eac0a13e0c7")
public static String es_PE_FIELD_Inventory_SerialNo_Description="Número de serie del producto";

@XendraTrl(Identifier="93af93c2-eabb-2cb2-0d07-9eac0a13e0c7")
public static String es_PE_FIELD_Inventory_SerialNo_Help="El número de serie identifica un producto garantizado; monitoreado. Puede solamente ser usado cuando la cantidad es 1.";

@XendraField(AD_Column_ID="SerNo",IsCentrallyMaintained=true,
AD_Tab_ID="27b79caa-18c7-42fe-efc8-33f376aadd73",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="93af93c2-eabb-2cb2-0d07-9eac0a13e0c7")
public static final String FIELDNAME_Inventory_SerialNo="93af93c2-eabb-2cb2-0d07-9eac0a13e0c7";

@XendraTrl(Identifier="f18abf23-64b2-5488-c44c-5c877bb4d979")
public static String es_PE_COLUMN_SerNo_Name="No. de Serie";

@XendraColumn(AD_Element_ID="9aac6ac8-a553-7ad4-9bc7-40f85e011f4b",ColumnName="SerNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f18abf23-64b2-5488-c44c-5c877bb4d979",
Synchronized="2019-08-30 22:22:50.0")
/** Column name SerNo */
public static final String COLUMNNAME_SerNo = "SerNo";
/** Set UPC/EAN.
@param UPC Bar Code (Universal Product Code or its superset European Article Number) */
public void setUPC (String UPC)
{
if (UPC != null && UPC.length() > 30)
{
log.warning("Length > 30 - truncated");
UPC = UPC.substring(0,29);
}
set_Value (COLUMNNAME_UPC, UPC);
}
/** Get UPC/EAN.
@return Bar Code (Universal Product Code or its superset European Article Number) */
public String getUPC() 
{
String value = (String)get_Value(COLUMNNAME_UPC);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="e20a021d-6637-1b12-5b5a-e3cdcb2f7397")
public static String es_PE_FIELD_Inventory_UPCEAN_Name="UPC/EAN";

@XendraTrl(Identifier="e20a021d-6637-1b12-5b5a-e3cdcb2f7397")
public static String es_PE_FIELD_Inventory_UPCEAN_Description="Código de Barras (Codigo universal del Producto ó su super conjunto, Número de Articulo europeo)";

@XendraTrl(Identifier="e20a021d-6637-1b12-5b5a-e3cdcb2f7397")
public static String es_PE_FIELD_Inventory_UPCEAN_Help="Use este campo para introducir el código de barras para el producto en cualquiera de las simbologías del código de barras  (Codabar; Código 25; Código 39; Código 93; Código 128; UPC (A); UPC (E); EAN-13; EAN-8; ITF; ITF-14; ISBN; ISSN; JAN-13; JAN-8; POSTNET y FIM; MSI/Plessey; y Pharmacode)";

@XendraField(AD_Column_ID="UPC",IsCentrallyMaintained=true,
AD_Tab_ID="27b79caa-18c7-42fe-efc8-33f376aadd73",AD_FieldGroup_ID="Product",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e20a021d-6637-1b12-5b5a-e3cdcb2f7397")
public static final String FIELDNAME_Inventory_UPCEAN="e20a021d-6637-1b12-5b5a-e3cdcb2f7397";

@XendraTrl(Identifier="5193d7b4-ac56-0e2d-40c7-bebe3a03508e")
public static String es_PE_COLUMN_UPC_Name="UPC/EAN";

@XendraColumn(AD_Element_ID="9e36272a-ec41-b187-d531-cec50070c612",ColumnName="UPC",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5193d7b4-ac56-0e2d-40c7-bebe3a03508e",
Synchronized="2019-08-30 22:22:50.0")
/** Column name UPC */
public static final String COLUMNNAME_UPC = "UPC";
/** Set Warehouse Key.
@param WarehouseValue Key of the Warehouse */
public void setWarehouseValue (String WarehouseValue)
{
if (WarehouseValue != null && WarehouseValue.length() > 40)
{
log.warning("Length > 40 - truncated");
WarehouseValue = WarehouseValue.substring(0,39);
}
set_Value (COLUMNNAME_WarehouseValue, WarehouseValue);
}
/** Get Warehouse Key.
@return Key of the Warehouse */
public String getWarehouseValue() 
{
String value = (String)get_Value(COLUMNNAME_WarehouseValue);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="046cb4fd-1ef7-2ed8-ef27-163d49113566")
public static String es_PE_FIELD_Inventory_WarehouseKey_Name="Clave de Almacén";

@XendraTrl(Identifier="046cb4fd-1ef7-2ed8-ef27-163d49113566")
public static String es_PE_FIELD_Inventory_WarehouseKey_Description="Clave de almacén";

@XendraTrl(Identifier="046cb4fd-1ef7-2ed8-ef27-163d49113566")
public static String es_PE_FIELD_Inventory_WarehouseKey_Help="Clave para identificar el almacén";

@XendraField(AD_Column_ID="WarehouseValue",IsCentrallyMaintained=true,
AD_Tab_ID="27b79caa-18c7-42fe-efc8-33f376aadd73",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="046cb4fd-1ef7-2ed8-ef27-163d49113566")
public static final String FIELDNAME_Inventory_WarehouseKey="046cb4fd-1ef7-2ed8-ef27-163d49113566";

@XendraTrl(Identifier="c5f8a369-572c-ac5a-dcbe-34bdb5b5e2b1")
public static String es_PE_COLUMN_WarehouseValue_Name="Clave de Almacén";

@XendraColumn(AD_Element_ID="0e4df68c-9d17-808f-9496-c65827b870bc",ColumnName="WarehouseValue",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c5f8a369-572c-ac5a-dcbe-34bdb5b5e2b1",
Synchronized="2019-08-30 22:22:50.0")
/** Column name WarehouseValue */
public static final String COLUMNNAME_WarehouseValue = "WarehouseValue";
/** Set Aisle (X).
@param X X dimension, e.g., Aisle */
public void setX (String X)
{
if (X != null && X.length() > 60)
{
log.warning("Length > 60 - truncated");
X = X.substring(0,59);
}
set_Value (COLUMNNAME_X, X);
}
/** Get Aisle (X).
@return X dimension, e.g., Aisle */
public String getX() 
{
String value = (String)get_Value(COLUMNNAME_X);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="934cf338-2d1f-4aa1-a47c-6cb51c7ab855")
public static String es_PE_FIELD_Inventory_AisleX_Name="Rack";

@XendraTrl(Identifier="934cf338-2d1f-4aa1-a47c-6cb51c7ab855")
public static String es_PE_FIELD_Inventory_AisleX_Description="Dimensión X; Ej. Pasillo";

@XendraTrl(Identifier="934cf338-2d1f-4aa1-a47c-6cb51c7ab855")
public static String es_PE_FIELD_Inventory_AisleX_Help="La dimensión X indica el Pasillo en donde un producto está localizado";

@XendraField(AD_Column_ID="X",IsCentrallyMaintained=true,
AD_Tab_ID="27b79caa-18c7-42fe-efc8-33f376aadd73",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="934cf338-2d1f-4aa1-a47c-6cb51c7ab855")
public static final String FIELDNAME_Inventory_AisleX="934cf338-2d1f-4aa1-a47c-6cb51c7ab855";

@XendraTrl(Identifier="5b701074-6791-c06e-c43a-3abed38786ca")
public static String es_PE_COLUMN_X_Name="Rack";

@XendraColumn(AD_Element_ID="c3c6ff0a-ca8d-218c-5162-6fda8fc182e7",ColumnName="X",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5b701074-6791-c06e-c43a-3abed38786ca",
Synchronized="2019-08-30 22:22:50.0")
/** Column name X */
public static final String COLUMNNAME_X = "X";
/** Set Bin (Y).
@param Y Y dimension, e.g., Bin */
public void setY (String Y)
{
if (Y != null && Y.length() > 60)
{
log.warning("Length > 60 - truncated");
Y = Y.substring(0,59);
}
set_Value (COLUMNNAME_Y, Y);
}
/** Get Bin (Y).
@return Y dimension, e.g., Bin */
public String getY() 
{
String value = (String)get_Value(COLUMNNAME_Y);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="5f5de1c1-40a9-ab30-545c-8e2bf484e156")
public static String es_PE_FIELD_Inventory_BinY_Name="Columna";

@XendraTrl(Identifier="5f5de1c1-40a9-ab30-545c-8e2bf484e156")
public static String es_PE_FIELD_Inventory_BinY_Description="Dimensión Y; Ej. Cajón";

@XendraTrl(Identifier="5f5de1c1-40a9-ab30-545c-8e2bf484e156")
public static String es_PE_FIELD_Inventory_BinY_Help="La dimensión Y indica el anaquel en que un producto está localizado";

@XendraField(AD_Column_ID="Y",IsCentrallyMaintained=true,
AD_Tab_ID="27b79caa-18c7-42fe-efc8-33f376aadd73",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5f5de1c1-40a9-ab30-545c-8e2bf484e156")
public static final String FIELDNAME_Inventory_BinY="5f5de1c1-40a9-ab30-545c-8e2bf484e156";

@XendraTrl(Identifier="1a82aa78-4a7e-33cb-c02f-db30a4d9f3e2")
public static String es_PE_COLUMN_Y_Name="Columna";

@XendraColumn(AD_Element_ID="1bd4acc9-4368-301e-254c-862fd2d7d43b",ColumnName="Y",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1a82aa78-4a7e-33cb-c02f-db30a4d9f3e2",
Synchronized="2019-08-30 22:22:50.0")
/** Column name Y */
public static final String COLUMNNAME_Y = "Y";
/** Set Level (Z).
@param Z Z dimension, e.g., Level */
public void setZ (String Z)
{
if (Z != null && Z.length() > 60)
{
log.warning("Length > 60 - truncated");
Z = Z.substring(0,59);
}
set_Value (COLUMNNAME_Z, Z);
}
/** Get Level (Z).
@return Z dimension, e.g., Level */
public String getZ() 
{
String value = (String)get_Value(COLUMNNAME_Z);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="1ef2088b-61f2-104e-d849-fb2efb406ccf")
public static String es_PE_FIELD_Inventory_LevelZ_Name="Nivel ";

@XendraTrl(Identifier="1ef2088b-61f2-104e-d849-fb2efb406ccf")
public static String es_PE_FIELD_Inventory_LevelZ_Description="Dimensión Z; Ej. nivel";

@XendraTrl(Identifier="1ef2088b-61f2-104e-d849-fb2efb406ccf")
public static String es_PE_FIELD_Inventory_LevelZ_Help="La dimensión Z indica el nivel en que un producto está localizado.";

@XendraField(AD_Column_ID="Z",IsCentrallyMaintained=true,
AD_Tab_ID="27b79caa-18c7-42fe-efc8-33f376aadd73",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1ef2088b-61f2-104e-d849-fb2efb406ccf")
public static final String FIELDNAME_Inventory_LevelZ="1ef2088b-61f2-104e-d849-fb2efb406ccf";

@XendraTrl(Identifier="a0221105-4b3c-8ac0-5b60-8a1f111e2c76")
public static String es_PE_COLUMN_Z_Name="Nivel ";

@XendraColumn(AD_Element_ID="26f6808c-c825-8dcd-13eb-90b1876a3317",ColumnName="Z",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a0221105-4b3c-8ac0-5b60-8a1f111e2c76",
Synchronized="2019-08-30 22:22:50.0")
/** Column name Z */
public static final String COLUMNNAME_Z = "Z";
}
