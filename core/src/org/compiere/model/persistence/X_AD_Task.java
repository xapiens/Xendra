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
import org.compiere.model.reference.REF_AD_TableAccessLevels;
/** Generated Model for AD_Task
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Task extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Task_ID id
@param trxName transaction
*/
public X_AD_Task (Properties ctx, int AD_Task_ID, String trxName)
{
super (ctx, AD_Task_ID, trxName);
/** if (AD_Task_ID == 0)
{
setAccessLevel (null);
setAD_Task_ID (0);
setEntityType (null);	
// U
setIsServerProcess (false);	
// N
setName (null);
setOS_Command (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Task (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=118 */
public static int Table_ID=MTable.getTable_ID("AD_Task");

@XendraTrl(Identifier="616aa6a0-225e-ce6d-f549-2cba9ff66f08")
public static String es_PE_TAB_Task_Description="Tarea";

@XendraTrl(Identifier="616aa6a0-225e-ce6d-f549-2cba9ff66f08")
public static String es_PE_TAB_Task_Name="Tarea";

@XendraTrl(Identifier="616aa6a0-225e-ce6d-f549-2cba9ff66f08")
public static String es_PE_TAB_Task_Help="La pestaña de tareas define las tareas que serán usadas.";

@XendraTab(Name="Task",Description="Task",
Help="The Task Tab defines the unique tasks that will be used.",
AD_Window_ID="99f7c032-e7ea-1199-f548-822f722e43be",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="616aa6a0-225e-ce6d-f549-2cba9ff66f08",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Task="616aa6a0-225e-ce6d-f549-2cba9ff66f08";

@XendraTrl(Identifier="0678512d-d1ae-6cf5-36e7-379cd0ab2209")
public static String es_PE_TABLE_AD_Task_Name="Tarea";

@XendraTable(Name="OS Task",Description="Operation System Task",Help="",TableName="AD_Task",
AccessLevel="6",AD_Window_ID="99f7c032-e7ea-1199-f548-822f722e43be",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=130,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="0678512d-d1ae-6cf5-36e7-379cd0ab2209",Synchronized="2017-08-16 11:41:02.0")
/** TableName=AD_Task */
public static final String Table_Name="AD_Task";


@XendraIndex(Name="ad_task_name",Identifier="592bac08-410c-d019-b562-c61e50085164",
Column_Names="ad_client_id, name",IsUnique="true",
TableIdentifier="592bac08-410c-d019-b562-c61e50085164",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_ad_task_name = "592bac08-410c-d019-b562-c61e50085164";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Task");

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
    Table_ID = MTable.getTable_ID("AD_Task");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Task[").append(get_ID()).append("]");
return sb.toString();
}

/** AccessLevel AD_Reference=5684046b-00f0-a17c-843e-efad2b0e42f3 */
public static final int ACCESSLEVEL_AD_Reference_ID=5;
/** Set Data Access Level.
@param AccessLevel Access Level required */
public void setAccessLevel (String AccessLevel)
{
if (AccessLevel == null) throw new IllegalArgumentException ("AccessLevel is mandatory");
if (AccessLevel.equals(REF_AD_TableAccessLevels.SystemPlusClient) || AccessLevel.equals(REF_AD_TableAccessLevels.ClientOnly) || AccessLevel.equals(REF_AD_TableAccessLevels.Organization) || AccessLevel.equals(REF_AD_TableAccessLevels.ClientPlusOrganization) || AccessLevel.equals(REF_AD_TableAccessLevels.SystemOnly) || AccessLevel.equals(REF_AD_TableAccessLevels.All));
 else throw new IllegalArgumentException ("AccessLevel Invalid value - " + AccessLevel + " - Reference_ID=5 - 6 - 2 - 1 - 3 - 4 - 7");
if (AccessLevel.length() > 1)
{
log.warning("Length > 1 - truncated");
AccessLevel = AccessLevel.substring(0,0);
}
set_Value (COLUMNNAME_AccessLevel, AccessLevel);
}
/** Get Data Access Level.
@return Access Level required */
public String getAccessLevel() 
{
return (String)get_Value(COLUMNNAME_AccessLevel);
}

@XendraTrl(Identifier="006ec1d7-8f91-e834-c82f-b3bcf0d92902")
public static String es_PE_FIELD_Task_DataAccessLevel_Description="Nivel de Acceso requerido";

@XendraTrl(Identifier="006ec1d7-8f91-e834-c82f-b3bcf0d92902")
public static String es_PE_FIELD_Task_DataAccessLevel_Help="Indica el nivel de acceso requerido para este registro ó proceso";

@XendraTrl(Identifier="006ec1d7-8f91-e834-c82f-b3bcf0d92902")
public static String es_PE_FIELD_Task_DataAccessLevel_Name="Nivel de Acceso a Datos";

@XendraField(AD_Column_ID="AccessLevel",IsCentrallyMaintained=true,
AD_Tab_ID="616aa6a0-225e-ce6d-f549-2cba9ff66f08",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="006ec1d7-8f91-e834-c82f-b3bcf0d92902")
public static final String FIELDNAME_Task_DataAccessLevel="006ec1d7-8f91-e834-c82f-b3bcf0d92902";

@XendraTrl(Identifier="d8aaf656-9f51-dd1d-761d-1e36fef30250")
public static String es_PE_COLUMN_AccessLevel_Name="Nivel de Acceso a Datos";

@XendraColumn(AD_Element_ID="bd129648-2bd8-10dc-6b09-97aa41aa28e2",ColumnName="AccessLevel",
AD_Reference_ID=17,AD_Reference_Value_ID="5684046b-00f0-a17c-843e-efad2b0e42f3",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d8aaf656-9f51-dd1d-761d-1e36fef30250",Synchronized="2017-08-05 16:52:54.0")
/** Column name AccessLevel */
public static final String COLUMNNAME_AccessLevel = "AccessLevel";
/** Set OS Task.
@param AD_Task_ID Operation System Task */
public void setAD_Task_ID (int AD_Task_ID)
{
if (AD_Task_ID < 1) throw new IllegalArgumentException ("AD_Task_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Task_ID, Integer.valueOf(AD_Task_ID));
}
/** Get OS Task.
@return Operation System Task */
public int getAD_Task_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Task_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c6e5f441-4c32-17d4-4426-264ce2b13475")
public static String es_PE_FIELD_Task_OSTask_Description="Identificador de la tarea";

@XendraTrl(Identifier="c6e5f441-4c32-17d4-4426-264ce2b13475")
public static String es_PE_FIELD_Task_OSTask_Help="El campo tarea indica una tarea única en el sistema";

@XendraTrl(Identifier="c6e5f441-4c32-17d4-4426-264ce2b13475")
public static String es_PE_FIELD_Task_OSTask_Name="Tarea";
@XendraField(AD_Column_ID="AD_Task_ID",
IsCentrallyMaintained=true,AD_Tab_ID="616aa6a0-225e-ce6d-f549-2cba9ff66f08",AD_FieldGroup_ID="",
IsDisplayed=false,DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="c6e5f441-4c32-17d4-4426-264ce2b13475")
public static final String FIELDNAME_Task_OSTask="c6e5f441-4c32-17d4-4426-264ce2b13475";
/** Column name AD_Task_ID */
public static final String COLUMNNAME_AD_Task_ID = "AD_Task_ID";
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

@XendraTrl(Identifier="132cb570-4cbe-d40f-e3e3-91128bab2096")
public static String es_PE_FIELD_Task_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="132cb570-4cbe-d40f-e3e3-91128bab2096")
public static String es_PE_FIELD_Task_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="132cb570-4cbe-d40f-e3e3-91128bab2096")
public static String es_PE_FIELD_Task_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="616aa6a0-225e-ce6d-f549-2cba9ff66f08",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="132cb570-4cbe-d40f-e3e3-91128bab2096")
public static final String FIELDNAME_Task_Description="132cb570-4cbe-d40f-e3e3-91128bab2096";

@XendraTrl(Identifier="90de1eba-bd2d-e5df-6911-677500c8e7ff")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="90de1eba-bd2d-e5df-6911-677500c8e7ff",
Synchronized="2017-08-05 16:52:54.0")
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

