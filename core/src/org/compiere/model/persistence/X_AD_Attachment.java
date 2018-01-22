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
/** Generated Model for AD_Attachment
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Attachment extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Attachment_ID id
@param trxName transaction
*/
public X_AD_Attachment (Properties ctx, int AD_Attachment_ID, String trxName)
{
super (ctx, AD_Attachment_ID, trxName);
/** if (AD_Attachment_ID == 0)
{
setAD_Attachment_ID (0);
setAD_Table_ID (0);
setRecord_ID (0);
setTitle (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Attachment (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=254 */
public static int Table_ID=MTable.getTable_ID("AD_Attachment");

@XendraTrl(Identifier="86e36ae0-2470-fc8a-1c40-c82f98c6e0d3")
public static String es_PE_TAB_Attachment_Description="Anexo";

@XendraTrl(Identifier="86e36ae0-2470-fc8a-1c40-c82f98c6e0d3")
public static String es_PE_TAB_Attachment_Name="Anexo";

@XendraTrl(Identifier="86e36ae0-2470-fc8a-1c40-c82f98c6e0d3")
public static String es_PE_TAB_Attachment_Help="La pestaña de anexos despliega los atributos de un anexo.";

@XendraTab(Name="Attachment",Description="Attachment",
Help="The Attachment tab displays the attributes of an attachment.",
AD_Window_ID="475d7b41-00bf-885a-0e9d-267d4139176f",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=false,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="86e36ae0-2470-fc8a-1c40-c82f98c6e0d3",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Attachment="86e36ae0-2470-fc8a-1c40-c82f98c6e0d3";

@XendraTrl(Identifier="602b9944-c892-e427-93b9-e68690d17490")
public static String es_PE_TABLE_AD_Attachment_Name="Anexo";

@XendraTable(Name="Attachment",Description="Attachment for the document",Help="",
TableName="AD_Attachment",AccessLevel="6",AD_Window_ID="475d7b41-00bf-885a-0e9d-267d4139176f",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="602b9944-c892-e427-93b9-e68690d17490",Synchronized="2017-08-16 11:39:58.0")
/** TableName=AD_Attachment */
public static final String Table_Name="AD_Attachment";


@XendraIndex(Name="ad_attachment_record",Identifier="63ebad0a-2799-0aeb-b41f-e422bb85d867",
Column_Names="ad_table_id, record_id",IsUnique="true",
TableIdentifier="63ebad0a-2799-0aeb-b41f-e422bb85d867",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_ad_attachment_record = "63ebad0a-2799-0aeb-b41f-e422bb85d867";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Attachment");

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
    Table_ID = MTable.getTable_ID("AD_Attachment");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Attachment[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Attachment.
@param AD_Attachment_ID Attachment for the document */
public void setAD_Attachment_ID (int AD_Attachment_ID)
{
if (AD_Attachment_ID < 1) throw new IllegalArgumentException ("AD_Attachment_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Attachment_ID, Integer.valueOf(AD_Attachment_ID));
}
/** Get Attachment.
@return Attachment for the document */
public int getAD_Attachment_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Attachment_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="358dd5cb-b553-a4c6-2991-b814fc844bd5")
public static String es_PE_FIELD_Attachment_Attachment_Description="Anexo para el documento";

@XendraTrl(Identifier="358dd5cb-b553-a4c6-2991-b814fc844bd5")
public static String es_PE_FIELD_Attachment_Attachment_Help="Anexos para el documento";

@XendraTrl(Identifier="358dd5cb-b553-a4c6-2991-b814fc844bd5")
public static String es_PE_FIELD_Attachment_Attachment_Name="Anexo";

@XendraField(AD_Column_ID="AD_Attachment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="86e36ae0-2470-fc8a-1c40-c82f98c6e0d3",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="358dd5cb-b553-a4c6-2991-b814fc844bd5")
public static final String FIELDNAME_Attachment_Attachment="358dd5cb-b553-a4c6-2991-b814fc844bd5";
/** Column name AD_Attachment_ID */
public static final String COLUMNNAME_AD_Attachment_ID = "AD_Attachment_ID";
/** Set Table.
@param AD_Table_ID Database Table information */
public void setAD_Table_ID (int AD_Table_ID)
{
if (AD_Table_ID < 1) throw new IllegalArgumentException ("AD_Table_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Table_ID, Integer.valueOf(AD_Table_ID));
}
/** Get Table.
@return Database Table information */
public int getAD_Table_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Table_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="fc35494b-e7e1-b9bd-0480-45892e290020")
public static String es_PE_FIELD_Attachment_Table_Description="Tabla para los campos";

@XendraTrl(Identifier="fc35494b-e7e1-b9bd-0480-45892e290020")
public static String es_PE_FIELD_Attachment_Table_Help="La Tabla indica una tabla en la que reside un campo ó campos.";

@XendraTrl(Identifier="fc35494b-e7e1-b9bd-0480-45892e290020")
public static String es_PE_FIELD_Attachment_Table_Name="Tabla";

@XendraField(AD_Column_ID="AD_Table_ID",IsCentrallyMaintained=true,
AD_Tab_ID="86e36ae0-2470-fc8a-1c40-c82f98c6e0d3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fc35494b-e7e1-b9bd-0480-45892e290020")
public static final String FIELDNAME_Attachment_Table="fc35494b-e7e1-b9bd-0480-45892e290020";

@XendraTrl(Identifier="b71ff446-0fde-adf4-ac5d-58655cf9aa68")
public static String es_PE_COLUMN_AD_Table_ID_Name="Tabla";

@XendraColumn(AD_Element_ID="270eeb02-723b-0ecc-7f56-3c67fa71a7f1",ColumnName="AD_Table_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b71ff446-0fde-adf4-ac5d-58655cf9aa68",
Synchronized="2017-08-05 16:52:22.0")
/** Column name AD_Table_ID */
public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
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
@XendraTrl(Identifier="f42b4a83-2616-4d6c-9998-a1c5694d665e")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f42b4a83-2616-4d6c-9998-a1c5694d665e",
Synchronized="2017-08-05 16:52:22.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Record ID.
@param Record_ID Direct internal record ID */
public void setRecord_ID (int Record_ID)
{
if (Record_ID < 0) throw new IllegalArgumentException ("Record_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_Record_ID, Integer.valueOf(Record_ID));
}
/** Get Record ID.
@return Direct internal record ID */
public int getRecord_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Record_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="72e5375a-a192-af6a-f83d-407fe4aaf417")
public static String es_PE_FIELD_Attachment_RecordID_Description="Identificador de registro interno";

@XendraTrl(Identifier="72e5375a-a192-af6a-f83d-407fe4aaf417")
public static String es_PE_FIELD_Attachment_RecordID_Help="La ID de registro es el identificador único interno de un registro.";

@XendraTrl(Identifier="72e5375a-a192-af6a-f83d-407fe4aaf417")
public static String es_PE_FIELD_Attachment_RecordID_Name="ID de Registro";

@XendraField(AD_Column_ID="Record_ID",IsCentrallyMaintained=true,
AD_Tab_ID="86e36ae0-2470-fc8a-1c40-c82f98c6e0d3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="72e5375a-a192-af6a-f83d-407fe4aaf417")
public static final String FIELDNAME_Attachment_RecordID="72e5375a-a192-af6a-f83d-407fe4aaf417";

@XendraTrl(Identifier="52dad125-92c4-956e-492a-56a7e4eed965")
public static String es_PE_COLUMN_Record_ID_Name="ID de Registro";

@XendraColumn(AD_Element_ID="86e36e4b-d1dc-2deb-449d-c1f6769e1603",ColumnName="Record_ID",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="52dad125-92c4-956e-492a-56a7e4eed965",
Synchronized="2017-08-05 16:52:22.0")
/** Column name Record_ID */
public static final String COLUMNNAME_Record_ID = "Record_ID";
/** Set Text Message.
@param TextMsg Text Message */
public void setTextMsg (String TextMsg)
{
set_Value (COLUMNNAME_TextMsg, TextMsg);
}
/** Get Text Message.
@return Text Message */
public String getTextMsg() 
{
String value = (String)get_Value(COLUMNNAME_TextMsg);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="899b21d6-6086-19a4-a626-4299d045058f")
public static String es_PE_FIELD_Attachment_TextMessage_Description="Mensaje de texto";

@XendraTrl(Identifier="899b21d6-6086-19a4-a626-4299d045058f")
public static String es_PE_FIELD_Attachment_TextMessage_Name="Mensaje de texto";

@XendraField(AD_Column_ID="TextMsg",IsCentrallyMaintained=true,
AD_Tab_ID="86e36ae0-2470-fc8a-1c40-c82f98c6e0d3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="899b21d6-6086-19a4-a626-4299d045058f")
public static final String FIELDNAME_Attachment_TextMessage="899b21d6-6086-19a4-a626-4299d045058f";

@XendraTrl(Identifier="4333ca98-0a25-4b8c-1eed-f95bcd36a5b1")
public static String es_PE_COLUMN_TextMsg_Name="Mensaje de texto";

@XendraColumn(AD_Element_ID="377bebfe-238a-1c79-c1a9-13afa4448222",ColumnName="TextMsg",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4333ca98-0a25-4b8c-1eed-f95bcd36a5b1",
Synchronized="2017-08-05 16:52:22.0")
/** Column name TextMsg */
public static final String COLUMNNAME_TextMsg = "TextMsg";
/** Set Title.
@param Title Name this entity is referred to as */
public void setTitle (String Title)
{
if (Title == null) throw new IllegalArgumentException ("Title is mandatory.");
if (Title.length() > 60)
{
log.warning("Length > 60 - truncated");
Title = Title.substring(0,59);
}
set_Value (COLUMNNAME_Title, Title);
}
/** Get Title.
@return Name this entity is referred to as */
public String getTitle() 
{
String value = (String)get_Value(COLUMNNAME_Title);
if (value == null)
  return "";
return value;
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getTitle());
}

@XendraTrl(Identifier="89dbe59a-8f45-5b76-fc82-23ce918de058")
public static String es_PE_FIELD_Attachment_Title_Description="Nombre como se conoce esta entidad";

@XendraTrl(Identifier="89dbe59a-8f45-5b76-fc82-23ce918de058")
public static String es_PE_FIELD_Attachment_Title_Help="El título indica el nombre como se conoce esta entidad";

@XendraTrl(Identifier="89dbe59a-8f45-5b76-fc82-23ce918de058")
public static String es_PE_FIELD_Attachment_Title_Name="Título";
@XendraField(AD_Column_ID="Title",
IsCentrallyMaintained=true,AD_Tab_ID="86e36ae0-2470-fc8a-1c40-c82f98c6e0d3",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="89dbe59a-8f45-5b76-fc82-23ce918de058")
public static final String FIELDNAME_Attachment_Title="89dbe59a-8f45-5b76-fc82-23ce918de058";

@XendraTrl(Identifier="08d51c51-17c9-558e-61a2-e01146ad317f")
public static String es_PE_COLUMN_Title_Name="Título";

@XendraColumn(AD_Element_ID="05a7b975-a2e2-1303-e323-2e3fdda7ebd3",ColumnName="Title",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="08d51c51-17c9-558e-61a2-e01146ad317f",
Synchronized="2017-08-05 16:52:22.0")
/** Column name Title */
public static final String COLUMNNAME_Title = "Title";
}
