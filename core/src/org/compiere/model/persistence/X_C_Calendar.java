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
/** Generated Model for C_Calendar
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_Calendar extends PO
{
/** Standard Constructor
@param ctx context
@param C_Calendar_ID id
@param trxName transaction
*/
public X_C_Calendar (Properties ctx, int C_Calendar_ID, String trxName)
{
super (ctx, C_Calendar_ID, trxName);
/** if (C_Calendar_ID == 0)
{
setC_Calendar_ID (0);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_Calendar (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=139 */
public static int Table_ID=MTable.getTable_ID("C_Calendar");

@XendraTrl(Identifier="92986bce-9bec-b92b-5635-48f1c4d1011a")
public static String es_PE_TAB_Calendar_Description="Definir Calendario";

@XendraTrl(Identifier="92986bce-9bec-b92b-5635-48f1c4d1011a")
public static String es_PE_TAB_Calendar_Name="Calendario";

@XendraTrl(Identifier="92986bce-9bec-b92b-5635-48f1c4d1011a")
public static String es_PE_TAB_Calendar_Help="La pestaña de Calendario define cada calendario que será usado por una organización.";

@XendraTab(Name="Calendar",Description="Define your calendar",
Help="The Calendar Tab defines each calendar that will be used by an Organization.",
AD_Window_ID="54524f0d-f1a4-460b-d2f8-1eff9aea350e",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="92986bce-9bec-b92b-5635-48f1c4d1011a",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Calendar="92986bce-9bec-b92b-5635-48f1c4d1011a";

@XendraTrl(Identifier="36f19f3b-e0fc-9a47-97f4-49d5b2a33741")
public static String es_PE_TABLE_C_Calendar_Name="Calendario";

@XendraTable(Name="Calendar",Description="Accounting Calendar Name",Help="",TableName="C_Calendar",
AccessLevel="2",AD_Window_ID="54524f0d-f1a4-460b-d2f8-1eff9aea350e",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=110,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="36f19f3b-e0fc-9a47-97f4-49d5b2a33741",Synchronized="2017-08-16 11:41:34.0")
/** TableName=C_Calendar */
public static final String Table_Name="C_Calendar";


@XendraIndex(Name="c_calendar_name",Identifier="1460911e-9e1b-e355-c33c-b7d8cad51550",
Column_Names="ad_client_id, name",IsUnique="true",
TableIdentifier="1460911e-9e1b-e355-c33c-b7d8cad51550",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_calendar_name = "1460911e-9e1b-e355-c33c-b7d8cad51550";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_Calendar");

protected BigDecimal accessLevel = BigDecimal.valueOf(2);
/** AccessLevel
@return 2 - Client 
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
    Table_ID = MTable.getTable_ID("C_Calendar");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_Calendar[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Calendar.
@param C_Calendar_ID Accounting Calendar Name */
public void setC_Calendar_ID (int C_Calendar_ID)
{
if (C_Calendar_ID < 1) throw new IllegalArgumentException ("C_Calendar_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Calendar_ID, Integer.valueOf(C_Calendar_ID));
}
/** Get Calendar.
@return Accounting Calendar Name */
public int getC_Calendar_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Calendar_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="cf663fb5-d2a4-8ed1-9473-615e2cd4a319")
public static String es_PE_FIELD_Calendar_Calendar_Description="Nombre del Calendario Contable";

@XendraTrl(Identifier="cf663fb5-d2a4-8ed1-9473-615e2cd4a319")
public static String es_PE_FIELD_Calendar_Calendar_Help="El calendario únicamente identifica un calendario contable. Múltiples calendarios pueden ser usados. Ej. Ud. puede necesitar un calendario estándar que corre del 1 de enero al 31 de diciembre y un calendario fiscal que corre del 1 de julio al 30 de junio.";

@XendraTrl(Identifier="cf663fb5-d2a4-8ed1-9473-615e2cd4a319")
public static String es_PE_FIELD_Calendar_Calendar_Name="Calendario";

@XendraField(AD_Column_ID="C_Calendar_ID",IsCentrallyMaintained=true,
AD_Tab_ID="92986bce-9bec-b92b-5635-48f1c4d1011a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cf663fb5-d2a4-8ed1-9473-615e2cd4a319")
public static final String FIELDNAME_Calendar_Calendar="cf663fb5-d2a4-8ed1-9473-615e2cd4a319";
/** Column name C_Calendar_ID */
public static final String COLUMNNAME_C_Calendar_ID = "C_Calendar_ID";
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

@XendraTrl(Identifier="60b23a38-067d-e3e5-9762-4e3120f62e77")
public static String es_PE_FIELD_Calendar_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="60b23a38-067d-e3e5-9762-4e3120f62e77")
public static String es_PE_FIELD_Calendar_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="60b23a38-067d-e3e5-9762-4e3120f62e77")
public static String es_PE_FIELD_Calendar_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="92986bce-9bec-b92b-5635-48f1c4d1011a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="60b23a38-067d-e3e5-9762-4e3120f62e77")
public static final String FIELDNAME_Calendar_Description="60b23a38-067d-e3e5-9762-4e3120f62e77";

@XendraTrl(Identifier="805904d7-a546-81ef-a5c4-899baaa9e68b")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="805904d7-a546-81ef-a5c4-899baaa9e68b",
Synchronized="2017-08-05 16:53:26.0")
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
@XendraTrl(Identifier="13923d61-bd84-40ac-99c3-a04ddc7b4c9d")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="13923d61-bd84-40ac-99c3-a04ddc7b4c9d",
Synchronized="2017-08-05 16:53:26.0")
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

@XendraTrl(Identifier="00d09751-4a00-6762-3ec7-6dc01b3e75f3")
public static String es_PE_FIELD_Calendar_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="00d09751-4a00-6762-3ec7-6dc01b3e75f3")
public static String es_PE_FIELD_Calendar_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="00d09751-4a00-6762-3ec7-6dc01b3e75f3")
public static String es_PE_FIELD_Calendar_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="92986bce-9bec-b92b-5635-48f1c4d1011a",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="00d09751-4a00-6762-3ec7-6dc01b3e75f3")
public static final String FIELDNAME_Calendar_Name="00d09751-4a00-6762-3ec7-6dc01b3e75f3";

@XendraTrl(Identifier="0c29d962-cd95-fc5c-49b1-75e3d2b0026b")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0c29d962-cd95-fc5c-49b1-75e3d2b0026b",
Synchronized="2017-08-05 16:53:26.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
}
