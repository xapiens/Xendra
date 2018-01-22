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
import org.compiere.model.reference.REF_M_RelatedProductType;
/** Generated Model for M_RelatedProduct
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_RelatedProduct extends PO
{
/** Standard Constructor
@param ctx context
@param M_RelatedProduct_ID id
@param trxName transaction
*/
public X_M_RelatedProduct (Properties ctx, int M_RelatedProduct_ID, String trxName)
{
super (ctx, M_RelatedProduct_ID, trxName);
/** if (M_RelatedProduct_ID == 0)
{
setM_Product_ID (0);
setName (null);
setRelatedProduct_ID (0);
setRelatedProductType (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_RelatedProduct (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=662 */
public static int Table_ID=MTable.getTable_ID("M_RelatedProduct");

@XendraTrl(Identifier="d7ce862b-b1bf-8e24-e70d-096d03bf0649")
public static String es_PE_TAB_Related_Description="Producto relacionado";

@XendraTrl(Identifier="d7ce862b-b1bf-8e24-e70d-096d03bf0649")
public static String es_PE_TAB_Related_Name="Relacionado";

@XendraTrl(Identifier="d7ce862b-b1bf-8e24-e70d-096d03bf0649")
public static String es_PE_TAB_Related_Help="Producto relacionado- ej. Por promociones";

@XendraTab(Name="Related",Description="Related Product",
Help="Related Product - e.g. for promotions",AD_Window_ID="ce2d4e2c-ba4e-29bf-9f71-66fecdc05f55",
SeqNo=40,TabLevel=1,IsSingleRow=false,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="",HasTree=false,WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=true,Parent_Column_ID="",
Identifier="d7ce862b-b1bf-8e24-e70d-096d03bf0649",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Related="d7ce862b-b1bf-8e24-e70d-096d03bf0649";

@XendraTrl(Identifier="8e83fd5a-4233-071a-b689-d3de076be7e3")
public static String es_PE_TABLE_M_RelatedProduct_Name="M_RelatedProduct";

@XendraTable(Name="Product Related",Description="",Help="",TableName="M_RelatedProduct",
AccessLevel="3",AD_Window_ID="ce2d4e2c-ba4e-29bf-9f71-66fecdc05f55",AD_Val_Rule_ID="",IsKey=0,
LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="8e83fd5a-4233-071a-b689-d3de076be7e3",Synchronized="2017-08-16 11:43:31.0")
/** TableName=M_RelatedProduct */
public static final String Table_Name="M_RelatedProduct";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_RelatedProduct");

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
    Table_ID = MTable.getTable_ID("M_RelatedProduct");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_RelatedProduct[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Description.
@param Description Optional short DESCRIPTION of the record */
public void setDescription (String Description)
{
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

@XendraTrl(Identifier="13c2d027-e21e-d37b-8468-b89be96c41ae")
public static String es_PE_FIELD_Related_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="13c2d027-e21e-d37b-8468-b89be96c41ae")
public static String es_PE_FIELD_Related_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="13c2d027-e21e-d37b-8468-b89be96c41ae")
public static String es_PE_FIELD_Related_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="d7ce862b-b1bf-8e24-e70d-096d03bf0649",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="13c2d027-e21e-d37b-8468-b89be96c41ae")
public static final String FIELDNAME_Related_Description="13c2d027-e21e-d37b-8468-b89be96c41ae";

@XendraTrl(Identifier="f5c3a384-2fc3-7235-c1f2-82c056b69d52")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f5c3a384-2fc3-7235-c1f2-82c056b69d52",
Synchronized="2017-08-05 16:55:29.0")
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
@XendraTrl(Identifier="5b3aa221-57c7-420d-82b6-7ccdc5bd7794")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5b3aa221-57c7-420d-82b6-7ccdc5bd7794",
Synchronized="2017-08-05 16:55:29.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Product.
@param M_Product_ID Product, Service, Item */
public void setM_Product_ID (int M_Product_ID)
{
if (M_Product_ID < 1) throw new IllegalArgumentException ("M_Product_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_Product_ID, Integer.valueOf(M_Product_ID));
}
/** Get Product.
@return Product, Service, Item */
public int getM_Product_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d47b144d-7cb1-5e47-3b61-487545a129ce")
public static String es_PE_FIELD_Related_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="d47b144d-7cb1-5e47-3b61-487545a129ce")
public static String es_PE_FIELD_Related_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="d47b144d-7cb1-5e47-3b61-487545a129ce")
public static String es_PE_FIELD_Related_Product_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d7ce862b-b1bf-8e24-e70d-096d03bf0649",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d47b144d-7cb1-5e47-3b61-487545a129ce")
public static final String FIELDNAME_Related_Product="d47b144d-7cb1-5e47-3b61-487545a129ce";

