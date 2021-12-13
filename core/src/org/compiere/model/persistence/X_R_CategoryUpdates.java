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
/** Generated Model for R_CategoryUpdates
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_R_CategoryUpdates extends PO
{
/** Standard Constructor
@param ctx context
@param R_CategoryUpdates_ID id
@param trxName transaction
*/
public X_R_CategoryUpdates (Properties ctx, int R_CategoryUpdates_ID, String trxName)
{
super (ctx, R_CategoryUpdates_ID, trxName);
/** if (R_CategoryUpdates_ID == 0)
{
setAD_User_ID (0);
setIsSelfService (false);	
// N
setR_Category_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_R_CategoryUpdates (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=785 */
public static int Table_ID=MTable.getTable_ID("R_CategoryUpdates");

@XendraTrl(Identifier="7c053895-4b86-4b32-6187-c21498b57bed")
public static String es_PE_TAB_UpdateNotification_Description="Recipientes de la lista para recibir actualizaciones de la solicitud";

@XendraTrl(Identifier="7c053895-4b86-4b32-6187-c21498b57bed")
public static String es_PE_TAB_UpdateNotification_Name="Aviso de Actualización";

@XendraTab(Name="Update Notification",Description="List Recipients for to receive Request Updates",
Help="",AD_Window_ID="e9016b80-21a4-1781-85f4-03148c8c1976",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="2e117ed9-de5c-3cff-a145-fdb0ce8c7fc1",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="7c053895-4b86-4b32-6187-c21498b57bed",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_UpdateNotification="7c053895-4b86-4b32-6187-c21498b57bed";

@XendraTrl(Identifier="d2028c42-6003-42ef-77ed-e679baf4f3d3")
public static String es_PE_TABLE_R_CategoryUpdates_Name="R_CategoryUpdates";

@XendraTable(Name="R_CategoryUpdates",AD_Package_ID="1b3656e5-71c7-1296-994e-9b2c4549c7fd",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="R_CategoryUpdates",AccessLevel="7",AD_Window_ID="e9016b80-21a4-1781-85f4-03148c8c1976",
AD_Val_Rule_ID="",IsKey=0,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.standard",
Identifier="d2028c42-6003-42ef-77ed-e679baf4f3d3",Synchronized="2020-03-03 21:39:29.0")
/** TableName=R_CategoryUpdates */
public static final String Table_Name="R_CategoryUpdates";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"R_CategoryUpdates");

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
    Table_ID = MTable.getTable_ID("R_CategoryUpdates");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_R_CategoryUpdates[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="588fe776-4722-46de-f768-73c9e4a6f512")
public static String es_PE_FIELD_UpdateNotification_UserContact_Name="Usuario";

@XendraTrl(Identifier="588fe776-4722-46de-f768-73c9e4a6f512")
public static String es_PE_FIELD_UpdateNotification_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="588fe776-4722-46de-f768-73c9e4a6f512")
public static String es_PE_FIELD_UpdateNotification_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7c053895-4b86-4b32-6187-c21498b57bed",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="588fe776-4722-46de-f768-73c9e4a6f512")
public static final String FIELDNAME_UpdateNotification_UserContact="588fe776-4722-46de-f768-73c9e4a6f512";

@XendraTrl(Identifier="4143011c-d99e-50f9-af42-3b01e2102406")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4143011c-d99e-50f9-af42-3b01e2102406",
Synchronized="2019-08-30 22:23:44.0")
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
@XendraTrl(Identifier="6330c459-eea9-4d7b-bc78-6124e90ea5d3")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6330c459-eea9-4d7b-bc78-6124e90ea5d3",
Synchronized="2019-08-30 22:23:44.0")
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

@XendraTrl(Identifier="a2794f21-903b-6183-9ba7-ec1bb038d2e2")
public static String es_PE_FIELD_UpdateNotification_Self_Service_Name="Auto-Servicio";

@XendraTrl(Identifier="a2794f21-903b-6183-9ba7-ec1bb038d2e2")
public static String es_PE_FIELD_UpdateNotification_Self_Service_Description="Esta es una entrada del autoservicio ó esta entrada se puede cambiar vía autoservicio";

@XendraTrl(Identifier="a2794f21-903b-6183-9ba7-ec1bb038d2e2")
public static String es_PE_FIELD_UpdateNotification_Self_Service_Help="El autoservicio permite que los usuarios incorporen datos o que pongan al día sus datos. La bandera indica, que este expediente fue incorporado o creado vía autoservicio o que el usuario puede cambiarlo vía funcionalidad del autoservicio.";

@XendraField(AD_Column_ID="IsSelfService",IsCentrallyMaintained=true,
AD_Tab_ID="7c053895-4b86-4b32-6187-c21498b57bed",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a2794f21-903b-6183-9ba7-ec1bb038d2e2")
public static final String FIELDNAME_UpdateNotification_Self_Service="a2794f21-903b-6183-9ba7-ec1bb038d2e2";

@XendraTrl(Identifier="251e012e-b324-b633-57ae-b0955ec7a4b5")
public static String es_PE_COLUMN_IsSelfService_Name="Auto-Servicio";

@XendraColumn(AD_Element_ID="8f201030-f9ab-66d2-f4de-7209f41f2af8",ColumnName="IsSelfService",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="251e012e-b324-b633-57ae-b0955ec7a4b5",
Synchronized="2019-08-30 22:23:44.0")
/** Column name IsSelfService */
public static final String COLUMNNAME_IsSelfService = "IsSelfService";
/** Set Category.
@param R_Category_ID Request Category */
public void setR_Category_ID (int R_Category_ID)
{
if (R_Category_ID < 1) throw new IllegalArgumentException ("R_Category_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_R_Category_ID, Integer.valueOf(R_Category_ID));
}
/** Get Category.
@return Request Category */
public int getR_Category_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_Category_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="74c5efd1-25f5-139b-b879-930cd2addcb8")
public static String es_PE_FIELD_UpdateNotification_Category_Name="Categoría";

@XendraTrl(Identifier="74c5efd1-25f5-139b-b879-930cd2addcb8")
public static String es_PE_FIELD_UpdateNotification_Category_Description="Categoría de Solicitud";

@XendraTrl(Identifier="74c5efd1-25f5-139b-b879-930cd2addcb8")
public static String es_PE_FIELD_UpdateNotification_Category_Help="Categoria ó asunto de la solicitud";

@XendraField(AD_Column_ID="R_Category_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7c053895-4b86-4b32-6187-c21498b57bed",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="74c5efd1-25f5-139b-b879-930cd2addcb8")
public static final String FIELDNAME_UpdateNotification_Category="74c5efd1-25f5-139b-b879-930cd2addcb8";

@XendraTrl(Identifier="2e117ed9-de5c-3cff-a145-fdb0ce8c7fc1")
public static String es_PE_COLUMN_R_Category_ID_Name="Categoría";

@XendraColumn(AD_Element_ID="6c67e84d-9c0c-0f6f-1738-d8c86cd72ee7",ColumnName="R_Category_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2e117ed9-de5c-3cff-a145-fdb0ce8c7fc1",
Synchronized="2019-08-30 22:23:44.0")
/** Column name R_Category_ID */
public static final String COLUMNNAME_R_Category_ID = "R_Category_ID";
}
