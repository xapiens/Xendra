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
/** Generated Model for R_RequestUpdates
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_R_RequestUpdates extends PO
{
/** Standard Constructor
@param ctx context
@param R_RequestUpdates_ID id
@param trxName transaction
*/
public X_R_RequestUpdates (Properties ctx, int R_RequestUpdates_ID, String trxName)
{
super (ctx, R_RequestUpdates_ID, trxName);
/** if (R_RequestUpdates_ID == 0)
{
setAD_User_ID (0);
setIsSelfService (false);	
// N
setR_Request_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_R_RequestUpdates (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=783 */
public static int Table_ID=MTable.getTable_ID("R_RequestUpdates");

@XendraTrl(Identifier="f06dc870-0182-efd4-8ed6-ba86606bc5a7")
public static String es_PE_TAB_UpdateNotification_Description="Recipientes de la lista para recibir actualizaciones de la solicitud";

@XendraTrl(Identifier="f06dc870-0182-efd4-8ed6-ba86606bc5a7")
public static String es_PE_TAB_UpdateNotification_Name="Aviso de Actualización";

@XendraTab(Name="Update Notification",Description="List Recipients for to receive Request Updates",
Help="",AD_Window_ID="0090e49f-fcb0-617d-03f1-c1d90ff77da9",SeqNo=40,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="d7105c30-fc39-493f-a7dd-e87ab645d2d6",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="f06dc870-0182-efd4-8ed6-ba86606bc5a7",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_UpdateNotification="f06dc870-0182-efd4-8ed6-ba86606bc5a7";

@XendraTrl(Identifier="58802f18-8b40-69b7-b480-f51aa54282f6")
public static String es_PE_TAB_UpdateNotification2_Description="Recipientes de la lista para recibir actualizaciones de la solicitud";

@XendraTrl(Identifier="58802f18-8b40-69b7-b480-f51aa54282f6")
public static String es_PE_TAB_UpdateNotification2_Name="Aviso de Actualización";

@XendraTab(Name="Update Notification",Description="List Recipients for to receive Request Updates",
Help="",AD_Window_ID="0d176ab5-fb88-6941-47f1-b5effb1207a9",SeqNo=40,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="58802f18-8b40-69b7-b480-f51aa54282f6",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_UpdateNotification2="58802f18-8b40-69b7-b480-f51aa54282f6";

@XendraTrl(Identifier="c2b94f75-976e-8023-4f7b-70023c124135")
public static String es_PE_TABLE_R_RequestUpdates_Name="Request Update Recipiants";

@XendraTable(Name="Request Update Recipiants",Description="",Help="",TableName="R_RequestUpdates",
AccessLevel="7",AD_Window_ID="0d176ab5-fb88-6941-47f1-b5effb1207a9",AD_Val_Rule_ID="",IsKey=0,
LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.standard",
Identifier="c2b94f75-976e-8023-4f7b-70023c124135",Synchronized="2017-08-16 11:43:53.0")
/** TableName=R_RequestUpdates */
public static final String Table_Name="R_RequestUpdates";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"R_RequestUpdates");

protected BigDecimal accessLevel = BigDecimal.valueOf(7);
/** AccessLevel
@return 7 - System - Client - Org 
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
    Table_ID = MTable.getTable_ID("R_RequestUpdates");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_R_RequestUpdates[").append(get_ID()).append("]");
return sb.toString();
}
/** Set User/Contact.
@param AD_User_ID User within the system - Internal or Business Partner Contact */
public void setAD_User_ID (int AD_User_ID)
{
if (AD_User_ID < 1) throw new IllegalArgumentException ("AD_User_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
}
/** Get User/Contact.
@return User within the system - Internal or Business Partner Contact */
public int getAD_User_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2cad5ef7-53b0-c58f-d0a9-16e2f0dc1fc2")
public static String es_PE_FIELD_UpdateNotification_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="2cad5ef7-53b0-c58f-d0a9-16e2f0dc1fc2")
public static String es_PE_FIELD_UpdateNotification_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraTrl(Identifier="2cad5ef7-53b0-c58f-d0a9-16e2f0dc1fc2")
public static String es_PE_FIELD_UpdateNotification_UserContact_Name="Usuario";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f06dc870-0182-efd4-8ed6-ba86606bc5a7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2cad5ef7-53b0-c58f-d0a9-16e2f0dc1fc2")
public static final String FIELDNAME_UpdateNotification_UserContact="2cad5ef7-53b0-c58f-d0a9-16e2f0dc1fc2";

@XendraTrl(Identifier="197c08cc-6278-5fc9-9694-7805225b6501")
public static String es_PE_FIELD_UpdateNotification_UserContact2_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="197c08cc-6278-5fc9-9694-7805225b6501")
public static String es_PE_FIELD_UpdateNotification_UserContact2_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraTrl(Identifier="197c08cc-6278-5fc9-9694-7805225b6501")
public static String es_PE_FIELD_UpdateNotification_UserContact2_Name="Usuario";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="58802f18-8b40-69b7-b480-f51aa54282f6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="197c08cc-6278-5fc9-9694-7805225b6501")
public static final String FIELDNAME_UpdateNotification_UserContact2="197c08cc-6278-5fc9-9694-7805225b6501";

@XendraTrl(Identifier="93c84f99-80bd-cd99-31c1-fba838d6f709")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="93c84f99-80bd-cd99-31c1-fba838d6f709",
Synchronized="2017-08-05 16:55:57.0")
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
@XendraTrl(Identifier="01b6ed9c-89dd-4d34-80ec-30ce467258e6")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="01b6ed9c-89dd-4d34-80ec-30ce467258e6",
Synchronized="2017-08-05 16:55:57.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Self-Service.
@param IsSelfService This is a Self-Service entry or this entry can be changed via Self-Service */
public void setIsSelfService (boolean IsSelfService)
{
set_Value (COLUMNNAME_IsSelfService, Boolean.valueOf(IsSelfService));
}
/** Get Self-Service.
@return This is a Self-Service entry or this entry can be changed via Self-Service */
public boolean isSelfService() 
{
Object oo = get_Value(COLUMNNAME_IsSelfService);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="0e2982df-904e-f760-0b49-79a0ec4fd008")
public static String es_PE_FIELD_UpdateNotification_Self_Service_Description="Esta es una entrada del autoservicio ó esta entrada se puede cambiar vía autoservicio";

