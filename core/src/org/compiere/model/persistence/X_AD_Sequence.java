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
/** Generated Model for AD_Sequence
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Sequence extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Sequence_ID id
@param trxName transaction
*/
public X_AD_Sequence (Properties ctx, int AD_Sequence_ID, String trxName)
{
super (ctx, AD_Sequence_ID, trxName);
/** if (AD_Sequence_ID == 0)
{
setAD_Sequence_ID (0);
setCurrentNext (0);	
// 1000000
setCurrentNextSys (0);	
// 100
setIncrementNo (0);	
// 1
setIsAutoSequence (false);	
// N
setName (null);
setStartNo (0);	
// 1000000
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Sequence (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=115 */
public static int Table_ID=MTable.getTable_ID("AD_Sequence");

@XendraTrl(Identifier="e95e9897-72d5-b197-3235-ee45bdbb875b")
public static String es_PE_TAB_Sequence_Description="Definir secuencia";

@XendraTrl(Identifier="e95e9897-72d5-b197-3235-ee45bdbb875b")
public static String es_PE_TAB_Sequence_Name="Secuencia";

@XendraTrl(Identifier="e95e9897-72d5-b197-3235-ee45bdbb875b")
public static String es_PE_TAB_Sequence_Help="La ventana de Secuencia define como los números de documentos serán puestos en secuencia. Cambia la manera en que los números de documentos son generados. Es posible adicionar un prefijo ó sufijo.";

@XendraTab(Name="Sequence",Description="Sequence Definition",
Help="The Sequence Tab defines the numeric sequencing to use for documents.  These can also include a alpha suffix and / or prefix.",
AD_Window_ID="c20f0a4a-33e9-82a3-2cc2-3b602cd050d2",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="e95e9897-72d5-b197-3235-ee45bdbb875b",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Sequence="e95e9897-72d5-b197-3235-ee45bdbb875b";

@XendraTrl(Identifier="4f1d4e4f-2201-f133-4a63-be2f2a3f65b0")
public static String es_PE_TABLE_AD_Sequence_Name="Secuencia";

@XendraTable(Name="Sequence",Description="Document Sequence",Help="",TableName="AD_Sequence",
AccessLevel="6",AD_Window_ID="c20f0a4a-33e9-82a3-2cc2-3b602cd050d2",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=90,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="4f1d4e4f-2201-f133-4a63-be2f2a3f65b0",Synchronized="2017-08-16 11:40:59.0")
/** TableName=AD_Sequence */
public static final String Table_Name="AD_Sequence";


@XendraIndex(Name="ad_sequence_name",Identifier="8d68ff0a-33f0-b602-1170-d43f8b72666f",
Column_Names="ad_client_id, name",IsUnique="true",
TableIdentifier="8d68ff0a-33f0-b602-1170-d43f8b72666f",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_ad_sequence_name = "8d68ff0a-33f0-b602-1170-d43f8b72666f";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Sequence");

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
    Table_ID = MTable.getTable_ID("AD_Sequence");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Sequence[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Sequence.
@param AD_Sequence_ID Document Sequence */
public void setAD_Sequence_ID (int AD_Sequence_ID)
{
if (AD_Sequence_ID < 1) throw new IllegalArgumentException ("AD_Sequence_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Sequence_ID, Integer.valueOf(AD_Sequence_ID));
}
/** Get Sequence.
@return Document Sequence */
public int getAD_Sequence_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Sequence_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="84ba4621-3d64-39c7-7c83-b9b37ebc0385")
public static String es_PE_FIELD_Sequence_Sequence_Description="Secuencia del documento";

@XendraTrl(Identifier="84ba4621-3d64-39c7-7c83-b9b37ebc0385")
public static String es_PE_FIELD_Sequence_Sequence_Help="La secuencia indica el número de secuencia a ser usado para los documentos";

@XendraTrl(Identifier="84ba4621-3d64-39c7-7c83-b9b37ebc0385")
public static String es_PE_FIELD_Sequence_Sequence_Name="Secuencia";

@XendraField(AD_Column_ID="AD_Sequence_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e95e9897-72d5-b197-3235-ee45bdbb875b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="84ba4621-3d64-39c7-7c83-b9b37ebc0385")
public static final String FIELDNAME_Sequence_Sequence="84ba4621-3d64-39c7-7c83-b9b37ebc0385";
/** Column name AD_Sequence_ID */
public static final String COLUMNNAME_AD_Sequence_ID = "AD_Sequence_ID";
/** Set Current Next.
@param CurrentNext The next number to be used */
public void setCurrentNext (int CurrentNext)
{
set_Value (COLUMNNAME_CurrentNext, Integer.valueOf(CurrentNext));
}
/** Get Current Next.
@return The next number to be used */
public int getCurrentNext() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_CurrentNext);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="bbf73bd1-0f84-8b6d-2b81-b1b6932f35eb")
public static String es_PE_FIELD_Sequence_CurrentNext_Description="El número siguiente a ser usado";

@XendraTrl(Identifier="bbf73bd1-0f84-8b6d-2b81-b1b6932f35eb")
public static String es_PE_FIELD_Sequence_CurrentNext_Help="El siguiente corriente indica el número siguiente a usar para este documento";

@XendraTrl(Identifier="bbf73bd1-0f84-8b6d-2b81-b1b6932f35eb")
public static String es_PE_FIELD_Sequence_CurrentNext_Name="Siguiente Secuencia";

@XendraField(AD_Column_ID="CurrentNext",IsCentrallyMaintained=true,
AD_Tab_ID="e95e9897-72d5-b197-3235-ee45bdbb875b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsAutoSequence@=Y",DisplayLength=11,IsReadOnly=false,SeqNo=110,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="bbf73bd1-0f84-8b6d-2b81-b1b6932f35eb")
public static final String FIELDNAME_Sequence_CurrentNext="bbf73bd1-0f84-8b6d-2b81-b1b6932f35eb";

@XendraTrl(Identifier="19fc63e7-6726-0398-dc8d-91cb4a801fe4")
public static String es_PE_COLUMN_CurrentNext_Name="Siguiente Secuencia";

@XendraColumn(AD_Element_ID="3cb3c545-8207-00bd-81ee-d16aaa68f4c2",ColumnName="CurrentNext",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="1000000",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="19fc63e7-6726-0398-dc8d-91cb4a801fe4",Synchronized="2017-08-05 16:52:50.0")
/** Column name CurrentNext */
public static final String COLUMNNAME_CurrentNext = "CurrentNext";
/** Set Current Next (System).
@param CurrentNextSys Next sequence for system use */
public void setCurrentNextSys (int CurrentNextSys)
{
set_Value (COLUMNNAME_CurrentNextSys, Integer.valueOf(CurrentNextSys));
}
/** Get Current Next (System).
@return Next sequence for system use */
public int getCurrentNextSys() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_CurrentNextSys);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6e305001-ba28-4896-96c9-865bcaa12a74")
public static String es_PE_FIELD_Sequence_CurrentNextSystem_Description="Siguiente secuencia para uso del sistema";

@XendraTrl(Identifier="6e305001-ba28-4896-96c9-865bcaa12a74")
public static String es_PE_FIELD_Sequence_CurrentNextSystem_Help="Este campo es para uso del sistema solamente y no debe ser modificado";

@XendraTrl(Identifier="6e305001-ba28-4896-96c9-865bcaa12a74")
public static String es_PE_FIELD_Sequence_CurrentNextSystem_Name="Siguiente Secuencia (Sistema)";

@XendraField(AD_Column_ID="CurrentNextSys",IsCentrallyMaintained=true,
AD_Tab_ID="e95e9897-72d5-b197-3235-ee45bdbb875b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsAutoSequence@=Y",DisplayLength=11,IsReadOnly=true,SeqNo=120,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="6e305001-ba28-4896-96c9-865bcaa12a74")
public static final String FIELDNAME_Sequence_CurrentNextSystem="6e305001-ba28-4896-96c9-865bcaa12a74";

@XendraTrl(Identifier="5ebadf6e-41eb-025f-967a-08a1704183b4")
public static String es_PE_COLUMN_CurrentNextSys_Name="Siguiente Secuencia (Sistema)";

@XendraColumn(AD_Element_ID="e5355a6b-2f7c-41af-5e52-58ecf1a8f4de",ColumnName="CurrentNextSys",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="100",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5ebadf6e-41eb-025f-967a-08a1704183b4",
Synchronized="2017-08-05 16:52:50.0")
/** Column name CurrentNextSys */
public static final String COLUMNNAME_CurrentNextSys = "CurrentNextSys";
/** Set Date Column.
@param DateColumn Fully qualified date column */
public void setDateColumn (String DateColumn)
{
if (DateColumn != null && DateColumn.length() > 60)
{
log.warning("Length > 60 - truncated");
DateColumn = DateColumn.substring(0,59);
}
set_Value (COLUMNNAME_DateColumn, DateColumn);
}
/** Get Date Column.
@return Fully qualified date column */
public String getDateColumn() 
{
String value = (String)get_Value(COLUMNNAME_DateColumn);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="8aa7ff68-0d9a-4201-c6b0-70575df3a171")
public static String es_PE_COLUMN_DateColumn_Name="Columna Fecha";

@XendraColumn(AD_Element_ID="1a98f054-ffe6-a3ce-8bf4-3de869c85eda",ColumnName="DateColumn",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8aa7ff68-0d9a-4201-c6b0-70575df3a171",
Synchronized="2017-08-05 16:52:50.0")
/** Column name DateColumn */
public static final String COLUMNNAME_DateColumn = "DateColumn";
/** Set decimalpattern.
@param decimalpattern decimalpattern */
public void setdecimalpattern (String decimalpattern)
{
if (decimalpattern != null && decimalpattern.length() > 40)
{
log.warning("Length > 40 - truncated");
decimalpattern = decimalpattern.substring(0,39);
}
set_Value (COLUMNNAME_decimalpattern, decimalpattern);
}
/** Get decimalpattern.
@return decimalpattern */
public String getdecimalpattern() 
{
String value = (String)get_Value(COLUMNNAME_decimalpattern);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="ec3dd3b9-52e1-51e6-00bf-efc5c49b8b89")
public static String es_PE_COLUMN_decimalpattern_Name="decimalpattern";

@XendraColumn(AD_Element_ID="1beb55a4-4be9-dab9-1db4-4e7e1410dce7",ColumnName="decimalpattern",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ec3dd3b9-52e1-51e6-00bf-efc5c49b8b89",
Synchronized="2017-08-05 16:52:50.0")
/** Column name decimalpattern */
public static final String COLUMNNAME_decimalpattern = "decimalpattern";
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

@XendraTrl(Identifier="70e4640d-ce50-918b-1d46-e6ea8cc7f6ac")
public static String es_PE_FIELD_Sequence_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="70e4640d-ce50-918b-1d46-e6ea8cc7f6ac")
public static String es_PE_FIELD_Sequence_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="70e4640d-ce50-918b-1d46-e6ea8cc7f6ac")
public static String es_PE_FIELD_Sequence_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="e95e9897-72d5-b197-3235-ee45bdbb875b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="70e4640d-ce50-918b-1d46-e6ea8cc7f6ac")
public static final String FIELDNAME_Sequence_Description="70e4640d-ce50-918b-1d46-e6ea8cc7f6ac";

