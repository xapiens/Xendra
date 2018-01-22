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
/** Generated Model for M_MovementLine
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_MovementLine extends PO
{
/** Standard Constructor
@param ctx context
@param M_MovementLine_ID id
@param trxName transaction
*/
public X_M_MovementLine (Properties ctx, int M_MovementLine_ID, String trxName)
{
super (ctx, M_MovementLine_ID, trxName);
/** if (M_MovementLine_ID == 0)
{
setLine (0);	
// @SQL=SELECT COALESCE(MAX(Line),0)+10 AS DefaultValue FROM M_MovementLine WHERE M_Movement_ID=@M_Movement_ID@
setM_AttributeSetInstance_ID (0);
setM_Locator_ID (0);	
// @M_Locator_ID@
setM_LocatorTo_ID (0);	
// @M_LocatorTo_ID@
setM_Movement_ID (0);
setM_MovementLine_ID (0);
setMovementQty (Env.ZERO);	
// 1
setM_Product_ID (0);
setProcessed (false);	
// N
setTargetQty (Env.ZERO);	
// 0
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_MovementLine (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=324 */
public static int Table_ID=MTable.getTable_ID("M_MovementLine");

@XendraTrl(Identifier="f426a83e-d097-63fe-377c-cc56d64bb45b")
public static String es_PE_TAB_MoveLine_Description="Definir Ìtem del Movimiento";

@XendraTrl(Identifier="f426a83e-d097-63fe-377c-cc56d64bb45b")
public static String es_PE_TAB_MoveLine_Name="Ìtem del Movimiento";

@XendraTrl(Identifier="f426a83e-d097-63fe-377c-cc56d64bb45b")
public static String es_PE_TAB_MoveLine_Help="La pestaña Ìtem del Movimiento define el producto y cantidad que debe ser movida y la localización desde y hacia la cual se mueve.";

@XendraTab(Name="Move Line",Description="Enter Inventory Movement Line",
Help="The Move Line Tab defines the product and quantity to be moved and the location it is moving from and to.  ",
AD_Window_ID="d846fe0a-02ec-74b9-60c7-18dce41e7a56",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="f426a83e-d097-63fe-377c-cc56d64bb45b",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_MoveLine="f426a83e-d097-63fe-377c-cc56d64bb45b";

@XendraTrl(Identifier="a2b02ecd-3072-0695-641f-25313b5323f0")
public static String es_PE_TABLE_M_MovementLine_Name="Línea del Movimiento";

@XendraTable(Name="Move Line",Description="Inventory Move document Line",Help="",
TableName="M_MovementLine",AccessLevel="1",AD_Window_ID="d846fe0a-02ec-74b9-60c7-18dce41e7a56",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=135,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="a2b02ecd-3072-0695-641f-25313b5323f0",Synchronized="2017-08-16 11:43:21.0")
/** TableName=M_MovementLine */
public static final String Table_Name="M_MovementLine";


@XendraIndex(Name="m_movementline_carding",Identifier="d9b23e3d-13eb-82fa-361d-5d1f946ca529",
Column_Names="m_movement_id, m_product_id, (COALESCE(iscosted, 'N'::character varying)), isactive",
IsUnique="false",TableIdentifier="d9b23e3d-13eb-82fa-361d-5d1f946ca529",
Synchronized="2014-06-03 23:07:58.0")
public static final String INDEXNAME_m_movementline_carding = "d9b23e3d-13eb-82fa-361d-5d1f946ca529";


@XendraIndex(Name="m_movementline_movement",Identifier="d93f0f4c-73d1-f4a0-67cb-37a5b0696537",
Column_Names="m_movement_id",IsUnique="false",
TableIdentifier="d93f0f4c-73d1-f4a0-67cb-37a5b0696537",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_m_movementline_movement = "d93f0f4c-73d1-f4a0-67cb-37a5b0696537";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_MovementLine");

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
    Table_ID = MTable.getTable_ID("M_MovementLine");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_MovementLine[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Confirmed Quantity.
@param ConfirmedQty Confirmation of a received quantity */
public void setConfirmedQty (BigDecimal ConfirmedQty)
{
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

@XendraTrl(Identifier="4369610d-d619-56d7-d439-8c152081dd98")
public static String es_PE_FIELD_MoveLine_ConfirmedQuantity_Description="Confirmación de la cantidad recibida";

@XendraTrl(Identifier="4369610d-d619-56d7-d439-8c152081dd98")
public static String es_PE_FIELD_MoveLine_ConfirmedQuantity_Help="Confirmación de la cantidad recibida";

@XendraTrl(Identifier="4369610d-d619-56d7-d439-8c152081dd98")
public static String es_PE_FIELD_MoveLine_ConfirmedQuantity_Name="Cantidad Confirmada";

@XendraField(AD_Column_ID="ConfirmedQty",IsCentrallyMaintained=true,
AD_Tab_ID="f426a83e-d097-63fe-377c-cc56d64bb45b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4369610d-d619-56d7-d439-8c152081dd98")
public static final String FIELDNAME_MoveLine_ConfirmedQuantity="4369610d-d619-56d7-d439-8c152081dd98";

@XendraTrl(Identifier="d551c073-adac-f1ad-c12f-6a70ded6527d")
public static String es_PE_COLUMN_ConfirmedQty_Name="Cantidad Confirmada";

@XendraColumn(AD_Element_ID="e612ae07-ebb5-65be-fcbd-a37419fb113f",ColumnName="ConfirmedQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d551c073-adac-f1ad-c12f-6a70ded6527d",
Synchronized="2017-08-05 16:55:17.0")
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

@XendraTrl(Identifier="f2fdf572-92a6-7d74-8a8a-ce270a1be2ce")
public static String es_PE_FIELD_MoveLine_UOM_Description="Unidad de Medida";

@XendraTrl(Identifier="f2fdf572-92a6-7d74-8a8a-ce270a1be2ce")
public static String es_PE_FIELD_MoveLine_UOM_Help="La UM define una unidad de medida única no monetaria";

@XendraTrl(Identifier="f2fdf572-92a6-7d74-8a8a-ce270a1be2ce")
public static String es_PE_FIELD_MoveLine_UOM_Name="UM";
@XendraField(AD_Column_ID="C_UOM_ID",
IsCentrallyMaintained=true,AD_Tab_ID="f426a83e-d097-63fe-377c-cc56d64bb45b",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=130,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="f2fdf572-92a6-7d74-8a8a-ce270a1be2ce")
public static final String FIELDNAME_MoveLine_UOM="f2fdf572-92a6-7d74-8a8a-ce270a1be2ce";

@XendraTrl(Identifier="27a0e866-482a-eef0-65e9-661bfe4eb6b0")
public static String es_PE_COLUMN_C_UOM_ID_Name="UOM";

@XendraColumn(AD_Element_ID="d0345019-4fcc-44c8-4fd1-e38e3b4adeed",ColumnName="C_UOM_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="107d46fd-952f-7ad3-6b0d-c74906c7b323",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutMovementLine.qty",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="27a0e866-482a-eef0-65e9-661bfe4eb6b0",
Synchronized="2017-08-05 16:55:17.0")
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

@XendraTrl(Identifier="e051e10f-987b-52a8-81f9-ff54f9633c43")
public static String es_PE_FIELD_MoveLine_Description_Description="Descripción corta opcional del registro";

@XendraTrl(Identifier="e051e10f-987b-52a8-81f9-ff54f9633c43")
public static String es_PE_FIELD_MoveLine_Description_Help="Una descripción esta limitada a 255 caracteres";

@XendraTrl(Identifier="e051e10f-987b-52a8-81f9-ff54f9633c43")
public static String es_PE_FIELD_MoveLine_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="f426a83e-d097-63fe-377c-cc56d64bb45b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e051e10f-987b-52a8-81f9-ff54f9633c43")
public static final String FIELDNAME_MoveLine_Description="e051e10f-987b-52a8-81f9-ff54f9633c43";

@XendraTrl(Identifier="1ae95eb5-e738-2cd3-aeca-a4f388d7cb79")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=true,ColumnSQL="",
IsAllowLogging=false,Identifier="1ae95eb5-e738-2cd3-aeca-a4f388d7cb79",
Synchronized="2017-08-05 16:55:17.0")
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
@XendraTrl(Identifier="")
public static String es_PE_FIELD_MoveLine_Identifier_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="f426a83e-d097-63fe-377c-cc56d64bb45b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=36,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2015-11-23 15:26:25.0",
Identifier="")
public static final String FIELDNAME_MoveLine_Identifier="";

@XendraTrl(Identifier="3e6ffd15-86ef-48d5-ad4b-f64c056e24a1")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3e6ffd15-86ef-48d5-ad4b-f64c056e24a1",
Synchronized="2017-08-05 16:55:17.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set IsCosted.
@param IsCosted IsCosted */
public void setIsCosted (boolean IsCosted)
{
set_Value (COLUMNNAME_IsCosted, Boolean.valueOf(IsCosted));
}
/** Get IsCosted.
@return IsCosted */
public boolean isCosted() 
{
Object oo = get_Value(COLUMNNAME_IsCosted);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="")
public static String es_PE_FIELD_MoveLine_IsCosted_Name="iscosted";

@XendraField(AD_Column_ID="IsCosted",IsCentrallyMaintained=true,
AD_Tab_ID="f426a83e-d097-63fe-377c-cc56d64bb45b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2015-11-23 15:26:25.0",
Identifier="")
public static final String FIELDNAME_MoveLine_IsCosted="";

@XendraTrl(Identifier="45fcee8f-6f82-24b2-8722-0725c63a2320")
public static String es_PE_COLUMN_IsCosted_Name="IsCosted";

@XendraColumn(AD_Element_ID="1d2cca33-7933-6933-e8cd-036ca4cb806e",ColumnName="IsCosted",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="45fcee8f-6f82-24b2-8722-0725c63a2320",
Synchronized="2012-07-11 00:00:00.0")
/** Column name IsCosted */
public static final String COLUMNNAME_IsCosted = "IsCosted";
/** Set Line No.
@param Line Unique line for this document */
public void setLine (int Line)
{
set_Value (COLUMNNAME_Line, Integer.valueOf(Line));
}
/** Get Line No.
@return Unique line for this document */
public int getLine() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Line);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getLine()));
}