@XendraTrl(Identifier="0e2982df-904e-f760-0b49-79a0ec4fd008")
public static String es_PE_FIELD_UpdateNotification_Self_Service_Help="El autoservicio permite que los usuarios incorporen datos o que pongan al día sus datos. La bandera indica, que este expediente fue incorporado o creado vía autoservicio o que el usuario puede cambiarlo vía funcionalidad del autoservicio.";

@XendraTrl(Identifier="0e2982df-904e-f760-0b49-79a0ec4fd008")
public static String es_PE_FIELD_UpdateNotification_Self_Service_Name="Auto-Servicio";

@XendraField(AD_Column_ID="IsSelfService",IsCentrallyMaintained=true,
AD_Tab_ID="f06dc870-0182-efd4-8ed6-ba86606bc5a7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0e2982df-904e-f760-0b49-79a0ec4fd008")
public static final String FIELDNAME_UpdateNotification_Self_Service="0e2982df-904e-f760-0b49-79a0ec4fd008";

@XendraTrl(Identifier="81d7c6d1-04ef-e2eb-5587-110a02379b67")
public static String es_PE_FIELD_UpdateNotification_Self_Service2_Description="Esta es una entrada del autoservicio ó esta entrada se puede cambiar vía autoservicio";

@XendraTrl(Identifier="81d7c6d1-04ef-e2eb-5587-110a02379b67")
public static String es_PE_FIELD_UpdateNotification_Self_Service2_Help="El autoservicio permite que los usuarios incorporen datos o que pongan al día sus datos. La bandera indica, que este expediente fue incorporado o creado vía autoservicio o que el usuario puede cambiarlo vía funcionalidad del autoservicio.";

@XendraTrl(Identifier="81d7c6d1-04ef-e2eb-5587-110a02379b67")
public static String es_PE_FIELD_UpdateNotification_Self_Service2_Name="Auto-Servicio";

