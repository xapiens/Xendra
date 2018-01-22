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
/** Generated Model for R_StandardResponse
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_R_StandardResponse extends PO
{
/** Standard Constructor
@param ctx context
@param R_StandardResponse_ID id
@param trxName transaction
*/
public X_R_StandardResponse (Properties ctx, int R_StandardResponse_ID, String trxName)
{
super (ctx, R_StandardResponse_ID, trxName);
/** if (R_StandardResponse_ID == 0)
{
setName (null);
setResponseText (null);
setR_StandardResponse_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_R_StandardResponse (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=775 */
public static int Table_ID=MTable.getTable_ID("R_StandardResponse");

@XendraTrl(Identifier="5c80d030-1df3-a565-b0c1-d9cbe9e3a6a5")
public static String es_PE_TAB_StandardResponse_Description="Mantener respuesta estandar de la petición";

@XendraTrl(Identifier="5c80d030-1df3-a565-b0c1-d9cbe9e3a6a5")
public static String es_PE_TAB_StandardResponse_Name="Respuesta Estandar";

@XendraTrl(Identifier="5c80d030-1df3-a565-b0c1-d9cbe9e3a6a5")
public static String es_PE_TAB_StandardResponse_Help="Bloques de texto que se copiarán en el texto de la respuesta de la solicitud.";

@XendraTab(Name="Standard Response",Description="Maintain Request Standard Response ",
Help="Text blocks to be copied into request response text",
AD_Window_ID="958a7813-237f-199e-c86a-dce566105f5e",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="5c80d030-1df3-a565-b0c1-d9cbe9e3a6a5",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_StandardResponse="5c80d030-1df3-a565-b0c1-d9cbe9e3a6a5";

@XendraTrl(Identifier="a582e6c1-d2aa-29f1-3efe-9d24caaa9808")
public static String es_PE_TABLE_R_StandardResponse_Name="Respuesta Estandar";

@XendraTable(Name="Standard Response",Description="Request Standard Response ",Help="",
TableName="R_StandardResponse",AccessLevel="6",AD_Window_ID="958a7813-237f-199e-c86a-dce566105f5e",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=130,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.standard",
Identifier="a582e6c1-d2aa-29f1-3efe-9d24caaa9808",Synchronized="2017-08-16 11:43:54.0")
/** TableName=R_StandardResponse */
public static final String Table_Name="R_StandardResponse";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"R_StandardResponse");

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
    Table_ID = MTable.getTable_ID("R_StandardResponse");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_R_StandardResponse[").append(get_ID()).append("]");
return sb.toString();
}
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
@XendraTrl(Identifier="9cea4420-f5a8-42e7-ab13-e6a5e10a208d")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9cea4420-f5a8-42e7-ab13-e6a5e10a208d",
Synchronized="2017-08-05 16:55:59.0")
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

@XendraTrl(Identifier="d6f91b5e-df9b-24f7-ab9d-26a64ce6442d")
public static String es_PE_FIELD_StandardResponse_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="d6f91b5e-df9b-24f7-ab9d-26a64ce6442d")
public static String es_PE_FIELD_StandardResponse_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="d6f91b5e-df9b-24f7-ab9d-26a64ce6442d")
public static String es_PE_FIELD_StandardResponse_Name_Name="Nombre";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="5c80d030-1df3-a565-b0c1-d9cbe9e3a6a5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d6f91b5e-df9b-24f7-ab9d-26a64ce6442d")
public static final String FIELDNAME_StandardResponse_Name="d6f91b5e-df9b-24f7-ab9d-26a64ce6442d";

@XendraTrl(Identifier="d2ce9db1-c164-1dd7-41bd-a1032b95163e")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d2ce9db1-c164-1dd7-41bd-a1032b95163e",
Synchronized="2017-08-05 16:55:59.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Response Text.
@param ResponseText Request Response Text */
public void setResponseText (String ResponseText)
{
if (ResponseText == null) throw new IllegalArgumentException ("ResponseText is mandatory.");
set_Value (COLUMNNAME_ResponseText, ResponseText);
}
/** Get Response Text.
@return Request Response Text */
public String getResponseText() 
{
String value = (String)get_Value(COLUMNNAME_ResponseText);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="a5b1e5d2-5cb7-8319-b458-6e8a59733320")
public static String es_PE_FIELD_StandardResponse_ResponseText_Description="Texto de Respuesta de la Solicitud";

@XendraTrl(Identifier="a5b1e5d2-5cb7-8319-b458-6e8a59733320")
public static String es_PE_FIELD_StandardResponse_ResponseText_Help="Bloque de texto copiada en el area de texto de respuesta de la solicitud.";

@XendraTrl(Identifier="a5b1e5d2-5cb7-8319-b458-6e8a59733320")
public static String es_PE_FIELD_StandardResponse_ResponseText_Name="Texto de Respuesta";

@XendraField(AD_Column_ID="ResponseText",IsCentrallyMaintained=true,
AD_Tab_ID="5c80d030-1df3-a565-b0c1-d9cbe9e3a6a5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a5b1e5d2-5cb7-8319-b458-6e8a59733320")
public static final String FIELDNAME_StandardResponse_ResponseText="a5b1e5d2-5cb7-8319-b458-6e8a59733320";

@XendraTrl(Identifier="dc28f9cb-7860-1302-32d0-522db8854cb2")
public static String es_PE_COLUMN_ResponseText_Name="Texto de Respuesta";

@XendraColumn(AD_Element_ID="ac7865e2-cecd-f0a7-4a39-b7c5af9def95",ColumnName="ResponseText",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dc28f9cb-7860-1302-32d0-522db8854cb2",
Synchronized="2017-08-05 16:55:59.0")
/** Column name ResponseText */
public static final String COLUMNNAME_ResponseText = "ResponseText";
/** Set Standard Response.
@param R_StandardResponse_ID Request Standard Response  */
public void setR_StandardResponse_ID (int R_StandardResponse_ID)
{
if (R_StandardResponse_ID < 1) throw new IllegalArgumentException ("R_StandardResponse_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_R_StandardResponse_ID, Integer.valueOf(R_StandardResponse_ID));
}
/** Get Standard Response.
@return Request Standard Response  */
public int getR_StandardResponse_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_StandardResponse_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c5f5ba37-4c1e-5e57-169c-f10105c1dab3")
public static String es_PE_FIELD_StandardResponse_StandardResponse_Description="Respuesta estandar de la solicitud.";

@XendraTrl(Identifier="c5f5ba37-4c1e-5e57-169c-f10105c1dab3")
public static String es_PE_FIELD_StandardResponse_StandardResponse_Help="Bloques de texto que se copiarán en el texto de la respuesta de la solicitud.";

@XendraTrl(Identifier="c5f5ba37-4c1e-5e57-169c-f10105c1dab3")
public static String es_PE_FIELD_StandardResponse_StandardResponse_Name="Respuesta Estandar";

@XendraField(AD_Column_ID="R_StandardResponse_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5c80d030-1df3-a565-b0c1-d9cbe9e3a6a5",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c5f5ba37-4c1e-5e57-169c-f10105c1dab3")
public static final String FIELDNAME_StandardResponse_StandardResponse="c5f5ba37-4c1e-5e57-169c-f10105c1dab3";
/** Column name R_StandardResponse_ID */
public static final String COLUMNNAME_R_StandardResponse_ID = "R_StandardResponse_ID";
}
