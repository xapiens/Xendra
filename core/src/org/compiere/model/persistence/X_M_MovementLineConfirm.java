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
/** Generated Model for M_MovementLineConfirm
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_MovementLineConfirm extends PO
{
/** Standard Constructor
@param ctx context
@param M_MovementLineConfirm_ID id
@param trxName transaction
*/
public X_M_MovementLineConfirm (Properties ctx, int M_MovementLineConfirm_ID, String trxName)
{
super (ctx, M_MovementLineConfirm_ID, trxName);
/** if (M_MovementLineConfirm_ID == 0)
{
setConfirmedQty (Env.ZERO);
setDifferenceQty (Env.ZERO);
setM_MovementConfirm_ID (0);
setM_MovementLineConfirm_ID (0);
setM_MovementLine_ID (0);
setProcessed (false);	
// N
setScrappedQty (Env.ZERO);
setTargetQty (Env.ZERO);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_MovementLineConfirm (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=737 */
public static int Table_ID=MTable.getTable_ID("M_MovementLineConfirm");

@XendraTrl(Identifier="6a55c5d1-8f53-82db-697b-39da77091c34")
public static String es_PE_TAB_Line_Description="Confirme el Ìtem de Movimiento del Inventario";

@XendraTrl(Identifier="6a55c5d1-8f53-82db-697b-39da77091c34")
public static String es_PE_TAB_Line_Name="Ìtem";
@XendraTab(Name="Line",
Description="Confirm Inventory Move Lines",
Help="The quantities are in the storage Unit of Measure!",
AD_Window_ID="2d3ecb03-6da6-cacc-a299-b3fab0fb6a3c",SeqNo=20,TabLevel=1,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="6a55c5d1-8f53-82db-697b-39da77091c34",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Line="6a55c5d1-8f53-82db-697b-39da77091c34";

@XendraTrl(Identifier="4ce71b91-8e4a-d08c-314d-a29ed25453f0")
public static String es_PE_TABLE_M_MovementLineConfirm_Name="Confirma Línea de movimiento";


@XendraTable(Name="Move Line Confirm",AD_Package_ID="2809ac2d-7d43-20f8-05f0-a478f2e50204",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Inventory Move Line Confirmation",
Help="",TableName="M_MovementLineConfirm",AccessLevel="1",
AD_Window_ID="2d3ecb03-6da6-cacc-a299-b3fab0fb6a3c",AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.material",Identifier="4ce71b91-8e4a-d08c-314d-a29ed25453f0",
Synchronized="2020-03-03 21:38:42.0")
/** TableName=M_MovementLineConfirm */
public static final String Table_Name="M_MovementLineConfirm";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_MovementLineConfirm");

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
    Table_ID = MTable.getTable_ID("M_MovementLineConfirm");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_MovementLineConfirm[").append(get_ID()).append("]");
return sb.toString();
}
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

@XendraTrl(Identifier="2ff5c229-d809-2d92-e82e-b470db87f144")
public static String es_PE_FIELD_Line_ConfirmedQuantity_Name="Cantidad Confirmada";

@XendraTrl(Identifier="2ff5c229-d809-2d92-e82e-b470db87f144")
public static String es_PE_FIELD_Line_ConfirmedQuantity_Description="Confirmación de la cantidad recibida";

@XendraTrl(Identifier="2ff5c229-d809-2d92-e82e-b470db87f144")
public static String es_PE_FIELD_Line_ConfirmedQuantity_Help="Confirmación de la cantidad recibida";

@XendraField(AD_Column_ID="ConfirmedQty",IsCentrallyMaintained=true,
AD_Tab_ID="6a55c5d1-8f53-82db-697b-39da77091c34",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2ff5c229-d809-2d92-e82e-b470db87f144")
public static final String FIELDNAME_Line_ConfirmedQuantity="2ff5c229-d809-2d92-e82e-b470db87f144";

@XendraTrl(Identifier="049093d4-33a2-9e0b-ce7b-2d80e7610c69")
public static String es_PE_COLUMN_ConfirmedQty_Name="Cantidad Confirmada";

@XendraColumn(AD_Element_ID="e612ae07-ebb5-65be-fcbd-a37419fb113f",ColumnName="ConfirmedQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="049093d4-33a2-9e0b-ce7b-2d80e7610c69",
Synchronized="2019-08-30 22:23:19.0")
/** Column name ConfirmedQty */
public static final String COLUMNNAME_ConfirmedQty = "ConfirmedQty";
/** Set UOM.
@param C_UOM_ID Unit of Measure */
public void setC_UOM_ID (int C_UOM_ID)
{
if (C_UOM_ID <= 0) set_Value (COLUMNNAME_C_UOM_ID, null);
 else 
set_Value (COLUMNNAME_C_UOM_ID, Integer.valueOf(C_UOM_ID));
}
/** Get UOM.
@return Unit of Measure */
public int getC_UOM_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_UOM_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="20e81949-1cef-7d71-7284-6fb499ab4b4e")
public static String es_PE_FIELD_Line_UOM_Name="UM";

@XendraTrl(Identifier="20e81949-1cef-7d71-7284-6fb499ab4b4e")
public static String es_PE_FIELD_Line_UOM_Description="Unidad de Medida";

@XendraTrl(Identifier="20e81949-1cef-7d71-7284-6fb499ab4b4e")
public static String es_PE_FIELD_Line_UOM_Help="La UM define una unidad de medida única no monetaria";

@XendraField(AD_Column_ID="C_UOM_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6a55c5d1-8f53-82db-697b-39da77091c34",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="20e81949-1cef-7d71-7284-6fb499ab4b4e")
public static final String FIELDNAME_Line_UOM="20e81949-1cef-7d71-7284-6fb499ab4b4e";

@XendraTrl(Identifier="c74a3c4d-e4dc-c33c-8137-38c55db99976")
public static String es_PE_COLUMN_C_UOM_ID_Name="UOM";

@XendraColumn(AD_Element_ID="d0345019-4fcc-44c8-4fd1-e38e3b4adeed",ColumnName="C_UOM_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="107d46fd-952f-7ad3-6b0d-c74906c7b323",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c74a3c4d-e4dc-c33c-8137-38c55db99976",Synchronized="2019-08-30 22:23:19.0")
/** Column name C_UOM_ID */
public static final String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
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

@XendraTrl(Identifier="9a0c8916-2c20-933e-bb59-d8e356cf42eb")
public static String es_PE_FIELD_Line_Description_Name="Observación";

@XendraTrl(Identifier="9a0c8916-2c20-933e-bb59-d8e356cf42eb")
public static String es_PE_FIELD_Line_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="9a0c8916-2c20-933e-bb59-d8e356cf42eb")
public static String es_PE_FIELD_Line_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="6a55c5d1-8f53-82db-697b-39da77091c34",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9a0c8916-2c20-933e-bb59-d8e356cf42eb")
public static final String FIELDNAME_Line_Description="9a0c8916-2c20-933e-bb59-d8e356cf42eb";

