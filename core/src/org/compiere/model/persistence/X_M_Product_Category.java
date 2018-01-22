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
import org.compiere.model.reference.REF__MMPolicy;
/** Generated Model for M_Product_Category
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_Product_Category extends PO
{
/** Standard Constructor
@param ctx context
@param M_Product_Category_ID id
@param trxName transaction
*/
public X_M_Product_Category (Properties ctx, int M_Product_Category_ID, String trxName)
{
super (ctx, M_Product_Category_ID, trxName);
/** if (M_Product_Category_ID == 0)
{
setIsDefault (false);	
// N
setIsSelfService (true);	
// Y
setMMPolicy (null);	
// F
setM_Product_Category_ID (0);
setName (null);
setPlannedMargin (Env.ZERO);
setValue (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_Product_Category (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=209 */
public static int Table_ID=MTable.getTable_ID("M_Product_Category");

@XendraTrl(Identifier="4b213eeb-114c-f1de-5598-c423f9fd3ca6")
public static String es_PE_TAB_ProductCategory_Description="Definir Categoría de Producto";

@XendraTrl(Identifier="4b213eeb-114c-f1de-5598-c423f9fd3ca6")
public static String es_PE_TAB_ProductCategory_Name="Categoría de Producto";

@XendraTrl(Identifier="4b213eeb-114c-f1de-5598-c423f9fd3ca6")
public static String es_PE_TAB_ProductCategory_Help="La Categoría de Producto define grupos de productos. Las categorías pueden ser usadas para facilitar la generación de listas de precios.";

@XendraTab(Name="Product Category",Description="Define Product Category",
Help="The Product Category defines unique groupings of products.  Product categories can be used in building price lists.",
AD_Window_ID="4e60880d-1a9c-ed56-dba9-3ba9d80c8b83",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="4b213eeb-114c-f1de-5598-c423f9fd3ca6",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ProductCategory="4b213eeb-114c-f1de-5598-c423f9fd3ca6";

@XendraTrl(Identifier="f631232e-7899-e9c1-2ea9-7dafc2456956")
public static String es_PE_TABLE_M_Product_Category_Name="Categoría del Producto";

@XendraTable(Name="Product Category",Description="Category of a Product",Help="",
TableName="M_Product_Category",AccessLevel="3",AD_Window_ID="4e60880d-1a9c-ed56-dba9-3ba9d80c8b83",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=75,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="f631232e-7899-e9c1-2ea9-7dafc2456956",Synchronized="2017-08-16 11:43:27.0")
/** TableName=M_Product_Category */
public static final String Table_Name="M_Product_Category";


@XendraIndex(Name="m_product_category_value",Identifier="d54eb888-2dae-cf28-6fc8-9762a681e2a3",
Column_Names="ad_client_id, value",IsUnique="true",
TableIdentifier="d54eb888-2dae-cf28-6fc8-9762a681e2a3",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_m_product_category_value = "d54eb888-2dae-cf28-6fc8-9762a681e2a3";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_Product_Category");

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
    Table_ID = MTable.getTable_ID("M_Product_Category");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_Product_Category[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Asset Group.
@param A_Asset_Group_ID Group of Assets */
public void setA_Asset_Group_ID (int A_Asset_Group_ID)
{
if (A_Asset_Group_ID <= 0) set_Value (COLUMNNAME_A_Asset_Group_ID, null);
 else 
set_Value (COLUMNNAME_A_Asset_Group_ID, Integer.valueOf(A_Asset_Group_ID));
}
/** Get Asset Group.
@return Group of Assets */
public int getA_Asset_Group_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_A_Asset_Group_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8558ab36-5c4a-73f5-bf71-345b40bb766b")
public static String es_PE_FIELD_ProductCategory_AssetGroup_Description="Grupo de Activos";

@XendraTrl(Identifier="8558ab36-5c4a-73f5-bf71-345b40bb766b")
public static String es_PE_FIELD_ProductCategory_AssetGroup_Help="El grupo de activos determina cuentas por defaul. Si un grupo del activo se selecciona en la categoría de producto, se crean los activos al entregar el activo.";

@XendraTrl(Identifier="8558ab36-5c4a-73f5-bf71-345b40bb766b")
public static String es_PE_FIELD_ProductCategory_AssetGroup_Name="Grupo de Activos";

@XendraField(AD_Column_ID="A_Asset_Group_ID",IsCentrallyMaintained=true,
AD_Tab_ID="4b213eeb-114c-f1de-5598-c423f9fd3ca6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8558ab36-5c4a-73f5-bf71-345b40bb766b")
public static final String FIELDNAME_ProductCategory_AssetGroup="8558ab36-5c4a-73f5-bf71-345b40bb766b";

@XendraTrl(Identifier="c4eab5c3-5f74-b06a-cab7-563eb56809a2")
public static String es_PE_COLUMN_A_Asset_Group_ID_Name="Grupo de Activos";

@XendraColumn(AD_Element_ID="3a79bddc-9d44-ce11-0e83-79f37639b27e",ColumnName="A_Asset_Group_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c4eab5c3-5f74-b06a-cab7-563eb56809a2",
Synchronized="2017-08-05 16:55:23.0")
/** Column name A_Asset_Group_ID */
public static final String COLUMNNAME_A_Asset_Group_ID = "A_Asset_Group_ID";
/** Set Print Color.
@param AD_PrintColor_ID Color used for printing and display */
public void setAD_PrintColor_ID (int AD_PrintColor_ID)
{
if (AD_PrintColor_ID <= 0) set_Value (COLUMNNAME_AD_PrintColor_ID, null);
 else 
set_Value (COLUMNNAME_AD_PrintColor_ID, Integer.valueOf(AD_PrintColor_ID));
}
/** Get Print Color.
@return Color used for printing and display */
public int getAD_PrintColor_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_PrintColor_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="99d95821-14a2-f9fe-68d2-8cbd629ec9c4")
public static String es_PE_FIELD_ProductCategory_PrintColor_Description="Color usado para imprimir";

@XendraTrl(Identifier="99d95821-14a2-f9fe-68d2-8cbd629ec9c4")
public static String es_PE_FIELD_ProductCategory_PrintColor_Help="Color usado para imprimir";

@XendraTrl(Identifier="99d95821-14a2-f9fe-68d2-8cbd629ec9c4")
public static String es_PE_FIELD_ProductCategory_PrintColor_Name="Impresión a Color";

@XendraField(AD_Column_ID="AD_PrintColor_ID",IsCentrallyMaintained=true,
AD_Tab_ID="4b213eeb-114c-f1de-5598-c423f9fd3ca6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="99d95821-14a2-f9fe-68d2-8cbd629ec9c4")
public static final String FIELDNAME_ProductCategory_PrintColor="99d95821-14a2-f9fe-68d2-8cbd629ec9c4";

@XendraTrl(Identifier="bb234863-d768-49c7-0f0a-746d53c2b4df")
public static String es_PE_COLUMN_AD_PrintColor_ID_Name="Impresión a Color";

@XendraColumn(AD_Element_ID="fa351bf7-0efd-2c6a-da0b-f514d630b8e6",ColumnName="AD_PrintColor_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bb234863-d768-49c7-0f0a-746d53c2b4df",
Synchronized="2017-08-05 16:55:23.0")
/** Column name AD_PrintColor_ID */
public static final String COLUMNNAME_AD_PrintColor_ID = "AD_PrintColor_ID";
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

@XendraTrl(Identifier="0693cc54-be8b-8d1c-dd20-cae185125944")
public static String es_PE_FIELD_ProductCategory_Description_Description="Observación";

@XendraTrl(Identifier="0693cc54-be8b-8d1c-dd20-cae185125944")
public static String es_PE_FIELD_ProductCategory_Description_Help="Observación";

@XendraTrl(Identifier="0693cc54-be8b-8d1c-dd20-cae185125944")
public static String es_PE_FIELD_ProductCategory_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="4b213eeb-114c-f1de-5598-c423f9fd3ca6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0693cc54-be8b-8d1c-dd20-cae185125944")
public static final String FIELDNAME_ProductCategory_Description="0693cc54-be8b-8d1c-dd20-cae185125944";

@XendraTrl(Identifier="4b21f68d-d279-919a-01ba-e1fa5bf93c85")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4b21f68d-d279-919a-01ba-e1fa5bf93c85",
Synchronized="2017-08-05 16:55:23.0")
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
@XendraTrl(Identifier="7d25f77f-9569-4046-a6b8-a89fd5d71ed5")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7d25f77f-9569-4046-a6b8-a89fd5d71ed5",
Synchronized="2017-08-05 16:55:23.0")
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

@XendraTrl(Identifier="2550c6af-9623-5749-2b1e-4e39a4b932a2")
public static String es_PE_FIELD_ProductCategory_Default_Description="Valor Predeterminado";

@XendraTrl(Identifier="2550c6af-9623-5749-2b1e-4e39a4b932a2")
public static String es_PE_FIELD_ProductCategory_Default_Help="El cuadro de verificación indica si este registro será usado como un valor predeterminado";

@XendraTrl(Identifier="2550c6af-9623-5749-2b1e-4e39a4b932a2")
public static String es_PE_FIELD_ProductCategory_Default_Name="Predeterminado";

@XendraField(AD_Column_ID="IsDefault",IsCentrallyMaintained=true,
AD_Tab_ID="4b213eeb-114c-f1de-5598-c423f9fd3ca6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2550c6af-9623-5749-2b1e-4e39a4b932a2")
public static final String FIELDNAME_ProductCategory_Default="2550c6af-9623-5749-2b1e-4e39a4b932a2";

@XendraTrl(Identifier="7e37b383-9b1c-c3a4-a170-f0d06d4d36d4")
public static String es_PE_COLUMN_IsDefault_Name="Predeterminado";

@XendraColumn(AD_Element_ID="8617f892-e113-a5fd-8715-687f792f136c",ColumnName="IsDefault",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7e37b383-9b1c-c3a4-a170-f0d06d4d36d4",
Synchronized="2017-08-05 16:55:23.0")
/** Column name IsDefault */
public static final String COLUMNNAME_IsDefault = "IsDefault";
/** Set Self-Service.
@param IsSelfService This is a Self-Service entry or this entry can be changed via Self-Service */
public void setIsSelfService (boolean IsSelfService)
{
set_Value (COLUMNNAME_IsSelfService, Boolean.valueOf(IsSelfService));
}
/** Get Self-Service.
@return This is a Self-Service entry or this entry can be changed via Self-Service */
public boolean isSelfService() 
{
Object oo = get_Value(COLUMNNAME_IsSelfService);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="b6578eae-4cc5-eaf7-0f7a-3261bdc56235")
public static String es_PE_FIELD_ProductCategory_Self_Service_Description="Esta es una entrada del autoservicio ó esta entrada se puede cambiar vía autoservicio";

@XendraTrl(Identifier="b6578eae-4cc5-eaf7-0f7a-3261bdc56235")
public static String es_PE_FIELD_ProductCategory_Self_Service_Help="El autoservicio permite que los usuarios incorporen datos o que pongan al día sus datos. La bandera indica, que este expediente fue incorporado o creado vía autoservicio o que el usuario puede cambiarlo vía funcionalidad del autoservicio.";

@XendraTrl(Identifier="b6578eae-4cc5-eaf7-0f7a-3261bdc56235")
public static String es_PE_FIELD_ProductCategory_Self_Service_Name="Auto-Servicio";

@XendraField(AD_Column_ID="IsSelfService",IsCentrallyMaintained=true,
AD_Tab_ID="4b213eeb-114c-f1de-5598-c423f9fd3ca6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b6578eae-4cc5-eaf7-0f7a-3261bdc56235")
public static final String FIELDNAME_ProductCategory_Self_Service="b6578eae-4cc5-eaf7-0f7a-3261bdc56235";

@XendraTrl(Identifier="259c3cd4-57da-0e3b-fa01-573bedcc2414")
public static String es_PE_COLUMN_IsSelfService_Name="Auto-Servicio";

@XendraColumn(AD_Element_ID="8f201030-f9ab-66d2-f4de-7209f41f2af8",ColumnName="IsSelfService",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="259c3cd4-57da-0e3b-fa01-573bedcc2414",
Synchronized="2017-08-05 16:55:23.0")
/** Column name IsSelfService */
public static final String COLUMNNAME_IsSelfService = "IsSelfService";

/** MMPolicy AD_Reference=a00dc4c4-1532-e484-fdd2-81ec830cf15b */
public static final int MMPOLICY_AD_Reference_ID=335;
/** Set Material Policy.
@param MMPolicy Material Movement Policy */
public void setMMPolicy (String MMPolicy)
{
if (MMPolicy == null) throw new IllegalArgumentException ("MMPolicy is mandatory");
if (MMPolicy.equals(REF__MMPolicy.LiFo) || MMPolicy.equals(REF__MMPolicy.FiFo) || MMPolicy.equals(REF__MMPolicy.FeFo));
 else throw new IllegalArgumentException ("MMPolicy Invalid value - " + MMPolicy + " - Reference_ID=335 - L - F - E");
if (MMPolicy.length() > 1)
{
log.warning("Length > 1 - truncated");
MMPolicy = MMPolicy.substring(0,0);
}
set_Value (COLUMNNAME_MMPolicy, MMPolicy);
}
/** Get Material Policy.
@return Material Movement Policy */
public String getMMPolicy() 
{
return (String)get_Value(COLUMNNAME_MMPolicy);
}

@XendraTrl(Identifier="bbf4693c-7a89-a640-465d-685262a9b2ee")
public static String es_PE_FIELD_ProductCategory_MaterialPolicy_Description="Política de movimiento de material.";

@XendraTrl(Identifier="bbf4693c-7a89-a640-465d-685262a9b2ee")
public static String es_PE_FIELD_ProductCategory_MaterialPolicy_Help="La politica de movimiento determina como esta fluyendo la acción (PEPS ó UEPS) si un caso específico del producto no fue seleccionado. La política no puede contradecir el método de costeo (ej. PEPS movimiento de politica y UEPS metodo de costeo).";

@XendraTrl(Identifier="bbf4693c-7a89-a640-465d-685262a9b2ee")
public static String es_PE_FIELD_ProductCategory_MaterialPolicy_Name="Política de Material";

@XendraField(AD_Column_ID="MMPolicy",IsCentrallyMaintained=true,
AD_Tab_ID="4b213eeb-114c-f1de-5598-c423f9fd3ca6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bbf4693c-7a89-a640-465d-685262a9b2ee")
public static final String FIELDNAME_ProductCategory_MaterialPolicy="bbf4693c-7a89-a640-465d-685262a9b2ee";

@XendraTrl(Identifier="96ea7dd4-235e-a172-8ff3-1b567c8bae37")
public static String es_PE_COLUMN_MMPolicy_Name="Política de Material";

@XendraColumn(AD_Element_ID="835a2dfb-454a-24bc-fd20-11ca86233a2b",ColumnName="MMPolicy",
AD_Reference_ID=17,AD_Reference_Value_ID="a00dc4c4-1532-e484-fdd2-81ec830cf15b",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="F",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="96ea7dd4-235e-a172-8ff3-1b567c8bae37",Synchronized="2017-08-05 16:55:23.0")
/** Column name MMPolicy */
public static final String COLUMNNAME_MMPolicy = "MMPolicy";
/** Set Product Category.
@param M_Product_Category_ID Category of a Product */
public void setM_Product_Category_ID (int M_Product_Category_ID)
{
if (M_Product_Category_ID < 1) throw new IllegalArgumentException ("M_Product_Category_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_Product_Category_ID, Integer.valueOf(M_Product_Category_ID));
}
/** Get Product Category.
@return Category of a Product */
public int getM_Product_Category_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_Category_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1285b5a2-db5d-c6bc-8202-00f0eb7dedb7")
public static String es_PE_FIELD_ProductCategory_ProductCategory_Description="Categoría de la que este producto es parte";

@XendraTrl(Identifier="1285b5a2-db5d-c6bc-8202-00f0eb7dedb7")
public static String es_PE_FIELD_ProductCategory_ProductCategory_Help="Identifica la categoría a la que pertenece este producto. Las categorías del producto son usadas para el cálculo de precios";

@XendraTrl(Identifier="1285b5a2-db5d-c6bc-8202-00f0eb7dedb7")
public static String es_PE_FIELD_ProductCategory_ProductCategory_Name="Categoría del Producto";

@XendraField(AD_Column_ID="M_Product_Category_ID",IsCentrallyMaintained=true,
AD_Tab_ID="4b213eeb-114c-f1de-5598-c423f9fd3ca6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1285b5a2-db5d-c6bc-8202-00f0eb7dedb7")
public static final String FIELDNAME_ProductCategory_ProductCategory="1285b5a2-db5d-c6bc-8202-00f0eb7dedb7";
/** Column name M_Product_Category_ID */
public static final String COLUMNNAME_M_Product_Category_ID = "M_Product_Category_ID";

/** M_Product_Category_Parent_ID AD_Reference=36e5e285-96f7-de95-1ec8-5e02581d0f51 */
public static final int M_PRODUCT_CATEGORY_PARENT_ID_AD_Reference_ID=163;
/** Set M_Product_Category_Parent_ID.
@param M_Product_Category_Parent_ID M_Product_Category_Parent_ID */
public void setM_Product_Category_Parent_ID (int M_Product_Category_Parent_ID)
{
if (M_Product_Category_Parent_ID <= 0) set_Value (COLUMNNAME_M_Product_Category_Parent_ID, null);
 else 
set_Value (COLUMNNAME_M_Product_Category_Parent_ID, Integer.valueOf(M_Product_Category_Parent_ID));
}
/** Get M_Product_Category_Parent_ID.
@return M_Product_Category_Parent_ID */
public int getM_Product_Category_Parent_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_Category_Parent_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="02733d78-dcf5-891d-be10-7d16a4f9d59f")
public static String es_PE_FIELD_ProductCategory_M_Product_Category_Parent_ID_Name="M_Product_Category_Parent_ID";

@XendraField(AD_Column_ID="M_Product_Category_Parent_ID",IsCentrallyMaintained=true,
AD_Tab_ID="4b213eeb-114c-f1de-5598-c423f9fd3ca6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="02733d78-dcf5-891d-be10-7d16a4f9d59f")
public static final String FIELDNAME_ProductCategory_M_Product_Category_Parent_ID="02733d78-dcf5-891d-be10-7d16a4f9d59f";

@XendraTrl(Identifier="00412142-eb04-b1b4-59a8-ac46dd386126")
public static String es_PE_COLUMN_M_Product_Category_Parent_ID_Name="m_product_category_parent_id";

@XendraColumn(AD_Element_ID="fce7e4cd-629d-c272-cbda-874319f7f8f0",
ColumnName="M_Product_Category_Parent_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="36e5e285-96f7-de95-1ec8-5e02581d0f51",AD_Val_Rule_ID="",FieldLength=10,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="00412142-eb04-b1b4-59a8-ac46dd386126",
Synchronized="2017-08-05 16:55:23.0")
/** Column name M_Product_Category_Parent_ID */
public static final String COLUMNNAME_M_Product_Category_Parent_ID = "M_Product_Category_Parent_ID";
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

@XendraTrl(Identifier="0b43b1b4-bb0b-1cba-f334-3abd66a6d3d8")
public static String es_PE_FIELD_ProductCategory_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="0b43b1b4-bb0b-1cba-f334-3abd66a6d3d8")
public static String es_PE_FIELD_ProductCategory_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="0b43b1b4-bb0b-1cba-f334-3abd66a6d3d8")
public static String es_PE_FIELD_ProductCategory_Name_Name="Nombre";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="4b213eeb-114c-f1de-5598-c423f9fd3ca6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0b43b1b4-bb0b-1cba-f334-3abd66a6d3d8")
public static final String FIELDNAME_ProductCategory_Name="0b43b1b4-bb0b-1cba-f334-3abd66a6d3d8";

