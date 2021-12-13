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
/** Generated Model for AD_Org
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Org extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Org_ID id
@param trxName transaction
*/
public X_AD_Org (Properties ctx, int AD_Org_ID, String trxName)
{
super (ctx, AD_Org_ID, trxName);
/** if (AD_Org_ID == 0)
{
setIsSummary (false);	
// N
setMachineSerial (null);	
// 999
setName (null);
setValue (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Org (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=155 */
public static int Table_ID=MTable.getTable_ID("AD_Org");

@XendraTrl(Identifier="ae5cdb23-99a0-a467-b044-c22fb2252dac")
public static String es_PE_TAB_OrganizationDimension_Description="Mantenga el árbol de la dimensión de la contabilidad de organización";

@XendraTrl(Identifier="ae5cdb23-99a0-a467-b044-c22fb2252dac")
public static String es_PE_TAB_OrganizationDimension_Help="¡Observe por favor que usted no podrá crear entidades nuevas en esta ventana si usted no tiene defecto fijado para todos los valores obligatorios!.";

@XendraTrl(Identifier="ae5cdb23-99a0-a467-b044-c22fb2252dac")
public static String es_PE_TAB_OrganizationDimension_Name="Dimensión Organización";

@XendraTab(Name="Organization Dimension",
Description="Maintain Organizationt Accounting Dimension Tree",
Help="Please note that you will not be able to create new entities in this window if you have not default set for all mandatory values! ",
AD_Window_ID="6d82a0ab-8b9a-fa56-aec1-277a04b274a1",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=true,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="ae5cdb23-99a0-a467-b044-c22fb2252dac",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_OrganizationDimension="ae5cdb23-99a0-a467-b044-c22fb2252dac";

@XendraTrl(Identifier="f0308169-3023-c8c1-14c8-834dcd0e0514")
public static String es_PE_TAB_Organization_Description="Definir organizaciones";

@XendraTrl(Identifier="f0308169-3023-c8c1-14c8-834dcd0e0514")
public static String es_PE_TAB_Organization_Help="La pestaña de organización es usada para definir una organización. Cada organización tiene una clave y un nombre y opcionalmente una descripción. Cuando se adiciona una nueva organización es necesario salir del sistema y volver a entrar para que se pueda tener acceso a la nueva organización.";

@XendraTrl(Identifier="f0308169-3023-c8c1-14c8-834dcd0e0514")
public static String es_PE_TAB_Organization_Name="Organización";
@XendraTab(Name="Organization",
Description="Define Organizations",
Help="The Organization Tab is used to define an Organization.  Each Organization has a Key and Name and optionally a Description.   When adding a new organization, you must re-login to be able to access the new organization.",
AD_Window_ID="b18505b0-64f9-9322-2e8a-0daf80e326cb",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=true,
WhereClause="",OrderByClause="",
CommitWarning="All not manually maintained Roles will automatically have access to the new Organziation. You need restart your application server for most changes made here to be effective.",
AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,
Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,
Parent_Column_ID="",Identifier="f0308169-3023-c8c1-14c8-834dcd0e0514",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Organization="f0308169-3023-c8c1-14c8-834dcd0e0514";

@XendraTrl(Identifier="2af66655-3c9e-e66a-ecba-d39cc4b581f9")
public static String es_PE_TABLE_AD_Org_Name="Organización";

@XendraTable(Name="Organization",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",
Description="Organizational entity within client",Help="",TableName="AD_Org",AccessLevel="7",
AD_Window_ID="b18505b0-64f9-9322-2e8a-0daf80e326cb",AD_Val_Rule_ID="",IsKey=0,LoadSeq=45,
IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.dictionary",Identifier="2af66655-3c9e-e66a-ecba-d39cc4b581f9",
Synchronized="2020-03-03 21:35:09.0")
/** TableName=AD_Org */
public static final String Table_Name="AD_Org";


@XendraIndex(Name="ad_org_value",Identifier="9029f24d-3906-61da-0def-7de9cd40dd09",
Column_Names="ad_client_id, value",IsUnique="true",
TableIdentifier="9029f24d-3906-61da-0def-7de9cd40dd09",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_ad_org_value = "9029f24d-3906-61da-0def-7de9cd40dd09";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Org");

protected BigDecimal accessLevel = BigDecimal.valueOf(7);
/** AccessLevel
@return 7 - System - Client - Org 
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
    Table_ID = MTable.getTable_ID("AD_Org");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Org[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="a5a8b6bb-956f-a4f2-37cc-944dc69fe575")
public static String es_PE_FIELD_Organization_Description_Name="Observación";

@XendraTrl(Identifier="a5a8b6bb-956f-a4f2-37cc-944dc69fe575")
public static String es_PE_FIELD_Organization_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="a5a8b6bb-956f-a4f2-37cc-944dc69fe575")
public static String es_PE_FIELD_Organization_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="f0308169-3023-c8c1-14c8-834dcd0e0514",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a5a8b6bb-956f-a4f2-37cc-944dc69fe575")
public static final String FIELDNAME_Organization_Description="a5a8b6bb-956f-a4f2-37cc-944dc69fe575";

@XendraTrl(Identifier="d6c82061-ea64-79b4-3e01-82e89b071ab0")
public static String es_PE_FIELD_OrganizationDimension_Description_Name="Observación";

@XendraTrl(Identifier="d6c82061-ea64-79b4-3e01-82e89b071ab0")
public static String es_PE_FIELD_OrganizationDimension_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="d6c82061-ea64-79b4-3e01-82e89b071ab0")
public static String es_PE_FIELD_OrganizationDimension_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="ae5cdb23-99a0-a467-b044-c22fb2252dac",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d6c82061-ea64-79b4-3e01-82e89b071ab0")
public static final String FIELDNAME_OrganizationDimension_Description="d6c82061-ea64-79b4-3e01-82e89b071ab0";

@XendraTrl(Identifier="a954fe1c-fd13-fc8a-cdbe-6f38863b8a09")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a954fe1c-fd13-fc8a-cdbe-6f38863b8a09",
Synchronized="2019-08-30 22:20:28.0")
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
@XendraTrl(Identifier="477fbd9d-d7c5-4757-8a04-0f8d896e9fd7")
public static String es_PE_FIELD_Organization_Identifier_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="f0308169-3023-c8c1-14c8-834dcd0e0514",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=36,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-13 12:32:47.0",
Identifier="477fbd9d-d7c5-4757-8a04-0f8d896e9fd7")
public static final String FIELDNAME_Organization_Identifier="477fbd9d-d7c5-4757-8a04-0f8d896e9fd7";

@XendraTrl(Identifier="6d011334-5304-4e68-840f-a2481e4d1fe2")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6d011334-5304-4e68-840f-a2481e4d1fe2",
Synchronized="2019-08-30 22:20:28.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Summary Level.
@param IsSummary This is a summary entity */
public void setIsSummary (boolean IsSummary)
{
set_Value (COLUMNNAME_IsSummary, Boolean.valueOf(IsSummary));
}
/** Get Summary Level.
@return This is a summary entity */
public boolean isSummary() 
{
Object oo = get_Value(COLUMNNAME_IsSummary);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="95aa9e71-62f2-4279-5eeb-20450287f362")
public static String es_PE_FIELD_Organization_SummaryLevel_Name="Entidad Acumulada";

@XendraTrl(Identifier="95aa9e71-62f2-4279-5eeb-20450287f362")
public static String es_PE_FIELD_Organization_SummaryLevel_Description="Esta es una entidad sumaria";

@XendraTrl(Identifier="95aa9e71-62f2-4279-5eeb-20450287f362")
public static String es_PE_FIELD_Organization_SummaryLevel_Help="Una entidad sumaria representa una rama en un árbol mas bien que un nodo final. Las entidades sumarias son usadas para reportar y no tienen valores propios";

@XendraField(AD_Column_ID="IsSummary",IsCentrallyMaintained=true,
AD_Tab_ID="f0308169-3023-c8c1-14c8-834dcd0e0514",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="95aa9e71-62f2-4279-5eeb-20450287f362")
public static final String FIELDNAME_Organization_SummaryLevel="95aa9e71-62f2-4279-5eeb-20450287f362";

@XendraTrl(Identifier="be54cc23-d8bc-09b7-021a-6cc4a6fb6baf")
public static String es_PE_FIELD_OrganizationDimension_SummaryLevel_Name="Entidad Acumulada";

@XendraTrl(Identifier="be54cc23-d8bc-09b7-021a-6cc4a6fb6baf")
public static String es_PE_FIELD_OrganizationDimension_SummaryLevel_Description="Esta es una entidad sumaria";

@XendraTrl(Identifier="be54cc23-d8bc-09b7-021a-6cc4a6fb6baf")
public static String es_PE_FIELD_OrganizationDimension_SummaryLevel_Help="Una entidad sumaria representa una rama en un árbol mas bien que un nodo final. Las entidades sumarias son usadas para reportar y no tienen valores propios";

@XendraField(AD_Column_ID="IsSummary",IsCentrallyMaintained=true,
AD_Tab_ID="ae5cdb23-99a0-a467-b044-c22fb2252dac",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="be54cc23-d8bc-09b7-021a-6cc4a6fb6baf")
public static final String FIELDNAME_OrganizationDimension_SummaryLevel="be54cc23-d8bc-09b7-021a-6cc4a6fb6baf";

@XendraTrl(Identifier="d1f846e3-a1c2-6970-fbb0-b1f368d8a9ca")
public static String es_PE_COLUMN_IsSummary_Name="Entidad Acumulada";

@XendraColumn(AD_Element_ID="0ecd1d56-9e2b-8778-7b05-92730d811ad4",ColumnName="IsSummary",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d1f846e3-a1c2-6970-fbb0-b1f368d8a9ca",
Synchronized="2019-08-30 22:20:28.0")
/** Column name IsSummary */
public static final String COLUMNNAME_IsSummary = "IsSummary";
/** Set MachineSerial.
@param MachineSerial MachineSerial */
public void setMachineSerial (String MachineSerial)
{
if (MachineSerial == null) throw new IllegalArgumentException ("MachineSerial is mandatory.");
if (MachineSerial.length() > 200)
{
log.warning("Length > 200 - truncated");
MachineSerial = MachineSerial.substring(0,199);
}
set_Value (COLUMNNAME_MachineSerial, MachineSerial);
}
/** Get MachineSerial.
@return MachineSerial */
public String getMachineSerial() 
{
String value = (String)get_Value(COLUMNNAME_MachineSerial);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="fa44ac15-edb3-4c65-9594-f705808d4fa3")
public static String es_PE_FIELD_Organization_MachineSerial_Name="machineserial";

@XendraField(AD_Column_ID="MachineSerial",IsCentrallyMaintained=true,
AD_Tab_ID="f0308169-3023-c8c1-14c8-834dcd0e0514",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=200,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-13 12:32:47.0",
Identifier="fa44ac15-edb3-4c65-9594-f705808d4fa3")
public static final String FIELDNAME_Organization_MachineSerial="fa44ac15-edb3-4c65-9594-f705808d4fa3";

@XendraTrl(Identifier="83d1c679-c427-126f-dac7-5de8c9c1249a")
public static String es_PE_COLUMN_MachineSerial_Name="MachineSerial";

@XendraColumn(AD_Element_ID="8435e473-af0f-eb91-9746-88d639a40879",ColumnName="MachineSerial",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=200,DefaultValue="999",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="83d1c679-c427-126f-dac7-5de8c9c1249a",
Synchronized="2019-08-30 22:20:28.0")
/** Column name MachineSerial */
public static final String COLUMNNAME_MachineSerial = "MachineSerial";
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

@XendraTrl(Identifier="c7d74b53-c7d6-85d1-5c47-08b59258ecdf")
public static String es_PE_FIELD_Organization_Name_Name="Nombre";

@XendraTrl(Identifier="c7d74b53-c7d6-85d1-5c47-08b59258ecdf")
public static String es_PE_FIELD_Organization_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="c7d74b53-c7d6-85d1-5c47-08b59258ecdf")
public static String es_PE_FIELD_Organization_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="f0308169-3023-c8c1-14c8-834dcd0e0514",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c7d74b53-c7d6-85d1-5c47-08b59258ecdf")
public static final String FIELDNAME_Organization_Name="c7d74b53-c7d6-85d1-5c47-08b59258ecdf";

@XendraTrl(Identifier="b7606615-c266-da13-077a-55868a6838bc")
public static String es_PE_FIELD_OrganizationDimension_Name_Name="Nombre";

@XendraTrl(Identifier="b7606615-c266-da13-077a-55868a6838bc")
public static String es_PE_FIELD_OrganizationDimension_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="b7606615-c266-da13-077a-55868a6838bc")
public static String es_PE_FIELD_OrganizationDimension_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="ae5cdb23-99a0-a467-b044-c22fb2252dac",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b7606615-c266-da13-077a-55868a6838bc")
public static final String FIELDNAME_OrganizationDimension_Name="b7606615-c266-da13-077a-55868a6838bc";

@XendraTrl(Identifier="0ed45ba3-3d98-09af-99fd-a7b1a230691b")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0ed45ba3-3d98-09af-99fd-a7b1a230691b",
Synchronized="2019-08-30 22:20:28.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Tax ID.
@param TaxID Tax Identification */
public void setTaxID (String TaxID)
{
if (TaxID != null && TaxID.length() > 20)
{
log.warning("Length > 20 - truncated");
TaxID = TaxID.substring(0,19);
}
set_Value (COLUMNNAME_TaxID, TaxID);
}
/** Get Tax ID.
@return Tax Identification */
public String getTaxID() 
{
String value = (String)get_Value(COLUMNNAME_TaxID);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="ef76d4c2-3a03-4edd-8770-eb0aa655ccde")
public static String es_PE_FIELD_Organization_TaxID_Name="RFC";

@XendraTrl(Identifier="ef76d4c2-3a03-4edd-8770-eb0aa655ccde")
public static String es_PE_FIELD_Organization_TaxID_Description="Código de Identificación";

@XendraTrl(Identifier="ef76d4c2-3a03-4edd-8770-eb0aa655ccde")
public static String es_PE_FIELD_Organization_TaxID_Help="El código de Identificación es el número de identificación gubernamental de esta entidad";

@XendraField(AD_Column_ID="TaxID",IsCentrallyMaintained=true,
AD_Tab_ID="f0308169-3023-c8c1-14c8-834dcd0e0514",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-13 12:32:47.0",
Identifier="ef76d4c2-3a03-4edd-8770-eb0aa655ccde")
public static final String FIELDNAME_Organization_TaxID="ef76d4c2-3a03-4edd-8770-eb0aa655ccde";

@XendraTrl(Identifier="baf5dda4-9ed4-4da3-a3d7-fff3716e06de")
public static String es_PE_COLUMN_TaxID_Name="Tax ID";

@XendraColumn(AD_Element_ID="e0a9d0f7-835b-4f80-4c13-bff62213e232",ColumnName="TaxID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="baf5dda4-9ed4-4da3-a3d7-fff3716e06de",
Synchronized="2019-08-30 22:20:28.0")
/** Column name TaxID */
public static final String COLUMNNAME_TaxID = "TaxID";
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
@XendraTrl(Identifier="a225a830-70d9-9e81-6a43-2e16522d43b9")
public static String es_PE_FIELD_Organization_SearchKey_Name="Clave de Búsqueda";

@XendraTrl(Identifier="a225a830-70d9-9e81-6a43-2e16522d43b9")
public static String es_PE_FIELD_Organization_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="a225a830-70d9-9e81-6a43-2e16522d43b9")
public static String es_PE_FIELD_Organization_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="f0308169-3023-c8c1-14c8-834dcd0e0514",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=15,IsReadOnly=false,SeqNo=20,SortNo=1,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a225a830-70d9-9e81-6a43-2e16522d43b9")
public static final String FIELDNAME_Organization_SearchKey="a225a830-70d9-9e81-6a43-2e16522d43b9";

@XendraTrl(Identifier="9967bd77-8e72-2634-9636-cfb2a1e5c29f")
public static String es_PE_FIELD_OrganizationDimension_SearchKey_Name="Clave de Búsqueda";

@XendraTrl(Identifier="9967bd77-8e72-2634-9636-cfb2a1e5c29f")
public static String es_PE_FIELD_OrganizationDimension_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="9967bd77-8e72-2634-9636-cfb2a1e5c29f")
public static String es_PE_FIELD_OrganizationDimension_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="ae5cdb23-99a0-a467-b044-c22fb2252dac",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9967bd77-8e72-2634-9636-cfb2a1e5c29f")
public static final String FIELDNAME_OrganizationDimension_SearchKey="9967bd77-8e72-2634-9636-cfb2a1e5c29f";

@XendraTrl(Identifier="420b039a-ba5e-e196-3c8e-3b52ff54aa7b")
public static String es_PE_COLUMN_Value_Name="Clave de Búsqueda";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="420b039a-ba5e-e196-3c8e-3b52ff54aa7b",
Synchronized="2019-08-30 22:20:28.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
}