@XendraTrl(Identifier="a1154f93-15b5-a928-4281-cc346b51af10")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=true,ColumnSQL="",
IsAllowLogging=false,Identifier="a1154f93-15b5-a928-4281-cc346b51af10",
Synchronized="2019-08-30 22:23:19.0")
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

@XendraTrl(Identifier="155afb2b-0f3b-62aa-efd6-c95fdc89bf15")
public static String es_PE_FIELD_Line_Difference_Name="Diferencia Cant.";

@XendraTrl(Identifier="155afb2b-0f3b-62aa-efd6-c95fdc89bf15")
public static String es_PE_FIELD_Line_Difference_Description="Cantidad de diferencia";

@XendraField(AD_Column_ID="DifferenceQty",IsCentrallyMaintained=true,
AD_Tab_ID="6a55c5d1-8f53-82db-697b-39da77091c34",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="155afb2b-0f3b-62aa-efd6-c95fdc89bf15")
public static final String FIELDNAME_Line_Difference="155afb2b-0f3b-62aa-efd6-c95fdc89bf15";

@XendraTrl(Identifier="33e531e8-1eee-e36c-6c63-a526f00a3e78")
public static String es_PE_COLUMN_DifferenceQty_Name="Diferencia Cant.";

@XendraColumn(AD_Element_ID="7bb51895-43a5-614f-71a2-9c6ac66e8ea0",ColumnName="DifferenceQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="33e531e8-1eee-e36c-6c63-a526f00a3e78",
Synchronized="2019-08-30 22:23:19.0")
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
@XendraTrl(Identifier="6bc27aed-751c-4fd0-8c62-8892ca978d50")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6bc27aed-751c-4fd0-8c62-8892ca978d50",
Synchronized="2019-08-30 22:23:19.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
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