@XendraTrl(Identifier="07ed3a17-da54-5ec1-4432-7bf1b1c04147")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="07ed3a17-da54-5ec1-4432-7bf1b1c04147",
Synchronized="2017-08-05 16:52:50.0")
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
@XendraTrl(Identifier="e1412808-7bea-42db-b700-145aa8f70dc0")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e1412808-7bea-42db-b700-145aa8f70dc0",
Synchronized="2017-08-05 16:52:50.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Increment.
@param IncrementNo The number to increment the last document number by */
public void setIncrementNo (int IncrementNo)
{
set_Value (COLUMNNAME_IncrementNo, Integer.valueOf(IncrementNo));
}
/** Get Increment.
@return The number to increment the last document number by */
public int getIncrementNo() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_IncrementNo);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3afb5d31-1bdb-b5e1-2dd4-e29b37f06c93")
public static String es_PE_FIELD_Sequence_Increment_Description="El número a incrementar a el último número de documento";

@XendraTrl(Identifier="3afb5d31-1bdb-b5e1-2dd4-e29b37f06c93")
public static String es_PE_FIELD_Sequence_Increment_Help="El incremento indica el numero a adicionar al último número de documento para obtener el número de secuencia siguiente";

@XendraTrl(Identifier="3afb5d31-1bdb-b5e1-2dd4-e29b37f06c93")
public static String es_PE_FIELD_Sequence_Increment_Name="Incremento";

