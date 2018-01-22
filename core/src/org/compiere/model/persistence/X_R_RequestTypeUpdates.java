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
/** Generated Model for R_RequestTypeUpdates
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_R_RequestTypeUpdates extends PO
{
/** Standard Constructor
@param ctx context
@param R_RequestTypeUpdates_ID id
@param trxName transaction
*/
public X_R_RequestTypeUpdates (Properties ctx, int R_RequestTypeUpdates_ID, String trxName)
{
super (ctx, R_RequestTypeUpdates_ID, trxName);
/** if (R_RequestTypeUpdates_ID == 0)
{
setAD_User_ID (0);
setIsSelfService (false);	
// N
setR_RequestType_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_R_RequestTypeUpdates (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=784 */
public static int Table_ID=MTable.getTable_ID("R_RequestTypeUpdates");

@XendraTrl(Identifier="4b6853e3-ba54-a867-50e5-cc02e25c23dd")
public static String es_PE_TAB_UpdateNotification_Description="Recipientes de la lista para recibir actualizaciones de la solicitud";

@XendraTrl(Identifier="4b6853e3-ba54-a867-50e5-cc02e25c23dd")
public static String es_PE_TAB_UpdateNotification_Name="Aviso de Actualización ";

@XendraTab(Name="Update Notification",Description="List Recipients for to receive Request Updates",
Help="",AD_Window_ID="4082c323-4544-c91e-56c4-ed205b54b762",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="08c68657-ac66-2e18-73a0-4a81b9f35bf9",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="4b6853e3-ba54-a867-50e5-cc02e25c23dd",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_UpdateNotification="4b6853e3-ba54-a867-50e5-cc02e25c23dd";

@XendraTrl(Identifier="798b1def-d3ad-b837-7f62-c0c48eae736b")
public static String es_PE_TABLE_R_RequestTypeUpdates_Name="Request Type Updates";

@XendraTable(Name="Request Type Updates",Description="",Help="",TableName="R_RequestTypeUpdates",
AccessLevel="7",AD_Window_ID="4082c323-4544-c91e-56c4-ed205b54b762",AD_Val_Rule_ID="",IsKey=0,
LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.standard",
Identifier="798b1def-d3ad-b837-7f62-c0c48eae736b",Synchronized="2017-08-16 11:43:52.0")
/** TableName=R_RequestTypeUpdates */
public static final String Table_Name="R_RequestTypeUpdates";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"R_RequestTypeUpdates");

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
    Table_ID = MTable.getTable_ID("R_RequestTypeUpdates");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_R_RequestTypeUpdates[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="78505067-06aa-95f0-bdfb-550338fb3cdb")
public static String es_PE_FIELD_UpdateNotification_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="78505067-06aa-95f0-bdfb-550338fb3cdb")
public static String es_PE_FIELD_UpdateNotification_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraTrl(Identifier="78505067-06aa-95f0-bdfb-550338fb3cdb")
public static String es_PE_FIELD_UpdateNotification_UserContact_Name="Usuario";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="4b6853e3-ba54-a867-50e5-cc02e25c23dd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="78505067-06aa-95f0-bdfb-550338fb3cdb")
public static final String FIELDNAME_UpdateNotification_UserContact="78505067-06aa-95f0-bdfb-550338fb3cdb";

@XendraTrl(Identifier="dff949d7-4cba-f0ab-0605-d19f2e4732d1")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dff949d7-4cba-f0ab-0605-d19f2e4732d1",
Synchronized="2017-08-05 16:55:56.0")
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
@XendraTrl(Identifier="d80eec69-82a9-473c-9a86-b2e7ac163436")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d80eec69-82a9-473c-9a86-b2e7ac163436",
Synchronized="2017-08-05 16:55:56.0")
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

@XendraTrl(Identifier="a6593df3-9e9f-88c3-dbb1-9dd2bcc1c5d7")
public static String es_PE_FIELD_UpdateNotification_Self_Service_Description="Esta es una entrada del autoservicio ó esta entrada se puede cambiar vía autoservicio";

