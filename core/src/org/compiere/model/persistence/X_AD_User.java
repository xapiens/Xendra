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
/** Generated Model for AD_User
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_User extends PO
{
/** Standard Constructor
@param ctx context
@param AD_User_ID id
@param trxName transaction
*/
public X_AD_User (Properties ctx, int AD_User_ID, String trxName)
{
super (ctx, AD_User_ID, trxName);
/** if (AD_User_ID == 0)
{
setAD_User_ID (0);
setIsChangePassword (false);	
// N
setIsFullBPAccess (true);	
// Y
setIsFullPriceListAccess (false);	
// N
setName (null);
setNotificationType (null);	
// E
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_User (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=114 */
public static int Table_ID=MTable.getTable_ID("AD_User");

@XendraTrl(Identifier="ecdc18c1-5823-d6b1-de56-01074475b931")
public static String es_PE_TAB_UserContact_Description="Usuario";

@XendraTrl(Identifier="ecdc18c1-5823-d6b1-de56-01074475b931")
public static String es_PE_TAB_UserContact_Help="La pestaña de usuario define la bitácora de usuarios que han tenido acceso al sistema.";

@XendraTrl(Identifier="ecdc18c1-5823-d6b1-de56-01074475b931")
public static String es_PE_TAB_UserContact_Name="Usuario";
@XendraTab(Name="User Contact",
Description="Maintain User or Business Partner Contact",
Help="The User Tab defines the log in for Users who have access to the system.  For application access, users need to have a role assigned.",
AD_Window_ID="9f3c1c3a-ab4f-0018-8a1e-b6cfbdbe8e7b",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="ecdc18c1-5823-d6b1-de56-01074475b931",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_UserContact="ecdc18c1-5823-d6b1-de56-01074475b931";

@XendraTrl(Identifier="508b449f-672d-0e92-5d32-f9e3419fd6c6")
public static String es_PE_TAB_CompanyAgent_Description="Selección de Representante de Ventas";

@XendraTrl(Identifier="508b449f-672d-0e92-5d32-f9e3419fd6c6")
public static String es_PE_TAB_CompanyAgent_Name="Agente de la Compañia";

@XendraTab(Name="Company Agent",Description="Sales Representative Selection",Help="",
AD_Window_ID="a9894ddd-fe3c-1c33-44c9-6f79a11cde9e",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,AD_Column_ID="",HasTree=false,
WhereClause="EXISTS (SELECT * FROM C_BPartner bp WHERE bp.IsSalesRep='Y' AND AD_User.C_BPartner_ID=bp.C_BPartner_ID)",
OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=false,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="508b449f-672d-0e92-5d32-f9e3419fd6c6",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_CompanyAgent="508b449f-672d-0e92-5d32-f9e3419fd6c6";

@XendraTrl(Identifier="cca304e4-17f2-1849-76c1-8fa0813b5951")
public static String es_PE_TAB_User_Description="Mantenga a usuario dentro del sistema - interno ó del contacto del socio de negocio";

@XendraTrl(Identifier="cca304e4-17f2-1849-76c1-8fa0813b5951")
public static String es_PE_TAB_User_Help="El usuario identifica a un usuario único en el sistema. Esto podía ser un usuario interno ó un contacto del socio de negocio";

@XendraTrl(Identifier="cca304e4-17f2-1849-76c1-8fa0813b5951")
public static String es_PE_TAB_User_Name="Usuario";
@XendraTab(Name="User",
Description="Maintain User within the system - Internal or Business Partner Contact",
Help="The User identifies a unique user in the system. This could be an internal user or a business partner contact",
AD_Window_ID="273719a2-ec2e-9b44-d30b-014c7ec70d0e",SeqNo=100,TabLevel=1,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="e06a18dd-dca4-587b-d270-cee8f4afb317",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="cca304e4-17f2-1849-76c1-8fa0813b5951",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_User="cca304e4-17f2-1849-76c1-8fa0813b5951";

@XendraTrl(Identifier="acb1d5a9-2af9-ac81-e873-f228168505a3")
public static String es_PE_TABLE_AD_User_Name="Usuario";

@XendraTable(Name="User/Contact",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",
Description="User within the system - Internal or Business Partner Contact",Help="",
TableName="AD_User",AccessLevel="7",AD_Window_ID="9f3c1c3a-ab4f-0018-8a1e-b6cfbdbe8e7b",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=80,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="acb1d5a9-2af9-ac81-e873-f228168505a3",Synchronized="2020-03-03 21:36:04.0")
/** TableName=AD_User */
public static final String Table_Name="AD_User";


@XendraIndex(Name="ad_user_email",Identifier="0cbf6b2a-6b6f-7865-b79e-a25cb8a88328",
Column_Names="email",IsUnique="false",TableIdentifier="0cbf6b2a-6b6f-7865-b79e-a25cb8a88328",
Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_ad_user_email = "0cbf6b2a-6b6f-7865-b79e-a25cb8a88328";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_User");

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
    Table_ID = MTable.getTable_ID("AD_User");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_User[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Trx Organization.
@param AD_OrgTrx_ID Performing or initiating organization */
public void setAD_OrgTrx_ID (int AD_OrgTrx_ID)
{
if (AD_OrgTrx_ID <= 0) set_Value (COLUMNNAME_AD_OrgTrx_ID, null);
 else 
set_Value (COLUMNNAME_AD_OrgTrx_ID, Integer.valueOf(AD_OrgTrx_ID));
}
/** Get Trx Organization.
@return Performing or initiating organization */
public int getAD_OrgTrx_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_OrgTrx_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="371302c8-9240-dea6-48b1-af83ec003b14")
public static String es_PE_FIELD_UserContact_TrxOrganization_Name="Organización de la Trans.";

@XendraTrl(Identifier="371302c8-9240-dea6-48b1-af83ec003b14")
public static String es_PE_FIELD_UserContact_TrxOrganization_Description="Organización que inicia ó ejecuta la transacción";

@XendraTrl(Identifier="371302c8-9240-dea6-48b1-af83ec003b14")
public static String es_PE_FIELD_UserContact_TrxOrganization_Help="La organización que inicia ó ejecuta la transacción (para otra organización). La organización poseedora puede no ser la organización de la transacción en un ambiente de buró de servicio; con servicios centralizados y transacciones inter- organización.";

@XendraField(AD_Column_ID="AD_OrgTrx_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ecdc18c1-5823-d6b1-de56-01074475b931",AD_FieldGroup_ID="Internal",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="371302c8-9240-dea6-48b1-af83ec003b14")
public static final String FIELDNAME_UserContact_TrxOrganization="371302c8-9240-dea6-48b1-af83ec003b14";

@XendraTrl(Identifier="60b976fe-5b8b-c634-66aa-c512786766cd")
public static String es_PE_FIELD_User_TrxOrganization_Name="Organización de la Trans.";

@XendraTrl(Identifier="60b976fe-5b8b-c634-66aa-c512786766cd")
public static String es_PE_FIELD_User_TrxOrganization_Description="Organización que inicia ó ejecuta la transacción";

@XendraTrl(Identifier="60b976fe-5b8b-c634-66aa-c512786766cd")
public static String es_PE_FIELD_User_TrxOrganization_Help="La organización que inicia ó ejecuta la transacción (para otra organización). La organización poseedora puede no ser la organización de la transacción en un ambiente de buró de servicio; con servicios centralizados y transacciones inter- organización.";

@XendraField(AD_Column_ID="AD_OrgTrx_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cca304e4-17f2-1849-76c1-8fa0813b5951",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="60b976fe-5b8b-c634-66aa-c512786766cd")
public static final String FIELDNAME_User_TrxOrganization="60b976fe-5b8b-c634-66aa-c512786766cd";

@XendraTrl(Identifier="bf391323-aadb-9e85-a144-9e48991ec00c")
public static String es_PE_FIELD_CompanyAgent_TrxOrganization_Name="Organización de la Trans.";

@XendraTrl(Identifier="bf391323-aadb-9e85-a144-9e48991ec00c")
public static String es_PE_FIELD_CompanyAgent_TrxOrganization_Description="Organización que inicia ó ejecuta la transacción";

@XendraTrl(Identifier="bf391323-aadb-9e85-a144-9e48991ec00c")
public static String es_PE_FIELD_CompanyAgent_TrxOrganization_Help="La organización que inicia ó ejecuta la transacción (para otra organización). La organización poseedora puede no ser la organización de la transacción en un ambiente de buró de servicio; con servicios centralizados y transacciones inter- organización.";

@XendraField(AD_Column_ID="AD_OrgTrx_ID",IsCentrallyMaintained=true,
AD_Tab_ID="508b449f-672d-0e92-5d32-f9e3419fd6c6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bf391323-aadb-9e85-a144-9e48991ec00c")
public static final String FIELDNAME_CompanyAgent_TrxOrganization="bf391323-aadb-9e85-a144-9e48991ec00c";

@XendraTrl(Identifier="354816a9-5070-4afb-467e-fd0e046dce12")
public static String es_PE_COLUMN_AD_OrgTrx_ID_Name="Organización de la Trans.";

@XendraColumn(AD_Element_ID="b4180358-67aa-fe55-0409-6367a60e0a2e",ColumnName="AD_OrgTrx_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="54e78591-f7f4-c613-ea27-e64b3dac5198",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="354816a9-5070-4afb-467e-fd0e046dce12",Synchronized="2019-08-30 22:20:46.0")
/** Column name AD_OrgTrx_ID */
public static final String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
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

@XendraTrl(Identifier="1e10c952-6dd6-23fc-027b-72b6981f79c8")
public static String es_PE_FIELD_UserContact_UserContact_Name="Usuario";

@XendraTrl(Identifier="1e10c952-6dd6-23fc-027b-72b6981f79c8")
public static String es_PE_FIELD_UserContact_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="1e10c952-6dd6-23fc-027b-72b6981f79c8")
public static String es_PE_FIELD_UserContact_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ecdc18c1-5823-d6b1-de56-01074475b931",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1e10c952-6dd6-23fc-027b-72b6981f79c8")
public static final String FIELDNAME_UserContact_UserContact="1e10c952-6dd6-23fc-027b-72b6981f79c8";

@XendraTrl(Identifier="b52d6fec-4b24-8e99-eb2e-cdbcc2711ac7")
public static String es_PE_FIELD_User_UserContact_Name="Usuario";

@XendraTrl(Identifier="b52d6fec-4b24-8e99-eb2e-cdbcc2711ac7")
public static String es_PE_FIELD_User_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="b52d6fec-4b24-8e99-eb2e-cdbcc2711ac7")
public static String es_PE_FIELD_User_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cca304e4-17f2-1849-76c1-8fa0813b5951",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b52d6fec-4b24-8e99-eb2e-cdbcc2711ac7")
public static final String FIELDNAME_User_UserContact="b52d6fec-4b24-8e99-eb2e-cdbcc2711ac7";

@XendraTrl(Identifier="36ed8f06-297c-5038-5df8-a61c2924a562")
public static String es_PE_FIELD_CompanyAgent_UserContact_Name="Usuario";

@XendraTrl(Identifier="36ed8f06-297c-5038-5df8-a61c2924a562")
public static String es_PE_FIELD_CompanyAgent_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="36ed8f06-297c-5038-5df8-a61c2924a562")
public static String es_PE_FIELD_CompanyAgent_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="508b449f-672d-0e92-5d32-f9e3419fd6c6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="36ed8f06-297c-5038-5df8-a61c2924a562")
public static final String FIELDNAME_CompanyAgent_UserContact="36ed8f06-297c-5038-5df8-a61c2924a562";
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
/** Set Birthday.
@param Birthday Birthday or Anniversary day */
public void setBirthday (Timestamp Birthday)
{
set_Value (COLUMNNAME_Birthday, Birthday);
}
/** Get Birthday.
@return Birthday or Anniversary day */
public Timestamp getBirthday() 
{
return (Timestamp)get_Value(COLUMNNAME_Birthday);
}

@XendraTrl(Identifier="5c5e5f53-2b0e-ff15-f980-fecdfddb32ef")
public static String es_PE_FIELD_UserContact_Birthday_Name="Cumpleaños";

@XendraTrl(Identifier="5c5e5f53-2b0e-ff15-f980-fecdfddb32ef")
public static String es_PE_FIELD_UserContact_Birthday_Description="Cumpleaños ó día de aniversario";

@XendraTrl(Identifier="5c5e5f53-2b0e-ff15-f980-fecdfddb32ef")
public static String es_PE_FIELD_UserContact_Birthday_Help="Cumpleaños ó día de aniversario";

@XendraField(AD_Column_ID="Birthday",IsCentrallyMaintained=true,
AD_Tab_ID="ecdc18c1-5823-d6b1-de56-01074475b931",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5c5e5f53-2b0e-ff15-f980-fecdfddb32ef")
public static final String FIELDNAME_UserContact_Birthday="5c5e5f53-2b0e-ff15-f980-fecdfddb32ef";

@XendraTrl(Identifier="830922e8-1d27-c401-7dce-1bc566732c24")
public static String es_PE_FIELD_User_Birthday_Name="Cumpleaños";

@XendraTrl(Identifier="830922e8-1d27-c401-7dce-1bc566732c24")
public static String es_PE_FIELD_User_Birthday_Description="Cumpleaños ó día de aniversario";

@XendraTrl(Identifier="830922e8-1d27-c401-7dce-1bc566732c24")
public static String es_PE_FIELD_User_Birthday_Help="Cumpleaños ó día de aniversario";

@XendraField(AD_Column_ID="Birthday",IsCentrallyMaintained=true,
AD_Tab_ID="cca304e4-17f2-1849-76c1-8fa0813b5951",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="830922e8-1d27-c401-7dce-1bc566732c24")
public static final String FIELDNAME_User_Birthday="830922e8-1d27-c401-7dce-1bc566732c24";

@XendraTrl(Identifier="3e87eb59-3c55-434b-3ad5-0c457f99bdf6")
public static String es_PE_FIELD_CompanyAgent_Birthday_Name="Cumpleaños";

@XendraTrl(Identifier="3e87eb59-3c55-434b-3ad5-0c457f99bdf6")
public static String es_PE_FIELD_CompanyAgent_Birthday_Description="Cumpleaños ó día de aniversario";

@XendraTrl(Identifier="3e87eb59-3c55-434b-3ad5-0c457f99bdf6")
public static String es_PE_FIELD_CompanyAgent_Birthday_Help="Cumpleaños ó día de aniversario";

@XendraField(AD_Column_ID="Birthday",IsCentrallyMaintained=true,
AD_Tab_ID="508b449f-672d-0e92-5d32-f9e3419fd6c6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3e87eb59-3c55-434b-3ad5-0c457f99bdf6")
public static final String FIELDNAME_CompanyAgent_Birthday="3e87eb59-3c55-434b-3ad5-0c457f99bdf6";

@XendraTrl(Identifier="a5b969b4-f121-dd7c-829e-864c262bbf15")
public static String es_PE_COLUMN_Birthday_Name="Cumpleaños";

@XendraColumn(AD_Element_ID="5767cb2c-56e6-05de-20a9-958edf7be231",ColumnName="Birthday",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a5b969b4-f121-dd7c-829e-864c262bbf15",
Synchronized="2019-08-30 22:20:46.0")
/** Column name Birthday */
public static final String COLUMNNAME_Birthday = "Birthday";
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

@XendraTrl(Identifier="23c3c730-d708-5614-7d79-6410ec34de7a")
public static String es_PE_FIELD_UserContact_BusinessPartner_Name="Socio de Negocio";

@XendraTrl(Identifier="23c3c730-d708-5614-7d79-6410ec34de7a")
public static String es_PE_FIELD_UserContact_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="23c3c730-d708-5614-7d79-6410ec34de7a")
public static String es_PE_FIELD_UserContact_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ecdc18c1-5823-d6b1-de56-01074475b931",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="23c3c730-d708-5614-7d79-6410ec34de7a")
public static final String FIELDNAME_UserContact_BusinessPartner="23c3c730-d708-5614-7d79-6410ec34de7a";

@XendraTrl(Identifier="f05b6a7e-c911-8fcf-2b9b-86bd30a82f8a")
public static String es_PE_FIELD_User_BusinessPartner_Name="Socio de Negocio";

@XendraTrl(Identifier="f05b6a7e-c911-8fcf-2b9b-86bd30a82f8a")
public static String es_PE_FIELD_User_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="f05b6a7e-c911-8fcf-2b9b-86bd30a82f8a")
public static String es_PE_FIELD_User_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cca304e4-17f2-1849-76c1-8fa0813b5951",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f05b6a7e-c911-8fcf-2b9b-86bd30a82f8a")
public static final String FIELDNAME_User_BusinessPartner="f05b6a7e-c911-8fcf-2b9b-86bd30a82f8a";