@XendraField(AD_Column_ID="IncrementNo",IsCentrallyMaintained=true,
AD_Tab_ID="e95e9897-72d5-b197-3235-ee45bdbb875b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsAutoSequence@=Y",DisplayLength=11,IsReadOnly=false,SeqNo=100,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="3afb5d31-1bdb-b5e1-2dd4-e29b37f06c93")
public static final String FIELDNAME_Sequence_Increment="3afb5d31-1bdb-b5e1-2dd4-e29b37f06c93";

@XendraTrl(Identifier="9d901732-7d10-00a4-db2c-9d8e275ca487")
public static String es_PE_COLUMN_IncrementNo_Name="Incremento";

@XendraColumn(AD_Element_ID="e731c4f7-49de-196e-dea3-c6d1bc840633",ColumnName="IncrementNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="1",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9d901732-7d10-00a4-db2c-9d8e275ca487",
Synchronized="2017-08-05 16:52:50.0")
/** Column name IncrementNo */
public static final String COLUMNNAME_IncrementNo = "IncrementNo";
/** Set Activate Audit.
@param IsAudited Activate Audit Trail of what numbers are generated */
public void setIsAudited (boolean IsAudited)
{
set_Value (COLUMNNAME_IsAudited, Boolean.valueOf(IsAudited));
}
/** Get Activate Audit.
@return Activate Audit Trail of what numbers are generated */
public boolean isAudited() 
{
Object oo = get_Value(COLUMNNAME_IsAudited);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="27d2f7f9-ae6a-9af8-00db-e6fb13b96e30")
public static String es_PE_FIELD_Sequence_ActivateAudit_Description="Activate Audit Trail of what numbers are generated";

