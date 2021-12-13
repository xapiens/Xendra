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
/** Generated Model for S_Resource
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_S_Resource extends PO
{
/** Standard Constructor
@param ctx context
@param S_Resource_ID id
@param trxName transaction
*/
public X_S_Resource (Properties ctx, int S_Resource_ID, String trxName)
{
super (ctx, S_Resource_ID, trxName);
/** if (S_Resource_ID == 0)
{
setIsAvailable (true);	
// Y
setM_Warehouse_ID (0);
setName (null);
setS_Resource_ID (0);
setS_ResourceType_ID (0);
setValue (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_S_Resource (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=487 */
public static int Table_ID=MTable.getTable_ID("S_Resource");

@XendraTrl(Identifier="b5ca7ca7-a516-f918-10c4-72b7d5c4c860")
public static String es_PE_TAB_Resource_Description="Mantener Recursos";

@XendraTrl(Identifier="b5ca7ca7-a516-f918-10c4-72b7d5c4c860")
public static String es_PE_TAB_Resource_Name="Recursos";
@XendraTab(Name="Resource",
Description="Maintain Resources",Help="",AD_Window_ID="d64fba3f-bbf2-bd5b-1f70-0c9bcedb722a",
SeqNo=10,TabLevel=0,IsSingleRow=false,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="",HasTree=false,WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="b5ca7ca7-a516-f918-10c4-72b7d5c4c860",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Resource="b5ca7ca7-a516-f918-10c4-72b7d5c4c860";

@XendraTrl(Identifier="176fb721-8f46-26a5-1127-a27f25bd4527")
public static String es_PE_TABLE_S_Resource_Name="Recurso";

@XendraTable(Name="Resource",AD_Package_ID="4bb6f0e4-f72d-dcbb-9183-88af0357143f",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Resource",Help="",
TableName="S_Resource",AccessLevel="3",AD_Window_ID="d64fba3f-bbf2-bd5b-1f70-0c9bcedb722a",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=85,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.services",
Identifier="176fb721-8f46-26a5-1127-a27f25bd4527",Synchronized="2020-03-03 21:40:10.0")
/** TableName=S_Resource */
public static final String Table_Name="S_Resource";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"S_Resource");

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
    Table_ID = MTable.getTable_ID("S_Resource");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_S_Resource[").append(get_ID()).append("]");
return sb.toString();
}
/** Set User/Contact.
@param AD_User_ID User within the system - Internal or Business Partner Contact */
public void setAD_User_ID (int AD_User_ID)
{
if (AD_User_ID <= 0) set_Value (COLUMNNAME_AD_User_ID, null);
 else 
set_Value (COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
}
/** Get User/Contact.
@return User within the system - Internal or Business Partner Contact */
public int getAD_User_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4d17c03f-b338-b612-a586-00240313ea13")
public static String es_PE_FIELD_Resource_UserContact_Name="Usuario";

@XendraTrl(Identifier="4d17c03f-b338-b612-a586-00240313ea13")
public static String es_PE_FIELD_Resource_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="4d17c03f-b338-b612-a586-00240313ea13")
public static String es_PE_FIELD_Resource_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b5ca7ca7-a516-f918-10c4-72b7d5c4c860",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4d17c03f-b338-b612-a586-00240313ea13")
public static final String FIELDNAME_Resource_UserContact="4d17c03f-b338-b612-a586-00240313ea13";

@XendraTrl(Identifier="1e1ebb1b-0364-5afc-2fef-1b8e32705431")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="a1ea6cc6-fa00-1e16-1059-b4df151aaf4b",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="1e1ebb1b-0364-5afc-2fef-1b8e32705431",Synchronized="2019-08-30 22:24:16.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
/** Set Chargeable Quantity.
@param ChargeableQty Chargeable Quantity */
public void setChargeableQty (BigDecimal ChargeableQty)
{
set_Value (COLUMNNAME_ChargeableQty, ChargeableQty);
}
/** Get Chargeable Quantity.
@return Chargeable Quantity */
public BigDecimal getChargeableQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ChargeableQty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="d2f8441a-a46a-fa8f-3ba5-ac00e8ecdecd")
public static String es_PE_FIELD_Resource_ChargeableQuantity_Name="Cantidad Cargada";

