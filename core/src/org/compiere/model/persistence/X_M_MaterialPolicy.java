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
/** Generated Model for M_MaterialPolicy
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_MaterialPolicy extends PO
{
/** Standard Constructor
@param ctx context
@param M_MaterialPolicy_ID id
@param trxName transaction
*/
public X_M_MaterialPolicy (Properties ctx, int M_MaterialPolicy_ID, String trxName)
{
super (ctx, M_MaterialPolicy_ID, trxName);
/** if (M_MaterialPolicy_ID == 0)
{
setM_MaterialPolicy_ID (0);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_MaterialPolicy (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000349 */
public static int Table_ID=MTable.getTable_ID("M_MaterialPolicy");

@XendraTrl(Identifier="c36a1379-55e7-4870-b786-ecb2b1b395a6")
public static String es_PE_TAB_MaterialPolicy_Name="Material Policy";

@XendraTab(Name="Material Policy",Description="",Help="",
AD_Window_ID="f58996b7-5de2-486f-b975-b739ccf34b84",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="c36a1379-55e7-4870-b786-ecb2b1b395a6",Synchronized="2016-08-09 11:40:44.0")
public static final String TABNAME_MaterialPolicy="c36a1379-55e7-4870-b786-ecb2b1b395a6";

@XendraTrl(Identifier="7a453f82-3cd1-4856-a378-b1bce7259a7d")
public static String es_PE_TABLE_M_MaterialPolicy_Name="Material Policy";

@XendraTable(Name="Material Policy",AD_Package_ID="2809ac2d-7d43-20f8-05f0-a478f2e50204",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="M_MaterialPolicy",AccessLevel="6",AD_Window_ID="f58996b7-5de2-486f-b975-b739ccf34b84",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="7a453f82-3cd1-4856-a378-b1bce7259a7d",Synchronized="2020-03-03 21:38:38.0")
/** TableName=M_MaterialPolicy */
public static final String Table_Name="M_MaterialPolicy";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_MaterialPolicy");

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
    Table_ID = MTable.getTable_ID("M_MaterialPolicy");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_MaterialPolicy[").append(get_ID()).append("]");
return sb.toString();
}
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
@XendraTrl(Identifier="04c0b635-5683-4873-8da4-bb69742f96eb")
public static String es_PE_FIELD_MaterialPolicy_Identifier_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="c36a1379-55e7-4870-b786-ecb2b1b395a6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=36,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-12-03 19:46:37.0",
Identifier="04c0b635-5683-4873-8da4-bb69742f96eb")
public static final String FIELDNAME_MaterialPolicy_Identifier="04c0b635-5683-4873-8da4-bb69742f96eb";

@XendraTrl(Identifier="bfa66884-743c-4973-a98c-10ca7e4d7c0f")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bfa66884-743c-4973-a98c-10ca7e4d7c0f",
Synchronized="2019-08-30 22:23:16.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set IsSynchStorage.
@param IsSynchStorage IsSynchStorage */
public void setIsSynchStorage (boolean IsSynchStorage)
{
set_Value (COLUMNNAME_IsSynchStorage, Boolean.valueOf(IsSynchStorage));
}
/** Get IsSynchStorage.
@return IsSynchStorage */
public boolean isSynchStorage() 
{
Object oo = get_Value(COLUMNNAME_IsSynchStorage);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="986cbea4-dcbe-435d-93ca-2414833be91b")
public static String es_PE_FIELD_MaterialPolicy_IsSynchStorage_Name="issynchstorage";

@XendraField(AD_Column_ID="IsSynchStorage",IsCentrallyMaintained=true,
AD_Tab_ID="c36a1379-55e7-4870-b786-ecb2b1b395a6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-12-03 19:46:37.0",
Identifier="986cbea4-dcbe-435d-93ca-2414833be91b")
public static final String FIELDNAME_MaterialPolicy_IsSynchStorage="986cbea4-dcbe-435d-93ca-2414833be91b";

@XendraTrl(Identifier="a689318c-0035-4dae-a9dd-cc1e5d934c86")
public static String es_PE_COLUMN_IsSynchStorage_Name="issynchstorage";

