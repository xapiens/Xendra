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
/** Generated Model for PA_GoalRestriction
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_PA_GoalRestriction extends PO
{
/** Standard Constructor
@param ctx context
@param PA_GoalRestriction_ID id
@param trxName transaction
*/
public X_PA_GoalRestriction (Properties ctx, int PA_GoalRestriction_ID, String trxName)
{
super (ctx, PA_GoalRestriction_ID, trxName);
/** if (PA_GoalRestriction_ID == 0)
{
setGoalRestrictionType (null);
setName (null);
setPA_Goal_ID (0);
setPA_GoalRestriction_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_PA_GoalRestriction (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=832 */
public static int Table_ID=MTable.getTable_ID("PA_GoalRestriction");

@XendraTrl(Identifier="8aaec98f-a29d-2d00-9362-ba3791d46eb9")
public static String es_PE_TAB_Restriction_Description="Restricción de Meta del Desempeño ";

@XendraTrl(Identifier="8aaec98f-a29d-2d00-9362-ba3791d46eb9")
public static String es_PE_TAB_Restriction_Help="Restricción de  la medida de desempeño para la Organización, Socio del Negocio o Producto definido.Ejemplo: El desempeño solo es medido para HQ.La medida debe soportar la información, sino es ignorada.";

@XendraTrl(Identifier="8aaec98f-a29d-2d00-9362-ba3791d46eb9")
public static String es_PE_TAB_Restriction_Name="Restricción";
@XendraTab(Name="Restriction",
Description="Performance Goal Restriction",
Help="Restriction of the performance measure to the Organization, Business Partner or Product defined. Example: The performance is only measured for HQ The measure must support the data, otherwise it is ignored.",
AD_Window_ID="862a0f62-314c-f80f-95c1-8aa84c5ab9f8",SeqNo=30,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="8aaec98f-a29d-2d00-9362-ba3791d46eb9",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Restriction="8aaec98f-a29d-2d00-9362-ba3791d46eb9";

@XendraTrl(Identifier="ffe43043-3e97-52f8-30cd-6c64e5364de6")
public static String es_PE_TABLE_PA_GoalRestriction_Name="Goal Restriction";

@XendraTable(Name="Goal Restriction",AD_Package_ID="34bf6e21-8c70-8fb9-604c-a300eb925459",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Performance Goal Restriction",
Help="",TableName="PA_GoalRestriction",AccessLevel="6",
AD_Window_ID="862a0f62-314c-f80f-95c1-8aa84c5ab9f8",AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.performanceanalysis",
Identifier="ffe43043-3e97-52f8-30cd-6c64e5364de6",Synchronized="2020-03-03 21:39:02.0")
/** TableName=PA_GoalRestriction */
public static final String Table_Name="PA_GoalRestriction";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"PA_GoalRestriction");

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
    Table_ID = MTable.getTable_ID("PA_GoalRestriction");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_PA_GoalRestriction[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Business Partner .
@param C_BPartner_ID Identifies a Business Partner */
public void setC_BPartner_ID (int C_BPartner_ID)
{
if (C_BPartner_ID <= 0) set_Value (COLUMNNAME_C_BPartner_ID, null);
 else 
set_Value (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
}
/** Get Business Partner .
@return Identifies a Business Partner */
public int getC_BPartner_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e15d0ccc-a4fb-c92e-5301-cc0d4044c5f9")
public static String es_PE_FIELD_Restriction_BusinessPartner_Name="Socio de Negocio";

@XendraTrl(Identifier="e15d0ccc-a4fb-c92e-5301-cc0d4044c5f9")
public static String es_PE_FIELD_Restriction_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="e15d0ccc-a4fb-c92e-5301-cc0d4044c5f9")
public static String es_PE_FIELD_Restriction_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8aaec98f-a29d-2d00-9362-ba3791d46eb9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@GoalRestrictionType@=B",DisplayLength=10,IsReadOnly=false,SeqNo=80,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="e15d0ccc-a4fb-c92e-5301-cc0d4044c5f9")
public static final String FIELDNAME_Restriction_BusinessPartner="e15d0ccc-a4fb-c92e-5301-cc0d4044c5f9";

@XendraTrl(Identifier="2b400c30-6414-810b-4d37-03494b3d41ec")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2b400c30-6414-810b-4d37-03494b3d41ec",
Synchronized="2019-08-30 22:23:36.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set Business Partner Group.
@param C_BP_Group_ID Business Partner Group */
public void setC_BP_Group_ID (int C_BP_Group_ID)
{
if (C_BP_Group_ID <= 0) set_Value (COLUMNNAME_C_BP_Group_ID, null);
 else 
set_Value (COLUMNNAME_C_BP_Group_ID, Integer.valueOf(C_BP_Group_ID));
}
/** Get Business Partner Group.
@return Business Partner Group */
public int getC_BP_Group_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BP_Group_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e3a86d9b-79af-4245-9090-5079c4074641")
public static String es_PE_FIELD_Restriction_BusinessPartnerGroup_Name="Grupo de Socio de Negocio";

@XendraTrl(Identifier="e3a86d9b-79af-4245-9090-5079c4074641")
public static String es_PE_FIELD_Restriction_BusinessPartnerGroup_Description="ID del Grupo de Socio de Negocio";

@XendraTrl(Identifier="e3a86d9b-79af-4245-9090-5079c4074641")
public static String es_PE_FIELD_Restriction_BusinessPartnerGroup_Help="La ID Grupo del Socio de Negocio proporciona un método de definir valores predeterminados a ser usados para Socios de Negocio individuales.";

@XendraField(AD_Column_ID="C_BP_Group_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8aaec98f-a29d-2d00-9362-ba3791d46eb9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@GoalRestrictionType@=G",DisplayLength=10,IsReadOnly=false,SeqNo=90,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="e3a86d9b-79af-4245-9090-5079c4074641")
public static final String FIELDNAME_Restriction_BusinessPartnerGroup="e3a86d9b-79af-4245-9090-5079c4074641";

@XendraTrl(Identifier="5fcd7969-856c-4398-c1e1-0b0b5dcef87b")
public static String es_PE_COLUMN_C_BP_Group_ID_Name="Grupo de Socio de Negocio";

@XendraColumn(AD_Element_ID="e4bea975-0a3a-c828-703f-724f29c7518a",ColumnName="C_BP_Group_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5fcd7969-856c-4398-c1e1-0b0b5dcef87b",
Synchronized="2019-08-30 22:23:36.0")
/** Column name C_BP_Group_ID */
public static final String COLUMNNAME_C_BP_Group_ID = "C_BP_Group_ID";
/** Set Restriction Type.
@param GoalRestrictionType Goal Restriction Type */
public void setGoalRestrictionType (String GoalRestrictionType)
{
if (GoalRestrictionType.length() > 1)
{
log.warning("Length > 1 - truncated");
GoalRestrictionType = GoalRestrictionType.substring(0,0);
}
set_Value (COLUMNNAME_GoalRestrictionType, GoalRestrictionType);
}
/** Get Restriction Type.
@return Goal Restriction Type */
public String getGoalRestrictionType() 
{
return (String)get_Value(COLUMNNAME_GoalRestrictionType);
}

@XendraTrl(Identifier="eaa4d1e3-e224-efab-9c56-99d721398630")
public static String es_PE_FIELD_Restriction_RestrictionType_Name="Tipo de Restricción";

@XendraTrl(Identifier="eaa4d1e3-e224-efab-9c56-99d721398630")
public static String es_PE_FIELD_Restriction_RestrictionType_Description="Tipo de Restricción Meta";

@XendraTrl(Identifier="eaa4d1e3-e224-efab-9c56-99d721398630")
public static String es_PE_FIELD_Restriction_RestrictionType_Help="Ingrese uno o más registros por Tipo de Restricción Meta (ej. Org o1, o2)";

@XendraField(AD_Column_ID="GoalRestrictionType",IsCentrallyMaintained=true,
AD_Tab_ID="8aaec98f-a29d-2d00-9362-ba3791d46eb9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="eaa4d1e3-e224-efab-9c56-99d721398630")
public static final String FIELDNAME_Restriction_RestrictionType="eaa4d1e3-e224-efab-9c56-99d721398630";

@XendraTrl(Identifier="0218c2e6-11d6-1eee-d1ba-8d78e11e6976")
public static String es_PE_COLUMN_GoalRestrictionType_Name="Tipo de Restricción";

@XendraColumn(AD_Element_ID="ebb393e7-b444-9ca2-858f-c64159a58ab6",
ColumnName="GoalRestrictionType",AD_Reference_ID=17,
AD_Reference_Value_ID="1bf6024a-4612-c6c4-ca75-eaf7b4295b7f",AD_Val_Rule_ID="",FieldLength=1,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="0218c2e6-11d6-1eee-d1ba-8d78e11e6976",
Synchronized="2019-08-30 22:23:36.0")
/** Column name GoalRestrictionType */
public static final String COLUMNNAME_GoalRestrictionType = "GoalRestrictionType";
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
@XendraTrl(Identifier="cc30151b-5927-472e-94e6-916408d3261f")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cc30151b-5927-472e-94e6-916408d3261f",
Synchronized="2019-08-30 22:23:37.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Product Category.
@param M_Product_Category_ID Category of a Product */
public void setM_Product_Category_ID (int M_Product_Category_ID)
{
if (M_Product_Category_ID <= 0) set_Value (COLUMNNAME_M_Product_Category_ID, null);
 else 
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

@XendraTrl(Identifier="717d104d-7473-a2de-f701-126f825ab72c")
public static String es_PE_FIELD_Restriction_ProductCategory_Name="Categoría del Producto";

@XendraTrl(Identifier="717d104d-7473-a2de-f701-126f825ab72c")
public static String es_PE_FIELD_Restriction_ProductCategory_Description="Categoría de la que este producto es parte";

@XendraTrl(Identifier="717d104d-7473-a2de-f701-126f825ab72c")
public static String es_PE_FIELD_Restriction_ProductCategory_Help="Identifica la categoría a la que pertenece este producto. Las categorías del producto son usadas para el cálculo de precios";

@XendraField(AD_Column_ID="M_Product_Category_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8aaec98f-a29d-2d00-9362-ba3791d46eb9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@GoalRestrictionType@=C",DisplayLength=10,IsReadOnly=false,SeqNo=110,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="717d104d-7473-a2de-f701-126f825ab72c")
public static final String FIELDNAME_Restriction_ProductCategory="717d104d-7473-a2de-f701-126f825ab72c";

@XendraTrl(Identifier="9c79e22c-9816-6b1c-eb92-3e0aba497b22")
public static String es_PE_COLUMN_M_Product_Category_ID_Name="Categoría del Producto";

@XendraColumn(AD_Element_ID="80d3e0bb-473b-67d4-42d5-1d776006a69c",
ColumnName="M_Product_Category_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="9c79e22c-9816-6b1c-eb92-3e0aba497b22",Synchronized="2019-08-30 22:23:37.0")
/** Column name M_Product_Category_ID */
public static final String COLUMNNAME_M_Product_Category_ID = "M_Product_Category_ID";
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

@XendraTrl(Identifier="cc72d982-5e47-9761-469c-d28d0500950e")
public static String es_PE_FIELD_Restriction_Product_Name="Producto";

@XendraTrl(Identifier="cc72d982-5e47-9761-469c-d28d0500950e")
public static String es_PE_FIELD_Restriction_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="cc72d982-5e47-9761-469c-d28d0500950e")
public static String es_PE_FIELD_Restriction_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8aaec98f-a29d-2d00-9362-ba3791d46eb9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@GoalRestrictionType@=P",DisplayLength=10,IsReadOnly=false,SeqNo=100,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="cc72d982-5e47-9761-469c-d28d0500950e")
public static final String FIELDNAME_Restriction_Product="cc72d982-5e47-9761-469c-d28d0500950e";

@XendraTrl(Identifier="82d5207c-6b15-768a-b9d8-f037983c35f1")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="82d5207c-6b15-768a-b9d8-f037983c35f1",
Synchronized="2019-08-30 22:23:37.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name == null) throw new IllegalArgumentException ("Name is mandatory.");
if (Name.length() > 120)
{
log.warning("Length > 120 - truncated");
Name = Name.substring(0,119);
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

@XendraTrl(Identifier="73ac3f1f-bb4b-0136-159c-8c277a1fdd29")
public static String es_PE_FIELD_Restriction_Name_Name="Nombre";

@XendraTrl(Identifier="73ac3f1f-bb4b-0136-159c-8c277a1fdd29")
public static String es_PE_FIELD_Restriction_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="73ac3f1f-bb4b-0136-159c-8c277a1fdd29")
public static String es_PE_FIELD_Restriction_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="8aaec98f-a29d-2d00-9362-ba3791d46eb9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=120,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="73ac3f1f-bb4b-0136-159c-8c277a1fdd29")
public static final String FIELDNAME_Restriction_Name="73ac3f1f-bb4b-0136-159c-8c277a1fdd29";

@XendraTrl(Identifier="b52f2dba-5f52-9a91-1088-106cabb43f2b")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b52f2dba-5f52-9a91-1088-106cabb43f2b",
Synchronized="2019-08-30 22:23:37.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Organization.
@param Org_ID Organizational entity within client */
public void setOrg_ID (int Org_ID)
{
if (Org_ID <= 0) set_Value (COLUMNNAME_Org_ID, null);
 else 
set_Value (COLUMNNAME_Org_ID, Integer.valueOf(Org_ID));
}
/** Get Organization.
@return Organizational entity within client */
public int getOrg_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Org_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="fa04442b-b0d7-b092-08ef-622d2d2b717c")
public static String es_PE_FIELD_Restriction_Organization_Name="Organización";

@XendraTrl(Identifier="fa04442b-b0d7-b092-08ef-622d2d2b717c")
public static String es_PE_FIELD_Restriction_Organization_Description="Entidad organizacional dentro de la empresa.";

@XendraTrl(Identifier="fa04442b-b0d7-b092-08ef-622d2d2b717c")
public static String es_PE_FIELD_Restriction_Organization_Help="Una organización es una unidad de su compañía ó entidad legal. Ej. tiendas; departamentos";

@XendraField(AD_Column_ID="Org_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8aaec98f-a29d-2d00-9362-ba3791d46eb9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@GoalRestrictionType@=O",DisplayLength=10,IsReadOnly=false,SeqNo=70,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="fa04442b-b0d7-b092-08ef-622d2d2b717c")
public static final String FIELDNAME_Restriction_Organization="fa04442b-b0d7-b092-08ef-622d2d2b717c";

@XendraTrl(Identifier="91beb3e3-5b0b-7345-8767-61a66733a120")
public static String es_PE_COLUMN_Org_ID_Name="Organización";

@XendraColumn(AD_Element_ID="a4e75444-9eb1-c885-3445-9b55e2eb765a",ColumnName="Org_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="03b73d55-8464-9bbd-df2b-d10ff9f3913f",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="91beb3e3-5b0b-7345-8767-61a66733a120",Synchronized="2019-08-30 22:23:37.0")
/** Column name Org_ID */
public static final String COLUMNNAME_Org_ID = "Org_ID";
/** Set Goal.
@param PA_Goal_ID Performance Goal */
public void setPA_Goal_ID (int PA_Goal_ID)
{
if (PA_Goal_ID < 1) throw new IllegalArgumentException ("PA_Goal_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_PA_Goal_ID, Integer.valueOf(PA_Goal_ID));
}
/** Get Goal.
@return Performance Goal */
public int getPA_Goal_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PA_Goal_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="12182edb-a714-5b02-7cf5-17ec2b22c18c")
public static String es_PE_FIELD_Restriction_Goal_Name="Objetivo";

@XendraTrl(Identifier="12182edb-a714-5b02-7cf5-17ec2b22c18c")
public static String es_PE_FIELD_Restriction_Goal_Description="Objetivo de desempeño";

@XendraTrl(Identifier="12182edb-a714-5b02-7cf5-17ec2b22c18c")
public static String es_PE_FIELD_Restriction_Goal_Help="La meta de desempeño indica contra que será medido este desempeño de usuarios.";

@XendraField(AD_Column_ID="PA_Goal_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8aaec98f-a29d-2d00-9362-ba3791d46eb9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="12182edb-a714-5b02-7cf5-17ec2b22c18c")
public static final String FIELDNAME_Restriction_Goal="12182edb-a714-5b02-7cf5-17ec2b22c18c";

@XendraTrl(Identifier="b10baf9c-1275-7127-0bcd-86218527c754")
public static String es_PE_COLUMN_PA_Goal_ID_Name="Objetivo";

@XendraColumn(AD_Element_ID="b420dc38-c0bb-b595-f769-833f2dd4282f",ColumnName="PA_Goal_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b10baf9c-1275-7127-0bcd-86218527c754",
Synchronized="2019-08-30 22:23:37.0")
/** Column name PA_Goal_ID */
public static final String COLUMNNAME_PA_Goal_ID = "PA_Goal_ID";
/** Set Goal Restriction.
@param PA_GoalRestriction_ID Performance Goal Restriction */
public void setPA_GoalRestriction_ID (int PA_GoalRestriction_ID)
{
if (PA_GoalRestriction_ID < 1) throw new IllegalArgumentException ("PA_GoalRestriction_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_PA_GoalRestriction_ID, Integer.valueOf(PA_GoalRestriction_ID));
}
/** Get Goal Restriction.
@return Performance Goal Restriction */
public int getPA_GoalRestriction_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PA_GoalRestriction_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="afb457f8-b113-34d7-7f90-2138182dbedb")
public static String es_PE_FIELD_Restriction_GoalRestriction_Name="Goal Restriction";

@XendraTrl(Identifier="afb457f8-b113-34d7-7f90-2138182dbedb")
public static String es_PE_FIELD_Restriction_GoalRestriction_Description="Performance Goal Restriction";

@XendraTrl(Identifier="afb457f8-b113-34d7-7f90-2138182dbedb")
public static String es_PE_FIELD_Restriction_GoalRestriction_Help="Restriction of the performance measure to the Organization, Business Partner or Product defined.Example: The performance is only measured for HQThe measure must support the data, otherwise it is ignored.";

@XendraField(AD_Column_ID="PA_GoalRestriction_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8aaec98f-a29d-2d00-9362-ba3791d46eb9",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="afb457f8-b113-34d7-7f90-2138182dbedb")
public static final String FIELDNAME_Restriction_GoalRestriction="afb457f8-b113-34d7-7f90-2138182dbedb";
/** Column name PA_GoalRestriction_ID */
public static final String COLUMNNAME_PA_GoalRestriction_ID = "PA_GoalRestriction_ID";
}
