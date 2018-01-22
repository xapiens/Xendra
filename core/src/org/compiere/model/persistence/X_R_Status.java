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
/** Generated Model for R_Status
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_R_Status extends PO
{
/** Standard Constructor
@param ctx context
@param R_Status_ID id
@param trxName transaction
*/
public X_R_Status (Properties ctx, int R_Status_ID, String trxName)
{
super (ctx, R_Status_ID, trxName);
/** if (R_Status_ID == 0)
{
setIsClosed (false);	
// N
setIsDefault (false);	
// N
setIsFinalClose (false);	
// N
setIsOpen (false);	
// N
setIsWebCanUpdate (false);	
// N
setName (null);
setR_StatusCategory_ID (0);
setR_Status_ID (0);
setSeqNo (0);
setValue (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_R_Status (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=776 */
public static int Table_ID=MTable.getTable_ID("R_Status");

@XendraTrl(Identifier="6d08d781-e557-0f31-9c45-aa081b90ced0")
public static String es_PE_TAB_RequestStatus_Description="Mantener estado de solicitud";

@XendraTrl(Identifier="6d08d781-e557-0f31-9c45-aa081b90ced0")
public static String es_PE_TAB_RequestStatus_Name="Estado de Solicitud";

@XendraTrl(Identifier="6d08d781-e557-0f31-9c45-aa081b90ced0")
public static String es_PE_TAB_RequestStatus_Help="Estado si la solicitud (abierto, cerrado, investigando,..)";

@XendraTab(Name="Request Status",Description="Maintain Request Status",
Help="Status if the request (open, closed, investigating, ..)",
AD_Window_ID="3f6b13dd-0a25-4d00-9f77-7570bb7d42a1",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="6d08d781-e557-0f31-9c45-aa081b90ced0",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_RequestStatus="6d08d781-e557-0f31-9c45-aa081b90ced0";

@XendraTrl(Identifier="525e5b0a-ea69-eaa8-912c-9596c8b41158")
public static String es_PE_TABLE_R_Status_Name="Estado";

@XendraTable(Name="Status",Description="Request Status",Help="",TableName="R_Status",
AccessLevel="6",AD_Window_ID="3f6b13dd-0a25-4d00-9f77-7570bb7d42a1",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=130,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.standard",
Identifier="525e5b0a-ea69-eaa8-912c-9596c8b41158",Synchronized="2017-08-16 11:43:54.0")
/** TableName=R_Status */
public static final String Table_Name="R_Status";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"R_Status");

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
    Table_ID = MTable.getTable_ID("R_Status");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_R_Status[").append(get_ID()).append("]");
return sb.toString();
}
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

@XendraTrl(Identifier="18f78c3f-13d0-d4fa-99f3-e7ccdd19f366")
public static String es_PE_FIELD_RequestStatus_Description_Description="Observación";

@XendraTrl(Identifier="18f78c3f-13d0-d4fa-99f3-e7ccdd19f366")
public static String es_PE_FIELD_RequestStatus_Description_Help="Observación";

@XendraTrl(Identifier="18f78c3f-13d0-d4fa-99f3-e7ccdd19f366")
public static String es_PE_FIELD_RequestStatus_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="6d08d781-e557-0f31-9c45-aa081b90ced0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="18f78c3f-13d0-d4fa-99f3-e7ccdd19f366")
public static final String FIELDNAME_RequestStatus_Description="18f78c3f-13d0-d4fa-99f3-e7ccdd19f366";

@XendraTrl(Identifier="b57175b1-e9d4-6030-e1ad-f126a9553bc4")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b57175b1-e9d4-6030-e1ad-f126a9553bc4",
Synchronized="2017-08-05 16:55:59.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Comment/Help.
@param Help Comment or Hint */
public void setHelp (String Help)
{
set_Value (COLUMNNAME_Help, Help);
}
/** Get Comment/Help.
@return Comment or Hint */
public String getHelp() 
{
String value = (String)get_Value(COLUMNNAME_Help);
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

@XendraTrl(Identifier="3e32d283-3ca5-4719-7fe6-2f2e01d38831")
public static String es_PE_FIELD_RequestStatus_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="3e32d283-3ca5-4719-7fe6-2f2e01d38831")
public static String es_PE_FIELD_RequestStatus_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="3e32d283-3ca5-4719-7fe6-2f2e01d38831")
public static String es_PE_FIELD_RequestStatus_CommentHelp_Name="Ayuda";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="6d08d781-e557-0f31-9c45-aa081b90ced0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3e32d283-3ca5-4719-7fe6-2f2e01d38831")
public static final String FIELDNAME_RequestStatus_CommentHelp="3e32d283-3ca5-4719-7fe6-2f2e01d38831";

