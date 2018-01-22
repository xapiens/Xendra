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
import org.compiere.model.reference.REF_WarehouseBaseType;
/** Generated Model for M_Warehouse
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_Warehouse extends PO
{
/** Standard Constructor
@param ctx context
@param M_Warehouse_ID id
@param trxName transaction
*/
public X_M_Warehouse (Properties ctx, int M_Warehouse_ID, String trxName)
{
super (ctx, M_Warehouse_ID, trxName);
/** if (M_Warehouse_ID == 0)
{
setC_Location_ID (0);
setM_Warehouse_ID (0);
setName (null);
setSeparator (null);	
// *
setValue (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_Warehouse (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=190 */
public static int Table_ID=MTable.getTable_ID("M_Warehouse");

@XendraTrl(Identifier="ef5fda94-e1b7-9f9b-836f-baf64e5c326f")
public static String es_PE_TAB_Warehouse_Description="Almacén";

@XendraTrl(Identifier="ef5fda94-e1b7-9f9b-836f-baf64e5c326f")
public static String es_PE_TAB_Warehouse_Name="Almacén";

@XendraTrl(Identifier="ef5fda94-e1b7-9f9b-836f-baf64e5c326f")
public static String es_PE_TAB_Warehouse_Help="La pestaña de almacenes define cada almacén que es usado para guardar productos.";

@XendraTab(Name="Warehouse",Description="Warehouse",
Help="The Warehouse Tab defines each Warehouse that is used to store products.  If a Source warehouse is selected, all product replenishment is from that warehouse.  If you use custom replenishment algorithms, you need to define the class used per warehouse.",
AD_Window_ID="46ccc992-68c0-cc7a-5da1-f15017ce2fce",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="ef5fda94-e1b7-9f9b-836f-baf64e5c326f",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Warehouse="ef5fda94-e1b7-9f9b-836f-baf64e5c326f";

@XendraTrl(Identifier="bd470587-43c8-aed0-846f-1694ed0e05e3")
public static String es_PE_TABLE_M_Warehouse_Name="Almacén";

@XendraTable(Name="Warehouse",Description="Storage Warehouse and Service Point",Help="",
TableName="M_Warehouse",AccessLevel="3",AD_Window_ID="46ccc992-68c0-cc7a-5da1-f15017ce2fce",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=80,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="bd470587-43c8-aed0-846f-1694ed0e05e3",Synchronized="2017-08-16 11:43:38.0")
/** TableName=M_Warehouse */
public static final String Table_Name="M_Warehouse";


@XendraIndex(Name="m_warehouse_name",Identifier="cbdffe0a-7ac0-479d-11da-0f2bbe5473bf",
Column_Names="ad_client_id, name",IsUnique="true",
TableIdentifier="cbdffe0a-7ac0-479d-11da-0f2bbe5473bf",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_m_warehouse_name = "cbdffe0a-7ac0-479d-11da-0f2bbe5473bf";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_Warehouse");

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
    Table_ID = MTable.getTable_ID("M_Warehouse");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_Warehouse[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Address.
@param C_Location_ID Location or Address */
public void setC_Location_ID (int C_Location_ID)
{
if (C_Location_ID < 1) throw new IllegalArgumentException ("C_Location_ID is mandatory.");
set_Value (COLUMNNAME_C_Location_ID, Integer.valueOf(C_Location_ID));
}
/** Get Address.
@return Location or Address */
public int getC_Location_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Location_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="938ac8d1-f4cc-ae4d-af59-6e41da609af0")
public static String es_PE_FIELD_Warehouse_Address_Description="Ubicación ó dirección";

@XendraTrl(Identifier="938ac8d1-f4cc-ae4d-af59-6e41da609af0")
public static String es_PE_FIELD_Warehouse_Address_Help="El campo Ubicación / Dirección define la ubicación de una entidad.";

@XendraTrl(Identifier="938ac8d1-f4cc-ae4d-af59-6e41da609af0")
public static String es_PE_FIELD_Warehouse_Address_Name="Localización / Dirección";

@XendraField(AD_Column_ID="C_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ef5fda94-e1b7-9f9b-836f-baf64e5c326f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="938ac8d1-f4cc-ae4d-af59-6e41da609af0")
public static final String FIELDNAME_Warehouse_Address="938ac8d1-f4cc-ae4d-af59-6e41da609af0";

@XendraTrl(Identifier="e18b6377-3507-b42e-8b70-7d20993b28b4")
public static String es_PE_COLUMN_C_Location_ID_Name="Localización / Dirección";

@XendraColumn(AD_Element_ID="e66e22a8-535b-2af2-6efb-aa600959a885",ColumnName="C_Location_ID",
AD_Reference_ID=21,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e18b6377-3507-b42e-8b70-7d20993b28b4",
Synchronized="2017-08-05 16:55:38.0")
/** Column name C_Location_ID */
public static final String COLUMNNAME_C_Location_ID = "C_Location_ID";
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

@XendraTrl(Identifier="cee7d846-b76d-5914-0487-22ebdc3bbf89")
public static String es_PE_FIELD_Warehouse_Description_Description="Observación";

@XendraTrl(Identifier="cee7d846-b76d-5914-0487-22ebdc3bbf89")
public static String es_PE_FIELD_Warehouse_Description_Help="Observación";

@XendraTrl(Identifier="cee7d846-b76d-5914-0487-22ebdc3bbf89")
public static String es_PE_FIELD_Warehouse_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="ef5fda94-e1b7-9f9b-836f-baf64e5c326f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cee7d846-b76d-5914-0487-22ebdc3bbf89")
public static final String FIELDNAME_Warehouse_Description="cee7d846-b76d-5914-0487-22ebdc3bbf89";

@XendraTrl(Identifier="eaf23d4e-0f44-64cd-7350-f4738668d309")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="eaf23d4e-0f44-64cd-7350-f4738668d309",
Synchronized="2017-08-05 16:55:38.0")
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
@XendraTrl(Identifier="8f157f71-3da7-4589-9cde-3307cbba3568")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8f157f71-3da7-4589-9cde-3307cbba3568",
Synchronized="2017-08-05 16:55:38.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Warehouse.
@param M_Warehouse_ID Storage Warehouse and Service Point */
public void setM_Warehouse_ID (int M_Warehouse_ID)
{
if (M_Warehouse_ID < 1) throw new IllegalArgumentException ("M_Warehouse_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_Warehouse_ID, Integer.valueOf(M_Warehouse_ID));
}
/** Get Warehouse.
@return Storage Warehouse and Service Point */
public int getM_Warehouse_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Warehouse_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b632bb38-0884-4570-8f91-8fee9fe72586")
public static String es_PE_FIELD_Warehouse_Warehouse_Description="Almacén";

@XendraTrl(Identifier="b632bb38-0884-4570-8f91-8fee9fe72586")
public static String es_PE_FIELD_Warehouse_Warehouse_Help="El Almacén indica un Almacén único donde los productos son almacenados";

@XendraTrl(Identifier="b632bb38-0884-4570-8f91-8fee9fe72586")
public static String es_PE_FIELD_Warehouse_Warehouse_Name="Almacén";

@XendraField(AD_Column_ID="M_Warehouse_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ef5fda94-e1b7-9f9b-836f-baf64e5c326f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b632bb38-0884-4570-8f91-8fee9fe72586")
public static final String FIELDNAME_Warehouse_Warehouse="b632bb38-0884-4570-8f91-8fee9fe72586";
/** Column name M_Warehouse_ID */
public static final String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";

/** M_WarehouseSource_ID AD_Reference=e3999c76-66f0-38b0-a95e-fb0d580cde7a */
public static final int M_WAREHOUSESOURCE_ID_AD_Reference_ID=197;
/** Set Source Warehouse.
@param M_WarehouseSource_ID Optional Warehouse to replenish from */
public void setM_WarehouseSource_ID (int M_WarehouseSource_ID)
{
if (M_WarehouseSource_ID <= 0) set_Value (COLUMNNAME_M_WarehouseSource_ID, null);
 else 
set_Value (COLUMNNAME_M_WarehouseSource_ID, Integer.valueOf(M_WarehouseSource_ID));
}
/** Get Source Warehouse.
@return Optional Warehouse to replenish from */
public int getM_WarehouseSource_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_WarehouseSource_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b5ed9a96-796a-7168-d02a-6ce1b3f7328e")
public static String es_PE_FIELD_Warehouse_SourceWarehouse_Description="Almacén Opcional de Reabastecimiento para ";

@XendraTrl(Identifier="b5ed9a96-796a-7168-d02a-6ce1b3f7328e")
public static String es_PE_FIELD_Warehouse_SourceWarehouse_Help="Si seleccionó, el almacén seleccionado es empleado para reabastecimiento de producto(s)";

@XendraTrl(Identifier="b5ed9a96-796a-7168-d02a-6ce1b3f7328e")
public static String es_PE_FIELD_Warehouse_SourceWarehouse_Name="Almacén Fuente";

@XendraField(AD_Column_ID="M_WarehouseSource_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ef5fda94-e1b7-9f9b-836f-baf64e5c326f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b5ed9a96-796a-7168-d02a-6ce1b3f7328e")
public static final String FIELDNAME_Warehouse_SourceWarehouse="b5ed9a96-796a-7168-d02a-6ce1b3f7328e";

@XendraTrl(Identifier="89a9f43f-626e-6eec-9e6a-f7ba7649a8d2")
public static String es_PE_COLUMN_M_WarehouseSource_ID_Name="Almacén Fuente";

@XendraColumn(AD_Element_ID="47beb296-0f71-6c17-c133-5f1b98bf1682",
ColumnName="M_WarehouseSource_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="e3999c76-66f0-38b0-a95e-fb0d580cde7a",AD_Val_Rule_ID="",FieldLength=10,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="89a9f43f-626e-6eec-9e6a-f7ba7649a8d2",
Synchronized="2017-08-05 16:55:38.0")
/** Column name M_WarehouseSource_ID */
public static final String COLUMNNAME_M_WarehouseSource_ID = "M_WarehouseSource_ID";
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

@XendraTrl(Identifier="47083883-9ad6-1dc6-a0c3-23100e56ef1f")
public static String es_PE_FIELD_Warehouse_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="47083883-9ad6-1dc6-a0c3-23100e56ef1f")
public static String es_PE_FIELD_Warehouse_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="47083883-9ad6-1dc6-a0c3-23100e56ef1f")
public static String es_PE_FIELD_Warehouse_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="ef5fda94-e1b7-9f9b-836f-baf64e5c326f",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="47083883-9ad6-1dc6-a0c3-23100e56ef1f")
public static final String FIELDNAME_Warehouse_Name="47083883-9ad6-1dc6-a0c3-23100e56ef1f";

