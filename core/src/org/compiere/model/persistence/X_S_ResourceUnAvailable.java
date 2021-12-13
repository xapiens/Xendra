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
/** Generated Model for S_ResourceUnAvailable
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_S_ResourceUnAvailable extends PO
{
/** Standard Constructor
@param ctx context
@param S_ResourceUnAvailable_ID id
@param trxName transaction
*/
public X_S_ResourceUnAvailable (Properties ctx, int S_ResourceUnAvailable_ID, String trxName)
{
super (ctx, S_ResourceUnAvailable_ID, trxName);
/** if (S_ResourceUnAvailable_ID == 0)
{
setDateFrom (new Timestamp(System.currentTimeMillis()));
setS_Resource_ID (0);
setS_ResourceUnAvailable_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_S_ResourceUnAvailable (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=482 */
public static int Table_ID=MTable.getTable_ID("S_ResourceUnAvailable");

@XendraTrl(Identifier="ecb41430-1956-3384-2bf0-05d0cfb62603")
public static String es_PE_TAB_Unavailability_Description="No disponibilidad de recursos";

@XendraTrl(Identifier="ecb41430-1956-3384-2bf0-05d0cfb62603")
public static String es_PE_TAB_Unavailability_Help="Fechas cuando el recurso no está disponible (ej. Vacaciones)";

@XendraTrl(Identifier="ecb41430-1956-3384-2bf0-05d0cfb62603")
public static String es_PE_TAB_Unavailability_Name="No Disponibilidad";

@XendraTab(Name="Unavailability",Description="Resource unavailability",
Help="Dates, when the resource is not available (e.g. vacation)",
AD_Window_ID="d64fba3f-bbf2-bd5b-1f70-0c9bcedb722a",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="ecb41430-1956-3384-2bf0-05d0cfb62603",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Unavailability="ecb41430-1956-3384-2bf0-05d0cfb62603";

@XendraTrl(Identifier="ad296452-0f2c-85ed-e915-a86cc3e40740")
public static String es_PE_TABLE_S_ResourceUnAvailable_Name="Recursos no disponibles";


@XendraTable(Name="Resource Unavailability",AD_Package_ID="4bb6f0e4-f72d-dcbb-9183-88af0357143f",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="S_ResourceUnAvailable",AccessLevel="3",
AD_Window_ID="d64fba3f-bbf2-bd5b-1f70-0c9bcedb722a",AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.services",Identifier="ad296452-0f2c-85ed-e915-a86cc3e40740",
Synchronized="2020-03-03 21:40:11.0")
/** TableName=S_ResourceUnAvailable */
public static final String Table_Name="S_ResourceUnAvailable";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"S_ResourceUnAvailable");

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
    Table_ID = MTable.getTable_ID("S_ResourceUnAvailable");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_S_ResourceUnAvailable[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Date From.
@param DateFrom Starting date for a range */
public void setDateFrom (Timestamp DateFrom)
{
if (DateFrom == null) throw new IllegalArgumentException ("DateFrom is mandatory.");
set_Value (COLUMNNAME_DateFrom, DateFrom);
}
/** Get Date From.
@return Starting date for a range */
public Timestamp getDateFrom() 
{
return (Timestamp)get_Value(COLUMNNAME_DateFrom);
}

@XendraTrl(Identifier="df98061f-baa6-9175-866a-9027301a40d0")
public static String es_PE_FIELD_Unavailability_DateFrom_Name="Desde Fecha";

@XendraTrl(Identifier="df98061f-baa6-9175-866a-9027301a40d0")
public static String es_PE_FIELD_Unavailability_DateFrom_Description="Fecha de inicio para un rango";

@XendraTrl(Identifier="df98061f-baa6-9175-866a-9027301a40d0")
public static String es_PE_FIELD_Unavailability_DateFrom_Help="La Fecha desde indica la fecha inicial de un rango";

@XendraField(AD_Column_ID="DateFrom",IsCentrallyMaintained=true,
AD_Tab_ID="ecb41430-1956-3384-2bf0-05d0cfb62603",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="df98061f-baa6-9175-866a-9027301a40d0")
public static final String FIELDNAME_Unavailability_DateFrom="df98061f-baa6-9175-866a-9027301a40d0";

@XendraTrl(Identifier="d6a0b395-ee3a-3ba0-2719-5e0f238d6b55")
public static String es_PE_COLUMN_DateFrom_Name="Desde Fecha";

@XendraColumn(AD_Element_ID="5bfdcbe1-cf4f-d7f7-c643-7a07f2907ae9",ColumnName="DateFrom",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d6a0b395-ee3a-3ba0-2719-5e0f238d6b55",
Synchronized="2019-08-30 22:24:16.0")
/** Column name DateFrom */
public static final String COLUMNNAME_DateFrom = "DateFrom";
/** Set Date To.
@param DateTo End date of a date range */
public void setDateTo (Timestamp DateTo)
{
set_Value (COLUMNNAME_DateTo, DateTo);
}
/** Get Date To.
@return End date of a date range */
public Timestamp getDateTo() 
{
return (Timestamp)get_Value(COLUMNNAME_DateTo);
}

@XendraTrl(Identifier="db16d96d-8b6a-8ce1-acfc-9177d78922fb")
public static String es_PE_FIELD_Unavailability_DateTo_Name="A Fecha";

@XendraTrl(Identifier="db16d96d-8b6a-8ce1-acfc-9177d78922fb")
public static String es_PE_FIELD_Unavailability_DateTo_Description="Fecha final de un rango (inclusive)";

@XendraTrl(Identifier="db16d96d-8b6a-8ce1-acfc-9177d78922fb")
public static String es_PE_FIELD_Unavailability_DateTo_Help="La Fecha A indica la fecha final de un rango (inclusive)";

@XendraField(AD_Column_ID="DateTo",IsCentrallyMaintained=true,
AD_Tab_ID="ecb41430-1956-3384-2bf0-05d0cfb62603",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="db16d96d-8b6a-8ce1-acfc-9177d78922fb")
public static final String FIELDNAME_Unavailability_DateTo="db16d96d-8b6a-8ce1-acfc-9177d78922fb";

@XendraTrl(Identifier="b989faed-25d6-7535-af06-cce0dddad8ca")
public static String es_PE_COLUMN_DateTo_Name="A Fecha";

@XendraColumn(AD_Element_ID="c98c05a0-7b58-ed8f-3e5b-fe1e1358ac38",ColumnName="DateTo",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=3,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b989faed-25d6-7535-af06-cce0dddad8ca",
Synchronized="2019-08-30 22:24:16.0")
/** Column name DateTo */
public static final String COLUMNNAME_DateTo = "DateTo";
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

@XendraTrl(Identifier="6f9ad890-37b1-d133-3acd-f8f6944fe1f3")
public static String es_PE_FIELD_Unavailability_Description_Name="Observación";

@XendraTrl(Identifier="6f9ad890-37b1-d133-3acd-f8f6944fe1f3")
public static String es_PE_FIELD_Unavailability_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="6f9ad890-37b1-d133-3acd-f8f6944fe1f3")
public static String es_PE_FIELD_Unavailability_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="ecb41430-1956-3384-2bf0-05d0cfb62603",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6f9ad890-37b1-d133-3acd-f8f6944fe1f3")
public static final String FIELDNAME_Unavailability_Description="6f9ad890-37b1-d133-3acd-f8f6944fe1f3";

@XendraTrl(Identifier="069c9f1f-8ac1-7732-f190-9bb9d95691c3")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="069c9f1f-8ac1-7732-f190-9bb9d95691c3",
Synchronized="2019-08-30 22:24:17.0")
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
@XendraTrl(Identifier="f49512b2-f509-4977-9aea-d7ea86698336")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f49512b2-f509-4977-9aea-d7ea86698336",
Synchronized="2019-08-30 22:24:17.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Resource.
@param S_Resource_ID Resource */
public void setS_Resource_ID (int S_Resource_ID)
{
if (S_Resource_ID < 1) throw new IllegalArgumentException ("S_Resource_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_S_Resource_ID, Integer.valueOf(S_Resource_ID));
}
/** Get Resource.
@return Resource */
public int getS_Resource_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_S_Resource_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getS_Resource_ID()));
}