@XendraTrl(Identifier="fd7405f8-021d-a8f7-e6ce-dbd1c6f4bf1b")
public static String es_PE_FIELD_Line_PhysInventoryLine_Name="Item de Inventario Físico";

@XendraTrl(Identifier="fd7405f8-021d-a8f7-e6ce-dbd1c6f4bf1b")
public static String es_PE_FIELD_Line_PhysInventoryLine_Description="Item único en un documento de inventario.";

@XendraTrl(Identifier="fd7405f8-021d-a8f7-e6ce-dbd1c6f4bf1b")
public static String es_PE_FIELD_Line_PhysInventoryLine_Help="Indica el Item del documento del inventario físico (si es aplicable) para esta transacción.";

@XendraField(AD_Column_ID="M_InventoryLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6a55c5d1-8f53-82db-697b-39da77091c34",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Processed@=Y",DisplayLength=26,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fd7405f8-021d-a8f7-e6ce-dbd1c6f4bf1b")
public static final String FIELDNAME_Line_PhysInventoryLine="fd7405f8-021d-a8f7-e6ce-dbd1c6f4bf1b";

@XendraTrl(Identifier="78687e39-ade1-cb42-21f9-74e421e4daf9")
public static String es_PE_COLUMN_M_InventoryLine_ID_Name="Línea de Inventario Físico";

@XendraColumn(AD_Element_ID="2c5571d8-3b1f-8721-db52-cae644155140",ColumnName="M_InventoryLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="78687e39-ade1-cb42-21f9-74e421e4daf9",
Synchronized="2019-08-30 22:23:19.0")
/** Column name M_InventoryLine_ID */
public static final String COLUMNNAME_M_InventoryLine_ID = "M_InventoryLine_ID";
/** Set Move Confirm.
@param M_MovementConfirm_ID Inventory Move Confirmation */
public void setM_MovementConfirm_ID (int M_MovementConfirm_ID)
{
if (M_MovementConfirm_ID < 1) throw new IllegalArgumentException ("M_MovementConfirm_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_MovementConfirm_ID, Integer.valueOf(M_MovementConfirm_ID));
}
/** Get Move Confirm.
@return Inventory Move Confirmation */
public int getM_MovementConfirm_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_MovementConfirm_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getM_MovementConfirm_ID()));
}

@XendraTrl(Identifier="35b6f257-19ac-06d2-f25e-2e746eb90b0b")
public static String es_PE_FIELD_Line_MoveConfirm_Name="Confirma Movimiento";

@XendraTrl(Identifier="35b6f257-19ac-06d2-f25e-2e746eb90b0b")
public static String es_PE_FIELD_Line_MoveConfirm_Description="Confirmación de Movimientos de Inventario";

@XendraTrl(Identifier="35b6f257-19ac-06d2-f25e-2e746eb90b0b")
public static String es_PE_FIELD_Line_MoveConfirm_Help="El documento se crea automáticamente cuando el tipo del documento del movimiento indica en tránsito.";

