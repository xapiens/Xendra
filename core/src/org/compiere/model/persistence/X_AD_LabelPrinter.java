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
/** Generated Model for AD_LabelPrinter
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_LabelPrinter extends PO
{
/** Standard Constructor
@param ctx context
@param AD_LabelPrinter_ID id
@param trxName transaction
*/
public X_AD_LabelPrinter (Properties ctx, int AD_LabelPrinter_ID, String trxName)
{
super (ctx, AD_LabelPrinter_ID, trxName);
/** if (AD_LabelPrinter_ID == 0)
{
setAD_LabelPrinter_ID (0);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_LabelPrinter (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=626 */
public static int Table_ID=MTable.getTable_ID("AD_LabelPrinter");

@XendraTrl(Identifier="ab288dfd-260a-06e7-1631-f355353b0220")
public static String es_PE_TAB_Printer_Description="Define impresora de la etiqueta";

@XendraTrl(Identifier="ab288dfd-260a-06e7-1631-f355353b0220")
public static String es_PE_TAB_Printer_Name="Impresión";
@XendraTab(Name="Printer",
Description="Define Label Printer",Help="",AD_Window_ID="9965113b-8089-e90d-fddc-48811f50a74b",
SeqNo=10,TabLevel=0,IsSingleRow=true,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="",HasTree=false,WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="ab288dfd-260a-06e7-1631-f355353b0220",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Printer="ab288dfd-260a-06e7-1631-f355353b0220";

@XendraTrl(Identifier="39545460-f7fb-05cd-5ec0-d40c972414df")
public static String es_PE_TABLE_AD_LabelPrinter_Name="Impresión de Etiqueta";

@XendraTable(Name="Label printer",Description="Label Printer Definition",Help="",
TableName="AD_LabelPrinter",AccessLevel="6",AD_Window_ID="9965113b-8089-e90d-fddc-48811f50a74b",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=130,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="39545460-f7fb-05cd-5ec0-d40c972414df",Synchronized="2017-08-16 11:40:25.0")
/** TableName=AD_LabelPrinter */
public static final String Table_Name="AD_LabelPrinter";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_LabelPrinter");

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
    Table_ID = MTable.getTable_ID("AD_LabelPrinter");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_LabelPrinter[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Label printer.
@param AD_LabelPrinter_ID Label Printer Definition */
public void setAD_LabelPrinter_ID (int AD_LabelPrinter_ID)
{
if (AD_LabelPrinter_ID < 1) throw new IllegalArgumentException ("AD_LabelPrinter_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_LabelPrinter_ID, Integer.valueOf(AD_LabelPrinter_ID));
}
/** Get Label printer.
@return Label Printer Definition */
public int getAD_LabelPrinter_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_LabelPrinter_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="cae05280-de41-4b76-1bf3-88d9e2222eb3")
public static String es_PE_FIELD_Printer_LabelPrinter_Description="Definición de la impresión de la etiqueta";

@XendraTrl(Identifier="cae05280-de41-4b76-1bf3-88d9e2222eb3")
public static String es_PE_FIELD_Printer_LabelPrinter_Name="Impresión de Etiqueta";

@XendraField(AD_Column_ID="AD_LabelPrinter_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ab288dfd-260a-06e7-1631-f355353b0220",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cae05280-de41-4b76-1bf3-88d9e2222eb3")
public static final String FIELDNAME_Printer_LabelPrinter="cae05280-de41-4b76-1bf3-88d9e2222eb3";
/** Column name AD_LabelPrinter_ID */
public static final String COLUMNNAME_AD_LabelPrinter_ID = "AD_LabelPrinter_ID";
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

@XendraTrl(Identifier="3822956e-c528-a2a2-f592-43f8cbe678ea")
public static String es_PE_FIELD_Printer_Description_Description="Observación";

@XendraTrl(Identifier="3822956e-c528-a2a2-f592-43f8cbe678ea")
public static String es_PE_FIELD_Printer_Description_Help="Observación";

@XendraTrl(Identifier="3822956e-c528-a2a2-f592-43f8cbe678ea")
public static String es_PE_FIELD_Printer_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="ab288dfd-260a-06e7-1631-f355353b0220",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3822956e-c528-a2a2-f592-43f8cbe678ea")
public static final String FIELDNAME_Printer_Description="3822956e-c528-a2a2-f592-43f8cbe678ea";

@XendraTrl(Identifier="80e81597-2f0a-9056-1a1a-5996da23db72")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="80e81597-2f0a-9056-1a1a-5996da23db72",
Synchronized="2017-08-05 16:52:35.0")
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
@XendraTrl(Identifier="77bc6e69-9660-4dd9-9775-bb46e07cb720")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="77bc6e69-9660-4dd9-9775-bb46e07cb720",
Synchronized="2017-08-05 16:52:35.0")
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

@XendraTrl(Identifier="d2a676d9-29c1-0328-d5fe-4c9b6c4bfb16")
public static String es_PE_FIELD_Printer_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="d2a676d9-29c1-0328-d5fe-4c9b6c4bfb16")
public static String es_PE_FIELD_Printer_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="d2a676d9-29c1-0328-d5fe-4c9b6c4bfb16")
public static String es_PE_FIELD_Printer_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="ab288dfd-260a-06e7-1631-f355353b0220",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="d2a676d9-29c1-0328-d5fe-4c9b6c4bfb16")
public static final String FIELDNAME_Printer_Name="d2a676d9-29c1-0328-d5fe-4c9b6c4bfb16";

@XendraTrl(Identifier="4a47e26b-d9b5-d1c0-eb79-51de2990c5a4")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4a47e26b-d9b5-d1c0-eb79-51de2990c5a4",
Synchronized="2017-08-05 16:52:35.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
}