@XendraTrl(Identifier="2d866e19-ab9f-aa19-1e5e-33dd9eb57c11")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2d866e19-ab9f-aa19-1e5e-33dd9eb57c11",
Synchronized="2017-08-05 16:55:38.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Replenishment Class.
@param ReplenishmentClass Custom class to calculate Quantity to Order */
public void setReplenishmentClass (String ReplenishmentClass)
{
if (ReplenishmentClass != null && ReplenishmentClass.length() > 60)
{
log.warning("Length > 60 - truncated");
ReplenishmentClass = ReplenishmentClass.substring(0,59);
}
set_Value (COLUMNNAME_ReplenishmentClass, ReplenishmentClass);
}
/** Get Replenishment Class.
@return Custom class to calculate Quantity to Order */
public String getReplenishmentClass() 
{
String value = (String)get_Value(COLUMNNAME_ReplenishmentClass);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="8530f56d-e26d-5163-24aa-824a8280182f")
public static String es_PE_FIELD_Warehouse_ReplenishmentClass_Description="Clase Cliente para calcular Cantidad a Ordenar";

@XendraTrl(Identifier="8530f56d-e26d-5163-24aa-824a8280182f")
public static String es_PE_FIELD_Warehouse_ReplenishmentClass_Help="Si usted selecciona un cliente tipo reabastecimiento, ustéd debe crear una implementación de clases org.compiere.util.ReplenishInterface y ajustarlo sobre nivel de almacén.";

