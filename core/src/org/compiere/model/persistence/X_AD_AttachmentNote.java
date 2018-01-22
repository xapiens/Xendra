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
/** Generated Model for AD_AttachmentNote
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_AttachmentNote extends PO
{
/** Standard Constructor
@param ctx context
@param AD_AttachmentNote_ID id
@param trxName transaction
*/
public X_AD_AttachmentNote (Properties ctx, int AD_AttachmentNote_ID, String trxName)
{
super (ctx, AD_AttachmentNote_ID, trxName);
/** if (AD_AttachmentNote_ID == 0)
{
setAD_Attachment_ID (0);
setAD_AttachmentNote_ID (0);
setAD_User_ID (0);
setTextMsg (null);
setTitle (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_AttachmentNote (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=705 */
public static int Table_ID=MTable.getTable_ID("AD_AttachmentNote");

@XendraTrl(Identifier="9b6d6615-4dc9-db39-6eaf-d47fa020988d")
public static String es_PE_TAB_Note_Description="Nota Personal ";

@XendraTrl(Identifier="9b6d6615-4dc9-db39-6eaf-d47fa020988d")
public static String es_PE_TAB_Note_Name="Nota";
@XendraTab(Name="Note",Description="Personal Note",
Help="",AD_Window_ID="475d7b41-00bf-885a-0e9d-267d4139176f",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=false,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="9b6d6615-4dc9-db39-6eaf-d47fa020988d",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Note="9b6d6615-4dc9-db39-6eaf-d47fa020988d";

@XendraTrl(Identifier="ec348c1c-da7d-0f51-a8d1-c124908a5d31")
public static String es_PE_TABLE_AD_AttachmentNote_Name="Nota Adjunta";

@XendraTable(Name="Attachment Note",Description="Personal Attachment Note",Help="",
TableName="AD_AttachmentNote",AccessLevel="6",AD_Window_ID="475d7b41-00bf-885a-0e9d-267d4139176f",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="ec348c1c-da7d-0f51-a8d1-c124908a5d31",Synchronized="2017-08-16 11:39:58.0")
/** TableName=AD_AttachmentNote */
public static final String Table_Name="AD_AttachmentNote";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_AttachmentNote");

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
    Table_ID = MTable.getTable_ID("AD_AttachmentNote");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_AttachmentNote[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="ead0b1c7-73b9-3bfc-5502-fd7e76e6f11c")
public static String es_PE_FIELD_Note_Attachment_Description="Anexo para el documento";

@XendraTrl(Identifier="ead0b1c7-73b9-3bfc-5502-fd7e76e6f11c")
public static String es_PE_FIELD_Note_Attachment_Help="Anexos para el documento";

@XendraTrl(Identifier="ead0b1c7-73b9-3bfc-5502-fd7e76e6f11c")
public static String es_PE_FIELD_Note_Attachment_Name="Anexo";

@XendraField(AD_Column_ID="AD_Attachment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9b6d6615-4dc9-db39-6eaf-d47fa020988d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ead0b1c7-73b9-3bfc-5502-fd7e76e6f11c")
public static final String FIELDNAME_Note_Attachment="ead0b1c7-73b9-3bfc-5502-fd7e76e6f11c";

@XendraTrl(Identifier="9e602b29-8b74-8e9c-7ac6-8222782d1c08")
public static String es_PE_COLUMN_AD_Attachment_ID_Name="Anexo";

@XendraColumn(AD_Element_ID="7946bab7-3c94-9b03-35d6-e7beecb76464",ColumnName="AD_Attachment_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9e602b29-8b74-8e9c-7ac6-8222782d1c08",
Synchronized="2017-08-05 16:52:22.0")
/** Column name AD_Attachment_ID */
public static final String COLUMNNAME_AD_Attachment_ID = "AD_Attachment_ID";
/** Set Attachment Note.
@param AD_AttachmentNote_ID Personal Attachment Note */
public void setAD_AttachmentNote_ID (int AD_AttachmentNote_ID)
{
if (AD_AttachmentNote_ID < 1) throw new IllegalArgumentException ("AD_AttachmentNote_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_AttachmentNote_ID, Integer.valueOf(AD_AttachmentNote_ID));
}
/** Get Attachment Note.
@return Personal Attachment Note */
public int getAD_AttachmentNote_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_AttachmentNote_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ced882e4-e555-b09c-c5f8-8ec61bdde5ac")
public static String es_PE_FIELD_Note_AttachmentNote_Description="Nota personal adjunta";

@XendraTrl(Identifier="ced882e4-e555-b09c-c5f8-8ec61bdde5ac")
public static String es_PE_FIELD_Note_AttachmentNote_Name="Nota Adjunta";

@XendraField(AD_Column_ID="AD_AttachmentNote_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9b6d6615-4dc9-db39-6eaf-d47fa020988d",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ced882e4-e555-b09c-c5f8-8ec61bdde5ac")
public static final String FIELDNAME_Note_AttachmentNote="ced882e4-e555-b09c-c5f8-8ec61bdde5ac";
/** Column name AD_AttachmentNote_ID */
public static final String COLUMNNAME_AD_AttachmentNote_ID = "AD_AttachmentNote_ID";
/** Set User/Contact.
@param AD_User_ID User within the system - Internal or Business Partner Contact */
public void setAD_User_ID (int AD_User_ID)
{
if (AD_User_ID < 1) throw new IllegalArgumentException ("AD_User_ID is mandatory.");
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

@XendraTrl(Identifier="966e39e4-9a9d-9d07-9e49-38a0c651266a")
public static String es_PE_FIELD_Note_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="966e39e4-9a9d-9d07-9e49-38a0c651266a")
public static String es_PE_FIELD_Note_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraTrl(Identifier="966e39e4-9a9d-9d07-9e49-38a0c651266a")
public static String es_PE_FIELD_Note_UserContact_Name="Usuario";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9b6d6615-4dc9-db39-6eaf-d47fa020988d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="966e39e4-9a9d-9d07-9e49-38a0c651266a")
public static final String FIELDNAME_Note_UserContact="966e39e4-9a9d-9d07-9e49-38a0c651266a";

@XendraTrl(Identifier="99018d5c-7d72-5058-7b63-e0beea11355c")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="99018d5c-7d72-5058-7b63-e0beea11355c",
Synchronized="2017-08-05 16:52:22.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
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
@XendraTrl(Identifier="5daf0a22-8b4a-4a34-93e7-fdd260bd2b18")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5daf0a22-8b4a-4a34-93e7-fdd260bd2b18",
Synchronized="2017-08-05 16:52:22.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Text Message.
@param TextMsg Text Message */
public void setTextMsg (String TextMsg)
{
if (TextMsg == null) throw new IllegalArgumentException ("TextMsg is mandatory.");
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
@XendraTrl(Identifier="f017e418-fbdc-dfe7-1080-c38f4f298656")
public static String es_PE_FIELD_Note_TextMessage_Description="Mensaje de texto";

@XendraTrl(Identifier="f017e418-fbdc-dfe7-1080-c38f4f298656")
public static String es_PE_FIELD_Note_TextMessage_Name="Mensaje de texto";

@XendraField(AD_Column_ID="TextMsg",IsCentrallyMaintained=true,
AD_Tab_ID="9b6d6615-4dc9-db39-6eaf-d47fa020988d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f017e418-fbdc-dfe7-1080-c38f4f298656")
public static final String FIELDNAME_Note_TextMessage="f017e418-fbdc-dfe7-1080-c38f4f298656";

@XendraTrl(Identifier="7773a890-7d47-2559-5e97-4a7b9371fcfe")
public static String es_PE_COLUMN_TextMsg_Name="Mensaje de texto";

@XendraColumn(AD_Element_ID="377bebfe-238a-1c79-c1a9-13afa4448222",ColumnName="TextMsg",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7773a890-7d47-2559-5e97-4a7b9371fcfe",
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

@XendraTrl(Identifier="8e247dd5-ff2b-3554-6ba2-db9e686a2b14")
public static String es_PE_FIELD_Note_Title_Description="Nombre como se conoce esta entidad";

@XendraTrl(Identifier="8e247dd5-ff2b-3554-6ba2-db9e686a2b14")
public static String es_PE_FIELD_Note_Title_Help="El título indica el nombre como se conoce esta entidad";

@XendraTrl(Identifier="8e247dd5-ff2b-3554-6ba2-db9e686a2b14")
public static String es_PE_FIELD_Note_Title_Name="Título";
@XendraField(AD_Column_ID="Title",
IsCentrallyMaintained=true,AD_Tab_ID="9b6d6615-4dc9-db39-6eaf-d47fa020988d",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="8e247dd5-ff2b-3554-6ba2-db9e686a2b14")
public static final String FIELDNAME_Note_Title="8e247dd5-ff2b-3554-6ba2-db9e686a2b14";

@XendraTrl(Identifier="61b12b27-55aa-8869-ea37-8ba60b8b1626")
public static String es_PE_COLUMN_Title_Name="Título";

@XendraColumn(AD_Element_ID="05a7b975-a2e2-1303-e323-2e3fdda7ebd3",ColumnName="Title",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="61b12b27-55aa-8869-ea37-8ba60b8b1626",
Synchronized="2017-08-05 16:52:22.0")
/** Column name Title */
public static final String COLUMNNAME_Title = "Title";
}
