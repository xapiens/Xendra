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
/** Generated Model for B_BidComment
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_B_BidComment extends PO
{
/** Standard Constructor
@param ctx context
@param B_BidComment_ID id
@param trxName transaction
*/
public X_B_BidComment (Properties ctx, int B_BidComment_ID, String trxName)
{
super (ctx, B_BidComment_ID, trxName);
/** if (B_BidComment_ID == 0)
{
setAD_User_ID (0);
setB_BidComment_ID (0);
setB_Topic_ID (0);
setTextMsg (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_B_BidComment (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=685 */
public static int Table_ID=MTable.getTable_ID("B_BidComment");

@XendraTrl(Identifier="44e70825-7b5e-cb23-d966-d29c381ec683")
public static String es_PE_TAB_Comments_Name="Comentarios";

@XendraTrl(Identifier="44e70825-7b5e-cb23-d966-d29c381ec683")
public static String es_PE_TAB_Comments_Help="Cada uno puede dar los comentarios referentes a un asunto de la oferta - ej. preguntas, sugerencias.";

@XendraTab(Name="Comments",Description="Make a comment to a Bid Topic",
Help="Everyone can give comments concerning a Bid Topic - e.g. Questions, Suggestions",
AD_Window_ID="b526b654-eee4-ce2f-a903-14ef1f1b7296",SeqNo=60,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="44e70825-7b5e-cb23-d966-d29c381ec683",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Comments="44e70825-7b5e-cb23-d966-d29c381ec683";

@XendraTrl(Identifier="34481351-5085-afcf-5e0b-07844e415a91")
public static String es_PE_TABLE_B_BidComment_Name="Comentario De la Oferta";

@XendraTable(Name="Bid Comment",Description="Make a comment to a Bid Topic",Help="",
TableName="B_BidComment",AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.bids",Identifier="34481351-5085-afcf-5e0b-07844e415a91",
Synchronized="2017-08-16 11:41:16.0")
/** TableName=B_BidComment */
public static final String Table_Name="B_BidComment";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"B_BidComment");

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
    Table_ID = MTable.getTable_ID("B_BidComment");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_B_BidComment[").append(get_ID()).append("]");
return sb.toString();
}
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

@XendraTrl(Identifier="35c98479-9756-90bf-7d99-34fedc49fe48")
public static String es_PE_FIELD_Comments_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="35c98479-9756-90bf-7d99-34fedc49fe48")
public static String es_PE_FIELD_Comments_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraTrl(Identifier="35c98479-9756-90bf-7d99-34fedc49fe48")
public static String es_PE_FIELD_Comments_UserContact_Name="Usuario";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="44e70825-7b5e-cb23-d966-d29c381ec683",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="35c98479-9756-90bf-7d99-34fedc49fe48")
public static final String FIELDNAME_Comments_UserContact="35c98479-9756-90bf-7d99-34fedc49fe48";