@XendraField(AD_Column_ID="M_MovementConfirm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6a55c5d1-8f53-82db-697b-39da77091c34",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="35b6f257-19ac-06d2-f25e-2e746eb90b0b")
public static final String FIELDNAME_Line_MoveConfirm="35b6f257-19ac-06d2-f25e-2e746eb90b0b";

@XendraTrl(Identifier="c5d4b3de-4aa4-235c-2a1a-05daebedf7ea")
public static String es_PE_COLUMN_M_MovementConfirm_ID_Name="Confirma Movimiento";

@XendraColumn(AD_Element_ID="4712f561-7bf1-2b28-a4bb-f474ad6a2418",
ColumnName="M_MovementConfirm_ID",AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c5d4b3de-4aa4-235c-2a1a-05daebedf7ea",Synchronized="2019-08-30 22:23:19.0")
/** Column name M_MovementConfirm_ID */
public static final String COLUMNNAME_M_MovementConfirm_ID = "M_MovementConfirm_ID";
/** Set Move Line Confirm.
@param M_MovementLineConfirm_ID Inventory Move Line Confirmation */
public void setM_MovementLineConfirm_ID (int M_MovementLineConfirm_ID)
{
if (M_MovementLineConfirm_ID < 1) throw new IllegalArgumentException ("M_MovementLineConfirm_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_MovementLineConfirm_ID, Integer.valueOf(M_MovementLineConfirm_ID));
}
/** Get Move Line Confirm.
@return Inventory Move Line Confirmation */
public int getM_MovementLineConfirm_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_MovementLineConfirm_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="dd45e65b-1300-8bc4-092a-fb4d49a1654f")
public static String es_PE_FIELD_Line_MoveLineConfirm_Name="Confirma Línea de movimiento";

@XendraTrl(Identifier="dd45e65b-1300-8bc4-092a-fb4d49a1654f")
public static String es_PE_FIELD_Line_MoveLineConfirm_Description="Línea de confirmación de Movimientos de Inventario";

@XendraField(AD_Column_ID="M_MovementLineConfirm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6a55c5d1-8f53-82db-697b-39da77091c34",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dd45e65b-1300-8bc4-092a-fb4d49a1654f")
public static final String FIELDNAME_Line_MoveLineConfirm="dd45e65b-1300-8bc4-092a-fb4d49a1654f";
/** Column name M_MovementLineConfirm_ID */
public static final String COLUMNNAME_M_MovementLineConfirm_ID = "M_MovementLineConfirm_ID";
/** Set Move Line.
@param M_MovementLine_ID Inventory Move document Line */
public void setM_MovementLine_ID (int M_MovementLine_ID)
{
if (M_MovementLine_ID < 1) throw new IllegalArgumentException ("M_MovementLine_ID is mandatory.");
set_Value (COLUMNNAME_M_MovementLine_ID, Integer.valueOf(M_MovementLine_ID));
}
/** Get Move Line.
@return Inventory Move document Line */
public int getM_MovementLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_MovementLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2f2ce130-3e51-70f5-7837-999b572c57b1")
public static String es_PE_FIELD_Line_MoveLine_Name="Item del Movimiento";

@XendraTrl(Identifier="2f2ce130-3e51-70f5-7837-999b572c57b1")
public static String es_PE_FIELD_Line_MoveLine_Description="Item del documento de movimiento de inventario";

@XendraTrl(Identifier="2f2ce130-3e51-70f5-7837-999b572c57b1")
public static String es_PE_FIELD_Line_MoveLine_Help="Indica el Item del documento de movimiento de inventario (si aplica) para esta transacción.";

@XendraField(AD_Column_ID="M_MovementLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6a55c5d1-8f53-82db-697b-39da77091c34",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=40,SortNo=1,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2f2ce130-3e51-70f5-7837-999b572c57b1")
public static final String FIELDNAME_Line_MoveLine="2f2ce130-3e51-70f5-7837-999b572c57b1";

@XendraTrl(Identifier="7c3aeac5-eb59-48c0-b566-bef9323636e9")
public static String es_PE_COLUMN_M_MovementLine_ID_Name="Línea del Movimiento";

@XendraColumn(AD_Element_ID="45800ec7-b982-e856-179e-390dd2305e2e",ColumnName="M_MovementLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7c3aeac5-eb59-48c0-b566-bef9323636e9",
Synchronized="2019-08-30 22:23:19.0")
/** Column name M_MovementLine_ID */
public static final String COLUMNNAME_M_MovementLine_ID = "M_MovementLine_ID";
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

@XendraTrl(Identifier="bde76b24-0867-e798-1924-d24e4cd58398")
public static String es_PE_FIELD_Line_Product_Name="Producto";

@XendraTrl(Identifier="bde76b24-0867-e798-1924-d24e4cd58398")
public static String es_PE_FIELD_Line_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="bde76b24-0867-e798-1924-d24e4cd58398")
public static String es_PE_FIELD_Line_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6a55c5d1-8f53-82db-697b-39da77091c34",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bde76b24-0867-e798-1924-d24e4cd58398")
public static final String FIELDNAME_Line_Product="bde76b24-0867-e798-1924-d24e4cd58398";

@XendraTrl(Identifier="db3af6ba-0138-ec47-7d49-84ad808794c6")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="db3af6ba-0138-ec47-7d49-84ad808794c6",
Synchronized="2019-08-30 22:23:19.0")
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

