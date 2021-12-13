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
/** Generated Model for R_InterestArea
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_R_InterestArea extends PO
{
/** Standard Constructor
@param ctx context
@param R_InterestArea_ID id
@param trxName transaction
*/
public X_R_InterestArea (Properties ctx, int R_InterestArea_ID, String trxName)
{
super (ctx, R_InterestArea_ID, trxName);
/** if (R_InterestArea_ID == 0)
{
setIsSelfService (true);	
// Y
setName (null);
setR_InterestArea_ID (0);
setValue (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_R_InterestArea (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=530 */
public static int Table_ID=MTable.getTable_ID("R_InterestArea");

@XendraTrl(Identifier="ae09da28-df4f-8d40-f703-552d9d3b5e43")
public static String es_PE_TAB_InterestArea_Description="Área de Interés ó Tópico";

@XendraTrl(Identifier="ae09da28-df4f-8d40-f703-552d9d3b5e43")
public static String es_PE_TAB_InterestArea_Help="Áreas de interés reflejan el interés en un tópico de parte de un contacto. Áreas de interés pueden ser usadas para las campañas de mercadeo.";

@XendraTrl(Identifier="ae09da28-df4f-8d40-f703-552d9d3b5e43")
public static String es_PE_TAB_InterestArea_Name="Area de Interés";
@XendraTab(Name="Interest Area",
Description="Interest Area or Topic",
Help="Interest Areas reflect interest in a topic by a contact. Interest areas can be used for marketing campaigns. If a list is not 'Self Service', it is not visible for users via the web.",
AD_Window_ID="cbadf0d4-f118-0bd1-a224-303786a4e4a8",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="ae09da28-df4f-8d40-f703-552d9d3b5e43",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_InterestArea="ae09da28-df4f-8d40-f703-552d9d3b5e43";

@XendraTrl(Identifier="36926c82-8e11-6f76-4689-2e69e517a62d")
public static String es_PE_TABLE_R_InterestArea_Name="Area de Interés";

@XendraTable(Name="Interest Area",AD_Package_ID="1b3656e5-71c7-1296-994e-9b2c4549c7fd",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Interest Area or Topic",Help="",
TableName="R_InterestArea",AccessLevel="2",AD_Window_ID="cbadf0d4-f118-0bd1-a224-303786a4e4a8",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.standard",
Identifier="36926c82-8e11-6f76-4689-2e69e517a62d",Synchronized="2020-03-03 21:39:31.0")
/** TableName=R_InterestArea */
public static final String Table_Name="R_InterestArea";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"R_InterestArea");

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
    Table_ID = MTable.getTable_ID("R_InterestArea");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_R_InterestArea[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="ae9ce6fc-e3f0-58cb-3d48-4b5846a37d4d")
public static String es_PE_FIELD_InterestArea_Description_Name="Observación";

@XendraTrl(Identifier="ae9ce6fc-e3f0-58cb-3d48-4b5846a37d4d")
public static String es_PE_FIELD_InterestArea_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="ae9ce6fc-e3f0-58cb-3d48-4b5846a37d4d")
public static String es_PE_FIELD_InterestArea_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="ae09da28-df4f-8d40-f703-552d9d3b5e43",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ae9ce6fc-e3f0-58cb-3d48-4b5846a37d4d")
public static final String FIELDNAME_InterestArea_Description="ae9ce6fc-e3f0-58cb-3d48-4b5846a37d4d";

@XendraTrl(Identifier="02418eeb-2b6b-6819-87d9-9346ca581852")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="02418eeb-2b6b-6819-87d9-9346ca581852",
Synchronized="2019-08-30 22:23:44.0")
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
@XendraTrl(Identifier="4fefb4f4-4f9b-42c9-83db-949d50d10ba0")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4fefb4f4-4f9b-42c9-83db-949d50d10ba0",
Synchronized="2019-08-30 22:23:44.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Self-Service.
@param IsSelfService This is a Self-Service entry or this entry can be changed via Self-Service */
public void setIsSelfService (boolean IsSelfService)
{
set_Value (COLUMNNAME_IsSelfService, Boolean.valueOf(IsSelfService));
}
/** Get Self-Service.
@return This is a Self-Service entry or this entry can be changed via Self-Service */
public boolean isSelfService() 
{
Object oo = get_Value(COLUMNNAME_IsSelfService);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="b5c9c271-1edb-ec98-6d9e-7725887d82ee")
public static String es_PE_FIELD_InterestArea_Self_Service_Name="Auto-Servicio";

@XendraTrl(Identifier="b5c9c271-1edb-ec98-6d9e-7725887d82ee")
public static String es_PE_FIELD_InterestArea_Self_Service_Description="Esta es una entrada del autoservicio ó esta entrada se puede cambiar vía autoservicio";

