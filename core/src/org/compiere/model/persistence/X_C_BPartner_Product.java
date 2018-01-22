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
/** Generated Model for C_BPartner_Product
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_BPartner_Product extends PO
{
/** Standard Constructor
@param ctx context
@param C_BPartner_Product_ID id
@param trxName transaction
*/
public X_C_BPartner_Product (Properties ctx, int C_BPartner_Product_ID, String trxName)
{
super (ctx, C_BPartner_Product_ID, trxName);
/** if (C_BPartner_Product_ID == 0)
{
setC_BPartner_ID (0);
setM_Product_ID (0);
setShelfLifeMinDays (0);
setShelfLifeMinPct (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_BPartner_Product (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=632 */
public static int Table_ID=MTable.getTable_ID("C_BPartner_Product");

@XendraTrl(Identifier="d476f9a6-e2ca-c115-f216-41bbf2c8c742")
public static String es_PE_TAB_BusinessPartner_Description="Información de Socio de Negocio especifico de un producto";

@XendraTrl(Identifier="d476f9a6-e2ca-c115-f216-41bbf2c8c742")
public static String es_PE_TAB_BusinessPartner_Name="Socio de Negocio";

@XendraTrl(Identifier="d476f9a6-e2ca-c115-f216-41bbf2c8c742")
public static String es_PE_TAB_BusinessPartner_Help="¡Observe que una cierta información está solamente para la referencia!";

@XendraTab(Name="Business Partner",
Description="Business Partner specific Information of a Product",
Help="Note that some information is for reference only!  The ",
AD_Window_ID="ce2d4e2c-ba4e-29bf-9f71-66fecdc05f55",SeqNo=50,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="a50bac81-2474-e7d3-e18c-930e9b548d0b",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="d476f9a6-e2ca-c115-f216-41bbf2c8c742",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_BusinessPartner="d476f9a6-e2ca-c115-f216-41bbf2c8c742";

@XendraTrl(Identifier="b35e2b6f-8433-00ba-0de5-ea767d79d727")
public static String es_PE_TABLE_C_BPartner_Product_Name="C_BPartner_Product";

@XendraTable(Name="Product Business Partner",Description="",Help="",TableName="C_BPartner_Product",
AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,LoadSeq=145,IsSecurityEnabled=false,
IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,PO_Window_ID="",
ID="org.xendra.commercial",Identifier="b35e2b6f-8433-00ba-0de5-ea767d79d727",
Synchronized="2017-08-16 11:41:32.0")
/** TableName=C_BPartner_Product */
public static final String Table_Name="C_BPartner_Product";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_BPartner_Product");

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
    Table_ID = MTable.getTable_ID("C_BPartner_Product");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_BPartner_Product[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Business Partner .
@param C_BPartner_ID Identifies a Business Partner */
public void setC_BPartner_ID (int C_BPartner_ID)
{
if (C_BPartner_ID < 1) throw new IllegalArgumentException ("C_BPartner_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
}
/** Get Business Partner .
@return Identifies a Business Partner */
public int getC_BPartner_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="06705851-4aea-3614-2476-8fb75d82d29b")
public static String es_PE_FIELD_BusinessPartner_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="06705851-4aea-3614-2476-8fb75d82d29b")
public static String es_PE_FIELD_BusinessPartner_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraTrl(Identifier="06705851-4aea-3614-2476-8fb75d82d29b")
public static String es_PE_FIELD_BusinessPartner_BusinessPartner_Name="Socio de Negocio";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d476f9a6-e2ca-c115-f216-41bbf2c8c742",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="06705851-4aea-3614-2476-8fb75d82d29b")
public static final String FIELDNAME_BusinessPartner_BusinessPartner="06705851-4aea-3614-2476-8fb75d82d29b";

@XendraTrl(Identifier="2a7df79b-ec2d-c8ac-6eb2-249bb7155227")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="06fdbbe9-e1c4-3ee4-4a9d-73d1a990cc42",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="2a7df79b-ec2d-c8ac-6eb2-249bb7155227",Synchronized="2017-08-05 16:53:24.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
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

@XendraTrl(Identifier="51a60632-bf07-9e46-f3fd-71b77da0bd0f")
public static String es_PE_FIELD_BusinessPartner_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="51a60632-bf07-9e46-f3fd-71b77da0bd0f")
public static String es_PE_FIELD_BusinessPartner_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="51a60632-bf07-9e46-f3fd-71b77da0bd0f")
public static String es_PE_FIELD_BusinessPartner_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="d476f9a6-e2ca-c115-f216-41bbf2c8c742",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="51a60632-bf07-9e46-f3fd-71b77da0bd0f")
public static final String FIELDNAME_BusinessPartner_Description="51a60632-bf07-9e46-f3fd-71b77da0bd0f";

