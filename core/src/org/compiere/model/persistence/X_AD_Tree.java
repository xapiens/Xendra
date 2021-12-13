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
/** Generated Model for AD_Tree
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Tree extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Tree_ID id
@param trxName transaction
*/
public X_AD_Tree (Properties ctx, int AD_Tree_ID, String trxName)
{
super (ctx, AD_Tree_ID, trxName);
/** if (AD_Tree_ID == 0)
{
setAD_Tree_ID (0);
setIsAllNodes (false);	
// N
setIsDefault (false);	
// N
setName (null);
setTreeType (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Tree (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=288 */
public static int Table_ID=MTable.getTable_ID("AD_Tree");

@XendraTrl(Identifier="b0445d99-8420-e4da-9c7d-28f9bb02bf87")
public static String es_PE_TAB_Tree_Description="Árbol";

@XendraTrl(Identifier="b0445d99-8420-e4da-9c7d-28f9bb02bf87")
public static String es_PE_TAB_Tree_Help="La pestaña de Árbol define un árbol para ser desplegado.";

@XendraTrl(Identifier="b0445d99-8420-e4da-9c7d-28f9bb02bf87")
public static String es_PE_TAB_Tree_Name="Árbol";
@XendraTab(Name="Tree",Description="Tree",
Help="The Tree Tab defines a Tree which will be displayed.",
AD_Window_ID="e5ab57a5-031c-30cd-d103-818fda714551",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="b0445d99-8420-e4da-9c7d-28f9bb02bf87",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Tree="b0445d99-8420-e4da-9c7d-28f9bb02bf87";

@XendraTrl(Identifier="fb0b9a25-69cc-e1d5-f9d8-4baee6f02cec")
public static String es_PE_TABLE_AD_Tree_Name="Árbol";

@XendraTable(Name="Tree",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Identifies a Tree",Help="",
TableName="AD_Tree",AccessLevel="6",AD_Window_ID="e5ab57a5-031c-30cd-d103-818fda714551",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=90,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="fb0b9a25-69cc-e1d5-f9d8-4baee6f02cec",Synchronized="2020-03-03 21:36:02.0")
/** TableName=AD_Tree */
public static final String Table_Name="AD_Tree";


@XendraIndex(Name="ad_tree_name",Identifier="e36ee91c-8837-4b0b-cd75-8628b491b8e9",
Column_Names="ad_client_id, name",IsUnique="true",
TableIdentifier="e36ee91c-8837-4b0b-cd75-8628b491b8e9",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_ad_tree_name = "e36ee91c-8837-4b0b-cd75-8628b491b8e9";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Tree");

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
    Table_ID = MTable.getTable_ID("AD_Tree");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Tree[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Tree.
@param AD_Tree_ID Identifies a Tree */
public void setAD_Tree_ID (int AD_Tree_ID)
{
if (AD_Tree_ID < 1) throw new IllegalArgumentException ("AD_Tree_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Tree_ID, Integer.valueOf(AD_Tree_ID));
}
/** Get Tree.
@return Identifies a Tree */
public int getAD_Tree_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Tree_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1a9a3f6b-17c2-f1c0-2303-c7199c62a2b0")
public static String es_PE_FIELD_Tree_Tree_Name="Árbol";

@XendraTrl(Identifier="1a9a3f6b-17c2-f1c0-2303-c7199c62a2b0")
public static String es_PE_FIELD_Tree_Tree_Description="Identifica un árbol";

@XendraTrl(Identifier="1a9a3f6b-17c2-f1c0-2303-c7199c62a2b0")
public static String es_PE_FIELD_Tree_Tree_Help="El campo árbol identifica un árbol único en el sistema. Los árboles definen niveles sumarios o de roll up de información. Son usados en Informes para definir niveles de sumarización y puntos del Informe";

@XendraField(AD_Column_ID="AD_Tree_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b0445d99-8420-e4da-9c7d-28f9bb02bf87",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1a9a3f6b-17c2-f1c0-2303-c7199c62a2b0")
public static final String FIELDNAME_Tree_Tree="1a9a3f6b-17c2-f1c0-2303-c7199c62a2b0";
/** Column name AD_Tree_ID */
public static final String COLUMNNAME_AD_Tree_ID = "AD_Tree_ID";
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

@XendraTrl(Identifier="bc2a1320-3d90-dcaf-6623-32a4511372e2")
public static String es_PE_FIELD_Tree_Description_Name="Observación";

@XendraTrl(Identifier="bc2a1320-3d90-dcaf-6623-32a4511372e2")
public static String es_PE_FIELD_Tree_Description_Description="Observación";

@XendraTrl(Identifier="bc2a1320-3d90-dcaf-6623-32a4511372e2")
public static String es_PE_FIELD_Tree_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="b0445d99-8420-e4da-9c7d-28f9bb02bf87",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bc2a1320-3d90-dcaf-6623-32a4511372e2")
public static final String FIELDNAME_Tree_Description="bc2a1320-3d90-dcaf-6623-32a4511372e2";

@XendraTrl(Identifier="723ef6ba-5d0c-c5bb-6ff8-cf36941262cb")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="723ef6ba-5d0c-c5bb-6ff8-cf36941262cb",
Synchronized="2019-08-30 22:20:45.0")
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
@XendraTrl(Identifier="8e1b68a1-5323-4aaa-9886-4f9b8f21fb94")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8e1b68a1-5323-4aaa-9886-4f9b8f21fb94",
Synchronized="2019-08-30 22:20:45.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set All Nodes.
@param IsAllNodes All Nodes are included (Complete Tree) */
public void setIsAllNodes (boolean IsAllNodes)
{
set_Value (COLUMNNAME_IsAllNodes, Boolean.valueOf(IsAllNodes));
}
/** Get All Nodes.
@return All Nodes are included (Complete Tree) */
public boolean isAllNodes() 
{
Object oo = get_Value(COLUMNNAME_IsAllNodes);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="a2e8dc32-018d-cdc7-d6b4-54d44542bbce")
public static String es_PE_FIELD_Tree_AllNodes_Name="Todos los nodos";

@XendraTrl(Identifier="a2e8dc32-018d-cdc7-d6b4-54d44542bbce")
public static String es_PE_FIELD_Tree_AllNodes_Description="Todos los nodos son incluidos";

@XendraField(AD_Column_ID="IsAllNodes",IsCentrallyMaintained=true,
AD_Tab_ID="b0445d99-8420-e4da-9c7d-28f9bb02bf87",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a2e8dc32-018d-cdc7-d6b4-54d44542bbce")
public static final String FIELDNAME_Tree_AllNodes="a2e8dc32-018d-cdc7-d6b4-54d44542bbce";

@XendraTrl(Identifier="990ec974-e541-56a0-7ee2-66201d0086f2")
public static String es_PE_COLUMN_IsAllNodes_Name="Todos los nodos";

@XendraColumn(AD_Element_ID="8a08ac63-c3f6-69a8-7427-8684726a64f3",ColumnName="IsAllNodes",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="990ec974-e541-56a0-7ee2-66201d0086f2",
Synchronized="2019-08-30 22:20:45.0")
/** Column name IsAllNodes */
public static final String COLUMNNAME_IsAllNodes = "IsAllNodes";
/** Set Default.
@param IsDefault Default value */
public void setIsDefault (boolean IsDefault)
{
set_Value (COLUMNNAME_IsDefault, Boolean.valueOf(IsDefault));
}
/** Get Default.
@return Default value */
public boolean isDefault() 
{
Object oo = get_Value(COLUMNNAME_IsDefault);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="f1f19be1-94fb-f284-18f2-62427e22426d")
public static String es_PE_FIELD_Tree_Default_Name="Predeterminado";

@XendraTrl(Identifier="f1f19be1-94fb-f284-18f2-62427e22426d")
public static String es_PE_FIELD_Tree_Default_Description="Valor Predeterminado";

@XendraTrl(Identifier="f1f19be1-94fb-f284-18f2-62427e22426d")
public static String es_PE_FIELD_Tree_Default_Help="El cuadro de verificación indica si este registro será usado como un valor predeterminado";

@XendraField(AD_Column_ID="IsDefault",IsCentrallyMaintained=true,
AD_Tab_ID="b0445d99-8420-e4da-9c7d-28f9bb02bf87",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsAllNodes@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f1f19be1-94fb-f284-18f2-62427e22426d")
public static final String FIELDNAME_Tree_Default="f1f19be1-94fb-f284-18f2-62427e22426d";

@XendraTrl(Identifier="1ca37e73-5dba-d62e-0b06-abbb7980da71")
public static String es_PE_COLUMN_IsDefault_Name="Predeterminado";

@XendraColumn(AD_Element_ID="8617f892-e113-a5fd-8715-687f792f136c",ColumnName="IsDefault",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1ca37e73-5dba-d62e-0b06-abbb7980da71",
Synchronized="2019-08-30 22:20:45.0")
/** Column name IsDefault */
public static final String COLUMNNAME_IsDefault = "IsDefault";
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

@XendraTrl(Identifier="34028593-a9a9-a7ca-0420-9380e9e75170")
public static String es_PE_FIELD_Tree_Name_Name="Nombre";

@XendraTrl(Identifier="34028593-a9a9-a7ca-0420-9380e9e75170")
public static String es_PE_FIELD_Tree_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="34028593-a9a9-a7ca-0420-9380e9e75170")
public static String es_PE_FIELD_Tree_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="b0445d99-8420-e4da-9c7d-28f9bb02bf87",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="34028593-a9a9-a7ca-0420-9380e9e75170")
public static final String FIELDNAME_Tree_Name="34028593-a9a9-a7ca-0420-9380e9e75170";

@XendraTrl(Identifier="f703aa3f-d81c-ca8a-fde6-dd4d5b7b0eee")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f703aa3f-d81c-ca8a-fde6-dd4d5b7b0eee",
Synchronized="2019-08-30 22:20:45.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Process Now.
@param Processing Process Now */
public void setProcessing (boolean Processing)
{
set_Value (COLUMNNAME_Processing, Boolean.valueOf(Processing));
}
/** Get Process Now.
@return Process Now */
public boolean isProcessing() 
{
Object oo = get_Value(COLUMNNAME_Processing);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="f9794ce7-8514-4fa2-f0d9-d30f25a87725")
public static String es_PE_FIELD_Tree_ProcessNow_Name="Verifica Árbol";

@XendraTrl(Identifier="f9794ce7-8514-4fa2-f0d9-d30f25a87725")
public static String es_PE_FIELD_Tree_ProcessNow_Description="Verifique la corrección y lo completo del árbol";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="b0445d99-8420-e4da-9c7d-28f9bb02bf87",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f9794ce7-8514-4fa2-f0d9-d30f25a87725")
public static final String FIELDNAME_Tree_ProcessNow="f9794ce7-8514-4fa2-f0d9-d30f25a87725";

@XendraTrl(Identifier="befee93a-bde4-e3d7-70ef-d42188699411")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="321d429e-3a54-bbac-425b-2f8b9650657f",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="befee93a-bde4-e3d7-70ef-d42188699411",Synchronized="2019-08-30 22:20:45.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Type | Area.
@param TreeType Element this tree is built on (i.e Product, Business Partner) */
public void setTreeType (String TreeType)
{
if (TreeType.length() > 2)
{
log.warning("Length > 2 - truncated");
TreeType = TreeType.substring(0,1);
}
set_ValueNoCheck (COLUMNNAME_TreeType, TreeType);
}
/** Get Type | Area.
@return Element this tree is built on (i.e Product, Business Partner) */
public String getTreeType() 
{
return (String)get_Value(COLUMNNAME_TreeType);
}

@XendraTrl(Identifier="f53e75e7-a500-4cb6-8427-16d147d9b396")
public static String es_PE_FIELD_Tree_TypeArea_Name="Tipo / Área";

@XendraTrl(Identifier="f53e75e7-a500-4cb6-8427-16d147d9b396")
public static String es_PE_FIELD_Tree_TypeArea_Description="Elemento del que este árbol está construido (Ej. Producto; Socio de Negocio)";

@XendraTrl(Identifier="f53e75e7-a500-4cb6-8427-16d147d9b396")
public static String es_PE_FIELD_Tree_TypeArea_Help="El campo Tipo de Árbol / Área determina el tipo de este árbol. Por Ej. Usted puede definir un árbol para sus productos y otro árbol para sus socios de negocio.";

@XendraField(AD_Column_ID="TreeType",IsCentrallyMaintained=true,
AD_Tab_ID="b0445d99-8420-e4da-9c7d-28f9bb02bf87",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f53e75e7-a500-4cb6-8427-16d147d9b396")
public static final String FIELDNAME_Tree_TypeArea="f53e75e7-a500-4cb6-8427-16d147d9b396";

@XendraTrl(Identifier="0e7c13eb-46ab-2820-c67a-6868b7a999ef")
public static String es_PE_COLUMN_TreeType_Name="Tipo / Área";

@XendraColumn(AD_Element_ID="67ef8299-b488-7928-5d82-c916c3603bc1",ColumnName="TreeType",
AD_Reference_ID=17,AD_Reference_Value_ID="0860f346-1ab3-c4d9-3364-a5d1e32d4d6a",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0e7c13eb-46ab-2820-c67a-6868b7a999ef",Synchronized="2019-08-30 22:20:45.0")
/** Column name TreeType */
public static final String COLUMNNAME_TreeType = "TreeType";
}