@XendraField(AD_Column_ID="ChargeableQty",IsCentrallyMaintained=true,
AD_Tab_ID="b5ca7ca7-a516-f918-10c4-72b7d5c4c860",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=20,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d2f8441a-a46a-fa8f-3ba5-ac00e8ecdecd")
public static final String FIELDNAME_Resource_ChargeableQuantity="d2f8441a-a46a-fa8f-3ba5-ac00e8ecdecd";

@XendraTrl(Identifier="c8a125ec-d139-0842-fb47-2773a5aca837")
public static String es_PE_COLUMN_ChargeableQty_Name="Cantidad Cargada";

@XendraColumn(AD_Element_ID="00d5e80e-32d3-80fa-110e-ca5c02ab7858",ColumnName="ChargeableQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c8a125ec-d139-0842-fb47-2773a5aca837",
Synchronized="2019-08-30 22:24:16.0")
/** Column name ChargeableQty */
public static final String COLUMNNAME_ChargeableQty = "ChargeableQty";
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

@XendraTrl(Identifier="6b2f10c7-04f7-53ef-6326-bf68b0471185")
public static String es_PE_FIELD_Resource_Description_Name="Observación";

@XendraTrl(Identifier="6b2f10c7-04f7-53ef-6326-bf68b0471185")
public static String es_PE_FIELD_Resource_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="6b2f10c7-04f7-53ef-6326-bf68b0471185")
public static String es_PE_FIELD_Resource_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="b5ca7ca7-a516-f918-10c4-72b7d5c4c860",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6b2f10c7-04f7-53ef-6326-bf68b0471185")
public static final String FIELDNAME_Resource_Description="6b2f10c7-04f7-53ef-6326-bf68b0471185";

@XendraTrl(Identifier="c5075c5d-6855-c4be-cd9f-728c5843340b")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c5075c5d-6855-c4be-cd9f-728c5843340b",
Synchronized="2019-08-30 22:24:16.0")
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
@XendraTrl(Identifier="ce04c079-c8c0-4a72-9829-fc06431b6a13")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ce04c079-c8c0-4a72-9829-fc06431b6a13",
Synchronized="2019-08-30 22:24:16.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Available.
@param IsAvailable Resource is available */
public void setIsAvailable (boolean IsAvailable)
{
set_Value (COLUMNNAME_IsAvailable, Boolean.valueOf(IsAvailable));
}
/** Get Available.
@return Resource is available */
public boolean isAvailable() 
{
Object oo = get_Value(COLUMNNAME_IsAvailable);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="9049aaa0-4d87-d93e-9ab9-e10f902b4059")
public static String es_PE_FIELD_Resource_Available_Name="Disponible";

@XendraTrl(Identifier="9049aaa0-4d87-d93e-9ab9-e10f902b4059")
public static String es_PE_FIELD_Resource_Available_Description="Recurso esta disponible";

@XendraTrl(Identifier="9049aaa0-4d87-d93e-9ab9-e10f902b4059")
public static String es_PE_FIELD_Resource_Available_Help="Recurso esta disponible para ser asignado";