@XendraTrl(Identifier="b32f81b6-8092-3059-63f9-0c791d4aab9b")
public static String es_PE_FIELD_MoveLine_LineNo_Description="No. Línea único para este documento";

@XendraTrl(Identifier="b32f81b6-8092-3059-63f9-0c791d4aab9b")
public static String es_PE_FIELD_MoveLine_LineNo_Help="Indica el No. Línea para un documento. También controlará el orden de despliegue de las líneas dentro de un documento";

@XendraTrl(Identifier="b32f81b6-8092-3059-63f9-0c791d4aab9b")
public static String es_PE_FIELD_MoveLine_LineNo_Name="No. Ítem";
@XendraField(AD_Column_ID="Line",
IsCentrallyMaintained=true,AD_Tab_ID="f426a83e-d097-63fe-377c-cc56d64bb45b",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=40,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="b32f81b6-8092-3059-63f9-0c791d4aab9b")
public static final String FIELDNAME_MoveLine_LineNo="b32f81b6-8092-3059-63f9-0c791d4aab9b";

@XendraTrl(Identifier="1a04dc19-e18d-b420-f869-2a526c80bcd9")
public static String es_PE_COLUMN_Line_Name="No. Línea";

@XendraColumn(AD_Element_ID="986ef077-61da-f9cf-1c6d-aefe3a35113b",ColumnName="Line",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@SQL=SELECT COALESCE(MAX(Line),0)+10 AS DefaultValue FROM M_MovementLine WHERE M_Movement_ID=@M_Movement_ID@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1a04dc19-e18d-b420-f869-2a526c80bcd9",
Synchronized="2017-08-05 16:55:17.0")
/** Column name Line */
public static final String COLUMNNAME_Line = "Line";
/** Set Attribute Set Instance.
@param M_AttributeSetInstance_ID Product Attribute Set Instance */
public void setM_AttributeSetInstance_ID (int M_AttributeSetInstance_ID)
{
if (M_AttributeSetInstance_ID < 0) throw new IllegalArgumentException ("M_AttributeSetInstance_ID is mandatory.");
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

@XendraTrl(Identifier="b6795cb9-ed7d-b793-d438-5d0436336f6a")
public static String es_PE_FIELD_MoveLine_AttributeSetInstance_Description="Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="b6795cb9-ed7d-b793-d438-5d0436336f6a")
public static String es_PE_FIELD_MoveLine_AttributeSetInstance_Help="Valor actual de Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="b6795cb9-ed7d-b793-d438-5d0436336f6a")
public static String es_PE_FIELD_MoveLine_AttributeSetInstance_Name="Lote - Serie";

@XendraField(AD_Column_ID="M_AttributeSetInstance_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f426a83e-d097-63fe-377c-cc56d64bb45b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b6795cb9-ed7d-b793-d438-5d0436336f6a")
public static final String FIELDNAME_MoveLine_AttributeSetInstance="b6795cb9-ed7d-b793-d438-5d0436336f6a";

@XendraTrl(Identifier="bbfb112f-2073-54e6-e1a1-978313761fd0")
public static String es_PE_COLUMN_M_AttributeSetInstance_ID_Name="Instancia del Conjunto de Atributos";

@XendraColumn(AD_Element_ID="137807f2-3c52-e193-3ceb-f10b819cf955",
ColumnName="M_AttributeSetInstance_ID",AD_Reference_ID=35,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutMovementLine.qty",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bbfb112f-2073-54e6-e1a1-978313761fd0",
Synchronized="2017-08-05 16:55:17.0")
/** Column name M_AttributeSetInstance_ID */
public static final String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
/** Set Attribute Set Instance To.
@param M_AttributeSetInstanceTo_ID Target Product Attribute Set Instance */
public void setM_AttributeSetInstanceTo_ID (int M_AttributeSetInstanceTo_ID)
{
if (M_AttributeSetInstanceTo_ID <= 0) set_ValueNoCheck (COLUMNNAME_M_AttributeSetInstanceTo_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_M_AttributeSetInstanceTo_ID, Integer.valueOf(M_AttributeSetInstanceTo_ID));
}
/** Get Attribute Set Instance To.
@return Target Product Attribute Set Instance */
public int getM_AttributeSetInstanceTo_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_AttributeSetInstanceTo_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="169b9c21-3730-a054-0a48-f3616bce751f")
public static String es_PE_FIELD_MoveLine_AttributeSetInstanceTo_Description="Caso determinado de las cualidades del producto.";