@XendraTrl(Identifier="8530f56d-e26d-5163-24aa-824a8280182f")
public static String es_PE_FIELD_Warehouse_ReplenishmentClass_Name="Clase de Reabastecimiento";

@XendraField(AD_Column_ID="ReplenishmentClass",IsCentrallyMaintained=true,
AD_Tab_ID="ef5fda94-e1b7-9f9b-836f-baf64e5c326f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8530f56d-e26d-5163-24aa-824a8280182f")
public static final String FIELDNAME_Warehouse_ReplenishmentClass="8530f56d-e26d-5163-24aa-824a8280182f";

@XendraTrl(Identifier="47060c5a-5167-b034-6a67-9e4624ae45f2")
public static String es_PE_COLUMN_ReplenishmentClass_Name="Clase de Reabastecimiento";

@XendraColumn(AD_Element_ID="10fca438-0929-5400-f8c9-befe3baf3bf6",ColumnName="ReplenishmentClass",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="47060c5a-5167-b034-6a67-9e4624ae45f2",
Synchronized="2017-08-05 16:55:38.0")
/** Column name ReplenishmentClass */
public static final String COLUMNNAME_ReplenishmentClass = "ReplenishmentClass";
/** Set Element Separator.
@param Separator Element Separator */
public void setSeparator (String Separator)
{
if (Separator == null) throw new IllegalArgumentException ("Separator is mandatory.");
if (Separator.length() > 1)
{
log.warning("Length > 1 - truncated");
Separator = Separator.substring(0,0);
}
set_Value (COLUMNNAME_Separator, Separator);
}
/** Get Element Separator.
@return Element Separator */
public String getSeparator() 
{
String value = (String)get_Value(COLUMNNAME_Separator);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="52b3fb26-2709-9436-63e2-288b31377ed1")
public static String es_PE_FIELD_Warehouse_ElementSeparator_Description="Separador de los elementos de la cuenta";

