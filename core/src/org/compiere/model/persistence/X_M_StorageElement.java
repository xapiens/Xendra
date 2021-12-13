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
/** Generated Model for M_StorageElement
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_StorageElement extends PO
{
/** Standard Constructor
@param ctx context
@param M_StorageElement_ID id
@param trxName transaction
*/
public X_M_StorageElement (Properties ctx, int M_StorageElement_ID, String trxName)
{
super (ctx, M_StorageElement_ID, trxName);
/** if (M_StorageElement_ID == 0)
{
setM_StorageElement_ID (0);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_StorageElement (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000351 */
public static int Table_ID=MTable.getTable_ID("M_StorageElement");

@XendraTrl(Identifier="713e2a03-a928-4059-9e1b-e4d61b38a480")
public static String es_PE_TAB_StorageElement_Description="Storage Element to perform calculations of stock";

@XendraTrl(Identifier="713e2a03-a928-4059-9e1b-e4d61b38a480")
public static String es_PE_TAB_StorageElement_Name="Storage Element";

@XendraTab(Name="Storage Element",Description="Storage Element to perform calculations of stock",
Help="",AD_Window_ID="e6af0e5f-5ab9-461d-a138-da56b0f60bd0",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="713e2a03-a928-4059-9e1b-e4d61b38a480",Synchronized="2016-08-11 16:12:31.0")
public static final String TABNAME_StorageElement="713e2a03-a928-4059-9e1b-e4d61b38a480";

@XendraTrl(Identifier="f8cda442-abaf-4b00-b8a2-7d67903e93fc")
public static String es_PE_TABLE_M_StorageElement_Name="Storage Element";

@XendraTable(Name="Storage Element",AD_Package_ID="2809ac2d-7d43-20f8-05f0-a478f2e50204",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="M_StorageElement",AccessLevel="6",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.material",Identifier="f8cda442-abaf-4b00-b8a2-7d67903e93fc",
Synchronized="2020-03-03 21:38:57.0")
/** TableName=M_StorageElement */
public static final String Table_Name="M_StorageElement";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_StorageElement");

protected BigDecimal accessLevel = BigDecimal.valueOf(6);
/** AccessLevel
@return 6 - System - Client 
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
    Table_ID = MTable.getTable_ID("M_StorageElement");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_StorageElement[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="baafe234-ac7b-49ef-a672-c9774e900092")
public static String es_PE_FIELD_StorageElement_Description_Name="Descripción";

@XendraTrl(Identifier="baafe234-ac7b-49ef-a672-c9774e900092")
public static String es_PE_FIELD_StorageElement_Description_Description="Descripción corta opcional del registro";

@XendraTrl(Identifier="baafe234-ac7b-49ef-a672-c9774e900092")
public static String es_PE_FIELD_StorageElement_Description_Help="Una descripción esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="713e2a03-a928-4059-9e1b-e4d61b38a480",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-08-11 16:12:31.0",
Identifier="baafe234-ac7b-49ef-a672-c9774e900092")
public static final String FIELDNAME_StorageElement_Description="baafe234-ac7b-49ef-a672-c9774e900092";

@XendraTrl(Identifier="cb31bc71-0ace-4000-bdc3-b31cfd8c663e")
public static String es_PE_COLUMN_Description_Name="Description";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cb31bc71-0ace-4000-bdc3-b31cfd8c663e",
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
@XendraTrl(Identifier="53e8a0be-79dd-4937-a837-8c955ab2d576")
public static String es_PE_FIELD_StorageElement_Identifier_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="713e2a03-a928-4059-9e1b-e4d61b38a480",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=36,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-08-11 16:12:31.0",
Identifier="53e8a0be-79dd-4937-a837-8c955ab2d576")
public static final String FIELDNAME_StorageElement_Identifier="53e8a0be-79dd-4937-a837-8c955ab2d576";

@XendraTrl(Identifier="bd28c9aa-3bd5-4864-91b6-e63f01c9958d")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bd28c9aa-3bd5-4864-91b6-e63f01c9958d",
Synchronized="2019-08-30 22:23:33.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Storage Element.
@param M_StorageElement_ID Storage Element */
public void setM_StorageElement_ID (int M_StorageElement_ID)
{
if (M_StorageElement_ID < 1) throw new IllegalArgumentException ("M_StorageElement_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_StorageElement_ID, Integer.valueOf(M_StorageElement_ID));
}
/** Get Storage Element.
@return Storage Element */
public int getM_StorageElement_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_StorageElement_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c9194cbc-8709-4f7b-8d52-6933d94d2dcc")
public static String es_PE_FIELD_StorageElement_StorageElement_Name="Storage Element";

@XendraField(AD_Column_ID="M_StorageElement_ID",IsCentrallyMaintained=true,
AD_Tab_ID="713e2a03-a928-4059-9e1b-e4d61b38a480",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-08-11 16:12:31.0",
Identifier="c9194cbc-8709-4f7b-8d52-6933d94d2dcc")
public static final String FIELDNAME_StorageElement_StorageElement="c9194cbc-8709-4f7b-8d52-6933d94d2dcc";
/** Column name M_StorageElement_ID */
public static final String COLUMNNAME_M_StorageElement_ID = "M_StorageElement_ID";
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

@XendraTrl(Identifier="702a95a1-1eca-43b1-bc1a-353db0cd63c1")
public static String es_PE_FIELD_StorageElement_Name_Name="Nombre";

@XendraTrl(Identifier="702a95a1-1eca-43b1-bc1a-353db0cd63c1")
public static String es_PE_FIELD_StorageElement_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="702a95a1-1eca-43b1-bc1a-353db0cd63c1")
public static String es_PE_FIELD_StorageElement_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="713e2a03-a928-4059-9e1b-e4d61b38a480",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-08-11 16:12:31.0",
Identifier="702a95a1-1eca-43b1-bc1a-353db0cd63c1")
public static final String FIELDNAME_StorageElement_Name="702a95a1-1eca-43b1-bc1a-353db0cd63c1";