@XendraTrl(Identifier="58bbd8ef-d0d4-df04-2858-e902ae4631c8")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="58bbd8ef-d0d4-df04-2858-e902ae4631c8",
Synchronized="2017-08-05 16:55:59.0")
/** Column name Help */
public static final String COLUMNNAME_Help = "Help";
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
@XendraTrl(Identifier="7f4db25a-ca1a-46a0-a412-bed0fa2c07fc")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7f4db25a-ca1a-46a0-a412-bed0fa2c07fc",
Synchronized="2017-08-05 16:55:59.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Closed Status.
@param IsClosed The status is closed */
public void setIsClosed (boolean IsClosed)
{
set_Value (COLUMNNAME_IsClosed, Boolean.valueOf(IsClosed));
}
/** Get Closed Status.
@return The status is closed */
public boolean isClosed() 
{
Object oo = get_Value(COLUMNNAME_IsClosed);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="67babb04-cb3e-e3b7-f79c-1abb5e2e84ad")
public static String es_PE_FIELD_RequestStatus_ClosedStatus_Description="Este estado es cerrado";

@XendraTrl(Identifier="67babb04-cb3e-e3b7-f79c-1abb5e2e84ad")
public static String es_PE_FIELD_RequestStatus_ClosedStatus_Help="Este estado es cerrado";

@XendraTrl(Identifier="67babb04-cb3e-e3b7-f79c-1abb5e2e84ad")
public static String es_PE_FIELD_RequestStatus_ClosedStatus_Name="Estado Cerrado";