@XendraTrl(Identifier="52b3fb26-2709-9436-63e2-288b31377ed1")
public static String es_PE_FIELD_Warehouse_ElementSeparator_Help="El separador de elementos de cuenta define el delimitador impreso entre los elementos de la cuenta.";

@XendraTrl(Identifier="52b3fb26-2709-9436-63e2-288b31377ed1")
public static String es_PE_FIELD_Warehouse_ElementSeparator_Name="Separador Elemento de Cuentas";

@XendraField(AD_Column_ID="Separator",IsCentrallyMaintained=true,
AD_Tab_ID="ef5fda94-e1b7-9f9b-836f-baf64e5c326f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=5,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="52b3fb26-2709-9436-63e2-288b31377ed1")
public static final String FIELDNAME_Warehouse_ElementSeparator="52b3fb26-2709-9436-63e2-288b31377ed1";

@XendraTrl(Identifier="15e9b6a0-5f13-96da-0270-87a8aa34e2eb")
public static String es_PE_COLUMN_Separator_Name="Separador Elemento de Cuentas";

@XendraColumn(AD_Element_ID="afaa6265-5446-7f61-81a8-b90e9bcaa0fb",ColumnName="Separator",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="*",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="15e9b6a0-5f13-96da-0270-87a8aa34e2eb",
Synchronized="2017-08-05 16:55:38.0")
/** Column name Separator */
public static final String COLUMNNAME_Separator = "Separator";
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
@XendraTrl(Identifier="53b621a1-7dfe-18fd-e953-ddcb7ccade58")
public static String es_PE_FIELD_Warehouse_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="53b621a1-7dfe-18fd-e953-ddcb7ccade58")
public static String es_PE_FIELD_Warehouse_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraTrl(Identifier="53b621a1-7dfe-18fd-e953-ddcb7ccade58")
public static String es_PE_FIELD_Warehouse_SearchKey_Name="Clave de Búsqueda";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="ef5fda94-e1b7-9f9b-836f-baf64e5c326f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="53b621a1-7dfe-18fd-e953-ddcb7ccade58")
public static final String FIELDNAME_Warehouse_SearchKey="53b621a1-7dfe-18fd-e953-ddcb7ccade58";

@XendraTrl(Identifier="c43a9211-41dd-1609-b783-87c4167e2505")
public static String es_PE_COLUMN_Value_Name="Clave de Búsqueda";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c43a9211-41dd-1609-b783-87c4167e2505",
Synchronized="2017-08-05 16:55:38.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";

/** WarBaseType AD_Reference=2314781c-acbf-459f-86b3-2c46299b1f39 */
public static final int WARBASETYPE_AD_Reference_ID=1000057;
/** Set WarBaseType.
@param WarBaseType WarBaseType */
public void setWarBaseType (String WarBaseType)
{
if (WarBaseType == null || WarBaseType.equals(REF_WarehouseBaseType.Definition9) || WarBaseType.equals(REF_WarehouseBaseType.Definition1) || WarBaseType.equals(REF_WarehouseBaseType.Definition2) || WarBaseType.equals(REF_WarehouseBaseType.Definition3) || WarBaseType.equals(REF_WarehouseBaseType.Definition4) || WarBaseType.equals(REF_WarehouseBaseType.Definition5) || WarBaseType.equals(REF_WarehouseBaseType.Definition6) || WarBaseType.equals(REF_WarehouseBaseType.Defintion7) || WarBaseType.equals(REF_WarehouseBaseType.Definition8));
 else throw new IllegalArgumentException ("WarBaseType Invalid value - " + WarBaseType + " - Reference_ID=1000057 - 009 - 001 - 002 - 003 - 004 - 005 - 006 - 007 - 008");
if (WarBaseType != null && WarBaseType.length() > 3)
{
log.warning("Length > 3 - truncated");
WarBaseType = WarBaseType.substring(0,2);
}
set_Value (COLUMNNAME_WarBaseType, WarBaseType);
}
/** Get WarBaseType.
@return WarBaseType */
public String getWarBaseType() 
{
return (String)get_Value(COLUMNNAME_WarBaseType);
}

@XendraTrl(Identifier="404ac99f-0946-48bf-b1af-4a9762c0b167")
public static String es_PE_COLUMN_WarBaseType_Name="warbasetype";

@XendraColumn(AD_Element_ID="c20d6220-23c1-49d0-8e24-4a5a105287f7",ColumnName="WarBaseType",
AD_Reference_ID=17,AD_Reference_Value_ID="2314781c-acbf-459f-86b3-2c46299b1f39",AD_Val_Rule_ID="",
FieldLength=3,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="404ac99f-0946-48bf-b1af-4a9762c0b167",Synchronized="2017-08-05 16:55:38.0")
/** Column name WarBaseType */
public static final String COLUMNNAME_WarBaseType = "WarBaseType";
}
