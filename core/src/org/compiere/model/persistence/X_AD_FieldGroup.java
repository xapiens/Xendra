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
import org.compiere.model.reference.REF_AD_FieldGroup;
/** Generated Model for AD_FieldGroup
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_FieldGroup extends PO
{
/** Standard Constructor
@param ctx context
@param AD_FieldGroup_ID id
@param trxName transaction
*/
public X_AD_FieldGroup (Properties ctx, int AD_FieldGroup_ID, String trxName)
{
super (ctx, AD_FieldGroup_ID, trxName);
/** if (AD_FieldGroup_ID == 0)
{
setAD_FieldGroup_ID (0);
setEntityType (null);	
// U
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_FieldGroup (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=414 */
public static int Table_ID=MTable.getTable_ID("AD_FieldGroup");

@XendraTrl(Identifier="22887d1b-493d-4e64-d9b4-5dbb2e7c01b7")
public static String es_PE_TAB_FieldGroup_Description="Para uso del administrador del sistema solamente. Grupos de Campo permiten agrupar campos dentro de una ventana";

@XendraTrl(Identifier="22887d1b-493d-4e64-d9b4-5dbb2e7c01b7")
public static String es_PE_TAB_FieldGroup_Name="Grupo de Campo";
@XendraTab(Name="Field group",
Description="System Admin use only.  Field Groups allow for grouping of fields within a window",
Help="",AD_Window_ID="ec8e87ca-2973-deb6-7690-893c4300757b",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="22887d1b-493d-4e64-d9b4-5dbb2e7c01b7",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_FieldGroup="22887d1b-493d-4e64-d9b4-5dbb2e7c01b7";

@XendraTrl(Identifier="e48ac167-00b3-e2d7-bb32-282e0f6ed7b7")
public static String es_PE_TABLE_AD_FieldGroup_Name="Grupo del Campo";

@XendraTable(Name="Field Group",Description="Logical grouping of fields",Help="",
TableName="AD_FieldGroup",AccessLevel="4",AD_Window_ID="ec8e87ca-2973-deb6-7690-893c4300757b",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=135,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="e48ac167-00b3-e2d7-bb32-282e0f6ed7b7",Synchronized="2017-08-16 11:40:14.0")
/** TableName=AD_FieldGroup */
public static final String Table_Name="AD_FieldGroup";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_FieldGroup");

protected BigDecimal accessLevel = BigDecimal.valueOf(4);
/** AccessLevel
@return 4 - System 
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
    Table_ID = MTable.getTable_ID("AD_FieldGroup");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_FieldGroup[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Field Group.
@param AD_FieldGroup_ID Logical grouping of fields */
public void setAD_FieldGroup_ID (int AD_FieldGroup_ID)
{
if (AD_FieldGroup_ID < 1) throw new IllegalArgumentException ("AD_FieldGroup_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_FieldGroup_ID, Integer.valueOf(AD_FieldGroup_ID));
}
/** Get Field Group.
@return Logical grouping of fields */
public int getAD_FieldGroup_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_FieldGroup_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6b4bb84b-f982-705a-e6f6-b102cc46a5a5")
public static String es_PE_FIELD_FieldGroup_FieldGroup_Description="Agrupación Lógica del campo";

@XendraTrl(Identifier="6b4bb84b-f982-705a-e6f6-b102cc46a5a5")
public static String es_PE_FIELD_FieldGroup_FieldGroup_Help="El grupo del campo indica el grupo lógico al que este campo pertenece (Historia; Totales; Cantidades)";

@XendraTrl(Identifier="6b4bb84b-f982-705a-e6f6-b102cc46a5a5")
public static String es_PE_FIELD_FieldGroup_FieldGroup_Name="Grupo del Campo";

@XendraField(AD_Column_ID="AD_FieldGroup_ID",IsCentrallyMaintained=true,
AD_Tab_ID="22887d1b-493d-4e64-d9b4-5dbb2e7c01b7",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6b4bb84b-f982-705a-e6f6-b102cc46a5a5")
public static final String FIELDNAME_FieldGroup_FieldGroup="6b4bb84b-f982-705a-e6f6-b102cc46a5a5";
/** Column name AD_FieldGroup_ID */
public static final String COLUMNNAME_AD_FieldGroup_ID = "AD_FieldGroup_ID";

/** EntityType AD_Reference=fae4ad31-8ff1-5d5c-8d47-2426c541cd74 */
public static final int ENTITYTYPE_AD_Reference_ID=389;
/** Set Entity Type.
@param EntityType Dictionary Entity Type: Determines ownership and synchronization */
public void setEntityType (String EntityType)
{
if (EntityType.length() > 4)
{
log.warning("Length > 4 - truncated");
EntityType = EntityType.substring(0,3);
}
set_Value (COLUMNNAME_EntityType, EntityType);
}
/** Get Entity Type.
@return Dictionary Entity Type: Determines ownership and synchronization */
public String getEntityType() 
{
return (String)get_Value(COLUMNNAME_EntityType);
}

@XendraTrl(Identifier="d724d747-4678-ba55-d4ef-5298c6bec576")
public static String es_PE_FIELD_FieldGroup_EntityType_Description="Tipo de Entidad Diccionario; determina propiedad y sincronización";

@XendraTrl(Identifier="d724d747-4678-ba55-d4ef-5298c6bec576")
public static String es_PE_FIELD_FieldGroup_EntityType_Help="Los tipos de entidad \"Diccionario\"; \"Adempiere\"; y \"Aplicación\" podrían ser automáticamente sincronizados y las personalizaciones eliminadas ó sobreescritas";

@XendraTrl(Identifier="d724d747-4678-ba55-d4ef-5298c6bec576")
public static String es_PE_FIELD_FieldGroup_EntityType_Name="Tipo de Entidad";

@XendraField(AD_Column_ID="EntityType",IsCentrallyMaintained=true,
AD_Tab_ID="22887d1b-493d-4e64-d9b4-5dbb2e7c01b7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d724d747-4678-ba55-d4ef-5298c6bec576")
public static final String FIELDNAME_FieldGroup_EntityType="d724d747-4678-ba55-d4ef-5298c6bec576";

@XendraTrl(Identifier="668aad9b-e4e6-c932-4937-5c03eaca74ff")
public static String es_PE_COLUMN_EntityType_Name="Tipo de Entidad";

@XendraColumn(AD_Element_ID="5ba917bf-871c-6f19-aa50-962adc5de558",ColumnName="EntityType",
AD_Reference_ID=18,AD_Reference_Value_ID="fae4ad31-8ff1-5d5c-8d47-2426c541cd74",AD_Val_Rule_ID="",
FieldLength=4,DefaultValue="U",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="@EntityType@=D",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="668aad9b-e4e6-c932-4937-5c03eaca74ff",Synchronized="2017-08-05 16:52:31.0")
/** Column name EntityType */
public static final String COLUMNNAME_EntityType = "EntityType";

/** FieldGroupType AD_Reference=2facbaf0-81ba-f4b5-7557-afda96edfe71 */
public static final int FIELDGROUPTYPE_AD_Reference_ID=53000;
/** Set Field Group Type.
@param FieldGroupType Field Group Type */
public void setFieldGroupType (String FieldGroupType)
{
if (FieldGroupType == null || FieldGroupType.equals(REF_AD_FieldGroup.Collapse) || FieldGroupType.equals(REF_AD_FieldGroup.Tab) || FieldGroupType.equals(REF_AD_FieldGroup.Label));
 else throw new IllegalArgumentException ("FieldGroupType Invalid value - " + FieldGroupType + " - Reference_ID=53000 - C - T - L");
if (FieldGroupType != null && FieldGroupType.length() > 10)
{
log.warning("Length > 10 - truncated");
FieldGroupType = FieldGroupType.substring(0,9);
}
set_Value (COLUMNNAME_FieldGroupType, FieldGroupType);
}
/** Get Field Group Type.
@return Field Group Type */
public String getFieldGroupType() 
{
return (String)get_Value(COLUMNNAME_FieldGroupType);
}

@XendraTrl(Identifier="d7f91a97-4e4a-7789-ee1e-1f7fb4d8ec9b")
public static String es_PE_FIELD_FieldGroup_FieldGroupType_Name="Field Group Type";

@XendraField(AD_Column_ID="FieldGroupType",IsCentrallyMaintained=true,
AD_Tab_ID="22887d1b-493d-4e64-d9b4-5dbb2e7c01b7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d7f91a97-4e4a-7789-ee1e-1f7fb4d8ec9b")
public static final String FIELDNAME_FieldGroup_FieldGroupType="d7f91a97-4e4a-7789-ee1e-1f7fb4d8ec9b";

@XendraTrl(Identifier="091fd948-9b9e-79bb-4ff4-99aa9ae308d3")
public static String es_PE_COLUMN_FieldGroupType_Name="Field Group Type";

@XendraColumn(AD_Element_ID="220fcef1-5a8e-0a4f-bd93-912136d357c9",ColumnName="FieldGroupType",
AD_Reference_ID=17,AD_Reference_Value_ID="2facbaf0-81ba-f4b5-7557-afda96edfe71",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="091fd948-9b9e-79bb-4ff4-99aa9ae308d3",Synchronized="2017-08-05 16:52:31.0")
/** Column name FieldGroupType */
public static final String COLUMNNAME_FieldGroupType = "FieldGroupType";
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
@XendraTrl(Identifier="10d8e540-5d87-4107-b97f-2e6541ab5d30")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="10d8e540-5d87-4107-b97f-2e6541ab5d30",
Synchronized="2017-08-05 16:52:31.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set IsCollapsedByDefault.
@param IsCollapsedByDefault IsCollapsedByDefault */
public void setIsCollapsedByDefault (boolean IsCollapsedByDefault)
{
set_Value (COLUMNNAME_IsCollapsedByDefault, Boolean.valueOf(IsCollapsedByDefault));
}
/** Get IsCollapsedByDefault.
@return IsCollapsedByDefault */
public boolean isCollapsedByDefault() 
{
Object oo = get_Value(COLUMNNAME_IsCollapsedByDefault);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="3d90a508-4bed-01c8-e353-7c090d12c64d")
public static String es_PE_COLUMN_IsCollapsedByDefault_Name="iscollapsedbydefault";

@XendraColumn(AD_Element_ID="51eea31f-a452-6a0c-0bd5-f81f5863b076",
ColumnName="IsCollapsedByDefault",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3d90a508-4bed-01c8-e353-7c090d12c64d",Synchronized="2017-08-05 16:52:31.0")
/** Column name IsCollapsedByDefault */
public static final String COLUMNNAME_IsCollapsedByDefault = "IsCollapsedByDefault";
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

@XendraTrl(Identifier="d3fd528c-b99c-5954-305f-2bad31d7cae0")
public static String es_PE_FIELD_FieldGroup_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="d3fd528c-b99c-5954-305f-2bad31d7cae0")
public static String es_PE_FIELD_FieldGroup_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="d3fd528c-b99c-5954-305f-2bad31d7cae0")
public static String es_PE_FIELD_FieldGroup_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="22887d1b-493d-4e64-d9b4-5dbb2e7c01b7",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="d3fd528c-b99c-5954-305f-2bad31d7cae0")
public static final String FIELDNAME_FieldGroup_Name="d3fd528c-b99c-5954-305f-2bad31d7cae0";

@XendraTrl(Identifier="f91692a9-26d4-9e3a-167d-95f1c53c412b")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f91692a9-26d4-9e3a-167d-95f1c53c412b",
Synchronized="2017-08-05 16:52:31.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
}
