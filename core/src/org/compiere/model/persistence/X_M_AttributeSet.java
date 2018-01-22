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
import org.compiere.model.reference.REF_M_AttributeSetMandatoryType;
/** Generated Model for M_AttributeSet
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_AttributeSet extends PO
{
/** Standard Constructor
@param ctx context
@param M_AttributeSet_ID id
@param trxName transaction
*/
public X_M_AttributeSet (Properties ctx, int M_AttributeSet_ID, String trxName)
{
super (ctx, M_AttributeSet_ID, trxName);
/** if (M_AttributeSet_ID == 0)
{
setIsGuaranteeDate (false);	
// N
setIsGuaranteeDateMandatory (false);	
// N
setIsInstanceAttribute (false);	
// N
setIsLot (false);	
// N
setIsLotMandatory (false);	
// N
setIsSerNo (false);	
// N
setIsSerNoMandatory (false);	
// N
setMandatoryType (null);
setM_AttributeSet_ID (0);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_AttributeSet (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=560 */
public static int Table_ID=MTable.getTable_ID("M_AttributeSet");

@XendraTrl(Identifier="4e102f94-c27d-366d-1ef6-564fab23f1b3")
public static String es_PE_TAB_AttributeSet_Description="Mantener Conjunto de Atributos del Producto";

@XendraTrl(Identifier="4e102f94-c27d-366d-1ef6-564fab23f1b3")
public static String es_PE_TAB_AttributeSet_Name="Conjunto de Atributos";

@XendraTrl(Identifier="4e102f94-c27d-366d-1ef6-564fab23f1b3")
public static String es_PE_TAB_AttributeSet_Help="Defina los atributos de sistemas de producto para agregar atributos y valores adicionales al producto. Usted necesita definir un atributo fijado si usted desea permitir seguimiento del número de cuenta por entregas y de porción.";

@XendraTab(Name="Attribute Set",Description="Maintain Product Attribute Set",
Help="Define Product Attribute Sets to add additional attributes and values to the product. You need to define a Attribute Set if you want to enable Serial and Lot Number and Guaragtee Date tracking.  Note that the Guarantee Days here determine the Shelf Life of a product instance after manufacturing (the Guarantee Days on the product determines a Customer Service date after selling) If the Attribute Set is mandatory, a product instance needs to be selected/created before shipping.",
AD_Window_ID="c776058b-1056-0bc4-3e42-f91c200f5ade",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="4e102f94-c27d-366d-1ef6-564fab23f1b3",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_AttributeSet="4e102f94-c27d-366d-1ef6-564fab23f1b3";

@XendraTrl(Identifier="9576c6b5-5898-768f-f0a7-88162c8c5266")
public static String es_PE_TABLE_M_AttributeSet_Name="Conjunto de Atributos";

@XendraTable(Name="Attribute Set",Description="Product Attribute Set",Help="",
TableName="M_AttributeSet",AccessLevel="3",AD_Window_ID="c776058b-1056-0bc4-3e42-f91c200f5ade",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=85,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="9576c6b5-5898-768f-f0a7-88162c8c5266",Synchronized="2017-08-16 11:43:05.0")
/** TableName=M_AttributeSet */
public static final String Table_Name="M_AttributeSet";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_AttributeSet");

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
    Table_ID = MTable.getTable_ID("M_AttributeSet");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_AttributeSet[").append(get_ID()).append("]");
return sb.toString();
}
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

@XendraTrl(Identifier="743fb8ef-f2a5-e291-525a-d9d34ac82a45")
public static String es_PE_FIELD_AttributeSet_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="743fb8ef-f2a5-e291-525a-d9d34ac82a45")
public static String es_PE_FIELD_AttributeSet_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="743fb8ef-f2a5-e291-525a-d9d34ac82a45")
public static String es_PE_FIELD_AttributeSet_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="4e102f94-c27d-366d-1ef6-564fab23f1b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="743fb8ef-f2a5-e291-525a-d9d34ac82a45")
public static final String FIELDNAME_AttributeSet_Description="743fb8ef-f2a5-e291-525a-d9d34ac82a45";

@XendraTrl(Identifier="c533b1e0-13f1-1186-7dc5-e5ee974f3f6a")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c533b1e0-13f1-1186-7dc5-e5ee974f3f6a",
Synchronized="2017-08-05 16:54:59.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Guarantee Days.
@param GuaranteeDays Number of days the product is guaranteed or available */
public void setGuaranteeDays (int GuaranteeDays)
{
set_Value (COLUMNNAME_GuaranteeDays, Integer.valueOf(GuaranteeDays));
}
/** Get Guarantee Days.
@return Number of days the product is guaranteed or available */
public int getGuaranteeDays() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_GuaranteeDays);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="937ed7fd-58bc-2570-9ba0-77d59170a848")
public static String es_PE_FIELD_AttributeSet_GuaranteeDays_Description="Número de días que el producto está garantizado ó disponible";

@XendraTrl(Identifier="937ed7fd-58bc-2570-9ba0-77d59170a848")
public static String es_PE_FIELD_AttributeSet_GuaranteeDays_Help="Si el valor es 0, no hay límite a la disponibilidad ó garantía, si no la fecha de la garantía es calculada agregando los días a la fecha de entrega.";