@XendraTrl(Identifier="27d2f7f9-ae6a-9af8-00db-e6fb13b96e30")
public static String es_PE_FIELD_Sequence_ActivateAudit_Help="The Activate Audit checkbox indicates if an audit trail of numbers generated will be kept.";

@XendraTrl(Identifier="27d2f7f9-ae6a-9af8-00db-e6fb13b96e30")
public static String es_PE_FIELD_Sequence_ActivateAudit_Name="Activate Audit";

@XendraField(AD_Column_ID="IsAudited",IsCentrallyMaintained=true,
AD_Tab_ID="e95e9897-72d5-b197-3235-ee45bdbb875b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="27d2f7f9-ae6a-9af8-00db-e6fb13b96e30")
public static final String FIELDNAME_Sequence_ActivateAudit="27d2f7f9-ae6a-9af8-00db-e6fb13b96e30";

@XendraTrl(Identifier="cedac355-af9f-5684-737c-a80ba792361a")
public static String es_PE_COLUMN_IsAudited_Name="Activar Auditoria";

@XendraColumn(AD_Element_ID="65fadbac-0a5c-b4af-0885-19f77790a10c",ColumnName="IsAudited",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cedac355-af9f-5684-737c-a80ba792361a",
Synchronized="2017-08-05 16:52:50.0")
/** Column name IsAudited */
public static final String COLUMNNAME_IsAudited = "IsAudited";
/** Set Auto numbering.
@param IsAutoSequence Automatically assign the next number */
public void setIsAutoSequence (boolean IsAutoSequence)
{
set_Value (COLUMNNAME_IsAutoSequence, Boolean.valueOf(IsAutoSequence));
}
/** Get Auto numbering.
@return Automatically assign the next number */
public boolean isAutoSequence() 
{
Object oo = get_Value(COLUMNNAME_IsAutoSequence);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="420a9772-101b-0bfe-ba0f-6e4d266df113")
public static String es_PE_FIELD_Sequence_AutoNumbering_Description="Asignación automática del siguiente número";

@XendraTrl(Identifier="420a9772-101b-0bfe-ba0f-6e4d266df113")
public static String es_PE_FIELD_Sequence_AutoNumbering_Help="El cuadro de verificación numeración automática indica si el sistema asignará el siguiente número automáticamente.";

@XendraTrl(Identifier="420a9772-101b-0bfe-ba0f-6e4d266df113")
public static String es_PE_FIELD_Sequence_AutoNumbering_Name="Numeración Automática";

@XendraField(AD_Column_ID="IsAutoSequence",IsCentrallyMaintained=true,
AD_Tab_ID="e95e9897-72d5-b197-3235-ee45bdbb875b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="420a9772-101b-0bfe-ba0f-6e4d266df113")
public static final String FIELDNAME_Sequence_AutoNumbering="420a9772-101b-0bfe-ba0f-6e4d266df113";

@XendraTrl(Identifier="9477f662-ee81-3514-6058-0370ecc83b1c")
public static String es_PE_COLUMN_IsAutoSequence_Name="Numeración Automática";

@XendraColumn(AD_Element_ID="84792b66-cd09-b089-fab9-1498a44b0917",ColumnName="IsAutoSequence",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9477f662-ee81-3514-6058-0370ecc83b1c",
Synchronized="2017-08-05 16:52:50.0")
/** Column name IsAutoSequence */
public static final String COLUMNNAME_IsAutoSequence = "IsAutoSequence";
/** Set Used for Record ID.
@param IsTableID The document number  will be used as the record key */
public void setIsTableID (boolean IsTableID)
{
set_Value (COLUMNNAME_IsTableID, Boolean.valueOf(IsTableID));
}
/** Get Used for Record ID.
@return The document number  will be used as the record key */
public boolean isTableID() 
{
Object oo = get_Value(COLUMNNAME_IsTableID);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="a6552c7b-72dc-0f41-c152-30c596760987")
public static String es_PE_FIELD_Sequence_UsedForRecordID_Description="El número de documento será usado como clave del registro";

@XendraTrl(Identifier="a6552c7b-72dc-0f41-c152-30c596760987")
public static String es_PE_FIELD_Sequence_UsedForRecordID_Help="El cuadro de verificación usado para identificación del registro indica si el documento será usado como la clave para el registro.";

@XendraTrl(Identifier="a6552c7b-72dc-0f41-c152-30c596760987")
public static String es_PE_FIELD_Sequence_UsedForRecordID_Name="Usado para identificación del Registro";

@XendraField(AD_Column_ID="IsTableID",IsCentrallyMaintained=true,
AD_Tab_ID="e95e9897-72d5-b197-3235-ee45bdbb875b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsAutoSequence@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=80,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="a6552c7b-72dc-0f41-c152-30c596760987")
public static final String FIELDNAME_Sequence_UsedForRecordID="a6552c7b-72dc-0f41-c152-30c596760987";

@XendraTrl(Identifier="e71d23c3-23e0-95f3-a154-6bf32b500429")
public static String es_PE_COLUMN_IsTableID_Name="Usado para identificación del Registro";

@XendraColumn(AD_Element_ID="c2021a11-f3e2-8640-2337-9eb021c4ea61",ColumnName="IsTableID",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e71d23c3-23e0-95f3-a154-6bf32b500429",
Synchronized="2017-08-05 16:52:50.0")
/** Column name IsTableID */
public static final String COLUMNNAME_IsTableID = "IsTableID";
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

@XendraTrl(Identifier="5a329525-dd34-14d9-9fa2-fefaf1cc0e7e")
public static String es_PE_FIELD_Sequence_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="5a329525-dd34-14d9-9fa2-fefaf1cc0e7e")
public static String es_PE_FIELD_Sequence_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="5a329525-dd34-14d9-9fa2-fefaf1cc0e7e")
public static String es_PE_FIELD_Sequence_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="e95e9897-72d5-b197-3235-ee45bdbb875b",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="5a329525-dd34-14d9-9fa2-fefaf1cc0e7e")
public static final String FIELDNAME_Sequence_Name="5a329525-dd34-14d9-9fa2-fefaf1cc0e7e";

