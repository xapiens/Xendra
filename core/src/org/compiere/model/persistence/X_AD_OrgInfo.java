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
/** Generated Model for AD_OrgInfo
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_OrgInfo extends PO
{
/** Standard Constructor
@param ctx context
@param AD_OrgInfo_ID id
@param trxName transaction
*/
public X_AD_OrgInfo (Properties ctx, int AD_OrgInfo_ID, String trxName)
{
super (ctx, AD_OrgInfo_ID, trxName);
/** if (AD_OrgInfo_ID == 0)
{
setTaxID (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_OrgInfo (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=228 */
public static int Table_ID=MTable.getTable_ID("AD_OrgInfo");

@XendraTrl(Identifier="5876d66e-9c89-b1f0-77bb-469933baaa4f")
public static String es_PE_TAB_OrganizationInfo_Description="Información de detalle de la organización";

@XendraTrl(Identifier="5876d66e-9c89-b1f0-77bb-469933baaa4f")
public static String es_PE_TAB_OrganizationInfo_Name="Información de la Organización";

@XendraTrl(Identifier="5876d66e-9c89-b1f0-77bb-469933baaa4f")
public static String es_PE_TAB_OrganizationInfo_Help="La pestaña de información de la organización es usada para definir una dirección de la organización; el número DUNS y el número identificador de la compañía para efectos fiscales/gubernamentales.";

@XendraTab(Name="Organization Info",Description="Organization Detail Information",
Help="The Organization Info Tab is used to define an Organization's address, DUNS number and Tax Identification number",
AD_Window_ID="b18505b0-64f9-9322-2e8a-0daf80e326cb",SeqNo=20,TabLevel=1,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",
CommitWarning="You need re-login and restart your application server for most changes made here to be effective. ",
AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,
Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,
Parent_Column_ID="",Identifier="5876d66e-9c89-b1f0-77bb-469933baaa4f",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_OrganizationInfo="5876d66e-9c89-b1f0-77bb-469933baaa4f";

@XendraTrl(Identifier="1d06565b-0570-3122-86a3-b4cc970c990a")
public static String es_PE_TABLE_AD_OrgInfo_Name="AD_OrgInfo";

@XendraTable(Name="Organization Info",Description="",Help="",TableName="AD_OrgInfo",
AccessLevel="7",AD_Window_ID="b18505b0-64f9-9322-2e8a-0daf80e326cb",AD_Val_Rule_ID="",IsKey=0,
LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="1d06565b-0570-3122-86a3-b4cc970c990a",Synchronized="2017-08-16 11:40:32.0")
/** TableName=AD_OrgInfo */
public static final String Table_Name="AD_OrgInfo";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_OrgInfo");

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
    Table_ID = MTable.getTable_ID("AD_OrgInfo");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_OrgInfo[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Organization Type.
@param AD_OrgType_ID Organization Type allows you to categorize your organizations */
public void setAD_OrgType_ID (int AD_OrgType_ID)
{
if (AD_OrgType_ID <= 0) set_Value (COLUMNNAME_AD_OrgType_ID, null);
 else 
set_Value (COLUMNNAME_AD_OrgType_ID, Integer.valueOf(AD_OrgType_ID));
}
/** Get Organization Type.
@return Organization Type allows you to categorize your organizations */
public int getAD_OrgType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_OrgType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="dfc4e794-7ac2-9273-e904-164715742596")
public static String es_PE_FIELD_OrganizationInfo_OrganizationType_Description="El tipo de la organización permite que usted categorice sus organizaciones.";

@XendraTrl(Identifier="dfc4e794-7ac2-9273-e904-164715742596")
public static String es_PE_FIELD_OrganizationInfo_OrganizationType_Help="El tipo de la organización permite que usted categorice sus organizaciones para definir propósitos.";

@XendraTrl(Identifier="dfc4e794-7ac2-9273-e904-164715742596")
public static String es_PE_FIELD_OrganizationInfo_OrganizationType_Name="Tipo de Organización";

@XendraField(AD_Column_ID="AD_OrgType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5876d66e-9c89-b1f0-77bb-469933baaa4f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dfc4e794-7ac2-9273-e904-164715742596")
public static final String FIELDNAME_OrganizationInfo_OrganizationType="dfc4e794-7ac2-9273-e904-164715742596";

@XendraTrl(Identifier="420bf326-95a8-af58-ee69-44584ca8fb34")
public static String es_PE_COLUMN_AD_OrgType_ID_Name="Tipo de Organización";

@XendraColumn(AD_Element_ID="a216d98d-4f4d-fc98-ae1f-120cb243bb68",ColumnName="AD_OrgType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="420bf326-95a8-af58-ee69-44584ca8fb34",
Synchronized="2017-08-05 16:52:38.0")
/** Column name AD_OrgType_ID */
public static final String COLUMNNAME_AD_OrgType_ID = "AD_OrgType_ID";
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

@XendraTrl(Identifier="e6d34097-c0b5-4d36-af00-44b824822d3e")
public static String es_PE_FIELD_OrganizationInfo_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="e6d34097-c0b5-4d36-af00-44b824822d3e")
public static String es_PE_FIELD_OrganizationInfo_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraTrl(Identifier="e6d34097-c0b5-4d36-af00-44b824822d3e")
public static String es_PE_FIELD_OrganizationInfo_BusinessPartner_Name="Socio de Negocio";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5876d66e-9c89-b1f0-77bb-469933baaa4f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-13 11:49:15.0",
Identifier="e6d34097-c0b5-4d36-af00-44b824822d3e")
public static final String FIELDNAME_OrganizationInfo_BusinessPartner="e6d34097-c0b5-4d36-af00-44b824822d3e";