@XendraTrl(Identifier="2ce2298a-87a7-8594-fa43-5f38e0a52c0c")
public static String es_PE_FIELD_Line_Processed_Name="Procesado";

@XendraTrl(Identifier="2ce2298a-87a7-8594-fa43-5f38e0a52c0c")
public static String es_PE_FIELD_Line_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="2ce2298a-87a7-8594-fa43-5f38e0a52c0c")
public static String es_PE_FIELD_Line_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="6a55c5d1-8f53-82db-697b-39da77091c34",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="1=2",DisplayLength=1,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2ce2298a-87a7-8594-fa43-5f38e0a52c0c")
public static final String FIELDNAME_Line_Processed="2ce2298a-87a7-8594-fa43-5f38e0a52c0c";

@XendraTrl(Identifier="91ccf31e-9149-73ae-ce18-ba2cc5859b9a")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="91ccf31e-9149-73ae-ce18-ba2cc5859b9a",
Synchronized="2019-08-30 22:23:19.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
/** Set Quantity.
@param QtyEntered The Quantity Entered is based on the selected UoM */
public void setQtyEntered (BigDecimal QtyEntered)
{
set_Value (COLUMNNAME_QtyEntered, QtyEntered);
}
/** Get Quantity.
@return The Quantity Entered is based on the selected UoM */
public BigDecimal getQtyEntered() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QtyEntered);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="a6b0ada2-baaf-81e0-e290-1216501412b1")
public static String es_PE_FIELD_Line_Quantity_Name="Cantidad";

@XendraTrl(Identifier="a6b0ada2-baaf-81e0-e290-1216501412b1")
public static String es_PE_FIELD_Line_Quantity_Description="La cantidad incorporada se basa en la UM seleccionada.";

@XendraTrl(Identifier="a6b0ada2-baaf-81e0-e290-1216501412b1")
public static String es_PE_FIELD_Line_Quantity_Help="La cantidad incorporada se convierte a la cantidad baja de UM del producto";

