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
import org.compiere.model.reference.REF_AD_TableReplicationType;
import org.compiere.model.reference.REF_AD_SystemStatus;
/** Generated Model for AD_System
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_System extends PO
{
/** Standard Constructor
@param ctx context
@param AD_System_ID id
@param trxName transaction
*/
public X_AD_System (Properties ctx, int AD_System_ID, String trxName)
{
super (ctx, AD_System_ID, trxName);
/** if (AD_System_ID == 0)
{
setAD_System_ID (0);
setInfo (null);
setIsAllowStatistics (false);	
// N
setIsAutoErrorReport (true);	
// Y
setName (null);
setPassword (null);
setReplicationType (null);	
// L
setSystemStatus (null);	
// E
setUserName (null);
setVersion (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_System (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=531 */
public static int Table_ID=MTable.getTable_ID("AD_System");

@XendraTrl(Identifier="25c982fb-cd69-413f-011a-940abfedaa07")
public static String es_PE_TAB_System_Description="Definición del Sistema";

@XendraTrl(Identifier="25c982fb-cd69-413f-011a-940abfedaa07")
public static String es_PE_TAB_System_Name="Sistema";

@XendraTrl(Identifier="25c982fb-cd69-413f-011a-940abfedaa07")
public static String es_PE_TAB_System_Help="Definición de sistema común. No crea registros adicionales.";

@XendraTab(Name="System",Description="System Definition",Help="Common System Definition.",
AD_Window_ID="6b15298d-116c-80c3-f339-7758e69ebdba",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=false,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="25c982fb-cd69-413f-011a-940abfedaa07",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_System="25c982fb-cd69-413f-011a-940abfedaa07";

@XendraTrl(Identifier="0b6b35c8-23f7-aae5-dceb-a8a1916511b7")
public static String es_PE_TABLE_AD_System_Name="Sistema";

@XendraTable(Name="System",Description="System Definition",Help="",TableName="AD_System",
AccessLevel="4",AD_Window_ID="6b15298d-116c-80c3-f339-7758e69ebdba",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=140,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="0b6b35c8-23f7-aae5-dceb-a8a1916511b7",Synchronized="2017-08-16 11:41:00.0")
/** TableName=AD_System */
public static final String Table_Name="AD_System";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_System");

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
    Table_ID = MTable.getTable_ID("AD_System");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_System[").append(get_ID()).append("]");
return sb.toString();
}
/** Set System.
@param AD_System_ID System Definition */
public void setAD_System_ID (int AD_System_ID)
{
if (AD_System_ID < 1) throw new IllegalArgumentException ("AD_System_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_System_ID, Integer.valueOf(AD_System_ID));
}
/** Get System.
@return System Definition */
public int getAD_System_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_System_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="53b17414-4998-0feb-e1a6-e2ab2ac2592f")
public static String es_PE_FIELD_System_System_Description="Definición del sistema";

@XendraTrl(Identifier="53b17414-4998-0feb-e1a6-e2ab2ac2592f")
public static String es_PE_FIELD_System_System_Help="Definición del sistema común";

@XendraTrl(Identifier="53b17414-4998-0feb-e1a6-e2ab2ac2592f")
public static String es_PE_FIELD_System_System_Name="Sistema";

@XendraField(AD_Column_ID="AD_System_ID",IsCentrallyMaintained=true,
AD_Tab_ID="25c982fb-cd69-413f-011a-940abfedaa07",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="53b17414-4998-0feb-e1a6-e2ab2ac2592f")
public static final String FIELDNAME_System_System="53b17414-4998-0feb-e1a6-e2ab2ac2592f";
/** Column name AD_System_ID */
public static final String COLUMNNAME_AD_System_ID = "AD_System_ID";
/** Set Custom Prefix.
@param CustomPrefix Prefix for Custom entities */
public void setCustomPrefix (String CustomPrefix)
{
if (CustomPrefix != null && CustomPrefix.length() > 60)
{
log.warning("Length > 60 - truncated");
CustomPrefix = CustomPrefix.substring(0,59);
}
set_Value (COLUMNNAME_CustomPrefix, CustomPrefix);
}
/** Get Custom Prefix.
@return Prefix for Custom entities */
public String getCustomPrefix() 
{
String value = (String)get_Value(COLUMNNAME_CustomPrefix);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="c4d06bdb-5879-6d2f-eb14-d411f7deac9c")
public static String es_PE_FIELD_System_CustomPrefix_Description="Prefijo para personalizar entidades.";

@XendraTrl(Identifier="c4d06bdb-5879-6d2f-eb14-d411f7deac9c")
public static String es_PE_FIELD_System_CustomPrefix_Help="El prefijo enumerado es ignorado como personalización para base de datos ó migración de la entidad.";

@XendraTrl(Identifier="c4d06bdb-5879-6d2f-eb14-d411f7deac9c")
public static String es_PE_FIELD_System_CustomPrefix_Name="Prefijo Personalizado";

@XendraField(AD_Column_ID="CustomPrefix",IsCentrallyMaintained=true,
AD_Tab_ID="25c982fb-cd69-413f-011a-940abfedaa07",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c4d06bdb-5879-6d2f-eb14-d411f7deac9c")
public static final String FIELDNAME_System_CustomPrefix="c4d06bdb-5879-6d2f-eb14-d411f7deac9c";

@XendraTrl(Identifier="ce4d4d80-3396-e9c0-94dc-b6d91b80d3ce")
public static String es_PE_COLUMN_CustomPrefix_Name="Prefijo Personalizado";

@XendraColumn(AD_Element_ID="4dd2087b-4d53-94ea-241d-46aa15596e00",ColumnName="CustomPrefix",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ce4d4d80-3396-e9c0-94dc-b6d91b80d3ce",
Synchronized="2017-08-05 16:52:51.0")
/** Column name CustomPrefix */
public static final String COLUMNNAME_CustomPrefix = "CustomPrefix";
/** Set DB Address.
@param DBAddress JDBC URL of the database server */
public void setDBAddress (String DBAddress)
{
if (DBAddress != null && DBAddress.length() > 255)
{
log.warning("Length > 255 - truncated");
DBAddress = DBAddress.substring(0,254);
}
set_Value (COLUMNNAME_DBAddress, DBAddress);
}
/** Get DB Address.
@return JDBC URL of the database server */
public String getDBAddress() 
{
String value = (String)get_Value(COLUMNNAME_DBAddress);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="e13dd671-9716-7c5a-159f-8a9560afa867")
public static String es_PE_FIELD_System_DBAddress_Description="Dirección de BD servidor";

@XendraTrl(Identifier="e13dd671-9716-7c5a-159f-8a9560afa867")
public static String es_PE_FIELD_System_DBAddress_Name="Dirección de BD Servidor";

@XendraField(AD_Column_ID="DBAddress",IsCentrallyMaintained=true,
AD_Tab_ID="25c982fb-cd69-413f-011a-940abfedaa07",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e13dd671-9716-7c5a-159f-8a9560afa867")
public static final String FIELDNAME_System_DBAddress="e13dd671-9716-7c5a-159f-8a9560afa867";

@XendraTrl(Identifier="66aed851-1c80-cec9-b8b5-e5f936d0c9a0")
public static String es_PE_COLUMN_DBAddress_Name="Dirección de BD Servidor";

@XendraColumn(AD_Element_ID="ec6efc21-e877-d4e1-1d31-67dac89f2532",ColumnName="DBAddress",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="66aed851-1c80-cec9-b8b5-e5f936d0c9a0",
Synchronized="2017-08-05 16:52:51.0")
/** Column name DBAddress */
public static final String COLUMNNAME_DBAddress = "DBAddress";
/** Set Database Name.
@param DBInstance Database Name */
public void setDBInstance (String DBInstance)
{
if (DBInstance != null && DBInstance.length() > 60)
{
log.warning("Length > 60 - truncated");
DBInstance = DBInstance.substring(0,59);
}
set_Value (COLUMNNAME_DBInstance, DBInstance);
}
/** Get Database Name.
@return Database Name */
public String getDBInstance() 
{
String value = (String)get_Value(COLUMNNAME_DBInstance);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="5054156c-12c4-7454-0418-4d313326d10f")
public static String es_PE_FIELD_System_DatabaseName_Description="Nombre de base de datos";

@XendraTrl(Identifier="5054156c-12c4-7454-0418-4d313326d10f")
public static String es_PE_FIELD_System_DatabaseName_Name="Nombre de Base de Datos";

@XendraField(AD_Column_ID="DBInstance",IsCentrallyMaintained=true,
AD_Tab_ID="25c982fb-cd69-413f-011a-940abfedaa07",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5054156c-12c4-7454-0418-4d313326d10f")
public static final String FIELDNAME_System_DatabaseName="5054156c-12c4-7454-0418-4d313326d10f";

@XendraTrl(Identifier="a172c09d-c9d2-65f6-7474-e41801933fce")
public static String es_PE_COLUMN_DBInstance_Name="Nombre de Base de Datos";

@XendraColumn(AD_Element_ID="8ed3ec7a-3910-eeaf-0160-900ea518e595",ColumnName="DBInstance",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a172c09d-c9d2-65f6-7474-e41801933fce",
Synchronized="2017-08-05 16:52:51.0")
/** Column name DBInstance */
public static final String COLUMNNAME_DBInstance = "DBInstance";
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

@XendraTrl(Identifier="85848d4f-feda-38ae-7843-b1a0de86a24e")
public static String es_PE_FIELD_System_Description_Description="Observación";

@XendraTrl(Identifier="85848d4f-feda-38ae-7843-b1a0de86a24e")
public static String es_PE_FIELD_System_Description_Help="Observación";

@XendraTrl(Identifier="85848d4f-feda-38ae-7843-b1a0de86a24e")
public static String es_PE_FIELD_System_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="25c982fb-cd69-413f-011a-940abfedaa07",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="85848d4f-feda-38ae-7843-b1a0de86a24e")
public static final String FIELDNAME_System_Description="85848d4f-feda-38ae-7843-b1a0de86a24e";

@XendraTrl(Identifier="968b4309-846d-b76e-c64f-5986febcf2ec")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="968b4309-846d-b76e-c64f-5986febcf2ec",
Synchronized="2017-08-05 16:52:51.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Encryption Class.
@param EncryptionKey Encryption Class used for securing data content */
public void setEncryptionKey (String EncryptionKey)
{
if (EncryptionKey != null && EncryptionKey.length() > 255)
{
log.warning("Length > 255 - truncated");
EncryptionKey = EncryptionKey.substring(0,254);
}
set_ValueNoCheck (COLUMNNAME_EncryptionKey, EncryptionKey);
}
/** Get Encryption Class.
@return Encryption Class used for securing data content */
public String getEncryptionKey() 
{
String value = (String)get_Value(COLUMNNAME_EncryptionKey);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="9ab3a9f4-6990-8309-58ec-4937031575d7")
public static String es_PE_FIELD_System_EncryptionClass_Description="Clave de encriptación utilizada para el contenido seguro de datos";

@XendraTrl(Identifier="9ab3a9f4-6990-8309-58ec-4937031575d7")
public static String es_PE_FIELD_System_EncryptionClass_Help="Observe que eso que cambia la llave hará todos los datos previamente cifrados ilegibles.";

@XendraTrl(Identifier="9ab3a9f4-6990-8309-58ec-4937031575d7")
public static String es_PE_FIELD_System_EncryptionClass_Name="Clave de Encriptación";

@XendraField(AD_Column_ID="EncryptionKey",IsCentrallyMaintained=true,
AD_Tab_ID="25c982fb-cd69-413f-011a-940abfedaa07",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9ab3a9f4-6990-8309-58ec-4937031575d7")
public static final String FIELDNAME_System_EncryptionClass="9ab3a9f4-6990-8309-58ec-4937031575d7";

@XendraTrl(Identifier="35c4d249-6770-16d6-eb29-2831e416577a")
public static String es_PE_COLUMN_EncryptionKey_Name="Clave de Encriptación";

@XendraColumn(AD_Element_ID="645db4e9-b31b-4fb5-fb58-60da622e2c23",ColumnName="EncryptionKey",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="35c4d249-6770-16d6-eb29-2831e416577a",
Synchronized="2017-08-05 16:52:51.0")
/** Column name EncryptionKey */
public static final String COLUMNNAME_EncryptionKey = "EncryptionKey";
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
@XendraTrl(Identifier="5a0e3cfb-e356-45f8-81c9-bf9174242060")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5a0e3cfb-e356-45f8-81c9-bf9174242060",
Synchronized="2017-08-05 16:52:51.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set ID Range End.
@param IDRangeEnd End if the ID Range used */
public void setIDRangeEnd (BigDecimal IDRangeEnd)
{
set_Value (COLUMNNAME_IDRangeEnd, IDRangeEnd);
}
/** Get ID Range End.
@return End if the ID Range used */
public BigDecimal getIDRangeEnd() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_IDRangeEnd);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="e07dd7a0-7015-d8e6-9e9b-f902952917dd")
public static String es_PE_FIELD_System_IDRangeEnd_Description="ID final del Rango";

@XendraTrl(Identifier="e07dd7a0-7015-d8e6-9e9b-f902952917dd")
public static String es_PE_FIELD_System_IDRangeEnd_Help="El ID permitirá restringir el rango de IDs internacionalmente usadas. Observe porfavor que el rango de ID no se cumple.";

@XendraTrl(Identifier="e07dd7a0-7015-d8e6-9e9b-f902952917dd")
public static String es_PE_FIELD_System_IDRangeEnd_Name="ID Fin de Rango";

@XendraField(AD_Column_ID="IDRangeEnd",IsCentrallyMaintained=true,
AD_Tab_ID="25c982fb-cd69-413f-011a-940abfedaa07",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ReplicationType@!L",DisplayLength=26,IsReadOnly=false,SeqNo=160,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="e07dd7a0-7015-d8e6-9e9b-f902952917dd")
public static final String FIELDNAME_System_IDRangeEnd="e07dd7a0-7015-d8e6-9e9b-f902952917dd";

@XendraTrl(Identifier="187da913-5b8c-40ed-b2ff-f40716489397")
public static String es_PE_COLUMN_IDRangeEnd_Name="ID Fin de Rango";

@XendraColumn(AD_Element_ID="ee020a71-c680-221e-4faf-5eb02df2afbd",ColumnName="IDRangeEnd",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="187da913-5b8c-40ed-b2ff-f40716489397",
Synchronized="2017-08-05 16:52:51.0")
/** Column name IDRangeEnd */
public static final String COLUMNNAME_IDRangeEnd = "IDRangeEnd";
/** Set ID Range Start.
@param IDRangeStart Start of the ID Range used */
public void setIDRangeStart (BigDecimal IDRangeStart)
{
set_Value (COLUMNNAME_IDRangeStart, IDRangeStart);
}
/** Get ID Range Start.
@return Start of the ID Range used */
public BigDecimal getIDRangeStart() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_IDRangeStart);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="e25e6814-c2f5-f7a3-c622-3e814bf6fb39")
public static String es_PE_FIELD_System_IDRangeStart_Description="Inicio del ID de Rango";

@XendraTrl(Identifier="e25e6814-c2f5-f7a3-c622-3e814bf6fb39")
public static String es_PE_FIELD_System_IDRangeStart_Help="El rango de ID permite restringir el rango de las IDs internacionalmente usadas. Las rangos estándares son 0-899.999 para el diccionario de aplicación 900,000-999,999 por diccionario de aplicación. Arreglos de requisitos/extensiones y > 1.000.000 para los datos del cliente. El límite estándar del sistema es 9.999.999.999 pero puede fácilmente ser extendido. El rango de la ID esta por base de la tabla. Observe porfavor que el rango de la ID no se cumple.";

@XendraTrl(Identifier="e25e6814-c2f5-f7a3-c622-3e814bf6fb39")
public static String es_PE_FIELD_System_IDRangeStart_Name="ID Inicio de rango";

@XendraField(AD_Column_ID="IDRangeStart",IsCentrallyMaintained=true,
AD_Tab_ID="25c982fb-cd69-413f-011a-940abfedaa07",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ReplicationType@!L",DisplayLength=26,IsReadOnly=false,SeqNo=150,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="e25e6814-c2f5-f7a3-c622-3e814bf6fb39")
public static final String FIELDNAME_System_IDRangeStart="e25e6814-c2f5-f7a3-c622-3e814bf6fb39";

@XendraTrl(Identifier="d7ee86eb-d6c7-d343-f63e-2ad45948bc58")
public static String es_PE_COLUMN_IDRangeStart_Name="ID Inicio de rango";

@XendraColumn(AD_Element_ID="0b89c124-6939-2611-72c5-5e946a24790d",ColumnName="IDRangeStart",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d7ee86eb-d6c7-d343-f63e-2ad45948bc58",
Synchronized="2017-08-05 16:52:51.0")
/** Column name IDRangeStart */
public static final String COLUMNNAME_IDRangeStart = "IDRangeStart";
/** Set Info.
@param Info Information */
public void setInfo (String Info)
{
if (Info == null) throw new IllegalArgumentException ("Info is mandatory.");
if (Info.length() > 255)
{
log.warning("Length > 255 - truncated");
Info = Info.substring(0,254);
}
set_ValueNoCheck (COLUMNNAME_Info, Info);
}
/** Get Info.
@return Information */
public String getInfo() 
{
String value = (String)get_Value(COLUMNNAME_Info);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="d7138e76-c2c6-d0ec-fd35-0b11a16f382e")
public static String es_PE_FIELD_System_Info_Description="Información";

@XendraTrl(Identifier="d7138e76-c2c6-d0ec-fd35-0b11a16f382e")
public static String es_PE_FIELD_System_Info_Help="La Información despliega datos desde la línea del documento fuente";

@XendraTrl(Identifier="d7138e76-c2c6-d0ec-fd35-0b11a16f382e")
public static String es_PE_FIELD_System_Info_Name="Información";
@XendraField(AD_Column_ID="Info",
IsCentrallyMaintained=true,AD_Tab_ID="25c982fb-cd69-413f-011a-940abfedaa07",AD_FieldGroup_ID="",
IsDisplayed=false,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="d7138e76-c2c6-d0ec-fd35-0b11a16f382e")
public static final String FIELDNAME_System_Info="d7138e76-c2c6-d0ec-fd35-0b11a16f382e";

@XendraTrl(Identifier="acb73bfb-bc6b-62c3-df5b-3819cb4c1d04")
public static String es_PE_COLUMN_Info_Name="Información";

@XendraColumn(AD_Element_ID="ab412fab-8336-50a9-21d9-30571bb98ce1",ColumnName="Info",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="acb73bfb-bc6b-62c3-df5b-3819cb4c1d04",
Synchronized="2017-08-05 16:52:51.0")
/** Column name Info */
public static final String COLUMNNAME_Info = "Info";
/** Set Maintain Statistics.
@param IsAllowStatistics Maintain general statistics */
public void setIsAllowStatistics (boolean IsAllowStatistics)
{
set_Value (COLUMNNAME_IsAllowStatistics, Boolean.valueOf(IsAllowStatistics));
}
/** Get Maintain Statistics.
@return Maintain general statistics */
public boolean isAllowStatistics() 
{
Object oo = get_Value(COLUMNNAME_IsAllowStatistics);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="382796a9-5efe-c031-e50f-cc3ead8542a9")
public static String es_PE_FIELD_System_MaintainStatistics_Description="Permite transferir estadisticas generales (número de clientes, org, socios de negocio, usuarios, productos, facturas)";

@XendraTrl(Identifier="382796a9-5efe-c031-e50f-cc3ead8542a9")
public static String es_PE_FIELD_System_MaintainStatistics_Help="Permite transferir estadisticas generales (número de clientes, org, socios de negocio, usuarios, productos, facturas) para conseguir una mejor sensación para el tamaño de aplicación. Esta información no se publica.";

@XendraTrl(Identifier="382796a9-5efe-c031-e50f-cc3ead8542a9")
public static String es_PE_FIELD_System_MaintainStatistics_Name="Permite Estadística";

@XendraField(AD_Column_ID="IsAllowStatistics",IsCentrallyMaintained=true,
AD_Tab_ID="25c982fb-cd69-413f-011a-940abfedaa07",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="382796a9-5efe-c031-e50f-cc3ead8542a9")
public static final String FIELDNAME_System_MaintainStatistics="382796a9-5efe-c031-e50f-cc3ead8542a9";

@XendraTrl(Identifier="19ede823-eb15-1426-900a-360505a8fc5b")
public static String es_PE_COLUMN_IsAllowStatistics_Name="Permite Estadística";

@XendraColumn(AD_Element_ID="ba839339-1212-bbcb-1234-578d7f545909",ColumnName="IsAllowStatistics",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="19ede823-eb15-1426-900a-360505a8fc5b",
Synchronized="2017-08-05 16:52:51.0")
/** Column name IsAllowStatistics */
public static final String COLUMNNAME_IsAllowStatistics = "IsAllowStatistics";
/** Set Error Reporting.
@param IsAutoErrorReport Automatically report Errors */
public void setIsAutoErrorReport (boolean IsAutoErrorReport)
{
set_Value (COLUMNNAME_IsAutoErrorReport, Boolean.valueOf(IsAutoErrorReport));
}
/** Get Error Reporting.
@return Automatically report Errors */
public boolean isAutoErrorReport() 
{
Object oo = get_Value(COLUMNNAME_IsAutoErrorReport);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="676ea021-33f9-10dd-5543-b1706472462d")
public static String es_PE_FIELD_System_ErrorReporting_Description="Reporta Errores Automáticamente";

@XendraTrl(Identifier="676ea021-33f9-10dd-5543-b1706472462d")
public static String es_PE_FIELD_System_ErrorReporting_Help="Para automatizar el reporte de errores, emvie los errores a Adempiere. Solamente información (seguimiento de pila) es enviada (No datos o Información confidencial). Esto nos ayuda a responder rápidamente. Si usted tiene un contrato de soporte, le informaremos sobre las medidas correctivas. Hasta el momento, esta funcionalidad es experimental.";

@XendraTrl(Identifier="676ea021-33f9-10dd-5543-b1706472462d")
public static String es_PE_FIELD_System_ErrorReporting_Name="Reportando Error ";

@XendraField(AD_Column_ID="IsAutoErrorReport",IsCentrallyMaintained=true,
AD_Tab_ID="25c982fb-cd69-413f-011a-940abfedaa07",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="676ea021-33f9-10dd-5543-b1706472462d")
public static final String FIELDNAME_System_ErrorReporting="676ea021-33f9-10dd-5543-b1706472462d";

@XendraTrl(Identifier="3d6664e3-3321-88cf-de54-1286de412029")
public static String es_PE_COLUMN_IsAutoErrorReport_Name="Reportando Error ";

@XendraColumn(AD_Element_ID="c3747496-6c58-22fb-fa86-e4504a0a76fa",ColumnName="IsAutoErrorReport",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3d6664e3-3321-88cf-de54-1286de412029",
Synchronized="2017-08-05 16:52:51.0")
/** Column name IsAutoErrorReport */
public static final String COLUMNNAME_IsAutoErrorReport = "IsAutoErrorReport";
/** Set isFailOnMissingModelValidator.
@param isFailOnMissingModelValidator isFailOnMissingModelValidator */
public void setisFailOnMissingModelValidator (boolean isFailOnMissingModelValidator)
{
set_Value (COLUMNNAME_isFailOnMissingModelValidator, Boolean.valueOf(isFailOnMissingModelValidator));
}
/** Get isFailOnMissingModelValidator.
@return isFailOnMissingModelValidator */
public boolean isFailOnMissingModelValidator() 
{
Object oo = get_Value(COLUMNNAME_isFailOnMissingModelValidator);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="1dbe0e9d-fc67-9c61-54f5-b38b4a167e7f")
public static String es_PE_COLUMN_isFailOnMissingModelValidator_Name="isfailonmissingmodelvalidator";

@XendraColumn(AD_Element_ID="03fed51c-18b8-117c-760b-2b83918755e0",
ColumnName="isFailOnMissingModelValidator",AD_Reference_ID=20,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="1dbe0e9d-fc67-9c61-54f5-b38b4a167e7f",Synchronized="2017-08-05 16:52:51.0")
/** Column name isFailOnMissingModelValidator */
public static final String COLUMNNAME_isFailOnMissingModelValidator = "isFailOnMissingModelValidator";
/** Set Just Migrated.
@param IsJustMigrated Value set by Migration for post-Migation tasks. */
public void setIsJustMigrated (boolean IsJustMigrated)
{
set_Value (COLUMNNAME_IsJustMigrated, Boolean.valueOf(IsJustMigrated));
}
/** Get Just Migrated.
@return Value set by Migration for post-Migation tasks. */
public boolean isJustMigrated() 
{
Object oo = get_Value(COLUMNNAME_IsJustMigrated);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="e729945d-0061-88b7-e868-9f58f17e37fb")
public static String es_PE_FIELD_System_JustMigrated_Description="Sistema de valor de migración para las tareas de post - migración.";

@XendraTrl(Identifier="e729945d-0061-88b7-e868-9f58f17e37fb")
public static String es_PE_FIELD_System_JustMigrated_Name="Sólo para Migración";

@XendraField(AD_Column_ID="IsJustMigrated",IsCentrallyMaintained=true,
AD_Tab_ID="25c982fb-cd69-413f-011a-940abfedaa07",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e729945d-0061-88b7-e868-9f58f17e37fb")
public static final String FIELDNAME_System_JustMigrated="e729945d-0061-88b7-e868-9f58f17e37fb";

@XendraTrl(Identifier="92a44356-3be7-b93d-d23a-490eefd736fc")
public static String es_PE_COLUMN_IsJustMigrated_Name="Sólo para Migración";

@XendraColumn(AD_Element_ID="1cce3638-3fa8-0262-9f5f-7a0e6a0452d9",ColumnName="IsJustMigrated",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="92a44356-3be7-b93d-d23a-490eefd736fc",
Synchronized="2017-08-05 16:52:51.0")
/** Column name IsJustMigrated */
public static final String COLUMNNAME_IsJustMigrated = "IsJustMigrated";
/** Set LDAP Domain.
@param LDAPDomain Directory service domain NAME - e.g. adempiere.org */
public void setLDAPDomain (String LDAPDomain)
{
if (LDAPDomain != null && LDAPDomain.length() > 255)
{
log.warning("Length > 255 - truncated");
LDAPDomain = LDAPDomain.substring(0,254);
}
set_Value (COLUMNNAME_LDAPDomain, LDAPDomain);
}
/** Get LDAP Domain.
@return Directory service domain NAME - e.g. adempiere.org */
public String getLDAPDomain() 
{
String value = (String)get_Value(COLUMNNAME_LDAPDomain);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="5280622d-a6e6-443b-4682-2e1d51f38136")
public static String es_PE_FIELD_System_LDAPDomain_Description="Directorio de servicios de consultas en secuencia.";

@XendraTrl(Identifier="5280622d-a6e6-443b-4682-2e1d51f38136")
public static String es_PE_FIELD_System_LDAPDomain_Name="LDAP Consulta";

@XendraField(AD_Column_ID="LDAPDomain",IsCentrallyMaintained=true,
AD_Tab_ID="25c982fb-cd69-413f-011a-940abfedaa07",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=25,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5280622d-a6e6-443b-4682-2e1d51f38136")
public static final String FIELDNAME_System_LDAPDomain="5280622d-a6e6-443b-4682-2e1d51f38136";

@XendraTrl(Identifier="0cf89294-a4e8-2630-5cb7-8906687aa8a4")
public static String es_PE_COLUMN_LDAPDomain_Name="LDAP Consulta";

@XendraColumn(AD_Element_ID="4b352a77-31e4-6947-3dd2-ccf951b16a09",ColumnName="LDAPDomain",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0cf89294-a4e8-2630-5cb7-8906687aa8a4",
Synchronized="2017-08-05 16:52:51.0")
/** Column name LDAPDomain */
public static final String COLUMNNAME_LDAPDomain = "LDAPDomain";
/** Set LDAP URL.
@param LDAPHost Connection String to LDAP server starting with ldap:// */
public void setLDAPHost (String LDAPHost)
{
if (LDAPHost != null && LDAPHost.length() > 60)
{
log.warning("Length > 60 - truncated");
LDAPHost = LDAPHost.substring(0,59);
}
set_Value (COLUMNNAME_LDAPHost, LDAPHost);
}
/** Get LDAP URL.
@return Connection String to LDAP server starting with ldap:// */
public String getLDAPHost() 
{
String value = (String)get_Value(COLUMNNAME_LDAPHost);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="ecdb6be5-c651-73d9-0469-89eab451271a")
public static String es_PE_FIELD_System_LDAPURL_Description="Nombre ó IP para el servidor de LDAP";

@XendraTrl(Identifier="ecdb6be5-c651-73d9-0469-89eab451271a")
public static String es_PE_FIELD_System_LDAPURL_Help="Nombre ó dirección IP del diretorio de servicio del servidor de LDAP.";

@XendraTrl(Identifier="ecdb6be5-c651-73d9-0469-89eab451271a")
public static String es_PE_FIELD_System_LDAPURL_Name="LDAP Host";

@XendraField(AD_Column_ID="LDAPHost",IsCentrallyMaintained=true,
AD_Tab_ID="25c982fb-cd69-413f-011a-940abfedaa07",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ecdb6be5-c651-73d9-0469-89eab451271a")
public static final String FIELDNAME_System_LDAPURL="ecdb6be5-c651-73d9-0469-89eab451271a";

@XendraTrl(Identifier="d35962d0-de3a-cad2-b910-f3032882bdbb")
public static String es_PE_COLUMN_LDAPHost_Name="LDAP Host";

@XendraColumn(AD_Element_ID="ac64c287-83ba-f383-52e2-bae7b088b5ad",ColumnName="LDAPHost",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d35962d0-de3a-cad2-b910-f3032882bdbb",
Synchronized="2017-08-05 16:52:51.0")
/** Column name LDAPHost */
public static final String COLUMNNAME_LDAPHost = "LDAPHost";
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

@XendraTrl(Identifier="93dc018e-aecf-8ed2-e009-3d2280dc1d43")
public static String es_PE_FIELD_System_SystemName_Description="Name your Adempiere System installation, e.g. Joe Block, Inc.";

@XendraTrl(Identifier="93dc018e-aecf-8ed2-e009-3d2280dc1d43")
public static String es_PE_FIELD_System_SystemName_Help="The name if the system to differentiate support contracts";

@XendraTrl(Identifier="93dc018e-aecf-8ed2-e009-3d2280dc1d43")
public static String es_PE_FIELD_System_SystemName_Name="System Name";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=false,
AD_Tab_ID="25c982fb-cd69-413f-011a-940abfedaa07",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=10,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="93dc018e-aecf-8ed2-e009-3d2280dc1d43")
public static final String FIELDNAME_System_SystemName="93dc018e-aecf-8ed2-e009-3d2280dc1d43";

@XendraTrl(Identifier="e38b6874-b476-e47b-969f-0e5089b48ba1")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,
ReadOnlyLogic="@OldName@!'",IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",
ValueMin="",ValueMax="",Version="1",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e38b6874-b476-e47b-969f-0e5089b48ba1",Synchronized="2017-08-05 16:52:51.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Processors.
@param NoProcessors Number of Database Processors */
public void setNoProcessors (int NoProcessors)
{
set_Value (COLUMNNAME_NoProcessors, Integer.valueOf(NoProcessors));
}
/** Get Processors.
@return Number of Database Processors */
public int getNoProcessors() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_NoProcessors);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="48436a4a-7716-db45-e5d3-9e7e6775ffe7")
public static String es_PE_FIELD_System_Processors_Description="Número de los procesadores de la base de datos.";

@XendraTrl(Identifier="48436a4a-7716-db45-e5d3-9e7e6775ffe7")
public static String es_PE_FIELD_System_Processors_Name="Procesadores";

@XendraField(AD_Column_ID="NoProcessors",IsCentrallyMaintained=true,
AD_Tab_ID="25c982fb-cd69-413f-011a-940abfedaa07",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=true,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="48436a4a-7716-db45-e5d3-9e7e6775ffe7")
public static final String FIELDNAME_System_Processors="48436a4a-7716-db45-e5d3-9e7e6775ffe7";

@XendraTrl(Identifier="652649a8-fa0f-966a-1dbb-b2e6ca7f9e26")
public static String es_PE_COLUMN_NoProcessors_Name="Procesadores";

@XendraColumn(AD_Element_ID="1a116043-48ec-cc52-ed81-157b9a1871da",ColumnName="NoProcessors",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="652649a8-fa0f-966a-1dbb-b2e6ca7f9e26",
Synchronized="2017-08-05 16:52:51.0")
/** Column name NoProcessors */
public static final String COLUMNNAME_NoProcessors = "NoProcessors";
/** Set Old Name.
@param OldName Old Name */
public void setOldName (String OldName)
{
if (OldName != null && OldName.length() > 60)
{
log.warning("Length > 60 - truncated");
OldName = OldName.substring(0,59);
}
set_ValueNoCheck (COLUMNNAME_OldName, OldName);
}
/** Get Old Name.
@return Old Name */
public String getOldName() 
{
String value = (String)get_Value(COLUMNNAME_OldName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="b5219f68-5375-10f4-503f-5f090cee2093")
public static String es_PE_FIELD_System_OldName_Name="Nombre Anteriór";

@XendraField(AD_Column_ID="OldName",IsCentrallyMaintained=true,
AD_Tab_ID="25c982fb-cd69-413f-011a-940abfedaa07",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b5219f68-5375-10f4-503f-5f090cee2093")
public static final String FIELDNAME_System_OldName="b5219f68-5375-10f4-503f-5f090cee2093";

@XendraTrl(Identifier="08930a96-ca1c-8173-a977-4993b208f2ad")
public static String es_PE_COLUMN_OldName_Name="Nombre Anteriór";

@XendraColumn(AD_Element_ID="ac9ccfbd-cc46-ac5b-5d96-e8a52cda68b5",ColumnName="OldName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="08930a96-ca1c-8173-a977-4993b208f2ad",
Synchronized="2017-08-05 16:52:51.0")
/** Column name OldName */
public static final String COLUMNNAME_OldName = "OldName";
/** Set Password.
@param Password Password of any length (case sensitive) */
public void setPassword (String Password)
{
if (Password == null) throw new IllegalArgumentException ("Password is mandatory.");
if (Password.length() > 20)
{
log.warning("Length > 20 - truncated");
Password = Password.substring(0,19);
}
set_Value (COLUMNNAME_Password, Password);
}
/** Get Password.
@return Password of any length (case sensitive) */
public String getPassword() 
{
String value = (String)get_Value(COLUMNNAME_Password);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="bedaa692-0f95-6a74-b298-250694b0a3cb")
public static String es_PE_FIELD_System_Password_Description="Contraseña de cualquier longitud (Sensible a mayúsculas y minúsculas)";

@XendraTrl(Identifier="bedaa692-0f95-6a74-b298-250694b0a3cb")
public static String es_PE_FIELD_System_Password_Help="La contraseña indica la contraseña para esta ID de usuario. Las contraseñas se requieren para identificar usuarios autorizados";

@XendraTrl(Identifier="bedaa692-0f95-6a74-b298-250694b0a3cb")
public static String es_PE_FIELD_System_Password_Name="Contraseña";

@XendraField(AD_Column_ID="Password",IsCentrallyMaintained=true,
AD_Tab_ID="25c982fb-cd69-413f-011a-940abfedaa07",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bedaa692-0f95-6a74-b298-250694b0a3cb")
public static final String FIELDNAME_System_Password="bedaa692-0f95-6a74-b298-250694b0a3cb";

@XendraTrl(Identifier="dcd79804-a02d-93f9-9c2a-6df89b700850")
public static String es_PE_COLUMN_Password_Name="Contraseña";

@XendraColumn(AD_Element_ID="cd8ab187-f65c-a732-8e67-8675630874c3",ColumnName="Password",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dcd79804-a02d-93f9-9c2a-6df89b700850",
Synchronized="2017-08-05 16:52:51.0")
/** Column name Password */
public static final String COLUMNNAME_Password = "Password";
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

@XendraTrl(Identifier="372fb2bd-cef1-be58-e84e-c2bdff0e191f")
public static String es_PE_FIELD_System_ProcessNow_Description="Validar Contrato de Soporte";

@XendraTrl(Identifier="372fb2bd-cef1-be58-e84e-c2bdff0e191f")
public static String es_PE_FIELD_System_ProcessNow_Help="El proceso se conecta al servidor de  Servicios de Soporte Adempiere y vsñifs el contrato de soporte. Para contratar soporte por favor ingrese a www.e-evolution.com.mx";

@XendraTrl(Identifier="372fb2bd-cef1-be58-e84e-c2bdff0e191f")
public static String es_PE_FIELD_System_ProcessNow_Name="Validar Soporte ";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="25c982fb-cd69-413f-011a-940abfedaa07",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=250,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="372fb2bd-cef1-be58-e84e-c2bdff0e191f")
public static final String FIELDNAME_System_ProcessNow="372fb2bd-cef1-be58-e84e-c2bdff0e191f";

@XendraTrl(Identifier="7a320cc0-48d9-a52e-5cfe-5c7af1adc3d5")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="d64de632-c83c-d8c9-e38f-5893d04c2a08",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="7a320cc0-48d9-a52e-5cfe-5c7af1adc3d5",Synchronized="2017-08-05 16:52:51.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Profile.
@param ProfileInfo Information to HELP profiling the system for solving support issues */
public void setProfileInfo (String ProfileInfo)
{
if (ProfileInfo != null && ProfileInfo.length() > 60)
{
log.warning("Length > 60 - truncated");
ProfileInfo = ProfileInfo.substring(0,59);
}
set_ValueNoCheck (COLUMNNAME_ProfileInfo, ProfileInfo);
}
/** Get Profile.
@return Information to HELP profiling the system for solving support issues */
public String getProfileInfo() 
{
String value = (String)get_Value(COLUMNNAME_ProfileInfo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="a5cf65e0-3b5c-efe7-1c7d-eee49e94e1c5")
public static String es_PE_FIELD_System_Profile_Description="Información que ayuda al perfilamiento del sistema para solucionar ediciónes de soporte";

@XendraTrl(Identifier="a5cf65e0-3b5c-efe7-1c7d-eee49e94e1c5")
public static String es_PE_FIELD_System_Profile_Help="La información de perfil no contiene información confidencial y se utiliza para soportar la detección y el diagnóstico de la edición.";

@XendraTrl(Identifier="a5cf65e0-3b5c-efe7-1c7d-eee49e94e1c5")
public static String es_PE_FIELD_System_Profile_Name="Perfil";

@XendraField(AD_Column_ID="ProfileInfo",IsCentrallyMaintained=true,
AD_Tab_ID="25c982fb-cd69-413f-011a-940abfedaa07",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=220,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a5cf65e0-3b5c-efe7-1c7d-eee49e94e1c5")
public static final String FIELDNAME_System_Profile="a5cf65e0-3b5c-efe7-1c7d-eee49e94e1c5";

@XendraTrl(Identifier="0348c343-449e-5abc-6eec-d998f9d0f392")
public static String es_PE_COLUMN_ProfileInfo_Name="Perfil";

@XendraColumn(AD_Element_ID="77ce72b8-feb1-d63c-1414-d8068d2b9c63",ColumnName="ProfileInfo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0348c343-449e-5abc-6eec-d998f9d0f392",
Synchronized="2017-08-05 16:52:51.0")
/** Column name ProfileInfo */
public static final String COLUMNNAME_ProfileInfo = "ProfileInfo";
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

@XendraTrl(Identifier="bf48109e-f5ea-4a30-9c40-c1c45eefc650")
public static String es_PE_COLUMN_Properties_Name="Properties";

@XendraColumn(AD_Element_ID="acc3987b-292c-475a-86b5-5104970a96f3",ColumnName="Properties",
AD_Reference_ID=46,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bf48109e-f5ea-4a30-9c40-c1c45eefc650",
Synchronized="2017-08-05 16:52:51.0")
/** Column name Properties */
public static final String COLUMNNAME_Properties = "Properties";
/** Set Record ID.
@param Record_ID Direct internal record ID */
public void setRecord_ID (int Record_ID)
{
if (Record_ID <= 0) set_Value (COLUMNNAME_Record_ID, null);
 else 
set_Value (COLUMNNAME_Record_ID, Integer.valueOf(Record_ID));
}
/** Get Record ID.
@return Direct internal record ID */
public int getRecord_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Record_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f4031756-e78f-80f7-6406-fb92a0d41513")
public static String es_PE_FIELD_System_RecordID_Description="Identificador de registro interno";

@XendraTrl(Identifier="f4031756-e78f-80f7-6406-fb92a0d41513")
public static String es_PE_FIELD_System_RecordID_Help="La ID de registro es el identificador único interno de un registro.";

@XendraTrl(Identifier="f4031756-e78f-80f7-6406-fb92a0d41513")
public static String es_PE_FIELD_System_RecordID_Name="ID de Registro";

@XendraField(AD_Column_ID="Record_ID",IsCentrallyMaintained=true,
AD_Tab_ID="25c982fb-cd69-413f-011a-940abfedaa07",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f4031756-e78f-80f7-6406-fb92a0d41513")
public static final String FIELDNAME_System_RecordID="f4031756-e78f-80f7-6406-fb92a0d41513";

@XendraTrl(Identifier="3f252abd-aeb1-5a7e-3e5e-467253548120")
public static String es_PE_COLUMN_Record_ID_Name="ID de Registro";

@XendraColumn(AD_Element_ID="86e36e4b-d1dc-2deb-449d-c1f6769e1603",ColumnName="Record_ID",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3f252abd-aeb1-5a7e-3e5e-467253548120",
Synchronized="2017-08-05 16:52:51.0")
/** Column name Record_ID */
public static final String COLUMNNAME_Record_ID = "Record_ID";
/** Set Release No.
@param ReleaseNo Internal Release Number */
public void setReleaseNo (String ReleaseNo)
{
if (ReleaseNo != null && ReleaseNo.length() > 4)
{
log.warning("Length > 4 - truncated");
ReleaseNo = ReleaseNo.substring(0,3);
}
set_ValueNoCheck (COLUMNNAME_ReleaseNo, ReleaseNo);
}
/** Get Release No.
@return Internal Release Number */
public String getReleaseNo() 
{
String value = (String)get_Value(COLUMNNAME_ReleaseNo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="c54fcf8a-8259-9f96-0689-66d3e874ce7e")
public static String es_PE_FIELD_System_ReleaseNo_Description="Número interno de versión";

@XendraTrl(Identifier="c54fcf8a-8259-9f96-0689-66d3e874ce7e")
public static String es_PE_FIELD_System_ReleaseNo_Name="No. Versión ";

@XendraField(AD_Column_ID="ReleaseNo",IsCentrallyMaintained=true,
AD_Tab_ID="25c982fb-cd69-413f-011a-940abfedaa07",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=5,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c54fcf8a-8259-9f96-0689-66d3e874ce7e")
public static final String FIELDNAME_System_ReleaseNo="c54fcf8a-8259-9f96-0689-66d3e874ce7e";

@XendraTrl(Identifier="09c2975a-09d6-8ae0-087d-beb139a30a7a")
public static String es_PE_COLUMN_ReleaseNo_Name="No. Versión ";

@XendraColumn(AD_Element_ID="f8040f52-b90f-b045-60b4-9605538827a4",ColumnName="ReleaseNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=4,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="09c2975a-09d6-8ae0-087d-beb139a30a7a",
Synchronized="2017-08-05 16:52:51.0")
/** Column name ReleaseNo */
public static final String COLUMNNAME_ReleaseNo = "ReleaseNo";

/** ReplicationType AD_Reference=2b40f382-8066-9d78-4fd2-4c52f2918102 */
public static final int REPLICATIONTYPE_AD_Reference_ID=126;
/** Set Replication Type.
@param ReplicationType Type of Data Replication */
public void setReplicationType (String ReplicationType)
{
if (ReplicationType == null) throw new IllegalArgumentException ("ReplicationType is mandatory");
if (ReplicationType.equals(REF_AD_TableReplicationType.Local) || ReplicationType.equals(REF_AD_TableReplicationType.Merge) || ReplicationType.equals(REF_AD_TableReplicationType.Reference));
 else throw new IllegalArgumentException ("ReplicationType Invalid value - " + ReplicationType + " - Reference_ID=126 - L - M - R");
if (ReplicationType.length() > 1)
{
log.warning("Length > 1 - truncated");
ReplicationType = ReplicationType.substring(0,0);
}
set_Value (COLUMNNAME_ReplicationType, ReplicationType);
}
/** Get Replication Type.
@return Type of Data Replication */
public String getReplicationType() 
{
return (String)get_Value(COLUMNNAME_ReplicationType);
}

@XendraTrl(Identifier="1aee205e-3eb7-809f-3c6c-fcf3e598c2d0")
public static String es_PE_FIELD_System_ReplicationType_Description="Tipo de réplica de datos";

@XendraTrl(Identifier="1aee205e-3eb7-809f-3c6c-fcf3e598c2d0")
public static String es_PE_FIELD_System_ReplicationType_Help="El tipo de replicación de datos determina la dirección de replicación de datos. <br>La referencia significa que los datos en este sistema están leídos solamente -> <br>Medios locales que los datos en este sistema no están replegados a otros sistemas - <br>La fusión significa que los datos en este sistema están sincronizados con el otro sistema<-> <br>";

@XendraTrl(Identifier="1aee205e-3eb7-809f-3c6c-fcf3e598c2d0")
public static String es_PE_FIELD_System_ReplicationType_Name="Tipo de Replicación";

@XendraField(AD_Column_ID="ReplicationType",IsCentrallyMaintained=true,
AD_Tab_ID="25c982fb-cd69-413f-011a-940abfedaa07",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1aee205e-3eb7-809f-3c6c-fcf3e598c2d0")
public static final String FIELDNAME_System_ReplicationType="1aee205e-3eb7-809f-3c6c-fcf3e598c2d0";

@XendraTrl(Identifier="46feae56-bff5-a27e-65cd-7d754a102663")
public static String es_PE_COLUMN_ReplicationType_Name="Tipo de Replicación";

@XendraColumn(AD_Element_ID="fab2f42c-8051-1227-bbbd-e69e4837f172",ColumnName="ReplicationType",
AD_Reference_ID=17,AD_Reference_Value_ID="2b40f382-8066-9d78-4fd2-4c52f2918102",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="L",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="46feae56-bff5-a27e-65cd-7d754a102663",Synchronized="2017-08-05 16:52:51.0")
/** Column name ReplicationType */
public static final String COLUMNNAME_ReplicationType = "ReplicationType";
/** Set Statistics.
@param StatisticsInfo Information to HELP profiling the system for solving support issues */
public void setStatisticsInfo (String StatisticsInfo)
{
if (StatisticsInfo != null && StatisticsInfo.length() > 60)
{
log.warning("Length > 60 - truncated");
StatisticsInfo = StatisticsInfo.substring(0,59);
}
set_ValueNoCheck (COLUMNNAME_StatisticsInfo, StatisticsInfo);
}
/** Get Statistics.
@return Information to HELP profiling the system for solving support issues */
public String getStatisticsInfo() 
{
String value = (String)get_Value(COLUMNNAME_StatisticsInfo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="61ede690-3447-ba97-f95f-f517a43cb568")
public static String es_PE_FIELD_System_Statistics_Description="Información que ayuda a perfilar el sistema para solucionar ediciones de soporte";

@XendraTrl(Identifier="61ede690-3447-ba97-f95f-f517a43cb568")
public static String es_PE_FIELD_System_Statistics_Help="La información de perfil no contiene información confidencial y se utiliza para apoyar la detección y el diagnóstico de la edición así como la estadística anónima en general";

@XendraTrl(Identifier="61ede690-3447-ba97-f95f-f517a43cb568")
public static String es_PE_FIELD_System_Statistics_Name="Estadística";

@XendraField(AD_Column_ID="StatisticsInfo",IsCentrallyMaintained=true,
AD_Tab_ID="25c982fb-cd69-413f-011a-940abfedaa07",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=200,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="61ede690-3447-ba97-f95f-f517a43cb568")
public static final String FIELDNAME_System_Statistics="61ede690-3447-ba97-f95f-f517a43cb568";

@XendraTrl(Identifier="2915434a-a248-e8da-208f-4802407d4726")
public static String es_PE_COLUMN_StatisticsInfo_Name="Estadística";

@XendraColumn(AD_Element_ID="cb4e2bb3-3a05-420d-402e-eac787e0151a",ColumnName="StatisticsInfo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2915434a-a248-e8da-208f-4802407d4726",
Synchronized="2017-08-05 16:52:51.0")
/** Column name StatisticsInfo */
public static final String COLUMNNAME_StatisticsInfo = "StatisticsInfo";
/** Set Summary.
@param Summary Textual summary of this request */
public void setSummary (String Summary)
{
if (Summary != null && Summary.length() > 255)
{
log.warning("Length > 255 - truncated");
Summary = Summary.substring(0,254);
}
set_Value (COLUMNNAME_Summary, Summary);
}
/** Get Summary.
@return Textual summary of this request */
public String getSummary() 
{
String value = (String)get_Value(COLUMNNAME_Summary);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="c44154f3-76f9-0b98-5b12-5b293a92d75e")
public static String es_PE_FIELD_System_Summary_Description="Resúmen textual de esta solicitud";

@XendraTrl(Identifier="c44154f3-76f9-0b98-5b12-5b293a92d75e")
public static String es_PE_FIELD_System_Summary_Help="El resúmen permite texto en formato libre sobre esta solicitud.";

@XendraTrl(Identifier="c44154f3-76f9-0b98-5b12-5b293a92d75e")
public static String es_PE_FIELD_System_Summary_Name="Resúmen";
@XendraField(AD_Column_ID="Summary",
IsCentrallyMaintained=true,AD_Tab_ID="25c982fb-cd69-413f-011a-940abfedaa07",AD_FieldGroup_ID="",
IsDisplayed=false,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="c44154f3-76f9-0b98-5b12-5b293a92d75e")
public static final String FIELDNAME_System_Summary="c44154f3-76f9-0b98-5b12-5b293a92d75e";

@XendraTrl(Identifier="d209cec4-8e3f-26fa-565a-5c9b47247838")
public static String es_PE_COLUMN_Summary_Name="Resúmen";

@XendraColumn(AD_Element_ID="94fe105c-8853-7c06-a32a-9ad75a452917",ColumnName="Summary",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d209cec4-8e3f-26fa-565a-5c9b47247838",
Synchronized="2017-08-05 16:52:51.0")
/** Column name Summary */
public static final String COLUMNNAME_Summary = "Summary";
/** Set Support EMail.
@param SupportEMail EMail address to send support information and updates to */
public void setSupportEMail (String SupportEMail)
{
if (SupportEMail != null && SupportEMail.length() > 60)
{
log.warning("Length > 60 - truncated");
SupportEMail = SupportEMail.substring(0,59);
}
set_Value (COLUMNNAME_SupportEMail, SupportEMail);
}
/** Get Support EMail.
@return EMail address to send support information and updates to */
public String getSupportEMail() 
{
String value = (String)get_Value(COLUMNNAME_SupportEMail);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="d5758c96-74d2-b59d-ac2a-30ff4b23727a")
public static String es_PE_FIELD_System_SupportEMail_Description="Dirección de Correo para solicitar información de soporte y actualizaciones.";

@XendraTrl(Identifier="d5758c96-74d2-b59d-ac2a-30ff4b23727a")
public static String es_PE_FIELD_System_SupportEMail_Help="Si no fue ingresado se empleará la dirección de Correo registrada.";

@XendraTrl(Identifier="d5758c96-74d2-b59d-ac2a-30ff4b23727a")
public static String es_PE_FIELD_System_SupportEMail_Name="EMail a Soporte ";

@XendraField(AD_Column_ID="SupportEMail",IsCentrallyMaintained=true,
AD_Tab_ID="25c982fb-cd69-413f-011a-940abfedaa07",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d5758c96-74d2-b59d-ac2a-30ff4b23727a")
public static final String FIELDNAME_System_SupportEMail="d5758c96-74d2-b59d-ac2a-30ff4b23727a";

@XendraTrl(Identifier="2fd048b2-2a02-e200-edf2-806027ff1e0c")
public static String es_PE_COLUMN_SupportEMail_Name="EMail a Soporte ";

@XendraColumn(AD_Element_ID="6e7de731-45e3-8bea-ba4b-6d4e4c2e85e1",ColumnName="SupportEMail",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2fd048b2-2a02-e200-edf2-806027ff1e0c",
Synchronized="2017-08-05 16:52:51.0")
/** Column name SupportEMail */
public static final String COLUMNNAME_SupportEMail = "SupportEMail";
/** Set Support Expires.
@param SupportExpDate Date when the Adempiere support expires */
public void setSupportExpDate (Timestamp SupportExpDate)
{
set_ValueNoCheck (COLUMNNAME_SupportExpDate, SupportExpDate);
}
/** Get Support Expires.
@return Date when the Adempiere support expires */
public Timestamp getSupportExpDate() 
{
return (Timestamp)get_Value(COLUMNNAME_SupportExpDate);
}

@XendraTrl(Identifier="fcfae574-d575-2a2b-dfc4-ecddbb5e773d")
public static String es_PE_FIELD_System_SupportExpires_Description="Fecha en que vence el soporte a Adempiere";

@XendraTrl(Identifier="fcfae574-d575-2a2b-dfc4-ecddbb5e773d")
public static String es_PE_FIELD_System_SupportExpires_Help="Consulte http://www.e-evolution.com.mx para opciones de soporte";

@XendraTrl(Identifier="fcfae574-d575-2a2b-dfc4-ecddbb5e773d")
public static String es_PE_FIELD_System_SupportExpires_Name="Vencimiento de Soporte";

@XendraField(AD_Column_ID="SupportExpDate",IsCentrallyMaintained=true,
AD_Tab_ID="25c982fb-cd69-413f-011a-940abfedaa07",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=7,IsReadOnly=true,SeqNo=240,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fcfae574-d575-2a2b-dfc4-ecddbb5e773d")
public static final String FIELDNAME_System_SupportExpires="fcfae574-d575-2a2b-dfc4-ecddbb5e773d";

@XendraTrl(Identifier="7f91e070-e981-e7ec-f5b5-1d925ff273df")
public static String es_PE_COLUMN_SupportExpDate_Name="Vencimiento de Soporte";

@XendraColumn(AD_Element_ID="11453a7f-f808-3b37-5cb5-b78d3dd1c635",ColumnName="SupportExpDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7f91e070-e981-e7ec-f5b5-1d925ff273df",
Synchronized="2017-08-05 16:52:52.0")
/** Column name SupportExpDate */
public static final String COLUMNNAME_SupportExpDate = "SupportExpDate";
/** Set Internal Users.
@param SupportUnits Number of Internal Users for Adempiere Support */
public void setSupportUnits (int SupportUnits)
{
set_ValueNoCheck (COLUMNNAME_SupportUnits, Integer.valueOf(SupportUnits));
}
/** Get Internal Users.
@return Number of Internal Users for Adempiere Support */
public int getSupportUnits() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_SupportUnits);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e29f9da5-01b0-4bff-3714-db95a5b10c68")
public static String es_PE_FIELD_System_InternalUsers_Description="Número de las unidades de ayuda para la ayuda de Adempiere";

@XendraTrl(Identifier="e29f9da5-01b0-4bff-3714-db95a5b10c68")
public static String es_PE_FIELD_System_InternalUsers_Help="Usted puede comprar la ayuda comercial de Adempiere, Inc.El honorario está por 10 usuarios internos. El número de las unidades de ayuda se exhibe aquí.";

@XendraTrl(Identifier="e29f9da5-01b0-4bff-3714-db95a5b10c68")
public static String es_PE_FIELD_System_InternalUsers_Name="Unidades de Ayuda";

@XendraField(AD_Column_ID="SupportUnits",IsCentrallyMaintained=true,
AD_Tab_ID="25c982fb-cd69-413f-011a-940abfedaa07",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=true,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e29f9da5-01b0-4bff-3714-db95a5b10c68")
public static final String FIELDNAME_System_InternalUsers="e29f9da5-01b0-4bff-3714-db95a5b10c68";

@XendraTrl(Identifier="0ef85236-33a7-e25d-3f19-6f570ca9706d")
public static String es_PE_COLUMN_SupportUnits_Name="Unidades de Ayuda";

@XendraColumn(AD_Element_ID="089c341f-9348-0894-b15f-1114cccf9988",ColumnName="SupportUnits",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0ef85236-33a7-e25d-3f19-6f570ca9706d",
Synchronized="2017-08-05 16:52:52.0")
/** Column name SupportUnits */
public static final String COLUMNNAME_SupportUnits = "SupportUnits";

/** SystemStatus AD_Reference=2aca3aa9-4a75-ed5a-2785-69ad14e5c85d */
public static final int SYSTEMSTATUS_AD_Reference_ID=374;
/** Set System Status.
@param SystemStatus Status of the system - Support priority depends on system status */
public void setSystemStatus (String SystemStatus)
{
if (SystemStatus == null) throw new IllegalArgumentException ("SystemStatus is mandatory");
if (SystemStatus.equals(REF_AD_SystemStatus.Evaluation) || SystemStatus.equals(REF_AD_SystemStatus.Implementation) || SystemStatus.equals(REF_AD_SystemStatus.Production));
 else throw new IllegalArgumentException ("SystemStatus Invalid value - " + SystemStatus + " - Reference_ID=374 - E - I - P");
if (SystemStatus.length() > 1)
{
log.warning("Length > 1 - truncated");
SystemStatus = SystemStatus.substring(0,0);
}
set_Value (COLUMNNAME_SystemStatus, SystemStatus);
}
/** Get System Status.
@return Status of the system - Support priority depends on system status */
public String getSystemStatus() 
{
return (String)get_Value(COLUMNNAME_SystemStatus);
}

@XendraTrl(Identifier="0bd2a3b5-c2c3-a839-ae58-ab522630644e")
public static String es_PE_FIELD_System_SystemStatus_Description="Estado del Sistema - La prioridad del soporte depende del estado del sistema.";

@XendraTrl(Identifier="0bd2a3b5-c2c3-a839-ae58-ab522630644e")
public static String es_PE_FIELD_System_SystemStatus_Help="Estado del Sistema ayuda a priorizar recursos de soporte.";

@XendraTrl(Identifier="0bd2a3b5-c2c3-a839-ae58-ab522630644e")
public static String es_PE_FIELD_System_SystemStatus_Name="Estado del Sistema";

@XendraField(AD_Column_ID="SystemStatus",IsCentrallyMaintained=true,
AD_Tab_ID="25c982fb-cd69-413f-011a-940abfedaa07",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=20,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0bd2a3b5-c2c3-a839-ae58-ab522630644e")
public static final String FIELDNAME_System_SystemStatus="0bd2a3b5-c2c3-a839-ae58-ab522630644e";

@XendraTrl(Identifier="6a69ba8e-3232-f797-cf4c-74b68957fc5d")
public static String es_PE_COLUMN_SystemStatus_Name="Estado del Sistema";

@XendraColumn(AD_Element_ID="66b6be12-484d-bb38-e430-af4c3adbdb6a",ColumnName="SystemStatus",
AD_Reference_ID=17,AD_Reference_Value_ID="2aca3aa9-4a75-ed5a-2785-69ad14e5c85d",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="E",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6a69ba8e-3232-f797-cf4c-74b68957fc5d",Synchronized="2017-08-05 16:52:52.0")
/** Column name SystemStatus */
public static final String COLUMNNAME_SystemStatus = "SystemStatus";
/** Set Registered EMail.
@param UserName Email of the responsible for the System */
public void setUserName (String UserName)
{
if (UserName == null) throw new IllegalArgumentException ("UserName is mandatory.");
if (UserName.length() > 60)
{
log.warning("Length > 60 - truncated");
UserName = UserName.substring(0,59);
}
set_Value (COLUMNNAME_UserName, UserName);
}
/** Get Registered EMail.
@return Email of the responsible for the System */
public String getUserName() 
{
String value = (String)get_Value(COLUMNNAME_UserName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="d3ff41a6-c1e7-8d49-b217-3bf19e0d59a1")
public static String es_PE_FIELD_System_RegisteredEMail_Description="Usuario responsable por el sistema";

@XendraTrl(Identifier="d3ff41a6-c1e7-8d49-b217-3bf19e0d59a1")
public static String es_PE_FIELD_System_RegisteredEMail_Help="Persona responsable por el sistema";

@XendraTrl(Identifier="d3ff41a6-c1e7-8d49-b217-3bf19e0d59a1")
public static String es_PE_FIELD_System_RegisteredEMail_Name="Usuario";

@XendraField(AD_Column_ID="UserName",IsCentrallyMaintained=true,
AD_Tab_ID="25c982fb-cd69-413f-011a-940abfedaa07",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d3ff41a6-c1e7-8d49-b217-3bf19e0d59a1")
public static final String FIELDNAME_System_RegisteredEMail="d3ff41a6-c1e7-8d49-b217-3bf19e0d59a1";

@XendraTrl(Identifier="9efa7deb-7ca2-ccc3-9d77-4d4590fbb283")
public static String es_PE_COLUMN_UserName_Name="Usuario";

@XendraColumn(AD_Element_ID="f1f44b21-d257-0aaf-7454-cf73b867319a",ColumnName="UserName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9efa7deb-7ca2-ccc3-9d77-4d4590fbb283",
Synchronized="2017-08-05 16:52:52.0")
/** Column name UserName */
public static final String COLUMNNAME_UserName = "UserName";
/** Set Version.
@param Version Version of the table definition */
public void setVersion (String Version)
{
if (Version == null) throw new IllegalArgumentException ("Version is mandatory.");
if (Version.length() > 20)
{
log.warning("Length > 20 - truncated");
Version = Version.substring(0,19);
}
set_ValueNoCheck (COLUMNNAME_Version, Version);
}
/** Get Version.
@return Version of the table definition */
public String getVersion() 
{
String value = (String)get_Value(COLUMNNAME_Version);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="d2f279d0-4596-94a7-2bdb-49be2d19b275")
public static String es_PE_FIELD_System_Version_Description="Versión de la definición de tabla";

@XendraTrl(Identifier="d2f279d0-4596-94a7-2bdb-49be2d19b275")
public static String es_PE_FIELD_System_Version_Help="La versión indica la versión de esta definición de tabla";

@XendraTrl(Identifier="d2f279d0-4596-94a7-2bdb-49be2d19b275")
public static String es_PE_FIELD_System_Version_Name="Versión";
@XendraField(AD_Column_ID="Version",
IsCentrallyMaintained=true,AD_Tab_ID="25c982fb-cd69-413f-011a-940abfedaa07",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=90,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="d2f279d0-4596-94a7-2bdb-49be2d19b275")
public static final String FIELDNAME_System_Version="d2f279d0-4596-94a7-2bdb-49be2d19b275";

@XendraTrl(Identifier="b369dd9a-369f-7090-bfe4-217c7cddc000")
public static String es_PE_COLUMN_Version_Name="Versión";

@XendraColumn(AD_Element_ID="739fe203-51de-92a9-b8a8-c08f63b73506",ColumnName="Version",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b369dd9a-369f-7090-bfe4-217c7cddc000",
Synchronized="2017-08-05 16:52:52.0")
/** Column name Version */
public static final String COLUMNNAME_Version = "Version";
}
