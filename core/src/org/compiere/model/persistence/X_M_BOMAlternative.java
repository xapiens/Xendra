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
/** Generated Model for M_BOMAlternative
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_BOMAlternative extends PO
{
/** Standard Constructor
@param ctx context
@param M_BOMAlternative_ID id
@param trxName transaction
*/
public X_M_BOMAlternative (Properties ctx, int M_BOMAlternative_ID, String trxName)
{
super (ctx, M_BOMAlternative_ID, trxName);
/** if (M_BOMAlternative_ID == 0)
{
setM_BOMAlternative_ID (0);
setM_Product_ID (0);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_BOMAlternative (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=795 */
public static int Table_ID=MTable.getTable_ID("M_BOMAlternative");

@XendraTrl(Identifier="baf15c6c-cc6f-464c-58bd-0e2532afdd0d")
public static String es_PE_TAB_AlternativeGroups_Description="Producto LDM Alternativo";

@XendraTrl(Identifier="baf15c6c-cc6f-464c-58bd-0e2532afdd0d")
public static String es_PE_TAB_AlternativeGroups_Name="Grupos Alternativos";

@XendraTrl(Identifier="baf15c6c-cc6f-464c-58bd-0e2532afdd0d")
public static String es_PE_TAB_AlternativeGroups_Help="Los grupos alternativos permiten que usted agrupe la cuenta de los componentes del material, que son exclusivos (es decir solamente uno es válido). Ejemplo: Diversos tamaños del motor.";

@XendraTab(Name="Alternative Groups",Description="Product BOM Alternative Group",
Help="Alternative groups allow you to group Bill of Material components, which are exclusive (i.e. only one is valid). Examples different engine sizes.",
AD_Window_ID="19c8d953-bce9-f34c-e702-5d8e285fb49d",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="baf15c6c-cc6f-464c-58bd-0e2532afdd0d",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_AlternativeGroups="baf15c6c-cc6f-464c-58bd-0e2532afdd0d";

@XendraTrl(Identifier="f946309a-1f06-3954-2b6d-ef624e8d04b9")
public static String es_PE_TABLE_M_BOMAlternative_Name="Alternativa de Grupo";

@XendraTable(Name="Alternative Group",Description="Product BOM Alternative Group",Help="",
TableName="M_BOMAlternative",AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.material",Identifier="f946309a-1f06-3954-2b6d-ef624e8d04b9",
Synchronized="2017-08-16 11:43:06.0")
/** TableName=M_BOMAlternative */
public static final String Table_Name="M_BOMAlternative";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_BOMAlternative");

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
    Table_ID = MTable.getTable_ID("M_BOMAlternative");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_BOMAlternative[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="9fd2a489-5b2f-57ed-d0f8-15b6fd8458a2")
public static String es_PE_FIELD_AlternativeGroups_Description_Description="Observación";

@XendraTrl(Identifier="9fd2a489-5b2f-57ed-d0f8-15b6fd8458a2")
public static String es_PE_FIELD_AlternativeGroups_Description_Help="Observación";

@XendraTrl(Identifier="9fd2a489-5b2f-57ed-d0f8-15b6fd8458a2")
public static String es_PE_FIELD_AlternativeGroups_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="baf15c6c-cc6f-464c-58bd-0e2532afdd0d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9fd2a489-5b2f-57ed-d0f8-15b6fd8458a2")
public static final String FIELDNAME_AlternativeGroups_Description="9fd2a489-5b2f-57ed-d0f8-15b6fd8458a2";

@XendraTrl(Identifier="174c811f-b5a7-9759-39f8-62519a960e1c")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="174c811f-b5a7-9759-39f8-62519a960e1c",
Synchronized="2017-08-05 16:55:00.0")
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
@XendraTrl(Identifier="3133095d-8ce8-4646-8eb5-1bbeee8e0cf6")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3133095d-8ce8-4646-8eb5-1bbeee8e0cf6",
Synchronized="2017-08-05 16:55:01.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Alternative Group.
@param M_BOMAlternative_ID Product BOM Alternative Group */
public void setM_BOMAlternative_ID (int M_BOMAlternative_ID)
{
if (M_BOMAlternative_ID < 1) throw new IllegalArgumentException ("M_BOMAlternative_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_BOMAlternative_ID, Integer.valueOf(M_BOMAlternative_ID));
}
/** Get Alternative Group.
@return Product BOM Alternative Group */
public int getM_BOMAlternative_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_BOMAlternative_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1779ca5b-4620-3507-635f-40ec6f99bcfc")
public static String es_PE_FIELD_AlternativeGroups_AlternativeGroup_Description="LDM Alternativa al gupo de producto.";

@XendraTrl(Identifier="1779ca5b-4620-3507-635f-40ec6f99bcfc")
public static String es_PE_FIELD_AlternativeGroups_AlternativeGroup_Help="Alternativa de grupo de productos cuando esta todo el grupo de componentes de la lista de materiales, el cual son exclusivas (i.e. solamente una es valida) Ejemplo: diferentes tamaños de maquina.  ";

@XendraTrl(Identifier="1779ca5b-4620-3507-635f-40ec6f99bcfc")
public static String es_PE_FIELD_AlternativeGroups_AlternativeGroup_Name="Alternativa de Grupo";

@XendraField(AD_Column_ID="M_BOMAlternative_ID",IsCentrallyMaintained=true,
AD_Tab_ID="baf15c6c-cc6f-464c-58bd-0e2532afdd0d",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1779ca5b-4620-3507-635f-40ec6f99bcfc")
public static final String FIELDNAME_AlternativeGroups_AlternativeGroup="1779ca5b-4620-3507-635f-40ec6f99bcfc";
/** Column name M_BOMAlternative_ID */
public static final String COLUMNNAME_M_BOMAlternative_ID = "M_BOMAlternative_ID";
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

@XendraTrl(Identifier="a9a76cff-c318-7851-dbba-e00ab7fb4b98")
public static String es_PE_FIELD_AlternativeGroups_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="a9a76cff-c318-7851-dbba-e00ab7fb4b98")
public static String es_PE_FIELD_AlternativeGroups_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="a9a76cff-c318-7851-dbba-e00ab7fb4b98")
public static String es_PE_FIELD_AlternativeGroups_Product_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="baf15c6c-cc6f-464c-58bd-0e2532afdd0d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a9a76cff-c318-7851-dbba-e00ab7fb4b98")
public static final String FIELDNAME_AlternativeGroups_Product="a9a76cff-c318-7851-dbba-e00ab7fb4b98";