@XendraTrl(Identifier="5c850dc8-bb87-2cac-b148-e43d45b2c802")
public static String es_PE_FIELD_Task_EntityType_Description="Tipo de Entidad Diccionario; determina propiedad y sincronización";

@XendraTrl(Identifier="5c850dc8-bb87-2cac-b148-e43d45b2c802")
public static String es_PE_FIELD_Task_EntityType_Help="Los tipos de entidad \"Diccionario\"; \"Adempiere\"; y \"Aplicación\" podrían ser automáticamente sincronizados y las personalizaciones eliminadas ó sobreescritas";

@XendraTrl(Identifier="5c850dc8-bb87-2cac-b148-e43d45b2c802")
public static String es_PE_FIELD_Task_EntityType_Name="Tipo de Entidad";

@XendraField(AD_Column_ID="EntityType",IsCentrallyMaintained=true,
AD_Tab_ID="616aa6a0-225e-ce6d-f549-2cba9ff66f08",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5c850dc8-bb87-2cac-b148-e43d45b2c802")
public static final String FIELDNAME_Task_EntityType="5c850dc8-bb87-2cac-b148-e43d45b2c802";

@XendraTrl(Identifier="96777aa2-132a-4caa-9d54-d3c701fa7728")
public static String es_PE_COLUMN_EntityType_Name="Tipo de Entidad";

@XendraColumn(AD_Element_ID="5ba917bf-871c-6f19-aa50-962adc5de558",ColumnName="EntityType",
AD_Reference_ID=18,AD_Reference_Value_ID="fae4ad31-8ff1-5d5c-8d47-2426c541cd74",AD_Val_Rule_ID="",
FieldLength=4,DefaultValue="U",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="@EntityType@=D",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="96777aa2-132a-4caa-9d54-d3c701fa7728",Synchronized="2017-08-05 16:52:54.0")
/** Column name EntityType */
public static final String COLUMNNAME_EntityType = "EntityType";
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

@XendraTrl(Identifier="10d07520-d2fd-8651-082c-b8a63a1ca07a")
public static String es_PE_FIELD_Task_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="10d07520-d2fd-8651-082c-b8a63a1ca07a")
public static String es_PE_FIELD_Task_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="10d07520-d2fd-8651-082c-b8a63a1ca07a")
public static String es_PE_FIELD_Task_CommentHelp_Name="Ayuda";
@XendraField(AD_Column_ID="Help",
IsCentrallyMaintained=true,AD_Tab_ID="616aa6a0-225e-ce6d-f549-2cba9ff66f08",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="10d07520-d2fd-8651-082c-b8a63a1ca07a")
public static final String FIELDNAME_Task_CommentHelp="10d07520-d2fd-8651-082c-b8a63a1ca07a";