@XendraTrl(Identifier="55f39df0-9e63-4cd6-b9b7-751c18d4c356")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Business Partner ";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="55f39df0-9e63-4cd6-b9b7-751c18d4c356",
Synchronized="2017-08-05 16:52:38.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set Calendar.
@param C_Calendar_ID Accounting Calendar Name */
public void setC_Calendar_ID (int C_Calendar_ID)
{
if (C_Calendar_ID <= 0) set_Value (COLUMNNAME_C_Calendar_ID, null);
 else 
set_Value (COLUMNNAME_C_Calendar_ID, Integer.valueOf(C_Calendar_ID));
}
/** Get Calendar.
@return Accounting Calendar Name */
public int getC_Calendar_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Calendar_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1f58867d-b3b5-7c89-6095-c35d06144e83")
public static String es_PE_FIELD_OrganizationInfo_Calendar_Description="Nombre del Calendario Contable";

@XendraTrl(Identifier="1f58867d-b3b5-7c89-6095-c35d06144e83")
public static String es_PE_FIELD_OrganizationInfo_Calendar_Help="El calendario únicamente identifica un calendario contable. Múltiples calendarios pueden ser usados. Ej. Ud. puede necesitar un calendario estándar que corre del 1 de enero al 31 de diciembre y un calendario fiscal que corre del 1 de julio al 30 de junio.";

@XendraTrl(Identifier="1f58867d-b3b5-7c89-6095-c35d06144e83")
public static String es_PE_FIELD_OrganizationInfo_Calendar_Name="Calendario";

@XendraField(AD_Column_ID="C_Calendar_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5876d66e-9c89-b1f0-77bb-469933baaa4f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1f58867d-b3b5-7c89-6095-c35d06144e83")
public static final String FIELDNAME_OrganizationInfo_Calendar="1f58867d-b3b5-7c89-6095-c35d06144e83";

@XendraTrl(Identifier="c3514d4c-a4c7-ae55-5803-09eac42c21c3")
public static String es_PE_COLUMN_C_Calendar_ID_Name="Calendario";

@XendraColumn(AD_Element_ID="f78f20f5-74d2-53fd-4e80-4df19abaa806",ColumnName="C_Calendar_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c3514d4c-a4c7-ae55-5803-09eac42c21c3",
Synchronized="2017-08-05 16:52:38.0")
/** Column name C_Calendar_ID */
public static final String COLUMNNAME_C_Calendar_ID = "C_Calendar_ID";
/** Set Address.
@param C_Location_ID Location or Address */
public void setC_Location_ID (int C_Location_ID)
{
if (C_Location_ID <= 0) set_Value (COLUMNNAME_C_Location_ID, null);
 else 
set_Value (COLUMNNAME_C_Location_ID, Integer.valueOf(C_Location_ID));
}
/** Get Address.
@return Location or Address */
public int getC_Location_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Location_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="60974c0a-e0ea-17d5-bd22-f1a160328044")
public static String es_PE_FIELD_OrganizationInfo_Address_Description="Ubicación ó dirección";