@XendraTrl(Identifier="169b9c21-3730-a054-0a48-f3616bce751f")
public static String es_PE_FIELD_MoveLine_AttributeSetInstanceTo_Name="A Lote -Serie";

@XendraField(AD_Column_ID="M_AttributeSetInstanceTo_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f426a83e-d097-63fe-377c-cc56d64bb45b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="169b9c21-3730-a054-0a48-f3616bce751f")
public static final String FIELDNAME_MoveLine_AttributeSetInstanceTo="169b9c21-3730-a054-0a48-f3616bce751f";

@XendraTrl(Identifier="74d628cb-676b-591c-847a-d9f38e8e95d3")
public static String es_PE_COLUMN_M_AttributeSetInstanceTo_ID_Name="Instancia de Atributos Para";

@XendraColumn(AD_Element_ID="8c5c24a6-1ac7-b62f-001b-f64e947098cb",
ColumnName="M_AttributeSetInstanceTo_ID",AD_Reference_ID=35,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,
IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",
IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="74d628cb-676b-591c-847a-d9f38e8e95d3",
Synchronized="2017-08-05 16:55:17.0")
/** Column name M_AttributeSetInstanceTo_ID */
public static final String COLUMNNAME_M_AttributeSetInstanceTo_ID = "M_AttributeSetInstanceTo_ID";
/** Set Locator.
@param M_Locator_ID Warehouse Locator */
public void setM_Locator_ID (int M_Locator_ID)
{
if (M_Locator_ID < 1) throw new IllegalArgumentException ("M_Locator_ID is mandatory.");
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

@XendraTrl(Identifier="cc815e5b-9aaa-7861-aad2-8bd4b65c1666")
public static String es_PE_FIELD_MoveLine_Locator_Description="Ubicación de Almacén";

@XendraTrl(Identifier="cc815e5b-9aaa-7861-aad2-8bd4b65c1666")
public static String es_PE_FIELD_MoveLine_Locator_Help="El ID de la ubicación indica en que parte del almacén se localiza el producto";

@XendraTrl(Identifier="cc815e5b-9aaa-7861-aad2-8bd4b65c1666")
public static String es_PE_FIELD_MoveLine_Locator_Name="Ubicación";

@XendraField(AD_Column_ID="M_Locator_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f426a83e-d097-63fe-377c-cc56d64bb45b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cc815e5b-9aaa-7861-aad2-8bd4b65c1666")
public static final String FIELDNAME_MoveLine_Locator="cc815e5b-9aaa-7861-aad2-8bd4b65c1666";

@XendraTrl(Identifier="c4891a64-82e8-57d4-6c5f-85eba3c508cf")
public static String es_PE_COLUMN_M_Locator_ID_Name="Ubicación";

@XendraColumn(AD_Element_ID="67f044ce-2864-93f9-fd0d-320945150933",ColumnName="M_Locator_ID",
AD_Reference_ID=31,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@M_Locator_ID@",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c4891a64-82e8-57d4-6c5f-85eba3c508cf",Synchronized="2017-08-05 16:55:17.0")
/** Column name M_Locator_ID */
public static final String COLUMNNAME_M_Locator_ID = "M_Locator_ID";

/** M_LocatorTo_ID AD_Reference=8b5ebfcc-b0bb-ce7d-f3c4-eec928bf3462 */
public static final int M_LOCATORTO_ID_AD_Reference_ID=191;
/** Set Locator To.
@param M_LocatorTo_ID Location inventory is moved to */
public void setM_LocatorTo_ID (int M_LocatorTo_ID)
{
if (M_LocatorTo_ID < 1) throw new IllegalArgumentException ("M_LocatorTo_ID is mandatory.");
set_Value (COLUMNNAME_M_LocatorTo_ID, Integer.valueOf(M_LocatorTo_ID));
}
/** Get Locator To.
@return Location inventory is moved to */
public int getM_LocatorTo_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_LocatorTo_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5ba9e97f-d1ec-7aee-584b-d2f06ac6492a")
public static String es_PE_FIELD_MoveLine_LocatorTo_Description="Ubicación a la que se mueve el inventario.";

@XendraTrl(Identifier="5ba9e97f-d1ec-7aee-584b-d2f06ac6492a")
public static String es_PE_FIELD_MoveLine_LocatorTo_Help="La Ubicación A indica la ubicación a donde el inventario está siendo movido.";

@XendraTrl(Identifier="5ba9e97f-d1ec-7aee-584b-d2f06ac6492a")
public static String es_PE_FIELD_MoveLine_LocatorTo_Name="A Ubicación";

@XendraField(AD_Column_ID="M_LocatorTo_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f426a83e-d097-63fe-377c-cc56d64bb45b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5ba9e97f-d1ec-7aee-584b-d2f06ac6492a")
public static final String FIELDNAME_MoveLine_LocatorTo="5ba9e97f-d1ec-7aee-584b-d2f06ac6492a";

@XendraTrl(Identifier="5f968144-b7ce-559e-d009-8321659666b1")
public static String es_PE_COLUMN_M_LocatorTo_ID_Name="A Ubicación";

@XendraColumn(AD_Element_ID="29ad8776-f5f4-1c02-068c-d8c4538fa8be",ColumnName="M_LocatorTo_ID",
AD_Reference_ID=31,AD_Reference_Value_ID="8b5ebfcc-b0bb-ce7d-f3c4-eec928bf3462",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="@M_LocatorTo_ID@",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutMovementLine.qty",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5f968144-b7ce-559e-d009-8321659666b1",
Synchronized="2017-08-05 16:55:17.0")
/** Column name M_LocatorTo_ID */
public static final String COLUMNNAME_M_LocatorTo_ID = "M_LocatorTo_ID";
/** Set Inventory Move.
@param M_Movement_ID Movement of Inventory */
public void setM_Movement_ID (int M_Movement_ID)
{
if (M_Movement_ID < 1) throw new IllegalArgumentException ("M_Movement_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_Movement_ID, Integer.valueOf(M_Movement_ID));
}
/** Get Inventory Move.
@return Movement of Inventory */
public int getM_Movement_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Movement_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f758e3b0-5a10-e50b-e133-a1a6fb9f413d")
public static String es_PE_FIELD_MoveLine_InventoryMove_Description="Movimiento de inventario";

@XendraTrl(Identifier="f758e3b0-5a10-e50b-e133-a1a6fb9f413d")
public static String es_PE_FIELD_MoveLine_InventoryMove_Help="El Movimiento de Inventario identifica únicamente un grupo de líneas de movimiento";

@XendraTrl(Identifier="f758e3b0-5a10-e50b-e133-a1a6fb9f413d")
public static String es_PE_FIELD_MoveLine_InventoryMove_Name="Movimiento";

@XendraField(AD_Column_ID="M_Movement_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f426a83e-d097-63fe-377c-cc56d64bb45b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f758e3b0-5a10-e50b-e133-a1a6fb9f413d")
public static final String FIELDNAME_MoveLine_InventoryMove="f758e3b0-5a10-e50b-e133-a1a6fb9f413d";

@XendraTrl(Identifier="2040d79c-2c95-34de-2a6e-cc137814e4ca")
public static String es_PE_COLUMN_M_Movement_ID_Name="Movimiento";

@XendraColumn(AD_Element_ID="38464e21-16a7-4ca4-2d20-bfa901cb61fb",ColumnName="M_Movement_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=3,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2040d79c-2c95-34de-2a6e-cc137814e4ca",
Synchronized="2017-08-05 16:55:17.0")
/** Column name M_Movement_ID */
public static final String COLUMNNAME_M_Movement_ID = "M_Movement_ID";
/** Set Move Line.
@param M_MovementLine_ID Inventory Move document Line */
public void setM_MovementLine_ID (int M_MovementLine_ID)
{
if (M_MovementLine_ID < 1) throw new IllegalArgumentException ("M_MovementLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_MovementLine_ID, Integer.valueOf(M_MovementLine_ID));
}
/** Get Move Line.
@return Inventory Move document Line */
public int getM_MovementLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_MovementLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f1253592-ab88-78fb-154f-36803f594ea5")
public static String es_PE_FIELD_MoveLine_MoveLine_Description="Item del documento de movimiento de inventario";

@XendraTrl(Identifier="f1253592-ab88-78fb-154f-36803f594ea5")
public static String es_PE_FIELD_MoveLine_MoveLine_Help="Indica el Item del documento de movimiento de inventario (si aplica) para esta transacción.";

@XendraTrl(Identifier="f1253592-ab88-78fb-154f-36803f594ea5")
public static String es_PE_FIELD_MoveLine_MoveLine_Name="Item del Movimiento";

@XendraField(AD_Column_ID="M_MovementLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f426a83e-d097-63fe-377c-cc56d64bb45b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f1253592-ab88-78fb-154f-36803f594ea5")
public static final String FIELDNAME_MoveLine_MoveLine="f1253592-ab88-78fb-154f-36803f594ea5";
/** Column name M_MovementLine_ID */
public static final String COLUMNNAME_M_MovementLine_ID = "M_MovementLine_ID";
/** Set Movement Quantity.
@param MovementQty Quantity of a product moved. */
public void setMovementQty (BigDecimal MovementQty)
{
if (MovementQty == null) throw new IllegalArgumentException ("MovementQty is mandatory.");
set_Value (COLUMNNAME_MovementQty, MovementQty);
}
/** Get Movement Quantity.
@return Quantity of a product moved. */
public BigDecimal getMovementQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MovementQty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="fdd7a1b8-a3ba-025f-ec8d-d6953e5ff896")
public static String es_PE_FIELD_MoveLine_MovementQuantity_Description="Cantidad de un producto movido";

@XendraTrl(Identifier="fdd7a1b8-a3ba-025f-ec8d-d6953e5ff896")
public static String es_PE_FIELD_MoveLine_MovementQuantity_Help="La Cantidad del Movimiento indica la cantidad de un producto que ha sido movido";

@XendraTrl(Identifier="fdd7a1b8-a3ba-025f-ec8d-d6953e5ff896")
public static String es_PE_FIELD_MoveLine_MovementQuantity_Name="Cantidad del Movimiento";

@XendraField(AD_Column_ID="MovementQty",IsCentrallyMaintained=true,
AD_Tab_ID="f426a83e-d097-63fe-377c-cc56d64bb45b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fdd7a1b8-a3ba-025f-ec8d-d6953e5ff896")
public static final String FIELDNAME_MoveLine_MovementQuantity="fdd7a1b8-a3ba-025f-ec8d-d6953e5ff896";

@XendraTrl(Identifier="ce1a92d4-80bf-fa09-18e7-f9b02389bd4d")
public static String es_PE_COLUMN_MovementQty_Name="Cantidad del Movimiento";

@XendraColumn(AD_Element_ID="36c2f62a-1d3b-a3ff-a433-9fc2eec47380",ColumnName="MovementQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="1",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ce1a92d4-80bf-fa09-18e7-f9b02389bd4d",
Synchronized="2017-08-05 16:55:17.0")
/** Column name MovementQty */
public static final String COLUMNNAME_MovementQty = "MovementQty";

/** M_Product_ID AD_Reference=716fae5e-de65-cb55-cec9-d3f538d9eff8 */
public static final int M_PRODUCT_ID_AD_Reference_ID=171;
/** Set Product.
@param M_Product_ID Product, Service, Item */
public void setM_Product_ID (int M_Product_ID)
{
if (M_Product_ID < 1) throw new IllegalArgumentException ("M_Product_ID is mandatory.");
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

@XendraTrl(Identifier="5d5a35b0-f2f0-6284-4692-2b6e20482466")
public static String es_PE_FIELD_MoveLine_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="5d5a35b0-f2f0-6284-4692-2b6e20482466")
public static String es_PE_FIELD_MoveLine_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="5d5a35b0-f2f0-6284-4692-2b6e20482466")
public static String es_PE_FIELD_MoveLine_Product_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f426a83e-d097-63fe-377c-cc56d64bb45b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5d5a35b0-f2f0-6284-4692-2b6e20482466")
public static final String FIELDNAME_MoveLine_Product="5d5a35b0-f2f0-6284-4692-2b6e20482466";

@XendraTrl(Identifier="9f071a9e-1fc1-1442-aea1-a73297fd0144")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="716fae5e-de65-cb55-cec9-d3f538d9eff8",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutMovement.product, org.compiere.model.CalloutMovementLine.qty",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="9f071a9e-1fc1-1442-aea1-a73297fd0144",Synchronized="2017-08-05 16:55:17.0")
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

@XendraTrl(Identifier="68a0b981-ff69-9450-4b6c-cc80551b49f1")
public static String es_PE_FIELD_MoveLine_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="68a0b981-ff69-9450-4b6c-cc80551b49f1")
public static String es_PE_FIELD_MoveLine_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="68a0b981-ff69-9450-4b6c-cc80551b49f1")
public static String es_PE_FIELD_MoveLine_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="f426a83e-d097-63fe-377c-cc56d64bb45b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="68a0b981-ff69-9450-4b6c-cc80551b49f1")
public static final String FIELDNAME_MoveLine_Processed="68a0b981-ff69-9450-4b6c-cc80551b49f1";