@XendraTrl(Identifier="cb1d1d72-aec0-2157-8433-bb213930de1d")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cb1d1d72-aec0-2157-8433-bb213930de1d",
Synchronized="2017-08-05 16:52:54.0")
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
@XendraTrl(Identifier="94427605-3d9b-4d60-b09a-d2664cf46ff4")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="94427605-3d9b-4d60-b09a-d2664cf46ff4",
Synchronized="2017-08-05 16:52:54.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Server Process.
@param IsServerProcess Run this Process on Server only */
public void setIsServerProcess (boolean IsServerProcess)
{
set_Value (COLUMNNAME_IsServerProcess, Boolean.valueOf(IsServerProcess));
}
/** Get Server Process.
@return Run this Process on Server only */
public boolean isServerProcess() 
{
Object oo = get_Value(COLUMNNAME_IsServerProcess);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="bf43c193-b718-f947-24bb-450cbe21a1b1")
public static String es_PE_FIELD_Task_ServerProcess_Description="Ejecutar este proceso sobre el servidor únicamente";

@XendraTrl(Identifier="bf43c193-b718-f947-24bb-450cbe21a1b1")
public static String es_PE_FIELD_Task_ServerProcess_Help="Habilitando esta bandera se deshabilita que corra el proceso en el cliente. Esto disminuye potencialmente la disponibilidad";