@XendraField(AD_Column_ID="IsClosed",IsCentrallyMaintained=true,
AD_Tab_ID="6d08d781-e557-0f31-9c45-aa081b90ced0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="67babb04-cb3e-e3b7-f79c-1abb5e2e84ad")
public static final String FIELDNAME_RequestStatus_ClosedStatus="67babb04-cb3e-e3b7-f79c-1abb5e2e84ad";

@XendraTrl(Identifier="b13671da-bffc-826d-1a8b-052c46e334b8")
public static String es_PE_COLUMN_IsClosed_Name="Estado Cerrado";

@XendraColumn(AD_Element_ID="a2f1da6b-5408-4e53-b0b9-51f029ef2549",ColumnName="IsClosed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b13671da-bffc-826d-1a8b-052c46e334b8",
Synchronized="2017-08-05 16:55:59.0")
/** Column name IsClosed */
public static final String COLUMNNAME_IsClosed = "IsClosed";
/** Set Default.
@param IsDefault Default value */
public void setIsDefault (boolean IsDefault)
{
set_Value (COLUMNNAME_IsDefault, Boolean.valueOf(IsDefault));
}
/** Get Default.
@return Default value */
public boolean isDefault() 
{
Object oo = get_Value(COLUMNNAME_IsDefault);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="d4e7505c-f714-dee0-29e0-9f0e969b339a")
public static String es_PE_FIELD_RequestStatus_Default_Description="Valor Predeterminado";

@XendraTrl(Identifier="d4e7505c-f714-dee0-29e0-9f0e969b339a")
public static String es_PE_FIELD_RequestStatus_Default_Help="El cuadro de verificación indica si este registro será usado como un valor predeterminado";

@XendraTrl(Identifier="d4e7505c-f714-dee0-29e0-9f0e969b339a")
public static String es_PE_FIELD_RequestStatus_Default_Name="Predeterminado";

@XendraField(AD_Column_ID="IsDefault",IsCentrallyMaintained=true,
AD_Tab_ID="6d08d781-e557-0f31-9c45-aa081b90ced0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d4e7505c-f714-dee0-29e0-9f0e969b339a")
public static final String FIELDNAME_RequestStatus_Default="d4e7505c-f714-dee0-29e0-9f0e969b339a";

@XendraTrl(Identifier="a763d19f-c7b6-d675-b1d6-c35d34f6fd98")
public static String es_PE_COLUMN_IsDefault_Name="Predeterminado";

@XendraColumn(AD_Element_ID="8617f892-e113-a5fd-8715-687f792f136c",ColumnName="IsDefault",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a763d19f-c7b6-d675-b1d6-c35d34f6fd98",
Synchronized="2017-08-05 16:55:59.0")
/** Column name IsDefault */
public static final String COLUMNNAME_IsDefault = "IsDefault";
/** Set Final Close.
@param IsFinalClose Entries with Final Close cannot be re-opened */
public void setIsFinalClose (boolean IsFinalClose)
{
set_Value (COLUMNNAME_IsFinalClose, Boolean.valueOf(IsFinalClose));
}
/** Get Final Close.
@return Entries with Final Close cannot be re-opened */
public boolean isFinalClose() 
{
Object oo = get_Value(COLUMNNAME_IsFinalClose);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="fe2a38dd-c1c8-7125-8925-6396d6feaf5e")
public static String es_PE_FIELD_RequestStatus_FinalClose_Description="Las entradas con cierre al final no pueden ser abiertas de nuevo";

@XendraTrl(Identifier="fe2a38dd-c1c8-7125-8925-6396d6feaf5e")
public static String es_PE_FIELD_RequestStatus_FinalClose_Name="Cierre Final";

@XendraField(AD_Column_ID="IsFinalClose",IsCentrallyMaintained=true,
AD_Tab_ID="6d08d781-e557-0f31-9c45-aa081b90ced0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsClosed@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fe2a38dd-c1c8-7125-8925-6396d6feaf5e")
public static final String FIELDNAME_RequestStatus_FinalClose="fe2a38dd-c1c8-7125-8925-6396d6feaf5e";

@XendraTrl(Identifier="34d7408d-0c95-3be0-3444-843810f9d53e")
public static String es_PE_COLUMN_IsFinalClose_Name="Cierre Final";

@XendraColumn(AD_Element_ID="d7084223-9c31-eac0-22a5-afcf0d53d60f",ColumnName="IsFinalClose",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="34d7408d-0c95-3be0-3444-843810f9d53e",
Synchronized="2017-08-05 16:55:59.0")
/** Column name IsFinalClose */
public static final String COLUMNNAME_IsFinalClose = "IsFinalClose";
/** Set Open Status.
@param IsOpen The status is closed */
public void setIsOpen (boolean IsOpen)
{
set_Value (COLUMNNAME_IsOpen, Boolean.valueOf(IsOpen));
}
/** Get Open Status.
@return The status is closed */
public boolean isOpen() 
{
Object oo = get_Value(COLUMNNAME_IsOpen);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="c7a87117-2157-a29b-3805-827fbae15716")
public static String es_PE_FIELD_RequestStatus_OpenStatus_Description="El estado es abierto.";

@XendraTrl(Identifier="c7a87117-2157-a29b-3805-827fbae15716")
public static String es_PE_FIELD_RequestStatus_OpenStatus_Help="Esto permite tener las tres situaciones en general de \"no abierto\" - \"abrirse\" - \"cerrado\"";

@XendraTrl(Identifier="c7a87117-2157-a29b-3805-827fbae15716")
public static String es_PE_FIELD_RequestStatus_OpenStatus_Name="Estado Abierto";

@XendraField(AD_Column_ID="IsOpen",IsCentrallyMaintained=true,
AD_Tab_ID="6d08d781-e557-0f31-9c45-aa081b90ced0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c7a87117-2157-a29b-3805-827fbae15716")
public static final String FIELDNAME_RequestStatus_OpenStatus="c7a87117-2157-a29b-3805-827fbae15716";

@XendraTrl(Identifier="3f316638-c723-b5bd-fe5b-05dc4f3452f8")
public static String es_PE_COLUMN_IsOpen_Name="Estado Abierto";

@XendraColumn(AD_Element_ID="ddc4f303-c10f-fe35-992e-4bfe66b3b414",ColumnName="IsOpen",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3f316638-c723-b5bd-fe5b-05dc4f3452f8",
Synchronized="2017-08-05 16:55:59.0")
/** Column name IsOpen */
public static final String COLUMNNAME_IsOpen = "IsOpen";
/** Set Web Can Update.
@param IsWebCanUpdate Entry can be UPDATED from the Web */
public void setIsWebCanUpdate (boolean IsWebCanUpdate)
{
set_Value (COLUMNNAME_IsWebCanUpdate, Boolean.valueOf(IsWebCanUpdate));
}
/** Get Web Can Update.
@return Entry can be UPDATED from the Web */
public boolean isWebCanUpdate() 
{
Object oo = get_Value(COLUMNNAME_IsWebCanUpdate);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="a6b8a4ef-39f4-5bfe-25f6-164986f9693b")
public static String es_PE_FIELD_RequestStatus_WebCanUpdate_Description="La entrada puede ser actualizada vía Web";

@XendraTrl(Identifier="a6b8a4ef-39f4-5bfe-25f6-164986f9693b")
public static String es_PE_FIELD_RequestStatus_WebCanUpdate_Name="Puede ser actualizada vía Web";

@XendraField(AD_Column_ID="IsWebCanUpdate",IsCentrallyMaintained=true,
AD_Tab_ID="6d08d781-e557-0f31-9c45-aa081b90ced0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a6b8a4ef-39f4-5bfe-25f6-164986f9693b")
public static final String FIELDNAME_RequestStatus_WebCanUpdate="a6b8a4ef-39f4-5bfe-25f6-164986f9693b";

@XendraTrl(Identifier="d11d73d5-2363-1a8b-26a9-2844392ca62b")
public static String es_PE_COLUMN_IsWebCanUpdate_Name="Puede ser actualizada vía Web";

@XendraColumn(AD_Element_ID="59da57df-c385-26e1-3dfd-4fda6112805b",ColumnName="IsWebCanUpdate",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d11d73d5-2363-1a8b-26a9-2844392ca62b",
Synchronized="2017-08-05 16:55:59.0")
/** Column name IsWebCanUpdate */
public static final String COLUMNNAME_IsWebCanUpdate = "IsWebCanUpdate";
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
@XendraTrl(Identifier="aa3d2397-10f9-4a46-ca78-8017da59ab8a")
public static String es_PE_FIELD_RequestStatus_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="aa3d2397-10f9-4a46-ca78-8017da59ab8a")
public static String es_PE_FIELD_RequestStatus_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="aa3d2397-10f9-4a46-ca78-8017da59ab8a")
public static String es_PE_FIELD_RequestStatus_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="6d08d781-e557-0f31-9c45-aa081b90ced0",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=2,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="aa3d2397-10f9-4a46-ca78-8017da59ab8a")
public static final String FIELDNAME_RequestStatus_Name="aa3d2397-10f9-4a46-ca78-8017da59ab8a";