@XendraColumn(AD_Element_ID="3d89b5bf-0b09-43c9-8cb6-73455ae2e42f",ColumnName="IsSynchStorage",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a689318c-0035-4dae-a9dd-cc1e5d934c86",
Synchronized="2019-08-30 22:23:16.0")
/** Column name IsSynchStorage */
public static final String COLUMNNAME_IsSynchStorage = "IsSynchStorage";
/** Set LoadPeriod_ID.
@param LoadPeriod_ID LoadPeriod_ID */
public void setLoadPeriod_ID (int LoadPeriod_ID)
{
if (LoadPeriod_ID <= 0) set_Value (COLUMNNAME_LoadPeriod_ID, null);
 else 
set_Value (COLUMNNAME_LoadPeriod_ID, Integer.valueOf(LoadPeriod_ID));
}
/** Get LoadPeriod_ID.
@return LoadPeriod_ID */
public int getLoadPeriod_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_LoadPeriod_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8c7f7f4b-5e47-482b-b643-a001add8ba7f")
public static String es_PE_COLUMN_LoadPeriod_ID_Name="loadperiod_id";

@XendraColumn(AD_Element_ID="c846221d-3b21-4ee2-8a81-ac2d21ad6bb8",ColumnName="LoadPeriod_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8c7f7f4b-5e47-482b-b643-a001add8ba7f",
Synchronized="2019-08-30 22:23:16.0")
/** Column name LoadPeriod_ID */
public static final String COLUMNNAME_LoadPeriod_ID = "LoadPeriod_ID";
/** Set Cost Element.
@param M_CostElement_ID Product Cost Element */
public void setM_CostElement_ID (int M_CostElement_ID)
{
if (M_CostElement_ID <= 0) set_Value (COLUMNNAME_M_CostElement_ID, null);
 else 
set_Value (COLUMNNAME_M_CostElement_ID, Integer.valueOf(M_CostElement_ID));
}
/** Get Cost Element.
@return Product Cost Element */
public int getM_CostElement_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_CostElement_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f5dd4c73-8aa8-4f04-8b27-a582f3eef79c")
public static String es_PE_COLUMN_M_CostElement_ID_Name="Cost Element";

@XendraColumn(AD_Element_ID="1b5355ae-f799-dbe3-d07b-17cb2162e976",ColumnName="M_CostElement_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f5dd4c73-8aa8-4f04-8b27-a582f3eef79c",
Synchronized="2019-08-30 22:23:16.0")
/** Column name M_CostElement_ID */
public static final String COLUMNNAME_M_CostElement_ID = "M_CostElement_ID";
/** Set Phys.Inventory.
@param M_Inventory_ID Parameters for a Physical Inventory */
public void setM_Inventory_ID (int M_Inventory_ID)
{
if (M_Inventory_ID <= 0) set_Value (COLUMNNAME_M_Inventory_ID, null);
 else 
set_Value (COLUMNNAME_M_Inventory_ID, Integer.valueOf(M_Inventory_ID));
}
/** Get Phys.Inventory.
@return Parameters for a Physical Inventory */
public int getM_Inventory_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Inventory_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="97ec0594-f00a-461e-828d-eebac444a125")
public static String es_PE_FIELD_MaterialPolicy_PhysInventory_Name="Inventario Físico";

@XendraTrl(Identifier="97ec0594-f00a-461e-828d-eebac444a125")
public static String es_PE_FIELD_MaterialPolicy_PhysInventory_Description="Parámetros para el inventario físico.";

@XendraTrl(Identifier="97ec0594-f00a-461e-828d-eebac444a125")
public static String es_PE_FIELD_MaterialPolicy_PhysInventory_Help="El inventario físico indica parámetros únicos para el inventario físico.";

@XendraField(AD_Column_ID="M_Inventory_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c36a1379-55e7-4870-b786-ecb2b1b395a6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-06-26 17:10:56.0",
Identifier="97ec0594-f00a-461e-828d-eebac444a125")
public static final String FIELDNAME_MaterialPolicy_PhysInventory="97ec0594-f00a-461e-828d-eebac444a125";