@XendraTrl(Identifier="7df6c964-755a-df07-a128-77fbc1329a39")
public static String es_PE_FIELD_CompanyAgent_BusinessPartner_Name="Socio de Negocio";

@XendraTrl(Identifier="7df6c964-755a-df07-a128-77fbc1329a39")
public static String es_PE_FIELD_CompanyAgent_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="7df6c964-755a-df07-a128-77fbc1329a39")
public static String es_PE_FIELD_CompanyAgent_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="508b449f-672d-0e92-5d32-f9e3419fd6c6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7df6c964-755a-df07-a128-77fbc1329a39")
public static final String FIELDNAME_CompanyAgent_BusinessPartner="7df6c964-755a-df07-a128-77fbc1329a39";

@XendraTrl(Identifier="e06a18dd-dca4-587b-d270-cee8f4afb317")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="06fdbbe9-e1c4-3ee4-4a9d-73d1a990cc42",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="@C_BPartner_ID@!0",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e06a18dd-dca4-587b-d270-cee8f4afb317",Synchronized="2019-08-30 22:20:46.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set Partner Location.
@param C_BPartner_Location_ID Identifies the (ship to) address for this Business Partner */
public void setC_BPartner_Location_ID (int C_BPartner_Location_ID)
{
if (C_BPartner_Location_ID <= 0) set_Value (COLUMNNAME_C_BPartner_Location_ID, null);
 else 
set_Value (COLUMNNAME_C_BPartner_Location_ID, Integer.valueOf(C_BPartner_Location_ID));
}
/** Get Partner Location.
@return Identifies the (ship to) address for this Business Partner */
public int getC_BPartner_Location_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_Location_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9f420d7b-6371-e49d-9375-e872d4167338")
public static String es_PE_FIELD_UserContact_PartnerLocation_Name="Dirección del Socio del Negocio";

@XendraTrl(Identifier="9f420d7b-6371-e49d-9375-e872d4167338")
public static String es_PE_FIELD_UserContact_PartnerLocation_Description="Identifica la dirección para este socio de negocio";

@XendraTrl(Identifier="9f420d7b-6371-e49d-9375-e872d4167338")
public static String es_PE_FIELD_UserContact_PartnerLocation_Help="La dirección de un socio indica la ubicación de un socio de negocio";