@XendraTrl(Identifier="69299255-6bdb-aa89-83a5-263ac13adce2")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="69299255-6bdb-aa89-83a5-263ac13adce2",
Synchronized="2017-08-05 16:55:59.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";

/** Next_Status_ID AD_Reference=81bbd31b-9a83-4bba-fe09-50c8d5a06a9c */
public static final int NEXT_STATUS_ID_AD_Reference_ID=345;
/** Set Next Status.
@param Next_Status_ID Move to next status automatically after timeout */
public void setNext_Status_ID (int Next_Status_ID)
{
if (Next_Status_ID <= 0) set_Value (COLUMNNAME_Next_Status_ID, null);
 else 
set_Value (COLUMNNAME_Next_Status_ID, Integer.valueOf(Next_Status_ID));
}
/** Get Next Status.
@return Move to next status automatically after timeout */
public int getNext_Status_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Next_Status_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="54b9228b-9c7c-360a-bafa-ac3117a0688f")
public static String es_PE_FIELD_RequestStatus_NextStatus_Description="Muéve al estado siguiente automáticamente después de tiempo agotado";

@XendraTrl(Identifier="54b9228b-9c7c-360a-bafa-ac3117a0688f")
public static String es_PE_FIELD_RequestStatus_NextStatus_Help="Despues de tiempo agotado, cambia el estado automaticamente.";