@XendraTrl(Identifier="60974c0a-e0ea-17d5-bd22-f1a160328044")
public static String es_PE_FIELD_OrganizationInfo_Address_Help="El campo Ubicación / Dirección define la ubicación de una entidad.";

@XendraTrl(Identifier="60974c0a-e0ea-17d5-bd22-f1a160328044")
public static String es_PE_FIELD_OrganizationInfo_Address_Name="Localización / Dirección";

@XendraField(AD_Column_ID="C_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5876d66e-9c89-b1f0-77bb-469933baaa4f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="60974c0a-e0ea-17d5-bd22-f1a160328044")
public static final String FIELDNAME_OrganizationInfo_Address="60974c0a-e0ea-17d5-bd22-f1a160328044";

@XendraTrl(Identifier="21dc1509-54cd-de81-f589-078c87471e9e")
public static String es_PE_COLUMN_C_Location_ID_Name="Localización / Dirección";

@XendraColumn(AD_Element_ID="e66e22a8-535b-2af2-6efb-aa600959a885",ColumnName="C_Location_ID",
AD_Reference_ID=21,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="21dc1509-54cd-de81-f589-078c87471e9e",
Synchronized="2017-08-05 16:52:38.0")
/** Column name C_Location_ID */
public static final String COLUMNNAME_C_Location_ID = "C_Location_ID";
/** Set D-U-N-S.
@param DUNS Dun & Bradstreet Number */
public void setDUNS (String DUNS)
{
if (DUNS != null && DUNS.length() > 11)
{
log.warning("Length > 11 - truncated");
DUNS = DUNS.substring(0,10);
}
set_Value (COLUMNNAME_DUNS, DUNS);
}
/** Get D-U-N-S.
@return Dun & Bradstreet Number */
public String getDUNS() 
{
String value = (String)get_Value(COLUMNNAME_DUNS);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="149fbde5-1e70-b8a6-c399-49b48f7d2b8b")
public static String es_PE_FIELD_OrganizationInfo_D_U_N_S_Description="DUNS";

@XendraTrl(Identifier="149fbde5-1e70-b8a6-c399-49b48f7d2b8b")
public static String es_PE_FIELD_OrganizationInfo_D_U_N_S_Help="Usado por EDI - para detalles ver www.dnb.com/dunsno/list.htm";

@XendraTrl(Identifier="149fbde5-1e70-b8a6-c399-49b48f7d2b8b")
public static String es_PE_FIELD_OrganizationInfo_D_U_N_S_Name="DUNS";

@XendraField(AD_Column_ID="DUNS",IsCentrallyMaintained=true,
AD_Tab_ID="5876d66e-9c89-b1f0-77bb-469933baaa4f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="149fbde5-1e70-b8a6-c399-49b48f7d2b8b")
public static final String FIELDNAME_OrganizationInfo_D_U_N_S="149fbde5-1e70-b8a6-c399-49b48f7d2b8b";

@XendraTrl(Identifier="179e5055-8ef9-943f-9671-1208c6744ff9")
public static String es_PE_COLUMN_DUNS_Name="DUNS";

@XendraColumn(AD_Element_ID="c0901ff5-fdb0-6e42-8eb2-bcb69b132f2b",ColumnName="DUNS",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=11,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="179e5055-8ef9-943f-9671-1208c6744ff9",
Synchronized="2017-08-05 16:52:38.0")
/** Column name DUNS */
public static final String COLUMNNAME_DUNS = "DUNS";
/** Set Host Address.
@param HostAddress Host Address URL or DNS */
public void setHostAddress (String HostAddress)
{
if (HostAddress != null && HostAddress.length() > 60)
{
log.warning("Length > 60 - truncated");
HostAddress = HostAddress.substring(0,59);
}
set_Value (COLUMNNAME_HostAddress, HostAddress);
}
/** Get Host Address.
@return Host Address URL or DNS */
public String getHostAddress() 
{
String value = (String)get_Value(COLUMNNAME_HostAddress);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="f74ad5a8-694b-416d-ae8f-dc311cc0ec5c")
public static String es_PE_COLUMN_HostAddress_Name="Host Address";

@XendraColumn(AD_Element_ID="360f9086-02d8-c014-bb85-dbcfac9c3e1d",ColumnName="HostAddress",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f74ad5a8-694b-416d-ae8f-dc311cc0ec5c",
Synchronized="2017-08-05 16:52:38.0")
/** Column name HostAddress */
public static final String COLUMNNAME_HostAddress = "HostAddress";
/** Set Host port.
@param HostPort Host Communication Port */
public void setHostPort (int HostPort)
{
set_Value (COLUMNNAME_HostPort, Integer.valueOf(HostPort));
}
/** Get Host port.
@return Host Communication Port */
public int getHostPort() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HostPort);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="efe4f0d5-25a1-46d8-aeff-2e8496dccf72")
public static String es_PE_COLUMN_HostPort_Name="Host port";