@XendraTrl(Identifier="5b7a863a-ffc7-cfd7-d11a-97c8b638e21b")
public static String es_PE_FIELD_Unavailability_Resource_Name="Recurso";

@XendraTrl(Identifier="5b7a863a-ffc7-cfd7-d11a-97c8b638e21b")
public static String es_PE_FIELD_Unavailability_Resource_Description="Recurso";

@XendraField(AD_Column_ID="S_Resource_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ecb41430-1956-3384-2bf0-05d0cfb62603",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5b7a863a-ffc7-cfd7-d11a-97c8b638e21b")
public static final String FIELDNAME_Unavailability_Resource="5b7a863a-ffc7-cfd7-d11a-97c8b638e21b";

@XendraTrl(Identifier="f126882c-4a17-f34e-abf2-76fce28c4aa6")
public static String es_PE_COLUMN_S_Resource_ID_Name="Recurso";

@XendraColumn(AD_Element_ID="22f30913-1545-c2d4-4092-f033c05219ea",ColumnName="S_Resource_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f126882c-4a17-f34e-abf2-76fce28c4aa6",
Synchronized="2019-08-30 22:24:17.0")
/** Column name S_Resource_ID */
public static final String COLUMNNAME_S_Resource_ID = "S_Resource_ID";
/** Set Resource Unavailability.
@param S_ResourceUnAvailable_ID Resource Unavailability */
public void setS_ResourceUnAvailable_ID (int S_ResourceUnAvailable_ID)
{
if (S_ResourceUnAvailable_ID < 1) throw new IllegalArgumentException ("S_ResourceUnAvailable_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_S_ResourceUnAvailable_ID, Integer.valueOf(S_ResourceUnAvailable_ID));
}
/** Get Resource Unavailability.
@return Resource Unavailability */
public int getS_ResourceUnAvailable_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_S_ResourceUnAvailable_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="48f3164c-7620-6fdc-945a-14d008a63afa")
public static String es_PE_FIELD_Unavailability_ResourceUnavailability_Name="Recursos no disponibles";

@XendraField(AD_Column_ID="S_ResourceUnAvailable_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ecb41430-1956-3384-2bf0-05d0cfb62603",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="48f3164c-7620-6fdc-945a-14d008a63afa")
public static final String FIELDNAME_Unavailability_ResourceUnavailability="48f3164c-7620-6fdc-945a-14d008a63afa";
/** Column name S_ResourceUnAvailable_ID */
public static final String COLUMNNAME_S_ResourceUnAvailable_ID = "S_ResourceUnAvailable_ID";
}
