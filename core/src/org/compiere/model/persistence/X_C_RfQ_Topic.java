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
/** Generated Model for C_RfQ_Topic
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_RfQ_Topic extends PO
{
/** Standard Constructor
@param ctx context
@param C_RfQ_Topic_ID id
@param trxName transaction
*/
public X_C_RfQ_Topic (Properties ctx, int C_RfQ_Topic_ID, String trxName)
{
super (ctx, C_RfQ_Topic_ID, trxName);
/** if (C_RfQ_Topic_ID == 0)
{
setC_RfQ_Topic_ID (0);
setIsSelfService (false);	
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
public X_C_RfQ_Topic (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=671 */
public static int Table_ID=MTable.getTable_ID("C_RfQ_Topic");

@XendraTrl(Identifier="90503484-6010-f0e6-4e50-1d09f1deec8e")
public static String es_PE_TAB_Topic_Description="Solicitud para el Asunto de la Cita";

@XendraTrl(Identifier="90503484-6010-f0e6-4e50-1d09f1deec8e")
public static String es_PE_TAB_Topic_Name="Asunto";

@XendraTrl(Identifier="90503484-6010-f0e6-4e50-1d09f1deec8e")
public static String es_PE_TAB_Topic_Help="Un pedido de asunto de la cita permite que usted mantenga una lista del suscriptor de vendedores potenciales para responder a RfQs";

@XendraTab(Name="Topic",Description="Request for Quotation Topic",
Help="A Request for Quotation Topic allows you to maintain a subscriber list of potential Vendors to respond to RfQs",
AD_Window_ID="84f4c768-9e31-b7c2-85a4-97fc1fd84d22",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="90503484-6010-f0e6-4e50-1d09f1deec8e",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Topic="90503484-6010-f0e6-4e50-1d09f1deec8e";

@XendraTrl(Identifier="2c81b8b2-fcf6-32f5-9bbe-bdbfc9d6e5cc")
public static String es_PE_TABLE_C_RfQ_Topic_Name="Asunto SPC (RfQ)";

@XendraTable(Name="RfQ Topic",Description="Topic for Request for Quotations",Help="",
TableName="C_RfQ_Topic",AccessLevel="3",AD_Window_ID="84f4c768-9e31-b7c2-85a4-97fc1fd84d22",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=125,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="2c81b8b2-fcf6-32f5-9bbe-bdbfc9d6e5cc",Synchronized="2017-08-16 11:42:27.0")
/** TableName=C_RfQ_Topic */
public static final String Table_Name="C_RfQ_Topic";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_RfQ_Topic");

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
    Table_ID = MTable.getTable_ID("C_RfQ_Topic");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_RfQ_Topic[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Print Format.
@param AD_PrintFormat_ID Data Print Format */
public void setAD_PrintFormat_ID (int AD_PrintFormat_ID)
{
if (AD_PrintFormat_ID <= 0) set_Value (COLUMNNAME_AD_PrintFormat_ID, null);
 else 
set_Value (COLUMNNAME_AD_PrintFormat_ID, Integer.valueOf(AD_PrintFormat_ID));
}
/** Get Print Format.
@return Data Print Format */
public int getAD_PrintFormat_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_PrintFormat_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e558308b-4572-a4ce-20b7-2fb497328b06")
public static String es_PE_FIELD_Topic_PrintFormat_Description="Formato de Impresión de datos";

@XendraTrl(Identifier="e558308b-4572-a4ce-20b7-2fb497328b06")
public static String es_PE_FIELD_Topic_PrintFormat_Help="El formato de impresión determina como se despliegan los datos para la impresión";

@XendraTrl(Identifier="e558308b-4572-a4ce-20b7-2fb497328b06")
public static String es_PE_FIELD_Topic_PrintFormat_Name="Formato de Impresión";

@XendraField(AD_Column_ID="AD_PrintFormat_ID",IsCentrallyMaintained=true,
AD_Tab_ID="90503484-6010-f0e6-4e50-1d09f1deec8e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e558308b-4572-a4ce-20b7-2fb497328b06")
public static final String FIELDNAME_Topic_PrintFormat="e558308b-4572-a4ce-20b7-2fb497328b06";

@XendraTrl(Identifier="8cd9e88e-eef8-fd74-84b4-82c0ea40c6f0")
public static String es_PE_COLUMN_AD_PrintFormat_ID_Name="Formato de Impresión";

@XendraColumn(AD_Element_ID="3d4916cb-0ecd-15a5-1916-be4c68c10d1f",ColumnName="AD_PrintFormat_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8cd9e88e-eef8-fd74-84b4-82c0ea40c6f0",
Synchronized="2017-08-05 16:54:25.0")
/** Column name AD_PrintFormat_ID */
public static final String COLUMNNAME_AD_PrintFormat_ID = "AD_PrintFormat_ID";
/** Set RfQ Topic.
@param C_RfQ_Topic_ID Topic for Request for Quotations */
public void setC_RfQ_Topic_ID (int C_RfQ_Topic_ID)
{
if (C_RfQ_Topic_ID < 1) throw new IllegalArgumentException ("C_RfQ_Topic_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_RfQ_Topic_ID, Integer.valueOf(C_RfQ_Topic_ID));
}
/** Get RfQ Topic.
@return Topic for Request for Quotations */
public int getC_RfQ_Topic_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_RfQ_Topic_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9ee107a4-383e-cf0a-b70c-651af190b7df")
public static String es_PE_FIELD_Topic_RfQTopic_Description="Asunto para la petición de citas";

@XendraTrl(Identifier="9ee107a4-383e-cf0a-b70c-651af190b7df")
public static String es_PE_FIELD_Topic_RfQTopic_Help="Un asunto para la petición de citas permite que usted mantenga una lista del suscriptor de vendedores potenciales para responder a RfQs";

@XendraTrl(Identifier="9ee107a4-383e-cf0a-b70c-651af190b7df")
public static String es_PE_FIELD_Topic_RfQTopic_Name="Asunto SPC (RfQ)";

@XendraField(AD_Column_ID="C_RfQ_Topic_ID",IsCentrallyMaintained=true,
AD_Tab_ID="90503484-6010-f0e6-4e50-1d09f1deec8e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9ee107a4-383e-cf0a-b70c-651af190b7df")
public static final String FIELDNAME_Topic_RfQTopic="9ee107a4-383e-cf0a-b70c-651af190b7df";
/** Column name C_RfQ_Topic_ID */
public static final String COLUMNNAME_C_RfQ_Topic_ID = "C_RfQ_Topic_ID";
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

@XendraTrl(Identifier="e1fd6260-b903-9bfc-88d5-c82a0eb5935b")
public static String es_PE_FIELD_Topic_Description_Description="Observación";

@XendraTrl(Identifier="e1fd6260-b903-9bfc-88d5-c82a0eb5935b")
public static String es_PE_FIELD_Topic_Description_Help="Observación";

@XendraTrl(Identifier="e1fd6260-b903-9bfc-88d5-c82a0eb5935b")
public static String es_PE_FIELD_Topic_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="90503484-6010-f0e6-4e50-1d09f1deec8e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e1fd6260-b903-9bfc-88d5-c82a0eb5935b")
public static final String FIELDNAME_Topic_Description="e1fd6260-b903-9bfc-88d5-c82a0eb5935b";

@XendraTrl(Identifier="3f1734a6-7630-1ea9-b822-2b7129e9b32f")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3f1734a6-7630-1ea9-b822-2b7129e9b32f",
Synchronized="2017-08-05 16:54:25.0")
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
@XendraTrl(Identifier="6cc8bb69-b4fb-454e-b1c9-6cfa7eeb39eb")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6cc8bb69-b4fb-454e-b1c9-6cfa7eeb39eb",
Synchronized="2017-08-05 16:54:25.0")
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

@XendraTrl(Identifier="323bae67-7b67-e3fc-db89-528337dea191")
public static String es_PE_FIELD_Topic_Self_Service_Description="Esta es una entrada del autoservicio ó esta entrada se puede cambiar vía autoservicio";

@XendraTrl(Identifier="323bae67-7b67-e3fc-db89-528337dea191")
public static String es_PE_FIELD_Topic_Self_Service_Help="El autoservicio permite que los usuarios incorporen datos o que pongan al día sus datos. La bandera indica, que este expediente fue incorporado o creado vía autoservicio o que el usuario puede cambiarlo vía funcionalidad del autoservicio.";

@XendraTrl(Identifier="323bae67-7b67-e3fc-db89-528337dea191")
public static String es_PE_FIELD_Topic_Self_Service_Name="Auto-Servicio";

@XendraField(AD_Column_ID="IsSelfService",IsCentrallyMaintained=true,
AD_Tab_ID="90503484-6010-f0e6-4e50-1d09f1deec8e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="323bae67-7b67-e3fc-db89-528337dea191")
public static final String FIELDNAME_Topic_Self_Service="323bae67-7b67-e3fc-db89-528337dea191";

@XendraTrl(Identifier="000f0380-3d23-d405-5d28-e52a7554f6f6")
public static String es_PE_COLUMN_IsSelfService_Name="Auto-Servicio";

@XendraColumn(AD_Element_ID="8f201030-f9ab-66d2-f4de-7209f41f2af8",ColumnName="IsSelfService",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="000f0380-3d23-d405-5d28-e52a7554f6f6",
Synchronized="2017-08-05 16:54:25.0")
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

@XendraTrl(Identifier="6b96e5dc-b8a1-5781-2ffa-0a0871c7e620")
public static String es_PE_FIELD_Topic_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="6b96e5dc-b8a1-5781-2ffa-0a0871c7e620")
public static String es_PE_FIELD_Topic_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="6b96e5dc-b8a1-5781-2ffa-0a0871c7e620")
public static String es_PE_FIELD_Topic_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="90503484-6010-f0e6-4e50-1d09f1deec8e",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="6b96e5dc-b8a1-5781-2ffa-0a0871c7e620")
public static final String FIELDNAME_Topic_Name="6b96e5dc-b8a1-5781-2ffa-0a0871c7e620";

@XendraTrl(Identifier="ed922ae6-185a-5ab8-622c-b9bc888f3eac")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ed922ae6-185a-5ab8-622c-b9bc888f3eac",
Synchronized="2017-08-05 16:54:25.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
}
