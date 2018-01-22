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
/** Generated Model for M_PriceList_Version
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_PriceList_Version extends PO
{
/** Standard Constructor
@param ctx context
@param M_PriceList_Version_ID id
@param trxName transaction
*/
public X_M_PriceList_Version (Properties ctx, int M_PriceList_Version_ID, String trxName)
{
super (ctx, M_PriceList_Version_ID, trxName);
/** if (M_PriceList_Version_ID == 0)
{
setM_DiscountSchema_ID (0);
setM_PriceList_ID (0);
setM_PriceList_Version_ID (0);
setName (null);	
// @#Date@
setValidFrom (new Timestamp(System.currentTimeMillis()));	
// @#Date@
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_PriceList_Version (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=295 */
public static int Table_ID=MTable.getTable_ID("M_PriceList_Version");

@XendraTrl(Identifier="c6d0d23b-37f8-936f-e44f-da8441ecaf83")
public static String es_PE_TAB_Version_Description="Mantener versiones de las listas de precio";

@XendraTrl(Identifier="c6d0d23b-37f8-936f-e44f-da8441ecaf83")
public static String es_PE_TAB_Version_Name="Versión";

@XendraTrl(Identifier="c6d0d23b-37f8-936f-e44f-da8441ecaf83")
public static String es_PE_TAB_Version_Help="Las listas de precios son creadas automáticamente basadas en información de compras de producto y descuento de proveedores. Otra alternativa para su creación es copiarlas de listas de precio existentes y recalcularlas. Es posible recalcularla en base a la misma lista ó no usar lista de precios para el recalculo.";

@XendraTab(Name="Version",Description="Maintain price list versions",
Help="Price lists are automatically created based on Product Purchasing Information and the Vendor Category Discount. The other alternative is to copy them from existing pricelists and the re-calculate them. You can also re-calculate the pricelist by referencing no pricelist or referencing the same pricelist.  If no base price list is selected, the Procuct Purchase records are used as reference.",
AD_Window_ID="e3c55106-2db1-b535-c578-d544cd183313",SeqNo=20,TabLevel=1,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="c6d0d23b-37f8-936f-e44f-da8441ecaf83",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Version="c6d0d23b-37f8-936f-e44f-da8441ecaf83";

@XendraTrl(Identifier="87e1d27a-6127-2128-397c-1cf851750ed6")
public static String es_PE_TABLE_M_PriceList_Version_Name="Versión de Lista de Precios";


@XendraTable(Name="Price List Version",Description="Identifies a unique instance of a Price List",
Help="",TableName="M_PriceList_Version",AccessLevel="3",
AD_Window_ID="e3c55106-2db1-b535-c578-d544cd183313",AD_Val_Rule_ID="",IsKey=1,LoadSeq=95,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.material",Identifier="87e1d27a-6127-2128-397c-1cf851750ed6",
Synchronized="2017-08-16 11:43:24.0")
/** TableName=M_PriceList_Version */
public static final String Table_Name="M_PriceList_Version";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_PriceList_Version");

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
    Table_ID = MTable.getTable_ID("M_PriceList_Version");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_PriceList_Version[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Campaign.
@param C_Campaign_ID Marketing Campaign */
public void setC_Campaign_ID (int C_Campaign_ID)
{
if (C_Campaign_ID <= 0) set_Value (COLUMNNAME_C_Campaign_ID, null);
 else 
set_Value (COLUMNNAME_C_Campaign_ID, Integer.valueOf(C_Campaign_ID));
}
/** Get Campaign.
@return Marketing Campaign */
public int getC_Campaign_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Campaign_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f1ddf2e3-4a6c-d9ca-c9b2-0cfbb5928a19")
public static String es_PE_COLUMN_C_Campaign_ID_Name="Campaign";

@XendraColumn(AD_Element_ID="6cf08e31-d355-ee38-9c0b-bee20b3ea5b6",ColumnName="C_Campaign_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f1ddf2e3-4a6c-d9ca-c9b2-0cfbb5928a19",
Synchronized="2017-08-05 16:55:20.0")
/** Column name C_Campaign_ID */
public static final String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
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

@XendraTrl(Identifier="cb25ca64-22f0-80aa-740e-f2f1096a94dd")
public static String es_PE_FIELD_Version_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="cb25ca64-22f0-80aa-740e-f2f1096a94dd")
public static String es_PE_FIELD_Version_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="cb25ca64-22f0-80aa-740e-f2f1096a94dd")
public static String es_PE_FIELD_Version_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="c6d0d23b-37f8-936f-e44f-da8441ecaf83",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cb25ca64-22f0-80aa-740e-f2f1096a94dd")
public static final String FIELDNAME_Version_Description="cb25ca64-22f0-80aa-740e-f2f1096a94dd";

@XendraTrl(Identifier="3577dc90-a1c9-4e27-bd4a-856aada3595b")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3577dc90-a1c9-4e27-bd4a-856aada3595b",
Synchronized="2017-08-05 16:55:20.0")
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
@XendraTrl(Identifier="a79ef75a-94b3-4fe0-b22f-4057aa785be3")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a79ef75a-94b3-4fe0-b22f-4057aa785be3",
Synchronized="2017-08-05 16:55:20.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Discount Schema.
@param M_DiscountSchema_ID Schema to calculate the trade discount percentage */
public void setM_DiscountSchema_ID (int M_DiscountSchema_ID)
{
if (M_DiscountSchema_ID < 1) throw new IllegalArgumentException ("M_DiscountSchema_ID is mandatory.");
set_Value (COLUMNNAME_M_DiscountSchema_ID, Integer.valueOf(M_DiscountSchema_ID));
}
/** Get Discount Schema.
@return Schema to calculate the trade discount percentage */
public int getM_DiscountSchema_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_DiscountSchema_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="374aa42a-9074-dc70-deec-4f79174fb1ec")
public static String es_PE_FIELD_Version_PriceListSchema_Description="Esquema para calcular el porcentaje de descuento comercial";