@XendraTrl(Identifier="a179dd30-ad99-13c4-0db4-1212aaf1c5d1")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a179dd30-ad99-13c4-0db4-1212aaf1c5d1",
Synchronized="2017-08-05 16:55:17.0")
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

@XendraTrl(Identifier="a6a336be-c858-feff-8d04-e472a45aa9be")
public static String es_PE_FIELD_MoveLine_Quantity_Description="La cantidad incorporada se basa en la UM seleccionada.";

@XendraTrl(Identifier="a6a336be-c858-feff-8d04-e472a45aa9be")
public static String es_PE_FIELD_MoveLine_Quantity_Help="La cantidad incorporada se convierte a la cantidad baja de UM del producto";

@XendraTrl(Identifier="a6a336be-c858-feff-8d04-e472a45aa9be")
public static String es_PE_FIELD_MoveLine_Quantity_Name="Cantidad";

@XendraField(AD_Column_ID="QtyEntered",IsCentrallyMaintained=true,
AD_Tab_ID="f426a83e-d097-63fe-377c-cc56d64bb45b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a6a336be-c858-feff-8d04-e472a45aa9be")
public static final String FIELDNAME_MoveLine_Quantity="a6a336be-c858-feff-8d04-e472a45aa9be";

@XendraTrl(Identifier="62b05df9-7ee0-3737-7136-a2ae8c68a3bf")
public static String es_PE_COLUMN_QtyEntered_Name="Quantity";

