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
/** Generated Model for C_BPartner
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_BPartner extends PO
{
/** Standard Constructor
@param ctx context
@param C_BPartner_ID id
@param trxName transaction
*/
public X_C_BPartner (Properties ctx, int C_BPartner_ID, String trxName)
{
super (ctx, C_BPartner_ID, trxName);
/** if (C_BPartner_ID == 0)
{
setC_BPartner_ID (0);
setC_BP_Group_ID (0);
setIsCustomer (false);	
// N
setIsEmployee (false);	
// N
setIsOneTime (false);	
// N
setIsProspect (false);	
// N
setIsRetention (false);	
// N
setIsSalesRep (false);	
// N
setIsSummary (false);	
// N
setIsVendor (false);	
// N
setName (null);
setSendEMail (false);	
// N
setSO_CreditLimit (Env.ZERO);	
// 0
setSO_CreditUsed (Env.ZERO);	
// 0
setValue (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_BPartner (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=291 */
public static int Table_ID=MTable.getTable_ID("C_BPartner");

@XendraTrl(Identifier="416668f1-2542-31b5-d4e6-0956786fe877")
public static String es_PE_TAB_BusinessPartner_Description="Seleccione un socio de negocio";

@XendraTrl(Identifier="416668f1-2542-31b5-d4e6-0956786fe877")
public static String es_PE_TAB_BusinessPartner_Help="Seleccione un socio de negocio para el acuerdo del porcentaje de disponibilidad";

@XendraTrl(Identifier="416668f1-2542-31b5-d4e6-0956786fe877")
public static String es_PE_TAB_BusinessPartner_Name="Socio de Negocio";

@XendraTab(Name="Business Partner",Description="Select Business Partner",
Help="Select the business partner for the service level agreement",
AD_Window_ID="c73cdd34-69c8-f9a1-85cc-cb0e427c8ec7",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="416668f1-2542-31b5-d4e6-0956786fe877",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_BusinessPartner="416668f1-2542-31b5-d4e6-0956786fe877";

@XendraTrl(Identifier="19045bbe-b174-7c8d-f0ba-50c270caa968")
public static String es_PE_TAB_Customer_Description="Socio de Negocio a ser facturado";

@XendraTrl(Identifier="19045bbe-b174-7c8d-f0ba-50c270caa968")
public static String es_PE_TAB_Customer_Name="Socio de Negocio";
@XendraTab(Name="Customer",
Description="Business Partner (Customers) to be invoiced",Help="",
AD_Window_ID="f00f61c4-b5c1-2481-0eb4-be8a127d0d12",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="C_BPartner.C_BPartner_ID IN (SELECT C_BPartner_ID  FROM S_TimeExpenseLine WHERE IsInvoiced='Y' AND C_OrderLine_ID IS NULL)",
OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="19045bbe-b174-7c8d-f0ba-50c270caa968",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Customer="19045bbe-b174-7c8d-f0ba-50c270caa968";

@XendraTrl(Identifier="72263edf-6c12-686e-9e83-8a3dda66b750")
public static String es_PE_TAB_Vendor_Description="Proveedor";

@XendraTrl(Identifier="72263edf-6c12-686e-9e83-8a3dda66b750")
public static String es_PE_TAB_Vendor_Help="La pestaña Proveedor despliega los proveedores. Un proveedor es seleccionado y todos los productos para ese proveedor son desplegados.";

@XendraTrl(Identifier="72263edf-6c12-686e-9e83-8a3dda66b750")
public static String es_PE_TAB_Vendor_Name="Proveedor";
@XendraTab(Name="Vendor",
Description="Vendor",
Help="The Vendor Tab displays the Vendors.  A Vendor is selected and all products for that Vendor will be displayed.",
AD_Window_ID="a274e93f-bb6e-8b17-ecfe-75f241a520d8",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="EXISTS (SELECT * FROM M_Product_PO po WHERE C_BPartner.C_BPartner_ID=po.C_BPartner_ID)",
OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="72263edf-6c12-686e-9e83-8a3dda66b750",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Vendor="72263edf-6c12-686e-9e83-8a3dda66b750";

@XendraTrl(Identifier="299b2fbf-3d76-e1a4-17c0-0967b06c1560")
public static String es_PE_TAB_Customer2_Description="Definir Parámetros del Cliente";

@XendraTrl(Identifier="299b2fbf-3d76-e1a4-17c0-0967b06c1560")
public static String es_PE_TAB_Customer2_Help="La pestaña Cliente define un Socio de Negocio quien es un cliente de esta organización. Si el cuadro de verificación Cliente es seleccionado entonces los campos relacionados a clientes son desplegados.";

@XendraTrl(Identifier="299b2fbf-3d76-e1a4-17c0-0967b06c1560")
public static String es_PE_TAB_Customer2_Name="Cliente";
@XendraTab(Name="Customer",
Description="Define Customer Parameters",
Help="The Customer Tab defines a Business Partner who is a customer of this organization.  If the Customer check box is selected then the necessary fields will display. ",
AD_Window_ID="273719a2-ec2e-9b44-d30b-014c7ec70d0e",SeqNo=20,TabLevel=1,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="acc03d31-68cb-29a6-7a07-0777c79a27c4",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="299b2fbf-3d76-e1a4-17c0-0967b06c1560",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Customer2="299b2fbf-3d76-e1a4-17c0-0967b06c1560";

@XendraTrl(Identifier="b2bfc776-3761-b9b2-504c-9bf75437aea6")
public static String es_PE_TAB_Vendor2_Description="Definir Parámetros del Proveedor";

@XendraTrl(Identifier="b2bfc776-3761-b9b2-504c-9bf75437aea6")
public static String es_PE_TAB_Vendor2_Help="La pestaña Proveedor define un socio de negocio que es un proveedor de esta organización. Si el cuadro de verificación Proveedor esta seleccionado; los campos relacionados a proveedores son desplegados.";

@XendraTrl(Identifier="b2bfc776-3761-b9b2-504c-9bf75437aea6")
public static String es_PE_TAB_Vendor2_Name="Proveedor";
@XendraTab(Name="Vendor",
Description="Define Vendor Parameters",
Help="The Vendor Tab defines a Business Partner that is a Vendor for this Organization.  If the Vendor check box is selected the necessary fields will display.",
AD_Window_ID="273719a2-ec2e-9b44-d30b-014c7ec70d0e",SeqNo=40,TabLevel=1,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="acc03d31-68cb-29a6-7a07-0777c79a27c4",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="b2bfc776-3761-b9b2-504c-9bf75437aea6",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Vendor2="b2bfc776-3761-b9b2-504c-9bf75437aea6";

@XendraTrl(Identifier="29b440ef-ac57-106d-efb0-6b9d79b47b43")
public static String es_PE_TAB_BusinessPartner2_Description="Socio de Negocio";

@XendraTrl(Identifier="29b440ef-ac57-106d-efb0-6b9d79b47b43")
public static String es_PE_TAB_BusinessPartner2_Help="La pestaña socio de negocio define las entidades con las cuales una organización se relaciona para los negocios.";

@XendraTrl(Identifier="29b440ef-ac57-106d-efb0-6b9d79b47b43")
public static String es_PE_TAB_BusinessPartner2_Name="Socio de Negocio";

@XendraTab(Name="Business Partner",Description="Business Partner",
Help="The Business Partner Tab defines any Entity with whom an organization transacts.",
AD_Window_ID="273719a2-ec2e-9b44-d30b-014c7ec70d0e",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="29b440ef-ac57-106d-efb0-6b9d79b47b43",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_BusinessPartner2="29b440ef-ac57-106d-efb0-6b9d79b47b43";

@XendraTrl(Identifier="2a79ebe5-d568-1475-72be-903be517767a")
public static String es_PE_TAB_EmployeeVendor_Description="Socio de Negocio para el reembolso";

@XendraTrl(Identifier="2a79ebe5-d568-1475-72be-903be517767a")
public static String es_PE_TAB_EmployeeVendor_Help="Selecciona un socio de negocio para el reembolso";

@XendraTrl(Identifier="2a79ebe5-d568-1475-72be-903be517767a")
public static String es_PE_TAB_EmployeeVendor_Name="Socio de Negocio";

@XendraTab(Name="Employee, Vendor",Description="Business Partner to be reimbursed",
Help="Select the business partner to be reimbursed.",
AD_Window_ID="ff165b6f-c3df-d9a1-01a0-146b19160d8f",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="C_BPartner.C_BPartner_ID IN (SELECT DISTINCT C_BPartner_ID  FROM S_TimeExpense WHERE Processed='Y')",
OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="2a79ebe5-d568-1475-72be-903be517767a",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_EmployeeVendor="2a79ebe5-d568-1475-72be-903be517767a";

@XendraTrl(Identifier="9c4579e0-1182-9236-587a-92aa1dca2224")
public static String es_PE_TAB_Employee_Description="Definir Parámetros del Empleado";

@XendraTrl(Identifier="9c4579e0-1182-9236-587a-92aa1dca2224")
public static String es_PE_TAB_Employee_Help="La pestaña Empleado define un socio de negocio quien es un empleado de esta organización. Si el empleado es también un representante de ventas entonces el cuadro de verificación correspondiente debe ser seleccionado.";

@XendraTrl(Identifier="9c4579e0-1182-9236-587a-92aa1dca2224")
public static String es_PE_TAB_Employee_Name="Empleado";
@XendraTab(Name="Employee",
Description="Define Employee Parameters",
Help="The Employee Tab defines a Business Partner who is an Employee of this organization.  If the Employee is also a Sales Representative then the check box should be selected.",
AD_Window_ID="273719a2-ec2e-9b44-d30b-014c7ec70d0e",SeqNo=60,TabLevel=1,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="acc03d31-68cb-29a6-7a07-0777c79a27c4",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="9c4579e0-1182-9236-587a-92aa1dca2224",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Employee="9c4579e0-1182-9236-587a-92aa1dca2224";

@XendraTrl(Identifier="17e5a850-85ab-57e1-9f3d-502c1c7f1831")
public static String es_PE_TAB_BusinessPartnerDimension_Description="Mantenga la dimensión del árbol de la contabilidad del socio de negocio.";

@XendraTrl(Identifier="17e5a850-85ab-57e1-9f3d-502c1c7f1831")
public static String es_PE_TAB_BusinessPartnerDimension_Help="¡Observe por favor que usted no podrá crear entidades nuevas en esta ventana si usted no tiene defecto fijado para todos los valores obligatorios!.";

@XendraTrl(Identifier="17e5a850-85ab-57e1-9f3d-502c1c7f1831")
public static String es_PE_TAB_BusinessPartnerDimension_Name="Dimensión Socio de Negocio";

@XendraTab(Name="Business Partner Dimension",
Description="Maintain Business Partner Accounting Dimension Tree",
Help="Please note that you will not be able to create new entities in this window if you have not default set for all mandatory values! ",
AD_Window_ID="6d82a0ab-8b9a-fa56-aec1-277a04b274a1",SeqNo=50,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=true,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="17e5a850-85ab-57e1-9f3d-502c1c7f1831",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_BusinessPartnerDimension="17e5a850-85ab-57e1-9f3d-502c1c7f1831";

@XendraTrl(Identifier="2a47484b-9983-5746-36ef-1c52d0a061f8")
public static String es_PE_TAB_PartnerSelection_Description="Selección socios de negocio";

@XendraTrl(Identifier="2a47484b-9983-5746-36ef-1c52d0a061f8")
public static String es_PE_TAB_PartnerSelection_Name="Selección Socios de Negocio";

@XendraTab(Name="Partner Selection",Description="Business Partner Selection",Help="",
AD_Window_ID="57133321-6993-bd92-eb4e-d35c10b15e95",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,AD_Column_ID="",HasTree=false,
WhereClause="C_BPartner.IsSummary='N'",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="2a47484b-9983-5746-36ef-1c52d0a061f8",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_PartnerSelection="2a47484b-9983-5746-36ef-1c52d0a061f8";

@XendraTrl(Identifier="2ccb5b44-3357-5781-d488-70b4068133a1")
public static String es_PE_TAB_AssignedPartners_Description="Socios del Negocio en Grupo";

@XendraTrl(Identifier="2ccb5b44-3357-5781-d488-70b4068133a1")
public static String es_PE_TAB_AssignedPartners_Name="Socios Asignados ";

@XendraTab(Name="Assigned Partners",Description="Business Partners in Group",Help="",
AD_Window_ID="96da4345-d601-5a94-1f7c-420540a4b3c4",SeqNo=30,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="5ab868c4-ac10-4cbe-4a87-af76d3e43e00",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="2ccb5b44-3357-5781-d488-70b4068133a1",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_AssignedPartners="2ccb5b44-3357-5781-d488-70b4068133a1";

@XendraTrl(Identifier="2f8e791c-cb85-2f96-193d-2f10013d2c8a")
public static String es_PE_TABLE_C_BPartner_Name="Socio de Negocio";

@XendraTable(Name="Business Partner ",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Identifies a Business Partner",
Help="",TableName="C_BPartner",AccessLevel="3",AD_Window_ID="273719a2-ec2e-9b44-d30b-014c7ec70d0e",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=70,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="2f8e791c-cb85-2f96-193d-2f10013d2c8a",Synchronized="2020-03-03 21:36:34.0")
/** TableName=C_BPartner */
public static final String Table_Name="C_BPartner";


@XendraIndex(Name="c_bpartner_name",Identifier="11b9b794-1921-694a-3428-8aea16230c08",
Column_Names="name",IsUnique="false",TableIdentifier="11b9b794-1921-694a-3428-8aea16230c08",
Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_bpartner_name = "11b9b794-1921-694a-3428-8aea16230c08";


@XendraIndex(Name="c_bpartner_value",Identifier="d60fc75b-0584-f7e3-f2f4-e62e050364e8",
Column_Names="ad_client_id, value",IsUnique="true",
TableIdentifier="d60fc75b-0584-f7e3-f2f4-e62e050364e8",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_bpartner_value = "d60fc75b-0584-f7e3-f2f4-e62e050364e8";


@XendraIndex(Name="c_bpartner_bporg",Identifier="9f1a4332-4797-bcd6-ed62-1db4da6f4b30",
Column_Names="ad_orgbp_id",IsUnique="false",TableIdentifier="9f1a4332-4797-bcd6-ed62-1db4da6f4b30",
Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_bpartner_bporg = "9f1a4332-4797-bcd6-ed62-1db4da6f4b30";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_BPartner");

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
    Table_ID = MTable.getTable_ID("C_BPartner");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_BPartner[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Acquisition Cost.
@param AcqusitionCost The cost of gaining the prospect as a customer */
public void setAcqusitionCost (BigDecimal AcqusitionCost)
{
set_Value (COLUMNNAME_AcqusitionCost, AcqusitionCost);
}
/** Get Acquisition Cost.
@return The cost of gaining the prospect as a customer */
public BigDecimal getAcqusitionCost() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AcqusitionCost);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="0f94feaa-4c69-efb7-97ad-b81dffc4d948")
public static String es_PE_FIELD_Vendor_AcquisitionCost_Name="Costo de Adquisición";

@XendraTrl(Identifier="0f94feaa-4c69-efb7-97ad-b81dffc4d948")
public static String es_PE_FIELD_Vendor_AcquisitionCost_Description="Costo de ganar el prospecto como cliente";

@XendraTrl(Identifier="0f94feaa-4c69-efb7-97ad-b81dffc4d948")
public static String es_PE_FIELD_Vendor_AcquisitionCost_Help="El costo de adquisición identifica el costo asociado con hacer de este prospecto un cliente";

@XendraField(AD_Column_ID="AcqusitionCost",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0f94feaa-4c69-efb7-97ad-b81dffc4d948")
public static final String FIELDNAME_Vendor_AcquisitionCost="0f94feaa-4c69-efb7-97ad-b81dffc4d948";

@XendraTrl(Identifier="2cd8f26b-382e-1f15-5fa1-4cb2b75c309c")
public static String es_PE_FIELD_BusinessPartnerDimension_AcquisitionCost_Name="Costo de Adquisición";

@XendraTrl(Identifier="2cd8f26b-382e-1f15-5fa1-4cb2b75c309c")
public static String es_PE_FIELD_BusinessPartnerDimension_AcquisitionCost_Description="Costo de ganar el prospecto como cliente";

@XendraTrl(Identifier="2cd8f26b-382e-1f15-5fa1-4cb2b75c309c")
public static String es_PE_FIELD_BusinessPartnerDimension_AcquisitionCost_Help="El costo de adquisición identifica el costo asociado con hacer de este prospecto un cliente";

@XendraField(AD_Column_ID="AcqusitionCost",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2cd8f26b-382e-1f15-5fa1-4cb2b75c309c")
public static final String FIELDNAME_BusinessPartnerDimension_AcquisitionCost="2cd8f26b-382e-1f15-5fa1-4cb2b75c309c";

@XendraTrl(Identifier="2bed9660-c246-7c6b-92fa-4847431c55eb")
public static String es_PE_FIELD_BusinessPartner_AcquisitionCost_Name="Costo de Adquisición";

@XendraTrl(Identifier="2bed9660-c246-7c6b-92fa-4847431c55eb")
public static String es_PE_FIELD_BusinessPartner_AcquisitionCost_Description="Costo de ganar el prospecto como cliente";

@XendraTrl(Identifier="2bed9660-c246-7c6b-92fa-4847431c55eb")
public static String es_PE_FIELD_BusinessPartner_AcquisitionCost_Help="El costo de adquisición identifica el costo asociado con hacer de este prospecto un cliente";

@XendraField(AD_Column_ID="AcqusitionCost",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2bed9660-c246-7c6b-92fa-4847431c55eb")
public static final String FIELDNAME_BusinessPartner_AcquisitionCost="2bed9660-c246-7c6b-92fa-4847431c55eb";

@XendraTrl(Identifier="0de04589-b89f-7774-5199-241754985dd6")
public static String es_PE_FIELD_Vendor_AcquisitionCost2_Name="Costo de Adquisición";

@XendraTrl(Identifier="0de04589-b89f-7774-5199-241754985dd6")
public static String es_PE_FIELD_Vendor_AcquisitionCost2_Description="Costo de ganar el prospecto como cliente";

@XendraTrl(Identifier="0de04589-b89f-7774-5199-241754985dd6")
public static String es_PE_FIELD_Vendor_AcquisitionCost2_Help="El costo de adquisición identifica el costo asociado con hacer de este prospecto un cliente";

@XendraField(AD_Column_ID="AcqusitionCost",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0de04589-b89f-7774-5199-241754985dd6")
public static final String FIELDNAME_Vendor_AcquisitionCost2="0de04589-b89f-7774-5199-241754985dd6";

@XendraTrl(Identifier="043bd27c-6177-42a1-cf9a-183493761bc4")
public static String es_PE_FIELD_AssignedPartners_AcquisitionCost_Name="Costo de Adquisición";

@XendraTrl(Identifier="043bd27c-6177-42a1-cf9a-183493761bc4")
public static String es_PE_FIELD_AssignedPartners_AcquisitionCost_Description="Costo de ganar el prospecto como cliente";

@XendraTrl(Identifier="043bd27c-6177-42a1-cf9a-183493761bc4")
public static String es_PE_FIELD_AssignedPartners_AcquisitionCost_Help="El costo de adquisición identifica el costo asociado con hacer de este prospecto un cliente";

@XendraField(AD_Column_ID="AcqusitionCost",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="043bd27c-6177-42a1-cf9a-183493761bc4")
public static final String FIELDNAME_AssignedPartners_AcquisitionCost="043bd27c-6177-42a1-cf9a-183493761bc4";

@XendraTrl(Identifier="72b3835e-791e-e76e-49ed-9bbb46431070")
public static String es_PE_FIELD_EmployeeVendor_AcquisitionCost_Name="Costo de Adquisición";

@XendraTrl(Identifier="72b3835e-791e-e76e-49ed-9bbb46431070")
public static String es_PE_FIELD_EmployeeVendor_AcquisitionCost_Description="Costo de ganar el prospecto como cliente";

@XendraTrl(Identifier="72b3835e-791e-e76e-49ed-9bbb46431070")
public static String es_PE_FIELD_EmployeeVendor_AcquisitionCost_Help="El costo de adquisición identifica el costo asociado con hacer de este prospecto un cliente";

@XendraField(AD_Column_ID="AcqusitionCost",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="72b3835e-791e-e76e-49ed-9bbb46431070")
public static final String FIELDNAME_EmployeeVendor_AcquisitionCost="72b3835e-791e-e76e-49ed-9bbb46431070";

@XendraTrl(Identifier="4bc680d4-4c48-2208-46e1-120b4d043f77")
public static String es_PE_FIELD_Customer_AcquisitionCost_Name="Costo de Adquisición";

@XendraTrl(Identifier="4bc680d4-4c48-2208-46e1-120b4d043f77")
public static String es_PE_FIELD_Customer_AcquisitionCost_Description="Costo de ganar el prospecto como cliente";

@XendraTrl(Identifier="4bc680d4-4c48-2208-46e1-120b4d043f77")
public static String es_PE_FIELD_Customer_AcquisitionCost_Help="El costo de adquisición identifica el costo asociado con hacer de este prospecto un cliente";

@XendraField(AD_Column_ID="AcqusitionCost",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4bc680d4-4c48-2208-46e1-120b4d043f77")
public static final String FIELDNAME_Customer_AcquisitionCost="4bc680d4-4c48-2208-46e1-120b4d043f77";

@XendraTrl(Identifier="7b0b80df-3e30-ac09-7516-1aaf1401f409")
public static String es_PE_FIELD_Employee_AcquisitionCost_Name="Costo de Adquisición";

@XendraTrl(Identifier="7b0b80df-3e30-ac09-7516-1aaf1401f409")
public static String es_PE_FIELD_Employee_AcquisitionCost_Description="Costo de ganar el prospecto como cliente";

@XendraTrl(Identifier="7b0b80df-3e30-ac09-7516-1aaf1401f409")
public static String es_PE_FIELD_Employee_AcquisitionCost_Help="El costo de adquisición identifica el costo asociado con hacer de este prospecto un cliente";

@XendraField(AD_Column_ID="AcqusitionCost",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7b0b80df-3e30-ac09-7516-1aaf1401f409")
public static final String FIELDNAME_Employee_AcquisitionCost="7b0b80df-3e30-ac09-7516-1aaf1401f409";

@XendraTrl(Identifier="a3ab51f0-c0de-8f38-200e-ac3287cacdbd")
public static String es_PE_FIELD_PartnerSelection_AcquisitionCost_Name="Costo de Adquisición";

@XendraTrl(Identifier="a3ab51f0-c0de-8f38-200e-ac3287cacdbd")
public static String es_PE_FIELD_PartnerSelection_AcquisitionCost_Description="Costo de ganar el prospecto como cliente";

@XendraTrl(Identifier="a3ab51f0-c0de-8f38-200e-ac3287cacdbd")
public static String es_PE_FIELD_PartnerSelection_AcquisitionCost_Help="El costo de adquisición identifica el costo asociado con hacer de este prospecto un cliente";

@XendraField(AD_Column_ID="AcqusitionCost",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a3ab51f0-c0de-8f38-200e-ac3287cacdbd")
public static final String FIELDNAME_PartnerSelection_AcquisitionCost="a3ab51f0-c0de-8f38-200e-ac3287cacdbd";

@XendraTrl(Identifier="996b5d51-feac-440b-c9de-da8efa7765ed")
public static String es_PE_FIELD_Customer_AcquisitionCost2_Name="Costo de Adquisición";

@XendraTrl(Identifier="996b5d51-feac-440b-c9de-da8efa7765ed")
public static String es_PE_FIELD_Customer_AcquisitionCost2_Description="Costo de ganar el prospecto como cliente";

@XendraTrl(Identifier="996b5d51-feac-440b-c9de-da8efa7765ed")
public static String es_PE_FIELD_Customer_AcquisitionCost2_Help="El costo de adquisición identifica el costo asociado con hacer de este prospecto un cliente";

@XendraField(AD_Column_ID="AcqusitionCost",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="996b5d51-feac-440b-c9de-da8efa7765ed")
public static final String FIELDNAME_Customer_AcquisitionCost2="996b5d51-feac-440b-c9de-da8efa7765ed";

@XendraTrl(Identifier="be2d587a-8380-dc62-8072-025c46e83684")
public static String es_PE_FIELD_BusinessPartner_AcquisitionCost2_Name="Costo de Adquisición";

@XendraTrl(Identifier="be2d587a-8380-dc62-8072-025c46e83684")
public static String es_PE_FIELD_BusinessPartner_AcquisitionCost2_Description="Costo de ganar el prospecto como cliente";

@XendraTrl(Identifier="be2d587a-8380-dc62-8072-025c46e83684")
public static String es_PE_FIELD_BusinessPartner_AcquisitionCost2_Help="El costo de adquisición identifica el costo asociado con hacer de este prospecto un cliente";

@XendraField(AD_Column_ID="AcqusitionCost",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsEmployee@=N",DisplayLength=26,IsReadOnly=false,SeqNo=200,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="be2d587a-8380-dc62-8072-025c46e83684")
public static final String FIELDNAME_BusinessPartner_AcquisitionCost2="be2d587a-8380-dc62-8072-025c46e83684";

@XendraTrl(Identifier="b922211b-a7a9-cfda-7ee3-f1726881bef7")
public static String es_PE_COLUMN_AcqusitionCost_Name="Costo de Adquisición";

@XendraColumn(AD_Element_ID="c1fb962c-964b-7c13-f4c9-afe92f7f36c5",ColumnName="AcqusitionCost",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b922211b-a7a9-cfda-7ee3-f1726881bef7",
Synchronized="2019-08-30 22:21:09.0")
/** Column name AcqusitionCost */
public static final String COLUMNNAME_AcqusitionCost = "AcqusitionCost";
/** Set Actual Life Time Value.
@param ActualLifeTimeValue Actual Life Time Revenue */
public void setActualLifeTimeValue (BigDecimal ActualLifeTimeValue)
{
set_Value (COLUMNNAME_ActualLifeTimeValue, ActualLifeTimeValue);
}
/** Get Actual Life Time Value.
@return Actual Life Time Revenue */
public BigDecimal getActualLifeTimeValue() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ActualLifeTimeValue);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="0f25cc57-f7d1-a946-54fc-f77f898d90da")
public static String es_PE_FIELD_BusinessPartnerDimension_ActualLifeTimeValue_Name="Tiempo de Vida Actual";

@XendraTrl(Identifier="0f25cc57-f7d1-a946-54fc-f77f898d90da")
public static String es_PE_FIELD_BusinessPartnerDimension_ActualLifeTimeValue_Description="Ingreso en el tiempo de vida real";

@XendraTrl(Identifier="0f25cc57-f7d1-a946-54fc-f77f898d90da")
public static String es_PE_FIELD_BusinessPartnerDimension_ActualLifeTimeValue_Help="El valor de tiempo de vida actual es el ingreso registrado y generado por este socio de negocio.";

@XendraField(AD_Column_ID="ActualLifeTimeValue",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0f25cc57-f7d1-a946-54fc-f77f898d90da")
public static final String FIELDNAME_BusinessPartnerDimension_ActualLifeTimeValue="0f25cc57-f7d1-a946-54fc-f77f898d90da";

@XendraTrl(Identifier="c06b2838-7e47-4b66-a39a-d3053b138a7d")
public static String es_PE_FIELD_EmployeeVendor_ActualLifeTimeValue_Name="Tiempo de Vida Actual";

@XendraTrl(Identifier="c06b2838-7e47-4b66-a39a-d3053b138a7d")
public static String es_PE_FIELD_EmployeeVendor_ActualLifeTimeValue_Description="Ingreso en el tiempo de vida real";

@XendraTrl(Identifier="c06b2838-7e47-4b66-a39a-d3053b138a7d")
public static String es_PE_FIELD_EmployeeVendor_ActualLifeTimeValue_Help="El valor de tiempo de vida actual es el ingreso registrado y generado por este socio de negocio.";

@XendraField(AD_Column_ID="ActualLifeTimeValue",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c06b2838-7e47-4b66-a39a-d3053b138a7d")
public static final String FIELDNAME_EmployeeVendor_ActualLifeTimeValue="c06b2838-7e47-4b66-a39a-d3053b138a7d";

@XendraTrl(Identifier="3270bdfe-8135-5844-c2aa-2ac5e23425e7")
public static String es_PE_FIELD_Employee_ActualLifeTimeValue_Name="Tiempo de Vida Actual";

@XendraTrl(Identifier="3270bdfe-8135-5844-c2aa-2ac5e23425e7")
public static String es_PE_FIELD_Employee_ActualLifeTimeValue_Description="Ingreso en el tiempo de vida real";

@XendraTrl(Identifier="3270bdfe-8135-5844-c2aa-2ac5e23425e7")
public static String es_PE_FIELD_Employee_ActualLifeTimeValue_Help="El valor de tiempo de vida actual es el ingreso registrado y generado por este socio de negocio.";

@XendraField(AD_Column_ID="ActualLifeTimeValue",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3270bdfe-8135-5844-c2aa-2ac5e23425e7")
public static final String FIELDNAME_Employee_ActualLifeTimeValue="3270bdfe-8135-5844-c2aa-2ac5e23425e7";

@XendraTrl(Identifier="68e46525-177f-94f7-96ca-ec14fdae15ed")
public static String es_PE_FIELD_Vendor_ActualLifeTimeValue_Name="Tiempo de Vida Actual";

@XendraTrl(Identifier="68e46525-177f-94f7-96ca-ec14fdae15ed")
public static String es_PE_FIELD_Vendor_ActualLifeTimeValue_Description="Ingreso en el tiempo de vida real";

@XendraTrl(Identifier="68e46525-177f-94f7-96ca-ec14fdae15ed")
public static String es_PE_FIELD_Vendor_ActualLifeTimeValue_Help="El valor de tiempo de vida actual es el ingreso registrado y generado por este socio de negocio.";

@XendraField(AD_Column_ID="ActualLifeTimeValue",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="68e46525-177f-94f7-96ca-ec14fdae15ed")
public static final String FIELDNAME_Vendor_ActualLifeTimeValue="68e46525-177f-94f7-96ca-ec14fdae15ed";

@XendraTrl(Identifier="ce2fdbfb-538d-98cf-3fac-58744697a53d")
public static String es_PE_FIELD_AssignedPartners_ActualLifeTimeValue_Name="Tiempo de Vida Actual";

@XendraTrl(Identifier="ce2fdbfb-538d-98cf-3fac-58744697a53d")
public static String es_PE_FIELD_AssignedPartners_ActualLifeTimeValue_Description="Ingreso en el tiempo de vida real";

@XendraTrl(Identifier="ce2fdbfb-538d-98cf-3fac-58744697a53d")
public static String es_PE_FIELD_AssignedPartners_ActualLifeTimeValue_Help="El valor de tiempo de vida actual es el ingreso registrado y generado por este socio de negocio.";

@XendraField(AD_Column_ID="ActualLifeTimeValue",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=230,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ce2fdbfb-538d-98cf-3fac-58744697a53d")
public static final String FIELDNAME_AssignedPartners_ActualLifeTimeValue="ce2fdbfb-538d-98cf-3fac-58744697a53d";

@XendraTrl(Identifier="6304f142-8d92-906d-1594-27ca1c2345d4")
public static String es_PE_FIELD_Vendor_ActualLifeTimeValue2_Name="Tiempo de Vida Actual";

@XendraTrl(Identifier="6304f142-8d92-906d-1594-27ca1c2345d4")
public static String es_PE_FIELD_Vendor_ActualLifeTimeValue2_Description="Ingreso en el tiempo de vida real";

@XendraTrl(Identifier="6304f142-8d92-906d-1594-27ca1c2345d4")
public static String es_PE_FIELD_Vendor_ActualLifeTimeValue2_Help="El valor de tiempo de vida actual es el ingreso registrado y generado por este socio de negocio.";

@XendraField(AD_Column_ID="ActualLifeTimeValue",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6304f142-8d92-906d-1594-27ca1c2345d4")
public static final String FIELDNAME_Vendor_ActualLifeTimeValue2="6304f142-8d92-906d-1594-27ca1c2345d4";

@XendraTrl(Identifier="1b768257-4ce7-bb97-6eef-e7d278337f8b")
public static String es_PE_FIELD_PartnerSelection_ActualLifeTimeValue_Name="Tiempo de Vida Actual";

@XendraTrl(Identifier="1b768257-4ce7-bb97-6eef-e7d278337f8b")
public static String es_PE_FIELD_PartnerSelection_ActualLifeTimeValue_Description="Ingreso en el tiempo de vida real";

@XendraTrl(Identifier="1b768257-4ce7-bb97-6eef-e7d278337f8b")
public static String es_PE_FIELD_PartnerSelection_ActualLifeTimeValue_Help="El valor de tiempo de vida actual es el ingreso registrado y generado por este socio de negocio.";

@XendraField(AD_Column_ID="ActualLifeTimeValue",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1b768257-4ce7-bb97-6eef-e7d278337f8b")
public static final String FIELDNAME_PartnerSelection_ActualLifeTimeValue="1b768257-4ce7-bb97-6eef-e7d278337f8b";

@XendraTrl(Identifier="fc338934-d2be-cf1c-88a4-85695a8bc24d")
public static String es_PE_FIELD_Customer_ActualLifeTimeValue_Name="Tiempo de Vida Actual";

@XendraTrl(Identifier="fc338934-d2be-cf1c-88a4-85695a8bc24d")
public static String es_PE_FIELD_Customer_ActualLifeTimeValue_Description="Ingreso en el tiempo de vida real";

@XendraTrl(Identifier="fc338934-d2be-cf1c-88a4-85695a8bc24d")
public static String es_PE_FIELD_Customer_ActualLifeTimeValue_Help="El valor de tiempo de vida actual es el ingreso registrado y generado por este socio de negocio.";

@XendraField(AD_Column_ID="ActualLifeTimeValue",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fc338934-d2be-cf1c-88a4-85695a8bc24d")
public static final String FIELDNAME_Customer_ActualLifeTimeValue="fc338934-d2be-cf1c-88a4-85695a8bc24d";

@XendraTrl(Identifier="42c590b0-be28-2faa-ca80-35eccf915d1f")
public static String es_PE_FIELD_BusinessPartner_ActualLifeTimeValue_Name="Tiempo de Vida Actual";

@XendraTrl(Identifier="42c590b0-be28-2faa-ca80-35eccf915d1f")
public static String es_PE_FIELD_BusinessPartner_ActualLifeTimeValue_Description="Ingreso en el tiempo de vida real";

@XendraTrl(Identifier="42c590b0-be28-2faa-ca80-35eccf915d1f")
public static String es_PE_FIELD_BusinessPartner_ActualLifeTimeValue_Help="El valor de tiempo de vida actual es el ingreso registrado y generado por este socio de negocio.";

@XendraField(AD_Column_ID="ActualLifeTimeValue",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=160,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="42c590b0-be28-2faa-ca80-35eccf915d1f")
public static final String FIELDNAME_BusinessPartner_ActualLifeTimeValue="42c590b0-be28-2faa-ca80-35eccf915d1f";

@XendraTrl(Identifier="e0db94f4-405a-01e2-4574-f522b033e4c0")
public static String es_PE_FIELD_Customer_ActualLifeTimeValue2_Name="Tiempo de Vida Actual";

@XendraTrl(Identifier="e0db94f4-405a-01e2-4574-f522b033e4c0")
public static String es_PE_FIELD_Customer_ActualLifeTimeValue2_Description="Ingreso en el tiempo de vida real";

@XendraTrl(Identifier="e0db94f4-405a-01e2-4574-f522b033e4c0")
public static String es_PE_FIELD_Customer_ActualLifeTimeValue2_Help="El valor de tiempo de vida actual es el ingreso registrado y generado por este socio de negocio.";

@XendraField(AD_Column_ID="ActualLifeTimeValue",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e0db94f4-405a-01e2-4574-f522b033e4c0")
public static final String FIELDNAME_Customer_ActualLifeTimeValue2="e0db94f4-405a-01e2-4574-f522b033e4c0";

@XendraTrl(Identifier="8442afff-0af4-8ac7-4bd3-0811db994d46")
public static String es_PE_FIELD_BusinessPartner_ActualLifeTimeValue2_Name="Tiempo de Vida Actual";

@XendraTrl(Identifier="8442afff-0af4-8ac7-4bd3-0811db994d46")
public static String es_PE_FIELD_BusinessPartner_ActualLifeTimeValue2_Description="Ingreso en el tiempo de vida real";

@XendraTrl(Identifier="8442afff-0af4-8ac7-4bd3-0811db994d46")
public static String es_PE_FIELD_BusinessPartner_ActualLifeTimeValue2_Help="El valor de tiempo de vida actual es el ingreso registrado y generado por este socio de negocio.";

@XendraField(AD_Column_ID="ActualLifeTimeValue",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsEmployee@=N",DisplayLength=26,IsReadOnly=true,SeqNo=190,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8442afff-0af4-8ac7-4bd3-0811db994d46")
public static final String FIELDNAME_BusinessPartner_ActualLifeTimeValue2="8442afff-0af4-8ac7-4bd3-0811db994d46";

@XendraTrl(Identifier="4c5225b3-223e-8080-6723-7e26008b953e")
public static String es_PE_COLUMN_ActualLifeTimeValue_Name="Tiempo de Vida Actual";

@XendraColumn(AD_Element_ID="c8e669f0-6e57-42a8-2fd4-0635228e5d0a",
ColumnName="ActualLifeTimeValue",AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="4c5225b3-223e-8080-6723-7e26008b953e",Synchronized="2019-08-30 22:21:09.0")
/** Column name ActualLifeTimeValue */
public static final String COLUMNNAME_ActualLifeTimeValue = "ActualLifeTimeValue";
/** Set Language.
@param AD_Language Language for this entity */
public void setAD_Language (String AD_Language)
{
if (AD_Language != null && AD_Language.length() > 6)
{
log.warning("Length > 6 - truncated");
AD_Language = AD_Language.substring(0,5);
}
set_Value (COLUMNNAME_AD_Language, AD_Language);
}
/** Get Language.
@return Language for this entity */
public String getAD_Language() 
{
return (String)get_Value(COLUMNNAME_AD_Language);
}

@XendraTrl(Identifier="489c460e-1c94-9ab0-b6ea-8b11f96f8cf3")
public static String es_PE_FIELD_PartnerSelection_Language_Name="Lenguaje";

@XendraTrl(Identifier="489c460e-1c94-9ab0-b6ea-8b11f96f8cf3")
public static String es_PE_FIELD_PartnerSelection_Language_Description="Lenguaje para esta aplicación";

@XendraTrl(Identifier="489c460e-1c94-9ab0-b6ea-8b11f96f8cf3")
public static String es_PE_FIELD_PartnerSelection_Language_Help="El lenguaje identifica el lenguaje a usar para el despliegue";

@XendraField(AD_Column_ID="AD_Language",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="489c460e-1c94-9ab0-b6ea-8b11f96f8cf3")
public static final String FIELDNAME_PartnerSelection_Language="489c460e-1c94-9ab0-b6ea-8b11f96f8cf3";

@XendraTrl(Identifier="2821a084-118c-60bc-d196-4e3a8b492764")
public static String es_PE_FIELD_Employee_Language_Name="Lenguaje";

@XendraTrl(Identifier="2821a084-118c-60bc-d196-4e3a8b492764")
public static String es_PE_FIELD_Employee_Language_Description="Lenguaje para esta aplicación";

@XendraTrl(Identifier="2821a084-118c-60bc-d196-4e3a8b492764")
public static String es_PE_FIELD_Employee_Language_Help="El lenguaje identifica el lenguaje a usar para el despliegue";

@XendraField(AD_Column_ID="AD_Language",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2821a084-118c-60bc-d196-4e3a8b492764")
public static final String FIELDNAME_Employee_Language="2821a084-118c-60bc-d196-4e3a8b492764";

@XendraTrl(Identifier="6dcc96d6-b711-ac1f-2056-a39522c46259")
public static String es_PE_FIELD_BusinessPartnerDimension_Language_Name="Lenguaje";

@XendraTrl(Identifier="6dcc96d6-b711-ac1f-2056-a39522c46259")
public static String es_PE_FIELD_BusinessPartnerDimension_Language_Description="Lenguaje para esta aplicación";

@XendraTrl(Identifier="6dcc96d6-b711-ac1f-2056-a39522c46259")
public static String es_PE_FIELD_BusinessPartnerDimension_Language_Help="El lenguaje identifica el lenguaje a usar para el despliegue";

@XendraField(AD_Column_ID="AD_Language",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6dcc96d6-b711-ac1f-2056-a39522c46259")
public static final String FIELDNAME_BusinessPartnerDimension_Language="6dcc96d6-b711-ac1f-2056-a39522c46259";

@XendraTrl(Identifier="9dd3ccd5-3143-05d7-4d90-5a346789959e")
public static String es_PE_FIELD_Vendor_Language_Name="Lenguaje";

@XendraTrl(Identifier="9dd3ccd5-3143-05d7-4d90-5a346789959e")
public static String es_PE_FIELD_Vendor_Language_Description="Lenguaje para esta aplicación";

@XendraTrl(Identifier="9dd3ccd5-3143-05d7-4d90-5a346789959e")
public static String es_PE_FIELD_Vendor_Language_Help="El lenguaje identifica el lenguaje a usar para el despliegue";

@XendraField(AD_Column_ID="AD_Language",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9dd3ccd5-3143-05d7-4d90-5a346789959e")
public static final String FIELDNAME_Vendor_Language="9dd3ccd5-3143-05d7-4d90-5a346789959e";

@XendraTrl(Identifier="dbdfbb86-4ce2-0e12-201e-45cbebde24b5")
public static String es_PE_FIELD_Customer_Language_Name="Lenguaje";

@XendraTrl(Identifier="dbdfbb86-4ce2-0e12-201e-45cbebde24b5")
public static String es_PE_FIELD_Customer_Language_Description="Lenguaje para esta aplicación";

@XendraTrl(Identifier="dbdfbb86-4ce2-0e12-201e-45cbebde24b5")
public static String es_PE_FIELD_Customer_Language_Help="El lenguaje identifica el lenguaje a usar para el despliegue";

@XendraField(AD_Column_ID="AD_Language",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dbdfbb86-4ce2-0e12-201e-45cbebde24b5")
public static final String FIELDNAME_Customer_Language="dbdfbb86-4ce2-0e12-201e-45cbebde24b5";

@XendraTrl(Identifier="52aa7209-546e-ccaa-3f19-f3f8751980fb")
public static String es_PE_FIELD_EmployeeVendor_Language_Name="Lenguaje";

@XendraTrl(Identifier="52aa7209-546e-ccaa-3f19-f3f8751980fb")
public static String es_PE_FIELD_EmployeeVendor_Language_Description="Lenguaje para esta aplicación";

@XendraTrl(Identifier="52aa7209-546e-ccaa-3f19-f3f8751980fb")
public static String es_PE_FIELD_EmployeeVendor_Language_Help="El lenguaje identifica el lenguaje a usar para el despliegue";

@XendraField(AD_Column_ID="AD_Language",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="52aa7209-546e-ccaa-3f19-f3f8751980fb")
public static final String FIELDNAME_EmployeeVendor_Language="52aa7209-546e-ccaa-3f19-f3f8751980fb";

@XendraTrl(Identifier="dfbc382d-b978-f9b1-2cd6-2e38f1ef04bc")
public static String es_PE_FIELD_BusinessPartner_Language_Name="Lenguaje";

@XendraTrl(Identifier="dfbc382d-b978-f9b1-2cd6-2e38f1ef04bc")
public static String es_PE_FIELD_BusinessPartner_Language_Description="Lenguaje para esta aplicación";

@XendraTrl(Identifier="dfbc382d-b978-f9b1-2cd6-2e38f1ef04bc")
public static String es_PE_FIELD_BusinessPartner_Language_Help="El lenguaje identifica el lenguaje a usar para el despliegue";

@XendraField(AD_Column_ID="AD_Language",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dfbc382d-b978-f9b1-2cd6-2e38f1ef04bc")
public static final String FIELDNAME_BusinessPartner_Language="dfbc382d-b978-f9b1-2cd6-2e38f1ef04bc";

@XendraTrl(Identifier="4365cca7-8d45-fcb2-66f9-d6b4c2e9cdc0")
public static String es_PE_FIELD_Customer_Language2_Name="Lenguaje";

@XendraTrl(Identifier="4365cca7-8d45-fcb2-66f9-d6b4c2e9cdc0")
public static String es_PE_FIELD_Customer_Language2_Description="Lenguaje para esta aplicación";

@XendraTrl(Identifier="4365cca7-8d45-fcb2-66f9-d6b4c2e9cdc0")
public static String es_PE_FIELD_Customer_Language2_Help="El lenguaje identifica el lenguaje a usar para el despliegue";

@XendraField(AD_Column_ID="AD_Language",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4365cca7-8d45-fcb2-66f9-d6b4c2e9cdc0")
public static final String FIELDNAME_Customer_Language2="4365cca7-8d45-fcb2-66f9-d6b4c2e9cdc0";

@XendraTrl(Identifier="93110a2d-1654-5aec-8124-b96325305db0")
public static String es_PE_FIELD_AssignedPartners_Language_Name="Language";

@XendraTrl(Identifier="93110a2d-1654-5aec-8124-b96325305db0")
public static String es_PE_FIELD_AssignedPartners_Language_Description="Language for this Business Partner if Multi-Language enabled";

@XendraTrl(Identifier="93110a2d-1654-5aec-8124-b96325305db0")
public static String es_PE_FIELD_AssignedPartners_Language_Help="The Language identifies the language to use for display and formatting documents. It requires, that on Client level, Multi-Lingual documents are selected and that you have created/loaded the language.";

@XendraField(AD_Column_ID="AD_Language",IsCentrallyMaintained=false,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="93110a2d-1654-5aec-8124-b96325305db0")
public static final String FIELDNAME_AssignedPartners_Language="93110a2d-1654-5aec-8124-b96325305db0";

@XendraTrl(Identifier="57d95189-4ed3-f1e0-93fe-92dec360eec1")
public static String es_PE_FIELD_Vendor_Language2_Name="Lenguaje";

@XendraTrl(Identifier="57d95189-4ed3-f1e0-93fe-92dec360eec1")
public static String es_PE_FIELD_Vendor_Language2_Description="Lenguaje para esta aplicación";

@XendraTrl(Identifier="57d95189-4ed3-f1e0-93fe-92dec360eec1")
public static String es_PE_FIELD_Vendor_Language2_Help="El lenguaje identifica el lenguaje a usar para el despliegue";

@XendraField(AD_Column_ID="AD_Language",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="57d95189-4ed3-f1e0-93fe-92dec360eec1")
public static final String FIELDNAME_Vendor_Language2="57d95189-4ed3-f1e0-93fe-92dec360eec1";

@XendraTrl(Identifier="b30b9db2-98d7-efc3-844f-e6084b5a8399")
public static String es_PE_FIELD_BusinessPartner_Language2_Name="Lenguaje";

@XendraTrl(Identifier="b30b9db2-98d7-efc3-844f-e6084b5a8399")
public static String es_PE_FIELD_BusinessPartner_Language2_Description="Lenguaje para esta aplicación";

@XendraTrl(Identifier="b30b9db2-98d7-efc3-844f-e6084b5a8399")
public static String es_PE_FIELD_BusinessPartner_Language2_Help="El lenguaje identifica el lenguaje a usar para el despliegue";

@XendraField(AD_Column_ID="AD_Language",IsCentrallyMaintained=false,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b30b9db2-98d7-efc3-844f-e6084b5a8399")
public static final String FIELDNAME_BusinessPartner_Language2="b30b9db2-98d7-efc3-844f-e6084b5a8399";

@XendraTrl(Identifier="965dbaa1-f1c9-f7c6-dc5e-3ed4eff10604")
public static String es_PE_COLUMN_AD_Language_Name="Lenguaje";

@XendraColumn(AD_Element_ID="d542d9da-4627-0da8-89af-5797f22de434",ColumnName="AD_Language",
AD_Reference_ID=18,AD_Reference_Value_ID="205708de-88ce-3bee-b5b6-bf6fdc34a384",AD_Val_Rule_ID="",
FieldLength=6,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="965dbaa1-f1c9-f7c6-dc5e-3ed4eff10604",Synchronized="2019-08-30 22:21:09.0")
/** Column name AD_Language */
public static final String COLUMNNAME_AD_Language = "AD_Language";
/** Set Linked Organization.
@param AD_OrgBP_ID The Business Partner is another Organization for explicit Inter-Org transactions */
public void setAD_OrgBP_ID (String AD_OrgBP_ID)
{
if (AD_OrgBP_ID != null && AD_OrgBP_ID.length() > 22)
{
log.warning("Length > 22 - truncated");
AD_OrgBP_ID = AD_OrgBP_ID.substring(0,21);
}
set_Value (COLUMNNAME_AD_OrgBP_ID, AD_OrgBP_ID);
}
/** Get Linked Organization.
@return The Business Partner is another Organization for explicit Inter-Org transactions */
public String getAD_OrgBP_ID() 
{
return (String)get_Value(COLUMNNAME_AD_OrgBP_ID);
}

@XendraTrl(Identifier="f66ded0f-de07-1b35-4595-17be97eceb1b")
public static String es_PE_FIELD_Vendor_LinkOrganization_Name="Liga Organización";

@XendraTrl(Identifier="f66ded0f-de07-1b35-4595-17be97eceb1b")
public static String es_PE_FIELD_Vendor_LinkOrganization_Description="Integración de Socio de Negocio a una Organización";

@XendraTrl(Identifier="f66ded0f-de07-1b35-4595-17be97eceb1b")
public static String es_PE_FIELD_Vendor_LinkOrganization_Help="Si el socio de negocio esta en otra organización, seleccione la organización o fije para crear una nueva organización. Usted liga a socio de negocio a una organización para crear los documentos explícitos para la Integración-Org transacción. Si usted crea una nueva organización, usted puede proveer un tipo de la organización. Si usted selecciona un rol, el acceso a la nueva organización se limita a ese rol, si no todo los roles (no manual) del cliente tendrán acceso a la nueva organización.";

@XendraField(AD_Column_ID="AD_OrgBP_ID",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f66ded0f-de07-1b35-4595-17be97eceb1b")
public static final String FIELDNAME_Vendor_LinkOrganization="f66ded0f-de07-1b35-4595-17be97eceb1b";

@XendraTrl(Identifier="d906069d-2a2e-8056-3f72-151ed61540fe")
public static String es_PE_FIELD_EmployeeVendor_LinkOrganization_Name="Liga Organización";

@XendraTrl(Identifier="d906069d-2a2e-8056-3f72-151ed61540fe")
public static String es_PE_FIELD_EmployeeVendor_LinkOrganization_Description="Integración de Socio de Negocio a una Organización";

@XendraTrl(Identifier="d906069d-2a2e-8056-3f72-151ed61540fe")
public static String es_PE_FIELD_EmployeeVendor_LinkOrganization_Help="Si el socio de negocio esta en otra organización, seleccione la organización o fije para crear una nueva organización. Usted liga a socio de negocio a una organización para crear los documentos explícitos para la Integración-Org transacción. Si usted crea una nueva organización, usted puede proveer un tipo de la organización. Si usted selecciona un rol, el acceso a la nueva organización se limita a ese rol, si no todo los roles (no manual) del cliente tendrán acceso a la nueva organización.";

@XendraField(AD_Column_ID="AD_OrgBP_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d906069d-2a2e-8056-3f72-151ed61540fe")
public static final String FIELDNAME_EmployeeVendor_LinkOrganization="d906069d-2a2e-8056-3f72-151ed61540fe";

@XendraTrl(Identifier="afdeeb2d-1e2c-8992-2e22-66f76d92210b")
public static String es_PE_FIELD_Customer_LinkOrganization_Name="Liga Organización";

@XendraTrl(Identifier="afdeeb2d-1e2c-8992-2e22-66f76d92210b")
public static String es_PE_FIELD_Customer_LinkOrganization_Description="Integración de Socio de Negocio a una Organización";

@XendraTrl(Identifier="afdeeb2d-1e2c-8992-2e22-66f76d92210b")
public static String es_PE_FIELD_Customer_LinkOrganization_Help="Si el socio de negocio esta en otra organización, seleccione la organización o fije para crear una nueva organización. Usted liga a socio de negocio a una organización para crear los documentos explícitos para la Integración-Org transacción. Si usted crea una nueva organización, usted puede proveer un tipo de la organización. Si usted selecciona un rol, el acceso a la nueva organización se limita a ese rol, si no todo los roles (no manual) del cliente tendrán acceso a la nueva organización.";

@XendraField(AD_Column_ID="AD_OrgBP_ID",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="afdeeb2d-1e2c-8992-2e22-66f76d92210b")
public static final String FIELDNAME_Customer_LinkOrganization="afdeeb2d-1e2c-8992-2e22-66f76d92210b";

@XendraTrl(Identifier="60f027c5-b0f5-00c7-803a-6d8f9becef4a")
public static String es_PE_FIELD_Employee_LinkOrganization_Name="Liga Organización";

@XendraTrl(Identifier="60f027c5-b0f5-00c7-803a-6d8f9becef4a")
public static String es_PE_FIELD_Employee_LinkOrganization_Description="Integración de Socio de Negocio a una Organización";

@XendraTrl(Identifier="60f027c5-b0f5-00c7-803a-6d8f9becef4a")
public static String es_PE_FIELD_Employee_LinkOrganization_Help="Si el socio de negocio esta en otra organización, seleccione la organización o fije para crear una nueva organización. Usted liga a socio de negocio a una organización para crear los documentos explícitos para la Integración-Org transacción. Si usted crea una nueva organización, usted puede proveer un tipo de la organización. Si usted selecciona un rol, el acceso a la nueva organización se limita a ese rol, si no todo los roles (no manual) del cliente tendrán acceso a la nueva organización.";

@XendraField(AD_Column_ID="AD_OrgBP_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="60f027c5-b0f5-00c7-803a-6d8f9becef4a")
public static final String FIELDNAME_Employee_LinkOrganization="60f027c5-b0f5-00c7-803a-6d8f9becef4a";

@XendraTrl(Identifier="d4a5bf89-9d61-9ef0-9a02-7a24e48c7339")
public static String es_PE_FIELD_BusinessPartnerDimension_LinkOrganization_Name="Liga Organización";

@XendraTrl(Identifier="d4a5bf89-9d61-9ef0-9a02-7a24e48c7339")
public static String es_PE_FIELD_BusinessPartnerDimension_LinkOrganization_Description="Integración de Socio de Negocio a una Organización";

@XendraTrl(Identifier="d4a5bf89-9d61-9ef0-9a02-7a24e48c7339")
public static String es_PE_FIELD_BusinessPartnerDimension_LinkOrganization_Help="Si el socio de negocio esta en otra organización, seleccione la organización o fije para crear una nueva organización. Usted liga a socio de negocio a una organización para crear los documentos explícitos para la Integración-Org transacción. Si usted crea una nueva organización, usted puede proveer un tipo de la organización. Si usted selecciona un rol, el acceso a la nueva organización se limita a ese rol, si no todo los roles (no manual) del cliente tendrán acceso a la nueva organización.";

@XendraField(AD_Column_ID="AD_OrgBP_ID",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d4a5bf89-9d61-9ef0-9a02-7a24e48c7339")
public static final String FIELDNAME_BusinessPartnerDimension_LinkOrganization="d4a5bf89-9d61-9ef0-9a02-7a24e48c7339";

@XendraTrl(Identifier="f3662011-82c5-f390-1151-474c51f42601")
public static String es_PE_FIELD_AssignedPartners_LinkOrganization_Name="Liga Organización";

@XendraTrl(Identifier="f3662011-82c5-f390-1151-474c51f42601")
public static String es_PE_FIELD_AssignedPartners_LinkOrganization_Description="Integración de Socio de Negocio a una Organización";

@XendraTrl(Identifier="f3662011-82c5-f390-1151-474c51f42601")
public static String es_PE_FIELD_AssignedPartners_LinkOrganization_Help="Si el socio de negocio esta en otra organización, seleccione la organización o fije para crear una nueva organización. Usted liga a socio de negocio a una organización para crear los documentos explícitos para la Integración-Org transacción. Si usted crea una nueva organización, usted puede proveer un tipo de la organización. Si usted selecciona un rol, el acceso a la nueva organización se limita a ese rol, si no todo los roles (no manual) del cliente tendrán acceso a la nueva organización.";

@XendraField(AD_Column_ID="AD_OrgBP_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f3662011-82c5-f390-1151-474c51f42601")
public static final String FIELDNAME_AssignedPartners_LinkOrganization="f3662011-82c5-f390-1151-474c51f42601";

@XendraTrl(Identifier="2c18cb35-6696-5dbd-7198-6ebe056d607a")
public static String es_PE_FIELD_BusinessPartner_LinkOrganization_Name="Liga Organización";

@XendraTrl(Identifier="2c18cb35-6696-5dbd-7198-6ebe056d607a")
public static String es_PE_FIELD_BusinessPartner_LinkOrganization_Description="Integración de Socio de Negocio a una Organización";

@XendraTrl(Identifier="2c18cb35-6696-5dbd-7198-6ebe056d607a")
public static String es_PE_FIELD_BusinessPartner_LinkOrganization_Help="Si el socio de negocio esta en otra organización, seleccione la organización o fije para crear una nueva organización. Usted liga a socio de negocio a una organización para crear los documentos explícitos para la Integración-Org transacción. Si usted crea una nueva organización, usted puede proveer un tipo de la organización. Si usted selecciona un rol, el acceso a la nueva organización se limita a ese rol, si no todo los roles (no manual) del cliente tendrán acceso a la nueva organización.";

@XendraField(AD_Column_ID="AD_OrgBP_ID",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2c18cb35-6696-5dbd-7198-6ebe056d607a")
public static final String FIELDNAME_BusinessPartner_LinkOrganization="2c18cb35-6696-5dbd-7198-6ebe056d607a";

@XendraTrl(Identifier="9185b247-fae0-7442-c296-723da1021aec")
public static String es_PE_FIELD_PartnerSelection_LinkOrganization_Name="Liga Organización";

@XendraTrl(Identifier="9185b247-fae0-7442-c296-723da1021aec")
public static String es_PE_FIELD_PartnerSelection_LinkOrganization_Description="Integración de Socio de Negocio a una Organización";

@XendraTrl(Identifier="9185b247-fae0-7442-c296-723da1021aec")
public static String es_PE_FIELD_PartnerSelection_LinkOrganization_Help="Si el socio de negocio esta en otra organización, seleccione la organización o fije para crear una nueva organización. Usted liga a socio de negocio a una organización para crear los documentos explícitos para la Integración-Org transacción. Si usted crea una nueva organización, usted puede proveer un tipo de la organización. Si usted selecciona un rol, el acceso a la nueva organización se limita a ese rol, si no todo los roles (no manual) del cliente tendrán acceso a la nueva organización.";

@XendraField(AD_Column_ID="AD_OrgBP_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9185b247-fae0-7442-c296-723da1021aec")
public static final String FIELDNAME_PartnerSelection_LinkOrganization="9185b247-fae0-7442-c296-723da1021aec";

@XendraTrl(Identifier="5c49e29c-f35b-f284-b799-1d5ecfe857fb")
public static String es_PE_FIELD_Customer_LinkOrganization2_Name="Liga Organización";

@XendraTrl(Identifier="5c49e29c-f35b-f284-b799-1d5ecfe857fb")
public static String es_PE_FIELD_Customer_LinkOrganization2_Description="Integración de Socio de Negocio a una Organización";

@XendraTrl(Identifier="5c49e29c-f35b-f284-b799-1d5ecfe857fb")
public static String es_PE_FIELD_Customer_LinkOrganization2_Help="Si el socio de negocio esta en otra organización, seleccione la organización o fije para crear una nueva organización. Usted liga a socio de negocio a una organización para crear los documentos explícitos para la Integración-Org transacción. Si usted crea una nueva organización, usted puede proveer un tipo de la organización. Si usted selecciona un rol, el acceso a la nueva organización se limita a ese rol, si no todo los roles (no manual) del cliente tendrán acceso a la nueva organización.";

@XendraField(AD_Column_ID="AD_OrgBP_ID",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5c49e29c-f35b-f284-b799-1d5ecfe857fb")
public static final String FIELDNAME_Customer_LinkOrganization2="5c49e29c-f35b-f284-b799-1d5ecfe857fb";

@XendraTrl(Identifier="56694729-f470-8f7a-96f0-8ce848684b0d")
public static String es_PE_FIELD_Vendor_LinkOrganization2_Name="Liga Organización";

@XendraTrl(Identifier="56694729-f470-8f7a-96f0-8ce848684b0d")
public static String es_PE_FIELD_Vendor_LinkOrganization2_Description="Integración de Socio de Negocio a una Organización";

@XendraTrl(Identifier="56694729-f470-8f7a-96f0-8ce848684b0d")
public static String es_PE_FIELD_Vendor_LinkOrganization2_Help="Si el socio de negocio esta en otra organización, seleccione la organización o fije para crear una nueva organización. Usted liga a socio de negocio a una organización para crear los documentos explícitos para la Integración-Org transacción. Si usted crea una nueva organización, usted puede proveer un tipo de la organización. Si usted selecciona un rol, el acceso a la nueva organización se limita a ese rol, si no todo los roles (no manual) del cliente tendrán acceso a la nueva organización.";

@XendraField(AD_Column_ID="AD_OrgBP_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="56694729-f470-8f7a-96f0-8ce848684b0d")
public static final String FIELDNAME_Vendor_LinkOrganization2="56694729-f470-8f7a-96f0-8ce848684b0d";

@XendraTrl(Identifier="c012221f-d339-1e66-9694-1a25e95d3e3b")
public static String es_PE_FIELD_BusinessPartner_LinkOrganization2_Name="Liga Organización";

@XendraTrl(Identifier="c012221f-d339-1e66-9694-1a25e95d3e3b")
public static String es_PE_FIELD_BusinessPartner_LinkOrganization2_Description="Integración de Socio de Negocio a una Organización";

@XendraTrl(Identifier="c012221f-d339-1e66-9694-1a25e95d3e3b")
public static String es_PE_FIELD_BusinessPartner_LinkOrganization2_Help="Si el socio de negocio esta en otra organización, seleccione la organización o fije para crear una nueva organización. Usted liga a socio de negocio a una organización para crear los documentos explícitos para la Integración-Org transacción. Si usted crea una nueva organización, usted puede proveer un tipo de la organización. Si usted selecciona un rol, el acceso a la nueva organización se limita a ese rol, si no todo los roles (no manual) del cliente tendrán acceso a la nueva organización.";

@XendraField(AD_Column_ID="AD_OrgBP_ID",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsEmployee@=N",DisplayLength=23,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c012221f-d339-1e66-9694-1a25e95d3e3b")
public static final String FIELDNAME_BusinessPartner_LinkOrganization2="c012221f-d339-1e66-9694-1a25e95d3e3b";

@XendraTrl(Identifier="629aa6c5-cf30-3961-3c9a-909a9ac65fdb")
public static String es_PE_COLUMN_AD_OrgBP_ID_Name="Liga Organización";

@XendraColumn(AD_Element_ID="d04ed4db-2864-dbe7-9957-f6b745d6766e",ColumnName="AD_OrgBP_ID",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="@AD_OrgBP_ID@!0",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,
AD_Process_ID="70a66e0a-7bad-92dd-e936-af3a097a04af",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="629aa6c5-cf30-3961-3c9a-909a9ac65fdb",
Synchronized="2019-08-30 22:21:09.0")
/** Column name AD_OrgBP_ID */
public static final String COLUMNNAME_AD_OrgBP_ID = "AD_OrgBP_ID";
/** Set Partner Parent.
@param BPartner_Parent_ID Business Partner Parent */
public void setBPartner_Parent_ID (int BPartner_Parent_ID)
{
if (BPartner_Parent_ID <= 0) set_Value (COLUMNNAME_BPartner_Parent_ID, null);
 else 
set_Value (COLUMNNAME_BPartner_Parent_ID, Integer.valueOf(BPartner_Parent_ID));
}
/** Get Partner Parent.
@return Business Partner Parent */
public int getBPartner_Parent_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_BPartner_Parent_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="93c30f17-13a8-47d5-b427-a987bc833dde")
public static String es_PE_FIELD_BusinessPartnerDimension_PartnerParent_Name="Socio de Negocio Padre";

@XendraTrl(Identifier="93c30f17-13a8-47d5-b427-a987bc833dde")
public static String es_PE_FIELD_BusinessPartnerDimension_PartnerParent_Description="Socio de Negocio Padre";

@XendraTrl(Identifier="93c30f17-13a8-47d5-b427-a987bc833dde")
public static String es_PE_FIELD_BusinessPartnerDimension_PartnerParent_Help="El padre (organización) de el socio de negocio para reportar propositos.";

@XendraField(AD_Column_ID="BPartner_Parent_ID",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="93c30f17-13a8-47d5-b427-a987bc833dde")
public static final String FIELDNAME_BusinessPartnerDimension_PartnerParent="93c30f17-13a8-47d5-b427-a987bc833dde";

@XendraTrl(Identifier="aa675f62-5a57-261c-d88c-fc6f07ef702c")
public static String es_PE_FIELD_Vendor_PartnerParent_Name="Socio de Negocio Padre";

@XendraTrl(Identifier="aa675f62-5a57-261c-d88c-fc6f07ef702c")
public static String es_PE_FIELD_Vendor_PartnerParent_Description="Socio de Negocio Padre";

@XendraTrl(Identifier="aa675f62-5a57-261c-d88c-fc6f07ef702c")
public static String es_PE_FIELD_Vendor_PartnerParent_Help="El padre (organización) de el socio de negocio para reportar propositos.";

@XendraField(AD_Column_ID="BPartner_Parent_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="aa675f62-5a57-261c-d88c-fc6f07ef702c")
public static final String FIELDNAME_Vendor_PartnerParent="aa675f62-5a57-261c-d88c-fc6f07ef702c";

@XendraTrl(Identifier="af25945f-35f8-d720-6c62-37e8fcb292da")
public static String es_PE_FIELD_EmployeeVendor_PartnerParent_Name="Socio de Negocio Padre";

@XendraTrl(Identifier="af25945f-35f8-d720-6c62-37e8fcb292da")
public static String es_PE_FIELD_EmployeeVendor_PartnerParent_Description="Socio de Negocio Padre";

@XendraTrl(Identifier="af25945f-35f8-d720-6c62-37e8fcb292da")
public static String es_PE_FIELD_EmployeeVendor_PartnerParent_Help="El padre (organización) de el socio de negocio para reportar propositos.";

@XendraField(AD_Column_ID="BPartner_Parent_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="af25945f-35f8-d720-6c62-37e8fcb292da")
public static final String FIELDNAME_EmployeeVendor_PartnerParent="af25945f-35f8-d720-6c62-37e8fcb292da";

@XendraTrl(Identifier="25994ac3-2484-9273-b545-36f0fe3b37a5")
public static String es_PE_FIELD_Customer_PartnerParent_Name="Socio de Negocio Padre";

@XendraTrl(Identifier="25994ac3-2484-9273-b545-36f0fe3b37a5")
public static String es_PE_FIELD_Customer_PartnerParent_Description="Socio de Negocio Padre";

@XendraTrl(Identifier="25994ac3-2484-9273-b545-36f0fe3b37a5")
public static String es_PE_FIELD_Customer_PartnerParent_Help="El padre (organización) de el socio de negocio para reportar propositos.";

@XendraField(AD_Column_ID="BPartner_Parent_ID",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="25994ac3-2484-9273-b545-36f0fe3b37a5")
public static final String FIELDNAME_Customer_PartnerParent="25994ac3-2484-9273-b545-36f0fe3b37a5";

@XendraTrl(Identifier="6faeffef-02a4-9cea-abe9-74db4aaf101e")
public static String es_PE_FIELD_PartnerSelection_PartnerParent_Name="Socio de Negocio Padre";

@XendraTrl(Identifier="6faeffef-02a4-9cea-abe9-74db4aaf101e")
public static String es_PE_FIELD_PartnerSelection_PartnerParent_Description="Socio de Negocio Padre";

@XendraTrl(Identifier="6faeffef-02a4-9cea-abe9-74db4aaf101e")
public static String es_PE_FIELD_PartnerSelection_PartnerParent_Help="El padre (organización) de el socio de negocio para reportar propositos.";

@XendraField(AD_Column_ID="BPartner_Parent_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6faeffef-02a4-9cea-abe9-74db4aaf101e")
public static final String FIELDNAME_PartnerSelection_PartnerParent="6faeffef-02a4-9cea-abe9-74db4aaf101e";

@XendraTrl(Identifier="8e0eb212-8162-7e12-51da-699c912085bd")
public static String es_PE_FIELD_Vendor_PartnerParent2_Name="Socio de Negocio Padre";

@XendraTrl(Identifier="8e0eb212-8162-7e12-51da-699c912085bd")
public static String es_PE_FIELD_Vendor_PartnerParent2_Description="Socio de Negocio Padre";

@XendraTrl(Identifier="8e0eb212-8162-7e12-51da-699c912085bd")
public static String es_PE_FIELD_Vendor_PartnerParent2_Help="El padre (organización) de el socio de negocio para reportar propositos.";

@XendraField(AD_Column_ID="BPartner_Parent_ID",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8e0eb212-8162-7e12-51da-699c912085bd")
public static final String FIELDNAME_Vendor_PartnerParent2="8e0eb212-8162-7e12-51da-699c912085bd";

@XendraTrl(Identifier="076b2de0-13e1-3bc6-8d3e-a301069e1118")
public static String es_PE_FIELD_Customer_PartnerParent2_Name="Socio de Negocio Padre";

@XendraTrl(Identifier="076b2de0-13e1-3bc6-8d3e-a301069e1118")
public static String es_PE_FIELD_Customer_PartnerParent2_Description="Socio de Negocio Padre";

@XendraTrl(Identifier="076b2de0-13e1-3bc6-8d3e-a301069e1118")
public static String es_PE_FIELD_Customer_PartnerParent2_Help="El padre (organización) de el socio de negocio para reportar propositos.";

@XendraField(AD_Column_ID="BPartner_Parent_ID",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="076b2de0-13e1-3bc6-8d3e-a301069e1118")
public static final String FIELDNAME_Customer_PartnerParent2="076b2de0-13e1-3bc6-8d3e-a301069e1118";

@XendraTrl(Identifier="558c3c22-241e-e90e-c208-39ae2398d996")
public static String es_PE_FIELD_BusinessPartner_PartnerParent_Name="Socio de Negocio Padre";

@XendraTrl(Identifier="558c3c22-241e-e90e-c208-39ae2398d996")
public static String es_PE_FIELD_BusinessPartner_PartnerParent_Description="Socio de Negocio Padre";

@XendraTrl(Identifier="558c3c22-241e-e90e-c208-39ae2398d996")
public static String es_PE_FIELD_BusinessPartner_PartnerParent_Help="El padre (organización) de el socio de negocio para reportar propositos.";

@XendraField(AD_Column_ID="BPartner_Parent_ID",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="558c3c22-241e-e90e-c208-39ae2398d996")
public static final String FIELDNAME_BusinessPartner_PartnerParent="558c3c22-241e-e90e-c208-39ae2398d996";

@XendraTrl(Identifier="5ed0afaa-01e1-8e03-059d-ebf209583a80")
public static String es_PE_FIELD_AssignedPartners_PartnerParent_Name="Socio de Negocio Padre";

@XendraTrl(Identifier="5ed0afaa-01e1-8e03-059d-ebf209583a80")
public static String es_PE_FIELD_AssignedPartners_PartnerParent_Description="Socio de Negocio Padre";

@XendraTrl(Identifier="5ed0afaa-01e1-8e03-059d-ebf209583a80")
public static String es_PE_FIELD_AssignedPartners_PartnerParent_Help="El padre (organización) de el socio de negocio para reportar propositos.";

@XendraField(AD_Column_ID="BPartner_Parent_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5ed0afaa-01e1-8e03-059d-ebf209583a80")
public static final String FIELDNAME_AssignedPartners_PartnerParent="5ed0afaa-01e1-8e03-059d-ebf209583a80";

@XendraTrl(Identifier="c3ca0e80-ae37-4e89-66d9-04f02148b98d")
public static String es_PE_FIELD_Employee_PartnerParent_Name="Socio de Negocio Padre";

@XendraTrl(Identifier="c3ca0e80-ae37-4e89-66d9-04f02148b98d")
public static String es_PE_FIELD_Employee_PartnerParent_Description="Socio de Negocio Padre";

@XendraTrl(Identifier="c3ca0e80-ae37-4e89-66d9-04f02148b98d")
public static String es_PE_FIELD_Employee_PartnerParent_Help="El padre (organización) de el socio de negocio para reportar propositos.";

@XendraField(AD_Column_ID="BPartner_Parent_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c3ca0e80-ae37-4e89-66d9-04f02148b98d")
public static final String FIELDNAME_Employee_PartnerParent="c3ca0e80-ae37-4e89-66d9-04f02148b98d";

@XendraTrl(Identifier="76730425-9572-6a0b-4a77-2d982c6383e0")
public static String es_PE_FIELD_BusinessPartner_PartnerParent2_Name="Socio de Negocio Padre";

@XendraTrl(Identifier="76730425-9572-6a0b-4a77-2d982c6383e0")
public static String es_PE_FIELD_BusinessPartner_PartnerParent2_Description="Socio de Negocio Padre";

@XendraTrl(Identifier="76730425-9572-6a0b-4a77-2d982c6383e0")
public static String es_PE_FIELD_BusinessPartner_PartnerParent2_Help="El padre (organización) de el socio de negocio para reportar propositos.";

@XendraField(AD_Column_ID="BPartner_Parent_ID",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="76730425-9572-6a0b-4a77-2d982c6383e0")
public static final String FIELDNAME_BusinessPartner_PartnerParent2="76730425-9572-6a0b-4a77-2d982c6383e0";

@XendraTrl(Identifier="35530ace-301d-bdf2-0ea4-f1f40a312a01")
public static String es_PE_COLUMN_BPartner_Parent_ID_Name="Socio de Negocio Padre";

@XendraColumn(AD_Element_ID="84052a1b-eaa2-8820-97fc-0ac1f39997f3",ColumnName="BPartner_Parent_ID",
AD_Reference_ID=13,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="35530ace-301d-bdf2-0ea4-f1f40a312a01",
Synchronized="2019-08-30 22:21:09.0")
/** Column name BPartner_Parent_ID */
public static final String COLUMNNAME_BPartner_Parent_ID = "BPartner_Parent_ID";
/** Set Business Partner .
@param C_BPartner_ID Identifies a Business Partner */
public void setC_BPartner_ID (int C_BPartner_ID)
{
if (C_BPartner_ID < 1) throw new IllegalArgumentException ("C_BPartner_ID is mandatory.");
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

@XendraTrl(Identifier="c07b0db8-9350-9f94-c82c-8cf73ff78a20")
public static String es_PE_FIELD_Employee_BusinessPartner_Name="Socio de Negocio";

@XendraTrl(Identifier="c07b0db8-9350-9f94-c82c-8cf73ff78a20")
public static String es_PE_FIELD_Employee_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="c07b0db8-9350-9f94-c82c-8cf73ff78a20")
public static String es_PE_FIELD_Employee_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c07b0db8-9350-9f94-c82c-8cf73ff78a20")
public static final String FIELDNAME_Employee_BusinessPartner="c07b0db8-9350-9f94-c82c-8cf73ff78a20";

@XendraTrl(Identifier="7d8aa730-1b6d-ffd8-6770-8dbc24ef63f0")
public static String es_PE_FIELD_Vendor_BusinessPartner_Name="Socio de Negocio";

@XendraTrl(Identifier="7d8aa730-1b6d-ffd8-6770-8dbc24ef63f0")
public static String es_PE_FIELD_Vendor_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="7d8aa730-1b6d-ffd8-6770-8dbc24ef63f0")
public static String es_PE_FIELD_Vendor_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7d8aa730-1b6d-ffd8-6770-8dbc24ef63f0")
public static final String FIELDNAME_Vendor_BusinessPartner="7d8aa730-1b6d-ffd8-6770-8dbc24ef63f0";

@XendraTrl(Identifier="bdc6600e-5b24-8865-f290-e843e0b26be8")
public static String es_PE_FIELD_Customer_BusinessPartner_Name="Socio de Negocio";

@XendraTrl(Identifier="bdc6600e-5b24-8865-f290-e843e0b26be8")
public static String es_PE_FIELD_Customer_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="bdc6600e-5b24-8865-f290-e843e0b26be8")
public static String es_PE_FIELD_Customer_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bdc6600e-5b24-8865-f290-e843e0b26be8")
public static final String FIELDNAME_Customer_BusinessPartner="bdc6600e-5b24-8865-f290-e843e0b26be8";

@XendraTrl(Identifier="653fe888-bbc4-ff41-323a-57bc52e36547")
public static String es_PE_FIELD_EmployeeVendor_BusinessPartner_Name="Socio de Negocio";

@XendraTrl(Identifier="653fe888-bbc4-ff41-323a-57bc52e36547")
public static String es_PE_FIELD_EmployeeVendor_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="653fe888-bbc4-ff41-323a-57bc52e36547")
public static String es_PE_FIELD_EmployeeVendor_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="653fe888-bbc4-ff41-323a-57bc52e36547")
public static final String FIELDNAME_EmployeeVendor_BusinessPartner="653fe888-bbc4-ff41-323a-57bc52e36547";

@XendraTrl(Identifier="1e33551e-a3e9-6289-fc35-f83406198853")
public static String es_PE_FIELD_Vendor_BusinessPartner2_Name="Socio de Negocio";

@XendraTrl(Identifier="1e33551e-a3e9-6289-fc35-f83406198853")
public static String es_PE_FIELD_Vendor_BusinessPartner2_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="1e33551e-a3e9-6289-fc35-f83406198853")
public static String es_PE_FIELD_Vendor_BusinessPartner2_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1e33551e-a3e9-6289-fc35-f83406198853")
public static final String FIELDNAME_Vendor_BusinessPartner2="1e33551e-a3e9-6289-fc35-f83406198853";

@XendraTrl(Identifier="72682184-86c4-f8d0-69c1-64f29147ef88")
public static String es_PE_FIELD_Customer_BusinessPartner2_Name="Socio de Negocio";

@XendraTrl(Identifier="72682184-86c4-f8d0-69c1-64f29147ef88")
public static String es_PE_FIELD_Customer_BusinessPartner2_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="72682184-86c4-f8d0-69c1-64f29147ef88")
public static String es_PE_FIELD_Customer_BusinessPartner2_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="72682184-86c4-f8d0-69c1-64f29147ef88")
public static final String FIELDNAME_Customer_BusinessPartner2="72682184-86c4-f8d0-69c1-64f29147ef88";

@XendraTrl(Identifier="ed198f6e-0fa5-fa17-90da-07c0c88eb229")
public static String es_PE_FIELD_BusinessPartnerDimension_BusinessPartner_Name="Socio de Negocio";

@XendraTrl(Identifier="ed198f6e-0fa5-fa17-90da-07c0c88eb229")
public static String es_PE_FIELD_BusinessPartnerDimension_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="ed198f6e-0fa5-fa17-90da-07c0c88eb229")
public static String es_PE_FIELD_BusinessPartnerDimension_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ed198f6e-0fa5-fa17-90da-07c0c88eb229")
public static final String FIELDNAME_BusinessPartnerDimension_BusinessPartner="ed198f6e-0fa5-fa17-90da-07c0c88eb229";

@XendraTrl(Identifier="f38a876c-815d-c0e0-8acf-f6a36e2fc159")
public static String es_PE_FIELD_PartnerSelection_BusinessPartner_Name="Socio de Negocio";

@XendraTrl(Identifier="f38a876c-815d-c0e0-8acf-f6a36e2fc159")
public static String es_PE_FIELD_PartnerSelection_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="f38a876c-815d-c0e0-8acf-f6a36e2fc159")
public static String es_PE_FIELD_PartnerSelection_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f38a876c-815d-c0e0-8acf-f6a36e2fc159")
public static final String FIELDNAME_PartnerSelection_BusinessPartner="f38a876c-815d-c0e0-8acf-f6a36e2fc159";

@XendraTrl(Identifier="ad2a8d73-933f-26da-da1b-c986e4eff617")
public static String es_PE_FIELD_AssignedPartners_BusinessPartner_Name="Socio de Negocio";

@XendraTrl(Identifier="ad2a8d73-933f-26da-da1b-c986e4eff617")
public static String es_PE_FIELD_AssignedPartners_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="ad2a8d73-933f-26da-da1b-c986e4eff617")
public static String es_PE_FIELD_AssignedPartners_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ad2a8d73-933f-26da-da1b-c986e4eff617")
public static final String FIELDNAME_AssignedPartners_BusinessPartner="ad2a8d73-933f-26da-da1b-c986e4eff617";

@XendraTrl(Identifier="967ff500-c07d-1857-a6d1-7eda9798d4bd")
public static String es_PE_FIELD_BusinessPartner_BusinessPartner_Name="Socio de Negocio";

@XendraTrl(Identifier="967ff500-c07d-1857-a6d1-7eda9798d4bd")
public static String es_PE_FIELD_BusinessPartner_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="967ff500-c07d-1857-a6d1-7eda9798d4bd")
public static String es_PE_FIELD_BusinessPartner_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="967ff500-c07d-1857-a6d1-7eda9798d4bd")
public static final String FIELDNAME_BusinessPartner_BusinessPartner="967ff500-c07d-1857-a6d1-7eda9798d4bd";

@XendraTrl(Identifier="a02bbec1-e9a7-ddd1-faf7-da0547fced96")
public static String es_PE_FIELD_BusinessPartner_BusinessPartner2_Name="Socio de Negocio";

@XendraTrl(Identifier="a02bbec1-e9a7-ddd1-faf7-da0547fced96")
public static String es_PE_FIELD_BusinessPartner_BusinessPartner2_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="a02bbec1-e9a7-ddd1-faf7-da0547fced96")
public static String es_PE_FIELD_BusinessPartner_BusinessPartner2_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a02bbec1-e9a7-ddd1-faf7-da0547fced96")
public static final String FIELDNAME_BusinessPartner_BusinessPartner2="a02bbec1-e9a7-ddd1-faf7-da0547fced96";
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set Business Partner Document Type.
@param C_BP_DocType_ID Business Partner Document Type */
public void setC_BP_DocType_ID (int C_BP_DocType_ID)
{
if (C_BP_DocType_ID <= 0) set_Value (COLUMNNAME_C_BP_DocType_ID, null);
 else 
set_Value (COLUMNNAME_C_BP_DocType_ID, Integer.valueOf(C_BP_DocType_ID));
}
/** Get Business Partner Document Type.
@return Business Partner Document Type */
public int getC_BP_DocType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BP_DocType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="168b899d-bd67-7512-7673-51df93e65277")
public static String es_PE_FIELD_BusinessPartner_BusinessPartnerDocumentType_Name="Codigo de Gobierno";

@XendraTrl(Identifier="168b899d-bd67-7512-7673-51df93e65277")
public static String es_PE_FIELD_BusinessPartner_BusinessPartnerDocumentType_Help="Tabla 02 ANEXO 03 SUNAT (PERU) - Tipo de documento de identidad";

@XendraField(AD_Column_ID="C_BP_DocType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2015-11-23 15:25:54.0",
Identifier="168b899d-bd67-7512-7673-51df93e65277")
public static final String FIELDNAME_BusinessPartner_BusinessPartnerDocumentType="168b899d-bd67-7512-7673-51df93e65277";

@XendraTrl(Identifier="6cdfc1ac-e80d-4051-bc87-2deebdc132c1")
public static String es_PE_COLUMN_C_BP_DocType_ID_Name="Business Partner Document Type";

@XendraColumn(AD_Element_ID="7d517b55-255b-4ff2-8927-8d03123a8943",ColumnName="C_BP_DocType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6cdfc1ac-e80d-4051-bc87-2deebdc132c1",
Synchronized="2019-08-30 22:21:09.0")
/** Column name C_BP_DocType_ID */
public static final String COLUMNNAME_C_BP_DocType_ID = "C_BP_DocType_ID";
/** Set Business Partner Group.
@param C_BP_Group_ID Business Partner Group */
public void setC_BP_Group_ID (int C_BP_Group_ID)
{
if (C_BP_Group_ID < 1) throw new IllegalArgumentException ("C_BP_Group_ID is mandatory.");
set_Value (COLUMNNAME_C_BP_Group_ID, Integer.valueOf(C_BP_Group_ID));
}
/** Get Business Partner Group.
@return Business Partner Group */
public int getC_BP_Group_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BP_Group_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f2058a55-4420-0a9c-50a5-204f08478931")
public static String es_PE_FIELD_PartnerSelection_BusinessPartnerGroup_Name="Grupo de Socio de Negocio";

@XendraTrl(Identifier="f2058a55-4420-0a9c-50a5-204f08478931")
public static String es_PE_FIELD_PartnerSelection_BusinessPartnerGroup_Description="ID del Grupo de Socio de Negocio";

@XendraTrl(Identifier="f2058a55-4420-0a9c-50a5-204f08478931")
public static String es_PE_FIELD_PartnerSelection_BusinessPartnerGroup_Help="La ID Grupo del Socio de Negocio proporciona un método de definir valores predeterminados a ser usados para Socios de Negocio individuales.";

@XendraField(AD_Column_ID="C_BP_Group_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f2058a55-4420-0a9c-50a5-204f08478931")
public static final String FIELDNAME_PartnerSelection_BusinessPartnerGroup="f2058a55-4420-0a9c-50a5-204f08478931";

@XendraTrl(Identifier="173aabc2-8641-80c6-1958-a44d74707ab6")
public static String es_PE_FIELD_EmployeeVendor_BusinessPartnerGroup_Name="Grupo de Socio de Negocio";

@XendraTrl(Identifier="173aabc2-8641-80c6-1958-a44d74707ab6")
public static String es_PE_FIELD_EmployeeVendor_BusinessPartnerGroup_Description="ID del Grupo de Socio de Negocio";

@XendraTrl(Identifier="173aabc2-8641-80c6-1958-a44d74707ab6")
public static String es_PE_FIELD_EmployeeVendor_BusinessPartnerGroup_Help="La ID Grupo del Socio de Negocio proporciona un método de definir valores predeterminados a ser usados para Socios de Negocio individuales.";

@XendraField(AD_Column_ID="C_BP_Group_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="173aabc2-8641-80c6-1958-a44d74707ab6")
public static final String FIELDNAME_EmployeeVendor_BusinessPartnerGroup="173aabc2-8641-80c6-1958-a44d74707ab6";

@XendraTrl(Identifier="4ae845cc-9bfe-1f7b-e493-f2e6bc25da8d")
public static String es_PE_FIELD_Customer_BusinessPartnerGroup_Name="Grupo de Socio de Negocio";

@XendraTrl(Identifier="4ae845cc-9bfe-1f7b-e493-f2e6bc25da8d")
public static String es_PE_FIELD_Customer_BusinessPartnerGroup_Description="ID del Grupo de Socio de Negocio";

@XendraTrl(Identifier="4ae845cc-9bfe-1f7b-e493-f2e6bc25da8d")
public static String es_PE_FIELD_Customer_BusinessPartnerGroup_Help="La ID Grupo del Socio de Negocio proporciona un método de definir valores predeterminados a ser usados para Socios de Negocio individuales.";

@XendraField(AD_Column_ID="C_BP_Group_ID",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4ae845cc-9bfe-1f7b-e493-f2e6bc25da8d")
public static final String FIELDNAME_Customer_BusinessPartnerGroup="4ae845cc-9bfe-1f7b-e493-f2e6bc25da8d";

@XendraTrl(Identifier="64a863ac-11d1-beb2-d99a-2dd17ae0856c")
public static String es_PE_FIELD_Vendor_BusinessPartnerGroup_Name="Grupo de Socio de Negocio";

@XendraTrl(Identifier="64a863ac-11d1-beb2-d99a-2dd17ae0856c")
public static String es_PE_FIELD_Vendor_BusinessPartnerGroup_Description="ID del Grupo de Socio de Negocio";

@XendraTrl(Identifier="64a863ac-11d1-beb2-d99a-2dd17ae0856c")
public static String es_PE_FIELD_Vendor_BusinessPartnerGroup_Help="La ID Grupo del Socio de Negocio proporciona un método de definir valores predeterminados a ser usados para Socios de Negocio individuales.";

@XendraField(AD_Column_ID="C_BP_Group_ID",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="64a863ac-11d1-beb2-d99a-2dd17ae0856c")
public static final String FIELDNAME_Vendor_BusinessPartnerGroup="64a863ac-11d1-beb2-d99a-2dd17ae0856c";

@XendraTrl(Identifier="ac8569dd-6b35-faf6-8f69-51adef9f1f1a")
public static String es_PE_FIELD_BusinessPartner_BusinessPartnerGroup_Name="Grupo de Socio de Negocio";

@XendraTrl(Identifier="ac8569dd-6b35-faf6-8f69-51adef9f1f1a")
public static String es_PE_FIELD_BusinessPartner_BusinessPartnerGroup_Description="ID del Grupo de Socio de Negocio";

@XendraTrl(Identifier="ac8569dd-6b35-faf6-8f69-51adef9f1f1a")
public static String es_PE_FIELD_BusinessPartner_BusinessPartnerGroup_Help="La ID Grupo del Socio de Negocio proporciona un método de definir valores predeterminados a ser usados para Socios de Negocio individuales.";

@XendraField(AD_Column_ID="C_BP_Group_ID",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ac8569dd-6b35-faf6-8f69-51adef9f1f1a")
public static final String FIELDNAME_BusinessPartner_BusinessPartnerGroup="ac8569dd-6b35-faf6-8f69-51adef9f1f1a";

@XendraTrl(Identifier="3d72e655-665e-38a8-c7fd-837d3b76a95c")
public static String es_PE_FIELD_Vendor_BusinessPartnerGroup2_Name="Grupo de Socio de Negocio";

@XendraTrl(Identifier="3d72e655-665e-38a8-c7fd-837d3b76a95c")
public static String es_PE_FIELD_Vendor_BusinessPartnerGroup2_Description="ID del Grupo de Socio de Negocio";

@XendraTrl(Identifier="3d72e655-665e-38a8-c7fd-837d3b76a95c")
public static String es_PE_FIELD_Vendor_BusinessPartnerGroup2_Help="La ID Grupo del Socio de Negocio proporciona un método de definir valores predeterminados a ser usados para Socios de Negocio individuales.";

@XendraField(AD_Column_ID="C_BP_Group_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3d72e655-665e-38a8-c7fd-837d3b76a95c")
public static final String FIELDNAME_Vendor_BusinessPartnerGroup2="3d72e655-665e-38a8-c7fd-837d3b76a95c";

@XendraTrl(Identifier="dc96b623-3a6f-2a94-8844-71b23e4cdf4c")
public static String es_PE_FIELD_BusinessPartnerDimension_BusinessPartnerGroup_Name="Grupo de Socio de Negocio";

@XendraTrl(Identifier="dc96b623-3a6f-2a94-8844-71b23e4cdf4c")
public static String es_PE_FIELD_BusinessPartnerDimension_BusinessPartnerGroup_Description="ID del Grupo de Socio de Negocio";

@XendraTrl(Identifier="dc96b623-3a6f-2a94-8844-71b23e4cdf4c")
public static String es_PE_FIELD_BusinessPartnerDimension_BusinessPartnerGroup_Help="La ID Grupo del Socio de Negocio proporciona un método de definir valores predeterminados a ser usados para Socios de Negocio individuales.";

@XendraField(AD_Column_ID="C_BP_Group_ID",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dc96b623-3a6f-2a94-8844-71b23e4cdf4c")
public static final String FIELDNAME_BusinessPartnerDimension_BusinessPartnerGroup="dc96b623-3a6f-2a94-8844-71b23e4cdf4c";

@XendraTrl(Identifier="1b254d5a-7579-b64f-79f1-394c8f0e6063")
public static String es_PE_FIELD_Employee_BusinessPartnerGroup_Name="Grupo de Socio de Negocio";

@XendraTrl(Identifier="1b254d5a-7579-b64f-79f1-394c8f0e6063")
public static String es_PE_FIELD_Employee_BusinessPartnerGroup_Description="ID del Grupo de Socio de Negocio";

@XendraTrl(Identifier="1b254d5a-7579-b64f-79f1-394c8f0e6063")
public static String es_PE_FIELD_Employee_BusinessPartnerGroup_Help="La ID Grupo del Socio de Negocio proporciona un método de definir valores predeterminados a ser usados para Socios de Negocio individuales.";

@XendraField(AD_Column_ID="C_BP_Group_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1b254d5a-7579-b64f-79f1-394c8f0e6063")
public static final String FIELDNAME_Employee_BusinessPartnerGroup="1b254d5a-7579-b64f-79f1-394c8f0e6063";

@XendraTrl(Identifier="edad0ace-0adb-0ab2-02f7-a02c7433c454")
public static String es_PE_FIELD_AssignedPartners_BusinessPartnerGroup_Name="Grupo de Socio de Negocio";

@XendraTrl(Identifier="edad0ace-0adb-0ab2-02f7-a02c7433c454")
public static String es_PE_FIELD_AssignedPartners_BusinessPartnerGroup_Description="ID del Grupo de Socio de Negocio";

@XendraTrl(Identifier="edad0ace-0adb-0ab2-02f7-a02c7433c454")
public static String es_PE_FIELD_AssignedPartners_BusinessPartnerGroup_Help="La ID Grupo del Socio de Negocio proporciona un método de definir valores predeterminados a ser usados para Socios de Negocio individuales.";

@XendraField(AD_Column_ID="C_BP_Group_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="edad0ace-0adb-0ab2-02f7-a02c7433c454")
public static final String FIELDNAME_AssignedPartners_BusinessPartnerGroup="edad0ace-0adb-0ab2-02f7-a02c7433c454";

@XendraTrl(Identifier="ed2538ce-31df-11a4-ff78-d7b56edc6df2")
public static String es_PE_FIELD_Customer_BusinessPartnerGroup2_Name="Grupo de Socio de Negocio";

@XendraTrl(Identifier="ed2538ce-31df-11a4-ff78-d7b56edc6df2")
public static String es_PE_FIELD_Customer_BusinessPartnerGroup2_Description="ID del Grupo de Socio de Negocio";

@XendraTrl(Identifier="ed2538ce-31df-11a4-ff78-d7b56edc6df2")
public static String es_PE_FIELD_Customer_BusinessPartnerGroup2_Help="La ID Grupo del Socio de Negocio proporciona un método de definir valores predeterminados a ser usados para Socios de Negocio individuales.";

@XendraField(AD_Column_ID="C_BP_Group_ID",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ed2538ce-31df-11a4-ff78-d7b56edc6df2")
public static final String FIELDNAME_Customer_BusinessPartnerGroup2="ed2538ce-31df-11a4-ff78-d7b56edc6df2";

@XendraTrl(Identifier="4daf0c6a-ed0a-889e-27db-c55f525a8323")
public static String es_PE_FIELD_BusinessPartner_BusinessPartnerGroup2_Name="Grupo de Socio de Negocio";

@XendraTrl(Identifier="4daf0c6a-ed0a-889e-27db-c55f525a8323")
public static String es_PE_FIELD_BusinessPartner_BusinessPartnerGroup2_Description="ID del Grupo de Socio de Negocio";

@XendraTrl(Identifier="4daf0c6a-ed0a-889e-27db-c55f525a8323")
public static String es_PE_FIELD_BusinessPartner_BusinessPartnerGroup2_Help="La ID Grupo del Socio de Negocio proporciona un método de definir valores predeterminados a ser usados para Socios de Negocio individuales.";

@XendraField(AD_Column_ID="C_BP_Group_ID",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4daf0c6a-ed0a-889e-27db-c55f525a8323")
public static final String FIELDNAME_BusinessPartner_BusinessPartnerGroup2="4daf0c6a-ed0a-889e-27db-c55f525a8323";

@XendraTrl(Identifier="5ab868c4-ac10-4cbe-4a87-af76d3e43e00")
public static String es_PE_COLUMN_C_BP_Group_ID_Name="Grupo de Socio de Negocio";

@XendraColumn(AD_Element_ID="e4bea975-0a3a-c828-703f-724f29c7518a",ColumnName="C_BP_Group_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5ab868c4-ac10-4cbe-4a87-af76d3e43e00",
Synchronized="2019-08-30 22:21:09.0")
/** Column name C_BP_Group_ID */
public static final String COLUMNNAME_C_BP_Group_ID = "C_BP_Group_ID";
/** Set Dunning.
@param C_Dunning_ID Dunning Rules for overdue invoices */
public void setC_Dunning_ID (int C_Dunning_ID)
{
if (C_Dunning_ID <= 0) set_Value (COLUMNNAME_C_Dunning_ID, null);
 else 
set_Value (COLUMNNAME_C_Dunning_ID, Integer.valueOf(C_Dunning_ID));
}
/** Get Dunning.
@return Dunning Rules for overdue invoices */
public int getC_Dunning_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Dunning_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="aaaf7c80-5707-05f8-2eae-b8feeb02bae5")
public static String es_PE_FIELD_Employee_Dunning_Name="Morosidad";

@XendraTrl(Identifier="aaaf7c80-5707-05f8-2eae-b8feeb02bae5")
public static String es_PE_FIELD_Employee_Dunning_Description="Reglas de morosidad para facturas vencidas";

@XendraTrl(Identifier="aaaf7c80-5707-05f8-2eae-b8feeb02bae5")
public static String es_PE_FIELD_Employee_Dunning_Help="La Morosidad indica las reglas y métodos de cálculo de morosidad para pagos vencidos";

@XendraField(AD_Column_ID="C_Dunning_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="aaaf7c80-5707-05f8-2eae-b8feeb02bae5")
public static final String FIELDNAME_Employee_Dunning="aaaf7c80-5707-05f8-2eae-b8feeb02bae5";

@XendraTrl(Identifier="5eff9d65-3d7c-3e6f-a357-3862bd6bfe33")
public static String es_PE_FIELD_EmployeeVendor_Dunning_Name="Morosidad";

@XendraTrl(Identifier="5eff9d65-3d7c-3e6f-a357-3862bd6bfe33")
public static String es_PE_FIELD_EmployeeVendor_Dunning_Description="Reglas de morosidad para facturas vencidas";

@XendraTrl(Identifier="5eff9d65-3d7c-3e6f-a357-3862bd6bfe33")
public static String es_PE_FIELD_EmployeeVendor_Dunning_Help="La Morosidad indica las reglas y métodos de cálculo de morosidad para pagos vencidos";

@XendraField(AD_Column_ID="C_Dunning_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5eff9d65-3d7c-3e6f-a357-3862bd6bfe33")
public static final String FIELDNAME_EmployeeVendor_Dunning="5eff9d65-3d7c-3e6f-a357-3862bd6bfe33";

@XendraTrl(Identifier="6678ccf8-b21e-f215-fcaa-99e4d3495278")
public static String es_PE_FIELD_PartnerSelection_Dunning_Name="Morosidad";

@XendraTrl(Identifier="6678ccf8-b21e-f215-fcaa-99e4d3495278")
public static String es_PE_FIELD_PartnerSelection_Dunning_Description="Reglas de morosidad para facturas vencidas";

@XendraTrl(Identifier="6678ccf8-b21e-f215-fcaa-99e4d3495278")
public static String es_PE_FIELD_PartnerSelection_Dunning_Help="La Morosidad indica las reglas y métodos de cálculo de morosidad para pagos vencidos";

@XendraField(AD_Column_ID="C_Dunning_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6678ccf8-b21e-f215-fcaa-99e4d3495278")
public static final String FIELDNAME_PartnerSelection_Dunning="6678ccf8-b21e-f215-fcaa-99e4d3495278";

@XendraTrl(Identifier="570dc020-8871-edd2-0c41-c586519eb49d")
public static String es_PE_FIELD_BusinessPartnerDimension_Dunning_Name="Morosidad";

@XendraTrl(Identifier="570dc020-8871-edd2-0c41-c586519eb49d")
public static String es_PE_FIELD_BusinessPartnerDimension_Dunning_Description="Reglas de morosidad para facturas vencidas";

@XendraTrl(Identifier="570dc020-8871-edd2-0c41-c586519eb49d")
public static String es_PE_FIELD_BusinessPartnerDimension_Dunning_Help="La Morosidad indica las reglas y métodos de cálculo de morosidad para pagos vencidos";

@XendraField(AD_Column_ID="C_Dunning_ID",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="570dc020-8871-edd2-0c41-c586519eb49d")
public static final String FIELDNAME_BusinessPartnerDimension_Dunning="570dc020-8871-edd2-0c41-c586519eb49d";

@XendraTrl(Identifier="ea3ebc23-6723-70e8-f797-49d1d022cb85")
public static String es_PE_FIELD_Customer_Dunning_Name="Morosidad";

@XendraTrl(Identifier="ea3ebc23-6723-70e8-f797-49d1d022cb85")
public static String es_PE_FIELD_Customer_Dunning_Description="Reglas de morosidad para facturas vencidas";

@XendraTrl(Identifier="ea3ebc23-6723-70e8-f797-49d1d022cb85")
public static String es_PE_FIELD_Customer_Dunning_Help="La Morosidad indica las reglas y métodos de cálculo de morosidad para pagos vencidos";

@XendraField(AD_Column_ID="C_Dunning_ID",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ea3ebc23-6723-70e8-f797-49d1d022cb85")
public static final String FIELDNAME_Customer_Dunning="ea3ebc23-6723-70e8-f797-49d1d022cb85";

@XendraTrl(Identifier="0c9f12c8-bbf4-462c-3c6c-d0c11c979843")
public static String es_PE_FIELD_Vendor_Dunning_Name="Morosidad";

@XendraTrl(Identifier="0c9f12c8-bbf4-462c-3c6c-d0c11c979843")
public static String es_PE_FIELD_Vendor_Dunning_Description="Reglas de morosidad para facturas vencidas";

@XendraTrl(Identifier="0c9f12c8-bbf4-462c-3c6c-d0c11c979843")
public static String es_PE_FIELD_Vendor_Dunning_Help="La Morosidad indica las reglas y métodos de cálculo de morosidad para pagos vencidos";

@XendraField(AD_Column_ID="C_Dunning_ID",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0c9f12c8-bbf4-462c-3c6c-d0c11c979843")
public static final String FIELDNAME_Vendor_Dunning="0c9f12c8-bbf4-462c-3c6c-d0c11c979843";

@XendraTrl(Identifier="fb35f09e-e3e6-af5f-4050-27bdc9e69f50")
public static String es_PE_FIELD_BusinessPartner_Dunning_Name="Morosidad";

@XendraTrl(Identifier="fb35f09e-e3e6-af5f-4050-27bdc9e69f50")
public static String es_PE_FIELD_BusinessPartner_Dunning_Description="Reglas de morosidad para facturas vencidas";

@XendraTrl(Identifier="fb35f09e-e3e6-af5f-4050-27bdc9e69f50")
public static String es_PE_FIELD_BusinessPartner_Dunning_Help="La Morosidad indica las reglas y métodos de cálculo de morosidad para pagos vencidos";

@XendraField(AD_Column_ID="C_Dunning_ID",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fb35f09e-e3e6-af5f-4050-27bdc9e69f50")
public static final String FIELDNAME_BusinessPartner_Dunning="fb35f09e-e3e6-af5f-4050-27bdc9e69f50";

@XendraTrl(Identifier="f7bd8815-cd61-12a6-b13f-f475d7379caf")
public static String es_PE_FIELD_AssignedPartners_Dunning_Name="Morosidad";

@XendraTrl(Identifier="f7bd8815-cd61-12a6-b13f-f475d7379caf")
public static String es_PE_FIELD_AssignedPartners_Dunning_Description="Reglas de morosidad para facturas vencidas";

@XendraTrl(Identifier="f7bd8815-cd61-12a6-b13f-f475d7379caf")
public static String es_PE_FIELD_AssignedPartners_Dunning_Help="La Morosidad indica las reglas y métodos de cálculo de morosidad para pagos vencidos";

@XendraField(AD_Column_ID="C_Dunning_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f7bd8815-cd61-12a6-b13f-f475d7379caf")
public static final String FIELDNAME_AssignedPartners_Dunning="f7bd8815-cd61-12a6-b13f-f475d7379caf";

@XendraTrl(Identifier="6cfd89bb-c711-177b-c128-a850d6bcee2a")
public static String es_PE_FIELD_Customer_Dunning2_Name="Morosidad";

@XendraTrl(Identifier="6cfd89bb-c711-177b-c128-a850d6bcee2a")
public static String es_PE_FIELD_Customer_Dunning2_Description="Reglas de morosidad para facturas vencidas";

@XendraTrl(Identifier="6cfd89bb-c711-177b-c128-a850d6bcee2a")
public static String es_PE_FIELD_Customer_Dunning2_Help="La Morosidad indica las reglas y métodos de cálculo de morosidad para pagos vencidos";

@XendraField(AD_Column_ID="C_Dunning_ID",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsCustomer@='Y'",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6cfd89bb-c711-177b-c128-a850d6bcee2a")
public static final String FIELDNAME_Customer_Dunning2="6cfd89bb-c711-177b-c128-a850d6bcee2a";

@XendraTrl(Identifier="b16eb2da-11a4-6f02-3986-6f25d8857589")
public static String es_PE_FIELD_Vendor_Dunning2_Name="Morosidad";

@XendraTrl(Identifier="b16eb2da-11a4-6f02-3986-6f25d8857589")
public static String es_PE_FIELD_Vendor_Dunning2_Description="Reglas de morosidad para facturas vencidas";

@XendraTrl(Identifier="b16eb2da-11a4-6f02-3986-6f25d8857589")
public static String es_PE_FIELD_Vendor_Dunning2_Help="La Morosidad indica las reglas y métodos de cálculo de morosidad para pagos vencidos";

@XendraField(AD_Column_ID="C_Dunning_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b16eb2da-11a4-6f02-3986-6f25d8857589")
public static final String FIELDNAME_Vendor_Dunning2="b16eb2da-11a4-6f02-3986-6f25d8857589";

@XendraTrl(Identifier="a9d146e3-a691-720d-c03c-9ab2d5ea331c")
public static String es_PE_FIELD_BusinessPartner_Dunning2_Name="Morosidad";

@XendraTrl(Identifier="a9d146e3-a691-720d-c03c-9ab2d5ea331c")
public static String es_PE_FIELD_BusinessPartner_Dunning2_Description="Reglas de morosidad para facturas vencidas";

@XendraTrl(Identifier="a9d146e3-a691-720d-c03c-9ab2d5ea331c")
public static String es_PE_FIELD_BusinessPartner_Dunning2_Help="La Morosidad indica las reglas y métodos de cálculo de morosidad para pagos vencidos";

@XendraField(AD_Column_ID="C_Dunning_ID",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a9d146e3-a691-720d-c03c-9ab2d5ea331c")
public static final String FIELDNAME_BusinessPartner_Dunning2="a9d146e3-a691-720d-c03c-9ab2d5ea331c";

@XendraTrl(Identifier="4a1b930e-3e10-06f2-6693-288babab2b4c")
public static String es_PE_COLUMN_C_Dunning_ID_Name="Morosidad";

@XendraColumn(AD_Element_ID="1ecce40a-5c50-54d9-2d4b-12d7fbab21a8",ColumnName="C_Dunning_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4a1b930e-3e10-06f2-6693-288babab2b4c",
Synchronized="2019-08-30 22:21:09.0")
/** Column name C_Dunning_ID */
public static final String COLUMNNAME_C_Dunning_ID = "C_Dunning_ID";
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

@XendraTrl(Identifier="bdd608ff-4ded-e5be-7267-66e49fc641e1")
public static String es_PE_FIELD_BusinessPartnerDimension_Greeting_Name="Saludo";

@XendraTrl(Identifier="bdd608ff-4ded-e5be-7267-66e49fc641e1")
public static String es_PE_FIELD_BusinessPartnerDimension_Greeting_Description="Saludo para imprimir en la correspondencia";

@XendraTrl(Identifier="bdd608ff-4ded-e5be-7267-66e49fc641e1")
public static String es_PE_FIELD_BusinessPartnerDimension_Greeting_Help="Los saludos identifican los saludos a imprimir en la correspondencia";

@XendraField(AD_Column_ID="C_Greeting_ID",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bdd608ff-4ded-e5be-7267-66e49fc641e1")
public static final String FIELDNAME_BusinessPartnerDimension_Greeting="bdd608ff-4ded-e5be-7267-66e49fc641e1";

@XendraTrl(Identifier="ad6b14f0-7877-7e59-44a7-081c75681805")
public static String es_PE_FIELD_PartnerSelection_Greeting_Name="Saludo";

@XendraTrl(Identifier="ad6b14f0-7877-7e59-44a7-081c75681805")
public static String es_PE_FIELD_PartnerSelection_Greeting_Description="Saludo para imprimir en la correspondencia";

@XendraTrl(Identifier="ad6b14f0-7877-7e59-44a7-081c75681805")
public static String es_PE_FIELD_PartnerSelection_Greeting_Help="Los saludos identifican los saludos a imprimir en la correspondencia";

@XendraField(AD_Column_ID="C_Greeting_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ad6b14f0-7877-7e59-44a7-081c75681805")
public static final String FIELDNAME_PartnerSelection_Greeting="ad6b14f0-7877-7e59-44a7-081c75681805";

@XendraTrl(Identifier="131bd53c-4d74-9633-28ab-25917dfcb2b0")
public static String es_PE_FIELD_EmployeeVendor_Greeting_Name="Saludo";

@XendraTrl(Identifier="131bd53c-4d74-9633-28ab-25917dfcb2b0")
public static String es_PE_FIELD_EmployeeVendor_Greeting_Description="Saludo para imprimir en la correspondencia";

@XendraTrl(Identifier="131bd53c-4d74-9633-28ab-25917dfcb2b0")
public static String es_PE_FIELD_EmployeeVendor_Greeting_Help="Los saludos identifican los saludos a imprimir en la correspondencia";

@XendraField(AD_Column_ID="C_Greeting_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="131bd53c-4d74-9633-28ab-25917dfcb2b0")
public static final String FIELDNAME_EmployeeVendor_Greeting="131bd53c-4d74-9633-28ab-25917dfcb2b0";

@XendraTrl(Identifier="d8a30068-2cb4-7a7a-431d-40dd4732a090")
public static String es_PE_FIELD_Customer_Greeting_Name="Saludo";

@XendraTrl(Identifier="d8a30068-2cb4-7a7a-431d-40dd4732a090")
public static String es_PE_FIELD_Customer_Greeting_Description="Saludo para imprimir en la correspondencia";

@XendraTrl(Identifier="d8a30068-2cb4-7a7a-431d-40dd4732a090")
public static String es_PE_FIELD_Customer_Greeting_Help="Los saludos identifican los saludos a imprimir en la correspondencia";

@XendraField(AD_Column_ID="C_Greeting_ID",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d8a30068-2cb4-7a7a-431d-40dd4732a090")
public static final String FIELDNAME_Customer_Greeting="d8a30068-2cb4-7a7a-431d-40dd4732a090";

@XendraTrl(Identifier="f909f17a-4be9-9133-97c3-81b62d6d0402")
public static String es_PE_FIELD_Customer_Greeting2_Name="Saludo";

@XendraTrl(Identifier="f909f17a-4be9-9133-97c3-81b62d6d0402")
public static String es_PE_FIELD_Customer_Greeting2_Description="Saludo para imprimir en la correspondencia";

@XendraTrl(Identifier="f909f17a-4be9-9133-97c3-81b62d6d0402")
public static String es_PE_FIELD_Customer_Greeting2_Help="Los saludos identifican los saludos a imprimir en la correspondencia";

@XendraField(AD_Column_ID="C_Greeting_ID",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f909f17a-4be9-9133-97c3-81b62d6d0402")
public static final String FIELDNAME_Customer_Greeting2="f909f17a-4be9-9133-97c3-81b62d6d0402";

@XendraTrl(Identifier="b2e69e78-f985-6f57-3bfd-70b36caea9dd")
public static String es_PE_FIELD_Vendor_Greeting_Name="Saludo";

@XendraTrl(Identifier="b2e69e78-f985-6f57-3bfd-70b36caea9dd")
public static String es_PE_FIELD_Vendor_Greeting_Description="Saludo para imprimir en la correspondencia";

@XendraTrl(Identifier="b2e69e78-f985-6f57-3bfd-70b36caea9dd")
public static String es_PE_FIELD_Vendor_Greeting_Help="Los saludos identifican los saludos a imprimir en la correspondencia";

@XendraField(AD_Column_ID="C_Greeting_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b2e69e78-f985-6f57-3bfd-70b36caea9dd")
public static final String FIELDNAME_Vendor_Greeting="b2e69e78-f985-6f57-3bfd-70b36caea9dd";

@XendraTrl(Identifier="e6a099f5-1cff-a25f-0d42-38197efd3d93")
public static String es_PE_FIELD_BusinessPartner_Greeting_Name="Saludo";

@XendraTrl(Identifier="e6a099f5-1cff-a25f-0d42-38197efd3d93")
public static String es_PE_FIELD_BusinessPartner_Greeting_Description="Saludo para imprimir en la correspondencia";

@XendraTrl(Identifier="e6a099f5-1cff-a25f-0d42-38197efd3d93")
public static String es_PE_FIELD_BusinessPartner_Greeting_Help="Los saludos identifican los saludos a imprimir en la correspondencia";

@XendraField(AD_Column_ID="C_Greeting_ID",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e6a099f5-1cff-a25f-0d42-38197efd3d93")
public static final String FIELDNAME_BusinessPartner_Greeting="e6a099f5-1cff-a25f-0d42-38197efd3d93";

@XendraTrl(Identifier="f613bb19-b187-e9f7-364b-5f66282b5aee")
public static String es_PE_FIELD_AssignedPartners_Greeting_Name="Saludo";

@XendraTrl(Identifier="f613bb19-b187-e9f7-364b-5f66282b5aee")
public static String es_PE_FIELD_AssignedPartners_Greeting_Description="Saludo para imprimir en la correspondencia";

@XendraTrl(Identifier="f613bb19-b187-e9f7-364b-5f66282b5aee")
public static String es_PE_FIELD_AssignedPartners_Greeting_Help="Los saludos identifican los saludos a imprimir en la correspondencia";

@XendraField(AD_Column_ID="C_Greeting_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f613bb19-b187-e9f7-364b-5f66282b5aee")
public static final String FIELDNAME_AssignedPartners_Greeting="f613bb19-b187-e9f7-364b-5f66282b5aee";

@XendraTrl(Identifier="bb15cb2c-1aa1-f1b2-696c-79bc76bdd07d")
public static String es_PE_FIELD_Vendor_Greeting2_Name="Saludo";

@XendraTrl(Identifier="bb15cb2c-1aa1-f1b2-696c-79bc76bdd07d")
public static String es_PE_FIELD_Vendor_Greeting2_Description="Saludo para imprimir en la correspondencia";

@XendraTrl(Identifier="bb15cb2c-1aa1-f1b2-696c-79bc76bdd07d")
public static String es_PE_FIELD_Vendor_Greeting2_Help="Los saludos identifican los saludos a imprimir en la correspondencia";

@XendraField(AD_Column_ID="C_Greeting_ID",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bb15cb2c-1aa1-f1b2-696c-79bc76bdd07d")
public static final String FIELDNAME_Vendor_Greeting2="bb15cb2c-1aa1-f1b2-696c-79bc76bdd07d";

@XendraTrl(Identifier="41a36739-ad9d-f728-8619-c1833c717519")
public static String es_PE_FIELD_Employee_Greeting_Name="Saludo";

@XendraTrl(Identifier="41a36739-ad9d-f728-8619-c1833c717519")
public static String es_PE_FIELD_Employee_Greeting_Description="Saludo para imprimir en la correspondencia";

@XendraTrl(Identifier="41a36739-ad9d-f728-8619-c1833c717519")
public static String es_PE_FIELD_Employee_Greeting_Help="Los saludos identifican los saludos a imprimir en la correspondencia";

@XendraField(AD_Column_ID="C_Greeting_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="41a36739-ad9d-f728-8619-c1833c717519")
public static final String FIELDNAME_Employee_Greeting="41a36739-ad9d-f728-8619-c1833c717519";

@XendraTrl(Identifier="0382faec-2a76-03f7-6459-a956ded19cc1")
public static String es_PE_FIELD_BusinessPartner_Greeting2_Name="Saludo";

@XendraTrl(Identifier="0382faec-2a76-03f7-6459-a956ded19cc1")
public static String es_PE_FIELD_BusinessPartner_Greeting2_Description="Saludo para imprimir en la correspondencia";

@XendraTrl(Identifier="0382faec-2a76-03f7-6459-a956ded19cc1")
public static String es_PE_FIELD_BusinessPartner_Greeting2_Help="Los saludos identifican los saludos a imprimir en la correspondencia";

@XendraField(AD_Column_ID="C_Greeting_ID",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0382faec-2a76-03f7-6459-a956ded19cc1")
public static final String FIELDNAME_BusinessPartner_Greeting2="0382faec-2a76-03f7-6459-a956ded19cc1";

@XendraTrl(Identifier="f79ceac1-cf1e-61b1-3960-3656665cfd78")
public static String es_PE_COLUMN_C_Greeting_ID_Name="Saludo";

@XendraColumn(AD_Element_ID="2865a1ce-d044-a158-129d-7699708f4ce1",ColumnName="C_Greeting_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f79ceac1-cf1e-61b1-3960-3656665cfd78",
Synchronized="2019-08-30 22:21:09.0")
/** Column name C_Greeting_ID */
public static final String COLUMNNAME_C_Greeting_ID = "C_Greeting_ID";
/** Set Invoice Schedule.
@param C_InvoiceSchedule_ID Schedule for generating Invoices */
public void setC_InvoiceSchedule_ID (int C_InvoiceSchedule_ID)
{
if (C_InvoiceSchedule_ID <= 0) set_Value (COLUMNNAME_C_InvoiceSchedule_ID, null);
 else 
set_Value (COLUMNNAME_C_InvoiceSchedule_ID, Integer.valueOf(C_InvoiceSchedule_ID));
}
/** Get Invoice Schedule.
@return Schedule for generating Invoices */
public int getC_InvoiceSchedule_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_InvoiceSchedule_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="645fb9c3-2af1-9ee1-4d03-83fafee83d94")
public static String es_PE_FIELD_Customer_InvoiceSchedule_Name="Programa de Facturación";

@XendraTrl(Identifier="645fb9c3-2af1-9ee1-4d03-83fafee83d94")
public static String es_PE_FIELD_Customer_InvoiceSchedule_Description="Programa para generar facturas";

@XendraTrl(Identifier="645fb9c3-2af1-9ee1-4d03-83fafee83d94")
public static String es_PE_FIELD_Customer_InvoiceSchedule_Help="El programa de facturación identifica la frecuencia usada cuando se generan facturas.";

@XendraField(AD_Column_ID="C_InvoiceSchedule_ID",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsCustomer@='Y'",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="645fb9c3-2af1-9ee1-4d03-83fafee83d94")
public static final String FIELDNAME_Customer_InvoiceSchedule="645fb9c3-2af1-9ee1-4d03-83fafee83d94";

@XendraTrl(Identifier="23a0fc3f-0aab-02b9-27d9-e663e36da896")
public static String es_PE_FIELD_Vendor_InvoiceSchedule_Name="Programa de Facturación";

@XendraTrl(Identifier="23a0fc3f-0aab-02b9-27d9-e663e36da896")
public static String es_PE_FIELD_Vendor_InvoiceSchedule_Description="Programa para generar facturas";

@XendraTrl(Identifier="23a0fc3f-0aab-02b9-27d9-e663e36da896")
public static String es_PE_FIELD_Vendor_InvoiceSchedule_Help="El programa de facturación identifica la frecuencia usada cuando se generan facturas.";

@XendraField(AD_Column_ID="C_InvoiceSchedule_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="23a0fc3f-0aab-02b9-27d9-e663e36da896")
public static final String FIELDNAME_Vendor_InvoiceSchedule="23a0fc3f-0aab-02b9-27d9-e663e36da896";

@XendraTrl(Identifier="022d9a67-b828-71ce-4491-92456cf7e9b5")
public static String es_PE_FIELD_PartnerSelection_InvoiceSchedule_Name="Programa de Facturación";

@XendraTrl(Identifier="022d9a67-b828-71ce-4491-92456cf7e9b5")
public static String es_PE_FIELD_PartnerSelection_InvoiceSchedule_Description="Programa para generar facturas";

@XendraTrl(Identifier="022d9a67-b828-71ce-4491-92456cf7e9b5")
public static String es_PE_FIELD_PartnerSelection_InvoiceSchedule_Help="El programa de facturación identifica la frecuencia usada cuando se generan facturas.";

@XendraField(AD_Column_ID="C_InvoiceSchedule_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="022d9a67-b828-71ce-4491-92456cf7e9b5")
public static final String FIELDNAME_PartnerSelection_InvoiceSchedule="022d9a67-b828-71ce-4491-92456cf7e9b5";

@XendraTrl(Identifier="5f16d638-a664-0235-7cd4-638018e0b5f9")
public static String es_PE_FIELD_EmployeeVendor_InvoiceSchedule_Name="Programa de Facturación";

@XendraTrl(Identifier="5f16d638-a664-0235-7cd4-638018e0b5f9")
public static String es_PE_FIELD_EmployeeVendor_InvoiceSchedule_Description="Programa para generar facturas";

@XendraTrl(Identifier="5f16d638-a664-0235-7cd4-638018e0b5f9")
public static String es_PE_FIELD_EmployeeVendor_InvoiceSchedule_Help="El programa de facturación identifica la frecuencia usada cuando se generan facturas.";

@XendraField(AD_Column_ID="C_InvoiceSchedule_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5f16d638-a664-0235-7cd4-638018e0b5f9")
public static final String FIELDNAME_EmployeeVendor_InvoiceSchedule="5f16d638-a664-0235-7cd4-638018e0b5f9";

@XendraTrl(Identifier="3f219245-c25a-1a47-8793-d2193209b136")
public static String es_PE_FIELD_Customer_InvoiceSchedule2_Name="Programa de Facturación";

@XendraTrl(Identifier="3f219245-c25a-1a47-8793-d2193209b136")
public static String es_PE_FIELD_Customer_InvoiceSchedule2_Description="Programa para generar facturas";

@XendraTrl(Identifier="3f219245-c25a-1a47-8793-d2193209b136")
public static String es_PE_FIELD_Customer_InvoiceSchedule2_Help="El programa de facturación identifica la frecuencia usada cuando se generan facturas.";

@XendraField(AD_Column_ID="C_InvoiceSchedule_ID",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3f219245-c25a-1a47-8793-d2193209b136")
public static final String FIELDNAME_Customer_InvoiceSchedule2="3f219245-c25a-1a47-8793-d2193209b136";

@XendraTrl(Identifier="781e8b9b-9a19-30ae-5c22-c7d2d48a9b5c")
public static String es_PE_FIELD_BusinessPartner_InvoiceSchedule_Name="Programa de Facturación";

@XendraTrl(Identifier="781e8b9b-9a19-30ae-5c22-c7d2d48a9b5c")
public static String es_PE_FIELD_BusinessPartner_InvoiceSchedule_Description="Programa para generar facturas";

@XendraTrl(Identifier="781e8b9b-9a19-30ae-5c22-c7d2d48a9b5c")
public static String es_PE_FIELD_BusinessPartner_InvoiceSchedule_Help="El programa de facturación identifica la frecuencia usada cuando se generan facturas.";

@XendraField(AD_Column_ID="C_InvoiceSchedule_ID",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="781e8b9b-9a19-30ae-5c22-c7d2d48a9b5c")
public static final String FIELDNAME_BusinessPartner_InvoiceSchedule="781e8b9b-9a19-30ae-5c22-c7d2d48a9b5c";

@XendraTrl(Identifier="954989dc-2928-5b76-a829-e7fa3ee487e6")
public static String es_PE_FIELD_Employee_InvoiceSchedule_Name="Programa de Facturación";

@XendraTrl(Identifier="954989dc-2928-5b76-a829-e7fa3ee487e6")
public static String es_PE_FIELD_Employee_InvoiceSchedule_Description="Programa para generar facturas";

@XendraTrl(Identifier="954989dc-2928-5b76-a829-e7fa3ee487e6")
public static String es_PE_FIELD_Employee_InvoiceSchedule_Help="El programa de facturación identifica la frecuencia usada cuando se generan facturas.";

@XendraField(AD_Column_ID="C_InvoiceSchedule_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="954989dc-2928-5b76-a829-e7fa3ee487e6")
public static final String FIELDNAME_Employee_InvoiceSchedule="954989dc-2928-5b76-a829-e7fa3ee487e6";

@XendraTrl(Identifier="630ea7cb-f349-6425-69ba-9a91dbbccb38")
public static String es_PE_FIELD_BusinessPartnerDimension_InvoiceSchedule_Name="Programa de Facturación";

@XendraTrl(Identifier="630ea7cb-f349-6425-69ba-9a91dbbccb38")
public static String es_PE_FIELD_BusinessPartnerDimension_InvoiceSchedule_Description="Programa para generar facturas";

@XendraTrl(Identifier="630ea7cb-f349-6425-69ba-9a91dbbccb38")
public static String es_PE_FIELD_BusinessPartnerDimension_InvoiceSchedule_Help="El programa de facturación identifica la frecuencia usada cuando se generan facturas.";

@XendraField(AD_Column_ID="C_InvoiceSchedule_ID",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="630ea7cb-f349-6425-69ba-9a91dbbccb38")
public static final String FIELDNAME_BusinessPartnerDimension_InvoiceSchedule="630ea7cb-f349-6425-69ba-9a91dbbccb38";

@XendraTrl(Identifier="e65957fd-7f04-f0b4-0462-ed4cab576da7")
public static String es_PE_FIELD_Vendor_InvoiceSchedule2_Name="Programa de Facturación";

@XendraTrl(Identifier="e65957fd-7f04-f0b4-0462-ed4cab576da7")
public static String es_PE_FIELD_Vendor_InvoiceSchedule2_Description="Programa para generar facturas";

@XendraTrl(Identifier="e65957fd-7f04-f0b4-0462-ed4cab576da7")
public static String es_PE_FIELD_Vendor_InvoiceSchedule2_Help="El programa de facturación identifica la frecuencia usada cuando se generan facturas.";

@XendraField(AD_Column_ID="C_InvoiceSchedule_ID",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e65957fd-7f04-f0b4-0462-ed4cab576da7")
public static final String FIELDNAME_Vendor_InvoiceSchedule2="e65957fd-7f04-f0b4-0462-ed4cab576da7";

@XendraTrl(Identifier="a0a13fb0-26b1-c0fc-bea5-ea55df0d5247")
public static String es_PE_FIELD_AssignedPartners_InvoiceSchedule_Name="Programa de Facturación";

@XendraTrl(Identifier="a0a13fb0-26b1-c0fc-bea5-ea55df0d5247")
public static String es_PE_FIELD_AssignedPartners_InvoiceSchedule_Description="Programa para generar facturas";

@XendraTrl(Identifier="a0a13fb0-26b1-c0fc-bea5-ea55df0d5247")
public static String es_PE_FIELD_AssignedPartners_InvoiceSchedule_Help="El programa de facturación identifica la frecuencia usada cuando se generan facturas.";

@XendraField(AD_Column_ID="C_InvoiceSchedule_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a0a13fb0-26b1-c0fc-bea5-ea55df0d5247")
public static final String FIELDNAME_AssignedPartners_InvoiceSchedule="a0a13fb0-26b1-c0fc-bea5-ea55df0d5247";

@XendraTrl(Identifier="9bda508c-3ee6-d643-0000-dbb86e88b8eb")
public static String es_PE_FIELD_BusinessPartner_InvoiceSchedule2_Name="Programa de Facturación";

@XendraTrl(Identifier="9bda508c-3ee6-d643-0000-dbb86e88b8eb")
public static String es_PE_FIELD_BusinessPartner_InvoiceSchedule2_Description="Programa para generar facturas";

@XendraTrl(Identifier="9bda508c-3ee6-d643-0000-dbb86e88b8eb")
public static String es_PE_FIELD_BusinessPartner_InvoiceSchedule2_Help="El programa de facturación identifica la frecuencia usada cuando se generan facturas.";

@XendraField(AD_Column_ID="C_InvoiceSchedule_ID",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9bda508c-3ee6-d643-0000-dbb86e88b8eb")
public static final String FIELDNAME_BusinessPartner_InvoiceSchedule2="9bda508c-3ee6-d643-0000-dbb86e88b8eb";

@XendraTrl(Identifier="c3dc081c-2fca-7e02-508a-d12049571673")
public static String es_PE_COLUMN_C_InvoiceSchedule_ID_Name="Programa de Facturación";

@XendraColumn(AD_Element_ID="daa9a35e-36ed-4c07-7639-6e4d1a19d8f5",
ColumnName="C_InvoiceSchedule_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c3dc081c-2fca-7e02-508a-d12049571673",Synchronized="2019-08-30 22:21:09.0")
/** Column name C_InvoiceSchedule_ID */
public static final String COLUMNNAME_C_InvoiceSchedule_ID = "C_InvoiceSchedule_ID";
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

@XendraTrl(Identifier="493fb276-e2e7-62a0-5a5e-58a28d8c190d")
public static String es_PE_FIELD_Customer_PaymentTerm_Name="Término de Pago";

@XendraTrl(Identifier="493fb276-e2e7-62a0-5a5e-58a28d8c190d")
public static String es_PE_FIELD_Customer_PaymentTerm_Description="Condiciones de pago de esta transacción";

@XendraTrl(Identifier="493fb276-e2e7-62a0-5a5e-58a28d8c190d")
public static String es_PE_FIELD_Customer_PaymentTerm_Help="Las condiciones de pago indican el método y tiempo de pago para esta transacción.";

@XendraField(AD_Column_ID="C_PaymentTerm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsCustomer@='Y'",DisplayLength=14,IsReadOnly=false,SeqNo=140,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="493fb276-e2e7-62a0-5a5e-58a28d8c190d")
public static final String FIELDNAME_Customer_PaymentTerm="493fb276-e2e7-62a0-5a5e-58a28d8c190d";

@XendraTrl(Identifier="b92524a2-36bf-720c-434e-01c926f64e6f")
public static String es_PE_FIELD_EmployeeVendor_PaymentTerm_Name="Término de Pago";

@XendraTrl(Identifier="b92524a2-36bf-720c-434e-01c926f64e6f")
public static String es_PE_FIELD_EmployeeVendor_PaymentTerm_Description="Condiciones de pago de esta transacción";

@XendraTrl(Identifier="b92524a2-36bf-720c-434e-01c926f64e6f")
public static String es_PE_FIELD_EmployeeVendor_PaymentTerm_Help="Las condiciones de pago indican el método y tiempo de pago para esta transacción.";

@XendraField(AD_Column_ID="C_PaymentTerm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b92524a2-36bf-720c-434e-01c926f64e6f")
public static final String FIELDNAME_EmployeeVendor_PaymentTerm="b92524a2-36bf-720c-434e-01c926f64e6f";

@XendraTrl(Identifier="d02393ae-1ccd-ff1c-c1cf-f4ea9deb2684")
public static String es_PE_FIELD_Customer_PaymentTerm2_Name="Término de Pago";

@XendraTrl(Identifier="d02393ae-1ccd-ff1c-c1cf-f4ea9deb2684")
public static String es_PE_FIELD_Customer_PaymentTerm2_Description="Condiciones de pago de esta transacción";

@XendraTrl(Identifier="d02393ae-1ccd-ff1c-c1cf-f4ea9deb2684")
public static String es_PE_FIELD_Customer_PaymentTerm2_Help="Las condiciones de pago indican el método y tiempo de pago para esta transacción.";

@XendraField(AD_Column_ID="C_PaymentTerm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d02393ae-1ccd-ff1c-c1cf-f4ea9deb2684")
public static final String FIELDNAME_Customer_PaymentTerm2="d02393ae-1ccd-ff1c-c1cf-f4ea9deb2684";

@XendraTrl(Identifier="63f9a306-c4bc-fc7c-9804-1ad9664e3c66")
public static String es_PE_FIELD_BusinessPartnerDimension_PaymentTerm_Name="Término de Pago";

@XendraTrl(Identifier="63f9a306-c4bc-fc7c-9804-1ad9664e3c66")
public static String es_PE_FIELD_BusinessPartnerDimension_PaymentTerm_Description="Condiciones de pago de esta transacción";

@XendraTrl(Identifier="63f9a306-c4bc-fc7c-9804-1ad9664e3c66")
public static String es_PE_FIELD_BusinessPartnerDimension_PaymentTerm_Help="Las condiciones de pago indican el método y tiempo de pago para esta transacción.";

@XendraField(AD_Column_ID="C_PaymentTerm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="63f9a306-c4bc-fc7c-9804-1ad9664e3c66")
public static final String FIELDNAME_BusinessPartnerDimension_PaymentTerm="63f9a306-c4bc-fc7c-9804-1ad9664e3c66";

@XendraTrl(Identifier="b61cc9af-855e-4ce2-213c-f72af8ab9ed5")
public static String es_PE_FIELD_PartnerSelection_PaymentTerm_Name="Término de Pago";

@XendraTrl(Identifier="b61cc9af-855e-4ce2-213c-f72af8ab9ed5")
public static String es_PE_FIELD_PartnerSelection_PaymentTerm_Description="Condiciones de pago de esta transacción";

@XendraTrl(Identifier="b61cc9af-855e-4ce2-213c-f72af8ab9ed5")
public static String es_PE_FIELD_PartnerSelection_PaymentTerm_Help="Las condiciones de pago indican el método y tiempo de pago para esta transacción.";

@XendraField(AD_Column_ID="C_PaymentTerm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b61cc9af-855e-4ce2-213c-f72af8ab9ed5")
public static final String FIELDNAME_PartnerSelection_PaymentTerm="b61cc9af-855e-4ce2-213c-f72af8ab9ed5";

@XendraTrl(Identifier="c0c98b3d-c656-f315-c01c-516d5d45713c")
public static String es_PE_FIELD_Vendor_PaymentTerm_Name="Término de Pago";

@XendraTrl(Identifier="c0c98b3d-c656-f315-c01c-516d5d45713c")
public static String es_PE_FIELD_Vendor_PaymentTerm_Description="Condiciones de pago de esta transacción";

@XendraTrl(Identifier="c0c98b3d-c656-f315-c01c-516d5d45713c")
public static String es_PE_FIELD_Vendor_PaymentTerm_Help="Las condiciones de pago indican el método y tiempo de pago para esta transacción.";

@XendraField(AD_Column_ID="C_PaymentTerm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c0c98b3d-c656-f315-c01c-516d5d45713c")
public static final String FIELDNAME_Vendor_PaymentTerm="c0c98b3d-c656-f315-c01c-516d5d45713c";

@XendraTrl(Identifier="90422a8a-16df-6638-703a-4503d736907b")
public static String es_PE_FIELD_Employee_PaymentTerm_Name="Término de Pago";

@XendraTrl(Identifier="90422a8a-16df-6638-703a-4503d736907b")
public static String es_PE_FIELD_Employee_PaymentTerm_Description="Condiciones de pago de esta transacción";

@XendraTrl(Identifier="90422a8a-16df-6638-703a-4503d736907b")
public static String es_PE_FIELD_Employee_PaymentTerm_Help="Las condiciones de pago indican el método y tiempo de pago para esta transacción.";

@XendraField(AD_Column_ID="C_PaymentTerm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="90422a8a-16df-6638-703a-4503d736907b")
public static final String FIELDNAME_Employee_PaymentTerm="90422a8a-16df-6638-703a-4503d736907b";

@XendraTrl(Identifier="fec11011-4110-6bc9-3358-a67806321132")
public static String es_PE_FIELD_AssignedPartners_PaymentTerm_Name="Término de Pago";

@XendraTrl(Identifier="fec11011-4110-6bc9-3358-a67806321132")
public static String es_PE_FIELD_AssignedPartners_PaymentTerm_Description="Condiciones de pago de esta transacción";

@XendraTrl(Identifier="fec11011-4110-6bc9-3358-a67806321132")
public static String es_PE_FIELD_AssignedPartners_PaymentTerm_Help="Las condiciones de pago indican el método y tiempo de pago para esta transacción.";

@XendraField(AD_Column_ID="C_PaymentTerm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fec11011-4110-6bc9-3358-a67806321132")
public static final String FIELDNAME_AssignedPartners_PaymentTerm="fec11011-4110-6bc9-3358-a67806321132";

@XendraTrl(Identifier="974a1a72-f421-ae50-a738-6db3d7c8f31e")
public static String es_PE_FIELD_Vendor_PaymentTerm2_Name="Término de Pago";

@XendraTrl(Identifier="974a1a72-f421-ae50-a738-6db3d7c8f31e")
public static String es_PE_FIELD_Vendor_PaymentTerm2_Description="Condiciones de pago de esta transacción";

@XendraTrl(Identifier="974a1a72-f421-ae50-a738-6db3d7c8f31e")
public static String es_PE_FIELD_Vendor_PaymentTerm2_Help="Las condiciones de pago indican el método y tiempo de pago para esta transacción.";

@XendraField(AD_Column_ID="C_PaymentTerm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="974a1a72-f421-ae50-a738-6db3d7c8f31e")
public static final String FIELDNAME_Vendor_PaymentTerm2="974a1a72-f421-ae50-a738-6db3d7c8f31e";

@XendraTrl(Identifier="c4b24381-2364-0edc-b9ae-93dc3a2a909b")
public static String es_PE_FIELD_BusinessPartner_PaymentTerm_Name="Término de Pago";

@XendraTrl(Identifier="c4b24381-2364-0edc-b9ae-93dc3a2a909b")
public static String es_PE_FIELD_BusinessPartner_PaymentTerm_Description="Condiciones de pago de esta transacción";

@XendraTrl(Identifier="c4b24381-2364-0edc-b9ae-93dc3a2a909b")
public static String es_PE_FIELD_BusinessPartner_PaymentTerm_Help="Las condiciones de pago indican el método y tiempo de pago para esta transacción.";

@XendraField(AD_Column_ID="C_PaymentTerm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c4b24381-2364-0edc-b9ae-93dc3a2a909b")
public static final String FIELDNAME_BusinessPartner_PaymentTerm="c4b24381-2364-0edc-b9ae-93dc3a2a909b";

@XendraTrl(Identifier="c61f6c3c-b39f-a312-a31a-f2fdb0a9b250")
public static String es_PE_FIELD_BusinessPartner_PaymentTerm2_Name="Término de Pago";

@XendraTrl(Identifier="c61f6c3c-b39f-a312-a31a-f2fdb0a9b250")
public static String es_PE_FIELD_BusinessPartner_PaymentTerm2_Description="Condiciones de pago de esta transacción";

@XendraTrl(Identifier="c61f6c3c-b39f-a312-a31a-f2fdb0a9b250")
public static String es_PE_FIELD_BusinessPartner_PaymentTerm2_Help="Las condiciones de pago indican el método y tiempo de pago para esta transacción.";

@XendraField(AD_Column_ID="C_PaymentTerm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c61f6c3c-b39f-a312-a31a-f2fdb0a9b250")
public static final String FIELDNAME_BusinessPartner_PaymentTerm2="c61f6c3c-b39f-a312-a31a-f2fdb0a9b250";

@XendraTrl(Identifier="c9998d3e-ba17-af47-16c9-134931ed470a")
public static String es_PE_COLUMN_C_PaymentTerm_ID_Name="Término de Pago";

@XendraColumn(AD_Element_ID="9b2224b8-8020-a83c-2d1e-ea35741c781a",ColumnName="C_PaymentTerm_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c9998d3e-ba17-af47-16c9-134931ed470a",
Synchronized="2019-08-30 22:21:09.0")
/** Column name C_PaymentTerm_ID */
public static final String COLUMNNAME_C_PaymentTerm_ID = "C_PaymentTerm_ID";
/** Set Delivery Rule.
@param DeliveryRule Defines the timing of Delivery */
public void setDeliveryRule (String DeliveryRule)
{
if (DeliveryRule != null && DeliveryRule.length() > 1)
{
log.warning("Length > 1 - truncated");
DeliveryRule = DeliveryRule.substring(0,0);
}
set_Value (COLUMNNAME_DeliveryRule, DeliveryRule);
}
/** Get Delivery Rule.
@return Defines the timing of Delivery */
public String getDeliveryRule() 
{
return (String)get_Value(COLUMNNAME_DeliveryRule);
}

@XendraTrl(Identifier="eb34384b-6f8d-c0fa-2a0e-02a00f087f64")
public static String es_PE_FIELD_BusinessPartner_DeliveryRule_Name="Regla de Entrega";

@XendraTrl(Identifier="eb34384b-6f8d-c0fa-2a0e-02a00f087f64")
public static String es_PE_FIELD_BusinessPartner_DeliveryRule_Description="Define los tiempos de entrega";

@XendraTrl(Identifier="eb34384b-6f8d-c0fa-2a0e-02a00f087f64")
public static String es_PE_FIELD_BusinessPartner_DeliveryRule_Help="La Regla de Entrega indica cuando una orden debe ser entregada. Por Ej. Si la orden debiera entregarse cuando  esta completa; cuando una partida esta completa ó cuando el producto llega a estar disponible.";

@XendraField(AD_Column_ID="DeliveryRule",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="eb34384b-6f8d-c0fa-2a0e-02a00f087f64")
public static final String FIELDNAME_BusinessPartner_DeliveryRule="eb34384b-6f8d-c0fa-2a0e-02a00f087f64";

@XendraTrl(Identifier="68a3cd2d-15d7-1643-c73e-e5b804229373")
public static String es_PE_FIELD_Employee_DeliveryRule_Name="Regla de Entrega";

@XendraTrl(Identifier="68a3cd2d-15d7-1643-c73e-e5b804229373")
public static String es_PE_FIELD_Employee_DeliveryRule_Description="Define los tiempos de entrega";

@XendraTrl(Identifier="68a3cd2d-15d7-1643-c73e-e5b804229373")
public static String es_PE_FIELD_Employee_DeliveryRule_Help="La Regla de Entrega indica cuando una orden debe ser entregada. Por Ej. Si la orden debiera entregarse cuando  esta completa; cuando una partida esta completa ó cuando el producto llega a estar disponible.";

@XendraField(AD_Column_ID="DeliveryRule",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="68a3cd2d-15d7-1643-c73e-e5b804229373")
public static final String FIELDNAME_Employee_DeliveryRule="68a3cd2d-15d7-1643-c73e-e5b804229373";

@XendraTrl(Identifier="73ae8b3f-a6a1-7317-a69a-4b0a7e13a447")
public static String es_PE_FIELD_Customer_DeliveryRule_Name="Regla de Entrega";

@XendraTrl(Identifier="73ae8b3f-a6a1-7317-a69a-4b0a7e13a447")
public static String es_PE_FIELD_Customer_DeliveryRule_Description="Define los tiempos de entrega";

@XendraTrl(Identifier="73ae8b3f-a6a1-7317-a69a-4b0a7e13a447")
public static String es_PE_FIELD_Customer_DeliveryRule_Help="La Regla de Entrega indica cuando una orden debe ser entregada. Por Ej. Si la orden debiera entregarse cuando  esta completa; cuando una partida esta completa ó cuando el producto llega a estar disponible.";

@XendraField(AD_Column_ID="DeliveryRule",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="73ae8b3f-a6a1-7317-a69a-4b0a7e13a447")
public static final String FIELDNAME_Customer_DeliveryRule="73ae8b3f-a6a1-7317-a69a-4b0a7e13a447";

@XendraTrl(Identifier="66ccb6f8-90fc-b7e7-3bfa-faf270312625")
public static String es_PE_FIELD_PartnerSelection_DeliveryRule_Name="Regla de Entrega";

@XendraTrl(Identifier="66ccb6f8-90fc-b7e7-3bfa-faf270312625")
public static String es_PE_FIELD_PartnerSelection_DeliveryRule_Description="Define los tiempos de entrega";

@XendraTrl(Identifier="66ccb6f8-90fc-b7e7-3bfa-faf270312625")
public static String es_PE_FIELD_PartnerSelection_DeliveryRule_Help="La Regla de Entrega indica cuando una orden debe ser entregada. Por Ej. Si la orden debiera entregarse cuando  esta completa; cuando una partida esta completa ó cuando el producto llega a estar disponible.";

@XendraField(AD_Column_ID="DeliveryRule",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="66ccb6f8-90fc-b7e7-3bfa-faf270312625")
public static final String FIELDNAME_PartnerSelection_DeliveryRule="66ccb6f8-90fc-b7e7-3bfa-faf270312625";

@XendraTrl(Identifier="49a0972b-a037-f4a9-f54f-660511eded60")
public static String es_PE_FIELD_Vendor_DeliveryRule_Name="Regla de Entrega";

@XendraTrl(Identifier="49a0972b-a037-f4a9-f54f-660511eded60")
public static String es_PE_FIELD_Vendor_DeliveryRule_Description="Define los tiempos de entrega";

@XendraTrl(Identifier="49a0972b-a037-f4a9-f54f-660511eded60")
public static String es_PE_FIELD_Vendor_DeliveryRule_Help="La Regla de Entrega indica cuando una orden debe ser entregada. Por Ej. Si la orden debiera entregarse cuando  esta completa; cuando una partida esta completa ó cuando el producto llega a estar disponible.";

@XendraField(AD_Column_ID="DeliveryRule",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="49a0972b-a037-f4a9-f54f-660511eded60")
public static final String FIELDNAME_Vendor_DeliveryRule="49a0972b-a037-f4a9-f54f-660511eded60";

@XendraTrl(Identifier="5c065179-f519-7744-217e-8eee5b8a31e4")
public static String es_PE_FIELD_AssignedPartners_DeliveryRule_Name="Regla de Entrega";

@XendraTrl(Identifier="5c065179-f519-7744-217e-8eee5b8a31e4")
public static String es_PE_FIELD_AssignedPartners_DeliveryRule_Description="Define los tiempos de entrega";

@XendraTrl(Identifier="5c065179-f519-7744-217e-8eee5b8a31e4")
public static String es_PE_FIELD_AssignedPartners_DeliveryRule_Help="La Regla de Entrega indica cuando una orden debe ser entregada. Por Ej. Si la orden debiera entregarse cuando  esta completa; cuando una partida esta completa ó cuando el producto llega a estar disponible.";

@XendraField(AD_Column_ID="DeliveryRule",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5c065179-f519-7744-217e-8eee5b8a31e4")
public static final String FIELDNAME_AssignedPartners_DeliveryRule="5c065179-f519-7744-217e-8eee5b8a31e4";

@XendraTrl(Identifier="f03c3b10-3c04-9717-c33d-8c287fadb92a")
public static String es_PE_FIELD_BusinessPartnerDimension_DeliveryRule_Name="Regla de Entrega";

@XendraTrl(Identifier="f03c3b10-3c04-9717-c33d-8c287fadb92a")
public static String es_PE_FIELD_BusinessPartnerDimension_DeliveryRule_Description="Define los tiempos de entrega";

@XendraTrl(Identifier="f03c3b10-3c04-9717-c33d-8c287fadb92a")
public static String es_PE_FIELD_BusinessPartnerDimension_DeliveryRule_Help="La Regla de Entrega indica cuando una orden debe ser entregada. Por Ej. Si la orden debiera entregarse cuando  esta completa; cuando una partida esta completa ó cuando el producto llega a estar disponible.";

@XendraField(AD_Column_ID="DeliveryRule",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f03c3b10-3c04-9717-c33d-8c287fadb92a")
public static final String FIELDNAME_BusinessPartnerDimension_DeliveryRule="f03c3b10-3c04-9717-c33d-8c287fadb92a";

@XendraTrl(Identifier="72f45440-d10a-87ee-89d1-b5f2f3c7b657")
public static String es_PE_FIELD_EmployeeVendor_DeliveryRule_Name="Regla de Entrega";

@XendraTrl(Identifier="72f45440-d10a-87ee-89d1-b5f2f3c7b657")
public static String es_PE_FIELD_EmployeeVendor_DeliveryRule_Description="Define los tiempos de entrega";

@XendraTrl(Identifier="72f45440-d10a-87ee-89d1-b5f2f3c7b657")
public static String es_PE_FIELD_EmployeeVendor_DeliveryRule_Help="La Regla de Entrega indica cuando una orden debe ser entregada. Por Ej. Si la orden debiera entregarse cuando  esta completa; cuando una partida esta completa ó cuando el producto llega a estar disponible.";

@XendraField(AD_Column_ID="DeliveryRule",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="72f45440-d10a-87ee-89d1-b5f2f3c7b657")
public static final String FIELDNAME_EmployeeVendor_DeliveryRule="72f45440-d10a-87ee-89d1-b5f2f3c7b657";

@XendraTrl(Identifier="f535816c-f0a0-247c-b0fa-08646579c2b6")
public static String es_PE_FIELD_Customer_DeliveryRule2_Name="Regla de Entrega";

@XendraTrl(Identifier="f535816c-f0a0-247c-b0fa-08646579c2b6")
public static String es_PE_FIELD_Customer_DeliveryRule2_Description="Define los tiempos de entrega";

@XendraTrl(Identifier="f535816c-f0a0-247c-b0fa-08646579c2b6")
public static String es_PE_FIELD_Customer_DeliveryRule2_Help="La Regla de Entrega indica cuando una orden debe ser entregada. Por Ej. Si la orden debiera entregarse cuando  esta completa; cuando una partida esta completa ó cuando el producto llega a estar disponible.";

@XendraField(AD_Column_ID="DeliveryRule",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsCustomer@='Y'",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="f535816c-f0a0-247c-b0fa-08646579c2b6")
public static final String FIELDNAME_Customer_DeliveryRule2="f535816c-f0a0-247c-b0fa-08646579c2b6";

@XendraTrl(Identifier="eb1414d4-0d48-d262-583c-184fc7943090")
public static String es_PE_FIELD_Vendor_DeliveryRule2_Name="Regla de Entrega";

@XendraTrl(Identifier="eb1414d4-0d48-d262-583c-184fc7943090")
public static String es_PE_FIELD_Vendor_DeliveryRule2_Description="Define los tiempos de entrega";

@XendraTrl(Identifier="eb1414d4-0d48-d262-583c-184fc7943090")
public static String es_PE_FIELD_Vendor_DeliveryRule2_Help="La Regla de Entrega indica cuando una orden debe ser entregada. Por Ej. Si la orden debiera entregarse cuando  esta completa; cuando una partida esta completa ó cuando el producto llega a estar disponible.";

@XendraField(AD_Column_ID="DeliveryRule",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="eb1414d4-0d48-d262-583c-184fc7943090")
public static final String FIELDNAME_Vendor_DeliveryRule2="eb1414d4-0d48-d262-583c-184fc7943090";

@XendraTrl(Identifier="6a4b678d-c00b-f7fc-ade8-983c86c467cf")
public static String es_PE_FIELD_BusinessPartner_DeliveryRule2_Name="Regla de Entrega";

@XendraTrl(Identifier="6a4b678d-c00b-f7fc-ade8-983c86c467cf")
public static String es_PE_FIELD_BusinessPartner_DeliveryRule2_Description="Define los tiempos de entrega";

@XendraTrl(Identifier="6a4b678d-c00b-f7fc-ade8-983c86c467cf")
public static String es_PE_FIELD_BusinessPartner_DeliveryRule2_Help="La Regla de Entrega indica cuando una orden debe ser entregada. Por Ej. Si la orden debiera entregarse cuando  esta completa; cuando una partida esta completa ó cuando el producto llega a estar disponible.";

@XendraField(AD_Column_ID="DeliveryRule",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6a4b678d-c00b-f7fc-ade8-983c86c467cf")
public static final String FIELDNAME_BusinessPartner_DeliveryRule2="6a4b678d-c00b-f7fc-ade8-983c86c467cf";

@XendraTrl(Identifier="f91f00ff-3ee0-14d9-6a73-4cd9bff628f7")
public static String es_PE_COLUMN_DeliveryRule_Name="Regla de Entrega";

@XendraColumn(AD_Element_ID="bfc0b304-42d5-bfa2-4997-a3024ea284f9",ColumnName="DeliveryRule",
AD_Reference_ID=17,AD_Reference_Value_ID="dd6ca989-f822-5b38-ea47-5420e7ccb16b",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="f91f00ff-3ee0-14d9-6a73-4cd9bff628f7",Synchronized="2019-08-30 22:21:09.0")
/** Column name DeliveryRule */
public static final String COLUMNNAME_DeliveryRule = "DeliveryRule";
/** Set Delivery Via.
@param DeliveryViaRule How the order will be delivered */
public void setDeliveryViaRule (String DeliveryViaRule)
{
if (DeliveryViaRule != null && DeliveryViaRule.length() > 1)
{
log.warning("Length > 1 - truncated");
DeliveryViaRule = DeliveryViaRule.substring(0,0);
}
set_Value (COLUMNNAME_DeliveryViaRule, DeliveryViaRule);
}
/** Get Delivery Via.
@return How the order will be delivered */
public String getDeliveryViaRule() 
{
return (String)get_Value(COLUMNNAME_DeliveryViaRule);
}

@XendraTrl(Identifier="3cb3c181-2780-257b-aef0-18d237f420aa")
public static String es_PE_FIELD_Customer_DeliveryVia_Name="Vía de Entrega";

@XendraTrl(Identifier="3cb3c181-2780-257b-aef0-18d237f420aa")
public static String es_PE_FIELD_Customer_DeliveryVia_Description="Como será entregada la orden";

@XendraTrl(Identifier="3cb3c181-2780-257b-aef0-18d237f420aa")
public static String es_PE_FIELD_Customer_DeliveryVia_Help="La vía de entrega indica como el producto debería ser entregado. Por Ej. Si la orden será recogida ó embarcada.";

@XendraField(AD_Column_ID="DeliveryViaRule",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsCustomer@='Y'",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="3cb3c181-2780-257b-aef0-18d237f420aa")
public static final String FIELDNAME_Customer_DeliveryVia="3cb3c181-2780-257b-aef0-18d237f420aa";

@XendraTrl(Identifier="63b04c49-c270-897e-29e0-40471316bfe3")
public static String es_PE_FIELD_Employee_DeliveryVia_Name="Vía de Entrega";

@XendraTrl(Identifier="63b04c49-c270-897e-29e0-40471316bfe3")
public static String es_PE_FIELD_Employee_DeliveryVia_Description="Como será entregada la orden";

@XendraTrl(Identifier="63b04c49-c270-897e-29e0-40471316bfe3")
public static String es_PE_FIELD_Employee_DeliveryVia_Help="La vía de entrega indica como el producto debería ser entregado. Por Ej. Si la orden será recogida ó embarcada.";

@XendraField(AD_Column_ID="DeliveryViaRule",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="63b04c49-c270-897e-29e0-40471316bfe3")
public static final String FIELDNAME_Employee_DeliveryVia="63b04c49-c270-897e-29e0-40471316bfe3";

@XendraTrl(Identifier="042cb7b2-71af-6e3a-098c-def383201fe7")
public static String es_PE_FIELD_Customer_DeliveryVia2_Name="Vía de Entrega";

@XendraTrl(Identifier="042cb7b2-71af-6e3a-098c-def383201fe7")
public static String es_PE_FIELD_Customer_DeliveryVia2_Description="Como será entregada la orden";

@XendraTrl(Identifier="042cb7b2-71af-6e3a-098c-def383201fe7")
public static String es_PE_FIELD_Customer_DeliveryVia2_Help="La vía de entrega indica como el producto debería ser entregado. Por Ej. Si la orden será recogida ó embarcada.";

@XendraField(AD_Column_ID="DeliveryViaRule",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="042cb7b2-71af-6e3a-098c-def383201fe7")
public static final String FIELDNAME_Customer_DeliveryVia2="042cb7b2-71af-6e3a-098c-def383201fe7";

@XendraTrl(Identifier="5b7dcf6d-e1bc-8428-5b17-55244da3c444")
public static String es_PE_FIELD_Vendor_DeliveryVia_Name="Vía de Entrega";

@XendraTrl(Identifier="5b7dcf6d-e1bc-8428-5b17-55244da3c444")
public static String es_PE_FIELD_Vendor_DeliveryVia_Description="Como será entregada la orden";

@XendraTrl(Identifier="5b7dcf6d-e1bc-8428-5b17-55244da3c444")
public static String es_PE_FIELD_Vendor_DeliveryVia_Help="La vía de entrega indica como el producto debería ser entregado. Por Ej. Si la orden será recogida ó embarcada.";

@XendraField(AD_Column_ID="DeliveryViaRule",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5b7dcf6d-e1bc-8428-5b17-55244da3c444")
public static final String FIELDNAME_Vendor_DeliveryVia="5b7dcf6d-e1bc-8428-5b17-55244da3c444";

@XendraTrl(Identifier="2d8eae07-b2ff-dce4-d942-6f5a1c1eea4c")
public static String es_PE_FIELD_EmployeeVendor_DeliveryVia_Name="Vía de Entrega";

@XendraTrl(Identifier="2d8eae07-b2ff-dce4-d942-6f5a1c1eea4c")
public static String es_PE_FIELD_EmployeeVendor_DeliveryVia_Description="Como será entregada la orden";

@XendraTrl(Identifier="2d8eae07-b2ff-dce4-d942-6f5a1c1eea4c")
public static String es_PE_FIELD_EmployeeVendor_DeliveryVia_Help="La vía de entrega indica como el producto debería ser entregado. Por Ej. Si la orden será recogida ó embarcada.";

@XendraField(AD_Column_ID="DeliveryViaRule",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2d8eae07-b2ff-dce4-d942-6f5a1c1eea4c")
public static final String FIELDNAME_EmployeeVendor_DeliveryVia="2d8eae07-b2ff-dce4-d942-6f5a1c1eea4c";

@XendraTrl(Identifier="a50babf3-ea8a-cf32-36ea-a67960720c7d")
public static String es_PE_FIELD_BusinessPartnerDimension_DeliveryVia_Name="Vía de Entrega";

@XendraTrl(Identifier="a50babf3-ea8a-cf32-36ea-a67960720c7d")
public static String es_PE_FIELD_BusinessPartnerDimension_DeliveryVia_Description="Como será entregada la orden";

@XendraTrl(Identifier="a50babf3-ea8a-cf32-36ea-a67960720c7d")
public static String es_PE_FIELD_BusinessPartnerDimension_DeliveryVia_Help="La vía de entrega indica como el producto debería ser entregado. Por Ej. Si la orden será recogida ó embarcada.";

@XendraField(AD_Column_ID="DeliveryViaRule",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a50babf3-ea8a-cf32-36ea-a67960720c7d")
public static final String FIELDNAME_BusinessPartnerDimension_DeliveryVia="a50babf3-ea8a-cf32-36ea-a67960720c7d";

@XendraTrl(Identifier="8759e1e9-e9e3-926f-580a-49b09635e252")
public static String es_PE_FIELD_PartnerSelection_DeliveryVia_Name="Vía de Entrega";

@XendraTrl(Identifier="8759e1e9-e9e3-926f-580a-49b09635e252")
public static String es_PE_FIELD_PartnerSelection_DeliveryVia_Description="Como será entregada la orden";

@XendraTrl(Identifier="8759e1e9-e9e3-926f-580a-49b09635e252")
public static String es_PE_FIELD_PartnerSelection_DeliveryVia_Help="La vía de entrega indica como el producto debería ser entregado. Por Ej. Si la orden será recogida ó embarcada.";

@XendraField(AD_Column_ID="DeliveryViaRule",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8759e1e9-e9e3-926f-580a-49b09635e252")
public static final String FIELDNAME_PartnerSelection_DeliveryVia="8759e1e9-e9e3-926f-580a-49b09635e252";

@XendraTrl(Identifier="7de1fe03-2bde-e2ba-5372-39cfd0f9f2dd")
public static String es_PE_FIELD_AssignedPartners_DeliveryVia_Name="Vía de Entrega";

@XendraTrl(Identifier="7de1fe03-2bde-e2ba-5372-39cfd0f9f2dd")
public static String es_PE_FIELD_AssignedPartners_DeliveryVia_Description="Como será entregada la orden";

@XendraTrl(Identifier="7de1fe03-2bde-e2ba-5372-39cfd0f9f2dd")
public static String es_PE_FIELD_AssignedPartners_DeliveryVia_Help="La vía de entrega indica como el producto debería ser entregado. Por Ej. Si la orden será recogida ó embarcada.";

@XendraField(AD_Column_ID="DeliveryViaRule",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7de1fe03-2bde-e2ba-5372-39cfd0f9f2dd")
public static final String FIELDNAME_AssignedPartners_DeliveryVia="7de1fe03-2bde-e2ba-5372-39cfd0f9f2dd";

@XendraTrl(Identifier="24e5ecf6-d5fd-e07d-5194-5b0434b55a9e")
public static String es_PE_FIELD_BusinessPartner_DeliveryVia_Name="Vía de Entrega";

@XendraTrl(Identifier="24e5ecf6-d5fd-e07d-5194-5b0434b55a9e")
public static String es_PE_FIELD_BusinessPartner_DeliveryVia_Description="Como será entregada la orden";

@XendraTrl(Identifier="24e5ecf6-d5fd-e07d-5194-5b0434b55a9e")
public static String es_PE_FIELD_BusinessPartner_DeliveryVia_Help="La vía de entrega indica como el producto debería ser entregado. Por Ej. Si la orden será recogida ó embarcada.";

@XendraField(AD_Column_ID="DeliveryViaRule",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="24e5ecf6-d5fd-e07d-5194-5b0434b55a9e")
public static final String FIELDNAME_BusinessPartner_DeliveryVia="24e5ecf6-d5fd-e07d-5194-5b0434b55a9e";

@XendraTrl(Identifier="8f8555a7-6d57-7590-7bbf-29b3dcc53f46")
public static String es_PE_FIELD_Vendor_DeliveryVia2_Name="Vía de Entrega";

@XendraTrl(Identifier="8f8555a7-6d57-7590-7bbf-29b3dcc53f46")
public static String es_PE_FIELD_Vendor_DeliveryVia2_Description="Como será entregada la orden";

@XendraTrl(Identifier="8f8555a7-6d57-7590-7bbf-29b3dcc53f46")
public static String es_PE_FIELD_Vendor_DeliveryVia2_Help="La vía de entrega indica como el producto debería ser entregado. Por Ej. Si la orden será recogida ó embarcada.";

@XendraField(AD_Column_ID="DeliveryViaRule",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8f8555a7-6d57-7590-7bbf-29b3dcc53f46")
public static final String FIELDNAME_Vendor_DeliveryVia2="8f8555a7-6d57-7590-7bbf-29b3dcc53f46";

@XendraTrl(Identifier="abc7a098-967e-443a-9e0a-7ac84874ac4d")
public static String es_PE_FIELD_BusinessPartner_DeliveryVia2_Name="Vía de Entrega";

@XendraTrl(Identifier="abc7a098-967e-443a-9e0a-7ac84874ac4d")
public static String es_PE_FIELD_BusinessPartner_DeliveryVia2_Description="Como será entregada la orden";

@XendraTrl(Identifier="abc7a098-967e-443a-9e0a-7ac84874ac4d")
public static String es_PE_FIELD_BusinessPartner_DeliveryVia2_Help="La vía de entrega indica como el producto debería ser entregado. Por Ej. Si la orden será recogida ó embarcada.";

@XendraField(AD_Column_ID="DeliveryViaRule",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="abc7a098-967e-443a-9e0a-7ac84874ac4d")
public static final String FIELDNAME_BusinessPartner_DeliveryVia2="abc7a098-967e-443a-9e0a-7ac84874ac4d";

@XendraTrl(Identifier="8e45e2ea-6608-7b1b-75b9-c4973c95d950")
public static String es_PE_COLUMN_DeliveryViaRule_Name="Vía de Entrega";

@XendraColumn(AD_Element_ID="47ae2232-6c73-dfb6-aa97-18fb2cc876a7",ColumnName="DeliveryViaRule",
AD_Reference_ID=17,AD_Reference_Value_ID="e0d8ddbc-d567-6f32-8ce6-274924c5926f",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="8e45e2ea-6608-7b1b-75b9-c4973c95d950",Synchronized="2019-08-30 22:21:09.0")
/** Column name DeliveryViaRule */
public static final String COLUMNNAME_DeliveryViaRule = "DeliveryViaRule";
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

@XendraTrl(Identifier="ddd35de7-00a7-79f1-2903-3a37e749c82e")
public static String es_PE_FIELD_Employee_Description_Name="Observación";

@XendraTrl(Identifier="ddd35de7-00a7-79f1-2903-3a37e749c82e")
public static String es_PE_FIELD_Employee_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="ddd35de7-00a7-79f1-2903-3a37e749c82e")
public static String es_PE_FIELD_Employee_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ddd35de7-00a7-79f1-2903-3a37e749c82e")
public static final String FIELDNAME_Employee_Description="ddd35de7-00a7-79f1-2903-3a37e749c82e";

@XendraTrl(Identifier="9aa21dd8-6aa7-1d42-82e4-b72d68e32945")
public static String es_PE_FIELD_EmployeeVendor_Description_Name="Observación";

@XendraTrl(Identifier="9aa21dd8-6aa7-1d42-82e4-b72d68e32945")
public static String es_PE_FIELD_EmployeeVendor_Description_Description="Observación";

@XendraTrl(Identifier="9aa21dd8-6aa7-1d42-82e4-b72d68e32945")
public static String es_PE_FIELD_EmployeeVendor_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9aa21dd8-6aa7-1d42-82e4-b72d68e32945")
public static final String FIELDNAME_EmployeeVendor_Description="9aa21dd8-6aa7-1d42-82e4-b72d68e32945";

@XendraTrl(Identifier="994e8538-e3a5-534c-0b03-25cae10a8c7f")
public static String es_PE_FIELD_PartnerSelection_Description_Name="Observación";

@XendraTrl(Identifier="994e8538-e3a5-534c-0b03-25cae10a8c7f")
public static String es_PE_FIELD_PartnerSelection_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="994e8538-e3a5-534c-0b03-25cae10a8c7f")
public static String es_PE_FIELD_PartnerSelection_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="994e8538-e3a5-534c-0b03-25cae10a8c7f")
public static final String FIELDNAME_PartnerSelection_Description="994e8538-e3a5-534c-0b03-25cae10a8c7f";

@XendraTrl(Identifier="6cd629d5-0c2c-e4ba-18c6-d7636dc20cb6")
public static String es_PE_FIELD_BusinessPartnerDimension_Description_Name="Observación";

@XendraTrl(Identifier="6cd629d5-0c2c-e4ba-18c6-d7636dc20cb6")
public static String es_PE_FIELD_BusinessPartnerDimension_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="6cd629d5-0c2c-e4ba-18c6-d7636dc20cb6")
public static String es_PE_FIELD_BusinessPartnerDimension_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6cd629d5-0c2c-e4ba-18c6-d7636dc20cb6")
public static final String FIELDNAME_BusinessPartnerDimension_Description="6cd629d5-0c2c-e4ba-18c6-d7636dc20cb6";

@XendraTrl(Identifier="97abecc9-5c70-dcdd-b5c6-6c5d27667d51")
public static String es_PE_FIELD_Customer_Description_Name="Observación";

@XendraTrl(Identifier="97abecc9-5c70-dcdd-b5c6-6c5d27667d51")
public static String es_PE_FIELD_Customer_Description_Description="Observación";

@XendraTrl(Identifier="97abecc9-5c70-dcdd-b5c6-6c5d27667d51")
public static String es_PE_FIELD_Customer_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="97abecc9-5c70-dcdd-b5c6-6c5d27667d51")
public static final String FIELDNAME_Customer_Description="97abecc9-5c70-dcdd-b5c6-6c5d27667d51";

@XendraTrl(Identifier="a1d15315-1ac0-18f7-ddd1-4f8e49861756")
public static String es_PE_FIELD_Vendor_Description_Name="Observación";

@XendraTrl(Identifier="a1d15315-1ac0-18f7-ddd1-4f8e49861756")
public static String es_PE_FIELD_Vendor_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="a1d15315-1ac0-18f7-ddd1-4f8e49861756")
public static String es_PE_FIELD_Vendor_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a1d15315-1ac0-18f7-ddd1-4f8e49861756")
public static final String FIELDNAME_Vendor_Description="a1d15315-1ac0-18f7-ddd1-4f8e49861756";

@XendraTrl(Identifier="60901aa6-d170-dd3b-7e96-2dc0ba36edfd")
public static String es_PE_FIELD_BusinessPartner_Description_Name="Observación";

@XendraTrl(Identifier="60901aa6-d170-dd3b-7e96-2dc0ba36edfd")
public static String es_PE_FIELD_BusinessPartner_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="60901aa6-d170-dd3b-7e96-2dc0ba36edfd")
public static String es_PE_FIELD_BusinessPartner_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="60901aa6-d170-dd3b-7e96-2dc0ba36edfd")
public static final String FIELDNAME_BusinessPartner_Description="60901aa6-d170-dd3b-7e96-2dc0ba36edfd";

@XendraTrl(Identifier="48962ce8-00e0-93c0-ce12-4940a902b348")
public static String es_PE_FIELD_AssignedPartners_Description_Name="Observación";

@XendraTrl(Identifier="48962ce8-00e0-93c0-ce12-4940a902b348")
public static String es_PE_FIELD_AssignedPartners_Description_Description="Observación";

@XendraTrl(Identifier="48962ce8-00e0-93c0-ce12-4940a902b348")
public static String es_PE_FIELD_AssignedPartners_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="48962ce8-00e0-93c0-ce12-4940a902b348")
public static final String FIELDNAME_AssignedPartners_Description="48962ce8-00e0-93c0-ce12-4940a902b348";

@XendraTrl(Identifier="577bbc58-2f87-b10d-71b1-ecc34965b307")
public static String es_PE_FIELD_Customer_Description2_Name="Observación";

@XendraTrl(Identifier="577bbc58-2f87-b10d-71b1-ecc34965b307")
public static String es_PE_FIELD_Customer_Description2_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="577bbc58-2f87-b10d-71b1-ecc34965b307")
public static String es_PE_FIELD_Customer_Description2_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="577bbc58-2f87-b10d-71b1-ecc34965b307")
public static final String FIELDNAME_Customer_Description2="577bbc58-2f87-b10d-71b1-ecc34965b307";

@XendraTrl(Identifier="6f2f58a7-5393-b1bc-e1c0-a8a69449d1e6")
public static String es_PE_FIELD_Vendor_Description2_Name="Observación";

@XendraTrl(Identifier="6f2f58a7-5393-b1bc-e1c0-a8a69449d1e6")
public static String es_PE_FIELD_Vendor_Description2_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="6f2f58a7-5393-b1bc-e1c0-a8a69449d1e6")
public static String es_PE_FIELD_Vendor_Description2_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6f2f58a7-5393-b1bc-e1c0-a8a69449d1e6")
public static final String FIELDNAME_Vendor_Description2="6f2f58a7-5393-b1bc-e1c0-a8a69449d1e6";

@XendraTrl(Identifier="fe71c930-8af7-658b-f757-47238a2cac1c")
public static String es_PE_FIELD_BusinessPartner_Description2_Name="Observación";

@XendraTrl(Identifier="fe71c930-8af7-658b-f757-47238a2cac1c")
public static String es_PE_FIELD_BusinessPartner_Description2_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="fe71c930-8af7-658b-f757-47238a2cac1c")
public static String es_PE_FIELD_BusinessPartner_Description2_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fe71c930-8af7-658b-f757-47238a2cac1c")
public static final String FIELDNAME_BusinessPartner_Description2="fe71c930-8af7-658b-f757-47238a2cac1c";

@XendraTrl(Identifier="a7d19a15-b4cc-f4d5-5954-eed378837e44")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a7d19a15-b4cc-f4d5-5954-eed378837e44",
Synchronized="2019-08-30 22:21:09.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Document Copies.
@param DocumentCopies Number of copies to be printed */
public void setDocumentCopies (int DocumentCopies)
{
set_Value (COLUMNNAME_DocumentCopies, Integer.valueOf(DocumentCopies));
}
/** Get Document Copies.
@return Number of copies to be printed */
public int getDocumentCopies() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_DocumentCopies);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="cab7d69c-7e04-0f2b-3a61-ccd0c9137a26")
public static String es_PE_FIELD_Customer_DocumentCopies_Name="Copias del Documento";

@XendraTrl(Identifier="cab7d69c-7e04-0f2b-3a61-ccd0c9137a26")
public static String es_PE_FIELD_Customer_DocumentCopies_Description="Número de copias a ser impresas";

@XendraTrl(Identifier="cab7d69c-7e04-0f2b-3a61-ccd0c9137a26")
public static String es_PE_FIELD_Customer_DocumentCopies_Help="Copias de documento indica el número de copias de cada documento que será generado";

@XendraField(AD_Column_ID="DocumentCopies",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsCustomer@='Y'",DisplayLength=11,IsReadOnly=false,SeqNo=70,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="cab7d69c-7e04-0f2b-3a61-ccd0c9137a26")
public static final String FIELDNAME_Customer_DocumentCopies="cab7d69c-7e04-0f2b-3a61-ccd0c9137a26";

@XendraTrl(Identifier="75c71ab5-7afe-d211-1a8e-4fa46233495a")
public static String es_PE_FIELD_Employee_DocumentCopies_Name="Copias del Documento";

@XendraTrl(Identifier="75c71ab5-7afe-d211-1a8e-4fa46233495a")
public static String es_PE_FIELD_Employee_DocumentCopies_Description="Número de copias a ser impresas";

@XendraTrl(Identifier="75c71ab5-7afe-d211-1a8e-4fa46233495a")
public static String es_PE_FIELD_Employee_DocumentCopies_Help="Copias de documento indica el número de copias de cada documento que será generado";

@XendraField(AD_Column_ID="DocumentCopies",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="75c71ab5-7afe-d211-1a8e-4fa46233495a")
public static final String FIELDNAME_Employee_DocumentCopies="75c71ab5-7afe-d211-1a8e-4fa46233495a";

@XendraTrl(Identifier="68103c9c-2ea2-cc16-720c-d1195f8854d2")
public static String es_PE_FIELD_PartnerSelection_DocumentCopies_Name="Copias del Documento";

@XendraTrl(Identifier="68103c9c-2ea2-cc16-720c-d1195f8854d2")
public static String es_PE_FIELD_PartnerSelection_DocumentCopies_Description="Número de copias a ser impresas";

@XendraTrl(Identifier="68103c9c-2ea2-cc16-720c-d1195f8854d2")
public static String es_PE_FIELD_PartnerSelection_DocumentCopies_Help="Copias de documento indica el número de copias de cada documento que será generado";

@XendraField(AD_Column_ID="DocumentCopies",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="68103c9c-2ea2-cc16-720c-d1195f8854d2")
public static final String FIELDNAME_PartnerSelection_DocumentCopies="68103c9c-2ea2-cc16-720c-d1195f8854d2";

@XendraTrl(Identifier="d9bb230e-2cf7-636d-18a3-4e37c6098e8f")
public static String es_PE_FIELD_BusinessPartnerDimension_DocumentCopies_Name="Copias del Documento";

@XendraTrl(Identifier="d9bb230e-2cf7-636d-18a3-4e37c6098e8f")
public static String es_PE_FIELD_BusinessPartnerDimension_DocumentCopies_Description="Número de copias a ser impresas";

@XendraTrl(Identifier="d9bb230e-2cf7-636d-18a3-4e37c6098e8f")
public static String es_PE_FIELD_BusinessPartnerDimension_DocumentCopies_Help="Copias de documento indica el número de copias de cada documento que será generado";

@XendraField(AD_Column_ID="DocumentCopies",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d9bb230e-2cf7-636d-18a3-4e37c6098e8f")
public static final String FIELDNAME_BusinessPartnerDimension_DocumentCopies="d9bb230e-2cf7-636d-18a3-4e37c6098e8f";

@XendraTrl(Identifier="c4ca5237-112d-bb74-f8b9-f11b7bf3c5d3")
public static String es_PE_FIELD_EmployeeVendor_DocumentCopies_Name="Copias del Documento";

@XendraTrl(Identifier="c4ca5237-112d-bb74-f8b9-f11b7bf3c5d3")
public static String es_PE_FIELD_EmployeeVendor_DocumentCopies_Description="Número de copias a ser impresas";

@XendraTrl(Identifier="c4ca5237-112d-bb74-f8b9-f11b7bf3c5d3")
public static String es_PE_FIELD_EmployeeVendor_DocumentCopies_Help="Copias de documento indica el número de copias de cada documento que será generado";

@XendraField(AD_Column_ID="DocumentCopies",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c4ca5237-112d-bb74-f8b9-f11b7bf3c5d3")
public static final String FIELDNAME_EmployeeVendor_DocumentCopies="c4ca5237-112d-bb74-f8b9-f11b7bf3c5d3";

@XendraTrl(Identifier="2f69575c-8d9d-1177-9d39-a5044f8d2486")
public static String es_PE_FIELD_AssignedPartners_DocumentCopies_Name="Copias del Documento";

@XendraTrl(Identifier="2f69575c-8d9d-1177-9d39-a5044f8d2486")
public static String es_PE_FIELD_AssignedPartners_DocumentCopies_Description="Número de copias a ser impresas";

@XendraTrl(Identifier="2f69575c-8d9d-1177-9d39-a5044f8d2486")
public static String es_PE_FIELD_AssignedPartners_DocumentCopies_Help="Copias de documento indica el número de copias de cada documento que será generado";

@XendraField(AD_Column_ID="DocumentCopies",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2f69575c-8d9d-1177-9d39-a5044f8d2486")
public static final String FIELDNAME_AssignedPartners_DocumentCopies="2f69575c-8d9d-1177-9d39-a5044f8d2486";

@XendraTrl(Identifier="54d0ec03-5c2a-5e25-195d-986f7618aae8")
public static String es_PE_FIELD_Customer_DocumentCopies2_Name="Copias del Documento";

@XendraTrl(Identifier="54d0ec03-5c2a-5e25-195d-986f7618aae8")
public static String es_PE_FIELD_Customer_DocumentCopies2_Description="Número de copias a ser impresas";

@XendraTrl(Identifier="54d0ec03-5c2a-5e25-195d-986f7618aae8")
public static String es_PE_FIELD_Customer_DocumentCopies2_Help="Copias de documento indica el número de copias de cada documento que será generado";

@XendraField(AD_Column_ID="DocumentCopies",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="54d0ec03-5c2a-5e25-195d-986f7618aae8")
public static final String FIELDNAME_Customer_DocumentCopies2="54d0ec03-5c2a-5e25-195d-986f7618aae8";

@XendraTrl(Identifier="47816bfe-7b1b-676a-fa50-8ced225924f6")
public static String es_PE_FIELD_Vendor_DocumentCopies_Name="Copias del Documento";

@XendraTrl(Identifier="47816bfe-7b1b-676a-fa50-8ced225924f6")
public static String es_PE_FIELD_Vendor_DocumentCopies_Description="Número de copias a ser impresas";

@XendraTrl(Identifier="47816bfe-7b1b-676a-fa50-8ced225924f6")
public static String es_PE_FIELD_Vendor_DocumentCopies_Help="Copias de documento indica el número de copias de cada documento que será generado";

@XendraField(AD_Column_ID="DocumentCopies",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="47816bfe-7b1b-676a-fa50-8ced225924f6")
public static final String FIELDNAME_Vendor_DocumentCopies="47816bfe-7b1b-676a-fa50-8ced225924f6";

@XendraTrl(Identifier="421976f0-0b1c-7436-e73f-5632dc6340ca")
public static String es_PE_FIELD_BusinessPartner_DocumentCopies_Name="Copias del Documento";

@XendraTrl(Identifier="421976f0-0b1c-7436-e73f-5632dc6340ca")
public static String es_PE_FIELD_BusinessPartner_DocumentCopies_Description="Número de copias a ser impresas";

@XendraTrl(Identifier="421976f0-0b1c-7436-e73f-5632dc6340ca")
public static String es_PE_FIELD_BusinessPartner_DocumentCopies_Help="Copias de documento indica el número de copias de cada documento que será generado";

@XendraField(AD_Column_ID="DocumentCopies",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="421976f0-0b1c-7436-e73f-5632dc6340ca")
public static final String FIELDNAME_BusinessPartner_DocumentCopies="421976f0-0b1c-7436-e73f-5632dc6340ca";

@XendraTrl(Identifier="5920210c-5539-28b0-494a-9a28515433e9")
public static String es_PE_FIELD_Vendor_DocumentCopies2_Name="Copias del Documento";

@XendraTrl(Identifier="5920210c-5539-28b0-494a-9a28515433e9")
public static String es_PE_FIELD_Vendor_DocumentCopies2_Description="Número de copias a ser impresas";

@XendraTrl(Identifier="5920210c-5539-28b0-494a-9a28515433e9")
public static String es_PE_FIELD_Vendor_DocumentCopies2_Help="Copias de documento indica el número de copias de cada documento que será generado";

@XendraField(AD_Column_ID="DocumentCopies",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5920210c-5539-28b0-494a-9a28515433e9")
public static final String FIELDNAME_Vendor_DocumentCopies2="5920210c-5539-28b0-494a-9a28515433e9";

@XendraTrl(Identifier="95d8cb95-f78d-453e-b59d-f013456c394b")
public static String es_PE_FIELD_BusinessPartner_DocumentCopies2_Name="Copias del Documento";

@XendraTrl(Identifier="95d8cb95-f78d-453e-b59d-f013456c394b")
public static String es_PE_FIELD_BusinessPartner_DocumentCopies2_Description="Número de copias a ser impresas";

@XendraTrl(Identifier="95d8cb95-f78d-453e-b59d-f013456c394b")
public static String es_PE_FIELD_BusinessPartner_DocumentCopies2_Help="Copias de documento indica el número de copias de cada documento que será generado";

@XendraField(AD_Column_ID="DocumentCopies",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="95d8cb95-f78d-453e-b59d-f013456c394b")
public static final String FIELDNAME_BusinessPartner_DocumentCopies2="95d8cb95-f78d-453e-b59d-f013456c394b";

@XendraTrl(Identifier="06cf10e2-4f57-2702-38d7-3a69b55403d1")
public static String es_PE_COLUMN_DocumentCopies_Name="Copias del Documento";

@XendraColumn(AD_Element_ID="df034791-81d2-e06f-9337-e45426c348fa",ColumnName="DocumentCopies",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="06cf10e2-4f57-2702-38d7-3a69b55403d1",
Synchronized="2019-08-30 22:21:09.0")
/** Column name DocumentCopies */
public static final String COLUMNNAME_DocumentCopies = "DocumentCopies";
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
@XendraTrl(Identifier="b3393de7-f13f-963f-5982-ee05c1b39c86")
public static String es_PE_FIELD_BusinessPartnerDimension_D_U_N_S_Name="DUNS";

@XendraTrl(Identifier="b3393de7-f13f-963f-5982-ee05c1b39c86")
public static String es_PE_FIELD_BusinessPartnerDimension_D_U_N_S_Description="DUNS";

@XendraTrl(Identifier="b3393de7-f13f-963f-5982-ee05c1b39c86")
public static String es_PE_FIELD_BusinessPartnerDimension_D_U_N_S_Help="Usado por EDI - para detalles ver www.dnb.com/dunsno/list.htm";

@XendraField(AD_Column_ID="DUNS",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b3393de7-f13f-963f-5982-ee05c1b39c86")
public static final String FIELDNAME_BusinessPartnerDimension_D_U_N_S="b3393de7-f13f-963f-5982-ee05c1b39c86";

@XendraTrl(Identifier="97a62710-0467-6370-9f6d-0ef4cb226edd")
public static String es_PE_FIELD_PartnerSelection_D_U_N_S_Name="DUNS";

@XendraTrl(Identifier="97a62710-0467-6370-9f6d-0ef4cb226edd")
public static String es_PE_FIELD_PartnerSelection_D_U_N_S_Description="DUNS";

@XendraTrl(Identifier="97a62710-0467-6370-9f6d-0ef4cb226edd")
public static String es_PE_FIELD_PartnerSelection_D_U_N_S_Help="Usado por EDI - para detalles ver www.dnb.com/dunsno/list.htm";

@XendraField(AD_Column_ID="DUNS",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="97a62710-0467-6370-9f6d-0ef4cb226edd")
public static final String FIELDNAME_PartnerSelection_D_U_N_S="97a62710-0467-6370-9f6d-0ef4cb226edd";

@XendraTrl(Identifier="9fdc7d6b-27cb-d27e-5776-2d4610a26c8a")
public static String es_PE_FIELD_Vendor_D_U_N_S_Name="DUNS";

@XendraTrl(Identifier="9fdc7d6b-27cb-d27e-5776-2d4610a26c8a")
public static String es_PE_FIELD_Vendor_D_U_N_S_Description="DUNS";

@XendraTrl(Identifier="9fdc7d6b-27cb-d27e-5776-2d4610a26c8a")
public static String es_PE_FIELD_Vendor_D_U_N_S_Help="Usado por EDI - para detalles ver www.dnb.com/dunsno/list.htm";

@XendraField(AD_Column_ID="DUNS",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9fdc7d6b-27cb-d27e-5776-2d4610a26c8a")
public static final String FIELDNAME_Vendor_D_U_N_S="9fdc7d6b-27cb-d27e-5776-2d4610a26c8a";

@XendraTrl(Identifier="059790f2-879b-c3e4-bcaf-e0e6739361f1")
public static String es_PE_FIELD_Vendor_D_U_N_S2_Name="DUNS";

@XendraTrl(Identifier="059790f2-879b-c3e4-bcaf-e0e6739361f1")
public static String es_PE_FIELD_Vendor_D_U_N_S2_Description="DUNS";

@XendraTrl(Identifier="059790f2-879b-c3e4-bcaf-e0e6739361f1")
public static String es_PE_FIELD_Vendor_D_U_N_S2_Help="Usado por EDI - para detalles ver www.dnb.com/dunsno/list.htm";

@XendraField(AD_Column_ID="DUNS",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="059790f2-879b-c3e4-bcaf-e0e6739361f1")
public static final String FIELDNAME_Vendor_D_U_N_S2="059790f2-879b-c3e4-bcaf-e0e6739361f1";

@XendraTrl(Identifier="f1edcd03-a5cb-ee57-daaf-8ca22a33eaa4")
public static String es_PE_FIELD_Customer_D_U_N_S_Name="DUNS";

@XendraTrl(Identifier="f1edcd03-a5cb-ee57-daaf-8ca22a33eaa4")
public static String es_PE_FIELD_Customer_D_U_N_S_Description="DUNS";

@XendraTrl(Identifier="f1edcd03-a5cb-ee57-daaf-8ca22a33eaa4")
public static String es_PE_FIELD_Customer_D_U_N_S_Help="Usado por EDI - para detalles ver www.dnb.com/dunsno/list.htm";

@XendraField(AD_Column_ID="DUNS",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f1edcd03-a5cb-ee57-daaf-8ca22a33eaa4")
public static final String FIELDNAME_Customer_D_U_N_S="f1edcd03-a5cb-ee57-daaf-8ca22a33eaa4";

@XendraTrl(Identifier="868ff761-9791-471a-ad3b-081a5cf27a61")
public static String es_PE_FIELD_EmployeeVendor_D_U_N_S_Name="DUNS";

@XendraTrl(Identifier="868ff761-9791-471a-ad3b-081a5cf27a61")
public static String es_PE_FIELD_EmployeeVendor_D_U_N_S_Description="DUNS";

@XendraTrl(Identifier="868ff761-9791-471a-ad3b-081a5cf27a61")
public static String es_PE_FIELD_EmployeeVendor_D_U_N_S_Help="Usado por EDI - para detalles ver www.dnb.com/dunsno/list.htm";

@XendraField(AD_Column_ID="DUNS",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="868ff761-9791-471a-ad3b-081a5cf27a61")
public static final String FIELDNAME_EmployeeVendor_D_U_N_S="868ff761-9791-471a-ad3b-081a5cf27a61";

@XendraTrl(Identifier="2f628b0c-f3d7-0020-fbd4-03f837de47d2")
public static String es_PE_FIELD_Employee_D_U_N_S_Name="DUNS";

@XendraTrl(Identifier="2f628b0c-f3d7-0020-fbd4-03f837de47d2")
public static String es_PE_FIELD_Employee_D_U_N_S_Description="DUNS";

@XendraTrl(Identifier="2f628b0c-f3d7-0020-fbd4-03f837de47d2")
public static String es_PE_FIELD_Employee_D_U_N_S_Help="Usado por EDI - para detalles ver www.dnb.com/dunsno/list.htm";

@XendraField(AD_Column_ID="DUNS",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2f628b0c-f3d7-0020-fbd4-03f837de47d2")
public static final String FIELDNAME_Employee_D_U_N_S="2f628b0c-f3d7-0020-fbd4-03f837de47d2";

@XendraTrl(Identifier="2b709083-74a0-2752-a37c-7edbc5535158")
public static String es_PE_FIELD_BusinessPartner_D_U_N_S_Name="DUNS";

@XendraTrl(Identifier="2b709083-74a0-2752-a37c-7edbc5535158")
public static String es_PE_FIELD_BusinessPartner_D_U_N_S_Description="DUNS";

@XendraTrl(Identifier="2b709083-74a0-2752-a37c-7edbc5535158")
public static String es_PE_FIELD_BusinessPartner_D_U_N_S_Help="Usado por EDI - para detalles ver www.dnb.com/dunsno/list.htm";

@XendraField(AD_Column_ID="DUNS",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2b709083-74a0-2752-a37c-7edbc5535158")
public static final String FIELDNAME_BusinessPartner_D_U_N_S="2b709083-74a0-2752-a37c-7edbc5535158";

@XendraTrl(Identifier="eac40e43-eb15-99a5-9bdd-4fa5af1d8cd7")
public static String es_PE_FIELD_AssignedPartners_D_U_N_S_Name="DUNS";

@XendraTrl(Identifier="eac40e43-eb15-99a5-9bdd-4fa5af1d8cd7")
public static String es_PE_FIELD_AssignedPartners_D_U_N_S_Description="DUNS";

@XendraTrl(Identifier="eac40e43-eb15-99a5-9bdd-4fa5af1d8cd7")
public static String es_PE_FIELD_AssignedPartners_D_U_N_S_Help="Usado por EDI - para detalles ver www.dnb.com/dunsno/list.htm";

@XendraField(AD_Column_ID="DUNS",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="eac40e43-eb15-99a5-9bdd-4fa5af1d8cd7")
public static final String FIELDNAME_AssignedPartners_D_U_N_S="eac40e43-eb15-99a5-9bdd-4fa5af1d8cd7";

@XendraTrl(Identifier="1ad798f7-05f5-2675-5d90-074bf7d80858")
public static String es_PE_FIELD_Customer_D_U_N_S2_Name="DUNS";

@XendraTrl(Identifier="1ad798f7-05f5-2675-5d90-074bf7d80858")
public static String es_PE_FIELD_Customer_D_U_N_S2_Description="DUNS";

@XendraTrl(Identifier="1ad798f7-05f5-2675-5d90-074bf7d80858")
public static String es_PE_FIELD_Customer_D_U_N_S2_Help="Usado por EDI - para detalles ver www.dnb.com/dunsno/list.htm";

@XendraField(AD_Column_ID="DUNS",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1ad798f7-05f5-2675-5d90-074bf7d80858")
public static final String FIELDNAME_Customer_D_U_N_S2="1ad798f7-05f5-2675-5d90-074bf7d80858";

@XendraTrl(Identifier="9d559dd8-7279-18be-7d75-bc5f11afbe99")
public static String es_PE_FIELD_BusinessPartner_D_U_N_S2_Name="DUNS";

@XendraTrl(Identifier="9d559dd8-7279-18be-7d75-bc5f11afbe99")
public static String es_PE_FIELD_BusinessPartner_D_U_N_S2_Description="DUNS";

@XendraTrl(Identifier="9d559dd8-7279-18be-7d75-bc5f11afbe99")
public static String es_PE_FIELD_BusinessPartner_D_U_N_S2_Help="Usado por EDI - para detalles ver www.dnb.com/dunsno/list.htm";

@XendraField(AD_Column_ID="DUNS",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9d559dd8-7279-18be-7d75-bc5f11afbe99")
public static final String FIELDNAME_BusinessPartner_D_U_N_S2="9d559dd8-7279-18be-7d75-bc5f11afbe99";

@XendraTrl(Identifier="7c18d2a4-24d5-758c-bf01-1c237d062412")
public static String es_PE_COLUMN_DUNS_Name="DUNS";

@XendraColumn(AD_Element_ID="c0901ff5-fdb0-6e42-8eb2-bcb69b132f2b",ColumnName="DUNS",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=11,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7c18d2a4-24d5-758c-bf01-1c237d062412",
Synchronized="2019-08-30 22:21:09.0")
/** Column name DUNS */
public static final String COLUMNNAME_DUNS = "DUNS";
/** Set First Sale.
@param FirstSale Date of First Sale */
public void setFirstSale (Timestamp FirstSale)
{
set_Value (COLUMNNAME_FirstSale, FirstSale);
}
/** Get First Sale.
@return Date of First Sale */
public Timestamp getFirstSale() 
{
return (Timestamp)get_Value(COLUMNNAME_FirstSale);
}

@XendraTrl(Identifier="fda6c9db-7e64-af90-f24e-b55be74e2876")
public static String es_PE_FIELD_BusinessPartnerDimension_FirstSale_Name="Primera Venta";

@XendraTrl(Identifier="fda6c9db-7e64-af90-f24e-b55be74e2876")
public static String es_PE_FIELD_BusinessPartnerDimension_FirstSale_Description="Fecha de la primera venta";

@XendraTrl(Identifier="fda6c9db-7e64-af90-f24e-b55be74e2876")
public static String es_PE_FIELD_BusinessPartnerDimension_FirstSale_Help="La fecha de la Primera Venta indica la fecha de la primera venta a este socio de negocio";

@XendraField(AD_Column_ID="FirstSale",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fda6c9db-7e64-af90-f24e-b55be74e2876")
public static final String FIELDNAME_BusinessPartnerDimension_FirstSale="fda6c9db-7e64-af90-f24e-b55be74e2876";

@XendraTrl(Identifier="1a03978d-b099-61b4-0393-483e4290d8b7")
public static String es_PE_FIELD_EmployeeVendor_FirstSale_Name="Primera Venta";

@XendraTrl(Identifier="1a03978d-b099-61b4-0393-483e4290d8b7")
public static String es_PE_FIELD_EmployeeVendor_FirstSale_Description="Fecha de la primera venta";

@XendraTrl(Identifier="1a03978d-b099-61b4-0393-483e4290d8b7")
public static String es_PE_FIELD_EmployeeVendor_FirstSale_Help="La fecha de la Primera Venta indica la fecha de la primera venta a este socio de negocio";

@XendraField(AD_Column_ID="FirstSale",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1a03978d-b099-61b4-0393-483e4290d8b7")
public static final String FIELDNAME_EmployeeVendor_FirstSale="1a03978d-b099-61b4-0393-483e4290d8b7";

@XendraTrl(Identifier="ddf025ca-f4df-4e80-5c7e-5354e03fe4bc")
public static String es_PE_FIELD_Customer_FirstSale_Name="Primera Venta";

@XendraTrl(Identifier="ddf025ca-f4df-4e80-5c7e-5354e03fe4bc")
public static String es_PE_FIELD_Customer_FirstSale_Description="Fecha de la primera venta";

@XendraTrl(Identifier="ddf025ca-f4df-4e80-5c7e-5354e03fe4bc")
public static String es_PE_FIELD_Customer_FirstSale_Help="La fecha de la Primera Venta indica la fecha de la primera venta a este socio de negocio";

@XendraField(AD_Column_ID="FirstSale",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ddf025ca-f4df-4e80-5c7e-5354e03fe4bc")
public static final String FIELDNAME_Customer_FirstSale="ddf025ca-f4df-4e80-5c7e-5354e03fe4bc";

@XendraTrl(Identifier="1ed198e2-7cdb-6994-157f-a692cf94e7fd")
public static String es_PE_FIELD_Employee_FirstSale_Name="Primera Venta";

@XendraTrl(Identifier="1ed198e2-7cdb-6994-157f-a692cf94e7fd")
public static String es_PE_FIELD_Employee_FirstSale_Description="Fecha de la primera venta";

@XendraTrl(Identifier="1ed198e2-7cdb-6994-157f-a692cf94e7fd")
public static String es_PE_FIELD_Employee_FirstSale_Help="La fecha de la Primera Venta indica la fecha de la primera venta a este socio de negocio";

@XendraField(AD_Column_ID="FirstSale",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1ed198e2-7cdb-6994-157f-a692cf94e7fd")
public static final String FIELDNAME_Employee_FirstSale="1ed198e2-7cdb-6994-157f-a692cf94e7fd";

@XendraTrl(Identifier="9435c586-afa5-36d2-df43-b0027f5e7cd1")
public static String es_PE_FIELD_PartnerSelection_FirstSale_Name="Primera Venta";

@XendraTrl(Identifier="9435c586-afa5-36d2-df43-b0027f5e7cd1")
public static String es_PE_FIELD_PartnerSelection_FirstSale_Description="Fecha de la primera venta";

@XendraTrl(Identifier="9435c586-afa5-36d2-df43-b0027f5e7cd1")
public static String es_PE_FIELD_PartnerSelection_FirstSale_Help="La fecha de la Primera Venta indica la fecha de la primera venta a este socio de negocio";

@XendraField(AD_Column_ID="FirstSale",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9435c586-afa5-36d2-df43-b0027f5e7cd1")
public static final String FIELDNAME_PartnerSelection_FirstSale="9435c586-afa5-36d2-df43-b0027f5e7cd1";

@XendraTrl(Identifier="1d7f75de-65c2-d17d-4abc-6abd4932a3f9")
public static String es_PE_FIELD_Customer_FirstSale2_Name="Primera Venta";

@XendraTrl(Identifier="1d7f75de-65c2-d17d-4abc-6abd4932a3f9")
public static String es_PE_FIELD_Customer_FirstSale2_Description="Fecha de la primera venta";

@XendraTrl(Identifier="1d7f75de-65c2-d17d-4abc-6abd4932a3f9")
public static String es_PE_FIELD_Customer_FirstSale2_Help="La fecha de la Primera Venta indica la fecha de la primera venta a este socio de negocio";

@XendraField(AD_Column_ID="FirstSale",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1d7f75de-65c2-d17d-4abc-6abd4932a3f9")
public static final String FIELDNAME_Customer_FirstSale2="1d7f75de-65c2-d17d-4abc-6abd4932a3f9";

@XendraTrl(Identifier="25813751-0b88-86ba-e5b4-d18c87126c64")
public static String es_PE_FIELD_Vendor_FirstSale_Name="Primera Venta";

@XendraTrl(Identifier="25813751-0b88-86ba-e5b4-d18c87126c64")
public static String es_PE_FIELD_Vendor_FirstSale_Description="Fecha de la primera venta";

@XendraTrl(Identifier="25813751-0b88-86ba-e5b4-d18c87126c64")
public static String es_PE_FIELD_Vendor_FirstSale_Help="La fecha de la Primera Venta indica la fecha de la primera venta a este socio de negocio";

@XendraField(AD_Column_ID="FirstSale",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="25813751-0b88-86ba-e5b4-d18c87126c64")
public static final String FIELDNAME_Vendor_FirstSale="25813751-0b88-86ba-e5b4-d18c87126c64";

@XendraTrl(Identifier="6f8c3299-ea40-4d12-2609-40ca2c872240")
public static String es_PE_FIELD_Vendor_FirstSale2_Name="Primera Venta";

@XendraTrl(Identifier="6f8c3299-ea40-4d12-2609-40ca2c872240")
public static String es_PE_FIELD_Vendor_FirstSale2_Description="Fecha de la primera venta";

@XendraTrl(Identifier="6f8c3299-ea40-4d12-2609-40ca2c872240")
public static String es_PE_FIELD_Vendor_FirstSale2_Help="La fecha de la Primera Venta indica la fecha de la primera venta a este socio de negocio";

@XendraField(AD_Column_ID="FirstSale",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6f8c3299-ea40-4d12-2609-40ca2c872240")
public static final String FIELDNAME_Vendor_FirstSale2="6f8c3299-ea40-4d12-2609-40ca2c872240";

@XendraTrl(Identifier="c5f2091c-af48-95c4-df14-8f2bd0618683")
public static String es_PE_FIELD_BusinessPartner_FirstSale_Name="Primera Venta";

@XendraTrl(Identifier="c5f2091c-af48-95c4-df14-8f2bd0618683")
public static String es_PE_FIELD_BusinessPartner_FirstSale_Description="Fecha de la primera venta";

@XendraTrl(Identifier="c5f2091c-af48-95c4-df14-8f2bd0618683")
public static String es_PE_FIELD_BusinessPartner_FirstSale_Help="La fecha de la Primera Venta indica la fecha de la primera venta a este socio de negocio";

@XendraField(AD_Column_ID="FirstSale",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c5f2091c-af48-95c4-df14-8f2bd0618683")
public static final String FIELDNAME_BusinessPartner_FirstSale="c5f2091c-af48-95c4-df14-8f2bd0618683";

@XendraTrl(Identifier="f6924ebb-e455-a77f-aad2-1b4c68e16459")
public static String es_PE_FIELD_AssignedPartners_FirstSale_Name="Primera Venta";

@XendraTrl(Identifier="f6924ebb-e455-a77f-aad2-1b4c68e16459")
public static String es_PE_FIELD_AssignedPartners_FirstSale_Description="Fecha de la primera venta";

@XendraTrl(Identifier="f6924ebb-e455-a77f-aad2-1b4c68e16459")
public static String es_PE_FIELD_AssignedPartners_FirstSale_Help="La fecha de la Primera Venta indica la fecha de la primera venta a este socio de negocio";

@XendraField(AD_Column_ID="FirstSale",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=280,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f6924ebb-e455-a77f-aad2-1b4c68e16459")
public static final String FIELDNAME_AssignedPartners_FirstSale="f6924ebb-e455-a77f-aad2-1b4c68e16459";

@XendraTrl(Identifier="4f5e1070-d3c5-2ab9-70f5-7e2485013f24")
public static String es_PE_FIELD_BusinessPartner_FirstSale2_Name="Primera Venta";

@XendraTrl(Identifier="4f5e1070-d3c5-2ab9-70f5-7e2485013f24")
public static String es_PE_FIELD_BusinessPartner_FirstSale2_Description="Fecha de la primera venta";

@XendraTrl(Identifier="4f5e1070-d3c5-2ab9-70f5-7e2485013f24")
public static String es_PE_FIELD_BusinessPartner_FirstSale2_Help="La fecha de la Primera Venta indica la fecha de la primera venta a este socio de negocio";

@XendraField(AD_Column_ID="FirstSale",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsEmployee@=N",DisplayLength=14,IsReadOnly=false,SeqNo=240,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="4f5e1070-d3c5-2ab9-70f5-7e2485013f24")
public static final String FIELDNAME_BusinessPartner_FirstSale2="4f5e1070-d3c5-2ab9-70f5-7e2485013f24";

@XendraTrl(Identifier="e64cae9e-b50c-7f4c-3f9c-64084b2267b6")
public static String es_PE_COLUMN_FirstSale_Name="Primera Venta";

@XendraColumn(AD_Element_ID="4daefd5c-5b97-ae77-9163-02be1b065092",ColumnName="FirstSale",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e64cae9e-b50c-7f4c-3f9c-64084b2267b6",
Synchronized="2019-08-30 22:21:09.0")
/** Column name FirstSale */
public static final String COLUMNNAME_FirstSale = "FirstSale";
/** Set Flat Discount %.
@param FlatDiscount Flat discount percentage  */
public void setFlatDiscount (BigDecimal FlatDiscount)
{
set_Value (COLUMNNAME_FlatDiscount, FlatDiscount);
}
/** Get Flat Discount %.
@return Flat discount percentage  */
public BigDecimal getFlatDiscount() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_FlatDiscount);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="2f668676-12bf-9b08-417e-2394ec25475c")
public static String es_PE_FIELD_Employee_FlatDiscount_Name="% Descuento";

@XendraTrl(Identifier="2f668676-12bf-9b08-417e-2394ec25475c")
public static String es_PE_FIELD_Employee_FlatDiscount_Description="Porcentaje de descuento simple";

@XendraField(AD_Column_ID="FlatDiscount",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2f668676-12bf-9b08-417e-2394ec25475c")
public static final String FIELDNAME_Employee_FlatDiscount="2f668676-12bf-9b08-417e-2394ec25475c";

@XendraTrl(Identifier="6deb8b74-aac1-c74e-325d-9609513a8767")
public static String es_PE_FIELD_Vendor_FlatDiscount_Name="% Descuento";

@XendraTrl(Identifier="6deb8b74-aac1-c74e-325d-9609513a8767")
public static String es_PE_FIELD_Vendor_FlatDiscount_Description="Porcentaje de descuento simple";

@XendraField(AD_Column_ID="FlatDiscount",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6deb8b74-aac1-c74e-325d-9609513a8767")
public static final String FIELDNAME_Vendor_FlatDiscount="6deb8b74-aac1-c74e-325d-9609513a8767";

@XendraTrl(Identifier="7850e81e-c8c1-6d92-fcb2-cbc6124a7c6c")
public static String es_PE_FIELD_Customer_FlatDiscount_Name="% Descuento";

@XendraTrl(Identifier="7850e81e-c8c1-6d92-fcb2-cbc6124a7c6c")
public static String es_PE_FIELD_Customer_FlatDiscount_Description="Porcentaje de descuento simple";

@XendraField(AD_Column_ID="FlatDiscount",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7850e81e-c8c1-6d92-fcb2-cbc6124a7c6c")
public static final String FIELDNAME_Customer_FlatDiscount="7850e81e-c8c1-6d92-fcb2-cbc6124a7c6c";

@XendraTrl(Identifier="e8c5d6db-3b66-32c5-6c79-a21408c3997f")
public static String es_PE_FIELD_EmployeeVendor_FlatDiscount_Name="% Descuento";

@XendraTrl(Identifier="e8c5d6db-3b66-32c5-6c79-a21408c3997f")
public static String es_PE_FIELD_EmployeeVendor_FlatDiscount_Description="Porcentaje de descuento simple";

@XendraField(AD_Column_ID="FlatDiscount",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e8c5d6db-3b66-32c5-6c79-a21408c3997f")
public static final String FIELDNAME_EmployeeVendor_FlatDiscount="e8c5d6db-3b66-32c5-6c79-a21408c3997f";

@XendraTrl(Identifier="b40fe575-8807-7084-c9e3-2941611616f7")
public static String es_PE_FIELD_BusinessPartnerDimension_FlatDiscount_Name="% Descuento";

@XendraTrl(Identifier="b40fe575-8807-7084-c9e3-2941611616f7")
public static String es_PE_FIELD_BusinessPartnerDimension_FlatDiscount_Description="Porcentaje de descuento simple";

@XendraField(AD_Column_ID="FlatDiscount",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b40fe575-8807-7084-c9e3-2941611616f7")
public static final String FIELDNAME_BusinessPartnerDimension_FlatDiscount="b40fe575-8807-7084-c9e3-2941611616f7";

@XendraTrl(Identifier="d988fe36-a732-9e49-2c04-4dddb5dbb754")
public static String es_PE_FIELD_BusinessPartner_FlatDiscount_Name="% Descuento";

@XendraTrl(Identifier="d988fe36-a732-9e49-2c04-4dddb5dbb754")
public static String es_PE_FIELD_BusinessPartner_FlatDiscount_Description="Porcentaje de descuento simple";

@XendraField(AD_Column_ID="FlatDiscount",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d988fe36-a732-9e49-2c04-4dddb5dbb754")
public static final String FIELDNAME_BusinessPartner_FlatDiscount="d988fe36-a732-9e49-2c04-4dddb5dbb754";

@XendraTrl(Identifier="728a1e4a-8ab3-391f-528a-ec4c954a9a81")
public static String es_PE_FIELD_PartnerSelection_FlatDiscount_Name="% Descuento";

@XendraTrl(Identifier="728a1e4a-8ab3-391f-528a-ec4c954a9a81")
public static String es_PE_FIELD_PartnerSelection_FlatDiscount_Description="Porcentaje de descuento simple";

@XendraField(AD_Column_ID="FlatDiscount",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="728a1e4a-8ab3-391f-528a-ec4c954a9a81")
public static final String FIELDNAME_PartnerSelection_FlatDiscount="728a1e4a-8ab3-391f-528a-ec4c954a9a81";

@XendraTrl(Identifier="d6a10729-6f54-c068-17f1-6c8b3be4f64c")
public static String es_PE_FIELD_Customer_FlatDiscount2_Name="% Descuento";

@XendraTrl(Identifier="d6a10729-6f54-c068-17f1-6c8b3be4f64c")
public static String es_PE_FIELD_Customer_FlatDiscount2_Description="Porcentaje de descuento simple";

@XendraField(AD_Column_ID="FlatDiscount",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsCustomer@='Y'",DisplayLength=26,IsReadOnly=false,SeqNo=120,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="d6a10729-6f54-c068-17f1-6c8b3be4f64c")
public static final String FIELDNAME_Customer_FlatDiscount2="d6a10729-6f54-c068-17f1-6c8b3be4f64c";

@XendraTrl(Identifier="7e79ea7e-54b4-712f-661c-a37efb361364")
public static String es_PE_FIELD_Vendor_FlatDiscount2_Name="% Descuento";

@XendraTrl(Identifier="7e79ea7e-54b4-712f-661c-a37efb361364")
public static String es_PE_FIELD_Vendor_FlatDiscount2_Description="Porcentaje de descuento simple";

@XendraField(AD_Column_ID="FlatDiscount",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7e79ea7e-54b4-712f-661c-a37efb361364")
public static final String FIELDNAME_Vendor_FlatDiscount2="7e79ea7e-54b4-712f-661c-a37efb361364";

@XendraTrl(Identifier="cd47af3a-5df8-c448-567b-e18924b8d963")
public static String es_PE_FIELD_AssignedPartners_FlatDiscount_Name="% Descuento";

@XendraTrl(Identifier="cd47af3a-5df8-c448-567b-e18924b8d963")
public static String es_PE_FIELD_AssignedPartners_FlatDiscount_Description="Porcentaje de descuento simple";

@XendraField(AD_Column_ID="FlatDiscount",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cd47af3a-5df8-c448-567b-e18924b8d963")
public static final String FIELDNAME_AssignedPartners_FlatDiscount="cd47af3a-5df8-c448-567b-e18924b8d963";

@XendraTrl(Identifier="f14f194c-a71e-5ec3-33e7-f858792ca507")
public static String es_PE_FIELD_BusinessPartner_FlatDiscount2_Name="% Descuento";

@XendraTrl(Identifier="f14f194c-a71e-5ec3-33e7-f858792ca507")
public static String es_PE_FIELD_BusinessPartner_FlatDiscount2_Description="Porcentaje de descuento simple";

@XendraField(AD_Column_ID="FlatDiscount",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f14f194c-a71e-5ec3-33e7-f858792ca507")
public static final String FIELDNAME_BusinessPartner_FlatDiscount2="f14f194c-a71e-5ec3-33e7-f858792ca507";

@XendraTrl(Identifier="aa576518-1ea7-df61-e853-a4ebd451744b")
public static String es_PE_COLUMN_FlatDiscount_Name="% Descuento";

@XendraColumn(AD_Element_ID="f91c7c28-3c01-1814-fd31-274a18628563",ColumnName="FlatDiscount",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="aa576518-1ea7-df61-e853-a4ebd451744b",
Synchronized="2019-08-30 22:21:10.0")
/** Column name FlatDiscount */
public static final String COLUMNNAME_FlatDiscount = "FlatDiscount";
/** Set Freight Cost Rule.
@param FreightCostRule Method for charging Freight */
public void setFreightCostRule (String FreightCostRule)
{
if (FreightCostRule != null && FreightCostRule.length() > 1)
{
log.warning("Length > 1 - truncated");
FreightCostRule = FreightCostRule.substring(0,0);
}
set_Value (COLUMNNAME_FreightCostRule, FreightCostRule);
}
/** Get Freight Cost Rule.
@return Method for charging Freight */
public String getFreightCostRule() 
{
return (String)get_Value(COLUMNNAME_FreightCostRule);
}

@XendraTrl(Identifier="aaea6576-40e8-cbae-e6e7-a6cea48e22b5")
public static String es_PE_FIELD_PartnerSelection_FreightCostRule_Name="Regla de Costo de Flete";

@XendraTrl(Identifier="aaea6576-40e8-cbae-e6e7-a6cea48e22b5")
public static String es_PE_FIELD_PartnerSelection_FreightCostRule_Description="Método para cargar el flete";

@XendraTrl(Identifier="aaea6576-40e8-cbae-e6e7-a6cea48e22b5")
public static String es_PE_FIELD_PartnerSelection_FreightCostRule_Help="La regla de costo de flete indica el método usado para cargar los fletes.";

@XendraField(AD_Column_ID="FreightCostRule",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="aaea6576-40e8-cbae-e6e7-a6cea48e22b5")
public static final String FIELDNAME_PartnerSelection_FreightCostRule="aaea6576-40e8-cbae-e6e7-a6cea48e22b5";

@XendraTrl(Identifier="62b6b31c-ef3c-a3d6-d572-482db207a3f1")
public static String es_PE_FIELD_Vendor_FreightCostRule_Name="Regla de Costo de Flete";

@XendraTrl(Identifier="62b6b31c-ef3c-a3d6-d572-482db207a3f1")
public static String es_PE_FIELD_Vendor_FreightCostRule_Description="Método para cargar el flete";

@XendraTrl(Identifier="62b6b31c-ef3c-a3d6-d572-482db207a3f1")
public static String es_PE_FIELD_Vendor_FreightCostRule_Help="La regla de costo de flete indica el método usado para cargar los fletes.";

@XendraField(AD_Column_ID="FreightCostRule",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="62b6b31c-ef3c-a3d6-d572-482db207a3f1")
public static final String FIELDNAME_Vendor_FreightCostRule="62b6b31c-ef3c-a3d6-d572-482db207a3f1";

@XendraTrl(Identifier="f8425a84-3fa5-7d99-6eb0-001b8acb9401")
public static String es_PE_FIELD_Customer_FreightCostRule_Name="Regla de Costo de Flete";

@XendraTrl(Identifier="f8425a84-3fa5-7d99-6eb0-001b8acb9401")
public static String es_PE_FIELD_Customer_FreightCostRule_Description="Método para cargar el flete";

@XendraTrl(Identifier="f8425a84-3fa5-7d99-6eb0-001b8acb9401")
public static String es_PE_FIELD_Customer_FreightCostRule_Help="La regla de costo de flete indica el método usado para cargar los fletes.";

@XendraField(AD_Column_ID="FreightCostRule",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f8425a84-3fa5-7d99-6eb0-001b8acb9401")
public static final String FIELDNAME_Customer_FreightCostRule="f8425a84-3fa5-7d99-6eb0-001b8acb9401";

@XendraTrl(Identifier="b2efb46c-e751-e362-6d16-c348ab6a69a3")
public static String es_PE_FIELD_EmployeeVendor_FreightCostRule_Name="Regla de Costo de Flete";

@XendraTrl(Identifier="b2efb46c-e751-e362-6d16-c348ab6a69a3")
public static String es_PE_FIELD_EmployeeVendor_FreightCostRule_Description="Método para cargar el flete";

@XendraTrl(Identifier="b2efb46c-e751-e362-6d16-c348ab6a69a3")
public static String es_PE_FIELD_EmployeeVendor_FreightCostRule_Help="La regla de costo de flete indica el método usado para cargar los fletes.";

@XendraField(AD_Column_ID="FreightCostRule",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b2efb46c-e751-e362-6d16-c348ab6a69a3")
public static final String FIELDNAME_EmployeeVendor_FreightCostRule="b2efb46c-e751-e362-6d16-c348ab6a69a3";

@XendraTrl(Identifier="fb973890-225f-63ac-7348-896f15c236d1")
public static String es_PE_FIELD_Vendor_FreightCostRule2_Name="Regla de Costo de Flete";

@XendraTrl(Identifier="fb973890-225f-63ac-7348-896f15c236d1")
public static String es_PE_FIELD_Vendor_FreightCostRule2_Description="Método para cargar el flete";

@XendraTrl(Identifier="fb973890-225f-63ac-7348-896f15c236d1")
public static String es_PE_FIELD_Vendor_FreightCostRule2_Help="La regla de costo de flete indica el método usado para cargar los fletes.";

@XendraField(AD_Column_ID="FreightCostRule",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fb973890-225f-63ac-7348-896f15c236d1")
public static final String FIELDNAME_Vendor_FreightCostRule2="fb973890-225f-63ac-7348-896f15c236d1";

@XendraTrl(Identifier="39bc6204-9e4b-f06d-a1be-3ea84d6925c3")
public static String es_PE_FIELD_BusinessPartner_FreightCostRule_Name="Regla de Costo de Flete";

@XendraTrl(Identifier="39bc6204-9e4b-f06d-a1be-3ea84d6925c3")
public static String es_PE_FIELD_BusinessPartner_FreightCostRule_Description="Método para cargar el flete";

@XendraTrl(Identifier="39bc6204-9e4b-f06d-a1be-3ea84d6925c3")
public static String es_PE_FIELD_BusinessPartner_FreightCostRule_Help="La regla de costo de flete indica el método usado para cargar los fletes.";

@XendraField(AD_Column_ID="FreightCostRule",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="39bc6204-9e4b-f06d-a1be-3ea84d6925c3")
public static final String FIELDNAME_BusinessPartner_FreightCostRule="39bc6204-9e4b-f06d-a1be-3ea84d6925c3";

@XendraTrl(Identifier="fdf60a49-ecb6-4ddf-5100-533b15a2b139")
public static String es_PE_FIELD_Employee_FreightCostRule_Name="Regla de Costo de Flete";

@XendraTrl(Identifier="fdf60a49-ecb6-4ddf-5100-533b15a2b139")
public static String es_PE_FIELD_Employee_FreightCostRule_Description="Método para cargar el flete";

@XendraTrl(Identifier="fdf60a49-ecb6-4ddf-5100-533b15a2b139")
public static String es_PE_FIELD_Employee_FreightCostRule_Help="La regla de costo de flete indica el método usado para cargar los fletes.";

@XendraField(AD_Column_ID="FreightCostRule",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fdf60a49-ecb6-4ddf-5100-533b15a2b139")
public static final String FIELDNAME_Employee_FreightCostRule="fdf60a49-ecb6-4ddf-5100-533b15a2b139";

@XendraTrl(Identifier="b2e86e8b-c5ca-eff4-3682-141ee931229b")
public static String es_PE_FIELD_BusinessPartnerDimension_FreightCostRule_Name="Regla de Costo de Flete";

@XendraTrl(Identifier="b2e86e8b-c5ca-eff4-3682-141ee931229b")
public static String es_PE_FIELD_BusinessPartnerDimension_FreightCostRule_Description="Método para cargar el flete";

@XendraTrl(Identifier="b2e86e8b-c5ca-eff4-3682-141ee931229b")
public static String es_PE_FIELD_BusinessPartnerDimension_FreightCostRule_Help="La regla de costo de flete indica el método usado para cargar los fletes.";

@XendraField(AD_Column_ID="FreightCostRule",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b2e86e8b-c5ca-eff4-3682-141ee931229b")
public static final String FIELDNAME_BusinessPartnerDimension_FreightCostRule="b2e86e8b-c5ca-eff4-3682-141ee931229b";

@XendraTrl(Identifier="7555639f-1549-cdf4-6315-51161cf73ce4")
public static String es_PE_FIELD_AssignedPartners_FreightCostRule_Name="Regla de Costo de Flete";

@XendraTrl(Identifier="7555639f-1549-cdf4-6315-51161cf73ce4")
public static String es_PE_FIELD_AssignedPartners_FreightCostRule_Description="Método para cargar el flete";

@XendraTrl(Identifier="7555639f-1549-cdf4-6315-51161cf73ce4")
public static String es_PE_FIELD_AssignedPartners_FreightCostRule_Help="La regla de costo de flete indica el método usado para cargar los fletes.";

@XendraField(AD_Column_ID="FreightCostRule",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7555639f-1549-cdf4-6315-51161cf73ce4")
public static final String FIELDNAME_AssignedPartners_FreightCostRule="7555639f-1549-cdf4-6315-51161cf73ce4";

@XendraTrl(Identifier="00147edf-d55e-45f4-7b38-35a2940d393e")
public static String es_PE_FIELD_Customer_FreightCostRule2_Name="Regla de Costo de Flete";

@XendraTrl(Identifier="00147edf-d55e-45f4-7b38-35a2940d393e")
public static String es_PE_FIELD_Customer_FreightCostRule2_Description="Método para cargar el flete";

@XendraTrl(Identifier="00147edf-d55e-45f4-7b38-35a2940d393e")
public static String es_PE_FIELD_Customer_FreightCostRule2_Help="La regla de costo de flete indica el método usado para cargar los fletes.";

@XendraField(AD_Column_ID="FreightCostRule",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsCustomer@='Y'",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="00147edf-d55e-45f4-7b38-35a2940d393e")
public static final String FIELDNAME_Customer_FreightCostRule2="00147edf-d55e-45f4-7b38-35a2940d393e";

@XendraTrl(Identifier="e239a8f0-0c46-3a41-a8ec-749e57b2a99e")
public static String es_PE_FIELD_BusinessPartner_FreightCostRule2_Name="Regla de Costo de Flete";

@XendraTrl(Identifier="e239a8f0-0c46-3a41-a8ec-749e57b2a99e")
public static String es_PE_FIELD_BusinessPartner_FreightCostRule2_Description="Método para cargar el flete";

@XendraTrl(Identifier="e239a8f0-0c46-3a41-a8ec-749e57b2a99e")
public static String es_PE_FIELD_BusinessPartner_FreightCostRule2_Help="La regla de costo de flete indica el método usado para cargar los fletes.";

@XendraField(AD_Column_ID="FreightCostRule",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e239a8f0-0c46-3a41-a8ec-749e57b2a99e")
public static final String FIELDNAME_BusinessPartner_FreightCostRule2="e239a8f0-0c46-3a41-a8ec-749e57b2a99e";

@XendraTrl(Identifier="51e33f5f-3718-b939-3392-93e8874d2252")
public static String es_PE_COLUMN_FreightCostRule_Name="Regla de Costo de Flete";

@XendraColumn(AD_Element_ID="b5da4c11-198a-5ff2-38f2-d0d7dbad053e",ColumnName="FreightCostRule",
AD_Reference_ID=17,AD_Reference_Value_ID="991b4512-0e0d-3494-3835-cc8ecaf3ab12",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="51e33f5f-3718-b939-3392-93e8874d2252",Synchronized="2019-08-30 22:21:10.0")
/** Column name FreightCostRule */
public static final String COLUMNNAME_FreightCostRule = "FreightCostRule";
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
@XendraTrl(Identifier="28c79a3a-9ba2-804b-0a77-d9e2effbfe1d")
public static String es_PE_FIELD_BusinessPartner_Identifier_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=36,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2015-11-23 15:25:54.0",
Identifier="28c79a3a-9ba2-804b-0a77-d9e2effbfe1d")
public static final String FIELDNAME_BusinessPartner_Identifier="28c79a3a-9ba2-804b-0a77-d9e2effbfe1d";

@XendraTrl(Identifier="333c389d-e334-4c1a-be00-d90166c265d5")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="333c389d-e334-4c1a-be00-d90166c265d5",
Synchronized="2019-08-30 22:21:10.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Invoice Print Format.
@param Invoice_PrintFormat_ID Print Format for printing Invoices */
public void setInvoice_PrintFormat_ID (int Invoice_PrintFormat_ID)
{
if (Invoice_PrintFormat_ID <= 0) set_Value (COLUMNNAME_Invoice_PrintFormat_ID, null);
 else 
set_Value (COLUMNNAME_Invoice_PrintFormat_ID, Integer.valueOf(Invoice_PrintFormat_ID));
}
/** Get Invoice Print Format.
@return Print Format for printing Invoices */
public int getInvoice_PrintFormat_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Invoice_PrintFormat_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="bb3da245-2e52-426e-c36a-f4ff21903375")
public static String es_PE_FIELD_EmployeeVendor_InvoicePrintFormat_Name="Formato de Impresión de facturas";

@XendraTrl(Identifier="bb3da245-2e52-426e-c36a-f4ff21903375")
public static String es_PE_FIELD_EmployeeVendor_InvoicePrintFormat_Description="Formato de impresión usado para imprimir facturas";

@XendraTrl(Identifier="bb3da245-2e52-426e-c36a-f4ff21903375")
public static String es_PE_FIELD_EmployeeVendor_InvoicePrintFormat_Help="Es necesario definir un formato para imprimir el documento";

@XendraField(AD_Column_ID="Invoice_PrintFormat_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bb3da245-2e52-426e-c36a-f4ff21903375")
public static final String FIELDNAME_EmployeeVendor_InvoicePrintFormat="bb3da245-2e52-426e-c36a-f4ff21903375";

@XendraTrl(Identifier="8fddfcab-b9a6-86de-2f3e-b312d6836477")
public static String es_PE_FIELD_PartnerSelection_InvoicePrintFormat_Name="Formato de Impresión de facturas";

@XendraTrl(Identifier="8fddfcab-b9a6-86de-2f3e-b312d6836477")
public static String es_PE_FIELD_PartnerSelection_InvoicePrintFormat_Description="Formato de impresión usado para imprimir facturas";

@XendraTrl(Identifier="8fddfcab-b9a6-86de-2f3e-b312d6836477")
public static String es_PE_FIELD_PartnerSelection_InvoicePrintFormat_Help="Es necesario definir un formato para imprimir el documento";

@XendraField(AD_Column_ID="Invoice_PrintFormat_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8fddfcab-b9a6-86de-2f3e-b312d6836477")
public static final String FIELDNAME_PartnerSelection_InvoicePrintFormat="8fddfcab-b9a6-86de-2f3e-b312d6836477";

@XendraTrl(Identifier="e887bab0-d6a2-2d3e-6356-d6cd3dc9471a")
public static String es_PE_FIELD_Employee_InvoicePrintFormat_Name="Formato de Impresión de facturas";

@XendraTrl(Identifier="e887bab0-d6a2-2d3e-6356-d6cd3dc9471a")
public static String es_PE_FIELD_Employee_InvoicePrintFormat_Description="Formato de impresión usado para imprimir facturas";

@XendraTrl(Identifier="e887bab0-d6a2-2d3e-6356-d6cd3dc9471a")
public static String es_PE_FIELD_Employee_InvoicePrintFormat_Help="Es necesario definir un formato para imprimir el documento";

@XendraField(AD_Column_ID="Invoice_PrintFormat_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e887bab0-d6a2-2d3e-6356-d6cd3dc9471a")
public static final String FIELDNAME_Employee_InvoicePrintFormat="e887bab0-d6a2-2d3e-6356-d6cd3dc9471a";

@XendraTrl(Identifier="3dfd2553-5f93-0b91-de40-191049431937")
public static String es_PE_FIELD_Vendor_InvoicePrintFormat_Name="Formato de Impresión de facturas";

@XendraTrl(Identifier="3dfd2553-5f93-0b91-de40-191049431937")
public static String es_PE_FIELD_Vendor_InvoicePrintFormat_Description="Formato de impresión usado para imprimir facturas";

@XendraTrl(Identifier="3dfd2553-5f93-0b91-de40-191049431937")
public static String es_PE_FIELD_Vendor_InvoicePrintFormat_Help="Es necesario definir un formato para imprimir el documento";

@XendraField(AD_Column_ID="Invoice_PrintFormat_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3dfd2553-5f93-0b91-de40-191049431937")
public static final String FIELDNAME_Vendor_InvoicePrintFormat="3dfd2553-5f93-0b91-de40-191049431937";

@XendraTrl(Identifier="d1071d81-9a46-c2bc-feec-f97ce17b632a")
public static String es_PE_FIELD_BusinessPartner_InvoicePrintFormat_Name="Formato de Impresión de facturas";

@XendraTrl(Identifier="d1071d81-9a46-c2bc-feec-f97ce17b632a")
public static String es_PE_FIELD_BusinessPartner_InvoicePrintFormat_Description="Formato de impresión usado para imprimir facturas";

@XendraTrl(Identifier="d1071d81-9a46-c2bc-feec-f97ce17b632a")
public static String es_PE_FIELD_BusinessPartner_InvoicePrintFormat_Help="Es necesario definir un formato para imprimir el documento";

@XendraField(AD_Column_ID="Invoice_PrintFormat_ID",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d1071d81-9a46-c2bc-feec-f97ce17b632a")
public static final String FIELDNAME_BusinessPartner_InvoicePrintFormat="d1071d81-9a46-c2bc-feec-f97ce17b632a";

@XendraTrl(Identifier="ada7b5dc-6541-ea5c-50ac-d2d9a8a9c353")
public static String es_PE_FIELD_AssignedPartners_InvoicePrintFormat_Name="Formato de Impresión de facturas";

@XendraTrl(Identifier="ada7b5dc-6541-ea5c-50ac-d2d9a8a9c353")
public static String es_PE_FIELD_AssignedPartners_InvoicePrintFormat_Description="Formato de impresión usado para imprimir facturas";

@XendraTrl(Identifier="ada7b5dc-6541-ea5c-50ac-d2d9a8a9c353")
public static String es_PE_FIELD_AssignedPartners_InvoicePrintFormat_Help="Es necesario definir un formato para imprimir el documento";

@XendraField(AD_Column_ID="Invoice_PrintFormat_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ada7b5dc-6541-ea5c-50ac-d2d9a8a9c353")
public static final String FIELDNAME_AssignedPartners_InvoicePrintFormat="ada7b5dc-6541-ea5c-50ac-d2d9a8a9c353";

@XendraTrl(Identifier="232d74f6-1ce1-29d1-44f6-91b255ce5a7b")
public static String es_PE_FIELD_Customer_InvoicePrintFormat_Name="Formato de Impresión de facturas";

@XendraTrl(Identifier="232d74f6-1ce1-29d1-44f6-91b255ce5a7b")
public static String es_PE_FIELD_Customer_InvoicePrintFormat_Description="Formato de impresión usado para imprimir facturas";

@XendraTrl(Identifier="232d74f6-1ce1-29d1-44f6-91b255ce5a7b")
public static String es_PE_FIELD_Customer_InvoicePrintFormat_Help="Es necesario definir un formato para imprimir el documento";

@XendraField(AD_Column_ID="Invoice_PrintFormat_ID",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="232d74f6-1ce1-29d1-44f6-91b255ce5a7b")
public static final String FIELDNAME_Customer_InvoicePrintFormat="232d74f6-1ce1-29d1-44f6-91b255ce5a7b";

@XendraTrl(Identifier="2ebccf43-4d03-ae13-f91d-ecd2db811fdb")
public static String es_PE_FIELD_BusinessPartnerDimension_InvoicePrintFormat_Name="Formato de Impresión de facturas";

@XendraTrl(Identifier="2ebccf43-4d03-ae13-f91d-ecd2db811fdb")
public static String es_PE_FIELD_BusinessPartnerDimension_InvoicePrintFormat_Description="Formato de impresión usado para imprimir facturas";

@XendraTrl(Identifier="2ebccf43-4d03-ae13-f91d-ecd2db811fdb")
public static String es_PE_FIELD_BusinessPartnerDimension_InvoicePrintFormat_Help="Es necesario definir un formato para imprimir el documento";

@XendraField(AD_Column_ID="Invoice_PrintFormat_ID",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2ebccf43-4d03-ae13-f91d-ecd2db811fdb")
public static final String FIELDNAME_BusinessPartnerDimension_InvoicePrintFormat="2ebccf43-4d03-ae13-f91d-ecd2db811fdb";

@XendraTrl(Identifier="bd905af7-be70-868f-0215-35555fe51a40")
public static String es_PE_FIELD_Vendor_InvoicePrintFormat2_Name="Formato de Impresión de facturas";

@XendraTrl(Identifier="bd905af7-be70-868f-0215-35555fe51a40")
public static String es_PE_FIELD_Vendor_InvoicePrintFormat2_Description="Formato de impresión usado para imprimir facturas";

@XendraTrl(Identifier="bd905af7-be70-868f-0215-35555fe51a40")
public static String es_PE_FIELD_Vendor_InvoicePrintFormat2_Help="Es necesario definir un formato para imprimir el documento";

@XendraField(AD_Column_ID="Invoice_PrintFormat_ID",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bd905af7-be70-868f-0215-35555fe51a40")
public static final String FIELDNAME_Vendor_InvoicePrintFormat2="bd905af7-be70-868f-0215-35555fe51a40";

@XendraTrl(Identifier="ed6b6d02-d063-32be-be35-db8dd5d6dd9a")
public static String es_PE_FIELD_Customer_InvoicePrintFormat2_Name="Formato de Impresión de Facturas";

@XendraTrl(Identifier="ed6b6d02-d063-32be-be35-db8dd5d6dd9a")
public static String es_PE_FIELD_Customer_InvoicePrintFormat2_Description="Formato de impresión usado para imprimir facturas";

@XendraTrl(Identifier="ed6b6d02-d063-32be-be35-db8dd5d6dd9a")
public static String es_PE_FIELD_Customer_InvoicePrintFormat2_Help="Es necesario definir un formato para imprimir el documento";

@XendraField(AD_Column_ID="Invoice_PrintFormat_ID",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsCustomer@='Y'",DisplayLength=14,IsReadOnly=false,SeqNo=190,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="ed6b6d02-d063-32be-be35-db8dd5d6dd9a")
public static final String FIELDNAME_Customer_InvoicePrintFormat2="ed6b6d02-d063-32be-be35-db8dd5d6dd9a";

@XendraTrl(Identifier="24add627-972f-85cb-34ed-cc4ceea5e81a")
public static String es_PE_FIELD_BusinessPartner_InvoicePrintFormat2_Name="Formato de Impresión de facturas";

@XendraTrl(Identifier="24add627-972f-85cb-34ed-cc4ceea5e81a")
public static String es_PE_FIELD_BusinessPartner_InvoicePrintFormat2_Description="Formato de impresión usado para imprimir facturas";

@XendraTrl(Identifier="24add627-972f-85cb-34ed-cc4ceea5e81a")
public static String es_PE_FIELD_BusinessPartner_InvoicePrintFormat2_Help="Es necesario definir un formato para imprimir el documento";

@XendraField(AD_Column_ID="Invoice_PrintFormat_ID",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="24add627-972f-85cb-34ed-cc4ceea5e81a")
public static final String FIELDNAME_BusinessPartner_InvoicePrintFormat2="24add627-972f-85cb-34ed-cc4ceea5e81a";

@XendraTrl(Identifier="3e209b02-1779-257a-ccc1-60e9b7588b9c")
public static String es_PE_COLUMN_Invoice_PrintFormat_ID_Name="Formato de Impresión de facturas";

@XendraColumn(AD_Element_ID="a88115e7-5644-7a53-5652-ba5a6eaa4ae3",
ColumnName="Invoice_PrintFormat_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="3fb04288-4549-80e8-1969-6c95b48c8b1a",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="3e209b02-1779-257a-ccc1-60e9b7588b9c",
Synchronized="2019-08-30 22:21:10.0")
/** Column name Invoice_PrintFormat_ID */
public static final String COLUMNNAME_Invoice_PrintFormat_ID = "Invoice_PrintFormat_ID";
/** Set Invoice Rule.
@param InvoiceRule Frequency and method of invoicing  */
public void setInvoiceRule (String InvoiceRule)
{
if (InvoiceRule != null && InvoiceRule.length() > 1)
{
log.warning("Length > 1 - truncated");
InvoiceRule = InvoiceRule.substring(0,0);
}
set_Value (COLUMNNAME_InvoiceRule, InvoiceRule);
}
/** Get Invoice Rule.
@return Frequency and method of invoicing  */
public String getInvoiceRule() 
{
return (String)get_Value(COLUMNNAME_InvoiceRule);
}

@XendraTrl(Identifier="4397721b-53f6-e281-872a-660cb5d1b138")
public static String es_PE_FIELD_Customer_InvoiceRule_Name="Regla de Facturación";

@XendraTrl(Identifier="4397721b-53f6-e281-872a-660cb5d1b138")
public static String es_PE_FIELD_Customer_InvoiceRule_Description="Frecuencia y métodos de facturación";

@XendraTrl(Identifier="4397721b-53f6-e281-872a-660cb5d1b138")
public static String es_PE_FIELD_Customer_InvoiceRule_Help="La regla de facturación define cómo se le factura a un socio de negocio y la frecuencia de facturación.";

@XendraField(AD_Column_ID="InvoiceRule",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsCustomer@='Y'",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="4397721b-53f6-e281-872a-660cb5d1b138")
public static final String FIELDNAME_Customer_InvoiceRule="4397721b-53f6-e281-872a-660cb5d1b138";

@XendraTrl(Identifier="b9cbab8e-390e-fa4f-619d-a62862ef0e61")
public static String es_PE_FIELD_BusinessPartnerDimension_InvoiceRule_Name="Regla de Facturación";

@XendraTrl(Identifier="b9cbab8e-390e-fa4f-619d-a62862ef0e61")
public static String es_PE_FIELD_BusinessPartnerDimension_InvoiceRule_Description="Frecuencia y métodos de facturación";

@XendraTrl(Identifier="b9cbab8e-390e-fa4f-619d-a62862ef0e61")
public static String es_PE_FIELD_BusinessPartnerDimension_InvoiceRule_Help="La regla de facturación define cómo se le factura a un socio de negocio y la frecuencia de facturación.";

@XendraField(AD_Column_ID="InvoiceRule",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b9cbab8e-390e-fa4f-619d-a62862ef0e61")
public static final String FIELDNAME_BusinessPartnerDimension_InvoiceRule="b9cbab8e-390e-fa4f-619d-a62862ef0e61";

@XendraTrl(Identifier="aea24811-b3ee-6cdd-56ab-a9d72b60ac7c")
public static String es_PE_FIELD_Customer_InvoiceRule2_Name="Regla de Facturación";

@XendraTrl(Identifier="aea24811-b3ee-6cdd-56ab-a9d72b60ac7c")
public static String es_PE_FIELD_Customer_InvoiceRule2_Description="Frecuencia y métodos de facturación";

@XendraTrl(Identifier="aea24811-b3ee-6cdd-56ab-a9d72b60ac7c")
public static String es_PE_FIELD_Customer_InvoiceRule2_Help="La regla de facturación define cómo se le factura a un socio de negocio y la frecuencia de facturación.";

@XendraField(AD_Column_ID="InvoiceRule",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="aea24811-b3ee-6cdd-56ab-a9d72b60ac7c")
public static final String FIELDNAME_Customer_InvoiceRule2="aea24811-b3ee-6cdd-56ab-a9d72b60ac7c";

@XendraTrl(Identifier="d2021147-0099-4696-c5f0-27f11ddfd6f7")
public static String es_PE_FIELD_BusinessPartner_InvoiceRule_Name="Regla de Facturación";

@XendraTrl(Identifier="d2021147-0099-4696-c5f0-27f11ddfd6f7")
public static String es_PE_FIELD_BusinessPartner_InvoiceRule_Description="Frecuencia y métodos de facturación";

@XendraTrl(Identifier="d2021147-0099-4696-c5f0-27f11ddfd6f7")
public static String es_PE_FIELD_BusinessPartner_InvoiceRule_Help="La regla de facturación define cómo se le factura a un socio de negocio y la frecuencia de facturación.";

@XendraField(AD_Column_ID="InvoiceRule",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d2021147-0099-4696-c5f0-27f11ddfd6f7")
public static final String FIELDNAME_BusinessPartner_InvoiceRule="d2021147-0099-4696-c5f0-27f11ddfd6f7";

@XendraTrl(Identifier="4afa934a-9895-444b-2e79-9fad78745f10")
public static String es_PE_FIELD_Vendor_InvoiceRule_Name="Regla de Facturación";

@XendraTrl(Identifier="4afa934a-9895-444b-2e79-9fad78745f10")
public static String es_PE_FIELD_Vendor_InvoiceRule_Description="Frecuencia y métodos de facturación";

@XendraTrl(Identifier="4afa934a-9895-444b-2e79-9fad78745f10")
public static String es_PE_FIELD_Vendor_InvoiceRule_Help="La regla de facturación define cómo se le factura a un socio de negocio y la frecuencia de facturación.";

@XendraField(AD_Column_ID="InvoiceRule",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4afa934a-9895-444b-2e79-9fad78745f10")
public static final String FIELDNAME_Vendor_InvoiceRule="4afa934a-9895-444b-2e79-9fad78745f10";

@XendraTrl(Identifier="7555ddd1-3b4a-b29a-056b-fca7cd09fb70")
public static String es_PE_FIELD_PartnerSelection_InvoiceRule_Name="Regla de Facturación";

@XendraTrl(Identifier="7555ddd1-3b4a-b29a-056b-fca7cd09fb70")
public static String es_PE_FIELD_PartnerSelection_InvoiceRule_Description="Frecuencia y métodos de facturación";

@XendraTrl(Identifier="7555ddd1-3b4a-b29a-056b-fca7cd09fb70")
public static String es_PE_FIELD_PartnerSelection_InvoiceRule_Help="La regla de facturación define cómo se le factura a un socio de negocio y la frecuencia de facturación.";

@XendraField(AD_Column_ID="InvoiceRule",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7555ddd1-3b4a-b29a-056b-fca7cd09fb70")
public static final String FIELDNAME_PartnerSelection_InvoiceRule="7555ddd1-3b4a-b29a-056b-fca7cd09fb70";

@XendraTrl(Identifier="5ab5fd7f-01bf-a3b4-77f3-dc5257205b4b")
public static String es_PE_FIELD_Employee_InvoiceRule_Name="Regla de Facturación";

@XendraTrl(Identifier="5ab5fd7f-01bf-a3b4-77f3-dc5257205b4b")
public static String es_PE_FIELD_Employee_InvoiceRule_Description="Frecuencia y métodos de facturación";

@XendraTrl(Identifier="5ab5fd7f-01bf-a3b4-77f3-dc5257205b4b")
public static String es_PE_FIELD_Employee_InvoiceRule_Help="La regla de facturación define cómo se le factura a un socio de negocio y la frecuencia de facturación.";

@XendraField(AD_Column_ID="InvoiceRule",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5ab5fd7f-01bf-a3b4-77f3-dc5257205b4b")
public static final String FIELDNAME_Employee_InvoiceRule="5ab5fd7f-01bf-a3b4-77f3-dc5257205b4b";

@XendraTrl(Identifier="84e1b3c4-44ba-30eb-d9c6-dc5147bf4621")
public static String es_PE_FIELD_EmployeeVendor_InvoiceRule_Name="Regla de Facturación";

@XendraTrl(Identifier="84e1b3c4-44ba-30eb-d9c6-dc5147bf4621")
public static String es_PE_FIELD_EmployeeVendor_InvoiceRule_Description="Frecuencia y métodos de facturación";

@XendraTrl(Identifier="84e1b3c4-44ba-30eb-d9c6-dc5147bf4621")
public static String es_PE_FIELD_EmployeeVendor_InvoiceRule_Help="La regla de facturación define cómo se le factura a un socio de negocio y la frecuencia de facturación.";

@XendraField(AD_Column_ID="InvoiceRule",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="84e1b3c4-44ba-30eb-d9c6-dc5147bf4621")
public static final String FIELDNAME_EmployeeVendor_InvoiceRule="84e1b3c4-44ba-30eb-d9c6-dc5147bf4621";

@XendraTrl(Identifier="94562fd7-b957-83c3-1e20-6c85429b0108")
public static String es_PE_FIELD_AssignedPartners_InvoiceRule_Name="Regla de Facturación";

@XendraTrl(Identifier="94562fd7-b957-83c3-1e20-6c85429b0108")
public static String es_PE_FIELD_AssignedPartners_InvoiceRule_Description="Frecuencia y métodos de facturación";

@XendraTrl(Identifier="94562fd7-b957-83c3-1e20-6c85429b0108")
public static String es_PE_FIELD_AssignedPartners_InvoiceRule_Help="La regla de facturación define cómo se le factura a un socio de negocio y la frecuencia de facturación.";

@XendraField(AD_Column_ID="InvoiceRule",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="94562fd7-b957-83c3-1e20-6c85429b0108")
public static final String FIELDNAME_AssignedPartners_InvoiceRule="94562fd7-b957-83c3-1e20-6c85429b0108";

@XendraTrl(Identifier="624ceb7f-aa77-5722-36ae-b5cca53f8f18")
public static String es_PE_FIELD_BusinessPartner_InvoiceRule2_Name="Regla de Facturación";

@XendraTrl(Identifier="624ceb7f-aa77-5722-36ae-b5cca53f8f18")
public static String es_PE_FIELD_BusinessPartner_InvoiceRule2_Description="Frecuencia y métodos de facturación";

@XendraTrl(Identifier="624ceb7f-aa77-5722-36ae-b5cca53f8f18")
public static String es_PE_FIELD_BusinessPartner_InvoiceRule2_Help="La regla de facturación define cómo se le factura a un socio de negocio y la frecuencia de facturación.";

@XendraField(AD_Column_ID="InvoiceRule",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="624ceb7f-aa77-5722-36ae-b5cca53f8f18")
public static final String FIELDNAME_BusinessPartner_InvoiceRule2="624ceb7f-aa77-5722-36ae-b5cca53f8f18";

@XendraTrl(Identifier="5085f172-4ba4-d918-f7d1-8550ff998d85")
public static String es_PE_FIELD_Vendor_InvoiceRule2_Name="Regla de Facturación";

@XendraTrl(Identifier="5085f172-4ba4-d918-f7d1-8550ff998d85")
public static String es_PE_FIELD_Vendor_InvoiceRule2_Description="Frecuencia y métodos de facturación";

@XendraTrl(Identifier="5085f172-4ba4-d918-f7d1-8550ff998d85")
public static String es_PE_FIELD_Vendor_InvoiceRule2_Help="La regla de facturación define cómo se le factura a un socio de negocio y la frecuencia de facturación.";

@XendraField(AD_Column_ID="InvoiceRule",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5085f172-4ba4-d918-f7d1-8550ff998d85")
public static final String FIELDNAME_Vendor_InvoiceRule2="5085f172-4ba4-d918-f7d1-8550ff998d85";

@XendraTrl(Identifier="0509c1b0-71be-8b47-faf6-d659571fc82e")
public static String es_PE_COLUMN_InvoiceRule_Name="Regla de Facturación";

@XendraColumn(AD_Element_ID="4146a93f-e366-9714-9c96-963119f216aa",ColumnName="InvoiceRule",
AD_Reference_ID=17,AD_Reference_Value_ID="48d8ab23-89bf-db6f-7a12-1c4d2aa5604f",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0509c1b0-71be-8b47-faf6-d659571fc82e",Synchronized="2019-08-30 22:21:10.0")
/** Column name InvoiceRule */
public static final String COLUMNNAME_InvoiceRule = "InvoiceRule";
/** Set Customer.
@param IsCustomer Indicates if this Business Partner is a Customer */
public void setIsCustomer (boolean IsCustomer)
{
set_Value (COLUMNNAME_IsCustomer, Boolean.valueOf(IsCustomer));
}
/** Get Customer.
@return Indicates if this Business Partner is a Customer */
public boolean isCustomer() 
{
Object oo = get_Value(COLUMNNAME_IsCustomer);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="cd41bbfd-f546-c91d-44c4-75ea69b11db5")
public static String es_PE_FIELD_PartnerSelection_Customer_Name="Cliente";

@XendraTrl(Identifier="cd41bbfd-f546-c91d-44c4-75ea69b11db5")
public static String es_PE_FIELD_PartnerSelection_Customer_Description="Indica si el socio de negocio es un cliente";

@XendraTrl(Identifier="cd41bbfd-f546-c91d-44c4-75ea69b11db5")
public static String es_PE_FIELD_PartnerSelection_Customer_Help="El cuadro de verificación cliente indica si el socio de negocio es un cliente. Si se seleccionan campos adicionales desplegarán información adicional para definir al cliente.";

@XendraField(AD_Column_ID="IsCustomer",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cd41bbfd-f546-c91d-44c4-75ea69b11db5")
public static final String FIELDNAME_PartnerSelection_Customer="cd41bbfd-f546-c91d-44c4-75ea69b11db5";

@XendraTrl(Identifier="18ace10f-74b4-24a1-d288-7ca9f77e9686")
public static String es_PE_FIELD_Customer_Customer_Name="Cliente";

@XendraTrl(Identifier="18ace10f-74b4-24a1-d288-7ca9f77e9686")
public static String es_PE_FIELD_Customer_Customer_Description="Indica si el socio de negocio es un cliente";

@XendraTrl(Identifier="18ace10f-74b4-24a1-d288-7ca9f77e9686")
public static String es_PE_FIELD_Customer_Customer_Help="El cuadro de verificación cliente indica si el socio de negocio es un cliente. Si se seleccionan campos adicionales desplegarán información adicional para definir al cliente.";

@XendraField(AD_Column_ID="IsCustomer",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="18ace10f-74b4-24a1-d288-7ca9f77e9686")
public static final String FIELDNAME_Customer_Customer="18ace10f-74b4-24a1-d288-7ca9f77e9686";

@XendraTrl(Identifier="d0749eb0-4d76-c982-eff9-265e0655805c")
public static String es_PE_FIELD_BusinessPartnerDimension_Customer_Name="Cliente";

@XendraTrl(Identifier="d0749eb0-4d76-c982-eff9-265e0655805c")
public static String es_PE_FIELD_BusinessPartnerDimension_Customer_Description="Indica si el socio de negocio es un cliente";

@XendraTrl(Identifier="d0749eb0-4d76-c982-eff9-265e0655805c")
public static String es_PE_FIELD_BusinessPartnerDimension_Customer_Help="El cuadro de verificación cliente indica si el socio de negocio es un cliente. Si se seleccionan campos adicionales desplegarán información adicional para definir al cliente.";

@XendraField(AD_Column_ID="IsCustomer",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d0749eb0-4d76-c982-eff9-265e0655805c")
public static final String FIELDNAME_BusinessPartnerDimension_Customer="d0749eb0-4d76-c982-eff9-265e0655805c";

@XendraTrl(Identifier="6285ef93-7a7f-e166-299a-5723982135a7")
public static String es_PE_FIELD_BusinessPartner_Customer_Name="Cliente";

@XendraTrl(Identifier="6285ef93-7a7f-e166-299a-5723982135a7")
public static String es_PE_FIELD_BusinessPartner_Customer_Description="Indica si el socio de negocio es un cliente";

@XendraTrl(Identifier="6285ef93-7a7f-e166-299a-5723982135a7")
public static String es_PE_FIELD_BusinessPartner_Customer_Help="El cuadro de verificación cliente indica si el socio de negocio es un cliente. Si se seleccionan campos adicionales desplegarán información adicional para definir al cliente.";

@XendraField(AD_Column_ID="IsCustomer",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6285ef93-7a7f-e166-299a-5723982135a7")
public static final String FIELDNAME_BusinessPartner_Customer="6285ef93-7a7f-e166-299a-5723982135a7";

@XendraTrl(Identifier="14409659-7aec-6452-2c51-7f86bc7541ae")
public static String es_PE_FIELD_Employee_Customer_Name="Cliente";

@XendraTrl(Identifier="14409659-7aec-6452-2c51-7f86bc7541ae")
public static String es_PE_FIELD_Employee_Customer_Description="Indica si el socio de negocio es un cliente";

@XendraTrl(Identifier="14409659-7aec-6452-2c51-7f86bc7541ae")
public static String es_PE_FIELD_Employee_Customer_Help="El cuadro de verificación cliente indica si el socio de negocio es un cliente. Si se seleccionan campos adicionales desplegarán información adicional para definir al cliente.";

@XendraField(AD_Column_ID="IsCustomer",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="14409659-7aec-6452-2c51-7f86bc7541ae")
public static final String FIELDNAME_Employee_Customer="14409659-7aec-6452-2c51-7f86bc7541ae";

@XendraTrl(Identifier="04837bac-1ff0-cd4f-d7e0-7fb629a1eab0")
public static String es_PE_FIELD_Vendor_Customer_Name="Cliente";

@XendraTrl(Identifier="04837bac-1ff0-cd4f-d7e0-7fb629a1eab0")
public static String es_PE_FIELD_Vendor_Customer_Description="Indica si el socio de negocio es un cliente";

@XendraTrl(Identifier="04837bac-1ff0-cd4f-d7e0-7fb629a1eab0")
public static String es_PE_FIELD_Vendor_Customer_Help="El cuadro de verificación cliente indica si el socio de negocio es un cliente. Si se seleccionan campos adicionales desplegarán información adicional para definir al cliente.";

@XendraField(AD_Column_ID="IsCustomer",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="04837bac-1ff0-cd4f-d7e0-7fb629a1eab0")
public static final String FIELDNAME_Vendor_Customer="04837bac-1ff0-cd4f-d7e0-7fb629a1eab0";

@XendraTrl(Identifier="8720758a-a30c-f236-2d4a-d54de390d7d8")
public static String es_PE_FIELD_EmployeeVendor_Customer_Name="Cliente";

@XendraTrl(Identifier="8720758a-a30c-f236-2d4a-d54de390d7d8")
public static String es_PE_FIELD_EmployeeVendor_Customer_Description="Indica si el socio de negocio es un cliente";

@XendraTrl(Identifier="8720758a-a30c-f236-2d4a-d54de390d7d8")
public static String es_PE_FIELD_EmployeeVendor_Customer_Help="El cuadro de verificación cliente indica si el socio de negocio es un cliente. Si se seleccionan campos adicionales desplegarán información adicional para definir al cliente.";

@XendraField(AD_Column_ID="IsCustomer",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8720758a-a30c-f236-2d4a-d54de390d7d8")
public static final String FIELDNAME_EmployeeVendor_Customer="8720758a-a30c-f236-2d4a-d54de390d7d8";

@XendraTrl(Identifier="b330b398-eef0-c23b-16c4-6a22c26a7044")
public static String es_PE_FIELD_AssignedPartners_Customer_Name="Cliente";

@XendraTrl(Identifier="b330b398-eef0-c23b-16c4-6a22c26a7044")
public static String es_PE_FIELD_AssignedPartners_Customer_Description="Indica si el socio de negocio es un cliente";

@XendraTrl(Identifier="b330b398-eef0-c23b-16c4-6a22c26a7044")
public static String es_PE_FIELD_AssignedPartners_Customer_Help="El cuadro de verificación cliente indica si el socio de negocio es un cliente. Si se seleccionan campos adicionales desplegarán información adicional para definir al cliente.";

@XendraField(AD_Column_ID="IsCustomer",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b330b398-eef0-c23b-16c4-6a22c26a7044")
public static final String FIELDNAME_AssignedPartners_Customer="b330b398-eef0-c23b-16c4-6a22c26a7044";

@XendraTrl(Identifier="dc0d9ee4-7456-fb53-966e-5e1a993e490c")
public static String es_PE_FIELD_Customer_Customer2_Name="Cliente";

@XendraTrl(Identifier="dc0d9ee4-7456-fb53-966e-5e1a993e490c")
public static String es_PE_FIELD_Customer_Customer2_Description="Indica si el socio de negocio es un cliente";

@XendraTrl(Identifier="dc0d9ee4-7456-fb53-966e-5e1a993e490c")
public static String es_PE_FIELD_Customer_Customer2_Help="El cuadro de verificación cliente indica si el socio de negocio es un cliente. Si se seleccionan campos adicionales desplegarán información adicional para definir al cliente.";

@XendraField(AD_Column_ID="IsCustomer",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dc0d9ee4-7456-fb53-966e-5e1a993e490c")
public static final String FIELDNAME_Customer_Customer2="dc0d9ee4-7456-fb53-966e-5e1a993e490c";

@XendraTrl(Identifier="664d1218-af59-5175-a784-a309d9112c28")
public static String es_PE_FIELD_Vendor_Customer2_Name="Cliente";

@XendraTrl(Identifier="664d1218-af59-5175-a784-a309d9112c28")
public static String es_PE_FIELD_Vendor_Customer2_Description="Indica si el socio de negocio es un cliente";

@XendraTrl(Identifier="664d1218-af59-5175-a784-a309d9112c28")
public static String es_PE_FIELD_Vendor_Customer2_Help="El cuadro de verificación cliente indica si el socio de negocio es un cliente. Si se seleccionan campos adicionales desplegarán información adicional para definir al cliente.";

@XendraField(AD_Column_ID="IsCustomer",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="664d1218-af59-5175-a784-a309d9112c28")
public static final String FIELDNAME_Vendor_Customer2="664d1218-af59-5175-a784-a309d9112c28";

@XendraTrl(Identifier="5b173855-1b26-5cad-b3a6-d68794d01f4f")
public static String es_PE_FIELD_BusinessPartner_Customer2_Name="Cliente";

@XendraTrl(Identifier="5b173855-1b26-5cad-b3a6-d68794d01f4f")
public static String es_PE_FIELD_BusinessPartner_Customer2_Description="Indica si el socio de negocio es un cliente";

@XendraTrl(Identifier="5b173855-1b26-5cad-b3a6-d68794d01f4f")
public static String es_PE_FIELD_BusinessPartner_Customer2_Help="El cuadro de verificación cliente indica si el socio de negocio es un cliente. Si se seleccionan campos adicionales desplegarán información adicional para definir al cliente.";

@XendraField(AD_Column_ID="IsCustomer",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=270,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5b173855-1b26-5cad-b3a6-d68794d01f4f")
public static final String FIELDNAME_BusinessPartner_Customer2="5b173855-1b26-5cad-b3a6-d68794d01f4f";

@XendraTrl(Identifier="578b82ca-ed65-554e-8edc-55a1c1812683")
public static String es_PE_COLUMN_IsCustomer_Name="Cliente";

@XendraColumn(AD_Element_ID="fd963fb0-599a-df00-cf6e-96a7e7c7f95a",ColumnName="IsCustomer",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="578b82ca-ed65-554e-8edc-55a1c1812683",
Synchronized="2019-08-30 22:21:10.0")
/** Column name IsCustomer */
public static final String COLUMNNAME_IsCustomer = "IsCustomer";
/** Set Discount Printed.
@param IsDiscountPrinted Print Discount on Invoice and Order */
public void setIsDiscountPrinted (boolean IsDiscountPrinted)
{
set_Value (COLUMNNAME_IsDiscountPrinted, Boolean.valueOf(IsDiscountPrinted));
}
/** Get Discount Printed.
@return Print Discount on Invoice and Order */
public boolean isDiscountPrinted() 
{
Object oo = get_Value(COLUMNNAME_IsDiscountPrinted);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="9044f6f3-44e7-92e6-4831-ff2232f246e9")
public static String es_PE_FIELD_BusinessPartnerDimension_DiscountPrinted_Name="Imprimir Descuento";

@XendraTrl(Identifier="9044f6f3-44e7-92e6-4831-ff2232f246e9")
public static String es_PE_FIELD_BusinessPartnerDimension_DiscountPrinted_Description="Imprimir el descuento en la Factura y la orden";

@XendraTrl(Identifier="9044f6f3-44e7-92e6-4831-ff2232f246e9")
public static String es_PE_FIELD_BusinessPartnerDimension_DiscountPrinted_Help="El cuadro de verificación descuento Impreso indica si el descuento será impreso en el documento.";

@XendraField(AD_Column_ID="IsDiscountPrinted",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9044f6f3-44e7-92e6-4831-ff2232f246e9")
public static final String FIELDNAME_BusinessPartnerDimension_DiscountPrinted="9044f6f3-44e7-92e6-4831-ff2232f246e9";

@XendraTrl(Identifier="83e05292-3252-b825-b943-c3480c3fea97")
public static String es_PE_FIELD_BusinessPartner_DiscountPrinted_Name="Imprimir Descuento";

@XendraTrl(Identifier="83e05292-3252-b825-b943-c3480c3fea97")
public static String es_PE_FIELD_BusinessPartner_DiscountPrinted_Description="Imprimir el descuento en la Factura y la orden";

@XendraTrl(Identifier="83e05292-3252-b825-b943-c3480c3fea97")
public static String es_PE_FIELD_BusinessPartner_DiscountPrinted_Help="El cuadro de verificación descuento Impreso indica si el descuento será impreso en el documento.";

@XendraField(AD_Column_ID="IsDiscountPrinted",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="83e05292-3252-b825-b943-c3480c3fea97")
public static final String FIELDNAME_BusinessPartner_DiscountPrinted="83e05292-3252-b825-b943-c3480c3fea97";

@XendraTrl(Identifier="4cf6bdef-0609-1ee9-cff6-676cd421b22c")
public static String es_PE_FIELD_Vendor_DiscountPrinted_Name="Imprimir Descuento";

@XendraTrl(Identifier="4cf6bdef-0609-1ee9-cff6-676cd421b22c")
public static String es_PE_FIELD_Vendor_DiscountPrinted_Description="Imprimir el descuento en la Factura y la orden";

@XendraTrl(Identifier="4cf6bdef-0609-1ee9-cff6-676cd421b22c")
public static String es_PE_FIELD_Vendor_DiscountPrinted_Help="El cuadro de verificación descuento Impreso indica si el descuento será impreso en el documento.";

@XendraField(AD_Column_ID="IsDiscountPrinted",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4cf6bdef-0609-1ee9-cff6-676cd421b22c")
public static final String FIELDNAME_Vendor_DiscountPrinted="4cf6bdef-0609-1ee9-cff6-676cd421b22c";

@XendraTrl(Identifier="54a73d10-932a-dbc0-f930-138218c78953")
public static String es_PE_FIELD_PartnerSelection_DiscountPrinted_Name="Imprimir Descuento";

@XendraTrl(Identifier="54a73d10-932a-dbc0-f930-138218c78953")
public static String es_PE_FIELD_PartnerSelection_DiscountPrinted_Description="Imprimir el descuento en la Factura y la orden";

@XendraTrl(Identifier="54a73d10-932a-dbc0-f930-138218c78953")
public static String es_PE_FIELD_PartnerSelection_DiscountPrinted_Help="El cuadro de verificación descuento Impreso indica si el descuento será impreso en el documento.";

@XendraField(AD_Column_ID="IsDiscountPrinted",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="54a73d10-932a-dbc0-f930-138218c78953")
public static final String FIELDNAME_PartnerSelection_DiscountPrinted="54a73d10-932a-dbc0-f930-138218c78953";

@XendraTrl(Identifier="b0558234-903e-fdc8-0b1a-a026822ae940")
public static String es_PE_FIELD_Employee_DiscountPrinted_Name="Imprimir Descuento";

@XendraTrl(Identifier="b0558234-903e-fdc8-0b1a-a026822ae940")
public static String es_PE_FIELD_Employee_DiscountPrinted_Description="Imprimir el descuento en la Factura y la orden";

@XendraTrl(Identifier="b0558234-903e-fdc8-0b1a-a026822ae940")
public static String es_PE_FIELD_Employee_DiscountPrinted_Help="El cuadro de verificación descuento Impreso indica si el descuento será impreso en el documento.";

@XendraField(AD_Column_ID="IsDiscountPrinted",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b0558234-903e-fdc8-0b1a-a026822ae940")
public static final String FIELDNAME_Employee_DiscountPrinted="b0558234-903e-fdc8-0b1a-a026822ae940";

@XendraTrl(Identifier="5f165828-dd01-82ca-bb63-f40b496d3a54")
public static String es_PE_FIELD_EmployeeVendor_DiscountPrinted_Name="Imprimir Descuento";

@XendraTrl(Identifier="5f165828-dd01-82ca-bb63-f40b496d3a54")
public static String es_PE_FIELD_EmployeeVendor_DiscountPrinted_Description="Imprimir el descuento en la Factura y la orden";

@XendraTrl(Identifier="5f165828-dd01-82ca-bb63-f40b496d3a54")
public static String es_PE_FIELD_EmployeeVendor_DiscountPrinted_Help="El cuadro de verificación descuento Impreso indica si el descuento será impreso en el documento.";

@XendraField(AD_Column_ID="IsDiscountPrinted",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5f165828-dd01-82ca-bb63-f40b496d3a54")
public static final String FIELDNAME_EmployeeVendor_DiscountPrinted="5f165828-dd01-82ca-bb63-f40b496d3a54";

@XendraTrl(Identifier="3375732e-7bc4-943a-2efc-9a92c291de46")
public static String es_PE_FIELD_Customer_DiscountPrinted_Name="Imprimir Descuento";

@XendraTrl(Identifier="3375732e-7bc4-943a-2efc-9a92c291de46")
public static String es_PE_FIELD_Customer_DiscountPrinted_Description="Imprimir el descuento en la Factura y la orden";

@XendraTrl(Identifier="3375732e-7bc4-943a-2efc-9a92c291de46")
public static String es_PE_FIELD_Customer_DiscountPrinted_Help="El cuadro de verificación descuento Impreso indica si el descuento será impreso en el documento.";

@XendraField(AD_Column_ID="IsDiscountPrinted",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3375732e-7bc4-943a-2efc-9a92c291de46")
public static final String FIELDNAME_Customer_DiscountPrinted="3375732e-7bc4-943a-2efc-9a92c291de46";

@XendraTrl(Identifier="29b0b9c1-b548-c7f4-91f0-ee7e4c57ad36")
public static String es_PE_FIELD_AssignedPartners_DiscountPrinted_Name="Imprimir Descuento";

@XendraTrl(Identifier="29b0b9c1-b548-c7f4-91f0-ee7e4c57ad36")
public static String es_PE_FIELD_AssignedPartners_DiscountPrinted_Description="Imprimir el descuento en la Factura y la orden";

@XendraTrl(Identifier="29b0b9c1-b548-c7f4-91f0-ee7e4c57ad36")
public static String es_PE_FIELD_AssignedPartners_DiscountPrinted_Help="El cuadro de verificación descuento Impreso indica si el descuento será impreso en el documento.";

@XendraField(AD_Column_ID="IsDiscountPrinted",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="29b0b9c1-b548-c7f4-91f0-ee7e4c57ad36")
public static final String FIELDNAME_AssignedPartners_DiscountPrinted="29b0b9c1-b548-c7f4-91f0-ee7e4c57ad36";

@XendraTrl(Identifier="cf9e2ae5-8786-208c-0a19-f367078dc6d0")
public static String es_PE_FIELD_Customer_DiscountPrinted2_Name="Imprimir Descuento";

@XendraTrl(Identifier="cf9e2ae5-8786-208c-0a19-f367078dc6d0")
public static String es_PE_FIELD_Customer_DiscountPrinted2_Description="Imprimir el descuento en la Factura y la orden";

@XendraTrl(Identifier="cf9e2ae5-8786-208c-0a19-f367078dc6d0")
public static String es_PE_FIELD_Customer_DiscountPrinted2_Help="El cuadro de verificación descuento Impreso indica si el descuento será impreso en el documento.";

@XendraField(AD_Column_ID="IsDiscountPrinted",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsCustomer@='Y'",DisplayLength=1,IsReadOnly=false,SeqNo=170,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="cf9e2ae5-8786-208c-0a19-f367078dc6d0")
public static final String FIELDNAME_Customer_DiscountPrinted2="cf9e2ae5-8786-208c-0a19-f367078dc6d0";

@XendraTrl(Identifier="a95b61a7-a28d-9e7e-d0f7-6fd034d1069e")
public static String es_PE_FIELD_Vendor_DiscountPrinted2_Name="Imprimir Descuento";

@XendraTrl(Identifier="a95b61a7-a28d-9e7e-d0f7-6fd034d1069e")
public static String es_PE_FIELD_Vendor_DiscountPrinted2_Description="Imprimir el descuento en la Factura y la orden";

@XendraTrl(Identifier="a95b61a7-a28d-9e7e-d0f7-6fd034d1069e")
public static String es_PE_FIELD_Vendor_DiscountPrinted2_Help="El cuadro de verificación descuento Impreso indica si el descuento será impreso en el documento.";

@XendraField(AD_Column_ID="IsDiscountPrinted",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a95b61a7-a28d-9e7e-d0f7-6fd034d1069e")
public static final String FIELDNAME_Vendor_DiscountPrinted2="a95b61a7-a28d-9e7e-d0f7-6fd034d1069e";

@XendraTrl(Identifier="7674dedd-f7a2-ce0d-744f-26fa4f0af012")
public static String es_PE_FIELD_BusinessPartner_DiscountPrinted2_Name="Imprimir Descuento";

@XendraTrl(Identifier="7674dedd-f7a2-ce0d-744f-26fa4f0af012")
public static String es_PE_FIELD_BusinessPartner_DiscountPrinted2_Description="Imprimir el descuento en la Factura y la orden";

@XendraTrl(Identifier="7674dedd-f7a2-ce0d-744f-26fa4f0af012")
public static String es_PE_FIELD_BusinessPartner_DiscountPrinted2_Help="El cuadro de verificación descuento Impreso indica si el descuento será impreso en el documento.";

@XendraField(AD_Column_ID="IsDiscountPrinted",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7674dedd-f7a2-ce0d-744f-26fa4f0af012")
public static final String FIELDNAME_BusinessPartner_DiscountPrinted2="7674dedd-f7a2-ce0d-744f-26fa4f0af012";

@XendraTrl(Identifier="0900558c-3f36-f863-5381-a065e893aa23")
public static String es_PE_COLUMN_IsDiscountPrinted_Name="Imprimir Descuento";

@XendraColumn(AD_Element_ID="b8c6a8c1-0f6b-470e-d3be-4bd106a17b8a",ColumnName="IsDiscountPrinted",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0900558c-3f36-f863-5381-a065e893aa23",
Synchronized="2019-08-30 22:21:10.0")
/** Column name IsDiscountPrinted */
public static final String COLUMNNAME_IsDiscountPrinted = "IsDiscountPrinted";
/** Set Employee.
@param IsEmployee Indicates if  this Business Partner is an employee */
public void setIsEmployee (boolean IsEmployee)
{
set_Value (COLUMNNAME_IsEmployee, Boolean.valueOf(IsEmployee));
}
/** Get Employee.
@return Indicates if  this Business Partner is an employee */
public boolean isEmployee() 
{
Object oo = get_Value(COLUMNNAME_IsEmployee);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="4afb1a39-68d8-aa32-d04d-5fcedbdab733")
public static String es_PE_FIELD_Employee_Employee_Name="Empleado";

@XendraTrl(Identifier="4afb1a39-68d8-aa32-d04d-5fcedbdab733")
public static String es_PE_FIELD_Employee_Employee_Description="Indica si el socio de negocio es un empleado";

@XendraTrl(Identifier="4afb1a39-68d8-aa32-d04d-5fcedbdab733")
public static String es_PE_FIELD_Employee_Employee_Help="El cuadro de verificación empleado indica si este socio de negocio es un empleado. Si se selecciona; se  desplegarán campos adicionales para identificar a este empleado.";

@XendraField(AD_Column_ID="IsEmployee",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4afb1a39-68d8-aa32-d04d-5fcedbdab733")
public static final String FIELDNAME_Employee_Employee="4afb1a39-68d8-aa32-d04d-5fcedbdab733";

@XendraTrl(Identifier="b79ac4f9-7db1-5ee4-d329-b4a0ee19a4e1")
public static String es_PE_FIELD_PartnerSelection_Employee_Name="Empleado";

@XendraTrl(Identifier="b79ac4f9-7db1-5ee4-d329-b4a0ee19a4e1")
public static String es_PE_FIELD_PartnerSelection_Employee_Description="Indica si el socio de negocio es un empleado";

@XendraTrl(Identifier="b79ac4f9-7db1-5ee4-d329-b4a0ee19a4e1")
public static String es_PE_FIELD_PartnerSelection_Employee_Help="El cuadro de verificación empleado indica si este socio de negocio es un empleado. Si se selecciona; se  desplegarán campos adicionales para identificar a este empleado.";

@XendraField(AD_Column_ID="IsEmployee",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b79ac4f9-7db1-5ee4-d329-b4a0ee19a4e1")
public static final String FIELDNAME_PartnerSelection_Employee="b79ac4f9-7db1-5ee4-d329-b4a0ee19a4e1";

@XendraTrl(Identifier="c3befbf3-33b0-7d47-dad8-39bf9bdbc1fb")
public static String es_PE_FIELD_EmployeeVendor_Employee_Name="Empleado";

@XendraTrl(Identifier="c3befbf3-33b0-7d47-dad8-39bf9bdbc1fb")
public static String es_PE_FIELD_EmployeeVendor_Employee_Description="Indica si el socio de negocio es un empleado";

@XendraTrl(Identifier="c3befbf3-33b0-7d47-dad8-39bf9bdbc1fb")
public static String es_PE_FIELD_EmployeeVendor_Employee_Help="El cuadro de verificación empleado indica si este socio de negocio es un empleado. Si se selecciona; se  desplegarán campos adicionales para identificar a este empleado.";

@XendraField(AD_Column_ID="IsEmployee",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c3befbf3-33b0-7d47-dad8-39bf9bdbc1fb")
public static final String FIELDNAME_EmployeeVendor_Employee="c3befbf3-33b0-7d47-dad8-39bf9bdbc1fb";

@XendraTrl(Identifier="d2bf554a-18f8-ce15-891a-2510462a95bf")
public static String es_PE_FIELD_Vendor_Employee_Name="Empleado";

@XendraTrl(Identifier="d2bf554a-18f8-ce15-891a-2510462a95bf")
public static String es_PE_FIELD_Vendor_Employee_Description="Indica si el socio de negocio es un empleado";

@XendraTrl(Identifier="d2bf554a-18f8-ce15-891a-2510462a95bf")
public static String es_PE_FIELD_Vendor_Employee_Help="El cuadro de verificación empleado indica si este socio de negocio es un empleado. Si se selecciona; se  desplegarán campos adicionales para identificar a este empleado.";

@XendraField(AD_Column_ID="IsEmployee",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d2bf554a-18f8-ce15-891a-2510462a95bf")
public static final String FIELDNAME_Vendor_Employee="d2bf554a-18f8-ce15-891a-2510462a95bf";

@XendraTrl(Identifier="b56e09b4-4090-8fa2-60b7-1a5dd3da7d7b")
public static String es_PE_FIELD_Customer_Employee_Name="Empleado";

@XendraTrl(Identifier="b56e09b4-4090-8fa2-60b7-1a5dd3da7d7b")
public static String es_PE_FIELD_Customer_Employee_Description="Indica si el socio de negocio es un empleado";

@XendraTrl(Identifier="b56e09b4-4090-8fa2-60b7-1a5dd3da7d7b")
public static String es_PE_FIELD_Customer_Employee_Help="El cuadro de verificación empleado indica si este socio de negocio es un empleado. Si se selecciona; se  desplegarán campos adicionales para identificar a este empleado.";

@XendraField(AD_Column_ID="IsEmployee",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b56e09b4-4090-8fa2-60b7-1a5dd3da7d7b")
public static final String FIELDNAME_Customer_Employee="b56e09b4-4090-8fa2-60b7-1a5dd3da7d7b";

@XendraTrl(Identifier="3bdf30f4-2a8e-e5e7-ed36-93b4702ffa89")
public static String es_PE_FIELD_AssignedPartners_Employee_Name="Empleado";

@XendraTrl(Identifier="3bdf30f4-2a8e-e5e7-ed36-93b4702ffa89")
public static String es_PE_FIELD_AssignedPartners_Employee_Description="Indica si el socio de negocio es un empleado";

@XendraTrl(Identifier="3bdf30f4-2a8e-e5e7-ed36-93b4702ffa89")
public static String es_PE_FIELD_AssignedPartners_Employee_Help="El cuadro de verificación empleado indica si este socio de negocio es un empleado. Si se selecciona; se  desplegarán campos adicionales para identificar a este empleado.";

@XendraField(AD_Column_ID="IsEmployee",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3bdf30f4-2a8e-e5e7-ed36-93b4702ffa89")
public static final String FIELDNAME_AssignedPartners_Employee="3bdf30f4-2a8e-e5e7-ed36-93b4702ffa89";

@XendraTrl(Identifier="8cbfcdf9-2a1f-1530-f400-0a430007db6b")
public static String es_PE_FIELD_BusinessPartner_Employee_Name="Empleado";

@XendraTrl(Identifier="8cbfcdf9-2a1f-1530-f400-0a430007db6b")
public static String es_PE_FIELD_BusinessPartner_Employee_Description="Indica si el socio de negocio es un empleado";

@XendraTrl(Identifier="8cbfcdf9-2a1f-1530-f400-0a430007db6b")
public static String es_PE_FIELD_BusinessPartner_Employee_Help="El cuadro de verificación empleado indica si este socio de negocio es un empleado. Si se selecciona; se  desplegarán campos adicionales para identificar a este empleado.";

@XendraField(AD_Column_ID="IsEmployee",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8cbfcdf9-2a1f-1530-f400-0a430007db6b")
public static final String FIELDNAME_BusinessPartner_Employee="8cbfcdf9-2a1f-1530-f400-0a430007db6b";

@XendraTrl(Identifier="7a332732-f752-6e51-c1a1-a0d1c3049bff")
public static String es_PE_FIELD_BusinessPartnerDimension_Employee_Name="Empleado";

@XendraTrl(Identifier="7a332732-f752-6e51-c1a1-a0d1c3049bff")
public static String es_PE_FIELD_BusinessPartnerDimension_Employee_Description="Indica si el socio de negocio es un empleado";

@XendraTrl(Identifier="7a332732-f752-6e51-c1a1-a0d1c3049bff")
public static String es_PE_FIELD_BusinessPartnerDimension_Employee_Help="El cuadro de verificación empleado indica si este socio de negocio es un empleado. Si se selecciona; se  desplegarán campos adicionales para identificar a este empleado.";

@XendraField(AD_Column_ID="IsEmployee",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7a332732-f752-6e51-c1a1-a0d1c3049bff")
public static final String FIELDNAME_BusinessPartnerDimension_Employee="7a332732-f752-6e51-c1a1-a0d1c3049bff";

@XendraTrl(Identifier="121da8b5-210e-7163-3f65-e8ff1fd8e1fb")
public static String es_PE_FIELD_Customer_Employee2_Name="Empleado";

@XendraTrl(Identifier="121da8b5-210e-7163-3f65-e8ff1fd8e1fb")
public static String es_PE_FIELD_Customer_Employee2_Description="Indica si el socio de negocio es un empleado";

@XendraTrl(Identifier="121da8b5-210e-7163-3f65-e8ff1fd8e1fb")
public static String es_PE_FIELD_Customer_Employee2_Help="El cuadro de verificación empleado indica si este socio de negocio es un empleado. Si se selecciona; se  desplegarán campos adicionales para identificar a este empleado.";

@XendraField(AD_Column_ID="IsEmployee",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="121da8b5-210e-7163-3f65-e8ff1fd8e1fb")
public static final String FIELDNAME_Customer_Employee2="121da8b5-210e-7163-3f65-e8ff1fd8e1fb";

@XendraTrl(Identifier="c8ecc819-fdb5-04df-ce39-f13ca16c89cc")
public static String es_PE_FIELD_Vendor_Employee2_Name="Empleado";

@XendraTrl(Identifier="c8ecc819-fdb5-04df-ce39-f13ca16c89cc")
public static String es_PE_FIELD_Vendor_Employee2_Description="Indica si el socio de negocio es un empleado";

@XendraTrl(Identifier="c8ecc819-fdb5-04df-ce39-f13ca16c89cc")
public static String es_PE_FIELD_Vendor_Employee2_Help="El cuadro de verificación empleado indica si este socio de negocio es un empleado. Si se selecciona; se  desplegarán campos adicionales para identificar a este empleado.";

@XendraField(AD_Column_ID="IsEmployee",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c8ecc819-fdb5-04df-ce39-f13ca16c89cc")
public static final String FIELDNAME_Vendor_Employee2="c8ecc819-fdb5-04df-ce39-f13ca16c89cc";

@XendraTrl(Identifier="e696662c-ec9d-5a0a-179c-68ccb2a6d3b1")
public static String es_PE_FIELD_BusinessPartner_Employee2_Name="Empleado";

@XendraTrl(Identifier="e696662c-ec9d-5a0a-179c-68ccb2a6d3b1")
public static String es_PE_FIELD_BusinessPartner_Employee2_Description="Indica si el socio de negocio es un empleado";

@XendraTrl(Identifier="e696662c-ec9d-5a0a-179c-68ccb2a6d3b1")
public static String es_PE_FIELD_BusinessPartner_Employee2_Help="El cuadro de verificación empleado indica si este socio de negocio es un empleado. Si se selecciona; se  desplegarán campos adicionales para identificar a este empleado.";

@XendraField(AD_Column_ID="IsEmployee",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="1=2",DisplayLength=1,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e696662c-ec9d-5a0a-179c-68ccb2a6d3b1")
public static final String FIELDNAME_BusinessPartner_Employee2="e696662c-ec9d-5a0a-179c-68ccb2a6d3b1";

@XendraTrl(Identifier="de6881e4-ece9-0d9b-89de-1e8a9cc912c4")
public static String es_PE_COLUMN_IsEmployee_Name="Empleado";

@XendraColumn(AD_Element_ID="84da5ee0-801e-eb21-908e-8114648ff2ec",ColumnName="IsEmployee",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="de6881e4-ece9-0d9b-89de-1e8a9cc912c4",
Synchronized="2019-08-30 22:21:10.0")
/** Column name IsEmployee */
public static final String COLUMNNAME_IsEmployee = "IsEmployee";
/** Set One time transaction.
@param IsOneTime One time transaction */
public void setIsOneTime (boolean IsOneTime)
{
set_Value (COLUMNNAME_IsOneTime, Boolean.valueOf(IsOneTime));
}
/** Get One time transaction.
@return One time transaction */
public boolean isOneTime() 
{
Object oo = get_Value(COLUMNNAME_IsOneTime);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="e4021822-2d89-e4ce-49e3-ec022021a27e")
public static String es_PE_FIELD_AssignedPartners_OneTimeTransaction_Name="Transacción de una vez";

@XendraField(AD_Column_ID="IsOneTime",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e4021822-2d89-e4ce-49e3-ec022021a27e")
public static final String FIELDNAME_AssignedPartners_OneTimeTransaction="e4021822-2d89-e4ce-49e3-ec022021a27e";

@XendraTrl(Identifier="46c5a09e-dbb2-3a5b-2b5e-4cb9d01065be")
public static String es_PE_FIELD_BusinessPartner_OneTimeTransaction_Name="Transacción de una vez";

@XendraField(AD_Column_ID="IsOneTime",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="46c5a09e-dbb2-3a5b-2b5e-4cb9d01065be")
public static final String FIELDNAME_BusinessPartner_OneTimeTransaction="46c5a09e-dbb2-3a5b-2b5e-4cb9d01065be";

@XendraTrl(Identifier="26940241-be4c-a095-5a86-24211e15f284")
public static String es_PE_FIELD_PartnerSelection_OneTimeTransaction_Name="Transacción de una vez";

@XendraField(AD_Column_ID="IsOneTime",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="26940241-be4c-a095-5a86-24211e15f284")
public static final String FIELDNAME_PartnerSelection_OneTimeTransaction="26940241-be4c-a095-5a86-24211e15f284";

@XendraTrl(Identifier="07004b60-990f-e014-76e3-6985c1d63882")
public static String es_PE_FIELD_EmployeeVendor_OneTimeTransaction_Name="Transacción de una vez";

@XendraField(AD_Column_ID="IsOneTime",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="07004b60-990f-e014-76e3-6985c1d63882")
public static final String FIELDNAME_EmployeeVendor_OneTimeTransaction="07004b60-990f-e014-76e3-6985c1d63882";

@XendraTrl(Identifier="dc5d4c18-0301-1ac6-d05a-1e9f578fe6b6")
public static String es_PE_FIELD_Employee_OneTimeTransaction_Name="Transacción de una vez";

@XendraField(AD_Column_ID="IsOneTime",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dc5d4c18-0301-1ac6-d05a-1e9f578fe6b6")
public static final String FIELDNAME_Employee_OneTimeTransaction="dc5d4c18-0301-1ac6-d05a-1e9f578fe6b6";

@XendraTrl(Identifier="544d4cca-0622-840c-7383-40acf13742f2")
public static String es_PE_FIELD_Customer_OneTimeTransaction_Name="Transacción de una vez";

@XendraField(AD_Column_ID="IsOneTime",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="544d4cca-0622-840c-7383-40acf13742f2")
public static final String FIELDNAME_Customer_OneTimeTransaction="544d4cca-0622-840c-7383-40acf13742f2";

@XendraTrl(Identifier="21daeffb-209a-6832-5485-ec9f8ffce591")
public static String es_PE_FIELD_BusinessPartner_OneTimeTransaction2_Name="Transacción de una vez";

@XendraField(AD_Column_ID="IsOneTime",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="21daeffb-209a-6832-5485-ec9f8ffce591")
public static final String FIELDNAME_BusinessPartner_OneTimeTransaction2="21daeffb-209a-6832-5485-ec9f8ffce591";

@XendraTrl(Identifier="15e7987e-318f-ed93-f5ab-b97462396311")
public static String es_PE_FIELD_Vendor_OneTimeTransaction_Name="Transacción de una vez";

@XendraField(AD_Column_ID="IsOneTime",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="15e7987e-318f-ed93-f5ab-b97462396311")
public static final String FIELDNAME_Vendor_OneTimeTransaction="15e7987e-318f-ed93-f5ab-b97462396311";

@XendraTrl(Identifier="53e4527b-6b7f-d530-bf96-32c847e36ab3")
public static String es_PE_FIELD_Vendor_OneTimeTransaction2_Name="Transacción de una vez";

@XendraField(AD_Column_ID="IsOneTime",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="53e4527b-6b7f-d530-bf96-32c847e36ab3")
public static final String FIELDNAME_Vendor_OneTimeTransaction2="53e4527b-6b7f-d530-bf96-32c847e36ab3";

@XendraTrl(Identifier="f06d1ce9-460a-1676-cc89-1057de0d8403")
public static String es_PE_FIELD_Customer_OneTimeTransaction2_Name="Transacción de una vez";

@XendraField(AD_Column_ID="IsOneTime",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f06d1ce9-460a-1676-cc89-1057de0d8403")
public static final String FIELDNAME_Customer_OneTimeTransaction2="f06d1ce9-460a-1676-cc89-1057de0d8403";

@XendraTrl(Identifier="d911c200-5ec8-32d4-117e-ebd7dc541c71")
public static String es_PE_FIELD_BusinessPartnerDimension_OneTimeTransaction_Name="Transacción de una vez";

@XendraField(AD_Column_ID="IsOneTime",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d911c200-5ec8-32d4-117e-ebd7dc541c71")
public static final String FIELDNAME_BusinessPartnerDimension_OneTimeTransaction="d911c200-5ec8-32d4-117e-ebd7dc541c71";

@XendraTrl(Identifier="6245c785-61fe-d1ce-a641-588b5a9d3c77")
public static String es_PE_COLUMN_IsOneTime_Name="Transacción de una vez";

@XendraColumn(AD_Element_ID="c7e76d6f-f996-e1ff-8d63-3d0138725566",ColumnName="IsOneTime",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6245c785-61fe-d1ce-a641-588b5a9d3c77",
Synchronized="2019-08-30 22:21:10.0")
/** Column name IsOneTime */
public static final String COLUMNNAME_IsOneTime = "IsOneTime";
/** Set Prospect.
@param IsProspect Indicates this is a Prospect */
public void setIsProspect (boolean IsProspect)
{
set_Value (COLUMNNAME_IsProspect, Boolean.valueOf(IsProspect));
}
/** Get Prospect.
@return Indicates this is a Prospect */
public boolean isProspect() 
{
Object oo = get_Value(COLUMNNAME_IsProspect);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="7be731a3-f063-049d-951e-dfc9648959ea")
public static String es_PE_FIELD_PartnerSelection_Prospect_Name="Prospecto Activo";

@XendraTrl(Identifier="7be731a3-f063-049d-951e-dfc9648959ea")
public static String es_PE_FIELD_PartnerSelection_Prospect_Description="Indica un prospecto en oposición a un cliente activo.";

@XendraTrl(Identifier="7be731a3-f063-049d-951e-dfc9648959ea")
public static String es_PE_FIELD_PartnerSelection_Prospect_Help="El cuadro de verificación prospecto indica una entidad que es un prospecto activo pero no es aún un cliente.";

@XendraField(AD_Column_ID="IsProspect",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7be731a3-f063-049d-951e-dfc9648959ea")
public static final String FIELDNAME_PartnerSelection_Prospect="7be731a3-f063-049d-951e-dfc9648959ea";

@XendraTrl(Identifier="b9b79931-f0db-61fc-2231-91b74120ad5d")
public static String es_PE_FIELD_Employee_Prospect_Name="Prospecto Activo";

@XendraTrl(Identifier="b9b79931-f0db-61fc-2231-91b74120ad5d")
public static String es_PE_FIELD_Employee_Prospect_Description="Indica un prospecto en oposición a un cliente activo.";

@XendraTrl(Identifier="b9b79931-f0db-61fc-2231-91b74120ad5d")
public static String es_PE_FIELD_Employee_Prospect_Help="El cuadro de verificación prospecto indica una entidad que es un prospecto activo pero no es aún un cliente.";

@XendraField(AD_Column_ID="IsProspect",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b9b79931-f0db-61fc-2231-91b74120ad5d")
public static final String FIELDNAME_Employee_Prospect="b9b79931-f0db-61fc-2231-91b74120ad5d";

@XendraTrl(Identifier="ebb42232-dc16-730d-cf3c-d084b9f25342")
public static String es_PE_FIELD_BusinessPartnerDimension_Prospect_Name="Prospecto Activo";

@XendraTrl(Identifier="ebb42232-dc16-730d-cf3c-d084b9f25342")
public static String es_PE_FIELD_BusinessPartnerDimension_Prospect_Description="Indica un prospecto en oposición a un cliente activo.";

@XendraTrl(Identifier="ebb42232-dc16-730d-cf3c-d084b9f25342")
public static String es_PE_FIELD_BusinessPartnerDimension_Prospect_Help="El cuadro de verificación prospecto indica una entidad que es un prospecto activo pero no es aún un cliente.";

@XendraField(AD_Column_ID="IsProspect",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ebb42232-dc16-730d-cf3c-d084b9f25342")
public static final String FIELDNAME_BusinessPartnerDimension_Prospect="ebb42232-dc16-730d-cf3c-d084b9f25342";

@XendraTrl(Identifier="db7a2cc0-4873-859f-3a96-cc0de88b7d28")
public static String es_PE_FIELD_AssignedPartners_Prospect_Name="Prospecto Activo";

@XendraTrl(Identifier="db7a2cc0-4873-859f-3a96-cc0de88b7d28")
public static String es_PE_FIELD_AssignedPartners_Prospect_Description="Indica un prospecto en oposición a un cliente activo.";

@XendraTrl(Identifier="db7a2cc0-4873-859f-3a96-cc0de88b7d28")
public static String es_PE_FIELD_AssignedPartners_Prospect_Help="El cuadro de verificación prospecto indica una entidad que es un prospecto activo pero no es aún un cliente.";

@XendraField(AD_Column_ID="IsProspect",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="db7a2cc0-4873-859f-3a96-cc0de88b7d28")
public static final String FIELDNAME_AssignedPartners_Prospect="db7a2cc0-4873-859f-3a96-cc0de88b7d28";

@XendraTrl(Identifier="86b1c374-a8ee-83dc-b51c-829d6ca938ef")
public static String es_PE_FIELD_EmployeeVendor_Prospect_Name="Prospecto Activo";

@XendraTrl(Identifier="86b1c374-a8ee-83dc-b51c-829d6ca938ef")
public static String es_PE_FIELD_EmployeeVendor_Prospect_Description="Indica un prospecto en oposición a un cliente activo.";

@XendraTrl(Identifier="86b1c374-a8ee-83dc-b51c-829d6ca938ef")
public static String es_PE_FIELD_EmployeeVendor_Prospect_Help="El cuadro de verificación prospecto indica una entidad que es un prospecto activo pero no es aún un cliente.";

@XendraField(AD_Column_ID="IsProspect",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="86b1c374-a8ee-83dc-b51c-829d6ca938ef")
public static final String FIELDNAME_EmployeeVendor_Prospect="86b1c374-a8ee-83dc-b51c-829d6ca938ef";

@XendraTrl(Identifier="2aa9a7fb-25c7-7afa-4bb3-73a3cbb0a9ac")
public static String es_PE_FIELD_Vendor_Prospect_Name="Prospecto Activo";

@XendraTrl(Identifier="2aa9a7fb-25c7-7afa-4bb3-73a3cbb0a9ac")
public static String es_PE_FIELD_Vendor_Prospect_Description="Indica un prospecto en oposición a un cliente activo.";

@XendraTrl(Identifier="2aa9a7fb-25c7-7afa-4bb3-73a3cbb0a9ac")
public static String es_PE_FIELD_Vendor_Prospect_Help="El cuadro de verificación prospecto indica una entidad que es un prospecto activo pero no es aún un cliente.";

@XendraField(AD_Column_ID="IsProspect",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2aa9a7fb-25c7-7afa-4bb3-73a3cbb0a9ac")
public static final String FIELDNAME_Vendor_Prospect="2aa9a7fb-25c7-7afa-4bb3-73a3cbb0a9ac";

@XendraTrl(Identifier="e7d6893f-1b2e-4be6-1030-3136b0e10aae")
public static String es_PE_FIELD_Customer_Prospect_Name="Prospecto Activo";

@XendraTrl(Identifier="e7d6893f-1b2e-4be6-1030-3136b0e10aae")
public static String es_PE_FIELD_Customer_Prospect_Description="Indica un prospecto en oposición a un cliente activo.";

@XendraTrl(Identifier="e7d6893f-1b2e-4be6-1030-3136b0e10aae")
public static String es_PE_FIELD_Customer_Prospect_Help="El cuadro de verificación prospecto indica una entidad que es un prospecto activo pero no es aún un cliente.";

@XendraField(AD_Column_ID="IsProspect",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e7d6893f-1b2e-4be6-1030-3136b0e10aae")
public static final String FIELDNAME_Customer_Prospect="e7d6893f-1b2e-4be6-1030-3136b0e10aae";

@XendraTrl(Identifier="50ba8155-e71e-6d03-d161-3ea650a7e313")
public static String es_PE_FIELD_BusinessPartner_Prospect_Name="Prospecto Activo";

@XendraTrl(Identifier="50ba8155-e71e-6d03-d161-3ea650a7e313")
public static String es_PE_FIELD_BusinessPartner_Prospect_Description="Indica un prospecto en oposición a un cliente activo.";

@XendraTrl(Identifier="50ba8155-e71e-6d03-d161-3ea650a7e313")
public static String es_PE_FIELD_BusinessPartner_Prospect_Help="El cuadro de verificación prospecto indica una entidad que es un prospecto activo pero no es aún un cliente.";

@XendraField(AD_Column_ID="IsProspect",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="50ba8155-e71e-6d03-d161-3ea650a7e313")
public static final String FIELDNAME_BusinessPartner_Prospect="50ba8155-e71e-6d03-d161-3ea650a7e313";

@XendraTrl(Identifier="057e9c84-aaa3-2b01-0a68-090678fe60f9")
public static String es_PE_FIELD_Vendor_Prospect2_Name="Prospecto Activo";

@XendraTrl(Identifier="057e9c84-aaa3-2b01-0a68-090678fe60f9")
public static String es_PE_FIELD_Vendor_Prospect2_Description="Indica un prospecto en oposición a un cliente activo.";

@XendraTrl(Identifier="057e9c84-aaa3-2b01-0a68-090678fe60f9")
public static String es_PE_FIELD_Vendor_Prospect2_Help="El cuadro de verificación prospecto indica una entidad que es un prospecto activo pero no es aún un cliente.";

@XendraField(AD_Column_ID="IsProspect",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="057e9c84-aaa3-2b01-0a68-090678fe60f9")
public static final String FIELDNAME_Vendor_Prospect2="057e9c84-aaa3-2b01-0a68-090678fe60f9";

@XendraTrl(Identifier="d5c473b2-a452-5e5e-90b1-54eba8d7fbd0")
public static String es_PE_FIELD_Customer_Prospect2_Name="Prospecto Activo";

@XendraTrl(Identifier="d5c473b2-a452-5e5e-90b1-54eba8d7fbd0")
public static String es_PE_FIELD_Customer_Prospect2_Description="Indica un prospecto en oposición a un cliente activo.";

@XendraTrl(Identifier="d5c473b2-a452-5e5e-90b1-54eba8d7fbd0")
public static String es_PE_FIELD_Customer_Prospect2_Help="El cuadro de verificación prospecto indica una entidad que es un prospecto activo pero no es aún un cliente.";

@XendraField(AD_Column_ID="IsProspect",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d5c473b2-a452-5e5e-90b1-54eba8d7fbd0")
public static final String FIELDNAME_Customer_Prospect2="d5c473b2-a452-5e5e-90b1-54eba8d7fbd0";

@XendraTrl(Identifier="65e6cf07-cb7d-0ddd-9037-c34c7ea835af")
public static String es_PE_FIELD_BusinessPartner_Prospect2_Name="Prospecto Activo";

@XendraTrl(Identifier="65e6cf07-cb7d-0ddd-9037-c34c7ea835af")
public static String es_PE_FIELD_BusinessPartner_Prospect2_Description="Indica un prospecto en oposición a un cliente activo.";

@XendraTrl(Identifier="65e6cf07-cb7d-0ddd-9037-c34c7ea835af")
public static String es_PE_FIELD_BusinessPartner_Prospect2_Help="El cuadro de verificación prospecto indica una entidad que es un prospecto activo pero no es aún un cliente.";

@XendraField(AD_Column_ID="IsProspect",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsEmployee@=N",DisplayLength=1,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="65e6cf07-cb7d-0ddd-9037-c34c7ea835af")
public static final String FIELDNAME_BusinessPartner_Prospect2="65e6cf07-cb7d-0ddd-9037-c34c7ea835af";

@XendraTrl(Identifier="292f20a8-2269-145b-a229-b08a919d4fad")
public static String es_PE_COLUMN_IsProspect_Name="Prospecto Activo";

@XendraColumn(AD_Element_ID="d8300bf0-1a1d-ddcf-2bd4-b4fc59de4323",ColumnName="IsProspect",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="292f20a8-2269-145b-a229-b08a919d4fad",
Synchronized="2019-08-30 22:21:10.0")
/** Column name IsProspect */
public static final String COLUMNNAME_IsProspect = "IsProspect";
/** Set IsRetention.
@param IsRetention IsRetention */
public void setIsRetention (boolean IsRetention)
{
set_Value (COLUMNNAME_IsRetention, Boolean.valueOf(IsRetention));
}
/** Get IsRetention.
@return IsRetention */
public boolean isRetention() 
{
Object oo = get_Value(COLUMNNAME_IsRetention);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="d490ab3a-7655-d371-88fa-5c119064110f")
public static String es_PE_FIELD_BusinessPartner_IsRetention_Name="Agente de Retención";

@XendraField(AD_Column_ID="IsRetention",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=250,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d490ab3a-7655-d371-88fa-5c119064110f")
public static final String FIELDNAME_BusinessPartner_IsRetention="d490ab3a-7655-d371-88fa-5c119064110f";

@XendraTrl(Identifier="3f7ea9a9-3622-6080-a1d3-00a18ef0f63e")
public static String es_PE_COLUMN_IsRetention_Name="isretention";

@XendraColumn(AD_Element_ID="01d8c51a-7406-718a-2bee-ae906aadb51b",ColumnName="IsRetention",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3f7ea9a9-3622-6080-a1d3-00a18ef0f63e",
Synchronized="2019-08-30 22:21:10.0")
/** Column name IsRetention */
public static final String COLUMNNAME_IsRetention = "IsRetention";
/** Set Sales Representative.
@param IsSalesRep Indicates if  the business partner is a sales representative or company agent */
public void setIsSalesRep (boolean IsSalesRep)
{
set_Value (COLUMNNAME_IsSalesRep, Boolean.valueOf(IsSalesRep));
}
/** Get Sales Representative.
@return Indicates if  the business partner is a sales representative or company agent */
public boolean isSalesRep() 
{
Object oo = get_Value(COLUMNNAME_IsSalesRep);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="0c8da4fc-55bc-20a0-53de-d76ea01e0ce9")
public static String es_PE_FIELD_Employee_SalesRepresentative_Name="Agente Cía";

@XendraTrl(Identifier="0c8da4fc-55bc-20a0-53de-d76ea01e0ce9")
public static String es_PE_FIELD_Employee_SalesRepresentative_Description="Indica si el empleado es un representante de ventas";

@XendraTrl(Identifier="0c8da4fc-55bc-20a0-53de-d76ea01e0ce9")
public static String es_PE_FIELD_Employee_SalesRepresentative_Help="El cuadro de verificación Agente Cía indica si este empleado es también un representante de ventas.";

@XendraField(AD_Column_ID="IsSalesRep",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0c8da4fc-55bc-20a0-53de-d76ea01e0ce9")
public static final String FIELDNAME_Employee_SalesRepresentative="0c8da4fc-55bc-20a0-53de-d76ea01e0ce9";

@XendraTrl(Identifier="743c1e77-fad9-dae6-19b4-08ab17ec0974")
public static String es_PE_FIELD_EmployeeVendor_CompanyAgent_Name="Agente";

@XendraTrl(Identifier="743c1e77-fad9-dae6-19b4-08ab17ec0974")
public static String es_PE_FIELD_EmployeeVendor_CompanyAgent_Description="Persona responsable de documentos.";

@XendraField(AD_Column_ID="IsSalesRep",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="743c1e77-fad9-dae6-19b4-08ab17ec0974")
public static final String FIELDNAME_EmployeeVendor_CompanyAgent="743c1e77-fad9-dae6-19b4-08ab17ec0974";

@XendraTrl(Identifier="21478b50-0b91-5a90-973f-32bd033cafef")
public static String es_PE_FIELD_PartnerSelection_SalesRepresentative_Name="Agente Cía";

@XendraTrl(Identifier="21478b50-0b91-5a90-973f-32bd033cafef")
public static String es_PE_FIELD_PartnerSelection_SalesRepresentative_Description="Indica si el empleado es un representante de ventas";

@XendraTrl(Identifier="21478b50-0b91-5a90-973f-32bd033cafef")
public static String es_PE_FIELD_PartnerSelection_SalesRepresentative_Help="El cuadro de verificación Agente Cía indica si este empleado es también un representante de ventas.";

@XendraField(AD_Column_ID="IsSalesRep",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="21478b50-0b91-5a90-973f-32bd033cafef")
public static final String FIELDNAME_PartnerSelection_SalesRepresentative="21478b50-0b91-5a90-973f-32bd033cafef";

@XendraTrl(Identifier="03f43bcf-74f7-99d3-0567-a471c96b12cd")
public static String es_PE_FIELD_Customer_SalesRepresentative_Name="Agente Cía";

@XendraTrl(Identifier="03f43bcf-74f7-99d3-0567-a471c96b12cd")
public static String es_PE_FIELD_Customer_SalesRepresentative_Description="Indica si el empleado es un representante de ventas";

@XendraTrl(Identifier="03f43bcf-74f7-99d3-0567-a471c96b12cd")
public static String es_PE_FIELD_Customer_SalesRepresentative_Help="El cuadro de verificación Agente Cía indica si este empleado es también un representante de ventas.";

@XendraField(AD_Column_ID="IsSalesRep",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="03f43bcf-74f7-99d3-0567-a471c96b12cd")
public static final String FIELDNAME_Customer_SalesRepresentative="03f43bcf-74f7-99d3-0567-a471c96b12cd";

@XendraTrl(Identifier="9ec627ff-3233-2059-be95-ffcaec28e400")
public static String es_PE_FIELD_Vendor_CompanyAgent_Name="Agente";

@XendraTrl(Identifier="9ec627ff-3233-2059-be95-ffcaec28e400")
public static String es_PE_FIELD_Vendor_CompanyAgent_Description="Persona responsable de documentos.";

@XendraField(AD_Column_ID="IsSalesRep",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9ec627ff-3233-2059-be95-ffcaec28e400")
public static final String FIELDNAME_Vendor_CompanyAgent="9ec627ff-3233-2059-be95-ffcaec28e400";

@XendraTrl(Identifier="7da249ce-109f-9a61-3dd0-04f8d8edaa60")
public static String es_PE_FIELD_Customer_SalesRepresentative2_Name="Agente Cía";

@XendraTrl(Identifier="7da249ce-109f-9a61-3dd0-04f8d8edaa60")
public static String es_PE_FIELD_Customer_SalesRepresentative2_Description="Indica si el empleado es un representante de ventas";

@XendraTrl(Identifier="7da249ce-109f-9a61-3dd0-04f8d8edaa60")
public static String es_PE_FIELD_Customer_SalesRepresentative2_Help="El cuadro de verificación Agente Cía indica si este empleado es también un representante de ventas.";

@XendraField(AD_Column_ID="IsSalesRep",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7da249ce-109f-9a61-3dd0-04f8d8edaa60")
public static final String FIELDNAME_Customer_SalesRepresentative2="7da249ce-109f-9a61-3dd0-04f8d8edaa60";

@XendraTrl(Identifier="e63341ef-ea1d-ed0e-7950-89ba571bde16")
public static String es_PE_FIELD_BusinessPartnerDimension_SalesRepresentative_Name="Agente Cía";

@XendraTrl(Identifier="e63341ef-ea1d-ed0e-7950-89ba571bde16")
public static String es_PE_FIELD_BusinessPartnerDimension_SalesRepresentative_Description="Indica si el empleado es un representante de ventas";

@XendraTrl(Identifier="e63341ef-ea1d-ed0e-7950-89ba571bde16")
public static String es_PE_FIELD_BusinessPartnerDimension_SalesRepresentative_Help="El cuadro de verificación Agente Cía indica si este empleado es también un representante de ventas.";

@XendraField(AD_Column_ID="IsSalesRep",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e63341ef-ea1d-ed0e-7950-89ba571bde16")
public static final String FIELDNAME_BusinessPartnerDimension_SalesRepresentative="e63341ef-ea1d-ed0e-7950-89ba571bde16";

@XendraTrl(Identifier="5167befa-e88d-b6bf-0492-18850674a0d6")
public static String es_PE_FIELD_BusinessPartner_SalesRepresentative_Name="Agente Cía";

@XendraTrl(Identifier="5167befa-e88d-b6bf-0492-18850674a0d6")
public static String es_PE_FIELD_BusinessPartner_SalesRepresentative_Description="Indica si el empleado es un representante de ventas";

@XendraTrl(Identifier="5167befa-e88d-b6bf-0492-18850674a0d6")
public static String es_PE_FIELD_BusinessPartner_SalesRepresentative_Help="El cuadro de verificación Agente Cía indica si este empleado es también un representante de ventas.";

@XendraField(AD_Column_ID="IsSalesRep",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5167befa-e88d-b6bf-0492-18850674a0d6")
public static final String FIELDNAME_BusinessPartner_SalesRepresentative="5167befa-e88d-b6bf-0492-18850674a0d6";

@XendraTrl(Identifier="af634990-1a9f-56f5-a05c-bf57be69cc26")
public static String es_PE_FIELD_AssignedPartners_SalesRepresentative_Name="Agente Cía";

@XendraTrl(Identifier="af634990-1a9f-56f5-a05c-bf57be69cc26")
public static String es_PE_FIELD_AssignedPartners_SalesRepresentative_Description="Indica si el empleado es un representante de ventas";

@XendraTrl(Identifier="af634990-1a9f-56f5-a05c-bf57be69cc26")
public static String es_PE_FIELD_AssignedPartners_SalesRepresentative_Help="El cuadro de verificación Agente Cía indica si este empleado es también un representante de ventas.";

@XendraField(AD_Column_ID="IsSalesRep",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="af634990-1a9f-56f5-a05c-bf57be69cc26")
public static final String FIELDNAME_AssignedPartners_SalesRepresentative="af634990-1a9f-56f5-a05c-bf57be69cc26";

@XendraTrl(Identifier="1a2a8aff-ecfe-d9b7-d3e5-b26ad0fa2b41")
public static String es_PE_FIELD_Vendor_SalesRepresentative_Name="Agente Cía";

@XendraTrl(Identifier="1a2a8aff-ecfe-d9b7-d3e5-b26ad0fa2b41")
public static String es_PE_FIELD_Vendor_SalesRepresentative_Description="Indica si el empleado es un representante de ventas";

@XendraTrl(Identifier="1a2a8aff-ecfe-d9b7-d3e5-b26ad0fa2b41")
public static String es_PE_FIELD_Vendor_SalesRepresentative_Help="El cuadro de verificación Agente Cía indica si este empleado es también un representante de ventas.";

@XendraField(AD_Column_ID="IsSalesRep",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1a2a8aff-ecfe-d9b7-d3e5-b26ad0fa2b41")
public static final String FIELDNAME_Vendor_SalesRepresentative="1a2a8aff-ecfe-d9b7-d3e5-b26ad0fa2b41";

@XendraTrl(Identifier="1c0dea4a-fdf7-7119-3d51-589e0a55daa6")
public static String es_PE_FIELD_BusinessPartner_SalesRepresentative2_Name="Agente Cía";

@XendraTrl(Identifier="1c0dea4a-fdf7-7119-3d51-589e0a55daa6")
public static String es_PE_FIELD_BusinessPartner_SalesRepresentative2_Description="Indica si el empleado es un representante de ventas";

@XendraTrl(Identifier="1c0dea4a-fdf7-7119-3d51-589e0a55daa6")
public static String es_PE_FIELD_BusinessPartner_SalesRepresentative2_Help="El cuadro de verificación Agente Cía indica si este empleado es también un representante de ventas.";

@XendraField(AD_Column_ID="IsSalesRep",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=280,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1c0dea4a-fdf7-7119-3d51-589e0a55daa6")
public static final String FIELDNAME_BusinessPartner_SalesRepresentative2="1c0dea4a-fdf7-7119-3d51-589e0a55daa6";

@XendraTrl(Identifier="fab197d8-c2f2-2a9f-2eb1-0d9c2bbcd5b1")
public static String es_PE_COLUMN_IsSalesRep_Name="Agente Cía";

@XendraColumn(AD_Element_ID="52b2b164-2824-17c4-3796-8ea71ec9f27c",ColumnName="IsSalesRep",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fab197d8-c2f2-2a9f-2eb1-0d9c2bbcd5b1",
Synchronized="2019-08-30 22:21:10.0")
/** Column name IsSalesRep */
public static final String COLUMNNAME_IsSalesRep = "IsSalesRep";
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

@XendraTrl(Identifier="9fd82fcf-ef3a-7537-edf9-b30529bde659")
public static String es_PE_FIELD_EmployeeVendor_SummaryLevel_Name="Entidad Acumulada";

@XendraTrl(Identifier="9fd82fcf-ef3a-7537-edf9-b30529bde659")
public static String es_PE_FIELD_EmployeeVendor_SummaryLevel_Description="Esta es una entidad sumaria";

@XendraTrl(Identifier="9fd82fcf-ef3a-7537-edf9-b30529bde659")
public static String es_PE_FIELD_EmployeeVendor_SummaryLevel_Help="Una entidad sumaria representa una rama en un árbol mas bien que un nodo final. Las entidades sumarias son usadas para reportar y no tienen valores propios";

@XendraField(AD_Column_ID="IsSummary",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9fd82fcf-ef3a-7537-edf9-b30529bde659")
public static final String FIELDNAME_EmployeeVendor_SummaryLevel="9fd82fcf-ef3a-7537-edf9-b30529bde659";

@XendraTrl(Identifier="bdbfd2cb-9a0a-606f-cdf1-d301d569df15")
public static String es_PE_FIELD_PartnerSelection_SummaryLevel_Name="Entidad Acumulada";

@XendraTrl(Identifier="bdbfd2cb-9a0a-606f-cdf1-d301d569df15")
public static String es_PE_FIELD_PartnerSelection_SummaryLevel_Description="Esta es una entidad sumaria";

@XendraTrl(Identifier="bdbfd2cb-9a0a-606f-cdf1-d301d569df15")
public static String es_PE_FIELD_PartnerSelection_SummaryLevel_Help="Una entidad sumaria representa una rama en un árbol mas bien que un nodo final. Las entidades sumarias son usadas para reportar y no tienen valores propios";

@XendraField(AD_Column_ID="IsSummary",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bdbfd2cb-9a0a-606f-cdf1-d301d569df15")
public static final String FIELDNAME_PartnerSelection_SummaryLevel="bdbfd2cb-9a0a-606f-cdf1-d301d569df15";

@XendraTrl(Identifier="6b9e1a07-64b0-b98c-e6ef-8591c2b7f1f7")
public static String es_PE_FIELD_BusinessPartnerDimension_SummaryLevel_Name="Entidad Acumulada";

@XendraTrl(Identifier="6b9e1a07-64b0-b98c-e6ef-8591c2b7f1f7")
public static String es_PE_FIELD_BusinessPartnerDimension_SummaryLevel_Description="Esta es una entidad sumaria";

@XendraTrl(Identifier="6b9e1a07-64b0-b98c-e6ef-8591c2b7f1f7")
public static String es_PE_FIELD_BusinessPartnerDimension_SummaryLevel_Help="Una entidad sumaria representa una rama en un árbol mas bien que un nodo final. Las entidades sumarias son usadas para reportar y no tienen valores propios";

@XendraField(AD_Column_ID="IsSummary",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6b9e1a07-64b0-b98c-e6ef-8591c2b7f1f7")
public static final String FIELDNAME_BusinessPartnerDimension_SummaryLevel="6b9e1a07-64b0-b98c-e6ef-8591c2b7f1f7";

@XendraTrl(Identifier="74093a50-5107-4932-666a-eb790132527b")
public static String es_PE_FIELD_Vendor_SummaryLevel_Name="Entidad Acumulada";

@XendraTrl(Identifier="74093a50-5107-4932-666a-eb790132527b")
public static String es_PE_FIELD_Vendor_SummaryLevel_Description="Esta es una entidad sumaria";

@XendraTrl(Identifier="74093a50-5107-4932-666a-eb790132527b")
public static String es_PE_FIELD_Vendor_SummaryLevel_Help="Una entidad sumaria representa una rama en un árbol mas bien que un nodo final. Las entidades sumarias son usadas para reportar y no tienen valores propios";

@XendraField(AD_Column_ID="IsSummary",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="74093a50-5107-4932-666a-eb790132527b")
public static final String FIELDNAME_Vendor_SummaryLevel="74093a50-5107-4932-666a-eb790132527b";

@XendraTrl(Identifier="ed849e10-281c-a851-f0d2-41efa02010bb")
public static String es_PE_FIELD_Vendor_SummaryLevel2_Name="Entidad Acumulada";

@XendraTrl(Identifier="ed849e10-281c-a851-f0d2-41efa02010bb")
public static String es_PE_FIELD_Vendor_SummaryLevel2_Description="Esta es una entidad sumaria";

@XendraTrl(Identifier="ed849e10-281c-a851-f0d2-41efa02010bb")
public static String es_PE_FIELD_Vendor_SummaryLevel2_Help="Una entidad sumaria representa una rama en un árbol mas bien que un nodo final. Las entidades sumarias son usadas para reportar y no tienen valores propios";

@XendraField(AD_Column_ID="IsSummary",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ed849e10-281c-a851-f0d2-41efa02010bb")
public static final String FIELDNAME_Vendor_SummaryLevel2="ed849e10-281c-a851-f0d2-41efa02010bb";

@XendraTrl(Identifier="ed73a189-7f80-fe50-5ba7-da448158638e")
public static String es_PE_FIELD_BusinessPartner_SummaryLevel_Name="Entidad Acumulada";

@XendraTrl(Identifier="ed73a189-7f80-fe50-5ba7-da448158638e")
public static String es_PE_FIELD_BusinessPartner_SummaryLevel_Description="Esta es una entidad sumaria";

@XendraTrl(Identifier="ed73a189-7f80-fe50-5ba7-da448158638e")
public static String es_PE_FIELD_BusinessPartner_SummaryLevel_Help="Una entidad sumaria representa una rama en un árbol mas bien que un nodo final. Las entidades sumarias son usadas para reportar y no tienen valores propios";

@XendraField(AD_Column_ID="IsSummary",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ed73a189-7f80-fe50-5ba7-da448158638e")
public static final String FIELDNAME_BusinessPartner_SummaryLevel="ed73a189-7f80-fe50-5ba7-da448158638e";

@XendraTrl(Identifier="00d87fa7-db92-05ec-339f-97c9140f2fab")
public static String es_PE_FIELD_Customer_SummaryLevel_Name="Entidad Acumulada";

@XendraTrl(Identifier="00d87fa7-db92-05ec-339f-97c9140f2fab")
public static String es_PE_FIELD_Customer_SummaryLevel_Description="Esta es una entidad sumaria";

@XendraTrl(Identifier="00d87fa7-db92-05ec-339f-97c9140f2fab")
public static String es_PE_FIELD_Customer_SummaryLevel_Help="Una entidad sumaria representa una rama en un árbol mas bien que un nodo final. Las entidades sumarias son usadas para reportar y no tienen valores propios";

@XendraField(AD_Column_ID="IsSummary",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="00d87fa7-db92-05ec-339f-97c9140f2fab")
public static final String FIELDNAME_Customer_SummaryLevel="00d87fa7-db92-05ec-339f-97c9140f2fab";

@XendraTrl(Identifier="21180891-a400-acf4-6edd-23c3fd27d787")
public static String es_PE_FIELD_AssignedPartners_SummaryLevel_Name="Entidad Acumulada";

@XendraTrl(Identifier="21180891-a400-acf4-6edd-23c3fd27d787")
public static String es_PE_FIELD_AssignedPartners_SummaryLevel_Description="Esta es una entidad sumaria";

@XendraTrl(Identifier="21180891-a400-acf4-6edd-23c3fd27d787")
public static String es_PE_FIELD_AssignedPartners_SummaryLevel_Help="Una entidad sumaria representa una rama en un árbol mas bien que un nodo final. Las entidades sumarias son usadas para reportar y no tienen valores propios";

@XendraField(AD_Column_ID="IsSummary",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="21180891-a400-acf4-6edd-23c3fd27d787")
public static final String FIELDNAME_AssignedPartners_SummaryLevel="21180891-a400-acf4-6edd-23c3fd27d787";

@XendraTrl(Identifier="f53edea6-15ee-7bc2-4a26-17e2e46f019d")
public static String es_PE_FIELD_Employee_SummaryLevel_Name="Entidad Acumulada";

@XendraTrl(Identifier="f53edea6-15ee-7bc2-4a26-17e2e46f019d")
public static String es_PE_FIELD_Employee_SummaryLevel_Description="Esta es una entidad sumaria";

@XendraTrl(Identifier="f53edea6-15ee-7bc2-4a26-17e2e46f019d")
public static String es_PE_FIELD_Employee_SummaryLevel_Help="Una entidad sumaria representa una rama en un árbol mas bien que un nodo final. Las entidades sumarias son usadas para reportar y no tienen valores propios";

@XendraField(AD_Column_ID="IsSummary",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f53edea6-15ee-7bc2-4a26-17e2e46f019d")
public static final String FIELDNAME_Employee_SummaryLevel="f53edea6-15ee-7bc2-4a26-17e2e46f019d";

@XendraTrl(Identifier="d52ee4cf-5e5a-c414-dcf8-cfdb640c920e")
public static String es_PE_FIELD_Customer_SummaryLevel2_Name="Entidad Acumulada";

@XendraTrl(Identifier="d52ee4cf-5e5a-c414-dcf8-cfdb640c920e")
public static String es_PE_FIELD_Customer_SummaryLevel2_Description="Esta es una entidad sumaria";

@XendraTrl(Identifier="d52ee4cf-5e5a-c414-dcf8-cfdb640c920e")
public static String es_PE_FIELD_Customer_SummaryLevel2_Help="Una entidad sumaria representa una rama en un árbol mas bien que un nodo final. Las entidades sumarias son usadas para reportar y no tienen valores propios";

@XendraField(AD_Column_ID="IsSummary",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d52ee4cf-5e5a-c414-dcf8-cfdb640c920e")
public static final String FIELDNAME_Customer_SummaryLevel2="d52ee4cf-5e5a-c414-dcf8-cfdb640c920e";

@XendraTrl(Identifier="384abe53-48a1-be27-ff2e-f25f87d852d1")
public static String es_PE_FIELD_BusinessPartner_SummaryLevel2_Name="Entidad Acumulada";

@XendraTrl(Identifier="384abe53-48a1-be27-ff2e-f25f87d852d1")
public static String es_PE_FIELD_BusinessPartner_SummaryLevel2_Description="Esta es una entidad sumaria";

@XendraTrl(Identifier="384abe53-48a1-be27-ff2e-f25f87d852d1")
public static String es_PE_FIELD_BusinessPartner_SummaryLevel2_Help="Una entidad sumaria representa una rama en un árbol mas bien que un nodo final. Las entidades sumarias son usadas para reportar y no tienen valores propios";

@XendraField(AD_Column_ID="IsSummary",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="384abe53-48a1-be27-ff2e-f25f87d852d1")
public static final String FIELDNAME_BusinessPartner_SummaryLevel2="384abe53-48a1-be27-ff2e-f25f87d852d1";

@XendraTrl(Identifier="0442a1e6-ac1a-b7f1-1ea5-8a17ec7e6dbb")
public static String es_PE_COLUMN_IsSummary_Name="Entidad Acumulada";

@XendraColumn(AD_Element_ID="0ecd1d56-9e2b-8778-7b05-92730d811ad4",ColumnName="IsSummary",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0442a1e6-ac1a-b7f1-1ea5-8a17ec7e6dbb",
Synchronized="2019-08-30 22:21:10.0")
/** Column name IsSummary */
public static final String COLUMNNAME_IsSummary = "IsSummary";
/** Set Tax exempt.
@param IsTaxExempt Business partner is exempt from tax */
public void setIsTaxExempt (boolean IsTaxExempt)
{
set_Value (COLUMNNAME_IsTaxExempt, Boolean.valueOf(IsTaxExempt));
}
/** Get Tax exempt.
@return Business partner is exempt from tax */
public boolean isTaxExempt() 
{
Object oo = get_Value(COLUMNNAME_IsTaxExempt);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="7a3be2e5-c1bf-b90b-1fc7-879b50f6d190")
public static String es_PE_FIELD_Vendor_TaxExempt_Name="Exento de Impuesto";

@XendraTrl(Identifier="7a3be2e5-c1bf-b90b-1fc7-879b50f6d190")
public static String es_PE_FIELD_Vendor_TaxExempt_Description="Este socio de negocio esta exento del impuesto de ventas.";

@XendraTrl(Identifier="7a3be2e5-c1bf-b90b-1fc7-879b50f6d190")
public static String es_PE_FIELD_Vendor_TaxExempt_Help="El cuadro de verificación exento de impuesto identifica un socio de negocio quien no esta sujeto al impuesto de ventas.";

@XendraField(AD_Column_ID="IsTaxExempt",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7a3be2e5-c1bf-b90b-1fc7-879b50f6d190")
public static final String FIELDNAME_Vendor_TaxExempt="7a3be2e5-c1bf-b90b-1fc7-879b50f6d190";

@XendraTrl(Identifier="d408c4fe-ce5b-1397-fce6-3a8c6324a74d")
public static String es_PE_FIELD_Customer_TaxExempt_Name="Exento de Impuesto";

@XendraTrl(Identifier="d408c4fe-ce5b-1397-fce6-3a8c6324a74d")
public static String es_PE_FIELD_Customer_TaxExempt_Description="Este socio de negocio esta exento del impuesto de ventas.";

@XendraTrl(Identifier="d408c4fe-ce5b-1397-fce6-3a8c6324a74d")
public static String es_PE_FIELD_Customer_TaxExempt_Help="El cuadro de verificación exento de impuesto identifica un socio de negocio quien no esta sujeto al impuesto de ventas.";

@XendraField(AD_Column_ID="IsTaxExempt",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d408c4fe-ce5b-1397-fce6-3a8c6324a74d")
public static final String FIELDNAME_Customer_TaxExempt="d408c4fe-ce5b-1397-fce6-3a8c6324a74d";

@XendraTrl(Identifier="5d528ce8-0417-d59b-8a73-f25ab419b8e1")
public static String es_PE_FIELD_BusinessPartnerDimension_TaxExempt_Name="Exento de Impuesto";

@XendraTrl(Identifier="5d528ce8-0417-d59b-8a73-f25ab419b8e1")
public static String es_PE_FIELD_BusinessPartnerDimension_TaxExempt_Description="Este socio de negocio esta exento del impuesto de ventas.";

@XendraTrl(Identifier="5d528ce8-0417-d59b-8a73-f25ab419b8e1")
public static String es_PE_FIELD_BusinessPartnerDimension_TaxExempt_Help="El cuadro de verificación exento de impuesto identifica un socio de negocio quien no esta sujeto al impuesto de ventas.";

@XendraField(AD_Column_ID="IsTaxExempt",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5d528ce8-0417-d59b-8a73-f25ab419b8e1")
public static final String FIELDNAME_BusinessPartnerDimension_TaxExempt="5d528ce8-0417-d59b-8a73-f25ab419b8e1";

@XendraTrl(Identifier="92b26eb9-2eae-9ab4-c239-dcabf97a1392")
public static String es_PE_FIELD_PartnerSelection_TaxExempt_Name="Exento de Impuesto";

@XendraTrl(Identifier="92b26eb9-2eae-9ab4-c239-dcabf97a1392")
public static String es_PE_FIELD_PartnerSelection_TaxExempt_Description="Este socio de negocio esta exento del impuesto de ventas.";

@XendraTrl(Identifier="92b26eb9-2eae-9ab4-c239-dcabf97a1392")
public static String es_PE_FIELD_PartnerSelection_TaxExempt_Help="El cuadro de verificación exento de impuesto identifica un socio de negocio quien no esta sujeto al impuesto de ventas.";

@XendraField(AD_Column_ID="IsTaxExempt",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="92b26eb9-2eae-9ab4-c239-dcabf97a1392")
public static final String FIELDNAME_PartnerSelection_TaxExempt="92b26eb9-2eae-9ab4-c239-dcabf97a1392";

@XendraTrl(Identifier="c4a99405-f3bd-361d-9b6d-69037816d7f3")
public static String es_PE_FIELD_Vendor_TaxExempt2_Name="Exento de Impuesto";

@XendraTrl(Identifier="c4a99405-f3bd-361d-9b6d-69037816d7f3")
public static String es_PE_FIELD_Vendor_TaxExempt2_Description="Este socio de negocio esta exento del impuesto de ventas.";

@XendraTrl(Identifier="c4a99405-f3bd-361d-9b6d-69037816d7f3")
public static String es_PE_FIELD_Vendor_TaxExempt2_Help="El cuadro de verificación exento de impuesto identifica un socio de negocio quien no esta sujeto al impuesto de ventas.";

@XendraField(AD_Column_ID="IsTaxExempt",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c4a99405-f3bd-361d-9b6d-69037816d7f3")
public static final String FIELDNAME_Vendor_TaxExempt2="c4a99405-f3bd-361d-9b6d-69037816d7f3";

@XendraTrl(Identifier="2c6e92a2-ecac-39c3-3649-080169579e9b")
public static String es_PE_FIELD_Employee_TaxExempt_Name="Exento de Impuesto";

@XendraTrl(Identifier="2c6e92a2-ecac-39c3-3649-080169579e9b")
public static String es_PE_FIELD_Employee_TaxExempt_Description="Este socio de negocio esta exento del impuesto de ventas.";

@XendraTrl(Identifier="2c6e92a2-ecac-39c3-3649-080169579e9b")
public static String es_PE_FIELD_Employee_TaxExempt_Help="El cuadro de verificación exento de impuesto identifica un socio de negocio quien no esta sujeto al impuesto de ventas.";

@XendraField(AD_Column_ID="IsTaxExempt",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2c6e92a2-ecac-39c3-3649-080169579e9b")
public static final String FIELDNAME_Employee_TaxExempt="2c6e92a2-ecac-39c3-3649-080169579e9b";

@XendraTrl(Identifier="4941b0b1-0485-77db-9d81-1b46d403d468")
public static String es_PE_FIELD_BusinessPartner_TaxExempt_Name="Exento de Impuesto";

@XendraTrl(Identifier="4941b0b1-0485-77db-9d81-1b46d403d468")
public static String es_PE_FIELD_BusinessPartner_TaxExempt_Description="Este socio de negocio esta exento del impuesto de ventas.";

@XendraTrl(Identifier="4941b0b1-0485-77db-9d81-1b46d403d468")
public static String es_PE_FIELD_BusinessPartner_TaxExempt_Help="El cuadro de verificación exento de impuesto identifica un socio de negocio quien no esta sujeto al impuesto de ventas.";

@XendraField(AD_Column_ID="IsTaxExempt",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4941b0b1-0485-77db-9d81-1b46d403d468")
public static final String FIELDNAME_BusinessPartner_TaxExempt="4941b0b1-0485-77db-9d81-1b46d403d468";

@XendraTrl(Identifier="664a2689-e716-1a39-627f-0c727445bc84")
public static String es_PE_FIELD_EmployeeVendor_TaxExempt_Name="Exento de Impuesto";

@XendraTrl(Identifier="664a2689-e716-1a39-627f-0c727445bc84")
public static String es_PE_FIELD_EmployeeVendor_TaxExempt_Description="Este socio de negocio esta exento del impuesto de ventas.";

@XendraTrl(Identifier="664a2689-e716-1a39-627f-0c727445bc84")
public static String es_PE_FIELD_EmployeeVendor_TaxExempt_Help="El cuadro de verificación exento de impuesto identifica un socio de negocio quien no esta sujeto al impuesto de ventas.";

@XendraField(AD_Column_ID="IsTaxExempt",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="664a2689-e716-1a39-627f-0c727445bc84")
public static final String FIELDNAME_EmployeeVendor_TaxExempt="664a2689-e716-1a39-627f-0c727445bc84";

@XendraTrl(Identifier="0eb533e6-9231-d31a-ed08-cab38096a9fc")
public static String es_PE_FIELD_AssignedPartners_TaxExempt_Name="Exento de Impuesto";

@XendraTrl(Identifier="0eb533e6-9231-d31a-ed08-cab38096a9fc")
public static String es_PE_FIELD_AssignedPartners_TaxExempt_Description="Este socio de negocio esta exento del impuesto de ventas.";

@XendraTrl(Identifier="0eb533e6-9231-d31a-ed08-cab38096a9fc")
public static String es_PE_FIELD_AssignedPartners_TaxExempt_Help="El cuadro de verificación exento de impuesto identifica un socio de negocio quien no esta sujeto al impuesto de ventas.";

@XendraField(AD_Column_ID="IsTaxExempt",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0eb533e6-9231-d31a-ed08-cab38096a9fc")
public static final String FIELDNAME_AssignedPartners_TaxExempt="0eb533e6-9231-d31a-ed08-cab38096a9fc";

@XendraTrl(Identifier="f65337f2-32a2-2f2b-2953-f7d74fbbe173")
public static String es_PE_FIELD_Customer_TaxExempt2_Name="Exento de Impuesto";

@XendraTrl(Identifier="f65337f2-32a2-2f2b-2953-f7d74fbbe173")
public static String es_PE_FIELD_Customer_TaxExempt2_Description="Este socio de negocio esta exento del impuesto de ventas.";

@XendraTrl(Identifier="f65337f2-32a2-2f2b-2953-f7d74fbbe173")
public static String es_PE_FIELD_Customer_TaxExempt2_Help="El cuadro de verificación exento de impuesto identifica un socio de negocio quien no esta sujeto al impuesto de ventas.";

@XendraField(AD_Column_ID="IsTaxExempt",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f65337f2-32a2-2f2b-2953-f7d74fbbe173")
public static final String FIELDNAME_Customer_TaxExempt2="f65337f2-32a2-2f2b-2953-f7d74fbbe173";

@XendraTrl(Identifier="c8325e74-8583-65f3-4c59-678fee5a6446")
public static String es_PE_FIELD_BusinessPartner_TaxExempt2_Name="Exento de Impuesto";

@XendraTrl(Identifier="c8325e74-8583-65f3-4c59-678fee5a6446")
public static String es_PE_FIELD_BusinessPartner_TaxExempt2_Description="Este socio de negocio esta exento del impuesto de ventas.";

@XendraTrl(Identifier="c8325e74-8583-65f3-4c59-678fee5a6446")
public static String es_PE_FIELD_BusinessPartner_TaxExempt2_Help="El cuadro de verificación exento de impuesto identifica un socio de negocio quien no esta sujeto al impuesto de ventas.";

@XendraField(AD_Column_ID="IsTaxExempt",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c8325e74-8583-65f3-4c59-678fee5a6446")
public static final String FIELDNAME_BusinessPartner_TaxExempt2="c8325e74-8583-65f3-4c59-678fee5a6446";

@XendraTrl(Identifier="8868c075-0fcf-1f17-010c-22662bb74911")
public static String es_PE_COLUMN_IsTaxExempt_Name="Exento de Impuesto";

@XendraColumn(AD_Element_ID="16f91faf-5980-9ce8-0199-2fad4dad3541",ColumnName="IsTaxExempt",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8868c075-0fcf-1f17-010c-22662bb74911",
Synchronized="2019-08-30 22:21:10.0")
/** Column name IsTaxExempt */
public static final String COLUMNNAME_IsTaxExempt = "IsTaxExempt";
/** Set Vendor.
@param IsVendor Indicates if this Business Partner is a Vendor */
public void setIsVendor (boolean IsVendor)
{
set_Value (COLUMNNAME_IsVendor, Boolean.valueOf(IsVendor));
}
/** Get Vendor.
@return Indicates if this Business Partner is a Vendor */
public boolean isVendor() 
{
Object oo = get_Value(COLUMNNAME_IsVendor);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="d53c05ba-e219-9294-b290-2982101db5d7")
public static String es_PE_FIELD_PartnerSelection_Vendor_Name="Proveedor";

@XendraTrl(Identifier="d53c05ba-e219-9294-b290-2982101db5d7")
public static String es_PE_FIELD_PartnerSelection_Vendor_Description="Indica si el socio de negocio es un proveedor.";

@XendraTrl(Identifier="d53c05ba-e219-9294-b290-2982101db5d7")
public static String es_PE_FIELD_PartnerSelection_Vendor_Help="El cuadro de verificación proveedor indica si este socio de negocio es un proveedor. Si se selecciona; campos adicionales serán desplegados para identificar a este proveedor.";

@XendraField(AD_Column_ID="IsVendor",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d53c05ba-e219-9294-b290-2982101db5d7")
public static final String FIELDNAME_PartnerSelection_Vendor="d53c05ba-e219-9294-b290-2982101db5d7";

@XendraTrl(Identifier="1b9ed0d1-fb82-2340-fcd9-be54c19d0b0f")
public static String es_PE_FIELD_EmployeeVendor_Vendor_Name="Proveedor";

@XendraTrl(Identifier="1b9ed0d1-fb82-2340-fcd9-be54c19d0b0f")
public static String es_PE_FIELD_EmployeeVendor_Vendor_Description="Indica si el socio de negocio es un proveedor.";

@XendraTrl(Identifier="1b9ed0d1-fb82-2340-fcd9-be54c19d0b0f")
public static String es_PE_FIELD_EmployeeVendor_Vendor_Help="El cuadro de verificación proveedor indica si este socio de negocio es un proveedor. Si se selecciona; campos adicionales serán desplegados para identificar a este proveedor.";

@XendraField(AD_Column_ID="IsVendor",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1b9ed0d1-fb82-2340-fcd9-be54c19d0b0f")
public static final String FIELDNAME_EmployeeVendor_Vendor="1b9ed0d1-fb82-2340-fcd9-be54c19d0b0f";

@XendraTrl(Identifier="2bcafcf4-955c-ffc2-d55f-0dca7cb68a38")
public static String es_PE_FIELD_Vendor_Vendor_Name="Proveedor";

@XendraTrl(Identifier="2bcafcf4-955c-ffc2-d55f-0dca7cb68a38")
public static String es_PE_FIELD_Vendor_Vendor_Description="Indica si el socio de negocio es un proveedor.";

@XendraTrl(Identifier="2bcafcf4-955c-ffc2-d55f-0dca7cb68a38")
public static String es_PE_FIELD_Vendor_Vendor_Help="El cuadro de verificación proveedor indica si este socio de negocio es un proveedor. Si se selecciona; campos adicionales serán desplegados para identificar a este proveedor.";

@XendraField(AD_Column_ID="IsVendor",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2bcafcf4-955c-ffc2-d55f-0dca7cb68a38")
public static final String FIELDNAME_Vendor_Vendor="2bcafcf4-955c-ffc2-d55f-0dca7cb68a38";

@XendraTrl(Identifier="c97dff9c-f2cc-84e3-8718-d3ef0d7021c1")
public static String es_PE_FIELD_Customer_Vendor_Name="Proveedor";

@XendraTrl(Identifier="c97dff9c-f2cc-84e3-8718-d3ef0d7021c1")
public static String es_PE_FIELD_Customer_Vendor_Description="Indica si el socio de negocio es un proveedor.";

@XendraTrl(Identifier="c97dff9c-f2cc-84e3-8718-d3ef0d7021c1")
public static String es_PE_FIELD_Customer_Vendor_Help="El cuadro de verificación proveedor indica si este socio de negocio es un proveedor. Si se selecciona; campos adicionales serán desplegados para identificar a este proveedor.";

@XendraField(AD_Column_ID="IsVendor",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c97dff9c-f2cc-84e3-8718-d3ef0d7021c1")
public static final String FIELDNAME_Customer_Vendor="c97dff9c-f2cc-84e3-8718-d3ef0d7021c1";

@XendraTrl(Identifier="85005e33-cffd-86eb-e048-248783f36be8")
public static String es_PE_FIELD_BusinessPartnerDimension_Vendor_Name="Proveedor";

@XendraTrl(Identifier="85005e33-cffd-86eb-e048-248783f36be8")
public static String es_PE_FIELD_BusinessPartnerDimension_Vendor_Description="Indica si el socio de negocio es un proveedor.";

@XendraTrl(Identifier="85005e33-cffd-86eb-e048-248783f36be8")
public static String es_PE_FIELD_BusinessPartnerDimension_Vendor_Help="El cuadro de verificación proveedor indica si este socio de negocio es un proveedor. Si se selecciona; campos adicionales serán desplegados para identificar a este proveedor.";

@XendraField(AD_Column_ID="IsVendor",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="85005e33-cffd-86eb-e048-248783f36be8")
public static final String FIELDNAME_BusinessPartnerDimension_Vendor="85005e33-cffd-86eb-e048-248783f36be8";

@XendraTrl(Identifier="7d8fd578-2f44-4bac-8cfe-cc2642ba435a")
public static String es_PE_FIELD_AssignedPartners_Vendor_Name="Proveedor";

@XendraTrl(Identifier="7d8fd578-2f44-4bac-8cfe-cc2642ba435a")
public static String es_PE_FIELD_AssignedPartners_Vendor_Description="Indica si el socio de negocio es un proveedor.";

@XendraTrl(Identifier="7d8fd578-2f44-4bac-8cfe-cc2642ba435a")
public static String es_PE_FIELD_AssignedPartners_Vendor_Help="El cuadro de verificación proveedor indica si este socio de negocio es un proveedor. Si se selecciona; campos adicionales serán desplegados para identificar a este proveedor.";

@XendraField(AD_Column_ID="IsVendor",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7d8fd578-2f44-4bac-8cfe-cc2642ba435a")
public static final String FIELDNAME_AssignedPartners_Vendor="7d8fd578-2f44-4bac-8cfe-cc2642ba435a";

@XendraTrl(Identifier="340f003e-c448-b38a-2fd4-87dbdaff52ed")
public static String es_PE_FIELD_BusinessPartner_Vendor_Name="Proveedor";

@XendraTrl(Identifier="340f003e-c448-b38a-2fd4-87dbdaff52ed")
public static String es_PE_FIELD_BusinessPartner_Vendor_Description="Indica si el socio de negocio es un proveedor.";

@XendraTrl(Identifier="340f003e-c448-b38a-2fd4-87dbdaff52ed")
public static String es_PE_FIELD_BusinessPartner_Vendor_Help="El cuadro de verificación proveedor indica si este socio de negocio es un proveedor. Si se selecciona; campos adicionales serán desplegados para identificar a este proveedor.";

@XendraField(AD_Column_ID="IsVendor",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="340f003e-c448-b38a-2fd4-87dbdaff52ed")
public static final String FIELDNAME_BusinessPartner_Vendor="340f003e-c448-b38a-2fd4-87dbdaff52ed";

@XendraTrl(Identifier="1f550d92-bf3a-ed09-f65c-26da0b11827f")
public static String es_PE_FIELD_Employee_Vendor_Name="Proveedor";

@XendraTrl(Identifier="1f550d92-bf3a-ed09-f65c-26da0b11827f")
public static String es_PE_FIELD_Employee_Vendor_Description="Indica si el socio de negocio es un proveedor.";

@XendraTrl(Identifier="1f550d92-bf3a-ed09-f65c-26da0b11827f")
public static String es_PE_FIELD_Employee_Vendor_Help="El cuadro de verificación proveedor indica si este socio de negocio es un proveedor. Si se selecciona; campos adicionales serán desplegados para identificar a este proveedor.";

@XendraField(AD_Column_ID="IsVendor",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1f550d92-bf3a-ed09-f65c-26da0b11827f")
public static final String FIELDNAME_Employee_Vendor="1f550d92-bf3a-ed09-f65c-26da0b11827f";

@XendraTrl(Identifier="adf002bb-9cd5-fcf7-d139-5f34f049ffcb")
public static String es_PE_FIELD_Customer_Vendor2_Name="Proveedor";

@XendraTrl(Identifier="adf002bb-9cd5-fcf7-d139-5f34f049ffcb")
public static String es_PE_FIELD_Customer_Vendor2_Description="Indica si el socio de negocio es un proveedor.";

@XendraTrl(Identifier="adf002bb-9cd5-fcf7-d139-5f34f049ffcb")
public static String es_PE_FIELD_Customer_Vendor2_Help="El cuadro de verificación proveedor indica si este socio de negocio es un proveedor. Si se selecciona; campos adicionales serán desplegados para identificar a este proveedor.";

@XendraField(AD_Column_ID="IsVendor",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="adf002bb-9cd5-fcf7-d139-5f34f049ffcb")
public static final String FIELDNAME_Customer_Vendor2="adf002bb-9cd5-fcf7-d139-5f34f049ffcb";

@XendraTrl(Identifier="a2b1fad5-2bd9-35ac-0340-76d9c5f10a27")
public static String es_PE_FIELD_Vendor_Vendor2_Name="Proveedor";

@XendraTrl(Identifier="a2b1fad5-2bd9-35ac-0340-76d9c5f10a27")
public static String es_PE_FIELD_Vendor_Vendor2_Description="Indica si el socio de negocio es un proveedor.";

@XendraTrl(Identifier="a2b1fad5-2bd9-35ac-0340-76d9c5f10a27")
public static String es_PE_FIELD_Vendor_Vendor2_Help="El cuadro de verificación proveedor indica si este socio de negocio es un proveedor. Si se selecciona; campos adicionales serán desplegados para identificar a este proveedor.";

@XendraField(AD_Column_ID="IsVendor",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a2b1fad5-2bd9-35ac-0340-76d9c5f10a27")
public static final String FIELDNAME_Vendor_Vendor2="a2b1fad5-2bd9-35ac-0340-76d9c5f10a27";

@XendraTrl(Identifier="272b119f-1f7e-1180-eeeb-fecd65434adc")
public static String es_PE_FIELD_BusinessPartner_Vendor2_Name="Proveedor";

@XendraTrl(Identifier="272b119f-1f7e-1180-eeeb-fecd65434adc")
public static String es_PE_FIELD_BusinessPartner_Vendor2_Description="Indica si el socio de negocio es un proveedor.";

@XendraTrl(Identifier="272b119f-1f7e-1180-eeeb-fecd65434adc")
public static String es_PE_FIELD_BusinessPartner_Vendor2_Help="El cuadro de verificación proveedor indica si este socio de negocio es un proveedor. Si se selecciona; campos adicionales serán desplegados para identificar a este proveedor.";

@XendraField(AD_Column_ID="IsVendor",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=260,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="272b119f-1f7e-1180-eeeb-fecd65434adc")
public static final String FIELDNAME_BusinessPartner_Vendor2="272b119f-1f7e-1180-eeeb-fecd65434adc";

@XendraTrl(Identifier="79b83149-5792-e69b-fbf1-21d72497a939")
public static String es_PE_COLUMN_IsVendor_Name="Proveedor";

@XendraColumn(AD_Element_ID="e69964cc-6328-38f7-b561-3468b6500147",ColumnName="IsVendor",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="79b83149-5792-e69b-fbf1-21d72497a939",
Synchronized="2019-08-30 22:21:10.0")
/** Column name IsVendor */
public static final String COLUMNNAME_IsVendor = "IsVendor";
/** Set Discount Schema.
@param M_DiscountSchema_ID Schema to calculate the trade discount percentage */
public void setM_DiscountSchema_ID (int M_DiscountSchema_ID)
{
if (M_DiscountSchema_ID <= 0) set_Value (COLUMNNAME_M_DiscountSchema_ID, null);
 else 
set_Value (COLUMNNAME_M_DiscountSchema_ID, Integer.valueOf(M_DiscountSchema_ID));
}
/** Get Discount Schema.
@return Schema to calculate the trade discount percentage */
public int getM_DiscountSchema_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_DiscountSchema_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b8b6abbe-5817-9504-1355-9b77c24c7b8c")
public static String es_PE_FIELD_Customer_DiscountSchema_Name="Esq List Precios/Desc";

@XendraTrl(Identifier="b8b6abbe-5817-9504-1355-9b77c24c7b8c")
public static String es_PE_FIELD_Customer_DiscountSchema_Description="Esquema para calcular el porcentaje de descuento comercial";

@XendraTrl(Identifier="b8b6abbe-5817-9504-1355-9b77c24c7b8c")
public static String es_PE_FIELD_Customer_DiscountSchema_Help="Después del cálculo de precio (estándar); el porcentaje de descuento comercial es calculado y aplicado resultando en el precio final";

@XendraField(AD_Column_ID="M_DiscountSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsCustomer@='Y'",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="b8b6abbe-5817-9504-1355-9b77c24c7b8c")
public static final String FIELDNAME_Customer_DiscountSchema="b8b6abbe-5817-9504-1355-9b77c24c7b8c";

@XendraTrl(Identifier="c0f64610-4882-1f55-74f6-aa3de70a67ef")
public static String es_PE_FIELD_BusinessPartnerDimension_DiscountSchema_Name="Esq List Precios/Desc";

@XendraTrl(Identifier="c0f64610-4882-1f55-74f6-aa3de70a67ef")
public static String es_PE_FIELD_BusinessPartnerDimension_DiscountSchema_Description="Esquema para calcular el porcentaje de descuento comercial";

@XendraTrl(Identifier="c0f64610-4882-1f55-74f6-aa3de70a67ef")
public static String es_PE_FIELD_BusinessPartnerDimension_DiscountSchema_Help="Después del cálculo de precio (estándar); el porcentaje de descuento comercial es calculado y aplicado resultando en el precio final";

@XendraField(AD_Column_ID="M_DiscountSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c0f64610-4882-1f55-74f6-aa3de70a67ef")
public static final String FIELDNAME_BusinessPartnerDimension_DiscountSchema="c0f64610-4882-1f55-74f6-aa3de70a67ef";

@XendraTrl(Identifier="d5516352-81cf-6313-feb2-19d3b04056e2")
public static String es_PE_FIELD_Employee_DiscountSchema_Name="Esq List Precios/Desc";

@XendraTrl(Identifier="d5516352-81cf-6313-feb2-19d3b04056e2")
public static String es_PE_FIELD_Employee_DiscountSchema_Description="Esquema para calcular el porcentaje de descuento comercial";

@XendraTrl(Identifier="d5516352-81cf-6313-feb2-19d3b04056e2")
public static String es_PE_FIELD_Employee_DiscountSchema_Help="Después del cálculo de precio (estándar); el porcentaje de descuento comercial es calculado y aplicado resultando en el precio final";

@XendraField(AD_Column_ID="M_DiscountSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d5516352-81cf-6313-feb2-19d3b04056e2")
public static final String FIELDNAME_Employee_DiscountSchema="d5516352-81cf-6313-feb2-19d3b04056e2";

@XendraTrl(Identifier="dbbbe9a0-cb42-6bb5-9a23-d2eb3a420f89")
public static String es_PE_FIELD_AssignedPartners_DiscountSchema_Name="Esq List Precios/Desc";

@XendraTrl(Identifier="dbbbe9a0-cb42-6bb5-9a23-d2eb3a420f89")
public static String es_PE_FIELD_AssignedPartners_DiscountSchema_Description="Esquema para calcular el porcentaje de descuento comercial";

@XendraTrl(Identifier="dbbbe9a0-cb42-6bb5-9a23-d2eb3a420f89")
public static String es_PE_FIELD_AssignedPartners_DiscountSchema_Help="Después del cálculo de precio (estándar); el porcentaje de descuento comercial es calculado y aplicado resultando en el precio final";

@XendraField(AD_Column_ID="M_DiscountSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dbbbe9a0-cb42-6bb5-9a23-d2eb3a420f89")
public static final String FIELDNAME_AssignedPartners_DiscountSchema="dbbbe9a0-cb42-6bb5-9a23-d2eb3a420f89";

@XendraTrl(Identifier="e489b30f-7eca-006d-8079-0b6791394d9e")
public static String es_PE_FIELD_PartnerSelection_DiscountSchema_Name="Esq List Precios/Desc";

@XendraTrl(Identifier="e489b30f-7eca-006d-8079-0b6791394d9e")
public static String es_PE_FIELD_PartnerSelection_DiscountSchema_Description="Esquema para calcular el porcentaje de descuento comercial";

@XendraTrl(Identifier="e489b30f-7eca-006d-8079-0b6791394d9e")
public static String es_PE_FIELD_PartnerSelection_DiscountSchema_Help="Después del cálculo de precio (estándar); el porcentaje de descuento comercial es calculado y aplicado resultando en el precio final";

@XendraField(AD_Column_ID="M_DiscountSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e489b30f-7eca-006d-8079-0b6791394d9e")
public static final String FIELDNAME_PartnerSelection_DiscountSchema="e489b30f-7eca-006d-8079-0b6791394d9e";

@XendraTrl(Identifier="326ef6d5-2239-4484-da05-0b125fd97c21")
public static String es_PE_FIELD_BusinessPartner_DiscountSchema_Name="Esq List Precios/Desc";

@XendraTrl(Identifier="326ef6d5-2239-4484-da05-0b125fd97c21")
public static String es_PE_FIELD_BusinessPartner_DiscountSchema_Description="Esquema para calcular el porcentaje de descuento comercial";

@XendraTrl(Identifier="326ef6d5-2239-4484-da05-0b125fd97c21")
public static String es_PE_FIELD_BusinessPartner_DiscountSchema_Help="Después del cálculo de precio (estándar); el porcentaje de descuento comercial es calculado y aplicado resultando en el precio final";

@XendraField(AD_Column_ID="M_DiscountSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="326ef6d5-2239-4484-da05-0b125fd97c21")
public static final String FIELDNAME_BusinessPartner_DiscountSchema="326ef6d5-2239-4484-da05-0b125fd97c21";

@XendraTrl(Identifier="6fbca475-01f4-f67f-ae02-e919a7ed4360")
public static String es_PE_FIELD_Customer_DiscountSchema2_Name="Esq List Precios/Desc";

@XendraTrl(Identifier="6fbca475-01f4-f67f-ae02-e919a7ed4360")
public static String es_PE_FIELD_Customer_DiscountSchema2_Description="Esquema para calcular el porcentaje de descuento comercial";

@XendraTrl(Identifier="6fbca475-01f4-f67f-ae02-e919a7ed4360")
public static String es_PE_FIELD_Customer_DiscountSchema2_Help="Después del cálculo de precio (estándar); el porcentaje de descuento comercial es calculado y aplicado resultando en el precio final";

@XendraField(AD_Column_ID="M_DiscountSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6fbca475-01f4-f67f-ae02-e919a7ed4360")
public static final String FIELDNAME_Customer_DiscountSchema2="6fbca475-01f4-f67f-ae02-e919a7ed4360";

@XendraTrl(Identifier="6f30e172-a889-9eba-8594-f141189ceaa8")
public static String es_PE_FIELD_Vendor_PriceListSchema_Name="Esq List Precios/Desc";

@XendraTrl(Identifier="6f30e172-a889-9eba-8594-f141189ceaa8")
public static String es_PE_FIELD_Vendor_PriceListSchema_Description="Esquema para calcular el porcentaje de descuento comercial";

@XendraTrl(Identifier="6f30e172-a889-9eba-8594-f141189ceaa8")
public static String es_PE_FIELD_Vendor_PriceListSchema_Help="Después del cálculo de precio (estándar); el porcentaje de descuento comercial es calculado y aplicado resultando en el precio final";

@XendraField(AD_Column_ID="M_DiscountSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6f30e172-a889-9eba-8594-f141189ceaa8")
public static final String FIELDNAME_Vendor_PriceListSchema="6f30e172-a889-9eba-8594-f141189ceaa8";

@XendraTrl(Identifier="bbe2cd2a-cdbd-5af2-39da-298d94cb355a")
public static String es_PE_FIELD_EmployeeVendor_PriceListSchema_Name="Esq List Precios/Desc";

@XendraTrl(Identifier="bbe2cd2a-cdbd-5af2-39da-298d94cb355a")
public static String es_PE_FIELD_EmployeeVendor_PriceListSchema_Description="Esquema para calcular el porcentaje de descuento comercial";

@XendraTrl(Identifier="bbe2cd2a-cdbd-5af2-39da-298d94cb355a")
public static String es_PE_FIELD_EmployeeVendor_PriceListSchema_Help="Después del cálculo de precio (estándar); el porcentaje de descuento comercial es calculado y aplicado resultando en el precio final";

@XendraField(AD_Column_ID="M_DiscountSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bbe2cd2a-cdbd-5af2-39da-298d94cb355a")
public static final String FIELDNAME_EmployeeVendor_PriceListSchema="bbe2cd2a-cdbd-5af2-39da-298d94cb355a";

@XendraTrl(Identifier="5f6f5132-1c38-3e42-19bf-78568500ae13")
public static String es_PE_FIELD_BusinessPartner_DiscountSchema2_Name="Esq List Precios/Desc";

@XendraTrl(Identifier="5f6f5132-1c38-3e42-19bf-78568500ae13")
public static String es_PE_FIELD_BusinessPartner_DiscountSchema2_Description="Esquema para calcular el porcentaje de descuento comercial";

@XendraTrl(Identifier="5f6f5132-1c38-3e42-19bf-78568500ae13")
public static String es_PE_FIELD_BusinessPartner_DiscountSchema2_Help="Después del cálculo de precio (estándar); el porcentaje de descuento comercial es calculado y aplicado resultando en el precio final";

@XendraField(AD_Column_ID="M_DiscountSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5f6f5132-1c38-3e42-19bf-78568500ae13")
public static final String FIELDNAME_BusinessPartner_DiscountSchema2="5f6f5132-1c38-3e42-19bf-78568500ae13";

@XendraTrl(Identifier="0064e249-1f5e-18fd-7694-d66f869b8967")
public static String es_PE_FIELD_Vendor_DiscountSchema_Name="Esq List Precios/Desc";

@XendraTrl(Identifier="0064e249-1f5e-18fd-7694-d66f869b8967")
public static String es_PE_FIELD_Vendor_DiscountSchema_Description="Esquema para calcular el porcentaje de descuento comercial";

@XendraTrl(Identifier="0064e249-1f5e-18fd-7694-d66f869b8967")
public static String es_PE_FIELD_Vendor_DiscountSchema_Help="Después del cálculo de precio (estándar); el porcentaje de descuento comercial es calculado y aplicado resultando en el precio final";

@XendraField(AD_Column_ID="M_DiscountSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0064e249-1f5e-18fd-7694-d66f869b8967")
public static final String FIELDNAME_Vendor_DiscountSchema="0064e249-1f5e-18fd-7694-d66f869b8967";

@XendraTrl(Identifier="86f25b2c-1b53-c58f-3bbc-3da15d54700e")
public static String es_PE_COLUMN_M_DiscountSchema_ID_Name="Esq List Precios/Desc";

@XendraColumn(AD_Element_ID="e8a3b5bd-239d-8376-eae6-8e5ebcfbe6fa",
ColumnName="M_DiscountSchema_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="3a3974a6-65b9-c98d-24a9-e5218ed456cd",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="86f25b2c-1b53-c58f-3bbc-3da15d54700e",
Synchronized="2019-08-30 22:21:10.0")
/** Column name M_DiscountSchema_ID */
public static final String COLUMNNAME_M_DiscountSchema_ID = "M_DiscountSchema_ID";
/** Set M_PriceList_ID.
@param M_PriceList_ID Unique identifier of a Price List */
public void setM_PriceList_ID (int M_PriceList_ID)
{
if (M_PriceList_ID <= 0) set_Value (COLUMNNAME_M_PriceList_ID, null);
 else 
set_Value (COLUMNNAME_M_PriceList_ID, Integer.valueOf(M_PriceList_ID));
}
/** Get M_PriceList_ID.
@return Unique identifier of a Price List */
public int getM_PriceList_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_PriceList_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a4256bdd-143b-1efa-a64c-7862db8dee18")
public static String es_PE_FIELD_BusinessPartnerDimension_M_PriceList_ID_Name="Lista de Precios";

@XendraTrl(Identifier="a4256bdd-143b-1efa-a64c-7862db8dee18")
public static String es_PE_FIELD_BusinessPartnerDimension_M_PriceList_ID_Description="Identificador único de mi lista de precios";

@XendraTrl(Identifier="a4256bdd-143b-1efa-a64c-7862db8dee18")
public static String es_PE_FIELD_BusinessPartnerDimension_M_PriceList_ID_Help="Listas de precios son usadas para determinar el precio; margen y costo de artículos comprados ó vendidos.";

@XendraField(AD_Column_ID="M_PriceList_ID",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a4256bdd-143b-1efa-a64c-7862db8dee18")
public static final String FIELDNAME_BusinessPartnerDimension_M_PriceList_ID="a4256bdd-143b-1efa-a64c-7862db8dee18";

@XendraTrl(Identifier="9ab85167-35e2-2a1f-2242-e62dfb13d672")
public static String es_PE_FIELD_EmployeeVendor_M_PriceList_ID_Name="Lista de Precios";

@XendraTrl(Identifier="9ab85167-35e2-2a1f-2242-e62dfb13d672")
public static String es_PE_FIELD_EmployeeVendor_M_PriceList_ID_Description="Identificador único de mi lista de precios";

@XendraTrl(Identifier="9ab85167-35e2-2a1f-2242-e62dfb13d672")
public static String es_PE_FIELD_EmployeeVendor_M_PriceList_ID_Help="Listas de precios son usadas para determinar el precio; margen y costo de artículos comprados ó vendidos.";

@XendraField(AD_Column_ID="M_PriceList_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9ab85167-35e2-2a1f-2242-e62dfb13d672")
public static final String FIELDNAME_EmployeeVendor_M_PriceList_ID="9ab85167-35e2-2a1f-2242-e62dfb13d672";

@XendraTrl(Identifier="994771d2-4749-72dc-b9c2-90832d003f83")
public static String es_PE_FIELD_Employee_M_PriceList_ID_Name="Lista de Precios";

@XendraTrl(Identifier="994771d2-4749-72dc-b9c2-90832d003f83")
public static String es_PE_FIELD_Employee_M_PriceList_ID_Description="Identificador único de mi lista de precios";

@XendraTrl(Identifier="994771d2-4749-72dc-b9c2-90832d003f83")
public static String es_PE_FIELD_Employee_M_PriceList_ID_Help="Listas de precios son usadas para determinar el precio; margen y costo de artículos comprados ó vendidos.";

@XendraField(AD_Column_ID="M_PriceList_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="994771d2-4749-72dc-b9c2-90832d003f83")
public static final String FIELDNAME_Employee_M_PriceList_ID="994771d2-4749-72dc-b9c2-90832d003f83";

@XendraTrl(Identifier="84746f57-b72d-859b-3c86-3e48eb5ceb2d")
public static String es_PE_FIELD_PartnerSelection_M_PriceList_ID_Name="Lista de Precios";

@XendraTrl(Identifier="84746f57-b72d-859b-3c86-3e48eb5ceb2d")
public static String es_PE_FIELD_PartnerSelection_M_PriceList_ID_Description="Identificador único de mi lista de precios";

@XendraTrl(Identifier="84746f57-b72d-859b-3c86-3e48eb5ceb2d")
public static String es_PE_FIELD_PartnerSelection_M_PriceList_ID_Help="Listas de precios son usadas para determinar el precio; margen y costo de artículos comprados ó vendidos.";

@XendraField(AD_Column_ID="M_PriceList_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="84746f57-b72d-859b-3c86-3e48eb5ceb2d")
public static final String FIELDNAME_PartnerSelection_M_PriceList_ID="84746f57-b72d-859b-3c86-3e48eb5ceb2d";

@XendraTrl(Identifier="1c8da884-8ff3-ff7d-8d4e-b6001bc929e2")
public static String es_PE_FIELD_Customer_M_PriceList_ID_Name="Lista de Precios";

@XendraTrl(Identifier="1c8da884-8ff3-ff7d-8d4e-b6001bc929e2")
public static String es_PE_FIELD_Customer_M_PriceList_ID_Description="Identificador único de mi lista de precios";

@XendraTrl(Identifier="1c8da884-8ff3-ff7d-8d4e-b6001bc929e2")
public static String es_PE_FIELD_Customer_M_PriceList_ID_Help="Listas de precios son usadas para determinar el precio; margen y costo de artículos comprados ó vendidos.";

@XendraField(AD_Column_ID="M_PriceList_ID",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1c8da884-8ff3-ff7d-8d4e-b6001bc929e2")
public static final String FIELDNAME_Customer_M_PriceList_ID="1c8da884-8ff3-ff7d-8d4e-b6001bc929e2";

@XendraTrl(Identifier="a3638984-e995-c46c-e00a-3077f0c66319")
public static String es_PE_FIELD_AssignedPartners_M_PriceList_ID_Name="Lista de Precios";

@XendraTrl(Identifier="a3638984-e995-c46c-e00a-3077f0c66319")
public static String es_PE_FIELD_AssignedPartners_M_PriceList_ID_Description="Identificador único de mi lista de precios";

@XendraTrl(Identifier="a3638984-e995-c46c-e00a-3077f0c66319")
public static String es_PE_FIELD_AssignedPartners_M_PriceList_ID_Help="Listas de precios son usadas para determinar el precio; margen y costo de artículos comprados ó vendidos.";

@XendraField(AD_Column_ID="M_PriceList_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a3638984-e995-c46c-e00a-3077f0c66319")
public static final String FIELDNAME_AssignedPartners_M_PriceList_ID="a3638984-e995-c46c-e00a-3077f0c66319";

@XendraTrl(Identifier="6ac1aca1-9122-302d-d7ac-55d3f36178b8")
public static String es_PE_FIELD_BusinessPartner_M_PriceList_ID_Name="Lista de Precios";

@XendraTrl(Identifier="6ac1aca1-9122-302d-d7ac-55d3f36178b8")
public static String es_PE_FIELD_BusinessPartner_M_PriceList_ID_Description="Identificador único de mi lista de precios";

@XendraTrl(Identifier="6ac1aca1-9122-302d-d7ac-55d3f36178b8")
public static String es_PE_FIELD_BusinessPartner_M_PriceList_ID_Help="Listas de precios son usadas para determinar el precio; margen y costo de artículos comprados ó vendidos.";

@XendraField(AD_Column_ID="M_PriceList_ID",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6ac1aca1-9122-302d-d7ac-55d3f36178b8")
public static final String FIELDNAME_BusinessPartner_M_PriceList_ID="6ac1aca1-9122-302d-d7ac-55d3f36178b8";

@XendraTrl(Identifier="0a000653-158d-d1fe-f52a-5d065c9b0f32")
public static String es_PE_FIELD_Vendor_M_PriceList_ID_Name="Lista de Precios";

@XendraTrl(Identifier="0a000653-158d-d1fe-f52a-5d065c9b0f32")
public static String es_PE_FIELD_Vendor_M_PriceList_ID_Description="Identificador único de mi lista de precios";

@XendraTrl(Identifier="0a000653-158d-d1fe-f52a-5d065c9b0f32")
public static String es_PE_FIELD_Vendor_M_PriceList_ID_Help="Listas de precios son usadas para determinar el precio; margen y costo de artículos comprados ó vendidos.";

@XendraField(AD_Column_ID="M_PriceList_ID",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0a000653-158d-d1fe-f52a-5d065c9b0f32")
public static final String FIELDNAME_Vendor_M_PriceList_ID="0a000653-158d-d1fe-f52a-5d065c9b0f32";

@XendraTrl(Identifier="e83d01e7-3021-3076-573a-889c206d99ac")
public static String es_PE_FIELD_Customer_M_PriceList_ID2_Name="Lista de Precios";

@XendraTrl(Identifier="e83d01e7-3021-3076-573a-889c206d99ac")
public static String es_PE_FIELD_Customer_M_PriceList_ID2_Description="Identificador único de mi lista de precios";

@XendraTrl(Identifier="e83d01e7-3021-3076-573a-889c206d99ac")
public static String es_PE_FIELD_Customer_M_PriceList_ID2_Help="Listas de precios son usadas para determinar el precio; margen y costo de artículos comprados ó vendidos.";

@XendraField(AD_Column_ID="M_PriceList_ID",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsCustomer@='Y'",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="e83d01e7-3021-3076-573a-889c206d99ac")
public static final String FIELDNAME_Customer_M_PriceList_ID2="e83d01e7-3021-3076-573a-889c206d99ac";

@XendraTrl(Identifier="23457dfd-d810-95c1-aa38-dedbb4029f32")
public static String es_PE_FIELD_Vendor_M_PriceList_ID2_Name="Lista de Precios";

@XendraTrl(Identifier="23457dfd-d810-95c1-aa38-dedbb4029f32")
public static String es_PE_FIELD_Vendor_M_PriceList_ID2_Description="Identificador único de mi lista de precios";

@XendraTrl(Identifier="23457dfd-d810-95c1-aa38-dedbb4029f32")
public static String es_PE_FIELD_Vendor_M_PriceList_ID2_Help="Listas de precios son usadas para determinar el precio; margen y costo de artículos comprados ó vendidos.";

@XendraField(AD_Column_ID="M_PriceList_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="23457dfd-d810-95c1-aa38-dedbb4029f32")
public static final String FIELDNAME_Vendor_M_PriceList_ID2="23457dfd-d810-95c1-aa38-dedbb4029f32";

@XendraTrl(Identifier="7d9062cc-3818-f821-f1ea-2c6b8a2104fe")
public static String es_PE_FIELD_BusinessPartner_M_PriceList_ID2_Name="Lista de Precios";

@XendraTrl(Identifier="7d9062cc-3818-f821-f1ea-2c6b8a2104fe")
public static String es_PE_FIELD_BusinessPartner_M_PriceList_ID2_Description="Identificador único de mi lista de precios";

@XendraTrl(Identifier="7d9062cc-3818-f821-f1ea-2c6b8a2104fe")
public static String es_PE_FIELD_BusinessPartner_M_PriceList_ID2_Help="Listas de precios son usadas para determinar el precio; margen y costo de artículos comprados ó vendidos.";

@XendraField(AD_Column_ID="M_PriceList_ID",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7d9062cc-3818-f821-f1ea-2c6b8a2104fe")
public static final String FIELDNAME_BusinessPartner_M_PriceList_ID2="7d9062cc-3818-f821-f1ea-2c6b8a2104fe";

@XendraTrl(Identifier="815c6d30-99cb-a4ba-da2f-3ee633a3e6ff")
public static String es_PE_COLUMN_M_PriceList_ID_Name="Lista de Precios";

@XendraColumn(AD_Element_ID="652afdd3-9ff1-082d-5831-6aad828e0e09",ColumnName="M_PriceList_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="815c6d30-99cb-a4ba-da2f-3ee633a3e6ff",
Synchronized="2019-08-30 22:21:10.0")
/** Column name M_PriceList_ID */
public static final String COLUMNNAME_M_PriceList_ID = "M_PriceList_ID";
/** Set NAICS/SIC.
@param NAICS Standard Industry Code or its successor NAIC - http://www.osha.gov/oshstats/sicser.html */
public void setNAICS (String NAICS)
{
if (NAICS != null && NAICS.length() > 6)
{
log.warning("Length > 6 - truncated");
NAICS = NAICS.substring(0,5);
}
set_Value (COLUMNNAME_NAICS, NAICS);
}
/** Get NAICS/SIC.
@return Standard Industry Code or its successor NAIC - http://www.osha.gov/oshstats/sicser.html */
public String getNAICS() 
{
String value = (String)get_Value(COLUMNNAME_NAICS);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="b01d95ab-81d7-b3f7-e9d6-6f8041c3193f")
public static String es_PE_FIELD_Employee_NAICSSIC_Name="NAICS/SIC";

@XendraTrl(Identifier="b01d95ab-81d7-b3f7-e9d6-6f8041c3193f")
public static String es_PE_FIELD_Employee_NAICSSIC_Description="Codigo estándard de la industria ó sucesor NAIC - http://www.osha.gov/oshstats/sicser.html";

@XendraTrl(Identifier="b01d95ab-81d7-b3f7-e9d6-6f8041c3193f")
public static String es_PE_FIELD_Employee_NAICSSIC_Help="El NAICS/SIC identifica cualquiera de esos códigos que puedan ser aplicables a este socio de negocio";

@XendraField(AD_Column_ID="NAICS",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=6,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b01d95ab-81d7-b3f7-e9d6-6f8041c3193f")
public static final String FIELDNAME_Employee_NAICSSIC="b01d95ab-81d7-b3f7-e9d6-6f8041c3193f";

@XendraTrl(Identifier="376e14c7-1011-5bca-3869-15fc6171c860")
public static String es_PE_FIELD_EmployeeVendor_NAICSSIC_Name="NAICS/SIC";

@XendraTrl(Identifier="376e14c7-1011-5bca-3869-15fc6171c860")
public static String es_PE_FIELD_EmployeeVendor_NAICSSIC_Description="Codigo estándard de la industria ó sucesor NAIC - http://www.osha.gov/oshstats/sicser.html";

@XendraTrl(Identifier="376e14c7-1011-5bca-3869-15fc6171c860")
public static String es_PE_FIELD_EmployeeVendor_NAICSSIC_Help="El NAICS/SIC identifica cualquiera de esos códigos que puedan ser aplicables a este socio de negocio";

@XendraField(AD_Column_ID="NAICS",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=6,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="376e14c7-1011-5bca-3869-15fc6171c860")
public static final String FIELDNAME_EmployeeVendor_NAICSSIC="376e14c7-1011-5bca-3869-15fc6171c860";

@XendraTrl(Identifier="055c8b2f-2d12-99cb-5eec-d8bbf6d76cbc")
public static String es_PE_FIELD_BusinessPartnerDimension_NAICSSIC_Name="NAICS/SIC";

@XendraTrl(Identifier="055c8b2f-2d12-99cb-5eec-d8bbf6d76cbc")
public static String es_PE_FIELD_BusinessPartnerDimension_NAICSSIC_Description="Codigo estándard de la industria ó sucesor NAIC - http://www.osha.gov/oshstats/sicser.html";

@XendraTrl(Identifier="055c8b2f-2d12-99cb-5eec-d8bbf6d76cbc")
public static String es_PE_FIELD_BusinessPartnerDimension_NAICSSIC_Help="El NAICS/SIC identifica cualquiera de esos códigos que puedan ser aplicables a este socio de negocio";

@XendraField(AD_Column_ID="NAICS",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=6,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="055c8b2f-2d12-99cb-5eec-d8bbf6d76cbc")
public static final String FIELDNAME_BusinessPartnerDimension_NAICSSIC="055c8b2f-2d12-99cb-5eec-d8bbf6d76cbc";

@XendraTrl(Identifier="42b4ae19-7ccb-f49f-989d-ae95b692c594")
public static String es_PE_FIELD_BusinessPartner_NAICSSIC_Name="NAICS/SIC";

@XendraTrl(Identifier="42b4ae19-7ccb-f49f-989d-ae95b692c594")
public static String es_PE_FIELD_BusinessPartner_NAICSSIC_Description="Codigo estándard de la industria ó sucesor NAIC - http://www.osha.gov/oshstats/sicser.html";

@XendraTrl(Identifier="42b4ae19-7ccb-f49f-989d-ae95b692c594")
public static String es_PE_FIELD_BusinessPartner_NAICSSIC_Help="El NAICS/SIC identifica cualquiera de esos códigos que puedan ser aplicables a este socio de negocio";

@XendraField(AD_Column_ID="NAICS",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=6,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="42b4ae19-7ccb-f49f-989d-ae95b692c594")
public static final String FIELDNAME_BusinessPartner_NAICSSIC="42b4ae19-7ccb-f49f-989d-ae95b692c594";

@XendraTrl(Identifier="f12154b8-3d4d-38c7-ef9a-b3255e978034")
public static String es_PE_FIELD_PartnerSelection_NAICSSIC_Name="NAICS/SIC";

@XendraTrl(Identifier="f12154b8-3d4d-38c7-ef9a-b3255e978034")
public static String es_PE_FIELD_PartnerSelection_NAICSSIC_Description="Codigo estándard de la industria ó sucesor NAIC - http://www.osha.gov/oshstats/sicser.html";

@XendraTrl(Identifier="f12154b8-3d4d-38c7-ef9a-b3255e978034")
public static String es_PE_FIELD_PartnerSelection_NAICSSIC_Help="El NAICS/SIC identifica cualquiera de esos códigos que puedan ser aplicables a este socio de negocio";

@XendraField(AD_Column_ID="NAICS",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=6,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f12154b8-3d4d-38c7-ef9a-b3255e978034")
public static final String FIELDNAME_PartnerSelection_NAICSSIC="f12154b8-3d4d-38c7-ef9a-b3255e978034";

@XendraTrl(Identifier="c1f3a209-ccd5-c337-934b-9d8002139625")
public static String es_PE_FIELD_Vendor_NAICSSIC_Name="NAICS/SIC";

@XendraTrl(Identifier="c1f3a209-ccd5-c337-934b-9d8002139625")
public static String es_PE_FIELD_Vendor_NAICSSIC_Description="Codigo estándard de la industria ó sucesor NAIC - http://www.osha.gov/oshstats/sicser.html";

@XendraTrl(Identifier="c1f3a209-ccd5-c337-934b-9d8002139625")
public static String es_PE_FIELD_Vendor_NAICSSIC_Help="El NAICS/SIC identifica cualquiera de esos códigos que puedan ser aplicables a este socio de negocio";

@XendraField(AD_Column_ID="NAICS",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=6,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c1f3a209-ccd5-c337-934b-9d8002139625")
public static final String FIELDNAME_Vendor_NAICSSIC="c1f3a209-ccd5-c337-934b-9d8002139625";

@XendraTrl(Identifier="3a0e990d-46c1-d717-0829-1e053ccdc2c7")
public static String es_PE_FIELD_Customer_NAICSSIC_Name="NAICS/SIC";

@XendraTrl(Identifier="3a0e990d-46c1-d717-0829-1e053ccdc2c7")
public static String es_PE_FIELD_Customer_NAICSSIC_Description="Codigo estándard de la industria ó sucesor NAIC - http://www.osha.gov/oshstats/sicser.html";

@XendraTrl(Identifier="3a0e990d-46c1-d717-0829-1e053ccdc2c7")
public static String es_PE_FIELD_Customer_NAICSSIC_Help="El NAICS/SIC identifica cualquiera de esos códigos que puedan ser aplicables a este socio de negocio";

@XendraField(AD_Column_ID="NAICS",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=6,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3a0e990d-46c1-d717-0829-1e053ccdc2c7")
public static final String FIELDNAME_Customer_NAICSSIC="3a0e990d-46c1-d717-0829-1e053ccdc2c7";

@XendraTrl(Identifier="e5d8a5ee-b766-5bec-3e88-c01d440b2c11")
public static String es_PE_FIELD_Customer_NAICSSIC2_Name="NAICS/SIC";

@XendraTrl(Identifier="e5d8a5ee-b766-5bec-3e88-c01d440b2c11")
public static String es_PE_FIELD_Customer_NAICSSIC2_Description="Codigo estándard de la industria ó sucesor NAIC - http://www.osha.gov/oshstats/sicser.html";

@XendraTrl(Identifier="e5d8a5ee-b766-5bec-3e88-c01d440b2c11")
public static String es_PE_FIELD_Customer_NAICSSIC2_Help="El NAICS/SIC identifica cualquiera de esos códigos que puedan ser aplicables a este socio de negocio";

@XendraField(AD_Column_ID="NAICS",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=6,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e5d8a5ee-b766-5bec-3e88-c01d440b2c11")
public static final String FIELDNAME_Customer_NAICSSIC2="e5d8a5ee-b766-5bec-3e88-c01d440b2c11";

@XendraTrl(Identifier="448f6fb5-c6f4-fbec-aaca-9fb080a91a5d")
public static String es_PE_FIELD_AssignedPartners_NAICSSIC_Name="NAICS/SIC";

@XendraTrl(Identifier="448f6fb5-c6f4-fbec-aaca-9fb080a91a5d")
public static String es_PE_FIELD_AssignedPartners_NAICSSIC_Description="Codigo estándard de la industria ó sucesor NAIC - http://www.osha.gov/oshstats/sicser.html";

@XendraTrl(Identifier="448f6fb5-c6f4-fbec-aaca-9fb080a91a5d")
public static String es_PE_FIELD_AssignedPartners_NAICSSIC_Help="El NAICS/SIC identifica cualquiera de esos códigos que puedan ser aplicables a este socio de negocio";

@XendraField(AD_Column_ID="NAICS",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="448f6fb5-c6f4-fbec-aaca-9fb080a91a5d")
public static final String FIELDNAME_AssignedPartners_NAICSSIC="448f6fb5-c6f4-fbec-aaca-9fb080a91a5d";

@XendraTrl(Identifier="0bdf83a0-73f6-9ca2-6bc9-634c3567b114")
public static String es_PE_FIELD_BusinessPartner_NAICSSIC2_Name="NAICS/SIC";

@XendraTrl(Identifier="0bdf83a0-73f6-9ca2-6bc9-634c3567b114")
public static String es_PE_FIELD_BusinessPartner_NAICSSIC2_Description="Codigo estándard de la industria ó sucesor NAIC - http://www.osha.gov/oshstats/sicser.html";

@XendraTrl(Identifier="0bdf83a0-73f6-9ca2-6bc9-634c3567b114")
public static String es_PE_FIELD_BusinessPartner_NAICSSIC2_Help="El NAICS/SIC identifica cualquiera de esos códigos que puedan ser aplicables a este socio de negocio";

@XendraField(AD_Column_ID="NAICS",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0bdf83a0-73f6-9ca2-6bc9-634c3567b114")
public static final String FIELDNAME_BusinessPartner_NAICSSIC2="0bdf83a0-73f6-9ca2-6bc9-634c3567b114";

@XendraTrl(Identifier="9edce282-91b8-046a-6708-195c4669ae18")
public static String es_PE_FIELD_Vendor_NAICSSIC2_Name="NAICS/SIC";

@XendraTrl(Identifier="9edce282-91b8-046a-6708-195c4669ae18")
public static String es_PE_FIELD_Vendor_NAICSSIC2_Description="Codigo estándard de la industria ó sucesor NAIC - http://www.osha.gov/oshstats/sicser.html";

@XendraTrl(Identifier="9edce282-91b8-046a-6708-195c4669ae18")
public static String es_PE_FIELD_Vendor_NAICSSIC2_Help="El NAICS/SIC identifica cualquiera de esos códigos que puedan ser aplicables a este socio de negocio";

@XendraField(AD_Column_ID="NAICS",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=6,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9edce282-91b8-046a-6708-195c4669ae18")
public static final String FIELDNAME_Vendor_NAICSSIC2="9edce282-91b8-046a-6708-195c4669ae18";

@XendraTrl(Identifier="26a975a1-c5e1-b496-2746-3c51e45bd977")
public static String es_PE_COLUMN_NAICS_Name="NAICS/SIC";

@XendraColumn(AD_Element_ID="8b0097fc-5337-5edd-c357-34f7861b14b7",ColumnName="NAICS",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=6,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="26a975a1-c5e1-b496-2746-3c51e45bd977",
Synchronized="2019-08-30 22:21:10.0")
/** Column name NAICS */
public static final String COLUMNNAME_NAICS = "NAICS";
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

@XendraTrl(Identifier="14f6fca4-e1b3-f142-4174-dcbbc25aa0ee")
public static String es_PE_FIELD_Employee_Name_Name="Nombre";

@XendraTrl(Identifier="14f6fca4-e1b3-f142-4174-dcbbc25aa0ee")
public static String es_PE_FIELD_Employee_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="14f6fca4-e1b3-f142-4174-dcbbc25aa0ee")
public static String es_PE_FIELD_Employee_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=true,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="14f6fca4-e1b3-f142-4174-dcbbc25aa0ee")
public static final String FIELDNAME_Employee_Name="14f6fca4-e1b3-f142-4174-dcbbc25aa0ee";

@XendraTrl(Identifier="fa1a70cb-a49d-f105-8211-917e858690e1")
public static String es_PE_FIELD_EmployeeVendor_Name_Name="Nombre";

@XendraTrl(Identifier="fa1a70cb-a49d-f105-8211-917e858690e1")
public static String es_PE_FIELD_EmployeeVendor_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="fa1a70cb-a49d-f105-8211-917e858690e1")
public static String es_PE_FIELD_EmployeeVendor_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=true,SeqNo=20,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fa1a70cb-a49d-f105-8211-917e858690e1")
public static final String FIELDNAME_EmployeeVendor_Name="fa1a70cb-a49d-f105-8211-917e858690e1";

@XendraTrl(Identifier="b9da65fa-8dfa-62b4-4824-2996bd7d89d2")
public static String es_PE_FIELD_Customer_Name_Name="Nombre";

@XendraTrl(Identifier="b9da65fa-8dfa-62b4-4824-2996bd7d89d2")
public static String es_PE_FIELD_Customer_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="b9da65fa-8dfa-62b4-4824-2996bd7d89d2")
public static String es_PE_FIELD_Customer_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=true,SeqNo=20,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b9da65fa-8dfa-62b4-4824-2996bd7d89d2")
public static final String FIELDNAME_Customer_Name="b9da65fa-8dfa-62b4-4824-2996bd7d89d2";

@XendraTrl(Identifier="18c40a88-35cf-5ccc-6f13-13e5e4517c2f")
public static String es_PE_FIELD_BusinessPartnerDimension_Name_Name="Nombre";

@XendraTrl(Identifier="18c40a88-35cf-5ccc-6f13-13e5e4517c2f")
public static String es_PE_FIELD_BusinessPartnerDimension_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="18c40a88-35cf-5ccc-6f13-13e5e4517c2f")
public static String es_PE_FIELD_BusinessPartnerDimension_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="18c40a88-35cf-5ccc-6f13-13e5e4517c2f")
public static final String FIELDNAME_BusinessPartnerDimension_Name="18c40a88-35cf-5ccc-6f13-13e5e4517c2f";

@XendraTrl(Identifier="0d7adb67-d366-f666-4add-fab1f4e39e1a")
public static String es_PE_FIELD_Vendor_Name_Name="Nombre";

@XendraTrl(Identifier="0d7adb67-d366-f666-4add-fab1f4e39e1a")
public static String es_PE_FIELD_Vendor_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="0d7adb67-d366-f666-4add-fab1f4e39e1a")
public static String es_PE_FIELD_Vendor_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=20,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0d7adb67-d366-f666-4add-fab1f4e39e1a")
public static final String FIELDNAME_Vendor_Name="0d7adb67-d366-f666-4add-fab1f4e39e1a";

@XendraTrl(Identifier="518b6fd3-3474-9148-862f-736aed052bca")
public static String es_PE_FIELD_PartnerSelection_Name_Name="Nombre";

@XendraTrl(Identifier="518b6fd3-3474-9148-862f-736aed052bca")
public static String es_PE_FIELD_PartnerSelection_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="518b6fd3-3474-9148-862f-736aed052bca")
public static String es_PE_FIELD_PartnerSelection_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="518b6fd3-3474-9148-862f-736aed052bca")
public static final String FIELDNAME_PartnerSelection_Name="518b6fd3-3474-9148-862f-736aed052bca";

@XendraTrl(Identifier="817ac48b-0ee5-d9e0-99a2-24ee59409c10")
public static String es_PE_FIELD_BusinessPartner_Name_Name="Nombre";

@XendraTrl(Identifier="817ac48b-0ee5-d9e0-99a2-24ee59409c10")
public static String es_PE_FIELD_BusinessPartner_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="817ac48b-0ee5-d9e0-99a2-24ee59409c10")
public static String es_PE_FIELD_BusinessPartner_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="817ac48b-0ee5-d9e0-99a2-24ee59409c10")
public static final String FIELDNAME_BusinessPartner_Name="817ac48b-0ee5-d9e0-99a2-24ee59409c10";

@XendraTrl(Identifier="d13589b1-0fc6-7ae9-c1cd-9f9c9006652f")
public static String es_PE_FIELD_AssignedPartners_Name_Name="Nombre";

@XendraTrl(Identifier="d13589b1-0fc6-7ae9-c1cd-9f9c9006652f")
public static String es_PE_FIELD_AssignedPartners_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="d13589b1-0fc6-7ae9-c1cd-9f9c9006652f")
public static String es_PE_FIELD_AssignedPartners_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d13589b1-0fc6-7ae9-c1cd-9f9c9006652f")
public static final String FIELDNAME_AssignedPartners_Name="d13589b1-0fc6-7ae9-c1cd-9f9c9006652f";

@XendraTrl(Identifier="2b6edcaa-beb0-d0c8-e3d5-de6ccd573c6a")
public static String es_PE_FIELD_Customer_Name2_Name="Nombre";

@XendraTrl(Identifier="2b6edcaa-beb0-d0c8-e3d5-de6ccd573c6a")
public static String es_PE_FIELD_Customer_Name2_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="2b6edcaa-beb0-d0c8-e3d5-de6ccd573c6a")
public static String es_PE_FIELD_Customer_Name2_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=true,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2b6edcaa-beb0-d0c8-e3d5-de6ccd573c6a")
public static final String FIELDNAME_Customer_Name2="2b6edcaa-beb0-d0c8-e3d5-de6ccd573c6a";

@XendraTrl(Identifier="3d45c7ef-4df1-bb0e-4cd5-2e7cc633c99e")
public static String es_PE_FIELD_Vendor_Name2_Name="Nombre";

@XendraTrl(Identifier="3d45c7ef-4df1-bb0e-4cd5-2e7cc633c99e")
public static String es_PE_FIELD_Vendor_Name2_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="3d45c7ef-4df1-bb0e-4cd5-2e7cc633c99e")
public static String es_PE_FIELD_Vendor_Name2_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=true,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3d45c7ef-4df1-bb0e-4cd5-2e7cc633c99e")
public static final String FIELDNAME_Vendor_Name2="3d45c7ef-4df1-bb0e-4cd5-2e7cc633c99e";

@XendraTrl(Identifier="66680b9f-a34f-13ab-c0cf-14717af2e703")
public static String es_PE_FIELD_BusinessPartner_Name2_Name="Nombre";

@XendraTrl(Identifier="66680b9f-a34f-13ab-c0cf-14717af2e703")
public static String es_PE_FIELD_BusinessPartner_Name2_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="66680b9f-a34f-13ab-c0cf-14717af2e703")
public static String es_PE_FIELD_BusinessPartner_Name2_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="66680b9f-a34f-13ab-c0cf-14717af2e703")
public static final String FIELDNAME_BusinessPartner_Name2="66680b9f-a34f-13ab-c0cf-14717af2e703";

@XendraTrl(Identifier="ef6fa04f-061b-ef29-6d26-61989cf6d53e")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ef6fa04f-061b-ef29-6d26-61989cf6d53e",
Synchronized="2019-08-30 22:21:10.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Name 2.
@param Name2 Additional Name */
public void setName2 (String Name2)
{
if (Name2 != null && Name2.length() > 60)
{
log.warning("Length > 60 - truncated");
Name2 = Name2.substring(0,59);
}
set_Value (COLUMNNAME_Name2, Name2);
}
/** Get Name 2.
@return Additional Name */
public String getName2() 
{
String value = (String)get_Value(COLUMNNAME_Name2);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="945ec328-3492-3546-b683-220d5e7de72c")
public static String es_PE_FIELD_BusinessPartner_Name23_Name="Nombre 2";

@XendraTrl(Identifier="945ec328-3492-3546-b683-220d5e7de72c")
public static String es_PE_FIELD_BusinessPartner_Name23_Description="Nombre adicional";

@XendraField(AD_Column_ID="Name2",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="945ec328-3492-3546-b683-220d5e7de72c")
public static final String FIELDNAME_BusinessPartner_Name23="945ec328-3492-3546-b683-220d5e7de72c";

@XendraTrl(Identifier="2337ae19-d70b-c4b5-facf-674e2af45104")
public static String es_PE_FIELD_PartnerSelection_Name22_Name="Nombre 2";

@XendraTrl(Identifier="2337ae19-d70b-c4b5-facf-674e2af45104")
public static String es_PE_FIELD_PartnerSelection_Name22_Description="Nombre adicional";

@XendraField(AD_Column_ID="Name2",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2337ae19-d70b-c4b5-facf-674e2af45104")
public static final String FIELDNAME_PartnerSelection_Name22="2337ae19-d70b-c4b5-facf-674e2af45104";

@XendraTrl(Identifier="cc916bda-dd85-057e-f0a5-164892627f97")
public static String es_PE_FIELD_Vendor_Name23_Name="Nombre 2";

@XendraTrl(Identifier="cc916bda-dd85-057e-f0a5-164892627f97")
public static String es_PE_FIELD_Vendor_Name23_Description="Nombre adicional";

@XendraField(AD_Column_ID="Name2",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cc916bda-dd85-057e-f0a5-164892627f97")
public static final String FIELDNAME_Vendor_Name23="cc916bda-dd85-057e-f0a5-164892627f97";

@XendraTrl(Identifier="35bc3448-19fc-6c46-e524-c019b9d9b910")
public static String es_PE_FIELD_Vendor_Name24_Name="Nombre 2";

@XendraTrl(Identifier="35bc3448-19fc-6c46-e524-c019b9d9b910")
public static String es_PE_FIELD_Vendor_Name24_Description="Nombre adicional";

@XendraField(AD_Column_ID="Name2",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="35bc3448-19fc-6c46-e524-c019b9d9b910")
public static final String FIELDNAME_Vendor_Name24="35bc3448-19fc-6c46-e524-c019b9d9b910";

@XendraTrl(Identifier="c9ef181d-3bed-535d-1cd7-deb8d2b2452c")
public static String es_PE_FIELD_Employee_Name22_Name="Nombre 2";

@XendraTrl(Identifier="c9ef181d-3bed-535d-1cd7-deb8d2b2452c")
public static String es_PE_FIELD_Employee_Name22_Description="Nombre adicional";

@XendraField(AD_Column_ID="Name2",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c9ef181d-3bed-535d-1cd7-deb8d2b2452c")
public static final String FIELDNAME_Employee_Name22="c9ef181d-3bed-535d-1cd7-deb8d2b2452c";

@XendraTrl(Identifier="159b8049-3c12-a902-2478-eeaa847a8637")
public static String es_PE_FIELD_BusinessPartnerDimension_Name22_Name="Nombre 2";

@XendraTrl(Identifier="159b8049-3c12-a902-2478-eeaa847a8637")
public static String es_PE_FIELD_BusinessPartnerDimension_Name22_Description="Nombre adicional";

@XendraField(AD_Column_ID="Name2",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="159b8049-3c12-a902-2478-eeaa847a8637")
public static final String FIELDNAME_BusinessPartnerDimension_Name22="159b8049-3c12-a902-2478-eeaa847a8637";

@XendraTrl(Identifier="0c7e29a4-dfe9-df6a-50df-bf987d931d3a")
public static String es_PE_FIELD_Customer_Name23_Name="Nombre 2";

@XendraTrl(Identifier="0c7e29a4-dfe9-df6a-50df-bf987d931d3a")
public static String es_PE_FIELD_Customer_Name23_Description="Nombre adicional";

@XendraField(AD_Column_ID="Name2",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0c7e29a4-dfe9-df6a-50df-bf987d931d3a")
public static final String FIELDNAME_Customer_Name23="0c7e29a4-dfe9-df6a-50df-bf987d931d3a";

@XendraTrl(Identifier="f076fc28-e861-796a-4b9c-624114fd5502")
public static String es_PE_FIELD_EmployeeVendor_Name22_Name="Nombre 2";

@XendraTrl(Identifier="f076fc28-e861-796a-4b9c-624114fd5502")
public static String es_PE_FIELD_EmployeeVendor_Name22_Description="Nombre adicional";

@XendraField(AD_Column_ID="Name2",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f076fc28-e861-796a-4b9c-624114fd5502")
public static final String FIELDNAME_EmployeeVendor_Name22="f076fc28-e861-796a-4b9c-624114fd5502";

@XendraTrl(Identifier="475a41f2-f3ff-4dda-fe2b-97feb64927e8")
public static String es_PE_FIELD_AssignedPartners_Name22_Name="Nombre 2";

@XendraTrl(Identifier="475a41f2-f3ff-4dda-fe2b-97feb64927e8")
public static String es_PE_FIELD_AssignedPartners_Name22_Description="Nombre adicional";

@XendraField(AD_Column_ID="Name2",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="475a41f2-f3ff-4dda-fe2b-97feb64927e8")
public static final String FIELDNAME_AssignedPartners_Name22="475a41f2-f3ff-4dda-fe2b-97feb64927e8";

@XendraTrl(Identifier="60b867a4-071f-7d3f-bcaa-323bfdeb2f9d")
public static String es_PE_FIELD_Customer_Name24_Name="Nombre 2";

@XendraTrl(Identifier="60b867a4-071f-7d3f-bcaa-323bfdeb2f9d")
public static String es_PE_FIELD_Customer_Name24_Description="Nombre adicional";

@XendraField(AD_Column_ID="Name2",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="60b867a4-071f-7d3f-bcaa-323bfdeb2f9d")
public static final String FIELDNAME_Customer_Name24="60b867a4-071f-7d3f-bcaa-323bfdeb2f9d";

@XendraTrl(Identifier="d8b10ede-c20d-8338-9c99-3a2ecf25ee30")
public static String es_PE_FIELD_BusinessPartner_Name24_Name="Nombre 2";

@XendraTrl(Identifier="d8b10ede-c20d-8338-9c99-3a2ecf25ee30")
public static String es_PE_FIELD_BusinessPartner_Name24_Description="Nombre adicional";

@XendraField(AD_Column_ID="Name2",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d8b10ede-c20d-8338-9c99-3a2ecf25ee30")
public static final String FIELDNAME_BusinessPartner_Name24="d8b10ede-c20d-8338-9c99-3a2ecf25ee30";

@XendraTrl(Identifier="3c14b7a8-4a13-efb9-906f-0b84f600d680")
public static String es_PE_COLUMN_Name2_Name="Nombre 2";

@XendraColumn(AD_Element_ID="afe4eb43-576b-b3f0-6f41-91106bd959fd",ColumnName="Name2",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3c14b7a8-4a13-efb9-906f-0b84f600d680",
Synchronized="2019-08-30 22:21:10.0")
/** Column name Name2 */
public static final String COLUMNNAME_Name2 = "Name2";
/** Set Employees.
@param NumberEmployees Number of employees */
public void setNumberEmployees (int NumberEmployees)
{
set_Value (COLUMNNAME_NumberEmployees, Integer.valueOf(NumberEmployees));
}
/** Get Employees.
@return Number of employees */
public int getNumberEmployees() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_NumberEmployees);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a989d5f6-737e-1668-0932-6b2436d996b2")
public static String es_PE_FIELD_EmployeeVendor_Employees_Name="Empleados";

@XendraTrl(Identifier="a989d5f6-737e-1668-0932-6b2436d996b2")
public static String es_PE_FIELD_EmployeeVendor_Employees_Description="Número de empleados";

@XendraTrl(Identifier="a989d5f6-737e-1668-0932-6b2436d996b2")
public static String es_PE_FIELD_EmployeeVendor_Employees_Help="Indica el número de empleados de este socio de negocio. Este campo se despliega solamente para prospectos.";

@XendraField(AD_Column_ID="NumberEmployees",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a989d5f6-737e-1668-0932-6b2436d996b2")
public static final String FIELDNAME_EmployeeVendor_Employees="a989d5f6-737e-1668-0932-6b2436d996b2";

@XendraTrl(Identifier="92654bf0-ca69-fa17-b9df-a0fd7832a51e")
public static String es_PE_FIELD_Vendor_Employees_Name="Empleados";

@XendraTrl(Identifier="92654bf0-ca69-fa17-b9df-a0fd7832a51e")
public static String es_PE_FIELD_Vendor_Employees_Description="Número de empleados";

@XendraTrl(Identifier="92654bf0-ca69-fa17-b9df-a0fd7832a51e")
public static String es_PE_FIELD_Vendor_Employees_Help="Indica el número de empleados de este socio de negocio. Este campo se despliega solamente para prospectos.";

@XendraField(AD_Column_ID="NumberEmployees",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="92654bf0-ca69-fa17-b9df-a0fd7832a51e")
public static final String FIELDNAME_Vendor_Employees="92654bf0-ca69-fa17-b9df-a0fd7832a51e";

@XendraTrl(Identifier="cfac0c29-ed0b-b22b-4530-dae9e10e6578")
public static String es_PE_FIELD_Customer_Employees_Name="Empleados";

@XendraTrl(Identifier="cfac0c29-ed0b-b22b-4530-dae9e10e6578")
public static String es_PE_FIELD_Customer_Employees_Description="Número de empleados";

@XendraTrl(Identifier="cfac0c29-ed0b-b22b-4530-dae9e10e6578")
public static String es_PE_FIELD_Customer_Employees_Help="Indica el número de empleados de este socio de negocio. Este campo se despliega solamente para prospectos.";

@XendraField(AD_Column_ID="NumberEmployees",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cfac0c29-ed0b-b22b-4530-dae9e10e6578")
public static final String FIELDNAME_Customer_Employees="cfac0c29-ed0b-b22b-4530-dae9e10e6578";

@XendraTrl(Identifier="3c6c4a50-8f05-a709-dd88-30ac839a0298")
public static String es_PE_FIELD_BusinessPartner_Employees_Name="Empleados";

@XendraTrl(Identifier="3c6c4a50-8f05-a709-dd88-30ac839a0298")
public static String es_PE_FIELD_BusinessPartner_Employees_Description="Número de empleados";

@XendraTrl(Identifier="3c6c4a50-8f05-a709-dd88-30ac839a0298")
public static String es_PE_FIELD_BusinessPartner_Employees_Help="Indica el número de empleados de este socio de negocio. Este campo se despliega solamente para prospectos.";

@XendraField(AD_Column_ID="NumberEmployees",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3c6c4a50-8f05-a709-dd88-30ac839a0298")
public static final String FIELDNAME_BusinessPartner_Employees="3c6c4a50-8f05-a709-dd88-30ac839a0298";

@XendraTrl(Identifier="a1e4d492-4838-9fdb-029d-72ab44f0aa71")
public static String es_PE_FIELD_BusinessPartnerDimension_Employees_Name="Empleados";

@XendraTrl(Identifier="a1e4d492-4838-9fdb-029d-72ab44f0aa71")
public static String es_PE_FIELD_BusinessPartnerDimension_Employees_Description="Número de empleados";

@XendraTrl(Identifier="a1e4d492-4838-9fdb-029d-72ab44f0aa71")
public static String es_PE_FIELD_BusinessPartnerDimension_Employees_Help="Indica el número de empleados de este socio de negocio. Este campo se despliega solamente para prospectos.";

@XendraField(AD_Column_ID="NumberEmployees",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a1e4d492-4838-9fdb-029d-72ab44f0aa71")
public static final String FIELDNAME_BusinessPartnerDimension_Employees="a1e4d492-4838-9fdb-029d-72ab44f0aa71";

@XendraTrl(Identifier="31cadac6-9ec9-8347-c84a-d26f2f3b56dd")
public static String es_PE_FIELD_Vendor_Employees2_Name="Empleados";

@XendraTrl(Identifier="31cadac6-9ec9-8347-c84a-d26f2f3b56dd")
public static String es_PE_FIELD_Vendor_Employees2_Description="Número de empleados";

@XendraTrl(Identifier="31cadac6-9ec9-8347-c84a-d26f2f3b56dd")
public static String es_PE_FIELD_Vendor_Employees2_Help="Indica el número de empleados de este socio de negocio. Este campo se despliega solamente para prospectos.";

@XendraField(AD_Column_ID="NumberEmployees",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="31cadac6-9ec9-8347-c84a-d26f2f3b56dd")
public static final String FIELDNAME_Vendor_Employees2="31cadac6-9ec9-8347-c84a-d26f2f3b56dd";

@XendraTrl(Identifier="299f11c5-9c76-3383-382f-88ba7ee5a2f4")
public static String es_PE_FIELD_PartnerSelection_Employees_Name="Empleados";

@XendraTrl(Identifier="299f11c5-9c76-3383-382f-88ba7ee5a2f4")
public static String es_PE_FIELD_PartnerSelection_Employees_Description="Número de empleados";

@XendraTrl(Identifier="299f11c5-9c76-3383-382f-88ba7ee5a2f4")
public static String es_PE_FIELD_PartnerSelection_Employees_Help="Indica el número de empleados de este socio de negocio. Este campo se despliega solamente para prospectos.";

@XendraField(AD_Column_ID="NumberEmployees",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="299f11c5-9c76-3383-382f-88ba7ee5a2f4")
public static final String FIELDNAME_PartnerSelection_Employees="299f11c5-9c76-3383-382f-88ba7ee5a2f4";

@XendraTrl(Identifier="0887d0bb-467a-f050-5b13-b45400da3a84")
public static String es_PE_FIELD_Employee_Employees_Name="Empleados";

@XendraTrl(Identifier="0887d0bb-467a-f050-5b13-b45400da3a84")
public static String es_PE_FIELD_Employee_Employees_Description="Número de empleados";

@XendraTrl(Identifier="0887d0bb-467a-f050-5b13-b45400da3a84")
public static String es_PE_FIELD_Employee_Employees_Help="Indica el número de empleados de este socio de negocio. Este campo se despliega solamente para prospectos.";

@XendraField(AD_Column_ID="NumberEmployees",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0887d0bb-467a-f050-5b13-b45400da3a84")
public static final String FIELDNAME_Employee_Employees="0887d0bb-467a-f050-5b13-b45400da3a84";

@XendraTrl(Identifier="27d97183-3a7f-be5f-f53f-0448e513fdef")
public static String es_PE_FIELD_AssignedPartners_Employees_Name="Empleados";

@XendraTrl(Identifier="27d97183-3a7f-be5f-f53f-0448e513fdef")
public static String es_PE_FIELD_AssignedPartners_Employees_Description="Número de empleados";

@XendraTrl(Identifier="27d97183-3a7f-be5f-f53f-0448e513fdef")
public static String es_PE_FIELD_AssignedPartners_Employees_Help="Indica el número de empleados de este socio de negocio. Este campo se despliega solamente para prospectos.";

@XendraField(AD_Column_ID="NumberEmployees",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=250,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="27d97183-3a7f-be5f-f53f-0448e513fdef")
public static final String FIELDNAME_AssignedPartners_Employees="27d97183-3a7f-be5f-f53f-0448e513fdef";

@XendraTrl(Identifier="6772ee51-4a3d-5789-673c-fb86e3ce1c43")
public static String es_PE_FIELD_Customer_Employees2_Name="Empleados";

@XendraTrl(Identifier="6772ee51-4a3d-5789-673c-fb86e3ce1c43")
public static String es_PE_FIELD_Customer_Employees2_Description="Número de empleados";

@XendraTrl(Identifier="6772ee51-4a3d-5789-673c-fb86e3ce1c43")
public static String es_PE_FIELD_Customer_Employees2_Help="Indica el número de empleados de este socio de negocio. Este campo se despliega solamente para prospectos.";

@XendraField(AD_Column_ID="NumberEmployees",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6772ee51-4a3d-5789-673c-fb86e3ce1c43")
public static final String FIELDNAME_Customer_Employees2="6772ee51-4a3d-5789-673c-fb86e3ce1c43";

@XendraTrl(Identifier="43706bcf-e5d5-f7ce-3b93-93cb04fb7788")
public static String es_PE_FIELD_BusinessPartner_Employees2_Name="Empleados";

@XendraTrl(Identifier="43706bcf-e5d5-f7ce-3b93-93cb04fb7788")
public static String es_PE_FIELD_BusinessPartner_Employees2_Description="Número de empleados";

@XendraTrl(Identifier="43706bcf-e5d5-f7ce-3b93-93cb04fb7788")
public static String es_PE_FIELD_BusinessPartner_Employees2_Help="Indica el número de empleados de este socio de negocio. Este campo se despliega solamente para prospectos.";

@XendraField(AD_Column_ID="NumberEmployees",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsEmployee@=N",DisplayLength=11,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="43706bcf-e5d5-f7ce-3b93-93cb04fb7788")
public static final String FIELDNAME_BusinessPartner_Employees2="43706bcf-e5d5-f7ce-3b93-93cb04fb7788";

@XendraTrl(Identifier="1ab4a9b4-2c44-2a86-6394-10cee03ead82")
public static String es_PE_COLUMN_NumberEmployees_Name="Empleados";

@XendraColumn(AD_Element_ID="d506e9bf-a944-aa26-3eaa-004391d1b334",ColumnName="NumberEmployees",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1ab4a9b4-2c44-2a86-6394-10cee03ead82",
Synchronized="2019-08-30 22:21:10.0")
/** Column name NumberEmployees */
public static final String COLUMNNAME_NumberEmployees = "NumberEmployees";
/** Set Payment Rule.
@param PaymentRule How you pay the invoice */
public void setPaymentRule (String PaymentRule)
{
if (PaymentRule != null && PaymentRule.length() > 1)
{
log.warning("Length > 1 - truncated");
PaymentRule = PaymentRule.substring(0,0);
}
set_Value (COLUMNNAME_PaymentRule, PaymentRule);
}
/** Get Payment Rule.
@return How you pay the invoice */
public String getPaymentRule() 
{
return (String)get_Value(COLUMNNAME_PaymentRule);
}

@XendraTrl(Identifier="d9342e23-4f46-e446-1f8d-154997faf9a3")
public static String es_PE_FIELD_Employee_PaymentRule_Name="Regla de Pago";

@XendraTrl(Identifier="d9342e23-4f46-e446-1f8d-154997faf9a3")
public static String es_PE_FIELD_Employee_PaymentRule_Description="Como se pagará la factura";

@XendraTrl(Identifier="d9342e23-4f46-e446-1f8d-154997faf9a3")
public static String es_PE_FIELD_Employee_PaymentRule_Help="La Regla de Pagos indica el método de pago de la factura";

@XendraField(AD_Column_ID="PaymentRule",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d9342e23-4f46-e446-1f8d-154997faf9a3")
public static final String FIELDNAME_Employee_PaymentRule="d9342e23-4f46-e446-1f8d-154997faf9a3";

@XendraTrl(Identifier="082a8e96-1b0a-432e-2c48-b22a96b7ccf5")
public static String es_PE_FIELD_Customer_PaymentRule_Name="Regla de Pago";

@XendraTrl(Identifier="082a8e96-1b0a-432e-2c48-b22a96b7ccf5")
public static String es_PE_FIELD_Customer_PaymentRule_Description="Como se pagará la factura";

@XendraTrl(Identifier="082a8e96-1b0a-432e-2c48-b22a96b7ccf5")
public static String es_PE_FIELD_Customer_PaymentRule_Help="La Regla de Pagos indica el método de pago de la factura";

@XendraField(AD_Column_ID="PaymentRule",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsCustomer@='Y'",DisplayLength=14,IsReadOnly=false,SeqNo=130,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="082a8e96-1b0a-432e-2c48-b22a96b7ccf5")
public static final String FIELDNAME_Customer_PaymentRule="082a8e96-1b0a-432e-2c48-b22a96b7ccf5";

@XendraTrl(Identifier="fd544d09-48c2-ae66-5916-8042f85c47cb")
public static String es_PE_FIELD_EmployeeVendor_PaymentRule_Name="Regla de Pago";

@XendraTrl(Identifier="fd544d09-48c2-ae66-5916-8042f85c47cb")
public static String es_PE_FIELD_EmployeeVendor_PaymentRule_Description="Como se pagará la factura";

@XendraTrl(Identifier="fd544d09-48c2-ae66-5916-8042f85c47cb")
public static String es_PE_FIELD_EmployeeVendor_PaymentRule_Help="La Regla de Pagos indica el método de pago de la factura";

@XendraField(AD_Column_ID="PaymentRule",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fd544d09-48c2-ae66-5916-8042f85c47cb")
public static final String FIELDNAME_EmployeeVendor_PaymentRule="fd544d09-48c2-ae66-5916-8042f85c47cb";

@XendraTrl(Identifier="6178e3ca-064a-bd32-cc56-1f22818630b4")
public static String es_PE_FIELD_BusinessPartnerDimension_PaymentRule_Name="Regla de Pago";

@XendraTrl(Identifier="6178e3ca-064a-bd32-cc56-1f22818630b4")
public static String es_PE_FIELD_BusinessPartnerDimension_PaymentRule_Description="Como se pagará la factura";

@XendraTrl(Identifier="6178e3ca-064a-bd32-cc56-1f22818630b4")
public static String es_PE_FIELD_BusinessPartnerDimension_PaymentRule_Help="La Regla de Pagos indica el método de pago de la factura";

@XendraField(AD_Column_ID="PaymentRule",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6178e3ca-064a-bd32-cc56-1f22818630b4")
public static final String FIELDNAME_BusinessPartnerDimension_PaymentRule="6178e3ca-064a-bd32-cc56-1f22818630b4";

@XendraTrl(Identifier="99fef775-384e-7ca7-a78f-7d16ada09ab8")
public static String es_PE_FIELD_PartnerSelection_PaymentRule_Name="Regla de Pago";

@XendraTrl(Identifier="99fef775-384e-7ca7-a78f-7d16ada09ab8")
public static String es_PE_FIELD_PartnerSelection_PaymentRule_Description="Como se pagará la factura";

@XendraTrl(Identifier="99fef775-384e-7ca7-a78f-7d16ada09ab8")
public static String es_PE_FIELD_PartnerSelection_PaymentRule_Help="La Regla de Pagos indica el método de pago de la factura";

@XendraField(AD_Column_ID="PaymentRule",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="99fef775-384e-7ca7-a78f-7d16ada09ab8")
public static final String FIELDNAME_PartnerSelection_PaymentRule="99fef775-384e-7ca7-a78f-7d16ada09ab8";

@XendraTrl(Identifier="6c92baf6-0e1b-7b19-adeb-df0c1f4d8103")
public static String es_PE_FIELD_Vendor_PaymentRule_Name="Regla de Pago";

@XendraTrl(Identifier="6c92baf6-0e1b-7b19-adeb-df0c1f4d8103")
public static String es_PE_FIELD_Vendor_PaymentRule_Description="Como se pagará la factura";

@XendraTrl(Identifier="6c92baf6-0e1b-7b19-adeb-df0c1f4d8103")
public static String es_PE_FIELD_Vendor_PaymentRule_Help="La Regla de Pagos indica el método de pago de la factura";

@XendraField(AD_Column_ID="PaymentRule",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6c92baf6-0e1b-7b19-adeb-df0c1f4d8103")
public static final String FIELDNAME_Vendor_PaymentRule="6c92baf6-0e1b-7b19-adeb-df0c1f4d8103";

@XendraTrl(Identifier="fd93d1cf-12b7-010f-5221-cbc354e8f85f")
public static String es_PE_FIELD_Customer_PaymentRule2_Name="Regla de Pago";

@XendraTrl(Identifier="fd93d1cf-12b7-010f-5221-cbc354e8f85f")
public static String es_PE_FIELD_Customer_PaymentRule2_Description="Como se pagará la factura";

@XendraTrl(Identifier="fd93d1cf-12b7-010f-5221-cbc354e8f85f")
public static String es_PE_FIELD_Customer_PaymentRule2_Help="La Regla de Pagos indica el método de pago de la factura";

@XendraField(AD_Column_ID="PaymentRule",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fd93d1cf-12b7-010f-5221-cbc354e8f85f")
public static final String FIELDNAME_Customer_PaymentRule2="fd93d1cf-12b7-010f-5221-cbc354e8f85f";

@XendraTrl(Identifier="2a3a9545-82a4-621f-df40-4f3e68d408f1")
public static String es_PE_FIELD_BusinessPartner_PaymentRule_Name="Regla de Pago";

@XendraTrl(Identifier="2a3a9545-82a4-621f-df40-4f3e68d408f1")
public static String es_PE_FIELD_BusinessPartner_PaymentRule_Description="Como se pagará la factura";

@XendraTrl(Identifier="2a3a9545-82a4-621f-df40-4f3e68d408f1")
public static String es_PE_FIELD_BusinessPartner_PaymentRule_Help="La Regla de Pagos indica el método de pago de la factura";

@XendraField(AD_Column_ID="PaymentRule",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2a3a9545-82a4-621f-df40-4f3e68d408f1")
public static final String FIELDNAME_BusinessPartner_PaymentRule="2a3a9545-82a4-621f-df40-4f3e68d408f1";

@XendraTrl(Identifier="aca8993c-5641-db70-514d-7b5c7481ad00")
public static String es_PE_FIELD_AssignedPartners_PaymentRule_Name="Regla de Pago";

@XendraTrl(Identifier="aca8993c-5641-db70-514d-7b5c7481ad00")
public static String es_PE_FIELD_AssignedPartners_PaymentRule_Description="Como se pagará la factura";

@XendraTrl(Identifier="aca8993c-5641-db70-514d-7b5c7481ad00")
public static String es_PE_FIELD_AssignedPartners_PaymentRule_Help="La Regla de Pagos indica el método de pago de la factura";

@XendraField(AD_Column_ID="PaymentRule",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="aca8993c-5641-db70-514d-7b5c7481ad00")
public static final String FIELDNAME_AssignedPartners_PaymentRule="aca8993c-5641-db70-514d-7b5c7481ad00";

@XendraTrl(Identifier="d63fefe1-c6ef-8b70-01f7-70c4248f1df6")
public static String es_PE_FIELD_BusinessPartner_PaymentRule2_Name="Regla de Pago";

@XendraTrl(Identifier="d63fefe1-c6ef-8b70-01f7-70c4248f1df6")
public static String es_PE_FIELD_BusinessPartner_PaymentRule2_Description="Como se pagará la factura";

@XendraTrl(Identifier="d63fefe1-c6ef-8b70-01f7-70c4248f1df6")
public static String es_PE_FIELD_BusinessPartner_PaymentRule2_Help="La Regla de Pagos indica el método de pago de la factura";

@XendraField(AD_Column_ID="PaymentRule",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d63fefe1-c6ef-8b70-01f7-70c4248f1df6")
public static final String FIELDNAME_BusinessPartner_PaymentRule2="d63fefe1-c6ef-8b70-01f7-70c4248f1df6";

@XendraTrl(Identifier="2d8ac33f-8059-bbd9-6262-d7b5236d5aa9")
public static String es_PE_FIELD_Vendor_PaymentRule2_Name="Regla de Pago";

@XendraTrl(Identifier="2d8ac33f-8059-bbd9-6262-d7b5236d5aa9")
public static String es_PE_FIELD_Vendor_PaymentRule2_Description="Como se pagará la factura";

@XendraTrl(Identifier="2d8ac33f-8059-bbd9-6262-d7b5236d5aa9")
public static String es_PE_FIELD_Vendor_PaymentRule2_Help="La Regla de Pagos indica el método de pago de la factura";

@XendraField(AD_Column_ID="PaymentRule",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2d8ac33f-8059-bbd9-6262-d7b5236d5aa9")
public static final String FIELDNAME_Vendor_PaymentRule2="2d8ac33f-8059-bbd9-6262-d7b5236d5aa9";

@XendraTrl(Identifier="13d84335-948d-498a-298f-021a3b43eca6")
public static String es_PE_COLUMN_PaymentRule_Name="Regla de Pago";

@XendraColumn(AD_Element_ID="5074db21-c657-2d23-63dc-80f0c5f2d4cc",ColumnName="PaymentRule",
AD_Reference_ID=17,AD_Reference_Value_ID="ac003b85-a929-cc48-3def-1a8f7b1adc7b",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="13d84335-948d-498a-298f-021a3b43eca6",Synchronized="2019-08-30 22:21:10.0")
/** Column name PaymentRule */
public static final String COLUMNNAME_PaymentRule = "PaymentRule";
/** Set Payment Rule.
@param PaymentRulePO Purchase payment option */
public void setPaymentRulePO (String PaymentRulePO)
{
if (PaymentRulePO != null && PaymentRulePO.length() > 1)
{
log.warning("Length > 1 - truncated");
PaymentRulePO = PaymentRulePO.substring(0,0);
}
set_Value (COLUMNNAME_PaymentRulePO, PaymentRulePO);
}
/** Get Payment Rule.
@return Purchase payment option */
public String getPaymentRulePO() 
{
return (String)get_Value(COLUMNNAME_PaymentRulePO);
}

@XendraTrl(Identifier="8022fd31-bd48-4df9-890e-bd447f3d5dda")
public static String es_PE_FIELD_Vendor_PaymentRule3_Name="Regla de Pago";

@XendraTrl(Identifier="8022fd31-bd48-4df9-890e-bd447f3d5dda")
public static String es_PE_FIELD_Vendor_PaymentRule3_Description="Opción de pago por compras";

@XendraTrl(Identifier="8022fd31-bd48-4df9-890e-bd447f3d5dda")
public static String es_PE_FIELD_Vendor_PaymentRule3_Help="La Regla de Pago indica el método de pago de las compras";

@XendraField(AD_Column_ID="PaymentRulePO",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsVendor@='Y'",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8022fd31-bd48-4df9-890e-bd447f3d5dda")
public static final String FIELDNAME_Vendor_PaymentRule3="8022fd31-bd48-4df9-890e-bd447f3d5dda";

@XendraTrl(Identifier="13271622-02b3-c27e-5a4d-937d27225fe2")
public static String es_PE_FIELD_BusinessPartnerDimension_PaymentRule2_Name="Regla de Pago";

@XendraTrl(Identifier="13271622-02b3-c27e-5a4d-937d27225fe2")
public static String es_PE_FIELD_BusinessPartnerDimension_PaymentRule2_Description="Opción de pago por compras";

@XendraTrl(Identifier="13271622-02b3-c27e-5a4d-937d27225fe2")
public static String es_PE_FIELD_BusinessPartnerDimension_PaymentRule2_Help="La Regla de Pago indica el método de pago de las compras";

@XendraField(AD_Column_ID="PaymentRulePO",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="13271622-02b3-c27e-5a4d-937d27225fe2")
public static final String FIELDNAME_BusinessPartnerDimension_PaymentRule2="13271622-02b3-c27e-5a4d-937d27225fe2";

@XendraTrl(Identifier="d67f6a0d-6c06-ca73-faea-be5be1746aa8")
public static String es_PE_FIELD_Employee_PaymentRule2_Name="Regla de Pago";

@XendraTrl(Identifier="d67f6a0d-6c06-ca73-faea-be5be1746aa8")
public static String es_PE_FIELD_Employee_PaymentRule2_Description="Opción de pago por compras";

@XendraTrl(Identifier="d67f6a0d-6c06-ca73-faea-be5be1746aa8")
public static String es_PE_FIELD_Employee_PaymentRule2_Help="La Regla de Pago indica el método de pago de las compras";

@XendraField(AD_Column_ID="PaymentRulePO",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d67f6a0d-6c06-ca73-faea-be5be1746aa8")
public static final String FIELDNAME_Employee_PaymentRule2="d67f6a0d-6c06-ca73-faea-be5be1746aa8";

@XendraTrl(Identifier="e56dd428-b843-976c-5125-abdb82a6fe77")
public static String es_PE_FIELD_Customer_PaymentRule3_Name="Regla de Pago";

@XendraTrl(Identifier="e56dd428-b843-976c-5125-abdb82a6fe77")
public static String es_PE_FIELD_Customer_PaymentRule3_Description="Opción de pago por compras";

@XendraTrl(Identifier="e56dd428-b843-976c-5125-abdb82a6fe77")
public static String es_PE_FIELD_Customer_PaymentRule3_Help="La Regla de Pago indica el método de pago de las compras";

@XendraField(AD_Column_ID="PaymentRulePO",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e56dd428-b843-976c-5125-abdb82a6fe77")
public static final String FIELDNAME_Customer_PaymentRule3="e56dd428-b843-976c-5125-abdb82a6fe77";

@XendraTrl(Identifier="08fec5a1-865d-49b6-66ed-d5110329f699")
public static String es_PE_FIELD_Vendor_PaymentRule4_Name="Regla de Pago";

@XendraTrl(Identifier="08fec5a1-865d-49b6-66ed-d5110329f699")
public static String es_PE_FIELD_Vendor_PaymentRule4_Description="Opción de pago por compras";

@XendraTrl(Identifier="08fec5a1-865d-49b6-66ed-d5110329f699")
public static String es_PE_FIELD_Vendor_PaymentRule4_Help="La Regla de Pago indica el método de pago de las compras";

@XendraField(AD_Column_ID="PaymentRulePO",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="08fec5a1-865d-49b6-66ed-d5110329f699")
public static final String FIELDNAME_Vendor_PaymentRule4="08fec5a1-865d-49b6-66ed-d5110329f699";

@XendraTrl(Identifier="33ad27ab-9795-6244-5e19-bb5adaeb3ccc")
public static String es_PE_FIELD_EmployeeVendor_PaymentRule2_Name="Regla de Pago";

@XendraTrl(Identifier="33ad27ab-9795-6244-5e19-bb5adaeb3ccc")
public static String es_PE_FIELD_EmployeeVendor_PaymentRule2_Description="Opción de pago por compras";

@XendraTrl(Identifier="33ad27ab-9795-6244-5e19-bb5adaeb3ccc")
public static String es_PE_FIELD_EmployeeVendor_PaymentRule2_Help="La Regla de Pago indica el método de pago de las compras";

@XendraField(AD_Column_ID="PaymentRulePO",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="33ad27ab-9795-6244-5e19-bb5adaeb3ccc")
public static final String FIELDNAME_EmployeeVendor_PaymentRule2="33ad27ab-9795-6244-5e19-bb5adaeb3ccc";

@XendraTrl(Identifier="3d5eae81-c201-0e44-69c7-329551108946")
public static String es_PE_FIELD_PartnerSelection_PaymentRule2_Name="Regla de Pago";

@XendraTrl(Identifier="3d5eae81-c201-0e44-69c7-329551108946")
public static String es_PE_FIELD_PartnerSelection_PaymentRule2_Description="Opción de pago por compras";

@XendraTrl(Identifier="3d5eae81-c201-0e44-69c7-329551108946")
public static String es_PE_FIELD_PartnerSelection_PaymentRule2_Help="La Regla de Pago indica el método de pago de las compras";

@XendraField(AD_Column_ID="PaymentRulePO",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3d5eae81-c201-0e44-69c7-329551108946")
public static final String FIELDNAME_PartnerSelection_PaymentRule2="3d5eae81-c201-0e44-69c7-329551108946";

@XendraTrl(Identifier="469aab63-9d3d-976a-9e00-b9ff07a4f319")
public static String es_PE_FIELD_Customer_PaymentRule4_Name="Regla de Pago";

@XendraTrl(Identifier="469aab63-9d3d-976a-9e00-b9ff07a4f319")
public static String es_PE_FIELD_Customer_PaymentRule4_Description="Opción de pago por compras";

@XendraTrl(Identifier="469aab63-9d3d-976a-9e00-b9ff07a4f319")
public static String es_PE_FIELD_Customer_PaymentRule4_Help="La Regla de Pago indica el método de pago de las compras";

@XendraField(AD_Column_ID="PaymentRulePO",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="469aab63-9d3d-976a-9e00-b9ff07a4f319")
public static final String FIELDNAME_Customer_PaymentRule4="469aab63-9d3d-976a-9e00-b9ff07a4f319";

@XendraTrl(Identifier="0da4de9f-be42-ae21-4763-2f7f9f06cd92")
public static String es_PE_FIELD_AssignedPartners_PaymentRule2_Name="Regla de Pago";

@XendraTrl(Identifier="0da4de9f-be42-ae21-4763-2f7f9f06cd92")
public static String es_PE_FIELD_AssignedPartners_PaymentRule2_Description="Opción de pago por compras";

@XendraTrl(Identifier="0da4de9f-be42-ae21-4763-2f7f9f06cd92")
public static String es_PE_FIELD_AssignedPartners_PaymentRule2_Help="La Regla de Pago indica el método de pago de las compras";

@XendraField(AD_Column_ID="PaymentRulePO",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0da4de9f-be42-ae21-4763-2f7f9f06cd92")
public static final String FIELDNAME_AssignedPartners_PaymentRule2="0da4de9f-be42-ae21-4763-2f7f9f06cd92";

@XendraTrl(Identifier="f82c0835-d3bf-d1f6-c6a8-8f5da754a562")
public static String es_PE_FIELD_BusinessPartner_PaymentRule3_Name="Regla de Pago";

@XendraTrl(Identifier="f82c0835-d3bf-d1f6-c6a8-8f5da754a562")
public static String es_PE_FIELD_BusinessPartner_PaymentRule3_Description="Opción de pago por compras";

@XendraTrl(Identifier="f82c0835-d3bf-d1f6-c6a8-8f5da754a562")
public static String es_PE_FIELD_BusinessPartner_PaymentRule3_Help="La Regla de Pago indica el método de pago de las compras";

@XendraField(AD_Column_ID="PaymentRulePO",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f82c0835-d3bf-d1f6-c6a8-8f5da754a562")
public static final String FIELDNAME_BusinessPartner_PaymentRule3="f82c0835-d3bf-d1f6-c6a8-8f5da754a562";

@XendraTrl(Identifier="cdc5ad77-d6da-b35b-88f3-e00d82ee496a")
public static String es_PE_FIELD_BusinessPartner_PaymentRule4_Name="Regla de Pago";

@XendraTrl(Identifier="cdc5ad77-d6da-b35b-88f3-e00d82ee496a")
public static String es_PE_FIELD_BusinessPartner_PaymentRule4_Description="Opción de pago por compras";

@XendraTrl(Identifier="cdc5ad77-d6da-b35b-88f3-e00d82ee496a")
public static String es_PE_FIELD_BusinessPartner_PaymentRule4_Help="La Regla de Pago indica el método de pago de las compras";

@XendraField(AD_Column_ID="PaymentRulePO",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cdc5ad77-d6da-b35b-88f3-e00d82ee496a")
public static final String FIELDNAME_BusinessPartner_PaymentRule4="cdc5ad77-d6da-b35b-88f3-e00d82ee496a";

@XendraTrl(Identifier="f11943bb-735a-a2aa-a386-27fe78486cef")
public static String es_PE_COLUMN_PaymentRulePO_Name="Regla de Pago";

@XendraColumn(AD_Element_ID="e990c713-f3e5-fd1b-7b92-f66aea16278e",ColumnName="PaymentRulePO",
AD_Reference_ID=17,AD_Reference_Value_ID="ac003b85-a929-cc48-3def-1a8f7b1adc7b",
AD_Val_Rule_ID="ddb2995e-0325-fcfb-01ce-64a7af71853f",FieldLength=1,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f11943bb-735a-a2aa-a386-27fe78486cef",
Synchronized="2019-08-30 22:21:10.0")
/** Column name PaymentRulePO */
public static final String COLUMNNAME_PaymentRulePO = "PaymentRulePO";
/** Set PO Discount Schema.
@param PO_DiscountSchema_ID Schema to calculate the purchase trade discount percentage */
public void setPO_DiscountSchema_ID (int PO_DiscountSchema_ID)
{
if (PO_DiscountSchema_ID <= 0) set_Value (COLUMNNAME_PO_DiscountSchema_ID, null);
 else 
set_Value (COLUMNNAME_PO_DiscountSchema_ID, Integer.valueOf(PO_DiscountSchema_ID));
}
/** Get PO Discount Schema.
@return Schema to calculate the purchase trade discount percentage */
public int getPO_DiscountSchema_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PO_DiscountSchema_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="54292467-0083-eb8c-abe6-e9c44209b12f")
public static String es_PE_FIELD_BusinessPartnerDimension_PODiscountSchema_Name="Esquema Del Descuento en OC";

@XendraTrl(Identifier="54292467-0083-eb8c-abe6-e9c44209b12f")
public static String es_PE_FIELD_BusinessPartnerDimension_PODiscountSchema_Description="Esquema para calcular el porcentaje de descuento comercial en compra";

@XendraField(AD_Column_ID="PO_DiscountSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="54292467-0083-eb8c-abe6-e9c44209b12f")
public static final String FIELDNAME_BusinessPartnerDimension_PODiscountSchema="54292467-0083-eb8c-abe6-e9c44209b12f";

@XendraTrl(Identifier="65b7d97e-6669-2be0-e125-943c5176afa4")
public static String es_PE_FIELD_Vendor_PODiscountSchema_Name="Esquema Del Descuento en OC";

@XendraTrl(Identifier="65b7d97e-6669-2be0-e125-943c5176afa4")
public static String es_PE_FIELD_Vendor_PODiscountSchema_Description="Esquema para calcular el porcentaje de descuento comercial en compra";

@XendraField(AD_Column_ID="PO_DiscountSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="65b7d97e-6669-2be0-e125-943c5176afa4")
public static final String FIELDNAME_Vendor_PODiscountSchema="65b7d97e-6669-2be0-e125-943c5176afa4";

@XendraTrl(Identifier="dcb92e1e-4df0-2ecb-0a49-13a59c19477e")
public static String es_PE_FIELD_Customer_PODiscountSchema_Name="Esquema Del Descuento en OC";

@XendraTrl(Identifier="dcb92e1e-4df0-2ecb-0a49-13a59c19477e")
public static String es_PE_FIELD_Customer_PODiscountSchema_Description="Esquema para calcular el porcentaje de descuento comercial en compra";

@XendraField(AD_Column_ID="PO_DiscountSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dcb92e1e-4df0-2ecb-0a49-13a59c19477e")
public static final String FIELDNAME_Customer_PODiscountSchema="dcb92e1e-4df0-2ecb-0a49-13a59c19477e";

@XendraTrl(Identifier="b5ff2ec4-8b4d-5d9a-1144-41590284c6c1")
public static String es_PE_FIELD_AssignedPartners_PODiscountSchema_Name="Esquema Del Descuento en OC";

@XendraTrl(Identifier="b5ff2ec4-8b4d-5d9a-1144-41590284c6c1")
public static String es_PE_FIELD_AssignedPartners_PODiscountSchema_Description="Esquema para calcular el porcentaje de descuento comercial en compra";

@XendraField(AD_Column_ID="PO_DiscountSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b5ff2ec4-8b4d-5d9a-1144-41590284c6c1")
public static final String FIELDNAME_AssignedPartners_PODiscountSchema="b5ff2ec4-8b4d-5d9a-1144-41590284c6c1";

@XendraTrl(Identifier="651003f5-81a5-b279-0231-d8b3d65f5a1e")
public static String es_PE_FIELD_Vendor_PODiscountSchema2_Name="Esquema Del Descuento en OC";

@XendraTrl(Identifier="651003f5-81a5-b279-0231-d8b3d65f5a1e")
public static String es_PE_FIELD_Vendor_PODiscountSchema2_Description="Esquema para calcular el porcentaje de descuento comercial en compra";

@XendraField(AD_Column_ID="PO_DiscountSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsVendor@='Y'",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="651003f5-81a5-b279-0231-d8b3d65f5a1e")
public static final String FIELDNAME_Vendor_PODiscountSchema2="651003f5-81a5-b279-0231-d8b3d65f5a1e";

@XendraTrl(Identifier="eef35454-cffa-f789-b00c-f198b56e6bd0")
public static String es_PE_FIELD_PartnerSelection_PODiscountSchema_Name="Esquema Del Descuento en OC";

@XendraTrl(Identifier="eef35454-cffa-f789-b00c-f198b56e6bd0")
public static String es_PE_FIELD_PartnerSelection_PODiscountSchema_Description="Esquema para calcular el porcentaje de descuento comercial en compra";

@XendraField(AD_Column_ID="PO_DiscountSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="eef35454-cffa-f789-b00c-f198b56e6bd0")
public static final String FIELDNAME_PartnerSelection_PODiscountSchema="eef35454-cffa-f789-b00c-f198b56e6bd0";

@XendraTrl(Identifier="900ddfd5-fd1b-3b22-a5f4-363e47dc2478")
public static String es_PE_FIELD_Employee_PODiscountSchema_Name="Esquema Del Descuento en OC";

@XendraTrl(Identifier="900ddfd5-fd1b-3b22-a5f4-363e47dc2478")
public static String es_PE_FIELD_Employee_PODiscountSchema_Description="Esquema para calcular el porcentaje de descuento comercial en compra";

@XendraField(AD_Column_ID="PO_DiscountSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="900ddfd5-fd1b-3b22-a5f4-363e47dc2478")
public static final String FIELDNAME_Employee_PODiscountSchema="900ddfd5-fd1b-3b22-a5f4-363e47dc2478";

@XendraTrl(Identifier="7d4f5353-b298-fd59-68bb-69aa9497c4eb")
public static String es_PE_FIELD_Customer_PODiscountSchema2_Name="Esquema Del Descuento en OC";

@XendraTrl(Identifier="7d4f5353-b298-fd59-68bb-69aa9497c4eb")
public static String es_PE_FIELD_Customer_PODiscountSchema2_Description="Esquema para calcular el porcentaje de descuento comercial en compra";

@XendraField(AD_Column_ID="PO_DiscountSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7d4f5353-b298-fd59-68bb-69aa9497c4eb")
public static final String FIELDNAME_Customer_PODiscountSchema2="7d4f5353-b298-fd59-68bb-69aa9497c4eb";

@XendraTrl(Identifier="52189831-8156-075d-aac6-c2f87b8b2a02")
public static String es_PE_FIELD_EmployeeVendor_PODiscountSchema_Name="Esquema Del Descuento en OC";

@XendraTrl(Identifier="52189831-8156-075d-aac6-c2f87b8b2a02")
public static String es_PE_FIELD_EmployeeVendor_PODiscountSchema_Description="Esquema para calcular el porcentaje de descuento comercial en compra";

@XendraField(AD_Column_ID="PO_DiscountSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="52189831-8156-075d-aac6-c2f87b8b2a02")
public static final String FIELDNAME_EmployeeVendor_PODiscountSchema="52189831-8156-075d-aac6-c2f87b8b2a02";

@XendraTrl(Identifier="6773b7f7-3293-6689-7fe2-9ec5de594a62")
public static String es_PE_FIELD_BusinessPartner_PODiscountSchema_Name="Esquema Del Descuento en OC";

@XendraTrl(Identifier="6773b7f7-3293-6689-7fe2-9ec5de594a62")
public static String es_PE_FIELD_BusinessPartner_PODiscountSchema_Description="Esquema para calcular el porcentaje de descuento comercial en compra";

@XendraField(AD_Column_ID="PO_DiscountSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6773b7f7-3293-6689-7fe2-9ec5de594a62")
public static final String FIELDNAME_BusinessPartner_PODiscountSchema="6773b7f7-3293-6689-7fe2-9ec5de594a62";

@XendraTrl(Identifier="cd93bb97-76db-c3c6-4d52-1e0edf4ca246")
public static String es_PE_FIELD_BusinessPartner_PODiscountSchema2_Name="Esquema Del Descuento en OC";

@XendraTrl(Identifier="cd93bb97-76db-c3c6-4d52-1e0edf4ca246")
public static String es_PE_FIELD_BusinessPartner_PODiscountSchema2_Description="Esquema para calcular el porcentaje de descuento comercial en compra";

@XendraField(AD_Column_ID="PO_DiscountSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cd93bb97-76db-c3c6-4d52-1e0edf4ca246")
public static final String FIELDNAME_BusinessPartner_PODiscountSchema2="cd93bb97-76db-c3c6-4d52-1e0edf4ca246";

@XendraTrl(Identifier="11077d2d-5e04-9447-f35e-17e5de28f39a")
public static String es_PE_COLUMN_PO_DiscountSchema_ID_Name="Esquema Del Descuento en OC";

@XendraColumn(AD_Element_ID="17207ce1-c4e8-781c-b165-f893e525e36b",
ColumnName="PO_DiscountSchema_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="3a3974a6-65b9-c98d-24a9-e5218ed456cd",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="11077d2d-5e04-9447-f35e-17e5de28f39a",
Synchronized="2019-08-30 22:21:10.0")
/** Column name PO_DiscountSchema_ID */
public static final String COLUMNNAME_PO_DiscountSchema_ID = "PO_DiscountSchema_ID";
/** Set Points.
@param Points Points */
public void setPoints (BigDecimal Points)
{
set_Value (COLUMNNAME_Points, Points);
}
/** Get Points.
@return Points */
public BigDecimal getPoints() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Points);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="d8cc44b9-1cfb-2acd-61dd-31be663608b2")
public static String es_PE_FIELD_BusinessPartner_Points_Name="points";

@XendraField(AD_Column_ID="Points",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2015-11-23 15:25:55.0",
Identifier="d8cc44b9-1cfb-2acd-61dd-31be663608b2")
public static final String FIELDNAME_BusinessPartner_Points="d8cc44b9-1cfb-2acd-61dd-31be663608b2";

@XendraTrl(Identifier="943cbdbb-c82c-adf2-ec11-f951a70d9a16")
public static String es_PE_COLUMN_Points_Name="Points";

@XendraColumn(AD_Element_ID="b7851d60-f96e-369f-a20e-99a1cbd76360",ColumnName="Points",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="943cbdbb-c82c-adf2-ec11-f951a70d9a16",
Synchronized="2019-08-30 22:21:10.0")
/** Column name Points */
public static final String COLUMNNAME_Points = "Points";
/** Set PO Payment Term.
@param PO_PaymentTerm_ID Payment rules for a purchase order */
public void setPO_PaymentTerm_ID (int PO_PaymentTerm_ID)
{
if (PO_PaymentTerm_ID <= 0) set_Value (COLUMNNAME_PO_PaymentTerm_ID, null);
 else 
set_Value (COLUMNNAME_PO_PaymentTerm_ID, Integer.valueOf(PO_PaymentTerm_ID));
}
/** Get PO Payment Term.
@return Payment rules for a purchase order */
public int getPO_PaymentTerm_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PO_PaymentTerm_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="39f1602d-57af-96b7-9634-8d951afd34cb")
public static String es_PE_FIELD_Vendor_POPaymentTerm_Name="Reglas de Pago en OC";

@XendraTrl(Identifier="39f1602d-57af-96b7-9634-8d951afd34cb")
public static String es_PE_FIELD_Vendor_POPaymentTerm_Description="Reglas de Pago en una Orden de Compra";

@XendraTrl(Identifier="39f1602d-57af-96b7-9634-8d951afd34cb")
public static String es_PE_FIELD_Vendor_POPaymentTerm_Help="Las Condiciones de Pago de la OC indica los términos de pago que serán usados cuando se llegue a facturar esta orden de compra";

@XendraField(AD_Column_ID="PO_PaymentTerm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsVendor@='Y'",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="39f1602d-57af-96b7-9634-8d951afd34cb")
public static final String FIELDNAME_Vendor_POPaymentTerm="39f1602d-57af-96b7-9634-8d951afd34cb";

@XendraTrl(Identifier="c80afb9d-0504-1405-3760-7be024a28eac")
public static String es_PE_FIELD_PartnerSelection_POPaymentTerm_Name="Reglas de Pago en OC";

@XendraTrl(Identifier="c80afb9d-0504-1405-3760-7be024a28eac")
public static String es_PE_FIELD_PartnerSelection_POPaymentTerm_Description="Reglas de Pago en una Orden de Compra";

@XendraTrl(Identifier="c80afb9d-0504-1405-3760-7be024a28eac")
public static String es_PE_FIELD_PartnerSelection_POPaymentTerm_Help="Las Condiciones de Pago de la OC indica los términos de pago que serán usados cuando se llegue a facturar esta orden de compra";

@XendraField(AD_Column_ID="PO_PaymentTerm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c80afb9d-0504-1405-3760-7be024a28eac")
public static final String FIELDNAME_PartnerSelection_POPaymentTerm="c80afb9d-0504-1405-3760-7be024a28eac";

@XendraTrl(Identifier="914de5cd-533a-7235-5aeb-ac09de98d8c3")
public static String es_PE_FIELD_EmployeeVendor_POPaymentTerm_Name="Reglas de Pago en OC";

@XendraTrl(Identifier="914de5cd-533a-7235-5aeb-ac09de98d8c3")
public static String es_PE_FIELD_EmployeeVendor_POPaymentTerm_Description="Reglas de Pago en una Orden de Compra";

@XendraTrl(Identifier="914de5cd-533a-7235-5aeb-ac09de98d8c3")
public static String es_PE_FIELD_EmployeeVendor_POPaymentTerm_Help="Las Condiciones de Pago de la OC indica los términos de pago que serán usados cuando se llegue a facturar esta orden de compra";

@XendraField(AD_Column_ID="PO_PaymentTerm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="914de5cd-533a-7235-5aeb-ac09de98d8c3")
public static final String FIELDNAME_EmployeeVendor_POPaymentTerm="914de5cd-533a-7235-5aeb-ac09de98d8c3";

@XendraTrl(Identifier="ee71420c-efe2-f17b-7bfe-6c10d8782fa5")
public static String es_PE_FIELD_Customer_POPaymentTerm_Name="Reglas de Pago en OC";

@XendraTrl(Identifier="ee71420c-efe2-f17b-7bfe-6c10d8782fa5")
public static String es_PE_FIELD_Customer_POPaymentTerm_Description="Reglas de Pago en una Orden de Compra";

@XendraTrl(Identifier="ee71420c-efe2-f17b-7bfe-6c10d8782fa5")
public static String es_PE_FIELD_Customer_POPaymentTerm_Help="Las Condiciones de Pago de la OC indica los términos de pago que serán usados cuando se llegue a facturar esta orden de compra";

@XendraField(AD_Column_ID="PO_PaymentTerm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ee71420c-efe2-f17b-7bfe-6c10d8782fa5")
public static final String FIELDNAME_Customer_POPaymentTerm="ee71420c-efe2-f17b-7bfe-6c10d8782fa5";

@XendraTrl(Identifier="17f0f159-1d85-8234-ef90-be38488fecf0")
public static String es_PE_FIELD_Vendor_POPaymentTerm2_Name="Reglas de Pago en OC";

@XendraTrl(Identifier="17f0f159-1d85-8234-ef90-be38488fecf0")
public static String es_PE_FIELD_Vendor_POPaymentTerm2_Description="Reglas de Pago en una Orden de Compra";

@XendraTrl(Identifier="17f0f159-1d85-8234-ef90-be38488fecf0")
public static String es_PE_FIELD_Vendor_POPaymentTerm2_Help="Las Condiciones de Pago de la OC indica los términos de pago que serán usados cuando se llegue a facturar esta orden de compra";

@XendraField(AD_Column_ID="PO_PaymentTerm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="17f0f159-1d85-8234-ef90-be38488fecf0")
public static final String FIELDNAME_Vendor_POPaymentTerm2="17f0f159-1d85-8234-ef90-be38488fecf0";

@XendraTrl(Identifier="6ce4374f-4051-5844-ad8a-1bc2ec676109")
public static String es_PE_FIELD_BusinessPartnerDimension_POPaymentTerm_Name="Reglas de Pago en OC";

@XendraTrl(Identifier="6ce4374f-4051-5844-ad8a-1bc2ec676109")
public static String es_PE_FIELD_BusinessPartnerDimension_POPaymentTerm_Description="Reglas de Pago en una Orden de Compra";

@XendraTrl(Identifier="6ce4374f-4051-5844-ad8a-1bc2ec676109")
public static String es_PE_FIELD_BusinessPartnerDimension_POPaymentTerm_Help="Las Condiciones de Pago de la OC indica los términos de pago que serán usados cuando se llegue a facturar esta orden de compra";

@XendraField(AD_Column_ID="PO_PaymentTerm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6ce4374f-4051-5844-ad8a-1bc2ec676109")
public static final String FIELDNAME_BusinessPartnerDimension_POPaymentTerm="6ce4374f-4051-5844-ad8a-1bc2ec676109";

@XendraTrl(Identifier="6a423ecc-32ce-efe0-64ae-b225cd19b49e")
public static String es_PE_FIELD_AssignedPartners_POPaymentTerm_Name="Reglas de Pago en OC";

@XendraTrl(Identifier="6a423ecc-32ce-efe0-64ae-b225cd19b49e")
public static String es_PE_FIELD_AssignedPartners_POPaymentTerm_Description="Reglas de Pago en una Orden de Compra";

@XendraTrl(Identifier="6a423ecc-32ce-efe0-64ae-b225cd19b49e")
public static String es_PE_FIELD_AssignedPartners_POPaymentTerm_Help="Las Condiciones de Pago de la OC indica los términos de pago que serán usados cuando se llegue a facturar esta orden de compra";

@XendraField(AD_Column_ID="PO_PaymentTerm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6a423ecc-32ce-efe0-64ae-b225cd19b49e")
public static final String FIELDNAME_AssignedPartners_POPaymentTerm="6a423ecc-32ce-efe0-64ae-b225cd19b49e";

@XendraTrl(Identifier="3c40dae5-daf9-d007-6cc4-e3722cfb2a9f")
public static String es_PE_FIELD_Employee_POPaymentTerm_Name="Reglas de Pago en OC";

@XendraTrl(Identifier="3c40dae5-daf9-d007-6cc4-e3722cfb2a9f")
public static String es_PE_FIELD_Employee_POPaymentTerm_Description="Reglas de Pago en una Orden de Compra";

@XendraTrl(Identifier="3c40dae5-daf9-d007-6cc4-e3722cfb2a9f")
public static String es_PE_FIELD_Employee_POPaymentTerm_Help="Las Condiciones de Pago de la OC indica los términos de pago que serán usados cuando se llegue a facturar esta orden de compra";

@XendraField(AD_Column_ID="PO_PaymentTerm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3c40dae5-daf9-d007-6cc4-e3722cfb2a9f")
public static final String FIELDNAME_Employee_POPaymentTerm="3c40dae5-daf9-d007-6cc4-e3722cfb2a9f";

@XendraTrl(Identifier="5e44f9ef-0338-a020-9c35-d3c0ee7e310c")
public static String es_PE_FIELD_BusinessPartner_POPaymentTerm_Name="Reglas de Pago en OC";

@XendraTrl(Identifier="5e44f9ef-0338-a020-9c35-d3c0ee7e310c")
public static String es_PE_FIELD_BusinessPartner_POPaymentTerm_Description="Reglas de Pago en una Orden de Compra";

@XendraTrl(Identifier="5e44f9ef-0338-a020-9c35-d3c0ee7e310c")
public static String es_PE_FIELD_BusinessPartner_POPaymentTerm_Help="Las Condiciones de Pago de la OC indica los términos de pago que serán usados cuando se llegue a facturar esta orden de compra";

@XendraField(AD_Column_ID="PO_PaymentTerm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5e44f9ef-0338-a020-9c35-d3c0ee7e310c")
public static final String FIELDNAME_BusinessPartner_POPaymentTerm="5e44f9ef-0338-a020-9c35-d3c0ee7e310c";

@XendraTrl(Identifier="fe2356eb-570b-fd15-e1b3-9e4da9a0c596")
public static String es_PE_FIELD_Customer_POPaymentTerm2_Name="Reglas de Pago en OC";

@XendraTrl(Identifier="fe2356eb-570b-fd15-e1b3-9e4da9a0c596")
public static String es_PE_FIELD_Customer_POPaymentTerm2_Description="Reglas de Pago en una Orden de Compra";

@XendraTrl(Identifier="fe2356eb-570b-fd15-e1b3-9e4da9a0c596")
public static String es_PE_FIELD_Customer_POPaymentTerm2_Help="Las Condiciones de Pago de la OC indica los términos de pago que serán usados cuando se llegue a facturar esta orden de compra";

@XendraField(AD_Column_ID="PO_PaymentTerm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fe2356eb-570b-fd15-e1b3-9e4da9a0c596")
public static final String FIELDNAME_Customer_POPaymentTerm2="fe2356eb-570b-fd15-e1b3-9e4da9a0c596";

@XendraTrl(Identifier="c658ef94-0634-fe2d-78c2-70b8462b29f2")
public static String es_PE_FIELD_BusinessPartner_POPaymentTerm2_Name="Reglas de Pago en OC";

@XendraTrl(Identifier="c658ef94-0634-fe2d-78c2-70b8462b29f2")
public static String es_PE_FIELD_BusinessPartner_POPaymentTerm2_Description="Reglas de Pago en una Orden de Compra";

@XendraTrl(Identifier="c658ef94-0634-fe2d-78c2-70b8462b29f2")
public static String es_PE_FIELD_BusinessPartner_POPaymentTerm2_Help="Las Condiciones de Pago de la OC indica los términos de pago que serán usados cuando se llegue a facturar esta orden de compra";

@XendraField(AD_Column_ID="PO_PaymentTerm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c658ef94-0634-fe2d-78c2-70b8462b29f2")
public static final String FIELDNAME_BusinessPartner_POPaymentTerm2="c658ef94-0634-fe2d-78c2-70b8462b29f2";

@XendraTrl(Identifier="3956c281-7fc6-122a-7406-4b76587a79e2")
public static String es_PE_COLUMN_PO_PaymentTerm_ID_Name="Reglas de Pago en OC";

@XendraColumn(AD_Element_ID="c413ba91-2be2-a005-440d-7d3b7c5970c6",ColumnName="PO_PaymentTerm_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="270bb22c-6cc2-0c4d-3be6-25fe6410f4c2",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3956c281-7fc6-122a-7406-4b76587a79e2",Synchronized="2019-08-30 22:21:10.0")
/** Column name PO_PaymentTerm_ID */
public static final String COLUMNNAME_PO_PaymentTerm_ID = "PO_PaymentTerm_ID";
/** Set Purchase Pricelist.
@param PO_PriceList_ID Price List used by this Business Partner */
public void setPO_PriceList_ID (int PO_PriceList_ID)
{
if (PO_PriceList_ID <= 0) set_Value (COLUMNNAME_PO_PriceList_ID, null);
 else 
set_Value (COLUMNNAME_PO_PriceList_ID, Integer.valueOf(PO_PriceList_ID));
}
/** Get Purchase Pricelist.
@return Price List used by this Business Partner */
public int getPO_PriceList_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PO_PriceList_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5bec6c02-9941-2877-70f7-2c3b6383dd6d")
public static String es_PE_FIELD_Vendor_PurchasePricelist_Name="Lista de Precios de Compra";

@XendraTrl(Identifier="5bec6c02-9941-2877-70f7-2c3b6383dd6d")
public static String es_PE_FIELD_Vendor_PurchasePricelist_Description="Lista de precios usada por este Socio del Negocio";

@XendraTrl(Identifier="5bec6c02-9941-2877-70f7-2c3b6383dd6d")
public static String es_PE_FIELD_Vendor_PurchasePricelist_Help="Identifica la lista de precios usada por un proveedor para productos comprados por esta organización.";

@XendraField(AD_Column_ID="PO_PriceList_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsVendor@='Y'",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="5bec6c02-9941-2877-70f7-2c3b6383dd6d")
public static final String FIELDNAME_Vendor_PurchasePricelist="5bec6c02-9941-2877-70f7-2c3b6383dd6d";

@XendraTrl(Identifier="c55e33c9-d418-5d70-12a0-a051fe29d159")
public static String es_PE_FIELD_EmployeeVendor_PurchasePricelist_Name="Lista de Precios de Compra";

@XendraTrl(Identifier="c55e33c9-d418-5d70-12a0-a051fe29d159")
public static String es_PE_FIELD_EmployeeVendor_PurchasePricelist_Description="Lista de precios usada por este Socio del Negocio";

@XendraTrl(Identifier="c55e33c9-d418-5d70-12a0-a051fe29d159")
public static String es_PE_FIELD_EmployeeVendor_PurchasePricelist_Help="Identifica la lista de precios usada por un proveedor para productos comprados por esta organización.";

@XendraField(AD_Column_ID="PO_PriceList_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c55e33c9-d418-5d70-12a0-a051fe29d159")
public static final String FIELDNAME_EmployeeVendor_PurchasePricelist="c55e33c9-d418-5d70-12a0-a051fe29d159";

@XendraTrl(Identifier="7db1da96-bc49-2b99-9e1b-b9bebee8be00")
public static String es_PE_FIELD_Customer_PurchasePricelist_Name="Lista de Precios de Compra";

@XendraTrl(Identifier="7db1da96-bc49-2b99-9e1b-b9bebee8be00")
public static String es_PE_FIELD_Customer_PurchasePricelist_Description="Lista de precios usada por este Socio del Negocio";

@XendraTrl(Identifier="7db1da96-bc49-2b99-9e1b-b9bebee8be00")
public static String es_PE_FIELD_Customer_PurchasePricelist_Help="Identifica la lista de precios usada por un proveedor para productos comprados por esta organización.";

@XendraField(AD_Column_ID="PO_PriceList_ID",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7db1da96-bc49-2b99-9e1b-b9bebee8be00")
public static final String FIELDNAME_Customer_PurchasePricelist="7db1da96-bc49-2b99-9e1b-b9bebee8be00";

@XendraTrl(Identifier="3ba8218c-177f-d33f-354a-b64d39bacc73")
public static String es_PE_FIELD_BusinessPartnerDimension_PurchasePricelist_Name="Lista de Precios de Compra";

@XendraTrl(Identifier="3ba8218c-177f-d33f-354a-b64d39bacc73")
public static String es_PE_FIELD_BusinessPartnerDimension_PurchasePricelist_Description="Lista de precios usada por este Socio del Negocio";

@XendraTrl(Identifier="3ba8218c-177f-d33f-354a-b64d39bacc73")
public static String es_PE_FIELD_BusinessPartnerDimension_PurchasePricelist_Help="Identifica la lista de precios usada por un proveedor para productos comprados por esta organización.";

@XendraField(AD_Column_ID="PO_PriceList_ID",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3ba8218c-177f-d33f-354a-b64d39bacc73")
public static final String FIELDNAME_BusinessPartnerDimension_PurchasePricelist="3ba8218c-177f-d33f-354a-b64d39bacc73";

@XendraTrl(Identifier="a79fd57e-59a7-b660-d733-fc4d60c5731e")
public static String es_PE_FIELD_Employee_PurchasePricelist_Name="Lista de Precios de Compra";

@XendraTrl(Identifier="a79fd57e-59a7-b660-d733-fc4d60c5731e")
public static String es_PE_FIELD_Employee_PurchasePricelist_Description="Lista de precios usada por este Socio del Negocio";

@XendraTrl(Identifier="a79fd57e-59a7-b660-d733-fc4d60c5731e")
public static String es_PE_FIELD_Employee_PurchasePricelist_Help="Identifica la lista de precios usada por un proveedor para productos comprados por esta organización.";

@XendraField(AD_Column_ID="PO_PriceList_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a79fd57e-59a7-b660-d733-fc4d60c5731e")
public static final String FIELDNAME_Employee_PurchasePricelist="a79fd57e-59a7-b660-d733-fc4d60c5731e";

@XendraTrl(Identifier="b6045e99-b751-35a5-5a4e-66cd9405288a")
public static String es_PE_FIELD_PartnerSelection_PurchasePricelist_Name="Lista de Precios de Compra";

@XendraTrl(Identifier="b6045e99-b751-35a5-5a4e-66cd9405288a")
public static String es_PE_FIELD_PartnerSelection_PurchasePricelist_Description="Lista de precios usada por este Socio del Negocio";

@XendraTrl(Identifier="b6045e99-b751-35a5-5a4e-66cd9405288a")
public static String es_PE_FIELD_PartnerSelection_PurchasePricelist_Help="Identifica la lista de precios usada por un proveedor para productos comprados por esta organización.";

@XendraField(AD_Column_ID="PO_PriceList_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b6045e99-b751-35a5-5a4e-66cd9405288a")
public static final String FIELDNAME_PartnerSelection_PurchasePricelist="b6045e99-b751-35a5-5a4e-66cd9405288a";

@XendraTrl(Identifier="eaa66cd6-7eaa-74da-8dd1-e63d23d2fca5")
public static String es_PE_FIELD_Vendor_PurchasePricelist2_Name="Lista de Precios de Compra";

@XendraTrl(Identifier="eaa66cd6-7eaa-74da-8dd1-e63d23d2fca5")
public static String es_PE_FIELD_Vendor_PurchasePricelist2_Description="Lista de precios usada por este Socio del Negocio";

@XendraTrl(Identifier="eaa66cd6-7eaa-74da-8dd1-e63d23d2fca5")
public static String es_PE_FIELD_Vendor_PurchasePricelist2_Help="Identifica la lista de precios usada por un proveedor para productos comprados por esta organización.";

@XendraField(AD_Column_ID="PO_PriceList_ID",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="eaa66cd6-7eaa-74da-8dd1-e63d23d2fca5")
public static final String FIELDNAME_Vendor_PurchasePricelist2="eaa66cd6-7eaa-74da-8dd1-e63d23d2fca5";

@XendraTrl(Identifier="aa3fa713-2bdf-d4bd-5ac6-729d43165972")
public static String es_PE_FIELD_BusinessPartner_PurchasePricelist_Name="Lista de Precios de Compra";

@XendraTrl(Identifier="aa3fa713-2bdf-d4bd-5ac6-729d43165972")
public static String es_PE_FIELD_BusinessPartner_PurchasePricelist_Description="Lista de precios usada por este Socio del Negocio";

@XendraTrl(Identifier="aa3fa713-2bdf-d4bd-5ac6-729d43165972")
public static String es_PE_FIELD_BusinessPartner_PurchasePricelist_Help="Identifica la lista de precios usada por un proveedor para productos comprados por esta organización.";

@XendraField(AD_Column_ID="PO_PriceList_ID",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="aa3fa713-2bdf-d4bd-5ac6-729d43165972")
public static final String FIELDNAME_BusinessPartner_PurchasePricelist="aa3fa713-2bdf-d4bd-5ac6-729d43165972";

@XendraTrl(Identifier="38e73a47-7822-a487-f965-729472b2cedb")
public static String es_PE_FIELD_AssignedPartners_PurchasePricelist_Name="Lista de Precios de Compra";

@XendraTrl(Identifier="38e73a47-7822-a487-f965-729472b2cedb")
public static String es_PE_FIELD_AssignedPartners_PurchasePricelist_Description="Lista de precios usada por este Socio del Negocio";

@XendraTrl(Identifier="38e73a47-7822-a487-f965-729472b2cedb")
public static String es_PE_FIELD_AssignedPartners_PurchasePricelist_Help="Identifica la lista de precios usada por un proveedor para productos comprados por esta organización.";

@XendraField(AD_Column_ID="PO_PriceList_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="38e73a47-7822-a487-f965-729472b2cedb")
public static final String FIELDNAME_AssignedPartners_PurchasePricelist="38e73a47-7822-a487-f965-729472b2cedb";

@XendraTrl(Identifier="c692dd78-4866-f973-32e3-5abca31e2fbb")
public static String es_PE_FIELD_Customer_PurchasePricelist2_Name="Lista de Precios de Compra";

@XendraTrl(Identifier="c692dd78-4866-f973-32e3-5abca31e2fbb")
public static String es_PE_FIELD_Customer_PurchasePricelist2_Description="Lista de precios usada por este Socio del Negocio";

@XendraTrl(Identifier="c692dd78-4866-f973-32e3-5abca31e2fbb")
public static String es_PE_FIELD_Customer_PurchasePricelist2_Help="Identifica la lista de precios usada por un proveedor para productos comprados por esta organización.";

@XendraField(AD_Column_ID="PO_PriceList_ID",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c692dd78-4866-f973-32e3-5abca31e2fbb")
public static final String FIELDNAME_Customer_PurchasePricelist2="c692dd78-4866-f973-32e3-5abca31e2fbb";

@XendraTrl(Identifier="e691b47b-6e3f-3a1f-3da2-f6129cfa09dc")
public static String es_PE_FIELD_BusinessPartner_PurchasePricelist2_Name="Lista de Precios de Compra";

@XendraTrl(Identifier="e691b47b-6e3f-3a1f-3da2-f6129cfa09dc")
public static String es_PE_FIELD_BusinessPartner_PurchasePricelist2_Description="Lista de precios usada por este Socio del Negocio";

@XendraTrl(Identifier="e691b47b-6e3f-3a1f-3da2-f6129cfa09dc")
public static String es_PE_FIELD_BusinessPartner_PurchasePricelist2_Help="Identifica la lista de precios usada por un proveedor para productos comprados por esta organización.";

@XendraField(AD_Column_ID="PO_PriceList_ID",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e691b47b-6e3f-3a1f-3da2-f6129cfa09dc")
public static final String FIELDNAME_BusinessPartner_PurchasePricelist2="e691b47b-6e3f-3a1f-3da2-f6129cfa09dc";

@XendraTrl(Identifier="c71f8449-b235-9229-e7fd-45d5b7664070")
public static String es_PE_COLUMN_PO_PriceList_ID_Name="Lista de Precios de Compra";

@XendraColumn(AD_Element_ID="5387ca78-4441-35ea-c78f-3a42c70e41d3",ColumnName="PO_PriceList_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="a20c07c8-1fb7-74c6-ec9d-66afd2d29682",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c71f8449-b235-9229-e7fd-45d5b7664070",Synchronized="2019-08-30 22:21:10.0")
/** Column name PO_PriceList_ID */
public static final String COLUMNNAME_PO_PriceList_ID = "PO_PriceList_ID";
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
@XendraTrl(Identifier="eebec647-33a2-9288-306d-78bf1330aef3")
public static String es_PE_FIELD_BusinessPartnerDimension_OrderReference_Name="Referencia de Orden de Socio";

@XendraTrl(Identifier="eebec647-33a2-9288-306d-78bf1330aef3")
public static String es_PE_FIELD_BusinessPartnerDimension_OrderReference_Description="Número de referencia de de la transacción (Orden de Venta; Orden de Compra) de su socio de negocio)";

@XendraTrl(Identifier="eebec647-33a2-9288-306d-78bf1330aef3")
public static String es_PE_FIELD_BusinessPartnerDimension_OrderReference_Help="La referencia de orden del socio de negocio es la referencia para esta transacción específica. Frecuentemente los números de orden de compras se dan para ser impresas en las facturas como una referencia más fácil. Un número estándar puede ser definido en la ventana socio de negocio (Cliente).";

@XendraField(AD_Column_ID="POReference",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="eebec647-33a2-9288-306d-78bf1330aef3")
public static final String FIELDNAME_BusinessPartnerDimension_OrderReference="eebec647-33a2-9288-306d-78bf1330aef3";

@XendraTrl(Identifier="50affc9d-83a1-d6c4-ec4a-fb1aa4240112")
public static String es_PE_FIELD_BusinessPartner_OrderReference_Name="Referencia de Orden de Socio";

@XendraTrl(Identifier="50affc9d-83a1-d6c4-ec4a-fb1aa4240112")
public static String es_PE_FIELD_BusinessPartner_OrderReference_Description="Número de referencia de de la transacción (Orden de Venta; Orden de Compra) de su socio de negocio)";

@XendraTrl(Identifier="50affc9d-83a1-d6c4-ec4a-fb1aa4240112")
public static String es_PE_FIELD_BusinessPartner_OrderReference_Help="La referencia de orden del socio de negocio es la referencia para esta transacción específica. Frecuentemente los números de orden de compras se dan para ser impresas en las facturas como una referencia más fácil. Un número estándar puede ser definido en la ventana socio de negocio (Cliente).";

@XendraField(AD_Column_ID="POReference",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="50affc9d-83a1-d6c4-ec4a-fb1aa4240112")
public static final String FIELDNAME_BusinessPartner_OrderReference="50affc9d-83a1-d6c4-ec4a-fb1aa4240112";

@XendraTrl(Identifier="2057d1b6-b67b-1743-4188-9c8c3019969a")
public static String es_PE_FIELD_Vendor_OrderReference_Name="Referencia de Orden de Socio";

@XendraTrl(Identifier="2057d1b6-b67b-1743-4188-9c8c3019969a")
public static String es_PE_FIELD_Vendor_OrderReference_Description="Número de referencia de de la transacción (Orden de Venta; Orden de Compra) de su socio de negocio)";

@XendraTrl(Identifier="2057d1b6-b67b-1743-4188-9c8c3019969a")
public static String es_PE_FIELD_Vendor_OrderReference_Help="La referencia de orden del socio de negocio es la referencia para esta transacción específica. Frecuentemente los números de orden de compras se dan para ser impresas en las facturas como una referencia más fácil. Un número estándar puede ser definido en la ventana socio de negocio (Cliente).";

@XendraField(AD_Column_ID="POReference",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2057d1b6-b67b-1743-4188-9c8c3019969a")
public static final String FIELDNAME_Vendor_OrderReference="2057d1b6-b67b-1743-4188-9c8c3019969a";

@XendraTrl(Identifier="935ba2d5-bb40-39a6-d9a7-27004d74a016")
public static String es_PE_FIELD_PartnerSelection_OrderReference_Name="Referencia de Orden de Socio";

@XendraTrl(Identifier="935ba2d5-bb40-39a6-d9a7-27004d74a016")
public static String es_PE_FIELD_PartnerSelection_OrderReference_Description="Número de referencia de de la transacción (Orden de Venta; Orden de Compra) de su socio de negocio)";

@XendraTrl(Identifier="935ba2d5-bb40-39a6-d9a7-27004d74a016")
public static String es_PE_FIELD_PartnerSelection_OrderReference_Help="La referencia de orden del socio de negocio es la referencia para esta transacción específica. Frecuentemente los números de orden de compras se dan para ser impresas en las facturas como una referencia más fácil. Un número estándar puede ser definido en la ventana socio de negocio (Cliente).";

@XendraField(AD_Column_ID="POReference",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="935ba2d5-bb40-39a6-d9a7-27004d74a016")
public static final String FIELDNAME_PartnerSelection_OrderReference="935ba2d5-bb40-39a6-d9a7-27004d74a016";

@XendraTrl(Identifier="77c0fd6b-0118-bf02-be1e-9723b7dcbc1c")
public static String es_PE_FIELD_Employee_OrderReference_Name="Referencia de Orden de Socio";

@XendraTrl(Identifier="77c0fd6b-0118-bf02-be1e-9723b7dcbc1c")
public static String es_PE_FIELD_Employee_OrderReference_Description="Número de referencia de de la transacción (Orden de Venta; Orden de Compra) de su socio de negocio)";

@XendraTrl(Identifier="77c0fd6b-0118-bf02-be1e-9723b7dcbc1c")
public static String es_PE_FIELD_Employee_OrderReference_Help="La referencia de orden del socio de negocio es la referencia para esta transacción específica. Frecuentemente los números de orden de compras se dan para ser impresas en las facturas como una referencia más fácil. Un número estándar puede ser definido en la ventana socio de negocio (Cliente).";

@XendraField(AD_Column_ID="POReference",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="77c0fd6b-0118-bf02-be1e-9723b7dcbc1c")
public static final String FIELDNAME_Employee_OrderReference="77c0fd6b-0118-bf02-be1e-9723b7dcbc1c";

@XendraTrl(Identifier="7f5a29c7-1f76-3958-8337-db210bd09c01")
public static String es_PE_FIELD_Vendor_OrderReference2_Name="Referencia de Orden de Socio";

@XendraTrl(Identifier="7f5a29c7-1f76-3958-8337-db210bd09c01")
public static String es_PE_FIELD_Vendor_OrderReference2_Description="Número de referencia de de la transacción (Orden de Venta; Orden de Compra) de su socio de negocio)";

@XendraTrl(Identifier="7f5a29c7-1f76-3958-8337-db210bd09c01")
public static String es_PE_FIELD_Vendor_OrderReference2_Help="La referencia de orden del socio de negocio es la referencia para esta transacción específica. Frecuentemente los números de orden de compras se dan para ser impresas en las facturas como una referencia más fácil. Un número estándar puede ser definido en la ventana socio de negocio (Cliente).";

@XendraField(AD_Column_ID="POReference",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7f5a29c7-1f76-3958-8337-db210bd09c01")
public static final String FIELDNAME_Vendor_OrderReference2="7f5a29c7-1f76-3958-8337-db210bd09c01";

@XendraTrl(Identifier="f5169ddb-fc3f-dabb-be2e-9b24aba65e4f")
public static String es_PE_FIELD_Customer_OrderReference_Name="Referencia de Orden de Socio";

@XendraTrl(Identifier="f5169ddb-fc3f-dabb-be2e-9b24aba65e4f")
public static String es_PE_FIELD_Customer_OrderReference_Description="Número de referencia de de la transacción (Orden de Venta; Orden de Compra) de su socio de negocio)";

@XendraTrl(Identifier="f5169ddb-fc3f-dabb-be2e-9b24aba65e4f")
public static String es_PE_FIELD_Customer_OrderReference_Help="La referencia de orden del socio de negocio es la referencia para esta transacción específica. Frecuentemente los números de orden de compras se dan para ser impresas en las facturas como una referencia más fácil. Un número estándar puede ser definido en la ventana socio de negocio (Cliente).";

@XendraField(AD_Column_ID="POReference",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f5169ddb-fc3f-dabb-be2e-9b24aba65e4f")
public static final String FIELDNAME_Customer_OrderReference="f5169ddb-fc3f-dabb-be2e-9b24aba65e4f";

@XendraTrl(Identifier="f7550eb4-8f74-f50b-659d-c0125d90307c")
public static String es_PE_FIELD_AssignedPartners_OrderReference_Name="Referencia de Orden de Socio";

@XendraTrl(Identifier="f7550eb4-8f74-f50b-659d-c0125d90307c")
public static String es_PE_FIELD_AssignedPartners_OrderReference_Description="Número de referencia de de la transacción (Orden de Venta; Orden de Compra) de su socio de negocio)";

@XendraTrl(Identifier="f7550eb4-8f74-f50b-659d-c0125d90307c")
public static String es_PE_FIELD_AssignedPartners_OrderReference_Help="La referencia de orden del socio de negocio es la referencia para esta transacción específica. Frecuentemente los números de orden de compras se dan para ser impresas en las facturas como una referencia más fácil. Un número estándar puede ser definido en la ventana socio de negocio (Cliente).";

@XendraField(AD_Column_ID="POReference",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f7550eb4-8f74-f50b-659d-c0125d90307c")
public static final String FIELDNAME_AssignedPartners_OrderReference="f7550eb4-8f74-f50b-659d-c0125d90307c";

@XendraTrl(Identifier="fc740c5e-93b6-f291-e179-3253e5df1a33")
public static String es_PE_FIELD_EmployeeVendor_OrderReference_Name="Referencia de Orden de Socio";

@XendraTrl(Identifier="fc740c5e-93b6-f291-e179-3253e5df1a33")
public static String es_PE_FIELD_EmployeeVendor_OrderReference_Description="Número de referencia de de la transacción (Orden de Venta; Orden de Compra) de su socio de negocio)";

@XendraTrl(Identifier="fc740c5e-93b6-f291-e179-3253e5df1a33")
public static String es_PE_FIELD_EmployeeVendor_OrderReference_Help="La referencia de orden del socio de negocio es la referencia para esta transacción específica. Frecuentemente los números de orden de compras se dan para ser impresas en las facturas como una referencia más fácil. Un número estándar puede ser definido en la ventana socio de negocio (Cliente).";

@XendraField(AD_Column_ID="POReference",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fc740c5e-93b6-f291-e179-3253e5df1a33")
public static final String FIELDNAME_EmployeeVendor_OrderReference="fc740c5e-93b6-f291-e179-3253e5df1a33";

@XendraTrl(Identifier="bf9d7805-9c4c-8e7e-36c7-4122ca29cd23")
public static String es_PE_FIELD_Customer_OrderReference2_Name="Referencia de Orden de Socio";

@XendraTrl(Identifier="bf9d7805-9c4c-8e7e-36c7-4122ca29cd23")
public static String es_PE_FIELD_Customer_OrderReference2_Description="Número de referencia de de la transacción (Orden de Venta; Orden de Compra) de su socio de negocio)";

@XendraTrl(Identifier="bf9d7805-9c4c-8e7e-36c7-4122ca29cd23")
public static String es_PE_FIELD_Customer_OrderReference2_Help="La referencia de orden del socio de negocio es la referencia para esta transacción específica. Frecuentemente los números de orden de compras se dan para ser impresas en las facturas como una referencia más fácil. Un número estándar puede ser definido en la ventana socio de negocio (Cliente).";

@XendraField(AD_Column_ID="POReference",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsCustomer@='Y'",DisplayLength=20,IsReadOnly=false,SeqNo=160,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="bf9d7805-9c4c-8e7e-36c7-4122ca29cd23")
public static final String FIELDNAME_Customer_OrderReference2="bf9d7805-9c4c-8e7e-36c7-4122ca29cd23";

@XendraTrl(Identifier="11e0e189-10b9-d8ad-2190-f05a4709138a")
public static String es_PE_FIELD_BusinessPartner_OrderReference2_Name="Referencia de Orden de Socio";

@XendraTrl(Identifier="11e0e189-10b9-d8ad-2190-f05a4709138a")
public static String es_PE_FIELD_BusinessPartner_OrderReference2_Description="Número de referencia de de la transacción (Orden de Venta; Orden de Compra) de su socio de negocio)";

@XendraTrl(Identifier="11e0e189-10b9-d8ad-2190-f05a4709138a")
public static String es_PE_FIELD_BusinessPartner_OrderReference2_Help="La referencia de orden del socio de negocio es la referencia para esta transacción específica. Frecuentemente los números de orden de compras se dan para ser impresas en las facturas como una referencia más fácil. Un número estándar puede ser definido en la ventana socio de negocio (Cliente).";

@XendraField(AD_Column_ID="POReference",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="11e0e189-10b9-d8ad-2190-f05a4709138a")
public static final String FIELDNAME_BusinessPartner_OrderReference2="11e0e189-10b9-d8ad-2190-f05a4709138a";

@XendraTrl(Identifier="dae40729-8e61-be6d-bb53-a5ecff15ef99")
public static String es_PE_COLUMN_POReference_Name="Referencia de Orden de Socio";

@XendraColumn(AD_Element_ID="c3de7eea-53b7-a810-0260-1bcb037a2967",ColumnName="POReference",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dae40729-8e61-be6d-bb53-a5ecff15ef99",
Synchronized="2019-08-30 22:21:10.0")
/** Column name POReference */
public static final String COLUMNNAME_POReference = "POReference";
/** Set Potential Life Time Value.
@param PotentialLifeTimeValue Total Revenue expected */
public void setPotentialLifeTimeValue (BigDecimal PotentialLifeTimeValue)
{
set_Value (COLUMNNAME_PotentialLifeTimeValue, PotentialLifeTimeValue);
}
/** Get Potential Life Time Value.
@return Total Revenue expected */
public BigDecimal getPotentialLifeTimeValue() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PotentialLifeTimeValue);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="699040d8-9cb9-8a19-90f9-ca8b51791cf6")
public static String es_PE_FIELD_Vendor_PotentialLifeTimeValue_Name="Valor Esperado";

@XendraTrl(Identifier="699040d8-9cb9-8a19-90f9-ca8b51791cf6")
public static String es_PE_FIELD_Vendor_PotentialLifeTimeValue_Description="Total de ingresos esperados";

@XendraTrl(Identifier="699040d8-9cb9-8a19-90f9-ca8b51791cf6")
public static String es_PE_FIELD_Vendor_PotentialLifeTimeValue_Help="El valor en el tiempo de vida potencial es el ingreso anticipado a ser generado por este socio de negocio.";

@XendraField(AD_Column_ID="PotentialLifeTimeValue",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="699040d8-9cb9-8a19-90f9-ca8b51791cf6")
public static final String FIELDNAME_Vendor_PotentialLifeTimeValue="699040d8-9cb9-8a19-90f9-ca8b51791cf6";

@XendraTrl(Identifier="f2abd2c5-5efb-d768-ec12-83ff47e7ba08")
public static String es_PE_FIELD_BusinessPartnerDimension_PotentialLifeTimeValue_Name="Valor Esperado";

@XendraTrl(Identifier="f2abd2c5-5efb-d768-ec12-83ff47e7ba08")
public static String es_PE_FIELD_BusinessPartnerDimension_PotentialLifeTimeValue_Description="Total de ingresos esperados";

@XendraTrl(Identifier="f2abd2c5-5efb-d768-ec12-83ff47e7ba08")
public static String es_PE_FIELD_BusinessPartnerDimension_PotentialLifeTimeValue_Help="El valor en el tiempo de vida potencial es el ingreso anticipado a ser generado por este socio de negocio.";

@XendraField(AD_Column_ID="PotentialLifeTimeValue",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f2abd2c5-5efb-d768-ec12-83ff47e7ba08")
public static final String FIELDNAME_BusinessPartnerDimension_PotentialLifeTimeValue="f2abd2c5-5efb-d768-ec12-83ff47e7ba08";

@XendraTrl(Identifier="0ad6f41d-1334-01cf-40f5-087215020137")
public static String es_PE_FIELD_AssignedPartners_PotentialLifeTimeValue_Name="Valor Esperado";

@XendraTrl(Identifier="0ad6f41d-1334-01cf-40f5-087215020137")
public static String es_PE_FIELD_AssignedPartners_PotentialLifeTimeValue_Description="Total de ingresos esperados";

@XendraTrl(Identifier="0ad6f41d-1334-01cf-40f5-087215020137")
public static String es_PE_FIELD_AssignedPartners_PotentialLifeTimeValue_Help="El valor en el tiempo de vida potencial es el ingreso anticipado a ser generado por este socio de negocio.";

@XendraField(AD_Column_ID="PotentialLifeTimeValue",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0ad6f41d-1334-01cf-40f5-087215020137")
public static final String FIELDNAME_AssignedPartners_PotentialLifeTimeValue="0ad6f41d-1334-01cf-40f5-087215020137";

@XendraTrl(Identifier="f2cbb907-d969-0afb-54f5-4964a6a9347a")
public static String es_PE_FIELD_Employee_PotentialLifeTimeValue_Name="Valor Esperado";

@XendraTrl(Identifier="f2cbb907-d969-0afb-54f5-4964a6a9347a")
public static String es_PE_FIELD_Employee_PotentialLifeTimeValue_Description="Total de ingresos esperados";

@XendraTrl(Identifier="f2cbb907-d969-0afb-54f5-4964a6a9347a")
public static String es_PE_FIELD_Employee_PotentialLifeTimeValue_Help="El valor en el tiempo de vida potencial es el ingreso anticipado a ser generado por este socio de negocio.";

@XendraField(AD_Column_ID="PotentialLifeTimeValue",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f2cbb907-d969-0afb-54f5-4964a6a9347a")
public static final String FIELDNAME_Employee_PotentialLifeTimeValue="f2cbb907-d969-0afb-54f5-4964a6a9347a";

@XendraTrl(Identifier="135d73e1-75be-44fd-d44b-19702d38e0d5")
public static String es_PE_FIELD_PartnerSelection_PotentialLifeTimeValue_Name="Valor Esperado";

@XendraTrl(Identifier="135d73e1-75be-44fd-d44b-19702d38e0d5")
public static String es_PE_FIELD_PartnerSelection_PotentialLifeTimeValue_Description="Total de ingresos esperados";

@XendraTrl(Identifier="135d73e1-75be-44fd-d44b-19702d38e0d5")
public static String es_PE_FIELD_PartnerSelection_PotentialLifeTimeValue_Help="El valor en el tiempo de vida potencial es el ingreso anticipado a ser generado por este socio de negocio.";

@XendraField(AD_Column_ID="PotentialLifeTimeValue",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="135d73e1-75be-44fd-d44b-19702d38e0d5")
public static final String FIELDNAME_PartnerSelection_PotentialLifeTimeValue="135d73e1-75be-44fd-d44b-19702d38e0d5";

@XendraTrl(Identifier="18e660c1-be7f-0ec5-4afd-4a4c91912beb")
public static String es_PE_FIELD_EmployeeVendor_PotentialLifeTimeValue_Name="Valor Esperado";

@XendraTrl(Identifier="18e660c1-be7f-0ec5-4afd-4a4c91912beb")
public static String es_PE_FIELD_EmployeeVendor_PotentialLifeTimeValue_Description="Total de ingresos esperados";

@XendraTrl(Identifier="18e660c1-be7f-0ec5-4afd-4a4c91912beb")
public static String es_PE_FIELD_EmployeeVendor_PotentialLifeTimeValue_Help="El valor en el tiempo de vida potencial es el ingreso anticipado a ser generado por este socio de negocio.";

@XendraField(AD_Column_ID="PotentialLifeTimeValue",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="18e660c1-be7f-0ec5-4afd-4a4c91912beb")
public static final String FIELDNAME_EmployeeVendor_PotentialLifeTimeValue="18e660c1-be7f-0ec5-4afd-4a4c91912beb";

@XendraTrl(Identifier="cd4c014d-ed95-8cdc-209e-773ef589ed9e")
public static String es_PE_FIELD_Customer_PotentialLifeTimeValue_Name="Valor Esperado";

@XendraTrl(Identifier="cd4c014d-ed95-8cdc-209e-773ef589ed9e")
public static String es_PE_FIELD_Customer_PotentialLifeTimeValue_Description="Total de ingresos esperados";

@XendraTrl(Identifier="cd4c014d-ed95-8cdc-209e-773ef589ed9e")
public static String es_PE_FIELD_Customer_PotentialLifeTimeValue_Help="El valor en el tiempo de vida potencial es el ingreso anticipado a ser generado por este socio de negocio.";

@XendraField(AD_Column_ID="PotentialLifeTimeValue",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cd4c014d-ed95-8cdc-209e-773ef589ed9e")
public static final String FIELDNAME_Customer_PotentialLifeTimeValue="cd4c014d-ed95-8cdc-209e-773ef589ed9e";

@XendraTrl(Identifier="ab051fcd-105f-b8e1-4bfa-73b4fbd4f921")
public static String es_PE_FIELD_BusinessPartner_PotentialLifeTimeValue_Name="Valor Esperado";

@XendraTrl(Identifier="ab051fcd-105f-b8e1-4bfa-73b4fbd4f921")
public static String es_PE_FIELD_BusinessPartner_PotentialLifeTimeValue_Description="Total de ingresos esperados";

@XendraTrl(Identifier="ab051fcd-105f-b8e1-4bfa-73b4fbd4f921")
public static String es_PE_FIELD_BusinessPartner_PotentialLifeTimeValue_Help="El valor en el tiempo de vida potencial es el ingreso anticipado a ser generado por este socio de negocio.";

@XendraField(AD_Column_ID="PotentialLifeTimeValue",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ab051fcd-105f-b8e1-4bfa-73b4fbd4f921")
public static final String FIELDNAME_BusinessPartner_PotentialLifeTimeValue="ab051fcd-105f-b8e1-4bfa-73b4fbd4f921";

@XendraTrl(Identifier="ec397c1f-bf17-d5f0-f283-bc86c7847eff")
public static String es_PE_FIELD_Customer_PotentialLifeTimeValue2_Name="Valor Esperado";

@XendraTrl(Identifier="ec397c1f-bf17-d5f0-f283-bc86c7847eff")
public static String es_PE_FIELD_Customer_PotentialLifeTimeValue2_Description="Total de ingresos esperados";

@XendraTrl(Identifier="ec397c1f-bf17-d5f0-f283-bc86c7847eff")
public static String es_PE_FIELD_Customer_PotentialLifeTimeValue2_Help="El valor en el tiempo de vida potencial es el ingreso anticipado a ser generado por este socio de negocio.";

@XendraField(AD_Column_ID="PotentialLifeTimeValue",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ec397c1f-bf17-d5f0-f283-bc86c7847eff")
public static final String FIELDNAME_Customer_PotentialLifeTimeValue2="ec397c1f-bf17-d5f0-f283-bc86c7847eff";

@XendraTrl(Identifier="46af146f-ee5f-de60-8eaa-acbfa0a79e7f")
public static String es_PE_FIELD_Vendor_PotentialLifeTimeValue2_Name="Valor Esperado";

@XendraTrl(Identifier="46af146f-ee5f-de60-8eaa-acbfa0a79e7f")
public static String es_PE_FIELD_Vendor_PotentialLifeTimeValue2_Description="Total de ingresos esperados";

@XendraTrl(Identifier="46af146f-ee5f-de60-8eaa-acbfa0a79e7f")
public static String es_PE_FIELD_Vendor_PotentialLifeTimeValue2_Help="El valor en el tiempo de vida potencial es el ingreso anticipado a ser generado por este socio de negocio.";

@XendraField(AD_Column_ID="PotentialLifeTimeValue",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="46af146f-ee5f-de60-8eaa-acbfa0a79e7f")
public static final String FIELDNAME_Vendor_PotentialLifeTimeValue2="46af146f-ee5f-de60-8eaa-acbfa0a79e7f";

@XendraTrl(Identifier="591a7c2d-bcd6-6920-3149-28b38355728d")
public static String es_PE_FIELD_BusinessPartner_PotentialLifeTimeValue2_Name="Valor Esperado";

@XendraTrl(Identifier="591a7c2d-bcd6-6920-3149-28b38355728d")
public static String es_PE_FIELD_BusinessPartner_PotentialLifeTimeValue2_Description="Total de ingresos esperados";

@XendraTrl(Identifier="591a7c2d-bcd6-6920-3149-28b38355728d")
public static String es_PE_FIELD_BusinessPartner_PotentialLifeTimeValue2_Help="El valor en el tiempo de vida potencial es el ingreso anticipado a ser generado por este socio de negocio.";

@XendraField(AD_Column_ID="PotentialLifeTimeValue",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsEmployee@=N",DisplayLength=26,IsReadOnly=false,SeqNo=180,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="591a7c2d-bcd6-6920-3149-28b38355728d")
public static final String FIELDNAME_BusinessPartner_PotentialLifeTimeValue2="591a7c2d-bcd6-6920-3149-28b38355728d";

@XendraTrl(Identifier="f857ce01-273c-c5bf-fb74-2efe912d7e1a")
public static String es_PE_COLUMN_PotentialLifeTimeValue_Name="Valor Esperado";

@XendraColumn(AD_Element_ID="1fac643d-32d3-a7bc-de4a-4ad2bf48935f",
ColumnName="PotentialLifeTimeValue",AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="f857ce01-273c-c5bf-fb74-2efe912d7e1a",Synchronized="2019-08-30 22:21:10.0")
/** Column name PotentialLifeTimeValue */
public static final String COLUMNNAME_PotentialLifeTimeValue = "PotentialLifeTimeValue";
/** Set Rating.
@param Rating Classification or Importance */
public void setRating (String Rating)
{
if (Rating != null && Rating.length() > 1)
{
log.warning("Length > 1 - truncated");
Rating = Rating.substring(0,0);
}
set_Value (COLUMNNAME_Rating, Rating);
}
/** Get Rating.
@return Classification or Importance */
public String getRating() 
{
String value = (String)get_Value(COLUMNNAME_Rating);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="1d90d68d-dd29-344e-fef3-8f95fead407c")
public static String es_PE_FIELD_Vendor_Rating_Name="Valuación ABC";

@XendraTrl(Identifier="1d90d68d-dd29-344e-fef3-8f95fead407c")
public static String es_PE_FIELD_Vendor_Rating_Description="Clasificación ó importancia de un socio de negocio.";

@XendraTrl(Identifier="1d90d68d-dd29-344e-fef3-8f95fead407c")
public static String es_PE_FIELD_Vendor_Rating_Help="La valuación es usada para identificar la importancia del socio de negocio";

@XendraField(AD_Column_ID="Rating",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1d90d68d-dd29-344e-fef3-8f95fead407c")
public static final String FIELDNAME_Vendor_Rating="1d90d68d-dd29-344e-fef3-8f95fead407c";

@XendraTrl(Identifier="3c740fe4-c3b9-dff7-c2b2-3ef405618759")
public static String es_PE_FIELD_Customer_Rating_Name="Valuación ABC";

@XendraTrl(Identifier="3c740fe4-c3b9-dff7-c2b2-3ef405618759")
public static String es_PE_FIELD_Customer_Rating_Description="Clasificación ó importancia de un socio de negocio.";

@XendraTrl(Identifier="3c740fe4-c3b9-dff7-c2b2-3ef405618759")
public static String es_PE_FIELD_Customer_Rating_Help="La valuación es usada para identificar la importancia del socio de negocio";

@XendraField(AD_Column_ID="Rating",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3c740fe4-c3b9-dff7-c2b2-3ef405618759")
public static final String FIELDNAME_Customer_Rating="3c740fe4-c3b9-dff7-c2b2-3ef405618759";

@XendraTrl(Identifier="3602595b-cb9b-b5a3-6591-2371fbb4eef9")
public static String es_PE_FIELD_PartnerSelection_Rating_Name="Valuación ABC";

@XendraTrl(Identifier="3602595b-cb9b-b5a3-6591-2371fbb4eef9")
public static String es_PE_FIELD_PartnerSelection_Rating_Description="Clasificación ó importancia de un socio de negocio.";

@XendraTrl(Identifier="3602595b-cb9b-b5a3-6591-2371fbb4eef9")
public static String es_PE_FIELD_PartnerSelection_Rating_Help="La valuación es usada para identificar la importancia del socio de negocio";

@XendraField(AD_Column_ID="Rating",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3602595b-cb9b-b5a3-6591-2371fbb4eef9")
public static final String FIELDNAME_PartnerSelection_Rating="3602595b-cb9b-b5a3-6591-2371fbb4eef9";

@XendraTrl(Identifier="89124526-694c-1ddf-9e35-17743483d4b3")
public static String es_PE_FIELD_Vendor_Rating2_Name="Valuación ABC";

@XendraTrl(Identifier="89124526-694c-1ddf-9e35-17743483d4b3")
public static String es_PE_FIELD_Vendor_Rating2_Description="Clasificación ó importancia de un socio de negocio.";

@XendraTrl(Identifier="89124526-694c-1ddf-9e35-17743483d4b3")
public static String es_PE_FIELD_Vendor_Rating2_Help="La valuación es usada para identificar la importancia del socio de negocio";

@XendraField(AD_Column_ID="Rating",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="89124526-694c-1ddf-9e35-17743483d4b3")
public static final String FIELDNAME_Vendor_Rating2="89124526-694c-1ddf-9e35-17743483d4b3";

@XendraTrl(Identifier="3cc09527-e960-dee6-257e-df927064d829")
public static String es_PE_FIELD_BusinessPartner_Rating_Name="Valuación ABC";

@XendraTrl(Identifier="3cc09527-e960-dee6-257e-df927064d829")
public static String es_PE_FIELD_BusinessPartner_Rating_Description="Clasificación ó importancia de un socio de negocio.";

@XendraTrl(Identifier="3cc09527-e960-dee6-257e-df927064d829")
public static String es_PE_FIELD_BusinessPartner_Rating_Help="La valuación es usada para identificar la importancia del socio de negocio";

@XendraField(AD_Column_ID="Rating",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3cc09527-e960-dee6-257e-df927064d829")
public static final String FIELDNAME_BusinessPartner_Rating="3cc09527-e960-dee6-257e-df927064d829";

@XendraTrl(Identifier="0512cfef-9ec1-e55d-666d-617d279f0135")
public static String es_PE_FIELD_BusinessPartnerDimension_Rating_Name="Valuación ABC";

@XendraTrl(Identifier="0512cfef-9ec1-e55d-666d-617d279f0135")
public static String es_PE_FIELD_BusinessPartnerDimension_Rating_Description="Clasificación ó importancia de un socio de negocio.";

@XendraTrl(Identifier="0512cfef-9ec1-e55d-666d-617d279f0135")
public static String es_PE_FIELD_BusinessPartnerDimension_Rating_Help="La valuación es usada para identificar la importancia del socio de negocio";

@XendraField(AD_Column_ID="Rating",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0512cfef-9ec1-e55d-666d-617d279f0135")
public static final String FIELDNAME_BusinessPartnerDimension_Rating="0512cfef-9ec1-e55d-666d-617d279f0135";

@XendraTrl(Identifier="cc90b0db-2388-4022-a78f-a51f46f4c2c6")
public static String es_PE_FIELD_EmployeeVendor_Rating_Name="Valuación ABC";

@XendraTrl(Identifier="cc90b0db-2388-4022-a78f-a51f46f4c2c6")
public static String es_PE_FIELD_EmployeeVendor_Rating_Description="Clasificación ó importancia de un socio de negocio.";

@XendraTrl(Identifier="cc90b0db-2388-4022-a78f-a51f46f4c2c6")
public static String es_PE_FIELD_EmployeeVendor_Rating_Help="La valuación es usada para identificar la importancia del socio de negocio";

@XendraField(AD_Column_ID="Rating",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cc90b0db-2388-4022-a78f-a51f46f4c2c6")
public static final String FIELDNAME_EmployeeVendor_Rating="cc90b0db-2388-4022-a78f-a51f46f4c2c6";

@XendraTrl(Identifier="2f8e8dd1-b5ff-0b6b-06b8-7cce561a5a4e")
public static String es_PE_FIELD_Employee_Rating_Name="Valuación ABC";

@XendraTrl(Identifier="2f8e8dd1-b5ff-0b6b-06b8-7cce561a5a4e")
public static String es_PE_FIELD_Employee_Rating_Description="Clasificación ó importancia de un socio de negocio.";

@XendraTrl(Identifier="2f8e8dd1-b5ff-0b6b-06b8-7cce561a5a4e")
public static String es_PE_FIELD_Employee_Rating_Help="La valuación es usada para identificar la importancia del socio de negocio";

@XendraField(AD_Column_ID="Rating",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2f8e8dd1-b5ff-0b6b-06b8-7cce561a5a4e")
public static final String FIELDNAME_Employee_Rating="2f8e8dd1-b5ff-0b6b-06b8-7cce561a5a4e";

@XendraTrl(Identifier="1a096b2c-6d33-abc1-6607-3eebe801fbef")
public static String es_PE_FIELD_Customer_Rating2_Name="Valuación ABC";

@XendraTrl(Identifier="1a096b2c-6d33-abc1-6607-3eebe801fbef")
public static String es_PE_FIELD_Customer_Rating2_Description="Clasificación ó importancia de un socio de negocio.";

@XendraTrl(Identifier="1a096b2c-6d33-abc1-6607-3eebe801fbef")
public static String es_PE_FIELD_Customer_Rating2_Help="La valuación es usada para identificar la importancia del socio de negocio";

@XendraField(AD_Column_ID="Rating",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1a096b2c-6d33-abc1-6607-3eebe801fbef")
public static final String FIELDNAME_Customer_Rating2="1a096b2c-6d33-abc1-6607-3eebe801fbef";

@XendraTrl(Identifier="f70722a4-b896-6c8a-5ccc-6d3d4bc952ed")
public static String es_PE_FIELD_AssignedPartners_Rating_Name="Valuación ABC";

@XendraTrl(Identifier="f70722a4-b896-6c8a-5ccc-6d3d4bc952ed")
public static String es_PE_FIELD_AssignedPartners_Rating_Description="Clasificación ó importancia de un socio de negocio.";

@XendraTrl(Identifier="f70722a4-b896-6c8a-5ccc-6d3d4bc952ed")
public static String es_PE_FIELD_AssignedPartners_Rating_Help="La valuación es usada para identificar la importancia del socio de negocio";

@XendraField(AD_Column_ID="Rating",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f70722a4-b896-6c8a-5ccc-6d3d4bc952ed")
public static final String FIELDNAME_AssignedPartners_Rating="f70722a4-b896-6c8a-5ccc-6d3d4bc952ed";

@XendraTrl(Identifier="a2864492-8fc3-21f1-fc02-3570bc6f6e28")
public static String es_PE_FIELD_BusinessPartner_Rating2_Name="Valuación ABC";

@XendraTrl(Identifier="a2864492-8fc3-21f1-fc02-3570bc6f6e28")
public static String es_PE_FIELD_BusinessPartner_Rating2_Description="Clasificación ó importancia de un socio de negocio.";

@XendraTrl(Identifier="a2864492-8fc3-21f1-fc02-3570bc6f6e28")
public static String es_PE_FIELD_BusinessPartner_Rating2_Help="La valuación es usada para identificar la importancia del socio de negocio";

@XendraField(AD_Column_ID="Rating",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a2864492-8fc3-21f1-fc02-3570bc6f6e28")
public static final String FIELDNAME_BusinessPartner_Rating2="a2864492-8fc3-21f1-fc02-3570bc6f6e28";

@XendraTrl(Identifier="a0ab1650-118e-4030-633d-414c2236baf4")
public static String es_PE_COLUMN_Rating_Name="Valuación ABC";

@XendraColumn(AD_Element_ID="6161a501-b107-e456-9064-4fab7d81439d",ColumnName="Rating",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="L",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a0ab1650-118e-4030-633d-414c2236baf4",
Synchronized="2019-08-30 22:21:10.0")
/** Column name Rating */
public static final String COLUMNNAME_Rating = "Rating";
/** Set Reference No.
@param ReferenceNo Your customer or vendor number at the Business Partner's site */
public void setReferenceNo (String ReferenceNo)
{
if (ReferenceNo != null && ReferenceNo.length() > 40)
{
log.warning("Length > 40 - truncated");
ReferenceNo = ReferenceNo.substring(0,39);
}
set_Value (COLUMNNAME_ReferenceNo, ReferenceNo);
}
/** Get Reference No.
@return Your customer or vendor number at the Business Partner's site */
public String getReferenceNo() 
{
String value = (String)get_Value(COLUMNNAME_ReferenceNo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="0d3b2a38-722c-139b-c206-0da9ffc23d38")
public static String es_PE_FIELD_PartnerSelection_ReferenceNo_Name="No. de Referencia";

@XendraTrl(Identifier="0d3b2a38-722c-139b-c206-0da9ffc23d38")
public static String es_PE_FIELD_PartnerSelection_ReferenceNo_Description="Su número de cliente ó proveedor con el socio de negocio.";

@XendraTrl(Identifier="0d3b2a38-722c-139b-c206-0da9ffc23d38")
public static String es_PE_FIELD_PartnerSelection_ReferenceNo_Help="El número de referencia puede ser impreso en órdenes y facturas para permitirle a su socio de negocio identificar más rápido sus registros.";

@XendraField(AD_Column_ID="ReferenceNo",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0d3b2a38-722c-139b-c206-0da9ffc23d38")
public static final String FIELDNAME_PartnerSelection_ReferenceNo="0d3b2a38-722c-139b-c206-0da9ffc23d38";

@XendraTrl(Identifier="85661897-3a42-007a-eb2b-b9fb60969903")
public static String es_PE_FIELD_BusinessPartnerDimension_ReferenceNo_Name="No. de Referencia";

@XendraTrl(Identifier="85661897-3a42-007a-eb2b-b9fb60969903")
public static String es_PE_FIELD_BusinessPartnerDimension_ReferenceNo_Description="Su número de cliente ó proveedor con el socio de negocio.";

@XendraTrl(Identifier="85661897-3a42-007a-eb2b-b9fb60969903")
public static String es_PE_FIELD_BusinessPartnerDimension_ReferenceNo_Help="El número de referencia puede ser impreso en órdenes y facturas para permitirle a su socio de negocio identificar más rápido sus registros.";

@XendraField(AD_Column_ID="ReferenceNo",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="85661897-3a42-007a-eb2b-b9fb60969903")
public static final String FIELDNAME_BusinessPartnerDimension_ReferenceNo="85661897-3a42-007a-eb2b-b9fb60969903";

@XendraTrl(Identifier="a4f7107a-b662-2218-5f48-662e50cfc123")
public static String es_PE_FIELD_EmployeeVendor_ReferenceNo_Name="No. de Referencia";

@XendraTrl(Identifier="a4f7107a-b662-2218-5f48-662e50cfc123")
public static String es_PE_FIELD_EmployeeVendor_ReferenceNo_Description="Su número de cliente ó proveedor con el socio de negocio.";

@XendraTrl(Identifier="a4f7107a-b662-2218-5f48-662e50cfc123")
public static String es_PE_FIELD_EmployeeVendor_ReferenceNo_Help="El número de referencia puede ser impreso en órdenes y facturas para permitirle a su socio de negocio identificar más rápido sus registros.";

@XendraField(AD_Column_ID="ReferenceNo",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a4f7107a-b662-2218-5f48-662e50cfc123")
public static final String FIELDNAME_EmployeeVendor_ReferenceNo="a4f7107a-b662-2218-5f48-662e50cfc123";

@XendraTrl(Identifier="cc05cd3a-e6d6-9bef-3595-a63989b99967")
public static String es_PE_FIELD_Employee_ReferenceNo_Name="No. de Referencia";

@XendraTrl(Identifier="cc05cd3a-e6d6-9bef-3595-a63989b99967")
public static String es_PE_FIELD_Employee_ReferenceNo_Description="Su número de cliente ó proveedor con el socio de negocio.";

@XendraTrl(Identifier="cc05cd3a-e6d6-9bef-3595-a63989b99967")
public static String es_PE_FIELD_Employee_ReferenceNo_Help="El número de referencia puede ser impreso en órdenes y facturas para permitirle a su socio de negocio identificar más rápido sus registros.";

@XendraField(AD_Column_ID="ReferenceNo",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cc05cd3a-e6d6-9bef-3595-a63989b99967")
public static final String FIELDNAME_Employee_ReferenceNo="cc05cd3a-e6d6-9bef-3595-a63989b99967";

@XendraTrl(Identifier="0c01e381-628b-7418-9b0b-18c27dac8046")
public static String es_PE_FIELD_BusinessPartner_ReferenceNo_Name="No. de Referencia";

@XendraTrl(Identifier="0c01e381-628b-7418-9b0b-18c27dac8046")
public static String es_PE_FIELD_BusinessPartner_ReferenceNo_Description="Su número de cliente ó proveedor con el socio de negocio.";

@XendraTrl(Identifier="0c01e381-628b-7418-9b0b-18c27dac8046")
public static String es_PE_FIELD_BusinessPartner_ReferenceNo_Help="El número de referencia puede ser impreso en órdenes y facturas para permitirle a su socio de negocio identificar más rápido sus registros.";

@XendraField(AD_Column_ID="ReferenceNo",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0c01e381-628b-7418-9b0b-18c27dac8046")
public static final String FIELDNAME_BusinessPartner_ReferenceNo="0c01e381-628b-7418-9b0b-18c27dac8046";

@XendraTrl(Identifier="24f166c6-3c61-cd69-b3f1-6aa91985cc27")
public static String es_PE_FIELD_Vendor_ReferenceNo_Name="No. de Referencia";

@XendraTrl(Identifier="24f166c6-3c61-cd69-b3f1-6aa91985cc27")
public static String es_PE_FIELD_Vendor_ReferenceNo_Description="Su número de cliente ó proveedor con el socio de negocio.";

@XendraTrl(Identifier="24f166c6-3c61-cd69-b3f1-6aa91985cc27")
public static String es_PE_FIELD_Vendor_ReferenceNo_Help="El número de referencia puede ser impreso en órdenes y facturas para permitirle a su socio de negocio identificar más rápido sus registros.";

@XendraField(AD_Column_ID="ReferenceNo",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="24f166c6-3c61-cd69-b3f1-6aa91985cc27")
public static final String FIELDNAME_Vendor_ReferenceNo="24f166c6-3c61-cd69-b3f1-6aa91985cc27";

@XendraTrl(Identifier="d68f2e7e-6ee7-3956-02b0-7123a2f5a69e")
public static String es_PE_FIELD_Vendor_ReferenceNo2_Name="No. de Referencia";

@XendraTrl(Identifier="d68f2e7e-6ee7-3956-02b0-7123a2f5a69e")
public static String es_PE_FIELD_Vendor_ReferenceNo2_Description="Su número de cliente ó proveedor con el socio de negocio.";

@XendraTrl(Identifier="d68f2e7e-6ee7-3956-02b0-7123a2f5a69e")
public static String es_PE_FIELD_Vendor_ReferenceNo2_Help="El número de referencia puede ser impreso en órdenes y facturas para permitirle a su socio de negocio identificar más rápido sus registros.";

@XendraField(AD_Column_ID="ReferenceNo",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d68f2e7e-6ee7-3956-02b0-7123a2f5a69e")
public static final String FIELDNAME_Vendor_ReferenceNo2="d68f2e7e-6ee7-3956-02b0-7123a2f5a69e";

@XendraTrl(Identifier="120783e7-9d03-6f78-0c3c-a36f646a53ac")
public static String es_PE_FIELD_Customer_ReferenceNo_Name="No. de Referencia";

@XendraTrl(Identifier="120783e7-9d03-6f78-0c3c-a36f646a53ac")
public static String es_PE_FIELD_Customer_ReferenceNo_Description="Su número de cliente ó proveedor con el socio de negocio.";

@XendraTrl(Identifier="120783e7-9d03-6f78-0c3c-a36f646a53ac")
public static String es_PE_FIELD_Customer_ReferenceNo_Help="El número de referencia puede ser impreso en órdenes y facturas para permitirle a su socio de negocio identificar más rápido sus registros.";

@XendraField(AD_Column_ID="ReferenceNo",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="120783e7-9d03-6f78-0c3c-a36f646a53ac")
public static final String FIELDNAME_Customer_ReferenceNo="120783e7-9d03-6f78-0c3c-a36f646a53ac";

@XendraTrl(Identifier="a288a3b4-2073-7e30-6b61-1721f4373e9f")
public static String es_PE_FIELD_AssignedPartners_ReferenceNo_Name="No. de Referencia";

@XendraTrl(Identifier="a288a3b4-2073-7e30-6b61-1721f4373e9f")
public static String es_PE_FIELD_AssignedPartners_ReferenceNo_Description="Su número de cliente ó proveedor con el socio de negocio.";

@XendraTrl(Identifier="a288a3b4-2073-7e30-6b61-1721f4373e9f")
public static String es_PE_FIELD_AssignedPartners_ReferenceNo_Help="El número de referencia puede ser impreso en órdenes y facturas para permitirle a su socio de negocio identificar más rápido sus registros.";

@XendraField(AD_Column_ID="ReferenceNo",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a288a3b4-2073-7e30-6b61-1721f4373e9f")
public static final String FIELDNAME_AssignedPartners_ReferenceNo="a288a3b4-2073-7e30-6b61-1721f4373e9f";

@XendraTrl(Identifier="04e086a3-1fb4-b7a6-e1c4-b30440b32469")
public static String es_PE_FIELD_Customer_ReferenceNo2_Name="No. de Referencia";

@XendraTrl(Identifier="04e086a3-1fb4-b7a6-e1c4-b30440b32469")
public static String es_PE_FIELD_Customer_ReferenceNo2_Description="Su número de cliente ó proveedor con el socio de negocio.";

@XendraTrl(Identifier="04e086a3-1fb4-b7a6-e1c4-b30440b32469")
public static String es_PE_FIELD_Customer_ReferenceNo2_Help="El número de referencia puede ser impreso en órdenes y facturas para permitirle a su socio de negocio identificar más rápido sus registros.";

@XendraField(AD_Column_ID="ReferenceNo",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="04e086a3-1fb4-b7a6-e1c4-b30440b32469")
public static final String FIELDNAME_Customer_ReferenceNo2="04e086a3-1fb4-b7a6-e1c4-b30440b32469";

@XendraTrl(Identifier="1f4ff65c-f53e-3327-281c-f34c66a1eaeb")
public static String es_PE_FIELD_BusinessPartner_ReferenceNo2_Name="No. de Referencia";

@XendraTrl(Identifier="1f4ff65c-f53e-3327-281c-f34c66a1eaeb")
public static String es_PE_FIELD_BusinessPartner_ReferenceNo2_Description="Su número de cliente ó proveedor con el socio de negocio.";

@XendraTrl(Identifier="1f4ff65c-f53e-3327-281c-f34c66a1eaeb")
public static String es_PE_FIELD_BusinessPartner_ReferenceNo2_Help="El número de referencia puede ser impreso en órdenes y facturas para permitirle a su socio de negocio identificar más rápido sus registros.";

@XendraField(AD_Column_ID="ReferenceNo",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1f4ff65c-f53e-3327-281c-f34c66a1eaeb")
public static final String FIELDNAME_BusinessPartner_ReferenceNo2="1f4ff65c-f53e-3327-281c-f34c66a1eaeb";

@XendraTrl(Identifier="1a937be7-cd84-388e-a51e-180adec10204")
public static String es_PE_COLUMN_ReferenceNo_Name="No. de Referencia";

@XendraColumn(AD_Element_ID="87d37906-4977-97f1-29f1-85a654abe404",ColumnName="ReferenceNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1a937be7-cd84-388e-a51e-180adec10204",
Synchronized="2019-08-30 22:21:10.0")
/** Column name ReferenceNo */
public static final String COLUMNNAME_ReferenceNo = "ReferenceNo";
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

@XendraTrl(Identifier="6450aade-b397-7111-27a9-f2744eeaaf5a")
public static String es_PE_FIELD_BusinessPartnerDimension_SalesRepresentative2_Name="Agente Cía";

@XendraTrl(Identifier="6450aade-b397-7111-27a9-f2744eeaaf5a")
public static String es_PE_FIELD_BusinessPartnerDimension_SalesRepresentative2_Description="Representante de Ventas";

@XendraTrl(Identifier="6450aade-b397-7111-27a9-f2744eeaaf5a")
public static String es_PE_FIELD_BusinessPartnerDimension_SalesRepresentative2_Help="El representante de ventas indica el representante de ventas para esta región.";

@XendraField(AD_Column_ID="SalesRep_ID",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6450aade-b397-7111-27a9-f2744eeaaf5a")
public static final String FIELDNAME_BusinessPartnerDimension_SalesRepresentative2="6450aade-b397-7111-27a9-f2744eeaaf5a";

@XendraTrl(Identifier="cac1849d-9871-f4bf-9d20-51984e53fa31")
public static String es_PE_FIELD_PartnerSelection_SalesRepresentative2_Name="Agente Cía";

@XendraTrl(Identifier="cac1849d-9871-f4bf-9d20-51984e53fa31")
public static String es_PE_FIELD_PartnerSelection_SalesRepresentative2_Description="Representante de Ventas";

@XendraTrl(Identifier="cac1849d-9871-f4bf-9d20-51984e53fa31")
public static String es_PE_FIELD_PartnerSelection_SalesRepresentative2_Help="El representante de ventas indica el representante de ventas para esta región.";

@XendraField(AD_Column_ID="SalesRep_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cac1849d-9871-f4bf-9d20-51984e53fa31")
public static final String FIELDNAME_PartnerSelection_SalesRepresentative2="cac1849d-9871-f4bf-9d20-51984e53fa31";

@XendraTrl(Identifier="cca33e56-f9c5-b5e6-c69a-764688f56f4a")
public static String es_PE_FIELD_EmployeeVendor_CompanyAgent2_Name="Comprador";

@XendraTrl(Identifier="cca33e56-f9c5-b5e6-c69a-764688f56f4a")
public static String es_PE_FIELD_EmployeeVendor_CompanyAgent2_Description="Comprador/ Agente";

@XendraTrl(Identifier="cca33e56-f9c5-b5e6-c69a-764688f56f4a")
public static String es_PE_FIELD_EmployeeVendor_CompanyAgent2_Help="Agente de compras para el documento.";

@XendraField(AD_Column_ID="SalesRep_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cca33e56-f9c5-b5e6-c69a-764688f56f4a")
public static final String FIELDNAME_EmployeeVendor_CompanyAgent2="cca33e56-f9c5-b5e6-c69a-764688f56f4a";

@XendraTrl(Identifier="cccf6269-73c6-3468-b231-31a705b1e1ba")
public static String es_PE_FIELD_BusinessPartner_SalesRepresentative3_Name="Agente Cía";

@XendraTrl(Identifier="cccf6269-73c6-3468-b231-31a705b1e1ba")
public static String es_PE_FIELD_BusinessPartner_SalesRepresentative3_Description="Representante de Ventas";

@XendraTrl(Identifier="cccf6269-73c6-3468-b231-31a705b1e1ba")
public static String es_PE_FIELD_BusinessPartner_SalesRepresentative3_Help="El representante de ventas indica el representante de ventas para esta región.";

@XendraField(AD_Column_ID="SalesRep_ID",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cccf6269-73c6-3468-b231-31a705b1e1ba")
public static final String FIELDNAME_BusinessPartner_SalesRepresentative3="cccf6269-73c6-3468-b231-31a705b1e1ba";

@XendraTrl(Identifier="e4fe07fb-c1fc-84bb-3921-7635b289b892")
public static String es_PE_FIELD_Vendor_CompanyAgent2_Name="Comprador";

@XendraTrl(Identifier="e4fe07fb-c1fc-84bb-3921-7635b289b892")
public static String es_PE_FIELD_Vendor_CompanyAgent2_Description="Comprador/ Agente";

@XendraTrl(Identifier="e4fe07fb-c1fc-84bb-3921-7635b289b892")
public static String es_PE_FIELD_Vendor_CompanyAgent2_Help="Agente de compras para el documento.";

@XendraField(AD_Column_ID="SalesRep_ID",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e4fe07fb-c1fc-84bb-3921-7635b289b892")
public static final String FIELDNAME_Vendor_CompanyAgent2="e4fe07fb-c1fc-84bb-3921-7635b289b892";

@XendraTrl(Identifier="49f068a8-c82b-4ff4-7d54-f9a1e84fe261")
public static String es_PE_FIELD_Employee_SalesRepresentative2_Name="Agente Cía";

@XendraTrl(Identifier="49f068a8-c82b-4ff4-7d54-f9a1e84fe261")
public static String es_PE_FIELD_Employee_SalesRepresentative2_Description="Representante de Ventas";

@XendraTrl(Identifier="49f068a8-c82b-4ff4-7d54-f9a1e84fe261")
public static String es_PE_FIELD_Employee_SalesRepresentative2_Help="El representante de ventas indica el representante de ventas para esta región.";

@XendraField(AD_Column_ID="SalesRep_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="49f068a8-c82b-4ff4-7d54-f9a1e84fe261")
public static final String FIELDNAME_Employee_SalesRepresentative2="49f068a8-c82b-4ff4-7d54-f9a1e84fe261";

@XendraTrl(Identifier="9a9da054-9bfd-9ed2-fa95-f6fb097e519c")
public static String es_PE_FIELD_Customer_SalesRepresentative3_Name="Agente Cía";

@XendraTrl(Identifier="9a9da054-9bfd-9ed2-fa95-f6fb097e519c")
public static String es_PE_FIELD_Customer_SalesRepresentative3_Description="Representante de Ventas";

@XendraTrl(Identifier="9a9da054-9bfd-9ed2-fa95-f6fb097e519c")
public static String es_PE_FIELD_Customer_SalesRepresentative3_Help="El representante de ventas indica el representante de ventas para esta región.";

@XendraField(AD_Column_ID="SalesRep_ID",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9a9da054-9bfd-9ed2-fa95-f6fb097e519c")
public static final String FIELDNAME_Customer_SalesRepresentative3="9a9da054-9bfd-9ed2-fa95-f6fb097e519c";

@XendraTrl(Identifier="a1c5660d-0eb9-009e-b103-a669423ca755")
public static String es_PE_FIELD_AssignedPartners_SalesRepresentative2_Name="Agente Cía";

@XendraTrl(Identifier="a1c5660d-0eb9-009e-b103-a669423ca755")
public static String es_PE_FIELD_AssignedPartners_SalesRepresentative2_Description="Representante de Ventas";

@XendraTrl(Identifier="a1c5660d-0eb9-009e-b103-a669423ca755")
public static String es_PE_FIELD_AssignedPartners_SalesRepresentative2_Help="El representante de ventas indica el representante de ventas para esta región.";

@XendraField(AD_Column_ID="SalesRep_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a1c5660d-0eb9-009e-b103-a669423ca755")
public static final String FIELDNAME_AssignedPartners_SalesRepresentative2="a1c5660d-0eb9-009e-b103-a669423ca755";

@XendraTrl(Identifier="e639d926-d404-0993-9ac0-a2dcb47e232a")
public static String es_PE_FIELD_Customer_SalesRepresentative4_Name="Agente Cía";

@XendraTrl(Identifier="e639d926-d404-0993-9ac0-a2dcb47e232a")
public static String es_PE_FIELD_Customer_SalesRepresentative4_Description="Representante de Ventas";

@XendraTrl(Identifier="e639d926-d404-0993-9ac0-a2dcb47e232a")
public static String es_PE_FIELD_Customer_SalesRepresentative4_Help="El representante de ventas indica el representante de ventas para esta región.";

@XendraField(AD_Column_ID="SalesRep_ID",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsCustomer@='Y'",DisplayLength=14,IsReadOnly=false,SeqNo=150,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="e639d926-d404-0993-9ac0-a2dcb47e232a")
public static final String FIELDNAME_Customer_SalesRepresentative4="e639d926-d404-0993-9ac0-a2dcb47e232a";

@XendraTrl(Identifier="6a4c716f-a613-7ea4-f26e-35497078469b")
public static String es_PE_FIELD_Vendor_SalesRepresentative2_Name="Agente Cía";

@XendraTrl(Identifier="6a4c716f-a613-7ea4-f26e-35497078469b")
public static String es_PE_FIELD_Vendor_SalesRepresentative2_Description="Representante de Ventas";

@XendraTrl(Identifier="6a4c716f-a613-7ea4-f26e-35497078469b")
public static String es_PE_FIELD_Vendor_SalesRepresentative2_Help="El representante de ventas indica el representante de ventas para esta región.";

@XendraField(AD_Column_ID="SalesRep_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6a4c716f-a613-7ea4-f26e-35497078469b")
public static final String FIELDNAME_Vendor_SalesRepresentative2="6a4c716f-a613-7ea4-f26e-35497078469b";

@XendraTrl(Identifier="9c712772-87f4-9c9d-25dc-b2f8313906c3")
public static String es_PE_FIELD_BusinessPartner_SalesRepresentative4_Name="Agente Cía";

@XendraTrl(Identifier="9c712772-87f4-9c9d-25dc-b2f8313906c3")
public static String es_PE_FIELD_BusinessPartner_SalesRepresentative4_Description="Representante de Ventas";

@XendraTrl(Identifier="9c712772-87f4-9c9d-25dc-b2f8313906c3")
public static String es_PE_FIELD_BusinessPartner_SalesRepresentative4_Help="El representante de ventas indica el representante de ventas para esta región.";

@XendraField(AD_Column_ID="SalesRep_ID",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=290,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9c712772-87f4-9c9d-25dc-b2f8313906c3")
public static final String FIELDNAME_BusinessPartner_SalesRepresentative4="9c712772-87f4-9c9d-25dc-b2f8313906c3";

@XendraTrl(Identifier="8c71161a-202a-f683-5174-e5b41abb3378")
public static String es_PE_COLUMN_SalesRep_ID_Name="Agente Cía";

@XendraColumn(AD_Element_ID="197a9c3a-ff10-c291-d65f-5e05a36d3710",ColumnName="SalesRep_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="15251147-a1b6-4a83-a3a5-2d3ae7db69d9",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="8c71161a-202a-f683-5174-e5b41abb3378",Synchronized="2019-08-30 22:21:11.0")
/** Column name SalesRep_ID */
public static final String COLUMNNAME_SalesRep_ID = "SalesRep_ID";
/** Set Sales Volume in 1.000.
@param SalesVolume Total Volume of Sales in Thousands of Currency */
public void setSalesVolume (int SalesVolume)
{
set_Value (COLUMNNAME_SalesVolume, Integer.valueOf(SalesVolume));
}
/** Get Sales Volume in 1.000.
@return Total Volume of Sales in Thousands of Currency */
public int getSalesVolume() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_SalesVolume);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="95f1da59-19a2-1f26-2b37-5a8025f17f22")
public static String es_PE_FIELD_PartnerSelection_SalesVolumeIn100_Name="Volúmen de Ventas";

@XendraTrl(Identifier="95f1da59-19a2-1f26-2b37-5a8025f17f22")
public static String es_PE_FIELD_PartnerSelection_SalesVolumeIn100_Description="Volúmen total de Ventas";

@XendraTrl(Identifier="95f1da59-19a2-1f26-2b37-5a8025f17f22")
public static String es_PE_FIELD_PartnerSelection_SalesVolumeIn100_Help="El Volúmen de ventas indica el volúmen total de ventas para un socio de negocio";

@XendraField(AD_Column_ID="SalesVolume",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="95f1da59-19a2-1f26-2b37-5a8025f17f22")
public static final String FIELDNAME_PartnerSelection_SalesVolumeIn100="95f1da59-19a2-1f26-2b37-5a8025f17f22";

@XendraTrl(Identifier="b6f5d554-8db4-6859-a45e-9d287b619ed5")
public static String es_PE_FIELD_BusinessPartnerDimension_SalesVolumeIn100_Name="Volúmen de Ventas";

@XendraTrl(Identifier="b6f5d554-8db4-6859-a45e-9d287b619ed5")
public static String es_PE_FIELD_BusinessPartnerDimension_SalesVolumeIn100_Description="Volúmen total de Ventas";

@XendraTrl(Identifier="b6f5d554-8db4-6859-a45e-9d287b619ed5")
public static String es_PE_FIELD_BusinessPartnerDimension_SalesVolumeIn100_Help="El Volúmen de ventas indica el volúmen total de ventas para un socio de negocio";

@XendraField(AD_Column_ID="SalesVolume",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b6f5d554-8db4-6859-a45e-9d287b619ed5")
public static final String FIELDNAME_BusinessPartnerDimension_SalesVolumeIn100="b6f5d554-8db4-6859-a45e-9d287b619ed5";

@XendraTrl(Identifier="21d2f172-905e-bc2d-023f-d07f9572af63")
public static String es_PE_FIELD_Customer_SalesVolumeIn100_Name="Volúmen de Ventas";

@XendraTrl(Identifier="21d2f172-905e-bc2d-023f-d07f9572af63")
public static String es_PE_FIELD_Customer_SalesVolumeIn100_Description="Volúmen total de Ventas";

@XendraTrl(Identifier="21d2f172-905e-bc2d-023f-d07f9572af63")
public static String es_PE_FIELD_Customer_SalesVolumeIn100_Help="El Volúmen de ventas indica el volúmen total de ventas para un socio de negocio";

@XendraField(AD_Column_ID="SalesVolume",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="21d2f172-905e-bc2d-023f-d07f9572af63")
public static final String FIELDNAME_Customer_SalesVolumeIn100="21d2f172-905e-bc2d-023f-d07f9572af63";

@XendraTrl(Identifier="deee212c-de7c-98b2-df4a-484d8ba5e90f")
public static String es_PE_FIELD_Vendor_SalesVolumeIn100_Name="Volúmen de Ventas";

@XendraTrl(Identifier="deee212c-de7c-98b2-df4a-484d8ba5e90f")
public static String es_PE_FIELD_Vendor_SalesVolumeIn100_Description="Volúmen total de Ventas";

@XendraTrl(Identifier="deee212c-de7c-98b2-df4a-484d8ba5e90f")
public static String es_PE_FIELD_Vendor_SalesVolumeIn100_Help="El Volúmen de ventas indica el volúmen total de ventas para un socio de negocio";

@XendraField(AD_Column_ID="SalesVolume",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="deee212c-de7c-98b2-df4a-484d8ba5e90f")
public static final String FIELDNAME_Vendor_SalesVolumeIn100="deee212c-de7c-98b2-df4a-484d8ba5e90f";

@XendraTrl(Identifier="47cfd148-de1c-4372-c457-3615ea4e6768")
public static String es_PE_FIELD_Employee_SalesVolumeIn100_Name="Volúmen de Ventas";

@XendraTrl(Identifier="47cfd148-de1c-4372-c457-3615ea4e6768")
public static String es_PE_FIELD_Employee_SalesVolumeIn100_Description="Volúmen total de Ventas";

@XendraTrl(Identifier="47cfd148-de1c-4372-c457-3615ea4e6768")
public static String es_PE_FIELD_Employee_SalesVolumeIn100_Help="El Volúmen de ventas indica el volúmen total de ventas para un socio de negocio";

@XendraField(AD_Column_ID="SalesVolume",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="47cfd148-de1c-4372-c457-3615ea4e6768")
public static final String FIELDNAME_Employee_SalesVolumeIn100="47cfd148-de1c-4372-c457-3615ea4e6768";

@XendraTrl(Identifier="788e0000-9c07-9eb3-3539-4784a42cd496")
public static String es_PE_FIELD_AssignedPartners_SalesVolumeIn100_Name="Volúmen de Ventas";

@XendraTrl(Identifier="788e0000-9c07-9eb3-3539-4784a42cd496")
public static String es_PE_FIELD_AssignedPartners_SalesVolumeIn100_Description="Volúmen total de Ventas";

@XendraTrl(Identifier="788e0000-9c07-9eb3-3539-4784a42cd496")
public static String es_PE_FIELD_AssignedPartners_SalesVolumeIn100_Help="El Volúmen de ventas indica el volúmen total de ventas para un socio de negocio";

@XendraField(AD_Column_ID="SalesVolume",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=270,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="788e0000-9c07-9eb3-3539-4784a42cd496")
public static final String FIELDNAME_AssignedPartners_SalesVolumeIn100="788e0000-9c07-9eb3-3539-4784a42cd496";

@XendraTrl(Identifier="20aa7e4d-bc23-1f64-add0-a1c88938b9a5")
public static String es_PE_FIELD_EmployeeVendor_SalesVolumeIn100_Name="Volúmen de Ventas";

@XendraTrl(Identifier="20aa7e4d-bc23-1f64-add0-a1c88938b9a5")
public static String es_PE_FIELD_EmployeeVendor_SalesVolumeIn100_Description="Volúmen total de Ventas";

@XendraTrl(Identifier="20aa7e4d-bc23-1f64-add0-a1c88938b9a5")
public static String es_PE_FIELD_EmployeeVendor_SalesVolumeIn100_Help="El Volúmen de ventas indica el volúmen total de ventas para un socio de negocio";

@XendraField(AD_Column_ID="SalesVolume",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="20aa7e4d-bc23-1f64-add0-a1c88938b9a5")
public static final String FIELDNAME_EmployeeVendor_SalesVolumeIn100="20aa7e4d-bc23-1f64-add0-a1c88938b9a5";

@XendraTrl(Identifier="030c2dc3-ed12-22b8-567f-6274c00cc015")
public static String es_PE_FIELD_BusinessPartner_SalesVolumeIn100_Name="Volúmen de Ventas";

@XendraTrl(Identifier="030c2dc3-ed12-22b8-567f-6274c00cc015")
public static String es_PE_FIELD_BusinessPartner_SalesVolumeIn100_Description="Volúmen total de Ventas";

@XendraTrl(Identifier="030c2dc3-ed12-22b8-567f-6274c00cc015")
public static String es_PE_FIELD_BusinessPartner_SalesVolumeIn100_Help="El Volúmen de ventas indica el volúmen total de ventas para un socio de negocio";

@XendraField(AD_Column_ID="SalesVolume",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="030c2dc3-ed12-22b8-567f-6274c00cc015")
public static final String FIELDNAME_BusinessPartner_SalesVolumeIn100="030c2dc3-ed12-22b8-567f-6274c00cc015";

@XendraTrl(Identifier="8a778f33-a90a-181b-3982-a4e85106a0e2")
public static String es_PE_FIELD_Vendor_SalesVolumeIn10002_Name="Volúmen de Ventas";

@XendraTrl(Identifier="8a778f33-a90a-181b-3982-a4e85106a0e2")
public static String es_PE_FIELD_Vendor_SalesVolumeIn10002_Description="Volúmen total de Ventas";

@XendraTrl(Identifier="8a778f33-a90a-181b-3982-a4e85106a0e2")
public static String es_PE_FIELD_Vendor_SalesVolumeIn10002_Help="El Volúmen de ventas indica el volúmen total de ventas para un socio de negocio";

@XendraField(AD_Column_ID="SalesVolume",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8a778f33-a90a-181b-3982-a4e85106a0e2")
public static final String FIELDNAME_Vendor_SalesVolumeIn10002="8a778f33-a90a-181b-3982-a4e85106a0e2";

@XendraTrl(Identifier="6510a64d-2fb2-332c-d6ab-5979320ebba1")
public static String es_PE_FIELD_Customer_SalesVolumeIn10002_Name="Volúmen de Ventas";

@XendraTrl(Identifier="6510a64d-2fb2-332c-d6ab-5979320ebba1")
public static String es_PE_FIELD_Customer_SalesVolumeIn10002_Description="Volúmen total de Ventas";

@XendraTrl(Identifier="6510a64d-2fb2-332c-d6ab-5979320ebba1")
public static String es_PE_FIELD_Customer_SalesVolumeIn10002_Help="El Volúmen de ventas indica el volúmen total de ventas para un socio de negocio";

@XendraField(AD_Column_ID="SalesVolume",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6510a64d-2fb2-332c-d6ab-5979320ebba1")
public static final String FIELDNAME_Customer_SalesVolumeIn10002="6510a64d-2fb2-332c-d6ab-5979320ebba1";

@XendraTrl(Identifier="c438d2ac-26b2-c315-0c2b-836b04144160")
public static String es_PE_FIELD_BusinessPartner_SalesVolumeIn10002_Name="Volúmen de Ventas";

@XendraTrl(Identifier="c438d2ac-26b2-c315-0c2b-836b04144160")
public static String es_PE_FIELD_BusinessPartner_SalesVolumeIn10002_Description="Volúmen total de Ventas";

@XendraTrl(Identifier="c438d2ac-26b2-c315-0c2b-836b04144160")
public static String es_PE_FIELD_BusinessPartner_SalesVolumeIn10002_Help="El Volúmen de ventas indica el volúmen total de ventas para un socio de negocio";

@XendraField(AD_Column_ID="SalesVolume",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsEmployee@=N",DisplayLength=11,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c438d2ac-26b2-c315-0c2b-836b04144160")
public static final String FIELDNAME_BusinessPartner_SalesVolumeIn10002="c438d2ac-26b2-c315-0c2b-836b04144160";

@XendraTrl(Identifier="e3c9c101-54b6-80a7-bdf8-8cec66273226")
public static String es_PE_COLUMN_SalesVolume_Name="Volúmen de Ventas";

@XendraColumn(AD_Element_ID="c7ec37b9-64cd-ba29-2f5f-a3852581c2dd",ColumnName="SalesVolume",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e3c9c101-54b6-80a7-bdf8-8cec66273226",
Synchronized="2019-08-30 22:21:11.0")
/** Column name SalesVolume */
public static final String COLUMNNAME_SalesVolume = "SalesVolume";
/** Set Send EMail.
@param SendEMail Enable sending Document EMail */
public void setSendEMail (boolean SendEMail)
{
set_Value (COLUMNNAME_SendEMail, Boolean.valueOf(SendEMail));
}
/** Get Send EMail.
@return Enable sending Document EMail */
public boolean isSendEMail() 
{
Object oo = get_Value(COLUMNNAME_SendEMail);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="e14ec7ea-ae24-ead9-c625-d18497810869")
public static String es_PE_FIELD_EmployeeVendor_SendEMail_Name="Envía Email";

@XendraTrl(Identifier="e14ec7ea-ae24-ead9-c625-d18497810869")
public static String es_PE_FIELD_EmployeeVendor_SendEMail_Description="Permite enviar el documento Email";

@XendraTrl(Identifier="e14ec7ea-ae24-ead9-c625-d18497810869")
public static String es_PE_FIELD_EmployeeVendor_SendEMail_Help="Envíe los email con el documento unido (ej. factura, nota de entrega, etc.)";

@XendraField(AD_Column_ID="SendEMail",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e14ec7ea-ae24-ead9-c625-d18497810869")
public static final String FIELDNAME_EmployeeVendor_SendEMail="e14ec7ea-ae24-ead9-c625-d18497810869";

@XendraTrl(Identifier="4b9d6b76-348c-c2eb-c7a7-56dfb8571292")
public static String es_PE_FIELD_PartnerSelection_SendEMail_Name="Envía Email";

@XendraTrl(Identifier="4b9d6b76-348c-c2eb-c7a7-56dfb8571292")
public static String es_PE_FIELD_PartnerSelection_SendEMail_Description="Permite enviar el documento Email";

@XendraTrl(Identifier="4b9d6b76-348c-c2eb-c7a7-56dfb8571292")
public static String es_PE_FIELD_PartnerSelection_SendEMail_Help="Envíe los email con el documento unido (ej. factura, nota de entrega, etc.)";

@XendraField(AD_Column_ID="SendEMail",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4b9d6b76-348c-c2eb-c7a7-56dfb8571292")
public static final String FIELDNAME_PartnerSelection_SendEMail="4b9d6b76-348c-c2eb-c7a7-56dfb8571292";

@XendraTrl(Identifier="ea924090-3eba-eea2-c462-06e2022223ed")
public static String es_PE_FIELD_Customer_SendEMail_Name="Envía Email";

@XendraTrl(Identifier="ea924090-3eba-eea2-c462-06e2022223ed")
public static String es_PE_FIELD_Customer_SendEMail_Description="Permite enviar el documento Email";

@XendraTrl(Identifier="ea924090-3eba-eea2-c462-06e2022223ed")
public static String es_PE_FIELD_Customer_SendEMail_Help="Envíe los email con el documento unido (ej. factura, nota de entrega, etc.)";

@XendraField(AD_Column_ID="SendEMail",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ea924090-3eba-eea2-c462-06e2022223ed")
public static final String FIELDNAME_Customer_SendEMail="ea924090-3eba-eea2-c462-06e2022223ed";

@XendraTrl(Identifier="92b7d3a8-4504-84a8-1cfb-f04e4791747a")
public static String es_PE_FIELD_AssignedPartners_SendEMail_Name="Envía Email";

@XendraTrl(Identifier="92b7d3a8-4504-84a8-1cfb-f04e4791747a")
public static String es_PE_FIELD_AssignedPartners_SendEMail_Description="Permite enviar el documento Email";

@XendraTrl(Identifier="92b7d3a8-4504-84a8-1cfb-f04e4791747a")
public static String es_PE_FIELD_AssignedPartners_SendEMail_Help="Envíe los email con el documento unido (ej. factura, nota de entrega, etc.)";

@XendraField(AD_Column_ID="SendEMail",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="92b7d3a8-4504-84a8-1cfb-f04e4791747a")
public static final String FIELDNAME_AssignedPartners_SendEMail="92b7d3a8-4504-84a8-1cfb-f04e4791747a";

@XendraTrl(Identifier="7c55c675-8043-7b75-8125-212fbb26e48b")
public static String es_PE_FIELD_Employee_SendEMail_Name="Envía Email";

@XendraTrl(Identifier="7c55c675-8043-7b75-8125-212fbb26e48b")
public static String es_PE_FIELD_Employee_SendEMail_Description="Permite enviar el documento Email";

@XendraTrl(Identifier="7c55c675-8043-7b75-8125-212fbb26e48b")
public static String es_PE_FIELD_Employee_SendEMail_Help="Envíe los email con el documento unido (ej. factura, nota de entrega, etc.)";

@XendraField(AD_Column_ID="SendEMail",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7c55c675-8043-7b75-8125-212fbb26e48b")
public static final String FIELDNAME_Employee_SendEMail="7c55c675-8043-7b75-8125-212fbb26e48b";

@XendraTrl(Identifier="61ef2c21-ae97-891c-d8be-cf4c7f1916a0")
public static String es_PE_FIELD_BusinessPartnerDimension_SendEMail_Name="Envía Email";

@XendraTrl(Identifier="61ef2c21-ae97-891c-d8be-cf4c7f1916a0")
public static String es_PE_FIELD_BusinessPartnerDimension_SendEMail_Description="Permite enviar el documento Email";

@XendraTrl(Identifier="61ef2c21-ae97-891c-d8be-cf4c7f1916a0")
public static String es_PE_FIELD_BusinessPartnerDimension_SendEMail_Help="Envíe los email con el documento unido (ej. factura, nota de entrega, etc.)";

@XendraField(AD_Column_ID="SendEMail",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="61ef2c21-ae97-891c-d8be-cf4c7f1916a0")
public static final String FIELDNAME_BusinessPartnerDimension_SendEMail="61ef2c21-ae97-891c-d8be-cf4c7f1916a0";

@XendraTrl(Identifier="2497be1d-b7ea-6d19-524e-287f8f4bf926")
public static String es_PE_FIELD_Vendor_SendEMail_Name="Envía Email";

@XendraTrl(Identifier="2497be1d-b7ea-6d19-524e-287f8f4bf926")
public static String es_PE_FIELD_Vendor_SendEMail_Description="Permite enviar el documento Email";

@XendraTrl(Identifier="2497be1d-b7ea-6d19-524e-287f8f4bf926")
public static String es_PE_FIELD_Vendor_SendEMail_Help="Envíe los email con el documento unido (ej. factura, nota de entrega, etc.)";

@XendraField(AD_Column_ID="SendEMail",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2497be1d-b7ea-6d19-524e-287f8f4bf926")
public static final String FIELDNAME_Vendor_SendEMail="2497be1d-b7ea-6d19-524e-287f8f4bf926";

@XendraTrl(Identifier="06595306-5467-e2ff-2684-e3ff274c0a5e")
public static String es_PE_FIELD_BusinessPartner_SendEMail_Name="Envía Email";

@XendraTrl(Identifier="06595306-5467-e2ff-2684-e3ff274c0a5e")
public static String es_PE_FIELD_BusinessPartner_SendEMail_Description="Permite enviar el documento Email";

@XendraTrl(Identifier="06595306-5467-e2ff-2684-e3ff274c0a5e")
public static String es_PE_FIELD_BusinessPartner_SendEMail_Help="Envíe los email con el documento unido (ej. factura, nota de entrega, etc.)";

@XendraField(AD_Column_ID="SendEMail",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="06595306-5467-e2ff-2684-e3ff274c0a5e")
public static final String FIELDNAME_BusinessPartner_SendEMail="06595306-5467-e2ff-2684-e3ff274c0a5e";

@XendraTrl(Identifier="059c1cbc-e224-3e1f-5f0c-12f4eed367f3")
public static String es_PE_FIELD_Customer_SendEMail2_Name="Envía Email";

@XendraTrl(Identifier="059c1cbc-e224-3e1f-5f0c-12f4eed367f3")
public static String es_PE_FIELD_Customer_SendEMail2_Description="Permite enviar el documento Email";

@XendraTrl(Identifier="059c1cbc-e224-3e1f-5f0c-12f4eed367f3")
public static String es_PE_FIELD_Customer_SendEMail2_Help="Envíe los email con el documento unido (ej. factura, nota de entrega, etc.)";

@XendraField(AD_Column_ID="SendEMail",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="059c1cbc-e224-3e1f-5f0c-12f4eed367f3")
public static final String FIELDNAME_Customer_SendEMail2="059c1cbc-e224-3e1f-5f0c-12f4eed367f3";

@XendraTrl(Identifier="eedd4b42-c4c0-b6ac-3d35-2fe4dc91482b")
public static String es_PE_FIELD_Vendor_SendEMail2_Name="Envía Email";

@XendraTrl(Identifier="eedd4b42-c4c0-b6ac-3d35-2fe4dc91482b")
public static String es_PE_FIELD_Vendor_SendEMail2_Description="Permite enviar el documento Email";

@XendraTrl(Identifier="eedd4b42-c4c0-b6ac-3d35-2fe4dc91482b")
public static String es_PE_FIELD_Vendor_SendEMail2_Help="Envíe los email con el documento unido (ej. factura, nota de entrega, etc.)";

@XendraField(AD_Column_ID="SendEMail",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="eedd4b42-c4c0-b6ac-3d35-2fe4dc91482b")
public static final String FIELDNAME_Vendor_SendEMail2="eedd4b42-c4c0-b6ac-3d35-2fe4dc91482b";

@XendraTrl(Identifier="3429665b-fc0f-ef50-d6b9-f2272aec8ec1")
public static String es_PE_FIELD_BusinessPartner_SendEMail2_Name="Envía Email";

@XendraTrl(Identifier="3429665b-fc0f-ef50-d6b9-f2272aec8ec1")
public static String es_PE_FIELD_BusinessPartner_SendEMail2_Description="Permite enviar el documento Email";

@XendraTrl(Identifier="3429665b-fc0f-ef50-d6b9-f2272aec8ec1")
public static String es_PE_FIELD_BusinessPartner_SendEMail2_Help="Envíe los email con el documento unido (ej. factura, nota de entrega, etc.)";

@XendraField(AD_Column_ID="SendEMail",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3429665b-fc0f-ef50-d6b9-f2272aec8ec1")
public static final String FIELDNAME_BusinessPartner_SendEMail2="3429665b-fc0f-ef50-d6b9-f2272aec8ec1";

@XendraTrl(Identifier="262125b7-dfa7-f966-75bb-2727ba224331")
public static String es_PE_COLUMN_SendEMail_Name="Envía Email";

@XendraColumn(AD_Element_ID="88409dac-427a-2fc2-2bde-34430996bd43",ColumnName="SendEMail",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="262125b7-dfa7-f966-75bb-2727ba224331",
Synchronized="2019-08-30 22:21:11.0")
/** Column name SendEMail */
public static final String COLUMNNAME_SendEMail = "SendEMail";
/** Set Share.
@param ShareOfCustomer Share of Customer's business as a percentage */
public void setShareOfCustomer (int ShareOfCustomer)
{
set_Value (COLUMNNAME_ShareOfCustomer, Integer.valueOf(ShareOfCustomer));
}
/** Get Share.
@return Share of Customer's business as a percentage */
public int getShareOfCustomer() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_ShareOfCustomer);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="52ebfa4a-2790-4f2f-982e-def93b3640ff")
public static String es_PE_FIELD_PartnerSelection_Share_Name="Participación";

@XendraTrl(Identifier="52ebfa4a-2790-4f2f-982e-def93b3640ff")
public static String es_PE_FIELD_PartnerSelection_Share_Description="Participación del cliente.";

@XendraTrl(Identifier="52ebfa4a-2790-4f2f-982e-def93b3640ff")
public static String es_PE_FIELD_PartnerSelection_Share_Help="La participación indica el porcentaje de este socio de negocio.";

@XendraField(AD_Column_ID="ShareOfCustomer",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="52ebfa4a-2790-4f2f-982e-def93b3640ff")
public static final String FIELDNAME_PartnerSelection_Share="52ebfa4a-2790-4f2f-982e-def93b3640ff";

@XendraTrl(Identifier="c3ac2c8e-72f2-533c-494d-8163a785541f")
public static String es_PE_FIELD_Vendor_Share_Name="Participación";

@XendraTrl(Identifier="c3ac2c8e-72f2-533c-494d-8163a785541f")
public static String es_PE_FIELD_Vendor_Share_Description="Participación del cliente.";

@XendraTrl(Identifier="c3ac2c8e-72f2-533c-494d-8163a785541f")
public static String es_PE_FIELD_Vendor_Share_Help="La participación indica el porcentaje de este socio de negocio.";

@XendraField(AD_Column_ID="ShareOfCustomer",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c3ac2c8e-72f2-533c-494d-8163a785541f")
public static final String FIELDNAME_Vendor_Share="c3ac2c8e-72f2-533c-494d-8163a785541f";

@XendraTrl(Identifier="4f79933e-8689-9c6c-31e5-fa7600219b3c")
public static String es_PE_FIELD_BusinessPartnerDimension_Share_Name="Participación";

@XendraTrl(Identifier="4f79933e-8689-9c6c-31e5-fa7600219b3c")
public static String es_PE_FIELD_BusinessPartnerDimension_Share_Description="Participación del cliente.";

@XendraTrl(Identifier="4f79933e-8689-9c6c-31e5-fa7600219b3c")
public static String es_PE_FIELD_BusinessPartnerDimension_Share_Help="La participación indica el porcentaje de este socio de negocio.";

@XendraField(AD_Column_ID="ShareOfCustomer",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4f79933e-8689-9c6c-31e5-fa7600219b3c")
public static final String FIELDNAME_BusinessPartnerDimension_Share="4f79933e-8689-9c6c-31e5-fa7600219b3c";

@XendraTrl(Identifier="a3c0995c-c099-5db2-f15d-c35e3dd82d44")
public static String es_PE_FIELD_Customer_Share_Name="Participación";

@XendraTrl(Identifier="a3c0995c-c099-5db2-f15d-c35e3dd82d44")
public static String es_PE_FIELD_Customer_Share_Description="Participación del cliente.";

@XendraTrl(Identifier="a3c0995c-c099-5db2-f15d-c35e3dd82d44")
public static String es_PE_FIELD_Customer_Share_Help="La participación indica el porcentaje de este socio de negocio.";

@XendraField(AD_Column_ID="ShareOfCustomer",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a3c0995c-c099-5db2-f15d-c35e3dd82d44")
public static final String FIELDNAME_Customer_Share="a3c0995c-c099-5db2-f15d-c35e3dd82d44";

@XendraTrl(Identifier="0e9bc1d9-73c4-80e4-ebd0-41f0f8b6ed01")
public static String es_PE_FIELD_Employee_Share_Name="Participación";

@XendraTrl(Identifier="0e9bc1d9-73c4-80e4-ebd0-41f0f8b6ed01")
public static String es_PE_FIELD_Employee_Share_Description="Participación del cliente.";

@XendraTrl(Identifier="0e9bc1d9-73c4-80e4-ebd0-41f0f8b6ed01")
public static String es_PE_FIELD_Employee_Share_Help="La participación indica el porcentaje de este socio de negocio.";

@XendraField(AD_Column_ID="ShareOfCustomer",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0e9bc1d9-73c4-80e4-ebd0-41f0f8b6ed01")
public static final String FIELDNAME_Employee_Share="0e9bc1d9-73c4-80e4-ebd0-41f0f8b6ed01";

@XendraTrl(Identifier="3f38d697-1c3b-2585-b9ef-89cfb3df79ab")
public static String es_PE_FIELD_AssignedPartners_Share_Name="Participación";

@XendraTrl(Identifier="3f38d697-1c3b-2585-b9ef-89cfb3df79ab")
public static String es_PE_FIELD_AssignedPartners_Share_Description="Participación del cliente.";

@XendraTrl(Identifier="3f38d697-1c3b-2585-b9ef-89cfb3df79ab")
public static String es_PE_FIELD_AssignedPartners_Share_Help="La participación indica el porcentaje de este socio de negocio.";

@XendraField(AD_Column_ID="ShareOfCustomer",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=260,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3f38d697-1c3b-2585-b9ef-89cfb3df79ab")
public static final String FIELDNAME_AssignedPartners_Share="3f38d697-1c3b-2585-b9ef-89cfb3df79ab";

@XendraTrl(Identifier="b4992ac3-bc8b-3914-da91-e0a9a70e7d9a")
public static String es_PE_FIELD_Customer_Share2_Name="Participación";

@XendraTrl(Identifier="b4992ac3-bc8b-3914-da91-e0a9a70e7d9a")
public static String es_PE_FIELD_Customer_Share2_Description="Participación del cliente.";

@XendraTrl(Identifier="b4992ac3-bc8b-3914-da91-e0a9a70e7d9a")
public static String es_PE_FIELD_Customer_Share2_Help="La participación indica el porcentaje de este socio de negocio.";

@XendraField(AD_Column_ID="ShareOfCustomer",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b4992ac3-bc8b-3914-da91-e0a9a70e7d9a")
public static final String FIELDNAME_Customer_Share2="b4992ac3-bc8b-3914-da91-e0a9a70e7d9a";

@XendraTrl(Identifier="8fbed0ec-b7a2-a943-092b-e46bb745f2c3")
public static String es_PE_FIELD_EmployeeVendor_Share_Name="Participación";

@XendraTrl(Identifier="8fbed0ec-b7a2-a943-092b-e46bb745f2c3")
public static String es_PE_FIELD_EmployeeVendor_Share_Description="Participación del cliente.";

@XendraTrl(Identifier="8fbed0ec-b7a2-a943-092b-e46bb745f2c3")
public static String es_PE_FIELD_EmployeeVendor_Share_Help="La participación indica el porcentaje de este socio de negocio.";

@XendraField(AD_Column_ID="ShareOfCustomer",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8fbed0ec-b7a2-a943-092b-e46bb745f2c3")
public static final String FIELDNAME_EmployeeVendor_Share="8fbed0ec-b7a2-a943-092b-e46bb745f2c3";

@XendraTrl(Identifier="8eca8ba7-e393-3822-be45-d2b662395734")
public static String es_PE_FIELD_BusinessPartner_Share_Name="Participación";

@XendraTrl(Identifier="8eca8ba7-e393-3822-be45-d2b662395734")
public static String es_PE_FIELD_BusinessPartner_Share_Description="Participación del cliente.";

@XendraTrl(Identifier="8eca8ba7-e393-3822-be45-d2b662395734")
public static String es_PE_FIELD_BusinessPartner_Share_Help="La participación indica el porcentaje de este socio de negocio.";

@XendraField(AD_Column_ID="ShareOfCustomer",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8eca8ba7-e393-3822-be45-d2b662395734")
public static final String FIELDNAME_BusinessPartner_Share="8eca8ba7-e393-3822-be45-d2b662395734";

@XendraTrl(Identifier="2ce8c4bd-1105-ebda-3642-bdd9149f1022")
public static String es_PE_FIELD_Vendor_Share2_Name="Participación";

@XendraTrl(Identifier="2ce8c4bd-1105-ebda-3642-bdd9149f1022")
public static String es_PE_FIELD_Vendor_Share2_Description="Participación del cliente.";

@XendraTrl(Identifier="2ce8c4bd-1105-ebda-3642-bdd9149f1022")
public static String es_PE_FIELD_Vendor_Share2_Help="La participación indica el porcentaje de este socio de negocio.";

@XendraField(AD_Column_ID="ShareOfCustomer",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2ce8c4bd-1105-ebda-3642-bdd9149f1022")
public static final String FIELDNAME_Vendor_Share2="2ce8c4bd-1105-ebda-3642-bdd9149f1022";

@XendraTrl(Identifier="c2365bcb-05d2-bba3-3767-7b91a05e66bb")
public static String es_PE_FIELD_BusinessPartner_Share2_Name="Participación";

@XendraTrl(Identifier="c2365bcb-05d2-bba3-3767-7b91a05e66bb")
public static String es_PE_FIELD_BusinessPartner_Share2_Description="Participación del cliente.";

@XendraTrl(Identifier="c2365bcb-05d2-bba3-3767-7b91a05e66bb")
public static String es_PE_FIELD_BusinessPartner_Share2_Help="La participación indica el porcentaje de este socio de negocio.";

@XendraField(AD_Column_ID="ShareOfCustomer",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsEmployee@=N",DisplayLength=11,IsReadOnly=false,SeqNo=220,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="c2365bcb-05d2-bba3-3767-7b91a05e66bb")
public static final String FIELDNAME_BusinessPartner_Share2="c2365bcb-05d2-bba3-3767-7b91a05e66bb";

@XendraTrl(Identifier="a5d8cb76-9664-deb6-a7f2-8de2bb9acee2")
public static String es_PE_COLUMN_ShareOfCustomer_Name="Participación";

@XendraColumn(AD_Element_ID="208f8b49-1a6f-35b2-8ac4-b43ec74c0dd0",ColumnName="ShareOfCustomer",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a5d8cb76-9664-deb6-a7f2-8de2bb9acee2",
Synchronized="2019-08-30 22:21:11.0")
/** Column name ShareOfCustomer */
public static final String COLUMNNAME_ShareOfCustomer = "ShareOfCustomer";
/** Set Min Shelf Life %.
@param ShelfLifeMinPct Minimum Shelf Life in percent based on Product Instance Guarantee Date */
public void setShelfLifeMinPct (int ShelfLifeMinPct)
{
set_Value (COLUMNNAME_ShelfLifeMinPct, Integer.valueOf(ShelfLifeMinPct));
}
/** Get Min Shelf Life %.
@return Minimum Shelf Life in percent based on Product Instance Guarantee Date */
public int getShelfLifeMinPct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_ShelfLifeMinPct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="eec4db54-a2c4-04ca-20cf-bdb0bbcf235d")
public static String es_PE_FIELD_Employee_MinShelfLife_Name="Mín de Vida útil %";

@XendraTrl(Identifier="eec4db54-a2c4-04ca-20cf-bdb0bbcf235d")
public static String es_PE_FIELD_Employee_MinShelfLife_Description="Mínimo de vida útil en porcentaje basados en la fecha lo que garantiza el producto.";

@XendraTrl(Identifier="eec4db54-a2c4-04ca-20cf-bdb0bbcf235d")
public static String es_PE_FIELD_Employee_MinShelfLife_Help="Minimo de vida útil en productos con fecha de garantía. Si > 0 Usted no puede seleccionar productos con una vida útil. (fecha - dia de la garantía) / menos que la vida útil del minimo, a menos que usted seleccione \"toda demostración\"";

@XendraField(AD_Column_ID="ShelfLifeMinPct",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="eec4db54-a2c4-04ca-20cf-bdb0bbcf235d")
public static final String FIELDNAME_Employee_MinShelfLife="eec4db54-a2c4-04ca-20cf-bdb0bbcf235d";

@XendraTrl(Identifier="2e6405a6-1db6-dba3-a675-5351bdca4187")
public static String es_PE_FIELD_Customer_MinShelfLife_Name="Mín de Vida útil %";

@XendraTrl(Identifier="2e6405a6-1db6-dba3-a675-5351bdca4187")
public static String es_PE_FIELD_Customer_MinShelfLife_Description="Mínimo de vida útil en porcentaje basados en la fecha lo que garantiza el producto.";

@XendraTrl(Identifier="2e6405a6-1db6-dba3-a675-5351bdca4187")
public static String es_PE_FIELD_Customer_MinShelfLife_Help="Minimo de vida útil en productos con fecha de garantía. Si > 0 Usted no puede seleccionar productos con una vida útil. (fecha - dia de la garantía) / menos que la vida útil del minimo, a menos que usted seleccione \"toda demostración\"";

@XendraField(AD_Column_ID="ShelfLifeMinPct",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2e6405a6-1db6-dba3-a675-5351bdca4187")
public static final String FIELDNAME_Customer_MinShelfLife="2e6405a6-1db6-dba3-a675-5351bdca4187";

@XendraTrl(Identifier="cf246aa7-59eb-6860-2068-8855647e137b")
public static String es_PE_FIELD_PartnerSelection_MinShelfLife_Name="Mín de Vida útil %";

@XendraTrl(Identifier="cf246aa7-59eb-6860-2068-8855647e137b")
public static String es_PE_FIELD_PartnerSelection_MinShelfLife_Description="Mínimo de vida útil en porcentaje basados en la fecha lo que garantiza el producto.";

@XendraTrl(Identifier="cf246aa7-59eb-6860-2068-8855647e137b")
public static String es_PE_FIELD_PartnerSelection_MinShelfLife_Help="Minimo de vida útil en productos con fecha de garantía. Si > 0 Usted no puede seleccionar productos con una vida útil. (fecha - dia de la garantía) / menos que la vida útil del minimo, a menos que usted seleccione \"toda demostración\"";

@XendraField(AD_Column_ID="ShelfLifeMinPct",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cf246aa7-59eb-6860-2068-8855647e137b")
public static final String FIELDNAME_PartnerSelection_MinShelfLife="cf246aa7-59eb-6860-2068-8855647e137b";

@XendraTrl(Identifier="9f48b65b-28cb-cfd6-8be3-20de9152c54b")
public static String es_PE_FIELD_BusinessPartnerDimension_MinShelfLife_Name="Mín de Vida útil %";

@XendraTrl(Identifier="9f48b65b-28cb-cfd6-8be3-20de9152c54b")
public static String es_PE_FIELD_BusinessPartnerDimension_MinShelfLife_Description="Mínimo de vida útil en porcentaje basados en la fecha lo que garantiza el producto.";

@XendraTrl(Identifier="9f48b65b-28cb-cfd6-8be3-20de9152c54b")
public static String es_PE_FIELD_BusinessPartnerDimension_MinShelfLife_Help="Minimo de vida útil en productos con fecha de garantía. Si > 0 Usted no puede seleccionar productos con una vida útil. (fecha - dia de la garantía) / menos que la vida útil del minimo, a menos que usted seleccione \"toda demostración\"";

@XendraField(AD_Column_ID="ShelfLifeMinPct",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9f48b65b-28cb-cfd6-8be3-20de9152c54b")
public static final String FIELDNAME_BusinessPartnerDimension_MinShelfLife="9f48b65b-28cb-cfd6-8be3-20de9152c54b";

@XendraTrl(Identifier="b3806623-7048-9fea-67d1-8fc27698dbf1")
public static String es_PE_FIELD_Vendor_MinShelfLife_Name="Mín de Vida útil %";

@XendraTrl(Identifier="b3806623-7048-9fea-67d1-8fc27698dbf1")
public static String es_PE_FIELD_Vendor_MinShelfLife_Description="Mínimo de vida útil en porcentaje basados en la fecha lo que garantiza el producto.";

@XendraTrl(Identifier="b3806623-7048-9fea-67d1-8fc27698dbf1")
public static String es_PE_FIELD_Vendor_MinShelfLife_Help="Minimo de vida útil en productos con fecha de garantía. Si > 0 Usted no puede seleccionar productos con una vida útil. (fecha - dia de la garantía) / menos que la vida útil del minimo, a menos que usted seleccione \"toda demostración\"";

@XendraField(AD_Column_ID="ShelfLifeMinPct",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b3806623-7048-9fea-67d1-8fc27698dbf1")
public static final String FIELDNAME_Vendor_MinShelfLife="b3806623-7048-9fea-67d1-8fc27698dbf1";

@XendraTrl(Identifier="25be141d-3c78-7b35-88df-91deec6edb2e")
public static String es_PE_FIELD_BusinessPartner_MinShelfLife_Name="Mín de Vida útil %";

@XendraTrl(Identifier="25be141d-3c78-7b35-88df-91deec6edb2e")
public static String es_PE_FIELD_BusinessPartner_MinShelfLife_Description="Mínimo de vida útil en porcentaje basados en la fecha lo que garantiza el producto.";

@XendraTrl(Identifier="25be141d-3c78-7b35-88df-91deec6edb2e")
public static String es_PE_FIELD_BusinessPartner_MinShelfLife_Help="Minimo de vida útil en productos con fecha de garantía. Si > 0 Usted no puede seleccionar productos con una vida útil. (fecha - dia de la garantía) / menos que la vida útil del minimo, a menos que usted seleccione \"toda demostración\"";

@XendraField(AD_Column_ID="ShelfLifeMinPct",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="25be141d-3c78-7b35-88df-91deec6edb2e")
public static final String FIELDNAME_BusinessPartner_MinShelfLife="25be141d-3c78-7b35-88df-91deec6edb2e";

@XendraTrl(Identifier="c0a6ba1e-b313-89be-81e7-cf03909a6c12")
public static String es_PE_FIELD_EmployeeVendor_MinShelfLife_Name="Mín de Vida útil %";

@XendraTrl(Identifier="c0a6ba1e-b313-89be-81e7-cf03909a6c12")
public static String es_PE_FIELD_EmployeeVendor_MinShelfLife_Description="Mínimo de vida útil en porcentaje basados en la fecha lo que garantiza el producto.";

@XendraTrl(Identifier="c0a6ba1e-b313-89be-81e7-cf03909a6c12")
public static String es_PE_FIELD_EmployeeVendor_MinShelfLife_Help="Minimo de vida útil en productos con fecha de garantía. Si > 0 Usted no puede seleccionar productos con una vida útil. (fecha - dia de la garantía) / menos que la vida útil del minimo, a menos que usted seleccione \"toda demostración\"";

@XendraField(AD_Column_ID="ShelfLifeMinPct",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c0a6ba1e-b313-89be-81e7-cf03909a6c12")
public static final String FIELDNAME_EmployeeVendor_MinShelfLife="c0a6ba1e-b313-89be-81e7-cf03909a6c12";

@XendraTrl(Identifier="c3975efe-482b-3596-bf1c-835a008e9d2c")
public static String es_PE_FIELD_AssignedPartners_MinShelfLife_Name="Mín de Vida útil %";

@XendraTrl(Identifier="c3975efe-482b-3596-bf1c-835a008e9d2c")
public static String es_PE_FIELD_AssignedPartners_MinShelfLife_Description="Mínimo de vida útil en porcentaje basados en la fecha lo que garantiza el producto.";

@XendraTrl(Identifier="c3975efe-482b-3596-bf1c-835a008e9d2c")
public static String es_PE_FIELD_AssignedPartners_MinShelfLife_Help="Minimo de vida útil en productos con fecha de garantía. Si > 0 Usted no puede seleccionar productos con una vida útil. (fecha - dia de la garantía) / menos que la vida útil del minimo, a menos que usted seleccione \"toda demostración\"";

@XendraField(AD_Column_ID="ShelfLifeMinPct",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c3975efe-482b-3596-bf1c-835a008e9d2c")
public static final String FIELDNAME_AssignedPartners_MinShelfLife="c3975efe-482b-3596-bf1c-835a008e9d2c";

@XendraTrl(Identifier="8ec22f43-906d-4012-2cd8-45bca5c017bd")
public static String es_PE_FIELD_Customer_MinShelfLife2_Name="Mín de Vida útil %";

@XendraTrl(Identifier="8ec22f43-906d-4012-2cd8-45bca5c017bd")
public static String es_PE_FIELD_Customer_MinShelfLife2_Description="Mínimo de vida útil en porcentaje basados en la fecha lo que garantiza el producto.";

@XendraTrl(Identifier="8ec22f43-906d-4012-2cd8-45bca5c017bd")
public static String es_PE_FIELD_Customer_MinShelfLife2_Help="Minimo de vida útil en productos con fecha de garantía. Si > 0 Usted no puede seleccionar productos con una vida útil. (fecha - dia de la garantía) / menos que la vida útil del minimo, a menos que usted seleccione \"toda demostración\"";

@XendraField(AD_Column_ID="ShelfLifeMinPct",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsCustomer@='Y'",DisplayLength=11,IsReadOnly=false,SeqNo=200,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="8ec22f43-906d-4012-2cd8-45bca5c017bd")
public static final String FIELDNAME_Customer_MinShelfLife2="8ec22f43-906d-4012-2cd8-45bca5c017bd";

@XendraTrl(Identifier="d2442fcb-5165-b0ec-ba9c-269d73e3f487")
public static String es_PE_FIELD_Vendor_MinShelfLife2_Name="Mín de Vida útil %";

@XendraTrl(Identifier="d2442fcb-5165-b0ec-ba9c-269d73e3f487")
public static String es_PE_FIELD_Vendor_MinShelfLife2_Description="Mínimo de vida útil en porcentaje basados en la fecha lo que garantiza el producto.";

@XendraTrl(Identifier="d2442fcb-5165-b0ec-ba9c-269d73e3f487")
public static String es_PE_FIELD_Vendor_MinShelfLife2_Help="Minimo de vida útil en productos con fecha de garantía. Si > 0 Usted no puede seleccionar productos con una vida útil. (fecha - dia de la garantía) / menos que la vida útil del minimo, a menos que usted seleccione \"toda demostración\"";

@XendraField(AD_Column_ID="ShelfLifeMinPct",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d2442fcb-5165-b0ec-ba9c-269d73e3f487")
public static final String FIELDNAME_Vendor_MinShelfLife2="d2442fcb-5165-b0ec-ba9c-269d73e3f487";

@XendraTrl(Identifier="67e5afce-d1f3-e1b2-980c-9b2bf72517ad")
public static String es_PE_FIELD_BusinessPartner_MinShelfLife2_Name="Mín de Vida útil %";

@XendraTrl(Identifier="67e5afce-d1f3-e1b2-980c-9b2bf72517ad")
public static String es_PE_FIELD_BusinessPartner_MinShelfLife2_Description="Mínimo de vida útil en porcentaje basados en la fecha lo que garantiza el producto.";

@XendraTrl(Identifier="67e5afce-d1f3-e1b2-980c-9b2bf72517ad")
public static String es_PE_FIELD_BusinessPartner_MinShelfLife2_Help="Minimo de vida útil en productos con fecha de garantía. Si > 0 Usted no puede seleccionar productos con una vida útil. (fecha - dia de la garantía) / menos que la vida útil del minimo, a menos que usted seleccione \"toda demostración\"";

@XendraField(AD_Column_ID="ShelfLifeMinPct",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="67e5afce-d1f3-e1b2-980c-9b2bf72517ad")
public static final String FIELDNAME_BusinessPartner_MinShelfLife2="67e5afce-d1f3-e1b2-980c-9b2bf72517ad";

@XendraTrl(Identifier="66730f97-963a-7c86-43da-6004979f6b79")
public static String es_PE_COLUMN_ShelfLifeMinPct_Name="Mín de Vida útil %";

@XendraColumn(AD_Element_ID="47d4dbcc-2d80-bdd4-16ca-21dca83a14da",ColumnName="ShelfLifeMinPct",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="66730f97-963a-7c86-43da-6004979f6b79",
Synchronized="2019-08-30 22:21:11.0")
/** Column name ShelfLifeMinPct */
public static final String COLUMNNAME_ShelfLifeMinPct = "ShelfLifeMinPct";
/** Set Credit Limit.
@param SO_CreditLimit Total outstanding invoice amounts allowed */
public void setSO_CreditLimit (BigDecimal SO_CreditLimit)
{
if (SO_CreditLimit == null) throw new IllegalArgumentException ("SO_CreditLimit is mandatory.");
set_Value (COLUMNNAME_SO_CreditLimit, SO_CreditLimit);
}
/** Get Credit Limit.
@return Total outstanding invoice amounts allowed */
public BigDecimal getSO_CreditLimit() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_SO_CreditLimit);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="c2c4f643-98e0-073a-2eaa-0db91b4dd466")
public static String es_PE_FIELD_Customer_CreditLimit_Name="Límite de Crédito";

@XendraTrl(Identifier="c2c4f643-98e0-073a-2eaa-0db91b4dd466")
public static String es_PE_FIELD_Customer_CreditLimit_Description="Total pendiente del total de la factura pendiente.";

@XendraTrl(Identifier="c2c4f643-98e0-073a-2eaa-0db91b4dd466")
public static String es_PE_FIELD_Customer_CreditLimit_Help="El límite de crédito indica el total de deuda permitida.";

@XendraField(AD_Column_ID="SO_CreditLimit",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsCustomer@='Y'",DisplayLength=26,IsReadOnly=false,SeqNo=210,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="c2c4f643-98e0-073a-2eaa-0db91b4dd466")
public static final String FIELDNAME_Customer_CreditLimit="c2c4f643-98e0-073a-2eaa-0db91b4dd466";

@XendraTrl(Identifier="3ea5d6e0-8dc8-c955-9398-57ae1cfc79b1")
public static String es_PE_FIELD_BusinessPartnerDimension_CreditLimit_Name="Límite de Crédito";

@XendraTrl(Identifier="3ea5d6e0-8dc8-c955-9398-57ae1cfc79b1")
public static String es_PE_FIELD_BusinessPartnerDimension_CreditLimit_Description="Total pendiente del total de la factura pendiente.";

@XendraTrl(Identifier="3ea5d6e0-8dc8-c955-9398-57ae1cfc79b1")
public static String es_PE_FIELD_BusinessPartnerDimension_CreditLimit_Help="El límite de crédito indica el total de deuda permitida.";

@XendraField(AD_Column_ID="SO_CreditLimit",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3ea5d6e0-8dc8-c955-9398-57ae1cfc79b1")
public static final String FIELDNAME_BusinessPartnerDimension_CreditLimit="3ea5d6e0-8dc8-c955-9398-57ae1cfc79b1";

@XendraTrl(Identifier="3f26de8b-e208-05b6-8299-a7222fbda171")
public static String es_PE_FIELD_Employee_CreditLimit_Name="Límite de Crédito";

@XendraTrl(Identifier="3f26de8b-e208-05b6-8299-a7222fbda171")
public static String es_PE_FIELD_Employee_CreditLimit_Description="Total pendiente del total de la factura pendiente.";

@XendraTrl(Identifier="3f26de8b-e208-05b6-8299-a7222fbda171")
public static String es_PE_FIELD_Employee_CreditLimit_Help="El límite de crédito indica el total de deuda permitida.";

@XendraField(AD_Column_ID="SO_CreditLimit",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3f26de8b-e208-05b6-8299-a7222fbda171")
public static final String FIELDNAME_Employee_CreditLimit="3f26de8b-e208-05b6-8299-a7222fbda171";

@XendraTrl(Identifier="3507c96a-6969-dbfe-9eb2-12264ae06eb0")
public static String es_PE_FIELD_Vendor_CreditLimit_Name="Límite de Crédito";

@XendraTrl(Identifier="3507c96a-6969-dbfe-9eb2-12264ae06eb0")
public static String es_PE_FIELD_Vendor_CreditLimit_Description="Total pendiente del total de la factura pendiente.";

@XendraTrl(Identifier="3507c96a-6969-dbfe-9eb2-12264ae06eb0")
public static String es_PE_FIELD_Vendor_CreditLimit_Help="El límite de crédito indica el total de deuda permitida.";

@XendraField(AD_Column_ID="SO_CreditLimit",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3507c96a-6969-dbfe-9eb2-12264ae06eb0")
public static final String FIELDNAME_Vendor_CreditLimit="3507c96a-6969-dbfe-9eb2-12264ae06eb0";

@XendraTrl(Identifier="9e441a34-0a18-c76d-b1b4-4c8fcf5cf065")
public static String es_PE_FIELD_EmployeeVendor_CreditLimit_Name="Límite de Crédito";

@XendraTrl(Identifier="9e441a34-0a18-c76d-b1b4-4c8fcf5cf065")
public static String es_PE_FIELD_EmployeeVendor_CreditLimit_Description="Total pendiente del total de la factura pendiente.";

@XendraTrl(Identifier="9e441a34-0a18-c76d-b1b4-4c8fcf5cf065")
public static String es_PE_FIELD_EmployeeVendor_CreditLimit_Help="El límite de crédito indica el total de deuda permitida.";

@XendraField(AD_Column_ID="SO_CreditLimit",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9e441a34-0a18-c76d-b1b4-4c8fcf5cf065")
public static final String FIELDNAME_EmployeeVendor_CreditLimit="9e441a34-0a18-c76d-b1b4-4c8fcf5cf065";

@XendraTrl(Identifier="be4b4ac0-7014-e8b3-7cf4-a7b4229f71d5")
public static String es_PE_FIELD_Customer_CreditLimit2_Name="Límite de Crédito";

@XendraTrl(Identifier="be4b4ac0-7014-e8b3-7cf4-a7b4229f71d5")
public static String es_PE_FIELD_Customer_CreditLimit2_Description="Total pendiente del total de la factura pendiente.";

@XendraTrl(Identifier="be4b4ac0-7014-e8b3-7cf4-a7b4229f71d5")
public static String es_PE_FIELD_Customer_CreditLimit2_Help="El límite de crédito indica el total de deuda permitida.";

@XendraField(AD_Column_ID="SO_CreditLimit",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="be4b4ac0-7014-e8b3-7cf4-a7b4229f71d5")
public static final String FIELDNAME_Customer_CreditLimit2="be4b4ac0-7014-e8b3-7cf4-a7b4229f71d5";

@XendraTrl(Identifier="a63e9869-09a1-074e-0ea6-0d2f927dca03")
public static String es_PE_FIELD_PartnerSelection_CreditLimit_Name="Límite de Crédito";

@XendraTrl(Identifier="a63e9869-09a1-074e-0ea6-0d2f927dca03")
public static String es_PE_FIELD_PartnerSelection_CreditLimit_Description="Total pendiente del total de la factura pendiente.";

@XendraTrl(Identifier="a63e9869-09a1-074e-0ea6-0d2f927dca03")
public static String es_PE_FIELD_PartnerSelection_CreditLimit_Help="El límite de crédito indica el total de deuda permitida.";

@XendraField(AD_Column_ID="SO_CreditLimit",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a63e9869-09a1-074e-0ea6-0d2f927dca03")
public static final String FIELDNAME_PartnerSelection_CreditLimit="a63e9869-09a1-074e-0ea6-0d2f927dca03";

@XendraTrl(Identifier="7398cef0-e986-8f24-9848-f6367c47d919")
public static String es_PE_FIELD_BusinessPartner_CreditLimit_Name="Límite de Crédito";

@XendraTrl(Identifier="7398cef0-e986-8f24-9848-f6367c47d919")
public static String es_PE_FIELD_BusinessPartner_CreditLimit_Description="Total pendiente del total de la factura pendiente.";

@XendraTrl(Identifier="7398cef0-e986-8f24-9848-f6367c47d919")
public static String es_PE_FIELD_BusinessPartner_CreditLimit_Help="El límite de crédito indica el total de deuda permitida.";

@XendraField(AD_Column_ID="SO_CreditLimit",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7398cef0-e986-8f24-9848-f6367c47d919")
public static final String FIELDNAME_BusinessPartner_CreditLimit="7398cef0-e986-8f24-9848-f6367c47d919";

@XendraTrl(Identifier="e95ea940-d643-5c0e-a682-d3cfe6b2665a")
public static String es_PE_FIELD_AssignedPartners_CreditLimit_Name="Límite de Crédito";

@XendraTrl(Identifier="e95ea940-d643-5c0e-a682-d3cfe6b2665a")
public static String es_PE_FIELD_AssignedPartners_CreditLimit_Description="Total pendiente del total de la factura pendiente.";

@XendraTrl(Identifier="e95ea940-d643-5c0e-a682-d3cfe6b2665a")
public static String es_PE_FIELD_AssignedPartners_CreditLimit_Help="El límite de crédito indica el total de deuda permitida.";

@XendraField(AD_Column_ID="SO_CreditLimit",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e95ea940-d643-5c0e-a682-d3cfe6b2665a")
public static final String FIELDNAME_AssignedPartners_CreditLimit="e95ea940-d643-5c0e-a682-d3cfe6b2665a";

@XendraTrl(Identifier="fed2467c-1cde-76f5-0953-8e309191c43f")
public static String es_PE_FIELD_Vendor_CreditLimit2_Name="Límite de Crédito";

@XendraTrl(Identifier="fed2467c-1cde-76f5-0953-8e309191c43f")
public static String es_PE_FIELD_Vendor_CreditLimit2_Description="Total pendiente del total de la factura pendiente.";

@XendraTrl(Identifier="fed2467c-1cde-76f5-0953-8e309191c43f")
public static String es_PE_FIELD_Vendor_CreditLimit2_Help="El límite de crédito indica el total de deuda permitida.";

@XendraField(AD_Column_ID="SO_CreditLimit",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fed2467c-1cde-76f5-0953-8e309191c43f")
public static final String FIELDNAME_Vendor_CreditLimit2="fed2467c-1cde-76f5-0953-8e309191c43f";

@XendraTrl(Identifier="a083786e-4bc1-b173-28e7-2afa3479ff5d")
public static String es_PE_FIELD_BusinessPartner_CreditLimit2_Name="Límite de Crédito";

@XendraTrl(Identifier="a083786e-4bc1-b173-28e7-2afa3479ff5d")
public static String es_PE_FIELD_BusinessPartner_CreditLimit2_Description="Total pendiente del total de la factura pendiente.";

@XendraTrl(Identifier="a083786e-4bc1-b173-28e7-2afa3479ff5d")
public static String es_PE_FIELD_BusinessPartner_CreditLimit2_Help="El límite de crédito indica el total de deuda permitida.";

@XendraField(AD_Column_ID="SO_CreditLimit",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a083786e-4bc1-b173-28e7-2afa3479ff5d")
public static final String FIELDNAME_BusinessPartner_CreditLimit2="a083786e-4bc1-b173-28e7-2afa3479ff5d";

@XendraTrl(Identifier="4de5e0e3-ddb9-5f6c-88bd-89cc0329b517")
public static String es_PE_COLUMN_SO_CreditLimit_Name="Límite de Crédito";

@XendraColumn(AD_Element_ID="a208e785-69be-24f1-a54c-9bdc71e5cb35",ColumnName="SO_CreditLimit",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4de5e0e3-ddb9-5f6c-88bd-89cc0329b517",
Synchronized="2019-08-30 22:21:11.0")
/** Column name SO_CreditLimit */
public static final String COLUMNNAME_SO_CreditLimit = "SO_CreditLimit";
/** Set SO_CreditOverLimit.
@param SO_CreditOverLimit SO_CreditOverLimit */
public void setSO_CreditOverLimit (BigDecimal SO_CreditOverLimit)
{
set_Value (COLUMNNAME_SO_CreditOverLimit, SO_CreditOverLimit);
}
/** Get SO_CreditOverLimit.
@return SO_CreditOverLimit */
public BigDecimal getSO_CreditOverLimit() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_SO_CreditOverLimit);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="1e151e63-4799-112c-f7f8-e66e8bf4518c")
public static String es_PE_FIELD_BusinessPartner_SO_CreditOverLimit_Name="so_creditoverlimit";

@XendraField(AD_Column_ID="SO_CreditOverLimit",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2015-11-23 15:25:55.0",
Identifier="1e151e63-4799-112c-f7f8-e66e8bf4518c")
public static final String FIELDNAME_BusinessPartner_SO_CreditOverLimit="1e151e63-4799-112c-f7f8-e66e8bf4518c";

@XendraTrl(Identifier="086ed7b5-a108-3050-e52c-f8fdfcf80ff3")
public static String es_PE_COLUMN_SO_CreditOverLimit_Name="so_creditoverlimit";

@XendraColumn(AD_Element_ID="b19e4123-5e1c-dd30-ed81-efef3ee35a4c",ColumnName="SO_CreditOverLimit",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="086ed7b5-a108-3050-e52c-f8fdfcf80ff3",
Synchronized="2019-08-30 22:21:11.0")
/** Column name SO_CreditOverLimit */
public static final String COLUMNNAME_SO_CreditOverLimit = "SO_CreditOverLimit";
/** Set Credit Status.
@param SOCreditStatus Business Partner Credit Status */
public void setSOCreditStatus (String SOCreditStatus)
{
if (SOCreditStatus != null && SOCreditStatus.length() > 1)
{
log.warning("Length > 1 - truncated");
SOCreditStatus = SOCreditStatus.substring(0,0);
}
set_Value (COLUMNNAME_SOCreditStatus, SOCreditStatus);
}
/** Get Credit Status.
@return Business Partner Credit Status */
public String getSOCreditStatus() 
{
return (String)get_Value(COLUMNNAME_SOCreditStatus);
}

@XendraTrl(Identifier="f0c889e6-4a80-a114-16ce-dfa1b860fbca")
public static String es_PE_FIELD_Vendor_CreditStatus_Name="Estado del Crédito";

@XendraTrl(Identifier="f0c889e6-4a80-a114-16ce-dfa1b860fbca")
public static String es_PE_FIELD_Vendor_CreditStatus_Description="Estado del crédito de ventas";

@XendraTrl(Identifier="f0c889e6-4a80-a114-16ce-dfa1b860fbca")
public static String es_PE_FIELD_Vendor_CreditStatus_Help="Solamente para la documentación.";

@XendraField(AD_Column_ID="SOCreditStatus",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f0c889e6-4a80-a114-16ce-dfa1b860fbca")
public static final String FIELDNAME_Vendor_CreditStatus="f0c889e6-4a80-a114-16ce-dfa1b860fbca";

@XendraTrl(Identifier="2918edde-8657-5fca-581a-873ef287344c")
public static String es_PE_FIELD_Customer_CreditStatus_Name="Estado del Crédito";

@XendraTrl(Identifier="2918edde-8657-5fca-581a-873ef287344c")
public static String es_PE_FIELD_Customer_CreditStatus_Description="Estado del crédito de ventas";

@XendraTrl(Identifier="2918edde-8657-5fca-581a-873ef287344c")
public static String es_PE_FIELD_Customer_CreditStatus_Help="Solamente para la documentación.";

@XendraField(AD_Column_ID="SOCreditStatus",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2918edde-8657-5fca-581a-873ef287344c")
public static final String FIELDNAME_Customer_CreditStatus="2918edde-8657-5fca-581a-873ef287344c";

@XendraTrl(Identifier="744ffd5a-baf7-eb95-73e8-6f64e3693cdd")
public static String es_PE_FIELD_BusinessPartner_CreditStatus_Name="Estado del Crédito";

@XendraTrl(Identifier="744ffd5a-baf7-eb95-73e8-6f64e3693cdd")
public static String es_PE_FIELD_BusinessPartner_CreditStatus_Description="Estado del crédito de ventas";

@XendraTrl(Identifier="744ffd5a-baf7-eb95-73e8-6f64e3693cdd")
public static String es_PE_FIELD_BusinessPartner_CreditStatus_Help="Solamente para la documentación.";

@XendraField(AD_Column_ID="SOCreditStatus",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="744ffd5a-baf7-eb95-73e8-6f64e3693cdd")
public static final String FIELDNAME_BusinessPartner_CreditStatus="744ffd5a-baf7-eb95-73e8-6f64e3693cdd";

@XendraTrl(Identifier="3bbb9ba7-6fc3-54c0-d30a-e722292b8b00")
public static String es_PE_FIELD_PartnerSelection_CreditStatus_Name="Estado del Crédito";

@XendraTrl(Identifier="3bbb9ba7-6fc3-54c0-d30a-e722292b8b00")
public static String es_PE_FIELD_PartnerSelection_CreditStatus_Description="Estado del crédito de ventas";

@XendraTrl(Identifier="3bbb9ba7-6fc3-54c0-d30a-e722292b8b00")
public static String es_PE_FIELD_PartnerSelection_CreditStatus_Help="Solamente para la documentación.";

@XendraField(AD_Column_ID="SOCreditStatus",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3bbb9ba7-6fc3-54c0-d30a-e722292b8b00")
public static final String FIELDNAME_PartnerSelection_CreditStatus="3bbb9ba7-6fc3-54c0-d30a-e722292b8b00";

@XendraTrl(Identifier="e5c70601-c538-1061-76d1-56e770ccf8d1")
public static String es_PE_FIELD_AssignedPartners_CreditStatus_Name="Estado del Crédito";

@XendraTrl(Identifier="e5c70601-c538-1061-76d1-56e770ccf8d1")
public static String es_PE_FIELD_AssignedPartners_CreditStatus_Description="Estado del crédito de ventas";

@XendraTrl(Identifier="e5c70601-c538-1061-76d1-56e770ccf8d1")
public static String es_PE_FIELD_AssignedPartners_CreditStatus_Help="Solamente para la documentación.";

@XendraField(AD_Column_ID="SOCreditStatus",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e5c70601-c538-1061-76d1-56e770ccf8d1")
public static final String FIELDNAME_AssignedPartners_CreditStatus="e5c70601-c538-1061-76d1-56e770ccf8d1";

@XendraTrl(Identifier="b292f09d-346d-2cb2-9312-25606c414b8b")
public static String es_PE_FIELD_BusinessPartnerDimension_CreditStatus_Name="Estado del Crédito";

@XendraTrl(Identifier="b292f09d-346d-2cb2-9312-25606c414b8b")
public static String es_PE_FIELD_BusinessPartnerDimension_CreditStatus_Description="Estado del crédito de ventas";

@XendraTrl(Identifier="b292f09d-346d-2cb2-9312-25606c414b8b")
public static String es_PE_FIELD_BusinessPartnerDimension_CreditStatus_Help="Solamente para la documentación.";

@XendraField(AD_Column_ID="SOCreditStatus",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b292f09d-346d-2cb2-9312-25606c414b8b")
public static final String FIELDNAME_BusinessPartnerDimension_CreditStatus="b292f09d-346d-2cb2-9312-25606c414b8b";

@XendraTrl(Identifier="f5455eba-a9da-068a-2ade-b842e288d049")
public static String es_PE_FIELD_EmployeeVendor_CreditStatus_Name="Estado del Crédito";

@XendraTrl(Identifier="f5455eba-a9da-068a-2ade-b842e288d049")
public static String es_PE_FIELD_EmployeeVendor_CreditStatus_Description="Estado del crédito de ventas";

@XendraTrl(Identifier="f5455eba-a9da-068a-2ade-b842e288d049")
public static String es_PE_FIELD_EmployeeVendor_CreditStatus_Help="Solamente para la documentación.";

@XendraField(AD_Column_ID="SOCreditStatus",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f5455eba-a9da-068a-2ade-b842e288d049")
public static final String FIELDNAME_EmployeeVendor_CreditStatus="f5455eba-a9da-068a-2ade-b842e288d049";

@XendraTrl(Identifier="3a89be73-0178-b345-916b-c29008da31c4")
public static String es_PE_FIELD_Employee_CreditStatus_Name="Estado del Crédito";

@XendraTrl(Identifier="3a89be73-0178-b345-916b-c29008da31c4")
public static String es_PE_FIELD_Employee_CreditStatus_Description="Estado del crédito de ventas";

@XendraTrl(Identifier="3a89be73-0178-b345-916b-c29008da31c4")
public static String es_PE_FIELD_Employee_CreditStatus_Help="Solamente para la documentación.";

@XendraField(AD_Column_ID="SOCreditStatus",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3a89be73-0178-b345-916b-c29008da31c4")
public static final String FIELDNAME_Employee_CreditStatus="3a89be73-0178-b345-916b-c29008da31c4";

@XendraTrl(Identifier="01e10b7e-115e-fd19-b93d-1b844da2af9b")
public static String es_PE_FIELD_Customer_CreditStatus2_Name="Estado del Crédito";

@XendraTrl(Identifier="01e10b7e-115e-fd19-b93d-1b844da2af9b")
public static String es_PE_FIELD_Customer_CreditStatus2_Description="Estado del crédito de ventas";

@XendraTrl(Identifier="01e10b7e-115e-fd19-b93d-1b844da2af9b")
public static String es_PE_FIELD_Customer_CreditStatus2_Help="Solamente para la documentación.";

@XendraField(AD_Column_ID="SOCreditStatus",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="01e10b7e-115e-fd19-b93d-1b844da2af9b")
public static final String FIELDNAME_Customer_CreditStatus2="01e10b7e-115e-fd19-b93d-1b844da2af9b";

@XendraTrl(Identifier="1712a912-4d82-aa64-13b4-def95b5109b2")
public static String es_PE_FIELD_Vendor_CreditStatus2_Name="Estado del Crédito";

@XendraTrl(Identifier="1712a912-4d82-aa64-13b4-def95b5109b2")
public static String es_PE_FIELD_Vendor_CreditStatus2_Description="Estado del crédito de ventas";

@XendraTrl(Identifier="1712a912-4d82-aa64-13b4-def95b5109b2")
public static String es_PE_FIELD_Vendor_CreditStatus2_Help="Solamente para la documentación.";

@XendraField(AD_Column_ID="SOCreditStatus",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1712a912-4d82-aa64-13b4-def95b5109b2")
public static final String FIELDNAME_Vendor_CreditStatus2="1712a912-4d82-aa64-13b4-def95b5109b2";

@XendraTrl(Identifier="17e22cca-0fb4-2fb4-c7e8-50369e3faf88")
public static String es_PE_FIELD_BusinessPartner_CreditStatus2_Name="Estado del Crédito";

@XendraTrl(Identifier="17e22cca-0fb4-2fb4-c7e8-50369e3faf88")
public static String es_PE_FIELD_BusinessPartner_CreditStatus2_Description="Estado del crédito de ventas";

@XendraTrl(Identifier="17e22cca-0fb4-2fb4-c7e8-50369e3faf88")
public static String es_PE_FIELD_BusinessPartner_CreditStatus2_Help="Solamente para la documentación.";

@XendraField(AD_Column_ID="SOCreditStatus",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="17e22cca-0fb4-2fb4-c7e8-50369e3faf88")
public static final String FIELDNAME_BusinessPartner_CreditStatus2="17e22cca-0fb4-2fb4-c7e8-50369e3faf88";

@XendraTrl(Identifier="810e0867-6fb6-857c-c05a-1f6453f7e620")
public static String es_PE_COLUMN_SOCreditStatus_Name="Estado del Crédito";

@XendraColumn(AD_Element_ID="2fdf1001-d39a-9b45-560c-23ab69712cf5",ColumnName="SOCreditStatus",
AD_Reference_ID=17,AD_Reference_Value_ID="d6307b6f-ebd6-62fd-2ef2-8694e0e218ed",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="810e0867-6fb6-857c-c05a-1f6453f7e620",Synchronized="2019-08-30 22:21:11.0")
/** Column name SOCreditStatus */
public static final String COLUMNNAME_SOCreditStatus = "SOCreditStatus";
/** Set Credit Used.
@param SO_CreditUsed Current open balance */
public void setSO_CreditUsed (BigDecimal SO_CreditUsed)
{
if (SO_CreditUsed == null) throw new IllegalArgumentException ("SO_CreditUsed is mandatory.");
set_ValueNoCheck (COLUMNNAME_SO_CreditUsed, SO_CreditUsed);
}
/** Get Credit Used.
@return Current open balance */
public BigDecimal getSO_CreditUsed() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_SO_CreditUsed);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="66a905bf-4a92-be17-585c-55d8a1cbc495")
public static String es_PE_FIELD_Customer_CreditUsed_Name="Crédito Usado";

@XendraTrl(Identifier="66a905bf-4a92-be17-585c-55d8a1cbc495")
public static String es_PE_FIELD_Customer_CreditUsed_Description="Balance actual abierto";

@XendraTrl(Identifier="66a905bf-4a92-be17-585c-55d8a1cbc495")
public static String es_PE_FIELD_Customer_CreditUsed_Help="El crédito usado indica la cantidad total de facturas abiertas ó sin pagar del socio";

@XendraField(AD_Column_ID="SO_CreditUsed",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsCustomer@='Y'",DisplayLength=26,IsReadOnly=true,SeqNo=220,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="66a905bf-4a92-be17-585c-55d8a1cbc495")
public static final String FIELDNAME_Customer_CreditUsed="66a905bf-4a92-be17-585c-55d8a1cbc495";

@XendraTrl(Identifier="91ed55d3-b7fa-a414-3a82-2dd2e2d490ef")
public static String es_PE_FIELD_Employee_CreditUsed_Name="Crédito Usado";

@XendraTrl(Identifier="91ed55d3-b7fa-a414-3a82-2dd2e2d490ef")
public static String es_PE_FIELD_Employee_CreditUsed_Description="Balance actual abierto";

@XendraTrl(Identifier="91ed55d3-b7fa-a414-3a82-2dd2e2d490ef")
public static String es_PE_FIELD_Employee_CreditUsed_Help="El crédito usado indica la cantidad total de facturas abiertas ó sin pagar del socio";

@XendraField(AD_Column_ID="SO_CreditUsed",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="91ed55d3-b7fa-a414-3a82-2dd2e2d490ef")
public static final String FIELDNAME_Employee_CreditUsed="91ed55d3-b7fa-a414-3a82-2dd2e2d490ef";

@XendraTrl(Identifier="c40b6e2a-6bf3-0d8b-8879-5afff9999fd4")
public static String es_PE_FIELD_Vendor_CreditUsed_Name="Crédito Usado";

@XendraTrl(Identifier="c40b6e2a-6bf3-0d8b-8879-5afff9999fd4")
public static String es_PE_FIELD_Vendor_CreditUsed_Description="Balance actual abierto";

@XendraTrl(Identifier="c40b6e2a-6bf3-0d8b-8879-5afff9999fd4")
public static String es_PE_FIELD_Vendor_CreditUsed_Help="El crédito usado indica la cantidad total de facturas abiertas ó sin pagar del socio";

@XendraField(AD_Column_ID="SO_CreditUsed",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c40b6e2a-6bf3-0d8b-8879-5afff9999fd4")
public static final String FIELDNAME_Vendor_CreditUsed="c40b6e2a-6bf3-0d8b-8879-5afff9999fd4";

@XendraTrl(Identifier="e2a15ac9-5e14-1594-ecc7-d3a669291831")
public static String es_PE_FIELD_PartnerSelection_CreditUsed_Name="Crédito Usado";

@XendraTrl(Identifier="e2a15ac9-5e14-1594-ecc7-d3a669291831")
public static String es_PE_FIELD_PartnerSelection_CreditUsed_Description="Balance actual abierto";

@XendraTrl(Identifier="e2a15ac9-5e14-1594-ecc7-d3a669291831")
public static String es_PE_FIELD_PartnerSelection_CreditUsed_Help="El crédito usado indica la cantidad total de facturas abiertas ó sin pagar del socio";

@XendraField(AD_Column_ID="SO_CreditUsed",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e2a15ac9-5e14-1594-ecc7-d3a669291831")
public static final String FIELDNAME_PartnerSelection_CreditUsed="e2a15ac9-5e14-1594-ecc7-d3a669291831";

@XendraTrl(Identifier="68459c21-4ef0-ba48-0322-d458b0f2dd6e")
public static String es_PE_FIELD_BusinessPartner_CreditUsed_Name="Crédito Usado";

@XendraTrl(Identifier="68459c21-4ef0-ba48-0322-d458b0f2dd6e")
public static String es_PE_FIELD_BusinessPartner_CreditUsed_Description="Balance actual abierto";

@XendraTrl(Identifier="68459c21-4ef0-ba48-0322-d458b0f2dd6e")
public static String es_PE_FIELD_BusinessPartner_CreditUsed_Help="El crédito usado indica la cantidad total de facturas abiertas ó sin pagar del socio";

@XendraField(AD_Column_ID="SO_CreditUsed",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=180,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="68459c21-4ef0-ba48-0322-d458b0f2dd6e")
public static final String FIELDNAME_BusinessPartner_CreditUsed="68459c21-4ef0-ba48-0322-d458b0f2dd6e";

@XendraTrl(Identifier="a7274c99-4607-4142-0454-fe8d51aba290")
public static String es_PE_FIELD_BusinessPartnerDimension_CreditUsed_Name="Crédito Usado";

@XendraTrl(Identifier="a7274c99-4607-4142-0454-fe8d51aba290")
public static String es_PE_FIELD_BusinessPartnerDimension_CreditUsed_Description="Balance actual abierto";

@XendraTrl(Identifier="a7274c99-4607-4142-0454-fe8d51aba290")
public static String es_PE_FIELD_BusinessPartnerDimension_CreditUsed_Help="El crédito usado indica la cantidad total de facturas abiertas ó sin pagar del socio";

@XendraField(AD_Column_ID="SO_CreditUsed",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a7274c99-4607-4142-0454-fe8d51aba290")
public static final String FIELDNAME_BusinessPartnerDimension_CreditUsed="a7274c99-4607-4142-0454-fe8d51aba290";

@XendraTrl(Identifier="7b1da22b-d1ae-18b3-e061-3b5af70e024c")
public static String es_PE_FIELD_AssignedPartners_CreditUsed_Name="Crédito Usado";

@XendraTrl(Identifier="7b1da22b-d1ae-18b3-e061-3b5af70e024c")
public static String es_PE_FIELD_AssignedPartners_CreditUsed_Description="Balance actual abierto";

@XendraTrl(Identifier="7b1da22b-d1ae-18b3-e061-3b5af70e024c")
public static String es_PE_FIELD_AssignedPartners_CreditUsed_Help="El crédito usado indica la cantidad total de facturas abiertas ó sin pagar del socio";

@XendraField(AD_Column_ID="SO_CreditUsed",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7b1da22b-d1ae-18b3-e061-3b5af70e024c")
public static final String FIELDNAME_AssignedPartners_CreditUsed="7b1da22b-d1ae-18b3-e061-3b5af70e024c";

@XendraTrl(Identifier="6d276c58-102a-c5f6-5a44-edecee79deef")
public static String es_PE_FIELD_EmployeeVendor_CreditUsed_Name="Crédito Usado";

@XendraTrl(Identifier="6d276c58-102a-c5f6-5a44-edecee79deef")
public static String es_PE_FIELD_EmployeeVendor_CreditUsed_Description="Balance actual abierto";

@XendraTrl(Identifier="6d276c58-102a-c5f6-5a44-edecee79deef")
public static String es_PE_FIELD_EmployeeVendor_CreditUsed_Help="El crédito usado indica la cantidad total de facturas abiertas ó sin pagar del socio";

@XendraField(AD_Column_ID="SO_CreditUsed",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6d276c58-102a-c5f6-5a44-edecee79deef")
public static final String FIELDNAME_EmployeeVendor_CreditUsed="6d276c58-102a-c5f6-5a44-edecee79deef";

@XendraTrl(Identifier="55638a5c-17a1-cd70-a2ac-10a8af1963d7")
public static String es_PE_FIELD_Customer_CreditUsed2_Name="Crédito Usado";

@XendraTrl(Identifier="55638a5c-17a1-cd70-a2ac-10a8af1963d7")
public static String es_PE_FIELD_Customer_CreditUsed2_Description="Balance actual abierto";

@XendraTrl(Identifier="55638a5c-17a1-cd70-a2ac-10a8af1963d7")
public static String es_PE_FIELD_Customer_CreditUsed2_Help="El crédito usado indica la cantidad total de facturas abiertas ó sin pagar del socio";

@XendraField(AD_Column_ID="SO_CreditUsed",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="55638a5c-17a1-cd70-a2ac-10a8af1963d7")
public static final String FIELDNAME_Customer_CreditUsed2="55638a5c-17a1-cd70-a2ac-10a8af1963d7";

@XendraTrl(Identifier="2f0133e8-a3a0-ef05-0f96-b37f026eda23")
public static String es_PE_FIELD_Vendor_CreditUsed2_Name="Crédito Usado";

@XendraTrl(Identifier="2f0133e8-a3a0-ef05-0f96-b37f026eda23")
public static String es_PE_FIELD_Vendor_CreditUsed2_Description="Balance actual abierto";

@XendraTrl(Identifier="2f0133e8-a3a0-ef05-0f96-b37f026eda23")
public static String es_PE_FIELD_Vendor_CreditUsed2_Help="El crédito usado indica la cantidad total de facturas abiertas ó sin pagar del socio";

@XendraField(AD_Column_ID="SO_CreditUsed",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2f0133e8-a3a0-ef05-0f96-b37f026eda23")
public static final String FIELDNAME_Vendor_CreditUsed2="2f0133e8-a3a0-ef05-0f96-b37f026eda23";

@XendraTrl(Identifier="beb870ff-831e-e3f3-80a9-921cf1a22567")
public static String es_PE_FIELD_BusinessPartner_CreditUsed2_Name="Crédito Usado";

@XendraTrl(Identifier="beb870ff-831e-e3f3-80a9-921cf1a22567")
public static String es_PE_FIELD_BusinessPartner_CreditUsed2_Description="Balance actual abierto";

@XendraTrl(Identifier="beb870ff-831e-e3f3-80a9-921cf1a22567")
public static String es_PE_FIELD_BusinessPartner_CreditUsed2_Help="El crédito usado indica la cantidad total de facturas abiertas ó sin pagar del socio";

@XendraField(AD_Column_ID="SO_CreditUsed",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="beb870ff-831e-e3f3-80a9-921cf1a22567")
public static final String FIELDNAME_BusinessPartner_CreditUsed2="beb870ff-831e-e3f3-80a9-921cf1a22567";

@XendraTrl(Identifier="5cfd1c79-ff44-8e5c-8e4f-ce800e53e48a")
public static String es_PE_COLUMN_SO_CreditUsed_Name="Crédito Usado";

@XendraColumn(AD_Element_ID="a68f217a-7573-691d-2922-fdbfa1874a42",ColumnName="SO_CreditUsed",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5cfd1c79-ff44-8e5c-8e4f-ce800e53e48a",
Synchronized="2019-08-30 22:21:11.0")
/** Column name SO_CreditUsed */
public static final String COLUMNNAME_SO_CreditUsed = "SO_CreditUsed";
/** Set Order Description.
@param SO_Description Description to be used on orders */
public void setSO_Description (String SO_Description)
{
if (SO_Description != null && SO_Description.length() > 255)
{
log.warning("Length > 255 - truncated");
SO_Description = SO_Description.substring(0,254);
}
set_Value (COLUMNNAME_SO_Description, SO_Description);
}
/** Get Order Description.
@return Description to be used on orders */
public String getSO_Description() 
{
String value = (String)get_Value(COLUMNNAME_SO_Description);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="4121871c-e167-87ea-bb7e-85e4fe5671e3")
public static String es_PE_FIELD_Customer_OrderDescription_Name="Descripción de Orden";

@XendraTrl(Identifier="4121871c-e167-87ea-bb7e-85e4fe5671e3")
public static String es_PE_FIELD_Customer_OrderDescription_Description="Descripción a ser usada en órdenes";

@XendraTrl(Identifier="4121871c-e167-87ea-bb7e-85e4fe5671e3")
public static String es_PE_FIELD_Customer_OrderDescription_Help="La descripción de la orden identifica la descripción estándar a usar en órdenes para este cliente";

@XendraField(AD_Column_ID="SO_Description",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsCustomer@='Y'",DisplayLength=60,IsReadOnly=false,SeqNo=180,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="4121871c-e167-87ea-bb7e-85e4fe5671e3")
public static final String FIELDNAME_Customer_OrderDescription="4121871c-e167-87ea-bb7e-85e4fe5671e3";

@XendraTrl(Identifier="db783b81-3da9-0061-548d-e5d4e5d30dd4")
public static String es_PE_FIELD_EmployeeVendor_OrderDescription_Name="Descripción de Orden";

@XendraTrl(Identifier="db783b81-3da9-0061-548d-e5d4e5d30dd4")
public static String es_PE_FIELD_EmployeeVendor_OrderDescription_Description="Descripción a ser usada en órdenes";

@XendraTrl(Identifier="db783b81-3da9-0061-548d-e5d4e5d30dd4")
public static String es_PE_FIELD_EmployeeVendor_OrderDescription_Help="La descripción de la orden identifica la descripción estándar a usar en órdenes para este cliente";

@XendraField(AD_Column_ID="SO_Description",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="db783b81-3da9-0061-548d-e5d4e5d30dd4")
public static final String FIELDNAME_EmployeeVendor_OrderDescription="db783b81-3da9-0061-548d-e5d4e5d30dd4";

@XendraTrl(Identifier="7fc778ba-13bc-39b0-3b3f-b3c8f382f5a2")
public static String es_PE_FIELD_Vendor_OrderDescription_Name="Descripción de Orden";

@XendraTrl(Identifier="7fc778ba-13bc-39b0-3b3f-b3c8f382f5a2")
public static String es_PE_FIELD_Vendor_OrderDescription_Description="Descripción a ser usada en órdenes";

@XendraTrl(Identifier="7fc778ba-13bc-39b0-3b3f-b3c8f382f5a2")
public static String es_PE_FIELD_Vendor_OrderDescription_Help="La descripción de la orden identifica la descripción estándar a usar en órdenes para este cliente";

@XendraField(AD_Column_ID="SO_Description",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7fc778ba-13bc-39b0-3b3f-b3c8f382f5a2")
public static final String FIELDNAME_Vendor_OrderDescription="7fc778ba-13bc-39b0-3b3f-b3c8f382f5a2";

@XendraTrl(Identifier="5776baec-1faa-bced-5022-dfa736fe3b15")
public static String es_PE_FIELD_PartnerSelection_OrderDescription_Name="Descripción de Orden";

@XendraTrl(Identifier="5776baec-1faa-bced-5022-dfa736fe3b15")
public static String es_PE_FIELD_PartnerSelection_OrderDescription_Description="Descripción a ser usada en órdenes";

@XendraTrl(Identifier="5776baec-1faa-bced-5022-dfa736fe3b15")
public static String es_PE_FIELD_PartnerSelection_OrderDescription_Help="La descripción de la orden identifica la descripción estándar a usar en órdenes para este cliente";

@XendraField(AD_Column_ID="SO_Description",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5776baec-1faa-bced-5022-dfa736fe3b15")
public static final String FIELDNAME_PartnerSelection_OrderDescription="5776baec-1faa-bced-5022-dfa736fe3b15";

@XendraTrl(Identifier="8bdc4520-73a4-4268-b68c-f177fd38de3d")
public static String es_PE_FIELD_BusinessPartner_OrderDescription_Name="Descripción de Orden";

@XendraTrl(Identifier="8bdc4520-73a4-4268-b68c-f177fd38de3d")
public static String es_PE_FIELD_BusinessPartner_OrderDescription_Description="Descripción a ser usada en órdenes";

@XendraTrl(Identifier="8bdc4520-73a4-4268-b68c-f177fd38de3d")
public static String es_PE_FIELD_BusinessPartner_OrderDescription_Help="La descripción de la orden identifica la descripción estándar a usar en órdenes para este cliente";

@XendraField(AD_Column_ID="SO_Description",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8bdc4520-73a4-4268-b68c-f177fd38de3d")
public static final String FIELDNAME_BusinessPartner_OrderDescription="8bdc4520-73a4-4268-b68c-f177fd38de3d";

@XendraTrl(Identifier="23e59904-d1fa-d5ba-587d-fd4b4a669b3b")
public static String es_PE_FIELD_BusinessPartnerDimension_OrderDescription_Name="Descripción de Orden";

@XendraTrl(Identifier="23e59904-d1fa-d5ba-587d-fd4b4a669b3b")
public static String es_PE_FIELD_BusinessPartnerDimension_OrderDescription_Description="Descripción a ser usada en órdenes";

@XendraTrl(Identifier="23e59904-d1fa-d5ba-587d-fd4b4a669b3b")
public static String es_PE_FIELD_BusinessPartnerDimension_OrderDescription_Help="La descripción de la orden identifica la descripción estándar a usar en órdenes para este cliente";

@XendraField(AD_Column_ID="SO_Description",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="23e59904-d1fa-d5ba-587d-fd4b4a669b3b")
public static final String FIELDNAME_BusinessPartnerDimension_OrderDescription="23e59904-d1fa-d5ba-587d-fd4b4a669b3b";

@XendraTrl(Identifier="4bb6976d-30d5-7cc4-9773-b4e31beba8ce")
public static String es_PE_FIELD_Customer_OrderDescription2_Name="Descripción de Orden";

@XendraTrl(Identifier="4bb6976d-30d5-7cc4-9773-b4e31beba8ce")
public static String es_PE_FIELD_Customer_OrderDescription2_Description="Descripción a ser usada en órdenes";

@XendraTrl(Identifier="4bb6976d-30d5-7cc4-9773-b4e31beba8ce")
public static String es_PE_FIELD_Customer_OrderDescription2_Help="La descripción de la orden identifica la descripción estándar a usar en órdenes para este cliente";

@XendraField(AD_Column_ID="SO_Description",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4bb6976d-30d5-7cc4-9773-b4e31beba8ce")
public static final String FIELDNAME_Customer_OrderDescription2="4bb6976d-30d5-7cc4-9773-b4e31beba8ce";

@XendraTrl(Identifier="dace2fc4-b92a-aebc-4d80-d3df99d0befe")
public static String es_PE_FIELD_Employee_OrderDescription_Name="Descripción de Orden";

@XendraTrl(Identifier="dace2fc4-b92a-aebc-4d80-d3df99d0befe")
public static String es_PE_FIELD_Employee_OrderDescription_Description="Descripción a ser usada en órdenes";

@XendraTrl(Identifier="dace2fc4-b92a-aebc-4d80-d3df99d0befe")
public static String es_PE_FIELD_Employee_OrderDescription_Help="La descripción de la orden identifica la descripción estándar a usar en órdenes para este cliente";

@XendraField(AD_Column_ID="SO_Description",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dace2fc4-b92a-aebc-4d80-d3df99d0befe")
public static final String FIELDNAME_Employee_OrderDescription="dace2fc4-b92a-aebc-4d80-d3df99d0befe";

@XendraTrl(Identifier="76c75122-2c3a-ff4f-6ba9-0637ee95336d")
public static String es_PE_FIELD_AssignedPartners_OrderDescription_Name="Descripción de Orden";

@XendraTrl(Identifier="76c75122-2c3a-ff4f-6ba9-0637ee95336d")
public static String es_PE_FIELD_AssignedPartners_OrderDescription_Description="Descripción a ser usada en órdenes";

@XendraTrl(Identifier="76c75122-2c3a-ff4f-6ba9-0637ee95336d")
public static String es_PE_FIELD_AssignedPartners_OrderDescription_Help="La descripción de la orden identifica la descripción estándar a usar en órdenes para este cliente";

@XendraField(AD_Column_ID="SO_Description",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="76c75122-2c3a-ff4f-6ba9-0637ee95336d")
public static final String FIELDNAME_AssignedPartners_OrderDescription="76c75122-2c3a-ff4f-6ba9-0637ee95336d";

@XendraTrl(Identifier="3a545634-a3a5-64d3-659b-208450093971")
public static String es_PE_FIELD_Vendor_OrderDescription2_Name="Descripción de Orden";

@XendraTrl(Identifier="3a545634-a3a5-64d3-659b-208450093971")
public static String es_PE_FIELD_Vendor_OrderDescription2_Description="Descripción a ser usada en órdenes";

@XendraTrl(Identifier="3a545634-a3a5-64d3-659b-208450093971")
public static String es_PE_FIELD_Vendor_OrderDescription2_Help="La descripción de la orden identifica la descripción estándar a usar en órdenes para este cliente";

@XendraField(AD_Column_ID="SO_Description",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3a545634-a3a5-64d3-659b-208450093971")
public static final String FIELDNAME_Vendor_OrderDescription2="3a545634-a3a5-64d3-659b-208450093971";

@XendraTrl(Identifier="f3aefd27-d52d-a522-b6b0-b5fcca1b9f2f")
public static String es_PE_FIELD_BusinessPartner_OrderDescription2_Name="Descripción de Orden";

@XendraTrl(Identifier="f3aefd27-d52d-a522-b6b0-b5fcca1b9f2f")
public static String es_PE_FIELD_BusinessPartner_OrderDescription2_Description="Descripción a ser usada en órdenes";

@XendraTrl(Identifier="f3aefd27-d52d-a522-b6b0-b5fcca1b9f2f")
public static String es_PE_FIELD_BusinessPartner_OrderDescription2_Help="La descripción de la orden identifica la descripción estándar a usar en órdenes para este cliente";

@XendraField(AD_Column_ID="SO_Description",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f3aefd27-d52d-a522-b6b0-b5fcca1b9f2f")
public static final String FIELDNAME_BusinessPartner_OrderDescription2="f3aefd27-d52d-a522-b6b0-b5fcca1b9f2f";

@XendraTrl(Identifier="e0c96889-b696-dc00-1c05-ea95e6b05289")
public static String es_PE_COLUMN_SO_Description_Name="Descripción de Orden";

@XendraColumn(AD_Element_ID="438c6408-57f1-6603-22ac-17fd47ffbe96",ColumnName="SO_Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e0c96889-b696-dc00-1c05-ea95e6b05289",
Synchronized="2019-08-30 22:21:11.0")
/** Column name SO_Description */
public static final String COLUMNNAME_SO_Description = "SO_Description";
/** Set Tax ID.
@param TaxID Tax Identification */
public void setTaxID (String TaxID)
{
if (TaxID != null && TaxID.length() > 20)
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
@XendraTrl(Identifier="bf1aa8cd-0b24-f01d-f06b-79f0cabf8a53")
public static String es_PE_FIELD_AssignedPartners_TaxID_Name="RUC";

@XendraTrl(Identifier="bf1aa8cd-0b24-f01d-f06b-79f0cabf8a53")
public static String es_PE_FIELD_AssignedPartners_TaxID_Description="Código de Identificación";

@XendraTrl(Identifier="bf1aa8cd-0b24-f01d-f06b-79f0cabf8a53")
public static String es_PE_FIELD_AssignedPartners_TaxID_Help="El código de Identificación es el número de identificación gubernamental de esta entidad";

@XendraField(AD_Column_ID="TaxID",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bf1aa8cd-0b24-f01d-f06b-79f0cabf8a53")
public static final String FIELDNAME_AssignedPartners_TaxID="bf1aa8cd-0b24-f01d-f06b-79f0cabf8a53";

@XendraTrl(Identifier="b3fd9dc3-d706-91e5-f68b-93f99f1d8ed2")
public static String es_PE_FIELD_EmployeeVendor_TaxID_Name="RUC";

@XendraTrl(Identifier="b3fd9dc3-d706-91e5-f68b-93f99f1d8ed2")
public static String es_PE_FIELD_EmployeeVendor_TaxID_Description="Código de Identificación";

@XendraTrl(Identifier="b3fd9dc3-d706-91e5-f68b-93f99f1d8ed2")
public static String es_PE_FIELD_EmployeeVendor_TaxID_Help="El código de Identificación es el número de identificación gubernamental de esta entidad";

@XendraField(AD_Column_ID="TaxID",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b3fd9dc3-d706-91e5-f68b-93f99f1d8ed2")
public static final String FIELDNAME_EmployeeVendor_TaxID="b3fd9dc3-d706-91e5-f68b-93f99f1d8ed2";

@XendraTrl(Identifier="2d1f91d6-228f-f292-131e-3de3f34195e6")
public static String es_PE_FIELD_BusinessPartner_TaxID_Name="RUC";

@XendraTrl(Identifier="2d1f91d6-228f-f292-131e-3de3f34195e6")
public static String es_PE_FIELD_BusinessPartner_TaxID_Description="Código de Identificación";

@XendraTrl(Identifier="2d1f91d6-228f-f292-131e-3de3f34195e6")
public static String es_PE_FIELD_BusinessPartner_TaxID_Help="El código de Identificación es el número de identificación gubernamental de esta entidad";

@XendraField(AD_Column_ID="TaxID",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2d1f91d6-228f-f292-131e-3de3f34195e6")
public static final String FIELDNAME_BusinessPartner_TaxID="2d1f91d6-228f-f292-131e-3de3f34195e6";

@XendraTrl(Identifier="223e0d03-9da2-29c0-92d0-16653805002e")
public static String es_PE_FIELD_Customer_TaxID_Name="RUC";

@XendraTrl(Identifier="223e0d03-9da2-29c0-92d0-16653805002e")
public static String es_PE_FIELD_Customer_TaxID_Description="Código de Identificación";

@XendraTrl(Identifier="223e0d03-9da2-29c0-92d0-16653805002e")
public static String es_PE_FIELD_Customer_TaxID_Help="El código de Identificación es el número de identificación gubernamental de esta entidad";

@XendraField(AD_Column_ID="TaxID",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="223e0d03-9da2-29c0-92d0-16653805002e")
public static final String FIELDNAME_Customer_TaxID="223e0d03-9da2-29c0-92d0-16653805002e";

@XendraTrl(Identifier="771398a3-25cf-be19-6ddc-d3a6da97cb44")
public static String es_PE_FIELD_Vendor_TaxID_Name="RUC";

@XendraTrl(Identifier="771398a3-25cf-be19-6ddc-d3a6da97cb44")
public static String es_PE_FIELD_Vendor_TaxID_Description="Código de Identificación";

@XendraTrl(Identifier="771398a3-25cf-be19-6ddc-d3a6da97cb44")
public static String es_PE_FIELD_Vendor_TaxID_Help="El código de Identificación es el número de identificación gubernamental de esta entidad";

@XendraField(AD_Column_ID="TaxID",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="771398a3-25cf-be19-6ddc-d3a6da97cb44")
public static final String FIELDNAME_Vendor_TaxID="771398a3-25cf-be19-6ddc-d3a6da97cb44";

@XendraTrl(Identifier="2e279c25-7584-4de8-474d-de5edef30a54")
public static String es_PE_FIELD_BusinessPartnerDimension_TaxID_Name="RUC";

@XendraTrl(Identifier="2e279c25-7584-4de8-474d-de5edef30a54")
public static String es_PE_FIELD_BusinessPartnerDimension_TaxID_Description="Código de Identificación";

@XendraTrl(Identifier="2e279c25-7584-4de8-474d-de5edef30a54")
public static String es_PE_FIELD_BusinessPartnerDimension_TaxID_Help="El código de Identificación es el número de identificación gubernamental de esta entidad";

@XendraField(AD_Column_ID="TaxID",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2e279c25-7584-4de8-474d-de5edef30a54")
public static final String FIELDNAME_BusinessPartnerDimension_TaxID="2e279c25-7584-4de8-474d-de5edef30a54";

@XendraTrl(Identifier="e2b96187-4fe2-ee3c-2ea2-1f0f2cea4e52")
public static String es_PE_FIELD_Employee_TaxID_Name="RUC";

@XendraTrl(Identifier="e2b96187-4fe2-ee3c-2ea2-1f0f2cea4e52")
public static String es_PE_FIELD_Employee_TaxID_Description="Código de Identificación";

@XendraTrl(Identifier="e2b96187-4fe2-ee3c-2ea2-1f0f2cea4e52")
public static String es_PE_FIELD_Employee_TaxID_Help="El código de Identificación es el número de identificación gubernamental de esta entidad";

@XendraField(AD_Column_ID="TaxID",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e2b96187-4fe2-ee3c-2ea2-1f0f2cea4e52")
public static final String FIELDNAME_Employee_TaxID="e2b96187-4fe2-ee3c-2ea2-1f0f2cea4e52";

@XendraTrl(Identifier="1476a63d-cefb-8491-c274-43558dd25b4f")
public static String es_PE_FIELD_PartnerSelection_TaxID_Name="RUC";

@XendraTrl(Identifier="1476a63d-cefb-8491-c274-43558dd25b4f")
public static String es_PE_FIELD_PartnerSelection_TaxID_Description="Código de Identificación";

@XendraTrl(Identifier="1476a63d-cefb-8491-c274-43558dd25b4f")
public static String es_PE_FIELD_PartnerSelection_TaxID_Help="El código de Identificación es el número de identificación gubernamental de esta entidad";

@XendraField(AD_Column_ID="TaxID",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1476a63d-cefb-8491-c274-43558dd25b4f")
public static final String FIELDNAME_PartnerSelection_TaxID="1476a63d-cefb-8491-c274-43558dd25b4f";

@XendraTrl(Identifier="9aeb2d1f-3b0a-07d9-14ce-788b98bd15ac")
public static String es_PE_FIELD_Customer_TaxID2_Name="RUC";

@XendraTrl(Identifier="9aeb2d1f-3b0a-07d9-14ce-788b98bd15ac")
public static String es_PE_FIELD_Customer_TaxID2_Description="Código de Identificación";

@XendraTrl(Identifier="9aeb2d1f-3b0a-07d9-14ce-788b98bd15ac")
public static String es_PE_FIELD_Customer_TaxID2_Help="El código de Identificación es el número de identificación gubernamental de esta entidad";

@XendraField(AD_Column_ID="TaxID",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9aeb2d1f-3b0a-07d9-14ce-788b98bd15ac")
public static final String FIELDNAME_Customer_TaxID2="9aeb2d1f-3b0a-07d9-14ce-788b98bd15ac";

@XendraTrl(Identifier="bb2ca416-dd9a-0600-1f8d-b59d8938bee0")
public static String es_PE_FIELD_Vendor_TaxID2_Name="RUC";

@XendraTrl(Identifier="bb2ca416-dd9a-0600-1f8d-b59d8938bee0")
public static String es_PE_FIELD_Vendor_TaxID2_Description="Código de Identificación";

@XendraTrl(Identifier="bb2ca416-dd9a-0600-1f8d-b59d8938bee0")
public static String es_PE_FIELD_Vendor_TaxID2_Help="El código de Identificación es el número de identificación gubernamental de esta entidad";

@XendraField(AD_Column_ID="TaxID",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bb2ca416-dd9a-0600-1f8d-b59d8938bee0")
public static final String FIELDNAME_Vendor_TaxID2="bb2ca416-dd9a-0600-1f8d-b59d8938bee0";

@XendraTrl(Identifier="9dbdb4f7-0b9c-2ace-f304-2e6624970d33")
public static String es_PE_FIELD_BusinessPartner_TaxID2_Name="Número Doc";

@XendraTrl(Identifier="9dbdb4f7-0b9c-2ace-f304-2e6624970d33")
public static String es_PE_FIELD_BusinessPartner_TaxID2_Description="Código de Identificación";

@XendraTrl(Identifier="9dbdb4f7-0b9c-2ace-f304-2e6624970d33")
public static String es_PE_FIELD_BusinessPartner_TaxID2_Help="El código de Identificación es el número de identificación gubernamental de esta entidad";

@XendraField(AD_Column_ID="TaxID",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9dbdb4f7-0b9c-2ace-f304-2e6624970d33")
public static final String FIELDNAME_BusinessPartner_TaxID2="9dbdb4f7-0b9c-2ace-f304-2e6624970d33";

@XendraTrl(Identifier="b2513678-e17a-5f54-dde1-2bae29b5e650")
public static String es_PE_COLUMN_TaxID_Name="RFC";

@XendraColumn(AD_Element_ID="e0a9d0f7-835b-4f80-4c13-bff62213e232",ColumnName="TaxID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b2513678-e17a-5f54-dde1-2bae29b5e650",
Synchronized="2019-08-30 22:21:11.0")
/** Column name TaxID */
public static final String COLUMNNAME_TaxID = "TaxID";
/** Set Open Balance.
@param TotalOpenBalance Total Open Balance Amount in primary Accounting Currency */
public void setTotalOpenBalance (BigDecimal TotalOpenBalance)
{
set_Value (COLUMNNAME_TotalOpenBalance, TotalOpenBalance);
}
/** Get Open Balance.
@return Total Open Balance Amount in primary Accounting Currency */
public BigDecimal getTotalOpenBalance() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TotalOpenBalance);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="9c1b1ff1-9443-923a-a668-63f04873fc0a")
public static String es_PE_FIELD_Vendor_OpenBalance_Name="Saldo Actual";

@XendraTrl(Identifier="9c1b1ff1-9443-923a-a668-63f04873fc0a")
public static String es_PE_FIELD_Vendor_OpenBalance_Description="Total de importe en balance abierto, en las cuentas primarias actuales.";

@XendraTrl(Identifier="9c1b1ff1-9443-923a-a668-63f04873fc0a")
public static String es_PE_FIELD_Vendor_OpenBalance_Help="La cantidad abierta total del balance es la cantidad abierta calculada del artículo para la actividad del cliente y del proveedor. Si el equilibrio está debajo de cero, debemos al socio de negocio. El importe se utiliza para la gerencia de crédito. Las facturas y las asignaciones del pago determinan el equilibrio abierto (es decir no las órdenes ó los pagos).The Total Open Balance Amount is the calculated open item amount for Customer and Vendor activity.  If the Balance is below zero, we owe the Business Partner.  The amout is used for Credit Management.Invoices and Payment Allocations determine the Open Balance (i.e. not Orders or Payments).";

@XendraField(AD_Column_ID="TotalOpenBalance",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=50,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9c1b1ff1-9443-923a-a668-63f04873fc0a")
public static final String FIELDNAME_Vendor_OpenBalance="9c1b1ff1-9443-923a-a668-63f04873fc0a";

@XendraTrl(Identifier="1f2de7f2-01c4-a51e-5a15-3326655491b7")
public static String es_PE_FIELD_Employee_OpenBalance_Name="Saldo Actual";

@XendraTrl(Identifier="1f2de7f2-01c4-a51e-5a15-3326655491b7")
public static String es_PE_FIELD_Employee_OpenBalance_Description="Total de importe en balance abierto, en las cuentas primarias actuales.";

@XendraTrl(Identifier="1f2de7f2-01c4-a51e-5a15-3326655491b7")
public static String es_PE_FIELD_Employee_OpenBalance_Help="La cantidad abierta total del balance es la cantidad abierta calculada del artículo para la actividad del cliente y del proveedor. Si el equilibrio está debajo de cero, debemos al socio de negocio. El importe se utiliza para la gerencia de crédito. Las facturas y las asignaciones del pago determinan el equilibrio abierto (es decir no las órdenes ó los pagos).The Total Open Balance Amount is the calculated open item amount for Customer and Vendor activity.  If the Balance is below zero, we owe the Business Partner.  The amout is used for Credit Management.Invoices and Payment Allocations determine the Open Balance (i.e. not Orders or Payments).";

@XendraField(AD_Column_ID="TotalOpenBalance",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1f2de7f2-01c4-a51e-5a15-3326655491b7")
public static final String FIELDNAME_Employee_OpenBalance="1f2de7f2-01c4-a51e-5a15-3326655491b7";

@XendraTrl(Identifier="0e5766b2-e20b-e7f1-a6e9-1aa777f8c9c0")
public static String es_PE_FIELD_Vendor_OpenBalance2_Name="Saldo Actual";

@XendraTrl(Identifier="0e5766b2-e20b-e7f1-a6e9-1aa777f8c9c0")
public static String es_PE_FIELD_Vendor_OpenBalance2_Description="Total de importe en balance abierto, en las cuentas primarias actuales.";

@XendraTrl(Identifier="0e5766b2-e20b-e7f1-a6e9-1aa777f8c9c0")
public static String es_PE_FIELD_Vendor_OpenBalance2_Help="La cantidad abierta total del balance es la cantidad abierta calculada del artículo para la actividad del cliente y del proveedor. Si el equilibrio está debajo de cero, debemos al socio de negocio. El importe se utiliza para la gerencia de crédito. Las facturas y las asignaciones del pago determinan el equilibrio abierto (es decir no las órdenes ó los pagos).The Total Open Balance Amount is the calculated open item amount for Customer and Vendor activity.  If the Balance is below zero, we owe the Business Partner.  The amout is used for Credit Management.Invoices and Payment Allocations determine the Open Balance (i.e. not Orders or Payments).";

@XendraField(AD_Column_ID="TotalOpenBalance",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0e5766b2-e20b-e7f1-a6e9-1aa777f8c9c0")
public static final String FIELDNAME_Vendor_OpenBalance2="0e5766b2-e20b-e7f1-a6e9-1aa777f8c9c0";

@XendraTrl(Identifier="5cae553f-6b73-226e-0d4d-dbe88f15d092")
public static String es_PE_FIELD_AssignedPartners_OpenBalance_Name="Saldo Actual";

@XendraTrl(Identifier="5cae553f-6b73-226e-0d4d-dbe88f15d092")
public static String es_PE_FIELD_AssignedPartners_OpenBalance_Description="Total de importe en balance abierto, en las cuentas primarias actuales.";

@XendraTrl(Identifier="5cae553f-6b73-226e-0d4d-dbe88f15d092")
public static String es_PE_FIELD_AssignedPartners_OpenBalance_Help="La cantidad abierta total del balance es la cantidad abierta calculada del artículo para la actividad del cliente y del proveedor. Si el equilibrio está debajo de cero, debemos al socio de negocio. El importe se utiliza para la gerencia de crédito. Las facturas y las asignaciones del pago determinan el equilibrio abierto (es decir no las órdenes ó los pagos).The Total Open Balance Amount is the calculated open item amount for Customer and Vendor activity.  If the Balance is below zero, we owe the Business Partner.  The amout is used for Credit Management.Invoices and Payment Allocations determine the Open Balance (i.e. not Orders or Payments).";

@XendraField(AD_Column_ID="TotalOpenBalance",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5cae553f-6b73-226e-0d4d-dbe88f15d092")
public static final String FIELDNAME_AssignedPartners_OpenBalance="5cae553f-6b73-226e-0d4d-dbe88f15d092";

@XendraTrl(Identifier="5f612448-5699-a641-940e-f9cb74ac07ce")
public static String es_PE_FIELD_BusinessPartner_OpenBalance_Name="Saldo Actual";

@XendraTrl(Identifier="5f612448-5699-a641-940e-f9cb74ac07ce")
public static String es_PE_FIELD_BusinessPartner_OpenBalance_Description="Total de importe en balance abierto, en las cuentas primarias actuales.";

@XendraTrl(Identifier="5f612448-5699-a641-940e-f9cb74ac07ce")
public static String es_PE_FIELD_BusinessPartner_OpenBalance_Help="La cantidad abierta total del balance es la cantidad abierta calculada del artículo para la actividad del cliente y del proveedor. Si el equilibrio está debajo de cero, debemos al socio de negocio. El importe se utiliza para la gerencia de crédito. Las facturas y las asignaciones del pago determinan el equilibrio abierto (es decir no las órdenes ó los pagos).The Total Open Balance Amount is the calculated open item amount for Customer and Vendor activity.  If the Balance is below zero, we owe the Business Partner.  The amout is used for Credit Management.Invoices and Payment Allocations determine the Open Balance (i.e. not Orders or Payments).";

@XendraField(AD_Column_ID="TotalOpenBalance",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5f612448-5699-a641-940e-f9cb74ac07ce")
public static final String FIELDNAME_BusinessPartner_OpenBalance="5f612448-5699-a641-940e-f9cb74ac07ce";

@XendraTrl(Identifier="f9435ed9-35d2-93dd-bc43-d493439889f8")
public static String es_PE_FIELD_PartnerSelection_OpenBalance_Name="Saldo Actual";

@XendraTrl(Identifier="f9435ed9-35d2-93dd-bc43-d493439889f8")
public static String es_PE_FIELD_PartnerSelection_OpenBalance_Description="Total de importe en balance abierto, en las cuentas primarias actuales.";

@XendraTrl(Identifier="f9435ed9-35d2-93dd-bc43-d493439889f8")
public static String es_PE_FIELD_PartnerSelection_OpenBalance_Help="La cantidad abierta total del balance es la cantidad abierta calculada del artículo para la actividad del cliente y del proveedor. Si el equilibrio está debajo de cero, debemos al socio de negocio. El importe se utiliza para la gerencia de crédito. Las facturas y las asignaciones del pago determinan el equilibrio abierto (es decir no las órdenes ó los pagos).The Total Open Balance Amount is the calculated open item amount for Customer and Vendor activity.  If the Balance is below zero, we owe the Business Partner.  The amout is used for Credit Management.Invoices and Payment Allocations determine the Open Balance (i.e. not Orders or Payments).";

@XendraField(AD_Column_ID="TotalOpenBalance",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f9435ed9-35d2-93dd-bc43-d493439889f8")
public static final String FIELDNAME_PartnerSelection_OpenBalance="f9435ed9-35d2-93dd-bc43-d493439889f8";

@XendraTrl(Identifier="43cf512b-edcc-f0bf-af46-e27a6473b3fd")
public static String es_PE_FIELD_Customer_OpenBalance_Name="Saldo Actual";

@XendraTrl(Identifier="43cf512b-edcc-f0bf-af46-e27a6473b3fd")
public static String es_PE_FIELD_Customer_OpenBalance_Description="Total de importe en balance abierto, en las cuentas primarias actuales.";

@XendraTrl(Identifier="43cf512b-edcc-f0bf-af46-e27a6473b3fd")
public static String es_PE_FIELD_Customer_OpenBalance_Help="La cantidad abierta total del balance es la cantidad abierta calculada del artículo para la actividad del cliente y del proveedor. Si el equilibrio está debajo de cero, debemos al socio de negocio. El importe se utiliza para la gerencia de crédito. Las facturas y las asignaciones del pago determinan el equilibrio abierto (es decir no las órdenes ó los pagos).The Total Open Balance Amount is the calculated open item amount for Customer and Vendor activity.  If the Balance is below zero, we owe the Business Partner.  The amout is used for Credit Management.Invoices and Payment Allocations determine the Open Balance (i.e. not Orders or Payments).";

@XendraField(AD_Column_ID="TotalOpenBalance",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="43cf512b-edcc-f0bf-af46-e27a6473b3fd")
public static final String FIELDNAME_Customer_OpenBalance="43cf512b-edcc-f0bf-af46-e27a6473b3fd";

@XendraTrl(Identifier="4cd9ebea-8fb0-31bc-456d-5323838b7d3f")
public static String es_PE_FIELD_BusinessPartnerDimension_OpenBalance_Name="Saldo Actual";

@XendraTrl(Identifier="4cd9ebea-8fb0-31bc-456d-5323838b7d3f")
public static String es_PE_FIELD_BusinessPartnerDimension_OpenBalance_Description="Total de importe en balance abierto, en las cuentas primarias actuales.";

@XendraTrl(Identifier="4cd9ebea-8fb0-31bc-456d-5323838b7d3f")
public static String es_PE_FIELD_BusinessPartnerDimension_OpenBalance_Help="La cantidad abierta total del balance es la cantidad abierta calculada del artículo para la actividad del cliente y del proveedor. Si el equilibrio está debajo de cero, debemos al socio de negocio. El importe se utiliza para la gerencia de crédito. Las facturas y las asignaciones del pago determinan el equilibrio abierto (es decir no las órdenes ó los pagos).The Total Open Balance Amount is the calculated open item amount for Customer and Vendor activity.  If the Balance is below zero, we owe the Business Partner.  The amout is used for Credit Management.Invoices and Payment Allocations determine the Open Balance (i.e. not Orders or Payments).";

@XendraField(AD_Column_ID="TotalOpenBalance",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4cd9ebea-8fb0-31bc-456d-5323838b7d3f")
public static final String FIELDNAME_BusinessPartnerDimension_OpenBalance="4cd9ebea-8fb0-31bc-456d-5323838b7d3f";

@XendraTrl(Identifier="e27a2255-96fe-2123-a5ea-e9d69c3f14a8")
public static String es_PE_FIELD_EmployeeVendor_OpenBalance_Name="Saldo Actual";

@XendraTrl(Identifier="e27a2255-96fe-2123-a5ea-e9d69c3f14a8")
public static String es_PE_FIELD_EmployeeVendor_OpenBalance_Description="Total de importe en balance abierto, en las cuentas primarias actuales.";

@XendraTrl(Identifier="e27a2255-96fe-2123-a5ea-e9d69c3f14a8")
public static String es_PE_FIELD_EmployeeVendor_OpenBalance_Help="La cantidad abierta total del balance es la cantidad abierta calculada del artículo para la actividad del cliente y del proveedor. Si el equilibrio está debajo de cero, debemos al socio de negocio. El importe se utiliza para la gerencia de crédito. Las facturas y las asignaciones del pago determinan el equilibrio abierto (es decir no las órdenes ó los pagos).The Total Open Balance Amount is the calculated open item amount for Customer and Vendor activity.  If the Balance is below zero, we owe the Business Partner.  The amout is used for Credit Management.Invoices and Payment Allocations determine the Open Balance (i.e. not Orders or Payments).";

@XendraField(AD_Column_ID="TotalOpenBalance",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e27a2255-96fe-2123-a5ea-e9d69c3f14a8")
public static final String FIELDNAME_EmployeeVendor_OpenBalance="e27a2255-96fe-2123-a5ea-e9d69c3f14a8";

@XendraTrl(Identifier="ed254da7-d7f3-c038-e2c0-9d074abfaa17")
public static String es_PE_FIELD_Customer_OpenBalance2_Name="Saldo Actual";

@XendraTrl(Identifier="ed254da7-d7f3-c038-e2c0-9d074abfaa17")
public static String es_PE_FIELD_Customer_OpenBalance2_Description="Total de importe en balance abierto, en las cuentas primarias actuales.";

@XendraTrl(Identifier="ed254da7-d7f3-c038-e2c0-9d074abfaa17")
public static String es_PE_FIELD_Customer_OpenBalance2_Help="La cantidad abierta total del balance es la cantidad abierta calculada del artículo para la actividad del cliente y del proveedor. Si el equilibrio está debajo de cero, debemos al socio de negocio. El importe se utiliza para la gerencia de crédito. Las facturas y las asignaciones del pago determinan el equilibrio abierto (es decir no las órdenes ó los pagos).The Total Open Balance Amount is the calculated open item amount for Customer and Vendor activity.  If the Balance is below zero, we owe the Business Partner.  The amout is used for Credit Management.Invoices and Payment Allocations determine the Open Balance (i.e. not Orders or Payments).";

@XendraField(AD_Column_ID="TotalOpenBalance",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ed254da7-d7f3-c038-e2c0-9d074abfaa17")
public static final String FIELDNAME_Customer_OpenBalance2="ed254da7-d7f3-c038-e2c0-9d074abfaa17";

@XendraTrl(Identifier="a1db7a35-8803-be32-c7ab-4f5864df4bce")
public static String es_PE_FIELD_BusinessPartner_OpenBalance2_Name="Saldo Actual";

@XendraTrl(Identifier="a1db7a35-8803-be32-c7ab-4f5864df4bce")
public static String es_PE_FIELD_BusinessPartner_OpenBalance2_Description="Total de importe en balance abierto, en las cuentas primarias actuales.";

@XendraTrl(Identifier="a1db7a35-8803-be32-c7ab-4f5864df4bce")
public static String es_PE_FIELD_BusinessPartner_OpenBalance2_Help="La cantidad abierta total del balance es la cantidad abierta calculada del artículo para la actividad del cliente y del proveedor. Si el equilibrio está debajo de cero, debemos al socio de negocio. El importe se utiliza para la gerencia de crédito. Las facturas y las asignaciones del pago determinan el equilibrio abierto (es decir no las órdenes ó los pagos).The Total Open Balance Amount is the calculated open item amount for Customer and Vendor activity.  If the Balance is below zero, we owe the Business Partner.  The amout is used for Credit Management.Invoices and Payment Allocations determine the Open Balance (i.e. not Orders or Payments).";

@XendraField(AD_Column_ID="TotalOpenBalance",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a1db7a35-8803-be32-c7ab-4f5864df4bce")
public static final String FIELDNAME_BusinessPartner_OpenBalance2="a1db7a35-8803-be32-c7ab-4f5864df4bce";

@XendraTrl(Identifier="77fa3405-236e-2419-db23-911128a9b99a")
public static String es_PE_COLUMN_TotalOpenBalance_Name="Saldo Actual";

@XendraColumn(AD_Element_ID="f41fb79e-da73-0c40-72e6-dd6ef794f2ae",ColumnName="TotalOpenBalance",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="77fa3405-236e-2419-db23-911128a9b99a",
Synchronized="2019-08-30 22:21:11.0")
/** Column name TotalOpenBalance */
public static final String COLUMNNAME_TotalOpenBalance = "TotalOpenBalance";
/** Set URL.
@param URL Full URL address - e.g. http://www.adempiere.org */
public void setURL (String URL)
{
if (URL != null && URL.length() > 120)
{
log.warning("Length > 120 - truncated");
URL = URL.substring(0,119);
}
set_Value (COLUMNNAME_URL, URL);
}
/** Get URL.
@return Full URL address - e.g. http://www.adempiere.org */
public String getURL() 
{
String value = (String)get_Value(COLUMNNAME_URL);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="bcb14dc5-c613-1e3f-f69a-7b7f8d4e0cfb")
public static String es_PE_FIELD_BusinessPartnerDimension_URL_Name="URL";

@XendraTrl(Identifier="bcb14dc5-c613-1e3f-f69a-7b7f8d4e0cfb")
public static String es_PE_FIELD_BusinessPartnerDimension_URL_Description="URL";

@XendraTrl(Identifier="bcb14dc5-c613-1e3f-f69a-7b7f8d4e0cfb")
public static String es_PE_FIELD_BusinessPartnerDimension_URL_Help="El URL define una dirección en línea para este Socio de Negocio";

@XendraField(AD_Column_ID="URL",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bcb14dc5-c613-1e3f-f69a-7b7f8d4e0cfb")
public static final String FIELDNAME_BusinessPartnerDimension_URL="bcb14dc5-c613-1e3f-f69a-7b7f8d4e0cfb";

@XendraTrl(Identifier="2bde343e-7a8f-50c0-1599-c8c11ba36757")
public static String es_PE_FIELD_Vendor_URL_Name="URL";

@XendraTrl(Identifier="2bde343e-7a8f-50c0-1599-c8c11ba36757")
public static String es_PE_FIELD_Vendor_URL_Description="URL";

@XendraTrl(Identifier="2bde343e-7a8f-50c0-1599-c8c11ba36757")
public static String es_PE_FIELD_Vendor_URL_Help="El URL define una dirección en línea para este Socio de Negocio";

@XendraField(AD_Column_ID="URL",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2bde343e-7a8f-50c0-1599-c8c11ba36757")
public static final String FIELDNAME_Vendor_URL="2bde343e-7a8f-50c0-1599-c8c11ba36757";

@XendraTrl(Identifier="50daae90-ce61-4d80-032b-04aaff852a67")
public static String es_PE_FIELD_AssignedPartners_URL_Name="URL";

@XendraTrl(Identifier="50daae90-ce61-4d80-032b-04aaff852a67")
public static String es_PE_FIELD_AssignedPartners_URL_Description="URL";

@XendraTrl(Identifier="50daae90-ce61-4d80-032b-04aaff852a67")
public static String es_PE_FIELD_AssignedPartners_URL_Help="El URL define una dirección en línea para este Socio de Negocio";

@XendraField(AD_Column_ID="URL",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="50daae90-ce61-4d80-032b-04aaff852a67")
public static final String FIELDNAME_AssignedPartners_URL="50daae90-ce61-4d80-032b-04aaff852a67";

@XendraTrl(Identifier="d50749a6-58bb-cfb8-1bf4-da51f0131d3e")
public static String es_PE_FIELD_Employee_URL_Name="URL";

@XendraTrl(Identifier="d50749a6-58bb-cfb8-1bf4-da51f0131d3e")
public static String es_PE_FIELD_Employee_URL_Description="URL";

@XendraTrl(Identifier="d50749a6-58bb-cfb8-1bf4-da51f0131d3e")
public static String es_PE_FIELD_Employee_URL_Help="El URL define una dirección en línea para este Socio de Negocio";

@XendraField(AD_Column_ID="URL",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d50749a6-58bb-cfb8-1bf4-da51f0131d3e")
public static final String FIELDNAME_Employee_URL="d50749a6-58bb-cfb8-1bf4-da51f0131d3e";

@XendraTrl(Identifier="74f7dba3-0695-7742-b914-47236ea0de5d")
public static String es_PE_FIELD_PartnerSelection_URL_Name="URL";

@XendraTrl(Identifier="74f7dba3-0695-7742-b914-47236ea0de5d")
public static String es_PE_FIELD_PartnerSelection_URL_Description="URL";

@XendraTrl(Identifier="74f7dba3-0695-7742-b914-47236ea0de5d")
public static String es_PE_FIELD_PartnerSelection_URL_Help="El URL define una dirección en línea para este Socio de Negocio";

@XendraField(AD_Column_ID="URL",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="74f7dba3-0695-7742-b914-47236ea0de5d")
public static final String FIELDNAME_PartnerSelection_URL="74f7dba3-0695-7742-b914-47236ea0de5d";

@XendraTrl(Identifier="c9c7b6d9-b4a5-2780-7a12-6ea0b0abd261")
public static String es_PE_FIELD_EmployeeVendor_URL_Name="URL";

@XendraTrl(Identifier="c9c7b6d9-b4a5-2780-7a12-6ea0b0abd261")
public static String es_PE_FIELD_EmployeeVendor_URL_Description="URL";

@XendraTrl(Identifier="c9c7b6d9-b4a5-2780-7a12-6ea0b0abd261")
public static String es_PE_FIELD_EmployeeVendor_URL_Help="El URL define una dirección en línea para este Socio de Negocio";

@XendraField(AD_Column_ID="URL",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c9c7b6d9-b4a5-2780-7a12-6ea0b0abd261")
public static final String FIELDNAME_EmployeeVendor_URL="c9c7b6d9-b4a5-2780-7a12-6ea0b0abd261";

@XendraTrl(Identifier="fa412fc2-0ae3-be6a-5183-be87f639f39e")
public static String es_PE_FIELD_BusinessPartner_URL_Name="URL";

@XendraTrl(Identifier="fa412fc2-0ae3-be6a-5183-be87f639f39e")
public static String es_PE_FIELD_BusinessPartner_URL_Description="URL";

@XendraTrl(Identifier="fa412fc2-0ae3-be6a-5183-be87f639f39e")
public static String es_PE_FIELD_BusinessPartner_URL_Help="El URL define una dirección en línea para este Socio de Negocio";

@XendraField(AD_Column_ID="URL",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fa412fc2-0ae3-be6a-5183-be87f639f39e")
public static final String FIELDNAME_BusinessPartner_URL="fa412fc2-0ae3-be6a-5183-be87f639f39e";

@XendraTrl(Identifier="89f74d6d-df06-e777-0514-f1c1ce1bc3c3")
public static String es_PE_FIELD_Customer_URL_Name="URL";

@XendraTrl(Identifier="89f74d6d-df06-e777-0514-f1c1ce1bc3c3")
public static String es_PE_FIELD_Customer_URL_Description="URL";

@XendraTrl(Identifier="89f74d6d-df06-e777-0514-f1c1ce1bc3c3")
public static String es_PE_FIELD_Customer_URL_Help="El URL define una dirección en línea para este Socio de Negocio";

@XendraField(AD_Column_ID="URL",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="89f74d6d-df06-e777-0514-f1c1ce1bc3c3")
public static final String FIELDNAME_Customer_URL="89f74d6d-df06-e777-0514-f1c1ce1bc3c3";

@XendraTrl(Identifier="1c354f19-85e8-9bda-dca5-9b425a62bf31")
public static String es_PE_FIELD_Customer_URL2_Name="URL";

@XendraTrl(Identifier="1c354f19-85e8-9bda-dca5-9b425a62bf31")
public static String es_PE_FIELD_Customer_URL2_Description="URL";

@XendraTrl(Identifier="1c354f19-85e8-9bda-dca5-9b425a62bf31")
public static String es_PE_FIELD_Customer_URL2_Help="El URL define una dirección en línea para este Socio de Negocio";

@XendraField(AD_Column_ID="URL",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1c354f19-85e8-9bda-dca5-9b425a62bf31")
public static final String FIELDNAME_Customer_URL2="1c354f19-85e8-9bda-dca5-9b425a62bf31";

@XendraTrl(Identifier="4c8c5581-880c-48d6-fec4-6f807d31472d")
public static String es_PE_FIELD_Vendor_URL2_Name="URL";

@XendraTrl(Identifier="4c8c5581-880c-48d6-fec4-6f807d31472d")
public static String es_PE_FIELD_Vendor_URL2_Description="URL";

@XendraTrl(Identifier="4c8c5581-880c-48d6-fec4-6f807d31472d")
public static String es_PE_FIELD_Vendor_URL2_Help="El URL define una dirección en línea para este Socio de Negocio";

@XendraField(AD_Column_ID="URL",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4c8c5581-880c-48d6-fec4-6f807d31472d")
public static final String FIELDNAME_Vendor_URL2="4c8c5581-880c-48d6-fec4-6f807d31472d";

@XendraTrl(Identifier="d2fe54ff-ab75-fddc-89b3-9e140681c41d")
public static String es_PE_FIELD_BusinessPartner_URL2_Name="URL";

@XendraTrl(Identifier="d2fe54ff-ab75-fddc-89b3-9e140681c41d")
public static String es_PE_FIELD_BusinessPartner_URL2_Description="URL";

@XendraTrl(Identifier="d2fe54ff-ab75-fddc-89b3-9e140681c41d")
public static String es_PE_FIELD_BusinessPartner_URL2_Help="El URL define una dirección en línea para este Socio de Negocio";

@XendraField(AD_Column_ID="URL",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d2fe54ff-ab75-fddc-89b3-9e140681c41d")
public static final String FIELDNAME_BusinessPartner_URL2="d2fe54ff-ab75-fddc-89b3-9e140681c41d";

@XendraTrl(Identifier="919e4fb9-dd00-7d0c-9eb0-87c72b185c8f")
public static String es_PE_COLUMN_URL_Name="URL";

@XendraColumn(AD_Element_ID="28e2c006-3aca-a761-94d4-14eac9cc634c",ColumnName="URL",
AD_Reference_ID=40,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="919e4fb9-dd00-7d0c-9eb0-87c72b185c8f",
Synchronized="2019-08-30 22:21:11.0")
/** Column name URL */
public static final String COLUMNNAME_URL = "URL";
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
@XendraTrl(Identifier="c4d12231-f1ef-687f-2fcb-b82bdde14c6c")
public static String es_PE_FIELD_Employee_SearchKey_Name="Clave de Búsqueda";

@XendraTrl(Identifier="c4d12231-f1ef-687f-2fcb-b82bdde14c6c")
public static String es_PE_FIELD_Employee_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="c4d12231-f1ef-687f-2fcb-b82bdde14c6c")
public static String es_PE_FIELD_Employee_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="9c4579e0-1182-9236-587a-92aa1dca2224",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c4d12231-f1ef-687f-2fcb-b82bdde14c6c")
public static final String FIELDNAME_Employee_SearchKey="c4d12231-f1ef-687f-2fcb-b82bdde14c6c";

@XendraTrl(Identifier="c1142fd2-2306-056e-89e1-4812c87d4a31")
public static String es_PE_FIELD_Vendor_SearchKey_Name="Clave de Búsqueda";

@XendraTrl(Identifier="c1142fd2-2306-056e-89e1-4812c87d4a31")
public static String es_PE_FIELD_Vendor_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="c1142fd2-2306-056e-89e1-4812c87d4a31")
public static String es_PE_FIELD_Vendor_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="72263edf-6c12-686e-9e83-8a3dda66b750",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=10,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c1142fd2-2306-056e-89e1-4812c87d4a31")
public static final String FIELDNAME_Vendor_SearchKey="c1142fd2-2306-056e-89e1-4812c87d4a31";

@XendraTrl(Identifier="27eabe76-88a3-54a5-3ebe-750afa5762ff")
public static String es_PE_FIELD_BusinessPartnerDimension_SearchKey_Name="Clave de Búsqueda";

@XendraTrl(Identifier="27eabe76-88a3-54a5-3ebe-750afa5762ff")
public static String es_PE_FIELD_BusinessPartnerDimension_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="27eabe76-88a3-54a5-3ebe-750afa5762ff")
public static String es_PE_FIELD_BusinessPartnerDimension_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="17e5a850-85ab-57e1-9f3d-502c1c7f1831",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="27eabe76-88a3-54a5-3ebe-750afa5762ff")
public static final String FIELDNAME_BusinessPartnerDimension_SearchKey="27eabe76-88a3-54a5-3ebe-750afa5762ff";

@XendraTrl(Identifier="75d4c9fb-d788-81c2-1c70-dce430350a6a")
public static String es_PE_FIELD_PartnerSelection_SearchKey_Name="Clave de Búsqueda";

@XendraTrl(Identifier="75d4c9fb-d788-81c2-1c70-dce430350a6a")
public static String es_PE_FIELD_PartnerSelection_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="75d4c9fb-d788-81c2-1c70-dce430350a6a")
public static String es_PE_FIELD_PartnerSelection_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="2a47484b-9983-5746-36ef-1c52d0a061f8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="75d4c9fb-d788-81c2-1c70-dce430350a6a")
public static final String FIELDNAME_PartnerSelection_SearchKey="75d4c9fb-d788-81c2-1c70-dce430350a6a";

@XendraTrl(Identifier="2d6d14f7-5813-f444-67b6-299351a6b998")
public static String es_PE_FIELD_Customer_SearchKey_Name="Clave de Búsqueda";

@XendraTrl(Identifier="2d6d14f7-5813-f444-67b6-299351a6b998")
public static String es_PE_FIELD_Customer_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="2d6d14f7-5813-f444-67b6-299351a6b998")
public static String es_PE_FIELD_Customer_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="19045bbe-b174-7c8d-f0ba-50c270caa968",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=true,SeqNo=10,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2d6d14f7-5813-f444-67b6-299351a6b998")
public static final String FIELDNAME_Customer_SearchKey="2d6d14f7-5813-f444-67b6-299351a6b998";

@XendraTrl(Identifier="1fa78bf3-5edc-98a1-5a30-a8d82f4eff3d")
public static String es_PE_FIELD_EmployeeVendor_SearchKey_Name="Clave de Búsqueda";

@XendraTrl(Identifier="1fa78bf3-5edc-98a1-5a30-a8d82f4eff3d")
public static String es_PE_FIELD_EmployeeVendor_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="1fa78bf3-5edc-98a1-5a30-a8d82f4eff3d")
public static String es_PE_FIELD_EmployeeVendor_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="2a79ebe5-d568-1475-72be-903be517767a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=true,SeqNo=10,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1fa78bf3-5edc-98a1-5a30-a8d82f4eff3d")
public static final String FIELDNAME_EmployeeVendor_SearchKey="1fa78bf3-5edc-98a1-5a30-a8d82f4eff3d";

@XendraTrl(Identifier="3203c2a2-ef89-629e-9997-e0ed8bf37d4d")
public static String es_PE_FIELD_AssignedPartners_SearchKey_Name="Clave de Búsqueda";

@XendraTrl(Identifier="3203c2a2-ef89-629e-9997-e0ed8bf37d4d")
public static String es_PE_FIELD_AssignedPartners_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="3203c2a2-ef89-629e-9997-e0ed8bf37d4d")
public static String es_PE_FIELD_AssignedPartners_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="2ccb5b44-3357-5781-d488-70b4068133a1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3203c2a2-ef89-629e-9997-e0ed8bf37d4d")
public static final String FIELDNAME_AssignedPartners_SearchKey="3203c2a2-ef89-629e-9997-e0ed8bf37d4d";

@XendraTrl(Identifier="d3a86e9c-7d0d-27b9-3e74-f0ff0637a136")
public static String es_PE_FIELD_BusinessPartner_SearchKey_Name="Clave de Búsqueda";

@XendraTrl(Identifier="d3a86e9c-7d0d-27b9-3e74-f0ff0637a136")
public static String es_PE_FIELD_BusinessPartner_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="d3a86e9c-7d0d-27b9-3e74-f0ff0637a136")
public static String es_PE_FIELD_BusinessPartner_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="416668f1-2542-31b5-d4e6-0956786fe877",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d3a86e9c-7d0d-27b9-3e74-f0ff0637a136")
public static final String FIELDNAME_BusinessPartner_SearchKey="d3a86e9c-7d0d-27b9-3e74-f0ff0637a136";

@XendraTrl(Identifier="86ab53d6-bf15-3c2a-dfdc-1b16dc4ea40d")
public static String es_PE_FIELD_Customer_SearchKey2_Name="Clave de Búsqueda";

@XendraTrl(Identifier="86ab53d6-bf15-3c2a-dfdc-1b16dc4ea40d")
public static String es_PE_FIELD_Customer_SearchKey2_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="86ab53d6-bf15-3c2a-dfdc-1b16dc4ea40d")
public static String es_PE_FIELD_Customer_SearchKey2_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="299b2fbf-3d76-e1a4-17c0-0967b06c1560",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="86ab53d6-bf15-3c2a-dfdc-1b16dc4ea40d")
public static final String FIELDNAME_Customer_SearchKey2="86ab53d6-bf15-3c2a-dfdc-1b16dc4ea40d";

@XendraTrl(Identifier="f6a94b7a-6a98-d614-a32b-9625cd2f38d3")
public static String es_PE_FIELD_Vendor_SearchKey2_Name="Clave de Búsqueda";

@XendraTrl(Identifier="f6a94b7a-6a98-d614-a32b-9625cd2f38d3")
public static String es_PE_FIELD_Vendor_SearchKey2_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="f6a94b7a-6a98-d614-a32b-9625cd2f38d3")
public static String es_PE_FIELD_Vendor_SearchKey2_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="b2bfc776-3761-b9b2-504c-9bf75437aea6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f6a94b7a-6a98-d614-a32b-9625cd2f38d3")
public static final String FIELDNAME_Vendor_SearchKey2="f6a94b7a-6a98-d614-a32b-9625cd2f38d3";

@XendraTrl(Identifier="47bbb987-6e5f-c7f6-dab3-944365159c38")
public static String es_PE_FIELD_BusinessPartner_SearchKey2_Name="Clave de Búsqueda";

@XendraTrl(Identifier="47bbb987-6e5f-c7f6-dab3-944365159c38")
public static String es_PE_FIELD_BusinessPartner_SearchKey2_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="47bbb987-6e5f-c7f6-dab3-944365159c38")
public static String es_PE_FIELD_BusinessPartner_SearchKey2_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="29b440ef-ac57-106d-efb0-6b9d79b47b43",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="47bbb987-6e5f-c7f6-dab3-944365159c38")
public static final String FIELDNAME_BusinessPartner_SearchKey2="47bbb987-6e5f-c7f6-dab3-944365159c38";

@XendraTrl(Identifier="017cd955-e1e9-80ce-4756-9d19c96a25d4")
public static String es_PE_COLUMN_Value_Name="Clave de Búsqueda";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="017cd955-e1e9-80ce-4756-9d19c96a25d4",
Synchronized="2019-08-30 22:21:11.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
}