@XendraTrl(Identifier="937ed7fd-58bc-2570-9ba0-77d59170a848")
public static String es_PE_FIELD_AttributeSet_GuaranteeDays_Name="Días de Caducidad";

@XendraField(AD_Column_ID="GuaranteeDays",IsCentrallyMaintained=true,
AD_Tab_ID="4e102f94-c27d-366d-1ef6-564fab23f1b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsGuaranteeDate@=Y",DisplayLength=11,IsReadOnly=false,SeqNo=190,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="937ed7fd-58bc-2570-9ba0-77d59170a848")
public static final String FIELDNAME_AttributeSet_GuaranteeDays="937ed7fd-58bc-2570-9ba0-77d59170a848";

@XendraTrl(Identifier="7968c995-f1d5-4f76-95df-ab5d6da92009")
public static String es_PE_COLUMN_GuaranteeDays_Name="Días de Caducidad";

@XendraColumn(AD_Element_ID="544e6239-596d-2b81-716c-5b0349884aa1",ColumnName="GuaranteeDays",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7968c995-f1d5-4f76-95df-ab5d6da92009",
Synchronized="2017-08-05 16:54:59.0")
/** Column name GuaranteeDays */
public static final String COLUMNNAME_GuaranteeDays = "GuaranteeDays";
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
@XendraTrl(Identifier="ec32a619-e4e5-4c0c-8ffe-2a909a69f396")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ec32a619-e4e5-4c0c-8ffe-2a909a69f396",
Synchronized="2017-08-05 16:54:59.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Guarantee Date.
@param IsGuaranteeDate Product has Guarantee or Expiry Date */
public void setIsGuaranteeDate (boolean IsGuaranteeDate)
{
set_Value (COLUMNNAME_IsGuaranteeDate, Boolean.valueOf(IsGuaranteeDate));
}
/** Get Guarantee Date.
@return Product has Guarantee or Expiry Date */
public boolean isGuaranteeDate() 
{
Object oo = get_Value(COLUMNNAME_IsGuaranteeDate);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="2c00b698-715f-056e-9dab-357856f66be0")
public static String es_PE_FIELD_AttributeSet_GuaranteeDate_Description="Fecha cuando la garantía expira";

@XendraTrl(Identifier="2c00b698-715f-056e-9dab-357856f66be0")
public static String es_PE_FIELD_AttributeSet_GuaranteeDate_Help="Fecha cuando la garantía ó disponibilidad normal expira";

@XendraTrl(Identifier="2c00b698-715f-056e-9dab-357856f66be0")
public static String es_PE_FIELD_AttributeSet_GuaranteeDate_Name="Fecha de Vencimiento";

@XendraField(AD_Column_ID="IsGuaranteeDate",IsCentrallyMaintained=true,
AD_Tab_ID="4e102f94-c27d-366d-1ef6-564fab23f1b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2c00b698-715f-056e-9dab-357856f66be0")
public static final String FIELDNAME_AttributeSet_GuaranteeDate="2c00b698-715f-056e-9dab-357856f66be0";

@XendraTrl(Identifier="cae0c155-4941-e260-75e0-792f36f36ad3")
public static String es_PE_COLUMN_IsGuaranteeDate_Name="Fecha de Garantía";

@XendraColumn(AD_Element_ID="035a57c7-3dfa-84d5-cb3b-d367059be8ac",ColumnName="IsGuaranteeDate",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cae0c155-4941-e260-75e0-792f36f36ad3",
Synchronized="2017-08-05 16:55:00.0")
/** Column name IsGuaranteeDate */
public static final String COLUMNNAME_IsGuaranteeDate = "IsGuaranteeDate";
/** Set Mandatory Guarantee Date.
@param IsGuaranteeDateMandatory The entry of a Guarantee Date is mandatory when creating a Product Instance */
public void setIsGuaranteeDateMandatory (boolean IsGuaranteeDateMandatory)
{
set_Value (COLUMNNAME_IsGuaranteeDateMandatory, Boolean.valueOf(IsGuaranteeDateMandatory));
}
/** Get Mandatory Guarantee Date.
@return The entry of a Guarantee Date is mandatory when creating a Product Instance */
public boolean isGuaranteeDateMandatory() 
{
Object oo = get_Value(COLUMNNAME_IsGuaranteeDateMandatory);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="5453fef7-8127-161e-4a88-20a1c7e25600")
public static String es_PE_FIELD_AttributeSet_MandatoryGuaranteeDate_Description="La entrada de una fecha de la garantía es obligatoria al crear un caso del producto.";

@XendraTrl(Identifier="5453fef7-8127-161e-4a88-20a1c7e25600")
public static String es_PE_FIELD_AttributeSet_MandatoryGuaranteeDate_Name="Fecha Obligatoria de Vencimiento";