@XendraTrl(Identifier="20991fd3-abaa-b6a8-fd3f-1ad1fd8a90b3")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="20991fd3-abaa-b6a8-fd3f-1ad1fd8a90b3",
Synchronized="2017-08-05 16:52:50.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Prefix.
@param Prefix Prefix before the sequence number */
public void setPrefix (String Prefix)
{
if (Prefix != null && Prefix.length() > 10)
{
log.warning("Length > 10 - truncated");
Prefix = Prefix.substring(0,9);
}
set_Value (COLUMNNAME_Prefix, Prefix);
}
/** Get Prefix.
@return Prefix before the sequence number */
public String getPrefix() 
{
String value = (String)get_Value(COLUMNNAME_Prefix);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="39bdd34f-e348-e2a4-f1ba-316e39b56432")
public static String es_PE_FIELD_Sequence_Prefix_Description="Caracteres de prefijo en la identificación del documento";

@XendraTrl(Identifier="39bdd34f-e348-e2a4-f1ba-316e39b56432")
public static String es_PE_FIELD_Sequence_Prefix_Help="El Prefijo indica los caracteres a imprimir enfrente del número de documento";

@XendraTrl(Identifier="39bdd34f-e348-e2a4-f1ba-316e39b56432")
public static String es_PE_FIELD_Sequence_Prefix_Name="Prefijo";
@XendraField(AD_Column_ID="Prefix",
IsCentrallyMaintained=true,AD_Tab_ID="e95e9897-72d5-b197-3235-ee45bdbb875b",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="@IsTableID@=N",DisplayLength=11,IsReadOnly=false,SeqNo=150,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="39bdd34f-e348-e2a4-f1ba-316e39b56432")
public static final String FIELDNAME_Sequence_Prefix="39bdd34f-e348-e2a4-f1ba-316e39b56432";