@XendraTrl(Identifier="54b9228b-9c7c-360a-bafa-ac3117a0688f")
public static String es_PE_FIELD_RequestStatus_NextStatus_Name="Siguiente Estado";

@XendraField(AD_Column_ID="Next_Status_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6d08d781-e557-0f31-9c45-aa081b90ced0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@TimeoutDays@!0",DisplayLength=14,IsReadOnly=false,SeqNo=140,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="54b9228b-9c7c-360a-bafa-ac3117a0688f")
public static final String FIELDNAME_RequestStatus_NextStatus="54b9228b-9c7c-360a-bafa-ac3117a0688f";

@XendraTrl(Identifier="58ff644e-cad6-318f-c573-b054d2f03f6b")
public static String es_PE_COLUMN_Next_Status_ID_Name="Siguiente Estado";

@XendraColumn(AD_Element_ID="903706ca-894c-f08c-e3c1-d4dcefb6e020",ColumnName="Next_Status_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="81bbd31b-9a83-4bba-fe09-50c8d5a06a9c",
AD_Val_Rule_ID="4f28ed0c-aad9-967d-e684-f95f4ca908ef",FieldLength=10,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="58ff644e-cad6-318f-c573-b054d2f03f6b",
Synchronized="2017-08-05 16:55:59.0")
/** Column name Next_Status_ID */
public static final String COLUMNNAME_Next_Status_ID = "Next_Status_ID";
/** Set Status Category.
@param R_StatusCategory_ID Request Status Category */
public void setR_StatusCategory_ID (int R_StatusCategory_ID)
{
if (R_StatusCategory_ID < 1) throw new IllegalArgumentException ("R_StatusCategory_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_R_StatusCategory_ID, Integer.valueOf(R_StatusCategory_ID));
}
/** Get Status Category.
@return Request Status Category */
public int getR_StatusCategory_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_StatusCategory_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5b282dff-b3be-e861-7993-35bae87823df")
public static String es_PE_FIELD_RequestStatus_StatusCategory_Description="Request Status Category";

@XendraTrl(Identifier="5b282dff-b3be-e861-7993-35bae87823df")
public static String es_PE_FIELD_RequestStatus_StatusCategory_Help="Category of Request Status enables to maintain different set of Status for different Request Categories";

@XendraTrl(Identifier="5b282dff-b3be-e861-7993-35bae87823df")
public static String es_PE_FIELD_RequestStatus_StatusCategory_Name="Status Category";

@XendraField(AD_Column_ID="R_StatusCategory_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6d08d781-e557-0f31-9c45-aa081b90ced0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5b282dff-b3be-e861-7993-35bae87823df")
public static final String FIELDNAME_RequestStatus_StatusCategory="5b282dff-b3be-e861-7993-35bae87823df";

@XendraTrl(Identifier="b7c94d08-bddc-f487-b59d-e43a40cd4dfa")
public static String es_PE_COLUMN_R_StatusCategory_ID_Name="Status Category";

@XendraColumn(AD_Element_ID="238d74b1-f9de-ab89-d971-f77cdda09e7b",
ColumnName="R_StatusCategory_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="b7c94d08-bddc-f487-b59d-e43a40cd4dfa",Synchronized="2017-08-05 16:55:59.0")
/** Column name R_StatusCategory_ID */
public static final String COLUMNNAME_R_StatusCategory_ID = "R_StatusCategory_ID";
/** Set Status.
@param R_Status_ID Request Status */
public void setR_Status_ID (int R_Status_ID)
{
if (R_Status_ID < 1) throw new IllegalArgumentException ("R_Status_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_R_Status_ID, Integer.valueOf(R_Status_ID));
}
/** Get Status.
@return Request Status */
public int getR_Status_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_Status_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="901747bc-8818-aa23-3501-da53d2ec9127")
public static String es_PE_FIELD_RequestStatus_Status_Description="Estado de la solicitud";

@XendraTrl(Identifier="901747bc-8818-aa23-3501-da53d2ec9127")
public static String es_PE_FIELD_RequestStatus_Status_Help="Estado de la solicitud (Abierta, cerrada, investigación, ..)";

@XendraTrl(Identifier="901747bc-8818-aa23-3501-da53d2ec9127")
public static String es_PE_FIELD_RequestStatus_Status_Name="Estado";

@XendraField(AD_Column_ID="R_Status_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6d08d781-e557-0f31-9c45-aa081b90ced0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="901747bc-8818-aa23-3501-da53d2ec9127")
public static final String FIELDNAME_RequestStatus_Status="901747bc-8818-aa23-3501-da53d2ec9127";
/** Column name R_Status_ID */
public static final String COLUMNNAME_R_Status_ID = "R_Status_ID";
/** Set Sequence.
@param SeqNo Method of ordering records: lowest number comes first */
public void setSeqNo (int SeqNo)
{
set_Value (COLUMNNAME_SeqNo, Integer.valueOf(SeqNo));
}
/** Get Sequence.
@return Method of ordering records: lowest number comes first */
public int getSeqNo() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_SeqNo);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getSeqNo()));
}