@XendraTrl(Identifier="a6593df3-9e9f-88c3-dbb1-9dd2bcc1c5d7")
public static String es_PE_FIELD_UpdateNotification_Self_Service_Help="El autoservicio permite que los usuarios incorporen datos o que pongan al día sus datos. La bandera indica, que este expediente fue incorporado o creado vía autoservicio o que el usuario puede cambiarlo vía funcionalidad del autoservicio.";

@XendraTrl(Identifier="a6593df3-9e9f-88c3-dbb1-9dd2bcc1c5d7")
public static String es_PE_FIELD_UpdateNotification_Self_Service_Name="Auto-Servicio";

@XendraField(AD_Column_ID="IsSelfService",IsCentrallyMaintained=true,
AD_Tab_ID="4b6853e3-ba54-a867-50e5-cc02e25c23dd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a6593df3-9e9f-88c3-dbb1-9dd2bcc1c5d7")
public static final String FIELDNAME_UpdateNotification_Self_Service="a6593df3-9e9f-88c3-dbb1-9dd2bcc1c5d7";

@XendraTrl(Identifier="1fa9ced5-b89f-2c86-e0cd-9cfebf600780")
public static String es_PE_COLUMN_IsSelfService_Name="Auto-Servicio";

@XendraColumn(AD_Element_ID="8f201030-f9ab-66d2-f4de-7209f41f2af8",ColumnName="IsSelfService",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1fa9ced5-b89f-2c86-e0cd-9cfebf600780",
Synchronized="2017-08-05 16:55:56.0")
/** Column name IsSelfService */
public static final String COLUMNNAME_IsSelfService = "IsSelfService";
/** Set Request Type.
@param R_RequestType_ID Type of request (e.g. Inquiry, Complaint, ..) */
public void setR_RequestType_ID (int R_RequestType_ID)
{
if (R_RequestType_ID < 1) throw new IllegalArgumentException ("R_RequestType_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_R_RequestType_ID, Integer.valueOf(R_RequestType_ID));
}
/** Get Request Type.
@return Type of request (e.g. Inquiry, Complaint, ..) */
public int getR_RequestType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_RequestType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="bd37134c-3b7b-5b12-5d32-3acd9f645dd7")
public static String es_PE_FIELD_UpdateNotification_RequestType_Description="Tipo de Solicitud (pregunta; queja).";

@XendraTrl(Identifier="bd37134c-3b7b-5b12-5d32-3acd9f645dd7")
public static String es_PE_FIELD_UpdateNotification_RequestType_Help="Tipos de solicitud son usados para procesar y categorizar solicitudes. Ejemplos: consultas de cuentas; garantías; etc.";

@XendraTrl(Identifier="bd37134c-3b7b-5b12-5d32-3acd9f645dd7")
public static String es_PE_FIELD_UpdateNotification_RequestType_Name="Tipo de Solicitud";

@XendraField(AD_Column_ID="R_RequestType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="4b6853e3-ba54-a867-50e5-cc02e25c23dd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bd37134c-3b7b-5b12-5d32-3acd9f645dd7")
public static final String FIELDNAME_UpdateNotification_RequestType="bd37134c-3b7b-5b12-5d32-3acd9f645dd7";

@XendraTrl(Identifier="08c68657-ac66-2e18-73a0-4a81b9f35bf9")
public static String es_PE_COLUMN_R_RequestType_ID_Name="Tipo de Solicitud";

@XendraColumn(AD_Element_ID="5d38239d-4d14-9ae8-35a8-4f92ae90ab59",ColumnName="R_RequestType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="08c68657-ac66-2e18-73a0-4a81b9f35bf9",
Synchronized="2017-08-05 16:55:56.0")
/** Column name R_RequestType_ID */
public static final String COLUMNNAME_R_RequestType_ID = "R_RequestType_ID";
}