@XendraTrl(Identifier="bf43c193-b718-f947-24bb-450cbe21a1b1")
public static String es_PE_FIELD_Task_ServerProcess_Name="Proceso del Servidor";

@XendraField(AD_Column_ID="IsServerProcess",IsCentrallyMaintained=true,
AD_Tab_ID="616aa6a0-225e-ce6d-f549-2cba9ff66f08",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bf43c193-b718-f947-24bb-450cbe21a1b1")
public static final String FIELDNAME_Task_ServerProcess="bf43c193-b718-f947-24bb-450cbe21a1b1";

@XendraTrl(Identifier="4d9f0d80-3136-086b-45f4-f99c029c896d")
public static String es_PE_COLUMN_IsServerProcess_Name="Proceso del Servidor";

@XendraColumn(AD_Element_ID="5f0d593d-5720-24cb-9a70-978ed8e51f2e",ColumnName="IsServerProcess",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4d9f0d80-3136-086b-45f4-f99c029c896d",
Synchronized="2017-08-05 16:52:54.0")
/** Column name IsServerProcess */
public static final String COLUMNNAME_IsServerProcess = "IsServerProcess";
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

@XendraTrl(Identifier="28d348aa-98b5-8c33-0344-fa89ee91e28e")
public static String es_PE_FIELD_Task_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="28d348aa-98b5-8c33-0344-fa89ee91e28e")
public static String es_PE_FIELD_Task_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="28d348aa-98b5-8c33-0344-fa89ee91e28e")
public static String es_PE_FIELD_Task_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="616aa6a0-225e-ce6d-f549-2cba9ff66f08",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="28d348aa-98b5-8c33-0344-fa89ee91e28e")
public static final String FIELDNAME_Task_Name="28d348aa-98b5-8c33-0344-fa89ee91e28e";

@XendraTrl(Identifier="6fe13dad-e699-3b01-4d3f-d75f2b768466")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6fe13dad-e699-3b01-4d3f-d75f2b768466",
Synchronized="2017-08-05 16:52:54.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set OS Command.
@param OS_Command Operating System Command */
public void setOS_Command (String OS_Command)
{
if (OS_Command == null) throw new IllegalArgumentException ("OS_Command is mandatory.");
if (OS_Command.length() > 2000)
{
log.warning("Length > 2000 - truncated");
OS_Command = OS_Command.substring(0,1999);
}
set_Value (COLUMNNAME_OS_Command, OS_Command);
}
/** Get OS Command.
@return Operating System Command */
public String getOS_Command() 
{
String value = (String)get_Value(COLUMNNAME_OS_Command);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="54fc7d83-80e2-8314-14b6-d7e76faba90a")
public static String es_PE_FIELD_Task_OSCommand_Description="Comando del sistema operativo";

@XendraTrl(Identifier="54fc7d83-80e2-8314-14b6-d7e76faba90a")
public static String es_PE_FIELD_Task_OSCommand_Help="El comando del SO es para definir opcionalmente un comando que será parte de esta tarea. Por Ej. Puede ser usado para iniciar un proceso de respaldo ó para ejecutar una transferencia de archivos";

@XendraTrl(Identifier="54fc7d83-80e2-8314-14b6-d7e76faba90a")
public static String es_PE_FIELD_Task_OSCommand_Name="Comando del SO";

@XendraField(AD_Column_ID="OS_Command",IsCentrallyMaintained=true,
AD_Tab_ID="616aa6a0-225e-ce6d-f549-2cba9ff66f08",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="54fc7d83-80e2-8314-14b6-d7e76faba90a")
public static final String FIELDNAME_Task_OSCommand="54fc7d83-80e2-8314-14b6-d7e76faba90a";

@XendraTrl(Identifier="7bac4617-f7a4-a875-ca21-0476c8408289")
public static String es_PE_COLUMN_OS_Command_Name="Comando del SO";

@XendraColumn(AD_Element_ID="19626fee-08d7-5044-4a4c-aef5a08f3a5d",ColumnName="OS_Command",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7bac4617-f7a4-a875-ca21-0476c8408289",
Synchronized="2017-08-05 16:52:54.0")
/** Column name OS_Command */
public static final String COLUMNNAME_OS_Command = "OS_Command";
}
