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
/** Generated Model for C_RfQ_TopicSubscriberOnly
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_RfQ_TopicSubscriberOnly extends PO
{
/** Standard Constructor
@param ctx context
@param C_RfQ_TopicSubscriberOnly_ID id
@param trxName transaction
*/
public X_C_RfQ_TopicSubscriberOnly (Properties ctx, int C_RfQ_TopicSubscriberOnly_ID, String trxName)
{
super (ctx, C_RfQ_TopicSubscriberOnly_ID, trxName);
/** if (C_RfQ_TopicSubscriberOnly_ID == 0)
{
setC_RfQ_TopicSubscriber_ID (0);
setC_RfQ_TopicSubscriberOnly_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_RfQ_TopicSubscriberOnly (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=747 */
public static int Table_ID=MTable.getTable_ID("C_RfQ_TopicSubscriberOnly");

@XendraTrl(Identifier="11f25e6f-cd9a-0ccd-9434-dbe7b65cd4b6")
public static String es_PE_TAB_Restriction_Description="Incluya a suscriptor solamente para ciertos productos ó las categorías del producto";

@XendraTrl(Identifier="11f25e6f-cd9a-0ccd-9434-dbe7b65cd4b6")
public static String es_PE_TAB_Restriction_Name="Restricción";

@XendraTrl(Identifier="11f25e6f-cd9a-0ccd-9434-dbe7b65cd4b6")
public static String es_PE_TAB_Restriction_Help="Incorpore las categorías de los productos/del producto para las cuales el suscriptor debe ser incluido. Si no se incorpora ningún producto/categoría, solicitan el suscriptor contestar a las peticiones para todas las líneas en un RfQ. ";

@XendraTab(Name="Restriction",
Description="Include Subscriber Only for certain products or product categories",
Help="Enter the products / product categories for which the subscriber should be included.  If no product / category is entered, the subscriber is requested to answer requests for all lines in a RfQ",
AD_Window_ID="84f4c768-9e31-b7c2-85a4-97fc1fd84d22",SeqNo=30,TabLevel=2,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="11f25e6f-cd9a-0ccd-9434-dbe7b65cd4b6",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Restriction="11f25e6f-cd9a-0ccd-9434-dbe7b65cd4b6";

@XendraTrl(Identifier="da270a77-1921-9667-1620-125499123949")
public static String es_PE_TABLE_C_RfQ_TopicSubscriberOnly_Name="SPC Restricciones en el asunto al subscriptor";


@XendraTable(Name="RfQ Topic Subscriber Restriction",
Description="Include Subscriber only for certain products or product categories",Help="",
TableName="C_RfQ_TopicSubscriberOnly",AccessLevel="2",
AD_Window_ID="84f4c768-9e31-b7c2-85a4-97fc1fd84d22",AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.commercial",Identifier="da270a77-1921-9667-1620-125499123949",
Synchronized="2017-08-16 11:42:27.0")
/** TableName=C_RfQ_TopicSubscriberOnly */
public static final String Table_Name="C_RfQ_TopicSubscriberOnly";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_RfQ_TopicSubscriberOnly");

protected BigDecimal accessLevel = BigDecimal.valueOf(2);
/** AccessLevel
@return 2 - Client 
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
    Table_ID = MTable.getTable_ID("C_RfQ_TopicSubscriberOnly");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_RfQ_TopicSubscriberOnly[").append(get_ID()).append("]");
return sb.toString();
}
/** Set RfQ Subscriber.
@param C_RfQ_TopicSubscriber_ID Request for Quotation Topic Subscriber */
public void setC_RfQ_TopicSubscriber_ID (int C_RfQ_TopicSubscriber_ID)
{
if (C_RfQ_TopicSubscriber_ID < 1) throw new IllegalArgumentException ("C_RfQ_TopicSubscriber_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_RfQ_TopicSubscriber_ID, Integer.valueOf(C_RfQ_TopicSubscriber_ID));
}
/** Get RfQ Subscriber.
@return Request for Quotation Topic Subscriber */
public int getC_RfQ_TopicSubscriber_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_RfQ_TopicSubscriber_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="23b5ec7e-fbec-6d5c-40ef-d934942b94d6")
public static String es_PE_FIELD_Restriction_RfQSubscriber_Description="Solicitud para la cita de tipo de subscripción.";

@XendraTrl(Identifier="23b5ec7e-fbec-6d5c-40ef-d934942b94d6")
public static String es_PE_FIELD_Restriction_RfQSubscriber_Help="Subscriptor para invitar responder a RfQs.";

@XendraTrl(Identifier="23b5ec7e-fbec-6d5c-40ef-d934942b94d6")
public static String es_PE_FIELD_Restriction_RfQSubscriber_Name="Suscripción de Solicitudes de Cotización";

@XendraField(AD_Column_ID="C_RfQ_TopicSubscriber_ID",IsCentrallyMaintained=true,
AD_Tab_ID="11f25e6f-cd9a-0ccd-9434-dbe7b65cd4b6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="23b5ec7e-fbec-6d5c-40ef-d934942b94d6")
public static final String FIELDNAME_Restriction_RfQSubscriber="23b5ec7e-fbec-6d5c-40ef-d934942b94d6";

@XendraTrl(Identifier="1565dd58-a601-e5ef-c0c1-76137efeb6fe")
public static String es_PE_COLUMN_C_RfQ_TopicSubscriber_ID_Name="Subscriptor SPC (RfQ)";

@XendraColumn(AD_Element_ID="183c389f-b451-1c14-43e1-96b4aef6f5a4",
ColumnName="C_RfQ_TopicSubscriber_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,
IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="1565dd58-a601-e5ef-c0c1-76137efeb6fe",Synchronized="2017-08-05 16:54:25.0")
/** Column name C_RfQ_TopicSubscriber_ID */
public static final String COLUMNNAME_C_RfQ_TopicSubscriber_ID = "C_RfQ_TopicSubscriber_ID";
/** Set RfQ Topic Subscriber Restriction.
@param C_RfQ_TopicSubscriberOnly_ID Include Subscriber only for certain products or product categories */
public void setC_RfQ_TopicSubscriberOnly_ID (int C_RfQ_TopicSubscriberOnly_ID)
{
if (C_RfQ_TopicSubscriberOnly_ID < 1) throw new IllegalArgumentException ("C_RfQ_TopicSubscriberOnly_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_RfQ_TopicSubscriberOnly_ID, Integer.valueOf(C_RfQ_TopicSubscriberOnly_ID));
}
/** Get RfQ Topic Subscriber Restriction.
@return Include Subscriber only for certain products or product categories */
public int getC_RfQ_TopicSubscriberOnly_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_RfQ_TopicSubscriberOnly_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="90ebeb86-4eff-c2e1-7b49-6ba968506d02")
public static String es_PE_FIELD_Restriction_RfQTopicSubscriberRestriction_Description="Incluya a suscriptor solamente para ciertos productos ó las categorías del producto.";

@XendraTrl(Identifier="90ebeb86-4eff-c2e1-7b49-6ba968506d02")
public static String es_PE_FIELD_Restriction_RfQTopicSubscriberRestriction_Help="Productos y/o categorías del producto para los cuales el suscriptor debe ser incluido. Si no se incorpora ningún producto/categoría, solicitan el suscriptor contestar a las peticiones para todas las líneas en un RfQ";

@XendraTrl(Identifier="90ebeb86-4eff-c2e1-7b49-6ba968506d02")
public static String es_PE_FIELD_Restriction_RfQTopicSubscriberRestriction_Name="SPC Restricciones en el asunto al subscriptor";

@XendraField(AD_Column_ID="C_RfQ_TopicSubscriberOnly_ID",IsCentrallyMaintained=true,
AD_Tab_ID="11f25e6f-cd9a-0ccd-9434-dbe7b65cd4b6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="90ebeb86-4eff-c2e1-7b49-6ba968506d02")
public static final String FIELDNAME_Restriction_RfQTopicSubscriberRestriction="90ebeb86-4eff-c2e1-7b49-6ba968506d02";
/** Column name C_RfQ_TopicSubscriberOnly_ID */
public static final String COLUMNNAME_C_RfQ_TopicSubscriberOnly_ID = "C_RfQ_TopicSubscriberOnly_ID";
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

@XendraTrl(Identifier="c5ee6bfc-c0d7-2b90-2037-8612513ea769")
public static String es_PE_FIELD_Restriction_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="c5ee6bfc-c0d7-2b90-2037-8612513ea769")
public static String es_PE_FIELD_Restriction_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="c5ee6bfc-c0d7-2b90-2037-8612513ea769")
public static String es_PE_FIELD_Restriction_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="11f25e6f-cd9a-0ccd-9434-dbe7b65cd4b6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c5ee6bfc-c0d7-2b90-2037-8612513ea769")
public static final String FIELDNAME_Restriction_Description="c5ee6bfc-c0d7-2b90-2037-8612513ea769";

@XendraTrl(Identifier="126b305f-e787-eba8-3997-c39c2eb681be")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="126b305f-e787-eba8-3997-c39c2eb681be",
Synchronized="2017-08-05 16:54:25.0")
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
@XendraTrl(Identifier="83205353-de76-4e5c-9b73-c5611afe95f6")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="83205353-de76-4e5c-9b73-c5611afe95f6",
Synchronized="2017-08-05 16:54:25.0")
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
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getM_Product_Category_ID()));
}

