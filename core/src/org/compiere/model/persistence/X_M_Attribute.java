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
/** Generated Model for M_Attribute
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_Attribute extends PO
{
/** Standard Constructor
@param ctx context
@param M_Attribute_ID id
@param trxName transaction
*/
public X_M_Attribute (Properties ctx, int M_Attribute_ID, String trxName)
{
super (ctx, M_Attribute_ID, trxName);
/** if (M_Attribute_ID == 0)
{
setAttributeValueType (null);	
// S
setIsInstanceAttribute (false);	
// N
setIsMandatory (false);	
// N
setM_Attribute_ID (0);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_Attribute (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=562 */
public static int Table_ID=MTable.getTable_ID("M_Attribute");

@XendraTrl(Identifier="8104d925-fdad-894e-6a45-92fe31d21262")
public static String es_PE_TAB_Attribute_Description="Atributos de Producto";

@XendraTrl(Identifier="8104d925-fdad-894e-6a45-92fe31d21262")
public static String es_PE_TAB_Attribute_Help="Cualidad de producto como color, tamaño, etc. Si es una cualidad del caso, todos los productos tienen el mismo valor.";

@XendraTrl(Identifier="8104d925-fdad-894e-6a45-92fe31d21262")
public static String es_PE_TAB_Attribute_Name="Atributos";
@XendraTab(Name="Attribute",
Description="Product Attribute",
Help="Product Attribute like Color, Size, etc.  If it is an Instance Attribute, all products have the same value.",
AD_Window_ID="1b6bcb89-ad62-5249-c6bc-bf851e4e624f",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="8104d925-fdad-894e-6a45-92fe31d21262",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Attribute="8104d925-fdad-894e-6a45-92fe31d21262";

@XendraTrl(Identifier="d44a957c-5efe-179e-611b-d15be1f0ff4f")
public static String es_PE_TAB_AssignedAttributes_Description="Atributos Asignados en la Búsqueda de Atributos";

@XendraTrl(Identifier="d44a957c-5efe-179e-611b-d15be1f0ff4f")
public static String es_PE_TAB_AssignedAttributes_Name="Atributos Asignados";

@XendraTab(Name="Assigned Attributes",Description="Attributes assigned to this search attribute",
Help="",AD_Window_ID="a7326f33-ae69-d8f0-8a3a-cd7d698b46f8",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,
AD_Column_ID="d980ec51-8134-bef3-1af5-060e22102dcd",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="d44a957c-5efe-179e-611b-d15be1f0ff4f",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_AssignedAttributes="d44a957c-5efe-179e-611b-d15be1f0ff4f";

@XendraTrl(Identifier="a84b519b-8bea-3c45-a753-f426e334afcb")
public static String es_PE_TABLE_M_Attribute_Name="Atributo";

@XendraTable(Name="Attribute",AD_Package_ID="2809ac2d-7d43-20f8-05f0-a478f2e50204",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Product Attribute",Help="",
TableName="M_Attribute",AccessLevel="3",AD_Window_ID="1b6bcb89-ad62-5249-c6bc-bf851e4e624f",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=135,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="a84b519b-8bea-3c45-a753-f426e334afcb",Synchronized="2020-03-03 21:38:15.0")
/** TableName=M_Attribute */
public static final String Table_Name="M_Attribute";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_Attribute");

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
    Table_ID = MTable.getTable_ID("M_Attribute");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_Attribute[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Attribute Value Type.
@param AttributeValueType Type of Attribute Value */
public void setAttributeValueType (String AttributeValueType)
{
if (AttributeValueType.length() > 1)
{
log.warning("Length > 1 - truncated");
AttributeValueType = AttributeValueType.substring(0,0);
}
set_Value (COLUMNNAME_AttributeValueType, AttributeValueType);
}
/** Get Attribute Value Type.
@return Type of Attribute Value */
public String getAttributeValueType() 
{
return (String)get_Value(COLUMNNAME_AttributeValueType);
}

@XendraTrl(Identifier="8840c7c4-dc77-faa4-940b-1a76b07fc5ef")
public static String es_PE_FIELD_Attribute_AttributeValueType_Name="Tipo del valor del atributo ";

@XendraTrl(Identifier="8840c7c4-dc77-faa4-940b-1a76b07fc5ef")
public static String es_PE_FIELD_Attribute_AttributeValueType_Description="Tipo del valor del atributo ";

@XendraTrl(Identifier="8840c7c4-dc77-faa4-940b-1a76b07fc5ef")
public static String es_PE_FIELD_Attribute_AttributeValueType_Help="Tipo del valor del atributo determina la calidad del dato/ tipo de validación";

@XendraField(AD_Column_ID="AttributeValueType",IsCentrallyMaintained=true,
AD_Tab_ID="8104d925-fdad-894e-6a45-92fe31d21262",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8840c7c4-dc77-faa4-940b-1a76b07fc5ef")
public static final String FIELDNAME_Attribute_AttributeValueType="8840c7c4-dc77-faa4-940b-1a76b07fc5ef";

@XendraTrl(Identifier="bd80e7b6-cf5d-30a9-f854-b3d9bb4b70b4")
public static String es_PE_FIELD_AssignedAttributes_AttributeValueType_Name="Tipo del valor del atributo ";

@XendraTrl(Identifier="bd80e7b6-cf5d-30a9-f854-b3d9bb4b70b4")
public static String es_PE_FIELD_AssignedAttributes_AttributeValueType_Description="Tipo del valor del atributo ";

@XendraTrl(Identifier="bd80e7b6-cf5d-30a9-f854-b3d9bb4b70b4")
public static String es_PE_FIELD_AssignedAttributes_AttributeValueType_Help="Tipo del valor del atributo determina la calidad del dato/ tipo de validación";

@XendraField(AD_Column_ID="AttributeValueType",IsCentrallyMaintained=true,
AD_Tab_ID="d44a957c-5efe-179e-611b-d15be1f0ff4f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bd80e7b6-cf5d-30a9-f854-b3d9bb4b70b4")
public static final String FIELDNAME_AssignedAttributes_AttributeValueType="bd80e7b6-cf5d-30a9-f854-b3d9bb4b70b4";

@XendraTrl(Identifier="6537a2a6-1ad8-2063-15b7-812fee3cc41f")
public static String es_PE_COLUMN_AttributeValueType_Name="Tipo del valor del atributo ";

@XendraColumn(AD_Element_ID="5d513b7b-79e1-b37b-05f1-df9b9710a569",ColumnName="AttributeValueType",
AD_Reference_ID=17,AD_Reference_Value_ID="854efd47-6512-02f8-a5e7-323541c0863c",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="S",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6537a2a6-1ad8-2063-15b7-812fee3cc41f",Synchronized="2019-08-30 22:22:57.0")
/** Column name AttributeValueType */
public static final String COLUMNNAME_AttributeValueType = "AttributeValueType";
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

@XendraTrl(Identifier="43b49a87-7eba-cdcd-9a99-1ec86615557c")
public static String es_PE_FIELD_Attribute_Description_Name="Observación";

@XendraTrl(Identifier="43b49a87-7eba-cdcd-9a99-1ec86615557c")
public static String es_PE_FIELD_Attribute_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="43b49a87-7eba-cdcd-9a99-1ec86615557c")
public static String es_PE_FIELD_Attribute_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="8104d925-fdad-894e-6a45-92fe31d21262",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="43b49a87-7eba-cdcd-9a99-1ec86615557c")
public static final String FIELDNAME_Attribute_Description="43b49a87-7eba-cdcd-9a99-1ec86615557c";

@XendraTrl(Identifier="89884613-ee6c-29fa-059e-a06eea5dafc1")
public static String es_PE_FIELD_AssignedAttributes_Description_Name="Observación";

@XendraTrl(Identifier="89884613-ee6c-29fa-059e-a06eea5dafc1")
public static String es_PE_FIELD_AssignedAttributes_Description_Description="Observación";

@XendraTrl(Identifier="89884613-ee6c-29fa-059e-a06eea5dafc1")
public static String es_PE_FIELD_AssignedAttributes_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="d44a957c-5efe-179e-611b-d15be1f0ff4f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="89884613-ee6c-29fa-059e-a06eea5dafc1")
public static final String FIELDNAME_AssignedAttributes_Description="89884613-ee6c-29fa-059e-a06eea5dafc1";

@XendraTrl(Identifier="dc27a5b4-4815-e632-12dc-17201d5c1e78")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dc27a5b4-4815-e632-12dc-17201d5c1e78",
Synchronized="2019-08-30 22:22:57.0")
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
@XendraTrl(Identifier="51c89cbd-db52-4a11-bb0f-ebf3abd9eed9")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="51c89cbd-db52-4a11-bb0f-ebf3abd9eed9",
Synchronized="2019-08-30 22:22:57.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Instance Attribute.
@param IsInstanceAttribute The product attribute is specific to the instance (like Serial No, Lot or Guarantee Date) */
public void setIsInstanceAttribute (boolean IsInstanceAttribute)
{
set_Value (COLUMNNAME_IsInstanceAttribute, Boolean.valueOf(IsInstanceAttribute));
}
/** Get Instance Attribute.
@return The product attribute is specific to the instance (like Serial No, Lot or Guarantee Date) */
public boolean isInstanceAttribute() 
{
Object oo = get_Value(COLUMNNAME_IsInstanceAttribute);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="05e11d3a-aa2c-0823-1f8b-db2eb5927ced")
public static String es_PE_FIELD_Attribute_InstanceAttribute_Name="Instancia del Atributo";

@XendraTrl(Identifier="05e11d3a-aa2c-0823-1f8b-db2eb5927ced")
public static String es_PE_FIELD_Attribute_InstanceAttribute_Description="Los atributos del producto son especificados por una instancia (como No. serie, lote o la fecha de garantía)      ";

@XendraTrl(Identifier="05e11d3a-aa2c-0823-1f8b-db2eb5927ced")
public static String es_PE_FIELD_Attribute_InstanceAttribute_Help="Si está seleccionado, la instancia del producto tiene este atributo - como los números de serie, lote o fecha de garantía de una instancia de producto. Si no esta seleccionado, todos las instancias del producto comparten los atributos (p.ej. color = verde).";

@XendraField(AD_Column_ID="IsInstanceAttribute",IsCentrallyMaintained=true,
AD_Tab_ID="8104d925-fdad-894e-6a45-92fe31d21262",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="05e11d3a-aa2c-0823-1f8b-db2eb5927ced")
public static final String FIELDNAME_Attribute_InstanceAttribute="05e11d3a-aa2c-0823-1f8b-db2eb5927ced";

@XendraTrl(Identifier="c5082eb3-504e-e064-2304-2aa570058022")
public static String es_PE_FIELD_AssignedAttributes_InstanceAttribute_Name="Instancia del Atributo";

@XendraTrl(Identifier="c5082eb3-504e-e064-2304-2aa570058022")
public static String es_PE_FIELD_AssignedAttributes_InstanceAttribute_Description="Los atributos del producto son especificados por una instancia (como No. serie, lote o la fecha de garantía)      ";

@XendraTrl(Identifier="c5082eb3-504e-e064-2304-2aa570058022")
public static String es_PE_FIELD_AssignedAttributes_InstanceAttribute_Help="Si está seleccionado, la instancia del producto tiene este atributo - como los números de serie, lote o fecha de garantía de una instancia de producto. Si no esta seleccionado, todos las instancias del producto comparten los atributos (p.ej. color = verde).";

@XendraField(AD_Column_ID="IsInstanceAttribute",IsCentrallyMaintained=true,
AD_Tab_ID="d44a957c-5efe-179e-611b-d15be1f0ff4f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c5082eb3-504e-e064-2304-2aa570058022")
public static final String FIELDNAME_AssignedAttributes_InstanceAttribute="c5082eb3-504e-e064-2304-2aa570058022";

@XendraTrl(Identifier="9a0c35d5-2fec-6695-7f25-5852a59ead26")
public static String es_PE_COLUMN_IsInstanceAttribute_Name="Instancia del Atributo";

@XendraColumn(AD_Element_ID="383dc65e-0c49-1299-0608-3e4163f294bb",
ColumnName="IsInstanceAttribute",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="9a0c35d5-2fec-6695-7f25-5852a59ead26",Synchronized="2019-08-30 22:22:57.0")
/** Column name IsInstanceAttribute */
public static final String COLUMNNAME_IsInstanceAttribute = "IsInstanceAttribute";
/** Set Mandatory.
@param IsMandatory Data entry is required in this column */
public void setIsMandatory (boolean IsMandatory)
{
set_Value (COLUMNNAME_IsMandatory, Boolean.valueOf(IsMandatory));
}
/** Get Mandatory.
@return Data entry is required in this column */
public boolean isMandatory() 
{
Object oo = get_Value(COLUMNNAME_IsMandatory);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="078c4085-f0fd-42e4-7c8c-782db8bc403f")
public static String es_PE_FIELD_Attribute_Mandatory_Name="Entrada Obligatoria";

@XendraTrl(Identifier="078c4085-f0fd-42e4-7c8c-782db8bc403f")
public static String es_PE_FIELD_Attribute_Mandatory_Description="Entrada de datos es requerida en esta columna";

@XendraTrl(Identifier="078c4085-f0fd-42e4-7c8c-782db8bc403f")
public static String es_PE_FIELD_Attribute_Mandatory_Help="El cuadro de verificación obligatorio indica si el campo es requerido para que un registro sea salvado a la base de datos.";

@XendraField(AD_Column_ID="IsMandatory",IsCentrallyMaintained=true,
AD_Tab_ID="8104d925-fdad-894e-6a45-92fe31d21262",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="078c4085-f0fd-42e4-7c8c-782db8bc403f")
public static final String FIELDNAME_Attribute_Mandatory="078c4085-f0fd-42e4-7c8c-782db8bc403f";

@XendraTrl(Identifier="0cbbba68-8fd4-5bd8-2ad1-4f81565827d1")
public static String es_PE_FIELD_AssignedAttributes_Mandatory_Name="Entrada Obligatoria";

@XendraTrl(Identifier="0cbbba68-8fd4-5bd8-2ad1-4f81565827d1")
public static String es_PE_FIELD_AssignedAttributes_Mandatory_Description="Entrada de datos es requerida en esta columna";

@XendraTrl(Identifier="0cbbba68-8fd4-5bd8-2ad1-4f81565827d1")
public static String es_PE_FIELD_AssignedAttributes_Mandatory_Help="El cuadro de verificación obligatorio indica si el campo es requerido para que un registro sea salvado a la base de datos.";

@XendraField(AD_Column_ID="IsMandatory",IsCentrallyMaintained=true,
AD_Tab_ID="d44a957c-5efe-179e-611b-d15be1f0ff4f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0cbbba68-8fd4-5bd8-2ad1-4f81565827d1")
public static final String FIELDNAME_AssignedAttributes_Mandatory="0cbbba68-8fd4-5bd8-2ad1-4f81565827d1";

@XendraTrl(Identifier="e99768d9-4d40-b607-c597-cb4f9a494016")
public static String es_PE_COLUMN_IsMandatory_Name="Entrada Obligatoria";

@XendraColumn(AD_Element_ID="43310179-c59f-f313-de13-08d90722e38d",ColumnName="IsMandatory",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e99768d9-4d40-b607-c597-cb4f9a494016",
Synchronized="2019-08-30 22:22:57.0")
/** Column name IsMandatory */
public static final String COLUMNNAME_IsMandatory = "IsMandatory";
/** Set Attribute.
@param M_Attribute_ID Product Attribute */
public void setM_Attribute_ID (int M_Attribute_ID)
{
if (M_Attribute_ID < 1) throw new IllegalArgumentException ("M_Attribute_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_Attribute_ID, Integer.valueOf(M_Attribute_ID));
}
/** Get Attribute.
@return Product Attribute */
public int getM_Attribute_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Attribute_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c29ea749-68a4-d076-82b8-f07a2082c236")
public static String es_PE_FIELD_Attribute_Attribute_Name="Atributo";

@XendraTrl(Identifier="c29ea749-68a4-d076-82b8-f07a2082c236")
public static String es_PE_FIELD_Attribute_Attribute_Description="Atributo del Producto";

@XendraTrl(Identifier="c29ea749-68a4-d076-82b8-f07a2082c236")
public static String es_PE_FIELD_Attribute_Attribute_Help="Cualidad del producto como el color y tamaño";

@XendraField(AD_Column_ID="M_Attribute_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8104d925-fdad-894e-6a45-92fe31d21262",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c29ea749-68a4-d076-82b8-f07a2082c236")
public static final String FIELDNAME_Attribute_Attribute="c29ea749-68a4-d076-82b8-f07a2082c236";

@XendraTrl(Identifier="3efb2d3a-b329-3832-6afc-0f4e28fe5893")
public static String es_PE_FIELD_AssignedAttributes_Attribute_Name="Atributo";

@XendraTrl(Identifier="3efb2d3a-b329-3832-6afc-0f4e28fe5893")
public static String es_PE_FIELD_AssignedAttributes_Attribute_Description="Atributo del Producto";

@XendraTrl(Identifier="3efb2d3a-b329-3832-6afc-0f4e28fe5893")
public static String es_PE_FIELD_AssignedAttributes_Attribute_Help="Cualidad del producto como el color y tamaño";

@XendraField(AD_Column_ID="M_Attribute_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d44a957c-5efe-179e-611b-d15be1f0ff4f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3efb2d3a-b329-3832-6afc-0f4e28fe5893")
public static final String FIELDNAME_AssignedAttributes_Attribute="3efb2d3a-b329-3832-6afc-0f4e28fe5893";
/** Column name M_Attribute_ID */
public static final String COLUMNNAME_M_Attribute_ID = "M_Attribute_ID";
/** Set Attribute Search.
@param M_AttributeSearch_ID Common Search Attribute  */
public void setM_AttributeSearch_ID (int M_AttributeSearch_ID)
{
if (M_AttributeSearch_ID <= 0) set_Value (COLUMNNAME_M_AttributeSearch_ID, null);
 else 
set_Value (COLUMNNAME_M_AttributeSearch_ID, Integer.valueOf(M_AttributeSearch_ID));
}
/** Get Attribute Search.
@return Common Search Attribute  */
public int getM_AttributeSearch_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_AttributeSearch_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3c1695d3-5277-a5c7-0f5d-7951c88bca5c")
public static String es_PE_FIELD_Attribute_AttributeSearch_Name="Búsqueda de Atributos";

@XendraTrl(Identifier="3c1695d3-5277-a5c7-0f5d-7951c88bca5c")
public static String es_PE_FIELD_Attribute_AttributeSearch_Description="Cualidad común de la busqueda";

@XendraTrl(Identifier="3c1695d3-5277-a5c7-0f5d-7951c88bca5c")
public static String es_PE_FIELD_Attribute_AttributeSearch_Help="Los atributos son especificos para una configuración de producto. (ej. Tamaño para las camisetas: G,M,CH). Si usted tiene cualidades multiples y desea buscar bajo atributo común, usted define un atributo de la busqueda. Ejemplo: tenga una cualidad de la búsqueda del tamaño el combinar de los valores de todos los diversos tamaños (tamaño para la camisa XL, l, m, s, xs del vestido).  La búsqueda de la cualidad permite que usted tenga todos los valores disponibles para la selección. Esto facilita el mantenimiento de la cualidad de producto individual.";

@XendraField(AD_Column_ID="M_AttributeSearch_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8104d925-fdad-894e-6a45-92fe31d21262",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3c1695d3-5277-a5c7-0f5d-7951c88bca5c")
public static final String FIELDNAME_Attribute_AttributeSearch="3c1695d3-5277-a5c7-0f5d-7951c88bca5c";

@XendraTrl(Identifier="90c44977-50da-6f30-05bf-d70f49f32be3")
public static String es_PE_FIELD_AssignedAttributes_AttributeSearch_Name="Búsqueda de Atributos";

@XendraTrl(Identifier="90c44977-50da-6f30-05bf-d70f49f32be3")
public static String es_PE_FIELD_AssignedAttributes_AttributeSearch_Description="Cualidad común de la busqueda";

@XendraTrl(Identifier="90c44977-50da-6f30-05bf-d70f49f32be3")
public static String es_PE_FIELD_AssignedAttributes_AttributeSearch_Help="Los atributos son especificos para una configuración de producto. (ej. Tamaño para las camisetas: G,M,CH). Si usted tiene cualidades multiples y desea buscar bajo atributo común, usted define un atributo de la busqueda. Ejemplo: tenga una cualidad de la búsqueda del tamaño el combinar de los valores de todos los diversos tamaños (tamaño para la camisa XL, l, m, s, xs del vestido).  La búsqueda de la cualidad permite que usted tenga todos los valores disponibles para la selección. Esto facilita el mantenimiento de la cualidad de producto individual.";

@XendraField(AD_Column_ID="M_AttributeSearch_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d44a957c-5efe-179e-611b-d15be1f0ff4f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="90c44977-50da-6f30-05bf-d70f49f32be3")
public static final String FIELDNAME_AssignedAttributes_AttributeSearch="90c44977-50da-6f30-05bf-d70f49f32be3";

@XendraTrl(Identifier="d980ec51-8134-bef3-1af5-060e22102dcd")
public static String es_PE_COLUMN_M_AttributeSearch_ID_Name="Búsqueda de Atributos";

@XendraColumn(AD_Element_ID="c895fca1-63a7-b0e7-b29c-732d781ccd49",
ColumnName="M_AttributeSearch_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d980ec51-8134-bef3-1af5-060e22102dcd",Synchronized="2019-08-30 22:22:57.0")
/** Column name M_AttributeSearch_ID */
public static final String COLUMNNAME_M_AttributeSearch_ID = "M_AttributeSearch_ID";
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

@XendraTrl(Identifier="e69cd5c9-416b-edbb-1109-46b9573d140d")
public static String es_PE_FIELD_Attribute_Name_Name="Nombre";

@XendraTrl(Identifier="e69cd5c9-416b-edbb-1109-46b9573d140d")
public static String es_PE_FIELD_Attribute_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="e69cd5c9-416b-edbb-1109-46b9573d140d")
public static String es_PE_FIELD_Attribute_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="8104d925-fdad-894e-6a45-92fe31d21262",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e69cd5c9-416b-edbb-1109-46b9573d140d")
public static final String FIELDNAME_Attribute_Name="e69cd5c9-416b-edbb-1109-46b9573d140d";

@XendraTrl(Identifier="66f8d104-4f18-68f1-5b6f-0454ccb7cb14")
public static String es_PE_FIELD_AssignedAttributes_Name_Name="Nombre";

@XendraTrl(Identifier="66f8d104-4f18-68f1-5b6f-0454ccb7cb14")
public static String es_PE_FIELD_AssignedAttributes_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="66f8d104-4f18-68f1-5b6f-0454ccb7cb14")
public static String es_PE_FIELD_AssignedAttributes_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="d44a957c-5efe-179e-611b-d15be1f0ff4f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="66f8d104-4f18-68f1-5b6f-0454ccb7cb14")
public static final String FIELDNAME_AssignedAttributes_Name="66f8d104-4f18-68f1-5b6f-0454ccb7cb14";

@XendraTrl(Identifier="e43b9fd7-0ecf-2a70-90dd-ca2249e9fced")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e43b9fd7-0ecf-2a70-90dd-ca2249e9fced",
Synchronized="2019-08-30 22:22:57.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
}
