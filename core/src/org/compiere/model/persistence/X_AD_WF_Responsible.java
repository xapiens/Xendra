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
import org.compiere.model.reference.REF_WF_ParticipantType;
/** Generated Model for AD_WF_Responsible
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_WF_Responsible extends PO
{
/** Standard Constructor
@param ctx context
@param AD_WF_Responsible_ID id
@param trxName transaction
*/
public X_AD_WF_Responsible (Properties ctx, int AD_WF_Responsible_ID, String trxName)
{
super (ctx, AD_WF_Responsible_ID, trxName);
/** if (AD_WF_Responsible_ID == 0)
{
setAD_Role_ID (0);
setAD_WF_Responsible_ID (0);
setEntityType (null);	
// U
setName (null);
setResponsibleType (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_WF_Responsible (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=646 */
public static int Table_ID=MTable.getTable_ID("AD_WF_Responsible");

@XendraTrl(Identifier="09c95482-4c21-60f5-dc87-9b130d3de871")
public static String es_PE_TAB_Responsible_Description="Responsable para la ejecución del flujo de trabajo";

@XendraTrl(Identifier="09c95482-4c21-60f5-dc87-9b130d3de871")
public static String es_PE_TAB_Responsible_Name="Responsable";

@XendraTrl(Identifier="09c95482-4c21-60f5-dc87-9b130d3de871")
public static String es_PE_TAB_Responsible_Help="La última responsabilidad de un flujo de trabajo está con un usuario real. El flujo de trabajo responsable permite definir maneras de encontrar a ese usuario real.";

@XendraTab(Name="Responsible",Description="Responsible for Workflow Execution",
Help="The ultimate responsibility for a workflow is with an actual user. The Workflow Responsible allows to define ways to find that actual User.",
AD_Window_ID="c0f9b7a2-e1dc-66dc-1baa-e2e1b93d5240",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="09c95482-4c21-60f5-dc87-9b130d3de871",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Responsible="09c95482-4c21-60f5-dc87-9b130d3de871";

@XendraTrl(Identifier="64ad4ea4-9cb6-b30b-3820-bb96ae3a61b8")
public static String es_PE_TABLE_AD_WF_Responsible_Name="Responsable del Flujo de Trabajo";


@XendraTable(Name="Workflow Responsible",Description="Responsible for Workflow Execution",Help="",
TableName="AD_WF_Responsible",AccessLevel="6",AD_Window_ID="c0f9b7a2-e1dc-66dc-1baa-e2e1b93d5240",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=120,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.workflow",
Identifier="64ad4ea4-9cb6-b30b-3820-bb96ae3a61b8",Synchronized="2017-08-16 11:41:12.0")
/** TableName=AD_WF_Responsible */
public static final String Table_Name="AD_WF_Responsible";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_WF_Responsible");

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
    Table_ID = MTable.getTable_ID("AD_WF_Responsible");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_WF_Responsible[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Role.
@param AD_Role_ID Responsibility Role */
public void setAD_Role_ID (int AD_Role_ID)
{
if (AD_Role_ID < 0) throw new IllegalArgumentException ("AD_Role_ID is mandatory.");
set_Value (COLUMNNAME_AD_Role_ID, Integer.valueOf(AD_Role_ID));
}
/** Get Role.
@return Responsibility Role */
public int getAD_Role_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Role_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="46f60936-6dbd-09cc-abe7-a0fd69da4d10")
public static String es_PE_FIELD_Responsible_Role_Description="Rol de responsabilidad";

@XendraTrl(Identifier="46f60936-6dbd-09cc-abe7-a0fd69da4d10")
public static String es_PE_FIELD_Responsible_Role_Help="El Rol determina la seguridad y acceso del usuario que posee este Rol";

@XendraTrl(Identifier="46f60936-6dbd-09cc-abe7-a0fd69da4d10")
public static String es_PE_FIELD_Responsible_Role_Name="Rol";

@XendraField(AD_Column_ID="AD_Role_ID",IsCentrallyMaintained=true,
AD_Tab_ID="09c95482-4c21-60f5-dc87-9b130d3de871",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ResponsibleType@=R",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="46f60936-6dbd-09cc-abe7-a0fd69da4d10")
public static final String FIELDNAME_Responsible_Role="46f60936-6dbd-09cc-abe7-a0fd69da4d10";

@XendraTrl(Identifier="f29530dd-c3f2-1b08-032d-6278bbf849c5")
public static String es_PE_COLUMN_AD_Role_ID_Name="Rol";

@XendraColumn(AD_Element_ID="08ffb725-ea75-e55f-f4c5-67ac26f40e2b",ColumnName="AD_Role_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f29530dd-c3f2-1b08-032d-6278bbf849c5",
Synchronized="2017-08-05 16:53:02.0")
/** Column name AD_Role_ID */
public static final String COLUMNNAME_AD_Role_ID = "AD_Role_ID";

/** AD_User_ID AD_Reference=91f52193-02ab-6545-99f8-d6d30b9d03a1 */
public static final int AD_USER_ID_AD_Reference_ID=286;
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

@XendraTrl(Identifier="d7a09c29-f922-f7c6-f1f1-6439c26cafdd")
public static String es_PE_FIELD_Responsible_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="d7a09c29-f922-f7c6-f1f1-6439c26cafdd")
public static String es_PE_FIELD_Responsible_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraTrl(Identifier="d7a09c29-f922-f7c6-f1f1-6439c26cafdd")
public static String es_PE_FIELD_Responsible_UserContact_Name="Usuario";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="09c95482-4c21-60f5-dc87-9b130d3de871",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ResponsibleType@=H",DisplayLength=26,IsReadOnly=false,SeqNo=100,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="d7a09c29-f922-f7c6-f1f1-6439c26cafdd")
public static final String FIELDNAME_Responsible_UserContact="d7a09c29-f922-f7c6-f1f1-6439c26cafdd";

@XendraTrl(Identifier="757992d9-b1db-f481-be54-8cbddf628732")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="91f52193-02ab-6545-99f8-d6d30b9d03a1",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="757992d9-b1db-f481-be54-8cbddf628732",Synchronized="2017-08-05 16:53:02.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
/** Set Workflow Responsible.
@param AD_WF_Responsible_ID Responsible for Workflow Execution */
public void setAD_WF_Responsible_ID (int AD_WF_Responsible_ID)
{
if (AD_WF_Responsible_ID < 1) throw new IllegalArgumentException ("AD_WF_Responsible_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_WF_Responsible_ID, Integer.valueOf(AD_WF_Responsible_ID));
}
/** Get Workflow Responsible.
@return Responsible for Workflow Execution */
public int getAD_WF_Responsible_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_WF_Responsible_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4301c83f-0ab5-1431-40a7-2dc2eb275d6e")
public static String es_PE_FIELD_Responsible_WorkflowResponsible_Description="Responsable para la ejecución del flujo de trabajo.";

@XendraTrl(Identifier="4301c83f-0ab5-1431-40a7-2dc2eb275d6e")
public static String es_PE_FIELD_Responsible_WorkflowResponsible_Help="La última responsabilidad para el flujo de trabajo es con un usuario actual. El flujo de trabajo responsable permite definir maneras de encontrar a ese usuario final.";

@XendraTrl(Identifier="4301c83f-0ab5-1431-40a7-2dc2eb275d6e")
public static String es_PE_FIELD_Responsible_WorkflowResponsible_Name="Responsable del Flujo de Trabajo";

@XendraField(AD_Column_ID="AD_WF_Responsible_ID",IsCentrallyMaintained=true,
AD_Tab_ID="09c95482-4c21-60f5-dc87-9b130d3de871",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4301c83f-0ab5-1431-40a7-2dc2eb275d6e")
public static final String FIELDNAME_Responsible_WorkflowResponsible="4301c83f-0ab5-1431-40a7-2dc2eb275d6e";
/** Column name AD_WF_Responsible_ID */
public static final String COLUMNNAME_AD_WF_Responsible_ID = "AD_WF_Responsible_ID";
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

@XendraTrl(Identifier="f15b1b62-55d2-1da9-480a-150e7e8fb875")
public static String es_PE_FIELD_Responsible_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="f15b1b62-55d2-1da9-480a-150e7e8fb875")
public static String es_PE_FIELD_Responsible_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="f15b1b62-55d2-1da9-480a-150e7e8fb875")
public static String es_PE_FIELD_Responsible_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="09c95482-4c21-60f5-dc87-9b130d3de871",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f15b1b62-55d2-1da9-480a-150e7e8fb875")
public static final String FIELDNAME_Responsible_Description="f15b1b62-55d2-1da9-480a-150e7e8fb875";

@XendraTrl(Identifier="65928a41-e51c-ed28-8150-851ef8337a40")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="65928a41-e51c-ed28-8150-851ef8337a40",
Synchronized="2017-08-05 16:53:02.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";

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

@XendraTrl(Identifier="6cdb8362-82ce-5f30-2844-124e9fc92bb4")
public static String es_PE_FIELD_Responsible_EntityType_Description="Tipo de Entidad Diccionario; determina propiedad y sincronización";

@XendraTrl(Identifier="6cdb8362-82ce-5f30-2844-124e9fc92bb4")
public static String es_PE_FIELD_Responsible_EntityType_Help="Los tipos de entidad \"Diccionario\"; \"Adempiere\"; y \"Aplicación\" podrían ser automáticamente sincronizados y las personalizaciones eliminadas ó sobreescritas";

@XendraTrl(Identifier="6cdb8362-82ce-5f30-2844-124e9fc92bb4")
public static String es_PE_FIELD_Responsible_EntityType_Name="Tipo de Entidad";

@XendraField(AD_Column_ID="EntityType",IsCentrallyMaintained=true,
AD_Tab_ID="09c95482-4c21-60f5-dc87-9b130d3de871",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6cdb8362-82ce-5f30-2844-124e9fc92bb4")
public static final String FIELDNAME_Responsible_EntityType="6cdb8362-82ce-5f30-2844-124e9fc92bb4";

@XendraTrl(Identifier="88831242-6b2e-4df0-ee04-4d937640c618")
public static String es_PE_COLUMN_EntityType_Name="Tipo de Entidad";

@XendraColumn(AD_Element_ID="5ba917bf-871c-6f19-aa50-962adc5de558",ColumnName="EntityType",
AD_Reference_ID=18,AD_Reference_Value_ID="fae4ad31-8ff1-5d5c-8d47-2426c541cd74",AD_Val_Rule_ID="",
FieldLength=4,DefaultValue="U",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="@EntityType@=D",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="88831242-6b2e-4df0-ee04-4d937640c618",Synchronized="2017-08-05 16:53:02.0")
/** Column name EntityType */
public static final String COLUMNNAME_EntityType = "EntityType";
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
@XendraTrl(Identifier="48960e84-f60f-4289-946d-3c065e89a4d6")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="48960e84-f60f-4289-946d-3c065e89a4d6",
Synchronized="2017-08-05 16:53:02.0")
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

@XendraTrl(Identifier="9a7d512d-3f64-560b-1048-1aafc389e367")
public static String es_PE_FIELD_Responsible_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="9a7d512d-3f64-560b-1048-1aafc389e367")
public static String es_PE_FIELD_Responsible_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="9a7d512d-3f64-560b-1048-1aafc389e367")
public static String es_PE_FIELD_Responsible_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="09c95482-4c21-60f5-dc87-9b130d3de871",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="9a7d512d-3f64-560b-1048-1aafc389e367")
public static final String FIELDNAME_Responsible_Name="9a7d512d-3f64-560b-1048-1aafc389e367";