@XendraTrl(Identifier="474537dc-ca82-3f64-7e87-29f33ee77447")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="474537dc-ca82-3f64-7e87-29f33ee77447",
Synchronized="2017-08-05 16:53:24.0")
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
@XendraTrl(Identifier="cb3ffdda-70c2-4fe0-97cd-cf3c1a050f87")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cb3ffdda-70c2-4fe0-97cd-cf3c1a050f87",
Synchronized="2017-08-05 16:53:24.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Manufacturer.
@param Manufacturer Manufacturer of the Product */
public void setManufacturer (String Manufacturer)
{
if (Manufacturer != null && Manufacturer.length() > 30)
{
log.warning("Length > 30 - truncated");
Manufacturer = Manufacturer.substring(0,29);
}
set_Value (COLUMNNAME_Manufacturer, Manufacturer);
}
/** Get Manufacturer.
@return Manufacturer of the Product */
public String getManufacturer() 
{
String value = (String)get_Value(COLUMNNAME_Manufacturer);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="08da43e5-377e-a9d9-02b0-22c8f3a19273")
public static String es_PE_FIELD_BusinessPartner_Manufacturer_Name="Manufactura";

@XendraField(AD_Column_ID="Manufacturer",IsCentrallyMaintained=true,
AD_Tab_ID="d476f9a6-e2ca-c115-f216-41bbf2c8c742",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="08da43e5-377e-a9d9-02b0-22c8f3a19273")
public static final String FIELDNAME_BusinessPartner_Manufacturer="08da43e5-377e-a9d9-02b0-22c8f3a19273";

@XendraTrl(Identifier="99daacf6-ed04-a5d3-34b3-cfdded2b8156")
public static String es_PE_COLUMN_Manufacturer_Name="Manufactura";

@XendraColumn(AD_Element_ID="0978599c-589f-e3c5-586b-8346ff97ccbd",ColumnName="Manufacturer",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="99daacf6-ed04-a5d3-34b3-cfdded2b8156",
Synchronized="2017-08-05 16:53:24.0")
/** Column name Manufacturer */
public static final String COLUMNNAME_Manufacturer = "Manufacturer";
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

@XendraTrl(Identifier="72b779a4-44df-962a-2d18-fc57e4260e31")
public static String es_PE_FIELD_BusinessPartner_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="72b779a4-44df-962a-2d18-fc57e4260e31")
public static String es_PE_FIELD_BusinessPartner_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="72b779a4-44df-962a-2d18-fc57e4260e31")
public static String es_PE_FIELD_BusinessPartner_Product_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d476f9a6-e2ca-c115-f216-41bbf2c8c742",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="72b779a4-44df-962a-2d18-fc57e4260e31")
public static final String FIELDNAME_BusinessPartner_Product="72b779a4-44df-962a-2d18-fc57e4260e31";

@XendraTrl(Identifier="a50bac81-2474-e7d3-e18c-930e9b548d0b")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="4281f8eb-238e-6b28-eb66-8cc866e6312c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="a50bac81-2474-e7d3-e18c-930e9b548d0b",Synchronized="2017-08-05 16:53:24.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set Quality Rating.
@param QualityRating Method for rating vendors */
public void setQualityRating (BigDecimal QualityRating)
{
set_Value (COLUMNNAME_QualityRating, QualityRating);
}
/** Get Quality Rating.
@return Method for rating vendors */
public BigDecimal getQualityRating() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QualityRating);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="5ff6afea-1b1f-96c8-3bbe-109aa109f14e")
public static String es_PE_FIELD_BusinessPartner_QualityRating_Description="Método para evaluar proveedores";

@XendraTrl(Identifier="5ff6afea-1b1f-96c8-3bbe-109aa109f14e")
public static String es_PE_FIELD_BusinessPartner_QualityRating_Help="La valuación de la calidad indica cómo un proveedor es evaluado (número mayor = calidad mayor)";

@XendraTrl(Identifier="5ff6afea-1b1f-96c8-3bbe-109aa109f14e")
public static String es_PE_FIELD_BusinessPartner_QualityRating_Name="Valoración de la Calidad";