@XendraTrl(Identifier="374aa42a-9074-dc70-deec-4f79174fb1ec")
public static String es_PE_FIELD_Version_PriceListSchema_Help="Después del cálculo de precio (estándar); el porcentaje de descuento comercial es calculado y aplicado resultando en el precio final";

@XendraTrl(Identifier="374aa42a-9074-dc70-deec-4f79174fb1ec")
public static String es_PE_FIELD_Version_PriceListSchema_Name="Esq List Precios/Desc";

@XendraField(AD_Column_ID="M_DiscountSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c6d0d23b-37f8-936f-e44f-da8441ecaf83",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="374aa42a-9074-dc70-deec-4f79174fb1ec")
public static final String FIELDNAME_Version_PriceListSchema="374aa42a-9074-dc70-deec-4f79174fb1ec";

@XendraTrl(Identifier="c82ddb66-e74c-cb8b-5cfb-9221f2418322")
public static String es_PE_COLUMN_M_DiscountSchema_ID_Name="Esq List Precios/Desc";

@XendraColumn(AD_Element_ID="e8a3b5bd-239d-8376-eae6-8e5ebcfbe6fa",
ColumnName="M_DiscountSchema_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",
AD_Val_Rule_ID="b23483aa-fc6f-3a35-c703-d22d7c79b7d1",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c82ddb66-e74c-cb8b-5cfb-9221f2418322",
Synchronized="2017-08-05 16:55:20.0")
/** Column name M_DiscountSchema_ID */
public static final String COLUMNNAME_M_DiscountSchema_ID = "M_DiscountSchema_ID";
/** Set M_PriceList_ID.
@param M_PriceList_ID Unique identifier of a Price List */
public void setM_PriceList_ID (int M_PriceList_ID)
{
if (M_PriceList_ID < 1) throw new IllegalArgumentException ("M_PriceList_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_PriceList_ID, Integer.valueOf(M_PriceList_ID));
}
/** Get M_PriceList_ID.
@return Unique identifier of a Price List */
public int getM_PriceList_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_PriceList_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="462ce011-264f-657c-ded9-dbdebc3ed1b5")
public static String es_PE_FIELD_Version_M_PriceList_ID_Description="Identificador único de mi lista de precios";

@XendraTrl(Identifier="462ce011-264f-657c-ded9-dbdebc3ed1b5")
public static String es_PE_FIELD_Version_M_PriceList_ID_Help="Listas de precios son usadas para determinar el precio; margen y costo de artículos comprados ó vendidos.";

@XendraTrl(Identifier="462ce011-264f-657c-ded9-dbdebc3ed1b5")
public static String es_PE_FIELD_Version_M_PriceList_ID_Name="Lista de Precios";

@XendraField(AD_Column_ID="M_PriceList_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c6d0d23b-37f8-936f-e44f-da8441ecaf83",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="462ce011-264f-657c-ded9-dbdebc3ed1b5")
public static final String FIELDNAME_Version_M_PriceList_ID="462ce011-264f-657c-ded9-dbdebc3ed1b5";

@XendraTrl(Identifier="ef7a74d8-2215-a002-7259-d1c67febfcc3")
public static String es_PE_COLUMN_M_PriceList_ID_Name="Lista de Precios";

@XendraColumn(AD_Element_ID="652afdd3-9ff1-082d-5831-6aad828e0e09",ColumnName="M_PriceList_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ef7a74d8-2215-a002-7259-d1c67febfcc3",
Synchronized="2017-08-05 16:55:20.0")
/** Column name M_PriceList_ID */
public static final String COLUMNNAME_M_PriceList_ID = "M_PriceList_ID";

