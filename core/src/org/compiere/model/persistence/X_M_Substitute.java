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
/** Generated Model for M_Substitute
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_Substitute extends PO
{
/** Standard Constructor
@param ctx context
@param M_Substitute_ID id
@param trxName transaction
*/
public X_M_Substitute (Properties ctx, int M_Substitute_ID, String trxName)
{
super (ctx, M_Substitute_ID, trxName);
/** if (M_Substitute_ID == 0)
{
setM_Product_ID (0);
setName (null);
setSubstitute_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_Substitute (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=213 */
public static int Table_ID=MTable.getTable_ID("M_Substitute");

@XendraTrl(Identifier="81bf75b9-25ba-e892-30a1-aad425d948ca")
public static String es_PE_TAB_Substitute_Description="Definir sustituto";

@XendraTrl(Identifier="81bf75b9-25ba-e892-30a1-aad425d948ca")
public static String es_PE_TAB_Substitute_Help="La pestaña de sustitutos define productos los cuales pueden ser usados como reemplazo para el producto seleccionado.";

@XendraTrl(Identifier="81bf75b9-25ba-e892-30a1-aad425d948ca")
public static String es_PE_TAB_Substitute_Name="Sustituto";
@XendraTab(Name="Substitute",
Description="Define Substitute",
Help="The Substitute Tab defines products which may be used as a replacement for the selected product.",
AD_Window_ID="ce2d4e2c-ba4e-29bf-9f71-66fecdc05f55",SeqNo=30,TabLevel=1,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=true,Parent_Column_ID="",
Identifier="81bf75b9-25ba-e892-30a1-aad425d948ca",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Substitute="81bf75b9-25ba-e892-30a1-aad425d948ca";

@XendraTrl(Identifier="8d9c435c-e388-8d9a-abf1-43dcde28bdcd")
public static String es_PE_TABLE_M_Substitute_Name="M_Substitute";

@XendraTable(Name="M_Substitute",AD_Package_ID="2809ac2d-7d43-20f8-05f0-a478f2e50204",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="M_Substitute",AccessLevel="3",AD_Window_ID="ce2d4e2c-ba4e-29bf-9f71-66fecdc05f55",
AD_Val_Rule_ID="",IsKey=0,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="8d9c435c-e388-8d9a-abf1-43dcde28bdcd",Synchronized="2020-03-03 21:38:58.0")
/** TableName=M_Substitute */
public static final String Table_Name="M_Substitute";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_Substitute");

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
    Table_ID = MTable.getTable_ID("M_Substitute");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_Substitute[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="70688523-7532-c4ff-5d26-b47220a313a5")
public static String es_PE_FIELD_Substitute_Description_Name="Observación";

@XendraTrl(Identifier="70688523-7532-c4ff-5d26-b47220a313a5")
public static String es_PE_FIELD_Substitute_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="70688523-7532-c4ff-5d26-b47220a313a5")
public static String es_PE_FIELD_Substitute_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="81bf75b9-25ba-e892-30a1-aad425d948ca",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="70688523-7532-c4ff-5d26-b47220a313a5")
public static final String FIELDNAME_Substitute_Description="70688523-7532-c4ff-5d26-b47220a313a5";

@XendraTrl(Identifier="266939d6-55c8-c021-5f2c-e7a713d58dcb")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="266939d6-55c8-c021-5f2c-e7a713d58dcb",
Synchronized="2019-08-30 22:23:33.0")
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
@XendraTrl(Identifier="dcade4e8-fd5c-42bc-a165-11a8acf4bb96")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dcade4e8-fd5c-42bc-a165-11a8acf4bb96",
Synchronized="2019-08-30 22:23:33.0")
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

@XendraTrl(Identifier="e764ba13-b347-c446-850e-a8530578bfe6")
public static String es_PE_FIELD_Substitute_Product_Name="Producto";

@XendraTrl(Identifier="e764ba13-b347-c446-850e-a8530578bfe6")
public static String es_PE_FIELD_Substitute_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="e764ba13-b347-c446-850e-a8530578bfe6")
public static String es_PE_FIELD_Substitute_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="81bf75b9-25ba-e892-30a1-aad425d948ca",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e764ba13-b347-c446-850e-a8530578bfe6")
public static final String FIELDNAME_Substitute_Product="e764ba13-b347-c446-850e-a8530578bfe6";

@XendraTrl(Identifier="4379b2c4-8f36-6e2c-70fe-3f57a663d60b")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="4281f8eb-238e-6b28-eb66-8cc866e6312c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="4379b2c4-8f36-6e2c-70fe-3f57a663d60b",Synchronized="2019-08-30 22:23:33.0")
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

@XendraTrl(Identifier="2c7de4c0-0a14-d8b3-3a10-834d7a069366")
public static String es_PE_FIELD_Substitute_Name_Name="Nombre";

@XendraTrl(Identifier="2c7de4c0-0a14-d8b3-3a10-834d7a069366")
public static String es_PE_FIELD_Substitute_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="2c7de4c0-0a14-d8b3-3a10-834d7a069366")
public static String es_PE_FIELD_Substitute_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="81bf75b9-25ba-e892-30a1-aad425d948ca",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2c7de4c0-0a14-d8b3-3a10-834d7a069366")
public static final String FIELDNAME_Substitute_Name="2c7de4c0-0a14-d8b3-3a10-834d7a069366";

@XendraTrl(Identifier="26091674-7642-664a-4205-e7f269b67eb0")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="26091674-7642-664a-4205-e7f269b67eb0",
Synchronized="2019-08-30 22:23:33.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Substitute.
@param Substitute_ID Entity which can be used in place of this entity */
public void setSubstitute_ID (int Substitute_ID)
{
if (Substitute_ID < 1) throw new IllegalArgumentException ("Substitute_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_Substitute_ID, Integer.valueOf(Substitute_ID));
}
/** Get Substitute.
@return Entity which can be used in place of this entity */
public int getSubstitute_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Substitute_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4cb7c96c-e374-7494-7e1d-68e41e6ab048")
public static String es_PE_FIELD_Substitute_Substitute_Name="Sustituto";

@XendraTrl(Identifier="4cb7c96c-e374-7494-7e1d-68e41e6ab048")
public static String es_PE_FIELD_Substitute_Substitute_Description="Producto que puede ser usado en lugar de otro producto";

@XendraTrl(Identifier="4cb7c96c-e374-7494-7e1d-68e41e6ab048")
public static String es_PE_FIELD_Substitute_Substitute_Help="El sustituto indica el producto a ser usado como sustituto de este producto";

@XendraField(AD_Column_ID="Substitute_ID",IsCentrallyMaintained=true,
AD_Tab_ID="81bf75b9-25ba-e892-30a1-aad425d948ca",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4cb7c96c-e374-7494-7e1d-68e41e6ab048")
public static final String FIELDNAME_Substitute_Substitute="4cb7c96c-e374-7494-7e1d-68e41e6ab048";

@XendraTrl(Identifier="9ab71ca5-0a10-f7b9-a11a-9d605213b12c")
public static String es_PE_COLUMN_Substitute_ID_Name="Sustituto";

@XendraColumn(AD_Element_ID="d6f3fe5e-b0b3-b883-b221-6ff26dfa1d39",ColumnName="Substitute_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="28b49c4d-0409-b2e0-b70e-d686f8d6503f",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="9ab71ca5-0a10-f7b9-a11a-9d605213b12c",Synchronized="2019-08-30 22:23:33.0")
/** Column name Substitute_ID */
public static final String COLUMNNAME_Substitute_ID = "Substitute_ID";
}
