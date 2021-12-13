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
/** Generated Model for S_ResourceType
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_S_ResourceType extends PO
{
/** Standard Constructor
@param ctx context
@param S_ResourceType_ID id
@param trxName transaction
*/
public X_S_ResourceType (Properties ctx, int S_ResourceType_ID, String trxName)
{
super (ctx, S_ResourceType_ID, trxName);
/** if (S_ResourceType_ID == 0)
{
setAllowUoMFractions (false);	
// N
setC_TaxCategory_ID (0);
setC_UOM_ID (0);
setIsDateSlot (false);	
// N
setIsSingleAssignment (false);	
// N
setIsTimeSlot (false);	
// N
setM_Product_Category_ID (0);
setName (null);
setOnFriday (true);	
// Y
setOnMonday (true);	
// Y
setOnSaturday (false);	
// N
setOnSunday (false);	
// N
setOnThursday (true);	
// Y
setOnTuesday (true);	
// Y
setOnWednesday (true);	
// Y
setS_ResourceType_ID (0);
setValue (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_S_ResourceType (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=480 */
public static int Table_ID=MTable.getTable_ID("S_ResourceType");

@XendraTrl(Identifier="299f6462-6903-f4d9-6bb6-9fb7fcc27528")
public static String es_PE_TAB_ResourceType_Description="Mantener tipo de recursos";

@XendraTrl(Identifier="299f6462-6903-f4d9-6bb6-9fb7fcc27528")
public static String es_PE_TAB_ResourceType_Help="Mantiene los tipos de recursos y su disponibilidad principal.";

@XendraTrl(Identifier="299f6462-6903-f4d9-6bb6-9fb7fcc27528")
public static String es_PE_TAB_ResourceType_Name="Tipo de Recurso";
@XendraTab(Name="Resource Type",
Description="Maintain Resource Types",
Help="Maintain Resource types and their principal availability.",
AD_Window_ID="f64025bd-fe2b-130e-48ef-43a7fb763374",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="299f6462-6903-f4d9-6bb6-9fb7fcc27528",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ResourceType="299f6462-6903-f4d9-6bb6-9fb7fcc27528";

@XendraTrl(Identifier="44b76e3d-4b1d-8333-667c-3e6cc0e7c50e")
public static String es_PE_TABLE_S_ResourceType_Name="Tipo de Recurso";

@XendraTable(Name="Resource Type",AD_Package_ID="4bb6f0e4-f72d-dcbb-9183-88af0357143f",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="S_ResourceType",AccessLevel="3",AD_Window_ID="f64025bd-fe2b-130e-48ef-43a7fb763374",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=80,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.services",
Identifier="44b76e3d-4b1d-8333-667c-3e6cc0e7c50e",Synchronized="2020-03-03 21:40:11.0")
/** TableName=S_ResourceType */
public static final String Table_Name="S_ResourceType";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"S_ResourceType");

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
    Table_ID = MTable.getTable_ID("S_ResourceType");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_S_ResourceType[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Allow UoM Fractions.
@param AllowUoMFractions Allow Unit of Measure Fractions */
public void setAllowUoMFractions (boolean AllowUoMFractions)
{
set_Value (COLUMNNAME_AllowUoMFractions, Boolean.valueOf(AllowUoMFractions));
}
/** Get Allow UoM Fractions.
@return Allow Unit of Measure Fractions */
public boolean isAllowUoMFractions() 
{
Object oo = get_Value(COLUMNNAME_AllowUoMFractions);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="6f208ef8-9cea-81ed-4436-5744e9f422ea")
public static String es_PE_FIELD_ResourceType_AllowUoMFractions_Name="Permitir Fracciones de UM";

@XendraTrl(Identifier="6f208ef8-9cea-81ed-4436-5744e9f422ea")
public static String es_PE_FIELD_ResourceType_AllowUoMFractions_Description="Permitir fracciones de unidad de medida";

@XendraTrl(Identifier="6f208ef8-9cea-81ed-4436-5744e9f422ea")
public static String es_PE_FIELD_ResourceType_AllowUoMFractions_Help="Si se habilita; se puede entrar fracciones de la unidad de medida.";

@XendraField(AD_Column_ID="AllowUoMFractions",IsCentrallyMaintained=true,
AD_Tab_ID="299f6462-6903-f4d9-6bb6-9fb7fcc27528",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6f208ef8-9cea-81ed-4436-5744e9f422ea")
public static final String FIELDNAME_ResourceType_AllowUoMFractions="6f208ef8-9cea-81ed-4436-5744e9f422ea";

@XendraTrl(Identifier="0106e649-3a71-46ff-8f19-af5862e3cc59")
public static String es_PE_COLUMN_AllowUoMFractions_Name="Permitir fracciones de UM";

@XendraColumn(AD_Element_ID="3bda3b8a-848f-afff-d753-82005e7fe577",ColumnName="AllowUoMFractions",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0106e649-3a71-46ff-8f19-af5862e3cc59",
Synchronized="2019-08-30 22:24:16.0")
/** Column name AllowUoMFractions */
public static final String COLUMNNAME_AllowUoMFractions = "AllowUoMFractions";
/** Set Chargeable Quantity.
@param ChargeableQty Chargeable Quantity */
public void setChargeableQty (int ChargeableQty)
{
set_Value (COLUMNNAME_ChargeableQty, Integer.valueOf(ChargeableQty));
}
/** Get Chargeable Quantity.
@return Chargeable Quantity */
public int getChargeableQty() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_ChargeableQty);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a2bec9ab-5943-9368-36f8-01c6e6ba0825")
public static String es_PE_FIELD_ResourceType_ChargeableQuantity_Name="Cantidad Cargada";

@XendraField(AD_Column_ID="ChargeableQty",IsCentrallyMaintained=true,
AD_Tab_ID="299f6462-6903-f4d9-6bb6-9fb7fcc27528",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=20,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a2bec9ab-5943-9368-36f8-01c6e6ba0825")
public static final String FIELDNAME_ResourceType_ChargeableQuantity="a2bec9ab-5943-9368-36f8-01c6e6ba0825";

@XendraTrl(Identifier="95e43e23-5d31-936d-c799-462e0fd3c52a")
public static String es_PE_COLUMN_ChargeableQty_Name="Cantidad Cargada";

@XendraColumn(AD_Element_ID="00d5e80e-32d3-80fa-110e-ca5c02ab7858",ColumnName="ChargeableQty",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="95e43e23-5d31-936d-c799-462e0fd3c52a",
Synchronized="2019-08-30 22:24:16.0")
/** Column name ChargeableQty */
public static final String COLUMNNAME_ChargeableQty = "ChargeableQty";
/** Set Tax Category.
@param C_TaxCategory_ID Tax Category */
public void setC_TaxCategory_ID (int C_TaxCategory_ID)
{
if (C_TaxCategory_ID < 1) throw new IllegalArgumentException ("C_TaxCategory_ID is mandatory.");
set_Value (COLUMNNAME_C_TaxCategory_ID, Integer.valueOf(C_TaxCategory_ID));
}
/** Get Tax Category.
@return Tax Category */
public int getC_TaxCategory_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_TaxCategory_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c062d305-79d6-9788-c828-4bd8f6efd597")
public static String es_PE_FIELD_ResourceType_TaxCategory_Name="Categoría del Impuesto";

@XendraTrl(Identifier="c062d305-79d6-9788-c828-4bd8f6efd597")
public static String es_PE_FIELD_ResourceType_TaxCategory_Description="Categoría del Impuesto";

@XendraTrl(Identifier="c062d305-79d6-9788-c828-4bd8f6efd597")
public static String es_PE_FIELD_ResourceType_TaxCategory_Help="La categoría de impuesto proporciona un método de agrupación de impuestos similares. (Ej. Impuesto de ventas ó Impuesto al Valor Agregado)";

@XendraField(AD_Column_ID="C_TaxCategory_ID",IsCentrallyMaintained=true,
AD_Tab_ID="299f6462-6903-f4d9-6bb6-9fb7fcc27528",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c062d305-79d6-9788-c828-4bd8f6efd597")
public static final String FIELDNAME_ResourceType_TaxCategory="c062d305-79d6-9788-c828-4bd8f6efd597";

@XendraTrl(Identifier="d5600679-2711-3561-1c1f-79f796fda48b")
public static String es_PE_COLUMN_C_TaxCategory_ID_Name="Categoría del Impuesto";

@XendraColumn(AD_Element_ID="d52d1891-09d1-cd05-f9fa-46c801a8d9a6",ColumnName="C_TaxCategory_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d5600679-2711-3561-1c1f-79f796fda48b",
Synchronized="2019-08-30 22:24:16.0")
/** Column name C_TaxCategory_ID */
public static final String COLUMNNAME_C_TaxCategory_ID = "C_TaxCategory_ID";
/** Set UOM.
@param C_UOM_ID Unit of Measure */
public void setC_UOM_ID (int C_UOM_ID)
{
if (C_UOM_ID < 1) throw new IllegalArgumentException ("C_UOM_ID is mandatory.");
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

@XendraTrl(Identifier="9b623df8-a57c-0587-6652-14f6815efe55")
public static String es_PE_FIELD_ResourceType_UOM_Name="UM";

@XendraTrl(Identifier="9b623df8-a57c-0587-6652-14f6815efe55")
public static String es_PE_FIELD_ResourceType_UOM_Description="Unidad de Medida";

@XendraTrl(Identifier="9b623df8-a57c-0587-6652-14f6815efe55")
public static String es_PE_FIELD_ResourceType_UOM_Help="La UM define una unidad de medida única no monetaria";

@XendraField(AD_Column_ID="C_UOM_ID",IsCentrallyMaintained=true,
AD_Tab_ID="299f6462-6903-f4d9-6bb6-9fb7fcc27528",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9b623df8-a57c-0587-6652-14f6815efe55")
public static final String FIELDNAME_ResourceType_UOM="9b623df8-a57c-0587-6652-14f6815efe55";

@XendraTrl(Identifier="191f727b-dcfe-bc3f-b69b-e56678a0273c")
public static String es_PE_COLUMN_C_UOM_ID_Name="UM";

@XendraColumn(AD_Element_ID="d0345019-4fcc-44c8-4fd1-e38e3b4adeed",ColumnName="C_UOM_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="191f727b-dcfe-bc3f-b69b-e56678a0273c",
Synchronized="2019-08-30 22:24:16.0")
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

@XendraTrl(Identifier="1d9c7eba-c291-dc20-a002-58070586c2ab")
public static String es_PE_FIELD_ResourceType_Description_Name="Observación";

@XendraTrl(Identifier="1d9c7eba-c291-dc20-a002-58070586c2ab")
public static String es_PE_FIELD_ResourceType_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="1d9c7eba-c291-dc20-a002-58070586c2ab")
public static String es_PE_FIELD_ResourceType_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="299f6462-6903-f4d9-6bb6-9fb7fcc27528",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1d9c7eba-c291-dc20-a002-58070586c2ab")
public static final String FIELDNAME_ResourceType_Description="1d9c7eba-c291-dc20-a002-58070586c2ab";

@XendraTrl(Identifier="702211df-79c6-4241-7fe1-99c75019f862")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="702211df-79c6-4241-7fe1-99c75019f862",
Synchronized="2019-08-30 22:24:16.0")
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
@XendraTrl(Identifier="f6af5364-c7a8-436b-bfd9-2e0b09c7630a")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f6af5364-c7a8-436b-bfd9-2e0b09c7630a",
Synchronized="2019-08-30 22:24:16.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Day Slot.
@param IsDateSlot Resource has day slot availability */
public void setIsDateSlot (boolean IsDateSlot)
{
set_Value (COLUMNNAME_IsDateSlot, Boolean.valueOf(IsDateSlot));
}
/** Get Day Slot.
@return Resource has day slot availability */
public boolean isDateSlot() 
{
Object oo = get_Value(COLUMNNAME_IsDateSlot);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="924b527d-25f8-e2ef-0b70-822b1a78c913")
public static String es_PE_FIELD_ResourceType_DaySlot_Name="Día Disponible";

@XendraTrl(Identifier="924b527d-25f8-e2ef-0b70-822b1a78c913")
public static String es_PE_FIELD_ResourceType_DaySlot_Description="Recurso tiene disponibilidad del día";

@XendraTrl(Identifier="924b527d-25f8-e2ef-0b70-822b1a78c913")
public static String es_PE_FIELD_ResourceType_DaySlot_Help="Recurso solo esta disponible algunos días";

@XendraField(AD_Column_ID="IsDateSlot",IsCentrallyMaintained=true,
AD_Tab_ID="299f6462-6903-f4d9-6bb6-9fb7fcc27528",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="924b527d-25f8-e2ef-0b70-822b1a78c913")
public static final String FIELDNAME_ResourceType_DaySlot="924b527d-25f8-e2ef-0b70-822b1a78c913";

@XendraTrl(Identifier="15882e36-1433-73a5-9d23-3af00b254459")
public static String es_PE_COLUMN_IsDateSlot_Name="Día Disponible";

@XendraColumn(AD_Element_ID="8af64f73-680f-9c97-c285-c8fe3297c46f",ColumnName="IsDateSlot",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="15882e36-1433-73a5-9d23-3af00b254459",
Synchronized="2019-08-30 22:24:16.0")
/** Column name IsDateSlot */
public static final String COLUMNNAME_IsDateSlot = "IsDateSlot";
/** Set Single Assignment only.
@param IsSingleAssignment Only one assignment at a time (no double-booking or overlapping) */
public void setIsSingleAssignment (boolean IsSingleAssignment)
{
set_Value (COLUMNNAME_IsSingleAssignment, Boolean.valueOf(IsSingleAssignment));
}
/** Get Single Assignment only.
@return Only one assignment at a time (no double-booking or overlapping) */
public boolean isSingleAssignment() 
{
Object oo = get_Value(COLUMNNAME_IsSingleAssignment);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="5a726cb4-6ae3-5495-7676-9cb2f6bdd30e")
public static String es_PE_FIELD_ResourceType_SingleAssignmentOnly_Name="Asignación Única solamente";

@XendraTrl(Identifier="5a726cb4-6ae3-5495-7676-9cb2f6bdd30e")
public static String es_PE_FIELD_ResourceType_SingleAssignmentOnly_Description="Solamente una asignación a la vez (No se puede tener asignaciones dobles de tiempo o asignaciones concurrentes)";

@XendraTrl(Identifier="5a726cb4-6ae3-5495-7676-9cb2f6bdd30e")
public static String es_PE_FIELD_ResourceType_SingleAssignmentOnly_Help="Si se selecciona; solo se puede tener una asignación a la vez para un momento en el tiempo. No es posible tener asignaciones concurrentes.";

@XendraField(AD_Column_ID="IsSingleAssignment",IsCentrallyMaintained=true,
AD_Tab_ID="299f6462-6903-f4d9-6bb6-9fb7fcc27528",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5a726cb4-6ae3-5495-7676-9cb2f6bdd30e")
public static final String FIELDNAME_ResourceType_SingleAssignmentOnly="5a726cb4-6ae3-5495-7676-9cb2f6bdd30e";

@XendraTrl(Identifier="3949b46c-28d9-7011-9ba0-d42ca622d0fd")
public static String es_PE_COLUMN_IsSingleAssignment_Name="Asignación Única solamente";

@XendraColumn(AD_Element_ID="949b32dc-515e-067b-4de6-44fac2e89deb",ColumnName="IsSingleAssignment",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3949b46c-28d9-7011-9ba0-d42ca622d0fd",
Synchronized="2019-08-30 22:24:16.0")
/** Column name IsSingleAssignment */
public static final String COLUMNNAME_IsSingleAssignment = "IsSingleAssignment";
/** Set Time Slot.
@param IsTimeSlot Resource has time slot availability */
public void setIsTimeSlot (boolean IsTimeSlot)
{
set_Value (COLUMNNAME_IsTimeSlot, Boolean.valueOf(IsTimeSlot));
}
/** Get Time Slot.
@return Resource has time slot availability */
public boolean isTimeSlot() 
{
Object oo = get_Value(COLUMNNAME_IsTimeSlot);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="63398528-51aa-1caa-8df8-224664003192")
public static String es_PE_FIELD_ResourceType_TimeSlot_Name="Tiempo Disponible";

@XendraTrl(Identifier="63398528-51aa-1caa-8df8-224664003192")
public static String es_PE_FIELD_ResourceType_TimeSlot_Description="Indica si el recurso tiene tiempo disponible";

@XendraTrl(Identifier="63398528-51aa-1caa-8df8-224664003192")
public static String es_PE_FIELD_ResourceType_TimeSlot_Help="Indica si el recurso esta disponible solo en algún momento";

@XendraField(AD_Column_ID="IsTimeSlot",IsCentrallyMaintained=true,
AD_Tab_ID="299f6462-6903-f4d9-6bb6-9fb7fcc27528",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="63398528-51aa-1caa-8df8-224664003192")
public static final String FIELDNAME_ResourceType_TimeSlot="63398528-51aa-1caa-8df8-224664003192";

@XendraTrl(Identifier="862d29c1-58eb-2b74-96a9-7a25a3ca41d1")
public static String es_PE_COLUMN_IsTimeSlot_Name="Tiempo Disponible";

@XendraColumn(AD_Element_ID="3083b67e-974d-0de5-4e83-3720049122fc",ColumnName="IsTimeSlot",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="862d29c1-58eb-2b74-96a9-7a25a3ca41d1",
Synchronized="2019-08-30 22:24:16.0")
/** Column name IsTimeSlot */
public static final String COLUMNNAME_IsTimeSlot = "IsTimeSlot";
/** Set Product Category.
@param M_Product_Category_ID Category of a Product */
public void setM_Product_Category_ID (int M_Product_Category_ID)
{
if (M_Product_Category_ID < 1) throw new IllegalArgumentException ("M_Product_Category_ID is mandatory.");
set_Value (COLUMNNAME_M_Product_Category_ID, Integer.valueOf(M_Product_Category_ID));
}
/** Get Product Category.
@return Category of a Product */
public int getM_Product_Category_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_Category_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b5b03874-cd72-307c-09aa-ebf2d32f39a0")
public static String es_PE_FIELD_ResourceType_ProductCategory_Name="Categoría del Producto";

@XendraTrl(Identifier="b5b03874-cd72-307c-09aa-ebf2d32f39a0")
public static String es_PE_FIELD_ResourceType_ProductCategory_Description="Categoría de la que este producto es parte";

@XendraTrl(Identifier="b5b03874-cd72-307c-09aa-ebf2d32f39a0")
public static String es_PE_FIELD_ResourceType_ProductCategory_Help="Identifica la categoría a la que pertenece este producto. Las categorías del producto son usadas para el cálculo de precios";

@XendraField(AD_Column_ID="M_Product_Category_ID",IsCentrallyMaintained=true,
AD_Tab_ID="299f6462-6903-f4d9-6bb6-9fb7fcc27528",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b5b03874-cd72-307c-09aa-ebf2d32f39a0")
public static final String FIELDNAME_ResourceType_ProductCategory="b5b03874-cd72-307c-09aa-ebf2d32f39a0";

@XendraTrl(Identifier="07313f8b-3167-21c4-905a-276ff63c1af5")
public static String es_PE_COLUMN_M_Product_Category_ID_Name="Categoría del Producto";

@XendraColumn(AD_Element_ID="80d3e0bb-473b-67d4-42d5-1d776006a69c",
ColumnName="M_Product_Category_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="07313f8b-3167-21c4-905a-276ff63c1af5",Synchronized="2019-08-30 22:24:16.0")
/** Column name M_Product_Category_ID */
public static final String COLUMNNAME_M_Product_Category_ID = "M_Product_Category_ID";
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

@XendraTrl(Identifier="7b1c284e-97a6-8211-f8fc-d488189d991c")
public static String es_PE_FIELD_ResourceType_Name_Name="Nombre";

@XendraTrl(Identifier="7b1c284e-97a6-8211-f8fc-d488189d991c")
public static String es_PE_FIELD_ResourceType_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="7b1c284e-97a6-8211-f8fc-d488189d991c")
public static String es_PE_FIELD_ResourceType_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="299f6462-6903-f4d9-6bb6-9fb7fcc27528",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7b1c284e-97a6-8211-f8fc-d488189d991c")
public static final String FIELDNAME_ResourceType_Name="7b1c284e-97a6-8211-f8fc-d488189d991c";

@XendraTrl(Identifier="bfe73bcc-388a-1c9f-0063-d87e5b7ab805")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bfe73bcc-388a-1c9f-0063-d87e5b7ab805",
Synchronized="2019-08-30 22:24:16.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Friday.
@param OnFriday Available on Fridays */
public void setOnFriday (boolean OnFriday)
{
set_Value (COLUMNNAME_OnFriday, Boolean.valueOf(OnFriday));
}
/** Get Friday.
@return Available on Fridays */
public boolean isOnFriday() 
{
Object oo = get_Value(COLUMNNAME_OnFriday);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="174b2da4-b809-8f35-9745-f2f5b1ec5f22")
public static String es_PE_FIELD_ResourceType_Friday_Name="Viernes";

@XendraTrl(Identifier="174b2da4-b809-8f35-9745-f2f5b1ec5f22")
public static String es_PE_FIELD_ResourceType_Friday_Description="Disponible solo los viernes";

@XendraField(AD_Column_ID="OnFriday",IsCentrallyMaintained=true,
AD_Tab_ID="299f6462-6903-f4d9-6bb6-9fb7fcc27528",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsDateSlot@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="174b2da4-b809-8f35-9745-f2f5b1ec5f22")
public static final String FIELDNAME_ResourceType_Friday="174b2da4-b809-8f35-9745-f2f5b1ec5f22";

@XendraTrl(Identifier="8c84a06b-905a-42fd-eae9-b878832a5a6f")
public static String es_PE_COLUMN_OnFriday_Name="Viernes";

@XendraColumn(AD_Element_ID="b48d0dde-cf3f-04c1-43fc-fea10282b017",ColumnName="OnFriday",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8c84a06b-905a-42fd-eae9-b878832a5a6f",
Synchronized="2019-08-30 22:24:16.0")
/** Column name OnFriday */
public static final String COLUMNNAME_OnFriday = "OnFriday";
/** Set Monday.
@param OnMonday Available on Mondays */
public void setOnMonday (boolean OnMonday)
{
set_Value (COLUMNNAME_OnMonday, Boolean.valueOf(OnMonday));
}
/** Get Monday.
@return Available on Mondays */
public boolean isOnMonday() 
{
Object oo = get_Value(COLUMNNAME_OnMonday);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="8bdd9afd-16f8-a43b-6fd3-e693412a0097")
public static String es_PE_FIELD_ResourceType_Monday_Name="Lunes";

@XendraTrl(Identifier="8bdd9afd-16f8-a43b-6fd3-e693412a0097")
public static String es_PE_FIELD_ResourceType_Monday_Description="Disponible solo los Lunes";

@XendraField(AD_Column_ID="OnMonday",IsCentrallyMaintained=true,
AD_Tab_ID="299f6462-6903-f4d9-6bb6-9fb7fcc27528",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsDateSlot@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8bdd9afd-16f8-a43b-6fd3-e693412a0097")
public static final String FIELDNAME_ResourceType_Monday="8bdd9afd-16f8-a43b-6fd3-e693412a0097";

@XendraTrl(Identifier="2d6b9481-4208-f259-c5fe-8b232ab14fa6")
public static String es_PE_COLUMN_OnMonday_Name="Lunes";

@XendraColumn(AD_Element_ID="47062be2-3eb4-a496-3910-6b134c369f87",ColumnName="OnMonday",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2d6b9481-4208-f259-c5fe-8b232ab14fa6",
Synchronized="2019-08-30 22:24:16.0")
/** Column name OnMonday */
public static final String COLUMNNAME_OnMonday = "OnMonday";
/** Set Saturday.
@param OnSaturday Available on Saturday */
public void setOnSaturday (boolean OnSaturday)
{
set_Value (COLUMNNAME_OnSaturday, Boolean.valueOf(OnSaturday));
}
/** Get Saturday.
@return Available on Saturday */
public boolean isOnSaturday() 
{
Object oo = get_Value(COLUMNNAME_OnSaturday);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="98ba082d-77fc-70ea-909b-053bc5ebcb1b")
public static String es_PE_FIELD_ResourceType_Saturday_Name="Sábado";

@XendraTrl(Identifier="98ba082d-77fc-70ea-909b-053bc5ebcb1b")
public static String es_PE_FIELD_ResourceType_Saturday_Description="Disponible solo los Sábados";

@XendraField(AD_Column_ID="OnSaturday",IsCentrallyMaintained=true,
AD_Tab_ID="299f6462-6903-f4d9-6bb6-9fb7fcc27528",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsDateSlot@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="98ba082d-77fc-70ea-909b-053bc5ebcb1b")
public static final String FIELDNAME_ResourceType_Saturday="98ba082d-77fc-70ea-909b-053bc5ebcb1b";

@XendraTrl(Identifier="5a9f0bee-d483-18d5-1b4b-fdcc86c55382")
public static String es_PE_COLUMN_OnSaturday_Name="Sábado";

@XendraColumn(AD_Element_ID="dad68a73-edf7-1a52-7414-dfdca8f9fd90",ColumnName="OnSaturday",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5a9f0bee-d483-18d5-1b4b-fdcc86c55382",
Synchronized="2019-08-30 22:24:16.0")
/** Column name OnSaturday */
public static final String COLUMNNAME_OnSaturday = "OnSaturday";
/** Set Sunday.
@param OnSunday Available on Sundays */
public void setOnSunday (boolean OnSunday)
{
set_Value (COLUMNNAME_OnSunday, Boolean.valueOf(OnSunday));
}
/** Get Sunday.
@return Available on Sundays */
public boolean isOnSunday() 
{
Object oo = get_Value(COLUMNNAME_OnSunday);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="827f8e32-4c4e-225e-dc1e-cd3336f256aa")
public static String es_PE_FIELD_ResourceType_Sunday_Name="Domingo";

@XendraTrl(Identifier="827f8e32-4c4e-225e-dc1e-cd3336f256aa")
public static String es_PE_FIELD_ResourceType_Sunday_Description="Disponible solo los domingos";

@XendraField(AD_Column_ID="OnSunday",IsCentrallyMaintained=true,
AD_Tab_ID="299f6462-6903-f4d9-6bb6-9fb7fcc27528",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsDateSlot@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="827f8e32-4c4e-225e-dc1e-cd3336f256aa")
public static final String FIELDNAME_ResourceType_Sunday="827f8e32-4c4e-225e-dc1e-cd3336f256aa";

@XendraTrl(Identifier="5b38d77e-414b-0f30-5646-b01f353d2f42")
public static String es_PE_COLUMN_OnSunday_Name="Domingo";

@XendraColumn(AD_Element_ID="88a0f08b-4471-14e0-4677-efe2aecfff68",ColumnName="OnSunday",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5b38d77e-414b-0f30-5646-b01f353d2f42",
Synchronized="2019-08-30 22:24:16.0")
/** Column name OnSunday */
public static final String COLUMNNAME_OnSunday = "OnSunday";
/** Set Thursday.
@param OnThursday Available on Thursdays */
public void setOnThursday (boolean OnThursday)
{
set_Value (COLUMNNAME_OnThursday, Boolean.valueOf(OnThursday));
}
/** Get Thursday.
@return Available on Thursdays */
public boolean isOnThursday() 
{
Object oo = get_Value(COLUMNNAME_OnThursday);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="7ef1db22-5622-2c55-4fb9-35472df84206")
public static String es_PE_FIELD_ResourceType_Thursday_Name="Jueves";

@XendraTrl(Identifier="7ef1db22-5622-2c55-4fb9-35472df84206")
public static String es_PE_FIELD_ResourceType_Thursday_Description="Disponible solo los Jueves";

@XendraField(AD_Column_ID="OnThursday",IsCentrallyMaintained=true,
AD_Tab_ID="299f6462-6903-f4d9-6bb6-9fb7fcc27528",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsDateSlot@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7ef1db22-5622-2c55-4fb9-35472df84206")
public static final String FIELDNAME_ResourceType_Thursday="7ef1db22-5622-2c55-4fb9-35472df84206";

@XendraTrl(Identifier="da4cd30b-b3ca-2896-e411-1acdf2a7fbcc")
public static String es_PE_COLUMN_OnThursday_Name="Jueves";

@XendraColumn(AD_Element_ID="3b9a627b-1e5c-7294-7abf-d92411fb6b61",ColumnName="OnThursday",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="da4cd30b-b3ca-2896-e411-1acdf2a7fbcc",
Synchronized="2019-08-30 22:24:16.0")
/** Column name OnThursday */
public static final String COLUMNNAME_OnThursday = "OnThursday";
/** Set Tuesday.
@param OnTuesday Available on Tuesdays */
public void setOnTuesday (boolean OnTuesday)
{
set_Value (COLUMNNAME_OnTuesday, Boolean.valueOf(OnTuesday));
}
/** Get Tuesday.
@return Available on Tuesdays */
public boolean isOnTuesday() 
{
Object oo = get_Value(COLUMNNAME_OnTuesday);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="0df70644-192f-063e-78a6-1954d26861c1")
public static String es_PE_FIELD_ResourceType_Tuesday_Name="Martes";

@XendraTrl(Identifier="0df70644-192f-063e-78a6-1954d26861c1")
public static String es_PE_FIELD_ResourceType_Tuesday_Description="Disponible solo los martes";

@XendraField(AD_Column_ID="OnTuesday",IsCentrallyMaintained=true,
AD_Tab_ID="299f6462-6903-f4d9-6bb6-9fb7fcc27528",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsDateSlot@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0df70644-192f-063e-78a6-1954d26861c1")
public static final String FIELDNAME_ResourceType_Tuesday="0df70644-192f-063e-78a6-1954d26861c1";

@XendraTrl(Identifier="3b6f9d3f-e455-5935-294c-3fd5ddd1cc13")
public static String es_PE_COLUMN_OnTuesday_Name="Martes";

@XendraColumn(AD_Element_ID="225ffab7-2af2-fe39-5821-3648aa7db913",ColumnName="OnTuesday",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3b6f9d3f-e455-5935-294c-3fd5ddd1cc13",
Synchronized="2019-08-30 22:24:16.0")
/** Column name OnTuesday */
public static final String COLUMNNAME_OnTuesday = "OnTuesday";
/** Set Wednesday.
@param OnWednesday Available on Wednesdays */
public void setOnWednesday (boolean OnWednesday)
{
set_Value (COLUMNNAME_OnWednesday, Boolean.valueOf(OnWednesday));
}
/** Get Wednesday.
@return Available on Wednesdays */
public boolean isOnWednesday() 
{
Object oo = get_Value(COLUMNNAME_OnWednesday);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="19ad9285-31bf-4d41-2bfb-c7f99b729dfd")
public static String es_PE_FIELD_ResourceType_Wednesday_Name="Miércoles";

@XendraTrl(Identifier="19ad9285-31bf-4d41-2bfb-c7f99b729dfd")
public static String es_PE_FIELD_ResourceType_Wednesday_Description="Disponible solo los miércoles";

@XendraField(AD_Column_ID="OnWednesday",IsCentrallyMaintained=true,
AD_Tab_ID="299f6462-6903-f4d9-6bb6-9fb7fcc27528",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsDateSlot@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="19ad9285-31bf-4d41-2bfb-c7f99b729dfd")
public static final String FIELDNAME_ResourceType_Wednesday="19ad9285-31bf-4d41-2bfb-c7f99b729dfd";

@XendraTrl(Identifier="2b951cf6-0070-78be-6af5-3654fbb2e3e7")
public static String es_PE_COLUMN_OnWednesday_Name="Miércoles";

@XendraColumn(AD_Element_ID="4d1edfb8-f525-c7b5-2d0d-0245f1f8eefe",ColumnName="OnWednesday",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2b951cf6-0070-78be-6af5-3654fbb2e3e7",
Synchronized="2019-08-30 22:24:16.0")
/** Column name OnWednesday */
public static final String COLUMNNAME_OnWednesday = "OnWednesday";
/** Set Resource Type.
@param S_ResourceType_ID Resource Type */
public void setS_ResourceType_ID (int S_ResourceType_ID)
{
if (S_ResourceType_ID < 1) throw new IllegalArgumentException ("S_ResourceType_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_S_ResourceType_ID, Integer.valueOf(S_ResourceType_ID));
}
/** Get Resource Type.
@return Resource Type */
public int getS_ResourceType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_S_ResourceType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="71e78169-7fdb-61a0-8131-9139cac1a578")
public static String es_PE_FIELD_ResourceType_ResourceType_Name="Tipo de Recurso";

@XendraField(AD_Column_ID="S_ResourceType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="299f6462-6903-f4d9-6bb6-9fb7fcc27528",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="71e78169-7fdb-61a0-8131-9139cac1a578")
public static final String FIELDNAME_ResourceType_ResourceType="71e78169-7fdb-61a0-8131-9139cac1a578";
/** Column name S_ResourceType_ID */
public static final String COLUMNNAME_S_ResourceType_ID = "S_ResourceType_ID";
/** Set Slot End.
@param TimeSlotEnd Time when timeslot ends */
public void setTimeSlotEnd (Timestamp TimeSlotEnd)
{
set_Value (COLUMNNAME_TimeSlotEnd, TimeSlotEnd);
}
/** Get Slot End.
@return Time when timeslot ends */
public Timestamp getTimeSlotEnd() 
{
return (Timestamp)get_Value(COLUMNNAME_TimeSlotEnd);
}

@XendraTrl(Identifier="fab1965d-4835-ba05-1898-8dd6cb2d3359")
public static String es_PE_FIELD_ResourceType_SlotEnd_Name="Final";

@XendraTrl(Identifier="fab1965d-4835-ba05-1898-8dd6cb2d3359")
public static String es_PE_FIELD_ResourceType_SlotEnd_Description="Momento cuando el tiempo disponible finaliza";

@XendraTrl(Identifier="fab1965d-4835-ba05-1898-8dd6cb2d3359")
public static String es_PE_FIELD_ResourceType_SlotEnd_Help="Momento cuando el tiempo disponible termina";

@XendraField(AD_Column_ID="TimeSlotEnd",IsCentrallyMaintained=true,
AD_Tab_ID="299f6462-6903-f4d9-6bb6-9fb7fcc27528",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsTimeSlot@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fab1965d-4835-ba05-1898-8dd6cb2d3359")
public static final String FIELDNAME_ResourceType_SlotEnd="fab1965d-4835-ba05-1898-8dd6cb2d3359";

@XendraTrl(Identifier="211acb83-ad1b-84b7-b602-55e6b99fec47")
public static String es_PE_COLUMN_TimeSlotEnd_Name="Final";

@XendraColumn(AD_Element_ID="b47ea948-73ba-8e28-5821-7acac75fbf83",ColumnName="TimeSlotEnd",
AD_Reference_ID=24,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="211acb83-ad1b-84b7-b602-55e6b99fec47",
Synchronized="2019-08-30 22:24:16.0")
/** Column name TimeSlotEnd */
public static final String COLUMNNAME_TimeSlotEnd = "TimeSlotEnd";
/** Set Slot Start.
@param TimeSlotStart Time when timeslot starts */
public void setTimeSlotStart (Timestamp TimeSlotStart)
{
set_Value (COLUMNNAME_TimeSlotStart, TimeSlotStart);
}
/** Get Slot Start.
@return Time when timeslot starts */
public Timestamp getTimeSlotStart() 
{
return (Timestamp)get_Value(COLUMNNAME_TimeSlotStart);
}

@XendraTrl(Identifier="f6c00ea0-9f52-b6c6-1f22-8d66cf509642")
public static String es_PE_FIELD_ResourceType_SlotStart_Name="Inicio";

@XendraTrl(Identifier="f6c00ea0-9f52-b6c6-1f22-8d66cf509642")
public static String es_PE_FIELD_ResourceType_SlotStart_Description="Momento cuando el tiempo disponible comienza";

@XendraTrl(Identifier="f6c00ea0-9f52-b6c6-1f22-8d66cf509642")
public static String es_PE_FIELD_ResourceType_SlotStart_Help="Momento cuando el tiempo disponible comienza";

@XendraField(AD_Column_ID="TimeSlotStart",IsCentrallyMaintained=true,
AD_Tab_ID="299f6462-6903-f4d9-6bb6-9fb7fcc27528",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsTimeSlot@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f6c00ea0-9f52-b6c6-1f22-8d66cf509642")
public static final String FIELDNAME_ResourceType_SlotStart="f6c00ea0-9f52-b6c6-1f22-8d66cf509642";

@XendraTrl(Identifier="497fbe90-6822-0624-bc59-c9295d88c7c3")
public static String es_PE_COLUMN_TimeSlotStart_Name="Inicio";

@XendraColumn(AD_Element_ID="4fb8e1f8-07d5-2b1e-bda9-b094b7318a3d",ColumnName="TimeSlotStart",
AD_Reference_ID=24,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="497fbe90-6822-0624-bc59-c9295d88c7c3",
Synchronized="2019-08-30 22:24:16.0")
/** Column name TimeSlotStart */
public static final String COLUMNNAME_TimeSlotStart = "TimeSlotStart";
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
@XendraTrl(Identifier="4e72d0d0-157d-4248-3aa0-b78720ef3e34")
public static String es_PE_FIELD_ResourceType_SearchKey_Name="Clave de Búsqueda";

@XendraTrl(Identifier="4e72d0d0-157d-4248-3aa0-b78720ef3e34")
public static String es_PE_FIELD_ResourceType_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="4e72d0d0-157d-4248-3aa0-b78720ef3e34")
public static String es_PE_FIELD_ResourceType_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="299f6462-6903-f4d9-6bb6-9fb7fcc27528",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=50,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4e72d0d0-157d-4248-3aa0-b78720ef3e34")
public static final String FIELDNAME_ResourceType_SearchKey="4e72d0d0-157d-4248-3aa0-b78720ef3e34";

@XendraTrl(Identifier="662db575-1e8b-2848-ba44-2aa406af0bdc")
public static String es_PE_COLUMN_Value_Name="Clave de Búsqueda";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="662db575-1e8b-2848-ba44-2aa406af0bdc",
Synchronized="2019-08-30 22:24:16.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
}