/** M_Pricelist_Version_Base_ID AD_Reference=84808698-f549-32c8-9435-3477bb7ce31c */
public static final int M_PRICELIST_VERSION_BASE_ID_AD_Reference_ID=188;
/** Set Base Price List.
@param M_Pricelist_Version_Base_ID Source for Price list calculations */
public void setM_Pricelist_Version_Base_ID (int M_Pricelist_Version_Base_ID)
{
if (M_Pricelist_Version_Base_ID <= 0) set_Value (COLUMNNAME_M_Pricelist_Version_Base_ID, null);
 else 
set_Value (COLUMNNAME_M_Pricelist_Version_Base_ID, Integer.valueOf(M_Pricelist_Version_Base_ID));
}
/** Get Base Price List.
@return Source for Price list calculations */
public int getM_Pricelist_Version_Base_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Pricelist_Version_Base_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="11ed4d5e-a190-c324-88d2-dcadc44d771a")
public static String es_PE_FIELD_Version_BasePriceList_Description="Fuente para el cálculo de la lista de precios.";

@XendraTrl(Identifier="11ed4d5e-a190-c324-88d2-dcadc44d771a")
public static String es_PE_FIELD_Version_BasePriceList_Help="La lista de precio base identifica el precio de lista usado para calcular precios (La fuente)";

@XendraTrl(Identifier="11ed4d5e-a190-c324-88d2-dcadc44d771a")
public static String es_PE_FIELD_Version_BasePriceList_Name="Lista de Precios Base";

@XendraField(AD_Column_ID="M_Pricelist_Version_Base_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c6d0d23b-37f8-936f-e44f-da8441ecaf83",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="11ed4d5e-a190-c324-88d2-dcadc44d771a")
public static final String FIELDNAME_Version_BasePriceList="11ed4d5e-a190-c324-88d2-dcadc44d771a";

@XendraTrl(Identifier="626e4101-d6f2-228c-3523-1a85f82e4439")
public static String es_PE_COLUMN_M_Pricelist_Version_Base_ID_Name="Lista de Precios Base";

@XendraColumn(AD_Element_ID="f99aa932-914a-10b6-eaf0-54fbd852e788",
ColumnName="M_Pricelist_Version_Base_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="84808698-f549-32c8-9435-3477bb7ce31c",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="626e4101-d6f2-228c-3523-1a85f82e4439",
Synchronized="2017-08-05 16:55:20.0")
/** Column name M_Pricelist_Version_Base_ID */
public static final String COLUMNNAME_M_Pricelist_Version_Base_ID = "M_Pricelist_Version_Base_ID";
/** Set Price List Version.
@param M_PriceList_Version_ID Identifies a unique instance of a Price List */
public void setM_PriceList_Version_ID (int M_PriceList_Version_ID)
{
if (M_PriceList_Version_ID < 1) throw new IllegalArgumentException ("M_PriceList_Version_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_PriceList_Version_ID, Integer.valueOf(M_PriceList_Version_ID));
}
/** Get Price List Version.
@return Identifies a unique instance of a Price List */
public int getM_PriceList_Version_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_PriceList_Version_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b4df2f22-fac2-0915-b72a-1841fc435cdf")
public static String es_PE_FIELD_Version_PriceListVersion_Description="Identifica una instancia única de una lista de precios";

@XendraTrl(Identifier="b4df2f22-fac2-0915-b72a-1841fc435cdf")
public static String es_PE_FIELD_Version_PriceListVersion_Help="Cada lista de precios puede tener múltiples versiones. El uso más común es indicar las fechas en que es válida una lista de precios.";

@XendraTrl(Identifier="b4df2f22-fac2-0915-b72a-1841fc435cdf")
public static String es_PE_FIELD_Version_PriceListVersion_Name="Versión de Lista de Precios";

@XendraField(AD_Column_ID="M_PriceList_Version_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c6d0d23b-37f8-936f-e44f-da8441ecaf83",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b4df2f22-fac2-0915-b72a-1841fc435cdf")
public static final String FIELDNAME_Version_PriceListVersion="b4df2f22-fac2-0915-b72a-1841fc435cdf";
/** Column name M_PriceList_Version_ID */
public static final String COLUMNNAME_M_PriceList_Version_ID = "M_PriceList_Version_ID";
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

@XendraTrl(Identifier="d4a21873-9b5f-86b6-3981-2d3b891dff88")
public static String es_PE_FIELD_Version_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="d4a21873-9b5f-86b6-3981-2d3b891dff88")
public static String es_PE_FIELD_Version_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="d4a21873-9b5f-86b6-3981-2d3b891dff88")
public static String es_PE_FIELD_Version_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="c6d0d23b-37f8-936f-e44f-da8441ecaf83",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="d4a21873-9b5f-86b6-3981-2d3b891dff88")
public static final String FIELDNAME_Version_Name="d4a21873-9b5f-86b6-3981-2d3b891dff88";

