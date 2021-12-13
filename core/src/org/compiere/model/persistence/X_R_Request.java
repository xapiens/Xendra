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
/** Generated Model for R_Request
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_R_Request extends PO
{
/** Standard Constructor
@param ctx context
@param R_Request_ID id
@param trxName transaction
*/
public X_R_Request (Properties ctx, int R_Request_ID, String trxName)
{
super (ctx, R_Request_ID, trxName);
/** if (R_Request_ID == 0)
{
setConfidentialType (null);	
// C
setConfidentialTypeEntry (null);	
// C
setDocumentNo (null);
setDueType (null);	
// 5
setIsEscalated (false);	
// N
setIsInvoiced (false);	
// N
setIsSelfService (false);	
// N
setPriority (null);	
// 5
setProcessed (false);	
// N
setRequestAmt (Env.ZERO);	
// 0
setR_Request_ID (0);
setR_RequestType_ID (0);
setSalesRep_ID (0);	
// @AD_User_ID@
setSummary (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_R_Request (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=417 */
public static int Table_ID=MTable.getTable_ID("R_Request");

@XendraTrl(Identifier="071c86e5-b06e-c77d-bb6e-c0afad7eed3e")
public static String es_PE_TAB_Request_Description="Definir Solicitudes";

@XendraTrl(Identifier="071c86e5-b06e-c77d-bb6e-c0afad7eed3e")
public static String es_PE_TAB_Request_Help="La pestaña Solicitud define una solicitud enviada por un socio de negocio.";

@XendraTrl(Identifier="071c86e5-b06e-c77d-bb6e-c0afad7eed3e")
public static String es_PE_TAB_Request_Name="Solicitud";
@XendraTab(Name="Request",
Description="Define Request",
Help="The Request Tab defines any Request submitted by a Business Partner or internally.",
AD_Window_ID="0090e49f-fcb0-617d-03f1-c1d90ff77da9",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="(R_Request.SalesRep_ID=@#AD_User_ID@ OR R_Request.AD_Role_ID=@#AD_Role_ID@) AND (R_Status_ID IS NULL OR R_Status_ID IN (SELECT R_Status_ID FROM R_Status WHERE IsClosed='N'))",
OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Request="071c86e5-b06e-c77d-bb6e-c0afad7eed3e";

@XendraTrl(Identifier="8a4561d7-25be-5533-de4c-ab4735c335ee")
public static String es_PE_TAB_RequestsSource_Description="Peticiones de usuario referente a la petición del cambio.";

@XendraTrl(Identifier="8a4561d7-25be-5533-de4c-ab4735c335ee")
public static String es_PE_TAB_RequestsSource_Name="Solicitud (Fuente)";

@XendraTab(Name="Requests (source)",Description="User Requests with reference to change request",
Help="",AD_Window_ID="8a10e84b-05cb-5640-2377-dbc3e3e24069",SeqNo=30,TabLevel=2,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="d71abda3-ee4a-64fc-f5ee-6a0a9491a409",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="8a4561d7-25be-5533-de4c-ab4735c335ee",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_RequestsSource="8a4561d7-25be-5533-de4c-ab4735c335ee";

@XendraTrl(Identifier="a6082d0b-507b-9bdf-147b-9db501402eae")
public static String es_PE_TAB_Request2_Description="Definir Solicitudes";

@XendraTrl(Identifier="a6082d0b-507b-9bdf-147b-9db501402eae")
public static String es_PE_TAB_Request2_Help="La pestaña Solicitud define las solicitudes enviadas por un socio de negocio.";

@XendraTrl(Identifier="a6082d0b-507b-9bdf-147b-9db501402eae")
public static String es_PE_TAB_Request2_Name="Solicitud";
@XendraTab(Name="Request",
Description="Define Request",
Help="The Request Tab defines any Request submitted by a Business Partner or internally.",
AD_Window_ID="0d176ab5-fb88-6941-47f1-b5effb1207a9",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="a6082d0b-507b-9bdf-147b-9db501402eae",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Request2="a6082d0b-507b-9bdf-147b-9db501402eae";

@XendraTrl(Identifier="0a25fb60-7718-c6c9-b67f-7adeb07cfa19")
public static String es_PE_TAB_PartnerRequests_Description="Solicitudes socios de negocio";

@XendraTrl(Identifier="0a25fb60-7718-c6c9-b67f-7adeb07cfa19")
public static String es_PE_TAB_PartnerRequests_Name="Solicitudes Socios de Negocio";

@XendraTab(Name="Partner Requests",Description="Business Partner Requests",Help="",
AD_Window_ID="57133321-6993-bd92-eb4e-d35c10b15e95",SeqNo=70,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,AD_Column_ID="",HasTree=false,
WhereClause="R_Request.C_BPartner_ID=@C_BPartner_ID@",OrderByClause="",CommitWarning="",
AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,
Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,IsAdvancedTab=false,
Parent_Column_ID="",Identifier="0a25fb60-7718-c6c9-b67f-7adeb07cfa19",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_PartnerRequests="0a25fb60-7718-c6c9-b67f-7adeb07cfa19";

@XendraTrl(Identifier="c2cdcdde-0adb-ef52-0a9e-48cf3e306ac6")
public static String es_PE_TAB_RequestsSource2_Description="Peticiones de usuario referente a la petición del cambio.";

@XendraTrl(Identifier="c2cdcdde-0adb-ef52-0a9e-48cf3e306ac6")
public static String es_PE_TAB_RequestsSource2_Name="Solicitud (Fuente)";

@XendraTab(Name="Requests (source)",Description="User Requests with reference to change request",
Help="",AD_Window_ID="64b6deef-ba6e-76a9-8b1f-78e36f73c8f1",SeqNo=40,TabLevel=3,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="d71abda3-ee4a-64fc-f5ee-6a0a9491a409",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="c2cdcdde-0adb-ef52-0a9e-48cf3e306ac6",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_RequestsSource2="c2cdcdde-0adb-ef52-0a9e-48cf3e306ac6";

@XendraTrl(Identifier="91dbe3ba-fe63-d2f4-3080-34478405971e")
public static String es_PE_TABLE_R_Request_Name="Solicitud";

@XendraTable(Name="Request",AD_Package_ID="1b3656e5-71c7-1296-994e-9b2c4549c7fd",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",
Description="Request from a Business Partner or Prospect",Help="",TableName="R_Request",
AccessLevel="7",AD_Window_ID="0d176ab5-fb88-6941-47f1-b5effb1207a9",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=135,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.standard",
Identifier="91dbe3ba-fe63-d2f4-3080-34478405971e",Synchronized="2020-03-03 21:39:36.0")
/** TableName=R_Request */
public static final String Table_Name="R_Request";


@XendraIndex(Name="r_request_user",Identifier="56b0d45f-77da-5fe7-ef28-1ffb7119774d",
Column_Names="ad_user_id",IsUnique="false",TableIdentifier="56b0d45f-77da-5fe7-ef28-1ffb7119774d",
Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_r_request_user = "56b0d45f-77da-5fe7-ef28-1ffb7119774d";


@XendraIndex(Name="r_request_bpartner",Identifier="0652be3d-8d4e-8049-1b40-c005df6287e5",
Column_Names="c_bpartner_id",IsUnique="false",
TableIdentifier="0652be3d-8d4e-8049-1b40-c005df6287e5",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_r_request_bpartner = "0652be3d-8d4e-8049-1b40-c005df6287e5";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"R_Request");

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
    Table_ID = MTable.getTable_ID("R_Request");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_R_Request[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Asset.
@param A_Asset_ID Asset used internally or by customers */
public void setA_Asset_ID (int A_Asset_ID)
{
if (A_Asset_ID <= 0) set_Value (COLUMNNAME_A_Asset_ID, null);
 else 
set_Value (COLUMNNAME_A_Asset_ID, Integer.valueOf(A_Asset_ID));
}
/** Get Asset.
@return Asset used internally or by customers */
public int getA_Asset_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_A_Asset_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1adebdaf-ed1b-c65b-ad49-d40fe52720c2")
public static String es_PE_FIELD_Request_Asset_Name="Activo";

@XendraTrl(Identifier="1adebdaf-ed1b-c65b-ad49-d40fe52720c2")
public static String es_PE_FIELD_Request_Asset_Description="Activo usado por la compañía o sus clientes";

@XendraTrl(Identifier="1adebdaf-ed1b-c65b-ad49-d40fe52720c2")
public static String es_PE_FIELD_Request_Asset_Help="Indica si es usado por la compañia o sus clientes";

@XendraField(AD_Column_ID="A_Asset_ID",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=380,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1adebdaf-ed1b-c65b-ad49-d40fe52720c2")
public static final String FIELDNAME_Request_Asset="1adebdaf-ed1b-c65b-ad49-d40fe52720c2";

@XendraTrl(Identifier="1d5479a3-02ca-dafa-bbfe-2d2c7e097b1b")
public static String es_PE_FIELD_Request_Asset2_Name="Activo";

@XendraTrl(Identifier="1d5479a3-02ca-dafa-bbfe-2d2c7e097b1b")
public static String es_PE_FIELD_Request_Asset2_Description="Activo usado por la compañía o sus clientes";

@XendraTrl(Identifier="1d5479a3-02ca-dafa-bbfe-2d2c7e097b1b")
public static String es_PE_FIELD_Request_Asset2_Help="Indica si es usado por la compañia o sus clientes";

@XendraField(AD_Column_ID="A_Asset_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a6082d0b-507b-9bdf-147b-9db501402eae",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=320,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1d5479a3-02ca-dafa-bbfe-2d2c7e097b1b")
public static final String FIELDNAME_Request_Asset2="1d5479a3-02ca-dafa-bbfe-2d2c7e097b1b";

@XendraTrl(Identifier="81f17f38-d756-ced7-6819-647e872351d6")
public static String es_PE_FIELD_PartnerRequests_Asset_Name="Activo";

@XendraTrl(Identifier="81f17f38-d756-ced7-6819-647e872351d6")
public static String es_PE_FIELD_PartnerRequests_Asset_Description="Activo usado por la compañía o sus clientes";

@XendraTrl(Identifier="81f17f38-d756-ced7-6819-647e872351d6")
public static String es_PE_FIELD_PartnerRequests_Asset_Help="Indica si es usado por la compañia o sus clientes";

@XendraField(AD_Column_ID="A_Asset_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a25fb60-7718-c6c9-b67f-7adeb07cfa19",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="81f17f38-d756-ced7-6819-647e872351d6")
public static final String FIELDNAME_PartnerRequests_Asset="81f17f38-d756-ced7-6819-647e872351d6";

@XendraTrl(Identifier="4b4504bb-ac97-da04-2fc3-ba40394497c3")
public static String es_PE_FIELD_RequestsSource_Asset_Name="Activo";

@XendraTrl(Identifier="4b4504bb-ac97-da04-2fc3-ba40394497c3")
public static String es_PE_FIELD_RequestsSource_Asset_Description="Activo usado por la compañía o sus clientes";

@XendraTrl(Identifier="4b4504bb-ac97-da04-2fc3-ba40394497c3")
public static String es_PE_FIELD_RequestsSource_Asset_Help="Indica si es usado por la compañia o sus clientes";

@XendraField(AD_Column_ID="A_Asset_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c2cdcdde-0adb-ef52-0a9e-48cf3e306ac6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4b4504bb-ac97-da04-2fc3-ba40394497c3")
public static final String FIELDNAME_RequestsSource_Asset="4b4504bb-ac97-da04-2fc3-ba40394497c3";

@XendraTrl(Identifier="78ece6a8-b8e2-cc5c-f52e-32db78d1815d")
public static String es_PE_FIELD_RequestsSource_Asset2_Name="Activo";

@XendraTrl(Identifier="78ece6a8-b8e2-cc5c-f52e-32db78d1815d")
public static String es_PE_FIELD_RequestsSource_Asset2_Description="Activo usado por la compañía o sus clientes";

@XendraTrl(Identifier="78ece6a8-b8e2-cc5c-f52e-32db78d1815d")
public static String es_PE_FIELD_RequestsSource_Asset2_Help="Indica si es usado por la compañia o sus clientes";

@XendraField(AD_Column_ID="A_Asset_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8a4561d7-25be-5533-de4c-ab4735c335ee",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="78ece6a8-b8e2-cc5c-f52e-32db78d1815d")
public static final String FIELDNAME_RequestsSource_Asset2="78ece6a8-b8e2-cc5c-f52e-32db78d1815d";

@XendraTrl(Identifier="e8b96d51-4008-7f87-4de0-f8ab00b8b974")
public static String es_PE_COLUMN_A_Asset_ID_Name="Activo";

@XendraColumn(AD_Element_ID="3cd84c49-e25b-9ecc-5637-ed9a07d76bee",ColumnName="A_Asset_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e8b96d51-4008-7f87-4de0-f8ab00b8b974",
Synchronized="2019-08-30 22:23:46.0")
/** Column name A_Asset_ID */
public static final String COLUMNNAME_A_Asset_ID = "A_Asset_ID";
/** Set Role.
@param AD_Role_ID Responsibility Role */
public void setAD_Role_ID (int AD_Role_ID)
{
if (AD_Role_ID <= 0) set_Value (COLUMNNAME_AD_Role_ID, null);
 else 
set_Value (COLUMNNAME_AD_Role_ID, Integer.valueOf(AD_Role_ID));
}
/** Get Role.
@return Responsibility Role */
public int getAD_Role_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Role_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="833fbb3c-4eb7-3506-c603-cfd1dd5c92bd")
public static String es_PE_FIELD_Request_Role_Name="Rol";

@XendraTrl(Identifier="833fbb3c-4eb7-3506-c603-cfd1dd5c92bd")
public static String es_PE_FIELD_Request_Role_Description="Rol de responsabilidad";

@XendraTrl(Identifier="833fbb3c-4eb7-3506-c603-cfd1dd5c92bd")
public static String es_PE_FIELD_Request_Role_Help="El Rol determina la seguridad y acceso del usuario que posee este Rol";

@XendraField(AD_Column_ID="AD_Role_ID",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="Action",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="833fbb3c-4eb7-3506-c603-cfd1dd5c92bd")
public static final String FIELDNAME_Request_Role="833fbb3c-4eb7-3506-c603-cfd1dd5c92bd";

@XendraTrl(Identifier="91e7c9ac-6c8c-6187-1361-c9c91d4201c3")
public static String es_PE_FIELD_Request_Role2_Name="Rol";

@XendraTrl(Identifier="91e7c9ac-6c8c-6187-1361-c9c91d4201c3")
public static String es_PE_FIELD_Request_Role2_Description="Rol de responsabilidad";

@XendraTrl(Identifier="91e7c9ac-6c8c-6187-1361-c9c91d4201c3")
public static String es_PE_FIELD_Request_Role2_Help="El Rol determina la seguridad y acceso del usuario que posee este Rol";

@XendraField(AD_Column_ID="AD_Role_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a6082d0b-507b-9bdf-147b-9db501402eae",AD_FieldGroup_ID="Action",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="91e7c9ac-6c8c-6187-1361-c9c91d4201c3")
public static final String FIELDNAME_Request_Role2="91e7c9ac-6c8c-6187-1361-c9c91d4201c3";

@XendraTrl(Identifier="0dc12f4e-2715-3674-f938-c37e13c3b70b")
public static String es_PE_FIELD_PartnerRequests_Role_Name="Rol";

@XendraTrl(Identifier="0dc12f4e-2715-3674-f938-c37e13c3b70b")
public static String es_PE_FIELD_PartnerRequests_Role_Description="Rol de responsabilidad";

@XendraTrl(Identifier="0dc12f4e-2715-3674-f938-c37e13c3b70b")
public static String es_PE_FIELD_PartnerRequests_Role_Help="El Rol determina la seguridad y acceso del usuario que posee este Rol";

@XendraField(AD_Column_ID="AD_Role_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a25fb60-7718-c6c9-b67f-7adeb07cfa19",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0dc12f4e-2715-3674-f938-c37e13c3b70b")
public static final String FIELDNAME_PartnerRequests_Role="0dc12f4e-2715-3674-f938-c37e13c3b70b";

@XendraTrl(Identifier="3ba7cd85-ca66-04d8-1c13-7265e2ffd8aa")
public static String es_PE_FIELD_RequestsSource_Role_Name="Rol";

@XendraTrl(Identifier="3ba7cd85-ca66-04d8-1c13-7265e2ffd8aa")
public static String es_PE_FIELD_RequestsSource_Role_Description="Rol de responsabilidad";

@XendraTrl(Identifier="3ba7cd85-ca66-04d8-1c13-7265e2ffd8aa")
public static String es_PE_FIELD_RequestsSource_Role_Help="El Rol determina la seguridad y acceso del usuario que posee este Rol";

@XendraField(AD_Column_ID="AD_Role_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c2cdcdde-0adb-ef52-0a9e-48cf3e306ac6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3ba7cd85-ca66-04d8-1c13-7265e2ffd8aa")
public static final String FIELDNAME_RequestsSource_Role="3ba7cd85-ca66-04d8-1c13-7265e2ffd8aa";

@XendraTrl(Identifier="fcbb600c-b085-d7e3-fda0-aedbe8681038")
public static String es_PE_FIELD_RequestsSource_Role2_Name="Rol";

@XendraTrl(Identifier="fcbb600c-b085-d7e3-fda0-aedbe8681038")
public static String es_PE_FIELD_RequestsSource_Role2_Description="Rol de responsabilidad";

@XendraTrl(Identifier="fcbb600c-b085-d7e3-fda0-aedbe8681038")
public static String es_PE_FIELD_RequestsSource_Role2_Help="El Rol determina la seguridad y acceso del usuario que posee este Rol";

@XendraField(AD_Column_ID="AD_Role_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8a4561d7-25be-5533-de4c-ab4735c335ee",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fcbb600c-b085-d7e3-fda0-aedbe8681038")
public static final String FIELDNAME_RequestsSource_Role2="fcbb600c-b085-d7e3-fda0-aedbe8681038";

@XendraTrl(Identifier="c81f7fbb-e458-569a-04b2-65777cd0b398")
public static String es_PE_COLUMN_AD_Role_ID_Name="Rol";

@XendraColumn(AD_Element_ID="08ffb725-ea75-e55f-f4c5-67ac26f40e2b",ColumnName="AD_Role_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="-1",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c81f7fbb-e458-569a-04b2-65777cd0b398",
Synchronized="2019-08-30 22:23:46.0")
/** Column name AD_Role_ID */
public static final String COLUMNNAME_AD_Role_ID = "AD_Role_ID";
/** Set Table.
@param AD_Table_ID Database Table information */
public void setAD_Table_ID (int AD_Table_ID)
{
if (AD_Table_ID <= 0) set_ValueNoCheck (COLUMNNAME_AD_Table_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_AD_Table_ID, Integer.valueOf(AD_Table_ID));
}
/** Get Table.
@return Database Table information */
public int getAD_Table_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Table_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0e1a6c25-6445-8464-5e6a-a1e43d34c662")
public static String es_PE_FIELD_Request_Table_Name="Tabla";

@XendraTrl(Identifier="0e1a6c25-6445-8464-5e6a-a1e43d34c662")
public static String es_PE_FIELD_Request_Table_Description="Tabla para los campos";

@XendraTrl(Identifier="0e1a6c25-6445-8464-5e6a-a1e43d34c662")
public static String es_PE_FIELD_Request_Table_Help="La Tabla indica una tabla en la que reside un campo ó campos.";

@XendraField(AD_Column_ID="AD_Table_ID",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@AD_Table_ID@!0",DisplayLength=14,IsReadOnly=true,SeqNo=470,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="0e1a6c25-6445-8464-5e6a-a1e43d34c662")
public static final String FIELDNAME_Request_Table="0e1a6c25-6445-8464-5e6a-a1e43d34c662";

@XendraTrl(Identifier="712e3736-c406-757d-3591-d3af6d5114b6")
public static String es_PE_FIELD_Request_Table2_Name="Tabla";

@XendraTrl(Identifier="712e3736-c406-757d-3591-d3af6d5114b6")
public static String es_PE_FIELD_Request_Table2_Description="Tabla para los campos";

@XendraTrl(Identifier="712e3736-c406-757d-3591-d3af6d5114b6")
public static String es_PE_FIELD_Request_Table2_Help="La Tabla indica una tabla en la que reside un campo ó campos.";

@XendraField(AD_Column_ID="AD_Table_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a6082d0b-507b-9bdf-147b-9db501402eae",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=410,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="712e3736-c406-757d-3591-d3af6d5114b6")
public static final String FIELDNAME_Request_Table2="712e3736-c406-757d-3591-d3af6d5114b6";

@XendraTrl(Identifier="03c362ff-0a33-2b0f-6ed1-8e5fc91301a6")
public static String es_PE_FIELD_PartnerRequests_Table_Name="Tabla";

@XendraTrl(Identifier="03c362ff-0a33-2b0f-6ed1-8e5fc91301a6")
public static String es_PE_FIELD_PartnerRequests_Table_Description="Tabla para los campos";

@XendraTrl(Identifier="03c362ff-0a33-2b0f-6ed1-8e5fc91301a6")
public static String es_PE_FIELD_PartnerRequests_Table_Help="La Tabla indica una tabla en la que reside un campo ó campos.";

@XendraField(AD_Column_ID="AD_Table_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a25fb60-7718-c6c9-b67f-7adeb07cfa19",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="03c362ff-0a33-2b0f-6ed1-8e5fc91301a6")
public static final String FIELDNAME_PartnerRequests_Table="03c362ff-0a33-2b0f-6ed1-8e5fc91301a6";

@XendraTrl(Identifier="8d93ba3b-1a4c-25cc-4a55-5b2ff53180d9")
public static String es_PE_FIELD_RequestsSource_Table_Name="Tabla";

@XendraTrl(Identifier="8d93ba3b-1a4c-25cc-4a55-5b2ff53180d9")
public static String es_PE_FIELD_RequestsSource_Table_Description="Tabla para los campos";

@XendraTrl(Identifier="8d93ba3b-1a4c-25cc-4a55-5b2ff53180d9")
public static String es_PE_FIELD_RequestsSource_Table_Help="La Tabla indica una tabla en la que reside un campo ó campos.";

@XendraField(AD_Column_ID="AD_Table_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c2cdcdde-0adb-ef52-0a9e-48cf3e306ac6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8d93ba3b-1a4c-25cc-4a55-5b2ff53180d9")
public static final String FIELDNAME_RequestsSource_Table="8d93ba3b-1a4c-25cc-4a55-5b2ff53180d9";

@XendraTrl(Identifier="4eaf9d7a-0180-bd1a-292f-6c3c2bd9c430")
public static String es_PE_FIELD_RequestsSource_Table2_Name="Tabla";

@XendraTrl(Identifier="4eaf9d7a-0180-bd1a-292f-6c3c2bd9c430")
public static String es_PE_FIELD_RequestsSource_Table2_Description="Tabla para los campos";

@XendraTrl(Identifier="4eaf9d7a-0180-bd1a-292f-6c3c2bd9c430")
public static String es_PE_FIELD_RequestsSource_Table2_Help="La Tabla indica una tabla en la que reside un campo ó campos.";

@XendraField(AD_Column_ID="AD_Table_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8a4561d7-25be-5533-de4c-ab4735c335ee",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4eaf9d7a-0180-bd1a-292f-6c3c2bd9c430")
public static final String FIELDNAME_RequestsSource_Table2="4eaf9d7a-0180-bd1a-292f-6c3c2bd9c430";

@XendraTrl(Identifier="cfb819df-5388-bc00-f89c-75b5ad7088d1")
public static String es_PE_COLUMN_AD_Table_ID_Name="Tabla";

@XendraColumn(AD_Element_ID="270eeb02-723b-0ecc-7f56-3c67fa71a7f1",ColumnName="AD_Table_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cfb819df-5388-bc00-f89c-75b5ad7088d1",
Synchronized="2019-08-30 22:23:46.0")
/** Column name AD_Table_ID */
public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
/** Set User/Contact.
@param AD_User_ID User within the system - Internal or Business Partner Contact */
public void setAD_User_ID (int AD_User_ID)
{
if (AD_User_ID <= 0) set_Value (COLUMNNAME_AD_User_ID, null);
 else 
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

@XendraTrl(Identifier="5e800d94-0179-023e-2efe-b7fd67e18250")
public static String es_PE_FIELD_Request_UserContact_Name="Usuario";

@XendraTrl(Identifier="5e800d94-0179-023e-2efe-b7fd67e18250")
public static String es_PE_FIELD_Request_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="5e800d94-0179-023e-2efe-b7fd67e18250")
public static String es_PE_FIELD_Request_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=360,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5e800d94-0179-023e-2efe-b7fd67e18250")
public static final String FIELDNAME_Request_UserContact="5e800d94-0179-023e-2efe-b7fd67e18250";

@XendraTrl(Identifier="1e1ebbc1-6606-8eb8-d841-35343ecdd70a")
public static String es_PE_FIELD_Request_UserContact2_Name="Usuario";

@XendraTrl(Identifier="1e1ebbc1-6606-8eb8-d841-35343ecdd70a")
public static String es_PE_FIELD_Request_UserContact2_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="1e1ebbc1-6606-8eb8-d841-35343ecdd70a")
public static String es_PE_FIELD_Request_UserContact2_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a6082d0b-507b-9bdf-147b-9db501402eae",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=300,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1e1ebbc1-6606-8eb8-d841-35343ecdd70a")
public static final String FIELDNAME_Request_UserContact2="1e1ebbc1-6606-8eb8-d841-35343ecdd70a";

@XendraTrl(Identifier="61789763-c69c-dbd1-d835-011628ab9c42")
public static String es_PE_FIELD_PartnerRequests_UserContact_Name="Usuario";

@XendraTrl(Identifier="61789763-c69c-dbd1-d835-011628ab9c42")
public static String es_PE_FIELD_PartnerRequests_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="61789763-c69c-dbd1-d835-011628ab9c42")
public static String es_PE_FIELD_PartnerRequests_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a25fb60-7718-c6c9-b67f-7adeb07cfa19",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="61789763-c69c-dbd1-d835-011628ab9c42")
public static final String FIELDNAME_PartnerRequests_UserContact="61789763-c69c-dbd1-d835-011628ab9c42";

@XendraTrl(Identifier="e7093603-18b5-6589-7371-06cef8fb49a6")
public static String es_PE_FIELD_RequestsSource_UserContact_Name="Usuario";

@XendraTrl(Identifier="e7093603-18b5-6589-7371-06cef8fb49a6")
public static String es_PE_FIELD_RequestsSource_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="e7093603-18b5-6589-7371-06cef8fb49a6")
public static String es_PE_FIELD_RequestsSource_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c2cdcdde-0adb-ef52-0a9e-48cf3e306ac6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e7093603-18b5-6589-7371-06cef8fb49a6")
public static final String FIELDNAME_RequestsSource_UserContact="e7093603-18b5-6589-7371-06cef8fb49a6";

@XendraTrl(Identifier="8efaeff1-ff0f-d3bf-c616-37177ddf6156")
public static String es_PE_FIELD_RequestsSource_UserContact2_Name="Usuario";

@XendraTrl(Identifier="8efaeff1-ff0f-d3bf-c616-37177ddf6156")
public static String es_PE_FIELD_RequestsSource_UserContact2_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="8efaeff1-ff0f-d3bf-c616-37177ddf6156")
public static String es_PE_FIELD_RequestsSource_UserContact2_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8a4561d7-25be-5533-de4c-ab4735c335ee",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8efaeff1-ff0f-d3bf-c616-37177ddf6156")
public static final String FIELDNAME_RequestsSource_UserContact2="8efaeff1-ff0f-d3bf-c616-37177ddf6156";

@XendraTrl(Identifier="230d8ce0-a7d6-8bc1-fbb7-2f6ce3d15a63")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="f4ac36a1-4200-1386-677e-14ac90afb4fe",
FieldLength=22,DefaultValue="-1",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="230d8ce0-a7d6-8bc1-fbb7-2f6ce3d15a63",Synchronized="2019-08-30 22:23:46.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
/** Set Activity.
@param C_Activity_ID Business Activity */
public void setC_Activity_ID (int C_Activity_ID)
{
if (C_Activity_ID <= 0) set_Value (COLUMNNAME_C_Activity_ID, null);
 else 
set_Value (COLUMNNAME_C_Activity_ID, Integer.valueOf(C_Activity_ID));
}
/** Get Activity.
@return Business Activity */
public int getC_Activity_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Activity_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="131a81c6-745c-085f-b2a1-560803e076a6")
public static String es_PE_FIELD_Request_Activity_Name="Tipo de Gasto";

@XendraTrl(Identifier="131a81c6-745c-085f-b2a1-560803e076a6")
public static String es_PE_FIELD_Request_Activity_Description="Actividad de Negocio";

@XendraTrl(Identifier="131a81c6-745c-085f-b2a1-560803e076a6")
public static String es_PE_FIELD_Request_Activity_Help="Las actividades indican tareas que son ejecutadas en el curso de un negocio; las actividades son usadas para el costeo por actividad (ABC)";

@XendraField(AD_Column_ID="C_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=270,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="131a81c6-745c-085f-b2a1-560803e076a6")
public static final String FIELDNAME_Request_Activity="131a81c6-745c-085f-b2a1-560803e076a6";

@XendraTrl(Identifier="a226da6c-3b9a-c346-f24a-de6c52834b68")
public static String es_PE_FIELD_Request_Activity2_Name="Tipo de Gasto";

@XendraTrl(Identifier="a226da6c-3b9a-c346-f24a-de6c52834b68")
public static String es_PE_FIELD_Request_Activity2_Description="Actividad de Negocio";

@XendraTrl(Identifier="a226da6c-3b9a-c346-f24a-de6c52834b68")
public static String es_PE_FIELD_Request_Activity2_Help="Las actividades indican tareas que son ejecutadas en el curso de un negocio; las actividades son usadas para el costeo por actividad (ABC)";

@XendraField(AD_Column_ID="C_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a6082d0b-507b-9bdf-147b-9db501402eae",AD_FieldGroup_ID="Action",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=250,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a226da6c-3b9a-c346-f24a-de6c52834b68")
public static final String FIELDNAME_Request_Activity2="a226da6c-3b9a-c346-f24a-de6c52834b68";

@XendraTrl(Identifier="685b6f5b-c4c6-e251-2b18-cdbcb1e43d03")
public static String es_PE_FIELD_PartnerRequests_Activity_Name="Tipo de Gasto";

@XendraTrl(Identifier="685b6f5b-c4c6-e251-2b18-cdbcb1e43d03")
public static String es_PE_FIELD_PartnerRequests_Activity_Description="Actividad de Negocio";

@XendraTrl(Identifier="685b6f5b-c4c6-e251-2b18-cdbcb1e43d03")
public static String es_PE_FIELD_PartnerRequests_Activity_Help="Las actividades indican tareas que son ejecutadas en el curso de un negocio; las actividades son usadas para el costeo por actividad (ABC)";

@XendraField(AD_Column_ID="C_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a25fb60-7718-c6c9-b67f-7adeb07cfa19",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="685b6f5b-c4c6-e251-2b18-cdbcb1e43d03")
public static final String FIELDNAME_PartnerRequests_Activity="685b6f5b-c4c6-e251-2b18-cdbcb1e43d03";

@XendraTrl(Identifier="57ee88f2-d1d2-d825-96d0-b9d009e08819")
public static String es_PE_FIELD_RequestsSource_Activity_Name="Tipo de Gasto";

@XendraTrl(Identifier="57ee88f2-d1d2-d825-96d0-b9d009e08819")
public static String es_PE_FIELD_RequestsSource_Activity_Description="Actividad de Negocio";

@XendraTrl(Identifier="57ee88f2-d1d2-d825-96d0-b9d009e08819")
public static String es_PE_FIELD_RequestsSource_Activity_Help="Las actividades indican tareas que son ejecutadas en el curso de un negocio; las actividades son usadas para el costeo por actividad (ABC)";

@XendraField(AD_Column_ID="C_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c2cdcdde-0adb-ef52-0a9e-48cf3e306ac6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="57ee88f2-d1d2-d825-96d0-b9d009e08819")
public static final String FIELDNAME_RequestsSource_Activity="57ee88f2-d1d2-d825-96d0-b9d009e08819";

@XendraTrl(Identifier="cb5f14ee-c138-f909-fda5-1827d23fffd3")
public static String es_PE_FIELD_RequestsSource_Activity2_Name="Tipo de Gasto";

@XendraTrl(Identifier="cb5f14ee-c138-f909-fda5-1827d23fffd3")
public static String es_PE_FIELD_RequestsSource_Activity2_Description="Actividad de Negocio";

@XendraTrl(Identifier="cb5f14ee-c138-f909-fda5-1827d23fffd3")
public static String es_PE_FIELD_RequestsSource_Activity2_Help="Las actividades indican tareas que son ejecutadas en el curso de un negocio; las actividades son usadas para el costeo por actividad (ABC)";

@XendraField(AD_Column_ID="C_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8a4561d7-25be-5533-de4c-ab4735c335ee",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cb5f14ee-c138-f909-fda5-1827d23fffd3")
public static final String FIELDNAME_RequestsSource_Activity2="cb5f14ee-c138-f909-fda5-1827d23fffd3";

@XendraTrl(Identifier="a2b9e4b5-e2fd-8ad0-8b73-6660515df69f")
public static String es_PE_COLUMN_C_Activity_ID_Name="Tipo de Gasto";

@XendraColumn(AD_Element_ID="bfeadbb3-d866-26e3-8eee-3e2fdf0ff753",ColumnName="C_Activity_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a2b9e4b5-e2fd-8ad0-8b73-6660515df69f",
Synchronized="2019-08-30 22:23:46.0")
/** Column name C_Activity_ID */
public static final String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
/** Set Business Partner .
@param C_BPartner_ID Identifies a Business Partner */
public void setC_BPartner_ID (int C_BPartner_ID)
{
if (C_BPartner_ID <= 0) set_Value (COLUMNNAME_C_BPartner_ID, null);
 else 
set_Value (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
}
/** Get Business Partner .
@return Identifies a Business Partner */
public int getC_BPartner_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5a6c6c31-0be5-50c3-d34b-22d89a2b9d2a")
public static String es_PE_FIELD_Request_BusinessPartner_Name="Socio de Negocio";

@XendraTrl(Identifier="5a6c6c31-0be5-50c3-d34b-22d89a2b9d2a")
public static String es_PE_FIELD_Request_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="5a6c6c31-0be5-50c3-d34b-22d89a2b9d2a")
public static String es_PE_FIELD_Request_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=350,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5a6c6c31-0be5-50c3-d34b-22d89a2b9d2a")
public static final String FIELDNAME_Request_BusinessPartner="5a6c6c31-0be5-50c3-d34b-22d89a2b9d2a";

@XendraTrl(Identifier="de5e3907-8d3a-c534-5448-ee5ae45d52f8")
public static String es_PE_FIELD_Request_BusinessPartner2_Name="Socio de Negocio";

@XendraTrl(Identifier="de5e3907-8d3a-c534-5448-ee5ae45d52f8")
public static String es_PE_FIELD_Request_BusinessPartner2_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="de5e3907-8d3a-c534-5448-ee5ae45d52f8")
public static String es_PE_FIELD_Request_BusinessPartner2_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a6082d0b-507b-9bdf-147b-9db501402eae",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=290,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="de5e3907-8d3a-c534-5448-ee5ae45d52f8")
public static final String FIELDNAME_Request_BusinessPartner2="de5e3907-8d3a-c534-5448-ee5ae45d52f8";

@XendraTrl(Identifier="21c98c4f-8313-f5da-be5b-515a3581ff57")
public static String es_PE_FIELD_PartnerRequests_BusinessPartner_Name="Socio de Negocio";

@XendraTrl(Identifier="21c98c4f-8313-f5da-be5b-515a3581ff57")
public static String es_PE_FIELD_PartnerRequests_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="21c98c4f-8313-f5da-be5b-515a3581ff57")
public static String es_PE_FIELD_PartnerRequests_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a25fb60-7718-c6c9-b67f-7adeb07cfa19",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="21c98c4f-8313-f5da-be5b-515a3581ff57")
public static final String FIELDNAME_PartnerRequests_BusinessPartner="21c98c4f-8313-f5da-be5b-515a3581ff57";

@XendraTrl(Identifier="34e18d13-eac5-dacc-e08d-2a917232b1a5")
public static String es_PE_FIELD_RequestsSource_BusinessPartner_Name="Socio de Negocio";

@XendraTrl(Identifier="34e18d13-eac5-dacc-e08d-2a917232b1a5")
public static String es_PE_FIELD_RequestsSource_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="34e18d13-eac5-dacc-e08d-2a917232b1a5")
public static String es_PE_FIELD_RequestsSource_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c2cdcdde-0adb-ef52-0a9e-48cf3e306ac6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="34e18d13-eac5-dacc-e08d-2a917232b1a5")
public static final String FIELDNAME_RequestsSource_BusinessPartner="34e18d13-eac5-dacc-e08d-2a917232b1a5";

@XendraTrl(Identifier="ae5ac9b3-fc82-2d15-ab00-42be025b1441")
public static String es_PE_FIELD_RequestsSource_BusinessPartner2_Name="Socio de Negocio";

@XendraTrl(Identifier="ae5ac9b3-fc82-2d15-ab00-42be025b1441")
public static String es_PE_FIELD_RequestsSource_BusinessPartner2_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="ae5ac9b3-fc82-2d15-ab00-42be025b1441")
public static String es_PE_FIELD_RequestsSource_BusinessPartner2_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8a4561d7-25be-5533-de4c-ab4735c335ee",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ae5ac9b3-fc82-2d15-ab00-42be025b1441")
public static final String FIELDNAME_RequestsSource_BusinessPartner2="ae5ac9b3-fc82-2d15-ab00-42be025b1441";

@XendraTrl(Identifier="b36d0b27-de56-ffbe-7cbf-9e64dfa4f735")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b36d0b27-de56-ffbe-7cbf-9e64dfa4f735",
Synchronized="2019-08-30 22:23:46.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set Campaign.
@param C_Campaign_ID Marketing Campaign */
public void setC_Campaign_ID (int C_Campaign_ID)
{
if (C_Campaign_ID <= 0) set_Value (COLUMNNAME_C_Campaign_ID, null);
 else 
set_Value (COLUMNNAME_C_Campaign_ID, Integer.valueOf(C_Campaign_ID));
}
/** Get Campaign.
@return Marketing Campaign */
public int getC_Campaign_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Campaign_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="910f64a0-7de9-ebc3-27ab-ac678e305881")
public static String es_PE_FIELD_Request_Campaign_Name="Campaña";

@XendraTrl(Identifier="910f64a0-7de9-ebc3-27ab-ac678e305881")
public static String es_PE_FIELD_Request_Campaign_Description="Campaña de Mercadeo";

@XendraTrl(Identifier="910f64a0-7de9-ebc3-27ab-ac678e305881")
public static String es_PE_FIELD_Request_Campaign_Help="La Campaña define un programa de mercadotecnia único. Los proyectos pueden estar asociados con una campaña de mercadotecnia única. Usted puede entonces reportar basado en una campaña específica";

@XendraField(AD_Column_ID="C_Campaign_ID",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@$Element_MC@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=460,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="910f64a0-7de9-ebc3-27ab-ac678e305881")
public static final String FIELDNAME_Request_Campaign="910f64a0-7de9-ebc3-27ab-ac678e305881";

@XendraTrl(Identifier="7683df61-030d-22a4-93ef-63b8da905cac")
public static String es_PE_FIELD_Request_Campaign2_Name="Campaña";

@XendraTrl(Identifier="7683df61-030d-22a4-93ef-63b8da905cac")
public static String es_PE_FIELD_Request_Campaign2_Description="Campaña de Mercadeo";

@XendraTrl(Identifier="7683df61-030d-22a4-93ef-63b8da905cac")
public static String es_PE_FIELD_Request_Campaign2_Help="La Campaña define un programa de mercadotecnia único. Los proyectos pueden estar asociados con una campaña de mercadotecnia única. Usted puede entonces reportar basado en una campaña específica";

@XendraField(AD_Column_ID="C_Campaign_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a6082d0b-507b-9bdf-147b-9db501402eae",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@$Element_MC@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=400,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="7683df61-030d-22a4-93ef-63b8da905cac")
public static final String FIELDNAME_Request_Campaign2="7683df61-030d-22a4-93ef-63b8da905cac";

@XendraTrl(Identifier="e0a97845-cc76-701e-b616-c933656ab223")
public static String es_PE_FIELD_PartnerRequests_Campaign_Name="Campaña";

@XendraTrl(Identifier="e0a97845-cc76-701e-b616-c933656ab223")
public static String es_PE_FIELD_PartnerRequests_Campaign_Description="Campaña de Mercadeo";

@XendraTrl(Identifier="e0a97845-cc76-701e-b616-c933656ab223")
public static String es_PE_FIELD_PartnerRequests_Campaign_Help="La Campaña define un programa de mercadotecnia único. Los proyectos pueden estar asociados con una campaña de mercadotecnia única. Usted puede entonces reportar basado en una campaña específica";

@XendraField(AD_Column_ID="C_Campaign_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a25fb60-7718-c6c9-b67f-7adeb07cfa19",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e0a97845-cc76-701e-b616-c933656ab223")
public static final String FIELDNAME_PartnerRequests_Campaign="e0a97845-cc76-701e-b616-c933656ab223";

@XendraTrl(Identifier="8963b958-ce20-2b08-9db2-f75d1bd2769d")
public static String es_PE_FIELD_RequestsSource_Campaign_Name="Campaña";

@XendraTrl(Identifier="8963b958-ce20-2b08-9db2-f75d1bd2769d")
public static String es_PE_FIELD_RequestsSource_Campaign_Description="Campaña de Mercadeo";

@XendraTrl(Identifier="8963b958-ce20-2b08-9db2-f75d1bd2769d")
public static String es_PE_FIELD_RequestsSource_Campaign_Help="La Campaña define un programa de mercadotecnia único. Los proyectos pueden estar asociados con una campaña de mercadotecnia única. Usted puede entonces reportar basado en una campaña específica";

@XendraField(AD_Column_ID="C_Campaign_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c2cdcdde-0adb-ef52-0a9e-48cf3e306ac6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8963b958-ce20-2b08-9db2-f75d1bd2769d")
public static final String FIELDNAME_RequestsSource_Campaign="8963b958-ce20-2b08-9db2-f75d1bd2769d";

@XendraTrl(Identifier="53eecd7e-5488-7aa1-1b24-fe7f34155980")
public static String es_PE_FIELD_RequestsSource_Campaign2_Name="Campaña";

@XendraTrl(Identifier="53eecd7e-5488-7aa1-1b24-fe7f34155980")
public static String es_PE_FIELD_RequestsSource_Campaign2_Description="Campaña de Mercadeo";

@XendraTrl(Identifier="53eecd7e-5488-7aa1-1b24-fe7f34155980")
public static String es_PE_FIELD_RequestsSource_Campaign2_Help="La Campaña define un programa de mercadotecnia único. Los proyectos pueden estar asociados con una campaña de mercadotecnia única. Usted puede entonces reportar basado en una campaña específica";

@XendraField(AD_Column_ID="C_Campaign_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8a4561d7-25be-5533-de4c-ab4735c335ee",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="53eecd7e-5488-7aa1-1b24-fe7f34155980")
public static final String FIELDNAME_RequestsSource_Campaign2="53eecd7e-5488-7aa1-1b24-fe7f34155980";

@XendraTrl(Identifier="647fe6d4-a6fd-cb0b-bd72-1823be19a1e6")
public static String es_PE_COLUMN_C_Campaign_ID_Name="Campaña";

@XendraColumn(AD_Element_ID="6cf08e31-d355-ee38-9c0b-bee20b3ea5b6",ColumnName="C_Campaign_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="647fe6d4-a6fd-cb0b-bd72-1823be19a1e6",
Synchronized="2019-08-30 22:23:46.0")
/** Column name C_Campaign_ID */
public static final String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
/** Set Invoice.
@param C_Invoice_ID Invoice Identifier */
public void setC_Invoice_ID (int C_Invoice_ID)
{
if (C_Invoice_ID <= 0) set_Value (COLUMNNAME_C_Invoice_ID, null);
 else 
set_Value (COLUMNNAME_C_Invoice_ID, Integer.valueOf(C_Invoice_ID));
}
/** Get Invoice.
@return Invoice Identifier */
public int getC_Invoice_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Invoice_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e87c0cb8-0de4-6ce6-e410-2233e3f353b1")
public static String es_PE_FIELD_Request_Invoice_Name="Factura";

@XendraTrl(Identifier="e87c0cb8-0de4-6ce6-e410-2233e3f353b1")
public static String es_PE_FIELD_Request_Invoice_Description="Identificador de la factura";

@XendraTrl(Identifier="e87c0cb8-0de4-6ce6-e410-2233e3f353b1")
public static String es_PE_FIELD_Request_Invoice_Help="La ID de Factura identifica únicamente un documento de Factura.";

@XendraField(AD_Column_ID="C_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=400,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e87c0cb8-0de4-6ce6-e410-2233e3f353b1")
public static final String FIELDNAME_Request_Invoice="e87c0cb8-0de4-6ce6-e410-2233e3f353b1";

@XendraTrl(Identifier="07900bf1-b149-5131-f6d8-658d832f2bf7")
public static String es_PE_FIELD_Request_Invoice2_Name="Factura";

@XendraTrl(Identifier="07900bf1-b149-5131-f6d8-658d832f2bf7")
public static String es_PE_FIELD_Request_Invoice2_Description="Identificador de la factura";

@XendraTrl(Identifier="07900bf1-b149-5131-f6d8-658d832f2bf7")
public static String es_PE_FIELD_Request_Invoice2_Help="La ID de Factura identifica únicamente un documento de Factura.";

@XendraField(AD_Column_ID="C_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a6082d0b-507b-9bdf-147b-9db501402eae",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=340,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="07900bf1-b149-5131-f6d8-658d832f2bf7")
public static final String FIELDNAME_Request_Invoice2="07900bf1-b149-5131-f6d8-658d832f2bf7";

@XendraTrl(Identifier="5be588d9-dd73-c329-3683-83c7cfef61fa")
public static String es_PE_FIELD_PartnerRequests_Invoice_Name="Factura";

@XendraTrl(Identifier="5be588d9-dd73-c329-3683-83c7cfef61fa")
public static String es_PE_FIELD_PartnerRequests_Invoice_Description="Identificador de la factura";

@XendraTrl(Identifier="5be588d9-dd73-c329-3683-83c7cfef61fa")
public static String es_PE_FIELD_PartnerRequests_Invoice_Help="La ID de Factura identifica únicamente un documento de Factura.";

@XendraField(AD_Column_ID="C_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a25fb60-7718-c6c9-b67f-7adeb07cfa19",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5be588d9-dd73-c329-3683-83c7cfef61fa")
public static final String FIELDNAME_PartnerRequests_Invoice="5be588d9-dd73-c329-3683-83c7cfef61fa";

@XendraTrl(Identifier="18d9ab98-0ed1-f7e6-e3b9-10c34fdd0170")
public static String es_PE_FIELD_RequestsSource_Invoice_Name="Factura";

@XendraTrl(Identifier="18d9ab98-0ed1-f7e6-e3b9-10c34fdd0170")
public static String es_PE_FIELD_RequestsSource_Invoice_Description="Identificador de la factura";

@XendraTrl(Identifier="18d9ab98-0ed1-f7e6-e3b9-10c34fdd0170")
public static String es_PE_FIELD_RequestsSource_Invoice_Help="La ID de Factura identifica únicamente un documento de Factura.";

@XendraField(AD_Column_ID="C_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c2cdcdde-0adb-ef52-0a9e-48cf3e306ac6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="18d9ab98-0ed1-f7e6-e3b9-10c34fdd0170")
public static final String FIELDNAME_RequestsSource_Invoice="18d9ab98-0ed1-f7e6-e3b9-10c34fdd0170";

@XendraTrl(Identifier="6846af25-23a6-e80f-5b83-87aaa8fff6c6")
public static String es_PE_FIELD_RequestsSource_Invoice2_Name="Factura";

@XendraTrl(Identifier="6846af25-23a6-e80f-5b83-87aaa8fff6c6")
public static String es_PE_FIELD_RequestsSource_Invoice2_Description="Identificador de la factura";

@XendraTrl(Identifier="6846af25-23a6-e80f-5b83-87aaa8fff6c6")
public static String es_PE_FIELD_RequestsSource_Invoice2_Help="La ID de Factura identifica únicamente un documento de Factura.";

@XendraField(AD_Column_ID="C_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8a4561d7-25be-5533-de4c-ab4735c335ee",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6846af25-23a6-e80f-5b83-87aaa8fff6c6")
public static final String FIELDNAME_RequestsSource_Invoice2="6846af25-23a6-e80f-5b83-87aaa8fff6c6";

@XendraTrl(Identifier="2f3976d1-ad00-eccf-7b36-37ebbd128618")
public static String es_PE_COLUMN_C_Invoice_ID_Name="Factura";

@XendraColumn(AD_Element_ID="e526ea57-1bdf-9871-fd57-0df3c1f9dd42",ColumnName="C_Invoice_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2f3976d1-ad00-eccf-7b36-37ebbd128618",
Synchronized="2019-08-30 22:23:47.0")
/** Column name C_Invoice_ID */
public static final String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
/** Set Request Invoice.
@param C_InvoiceRequest_ID The generated invoice for this request */
public void setC_InvoiceRequest_ID (int C_InvoiceRequest_ID)
{
if (C_InvoiceRequest_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_InvoiceRequest_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_InvoiceRequest_ID, Integer.valueOf(C_InvoiceRequest_ID));
}
/** Get Request Invoice.
@return The generated invoice for this request */
public int getC_InvoiceRequest_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_InvoiceRequest_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="595c7f22-3857-2c15-0a0c-bdff2428269a")
public static String es_PE_FIELD_Request_RequestInvoice_Name="Factura de Solicitud";

@XendraTrl(Identifier="595c7f22-3857-2c15-0a0c-bdff2428269a")
public static String es_PE_FIELD_Request_RequestInvoice_Description="La generación de factura para esta solicitud";

@XendraTrl(Identifier="595c7f22-3857-2c15-0a0c-bdff2428269a")
public static String es_PE_FIELD_Request_RequestInvoice_Help="Opcionalmente la generación de factura para esta solicitud";

@XendraField(AD_Column_ID="C_InvoiceRequest_ID",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=570,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="595c7f22-3857-2c15-0a0c-bdff2428269a")
public static final String FIELDNAME_Request_RequestInvoice="595c7f22-3857-2c15-0a0c-bdff2428269a";

@XendraTrl(Identifier="f988273e-e109-9d04-905d-107c0134f670")
public static String es_PE_FIELD_Request_RequestInvoice2_Name="Factura de Solicitud";

@XendraTrl(Identifier="f988273e-e109-9d04-905d-107c0134f670")
public static String es_PE_FIELD_Request_RequestInvoice2_Description="La generación de factura para esta solicitud";

@XendraTrl(Identifier="f988273e-e109-9d04-905d-107c0134f670")
public static String es_PE_FIELD_Request_RequestInvoice2_Help="Opcionalmente la generación de factura para esta solicitud";

@XendraField(AD_Column_ID="C_InvoiceRequest_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a6082d0b-507b-9bdf-147b-9db501402eae",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=510,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f988273e-e109-9d04-905d-107c0134f670")
public static final String FIELDNAME_Request_RequestInvoice2="f988273e-e109-9d04-905d-107c0134f670";

@XendraTrl(Identifier="2fbaef70-4668-c096-482f-da42db559630")
public static String es_PE_FIELD_PartnerRequests_RequestInvoice_Name="Factura de Solicitud";

@XendraTrl(Identifier="2fbaef70-4668-c096-482f-da42db559630")
public static String es_PE_FIELD_PartnerRequests_RequestInvoice_Description="La generación de factura para esta solicitud";

@XendraTrl(Identifier="2fbaef70-4668-c096-482f-da42db559630")
public static String es_PE_FIELD_PartnerRequests_RequestInvoice_Help="Opcionalmente la generación de factura para esta solicitud";

@XendraField(AD_Column_ID="C_InvoiceRequest_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a25fb60-7718-c6c9-b67f-7adeb07cfa19",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2fbaef70-4668-c096-482f-da42db559630")
public static final String FIELDNAME_PartnerRequests_RequestInvoice="2fbaef70-4668-c096-482f-da42db559630";

@XendraTrl(Identifier="3399d7e1-0286-5c1c-91ec-415f479a8a70")
public static String es_PE_FIELD_RequestsSource_RequestInvoice_Name="Factura de Solicitud";

@XendraTrl(Identifier="3399d7e1-0286-5c1c-91ec-415f479a8a70")
public static String es_PE_FIELD_RequestsSource_RequestInvoice_Description="La generación de factura para esta solicitud";

@XendraTrl(Identifier="3399d7e1-0286-5c1c-91ec-415f479a8a70")
public static String es_PE_FIELD_RequestsSource_RequestInvoice_Help="Opcionalmente la generación de factura para esta solicitud";

@XendraField(AD_Column_ID="C_InvoiceRequest_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c2cdcdde-0adb-ef52-0a9e-48cf3e306ac6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3399d7e1-0286-5c1c-91ec-415f479a8a70")
public static final String FIELDNAME_RequestsSource_RequestInvoice="3399d7e1-0286-5c1c-91ec-415f479a8a70";

@XendraTrl(Identifier="83879a80-4a60-1035-3b27-981e0e2f2fe4")
public static String es_PE_FIELD_RequestsSource_RequestInvoice2_Name="Factura de Solicitud";

@XendraTrl(Identifier="83879a80-4a60-1035-3b27-981e0e2f2fe4")
public static String es_PE_FIELD_RequestsSource_RequestInvoice2_Description="La generación de factura para esta solicitud";

@XendraTrl(Identifier="83879a80-4a60-1035-3b27-981e0e2f2fe4")
public static String es_PE_FIELD_RequestsSource_RequestInvoice2_Help="Opcionalmente la generación de factura para esta solicitud";

@XendraField(AD_Column_ID="C_InvoiceRequest_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8a4561d7-25be-5533-de4c-ab4735c335ee",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="83879a80-4a60-1035-3b27-981e0e2f2fe4")
public static final String FIELDNAME_RequestsSource_RequestInvoice2="83879a80-4a60-1035-3b27-981e0e2f2fe4";

@XendraTrl(Identifier="bd716c58-f59d-0c1d-c40b-e7f177073a77")
public static String es_PE_COLUMN_C_InvoiceRequest_ID_Name="Factura de Solicitud";

@XendraColumn(AD_Element_ID="7bc530c0-32b0-87da-7b54-87748df44461",
ColumnName="C_InvoiceRequest_ID",AD_Reference_ID=30,
AD_Reference_Value_ID="7fd6a4ea-911e-151b-68bf-3a86cc5f06e3",AD_Val_Rule_ID="",FieldLength=10,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="bd716c58-f59d-0c1d-c40b-e7f177073a77",
Synchronized="2019-08-30 22:23:47.0")
/** Column name C_InvoiceRequest_ID */
public static final String COLUMNNAME_C_InvoiceRequest_ID = "C_InvoiceRequest_ID";
/** Set Close Date.
@param CloseDate Close Date */
public void setCloseDate (Timestamp CloseDate)
{
set_Value (COLUMNNAME_CloseDate, CloseDate);
}
/** Get Close Date.
@return Close Date */
public Timestamp getCloseDate() 
{
return (Timestamp)get_Value(COLUMNNAME_CloseDate);
}

@XendraTrl(Identifier="8f035497-bacc-697b-4417-2442b17b00ac")
public static String es_PE_FIELD_Request_CloseDate_Name="Fecha de Cierre";

@XendraTrl(Identifier="8f035497-bacc-697b-4417-2442b17b00ac")
public static String es_PE_FIELD_Request_CloseDate_Description="Fecha de Cierre";

@XendraTrl(Identifier="8f035497-bacc-697b-4417-2442b17b00ac")
public static String es_PE_FIELD_Request_CloseDate_Help="La fecha del comienzo indica la fecha pasada ó final.";

@XendraField(AD_Column_ID="CloseDate",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=340,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8f035497-bacc-697b-4417-2442b17b00ac")
public static final String FIELDNAME_Request_CloseDate="8f035497-bacc-697b-4417-2442b17b00ac";

@XendraTrl(Identifier="48bd441d-eff7-3d48-70f7-b9760f62b8b0")
public static String es_PE_FIELD_Request_CloseDate2_Name="Fecha de Cierre";

@XendraTrl(Identifier="48bd441d-eff7-3d48-70f7-b9760f62b8b0")
public static String es_PE_FIELD_Request_CloseDate2_Description="Fecha de Cierre";

@XendraTrl(Identifier="48bd441d-eff7-3d48-70f7-b9760f62b8b0")
public static String es_PE_FIELD_Request_CloseDate2_Help="La fecha del comienzo indica la fecha pasada ó final.";

@XendraField(AD_Column_ID="CloseDate",IsCentrallyMaintained=true,
AD_Tab_ID="a6082d0b-507b-9bdf-147b-9db501402eae",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=520,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="48bd441d-eff7-3d48-70f7-b9760f62b8b0")
public static final String FIELDNAME_Request_CloseDate2="48bd441d-eff7-3d48-70f7-b9760f62b8b0";

@XendraTrl(Identifier="c42a4df6-5466-c1da-d945-b675f496fdc7")
public static String es_PE_FIELD_PartnerRequests_CloseDate_Name="Fecha de Cierre";

@XendraTrl(Identifier="c42a4df6-5466-c1da-d945-b675f496fdc7")
public static String es_PE_FIELD_PartnerRequests_CloseDate_Description="Fecha de Cierre";

@XendraTrl(Identifier="c42a4df6-5466-c1da-d945-b675f496fdc7")
public static String es_PE_FIELD_PartnerRequests_CloseDate_Help="La fecha del comienzo indica la fecha pasada ó final.";

@XendraField(AD_Column_ID="CloseDate",IsCentrallyMaintained=true,
AD_Tab_ID="0a25fb60-7718-c6c9-b67f-7adeb07cfa19",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c42a4df6-5466-c1da-d945-b675f496fdc7")
public static final String FIELDNAME_PartnerRequests_CloseDate="c42a4df6-5466-c1da-d945-b675f496fdc7";

@XendraTrl(Identifier="c6e9adfd-e468-fba6-1eac-48539cf0f37c")
public static String es_PE_FIELD_RequestsSource_CloseDate_Name="Fecha de Cierre";

@XendraTrl(Identifier="c6e9adfd-e468-fba6-1eac-48539cf0f37c")
public static String es_PE_FIELD_RequestsSource_CloseDate_Description="Fecha de Cierre";

@XendraTrl(Identifier="c6e9adfd-e468-fba6-1eac-48539cf0f37c")
public static String es_PE_FIELD_RequestsSource_CloseDate_Help="La fecha del comienzo indica la fecha pasada ó final.";

@XendraField(AD_Column_ID="CloseDate",IsCentrallyMaintained=true,
AD_Tab_ID="c2cdcdde-0adb-ef52-0a9e-48cf3e306ac6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c6e9adfd-e468-fba6-1eac-48539cf0f37c")
public static final String FIELDNAME_RequestsSource_CloseDate="c6e9adfd-e468-fba6-1eac-48539cf0f37c";

@XendraTrl(Identifier="692b7313-e6bf-9eb7-d49d-e7d4b2b605a1")
public static String es_PE_FIELD_RequestsSource_CloseDate2_Name="Fecha de Cierre";

@XendraTrl(Identifier="692b7313-e6bf-9eb7-d49d-e7d4b2b605a1")
public static String es_PE_FIELD_RequestsSource_CloseDate2_Description="Fecha de Cierre";

@XendraTrl(Identifier="692b7313-e6bf-9eb7-d49d-e7d4b2b605a1")
public static String es_PE_FIELD_RequestsSource_CloseDate2_Help="La fecha del comienzo indica la fecha pasada ó final.";

@XendraField(AD_Column_ID="CloseDate",IsCentrallyMaintained=true,
AD_Tab_ID="8a4561d7-25be-5533-de4c-ab4735c335ee",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="692b7313-e6bf-9eb7-d49d-e7d4b2b605a1")
public static final String FIELDNAME_RequestsSource_CloseDate2="692b7313-e6bf-9eb7-d49d-e7d4b2b605a1";

@XendraTrl(Identifier="17460bcc-3abb-41b7-efc3-c96a2b82c0e7")
public static String es_PE_COLUMN_CloseDate_Name="Fecha de Cierre";

@XendraColumn(AD_Element_ID="a7374e0f-6768-2ba2-9de8-8f4be46f4473",ColumnName="CloseDate",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="17460bcc-3abb-41b7-efc3-c96a2b82c0e7",
Synchronized="2019-08-30 22:23:47.0")
/** Column name CloseDate */
public static final String COLUMNNAME_CloseDate = "CloseDate";
/** Set Confidentiality.
@param ConfidentialType Type of Confidentiality */
public void setConfidentialType (String ConfidentialType)
{
if (ConfidentialType.length() > 1)
{
log.warning("Length > 1 - truncated");
ConfidentialType = ConfidentialType.substring(0,0);
}
set_Value (COLUMNNAME_ConfidentialType, ConfidentialType);
}
/** Get Confidentiality.
@return Type of Confidentiality */
public String getConfidentialType() 
{
return (String)get_Value(COLUMNNAME_ConfidentialType);
}

@XendraTrl(Identifier="9d821c88-ebdd-6bc6-41a0-1eb64ac749c9")
public static String es_PE_FIELD_Request_Confidentiality_Name="Confidencialidad";

@XendraTrl(Identifier="9d821c88-ebdd-6bc6-41a0-1eb64ac749c9")
public static String es_PE_FIELD_Request_Confidentiality_Description="Tipo de Confidencialidad";

@XendraField(AD_Column_ID="ConfidentialType",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9d821c88-ebdd-6bc6-41a0-1eb64ac749c9")
public static final String FIELDNAME_Request_Confidentiality="9d821c88-ebdd-6bc6-41a0-1eb64ac749c9";

@XendraTrl(Identifier="a9ce483a-c82f-16a4-18a6-e7f9610df347")
public static String es_PE_FIELD_Request_Confidentiality2_Name="Confidencialidad";

@XendraTrl(Identifier="a9ce483a-c82f-16a4-18a6-e7f9610df347")
public static String es_PE_FIELD_Request_Confidentiality2_Description="Tipo de Confidencialidad";

@XendraField(AD_Column_ID="ConfidentialType",IsCentrallyMaintained=true,
AD_Tab_ID="a6082d0b-507b-9bdf-147b-9db501402eae",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a9ce483a-c82f-16a4-18a6-e7f9610df347")
public static final String FIELDNAME_Request_Confidentiality2="a9ce483a-c82f-16a4-18a6-e7f9610df347";

@XendraTrl(Identifier="47886225-cc6a-f805-5070-2ca93c25f5ad")
public static String es_PE_FIELD_PartnerRequests_Confidentiality_Name="Confidencialidad";

@XendraTrl(Identifier="47886225-cc6a-f805-5070-2ca93c25f5ad")
public static String es_PE_FIELD_PartnerRequests_Confidentiality_Description="Tipo de Confidencialidad";

@XendraField(AD_Column_ID="ConfidentialType",IsCentrallyMaintained=true,
AD_Tab_ID="0a25fb60-7718-c6c9-b67f-7adeb07cfa19",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="47886225-cc6a-f805-5070-2ca93c25f5ad")
public static final String FIELDNAME_PartnerRequests_Confidentiality="47886225-cc6a-f805-5070-2ca93c25f5ad";

@XendraTrl(Identifier="12ee4a5c-fb97-8ff2-3619-455b0f02170c")
public static String es_PE_FIELD_RequestsSource_Confidentiality_Name="Confidencialidad";

@XendraTrl(Identifier="12ee4a5c-fb97-8ff2-3619-455b0f02170c")
public static String es_PE_FIELD_RequestsSource_Confidentiality_Description="Tipo de Confidencialidad";

@XendraField(AD_Column_ID="ConfidentialType",IsCentrallyMaintained=true,
AD_Tab_ID="c2cdcdde-0adb-ef52-0a9e-48cf3e306ac6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="12ee4a5c-fb97-8ff2-3619-455b0f02170c")
public static final String FIELDNAME_RequestsSource_Confidentiality="12ee4a5c-fb97-8ff2-3619-455b0f02170c";

@XendraTrl(Identifier="5711eb2c-63c0-5967-1ee2-e2f3e7e377e1")
public static String es_PE_FIELD_RequestsSource_Confidentiality2_Name="Confidencialidad";

@XendraTrl(Identifier="5711eb2c-63c0-5967-1ee2-e2f3e7e377e1")
public static String es_PE_FIELD_RequestsSource_Confidentiality2_Description="Tipo de Confidencialidad";

@XendraField(AD_Column_ID="ConfidentialType",IsCentrallyMaintained=true,
AD_Tab_ID="8a4561d7-25be-5533-de4c-ab4735c335ee",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5711eb2c-63c0-5967-1ee2-e2f3e7e377e1")
public static final String FIELDNAME_RequestsSource_Confidentiality2="5711eb2c-63c0-5967-1ee2-e2f3e7e377e1";

@XendraTrl(Identifier="cb4fe494-92b7-dfe9-8a7e-53f67ae7e9b1")
public static String es_PE_COLUMN_ConfidentialType_Name="Confidencialidad";

@XendraColumn(AD_Element_ID="24d269bf-542a-eb9e-b244-feea486dfc6b",ColumnName="ConfidentialType",
AD_Reference_ID=17,AD_Reference_Value_ID="af038e49-9eea-4e1c-da39-e6d987a12111",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="C",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="cb4fe494-92b7-dfe9-8a7e-53f67ae7e9b1",Synchronized="2019-08-30 22:23:47.0")
/** Column name ConfidentialType */
public static final String COLUMNNAME_ConfidentialType = "ConfidentialType";
/** Set Entry Confidentiality.
@param ConfidentialTypeEntry Confidentiality of the individual entry */
public void setConfidentialTypeEntry (String ConfidentialTypeEntry)
{
if (ConfidentialTypeEntry.length() > 1)
{
log.warning("Length > 1 - truncated");
ConfidentialTypeEntry = ConfidentialTypeEntry.substring(0,0);
}
set_Value (COLUMNNAME_ConfidentialTypeEntry, ConfidentialTypeEntry);
}
/** Get Entry Confidentiality.
@return Confidentiality of the individual entry */
public String getConfidentialTypeEntry() 
{
return (String)get_Value(COLUMNNAME_ConfidentialTypeEntry);
}

@XendraTrl(Identifier="8613c81a-d2bc-3773-9040-d5b0849c69bc")
public static String es_PE_FIELD_Request_EntryConfidentiality_Name="Entrada Confidencial";

@XendraTrl(Identifier="8613c81a-d2bc-3773-9040-d5b0849c69bc")
public static String es_PE_FIELD_Request_EntryConfidentiality_Description="Secreto de la entrada individual.";

@XendraField(AD_Column_ID="ConfidentialTypeEntry",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="Action",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8613c81a-d2bc-3773-9040-d5b0849c69bc")
public static final String FIELDNAME_Request_EntryConfidentiality="8613c81a-d2bc-3773-9040-d5b0849c69bc";

@XendraTrl(Identifier="6a5dac32-c561-5e1a-df71-6c2065e9c31b")
public static String es_PE_FIELD_Request_EntryConfidentiality2_Name="Entrada Confidencial";

@XendraTrl(Identifier="6a5dac32-c561-5e1a-df71-6c2065e9c31b")
public static String es_PE_FIELD_Request_EntryConfidentiality2_Description="Secreto de la entrada individual.";

@XendraField(AD_Column_ID="ConfidentialTypeEntry",IsCentrallyMaintained=true,
AD_Tab_ID="a6082d0b-507b-9bdf-147b-9db501402eae",AD_FieldGroup_ID="Action",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6a5dac32-c561-5e1a-df71-6c2065e9c31b")
public static final String FIELDNAME_Request_EntryConfidentiality2="6a5dac32-c561-5e1a-df71-6c2065e9c31b";

@XendraTrl(Identifier="bdca77d9-c7bd-ced3-5d8f-ee0a1ed67cab")
public static String es_PE_FIELD_PartnerRequests_EntryConfidentiality_Name="Entrada Confidencial";

@XendraTrl(Identifier="bdca77d9-c7bd-ced3-5d8f-ee0a1ed67cab")
public static String es_PE_FIELD_PartnerRequests_EntryConfidentiality_Description="Secreto de la entrada individual.";

@XendraField(AD_Column_ID="ConfidentialTypeEntry",IsCentrallyMaintained=true,
AD_Tab_ID="0a25fb60-7718-c6c9-b67f-7adeb07cfa19",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bdca77d9-c7bd-ced3-5d8f-ee0a1ed67cab")
public static final String FIELDNAME_PartnerRequests_EntryConfidentiality="bdca77d9-c7bd-ced3-5d8f-ee0a1ed67cab";

@XendraTrl(Identifier="1fb70aed-9564-e6dc-42fe-ff69d569bb88")
public static String es_PE_FIELD_RequestsSource_EntryConfidentiality_Name="Entrada Confidencial";

@XendraTrl(Identifier="1fb70aed-9564-e6dc-42fe-ff69d569bb88")
public static String es_PE_FIELD_RequestsSource_EntryConfidentiality_Description="Secreto de la entrada individual.";

@XendraField(AD_Column_ID="ConfidentialTypeEntry",IsCentrallyMaintained=true,
AD_Tab_ID="c2cdcdde-0adb-ef52-0a9e-48cf3e306ac6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1fb70aed-9564-e6dc-42fe-ff69d569bb88")
public static final String FIELDNAME_RequestsSource_EntryConfidentiality="1fb70aed-9564-e6dc-42fe-ff69d569bb88";

@XendraTrl(Identifier="8a7338a3-7643-052b-f8f9-452c9ec8a423")
public static String es_PE_FIELD_RequestsSource_EntryConfidentiality2_Name="Entrada Confidencial";

@XendraTrl(Identifier="8a7338a3-7643-052b-f8f9-452c9ec8a423")
public static String es_PE_FIELD_RequestsSource_EntryConfidentiality2_Description="Secreto de la entrada individual.";

@XendraField(AD_Column_ID="ConfidentialTypeEntry",IsCentrallyMaintained=true,
AD_Tab_ID="8a4561d7-25be-5533-de4c-ab4735c335ee",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8a7338a3-7643-052b-f8f9-452c9ec8a423")
public static final String FIELDNAME_RequestsSource_EntryConfidentiality2="8a7338a3-7643-052b-f8f9-452c9ec8a423";

@XendraTrl(Identifier="cbaf6e3d-4b82-9d99-06ac-8673df351b43")
public static String es_PE_COLUMN_ConfidentialTypeEntry_Name="Entrada Confidencial";

@XendraColumn(AD_Element_ID="0d53f707-2248-2b4a-3bb1-4131a1238dfd",
ColumnName="ConfidentialTypeEntry",AD_Reference_ID=17,
AD_Reference_Value_ID="af038e49-9eea-4e1c-da39-e6d987a12111",AD_Val_Rule_ID="",FieldLength=1,
DefaultValue="C",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="cbaf6e3d-4b82-9d99-06ac-8673df351b43",
Synchronized="2019-08-30 22:23:47.0")
/** Column name ConfidentialTypeEntry */
public static final String COLUMNNAME_ConfidentialTypeEntry = "ConfidentialTypeEntry";
/** Set Order.
@param C_Order_ID Order */
public void setC_Order_ID (int C_Order_ID)
{
if (C_Order_ID <= 0) set_Value (COLUMNNAME_C_Order_ID, null);
 else 
set_Value (COLUMNNAME_C_Order_ID, Integer.valueOf(C_Order_ID));
}
/** Get Order.
@return Order */
public int getC_Order_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Order_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="376d11e3-84aa-cf0c-e058-86771458db84")
public static String es_PE_FIELD_Request_Order_Name="Orden de Venta";

@XendraTrl(Identifier="376d11e3-84aa-cf0c-e058-86771458db84")
public static String es_PE_FIELD_Request_Order_Description="Orden de Venta";

@XendraTrl(Identifier="376d11e3-84aa-cf0c-e058-86771458db84")
public static String es_PE_FIELD_Request_Order_Help="La ID de la orden de ventas es un identificador único de la orden de ventas; Ésta es controlada por la secuencia del documento para este tipo de documento.";

@XendraField(AD_Column_ID="C_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=390,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="376d11e3-84aa-cf0c-e058-86771458db84")
public static final String FIELDNAME_Request_Order="376d11e3-84aa-cf0c-e058-86771458db84";

@XendraTrl(Identifier="5807467f-c385-8dd2-47d1-ea334b799622")
public static String es_PE_FIELD_Request_Order2_Name="Orden de Venta";

@XendraTrl(Identifier="5807467f-c385-8dd2-47d1-ea334b799622")
public static String es_PE_FIELD_Request_Order2_Description="Orden de Venta";

@XendraTrl(Identifier="5807467f-c385-8dd2-47d1-ea334b799622")
public static String es_PE_FIELD_Request_Order2_Help="La ID de la orden de ventas es un identificador único de la orden de ventas; Ésta es controlada por la secuencia del documento para este tipo de documento.";

@XendraField(AD_Column_ID="C_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a6082d0b-507b-9bdf-147b-9db501402eae",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=330,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5807467f-c385-8dd2-47d1-ea334b799622")
public static final String FIELDNAME_Request_Order2="5807467f-c385-8dd2-47d1-ea334b799622";

@XendraTrl(Identifier="10dd8ec6-a8da-2034-bff2-44e5313c237b")
public static String es_PE_FIELD_PartnerRequests_Order_Name="Orden de Venta";

@XendraTrl(Identifier="10dd8ec6-a8da-2034-bff2-44e5313c237b")
public static String es_PE_FIELD_PartnerRequests_Order_Description="Orden de Venta";

@XendraTrl(Identifier="10dd8ec6-a8da-2034-bff2-44e5313c237b")
public static String es_PE_FIELD_PartnerRequests_Order_Help="La ID de la orden de ventas es un identificador único de la orden de ventas; Ésta es controlada por la secuencia del documento para este tipo de documento.";

@XendraField(AD_Column_ID="C_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a25fb60-7718-c6c9-b67f-7adeb07cfa19",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="10dd8ec6-a8da-2034-bff2-44e5313c237b")
public static final String FIELDNAME_PartnerRequests_Order="10dd8ec6-a8da-2034-bff2-44e5313c237b";

@XendraTrl(Identifier="64c5a7c5-f7d0-ea4f-719a-cb1dbaa9c37f")
public static String es_PE_FIELD_RequestsSource_Order_Name="Orden de Venta";

@XendraTrl(Identifier="64c5a7c5-f7d0-ea4f-719a-cb1dbaa9c37f")
public static String es_PE_FIELD_RequestsSource_Order_Description="Orden de Venta";

@XendraTrl(Identifier="64c5a7c5-f7d0-ea4f-719a-cb1dbaa9c37f")
public static String es_PE_FIELD_RequestsSource_Order_Help="La ID de la orden de ventas es un identificador único de la orden de ventas; Ésta es controlada por la secuencia del documento para este tipo de documento.";

@XendraField(AD_Column_ID="C_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c2cdcdde-0adb-ef52-0a9e-48cf3e306ac6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="64c5a7c5-f7d0-ea4f-719a-cb1dbaa9c37f")
public static final String FIELDNAME_RequestsSource_Order="64c5a7c5-f7d0-ea4f-719a-cb1dbaa9c37f";

@XendraTrl(Identifier="a7ab8fa6-bcd9-9fcb-8aa9-fb810b74f4ed")
public static String es_PE_FIELD_RequestsSource_Order2_Name="Orden de Venta";

@XendraTrl(Identifier="a7ab8fa6-bcd9-9fcb-8aa9-fb810b74f4ed")
public static String es_PE_FIELD_RequestsSource_Order2_Description="Orden de Venta";

@XendraTrl(Identifier="a7ab8fa6-bcd9-9fcb-8aa9-fb810b74f4ed")
public static String es_PE_FIELD_RequestsSource_Order2_Help="La ID de la orden de ventas es un identificador único de la orden de ventas; Ésta es controlada por la secuencia del documento para este tipo de documento.";

@XendraField(AD_Column_ID="C_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8a4561d7-25be-5533-de4c-ab4735c335ee",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a7ab8fa6-bcd9-9fcb-8aa9-fb810b74f4ed")
public static final String FIELDNAME_RequestsSource_Order2="a7ab8fa6-bcd9-9fcb-8aa9-fb810b74f4ed";

@XendraTrl(Identifier="83189282-fc6c-4ff8-efa9-4f68ae1be36f")
public static String es_PE_COLUMN_C_Order_ID_Name="Orden de Venta";

@XendraColumn(AD_Element_ID="cc846c60-90b8-6aad-9d07-b5d0c0328787",ColumnName="C_Order_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="83189282-fc6c-4ff8-efa9-4f68ae1be36f",
Synchronized="2019-08-30 22:23:47.0")
/** Column name C_Order_ID */
public static final String COLUMNNAME_C_Order_ID = "C_Order_ID";
/** Set Payment.
@param C_Payment_ID Payment identifier */
public void setC_Payment_ID (int C_Payment_ID)
{
if (C_Payment_ID <= 0) set_Value (COLUMNNAME_C_Payment_ID, null);
 else 
set_Value (COLUMNNAME_C_Payment_ID, Integer.valueOf(C_Payment_ID));
}
/** Get Payment.
@return Payment identifier */
public int getC_Payment_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Payment_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="45b821e7-0dcd-e16f-c715-ed709879a58d")
public static String es_PE_FIELD_Request_Payment_Name="Pago";

@XendraTrl(Identifier="45b821e7-0dcd-e16f-c715-ed709879a58d")
public static String es_PE_FIELD_Request_Payment_Description="Identificador del pago";

@XendraTrl(Identifier="45b821e7-0dcd-e16f-c715-ed709879a58d")
public static String es_PE_FIELD_Request_Payment_Help="El pago es un identificador único de este pago.";

@XendraField(AD_Column_ID="C_Payment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=420,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="45b821e7-0dcd-e16f-c715-ed709879a58d")
public static final String FIELDNAME_Request_Payment="45b821e7-0dcd-e16f-c715-ed709879a58d";

@XendraTrl(Identifier="b59edb66-6414-da34-561e-b84b2e86a06b")
public static String es_PE_FIELD_Request_Payment2_Name="Pago";

@XendraTrl(Identifier="b59edb66-6414-da34-561e-b84b2e86a06b")
public static String es_PE_FIELD_Request_Payment2_Description="Identificador del pago";

@XendraTrl(Identifier="b59edb66-6414-da34-561e-b84b2e86a06b")
public static String es_PE_FIELD_Request_Payment2_Help="El pago es un identificador único de este pago.";

@XendraField(AD_Column_ID="C_Payment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a6082d0b-507b-9bdf-147b-9db501402eae",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=360,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b59edb66-6414-da34-561e-b84b2e86a06b")
public static final String FIELDNAME_Request_Payment2="b59edb66-6414-da34-561e-b84b2e86a06b";

@XendraTrl(Identifier="291f6efe-7cd3-1358-fe7a-70feb6fe5150")
public static String es_PE_FIELD_PartnerRequests_Payment_Name="Pago";

@XendraTrl(Identifier="291f6efe-7cd3-1358-fe7a-70feb6fe5150")
public static String es_PE_FIELD_PartnerRequests_Payment_Description="Identificador del pago";

@XendraTrl(Identifier="291f6efe-7cd3-1358-fe7a-70feb6fe5150")
public static String es_PE_FIELD_PartnerRequests_Payment_Help="El pago es un identificador único de este pago.";

@XendraField(AD_Column_ID="C_Payment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a25fb60-7718-c6c9-b67f-7adeb07cfa19",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="291f6efe-7cd3-1358-fe7a-70feb6fe5150")
public static final String FIELDNAME_PartnerRequests_Payment="291f6efe-7cd3-1358-fe7a-70feb6fe5150";

@XendraTrl(Identifier="ad4481ab-56e8-e247-e268-a42ea62f6062")
public static String es_PE_FIELD_RequestsSource_Payment_Name="Pago";

@XendraTrl(Identifier="ad4481ab-56e8-e247-e268-a42ea62f6062")
public static String es_PE_FIELD_RequestsSource_Payment_Description="Identificador del pago";

@XendraTrl(Identifier="ad4481ab-56e8-e247-e268-a42ea62f6062")
public static String es_PE_FIELD_RequestsSource_Payment_Help="El pago es un identificador único de este pago.";

@XendraField(AD_Column_ID="C_Payment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c2cdcdde-0adb-ef52-0a9e-48cf3e306ac6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ad4481ab-56e8-e247-e268-a42ea62f6062")
public static final String FIELDNAME_RequestsSource_Payment="ad4481ab-56e8-e247-e268-a42ea62f6062";

@XendraTrl(Identifier="20c357a8-9d13-60a9-3636-7b913f9a78bc")
public static String es_PE_FIELD_RequestsSource_Payment2_Name="Pago";

@XendraTrl(Identifier="20c357a8-9d13-60a9-3636-7b913f9a78bc")
public static String es_PE_FIELD_RequestsSource_Payment2_Description="Identificador del pago";

@XendraTrl(Identifier="20c357a8-9d13-60a9-3636-7b913f9a78bc")
public static String es_PE_FIELD_RequestsSource_Payment2_Help="El pago es un identificador único de este pago.";

@XendraField(AD_Column_ID="C_Payment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8a4561d7-25be-5533-de4c-ab4735c335ee",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="20c357a8-9d13-60a9-3636-7b913f9a78bc")
public static final String FIELDNAME_RequestsSource_Payment2="20c357a8-9d13-60a9-3636-7b913f9a78bc";

@XendraTrl(Identifier="1a05e590-88c1-6d89-be07-da0916b6f8f7")
public static String es_PE_COLUMN_C_Payment_ID_Name="Pago";

@XendraColumn(AD_Element_ID="3ded5658-968e-94c5-207b-eed6f6a7bb43",ColumnName="C_Payment_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1a05e590-88c1-6d89-be07-da0916b6f8f7",
Synchronized="2019-08-30 22:23:47.0")
/** Column name C_Payment_ID */
public static final String COLUMNNAME_C_Payment_ID = "C_Payment_ID";
/** Set Project.
@param C_Project_ID Financial Project */
public void setC_Project_ID (int C_Project_ID)
{
if (C_Project_ID <= 0) set_Value (COLUMNNAME_C_Project_ID, null);
 else 
set_Value (COLUMNNAME_C_Project_ID, Integer.valueOf(C_Project_ID));
}
/** Get Project.
@return Financial Project */
public int getC_Project_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Project_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="80c2d195-771c-2b89-fbf7-bec52e5cf795")
public static String es_PE_FIELD_Request_Project_Name="Proyecto";

@XendraTrl(Identifier="80c2d195-771c-2b89-fbf7-bec52e5cf795")
public static String es_PE_FIELD_Request_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="80c2d195-771c-2b89-fbf7-bec52e5cf795")
public static String es_PE_FIELD_Request_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=370,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="80c2d195-771c-2b89-fbf7-bec52e5cf795")
public static final String FIELDNAME_Request_Project="80c2d195-771c-2b89-fbf7-bec52e5cf795";

@XendraTrl(Identifier="5c54f225-0e4f-b207-24bd-fe15fbd14542")
public static String es_PE_FIELD_Request_Project2_Name="Proyecto";

@XendraTrl(Identifier="5c54f225-0e4f-b207-24bd-fe15fbd14542")
public static String es_PE_FIELD_Request_Project2_Description="Identifica un proyecto único";

@XendraTrl(Identifier="5c54f225-0e4f-b207-24bd-fe15fbd14542")
public static String es_PE_FIELD_Request_Project2_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a6082d0b-507b-9bdf-147b-9db501402eae",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=310,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5c54f225-0e4f-b207-24bd-fe15fbd14542")
public static final String FIELDNAME_Request_Project2="5c54f225-0e4f-b207-24bd-fe15fbd14542";

@XendraTrl(Identifier="51a225e5-e404-abe5-84ac-8b5f4fca841f")
public static String es_PE_FIELD_PartnerRequests_Project_Name="Proyecto";

@XendraTrl(Identifier="51a225e5-e404-abe5-84ac-8b5f4fca841f")
public static String es_PE_FIELD_PartnerRequests_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="51a225e5-e404-abe5-84ac-8b5f4fca841f")
public static String es_PE_FIELD_PartnerRequests_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a25fb60-7718-c6c9-b67f-7adeb07cfa19",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="51a225e5-e404-abe5-84ac-8b5f4fca841f")
public static final String FIELDNAME_PartnerRequests_Project="51a225e5-e404-abe5-84ac-8b5f4fca841f";

@XendraTrl(Identifier="fe023ce0-b88a-d939-6906-4b71f0d86de3")
public static String es_PE_FIELD_RequestsSource_Project_Name="Proyecto";

@XendraTrl(Identifier="fe023ce0-b88a-d939-6906-4b71f0d86de3")
public static String es_PE_FIELD_RequestsSource_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="fe023ce0-b88a-d939-6906-4b71f0d86de3")
public static String es_PE_FIELD_RequestsSource_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c2cdcdde-0adb-ef52-0a9e-48cf3e306ac6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fe023ce0-b88a-d939-6906-4b71f0d86de3")
public static final String FIELDNAME_RequestsSource_Project="fe023ce0-b88a-d939-6906-4b71f0d86de3";

@XendraTrl(Identifier="b225301f-7fa1-257c-4569-e519fd8787c3")
public static String es_PE_FIELD_RequestsSource_Project2_Name="Proyecto";

@XendraTrl(Identifier="b225301f-7fa1-257c-4569-e519fd8787c3")
public static String es_PE_FIELD_RequestsSource_Project2_Description="Identifica un proyecto único";

@XendraTrl(Identifier="b225301f-7fa1-257c-4569-e519fd8787c3")
public static String es_PE_FIELD_RequestsSource_Project2_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8a4561d7-25be-5533-de4c-ab4735c335ee",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b225301f-7fa1-257c-4569-e519fd8787c3")
public static final String FIELDNAME_RequestsSource_Project2="b225301f-7fa1-257c-4569-e519fd8787c3";

@XendraTrl(Identifier="ba92d3d1-cff3-41d4-cf9d-972c07a14b9d")
public static String es_PE_COLUMN_C_Project_ID_Name="Proyecto";

@XendraColumn(AD_Element_ID="16ff5dcc-9178-73dd-e618-e88bd79d573b",ColumnName="C_Project_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ba92d3d1-cff3-41d4-cf9d-972c07a14b9d",
Synchronized="2019-08-30 22:23:47.0")
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

@XendraTrl(Identifier="c3f8540e-37a4-1053-f040-516d4f9f1ead")
public static String es_PE_FIELD_Request_CompletePlan_Name="Completar Plan";

@XendraTrl(Identifier="c3f8540e-37a4-1053-f040-516d4f9f1ead")
public static String es_PE_FIELD_Request_CompletePlan_Description="Fecha Planeada de TerminaPlanned Completion Date";

@XendraTrl(Identifier="c3f8540e-37a4-1053-f040-516d4f9f1ead")
public static String es_PE_FIELD_Request_CompletePlan_Help="Date when the task is planned to be complete";

@XendraField(AD_Column_ID="DateCompletePlan",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=7,IsReadOnly=false,SeqNo=320,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c3f8540e-37a4-1053-f040-516d4f9f1ead")
public static final String FIELDNAME_Request_CompletePlan="c3f8540e-37a4-1053-f040-516d4f9f1ead";

@XendraTrl(Identifier="692cd549-28bf-882f-6c4d-0aebefbf7527")
public static String es_PE_COLUMN_DateCompletePlan_Name="Completar Plan";

@XendraColumn(AD_Element_ID="b96552a6-b794-1ec5-b0cc-eef557310317",ColumnName="DateCompletePlan",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="692cd549-28bf-882f-6c4d-0aebefbf7527",
Synchronized="2019-08-30 22:23:47.0")
/** Column name DateCompletePlan */
public static final String COLUMNNAME_DateCompletePlan = "DateCompletePlan";
/** Set Date last action.
@param DateLastAction Date this request was last acted on */
public void setDateLastAction (Timestamp DateLastAction)
{
set_ValueNoCheck (COLUMNNAME_DateLastAction, DateLastAction);
}
/** Get Date last action.
@return Date this request was last acted on */
public Timestamp getDateLastAction() 
{
return (Timestamp)get_Value(COLUMNNAME_DateLastAction);
}

@XendraTrl(Identifier="8b8c3177-5fe3-022f-55e5-d32f5e23f119")
public static String es_PE_FIELD_Request_DateLastAction_Name="Fecha de Última Acción";

@XendraTrl(Identifier="8b8c3177-5fe3-022f-55e5-d32f5e23f119")
public static String es_PE_FIELD_Request_DateLastAction_Description="Fecha en que este requerimiento fue accionado por última vez.";

@XendraTrl(Identifier="8b8c3177-5fe3-022f-55e5-d32f5e23f119")
public static String es_PE_FIELD_Request_DateLastAction_Help="La fecha de última acción indica la última vez que el requerimiento fué accionado.";

@XendraField(AD_Column_ID="DateLastAction",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="History",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=490,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8b8c3177-5fe3-022f-55e5-d32f5e23f119")
public static final String FIELDNAME_Request_DateLastAction="8b8c3177-5fe3-022f-55e5-d32f5e23f119";

@XendraTrl(Identifier="047d4a30-fae7-af09-9c8f-58cd59c768d7")
public static String es_PE_FIELD_Request_DateLastAction2_Name="Fecha de Última Acción";

@XendraTrl(Identifier="047d4a30-fae7-af09-9c8f-58cd59c768d7")
public static String es_PE_FIELD_Request_DateLastAction2_Description="Fecha en que este requerimiento fue accionado por última vez.";

@XendraTrl(Identifier="047d4a30-fae7-af09-9c8f-58cd59c768d7")
public static String es_PE_FIELD_Request_DateLastAction2_Help="La fecha de última acción indica la última vez que el requerimiento fué accionado.";

@XendraField(AD_Column_ID="DateLastAction",IsCentrallyMaintained=true,
AD_Tab_ID="a6082d0b-507b-9bdf-147b-9db501402eae",AD_FieldGroup_ID="History",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=430,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="047d4a30-fae7-af09-9c8f-58cd59c768d7")
public static final String FIELDNAME_Request_DateLastAction2="047d4a30-fae7-af09-9c8f-58cd59c768d7";

@XendraTrl(Identifier="d9b5ede8-7c2c-2bdd-ed5c-1c947955ec20")
public static String es_PE_FIELD_PartnerRequests_DateLastAction_Name="Fecha de Última Acción";

@XendraTrl(Identifier="d9b5ede8-7c2c-2bdd-ed5c-1c947955ec20")
public static String es_PE_FIELD_PartnerRequests_DateLastAction_Description="Fecha en que este requerimiento fue accionado por última vez.";

@XendraTrl(Identifier="d9b5ede8-7c2c-2bdd-ed5c-1c947955ec20")
public static String es_PE_FIELD_PartnerRequests_DateLastAction_Help="La fecha de última acción indica la última vez que el requerimiento fué accionado.";

@XendraField(AD_Column_ID="DateLastAction",IsCentrallyMaintained=true,
AD_Tab_ID="0a25fb60-7718-c6c9-b67f-7adeb07cfa19",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d9b5ede8-7c2c-2bdd-ed5c-1c947955ec20")
public static final String FIELDNAME_PartnerRequests_DateLastAction="d9b5ede8-7c2c-2bdd-ed5c-1c947955ec20";

@XendraTrl(Identifier="fd846714-0011-3bc8-b91e-e430eefdb3be")
public static String es_PE_FIELD_RequestsSource_DateLastAction_Name="Fecha de Última Acción";

@XendraTrl(Identifier="fd846714-0011-3bc8-b91e-e430eefdb3be")
public static String es_PE_FIELD_RequestsSource_DateLastAction_Description="Fecha en que este requerimiento fue accionado por última vez.";

@XendraTrl(Identifier="fd846714-0011-3bc8-b91e-e430eefdb3be")
public static String es_PE_FIELD_RequestsSource_DateLastAction_Help="La fecha de última acción indica la última vez que el requerimiento fué accionado.";

@XendraField(AD_Column_ID="DateLastAction",IsCentrallyMaintained=true,
AD_Tab_ID="c2cdcdde-0adb-ef52-0a9e-48cf3e306ac6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=190,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fd846714-0011-3bc8-b91e-e430eefdb3be")
public static final String FIELDNAME_RequestsSource_DateLastAction="fd846714-0011-3bc8-b91e-e430eefdb3be";

@XendraTrl(Identifier="4583a97a-1c9c-bba1-26e6-a95caa25fb4e")
public static String es_PE_FIELD_RequestsSource_DateLastAction2_Name="Fecha de Última Acción";

@XendraTrl(Identifier="4583a97a-1c9c-bba1-26e6-a95caa25fb4e")
public static String es_PE_FIELD_RequestsSource_DateLastAction2_Description="Fecha en que este requerimiento fue accionado por última vez.";

@XendraTrl(Identifier="4583a97a-1c9c-bba1-26e6-a95caa25fb4e")
public static String es_PE_FIELD_RequestsSource_DateLastAction2_Help="La fecha de última acción indica la última vez que el requerimiento fué accionado.";

@XendraField(AD_Column_ID="DateLastAction",IsCentrallyMaintained=true,
AD_Tab_ID="8a4561d7-25be-5533-de4c-ab4735c335ee",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=190,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4583a97a-1c9c-bba1-26e6-a95caa25fb4e")
public static final String FIELDNAME_RequestsSource_DateLastAction2="4583a97a-1c9c-bba1-26e6-a95caa25fb4e";

@XendraTrl(Identifier="70d2627f-f292-c4ff-4b19-d1fe3944fd6a")
public static String es_PE_COLUMN_DateLastAction_Name="Fecha de Última Acción";

@XendraColumn(AD_Element_ID="bead2554-c61b-10f9-3b4d-86c90f1de10e",ColumnName="DateLastAction",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="70d2627f-f292-c4ff-4b19-d1fe3944fd6a",
Synchronized="2019-08-30 22:23:47.0")
/** Column name DateLastAction */
public static final String COLUMNNAME_DateLastAction = "DateLastAction";
/** Set Last Alert.
@param DateLastAlert Date when last alert were sent */
public void setDateLastAlert (Timestamp DateLastAlert)
{
set_Value (COLUMNNAME_DateLastAlert, DateLastAlert);
}
/** Get Last Alert.
@return Date when last alert were sent */
public Timestamp getDateLastAlert() 
{
return (Timestamp)get_Value(COLUMNNAME_DateLastAlert);
}

@XendraTrl(Identifier="3fb721a5-ac6c-edcb-bb44-eec052ca6dea")
public static String es_PE_FIELD_Request_LastAlert_Name="ID de Planeación Mensual";

@XendraField(AD_Column_ID="DateLastAlert",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="History",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=500,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3fb721a5-ac6c-edcb-bb44-eec052ca6dea")
public static final String FIELDNAME_Request_LastAlert="3fb721a5-ac6c-edcb-bb44-eec052ca6dea";

@XendraTrl(Identifier="220ac571-d3ed-8b01-7e74-18ce723e8759")
public static String es_PE_FIELD_Request_LastAlert2_Name="ID de Planeación Mensual";

@XendraField(AD_Column_ID="DateLastAlert",IsCentrallyMaintained=true,
AD_Tab_ID="a6082d0b-507b-9bdf-147b-9db501402eae",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=440,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="220ac571-d3ed-8b01-7e74-18ce723e8759")
public static final String FIELDNAME_Request_LastAlert2="220ac571-d3ed-8b01-7e74-18ce723e8759";

@XendraTrl(Identifier="461de280-9da6-3d06-b420-2b7285f87ca0")
public static String es_PE_FIELD_PartnerRequests_LastAlert_Name="ID de Planeación Mensual";

@XendraField(AD_Column_ID="DateLastAlert",IsCentrallyMaintained=true,
AD_Tab_ID="0a25fb60-7718-c6c9-b67f-7adeb07cfa19",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="461de280-9da6-3d06-b420-2b7285f87ca0")
public static final String FIELDNAME_PartnerRequests_LastAlert="461de280-9da6-3d06-b420-2b7285f87ca0";

@XendraTrl(Identifier="f3398672-1d71-cf97-9320-803523be3d15")
public static String es_PE_FIELD_RequestsSource_LastAlert_Name="ID de Planeación Mensual";

@XendraField(AD_Column_ID="DateLastAlert",IsCentrallyMaintained=true,
AD_Tab_ID="c2cdcdde-0adb-ef52-0a9e-48cf3e306ac6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f3398672-1d71-cf97-9320-803523be3d15")
public static final String FIELDNAME_RequestsSource_LastAlert="f3398672-1d71-cf97-9320-803523be3d15";

@XendraTrl(Identifier="118c5535-da50-0646-0b0b-5a58e10e5176")
public static String es_PE_FIELD_RequestsSource_LastAlert2_Name="ID de Planeación Mensual";

@XendraField(AD_Column_ID="DateLastAlert",IsCentrallyMaintained=true,
AD_Tab_ID="8a4561d7-25be-5533-de4c-ab4735c335ee",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="118c5535-da50-0646-0b0b-5a58e10e5176")
public static final String FIELDNAME_RequestsSource_LastAlert2="118c5535-da50-0646-0b0b-5a58e10e5176";

@XendraTrl(Identifier="ee399792-9624-d83a-ab1a-9940bbcc55a4")
public static String es_PE_COLUMN_DateLastAlert_Name="ID de Planeación Mensual";

@XendraColumn(AD_Element_ID="2ac1a16e-afc2-d10f-8c06-5b372bd7bfa9",ColumnName="DateLastAlert",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ee399792-9624-d83a-ab1a-9940bbcc55a4",
Synchronized="2019-08-30 22:23:47.0")
/** Column name DateLastAlert */
public static final String COLUMNNAME_DateLastAlert = "DateLastAlert";
/** Set Date next action.
@param DateNextAction Date that this request should be acted on */
public void setDateNextAction (Timestamp DateNextAction)
{
set_Value (COLUMNNAME_DateNextAction, DateNextAction);
}
/** Get Date next action.
@return Date that this request should be acted on */
public Timestamp getDateNextAction() 
{
return (Timestamp)get_Value(COLUMNNAME_DateNextAction);
}

@XendraTrl(Identifier="12c60462-f8ee-8f83-339b-c722dc033b72")
public static String es_PE_FIELD_Request_DateNextAction_Name="Fecha de Siguiente Acción";

@XendraTrl(Identifier="12c60462-f8ee-8f83-339b-c722dc033b72")
public static String es_PE_FIELD_Request_DateNextAction_Description="Fecha en que este requerimiento será accionado la siguiente vez.";

@XendraTrl(Identifier="12c60462-f8ee-8f83-339b-c722dc033b72")
public static String es_PE_FIELD_Request_DateNextAction_Help="La fecha de la siguiente acción indica la fecha siguiente programada para que una acción ocurra para este requerimiento.";

@XendraField(AD_Column_ID="DateNextAction",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="Action",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="12c60462-f8ee-8f83-339b-c722dc033b72")
public static final String FIELDNAME_Request_DateNextAction="12c60462-f8ee-8f83-339b-c722dc033b72";

@XendraTrl(Identifier="35ed1b16-b021-f212-8dbe-2ca849797cba")
public static String es_PE_FIELD_Request_DateNextAction2_Name="Fecha de Siguiente Acción";

@XendraTrl(Identifier="35ed1b16-b021-f212-8dbe-2ca849797cba")
public static String es_PE_FIELD_Request_DateNextAction2_Description="Fecha en que este requerimiento será accionado la siguiente vez.";

@XendraTrl(Identifier="35ed1b16-b021-f212-8dbe-2ca849797cba")
public static String es_PE_FIELD_Request_DateNextAction2_Help="La fecha de la siguiente acción indica la fecha siguiente programada para que una acción ocurra para este requerimiento.";

@XendraField(AD_Column_ID="DateNextAction",IsCentrallyMaintained=true,
AD_Tab_ID="a6082d0b-507b-9bdf-147b-9db501402eae",AD_FieldGroup_ID="Action",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="35ed1b16-b021-f212-8dbe-2ca849797cba")
public static final String FIELDNAME_Request_DateNextAction2="35ed1b16-b021-f212-8dbe-2ca849797cba";

@XendraTrl(Identifier="2f39e39a-19e2-bbc9-711f-d377859e461a")
public static String es_PE_FIELD_PartnerRequests_DateNextAction_Name="Fecha de Siguiente Acción";

@XendraTrl(Identifier="2f39e39a-19e2-bbc9-711f-d377859e461a")
public static String es_PE_FIELD_PartnerRequests_DateNextAction_Description="Fecha en que este requerimiento será accionado la siguiente vez.";

@XendraTrl(Identifier="2f39e39a-19e2-bbc9-711f-d377859e461a")
public static String es_PE_FIELD_PartnerRequests_DateNextAction_Help="La fecha de la siguiente acción indica la fecha siguiente programada para que una acción ocurra para este requerimiento.";

@XendraField(AD_Column_ID="DateNextAction",IsCentrallyMaintained=true,
AD_Tab_ID="0a25fb60-7718-c6c9-b67f-7adeb07cfa19",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2f39e39a-19e2-bbc9-711f-d377859e461a")
public static final String FIELDNAME_PartnerRequests_DateNextAction="2f39e39a-19e2-bbc9-711f-d377859e461a";

@XendraTrl(Identifier="89f3d264-0636-4004-bfa3-ccf943833590")
public static String es_PE_FIELD_RequestsSource_DateNextAction_Name="Fecha de Siguiente Acción";

@XendraTrl(Identifier="89f3d264-0636-4004-bfa3-ccf943833590")
public static String es_PE_FIELD_RequestsSource_DateNextAction_Description="Fecha en que este requerimiento será accionado la siguiente vez.";

@XendraTrl(Identifier="89f3d264-0636-4004-bfa3-ccf943833590")
public static String es_PE_FIELD_RequestsSource_DateNextAction_Help="La fecha de la siguiente acción indica la fecha siguiente programada para que una acción ocurra para este requerimiento.";

@XendraField(AD_Column_ID="DateNextAction",IsCentrallyMaintained=true,
AD_Tab_ID="c2cdcdde-0adb-ef52-0a9e-48cf3e306ac6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=200,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="89f3d264-0636-4004-bfa3-ccf943833590")
public static final String FIELDNAME_RequestsSource_DateNextAction="89f3d264-0636-4004-bfa3-ccf943833590";

@XendraTrl(Identifier="fe937d75-c904-dba0-51b8-5f41448d0ea9")
public static String es_PE_FIELD_RequestsSource_DateNextAction2_Name="Fecha de Siguiente Acción";

@XendraTrl(Identifier="fe937d75-c904-dba0-51b8-5f41448d0ea9")
public static String es_PE_FIELD_RequestsSource_DateNextAction2_Description="Fecha en que este requerimiento será accionado la siguiente vez.";

@XendraTrl(Identifier="fe937d75-c904-dba0-51b8-5f41448d0ea9")
public static String es_PE_FIELD_RequestsSource_DateNextAction2_Help="La fecha de la siguiente acción indica la fecha siguiente programada para que una acción ocurra para este requerimiento.";

@XendraField(AD_Column_ID="DateNextAction",IsCentrallyMaintained=true,
AD_Tab_ID="8a4561d7-25be-5533-de4c-ab4735c335ee",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=200,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fe937d75-c904-dba0-51b8-5f41448d0ea9")
public static final String FIELDNAME_RequestsSource_DateNextAction2="fe937d75-c904-dba0-51b8-5f41448d0ea9";

@XendraTrl(Identifier="1f744e3c-fd8a-9ee5-c0dd-7f59161c92c9")
public static String es_PE_COLUMN_DateNextAction_Name="Fecha de Siguiente Acción";

@XendraColumn(AD_Element_ID="f61753db-c903-5f73-dbc3-862a56118e48",ColumnName="DateNextAction",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1f744e3c-fd8a-9ee5-c0dd-7f59161c92c9",
Synchronized="2019-08-30 22:23:47.0")
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

@XendraTrl(Identifier="5e916ab6-c503-da54-7465-410b472abf5e")
public static String es_PE_FIELD_Request_StartPlan_Name="Plan de Inicio";

@XendraTrl(Identifier="5e916ab6-c503-da54-7465-410b472abf5e")
public static String es_PE_FIELD_Request_StartPlan_Description="Fecha Planeada de Inicio";

@XendraTrl(Identifier="5e916ab6-c503-da54-7465-410b472abf5e")
public static String es_PE_FIELD_Request_StartPlan_Help="Fecha cuando usted planea iniciar. ";

@XendraField(AD_Column_ID="DateStartPlan",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=7,IsReadOnly=false,SeqNo=310,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5e916ab6-c503-da54-7465-410b472abf5e")
public static final String FIELDNAME_Request_StartPlan="5e916ab6-c503-da54-7465-410b472abf5e";

@XendraTrl(Identifier="f586539a-dc9f-00f7-9519-691906213297")
public static String es_PE_COLUMN_DateStartPlan_Name="Plan de Inicio";

@XendraColumn(AD_Element_ID="aeb70c83-b4b4-84b0-7de4-78a7da42862a",ColumnName="DateStartPlan",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f586539a-dc9f-00f7-9519-691906213297",
Synchronized="2019-08-30 22:23:47.0")
/** Column name DateStartPlan */
public static final String COLUMNNAME_DateStartPlan = "DateStartPlan";
/** Set Document No.
@param DocumentNo Document sequence number of the document */
public void setDocumentNo (String DocumentNo)
{
if (DocumentNo == null) throw new IllegalArgumentException ("DocumentNo is mandatory.");
if (DocumentNo.length() > 30)
{
log.warning("Length > 30 - truncated");
DocumentNo = DocumentNo.substring(0,29);
}
set_Value (COLUMNNAME_DocumentNo, DocumentNo);
}
/** Get Document No.
@return Document sequence number of the document */
public String getDocumentNo() 
{
String value = (String)get_Value(COLUMNNAME_DocumentNo);
if (value == null)
  return "";
return value;
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getDocumentNo());
}

@XendraTrl(Identifier="41fdced7-283f-59e2-fda1-cdf2be2b01e9")
public static String es_PE_FIELD_Request_DocumentNo_Name="No. del Documento";

@XendraTrl(Identifier="41fdced7-283f-59e2-fda1-cdf2be2b01e9")
public static String es_PE_FIELD_Request_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="41fdced7-283f-59e2-fda1-cdf2be2b01e9")
public static String es_PE_FIELD_Request_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=30,SortNo=-3,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="41fdced7-283f-59e2-fda1-cdf2be2b01e9")
public static final String FIELDNAME_Request_DocumentNo="41fdced7-283f-59e2-fda1-cdf2be2b01e9";

@XendraTrl(Identifier="a03db4f7-249f-4dce-612c-0b00c1a84610")
public static String es_PE_FIELD_Request_DocumentNo2_Name="No. del Documento";

@XendraTrl(Identifier="a03db4f7-249f-4dce-612c-0b00c1a84610")
public static String es_PE_FIELD_Request_DocumentNo2_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="a03db4f7-249f-4dce-612c-0b00c1a84610")
public static String es_PE_FIELD_Request_DocumentNo2_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="a6082d0b-507b-9bdf-147b-9db501402eae",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=30,SortNo=3,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a03db4f7-249f-4dce-612c-0b00c1a84610")
public static final String FIELDNAME_Request_DocumentNo2="a03db4f7-249f-4dce-612c-0b00c1a84610";

@XendraTrl(Identifier="1be0a86b-b6d7-005e-019a-1d79f59b97f7")
public static String es_PE_FIELD_PartnerRequests_DocumentNo_Name="No. del Documento";

@XendraTrl(Identifier="1be0a86b-b6d7-005e-019a-1d79f59b97f7")
public static String es_PE_FIELD_PartnerRequests_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="1be0a86b-b6d7-005e-019a-1d79f59b97f7")
public static String es_PE_FIELD_PartnerRequests_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="0a25fb60-7718-c6c9-b67f-7adeb07cfa19",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=40,SortNo=2,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1be0a86b-b6d7-005e-019a-1d79f59b97f7")
public static final String FIELDNAME_PartnerRequests_DocumentNo="1be0a86b-b6d7-005e-019a-1d79f59b97f7";

@XendraTrl(Identifier="94a449fd-12d9-7b6d-130e-253b9f2b2c14")
public static String es_PE_FIELD_RequestsSource_DocumentNo_Name="No. del Documento";

@XendraTrl(Identifier="94a449fd-12d9-7b6d-130e-253b9f2b2c14")
public static String es_PE_FIELD_RequestsSource_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="94a449fd-12d9-7b6d-130e-253b9f2b2c14")
public static String es_PE_FIELD_RequestsSource_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="c2cdcdde-0adb-ef52-0a9e-48cf3e306ac6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=50,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="94a449fd-12d9-7b6d-130e-253b9f2b2c14")
public static final String FIELDNAME_RequestsSource_DocumentNo="94a449fd-12d9-7b6d-130e-253b9f2b2c14";

@XendraTrl(Identifier="efc007e1-7904-615f-d761-7884ca43b74c")
public static String es_PE_FIELD_RequestsSource_DocumentNo2_Name="No. del Documento";

@XendraTrl(Identifier="efc007e1-7904-615f-d761-7884ca43b74c")
public static String es_PE_FIELD_RequestsSource_DocumentNo2_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="efc007e1-7904-615f-d761-7884ca43b74c")
public static String es_PE_FIELD_RequestsSource_DocumentNo2_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="8a4561d7-25be-5533-de4c-ab4735c335ee",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=50,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="efc007e1-7904-615f-d761-7884ca43b74c")
public static final String FIELDNAME_RequestsSource_DocumentNo2="efc007e1-7904-615f-d761-7884ca43b74c";

@XendraTrl(Identifier="6bee9f0d-c949-94bf-7c4c-6d9cbc381213")
public static String es_PE_COLUMN_DocumentNo_Name="No. del Documento";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6bee9f0d-c949-94bf-7c4c-6d9cbc381213",
Synchronized="2019-08-30 22:23:47.0")
/** Column name DocumentNo */
public static final String COLUMNNAME_DocumentNo = "DocumentNo";
/** Set Due type.
@param DueType Status of the next action for this Request */
public void setDueType (String DueType)
{
if (DueType.length() > 1)
{
log.warning("Length > 1 - truncated");
DueType = DueType.substring(0,0);
}
set_Value (COLUMNNAME_DueType, DueType);
}
/** Get Due type.
@return Status of the next action for this Request */
public String getDueType() 
{
return (String)get_Value(COLUMNNAME_DueType);
}

@XendraTrl(Identifier="09761834-db14-1038-c745-eaaf3be704b9")
public static String es_PE_FIELD_Request_DueType_Name="Tipo de Vencimiento";

@XendraTrl(Identifier="09761834-db14-1038-c745-eaaf3be704b9")
public static String es_PE_FIELD_Request_DueType_Description="Estado de la siguiente acción para este requerimiento";

@XendraTrl(Identifier="09761834-db14-1038-c745-eaaf3be704b9")
public static String es_PE_FIELD_Request_DueType_Help="El tipo de vencimiento indica si este requerimiento vence; está vencido ó programado";

@XendraField(AD_Column_ID="DueType",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="09761834-db14-1038-c745-eaaf3be704b9")
public static final String FIELDNAME_Request_DueType="09761834-db14-1038-c745-eaaf3be704b9";

@XendraTrl(Identifier="917632cb-d3fb-d268-dca2-9eb0dd962187")
public static String es_PE_FIELD_Request_DueType2_Name="Tipo de Vencimiento";

@XendraTrl(Identifier="917632cb-d3fb-d268-dca2-9eb0dd962187")
public static String es_PE_FIELD_Request_DueType2_Description="Estado de la siguiente acción para este requerimiento";

@XendraTrl(Identifier="917632cb-d3fb-d268-dca2-9eb0dd962187")
public static String es_PE_FIELD_Request_DueType2_Help="El tipo de vencimiento indica si este requerimiento vence; está vencido ó programado";

@XendraField(AD_Column_ID="DueType",IsCentrallyMaintained=true,
AD_Tab_ID="a6082d0b-507b-9bdf-147b-9db501402eae",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="917632cb-d3fb-d268-dca2-9eb0dd962187")
public static final String FIELDNAME_Request_DueType2="917632cb-d3fb-d268-dca2-9eb0dd962187";

@XendraTrl(Identifier="c9bd3bdd-6b40-bb16-c6bc-45549161c824")
public static String es_PE_FIELD_PartnerRequests_DueType_Name="Tipo de Vencimiento";

@XendraTrl(Identifier="c9bd3bdd-6b40-bb16-c6bc-45549161c824")
public static String es_PE_FIELD_PartnerRequests_DueType_Description="Estado de la siguiente acción para este requerimiento";

@XendraTrl(Identifier="c9bd3bdd-6b40-bb16-c6bc-45549161c824")
public static String es_PE_FIELD_PartnerRequests_DueType_Help="El tipo de vencimiento indica si este requerimiento vence; está vencido ó programado";

@XendraField(AD_Column_ID="DueType",IsCentrallyMaintained=true,
AD_Tab_ID="0a25fb60-7718-c6c9-b67f-7adeb07cfa19",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c9bd3bdd-6b40-bb16-c6bc-45549161c824")
public static final String FIELDNAME_PartnerRequests_DueType="c9bd3bdd-6b40-bb16-c6bc-45549161c824";

@XendraTrl(Identifier="c31f6d88-47c3-293d-2512-f550311d3051")
public static String es_PE_FIELD_RequestsSource_DueType_Name="Tipo de Vencimiento";

@XendraTrl(Identifier="c31f6d88-47c3-293d-2512-f550311d3051")
public static String es_PE_FIELD_RequestsSource_DueType_Description="Estado de la siguiente acción para este requerimiento";

@XendraTrl(Identifier="c31f6d88-47c3-293d-2512-f550311d3051")
public static String es_PE_FIELD_RequestsSource_DueType_Help="El tipo de vencimiento indica si este requerimiento vence; está vencido ó programado";

@XendraField(AD_Column_ID="DueType",IsCentrallyMaintained=true,
AD_Tab_ID="c2cdcdde-0adb-ef52-0a9e-48cf3e306ac6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c31f6d88-47c3-293d-2512-f550311d3051")
public static final String FIELDNAME_RequestsSource_DueType="c31f6d88-47c3-293d-2512-f550311d3051";

@XendraTrl(Identifier="210fbfae-b7b3-3bb9-18b0-060bf35e7c0d")
public static String es_PE_FIELD_RequestsSource_DueType2_Name="Tipo de Vencimiento";

@XendraTrl(Identifier="210fbfae-b7b3-3bb9-18b0-060bf35e7c0d")
public static String es_PE_FIELD_RequestsSource_DueType2_Description="Estado de la siguiente acción para este requerimiento";

@XendraTrl(Identifier="210fbfae-b7b3-3bb9-18b0-060bf35e7c0d")
public static String es_PE_FIELD_RequestsSource_DueType2_Help="El tipo de vencimiento indica si este requerimiento vence; está vencido ó programado";

@XendraField(AD_Column_ID="DueType",IsCentrallyMaintained=true,
AD_Tab_ID="8a4561d7-25be-5533-de4c-ab4735c335ee",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="210fbfae-b7b3-3bb9-18b0-060bf35e7c0d")
public static final String FIELDNAME_RequestsSource_DueType2="210fbfae-b7b3-3bb9-18b0-060bf35e7c0d";

@XendraTrl(Identifier="cb1bec47-66c9-519e-9733-4382b2432fc0")
public static String es_PE_COLUMN_DueType_Name="Tipo de Vencimiento";

@XendraColumn(AD_Element_ID="9c8700e2-3b7e-d736-cd33-8e356ed6f164",ColumnName="DueType",
AD_Reference_ID=17,AD_Reference_Value_ID="0ae60dc4-ed3c-2971-ca47-35954ed98449",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="5",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="cb1bec47-66c9-519e-9733-4382b2432fc0",Synchronized="2019-08-30 22:23:47.0")
/** Column name DueType */
public static final String COLUMNNAME_DueType = "DueType";
/** Set End Time.
@param EndTime End of the time span */
public void setEndTime (Timestamp EndTime)
{
set_Value (COLUMNNAME_EndTime, EndTime);
}
/** Get End Time.
@return End of the time span */
public Timestamp getEndTime() 
{
return (Timestamp)get_Value(COLUMNNAME_EndTime);
}

@XendraTrl(Identifier="8e03259e-4ccd-2b59-88fb-85bc59e3110a")
public static String es_PE_FIELD_Request_EndTime_Name="Final de Tiempo";

@XendraTrl(Identifier="8e03259e-4ccd-2b59-88fb-85bc59e3110a")
public static String es_PE_FIELD_Request_EndTime_Description="Final de tiempo";

@XendraField(AD_Column_ID="EndTime",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="Action",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8e03259e-4ccd-2b59-88fb-85bc59e3110a")
public static final String FIELDNAME_Request_EndTime="8e03259e-4ccd-2b59-88fb-85bc59e3110a";

@XendraTrl(Identifier="75689ebe-9d58-3aa2-dab7-751fe911eb30")
public static String es_PE_FIELD_Request_EndTime2_Name="Final de Tiempo";

@XendraTrl(Identifier="75689ebe-9d58-3aa2-dab7-751fe911eb30")
public static String es_PE_FIELD_Request_EndTime2_Description="Final de tiempo";

@XendraField(AD_Column_ID="EndTime",IsCentrallyMaintained=true,
AD_Tab_ID="a6082d0b-507b-9bdf-147b-9db501402eae",AD_FieldGroup_ID="Action",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="75689ebe-9d58-3aa2-dab7-751fe911eb30")
public static final String FIELDNAME_Request_EndTime2="75689ebe-9d58-3aa2-dab7-751fe911eb30";

@XendraTrl(Identifier="d02237e9-5a04-8b7e-47c3-a11eb2240a1d")
public static String es_PE_FIELD_PartnerRequests_EndTime_Name="Final de Tiempo";

@XendraTrl(Identifier="d02237e9-5a04-8b7e-47c3-a11eb2240a1d")
public static String es_PE_FIELD_PartnerRequests_EndTime_Description="Final de tiempo";

@XendraField(AD_Column_ID="EndTime",IsCentrallyMaintained=true,
AD_Tab_ID="0a25fb60-7718-c6c9-b67f-7adeb07cfa19",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d02237e9-5a04-8b7e-47c3-a11eb2240a1d")
public static final String FIELDNAME_PartnerRequests_EndTime="d02237e9-5a04-8b7e-47c3-a11eb2240a1d";

@XendraTrl(Identifier="7da22b93-31f4-859a-1cef-d104bf188eea")
public static String es_PE_FIELD_RequestsSource_EndTime_Name="Final de Tiempo";

@XendraTrl(Identifier="7da22b93-31f4-859a-1cef-d104bf188eea")
public static String es_PE_FIELD_RequestsSource_EndTime_Description="Final de tiempo";

@XendraField(AD_Column_ID="EndTime",IsCentrallyMaintained=true,
AD_Tab_ID="c2cdcdde-0adb-ef52-0a9e-48cf3e306ac6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7da22b93-31f4-859a-1cef-d104bf188eea")
public static final String FIELDNAME_RequestsSource_EndTime="7da22b93-31f4-859a-1cef-d104bf188eea";

@XendraTrl(Identifier="a5594b4a-424a-85ff-5f7a-592c0b347933")
public static String es_PE_FIELD_RequestsSource_EndTime2_Name="Final de Tiempo";

@XendraTrl(Identifier="a5594b4a-424a-85ff-5f7a-592c0b347933")
public static String es_PE_FIELD_RequestsSource_EndTime2_Description="Final de tiempo";

@XendraField(AD_Column_ID="EndTime",IsCentrallyMaintained=true,
AD_Tab_ID="8a4561d7-25be-5533-de4c-ab4735c335ee",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a5594b4a-424a-85ff-5f7a-592c0b347933")
public static final String FIELDNAME_RequestsSource_EndTime2="a5594b4a-424a-85ff-5f7a-592c0b347933";

@XendraTrl(Identifier="7b4ef6ec-d72c-7bbd-eac2-839f8779b33a")
public static String es_PE_COLUMN_EndTime_Name="Final de Tiempo";

@XendraColumn(AD_Element_ID="6c802fea-18a8-875e-7b55-9ace2db37aac",ColumnName="EndTime",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7b4ef6ec-d72c-7bbd-eac2-839f8779b33a",
Synchronized="2019-08-30 22:23:47.0")
/** Column name EndTime */
public static final String COLUMNNAME_EndTime = "EndTime";
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
@XendraTrl(Identifier="7bccd809-f668-4d18-a99b-879c387cb57d")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7bccd809-f668-4d18-a99b-879c387cb57d",
Synchronized="2019-08-30 22:23:47.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Escalated.
@param IsEscalated This request has been escalated */
public void setIsEscalated (boolean IsEscalated)
{
set_Value (COLUMNNAME_IsEscalated, Boolean.valueOf(IsEscalated));
}
/** Get Escalated.
@return This request has been escalated */
public boolean isEscalated() 
{
Object oo = get_Value(COLUMNNAME_IsEscalated);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="3e3e654c-20e4-bf8f-064c-fd3a117ab91e")
public static String es_PE_FIELD_Request_Escalated_Name="Escalado";

@XendraTrl(Identifier="3e3e654c-20e4-bf8f-064c-fd3a117ab91e")
public static String es_PE_FIELD_Request_Escalated_Description="Este requerimiento ha sido escalado.";

@XendraTrl(Identifier="3e3e654c-20e4-bf8f-064c-fd3a117ab91e")
public static String es_PE_FIELD_Request_Escalated_Help="El cuadro de verificación escalado indica que este requerimiento ha sido escalado ó elevado en importancia.";

@XendraField(AD_Column_ID="IsEscalated",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3e3e654c-20e4-bf8f-064c-fd3a117ab91e")
public static final String FIELDNAME_Request_Escalated="3e3e654c-20e4-bf8f-064c-fd3a117ab91e";

@XendraTrl(Identifier="9e41bdf2-9c18-d8ed-d357-48e009e9678a")
public static String es_PE_FIELD_Request_Escalated2_Name="Escalado";

@XendraTrl(Identifier="9e41bdf2-9c18-d8ed-d357-48e009e9678a")
public static String es_PE_FIELD_Request_Escalated2_Description="Este requerimiento ha sido escalado.";

@XendraTrl(Identifier="9e41bdf2-9c18-d8ed-d357-48e009e9678a")
public static String es_PE_FIELD_Request_Escalated2_Help="El cuadro de verificación escalado indica que este requerimiento ha sido escalado ó elevado en importancia.";

@XendraField(AD_Column_ID="IsEscalated",IsCentrallyMaintained=true,
AD_Tab_ID="a6082d0b-507b-9bdf-147b-9db501402eae",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9e41bdf2-9c18-d8ed-d357-48e009e9678a")
public static final String FIELDNAME_Request_Escalated2="9e41bdf2-9c18-d8ed-d357-48e009e9678a";

@XendraTrl(Identifier="f6599b64-b1fa-48f4-8216-f0ee68bbb681")
public static String es_PE_FIELD_PartnerRequests_Escalated_Name="Escalado";

@XendraTrl(Identifier="f6599b64-b1fa-48f4-8216-f0ee68bbb681")
public static String es_PE_FIELD_PartnerRequests_Escalated_Description="Este requerimiento ha sido escalado.";

@XendraTrl(Identifier="f6599b64-b1fa-48f4-8216-f0ee68bbb681")
public static String es_PE_FIELD_PartnerRequests_Escalated_Help="El cuadro de verificación escalado indica que este requerimiento ha sido escalado ó elevado en importancia.";

@XendraField(AD_Column_ID="IsEscalated",IsCentrallyMaintained=true,
AD_Tab_ID="0a25fb60-7718-c6c9-b67f-7adeb07cfa19",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f6599b64-b1fa-48f4-8216-f0ee68bbb681")
public static final String FIELDNAME_PartnerRequests_Escalated="f6599b64-b1fa-48f4-8216-f0ee68bbb681";

@XendraTrl(Identifier="3f3ed5c8-e61f-9b63-695d-01833f09c926")
public static String es_PE_FIELD_RequestsSource_Escalated_Name="Escalado";

@XendraTrl(Identifier="3f3ed5c8-e61f-9b63-695d-01833f09c926")
public static String es_PE_FIELD_RequestsSource_Escalated_Description="Este requerimiento ha sido escalado.";

@XendraTrl(Identifier="3f3ed5c8-e61f-9b63-695d-01833f09c926")
public static String es_PE_FIELD_RequestsSource_Escalated_Help="El cuadro de verificación escalado indica que este requerimiento ha sido escalado ó elevado en importancia.";

@XendraField(AD_Column_ID="IsEscalated",IsCentrallyMaintained=true,
AD_Tab_ID="c2cdcdde-0adb-ef52-0a9e-48cf3e306ac6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3f3ed5c8-e61f-9b63-695d-01833f09c926")
public static final String FIELDNAME_RequestsSource_Escalated="3f3ed5c8-e61f-9b63-695d-01833f09c926";

@XendraTrl(Identifier="72523135-40dd-48f8-82ec-7e08057f68b8")
public static String es_PE_FIELD_RequestsSource_Escalated2_Name="Escalado";

@XendraTrl(Identifier="72523135-40dd-48f8-82ec-7e08057f68b8")
public static String es_PE_FIELD_RequestsSource_Escalated2_Description="Este requerimiento ha sido escalado.";

@XendraTrl(Identifier="72523135-40dd-48f8-82ec-7e08057f68b8")
public static String es_PE_FIELD_RequestsSource_Escalated2_Help="El cuadro de verificación escalado indica que este requerimiento ha sido escalado ó elevado en importancia.";

@XendraField(AD_Column_ID="IsEscalated",IsCentrallyMaintained=true,
AD_Tab_ID="8a4561d7-25be-5533-de4c-ab4735c335ee",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="72523135-40dd-48f8-82ec-7e08057f68b8")
public static final String FIELDNAME_RequestsSource_Escalated2="72523135-40dd-48f8-82ec-7e08057f68b8";

@XendraTrl(Identifier="db856f9c-015f-60f0-935b-714fa644ffc3")
public static String es_PE_COLUMN_IsEscalated_Name="Escalado";

@XendraColumn(AD_Element_ID="a72c96ea-02a9-2949-3bb4-c1bbd6b241ad",ColumnName="IsEscalated",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="db856f9c-015f-60f0-935b-714fa644ffc3",
Synchronized="2019-08-30 22:23:47.0")
/** Column name IsEscalated */
public static final String COLUMNNAME_IsEscalated = "IsEscalated";
/** Set Invoiced.
@param IsInvoiced Is this invoiced? */
public void setIsInvoiced (boolean IsInvoiced)
{
set_Value (COLUMNNAME_IsInvoiced, Boolean.valueOf(IsInvoiced));
}
/** Get Invoiced.
@return Is this invoiced? */
public boolean isInvoiced() 
{
Object oo = get_Value(COLUMNNAME_IsInvoiced);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="930c552d-5e08-dc6a-5958-fdb56e93ddc6")
public static String es_PE_FIELD_Request_Invoiced_Name="Facturado";

@XendraField(AD_Column_ID="IsInvoiced",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="930c552d-5e08-dc6a-5958-fdb56e93ddc6")
public static final String FIELDNAME_Request_Invoiced="930c552d-5e08-dc6a-5958-fdb56e93ddc6";

@XendraTrl(Identifier="6dfc07bf-68db-2d41-0713-6e402369da3f")
public static String es_PE_FIELD_Request_Invoiced2_Name="Facturado";

@XendraField(AD_Column_ID="IsInvoiced",IsCentrallyMaintained=true,
AD_Tab_ID="a6082d0b-507b-9bdf-147b-9db501402eae",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6dfc07bf-68db-2d41-0713-6e402369da3f")
public static final String FIELDNAME_Request_Invoiced2="6dfc07bf-68db-2d41-0713-6e402369da3f";

@XendraTrl(Identifier="d3b9a646-8804-92bb-6c35-5f4bb8ed5cd9")
public static String es_PE_FIELD_PartnerRequests_Invoiced_Name="Facturado";

@XendraField(AD_Column_ID="IsInvoiced",IsCentrallyMaintained=true,
AD_Tab_ID="0a25fb60-7718-c6c9-b67f-7adeb07cfa19",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d3b9a646-8804-92bb-6c35-5f4bb8ed5cd9")
public static final String FIELDNAME_PartnerRequests_Invoiced="d3b9a646-8804-92bb-6c35-5f4bb8ed5cd9";

@XendraTrl(Identifier="3986214b-49b4-de8c-a7b4-0be7c0321ef6")
public static String es_PE_FIELD_RequestsSource_Invoiced_Name="Facturado";

@XendraField(AD_Column_ID="IsInvoiced",IsCentrallyMaintained=true,
AD_Tab_ID="c2cdcdde-0adb-ef52-0a9e-48cf3e306ac6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3986214b-49b4-de8c-a7b4-0be7c0321ef6")
public static final String FIELDNAME_RequestsSource_Invoiced="3986214b-49b4-de8c-a7b4-0be7c0321ef6";

@XendraTrl(Identifier="19fa9b9d-6c3b-b918-ef54-cddbebfad503")
public static String es_PE_FIELD_RequestsSource_Invoiced2_Name="Facturado";

@XendraField(AD_Column_ID="IsInvoiced",IsCentrallyMaintained=true,
AD_Tab_ID="8a4561d7-25be-5533-de4c-ab4735c335ee",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="19fa9b9d-6c3b-b918-ef54-cddbebfad503")
public static final String FIELDNAME_RequestsSource_Invoiced2="19fa9b9d-6c3b-b918-ef54-cddbebfad503";

@XendraTrl(Identifier="7b037f75-3247-553b-6857-b051cef87c4d")
public static String es_PE_COLUMN_IsInvoiced_Name="Facturado";

@XendraColumn(AD_Element_ID="a685c688-064e-aa25-7a8b-2b0273e958c1",ColumnName="IsInvoiced",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7b037f75-3247-553b-6857-b051cef87c4d",
Synchronized="2019-08-30 22:23:47.0")
/** Column name IsInvoiced */
public static final String COLUMNNAME_IsInvoiced = "IsInvoiced";
/** Set Self-Service.
@param IsSelfService This is a Self-Service entry or this entry can be changed via Self-Service */
public void setIsSelfService (boolean IsSelfService)
{
set_ValueNoCheck (COLUMNNAME_IsSelfService, Boolean.valueOf(IsSelfService));
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

@XendraTrl(Identifier="f3906645-1efe-aa5f-f2e4-62bf7ab76f20")
public static String es_PE_FIELD_Request_Self_Service_Name="Auto-Servicio";

@XendraTrl(Identifier="f3906645-1efe-aa5f-f2e4-62bf7ab76f20")
public static String es_PE_FIELD_Request_Self_Service_Description="Esta es una entrada del autoservicio ó esta entrada se puede cambiar vía autoservicio";

@XendraTrl(Identifier="f3906645-1efe-aa5f-f2e4-62bf7ab76f20")
public static String es_PE_FIELD_Request_Self_Service_Help="El autoservicio permite que los usuarios incorporen datos o que pongan al día sus datos. La bandera indica, que este expediente fue incorporado o creado vía autoservicio o que el usuario puede cambiarlo vía funcionalidad del autoservicio.";

@XendraField(AD_Column_ID="IsSelfService",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=170,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f3906645-1efe-aa5f-f2e4-62bf7ab76f20")
public static final String FIELDNAME_Request_Self_Service="f3906645-1efe-aa5f-f2e4-62bf7ab76f20";

@XendraTrl(Identifier="bede1025-b51f-b27d-8c9b-9e41885d2071")
public static String es_PE_FIELD_Request_Self_Service2_Name="Auto-Servicio";

@XendraTrl(Identifier="bede1025-b51f-b27d-8c9b-9e41885d2071")
public static String es_PE_FIELD_Request_Self_Service2_Description="Esta es una entrada del autoservicio ó esta entrada se puede cambiar vía autoservicio";

@XendraTrl(Identifier="bede1025-b51f-b27d-8c9b-9e41885d2071")
public static String es_PE_FIELD_Request_Self_Service2_Help="El autoservicio permite que los usuarios incorporen datos o que pongan al día sus datos. La bandera indica, que este expediente fue incorporado o creado vía autoservicio o que el usuario puede cambiarlo vía funcionalidad del autoservicio.";

@XendraField(AD_Column_ID="IsSelfService",IsCentrallyMaintained=true,
AD_Tab_ID="a6082d0b-507b-9bdf-147b-9db501402eae",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=170,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bede1025-b51f-b27d-8c9b-9e41885d2071")
public static final String FIELDNAME_Request_Self_Service2="bede1025-b51f-b27d-8c9b-9e41885d2071";

@XendraTrl(Identifier="5c159998-7409-b1ec-dbdf-d8b7961fcfd5")
public static String es_PE_FIELD_PartnerRequests_Self_Service_Name="Auto-Servicio";

@XendraTrl(Identifier="5c159998-7409-b1ec-dbdf-d8b7961fcfd5")
public static String es_PE_FIELD_PartnerRequests_Self_Service_Description="Esta es una entrada del autoservicio ó esta entrada se puede cambiar vía autoservicio";

@XendraTrl(Identifier="5c159998-7409-b1ec-dbdf-d8b7961fcfd5")
public static String es_PE_FIELD_PartnerRequests_Self_Service_Help="El autoservicio permite que los usuarios incorporen datos o que pongan al día sus datos. La bandera indica, que este expediente fue incorporado o creado vía autoservicio o que el usuario puede cambiarlo vía funcionalidad del autoservicio.";

@XendraField(AD_Column_ID="IsSelfService",IsCentrallyMaintained=true,
AD_Tab_ID="0a25fb60-7718-c6c9-b67f-7adeb07cfa19",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5c159998-7409-b1ec-dbdf-d8b7961fcfd5")
public static final String FIELDNAME_PartnerRequests_Self_Service="5c159998-7409-b1ec-dbdf-d8b7961fcfd5";

@XendraTrl(Identifier="dead45e8-2352-ed62-6adb-e9ff39571ec9")
public static String es_PE_FIELD_RequestsSource_Self_Service_Name="Auto-Servicio";

@XendraTrl(Identifier="dead45e8-2352-ed62-6adb-e9ff39571ec9")
public static String es_PE_FIELD_RequestsSource_Self_Service_Description="Esta es una entrada del autoservicio ó esta entrada se puede cambiar vía autoservicio";

@XendraTrl(Identifier="dead45e8-2352-ed62-6adb-e9ff39571ec9")
public static String es_PE_FIELD_RequestsSource_Self_Service_Help="El autoservicio permite que los usuarios incorporen datos o que pongan al día sus datos. La bandera indica, que este expediente fue incorporado o creado vía autoservicio o que el usuario puede cambiarlo vía funcionalidad del autoservicio.";

@XendraField(AD_Column_ID="IsSelfService",IsCentrallyMaintained=true,
AD_Tab_ID="c2cdcdde-0adb-ef52-0a9e-48cf3e306ac6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dead45e8-2352-ed62-6adb-e9ff39571ec9")
public static final String FIELDNAME_RequestsSource_Self_Service="dead45e8-2352-ed62-6adb-e9ff39571ec9";

@XendraTrl(Identifier="025ac5b0-54e2-38cb-d7c5-e3e9a71c9b04")
public static String es_PE_FIELD_RequestsSource_Self_Service2_Name="Auto-Servicio";

@XendraTrl(Identifier="025ac5b0-54e2-38cb-d7c5-e3e9a71c9b04")
public static String es_PE_FIELD_RequestsSource_Self_Service2_Description="Esta es una entrada del autoservicio ó esta entrada se puede cambiar vía autoservicio";

@XendraTrl(Identifier="025ac5b0-54e2-38cb-d7c5-e3e9a71c9b04")
public static String es_PE_FIELD_RequestsSource_Self_Service2_Help="El autoservicio permite que los usuarios incorporen datos o que pongan al día sus datos. La bandera indica, que este expediente fue incorporado o creado vía autoservicio o que el usuario puede cambiarlo vía funcionalidad del autoservicio.";

@XendraField(AD_Column_ID="IsSelfService",IsCentrallyMaintained=true,
AD_Tab_ID="8a4561d7-25be-5533-de4c-ab4735c335ee",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="025ac5b0-54e2-38cb-d7c5-e3e9a71c9b04")
public static final String FIELDNAME_RequestsSource_Self_Service2="025ac5b0-54e2-38cb-d7c5-e3e9a71c9b04";

@XendraTrl(Identifier="5e85ae50-559b-c381-cf93-036d10fc1ea9")
public static String es_PE_COLUMN_IsSelfService_Name="Auto-Servicio";

@XendraColumn(AD_Element_ID="8f201030-f9ab-66d2-f4de-7209f41f2af8",ColumnName="IsSelfService",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5e85ae50-559b-c381-cf93-036d10fc1ea9",
Synchronized="2019-08-30 22:23:47.0")
/** Column name IsSelfService */
public static final String COLUMNNAME_IsSelfService = "IsSelfService";
/** Set Last Result.
@param LastResult Result of last contact */
public void setLastResult (String LastResult)
{
if (LastResult != null && LastResult.length() > 2000)
{
log.warning("Length > 2000 - truncated");
LastResult = LastResult.substring(0,1999);
}
set_Value (COLUMNNAME_LastResult, LastResult);
}
/** Get Last Result.
@return Result of last contact */
public String getLastResult() 
{
String value = (String)get_Value(COLUMNNAME_LastResult);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="617789aa-f8e5-a509-7ab1-8cb90ef8417d")
public static String es_PE_FIELD_Request_LastResult_Name="Resultado Final";

@XendraTrl(Identifier="617789aa-f8e5-a509-7ab1-8cb90ef8417d")
public static String es_PE_FIELD_Request_LastResult_Description="Resultado del último contacto";

@XendraTrl(Identifier="617789aa-f8e5-a509-7ab1-8cb90ef8417d")
public static String es_PE_FIELD_Request_LastResult_Help="El Último resultado identifica el resultado del último contacto hecho.";

@XendraField(AD_Column_ID="LastResult",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="History",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=true,SeqNo=510,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="617789aa-f8e5-a509-7ab1-8cb90ef8417d")
public static final String FIELDNAME_Request_LastResult="617789aa-f8e5-a509-7ab1-8cb90ef8417d";

@XendraTrl(Identifier="5da36461-c6d4-a892-1daa-453b1516cb0c")
public static String es_PE_FIELD_Request_LastResult2_Name="Resultado Final";

@XendraTrl(Identifier="5da36461-c6d4-a892-1daa-453b1516cb0c")
public static String es_PE_FIELD_Request_LastResult2_Description="Resultado del último contacto";

@XendraTrl(Identifier="5da36461-c6d4-a892-1daa-453b1516cb0c")
public static String es_PE_FIELD_Request_LastResult2_Help="El Último resultado identifica el resultado del último contacto hecho.";

@XendraField(AD_Column_ID="LastResult",IsCentrallyMaintained=true,
AD_Tab_ID="a6082d0b-507b-9bdf-147b-9db501402eae",AD_FieldGroup_ID="History",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=true,SeqNo=450,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5da36461-c6d4-a892-1daa-453b1516cb0c")
public static final String FIELDNAME_Request_LastResult2="5da36461-c6d4-a892-1daa-453b1516cb0c";

@XendraTrl(Identifier="75fe0454-b1fd-9d38-805a-4c15ae65cce0")
public static String es_PE_FIELD_PartnerRequests_LastResult_Name="Resultado Final";

@XendraTrl(Identifier="75fe0454-b1fd-9d38-805a-4c15ae65cce0")
public static String es_PE_FIELD_PartnerRequests_LastResult_Description="Resultado del último contacto";

@XendraTrl(Identifier="75fe0454-b1fd-9d38-805a-4c15ae65cce0")
public static String es_PE_FIELD_PartnerRequests_LastResult_Help="El Último resultado identifica el resultado del último contacto hecho.";

@XendraField(AD_Column_ID="LastResult",IsCentrallyMaintained=true,
AD_Tab_ID="0a25fb60-7718-c6c9-b67f-7adeb07cfa19",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="75fe0454-b1fd-9d38-805a-4c15ae65cce0")
public static final String FIELDNAME_PartnerRequests_LastResult="75fe0454-b1fd-9d38-805a-4c15ae65cce0";

@XendraTrl(Identifier="42f834e2-49b9-6c1b-a011-32754f86501a")
public static String es_PE_FIELD_RequestsSource_LastResult_Name="Resultado Final";

@XendraTrl(Identifier="42f834e2-49b9-6c1b-a011-32754f86501a")
public static String es_PE_FIELD_RequestsSource_LastResult_Description="Resultado del último contacto";

@XendraTrl(Identifier="42f834e2-49b9-6c1b-a011-32754f86501a")
public static String es_PE_FIELD_RequestsSource_LastResult_Help="El Último resultado identifica el resultado del último contacto hecho.";

@XendraField(AD_Column_ID="LastResult",IsCentrallyMaintained=true,
AD_Tab_ID="c2cdcdde-0adb-ef52-0a9e-48cf3e306ac6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=true,SeqNo=210,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="42f834e2-49b9-6c1b-a011-32754f86501a")
public static final String FIELDNAME_RequestsSource_LastResult="42f834e2-49b9-6c1b-a011-32754f86501a";

@XendraTrl(Identifier="fe664439-e2a7-fb94-52fb-d20bbb602b53")
public static String es_PE_FIELD_RequestsSource_LastResult2_Name="Resultado Final";

@XendraTrl(Identifier="fe664439-e2a7-fb94-52fb-d20bbb602b53")
public static String es_PE_FIELD_RequestsSource_LastResult2_Description="Resultado del último contacto";

@XendraTrl(Identifier="fe664439-e2a7-fb94-52fb-d20bbb602b53")
public static String es_PE_FIELD_RequestsSource_LastResult2_Help="El Último resultado identifica el resultado del último contacto hecho.";

@XendraField(AD_Column_ID="LastResult",IsCentrallyMaintained=true,
AD_Tab_ID="8a4561d7-25be-5533-de4c-ab4735c335ee",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=true,SeqNo=210,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fe664439-e2a7-fb94-52fb-d20bbb602b53")
public static final String FIELDNAME_RequestsSource_LastResult2="fe664439-e2a7-fb94-52fb-d20bbb602b53";

@XendraTrl(Identifier="2a9b2f7c-743b-8319-f520-7ad073582373")
public static String es_PE_COLUMN_LastResult_Name="Resultado Final";

@XendraColumn(AD_Element_ID="fc0abc92-dbad-97a1-2c92-beb692f0e911",ColumnName="LastResult",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2a9b2f7c-743b-8319-f520-7ad073582373",
Synchronized="2019-08-30 22:23:47.0")
/** Column name LastResult */
public static final String COLUMNNAME_LastResult = "LastResult";
/** Set Change Request.
@param M_ChangeRequest_ID BOM (Engineering) Change Request */
public void setM_ChangeRequest_ID (int M_ChangeRequest_ID)
{
if (M_ChangeRequest_ID <= 0) set_Value (COLUMNNAME_M_ChangeRequest_ID, null);
 else 
set_Value (COLUMNNAME_M_ChangeRequest_ID, Integer.valueOf(M_ChangeRequest_ID));
}
/** Get Change Request.
@return BOM (Engineering) Change Request */
public int getM_ChangeRequest_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_ChangeRequest_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="339f318d-e25a-271f-5660-138918e26645")
public static String es_PE_FIELD_Request_ChangeRequest_Name="Cambio de Solicitud";

@XendraTrl(Identifier="339f318d-e25a-271f-5660-138918e26645")
public static String es_PE_FIELD_Request_ChangeRequest_Description="LDM (ingenieria) Cambio de solicitud";

@XendraTrl(Identifier="339f318d-e25a-271f-5660-138918e26645")
public static String es_PE_FIELD_Request_ChangeRequest_Help="Cambio de solicitud para una lista de materiales. Pueden ser creadas automáticamente las peticiones, en si está permitido el tipo de la petición y los referres del grupo de la petición a una cuenta de materiales";

@XendraField(AD_Column_ID="M_ChangeRequest_ID",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=560,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="339f318d-e25a-271f-5660-138918e26645")
public static final String FIELDNAME_Request_ChangeRequest="339f318d-e25a-271f-5660-138918e26645";

@XendraTrl(Identifier="889208ec-4ec8-ea79-0133-116e32d92fdb")
public static String es_PE_FIELD_RequestsSource_ChangeRequest_Name="Cambio de Solicitud";

@XendraTrl(Identifier="889208ec-4ec8-ea79-0133-116e32d92fdb")
public static String es_PE_FIELD_RequestsSource_ChangeRequest_Description="LDM (ingenieria) Cambio de solicitud";

@XendraTrl(Identifier="889208ec-4ec8-ea79-0133-116e32d92fdb")
public static String es_PE_FIELD_RequestsSource_ChangeRequest_Help="Cambio de solicitud para una lista de materiales. Pueden ser creadas automáticamente las peticiones, en si está permitido el tipo de la petición y los referres del grupo de la petición a una cuenta de materiales";

@XendraField(AD_Column_ID="M_ChangeRequest_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c2cdcdde-0adb-ef52-0a9e-48cf3e306ac6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="889208ec-4ec8-ea79-0133-116e32d92fdb")
public static final String FIELDNAME_RequestsSource_ChangeRequest="889208ec-4ec8-ea79-0133-116e32d92fdb";

@XendraTrl(Identifier="60b1e4f4-f888-d9c8-0027-40c0d9648fc1")
public static String es_PE_FIELD_RequestsSource_ChangeRequest2_Name="Cambio de Solicitud";

@XendraTrl(Identifier="60b1e4f4-f888-d9c8-0027-40c0d9648fc1")
public static String es_PE_FIELD_RequestsSource_ChangeRequest2_Description="LDM (ingenieria) Cambio de solicitud";

@XendraTrl(Identifier="60b1e4f4-f888-d9c8-0027-40c0d9648fc1")
public static String es_PE_FIELD_RequestsSource_ChangeRequest2_Help="Cambio de solicitud para una lista de materiales. Pueden ser creadas automáticamente las peticiones, en si está permitido el tipo de la petición y los referres del grupo de la petición a una cuenta de materiales";

@XendraField(AD_Column_ID="M_ChangeRequest_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8a4561d7-25be-5533-de4c-ab4735c335ee",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="60b1e4f4-f888-d9c8-0027-40c0d9648fc1")
public static final String FIELDNAME_RequestsSource_ChangeRequest2="60b1e4f4-f888-d9c8-0027-40c0d9648fc1";

@XendraTrl(Identifier="d71abda3-ee4a-64fc-f5ee-6a0a9491a409")
public static String es_PE_COLUMN_M_ChangeRequest_ID_Name="Cambio de Solicitud";

@XendraColumn(AD_Element_ID="d9915237-a3b0-6915-9a1a-4024fb310876",ColumnName="M_ChangeRequest_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d71abda3-ee4a-64fc-f5ee-6a0a9491a409",
Synchronized="2019-08-30 22:23:47.0")
/** Column name M_ChangeRequest_ID */
public static final String COLUMNNAME_M_ChangeRequest_ID = "M_ChangeRequest_ID";
/** Set Fixed in.
@param M_FixChangeNotice_ID Fixed in Change Notice */
public void setM_FixChangeNotice_ID (int M_FixChangeNotice_ID)
{
if (M_FixChangeNotice_ID <= 0) set_Value (COLUMNNAME_M_FixChangeNotice_ID, null);
 else 
set_Value (COLUMNNAME_M_FixChangeNotice_ID, Integer.valueOf(M_FixChangeNotice_ID));
}
/** Get Fixed in.
@return Fixed in Change Notice */
public int getM_FixChangeNotice_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_FixChangeNotice_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1798285a-06fc-84bd-275f-cdc2cc7f6ddd")
public static String es_PE_FIELD_Request_FixedIn_Name="Corregido en";

@XendraTrl(Identifier="1798285a-06fc-84bd-275f-cdc2cc7f6ddd")
public static String es_PE_FIELD_Request_FixedIn_Description="Corregido en aviso del cambio";

@XendraField(AD_Column_ID="M_FixChangeNotice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@R_Resolution_ID@!0",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="1798285a-06fc-84bd-275f-cdc2cc7f6ddd")
public static final String FIELDNAME_Request_FixedIn="1798285a-06fc-84bd-275f-cdc2cc7f6ddd";

@XendraTrl(Identifier="1a3a6c88-d716-bb7c-34b7-2d09ddf5ec0d")
public static String es_PE_COLUMN_M_FixChangeNotice_ID_Name="Corregido en";

@XendraColumn(AD_Element_ID="79c683fa-b126-7371-0143-7aa8e7e6bcff",
ColumnName="M_FixChangeNotice_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="71c8e798-e72b-e0db-0a1a-3dc12b8f0b92",AD_Val_Rule_ID="",FieldLength=10,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="1a3a6c88-d716-bb7c-34b7-2d09ddf5ec0d",
Synchronized="2019-08-30 22:23:47.0")
/** Column name M_FixChangeNotice_ID */
public static final String COLUMNNAME_M_FixChangeNotice_ID = "M_FixChangeNotice_ID";
/** Set Shipment/Receipt.
@param M_InOut_ID Material Shipment Document */
public void setM_InOut_ID (int M_InOut_ID)
{
if (M_InOut_ID <= 0) set_Value (COLUMNNAME_M_InOut_ID, null);
 else 
set_Value (COLUMNNAME_M_InOut_ID, Integer.valueOf(M_InOut_ID));
}
/** Get Shipment/Receipt.
@return Material Shipment Document */
public int getM_InOut_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_InOut_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d9eacf8c-da37-7604-85e3-2125db1807e7")
public static String es_PE_FIELD_Request_ShipmentReceipt_Name="Entrega / Recibo";

@XendraTrl(Identifier="d9eacf8c-da37-7604-85e3-2125db1807e7")
public static String es_PE_FIELD_Request_ShipmentReceipt_Description="Entrega ó documento de recibo";

@XendraTrl(Identifier="d9eacf8c-da37-7604-85e3-2125db1807e7")
public static String es_PE_FIELD_Request_ShipmentReceipt_Help="La ID de Entrega / Recibo indica el documento único para esta entrega ó recibo";

@XendraField(AD_Column_ID="M_InOut_ID",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=430,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d9eacf8c-da37-7604-85e3-2125db1807e7")
public static final String FIELDNAME_Request_ShipmentReceipt="d9eacf8c-da37-7604-85e3-2125db1807e7";

@XendraTrl(Identifier="39588c4f-5f37-56a6-bbe4-81e1881f655b")
public static String es_PE_FIELD_Request_ShipmentReceipt2_Name="Entrega / Recibo";

@XendraTrl(Identifier="39588c4f-5f37-56a6-bbe4-81e1881f655b")
public static String es_PE_FIELD_Request_ShipmentReceipt2_Description="Entrega ó documento de recibo";

@XendraTrl(Identifier="39588c4f-5f37-56a6-bbe4-81e1881f655b")
public static String es_PE_FIELD_Request_ShipmentReceipt2_Help="La ID de Entrega / Recibo indica el documento único para esta entrega ó recibo";

@XendraField(AD_Column_ID="M_InOut_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a6082d0b-507b-9bdf-147b-9db501402eae",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=370,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="39588c4f-5f37-56a6-bbe4-81e1881f655b")
public static final String FIELDNAME_Request_ShipmentReceipt2="39588c4f-5f37-56a6-bbe4-81e1881f655b";

@XendraTrl(Identifier="ee338fe7-42e2-c9ae-d69f-9f39150263cf")
public static String es_PE_FIELD_PartnerRequests_ShipmentReceipt_Name="Entrega / Recibo";

@XendraTrl(Identifier="ee338fe7-42e2-c9ae-d69f-9f39150263cf")
public static String es_PE_FIELD_PartnerRequests_ShipmentReceipt_Description="Entrega ó documento de recibo";

@XendraTrl(Identifier="ee338fe7-42e2-c9ae-d69f-9f39150263cf")
public static String es_PE_FIELD_PartnerRequests_ShipmentReceipt_Help="La ID de Entrega / Recibo indica el documento único para esta entrega ó recibo";

@XendraField(AD_Column_ID="M_InOut_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a25fb60-7718-c6c9-b67f-7adeb07cfa19",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ee338fe7-42e2-c9ae-d69f-9f39150263cf")
public static final String FIELDNAME_PartnerRequests_ShipmentReceipt="ee338fe7-42e2-c9ae-d69f-9f39150263cf";

@XendraTrl(Identifier="627bd83b-eebc-06df-3203-c30864e4eab4")
public static String es_PE_FIELD_RequestsSource_ShipmentReceipt_Name="Entrega / Recibo";

@XendraTrl(Identifier="627bd83b-eebc-06df-3203-c30864e4eab4")
public static String es_PE_FIELD_RequestsSource_ShipmentReceipt_Description="Entrega ó documento de recibo";

@XendraTrl(Identifier="627bd83b-eebc-06df-3203-c30864e4eab4")
public static String es_PE_FIELD_RequestsSource_ShipmentReceipt_Help="La ID de Entrega / Recibo indica el documento único para esta entrega ó recibo";

@XendraField(AD_Column_ID="M_InOut_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c2cdcdde-0adb-ef52-0a9e-48cf3e306ac6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="627bd83b-eebc-06df-3203-c30864e4eab4")
public static final String FIELDNAME_RequestsSource_ShipmentReceipt="627bd83b-eebc-06df-3203-c30864e4eab4";

@XendraTrl(Identifier="f81fe2a4-0b5d-7685-f671-2d5ef9ecd650")
public static String es_PE_FIELD_RequestsSource_ShipmentReceipt2_Name="Entrega / Recibo";

@XendraTrl(Identifier="f81fe2a4-0b5d-7685-f671-2d5ef9ecd650")
public static String es_PE_FIELD_RequestsSource_ShipmentReceipt2_Description="Entrega ó documento de recibo";

@XendraTrl(Identifier="f81fe2a4-0b5d-7685-f671-2d5ef9ecd650")
public static String es_PE_FIELD_RequestsSource_ShipmentReceipt2_Help="La ID de Entrega / Recibo indica el documento único para esta entrega ó recibo";

@XendraField(AD_Column_ID="M_InOut_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8a4561d7-25be-5533-de4c-ab4735c335ee",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f81fe2a4-0b5d-7685-f671-2d5ef9ecd650")
public static final String FIELDNAME_RequestsSource_ShipmentReceipt2="f81fe2a4-0b5d-7685-f671-2d5ef9ecd650";

@XendraTrl(Identifier="375e47cb-1c46-e9ab-064c-e5304ba12526")
public static String es_PE_COLUMN_M_InOut_ID_Name="Entrega / Recibo";

@XendraColumn(AD_Element_ID="5c1a0edf-01a0-832e-098b-d49510db71db",ColumnName="M_InOut_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="375e47cb-1c46-e9ab-064c-e5304ba12526",
Synchronized="2019-08-30 22:23:47.0")
/** Column name M_InOut_ID */
public static final String COLUMNNAME_M_InOut_ID = "M_InOut_ID";
/** Set Product.
@param M_Product_ID Product, Service, Item */
public void setM_Product_ID (int M_Product_ID)
{
if (M_Product_ID <= 0) set_Value (COLUMNNAME_M_Product_ID, null);
 else 
set_Value (COLUMNNAME_M_Product_ID, Integer.valueOf(M_Product_ID));
}
/** Get Product.
@return Product, Service, Item */
public int getM_Product_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="fc84f921-4075-2cf1-03ad-c647fd9d6836")
public static String es_PE_FIELD_Request_Product_Name="Producto";

@XendraTrl(Identifier="fc84f921-4075-2cf1-03ad-c647fd9d6836")
public static String es_PE_FIELD_Request_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="fc84f921-4075-2cf1-03ad-c647fd9d6836")
public static String es_PE_FIELD_Request_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=410,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fc84f921-4075-2cf1-03ad-c647fd9d6836")
public static final String FIELDNAME_Request_Product="fc84f921-4075-2cf1-03ad-c647fd9d6836";

@XendraTrl(Identifier="97cb58b9-2f1f-590b-e0b1-247d3c0e3365")
public static String es_PE_FIELD_Request_Product2_Name="Producto";

@XendraTrl(Identifier="97cb58b9-2f1f-590b-e0b1-247d3c0e3365")
public static String es_PE_FIELD_Request_Product2_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="97cb58b9-2f1f-590b-e0b1-247d3c0e3365")
public static String es_PE_FIELD_Request_Product2_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a6082d0b-507b-9bdf-147b-9db501402eae",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=350,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="97cb58b9-2f1f-590b-e0b1-247d3c0e3365")
public static final String FIELDNAME_Request_Product2="97cb58b9-2f1f-590b-e0b1-247d3c0e3365";

@XendraTrl(Identifier="b9b2a0dd-2ef1-e55a-7d90-65da14753090")
public static String es_PE_FIELD_PartnerRequests_Product_Name="Producto";

@XendraTrl(Identifier="b9b2a0dd-2ef1-e55a-7d90-65da14753090")
public static String es_PE_FIELD_PartnerRequests_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="b9b2a0dd-2ef1-e55a-7d90-65da14753090")
public static String es_PE_FIELD_PartnerRequests_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a25fb60-7718-c6c9-b67f-7adeb07cfa19",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b9b2a0dd-2ef1-e55a-7d90-65da14753090")
public static final String FIELDNAME_PartnerRequests_Product="b9b2a0dd-2ef1-e55a-7d90-65da14753090";

@XendraTrl(Identifier="edf58be7-c69d-b59a-42c5-33866486dd8e")
public static String es_PE_FIELD_RequestsSource_Product_Name="Producto";

@XendraTrl(Identifier="edf58be7-c69d-b59a-42c5-33866486dd8e")
public static String es_PE_FIELD_RequestsSource_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="edf58be7-c69d-b59a-42c5-33866486dd8e")
public static String es_PE_FIELD_RequestsSource_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c2cdcdde-0adb-ef52-0a9e-48cf3e306ac6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="edf58be7-c69d-b59a-42c5-33866486dd8e")
public static final String FIELDNAME_RequestsSource_Product="edf58be7-c69d-b59a-42c5-33866486dd8e";

@XendraTrl(Identifier="1c3669fa-b200-94fa-7aca-8dab7dac5cd9")
public static String es_PE_FIELD_RequestsSource_Product2_Name="Producto";

@XendraTrl(Identifier="1c3669fa-b200-94fa-7aca-8dab7dac5cd9")
public static String es_PE_FIELD_RequestsSource_Product2_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="1c3669fa-b200-94fa-7aca-8dab7dac5cd9")
public static String es_PE_FIELD_RequestsSource_Product2_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8a4561d7-25be-5533-de4c-ab4735c335ee",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1c3669fa-b200-94fa-7aca-8dab7dac5cd9")
public static final String FIELDNAME_RequestsSource_Product2="1c3669fa-b200-94fa-7aca-8dab7dac5cd9";

@XendraTrl(Identifier="79d40143-54a1-134c-d050-5eaa4652d336")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="4281f8eb-238e-6b28-eb66-8cc866e6312c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="79d40143-54a1-134c-d050-5eaa4652d336",Synchronized="2019-08-30 22:23:47.0")
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

@XendraTrl(Identifier="2790474f-d05e-e664-6bff-3a814189d577")
public static String es_PE_FIELD_Request_ProductUsed_Name="Producto Usado";

@XendraTrl(Identifier="2790474f-d05e-e664-6bff-3a814189d577")
public static String es_PE_FIELD_Request_ProductUsed_Description="Producto/Solicitud/Servicio usado en una solicitud";

@XendraTrl(Identifier="2790474f-d05e-e664-6bff-3a814189d577")
public static String es_PE_FIELD_Request_ProductUsed_Help="La facturación utiliza el producto usado.";

@XendraField(AD_Column_ID="M_ProductSpent_ID",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=250,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2790474f-d05e-e664-6bff-3a814189d577")
public static final String FIELDNAME_Request_ProductUsed="2790474f-d05e-e664-6bff-3a814189d577";

@XendraTrl(Identifier="d29f3910-82ea-6b90-0bea-16a516f26cd8")
public static String es_PE_FIELD_Request_ProductUsed2_Name="Producto Usado";

@XendraTrl(Identifier="d29f3910-82ea-6b90-0bea-16a516f26cd8")
public static String es_PE_FIELD_Request_ProductUsed2_Description="Producto/Solicitud/Servicio usado en una solicitud";

@XendraTrl(Identifier="d29f3910-82ea-6b90-0bea-16a516f26cd8")
public static String es_PE_FIELD_Request_ProductUsed2_Help="La facturación utiliza el producto usado.";

@XendraField(AD_Column_ID="M_ProductSpent_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a6082d0b-507b-9bdf-147b-9db501402eae",AD_FieldGroup_ID="Action",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=270,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d29f3910-82ea-6b90-0bea-16a516f26cd8")
public static final String FIELDNAME_Request_ProductUsed2="d29f3910-82ea-6b90-0bea-16a516f26cd8";

@XendraTrl(Identifier="5d5aee3e-27b5-7528-b963-829c1511e5c5")
public static String es_PE_FIELD_PartnerRequests_ProductUsed_Name="Producto Usado";

@XendraTrl(Identifier="5d5aee3e-27b5-7528-b963-829c1511e5c5")
public static String es_PE_FIELD_PartnerRequests_ProductUsed_Description="Producto/Solicitud/Servicio usado en una solicitud";

@XendraTrl(Identifier="5d5aee3e-27b5-7528-b963-829c1511e5c5")
public static String es_PE_FIELD_PartnerRequests_ProductUsed_Help="La facturación utiliza el producto usado.";

@XendraField(AD_Column_ID="M_ProductSpent_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a25fb60-7718-c6c9-b67f-7adeb07cfa19",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5d5aee3e-27b5-7528-b963-829c1511e5c5")
public static final String FIELDNAME_PartnerRequests_ProductUsed="5d5aee3e-27b5-7528-b963-829c1511e5c5";

@XendraTrl(Identifier="10d7cb0c-0d00-4f29-0604-39ca684badf3")
public static String es_PE_FIELD_RequestsSource_ProductUsed_Name="Producto Usado";

@XendraTrl(Identifier="10d7cb0c-0d00-4f29-0604-39ca684badf3")
public static String es_PE_FIELD_RequestsSource_ProductUsed_Description="Producto/Solicitud/Servicio usado en una solicitud";

@XendraTrl(Identifier="10d7cb0c-0d00-4f29-0604-39ca684badf3")
public static String es_PE_FIELD_RequestsSource_ProductUsed_Help="La facturación utiliza el producto usado.";

@XendraField(AD_Column_ID="M_ProductSpent_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c2cdcdde-0adb-ef52-0a9e-48cf3e306ac6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="10d7cb0c-0d00-4f29-0604-39ca684badf3")
public static final String FIELDNAME_RequestsSource_ProductUsed="10d7cb0c-0d00-4f29-0604-39ca684badf3";

@XendraTrl(Identifier="9075bb51-7c57-c83f-3d77-72aeaa0d8b3a")
public static String es_PE_FIELD_RequestsSource_ProductUsed2_Name="Producto Usado";

@XendraTrl(Identifier="9075bb51-7c57-c83f-3d77-72aeaa0d8b3a")
public static String es_PE_FIELD_RequestsSource_ProductUsed2_Description="Producto/Solicitud/Servicio usado en una solicitud";

@XendraTrl(Identifier="9075bb51-7c57-c83f-3d77-72aeaa0d8b3a")
public static String es_PE_FIELD_RequestsSource_ProductUsed2_Help="La facturación utiliza el producto usado.";

@XendraField(AD_Column_ID="M_ProductSpent_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8a4561d7-25be-5533-de4c-ab4735c335ee",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9075bb51-7c57-c83f-3d77-72aeaa0d8b3a")
public static final String FIELDNAME_RequestsSource_ProductUsed2="9075bb51-7c57-c83f-3d77-72aeaa0d8b3a";

@XendraTrl(Identifier="f0e7f5bd-6936-d5f5-15a9-cd388a055695")
public static String es_PE_COLUMN_M_ProductSpent_ID_Name="Producto Usado";

@XendraColumn(AD_Element_ID="ed41cfa1-c930-9b0e-9136-75c88fa6f1f7",ColumnName="M_ProductSpent_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="28b49c4d-0409-b2e0-b70e-d686f8d6503f",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="f0e7f5bd-6936-d5f5-15a9-cd388a055695",Synchronized="2019-08-30 22:23:47.0")
/** Column name M_ProductSpent_ID */
public static final String COLUMNNAME_M_ProductSpent_ID = "M_ProductSpent_ID";
/** Set RMA.
@param M_RMA_ID Return Material Authorization */
public void setM_RMA_ID (int M_RMA_ID)
{
if (M_RMA_ID <= 0) set_Value (COLUMNNAME_M_RMA_ID, null);
 else 
set_Value (COLUMNNAME_M_RMA_ID, Integer.valueOf(M_RMA_ID));
}
/** Get RMA.
@return Return Material Authorization */
public int getM_RMA_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_RMA_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="fb856387-3d40-412a-4c07-3273a7eb5db0")
public static String es_PE_FIELD_Request_RMA_Name="ADM (RMA)";

@XendraTrl(Identifier="fb856387-3d40-412a-4c07-3273a7eb5db0")
public static String es_PE_FIELD_Request_RMA_Description="Autorización de Devolución de Material";

@XendraTrl(Identifier="fb856387-3d40-412a-4c07-3273a7eb5db0")
public static String es_PE_FIELD_Request_RMA_Help="La Autorización de Devolución de Material se requiere para aceptar devoluciones y para crear memos de credito.";

@XendraField(AD_Column_ID="M_RMA_ID",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=440,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fb856387-3d40-412a-4c07-3273a7eb5db0")
public static final String FIELDNAME_Request_RMA="fb856387-3d40-412a-4c07-3273a7eb5db0";

@XendraTrl(Identifier="05b9f188-bbee-31c5-7431-0e25086864a7")
public static String es_PE_FIELD_Request_RMA2_Name="ADM (RMA)";

@XendraTrl(Identifier="05b9f188-bbee-31c5-7431-0e25086864a7")
public static String es_PE_FIELD_Request_RMA2_Description="Autorización de Devolución de Material";

@XendraTrl(Identifier="05b9f188-bbee-31c5-7431-0e25086864a7")
public static String es_PE_FIELD_Request_RMA2_Help="La Autorización de Devolución de Material se requiere para aceptar devoluciones y para crear memos de credito.";

@XendraField(AD_Column_ID="M_RMA_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a6082d0b-507b-9bdf-147b-9db501402eae",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=380,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="05b9f188-bbee-31c5-7431-0e25086864a7")
public static final String FIELDNAME_Request_RMA2="05b9f188-bbee-31c5-7431-0e25086864a7";

@XendraTrl(Identifier="995a2ce8-3037-6f50-31df-9ee53d53675a")
public static String es_PE_FIELD_PartnerRequests_RMA_Name="ADM (RMA)";

@XendraTrl(Identifier="995a2ce8-3037-6f50-31df-9ee53d53675a")
public static String es_PE_FIELD_PartnerRequests_RMA_Description="Autorización de Devolución de Material";

@XendraTrl(Identifier="995a2ce8-3037-6f50-31df-9ee53d53675a")
public static String es_PE_FIELD_PartnerRequests_RMA_Help="La Autorización de Devolución de Material se requiere para aceptar devoluciones y para crear memos de credito.";

@XendraField(AD_Column_ID="M_RMA_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a25fb60-7718-c6c9-b67f-7adeb07cfa19",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="995a2ce8-3037-6f50-31df-9ee53d53675a")
public static final String FIELDNAME_PartnerRequests_RMA="995a2ce8-3037-6f50-31df-9ee53d53675a";

@XendraTrl(Identifier="0337a411-c07a-ea1e-5000-0afd1cf16c34")
public static String es_PE_FIELD_RequestsSource_RMA_Name="ADM (RMA)";

@XendraTrl(Identifier="0337a411-c07a-ea1e-5000-0afd1cf16c34")
public static String es_PE_FIELD_RequestsSource_RMA_Description="Autorización de Devolución de Material";

@XendraTrl(Identifier="0337a411-c07a-ea1e-5000-0afd1cf16c34")
public static String es_PE_FIELD_RequestsSource_RMA_Help="La Autorización de Devolución de Material se requiere para aceptar devoluciones y para crear memos de credito.";

@XendraField(AD_Column_ID="M_RMA_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c2cdcdde-0adb-ef52-0a9e-48cf3e306ac6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0337a411-c07a-ea1e-5000-0afd1cf16c34")
public static final String FIELDNAME_RequestsSource_RMA="0337a411-c07a-ea1e-5000-0afd1cf16c34";

@XendraTrl(Identifier="89fbe004-e6f7-8d8d-391a-6b995fd3724a")
public static String es_PE_FIELD_RequestsSource_RMA2_Name="ADM (RMA)";

@XendraTrl(Identifier="89fbe004-e6f7-8d8d-391a-6b995fd3724a")
public static String es_PE_FIELD_RequestsSource_RMA2_Description="Autorización de Devolución de Material";

@XendraTrl(Identifier="89fbe004-e6f7-8d8d-391a-6b995fd3724a")
public static String es_PE_FIELD_RequestsSource_RMA2_Help="La Autorización de Devolución de Material se requiere para aceptar devoluciones y para crear memos de credito.";

@XendraField(AD_Column_ID="M_RMA_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8a4561d7-25be-5533-de4c-ab4735c335ee",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="89fbe004-e6f7-8d8d-391a-6b995fd3724a")
public static final String FIELDNAME_RequestsSource_RMA2="89fbe004-e6f7-8d8d-391a-6b995fd3724a";

@XendraTrl(Identifier="b3029a64-79e5-66b5-ceb7-24c0f515d0d2")
public static String es_PE_COLUMN_M_RMA_ID_Name="ADM (RMA)";

@XendraColumn(AD_Element_ID="99f41ef6-5c78-3288-c0ff-9495a4714c13",ColumnName="M_RMA_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b3029a64-79e5-66b5-ceb7-24c0f515d0d2",
Synchronized="2019-08-30 22:23:47.0")
/** Column name M_RMA_ID */
public static final String COLUMNNAME_M_RMA_ID = "M_RMA_ID";
/** Set Next action.
@param NextAction Next Action to be taken */
public void setNextAction (String NextAction)
{
if (NextAction != null && NextAction.length() > 1)
{
log.warning("Length > 1 - truncated");
NextAction = NextAction.substring(0,0);
}
set_Value (COLUMNNAME_NextAction, NextAction);
}
/** Get Next action.
@return Next Action to be taken */
public String getNextAction() 
{
return (String)get_Value(COLUMNNAME_NextAction);
}

@XendraTrl(Identifier="047b7b5c-c76d-01be-6dbf-fba63764f01c")
public static String es_PE_FIELD_Request_NextAction_Name="Siguiente Acción";

@XendraTrl(Identifier="047b7b5c-c76d-01be-6dbf-fba63764f01c")
public static String es_PE_FIELD_Request_NextAction_Description="Siguiente Acción a ser tomada";

@XendraTrl(Identifier="047b7b5c-c76d-01be-6dbf-fba63764f01c")
public static String es_PE_FIELD_Request_NextAction_Help="La acción siguiente indica la siguiente acción a ser tomada en este requerimiento.";

@XendraField(AD_Column_ID="NextAction",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="Action",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="047b7b5c-c76d-01be-6dbf-fba63764f01c")
public static final String FIELDNAME_Request_NextAction="047b7b5c-c76d-01be-6dbf-fba63764f01c";

@XendraTrl(Identifier="67c360ce-9ef4-e78e-44b2-4599d86ba680")
public static String es_PE_FIELD_Request_NextAction2_Name="Siguiente Acción";

@XendraTrl(Identifier="67c360ce-9ef4-e78e-44b2-4599d86ba680")
public static String es_PE_FIELD_Request_NextAction2_Description="Siguiente Acción a ser tomada";

@XendraTrl(Identifier="67c360ce-9ef4-e78e-44b2-4599d86ba680")
public static String es_PE_FIELD_Request_NextAction2_Help="La acción siguiente indica la siguiente acción a ser tomada en este requerimiento.";

@XendraField(AD_Column_ID="NextAction",IsCentrallyMaintained=true,
AD_Tab_ID="a6082d0b-507b-9bdf-147b-9db501402eae",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="67c360ce-9ef4-e78e-44b2-4599d86ba680")
public static final String FIELDNAME_Request_NextAction2="67c360ce-9ef4-e78e-44b2-4599d86ba680";

@XendraTrl(Identifier="0d588b63-fd5f-36b6-411f-60fb266c9dac")
public static String es_PE_FIELD_PartnerRequests_NextAction_Name="Siguiente Acción";

@XendraTrl(Identifier="0d588b63-fd5f-36b6-411f-60fb266c9dac")
public static String es_PE_FIELD_PartnerRequests_NextAction_Description="Siguiente Acción a ser tomada";

@XendraTrl(Identifier="0d588b63-fd5f-36b6-411f-60fb266c9dac")
public static String es_PE_FIELD_PartnerRequests_NextAction_Help="La acción siguiente indica la siguiente acción a ser tomada en este requerimiento.";

@XendraField(AD_Column_ID="NextAction",IsCentrallyMaintained=true,
AD_Tab_ID="0a25fb60-7718-c6c9-b67f-7adeb07cfa19",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0d588b63-fd5f-36b6-411f-60fb266c9dac")
public static final String FIELDNAME_PartnerRequests_NextAction="0d588b63-fd5f-36b6-411f-60fb266c9dac";

@XendraTrl(Identifier="6a04ba11-c2f6-bd22-0c43-236052811ca9")
public static String es_PE_FIELD_RequestsSource_NextAction_Name="Siguiente Acción";

@XendraTrl(Identifier="6a04ba11-c2f6-bd22-0c43-236052811ca9")
public static String es_PE_FIELD_RequestsSource_NextAction_Description="Siguiente Acción a ser tomada";

@XendraTrl(Identifier="6a04ba11-c2f6-bd22-0c43-236052811ca9")
public static String es_PE_FIELD_RequestsSource_NextAction_Help="La acción siguiente indica la siguiente acción a ser tomada en este requerimiento.";

@XendraField(AD_Column_ID="NextAction",IsCentrallyMaintained=true,
AD_Tab_ID="c2cdcdde-0adb-ef52-0a9e-48cf3e306ac6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6a04ba11-c2f6-bd22-0c43-236052811ca9")
public static final String FIELDNAME_RequestsSource_NextAction="6a04ba11-c2f6-bd22-0c43-236052811ca9";

@XendraTrl(Identifier="a1a916ee-d84d-6f95-28cb-2a4436e01856")
public static String es_PE_FIELD_RequestsSource_NextAction2_Name="Siguiente Acción";

@XendraTrl(Identifier="a1a916ee-d84d-6f95-28cb-2a4436e01856")
public static String es_PE_FIELD_RequestsSource_NextAction2_Description="Siguiente Acción a ser tomada";

@XendraTrl(Identifier="a1a916ee-d84d-6f95-28cb-2a4436e01856")
public static String es_PE_FIELD_RequestsSource_NextAction2_Help="La acción siguiente indica la siguiente acción a ser tomada en este requerimiento.";

@XendraField(AD_Column_ID="NextAction",IsCentrallyMaintained=true,
AD_Tab_ID="8a4561d7-25be-5533-de4c-ab4735c335ee",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a1a916ee-d84d-6f95-28cb-2a4436e01856")
public static final String FIELDNAME_RequestsSource_NextAction2="a1a916ee-d84d-6f95-28cb-2a4436e01856";

@XendraTrl(Identifier="9a2f43a3-e9e0-534f-8e55-5d8713d39355")
public static String es_PE_COLUMN_NextAction_Name="Siguiente Acción";

@XendraColumn(AD_Element_ID="3326daeb-f822-a8c2-90fe-7ada807c97ce",ColumnName="NextAction",
AD_Reference_ID=17,AD_Reference_Value_ID="a38cdf5f-bdcc-ae00-7fca-c12a70399474",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="F",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="9a2f43a3-e9e0-534f-8e55-5d8713d39355",Synchronized="2019-08-30 22:23:47.0")
/** Column name NextAction */
public static final String COLUMNNAME_NextAction = "NextAction";
/** Set Priority.
@param Priority Indicates if this request is of a high, medium or low priority. */
public void setPriority (String Priority)
{
if (Priority.length() > 1)
{
log.warning("Length > 1 - truncated");
Priority = Priority.substring(0,0);
}
set_Value (COLUMNNAME_Priority, Priority);
}
/** Get Priority.
@return Indicates if this request is of a high, medium or low priority. */
public String getPriority() 
{
return (String)get_Value(COLUMNNAME_Priority);
}

@XendraTrl(Identifier="1f24e297-bee1-0fa1-5c22-3e6f45485c3a")
public static String es_PE_FIELD_Request_Priority_Name="Prioridad";

@XendraTrl(Identifier="1f24e297-bee1-0fa1-5c22-3e6f45485c3a")
public static String es_PE_FIELD_Request_Priority_Description="Indica si este requerimiento es de una alta; media ó baja prioridad";

@XendraTrl(Identifier="1f24e297-bee1-0fa1-5c22-3e6f45485c3a")
public static String es_PE_FIELD_Request_Priority_Help="La Prioridad indica la importancia de este requerimiento";

@XendraField(AD_Column_ID="Priority",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=2,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1f24e297-bee1-0fa1-5c22-3e6f45485c3a")
public static final String FIELDNAME_Request_Priority="1f24e297-bee1-0fa1-5c22-3e6f45485c3a";

@XendraTrl(Identifier="059821da-5822-f067-e749-6475d0f4e7e3")
public static String es_PE_FIELD_Request_Priority2_Name="Prioridad";

@XendraTrl(Identifier="059821da-5822-f067-e749-6475d0f4e7e3")
public static String es_PE_FIELD_Request_Priority2_Description="Indica si este requerimiento es de una alta; media ó baja prioridad";

@XendraTrl(Identifier="059821da-5822-f067-e749-6475d0f4e7e3")
public static String es_PE_FIELD_Request_Priority2_Help="La Prioridad indica la importancia de este requerimiento";

@XendraField(AD_Column_ID="Priority",IsCentrallyMaintained=true,
AD_Tab_ID="a6082d0b-507b-9bdf-147b-9db501402eae",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=2,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="059821da-5822-f067-e749-6475d0f4e7e3")
public static final String FIELDNAME_Request_Priority2="059821da-5822-f067-e749-6475d0f4e7e3";

@XendraTrl(Identifier="8545102e-d147-3960-85ae-f2bbe1de04d4")
public static String es_PE_FIELD_PartnerRequests_Priority_Name="Prioridad";

@XendraTrl(Identifier="8545102e-d147-3960-85ae-f2bbe1de04d4")
public static String es_PE_FIELD_PartnerRequests_Priority_Description="Indica si este requerimiento es de una alta; media ó baja prioridad";

@XendraTrl(Identifier="8545102e-d147-3960-85ae-f2bbe1de04d4")
public static String es_PE_FIELD_PartnerRequests_Priority_Help="La Prioridad indica la importancia de este requerimiento";

@XendraField(AD_Column_ID="Priority",IsCentrallyMaintained=true,
AD_Tab_ID="0a25fb60-7718-c6c9-b67f-7adeb07cfa19",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8545102e-d147-3960-85ae-f2bbe1de04d4")
public static final String FIELDNAME_PartnerRequests_Priority="8545102e-d147-3960-85ae-f2bbe1de04d4";

@XendraTrl(Identifier="ca254d72-06fb-c491-dd31-2c46ff0259c5")
public static String es_PE_FIELD_RequestsSource_Priority_Name="Prioridad";

@XendraTrl(Identifier="ca254d72-06fb-c491-dd31-2c46ff0259c5")
public static String es_PE_FIELD_RequestsSource_Priority_Description="Indica si este requerimiento es de una alta; media ó baja prioridad";

@XendraTrl(Identifier="ca254d72-06fb-c491-dd31-2c46ff0259c5")
public static String es_PE_FIELD_RequestsSource_Priority_Help="La Prioridad indica la importancia de este requerimiento";

@XendraField(AD_Column_ID="Priority",IsCentrallyMaintained=true,
AD_Tab_ID="c2cdcdde-0adb-ef52-0a9e-48cf3e306ac6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ca254d72-06fb-c491-dd31-2c46ff0259c5")
public static final String FIELDNAME_RequestsSource_Priority="ca254d72-06fb-c491-dd31-2c46ff0259c5";

@XendraTrl(Identifier="2141310d-8757-83d0-46ac-725d7b541716")
public static String es_PE_FIELD_RequestsSource_Priority2_Name="Prioridad";

@XendraTrl(Identifier="2141310d-8757-83d0-46ac-725d7b541716")
public static String es_PE_FIELD_RequestsSource_Priority2_Description="Indica si este requerimiento es de una alta; media ó baja prioridad";

@XendraTrl(Identifier="2141310d-8757-83d0-46ac-725d7b541716")
public static String es_PE_FIELD_RequestsSource_Priority2_Help="La Prioridad indica la importancia de este requerimiento";

@XendraField(AD_Column_ID="Priority",IsCentrallyMaintained=true,
AD_Tab_ID="8a4561d7-25be-5533-de4c-ab4735c335ee",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2141310d-8757-83d0-46ac-725d7b541716")
public static final String FIELDNAME_RequestsSource_Priority2="2141310d-8757-83d0-46ac-725d7b541716";

@XendraTrl(Identifier="b036b5c4-7c5a-ce16-2a8b-3defe6db3375")
public static String es_PE_COLUMN_Priority_Name="Prioridad";

@XendraColumn(AD_Element_ID="5057921e-c21f-a6bc-898d-053fcc239847",ColumnName="Priority",
AD_Reference_ID=17,AD_Reference_Value_ID="bfacaeda-bbb9-ba51-d726-52826206b4d7",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="5",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="b036b5c4-7c5a-ce16-2a8b-3defe6db3375",Synchronized="2019-08-30 22:23:47.0")
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
set_Value (COLUMNNAME_PriorityUser, PriorityUser);
}
/** Get User Importance.
@return Priority of the issue for the User */
public String getPriorityUser() 
{
return (String)get_Value(COLUMNNAME_PriorityUser);
}

@XendraTrl(Identifier="6b0dd7a7-438e-b846-934c-82b261247558")
public static String es_PE_FIELD_Request_UserImportance_Name="Importancia del Usuario";

@XendraTrl(Identifier="6b0dd7a7-438e-b846-934c-82b261247558")
public static String es_PE_FIELD_Request_UserImportance_Description="Prioridad de la edición para el usuario.";

@XendraField(AD_Column_ID="PriorityUser",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6b0dd7a7-438e-b846-934c-82b261247558")
public static final String FIELDNAME_Request_UserImportance="6b0dd7a7-438e-b846-934c-82b261247558";

@XendraTrl(Identifier="8372fbd3-9bd5-04d1-ceea-cfcb6c836798")
public static String es_PE_FIELD_Request_UserImportance2_Name="Importancia del Usuario";

@XendraTrl(Identifier="8372fbd3-9bd5-04d1-ceea-cfcb6c836798")
public static String es_PE_FIELD_Request_UserImportance2_Description="Prioridad de la edición para el usuario.";

@XendraField(AD_Column_ID="PriorityUser",IsCentrallyMaintained=true,
AD_Tab_ID="a6082d0b-507b-9bdf-147b-9db501402eae",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8372fbd3-9bd5-04d1-ceea-cfcb6c836798")
public static final String FIELDNAME_Request_UserImportance2="8372fbd3-9bd5-04d1-ceea-cfcb6c836798";

@XendraTrl(Identifier="336ee3e6-32e6-13bb-6250-1becb0a84ac9")
public static String es_PE_FIELD_PartnerRequests_UserImportance_Name="Importancia del Usuario";

@XendraTrl(Identifier="336ee3e6-32e6-13bb-6250-1becb0a84ac9")
public static String es_PE_FIELD_PartnerRequests_UserImportance_Description="Prioridad de la edición para el usuario.";

@XendraField(AD_Column_ID="PriorityUser",IsCentrallyMaintained=true,
AD_Tab_ID="0a25fb60-7718-c6c9-b67f-7adeb07cfa19",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="336ee3e6-32e6-13bb-6250-1becb0a84ac9")
public static final String FIELDNAME_PartnerRequests_UserImportance="336ee3e6-32e6-13bb-6250-1becb0a84ac9";

@XendraTrl(Identifier="790c16eb-527f-b53a-5a81-4ab31ac726da")
public static String es_PE_FIELD_RequestsSource_UserImportance_Name="Importancia del Usuario";

@XendraTrl(Identifier="790c16eb-527f-b53a-5a81-4ab31ac726da")
public static String es_PE_FIELD_RequestsSource_UserImportance_Description="Prioridad de la edición para el usuario.";

@XendraField(AD_Column_ID="PriorityUser",IsCentrallyMaintained=true,
AD_Tab_ID="c2cdcdde-0adb-ef52-0a9e-48cf3e306ac6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="790c16eb-527f-b53a-5a81-4ab31ac726da")
public static final String FIELDNAME_RequestsSource_UserImportance="790c16eb-527f-b53a-5a81-4ab31ac726da";

@XendraTrl(Identifier="7ffa87d0-e318-b011-db40-e2b3e44589aa")
public static String es_PE_FIELD_RequestsSource_UserImportance2_Name="Importancia del Usuario";

@XendraTrl(Identifier="7ffa87d0-e318-b011-db40-e2b3e44589aa")
public static String es_PE_FIELD_RequestsSource_UserImportance2_Description="Prioridad de la edición para el usuario.";

@XendraField(AD_Column_ID="PriorityUser",IsCentrallyMaintained=true,
AD_Tab_ID="8a4561d7-25be-5533-de4c-ab4735c335ee",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7ffa87d0-e318-b011-db40-e2b3e44589aa")
public static final String FIELDNAME_RequestsSource_UserImportance2="7ffa87d0-e318-b011-db40-e2b3e44589aa";

@XendraTrl(Identifier="07f8c3ac-97b2-6b41-2208-add1caaf3f84")
public static String es_PE_COLUMN_PriorityUser_Name="Importancia del Usuario";

@XendraColumn(AD_Element_ID="a033d12f-6ca7-3bcb-a866-87eed9d28f75",ColumnName="PriorityUser",
AD_Reference_ID=17,AD_Reference_Value_ID="bfacaeda-bbb9-ba51-d726-52826206b4d7",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="5",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="07f8c3ac-97b2-6b41-2208-add1caaf3f84",Synchronized="2019-08-30 22:23:48.0")
/** Column name PriorityUser */
public static final String COLUMNNAME_PriorityUser = "PriorityUser";
/** Set Processed.
@param Processed The document has been processed */
public void setProcessed (boolean Processed)
{
set_Value (COLUMNNAME_Processed, Boolean.valueOf(Processed));
}
/** Get Processed.
@return The document has been processed */
public boolean isProcessed() 
{
Object oo = get_Value(COLUMNNAME_Processed);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="5e0a6759-e2f8-7145-77a1-5417babb68e0")
public static String es_PE_FIELD_Request_Processed_Name="Procesado";

@XendraTrl(Identifier="5e0a6759-e2f8-7145-77a1-5417babb68e0")
public static String es_PE_FIELD_Request_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="5e0a6759-e2f8-7145-77a1-5417babb68e0")
public static String es_PE_FIELD_Request_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="1=2",DisplayLength=1,IsReadOnly=true,SeqNo=580,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5e0a6759-e2f8-7145-77a1-5417babb68e0")
public static final String FIELDNAME_Request_Processed="5e0a6759-e2f8-7145-77a1-5417babb68e0";

@XendraTrl(Identifier="7f9a9398-55d3-2750-fea4-e2dddbe369ff")
public static String es_PE_FIELD_Request_Processed2_Name="Procesado";

@XendraTrl(Identifier="7f9a9398-55d3-2750-fea4-e2dddbe369ff")
public static String es_PE_FIELD_Request_Processed2_Description="El documento ha sido procesado";

@XendraTrl(Identifier="7f9a9398-55d3-2750-fea4-e2dddbe369ff")
public static String es_PE_FIELD_Request_Processed2_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="a6082d0b-507b-9bdf-147b-9db501402eae",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=530,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7f9a9398-55d3-2750-fea4-e2dddbe369ff")
public static final String FIELDNAME_Request_Processed2="7f9a9398-55d3-2750-fea4-e2dddbe369ff";

@XendraTrl(Identifier="3e1b0432-c688-0045-f75e-9b3c8ca70305")
public static String es_PE_FIELD_PartnerRequests_Processed_Name="Procesado";

@XendraTrl(Identifier="3e1b0432-c688-0045-f75e-9b3c8ca70305")
public static String es_PE_FIELD_PartnerRequests_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="3e1b0432-c688-0045-f75e-9b3c8ca70305")
public static String es_PE_FIELD_PartnerRequests_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="0a25fb60-7718-c6c9-b67f-7adeb07cfa19",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3e1b0432-c688-0045-f75e-9b3c8ca70305")
public static final String FIELDNAME_PartnerRequests_Processed="3e1b0432-c688-0045-f75e-9b3c8ca70305";

@XendraTrl(Identifier="03703cb5-8a30-b93d-1d1b-fa4babf98698")
public static String es_PE_FIELD_RequestsSource_Processed_Name="Procesado";

@XendraTrl(Identifier="03703cb5-8a30-b93d-1d1b-fa4babf98698")
public static String es_PE_FIELD_RequestsSource_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="03703cb5-8a30-b93d-1d1b-fa4babf98698")
public static String es_PE_FIELD_RequestsSource_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="c2cdcdde-0adb-ef52-0a9e-48cf3e306ac6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="03703cb5-8a30-b93d-1d1b-fa4babf98698")
public static final String FIELDNAME_RequestsSource_Processed="03703cb5-8a30-b93d-1d1b-fa4babf98698";

@XendraTrl(Identifier="d45ef1d7-bb9e-776e-195a-d58788205758")
public static String es_PE_FIELD_RequestsSource_Processed2_Name="Procesado";

@XendraTrl(Identifier="d45ef1d7-bb9e-776e-195a-d58788205758")
public static String es_PE_FIELD_RequestsSource_Processed2_Description="El documento ha sido procesado";

@XendraTrl(Identifier="d45ef1d7-bb9e-776e-195a-d58788205758")
public static String es_PE_FIELD_RequestsSource_Processed2_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="8a4561d7-25be-5533-de4c-ab4735c335ee",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d45ef1d7-bb9e-776e-195a-d58788205758")
public static final String FIELDNAME_RequestsSource_Processed2="d45ef1d7-bb9e-776e-195a-d58788205758";

@XendraTrl(Identifier="e30a1772-0779-e33b-b483-b95a28b075d2")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e30a1772-0779-e33b-b483-b95a28b075d2",
Synchronized="2019-08-30 22:23:48.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
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

@XendraTrl(Identifier="b450ac1a-5f88-4c89-bcb3-f56b2bd1c96d")
public static String es_PE_FIELD_Request_QuantityInvoiced_Name="Cantidad Facturada";

@XendraTrl(Identifier="b450ac1a-5f88-4c89-bcb3-f56b2bd1c96d")
public static String es_PE_FIELD_Request_QuantityInvoiced_Description="Cantidad facturada";

@XendraTrl(Identifier="b450ac1a-5f88-4c89-bcb3-f56b2bd1c96d")
public static String es_PE_FIELD_Request_QuantityInvoiced_Help="La cantidad facturada indica la cantidad de un producto que ha sido facturado";

@XendraField(AD_Column_ID="QtyInvoiced",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsInvoiced@=Y",DisplayLength=26,IsReadOnly=false,SeqNo=280,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b450ac1a-5f88-4c89-bcb3-f56b2bd1c96d")
public static final String FIELDNAME_Request_QuantityInvoiced="b450ac1a-5f88-4c89-bcb3-f56b2bd1c96d";

@XendraTrl(Identifier="06ba0dff-3bee-4afa-538b-1008138be873")
public static String es_PE_FIELD_Request_QuantityInvoiced2_Name="Cantidad Facturada";

@XendraTrl(Identifier="06ba0dff-3bee-4afa-538b-1008138be873")
public static String es_PE_FIELD_Request_QuantityInvoiced2_Description="Cantidad facturada";

@XendraTrl(Identifier="06ba0dff-3bee-4afa-538b-1008138be873")
public static String es_PE_FIELD_Request_QuantityInvoiced2_Help="La cantidad facturada indica la cantidad de un producto que ha sido facturado";

@XendraField(AD_Column_ID="QtyInvoiced",IsCentrallyMaintained=true,
AD_Tab_ID="a6082d0b-507b-9bdf-147b-9db501402eae",AD_FieldGroup_ID="Action",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=280,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="06ba0dff-3bee-4afa-538b-1008138be873")
public static final String FIELDNAME_Request_QuantityInvoiced2="06ba0dff-3bee-4afa-538b-1008138be873";

@XendraTrl(Identifier="a72ae3b3-1242-97ce-9b47-9786e4a2d4c8")
public static String es_PE_FIELD_PartnerRequests_QuantityInvoiced_Name="Cantidad Facturada";

@XendraTrl(Identifier="a72ae3b3-1242-97ce-9b47-9786e4a2d4c8")
public static String es_PE_FIELD_PartnerRequests_QuantityInvoiced_Description="Cantidad facturada";

@XendraTrl(Identifier="a72ae3b3-1242-97ce-9b47-9786e4a2d4c8")
public static String es_PE_FIELD_PartnerRequests_QuantityInvoiced_Help="La cantidad facturada indica la cantidad de un producto que ha sido facturado";

@XendraField(AD_Column_ID="QtyInvoiced",IsCentrallyMaintained=true,
AD_Tab_ID="0a25fb60-7718-c6c9-b67f-7adeb07cfa19",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a72ae3b3-1242-97ce-9b47-9786e4a2d4c8")
public static final String FIELDNAME_PartnerRequests_QuantityInvoiced="a72ae3b3-1242-97ce-9b47-9786e4a2d4c8";

@XendraTrl(Identifier="c0fb661d-6933-edc3-488f-32d714fd69b6")
public static String es_PE_FIELD_RequestsSource_QuantityInvoiced_Name="Cantidad Facturada";

@XendraTrl(Identifier="c0fb661d-6933-edc3-488f-32d714fd69b6")
public static String es_PE_FIELD_RequestsSource_QuantityInvoiced_Description="Cantidad facturada";

@XendraTrl(Identifier="c0fb661d-6933-edc3-488f-32d714fd69b6")
public static String es_PE_FIELD_RequestsSource_QuantityInvoiced_Help="La cantidad facturada indica la cantidad de un producto que ha sido facturado";

@XendraField(AD_Column_ID="QtyInvoiced",IsCentrallyMaintained=true,
AD_Tab_ID="c2cdcdde-0adb-ef52-0a9e-48cf3e306ac6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c0fb661d-6933-edc3-488f-32d714fd69b6")
public static final String FIELDNAME_RequestsSource_QuantityInvoiced="c0fb661d-6933-edc3-488f-32d714fd69b6";

@XendraTrl(Identifier="ece59d01-5489-629c-8d50-238790d52d7c")
public static String es_PE_FIELD_RequestsSource_QuantityInvoiced2_Name="Cantidad Facturada";

@XendraTrl(Identifier="ece59d01-5489-629c-8d50-238790d52d7c")
public static String es_PE_FIELD_RequestsSource_QuantityInvoiced2_Description="Cantidad facturada";

@XendraTrl(Identifier="ece59d01-5489-629c-8d50-238790d52d7c")
public static String es_PE_FIELD_RequestsSource_QuantityInvoiced2_Help="La cantidad facturada indica la cantidad de un producto que ha sido facturado";

@XendraField(AD_Column_ID="QtyInvoiced",IsCentrallyMaintained=true,
AD_Tab_ID="8a4561d7-25be-5533-de4c-ab4735c335ee",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ece59d01-5489-629c-8d50-238790d52d7c")
public static final String FIELDNAME_RequestsSource_QuantityInvoiced2="ece59d01-5489-629c-8d50-238790d52d7c";

@XendraTrl(Identifier="7d081209-950d-2df3-99f1-8b221c7e656b")
public static String es_PE_COLUMN_QtyInvoiced_Name="Cantidad Facturada";

@XendraColumn(AD_Element_ID="406c1301-33f0-3d6a-3fbc-b0cf44ccc5b3",ColumnName="QtyInvoiced",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7d081209-950d-2df3-99f1-8b221c7e656b",
Synchronized="2019-08-30 22:23:48.0")
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

@XendraTrl(Identifier="0bd73ee9-2fd6-c7e7-72f0-3a501685b22f")
public static String es_PE_FIELD_Request_QuantityPlan_Name="Plan de Cantidad";

@XendraTrl(Identifier="0bd73ee9-2fd6-c7e7-72f0-3a501685b22f")
public static String es_PE_FIELD_Request_QuantityPlan_Description="Cantidad Planeada";

@XendraField(AD_Column_ID="QtyPlan",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=300,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0bd73ee9-2fd6-c7e7-72f0-3a501685b22f")
public static final String FIELDNAME_Request_QuantityPlan="0bd73ee9-2fd6-c7e7-72f0-3a501685b22f";

@XendraTrl(Identifier="97200498-b6d2-b6ff-94d8-efe61504f606")
public static String es_PE_COLUMN_QtyPlan_Name="Plan de Cantidad";

@XendraColumn(AD_Element_ID="04d1bce0-1a4c-ddc0-50ca-4e558e6d789a",ColumnName="QtyPlan",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="97200498-b6d2-b6ff-94d8-efe61504f606",
Synchronized="2019-08-30 22:23:48.0")
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

@XendraTrl(Identifier="565ca035-563e-a103-1fc8-725ed04be6be")
public static String es_PE_FIELD_Request_QuantityUsed_Name="Cantidad Usada";

@XendraTrl(Identifier="565ca035-563e-a103-1fc8-725ed04be6be")
public static String es_PE_FIELD_Request_QuantityUsed_Description="Cantidad usada para este evento";

@XendraField(AD_Column_ID="QtySpent",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=260,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="565ca035-563e-a103-1fc8-725ed04be6be")
public static final String FIELDNAME_Request_QuantityUsed="565ca035-563e-a103-1fc8-725ed04be6be";

@XendraTrl(Identifier="db948dc4-3d69-2c02-5e23-15766182f11f")
public static String es_PE_FIELD_Request_QuantityUsed2_Name="Cantidad Usada";

@XendraTrl(Identifier="db948dc4-3d69-2c02-5e23-15766182f11f")
public static String es_PE_FIELD_Request_QuantityUsed2_Description="Cantidad usada para este evento";

@XendraField(AD_Column_ID="QtySpent",IsCentrallyMaintained=true,
AD_Tab_ID="a6082d0b-507b-9bdf-147b-9db501402eae",AD_FieldGroup_ID="Action",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=260,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="db948dc4-3d69-2c02-5e23-15766182f11f")
public static final String FIELDNAME_Request_QuantityUsed2="db948dc4-3d69-2c02-5e23-15766182f11f";

@XendraTrl(Identifier="c3509171-1a02-7c0e-f074-c5c262733c55")
public static String es_PE_FIELD_PartnerRequests_QuantityUsed_Name="Cantidad Usada";

@XendraTrl(Identifier="c3509171-1a02-7c0e-f074-c5c262733c55")
public static String es_PE_FIELD_PartnerRequests_QuantityUsed_Description="Cantidad usada para este evento";

@XendraField(AD_Column_ID="QtySpent",IsCentrallyMaintained=true,
AD_Tab_ID="0a25fb60-7718-c6c9-b67f-7adeb07cfa19",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c3509171-1a02-7c0e-f074-c5c262733c55")
public static final String FIELDNAME_PartnerRequests_QuantityUsed="c3509171-1a02-7c0e-f074-c5c262733c55";

@XendraTrl(Identifier="6bf2fa80-6d6d-6f98-f7c8-f034ebca956c")
public static String es_PE_FIELD_RequestsSource_QuantityUsed_Name="Cantidad Usada";

@XendraTrl(Identifier="6bf2fa80-6d6d-6f98-f7c8-f034ebca956c")
public static String es_PE_FIELD_RequestsSource_QuantityUsed_Description="Cantidad usada para este evento";

@XendraField(AD_Column_ID="QtySpent",IsCentrallyMaintained=true,
AD_Tab_ID="c2cdcdde-0adb-ef52-0a9e-48cf3e306ac6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6bf2fa80-6d6d-6f98-f7c8-f034ebca956c")
public static final String FIELDNAME_RequestsSource_QuantityUsed="6bf2fa80-6d6d-6f98-f7c8-f034ebca956c";

@XendraTrl(Identifier="66853eab-d2c4-9674-8a8d-e9c32c6f4694")
public static String es_PE_FIELD_RequestsSource_QuantityUsed2_Name="Cantidad Usada";

@XendraTrl(Identifier="66853eab-d2c4-9674-8a8d-e9c32c6f4694")
public static String es_PE_FIELD_RequestsSource_QuantityUsed2_Description="Cantidad usada para este evento";

@XendraField(AD_Column_ID="QtySpent",IsCentrallyMaintained=true,
AD_Tab_ID="8a4561d7-25be-5533-de4c-ab4735c335ee",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="66853eab-d2c4-9674-8a8d-e9c32c6f4694")
public static final String FIELDNAME_RequestsSource_QuantityUsed2="66853eab-d2c4-9674-8a8d-e9c32c6f4694";

@XendraTrl(Identifier="ec5f7ccc-e503-9ee6-4740-e7ef45550b50")
public static String es_PE_COLUMN_QtySpent_Name="Cantidad Usada";

@XendraColumn(AD_Element_ID="de5f8ee0-79e4-9ea4-93ab-7bc172fc9f0f",ColumnName="QtySpent",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ec5f7ccc-e503-9ee6-4740-e7ef45550b50",
Synchronized="2019-08-30 22:23:48.0")
/** Column name QtySpent */
public static final String COLUMNNAME_QtySpent = "QtySpent";
/** Set Category.
@param R_Category_ID Request Category */
public void setR_Category_ID (int R_Category_ID)
{
if (R_Category_ID <= 0) set_Value (COLUMNNAME_R_Category_ID, null);
 else 
set_Value (COLUMNNAME_R_Category_ID, Integer.valueOf(R_Category_ID));
}
/** Get Category.
@return Request Category */
public int getR_Category_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_Category_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="27231f2a-4359-2687-7a92-5941ea4e1f59")
public static String es_PE_FIELD_Request_Category_Name="Categoría";

@XendraTrl(Identifier="27231f2a-4359-2687-7a92-5941ea4e1f59")
public static String es_PE_FIELD_Request_Category_Description="Categoría de Solicitud";

@XendraTrl(Identifier="27231f2a-4359-2687-7a92-5941ea4e1f59")
public static String es_PE_FIELD_Request_Category_Help="Categoria ó asunto de la solicitud";

@XendraField(AD_Column_ID="R_Category_ID",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="27231f2a-4359-2687-7a92-5941ea4e1f59")
public static final String FIELDNAME_Request_Category="27231f2a-4359-2687-7a92-5941ea4e1f59";

@XendraTrl(Identifier="a62e1b13-5875-d5a9-f178-cee1388ef843")
public static String es_PE_FIELD_Request_Category2_Name="Categoría";

@XendraTrl(Identifier="a62e1b13-5875-d5a9-f178-cee1388ef843")
public static String es_PE_FIELD_Request_Category2_Description="Categoría de Solicitud";

@XendraTrl(Identifier="a62e1b13-5875-d5a9-f178-cee1388ef843")
public static String es_PE_FIELD_Request_Category2_Help="Categoria ó asunto de la solicitud";

@XendraField(AD_Column_ID="R_Category_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a6082d0b-507b-9bdf-147b-9db501402eae",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a62e1b13-5875-d5a9-f178-cee1388ef843")
public static final String FIELDNAME_Request_Category2="a62e1b13-5875-d5a9-f178-cee1388ef843";

@XendraTrl(Identifier="575eacbd-88cb-8723-5411-03bc403749cb")
public static String es_PE_FIELD_PartnerRequests_Category_Name="Categoría";

@XendraTrl(Identifier="575eacbd-88cb-8723-5411-03bc403749cb")
public static String es_PE_FIELD_PartnerRequests_Category_Description="Categoría de Solicitud";

@XendraTrl(Identifier="575eacbd-88cb-8723-5411-03bc403749cb")
public static String es_PE_FIELD_PartnerRequests_Category_Help="Categoria ó asunto de la solicitud";

@XendraField(AD_Column_ID="R_Category_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a25fb60-7718-c6c9-b67f-7adeb07cfa19",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="575eacbd-88cb-8723-5411-03bc403749cb")
public static final String FIELDNAME_PartnerRequests_Category="575eacbd-88cb-8723-5411-03bc403749cb";

@XendraTrl(Identifier="27751637-a3e9-778b-67f2-1561c2e54204")
public static String es_PE_FIELD_RequestsSource_Category_Name="Categoría";

@XendraTrl(Identifier="27751637-a3e9-778b-67f2-1561c2e54204")
public static String es_PE_FIELD_RequestsSource_Category_Description="Categoría de Solicitud";

@XendraTrl(Identifier="27751637-a3e9-778b-67f2-1561c2e54204")
public static String es_PE_FIELD_RequestsSource_Category_Help="Categoria ó asunto de la solicitud";

@XendraField(AD_Column_ID="R_Category_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c2cdcdde-0adb-ef52-0a9e-48cf3e306ac6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="27751637-a3e9-778b-67f2-1561c2e54204")
public static final String FIELDNAME_RequestsSource_Category="27751637-a3e9-778b-67f2-1561c2e54204";

@XendraTrl(Identifier="6d26d6f1-71cf-5ba6-fd37-2a03eab6d0ed")
public static String es_PE_FIELD_RequestsSource_Category2_Name="Categoría";

@XendraTrl(Identifier="6d26d6f1-71cf-5ba6-fd37-2a03eab6d0ed")
public static String es_PE_FIELD_RequestsSource_Category2_Description="Categoría de Solicitud";

@XendraTrl(Identifier="6d26d6f1-71cf-5ba6-fd37-2a03eab6d0ed")
public static String es_PE_FIELD_RequestsSource_Category2_Help="Categoria ó asunto de la solicitud";

@XendraField(AD_Column_ID="R_Category_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8a4561d7-25be-5533-de4c-ab4735c335ee",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6d26d6f1-71cf-5ba6-fd37-2a03eab6d0ed")
public static final String FIELDNAME_RequestsSource_Category2="6d26d6f1-71cf-5ba6-fd37-2a03eab6d0ed";

@XendraTrl(Identifier="1d961b05-55ec-30ac-be21-8de836318bd0")
public static String es_PE_COLUMN_R_Category_ID_Name="Categoría";

@XendraColumn(AD_Element_ID="6c67e84d-9c0c-0f6f-1738-d8c86cd72ee7",ColumnName="R_Category_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1d961b05-55ec-30ac-be21-8de836318bd0",
Synchronized="2019-08-30 22:23:48.0")
/** Column name R_Category_ID */
public static final String COLUMNNAME_R_Category_ID = "R_Category_ID";
/** Set Record ID.
@param Record_ID Direct internal record ID */
public void setRecord_ID (int Record_ID)
{
if (Record_ID <= 0) set_ValueNoCheck (COLUMNNAME_Record_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_Record_ID, Integer.valueOf(Record_ID));
}
/** Get Record ID.
@return Direct internal record ID */
public int getRecord_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Record_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0e9c74e2-792f-57fb-0c85-5984aebcf00b")
public static String es_PE_FIELD_Request_RecordID_Name="ID de Registro";

@XendraTrl(Identifier="0e9c74e2-792f-57fb-0c85-5984aebcf00b")
public static String es_PE_FIELD_Request_RecordID_Description="Identificador de registro interno";

@XendraTrl(Identifier="0e9c74e2-792f-57fb-0c85-5984aebcf00b")
public static String es_PE_FIELD_Request_RecordID_Help="La ID de registro es el identificador único interno de un registro.";

@XendraField(AD_Column_ID="Record_ID",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@AD_Table_ID@!0",DisplayLength=23,IsReadOnly=true,SeqNo=480,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0e9c74e2-792f-57fb-0c85-5984aebcf00b")
public static final String FIELDNAME_Request_RecordID="0e9c74e2-792f-57fb-0c85-5984aebcf00b";

@XendraTrl(Identifier="09cbc745-43d0-a4ff-f14a-5ba3b2952724")
public static String es_PE_FIELD_Request_RecordID2_Name="ID de Registro";

@XendraTrl(Identifier="09cbc745-43d0-a4ff-f14a-5ba3b2952724")
public static String es_PE_FIELD_Request_RecordID2_Description="Identificador de registro interno";

@XendraTrl(Identifier="09cbc745-43d0-a4ff-f14a-5ba3b2952724")
public static String es_PE_FIELD_Request_RecordID2_Help="La ID de registro es el identificador único interno de un registro.";

@XendraField(AD_Column_ID="Record_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a6082d0b-507b-9bdf-147b-9db501402eae",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=true,SeqNo=420,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="09cbc745-43d0-a4ff-f14a-5ba3b2952724")
public static final String FIELDNAME_Request_RecordID2="09cbc745-43d0-a4ff-f14a-5ba3b2952724";

@XendraTrl(Identifier="1960fbfd-f69d-ffa5-1a55-bed4fa981370")
public static String es_PE_FIELD_PartnerRequests_RecordID_Name="ID de Registro";

@XendraTrl(Identifier="1960fbfd-f69d-ffa5-1a55-bed4fa981370")
public static String es_PE_FIELD_PartnerRequests_RecordID_Description="Identificador de registro interno";

@XendraTrl(Identifier="1960fbfd-f69d-ffa5-1a55-bed4fa981370")
public static String es_PE_FIELD_PartnerRequests_RecordID_Help="La ID de registro es el identificador único interno de un registro.";

@XendraField(AD_Column_ID="Record_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a25fb60-7718-c6c9-b67f-7adeb07cfa19",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1960fbfd-f69d-ffa5-1a55-bed4fa981370")
public static final String FIELDNAME_PartnerRequests_RecordID="1960fbfd-f69d-ffa5-1a55-bed4fa981370";

@XendraTrl(Identifier="44161a89-463a-76fb-172e-de78894d7bbd")
public static String es_PE_FIELD_RequestsSource_RecordID_Name="ID de Registro";

@XendraTrl(Identifier="44161a89-463a-76fb-172e-de78894d7bbd")
public static String es_PE_FIELD_RequestsSource_RecordID_Description="Identificador de registro interno";

@XendraTrl(Identifier="44161a89-463a-76fb-172e-de78894d7bbd")
public static String es_PE_FIELD_RequestsSource_RecordID_Help="La ID de registro es el identificador único interno de un registro.";

@XendraField(AD_Column_ID="Record_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c2cdcdde-0adb-ef52-0a9e-48cf3e306ac6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="44161a89-463a-76fb-172e-de78894d7bbd")
public static final String FIELDNAME_RequestsSource_RecordID="44161a89-463a-76fb-172e-de78894d7bbd";

@XendraTrl(Identifier="26d45d46-79cf-5d26-d6d0-c7f3cd2caa1c")
public static String es_PE_FIELD_RequestsSource_RecordID2_Name="ID de Registro";

@XendraTrl(Identifier="26d45d46-79cf-5d26-d6d0-c7f3cd2caa1c")
public static String es_PE_FIELD_RequestsSource_RecordID2_Description="Identificador de registro interno";

@XendraTrl(Identifier="26d45d46-79cf-5d26-d6d0-c7f3cd2caa1c")
public static String es_PE_FIELD_RequestsSource_RecordID2_Help="La ID de registro es el identificador único interno de un registro.";

@XendraField(AD_Column_ID="Record_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8a4561d7-25be-5533-de4c-ab4735c335ee",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="26d45d46-79cf-5d26-d6d0-c7f3cd2caa1c")
public static final String FIELDNAME_RequestsSource_RecordID2="26d45d46-79cf-5d26-d6d0-c7f3cd2caa1c";

@XendraTrl(Identifier="52ece100-c09d-7555-8cb5-3cd58dfef107")
public static String es_PE_COLUMN_Record_ID_Name="ID de Registro";

@XendraColumn(AD_Element_ID="86e36e4b-d1dc-2deb-449d-c1f6769e1603",ColumnName="Record_ID",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="52ece100-c09d-7555-8cb5-3cd58dfef107",
Synchronized="2019-08-30 22:23:48.0")
/** Column name Record_ID */
public static final String COLUMNNAME_Record_ID = "Record_ID";
/** Set Request Amount.
@param RequestAmt Amount associated with this request */
public void setRequestAmt (BigDecimal RequestAmt)
{
if (RequestAmt == null) throw new IllegalArgumentException ("RequestAmt is mandatory.");
set_Value (COLUMNNAME_RequestAmt, RequestAmt);
}
/** Get Request Amount.
@return Amount associated with this request */
public BigDecimal getRequestAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_RequestAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="9b6346bd-4404-085c-c0db-3870d63af8a4")
public static String es_PE_FIELD_Request_RequestAmount_Name="Importe de Solicitud";

@XendraTrl(Identifier="9b6346bd-4404-085c-c0db-3870d63af8a4")
public static String es_PE_FIELD_Request_RequestAmount_Description="Importe asociado con esta solicitud";

@XendraTrl(Identifier="9b6346bd-4404-085c-c0db-3870d63af8a4")
public static String es_PE_FIELD_Request_RequestAmount_Help="El Importe de la solicitud requerida indica cualquier importe que está asociado con esta solicitud. Por Ej. Un importe de garantía ó un importe de reembolso.";

@XendraField(AD_Column_ID="RequestAmt",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=450,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9b6346bd-4404-085c-c0db-3870d63af8a4")
public static final String FIELDNAME_Request_RequestAmount="9b6346bd-4404-085c-c0db-3870d63af8a4";

@XendraTrl(Identifier="46bcb600-2b97-4ef4-d1bc-3409d282ea4d")
public static String es_PE_FIELD_Request_RequestAmount2_Name="Importe de Solicitud";

@XendraTrl(Identifier="46bcb600-2b97-4ef4-d1bc-3409d282ea4d")
public static String es_PE_FIELD_Request_RequestAmount2_Description="Importe asociado con esta solicitud";

@XendraTrl(Identifier="46bcb600-2b97-4ef4-d1bc-3409d282ea4d")
public static String es_PE_FIELD_Request_RequestAmount2_Help="El Importe de la solicitud requerida indica cualquier importe que está asociado con esta solicitud. Por Ej. Un importe de garantía ó un importe de reembolso.";

@XendraField(AD_Column_ID="RequestAmt",IsCentrallyMaintained=true,
AD_Tab_ID="a6082d0b-507b-9bdf-147b-9db501402eae",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=390,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="46bcb600-2b97-4ef4-d1bc-3409d282ea4d")
public static final String FIELDNAME_Request_RequestAmount2="46bcb600-2b97-4ef4-d1bc-3409d282ea4d";

@XendraTrl(Identifier="1c27469f-55f7-ed4e-e27a-8de8305efcd9")
public static String es_PE_FIELD_PartnerRequests_RequestAmount_Name="Importe de Solicitud";

@XendraTrl(Identifier="1c27469f-55f7-ed4e-e27a-8de8305efcd9")
public static String es_PE_FIELD_PartnerRequests_RequestAmount_Description="Importe asociado con esta solicitud";

@XendraTrl(Identifier="1c27469f-55f7-ed4e-e27a-8de8305efcd9")
public static String es_PE_FIELD_PartnerRequests_RequestAmount_Help="El Importe de la solicitud requerida indica cualquier importe que está asociado con esta solicitud. Por Ej. Un importe de garantía ó un importe de reembolso.";

@XendraField(AD_Column_ID="RequestAmt",IsCentrallyMaintained=true,
AD_Tab_ID="0a25fb60-7718-c6c9-b67f-7adeb07cfa19",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1c27469f-55f7-ed4e-e27a-8de8305efcd9")
public static final String FIELDNAME_PartnerRequests_RequestAmount="1c27469f-55f7-ed4e-e27a-8de8305efcd9";

@XendraTrl(Identifier="7f4ad1a5-eef5-7b47-14b1-9310880d27fc")
public static String es_PE_FIELD_RequestsSource_RequestAmount_Name="Importe de Solicitud";

@XendraTrl(Identifier="7f4ad1a5-eef5-7b47-14b1-9310880d27fc")
public static String es_PE_FIELD_RequestsSource_RequestAmount_Description="Importe asociado con esta solicitud";

@XendraTrl(Identifier="7f4ad1a5-eef5-7b47-14b1-9310880d27fc")
public static String es_PE_FIELD_RequestsSource_RequestAmount_Help="El Importe de la solicitud requerida indica cualquier importe que está asociado con esta solicitud. Por Ej. Un importe de garantía ó un importe de reembolso.";

@XendraField(AD_Column_ID="RequestAmt",IsCentrallyMaintained=true,
AD_Tab_ID="c2cdcdde-0adb-ef52-0a9e-48cf3e306ac6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7f4ad1a5-eef5-7b47-14b1-9310880d27fc")
public static final String FIELDNAME_RequestsSource_RequestAmount="7f4ad1a5-eef5-7b47-14b1-9310880d27fc";

@XendraTrl(Identifier="8173aefb-9b9a-0085-94b5-cc30bcc5319c")
public static String es_PE_FIELD_RequestsSource_RequestAmount2_Name="Importe de Solicitud";

@XendraTrl(Identifier="8173aefb-9b9a-0085-94b5-cc30bcc5319c")
public static String es_PE_FIELD_RequestsSource_RequestAmount2_Description="Importe asociado con esta solicitud";

@XendraTrl(Identifier="8173aefb-9b9a-0085-94b5-cc30bcc5319c")
public static String es_PE_FIELD_RequestsSource_RequestAmount2_Help="El Importe de la solicitud requerida indica cualquier importe que está asociado con esta solicitud. Por Ej. Un importe de garantía ó un importe de reembolso.";

@XendraField(AD_Column_ID="RequestAmt",IsCentrallyMaintained=true,
AD_Tab_ID="8a4561d7-25be-5533-de4c-ab4735c335ee",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8173aefb-9b9a-0085-94b5-cc30bcc5319c")
public static final String FIELDNAME_RequestsSource_RequestAmount2="8173aefb-9b9a-0085-94b5-cc30bcc5319c";

@XendraTrl(Identifier="f55b502c-60c3-23c5-915c-2a8c0bd8df3d")
public static String es_PE_COLUMN_RequestAmt_Name="Importe de Solicitud";

@XendraColumn(AD_Element_ID="3e093a8d-9165-e1a0-30de-2ab68a44da10",ColumnName="RequestAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f55b502c-60c3-23c5-915c-2a8c0bd8df3d",
Synchronized="2019-08-30 22:23:48.0")
/** Column name RequestAmt */
public static final String COLUMNNAME_RequestAmt = "RequestAmt";
/** Set Result.
@param Result Result of the action taken */
public void setResult (String Result)
{
set_Value (COLUMNNAME_Result, Result);
}
/** Get Result.
@return Result of the action taken */
public String getResult() 
{
String value = (String)get_Value(COLUMNNAME_Result);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="6bc8f53b-dfdf-f1cc-6c63-577a2ff3e8ed")
public static String es_PE_FIELD_Request_Result_Name="Resultado";

@XendraTrl(Identifier="6bc8f53b-dfdf-f1cc-6c63-577a2ff3e8ed")
public static String es_PE_FIELD_Request_Result_Description="Resultado de la acción tomada";

@XendraTrl(Identifier="6bc8f53b-dfdf-f1cc-6c63-577a2ff3e8ed")
public static String es_PE_FIELD_Request_Result_Help="El resultado indica el resultado de cualquier acción tomada en esta solicitud.";

@XendraField(AD_Column_ID="Result",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="Action",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6bc8f53b-dfdf-f1cc-6c63-577a2ff3e8ed")
public static final String FIELDNAME_Request_Result="6bc8f53b-dfdf-f1cc-6c63-577a2ff3e8ed";

@XendraTrl(Identifier="d127e4bc-5736-8c9c-1a96-4953bf22a918")
public static String es_PE_FIELD_Request_Result2_Name="Resultado";

@XendraTrl(Identifier="d127e4bc-5736-8c9c-1a96-4953bf22a918")
public static String es_PE_FIELD_Request_Result2_Description="Resultado de la acción tomada";

@XendraTrl(Identifier="d127e4bc-5736-8c9c-1a96-4953bf22a918")
public static String es_PE_FIELD_Request_Result2_Help="El resultado indica el resultado de cualquier acción tomada en esta solicitud.";

@XendraField(AD_Column_ID="Result",IsCentrallyMaintained=true,
AD_Tab_ID="a6082d0b-507b-9bdf-147b-9db501402eae",AD_FieldGroup_ID="Action",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d127e4bc-5736-8c9c-1a96-4953bf22a918")
public static final String FIELDNAME_Request_Result2="d127e4bc-5736-8c9c-1a96-4953bf22a918";

@XendraTrl(Identifier="dd0df435-047b-8e57-312f-9ca0635983c5")
public static String es_PE_FIELD_PartnerRequests_Result_Name="Resultado";

@XendraTrl(Identifier="dd0df435-047b-8e57-312f-9ca0635983c5")
public static String es_PE_FIELD_PartnerRequests_Result_Description="Resultado de la acción tomada";

@XendraTrl(Identifier="dd0df435-047b-8e57-312f-9ca0635983c5")
public static String es_PE_FIELD_PartnerRequests_Result_Help="El resultado indica el resultado de cualquier acción tomada en esta solicitud.";

@XendraField(AD_Column_ID="Result",IsCentrallyMaintained=true,
AD_Tab_ID="0a25fb60-7718-c6c9-b67f-7adeb07cfa19",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dd0df435-047b-8e57-312f-9ca0635983c5")
public static final String FIELDNAME_PartnerRequests_Result="dd0df435-047b-8e57-312f-9ca0635983c5";

@XendraTrl(Identifier="ea4512cc-a47e-3811-5c27-906bac208964")
public static String es_PE_FIELD_RequestsSource_Result_Name="Resultado";

@XendraTrl(Identifier="ea4512cc-a47e-3811-5c27-906bac208964")
public static String es_PE_FIELD_RequestsSource_Result_Description="Resultado de la acción tomada";

@XendraTrl(Identifier="ea4512cc-a47e-3811-5c27-906bac208964")
public static String es_PE_FIELD_RequestsSource_Result_Help="El resultado indica el resultado de cualquier acción tomada en esta solicitud.";

@XendraField(AD_Column_ID="Result",IsCentrallyMaintained=true,
AD_Tab_ID="c2cdcdde-0adb-ef52-0a9e-48cf3e306ac6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ea4512cc-a47e-3811-5c27-906bac208964")
public static final String FIELDNAME_RequestsSource_Result="ea4512cc-a47e-3811-5c27-906bac208964";

@XendraTrl(Identifier="ed173dc1-d29f-9363-a4cb-e45241f716aa")
public static String es_PE_FIELD_RequestsSource_Result2_Name="Resultado";

@XendraTrl(Identifier="ed173dc1-d29f-9363-a4cb-e45241f716aa")
public static String es_PE_FIELD_RequestsSource_Result2_Description="Resultado de la acción tomada";

@XendraTrl(Identifier="ed173dc1-d29f-9363-a4cb-e45241f716aa")
public static String es_PE_FIELD_RequestsSource_Result2_Help="El resultado indica el resultado de cualquier acción tomada en esta solicitud.";

@XendraField(AD_Column_ID="Result",IsCentrallyMaintained=true,
AD_Tab_ID="8a4561d7-25be-5533-de4c-ab4735c335ee",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ed173dc1-d29f-9363-a4cb-e45241f716aa")
public static final String FIELDNAME_RequestsSource_Result2="ed173dc1-d29f-9363-a4cb-e45241f716aa";

@XendraTrl(Identifier="250ec542-c3e7-9ef1-6e41-b093c74b0000")
public static String es_PE_COLUMN_Result_Name="Resultado";

@XendraColumn(AD_Element_ID="ba7b014d-4620-7c1c-4680-838ca2550502",ColumnName="Result",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="250ec542-c3e7-9ef1-6e41-b093c74b0000",
Synchronized="2019-08-30 22:23:48.0")
/** Column name Result */
public static final String COLUMNNAME_Result = "Result";
/** Set Group.
@param R_Group_ID Request Group */
public void setR_Group_ID (int R_Group_ID)
{
if (R_Group_ID <= 0) set_Value (COLUMNNAME_R_Group_ID, null);
 else 
set_Value (COLUMNNAME_R_Group_ID, Integer.valueOf(R_Group_ID));
}
/** Get Group.
@return Request Group */
public int getR_Group_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_Group_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e4d1f16a-6c2a-f693-08c4-b0a9f3ca1e1b")
public static String es_PE_FIELD_Request_Group_Name="Grupo";

@XendraTrl(Identifier="e4d1f16a-6c2a-f693-08c4-b0a9f3ca1e1b")
public static String es_PE_FIELD_Request_Group_Description="Grupo de solicitud";

@XendraTrl(Identifier="e4d1f16a-6c2a-f693-08c4-b0a9f3ca1e1b")
public static String es_PE_FIELD_Request_Group_Help="Grupo de solicitud (ej. versión de números, responsabilidad, ...)";

@XendraField(AD_Column_ID="R_Group_ID",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e4d1f16a-6c2a-f693-08c4-b0a9f3ca1e1b")
public static final String FIELDNAME_Request_Group="e4d1f16a-6c2a-f693-08c4-b0a9f3ca1e1b";

@XendraTrl(Identifier="a300e91a-492d-f224-bf4a-f32eaf1dfdfa")
public static String es_PE_FIELD_Request_Group2_Name="Grupo";

@XendraTrl(Identifier="a300e91a-492d-f224-bf4a-f32eaf1dfdfa")
public static String es_PE_FIELD_Request_Group2_Description="Grupo de solicitud";

@XendraTrl(Identifier="a300e91a-492d-f224-bf4a-f32eaf1dfdfa")
public static String es_PE_FIELD_Request_Group2_Help="Grupo de solicitud (ej. versión de números, responsabilidad, ...)";

@XendraField(AD_Column_ID="R_Group_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a6082d0b-507b-9bdf-147b-9db501402eae",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a300e91a-492d-f224-bf4a-f32eaf1dfdfa")
public static final String FIELDNAME_Request_Group2="a300e91a-492d-f224-bf4a-f32eaf1dfdfa";

@XendraTrl(Identifier="aff015f6-0d23-4009-20ea-ffc6205a6dbe")
public static String es_PE_FIELD_PartnerRequests_Group_Name="Grupo";

@XendraTrl(Identifier="aff015f6-0d23-4009-20ea-ffc6205a6dbe")
public static String es_PE_FIELD_PartnerRequests_Group_Description="Grupo de solicitud";

@XendraTrl(Identifier="aff015f6-0d23-4009-20ea-ffc6205a6dbe")
public static String es_PE_FIELD_PartnerRequests_Group_Help="Grupo de solicitud (ej. versión de números, responsabilidad, ...)";

@XendraField(AD_Column_ID="R_Group_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a25fb60-7718-c6c9-b67f-7adeb07cfa19",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="aff015f6-0d23-4009-20ea-ffc6205a6dbe")
public static final String FIELDNAME_PartnerRequests_Group="aff015f6-0d23-4009-20ea-ffc6205a6dbe";

@XendraTrl(Identifier="5272531d-d2d3-0e85-2b3e-0a705641bcdf")
public static String es_PE_FIELD_RequestsSource_Group_Name="Grupo";

@XendraTrl(Identifier="5272531d-d2d3-0e85-2b3e-0a705641bcdf")
public static String es_PE_FIELD_RequestsSource_Group_Description="Grupo de solicitud";

@XendraTrl(Identifier="5272531d-d2d3-0e85-2b3e-0a705641bcdf")
public static String es_PE_FIELD_RequestsSource_Group_Help="Grupo de solicitud (ej. versión de números, responsabilidad, ...)";

@XendraField(AD_Column_ID="R_Group_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c2cdcdde-0adb-ef52-0a9e-48cf3e306ac6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5272531d-d2d3-0e85-2b3e-0a705641bcdf")
public static final String FIELDNAME_RequestsSource_Group="5272531d-d2d3-0e85-2b3e-0a705641bcdf";

@XendraTrl(Identifier="26912d51-0d0d-c9ad-2feb-525139255bcf")
public static String es_PE_FIELD_RequestsSource_Group2_Name="Grupo";

@XendraTrl(Identifier="26912d51-0d0d-c9ad-2feb-525139255bcf")
public static String es_PE_FIELD_RequestsSource_Group2_Description="Grupo de solicitud";

@XendraTrl(Identifier="26912d51-0d0d-c9ad-2feb-525139255bcf")
public static String es_PE_FIELD_RequestsSource_Group2_Help="Grupo de solicitud (ej. versión de números, responsabilidad, ...)";

@XendraField(AD_Column_ID="R_Group_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8a4561d7-25be-5533-de4c-ab4735c335ee",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="26912d51-0d0d-c9ad-2feb-525139255bcf")
public static final String FIELDNAME_RequestsSource_Group2="26912d51-0d0d-c9ad-2feb-525139255bcf";

@XendraTrl(Identifier="595b24e8-1012-6ef4-82fa-8422943327c0")
public static String es_PE_COLUMN_R_Group_ID_Name="Grupo";

@XendraColumn(AD_Element_ID="66f0c2a3-096f-ad52-1b44-f39cd9c5c857",ColumnName="R_Group_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="595b24e8-1012-6ef4-82fa-8422943327c0",
Synchronized="2019-08-30 22:23:48.0")
/** Column name R_Group_ID */
public static final String COLUMNNAME_R_Group_ID = "R_Group_ID";
/** Set Mail Template.
@param R_MailText_ID Text templates for mailings */
public void setR_MailText_ID (int R_MailText_ID)
{
if (R_MailText_ID <= 0) set_Value (COLUMNNAME_R_MailText_ID, null);
 else 
set_Value (COLUMNNAME_R_MailText_ID, Integer.valueOf(R_MailText_ID));
}
/** Get Mail Template.
@return Text templates for mailings */
public int getR_MailText_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_MailText_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="13dc57f4-4cf8-dace-c963-b9efa5a49105")
public static String es_PE_FIELD_Request_MailTemplate_Name="Patrón de Correo";

@XendraTrl(Identifier="13dc57f4-4cf8-dace-c963-b9efa5a49105")
public static String es_PE_FIELD_Request_MailTemplate_Description="Patrón de texto para correos.";

@XendraTrl(Identifier="13dc57f4-4cf8-dace-c963-b9efa5a49105")
public static String es_PE_FIELD_Request_MailTemplate_Help="El patrón de correo indica el patrón de correo para mensajes de retorno.";

@XendraField(AD_Column_ID="R_MailText_ID",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="Action",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="13dc57f4-4cf8-dace-c963-b9efa5a49105")
public static final String FIELDNAME_Request_MailTemplate="13dc57f4-4cf8-dace-c963-b9efa5a49105";

@XendraTrl(Identifier="cec62f0d-970d-1d27-2a49-a36c8376613f")
public static String es_PE_FIELD_Request_MailTemplate2_Name="Patrón de Correo";

@XendraTrl(Identifier="cec62f0d-970d-1d27-2a49-a36c8376613f")
public static String es_PE_FIELD_Request_MailTemplate2_Description="Patrón de texto para correos.";

@XendraTrl(Identifier="cec62f0d-970d-1d27-2a49-a36c8376613f")
public static String es_PE_FIELD_Request_MailTemplate2_Help="El patrón de correo indica el patrón de correo para mensajes de retorno.";

@XendraField(AD_Column_ID="R_MailText_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a6082d0b-507b-9bdf-147b-9db501402eae",AD_FieldGroup_ID="Action",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cec62f0d-970d-1d27-2a49-a36c8376613f")
public static final String FIELDNAME_Request_MailTemplate2="cec62f0d-970d-1d27-2a49-a36c8376613f";

@XendraTrl(Identifier="8acf5815-ab6e-21de-f06a-6b8e46aec8fe")
public static String es_PE_FIELD_PartnerRequests_MailTemplate_Name="Patrón de Correo";

@XendraTrl(Identifier="8acf5815-ab6e-21de-f06a-6b8e46aec8fe")
public static String es_PE_FIELD_PartnerRequests_MailTemplate_Description="Patrón de texto para correos.";

@XendraTrl(Identifier="8acf5815-ab6e-21de-f06a-6b8e46aec8fe")
public static String es_PE_FIELD_PartnerRequests_MailTemplate_Help="El patrón de correo indica el patrón de correo para mensajes de retorno.";

@XendraField(AD_Column_ID="R_MailText_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a25fb60-7718-c6c9-b67f-7adeb07cfa19",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8acf5815-ab6e-21de-f06a-6b8e46aec8fe")
public static final String FIELDNAME_PartnerRequests_MailTemplate="8acf5815-ab6e-21de-f06a-6b8e46aec8fe";

@XendraTrl(Identifier="11b593ba-9b9f-cdef-3829-86a07a39d396")
public static String es_PE_FIELD_RequestsSource_MailTemplate_Name="Patrón de Correo";

@XendraTrl(Identifier="11b593ba-9b9f-cdef-3829-86a07a39d396")
public static String es_PE_FIELD_RequestsSource_MailTemplate_Description="Patrón de texto para correos.";

@XendraTrl(Identifier="11b593ba-9b9f-cdef-3829-86a07a39d396")
public static String es_PE_FIELD_RequestsSource_MailTemplate_Help="El patrón de correo indica el patrón de correo para mensajes de retorno.";

@XendraField(AD_Column_ID="R_MailText_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c2cdcdde-0adb-ef52-0a9e-48cf3e306ac6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="11b593ba-9b9f-cdef-3829-86a07a39d396")
public static final String FIELDNAME_RequestsSource_MailTemplate="11b593ba-9b9f-cdef-3829-86a07a39d396";

@XendraTrl(Identifier="8ed5cb09-0614-cfa9-712e-1a895d7425dc")
public static String es_PE_FIELD_RequestsSource_MailTemplate2_Name="Patrón de Correo";

@XendraTrl(Identifier="8ed5cb09-0614-cfa9-712e-1a895d7425dc")
public static String es_PE_FIELD_RequestsSource_MailTemplate2_Description="Patrón de texto para correos.";

@XendraTrl(Identifier="8ed5cb09-0614-cfa9-712e-1a895d7425dc")
public static String es_PE_FIELD_RequestsSource_MailTemplate2_Help="El patrón de correo indica el patrón de correo para mensajes de retorno.";

@XendraField(AD_Column_ID="R_MailText_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8a4561d7-25be-5533-de4c-ab4735c335ee",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8ed5cb09-0614-cfa9-712e-1a895d7425dc")
public static final String FIELDNAME_RequestsSource_MailTemplate2="8ed5cb09-0614-cfa9-712e-1a895d7425dc";

@XendraTrl(Identifier="921b130c-9d89-073c-7c77-d93c1241976d")
public static String es_PE_COLUMN_R_MailText_ID_Name="Patrón de Correo";

@XendraColumn(AD_Element_ID="02b75e55-f80b-d8c7-5f34-dfc8b6205e3e",ColumnName="R_MailText_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="org.compiere.model.CalloutRequest.copyMail",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="921b130c-9d89-073c-7c77-d93c1241976d",Synchronized="2019-08-30 22:23:48.0")
/** Column name R_MailText_ID */
public static final String COLUMNNAME_R_MailText_ID = "R_MailText_ID";
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

@XendraTrl(Identifier="f4613922-230c-ac06-64b2-dffb6344a425")
public static String es_PE_FIELD_Request_Request_Name="Solicitud";

@XendraTrl(Identifier="f4613922-230c-ac06-64b2-dffb6344a425")
public static String es_PE_FIELD_Request_Request_Description="Solicitud de un socio de negocio ó prospecto.";

@XendraTrl(Identifier="f4613922-230c-ac06-64b2-dffb6344a425")
public static String es_PE_FIELD_Request_Request_Help="La solicitud identifica un requerimiento único de un socio de negocio ó prospecto.";

@XendraField(AD_Column_ID="R_Request_ID",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f4613922-230c-ac06-64b2-dffb6344a425")
public static final String FIELDNAME_Request_Request="f4613922-230c-ac06-64b2-dffb6344a425";

@XendraTrl(Identifier="214f6251-10ae-42b5-a3a1-d5524ae1b814")
public static String es_PE_FIELD_Request_Request2_Name="Solicitud";

@XendraTrl(Identifier="214f6251-10ae-42b5-a3a1-d5524ae1b814")
public static String es_PE_FIELD_Request_Request2_Description="Solicitud de un socio de negocio ó prospecto.";

@XendraTrl(Identifier="214f6251-10ae-42b5-a3a1-d5524ae1b814")
public static String es_PE_FIELD_Request_Request2_Help="La solicitud identifica un requerimiento único de un socio de negocio ó prospecto.";

@XendraField(AD_Column_ID="R_Request_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a6082d0b-507b-9bdf-147b-9db501402eae",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="214f6251-10ae-42b5-a3a1-d5524ae1b814")
public static final String FIELDNAME_Request_Request2="214f6251-10ae-42b5-a3a1-d5524ae1b814";

@XendraTrl(Identifier="746310ae-a925-7805-0449-3bd4183ad85a")
public static String es_PE_FIELD_PartnerRequests_Request_Name="Solicitud";

@XendraTrl(Identifier="746310ae-a925-7805-0449-3bd4183ad85a")
public static String es_PE_FIELD_PartnerRequests_Request_Description="Solicitud de un socio de negocio ó prospecto.";

@XendraTrl(Identifier="746310ae-a925-7805-0449-3bd4183ad85a")
public static String es_PE_FIELD_PartnerRequests_Request_Help="La solicitud identifica un requerimiento único de un socio de negocio ó prospecto.";

@XendraField(AD_Column_ID="R_Request_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a25fb60-7718-c6c9-b67f-7adeb07cfa19",AD_FieldGroup_ID="Reference",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=true,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="746310ae-a925-7805-0449-3bd4183ad85a")
public static final String FIELDNAME_PartnerRequests_Request="746310ae-a925-7805-0449-3bd4183ad85a";

@XendraTrl(Identifier="06412648-abe7-05fd-cc2b-d474ad87bed7")
public static String es_PE_FIELD_RequestsSource_Request_Name="Solicitud";

@XendraTrl(Identifier="06412648-abe7-05fd-cc2b-d474ad87bed7")
public static String es_PE_FIELD_RequestsSource_Request_Description="Solicitud de un socio de negocio ó prospecto.";

@XendraTrl(Identifier="06412648-abe7-05fd-cc2b-d474ad87bed7")
public static String es_PE_FIELD_RequestsSource_Request_Help="La solicitud identifica un requerimiento único de un socio de negocio ó prospecto.";

@XendraField(AD_Column_ID="R_Request_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c2cdcdde-0adb-ef52-0a9e-48cf3e306ac6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="06412648-abe7-05fd-cc2b-d474ad87bed7")
public static final String FIELDNAME_RequestsSource_Request="06412648-abe7-05fd-cc2b-d474ad87bed7";

@XendraTrl(Identifier="9c5fe3b2-1a0b-d0f6-3d45-17006858f89f")
public static String es_PE_FIELD_RequestsSource_Request2_Name="Solicitud";

@XendraTrl(Identifier="9c5fe3b2-1a0b-d0f6-3d45-17006858f89f")
public static String es_PE_FIELD_RequestsSource_Request2_Description="Solicitud de un socio de negocio ó prospecto.";

@XendraTrl(Identifier="9c5fe3b2-1a0b-d0f6-3d45-17006858f89f")
public static String es_PE_FIELD_RequestsSource_Request2_Help="La solicitud identifica un requerimiento único de un socio de negocio ó prospecto.";

@XendraField(AD_Column_ID="R_Request_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8a4561d7-25be-5533-de4c-ab4735c335ee",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9c5fe3b2-1a0b-d0f6-3d45-17006858f89f")
public static final String FIELDNAME_RequestsSource_Request2="9c5fe3b2-1a0b-d0f6-3d45-17006858f89f";
/** Column name R_Request_ID */
public static final String COLUMNNAME_R_Request_ID = "R_Request_ID";
/** Set Related Request.
@param R_RequestRelated_ID Related Request (Master Issue, ..) */
public void setR_RequestRelated_ID (int R_RequestRelated_ID)
{
if (R_RequestRelated_ID <= 0) set_Value (COLUMNNAME_R_RequestRelated_ID, null);
 else 
set_Value (COLUMNNAME_R_RequestRelated_ID, Integer.valueOf(R_RequestRelated_ID));
}
/** Get Related Request.
@return Related Request (Master Issue, ..) */
public int getR_RequestRelated_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_RequestRelated_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="43f18c6e-e0b1-ed23-0228-c0355c20ffad")
public static String es_PE_FIELD_Request_RelatedRequest_Name="Solicitud Relacionada";

@XendraTrl(Identifier="43f18c6e-e0b1-ed23-0228-c0355c20ffad")
public static String es_PE_FIELD_Request_RelatedRequest_Description="Solicitud Relacionada (Edicion especial, ..)";

@XendraTrl(Identifier="43f18c6e-e0b1-ed23-0228-c0355c20ffad")
public static String es_PE_FIELD_Request_RelatedRequest_Help="Solicitudes Relacionadas con esta solicitud";

@XendraField(AD_Column_ID="R_RequestRelated_ID",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="43f18c6e-e0b1-ed23-0228-c0355c20ffad")
public static final String FIELDNAME_Request_RelatedRequest="43f18c6e-e0b1-ed23-0228-c0355c20ffad";

@XendraTrl(Identifier="317c92c4-68d4-c033-adf3-bfb191f2a305")
public static String es_PE_FIELD_Request_RelatedRequest2_Name="Solicitud Relacionada";

@XendraTrl(Identifier="317c92c4-68d4-c033-adf3-bfb191f2a305")
public static String es_PE_FIELD_Request_RelatedRequest2_Description="Solicitud Relacionada (Edicion especial, ..)";

@XendraTrl(Identifier="317c92c4-68d4-c033-adf3-bfb191f2a305")
public static String es_PE_FIELD_Request_RelatedRequest2_Help="Solicitudes Relacionadas con esta solicitud";

@XendraField(AD_Column_ID="R_RequestRelated_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a6082d0b-507b-9bdf-147b-9db501402eae",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="317c92c4-68d4-c033-adf3-bfb191f2a305")
public static final String FIELDNAME_Request_RelatedRequest2="317c92c4-68d4-c033-adf3-bfb191f2a305";

@XendraTrl(Identifier="05af1b9c-2137-f2a3-ed29-e454ec4b1e07")
public static String es_PE_FIELD_PartnerRequests_RelatedRequest_Name="Solicitud Relacionada";

@XendraTrl(Identifier="05af1b9c-2137-f2a3-ed29-e454ec4b1e07")
public static String es_PE_FIELD_PartnerRequests_RelatedRequest_Description="Solicitud Relacionada (Edicion especial, ..)";

@XendraTrl(Identifier="05af1b9c-2137-f2a3-ed29-e454ec4b1e07")
public static String es_PE_FIELD_PartnerRequests_RelatedRequest_Help="Solicitudes Relacionadas con esta solicitud";

@XendraField(AD_Column_ID="R_RequestRelated_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a25fb60-7718-c6c9-b67f-7adeb07cfa19",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="05af1b9c-2137-f2a3-ed29-e454ec4b1e07")
public static final String FIELDNAME_PartnerRequests_RelatedRequest="05af1b9c-2137-f2a3-ed29-e454ec4b1e07";

@XendraTrl(Identifier="80c3b521-d702-c58a-cde0-33e650c39ecb")
public static String es_PE_FIELD_RequestsSource_RelatedRequest_Name="Solicitud Relacionada";

@XendraTrl(Identifier="80c3b521-d702-c58a-cde0-33e650c39ecb")
public static String es_PE_FIELD_RequestsSource_RelatedRequest_Description="Solicitud Relacionada (Edicion especial, ..)";

@XendraTrl(Identifier="80c3b521-d702-c58a-cde0-33e650c39ecb")
public static String es_PE_FIELD_RequestsSource_RelatedRequest_Help="Solicitudes Relacionadas con esta solicitud";

@XendraField(AD_Column_ID="R_RequestRelated_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c2cdcdde-0adb-ef52-0a9e-48cf3e306ac6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="80c3b521-d702-c58a-cde0-33e650c39ecb")
public static final String FIELDNAME_RequestsSource_RelatedRequest="80c3b521-d702-c58a-cde0-33e650c39ecb";

@XendraTrl(Identifier="fbb3c0db-a796-eeec-c80a-3893c6ffede3")
public static String es_PE_FIELD_RequestsSource_RelatedRequest2_Name="Solicitud Relacionada";

@XendraTrl(Identifier="fbb3c0db-a796-eeec-c80a-3893c6ffede3")
public static String es_PE_FIELD_RequestsSource_RelatedRequest2_Description="Solicitud Relacionada (Edicion especial, ..)";

@XendraTrl(Identifier="fbb3c0db-a796-eeec-c80a-3893c6ffede3")
public static String es_PE_FIELD_RequestsSource_RelatedRequest2_Help="Solicitudes Relacionadas con esta solicitud";

@XendraField(AD_Column_ID="R_RequestRelated_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8a4561d7-25be-5533-de4c-ab4735c335ee",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fbb3c0db-a796-eeec-c80a-3893c6ffede3")
public static final String FIELDNAME_RequestsSource_RelatedRequest2="fbb3c0db-a796-eeec-c80a-3893c6ffede3";

@XendraTrl(Identifier="8e7d40ac-6623-8c62-3456-70879f73712a")
public static String es_PE_COLUMN_R_RequestRelated_ID_Name="Solicitud Relacionada";

@XendraColumn(AD_Element_ID="b44a6e46-7812-3f28-e6e7-418b32486474",
ColumnName="R_RequestRelated_ID",AD_Reference_ID=30,
AD_Reference_Value_ID="ccd480fb-0302-13e0-aac2-37b21533eebf",AD_Val_Rule_ID="",FieldLength=10,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="8e7d40ac-6623-8c62-3456-70879f73712a",
Synchronized="2019-08-30 22:23:48.0")
/** Column name R_RequestRelated_ID */
public static final String COLUMNNAME_R_RequestRelated_ID = "R_RequestRelated_ID";
/** Set Request Type.
@param R_RequestType_ID Type of request (e.g. Inquiry, Complaint, ..) */
public void setR_RequestType_ID (int R_RequestType_ID)
{
if (R_RequestType_ID < 1) throw new IllegalArgumentException ("R_RequestType_ID is mandatory.");
set_Value (COLUMNNAME_R_RequestType_ID, Integer.valueOf(R_RequestType_ID));
}
/** Get Request Type.
@return Type of request (e.g. Inquiry, Complaint, ..) */
public int getR_RequestType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_RequestType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f61a17c5-7d22-c87d-c8cb-c79e9762a138")
public static String es_PE_FIELD_Request_RequestType_Name="Tipo de Solicitud";

@XendraTrl(Identifier="f61a17c5-7d22-c87d-c8cb-c79e9762a138")
public static String es_PE_FIELD_Request_RequestType_Description="Tipo de Solicitud (pregunta; queja).";

@XendraTrl(Identifier="f61a17c5-7d22-c87d-c8cb-c79e9762a138")
public static String es_PE_FIELD_Request_RequestType_Help="Tipos de solicitud son usados para procesar y categorizar solicitudes. Ejemplos: consultas de cuentas; garantías; etc.";

@XendraField(AD_Column_ID="R_RequestType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f61a17c5-7d22-c87d-c8cb-c79e9762a138")
public static final String FIELDNAME_Request_RequestType="f61a17c5-7d22-c87d-c8cb-c79e9762a138";

@XendraTrl(Identifier="27d96962-0067-82a8-dff5-20a2aa12c58b")
public static String es_PE_FIELD_Request_RequestType2_Name="Tipo de Solicitud";

@XendraTrl(Identifier="27d96962-0067-82a8-dff5-20a2aa12c58b")
public static String es_PE_FIELD_Request_RequestType2_Description="Tipo de Solicitud (pregunta; queja).";

@XendraTrl(Identifier="27d96962-0067-82a8-dff5-20a2aa12c58b")
public static String es_PE_FIELD_Request_RequestType2_Help="Tipos de solicitud son usados para procesar y categorizar solicitudes. Ejemplos: consultas de cuentas; garantías; etc.";

@XendraField(AD_Column_ID="R_RequestType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a6082d0b-507b-9bdf-147b-9db501402eae",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="27d96962-0067-82a8-dff5-20a2aa12c58b")
public static final String FIELDNAME_Request_RequestType2="27d96962-0067-82a8-dff5-20a2aa12c58b";

@XendraTrl(Identifier="511807f3-0a4d-b679-036a-d018683b439b")
public static String es_PE_FIELD_PartnerRequests_RequestType_Name="Tipo de Solicitud";

@XendraTrl(Identifier="511807f3-0a4d-b679-036a-d018683b439b")
public static String es_PE_FIELD_PartnerRequests_RequestType_Description="Tipo de Solicitud (pregunta; queja).";

@XendraTrl(Identifier="511807f3-0a4d-b679-036a-d018683b439b")
public static String es_PE_FIELD_PartnerRequests_RequestType_Help="Tipos de solicitud son usados para procesar y categorizar solicitudes. Ejemplos: consultas de cuentas; garantías; etc.";

@XendraField(AD_Column_ID="R_RequestType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a25fb60-7718-c6c9-b67f-7adeb07cfa19",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="511807f3-0a4d-b679-036a-d018683b439b")
public static final String FIELDNAME_PartnerRequests_RequestType="511807f3-0a4d-b679-036a-d018683b439b";

@XendraTrl(Identifier="4358f8dd-58ba-54ab-29ff-30a26dc21b9e")
public static String es_PE_FIELD_RequestsSource_RequestType_Name="Tipo de Solicitud";

@XendraTrl(Identifier="4358f8dd-58ba-54ab-29ff-30a26dc21b9e")
public static String es_PE_FIELD_RequestsSource_RequestType_Description="Tipo de Solicitud (pregunta; queja).";

@XendraTrl(Identifier="4358f8dd-58ba-54ab-29ff-30a26dc21b9e")
public static String es_PE_FIELD_RequestsSource_RequestType_Help="Tipos de solicitud son usados para procesar y categorizar solicitudes. Ejemplos: consultas de cuentas; garantías; etc.";

@XendraField(AD_Column_ID="R_RequestType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c2cdcdde-0adb-ef52-0a9e-48cf3e306ac6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4358f8dd-58ba-54ab-29ff-30a26dc21b9e")
public static final String FIELDNAME_RequestsSource_RequestType="4358f8dd-58ba-54ab-29ff-30a26dc21b9e";

@XendraTrl(Identifier="2c46c29b-aab1-f914-cfcc-21d75cd5ef74")
public static String es_PE_FIELD_RequestsSource_RequestType2_Name="Tipo de Solicitud";

@XendraTrl(Identifier="2c46c29b-aab1-f914-cfcc-21d75cd5ef74")
public static String es_PE_FIELD_RequestsSource_RequestType2_Description="Tipo de Solicitud (pregunta; queja).";

@XendraTrl(Identifier="2c46c29b-aab1-f914-cfcc-21d75cd5ef74")
public static String es_PE_FIELD_RequestsSource_RequestType2_Help="Tipos de solicitud son usados para procesar y categorizar solicitudes. Ejemplos: consultas de cuentas; garantías; etc.";

@XendraField(AD_Column_ID="R_RequestType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8a4561d7-25be-5533-de4c-ab4735c335ee",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2c46c29b-aab1-f914-cfcc-21d75cd5ef74")
public static final String FIELDNAME_RequestsSource_RequestType2="2c46c29b-aab1-f914-cfcc-21d75cd5ef74";

@XendraTrl(Identifier="68536d34-d111-90cf-26bb-0f1e825a4f0b")
public static String es_PE_COLUMN_R_RequestType_ID_Name="Tipo de Solicitud";

@XendraColumn(AD_Element_ID="5d38239d-4d14-9ae8-35a8-4f92ae90ab59",ColumnName="R_RequestType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="org.compiere.model.CalloutRequest.type",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="68536d34-d111-90cf-26bb-0f1e825a4f0b",Synchronized="2019-08-30 22:23:48.0")
/** Column name R_RequestType_ID */
public static final String COLUMNNAME_R_RequestType_ID = "R_RequestType_ID";
/** Set Resolution.
@param R_Resolution_ID Request Resolution */
public void setR_Resolution_ID (int R_Resolution_ID)
{
if (R_Resolution_ID <= 0) set_Value (COLUMNNAME_R_Resolution_ID, null);
 else 
set_Value (COLUMNNAME_R_Resolution_ID, Integer.valueOf(R_Resolution_ID));
}
/** Get Resolution.
@return Request Resolution */
public int getR_Resolution_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_Resolution_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2718e598-f329-ba77-68a5-41c6a08925c8")
public static String es_PE_FIELD_Request_Resolution_Name="Resolución";

@XendraTrl(Identifier="2718e598-f329-ba77-68a5-41c6a08925c8")
public static String es_PE_FIELD_Request_Resolution_Description="Resolución de la solicitud.";

@XendraTrl(Identifier="2718e598-f329-ba77-68a5-41c6a08925c8")
public static String es_PE_FIELD_Request_Resolution_Help="Estado de la resolución (ej. Corregida, Rechazada).";

@XendraField(AD_Column_ID="R_Resolution_ID",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2718e598-f329-ba77-68a5-41c6a08925c8")
public static final String FIELDNAME_Request_Resolution="2718e598-f329-ba77-68a5-41c6a08925c8";

@XendraTrl(Identifier="9b24c812-46b0-1ee1-559b-2d63da20856f")
public static String es_PE_FIELD_Request_Resolution2_Name="Resolución";

@XendraTrl(Identifier="9b24c812-46b0-1ee1-559b-2d63da20856f")
public static String es_PE_FIELD_Request_Resolution2_Description="Resolución de la solicitud.";

@XendraTrl(Identifier="9b24c812-46b0-1ee1-559b-2d63da20856f")
public static String es_PE_FIELD_Request_Resolution2_Help="Estado de la resolución (ej. Corregida, Rechazada).";

@XendraField(AD_Column_ID="R_Resolution_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a6082d0b-507b-9bdf-147b-9db501402eae",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9b24c812-46b0-1ee1-559b-2d63da20856f")
public static final String FIELDNAME_Request_Resolution2="9b24c812-46b0-1ee1-559b-2d63da20856f";

@XendraTrl(Identifier="eae4c8fa-1e87-9a28-b5b8-d8dbec1c0c18")
public static String es_PE_FIELD_PartnerRequests_Resolution_Name="Resolución";

@XendraTrl(Identifier="eae4c8fa-1e87-9a28-b5b8-d8dbec1c0c18")
public static String es_PE_FIELD_PartnerRequests_Resolution_Description="Resolución de la solicitud.";

@XendraTrl(Identifier="eae4c8fa-1e87-9a28-b5b8-d8dbec1c0c18")
public static String es_PE_FIELD_PartnerRequests_Resolution_Help="Estado de la resolución (ej. Corregida, Rechazada).";

@XendraField(AD_Column_ID="R_Resolution_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a25fb60-7718-c6c9-b67f-7adeb07cfa19",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="eae4c8fa-1e87-9a28-b5b8-d8dbec1c0c18")
public static final String FIELDNAME_PartnerRequests_Resolution="eae4c8fa-1e87-9a28-b5b8-d8dbec1c0c18";

@XendraTrl(Identifier="07bd4c39-e18d-04dc-9cbf-0376cf908892")
public static String es_PE_FIELD_RequestsSource_Resolution_Name="Resolución";

@XendraTrl(Identifier="07bd4c39-e18d-04dc-9cbf-0376cf908892")
public static String es_PE_FIELD_RequestsSource_Resolution_Description="Resolución de la solicitud.";

@XendraTrl(Identifier="07bd4c39-e18d-04dc-9cbf-0376cf908892")
public static String es_PE_FIELD_RequestsSource_Resolution_Help="Estado de la resolución (ej. Corregida, Rechazada).";

@XendraField(AD_Column_ID="R_Resolution_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c2cdcdde-0adb-ef52-0a9e-48cf3e306ac6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="07bd4c39-e18d-04dc-9cbf-0376cf908892")
public static final String FIELDNAME_RequestsSource_Resolution="07bd4c39-e18d-04dc-9cbf-0376cf908892";

@XendraTrl(Identifier="1d7b9723-cd9e-c9b1-18f1-610d9bdf512f")
public static String es_PE_FIELD_RequestsSource_Resolution2_Name="Resolución";

@XendraTrl(Identifier="1d7b9723-cd9e-c9b1-18f1-610d9bdf512f")
public static String es_PE_FIELD_RequestsSource_Resolution2_Description="Resolución de la solicitud.";

@XendraTrl(Identifier="1d7b9723-cd9e-c9b1-18f1-610d9bdf512f")
public static String es_PE_FIELD_RequestsSource_Resolution2_Help="Estado de la resolución (ej. Corregida, Rechazada).";

@XendraField(AD_Column_ID="R_Resolution_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8a4561d7-25be-5533-de4c-ab4735c335ee",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1d7b9723-cd9e-c9b1-18f1-610d9bdf512f")
public static final String FIELDNAME_RequestsSource_Resolution2="1d7b9723-cd9e-c9b1-18f1-610d9bdf512f";

@XendraTrl(Identifier="50ddc76a-9e95-0e0b-60b1-40c7f1964c3f")
public static String es_PE_COLUMN_R_Resolution_ID_Name="Resolución";

@XendraColumn(AD_Element_ID="f1494d01-bdca-50e4-5a19-05c833230786",ColumnName="R_Resolution_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="50ddc76a-9e95-0e0b-60b1-40c7f1964c3f",
Synchronized="2019-08-30 22:23:48.0")
/** Column name R_Resolution_ID */
public static final String COLUMNNAME_R_Resolution_ID = "R_Resolution_ID";
/** Set Standard Response.
@param R_StandardResponse_ID Request Standard Response  */
public void setR_StandardResponse_ID (int R_StandardResponse_ID)
{
if (R_StandardResponse_ID <= 0) set_Value (COLUMNNAME_R_StandardResponse_ID, null);
 else 
set_Value (COLUMNNAME_R_StandardResponse_ID, Integer.valueOf(R_StandardResponse_ID));
}
/** Get Standard Response.
@return Request Standard Response  */
public int getR_StandardResponse_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_StandardResponse_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="532b7d66-9253-1a10-835a-c9288a5f0fc4")
public static String es_PE_FIELD_Request_StandardResponse_Name="Respuesta Estandar";

@XendraTrl(Identifier="532b7d66-9253-1a10-835a-c9288a5f0fc4")
public static String es_PE_FIELD_Request_StandardResponse_Description="Respuesta estandar de la solicitud.";

@XendraTrl(Identifier="532b7d66-9253-1a10-835a-c9288a5f0fc4")
public static String es_PE_FIELD_Request_StandardResponse_Help="Bloques de texto que se copiarán en el texto de la respuesta de la solicitud.";

@XendraField(AD_Column_ID="R_StandardResponse_ID",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="Action",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="532b7d66-9253-1a10-835a-c9288a5f0fc4")
public static final String FIELDNAME_Request_StandardResponse="532b7d66-9253-1a10-835a-c9288a5f0fc4";

@XendraTrl(Identifier="45a104a4-da50-c754-b9d1-cc84e8dab06a")
public static String es_PE_FIELD_Request_StandardResponse2_Name="Respuesta Estandar";

@XendraTrl(Identifier="45a104a4-da50-c754-b9d1-cc84e8dab06a")
public static String es_PE_FIELD_Request_StandardResponse2_Description="Respuesta estandar de la solicitud.";

@XendraTrl(Identifier="45a104a4-da50-c754-b9d1-cc84e8dab06a")
public static String es_PE_FIELD_Request_StandardResponse2_Help="Bloques de texto que se copiarán en el texto de la respuesta de la solicitud.";

@XendraField(AD_Column_ID="R_StandardResponse_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a6082d0b-507b-9bdf-147b-9db501402eae",AD_FieldGroup_ID="Action",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="45a104a4-da50-c754-b9d1-cc84e8dab06a")
public static final String FIELDNAME_Request_StandardResponse2="45a104a4-da50-c754-b9d1-cc84e8dab06a";

@XendraTrl(Identifier="be78fd39-e61f-9375-f62b-224423a6464c")
public static String es_PE_FIELD_PartnerRequests_StandardResponse_Name="Respuesta Estandar";

@XendraTrl(Identifier="be78fd39-e61f-9375-f62b-224423a6464c")
public static String es_PE_FIELD_PartnerRequests_StandardResponse_Description="Respuesta estandar de la solicitud.";

@XendraTrl(Identifier="be78fd39-e61f-9375-f62b-224423a6464c")
public static String es_PE_FIELD_PartnerRequests_StandardResponse_Help="Bloques de texto que se copiarán en el texto de la respuesta de la solicitud.";

@XendraField(AD_Column_ID="R_StandardResponse_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a25fb60-7718-c6c9-b67f-7adeb07cfa19",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="be78fd39-e61f-9375-f62b-224423a6464c")
public static final String FIELDNAME_PartnerRequests_StandardResponse="be78fd39-e61f-9375-f62b-224423a6464c";

@XendraTrl(Identifier="094eeb2c-63d5-a94d-4bfe-3d62ffda5020")
public static String es_PE_FIELD_RequestsSource_StandardResponse_Name="Respuesta Estandar";

@XendraTrl(Identifier="094eeb2c-63d5-a94d-4bfe-3d62ffda5020")
public static String es_PE_FIELD_RequestsSource_StandardResponse_Description="Respuesta estandar de la solicitud.";

@XendraTrl(Identifier="094eeb2c-63d5-a94d-4bfe-3d62ffda5020")
public static String es_PE_FIELD_RequestsSource_StandardResponse_Help="Bloques de texto que se copiarán en el texto de la respuesta de la solicitud.";

@XendraField(AD_Column_ID="R_StandardResponse_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c2cdcdde-0adb-ef52-0a9e-48cf3e306ac6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="094eeb2c-63d5-a94d-4bfe-3d62ffda5020")
public static final String FIELDNAME_RequestsSource_StandardResponse="094eeb2c-63d5-a94d-4bfe-3d62ffda5020";

@XendraTrl(Identifier="e264333f-70aa-034b-0f4a-337b424aa9c5")
public static String es_PE_FIELD_RequestsSource_StandardResponse2_Name="Respuesta Estandar";

@XendraTrl(Identifier="e264333f-70aa-034b-0f4a-337b424aa9c5")
public static String es_PE_FIELD_RequestsSource_StandardResponse2_Description="Respuesta estandar de la solicitud.";

@XendraTrl(Identifier="e264333f-70aa-034b-0f4a-337b424aa9c5")
public static String es_PE_FIELD_RequestsSource_StandardResponse2_Help="Bloques de texto que se copiarán en el texto de la respuesta de la solicitud.";

@XendraField(AD_Column_ID="R_StandardResponse_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8a4561d7-25be-5533-de4c-ab4735c335ee",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e264333f-70aa-034b-0f4a-337b424aa9c5")
public static final String FIELDNAME_RequestsSource_StandardResponse2="e264333f-70aa-034b-0f4a-337b424aa9c5";

@XendraTrl(Identifier="736b0a5a-c06a-e425-aaa0-1fee0248ac13")
public static String es_PE_COLUMN_R_StandardResponse_ID_Name="Respuesta Estandar";

@XendraColumn(AD_Element_ID="4a8c7e7b-b627-5f61-b147-9c6f64ea5d2a",
ColumnName="R_StandardResponse_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutRequest.copyResponse",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="736b0a5a-c06a-e425-aaa0-1fee0248ac13",
Synchronized="2019-08-30 22:23:48.0")
/** Column name R_StandardResponse_ID */
public static final String COLUMNNAME_R_StandardResponse_ID = "R_StandardResponse_ID";
/** Set Status.
@param R_Status_ID Request Status */
public void setR_Status_ID (int R_Status_ID)
{
if (R_Status_ID <= 0) set_Value (COLUMNNAME_R_Status_ID, null);
 else 
set_Value (COLUMNNAME_R_Status_ID, Integer.valueOf(R_Status_ID));
}
/** Get Status.
@return Request Status */
public int getR_Status_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_Status_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="fd666453-f9aa-5cff-c2dd-a5f170376832")
public static String es_PE_FIELD_Request_Status_Name="Estado";

@XendraTrl(Identifier="fd666453-f9aa-5cff-c2dd-a5f170376832")
public static String es_PE_FIELD_Request_Status_Description="Estado de la solicitud";

@XendraTrl(Identifier="fd666453-f9aa-5cff-c2dd-a5f170376832")
public static String es_PE_FIELD_Request_Status_Help="Estado de la solicitud (Abierta, cerrada, investigación, ..)";

@XendraField(AD_Column_ID="R_Status_ID",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fd666453-f9aa-5cff-c2dd-a5f170376832")
public static final String FIELDNAME_Request_Status="fd666453-f9aa-5cff-c2dd-a5f170376832";

@XendraTrl(Identifier="2e9d33d6-2000-84ca-d788-afeb4b3d3222")
public static String es_PE_FIELD_Request_Status2_Name="Estado";

@XendraTrl(Identifier="2e9d33d6-2000-84ca-d788-afeb4b3d3222")
public static String es_PE_FIELD_Request_Status2_Description="Estado de la solicitud";

@XendraTrl(Identifier="2e9d33d6-2000-84ca-d788-afeb4b3d3222")
public static String es_PE_FIELD_Request_Status2_Help="Estado de la solicitud (Abierta, cerrada, investigación, ..)";

@XendraField(AD_Column_ID="R_Status_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a6082d0b-507b-9bdf-147b-9db501402eae",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2e9d33d6-2000-84ca-d788-afeb4b3d3222")
public static final String FIELDNAME_Request_Status2="2e9d33d6-2000-84ca-d788-afeb4b3d3222";

@XendraTrl(Identifier="97c1e1b0-273f-7faf-c16c-04d0d5ede6b4")
public static String es_PE_FIELD_PartnerRequests_Status_Name="Estado";

@XendraTrl(Identifier="97c1e1b0-273f-7faf-c16c-04d0d5ede6b4")
public static String es_PE_FIELD_PartnerRequests_Status_Description="Estado de la solicitud";

@XendraTrl(Identifier="97c1e1b0-273f-7faf-c16c-04d0d5ede6b4")
public static String es_PE_FIELD_PartnerRequests_Status_Help="Estado de la solicitud (Abierta, cerrada, investigación, ..)";

@XendraField(AD_Column_ID="R_Status_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a25fb60-7718-c6c9-b67f-7adeb07cfa19",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="97c1e1b0-273f-7faf-c16c-04d0d5ede6b4")
public static final String FIELDNAME_PartnerRequests_Status="97c1e1b0-273f-7faf-c16c-04d0d5ede6b4";

@XendraTrl(Identifier="3f3a13fa-62a6-fd53-c16b-5fee7fdba716")
public static String es_PE_FIELD_RequestsSource_Status_Name="Estado";

@XendraTrl(Identifier="3f3a13fa-62a6-fd53-c16b-5fee7fdba716")
public static String es_PE_FIELD_RequestsSource_Status_Description="Estado de la solicitud";

@XendraTrl(Identifier="3f3a13fa-62a6-fd53-c16b-5fee7fdba716")
public static String es_PE_FIELD_RequestsSource_Status_Help="Estado de la solicitud (Abierta, cerrada, investigación, ..)";

@XendraField(AD_Column_ID="R_Status_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c2cdcdde-0adb-ef52-0a9e-48cf3e306ac6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3f3a13fa-62a6-fd53-c16b-5fee7fdba716")
public static final String FIELDNAME_RequestsSource_Status="3f3a13fa-62a6-fd53-c16b-5fee7fdba716";

@XendraTrl(Identifier="b0349b79-89c5-fcf6-266e-04858833273d")
public static String es_PE_FIELD_RequestsSource_Status2_Name="Estado";

@XendraTrl(Identifier="b0349b79-89c5-fcf6-266e-04858833273d")
public static String es_PE_FIELD_RequestsSource_Status2_Description="Estado de la solicitud";

@XendraTrl(Identifier="b0349b79-89c5-fcf6-266e-04858833273d")
public static String es_PE_FIELD_RequestsSource_Status2_Help="Estado de la solicitud (Abierta, cerrada, investigación, ..)";

@XendraField(AD_Column_ID="R_Status_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8a4561d7-25be-5533-de4c-ab4735c335ee",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b0349b79-89c5-fcf6-266e-04858833273d")
public static final String FIELDNAME_RequestsSource_Status2="b0349b79-89c5-fcf6-266e-04858833273d";

@XendraTrl(Identifier="619c256d-b690-8bdf-622a-4e91324cc527")
public static String es_PE_COLUMN_R_Status_ID_Name="Estado";

@XendraColumn(AD_Element_ID="fb78f5e8-0d33-bd16-b71c-7723f04619ee",ColumnName="R_Status_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="0e96f775-7575-bf2f-2a6a-e25170023cab",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="619c256d-b690-8bdf-622a-4e91324cc527",Synchronized="2019-08-30 22:23:48.0")
/** Column name R_Status_ID */
public static final String COLUMNNAME_R_Status_ID = "R_Status_ID";
/** Set Sales Representative.
@param SalesRep_ID Sales Representative or Company Agent */
public void setSalesRep_ID (int SalesRep_ID)
{
if (SalesRep_ID < 1) throw new IllegalArgumentException ("SalesRep_ID is mandatory.");
set_Value (COLUMNNAME_SalesRep_ID, Integer.valueOf(SalesRep_ID));
}
/** Get Sales Representative.
@return Sales Representative or Company Agent */
public int getSalesRep_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_SalesRep_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a5ddbcf0-544e-ec9c-d1e1-bf0fbf23392b")
public static String es_PE_FIELD_Request_SalesRepresentative_Name="Agente Cía";

@XendraTrl(Identifier="a5ddbcf0-544e-ec9c-d1e1-bf0fbf23392b")
public static String es_PE_FIELD_Request_SalesRepresentative_Description="Representante de Ventas";

@XendraTrl(Identifier="a5ddbcf0-544e-ec9c-d1e1-bf0fbf23392b")
public static String es_PE_FIELD_Request_SalesRepresentative_Help="El representante de ventas indica el representante de ventas para esta región.";

@XendraField(AD_Column_ID="SalesRep_ID",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="Action",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a5ddbcf0-544e-ec9c-d1e1-bf0fbf23392b")
public static final String FIELDNAME_Request_SalesRepresentative="a5ddbcf0-544e-ec9c-d1e1-bf0fbf23392b";

@XendraTrl(Identifier="fd94d0a0-5182-ceb6-3634-771aa7f1a50d")
public static String es_PE_FIELD_Request_SalesRepresentative2_Name="Agente Cía";

@XendraTrl(Identifier="fd94d0a0-5182-ceb6-3634-771aa7f1a50d")
public static String es_PE_FIELD_Request_SalesRepresentative2_Description="Representante de Ventas";

@XendraTrl(Identifier="fd94d0a0-5182-ceb6-3634-771aa7f1a50d")
public static String es_PE_FIELD_Request_SalesRepresentative2_Help="El representante de ventas indica el representante de ventas para esta región.";

@XendraField(AD_Column_ID="SalesRep_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a6082d0b-507b-9bdf-147b-9db501402eae",AD_FieldGroup_ID="Action",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fd94d0a0-5182-ceb6-3634-771aa7f1a50d")
public static final String FIELDNAME_Request_SalesRepresentative2="fd94d0a0-5182-ceb6-3634-771aa7f1a50d";

@XendraTrl(Identifier="9c97da54-0e2d-c7b7-1778-70cee7e8444d")
public static String es_PE_FIELD_PartnerRequests_SalesRepresentative_Name="Agente Cía";

@XendraTrl(Identifier="9c97da54-0e2d-c7b7-1778-70cee7e8444d")
public static String es_PE_FIELD_PartnerRequests_SalesRepresentative_Description="Representante de Ventas";

@XendraTrl(Identifier="9c97da54-0e2d-c7b7-1778-70cee7e8444d")
public static String es_PE_FIELD_PartnerRequests_SalesRepresentative_Help="El representante de ventas indica el representante de ventas para esta región.";

@XendraField(AD_Column_ID="SalesRep_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a25fb60-7718-c6c9-b67f-7adeb07cfa19",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9c97da54-0e2d-c7b7-1778-70cee7e8444d")
public static final String FIELDNAME_PartnerRequests_SalesRepresentative="9c97da54-0e2d-c7b7-1778-70cee7e8444d";

@XendraTrl(Identifier="c770470d-fb30-d6af-ff35-084b811dfd3d")
public static String es_PE_FIELD_RequestsSource_SalesRepresentative_Name="Agente Cía";

@XendraTrl(Identifier="c770470d-fb30-d6af-ff35-084b811dfd3d")
public static String es_PE_FIELD_RequestsSource_SalesRepresentative_Description="Representante de Ventas";

@XendraTrl(Identifier="c770470d-fb30-d6af-ff35-084b811dfd3d")
public static String es_PE_FIELD_RequestsSource_SalesRepresentative_Help="El representante de ventas indica el representante de ventas para esta región.";

@XendraField(AD_Column_ID="SalesRep_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c2cdcdde-0adb-ef52-0a9e-48cf3e306ac6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c770470d-fb30-d6af-ff35-084b811dfd3d")
public static final String FIELDNAME_RequestsSource_SalesRepresentative="c770470d-fb30-d6af-ff35-084b811dfd3d";

@XendraTrl(Identifier="3fcab4bb-35b5-9de8-b22c-d8f872a85741")
public static String es_PE_FIELD_RequestsSource_SalesRepresentative2_Name="Agente Cía";

@XendraTrl(Identifier="3fcab4bb-35b5-9de8-b22c-d8f872a85741")
public static String es_PE_FIELD_RequestsSource_SalesRepresentative2_Description="Representante de Ventas";

@XendraTrl(Identifier="3fcab4bb-35b5-9de8-b22c-d8f872a85741")
public static String es_PE_FIELD_RequestsSource_SalesRepresentative2_Help="El representante de ventas indica el representante de ventas para esta región.";

@XendraField(AD_Column_ID="SalesRep_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8a4561d7-25be-5533-de4c-ab4735c335ee",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3fcab4bb-35b5-9de8-b22c-d8f872a85741")
public static final String FIELDNAME_RequestsSource_SalesRepresentative2="3fcab4bb-35b5-9de8-b22c-d8f872a85741";

@XendraTrl(Identifier="a2510d5f-8422-fe9a-53b9-d53c000e8986")
public static String es_PE_COLUMN_SalesRep_ID_Name="Agente Cía";

@XendraColumn(AD_Element_ID="197a9c3a-ff10-c291-d65f-5e05a36d3710",ColumnName="SalesRep_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="91f52193-02ab-6545-99f8-d6d30b9d03a1",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="@AD_User_ID@",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="a2510d5f-8422-fe9a-53b9-d53c000e8986",Synchronized="2019-08-30 22:23:48.0")
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

@XendraTrl(Identifier="85a5879a-1570-d46f-0959-c5b017a98182")
public static String es_PE_FIELD_Request_StartDate_Name="Fecha de Inicio";

@XendraTrl(Identifier="85a5879a-1570-d46f-0959-c5b017a98182")
public static String es_PE_FIELD_Request_StartDate_Description="Primer día efectivo (inclusive)";

@XendraTrl(Identifier="85a5879a-1570-d46f-0959-c5b017a98182")
public static String es_PE_FIELD_Request_StartDate_Help="La fecha de Inicio indica la primera fecha ó fecha inicial de un rango";

@XendraField(AD_Column_ID="StartDate",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=330,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="85a5879a-1570-d46f-0959-c5b017a98182")
public static final String FIELDNAME_Request_StartDate="85a5879a-1570-d46f-0959-c5b017a98182";

@XendraTrl(Identifier="31f4a6bb-98bb-8c50-7712-959fc5b661d8")
public static String es_PE_FIELD_Request_StartDate2_Name="Fecha de Inicio";

@XendraTrl(Identifier="31f4a6bb-98bb-8c50-7712-959fc5b661d8")
public static String es_PE_FIELD_Request_StartDate2_Description="Primer día efectivo (inclusive)";

@XendraTrl(Identifier="31f4a6bb-98bb-8c50-7712-959fc5b661d8")
public static String es_PE_FIELD_Request_StartDate2_Help="La fecha de Inicio indica la primera fecha ó fecha inicial de un rango";

@XendraField(AD_Column_ID="StartDate",IsCentrallyMaintained=true,
AD_Tab_ID="a6082d0b-507b-9bdf-147b-9db501402eae",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=500,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="31f4a6bb-98bb-8c50-7712-959fc5b661d8")
public static final String FIELDNAME_Request_StartDate2="31f4a6bb-98bb-8c50-7712-959fc5b661d8";

@XendraTrl(Identifier="2a9996c2-1223-8dbb-7c71-61bd3d8ae01d")
public static String es_PE_FIELD_PartnerRequests_StartDate_Name="Fecha de Inicio";

@XendraTrl(Identifier="2a9996c2-1223-8dbb-7c71-61bd3d8ae01d")
public static String es_PE_FIELD_PartnerRequests_StartDate_Description="Primer día efectivo (inclusive)";

@XendraTrl(Identifier="2a9996c2-1223-8dbb-7c71-61bd3d8ae01d")
public static String es_PE_FIELD_PartnerRequests_StartDate_Help="La fecha de Inicio indica la primera fecha ó fecha inicial de un rango";

@XendraField(AD_Column_ID="StartDate",IsCentrallyMaintained=true,
AD_Tab_ID="0a25fb60-7718-c6c9-b67f-7adeb07cfa19",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2a9996c2-1223-8dbb-7c71-61bd3d8ae01d")
public static final String FIELDNAME_PartnerRequests_StartDate="2a9996c2-1223-8dbb-7c71-61bd3d8ae01d";

@XendraTrl(Identifier="729fd104-6366-92fe-04d1-5561e5f78635")
public static String es_PE_FIELD_RequestsSource_StartDate_Name="Fecha de Inicio";

@XendraTrl(Identifier="729fd104-6366-92fe-04d1-5561e5f78635")
public static String es_PE_FIELD_RequestsSource_StartDate_Description="Primer día efectivo (inclusive)";

@XendraTrl(Identifier="729fd104-6366-92fe-04d1-5561e5f78635")
public static String es_PE_FIELD_RequestsSource_StartDate_Help="La fecha de Inicio indica la primera fecha ó fecha inicial de un rango";

@XendraField(AD_Column_ID="StartDate",IsCentrallyMaintained=true,
AD_Tab_ID="c2cdcdde-0adb-ef52-0a9e-48cf3e306ac6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="729fd104-6366-92fe-04d1-5561e5f78635")
public static final String FIELDNAME_RequestsSource_StartDate="729fd104-6366-92fe-04d1-5561e5f78635";

@XendraTrl(Identifier="0245b3be-133e-0214-d70a-7b701fe33d35")
public static String es_PE_FIELD_RequestsSource_StartDate2_Name="Fecha de Inicio";

@XendraTrl(Identifier="0245b3be-133e-0214-d70a-7b701fe33d35")
public static String es_PE_FIELD_RequestsSource_StartDate2_Description="Primer día efectivo (inclusive)";

@XendraTrl(Identifier="0245b3be-133e-0214-d70a-7b701fe33d35")
public static String es_PE_FIELD_RequestsSource_StartDate2_Help="La fecha de Inicio indica la primera fecha ó fecha inicial de un rango";

@XendraField(AD_Column_ID="StartDate",IsCentrallyMaintained=true,
AD_Tab_ID="8a4561d7-25be-5533-de4c-ab4735c335ee",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0245b3be-133e-0214-d70a-7b701fe33d35")
public static final String FIELDNAME_RequestsSource_StartDate2="0245b3be-133e-0214-d70a-7b701fe33d35";

@XendraTrl(Identifier="e16eaaea-5398-a35d-f430-a903c8cee7c3")
public static String es_PE_COLUMN_StartDate_Name="Fecha de Inicio";

@XendraColumn(AD_Element_ID="3fe42406-cab3-a569-bf0b-3614f5d95711",ColumnName="StartDate",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e16eaaea-5398-a35d-f430-a903c8cee7c3",
Synchronized="2019-08-30 22:23:48.0")
/** Column name StartDate */
public static final String COLUMNNAME_StartDate = "StartDate";
/** Set Start Time.
@param StartTime Time started */
public void setStartTime (Timestamp StartTime)
{
set_Value (COLUMNNAME_StartTime, StartTime);
}
/** Get Start Time.
@return Time started */
public Timestamp getStartTime() 
{
return (Timestamp)get_Value(COLUMNNAME_StartTime);
}

@XendraTrl(Identifier="a700217e-b87a-1f05-d161-5527ecfcfde6")
public static String es_PE_FIELD_Request_StartTime_Name="Fecha de Inicio";

@XendraTrl(Identifier="a700217e-b87a-1f05-d161-5527ecfcfde6")
public static String es_PE_FIELD_Request_StartTime_Description="Fecha de inicio";

@XendraField(AD_Column_ID="StartTime",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="Action",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a700217e-b87a-1f05-d161-5527ecfcfde6")
public static final String FIELDNAME_Request_StartTime="a700217e-b87a-1f05-d161-5527ecfcfde6";

@XendraTrl(Identifier="af767a3e-5824-119b-7ed3-6511fa01191f")
public static String es_PE_FIELD_Request_StartTime2_Name="Fecha de Inicio";

@XendraTrl(Identifier="af767a3e-5824-119b-7ed3-6511fa01191f")
public static String es_PE_FIELD_Request_StartTime2_Description="Fecha de inicio";

@XendraField(AD_Column_ID="StartTime",IsCentrallyMaintained=true,
AD_Tab_ID="a6082d0b-507b-9bdf-147b-9db501402eae",AD_FieldGroup_ID="Action",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="af767a3e-5824-119b-7ed3-6511fa01191f")
public static final String FIELDNAME_Request_StartTime2="af767a3e-5824-119b-7ed3-6511fa01191f";

@XendraTrl(Identifier="37dbcf44-c14d-9218-c35a-a7d841913378")
public static String es_PE_FIELD_PartnerRequests_StartTime_Name="Fecha de Inicio";

@XendraTrl(Identifier="37dbcf44-c14d-9218-c35a-a7d841913378")
public static String es_PE_FIELD_PartnerRequests_StartTime_Description="Fecha de inicio";

@XendraField(AD_Column_ID="StartTime",IsCentrallyMaintained=true,
AD_Tab_ID="0a25fb60-7718-c6c9-b67f-7adeb07cfa19",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="37dbcf44-c14d-9218-c35a-a7d841913378")
public static final String FIELDNAME_PartnerRequests_StartTime="37dbcf44-c14d-9218-c35a-a7d841913378";

@XendraTrl(Identifier="282529b8-7f03-db7c-4ecf-04e6b5bf28ba")
public static String es_PE_FIELD_RequestsSource_StartTime_Name="Fecha de Inicio";

@XendraTrl(Identifier="282529b8-7f03-db7c-4ecf-04e6b5bf28ba")
public static String es_PE_FIELD_RequestsSource_StartTime_Description="Fecha de inicio";

@XendraField(AD_Column_ID="StartTime",IsCentrallyMaintained=true,
AD_Tab_ID="c2cdcdde-0adb-ef52-0a9e-48cf3e306ac6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="282529b8-7f03-db7c-4ecf-04e6b5bf28ba")
public static final String FIELDNAME_RequestsSource_StartTime="282529b8-7f03-db7c-4ecf-04e6b5bf28ba";

@XendraTrl(Identifier="db9e96b5-186b-334d-4cfd-a7b73ff02c5e")
public static String es_PE_FIELD_RequestsSource_StartTime2_Name="Fecha de Inicio";

@XendraTrl(Identifier="db9e96b5-186b-334d-4cfd-a7b73ff02c5e")
public static String es_PE_FIELD_RequestsSource_StartTime2_Description="Fecha de inicio";

@XendraField(AD_Column_ID="StartTime",IsCentrallyMaintained=true,
AD_Tab_ID="8a4561d7-25be-5533-de4c-ab4735c335ee",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="db9e96b5-186b-334d-4cfd-a7b73ff02c5e")
public static final String FIELDNAME_RequestsSource_StartTime2="db9e96b5-186b-334d-4cfd-a7b73ff02c5e";

@XendraTrl(Identifier="4faef97d-ef2c-96a2-a174-34a12aff05bd")
public static String es_PE_COLUMN_StartTime_Name="Fecha de Inicio";

@XendraColumn(AD_Element_ID="f37ff718-a1d1-dbb8-f704-786bf1d21ddf",ColumnName="StartTime",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4faef97d-ef2c-96a2-a174-34a12aff05bd",
Synchronized="2019-08-30 22:23:48.0")
/** Column name StartTime */
public static final String COLUMNNAME_StartTime = "StartTime";
/** Set Summary.
@param Summary Textual summary of this request */
public void setSummary (String Summary)
{
if (Summary == null) throw new IllegalArgumentException ("Summary is mandatory.");
set_Value (COLUMNNAME_Summary, Summary);
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
@XendraTrl(Identifier="72c268ec-1dd6-6792-6d3e-b4913c2cc015")
public static String es_PE_FIELD_Request_Summary_Name="Resúmen";

@XendraTrl(Identifier="72c268ec-1dd6-6792-6d3e-b4913c2cc015")
public static String es_PE_FIELD_Request_Summary_Description="Resúmen textual de esta solicitud";

@XendraTrl(Identifier="72c268ec-1dd6-6792-6d3e-b4913c2cc015")
public static String es_PE_FIELD_Request_Summary_Help="El resúmen permite texto en formato libre sobre esta solicitud.";

@XendraField(AD_Column_ID="Summary",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="72c268ec-1dd6-6792-6d3e-b4913c2cc015")
public static final String FIELDNAME_Request_Summary="72c268ec-1dd6-6792-6d3e-b4913c2cc015";

@XendraTrl(Identifier="0f07629c-558f-9435-1979-59a14688332d")
public static String es_PE_FIELD_Request_Summary2_Name="Resúmen";

@XendraTrl(Identifier="0f07629c-558f-9435-1979-59a14688332d")
public static String es_PE_FIELD_Request_Summary2_Description="Resúmen textual de esta solicitud";

@XendraTrl(Identifier="0f07629c-558f-9435-1979-59a14688332d")
public static String es_PE_FIELD_Request_Summary2_Help="El resúmen permite texto en formato libre sobre esta solicitud.";

@XendraField(AD_Column_ID="Summary",IsCentrallyMaintained=true,
AD_Tab_ID="a6082d0b-507b-9bdf-147b-9db501402eae",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0f07629c-558f-9435-1979-59a14688332d")
public static final String FIELDNAME_Request_Summary2="0f07629c-558f-9435-1979-59a14688332d";

@XendraTrl(Identifier="8b42e505-9b07-54ae-2c90-ad729460192d")
public static String es_PE_FIELD_PartnerRequests_Summary_Name="Resúmen";

@XendraTrl(Identifier="8b42e505-9b07-54ae-2c90-ad729460192d")
public static String es_PE_FIELD_PartnerRequests_Summary_Description="Resúmen textual de esta solicitud";

@XendraTrl(Identifier="8b42e505-9b07-54ae-2c90-ad729460192d")
public static String es_PE_FIELD_PartnerRequests_Summary_Help="El resúmen permite texto en formato libre sobre esta solicitud.";

@XendraField(AD_Column_ID="Summary",IsCentrallyMaintained=true,
AD_Tab_ID="0a25fb60-7718-c6c9-b67f-7adeb07cfa19",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8b42e505-9b07-54ae-2c90-ad729460192d")
public static final String FIELDNAME_PartnerRequests_Summary="8b42e505-9b07-54ae-2c90-ad729460192d";

@XendraTrl(Identifier="044cfd12-2ddb-cf61-c7c1-9c455500b5b5")
public static String es_PE_FIELD_RequestsSource_Summary_Name="Resúmen";

@XendraTrl(Identifier="044cfd12-2ddb-cf61-c7c1-9c455500b5b5")
public static String es_PE_FIELD_RequestsSource_Summary_Description="Resúmen textual de esta solicitud";

@XendraTrl(Identifier="044cfd12-2ddb-cf61-c7c1-9c455500b5b5")
public static String es_PE_FIELD_RequestsSource_Summary_Help="El resúmen permite texto en formato libre sobre esta solicitud.";

@XendraField(AD_Column_ID="Summary",IsCentrallyMaintained=true,
AD_Tab_ID="c2cdcdde-0adb-ef52-0a9e-48cf3e306ac6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="044cfd12-2ddb-cf61-c7c1-9c455500b5b5")
public static final String FIELDNAME_RequestsSource_Summary="044cfd12-2ddb-cf61-c7c1-9c455500b5b5";

@XendraTrl(Identifier="a820faec-72a3-b787-032d-b3c1b3622d23")
public static String es_PE_FIELD_RequestsSource_Summary2_Name="Resúmen";

@XendraTrl(Identifier="a820faec-72a3-b787-032d-b3c1b3622d23")
public static String es_PE_FIELD_RequestsSource_Summary2_Description="Resúmen textual de esta solicitud";

@XendraTrl(Identifier="a820faec-72a3-b787-032d-b3c1b3622d23")
public static String es_PE_FIELD_RequestsSource_Summary2_Help="El resúmen permite texto en formato libre sobre esta solicitud.";

@XendraField(AD_Column_ID="Summary",IsCentrallyMaintained=true,
AD_Tab_ID="8a4561d7-25be-5533-de4c-ab4735c335ee",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a820faec-72a3-b787-032d-b3c1b3622d23")
public static final String FIELDNAME_RequestsSource_Summary2="a820faec-72a3-b787-032d-b3c1b3622d23";

@XendraTrl(Identifier="0cdf01ba-b188-6691-bb4b-5629b5e8ef35")
public static String es_PE_COLUMN_Summary_Name="Resúmen";

@XendraColumn(AD_Element_ID="94fe105c-8853-7c06-a32a-9ad75a452917",ColumnName="Summary",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0cdf01ba-b188-6691-bb4b-5629b5e8ef35",
Synchronized="2019-08-30 22:23:48.0")
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

@XendraTrl(Identifier="fb85aff8-8643-0ee5-037c-eeecb0c47c30")
public static String es_PE_FIELD_Request_TaskStatus_Name="Estado Taréa";

@XendraTrl(Identifier="fb85aff8-8643-0ee5-037c-eeecb0c47c30")
public static String es_PE_FIELD_Request_TaskStatus_Description="Estado de la Taréa";

@XendraTrl(Identifier="fb85aff8-8643-0ee5-037c-eeecb0c47c30")
public static String es_PE_FIELD_Request_TaskStatus_Help="Valoración de la culminación y estado de la taréa.";

@XendraField(AD_Column_ID="TaskStatus",IsCentrallyMaintained=true,
AD_Tab_ID="071c86e5-b06e-c77d-bb6e-c0afad7eed3e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=290,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fb85aff8-8643-0ee5-037c-eeecb0c47c30")
public static final String FIELDNAME_Request_TaskStatus="fb85aff8-8643-0ee5-037c-eeecb0c47c30";

@XendraTrl(Identifier="18ac6f18-98ae-ad6e-2adf-4275e6424c8a")
public static String es_PE_COLUMN_TaskStatus_Name="Estado Taréa";

@XendraColumn(AD_Element_ID="31ff6abd-ef62-f5f2-c9b8-903359a7f19d",ColumnName="TaskStatus",
AD_Reference_ID=17,AD_Reference_Value_ID="875ad37f-8aa2-3b76-2edb-0a9cd76b3ee7",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="18ac6f18-98ae-ad6e-2adf-4275e6424c8a",Synchronized="2019-08-30 22:23:48.0")
/** Column name TaskStatus */
public static final String COLUMNNAME_TaskStatus = "TaskStatus";
}