@XendraField(AD_Column_ID="C_BPartner_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ecdc18c1-5823-d6b1-de56-01074475b931",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9f420d7b-6371-e49d-9375-e872d4167338")
public static final String FIELDNAME_UserContact_PartnerLocation="9f420d7b-6371-e49d-9375-e872d4167338";

@XendraTrl(Identifier="d03a1c9f-3235-ba7a-5d02-ca34b86cdc5c")
public static String es_PE_FIELD_User_PartnerLocation_Name="Dirección del Socio del Negocio";

@XendraTrl(Identifier="d03a1c9f-3235-ba7a-5d02-ca34b86cdc5c")
public static String es_PE_FIELD_User_PartnerLocation_Description="Identifica la dirección para este socio de negocio";

@XendraTrl(Identifier="d03a1c9f-3235-ba7a-5d02-ca34b86cdc5c")
public static String es_PE_FIELD_User_PartnerLocation_Help="La dirección de un socio indica la ubicación de un socio de negocio";

@XendraField(AD_Column_ID="C_BPartner_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cca304e4-17f2-1849-76c1-8fa0813b5951",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d03a1c9f-3235-ba7a-5d02-ca34b86cdc5c")
public static final String FIELDNAME_User_PartnerLocation="d03a1c9f-3235-ba7a-5d02-ca34b86cdc5c";

@XendraTrl(Identifier="45123f37-a99e-5343-b107-4b482a7b86e7")
public static String es_PE_FIELD_CompanyAgent_PartnerLocation_Name="Dirección del Socio del Negocio";

@XendraTrl(Identifier="45123f37-a99e-5343-b107-4b482a7b86e7")
public static String es_PE_FIELD_CompanyAgent_PartnerLocation_Description="Identifica la dirección para este socio de negocio";

@XendraTrl(Identifier="45123f37-a99e-5343-b107-4b482a7b86e7")
public static String es_PE_FIELD_CompanyAgent_PartnerLocation_Help="La dirección de un socio indica la ubicación de un socio de negocio";

@XendraField(AD_Column_ID="C_BPartner_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="508b449f-672d-0e92-5d32-f9e3419fd6c6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="45123f37-a99e-5343-b107-4b482a7b86e7")
public static final String FIELDNAME_CompanyAgent_PartnerLocation="45123f37-a99e-5343-b107-4b482a7b86e7";

@XendraTrl(Identifier="e13caff2-f6b3-c024-ea57-cb6607dfd884")
public static String es_PE_COLUMN_C_BPartner_Location_ID_Name="Dirección del Socio del Negocio";

@XendraColumn(AD_Element_ID="0dab7dc6-2832-26dc-2462-cba2d40235f2",
ColumnName="C_BPartner_Location_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",
AD_Val_Rule_ID="623d98c0-19fc-56a2-f511-8992974d3c05",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e13caff2-f6b3-c024-ea57-cb6607dfd884",
Synchronized="2019-08-30 22:20:46.0")
/** Column name C_BPartner_Location_ID */
public static final String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";
/** Set Greeting.
@param C_Greeting_ID Greeting to print on correspondence */
public void setC_Greeting_ID (int C_Greeting_ID)
{
if (C_Greeting_ID <= 0) set_Value (COLUMNNAME_C_Greeting_ID, null);
 else 
set_Value (COLUMNNAME_C_Greeting_ID, Integer.valueOf(C_Greeting_ID));
}
/** Get Greeting.
@return Greeting to print on correspondence */
public int getC_Greeting_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Greeting_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b31c79ff-7a73-cb0c-8d89-c35450c74b2a")
public static String es_PE_FIELD_UserContact_Greeting_Name="Saludo";

@XendraTrl(Identifier="b31c79ff-7a73-cb0c-8d89-c35450c74b2a")
public static String es_PE_FIELD_UserContact_Greeting_Description="Saludo para imprimir en la correspondencia";

@XendraTrl(Identifier="b31c79ff-7a73-cb0c-8d89-c35450c74b2a")
public static String es_PE_FIELD_UserContact_Greeting_Help="Los saludos identifican los saludos a imprimir en la correspondencia";

@XendraField(AD_Column_ID="C_Greeting_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ecdc18c1-5823-d6b1-de56-01074475b931",AD_FieldGroup_ID="External",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=260,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b31c79ff-7a73-cb0c-8d89-c35450c74b2a")
public static final String FIELDNAME_UserContact_Greeting="b31c79ff-7a73-cb0c-8d89-c35450c74b2a";

@XendraTrl(Identifier="fef6bcd7-14b3-3cc2-9310-3de90c3716d5")
public static String es_PE_FIELD_User_Greeting_Name="Saludo";

@XendraTrl(Identifier="fef6bcd7-14b3-3cc2-9310-3de90c3716d5")
public static String es_PE_FIELD_User_Greeting_Description="Saludo para imprimir en la correspondencia";

@XendraTrl(Identifier="fef6bcd7-14b3-3cc2-9310-3de90c3716d5")
public static String es_PE_FIELD_User_Greeting_Help="Los saludos identifican los saludos a imprimir en la correspondencia";

@XendraField(AD_Column_ID="C_Greeting_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cca304e4-17f2-1849-76c1-8fa0813b5951",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fef6bcd7-14b3-3cc2-9310-3de90c3716d5")
public static final String FIELDNAME_User_Greeting="fef6bcd7-14b3-3cc2-9310-3de90c3716d5";

@XendraTrl(Identifier="3fd240e5-346b-60d0-a1f4-57c64f6306ed")
public static String es_PE_FIELD_CompanyAgent_Greeting_Name="Saludo";

@XendraTrl(Identifier="3fd240e5-346b-60d0-a1f4-57c64f6306ed")
public static String es_PE_FIELD_CompanyAgent_Greeting_Description="Saludo para imprimir en la correspondencia";

@XendraTrl(Identifier="3fd240e5-346b-60d0-a1f4-57c64f6306ed")
public static String es_PE_FIELD_CompanyAgent_Greeting_Help="Los saludos identifican los saludos a imprimir en la correspondencia";

@XendraField(AD_Column_ID="C_Greeting_ID",IsCentrallyMaintained=true,
AD_Tab_ID="508b449f-672d-0e92-5d32-f9e3419fd6c6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3fd240e5-346b-60d0-a1f4-57c64f6306ed")
public static final String FIELDNAME_CompanyAgent_Greeting="3fd240e5-346b-60d0-a1f4-57c64f6306ed";

@XendraTrl(Identifier="55969d6b-0559-6957-ecf2-c7661a05f4f1")
public static String es_PE_COLUMN_C_Greeting_ID_Name="Saludo";

@XendraColumn(AD_Element_ID="2865a1ce-d044-a158-129d-7699708f4ce1",ColumnName="C_Greeting_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="55969d6b-0559-6957-ecf2-c7661a05f4f1",
Synchronized="2019-08-30 22:20:46.0")
/** Column name C_Greeting_ID */
public static final String COLUMNNAME_C_Greeting_ID = "C_Greeting_ID";
/** Set Position.
@param C_Job_ID Job Position */
public void setC_Job_ID (int C_Job_ID)
{
if (C_Job_ID <= 0) set_Value (COLUMNNAME_C_Job_ID, null);
 else 
set_Value (COLUMNNAME_C_Job_ID, Integer.valueOf(C_Job_ID));
}
/** Get Position.
@return Job Position */
public int getC_Job_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Job_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e2eef489-2a19-00bc-186c-27a61923b770")
public static String es_PE_FIELD_UserContact_Position_Name="Posición";

@XendraTrl(Identifier="e2eef489-2a19-00bc-186c-27a61923b770")
public static String es_PE_FIELD_UserContact_Position_Description="Posición del trabajo";

@XendraField(AD_Column_ID="C_Job_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ecdc18c1-5823-d6b1-de56-01074475b931",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e2eef489-2a19-00bc-186c-27a61923b770")
public static final String FIELDNAME_UserContact_Position="e2eef489-2a19-00bc-186c-27a61923b770";

@XendraTrl(Identifier="6402db5a-681d-0293-80ab-5e90ec41e4b4")
public static String es_PE_FIELD_User_Position_Name="Posición";

@XendraTrl(Identifier="6402db5a-681d-0293-80ab-5e90ec41e4b4")
public static String es_PE_FIELD_User_Position_Description="Posición del trabajo";

@XendraField(AD_Column_ID="C_Job_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cca304e4-17f2-1849-76c1-8fa0813b5951",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6402db5a-681d-0293-80ab-5e90ec41e4b4")
public static final String FIELDNAME_User_Position="6402db5a-681d-0293-80ab-5e90ec41e4b4";

@XendraTrl(Identifier="99ea71fc-b941-1808-5536-157b3ad4ccba")
public static String es_PE_COLUMN_C_Job_ID_Name="Posición";

@XendraColumn(AD_Element_ID="90c49ce9-ecea-a060-14e0-eca90ed486ad",ColumnName="C_Job_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="c0669642-5da2-d5bf-9cdd-7845869027fa",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="99ea71fc-b941-1808-5536-157b3ad4ccba",Synchronized="2019-08-30 22:20:46.0")
/** Column name C_Job_ID */
public static final String COLUMNNAME_C_Job_ID = "C_Job_ID";
/** Set Comments.
@param Comments Comments or additional information */
public void setComments (String Comments)
{
set_Value (COLUMNNAME_Comments, Comments);
}
/** Get Comments.
@return Comments or additional information */
public String getComments() 
{
String value = (String)get_Value(COLUMNNAME_Comments);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="2ecdd3a3-aa61-4b16-93b9-7ccf7c096262")
public static String es_PE_FIELD_UserContact_Comments_Name="Comentarios";

@XendraTrl(Identifier="2ecdd3a3-aa61-4b16-93b9-7ccf7c096262")
public static String es_PE_FIELD_UserContact_Comments_Description="Comentarios ó información adicional";

@XendraTrl(Identifier="2ecdd3a3-aa61-4b16-93b9-7ccf7c096262")
public static String es_PE_FIELD_UserContact_Comments_Help="El campo comentarios permite entrada en formato libre de información adicional";

@XendraField(AD_Column_ID="Comments",IsCentrallyMaintained=true,
AD_Tab_ID="ecdc18c1-5823-d6b1-de56-01074475b931",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2ecdd3a3-aa61-4b16-93b9-7ccf7c096262")
public static final String FIELDNAME_UserContact_Comments="2ecdd3a3-aa61-4b16-93b9-7ccf7c096262";

@XendraTrl(Identifier="a4f174eb-1f78-b691-3710-09f680d8cf9e")
public static String es_PE_FIELD_User_Comments_Name="Comentarios";

@XendraTrl(Identifier="a4f174eb-1f78-b691-3710-09f680d8cf9e")
public static String es_PE_FIELD_User_Comments_Description="Comentarios ó información adicional";

@XendraTrl(Identifier="a4f174eb-1f78-b691-3710-09f680d8cf9e")
public static String es_PE_FIELD_User_Comments_Help="El campo comentarios permite entrada en formato libre de información adicional";

@XendraField(AD_Column_ID="Comments",IsCentrallyMaintained=true,
AD_Tab_ID="cca304e4-17f2-1849-76c1-8fa0813b5951",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a4f174eb-1f78-b691-3710-09f680d8cf9e")
public static final String FIELDNAME_User_Comments="a4f174eb-1f78-b691-3710-09f680d8cf9e";

@XendraTrl(Identifier="0283cb0a-7475-a9f4-12aa-a507ea5da130")
public static String es_PE_FIELD_CompanyAgent_Comments_Name="Comentarios";

@XendraTrl(Identifier="0283cb0a-7475-a9f4-12aa-a507ea5da130")
public static String es_PE_FIELD_CompanyAgent_Comments_Description="Comentarios ó información adicional";

@XendraTrl(Identifier="0283cb0a-7475-a9f4-12aa-a507ea5da130")
public static String es_PE_FIELD_CompanyAgent_Comments_Help="El campo comentarios permite entrada en formato libre de información adicional";

@XendraField(AD_Column_ID="Comments",IsCentrallyMaintained=true,
AD_Tab_ID="508b449f-672d-0e92-5d32-f9e3419fd6c6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0283cb0a-7475-a9f4-12aa-a507ea5da130")
public static final String FIELDNAME_CompanyAgent_Comments="0283cb0a-7475-a9f4-12aa-a507ea5da130";

@XendraTrl(Identifier="89a5640e-a6e3-888f-a0e3-2470e98ad292")
public static String es_PE_COLUMN_Comments_Name="Comentarios";

@XendraColumn(AD_Element_ID="68725fe2-3419-b727-d8d4-8bf5d0d8cfc2",ColumnName="Comments",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="89a5640e-a6e3-888f-a0e3-2470e98ad292",
Synchronized="2019-08-30 22:20:46.0")
/** Column name Comments */
public static final String COLUMNNAME_Comments = "Comments";
/** Set Connection Profile.
@param ConnectionProfile How a Java Client connects to the server(s) */
public void setConnectionProfile (String ConnectionProfile)
{
if (ConnectionProfile != null && ConnectionProfile.length() > 1)
{
log.warning("Length > 1 - truncated");
ConnectionProfile = ConnectionProfile.substring(0,0);
}
set_Value (COLUMNNAME_ConnectionProfile, ConnectionProfile);
}
/** Get Connection Profile.
@return How a Java Client connects to the server(s) */
public String getConnectionProfile() 
{
return (String)get_Value(COLUMNNAME_ConnectionProfile);
}

@XendraTrl(Identifier="3a99f362-d2fc-12b2-3f73-d85d93f68df9")
public static String es_PE_FIELD_UserContact_ConnectionProfile_Name="Perfil de Conexión";

@XendraTrl(Identifier="3a99f362-d2fc-12b2-3f73-d85d93f68df9")
public static String es_PE_FIELD_UserContact_ConnectionProfile_Description="Como un Cliente Java se conecta al Servidor(res) ";

@XendraTrl(Identifier="3a99f362-d2fc-12b2-3f73-d85d93f68df9")
public static String es_PE_FIELD_UserContact_ConnectionProfile_Help="Dependiendo del Perfil de Conexión, se emplean diferentes Protocolos y las tareas se desarrollan mejor en el Servidor que en el Cliente. Usualmente el usuario puede seleccionar diferentes perfiles, esto es frorzado mediante la definición de Usuarios o Roles. El perfil Nivél de Usuario sobre escribe el perfil basado en el Rol";

@XendraField(AD_Column_ID="ConnectionProfile",IsCentrallyMaintained=true,
AD_Tab_ID="ecdc18c1-5823-d6b1-de56-01074475b931",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=250,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3a99f362-d2fc-12b2-3f73-d85d93f68df9")
public static final String FIELDNAME_UserContact_ConnectionProfile="3a99f362-d2fc-12b2-3f73-d85d93f68df9";

@XendraTrl(Identifier="acd61a0c-5e9c-3eb1-41f5-7f809f34aba1")
public static String es_PE_COLUMN_ConnectionProfile_Name="Perfil de Conexión";

@XendraColumn(AD_Element_ID="0bedebc6-89fa-ce88-eb93-bbf2207e0485",ColumnName="ConnectionProfile",
AD_Reference_ID=17,AD_Reference_Value_ID="474037d5-3cef-9c8c-8e15-a0704cbfdc86",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="acd61a0c-5e9c-3eb1-41f5-7f809f34aba1",Synchronized="2019-08-30 22:20:47.0")
/** Column name ConnectionProfile */
public static final String COLUMNNAME_ConnectionProfile = "ConnectionProfile";
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

@XendraTrl(Identifier="4a767287-d29e-cbb5-f2c4-1c4d92ae557d")
public static String es_PE_FIELD_UserContact_Description_Name="Observación";

@XendraTrl(Identifier="4a767287-d29e-cbb5-f2c4-1c4d92ae557d")
public static String es_PE_FIELD_UserContact_Description_Description="Observación";

@XendraTrl(Identifier="4a767287-d29e-cbb5-f2c4-1c4d92ae557d")
public static String es_PE_FIELD_UserContact_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="ecdc18c1-5823-d6b1-de56-01074475b931",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4a767287-d29e-cbb5-f2c4-1c4d92ae557d")
public static final String FIELDNAME_UserContact_Description="4a767287-d29e-cbb5-f2c4-1c4d92ae557d";

@XendraTrl(Identifier="d905e671-8d18-1a3f-f8e3-695e58113d23")
public static String es_PE_FIELD_User_Description_Name="Observación";

@XendraTrl(Identifier="d905e671-8d18-1a3f-f8e3-695e58113d23")
public static String es_PE_FIELD_User_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="d905e671-8d18-1a3f-f8e3-695e58113d23")
public static String es_PE_FIELD_User_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="cca304e4-17f2-1849-76c1-8fa0813b5951",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d905e671-8d18-1a3f-f8e3-695e58113d23")
public static final String FIELDNAME_User_Description="d905e671-8d18-1a3f-f8e3-695e58113d23";

@XendraTrl(Identifier="d5c5325d-cff9-8abb-a4a1-2dfc2f68ef00")
public static String es_PE_FIELD_CompanyAgent_Description_Name="Observación";

@XendraTrl(Identifier="d5c5325d-cff9-8abb-a4a1-2dfc2f68ef00")
public static String es_PE_FIELD_CompanyAgent_Description_Description="Observación";

@XendraTrl(Identifier="d5c5325d-cff9-8abb-a4a1-2dfc2f68ef00")
public static String es_PE_FIELD_CompanyAgent_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="508b449f-672d-0e92-5d32-f9e3419fd6c6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d5c5325d-cff9-8abb-a4a1-2dfc2f68ef00")
public static final String FIELDNAME_CompanyAgent_Description="d5c5325d-cff9-8abb-a4a1-2dfc2f68ef00";

@XendraTrl(Identifier="d2517031-795d-9294-fedc-a180146b4fd4")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d2517031-795d-9294-fedc-a180146b4fd4",
Synchronized="2019-08-30 22:20:47.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set EMail Address.
@param EMail Electronic Mail Address */
public void setEMail (String EMail)
{
if (EMail != null && EMail.length() > 60)
{
log.warning("Length > 60 - truncated");
EMail = EMail.substring(0,59);
}
set_Value (COLUMNNAME_EMail, EMail);
}
/** Get EMail Address.
@return Electronic Mail Address */
public String getEMail() 
{
String value = (String)get_Value(COLUMNNAME_EMail);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="3a10f650-affe-4bff-80b2-5de7bf221820")
public static String es_PE_FIELD_UserContact_EMailAddress_Name="Email";

@XendraTrl(Identifier="3a10f650-affe-4bff-80b2-5de7bf221820")
public static String es_PE_FIELD_UserContact_EMailAddress_Description="ID de correo electrónico";

@XendraTrl(Identifier="3a10f650-affe-4bff-80b2-5de7bf221820")
public static String es_PE_FIELD_UserContact_EMailAddress_Help="El Email indica la ID de correo electrónico para este usuario";

@XendraField(AD_Column_ID="EMail",IsCentrallyMaintained=true,
AD_Tab_ID="ecdc18c1-5823-d6b1-de56-01074475b931",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3a10f650-affe-4bff-80b2-5de7bf221820")
public static final String FIELDNAME_UserContact_EMailAddress="3a10f650-affe-4bff-80b2-5de7bf221820";

@XendraTrl(Identifier="06bebca0-5cf0-e3fe-d094-405d2a374e60")
public static String es_PE_FIELD_User_EMailAddress_Name="Email";

@XendraTrl(Identifier="06bebca0-5cf0-e3fe-d094-405d2a374e60")
public static String es_PE_FIELD_User_EMailAddress_Description="ID de correo electrónico";

@XendraTrl(Identifier="06bebca0-5cf0-e3fe-d094-405d2a374e60")
public static String es_PE_FIELD_User_EMailAddress_Help="El Email indica la ID de correo electrónico para este usuario";

@XendraField(AD_Column_ID="EMail",IsCentrallyMaintained=true,
AD_Tab_ID="cca304e4-17f2-1849-76c1-8fa0813b5951",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="06bebca0-5cf0-e3fe-d094-405d2a374e60")
public static final String FIELDNAME_User_EMailAddress="06bebca0-5cf0-e3fe-d094-405d2a374e60";

@XendraTrl(Identifier="8d59e56f-e3c5-969e-b5c0-812a0b8682ea")
public static String es_PE_FIELD_CompanyAgent_EMailAddress_Name="Email";

@XendraTrl(Identifier="8d59e56f-e3c5-969e-b5c0-812a0b8682ea")
public static String es_PE_FIELD_CompanyAgent_EMailAddress_Description="ID de correo electrónico";

@XendraTrl(Identifier="8d59e56f-e3c5-969e-b5c0-812a0b8682ea")
public static String es_PE_FIELD_CompanyAgent_EMailAddress_Help="El Email indica la ID de correo electrónico para este usuario";

@XendraField(AD_Column_ID="EMail",IsCentrallyMaintained=true,
AD_Tab_ID="508b449f-672d-0e92-5d32-f9e3419fd6c6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8d59e56f-e3c5-969e-b5c0-812a0b8682ea")
public static final String FIELDNAME_CompanyAgent_EMailAddress="8d59e56f-e3c5-969e-b5c0-812a0b8682ea";

@XendraTrl(Identifier="0fe89826-1794-3fe7-523c-4e75dbc2de82")
public static String es_PE_COLUMN_EMail_Name="Email";

@XendraColumn(AD_Element_ID="d18b300c-9ad6-2dd2-36d3-b65969743158",ColumnName="EMail",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0fe89826-1794-3fe7-523c-4e75dbc2de82",
Synchronized="2019-08-30 22:20:47.0")
/** Column name EMail */
public static final String COLUMNNAME_EMail = "EMail";
/** Set EMail User ID.
@param EMailUser User Name (ID) in the Mail System */
public void setEMailUser (String EMailUser)
{
if (EMailUser != null && EMailUser.length() > 60)
{
log.warning("Length > 60 - truncated");
EMailUser = EMailUser.substring(0,59);
}
set_Value (COLUMNNAME_EMailUser, EMailUser);
}
/** Get EMail User ID.
@return User Name (ID) in the Mail System */
public String getEMailUser() 
{
String value = (String)get_Value(COLUMNNAME_EMailUser);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="e51b9622-023f-1b73-c4ef-16bb9f20234f")
public static String es_PE_FIELD_UserContact_EMailUserID_Name="ID Usuario";

@XendraTrl(Identifier="e51b9622-023f-1b73-c4ef-16bb9f20234f")
public static String es_PE_FIELD_UserContact_EMailUserID_Description="ID de usuario del email";

@XendraTrl(Identifier="e51b9622-023f-1b73-c4ef-16bb9f20234f")
public static String es_PE_FIELD_UserContact_EMailUserID_Help="El ID de usuario es normalmente el nombre antes del símbolo @ de su dirección de e-mail.";

@XendraField(AD_Column_ID="EMailUser",IsCentrallyMaintained=true,
AD_Tab_ID="ecdc18c1-5823-d6b1-de56-01074475b931",AD_FieldGroup_ID="Internal",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e51b9622-023f-1b73-c4ef-16bb9f20234f")
public static final String FIELDNAME_UserContact_EMailUserID="e51b9622-023f-1b73-c4ef-16bb9f20234f";

@XendraTrl(Identifier="80f9ee4b-0b45-c71a-cbc1-3b8c7544a19b")
public static String es_PE_FIELD_User_EMailUserID_Name="ID Usuario";

@XendraTrl(Identifier="80f9ee4b-0b45-c71a-cbc1-3b8c7544a19b")
public static String es_PE_FIELD_User_EMailUserID_Description="ID de usuario del email";

@XendraTrl(Identifier="80f9ee4b-0b45-c71a-cbc1-3b8c7544a19b")
public static String es_PE_FIELD_User_EMailUserID_Help="El ID de usuario es normalmente el nombre antes del símbolo @ de su dirección de e-mail.";

@XendraField(AD_Column_ID="EMailUser",IsCentrallyMaintained=true,
AD_Tab_ID="cca304e4-17f2-1849-76c1-8fa0813b5951",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="80f9ee4b-0b45-c71a-cbc1-3b8c7544a19b")
public static final String FIELDNAME_User_EMailUserID="80f9ee4b-0b45-c71a-cbc1-3b8c7544a19b";

@XendraTrl(Identifier="57760f02-3685-a639-bf8d-556ee788268d")
public static String es_PE_FIELD_CompanyAgent_EMailUserID_Name="ID Usuario";

@XendraTrl(Identifier="57760f02-3685-a639-bf8d-556ee788268d")
public static String es_PE_FIELD_CompanyAgent_EMailUserID_Description="ID de usuario del email";

@XendraTrl(Identifier="57760f02-3685-a639-bf8d-556ee788268d")
public static String es_PE_FIELD_CompanyAgent_EMailUserID_Help="El ID de usuario es normalmente el nombre antes del símbolo @ de su dirección de e-mail.";

@XendraField(AD_Column_ID="EMailUser",IsCentrallyMaintained=true,
AD_Tab_ID="508b449f-672d-0e92-5d32-f9e3419fd6c6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="57760f02-3685-a639-bf8d-556ee788268d")
public static final String FIELDNAME_CompanyAgent_EMailUserID="57760f02-3685-a639-bf8d-556ee788268d";

@XendraTrl(Identifier="362fe0bd-9998-4a43-a379-13cdb2d1782d")
public static String es_PE_COLUMN_EMailUser_Name="ID Usuario";

@XendraColumn(AD_Element_ID="1349ac59-56ac-8a73-6587-105fdd40bd24",ColumnName="EMailUser",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="362fe0bd-9998-4a43-a379-13cdb2d1782d",
Synchronized="2019-08-30 22:20:47.0")
/** Column name EMailUser */
public static final String COLUMNNAME_EMailUser = "EMailUser";
/** Set EMail User Password.
@param EMailUserPW Password of your email user id */
public void setEMailUserPW (String EMailUserPW)
{
if (EMailUserPW != null && EMailUserPW.length() > 20)
{
log.warning("Length > 20 - truncated");
EMailUserPW = EMailUserPW.substring(0,19);
}
set_ValueE (COLUMNNAME_EMailUserPW, EMailUserPW);
}
/** Get EMail User Password.
@return Password of your email user id */
public String getEMailUserPW() 
{
String value = (String)get_ValueE(COLUMNNAME_EMailUserPW);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="e1e29695-4ea2-7e7c-6965-470eb1f865d7")
public static String es_PE_FIELD_UserContact_EMailUserPassword_Name="Contraseña";

@XendraTrl(Identifier="e1e29695-4ea2-7e7c-6965-470eb1f865d7")
public static String es_PE_FIELD_UserContact_EMailUserPassword_Description="Contraseña de su usuario de email";

@XendraTrl(Identifier="e1e29695-4ea2-7e7c-6965-470eb1f865d7")
public static String es_PE_FIELD_UserContact_EMailUserPassword_Help="Requerido si el servidor de correo requiere autenticación para mandar  e-mail";

@XendraField(AD_Column_ID="EMailUserPW",IsCentrallyMaintained=true,
AD_Tab_ID="ecdc18c1-5823-d6b1-de56-01074475b931",AD_FieldGroup_ID="Internal",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e1e29695-4ea2-7e7c-6965-470eb1f865d7")
public static final String FIELDNAME_UserContact_EMailUserPassword="e1e29695-4ea2-7e7c-6965-470eb1f865d7";

@XendraTrl(Identifier="f493aa35-e3d8-3029-734b-df74fd2115e8")
public static String es_PE_FIELD_User_EMailUserPassword_Name="Contraseña";

@XendraTrl(Identifier="f493aa35-e3d8-3029-734b-df74fd2115e8")
public static String es_PE_FIELD_User_EMailUserPassword_Description="Contraseña de su usuario de email";

@XendraTrl(Identifier="f493aa35-e3d8-3029-734b-df74fd2115e8")
public static String es_PE_FIELD_User_EMailUserPassword_Help="Requerido si el servidor de correo requiere autenticación para mandar  e-mail";

@XendraField(AD_Column_ID="EMailUserPW",IsCentrallyMaintained=true,
AD_Tab_ID="cca304e4-17f2-1849-76c1-8fa0813b5951",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f493aa35-e3d8-3029-734b-df74fd2115e8")
public static final String FIELDNAME_User_EMailUserPassword="f493aa35-e3d8-3029-734b-df74fd2115e8";

@XendraTrl(Identifier="f1614e00-0c00-d11c-ea32-571f3ce0fbe5")
public static String es_PE_FIELD_CompanyAgent_EMailUserPassword_Name="Contraseña";

@XendraTrl(Identifier="f1614e00-0c00-d11c-ea32-571f3ce0fbe5")
public static String es_PE_FIELD_CompanyAgent_EMailUserPassword_Description="Contraseña de su usuario de email";

@XendraTrl(Identifier="f1614e00-0c00-d11c-ea32-571f3ce0fbe5")
public static String es_PE_FIELD_CompanyAgent_EMailUserPassword_Help="Requerido si el servidor de correo requiere autenticación para mandar  e-mail";

@XendraField(AD_Column_ID="EMailUserPW",IsCentrallyMaintained=true,
AD_Tab_ID="508b449f-672d-0e92-5d32-f9e3419fd6c6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f1614e00-0c00-d11c-ea32-571f3ce0fbe5")
public static final String FIELDNAME_CompanyAgent_EMailUserPassword="f1614e00-0c00-d11c-ea32-571f3ce0fbe5";

@XendraTrl(Identifier="3577898a-570f-9536-6e68-dbddf0e4fb5e")
public static String es_PE_COLUMN_EMailUserPW_Name="Contraseña";

@XendraColumn(AD_Element_ID="59d0af61-d5ca-b691-563f-f3edf672462c",ColumnName="EMailUserPW",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3577898a-570f-9536-6e68-dbddf0e4fb5e",
Synchronized="2019-08-30 22:20:47.0")
/** Column name EMailUserPW */
public static final String COLUMNNAME_EMailUserPW = "EMailUserPW";
/** Set Verification Info.
@param EMailVerify Verification information of EMail Address */
public void setEMailVerify (String EMailVerify)
{
if (EMailVerify != null && EMailVerify.length() > 40)
{
log.warning("Length > 40 - truncated");
EMailVerify = EMailVerify.substring(0,39);
}
set_ValueNoCheck (COLUMNNAME_EMailVerify, EMailVerify);
}
/** Get Verification Info.
@return Verification information of EMail Address */
public String getEMailVerify() 
{
String value = (String)get_Value(COLUMNNAME_EMailVerify);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="886d1d7f-50bd-acc8-53b9-df75eac871e2")
public static String es_PE_FIELD_UserContact_VerificationInfo_Name="Verificación de EMail";

@XendraTrl(Identifier="886d1d7f-50bd-acc8-53b9-df75eac871e2")
public static String es_PE_FIELD_UserContact_VerificationInfo_Description="Verificación de la dirección de EMail";

@XendraTrl(Identifier="886d1d7f-50bd-acc8-53b9-df75eac871e2")
public static String es_PE_FIELD_UserContact_VerificationInfo_Help="El campo contiene la fecha que se ha verificado la dirección del email.";

@XendraField(AD_Column_ID="EMailVerify",IsCentrallyMaintained=true,
AD_Tab_ID="ecdc18c1-5823-d6b1-de56-01074475b931",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=290,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="886d1d7f-50bd-acc8-53b9-df75eac871e2")
public static final String FIELDNAME_UserContact_VerificationInfo="886d1d7f-50bd-acc8-53b9-df75eac871e2";

@XendraTrl(Identifier="3e6a851b-5984-ae2e-7398-1e0dbc06794f")
public static String es_PE_FIELD_User_VerificationInfo_Name="Verificación de EMail";

@XendraTrl(Identifier="3e6a851b-5984-ae2e-7398-1e0dbc06794f")
public static String es_PE_FIELD_User_VerificationInfo_Description="Verificación de la dirección de EMail";

@XendraTrl(Identifier="3e6a851b-5984-ae2e-7398-1e0dbc06794f")
public static String es_PE_FIELD_User_VerificationInfo_Help="El campo contiene la fecha que se ha verificado la dirección del email.";

@XendraField(AD_Column_ID="EMailVerify",IsCentrallyMaintained=true,
AD_Tab_ID="cca304e4-17f2-1849-76c1-8fa0813b5951",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=210,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3e6a851b-5984-ae2e-7398-1e0dbc06794f")
public static final String FIELDNAME_User_VerificationInfo="3e6a851b-5984-ae2e-7398-1e0dbc06794f";

@XendraTrl(Identifier="d1497326-0272-53b1-10fe-0ffb4712871b")
public static String es_PE_FIELD_CompanyAgent_VerificationInfo_Name="Verificación de EMail";

@XendraTrl(Identifier="d1497326-0272-53b1-10fe-0ffb4712871b")
public static String es_PE_FIELD_CompanyAgent_VerificationInfo_Description="Verificación de la dirección de EMail";

@XendraTrl(Identifier="d1497326-0272-53b1-10fe-0ffb4712871b")
public static String es_PE_FIELD_CompanyAgent_VerificationInfo_Help="El campo contiene la fecha que se ha verificado la dirección del email.";

@XendraField(AD_Column_ID="EMailVerify",IsCentrallyMaintained=true,
AD_Tab_ID="508b449f-672d-0e92-5d32-f9e3419fd6c6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d1497326-0272-53b1-10fe-0ffb4712871b")
public static final String FIELDNAME_CompanyAgent_VerificationInfo="d1497326-0272-53b1-10fe-0ffb4712871b";

@XendraTrl(Identifier="c56e8618-f155-3b44-df35-46f59dfb2e99")
public static String es_PE_COLUMN_EMailVerify_Name="Verificación de EMail";

@XendraColumn(AD_Element_ID="d2897ae4-97c5-618b-7bdb-77fb0672b72b",ColumnName="EMailVerify",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c56e8618-f155-3b44-df35-46f59dfb2e99",
Synchronized="2019-08-30 22:20:47.0")
/** Column name EMailVerify */
public static final String COLUMNNAME_EMailVerify = "EMailVerify";
/** Set EMail Verify.
@param EMailVerifyDate Date Email was verified */
public void setEMailVerifyDate (Timestamp EMailVerifyDate)
{
set_ValueNoCheck (COLUMNNAME_EMailVerifyDate, EMailVerifyDate);
}
/** Get EMail Verify.
@return Date Email was verified */
public Timestamp getEMailVerifyDate() 
{
return (Timestamp)get_Value(COLUMNNAME_EMailVerifyDate);
}

@XendraTrl(Identifier="228b39a9-69ae-21ec-8bb2-fc2d16a9c88e")
public static String es_PE_FIELD_UserContact_EMailVerify_Name="Verificación de Email";

@XendraField(AD_Column_ID="EMailVerifyDate",IsCentrallyMaintained=true,
AD_Tab_ID="ecdc18c1-5823-d6b1-de56-01074475b931",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=270,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="228b39a9-69ae-21ec-8bb2-fc2d16a9c88e")
public static final String FIELDNAME_UserContact_EMailVerify="228b39a9-69ae-21ec-8bb2-fc2d16a9c88e";

@XendraTrl(Identifier="ba4ea916-cdd9-f8af-baac-48bfd4100028")
public static String es_PE_FIELD_User_EMailVerify_Name="Verificación de Email";

@XendraField(AD_Column_ID="EMailVerifyDate",IsCentrallyMaintained=true,
AD_Tab_ID="cca304e4-17f2-1849-76c1-8fa0813b5951",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ba4ea916-cdd9-f8af-baac-48bfd4100028")
public static final String FIELDNAME_User_EMailVerify="ba4ea916-cdd9-f8af-baac-48bfd4100028";

@XendraTrl(Identifier="86c77309-f088-22e9-632f-345a23f9e071")
public static String es_PE_FIELD_CompanyAgent_EMailVerify_Name="Verificación de Email";

@XendraField(AD_Column_ID="EMailVerifyDate",IsCentrallyMaintained=true,
AD_Tab_ID="508b449f-672d-0e92-5d32-f9e3419fd6c6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="86c77309-f088-22e9-632f-345a23f9e071")
public static final String FIELDNAME_CompanyAgent_EMailVerify="86c77309-f088-22e9-632f-345a23f9e071";

@XendraTrl(Identifier="1eaf08cc-041b-3303-1373-119161e0f5d7")
public static String es_PE_COLUMN_EMailVerifyDate_Name="Verificación de Email";

@XendraColumn(AD_Element_ID="3a7d54f2-2360-c4fc-befe-7dab6d037db7",ColumnName="EMailVerifyDate",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1eaf08cc-041b-3303-1373-119161e0f5d7",
Synchronized="2019-08-30 22:20:47.0")
/** Column name EMailVerifyDate */
public static final String COLUMNNAME_EMailVerifyDate = "EMailVerifyDate";
/** Set Fax.
@param Fax Facsimile number */
public void setFax (String Fax)
{
if (Fax != null && Fax.length() > 40)
{
log.warning("Length > 40 - truncated");
Fax = Fax.substring(0,39);
}
set_Value (COLUMNNAME_Fax, Fax);
}
/** Get Fax.
@return Facsimile number */
public String getFax() 
{
String value = (String)get_Value(COLUMNNAME_Fax);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="5cfd3d81-294c-ad1b-2c2a-ab08a48d4a80")
public static String es_PE_FIELD_UserContact_Fax_Name="Fax";

@XendraTrl(Identifier="5cfd3d81-294c-ad1b-2c2a-ab08a48d4a80")
public static String es_PE_FIELD_UserContact_Fax_Description="Número de Fax";

@XendraTrl(Identifier="5cfd3d81-294c-ad1b-2c2a-ab08a48d4a80")
public static String es_PE_FIELD_UserContact_Fax_Help="El Fax indica un número de fax para este socio de negocio ó ubicación";

@XendraField(AD_Column_ID="Fax",IsCentrallyMaintained=true,
AD_Tab_ID="ecdc18c1-5823-d6b1-de56-01074475b931",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5cfd3d81-294c-ad1b-2c2a-ab08a48d4a80")
public static final String FIELDNAME_UserContact_Fax="5cfd3d81-294c-ad1b-2c2a-ab08a48d4a80";

@XendraTrl(Identifier="5b5746b3-751d-7d23-e137-51970fb3a37d")
public static String es_PE_FIELD_User_Fax_Name="Fax";

@XendraTrl(Identifier="5b5746b3-751d-7d23-e137-51970fb3a37d")
public static String es_PE_FIELD_User_Fax_Description="Número de Fax";

@XendraTrl(Identifier="5b5746b3-751d-7d23-e137-51970fb3a37d")
public static String es_PE_FIELD_User_Fax_Help="El Fax indica un número de fax para este socio de negocio ó ubicación";

@XendraField(AD_Column_ID="Fax",IsCentrallyMaintained=true,
AD_Tab_ID="cca304e4-17f2-1849-76c1-8fa0813b5951",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5b5746b3-751d-7d23-e137-51970fb3a37d")
public static final String FIELDNAME_User_Fax="5b5746b3-751d-7d23-e137-51970fb3a37d";

@XendraTrl(Identifier="a892e91d-db9b-735a-d0d8-71ed9820dcfd")
public static String es_PE_FIELD_CompanyAgent_Fax_Name="Fax";

@XendraTrl(Identifier="a892e91d-db9b-735a-d0d8-71ed9820dcfd")
public static String es_PE_FIELD_CompanyAgent_Fax_Description="Número de Fax";

@XendraTrl(Identifier="a892e91d-db9b-735a-d0d8-71ed9820dcfd")
public static String es_PE_FIELD_CompanyAgent_Fax_Help="El Fax indica un número de fax para este socio de negocio ó ubicación";

@XendraField(AD_Column_ID="Fax",IsCentrallyMaintained=true,
AD_Tab_ID="508b449f-672d-0e92-5d32-f9e3419fd6c6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a892e91d-db9b-735a-d0d8-71ed9820dcfd")
public static final String FIELDNAME_CompanyAgent_Fax="a892e91d-db9b-735a-d0d8-71ed9820dcfd";

@XendraTrl(Identifier="0a3399d0-323f-18e5-8916-7d1b1e7a57df")
public static String es_PE_COLUMN_Fax_Name="Fax";

@XendraColumn(AD_Element_ID="8a02a423-cb7b-6c2f-8be1-1423aec1ba37",ColumnName="Fax",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0a3399d0-323f-18e5-8916-7d1b1e7a57df",
Synchronized="2019-08-30 22:20:47.0")
/** Column name Fax */
public static final String COLUMNNAME_Fax = "Fax";
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
@XendraTrl(Identifier="b9b8c507-e8a0-4805-b542-9c39ac7bd935")
public static String es_PE_FIELD_UserContact_Identifier_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="ecdc18c1-5823-d6b1-de56-01074475b931",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=36,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2019-08-30 22:20:47.0",
Identifier="b9b8c507-e8a0-4805-b542-9c39ac7bd935")
public static final String FIELDNAME_UserContact_Identifier="b9b8c507-e8a0-4805-b542-9c39ac7bd935";

@XendraTrl(Identifier="25436030-101d-41cc-be6d-f7a772d5a8ce")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="25436030-101d-41cc-be6d-f7a772d5a8ce",
Synchronized="2019-08-30 22:20:47.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set IsChangePassword.
@param IsChangePassword IsChangePassword */
public void setIsChangePassword (boolean IsChangePassword)
{
set_Value (COLUMNNAME_IsChangePassword, Boolean.valueOf(IsChangePassword));
}
/** Get IsChangePassword.
@return IsChangePassword */
public boolean isChangePassword() 
{
Object oo = get_Value(COLUMNNAME_IsChangePassword);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="1561fd94-0b14-4c72-b7ec-27035ac3eb19")
public static String es_PE_FIELD_UserContact_IsChangePassword_Name="Cambia el pasword?";

@XendraField(AD_Column_ID="IsChangePassword",IsCentrallyMaintained=true,
AD_Tab_ID="ecdc18c1-5823-d6b1-de56-01074475b931",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=310,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2019-08-30 22:20:47.0",
Identifier="1561fd94-0b14-4c72-b7ec-27035ac3eb19")
public static final String FIELDNAME_UserContact_IsChangePassword="1561fd94-0b14-4c72-b7ec-27035ac3eb19";

@XendraTrl(Identifier="af55480b-04d5-8615-0783-6ab2e66c0e0a")
public static String es_PE_COLUMN_IsChangePassword_Name="ischangepassword";

@XendraColumn(AD_Element_ID="f6f1e1c8-c3e1-5a5d-0826-d5e24f3eaad7",ColumnName="IsChangePassword",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="af55480b-04d5-8615-0783-6ab2e66c0e0a",
Synchronized="2019-08-30 22:20:47.0")
/** Column name IsChangePassword */
public static final String COLUMNNAME_IsChangePassword = "IsChangePassword";
/** Set Full BP Access.
@param IsFullBPAccess The user/concat has full access to Business Partner information and resources */
public void setIsFullBPAccess (boolean IsFullBPAccess)
{
set_Value (COLUMNNAME_IsFullBPAccess, Boolean.valueOf(IsFullBPAccess));
}
/** Get Full BP Access.
@return The user/concat has full access to Business Partner information and resources */
public boolean isFullBPAccess() 
{
Object oo = get_Value(COLUMNNAME_IsFullBPAccess);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="daf8605a-5a33-56af-a8cc-68e21596c33f")
public static String es_PE_FIELD_UserContact_FullBPAccess_Name="Total Acceso SN";

@XendraTrl(Identifier="daf8605a-5a33-56af-a8cc-68e21596c33f")
public static String es_PE_FIELD_UserContact_FullBPAccess_Description="El Usuario/contacto tiene un acceso total a la información del Socio del Negocio y recursos";

@XendraTrl(Identifier="daf8605a-5a33-56af-a8cc-68e21596c33f")
public static String es_PE_FIELD_UserContact_FullBPAccess_Help="Si seleccionó, el usuario tiene acceso total a la información del Socio del Negocio (SN) tal como (Documentoi SN, Ordenes, Facturas, Solicitudes) o recursos (Activos, Descargas). Si lo deselecciona, el usuario no tiene ningún derecho de acceso a menos que usted lo conceda explícitamente en la  pestaña \"Acceso  SN\"";

@XendraField(AD_Column_ID="IsFullBPAccess",IsCentrallyMaintained=true,
AD_Tab_ID="ecdc18c1-5823-d6b1-de56-01074475b931",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="daf8605a-5a33-56af-a8cc-68e21596c33f")
public static final String FIELDNAME_UserContact_FullBPAccess="daf8605a-5a33-56af-a8cc-68e21596c33f";

@XendraTrl(Identifier="774cca9f-649c-3a89-2b25-e81524e09839")
public static String es_PE_FIELD_User_FullBPAccess_Name="Total Acceso SN";

@XendraTrl(Identifier="774cca9f-649c-3a89-2b25-e81524e09839")
public static String es_PE_FIELD_User_FullBPAccess_Description="El Usuario/contacto tiene un acceso total a la información del Socio del Negocio y recursos";

@XendraTrl(Identifier="774cca9f-649c-3a89-2b25-e81524e09839")
public static String es_PE_FIELD_User_FullBPAccess_Help="Si seleccionó, el usuario tiene acceso total a la información del Socio del Negocio (SN) tal como (Documentoi SN, Ordenes, Facturas, Solicitudes) o recursos (Activos, Descargas). Si lo deselecciona, el usuario no tiene ningún derecho de acceso a menos que usted lo conceda explícitamente en la  pestaña \"Acceso  SN\"";

@XendraField(AD_Column_ID="IsFullBPAccess",IsCentrallyMaintained=true,
AD_Tab_ID="cca304e4-17f2-1849-76c1-8fa0813b5951",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="774cca9f-649c-3a89-2b25-e81524e09839")
public static final String FIELDNAME_User_FullBPAccess="774cca9f-649c-3a89-2b25-e81524e09839";

@XendraTrl(Identifier="59f08c56-5027-bd90-0db3-1054d8141fbe")
public static String es_PE_COLUMN_IsFullBPAccess_Name="Total Acceso SN";

@XendraColumn(AD_Element_ID="9d4ceffb-dcdd-807e-0cba-613b3e1dbf90",ColumnName="IsFullBPAccess",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="59f08c56-5027-bd90-0db3-1054d8141fbe",
Synchronized="2019-08-30 22:20:47.0")
/** Column name IsFullBPAccess */
public static final String COLUMNNAME_IsFullBPAccess = "IsFullBPAccess";
/** Set IsFullPriceListAccess.
@param IsFullPriceListAccess IsFullPriceListAccess */
public void setIsFullPriceListAccess (boolean IsFullPriceListAccess)
{
set_Value (COLUMNNAME_IsFullPriceListAccess, Boolean.valueOf(IsFullPriceListAccess));
}
/** Get IsFullPriceListAccess.
@return IsFullPriceListAccess */
public boolean isFullPriceListAccess() 
{
Object oo = get_Value(COLUMNNAME_IsFullPriceListAccess);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="6dc2fb2e-4f80-3ec1-57fa-156c9c00394d")
public static String es_PE_FIELD_UserContact_IsFullPriceListAccess_Name="Ve todas las listas de precio?";

@XendraField(AD_Column_ID="IsFullPriceListAccess",IsCentrallyMaintained=true,
AD_Tab_ID="ecdc18c1-5823-d6b1-de56-01074475b931",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=320,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6dc2fb2e-4f80-3ec1-57fa-156c9c00394d")
public static final String FIELDNAME_UserContact_IsFullPriceListAccess="6dc2fb2e-4f80-3ec1-57fa-156c9c00394d";

@XendraTrl(Identifier="181ec738-47d4-851a-31f4-89ea2e79a6e4")
public static String es_PE_COLUMN_IsFullPriceListAccess_Name="IsFullPriceListAccess";

@XendraColumn(AD_Element_ID="bd01de9d-12b7-bd72-ef72-2732567f424d",
ColumnName="IsFullPriceListAccess",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="181ec738-47d4-851a-31f4-89ea2e79a6e4",Synchronized="2019-08-30 22:20:47.0")
/** Column name IsFullPriceListAccess */
public static final String COLUMNNAME_IsFullPriceListAccess = "IsFullPriceListAccess";
/** Set Last Contact.
@param LastContact Date this individual was last contacted */
public void setLastContact (Timestamp LastContact)
{
set_Value (COLUMNNAME_LastContact, LastContact);
}
/** Get Last Contact.
@return Date this individual was last contacted */
public Timestamp getLastContact() 
{
return (Timestamp)get_Value(COLUMNNAME_LastContact);
}

@XendraTrl(Identifier="04fd695c-faef-c45b-30b4-b3f9b65e2d82")
public static String es_PE_FIELD_UserContact_LastContact_Name="Último Contacto";

@XendraTrl(Identifier="04fd695c-faef-c45b-30b4-b3f9b65e2d82")
public static String es_PE_FIELD_UserContact_LastContact_Description="Fecha en que este individuo fue contactado por última vez";

@XendraTrl(Identifier="04fd695c-faef-c45b-30b4-b3f9b65e2d82")
public static String es_PE_FIELD_UserContact_LastContact_Help="El último contacto indica la fecha en que el contacto de este socio de segocio fue contactado por última vez";

@XendraField(AD_Column_ID="LastContact",IsCentrallyMaintained=true,
AD_Tab_ID="ecdc18c1-5823-d6b1-de56-01074475b931",AD_FieldGroup_ID="External",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=280,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="04fd695c-faef-c45b-30b4-b3f9b65e2d82")
public static final String FIELDNAME_UserContact_LastContact="04fd695c-faef-c45b-30b4-b3f9b65e2d82";

@XendraTrl(Identifier="911b9897-e247-8811-a3e5-24552b879aeb")
public static String es_PE_FIELD_User_LastContact_Name="Último Contacto";

@XendraTrl(Identifier="911b9897-e247-8811-a3e5-24552b879aeb")
public static String es_PE_FIELD_User_LastContact_Description="Fecha en que este individuo fue contactado por última vez";

@XendraTrl(Identifier="911b9897-e247-8811-a3e5-24552b879aeb")
public static String es_PE_FIELD_User_LastContact_Help="El último contacto indica la fecha en que el contacto de este socio de segocio fue contactado por última vez";

@XendraField(AD_Column_ID="LastContact",IsCentrallyMaintained=true,
AD_Tab_ID="cca304e4-17f2-1849-76c1-8fa0813b5951",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="911b9897-e247-8811-a3e5-24552b879aeb")
public static final String FIELDNAME_User_LastContact="911b9897-e247-8811-a3e5-24552b879aeb";

@XendraTrl(Identifier="ea8ec648-c90e-71ba-2897-05cbfbfd2604")
public static String es_PE_FIELD_CompanyAgent_LastContact_Name="Último Contacto";

@XendraTrl(Identifier="ea8ec648-c90e-71ba-2897-05cbfbfd2604")
public static String es_PE_FIELD_CompanyAgent_LastContact_Description="Fecha en que este individuo fue contactado por última vez";

@XendraTrl(Identifier="ea8ec648-c90e-71ba-2897-05cbfbfd2604")
public static String es_PE_FIELD_CompanyAgent_LastContact_Help="El último contacto indica la fecha en que el contacto de este socio de segocio fue contactado por última vez";

@XendraField(AD_Column_ID="LastContact",IsCentrallyMaintained=true,
AD_Tab_ID="508b449f-672d-0e92-5d32-f9e3419fd6c6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ea8ec648-c90e-71ba-2897-05cbfbfd2604")
public static final String FIELDNAME_CompanyAgent_LastContact="ea8ec648-c90e-71ba-2897-05cbfbfd2604";

@XendraTrl(Identifier="d46dcd77-d255-8425-ccda-60ff83afa570")
public static String es_PE_COLUMN_LastContact_Name="Último Contacto";

@XendraColumn(AD_Element_ID="c5f17fef-05a3-af26-432c-d3abb4baf9ce",ColumnName="LastContact",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d46dcd77-d255-8425-ccda-60ff83afa570",
Synchronized="2019-08-30 22:20:47.0")
/** Column name LastContact */
public static final String COLUMNNAME_LastContact = "LastContact";
/** Set Last Result.
@param LastResult Result of last contact */
public void setLastResult (String LastResult)
{
if (LastResult != null && LastResult.length() > 255)
{
log.warning("Length > 255 - truncated");
LastResult = LastResult.substring(0,254);
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
@XendraTrl(Identifier="a041364d-ab2c-4535-224b-9e065856cab7")
public static String es_PE_FIELD_UserContact_LastResult_Name="Resultado Final";

@XendraTrl(Identifier="a041364d-ab2c-4535-224b-9e065856cab7")
public static String es_PE_FIELD_UserContact_LastResult_Description="Resultado del último contacto";

@XendraTrl(Identifier="a041364d-ab2c-4535-224b-9e065856cab7")
public static String es_PE_FIELD_UserContact_LastResult_Help="El Último resultado identifica el resultado del último contacto hecho.";

@XendraField(AD_Column_ID="LastResult",IsCentrallyMaintained=true,
AD_Tab_ID="ecdc18c1-5823-d6b1-de56-01074475b931",AD_FieldGroup_ID="External",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=300,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a041364d-ab2c-4535-224b-9e065856cab7")
public static final String FIELDNAME_UserContact_LastResult="a041364d-ab2c-4535-224b-9e065856cab7";

@XendraTrl(Identifier="d7ac0d39-5aaa-24c4-49f4-ab1bc13c8ef8")
public static String es_PE_FIELD_User_LastResult_Name="Resultado Final";

@XendraTrl(Identifier="d7ac0d39-5aaa-24c4-49f4-ab1bc13c8ef8")
public static String es_PE_FIELD_User_LastResult_Description="Resultado del último contacto";

@XendraTrl(Identifier="d7ac0d39-5aaa-24c4-49f4-ab1bc13c8ef8")
public static String es_PE_FIELD_User_LastResult_Help="El Último resultado identifica el resultado del último contacto hecho.";

@XendraField(AD_Column_ID="LastResult",IsCentrallyMaintained=true,
AD_Tab_ID="cca304e4-17f2-1849-76c1-8fa0813b5951",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=true,SeqNo=230,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d7ac0d39-5aaa-24c4-49f4-ab1bc13c8ef8")
public static final String FIELDNAME_User_LastResult="d7ac0d39-5aaa-24c4-49f4-ab1bc13c8ef8";

@XendraTrl(Identifier="17c8aa85-797b-722c-cafe-9a222fecc74e")
public static String es_PE_FIELD_CompanyAgent_LastResult_Name="Resultado Final";

@XendraTrl(Identifier="17c8aa85-797b-722c-cafe-9a222fecc74e")
public static String es_PE_FIELD_CompanyAgent_LastResult_Description="Resultado del último contacto";

@XendraTrl(Identifier="17c8aa85-797b-722c-cafe-9a222fecc74e")
public static String es_PE_FIELD_CompanyAgent_LastResult_Help="El Último resultado identifica el resultado del último contacto hecho.";

@XendraField(AD_Column_ID="LastResult",IsCentrallyMaintained=true,
AD_Tab_ID="508b449f-672d-0e92-5d32-f9e3419fd6c6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="17c8aa85-797b-722c-cafe-9a222fecc74e")
public static final String FIELDNAME_CompanyAgent_LastResult="17c8aa85-797b-722c-cafe-9a222fecc74e";

@XendraTrl(Identifier="b7a0881e-5a2d-501b-54d3-fc6a3a82c9c3")
public static String es_PE_COLUMN_LastResult_Name="Resultado Final";

@XendraColumn(AD_Element_ID="fc0abc92-dbad-97a1-2c92-beb692f0e911",ColumnName="LastResult",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b7a0881e-5a2d-501b-54d3-fc6a3a82c9c3",
Synchronized="2019-08-30 22:20:47.0")
/** Column name LastResult */
public static final String COLUMNNAME_LastResult = "LastResult";
/** Set LDAP User Name.
@param LDAPUser User Name used for authorization via LDAP (directory) services */
public void setLDAPUser (String LDAPUser)
{
if (LDAPUser != null && LDAPUser.length() > 60)
{
log.warning("Length > 60 - truncated");
LDAPUser = LDAPUser.substring(0,59);
}
set_Value (COLUMNNAME_LDAPUser, LDAPUser);
}
/** Get LDAP User Name.
@return User Name used for authorization via LDAP (directory) services */
public String getLDAPUser() 
{
String value = (String)get_Value(COLUMNNAME_LDAPUser);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="595e2d33-df7b-4a71-3d31-f41637ea3cf4")
public static String es_PE_FIELD_UserContact_LDAPUserName_Name="Autorización vía LDAP";

@XendraTrl(Identifier="595e2d33-df7b-4a71-3d31-f41637ea3cf4")
public static String es_PE_FIELD_UserContact_LDAPUserName_Description="Autorización vía LDAP (directorio) servicios";

@XendraTrl(Identifier="595e2d33-df7b-4a71-3d31-f41637ea3cf4")
public static String es_PE_FIELD_UserContact_LDAPUserName_Help="Autorizan al usuario vía LDAP. Si la autorización de LDAP no puede ser obtenida, se rechaza el acceso - la contraseña no hace caso para el acceso local.";

@XendraField(AD_Column_ID="LDAPUser",IsCentrallyMaintained=true,
AD_Tab_ID="ecdc18c1-5823-d6b1-de56-01074475b931",AD_FieldGroup_ID="Internal",IsDisplayed=true,
DisplayLogic="",DisplayLength=25,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="595e2d33-df7b-4a71-3d31-f41637ea3cf4")
public static final String FIELDNAME_UserContact_LDAPUserName="595e2d33-df7b-4a71-3d31-f41637ea3cf4";

@XendraTrl(Identifier="03e95c90-db4d-fed3-34da-41102d7d0f6a")
public static String es_PE_FIELD_User_LDAPUserName_Name="Autorización vía LDAP";

@XendraTrl(Identifier="03e95c90-db4d-fed3-34da-41102d7d0f6a")
public static String es_PE_FIELD_User_LDAPUserName_Description="Autorización vía LDAP (directorio) servicios";

@XendraTrl(Identifier="03e95c90-db4d-fed3-34da-41102d7d0f6a")
public static String es_PE_FIELD_User_LDAPUserName_Help="Autorizan al usuario vía LDAP. Si la autorización de LDAP no puede ser obtenida, se rechaza el acceso - la contraseña no hace caso para el acceso local.";

@XendraField(AD_Column_ID="LDAPUser",IsCentrallyMaintained=true,
AD_Tab_ID="cca304e4-17f2-1849-76c1-8fa0813b5951",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="03e95c90-db4d-fed3-34da-41102d7d0f6a")
public static final String FIELDNAME_User_LDAPUserName="03e95c90-db4d-fed3-34da-41102d7d0f6a";

@XendraTrl(Identifier="b19170cf-a260-7203-3f6a-42b9f3906faa")
public static String es_PE_FIELD_CompanyAgent_LDAPUserName_Name="Autorización vía LDAP";

@XendraTrl(Identifier="b19170cf-a260-7203-3f6a-42b9f3906faa")
public static String es_PE_FIELD_CompanyAgent_LDAPUserName_Description="Autorización vía LDAP (directorio) servicios";

@XendraTrl(Identifier="b19170cf-a260-7203-3f6a-42b9f3906faa")
public static String es_PE_FIELD_CompanyAgent_LDAPUserName_Help="Autorizan al usuario vía LDAP. Si la autorización de LDAP no puede ser obtenida, se rechaza el acceso - la contraseña no hace caso para el acceso local.";

@XendraField(AD_Column_ID="LDAPUser",IsCentrallyMaintained=true,
AD_Tab_ID="508b449f-672d-0e92-5d32-f9e3419fd6c6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b19170cf-a260-7203-3f6a-42b9f3906faa")
public static final String FIELDNAME_CompanyAgent_LDAPUserName="b19170cf-a260-7203-3f6a-42b9f3906faa";

@XendraTrl(Identifier="1af30aec-f1e3-dafb-a9a0-fe8b08230439")
public static String es_PE_COLUMN_LDAPUser_Name="Autorización vía LDAP";

@XendraColumn(AD_Element_ID="44d4e5e5-7be9-5f75-57f8-c5e3bf572c69",ColumnName="LDAPUser",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1af30aec-f1e3-dafb-a9a0-fe8b08230439",
Synchronized="2019-08-30 22:20:47.0")
/** Column name LDAPUser */
public static final String COLUMNNAME_LDAPUser = "LDAPUser";
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

@XendraTrl(Identifier="9a1e4300-4a39-ac48-0d63-e70a445fb55a")
public static String es_PE_FIELD_UserContact_Name_Name="Nombre";

@XendraTrl(Identifier="9a1e4300-4a39-ac48-0d63-e70a445fb55a")
public static String es_PE_FIELD_UserContact_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="9a1e4300-4a39-ac48-0d63-e70a445fb55a")
public static String es_PE_FIELD_UserContact_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="ecdc18c1-5823-d6b1-de56-01074475b931",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9a1e4300-4a39-ac48-0d63-e70a445fb55a")
public static final String FIELDNAME_UserContact_Name="9a1e4300-4a39-ac48-0d63-e70a445fb55a";

@XendraTrl(Identifier="c00c48fb-7f97-0271-c6eb-53134b3be376")
public static String es_PE_FIELD_User_Name_Name="Nombre";

@XendraTrl(Identifier="c00c48fb-7f97-0271-c6eb-53134b3be376")
public static String es_PE_FIELD_User_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="c00c48fb-7f97-0271-c6eb-53134b3be376")
public static String es_PE_FIELD_User_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="cca304e4-17f2-1849-76c1-8fa0813b5951",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c00c48fb-7f97-0271-c6eb-53134b3be376")
public static final String FIELDNAME_User_Name="c00c48fb-7f97-0271-c6eb-53134b3be376";

@XendraTrl(Identifier="2b90ebd1-dc8b-bfa6-43e5-d05d0a50406f")
public static String es_PE_FIELD_CompanyAgent_Name_Name="Nombre";

@XendraTrl(Identifier="2b90ebd1-dc8b-bfa6-43e5-d05d0a50406f")
public static String es_PE_FIELD_CompanyAgent_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="2b90ebd1-dc8b-bfa6-43e5-d05d0a50406f")
public static String es_PE_FIELD_CompanyAgent_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="508b449f-672d-0e92-5d32-f9e3419fd6c6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2b90ebd1-dc8b-bfa6-43e5-d05d0a50406f")
public static final String FIELDNAME_CompanyAgent_Name="2b90ebd1-dc8b-bfa6-43e5-d05d0a50406f";

@XendraTrl(Identifier="f4bb956b-eadd-bf79-6a58-c32c6ed92270")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f4bb956b-eadd-bf79-6a58-c32c6ed92270",
Synchronized="2019-08-30 22:20:47.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Notification Type.
@param NotificationType Type of Notifications */
public void setNotificationType (String NotificationType)
{
if (NotificationType.length() > 1)
{
log.warning("Length > 1 - truncated");
NotificationType = NotificationType.substring(0,0);
}
set_Value (COLUMNNAME_NotificationType, NotificationType);
}
/** Get Notification Type.
@return Type of Notifications */
public String getNotificationType() 
{
return (String)get_Value(COLUMNNAME_NotificationType);
}

@XendraTrl(Identifier="61c34af5-c120-5cda-9290-44abbcf2a2ed")
public static String es_PE_FIELD_UserContact_NotificationType_Name="Tipo de Notificación";

@XendraTrl(Identifier="61c34af5-c120-5cda-9290-44abbcf2a2ed")
public static String es_PE_FIELD_UserContact_NotificationType_Description="Tipo de Notificación";

@XendraTrl(Identifier="61c34af5-c120-5cda-9290-44abbcf2a2ed")
public static String es_PE_FIELD_UserContact_NotificationType_Help="Correos ó notificaciones enviados para actualización de solicitudes, etc.";

@XendraField(AD_Column_ID="NotificationType",IsCentrallyMaintained=true,
AD_Tab_ID="ecdc18c1-5823-d6b1-de56-01074475b931",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="61c34af5-c120-5cda-9290-44abbcf2a2ed")
public static final String FIELDNAME_UserContact_NotificationType="61c34af5-c120-5cda-9290-44abbcf2a2ed";

@XendraTrl(Identifier="acbd7633-5208-83b8-af96-03e7eb99152d")
public static String es_PE_FIELD_User_NotificationType_Name="Tipo de Notificación";

@XendraTrl(Identifier="acbd7633-5208-83b8-af96-03e7eb99152d")
public static String es_PE_FIELD_User_NotificationType_Description="Tipo de Notificación";

@XendraTrl(Identifier="acbd7633-5208-83b8-af96-03e7eb99152d")
public static String es_PE_FIELD_User_NotificationType_Help="Correos ó notificaciones enviados para actualización de solicitudes, etc.";

@XendraField(AD_Column_ID="NotificationType",IsCentrallyMaintained=true,
AD_Tab_ID="cca304e4-17f2-1849-76c1-8fa0813b5951",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="acbd7633-5208-83b8-af96-03e7eb99152d")
public static final String FIELDNAME_User_NotificationType="acbd7633-5208-83b8-af96-03e7eb99152d";

@XendraTrl(Identifier="3270460d-89fd-f467-b703-c29d17cb2633")
public static String es_PE_FIELD_CompanyAgent_NotificationType_Name="Tipo de Notificación";

@XendraTrl(Identifier="3270460d-89fd-f467-b703-c29d17cb2633")
public static String es_PE_FIELD_CompanyAgent_NotificationType_Description="Tipo de Notificación";

@XendraTrl(Identifier="3270460d-89fd-f467-b703-c29d17cb2633")
public static String es_PE_FIELD_CompanyAgent_NotificationType_Help="Correos ó notificaciones enviados para actualización de solicitudes, etc.";

@XendraField(AD_Column_ID="NotificationType",IsCentrallyMaintained=true,
AD_Tab_ID="508b449f-672d-0e92-5d32-f9e3419fd6c6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3270460d-89fd-f467-b703-c29d17cb2633")
public static final String FIELDNAME_CompanyAgent_NotificationType="3270460d-89fd-f467-b703-c29d17cb2633";

@XendraTrl(Identifier="1cb872a7-57bd-f4fa-c87d-b25fb8e5cc57")
public static String es_PE_COLUMN_NotificationType_Name="Tipo de Notificación";

@XendraColumn(AD_Element_ID="386b1cc3-9f83-6d35-1ac5-8b5d2418e018",ColumnName="NotificationType",
AD_Reference_ID=17,AD_Reference_Value_ID="a13bfa6b-9138-33c1-bd05-b4d49253c429",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="E",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="1cb872a7-57bd-f4fa-c87d-b25fb8e5cc57",Synchronized="2019-08-30 22:20:47.0")
/** Column name NotificationType */
public static final String COLUMNNAME_NotificationType = "NotificationType";
/** Set Password.
@param Password Password of any length (case sensitive) */
public void setPassword (String Password)
{
if (Password != null && Password.length() > 40)
{
log.warning("Length > 40 - truncated");
Password = Password.substring(0,39);
}
set_ValueE (COLUMNNAME_Password, Password);
}
/** Get Password.
@return Password of any length (case sensitive) */
public String getPassword() 
{
String value = (String)get_ValueE(COLUMNNAME_Password);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="98604108-c8e3-0aae-ee23-75008babaa92")
public static String es_PE_FIELD_UserContact_Password_Name="Contraseña";

@XendraTrl(Identifier="98604108-c8e3-0aae-ee23-75008babaa92")
public static String es_PE_FIELD_UserContact_Password_Description="Contraseña de cualquier longitud (Sensible a mayúsculas y minúsculas)";

@XendraTrl(Identifier="98604108-c8e3-0aae-ee23-75008babaa92")
public static String es_PE_FIELD_UserContact_Password_Help="La contraseña indica la contraseña para esta ID de usuario. Las contraseñas se requieren para identificar usuarios autorizados";

@XendraField(AD_Column_ID="Password",IsCentrallyMaintained=true,
AD_Tab_ID="ecdc18c1-5823-d6b1-de56-01074475b931",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="98604108-c8e3-0aae-ee23-75008babaa92")
public static final String FIELDNAME_UserContact_Password="98604108-c8e3-0aae-ee23-75008babaa92";

@XendraTrl(Identifier="a2366bee-ded0-bc38-165c-3a85f4a8a78c")
public static String es_PE_FIELD_User_Password_Name="Contraseña";

@XendraTrl(Identifier="a2366bee-ded0-bc38-165c-3a85f4a8a78c")
public static String es_PE_FIELD_User_Password_Description="Contraseña de cualquier longitud (Sensible a mayúsculas y minúsculas)";

@XendraTrl(Identifier="a2366bee-ded0-bc38-165c-3a85f4a8a78c")
public static String es_PE_FIELD_User_Password_Help="La contraseña indica la contraseña para esta ID de usuario. Las contraseñas se requieren para identificar usuarios autorizados";

@XendraField(AD_Column_ID="Password",IsCentrallyMaintained=true,
AD_Tab_ID="cca304e4-17f2-1849-76c1-8fa0813b5951",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a2366bee-ded0-bc38-165c-3a85f4a8a78c")
public static final String FIELDNAME_User_Password="a2366bee-ded0-bc38-165c-3a85f4a8a78c";

@XendraTrl(Identifier="4c73e83f-0a5f-29bc-4cfb-91464410b17f")
public static String es_PE_FIELD_CompanyAgent_Password_Name="Contraseña";

@XendraTrl(Identifier="4c73e83f-0a5f-29bc-4cfb-91464410b17f")
public static String es_PE_FIELD_CompanyAgent_Password_Description="Contraseña de cualquier longitud (Sensible a mayúsculas y minúsculas)";

@XendraTrl(Identifier="4c73e83f-0a5f-29bc-4cfb-91464410b17f")
public static String es_PE_FIELD_CompanyAgent_Password_Help="La contraseña indica la contraseña para esta ID de usuario. Las contraseñas se requieren para identificar usuarios autorizados";

@XendraField(AD_Column_ID="Password",IsCentrallyMaintained=true,
AD_Tab_ID="508b449f-672d-0e92-5d32-f9e3419fd6c6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4c73e83f-0a5f-29bc-4cfb-91464410b17f")
public static final String FIELDNAME_CompanyAgent_Password="4c73e83f-0a5f-29bc-4cfb-91464410b17f";

@XendraTrl(Identifier="1de1bb2c-0328-eaf3-bb95-7c38ab5c0986")
public static String es_PE_COLUMN_Password_Name="Contraseña";

@XendraColumn(AD_Element_ID="cd8ab187-f65c-a732-8e67-8675630874c3",ColumnName="Password",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1de1bb2c-0328-eaf3-bb95-7c38ab5c0986",
Synchronized="2019-08-30 22:20:47.0")
/** Column name Password */
public static final String COLUMNNAME_Password = "Password";
/** Set Phone.
@param Phone Identifies a telephone number */
public void setPhone (String Phone)
{
if (Phone != null && Phone.length() > 40)
{
log.warning("Length > 40 - truncated");
Phone = Phone.substring(0,39);
}
set_Value (COLUMNNAME_Phone, Phone);
}
/** Get Phone.
@return Identifies a telephone number */
public String getPhone() 
{
String value = (String)get_Value(COLUMNNAME_Phone);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="050b14bb-495a-b173-b3d9-5bee376edfdc")
public static String es_PE_FIELD_UserContact_Phone_Name="Teléfono";

@XendraTrl(Identifier="050b14bb-495a-b173-b3d9-5bee376edfdc")
public static String es_PE_FIELD_UserContact_Phone_Description="Identifica un número telefónico";

@XendraTrl(Identifier="050b14bb-495a-b173-b3d9-5bee376edfdc")
public static String es_PE_FIELD_UserContact_Phone_Help="El campo teléfono identifica un No. telefónico.";

@XendraField(AD_Column_ID="Phone",IsCentrallyMaintained=true,
AD_Tab_ID="ecdc18c1-5823-d6b1-de56-01074475b931",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="050b14bb-495a-b173-b3d9-5bee376edfdc")
public static final String FIELDNAME_UserContact_Phone="050b14bb-495a-b173-b3d9-5bee376edfdc";

@XendraTrl(Identifier="f04c9166-8be3-f7c6-8012-5769d9cfb107")
public static String es_PE_FIELD_User_Phone_Name="Teléfono";

@XendraTrl(Identifier="f04c9166-8be3-f7c6-8012-5769d9cfb107")
public static String es_PE_FIELD_User_Phone_Description="Identifica un número telefónico";

@XendraTrl(Identifier="f04c9166-8be3-f7c6-8012-5769d9cfb107")
public static String es_PE_FIELD_User_Phone_Help="El campo teléfono identifica un No. telefónico.";

@XendraField(AD_Column_ID="Phone",IsCentrallyMaintained=true,
AD_Tab_ID="cca304e4-17f2-1849-76c1-8fa0813b5951",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f04c9166-8be3-f7c6-8012-5769d9cfb107")
public static final String FIELDNAME_User_Phone="f04c9166-8be3-f7c6-8012-5769d9cfb107";

@XendraTrl(Identifier="66c721f9-93a0-fd89-0758-6085969542af")
public static String es_PE_FIELD_CompanyAgent_Phone_Name="Teléfono";

@XendraTrl(Identifier="66c721f9-93a0-fd89-0758-6085969542af")
public static String es_PE_FIELD_CompanyAgent_Phone_Description="Identifica un número telefónico";

@XendraTrl(Identifier="66c721f9-93a0-fd89-0758-6085969542af")
public static String es_PE_FIELD_CompanyAgent_Phone_Help="El campo teléfono identifica un No. telefónico.";

@XendraField(AD_Column_ID="Phone",IsCentrallyMaintained=true,
AD_Tab_ID="508b449f-672d-0e92-5d32-f9e3419fd6c6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="66c721f9-93a0-fd89-0758-6085969542af")
public static final String FIELDNAME_CompanyAgent_Phone="66c721f9-93a0-fd89-0758-6085969542af";

@XendraTrl(Identifier="64732af2-9d5a-4f51-eb46-8da9be440753")
public static String es_PE_COLUMN_Phone_Name="Teléfono";

@XendraColumn(AD_Element_ID="4842df23-a82d-d921-7e1e-5869844caceb",ColumnName="Phone",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="64732af2-9d5a-4f51-eb46-8da9be440753",
Synchronized="2019-08-30 22:20:47.0")
/** Column name Phone */
public static final String COLUMNNAME_Phone = "Phone";
/** Set 2nd Phone.
@param Phone2 Identifies an alternate telephone number. */
public void setPhone2 (String Phone2)
{
if (Phone2 != null && Phone2.length() > 40)
{
log.warning("Length > 40 - truncated");
Phone2 = Phone2.substring(0,39);
}
set_Value (COLUMNNAME_Phone2, Phone2);
}
/** Get 2nd Phone.
@return Identifies an alternate telephone number. */
public String getPhone2() 
{
String value = (String)get_Value(COLUMNNAME_Phone2);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="ad5be480-9d8d-d15d-2305-ccaa1e46f730")
public static String es_PE_FIELD_UserContact_2ndPhone_Name="Teléfono 2";

@XendraTrl(Identifier="ad5be480-9d8d-d15d-2305-ccaa1e46f730")
public static String es_PE_FIELD_UserContact_2ndPhone_Description="Identifica un número telefónico alterno";

@XendraTrl(Identifier="ad5be480-9d8d-d15d-2305-ccaa1e46f730")
public static String es_PE_FIELD_UserContact_2ndPhone_Help="El campo teléfono 2 identifica un número telefónico alterno.";

@XendraField(AD_Column_ID="Phone2",IsCentrallyMaintained=true,
AD_Tab_ID="ecdc18c1-5823-d6b1-de56-01074475b931",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ad5be480-9d8d-d15d-2305-ccaa1e46f730")
public static final String FIELDNAME_UserContact_2ndPhone="ad5be480-9d8d-d15d-2305-ccaa1e46f730";

@XendraTrl(Identifier="9f72d9dc-69f1-9fe0-b96d-ef91f95d219d")
public static String es_PE_FIELD_User_2ndPhone_Name="Teléfono 2";

@XendraTrl(Identifier="9f72d9dc-69f1-9fe0-b96d-ef91f95d219d")
public static String es_PE_FIELD_User_2ndPhone_Description="Identifica un número telefónico alterno";

@XendraTrl(Identifier="9f72d9dc-69f1-9fe0-b96d-ef91f95d219d")
public static String es_PE_FIELD_User_2ndPhone_Help="El campo teléfono 2 identifica un número telefónico alterno.";

@XendraField(AD_Column_ID="Phone2",IsCentrallyMaintained=true,
AD_Tab_ID="cca304e4-17f2-1849-76c1-8fa0813b5951",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9f72d9dc-69f1-9fe0-b96d-ef91f95d219d")
public static final String FIELDNAME_User_2ndPhone="9f72d9dc-69f1-9fe0-b96d-ef91f95d219d";

@XendraTrl(Identifier="15cda84e-8105-5c2e-fe16-1890a7ce40d5")
public static String es_PE_FIELD_CompanyAgent_2ndPhone_Name="Teléfono 2";

@XendraTrl(Identifier="15cda84e-8105-5c2e-fe16-1890a7ce40d5")
public static String es_PE_FIELD_CompanyAgent_2ndPhone_Description="Identifica un número telefónico alterno";

@XendraTrl(Identifier="15cda84e-8105-5c2e-fe16-1890a7ce40d5")
public static String es_PE_FIELD_CompanyAgent_2ndPhone_Help="El campo teléfono 2 identifica un número telefónico alterno.";

@XendraField(AD_Column_ID="Phone2",IsCentrallyMaintained=true,
AD_Tab_ID="508b449f-672d-0e92-5d32-f9e3419fd6c6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="15cda84e-8105-5c2e-fe16-1890a7ce40d5")
public static final String FIELDNAME_CompanyAgent_2ndPhone="15cda84e-8105-5c2e-fe16-1890a7ce40d5";

@XendraTrl(Identifier="3f78151f-51e5-eb77-d60d-3c2940acf8f6")
public static String es_PE_COLUMN_Phone2_Name="Teléfono 2";

@XendraColumn(AD_Element_ID="619d752b-db65-e4fd-b230-313afdd72a83",ColumnName="Phone2",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3f78151f-51e5-eb77-d60d-3c2940acf8f6",
Synchronized="2019-08-30 22:20:47.0")
/** Column name Phone2 */
public static final String COLUMNNAME_Phone2 = "Phone2";
/** Set Process Now.
@param Processing Process Now */
public void setProcessing (boolean Processing)
{
set_Value (COLUMNNAME_Processing, Boolean.valueOf(Processing));
}
/** Get Process Now.
@return Process Now */
public boolean isProcessing() 
{
Object oo = get_Value(COLUMNNAME_Processing);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="d9a5e89b-da89-1811-83a0-1cabd6660dd1")
public static String es_PE_FIELD_UserContact_ProcessNow_Name="Procesar Ahora";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="ecdc18c1-5823-d6b1-de56-01074475b931",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d9a5e89b-da89-1811-83a0-1cabd6660dd1")
public static final String FIELDNAME_UserContact_ProcessNow="d9a5e89b-da89-1811-83a0-1cabd6660dd1";

@XendraTrl(Identifier="7ca7cf72-fe83-0edd-7ba0-aba0bb8a401a")
public static String es_PE_FIELD_User_ProcessNow_Name="Procesar Ahora";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="cca304e4-17f2-1849-76c1-8fa0813b5951",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7ca7cf72-fe83-0edd-7ba0-aba0bb8a401a")
public static final String FIELDNAME_User_ProcessNow="7ca7cf72-fe83-0edd-7ba0-aba0bb8a401a";

@XendraTrl(Identifier="d8457752-eb17-c321-866d-3c0358251340")
public static String es_PE_FIELD_CompanyAgent_ProcessNow_Name="Procesar Ahora";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="508b449f-672d-0e92-5d32-f9e3419fd6c6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d8457752-eb17-c321-866d-3c0358251340")
public static final String FIELDNAME_CompanyAgent_ProcessNow="d8457752-eb17-c321-866d-3c0358251340";

@XendraTrl(Identifier="2d42b790-dd59-c70a-ae25-64a535cae8d0")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2d42b790-dd59-c70a-ae25-64a535cae8d0",
Synchronized="2019-08-30 22:20:47.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Reply_Address.
@param Reply_Address Reply_Address */
public void setReply_Address (String Reply_Address)
{
if (Reply_Address != null && Reply_Address.length() > 100)
{
log.warning("Length > 100 - truncated");
Reply_Address = Reply_Address.substring(0,99);
}
set_Value (COLUMNNAME_Reply_Address, Reply_Address);
}
/** Get Reply_Address.
@return Reply_Address */
public String getReply_Address() 
{
String value = (String)get_Value(COLUMNNAME_Reply_Address);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="d6164b81-14c5-4148-9e4b-9fcab96b6500")
public static String es_PE_FIELD_UserContact_Reply_Address_Name="Reply_Address";

@XendraField(AD_Column_ID="Reply_Address",IsCentrallyMaintained=true,
AD_Tab_ID="ecdc18c1-5823-d6b1-de56-01074475b931",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=100,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2019-08-30 22:20:47.0",
Identifier="d6164b81-14c5-4148-9e4b-9fcab96b6500")
public static final String FIELDNAME_UserContact_Reply_Address="d6164b81-14c5-4148-9e4b-9fcab96b6500";

@XendraTrl(Identifier="62de0e06-60dd-4861-94bc-a4aa78d17267")
public static String es_PE_COLUMN_Reply_Address_Name="Reply_Address";

@XendraColumn(AD_Element_ID="c1ad4d8b-6bb4-4ead-82fc-3e87ca65b387",ColumnName="Reply_Address",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=100,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="62de0e06-60dd-4861-94bc-a4aa78d17267",
Synchronized="2019-08-30 22:20:47.0")
/** Column name Reply_Address */
public static final String COLUMNNAME_Reply_Address = "Reply_Address";
/** Set Signature.
@param Signature Signature */
public void setSignature (String Signature)
{
set_Value (COLUMNNAME_Signature, Signature);
}
/** Get Signature.
@return Signature */
public String getSignature() 
{
String value = (String)get_Value(COLUMNNAME_Signature);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="8eec6e50-ccb2-4f73-8558-a2300acd0903")
public static String es_PE_FIELD_UserContact_Signature_Name="Signature";

@XendraField(AD_Column_ID="Signature",IsCentrallyMaintained=true,
AD_Tab_ID="ecdc18c1-5823-d6b1-de56-01074475b931",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=2147483647,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2019-08-30 22:20:47.0",
Identifier="8eec6e50-ccb2-4f73-8558-a2300acd0903")
public static final String FIELDNAME_UserContact_Signature="8eec6e50-ccb2-4f73-8558-a2300acd0903";

@XendraTrl(Identifier="bd87c082-1056-480f-9e1c-01befb008bee")
public static String es_PE_COLUMN_Signature_Name="Signature";

@XendraColumn(AD_Element_ID="980443ea-14d3-4695-91bb-4aef0ce02ba8",ColumnName="Signature",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="bd87c082-1056-480f-9e1c-01befb008bee",
Synchronized="2019-08-30 22:20:47.0")
/** Column name Signature */
public static final String COLUMNNAME_Signature = "Signature";
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

@XendraTrl(Identifier="f8da6f9d-dd2e-5e7b-4f9b-edd268c2a952")
public static String es_PE_FIELD_UserContact_Supervisor_Name="Supervisor";

@XendraTrl(Identifier="f8da6f9d-dd2e-5e7b-4f9b-edd268c2a952")
public static String es_PE_FIELD_UserContact_Supervisor_Description="Supervisor para este usuario - usado para escalación";

@XendraTrl(Identifier="f8da6f9d-dd2e-5e7b-4f9b-edd268c2a952")
public static String es_PE_FIELD_UserContact_Supervisor_Help="El supervisor indica quien será usado para reenviar y escalar emisiones este usuario.";

@XendraField(AD_Column_ID="Supervisor_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ecdc18c1-5823-d6b1-de56-01074475b931",AD_FieldGroup_ID="Internal",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f8da6f9d-dd2e-5e7b-4f9b-edd268c2a952")
public static final String FIELDNAME_UserContact_Supervisor="f8da6f9d-dd2e-5e7b-4f9b-edd268c2a952";

@XendraTrl(Identifier="f0fadcbc-1050-a07d-7e19-4489b838a23b")
public static String es_PE_FIELD_User_Supervisor_Name="Supervisor";

@XendraTrl(Identifier="f0fadcbc-1050-a07d-7e19-4489b838a23b")
public static String es_PE_FIELD_User_Supervisor_Description="Supervisor para este usuario - usado para escalación";

@XendraTrl(Identifier="f0fadcbc-1050-a07d-7e19-4489b838a23b")
public static String es_PE_FIELD_User_Supervisor_Help="El supervisor indica quien será usado para reenviar y escalar emisiones este usuario.";

@XendraField(AD_Column_ID="Supervisor_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cca304e4-17f2-1849-76c1-8fa0813b5951",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f0fadcbc-1050-a07d-7e19-4489b838a23b")
public static final String FIELDNAME_User_Supervisor="f0fadcbc-1050-a07d-7e19-4489b838a23b";

@XendraTrl(Identifier="2807db6e-1c01-0df5-65c8-1f12f6198741")
public static String es_PE_FIELD_CompanyAgent_Supervisor_Name="Supervisor";

@XendraTrl(Identifier="2807db6e-1c01-0df5-65c8-1f12f6198741")
public static String es_PE_FIELD_CompanyAgent_Supervisor_Description="Supervisor para este usuario - usado para escalación";

@XendraTrl(Identifier="2807db6e-1c01-0df5-65c8-1f12f6198741")
public static String es_PE_FIELD_CompanyAgent_Supervisor_Help="El supervisor indica quien será usado para reenviar y escalar emisiones este usuario.";

@XendraField(AD_Column_ID="Supervisor_ID",IsCentrallyMaintained=true,
AD_Tab_ID="508b449f-672d-0e92-5d32-f9e3419fd6c6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2807db6e-1c01-0df5-65c8-1f12f6198741")
public static final String FIELDNAME_CompanyAgent_Supervisor="2807db6e-1c01-0df5-65c8-1f12f6198741";

@XendraTrl(Identifier="848ac078-21d2-9962-ac47-ff12d24fb4be")
public static String es_PE_COLUMN_Supervisor_ID_Name="Supervisor";

@XendraColumn(AD_Element_ID="cb6ad258-6bb2-80b2-a90f-63c4d947479b",ColumnName="Supervisor_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="606fce88-e8f3-4df6-0617-746fb6a85b2b",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="848ac078-21d2-9962-ac47-ff12d24fb4be",Synchronized="2019-08-30 22:20:47.0")
/** Column name Supervisor_ID */
public static final String COLUMNNAME_Supervisor_ID = "Supervisor_ID";
/** Set Title.
@param Title Name this entity is referred to as */
public void setTitle (String Title)
{
if (Title != null && Title.length() > 40)
{
log.warning("Length > 40 - truncated");
Title = Title.substring(0,39);
}
set_Value (COLUMNNAME_Title, Title);
}
/** Get Title.
@return Name this entity is referred to as */
public String getTitle() 
{
String value = (String)get_Value(COLUMNNAME_Title);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="e09cb825-47f5-a243-ee1b-4001e71ae1dc")
public static String es_PE_FIELD_UserContact_Title_Name="Título";

@XendraTrl(Identifier="e09cb825-47f5-a243-ee1b-4001e71ae1dc")
public static String es_PE_FIELD_UserContact_Title_Description="Nombre como se conoce esta entidad";

@XendraTrl(Identifier="e09cb825-47f5-a243-ee1b-4001e71ae1dc")
public static String es_PE_FIELD_UserContact_Title_Help="El título indica el nombre como se conoce esta entidad";

@XendraField(AD_Column_ID="Title",IsCentrallyMaintained=true,
AD_Tab_ID="ecdc18c1-5823-d6b1-de56-01074475b931",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e09cb825-47f5-a243-ee1b-4001e71ae1dc")
public static final String FIELDNAME_UserContact_Title="e09cb825-47f5-a243-ee1b-4001e71ae1dc";

@XendraTrl(Identifier="fa46452f-a616-478d-6d91-548ddfd7b17e")
public static String es_PE_FIELD_User_Title_Name="Título";

@XendraTrl(Identifier="fa46452f-a616-478d-6d91-548ddfd7b17e")
public static String es_PE_FIELD_User_Title_Description="Nombre como se conoce esta entidad";

@XendraTrl(Identifier="fa46452f-a616-478d-6d91-548ddfd7b17e")
public static String es_PE_FIELD_User_Title_Help="El título indica el nombre como se conoce esta entidad";

@XendraField(AD_Column_ID="Title",IsCentrallyMaintained=true,
AD_Tab_ID="cca304e4-17f2-1849-76c1-8fa0813b5951",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fa46452f-a616-478d-6d91-548ddfd7b17e")
public static final String FIELDNAME_User_Title="fa46452f-a616-478d-6d91-548ddfd7b17e";

@XendraTrl(Identifier="7aeda213-aa3c-1f4d-c07f-ea8d9085f9c5")
public static String es_PE_FIELD_CompanyAgent_Title_Name="Título";

@XendraTrl(Identifier="7aeda213-aa3c-1f4d-c07f-ea8d9085f9c5")
public static String es_PE_FIELD_CompanyAgent_Title_Description="Nombre como se conoce esta entidad";

@XendraTrl(Identifier="7aeda213-aa3c-1f4d-c07f-ea8d9085f9c5")
public static String es_PE_FIELD_CompanyAgent_Title_Help="El título indica el nombre como se conoce esta entidad";

@XendraField(AD_Column_ID="Title",IsCentrallyMaintained=true,
AD_Tab_ID="508b449f-672d-0e92-5d32-f9e3419fd6c6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7aeda213-aa3c-1f4d-c07f-ea8d9085f9c5")
public static final String FIELDNAME_CompanyAgent_Title="7aeda213-aa3c-1f4d-c07f-ea8d9085f9c5";

@XendraTrl(Identifier="21c2a286-425d-bcca-4b10-ffeed12976d3")
public static String es_PE_COLUMN_Title_Name="Título";

@XendraColumn(AD_Element_ID="05a7b975-a2e2-1303-e323-2e3fdda7ebd3",ColumnName="Title",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="21c2a286-425d-bcca-4b10-ffeed12976d3",
Synchronized="2019-08-30 22:20:47.0")
/** Column name Title */
public static final String COLUMNNAME_Title = "Title";
/** Set Search Key.
@param Value Search key for the record in the format required - must be unique */
public void setValue (String Value)
{
if (Value != null && Value.length() > 40)
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
@XendraTrl(Identifier="1901bc6f-594d-a927-174b-c8b2d439ebea")
public static String es_PE_FIELD_UserContact_SearchKey_Name="Search Key";

@XendraTrl(Identifier="1901bc6f-594d-a927-174b-c8b2d439ebea")
public static String es_PE_FIELD_UserContact_SearchKey_Description="Search key for the record in the format required";

@XendraTrl(Identifier="1901bc6f-594d-a927-174b-c8b2d439ebea")
public static String es_PE_FIELD_UserContact_SearchKey_Help="7 bit lower case alpha numeric - max length 8 - can be used for operating system names.";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=false,
AD_Tab_ID="ecdc18c1-5823-d6b1-de56-01074475b931",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1901bc6f-594d-a927-174b-c8b2d439ebea")
public static final String FIELDNAME_UserContact_SearchKey="1901bc6f-594d-a927-174b-c8b2d439ebea";

@XendraTrl(Identifier="3bd59d56-2ee6-6ead-e97d-f4fd372a797f")
public static String es_PE_COLUMN_Value_Name="Clave de Búsqueda";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3bd59d56-2ee6-6ead-e97d-f4fd372a797f",
Synchronized="2019-08-30 22:20:47.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
}
