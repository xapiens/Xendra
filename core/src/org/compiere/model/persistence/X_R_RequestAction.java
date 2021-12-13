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
/** Generated Model for R_RequestAction
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_R_RequestAction extends PO
{
/** Standard Constructor
@param ctx context
@param R_RequestAction_ID id
@param trxName transaction
*/
public X_R_RequestAction (Properties ctx, int R_RequestAction_ID, String trxName)
{
super (ctx, R_RequestAction_ID, trxName);
/** if (R_RequestAction_ID == 0)
{
setR_RequestAction_ID (0);
setR_Request_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_R_RequestAction (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=418 */
public static int Table_ID=MTable.getTable_ID("R_RequestAction");

@XendraTrl(Identifier="fb40063e-6a67-2827-7cb1-03ed779b1ace")
public static String es_PE_TAB_History_Description="Historia de Acciones";

@XendraTrl(Identifier="fb40063e-6a67-2827-7cb1-03ed779b1ace")
public static String es_PE_TAB_History_Help="La pestaña Historia de Acciones despliega todas las acciones que han sido tomadas para una solicitud.";

@XendraTrl(Identifier="fb40063e-6a67-2827-7cb1-03ed779b1ace")
public static String es_PE_TAB_History_Name="Historia de Acciones";
@XendraTab(Name="History",
Description="Request History (Old values)",
Help="The History Tab displays changes of a Request. The data displayed are the OLD (changed from) values. The new data is in the request.",
AD_Window_ID="0090e49f-fcb0-617d-03f1-c1d90ff77da9",SeqNo=30,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=false,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="fb40063e-6a67-2827-7cb1-03ed779b1ace",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_History="fb40063e-6a67-2827-7cb1-03ed779b1ace";

@XendraTrl(Identifier="8bc16204-5386-763c-9e9b-78d3c7280f5d")
public static String es_PE_TAB_History2_Description="Historia de Acciones";

@XendraTrl(Identifier="8bc16204-5386-763c-9e9b-78d3c7280f5d")
public static String es_PE_TAB_History2_Help="La pestaña Historia de Acciones despliega todas las acciones que han sido tomadas para una solicitud.";

@XendraTrl(Identifier="8bc16204-5386-763c-9e9b-78d3c7280f5d")
public static String es_PE_TAB_History2_Name="Historia de Acciones";
@XendraTab(Name="History",
Description="Request History (Old Values)",
Help="The History Tab displays changes of a Request. The data displayed are the OLD (changed from) values. The new data is in the request.",
AD_Window_ID="0d176ab5-fb88-6941-47f1-b5effb1207a9",SeqNo=30,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=false,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="8bc16204-5386-763c-9e9b-78d3c7280f5d",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_History2="8bc16204-5386-763c-9e9b-78d3c7280f5d";

@XendraTrl(Identifier="d690f3c9-6b83-af09-78f1-0abf33fd614f")
public static String es_PE_TABLE_R_RequestAction_Name="Acción Solicitada";

@XendraTable(Name="Request History",AD_Package_ID="1b3656e5-71c7-1296-994e-9b2c4549c7fd",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="R_RequestAction",AccessLevel="7",AD_Window_ID="0090e49f-fcb0-617d-03f1-c1d90ff77da9",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.standard",
Identifier="d690f3c9-6b83-af09-78f1-0abf33fd614f",Synchronized="2020-03-03 21:39:38.0")
/** TableName=R_RequestAction */
public static final String Table_Name="R_RequestAction";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"R_RequestAction");

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
    Table_ID = MTable.getTable_ID("R_RequestAction");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_R_RequestAction[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Asset.
@param A_Asset_ID Asset used internally or by customers */
public void setA_Asset_ID (int A_Asset_ID)
{
if (A_Asset_ID <= 0) set_ValueNoCheck (COLUMNNAME_A_Asset_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_A_Asset_ID, Integer.valueOf(A_Asset_ID));
}
/** Get Asset.
@return Asset used internally or by customers */
public int getA_Asset_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_A_Asset_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="fc491ee8-b385-bd85-71f6-19b41ae819af")
public static String es_PE_FIELD_History_Asset_Name="Activo";

@XendraTrl(Identifier="fc491ee8-b385-bd85-71f6-19b41ae819af")
public static String es_PE_FIELD_History_Asset_Description="Activo usado por la compañía o sus clientes";

@XendraTrl(Identifier="fc491ee8-b385-bd85-71f6-19b41ae819af")
public static String es_PE_FIELD_History_Asset_Help="Indica si es usado por la compañia o sus clientes";

@XendraField(AD_Column_ID="A_Asset_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fb40063e-6a67-2827-7cb1-03ed779b1ace",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=340,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fc491ee8-b385-bd85-71f6-19b41ae819af")
public static final String FIELDNAME_History_Asset="fc491ee8-b385-bd85-71f6-19b41ae819af";

@XendraTrl(Identifier="9866e583-46be-116c-92e2-ae1b2fb423b0")
public static String es_PE_FIELD_History_Asset2_Name="Activo";

@XendraTrl(Identifier="9866e583-46be-116c-92e2-ae1b2fb423b0")
public static String es_PE_FIELD_History_Asset2_Description="Activo usado por la compañía o sus clientes";

@XendraTrl(Identifier="9866e583-46be-116c-92e2-ae1b2fb423b0")
public static String es_PE_FIELD_History_Asset2_Help="Indica si es usado por la compañia o sus clientes";

@XendraField(AD_Column_ID="A_Asset_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8bc16204-5386-763c-9e9b-78d3c7280f5d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=250,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9866e583-46be-116c-92e2-ae1b2fb423b0")
public static final String FIELDNAME_History_Asset2="9866e583-46be-116c-92e2-ae1b2fb423b0";

@XendraTrl(Identifier="87771dd2-b0eb-0f37-d80c-3c2e2708bdef")
public static String es_PE_COLUMN_A_Asset_ID_Name="Activo";

@XendraColumn(AD_Element_ID="3cd84c49-e25b-9ecc-5637-ed9a07d76bee",ColumnName="A_Asset_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="87771dd2-b0eb-0f37-d80c-3c2e2708bdef",
Synchronized="2019-08-30 22:23:49.0")
/** Column name A_Asset_ID */
public static final String COLUMNNAME_A_Asset_ID = "A_Asset_ID";
/** Set Role.
@param AD_Role_ID Responsibility Role */
public void setAD_Role_ID (int AD_Role_ID)
{
if (AD_Role_ID <= 0) set_ValueNoCheck (COLUMNNAME_AD_Role_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_AD_Role_ID, Integer.valueOf(AD_Role_ID));
}
/** Get Role.
@return Responsibility Role */
public int getAD_Role_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Role_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="49c6ed16-6a4e-e051-4c32-85c194fb8cdf")
public static String es_PE_FIELD_History_Role_Name="Rol";

@XendraTrl(Identifier="49c6ed16-6a4e-e051-4c32-85c194fb8cdf")
public static String es_PE_FIELD_History_Role_Description="Rol de responsabilidad";

@XendraTrl(Identifier="49c6ed16-6a4e-e051-4c32-85c194fb8cdf")
public static String es_PE_FIELD_History_Role_Help="El Rol determina la seguridad y acceso del usuario que posee este Rol";

@XendraField(AD_Column_ID="AD_Role_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fb40063e-6a67-2827-7cb1-03ed779b1ace",AD_FieldGroup_ID="Action",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="49c6ed16-6a4e-e051-4c32-85c194fb8cdf")
public static final String FIELDNAME_History_Role="49c6ed16-6a4e-e051-4c32-85c194fb8cdf";

@XendraTrl(Identifier="4b21fbce-2b09-0b1d-d460-c9688c2ceff7")
public static String es_PE_FIELD_History_Role2_Name="Rol";

@XendraTrl(Identifier="4b21fbce-2b09-0b1d-d460-c9688c2ceff7")
public static String es_PE_FIELD_History_Role2_Description="Rol de responsabilidad";

@XendraTrl(Identifier="4b21fbce-2b09-0b1d-d460-c9688c2ceff7")
public static String es_PE_FIELD_History_Role2_Help="El Rol determina la seguridad y acceso del usuario que posee este Rol";

@XendraField(AD_Column_ID="AD_Role_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8bc16204-5386-763c-9e9b-78d3c7280f5d",AD_FieldGroup_ID="Action",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4b21fbce-2b09-0b1d-d460-c9688c2ceff7")
public static final String FIELDNAME_History_Role2="4b21fbce-2b09-0b1d-d460-c9688c2ceff7";

@XendraTrl(Identifier="a6d106b9-032c-7ca0-9af8-1e551ba86212")
public static String es_PE_COLUMN_AD_Role_ID_Name="Rol";

@XendraColumn(AD_Element_ID="08ffb725-ea75-e55f-f4c5-67ac26f40e2b",ColumnName="AD_Role_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a6d106b9-032c-7ca0-9af8-1e551ba86212",
Synchronized="2019-08-30 22:23:49.0")
/** Column name AD_Role_ID */
public static final String COLUMNNAME_AD_Role_ID = "AD_Role_ID";
/** Set User/Contact.
@param AD_User_ID User within the system - Internal or Business Partner Contact */
public void setAD_User_ID (int AD_User_ID)
{
if (AD_User_ID <= 0) set_ValueNoCheck (COLUMNNAME_AD_User_ID, null);
 else 
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

@XendraTrl(Identifier="2db99e69-58de-e405-cd05-90d0968927e0")
public static String es_PE_FIELD_History_UserContact_Name="Usuario";

@XendraTrl(Identifier="2db99e69-58de-e405-cd05-90d0968927e0")
public static String es_PE_FIELD_History_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="2db99e69-58de-e405-cd05-90d0968927e0")
public static String es_PE_FIELD_History_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fb40063e-6a67-2827-7cb1-03ed779b1ace",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=320,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2db99e69-58de-e405-cd05-90d0968927e0")
public static final String FIELDNAME_History_UserContact="2db99e69-58de-e405-cd05-90d0968927e0";

@XendraTrl(Identifier="c328b5a8-73e8-b158-b1fb-71e348a1c411")
public static String es_PE_FIELD_History_UserContact2_Name="Usuario";

@XendraTrl(Identifier="c328b5a8-73e8-b158-b1fb-71e348a1c411")
public static String es_PE_FIELD_History_UserContact2_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="c328b5a8-73e8-b158-b1fb-71e348a1c411")
public static String es_PE_FIELD_History_UserContact2_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8bc16204-5386-763c-9e9b-78d3c7280f5d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=230,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c328b5a8-73e8-b158-b1fb-71e348a1c411")
public static final String FIELDNAME_History_UserContact2="c328b5a8-73e8-b158-b1fb-71e348a1c411";

@XendraTrl(Identifier="a538f272-53e2-7bf7-06e3-22eed1f0d82d")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="f4ac36a1-4200-1386-677e-14ac90afb4fe",
FieldLength=22,DefaultValue="-1",IsKey=false,IsInternal=false,IsParent=true,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="a538f272-53e2-7bf7-06e3-22eed1f0d82d",Synchronized="2019-08-30 22:23:49.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
/** Set Activity.
@param C_Activity_ID Business Activity */
public void setC_Activity_ID (int C_Activity_ID)
{
if (C_Activity_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_Activity_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_Activity_ID, Integer.valueOf(C_Activity_ID));
}
/** Get Activity.
@return Business Activity */
public int getC_Activity_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Activity_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="86df8fa3-d358-7cda-99ad-b7a3c813c8dd")
public static String es_PE_FIELD_History_Activity_Name="Tipo de Gasto";

@XendraTrl(Identifier="86df8fa3-d358-7cda-99ad-b7a3c813c8dd")
public static String es_PE_FIELD_History_Activity_Description="Actividad de Negocio";

@XendraTrl(Identifier="86df8fa3-d358-7cda-99ad-b7a3c813c8dd")
public static String es_PE_FIELD_History_Activity_Help="Las actividades indican tareas que son ejecutadas en el curso de un negocio; las actividades son usadas para el costeo por actividad (ABC)";

@XendraField(AD_Column_ID="C_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fb40063e-6a67-2827-7cb1-03ed779b1ace",AD_FieldGroup_ID="Action",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="86df8fa3-d358-7cda-99ad-b7a3c813c8dd")
public static final String FIELDNAME_History_Activity="86df8fa3-d358-7cda-99ad-b7a3c813c8dd";

