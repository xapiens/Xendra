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
/** Generated Model for M_BOMProduct
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_BOMProduct extends PO
{
/** Standard Constructor
@param ctx context
@param M_BOMProduct_ID id
@param trxName transaction
*/
public X_M_BOMProduct (Properties ctx, int M_BOMProduct_ID, String trxName)
{
super (ctx, M_BOMProduct_ID, trxName);
/** if (M_BOMProduct_ID == 0)
{
setBOMProductType (null);	
// S
setBOMQty (Env.ZERO);	
// 1
setIsPhantom (false);	
// N
setLeadTimeOffset (0);
setLine (0);	
// @SQL=SELECT COALESCE(MAX(Line),0)+10 AS DefaultValue FROM M_BOMProduct WHERE M_BOM_ID=@M_BOM_ID@
setM_BOM_ID (0);
setM_BOMProduct_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_BOMProduct (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=801 */
public static int Table_ID=MTable.getTable_ID("M_BOMProduct");

@XendraTrl(Identifier="92891563-869f-eb94-698f-afa8d6d44877")
public static String es_PE_TAB_BOMComponent_Description="Componente de LDM (Producto)";

@XendraTrl(Identifier="92891563-869f-eb94-698f-afa8d6d44877")
public static String es_PE_TAB_BOMComponent_Help="El componente de LDM determina que productos, servicios y el proceso del exterior se incluye en producir el producto. Se refiere a la operación y la secuencia determinada.";

@XendraTrl(Identifier="92891563-869f-eb94-698f-afa8d6d44877")
public static String es_PE_TAB_BOMComponent_Name="Componente LDM";
@XendraTab(Name="BOM Component",
Description="Bill of Material Component (Product)",
Help="The Bill of Material Compoment determines what products, services and outside processing is included in producing the Product. It references the operation and determines it's sequence.",
AD_Window_ID="19c8d953-bce9-f34c-e702-5d8e285fb49d",SeqNo=60,TabLevel=2,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="92891563-869f-eb94-698f-afa8d6d44877",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_BOMComponent="92891563-869f-eb94-698f-afa8d6d44877";

@XendraTrl(Identifier="c1b17805-45d4-001b-b8ee-f238254cfff7")
public static String es_PE_TABLE_M_BOMProduct_Name="Componentes de LDM";

@XendraTable(Name="BOM Component",AD_Package_ID="2809ac2d-7d43-20f8-05f0-a478f2e50204",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",
Description="Bill of Material Component (Product)",Help="",TableName="M_BOMProduct",
AccessLevel="3",AD_Window_ID="19c8d953-bce9-f34c-e702-5d8e285fb49d",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="c1b17805-45d4-001b-b8ee-f238254cfff7",Synchronized="2020-03-03 21:38:17.0")
/** TableName=M_BOMProduct */
public static final String Table_Name="M_BOMProduct";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_BOMProduct");

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
    Table_ID = MTable.getTable_ID("M_BOMProduct");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_BOMProduct[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Component Type.
@param BOMProductType BOM Product Type */
public void setBOMProductType (String BOMProductType)
{
if (BOMProductType.length() > 1)
{
log.warning("Length > 1 - truncated");
BOMProductType = BOMProductType.substring(0,0);
}
set_Value (COLUMNNAME_BOMProductType, BOMProductType);
}
/** Get Component Type.
@return BOM Product Type */
public String getBOMProductType() 
{
return (String)get_Value(COLUMNNAME_BOMProductType);
}

@XendraTrl(Identifier="f38a335a-e7f8-ad5d-8d50-1260c243d3b9")
public static String es_PE_FIELD_BOMComponent_ComponentType_Name="Tipo de componente LDM";

@XendraTrl(Identifier="f38a335a-e7f8-ad5d-8d50-1260c243d3b9")
public static String es_PE_FIELD_BOMComponent_ComponentType_Description="Tipo de componente LDM";

@XendraField(AD_Column_ID="BOMProductType",IsCentrallyMaintained=true,
AD_Tab_ID="92891563-869f-eb94-698f-afa8d6d44877",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f38a335a-e7f8-ad5d-8d50-1260c243d3b9")
public static final String FIELDNAME_BOMComponent_ComponentType="f38a335a-e7f8-ad5d-8d50-1260c243d3b9";

@XendraTrl(Identifier="74084b60-2306-8117-3ed7-7cd1e601a19c")
public static String es_PE_COLUMN_BOMProductType_Name="Tipo de componente LDM";

@XendraColumn(AD_Element_ID="34bdfe81-e054-0441-d417-95d0760ec614",ColumnName="BOMProductType",
AD_Reference_ID=17,AD_Reference_Value_ID="22ec8bbd-82a1-ad86-8c53-6cc116ff542d",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="S",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="74084b60-2306-8117-3ed7-7cd1e601a19c",Synchronized="2019-08-30 22:22:58.0")
/** Column name BOMProductType */
public static final String COLUMNNAME_BOMProductType = "BOMProductType";
/** Set BOM Quantity.
@param BOMQty Bill of Materials Quantity */
public void setBOMQty (BigDecimal BOMQty)
{
if (BOMQty == null) throw new IllegalArgumentException ("BOMQty is mandatory.");
set_Value (COLUMNNAME_BOMQty, BOMQty);
}
/** Get BOM Quantity.
@return Bill of Materials Quantity */
public BigDecimal getBOMQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_BOMQty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="1b6eb7a6-16ba-48be-3463-6949abc84bc6")
public static String es_PE_FIELD_BOMComponent_BOMQuantity_Name="Cantidad en LDM";

@XendraTrl(Identifier="1b6eb7a6-16ba-48be-3463-6949abc84bc6")
public static String es_PE_FIELD_BOMComponent_BOMQuantity_Description="Cantidad en la Lista de Materiales";

@XendraTrl(Identifier="1b6eb7a6-16ba-48be-3463-6949abc84bc6")
public static String es_PE_FIELD_BOMComponent_BOMQuantity_Help="La cantidad de Lista de Materiales indica la cantidad del producto en su unidad de medida (multiplicador)";

@XendraField(AD_Column_ID="BOMQty",IsCentrallyMaintained=true,
AD_Tab_ID="92891563-869f-eb94-698f-afa8d6d44877",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1b6eb7a6-16ba-48be-3463-6949abc84bc6")
public static final String FIELDNAME_BOMComponent_BOMQuantity="1b6eb7a6-16ba-48be-3463-6949abc84bc6";

@XendraTrl(Identifier="054d3154-afd7-5370-7ef4-97cc6b1de233")
public static String es_PE_COLUMN_BOMQty_Name="Cantidad en LDM";

@XendraColumn(AD_Element_ID="5919f8a7-8b3b-81f0-0a45-1abd107dfe84",ColumnName="BOMQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="1",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="054d3154-afd7-5370-7ef4-97cc6b1de233",
Synchronized="2019-08-30 22:22:58.0")
/** Column name BOMQty */
public static final String COLUMNNAME_BOMQty = "BOMQty";
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

@XendraTrl(Identifier="9aaa9898-9f0a-7a75-4f68-766f615b53a5")
public static String es_PE_FIELD_BOMComponent_Description_Name="Observación";

@XendraTrl(Identifier="9aaa9898-9f0a-7a75-4f68-766f615b53a5")
public static String es_PE_FIELD_BOMComponent_Description_Description="Observación";

@XendraTrl(Identifier="9aaa9898-9f0a-7a75-4f68-766f615b53a5")
public static String es_PE_FIELD_BOMComponent_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="92891563-869f-eb94-698f-afa8d6d44877",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9aaa9898-9f0a-7a75-4f68-766f615b53a5")
public static final String FIELDNAME_BOMComponent_Description="9aaa9898-9f0a-7a75-4f68-766f615b53a5";

@XendraTrl(Identifier="833474e1-0d4e-e705-42a3-a539cf289008")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="833474e1-0d4e-e705-42a3-a539cf289008",
Synchronized="2019-08-30 22:22:58.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Comment/Help.
@param Help Comment or Hint */
public void setHelp (String Help)
{
set_Value (COLUMNNAME_Help, Help);
}
/** Get Comment/Help.
@return Comment or Hint */
public String getHelp() 
{
String value = (String)get_Value(COLUMNNAME_Help);
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

@XendraTrl(Identifier="776b6ae2-0273-40e1-d1c4-557f336c0406")
public static String es_PE_FIELD_BOMComponent_CommentHelp_Name="Ayuda";

@XendraTrl(Identifier="776b6ae2-0273-40e1-d1c4-557f336c0406")
public static String es_PE_FIELD_BOMComponent_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="776b6ae2-0273-40e1-d1c4-557f336c0406")
public static String es_PE_FIELD_BOMComponent_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="92891563-869f-eb94-698f-afa8d6d44877",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="776b6ae2-0273-40e1-d1c4-557f336c0406")
public static final String FIELDNAME_BOMComponent_CommentHelp="776b6ae2-0273-40e1-d1c4-557f336c0406";

@XendraTrl(Identifier="388178fb-8746-dfe1-6056-db606568240f")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="388178fb-8746-dfe1-6056-db606568240f",
Synchronized="2019-08-30 22:22:58.0")
/** Column name Help */
public static final String COLUMNNAME_Help = "Help";
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
@XendraTrl(Identifier="83534600-a115-491d-a8bf-28262684b425")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="83534600-a115-491d-a8bf-28262684b425",
Synchronized="2019-08-30 22:22:58.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Phantom.
@param IsPhantom Phantom Component */
public void setIsPhantom (boolean IsPhantom)
{
set_Value (COLUMNNAME_IsPhantom, Boolean.valueOf(IsPhantom));
}
/** Get Phantom.
@return Phantom Component */
public boolean isPhantom() 
{
Object oo = get_Value(COLUMNNAME_IsPhantom);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="4f7b7688-18f7-3bea-3a86-552e2f98cc8c")
public static String es_PE_FIELD_BOMComponent_Phantom_Name="Fantasma";

@XendraTrl(Identifier="4f7b7688-18f7-3bea-3a86-552e2f98cc8c")
public static String es_PE_FIELD_BOMComponent_Phantom_Description="Componente Fantasma";

@XendraTrl(Identifier="4f7b7688-18f7-3bea-3a86-552e2f98cc8c")
public static String es_PE_FIELD_BOMComponent_Phantom_Help="Phantom Component are not stored and produced with the product. This is an option to avild maintaining an Engineering and Manufacturing Bill of Materials.";

@XendraField(AD_Column_ID="IsPhantom",IsCentrallyMaintained=true,
AD_Tab_ID="92891563-869f-eb94-698f-afa8d6d44877",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4f7b7688-18f7-3bea-3a86-552e2f98cc8c")
public static final String FIELDNAME_BOMComponent_Phantom="4f7b7688-18f7-3bea-3a86-552e2f98cc8c";

@XendraTrl(Identifier="522d21c3-dbeb-0b7f-a2a6-fb978f274b5d")
public static String es_PE_COLUMN_IsPhantom_Name="Fantasma";

@XendraColumn(AD_Element_ID="a0ec2689-7af3-953f-900c-4f52c877b749",ColumnName="IsPhantom",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="522d21c3-dbeb-0b7f-a2a6-fb978f274b5d",
Synchronized="2019-08-30 22:22:58.0")
/** Column name IsPhantom */
public static final String COLUMNNAME_IsPhantom = "IsPhantom";
/** Set Lead Time Offset.
@param LeadTimeOffset Optional Lead Time offest before starting production */
public void setLeadTimeOffset (int LeadTimeOffset)
{
set_Value (COLUMNNAME_LeadTimeOffset, Integer.valueOf(LeadTimeOffset));
}
/** Get Lead Time Offset.
@return Optional Lead Time offest before starting production */
public int getLeadTimeOffset() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_LeadTimeOffset);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3dee40da-8078-cfc4-3b01-f958f86fa063")
public static String es_PE_FIELD_BOMComponent_LeadTimeOffset_Name="Compensación en tiempo de entrega";

@XendraTrl(Identifier="3dee40da-8078-cfc4-3b01-f958f86fa063")
public static String es_PE_FIELD_BOMComponent_LeadTimeOffset_Description="Tiempo de entrega opcional antes que comience la producción";

@XendraField(AD_Column_ID="LeadTimeOffset",IsCentrallyMaintained=true,
AD_Tab_ID="92891563-869f-eb94-698f-afa8d6d44877",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@M_ProductOperation_ID@!0",DisplayLength=11,IsReadOnly=false,SeqNo=170,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="3dee40da-8078-cfc4-3b01-f958f86fa063")
public static final String FIELDNAME_BOMComponent_LeadTimeOffset="3dee40da-8078-cfc4-3b01-f958f86fa063";

@XendraTrl(Identifier="efe3b7c1-caa5-1032-fd78-82ebf1543946")
public static String es_PE_COLUMN_LeadTimeOffset_Name="Compensación en tiempo de entrega";

@XendraColumn(AD_Element_ID="4cbce71e-e7cf-49cc-6a62-e878dad3a14a",ColumnName="LeadTimeOffset",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="efe3b7c1-caa5-1032-fd78-82ebf1543946",
Synchronized="2019-08-30 22:22:59.0")
/** Column name LeadTimeOffset */
public static final String COLUMNNAME_LeadTimeOffset = "LeadTimeOffset";
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

@XendraTrl(Identifier="599df37b-857e-8431-c980-5c22fbfd1d26")
public static String es_PE_FIELD_BOMComponent_LineNo_Name="No. Línea";

@XendraTrl(Identifier="599df37b-857e-8431-c980-5c22fbfd1d26")
public static String es_PE_FIELD_BOMComponent_LineNo_Description="No. Línea único para este documento";

@XendraTrl(Identifier="599df37b-857e-8431-c980-5c22fbfd1d26")
public static String es_PE_FIELD_BOMComponent_LineNo_Help="Indica el No. Línea para un documento. También controlará el orden de despliegue de las líneas dentro de un documento";

@XendraField(AD_Column_ID="Line",IsCentrallyMaintained=true,
AD_Tab_ID="92891563-869f-eb94-698f-afa8d6d44877",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="599df37b-857e-8431-c980-5c22fbfd1d26")
public static final String FIELDNAME_BOMComponent_LineNo="599df37b-857e-8431-c980-5c22fbfd1d26";

@XendraTrl(Identifier="7dd181f5-8b57-2d39-92bc-d11369bc8c8d")
public static String es_PE_COLUMN_Line_Name="No. Línea";

@XendraColumn(AD_Element_ID="986ef077-61da-f9cf-1c6d-aefe3a35113b",ColumnName="Line",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,
DefaultValue="@SQL=SELECT COALESCE(MAX(Line),0)+10 AS DefaultValue FROM M_BOMProduct WHERE M_BOM_ID=@M_BOM_ID@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7dd181f5-8b57-2d39-92bc-d11369bc8c8d",
Synchronized="2019-08-30 22:22:59.0")
/** Column name Line */
public static final String COLUMNNAME_Line = "Line";
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

@XendraTrl(Identifier="9a6f2504-b074-0a28-d3d0-5e2085c82dfb")
public static String es_PE_FIELD_BOMComponent_AttributeSetInstance_Name="Instancia del Conjunto de Atributos";

@XendraTrl(Identifier="9a6f2504-b074-0a28-d3d0-5e2085c82dfb")
public static String es_PE_FIELD_BOMComponent_AttributeSetInstance_Description="Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="9a6f2504-b074-0a28-d3d0-5e2085c82dfb")
public static String es_PE_FIELD_BOMComponent_AttributeSetInstance_Help="Valor actual de Instancia del conjunto de atributos del producto";

@XendraField(AD_Column_ID="M_AttributeSetInstance_ID",IsCentrallyMaintained=true,
AD_Tab_ID="92891563-869f-eb94-698f-afa8d6d44877",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@BOMType@=O",DisplayLength=26,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9a6f2504-b074-0a28-d3d0-5e2085c82dfb")
public static final String FIELDNAME_BOMComponent_AttributeSetInstance="9a6f2504-b074-0a28-d3d0-5e2085c82dfb";

@XendraTrl(Identifier="351199f9-d9f0-24f6-fb65-4d7b2f3d57ba")
public static String es_PE_COLUMN_M_AttributeSetInstance_ID_Name="Instancia del Conjunto de Atributos";

@XendraColumn(AD_Element_ID="137807f2-3c52-e193-3ceb-f10b819cf955",
ColumnName="M_AttributeSetInstance_ID",AD_Reference_ID=35,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="351199f9-d9f0-24f6-fb65-4d7b2f3d57ba",Synchronized="2019-08-30 22:22:59.0")
/** Column name M_AttributeSetInstance_ID */
public static final String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
/** Set Alternative Group.
@param M_BOMAlternative_ID Product BOM Alternative Group */
public void setM_BOMAlternative_ID (int M_BOMAlternative_ID)
{
if (M_BOMAlternative_ID <= 0) set_Value (COLUMNNAME_M_BOMAlternative_ID, null);
 else 
set_Value (COLUMNNAME_M_BOMAlternative_ID, Integer.valueOf(M_BOMAlternative_ID));
}
/** Get Alternative Group.
@return Product BOM Alternative Group */
public int getM_BOMAlternative_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_BOMAlternative_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2df00a83-465f-fa59-5961-f6817b3da17f")
public static String es_PE_FIELD_BOMComponent_AlternativeGroup_Name="Alternativa de Grupo";

@XendraTrl(Identifier="2df00a83-465f-fa59-5961-f6817b3da17f")
public static String es_PE_FIELD_BOMComponent_AlternativeGroup_Description="LDM Alternativa al gupo de producto.";

@XendraTrl(Identifier="2df00a83-465f-fa59-5961-f6817b3da17f")
public static String es_PE_FIELD_BOMComponent_AlternativeGroup_Help="Alternativa de grupo de productos cuando esta todo el grupo de componentes de la lista de materiales, el cual son exclusivas (i.e. solamente una es valida) Ejemplo: diferentes tamaños de maquina.  ";

@XendraField(AD_Column_ID="M_BOMAlternative_ID",IsCentrallyMaintained=true,
AD_Tab_ID="92891563-869f-eb94-698f-afa8d6d44877",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@BOMProductType@=D | @BOMProductType@=A",DisplayLength=14,IsReadOnly=false,SeqNo=90,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="2df00a83-465f-fa59-5961-f6817b3da17f")
public static final String FIELDNAME_BOMComponent_AlternativeGroup="2df00a83-465f-fa59-5961-f6817b3da17f";

@XendraTrl(Identifier="6cdf7f6e-d145-cecc-04ae-ae7406a2e4fa")
public static String es_PE_COLUMN_M_BOMAlternative_ID_Name="Alternativa de Grupo";

@XendraColumn(AD_Element_ID="063718e5-b4b4-76ee-7a30-48f2961a94f5",
ColumnName="M_BOMAlternative_ID",AD_Reference_ID=30,AD_Reference_Value_ID="",
AD_Val_Rule_ID="875d3b3c-81fb-7daa-c66f-f06630e24b40",FieldLength=10,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6cdf7f6e-d145-cecc-04ae-ae7406a2e4fa",
Synchronized="2019-08-30 22:22:59.0")
/** Column name M_BOMAlternative_ID */
public static final String COLUMNNAME_M_BOMAlternative_ID = "M_BOMAlternative_ID";
/** Set BOM.
@param M_BOM_ID Bill of Material */
public void setM_BOM_ID (int M_BOM_ID)
{
if (M_BOM_ID < 1) throw new IllegalArgumentException ("M_BOM_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_BOM_ID, Integer.valueOf(M_BOM_ID));
}
/** Get BOM.
@return Bill of Material */
public int getM_BOM_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_BOM_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d2a8a1d9-84fa-a102-7df2-3d24e4804d12")
public static String es_PE_FIELD_BOMComponent_BOM_Name="LDM";

@XendraTrl(Identifier="d2a8a1d9-84fa-a102-7df2-3d24e4804d12")
public static String es_PE_FIELD_BOMComponent_BOM_Description="Lista de materiales";

@XendraTrl(Identifier="d2a8a1d9-84fa-a102-7df2-3d24e4804d12")
public static String es_PE_FIELD_BOMComponent_BOM_Help="La composición de el producto.";

@XendraField(AD_Column_ID="M_BOM_ID",IsCentrallyMaintained=true,
AD_Tab_ID="92891563-869f-eb94-698f-afa8d6d44877",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d2a8a1d9-84fa-a102-7df2-3d24e4804d12")
public static final String FIELDNAME_BOMComponent_BOM="d2a8a1d9-84fa-a102-7df2-3d24e4804d12";

@XendraTrl(Identifier="111694fd-5dab-df52-7694-e1112ac817cf")
public static String es_PE_COLUMN_M_BOM_ID_Name="LDM";

@XendraColumn(AD_Element_ID="f74f158f-a1ce-2b65-149d-8ef9be21d27e",ColumnName="M_BOM_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="111694fd-5dab-df52-7694-e1112ac817cf",
Synchronized="2019-08-30 22:22:59.0")
/** Column name M_BOM_ID */
public static final String COLUMNNAME_M_BOM_ID = "M_BOM_ID";
/** Set BOM Component.
@param M_BOMProduct_ID Bill of Material Component (Product) */
public void setM_BOMProduct_ID (int M_BOMProduct_ID)
{
if (M_BOMProduct_ID < 1) throw new IllegalArgumentException ("M_BOMProduct_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_BOMProduct_ID, Integer.valueOf(M_BOMProduct_ID));
}
/** Get BOM Component.
@return Bill of Material Component (Product) */
public int getM_BOMProduct_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_BOMProduct_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c4b058ac-2384-d371-f548-588699a0cdda")
public static String es_PE_FIELD_BOMComponent_BOMComponent_Name="Componentes de LDM";

@XendraTrl(Identifier="c4b058ac-2384-d371-f548-588699a0cdda")
public static String es_PE_FIELD_BOMComponent_BOMComponent_Description="Componentes de LDM (Producto)";

@XendraTrl(Identifier="c4b058ac-2384-d371-f548-588699a0cdda")
public static String es_PE_FIELD_BOMComponent_BOMComponent_Help="La cuenta de componentes de material determina qué productos, servicios y proceso del exterior se incluye en producir el producto. Se refiere a la operación y la determinación de la secuencia.";

@XendraField(AD_Column_ID="M_BOMProduct_ID",IsCentrallyMaintained=true,
AD_Tab_ID="92891563-869f-eb94-698f-afa8d6d44877",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c4b058ac-2384-d371-f548-588699a0cdda")
public static final String FIELDNAME_BOMComponent_BOMComponent="c4b058ac-2384-d371-f548-588699a0cdda";
/** Column name M_BOMProduct_ID */
public static final String COLUMNNAME_M_BOMProduct_ID = "M_BOMProduct_ID";
/** Set Change Notice.
@param M_ChangeNotice_ID Bill of Materials (Engineering) Change Notice (Version) */
public void setM_ChangeNotice_ID (int M_ChangeNotice_ID)
{
if (M_ChangeNotice_ID <= 0) set_Value (COLUMNNAME_M_ChangeNotice_ID, null);
 else 
set_Value (COLUMNNAME_M_ChangeNotice_ID, Integer.valueOf(M_ChangeNotice_ID));
}
/** Get Change Notice.
@return Bill of Materials (Engineering) Change Notice (Version) */
public int getM_ChangeNotice_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_ChangeNotice_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="683d5380-c92e-5889-22c9-6768dccf1772")
public static String es_PE_FIELD_BOMComponent_ChangeNotice_Name="Aviso de Cambio";

@XendraTrl(Identifier="683d5380-c92e-5889-22c9-6768dccf1772")
public static String es_PE_FIELD_BOMComponent_ChangeNotice_Description="Cuenta de materiales (ingeniería) cambio de aviso (versión)";

@XendraField(AD_Column_ID="M_ChangeNotice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="92891563-869f-eb94-698f-afa8d6d44877",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@BOMType@!O",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="683d5380-c92e-5889-22c9-6768dccf1772")
public static final String FIELDNAME_BOMComponent_ChangeNotice="683d5380-c92e-5889-22c9-6768dccf1772";

@XendraTrl(Identifier="cc159ee6-f721-4d92-5d1f-ce96f7638f74")
public static String es_PE_COLUMN_M_ChangeNotice_ID_Name="Aviso de Cambio";

@XendraColumn(AD_Element_ID="9ef80c4a-fc78-9760-2916-157f9f8d80b3",ColumnName="M_ChangeNotice_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="84c50ceb-3e0a-0b39-96e8-ecc476add07b",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="cc159ee6-f721-4d92-5d1f-ce96f7638f74",Synchronized="2019-08-30 22:22:59.0")
/** Column name M_ChangeNotice_ID */
public static final String COLUMNNAME_M_ChangeNotice_ID = "M_ChangeNotice_ID";
/** Set BOM Product.
@param M_ProductBOM_ID Bill of Material Component Product */
public void setM_ProductBOM_ID (int M_ProductBOM_ID)
{
if (M_ProductBOM_ID <= 0) set_Value (COLUMNNAME_M_ProductBOM_ID, null);
 else 
set_Value (COLUMNNAME_M_ProductBOM_ID, Integer.valueOf(M_ProductBOM_ID));
}
/** Get BOM Product.
@return Bill of Material Component Product */
public int getM_ProductBOM_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_ProductBOM_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0bd5cbb5-0033-8a47-7aeb-96d43023a8db")
public static String es_PE_FIELD_BOMComponent_BOMProduct_Name="Producto (Formula)/ LDM";

@XendraTrl(Identifier="0bd5cbb5-0033-8a47-7aeb-96d43023a8db")
public static String es_PE_FIELD_BOMComponent_BOMProduct_Description="Producto en Lista de Materiales";

@XendraTrl(Identifier="0bd5cbb5-0033-8a47-7aeb-96d43023a8db")
public static String es_PE_FIELD_BOMComponent_BOMProduct_Help="El Producto en LDM identifica un elemento que es parte de una lista de materiales";

@XendraField(AD_Column_ID="M_ProductBOM_ID",IsCentrallyMaintained=true,
AD_Tab_ID="92891563-869f-eb94-698f-afa8d6d44877",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0bd5cbb5-0033-8a47-7aeb-96d43023a8db")
public static final String FIELDNAME_BOMComponent_BOMProduct="0bd5cbb5-0033-8a47-7aeb-96d43023a8db";

@XendraTrl(Identifier="b8b2ea5f-dade-ef73-51f7-aabf35026c7f")
public static String es_PE_COLUMN_M_ProductBOM_ID_Name="Producto (Formula)/ LDM";

@XendraColumn(AD_Element_ID="b4d24ab3-36aa-35f2-ebb2-81e1c924f11d",ColumnName="M_ProductBOM_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="28b49c4d-0409-b2e0-b70e-d686f8d6503f",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="b8b2ea5f-dade-ef73-51f7-aabf35026c7f",Synchronized="2019-08-30 22:22:59.0")
/** Column name M_ProductBOM_ID */
public static final String COLUMNNAME_M_ProductBOM_ID = "M_ProductBOM_ID";
/** Set Product Operation.
@param M_ProductOperation_ID Product Manufacturing Operation */
public void setM_ProductOperation_ID (int M_ProductOperation_ID)
{
if (M_ProductOperation_ID <= 0) set_Value (COLUMNNAME_M_ProductOperation_ID, null);
 else 
set_Value (COLUMNNAME_M_ProductOperation_ID, Integer.valueOf(M_ProductOperation_ID));
}
/** Get Product Operation.
@return Product Manufacturing Operation */
public int getM_ProductOperation_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_ProductOperation_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c3d540f4-367b-01d9-eab9-5be91095ee32")
public static String es_PE_FIELD_BOMComponent_ProductOperation_Name="Operación del Producto";

@XendraTrl(Identifier="c3d540f4-367b-01d9-eab9-5be91095ee32")
public static String es_PE_FIELD_BOMComponent_ProductOperation_Description="Operación de manufactura del producto";

@XendraTrl(Identifier="c3d540f4-367b-01d9-eab9-5be91095ee32")
public static String es_PE_FIELD_BOMComponent_ProductOperation_Help="La operación para crear el producto. Note que el actual uso y operación de secuencia es determinado por la LDM del producto.";

@XendraField(AD_Column_ID="M_ProductOperation_ID",IsCentrallyMaintained=true,
AD_Tab_ID="92891563-869f-eb94-698f-afa8d6d44877",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c3d540f4-367b-01d9-eab9-5be91095ee32")
public static final String FIELDNAME_BOMComponent_ProductOperation="c3d540f4-367b-01d9-eab9-5be91095ee32";

@XendraTrl(Identifier="24bed57a-4f46-edad-9528-765f54c8c00f")
public static String es_PE_COLUMN_M_ProductOperation_ID_Name="Operación del Producto";

@XendraColumn(AD_Element_ID="d09057a1-9f5e-167b-8e7e-d967dd899ea6",
ColumnName="M_ProductOperation_ID",AD_Reference_ID=30,AD_Reference_Value_ID="",
AD_Val_Rule_ID="9501a740-0981-4eb8-f484-e202cef6a216",FieldLength=10,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="24bed57a-4f46-edad-9528-765f54c8c00f",
Synchronized="2019-08-30 22:22:59.0")
/** Column name M_ProductOperation_ID */
public static final String COLUMNNAME_M_ProductOperation_ID = "M_ProductOperation_ID";
/** Set Sequence.
@param SeqNo Method of ordering records: lowest number comes first */
public void setSeqNo (int SeqNo)
{
set_Value (COLUMNNAME_SeqNo, Integer.valueOf(SeqNo));
}
/** Get Sequence.
@return Method of ordering records: lowest number comes first */
public int getSeqNo() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_SeqNo);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7597b614-ee27-702c-2a62-fd193616fe7a")
public static String es_PE_FIELD_BOMComponent_Sequence_Name="Secuencia";

@XendraTrl(Identifier="7597b614-ee27-702c-2a62-fd193616fe7a")
public static String es_PE_FIELD_BOMComponent_Sequence_Description="Método de ordenar registros; el número más bajo viene primero";

@XendraTrl(Identifier="7597b614-ee27-702c-2a62-fd193616fe7a")
public static String es_PE_FIELD_BOMComponent_Sequence_Help="La Secuencia indica el orden de los registros";

@XendraField(AD_Column_ID="SeqNo",IsCentrallyMaintained=true,
AD_Tab_ID="92891563-869f-eb94-698f-afa8d6d44877",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@M_ProductOperation_ID@!0",DisplayLength=11,IsReadOnly=false,SeqNo=160,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="7597b614-ee27-702c-2a62-fd193616fe7a")
public static final String FIELDNAME_BOMComponent_Sequence="7597b614-ee27-702c-2a62-fd193616fe7a";

@XendraTrl(Identifier="ea39d48d-1fe5-edbd-4c21-820a0c7b56f4")
public static String es_PE_COLUMN_SeqNo_Name="Secuencia";

@XendraColumn(AD_Element_ID="38fa26fe-b59d-fce1-c129-420b57da738b",ColumnName="SeqNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ea39d48d-1fe5-edbd-4c21-820a0c7b56f4",
Synchronized="2019-08-30 22:22:59.0")
/** Column name SeqNo */
public static final String COLUMNNAME_SeqNo = "SeqNo";
}