@XendraTrl(Identifier="b18d559d-3c10-f00d-b2a3-4018f143835b")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b18d559d-3c10-f00d-b2a3-4018f143835b",
Synchronized="2017-08-05 16:53:02.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";

/** ResponsibleType AD_Reference=ae7055f1-e121-2966-f907-d95e1d377264 */
public static final int RESPONSIBLETYPE_AD_Reference_ID=304;
/** Set Responsible Type.
@param ResponsibleType Type of the Responsibility for a workflow */
public void setResponsibleType (String ResponsibleType)
{
if (ResponsibleType == null) throw new IllegalArgumentException ("ResponsibleType is mandatory");
if (ResponsibleType.equals(REF_WF_ParticipantType.Organization) || ResponsibleType.equals(REF_WF_ParticipantType.Human) || ResponsibleType.equals(REF_WF_ParticipantType.Role) || ResponsibleType.equals(REF_WF_ParticipantType.SystemResource));
 else throw new IllegalArgumentException ("ResponsibleType Invalid value - " + ResponsibleType + " - Reference_ID=304 - O - H - R - S");
if (ResponsibleType.length() > 1)
{
log.warning("Length > 1 - truncated");
ResponsibleType = ResponsibleType.substring(0,0);
}
set_Value (COLUMNNAME_ResponsibleType, ResponsibleType);
}
/** Get Responsible Type.
@return Type of the Responsibility for a workflow */
public String getResponsibleType() 
{
return (String)get_Value(COLUMNNAME_ResponsibleType);
}