@XendraTrl(Identifier="8ef860fd-5f3a-47a4-c22f-d24fbdc944e3")
public static String es_PE_FIELD_History_Activity2_Name="Tipo de Gasto";

@XendraTrl(Identifier="8ef860fd-5f3a-47a4-c22f-d24fbdc944e3")
public static String es_PE_FIELD_History_Activity2_Description="Actividad de Negocio";

@XendraTrl(Identifier="8ef860fd-5f3a-47a4-c22f-d24fbdc944e3")
public static String es_PE_FIELD_History_Activity2_Help="Las actividades indican tareas que son ejecutadas en el curso de un negocio; las actividades son usadas para el costeo por actividad (ABC)";

@XendraField(AD_Column_ID="C_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8bc16204-5386-763c-9e9b-78d3c7280f5d",AD_FieldGroup_ID="Action",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8ef860fd-5f3a-47a4-c22f-d24fbdc944e3")
public static final String FIELDNAME_History_Activity2="8ef860fd-5f3a-47a4-c22f-d24fbdc944e3";

@XendraTrl(Identifier="8313fbfd-eb72-3167-5788-9208e39d59d4")
public static String es_PE_COLUMN_C_Activity_ID_Name="Tipo de Gasto";

@XendraColumn(AD_Element_ID="bfeadbb3-d866-26e3-8eee-3e2fdf0ff753",ColumnName="C_Activity_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8313fbfd-eb72-3167-5788-9208e39d59d4",
Synchronized="2019-08-30 22:23:49.0")
/** Column name C_Activity_ID */
public static final String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
/** Set Business Partner .
@param C_BPartner_ID Identifies a Business Partner */
public void setC_BPartner_ID (int C_BPartner_ID)
{
if (C_BPartner_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_BPartner_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
}
/** Get Business Partner .
@return Identifies a Business Partner */
public int getC_BPartner_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f55aa215-09ac-deb6-fe83-fb9971f13906")
public static String es_PE_FIELD_History_BusinessPartner_Name="Socio de Negocio";

@XendraTrl(Identifier="f55aa215-09ac-deb6-fe83-fb9971f13906")
public static String es_PE_FIELD_History_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="f55aa215-09ac-deb6-fe83-fb9971f13906")
public static String es_PE_FIELD_History_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fb40063e-6a67-2827-7cb1-03ed779b1ace",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=310,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f55aa215-09ac-deb6-fe83-fb9971f13906")
public static final String FIELDNAME_History_BusinessPartner="f55aa215-09ac-deb6-fe83-fb9971f13906";

@XendraTrl(Identifier="284396c2-c53e-978e-1503-759f7cb4715f")
public static String es_PE_FIELD_History_BusinessPartner2_Name="Socio de Negocio";

@XendraTrl(Identifier="284396c2-c53e-978e-1503-759f7cb4715f")
public static String es_PE_FIELD_History_BusinessPartner2_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="284396c2-c53e-978e-1503-759f7cb4715f")
public static String es_PE_FIELD_History_BusinessPartner2_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8bc16204-5386-763c-9e9b-78d3c7280f5d",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="284396c2-c53e-978e-1503-759f7cb4715f")
public static final String FIELDNAME_History_BusinessPartner2="284396c2-c53e-978e-1503-759f7cb4715f";

@XendraTrl(Identifier="691ee9d5-231c-ae4d-1a03-8955c4fba166")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="691ee9d5-231c-ae4d-1a03-8955c4fba166",
Synchronized="2019-08-30 22:23:49.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set Invoice.
@param C_Invoice_ID Invoice Identifier */
public void setC_Invoice_ID (int C_Invoice_ID)
{
if (C_Invoice_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_Invoice_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_Invoice_ID, Integer.valueOf(C_Invoice_ID));
}
/** Get Invoice.
@return Invoice Identifier */
public int getC_Invoice_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Invoice_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8bc945ac-e646-bc91-09d6-24e17f9b7672")
public static String es_PE_FIELD_History_Invoice_Name="Factura";

@XendraTrl(Identifier="8bc945ac-e646-bc91-09d6-24e17f9b7672")
public static String es_PE_FIELD_History_Invoice_Description="Identificador de la factura";

@XendraTrl(Identifier="8bc945ac-e646-bc91-09d6-24e17f9b7672")
public static String es_PE_FIELD_History_Invoice_Help="La ID de Factura identifica únicamente un documento de Factura.";

@XendraField(AD_Column_ID="C_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fb40063e-6a67-2827-7cb1-03ed779b1ace",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=360,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8bc945ac-e646-bc91-09d6-24e17f9b7672")
public static final String FIELDNAME_History_Invoice="8bc945ac-e646-bc91-09d6-24e17f9b7672";

@XendraTrl(Identifier="cb55b6e3-8f2a-7f51-298d-52a6100cf2f9")
public static String es_PE_FIELD_History_Invoice2_Name="Factura";

@XendraTrl(Identifier="cb55b6e3-8f2a-7f51-298d-52a6100cf2f9")
public static String es_PE_FIELD_History_Invoice2_Description="Identificador de la factura";

@XendraTrl(Identifier="cb55b6e3-8f2a-7f51-298d-52a6100cf2f9")
public static String es_PE_FIELD_History_Invoice2_Help="La ID de Factura identifica únicamente un documento de Factura.";

@XendraField(AD_Column_ID="C_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8bc16204-5386-763c-9e9b-78d3c7280f5d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=270,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cb55b6e3-8f2a-7f51-298d-52a6100cf2f9")
public static final String FIELDNAME_History_Invoice2="cb55b6e3-8f2a-7f51-298d-52a6100cf2f9";

@XendraTrl(Identifier="e9304a47-2f23-c5d6-bb5b-15717dd57382")
public static String es_PE_COLUMN_C_Invoice_ID_Name="Factura";

@XendraColumn(AD_Element_ID="e526ea57-1bdf-9871-fd57-0df3c1f9dd42",ColumnName="C_Invoice_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e9304a47-2f23-c5d6-bb5b-15717dd57382",
Synchronized="2019-08-30 22:23:49.0")
/** Column name C_Invoice_ID */
public static final String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
/** Set Confidentiality.
@param ConfidentialType Type of Confidentiality */
public void setConfidentialType (String ConfidentialType)
{
if (ConfidentialType != null && ConfidentialType.length() > 1)
{
log.warning("Length > 1 - truncated");
ConfidentialType = ConfidentialType.substring(0,0);
}
set_ValueNoCheck (COLUMNNAME_ConfidentialType, ConfidentialType);
}
/** Get Confidentiality.
@return Type of Confidentiality */
public String getConfidentialType() 
{
return (String)get_Value(COLUMNNAME_ConfidentialType);
}

@XendraTrl(Identifier="df051407-3642-412b-ec46-9375c8019b7d")
public static String es_PE_FIELD_History_Confidentiality_Name="Confidencialidad";

@XendraTrl(Identifier="df051407-3642-412b-ec46-9375c8019b7d")
public static String es_PE_FIELD_History_Confidentiality_Description="Tipo de Confidencialidad";

@XendraField(AD_Column_ID="ConfidentialType",IsCentrallyMaintained=true,
AD_Tab_ID="fb40063e-6a67-2827-7cb1-03ed779b1ace",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="df051407-3642-412b-ec46-9375c8019b7d")
public static final String FIELDNAME_History_Confidentiality="df051407-3642-412b-ec46-9375c8019b7d";

@XendraTrl(Identifier="d8ab9e47-1ed8-eb58-e5d2-d56bd1061cd7")
public static String es_PE_FIELD_History_Confidentiality2_Name="Confidencialidad";

@XendraTrl(Identifier="d8ab9e47-1ed8-eb58-e5d2-d56bd1061cd7")
public static String es_PE_FIELD_History_Confidentiality2_Description="Tipo de Confidencialidad";

@XendraField(AD_Column_ID="ConfidentialType",IsCentrallyMaintained=true,
AD_Tab_ID="8bc16204-5386-763c-9e9b-78d3c7280f5d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d8ab9e47-1ed8-eb58-e5d2-d56bd1061cd7")
public static final String FIELDNAME_History_Confidentiality2="d8ab9e47-1ed8-eb58-e5d2-d56bd1061cd7";

@XendraTrl(Identifier="66712ac4-2e4a-9bd9-b30e-dcdd16021a9f")
public static String es_PE_COLUMN_ConfidentialType_Name="Confidencialidad";

@XendraColumn(AD_Element_ID="24d269bf-542a-eb9e-b244-feea486dfc6b",ColumnName="ConfidentialType",
AD_Reference_ID=17,AD_Reference_Value_ID="af038e49-9eea-4e1c-da39-e6d987a12111",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="66712ac4-2e4a-9bd9-b30e-dcdd16021a9f",Synchronized="2019-08-30 22:23:49.0")
/** Column name ConfidentialType */
public static final String COLUMNNAME_ConfidentialType = "ConfidentialType";
/** Set Order.
@param C_Order_ID Order */
public void setC_Order_ID (int C_Order_ID)
{
if (C_Order_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_Order_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_Order_ID, Integer.valueOf(C_Order_ID));
}
/** Get Order.
@return Order */
public int getC_Order_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Order_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="52b2d0a4-1ad8-fddb-3f49-ba3f4727f4d2")
public static String es_PE_FIELD_History_Order_Name="Orden de Venta";

@XendraTrl(Identifier="52b2d0a4-1ad8-fddb-3f49-ba3f4727f4d2")
public static String es_PE_FIELD_History_Order_Description="Orden de Venta";

@XendraTrl(Identifier="52b2d0a4-1ad8-fddb-3f49-ba3f4727f4d2")
public static String es_PE_FIELD_History_Order_Help="La ID de la orden de ventas es un identificador único de la orden de ventas; Ésta es controlada por la secuencia del documento para este tipo de documento.";

@XendraField(AD_Column_ID="C_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fb40063e-6a67-2827-7cb1-03ed779b1ace",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=350,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="52b2d0a4-1ad8-fddb-3f49-ba3f4727f4d2")
public static final String FIELDNAME_History_Order="52b2d0a4-1ad8-fddb-3f49-ba3f4727f4d2";

@XendraTrl(Identifier="ebe507b9-f5c0-7291-4459-12b8cc511438")
public static String es_PE_FIELD_History_Order2_Name="Orden de Venta";

@XendraTrl(Identifier="ebe507b9-f5c0-7291-4459-12b8cc511438")
public static String es_PE_FIELD_History_Order2_Description="Orden de Venta";

@XendraTrl(Identifier="ebe507b9-f5c0-7291-4459-12b8cc511438")
public static String es_PE_FIELD_History_Order2_Help="La ID de la orden de ventas es un identificador único de la orden de ventas; Ésta es controlada por la secuencia del documento para este tipo de documento.";

@XendraField(AD_Column_ID="C_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8bc16204-5386-763c-9e9b-78d3c7280f5d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=260,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ebe507b9-f5c0-7291-4459-12b8cc511438")
public static final String FIELDNAME_History_Order2="ebe507b9-f5c0-7291-4459-12b8cc511438";

@XendraTrl(Identifier="72afbc54-a728-df17-5828-6fbf39d45c38")
public static String es_PE_COLUMN_C_Order_ID_Name="Orden de Venta";

@XendraColumn(AD_Element_ID="cc846c60-90b8-6aad-9d07-b5d0c0328787",ColumnName="C_Order_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="72afbc54-a728-df17-5828-6fbf39d45c38",
Synchronized="2019-08-30 22:23:49.0")
/** Column name C_Order_ID */
public static final String COLUMNNAME_C_Order_ID = "C_Order_ID";
/** Set Payment.
@param C_Payment_ID Payment identifier */
public void setC_Payment_ID (int C_Payment_ID)
{
if (C_Payment_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_Payment_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_Payment_ID, Integer.valueOf(C_Payment_ID));
}
/** Get Payment.
@return Payment identifier */
public int getC_Payment_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Payment_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="be52331a-28de-cad2-5fc8-8006359beacb")
public static String es_PE_FIELD_History_Payment_Name="Pago";

@XendraTrl(Identifier="be52331a-28de-cad2-5fc8-8006359beacb")
public static String es_PE_FIELD_History_Payment_Description="Identificador del pago";

@XendraTrl(Identifier="be52331a-28de-cad2-5fc8-8006359beacb")
public static String es_PE_FIELD_History_Payment_Help="El pago es un identificador único de este pago.";

