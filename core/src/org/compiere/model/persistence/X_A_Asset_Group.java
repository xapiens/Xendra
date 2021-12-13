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
/** Generated Model for A_Asset_Group
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_A_Asset_Group extends PO
{
/** Standard Constructor
@param ctx context
@param A_Asset_Group_ID id
@param trxName transaction
*/
public X_A_Asset_Group (Properties ctx, int A_Asset_Group_ID, String trxName)
{
super (ctx, A_Asset_Group_ID, trxName);
/** if (A_Asset_Group_ID == 0)
{
setA_Asset_Group_ID (0);
setIsCreateAsActive (true);	
// Y
setIsDepreciated (false);	
// N
setIsOneAssetPerUOM (false);	
// N
setIsOwned (false);	
// N
setIsTrackIssues (false);	
// N
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_A_Asset_Group (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=542 */
public static int Table_ID=MTable.getTable_ID("A_Asset_Group");

@XendraTrl(Identifier="544fd379-fc68-f017-e5c1-f8eaa1859795")
public static String es_PE_TAB_AssetGroup_Description="Grupo de Activo";

@XendraTrl(Identifier="544fd379-fc68-f017-e5c1-f8eaa1859795")
public static String es_PE_TAB_AssetGroup_Help="El grupo de activos determina cuentas por default. Si un grupo del activo se selecciona en la categoría del producto, se crean los activos al entregar el activo";

@XendraTrl(Identifier="544fd379-fc68-f017-e5c1-f8eaa1859795")
public static String es_PE_TAB_AssetGroup_Name="Grupo de Activo";
@XendraTab(Name="Asset Group",
Description="Group of Assets",
Help="The group of assets determines default accounts.  If a asset group is selected in the product category, assets are created when delivering the asset.",
AD_Window_ID="10c3526d-badb-72f4-014e-1b797f940db0",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="544fd379-fc68-f017-e5c1-f8eaa1859795",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_AssetGroup="544fd379-fc68-f017-e5c1-f8eaa1859795";

@XendraTrl(Identifier="38bf807e-0516-77ee-5622-eee7146f1b72")
public static String es_PE_TABLE_A_Asset_Group_Name="Grupo de Activos";

@XendraTable(Name="Asset Group",AD_Package_ID="f42d3f39-06e2-bcd9-2954-27694ae45e5d",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Group of Assets",Help="",
TableName="A_Asset_Group",AccessLevel="3",AD_Window_ID="10c3526d-badb-72f4-014e-1b797f940db0",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=70,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.asset",
Identifier="38bf807e-0516-77ee-5622-eee7146f1b72",Synchronized="2020-03-03 21:34:50.0")
/** TableName=A_Asset_Group */
public static final String Table_Name="A_Asset_Group";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"A_Asset_Group");

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
    Table_ID = MTable.getTable_ID("A_Asset_Group");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_A_Asset_Group[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Asset Group.
@param A_Asset_Group_ID Group of Assets */
public void setA_Asset_Group_ID (int A_Asset_Group_ID)
{
if (A_Asset_Group_ID < 1) throw new IllegalArgumentException ("A_Asset_Group_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_A_Asset_Group_ID, Integer.valueOf(A_Asset_Group_ID));
}
/** Get Asset Group.
@return Group of Assets */
public int getA_Asset_Group_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_A_Asset_Group_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7cc7031f-70ed-6b6e-cca4-0006594c4895")
public static String es_PE_FIELD_AssetGroup_AssetGroup_Name="Grupo de Activos";

@XendraTrl(Identifier="7cc7031f-70ed-6b6e-cca4-0006594c4895")
public static String es_PE_FIELD_AssetGroup_AssetGroup_Description="Grupo de Activos";

@XendraTrl(Identifier="7cc7031f-70ed-6b6e-cca4-0006594c4895")
public static String es_PE_FIELD_AssetGroup_AssetGroup_Help="El grupo de activos determina cuentas por defaul. Si un grupo del activo se selecciona en la categoría de producto, se crean los activos al entregar el activo.";

@XendraField(AD_Column_ID="A_Asset_Group_ID",IsCentrallyMaintained=true,
AD_Tab_ID="544fd379-fc68-f017-e5c1-f8eaa1859795",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7cc7031f-70ed-6b6e-cca4-0006594c4895")
public static final String FIELDNAME_AssetGroup_AssetGroup="7cc7031f-70ed-6b6e-cca4-0006594c4895";
/** Column name A_Asset_Group_ID */
public static final String COLUMNNAME_A_Asset_Group_ID = "A_Asset_Group_ID";
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

@XendraTrl(Identifier="c352170a-f61c-3507-e4a1-85d2c886fbb2")
public static String es_PE_FIELD_AssetGroup_Description_Name="Observación";

@XendraTrl(Identifier="c352170a-f61c-3507-e4a1-85d2c886fbb2")
public static String es_PE_FIELD_AssetGroup_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="c352170a-f61c-3507-e4a1-85d2c886fbb2")
public static String es_PE_FIELD_AssetGroup_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="544fd379-fc68-f017-e5c1-f8eaa1859795",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c352170a-f61c-3507-e4a1-85d2c886fbb2")
public static final String FIELDNAME_AssetGroup_Description="c352170a-f61c-3507-e4a1-85d2c886fbb2";

@XendraTrl(Identifier="e7df4c3e-3299-0336-104c-abd96e6aca39")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e7df4c3e-3299-0336-104c-abd96e6aca39",
Synchronized="2020-03-03 21:34:17.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Comment/Help.
@param Help Comment or Hint */
public void setHelp (String Help)
{
set_Value (COLUMNNAME_Help, Help);
}
/** Get Comment/Help.
@return Comment or Hint */
public String getHelp() 
{
String value = (String)get_Value(COLUMNNAME_Help);
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

@XendraTrl(Identifier="9b04f460-cf24-09ce-6afa-32d4c271bd33")
public static String es_PE_FIELD_AssetGroup_CommentHelp_Name="Ayuda";

@XendraTrl(Identifier="9b04f460-cf24-09ce-6afa-32d4c271bd33")
public static String es_PE_FIELD_AssetGroup_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="9b04f460-cf24-09ce-6afa-32d4c271bd33")
public static String es_PE_FIELD_AssetGroup_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="544fd379-fc68-f017-e5c1-f8eaa1859795",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9b04f460-cf24-09ce-6afa-32d4c271bd33")
public static final String FIELDNAME_AssetGroup_CommentHelp="9b04f460-cf24-09ce-6afa-32d4c271bd33";

@XendraTrl(Identifier="92fbfdd4-c08f-5eea-b4aa-3ecd26ae13a5")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="92fbfdd4-c08f-5eea-b4aa-3ecd26ae13a5",
Synchronized="2020-03-03 21:34:17.0")
/** Column name Help */
public static final String COLUMNNAME_Help = "Help";
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
@XendraTrl(Identifier="22998494-c229-4022-974e-32b43e3d81e6")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="22998494-c229-4022-974e-32b43e3d81e6",
Synchronized="2020-03-03 21:34:17.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Create As Active.
@param IsCreateAsActive Create Asset and activate it */
public void setIsCreateAsActive (boolean IsCreateAsActive)
{
set_Value (COLUMNNAME_IsCreateAsActive, Boolean.valueOf(IsCreateAsActive));
}
/** Get Create As Active.
@return Create Asset and activate it */
public boolean isCreateAsActive() 
{
Object oo = get_Value(COLUMNNAME_IsCreateAsActive);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="991a75a6-8ebf-7f74-ce32-ef68f7d98e04")
public static String es_PE_FIELD_AssetGroup_CreateAsActive_Name="Crea como un Activo";

@XendraTrl(Identifier="991a75a6-8ebf-7f74-ce32-ef68f7d98e04")
public static String es_PE_FIELD_AssetGroup_CreateAsActive_Help="Usted puede considerar automáticamente para no hacer el activo activo, si usted necesita conseguir una cierta información adicional";

@XendraField(AD_Column_ID="IsCreateAsActive",IsCentrallyMaintained=true,
AD_Tab_ID="544fd379-fc68-f017-e5c1-f8eaa1859795",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="991a75a6-8ebf-7f74-ce32-ef68f7d98e04")
public static final String FIELDNAME_AssetGroup_CreateAsActive="991a75a6-8ebf-7f74-ce32-ef68f7d98e04";

@XendraTrl(Identifier="cd383e7f-72c4-2fc4-95fa-070e9599685a")
public static String es_PE_COLUMN_IsCreateAsActive_Name="Crea como un Activo";

@XendraColumn(AD_Element_ID="39d8b550-8958-384f-c046-30a31b80da0d",ColumnName="IsCreateAsActive",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cd383e7f-72c4-2fc4-95fa-070e9599685a",
Synchronized="2020-03-03 21:34:17.0")
/** Column name IsCreateAsActive */
public static final String COLUMNNAME_IsCreateAsActive = "IsCreateAsActive";
/** Set Depreciate.
@param IsDepreciated The asset will be depreciated */
public void setIsDepreciated (boolean IsDepreciated)
{
set_Value (COLUMNNAME_IsDepreciated, Boolean.valueOf(IsDepreciated));
}
/** Get Depreciate.
@return The asset will be depreciated */
public boolean isDepreciated() 
{
Object oo = get_Value(COLUMNNAME_IsDepreciated);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="19a5d7fc-ad29-0dff-2d86-8ae230c5aff5")
public static String es_PE_FIELD_AssetGroup_Depreciate_Name="Depreciar";

@XendraTrl(Identifier="19a5d7fc-ad29-0dff-2d86-8ae230c5aff5")
public static String es_PE_FIELD_AssetGroup_Depreciate_Description="El activo ha sido depreciado";

@XendraTrl(Identifier="19a5d7fc-ad29-0dff-2d86-8ae230c5aff5")
public static String es_PE_FIELD_AssetGroup_Depreciate_Help="El activo se utiliza internamente y será depreciado";

@XendraField(AD_Column_ID="IsDepreciated",IsCentrallyMaintained=true,
AD_Tab_ID="544fd379-fc68-f017-e5c1-f8eaa1859795",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsOwned@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="19a5d7fc-ad29-0dff-2d86-8ae230c5aff5")
public static final String FIELDNAME_AssetGroup_Depreciate="19a5d7fc-ad29-0dff-2d86-8ae230c5aff5";

@XendraTrl(Identifier="3569aaa9-2f81-6f70-25ba-0b5f120a1b1c")
public static String es_PE_COLUMN_IsDepreciated_Name="Depreciar";

@XendraColumn(AD_Element_ID="ae896e4e-ba42-d146-eb15-363628246698",ColumnName="IsDepreciated",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3569aaa9-2f81-6f70-25ba-0b5f120a1b1c",
Synchronized="2020-03-03 21:34:17.0")
/** Column name IsDepreciated */
public static final String COLUMNNAME_IsDepreciated = "IsDepreciated";
/** Set One Asset Per UOM.
@param IsOneAssetPerUOM Create one asset per UOM */
public void setIsOneAssetPerUOM (boolean IsOneAssetPerUOM)
{
set_Value (COLUMNNAME_IsOneAssetPerUOM, Boolean.valueOf(IsOneAssetPerUOM));
}
/** Get One Asset Per UOM.
@return Create one asset per UOM */
public boolean isOneAssetPerUOM() 
{
Object oo = get_Value(COLUMNNAME_IsOneAssetPerUOM);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="1552389a-d0e9-3aa9-20d0-2baf973e30da")
public static String es_PE_FIELD_AssetGroup_OneAssetPerUOM_Name="Un Activo por UM";

@XendraTrl(Identifier="1552389a-d0e9-3aa9-20d0-2baf973e30da")
public static String es_PE_FIELD_AssetGroup_OneAssetPerUOM_Description="Crea un activo por UM";

@XendraTrl(Identifier="1552389a-d0e9-3aa9-20d0-2baf973e30da")
public static String es_PE_FIELD_AssetGroup_OneAssetPerUOM_Help="Si esta seleccionado, un activo por UM es creado, si no es un activo con la cantidad recibido/entregado.Si usted tiene multiples lineas, un activo es creado por línea.";

@XendraField(AD_Column_ID="IsOneAssetPerUOM",IsCentrallyMaintained=true,
AD_Tab_ID="544fd379-fc68-f017-e5c1-f8eaa1859795",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1552389a-d0e9-3aa9-20d0-2baf973e30da")
public static final String FIELDNAME_AssetGroup_OneAssetPerUOM="1552389a-d0e9-3aa9-20d0-2baf973e30da";

@XendraTrl(Identifier="0b7b9466-46da-a69c-edf0-18d7ce80b06f")
public static String es_PE_COLUMN_IsOneAssetPerUOM_Name="Un Activo por UM";

@XendraColumn(AD_Element_ID="d2e2e724-2bbe-3f1c-3f5d-9878494cc5c4",ColumnName="IsOneAssetPerUOM",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0b7b9466-46da-a69c-edf0-18d7ce80b06f",
Synchronized="2020-03-03 21:34:17.0")
/** Column name IsOneAssetPerUOM */
public static final String COLUMNNAME_IsOneAssetPerUOM = "IsOneAssetPerUOM";
/** Set Owned.
@param IsOwned The asset is owned by the organization */
public void setIsOwned (boolean IsOwned)
{
set_Value (COLUMNNAME_IsOwned, Boolean.valueOf(IsOwned));
}
/** Get Owned.
@return The asset is owned by the organization */
public boolean isOwned() 
{
Object oo = get_Value(COLUMNNAME_IsOwned);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="74dbed74-5772-68c1-c864-054e177a5f2f")
public static String es_PE_FIELD_AssetGroup_Owned_Name="Propio";

@XendraTrl(Identifier="74dbed74-5772-68c1-c864-054e177a5f2f")
public static String es_PE_FIELD_AssetGroup_Owned_Description="El activo es poseido por la organización";

@XendraTrl(Identifier="74dbed74-5772-68c1-c864-054e177a5f2f")
public static String es_PE_FIELD_AssetGroup_Owned_Help="El activo puede no estar en la posesión, pero el activo es poseído legalmente por la organización.";

@XendraField(AD_Column_ID="IsOwned",IsCentrallyMaintained=true,
AD_Tab_ID="544fd379-fc68-f017-e5c1-f8eaa1859795",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="74dbed74-5772-68c1-c864-054e177a5f2f")
public static final String FIELDNAME_AssetGroup_Owned="74dbed74-5772-68c1-c864-054e177a5f2f";

@XendraTrl(Identifier="b28ae4ad-fb62-ba72-d968-d725c37eb2a9")
public static String es_PE_COLUMN_IsOwned_Name="Propio";

@XendraColumn(AD_Element_ID="d1cc73c2-f91b-55d5-aded-196c964818f7",ColumnName="IsOwned",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b28ae4ad-fb62-ba72-d968-d725c37eb2a9",
Synchronized="2020-03-03 21:34:17.0")
/** Column name IsOwned */
public static final String COLUMNNAME_IsOwned = "IsOwned";
/** Set Track Issues.
@param IsTrackIssues Enable tracking issues for this asset */
public void setIsTrackIssues (boolean IsTrackIssues)
{
set_Value (COLUMNNAME_IsTrackIssues, Boolean.valueOf(IsTrackIssues));
}
/** Get Track Issues.
@return Enable tracking issues for this asset */
public boolean isTrackIssues() 
{
Object oo = get_Value(COLUMNNAME_IsTrackIssues);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="6fcd6817-a236-711e-1f62-c9827f7628f4")
public static String es_PE_COLUMN_IsTrackIssues_Name="Edición Seguimiento";

@XendraColumn(AD_Element_ID="d1941216-e602-cd85-2ac7-7c7215e81ad5",ColumnName="IsTrackIssues",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6fcd6817-a236-711e-1f62-c9827f7628f4",
Synchronized="2020-03-03 21:34:17.0")
/** Column name IsTrackIssues */
public static final String COLUMNNAME_IsTrackIssues = "IsTrackIssues";
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

@XendraTrl(Identifier="21b8f37d-0ade-ceb6-96ed-7f94b28dc19a")
public static String es_PE_FIELD_AssetGroup_Name_Name="Nombre";

@XendraTrl(Identifier="21b8f37d-0ade-ceb6-96ed-7f94b28dc19a")
public static String es_PE_FIELD_AssetGroup_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="21b8f37d-0ade-ceb6-96ed-7f94b28dc19a")
public static String es_PE_FIELD_AssetGroup_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="544fd379-fc68-f017-e5c1-f8eaa1859795",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="21b8f37d-0ade-ceb6-96ed-7f94b28dc19a")
public static final String FIELDNAME_AssetGroup_Name="21b8f37d-0ade-ceb6-96ed-7f94b28dc19a";

@XendraTrl(Identifier="40324933-f88d-dbec-be4b-f098059e4e25")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="40324933-f88d-dbec-be4b-f098059e4e25",
Synchronized="2020-03-03 21:34:17.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
}