@XendraTrl(Identifier="281c52bf-0644-25bb-f7f3-4956df5caf89")
public static String es_PE_FIELD_Responsible_ResponsibleType_Description="Tipo de responsabilidad de un flujo de trabajo.";

@XendraTrl(Identifier="281c52bf-0644-25bb-f7f3-4956df5caf89")
public static String es_PE_FIELD_Responsible_ResponsibleType_Help="Tipo de usuario responsable para la ejecución de un flujo de trabajo determinado.";

@XendraTrl(Identifier="281c52bf-0644-25bb-f7f3-4956df5caf89")
public static String es_PE_FIELD_Responsible_ResponsibleType_Name="Tipo de Responsable";

@XendraField(AD_Column_ID="ResponsibleType",IsCentrallyMaintained=true,
AD_Tab_ID="09c95482-4c21-60f5-dc87-9b130d3de871",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="281c52bf-0644-25bb-f7f3-4956df5caf89")
public static final String FIELDNAME_Responsible_ResponsibleType="281c52bf-0644-25bb-f7f3-4956df5caf89";

@XendraTrl(Identifier="10f4e85b-47a4-d490-61b7-22069babca90")
public static String es_PE_COLUMN_ResponsibleType_Name="Tipo de Responsable";

@XendraColumn(AD_Element_ID="7cca6a59-4cbc-2a23-1ba7-916c43d2214f",ColumnName="ResponsibleType",
AD_Reference_ID=17,AD_Reference_Value_ID="ae7055f1-e121-2966-f907-d95e1d377264",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="10f4e85b-47a4-d490-61b7-22069babca90",Synchronized="2017-08-05 16:53:02.0")
/** Column name ResponsibleType */
public static final String COLUMNNAME_ResponsibleType = "ResponsibleType";
}