@XendraField(AD_Column_ID="QualityRating",IsCentrallyMaintained=true,
AD_Tab_ID="d476f9a6-e2ca-c115-f216-41bbf2c8c742",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5ff6afea-1b1f-96c8-3bbe-109aa109f14e")
public static final String FIELDNAME_BusinessPartner_QualityRating="5ff6afea-1b1f-96c8-3bbe-109aa109f14e";

@XendraTrl(Identifier="e22eb5bf-ef69-5990-ae73-c16152b5f6fe")
public static String es_PE_COLUMN_QualityRating_Name="Valoración de la Calidad";

@XendraColumn(AD_Element_ID="3c5a3b4a-865d-e1e0-cb17-af1c750a9244",ColumnName="QualityRating",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e22eb5bf-ef69-5990-ae73-c16152b5f6fe",
Synchronized="2017-08-05 16:53:24.0")
/** Column name QualityRating */
public static final String COLUMNNAME_QualityRating = "QualityRating";
/** Set Min Shelf Life Days.
@param ShelfLifeMinDays Minimum Shelf Life in days based on Product Instance Guarantee Date */
public void setShelfLifeMinDays (int ShelfLifeMinDays)
{
set_Value (COLUMNNAME_ShelfLifeMinDays, Integer.valueOf(ShelfLifeMinDays));
}
/** Get Min Shelf Life Days.
@return Minimum Shelf Life in days based on Product Instance Guarantee Date */
public int getShelfLifeMinDays() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_ShelfLifeMinDays);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="be8e8c7a-0648-08be-7143-137e9dc3441d")
public static String es_PE_FIELD_BusinessPartner_MinShelfLifeDays_Description="Minimo de vida útil en días, basado en la fecha de garantia del producto.";

@XendraTrl(Identifier="be8e8c7a-0648-08be-7143-137e9dc3441d")
public static String es_PE_FIELD_BusinessPartner_MinShelfLifeDays_Help="Vida útil minima de productos con una fecha de garantía. si > 0 usted no puede seleccionar productos con una vida útil menos que la vida útil del minimo, a menos que usted seleccione \"toda demostración\"";

@XendraTrl(Identifier="be8e8c7a-0648-08be-7143-137e9dc3441d")
public static String es_PE_FIELD_BusinessPartner_MinShelfLifeDays_Name="Mín de Vida útil en días";

@XendraField(AD_Column_ID="ShelfLifeMinDays",IsCentrallyMaintained=true,
AD_Tab_ID="d476f9a6-e2ca-c115-f216-41bbf2c8c742",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="be8e8c7a-0648-08be-7143-137e9dc3441d")
public static final String FIELDNAME_BusinessPartner_MinShelfLifeDays="be8e8c7a-0648-08be-7143-137e9dc3441d";

@XendraTrl(Identifier="0c40779d-59a9-154b-f5d1-f84281ead078")
public static String es_PE_COLUMN_ShelfLifeMinDays_Name="Mín de Vida útil en días";

@XendraColumn(AD_Element_ID="931716db-4153-fddd-781d-447a1aa761d3",ColumnName="ShelfLifeMinDays",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0c40779d-59a9-154b-f5d1-f84281ead078",
Synchronized="2017-08-05 16:53:24.0")
/** Column name ShelfLifeMinDays */
public static final String COLUMNNAME_ShelfLifeMinDays = "ShelfLifeMinDays";
/** Set Min Shelf Life %.
@param ShelfLifeMinPct Minimum Shelf Life in percent based on Product Instance Guarantee Date */
public void setShelfLifeMinPct (int ShelfLifeMinPct)
{
set_Value (COLUMNNAME_ShelfLifeMinPct, Integer.valueOf(ShelfLifeMinPct));
}
/** Get Min Shelf Life %.
@return Minimum Shelf Life in percent based on Product Instance Guarantee Date */
public int getShelfLifeMinPct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_ShelfLifeMinPct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="49432464-85b0-2cd8-a02c-716e671f615a")
public static String es_PE_FIELD_BusinessPartner_MinShelfLife_Description="Mínimo de vida útil en porcentaje basados en la fecha lo que garantiza el producto.";

@XendraTrl(Identifier="49432464-85b0-2cd8-a02c-716e671f615a")
public static String es_PE_FIELD_BusinessPartner_MinShelfLife_Help="Minimo de vida útil en productos con fecha de garantía. Si > 0 Usted no puede seleccionar productos con una vida útil. (fecha - dia de la garantía) / menos que la vida útil del minimo, a menos que usted seleccione \"toda demostración\"";

@XendraTrl(Identifier="49432464-85b0-2cd8-a02c-716e671f615a")
public static String es_PE_FIELD_BusinessPartner_MinShelfLife_Name="Mín de Vida útil %";

@XendraField(AD_Column_ID="ShelfLifeMinPct",IsCentrallyMaintained=true,
AD_Tab_ID="d476f9a6-e2ca-c115-f216-41bbf2c8c742",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="49432464-85b0-2cd8-a02c-716e671f615a")
public static final String FIELDNAME_BusinessPartner_MinShelfLife="49432464-85b0-2cd8-a02c-716e671f615a";

@XendraTrl(Identifier="d236b4d5-54f7-e358-318c-521238e4d420")
public static String es_PE_COLUMN_ShelfLifeMinPct_Name="Mín de Vida útil %";

