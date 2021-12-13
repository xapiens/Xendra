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
/** Generated Model for AD_OrgType
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_OrgType extends PO
{
/** Standard Constructor
@param ctx context
@param AD_OrgType_ID id
@param trxName transaction
*/
public X_AD_OrgType (Properties ctx, int AD_OrgType_ID, String trxName)
{
super (ctx, AD_OrgType_ID, trxName);
/** if (AD_OrgType_ID == 0)
{
setAD_OrgType_ID (0);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_OrgType (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=689 */
public static int Table_ID=MTable.getTable_ID("AD_OrgType");

@XendraTrl(Identifier="54bd22b7-3b9f-dbae-1465-a4f296e8cbfe")
public static String es_PE_TAB_OrgType_Description="El tipo de la organización permite que usted categorice sus organizaciones.";

@XendraTrl(Identifier="54bd22b7-3b9f-dbae-1465-a4f296e8cbfe")
public static String es_PE_TAB_OrgType_Help="El tipo de la organización permite que usted categorice sus organizaciones para reportar propósitos";

@XendraTrl(Identifier="54bd22b7-3b9f-dbae-1465-a4f296e8cbfe")
public static String es_PE_TAB_OrgType_Name="Tipo Org";
@XendraTab(Name="Org Type",
Description="Organization Type allows you to categorize your organizations",
Help="Organization Type allows you to categorize your organizations for reporting purposes",
AD_Window_ID="88f7f282-1d65-d169-c788-ab870985b9ab",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="54bd22b7-3b9f-dbae-1465-a4f296e8cbfe",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_OrgType="54bd22b7-3b9f-dbae-1465-a4f296e8cbfe";

@XendraTrl(Identifier="38e2c00e-1bc2-82f9-3c99-3053549558ea")
public static String es_PE_TABLE_AD_OrgType_Name="Tipo de Organización";

@XendraTable(Name="Organization Type",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",
Description="Organization Type allows you to categorize your organizations",Help="",
TableName="AD_OrgType",AccessLevel="6",AD_Window_ID="88f7f282-1d65-d169-c788-ab870985b9ab",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="38e2c00e-1bc2-82f9-3c99-3053549558ea",Synchronized="2020-03-03 21:35:11.0")
/** TableName=AD_OrgType */
public static final String Table_Name="AD_OrgType";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_OrgType");

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
    Table_ID = MTable.getTable_ID("AD_OrgType");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_OrgType[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Organization Type.
@param AD_OrgType_ID Organization Type allows you to categorize your organizations */
public void setAD_OrgType_ID (int AD_OrgType_ID)
{
if (AD_OrgType_ID < 1) throw new IllegalArgumentException ("AD_OrgType_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_OrgType_ID, Integer.valueOf(AD_OrgType_ID));
}
/** Get Organization Type.
@return Organization Type allows you to categorize your organizations */
public int getAD_OrgType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_OrgType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="56f291aa-6cbd-5c3c-3218-13ad3fb17d4b")
public static String es_PE_FIELD_OrgType_OrganizationType_Name="Tipo de Organización";

@XendraTrl(Identifier="56f291aa-6cbd-5c3c-3218-13ad3fb17d4b")
public static String es_PE_FIELD_OrgType_OrganizationType_Description="El tipo de la organización permite que usted categorice sus organizaciones.";

@XendraTrl(Identifier="56f291aa-6cbd-5c3c-3218-13ad3fb17d4b")
public static String es_PE_FIELD_OrgType_OrganizationType_Help="El tipo de la organización permite que usted categorice sus organizaciones para definir propósitos.";

@XendraField(AD_Column_ID="AD_OrgType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="54bd22b7-3b9f-dbae-1465-a4f296e8cbfe",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="56f291aa-6cbd-5c3c-3218-13ad3fb17d4b")
public static final String FIELDNAME_OrgType_OrganizationType="56f291aa-6cbd-5c3c-3218-13ad3fb17d4b";
/** Column name AD_OrgType_ID */
public static final String COLUMNNAME_AD_OrgType_ID = "AD_OrgType_ID";
/** Set Print Color.
@param AD_PrintColor_ID Color used for printing and display */
public void setAD_PrintColor_ID (int AD_PrintColor_ID)
{
if (AD_PrintColor_ID <= 0) set_Value (COLUMNNAME_AD_PrintColor_ID, null);
 else 
set_Value (COLUMNNAME_AD_PrintColor_ID, Integer.valueOf(AD_PrintColor_ID));
}
/** Get Print Color.
@return Color used for printing and display */
public int getAD_PrintColor_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_PrintColor_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="14122842-86b1-7b24-be53-80f964045800")
public static String es_PE_FIELD_OrgType_PrintColor_Name="Impresión a Color";

@XendraTrl(Identifier="14122842-86b1-7b24-be53-80f964045800")
public static String es_PE_FIELD_OrgType_PrintColor_Description="Color usado para imprimir";

@XendraTrl(Identifier="14122842-86b1-7b24-be53-80f964045800")
public static String es_PE_FIELD_OrgType_PrintColor_Help="Color usado para imprimir";

@XendraField(AD_Column_ID="AD_PrintColor_ID",IsCentrallyMaintained=true,
AD_Tab_ID="54bd22b7-3b9f-dbae-1465-a4f296e8cbfe",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="14122842-86b1-7b24-be53-80f964045800")
public static final String FIELDNAME_OrgType_PrintColor="14122842-86b1-7b24-be53-80f964045800";

@XendraTrl(Identifier="d000b41a-4b4c-5050-2803-c6e04407c6ed")
public static String es_PE_COLUMN_AD_PrintColor_ID_Name="Impresión a Color";

@XendraColumn(AD_Element_ID="fa351bf7-0efd-2c6a-da0b-f514d630b8e6",ColumnName="AD_PrintColor_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d000b41a-4b4c-5050-2803-c6e04407c6ed",
Synchronized="2019-08-30 22:20:29.0")
/** Column name AD_PrintColor_ID */
public static final String COLUMNNAME_AD_PrintColor_ID = "AD_PrintColor_ID";
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

@XendraTrl(Identifier="4debd1df-5ce1-3bc7-8901-6b4e460e3105")
public static String es_PE_FIELD_OrgType_Description_Name="Observación";

@XendraTrl(Identifier="4debd1df-5ce1-3bc7-8901-6b4e460e3105")
public static String es_PE_FIELD_OrgType_Description_Description="Observación";

@XendraTrl(Identifier="4debd1df-5ce1-3bc7-8901-6b4e460e3105")
public static String es_PE_FIELD_OrgType_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="54bd22b7-3b9f-dbae-1465-a4f296e8cbfe",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4debd1df-5ce1-3bc7-8901-6b4e460e3105")
public static final String FIELDNAME_OrgType_Description="4debd1df-5ce1-3bc7-8901-6b4e460e3105";

@XendraTrl(Identifier="bd511de3-f9c1-6e42-1ce8-4fece0660343")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bd511de3-f9c1-6e42-1ce8-4fece0660343",
Synchronized="2019-08-30 22:20:29.0")
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
@XendraTrl(Identifier="3acfdac0-2982-4b66-8417-427927225a6c")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3acfdac0-2982-4b66-8417-427927225a6c",
Synchronized="2019-08-30 22:20:29.0")
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

@XendraTrl(Identifier="6c348974-d0b5-565b-1438-f7da9c6ea231")
public static String es_PE_FIELD_OrgType_Name_Name="Nombre";

@XendraTrl(Identifier="6c348974-d0b5-565b-1438-f7da9c6ea231")
public static String es_PE_FIELD_OrgType_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="6c348974-d0b5-565b-1438-f7da9c6ea231")
public static String es_PE_FIELD_OrgType_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="54bd22b7-3b9f-dbae-1465-a4f296e8cbfe",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6c348974-d0b5-565b-1438-f7da9c6ea231")
public static final String FIELDNAME_OrgType_Name="6c348974-d0b5-565b-1438-f7da9c6ea231";

@XendraTrl(Identifier="678fcd22-dbcb-d93d-90b9-4f5669f859e9")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="678fcd22-dbcb-d93d-90b9-4f5669f859e9",
Synchronized="2019-08-30 22:20:29.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
}