@XendraTrl(Identifier="1c189f72-3f42-4f0c-abb7-00ffaf79713c")
public static String es_PE_COLUMN_M_Inventory_ID_Name="Phys.Inventory";

@XendraColumn(AD_Element_ID="0e8f85f3-fbb2-f347-b412-2f2218e14665",ColumnName="M_Inventory_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1c189f72-3f42-4f0c-abb7-00ffaf79713c",
Synchronized="2019-08-30 22:23:16.0")
/** Column name M_Inventory_ID */
public static final String COLUMNNAME_M_Inventory_ID = "M_Inventory_ID";
/** Set Material Policy.
@param M_MaterialPolicy_ID Material Policy */
public void setM_MaterialPolicy_ID (int M_MaterialPolicy_ID)
{
if (M_MaterialPolicy_ID < 1) throw new IllegalArgumentException ("M_MaterialPolicy_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_MaterialPolicy_ID, Integer.valueOf(M_MaterialPolicy_ID));
}
/** Get Material Policy.
@return Material Policy */
public int getM_MaterialPolicy_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_MaterialPolicy_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7aa74e0e-38c3-446c-9fa9-61f61b0ab71a")
public static String es_PE_FIELD_MaterialPolicy_MaterialPolicy_Name="Material Policy";

@XendraField(AD_Column_ID="M_MaterialPolicy_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c36a1379-55e7-4870-b786-ecb2b1b395a6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-08-09 11:40:44.0",
Identifier="7aa74e0e-38c3-446c-9fa9-61f61b0ab71a")
public static final String FIELDNAME_MaterialPolicy_MaterialPolicy="7aa74e0e-38c3-446c-9fa9-61f61b0ab71a";
/** Column name M_MaterialPolicy_ID */
public static final String COLUMNNAME_M_MaterialPolicy_ID = "M_MaterialPolicy_ID";
/** Set Material Processor.
@param M_MaterialProcessor_ID Material Processor */
public void setM_MaterialProcessor_ID (int M_MaterialProcessor_ID)
{
if (M_MaterialProcessor_ID <= 0) set_Value (COLUMNNAME_M_MaterialProcessor_ID, null);
 else 
set_Value (COLUMNNAME_M_MaterialProcessor_ID, Integer.valueOf(M_MaterialProcessor_ID));
}
/** Get Material Processor.
@return Material Processor */
public int getM_MaterialProcessor_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_MaterialProcessor_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="94e5cff1-6ba0-4657-b21b-20882448efb3")
public static String es_PE_COLUMN_M_MaterialProcessor_ID_Name="Material Processor";

@XendraColumn(AD_Element_ID="e22a780c-073e-4226-9c5c-59d70068d2a1",
ColumnName="M_MaterialProcessor_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="94e5cff1-6ba0-4657-b21b-20882448efb3",Synchronized="2019-08-30 22:23:16.0")
/** Column name M_MaterialProcessor_ID */
public static final String COLUMNNAME_M_MaterialProcessor_ID = "M_MaterialProcessor_ID";
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

@XendraTrl(Identifier="5e6e59eb-e43a-4179-bd7a-1a645f9a4dfd")
public static String es_PE_FIELD_MaterialPolicy_Name_Name="Nombre";

@XendraTrl(Identifier="5e6e59eb-e43a-4179-bd7a-1a645f9a4dfd")
public static String es_PE_FIELD_MaterialPolicy_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="5e6e59eb-e43a-4179-bd7a-1a645f9a4dfd")
public static String es_PE_FIELD_MaterialPolicy_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="c36a1379-55e7-4870-b786-ecb2b1b395a6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-08-09 11:40:44.0",
Identifier="5e6e59eb-e43a-4179-bd7a-1a645f9a4dfd")
public static final String FIELDNAME_MaterialPolicy_Name="5e6e59eb-e43a-4179-bd7a-1a645f9a4dfd";