@XendraTrl(Identifier="19aca7d7-1baa-b4ab-faed-7dc6229c007b")
public static String es_PE_COLUMN_Prefix_Name="Prefijo";

@XendraColumn(AD_Element_ID="be6a221d-f61b-ebf0-5a2c-d677571991d6",ColumnName="Prefix",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="19aca7d7-1baa-b4ab-faed-7dc6229c007b",
Synchronized="2017-08-05 16:52:50.0")
/** Column name Prefix */
public static final String COLUMNNAME_Prefix = "Prefix";
/** Set Document Serial.
@param Serial Serial Number for the Document */
public void setSerial (String Serial)
{
if (Serial != null && Serial.length() > 10)
{
log.warning("Length > 10 - truncated");
Serial = Serial.substring(0,9);
}
set_Value (COLUMNNAME_Serial, Serial);
}
/** Get Document Serial.
@return Serial Number for the Document */
public String getSerial() 
{
String value = (String)get_Value(COLUMNNAME_Serial);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="7e5fdfb2-5a54-322f-2a76-fb92c6a057b8")
public static String en_GB_FIELD_Sequence_DocumentSerial_Description="Serial Number for the Document";

@XendraTrl(Identifier="7e5fdfb2-5a54-322f-2a76-fb92c6a057b8")
public static String es_PE_FIELD_Sequence_DocumentSerial_Description="Serie del Documento";

@XendraTrl(Identifier="7e5fdfb2-5a54-322f-2a76-fb92c6a057b8")
public static String en_GB_FIELD_Sequence_DocumentSerial_Help="In some countries, documents have a serial in adition to it's number. Also, every serial has an independent sequence.";

@XendraTrl(Identifier="7e5fdfb2-5a54-322f-2a76-fb92c6a057b8")
public static String es_PE_FIELD_Sequence_DocumentSerial_Help="En algunos paises, los documentos tienen una serie ademas de su numero. Ademas, cada serie tiene una numeracion independiente.";

@XendraTrl(Identifier="7e5fdfb2-5a54-322f-2a76-fb92c6a057b8")
public static String en_GB_FIELD_Sequence_DocumentSerial_Name="Document Serial";

@XendraTrl(Identifier="7e5fdfb2-5a54-322f-2a76-fb92c6a057b8")
public static String es_PE_FIELD_Sequence_DocumentSerial_Name="Serie del Documento";

@XendraField(AD_Column_ID="Serial",IsCentrallyMaintained=true,
AD_Tab_ID="e95e9897-72d5-b197-3235-ee45bdbb875b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7e5fdfb2-5a54-322f-2a76-fb92c6a057b8")
public static final String FIELDNAME_Sequence_DocumentSerial="7e5fdfb2-5a54-322f-2a76-fb92c6a057b8";

@XendraTrl(Identifier="b428d755-4f2d-94ae-6ba5-ff5828a5dd4d")
public static String en_GB_COLUMN_Serial_Name="Document Serial";

@XendraTrl(Identifier="b428d755-4f2d-94ae-6ba5-ff5828a5dd4d")
public static String es_PE_COLUMN_Serial_Name="Serie del Documento";