@XendraTrl(Identifier="58ae3f0e-2689-5dc2-1c95-53be6784ad13")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,
DefaultValue="@#Date@",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="58ae3f0e-2689-5dc2-1c95-53be6784ad13",Synchronized="2017-08-05 16:55:20.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Create.
@param ProcCreate Create */
public void setProcCreate (String ProcCreate)
{
if (ProcCreate != null && ProcCreate.length() > 1)
{
log.warning("Length > 1 - truncated");
ProcCreate = ProcCreate.substring(0,0);
}
set_Value (COLUMNNAME_ProcCreate, ProcCreate);
}
/** Get Create.
@return Create */
public String getProcCreate() 
{
return (String)get_Value(COLUMNNAME_ProcCreate);
}

@XendraTrl(Identifier="3d2cf2cf-7eee-d113-7989-b79d4ccdcea8")
public static String es_PE_FIELD_Version_Create_Description="Crear precios basado en parámetros de esta versión";

@XendraTrl(Identifier="3d2cf2cf-7eee-d113-7989-b79d4ccdcea8")
public static String es_PE_FIELD_Version_Create_Help="Crear precios para esta versión de lista de precios en la secuencia del esquema de descuentos de lista de precios";

@XendraTrl(Identifier="3d2cf2cf-7eee-d113-7989-b79d4ccdcea8")
public static String es_PE_FIELD_Version_Create_Name="Crear Lista de Precios";

@XendraField(AD_Column_ID="ProcCreate",IsCentrallyMaintained=true,
AD_Tab_ID="c6d0d23b-37f8-936f-e44f-da8441ecaf83",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3d2cf2cf-7eee-d113-7989-b79d4ccdcea8")
public static final String FIELDNAME_Version_Create="3d2cf2cf-7eee-d113-7989-b79d4ccdcea8";

@XendraTrl(Identifier="995be372-95a5-4d81-e3b0-dc8da135dfc3")
public static String es_PE_COLUMN_ProcCreate_Name="Crear";

@XendraColumn(AD_Element_ID="235e51f4-5ded-751e-2bf3-b3bab3c1f42c",ColumnName="ProcCreate",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="f769c071-e2e7-e030-2168-457713fa0576",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="995be372-95a5-4d81-e3b0-dc8da135dfc3",Synchronized="2017-08-05 16:55:20.0")
/** Column name ProcCreate */
public static final String COLUMNNAME_ProcCreate = "ProcCreate";
/** Set Valid from.
@param ValidFrom Valid from including this date (first day) */
public void setValidFrom (Timestamp ValidFrom)
{
if (ValidFrom == null) throw new IllegalArgumentException ("ValidFrom is mandatory.");
set_Value (COLUMNNAME_ValidFrom, ValidFrom);
}
/** Get Valid from.
@return Valid from including this date (first day) */
public Timestamp getValidFrom() 
{
return (Timestamp)get_Value(COLUMNNAME_ValidFrom);
}

@XendraTrl(Identifier="67f87f4b-e1a0-fd02-b49f-fe4ca355b343")
public static String es_PE_FIELD_Version_ValidFrom_Description="Válido desde; incluyendo esta fecha (primer día)";

@XendraTrl(Identifier="67f87f4b-e1a0-fd02-b49f-fe4ca355b343")
public static String es_PE_FIELD_Version_ValidFrom_Help="La fecha válida desde indica el primer día de un rango de fechas";

@XendraTrl(Identifier="67f87f4b-e1a0-fd02-b49f-fe4ca355b343")
public static String es_PE_FIELD_Version_ValidFrom_Name="Válido Desde";

@XendraField(AD_Column_ID="ValidFrom",IsCentrallyMaintained=true,
AD_Tab_ID="c6d0d23b-37f8-936f-e44f-da8441ecaf83",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="67f87f4b-e1a0-fd02-b49f-fe4ca355b343")
public static final String FIELDNAME_Version_ValidFrom="67f87f4b-e1a0-fd02-b49f-fe4ca355b343";

@XendraTrl(Identifier="0dd8f1af-2b3c-2d9b-f0c6-18f33cc75fe0")
public static String es_PE_COLUMN_ValidFrom_Name="Válido Desde";

@XendraColumn(AD_Element_ID="86b1171a-a6c6-0da5-1aea-3f3106450d07",ColumnName="ValidFrom",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="@#Date@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0dd8f1af-2b3c-2d9b-f0c6-18f33cc75fe0",
Synchronized="2017-08-05 16:55:20.0")
/** Column name ValidFrom */
public static final String COLUMNNAME_ValidFrom = "ValidFrom";
}