@XendraField(AD_Column_ID="QtyEntered",IsCentrallyMaintained=true,
AD_Tab_ID="6a55c5d1-8f53-82db-697b-39da77091c34",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a6b0ada2-baaf-81e0-e290-1216501412b1")
public static final String FIELDNAME_Line_Quantity="a6b0ada2-baaf-81e0-e290-1216501412b1";

@XendraTrl(Identifier="53d022aa-2d23-11ff-0cf0-58a95a23cc73")
public static String es_PE_COLUMN_QtyEntered_Name="Quantity";

@XendraColumn(AD_Element_ID="70a37b06-986d-bf01-1ef9-23e214211841",ColumnName="QtyEntered",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="53d022aa-2d23-11ff-0cf0-58a95a23cc73",
Synchronized="2019-08-30 22:23:19.0")
/** Column name QtyEntered */
public static final String COLUMNNAME_QtyEntered = "QtyEntered";
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

@XendraTrl(Identifier="fd68cf56-9013-2fc7-2723-76f00f3a2b19")
public static String es_PE_FIELD_Line_ScrappedQuantity_Name="Cantidad de Desperdicio";

@XendraTrl(Identifier="fd68cf56-9013-2fc7-2723-76f00f3a2b19")
public static String es_PE_FIELD_Line_ScrappedQuantity_Description="La cantidad de desperdicio debido a las ediciones del A.C.";

@XendraField(AD_Column_ID="ScrappedQty",IsCentrallyMaintained=true,
AD_Tab_ID="6a55c5d1-8f53-82db-697b-39da77091c34",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fd68cf56-9013-2fc7-2723-76f00f3a2b19")
public static final String FIELDNAME_Line_ScrappedQuantity="fd68cf56-9013-2fc7-2723-76f00f3a2b19";

@XendraTrl(Identifier="f1f156cc-375e-e940-374c-b5b082d41c17")
public static String es_PE_COLUMN_ScrappedQty_Name="Cantidad de Desperdicio";

@XendraColumn(AD_Element_ID="40b91fb0-3206-0a29-4fd3-de7dde7e4d2c",ColumnName="ScrappedQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f1f156cc-375e-e940-374c-b5b082d41c17",
Synchronized="2019-08-30 22:23:19.0")
/** Column name ScrappedQty */
public static final String COLUMNNAME_ScrappedQty = "ScrappedQty";
/** Set Target Quantity.
@param TargetQty Target Movement Quantity */
public void setTargetQty (BigDecimal TargetQty)
{
if (TargetQty == null) throw new IllegalArgumentException ("TargetQty is mandatory.");
set_Value (COLUMNNAME_TargetQty, TargetQty);
}
/** Get Target Quantity.
@return Target Movement Quantity */
public BigDecimal getTargetQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TargetQty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="3a764e3e-6d35-8e4a-5df5-173102532902")
public static String es_PE_FIELD_Line_TargetQuantity_Name="Cantidad a recibir";

@XendraTrl(Identifier="3a764e3e-6d35-8e4a-5df5-173102532902")
public static String es_PE_FIELD_Line_TargetQuantity_Description="Movimientos de cantidad a recibir";

@XendraTrl(Identifier="3a764e3e-6d35-8e4a-5df5-173102532902")
public static String es_PE_FIELD_Line_TargetQuantity_Help="La cantidad que debio haber sido recibida";

@XendraField(AD_Column_ID="TargetQty",IsCentrallyMaintained=true,
AD_Tab_ID="6a55c5d1-8f53-82db-697b-39da77091c34",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3a764e3e-6d35-8e4a-5df5-173102532902")
public static final String FIELDNAME_Line_TargetQuantity="3a764e3e-6d35-8e4a-5df5-173102532902";

@XendraTrl(Identifier="be38de0d-cafb-69c4-66ef-fe18e0ff2f26")
public static String es_PE_COLUMN_TargetQty_Name="Cantidad a recibir";

@XendraColumn(AD_Element_ID="6fbec6d0-2133-ed61-f214-65f7655fd4a6",ColumnName="TargetQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="be38de0d-cafb-69c4-66ef-fe18e0ff2f26",
Synchronized="2019-08-30 22:23:19.0")
/** Column name TargetQty */
public static final String COLUMNNAME_TargetQty = "TargetQty";
}