@XendraField(AD_Column_ID="IsSelfService",IsCentrallyMaintained=true,
AD_Tab_ID="58802f18-8b40-69b7-b480-f51aa54282f6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="81d7c6d1-04ef-e2eb-5587-110a02379b67")
public static final String FIELDNAME_UpdateNotification_Self_Service2="81d7c6d1-04ef-e2eb-5587-110a02379b67";

@XendraTrl(Identifier="2486a747-3d51-c80b-97d5-aea8373f2bb1")
public static String es_PE_COLUMN_IsSelfService_Name="Auto-Servicio";

@XendraColumn(AD_Element_ID="8f201030-f9ab-66d2-f4de-7209f41f2af8",ColumnName="IsSelfService",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2486a747-3d51-c80b-97d5-aea8373f2bb1",
Synchronized="2017-08-05 16:55:57.0")
/** Column name IsSelfService */
public static final String COLUMNNAME_IsSelfService = "IsSelfService";
/** Set Request.
@param R_Request_ID Request from a Business Partner or Prospect */
public void setR_Request_ID (int R_Request_ID)
{
if (R_Request_ID < 1) throw new IllegalArgumentException ("R_Request_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_R_Request_ID, Integer.valueOf(R_Request_ID));
}
/** Get Request.
@return Request from a Business Partner or Prospect */
public int getR_Request_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_Request_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="35f1c55a-c838-1ee3-bafa-6b88adb20dcb")
public static String es_PE_FIELD_UpdateNotification_Request_Description="Solicitud de un socio de negocio ó prospecto.";

@XendraTrl(Identifier="35f1c55a-c838-1ee3-bafa-6b88adb20dcb")
public static String es_PE_FIELD_UpdateNotification_Request_Help="La solicitud identifica un requerimiento único de un socio de negocio ó prospecto.";

@XendraTrl(Identifier="35f1c55a-c838-1ee3-bafa-6b88adb20dcb")
public static String es_PE_FIELD_UpdateNotification_Request_Name="Solicitud";

@XendraField(AD_Column_ID="R_Request_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f06dc870-0182-efd4-8ed6-ba86606bc5a7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="35f1c55a-c838-1ee3-bafa-6b88adb20dcb")
public static final String FIELDNAME_UpdateNotification_Request="35f1c55a-c838-1ee3-bafa-6b88adb20dcb";

@XendraTrl(Identifier="23393dcd-bde3-ead2-ba69-f8921bc1fbc1")
public static String es_PE_FIELD_UpdateNotification_Request2_Description="Solicitud de un socio de negocio ó prospecto.";

@XendraTrl(Identifier="23393dcd-bde3-ead2-ba69-f8921bc1fbc1")
public static String es_PE_FIELD_UpdateNotification_Request2_Help="La solicitud identifica un requerimiento único de un socio de negocio ó prospecto.";

@XendraTrl(Identifier="23393dcd-bde3-ead2-ba69-f8921bc1fbc1")
public static String es_PE_FIELD_UpdateNotification_Request2_Name="Solicitud";

@XendraField(AD_Column_ID="R_Request_ID",IsCentrallyMaintained=true,
AD_Tab_ID="58802f18-8b40-69b7-b480-f51aa54282f6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="23393dcd-bde3-ead2-ba69-f8921bc1fbc1")
public static final String FIELDNAME_UpdateNotification_Request2="23393dcd-bde3-ead2-ba69-f8921bc1fbc1";

@XendraTrl(Identifier="d7105c30-fc39-493f-a7dd-e87ab645d2d6")
public static String es_PE_COLUMN_R_Request_ID_Name="Solicitud";

@XendraColumn(AD_Element_ID="8f83a61c-3c9c-841b-466b-9700dd35c0de",ColumnName="R_Request_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d7105c30-fc39-493f-a7dd-e87ab645d2d6",
Synchronized="2017-08-05 16:55:57.0")
/** Column name R_Request_ID */
public static final String COLUMNNAME_R_Request_ID = "R_Request_ID";
}
