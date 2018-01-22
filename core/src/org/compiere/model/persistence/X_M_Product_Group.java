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
/** Generated Model for M_Product_Group
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_Product_Group extends PO
{
/** Standard Constructor
@param ctx context
@param M_Product_Group_ID id
@param trxName transaction
*/
public X_M_Product_Group (Properties ctx, int M_Product_Group_ID, String trxName)
{
super (ctx, M_Product_Group_ID, trxName);
/** if (M_Product_Group_ID == 0)
{
setM_Product_Group_ID (0);
setName (null);
setValue (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_Product_Group (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000072 */
public static int Table_ID=MTable.getTable_ID("M_Product_Group");

@XendraTrl(Identifier="dc6a70cd-5dc4-19bd-6124-6ec491e33d15")
public static String es_PE_TAB_ProductGroup_Description="Definir el Tipo de Producto";

@XendraTrl(Identifier="dc6a70cd-5dc4-19bd-6124-6ec491e33d15")
public static String es_PE_TAB_ProductGroup_Name="Grupo de Producto";

@XendraTrl(Identifier="dc6a70cd-5dc4-19bd-6124-6ec491e33d15")
public static String es_PE_TAB_ProductGroup_Help="Los grupos de productos le permite definir diferentes grupos de productos. Estos grupos pueden ser antialérgico, antibacteriano, etc";

@XendraTab(Name="Product Group",Description="Define Product Group",
Help="The Product Groups allows you to define different groups of products. These groups can be antiallergic, antibacterial, etc.",
AD_Window_ID="183de380-0338-a7c4-5943-96a262c79258",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="dc6a70cd-5dc4-19bd-6124-6ec491e33d15",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ProductGroup="dc6a70cd-5dc4-19bd-6124-6ec491e33d15";

@XendraTrl(Identifier="90c7200c-c3f3-990c-a246-590c53e248a6")
public static String es_PE_TAB_Linea_Name="linea";
@XendraTab(Name="linea",Description="",Help="",
AD_Window_ID="8cacddb2-ef8f-88d0-ad1e-58c1bb0c8cba",SeqNo=20,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="90c7200c-c3f3-990c-a246-590c53e248a6",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Linea="90c7200c-c3f3-990c-a246-590c53e248a6";

@XendraTrl(Identifier="1ecff880-685a-2147-1b14-afff6d755a53")
public static String es_PE_TABLE_M_Product_Group_Name="Grupo de Producto";

@XendraTable(Name="Product Group",Description="Group of a Product",
Help="The Product Groups allows you to define different groups of products.",
TableName="M_Product_Group",AccessLevel="3",AD_Window_ID="183de380-0338-a7c4-5943-96a262c79258",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=75,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="1ecff880-685a-2147-1b14-afff6d755a53",Synchronized="2017-08-16 11:43:29.0")
/** TableName=M_Product_Group */
public static final String Table_Name="M_Product_Group";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_Product_Group");

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
    Table_ID = MTable.getTable_ID("M_Product_Group");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_Product_Group[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="89550464-d7b4-f91a-596a-e719d74661b7")
public static String es_PE_FIELD_ProductGroup_Description_Description="Descripción corta opcional del registro";

@XendraTrl(Identifier="89550464-d7b4-f91a-596a-e719d74661b7")
public static String es_PE_FIELD_ProductGroup_Description_Help="Una descripción esta limitada a 255 caracteres";

@XendraTrl(Identifier="89550464-d7b4-f91a-596a-e719d74661b7")
public static String es_PE_FIELD_ProductGroup_Description_Name="Descripción";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="dc6a70cd-5dc4-19bd-6124-6ec491e33d15",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="89550464-d7b4-f91a-596a-e719d74661b7")
public static final String FIELDNAME_ProductGroup_Description="89550464-d7b4-f91a-596a-e719d74661b7";

@XendraTrl(Identifier="353d5a98-2f75-5cd8-40b3-2d27dd44dda0")
public static String es_PE_FIELD_Linea_Description_Description="Descripción corta opcional del registro";

@XendraTrl(Identifier="353d5a98-2f75-5cd8-40b3-2d27dd44dda0")
public static String es_PE_FIELD_Linea_Description_Help="Una descripción esta limitada a 255 caracteres";

@XendraTrl(Identifier="353d5a98-2f75-5cd8-40b3-2d27dd44dda0")
public static String es_PE_FIELD_Linea_Description_Name="Descripción";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="90c7200c-c3f3-990c-a246-590c53e248a6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="353d5a98-2f75-5cd8-40b3-2d27dd44dda0")
public static final String FIELDNAME_Linea_Description="353d5a98-2f75-5cd8-40b3-2d27dd44dda0";

@XendraTrl(Identifier="ee6afa24-0598-4f6d-056d-68f53230c778")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ee6afa24-0598-4f6d-056d-68f53230c778",
Synchronized="2017-08-05 16:55:26.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Comment/Help.
@param Help Comment or Hint */
public void setHelp (String Help)
{
set_Value (COLUMNNAME_Help, Help);
}
/** Get Comment/Help.
@return Comment or Hint */
public String getHelp() 
{
String value = (String)get_Value(COLUMNNAME_Help);
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

@XendraTrl(Identifier="877e0945-4e64-02a2-8d9a-1cea7a4be420")
public static String es_PE_FIELD_ProductGroup_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="877e0945-4e64-02a2-8d9a-1cea7a4be420")
public static String es_PE_FIELD_ProductGroup_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="877e0945-4e64-02a2-8d9a-1cea7a4be420")
public static String es_PE_FIELD_ProductGroup_CommentHelp_Name="Ayuda";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="dc6a70cd-5dc4-19bd-6124-6ec491e33d15",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2000,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="877e0945-4e64-02a2-8d9a-1cea7a4be420")
public static final String FIELDNAME_ProductGroup_CommentHelp="877e0945-4e64-02a2-8d9a-1cea7a4be420";