@XendraTrl(Identifier="3d962de4-371f-2edb-6c8b-78c168f005e1")
public static String es_PE_FIELD_RequestStatus_Sequence_Description="Método de ordenar registros; el número más bajo viene primero";

@XendraTrl(Identifier="3d962de4-371f-2edb-6c8b-78c168f005e1")
public static String es_PE_FIELD_RequestStatus_Sequence_Help="La Secuencia indica el orden de los registros";

@XendraTrl(Identifier="3d962de4-371f-2edb-6c8b-78c168f005e1")
public static String es_PE_FIELD_RequestStatus_Sequence_Name="Secuencia";

@XendraField(AD_Column_ID="SeqNo",IsCentrallyMaintained=true,
AD_Tab_ID="6d08d781-e557-0f31-9c45-aa081b90ced0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3d962de4-371f-2edb-6c8b-78c168f005e1")
public static final String FIELDNAME_RequestStatus_Sequence="3d962de4-371f-2edb-6c8b-78c168f005e1";

@XendraTrl(Identifier="e225bc59-dbe3-419b-2ec5-6118e4f93d51")
public static String es_PE_COLUMN_SeqNo_Name="Secuencia";

@XendraColumn(AD_Element_ID="38fa26fe-b59d-fce1-c129-420b57da738b",ColumnName="SeqNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e225bc59-dbe3-419b-2ec5-6118e4f93d51",
Synchronized="2017-08-05 16:55:59.0")
/** Column name SeqNo */
public static final String COLUMNNAME_SeqNo = "SeqNo";
/** Set Timeout in Days.
@param TimeoutDays Timeout in Days to change Status automatically */
public void setTimeoutDays (int TimeoutDays)
{
set_Value (COLUMNNAME_TimeoutDays, Integer.valueOf(TimeoutDays));
}
/** Get Timeout in Days.
@return Timeout in Days to change Status automatically */
public int getTimeoutDays() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_TimeoutDays);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4f1bcf2e-1ae1-92ca-3a02-eb4b42201b66")
public static String es_PE_FIELD_RequestStatus_TimeoutInDays_Description="Descanso en los días para cambiar estado automáticamente";

@XendraTrl(Identifier="4f1bcf2e-1ae1-92ca-3a02-eb4b42201b66")
public static String es_PE_FIELD_RequestStatus_TimeoutInDays_Help="Después del número de días de la inactividad, el estado se cambia automáticamente al estado siguiente. Si no se define ningún estado siguiente, el estado no se cambia.";

@XendraTrl(Identifier="4f1bcf2e-1ae1-92ca-3a02-eb4b42201b66")
public static String es_PE_FIELD_RequestStatus_TimeoutInDays_Name="Descanso en días";

@XendraField(AD_Column_ID="TimeoutDays",IsCentrallyMaintained=true,
AD_Tab_ID="6d08d781-e557-0f31-9c45-aa081b90ced0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4f1bcf2e-1ae1-92ca-3a02-eb4b42201b66")
public static final String FIELDNAME_RequestStatus_TimeoutInDays="4f1bcf2e-1ae1-92ca-3a02-eb4b42201b66";

