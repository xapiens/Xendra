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
/** Generated Model for B_TopicCategory
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_B_TopicCategory extends PO
{
/** Standard Constructor
@param ctx context
@param B_TopicCategory_ID id
@param trxName transaction
*/
public X_B_TopicCategory (Properties ctx, int B_TopicCategory_ID, String trxName)
{
super (ctx, B_TopicCategory_ID, trxName);
/** if (B_TopicCategory_ID == 0)
{
setB_TopicCategory_ID (0);
setB_TopicType_ID (0);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_B_TopicCategory (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=691 */
public static int Table_ID=MTable.getTable_ID("B_TopicCategory");

@XendraTrl(Identifier="ba29387e-a868-6468-75f7-fb0d605f0ee7")
public static String es_PE_TAB_TypeCategory_Description="Categoria del tipo de asunto de la subasta";

@XendraTrl(Identifier="ba29387e-a868-6468-75f7-fb0d605f0ee7")
public static String es_PE_TAB_TypeCategory_Help="Para un tipo del asunto de la subasta, defina las diversas categorías usadas.";

@XendraTrl(Identifier="ba29387e-a868-6468-75f7-fb0d605f0ee7")
public static String es_PE_TAB_TypeCategory_Name="Tipo Categoría";
@XendraTab(Name="Type Category",
Description="Auction Topic Type Category",
Help="For an Auction Topic Type, define the different Categories used.",
AD_Window_ID="19b182c9-83df-8f00-42e9-b1efb901fcbd",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="ba29387e-a868-6468-75f7-fb0d605f0ee7",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_TypeCategory="ba29387e-a868-6468-75f7-fb0d605f0ee7";

@XendraTrl(Identifier="28277f87-3b40-302d-62ed-9d12661b2b03")
public static String es_PE_TABLE_B_TopicCategory_Name="Categoría del Asunto";

@XendraTable(Name="Topic Category",AD_Package_ID="a0ba5f31-73ac-fb58-5a46-04ff03d1a8c1",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Auction Topic Category",Help="",
TableName="B_TopicCategory",AccessLevel="2",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=135,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.bids",Identifier="28277f87-3b40-302d-62ed-9d12661b2b03",
Synchronized="2020-03-03 21:36:18.0")
/** TableName=B_TopicCategory */
public static final String Table_Name="B_TopicCategory";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"B_TopicCategory");

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
    Table_ID = MTable.getTable_ID("B_TopicCategory");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_B_TopicCategory[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Topic Category.
@param B_TopicCategory_ID Auction Topic Category */
public void setB_TopicCategory_ID (int B_TopicCategory_ID)
{
if (B_TopicCategory_ID < 1) throw new IllegalArgumentException ("B_TopicCategory_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_B_TopicCategory_ID, Integer.valueOf(B_TopicCategory_ID));
}
/** Get Topic Category.
@return Auction Topic Category */
public int getB_TopicCategory_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_B_TopicCategory_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8658039f-b996-a355-218f-e46ed3bfb5b9")
public static String es_PE_FIELD_TypeCategory_TopicCategory_Name="Categoría del Asunto";

@XendraTrl(Identifier="8658039f-b996-a355-218f-e46ed3bfb5b9")
public static String es_PE_FIELD_TypeCategory_TopicCategory_Description="Categoria del asunto de la subasta";

@XendraTrl(Identifier="8658039f-b996-a355-218f-e46ed3bfb5b9")
public static String es_PE_FIELD_TypeCategory_TopicCategory_Help="Para un tipo de asunto de la subasta, defina las diversas categorías usadas.";

@XendraField(AD_Column_ID="B_TopicCategory_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ba29387e-a868-6468-75f7-fb0d605f0ee7",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8658039f-b996-a355-218f-e46ed3bfb5b9")
public static final String FIELDNAME_TypeCategory_TopicCategory="8658039f-b996-a355-218f-e46ed3bfb5b9";
/** Column name B_TopicCategory_ID */
public static final String COLUMNNAME_B_TopicCategory_ID = "B_TopicCategory_ID";
/** Set Topic Type.
@param B_TopicType_ID Auction Topic Type */
public void setB_TopicType_ID (int B_TopicType_ID)
{
if (B_TopicType_ID < 1) throw new IllegalArgumentException ("B_TopicType_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_B_TopicType_ID, Integer.valueOf(B_TopicType_ID));
}
/** Get Topic Type.
@return Auction Topic Type */
public int getB_TopicType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_B_TopicType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a3728506-ddbf-72aa-99ff-e89c5543f043")
public static String es_PE_FIELD_TypeCategory_TopicType_Name="Tipo de Asunto";

@XendraTrl(Identifier="a3728506-ddbf-72aa-99ff-e89c5543f043")
public static String es_PE_FIELD_TypeCategory_TopicType_Description="Tipo de Asunto";

@XendraTrl(Identifier="a3728506-ddbf-72aa-99ff-e89c5543f043")
public static String es_PE_FIELD_TypeCategory_TopicType_Help="El tipo de asunto determina qué clase de subasta se utiliza para un área en particular";

@XendraField(AD_Column_ID="B_TopicType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ba29387e-a868-6468-75f7-fb0d605f0ee7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a3728506-ddbf-72aa-99ff-e89c5543f043")
public static final String FIELDNAME_TypeCategory_TopicType="a3728506-ddbf-72aa-99ff-e89c5543f043";

@XendraTrl(Identifier="a19babc2-48ac-3e53-66cc-e8cc12036148")
public static String es_PE_COLUMN_B_TopicType_ID_Name="Tipo de Asunto";

@XendraColumn(AD_Element_ID="0e53506f-06a5-867f-a233-a03fbf8f6ba1",ColumnName="B_TopicType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a19babc2-48ac-3e53-66cc-e8cc12036148",
Synchronized="2019-08-30 22:20:58.0")
/** Column name B_TopicType_ID */
public static final String COLUMNNAME_B_TopicType_ID = "B_TopicType_ID";
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

@XendraTrl(Identifier="8cae55bb-a010-cc04-6ea7-8214cbcd6d24")
public static String es_PE_FIELD_TypeCategory_Description_Name="Observación";

@XendraTrl(Identifier="8cae55bb-a010-cc04-6ea7-8214cbcd6d24")
public static String es_PE_FIELD_TypeCategory_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="8cae55bb-a010-cc04-6ea7-8214cbcd6d24")
public static String es_PE_FIELD_TypeCategory_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="ba29387e-a868-6468-75f7-fb0d605f0ee7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8cae55bb-a010-cc04-6ea7-8214cbcd6d24")
public static final String FIELDNAME_TypeCategory_Description="8cae55bb-a010-cc04-6ea7-8214cbcd6d24";

@XendraTrl(Identifier="878d1411-cb40-f992-bcdb-1e7bcbd3e87b")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="878d1411-cb40-f992-bcdb-1e7bcbd3e87b",
Synchronized="2019-08-30 22:20:58.0")
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
@XendraTrl(Identifier="53b09948-cb37-4584-afa7-539cd70f736e")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="53b09948-cb37-4584-afa7-539cd70f736e",
Synchronized="2019-08-30 22:20:58.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
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

@XendraTrl(Identifier="511ec34b-bf66-ba90-91c5-7cc3be236bd5")
public static String es_PE_FIELD_TypeCategory_Name_Name="Nombre";

@XendraTrl(Identifier="511ec34b-bf66-ba90-91c5-7cc3be236bd5")
public static String es_PE_FIELD_TypeCategory_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="511ec34b-bf66-ba90-91c5-7cc3be236bd5")
public static String es_PE_FIELD_TypeCategory_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="ba29387e-a868-6468-75f7-fb0d605f0ee7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="511ec34b-bf66-ba90-91c5-7cc3be236bd5")
public static final String FIELDNAME_TypeCategory_Name="511ec34b-bf66-ba90-91c5-7cc3be236bd5";

@XendraTrl(Identifier="8ea98a0b-a490-4df6-90c6-674e84e5ae7d")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8ea98a0b-a490-4df6-90c6-674e84e5ae7d",
Synchronized="2019-08-30 22:20:58.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
}