@XendraTrl(Identifier="cb52cccd-66e4-827a-2b97-e24a09a02fd7")
public static String es_PE_FIELD_Linea_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="cb52cccd-66e4-827a-2b97-e24a09a02fd7")
public static String es_PE_FIELD_Linea_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="cb52cccd-66e4-827a-2b97-e24a09a02fd7")
public static String es_PE_FIELD_Linea_CommentHelp_Name="Ayuda";
@XendraField(AD_Column_ID="Help",
IsCentrallyMaintained=true,AD_Tab_ID="90c7200c-c3f3-990c-a246-590c53e248a6",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=2000,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="cb52cccd-66e4-827a-2b97-e24a09a02fd7")
public static final String FIELDNAME_Linea_CommentHelp="cb52cccd-66e4-827a-2b97-e24a09a02fd7";

@XendraTrl(Identifier="609b22ed-b2d7-6111-6ec6-7569618e63af")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="609b22ed-b2d7-6111-6ec6-7569618e63af",
Synchronized="2017-08-05 16:55:26.0")
/** Column name Help */
public static final String COLUMNNAME_Help = "Help";
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
@XendraTrl(Identifier="48004106-9f5f-4f48-9201-96e437f87757")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="48004106-9f5f-4f48-9201-96e437f87757",
Synchronized="2017-08-05 16:55:26.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Laboratorio.
@param Laboratorio_ID Laboratorio */
public void setLaboratorio_ID (int Laboratorio_ID)
{
if (Laboratorio_ID <= 0) set_ValueNoCheck (COLUMNNAME_Laboratorio_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_Laboratorio_ID, Integer.valueOf(Laboratorio_ID));
}
/** Get Laboratorio.
@return Laboratorio */
public int getLaboratorio_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Laboratorio_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="80473e3f-c498-f9fc-6fb3-4102718e2793")
public static String es_PE_FIELD_Linea_Laboratorio_Name="Laboratorio";