@XendraTrl(Identifier="b5c9c271-1edb-ec98-6d9e-7725887d82ee")
public static String es_PE_FIELD_InterestArea_Self_Service_Help="El autoservicio permite que los usuarios incorporen datos o que pongan al día sus datos. La bandera indica, que este expediente fue incorporado o creado vía autoservicio o que el usuario puede cambiarlo vía funcionalidad del autoservicio.";

@XendraField(AD_Column_ID="IsSelfService",IsCentrallyMaintained=true,
AD_Tab_ID="ae09da28-df4f-8d40-f703-552d9d3b5e43",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b5c9c271-1edb-ec98-6d9e-7725887d82ee")
public static final String FIELDNAME_InterestArea_Self_Service="b5c9c271-1edb-ec98-6d9e-7725887d82ee";

@XendraTrl(Identifier="f176bfad-d76f-4fdb-7c03-7511eeb7eeb9")
public static String es_PE_COLUMN_IsSelfService_Name="Auto-Servicio";

@XendraColumn(AD_Element_ID="8f201030-f9ab-66d2-f4de-7209f41f2af8",ColumnName="IsSelfService",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f176bfad-d76f-4fdb-7c03-7511eeb7eeb9",
Synchronized="2019-08-30 22:23:44.0")
/** Column name IsSelfService */
public static final String COLUMNNAME_IsSelfService = "IsSelfService";
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

@XendraTrl(Identifier="aa0c4904-3313-4109-1c74-0b1e7be0147a")
public static String es_PE_FIELD_InterestArea_Name_Name="Nombre";

@XendraTrl(Identifier="aa0c4904-3313-4109-1c74-0b1e7be0147a")
public static String es_PE_FIELD_InterestArea_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="aa0c4904-3313-4109-1c74-0b1e7be0147a")
public static String es_PE_FIELD_InterestArea_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="ae09da28-df4f-8d40-f703-552d9d3b5e43",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="aa0c4904-3313-4109-1c74-0b1e7be0147a")
public static final String FIELDNAME_InterestArea_Name="aa0c4904-3313-4109-1c74-0b1e7be0147a";

@XendraTrl(Identifier="f6d9a35a-bad0-5c88-4815-a91a20df5670")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f6d9a35a-bad0-5c88-4815-a91a20df5670",
Synchronized="2019-08-30 22:23:44.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Interest Area.
@param R_InterestArea_ID Interest Area or Topic */
public void setR_InterestArea_ID (int R_InterestArea_ID)
{
if (R_InterestArea_ID < 1) throw new IllegalArgumentException ("R_InterestArea_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_R_InterestArea_ID, Integer.valueOf(R_InterestArea_ID));
}
/** Get Interest Area.
@return Interest Area or Topic */
public int getR_InterestArea_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_InterestArea_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e9c8807b-f88c-6b6f-d5a6-2c071df1a44c")
public static String es_PE_FIELD_InterestArea_InterestArea_Name="Area de Interés";

@XendraTrl(Identifier="e9c8807b-f88c-6b6f-d5a6-2c071df1a44c")
public static String es_PE_FIELD_InterestArea_InterestArea_Description="Area de interés o tópico";

@XendraTrl(Identifier="e9c8807b-f88c-6b6f-d5a6-2c071df1a44c")
public static String es_PE_FIELD_InterestArea_InterestArea_Help="Areas de interés reflejan interés en un tópico por un contacto. Areas de interés pueden ser usadas para campañas de mercadeo";

@XendraField(AD_Column_ID="R_InterestArea_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ae09da28-df4f-8d40-f703-552d9d3b5e43",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e9c8807b-f88c-6b6f-d5a6-2c071df1a44c")
public static final String FIELDNAME_InterestArea_InterestArea="e9c8807b-f88c-6b6f-d5a6-2c071df1a44c";
/** Column name R_InterestArea_ID */
public static final String COLUMNNAME_R_InterestArea_ID = "R_InterestArea_ID";
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
@XendraTrl(Identifier="16fce8f7-6a05-0510-b152-87217114c20a")
public static String es_PE_FIELD_InterestArea_SearchKey_Name="Clave de Búsqueda";

@XendraTrl(Identifier="16fce8f7-6a05-0510-b152-87217114c20a")
public static String es_PE_FIELD_InterestArea_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="16fce8f7-6a05-0510-b152-87217114c20a")
public static String es_PE_FIELD_InterestArea_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="ae09da28-df4f-8d40-f703-552d9d3b5e43",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="16fce8f7-6a05-0510-b152-87217114c20a")
public static final String FIELDNAME_InterestArea_SearchKey="16fce8f7-6a05-0510-b152-87217114c20a";

@XendraTrl(Identifier="1fc51524-2b51-7124-b920-be199476b8e3")
public static String es_PE_COLUMN_Value_Name="Clave de Búsqueda";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1fc51524-2b51-7124-b920-be199476b8e3",
Synchronized="2019-08-30 22:23:44.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
}