@XendraField(AD_Column_ID="C_Payment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fb40063e-6a67-2827-7cb1-03ed779b1ace",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=380,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="be52331a-28de-cad2-5fc8-8006359beacb")
public static final String FIELDNAME_History_Payment="be52331a-28de-cad2-5fc8-8006359beacb";

@XendraTrl(Identifier="199204b8-9177-cd77-5557-49b282103da3")
public static String es_PE_FIELD_History_Payment2_Name="Pago";

@XendraTrl(Identifier="199204b8-9177-cd77-5557-49b282103da3")
public static String es_PE_FIELD_History_Payment2_Description="Identificador del pago";

@XendraTrl(Identifier="199204b8-9177-cd77-5557-49b282103da3")
public static String es_PE_FIELD_History_Payment2_Help="El pago es un identificador único de este pago.";

@XendraField(AD_Column_ID="C_Payment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8bc16204-5386-763c-9e9b-78d3c7280f5d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=290,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="199204b8-9177-cd77-5557-49b282103da3")
public static final String FIELDNAME_History_Payment2="199204b8-9177-cd77-5557-49b282103da3";

@XendraTrl(Identifier="e688f24a-d59d-0565-02dc-08d0b427821c")
public static String es_PE_COLUMN_C_Payment_ID_Name="Pago";

@XendraColumn(AD_Element_ID="3ded5658-968e-94c5-207b-eed6f6a7bb43",ColumnName="C_Payment_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e688f24a-d59d-0565-02dc-08d0b427821c",
Synchronized="2019-08-30 22:23:49.0")
/** Column name C_Payment_ID */
public static final String COLUMNNAME_C_Payment_ID = "C_Payment_ID";
/** Set Project.
@param C_Project_ID Financial Project */
public void setC_Project_ID (int C_Project_ID)
{
if (C_Project_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_Project_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_Project_ID, Integer.valueOf(C_Project_ID));
}
/** Get Project.
@return Financial Project */
public int getC_Project_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Project_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b2483596-dd91-f0ee-8a92-8cd6f2f28cbe")
public static String es_PE_FIELD_History_Project_Name="Proyecto";

@XendraTrl(Identifier="b2483596-dd91-f0ee-8a92-8cd6f2f28cbe")
public static String es_PE_FIELD_History_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="b2483596-dd91-f0ee-8a92-8cd6f2f28cbe")
public static String es_PE_FIELD_History_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fb40063e-6a67-2827-7cb1-03ed779b1ace",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=330,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b2483596-dd91-f0ee-8a92-8cd6f2f28cbe")
public static final String FIELDNAME_History_Project="b2483596-dd91-f0ee-8a92-8cd6f2f28cbe";

@XendraTrl(Identifier="62d6732f-a791-2b15-7afc-a8fb9ea6c53b")
public static String es_PE_FIELD_History_Project2_Name="Proyecto";

@XendraTrl(Identifier="62d6732f-a791-2b15-7afc-a8fb9ea6c53b")
public static String es_PE_FIELD_History_Project2_Description="Identifica un proyecto único";

@XendraTrl(Identifier="62d6732f-a791-2b15-7afc-a8fb9ea6c53b")
public static String es_PE_FIELD_History_Project2_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8bc16204-5386-763c-9e9b-78d3c7280f5d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="62d6732f-a791-2b15-7afc-a8fb9ea6c53b")
public static final String FIELDNAME_History_Project2="62d6732f-a791-2b15-7afc-a8fb9ea6c53b";

@XendraTrl(Identifier="981dc402-04f0-30d9-37d5-67bbfed0d3e5")
public static String es_PE_COLUMN_C_Project_ID_Name="Proyecto";

@XendraColumn(AD_Element_ID="16ff5dcc-9178-73dd-e618-e88bd79d573b",ColumnName="C_Project_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="981dc402-04f0-30d9-37d5-67bbfed0d3e5",
Synchronized="2019-08-30 22:23:49.0")
/** Column name C_Project_ID */
public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";
/** Set Complete Plan.
@param DateCompletePlan Planned Completion Date */
public void setDateCompletePlan (Timestamp DateCompletePlan)
{
set_Value (COLUMNNAME_DateCompletePlan, DateCompletePlan);
}
/** Get Complete Plan.
@return Planned Completion Date */
public Timestamp getDateCompletePlan() 
{
return (Timestamp)get_Value(COLUMNNAME_DateCompletePlan);
}

@XendraTrl(Identifier="49270d5b-bd51-b727-f69c-edab20cd8e61")
public static String es_PE_FIELD_History_CompletePlan_Name="Completar Plan";

@XendraTrl(Identifier="49270d5b-bd51-b727-f69c-edab20cd8e61")
public static String es_PE_FIELD_History_CompletePlan_Description="Fecha Planeada de TerminaPlanned Completion Date";

@XendraTrl(Identifier="49270d5b-bd51-b727-f69c-edab20cd8e61")
public static String es_PE_FIELD_History_CompletePlan_Help="Date when the task is planned to be complete";

@XendraField(AD_Column_ID="DateCompletePlan",IsCentrallyMaintained=true,
AD_Tab_ID="fb40063e-6a67-2827-7cb1-03ed779b1ace",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=7,IsReadOnly=false,SeqNo=280,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="49270d5b-bd51-b727-f69c-edab20cd8e61")
public static final String FIELDNAME_History_CompletePlan="49270d5b-bd51-b727-f69c-edab20cd8e61";

@XendraTrl(Identifier="598b50a7-8c76-fc28-fde2-9d5f246089cb")
public static String es_PE_COLUMN_DateCompletePlan_Name="Completar Plan";

@XendraColumn(AD_Element_ID="b96552a6-b794-1ec5-b0cc-eef557310317",ColumnName="DateCompletePlan",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="598b50a7-8c76-fc28-fde2-9d5f246089cb",
Synchronized="2019-08-30 22:23:49.0")
/** Column name DateCompletePlan */
public static final String COLUMNNAME_DateCompletePlan = "DateCompletePlan";
/** Set Date next action.
@param DateNextAction Date that this request should be acted on */
public void setDateNextAction (Timestamp DateNextAction)
{
set_ValueNoCheck (COLUMNNAME_DateNextAction, DateNextAction);
}
/** Get Date next action.
@return Date that this request should be acted on */
public Timestamp getDateNextAction() 
{
return (Timestamp)get_Value(COLUMNNAME_DateNextAction);
}

@XendraTrl(Identifier="6eab8241-a95d-5d70-8c0f-e6fe98321272")
public static String es_PE_FIELD_History_DateNextAction_Name="Fecha de Siguiente Acción";

@XendraTrl(Identifier="6eab8241-a95d-5d70-8c0f-e6fe98321272")
public static String es_PE_FIELD_History_DateNextAction_Description="Fecha en que este requerimiento será accionado la siguiente vez.";

@XendraTrl(Identifier="6eab8241-a95d-5d70-8c0f-e6fe98321272")
public static String es_PE_FIELD_History_DateNextAction_Help="La fecha de la siguiente acción indica la fecha siguiente programada para que una acción ocurra para este requerimiento.";