@XendraField(AD_Column_ID="Laboratorio_ID",IsCentrallyMaintained=true,
AD_Tab_ID="90c7200c-c3f3-990c-a246-590c53e248a6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="80473e3f-c498-f9fc-6fb3-4102718e2793")
public static final String FIELDNAME_Linea_Laboratorio="80473e3f-c498-f9fc-6fb3-4102718e2793";

@XendraTrl(Identifier="5486291e-7ebb-7d72-2ae1-b373b141f11c")
public static String es_PE_COLUMN_Laboratorio_ID_Name="Laboratorio";

@XendraColumn(AD_Element_ID="65491451-f2ef-609a-e8f3-11a7fbcf464d",ColumnName="Laboratorio_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5486291e-7ebb-7d72-2ae1-b373b141f11c",
Synchronized="2017-08-05 16:55:26.0")
/** Column name Laboratorio_ID */
public static final String COLUMNNAME_Laboratorio_ID = "Laboratorio_ID";
/** Set Product Group.
@param M_Product_Group_ID Product Group */
public void setM_Product_Group_ID (int M_Product_Group_ID)
{
if (M_Product_Group_ID < 1) throw new IllegalArgumentException ("M_Product_Group_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_Product_Group_ID, Integer.valueOf(M_Product_Group_ID));
}
/** Get Product Group.
@return Product Group */
public int getM_Product_Group_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_Group_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ff82e83d-3b7d-1329-3d69-95a5c403b81f")
public static String es_PE_FIELD_ProductGroup_ProductGroup_Name="Product Group";

@XendraField(AD_Column_ID="M_Product_Group_ID",IsCentrallyMaintained=true,
AD_Tab_ID="dc6a70cd-5dc4-19bd-6124-6ec491e33d15",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ff82e83d-3b7d-1329-3d69-95a5c403b81f")
public static final String FIELDNAME_ProductGroup_ProductGroup="ff82e83d-3b7d-1329-3d69-95a5c403b81f";

@XendraTrl(Identifier="1e1dbc28-dc17-8efe-5e56-e219fb4dfc31")
public static String es_PE_FIELD_Linea_ProductGroup_Name="Grupo";

@XendraField(AD_Column_ID="M_Product_Group_ID",IsCentrallyMaintained=true,
AD_Tab_ID="90c7200c-c3f3-990c-a246-590c53e248a6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1e1dbc28-dc17-8efe-5e56-e219fb4dfc31")
public static final String FIELDNAME_Linea_ProductGroup="1e1dbc28-dc17-8efe-5e56-e219fb4dfc31";
/** Column name M_Product_Group_ID */
public static final String COLUMNNAME_M_Product_Group_ID = "M_Product_Group_ID";
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

@XendraTrl(Identifier="fdfdf380-f5de-7e48-ead1-bfc769367290")
public static String es_PE_FIELD_ProductGroup_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="fdfdf380-f5de-7e48-ead1-bfc769367290")
public static String es_PE_FIELD_ProductGroup_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="fdfdf380-f5de-7e48-ead1-bfc769367290")
public static String es_PE_FIELD_ProductGroup_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="dc6a70cd-5dc4-19bd-6124-6ec491e33d15",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="fdfdf380-f5de-7e48-ead1-bfc769367290")
public static final String FIELDNAME_ProductGroup_Name="fdfdf380-f5de-7e48-ead1-bfc769367290";

@XendraTrl(Identifier="22abab89-bbf1-5233-1afd-0f7fdc583c18")
public static String es_PE_FIELD_Linea_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="22abab89-bbf1-5233-1afd-0f7fdc583c18")
public static String es_PE_FIELD_Linea_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="22abab89-bbf1-5233-1afd-0f7fdc583c18")
public static String es_PE_FIELD_Linea_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="90c7200c-c3f3-990c-a246-590c53e248a6",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="22abab89-bbf1-5233-1afd-0f7fdc583c18")
public static final String FIELDNAME_Linea_Name="22abab89-bbf1-5233-1afd-0f7fdc583c18";

@XendraTrl(Identifier="37dcad5c-e13a-7b69-3924-45bdc4dec9e1")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="37dcad5c-e13a-7b69-3924-45bdc4dec9e1",
Synchronized="2017-08-05 16:55:26.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
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
@XendraTrl(Identifier="e0e5f247-a7c2-9062-3209-0ff7e36c8817")
public static String es_PE_FIELD_ProductGroup_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="e0e5f247-a7c2-9062-3209-0ff7e36c8817")
public static String es_PE_FIELD_ProductGroup_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraTrl(Identifier="e0e5f247-a7c2-9062-3209-0ff7e36c8817")
public static String es_PE_FIELD_ProductGroup_SearchKey_Name="Clave de Búsqueda";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="dc6a70cd-5dc4-19bd-6124-6ec491e33d15",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e0e5f247-a7c2-9062-3209-0ff7e36c8817")
public static final String FIELDNAME_ProductGroup_SearchKey="e0e5f247-a7c2-9062-3209-0ff7e36c8817";

@XendraTrl(Identifier="14e1348f-e15e-1e54-b186-94337a9fc5c8")
public static String es_PE_FIELD_Linea_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="14e1348f-e15e-1e54-b186-94337a9fc5c8")
public static String es_PE_FIELD_Linea_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraTrl(Identifier="14e1348f-e15e-1e54-b186-94337a9fc5c8")
public static String es_PE_FIELD_Linea_SearchKey_Name="Clave de Búsqueda";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="90c7200c-c3f3-990c-a246-590c53e248a6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="14e1348f-e15e-1e54-b186-94337a9fc5c8")
public static final String FIELDNAME_Linea_SearchKey="14e1348f-e15e-1e54-b186-94337a9fc5c8";

@XendraTrl(Identifier="12104a0f-43ed-7e11-8e66-b0eb0f6b9131")
public static String es_PE_COLUMN_Value_Name="Clave de Búsqueda";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="12104a0f-43ed-7e11-8e66-b0eb0f6b9131",
Synchronized="2017-08-05 16:55:26.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
}