@XendraColumn(AD_Element_ID="6082bb2b-fdc8-34b4-ba72-e7b1c6b69316",ColumnName="HostPort",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="efe4f0d5-25a1-46d8-aeff-2e8496dccf72",
Synchronized="2017-08-05 16:52:38.0")
/** Column name HostPort */
public static final String COLUMNNAME_HostPort = "HostPort";
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
@XendraTrl(Identifier="5c86c8c0-5e14-48d8-ad38-f38ce917275e")
public static String es_PE_FIELD_OrganizationInfo_Identifier_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="5876d66e-9c89-b1f0-77bb-469933baaa4f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=36,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-13 11:49:15.0",
Identifier="5c86c8c0-5e14-48d8-ad38-f38ce917275e")
public static final String FIELDNAME_OrganizationInfo_Identifier="5c86c8c0-5e14-48d8-ad38-f38ce917275e";

@XendraTrl(Identifier="ba9e864e-9cf1-4d5b-8a62-e67897da9656")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ba9e864e-9cf1-4d5b-8a62-e67897da9656",
Synchronized="2017-08-05 16:52:38.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Warehouse.
@param M_Warehouse_ID Storage Warehouse and Service Point */
public void setM_Warehouse_ID (int M_Warehouse_ID)
{
if (M_Warehouse_ID <= 0) set_Value (COLUMNNAME_M_Warehouse_ID, null);
 else 
set_Value (COLUMNNAME_M_Warehouse_ID, Integer.valueOf(M_Warehouse_ID));
}
/** Get Warehouse.
@return Storage Warehouse and Service Point */
public int getM_Warehouse_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Warehouse_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="fbd754fe-2e10-eac7-84a2-1d0a2f41b688")
public static String es_PE_FIELD_OrganizationInfo_Warehouse_Description="Almacén";

@XendraTrl(Identifier="fbd754fe-2e10-eac7-84a2-1d0a2f41b688")
public static String es_PE_FIELD_OrganizationInfo_Warehouse_Help="El Almacén indica un Almacén único donde los productos son almacenados";

@XendraTrl(Identifier="fbd754fe-2e10-eac7-84a2-1d0a2f41b688")
public static String es_PE_FIELD_OrganizationInfo_Warehouse_Name="Almacén";

@XendraField(AD_Column_ID="M_Warehouse_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5876d66e-9c89-b1f0-77bb-469933baaa4f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fbd754fe-2e10-eac7-84a2-1d0a2f41b688")
public static final String FIELDNAME_OrganizationInfo_Warehouse="fbd754fe-2e10-eac7-84a2-1d0a2f41b688";

@XendraTrl(Identifier="4e755fc2-d772-eab4-4e11-e8193e531392")
public static String es_PE_COLUMN_M_Warehouse_ID_Name="Almacén";

@XendraColumn(AD_Element_ID="402045cd-baa5-aeaf-b148-a921dffb7821",ColumnName="M_Warehouse_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="04acc0b0-f57d-0e15-af5b-80249f6e7906",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="4e755fc2-d772-eab4-4e11-e8193e531392",Synchronized="2017-08-05 16:52:38.0")
/** Column name M_Warehouse_ID */
public static final String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
/** Set Goal.
@param PA_Goal_ID Performance Goal */
public void setPA_Goal_ID (int PA_Goal_ID)
{
if (PA_Goal_ID <= 0) set_Value (COLUMNNAME_PA_Goal_ID, null);
 else 
set_Value (COLUMNNAME_PA_Goal_ID, Integer.valueOf(PA_Goal_ID));
}
/** Get Goal.
@return Performance Goal */
public int getPA_Goal_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PA_Goal_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="617ea3a4-6f96-17b6-f274-635a41d572ca")
public static String es_PE_FIELD_OrganizationInfo_Goal_Description="Objetivo de desempeño";