@XendraTrl(Identifier="bc9765bd-b006-5b0b-8354-395a476d849c")
public static String es_PE_FIELD_Restriction_ProductCategory_Description="Categoría de la que este producto es parte";

@XendraTrl(Identifier="bc9765bd-b006-5b0b-8354-395a476d849c")
public static String es_PE_FIELD_Restriction_ProductCategory_Help="Identifica la categoría a la que pertenece este producto. Las categorías del producto son usadas para el cálculo de precios";

@XendraTrl(Identifier="bc9765bd-b006-5b0b-8354-395a476d849c")
public static String es_PE_FIELD_Restriction_ProductCategory_Name="Categoría del Producto";

@XendraField(AD_Column_ID="M_Product_Category_ID",IsCentrallyMaintained=true,
AD_Tab_ID="11f25e6f-cd9a-0ccd-9434-dbe7b65cd4b6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=2,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bc9765bd-b006-5b0b-8354-395a476d849c")
public static final String FIELDNAME_Restriction_ProductCategory="bc9765bd-b006-5b0b-8354-395a476d849c";

@XendraTrl(Identifier="4f452f5e-cc83-b9df-50e3-13163560ee37")
public static String es_PE_COLUMN_M_Product_Category_ID_Name="Categoría del Producto";

@XendraColumn(AD_Element_ID="80d3e0bb-473b-67d4-42d5-1d776006a69c",
ColumnName="M_Product_Category_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="-1",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="4f452f5e-cc83-b9df-50e3-13163560ee37",Synchronized="2017-08-05 16:54:25.0")
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

@XendraTrl(Identifier="7ded1c5f-e726-dad9-a53a-f854fac4aa66")
public static String es_PE_FIELD_Restriction_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="7ded1c5f-e726-dad9-a53a-f854fac4aa66")
public static String es_PE_FIELD_Restriction_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="7ded1c5f-e726-dad9-a53a-f854fac4aa66")
public static String es_PE_FIELD_Restriction_Product_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="11f25e6f-cd9a-0ccd-9434-dbe7b65cd4b6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=50,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7ded1c5f-e726-dad9-a53a-f854fac4aa66")
public static final String FIELDNAME_Restriction_Product="7ded1c5f-e726-dad9-a53a-f854fac4aa66";

@XendraTrl(Identifier="021667a7-2afd-8c3c-488e-bd6b0c8aa7a8")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="4281f8eb-238e-6b28-eb66-8cc866e6312c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="021667a7-2afd-8c3c-488e-bd6b0c8aa7a8",Synchronized="2017-08-05 16:54:25.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
}