@XendraTrl(Identifier="3dd177e1-957c-5a3d-0698-5ee9fe8ae697")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3dd177e1-957c-5a3d-0698-5ee9fe8ae697",
Synchronized="2017-08-05 16:53:06.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
/** Set Bid Comment.
@param B_BidComment_ID Make a comment to a Bid Topic */
public void setB_BidComment_ID (int B_BidComment_ID)
{
if (B_BidComment_ID < 1) throw new IllegalArgumentException ("B_BidComment_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_B_BidComment_ID, Integer.valueOf(B_BidComment_ID));
}
/** Get Bid Comment.
@return Make a comment to a Bid Topic */
public int getB_BidComment_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_B_BidComment_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9d3efa5f-0e7d-58d3-6b47-450d5434af9b")
public static String es_PE_FIELD_Comments_BidComment_Help="Cada uno puede dar los comentarios referentes a un asunto de la oferta - ej. preguntas, sugerencias.";

@XendraTrl(Identifier="9d3efa5f-0e7d-58d3-6b47-450d5434af9b")
public static String es_PE_FIELD_Comments_BidComment_Name="Comentario De la Oferta";

@XendraField(AD_Column_ID="B_BidComment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="44e70825-7b5e-cb23-d966-d29c381ec683",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9d3efa5f-0e7d-58d3-6b47-450d5434af9b")
public static final String FIELDNAME_Comments_BidComment="9d3efa5f-0e7d-58d3-6b47-450d5434af9b";
/** Column name B_BidComment_ID */
public static final String COLUMNNAME_B_BidComment_ID = "B_BidComment_ID";
/** Set Topic.
@param B_Topic_ID Auction Topic */
public void setB_Topic_ID (int B_Topic_ID)
{
if (B_Topic_ID < 1) throw new IllegalArgumentException ("B_Topic_ID is mandatory.");
set_Value (COLUMNNAME_B_Topic_ID, Integer.valueOf(B_Topic_ID));
}
/** Get Topic.
@return Auction Topic */
public int getB_Topic_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_B_Topic_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7e5438ff-938b-7600-6f3d-999a7cf833a9")
public static String es_PE_FIELD_Comments_Topic_Description="Asunto de la subasta.";

@XendraTrl(Identifier="7e5438ff-938b-7600-6f3d-999a7cf833a9")
public static String es_PE_FIELD_Comments_Topic_Help="Decripción del articulo a vender ó a crear.";

@XendraTrl(Identifier="7e5438ff-938b-7600-6f3d-999a7cf833a9")
public static String es_PE_FIELD_Comments_Topic_Name="Asunto";

@XendraField(AD_Column_ID="B_Topic_ID",IsCentrallyMaintained=true,
AD_Tab_ID="44e70825-7b5e-cb23-d966-d29c381ec683",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7e5438ff-938b-7600-6f3d-999a7cf833a9")
public static final String FIELDNAME_Comments_Topic="7e5438ff-938b-7600-6f3d-999a7cf833a9";

@XendraTrl(Identifier="f8aaf1e2-1511-28fa-24c6-6b881849bb5f")
public static String es_PE_COLUMN_B_Topic_ID_Name="Asunto";

@XendraColumn(AD_Element_ID="769c2ab0-c0fe-bf49-cdc1-b072c5e6fdb8",ColumnName="B_Topic_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f8aaf1e2-1511-28fa-24c6-6b881849bb5f",
Synchronized="2017-08-05 16:53:06.0")
/** Column name B_Topic_ID */
public static final String COLUMNNAME_B_Topic_ID = "B_Topic_ID";
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
@XendraTrl(Identifier="e5090a94-4188-4b7b-a077-10db675eb363")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e5090a94-4188-4b7b-a077-10db675eb363",
Synchronized="2017-08-05 16:53:06.0")
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
@XendraTrl(Identifier="738a4cf6-1af0-a368-cecc-a634bc35c5af")
public static String es_PE_FIELD_Comments_TextMessage_Description="Mensaje de texto";

@XendraTrl(Identifier="738a4cf6-1af0-a368-cecc-a634bc35c5af")
public static String es_PE_FIELD_Comments_TextMessage_Name="Mensaje de texto";

@XendraField(AD_Column_ID="TextMsg",IsCentrallyMaintained=true,
AD_Tab_ID="44e70825-7b5e-cb23-d966-d29c381ec683",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="738a4cf6-1af0-a368-cecc-a634bc35c5af")
public static final String FIELDNAME_Comments_TextMessage="738a4cf6-1af0-a368-cecc-a634bc35c5af";

@XendraTrl(Identifier="c7a38d18-64dc-ace3-2b32-7cec7a7cd543")
public static String es_PE_COLUMN_TextMsg_Name="Mensaje de texto";

@XendraColumn(AD_Element_ID="377bebfe-238a-1c79-c1a9-13afa4448222",ColumnName="TextMsg",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c7a38d18-64dc-ace3-2b32-7cec7a7cd543",
Synchronized="2017-08-05 16:53:06.0")
/** Column name TextMsg */
public static final String COLUMNNAME_TextMsg = "TextMsg";
}