@XendraColumn(AD_Element_ID="56277733-3963-25db-320e-99e754ca1e9c",ColumnName="Serial",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b428d755-4f2d-94ae-6ba5-ff5828a5dd4d",
Synchronized="2017-08-05 16:52:50.0")
/** Column name Serial */
public static final String COLUMNNAME_Serial = "Serial";
/** Set Restart sequence every Year.
@param StartNewYear Restart the sequence with Start on every 1/1 */
public void setStartNewYear (boolean StartNewYear)
{
set_Value (COLUMNNAME_StartNewYear, Boolean.valueOf(StartNewYear));
}
/** Get Restart sequence every Year.
@return Restart the sequence with Start on every 1/1 */
public boolean isStartNewYear() 
{
Object oo = get_Value(COLUMNNAME_StartNewYear);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="37cb1625-6ba4-bbef-0e8a-7fc481ffa4df")
public static String es_PE_FIELD_Sequence_RestartSequenceEveryYear_Description="Restart the sequence with Start on every 1/1";

@XendraTrl(Identifier="37cb1625-6ba4-bbef-0e8a-7fc481ffa4df")
public static String es_PE_FIELD_Sequence_RestartSequenceEveryYear_Help="The Restart Sequence Every Year checkbox indicates that the documents sequencing should return to the starting number on the first day of the year.";

@XendraTrl(Identifier="37cb1625-6ba4-bbef-0e8a-7fc481ffa4df")
public static String es_PE_FIELD_Sequence_RestartSequenceEveryYear_Name="Restart sequence every Year";

@XendraField(AD_Column_ID="StartNewYear",IsCentrallyMaintained=true,
AD_Tab_ID="e95e9897-72d5-b197-3235-ee45bdbb875b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsAutoSequence@=Y & @IsTableID@=N",DisplayLength=1,IsReadOnly=false,SeqNo=130,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="37cb1625-6ba4-bbef-0e8a-7fc481ffa4df")
public static final String FIELDNAME_Sequence_RestartSequenceEveryYear="37cb1625-6ba4-bbef-0e8a-7fc481ffa4df";

@XendraTrl(Identifier="f98b56b1-710c-7935-4d79-fa9ea8f21ee4")
public static String es_PE_COLUMN_StartNewYear_Name="Reinicio de Secuencia Anual";

@XendraColumn(AD_Element_ID="c095f2d3-aef6-c3f3-0fa4-a2720ab6f6fc",ColumnName="StartNewYear",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f98b56b1-710c-7935-4d79-fa9ea8f21ee4",
Synchronized="2017-08-05 16:52:50.0")
/** Column name StartNewYear */
public static final String COLUMNNAME_StartNewYear = "StartNewYear";
/** Set Start No.
@param StartNo Starting number/position */
public void setStartNo (int StartNo)
{
set_Value (COLUMNNAME_StartNo, Integer.valueOf(StartNo));
}
/** Get Start No.
@return Starting number/position */
public int getStartNo() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_StartNo);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="58203582-89bd-f87c-f10d-1300dab07bcd")
public static String es_PE_FIELD_Sequence_StartNo_Description="Número de inicio / posición";

@XendraTrl(Identifier="58203582-89bd-f87c-f10d-1300dab07bcd")
public static String es_PE_FIELD_Sequence_StartNo_Help="El Número de Inicio indica el número inicial del documento ó posición";

@XendraTrl(Identifier="58203582-89bd-f87c-f10d-1300dab07bcd")
public static String es_PE_FIELD_Sequence_StartNo_Name="No. de Inicio";

@XendraField(AD_Column_ID="StartNo",IsCentrallyMaintained=true,
AD_Tab_ID="e95e9897-72d5-b197-3235-ee45bdbb875b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsAutoSequence@=Y & @IsTableID@=N & @StartNewYear@=Y",DisplayLength=11,
IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,
Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="58203582-89bd-f87c-f10d-1300dab07bcd")
public static final String FIELDNAME_Sequence_StartNo="58203582-89bd-f87c-f10d-1300dab07bcd";

@XendraTrl(Identifier="0df89ac2-c5ea-d519-3ae1-5a128f4ed60a")
public static String es_PE_COLUMN_StartNo_Name="No. de Inicio";