@XendraField(AD_Column_ID="IsAvailable",IsCentrallyMaintained=true,
AD_Tab_ID="b5ca7ca7-a516-f918-10c4-72b7d5c4c860",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9049aaa0-4d87-d93e-9ab9-e10f902b4059")
public static final String FIELDNAME_Resource_Available="9049aaa0-4d87-d93e-9ab9-e10f902b4059";

@XendraTrl(Identifier="c7d474d1-5b07-e3d2-5b4b-70a0dd969b64")
public static String es_PE_COLUMN_IsAvailable_Name="Disponible";

@XendraColumn(AD_Element_ID="68dcedc6-1763-1047-51d2-7d55ed8c3242",ColumnName="IsAvailable",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c7d474d1-5b07-e3d2-5b4b-70a0dd969b64",
Synchronized="2019-08-30 22:24:16.0")
/** Column name IsAvailable */
public static final String COLUMNNAME_IsAvailable = "IsAvailable";
/** Set Warehouse.
@param M_Warehouse_ID Storage Warehouse and Service Point */
public void setM_Warehouse_ID (int M_Warehouse_ID)
{
if (M_Warehouse_ID < 1) throw new IllegalArgumentException ("M_Warehouse_ID is mandatory.");
set_Value (COLUMNNAME_M_Warehouse_ID, Integer.valueOf(M_Warehouse_ID));
}
/** Get Warehouse.
@return Storage Warehouse and Service Point */
public int getM_Warehouse_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Warehouse_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2c0d8aee-94dd-541f-0d91-de5ef07c8576")
public static String es_PE_FIELD_Resource_Warehouse_Name="Almacén";

@XendraTrl(Identifier="2c0d8aee-94dd-541f-0d91-de5ef07c8576")
public static String es_PE_FIELD_Resource_Warehouse_Description="Almacén";

@XendraTrl(Identifier="2c0d8aee-94dd-541f-0d91-de5ef07c8576")
public static String es_PE_FIELD_Resource_Warehouse_Help="El Almacén indica un Almacén único donde los productos son almacenados";

@XendraField(AD_Column_ID="M_Warehouse_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b5ca7ca7-a516-f918-10c4-72b7d5c4c860",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2c0d8aee-94dd-541f-0d91-de5ef07c8576")
public static final String FIELDNAME_Resource_Warehouse="2c0d8aee-94dd-541f-0d91-de5ef07c8576";

@XendraTrl(Identifier="87987632-21d0-0bf8-4e4e-d5207fe81b91")
public static String es_PE_COLUMN_M_Warehouse_ID_Name="Almacén";

@XendraColumn(AD_Element_ID="402045cd-baa5-aeaf-b148-a921dffb7821",ColumnName="M_Warehouse_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="87987632-21d0-0bf8-4e4e-d5207fe81b91",
Synchronized="2019-08-30 22:24:16.0")
/** Column name M_Warehouse_ID */
public static final String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
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

@XendraTrl(Identifier="4ef90783-644a-1ddd-1263-0f981e0e047e")
public static String es_PE_FIELD_Resource_Name_Name="Nombre";

@XendraTrl(Identifier="4ef90783-644a-1ddd-1263-0f981e0e047e")
public static String es_PE_FIELD_Resource_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="4ef90783-644a-1ddd-1263-0f981e0e047e")
public static String es_PE_FIELD_Resource_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="b5ca7ca7-a516-f918-10c4-72b7d5c4c860",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4ef90783-644a-1ddd-1263-0f981e0e047e")
public static final String FIELDNAME_Resource_Name="4ef90783-644a-1ddd-1263-0f981e0e047e";

@XendraTrl(Identifier="25de9912-e5a3-4227-e3a0-db485debfa0c")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="25de9912-e5a3-4227-e3a0-db485debfa0c",
Synchronized="2019-08-30 22:24:16.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Resource.
@param S_Resource_ID Resource */
public void setS_Resource_ID (int S_Resource_ID)
{
if (S_Resource_ID < 1) throw new IllegalArgumentException ("S_Resource_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_S_Resource_ID, Integer.valueOf(S_Resource_ID));
}
/** Get Resource.
@return Resource */
public int getS_Resource_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_S_Resource_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d2f3722b-89a8-a22b-f90b-15693580a182")
public static String es_PE_FIELD_Resource_Resource_Name="Recurso";

@XendraTrl(Identifier="d2f3722b-89a8-a22b-f90b-15693580a182")
public static String es_PE_FIELD_Resource_Resource_Description="Recurso";

@XendraField(AD_Column_ID="S_Resource_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b5ca7ca7-a516-f918-10c4-72b7d5c4c860",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d2f3722b-89a8-a22b-f90b-15693580a182")
public static final String FIELDNAME_Resource_Resource="d2f3722b-89a8-a22b-f90b-15693580a182";
/** Column name S_Resource_ID */
public static final String COLUMNNAME_S_Resource_ID = "S_Resource_ID";
/** Set Resource Type.
@param S_ResourceType_ID Resource Type */
public void setS_ResourceType_ID (int S_ResourceType_ID)
{
if (S_ResourceType_ID < 1) throw new IllegalArgumentException ("S_ResourceType_ID is mandatory.");
set_Value (COLUMNNAME_S_ResourceType_ID, Integer.valueOf(S_ResourceType_ID));
}
/** Get Resource Type.
@return Resource Type */
public int getS_ResourceType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_S_ResourceType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4609d7c6-9961-9c64-67ef-6786631596ee")
public static String es_PE_FIELD_Resource_ResourceType_Name="Tipo de Recurso";

@XendraField(AD_Column_ID="S_ResourceType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b5ca7ca7-a516-f918-10c4-72b7d5c4c860",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4609d7c6-9961-9c64-67ef-6786631596ee")
public static final String FIELDNAME_Resource_ResourceType="4609d7c6-9961-9c64-67ef-6786631596ee";

@XendraTrl(Identifier="fdb71d20-21ed-c615-f897-197e48e6ca86")
public static String es_PE_COLUMN_S_ResourceType_ID_Name="Tipo de Recurso";

@XendraColumn(AD_Element_ID="0277c3f5-d608-690c-61cb-831271cd0a65",ColumnName="S_ResourceType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fdb71d20-21ed-c615-f897-197e48e6ca86",
Synchronized="2019-08-30 22:24:16.0")
/** Column name S_ResourceType_ID */
public static final String COLUMNNAME_S_ResourceType_ID = "S_ResourceType_ID";
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
@XendraTrl(Identifier="f31e2543-17df-e856-59f2-26d75ef2fb1b")
public static String es_PE_FIELD_Resource_SearchKey_Name="Clave de Búsqueda";

@XendraTrl(Identifier="f31e2543-17df-e856-59f2-26d75ef2fb1b")
public static String es_PE_FIELD_Resource_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="f31e2543-17df-e856-59f2-26d75ef2fb1b")
public static String es_PE_FIELD_Resource_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="b5ca7ca7-a516-f918-10c4-72b7d5c4c860",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=50,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f31e2543-17df-e856-59f2-26d75ef2fb1b")
public static final String FIELDNAME_Resource_SearchKey="f31e2543-17df-e856-59f2-26d75ef2fb1b";

@XendraTrl(Identifier="e1d092d8-af5d-eba5-1426-3d22b7e3c143")
public static String es_PE_COLUMN_Value_Name="Clave de Búsqueda";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e1d092d8-af5d-eba5-1426-3d22b7e3c143",
Synchronized="2019-08-30 22:24:16.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
}