@XendraTrl(Identifier="3cfd7c71-91cb-4b95-b358-5f7462d24adb")
public static String es_PE_COLUMN_Name_Name="Name";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3cfd7c71-91cb-4b95-b358-5f7462d24adb",
Synchronized="2019-08-30 22:23:16.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set ProcessPeriod_ID.
@param ProcessPeriod_ID ProcessPeriod_ID */
public void setProcessPeriod_ID (int ProcessPeriod_ID)
{
if (ProcessPeriod_ID <= 0) set_Value (COLUMNNAME_ProcessPeriod_ID, null);
 else 
set_Value (COLUMNNAME_ProcessPeriod_ID, Integer.valueOf(ProcessPeriod_ID));
}
/** Get ProcessPeriod_ID.
@return ProcessPeriod_ID */
public int getProcessPeriod_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_ProcessPeriod_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="be143441-6346-4c57-ad54-12ab669c7397")
public static String es_PE_COLUMN_ProcessPeriod_ID_Name="processperiod_id";

@XendraColumn(AD_Element_ID="80c7c67e-ac46-403d-9ee1-a9d4555a3605",ColumnName="ProcessPeriod_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="be143441-6346-4c57-ad54-12ab669c7397",
Synchronized="2019-08-30 22:23:16.0")
/** Column name ProcessPeriod_ID */
public static final String COLUMNNAME_ProcessPeriod_ID = "ProcessPeriod_ID";
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

@XendraTrl(Identifier="afbb3850-3ab4-450a-b53a-97be13cc6bf4")
public static String es_PE_FIELD_MaterialPolicy_Properties_Name="Properties";

@XendraField(AD_Column_ID="Properties",IsCentrallyMaintained=true,
AD_Tab_ID="c36a1379-55e7-4870-b786-ecb2b1b395a6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-08-09 11:40:44.0",
Identifier="afbb3850-3ab4-450a-b53a-97be13cc6bf4")
public static final String FIELDNAME_MaterialPolicy_Properties="afbb3850-3ab4-450a-b53a-97be13cc6bf4";

@XendraTrl(Identifier="8641ba75-d072-4573-87e4-1393550d61da")
public static String es_PE_COLUMN_Properties_Name="Properties";

@XendraColumn(AD_Element_ID="acc3987b-292c-475a-86b5-5104970a96f3",ColumnName="Properties",
AD_Reference_ID=46,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8641ba75-d072-4573-87e4-1393550d61da",
Synchronized="2019-08-30 22:23:16.0")
/** Column name Properties */
public static final String COLUMNNAME_Properties = "Properties";
/** Set Start Date.
@param StartDate First effective day (inclusive) */
public void setStartDate (Timestamp StartDate)
{
set_Value (COLUMNNAME_StartDate, StartDate);
}
/** Get Start Date.
@return First effective day (inclusive) */
public Timestamp getStartDate() 
{
return (Timestamp)get_Value(COLUMNNAME_StartDate);
}

@XendraTrl(Identifier="e325ac0f-3bdd-4d84-9b3e-5337e1713eb3")
public static String es_PE_FIELD_MaterialPolicy_StartDate_Name="Fecha de Inicio";

@XendraTrl(Identifier="e325ac0f-3bdd-4d84-9b3e-5337e1713eb3")
public static String es_PE_FIELD_MaterialPolicy_StartDate_Description="Primer día efectivo (inclusive)";

@XendraTrl(Identifier="e325ac0f-3bdd-4d84-9b3e-5337e1713eb3")
public static String es_PE_FIELD_MaterialPolicy_StartDate_Help="La fecha de Inicio indica la primera fecha ó fecha inicial de un rango";

@XendraField(AD_Column_ID="StartDate",IsCentrallyMaintained=true,
AD_Tab_ID="c36a1379-55e7-4870-b786-ecb2b1b395a6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=29,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-08-09 11:40:44.0",
Identifier="e325ac0f-3bdd-4d84-9b3e-5337e1713eb3")
public static final String FIELDNAME_MaterialPolicy_StartDate="e325ac0f-3bdd-4d84-9b3e-5337e1713eb3";

