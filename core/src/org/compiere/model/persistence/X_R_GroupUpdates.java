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
/** Generated Model for R_GroupUpdates
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_R_GroupUpdates extends PO
{
/** Standard Constructor
@param ctx context
@param R_GroupUpdates_ID id
@param trxName transaction
*/
public X_R_GroupUpdates (Properties ctx, int R_GroupUpdates_ID, String trxName)
{
super (ctx, R_GroupUpdates_ID, trxName);
/** if (R_GroupUpdates_ID == 0)
{
setAD_User_ID (0);
setIsSelfService (false);	
// N
setR_Group_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_R_GroupUpdates (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=786 */
public static int Table_ID=MTable.getTable_ID("R_GroupUpdates");

@XendraTrl(Identifier="af5fd037-aad7-e3dd-75e5-caf711491769")
public static String es_PE_TAB_RequestUpdates_Description="Recipientes de la lista para recibir actualizaciones de la solicitud.";

@XendraTrl(Identifier="af5fd037-aad7-e3dd-75e5-caf711491769")
public static String es_PE_TAB_RequestUpdates_Name="Actualización de Solicitud";

@XendraTab(Name="Request Updates",Description="List Recipients for to receive Request Updates",
Help="",AD_Window_ID="48b04170-f7f3-e7b8-2750-b4787c524f8a",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="f4172f99-b732-1504-d8f7-8c874cf8d661",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="af5fd037-aad7-e3dd-75e5-caf711491769",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_RequestUpdates="af5fd037-aad7-e3dd-75e5-caf711491769";

@XendraTrl(Identifier="5930a967-85c5-f255-1923-460fc9b98177")
public static String es_PE_TABLE_R_GroupUpdates_Name="R_GroupUpdates";

@XendraTable(Name="R_GroupUpdates",Description="",Help="",TableName="R_GroupUpdates",
AccessLevel="7",AD_Window_ID="48b04170-f7f3-e7b8-2750-b4787c524f8a",AD_Val_Rule_ID="",IsKey=0,
LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.standard",
Identifier="5930a967-85c5-f255-1923-460fc9b98177",Synchronized="2017-08-16 11:43:47.0")
/** TableName=R_GroupUpdates */
public static final String Table_Name="R_GroupUpdates";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"R_GroupUpdates");

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
    Table_ID = MTable.getTable_ID("R_GroupUpdates");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_R_GroupUpdates[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="c6e08373-77c7-b8a6-00bf-48c051a39d59")
public static String es_PE_FIELD_RequestUpdates_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="c6e08373-77c7-b8a6-00bf-48c051a39d59")
public static String es_PE_FIELD_RequestUpdates_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraTrl(Identifier="c6e08373-77c7-b8a6-00bf-48c051a39d59")
public static String es_PE_FIELD_RequestUpdates_UserContact_Name="Usuario";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="af5fd037-aad7-e3dd-75e5-caf711491769",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c6e08373-77c7-b8a6-00bf-48c051a39d59")
public static final String FIELDNAME_RequestUpdates_UserContact="c6e08373-77c7-b8a6-00bf-48c051a39d59";

@XendraTrl(Identifier="53625efd-7eec-2eae-4d03-2851a69b8ba5")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="53625efd-7eec-2eae-4d03-2851a69b8ba5",
Synchronized="2017-08-05 16:55:48.0")
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
@XendraTrl(Identifier="c27d4476-f643-460c-bf4d-baf3d9f4ca34")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c27d4476-f643-460c-bf4d-baf3d9f4ca34",
Synchronized="2017-08-05 16:55:48.0")
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

@XendraTrl(Identifier="a7ed79f9-b6ab-a220-53e5-5cb151dd0319")
public static String es_PE_FIELD_RequestUpdates_Self_Service_Description="Esta es una entrada del autoservicio ó esta entrada se puede cambiar vía autoservicio";

@XendraTrl(Identifier="a7ed79f9-b6ab-a220-53e5-5cb151dd0319")
public static String es_PE_FIELD_RequestUpdates_Self_Service_Help="El autoservicio permite que los usuarios incorporen datos o que pongan al día sus datos. La bandera indica, que este expediente fue incorporado o creado vía autoservicio o que el usuario puede cambiarlo vía funcionalidad del autoservicio.";

@XendraTrl(Identifier="a7ed79f9-b6ab-a220-53e5-5cb151dd0319")
public static String es_PE_FIELD_RequestUpdates_Self_Service_Name="Auto-Servicio";

@XendraField(AD_Column_ID="IsSelfService",IsCentrallyMaintained=true,
AD_Tab_ID="af5fd037-aad7-e3dd-75e5-caf711491769",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a7ed79f9-b6ab-a220-53e5-5cb151dd0319")
public static final String FIELDNAME_RequestUpdates_Self_Service="a7ed79f9-b6ab-a220-53e5-5cb151dd0319";

@XendraTrl(Identifier="e8db477e-26b3-585b-7d8f-7106d1194d76")
public static String es_PE_COLUMN_IsSelfService_Name="Auto-Servicio";

@XendraColumn(AD_Element_ID="8f201030-f9ab-66d2-f4de-7209f41f2af8",ColumnName="IsSelfService",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e8db477e-26b3-585b-7d8f-7106d1194d76",
Synchronized="2017-08-05 16:55:48.0")
/** Column name IsSelfService */
public static final String COLUMNNAME_IsSelfService = "IsSelfService";
/** Set Group.
@param R_Group_ID Request Group */
public void setR_Group_ID (int R_Group_ID)
{
if (R_Group_ID < 1) throw new IllegalArgumentException ("R_Group_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_R_Group_ID, Integer.valueOf(R_Group_ID));
}
/** Get Group.
@return Request Group */
public int getR_Group_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_Group_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6b0350d9-bb83-d39d-270a-fefcc76b2d6b")
public static String es_PE_FIELD_RequestUpdates_Group_Description="Grupo de solicitud";

@XendraTrl(Identifier="6b0350d9-bb83-d39d-270a-fefcc76b2d6b")
public static String es_PE_FIELD_RequestUpdates_Group_Help="Grupo de solicitud (ej. versión de números, responsabilidad, ...)";

@XendraTrl(Identifier="6b0350d9-bb83-d39d-270a-fefcc76b2d6b")
public static String es_PE_FIELD_RequestUpdates_Group_Name="Grupo";

@XendraField(AD_Column_ID="R_Group_ID",IsCentrallyMaintained=true,
AD_Tab_ID="af5fd037-aad7-e3dd-75e5-caf711491769",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6b0350d9-bb83-d39d-270a-fefcc76b2d6b")
public static final String FIELDNAME_RequestUpdates_Group="6b0350d9-bb83-d39d-270a-fefcc76b2d6b";

@XendraTrl(Identifier="f4172f99-b732-1504-d8f7-8c874cf8d661")
public static String es_PE_COLUMN_R_Group_ID_Name="Grupo";

@XendraColumn(AD_Element_ID="66f0c2a3-096f-ad52-1b44-f39cd9c5c857",ColumnName="R_Group_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f4172f99-b732-1504-d8f7-8c874cf8d661",
Synchronized="2017-08-05 16:55:48.0")
/** Column name R_Group_ID */
public static final String COLUMNNAME_R_Group_ID = "R_Group_ID";
}