@XendraTrl(Identifier="617ea3a4-6f96-17b6-f274-635a41d572ca")
public static String es_PE_FIELD_OrganizationInfo_Goal_Help="La meta de desempeño indica contra que será medido este desempeño de usuarios.";

@XendraTrl(Identifier="617ea3a4-6f96-17b6-f274-635a41d572ca")
public static String es_PE_FIELD_OrganizationInfo_Goal_Name="Objetivo";

@XendraField(AD_Column_ID="PA_Goal_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5876d66e-9c89-b1f0-77bb-469933baaa4f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="617ea3a4-6f96-17b6-f274-635a41d572ca")
public static final String FIELDNAME_OrganizationInfo_Goal="617ea3a4-6f96-17b6-f274-635a41d572ca";

@XendraTrl(Identifier="5ba4f4ba-21b1-b00f-75e7-83ecd18e0d76")
public static String es_PE_COLUMN_PA_Goal_ID_Name="Objetivo";

@XendraColumn(AD_Element_ID="b420dc38-c0bb-b595-f769-833f2dd4282f",ColumnName="PA_Goal_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5ba4f4ba-21b1-b00f-75e7-83ecd18e0d76",
Synchronized="2017-08-05 16:52:38.0")
/** Column name PA_Goal_ID */
public static final String COLUMNNAME_PA_Goal_ID = "PA_Goal_ID";

/** Parent_Org_ID AD_Reference=54e78591-f7f4-c613-ea27-e64b3dac5198 */
public static final int PARENT_ORG_ID_AD_Reference_ID=130;
/** Set Parent Organization.
@param Parent_Org_ID Parent (superior) Organization  */
public void setParent_Org_ID (int Parent_Org_ID)
{
if (Parent_Org_ID <= 0) set_Value (COLUMNNAME_Parent_Org_ID, null);
 else 
set_Value (COLUMNNAME_Parent_Org_ID, Integer.valueOf(Parent_Org_ID));
}
/** Get Parent Organization.
@return Parent (superior) Organization  */
public int getParent_Org_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Parent_Org_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d054baa4-a236-3d72-e3ef-3f4b9fdb37b1")
public static String es_PE_FIELD_OrganizationInfo_ParentOrganization_Description="Organización (superior) padre.";

@XendraTrl(Identifier="d054baa4-a236-3d72-e3ef-3f4b9fdb37b1")
public static String es_PE_FIELD_OrganizationInfo_ParentOrganization_Help="Organización padre - el siguiente nivel en la jerarquia organizacional.";

@XendraTrl(Identifier="d054baa4-a236-3d72-e3ef-3f4b9fdb37b1")
public static String es_PE_FIELD_OrganizationInfo_ParentOrganization_Name="Organización Padre";

@XendraField(AD_Column_ID="Parent_Org_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5876d66e-9c89-b1f0-77bb-469933baaa4f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d054baa4-a236-3d72-e3ef-3f4b9fdb37b1")
public static final String FIELDNAME_OrganizationInfo_ParentOrganization="d054baa4-a236-3d72-e3ef-3f4b9fdb37b1";

@XendraTrl(Identifier="ba3b4c10-b46e-eb3f-ea04-4f8b2a4d9445")
public static String es_PE_COLUMN_Parent_Org_ID_Name="Organización Padre";

@XendraColumn(AD_Element_ID="cf2d7151-28da-1206-979b-22dfbd1783d1",ColumnName="Parent_Org_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="54e78591-f7f4-c613-ea27-e64b3dac5198",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="ba3b4c10-b46e-eb3f-ea04-4f8b2a4d9445",Synchronized="2017-08-05 16:52:38.0")
/** Column name Parent_Org_ID */
public static final String COLUMNNAME_Parent_Org_ID = "Parent_Org_ID";

/** Supervisor_ID AD_Reference=91f52193-02ab-6545-99f8-d6d30b9d03a1 */
public static final int SUPERVISOR_ID_AD_Reference_ID=286;
/** Set Supervisor.
@param Supervisor_ID Supervisor for this user/organization - used for escalation and approval */
public void setSupervisor_ID (int Supervisor_ID)
{
if (Supervisor_ID <= 0) set_Value (COLUMNNAME_Supervisor_ID, null);
 else 
set_Value (COLUMNNAME_Supervisor_ID, Integer.valueOf(Supervisor_ID));
}
/** Get Supervisor.
@return Supervisor for this user/organization - used for escalation and approval */
public int getSupervisor_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Supervisor_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="635a5e5d-5e22-45f0-1668-6c6baf3f07a1")
public static String es_PE_FIELD_OrganizationInfo_Supervisor_Description="Supervisor para este usuario - usado para escalación";

@XendraTrl(Identifier="635a5e5d-5e22-45f0-1668-6c6baf3f07a1")
public static String es_PE_FIELD_OrganizationInfo_Supervisor_Help="El supervisor indica quien será usado para reenviar y escalar emisiones este usuario.";

@XendraTrl(Identifier="635a5e5d-5e22-45f0-1668-6c6baf3f07a1")
public static String es_PE_FIELD_OrganizationInfo_Supervisor_Name="Supervisor";

@XendraField(AD_Column_ID="Supervisor_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5876d66e-9c89-b1f0-77bb-469933baaa4f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="635a5e5d-5e22-45f0-1668-6c6baf3f07a1")
public static final String FIELDNAME_OrganizationInfo_Supervisor="635a5e5d-5e22-45f0-1668-6c6baf3f07a1";

@XendraTrl(Identifier="3fd10cc1-b936-3626-d258-2e66ae927c36")
public static String es_PE_COLUMN_Supervisor_ID_Name="Supervisor";

@XendraColumn(AD_Element_ID="cb6ad258-6bb2-80b2-a90f-63c4d947479b",ColumnName="Supervisor_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="91f52193-02ab-6545-99f8-d6d30b9d03a1",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3fd10cc1-b936-3626-d258-2e66ae927c36",Synchronized="2017-08-05 16:52:38.0")
/** Column name Supervisor_ID */
public static final String COLUMNNAME_Supervisor_ID = "Supervisor_ID";
/** Set Tax ID.
@param TaxID Tax Identification */
public void setTaxID (String TaxID)
{
if (TaxID == null) throw new IllegalArgumentException ("TaxID is mandatory.");
if (TaxID.length() > 20)
{
log.warning("Length > 20 - truncated");
TaxID = TaxID.substring(0,19);
}
set_Value (COLUMNNAME_TaxID, TaxID);
}
/** Get Tax ID.
@return Tax Identification */
public String getTaxID() 
{
String value = (String)get_Value(COLUMNNAME_TaxID);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="ac50a902-7fed-6a94-884f-5e0a2602d321")
public static String es_PE_FIELD_OrganizationInfo_TaxID_Description="Código de Identificación";

@XendraTrl(Identifier="ac50a902-7fed-6a94-884f-5e0a2602d321")
public static String es_PE_FIELD_OrganizationInfo_TaxID_Help="El código de Identificación es el número de identificación gubernamental de esta entidad";

@XendraTrl(Identifier="ac50a902-7fed-6a94-884f-5e0a2602d321")
public static String es_PE_FIELD_OrganizationInfo_TaxID_Name="RUC";

@XendraField(AD_Column_ID="TaxID",IsCentrallyMaintained=true,
AD_Tab_ID="5876d66e-9c89-b1f0-77bb-469933baaa4f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ac50a902-7fed-6a94-884f-5e0a2602d321")
public static final String FIELDNAME_OrganizationInfo_TaxID="ac50a902-7fed-6a94-884f-5e0a2602d321";

@XendraTrl(Identifier="41d73628-1eec-3b47-bce6-201d3a5f7252")
public static String es_PE_COLUMN_TaxID_Name="RFC";

@XendraColumn(AD_Element_ID="e0a9d0f7-835b-4f80-4c13-bff62213e232",ColumnName="TaxID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="41d73628-1eec-3b47-bce6-201d3a5f7252",
Synchronized="2017-08-05 16:52:38.0")
/** Column name TaxID */
public static final String COLUMNNAME_TaxID = "TaxID";
}