@XendraField(AD_Column_ID="DateNextAction",IsCentrallyMaintained=true,
AD_Tab_ID="fb40063e-6a67-2827-7cb1-03ed779b1ace",AD_FieldGroup_ID="Action",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6eab8241-a95d-5d70-8c0f-e6fe98321272")
public static final String FIELDNAME_History_DateNextAction="6eab8241-a95d-5d70-8c0f-e6fe98321272";

@XendraTrl(Identifier="d723f76e-3a02-dc57-98ab-7a225bcee0cb")
public static String es_PE_FIELD_History_DateNextAction2_Name="Fecha de Siguiente Acción";

@XendraTrl(Identifier="d723f76e-3a02-dc57-98ab-7a225bcee0cb")
public static String es_PE_FIELD_History_DateNextAction2_Description="Fecha en que este requerimiento será accionado la siguiente vez.";

@XendraTrl(Identifier="d723f76e-3a02-dc57-98ab-7a225bcee0cb")
public static String es_PE_FIELD_History_DateNextAction2_Help="La fecha de la siguiente acción indica la fecha siguiente programada para que una acción ocurra para este requerimiento.";

@XendraField(AD_Column_ID="DateNextAction",IsCentrallyMaintained=true,
AD_Tab_ID="8bc16204-5386-763c-9e9b-78d3c7280f5d",AD_FieldGroup_ID="Action",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d723f76e-3a02-dc57-98ab-7a225bcee0cb")
public static final String FIELDNAME_History_DateNextAction2="d723f76e-3a02-dc57-98ab-7a225bcee0cb";

@XendraTrl(Identifier="c93c2863-b156-91e3-2a44-77674a7e9e5e")
public static String es_PE_COLUMN_DateNextAction_Name="Fecha de Siguiente Acción";

@XendraColumn(AD_Element_ID="f61753db-c903-5f73-dbc3-862a56118e48",ColumnName="DateNextAction",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c93c2863-b156-91e3-2a44-77674a7e9e5e",
Synchronized="2019-08-30 22:23:49.0")
/** Column name DateNextAction */
public static final String COLUMNNAME_DateNextAction = "DateNextAction";
/** Set Start Plan.
@param DateStartPlan Planned Start Date */
public void setDateStartPlan (Timestamp DateStartPlan)
{
set_Value (COLUMNNAME_DateStartPlan, DateStartPlan);
}
/** Get Start Plan.
@return Planned Start Date */
public Timestamp getDateStartPlan() 
{
return (Timestamp)get_Value(COLUMNNAME_DateStartPlan);
}

@XendraTrl(Identifier="1e3855d0-534f-2d88-c477-04567cfcc0f0")
public static String es_PE_FIELD_History_StartPlan_Name="Plan de Inicio";

@XendraTrl(Identifier="1e3855d0-534f-2d88-c477-04567cfcc0f0")
public static String es_PE_FIELD_History_StartPlan_Description="Fecha Planeada de Inicio";

@XendraTrl(Identifier="1e3855d0-534f-2d88-c477-04567cfcc0f0")
public static String es_PE_FIELD_History_StartPlan_Help="Fecha cuando usted planea iniciar. ";

@XendraField(AD_Column_ID="DateStartPlan",IsCentrallyMaintained=true,
AD_Tab_ID="fb40063e-6a67-2827-7cb1-03ed779b1ace",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=7,IsReadOnly=false,SeqNo=270,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1e3855d0-534f-2d88-c477-04567cfcc0f0")
public static final String FIELDNAME_History_StartPlan="1e3855d0-534f-2d88-c477-04567cfcc0f0";

@XendraTrl(Identifier="783d0ea8-5b04-218b-6a4d-736d2ac82255")
public static String es_PE_COLUMN_DateStartPlan_Name="Plan de Inicio";

@XendraColumn(AD_Element_ID="aeb70c83-b4b4-84b0-7de4-78a7da42862a",ColumnName="DateStartPlan",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="783d0ea8-5b04-218b-6a4d-736d2ac82255",
Synchronized="2019-08-30 22:23:49.0")
/** Column name DateStartPlan */
public static final String COLUMNNAME_DateStartPlan = "DateStartPlan";
/** Set End Date.
@param EndDate Last effective date (inclusive) */
public void setEndDate (Timestamp EndDate)
{
set_Value (COLUMNNAME_EndDate, EndDate);
}
/** Get End Date.
@return Last effective date (inclusive) */
public Timestamp getEndDate() 
{
return (Timestamp)get_Value(COLUMNNAME_EndDate);
}

@XendraTrl(Identifier="427e3840-7676-6b82-dba6-cb8b9ad9de4a")
public static String es_PE_FIELD_History_EndDate_Name="Fecha Final";

@XendraTrl(Identifier="427e3840-7676-6b82-dba6-cb8b9ad9de4a")
public static String es_PE_FIELD_History_EndDate_Description="Última fecha efectiva (inclusive)";

@XendraTrl(Identifier="427e3840-7676-6b82-dba6-cb8b9ad9de4a")
public static String es_PE_FIELD_History_EndDate_Help="La fecha final indica la última fecha en este rango.";

@XendraField(AD_Column_ID="EndDate",IsCentrallyMaintained=true,
AD_Tab_ID="fb40063e-6a67-2827-7cb1-03ed779b1ace",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=7,IsReadOnly=false,SeqNo=300,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="427e3840-7676-6b82-dba6-cb8b9ad9de4a")
public static final String FIELDNAME_History_EndDate="427e3840-7676-6b82-dba6-cb8b9ad9de4a";

@XendraTrl(Identifier="206870de-c97c-4ce1-20be-91fdd6935779")
public static String es_PE_COLUMN_EndDate_Name="Fecha Final";

@XendraColumn(AD_Element_ID="16fae692-c943-4a1f-732e-bfce5aecb4b3",ColumnName="EndDate",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="206870de-c97c-4ce1-20be-91fdd6935779",
Synchronized="2019-08-30 22:23:49.0")
/** Column name EndDate */
public static final String COLUMNNAME_EndDate = "EndDate";
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
@XendraTrl(Identifier="e2a274bd-d0c1-4835-8b15-43b98f4f340c")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e2a274bd-d0c1-4835-8b15-43b98f4f340c",
Synchronized="2019-08-30 22:23:49.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Escalated.
@param IsEscalated This request has been escalated */
public void setIsEscalated (String IsEscalated)
{
if (IsEscalated != null && IsEscalated.length() > 1)
{
log.warning("Length > 1 - truncated");
IsEscalated = IsEscalated.substring(0,0);
}
set_ValueNoCheck (COLUMNNAME_IsEscalated, IsEscalated);
}
/** Get Escalated.
@return This request has been escalated */
public String getIsEscalated() 
{
return (String)get_Value(COLUMNNAME_IsEscalated);
}

@XendraTrl(Identifier="ff680486-105c-2974-b5b1-419a8792e1f8")
public static String es_PE_FIELD_History_Escalated_Name="Escalado";

@XendraTrl(Identifier="ff680486-105c-2974-b5b1-419a8792e1f8")
public static String es_PE_FIELD_History_Escalated_Description="Este requerimiento ha sido escalado.";

@XendraTrl(Identifier="ff680486-105c-2974-b5b1-419a8792e1f8")
public static String es_PE_FIELD_History_Escalated_Help="El cuadro de verificación escalado indica que este requerimiento ha sido escalado ó elevado en importancia.";

@XendraField(AD_Column_ID="IsEscalated",IsCentrallyMaintained=true,
AD_Tab_ID="fb40063e-6a67-2827-7cb1-03ed779b1ace",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ff680486-105c-2974-b5b1-419a8792e1f8")
public static final String FIELDNAME_History_Escalated="ff680486-105c-2974-b5b1-419a8792e1f8";

@XendraTrl(Identifier="7387d107-829f-86da-0637-4eccf0240b8e")
public static String es_PE_FIELD_History_Escalated2_Name="Escalado";

@XendraTrl(Identifier="7387d107-829f-86da-0637-4eccf0240b8e")
public static String es_PE_FIELD_History_Escalated2_Description="Este requerimiento ha sido escalado.";

@XendraTrl(Identifier="7387d107-829f-86da-0637-4eccf0240b8e")
public static String es_PE_FIELD_History_Escalated2_Help="El cuadro de verificación escalado indica que este requerimiento ha sido escalado ó elevado en importancia.";

@XendraField(AD_Column_ID="IsEscalated",IsCentrallyMaintained=true,
AD_Tab_ID="8bc16204-5386-763c-9e9b-78d3c7280f5d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7387d107-829f-86da-0637-4eccf0240b8e")
public static final String FIELDNAME_History_Escalated2="7387d107-829f-86da-0637-4eccf0240b8e";

@XendraTrl(Identifier="2ed8008d-cd73-8475-b303-9a9abfa71cf6")
public static String es_PE_COLUMN_IsEscalated_Name="Escalado";

@XendraColumn(AD_Element_ID="a72c96ea-02a9-2949-3bb4-c1bbd6b241ad",ColumnName="IsEscalated",
AD_Reference_ID=17,AD_Reference_Value_ID="9d5d423d-1f38-e653-2094-21cc989d1234",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="2ed8008d-cd73-8475-b303-9a9abfa71cf6",Synchronized="2019-08-30 22:23:49.0")
/** Column name IsEscalated */
public static final String COLUMNNAME_IsEscalated = "IsEscalated";
/** Set Invoiced.
@param IsInvoiced Is this invoiced? */
public void setIsInvoiced (String IsInvoiced)
{
if (IsInvoiced != null && IsInvoiced.length() > 1)
{
log.warning("Length > 1 - truncated");
IsInvoiced = IsInvoiced.substring(0,0);
}
set_ValueNoCheck (COLUMNNAME_IsInvoiced, IsInvoiced);
}
/** Get Invoiced.
@return Is this invoiced? */
public String getIsInvoiced() 
{
return (String)get_Value(COLUMNNAME_IsInvoiced);
}

@XendraTrl(Identifier="dc409ab3-bced-786b-7fec-804c6b76f903")
public static String es_PE_FIELD_History_Invoiced_Name="Facturado";

@XendraField(AD_Column_ID="IsInvoiced",IsCentrallyMaintained=true,
AD_Tab_ID="fb40063e-6a67-2827-7cb1-03ed779b1ace",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dc409ab3-bced-786b-7fec-804c6b76f903")
public static final String FIELDNAME_History_Invoiced="dc409ab3-bced-786b-7fec-804c6b76f903";

@XendraTrl(Identifier="16265bea-87c6-0db9-1301-11461cdc7842")
public static String es_PE_FIELD_History_Invoiced2_Name="Facturado";

@XendraField(AD_Column_ID="IsInvoiced",IsCentrallyMaintained=true,
AD_Tab_ID="8bc16204-5386-763c-9e9b-78d3c7280f5d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="16265bea-87c6-0db9-1301-11461cdc7842")
public static final String FIELDNAME_History_Invoiced2="16265bea-87c6-0db9-1301-11461cdc7842";

@XendraTrl(Identifier="ab683b9d-b56e-b1c4-e636-f767020d7f8b")
public static String es_PE_COLUMN_IsInvoiced_Name="Facturado";

@XendraColumn(AD_Element_ID="a685c688-064e-aa25-7a8b-2b0273e958c1",ColumnName="IsInvoiced",
AD_Reference_ID=17,AD_Reference_Value_ID="9d5d423d-1f38-e653-2094-21cc989d1234",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="ab683b9d-b56e-b1c4-e636-f767020d7f8b",Synchronized="2019-08-30 22:23:49.0")
/** Column name IsInvoiced */
public static final String COLUMNNAME_IsInvoiced = "IsInvoiced";
/** Set Self-Service.
@param IsSelfService This is a Self-Service entry or this entry can be changed via Self-Service */
public void setIsSelfService (String IsSelfService)
{
if (IsSelfService != null && IsSelfService.length() > 1)
{
log.warning("Length > 1 - truncated");
IsSelfService = IsSelfService.substring(0,0);
}
set_ValueNoCheck (COLUMNNAME_IsSelfService, IsSelfService);
}
/** Get Self-Service.
@return This is a Self-Service entry or this entry can be changed via Self-Service */
public String getIsSelfService() 
{
return (String)get_Value(COLUMNNAME_IsSelfService);
}

@XendraTrl(Identifier="2a26eb59-6186-c673-5dea-8577f3c4e142")
public static String es_PE_FIELD_History_Self_Service_Name="Auto-Servicio";

@XendraTrl(Identifier="2a26eb59-6186-c673-5dea-8577f3c4e142")
public static String es_PE_FIELD_History_Self_Service_Description="Esta es una entrada del autoservicio ó esta entrada se puede cambiar vía autoservicio";

@XendraTrl(Identifier="2a26eb59-6186-c673-5dea-8577f3c4e142")
public static String es_PE_FIELD_History_Self_Service_Help="El autoservicio permite que los usuarios incorporen datos o que pongan al día sus datos. La bandera indica, que este expediente fue incorporado o creado vía autoservicio o que el usuario puede cambiarlo vía funcionalidad del autoservicio.";

@XendraField(AD_Column_ID="IsSelfService",IsCentrallyMaintained=true,
AD_Tab_ID="fb40063e-6a67-2827-7cb1-03ed779b1ace",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2a26eb59-6186-c673-5dea-8577f3c4e142")
public static final String FIELDNAME_History_Self_Service="2a26eb59-6186-c673-5dea-8577f3c4e142";

@XendraTrl(Identifier="82a69043-f43d-8611-ab5a-d41b621a674b")
public static String es_PE_FIELD_History_Self_Service2_Name="Auto-Servicio";

@XendraTrl(Identifier="82a69043-f43d-8611-ab5a-d41b621a674b")
public static String es_PE_FIELD_History_Self_Service2_Description="Esta es una entrada del autoservicio ó esta entrada se puede cambiar vía autoservicio";

@XendraTrl(Identifier="82a69043-f43d-8611-ab5a-d41b621a674b")
public static String es_PE_FIELD_History_Self_Service2_Help="El autoservicio permite que los usuarios incorporen datos o que pongan al día sus datos. La bandera indica, que este expediente fue incorporado o creado vía autoservicio o que el usuario puede cambiarlo vía funcionalidad del autoservicio.";

@XendraField(AD_Column_ID="IsSelfService",IsCentrallyMaintained=true,
AD_Tab_ID="8bc16204-5386-763c-9e9b-78d3c7280f5d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="82a69043-f43d-8611-ab5a-d41b621a674b")
public static final String FIELDNAME_History_Self_Service2="82a69043-f43d-8611-ab5a-d41b621a674b";

@XendraTrl(Identifier="d8f60579-4433-c2cd-f357-13f27fbc08db")
public static String es_PE_COLUMN_IsSelfService_Name="Auto-Servicio";

@XendraColumn(AD_Element_ID="8f201030-f9ab-66d2-f4de-7209f41f2af8",ColumnName="IsSelfService",
AD_Reference_ID=17,AD_Reference_Value_ID="9d5d423d-1f38-e653-2094-21cc989d1234",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d8f60579-4433-c2cd-f357-13f27fbc08db",Synchronized="2019-08-30 22:23:49.0")
/** Column name IsSelfService */
public static final String COLUMNNAME_IsSelfService = "IsSelfService";
/** Set Shipment/Receipt.
@param M_InOut_ID Material Shipment Document */
public void setM_InOut_ID (int M_InOut_ID)
{
if (M_InOut_ID <= 0) set_ValueNoCheck (COLUMNNAME_M_InOut_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_M_InOut_ID, Integer.valueOf(M_InOut_ID));
}
/** Get Shipment/Receipt.
@return Material Shipment Document */
public int getM_InOut_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_InOut_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a87cbabc-6813-a4e3-eec2-4e546d4e5823")
public static String es_PE_FIELD_History_ShipmentReceipt_Name="Entrega / Recibo";

@XendraTrl(Identifier="a87cbabc-6813-a4e3-eec2-4e546d4e5823")
public static String es_PE_FIELD_History_ShipmentReceipt_Description="Entrega ó documento de recibo";

@XendraTrl(Identifier="a87cbabc-6813-a4e3-eec2-4e546d4e5823")
public static String es_PE_FIELD_History_ShipmentReceipt_Help="La ID de Entrega / Recibo indica el documento único para esta entrega ó recibo";

@XendraField(AD_Column_ID="M_InOut_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fb40063e-6a67-2827-7cb1-03ed779b1ace",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=390,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a87cbabc-6813-a4e3-eec2-4e546d4e5823")
public static final String FIELDNAME_History_ShipmentReceipt="a87cbabc-6813-a4e3-eec2-4e546d4e5823";

@XendraTrl(Identifier="f3c5f92a-d4ac-1612-9b5b-7d4821407f95")
public static String es_PE_FIELD_History_ShipmentReceipt2_Name="Entrega / Recibo";

@XendraTrl(Identifier="f3c5f92a-d4ac-1612-9b5b-7d4821407f95")
public static String es_PE_FIELD_History_ShipmentReceipt2_Description="Entrega ó documento de recibo";

@XendraTrl(Identifier="f3c5f92a-d4ac-1612-9b5b-7d4821407f95")
public static String es_PE_FIELD_History_ShipmentReceipt2_Help="La ID de Entrega / Recibo indica el documento único para esta entrega ó recibo";

@XendraField(AD_Column_ID="M_InOut_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8bc16204-5386-763c-9e9b-78d3c7280f5d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=300,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f3c5f92a-d4ac-1612-9b5b-7d4821407f95")
public static final String FIELDNAME_History_ShipmentReceipt2="f3c5f92a-d4ac-1612-9b5b-7d4821407f95";

@XendraTrl(Identifier="18a1cc65-1864-e60b-74e9-13a58d259793")
public static String es_PE_COLUMN_M_InOut_ID_Name="Entrega / Recibo";

@XendraColumn(AD_Element_ID="5c1a0edf-01a0-832e-098b-d49510db71db",ColumnName="M_InOut_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="18a1cc65-1864-e60b-74e9-13a58d259793",
Synchronized="2019-08-30 22:23:49.0")
/** Column name M_InOut_ID */
public static final String COLUMNNAME_M_InOut_ID = "M_InOut_ID";
/** Set Product.
@param M_Product_ID Product, Service, Item */
public void setM_Product_ID (int M_Product_ID)
{
if (M_Product_ID <= 0) set_ValueNoCheck (COLUMNNAME_M_Product_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_M_Product_ID, Integer.valueOf(M_Product_ID));
}
/** Get Product.
@return Product, Service, Item */
public int getM_Product_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3272dce3-aa92-e845-e9b5-e86d5b13affd")
public static String es_PE_FIELD_History_Product_Name="Producto";

@XendraTrl(Identifier="3272dce3-aa92-e845-e9b5-e86d5b13affd")
public static String es_PE_FIELD_History_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="3272dce3-aa92-e845-e9b5-e86d5b13affd")
public static String es_PE_FIELD_History_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fb40063e-6a67-2827-7cb1-03ed779b1ace",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=370,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3272dce3-aa92-e845-e9b5-e86d5b13affd")
public static final String FIELDNAME_History_Product="3272dce3-aa92-e845-e9b5-e86d5b13affd";

@XendraTrl(Identifier="504442e2-ab46-a125-a100-ce355545bce8")
public static String es_PE_FIELD_History_Product2_Name="Producto";

@XendraTrl(Identifier="504442e2-ab46-a125-a100-ce355545bce8")
public static String es_PE_FIELD_History_Product2_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="504442e2-ab46-a125-a100-ce355545bce8")
public static String es_PE_FIELD_History_Product2_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8bc16204-5386-763c-9e9b-78d3c7280f5d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=280,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="504442e2-ab46-a125-a100-ce355545bce8")
public static final String FIELDNAME_History_Product2="504442e2-ab46-a125-a100-ce355545bce8";

@XendraTrl(Identifier="9e06ad01-ec16-4604-f7a5-d3fe54a4bc87")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9e06ad01-ec16-4604-f7a5-d3fe54a4bc87",
Synchronized="2019-08-30 22:23:49.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set Product Used.
@param M_ProductSpent_ID Product/Resource/Service used in Request */
public void setM_ProductSpent_ID (int M_ProductSpent_ID)
{
if (M_ProductSpent_ID <= 0) set_Value (COLUMNNAME_M_ProductSpent_ID, null);
 else 
set_Value (COLUMNNAME_M_ProductSpent_ID, Integer.valueOf(M_ProductSpent_ID));
}
/** Get Product Used.
@return Product/Resource/Service used in Request */
public int getM_ProductSpent_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_ProductSpent_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e535159c-8ed9-fe5f-92eb-6a8f043b4adf")
public static String es_PE_FIELD_History_ProductUsed_Name="Producto Usado";

@XendraTrl(Identifier="e535159c-8ed9-fe5f-92eb-6a8f043b4adf")
public static String es_PE_FIELD_History_ProductUsed_Description="Producto/Solicitud/Servicio usado en una solicitud";

@XendraTrl(Identifier="e535159c-8ed9-fe5f-92eb-6a8f043b4adf")
public static String es_PE_FIELD_History_ProductUsed_Help="La facturación utiliza el producto usado.";

@XendraField(AD_Column_ID="M_ProductSpent_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fb40063e-6a67-2827-7cb1-03ed779b1ace",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e535159c-8ed9-fe5f-92eb-6a8f043b4adf")
public static final String FIELDNAME_History_ProductUsed="e535159c-8ed9-fe5f-92eb-6a8f043b4adf";

@XendraTrl(Identifier="57d745e3-9962-1342-b0f9-85bf0b644c2f")
public static String es_PE_COLUMN_M_ProductSpent_ID_Name="Producto Usado";

@XendraColumn(AD_Element_ID="ed41cfa1-c930-9b0e-9136-75c88fa6f1f7",ColumnName="M_ProductSpent_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="28b49c4d-0409-b2e0-b70e-d686f8d6503f",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="57d745e3-9962-1342-b0f9-85bf0b644c2f",Synchronized="2019-08-30 22:23:49.0")
/** Column name M_ProductSpent_ID */
public static final String COLUMNNAME_M_ProductSpent_ID = "M_ProductSpent_ID";
/** Set RMA.
@param M_RMA_ID Return Material Authorization */
public void setM_RMA_ID (int M_RMA_ID)
{
if (M_RMA_ID <= 0) set_ValueNoCheck (COLUMNNAME_M_RMA_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_M_RMA_ID, Integer.valueOf(M_RMA_ID));
}
/** Get RMA.
@return Return Material Authorization */
public int getM_RMA_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_RMA_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="fc5c3971-d42f-b39e-0ad2-c6aad95cd32f")
public static String es_PE_FIELD_History_RMA_Name="ADM (RMA)";

@XendraTrl(Identifier="fc5c3971-d42f-b39e-0ad2-c6aad95cd32f")
public static String es_PE_FIELD_History_RMA_Description="Autorización de Devolución de Material";

@XendraTrl(Identifier="fc5c3971-d42f-b39e-0ad2-c6aad95cd32f")
public static String es_PE_FIELD_History_RMA_Help="La Autorización de Devolución de Material se requiere para aceptar devoluciones y para crear memos de credito.";

@XendraField(AD_Column_ID="M_RMA_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fb40063e-6a67-2827-7cb1-03ed779b1ace",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=400,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fc5c3971-d42f-b39e-0ad2-c6aad95cd32f")
public static final String FIELDNAME_History_RMA="fc5c3971-d42f-b39e-0ad2-c6aad95cd32f";

@XendraTrl(Identifier="4f34af1f-b38f-c06e-4c62-6e2f0843f494")
public static String es_PE_FIELD_History_RMA2_Name="ADM (RMA)";

@XendraTrl(Identifier="4f34af1f-b38f-c06e-4c62-6e2f0843f494")
public static String es_PE_FIELD_History_RMA2_Description="Autorización de Devolución de Material";

@XendraTrl(Identifier="4f34af1f-b38f-c06e-4c62-6e2f0843f494")
public static String es_PE_FIELD_History_RMA2_Help="La Autorización de Devolución de Material se requiere para aceptar devoluciones y para crear memos de credito.";

@XendraField(AD_Column_ID="M_RMA_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8bc16204-5386-763c-9e9b-78d3c7280f5d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=310,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4f34af1f-b38f-c06e-4c62-6e2f0843f494")
public static final String FIELDNAME_History_RMA2="4f34af1f-b38f-c06e-4c62-6e2f0843f494";

@XendraTrl(Identifier="64714b05-fcd3-4651-28ff-d5856217a42e")
public static String es_PE_COLUMN_M_RMA_ID_Name="ADM (RMA)";

@XendraColumn(AD_Element_ID="99f41ef6-5c78-3288-c0ff-9495a4714c13",ColumnName="M_RMA_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="64714b05-fcd3-4651-28ff-d5856217a42e",
Synchronized="2019-08-30 22:23:49.0")
/** Column name M_RMA_ID */
public static final String COLUMNNAME_M_RMA_ID = "M_RMA_ID";
/** Set Null Columns.
@param NullColumns Columns with NULL value */
public void setNullColumns (String NullColumns)
{
if (NullColumns != null && NullColumns.length() > 255)
{
log.warning("Length > 255 - truncated");
NullColumns = NullColumns.substring(0,254);
}
set_ValueNoCheck (COLUMNNAME_NullColumns, NullColumns);
}
/** Get Null Columns.
@return Columns with NULL value */
public String getNullColumns() 
{
String value = (String)get_Value(COLUMNNAME_NullColumns);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="9a36b71c-00e4-c391-cfb4-aee70d9436a5")
public static String es_PE_FIELD_History_NullColumns_Name="Columnas Nulas";

@XendraTrl(Identifier="9a36b71c-00e4-c391-cfb4-aee70d9436a5")
public static String es_PE_FIELD_History_NullColumns_Description="Columnas con valores nulos";

@XendraTrl(Identifier="9a36b71c-00e4-c391-cfb4-aee70d9436a5")
public static String es_PE_FIELD_History_NullColumns_Help="Los valores nulos se usan solo para visualización \"No son cambiados\"";

@XendraField(AD_Column_ID="NullColumns",IsCentrallyMaintained=true,
AD_Tab_ID="fb40063e-6a67-2827-7cb1-03ed779b1ace",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=true,SeqNo=410,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9a36b71c-00e4-c391-cfb4-aee70d9436a5")
public static final String FIELDNAME_History_NullColumns="9a36b71c-00e4-c391-cfb4-aee70d9436a5";

@XendraTrl(Identifier="f3ecc6fb-0c4a-3db2-3fe3-5d1d41379938")
public static String es_PE_FIELD_History_NullColumns2_Name="Columnas Nulas";

@XendraTrl(Identifier="f3ecc6fb-0c4a-3db2-3fe3-5d1d41379938")
public static String es_PE_FIELD_History_NullColumns2_Description="Columnas con valores nulos";

@XendraTrl(Identifier="f3ecc6fb-0c4a-3db2-3fe3-5d1d41379938")
public static String es_PE_FIELD_History_NullColumns2_Help="Los valores nulos se usan solo para visualización \"No son cambiados\"";

@XendraField(AD_Column_ID="NullColumns",IsCentrallyMaintained=true,
AD_Tab_ID="8bc16204-5386-763c-9e9b-78d3c7280f5d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=true,SeqNo=320,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f3ecc6fb-0c4a-3db2-3fe3-5d1d41379938")
public static final String FIELDNAME_History_NullColumns2="f3ecc6fb-0c4a-3db2-3fe3-5d1d41379938";

@XendraTrl(Identifier="0adb5973-d0f0-ef65-b6fe-aac9f2caa5dc")
public static String es_PE_COLUMN_NullColumns_Name="Columnas Nulas";

@XendraColumn(AD_Element_ID="ef056f12-3418-9495-81aa-c940ff08da85",ColumnName="NullColumns",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0adb5973-d0f0-ef65-b6fe-aac9f2caa5dc",
Synchronized="2019-08-30 22:23:49.0")
/** Column name NullColumns */
public static final String COLUMNNAME_NullColumns = "NullColumns";
/** Set Priority.
@param Priority Indicates if this request is of a high, medium or low priority. */
public void setPriority (String Priority)
{
if (Priority != null && Priority.length() > 1)
{
log.warning("Length > 1 - truncated");
Priority = Priority.substring(0,0);
}
set_ValueNoCheck (COLUMNNAME_Priority, Priority);
}
/** Get Priority.
@return Indicates if this request is of a high, medium or low priority. */
public String getPriority() 
{
return (String)get_Value(COLUMNNAME_Priority);
}

@XendraTrl(Identifier="f6107f3b-649d-cf2c-dac4-8e251c2b571c")
public static String es_PE_FIELD_History_Priority_Name="Prioridad";

@XendraTrl(Identifier="f6107f3b-649d-cf2c-dac4-8e251c2b571c")
public static String es_PE_FIELD_History_Priority_Description="Indica si este requerimiento es de una alta; media ó baja prioridad";

@XendraTrl(Identifier="f6107f3b-649d-cf2c-dac4-8e251c2b571c")
public static String es_PE_FIELD_History_Priority_Help="La Prioridad indica la importancia de este requerimiento";

@XendraField(AD_Column_ID="Priority",IsCentrallyMaintained=true,
AD_Tab_ID="fb40063e-6a67-2827-7cb1-03ed779b1ace",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f6107f3b-649d-cf2c-dac4-8e251c2b571c")
public static final String FIELDNAME_History_Priority="f6107f3b-649d-cf2c-dac4-8e251c2b571c";

@XendraTrl(Identifier="fc133571-23a1-af69-4982-8f94f2918f63")
public static String es_PE_FIELD_History_Priority2_Name="Prioridad";

@XendraTrl(Identifier="fc133571-23a1-af69-4982-8f94f2918f63")
public static String es_PE_FIELD_History_Priority2_Description="Indica si este requerimiento es de una alta; media ó baja prioridad";

@XendraTrl(Identifier="fc133571-23a1-af69-4982-8f94f2918f63")
public static String es_PE_FIELD_History_Priority2_Help="La Prioridad indica la importancia de este requerimiento";

@XendraField(AD_Column_ID="Priority",IsCentrallyMaintained=true,
AD_Tab_ID="8bc16204-5386-763c-9e9b-78d3c7280f5d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fc133571-23a1-af69-4982-8f94f2918f63")
public static final String FIELDNAME_History_Priority2="fc133571-23a1-af69-4982-8f94f2918f63";

@XendraTrl(Identifier="1fdc17fe-0da2-1fdc-323c-db0260554004")
public static String es_PE_COLUMN_Priority_Name="Prioridad";

@XendraColumn(AD_Element_ID="5057921e-c21f-a6bc-898d-053fcc239847",ColumnName="Priority",
AD_Reference_ID=17,AD_Reference_Value_ID="bfacaeda-bbb9-ba51-d726-52826206b4d7",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="1fdc17fe-0da2-1fdc-323c-db0260554004",Synchronized="2019-08-30 22:23:49.0")
/** Column name Priority */
public static final String COLUMNNAME_Priority = "Priority";
/** Set User Importance.
@param PriorityUser Priority of the issue for the User */
public void setPriorityUser (String PriorityUser)
{
if (PriorityUser != null && PriorityUser.length() > 1)
{
log.warning("Length > 1 - truncated");
PriorityUser = PriorityUser.substring(0,0);
}
set_ValueNoCheck (COLUMNNAME_PriorityUser, PriorityUser);
}
/** Get User Importance.
@return Priority of the issue for the User */
public String getPriorityUser() 
{
return (String)get_Value(COLUMNNAME_PriorityUser);
}

@XendraTrl(Identifier="9919d475-8204-ca00-5e4e-626baecffd77")
public static String es_PE_FIELD_History_UserImportance_Name="Importancia del Usuario";

@XendraTrl(Identifier="9919d475-8204-ca00-5e4e-626baecffd77")
public static String es_PE_FIELD_History_UserImportance_Description="Prioridad de la edición para el usuario.";

@XendraField(AD_Column_ID="PriorityUser",IsCentrallyMaintained=true,
AD_Tab_ID="fb40063e-6a67-2827-7cb1-03ed779b1ace",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9919d475-8204-ca00-5e4e-626baecffd77")
public static final String FIELDNAME_History_UserImportance="9919d475-8204-ca00-5e4e-626baecffd77";

@XendraTrl(Identifier="04ed45d8-485d-32ff-b87d-5d0934fadce5")
public static String es_PE_FIELD_History_UserImportance2_Name="Importancia del Usuario";

@XendraTrl(Identifier="04ed45d8-485d-32ff-b87d-5d0934fadce5")
public static String es_PE_FIELD_History_UserImportance2_Description="Prioridad de la edición para el usuario.";

@XendraField(AD_Column_ID="PriorityUser",IsCentrallyMaintained=true,
AD_Tab_ID="8bc16204-5386-763c-9e9b-78d3c7280f5d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="04ed45d8-485d-32ff-b87d-5d0934fadce5")
public static final String FIELDNAME_History_UserImportance2="04ed45d8-485d-32ff-b87d-5d0934fadce5";

@XendraTrl(Identifier="0f757045-32d5-dead-3d86-08db5da0ad6e")
public static String es_PE_COLUMN_PriorityUser_Name="Importancia del Usuario";

@XendraColumn(AD_Element_ID="a033d12f-6ca7-3bcb-a866-87eed9d28f75",ColumnName="PriorityUser",
AD_Reference_ID=17,AD_Reference_Value_ID="bfacaeda-bbb9-ba51-d726-52826206b4d7",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0f757045-32d5-dead-3d86-08db5da0ad6e",Synchronized="2019-08-30 22:23:49.0")
/** Column name PriorityUser */
public static final String COLUMNNAME_PriorityUser = "PriorityUser";
/** Set Quantity Invoiced.
@param QtyInvoiced Invoiced Quantity */
public void setQtyInvoiced (BigDecimal QtyInvoiced)
{
set_Value (COLUMNNAME_QtyInvoiced, QtyInvoiced);
}
/** Get Quantity Invoiced.
@return Invoiced Quantity */
public BigDecimal getQtyInvoiced() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QtyInvoiced);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="b40b93ed-55b0-3aae-776a-92f05b932921")
public static String es_PE_FIELD_History_QuantityInvoiced_Name="Cantidad Facturada";

@XendraTrl(Identifier="b40b93ed-55b0-3aae-776a-92f05b932921")
public static String es_PE_FIELD_History_QuantityInvoiced_Description="Cantidad facturada";

@XendraTrl(Identifier="b40b93ed-55b0-3aae-776a-92f05b932921")
public static String es_PE_FIELD_History_QuantityInvoiced_Help="La cantidad facturada indica la cantidad de un producto que ha sido facturado";

@XendraField(AD_Column_ID="QtyInvoiced",IsCentrallyMaintained=true,
AD_Tab_ID="fb40063e-6a67-2827-7cb1-03ed779b1ace",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b40b93ed-55b0-3aae-776a-92f05b932921")
public static final String FIELDNAME_History_QuantityInvoiced="b40b93ed-55b0-3aae-776a-92f05b932921";

@XendraTrl(Identifier="bf4d8428-fbc3-44bb-c4de-f1170625695a")
public static String es_PE_COLUMN_QtyInvoiced_Name="Cantidad Facturada";

@XendraColumn(AD_Element_ID="406c1301-33f0-3d6a-3fbc-b0cf44ccc5b3",ColumnName="QtyInvoiced",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bf4d8428-fbc3-44bb-c4de-f1170625695a",
Synchronized="2019-08-30 22:23:49.0")
/** Column name QtyInvoiced */
public static final String COLUMNNAME_QtyInvoiced = "QtyInvoiced";
/** Set Quantity Plan.
@param QtyPlan Planned Quantity */
public void setQtyPlan (BigDecimal QtyPlan)
{
set_Value (COLUMNNAME_QtyPlan, QtyPlan);
}
/** Get Quantity Plan.
@return Planned Quantity */
public BigDecimal getQtyPlan() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QtyPlan);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="2c2dc0eb-ff68-6bba-a94f-062ed731afb2")
public static String es_PE_FIELD_History_QuantityPlan_Name="Plan de Cantidad";

@XendraTrl(Identifier="2c2dc0eb-ff68-6bba-a94f-062ed731afb2")
public static String es_PE_FIELD_History_QuantityPlan_Description="Cantidad Planeada";

@XendraField(AD_Column_ID="QtyPlan",IsCentrallyMaintained=true,
AD_Tab_ID="fb40063e-6a67-2827-7cb1-03ed779b1ace",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=260,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2c2dc0eb-ff68-6bba-a94f-062ed731afb2")
public static final String FIELDNAME_History_QuantityPlan="2c2dc0eb-ff68-6bba-a94f-062ed731afb2";

@XendraTrl(Identifier="eec81340-e9df-b54b-21c7-8ab1a2ee6d4a")
public static String es_PE_COLUMN_QtyPlan_Name="Plan de Cantidad";

@XendraColumn(AD_Element_ID="04d1bce0-1a4c-ddc0-50ca-4e558e6d789a",ColumnName="QtyPlan",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="eec81340-e9df-b54b-21c7-8ab1a2ee6d4a",
Synchronized="2019-08-30 22:23:49.0")
/** Column name QtyPlan */
public static final String COLUMNNAME_QtyPlan = "QtyPlan";
/** Set Quantity Used.
@param QtySpent Quantity used for this event */
public void setQtySpent (BigDecimal QtySpent)
{
set_Value (COLUMNNAME_QtySpent, QtySpent);
}
/** Get Quantity Used.
@return Quantity used for this event */
public BigDecimal getQtySpent() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QtySpent);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="96d4576f-74cd-893e-a885-84cfaa291bdb")
public static String es_PE_FIELD_History_QuantityUsed_Name="Cantidad Usada";

@XendraTrl(Identifier="96d4576f-74cd-893e-a885-84cfaa291bdb")
public static String es_PE_FIELD_History_QuantityUsed_Description="Cantidad usada para este evento";

@XendraField(AD_Column_ID="QtySpent",IsCentrallyMaintained=true,
AD_Tab_ID="fb40063e-6a67-2827-7cb1-03ed779b1ace",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="96d4576f-74cd-893e-a885-84cfaa291bdb")
public static final String FIELDNAME_History_QuantityUsed="96d4576f-74cd-893e-a885-84cfaa291bdb";

@XendraTrl(Identifier="7d9f85de-d0b2-d40b-2ec9-e367204559e1")
public static String es_PE_COLUMN_QtySpent_Name="Cantidad Usada";

@XendraColumn(AD_Element_ID="de5f8ee0-79e4-9ea4-93ab-7bc172fc9f0f",ColumnName="QtySpent",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7d9f85de-d0b2-d40b-2ec9-e367204559e1",
Synchronized="2019-08-30 22:23:49.0")
/** Column name QtySpent */
public static final String COLUMNNAME_QtySpent = "QtySpent";
/** Set Category.
@param R_Category_ID Request Category */
public void setR_Category_ID (int R_Category_ID)
{
if (R_Category_ID <= 0) set_ValueNoCheck (COLUMNNAME_R_Category_ID, null);
 else 
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

@XendraTrl(Identifier="495995fa-8393-76ef-3b14-a5bdbf9fc8a6")
public static String es_PE_FIELD_History_Category_Name="Categoría";

@XendraTrl(Identifier="495995fa-8393-76ef-3b14-a5bdbf9fc8a6")
public static String es_PE_FIELD_History_Category_Description="Categoría de Solicitud";

@XendraTrl(Identifier="495995fa-8393-76ef-3b14-a5bdbf9fc8a6")
public static String es_PE_FIELD_History_Category_Help="Categoria ó asunto de la solicitud";

@XendraField(AD_Column_ID="R_Category_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fb40063e-6a67-2827-7cb1-03ed779b1ace",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="495995fa-8393-76ef-3b14-a5bdbf9fc8a6")
public static final String FIELDNAME_History_Category="495995fa-8393-76ef-3b14-a5bdbf9fc8a6";

@XendraTrl(Identifier="bb43a808-dda6-32f0-30d7-97604e04d5c7")
public static String es_PE_FIELD_History_Category2_Name="Categoría";

@XendraTrl(Identifier="bb43a808-dda6-32f0-30d7-97604e04d5c7")
public static String es_PE_FIELD_History_Category2_Description="Categoría de Solicitud";

@XendraTrl(Identifier="bb43a808-dda6-32f0-30d7-97604e04d5c7")
public static String es_PE_FIELD_History_Category2_Help="Categoria ó asunto de la solicitud";

@XendraField(AD_Column_ID="R_Category_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8bc16204-5386-763c-9e9b-78d3c7280f5d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bb43a808-dda6-32f0-30d7-97604e04d5c7")
public static final String FIELDNAME_History_Category2="bb43a808-dda6-32f0-30d7-97604e04d5c7";

@XendraTrl(Identifier="c84b0f93-3aa5-22f3-81c1-6e455313f095")
public static String es_PE_COLUMN_R_Category_ID_Name="Categoría";

@XendraColumn(AD_Element_ID="6c67e84d-9c0c-0f6f-1738-d8c86cd72ee7",ColumnName="R_Category_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c84b0f93-3aa5-22f3-81c1-6e455313f095",
Synchronized="2019-08-30 22:23:49.0")
/** Column name R_Category_ID */
public static final String COLUMNNAME_R_Category_ID = "R_Category_ID";
/** Set Group.
@param R_Group_ID Request Group */
public void setR_Group_ID (int R_Group_ID)
{
if (R_Group_ID <= 0) set_ValueNoCheck (COLUMNNAME_R_Group_ID, null);
 else 
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

@XendraTrl(Identifier="8db645e8-68d7-fa29-dc55-5ef2689dfea5")
public static String es_PE_FIELD_History_Group_Name="Grupo";

@XendraTrl(Identifier="8db645e8-68d7-fa29-dc55-5ef2689dfea5")
public static String es_PE_FIELD_History_Group_Description="Grupo de solicitud";

@XendraTrl(Identifier="8db645e8-68d7-fa29-dc55-5ef2689dfea5")
public static String es_PE_FIELD_History_Group_Help="Grupo de solicitud (ej. versión de números, responsabilidad, ...)";

@XendraField(AD_Column_ID="R_Group_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fb40063e-6a67-2827-7cb1-03ed779b1ace",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8db645e8-68d7-fa29-dc55-5ef2689dfea5")
public static final String FIELDNAME_History_Group="8db645e8-68d7-fa29-dc55-5ef2689dfea5";

@XendraTrl(Identifier="28b3b4e1-c7e2-b60b-bcbf-80a57a8345d2")
public static String es_PE_FIELD_History_Group2_Name="Grupo";

@XendraTrl(Identifier="28b3b4e1-c7e2-b60b-bcbf-80a57a8345d2")
public static String es_PE_FIELD_History_Group2_Description="Grupo de solicitud";

@XendraTrl(Identifier="28b3b4e1-c7e2-b60b-bcbf-80a57a8345d2")
public static String es_PE_FIELD_History_Group2_Help="Grupo de solicitud (ej. versión de números, responsabilidad, ...)";

@XendraField(AD_Column_ID="R_Group_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8bc16204-5386-763c-9e9b-78d3c7280f5d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="28b3b4e1-c7e2-b60b-bcbf-80a57a8345d2")
public static final String FIELDNAME_History_Group2="28b3b4e1-c7e2-b60b-bcbf-80a57a8345d2";

@XendraTrl(Identifier="94372739-a88a-a6d3-0c47-690cf04cf31d")
public static String es_PE_COLUMN_R_Group_ID_Name="Grupo";

@XendraColumn(AD_Element_ID="66f0c2a3-096f-ad52-1b44-f39cd9c5c857",ColumnName="R_Group_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="94372739-a88a-a6d3-0c47-690cf04cf31d",
Synchronized="2019-08-30 22:23:49.0")
/** Column name R_Group_ID */
public static final String COLUMNNAME_R_Group_ID = "R_Group_ID";
/** Set Request History.
@param R_RequestAction_ID Request has been changed */
public void setR_RequestAction_ID (int R_RequestAction_ID)
{
if (R_RequestAction_ID < 1) throw new IllegalArgumentException ("R_RequestAction_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_R_RequestAction_ID, Integer.valueOf(R_RequestAction_ID));
}
/** Get Request History.
@return Request has been changed */
public int getR_RequestAction_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_RequestAction_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7a864892-62c6-96da-5c6e-7b69dabb845f")
public static String es_PE_FIELD_History_RequestHistory_Name="Acción Solicitada";

@XendraTrl(Identifier="7a864892-62c6-96da-5c6e-7b69dabb845f")
public static String es_PE_FIELD_History_RequestHistory_Description="Acción a ser solicitada";

@XendraTrl(Identifier="7a864892-62c6-96da-5c6e-7b69dabb845f")
public static String es_PE_FIELD_History_RequestHistory_Help="La Acción Solicitada indica si la compañía de la Tarjeta de Crédito ha requerido una acción adicional a ser tomada";

@XendraField(AD_Column_ID="R_RequestAction_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fb40063e-6a67-2827-7cb1-03ed779b1ace",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7a864892-62c6-96da-5c6e-7b69dabb845f")
public static final String FIELDNAME_History_RequestHistory="7a864892-62c6-96da-5c6e-7b69dabb845f";

@XendraTrl(Identifier="a777c325-e25f-eb1e-5792-17813708d8e2")
public static String es_PE_FIELD_History_RequestHistory2_Name="Acción Solicitada";

@XendraTrl(Identifier="a777c325-e25f-eb1e-5792-17813708d8e2")
public static String es_PE_FIELD_History_RequestHistory2_Description="Acción a ser solicitada";

@XendraTrl(Identifier="a777c325-e25f-eb1e-5792-17813708d8e2")
public static String es_PE_FIELD_History_RequestHistory2_Help="La Acción Solicitada indica si la compañía de la Tarjeta de Crédito ha requerido una acción adicional a ser tomada";

@XendraField(AD_Column_ID="R_RequestAction_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8bc16204-5386-763c-9e9b-78d3c7280f5d",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a777c325-e25f-eb1e-5792-17813708d8e2")
public static final String FIELDNAME_History_RequestHistory2="a777c325-e25f-eb1e-5792-17813708d8e2";
/** Column name R_RequestAction_ID */
public static final String COLUMNNAME_R_RequestAction_ID = "R_RequestAction_ID";
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

@XendraTrl(Identifier="8917c307-ee35-e4ae-bf7b-8bf716d5e819")
public static String es_PE_FIELD_History_Request_Name="Solicitud";

@XendraTrl(Identifier="8917c307-ee35-e4ae-bf7b-8bf716d5e819")
public static String es_PE_FIELD_History_Request_Description="Solicitud de un socio de negocio ó prospecto.";

@XendraTrl(Identifier="8917c307-ee35-e4ae-bf7b-8bf716d5e819")
public static String es_PE_FIELD_History_Request_Help="La solicitud identifica un requerimiento único de un socio de negocio ó prospecto.";

@XendraField(AD_Column_ID="R_Request_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fb40063e-6a67-2827-7cb1-03ed779b1ace",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8917c307-ee35-e4ae-bf7b-8bf716d5e819")
public static final String FIELDNAME_History_Request="8917c307-ee35-e4ae-bf7b-8bf716d5e819";

@XendraTrl(Identifier="db03bab5-4942-53c1-cc01-b6005c78fc58")
public static String es_PE_FIELD_History_Request2_Name="Solicitud";

@XendraTrl(Identifier="db03bab5-4942-53c1-cc01-b6005c78fc58")
public static String es_PE_FIELD_History_Request2_Description="Solicitud de un socio de negocio ó prospecto.";

@XendraTrl(Identifier="db03bab5-4942-53c1-cc01-b6005c78fc58")
public static String es_PE_FIELD_History_Request2_Help="La solicitud identifica un requerimiento único de un socio de negocio ó prospecto.";

@XendraField(AD_Column_ID="R_Request_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8bc16204-5386-763c-9e9b-78d3c7280f5d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="db03bab5-4942-53c1-cc01-b6005c78fc58")
public static final String FIELDNAME_History_Request2="db03bab5-4942-53c1-cc01-b6005c78fc58";

@XendraTrl(Identifier="62d575c7-3ea6-085c-ab3e-b46f10b80348")
public static String es_PE_COLUMN_R_Request_ID_Name="Solicitud";

@XendraColumn(AD_Element_ID="8f83a61c-3c9c-841b-466b-9700dd35c0de",ColumnName="R_Request_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="62d575c7-3ea6-085c-ab3e-b46f10b80348",
Synchronized="2019-08-30 22:23:49.0")
/** Column name R_Request_ID */
public static final String COLUMNNAME_R_Request_ID = "R_Request_ID";
/** Set Request Type.
@param R_RequestType_ID Type of request (e.g. Inquiry, Complaint, ..) */
public void setR_RequestType_ID (int R_RequestType_ID)
{
if (R_RequestType_ID <= 0) set_ValueNoCheck (COLUMNNAME_R_RequestType_ID, null);
 else 
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

@XendraTrl(Identifier="5fee5cc6-4255-161c-ad4c-834ba72b5e04")
public static String es_PE_FIELD_History_RequestType_Name="Tipo de Solicitud";

@XendraTrl(Identifier="5fee5cc6-4255-161c-ad4c-834ba72b5e04")
public static String es_PE_FIELD_History_RequestType_Description="Tipo de Solicitud (pregunta; queja).";

@XendraTrl(Identifier="5fee5cc6-4255-161c-ad4c-834ba72b5e04")
public static String es_PE_FIELD_History_RequestType_Help="Tipos de solicitud son usados para procesar y categorizar solicitudes. Ejemplos: consultas de cuentas; garantías; etc.";

@XendraField(AD_Column_ID="R_RequestType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fb40063e-6a67-2827-7cb1-03ed779b1ace",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5fee5cc6-4255-161c-ad4c-834ba72b5e04")
public static final String FIELDNAME_History_RequestType="5fee5cc6-4255-161c-ad4c-834ba72b5e04";

@XendraTrl(Identifier="ddb36727-bc01-3886-acb4-455e4c6fe7fd")
public static String es_PE_FIELD_History_RequestType2_Name="Tipo de Solicitud";

@XendraTrl(Identifier="ddb36727-bc01-3886-acb4-455e4c6fe7fd")
public static String es_PE_FIELD_History_RequestType2_Description="Tipo de Solicitud (pregunta; queja).";

@XendraTrl(Identifier="ddb36727-bc01-3886-acb4-455e4c6fe7fd")
public static String es_PE_FIELD_History_RequestType2_Help="Tipos de solicitud son usados para procesar y categorizar solicitudes. Ejemplos: consultas de cuentas; garantías; etc.";

@XendraField(AD_Column_ID="R_RequestType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8bc16204-5386-763c-9e9b-78d3c7280f5d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ddb36727-bc01-3886-acb4-455e4c6fe7fd")
public static final String FIELDNAME_History_RequestType2="ddb36727-bc01-3886-acb4-455e4c6fe7fd";

@XendraTrl(Identifier="1251d925-710d-1d90-751f-411f8a1bfc6f")
public static String es_PE_COLUMN_R_RequestType_ID_Name="Tipo de Solicitud";

@XendraColumn(AD_Element_ID="5d38239d-4d14-9ae8-35a8-4f92ae90ab59",ColumnName="R_RequestType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1251d925-710d-1d90-751f-411f8a1bfc6f",
Synchronized="2019-08-30 22:23:49.0")
/** Column name R_RequestType_ID */
public static final String COLUMNNAME_R_RequestType_ID = "R_RequestType_ID";
/** Set Resolution.
@param R_Resolution_ID Request Resolution */
public void setR_Resolution_ID (int R_Resolution_ID)
{
if (R_Resolution_ID <= 0) set_ValueNoCheck (COLUMNNAME_R_Resolution_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_R_Resolution_ID, Integer.valueOf(R_Resolution_ID));
}
/** Get Resolution.
@return Request Resolution */
public int getR_Resolution_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_Resolution_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1e7c0110-046b-f869-417d-f43ac138ba4f")
public static String es_PE_FIELD_History_Resolution_Name="Resolución";

@XendraTrl(Identifier="1e7c0110-046b-f869-417d-f43ac138ba4f")
public static String es_PE_FIELD_History_Resolution_Description="Resolución de la solicitud.";

@XendraTrl(Identifier="1e7c0110-046b-f869-417d-f43ac138ba4f")
public static String es_PE_FIELD_History_Resolution_Help="Estado de la resolución (ej. Corregida, Rechazada).";

@XendraField(AD_Column_ID="R_Resolution_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fb40063e-6a67-2827-7cb1-03ed779b1ace",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1e7c0110-046b-f869-417d-f43ac138ba4f")
public static final String FIELDNAME_History_Resolution="1e7c0110-046b-f869-417d-f43ac138ba4f";

@XendraTrl(Identifier="b6796497-6e94-51ef-80bc-89d6884b1be4")
public static String es_PE_FIELD_History_Resolution2_Name="Resolución";

@XendraTrl(Identifier="b6796497-6e94-51ef-80bc-89d6884b1be4")
public static String es_PE_FIELD_History_Resolution2_Description="Resolución de la solicitud.";

@XendraTrl(Identifier="b6796497-6e94-51ef-80bc-89d6884b1be4")
public static String es_PE_FIELD_History_Resolution2_Help="Estado de la resolución (ej. Corregida, Rechazada).";

@XendraField(AD_Column_ID="R_Resolution_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8bc16204-5386-763c-9e9b-78d3c7280f5d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b6796497-6e94-51ef-80bc-89d6884b1be4")
public static final String FIELDNAME_History_Resolution2="b6796497-6e94-51ef-80bc-89d6884b1be4";

@XendraTrl(Identifier="9428d882-a490-c71f-aaaf-185c36a82485")
public static String es_PE_COLUMN_R_Resolution_ID_Name="Resolución";

@XendraColumn(AD_Element_ID="f1494d01-bdca-50e4-5a19-05c833230786",ColumnName="R_Resolution_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9428d882-a490-c71f-aaaf-185c36a82485",
Synchronized="2019-08-30 22:23:49.0")
/** Column name R_Resolution_ID */
public static final String COLUMNNAME_R_Resolution_ID = "R_Resolution_ID";
/** Set Status.
@param R_Status_ID Request Status */
public void setR_Status_ID (int R_Status_ID)
{
if (R_Status_ID <= 0) set_ValueNoCheck (COLUMNNAME_R_Status_ID, null);
 else 
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

@XendraTrl(Identifier="b52da566-400d-17d1-58b6-f2e4d834a704")
public static String es_PE_FIELD_History_Status_Name="Estado";

@XendraTrl(Identifier="b52da566-400d-17d1-58b6-f2e4d834a704")
public static String es_PE_FIELD_History_Status_Description="Estado de la solicitud";

@XendraTrl(Identifier="b52da566-400d-17d1-58b6-f2e4d834a704")
public static String es_PE_FIELD_History_Status_Help="Estado de la solicitud (Abierta, cerrada, investigación, ..)";

@XendraField(AD_Column_ID="R_Status_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fb40063e-6a67-2827-7cb1-03ed779b1ace",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b52da566-400d-17d1-58b6-f2e4d834a704")
public static final String FIELDNAME_History_Status="b52da566-400d-17d1-58b6-f2e4d834a704";

@XendraTrl(Identifier="6cb9dba5-6358-1f5f-ef70-70f38ace3087")
public static String es_PE_FIELD_History_Status2_Name="Estado";

@XendraTrl(Identifier="6cb9dba5-6358-1f5f-ef70-70f38ace3087")
public static String es_PE_FIELD_History_Status2_Description="Estado de la solicitud";

@XendraTrl(Identifier="6cb9dba5-6358-1f5f-ef70-70f38ace3087")
public static String es_PE_FIELD_History_Status2_Help="Estado de la solicitud (Abierta, cerrada, investigación, ..)";

@XendraField(AD_Column_ID="R_Status_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8bc16204-5386-763c-9e9b-78d3c7280f5d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6cb9dba5-6358-1f5f-ef70-70f38ace3087")
public static final String FIELDNAME_History_Status2="6cb9dba5-6358-1f5f-ef70-70f38ace3087";

@XendraTrl(Identifier="860b451f-a7fa-3c51-adb6-e80cf928098c")
public static String es_PE_COLUMN_R_Status_ID_Name="Estado";

@XendraColumn(AD_Element_ID="fb78f5e8-0d33-bd16-b71c-7723f04619ee",ColumnName="R_Status_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="860b451f-a7fa-3c51-adb6-e80cf928098c",
Synchronized="2019-08-30 22:23:49.0")
/** Column name R_Status_ID */
public static final String COLUMNNAME_R_Status_ID = "R_Status_ID";
/** Set Sales Representative.
@param SalesRep_ID Sales Representative or Company Agent */
public void setSalesRep_ID (int SalesRep_ID)
{
if (SalesRep_ID <= 0) set_ValueNoCheck (COLUMNNAME_SalesRep_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_SalesRep_ID, Integer.valueOf(SalesRep_ID));
}
/** Get Sales Representative.
@return Sales Representative or Company Agent */
public int getSalesRep_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_SalesRep_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c2935c87-69f9-b58c-8406-eafbf7e3c104")
public static String es_PE_FIELD_History_SalesRepresentative_Name="Agente Cía";

@XendraTrl(Identifier="c2935c87-69f9-b58c-8406-eafbf7e3c104")
public static String es_PE_FIELD_History_SalesRepresentative_Description="Representante de Ventas";

@XendraTrl(Identifier="c2935c87-69f9-b58c-8406-eafbf7e3c104")
public static String es_PE_FIELD_History_SalesRepresentative_Help="El representante de ventas indica el representante de ventas para esta región.";

@XendraField(AD_Column_ID="SalesRep_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fb40063e-6a67-2827-7cb1-03ed779b1ace",AD_FieldGroup_ID="Action",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c2935c87-69f9-b58c-8406-eafbf7e3c104")
public static final String FIELDNAME_History_SalesRepresentative="c2935c87-69f9-b58c-8406-eafbf7e3c104";

@XendraTrl(Identifier="bfb6329e-d1fb-2026-a770-d6a25bd171a4")
public static String es_PE_FIELD_History_SalesRepresentative2_Name="Agente Cía";

@XendraTrl(Identifier="bfb6329e-d1fb-2026-a770-d6a25bd171a4")
public static String es_PE_FIELD_History_SalesRepresentative2_Description="Representante de Ventas";

@XendraTrl(Identifier="bfb6329e-d1fb-2026-a770-d6a25bd171a4")
public static String es_PE_FIELD_History_SalesRepresentative2_Help="El representante de ventas indica el representante de ventas para esta región.";

@XendraField(AD_Column_ID="SalesRep_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8bc16204-5386-763c-9e9b-78d3c7280f5d",AD_FieldGroup_ID="Action",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bfb6329e-d1fb-2026-a770-d6a25bd171a4")
public static final String FIELDNAME_History_SalesRepresentative2="bfb6329e-d1fb-2026-a770-d6a25bd171a4";

@XendraTrl(Identifier="cf1156cc-1697-83a1-9203-fb58b5b79191")
public static String es_PE_COLUMN_SalesRep_ID_Name="Agente Cía";

@XendraColumn(AD_Element_ID="197a9c3a-ff10-c291-d65f-5e05a36d3710",ColumnName="SalesRep_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="606fce88-e8f3-4df6-0617-746fb6a85b2b",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="cf1156cc-1697-83a1-9203-fb58b5b79191",Synchronized="2019-08-30 22:23:49.0")
/** Column name SalesRep_ID */
public static final String COLUMNNAME_SalesRep_ID = "SalesRep_ID";
/** Set Start Date.
@param StartDate First effective day (inclusive) */
public void setStartDate (Timestamp StartDate)
{
set_Value (COLUMNNAME_StartDate, StartDate);
}
/** Get Start Date.
@return First effective day (inclusive) */
public Timestamp getStartDate() 
{
return (Timestamp)get_Value(COLUMNNAME_StartDate);
}

@XendraTrl(Identifier="7e7c06b3-da42-1fd8-30a0-23d495cdcd00")
public static String es_PE_FIELD_History_StartDate_Name="Fecha de Inicio";

@XendraTrl(Identifier="7e7c06b3-da42-1fd8-30a0-23d495cdcd00")
public static String es_PE_FIELD_History_StartDate_Description="Primer día efectivo (inclusive)";

@XendraTrl(Identifier="7e7c06b3-da42-1fd8-30a0-23d495cdcd00")
public static String es_PE_FIELD_History_StartDate_Help="La fecha de Inicio indica la primera fecha ó fecha inicial de un rango";

@XendraField(AD_Column_ID="StartDate",IsCentrallyMaintained=true,
AD_Tab_ID="fb40063e-6a67-2827-7cb1-03ed779b1ace",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=7,IsReadOnly=false,SeqNo=290,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7e7c06b3-da42-1fd8-30a0-23d495cdcd00")
public static final String FIELDNAME_History_StartDate="7e7c06b3-da42-1fd8-30a0-23d495cdcd00";

@XendraTrl(Identifier="21dad6cf-7471-8485-eb82-9ad19d17c87f")
public static String es_PE_COLUMN_StartDate_Name="Fecha de Inicio";

@XendraColumn(AD_Element_ID="3fe42406-cab3-a569-bf0b-3614f5d95711",ColumnName="StartDate",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="21dad6cf-7471-8485-eb82-9ad19d17c87f",
Synchronized="2019-08-30 22:23:49.0")
/** Column name StartDate */
public static final String COLUMNNAME_StartDate = "StartDate";
/** Set Summary.
@param Summary Textual summary of this request */
public void setSummary (String Summary)
{
set_ValueNoCheck (COLUMNNAME_Summary, Summary);
}
/** Get Summary.
@return Textual summary of this request */
public String getSummary() 
{
String value = (String)get_Value(COLUMNNAME_Summary);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="b53a75a1-4201-6a5f-162d-f29fcdb4b21d")
public static String es_PE_FIELD_History_Summary_Name="Resúmen";

@XendraTrl(Identifier="b53a75a1-4201-6a5f-162d-f29fcdb4b21d")
public static String es_PE_FIELD_History_Summary_Description="Resúmen textual de esta solicitud";

@XendraTrl(Identifier="b53a75a1-4201-6a5f-162d-f29fcdb4b21d")
public static String es_PE_FIELD_History_Summary_Help="El resúmen permite texto en formato libre sobre esta solicitud.";

@XendraField(AD_Column_ID="Summary",IsCentrallyMaintained=true,
AD_Tab_ID="fb40063e-6a67-2827-7cb1-03ed779b1ace",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b53a75a1-4201-6a5f-162d-f29fcdb4b21d")
public static final String FIELDNAME_History_Summary="b53a75a1-4201-6a5f-162d-f29fcdb4b21d";

@XendraTrl(Identifier="d1e40daa-bced-6f49-ebce-3c6dfa2d5964")
public static String es_PE_FIELD_History_Summary2_Name="Resúmen";

@XendraTrl(Identifier="d1e40daa-bced-6f49-ebce-3c6dfa2d5964")
public static String es_PE_FIELD_History_Summary2_Description="Resúmen textual de esta solicitud";

@XendraTrl(Identifier="d1e40daa-bced-6f49-ebce-3c6dfa2d5964")
public static String es_PE_FIELD_History_Summary2_Help="El resúmen permite texto en formato libre sobre esta solicitud.";

@XendraField(AD_Column_ID="Summary",IsCentrallyMaintained=true,
AD_Tab_ID="8bc16204-5386-763c-9e9b-78d3c7280f5d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d1e40daa-bced-6f49-ebce-3c6dfa2d5964")
public static final String FIELDNAME_History_Summary2="d1e40daa-bced-6f49-ebce-3c6dfa2d5964";

@XendraTrl(Identifier="98910c34-6d59-a74d-3ec5-3d4cecc7ecba")
public static String es_PE_COLUMN_Summary_Name="Resúmen";

@XendraColumn(AD_Element_ID="94fe105c-8853-7c06-a32a-9ad75a452917",ColumnName="Summary",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="98910c34-6d59-a74d-3ec5-3d4cecc7ecba",
Synchronized="2019-08-30 22:23:49.0")
/** Column name Summary */
public static final String COLUMNNAME_Summary = "Summary";
/** Set Task Status.
@param TaskStatus Status of the Task */
public void setTaskStatus (String TaskStatus)
{
if (TaskStatus != null && TaskStatus.length() > 1)
{
log.warning("Length > 1 - truncated");
TaskStatus = TaskStatus.substring(0,0);
}
set_Value (COLUMNNAME_TaskStatus, TaskStatus);
}
/** Get Task Status.
@return Status of the Task */
public String getTaskStatus() 
{
return (String)get_Value(COLUMNNAME_TaskStatus);
}

@XendraTrl(Identifier="02d8bc06-2111-5367-3964-5d5624541a5a")
public static String es_PE_FIELD_History_TaskStatus_Name="Estado Taréa";

@XendraTrl(Identifier="02d8bc06-2111-5367-3964-5d5624541a5a")
public static String es_PE_FIELD_History_TaskStatus_Description="Estado de la Taréa";

@XendraTrl(Identifier="02d8bc06-2111-5367-3964-5d5624541a5a")
public static String es_PE_FIELD_History_TaskStatus_Help="Valoración de la culminación y estado de la taréa.";

@XendraField(AD_Column_ID="TaskStatus",IsCentrallyMaintained=true,
AD_Tab_ID="fb40063e-6a67-2827-7cb1-03ed779b1ace",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=250,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="02d8bc06-2111-5367-3964-5d5624541a5a")
public static final String FIELDNAME_History_TaskStatus="02d8bc06-2111-5367-3964-5d5624541a5a";

@XendraTrl(Identifier="8c74b9f7-934c-c0c1-1bad-6a05c3fb0a5e")
public static String es_PE_COLUMN_TaskStatus_Name="Estado Taréa";

@XendraColumn(AD_Element_ID="31ff6abd-ef62-f5f2-c9b8-903359a7f19d",ColumnName="TaskStatus",
AD_Reference_ID=17,AD_Reference_Value_ID="875ad37f-8aa2-3b76-2edb-0a9cd76b3ee7",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="8c74b9f7-934c-c0c1-1bad-6a05c3fb0a5e",Synchronized="2019-08-30 22:23:49.0")
/** Column name TaskStatus */
public static final String COLUMNNAME_TaskStatus = "TaskStatus";
}