@XendraTrl(Identifier="de53cb9c-7a9b-9ea0-d5ad-b680db280b6c")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="de53cb9c-7a9b-9ea0-d5ad-b680db280b6c",
Synchronized="2017-08-05 16:55:23.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Planned Margin %.
@param PlannedMargin Project's planned margin as a percentage */
public void setPlannedMargin (BigDecimal PlannedMargin)
{
if (PlannedMargin == null) throw new IllegalArgumentException ("PlannedMargin is mandatory.");
set_Value (COLUMNNAME_PlannedMargin, PlannedMargin);
}
/** Get Planned Margin %.
@return Project's planned margin as a percentage */
public BigDecimal getPlannedMargin() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PlannedMargin);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="364e2c47-79c8-d210-f979-1786cc5de183")
public static String es_PE_FIELD_ProductCategory_PlannedMargin_Description="% de Margen Planeado para este proyecto";

@XendraTrl(Identifier="364e2c47-79c8-d210-f979-1786cc5de183")
public static String es_PE_FIELD_ProductCategory_PlannedMargin_Help="El Porcentaje de Margen Planeado indica el porcentaje de margen anticipado para este proyecto o línea de proyecto";

@XendraTrl(Identifier="364e2c47-79c8-d210-f979-1786cc5de183")
public static String es_PE_FIELD_ProductCategory_PlannedMargin_Name="% de Margen Planeado";

