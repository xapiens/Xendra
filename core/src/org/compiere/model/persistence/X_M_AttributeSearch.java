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
/** Generated Model for M_AttributeSearch
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_AttributeSearch extends PO
{
/** Standard Constructor
@param ctx context
@param M_AttributeSearch_ID id
@param trxName transaction
*/
public X_M_AttributeSearch (Properties ctx, int M_AttributeSearch_ID, String trxName)
{
super (ctx, M_AttributeSearch_ID, trxName);
/** if (M_AttributeSearch_ID == 0)
{
setM_AttributeSearch_ID (0);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_AttributeSearch (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=564 */
public static int Table_ID=MTable.getTable_ID("M_AttributeSearch");

@XendraTrl(Identifier="df8672ba-9ec6-1349-c336-92d2a019a62a")
public static String es_PE_TAB_AttributeSearch_Description="Atributo Común de la Búsqueda";

@XendraTrl(Identifier="df8672ba-9ec6-1349-c336-92d2a019a62a")
public static String es_PE_TAB_AttributeSearch_Help="Las Atributos son específicos para un atributo de producto fijado (ej. tamaño para las camisetas: S, m, l). Si usted tiene atributos multiples y desea buscar bajo atributo común, usted define un atributo de la búsqueda. Ejemplo: tiene un atributo de la búsqueda del tamaño el combinar de los valores de todos los diversos tamaños (tamaño para la camisa XL, l, m, s, xs del vestido). La búsqueda del atributo permite que usted tenga todos los valores disponibles para la selección. Esto facilita el mantenimiento del atributo de producto individual.";

@XendraTrl(Identifier="df8672ba-9ec6-1349-c336-92d2a019a62a")
public static String es_PE_TAB_AttributeSearch_Name="Búsqueda de Atributo";

@XendraTab(Name="Attribute Search",Description="Common Search Attribute ",
Help="Attributes are specific to a Product Attribute Set (e.g. Size for T-Shirts: S,M,L). If you have multiple attributes and want to search under a common sttribute, you define a search sttribute. Example: have one Size search attribute combining the values of all different sizes (Size for Dress Shirt  XL,L,M,S,XS). The Attribute Search allows you to have all values available for selection.  This eases the maintenance of the individual product attribute.",
AD_Window_ID="a7326f33-ae69-d8f0-8a3a-cd7d698b46f8",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="df8672ba-9ec6-1349-c336-92d2a019a62a",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_AttributeSearch="df8672ba-9ec6-1349-c336-92d2a019a62a";

@XendraTrl(Identifier="09b925ce-88b5-dace-679b-7d28a8799c43")
public static String es_PE_TABLE_M_AttributeSearch_Name="Búsqueda de Atributos";

@XendraTable(Name="Attribute Search",AD_Package_ID="2809ac2d-7d43-20f8-05f0-a478f2e50204",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Common Search Attribute ",Help="",
TableName="M_AttributeSearch",AccessLevel="3",AD_Window_ID="a7326f33-ae69-d8f0-8a3a-cd7d698b46f8",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=130,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="09b925ce-88b5-dace-679b-7d28a8799c43",Synchronized="2020-03-03 21:38:15.0")
/** TableName=M_AttributeSearch */
public static final String Table_Name="M_AttributeSearch";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_AttributeSearch");

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
    Table_ID = MTable.getTable_ID("M_AttributeSearch");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_AttributeSearch[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="036c042b-1dac-7d88-f2d9-58f47f3c2851")
public static String es_PE_FIELD_AttributeSearch_Description_Name="Observación";

@XendraTrl(Identifier="036c042b-1dac-7d88-f2d9-58f47f3c2851")
public static String es_PE_FIELD_AttributeSearch_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="036c042b-1dac-7d88-f2d9-58f47f3c2851")
public static String es_PE_FIELD_AttributeSearch_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="df8672ba-9ec6-1349-c336-92d2a019a62a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="036c042b-1dac-7d88-f2d9-58f47f3c2851")
public static final String FIELDNAME_AttributeSearch_Description="036c042b-1dac-7d88-f2d9-58f47f3c2851";

@XendraTrl(Identifier="b357fa0e-176a-e08a-b865-b5245b1b7bd4")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b357fa0e-176a-e08a-b865-b5245b1b7bd4",
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
@XendraTrl(Identifier="030bea9e-9203-47da-b6df-4066851d215e")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="030bea9e-9203-47da-b6df-4066851d215e",
Synchronized="2019-08-30 22:22:57.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Attribute Search.
@param M_AttributeSearch_ID Common Search Attribute  */
public void setM_AttributeSearch_ID (int M_AttributeSearch_ID)
{
if (M_AttributeSearch_ID < 1) throw new IllegalArgumentException ("M_AttributeSearch_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_AttributeSearch_ID, Integer.valueOf(M_AttributeSearch_ID));
}
/** Get Attribute Search.
@return Common Search Attribute  */
public int getM_AttributeSearch_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_AttributeSearch_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7fdc18db-8de6-a5cb-fc92-0603353c4a4b")
public static String es_PE_FIELD_AttributeSearch_AttributeSearch_Name="Búsqueda de Atributos";

@XendraTrl(Identifier="7fdc18db-8de6-a5cb-fc92-0603353c4a4b")
public static String es_PE_FIELD_AttributeSearch_AttributeSearch_Description="Cualidad común de la busqueda";

@XendraTrl(Identifier="7fdc18db-8de6-a5cb-fc92-0603353c4a4b")
public static String es_PE_FIELD_AttributeSearch_AttributeSearch_Help="Los atributos son especificos para una configuración de producto. (ej. Tamaño para las camisetas: G,M,CH). Si usted tiene cualidades multiples y desea buscar bajo atributo común, usted define un atributo de la busqueda. Ejemplo: tenga una cualidad de la búsqueda del tamaño el combinar de los valores de todos los diversos tamaños (tamaño para la camisa XL, l, m, s, xs del vestido).  La búsqueda de la cualidad permite que usted tenga todos los valores disponibles para la selección. Esto facilita el mantenimiento de la cualidad de producto individual.";

@XendraField(AD_Column_ID="M_AttributeSearch_ID",IsCentrallyMaintained=true,
AD_Tab_ID="df8672ba-9ec6-1349-c336-92d2a019a62a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7fdc18db-8de6-a5cb-fc92-0603353c4a4b")
public static final String FIELDNAME_AttributeSearch_AttributeSearch="7fdc18db-8de6-a5cb-fc92-0603353c4a4b";
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

@XendraTrl(Identifier="d06f51e0-d9a5-252b-fded-1748b3bc79a0")
public static String es_PE_FIELD_AttributeSearch_Name_Name="Nombre";

@XendraTrl(Identifier="d06f51e0-d9a5-252b-fded-1748b3bc79a0")
public static String es_PE_FIELD_AttributeSearch_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="d06f51e0-d9a5-252b-fded-1748b3bc79a0")
public static String es_PE_FIELD_AttributeSearch_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="df8672ba-9ec6-1349-c336-92d2a019a62a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d06f51e0-d9a5-252b-fded-1748b3bc79a0")
public static final String FIELDNAME_AttributeSearch_Name="d06f51e0-d9a5-252b-fded-1748b3bc79a0";

@XendraTrl(Identifier="eab2e241-b6d4-2aac-d286-3b46b2fe632c")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="eab2e241-b6d4-2aac-d286-3b46b2fe632c",
Synchronized="2019-08-30 22:22:57.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
}