@XendraTrl(Identifier="3281e04a-5ec9-4fc5-b1d5-2f5da142ef5a")
public static String es_PE_COLUMN_StartDate_Name="Start Date";

@XendraColumn(AD_Element_ID="3fe42406-cab3-a569-bf0b-3614f5d95711",ColumnName="StartDate",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3281e04a-5ec9-4fc5-b1d5-2f5da142ef5a",
Synchronized="2019-08-30 22:23:16.0")
/** Column name StartDate */
public static final String COLUMNNAME_StartDate = "StartDate";
/** Set Synchronized.
@param Synchronized Synchronized */
public void setSynchronized (boolean Synchronized)
{
set_Value (COLUMNNAME_Synchronized, Boolean.valueOf(Synchronized));
}
/** Get Synchronized.
@return Synchronized */
public boolean isSynchronized() 
{
Object oo = get_Value(COLUMNNAME_Synchronized);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="554c4fc1-207e-4ceb-b45e-e124a1c2a36c")
public static String es_PE_FIELD_MaterialPolicy_Synchronized_Name="Synchronized";

@XendraField(AD_Column_ID="Synchronized",IsCentrallyMaintained=true,
AD_Tab_ID="c36a1379-55e7-4870-b786-ecb2b1b395a6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-06-26 17:10:57.0",
Identifier="554c4fc1-207e-4ceb-b45e-e124a1c2a36c")
public static final String FIELDNAME_MaterialPolicy_Synchronized="554c4fc1-207e-4ceb-b45e-e124a1c2a36c";

@XendraTrl(Identifier="8b138cc9-b84f-4db2-ba7c-de861b0d88f9")
public static String es_PE_COLUMN_Synchronized_Name="Synchronized";

@XendraColumn(AD_Element_ID="08f1e976-ceeb-f830-9d75-bf94f13a98ce",ColumnName="Synchronized",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8b138cc9-b84f-4db2-ba7c-de861b0d88f9",
Synchronized="2019-08-30 22:23:16.0")
/** Column name Synchronized */
public static final String COLUMNNAME_Synchronized = "Synchronized";
/** Set TransferenceRule_ID.
@param TransferenceRule_ID TransferenceRule_ID */
public void setTransferenceRule_ID (int TransferenceRule_ID)
{
if (TransferenceRule_ID <= 0) set_Value (COLUMNNAME_TransferenceRule_ID, null);
 else 
set_Value (COLUMNNAME_TransferenceRule_ID, Integer.valueOf(TransferenceRule_ID));
}
/** Get TransferenceRule_ID.
@return TransferenceRule_ID */
public int getTransferenceRule_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_TransferenceRule_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0c5fdfe6-cbf5-4383-a6e9-a78289a7d57f")
public static String es_PE_FIELD_MaterialPolicy_TransferenceRule_ID_Name="transferencerule_id";

@XendraField(AD_Column_ID="TransferenceRule_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c36a1379-55e7-4870-b786-ecb2b1b395a6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-06-26 17:10:57.0",
Identifier="0c5fdfe6-cbf5-4383-a6e9-a78289a7d57f")
public static final String FIELDNAME_MaterialPolicy_TransferenceRule_ID="0c5fdfe6-cbf5-4383-a6e9-a78289a7d57f";

@XendraTrl(Identifier="a26318c2-4243-4228-b5c4-cc54af905ffe")
public static String es_PE_COLUMN_TransferenceRule_ID_Name="transferencerule_id";

@XendraColumn(AD_Element_ID="b6637d43-24c7-487a-8a36-9e0bad2dfe59",
ColumnName="TransferenceRule_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="1b6b7fa4-6b3f-164d-6151-85d9a2225bea",AD_Val_Rule_ID="",FieldLength=10,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="a26318c2-4243-4228-b5c4-cc54af905ffe",
Synchronized="2019-08-30 22:23:16.0")
/** Column name TransferenceRule_ID */
public static final String COLUMNNAME_TransferenceRule_ID = "TransferenceRule_ID";
}