@XendraColumn(AD_Element_ID="70a37b06-986d-bf01-1ef9-23e214211841",ColumnName="QtyEntered",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="org.compiere.model.CalloutMovementLine.qty",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="62b05df9-7ee0-3737-7136-a2ae8c68a3bf",Synchronized="2017-08-05 16:55:17.0")
/** Column name QtyEntered */
public static final String COLUMNNAME_QtyEntered = "QtyEntered";
/** Set Scrapped Quantity.
@param ScrappedQty The Quantity scrapped due to QA issues */
public void setScrappedQty (BigDecimal ScrappedQty)
{
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

@XendraTrl(Identifier="5dd854a4-874b-c233-1ad3-7aa502574389")
public static String es_PE_FIELD_MoveLine_ScrappedQuantity_Description="La cantidad de desperdicio debido a las ediciones del A.C.";

@XendraTrl(Identifier="5dd854a4-874b-c233-1ad3-7aa502574389")
public static String es_PE_FIELD_MoveLine_ScrappedQuantity_Name="Cantidad de Desperdicio";

@XendraField(AD_Column_ID="ScrappedQty",IsCentrallyMaintained=true,
AD_Tab_ID="f426a83e-d097-63fe-377c-cc56d64bb45b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=160,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5dd854a4-874b-c233-1ad3-7aa502574389")
public static final String FIELDNAME_MoveLine_ScrappedQuantity="5dd854a4-874b-c233-1ad3-7aa502574389";

@XendraTrl(Identifier="8e3052fd-1319-0ddc-9a27-0f5cd10d1f38")
public static String es_PE_COLUMN_ScrappedQty_Name="Cantidad de Desperdicio";

@XendraColumn(AD_Element_ID="40b91fb0-3206-0a29-4fd3-de7dde7e4d2c",ColumnName="ScrappedQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8e3052fd-1319-0ddc-9a27-0f5cd10d1f38",
Synchronized="2017-08-05 16:55:17.0")
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

@XendraTrl(Identifier="2999c64b-dd09-5f72-0dcf-5531f7c4b67a")
public static String es_PE_FIELD_MoveLine_TargetQuantity_Description="Movimientos de cantidad a recibir";

@XendraTrl(Identifier="2999c64b-dd09-5f72-0dcf-5531f7c4b67a")
public static String es_PE_FIELD_MoveLine_TargetQuantity_Help="La cantidad que debio haber sido recibida";

@XendraTrl(Identifier="2999c64b-dd09-5f72-0dcf-5531f7c4b67a")
public static String es_PE_FIELD_MoveLine_TargetQuantity_Name="Cantidad a Recibir";

@XendraField(AD_Column_ID="TargetQty",IsCentrallyMaintained=true,
AD_Tab_ID="f426a83e-d097-63fe-377c-cc56d64bb45b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2999c64b-dd09-5f72-0dcf-5531f7c4b67a")
public static final String FIELDNAME_MoveLine_TargetQuantity="2999c64b-dd09-5f72-0dcf-5531f7c4b67a";

@XendraTrl(Identifier="5affb1fe-8981-27c4-ef0b-8ec14f822658")
public static String es_PE_COLUMN_TargetQty_Name="Cantidad a recibir";

@XendraColumn(AD_Element_ID="6fbec6d0-2133-ed61-f214-65f7655fd4a6",ColumnName="TargetQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5affb1fe-8981-27c4-ef0b-8ec14f822658",
Synchronized="2017-08-05 16:55:17.0")
/** Column name TargetQty */
public static final String COLUMNNAME_TargetQty = "TargetQty";
}