@XendraTrl(Identifier="899f74c8-40e7-8a4e-94dc-ef9c1caca10c")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="4281f8eb-238e-6b28-eb66-8cc866e6312c",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="899f74c8-40e7-8a4e-94dc-ef9c1caca10c",Synchronized="2017-08-05 16:55:01.0")
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
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getName());
}

@XendraTrl(Identifier="4bdd4f0c-d2ef-5eec-f6bf-3a8863a92ad9")
public static String es_PE_FIELD_AlternativeGroups_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="4bdd4f0c-d2ef-5eec-f6bf-3a8863a92ad9")
public static String es_PE_FIELD_AlternativeGroups_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="4bdd4f0c-d2ef-5eec-f6bf-3a8863a92ad9")
public static String es_PE_FIELD_AlternativeGroups_Name_Name="Nombre";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="baf15c6c-cc6f-464c-58bd-0e2532afdd0d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4bdd4f0c-d2ef-5eec-f6bf-3a8863a92ad9")
public static final String FIELDNAME_AlternativeGroups_Name="4bdd4f0c-d2ef-5eec-f6bf-3a8863a92ad9";

@XendraTrl(Identifier="cf8109f1-df4e-1cdb-0f72-54bf7ed35a82")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cf8109f1-df4e-1cdb-0f72-54bf7ed35a82",
Synchronized="2017-08-05 16:55:01.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
}