@XendraTrl(Identifier="16f47112-5fb6-da1c-6485-c48e1f7e3979")
public static String es_PE_COLUMN_TimeoutDays_Name="Descanso en días";

@XendraColumn(AD_Element_ID="59c61201-9c9a-a063-dd84-18d625c4a332",ColumnName="TimeoutDays",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="16f47112-5fb6-da1c-6485-c48e1f7e3979",
Synchronized="2017-08-05 16:55:59.0")
/** Column name TimeoutDays */
public static final String COLUMNNAME_TimeoutDays = "TimeoutDays";

/** Update_Status_ID AD_Reference=81bbd31b-9a83-4bba-fe09-50c8d5a06a9c */
public static final int UPDATE_STATUS_ID_AD_Reference_ID=345;
/** Set Update Status.
@param Update_Status_ID Automatically change the status after entry from web */
public void setUpdate_Status_ID (int Update_Status_ID)
{
if (Update_Status_ID <= 0) set_Value (COLUMNNAME_Update_Status_ID, null);
 else 
set_Value (COLUMNNAME_Update_Status_ID, Integer.valueOf(Update_Status_ID));
}
/** Get Update Status.
@return Automatically change the status after entry from web */
public int getUpdate_Status_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Update_Status_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="409dc3d1-f77b-1232-9af9-efb307a69169")
public static String es_PE_FIELD_RequestStatus_UpdateStatus_Description="Cambie automáticamente el estado después de la entrada de Web";

@XendraTrl(Identifier="409dc3d1-f77b-1232-9af9-efb307a69169")
public static String es_PE_FIELD_RequestStatus_UpdateStatus_Help="Cambie el estado automáticamente después de que la entrada fuera cambiada vía Web";

@XendraTrl(Identifier="409dc3d1-f77b-1232-9af9-efb307a69169")
public static String es_PE_FIELD_RequestStatus_UpdateStatus_Name="Estado de Actualización";

@XendraField(AD_Column_ID="Update_Status_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6d08d781-e557-0f31-9c45-aa081b90ced0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsWebCanUpdate@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="409dc3d1-f77b-1232-9af9-efb307a69169")
public static final String FIELDNAME_RequestStatus_UpdateStatus="409dc3d1-f77b-1232-9af9-efb307a69169";

@XendraTrl(Identifier="8d27c985-2b12-35e7-1350-b7e9f444206b")
public static String es_PE_COLUMN_Update_Status_ID_Name="Estado de Actualización";

@XendraColumn(AD_Element_ID="ee0b1119-2142-3f90-7db7-0ad8bb8225c5",ColumnName="Update_Status_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="81bbd31b-9a83-4bba-fe09-50c8d5a06a9c",
AD_Val_Rule_ID="4f28ed0c-aad9-967d-e684-f95f4ca908ef",FieldLength=10,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8d27c985-2b12-35e7-1350-b7e9f444206b",
Synchronized="2017-08-05 16:55:59.0")
/** Column name Update_Status_ID */
public static final String COLUMNNAME_Update_Status_ID = "Update_Status_ID";
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
@XendraTrl(Identifier="1d878310-5179-0609-e02d-6b0bc92558aa")
public static String es_PE_FIELD_RequestStatus_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="1d878310-5179-0609-e02d-6b0bc92558aa")
public static String es_PE_FIELD_RequestStatus_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraTrl(Identifier="1d878310-5179-0609-e02d-6b0bc92558aa")
public static String es_PE_FIELD_RequestStatus_SearchKey_Name="Clave de Búsqueda";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="6d08d781-e557-0f31-9c45-aa081b90ced0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=50,SortNo=2,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1d878310-5179-0609-e02d-6b0bc92558aa")
public static final String FIELDNAME_RequestStatus_SearchKey="1d878310-5179-0609-e02d-6b0bc92558aa";

@XendraTrl(Identifier="4d4d0777-a388-3dd7-bb66-d4bdda09e785")
public static String es_PE_COLUMN_Value_Name="Clave de Búsqueda";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4d4d0777-a388-3dd7-bb66-d4bdda09e785",
Synchronized="2017-08-05 16:55:59.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
}