@XendraField(AD_Column_ID="IsGuaranteeDateMandatory",IsCentrallyMaintained=true,
AD_Tab_ID="4e102f94-c27d-366d-1ef6-564fab23f1b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsGuaranteeDate@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=180,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="5453fef7-8127-161e-4a88-20a1c7e25600")
public static final String FIELDNAME_AttributeSet_MandatoryGuaranteeDate="5453fef7-8127-161e-4a88-20a1c7e25600";

@XendraTrl(Identifier="5067d687-0363-40e7-d880-8286365665d6")
public static String es_PE_COLUMN_IsGuaranteeDateMandatory_Name="Fecha Obligatoria de Garantia";

@XendraColumn(AD_Element_ID="f22d0703-c6c9-977b-0a09-c2529a36a17b",
ColumnName="IsGuaranteeDateMandatory",AD_Reference_ID=20,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="5067d687-0363-40e7-d880-8286365665d6",Synchronized="2017-08-05 16:55:00.0")
/** Column name IsGuaranteeDateMandatory */
public static final String COLUMNNAME_IsGuaranteeDateMandatory = "IsGuaranteeDateMandatory";
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

@XendraTrl(Identifier="9e11c828-8ed3-73fe-468f-6937daa72651")
public static String es_PE_FIELD_AttributeSet_InstanceAttribute_Description="Los atributos del producto son especificados por una instancia (como No. serie, lote o la fecha de garantía)      ";

@XendraTrl(Identifier="9e11c828-8ed3-73fe-468f-6937daa72651")
public static String es_PE_FIELD_AttributeSet_InstanceAttribute_Help="Si está seleccionado, la instancia del producto tiene este atributo - como los números de serie, lote o fecha de garantía de una instancia de producto. Si no esta seleccionado, todos las instancias del producto comparten los atributos (p.ej. color = verde).";

@XendraTrl(Identifier="9e11c828-8ed3-73fe-468f-6937daa72651")
public static String es_PE_FIELD_AttributeSet_InstanceAttribute_Name="Instancia del Atributo";

@XendraField(AD_Column_ID="IsInstanceAttribute",IsCentrallyMaintained=true,
AD_Tab_ID="4e102f94-c27d-366d-1ef6-564fab23f1b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9e11c828-8ed3-73fe-468f-6937daa72651")
public static final String FIELDNAME_AttributeSet_InstanceAttribute="9e11c828-8ed3-73fe-468f-6937daa72651";

@XendraTrl(Identifier="cdbc893e-ad05-dcb2-7df7-a75a7d0be0c6")
public static String es_PE_COLUMN_IsInstanceAttribute_Name="Instancia del Atributo";

@XendraColumn(AD_Element_ID="383dc65e-0c49-1299-0608-3e4163f294bb",
ColumnName="IsInstanceAttribute",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="cdbc893e-ad05-dcb2-7df7-a75a7d0be0c6",Synchronized="2017-08-05 16:55:00.0")
/** Column name IsInstanceAttribute */
public static final String COLUMNNAME_IsInstanceAttribute = "IsInstanceAttribute";
/** Set Lot.
@param IsLot The product instances have a Lot Number */
public void setIsLot (boolean IsLot)
{
set_Value (COLUMNNAME_IsLot, Boolean.valueOf(IsLot));
}
/** Get Lot.
@return The product instances have a Lot Number */
public boolean isLot() 
{
Object oo = get_Value(COLUMNNAME_IsLot);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="747cb2c8-a6b7-6a93-a11a-10fe0ef64edf")
public static String es_PE_FIELD_AttributeSet_Lot_Description="Las instancias del producto tienen un número de lote.";

@XendraTrl(Identifier="747cb2c8-a6b7-6a93-a11a-10fe0ef64edf")
public static String es_PE_FIELD_AttributeSet_Lot_Help="Para los productos individuales, usted puede definir números de lote.";

@XendraTrl(Identifier="747cb2c8-a6b7-6a93-a11a-10fe0ef64edf")
public static String es_PE_FIELD_AttributeSet_Lot_Name="Lote";
@XendraField(AD_Column_ID="IsLot",
IsCentrallyMaintained=true,AD_Tab_ID="4e102f94-c27d-366d-1ef6-564fab23f1b3",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="747cb2c8-a6b7-6a93-a11a-10fe0ef64edf")
public static final String FIELDNAME_AttributeSet_Lot="747cb2c8-a6b7-6a93-a11a-10fe0ef64edf";

@XendraTrl(Identifier="723fe98d-e380-2325-0c98-999c7d2cdb63")
public static String es_PE_COLUMN_IsLot_Name="Lote";

@XendraColumn(AD_Element_ID="4d1ba551-d80d-576d-fabb-05b19904cea0",ColumnName="IsLot",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="723fe98d-e380-2325-0c98-999c7d2cdb63",
Synchronized="2017-08-05 16:55:00.0")
/** Column name IsLot */
public static final String COLUMNNAME_IsLot = "IsLot";
/** Set Mandatory Lot.
@param IsLotMandatory The entry of Lot info is mandatory when creating a Product Instance */
public void setIsLotMandatory (boolean IsLotMandatory)
{
set_Value (COLUMNNAME_IsLotMandatory, Boolean.valueOf(IsLotMandatory));
}
/** Get Mandatory Lot.
@return The entry of Lot info is mandatory when creating a Product Instance */
public boolean isLotMandatory() 
{
Object oo = get_Value(COLUMNNAME_IsLotMandatory);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="5481771c-cd8c-2313-d093-17b2401e4d24")
public static String es_PE_FIELD_AttributeSet_MandatoryLot_Description="La entrada de Información de lote es obligatoria al crear un caso del producto.";

@XendraTrl(Identifier="5481771c-cd8c-2313-d093-17b2401e4d24")
public static String es_PE_FIELD_AttributeSet_MandatoryLot_Name="Lote Obligatorio";

@XendraField(AD_Column_ID="IsLotMandatory",IsCentrallyMaintained=true,
AD_Tab_ID="4e102f94-c27d-366d-1ef6-564fab23f1b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsLot@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5481771c-cd8c-2313-d093-17b2401e4d24")
public static final String FIELDNAME_AttributeSet_MandatoryLot="5481771c-cd8c-2313-d093-17b2401e4d24";

@XendraTrl(Identifier="1e58ff56-0f97-9d6d-2daf-39cdb04266f9")
public static String es_PE_COLUMN_IsLotMandatory_Name="Lote Obligatorio";

@XendraColumn(AD_Element_ID="d655cced-b52c-b984-8cc7-ae384d7f99ca",ColumnName="IsLotMandatory",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1e58ff56-0f97-9d6d-2daf-39cdb04266f9",
Synchronized="2017-08-05 16:55:00.0")
/** Column name IsLotMandatory */
public static final String COLUMNNAME_IsLotMandatory = "IsLotMandatory";
/** Set Serial No.
@param IsSerNo The product instances have Serial Numbers */
public void setIsSerNo (boolean IsSerNo)
{
set_Value (COLUMNNAME_IsSerNo, Boolean.valueOf(IsSerNo));
}
/** Get Serial No.
@return The product instances have Serial Numbers */
public boolean isSerNo() 
{
Object oo = get_Value(COLUMNNAME_IsSerNo);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="932e397b-c925-975c-cfeb-127372792e86")
public static String es_PE_FIELD_AttributeSet_SerialNo_Description="Los casos del producto tienen número de serie.";

@XendraTrl(Identifier="932e397b-c925-975c-cfeb-127372792e86")
public static String es_PE_FIELD_AttributeSet_SerialNo_Help="Para productos individuales, usted puede definir números de serie.";

@XendraTrl(Identifier="932e397b-c925-975c-cfeb-127372792e86")
public static String es_PE_FIELD_AttributeSet_SerialNo_Name="No. de Serie";

@XendraField(AD_Column_ID="IsSerNo",IsCentrallyMaintained=true,
AD_Tab_ID="4e102f94-c27d-366d-1ef6-564fab23f1b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="932e397b-c925-975c-cfeb-127372792e86")
public static final String FIELDNAME_AttributeSet_SerialNo="932e397b-c925-975c-cfeb-127372792e86";

@XendraTrl(Identifier="dc487f67-e1e2-114b-49f7-0abb5362e41c")
public static String es_PE_COLUMN_IsSerNo_Name="No. de Serie";

@XendraColumn(AD_Element_ID="38b24888-b2a6-4c4c-2f6c-4ff5cb68f7eb",ColumnName="IsSerNo",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dc487f67-e1e2-114b-49f7-0abb5362e41c",
Synchronized="2017-08-05 16:55:00.0")
/** Column name IsSerNo */
public static final String COLUMNNAME_IsSerNo = "IsSerNo";
/** Set Mandatory Serial No.
@param IsSerNoMandatory The entry of a Serial No is mandatory when creating a Product Instance */
public void setIsSerNoMandatory (boolean IsSerNoMandatory)
{
set_Value (COLUMNNAME_IsSerNoMandatory, Boolean.valueOf(IsSerNoMandatory));
}
/** Get Mandatory Serial No.
@return The entry of a Serial No is mandatory when creating a Product Instance */
public boolean isSerNoMandatory() 
{
Object oo = get_Value(COLUMNNAME_IsSerNoMandatory);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="72f2eeba-d771-488f-b96b-ac658d25ea4e")
public static String es_PE_FIELD_AttributeSet_MandatorySerialNo_Description="La entrada de un número de serie es obligatoria cuando se crea un producto.";

@XendraTrl(Identifier="72f2eeba-d771-488f-b96b-ac658d25ea4e")
public static String es_PE_FIELD_AttributeSet_MandatorySerialNo_Name="No. de Serie Obligatorio";

@XendraField(AD_Column_ID="IsSerNoMandatory",IsCentrallyMaintained=true,
AD_Tab_ID="4e102f94-c27d-366d-1ef6-564fab23f1b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSerNo@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="72f2eeba-d771-488f-b96b-ac658d25ea4e")
public static final String FIELDNAME_AttributeSet_MandatorySerialNo="72f2eeba-d771-488f-b96b-ac658d25ea4e";

@XendraTrl(Identifier="9c568f3b-3f8f-4044-7d25-b942902101c6")
public static String es_PE_COLUMN_IsSerNoMandatory_Name="No. de Serie Obligatorio";

@XendraColumn(AD_Element_ID="c3c73892-e1f5-58e0-3b60-f9c52b00298f",ColumnName="IsSerNoMandatory",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9c568f3b-3f8f-4044-7d25-b942902101c6",
Synchronized="2017-08-05 16:55:00.0")
/** Column name IsSerNoMandatory */
public static final String COLUMNNAME_IsSerNoMandatory = "IsSerNoMandatory";
/** Set Lot Char End Overwrite.
@param LotCharEOverwrite Lot/Batch End Indicator overwrite - default » */
public void setLotCharEOverwrite (String LotCharEOverwrite)
{
if (LotCharEOverwrite != null && LotCharEOverwrite.length() > 1)
{
log.warning("Length > 1 - truncated");
LotCharEOverwrite = LotCharEOverwrite.substring(0,0);
}
set_Value (COLUMNNAME_LotCharEOverwrite, LotCharEOverwrite);
}
/** Get Lot Char End Overwrite.
@return Lot/Batch End Indicator overwrite - default » */
public String getLotCharEOverwrite() 
{
String value = (String)get_Value(COLUMNNAME_LotCharEOverwrite);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="21223278-6ca4-6e06-9291-7c4f60d6d0b6")
public static String es_PE_FIELD_AttributeSet_LotCharEndOverwrite_Description="Lot/Batch End Indicator overwrite - default »";

@XendraTrl(Identifier="21223278-6ca4-6e06-9291-7c4f60d6d0b6")
public static String es_PE_FIELD_AttributeSet_LotCharEndOverwrite_Help="If not defined, the default character » is used";

@XendraTrl(Identifier="21223278-6ca4-6e06-9291-7c4f60d6d0b6")
public static String es_PE_FIELD_AttributeSet_LotCharEndOverwrite_Name="Lot Char End Overwrite";

@XendraField(AD_Column_ID="LotCharEOverwrite",IsCentrallyMaintained=true,
AD_Tab_ID="4e102f94-c27d-366d-1ef6-564fab23f1b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsLot@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="21223278-6ca4-6e06-9291-7c4f60d6d0b6")
public static final String FIELDNAME_AttributeSet_LotCharEndOverwrite="21223278-6ca4-6e06-9291-7c4f60d6d0b6";

@XendraTrl(Identifier="7e401d93-afe7-98e2-e98b-8eeb8889ddd8")
public static String es_PE_COLUMN_LotCharEOverwrite_Name="Lot Char End Overwrite";

@XendraColumn(AD_Element_ID="5d8b78fc-532b-1b8c-3f26-00c1e502de96",ColumnName="LotCharEOverwrite",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7e401d93-afe7-98e2-e98b-8eeb8889ddd8",
Synchronized="2017-08-05 16:55:00.0")
/** Column name LotCharEOverwrite */
public static final String COLUMNNAME_LotCharEOverwrite = "LotCharEOverwrite";
/** Set Lot Char Start Overwrite.
@param LotCharSOverwrite Lot/Batch Start Indicator overwrite - default « */
public void setLotCharSOverwrite (String LotCharSOverwrite)
{
if (LotCharSOverwrite != null && LotCharSOverwrite.length() > 1)
{
log.warning("Length > 1 - truncated");
LotCharSOverwrite = LotCharSOverwrite.substring(0,0);
}
set_Value (COLUMNNAME_LotCharSOverwrite, LotCharSOverwrite);
}
/** Get Lot Char Start Overwrite.
@return Lot/Batch Start Indicator overwrite - default « */
public String getLotCharSOverwrite() 
{
String value = (String)get_Value(COLUMNNAME_LotCharSOverwrite);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="85ff5bbc-a06f-097a-6ba8-28b75dd87433")
public static String es_PE_FIELD_AttributeSet_LotCharStartOverwrite_Description="Lot/Batch Start Indicator overwrite - default «";

@XendraTrl(Identifier="85ff5bbc-a06f-097a-6ba8-28b75dd87433")
public static String es_PE_FIELD_AttributeSet_LotCharStartOverwrite_Help="If not defined, the default character « is used";

@XendraTrl(Identifier="85ff5bbc-a06f-097a-6ba8-28b75dd87433")
public static String es_PE_FIELD_AttributeSet_LotCharStartOverwrite_Name="Lot Char Start Overwrite";

@XendraField(AD_Column_ID="LotCharSOverwrite",IsCentrallyMaintained=true,
AD_Tab_ID="4e102f94-c27d-366d-1ef6-564fab23f1b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsLot@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="85ff5bbc-a06f-097a-6ba8-28b75dd87433")
public static final String FIELDNAME_AttributeSet_LotCharStartOverwrite="85ff5bbc-a06f-097a-6ba8-28b75dd87433";

@XendraTrl(Identifier="e8cdc277-3905-be74-0d2f-df868ce4ea74")
public static String es_PE_COLUMN_LotCharSOverwrite_Name="Lot Char Start Overwrite";

@XendraColumn(AD_Element_ID="1c72691d-5a98-dc72-69bb-122f44c43bcf",ColumnName="LotCharSOverwrite",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e8cdc277-3905-be74-0d2f-df868ce4ea74",
Synchronized="2017-08-05 16:55:00.0")
/** Column name LotCharSOverwrite */
public static final String COLUMNNAME_LotCharSOverwrite = "LotCharSOverwrite";

/** MandatoryType AD_Reference=e78f0302-6d18-500f-f079-cd055de11f62 */
public static final int MANDATORYTYPE_AD_Reference_ID=324;
/** Set Mandatory Type.
@param MandatoryType The specification of a Product Attribute Instance is mandatory */
public void setMandatoryType (String MandatoryType)
{
if (MandatoryType == null) throw new IllegalArgumentException ("MandatoryType is mandatory");
if (MandatoryType.equals(REF_M_AttributeSetMandatoryType.NotMandatary) || MandatoryType.equals(REF_M_AttributeSetMandatoryType.AlwaysMandatory) || MandatoryType.equals(REF_M_AttributeSetMandatoryType.WhenShipping));
 else throw new IllegalArgumentException ("MandatoryType Invalid value - " + MandatoryType + " - Reference_ID=324 - N - Y - S");
if (MandatoryType.length() > 1)
{
log.warning("Length > 1 - truncated");
MandatoryType = MandatoryType.substring(0,0);
}
set_Value (COLUMNNAME_MandatoryType, MandatoryType);
}
/** Get Mandatory Type.
@return The specification of a Product Attribute Instance is mandatory */
public String getMandatoryType() 
{
return (String)get_Value(COLUMNNAME_MandatoryType);
}

@XendraTrl(Identifier="ee55a449-4afb-4ab9-5a58-447a727feaa3")
public static String es_PE_FIELD_AttributeSet_MandatoryType_Description="La especificación de atributos en el producto es obligatoria";

@XendraTrl(Identifier="ee55a449-4afb-4ab9-5a58-447a727feaa3")
public static String es_PE_FIELD_AttributeSet_MandatoryType_Name="Tipo Obligatorio";

@XendraField(AD_Column_ID="MandatoryType",IsCentrallyMaintained=true,
AD_Tab_ID="4e102f94-c27d-366d-1ef6-564fab23f1b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ee55a449-4afb-4ab9-5a58-447a727feaa3")
public static final String FIELDNAME_AttributeSet_MandatoryType="ee55a449-4afb-4ab9-5a58-447a727feaa3";

@XendraTrl(Identifier="314f0e33-cf07-4d5f-afe8-0d99f122dff6")
public static String es_PE_COLUMN_MandatoryType_Name="Tipo Obligatorio";

@XendraColumn(AD_Element_ID="6ea2a1f3-b27e-32e9-9f91-e782dc0187b3",ColumnName="MandatoryType",
AD_Reference_ID=17,AD_Reference_Value_ID="e78f0302-6d18-500f-f079-cd055de11f62",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="314f0e33-cf07-4d5f-afe8-0d99f122dff6",Synchronized="2017-08-05 16:55:00.0")
/** Column name MandatoryType */
public static final String COLUMNNAME_MandatoryType = "MandatoryType";
/** Set Attribute Set.
@param M_AttributeSet_ID Product Attribute Set */
public void setM_AttributeSet_ID (int M_AttributeSet_ID)
{
if (M_AttributeSet_ID < 0) throw new IllegalArgumentException ("M_AttributeSet_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_AttributeSet_ID, Integer.valueOf(M_AttributeSet_ID));
}
/** Get Attribute Set.
@return Product Attribute Set */
public int getM_AttributeSet_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_AttributeSet_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9c392bfc-e3bb-89fa-ed3a-ca3999ce7d15")
public static String es_PE_FIELD_AttributeSet_AttributeSet_Description="Conjunto de Atributos de Producto";

@XendraTrl(Identifier="9c392bfc-e3bb-89fa-ed3a-ca3999ce7d15")
public static String es_PE_FIELD_AttributeSet_AttributeSet_Help="Defina los sistemas de la cualidad de producto para agregar cualidades y valores adicionales al producto. Usted necesita definir una cualidad fijada si desea seguir el número de conteo por entregas y de porción.";

@XendraTrl(Identifier="9c392bfc-e3bb-89fa-ed3a-ca3999ce7d15")
public static String es_PE_FIELD_AttributeSet_AttributeSet_Name="Conjunto de Atributos";

@XendraField(AD_Column_ID="M_AttributeSet_ID",IsCentrallyMaintained=true,
AD_Tab_ID="4e102f94-c27d-366d-1ef6-564fab23f1b3",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9c392bfc-e3bb-89fa-ed3a-ca3999ce7d15")
public static final String FIELDNAME_AttributeSet_AttributeSet="9c392bfc-e3bb-89fa-ed3a-ca3999ce7d15";
/** Column name M_AttributeSet_ID */
public static final String COLUMNNAME_M_AttributeSet_ID = "M_AttributeSet_ID";
/** Set Lot Control.
@param M_LotCtl_ID Product Lot Control */
public void setM_LotCtl_ID (int M_LotCtl_ID)
{
if (M_LotCtl_ID <= 0) set_Value (COLUMNNAME_M_LotCtl_ID, null);
 else 
set_Value (COLUMNNAME_M_LotCtl_ID, Integer.valueOf(M_LotCtl_ID));
}
/** Get Lot Control.
@return Product Lot Control */
public int getM_LotCtl_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_LotCtl_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="febbfaed-169f-56ee-e103-5024b4c2c7e1")
public static String es_PE_FIELD_AttributeSet_LotControl_Description="Control del lote del producto";

@XendraTrl(Identifier="febbfaed-169f-56ee-e103-5024b4c2c7e1")
public static String es_PE_FIELD_AttributeSet_LotControl_Help="Definición para crear los números de lote para los productos";

@XendraTrl(Identifier="febbfaed-169f-56ee-e103-5024b4c2c7e1")
public static String es_PE_FIELD_AttributeSet_LotControl_Name="Control de Lote";

@XendraField(AD_Column_ID="M_LotCtl_ID",IsCentrallyMaintained=true,
AD_Tab_ID="4e102f94-c27d-366d-1ef6-564fab23f1b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsLot@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="febbfaed-169f-56ee-e103-5024b4c2c7e1")
public static final String FIELDNAME_AttributeSet_LotControl="febbfaed-169f-56ee-e103-5024b4c2c7e1";

@XendraTrl(Identifier="e45f9337-4fed-2fbb-8753-f16fcb0f778f")
public static String es_PE_COLUMN_M_LotCtl_ID_Name="Control de Lote";

@XendraColumn(AD_Element_ID="6a406977-cd64-deed-60f0-660eddec6189",ColumnName="M_LotCtl_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e45f9337-4fed-2fbb-8753-f16fcb0f778f",
Synchronized="2017-08-05 16:55:00.0")
/** Column name M_LotCtl_ID */
public static final String COLUMNNAME_M_LotCtl_ID = "M_LotCtl_ID";
/** Set Serial No Control.
@param M_SerNoCtl_ID Product Serial Number Control */
public void setM_SerNoCtl_ID (int M_SerNoCtl_ID)
{
if (M_SerNoCtl_ID <= 0) set_Value (COLUMNNAME_M_SerNoCtl_ID, null);
 else 
set_Value (COLUMNNAME_M_SerNoCtl_ID, Integer.valueOf(M_SerNoCtl_ID));
}
/** Get Serial No Control.
@return Product Serial Number Control */
public int getM_SerNoCtl_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_SerNoCtl_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b4fd7102-dbef-1b5b-9bf7-12cdd85e8556")
public static String es_PE_FIELD_AttributeSet_SerialNoControl_Description="Control de número de serie del producto";

@XendraTrl(Identifier="b4fd7102-dbef-1b5b-9bf7-12cdd85e8556")
public static String es_PE_FIELD_AttributeSet_SerialNoControl_Help="Definición para crear numero de serie de productos.";

@XendraTrl(Identifier="b4fd7102-dbef-1b5b-9bf7-12cdd85e8556")
public static String es_PE_FIELD_AttributeSet_SerialNoControl_Name="Control de numero de Serie";

@XendraField(AD_Column_ID="M_SerNoCtl_ID",IsCentrallyMaintained=true,
AD_Tab_ID="4e102f94-c27d-366d-1ef6-564fab23f1b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSerNo@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b4fd7102-dbef-1b5b-9bf7-12cdd85e8556")
public static final String FIELDNAME_AttributeSet_SerialNoControl="b4fd7102-dbef-1b5b-9bf7-12cdd85e8556";

@XendraTrl(Identifier="099afb21-d003-1bb3-ebc8-5b0c101c3e40")
public static String es_PE_COLUMN_M_SerNoCtl_ID_Name="Control de numero de Serie";

@XendraColumn(AD_Element_ID="0b84081b-2d0d-634a-535c-abb7dfc54cc8",ColumnName="M_SerNoCtl_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="099afb21-d003-1bb3-ebc8-5b0c101c3e40",
Synchronized="2017-08-05 16:55:00.0")
/** Column name M_SerNoCtl_ID */
public static final String COLUMNNAME_M_SerNoCtl_ID = "M_SerNoCtl_ID";
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

@XendraTrl(Identifier="4ff0a58e-7368-e441-ee09-70b73a669b0c")
public static String es_PE_FIELD_AttributeSet_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="4ff0a58e-7368-e441-ee09-70b73a669b0c")
public static String es_PE_FIELD_AttributeSet_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="4ff0a58e-7368-e441-ee09-70b73a669b0c")
public static String es_PE_FIELD_AttributeSet_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="4e102f94-c27d-366d-1ef6-564fab23f1b3",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="4ff0a58e-7368-e441-ee09-70b73a669b0c")
public static final String FIELDNAME_AttributeSet_Name="4ff0a58e-7368-e441-ee09-70b73a669b0c";

@XendraTrl(Identifier="b176cfee-63c9-bf81-cffe-d332646ed6dc")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b176cfee-63c9-bf81-cffe-d332646ed6dc",
Synchronized="2017-08-05 16:55:00.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set SerNo Char End Overwrite.
@param SerNoCharEOverwrite Serial Number End Indicator overwrite - default empty */
public void setSerNoCharEOverwrite (String SerNoCharEOverwrite)
{
if (SerNoCharEOverwrite != null && SerNoCharEOverwrite.length() > 1)
{
log.warning("Length > 1 - truncated");
SerNoCharEOverwrite = SerNoCharEOverwrite.substring(0,0);
}
set_Value (COLUMNNAME_SerNoCharEOverwrite, SerNoCharEOverwrite);
}
/** Get SerNo Char End Overwrite.
@return Serial Number End Indicator overwrite - default empty */
public String getSerNoCharEOverwrite() 
{
String value = (String)get_Value(COLUMNNAME_SerNoCharEOverwrite);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="8075e202-3ca3-d027-51d8-446a87c6565d")
public static String es_PE_FIELD_AttributeSet_SerNoCharEndOverwrite_Description="Caractér Final NoSerie indica sobreescritura - Predeterminado Vacío";

@XendraTrl(Identifier="8075e202-3ca3-d027-51d8-446a87c6565d")
public static String es_PE_FIELD_AttributeSet_SerNoCharEndOverwrite_Help="Si no definió, no se émplea caractér alguno.";

@XendraTrl(Identifier="8075e202-3ca3-d027-51d8-446a87c6565d")
public static String es_PE_FIELD_AttributeSet_SerNoCharEndOverwrite_Name="Caractér Final NoSerie Sobreescritura";

@XendraField(AD_Column_ID="SerNoCharEOverwrite",IsCentrallyMaintained=true,
AD_Tab_ID="4e102f94-c27d-366d-1ef6-564fab23f1b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSerNo@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8075e202-3ca3-d027-51d8-446a87c6565d")
public static final String FIELDNAME_AttributeSet_SerNoCharEndOverwrite="8075e202-3ca3-d027-51d8-446a87c6565d";

@XendraTrl(Identifier="91e02cbb-e611-af6a-6d37-71ac4e099894")
public static String es_PE_COLUMN_SerNoCharEOverwrite_Name="Caractér Final NoSerie Sobreescritura";

@XendraColumn(AD_Element_ID="83013493-2501-c1ac-f71b-8c6de6df27b6",
ColumnName="SerNoCharEOverwrite",AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="91e02cbb-e611-af6a-6d37-71ac4e099894",Synchronized="2017-08-05 16:55:00.0")
/** Column name SerNoCharEOverwrite */
public static final String COLUMNNAME_SerNoCharEOverwrite = "SerNoCharEOverwrite";
/** Set SerNo Char Start Overwrite.
@param SerNoCharSOverwrite Serial Number Start Indicator overwrite - default # */
public void setSerNoCharSOverwrite (String SerNoCharSOverwrite)
{
if (SerNoCharSOverwrite != null && SerNoCharSOverwrite.length() > 1)
{
log.warning("Length > 1 - truncated");
SerNoCharSOverwrite = SerNoCharSOverwrite.substring(0,0);
}
set_Value (COLUMNNAME_SerNoCharSOverwrite, SerNoCharSOverwrite);
}
/** Get SerNo Char Start Overwrite.
@return Serial Number Start Indicator overwrite - default # */
public String getSerNoCharSOverwrite() 
{
String value = (String)get_Value(COLUMNNAME_SerNoCharSOverwrite);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="ae3443e7-f716-4cef-e94c-9f8712dcba30")
public static String es_PE_FIELD_AttributeSet_SerNoCharStartOverwrite_Description="Caractér Inicial NoSerie  Indicar Sobreescritura  - predeterminado #";

@XendraTrl(Identifier="ae3443e7-f716-4cef-e94c-9f8712dcba30")
public static String es_PE_FIELD_AttributeSet_SerNoCharStartOverwrite_Help="Sino definió, el caractér predeterminado # es empleado";

@XendraTrl(Identifier="ae3443e7-f716-4cef-e94c-9f8712dcba30")
public static String es_PE_FIELD_AttributeSet_SerNoCharStartOverwrite_Name="Caractér Inicial NoSerie Sobreescritura  ";

@XendraField(AD_Column_ID="SerNoCharSOverwrite",IsCentrallyMaintained=true,
AD_Tab_ID="4e102f94-c27d-366d-1ef6-564fab23f1b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSerNo@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ae3443e7-f716-4cef-e94c-9f8712dcba30")
public static final String FIELDNAME_AttributeSet_SerNoCharStartOverwrite="ae3443e7-f716-4cef-e94c-9f8712dcba30";

@XendraTrl(Identifier="01438929-68bb-ce18-e38f-02eb3a7aa474")
public static String es_PE_COLUMN_SerNoCharSOverwrite_Name="Caractér Inicial NoSerie Sobreescritura  ";

@XendraColumn(AD_Element_ID="9773eeb2-0a19-c7ea-805d-f38fbe3cd71f",
ColumnName="SerNoCharSOverwrite",AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="01438929-68bb-ce18-e38f-02eb3a7aa474",Synchronized="2017-08-05 16:55:00.0")
/** Column name SerNoCharSOverwrite */
public static final String COLUMNNAME_SerNoCharSOverwrite = "SerNoCharSOverwrite";
}