@XendraTrl(Identifier="e9982795-d835-4210-966c-9acd16543c03")
public static String es_PE_COLUMN_Name_Name="Name";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e9982795-d835-4210-966c-9acd16543c03",
Synchronized="2019-08-30 22:23:33.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Properties.
@param Properties Properties */
public void setProperties (HashMap Properties)
{
set_Value (COLUMNNAME_Properties, Properties);
}
/** Get Properties.
@return Properties */
public HashMap getProperties() 
{
HashMap propsrc = (HashMap)get_Value(COLUMNNAME_Properties);
if (propsrc == null) return new HashMap();
 HashMap propdst = (HashMap) propsrc.clone();
return propdst;
}

@XendraTrl(Identifier="9c6b73be-7583-4083-907b-ba96cfb7cd52")
public static String es_PE_FIELD_StorageElement_Properties_Name="Properties";

@XendraField(AD_Column_ID="Properties",IsCentrallyMaintained=true,
AD_Tab_ID="713e2a03-a928-4059-9e1b-e4d61b38a480",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-08-11 16:12:31.0",
Identifier="9c6b73be-7583-4083-907b-ba96cfb7cd52")
public static final String FIELDNAME_StorageElement_Properties="9c6b73be-7583-4083-907b-ba96cfb7cd52";

@XendraTrl(Identifier="866e41b8-e6e0-43f5-9a8e-080bdec65762")
public static String es_PE_COLUMN_Properties_Name="Properties";

@XendraColumn(AD_Element_ID="acc3987b-292c-475a-86b5-5104970a96f3",ColumnName="Properties",
AD_Reference_ID=46,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="866e41b8-e6e0-43f5-9a8e-080bdec65762",
Synchronized="2019-08-30 22:23:33.0")
/** Column name Properties */
public static final String COLUMNNAME_Properties = "Properties";
}
