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
import org.compiere.model.reference.REF_AD_MessageType;
/** Generated Model for AD_Message
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Message extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Message_ID id
@param trxName transaction
*/
public X_AD_Message (Properties ctx, int AD_Message_ID, String trxName)
{
super (ctx, AD_Message_ID, trxName);
/** if (AD_Message_ID == 0)
{
setAD_Message_ID (0);
setEntityType (null);	
// U
setMsgText (null);
setMsgType (null);	
// I
setValue (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Message (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=109 */
public static int Table_ID=MTable.getTable_ID("AD_Message");

@XendraTrl(Identifier="e3b24cba-d504-6a13-5fa8-97d17a1928eb")
public static String es_PE_TAB_Message_Description="Mensajes de error y de menú";

@XendraTrl(Identifier="e3b24cba-d504-6a13-5fa8-97d17a1928eb")
public static String es_PE_TAB_Message_Name="Mensaje";

@XendraTrl(Identifier="e3b24cba-d504-6a13-5fa8-97d17a1928eb")
public static String es_PE_TAB_Message_Help="La pestaña de mensajes despliega texto de mensajes de error y mensajes de menú";

@XendraTab(Name="Message",Description="Information Error and Menu Messages",
Help="The Message Tab displays error message text and menu messages",
AD_Window_ID="23494e0a-e276-3bbc-0f6d-b680c46d875a",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="e3b24cba-d504-6a13-5fa8-97d17a1928eb",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Message="e3b24cba-d504-6a13-5fa8-97d17a1928eb";

@XendraTrl(Identifier="fcdf8574-895d-afbb-fa11-ecc7096f9f8b")
public static String es_PE_TABLE_AD_Message_Name="Mensaje";

@XendraTable(Name="Message",Description="System Message",Help="",TableName="AD_Message",
AccessLevel="4",AD_Window_ID="23494e0a-e276-3bbc-0f6d-b680c46d875a",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=130,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="fcdf8574-895d-afbb-fa11-ecc7096f9f8b",Synchronized="2017-08-16 11:40:29.0")
/** TableName=AD_Message */
public static final String Table_Name="AD_Message";


@XendraIndex(Name="ad_message_value",Identifier="34ce5e06-0e5e-6d73-a2f2-e2ca45d95cbf",
Column_Names="value",IsUnique="true",TableIdentifier="34ce5e06-0e5e-6d73-a2f2-e2ca45d95cbf",
Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_ad_message_value = "34ce5e06-0e5e-6d73-a2f2-e2ca45d95cbf";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Message");

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
    Table_ID = MTable.getTable_ID("AD_Message");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Message[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Message.
@param AD_Message_ID System Message */
public void setAD_Message_ID (int AD_Message_ID)
{
if (AD_Message_ID < 1) throw new IllegalArgumentException ("AD_Message_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Message_ID, Integer.valueOf(AD_Message_ID));
}
/** Get Message.
@return System Message */
public int getAD_Message_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Message_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9120c351-bab5-97f9-a813-2481818dc5cb")
public static String es_PE_FIELD_Message_Message_Description="Mensaje del sistema";

@XendraTrl(Identifier="9120c351-bab5-97f9-a813-2481818dc5cb")
public static String es_PE_FIELD_Message_Message_Help="Mensajes de información y error.";

@XendraTrl(Identifier="9120c351-bab5-97f9-a813-2481818dc5cb")
public static String es_PE_FIELD_Message_Message_Name="Mensaje";

@XendraField(AD_Column_ID="AD_Message_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e3b24cba-d504-6a13-5fa8-97d17a1928eb",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9120c351-bab5-97f9-a813-2481818dc5cb")
public static final String FIELDNAME_Message_Message="9120c351-bab5-97f9-a813-2481818dc5cb";
/** Column name AD_Message_ID */
public static final String COLUMNNAME_AD_Message_ID = "AD_Message_ID";

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

@XendraTrl(Identifier="6af14875-25ca-d00e-9174-a08aa7471708")
public static String es_PE_FIELD_Message_EntityType_Description="Tipo de Entidad Diccionario; determina propiedad y sincronización";

@XendraTrl(Identifier="6af14875-25ca-d00e-9174-a08aa7471708")
public static String es_PE_FIELD_Message_EntityType_Help="Los tipos de entidad \"Diccionario\"; \"Adempiere\"; y \"Aplicación\" podrían ser automáticamente sincronizados y las personalizaciones eliminadas ó sobreescritas";

@XendraTrl(Identifier="6af14875-25ca-d00e-9174-a08aa7471708")
public static String es_PE_FIELD_Message_EntityType_Name="Tipo de Entidad";

@XendraField(AD_Column_ID="EntityType",IsCentrallyMaintained=true,
AD_Tab_ID="e3b24cba-d504-6a13-5fa8-97d17a1928eb",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6af14875-25ca-d00e-9174-a08aa7471708")
public static final String FIELDNAME_Message_EntityType="6af14875-25ca-d00e-9174-a08aa7471708";

@XendraTrl(Identifier="397c3030-de09-f55c-5ab3-b22328a43d2d")
public static String es_PE_COLUMN_EntityType_Name="Tipo de Entidad";

@XendraColumn(AD_Element_ID="5ba917bf-871c-6f19-aa50-962adc5de558",ColumnName="EntityType",
AD_Reference_ID=18,AD_Reference_Value_ID="fae4ad31-8ff1-5d5c-8d47-2426c541cd74",AD_Val_Rule_ID="",
FieldLength=4,DefaultValue="U",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="@EntityType@=D",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="397c3030-de09-f55c-5ab3-b22328a43d2d",Synchronized="2017-08-05 16:52:37.0")
/** Column name EntityType */
public static final String COLUMNNAME_EntityType = "EntityType";
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
@XendraTrl(Identifier="93d96685-8aea-46ba-9681-4e358b148a91")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="93d96685-8aea-46ba-9681-4e358b148a91",
Synchronized="2017-08-05 16:52:37.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Message Text.
@param MsgText Textual Informational, Menu or Error Message */
public void setMsgText (String MsgText)
{
if (MsgText == null) throw new IllegalArgumentException ("MsgText is mandatory.");
set_Value (COLUMNNAME_MsgText, MsgText);
}
/** Get Message Text.
@return Textual Informational, Menu or Error Message */
public String getMsgText() 
{
String value = (String)get_Value(COLUMNNAME_MsgText);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="03899011-9b52-7cf7-a2e9-9ba8cfed1281")
public static String es_PE_FIELD_Message_MessageText_Description="Texto Informativo; menú ó mensaje de error.";

@XendraTrl(Identifier="03899011-9b52-7cf7-a2e9-9ba8cfed1281")
public static String es_PE_FIELD_Message_MessageText_Help="El texto del mensaje indica el mensaje que desplegará";

@XendraTrl(Identifier="03899011-9b52-7cf7-a2e9-9ba8cfed1281")
public static String es_PE_FIELD_Message_MessageText_Name="Texto del Mensaje";

@XendraField(AD_Column_ID="MsgText",IsCentrallyMaintained=true,
AD_Tab_ID="e3b24cba-d504-6a13-5fa8-97d17a1928eb",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="03899011-9b52-7cf7-a2e9-9ba8cfed1281")
public static final String FIELDNAME_Message_MessageText="03899011-9b52-7cf7-a2e9-9ba8cfed1281";

@XendraTrl(Identifier="84efe9fc-9571-06ef-3027-6c53b96603f6")
public static String es_PE_COLUMN_MsgText_Name="Texto del Mensaje";

@XendraColumn(AD_Element_ID="693b4e43-e206-fcd3-96fb-0e63e1e2e64d",ColumnName="MsgText",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="84efe9fc-9571-06ef-3027-6c53b96603f6",
Synchronized="2017-08-05 16:52:37.0")
/** Column name MsgText */
public static final String COLUMNNAME_MsgText = "MsgText";
/** Set Message Tip.
@param MsgTip Additional tip or HELP for this message */
public void setMsgTip (String MsgTip)
{
set_Value (COLUMNNAME_MsgTip, MsgTip);
}
/** Get Message Tip.
@return Additional tip or HELP for this message */
public String getMsgTip() 
{
String value = (String)get_Value(COLUMNNAME_MsgTip);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="45697138-0a82-5927-9b57-3ffd5be2f2a7")
public static String es_PE_FIELD_Message_MessageTip_Description="Sugerencia adicional ó ayuda para este mensaje.";

@XendraTrl(Identifier="45697138-0a82-5927-9b57-3ffd5be2f2a7")
public static String es_PE_FIELD_Message_MessageTip_Help="La sugerencia del mensaje define ayuda adicional ó información acerca de este mensaje.";

@XendraTrl(Identifier="45697138-0a82-5927-9b57-3ffd5be2f2a7")
public static String es_PE_FIELD_Message_MessageTip_Name="Mensaje Sugerencia";

@XendraField(AD_Column_ID="MsgTip",IsCentrallyMaintained=true,
AD_Tab_ID="e3b24cba-d504-6a13-5fa8-97d17a1928eb",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="45697138-0a82-5927-9b57-3ffd5be2f2a7")
public static final String FIELDNAME_Message_MessageTip="45697138-0a82-5927-9b57-3ffd5be2f2a7";

@XendraTrl(Identifier="c3ed9049-317f-46c6-80bf-8e32a002e5bf")
public static String es_PE_COLUMN_MsgTip_Name="Mensaje Sugerencia";

@XendraColumn(AD_Element_ID="19341bef-2af3-a87b-a1da-1effb36c9ca2",ColumnName="MsgTip",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c3ed9049-317f-46c6-80bf-8e32a002e5bf",
Synchronized="2017-08-05 16:52:37.0")
/** Column name MsgTip */
public static final String COLUMNNAME_MsgTip = "MsgTip";

/** MsgType AD_Reference=c583c177-83fe-ff17-183e-a26d452f08a1 */
public static final int MSGTYPE_AD_Reference_ID=103;
/** Set Message Type.
@param MsgType Type of message (Informational, Menu or Error) */
public void setMsgType (String MsgType)
{
if (MsgType == null) throw new IllegalArgumentException ("MsgType is mandatory");
if (MsgType.equals(REF_AD_MessageType.Error) || MsgType.equals(REF_AD_MessageType.Information) || MsgType.equals(REF_AD_MessageType.Menu));
 else throw new IllegalArgumentException ("MsgType Invalid value - " + MsgType + " - Reference_ID=103 - E - I - M");
if (MsgType.length() > 1)
{
log.warning("Length > 1 - truncated");
MsgType = MsgType.substring(0,0);
}
set_Value (COLUMNNAME_MsgType, MsgType);
}
/** Get Message Type.
@return Type of message (Informational, Menu or Error) */
public String getMsgType() 
{
return (String)get_Value(COLUMNNAME_MsgType);
}

@XendraTrl(Identifier="0ca1b2e6-072d-6a93-56fd-0b1a36113aa6")
public static String es_PE_FIELD_Message_MessageType_Description="Tipo de mensaje (Informativo; Menú ó Error)";

@XendraTrl(Identifier="0ca1b2e6-072d-6a93-56fd-0b1a36113aa6")
public static String es_PE_FIELD_Message_MessageType_Help="El Tipo de Mensaje indica el tipo de mensaje siendo definido. Tipos de mensaje válidos son Informativos; Menú y Error";

@XendraTrl(Identifier="0ca1b2e6-072d-6a93-56fd-0b1a36113aa6")
public static String es_PE_FIELD_Message_MessageType_Name="Tipo de Mensaje";

@XendraField(AD_Column_ID="MsgType",IsCentrallyMaintained=true,
AD_Tab_ID="e3b24cba-d504-6a13-5fa8-97d17a1928eb",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0ca1b2e6-072d-6a93-56fd-0b1a36113aa6")
public static final String FIELDNAME_Message_MessageType="0ca1b2e6-072d-6a93-56fd-0b1a36113aa6";

@XendraTrl(Identifier="254eb6bb-4568-1b27-540d-80c8d803be7d")
public static String es_PE_COLUMN_MsgType_Name="Tipo de Mensaje";

@XendraColumn(AD_Element_ID="a2f5976c-4aa6-d240-e67d-a1efd677b985",ColumnName="MsgType",
AD_Reference_ID=17,AD_Reference_Value_ID="c583c177-83fe-ff17-183e-a26d452f08a1",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="I",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="254eb6bb-4568-1b27-540d-80c8d803be7d",Synchronized="2017-08-05 16:52:37.0")
/** Column name MsgType */
public static final String COLUMNNAME_MsgType = "MsgType";
/** Set Search Key.
@param Value Search key for the record in the format required - must be unique */
public void setValue (String Value)
{
if (Value == null) throw new IllegalArgumentException ("Value is mandatory.");
if (Value.length() > 40)
{
log.warning("Length > 40 - truncated");
Value = Value.substring(0,39);
}
set_Value (COLUMNNAME_Value, Value);
}
/** Get Search Key.
@return Search key for the record in the format required - must be unique */
public String getValue() 
{
String value = (String)get_Value(COLUMNNAME_Value);
if (value == null)
  return "";
return value;
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getValue());
}

@XendraTrl(Identifier="acc7938b-ccfd-c69b-8b05-a64242fa0af5")
public static String es_PE_FIELD_Message_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="acc7938b-ccfd-c69b-8b05-a64242fa0af5")
public static String es_PE_FIELD_Message_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraTrl(Identifier="acc7938b-ccfd-c69b-8b05-a64242fa0af5")
public static String es_PE_FIELD_Message_SearchKey_Name="Clave de Búsqueda";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="e3b24cba-d504-6a13-5fa8-97d17a1928eb",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="acc7938b-ccfd-c69b-8b05-a64242fa0af5")
public static final String FIELDNAME_Message_SearchKey="acc7938b-ccfd-c69b-8b05-a64242fa0af5";

@XendraTrl(Identifier="69e38f21-b7b8-db66-9209-63c5064cbaf4")
public static String es_PE_COLUMN_Value_Name="Clave de Búsqueda";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="69e38f21-b7b8-db66-9209-63c5064cbaf4",
Synchronized="2017-08-05 16:52:37.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
}
