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
/** Generated Model for C_Project
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_Project extends PO
{
/** Standard Constructor
@param ctx context
@param C_Project_ID id
@param trxName transaction
*/
public X_C_Project (Properties ctx, int C_Project_ID, String trxName)
{
super (ctx, C_Project_ID, trxName);
/** if (C_Project_ID == 0)
{
setC_Currency_ID (0);
setCommittedAmt (Env.ZERO);	
// 0
setCommittedQty (Env.ZERO);
setC_Project_ID (0);
setInvoicedAmt (Env.ZERO);	
// 0
setInvoicedQty (Env.ZERO);
setIsCommitCeiling (false);	
// N
setIsCommitment (false);	
// N
setIsSummary (false);	
// N
setName (null);
setPlannedAmt (Env.ZERO);	
// 0
setPlannedMarginAmt (Env.ZERO);	
// 0
setPlannedQty (Env.ZERO);
setProcessed (false);	
// N
setProjectBalanceAmt (Env.ZERO);	
// 0
setProjectLineLevel (null);	
// P
setProjInvoiceRule (null);	
// -
setValue (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_Project (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=203 */
public static int Table_ID=MTable.getTable_ID("C_Project");

@XendraTrl(Identifier="2625db45-80e5-cf62-d154-74aea56ba068")
public static String es_PE_TAB_Project_Description="Definir Proyecto";

@XendraTrl(Identifier="2625db45-80e5-cf62-d154-74aea56ba068")
public static String es_PE_TAB_Project_Help="La pestaña de proyectos es usada para definir el valor; nombre y descripción de cada proyecto. También define y hace seguimiento a los totales asignados; comprometidos y usados.";

@XendraTrl(Identifier="2625db45-80e5-cf62-d154-74aea56ba068")
public static String es_PE_TAB_Project_Name="Proyecto";
@XendraTab(Name="Project",
Description="Define Project",
Help="The Project Tab is used to define the Value, Name and Description for each project.  It also is defines the tracks the amounts assigned to, committed to and used for this project. Note that when the project Type is changed, the Phases and Tasks are re-created.",
AD_Window_ID="402bdf68-d0df-64fe-b670-0ca668710aa1",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",
AD_Process_ID="51932999-5414-1a1b-5e7d-e98a46133c13",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="2625db45-80e5-cf62-d154-74aea56ba068",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Project="2625db45-80e5-cf62-d154-74aea56ba068";

@XendraTrl(Identifier="02aad880-ede5-9625-7a02-a7cd29a37e4b")
public static String es_PE_TAB_ProjectDimension_Description="Mantener el árbol de dimensiones contables de un proyecto";

@XendraTrl(Identifier="02aad880-ede5-9625-7a02-a7cd29a37e4b")
public static String es_PE_TAB_ProjectDimension_Help="¡Observe por favor que usted no podrá crear entidades nuevas en esta ventana si usted no tiene defecto fijado para todos los valores obligatorios!";

@XendraTrl(Identifier="02aad880-ede5-9625-7a02-a7cd29a37e4b")
public static String es_PE_TAB_ProjectDimension_Name="Dimensión de Proyecto";

@XendraTab(Name="Project Dimension",Description="Maintain Project Accounting Dimension Tree",
Help="Please note that you will not be able to create new entities in this window if you have not default set for all mandatory values! ",
AD_Window_ID="6d82a0ab-8b9a-fa56-aec1-277a04b274a1",SeqNo=40,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=true,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="02aad880-ede5-9625-7a02-a7cd29a37e4b",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ProjectDimension="02aad880-ede5-9625-7a02-a7cd29a37e4b";

@XendraTrl(Identifier="6e167a11-3402-2b3f-7348-98f2a8c53e4f")
public static String es_PE_TAB_Project2_Description="Mantiene los proyectos de la orden de las ventas y las órdenes de trabajo";

@XendraTrl(Identifier="6e167a11-3402-2b3f-7348-98f2a8c53e4f")
public static String es_PE_TAB_Project2_Help="La pestaña del proyecto se utiliza para definir el valor, el nombre y la descripción para cada proyecto. También está define las pistas, cantidades asignadas, confiadas y usadas para este proyecto.";

@XendraTrl(Identifier="6e167a11-3402-2b3f-7348-98f2a8c53e4f")
public static String es_PE_TAB_Project2_Name="Proyecto (Orden)";
@XendraTab(Name="Project",
Description="Maintain Sales Order Projects and Work Orders",
Help="The Project Tab is used to define the Value, Name and Description for each project.  It also is defines the tracks the amounts assigned to, committed to and used for this project.",
AD_Window_ID="3d408be2-c806-9eca-e379-2876dfbbec6d",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",
AD_Process_ID="51932999-5414-1a1b-5e7d-e98a46133c13",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="6e167a11-3402-2b3f-7348-98f2a8c53e4f",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Project2="6e167a11-3402-2b3f-7348-98f2a8c53e4f";

@XendraTrl(Identifier="1fe43602-8362-b7af-957f-5a69e66b0931")
public static String es_PE_TABLE_C_Project_Name="Proyecto";

@XendraTable(Name="Project",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Financial Project",Help="",
TableName="C_Project",AccessLevel="3",AD_Window_ID="402bdf68-d0df-64fe-b670-0ca668710aa1",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=100,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="1fe43602-8362-b7af-957f-5a69e66b0931",Synchronized="2020-03-03 21:37:31.0")
/** TableName=C_Project */
public static final String Table_Name="C_Project";


@XendraIndex(Name="c_project_value",Identifier="132cb34c-7834-5165-54f8-532497e329be",
Column_Names="ad_client_id, value",IsUnique="true",
TableIdentifier="132cb34c-7834-5165-54f8-532497e329be",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_project_value = "132cb34c-7834-5165-54f8-532497e329be";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_Project");

protected BigDecimal accessLevel = BigDecimal.valueOf(3);
/** AccessLevel
@return 3 - Client - Org 
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
    Table_ID = MTable.getTable_ID("C_Project");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_Project[").append(get_ID()).append("]");
return sb.toString();
}
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

@XendraTrl(Identifier="84607369-8dff-95f5-61b7-ae903d8b672f")
public static String es_PE_FIELD_Project_UserContact_Name="Usuario";

@XendraTrl(Identifier="84607369-8dff-95f5-61b7-ae903d8b672f")
public static String es_PE_FIELD_Project_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="84607369-8dff-95f5-61b7-ae903d8b672f")
public static String es_PE_FIELD_Project_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2625db45-80e5-cf62-d154-74aea56ba068",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@=N",DisplayLength=14,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="84607369-8dff-95f5-61b7-ae903d8b672f")
public static final String FIELDNAME_Project_UserContact="84607369-8dff-95f5-61b7-ae903d8b672f";

@XendraTrl(Identifier="8b9588f2-84f9-6eab-c1fd-7f7f841b56c8")
public static String es_PE_FIELD_ProjectDimension_UserContact_Name="Usuario";

@XendraTrl(Identifier="8b9588f2-84f9-6eab-c1fd-7f7f841b56c8")
public static String es_PE_FIELD_ProjectDimension_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="8b9588f2-84f9-6eab-c1fd-7f7f841b56c8")
public static String es_PE_FIELD_ProjectDimension_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="02aad880-ede5-9625-7a02-a7cd29a37e4b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=300,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8b9588f2-84f9-6eab-c1fd-7f7f841b56c8")
public static final String FIELDNAME_ProjectDimension_UserContact="8b9588f2-84f9-6eab-c1fd-7f7f841b56c8";

@XendraTrl(Identifier="309c7181-6a5a-7036-f310-909b73306b28")
public static String es_PE_FIELD_Project_UserContact2_Name="Usuario";

@XendraTrl(Identifier="309c7181-6a5a-7036-f310-909b73306b28")
public static String es_PE_FIELD_Project_UserContact2_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="309c7181-6a5a-7036-f310-909b73306b28")
public static String es_PE_FIELD_Project_UserContact2_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6e167a11-3402-2b3f-7348-98f2a8c53e4f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@=N",DisplayLength=14,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="309c7181-6a5a-7036-f310-909b73306b28")
public static final String FIELDNAME_Project_UserContact2="309c7181-6a5a-7036-f310-909b73306b28";

@XendraTrl(Identifier="7f835e65-bd46-1f3b-f4e5-29fbd019719b")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="f4ac36a1-4200-1386-677e-14ac90afb4fe",
FieldLength=22,DefaultValue="-1",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="7f835e65-bd46-1f3b-f4e5-29fbd019719b",Synchronized="2019-08-30 22:22:06.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
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

@XendraTrl(Identifier="38a77a4e-f86c-a987-88b8-38cca771edeb")
public static String es_PE_FIELD_Project_BusinessPartner_Name="Socio de Negocio";

@XendraTrl(Identifier="38a77a4e-f86c-a987-88b8-38cca771edeb")
public static String es_PE_FIELD_Project_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="38a77a4e-f86c-a987-88b8-38cca771edeb")
public static String es_PE_FIELD_Project_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2625db45-80e5-cf62-d154-74aea56ba068",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@IsSummary@=N",DisplayLength=26,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="38a77a4e-f86c-a987-88b8-38cca771edeb")
public static final String FIELDNAME_Project_BusinessPartner="38a77a4e-f86c-a987-88b8-38cca771edeb";

@XendraTrl(Identifier="064f6536-7f85-c8a6-644e-efeb074ec70f")
public static String es_PE_FIELD_ProjectDimension_BusinessPartner_Name="Socio de Negocio";

@XendraTrl(Identifier="064f6536-7f85-c8a6-644e-efeb074ec70f")
public static String es_PE_FIELD_ProjectDimension_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="064f6536-7f85-c8a6-644e-efeb074ec70f")
public static String es_PE_FIELD_ProjectDimension_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="02aad880-ede5-9625-7a02-a7cd29a37e4b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="064f6536-7f85-c8a6-644e-efeb074ec70f")
public static final String FIELDNAME_ProjectDimension_BusinessPartner="064f6536-7f85-c8a6-644e-efeb074ec70f";

@XendraTrl(Identifier="988fa2f2-372d-059d-4443-25da2cfc0345")
public static String es_PE_FIELD_Project_BusinessPartner2_Name="Socio de Negocio";

@XendraTrl(Identifier="988fa2f2-372d-059d-4443-25da2cfc0345")
public static String es_PE_FIELD_Project_BusinessPartner2_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="988fa2f2-372d-059d-4443-25da2cfc0345")
public static String es_PE_FIELD_Project_BusinessPartner2_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6e167a11-3402-2b3f-7348-98f2a8c53e4f",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@IsSummary@=N",DisplayLength=26,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="988fa2f2-372d-059d-4443-25da2cfc0345")
public static final String FIELDNAME_Project_BusinessPartner2="988fa2f2-372d-059d-4443-25da2cfc0345";

@XendraTrl(Identifier="41a8941b-3301-0994-be4c-60218d53575f")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="06fdbbe9-e1c4-3ee4-4a9d-73d1a990cc42",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="41a8941b-3301-0994-be4c-60218d53575f",Synchronized="2019-08-30 22:22:06.0")
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

@XendraTrl(Identifier="1be82dcd-41f2-274d-6eb8-d04a33981bc9")
public static String es_PE_FIELD_Project_PartnerLocation_Name="Dirección del Socio del Negocio";

@XendraTrl(Identifier="1be82dcd-41f2-274d-6eb8-d04a33981bc9")
public static String es_PE_FIELD_Project_PartnerLocation_Description="Identifica la dirección para este socio de negocio";

@XendraTrl(Identifier="1be82dcd-41f2-274d-6eb8-d04a33981bc9")
public static String es_PE_FIELD_Project_PartnerLocation_Help="La dirección de un socio indica la ubicación de un socio de negocio";

@XendraField(AD_Column_ID="C_BPartner_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2625db45-80e5-cf62-d154-74aea56ba068",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@=N",DisplayLength=14,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1be82dcd-41f2-274d-6eb8-d04a33981bc9")
public static final String FIELDNAME_Project_PartnerLocation="1be82dcd-41f2-274d-6eb8-d04a33981bc9";

@XendraTrl(Identifier="5f2aae5a-f85c-36e7-f6cc-4a1c03941671")
public static String es_PE_FIELD_ProjectDimension_PartnerLocation_Name="Dirección del Socio del Negocio";

@XendraTrl(Identifier="5f2aae5a-f85c-36e7-f6cc-4a1c03941671")
public static String es_PE_FIELD_ProjectDimension_PartnerLocation_Description="Identifica la dirección para este socio de negocio";

@XendraTrl(Identifier="5f2aae5a-f85c-36e7-f6cc-4a1c03941671")
public static String es_PE_FIELD_ProjectDimension_PartnerLocation_Help="La dirección de un socio indica la ubicación de un socio de negocio";

@XendraField(AD_Column_ID="C_BPartner_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="02aad880-ede5-9625-7a02-a7cd29a37e4b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=290,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5f2aae5a-f85c-36e7-f6cc-4a1c03941671")
public static final String FIELDNAME_ProjectDimension_PartnerLocation="5f2aae5a-f85c-36e7-f6cc-4a1c03941671";

@XendraTrl(Identifier="df9d8d20-632a-c1e1-3dd9-bca355e3b8c5")
public static String es_PE_FIELD_Project_PartnerLocation2_Name="Dirección del Socio del Negocio";

@XendraTrl(Identifier="df9d8d20-632a-c1e1-3dd9-bca355e3b8c5")
public static String es_PE_FIELD_Project_PartnerLocation2_Description="Identifica la dirección para este socio de negocio";

@XendraTrl(Identifier="df9d8d20-632a-c1e1-3dd9-bca355e3b8c5")
public static String es_PE_FIELD_Project_PartnerLocation2_Help="La dirección de un socio indica la ubicación de un socio de negocio";

@XendraField(AD_Column_ID="C_BPartner_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6e167a11-3402-2b3f-7348-98f2a8c53e4f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@=N",DisplayLength=14,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="df9d8d20-632a-c1e1-3dd9-bca355e3b8c5")
public static final String FIELDNAME_Project_PartnerLocation2="df9d8d20-632a-c1e1-3dd9-bca355e3b8c5";

@XendraTrl(Identifier="5d8beb17-dced-12a5-b172-793456bdb964")
public static String es_PE_COLUMN_C_BPartner_Location_ID_Name="Dirección del Socio del Negocio";

@XendraColumn(AD_Element_ID="0dab7dc6-2832-26dc-2462-cba2d40235f2",
ColumnName="C_BPartner_Location_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",
AD_Val_Rule_ID="623d98c0-19fc-56a2-f511-8992974d3c05",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5d8beb17-dced-12a5-b172-793456bdb964",
Synchronized="2019-08-30 22:22:06.0")
/** Column name C_BPartner_Location_ID */
public static final String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";
/** Set BPartner (Agent).
@param C_BPartnerSR_ID Business Partner (Agent or Sales Rep) */
public void setC_BPartnerSR_ID (int C_BPartnerSR_ID)
{
if (C_BPartnerSR_ID <= 0) set_Value (COLUMNNAME_C_BPartnerSR_ID, null);
 else 
set_Value (COLUMNNAME_C_BPartnerSR_ID, Integer.valueOf(C_BPartnerSR_ID));
}
/** Get BPartner (Agent).
@return Business Partner (Agent or Sales Rep) */
public int getC_BPartnerSR_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartnerSR_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d9337c3c-db77-a2c9-6410-952646e04977")
public static String es_PE_FIELD_Project_BPartnerAgent_Name="SNegocio (Agente)";

@XendraTrl(Identifier="d9337c3c-db77-a2c9-6410-952646e04977")
public static String es_PE_FIELD_Project_BPartnerAgent_Description="Socio del Negocio (Agente o rep Ventas)";

@XendraField(AD_Column_ID="C_BPartnerSR_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2625db45-80e5-cf62-d154-74aea56ba068",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@=N",DisplayLength=10,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d9337c3c-db77-a2c9-6410-952646e04977")
public static final String FIELDNAME_Project_BPartnerAgent="d9337c3c-db77-a2c9-6410-952646e04977";

@XendraTrl(Identifier="1760ffee-823d-3842-1276-6e8d0837f73c")
public static String es_PE_FIELD_Project_BPartnerAgent2_Name="SNegocio (Agente)";

@XendraTrl(Identifier="1760ffee-823d-3842-1276-6e8d0837f73c")
public static String es_PE_FIELD_Project_BPartnerAgent2_Description="Socio del Negocio (Agente o rep Ventas)";

@XendraField(AD_Column_ID="C_BPartnerSR_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6e167a11-3402-2b3f-7348-98f2a8c53e4f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@=N",DisplayLength=10,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1760ffee-823d-3842-1276-6e8d0837f73c")
public static final String FIELDNAME_Project_BPartnerAgent2="1760ffee-823d-3842-1276-6e8d0837f73c";

@XendraTrl(Identifier="362a3729-76bd-3e68-6b82-ff925da2af17")
public static String es_PE_COLUMN_C_BPartnerSR_ID_Name="SNegocio (Agente)";

@XendraColumn(AD_Element_ID="38bec27d-346b-13e8-e9a6-d4668cd3fade",ColumnName="C_BPartnerSR_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="c6cc3f47-f990-9f4c-33c8-27d755ea2c25",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="362a3729-76bd-3e68-6b82-ff925da2af17",Synchronized="2019-08-30 22:22:06.0")
/** Column name C_BPartnerSR_ID */
public static final String COLUMNNAME_C_BPartnerSR_ID = "C_BPartnerSR_ID";
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

@XendraTrl(Identifier="7a26cabf-52dc-875a-f3c9-5c3e4b2b3682")
public static String es_PE_FIELD_Project_Campaign_Name="Campaña";

@XendraTrl(Identifier="7a26cabf-52dc-875a-f3c9-5c3e4b2b3682")
public static String es_PE_FIELD_Project_Campaign_Description="Campaña de Mercadeo";

@XendraTrl(Identifier="7a26cabf-52dc-875a-f3c9-5c3e4b2b3682")
public static String es_PE_FIELD_Project_Campaign_Help="La Campaña define un programa de mercadotecnia único. Los proyectos pueden estar asociados con una campaña de mercadotecnia única. Usted puede entonces reportar basado en una campaña específica";

@XendraField(AD_Column_ID="C_Campaign_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2625db45-80e5-cf62-d154-74aea56ba068",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@=N & @$Element_MC@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=220,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="7a26cabf-52dc-875a-f3c9-5c3e4b2b3682")
public static final String FIELDNAME_Project_Campaign="7a26cabf-52dc-875a-f3c9-5c3e4b2b3682";

@XendraTrl(Identifier="9940de7c-b651-8ec9-3fbf-701360828b95")
public static String es_PE_FIELD_ProjectDimension_Campaign_Name="Campaña";

@XendraTrl(Identifier="9940de7c-b651-8ec9-3fbf-701360828b95")
public static String es_PE_FIELD_ProjectDimension_Campaign_Description="Campaña de Mercadeo";

@XendraTrl(Identifier="9940de7c-b651-8ec9-3fbf-701360828b95")
public static String es_PE_FIELD_ProjectDimension_Campaign_Help="La Campaña define un programa de mercadotecnia único. Los proyectos pueden estar asociados con una campaña de mercadotecnia única. Usted puede entonces reportar basado en una campaña específica";

@XendraField(AD_Column_ID="C_Campaign_ID",IsCentrallyMaintained=true,
AD_Tab_ID="02aad880-ede5-9625-7a02-a7cd29a37e4b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9940de7c-b651-8ec9-3fbf-701360828b95")
public static final String FIELDNAME_ProjectDimension_Campaign="9940de7c-b651-8ec9-3fbf-701360828b95";

@XendraTrl(Identifier="0efa4b5d-e8f4-e82e-ad4e-f8d5815efb0c")
public static String es_PE_FIELD_Project_Campaign2_Name="Campaña";

@XendraTrl(Identifier="0efa4b5d-e8f4-e82e-ad4e-f8d5815efb0c")
public static String es_PE_FIELD_Project_Campaign2_Description="Campaña de Mercadeo";

@XendraTrl(Identifier="0efa4b5d-e8f4-e82e-ad4e-f8d5815efb0c")
public static String es_PE_FIELD_Project_Campaign2_Help="La Campaña define un programa de mercadotecnia único. Los proyectos pueden estar asociados con una campaña de mercadotecnia única. Usted puede entonces reportar basado en una campaña específica";

@XendraField(AD_Column_ID="C_Campaign_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6e167a11-3402-2b3f-7348-98f2a8c53e4f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@=N & @$Element_MC@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=210,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="0efa4b5d-e8f4-e82e-ad4e-f8d5815efb0c")
public static final String FIELDNAME_Project_Campaign2="0efa4b5d-e8f4-e82e-ad4e-f8d5815efb0c";

@XendraTrl(Identifier="05973565-55fc-5b49-a20a-de96b8072370")
public static String es_PE_COLUMN_C_Campaign_ID_Name="Campaña";

@XendraColumn(AD_Element_ID="6cf08e31-d355-ee38-9c0b-bee20b3ea5b6",ColumnName="C_Campaign_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="05973565-55fc-5b49-a20a-de96b8072370",
Synchronized="2019-08-30 22:22:06.0")
/** Column name C_Campaign_ID */
public static final String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
/** Set Currency.
@param C_Currency_ID The Currency for this record */
public void setC_Currency_ID (int C_Currency_ID)
{
if (C_Currency_ID < 1) throw new IllegalArgumentException ("C_Currency_ID is mandatory.");
set_Value (COLUMNNAME_C_Currency_ID, Integer.valueOf(C_Currency_ID));
}
/** Get Currency.
@return The Currency for this record */
public int getC_Currency_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Currency_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c6db8b1d-3360-521c-f98d-58f1e0c0a70e")
public static String es_PE_FIELD_Project_Currency_Name="Moneda";

@XendraTrl(Identifier="c6db8b1d-3360-521c-f98d-58f1e0c0a70e")
public static String es_PE_FIELD_Project_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="c6db8b1d-3360-521c-f98d-58f1e0c0a70e")
public static String es_PE_FIELD_Project_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2625db45-80e5-cf62-d154-74aea56ba068",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@=N",DisplayLength=14,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c6db8b1d-3360-521c-f98d-58f1e0c0a70e")
public static final String FIELDNAME_Project_Currency="c6db8b1d-3360-521c-f98d-58f1e0c0a70e";

@XendraTrl(Identifier="5c0992ae-acec-088b-100f-41921ced1583")
public static String es_PE_FIELD_ProjectDimension_Currency_Name="Moneda";

@XendraTrl(Identifier="5c0992ae-acec-088b-100f-41921ced1583")
public static String es_PE_FIELD_ProjectDimension_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="5c0992ae-acec-088b-100f-41921ced1583")
public static String es_PE_FIELD_ProjectDimension_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="02aad880-ede5-9625-7a02-a7cd29a37e4b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=20,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5c0992ae-acec-088b-100f-41921ced1583")
public static final String FIELDNAME_ProjectDimension_Currency="5c0992ae-acec-088b-100f-41921ced1583";

@XendraTrl(Identifier="84cafa78-7e29-57b9-4b57-355b2233667b")
public static String es_PE_FIELD_Project_Currency2_Name="Moneda";

@XendraTrl(Identifier="84cafa78-7e29-57b9-4b57-355b2233667b")
public static String es_PE_FIELD_Project_Currency2_Description="Moneda para este registro";

@XendraTrl(Identifier="84cafa78-7e29-57b9-4b57-355b2233667b")
public static String es_PE_FIELD_Project_Currency2_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6e167a11-3402-2b3f-7348-98f2a8c53e4f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@=N",DisplayLength=14,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="84cafa78-7e29-57b9-4b57-355b2233667b")
public static final String FIELDNAME_Project_Currency2="84cafa78-7e29-57b9-4b57-355b2233667b";

@XendraTrl(Identifier="7aae9dd0-1466-f832-22cb-5f6b8b896527")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,
ReadOnlyLogic="@M_PriceList_Version_ID@!0",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="7aae9dd0-1466-f832-22cb-5f6b8b896527",Synchronized="2019-08-30 22:22:06.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
/** Set Committed Amount.
@param CommittedAmt The (legal) commitment amount */
public void setCommittedAmt (BigDecimal CommittedAmt)
{
if (CommittedAmt == null) throw new IllegalArgumentException ("CommittedAmt is mandatory.");
set_Value (COLUMNNAME_CommittedAmt, CommittedAmt);
}
/** Get Committed Amount.
@return The (legal) commitment amount */
public BigDecimal getCommittedAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CommittedAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="0ea98901-4664-8707-4f0f-842c58cf66f2")
public static String es_PE_FIELD_Project_CommittedAmount_Name="Total Comprometido";

@XendraTrl(Identifier="0ea98901-4664-8707-4f0f-842c58cf66f2")
public static String es_PE_FIELD_Project_CommittedAmount_Description="Total Comprometido (legal)";

@XendraTrl(Identifier="0ea98901-4664-8707-4f0f-842c58cf66f2")
public static String es_PE_FIELD_Project_CommittedAmount_Help="El Total comprometido es independiente del total planeado, usted usaría el total planeado para su estimación realista; esta podría ser mayor ó menor que el total comprometido.";

@XendraField(AD_Column_ID="CommittedAmt",IsCentrallyMaintained=true,
AD_Tab_ID="2625db45-80e5-cf62-d154-74aea56ba068",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@=N",DisplayLength=26,IsReadOnly=false,SeqNo=290,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0ea98901-4664-8707-4f0f-842c58cf66f2")
public static final String FIELDNAME_Project_CommittedAmount="0ea98901-4664-8707-4f0f-842c58cf66f2";

@XendraTrl(Identifier="7bda3e7d-c423-75c7-1ab8-d1cb88e39916")
public static String es_PE_FIELD_ProjectDimension_CommittedAmount_Name="Total Comprometido";

@XendraTrl(Identifier="7bda3e7d-c423-75c7-1ab8-d1cb88e39916")
public static String es_PE_FIELD_ProjectDimension_CommittedAmount_Description="Total Comprometido (legal)";

@XendraTrl(Identifier="7bda3e7d-c423-75c7-1ab8-d1cb88e39916")
public static String es_PE_FIELD_ProjectDimension_CommittedAmount_Help="El Total comprometido es independiente del total planeado, usted usaría el total planeado para su estimación realista; esta podría ser mayor ó menor que el total comprometido.";

@XendraField(AD_Column_ID="CommittedAmt",IsCentrallyMaintained=true,
AD_Tab_ID="02aad880-ede5-9625-7a02-a7cd29a37e4b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7bda3e7d-c423-75c7-1ab8-d1cb88e39916")
public static final String FIELDNAME_ProjectDimension_CommittedAmount="7bda3e7d-c423-75c7-1ab8-d1cb88e39916";

@XendraTrl(Identifier="581c4c60-17fe-48e2-54ae-fedb0c75d1a5")
public static String es_PE_FIELD_Project_CommittedAmount2_Name="Total Comprometido";

@XendraTrl(Identifier="581c4c60-17fe-48e2-54ae-fedb0c75d1a5")
public static String es_PE_FIELD_Project_CommittedAmount2_Description="Total Comprometido (legal)";

@XendraTrl(Identifier="581c4c60-17fe-48e2-54ae-fedb0c75d1a5")
public static String es_PE_FIELD_Project_CommittedAmount2_Help="El Total comprometido es independiente del total planeado, usted usaría el total planeado para su estimación realista; esta podría ser mayor ó menor que el total comprometido.";

@XendraField(AD_Column_ID="CommittedAmt",IsCentrallyMaintained=true,
AD_Tab_ID="6e167a11-3402-2b3f-7348-98f2a8c53e4f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@=N",DisplayLength=26,IsReadOnly=false,SeqNo=280,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="581c4c60-17fe-48e2-54ae-fedb0c75d1a5")
public static final String FIELDNAME_Project_CommittedAmount2="581c4c60-17fe-48e2-54ae-fedb0c75d1a5";

@XendraTrl(Identifier="ce88ca58-13ef-ddb0-fa44-d5b0d22d88a1")
public static String es_PE_COLUMN_CommittedAmt_Name="Total Comprometido";

@XendraColumn(AD_Element_ID="f000c6dd-f023-d000-0be4-e67375a2a641",ColumnName="CommittedAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ce88ca58-13ef-ddb0-fa44-d5b0d22d88a1",
Synchronized="2019-08-30 22:22:06.0")
/** Column name CommittedAmt */
public static final String COLUMNNAME_CommittedAmt = "CommittedAmt";
/** Set Committed Quantity.
@param CommittedQty The (legal) commitment Quantity */
public void setCommittedQty (BigDecimal CommittedQty)
{
if (CommittedQty == null) throw new IllegalArgumentException ("CommittedQty is mandatory.");
set_Value (COLUMNNAME_CommittedQty, CommittedQty);
}
/** Get Committed Quantity.
@return The (legal) commitment Quantity */
public BigDecimal getCommittedQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CommittedQty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="229ae093-8376-aabe-6d99-0194ddf02eb8")
public static String es_PE_FIELD_Project_CommittedQuantity_Name="Cantidad Cometida";

@XendraTrl(Identifier="229ae093-8376-aabe-6d99-0194ddf02eb8")
public static String es_PE_FIELD_Project_CommittedQuantity_Description="La cantidad (legal) cometida ";

@XendraTrl(Identifier="229ae093-8376-aabe-6d99-0194ddf02eb8")
public static String es_PE_FIELD_Project_CommittedQuantity_Help="La cantidad de la comisión es independiente de la cantidad prevista. Usted utilizaría la cantidad prevista para su valoración realista, que pudierán ser más alta ó baja que la cantidad de la comisión.";

@XendraField(AD_Column_ID="CommittedQty",IsCentrallyMaintained=true,
AD_Tab_ID="2625db45-80e5-cf62-d154-74aea56ba068",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@=N",DisplayLength=26,IsReadOnly=false,SeqNo=300,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="229ae093-8376-aabe-6d99-0194ddf02eb8")
public static final String FIELDNAME_Project_CommittedQuantity="229ae093-8376-aabe-6d99-0194ddf02eb8";

@XendraTrl(Identifier="ecf59183-2dd1-9034-86f0-19b0dd63348a")
public static String es_PE_FIELD_ProjectDimension_CommittedQuantity_Name="Cantidad Cometida";

@XendraTrl(Identifier="ecf59183-2dd1-9034-86f0-19b0dd63348a")
public static String es_PE_FIELD_ProjectDimension_CommittedQuantity_Description="La cantidad (legal) cometida ";

@XendraTrl(Identifier="ecf59183-2dd1-9034-86f0-19b0dd63348a")
public static String es_PE_FIELD_ProjectDimension_CommittedQuantity_Help="La cantidad de la comisión es independiente de la cantidad prevista. Usted utilizaría la cantidad prevista para su valoración realista, que pudierán ser más alta ó baja que la cantidad de la comisión.";

@XendraField(AD_Column_ID="CommittedQty",IsCentrallyMaintained=true,
AD_Tab_ID="02aad880-ede5-9625-7a02-a7cd29a37e4b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ecf59183-2dd1-9034-86f0-19b0dd63348a")
public static final String FIELDNAME_ProjectDimension_CommittedQuantity="ecf59183-2dd1-9034-86f0-19b0dd63348a";

@XendraTrl(Identifier="0f441f79-6a4d-5553-5974-a777313701d1")
public static String es_PE_FIELD_Project_CommittedQuantity2_Name="Cantidad Cometida";

@XendraTrl(Identifier="0f441f79-6a4d-5553-5974-a777313701d1")
public static String es_PE_FIELD_Project_CommittedQuantity2_Description="La cantidad (legal) cometida ";

@XendraTrl(Identifier="0f441f79-6a4d-5553-5974-a777313701d1")
public static String es_PE_FIELD_Project_CommittedQuantity2_Help="La cantidad de la comisión es independiente de la cantidad prevista. Usted utilizaría la cantidad prevista para su valoración realista, que pudierán ser más alta ó baja que la cantidad de la comisión.";

@XendraField(AD_Column_ID="CommittedQty",IsCentrallyMaintained=true,
AD_Tab_ID="6e167a11-3402-2b3f-7348-98f2a8c53e4f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@=N",DisplayLength=26,IsReadOnly=false,SeqNo=290,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0f441f79-6a4d-5553-5974-a777313701d1")
public static final String FIELDNAME_Project_CommittedQuantity2="0f441f79-6a4d-5553-5974-a777313701d1";

@XendraTrl(Identifier="85ae6a7b-05c3-b31e-76e0-eccdc7e4f025")
public static String es_PE_COLUMN_CommittedQty_Name="Cantidad Cometida";

@XendraColumn(AD_Element_ID="ca943d4f-7852-e710-d8eb-028f698c75a5",ColumnName="CommittedQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="85ae6a7b-05c3-b31e-76e0-eccdc7e4f025",
Synchronized="2019-08-30 22:22:06.0")
/** Column name CommittedQty */
public static final String COLUMNNAME_CommittedQty = "CommittedQty";
/** Set Copy From.
@param CopyFrom Copy From Record */
public void setCopyFrom (String CopyFrom)
{
if (CopyFrom != null && CopyFrom.length() > 1)
{
log.warning("Length > 1 - truncated");
CopyFrom = CopyFrom.substring(0,0);
}
set_Value (COLUMNNAME_CopyFrom, CopyFrom);
}
/** Get Copy From.
@return Copy From Record */
public String getCopyFrom() 
{
return (String)get_Value(COLUMNNAME_CopyFrom);
}

@XendraTrl(Identifier="4edfa320-69f7-375c-7a63-d35eeda0d8fa")
public static String es_PE_FIELD_Project_CopyDetails_Name="Copiar Desde";

@XendraTrl(Identifier="4edfa320-69f7-375c-7a63-d35eeda0d8fa")
public static String es_PE_FIELD_Project_CopyDetails_Description="Copia Lineas/Fases/Tareas desde otro Proyecto";

@XendraField(AD_Column_ID="CopyFrom",IsCentrallyMaintained=true,
AD_Tab_ID="2625db45-80e5-cf62-d154-74aea56ba068",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@=N",DisplayLength=23,IsReadOnly=false,SeqNo=340,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4edfa320-69f7-375c-7a63-d35eeda0d8fa")
public static final String FIELDNAME_Project_CopyDetails="4edfa320-69f7-375c-7a63-d35eeda0d8fa";

@XendraTrl(Identifier="21db0b27-1adc-b7ab-c071-cb43d1553078")
public static String es_PE_FIELD_ProjectDimension_CopyDetails_Name="Copiar Desde";

@XendraTrl(Identifier="21db0b27-1adc-b7ab-c071-cb43d1553078")
public static String es_PE_FIELD_ProjectDimension_CopyDetails_Description="Copia Lineas/Fases/Tareas desde otro Proyecto";

@XendraField(AD_Column_ID="CopyFrom",IsCentrallyMaintained=true,
AD_Tab_ID="02aad880-ede5-9625-7a02-a7cd29a37e4b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=270,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="21db0b27-1adc-b7ab-c071-cb43d1553078")
public static final String FIELDNAME_ProjectDimension_CopyDetails="21db0b27-1adc-b7ab-c071-cb43d1553078";

@XendraTrl(Identifier="ae46c25c-864f-c304-848d-192f8dabb172")
public static String es_PE_FIELD_Project_CopyDetails2_Name="Copiar Desde";

@XendraTrl(Identifier="ae46c25c-864f-c304-848d-192f8dabb172")
public static String es_PE_FIELD_Project_CopyDetails2_Description="Copia Lineas/Fases/Tareas desde otro Proyecto";

@XendraField(AD_Column_ID="CopyFrom",IsCentrallyMaintained=true,
AD_Tab_ID="6e167a11-3402-2b3f-7348-98f2a8c53e4f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@=N",DisplayLength=23,IsReadOnly=false,SeqNo=330,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ae46c25c-864f-c304-848d-192f8dabb172")
public static final String FIELDNAME_Project_CopyDetails2="ae46c25c-864f-c304-848d-192f8dabb172";

@XendraTrl(Identifier="70aed4e6-ae0c-9bf5-a20f-339134b48641")
public static String es_PE_COLUMN_CopyFrom_Name="Copiar Desde";

@XendraColumn(AD_Element_ID="2d763fac-73d8-32e6-3aa1-e987486f2022",ColumnName="CopyFrom",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="e01dbbd1-e201-45c7-a622-f4b512d5cb38",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="70aed4e6-ae0c-9bf5-a20f-339134b48641",Synchronized="2019-08-30 22:22:06.0")
/** Column name CopyFrom */
public static final String COLUMNNAME_CopyFrom = "CopyFrom";
/** Set Payment Term.
@param C_PaymentTerm_ID The terms of Payment (timing, discount) */
public void setC_PaymentTerm_ID (int C_PaymentTerm_ID)
{
if (C_PaymentTerm_ID <= 0) set_Value (COLUMNNAME_C_PaymentTerm_ID, null);
 else 
set_Value (COLUMNNAME_C_PaymentTerm_ID, Integer.valueOf(C_PaymentTerm_ID));
}
/** Get Payment Term.
@return The terms of Payment (timing, discount) */
public int getC_PaymentTerm_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_PaymentTerm_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f1cecc98-5292-61a8-a2c4-91cf74a8da2e")
public static String es_PE_FIELD_Project_PaymentTerm_Name="Término de Pago";

@XendraTrl(Identifier="f1cecc98-5292-61a8-a2c4-91cf74a8da2e")
public static String es_PE_FIELD_Project_PaymentTerm_Description="Condiciones de pago de esta transacción";

@XendraTrl(Identifier="f1cecc98-5292-61a8-a2c4-91cf74a8da2e")
public static String es_PE_FIELD_Project_PaymentTerm_Help="Las condiciones de pago indican el método y tiempo de pago para esta transacción.";

@XendraField(AD_Column_ID="C_PaymentTerm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2625db45-80e5-cf62-d154-74aea56ba068",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@=N",DisplayLength=14,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f1cecc98-5292-61a8-a2c4-91cf74a8da2e")
public static final String FIELDNAME_Project_PaymentTerm="f1cecc98-5292-61a8-a2c4-91cf74a8da2e";

@XendraTrl(Identifier="4caa1581-5c9f-a7ea-426a-64196c06c790")
public static String es_PE_FIELD_ProjectDimension_PaymentTerm_Name="Término de Pago";

@XendraTrl(Identifier="4caa1581-5c9f-a7ea-426a-64196c06c790")
public static String es_PE_FIELD_ProjectDimension_PaymentTerm_Description="Condiciones de pago de esta transacción";

@XendraTrl(Identifier="4caa1581-5c9f-a7ea-426a-64196c06c790")
public static String es_PE_FIELD_ProjectDimension_PaymentTerm_Help="Las condiciones de pago indican el método y tiempo de pago para esta transacción.";

@XendraField(AD_Column_ID="C_PaymentTerm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="02aad880-ede5-9625-7a02-a7cd29a37e4b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4caa1581-5c9f-a7ea-426a-64196c06c790")
public static final String FIELDNAME_ProjectDimension_PaymentTerm="4caa1581-5c9f-a7ea-426a-64196c06c790";

@XendraTrl(Identifier="9d85cdfe-20dc-c4f3-7965-3b2e24a2bf1f")
public static String es_PE_FIELD_Project_PaymentTerm2_Name="Término de Pago";

@XendraTrl(Identifier="9d85cdfe-20dc-c4f3-7965-3b2e24a2bf1f")
public static String es_PE_FIELD_Project_PaymentTerm2_Description="Condiciones de pago de esta transacción";

@XendraTrl(Identifier="9d85cdfe-20dc-c4f3-7965-3b2e24a2bf1f")
public static String es_PE_FIELD_Project_PaymentTerm2_Help="Las condiciones de pago indican el método y tiempo de pago para esta transacción.";

@XendraField(AD_Column_ID="C_PaymentTerm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6e167a11-3402-2b3f-7348-98f2a8c53e4f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@=N",DisplayLength=14,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9d85cdfe-20dc-c4f3-7965-3b2e24a2bf1f")
public static final String FIELDNAME_Project_PaymentTerm2="9d85cdfe-20dc-c4f3-7965-3b2e24a2bf1f";

@XendraTrl(Identifier="3e61d9c7-8522-7d4f-2c38-1f27c28fe5a7")
public static String es_PE_COLUMN_C_PaymentTerm_ID_Name="Término de Pago";

@XendraColumn(AD_Element_ID="9b2224b8-8020-a83c-2d1e-ea35741c781a",ColumnName="C_PaymentTerm_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3e61d9c7-8522-7d4f-2c38-1f27c28fe5a7",
Synchronized="2019-08-30 22:22:06.0")
/** Column name C_PaymentTerm_ID */
public static final String COLUMNNAME_C_PaymentTerm_ID = "C_PaymentTerm_ID";
/** Set Standard Phase.
@param C_Phase_ID Standard Phase of the Project Type */
public void setC_Phase_ID (int C_Phase_ID)
{
if (C_Phase_ID <= 0) set_Value (COLUMNNAME_C_Phase_ID, null);
 else 
set_Value (COLUMNNAME_C_Phase_ID, Integer.valueOf(C_Phase_ID));
}
/** Get Standard Phase.
@return Standard Phase of the Project Type */
public int getC_Phase_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Phase_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="57b12e0b-380d-b145-e522-6943105b93ae")
public static String es_PE_FIELD_Project_StandardPhase_Name="Fase Estándar";

@XendraTrl(Identifier="57b12e0b-380d-b145-e522-6943105b93ae")
public static String es_PE_FIELD_Project_StandardPhase_Description="Fase estándar de el tipo de proyecto";

@XendraTrl(Identifier="57b12e0b-380d-b145-e522-6943105b93ae")
public static String es_PE_FIELD_Project_StandardPhase_Help="Fase del proyecto con la información estándar del funcionamiento con el trabajo estándar.";

@XendraField(AD_Column_ID="C_Phase_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2625db45-80e5-cf62-d154-74aea56ba068",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@=N",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="57b12e0b-380d-b145-e522-6943105b93ae")
public static final String FIELDNAME_Project_StandardPhase="57b12e0b-380d-b145-e522-6943105b93ae";

@XendraTrl(Identifier="9d900667-7aa7-3420-01b0-07b171b10a55")
public static String es_PE_FIELD_ProjectDimension_StandardPhase_Name="Fase Estándar";

@XendraTrl(Identifier="9d900667-7aa7-3420-01b0-07b171b10a55")
public static String es_PE_FIELD_ProjectDimension_StandardPhase_Description="Fase estándar de el tipo de proyecto";

@XendraTrl(Identifier="9d900667-7aa7-3420-01b0-07b171b10a55")
public static String es_PE_FIELD_ProjectDimension_StandardPhase_Help="Fase del proyecto con la información estándar del funcionamiento con el trabajo estándar.";

@XendraField(AD_Column_ID="C_Phase_ID",IsCentrallyMaintained=true,
AD_Tab_ID="02aad880-ede5-9625-7a02-a7cd29a37e4b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=260,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9d900667-7aa7-3420-01b0-07b171b10a55")
public static final String FIELDNAME_ProjectDimension_StandardPhase="9d900667-7aa7-3420-01b0-07b171b10a55";

@XendraTrl(Identifier="1d293a8e-55a2-2888-85b8-73dc47fa0906")
public static String es_PE_FIELD_Project_StandardPhase2_Name="Fase Estándar";

@XendraTrl(Identifier="1d293a8e-55a2-2888-85b8-73dc47fa0906")
public static String es_PE_FIELD_Project_StandardPhase2_Description="Fase estándar de el tipo de proyecto";

@XendraTrl(Identifier="1d293a8e-55a2-2888-85b8-73dc47fa0906")
public static String es_PE_FIELD_Project_StandardPhase2_Help="Fase del proyecto con la información estándar del funcionamiento con el trabajo estándar.";

@XendraField(AD_Column_ID="C_Phase_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6e167a11-3402-2b3f-7348-98f2a8c53e4f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@=N",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1d293a8e-55a2-2888-85b8-73dc47fa0906")
public static final String FIELDNAME_Project_StandardPhase2="1d293a8e-55a2-2888-85b8-73dc47fa0906";

@XendraTrl(Identifier="59a431e1-7800-aaf5-237c-9231b9c7fb2b")
public static String es_PE_COLUMN_C_Phase_ID_Name="Fase Estándar";

@XendraColumn(AD_Element_ID="3ef98f9c-ae28-3183-566b-a77d4b8d6048",ColumnName="C_Phase_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="ff0311a7-6311-e435-9673-f5c9cb82d7d9",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="59a431e1-7800-aaf5-237c-9231b9c7fb2b",Synchronized="2019-08-30 22:22:06.0")
/** Column name C_Phase_ID */
public static final String COLUMNNAME_C_Phase_ID = "C_Phase_ID";
/** Set Project.
@param C_Project_ID Financial Project */
public void setC_Project_ID (int C_Project_ID)
{
if (C_Project_ID < 1) throw new IllegalArgumentException ("C_Project_ID is mandatory.");
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

@XendraTrl(Identifier="add18736-f924-75b4-21d9-93e20d4c25e7")
public static String es_PE_FIELD_Project_Project_Name="Proyecto";

@XendraTrl(Identifier="add18736-f924-75b4-21d9-93e20d4c25e7")
public static String es_PE_FIELD_Project_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="add18736-f924-75b4-21d9-93e20d4c25e7")
public static String es_PE_FIELD_Project_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2625db45-80e5-cf62-d154-74aea56ba068",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="add18736-f924-75b4-21d9-93e20d4c25e7")
public static final String FIELDNAME_Project_Project="add18736-f924-75b4-21d9-93e20d4c25e7";

@XendraTrl(Identifier="3add35e7-3e0f-3d43-72fd-4cfd95cb0324")
public static String es_PE_FIELD_ProjectDimension_Project_Name="Proyecto";

@XendraTrl(Identifier="3add35e7-3e0f-3d43-72fd-4cfd95cb0324")
public static String es_PE_FIELD_ProjectDimension_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="3add35e7-3e0f-3d43-72fd-4cfd95cb0324")
public static String es_PE_FIELD_ProjectDimension_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="02aad880-ede5-9625-7a02-a7cd29a37e4b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3add35e7-3e0f-3d43-72fd-4cfd95cb0324")
public static final String FIELDNAME_ProjectDimension_Project="3add35e7-3e0f-3d43-72fd-4cfd95cb0324";

@XendraTrl(Identifier="fce46e3a-9ccf-73f3-1a8c-63a6f06daf56")
public static String es_PE_FIELD_Project_Project2_Name="Proyecto";

@XendraTrl(Identifier="fce46e3a-9ccf-73f3-1a8c-63a6f06daf56")
public static String es_PE_FIELD_Project_Project2_Description="Identifica un proyecto único";

@XendraTrl(Identifier="fce46e3a-9ccf-73f3-1a8c-63a6f06daf56")
public static String es_PE_FIELD_Project_Project2_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6e167a11-3402-2b3f-7348-98f2a8c53e4f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fce46e3a-9ccf-73f3-1a8c-63a6f06daf56")
public static final String FIELDNAME_Project_Project2="fce46e3a-9ccf-73f3-1a8c-63a6f06daf56";
/** Column name C_Project_ID */
public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";
/** Set Project Type.
@param C_ProjectType_ID Type of the project */
public void setC_ProjectType_ID (String C_ProjectType_ID)
{
if (C_ProjectType_ID != null && C_ProjectType_ID.length() > 22)
{
log.warning("Length > 22 - truncated");
C_ProjectType_ID = C_ProjectType_ID.substring(0,21);
}
set_Value (COLUMNNAME_C_ProjectType_ID, C_ProjectType_ID);
}
/** Get Project Type.
@return Type of the project */
public String getC_ProjectType_ID() 
{
return (String)get_Value(COLUMNNAME_C_ProjectType_ID);
}

@XendraTrl(Identifier="e4195cf7-c462-fbb0-2ac1-6395a20f1979")
public static String es_PE_FIELD_Project_SetProjectType_Name="Establece Tipo de Proyecto";

@XendraTrl(Identifier="e4195cf7-c462-fbb0-2ac1-6395a20f1979")
public static String es_PE_FIELD_Project_SetProjectType_Description="Copia Fases y Tareas de un Tipo de Proyecto en su Proyecto";

@XendraTrl(Identifier="e4195cf7-c462-fbb0-2ac1-6395a20f1979")
public static String es_PE_FIELD_Project_SetProjectType_Help="";

@XendraField(AD_Column_ID="C_ProjectType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2625db45-80e5-cf62-d154-74aea56ba068",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@=N",DisplayLength=23,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e4195cf7-c462-fbb0-2ac1-6395a20f1979")
public static final String FIELDNAME_Project_SetProjectType="e4195cf7-c462-fbb0-2ac1-6395a20f1979";

@XendraTrl(Identifier="3a351a76-205a-349d-26d4-5d7ffc4a640c")
public static String es_PE_FIELD_ProjectDimension_SetProjectType_Name="Establece Tipo de Proyecto";

@XendraTrl(Identifier="3a351a76-205a-349d-26d4-5d7ffc4a640c")
public static String es_PE_FIELD_ProjectDimension_SetProjectType_Description="Copia Fases y Tareas de un Tipo de Proyecto en su Proyecto";

@XendraTrl(Identifier="3a351a76-205a-349d-26d4-5d7ffc4a640c")
public static String es_PE_FIELD_ProjectDimension_SetProjectType_Help="";

@XendraField(AD_Column_ID="C_ProjectType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="02aad880-ede5-9625-7a02-a7cd29a37e4b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=true,SeqNo=380,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3a351a76-205a-349d-26d4-5d7ffc4a640c")
public static final String FIELDNAME_ProjectDimension_SetProjectType="3a351a76-205a-349d-26d4-5d7ffc4a640c";

@XendraTrl(Identifier="8ecfcbcb-0a6d-90d3-d6c4-0a5a6627ba48")
public static String es_PE_FIELD_Project_SetProjectType2_Name="Establece Tipo de Proyecto";

@XendraTrl(Identifier="8ecfcbcb-0a6d-90d3-d6c4-0a5a6627ba48")
public static String es_PE_FIELD_Project_SetProjectType2_Description="Copia Fases y Tareas de un Tipo de Proyecto en su Proyecto";

@XendraTrl(Identifier="8ecfcbcb-0a6d-90d3-d6c4-0a5a6627ba48")
public static String es_PE_FIELD_Project_SetProjectType2_Help="";

@XendraField(AD_Column_ID="C_ProjectType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6e167a11-3402-2b3f-7348-98f2a8c53e4f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@=N",DisplayLength=23,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8ecfcbcb-0a6d-90d3-d6c4-0a5a6627ba48")
public static final String FIELDNAME_Project_SetProjectType2="8ecfcbcb-0a6d-90d3-d6c4-0a5a6627ba48";

@XendraTrl(Identifier="1c8450ca-85fd-7832-9ae4-bcac0f4d9b57")
public static String es_PE_COLUMN_C_ProjectType_ID_Name="Tipo de Proyecto";

@XendraColumn(AD_Element_ID="f000bb9d-562b-51bf-8de1-feef472fc4a8",ColumnName="C_ProjectType_ID",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="@C_ProjectType_ID@!0",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,
AD_Process_ID="f5d53d99-7a77-cf3d-a00b-aa97c2292837",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1c8450ca-85fd-7832-9ae4-bcac0f4d9b57",
Synchronized="2019-08-30 22:22:06.0")
/** Column name C_ProjectType_ID */
public static final String COLUMNNAME_C_ProjectType_ID = "C_ProjectType_ID";
/** Set Contract Date.
@param DateContract The (planned) effective date of this document. */
public void setDateContract (Timestamp DateContract)
{
set_Value (COLUMNNAME_DateContract, DateContract);
}
/** Get Contract Date.
@return The (planned) effective date of this document. */
public Timestamp getDateContract() 
{
return (Timestamp)get_Value(COLUMNNAME_DateContract);
}

@XendraTrl(Identifier="1434140a-d083-e66d-908b-96f0ae54d37f")
public static String es_PE_FIELD_Project_ContractDate_Name="Fecha del Contrato";

@XendraTrl(Identifier="1434140a-d083-e66d-908b-96f0ae54d37f")
public static String es_PE_FIELD_Project_ContractDate_Description="La fecha efectiva (planeada) de este documento.";

@XendraTrl(Identifier="1434140a-d083-e66d-908b-96f0ae54d37f")
public static String es_PE_FIELD_Project_ContractDate_Help="La fecha del contrato se usa para determinar cuando el documento llega a ser efectivo. La fecha del contrato se usa en Informes y parámetros de Informes.";

@XendraField(AD_Column_ID="DateContract",IsCentrallyMaintained=true,
AD_Tab_ID="2625db45-80e5-cf62-d154-74aea56ba068",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@=N",DisplayLength=14,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1434140a-d083-e66d-908b-96f0ae54d37f")
public static final String FIELDNAME_Project_ContractDate="1434140a-d083-e66d-908b-96f0ae54d37f";

@XendraTrl(Identifier="f8cc108b-44c9-3f73-802a-9ffa1d50648e")
public static String es_PE_FIELD_ProjectDimension_ContractDate_Name="Fecha del Contrato";

@XendraTrl(Identifier="f8cc108b-44c9-3f73-802a-9ffa1d50648e")
public static String es_PE_FIELD_ProjectDimension_ContractDate_Description="La fecha efectiva (planeada) de este documento.";

@XendraTrl(Identifier="f8cc108b-44c9-3f73-802a-9ffa1d50648e")
public static String es_PE_FIELD_ProjectDimension_ContractDate_Help="La fecha del contrato se usa para determinar cuando el documento llega a ser efectivo. La fecha del contrato se usa en Informes y parámetros de Informes.";

@XendraField(AD_Column_ID="DateContract",IsCentrallyMaintained=true,
AD_Tab_ID="02aad880-ede5-9625-7a02-a7cd29a37e4b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f8cc108b-44c9-3f73-802a-9ffa1d50648e")
public static final String FIELDNAME_ProjectDimension_ContractDate="f8cc108b-44c9-3f73-802a-9ffa1d50648e";

@XendraTrl(Identifier="40bc4dce-bd6b-17bb-5ff0-d315e78cbde5")
public static String es_PE_FIELD_Project_ContractDate2_Name="Fecha del Contrato";

@XendraTrl(Identifier="40bc4dce-bd6b-17bb-5ff0-d315e78cbde5")
public static String es_PE_FIELD_Project_ContractDate2_Description="La fecha efectiva (planeada) de este documento.";

@XendraTrl(Identifier="40bc4dce-bd6b-17bb-5ff0-d315e78cbde5")
public static String es_PE_FIELD_Project_ContractDate2_Help="La fecha del contrato se usa para determinar cuando el documento llega a ser efectivo. La fecha del contrato se usa en Informes y parámetros de Informes.";

@XendraField(AD_Column_ID="DateContract",IsCentrallyMaintained=true,
AD_Tab_ID="6e167a11-3402-2b3f-7348-98f2a8c53e4f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@=N",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="40bc4dce-bd6b-17bb-5ff0-d315e78cbde5")
public static final String FIELDNAME_Project_ContractDate2="40bc4dce-bd6b-17bb-5ff0-d315e78cbde5";

@XendraTrl(Identifier="3fd6c53d-515d-c34b-0eb8-e2ea74aea844")
public static String es_PE_COLUMN_DateContract_Name="Fecha del Contrato";

@XendraColumn(AD_Element_ID="ce3190cf-e72c-3977-d4ee-710171d76278",ColumnName="DateContract",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3fd6c53d-515d-c34b-0eb8-e2ea74aea844",
Synchronized="2019-08-30 22:22:06.0")
/** Column name DateContract */
public static final String COLUMNNAME_DateContract = "DateContract";
/** Set Finish Date.
@param DateFinish Finish or (planned) completion date */
public void setDateFinish (Timestamp DateFinish)
{
set_Value (COLUMNNAME_DateFinish, DateFinish);
}
/** Get Finish Date.
@return Finish or (planned) completion date */
public Timestamp getDateFinish() 
{
return (Timestamp)get_Value(COLUMNNAME_DateFinish);
}

@XendraTrl(Identifier="de57af16-5360-1a96-5a39-e8f1bb440b9a")
public static String es_PE_FIELD_Project_FinishDate_Name="Fecha de Terminación";

@XendraTrl(Identifier="de57af16-5360-1a96-5a39-e8f1bb440b9a")
public static String es_PE_FIELD_Project_FinishDate_Description="Fecha de terminación (planeada)";

@XendraTrl(Identifier="de57af16-5360-1a96-5a39-e8f1bb440b9a")
public static String es_PE_FIELD_Project_FinishDate_Help="La fecha final se usa para indicar cuando se espera que el proyecto se complete ó cuando ha sido completado.";

@XendraField(AD_Column_ID="DateFinish",IsCentrallyMaintained=true,
AD_Tab_ID="2625db45-80e5-cf62-d154-74aea56ba068",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@=N",DisplayLength=14,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="de57af16-5360-1a96-5a39-e8f1bb440b9a")
public static final String FIELDNAME_Project_FinishDate="de57af16-5360-1a96-5a39-e8f1bb440b9a";

@XendraTrl(Identifier="dafb36fd-b2fd-10a2-106d-63ecc3c6557c")
public static String es_PE_FIELD_ProjectDimension_FinishDate_Name="Fecha de Terminación";

@XendraTrl(Identifier="dafb36fd-b2fd-10a2-106d-63ecc3c6557c")
public static String es_PE_FIELD_ProjectDimension_FinishDate_Description="Fecha de terminación (planeada)";

@XendraTrl(Identifier="dafb36fd-b2fd-10a2-106d-63ecc3c6557c")
public static String es_PE_FIELD_ProjectDimension_FinishDate_Help="La fecha final se usa para indicar cuando se espera que el proyecto se complete ó cuando ha sido completado.";

@XendraField(AD_Column_ID="DateFinish",IsCentrallyMaintained=true,
AD_Tab_ID="02aad880-ede5-9625-7a02-a7cd29a37e4b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dafb36fd-b2fd-10a2-106d-63ecc3c6557c")
public static final String FIELDNAME_ProjectDimension_FinishDate="dafb36fd-b2fd-10a2-106d-63ecc3c6557c";

@XendraTrl(Identifier="e9881338-9c6a-3063-2689-ac240a839a01")
public static String es_PE_FIELD_Project_FinishDate2_Name="Fecha de Terminación";

@XendraTrl(Identifier="e9881338-9c6a-3063-2689-ac240a839a01")
public static String es_PE_FIELD_Project_FinishDate2_Description="Fecha de terminación (planeada)";

@XendraTrl(Identifier="e9881338-9c6a-3063-2689-ac240a839a01")
public static String es_PE_FIELD_Project_FinishDate2_Help="La fecha final se usa para indicar cuando se espera que el proyecto se complete ó cuando ha sido completado.";

@XendraField(AD_Column_ID="DateFinish",IsCentrallyMaintained=true,
AD_Tab_ID="6e167a11-3402-2b3f-7348-98f2a8c53e4f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@=N",DisplayLength=14,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e9881338-9c6a-3063-2689-ac240a839a01")
public static final String FIELDNAME_Project_FinishDate2="e9881338-9c6a-3063-2689-ac240a839a01";

@XendraTrl(Identifier="207f53a5-ac5b-6652-4fcb-af1722e9f4c9")
public static String es_PE_COLUMN_DateFinish_Name="Fecha de Terminación";

@XendraColumn(AD_Element_ID="123012c4-c542-828c-e6d5-b2af9a985af9",ColumnName="DateFinish",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="207f53a5-ac5b-6652-4fcb-af1722e9f4c9",
Synchronized="2019-08-30 22:22:06.0")
/** Column name DateFinish */
public static final String COLUMNNAME_DateFinish = "DateFinish";
/** Set Description.
@param Description Optional short DESCRIPTION of the record */
public void setDescription (String Description)
{
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

@XendraTrl(Identifier="61415bef-0fcd-a4f0-e622-8225276f06cf")
public static String es_PE_FIELD_Project_Description_Name="Observación";

@XendraTrl(Identifier="61415bef-0fcd-a4f0-e622-8225276f06cf")
public static String es_PE_FIELD_Project_Description_Description="Observación";

@XendraTrl(Identifier="61415bef-0fcd-a4f0-e622-8225276f06cf")
public static String es_PE_FIELD_Project_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="2625db45-80e5-cf62-d154-74aea56ba068",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="61415bef-0fcd-a4f0-e622-8225276f06cf")
public static final String FIELDNAME_Project_Description="61415bef-0fcd-a4f0-e622-8225276f06cf";

@XendraTrl(Identifier="3e786f03-7b6d-6946-4573-8e41af40fd4d")
public static String es_PE_FIELD_ProjectDimension_Description_Name="Observación";

@XendraTrl(Identifier="3e786f03-7b6d-6946-4573-8e41af40fd4d")
public static String es_PE_FIELD_ProjectDimension_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="3e786f03-7b6d-6946-4573-8e41af40fd4d")
public static String es_PE_FIELD_ProjectDimension_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="02aad880-ede5-9625-7a02-a7cd29a37e4b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=350,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3e786f03-7b6d-6946-4573-8e41af40fd4d")
public static final String FIELDNAME_ProjectDimension_Description="3e786f03-7b6d-6946-4573-8e41af40fd4d";

@XendraTrl(Identifier="dd32106c-52aa-7bdb-13a9-dfb854f90490")
public static String es_PE_FIELD_Project_Description2_Name="Observación";

@XendraTrl(Identifier="dd32106c-52aa-7bdb-13a9-dfb854f90490")
public static String es_PE_FIELD_Project_Description2_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="dd32106c-52aa-7bdb-13a9-dfb854f90490")
public static String es_PE_FIELD_Project_Description2_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="6e167a11-3402-2b3f-7348-98f2a8c53e4f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dd32106c-52aa-7bdb-13a9-dfb854f90490")
public static final String FIELDNAME_Project_Description2="dd32106c-52aa-7bdb-13a9-dfb854f90490";

@XendraTrl(Identifier="2ea559a1-c1ec-47dc-5997-b595ebfed52a")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2ea559a1-c1ec-47dc-5997-b595ebfed52a",
Synchronized="2019-08-30 22:22:06.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Generate To.
@param GenerateTo Generate To */
public void setGenerateTo (String GenerateTo)
{
if (GenerateTo != null && GenerateTo.length() > 1)
{
log.warning("Length > 1 - truncated");
GenerateTo = GenerateTo.substring(0,0);
}
set_Value (COLUMNNAME_GenerateTo, GenerateTo);
}
/** Get Generate To.
@return Generate To */
public String getGenerateTo() 
{
return (String)get_Value(COLUMNNAME_GenerateTo);
}

@XendraTrl(Identifier="68b00449-e3de-59bd-02d9-009a50d8ff28")
public static String es_PE_FIELD_Project_GenerateTo_Name="Generar Orden";

@XendraTrl(Identifier="68b00449-e3de-59bd-02d9-009a50d8ff28")
public static String es_PE_FIELD_Project_GenerateTo_Description="Generar orden desde un proyecto";

@XendraTrl(Identifier="68b00449-e3de-59bd-02d9-009a50d8ff28")
public static String es_PE_FIELD_Project_GenerateTo_Help="El proceso de Generar Orden generará una nueva orden basado en el proyecto. Una lista de precios debe ser seleccionada en el proyecto. Cuando el proceso arranca una bodega debe ser seleccionada";

@XendraField(AD_Column_ID="GenerateTo",IsCentrallyMaintained=true,
AD_Tab_ID="2625db45-80e5-cf62-d154-74aea56ba068",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsSummary@=N",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="68b00449-e3de-59bd-02d9-009a50d8ff28")
public static final String FIELDNAME_Project_GenerateTo="68b00449-e3de-59bd-02d9-009a50d8ff28";

@XendraTrl(Identifier="64cec9c1-3f99-e31b-4786-5fce3fce9d61")
public static String es_PE_FIELD_ProjectDimension_GenerateTo_Name="Generar Orden";

@XendraTrl(Identifier="64cec9c1-3f99-e31b-4786-5fce3fce9d61")
public static String es_PE_FIELD_ProjectDimension_GenerateTo_Description="Generar orden desde un proyecto";

@XendraTrl(Identifier="64cec9c1-3f99-e31b-4786-5fce3fce9d61")
public static String es_PE_FIELD_ProjectDimension_GenerateTo_Help="El proceso de Generar Orden generará una nueva orden basado en el proyecto. Una lista de precios debe ser seleccionada en el proyecto. Cuando el proceso arranca una bodega debe ser seleccionada";

@XendraField(AD_Column_ID="GenerateTo",IsCentrallyMaintained=true,
AD_Tab_ID="02aad880-ede5-9625-7a02-a7cd29a37e4b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="64cec9c1-3f99-e31b-4786-5fce3fce9d61")
public static final String FIELDNAME_ProjectDimension_GenerateTo="64cec9c1-3f99-e31b-4786-5fce3fce9d61";

@XendraTrl(Identifier="0198fbd8-763f-3c20-653e-1d2d204ff6b9")
public static String es_PE_FIELD_Project_GenerateTo2_Name="Generar Orden";

@XendraTrl(Identifier="0198fbd8-763f-3c20-653e-1d2d204ff6b9")
public static String es_PE_FIELD_Project_GenerateTo2_Description="Generar orden desde un proyecto";

@XendraTrl(Identifier="0198fbd8-763f-3c20-653e-1d2d204ff6b9")
public static String es_PE_FIELD_Project_GenerateTo2_Help="El proceso de Generar Orden generará una nueva orden basado en el proyecto. Una lista de precios debe ser seleccionada en el proyecto. Cuando el proceso arranca una bodega debe ser seleccionada";

@XendraField(AD_Column_ID="GenerateTo",IsCentrallyMaintained=true,
AD_Tab_ID="6e167a11-3402-2b3f-7348-98f2a8c53e4f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@=N",DisplayLength=23,IsReadOnly=false,SeqNo=340,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0198fbd8-763f-3c20-653e-1d2d204ff6b9")
public static final String FIELDNAME_Project_GenerateTo2="0198fbd8-763f-3c20-653e-1d2d204ff6b9";

@XendraTrl(Identifier="7d60036b-33f6-de12-ca29-e64f1f43dc06")
public static String es_PE_COLUMN_GenerateTo_Name="Generar A";

@XendraColumn(AD_Element_ID="f8860663-2a02-cf9f-e651-8fe92ff99c35",ColumnName="GenerateTo",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="d8c6a6d2-e3fa-4cf0-89f6-a0b0e962f149",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="7d60036b-33f6-de12-ca29-e64f1f43dc06",Synchronized="2019-08-30 22:22:06.0")
/** Column name GenerateTo */
public static final String COLUMNNAME_GenerateTo = "GenerateTo";
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
@XendraTrl(Identifier="d427972f-bddf-4a74-9fdd-1f44bd2f4db2")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d427972f-bddf-4a74-9fdd-1f44bd2f4db2",
Synchronized="2019-08-30 22:22:06.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Invoiced Amount.
@param InvoicedAmt The amount invoiced */
public void setInvoicedAmt (BigDecimal InvoicedAmt)
{
if (InvoicedAmt == null) throw new IllegalArgumentException ("InvoicedAmt is mandatory.");
set_ValueNoCheck (COLUMNNAME_InvoicedAmt, InvoicedAmt);
}
/** Get Invoiced Amount.
@return The amount invoiced */
public BigDecimal getInvoicedAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_InvoicedAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="3021535a-8a94-9965-2d5d-ad51d924c14d")
public static String es_PE_FIELD_Project_InvoicedAmount_Name="Cuenta Facturada";

@XendraTrl(Identifier="3021535a-8a94-9965-2d5d-ad51d924c14d")
public static String es_PE_FIELD_Project_InvoicedAmount_Description="La cuenta facturada";

@XendraTrl(Identifier="3021535a-8a94-9965-2d5d-ad51d924c14d")
public static String es_PE_FIELD_Project_InvoicedAmount_Help="La cuenta facturada";

@XendraField(AD_Column_ID="InvoicedAmt",IsCentrallyMaintained=true,
AD_Tab_ID="2625db45-80e5-cf62-d154-74aea56ba068",AD_FieldGroup_ID="History",IsDisplayed=true,
DisplayLogic="@IsSummary@=N",DisplayLength=26,IsReadOnly=true,SeqNo=310,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3021535a-8a94-9965-2d5d-ad51d924c14d")
public static final String FIELDNAME_Project_InvoicedAmount="3021535a-8a94-9965-2d5d-ad51d924c14d";

@XendraTrl(Identifier="3ce7a9bf-e39c-3efe-d761-f1c321a569d6")
public static String es_PE_FIELD_ProjectDimension_InvoicedAmount_Name="Cuenta Facturada";

@XendraTrl(Identifier="3ce7a9bf-e39c-3efe-d761-f1c321a569d6")
public static String es_PE_FIELD_ProjectDimension_InvoicedAmount_Description="La cuenta facturada";

@XendraTrl(Identifier="3ce7a9bf-e39c-3efe-d761-f1c321a569d6")
public static String es_PE_FIELD_ProjectDimension_InvoicedAmount_Help="La cuenta facturada";

@XendraField(AD_Column_ID="InvoicedAmt",IsCentrallyMaintained=true,
AD_Tab_ID="02aad880-ede5-9625-7a02-a7cd29a37e4b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=280,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3ce7a9bf-e39c-3efe-d761-f1c321a569d6")
public static final String FIELDNAME_ProjectDimension_InvoicedAmount="3ce7a9bf-e39c-3efe-d761-f1c321a569d6";

@XendraTrl(Identifier="09a74e58-8f41-c62e-1b40-72db34f37249")
public static String es_PE_FIELD_Project_InvoicedAmount2_Name="Cuenta Facturada";

@XendraTrl(Identifier="09a74e58-8f41-c62e-1b40-72db34f37249")
public static String es_PE_FIELD_Project_InvoicedAmount2_Description="La cuenta facturada";

@XendraTrl(Identifier="09a74e58-8f41-c62e-1b40-72db34f37249")
public static String es_PE_FIELD_Project_InvoicedAmount2_Help="La cuenta facturada";

@XendraField(AD_Column_ID="InvoicedAmt",IsCentrallyMaintained=true,
AD_Tab_ID="6e167a11-3402-2b3f-7348-98f2a8c53e4f",AD_FieldGroup_ID="History",IsDisplayed=true,
DisplayLogic="@IsSummary@=N",DisplayLength=26,IsReadOnly=true,SeqNo=300,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="09a74e58-8f41-c62e-1b40-72db34f37249")
public static final String FIELDNAME_Project_InvoicedAmount2="09a74e58-8f41-c62e-1b40-72db34f37249";

@XendraTrl(Identifier="291f60eb-3a0c-0243-2ad6-0777e385f487")
public static String es_PE_COLUMN_InvoicedAmt_Name="Cuenta Facturada";

@XendraColumn(AD_Element_ID="e31ccacf-d322-b66d-1d03-702dced2cbb8",ColumnName="InvoicedAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="291f60eb-3a0c-0243-2ad6-0777e385f487",
Synchronized="2019-08-30 22:22:06.0")
/** Column name InvoicedAmt */
public static final String COLUMNNAME_InvoicedAmt = "InvoicedAmt";
/** Set Quantity Invoiced .
@param InvoicedQty The quantity invoiced */
public void setInvoicedQty (BigDecimal InvoicedQty)
{
if (InvoicedQty == null) throw new IllegalArgumentException ("InvoicedQty is mandatory.");
set_ValueNoCheck (COLUMNNAME_InvoicedQty, InvoicedQty);
}
/** Get Quantity Invoiced .
@return The quantity invoiced */
public BigDecimal getInvoicedQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_InvoicedQty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="99354f9f-5fa8-fdde-34ba-c26f3b1b0774")
public static String es_PE_FIELD_Project_QuantityInvoiced_Name="Cantidad Facturada";

@XendraTrl(Identifier="99354f9f-5fa8-fdde-34ba-c26f3b1b0774")
public static String es_PE_FIELD_Project_QuantityInvoiced_Description="La Cantidad Facturada";

@XendraField(AD_Column_ID="InvoicedQty",IsCentrallyMaintained=true,
AD_Tab_ID="2625db45-80e5-cf62-d154-74aea56ba068",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@=N",DisplayLength=26,IsReadOnly=true,SeqNo=320,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="99354f9f-5fa8-fdde-34ba-c26f3b1b0774")
public static final String FIELDNAME_Project_QuantityInvoiced="99354f9f-5fa8-fdde-34ba-c26f3b1b0774";

@XendraTrl(Identifier="896be5fe-554f-54ba-45ad-a829130bb388")
public static String es_PE_FIELD_ProjectDimension_QuantityInvoiced_Name="Cantidad Facturada";

@XendraTrl(Identifier="896be5fe-554f-54ba-45ad-a829130bb388")
public static String es_PE_FIELD_ProjectDimension_QuantityInvoiced_Description="La Cantidad Facturada";

@XendraField(AD_Column_ID="InvoicedQty",IsCentrallyMaintained=true,
AD_Tab_ID="02aad880-ede5-9625-7a02-a7cd29a37e4b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=250,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="896be5fe-554f-54ba-45ad-a829130bb388")
public static final String FIELDNAME_ProjectDimension_QuantityInvoiced="896be5fe-554f-54ba-45ad-a829130bb388";

@XendraTrl(Identifier="7a8a199e-3f1a-61fc-3dd7-1bb816ede935")
public static String es_PE_FIELD_Project_QuantityInvoiced2_Name="Cantidad Facturada";

@XendraTrl(Identifier="7a8a199e-3f1a-61fc-3dd7-1bb816ede935")
public static String es_PE_FIELD_Project_QuantityInvoiced2_Description="La Cantidad Facturada";

@XendraField(AD_Column_ID="InvoicedQty",IsCentrallyMaintained=true,
AD_Tab_ID="6e167a11-3402-2b3f-7348-98f2a8c53e4f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@=N",DisplayLength=26,IsReadOnly=true,SeqNo=310,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7a8a199e-3f1a-61fc-3dd7-1bb816ede935")
public static final String FIELDNAME_Project_QuantityInvoiced2="7a8a199e-3f1a-61fc-3dd7-1bb816ede935";

@XendraTrl(Identifier="d5d4bb8a-7ab7-5884-465e-b2cb59202f76")
public static String es_PE_COLUMN_InvoicedQty_Name="Cantidad Facturada";

@XendraColumn(AD_Element_ID="2b11e63f-05c2-ba1b-c83e-4ba51253ea7f",ColumnName="InvoicedQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d5d4bb8a-7ab7-5884-465e-b2cb59202f76",
Synchronized="2019-08-30 22:22:06.0")
/** Column name InvoicedQty */
public static final String COLUMNNAME_InvoicedQty = "InvoicedQty";
/** Set Commitment is Ceiling.
@param IsCommitCeiling The commitment amount/quantity is the chargeable ceiling  */
public void setIsCommitCeiling (boolean IsCommitCeiling)
{
set_Value (COLUMNNAME_IsCommitCeiling, Boolean.valueOf(IsCommitCeiling));
}
/** Get Commitment is Ceiling.
@return The commitment amount/quantity is the chargeable ceiling  */
public boolean isCommitCeiling() 
{
Object oo = get_Value(COLUMNNAME_IsCommitCeiling);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="e2baa049-e13b-3692-8f6a-db032f8cfa3c")
public static String es_PE_FIELD_Project_CommitmentIsCeiling_Name="Compromiso Límite";

@XendraTrl(Identifier="e2baa049-e13b-3692-8f6a-db032f8cfa3c")
public static String es_PE_FIELD_Project_CommitmentIsCeiling_Description="La comisión importe/cantidad es el techo cargable.";

@XendraTrl(Identifier="e2baa049-e13b-3692-8f6a-db032f8cfa3c")
public static String es_PE_FIELD_Project_CommitmentIsCeiling_Help="El importe y la cantidad de la comisión, es el importe y la cantidad máxima que se cargará. No hacer caso, si el importe ó la cantidad es cero.";

@XendraField(AD_Column_ID="IsCommitCeiling",IsCentrallyMaintained=true,
AD_Tab_ID="2625db45-80e5-cf62-d154-74aea56ba068",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsSummary@=N & @IsCommitment@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="e2baa049-e13b-3692-8f6a-db032f8cfa3c")
public static final String FIELDNAME_Project_CommitmentIsCeiling="e2baa049-e13b-3692-8f6a-db032f8cfa3c";

@XendraTrl(Identifier="9afd00e2-adea-6ebf-318c-3fd06fc2e731")
public static String es_PE_FIELD_ProjectDimension_CommitmentIsCeiling_Name="Compromiso Límite";

@XendraTrl(Identifier="9afd00e2-adea-6ebf-318c-3fd06fc2e731")
public static String es_PE_FIELD_ProjectDimension_CommitmentIsCeiling_Description="La comisión importe/cantidad es el techo cargable.";

@XendraTrl(Identifier="9afd00e2-adea-6ebf-318c-3fd06fc2e731")
public static String es_PE_FIELD_ProjectDimension_CommitmentIsCeiling_Help="El importe y la cantidad de la comisión, es el importe y la cantidad máxima que se cargará. No hacer caso, si el importe ó la cantidad es cero.";

@XendraField(AD_Column_ID="IsCommitCeiling",IsCentrallyMaintained=true,
AD_Tab_ID="02aad880-ede5-9625-7a02-a7cd29a37e4b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9afd00e2-adea-6ebf-318c-3fd06fc2e731")
public static final String FIELDNAME_ProjectDimension_CommitmentIsCeiling="9afd00e2-adea-6ebf-318c-3fd06fc2e731";

@XendraTrl(Identifier="30206fea-e838-24d1-cb5d-254aa7aab4c2")
public static String es_PE_FIELD_Project_CommitmentIsCeiling2_Name="Compromiso Límite";

@XendraTrl(Identifier="30206fea-e838-24d1-cb5d-254aa7aab4c2")
public static String es_PE_FIELD_Project_CommitmentIsCeiling2_Description="La comisión importe/cantidad es el techo cargable.";

@XendraTrl(Identifier="30206fea-e838-24d1-cb5d-254aa7aab4c2")
public static String es_PE_FIELD_Project_CommitmentIsCeiling2_Help="El importe y la cantidad de la comisión, es el importe y la cantidad máxima que se cargará. No hacer caso, si el importe ó la cantidad es cero.";

@XendraField(AD_Column_ID="IsCommitCeiling",IsCentrallyMaintained=true,
AD_Tab_ID="6e167a11-3402-2b3f-7348-98f2a8c53e4f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsSummary@=N & @IsCommitment@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="30206fea-e838-24d1-cb5d-254aa7aab4c2")
public static final String FIELDNAME_Project_CommitmentIsCeiling2="30206fea-e838-24d1-cb5d-254aa7aab4c2";

@XendraTrl(Identifier="2dba71ea-0fa0-a3b5-a293-c0dcc5f81e3d")
public static String es_PE_COLUMN_IsCommitCeiling_Name="Compromiso Límite";

@XendraColumn(AD_Element_ID="84c4bef6-505f-8908-6191-e90cf9f12db7",ColumnName="IsCommitCeiling",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2dba71ea-0fa0-a3b5-a293-c0dcc5f81e3d",
Synchronized="2019-08-30 22:22:06.0")
/** Column name IsCommitCeiling */
public static final String COLUMNNAME_IsCommitCeiling = "IsCommitCeiling";
/** Set Commitment.
@param IsCommitment Is this document a (legal) commitment? */
public void setIsCommitment (boolean IsCommitment)
{
set_Value (COLUMNNAME_IsCommitment, Boolean.valueOf(IsCommitment));
}
/** Get Commitment.
@return Is this document a (legal) commitment? */
public boolean isCommitment() 
{
Object oo = get_Value(COLUMNNAME_IsCommitment);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="fb72dc0e-c8b0-184a-97e3-e3ab26b2703b")
public static String es_PE_FIELD_Project_Commitment_Name="Compromiso";

@XendraTrl(Identifier="fb72dc0e-c8b0-184a-97e3-e3ab26b2703b")
public static String es_PE_FIELD_Project_Commitment_Description="Es éste un compromiso (legal)";

@XendraTrl(Identifier="fb72dc0e-c8b0-184a-97e3-e3ab26b2703b")
public static String es_PE_FIELD_Project_Commitment_Help="Indica compromisos, si el documento esta legalmente amarrado";

@XendraField(AD_Column_ID="IsCommitment",IsCentrallyMaintained=true,
AD_Tab_ID="2625db45-80e5-cf62-d154-74aea56ba068",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsSummary@=N",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fb72dc0e-c8b0-184a-97e3-e3ab26b2703b")
public static final String FIELDNAME_Project_Commitment="fb72dc0e-c8b0-184a-97e3-e3ab26b2703b";

@XendraTrl(Identifier="5c20ce67-62b9-f63e-0849-3d5c20572ef4")
public static String es_PE_FIELD_ProjectDimension_Commitment_Name="Compromiso";

@XendraTrl(Identifier="5c20ce67-62b9-f63e-0849-3d5c20572ef4")
public static String es_PE_FIELD_ProjectDimension_Commitment_Description="Es éste un compromiso (legal)";

@XendraTrl(Identifier="5c20ce67-62b9-f63e-0849-3d5c20572ef4")
public static String es_PE_FIELD_ProjectDimension_Commitment_Help="Indica compromisos, si el documento esta legalmente amarrado";

@XendraField(AD_Column_ID="IsCommitment",IsCentrallyMaintained=true,
AD_Tab_ID="02aad880-ede5-9625-7a02-a7cd29a37e4b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5c20ce67-62b9-f63e-0849-3d5c20572ef4")
public static final String FIELDNAME_ProjectDimension_Commitment="5c20ce67-62b9-f63e-0849-3d5c20572ef4";

@XendraTrl(Identifier="d6c79068-e952-44bd-f6db-80091c35e931")
public static String es_PE_FIELD_Project_Commitment2_Name="Compromiso";

@XendraTrl(Identifier="d6c79068-e952-44bd-f6db-80091c35e931")
public static String es_PE_FIELD_Project_Commitment2_Description="Es éste un compromiso (legal)";

@XendraTrl(Identifier="d6c79068-e952-44bd-f6db-80091c35e931")
public static String es_PE_FIELD_Project_Commitment2_Help="Indica compromisos, si el documento esta legalmente amarrado";

@XendraField(AD_Column_ID="IsCommitment",IsCentrallyMaintained=true,
AD_Tab_ID="6e167a11-3402-2b3f-7348-98f2a8c53e4f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsSummary@=N",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d6c79068-e952-44bd-f6db-80091c35e931")
public static final String FIELDNAME_Project_Commitment2="d6c79068-e952-44bd-f6db-80091c35e931";

@XendraTrl(Identifier="0dc43607-9fb7-92f6-aac2-c9d1dfe7edcb")
public static String es_PE_COLUMN_IsCommitment_Name="Compromiso";

@XendraColumn(AD_Element_ID="e0c9e636-57f7-2a34-a052-ade381b66d1b",ColumnName="IsCommitment",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0dc43607-9fb7-92f6-aac2-c9d1dfe7edcb",
Synchronized="2019-08-30 22:22:06.0")
/** Column name IsCommitment */
public static final String COLUMNNAME_IsCommitment = "IsCommitment";
/** Set Summary Level.
@param IsSummary This is a summary entity */
public void setIsSummary (boolean IsSummary)
{
set_Value (COLUMNNAME_IsSummary, Boolean.valueOf(IsSummary));
}
/** Get Summary Level.
@return This is a summary entity */
public boolean isSummary() 
{
Object oo = get_Value(COLUMNNAME_IsSummary);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="527097ff-074b-fa73-645b-2b3c0c077ac5")
public static String es_PE_FIELD_Project_SummaryLevel_Name="Entidad Acumulada";

@XendraTrl(Identifier="527097ff-074b-fa73-645b-2b3c0c077ac5")
public static String es_PE_FIELD_Project_SummaryLevel_Description="Esta es una entidad sumaria";

@XendraTrl(Identifier="527097ff-074b-fa73-645b-2b3c0c077ac5")
public static String es_PE_FIELD_Project_SummaryLevel_Help="Una entidad sumaria representa una rama en un árbol mas bien que un nodo final. Las entidades sumarias son usadas para reportar y no tienen valores propios";

@XendraField(AD_Column_ID="IsSummary",IsCentrallyMaintained=true,
AD_Tab_ID="2625db45-80e5-cf62-d154-74aea56ba068",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="527097ff-074b-fa73-645b-2b3c0c077ac5")
public static final String FIELDNAME_Project_SummaryLevel="527097ff-074b-fa73-645b-2b3c0c077ac5";

@XendraTrl(Identifier="e17b55fb-9467-5b31-9441-2aff66d12784")
public static String es_PE_FIELD_ProjectDimension_SummaryLevel_Name="Entidad Acumulada";

@XendraTrl(Identifier="e17b55fb-9467-5b31-9441-2aff66d12784")
public static String es_PE_FIELD_ProjectDimension_SummaryLevel_Description="Esta es una entidad sumaria";

@XendraTrl(Identifier="e17b55fb-9467-5b31-9441-2aff66d12784")
public static String es_PE_FIELD_ProjectDimension_SummaryLevel_Help="Una entidad sumaria representa una rama en un árbol mas bien que un nodo final. Las entidades sumarias son usadas para reportar y no tienen valores propios";

@XendraField(AD_Column_ID="IsSummary",IsCentrallyMaintained=true,
AD_Tab_ID="02aad880-ede5-9625-7a02-a7cd29a37e4b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=370,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e17b55fb-9467-5b31-9441-2aff66d12784")
public static final String FIELDNAME_ProjectDimension_SummaryLevel="e17b55fb-9467-5b31-9441-2aff66d12784";

@XendraTrl(Identifier="347d681d-cef1-84b1-d510-d3a9d7ebc955")
public static String es_PE_FIELD_Project_SummaryLevel2_Name="Entidad Acumulada";

@XendraTrl(Identifier="347d681d-cef1-84b1-d510-d3a9d7ebc955")
public static String es_PE_FIELD_Project_SummaryLevel2_Description="Esta es una entidad sumaria";

@XendraTrl(Identifier="347d681d-cef1-84b1-d510-d3a9d7ebc955")
public static String es_PE_FIELD_Project_SummaryLevel2_Help="Una entidad sumaria representa una rama en un árbol mas bien que un nodo final. Las entidades sumarias son usadas para reportar y no tienen valores propios";

@XendraField(AD_Column_ID="IsSummary",IsCentrallyMaintained=true,
AD_Tab_ID="6e167a11-3402-2b3f-7348-98f2a8c53e4f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="347d681d-cef1-84b1-d510-d3a9d7ebc955")
public static final String FIELDNAME_Project_SummaryLevel2="347d681d-cef1-84b1-d510-d3a9d7ebc955";

@XendraTrl(Identifier="0bb7f731-159a-d64d-089f-456f7b90d267")
public static String es_PE_COLUMN_IsSummary_Name="Entidad Acumulada";

@XendraColumn(AD_Element_ID="0ecd1d56-9e2b-8778-7b05-92730d811ad4",ColumnName="IsSummary",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0bb7f731-159a-d64d-089f-456f7b90d267",
Synchronized="2019-08-30 22:22:07.0")
/** Column name IsSummary */
public static final String COLUMNNAME_IsSummary = "IsSummary";
/** Set Price List Version.
@param M_PriceList_Version_ID Identifies a unique instance of a Price List */
public void setM_PriceList_Version_ID (int M_PriceList_Version_ID)
{
if (M_PriceList_Version_ID <= 0) set_Value (COLUMNNAME_M_PriceList_Version_ID, null);
 else 
set_Value (COLUMNNAME_M_PriceList_Version_ID, Integer.valueOf(M_PriceList_Version_ID));
}
/** Get Price List Version.
@return Identifies a unique instance of a Price List */
public int getM_PriceList_Version_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_PriceList_Version_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="cf4f5e8f-2361-3a7c-042f-f4732e017dd2")
public static String es_PE_FIELD_Project_PriceListVersion_Name="Versión de Lista de Precios";

@XendraTrl(Identifier="cf4f5e8f-2361-3a7c-042f-f4732e017dd2")
public static String es_PE_FIELD_Project_PriceListVersion_Description="Identifica una instancia única de una lista de precios";

@XendraTrl(Identifier="cf4f5e8f-2361-3a7c-042f-f4732e017dd2")
public static String es_PE_FIELD_Project_PriceListVersion_Help="Cada lista de precios puede tener múltiples versiones. El uso más común es indicar las fechas en que es válida una lista de precios.";

@XendraField(AD_Column_ID="M_PriceList_Version_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2625db45-80e5-cf62-d154-74aea56ba068",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@=N",DisplayLength=14,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cf4f5e8f-2361-3a7c-042f-f4732e017dd2")
public static final String FIELDNAME_Project_PriceListVersion="cf4f5e8f-2361-3a7c-042f-f4732e017dd2";

@XendraTrl(Identifier="ddbd29f3-80b9-b2bd-8564-ef3f1863b1b7")
public static String es_PE_FIELD_ProjectDimension_PriceListVersion_Name="Versión de Lista de Precios";

@XendraTrl(Identifier="ddbd29f3-80b9-b2bd-8564-ef3f1863b1b7")
public static String es_PE_FIELD_ProjectDimension_PriceListVersion_Description="Identifica una instancia única de una lista de precios";

@XendraTrl(Identifier="ddbd29f3-80b9-b2bd-8564-ef3f1863b1b7")
public static String es_PE_FIELD_ProjectDimension_PriceListVersion_Help="Cada lista de precios puede tener múltiples versiones. El uso más común es indicar las fechas en que es válida una lista de precios.";

@XendraField(AD_Column_ID="M_PriceList_Version_ID",IsCentrallyMaintained=true,
AD_Tab_ID="02aad880-ede5-9625-7a02-a7cd29a37e4b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ddbd29f3-80b9-b2bd-8564-ef3f1863b1b7")
public static final String FIELDNAME_ProjectDimension_PriceListVersion="ddbd29f3-80b9-b2bd-8564-ef3f1863b1b7";

@XendraTrl(Identifier="b2bbda65-2714-943f-5f66-c2a8b4b3dbb2")
public static String es_PE_FIELD_Project_PriceListVersion2_Name="Versión de Lista de Precios";

@XendraTrl(Identifier="b2bbda65-2714-943f-5f66-c2a8b4b3dbb2")
public static String es_PE_FIELD_Project_PriceListVersion2_Description="Identifica una instancia única de una lista de precios";

@XendraTrl(Identifier="b2bbda65-2714-943f-5f66-c2a8b4b3dbb2")
public static String es_PE_FIELD_Project_PriceListVersion2_Help="Cada lista de precios puede tener múltiples versiones. El uso más común es indicar las fechas en que es válida una lista de precios.";

@XendraField(AD_Column_ID="M_PriceList_Version_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6e167a11-3402-2b3f-7348-98f2a8c53e4f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@=N",DisplayLength=14,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b2bbda65-2714-943f-5f66-c2a8b4b3dbb2")
public static final String FIELDNAME_Project_PriceListVersion2="b2bbda65-2714-943f-5f66-c2a8b4b3dbb2";

@XendraTrl(Identifier="a03e970c-db84-acd6-c3f1-3bee487bcc1f")
public static String es_PE_COLUMN_M_PriceList_Version_ID_Name="Versión de Lista de Precios";

@XendraColumn(AD_Element_ID="6c31f4d5-58fe-0b61-33f1-e2549c3f35f6",
ColumnName="M_PriceList_Version_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="a03e970c-db84-acd6-c3f1-3bee487bcc1f",Synchronized="2019-08-30 22:22:07.0")
/** Column name M_PriceList_Version_ID */
public static final String COLUMNNAME_M_PriceList_Version_ID = "M_PriceList_Version_ID";
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

@XendraTrl(Identifier="1b165296-f3e8-9be6-20eb-f4db709e1c53")
public static String es_PE_FIELD_Project_Warehouse_Name="Almacén";

@XendraTrl(Identifier="1b165296-f3e8-9be6-20eb-f4db709e1c53")
public static String es_PE_FIELD_Project_Warehouse_Description="Almacén";

@XendraTrl(Identifier="1b165296-f3e8-9be6-20eb-f4db709e1c53")
public static String es_PE_FIELD_Project_Warehouse_Help="El Almacén indica un Almacén único donde los productos son almacenados";

@XendraField(AD_Column_ID="M_Warehouse_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2625db45-80e5-cf62-d154-74aea56ba068",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@=N",DisplayLength=14,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1b165296-f3e8-9be6-20eb-f4db709e1c53")
public static final String FIELDNAME_Project_Warehouse="1b165296-f3e8-9be6-20eb-f4db709e1c53";

@XendraTrl(Identifier="b38ca263-13a5-297b-4471-081773c64145")
public static String es_PE_FIELD_ProjectDimension_Warehouse_Name="Almacén";

@XendraTrl(Identifier="b38ca263-13a5-297b-4471-081773c64145")
public static String es_PE_FIELD_ProjectDimension_Warehouse_Description="Almacén";

@XendraTrl(Identifier="b38ca263-13a5-297b-4471-081773c64145")
public static String es_PE_FIELD_ProjectDimension_Warehouse_Help="El Almacén indica un Almacén único donde los productos son almacenados";

@XendraField(AD_Column_ID="M_Warehouse_ID",IsCentrallyMaintained=true,
AD_Tab_ID="02aad880-ede5-9625-7a02-a7cd29a37e4b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b38ca263-13a5-297b-4471-081773c64145")
public static final String FIELDNAME_ProjectDimension_Warehouse="b38ca263-13a5-297b-4471-081773c64145";

@XendraTrl(Identifier="19e9b0b8-f224-8cee-87a5-1c29591d347c")
public static String es_PE_FIELD_Project_Warehouse2_Name="Almacén";

@XendraTrl(Identifier="19e9b0b8-f224-8cee-87a5-1c29591d347c")
public static String es_PE_FIELD_Project_Warehouse2_Description="Almacén";

@XendraTrl(Identifier="19e9b0b8-f224-8cee-87a5-1c29591d347c")
public static String es_PE_FIELD_Project_Warehouse2_Help="El Almacén indica un Almacén único donde los productos son almacenados";

@XendraField(AD_Column_ID="M_Warehouse_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6e167a11-3402-2b3f-7348-98f2a8c53e4f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@=N",DisplayLength=14,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="19e9b0b8-f224-8cee-87a5-1c29591d347c")
public static final String FIELDNAME_Project_Warehouse2="19e9b0b8-f224-8cee-87a5-1c29591d347c";

@XendraTrl(Identifier="4dd20c4b-4c9a-91f6-87d8-694c8946107e")
public static String es_PE_COLUMN_M_Warehouse_ID_Name="Almacén";

@XendraColumn(AD_Element_ID="402045cd-baa5-aeaf-b148-a921dffb7821",ColumnName="M_Warehouse_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="@M_Warehouse_ID@!0",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="4dd20c4b-4c9a-91f6-87d8-694c8946107e",Synchronized="2019-08-30 22:22:07.0")
/** Column name M_Warehouse_ID */
public static final String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
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
@XendraTrl(Identifier="4ac4c1fb-82cd-c3f7-ce6e-f3556ee1c5e8")
public static String es_PE_FIELD_Project_Name_Name="Nombre";

@XendraTrl(Identifier="4ac4c1fb-82cd-c3f7-ce6e-f3556ee1c5e8")
public static String es_PE_FIELD_Project_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="4ac4c1fb-82cd-c3f7-ce6e-f3556ee1c5e8")
public static String es_PE_FIELD_Project_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="2625db45-80e5-cf62-d154-74aea56ba068",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4ac4c1fb-82cd-c3f7-ce6e-f3556ee1c5e8")
public static final String FIELDNAME_Project_Name="4ac4c1fb-82cd-c3f7-ce6e-f3556ee1c5e8";

@XendraTrl(Identifier="73a63223-5f88-5d51-2c9d-fb6ac3d712ea")
public static String es_PE_FIELD_ProjectDimension_Name_Name="Nombre";

@XendraTrl(Identifier="73a63223-5f88-5d51-2c9d-fb6ac3d712ea")
public static String es_PE_FIELD_ProjectDimension_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="73a63223-5f88-5d51-2c9d-fb6ac3d712ea")
public static String es_PE_FIELD_ProjectDimension_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="02aad880-ede5-9625-7a02-a7cd29a37e4b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=340,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="73a63223-5f88-5d51-2c9d-fb6ac3d712ea")
public static final String FIELDNAME_ProjectDimension_Name="73a63223-5f88-5d51-2c9d-fb6ac3d712ea";

@XendraTrl(Identifier="392dbfee-c6ef-f728-b54e-9ebbfd03b2ae")
public static String es_PE_FIELD_Project_Name2_Name="Nombre";

@XendraTrl(Identifier="392dbfee-c6ef-f728-b54e-9ebbfd03b2ae")
public static String es_PE_FIELD_Project_Name2_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="392dbfee-c6ef-f728-b54e-9ebbfd03b2ae")
public static String es_PE_FIELD_Project_Name2_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="6e167a11-3402-2b3f-7348-98f2a8c53e4f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="392dbfee-c6ef-f728-b54e-9ebbfd03b2ae")
public static final String FIELDNAME_Project_Name2="392dbfee-c6ef-f728-b54e-9ebbfd03b2ae";

@XendraTrl(Identifier="8ec984c0-9ba7-cb6e-ceba-b4b43de46565")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8ec984c0-9ba7-cb6e-ceba-b4b43de46565",
Synchronized="2019-08-30 22:22:07.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Note.
@param Note Optional additional user defined information */
public void setNote (String Note)
{
set_Value (COLUMNNAME_Note, Note);
}
/** Get Note.
@return Optional additional user defined information */
public String getNote() 
{
String value = (String)get_Value(COLUMNNAME_Note);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="c51ac1e1-50a1-3042-e8ff-a27191060ed2")
public static String es_PE_FIELD_Project_Note_Name="Nota";

@XendraTrl(Identifier="c51ac1e1-50a1-3042-e8ff-a27191060ed2")
public static String es_PE_FIELD_Project_Note_Description="Información adicional opcional definida por el usuario";

@XendraTrl(Identifier="c51ac1e1-50a1-3042-e8ff-a27191060ed2")
public static String es_PE_FIELD_Project_Note_Help="El campo Nota permite una entrada opcional de información definida por el usuario considerando este registro";

@XendraField(AD_Column_ID="Note",IsCentrallyMaintained=true,
AD_Tab_ID="2625db45-80e5-cf62-d154-74aea56ba068",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c51ac1e1-50a1-3042-e8ff-a27191060ed2")
public static final String FIELDNAME_Project_Note="c51ac1e1-50a1-3042-e8ff-a27191060ed2";

@XendraTrl(Identifier="b6b9d24c-8d0a-42d5-69b6-139af45be8d2")
public static String es_PE_FIELD_ProjectDimension_Note_Name="Nota";

@XendraTrl(Identifier="b6b9d24c-8d0a-42d5-69b6-139af45be8d2")
public static String es_PE_FIELD_ProjectDimension_Note_Description="Información adicional opcional definida por el usuario";

@XendraTrl(Identifier="b6b9d24c-8d0a-42d5-69b6-139af45be8d2")
public static String es_PE_FIELD_ProjectDimension_Note_Help="El campo Nota permite una entrada opcional de información definida por el usuario considerando este registro";

@XendraField(AD_Column_ID="Note",IsCentrallyMaintained=true,
AD_Tab_ID="02aad880-ede5-9625-7a02-a7cd29a37e4b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b6b9d24c-8d0a-42d5-69b6-139af45be8d2")
public static final String FIELDNAME_ProjectDimension_Note="b6b9d24c-8d0a-42d5-69b6-139af45be8d2";

@XendraTrl(Identifier="ecab963a-b30a-31e8-366e-3e6968ada180")
public static String es_PE_FIELD_Project_Note2_Name="Nota";

@XendraTrl(Identifier="ecab963a-b30a-31e8-366e-3e6968ada180")
public static String es_PE_FIELD_Project_Note2_Description="Información adicional opcional definida por el usuario";

@XendraTrl(Identifier="ecab963a-b30a-31e8-366e-3e6968ada180")
public static String es_PE_FIELD_Project_Note2_Help="El campo Nota permite una entrada opcional de información definida por el usuario considerando este registro";

@XendraField(AD_Column_ID="Note",IsCentrallyMaintained=true,
AD_Tab_ID="6e167a11-3402-2b3f-7348-98f2a8c53e4f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ecab963a-b30a-31e8-366e-3e6968ada180")
public static final String FIELDNAME_Project_Note2="ecab963a-b30a-31e8-366e-3e6968ada180";

@XendraTrl(Identifier="a5c716a9-8790-16ec-775a-b55daed621d4")
public static String es_PE_COLUMN_Note_Name="Nota";

@XendraColumn(AD_Element_ID="5fea140b-6b26-b544-b237-3b3fa64ae1c6",ColumnName="Note",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a5c716a9-8790-16ec-775a-b55daed621d4",
Synchronized="2019-08-30 22:22:07.0")
/** Column name Note */
public static final String COLUMNNAME_Note = "Note";
/** Set Planned Amount.
@param PlannedAmt Planned amount for this project */
public void setPlannedAmt (BigDecimal PlannedAmt)
{
if (PlannedAmt == null) throw new IllegalArgumentException ("PlannedAmt is mandatory.");
set_Value (COLUMNNAME_PlannedAmt, PlannedAmt);
}
/** Get Planned Amount.
@return Planned amount for this project */
public BigDecimal getPlannedAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PlannedAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="7daec0b1-891a-4f96-95a2-5bcbdaa8d327")
public static String es_PE_FIELD_Project_PlannedAmount_Name="Total Planeado";

@XendraTrl(Identifier="7daec0b1-891a-4f96-95a2-5bcbdaa8d327")
public static String es_PE_FIELD_Project_PlannedAmount_Description="Total planeado para este proyecto";

@XendraTrl(Identifier="7daec0b1-891a-4f96-95a2-5bcbdaa8d327")
public static String es_PE_FIELD_Project_PlannedAmount_Help="El Total planeado indica el total anticipado para este proyecto ó linea de proyecto";

@XendraField(AD_Column_ID="PlannedAmt",IsCentrallyMaintained=true,
AD_Tab_ID="2625db45-80e5-cf62-d154-74aea56ba068",AD_FieldGroup_ID="Amounts",IsDisplayed=true,
DisplayLogic="@IsSummary@=N",DisplayLength=26,IsReadOnly=false,SeqNo=250,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7daec0b1-891a-4f96-95a2-5bcbdaa8d327")
public static final String FIELDNAME_Project_PlannedAmount="7daec0b1-891a-4f96-95a2-5bcbdaa8d327";

@XendraTrl(Identifier="215c3bfc-6050-c78e-db1d-11b122bef47c")
public static String es_PE_FIELD_ProjectDimension_PlannedAmount_Name="Total Planeado";

@XendraTrl(Identifier="215c3bfc-6050-c78e-db1d-11b122bef47c")
public static String es_PE_FIELD_ProjectDimension_PlannedAmount_Description="Total planeado para este proyecto";

@XendraTrl(Identifier="215c3bfc-6050-c78e-db1d-11b122bef47c")
public static String es_PE_FIELD_ProjectDimension_PlannedAmount_Help="El Total planeado indica el total anticipado para este proyecto ó linea de proyecto";

@XendraField(AD_Column_ID="PlannedAmt",IsCentrallyMaintained=true,
AD_Tab_ID="02aad880-ede5-9625-7a02-a7cd29a37e4b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="215c3bfc-6050-c78e-db1d-11b122bef47c")
public static final String FIELDNAME_ProjectDimension_PlannedAmount="215c3bfc-6050-c78e-db1d-11b122bef47c";

@XendraTrl(Identifier="01aba90d-0d2b-a219-4ecc-cecca61739cf")
public static String es_PE_FIELD_Project_PlannedAmount2_Name="Total Planeado";

@XendraTrl(Identifier="01aba90d-0d2b-a219-4ecc-cecca61739cf")
public static String es_PE_FIELD_Project_PlannedAmount2_Description="Total planeado para este proyecto";

@XendraTrl(Identifier="01aba90d-0d2b-a219-4ecc-cecca61739cf")
public static String es_PE_FIELD_Project_PlannedAmount2_Help="El Total planeado indica el total anticipado para este proyecto ó linea de proyecto";

@XendraField(AD_Column_ID="PlannedAmt",IsCentrallyMaintained=true,
AD_Tab_ID="6e167a11-3402-2b3f-7348-98f2a8c53e4f",AD_FieldGroup_ID="Amounts",IsDisplayed=true,
DisplayLogic="@IsSummary@=N",DisplayLength=26,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="01aba90d-0d2b-a219-4ecc-cecca61739cf")
public static final String FIELDNAME_Project_PlannedAmount2="01aba90d-0d2b-a219-4ecc-cecca61739cf";

@XendraTrl(Identifier="63733382-363b-6044-83bf-ffea10168c60")
public static String es_PE_COLUMN_PlannedAmt_Name="Total Planeado";

@XendraColumn(AD_Element_ID="7d2e668d-1293-27b7-a5ff-85f836dc7388",ColumnName="PlannedAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="63733382-363b-6044-83bf-ffea10168c60",
Synchronized="2019-08-30 22:22:07.0")
/** Column name PlannedAmt */
public static final String COLUMNNAME_PlannedAmt = "PlannedAmt";
/** Set Planned Margin.
@param PlannedMarginAmt Project's planned margin amount */
public void setPlannedMarginAmt (BigDecimal PlannedMarginAmt)
{
if (PlannedMarginAmt == null) throw new IllegalArgumentException ("PlannedMarginAmt is mandatory.");
set_Value (COLUMNNAME_PlannedMarginAmt, PlannedMarginAmt);
}
/** Get Planned Margin.
@return Project's planned margin amount */
public BigDecimal getPlannedMarginAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PlannedMarginAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="be92fc27-db8d-dece-7ed4-5134d6a8eb69")
public static String es_PE_FIELD_Project_PlannedMargin_Name="Margen Planeado";

@XendraTrl(Identifier="be92fc27-db8d-dece-7ed4-5134d6a8eb69")
public static String es_PE_FIELD_Project_PlannedMargin_Description="El total de margen planeado del proyecto";

@XendraTrl(Identifier="be92fc27-db8d-dece-7ed4-5134d6a8eb69")
public static String es_PE_FIELD_Project_PlannedMargin_Help="El total de margen planeado indica el margen anticipado que se espera para este proyecto ó esta línea del proyecto.";

@XendraField(AD_Column_ID="PlannedMarginAmt",IsCentrallyMaintained=true,
AD_Tab_ID="2625db45-80e5-cf62-d154-74aea56ba068",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@=N",DisplayLength=26,IsReadOnly=false,SeqNo=270,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="be92fc27-db8d-dece-7ed4-5134d6a8eb69")
public static final String FIELDNAME_Project_PlannedMargin="be92fc27-db8d-dece-7ed4-5134d6a8eb69";

@XendraTrl(Identifier="c0770bb9-51e0-75a0-5340-96d6b36d5814")
public static String es_PE_FIELD_ProjectDimension_PlannedMargin_Name="Margen Planeado";

@XendraTrl(Identifier="c0770bb9-51e0-75a0-5340-96d6b36d5814")
public static String es_PE_FIELD_ProjectDimension_PlannedMargin_Description="El total de margen planeado del proyecto";

@XendraTrl(Identifier="c0770bb9-51e0-75a0-5340-96d6b36d5814")
public static String es_PE_FIELD_ProjectDimension_PlannedMargin_Help="El total de margen planeado indica el margen anticipado que se espera para este proyecto ó esta línea del proyecto.";

@XendraField(AD_Column_ID="PlannedMarginAmt",IsCentrallyMaintained=true,
AD_Tab_ID="02aad880-ede5-9625-7a02-a7cd29a37e4b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c0770bb9-51e0-75a0-5340-96d6b36d5814")
public static final String FIELDNAME_ProjectDimension_PlannedMargin="c0770bb9-51e0-75a0-5340-96d6b36d5814";

@XendraTrl(Identifier="3e63ea6d-3e9b-4d90-366a-080308ca6486")
public static String es_PE_FIELD_Project_PlannedMargin2_Name="Margen Planeado";

@XendraTrl(Identifier="3e63ea6d-3e9b-4d90-366a-080308ca6486")
public static String es_PE_FIELD_Project_PlannedMargin2_Description="El total de margen planeado del proyecto";

@XendraTrl(Identifier="3e63ea6d-3e9b-4d90-366a-080308ca6486")
public static String es_PE_FIELD_Project_PlannedMargin2_Help="El total de margen planeado indica el margen anticipado que se espera para este proyecto ó esta línea del proyecto.";

@XendraField(AD_Column_ID="PlannedMarginAmt",IsCentrallyMaintained=true,
AD_Tab_ID="6e167a11-3402-2b3f-7348-98f2a8c53e4f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@=N",DisplayLength=26,IsReadOnly=false,SeqNo=260,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3e63ea6d-3e9b-4d90-366a-080308ca6486")
public static final String FIELDNAME_Project_PlannedMargin2="3e63ea6d-3e9b-4d90-366a-080308ca6486";

@XendraTrl(Identifier="b38b2962-b4b3-5582-4d2f-6a9757a64a26")
public static String es_PE_COLUMN_PlannedMarginAmt_Name="Margen Planeado";

@XendraColumn(AD_Element_ID="413b1b88-7cf5-d00d-2f30-730014b2fce9",ColumnName="PlannedMarginAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b38b2962-b4b3-5582-4d2f-6a9757a64a26",
Synchronized="2019-08-30 22:22:07.0")
/** Column name PlannedMarginAmt */
public static final String COLUMNNAME_PlannedMarginAmt = "PlannedMarginAmt";
/** Set Planned Quantity.
@param PlannedQty Planned quantity for this project */
public void setPlannedQty (BigDecimal PlannedQty)
{
if (PlannedQty == null) throw new IllegalArgumentException ("PlannedQty is mandatory.");
set_Value (COLUMNNAME_PlannedQty, PlannedQty);
}
/** Get Planned Quantity.
@return Planned quantity for this project */
public BigDecimal getPlannedQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PlannedQty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="18b262d5-5c15-3ac0-a789-5971456b95b7")
public static String es_PE_FIELD_Project_PlannedQuantity_Name="Cantidad Planeada";

@XendraTrl(Identifier="18b262d5-5c15-3ac0-a789-5971456b95b7")
public static String es_PE_FIELD_Project_PlannedQuantity_Description="Cantidad planeada para este proyecto";

@XendraTrl(Identifier="18b262d5-5c15-3ac0-a789-5971456b95b7")
public static String es_PE_FIELD_Project_PlannedQuantity_Help="La Cantidad Planeada indica la cantidad anticipada para este proyecto ó línea del proyecto";

@XendraField(AD_Column_ID="PlannedQty",IsCentrallyMaintained=true,
AD_Tab_ID="2625db45-80e5-cf62-d154-74aea56ba068",AD_FieldGroup_ID="Amounts",IsDisplayed=true,
DisplayLogic="@IsSummary@=N",DisplayLength=26,IsReadOnly=false,SeqNo=260,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="18b262d5-5c15-3ac0-a789-5971456b95b7")
public static final String FIELDNAME_Project_PlannedQuantity="18b262d5-5c15-3ac0-a789-5971456b95b7";

@XendraTrl(Identifier="f2cb96f5-3029-9c77-db19-9586da64b47f")
public static String es_PE_FIELD_ProjectDimension_PlannedQuantity_Name="Cantidad Planeada";

@XendraTrl(Identifier="f2cb96f5-3029-9c77-db19-9586da64b47f")
public static String es_PE_FIELD_ProjectDimension_PlannedQuantity_Description="Cantidad planeada para este proyecto";

@XendraTrl(Identifier="f2cb96f5-3029-9c77-db19-9586da64b47f")
public static String es_PE_FIELD_ProjectDimension_PlannedQuantity_Help="La Cantidad Planeada indica la cantidad anticipada para este proyecto ó línea del proyecto";

@XendraField(AD_Column_ID="PlannedQty",IsCentrallyMaintained=true,
AD_Tab_ID="02aad880-ede5-9625-7a02-a7cd29a37e4b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f2cb96f5-3029-9c77-db19-9586da64b47f")
public static final String FIELDNAME_ProjectDimension_PlannedQuantity="f2cb96f5-3029-9c77-db19-9586da64b47f";

@XendraTrl(Identifier="600fbc3e-5533-8d21-0f57-c35266a890d1")
public static String es_PE_FIELD_Project_PlannedQuantity2_Name="Cantidad Planeada";

@XendraTrl(Identifier="600fbc3e-5533-8d21-0f57-c35266a890d1")
public static String es_PE_FIELD_Project_PlannedQuantity2_Description="Cantidad planeada para este proyecto";

@XendraTrl(Identifier="600fbc3e-5533-8d21-0f57-c35266a890d1")
public static String es_PE_FIELD_Project_PlannedQuantity2_Help="La Cantidad Planeada indica la cantidad anticipada para este proyecto ó línea del proyecto";

@XendraField(AD_Column_ID="PlannedQty",IsCentrallyMaintained=true,
AD_Tab_ID="6e167a11-3402-2b3f-7348-98f2a8c53e4f",AD_FieldGroup_ID="Amounts",IsDisplayed=true,
DisplayLogic="@IsSummary@=N",DisplayLength=26,IsReadOnly=false,SeqNo=250,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="600fbc3e-5533-8d21-0f57-c35266a890d1")
public static final String FIELDNAME_Project_PlannedQuantity2="600fbc3e-5533-8d21-0f57-c35266a890d1";

@XendraTrl(Identifier="858957a1-1441-ae51-eb77-6c110d582ade")
public static String es_PE_COLUMN_PlannedQty_Name="Cantidad Planeada";

@XendraColumn(AD_Element_ID="d4461654-1565-2b21-28c4-41673a75f16b",ColumnName="PlannedQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="858957a1-1441-ae51-eb77-6c110d582ade",
Synchronized="2019-08-30 22:22:07.0")
/** Column name PlannedQty */
public static final String COLUMNNAME_PlannedQty = "PlannedQty";
/** Set Order Reference.
@param POReference Transaction Reference Number (Sales Order, Purchase Order) of your Business Partner */
public void setPOReference (String POReference)
{
if (POReference != null && POReference.length() > 20)
{
log.warning("Length > 20 - truncated");
POReference = POReference.substring(0,19);
}
set_Value (COLUMNNAME_POReference, POReference);
}
/** Get Order Reference.
@return Transaction Reference Number (Sales Order, Purchase Order) of your Business Partner */
public String getPOReference() 
{
String value = (String)get_Value(COLUMNNAME_POReference);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="af91116b-9220-fda2-12e5-0726a34429ff")
public static String es_PE_FIELD_Project_OrderReference_Name="Referencia de Orden de Socio";

@XendraTrl(Identifier="af91116b-9220-fda2-12e5-0726a34429ff")
public static String es_PE_FIELD_Project_OrderReference_Description="Número de referencia de de la transacción (Orden de Venta; Orden de Compra) de su socio de negocio)";

@XendraTrl(Identifier="af91116b-9220-fda2-12e5-0726a34429ff")
public static String es_PE_FIELD_Project_OrderReference_Help="La referencia de orden del socio de negocio es la referencia para esta transacción específica. Frecuentemente los números de orden de compras se dan para ser impresas en las facturas como una referencia más fácil. Un número estándar puede ser definido en la ventana socio de negocio (Cliente).";

@XendraField(AD_Column_ID="POReference",IsCentrallyMaintained=true,
AD_Tab_ID="2625db45-80e5-cf62-d154-74aea56ba068",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@=N",DisplayLength=20,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="af91116b-9220-fda2-12e5-0726a34429ff")
public static final String FIELDNAME_Project_OrderReference="af91116b-9220-fda2-12e5-0726a34429ff";

@XendraTrl(Identifier="c680aa66-3180-b03b-df89-8635c0418d0b")
public static String es_PE_FIELD_ProjectDimension_OrderReference_Name="Referencia de Orden de Socio";

@XendraTrl(Identifier="c680aa66-3180-b03b-df89-8635c0418d0b")
public static String es_PE_FIELD_ProjectDimension_OrderReference_Description="Número de referencia de de la transacción (Orden de Venta; Orden de Compra) de su socio de negocio)";

@XendraTrl(Identifier="c680aa66-3180-b03b-df89-8635c0418d0b")
public static String es_PE_FIELD_ProjectDimension_OrderReference_Help="La referencia de orden del socio de negocio es la referencia para esta transacción específica. Frecuentemente los números de orden de compras se dan para ser impresas en las facturas como una referencia más fácil. Un número estándar puede ser definido en la ventana socio de negocio (Cliente).";

@XendraField(AD_Column_ID="POReference",IsCentrallyMaintained=true,
AD_Tab_ID="02aad880-ede5-9625-7a02-a7cd29a37e4b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c680aa66-3180-b03b-df89-8635c0418d0b")
public static final String FIELDNAME_ProjectDimension_OrderReference="c680aa66-3180-b03b-df89-8635c0418d0b";

@XendraTrl(Identifier="830065cc-9459-778d-6cdf-7524a7c6f4a5")
public static String es_PE_FIELD_Project_OrderReference2_Name="Referencia de Orden de Socio";

@XendraTrl(Identifier="830065cc-9459-778d-6cdf-7524a7c6f4a5")
public static String es_PE_FIELD_Project_OrderReference2_Description="Número de referencia de de la transacción (Orden de Venta; Orden de Compra) de su socio de negocio)";

@XendraTrl(Identifier="830065cc-9459-778d-6cdf-7524a7c6f4a5")
public static String es_PE_FIELD_Project_OrderReference2_Help="La referencia de orden del socio de negocio es la referencia para esta transacción específica. Frecuentemente los números de orden de compras se dan para ser impresas en las facturas como una referencia más fácil. Un número estándar puede ser definido en la ventana socio de negocio (Cliente).";

@XendraField(AD_Column_ID="POReference",IsCentrallyMaintained=true,
AD_Tab_ID="6e167a11-3402-2b3f-7348-98f2a8c53e4f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@=N",DisplayLength=20,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="830065cc-9459-778d-6cdf-7524a7c6f4a5")
public static final String FIELDNAME_Project_OrderReference2="830065cc-9459-778d-6cdf-7524a7c6f4a5";

@XendraTrl(Identifier="b6373bd9-241c-83da-5016-da289649c82d")
public static String es_PE_COLUMN_POReference_Name="Referencia de Orden de Socio";

@XendraColumn(AD_Element_ID="c3de7eea-53b7-a810-0260-1bcb037a2967",ColumnName="POReference",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b6373bd9-241c-83da-5016-da289649c82d",
Synchronized="2019-08-30 22:22:07.0")
/** Column name POReference */
public static final String COLUMNNAME_POReference = "POReference";
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

@XendraTrl(Identifier="8746fb4e-d899-5242-ed8e-f9a7017de123")
public static String es_PE_FIELD_Project_Processed_Name="Procesado";

@XendraTrl(Identifier="8746fb4e-d899-5242-ed8e-f9a7017de123")
public static String es_PE_FIELD_Project_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="8746fb4e-d899-5242-ed8e-f9a7017de123")
public static String es_PE_FIELD_Project_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="2625db45-80e5-cf62-d154-74aea56ba068",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8746fb4e-d899-5242-ed8e-f9a7017de123")
public static final String FIELDNAME_Project_Processed="8746fb4e-d899-5242-ed8e-f9a7017de123";

@XendraTrl(Identifier="7c1ad4cb-f369-6bf8-af15-23d84437bec1")
public static String es_PE_FIELD_ProjectDimension_Processed_Name="Procesado";

@XendraTrl(Identifier="7c1ad4cb-f369-6bf8-af15-23d84437bec1")
public static String es_PE_FIELD_ProjectDimension_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="7c1ad4cb-f369-6bf8-af15-23d84437bec1")
public static String es_PE_FIELD_ProjectDimension_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="02aad880-ede5-9625-7a02-a7cd29a37e4b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7c1ad4cb-f369-6bf8-af15-23d84437bec1")
public static final String FIELDNAME_ProjectDimension_Processed="7c1ad4cb-f369-6bf8-af15-23d84437bec1";

@XendraTrl(Identifier="d953ba68-6747-eb32-b281-a1c77389d1fd")
public static String es_PE_FIELD_Project_Processed2_Name="Procesado";

@XendraTrl(Identifier="d953ba68-6747-eb32-b281-a1c77389d1fd")
public static String es_PE_FIELD_Project_Processed2_Description="El documento ha sido procesado";

@XendraTrl(Identifier="d953ba68-6747-eb32-b281-a1c77389d1fd")
public static String es_PE_FIELD_Project_Processed2_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="6e167a11-3402-2b3f-7348-98f2a8c53e4f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d953ba68-6747-eb32-b281-a1c77389d1fd")
public static final String FIELDNAME_Project_Processed2="d953ba68-6747-eb32-b281-a1c77389d1fd";

@XendraTrl(Identifier="0432a6ea-1df3-a046-9a13-90e16d13b7b5")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0432a6ea-1df3-a046-9a13-90e16d13b7b5",
Synchronized="2019-08-30 22:22:07.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
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

@XendraTrl(Identifier="b87e8b02-2918-6a20-a1ab-016378aad368")
public static String es_PE_FIELD_Project_ProcessNow_Name="Proyecto Cerrado";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="2625db45-80e5-cf62-d154-74aea56ba068",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@=N",DisplayLength=23,IsReadOnly=false,SeqNo=350,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b87e8b02-2918-6a20-a1ab-016378aad368")
public static final String FIELDNAME_Project_ProcessNow="b87e8b02-2918-6a20-a1ab-016378aad368";

@XendraTrl(Identifier="bbabe7f8-9b7f-4ce0-d726-95e2978725a8")
public static String es_PE_FIELD_ProjectDimension_ProcessNow_Name="Proyecto Cerrado";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="02aad880-ede5-9625-7a02-a7cd29a37e4b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bbabe7f8-9b7f-4ce0-d726-95e2978725a8")
public static final String FIELDNAME_ProjectDimension_ProcessNow="bbabe7f8-9b7f-4ce0-d726-95e2978725a8";

@XendraTrl(Identifier="92ee70b7-b802-d076-c1d2-de135dbbee39")
public static String es_PE_FIELD_Project_ProcessNow2_Name="Proyecto Cerrado";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="6e167a11-3402-2b3f-7348-98f2a8c53e4f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@=N",DisplayLength=23,IsReadOnly=false,SeqNo=350,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="92ee70b7-b802-d076-c1d2-de135dbbee39")
public static final String FIELDNAME_Project_ProcessNow2="92ee70b7-b802-d076-c1d2-de135dbbee39";

@XendraTrl(Identifier="8c5cc86f-85a8-8917-4fe7-dfd8988833c8")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="5d84e034-4c0e-71a5-a5b8-9f1670b7007d",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="8c5cc86f-85a8-8917-4fe7-dfd8988833c8",Synchronized="2019-08-30 22:22:07.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Project Balance.
@param ProjectBalanceAmt Total Project Balance */
public void setProjectBalanceAmt (BigDecimal ProjectBalanceAmt)
{
if (ProjectBalanceAmt == null) throw new IllegalArgumentException ("ProjectBalanceAmt is mandatory.");
set_ValueNoCheck (COLUMNNAME_ProjectBalanceAmt, ProjectBalanceAmt);
}
/** Get Project Balance.
@return Total Project Balance */
public BigDecimal getProjectBalanceAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ProjectBalanceAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="5ed4b414-c1ca-8fc4-5562-363eaa3cfe82")
public static String es_PE_FIELD_Project_ProjectBalance_Name="Balance del Proyecto";

@XendraTrl(Identifier="5ed4b414-c1ca-8fc4-5562-363eaa3cfe82")
public static String es_PE_FIELD_Project_ProjectBalance_Description="Total Balance del Proyecto";

@XendraTrl(Identifier="5ed4b414-c1ca-8fc4-5562-363eaa3cfe82")
public static String es_PE_FIELD_Project_ProjectBalance_Help="El balance del proyecto es la suma de todas las facturas y pagos";

@XendraField(AD_Column_ID="ProjectBalanceAmt",IsCentrallyMaintained=true,
AD_Tab_ID="2625db45-80e5-cf62-d154-74aea56ba068",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@=N",DisplayLength=26,IsReadOnly=true,SeqNo=330,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5ed4b414-c1ca-8fc4-5562-363eaa3cfe82")
public static final String FIELDNAME_Project_ProjectBalance="5ed4b414-c1ca-8fc4-5562-363eaa3cfe82";

@XendraTrl(Identifier="82f14f68-e0c5-2f67-c423-dad30fab1240")
public static String es_PE_FIELD_ProjectDimension_ProjectBalance_Name="Balance del Proyecto";

@XendraTrl(Identifier="82f14f68-e0c5-2f67-c423-dad30fab1240")
public static String es_PE_FIELD_ProjectDimension_ProjectBalance_Description="Total Balance del Proyecto";

@XendraTrl(Identifier="82f14f68-e0c5-2f67-c423-dad30fab1240")
public static String es_PE_FIELD_ProjectDimension_ProjectBalance_Help="El balance del proyecto es la suma de todas las facturas y pagos";

@XendraField(AD_Column_ID="ProjectBalanceAmt",IsCentrallyMaintained=true,
AD_Tab_ID="02aad880-ede5-9625-7a02-a7cd29a37e4b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="82f14f68-e0c5-2f67-c423-dad30fab1240")
public static final String FIELDNAME_ProjectDimension_ProjectBalance="82f14f68-e0c5-2f67-c423-dad30fab1240";

@XendraTrl(Identifier="309b8456-18b3-953f-80cb-ca58ee647ff8")
public static String es_PE_FIELD_Project_ProjectBalance2_Name="Balance del Proyecto";

@XendraTrl(Identifier="309b8456-18b3-953f-80cb-ca58ee647ff8")
public static String es_PE_FIELD_Project_ProjectBalance2_Description="Total Balance del Proyecto";

@XendraTrl(Identifier="309b8456-18b3-953f-80cb-ca58ee647ff8")
public static String es_PE_FIELD_Project_ProjectBalance2_Help="El balance del proyecto es la suma de todas las facturas y pagos";

@XendraField(AD_Column_ID="ProjectBalanceAmt",IsCentrallyMaintained=true,
AD_Tab_ID="6e167a11-3402-2b3f-7348-98f2a8c53e4f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@=N",DisplayLength=26,IsReadOnly=true,SeqNo=320,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="309b8456-18b3-953f-80cb-ca58ee647ff8")
public static final String FIELDNAME_Project_ProjectBalance2="309b8456-18b3-953f-80cb-ca58ee647ff8";

@XendraTrl(Identifier="b3da9e7c-712e-a69f-7eb5-38a9a4335ba2")
public static String es_PE_COLUMN_ProjectBalanceAmt_Name="Balance del Proyecto";

@XendraColumn(AD_Element_ID="8a6387e4-15c1-1b85-4ece-473f6e2cbddd",ColumnName="ProjectBalanceAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b3da9e7c-712e-a69f-7eb5-38a9a4335ba2",
Synchronized="2019-08-30 22:22:07.0")
/** Column name ProjectBalanceAmt */
public static final String COLUMNNAME_ProjectBalanceAmt = "ProjectBalanceAmt";
/** Set Project Category.
@param ProjectCategory Project Category */
public void setProjectCategory (String ProjectCategory)
{
if (ProjectCategory != null && ProjectCategory.length() > 1)
{
log.warning("Length > 1 - truncated");
ProjectCategory = ProjectCategory.substring(0,0);
}
set_Value (COLUMNNAME_ProjectCategory, ProjectCategory);
}
/** Get Project Category.
@return Project Category */
public String getProjectCategory() 
{
return (String)get_Value(COLUMNNAME_ProjectCategory);
}

@XendraTrl(Identifier="4e954a8d-c4ca-37c6-eb04-ea33bb50b397")
public static String es_PE_FIELD_Project_ProjectCategory_Name="Categoría del Proyecto";

@XendraTrl(Identifier="4e954a8d-c4ca-37c6-eb04-ea33bb50b397")
public static String es_PE_FIELD_Project_ProjectCategory_Description="Categoría del Proyecto";

@XendraTrl(Identifier="4e954a8d-c4ca-37c6-eb04-ea33bb50b397")
public static String es_PE_FIELD_Project_ProjectCategory_Help="La categoría del proyecto determina el comportamiento del proyecto:General - ninguna contabilidad especial, ej. para las pre-ventas ó seguir generalEl servicio - ninguna contabilidad especial, ej. para la orden de trabajo de los proyectos de Servicio/carga - crea las transacciones de Proyecto/Job WIP - capacidad de publicar activo material - crea las transacciones del activode proyecto - capacidad de publicar el material";

@XendraField(AD_Column_ID="ProjectCategory",IsCentrallyMaintained=true,
AD_Tab_ID="2625db45-80e5-cf62-d154-74aea56ba068",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4e954a8d-c4ca-37c6-eb04-ea33bb50b397")
public static final String FIELDNAME_Project_ProjectCategory="4e954a8d-c4ca-37c6-eb04-ea33bb50b397";

@XendraTrl(Identifier="053ba7c8-3ab3-8790-01b0-f00c0df2f755")
public static String es_PE_FIELD_ProjectDimension_ProjectCategory_Name="Categoría del Proyecto";

@XendraTrl(Identifier="053ba7c8-3ab3-8790-01b0-f00c0df2f755")
public static String es_PE_FIELD_ProjectDimension_ProjectCategory_Description="Categoría del Proyecto";

@XendraTrl(Identifier="053ba7c8-3ab3-8790-01b0-f00c0df2f755")
public static String es_PE_FIELD_ProjectDimension_ProjectCategory_Help="La categoría del proyecto determina el comportamiento del proyecto:General - ninguna contabilidad especial, ej. para las pre-ventas ó seguir generalEl servicio - ninguna contabilidad especial, ej. para la orden de trabajo de los proyectos de Servicio/carga - crea las transacciones de Proyecto/Job WIP - capacidad de publicar activo material - crea las transacciones del activode proyecto - capacidad de publicar el material";

@XendraField(AD_Column_ID="ProjectCategory",IsCentrallyMaintained=true,
AD_Tab_ID="02aad880-ede5-9625-7a02-a7cd29a37e4b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="053ba7c8-3ab3-8790-01b0-f00c0df2f755")
public static final String FIELDNAME_ProjectDimension_ProjectCategory="053ba7c8-3ab3-8790-01b0-f00c0df2f755";

@XendraTrl(Identifier="29fa05dd-4d57-4561-9a33-1eeaebab933d")
public static String es_PE_FIELD_Project_ProjectCategory2_Name="Categoría del Proyecto";

@XendraTrl(Identifier="29fa05dd-4d57-4561-9a33-1eeaebab933d")
public static String es_PE_FIELD_Project_ProjectCategory2_Description="Categoría del Proyecto";

@XendraTrl(Identifier="29fa05dd-4d57-4561-9a33-1eeaebab933d")
public static String es_PE_FIELD_Project_ProjectCategory2_Help="La categoría del proyecto determina el comportamiento del proyecto:General - ninguna contabilidad especial, ej. para las pre-ventas ó seguir generalEl servicio - ninguna contabilidad especial, ej. para la orden de trabajo de los proyectos de Servicio/carga - crea las transacciones de Proyecto/Job WIP - capacidad de publicar activo material - crea las transacciones del activode proyecto - capacidad de publicar el material";

@XendraField(AD_Column_ID="ProjectCategory",IsCentrallyMaintained=true,
AD_Tab_ID="6e167a11-3402-2b3f-7348-98f2a8c53e4f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="29fa05dd-4d57-4561-9a33-1eeaebab933d")
public static final String FIELDNAME_Project_ProjectCategory2="29fa05dd-4d57-4561-9a33-1eeaebab933d";

@XendraTrl(Identifier="931d28c9-5362-0b1e-881a-716bf063274b")
public static String es_PE_COLUMN_ProjectCategory_Name="Categoría del Proyecto";

@XendraColumn(AD_Element_ID="57d9003e-8bd3-6171-c498-5ddff97037fd",ColumnName="ProjectCategory",
AD_Reference_ID=17,AD_Reference_Value_ID="dd876d4c-6a7f-9d8e-4f7c-480645f3079a",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="931d28c9-5362-0b1e-881a-716bf063274b",Synchronized="2019-08-30 22:22:07.0")
/** Column name ProjectCategory */
public static final String COLUMNNAME_ProjectCategory = "ProjectCategory";
/** Set Line Level.
@param ProjectLineLevel Project Line Level */
public void setProjectLineLevel (String ProjectLineLevel)
{
if (ProjectLineLevel.length() > 1)
{
log.warning("Length > 1 - truncated");
ProjectLineLevel = ProjectLineLevel.substring(0,0);
}
set_Value (COLUMNNAME_ProjectLineLevel, ProjectLineLevel);
}
/** Get Line Level.
@return Project Line Level */
public String getProjectLineLevel() 
{
return (String)get_Value(COLUMNNAME_ProjectLineLevel);
}

@XendraTrl(Identifier="65227704-9a94-d6af-80cc-aec20dd3f637")
public static String es_PE_FIELD_Project_LineLevel_Name="Line Level";

@XendraTrl(Identifier="65227704-9a94-d6af-80cc-aec20dd3f637")
public static String es_PE_FIELD_Project_LineLevel_Description="Project Line Level";

@XendraTrl(Identifier="65227704-9a94-d6af-80cc-aec20dd3f637")
public static String es_PE_FIELD_Project_LineLevel_Help="Level on which Project Lines are maintained";

@XendraField(AD_Column_ID="ProjectLineLevel",IsCentrallyMaintained=true,
AD_Tab_ID="2625db45-80e5-cf62-d154-74aea56ba068",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@=N",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="65227704-9a94-d6af-80cc-aec20dd3f637")
public static final String FIELDNAME_Project_LineLevel="65227704-9a94-d6af-80cc-aec20dd3f637";

@XendraTrl(Identifier="9d07cf88-b9fc-95e1-a7a3-58f4e9c6eadd")
public static String es_PE_COLUMN_ProjectLineLevel_Name="Line Level";

@XendraColumn(AD_Element_ID="07535595-63fe-175b-d621-084008a1cfe3",ColumnName="ProjectLineLevel",
AD_Reference_ID=17,AD_Reference_Value_ID="d73f5ccf-2a32-0ae0-e894-e94ff7a37db6",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="P",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=true,ColumnSQL="",IsAllowLogging=false,
Identifier="9d07cf88-b9fc-95e1-a7a3-58f4e9c6eadd",Synchronized="2019-08-30 22:22:07.0")
/** Column name ProjectLineLevel */
public static final String COLUMNNAME_ProjectLineLevel = "ProjectLineLevel";
/** Set Invoice Rule.
@param ProjInvoiceRule Invoice Rule for the project */
public void setProjInvoiceRule (String ProjInvoiceRule)
{
if (ProjInvoiceRule.length() > 1)
{
log.warning("Length > 1 - truncated");
ProjInvoiceRule = ProjInvoiceRule.substring(0,0);
}
set_Value (COLUMNNAME_ProjInvoiceRule, ProjInvoiceRule);
}
/** Get Invoice Rule.
@return Invoice Rule for the project */
public String getProjInvoiceRule() 
{
return (String)get_Value(COLUMNNAME_ProjInvoiceRule);
}

@XendraTrl(Identifier="0c663d2d-d17b-7403-4b97-acc6bb8de369")
public static String es_PE_FIELD_Project_InvoiceRule_Name="Invoice Rule";

@XendraTrl(Identifier="0c663d2d-d17b-7403-4b97-acc6bb8de369")
public static String es_PE_FIELD_Project_InvoiceRule_Description="Invoice Rule for the project";

@XendraTrl(Identifier="0c663d2d-d17b-7403-4b97-acc6bb8de369")
public static String es_PE_FIELD_Project_InvoiceRule_Help="The Invoice Rule for the project determines how orders (and consequently invoices) are created.  The selection on project level can be overwritten on Phase or Task";

@XendraField(AD_Column_ID="ProjInvoiceRule",IsCentrallyMaintained=true,
AD_Tab_ID="2625db45-80e5-cf62-d154-74aea56ba068",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@=N",DisplayLength=1,IsReadOnly=false,SeqNo=280,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0c663d2d-d17b-7403-4b97-acc6bb8de369")
public static final String FIELDNAME_Project_InvoiceRule="0c663d2d-d17b-7403-4b97-acc6bb8de369";

@XendraTrl(Identifier="ac0808f3-86ca-4121-650f-6ca3f1236ee4")
public static String es_PE_FIELD_Project_InvoiceRule2_Name="Invoice Rule";

@XendraTrl(Identifier="ac0808f3-86ca-4121-650f-6ca3f1236ee4")
public static String es_PE_FIELD_Project_InvoiceRule2_Description="Invoice Rule for the project";

@XendraTrl(Identifier="ac0808f3-86ca-4121-650f-6ca3f1236ee4")
public static String es_PE_FIELD_Project_InvoiceRule2_Help="The Invoice Rule for the project determines how orders (and consequently invoices) are created.  The selection on project level can be overwritten on Phase or Task";

@XendraField(AD_Column_ID="ProjInvoiceRule",IsCentrallyMaintained=true,
AD_Tab_ID="6e167a11-3402-2b3f-7348-98f2a8c53e4f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@=N",DisplayLength=1,IsReadOnly=false,SeqNo=270,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ac0808f3-86ca-4121-650f-6ca3f1236ee4")
public static final String FIELDNAME_Project_InvoiceRule2="ac0808f3-86ca-4121-650f-6ca3f1236ee4";

@XendraTrl(Identifier="cabf8b7c-8a21-fce7-68a8-fd27b71fd1b8")
public static String es_PE_COLUMN_ProjInvoiceRule_Name="Invoice Rule";

@XendraColumn(AD_Element_ID="01fd82ab-ea43-1c18-3987-72651eee91de",ColumnName="ProjInvoiceRule",
AD_Reference_ID=17,AD_Reference_Value_ID="d99f06b4-e2f5-c1c0-def9-657548c5f17d",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="-",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="cabf8b7c-8a21-fce7-68a8-fd27b71fd1b8",Synchronized="2019-08-30 22:22:07.0")
/** Column name ProjInvoiceRule */
public static final String COLUMNNAME_ProjInvoiceRule = "ProjInvoiceRule";
/** Set Sales Representative.
@param SalesRep_ID Sales Representative or Company Agent */
public void setSalesRep_ID (int SalesRep_ID)
{
if (SalesRep_ID <= 0) set_Value (COLUMNNAME_SalesRep_ID, null);
 else 
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

@XendraTrl(Identifier="6ca763bc-c820-8146-44f8-2dd94ee30fa3")
public static String es_PE_FIELD_Project_SalesRepresentative_Name="Agente Cía";

@XendraTrl(Identifier="6ca763bc-c820-8146-44f8-2dd94ee30fa3")
public static String es_PE_FIELD_Project_SalesRepresentative_Description="Representante de Ventas";

@XendraTrl(Identifier="6ca763bc-c820-8146-44f8-2dd94ee30fa3")
public static String es_PE_FIELD_Project_SalesRepresentative_Help="El representante de ventas indica el representante de ventas para esta región.";

@XendraField(AD_Column_ID="SalesRep_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2625db45-80e5-cf62-d154-74aea56ba068",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@=N",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6ca763bc-c820-8146-44f8-2dd94ee30fa3")
public static final String FIELDNAME_Project_SalesRepresentative="6ca763bc-c820-8146-44f8-2dd94ee30fa3";

@XendraTrl(Identifier="f0eed1f6-369b-c116-f4fd-81ff1f41f4de")
public static String es_PE_FIELD_ProjectDimension_SalesRepresentative_Name="Agente Cía";

@XendraTrl(Identifier="f0eed1f6-369b-c116-f4fd-81ff1f41f4de")
public static String es_PE_FIELD_ProjectDimension_SalesRepresentative_Description="Representante de Ventas";

@XendraTrl(Identifier="f0eed1f6-369b-c116-f4fd-81ff1f41f4de")
public static String es_PE_FIELD_ProjectDimension_SalesRepresentative_Help="El representante de ventas indica el representante de ventas para esta región.";

@XendraField(AD_Column_ID="SalesRep_ID",IsCentrallyMaintained=true,
AD_Tab_ID="02aad880-ede5-9625-7a02-a7cd29a37e4b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f0eed1f6-369b-c116-f4fd-81ff1f41f4de")
public static final String FIELDNAME_ProjectDimension_SalesRepresentative="f0eed1f6-369b-c116-f4fd-81ff1f41f4de";

@XendraTrl(Identifier="0cb947cb-c931-88c0-73e6-7d8bc050005d")
public static String es_PE_FIELD_Project_SalesRepresentative2_Name="Agente Cía";

@XendraTrl(Identifier="0cb947cb-c931-88c0-73e6-7d8bc050005d")
public static String es_PE_FIELD_Project_SalesRepresentative2_Description="Representante de Ventas";

@XendraTrl(Identifier="0cb947cb-c931-88c0-73e6-7d8bc050005d")
public static String es_PE_FIELD_Project_SalesRepresentative2_Help="El representante de ventas indica el representante de ventas para esta región.";

@XendraField(AD_Column_ID="SalesRep_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6e167a11-3402-2b3f-7348-98f2a8c53e4f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@=N",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0cb947cb-c931-88c0-73e6-7d8bc050005d")
public static final String FIELDNAME_Project_SalesRepresentative2="0cb947cb-c931-88c0-73e6-7d8bc050005d";

@XendraTrl(Identifier="c38edb23-1bf9-973a-ce6b-61e23addb154")
public static String es_PE_COLUMN_SalesRep_ID_Name="Agente Cía";

@XendraColumn(AD_Element_ID="197a9c3a-ff10-c291-d65f-5e05a36d3710",ColumnName="SalesRep_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="15251147-a1b6-4a83-a3a5-2d3ae7db69d9",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c38edb23-1bf9-973a-ce6b-61e23addb154",Synchronized="2019-08-30 22:22:07.0")
/** Column name SalesRep_ID */
public static final String COLUMNNAME_SalesRep_ID = "SalesRep_ID";
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
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getValue());
}

@XendraTrl(Identifier="f713e952-3096-5650-4757-0fa385d84ecd")
public static String es_PE_FIELD_Project_SearchKey_Name="Clave de Búsqueda";

@XendraTrl(Identifier="f713e952-3096-5650-4757-0fa385d84ecd")
public static String es_PE_FIELD_Project_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="f713e952-3096-5650-4757-0fa385d84ecd")
public static String es_PE_FIELD_Project_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="2625db45-80e5-cf62-d154-74aea56ba068",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=30,SortNo=-1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f713e952-3096-5650-4757-0fa385d84ecd")
public static final String FIELDNAME_Project_SearchKey="f713e952-3096-5650-4757-0fa385d84ecd";

@XendraTrl(Identifier="7e54f321-1745-047d-6cd3-c64b06cb850e")
public static String es_PE_FIELD_ProjectDimension_SearchKey_Name="Clave de Búsqueda";

@XendraTrl(Identifier="7e54f321-1745-047d-6cd3-c64b06cb850e")
public static String es_PE_FIELD_ProjectDimension_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="7e54f321-1745-047d-6cd3-c64b06cb850e")
public static String es_PE_FIELD_ProjectDimension_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="02aad880-ede5-9625-7a02-a7cd29a37e4b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=330,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7e54f321-1745-047d-6cd3-c64b06cb850e")
public static final String FIELDNAME_ProjectDimension_SearchKey="7e54f321-1745-047d-6cd3-c64b06cb850e";

@XendraTrl(Identifier="94626b9c-05c3-ae22-a6ca-8b7d070117d6")
public static String es_PE_FIELD_Project_SearchKey2_Name="Clave de Búsqueda";

@XendraTrl(Identifier="94626b9c-05c3-ae22-a6ca-8b7d070117d6")
public static String es_PE_FIELD_Project_SearchKey2_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="94626b9c-05c3-ae22-a6ca-8b7d070117d6")
public static String es_PE_FIELD_Project_SearchKey2_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="6e167a11-3402-2b3f-7348-98f2a8c53e4f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=30,SortNo=-1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="94626b9c-05c3-ae22-a6ca-8b7d070117d6")
public static final String FIELDNAME_Project_SearchKey2="94626b9c-05c3-ae22-a6ca-8b7d070117d6";

@XendraTrl(Identifier="8b869e15-c8bd-ab7e-350f-22de15b53a6f")
public static String es_PE_COLUMN_Value_Name="Clave de Búsqueda";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8b869e15-c8bd-ab7e-350f-22de15b53a6f",
Synchronized="2019-08-30 22:22:07.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
}