@XendraColumn(AD_Element_ID="88d592be-43c4-2902-25a0-56584fd9c3f9",ColumnName="StartNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="1000000",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0df89ac2-c5ea-d519-3ae1-5a128f4ed60a",Synchronized="2017-08-05 16:52:50.0")
/** Column name StartNo */
public static final String COLUMNNAME_StartNo = "StartNo";
/** Set Suffix.
@param Suffix Suffix after the number */
public void setSuffix (String Suffix)
{
if (Suffix != null && Suffix.length() > 10)
{
log.warning("Length > 10 - truncated");
Suffix = Suffix.substring(0,9);
}
set_Value (COLUMNNAME_Suffix, Suffix);
}
/** Get Suffix.
@return Suffix after the number */
public String getSuffix() 
{
String value = (String)get_Value(COLUMNNAME_Suffix);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="324f8924-6159-2a62-b696-4867d666e806")
public static String es_PE_FIELD_Sequence_Suffix_Description="Sufijo del Número";

@XendraTrl(Identifier="324f8924-6159-2a62-b696-4867d666e806")
public static String es_PE_FIELD_Sequence_Suffix_Help="El Sufijo indica los caracteres a ser adicionados al número de documento.";

@XendraTrl(Identifier="324f8924-6159-2a62-b696-4867d666e806")
public static String es_PE_FIELD_Sequence_Suffix_Name="Sufijo";
@XendraField(AD_Column_ID="Suffix",
IsCentrallyMaintained=true,AD_Tab_ID="e95e9897-72d5-b197-3235-ee45bdbb875b",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="@IsTableID@=N",DisplayLength=11,IsReadOnly=false,SeqNo=160,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="324f8924-6159-2a62-b696-4867d666e806")
public static final String FIELDNAME_Sequence_Suffix="324f8924-6159-2a62-b696-4867d666e806";

@XendraTrl(Identifier="0ae71504-320b-4bfe-a72a-a191462d58f9")
public static String es_PE_COLUMN_Suffix_Name="Sufijo";

@XendraColumn(AD_Element_ID="0404eac5-3c2b-06f8-cfae-d59c9fd0677d",ColumnName="Suffix",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0ae71504-320b-4bfe-a72a-a191462d58f9",
Synchronized="2017-08-05 16:52:50.0")
/** Column name Suffix */
public static final String COLUMNNAME_Suffix = "Suffix";
/** Set Value Format.
@param VFormat Format of the value: Can contain fixed format elements, Variables: '_lLoOaAcCa09' */
public void setVFormat (String VFormat)
{
if (VFormat != null && VFormat.length() > 40)
{
log.warning("Length > 40 - truncated");
VFormat = VFormat.substring(0,39);
}
set_Value (COLUMNNAME_VFormat, VFormat);
}
/** Get Value Format.
@return Format of the value: Can contain fixed format elements, Variables: '_lLoOaAcCa09' */
public String getVFormat() 
{
String value = (String)get_Value(COLUMNNAME_VFormat);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="d1f4b587-b37b-b387-f5fd-d174b0a21066")
public static String es_PE_FIELD_Sequence_ValueFormat_Description="Formato del valor; puede contener elementos de formato fijo; Variables: \"_lLoOaAcCa09\"";

@XendraTrl(Identifier="d1f4b587-b37b-b387-f5fd-d174b0a21066")
public static String es_PE_FIELD_Sequence_ValueFormat_Help="<B>Elementos de validación:</B>";

@XendraTrl(Identifier="d1f4b587-b37b-b387-f5fd-d174b0a21066")
public static String es_PE_FIELD_Sequence_ValueFormat_Name="Formato del Valor";

@XendraField(AD_Column_ID="VFormat",IsCentrallyMaintained=true,
AD_Tab_ID="e95e9897-72d5-b197-3235-ee45bdbb875b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsAutoSequence@='N'",DisplayLength=20,IsReadOnly=false,SeqNo=90,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="d1f4b587-b37b-b387-f5fd-d174b0a21066")
public static final String FIELDNAME_Sequence_ValueFormat="d1f4b587-b37b-b387-f5fd-d174b0a21066";

@XendraTrl(Identifier="395495e0-e8be-192e-9b8c-bdab70cf3cbd")
public static String es_PE_COLUMN_VFormat_Name="Formato del Valor";

@XendraColumn(AD_Element_ID="041d14f4-3102-bf3a-cf36-5153817cbfad",ColumnName="VFormat",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="395495e0-e8be-192e-9b8c-bdab70cf3cbd",
Synchronized="2017-08-05 16:52:50.0")
/** Column name VFormat */
public static final String COLUMNNAME_VFormat = "VFormat";
}