@XendraColumn(AD_Element_ID="47d4dbcc-2d80-bdd4-16ca-21dca83a14da",ColumnName="ShelfLifeMinPct",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d236b4d5-54f7-e358-318c-521238e4d420",
Synchronized="2017-08-05 16:53:24.0")
/** Column name ShelfLifeMinPct */
public static final String COLUMNNAME_ShelfLifeMinPct = "ShelfLifeMinPct";
/** Set Partner Category.
@param VendorCategory Product Category of the Business Partner */
public void setVendorCategory (String VendorCategory)
{
if (VendorCategory != null && VendorCategory.length() > 30)
{
log.warning("Length > 30 - truncated");
VendorCategory = VendorCategory.substring(0,29);
}
set_Value (COLUMNNAME_VendorCategory, VendorCategory);
}
/** Get Partner Category.
@return Product Category of the Business Partner */
public String getVendorCategory() 
{
String value = (String)get_Value(COLUMNNAME_VendorCategory);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="bd7b4003-3e29-8b35-4808-69adae604c09")
public static String es_PE_FIELD_BusinessPartner_PartnerCategory_Description="Proveedor";

@XendraTrl(Identifier="bd7b4003-3e29-8b35-4808-69adae604c09")
public static String es_PE_FIELD_BusinessPartner_PartnerCategory_Help="La categoría del proveedor identifica la categoría usada por el proveedor para este producto";

@XendraTrl(Identifier="bd7b4003-3e29-8b35-4808-69adae604c09")
public static String es_PE_FIELD_BusinessPartner_PartnerCategory_Name="Categoría del Proveedor";

@XendraField(AD_Column_ID="VendorCategory",IsCentrallyMaintained=true,
AD_Tab_ID="d476f9a6-e2ca-c115-f216-41bbf2c8c742",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bd7b4003-3e29-8b35-4808-69adae604c09")
public static final String FIELDNAME_BusinessPartner_PartnerCategory="bd7b4003-3e29-8b35-4808-69adae604c09";

@XendraTrl(Identifier="abd28082-52e1-4d02-2389-0ff976e0b29b")
public static String es_PE_COLUMN_VendorCategory_Name="Categoría del Proveedor";

@XendraColumn(AD_Element_ID="e4cdee60-a64a-b5fe-51f4-6759366bdb6e",ColumnName="VendorCategory",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="abd28082-52e1-4d02-2389-0ff976e0b29b",
Synchronized="2017-08-05 16:53:24.0")
/** Column name VendorCategory */
public static final String COLUMNNAME_VendorCategory = "VendorCategory";
/** Set Partner Product Key.
@param VendorProductNo Product Key of the Business Partner */
public void setVendorProductNo (String VendorProductNo)
{
if (VendorProductNo != null && VendorProductNo.length() > 30)
{
log.warning("Length > 30 - truncated");
VendorProductNo = VendorProductNo.substring(0,29);
}
set_Value (COLUMNNAME_VendorProductNo, VendorProductNo);
}
/** Get Partner Product Key.
@return Product Key of the Business Partner */
public String getVendorProductNo() 
{
String value = (String)get_Value(COLUMNNAME_VendorProductNo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="97572f1d-809e-fc4b-ad4e-70c89689e3e5")
public static String es_PE_FIELD_BusinessPartner_PartnerProductKey_Description="Proveedor";

@XendraTrl(Identifier="97572f1d-809e-fc4b-ad4e-70c89689e3e5")
public static String es_PE_FIELD_BusinessPartner_PartnerProductKey_Help="El número de producto del proveedor identifica el número usado por el proveedor para este producto.";

@XendraTrl(Identifier="97572f1d-809e-fc4b-ad4e-70c89689e3e5")
public static String es_PE_FIELD_BusinessPartner_PartnerProductKey_Name="No. de Producto del Proveedor";

@XendraField(AD_Column_ID="VendorProductNo",IsCentrallyMaintained=true,
AD_Tab_ID="d476f9a6-e2ca-c115-f216-41bbf2c8c742",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="97572f1d-809e-fc4b-ad4e-70c89689e3e5")
public static final String FIELDNAME_BusinessPartner_PartnerProductKey="97572f1d-809e-fc4b-ad4e-70c89689e3e5";

@XendraTrl(Identifier="a20ac069-d64b-c0d9-77e6-5ef7eea71356")
public static String es_PE_COLUMN_VendorProductNo_Name="No. de Producto del Proveedor";

@XendraColumn(AD_Element_ID="c028b618-164f-85b1-8821-99e6545860ce",ColumnName="VendorProductNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a20ac069-d64b-c0d9-77e6-5ef7eea71356",
Synchronized="2017-08-05 16:53:24.0")
/** Column name VendorProductNo */
public static final String COLUMNNAME_VendorProductNo = "VendorProductNo";
}