@XendraField(AD_Column_ID="PlannedMargin",IsCentrallyMaintained=true,
AD_Tab_ID="4b213eeb-114c-f1de-5598-c423f9fd3ca6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="364e2c47-79c8-d210-f979-1786cc5de183")
public static final String FIELDNAME_ProductCategory_PlannedMargin="364e2c47-79c8-d210-f979-1786cc5de183";

@XendraTrl(Identifier="b0710de3-eca4-b82d-5833-45b3d7ec1f0d")
public static String es_PE_COLUMN_PlannedMargin_Name="% de Margen Planeado";

@XendraColumn(AD_Element_ID="f2be0f16-4e0f-1448-e281-71bf95aa68a5",ColumnName="PlannedMargin",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b0710de3-eca4-b82d-5833-45b3d7ec1f0d",
Synchronized="2017-08-05 16:55:23.0")
/** Column name PlannedMargin */
public static final String COLUMNNAME_PlannedMargin = "PlannedMargin";
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
@XendraTrl(Identifier="55e788e1-578f-125c-f830-5a142606c515")
public static String es_PE_FIELD_ProductCategory_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="55e788e1-578f-125c-f830-5a142606c515")
public static String es_PE_FIELD_ProductCategory_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraTrl(Identifier="55e788e1-578f-125c-f830-5a142606c515")
public static String es_PE_FIELD_ProductCategory_SearchKey_Name="Clave de Búsqueda";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="4b213eeb-114c-f1de-5598-c423f9fd3ca6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="55e788e1-578f-125c-f830-5a142606c515")
public static final String FIELDNAME_ProductCategory_SearchKey="55e788e1-578f-125c-f830-5a142606c515";

@XendraTrl(Identifier="3e78a046-7039-0de1-11c6-b376777dca3e")
public static String es_PE_COLUMN_Value_Name="Clave de Búsqueda";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3e78a046-7039-0de1-11c6-b376777dca3e",
Synchronized="2017-08-05 16:55:23.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
}