@XendraTrl(Identifier="d3666dfa-0536-16d1-f3e0-54591bfa37ce")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="4281f8eb-238e-6b28-eb66-8cc866e6312c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d3666dfa-0536-16d1-f3e0-54591bfa37ce",Synchronized="2017-08-05 16:55:29.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
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
@XendraTrl(Identifier="19ed2947-9f80-03f5-a9f9-d90a942f2423")
public static String es_PE_FIELD_Related_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="19ed2947-9f80-03f5-a9f9-d90a942f2423")
public static String es_PE_FIELD_Related_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="19ed2947-9f80-03f5-a9f9-d90a942f2423")
public static String es_PE_FIELD_Related_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="d7ce862b-b1bf-8e24-e70d-096d03bf0649",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="19ed2947-9f80-03f5-a9f9-d90a942f2423")
public static final String FIELDNAME_Related_Name="19ed2947-9f80-03f5-a9f9-d90a942f2423";

@XendraTrl(Identifier="fd6d481a-ed9d-247a-d73b-0901a3730ceb")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fd6d481a-ed9d-247a-d73b-0901a3730ceb",
Synchronized="2017-08-05 16:55:29.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";

/** RelatedProduct_ID AD_Reference=28b49c4d-0409-b2e0-b70e-d686f8d6503f */
public static final int RELATEDPRODUCT_ID_AD_Reference_ID=162;
/** Set Related Product.
@param RelatedProduct_ID Related Product */
public void setRelatedProduct_ID (int RelatedProduct_ID)
{
if (RelatedProduct_ID < 1) throw new IllegalArgumentException ("RelatedProduct_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_RelatedProduct_ID, Integer.valueOf(RelatedProduct_ID));
}
/** Get Related Product.
@return Related Product */
public int getRelatedProduct_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_RelatedProduct_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="55676fe3-527d-751e-013e-313463cbc5fa")
public static String es_PE_FIELD_Related_RelatedProduct_Description="Producto Relacionado";

@XendraTrl(Identifier="55676fe3-527d-751e-013e-313463cbc5fa")
public static String es_PE_FIELD_Related_RelatedProduct_Name="Producto Relacionado";

@XendraField(AD_Column_ID="RelatedProduct_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d7ce862b-b1bf-8e24-e70d-096d03bf0649",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="55676fe3-527d-751e-013e-313463cbc5fa")
public static final String FIELDNAME_Related_RelatedProduct="55676fe3-527d-751e-013e-313463cbc5fa";

@XendraTrl(Identifier="4ce9d6fd-3b76-7320-cc9c-643432e1a82d")
public static String es_PE_COLUMN_RelatedProduct_ID_Name="Producto Relacionado";

@XendraColumn(AD_Element_ID="093c6e93-eba4-465c-1ee3-8b314e6ed707",ColumnName="RelatedProduct_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="28b49c4d-0409-b2e0-b70e-d686f8d6503f",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="4ce9d6fd-3b76-7320-cc9c-643432e1a82d",Synchronized="2017-08-05 16:55:29.0")
/** Column name RelatedProduct_ID */
public static final String COLUMNNAME_RelatedProduct_ID = "RelatedProduct_ID";

/** RelatedProductType AD_Reference=06e7e690-1ef7-8489-f212-f01f4b924850 */
public static final int RELATEDPRODUCTTYPE_AD_Reference_ID=313;
/** Set Related Product Type.
@param RelatedProductType Related Product Type */
public void setRelatedProductType (String RelatedProductType)
{
if (RelatedProductType == null) throw new IllegalArgumentException ("RelatedProductType is mandatory");
if (RelatedProductType.equals(REF_M_RelatedProductType.WebPromotion) || RelatedProductType.equals(REF_M_RelatedProductType.Alternative) || RelatedProductType.equals(REF_M_RelatedProductType.Supplemental));
 else throw new IllegalArgumentException ("RelatedProductType Invalid value - " + RelatedProductType + " - Reference_ID=313 - P - A - S");
if (RelatedProductType.length() > 1)
{
log.warning("Length > 1 - truncated");
RelatedProductType = RelatedProductType.substring(0,0);
}
set_Value (COLUMNNAME_RelatedProductType, RelatedProductType);
}
/** Get Related Product Type.
@return Related Product Type */
public String getRelatedProductType() 
{
return (String)get_Value(COLUMNNAME_RelatedProductType);
}

@XendraTrl(Identifier="8b834251-603f-6291-4e4b-badda897d41a")
public static String es_PE_FIELD_Related_RelatedProductType_Name="Tipo de Producto Relacionado";

@XendraField(AD_Column_ID="RelatedProductType",IsCentrallyMaintained=true,
AD_Tab_ID="d7ce862b-b1bf-8e24-e70d-096d03bf0649",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8b834251-603f-6291-4e4b-badda897d41a")
public static final String FIELDNAME_Related_RelatedProductType="8b834251-603f-6291-4e4b-badda897d41a";

@XendraTrl(Identifier="28b00556-836a-330c-8e85-82c4ad34d229")
public static String es_PE_COLUMN_RelatedProductType_Name="Tipo de Producto Relacionado";

@XendraColumn(AD_Element_ID="0a701c76-4b51-4a2a-5b79-22a347dad6d7",ColumnName="RelatedProductType",
AD_Reference_ID=17,AD_Reference_Value_ID="06e7e690-1ef7-8489-f212-f01f4b924850",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="28b00556-836a-330c-8e85-82c4ad34d229",Synchronized="2017-08-05 16:55:29.0")
/** Column name RelatedProductType */
public static final String COLUMNNAME_RelatedProductType = "RelatedProductType";
}
